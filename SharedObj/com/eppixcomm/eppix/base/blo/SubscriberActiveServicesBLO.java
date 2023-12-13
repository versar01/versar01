package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.EppixResponse;
import com.eppixcomm.eppix.base.resp.ServiceDiscount;
import com.eppixcomm.eppix.base.resp.ServicesOffered;
import com.eppixcomm.eppix.base.utils.ServiceCreateReturnRecord;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.ValidateDate;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsdParamServDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SpcSpvPshPsdDQO;

public class SubscriberActiveServicesBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(SubscriberActiveServicesBLO.class);
	private Logger logger = thrower.getLogger();
	public SubscriberActiveServicesDAC subscriberActiveServicesDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private SbdSubDetsDMO sbdDMO = null;
	private VamActiveMsisdnDMO vamDMO = null;
	private VstServiceTypesDMO vstDMO = null;
	private VsrServiceDMO vsrDMO = null;
	private TsTariffServiceDMO tsDMO;
	private SpvParamValuesDMO spvDMO = null;
	private SpcParamConfigDMO spcDMO = null;
	private PshParamServHdrDMO pshDMO = null;
	private PsdParamServDetDMO psdDMO = null;
	private ChgChargesDMO chgDMO = null;
	private OpservmDMO opservmDMO = null;
	private SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
	private SimpleDateFormat dtFormatYYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	private String userName;
	private String hostName;
	private GetServiceDiscount service1 = null;
	private SimAPNServices service2 = null;
	private GetSULMaxUsageAllowed serviceMaxSul = null;
	private SubscriberUpgradeMigrade subscriberUpgServices;
	private Statement s = null;
	private ResultSet rs = null;
	private BigDecimal subDiscount = null;
	boolean actAllow = true;
	private boolean isSubChargeTUTD = false;
	private boolean isRandSubCharge = false;

	@Override
	protected Class<SubscriberActiveServicesDAC> getDACClass() {
		return SubscriberActiveServicesDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.subscriberActiveServicesDAC = (SubscriberActiveServicesDAC) dac;
	}

	public SubscriberActiveServicesBLO() {
		super();
	}

	public void initiateServices() throws EPPIXSeriousException {

		try {
			service1 = base.getServiceDiscount();
			service1.setBase(this.base);
			service1.setConnection(this.getConnection());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			try {
				thrower.business(SUB_000301, e.getMessage());
			} catch (EPPIXBusinessException e1) {
				throw new EPPIXSeriousException(e1.getMessageCode(),
						e1.getMessage());
			}
		}

		try {
			service2 = base.getSimAPNServices();
			service2.setBase(this.base);
			service2.setConnection(this.getConnection());

		} catch (EPPIXFatalException e2) {
			try {
				thrower.business(SUB_000301, e2.getMessage());
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getMessageCode(),
						e.getMessage());
			}
		}

		try {
			serviceMaxSul = base.getGetSULMaxUsageAllowed();
			serviceMaxSul.setBase(base);
			serviceMaxSul.setConnection(connection);
			serviceMaxSul.initiatedServices();
		} catch (EPPIXFatalException e2) {
			logger.error(e2.getMessage());

			try {
				thrower.business(this.BASE_000301, e2);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		try {
			subscriberUpgServices = base.subscriberUpgradeMigrade();
			subscriberUpgServices.setBase(base);
			subscriberUpgServices.setConnection(connection);
		} catch (EPPIXFatalException e2) {
			logger.error(e2.getMessage());

			try {
				thrower.business(this.BASE_000301, e2);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

	}

	/**
	 * #########################################################################
	 * ####### # Copyright 2013 Eppixcomm # # # # Module Name : Created: Oct 25
	 * 2013 # # # # Description: # # # # Revision History: # # # # == DATE ==
	 * ========================== DETAILS ========================= =BY= # # Oct
	 * 25 2013 Created GLD # # 30/10/2015 build 139 where ts_internal_tariff IS
	 * NULL should have condition # ts_internal_tariff = "" or
	 * ts_internal_tariff = " " # as well MDM
	 * ###################################
	 * #############################################
	 * 
	 * @param subscriberId
	 * @param mssisdn
	 */
	public List<VasVsrVamTsVstVsmDQO> getSubscriberActiveServicesList(
			Integer subscriberId, String msisdn, String partnerId)
			throws EPPIXSeriousException {
		//
		// FUNCTION SubscriberActiveService_List(p_Subscriber,p_size)

		logger.info("\nInteger subscriberId: " + subscriberId
				+ " String msisdn: " + msisdn);
		//
		String billDate = null;
		subDiscount = new BigDecimal("0.00");
		List<VasVsrVamTsVstVsmDQO> serviceList = null;
		EhEppixHierarchyDMO ehDmo = null;

		// # Validate mandatory parameter..
		if (subscriberId == null || subscriberId.intValue() <= 0) {
			if (msisdn == null || msisdn.length() <= 0) {
				logger.error("Either the subscriber id or msisdn must be provided");

				try {
					thrower.business(this.SUB_000001);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getMessageCode(),
							e.getMessage());
				}
			}
		}

		// -- get subscriber record
		// CALL sbd_get(p_Subscriber) RETURNING l_sbd.*
		try {
			this.sbdDMO = this.getSbd(subscriberId, msisdn);
			
			if(this.sbdDMO == null) {
				try {
					thrower.business(this.SUB_000002, new Object[] {subscriberId, msisdn});
				} catch (EPPIXBusinessException e1) {
					throw new EPPIXSeriousException(e1.getMessageCode(),
							e1.getMessage());
				}
			}
			
		} catch (EPPIXSeriousException e) {
			logger.error("Invalid subscriber details");
			try {
				thrower.business(this.SUB_000002, new Object[] {subscriberId, msisdn});
			} catch (EPPIXBusinessException e1) {
				throw new EPPIXSeriousException(e1.getMessageCode(),
						e1.getMessage());
			}
		}

		if (partnerId != null && partnerId.length() > 0) {
			try {
				ehDmo = service2.getScEhHH(partnerId, sbdDMO.getSbdBillAcNo());

				if (ehDmo == null) {
					logger.error("Partner id: " + partnerId
							+ " is in valid for account: "
							+ sbdDMO.getSbdBillAcNo());
					try {
						thrower.business(ApplicationMessages.SUB_000004,
								partnerId);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getMessageCode(),
								e.getMessage());
					}
				}

			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				try {
					thrower.business(ApplicationMessages.SUB_000004, partnerId);
				} catch (EPPIXBusinessException e1) {
					throw new EPPIXSeriousException(e1.getMessageCode(),
							e1.getMessage());
				}
			}
		}

		// -- get last invoice date
		// CALL Invoice_LastBillDate (l_sbd.sbd_bill_ac_no) RETURNING
		// l_bill_date
		try {
			billDate = this.getLastInvoiceDate(this.sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		String billTable = null;
		if (billDate != null) {
			billTable = "bill_" + this.sbdDMO.getSbdBillCycle() + billDate;

			logger.info("\nBILL TABLE: " + billTable);
		}

		// --get discount
		// CALL d_subsciber_discount_get (l_bill_table, p_subscriber) RETURNING
		// l_discount
		if (billTable != null) {
			try {
				subDiscount = getSubscriberDiscountTotal(
						this.sbdDMO.getSbdSubscriberId(), billTable);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
		}

		logger.info("\nSUBSCRIBER DISCOUNT: " + subDiscount);

		try {
			serviceList = this.getSubServiceList(this.sbdDMO
					.getSbdSubscriberId());
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());

			try {
				if (e.getMessage().contains("NO ROWS FOUND")) {
					thrower.business(this.SUB_000003,
							this.sbdDMO.getSbdSubscriberId());
				} else {
					thrower.business(this.SUB_000201, e.getMessage());

				}
			} catch (EPPIXBusinessException e1) {
				throw new EPPIXSeriousException(e1.getMessageCode(),
						e1.getMessage());
			}
		}

		for (VasVsrVamTsVstVsmDQO dmo : serviceList) {
			logger.debug(dmo.toString());
		}

		return serviceList;
	}

	private SbdSubDetsDMO getSbd(Integer subscriber, String msisdn)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		SbdSubDetsDMO sbdDmo = null;

		if (subscriber != null && subscriber.intValue() > 0) {
			filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
					subscriber);
		}

		if (msisdn != null && msisdn.length() > 0) {
			filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdDiallingNoFilter,
					msisdn);
		}

		try {
			sbdDmo = base.sbdSubDets().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		}

		return sbdDmo;

	}

	private VamActiveMsisdnDMO getVam(Integer subscriber, String msisdn,
			String simNo) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		VamActiveMsisdnDMO vamDmo = null;
		DAOIterator vamIT = null;

		if (subscriber != null && subscriber.intValue() > 0) {
			filter.add(FilterOp.EQUAL,
					VamActiveMsisdnDMO.vamSubscriberIdFilter, subscriber);
		}

		if (msisdn != null && msisdn.length() > 0) {
			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter,
					msisdn);
		}

		if (simNo != null && simNo.length() > 0) {
			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamSimNoFilter, simNo);
		}

		try {
			vamIT = base.vamActiveMsisdn().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		}

		if (vamIT != null) {
			while (vamIT.hasNext()) {
				vamDmo = (VamActiveMsisdnDMO) vamIT.next();
			}
		}

		return vamDmo;

	}

	private String getLastInvoiceDate(String accountNo)
			throws EPPIXSeriousException {
		StringDMO maxDt = null;
		Date maxDate = null;

		try {
			maxDt = this.subscriberActiveServicesDAC
					.getLastInvoiceDate(accountNo);
		} catch (EPPIXSeriousException e) {
			logger.error("The invoice date for account: " + accountNo
					+ " was not found: " + e.getMessage());
			throw new EPPIXSeriousException("The invoice date for account: "
					+ accountNo + " was not found");
		}

		if (maxDt == null) {
			logger.error("The invoice date for account: " + accountNo
					+ " was not found");
			throw new EPPIXSeriousException("The invoice date for account: "
					+ accountNo + " was not found");
		} else {

			logger.debug("\n" + maxDt.getString());
			int year = 0;
			int month = 0;
			int day = 0;
			try {

				year = new Integer(maxDt.getString().substring(0, 4))
						.intValue();
				month = new Integer(maxDt.getString().substring(5, 7))
						.intValue();
				day = new Integer(maxDt.getString().substring(8, 10))
						.intValue();
				day = day - 1;
			} catch (NumberFormatException e) {
				logger.error("The invoice date for account: " + accountNo
						+ " was not found");
				throw new EPPIXSeriousException(
						"The invoice date for account: " + accountNo
								+ " was not found");
			}

			logger.debug("\n" + "DAY: " + day + " MONTH: " + month + " YEAR: "
					+ year);
			maxDate = new Date(day, month, year);

		}
		return dtFormatYYYYMMDD.format(maxDate);
	}

	private List getSubServiceList(Integer subscriberId)
			throws EPPIXSeriousException {

		String sql = "SELECT vas_subscriber_id, vas_service_code,"
				+ " vas_service_type,"
				+ " vas_act_date, vas_sub_charge1,"
				+ " vas_sub_charge2, vas_sub_charge3,"
				+ " vas_multi_charge, vsr_service_desc, vsr.vsr_provider_id,"
				+ " vsr2_service_order, vsr2_sim_related,"
				+ " vsr2_entry_type, vam_sim_no, vam_msisdn_known,"
				+ " ts_act_inclusive, vam_msisdn_no,ts_pdeact_charge,"
				+ " vst_parameterised , vsm_msisdn_no"
				+ " FROM vas_active_service, vsr_service vsr, vam_active_msisdn, vst_service_types,"
				+ " vsr2_service_aux, OUTER ts_tariff_service, sbd_sub_dets, vsm_service_msisdn"
				+ " WHERE vas_subscriber_id = "
				+ subscriberId
				+ " AND vsr_service_code = vas_service_code"
				+ " AND vsr2_service_code = vas_service_code"
				+ " AND vam_subscriber_id = vas_subscriber_id "
				+ " AND vsm_subscriber_id = vas_subscriber_id"
				+ " AND vsm_service_code = vas_service_code"
				+ " AND sbd_subscriber_id = vas_subscriber_id "
				+ " AND ts_package_code = sbd_package_code "
				+ " AND (ts_internal_tariff = sbd_tariff_plan OR ts_internal_tariff IS NULL or ts_internal_tariff = ' ' or ts_internal_tariff = '')"
				+ " AND ts_service_code = vas_service_code "
				+ " AND vsm_msisdn_no = vam_msisdn_no "
				+ " AND vst_service_type = vsr_service_type "
				+ " AND vam_stat_code IN ('1','4')"
				+ " ORDER BY vsr2_service_order;";

		logger.debug(sql);

		s = null;
		rs = null;
		BigDecimal subCharge = null;
		BigDecimal totalSubCharge = new BigDecimal("0.00");
		BigDecimal deactCharge = new BigDecimal("0.00");
		;
		ChgChargesDMO chgDMO = null;
		List<VasVsrVamTsVstVsmDQO> list = null;

		try {
			s = this.getConnection().createStatement();
			rs = s.executeQuery(sql);

			if (rs == null) {
				logger.error("NO ROWS FOUND for subscriber: " + subscriberId);
				throw new EPPIXSeriousException(
						"NO ROWS FOUND for subscriber: " + subscriberId);
			}

			while (rs.next()) {

				totalSubCharge = new BigDecimal("0.00");

				VasVsrVamTsVstVsmDQO dmo = new VasVsrVamTsVstVsmDQO();
				dmo.setVasSubscriberId(rs.getInt(1));
				dmo.setVasServiceCode(rs.getString(2).trim());
				dmo.setVasServiceType(rs.getString(3).trim());
				dmo.setVasActDate(rs.getString(4).trim());
				dmo.setVasSubCharge1((rs.getString(5) == null) ? "" : rs
						.getString(5).trim());
				dmo.setVasSubCharge2((rs.getString(6) == null) ? "" : rs
						.getString(6).trim());
				dmo.setVasSubCharge3((rs.getString(7) == null) ? "" : rs
						.getString(7).trim());
				dmo.setVasMultiCharge(rs.getString(8).trim());
				dmo.setVsrServiceDesc(rs.getString(9).trim());
				dmo.setVsrProviderId(rs.getString(10).trim());
				dmo.setVsr2ServiceOrder(rs.getString(11).trim());
				dmo.setVsr2SimRelated(rs.getString(12).trim());
				dmo.setVsr2EntryType(rs.getString(13).trim());
				dmo.setVamSimNo(rs.getString(14).trim());
				dmo.setVamMsisdnKnown(rs.getString(15).trim());
				dmo.setTsActInclusive(rs.getString(16).trim());
				dmo.setVamMsisdnNo(rs.getString(17).trim());
				dmo.setTsPdeactCharge((rs.getString(18) == null) ? "" : rs
						.getString(18).trim());
				dmo.setVstParameterised(rs.getString(19).trim());
				dmo.setVsmMsisdnNo(rs.getString(20).trim());

				// # get charge values and SUM the charges
				// IF LENGTH(l_SubCharge1 CLIPPED) > 0 THEN
				if (dmo.getVasSubCharge1() != null
						&& dmo.getVasSubCharge1().length() > 0) {
					service1.getChg(dmo.getVasSubCharge1(),
							dmo.getVsrProviderId(), null, null, "F");
				}

				if (dmo.getVasSubCharge1() != null
						&& dmo.getVasSubCharge1().length() > 0) {

					chgDMO = service1.getChg(dmo.getVasSubCharge1(),
							dmo.getVsrProviderId(), null, null, "F");
					subCharge = chgDMO.getChgValue();
					totalSubCharge = totalSubCharge.add(subCharge);

				}

				chgDMO = null;
				subCharge = null;
				//
				if (dmo.getVasSubCharge2() != null
						&& dmo.getVasSubCharge2().length() > 0) {

					chgDMO = service1.getChg(dmo.getVasSubCharge2(),
							dmo.getVsrProviderId(), null, null, "F");
					logger.debug("\nsubcharge: " + dmo.getVasSubCharge3()
							+ " chg: " + chgDMO);
					subCharge = chgDMO.getChgValue();
					totalSubCharge = totalSubCharge.add(subCharge);
				}

				chgDMO = null;
				subCharge = null;
				if (dmo.getVasSubCharge3() != null
						&& dmo.getVasSubCharge3().length() > 0) {

					chgDMO = service1.getChg(dmo.getVasSubCharge3(),
							dmo.getVsrProviderId(), null, null, "F");

					subCharge = chgDMO.getChgValue();
					totalSubCharge = totalSubCharge.add(subCharge);
				}

				chgDMO = null;
				deactCharge = null;
				if (dmo.getTsPdeactCharge() != null
						&& dmo.getTsPdeactCharge().length() > 0) {
					chgDMO = service1.getChg(dmo.getTsPdeactCharge(),
							dmo.getVsrProviderId(), null, null, "F");
					deactCharge = chgDMO.getChgValue();
					dmo.setDeactCharge(deactCharge);
				}

				dmo.setDiscount(this.subDiscount);
				dmo.setTotalSubCharge(totalSubCharge);

				if (list == null) {
					list = new ArrayList<VasVsrVamTsVstVsmDQO>();
				}

				list.add(dmo);
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		}

		return list;
	}

	public BigDecimal getSubscriberDiscountTotal(Integer subscriberId,
			String billTable) throws EPPIXSeriousException {

		BigDecimal totalDiscount = null;

		String sql1 = " SELECT UNIQUE(0) FROM systables WHERE tabname = '"
				+ billTable + "'";

		String sql2 = "SELECT SUM(charge) FROM " + billTable
				+ " WHERE subscriber_id = " + subscriberId
				+ " AND sparech[1,3] = 'DIS' ";

		logger.debug("\n" + sql1);
		logger.debug("\n" + sql2);

		s = null;
		rs = null;
		List<VasVsrVamTsVstVsmDQO> list = null;

		try {
			s = this.getConnection().createStatement();
			rs = s.executeQuery(sql1);

			if (rs == null) {
				logger.error("Bill Table " + billTable + " does not exists");
				throw new EPPIXSeriousException("Bill Table " + billTable
						+ " does not exists");
			} else {

				while (rs.next()) {
					if (!"0".equals(rs.getString(1))) {
						logger.error("NO ROWS FOUND for subscriber: "
								+ subscriberId);
						throw new EPPIXSeriousException("Bill Table "
								+ billTable + " does not exists");
					}
				}
			}

			rs.close();
			rs = null;

			rs = s.executeQuery(sql2);

			if (rs == null) {
				logger.error("NO DISCOUNT FOUND for subscriber: "
						+ subscriberId);
				throw new EPPIXSeriousException(
						"NO DISCOUNT FOUND for subscriber: " + subscriberId);
			} else {

				while (rs.next()) {
					return totalDiscount = rs.getBigDecimal(1);
				}
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		}

		return totalDiscount;
	}

	public List<ServicesOffered> getOfferedServices(Integer subscriberID,
			String msisdn, String simNo, String packageCode, String tariffCode,
			String partnerId) throws EPPIXSeriousException {

		// FUNCTION get_OfferedServices(p_sim_no, p_package, p_tariff,
		// p_no_records)
		thrower.ifParameterMissing("packageCode", packageCode);
		Calendar cal = Calendar.getInstance();
		logger.debug("\nSTART OFFERED SERVICES: " + cal.getTime().toString());

		EhEppixHierarchyDMO ehDmo = null;
		VamActiveMsisdnDMO vamDMO = null;
		SbdSubDetsDMO sbdDMO = null;
		boolean isSub = false;
		boolean isMsisdn = false;
		boolean isSim = false;
		boolean isConverged = false;
		List<TsVsrVstDQO> list = null;
		boolean isFirst = true;
		BigDecimal accountUsageLimit = new BigDecimal("0.00");
		BigDecimal totalCharge = new BigDecimal("0.00");
		ChgChargesDMO chgDmo = null;
		IntegerDMO countDMO = null;
		String depositRequired = "";
		this.actAllow = false;
		List<ServicesOffered> response = null;
		boolean ignoreLimit = false;
		String ttServiceExc = "";

		// Do all validations.
		if (subscriberID == null || subscriberID.intValue() <= 0) {
			isSub = false;
		} else {
			isSub = true;
		}

		if (msisdn == null || msisdn.length() <= 0) {
			isMsisdn = false;
		} else {
			isMsisdn = true;
		}

		if (simNo == null || simNo.length() <= 0) {
			// Nothing was received
			isSim = false;
		} else {
			if (packageCode == null || packageCode.length() <= 0) {
				logger.error("The packageCode is mandatory if the sim is supplied.");

				try {
					thrower.business(this.SUB_000007);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(),
							e.getMessage());
				}
			}

			isSim = true;
		}

		if (!isSub && !isMsisdn && !isSim) {
			logger.error("Either the subscriber id msisdn or sim must be provided");

			try {
				thrower.business(this.SUB_000001);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		try {
			vamDMO = this.getVam(subscriberID, msisdn, simNo);
		} catch (EPPIXSeriousException e1) {
			logger.error(e1.getMessage());

			try {
				thrower.business(this.SUB_000005, new Object[] { subscriberID,
						msisdn, simNo });
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getMessageCode(),
						e.getMessage());
			}
		}

		if (vamDMO == null) {
			logger.error("Subscriber is not valid for details supplied.");
			try {
				thrower.business(SUB_000005, new Object[] { subscriberID,
						msisdn, simNo });
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		if (tariffCode == null || tariffCode.length() <= 0) {
			tariffCode = vamDMO.getVamInternTariff();
		}

		sbdDMO = this.getSbd(vamDMO.getVamSubscriberId(), null);

		if (sbdDMO == null) {
			logger.error("Package / tariff details could not be retrieved for Subscriber: "
					+ vamDMO.getVamSubscriberId());
			try {
				thrower.business(this.SUB_000009, vamDMO.getVamSubscriberId());
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getMessageCode(),
						e.getMessage());
			}
		}

		if (partnerId != null && partnerId.length() > 0) {
			try {
				ehDmo = service2.getScEhHH(partnerId, sbdDMO.getSbdBillAcNo());

				if (ehDmo == null) {
					logger.error("Partner id: " + partnerId
							+ " is in valid for account: "
							+ sbdDMO.getSbdBillAcNo());
					try {
						thrower.business(ApplicationMessages.SUB_000004,
								partnerId);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getMessageCode(),
								e.getMessage());
					}
				}

			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				try {
					thrower.business(ApplicationMessages.SUB_000004, partnerId);
				} catch (EPPIXBusinessException e1) {
					throw new EPPIXSeriousException(e1.getMessageCode(),
							e1.getMessage());
				}
			}
		}

		DAOIterator ttIT = null;

		ttIT = this.getTtTypeText();

		if (ttIT != null) {
			while (ttIT.hasNext()) {
				TtTypeTextDMO ttDmo = (TtTypeTextDMO) ttIT.next();
				ttServiceExc = ttServiceExc + " " + ttDmo.getTtType();
			}
		}

		logger.debug("\nTT SERVICE TYPE EXCLUSIONS LIST:  " + ttServiceExc);
		// System.out.println("TT SERVICE TYPE EXCLUSIONS LIST:  " +
		// ttServiceExc);

		if (isSub) {
			logger.info("\nUsed SUBSCRIBER : " + subscriberID + ": "
					+ packageCode + ": " + tariffCode);
			list = this.getOfferedServList(vamDMO.getVamSimNo(), null, null,
					packageCode, tariffCode);
		} else if (isMsisdn) {

			logger.info("\nUsed MSISDN : " + msisdn + ": " + packageCode + ": "
					+ tariffCode);
			list = this.getOfferedServList(vamDMO.getVamSimNo(), null, null,
					packageCode, tariffCode);
		} else if (isSim) {
			logger.info("\nUsed SIM: " + simNo + ": " + packageCode + ": "
					+ tariffCode);
			list = this.getOfferedServList(simNo, null, null, packageCode,
					tariffCode);
		} else {
			list = this.getOfferedServList(null, null, null, packageCode,
					tariffCode);
		}

		logger.debug("\nLIST AFTER GET OFFERED LIST: " + list);
		logger.debug("\nAFTER GETTING LIST: "
				+ cal.getInstance().getTime().toString());

		SksKeySettingDMO sksDMO = null;

		sksDMO = this.getSks();

		if (sksDMO == null) {
			ignoreLimit = true;
		} else {
			if ("Y".equals(sksDMO.getSksValue())) {
				ignoreLimit = true;
			}
		}

		if (!ignoreLimit) {
			isConverged = this.subscriberActiveServicesDAC.isConverged(vamDMO
					.getVamSubscriberId());
		}

		response = new ArrayList<ServicesOffered>();
		for (TsVsrVstDQO dqo : list) {

			totalCharge = new BigDecimal("0.00");

			if ("SM1T".equals(dqo.getTsServiceCode())
					|| "S50T".equals(dqo.getTsServiceCode())) {
			}

			if (ttServiceExc.contains(dqo.getVsrServiceType())) {
				logger.info("\nFound exclusion for service type: "
						+ dqo.getVsrServiceType());
				// System.out.println("Found exclusion for service type: " +
				// dqo.getVsrServiceType());
				this.actAllow = false;
				continue;
			} else {
				this.actAllow = true;
			}

			if (isSub || isMsisdn || isSim) {

				// if ("SM1T".equals(dqo.getTsServiceCode())
				// || "S50T".equals(dqo.getTsServiceCode())) {
				//
				// }

				if (isConverged) {
					if (!ignoreLimit) {
						if (isFirst) {
							logger.debug("\nSTART GETTING MAX USAGE: "
									+ cal.getInstance().getTime().toString());
							accountUsageLimit = this.serviceMaxSul
									.getSULMaxUsageOnAccountAllowed(sbdDMO,
											dqo.getVsrProviderId());
							logger.debug("\nFINISHED GETTING MAX USAGE: "
									+ cal.getInstance().getTime().toString());
							isFirst = false;
						}
					}
					// END IF
					if (accountUsageLimit == null) {
						accountUsageLimit = new BigDecimal("0.00");
					}

					if (dqo.getTsSubCharge1() != null
							&& dqo.getTsSubCharge1().length() > 0) {
						chgDmo = this.service1.getChg(dqo.getTsSubCharge1(),
								dqo.getVsrProviderId(), new Date(), null, "F");

						if (chgDmo != null) {
							totalCharge = totalCharge
									.add((chgDmo.getChgValue() == null) ? new BigDecimal(
											"0.00") : chgDmo.getChgValue());
						}
					}

					chgDmo = null;
					if (dqo.getTsSubCharge2() != null
							&& dqo.getTsSubCharge2().length() > 0) {
						chgDmo = this.service1.getChg(dqo.getTsSubCharge2(),
								dqo.getVsrProviderId(), new Date(), null, "F");

						if (chgDmo != null) {
							totalCharge = totalCharge
									.add((chgDmo.getChgValue() == null) ? new BigDecimal(
											"0.00") : chgDmo.getChgValue());
						}
					}
					chgDmo = null;
					if (dqo.getTsSubCharge3() != null
							&& dqo.getTsSubCharge3().length() > 0) {
						chgDmo = this.service1.getChg(dqo.getTsSubCharge2(),
								dqo.getVsrProviderId(), new Date(), null, "F");

						if (chgDmo != null) {
							totalCharge = totalCharge
									.add((chgDmo.getChgValue() == null) ? new BigDecimal(
											"0.00") : chgDmo.getChgValue());
						}
					}

					// totalCharge = dqo.getTotalSubCharge();

					if (totalCharge == null) {
						totalCharge = new BigDecimal("0.00");
					}

					logger.debug("\nACCOUNT USAGE ALLOWED: "
							+ accountUsageLimit.setScale(2,
									RoundingMode.HALF_UP));
					logger.debug("\nACCOUNT TOTAL CHARGE: "
							+ totalCharge.setScale(2, RoundingMode.HALF_UP));

					if (totalCharge.intValue() == 0) {
						this.actAllow = true;
					} else {
						if (accountUsageLimit.intValue() >= totalCharge
								.intValue()) {
							this.actAllow = true;
						} else {
							if (accountUsageLimit.intValue() == -1) {
								this.actAllow = true;
							}
							this.actAllow = false;
							continue;
						}
					}
				} else {
					// LET l_act_allow = "0"--> allowed
					this.actAllow = true;
				}

				// DELETE FROM vas_active_service
				// WHERE vas_subscriber_id = l_subid
				// and vas_service_code = l_ts.ts_service_code
				// and vas_deact_date <= today
				//
				// DELETE FROM vsm_service_msisdn
				// WHERE vsm_subscriber_id = l_subid
				// and vsm_service_code = l_ts.ts_service_code
				// and vsm_deact_date <= today
			} else {
				this.actAllow = true;
			}
			//
			// #select if deposit is required
			logger.debug("\nSTART GETTING DEP COUNT: "
					+ cal.getInstance().getTime().toString());
			countDMO = this.subscriberActiveServicesDAC.getCountDepositRule(
					packageCode, dqo.getTsServiceCode());
			logger.debug("\nCOMPLETE GETTING DEP COUNT: "
					+ cal.getInstance().getTime().toString());
			//
			// IF SQLCA.SQLCODE = 0 THEN
			if (countDMO == null) {
				// LET l_deposit_required = "Y"
				depositRequired = "N";
			} else {
				// LET l_deposit_required = "N"
				if (countDMO.getIntValue().intValue() > 0) {
					depositRequired = "Y";
				} else {
					depositRequired = "N";
				}
			}

			// logger.info("ACT ALLOW: " + this.actAllow);

			if (this.actAllow) {

				ServicesOffered serviceOffered = new ServicesOffered();

				serviceOffered
						.setActCharge((dqo.getTsActCharge() == null) ? " "
								: dqo.getTsActCharge());
				serviceOffered.setFutureAct(dqo.getVstFutureAct());
				serviceOffered.setDepositRequired(dqo.getDepositRequired());
				serviceOffered.setParameterised(dqo.getVstParameterised());
				serviceOffered.setServiceCode(dqo.getTsServiceCode());
				serviceOffered.setServiceType(dqo.getVsrServiceType());
				serviceOffered
						.setSubCharge1((dqo.getTsSubCharge1() == null) ? " "
								: dqo.getTsSubCharge1());
				serviceOffered
						.setSubCharge2((dqo.getTsSubCharge2() == null) ? " "
								: dqo.getTsSubCharge2());
				serviceOffered
						.setSubCharge3((dqo.getTsSubCharge3() == null) ? " "
								: dqo.getTsSubCharge3());
				serviceOffered.setVsrServiceDesc(dqo.getVsrServiceDesc());
				serviceOffered.setVstServiceDesc(dqo.getVstServiceDesc());
				serviceOffered.setDepositRequired(dqo.getDepositRequired());

				response.add(serviceOffered);

			}

		}

		logger.debug("\nFINISHED PROCCESSING LIST: "
				+ cal.getInstance().getTime().toString());

		list = null;
		return response;

	}

	private List<TsVsrVstDQO> getOfferedServList(String simNo,
			Integer subscriberId, String msisnd, String packageCode,
			String tariffPlan) throws EPPIXSeriousException {

		Calendar cal = Calendar.getInstance();
		logger.debug("START SELECT: " + cal.getTime().toString());
		IntegerDMO countDMO = null;
		String depositRequired = "";

		BigDecimal totalSubCharge = new BigDecimal("0.00");
		ChgChargesDMO chgDMO = null;

		String sql = "SELECT ts_package_code, ts_internal_tariff, ts_service_code, vsr_service_desc, "
				+ "vsr_service_type, vst_service_desc, ts_act_charge, ts_sub_charge1, ts_sub_charge2, "
				+ "ts_sub_charge3, vst_future_act, vst_parameterised, vst_originator, vsr_provider_id, ts_charge_freq "
				+ "FROM ts_tariff_service, vsr_service, vst_service_types "
				+ "WHERE ts_package_code = '" + packageCode + "' ";

		if (tariffPlan != null && tariffPlan.length() > 0) {
			sql = sql + "AND (ts_internal_tariff = '" + tariffPlan
					+ "' OR ts_internal_tariff IS NULL)";
		}

		sql = sql + " AND vsr_service_code = ts_service_code "
				+ "AND vsr_service_type = vst_service_type ";
		// + "AND vsr_service_type != 'DS'";

		if (simNo != null && simNo.length() > 0) {
			sql = sql
					+ "AND (vsr_service_code not in (select vas_service_code "
					+ "FROM vas_active_service, vam_active_msisdn "
					+ "where vam_sim_no = '" + simNo + "' "
					+ "AND vam_subscriber_id = vas_subscriber_id) "
					+ "OR vst_parameterised ='Y') ";
		} else if (subscriberId != null && subscriberId.intValue() > 0) {
			sql = sql
					+ "AND (vsr_service_code not in (select vas_service_code "
					+ "FROM vas_active_service, vam_active_msisdn "
					+ "where vam_subscriber_id = " + subscriberId + ")"
					+ " OR vst_parameterised ='Y') ";
		} else if (msisnd != null && msisnd.length() > 0) {
			sql = sql
					+ "AND (vsr_service_code not in (select vas_service_code "
					+ "FROM vas_active_service, vam_active_msisdn "
					+ "where vvam_msisdn_no = '" + msisnd + "' "
					+ "AND vam_subscriber_id = vas_subscriber_id )"
					+ " OR vst_parameterised ='Y') ";
		}

		List<TsVsrVstDQO> list = null;

		logger.debug(sql);

		s = null;
		rs = null;

		try {
			s = this.getConnection().createStatement();
			rs = s.executeQuery(sql);

			if (rs == null) {
				logger.error("NO ROWS FOUND");
				throw new EPPIXSeriousException("NO ROWS FOUND");
			}

			logger.debug("SELECT COMPLETED: "
					+ cal.getInstance().getTime().toString());

			while (rs.next()) {

				TsVsrVstDQO dqo = new TsVsrVstDQO();
				totalSubCharge = new BigDecimal("0.00");

				dqo.setTsPackageCode(rs.getString("ts_package_code"));
				dqo.setTsInternalTariff(rs.getString("ts_internal_tariff"));
				dqo.setTsServiceCode(rs.getString("ts_service_code"));
				dqo.setVsrServiceDesc(rs.getString("vsr_service_desc"));
				dqo.setVsrServiceType(rs.getString("vsr_service_type"));
				dqo.setVstServiceDesc(rs.getString("vst_service_desc"));

				// System.out.println("CHARGE: " +
				// rs.getString("ts_act_charge"));
				if (rs.getString("ts_act_charge") != null
						&& rs.getString("ts_act_charge").trim().length() > 0) {
					dqo.setTsActCharge(rs.getString("ts_act_charge").trim());
				} else {
					dqo.setTsActCharge("");
				}

				dqo.setTsSubCharge1((rs.getString("ts_sub_charge1") == null) ? " "
						: rs.getString("ts_sub_charge1").trim());
				dqo.setTsSubCharge2((rs.getString("ts_sub_charge2") == null) ? " "
						: rs.getString("ts_sub_charge2").trim());
				dqo.setTsSubCharge3((rs.getString("ts_sub_charge3") == null) ? " "
						: rs.getString("ts_sub_charge3").trim());
				dqo.setVstFutureAct(rs.getString("vst_future_act").trim());
				dqo.setVstParameterised(rs.getString("vst_parameterised"));
				dqo.setVstOriginator(rs.getString("vst_originator"));
				dqo.setVsrProviderId(rs.getString("vsr_provider_id"));
				dqo.setTsChargeFreq(rs.getString("ts_charge_freq"));

				// if (dqo.getTsSubCharge1() != null
				// && dqo.getTsSubCharge1().length() > 0) {
				//
				// chgDMO = service1.getChg(dqo.getTsSubCharge1(),
				// dqo.getVsrProviderId(), null, null, "F");
				// if (chgDMO != null) {
				// totalSubCharge = totalSubCharge.add(chgDMO
				// .getChgValue());
				// }
				//
				// }

				// chgDMO = null;
				//
				// if (dqo.getTsSubCharge2() != null
				// && dqo.getTsSubCharge2().length() > 0) {
				//
				// chgDMO = service1.getChg(dqo.getTsSubCharge2(),
				// dqo.getVsrProviderId(), null, null, "F");
				// if (chgDMO != null) {
				// totalSubCharge = totalSubCharge.add(chgDMO
				// .getChgValue());
				// }
				//
				// }

				// chgDMO = null;
				// if (dqo.getTsSubCharge3() != null
				// && dqo.getTsSubCharge3().length() > 0) {
				//
				// chgDMO = service1.getChg(dqo.getTsSubCharge3(),
				// dqo.getVsrProviderId(), null, null, "F");
				// if (chgDMO != null) {
				// totalSubCharge = totalSubCharge.add(chgDMO
				// .getChgValue());
				// }
				//
				// }

				// dqo.setTotalSubCharge(totalSubCharge);

				// logger.debug("\nSTART GETTING DEP COUNT: " +
				// cal.getInstance().getTime().toString());
				// countDMO =
				// this.subscriberActiveServicesDAC.getCountDepositRule(
				// packageCode, dqo.getTsServiceCode());
				// logger.debug("\nCOMPLETE GETTING DEP COUNT: " +
				// cal.getInstance().getTime().toString());

				// if (countDMO == null) {
				// // LET l_deposit_required = "Y"
				// depositRequired = "N";
				// } else {
				// // LET l_deposit_required = "N"
				// if (countDMO.getIntValue().intValue() > 0) {
				// depositRequired = "Y";
				// }else{
				// depositRequired = "N";
				// }
				// }

				// dqo.setDepositRequired(depositRequired);

				if (list == null) {
					list = new ArrayList<TsVsrVstDQO>();
					list.add(dqo);
				} else {
					list.add(dqo);
				}
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException(e.getMessage());
		}

		logger.debug("AFTER ADDING CHARGES: "
				+ cal.getInstance().getTime().toString());
		return list;
	}

	public EppixResponse doActivateSubscriberService(Integer subscriberID,
			String msisdn, String serviceCode, String paramValue,
			String partnerId) {

		logger.debug("\nInteger subscriberID: " + subscriberID
				+ "\nString msisdn: " + msisdn + "\nString serviceCode: "
				+ serviceCode + "\nString partnerId: " + partnerId);

		// #------------------------------------------------------------------------------#
		// # Purpose: activates a prestige service #
		// # Accepts: p_subscriber_id - prestige Customer Subscriber ID #
		// # Returns: (nothing) #
		// #------------------------------------------------------------------------------#
		// FUNCTION Service_ActivatePrestige (p_subscriber_id)
		// DEFINE
		// p_subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id,
		//
		// l_psm RECORD LIKE psm_prstg_srv_mtrx.*,
		// l_sbd RECORD LIKE sbd_sub_dets.*,
		// l_vam RECORD LIKE vam_active_msisdn.*,
		// l_vsr RECORD LIKE vsr_service.*,
		// l_vst RECORD LIKE vst_service_types.*,
		// l_nm RECORD LIKE nm_netmat.*,
		// l_smn RECORD LIKE smn_sim_nos.*,
		// l_msi RECORD LIKE msi_msisdn_nos.*,
		// l_ts RECORD LIKE ts_tariff_service.*,
		// l_contract_termination DATE,
		// l_int_date INTEGER,
		// l_count SMALLINT,
		// l_deposit_ind CHAR(1),
		// l_error CHAR(200),
		// l_function CHAR(50)
		//
		// WHENEVER ANY ERROR CALL error_classify
		// LET l_function = ": Service_ActivatePrestige()"
		//
		// INITIALIZE l_psm.*, l_vam.*, l_sbd.*, l_vsr.*, l_vst.*,l_nm.*,
		// l_msi.*,l_smn.*,
		// l_ts.*, l_error, l_contract_termination TO NULL
		// call Debuglog("ServActPrest")
		// WHILE TRUE
		EhEppixHierarchyDMO ehDmo = null;
		boolean hasService = false;
		TsTariffServiceDMO tsDMO = null;
		boolean isParameterised = false;
		//
		// -- Validate mandatory parameters
		if (subscriberID == null || subscriberID.intValue() <= 0) {
			if (msisdn == null || msisdn.length() <= 0) {
				logger.error("Either the subscriber id or msisdn must be provided");

				try {
					thrower.business(this.SUB_000001);
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		}

		try {
			this.sbdDMO = this.getSbd(subscriberID, msisdn);

			if (this.sbdDMO == null) {
				logger.error("Invalid subscriber details");

				try {
					thrower.business(this.SUB_000002, new Object[] {
							subscriberID, msisdn });
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}

		} catch (EPPIXSeriousException e) {
			logger.error("Either the subscriber id or msisdn must be provided");

			try {
				thrower.business(this.SUB_000002, new Object[] { subscriberID,
						msisdn });
			} catch (EPPIXBusinessException e1) {
				EppixResponse response = new EppixResponse();

				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}
		//
		// CALL d_sbd_get(p_subscriber_id) RETURNING l_sbd.*
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		// --get the sim number
		// DECLARE c_prim CURSOR FOR
		// SELECT *
		// FROM vam_active_msisdn
		// WHERE vam_subscriber_id = p_subscriber_id
		// ORDER BY vam_connect_date DESC
		// OPEN c_prim
		// IF SQLCA.SQLCODE != 0 THEN
		// CALL Error_Append("Unable to open c_prim CURSOR", l_function)
		// EXIT WHILE
		// END IF
		//
		// FETCH c_prim INTO l_vam.*
		try {
			this.vamDMO = this.getVam(subscriberID, msisdn, null);

			if (this.vamDMO == null) {
				try {
					thrower.business(this.SUB_000010, new Object[] {
							subscriberID, msisdn });
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}

			if (!"1".equals(this.vamDMO.getVamStatCode())
					&& !"4".equals(this.vamDMO.getVamStatCode())) {
				try {
					thrower.business(this.SUB_000013, subscriberID);
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}

			}

		} catch (EPPIXSeriousException e) {
			logger.error("Active record not found for subscriber");

			try {
				thrower.business(this.SUB_000002, new Object[] { subscriberID,
						msisdn });
			} catch (EPPIXBusinessException e1) {
				EppixResponse response = new EppixResponse();

				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		if (partnerId != null && partnerId.length() > 0) {
			try {
				ehDmo = service2.getScEhHH(partnerId, sbdDMO.getSbdBillAcNo());

				if (ehDmo == null) {
					logger.error("Partner id: " + partnerId
							+ " is in valid for account: "
							+ sbdDMO.getSbdBillAcNo());
					try {
						thrower.business(ApplicationMessages.SUB_000004,
								partnerId);
					} catch (EPPIXBusinessException e) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}

			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				try {
					thrower.business(ApplicationMessages.SUB_000004, partnerId);
				} catch (EPPIXBusinessException e1) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		}
		// IF SQLCA.SQLCODE != 0 THEN
		// CALL Error_Append("Record not found", l_function)
		// EXIT WHILE
		// END IF
		// CLOSE c_prim

		//
		// LET l_count = 0

		// Select count(*) from vas_active_service
		// where vas_subscriber_id = p_subscriber_id
		// and vas_service_code = "PRST"
		hasService = this.getVasBySubService(subscriberID, serviceCode);
		//
		// IF l_count = 0 THEN
		if (!hasService) {

			try {
				this.getTsTariffServiceByServiceCode(serviceCode,
						sbdDMO.getSbdPackageCode(), sbdDMO.getSbdTariffPlan());

				if (this.tsDMO == null) {

					try {
						thrower.business(SUB_000012, serviceCode);
					} catch (EPPIXBusinessException e) {
						EppixResponse response = new EppixResponse();
						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			} catch (EPPIXSeriousException e2) {
				logger.error(e2.getMessage());

				EppixResponse response = new EppixResponse();
				response.setEppixStatus("0");
				response.setErrorCode(e2.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e2.getMessage());
				return response;
			}
			// CALL
			// servicecreate_non_basic(p_subscriber_id,l_vam.vam_sim_no,"PRST",today,
			// "",l_ts.ts_act_charge,l_ts.ts_sub_charge1,l_ts.ts_sub_charge2,
			// l_ts.ts_sub_charge3,"","","","","","N","N","N")
			try {
				subscriberUpgServices.createServiceNonBasic(subscriberID,
						this.vamDMO.getVamSimNo(), serviceCode, new Date(),
						this.sbdDMO.getSbdTariffPlan(),
						this.tsDMO.getTsActCharge(),
						this.tsDMO.getTsSubCharge1(),
						this.tsDMO.getTsSubCharge2(),
						this.tsDMO.getTsSubCharge3(), "", "", "", "", "", "N",
						"N", "N");
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());

				try {
					thrower.business(this.SUB_000011, new Object[] {
							serviceCode, subscriberID });
				} catch (EPPIXBusinessException e1) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e1.getMessage());
					return response;
				}
			}

			try {
				this.getVsrDmo(serviceCode);

				/*
				 * Something bad happened, VSR record is missing
				 */
				if (this.vsrDMO == null) {
					logger.error("\nVSR Service details not found");

					try {
						thrower.business(this.SUB_000014, serviceCode);
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				}
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());

				try {
					thrower.business(this.SUB_000014, serviceCode);
				} catch (EPPIXBusinessException e2) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e2.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e2.getMessage());
					return response;
				}
			}

			// System.out.println("SERVICE TYPE AFTER GETTING VSR: " +
			// this.vsrDMO.getVsrServiceType());

			try {
				this.getVstDmo(this.vsrDMO.getVsrServiceType());

				/*
				 * Something bad happened, VSR record is missing
				 */
				if (this.vstDMO == null) {
					logger.error("\nVST Service details not found");

					try {
						thrower.business(this.SUB_000014, serviceCode);
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				} else {
					if ("Y".equals(this.vstDMO.getVstParameterised())) {
						if (this.tsDMO.getTsNetServCode() == null
								|| this.tsDMO.getTsNetServCode().trim()
										.length() <= 0) {
							isParameterised = false;
						} else {
							isParameterised = true;
						}
					} else {
						isParameterised = false;
					}
				}
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());

				try {
					thrower.business(this.SUB_000014, serviceCode);
				} catch (EPPIXBusinessException e2) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e2.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e2.getMessage());
					return response;
				}
			}

			// IF g_status_class != 0 THEN
			// let l_error = g_error_text[1,200]
			// CALL Error_Append(l_error, l_function)
			// ELSE
			// CALL Error_Reset()
			// END IF
			// END IF

			//
			// DECLARE c_prst_service CURSOR FOR
			// SELECT psm_prstg_srv_mtrx.*
			// FROM psm_prstg_srv_mtrx, vsr_service
			// WHERE vsr_service_code = psm_service_code
			// AND vsr_suspend = "N"
			// AND psm_activate_type not in ('MR','MW')
			//
			// OPEN c_prst_service
			//
			// IF SQLCA.SQLCODE != 0 THEN
			// LET l_error = "Cannot open c_prst_service cursor, error code ",
			// SQLCA.SQLCODE
			// CALL Error_SeriousError(l_error, l_function)
			// EXIT WHILE
			// END IF
			//
			// FOREACH c_prst_service INTO l_psm.*
			//
			// CALL d_vsr_get(l_psm.psm_service_code) RETURNING l_vsr.*
			// IF g_status_class != 0 THEN
			// CALL Error_Append(l_error, l_function)
			// EXIT WHILE
			// END IF
			// CALL d_vst_get(l_vsr.vsr_service_type) RETURNING l_vst.*
			// IF g_status_class != 0 THEN
			// CALL Error_Append(l_error, l_function)
			// EXIT WHILE
			// END IF
			//
			// IF l_psm.psm_deposit_waiver = 'Y' THEN
			// LET l_deposit_ind = 'N'
			// ELSE
			// LET l_deposit_ind = 'Y'
			// END IF
			//
			// CASE l_vst.vst_service_class
			// WHEN "B"
			// WHEN "V"
			// CALL Charge_GetDefault(l_sbd.sbd_package_code,
			// l_psm.psm_service_code, l_sbd.sbd_tariff_plan)
			// RETURNING l_ts.*
			// IF g_status_class != 0 THEN
			// CALL Error_Reset()
			// CONTINUE FOREACH
			// END IF
			// CALL
			// servicecreate_non_basic(p_subscriber_id,l_vam.vam_sim_no,l_psm.psm_service_code,today,
			// l_sbd.sbd_tariff_plan,l_ts.ts_act_charge,l_ts.ts_sub_charge1,l_ts.ts_sub_charge2,
			// l_ts.ts_sub_charge3,"","","","","","N","N",l_deposit_ind)
			//
			// IF g_status_class != 0 THEN
			// CALL Error_Append(l_error, l_function)
			// CALL Error_Reset()
			// CONTINUE FOREACH
			// END IF
			// OTHERWISE
			// LET l_error = "Unknown Service Type", l_vst.vst_service_class
			// CALL Error_Append(l_error, l_function)
			// EXIT WHILE
			// END CASE
			// END FOREACH
			// --
			// CALL Discount_ApplyChanges(p_subscriber_id, "","")
			// IF g_status_class != 0 THEN
			// CALL Error_Append("",l_function)
			// EXIT WHILE
			// END IF
			// -- Only loop through WHILE once
			// EXIT WHILE
			// END WHILE
			logger.info("\nIS PARAMETER SERVICES: " + isParameterised);

			if (isParameterised) {
				logger.info("\nSTART PARAMETER SERVICES");
				try {
					this.doParamInsertValidation(subscriberID, serviceCode,
							paramValue);
				} catch (EPPIXSeriousException e) {
					logger.error("\nFailed to insert parameter service for subscriber: "
							+ subscriberID + "\nEXCEPTION:  " + e.getMessage());

					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
				logger.info("\nEND PARAMETER SERVICES");
			}

			if ("Y".equals(this.vsrDMO.getVsrProrata())) {
				try {
					subscriberUpgServices.ChargeProrataActivation(subscriberID,
							this.sbdDMO.getSbdDiallingNo(), serviceCode,
							sbdDMO.getSbdTariffPlan(), new Date());
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());

					try {
						thrower.business(this.SUB_000016, e.getMessage());
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				}
			}

			// CALL Discount_ApplyChanges(p_subscriber_id, "","")
			// Allready done in servicecreatenonbasic
			// try {
			// subscriberUpgServices.discountApplyChanges(subscriberID, null,
			// null);
			// } catch (EPPIXSeriousException e1) {
			// logger.error(e1.getMessage());
			//
			// try {
			// thrower.business(this.SUB_000016, e1.getMessage());
			// } catch (EPPIXBusinessException e2) {
			// EppixResponse response = new EppixResponse();
			//
			// response.setEppixStatus("0");
			// response.setErrorCode(e2.getErrorCode());
			// response.setErrorType("1");
			// response.setIsamError(e2.getMessage());
			// return response;
			// }
			// } catch (EPPIXBusinessException e1) {
			// logger.error(e1.getMessage());
			//
			// try {
			// thrower.business(this.SUB_000016, e1.getMessage());
			// } catch (EPPIXBusinessException e2) {
			// EppixResponse response = new EppixResponse();
			//
			// response.setEppixStatus("0");
			// response.setErrorCode(e2.getErrorCode());
			// response.setErrorType("1");
			// response.setIsamError(e2.getMessage());
			// return response;
			// }
			// }

			// Do N2N
			/**
			 * TODO SJ: need to follow what to do for N2N
			 */
			int seqNo = 0;

			logger.debug("\nthis.tsDMO: " + this.tsDMO.toString());

			ServiceCreateReturnRecord serviceNonRecord = null;
			subscriberUpgServices.networkId = this.vsrDMO.getVsrProviderId();
			// System.out.println("SERVICE TYPE BEFORE N2N: " +
			// this.vsrDMO.getVsrServiceType());

			if ("N".equals(this.vstDMO.getVstOriginator())) {
				try {
					serviceNonRecord = subscriberUpgServices
							.serviceCreateNonBasicN2N(sbdDMO
									.getSbdSubscriberId(),
									vamDMO.getVamSimNo(), "N", "", new Integer(
											"5"), "", new Integer(seqNo),
									this.tsDMO.getTsNetServCode(),
									"MODIFY_SERVICES", this.vsrDMO
											.getVsrServiceType(), "", "", "",
									this.tsDMO.getTsServiceCode(), this.vsrDMO
											.getVsrProviderId(), "MODIFY",
									new Date(), new Short("0"));

					seqNo++;

					String text3 = "[SERVICE_REQUEST_TRAILER],SEGMENT_COUNT="
							+ seqNo + ",";

					subscriberUpgServices.insertEcd(
							serviceNonRecord.getCommand(), seqNo, text3);

					subscriberUpgServices.insertEq(
							serviceNonRecord.getCommand(), "MODIFY_SERVICES",
							serviceNonRecord.getNetworkPrefix(), "5");
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());

					try {
						thrower.business(this.SUB_000015, e.getMessage());
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				} catch (NumberFormatException e) {
					logger.error(e.getMessage());

					try {
						thrower.business(this.SUB_000016, e.getMessage());
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				}
			}
		} else {
			/**
			 * Service is already active for the subscriber
			 */

			logger.error("The service is already active for the subscriber");

			try {
				thrower.business(this.SUB_000017, new Object[] { serviceCode,
						subscriberID });
			} catch (EPPIXBusinessException e2) {
				EppixResponse response = new EppixResponse();

				response.setEppixStatus("0");
				response.setErrorCode(e2.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e2.getMessage());
				return response;
			}
		}

		/**
		 * We have reached this point, there are no errors. Send success
		 */

		EppixResponse response = new EppixResponse();

		response.setEppixStatus("0");
		response.setErrorCode("0");
		response.setErrorType("0");
		response.setIsamError("SUCCESS");
		return response;
	}

	public EppixResponse doDeactivateSubscriberService(Integer subscriberID,
			String msisdn, String serviceCode, String partnerId) {

		EhEppixHierarchyDMO ehDmo = null;
		boolean hasService = false;
		boolean isParameterised = false;

		try {
			thrower.ifParameterMissing("serviceCode", serviceCode);
		} catch (EPPIXSeriousException e1) {
			logger.error("Either the subscriber id or msisdn must be provided");

			EppixResponse response = new EppixResponse();
			response.setEppixStatus("0");
			response.setErrorCode(e1.getErrorCode());
			response.setErrorType("1");
			response.setIsamError(e1.getMessage());
			return response;
		}

		if (subscriberID == null || subscriberID.intValue() <= 0) {
			if (msisdn == null || msisdn.length() <= 0) {
				logger.error("Either the subscriber id or msisdn must be provided");

				try {
					thrower.business(this.SUB_000001);
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();
					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		}

		try {
			this.vamDMO = this.getVam(subscriberID, msisdn, null);

			if (this.vamDMO == null) {

				try {
					thrower.business(this.SUB_000010, new Object[] {
							subscriberID, msisdn });
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}

			if (!"1".equals(this.vamDMO.getVamStatCode())
					&& !"4".equals(this.vamDMO.getVamStatCode())) {

				try {
					thrower.business(this.SUB_000013, subscriberID);
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}

			}

		} catch (EPPIXSeriousException e) {
			logger.error("Active record not found for subscriber");

			try {
				thrower.business(this.SUB_000010, new Object[] { subscriberID,
						msisdn });
			} catch (EPPIXBusinessException e1) {
				EppixResponse response = new EppixResponse();

				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		try {
			this.sbdDMO = this.getSbd(subscriberID, msisdn);

			if (this.sbdDMO == null) {
				logger.error("Invalid subscriber details");

				try {
					thrower.business(this.SUB_000002, new Object[] {
							subscriberID, msisdn });
				} catch (EPPIXBusinessException e) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}

		} catch (EPPIXSeriousException e) {
			logger.error("Either the subscriber id or msisdn must be provided");

			try {
				thrower.business(this.SUB_000002, new Object[] { subscriberID,
						msisdn });
			} catch (EPPIXBusinessException e1) {
				EppixResponse response = new EppixResponse();

				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		if (partnerId != null && partnerId.length() > 0) {
			try {
				ehDmo = service2.getScEhHH(partnerId, sbdDMO.getSbdBillAcNo());

				if (ehDmo == null) {
					logger.error("Partner id: " + partnerId
							+ " is in valid for account: "
							+ sbdDMO.getSbdBillAcNo());
					try {
						thrower.business(ApplicationMessages.SUB_000004,
								partnerId);
					} catch (EPPIXBusinessException e) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}

			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				try {
					thrower.business(ApplicationMessages.SUB_000004, partnerId);
				} catch (EPPIXBusinessException e1) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		}

		hasService = this.getVasBySubService(subscriberID, serviceCode);

		if (hasService) {

			try {
				this.getTsTariffServiceByServiceCode(serviceCode,
						sbdDMO.getSbdPackageCode(), sbdDMO.getSbdTariffPlan());

				if (this.tsDMO == null) {

					try {
						thrower.business(SUB_000012, serviceCode);
					} catch (EPPIXBusinessException e) {
						EppixResponse response = new EppixResponse();
						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			} catch (EPPIXSeriousException e2) {
				logger.error(e2.getMessage());

				EppixResponse response = new EppixResponse();
				response.setEppixStatus("0");
				response.setErrorCode(e2.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e2.getMessage());
				return response;
			}

			try {
				this.getVsrDmo(serviceCode);

				/*
				 * Something bad happened, VSR record is missing
				 */
				if (this.vsrDMO == null) {
					logger.error("\nVSR Service details not found");

					try {
						thrower.business(this.SUB_000014, serviceCode);
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				}
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());

				try {
					thrower.business(this.SUB_000014, serviceCode);
				} catch (EPPIXBusinessException e2) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e2.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e2.getMessage());
					return response;
				}
			}

			try {
				this.getVstDmo(this.vsrDMO.getVsrServiceType());

				/*
				 * Something bad happened, VSR record is missing
				 */
				if (this.vstDMO == null) {
					logger.error("\nVST Service details not found");

					try {
						thrower.business(this.SUB_000014, serviceCode);
					} catch (EPPIXBusinessException e2) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e2.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e2.getMessage());
						return response;
					}
				} else {
					if ("Y".equals(this.vstDMO.getVstParameterised())) {
						if (this.tsDMO.getTsNetServCode() == null
								|| this.tsDMO.getTsNetServCode().trim()
										.length() <= 0) {
							isParameterised = false;
						} else {
							isParameterised = true;
						}
					} else {
						isParameterised = false;
					}
				}
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());

				try {
					thrower.business(this.SUB_000014, serviceCode);
				} catch (EPPIXBusinessException e2) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e2.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e2.getMessage());
					return response;
				}
			}

			try {

				subscriberUpgServices.networkId = this.vsrDMO
						.getVsrProviderId();
				this.subscriberUpgServices.simDeactivateService(subscriberID,
						this.vamDMO.getVamSimNo(), serviceCode,
						this.tsDMO.getTsTdeactCharge(),
						this.tsDMO.getTsSubCharge1(),
						this.tsDMO.getTsSubCharge2(),
						this.tsDMO.getTsSubCharge3(), null, null,
						this.vstDMO.getVstMultiCharge(),
						this.vsrDMO.getVsrProrata());

				if (this.subscriberUpgServices.getErrorMesg().length() > 0) {
					try {
						thrower.business(SUB_000018, new Object[] {
								serviceCode, subscriberID });
					} catch (EPPIXBusinessException e) {
						EppixResponse response = new EppixResponse();

						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}

			} catch (EPPIXSeriousException e) {

				e.printStackTrace();
				logger.error(e.getMessage());

				try {
					thrower.business(SUB_000016, e.getMessage());
				} catch (EPPIXBusinessException e1) {
					EppixResponse response = new EppixResponse();

					response.setEppixStatus("0");
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e1.getMessage());
					return response;
				}
			}

		} else {
			// No service to deactivate
			try {
				thrower.business(SUB_000022, new Object[] { serviceCode,
						subscriberID });
			} catch (EPPIXBusinessException e) {
				EppixResponse response = new EppixResponse();
				response.setEppixStatus("0");
				response.setErrorCode(e.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e.getMessage());
				return response;
			}
		}
		EppixResponse response = new EppixResponse();
		response.setEppixStatus("0");
		response.setErrorCode("0");
		response.setErrorType("0");
		response.setIsamError("SUCCESS");
		return response;
	}

	public boolean getVasBySubService(Integer subscriberId, String serviceCode) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasServiceCodeFilter,
				serviceCode);

		VasActiveServiceDMO vasDmo = null;

		try {
			vasDmo = base.vasActiveService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		if (vasDmo == null) {
			return false;
		} else {
			return true;
		}
	}

	public void getTsTariffServiceByServiceCode(String servCode,
			String packageCode, String intTariff) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsServiceCodeFilter,
				servCode);
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter,
				packageCode);
		// filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsInternalTariffFilter,
		// intTariff);
		filter.add(FilterOp.EQUALORNULL,
				TsTariffServiceDMO.tsInternalTariffFilter, intTariff);

		try {
			tsDMO = this.base.tsTariffService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		}

	}

	private void getVsrDmo(String serviceCode) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VsrServiceDMO.vsrServiceCodeFilter,
				serviceCode);

		try {
			vsrDMO = base.vsrService().get(filter);

			if (vsrDMO == null) {
				logger.error("No service details found in table vsr_service for service code "
						+ serviceCode);
				throw new EPPIXSeriousException(
						"No service details found in table vsr_service for service code "
								+ serviceCode);
			}
		} catch (EPPIXBusinessException e) {
			logger.error("No service details found in table vsr_service for service code "
					+ serviceCode + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"No service details found in table vsr_service for service code "
							+ serviceCode + " EXCEPTION: " + e);

		} catch (EPPIXUnexpectedException e) {
			logger.error("No service details found in table vsr_service for service code "
					+ serviceCode + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"No service details found in table vsr_service for service code "
							+ serviceCode + " EXCEPTION: " + e);

		} catch (EPPIXFatalException e) {
			logger.error("No service details found in table vsr_service for service code "
					+ serviceCode + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"No service details found in table vsr_service for service code "
							+ serviceCode + " EXCEPTION: " + e);

		}

	}

	public void getVstDmo(String serviceType) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VstServiceTypesDMO.vstServiceTypeFilter,
				serviceType);

		try {
			vstDMO = base.vstServiceTypes().get(filter);

			if (vstDMO == null) {
				logger.error("No service types found in table vst_service-type for service type "
						+ serviceType);
				throw new EPPIXSeriousException(
						"No service types found in table vst_service-type for service type "
								+ serviceType);
			}
		} catch (EPPIXBusinessException e) {
			logger.error("No service types found in table vst_service-type for service type "
					+ serviceType + " EXCEPTION: " + e);

		} catch (EPPIXUnexpectedException e) {
			logger.error("No service types found in table vst_service-type for service type "
					+ serviceType + " EXCEPTION: " + e);

		} catch (EPPIXFatalException e) {
			logger.error("No service types found in table vst_service-type for service type "
					+ serviceType + " EXCEPTION: " + e);

		}
	}

	public void doParamInsertValidation(Integer subscriberID,
			String serviceCode, String paramValue) throws EPPIXSeriousException {

		SpcSpvPshPsdDQO dqo = null;

		try {
			dqo = subscriberUpgServices.subscriberUpgradeMigradeDAC
					.getSpcSpvPshPsdBySubServCode(serviceCode, subscriberID);
		} catch (EPPIXSeriousException e1) {
			logger.error(e1.getMessage());
		}

		if (dqo != null) {
			/**
			 * Subsciber has service.
			 */
				logger.error("SUBSCRIBER HAS PARAM SERVICES FOR SUBSCRIBER: "
						+ subscriberID);
			return;
		} else {

			TtTypeTextDMO ttDMO = null;

			QueryFilter filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter,
					"CHGVARPARM");
			filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter,
					this.vstDMO.getVstServiceType());
			filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttLangFilter, "ENG");

			try {
				ttDMO = base.ttTypeText().get(filter);

			} catch (EPPIXBusinessException e) {
				logger.error(e.getMessage());
			} catch (EPPIXUnexpectedException e) {
				logger.error(e.getMessage());
			} catch (EPPIXFatalException e) {
				logger.error(e.getMessage());
			}

			if (ttDMO == null) {
				ttDMO = new TtTypeTextDMO();
				ttDMO.setTtType("");
			}

			if (paramValue != null && paramValue.length() > 0) {
				// Get SPC record.
				this.getSpcByServiceCode(serviceCode);
			}

			if (this.spcDMO != null) {

				this.getSpvParamValues(null, this.spcDMO.getSpcParamId(),
						paramValue);

				if (this.spvDMO == null) {
					logger.error("Failed to get SPV for PARAM VALUE: "
							+ paramValue);
					// So there is no parameter service to activate.
					try {
						thrower.business(this.SUB_000019, paramValue);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(),
								e.getMessage());
					}
				}
			} else {
				this.getSpvParamValues(this.tsDMO.getTsNetServCode(), null,
						null);

				if (this.spvDMO == null) {
					logger.error("Failed to get SPV for NETWRKCODE: "
							+ this.tsDMO.getTsNetServCode());
					// So there is no parameter service to activate.
					try {
						thrower.business(this.SUB_000020,
								this.tsDMO.getTsNetServCode());
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(),
								e.getMessage());
					}
				}
			}

			chgDMO = service1.getChg(this.spvDMO.getSpvChargeCode(),
					this.vsrDMO.getVsrProviderId(), new Date(), null, "F");
			//
			if (this.chgDMO == null) {
				logger.error("Fixed Charge details not found for PsdSubscharge: "
						+ this.spvDMO.getSpvChargeCode()
						+ " NetID: "
						+ this.vsrDMO.getVsrProviderId());
				throw new EPPIXSeriousException(this.SUB_000016,
						"Fixed Charge details not found for PsdSubscharge: "
								+ this.spvDMO.getSpvChargeCode() + " NetID: "
								+ this.vsrDMO.getVsrProviderId());
			}
			//
			// CALL opservm_get(l_chg.chg_ncode)
			// RETURNING l_opservm.*
			this.opservmDMO = this.getOpservm(this.chgDMO.getChgNcode());
			//
			if (this.opservmDMO == null) {
				logger.error("Fixed Charge details not found for OpservM: "
						+ this.chgDMO.getChgNcode());

				return;
			}

			try {
				this.insertSubscriberParamServices(
						this.tsDMO.getTsServiceCode(),
						this.vstDMO.getVstServiceType(),
						this.sbdDMO.getSbdSubscriberId(),
						this.sbdDMO.getSbdDiallingNo(), "N",
						vamDMO.getVamSimNo(),
						spvDMO.getSpvParamId().toString(), new Date(),
						sbdDMO.getSbdDconnectDate(), spvDMO.getSpvParamValue(),
						"Y", "Y", sbdDMO.getSbdDconnectDate(),
						this.chgDMO.getChgValue());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
				throw new EPPIXSeriousException(this.SUB_000016, e.getMessage());
			}
		}
	}

	public void insertSubscriberParamServices(String serviceCode,
			String serviceType, Integer subscriberId, String msisdnNo,
			String archived, String simNo, String paramId, Date actDate,
			Date termDate, String paramValue, String n2nString,
			String paramActive, Date deacDate, BigDecimal charge)
			throws EPPIXSeriousException {

		logger.debug("\nString serviceCode: " + serviceCode
				+ "\nString serviceType: " + serviceType
				+ "\nInteger subscriberId: " + subscriberId
				+ "\nString msisdnNo: " + msisdnNo + "\nString archived: "
				+ archived + "\nString simNo: " + simNo + "\nString paramId: "
				+ paramId + "\nDate actDate: " + actDate + "\nDate termDate: "
				+ termDate + "\nString paramValue: " + paramValue
				+ "\nString n2nString: " + n2nString + "\nString paramActive: "
				+ paramActive + "\nDate deacDate: " + deacDate
				+ "\nBigDecimal charge: " + charge);

		/**
		 * SJ: Adding a change to check if the PSH record exists. If exists, no
		 * new record to be inserted into PSH Change: From Pedro. HI You are
		 * correct, the records do exist ….. BUT, your process is incorrect.
		 * 
		 * @Sarel, If the PSH record already exists for the subscriber for the
		 *         service, you should not be inserting a new record into PSH,
		 *         you should only be inserting the new record into PSD
		 */

		QueryFilter filter = new QueryFilter();
		PshParamServHdrDMO pshExistDMO = new PshParamServHdrDMO();
		pshDMO = new PshParamServHdrDMO();

		pshDMO.setPshId(new Integer(0));
		pshDMO.setPshServiceCode(serviceCode);
		pshDMO.setPshServiceType(serviceType);
		pshDMO.setPshSubscriberId(subscriberId);
		pshDMO.setPshArchived(archived);

		filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshServiceCodeFilter,
				serviceCode);
		filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshServiceTypeFilter,
				serviceType);
		filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshSubscriberIdFilter,
				subscriberId);

		if (vstDMO.getVstParamsLevel().equals("I")) {

			pshDMO.setPshSimNo(simNo);
			pshDMO.setPshMsisdnNo("");
			filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshSimNoFilter, simNo);

		} else if (vstDMO.getVstParamsLevel().equals("M")) {

			pshDMO.setPshSimNo("");
			pshDMO.setPshMsisdnNo(msisdnNo);
			filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshMsisdnNoFilter,
					msisdnNo);

		} else if (vstDMO.getVstParamsLevel().equals("S")) {

			pshDMO.setPshSimNo(simNo);
			pshDMO.setPshMsisdnNo("");//
			filter.add(FilterOp.EQUAL, PshParamServHdrDMO.pshSimNoFilter, simNo);

		}

		filter.add(FilterOp.ORDERBYDESC, PshParamServHdrDMO.pshIdFilter);

		DAOIterator existPshIT = null;

		try {
			existPshIT = base.pshParamServHdr().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting PSH: Exception: " + e);
			// return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting PSH: Exception: " + e);
			// return null;
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting PSH: Exception: " + e);
			// return null;
		}

		if (existPshIT.hasNext()) {
			while (existPshIT.hasNext()) {
				pshExistDMO = (PshParamServHdrDMO) existPshIT.next();

				if (pshExistDMO == null) {
					continue;
				} else {

					if (pshExistDMO.getPshId() == null) {
						continue;
					} else {
						break;
					}
				}
			}
		}

		logger.debug("PSH RECORD: " + pshExistDMO);

		if (pshExistDMO == null || pshExistDMO.getPshId() == null) {

			logger.debug("PSH RECORD NOT FOUND: INSERT NEW RECORD");

			try {
				pshDMO = base.pshParamServHdr().create(pshDMO);
			} catch (EPPIXBusinessException e) {
				logger.error("Exception inserting new record into PSH: Exception: "
						+ e);
				// return null;
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception inserting new record into PSH: Exception: "
						+ e);
				// return null;
			} catch (EPPIXFatalException e) {
				logger.error("Exception inserting new record into PSH: Exception: "
						+ e);
				// return null;
			}
		} else {
			logger.debug("PSH RECORD FOUND: ID: " + pshExistDMO.getPshId());
			this.pshDMO = pshExistDMO;
		}

		if (this.pshDMO == null) {
			logger.error("Cannot continue: PSH record does not exist and insert also failed for new record.");
			throw new EPPIXSeriousException("1",
					"Cannot continue: PSH record for subscriber does not exist. Subscriber: "
							+ subscriberId);
		}

		try {
			existPshIT.close();
		} catch (EPPIXSeriousException e2) {
			logger.equals("Failed to close existPsdIT: " + e2.getMessage());
		}

		com.eppixcomm.eppix.base.blo.PsdParamServDetDMO psdDMO = new com.eppixcomm.eppix.base.blo.PsdParamServDetDMO();

		psdDMO.setPsdSerialId(new Integer(0));
		psdDMO.setPsdPshId(pshDMO.getPshId());
		psdDMO.setPsdParamId(new Integer(paramId));
		psdDMO.setPsdActDate(actDate);
		psdDMO.setPsdTermDate(termDate);
		psdDMO.setPsdParamValue(paramValue);
		psdDMO.setPsdN2nString(n2nString);
		psdDMO.setPsdParamActive(paramActive);
		psdDMO.setPsdDeacDate(deacDate);
		psdDMO.setPsdSubCharge(spvDMO.getSpvChargeCode());

		/**
		 * SJ: Added switch between rands and cents defect 76669 07-04-2016
		 */

		SysdirmDMO sysdirm = null;

		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SysdirmDMO.systemKeyFilter, "SSRSUBRAND");

		try {
			sysdirm = base.sysdirm().get(filter);
		} catch (EPPIXBusinessException e1) {
			logger.error("Failed to get key SSRSUBRAND from sysdirm"
					+ e1.getMessage());
		} catch (EPPIXUnexpectedException e1) {
			logger.error("Failed to get key SSRSUBRAND from sysdirm"
					+ e1.getMessage());
		} catch (EPPIXFatalException e1) {
			logger.error("Failed to get key SSRSUBRAND from sysdirm"
					+ e1.getMessage());
		}

		if (sysdirm == null) {
			// we assume the switch is not active
			logger.error("Failed to get key SSRSUBRAND from sysdirm");
			isRandSubCharge = false;
		} else {
			if (sysdirm.getKeyValue().equals("Y")) {
				isRandSubCharge = true;
			} else {
				isRandSubCharge = false;
			}
		}

		if (isSubChargeTUTD) {
			psdDMO.setPsdChgValue(new Double(charge.doubleValue()));
		} else {
			psdDMO.setPsdChgValue(new Double("0.00"));
		}

		try {
			psdDMO = base.psdParamServDet().create(psdDMO);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to insert new record into PSD: Exception: "
					+ e);

		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to insert new record into PSD: Exception: "
					+ e);

		} catch (EPPIXFatalException e) {
			logger.error("Failed to insert new record into PSD: Exception: "
					+ e);

		}

		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, PsdParamServDetDMO.psdParamIdFilter, paramId);
		filter.add(FilterOp.EQUAL, PsdParamServDetDMO.psdPshIdFilter,
				pshDMO.getPshId());

		/**
		 * SJ: Added to get the record before deleting it, we need serial number
		 * for prorata
		 */

		try {
			psdDMO = base.psdParamServDet().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception Getting PSD for ParamId: " + paramId
					+ " and psdPshId: " + pshDMO.getPshId() + " " + e);
			return;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception Getting PSD for ParamId: " + paramId
					+ " and psdPshId: " + pshDMO.getPshId() + " " + e);
			return;
		} catch (EPPIXFatalException e) {
			logger.error("Exception Getting PSD for ParamId: " + paramId
					+ " and psdPshId: " + pshDMO.getPshId() + " " + e);
			return;
		}

	}

	public void getSpvParamValues(String netWrkCode, Integer paramId,
			String paramValue) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();

		if (netWrkCode != null && netWrkCode.length() > 0) {
			filter.add(FilterOp.EQUAL, SpvParamValuesDMO.spvNetwrkCodeFilter,
					netWrkCode);
		}

		if (paramValue != null && paramValue.length() > 0) {

			filter.add(FilterOp.EQUAL, SpvParamValuesDMO.spvParamIdFilter,
					paramId);

			filter.add(FilterOp.EQUAL, SpvParamValuesDMO.spvParamValueFilter,
					paramValue);
		}

		try {
			this.spvDMO = this.base.spvParamValues().get(filter);

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		}
	}

	public void getSpcByServiceCode(String serviceCode) {

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcServiceCodeFilter,
				serviceCode);

		try {
			this.spcDMO = this.base.spcParamConfig().get(filter);

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SPC for SERVICE CODE: " + serviceCode);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SPC for SERVICE CODE: " + serviceCode);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SPC for SERVICE CODE: " + serviceCode);
		}
	}

	public OpservmDMO getOpservm(String serviceCode) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, OpservmDMO.productFilter, serviceCode);
		OpservmDMO opsDmo = null;

		try {
			opsDmo = base.opservm().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting OpservM record for ServiceCode: "
					+ serviceCode + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting OpservM record for ServiceCode: "
					+ serviceCode + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting OpservM record for ServiceCode: "
					+ serviceCode + " EXCEPTION: " + e);
		}
		return opsDmo;
	}

	private DAOIterator getTtTypeText() {
		/**
		 * Change to get all specified service type
		 */

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, "EXCSERVTRN");
		// filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, serviceType);
		DAOIterator ttIt = null;

		try {
			ttIt = base.ttTypeText().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting TT_Type_Text record for group: EXCSERVTRN EXCEPTION: "
					+ e);
		}

		return ttIt;
	}

	private SksKeySettingDMO getSks() {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter,
				"IGNORESPUL");
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting Sks_Key_setting record for Code: IGNORESPUL  EXCEPTION: "
					+ e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting Sks_Key_setting record for Code: IGNORESPUL  EXCEPTION: "
					+ e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting Sks_Key_setting record for Code: IGNORESPUL  EXCEPTION: "
					+ e);
		}

		return sksDmo;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

}
