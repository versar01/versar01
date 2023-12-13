package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.ServiceCharges;
import com.eppixcomm.eppix.base.resp.ServiceDiscount;
import com.eppixcomm.eppix.base.resp.Services;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.SlcustmDQO;

public class GetServiceDiscountBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(GetServiceDiscountBLO.class);
	private Logger logger = thrower.getLogger();
	public GetServiceDiscountDAC heliosServicesDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private BigDecimal vatPercent = null;
	private int returnRecords = 0;
	private List<SlcustmDQO> customersList = null;

	@Override
	protected Class getDACClass() {
		return GetServiceDiscountDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.heliosServicesDAC = (GetServiceDiscountDAC) dac;
	}

	public ServiceDiscount getCustomerServiceDiscount(Integer subscriberId,
			Integer legalEntityId, String newPackage, String newTariff,
			String serviceList, Integer noRecords) throws EPPIXSeriousException {

		ServiceDiscount response = new ServiceDiscount();
		Services services = new Services();

		TsTariffServiceDMO tsDMO = null;
		VsrServiceDMO vsrDMO = null;
		ChgChargesDMO chgDMO = null;

		BigDecimal totalDiscount = new BigDecimal("0.00");
		BigDecimal totalSubscribtion = new BigDecimal("0.00");
		BigDecimal discount = null;
		logger.debug("\nSubscriber ID: : " + subscriberId.toString() +
				"\nnewPackage: " + newPackage +
				"\nnewTariff: " + newTariff);
		
		logger.debug("\nService list: " + serviceList.toString());
		
		serviceList = serviceList.replace("|", ",");
		String[] sers = serviceList.split(",");

		this.getVatPercentage();

		try {
			this.createTempTable();
		} catch (EPPIXSeriousException e1) {
			logger.error("Failed to create the temp table: " + e1.getMessage());
			this.dropTempTable();
			response.setErrorType("2");
			response.setEppixStatus("0");
			response.setIsamError("Failed to create quality control keys temp table, please retry.");
			response.setErrorCode("2");
			return response;
		}

		try {
			// CALL generate_qual_key (3, p_new_package, l_from, l_to)
			this.generateQualKey(new Integer("3"), newPackage);
		} catch (NumberFormatException e1) {
			logger.error("Failed to generate quality keys: " + e1.getMessage());
			this.dropTempTable();
			response.setErrorType("2");
			response.setEppixStatus("0");
			response.setIsamError("Failed to generate quality keys..");
			response.setErrorCode("2");
			return response;
		}

		for (String servCode : sers) {
			servCode = servCode.trim();

			try {
				// CALL generate_qual_key (6, p_service_code, l_from, l_to)
				this.generateQualKey(new Integer("6"), servCode);
			} catch (NumberFormatException e1) {
				logger.error("Failed to generate quality keys: "
						+ e1.getMessage());
				this.dropTempTable();
				response.setErrorType("2");
				response.setEppixStatus("0");
				response.setIsamError("Failed to generate quality keys..");
				response.setErrorCode("2");
				return response;
			}
		}

		try {
			// CALL generate_qual_key (7, p_new_tariff, l_from, l_to)
			this.generateQualKey(new Integer("7"), newTariff);
		} catch (NumberFormatException e1) {
			logger.error("Failed to generate quality keys: " + e1.getMessage());
			response.setErrorType("2");
			response.setEppixStatus("0");
			response.setIsamError("Failed to generate quality keys..");
			response.setErrorCode("2");
			return response;
		}

		for (String servCode : sers) {

			if (servCode == null || servCode.length() <= 0) {
				continue;
			}

			servCode = servCode.trim();
			logger.debug("\nSERVICE CODE FROM ARRAY: " + servCode);

			discount = null;
			ServiceCharges servCharges = new ServiceCharges();

			try {
				tsDMO = this.heliosServicesDAC.getTsTariffService(newPackage,
						servCode, newTariff);

				if (tsDMO == null) {
					logger.error("Failed to get TS record for package code: "
							+ newPackage + " service code: " + servCode
							+ " tariff code: " + newTariff);
					response.setErrorType("2");
					response.setEppixStatus("0");
					response.setIsamError("Failed to get TS record for package code: "
							+ newPackage
							+ " service code: "
							+ servCode
							+ " tariff code: " + newTariff);
					response.setErrorCode("2");
					return response;
				}

			} catch (EPPIXSeriousException e) {
				logger.error("Failed to get TS record for package code: "
						+ newPackage + " service code: " + servCode
						+ " tariff code: " + newTariff + " " + e.getMessage());

				response.setErrorType("2");
				response.setEppixStatus("0");
				response.setIsamError("Failed to get TS record for package code: "
						+ newPackage
						+ " service code: "
						+ servCode
						+ " tariff code: " + newTariff);
				response.setErrorCode("2");
				return response;
			}

			try {
				vsrDMO = this.getVsrService(servCode);
			} catch (EPPIXSeriousException e) {
				logger.error("Failed to get VSR record for service code: "
						+ servCode + " " + e.getMessage());

				response.setErrorType("2");
				response.setEppixStatus("0");
				response.setIsamError("Failed to get the service details for service code: "
						+ servCode);
				response.setErrorCode("2");
				return response;
			}

			servCharges.setServiceCode(vsrDMO.getVsrServiceCode());
			servCharges.setServiceDesc(vsrDMO.getVsrServiceDesc());
			if (tsDMO.getTsSubCharge1() != null
					&& tsDMO.getTsSubCharge1().length() > 0) {

				chgDMO = this.getChg(tsDMO.getTsSubCharge1(),
						vsrDMO.getVsrProviderId(), null, null, "F");

				servCharges.setSubCharge1(chgDMO.getChgValue()
						.add(chgDMO.getChgValue().multiply(this.vatPercent))
						.setScale(2, RoundingMode.HALF_UP));
				totalSubscribtion = totalSubscribtion.add(servCharges
						.getSubCharge1());
			}

			chgDMO = null;
			//
			if (tsDMO.getTsSubCharge2() != null
					&& tsDMO.getTsSubCharge2().length() > 0) {

				chgDMO = this.getChg(tsDMO.getTsSubCharge2(),
						vsrDMO.getVsrProviderId(), null, null, "F");

				servCharges.setSubCharge2(chgDMO.getChgValue()
						.add(chgDMO.getChgValue().multiply(this.vatPercent))
						.setScale(2, RoundingMode.HALF_UP));
				totalSubscribtion = totalSubscribtion.add(servCharges
						.getSubCharge2());
			}

			chgDMO = null;
			if (tsDMO.getTsSubCharge3() != null
					&& tsDMO.getTsSubCharge3().length() > 0) {

				chgDMO = this.getChg(tsDMO.getTsSubCharge3(),
						vsrDMO.getVsrProviderId(), null, null, "F");

				servCharges.setSubCharge3(chgDMO.getChgValue()
						.add(chgDMO.getChgValue().multiply(this.vatPercent))
						.setScale(2, RoundingMode.HALF_UP));

				if (servCharges.getSubCharge3() == null) {
					servCharges.setSubCharge3(new BigDecimal("0.00"));
				}

				totalSubscribtion = totalSubscribtion.add(servCharges
						.getSubCharge3());
			}

			discount = this.getServiceDiscount(subscriberId, legalEntityId,
					newPackage, newTariff, servCode, "N");

			if (discount == null) {
				discount = new BigDecimal("0.00");
			} else {
				discount = discount.add(discount.multiply(this.vatPercent));
			}

			if (servCharges.getSubCharge1() == null) {
				servCharges.setSubCharge1(new BigDecimal("0.00"));
			}

			if (servCharges.getSubCharge2() == null) {
				servCharges.setSubCharge2(new BigDecimal("0.00"));
			}

			if (servCharges.getSubCharge3() == null) {
				servCharges.setSubCharge3(new BigDecimal("0.00"));
			}

			totalDiscount = totalDiscount.add(discount);
			servCharges.setServiceDiscount(discount.setScale(2,
					RoundingMode.HALF_UP));

			logger.debug("\ntotalSubscribtion: "
					+ totalSubscribtion.setScale(2, RoundingMode.HALF_UP));
			logger.debug("\ntotalDiscount: "
					+ totalDiscount.setScale(2, RoundingMode.HALF_UP));
			logger.debug(servCharges.toString());

			services.addService(servCharges);

		}

		// Do cleanup of the temp table
		try {
			this.dropTempTable();
		} catch (EPPIXSeriousException e) {
			logger.equals(e.getMessage());
		}

		response.setSubscriberId(subscriberId);
		response.setPackageCode(newPackage);
		response.setInternalTariff(newTariff);
		response.setTotalDiscount(totalDiscount.setScale(2,
				RoundingMode.HALF_UP));
		response.setTotalCost(totalSubscribtion.setScale(2,
				RoundingMode.HALF_UP));

		response.setServices(services);

		return response;
	}

	public void getVatPercentage() throws EPPIXSeriousException {

		String vatCode = "";
		StringDMO vatRateDmo = null;

		vatCode = this.getSysdirmKey("OPVATCODE");

		vatRateDmo = this.heliosServicesDAC.getVatPercentageByCode(vatCode);

		if (vatRateDmo != null) {
			this.vatPercent = new BigDecimal(vatRateDmo.getString());
			this.vatPercent = this.vatPercent.divide(new BigDecimal("100")
					.setScale(2, RoundingMode.HALF_UP));
		} else {
			throw new EPPIXSeriousException(
					"Failed to get the VAT Percentage for vat code: " + vatCode);
		}
	}

	public void createTempTable() throws EPPIXSeriousException {

		Statement st = null;

		try {
			st = this.connection.createStatement();

			ResultSet rs = null;
			String sql = "CREATE TEMP TABLE IF NOT EXISTS temp_qualification ( qual_val INTEGER, qual_key VARCHAR(255), qual_from INTEGER, qual_to INTEGER ) ";
			logger.debug(sql);
			
			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to to create temp table: " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to create temp table: " + e.getMessage());
		}
	}

	public void dropTempTable() throws EPPIXSeriousException {

		Statement st = null;

		try {
			st = this.connection.createStatement();

			ResultSet rs = null;
			String sql = "DROP TABLE IF EXISTS temp_qualification";
			logger.debug(sql);
			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to to drop temp table: " + e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to drop temp table: "
					+ e.getMessage());
		}
	}

	public void generateQualKey(Integer qualVal, String qualKey)
			throws EPPIXSeriousException {

		Integer qValue = null;

		qValue = new Integer((int) Math.pow(new Double("2.00"), new Double(
				qualVal)));

		logger.debug("\nQUAL VAL: " + qValue);

		Statement st = null;
		Statement insertST = null;
		ResultSet rs = null;
		String sql = "INSERT INTO temp_qualification(qual_val, qual_key, qual_from, qual_to) values('"
				+ qValue + "', '" + qualKey + "', TODAY, TODAY)";
		Integer returnQualVal = null;
		String returnQualKey = null;

		logger.debug("\n" + sql);

		try {
			if (st == null) {
				st = this.connection.createStatement();
			}

			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to insert quality keys into temp table: "
					+ e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to insert quality keys into temp table: "
							+ e.getMessage());
		}

		sql = "Select * from temp_qualification " + "where qual_val < "
				+ qValue;

		try {

			if (insertST == null) {
				insertST = this.connection.createStatement();
			}

			rs = insertST.executeQuery(sql);

			while (rs.next()) {
				returnQualVal = rs.getInt(1);
				returnQualKey = rs.getString(2);

				if (returnQualVal != null) {
					returnQualVal = returnQualVal.intValue()
							+ new Integer((int) Math.pow(new Double("2.00"),
									new Double(qualVal)));
				}

				returnQualKey = returnQualKey.trim() + qualKey;

				logger.debug("\nreturnQualVal: " + returnQualVal
						+ "\nreturnQualKey: " + returnQualKey);

				sql = "INSERT INTO temp_qualification(qual_val, qual_key, qual_from, qual_to) values('"
						+ returnQualVal
						+ "', '"
						+ returnQualKey
						+ "', TODAY, TODAY)";

				st.execute(sql);

			}

		} catch (SQLException e) {
			logger.error("Failed to insert quality keys into temp table: "
					+ e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to insert quality keys into temp table: "
							+ e.getMessage());
		}

		try {
			st.close();
			insertST.close();
			rs.close();
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

		st = null;
		insertST = null;
		rs = null;

	}

	private VsrServiceDMO getVsrService(String serviceCode)
			throws EPPIXSeriousException {
		VsrServiceDMO vsrDmo = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VsrServiceDMO.vsrServiceCodeFilter,
				serviceCode);

		try {
			vsrDmo = base.vsrService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get VSR record for service code: "
					+ serviceCode + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VSR record for service code: " + serviceCode
							+ " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get VSR record for service code: "
					+ serviceCode + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VSR record for service code: " + serviceCode
							+ " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get VSR record for service code: "
					+ serviceCode + " " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VSR record for service code: " + serviceCode
							+ " " + e.getMessage());
		}

		return vsrDmo;
	}

	public ChgChargesDMO getChg(String chargeCode, String netId,
			Date chargeDate, Date effectiveDate, String chgType) {

		// FUNCTION chg_get(p_charge_code, p_net_id, p_charge_date,

		// -- Validate charge date if passed otherwise set it to TODAY
		if (chargeDate == null) {
			chargeDate = new Date();
		}
		// ## Validate p_effective_date if passed, If not then set it up

		java.sql.Date effDt = null;
		Date eppixEffDate = null;
		QueryFilter filter = new QueryFilter();
		ChgChargesDMO chgDmo = null;

		if (effectiveDate == null) {

			if (chgType != null && chgType.length() > 0) {

				filter = new QueryFilter();
				filter.add(FilterOp.MAX, ChgChargesDMO.chgEffectiveDateFilter);
				filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
						chargeCode);
				filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
				filter.add(FilterOp.LESSTHANOREQUAL,
						ChgChargesDMO.chgEffectiveDateFilter, chargeDate);
				filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter,
						chgType);

				try {
					effDt = (java.sql.Date) base.chgCharges().max(filter);

					logger.debug("1 EFF DATE: "
							+ ((effDt == null) ? "null" : effDt.toString()));

					if (effDt == null) {

						logger.debug("2 EFF DATE = null");

						filter = new QueryFilter();
						filter.add(FilterOp.MAX,
								ChgChargesDMO.chgEffectiveDateFilter);
						filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
								chargeCode);
						filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
						filter.add(FilterOp.LESSTHANOREQUAL,
								ChgChargesDMO.chgEffectiveDateFilter,
								chargeDate);
						filter.add(FilterOp.EQUAL,
								ChgChargesDMO.chgChargefFilter, chgType);

						effDt = (java.sql.Date) base.chgCharges().max(filter);

						logger.debug("2A EFF DATE: "
								+ ((effDt == null) ? "null" : effDt.toString()));
					}

				} catch (EPPIXBusinessException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				} catch (EPPIXUnexpectedException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				} catch (EPPIXFatalException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				}

			} else {
				filter = new QueryFilter();
				filter.add(FilterOp.MAX, ChgChargesDMO.chgEffectiveDateFilter);
				filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
						chargeCode);
				filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
				filter.add(FilterOp.LESSTHANOREQUAL,
						ChgChargesDMO.chgEffectiveDateFilter, chargeDate);

				try {
					effDt = (java.sql.Date) base.chgCharges().max(filter);

					logger.debug("3 EFF DATE: "
							+ ((effDt == null) ? "null" : effDt.toString()));

					if (effDt == null) {

						logger.debug("4 EFF DATE = null");

						filter = new QueryFilter();
						filter.add(FilterOp.MAX,
								ChgChargesDMO.chgEffectiveDateFilter);
						filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
								chargeCode);
						filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
						filter.add(FilterOp.LESSTHANOREQUAL,
								ChgChargesDMO.chgEffectiveDateFilter,
								chargeDate);

						effDt = (java.sql.Date) base.chgCharges().max(filter);
					}

				} catch (EPPIXBusinessException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				} catch (EPPIXUnexpectedException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				} catch (EPPIXFatalException e) {
					logger.error("Exception getting EFFDt: ChargeCode: "
							+ chargeCode + " EXCEPTION: " + e);
				}
			}
			if (effDt == null) {
				effDt = new java.sql.Date(Calendar.getInstance()
						.getTimeInMillis());
				effectiveDate = new Date(Calendar.getInstance().getTime());
			} else {
				Calendar cal = Calendar.getInstance();
				cal.setTime(effDt);
				effectiveDate = new Date(cal.getTime());
			}

		} else {
		}

		// ## If p_chg_type is passed then use it in select
		// ## Look for the effective date of a network specific charge
		// ## There is no network specific charge, use all networks chg
		// ## If the date is not found at all then set to today
		// -- Get the chg_charges record

		logger.debug("Effective Date set to " + effectiveDate.toString());

		if (chgType != null && chgType.length() > 0) {
			// -- First check if there is a chg set for the specific network
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgEffectiveDateFilter,
					effectiveDate);
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter, chgType);

			try {
				chgDmo = base.chgCharges().get(filter);

				if (chgDmo == null) {

					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
							chargeCode);
					filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
					filter.add(FilterOp.EQUAL,
							ChgChargesDMO.chgEffectiveDateFilter, effectiveDate);
					filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter,
							chgType);

					chgDmo = base.chgCharges().get(filter);

				}

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			}
			// -- If there is no specific network chg then get general (null
			// netid)
		} else {
			// -- Get the chg_charges record
			// -- First check if there is a chg set for the specific network
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgEffectiveDateFilter,
					effectiveDate);

			try {
				chgDmo = base.chgCharges().get(filter);

				if (chgDmo == null) {

					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter,
							chargeCode);
					filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
					filter.add(FilterOp.EQUAL,
							ChgChargesDMO.chgEffectiveDateFilter, effectiveDate);

					chgDmo = base.chgCharges().get(filter);

				}

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting EFFDt: ChargeCode: "
						+ chargeCode + " EXCEPTION: " + e);
			}
			// -- If there is no specific network chg then get general (null
			// netid)
		}

		if (chgDmo == null) {
			logger.error("Unable to SELECT chg_charges details");
		}

		return chgDmo;
	}

	public BigDecimal getServiceDiscount(Integer subscriberId,
			Integer legalEntityId, String newPackage, String newTariff,
			String serviceCode, String entryPoint) throws EPPIXSeriousException {
		// FUNCTION d_servicediscount_get (p_subscriber_id, p_legal_entity_id,
		// p_new_package, p_new_tariff, p_service_code, p_entry_point)

		logger.debug("\nInteger subscriberId: " + subscriberId
				+ "\nInteger legalEntityId: " + legalEntityId
				+ "\nString newPackage: " + newPackage + "\nString newTariff: "
				+ newTariff + "\nString serviceCode: " + serviceCode
				+ "\nString entryPoint: " + entryPoint);

		SbdSubDetsDMO sbdDMO = null;
		SksKeySettingDMO sksDMO = null;
		BcyBillingCycleDMO bcyDMO = null;
		boolean useSubscriber = false;
		Date bcyNextRun = null;

		String qualkey = null;
		BigDecimal percDisc1 = null;
		BigDecimal percDisc2 = null;
		BigDecimal percDisc3 = null;
		BigDecimal fixedDisc1 = null;
		BigDecimal fixedDisc2 = null;
		BigDecimal fixedDisc3 = null;
		BigDecimal lePercDisc1 = null;
		BigDecimal lePercDisc2 = null;
		BigDecimal lePercDisc3 = null;
		BigDecimal leFixedDisc1 = null;
		BigDecimal leFixedDisc2 = null;
		BigDecimal leFixedDisc3 = null;
		BigDecimal totalSserviceDisc = new BigDecimal("0.00");
		String serialChar = null;
		String sksValue = null;

		if (entryPoint != null && entryPoint.length() > 0) {
			if (entryPoint.equals("E")) {
				if (subscriberId == null || subscriberId.intValue() == 0) {
					logger.error("The subscriber is invalid for Entry point option 'E': "
							+ subscriberId);
					throw new EPPIXSeriousException("1",
							"The subscriber is invalid for Entry point option 'E': "
									+ subscriberId);
				} else {
					useSubscriber = true;
					// CALL generate_qual_key (2, p_legal_entity_id, l_from,
					// l_to)
				}
			}
			// else{
			// logger.error("The Entry point option can only be 'E': " +
			// entryPoint);
			// throw new EPPIXSeriousException("1",
			// "The Entry point option can only be 'E': " + entryPoint);
			// }
		}

		sksDMO = this.getSks("LEDISCUSE");

		if (sksDMO == null) {
			sksValue = "Y";
		} else {
			sksValue = sksDMO.getSksValue();
		}

		if (useSubscriber) {
			if (subscriberId != null && subscriberId.intValue() > 0) {
				sbdDMO = this.getSbd(subscriberId);

				if (sbdDMO == null) {
					logger.error("Failed to get the subscriber billing cycle for subscriberId: "
							+ subscriberId);
					throw new EPPIXSeriousException("1",
							"Failed to get the subscriber billing cycle for subscriberId: "
									+ subscriberId);
				} else {
					bcyDMO = this.getBcy(sbdDMO.getSbdBillCycle());

					if (bcyDMO == null) {
						bcyNextRun = new Date();
					} else {
						bcyNextRun = bcyDMO.getBcyNextRun();
					}
				}
			}
		} else {
			bcyNextRun = new Date();
		}

//		try {
//		} catch (NumberFormatException e1) {
//			logger.error("Failed to generate quality keys: " + e1.getMessage());
//			throw new EPPIXSeriousException("2",
//					"Failed to generate quality keys: " + e1.getMessage());
//		}

		if (useSubscriber) {
			percDisc1 = this.heliosServicesDAC.percDiscount1E(bcyNextRun,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			percDisc1 = this.heliosServicesDAC.percDiscount1(bcyNextRun,
					newPackage, newTariff, serviceCode);
		}

		if (useSubscriber) {
			percDisc2 = this.heliosServicesDAC.percDiscount2E(bcyNextRun,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			percDisc2 = this.heliosServicesDAC.percDiscount2(bcyNextRun,
					newPackage, newTariff, serviceCode);
		}

		if (useSubscriber) {
			percDisc3 = this.heliosServicesDAC.percDiscount3E(bcyNextRun,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			percDisc3 = this.heliosServicesDAC.percDiscount3(bcyNextRun,
					newPackage, newTariff, serviceCode);
		}

		logger.debug("\npercDisc1: " + percDisc1 + "\npercDisc2: " + percDisc2
				+ "\npercDisc3: " + percDisc3);
		totalSserviceDisc = percDisc1.add(percDisc2.add(percDisc3));

		DateTime endDate = new DateTime(bcyNextRun);
		// endDate = endDate.formatDDMMYYYYHHMMSS(endDate);
		logger.debug("\nEND DATE: " + endDate);

		if (useSubscriber) {
			fixedDisc1 = this.heliosServicesDAC.fixedDiscount1E(endDate,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			fixedDisc1 = this.heliosServicesDAC.fixedDiscount1(endDate,
					newPackage, newTariff, serviceCode);
		}

		if (useSubscriber) {
			fixedDisc2 = this.heliosServicesDAC.fixedDiscount2E(endDate,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			fixedDisc2 = this.heliosServicesDAC.fixedDiscount2(endDate,
					newPackage, newTariff, serviceCode);
		}

		if (useSubscriber) {
			fixedDisc3 = this.heliosServicesDAC.fixedDiscount3E(endDate,
					newPackage, subscriberId, newTariff, serviceCode);
		} else {
			fixedDisc3 = this.heliosServicesDAC.fixedDiscount3(endDate,
					newPackage, newTariff, serviceCode);
		}

		logger.debug("\nfixedDisc1: " + fixedDisc1 + "\nfixedDisc2: "
				+ fixedDisc2 + "\nfixedDisc3: " + fixedDisc3);

		totalSserviceDisc = totalSserviceDisc.add(fixedDisc1.add(fixedDisc2)
				.add(fixedDisc3));

		if (sksValue.equals("Y")) {
			if (legalEntityId != null && legalEntityId.intValue() != 0) {
				serialChar = legalEntityId.toString();
				qualkey = serialChar.trim() + newTariff;

				if (useSubscriber) {
					lePercDisc1 = this.heliosServicesDAC.percDiscount1E(
							bcyNextRun, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					lePercDisc1 = this.heliosServicesDAC.percDiscount1(
							bcyNextRun, newPackage, newTariff, serviceCode);
				}

				if (useSubscriber) {
					lePercDisc2 = this.heliosServicesDAC.percDiscount2E(
							bcyNextRun, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					lePercDisc2 = this.heliosServicesDAC.percDiscount2(
							bcyNextRun, newPackage, newTariff, serviceCode);
				}

				if (useSubscriber) {
					lePercDisc3 = this.heliosServicesDAC.percDiscount3E(
							bcyNextRun, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					lePercDisc3 = this.heliosServicesDAC.percDiscount3(
							bcyNextRun, newPackage, newTariff, serviceCode);
				}

				logger.debug("\nlePercDisc1: " + lePercDisc1
						+ "\nlePercDisc2: " + lePercDisc2 + "\nlePercDisc3: "
						+ lePercDisc3);

				totalSserviceDisc = totalSserviceDisc.add(lePercDisc1.add(
						lePercDisc2).add(lePercDisc3));

				if (useSubscriber) {
					leFixedDisc1 = this.heliosServicesDAC.fixedDiscount1E(
							endDate, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					leFixedDisc1 = this.heliosServicesDAC.fixedDiscount1(
							endDate, newPackage, newTariff, serviceCode);
				}

				if (useSubscriber) {
					leFixedDisc2 = this.heliosServicesDAC.fixedDiscount2E(
							endDate, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					leFixedDisc2 = this.heliosServicesDAC.fixedDiscount2(
							endDate, newPackage, newTariff, serviceCode);
				}

				if (useSubscriber) {
					leFixedDisc3 = this.heliosServicesDAC.fixedDiscount3E(
							endDate, newPackage, subscriberId, newTariff,
							serviceCode);
				} else {
					leFixedDisc3 = this.heliosServicesDAC.fixedDiscount3(
							endDate, newPackage, newTariff, serviceCode);
				}

				logger.debug("\nleFixedDisc1: " + leFixedDisc1
						+ "\nleFixedDisc2: " + leFixedDisc2
						+ "\nleFixedDisc3: " + leFixedDisc3);

				totalSserviceDisc = totalSserviceDisc.add(leFixedDisc1.add(
						leFixedDisc2).add(leFixedDisc3));
			}
		}

		return totalSserviceDisc;
	}

	public String getSysdirmKey(String sysDirmKey) throws EPPIXSeriousException {

		String sysKeyValue = null;
		thrower.ifParameterMissing("sysDirmKey", sysDirmKey);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SysdirmDMO.systemKeyFilter, sysDirmKey);
		SysdirmDMO sysDMO = null;

		try {
			sysDMO = base.sysdirm().get(filter);

			if (sysDMO == null) {
				logger.error("Failed getting SYSDIRM for key: " + sysDirmKey);
				throw new EPPIXSeriousException(
						"Failed getting SYSDIRM for key: " + sysDirmKey);

			} else {
				sysKeyValue = sysDMO.getKeyValue();
			}
		} catch (EPPIXBusinessException e) {

			logger.error("Exception getting Failed getting SYSDIRM for key: "
					+ sysDirmKey + ": Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception getting Failed getting SYSDIRM for key: "
							+ sysDirmKey + ": Exception: " + e);
		} catch (EPPIXUnexpectedException e) {

			logger.error("Exception getting Failed getting SYSDIRM for key: "
					+ sysDirmKey + ": Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception getting Failed getting SYSDIRM for key: "
							+ sysDirmKey + ": Exception: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception getting Failed getting SYSDIRM for key: "
					+ sysDirmKey + ": Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception getting Failed getting SYSDIRM for key: "
							+ sysDirmKey + ": Exception: " + e);
		}
		return sysKeyValue;
	}

	private SksKeySettingDMO getSks(String keyCode) {

		QueryFilter sksFilter = new QueryFilter();
		sksFilter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter,
				keyCode);
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(sksFilter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting SKS for KEY CODE" + keyCode + " "
					+ e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting SKS for KEY CODE" + keyCode + " "
					+ e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting SKS for KEY CODE" + keyCode + " "
					+ e);
		}
		return sksDmo;
	}

	private SbdSubDetsDMO getSbd(Integer subscriberId) {

		SbdSubDetsDMO sbdDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriberId);

		try {
			sbdDmo = base.sbdSubDets().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SBD for subscriber: " + subscriberId
					+ " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SBD for subscriber: " + subscriberId
					+ " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SBD for subscriber: " + subscriberId
					+ " " + e.getMessage());
		}
		return sbdDmo;
	}

	private BcyBillingCycleDMO getBcy(String bcyCycle) {
		BcyBillingCycleDMO bcyDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BcyBillingCycleDMO.bcyBillCycleFilter,
				bcyCycle);

		try {
			bcyDmo = base.bcyBillingCycle().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get BCY for billing cycle: " + bcyCycle
					+ " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get BCY for billing cycle: " + bcyCycle
					+ " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get BCY for billing cycle: " + bcyCycle
					+ " " + e.getMessage());
		}
		return bcyDmo;
	}

	public BaseBLOBinder getBase() {
		return base;
	}

	public void setBase(BaseBLOBinder base) {
		this.base = base;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public int getReturnRecords() {
		return returnRecords;
	}

	public void setReturnRecords(int returnRecords) {
		this.returnRecords = returnRecords;
	}

}
