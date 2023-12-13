package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.utils.CustomerCharges;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class GetCrbChargesBLO extends BaseBLO implements
DTOActionTypes, BaseMessages, ApplicationMessages {
// Globals
private static Thrower thrower = Thrower
	.getThrower(GetCrbChargesBLO.class);
private Logger logger = thrower.getLogger();
public GetCrbChargesDAC getCrbChargesDAC;
private SimpleDateFormat dtFormatyyyymmddStandard = new SimpleDateFormat(
		"yyyyMMdd");
private Connection connection;
private BaseBLOBinder base;


@Override
protected Class getDACClass() {
	return GetCrbChargesDAC.class;
}

@Override
protected void setDAC(DAC dac) {
	this.getCrbChargesDAC = (GetCrbChargesDAC)dac;
}
	
	
	public CustomerCharges getCrbCharges(SbdSubDetsDMO sbdDmo)
			throws EPPIXSeriousException {

		String billTable = null;
		BigDecimal charges = new BigDecimal("0.00");
		BigDecimal otherCharges = new BigDecimal("0.00");
		BigDecimal billedCharges = new BigDecimal("0.00");
		;
		BigDecimal unbilledCharges = new BigDecimal("0.00");
		BigDecimal creditLimit = new BigDecimal("0.00");
		BigDecimal vatPercentage = new BigDecimal("0.00");
		BcyBillingCycleDMO bcyDMO = null;
		Statement st = null;
		ResultSet rs = null;
		BigDecimal crbaValue = null;

		vatPercentage = this.getVatPercentage();

		if (vatPercentage == null) {
			logger.error("Failed to get the VAT percetntage");
			vatPercentage = new BigDecimal("0.00");
		} else {
			vatPercentage = vatPercentage.divide(new BigDecimal("100"), 2,
					RoundingMode.HALF_UP);
		}

		bcyDMO = this.getBcy (sbdDmo.getSbdBillCycle());
		billTable = "bill_" + sbdDmo.getSbdBillCycle()
				+ dtFormatyyyymmddStandard.format(bcyDMO.getBcyNextRun());

		logger.debug("\nbillTable=" + billTable);

		crbaValue = this.getCrbaDiscountRiskAux(sbdDmo.getSbdBillAcNo());

		if (crbaValue == null) {
			crbaValue = new BigDecimal("0.00");
		}

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, CrbCustRiskBalDMO.crbBillAcNoFilter,
				sbdDmo.getSbdBillAcNo());

		CrbCustRiskBalDMO crbDMO = null;

		try {
			crbDMO = base.crbCustRiskBal().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get CRB record for Bill Account No: "
					+ sbdDmo.getSbdBillAcNo());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get CRB record for Bill Account No: "
					+ sbdDmo.getSbdBillAcNo());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get CRB record for Bill Account No: "
					+ sbdDmo.getSbdBillAcNo());
		}

		if (crbDMO == null) {
			logger.error("Failed to get CRB record for Bill Account No: "
					+ sbdDmo.getSbdBillAcNo());
			crbDMO = new CrbCustRiskBalDMO();
			crbDMO.setCrbUnbillCharges(new BigDecimal("0.00"));
			crbDMO.setCrbCreditLimit(new BigDecimal("0.00"));
		}

		unbilledCharges = crbDMO.getCrbUnbillCharges();
		creditLimit = crbDMO.getCrbCreditLimit();

		String sql = "Select sbd_subscriber_id, start_period, sparech, chaserv, charge from sbd_sub_dets, vam_active_msisdn, "
				+ billTable
				+ " WHERE subscriber_id = sbd_subscriber_id"
				+ " AND subscriber_id =  vam_subscriber_id "
				+ " AND handset =  vam_msisdn_no "
				+ " AND sparech[1,3] != 'CCC' "
				+ " AND charge > 0  "
				+ " AND sbd_bill_ac_no = '" + sbdDmo.getSbdBillAcNo() + "'";

		logger.debug("\n" + sql);

		Integer subscriberId = null;
		Date startPeriod = null;
		String sparech = null;
		String chaserv = null;
		BigDecimal charge = null;

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {

				subscriberId = rs.getInt("sbd_subscriber_id");
				startPeriod = new Date(
						(rs.getDate("start_period") == null) ? null
								: rs.getDate("start_period"));
				sparech = rs.getString("sparech");
				chaserv = rs.getString("chaserv");
				charge = rs.getBigDecimal("charge");

				if (sparech != null) {
					sparech = sparech.trim();
				}

				if (chaserv != null) {
					chaserv = chaserv.trim();
				}

				logger.debug("\nsbd_subscriber_id: " + subscriberId
						+ "\nstart_period: " + startPeriod + "\nsparech: "
						+ sparech + "\nchaserv: " + chaserv + "\ncharge: "
						+ charge);

				logger.debug("\nTEST CFA" + sparech.substring(0, 3));
				logger.debug("\nstartPeriod: " + startPeriod
						+ " bcyDMO.getBcyNextRun: " + bcyDMO.getBcyNextRun());

				// IF l_start_period < l_bcy.bcy_next_run OR l_sparech[1,3] =
				// "CFA" THEN
				if (startPeriod.before(bcyDMO.getBcyNextRun())
						|| sparech.substring(0, 3).equals("CFA")) {

					logger.debug("\nIN CFA TEST: " + sparech.substring(0, 3));

					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL,
							VcfVrbleChrgFeeDMO.vcfChargeCodeFilter, chaserv);
					filter.add(FilterOp.EQUAL,
							VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter,
							subscriberId);
					filter.add(FilterOp.EQUAL,
							VcfVrbleChrgFeeDMO.vcfCustomerFilter, sbdDmo
									.getSbdBillAcNo().trim());
					filter.add(FilterOp.EQUAL,
							VcfVrbleChrgFeeDMO.vcfStatusFilter, "A");

					Integer count = null;

					try {
						count = base.vcfVrbleChrgFee().count(filter);
					} catch (EPPIXBusinessException e) {
						logger.error(e.getMessage());
					} catch (EPPIXUnexpectedException e) {
						logger.error(e.getMessage());
					} catch (EPPIXFatalException e) {
						logger.error(e.getMessage());
					}

					logger.debug("\nCOUNT VCF VARIABLE CHARGES FOR " + chaserv
							+ " COUNT:  " + count);

					if (count == null || count.intValue() == 0) {
						if (charge != null && charge.intValue() > 0) {

							logger.debug("\nCHARGED TO ADD TO OTHER CHARGES: "
									+ charge);

							if (otherCharges == null) {
								otherCharges = charge;
							} else {
								otherCharges = otherCharges.add(charge);
							}
						}
					}
				}
			}

		} catch (SQLException e) {

			logger.error("Exception getting billing charges for account: "
					+ sbdDmo.getSbdBillAcNo() + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception getting billing charges for account: "
							+ sbdDmo.getSbdBillAcNo() + " EXCEPTION: " + e);
		}

		if (otherCharges == null) {
			otherCharges = new BigDecimal("0.00");
		}

		if (unbilledCharges == null) {
			unbilledCharges = new BigDecimal("0.00");
		}

		logger.debug("\notherCharges: " + otherCharges);

		unbilledCharges = unbilledCharges.subtract(otherCharges);

		logger.debug("\nBefore VAT unbilledCharges: " + unbilledCharges);
		logger.debug("\nBefore VAT DISCOUNT CHARGES: " + crbaValue);
		unbilledCharges = unbilledCharges.multiply(vatPercentage).add(
				unbilledCharges);
		
		crbaValue = crbaValue.multiply(vatPercentage).add(
				crbaValue);

		logger.debug("\nUNBILLED CHARGES + VAT: " + unbilledCharges);
		logger.debug("\nDISCOUNT CHARGES + VAT: " + crbaValue);

		CustomerCharges custCharges = new CustomerCharges();

		custCharges.setCreditLimit(creditLimit);
		custCharges.setBilledCharges(billedCharges);
		custCharges.setUnbilledCharges(unbilledCharges);
		custCharges.setDiscountValue(crbaValue);

		return custCharges;
	}

	public BigDecimal getVatPercentage() throws EPPIXSeriousException {

		QueryFilter filter = null;
		SksKeySettingDMO sksDmo = null;
		SysdirmDMO sysDMO = null;
		String vatCode = "";
		StringDMO vatRateDmo = null;
		String vatRate = "";
		BigDecimal vatPercentage = null;

		vatCode = this.getSysdirmKey("OPVATCODE");

		vatRateDmo = this.getCrbChargesDAC
				.getVatPercentageByCode(vatCode);

		if (vatRateDmo != null) {
			vatPercentage = new BigDecimal(vatRateDmo.getString());
		} else {
			throw new EPPIXSeriousException(
					"Failed to get the VAT Percentage for vat code: " + vatCode);
		}

		return vatPercentage;
	}

	public BcyBillingCycleDMO getBcy(String billingCycle)
			throws EPPIXSeriousException {

		BcyBillingCycleDMO bcyDMO = null;
		thrower.ifParameterMissing("billingCycle", billingCycle);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BcyBillingCycleDMO.bcyBillCycleFilter,
				billingCycle);

		try {
			bcyDMO = base.bcyBillingCycle().get(filter);

			if (bcyDMO == null) {
				logger.error("Billing Cycle " + billingCycle
						+ " does not exist in table bcy_billing_cycle");
				throw new EPPIXSeriousException("Billing Cycle " + billingCycle
						+ " does not exist in table bcy_billing_cycle");
			}

		} catch (EPPIXBusinessException e) {

			logger.error("Exception getting Billing Cycle " + billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
			throw new EPPIXSeriousException("Exception getting Billing Cycle "
					+ billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
		} catch (EPPIXUnexpectedException e) {

			logger.error("Exception getting Billing Cycle " + billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
			throw new EPPIXSeriousException("Exception getting Billing Cycle "
					+ billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception getting Billing Cycle " + billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
			throw new EPPIXSeriousException("Exception getting Billing Cycle "
					+ billingCycle
					+ " from table bcy_billing_cycle: Exception: " + e);
		}
		return bcyDMO;
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
	
	public BigDecimal getCrbaDiscountRiskAux(String accountNo)
			throws EPPIXSeriousException {

		BigDecimal crbaValue = null;
		CrbaCustRiskAuxDMO crbaDMO = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, CrbaCustRiskAuxDMO.crbaBillAcNoFilter,
				accountNo);

		try {
			crbaDMO = base.crbaCustRiskAux().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		}

		if (crbaDMO != null) {
			crbaValue = crbaDMO.getCrbaAccDiscVal();
		}

		return crbaValue;
	}
	
	public SbdSubDetsDMO getSbd(Integer subscriberId)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("subscriberId", subscriberId);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriberId);
		SbdSubDetsDMO sbdDmo = null;
		try {
			sbdDmo = base.sbdSubDets().get(filter);

			if (sbdDmo == null) {
				logger.error("Unable to find details for subscriber Id "
						+ subscriberId);
				throw new EPPIXSeriousException(
						"Unable to find details for subscriber Id "
								+ subscriberId);
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		}

		return sbdDmo;
	}


	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public BaseBLOBinder getBase() {
		return base;
	}

	public void setBase(BaseBLOBinder base) {
		this.base = base;
	}

}
