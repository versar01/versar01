package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.ServiceDiscount;
import com.eppixcomm.eppix.base.utils.CustomerCharges;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;

public class GetSULMaxUsageAllowedBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(GetSULMaxUsageAllowedBLO.class);
	private Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
	private Connection connection;
	public GetSULMaxUsageAllowedDAC maxUsageAllowedDAC;
	private GetServiceDiscount discountService;
	private SubscriberUpgradeMigrade subscriberServices;
	public BigDecimal totalAccountSPUL = new BigDecimal("0.00");
	public BigDecimal totalMaxAllowed = new BigDecimal("0.00");

	@Override
	protected Class<GetSULMaxUsageAllowedDAC> getDACClass() {
		return GetSULMaxUsageAllowedDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.maxUsageAllowedDAC = (GetSULMaxUsageAllowedDAC) dac;
	}

	public GetSULMaxUsageAllowedBLO() throws EPPIXSeriousException {
		super();
	}

	public void initiatedServices() throws EPPIXSeriousException {

		try {
			discountService = this.base.getServiceDiscount();
			discountService.setBase(this.base);
			discountService.setConnection(this.connection);

			subscriberServices = this.base.subscriberUpgradeMigrade();
			subscriberServices.setBase(this.base);
			subscriberServices.setConnection(this.connection);
		} catch (EPPIXFatalException e) {
			StringWriter stack = new StringWriter();
			e.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
		}

		if (discountService == null) {
			logger.error("\nCould not initiate discount objects");
			try {
				thrower.fatal(this.BASE_000301,
						"Could not initiate discount objects");
			} catch (EPPIXFatalException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		if (subscriberServices == null) {
			logger.error("\nCould not initiate subscriber services objects");
			try {
				thrower.fatal(this.BASE_000301,
						"Could not initiate subscriber service objects");
			} catch (EPPIXFatalException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

	}

	public boolean getMaxSulAllowed(Integer subscriberId, String serviceCode,
			BigDecimal charges) throws EPPIXSeriousException {
		// #------------------------------------------------------------------------------#
		// # Purpose : Selects data according to the subscriber or Msisdn no #
		// # Accepts : p_subscriber_id : Subscriber ID #
		// # p_service_code : Service Code #
		// # Returns : l_act_allow : Boolean (SMALLINT) #
		// #------------------------------------------------------------------------------#
		// FUNCTION Get_SULMaxUsage_Allowed(p_subscriber_id,p_service_code,
		// p_charges)
		// DEFINE
		// -- Parameter variable(s)
		// p_subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id,
		// p_service_code LIKE ts_tariff_service.ts_service_code,
		// p_charges LIKE chg_charges.chg_value,
		// -- Function variable(s)
		// l_sbd RECORD LIKE sbd_sub_dets.*,
		// l_sul RECORD LIKE sul_sub_use_limit.*,
		// l_total_chg LIKE chg_charges.chg_value,
		// l_function CHAR(50),
		// l_error_text CHAR(200),
		// l_total_sul DECIMAL(16,2),
		// l_max_allowed DECIMAL(16,2),
		// l_total_charges LIKE chg_charges.chg_value,
		// l_act_allow SMALLINT,
		// l_chg1 LIKE chg_charges.chg_value,
		// l_chg2 LIKE chg_charges.chg_value,
		// l_chg3 LIKE chg_charges.chg_value,
		// l_chg RECORD LIKE chg_charges.*,
		// l_ts RECORD LIKE ts_tariff_service.*,
		// l_eh RECORD LIKE eh_eppix_hierarchy.*,
		// l_sc RECORD LIKE sc_serial_customer.*,
		// l_hh RECORD LIKE hh_hierarchy_head.*,
		// l_vat_rate float,
		// l_charges RECORD LIKE chg_charges.*,
		// l_service_discount FLOAT,
		// l_spul FLOAT,
		// l_total_spuls FLOAT
		//
		// LET l_function = " :Get_SULMaxUsage_Allowed()"
		// CALL DebugStart("Get_SULMaxU")
		// CALL debuglog("Get_SULMaxUsage_Allowed Starts")
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_service_discount = 0
		// LET l_total_chg = 0.00
		// LET l_total_sul = 0.00
		// LET l_spul = 0.00
		// LET g_status_class = 0
		// LET l_max_allowed = 0.00
		// LET l_total_charges = 0.00
		// LET l_act_allow = 1

		//
		SbdSubDetsDMO sbdDMO = null;
		Object[] objScEhHH = null;
		EhHhDQO ehhhdqo = null;
		Integer ehSerial = null;
		ServiceDiscount servDiscount = null;
		BigDecimal serviceDiscount = new BigDecimal("0.00");
		BigDecimal totalCharges = new BigDecimal("0.00");
		BigDecimal totalSul = new BigDecimal("0.00");
		TsTariffServiceDMO tsDMO = null;
		ChgChargesDMO chgDMO = null;
		boolean actAllow = false;

		thrower.ifParameterMissing("subscriberId", subscriberId);
		thrower.ifParameterMissing("serviceCode", serviceCode);

		// INITIALIZE l_sbd.*,l_sul.*,l_chg.*,l_chg1,l_chg2,l_chg3, l_charges,
		// l_eh.*, l_sc.*, l_hh.* TO NULL
		// WHILE TRUE
		// CALL error_reset()
		// CASE
		// WHEN (p_subscriber_id IS NULL)
		// LET l_error_text = "Mandatory parameter p_subscriber_id is NULL"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		//
		// WHEN LENGTH(p_service_code) = 0
		// LET l_error_text = "Mandatory parameter p_service_code is NULL"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		//
		// END CASE
		//
		// LET l_error_text = "p_subscriber_id: ", p_subscriber_id
		// CALL debuglog(l_error_text)
		// LET l_error_text = "p_service_code: ",p_service_code
		// CALL debuglog(l_error_text)
		//
		// #First get the legal entity
		// CALL d_sbd_get(p_subscriber_id) RETURNING l_sbd.*
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		try {
			sbdDMO = this.getSbd(subscriberId);
		} catch (EPPIXSeriousException e1) {
			logger.error(e1.getMessage());

			try {
				thrower.business(this.Base_SBDSUBDETS_000, subscriberId);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		// CALL d_sc_eh_hh_get("",l_sbd.sbd_bill_ac_no, "COMPANY", "ACCOUNT")
		// RETURNING l_sc.*, l_eh.*, l_hh.*
		// IF g_status_class != 0 THEN
		// CALL Error_Reset()
		// LET l_hh.hh_serial = 0
		// END IF

		try {
			objScEhHH = subscriberServices.getScEhHH(null,
					sbdDMO.getSbdBillAcNo(), "COMPANY", "ACCOUNT");

			if (objScEhHH != null) {
				ehhhdqo = (EhHhDQO) objScEhHH[1];
				ehSerial = ehhhdqo.getEhSerial();
			}
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		//
		// CALL d_servicediscount_get (p_subscriber_id, l_hh.hh_serial,
		// l_sbd.sbd_package_code, l_sbd.sbd_tariff_plan, p_service_code, "N" )
		// RETURNING l_service_discount
		// IF g_status_class != 0 THEN
		// CALL Error_REset()
		// LET l_service_discount = 0
		// END IF

		//
		servDiscount = discountService.getCustomerServiceDiscount(subscriberId,
				ehSerial, sbdDMO.getSbdPackageCode(),
				sbdDMO.getSbdTariffPlan(), serviceCode, null);
		// #Get VAT
		/**
		 * VAT already calculated in the discount objects.
		 */

		serviceDiscount = servDiscount.getTotalDiscount();
		// CALL Systemkey_Get("OPVATRATE") RETURNING l_vat_rate
		// LET l_service_discount = l_service_discount * (1 + (l_vat_rate/100))

		//
		// --Get Max Usage Allowed without the added service
		// CALL Get_MaxUsage_Allowed(p_subscriber_id) returning l_max_allowed,
		// l_total_spuls
		this.getMaxUsageAllowed(sbdDMO);
		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF

		if (this.totalMaxAllowed == null) {
			this.totalMaxAllowed = new BigDecimal("0.00");
		}

		if (this.totalAccountSPUL == null) {
			this.totalAccountSPUL = new BigDecimal("0.00");
		}

		//
		// --Get all the subscribers with SUL services and their current SUL
		// Value
		// #--< SLJM: 08/09/2015 - Should be using BLH to get SUL value - Build
		// 139
		// #-- SLJM: SELECT SUM(sul_value)
		// #-- SLJM: INTO l_total_sul
		// #-- SLJM: FROM sul_sub_use_limit
		// #-- SLJM: WHERE sul_subscriber_id = p_subscriber_id
		//
		// SELECT SUM(blh_bill_limit_val)
		// INTO l_total_sul
		// FROM blh_bill_limit_hd
		// WHERE blh_subscriber_id = p_subscriber_id
		// AND blh_service_code = 'SUL'
		// #--> SLJM: 08/09/2015
		totalSul = this.maxUsageAllowedDAC.getSumSulBySubscriber(subscriberId);
		//
		// LET l_error_text = "l_total_sul = ",l_total_sul
		// CALL debuglog(l_error_text)
		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// --Get the charge for the service code passed (if any)
		// CALL
		// d_ts_get(l_sbd.sbd_package_code,p_service_code,l_sbd.sbd_tariff_plan)
		// RETURNING l_ts.*
		tsDMO = this.maxUsageAllowedDAC.getTsTariffService(
				sbdDMO.getSbdPackageCode(), serviceCode,
				sbdDMO.getSbdTariffPlan());
		// LET l_error_text = "Searching for charge codes from ts table"
		// CALL debuglog(l_error_text)
		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		if (tsDMO == null) {
			logger.error("Failed to get TS record for package code: "
					+ sbdDMO.getSbdPackageCode() + " service code: "
					+ serviceCode + " tariff code: "
					+ sbdDMO.getSbdTariffPlan());
			try {
				thrower.business(this.Base_TSTARIFFSERVICE_002,
						new Object[] { sbdDMO.getSbdPackageCode(), serviceCode,
								sbdDMO.getSbdTariffPlan() });
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(),
						e.getMessage());
			}
		}

		//
		// LET l_error_text = "Found ts record"
		// CALL debuglog(l_error_text)
		// IF LENGTH(l_ts.ts_sub_charge1) > 0 THEN
		chgDMO = null;
		if (tsDMO.getTsSubCharge1() != null
				&& tsDMO.getTsSubCharge1().length() > 0) {
			// CALL chg_get(l_ts.ts_sub_charge1, "M1", TODAY, "", "F")RETURNING
			// l_charges.*
			// IF g_status_class = 0 THEN
			// LET l_total_charges = l_charges.chg_value
			// LET l_error_text = "l_total_charges-1: ",l_total_charges
			// CALL debuglog(l_error_text)
			chgDMO = discountService.getChg(tsDMO.getTsSubCharge1(), "M1",
					new Date(), null, "F");
			logger.debug("\nsubcharge1: " + tsDMO.getTsSubCharge1() + " chg: "
					+ chgDMO);

			if (chgDMO != null) {
				totalCharges = totalCharges
						.add((chgDMO.getChgValue() == null) ? new BigDecimal(
								"0.00") : chgDMO.getChgValue());
			}
			// ELSE
			// CALL error_reset()
			// END IF
			// END IF
		}
		//
		chgDMO = null;
		// IF LENGTH(l_ts.ts_sub_charge2) > 0 THEN
		if (tsDMO.getTsSubCharge2() != null
				&& tsDMO.getTsSubCharge2().length() > 0) {
			// INITIALIZE l_charges.* TO NULL
			// CALL chg_get(l_ts.ts_sub_charge2, "M1", TODAY, "", "F")RETURNING
			// l_charges.*
			// IF g_status_class = 0 THEN
			// LET l_total_charges = l_total_charges + l_charges.chg_value
			// LET l_error_text = "l_total_charges-2: ",l_total_charges
			// CALL debuglog(l_error_text)
			chgDMO = discountService.getChg(tsDMO.getTsSubCharge2(), "M1",
					new Date(), null, "F");
			logger.debug("\nsubcharge2: " + tsDMO.getTsSubCharge2() + " chg: "
					+ chgDMO);

			if (chgDMO != null) {
				totalCharges = totalCharges
						.add((chgDMO.getChgValue() == null) ? new BigDecimal(
								"0.00") : chgDMO.getChgValue());
			}
			// ELSE
			// CALL error_reset()
			// END IF
			// END IF
		}
		//
		chgDMO = null;
		// IF LENGTH(l_ts.ts_sub_charge3) > 0 THEN
		if (tsDMO.getTsSubCharge3() != null
				&& tsDMO.getTsSubCharge3().length() > 0) {
			// INITIALIZE l_charges.* TO NULL
			// CALL chg_get(l_ts.ts_sub_charge3, "M1", TODAY, "", "F")RETURNING
			// l_charges.*
			// IF g_status_class = 0 THEN
			// LET l_total_charges = l_total_charges + l_charges.chg_value
			// LET l_error_text = "l_total_charges-3: ",l_total_charges
			// CALL debuglog(l_error_text)
			chgDMO = discountService.getChg(tsDMO.getTsSubCharge3(), "M1",
					new Date(), null, "F");
			logger.debug("\nsubcharge3: " + tsDMO.getTsSubCharge3() + " chg: "
					+ chgDMO);

			if (chgDMO != null) {
				totalCharges = totalCharges
						.add((chgDMO.getChgValue() == null) ? new BigDecimal(
								"0.00") : chgDMO.getChgValue());
			}
			// ELSE
			// CALL error_reset()
			// END IF
			// END IF
		}

		logger.debug("\nTotal Charge: "
				+ totalCharges.setScale(2, RoundingMode.HALF_UP));
		// LET l_error_text = "l_total_charges: ",l_total_charges
		// CALL debuglog(l_error_text)
		// IF l_total_charges = 0.00 then
		// LET l_act_allow = 0
		// -- EXIT WHILE
		// END IF
		if (totalCharges.intValue() == 0) {
			actAllow = true;
		}
		//
		//
		// #remove that discount the subscriber is likely to get
		if (serviceDiscount.intValue() < 0) {
			// IF (l_service_discount < 0) THEN
			// LET l_total_charges = l_total_charges + l_service_discount
			totalCharges = totalCharges.add(serviceDiscount);
			// ELSE
		} else {
			// LET l_total_charges = l_total_charges - l_service_discount
			totalCharges = totalCharges.subtract(serviceDiscount);
			// END IF
		}

		subscriberServices.alfCheck();

		if (subscriberServices.alfCheck) {
			// IF ALF_Check() THEN --NSM System Key is true
			// IF p_charges > 0 THEN
			if (charges != null && charges.intValue() > 0) {
				// IF (l_total_charges < 0) THEN
				if (totalCharges.intValue() < 0) {
					// LET l_total_charges = p_charges + l_service_discount
					totalCharges = charges.add(serviceDiscount);
					// ELSE
				} else {
					// LET l_total_charges = p_charges - l_service_discount
					totalCharges = charges.subtract(serviceDiscount);
					// END IF
				}
				// END IF
			}
			// LET l_max_allowed = l_max_allowed - l_total_charges
			totalMaxAllowed = totalMaxAllowed.subtract(totalCharges);
			// ELSE
		} else {
			// --PM 03/07/13 - Need to add the current subscriber's SUL back to
			// the MA for service activations
			// LET l_max_allowed = l_max_allowed - l_total_sul
			totalMaxAllowed = totalMaxAllowed.subtract(totalSul);
			// END IF
		}
		//
		// let l_error_text = "Total charges ", l_total_charges
		// call debuglog(l_error_text)
		// let l_error_text = "Max Allowed ", l_max_allowed
		// call debuglog(l_error_text)
		// let l_error_text = "total Spul ", l_total_spuls
		// call debuglog(l_error_text)
		logger.debug("\bTotal Charges: " + totalCharges + "\nMAX ALLOWED: "
				+ totalMaxAllowed + "\nTotAL SUL: " + totalSul);

		// --PM 04/05/2016 Allow if no charge on the service
		if (totalCharges.intValue() < 0) {
			// IF l_total_charges > 0 then
			if (totalSul.intValue() > totalMaxAllowed.intValue()) {
				// IF l_total_spuls > l_max_allowed THEN
				// LET l_error_text = "l_total_spuls > l_max_allowed true"
				// CALL debuglog(l_error_text)
				// LET l_act_allow = 1
				actAllow = false;
				// ELSE
			} else {
				// LET l_error_text = "l_total_spuls > l_max_allowed else"
				// CALL debuglog(l_error_text)
				// LET l_act_allow = 0
				actAllow = true;
				// END IF
			}
			// ELSE
		} else {

			// LET l_act_allow = 0
			actAllow = true;
			// END IF
		}
		//
		// EXIT WHILE
		// END WHILE
		// LET l_error_text = "l_act_allow: ",l_act_allow
		// CALL debuglog(l_error_text)
		// RETURN l_act_allow
		// END FUNCTION
		return actAllow;
	}
	
	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose : Selects data according to the subscriber or Msisdn no
	 * # # Accepts : p_subscriber_id : Subscriber ID # # Returns : l_max_allowed
	 * : Float #
	 * #----------------------------------------------------------------
	 * --------------#
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void getMaxUsageAllowed(SbdSubDetsDMO sbdDmo)
			throws EPPIXSeriousException {
		//
		// FUNCTION Get_MaxUsage_Allowed(p_subscriber_id)
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id,
		//
		// -- Function variable(s)
		// l_sbd RECORD LIKE sbd_sub_dets.*,
		// l_sul RECORD LIKE sul_sub_use_limit.*,
		// l_blh RECORD LIKE blh_bill_limit_hd.*,
		// l_blh1 RECORD LIKE blh_bill_limit_hd.*,
		// l_total_chg LIKE chg_charges.chg_value,
		// l_function CHAR(50),
		// l_sql CHAR(500),
		// l_error_text CHAR(200),
		// l_credit_limit LIKE slcustm.credit_limit,
		// l_total_sul FLOAT,
		// l_current_sul FLOAT,
		// l_total_max_allowed FLOAT,
		// l_chg RECORD LIKE chg_charges.*,
		// l_bill_ac_no CHAR(8),
		// l_vas RECORD LIKE vas_active_service.*,
		// l_tt RECORD LIKE tt_type_text.*,
		// l_service_code CHAR(5),
		// l_tt_type CHAR(5),
		// l_sql1 CHAR(500),
		// l_sql2 CHAR(500),
		// l_net_id LIKE chg_charges.chg_netid,
		// l_param_value FLOAT,
		// l_billed_charges FLOAT,
		// l_unbilled_charges FLOAT,
		// l_total_spuls FLOAT,
		// l_parameterised CHAR(1),
		// l_psh RECORD LIKE psh_param_serv_hdr.*,
		// l_psd RECORD LIKE psd_param_serv_det.*,
		// l_charges RECORD LIKE chg_charges.*,
		// l_crb RECORD LIKE crb_cust_risk_bal.*,
		// l_crba RECORD LIKE crba_cust_risk_aux.*,
		// l_psd_charge_code LIKE chg_charges.chg_code,
		// l_psh_serv_type LIKE psh_param_serv_hdr.psh_service_type,
		// l_psd_chg_value LIKE psd_param_serv_det.psd_chg_value,
		// l_unbilled_discount float,
		// l_usage_record RECORD
		// SubId integer,
		// ServiceCode1 char(5),
		// SPUL_Value float,
		// ServiceCode2 char(5),
		// SUL_Value float,
		// Sum_recurr float,
		// Sum_usage float,
		// sul_type char(1),
		// Sul_start_date char(10),
		// sul_end_date char(10)
		// END RECORD
		//
		// CALL BeginTransaction ("Get_MaxUsage_Allowed")
		// LET l_function = " :Get_MaxUsage_Allowed()"
		//
		// CALL DebugStart("MaxUsageAll")
		// CALL DebugLog("Get_MaxUsage_Allowed ")
		// CALL DebugLog(p_subscriber_id)
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_total_chg = 0.00
		// LET l_total_sul = 0.00
		// LET l_total_max_allowed = 0.00
		// LET l_credit_limit = 0.00
		// LET l_param_value = 0.00
		// LET g_status_class = 0
		// LET l_total_spuls = 0
		BigDecimal totalAccountSUL = new BigDecimal("0.00");
		BigDecimal currentSul = new BigDecimal("0.00");
		BigDecimal creditLimit = new BigDecimal("0.00");
		;
		BigDecimal subscriptionParamCharges = new BigDecimal("0.00");
		BigDecimal subscriptionCharges = new BigDecimal("0.00");
		BigDecimal unbilledCharges = new BigDecimal("0.00");
		BigDecimal unbilledDiscount = new BigDecimal("0.00");
		DAOIterator vasList = null;
		DAOIterator pshpsdList = null;
		TtTypeTextDMO ttDmo = null;
		StringDMO vstParamterised = null;
		PshParamServHdrDMO pshDmo = null;
		ChgChargesDMO chgDmo = null;
		BlhBillLimitHdDMO blhDmo = null;
		//
		// INITIALIZE l_tt.*,l_crb.*,
		// l_usage_record.*,l_sbd.*,l_sul.*,l_chg.*,l_blh.*,l_blh1.*,
		// l_sql1,l_sql2,l_parameterised TO NULL
		//
		// WHILE TRUE
		//
		// CASE
		// WHEN (p_subscriber_id IS NULL)
		// LET l_error_text = "Mandatory parameter p_subscriber_id is NULL"
		// CALL Error_SeriousError(l_error_text, l_function)
		// END CASE
		//
		// CALL DebugLog("p_subscriber_id passed is : ")
		// CALL DebugLog(p_subscriber_id)
		//
		// --Get subscriber account info
		// SELECT sbd_bill_ac_no
		// INTO l_bill_ac_no
		// FROM sbd_sub_dets
		// WHERE sbd_subscriber_id = p_subscriber_id
		//
		// LET l_error_text = "l_bill_ac_no = ",l_bill_ac_no
		// CALL DebugLog(l_error_text)
		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// #--< SLJM: 08/09/2015 - Use BLH instead of SUL table
		// #-- SLJM: SELECT SUM(sul_value)
		// #-- SLJM: INTO l_total_sul
		// #-- SLJM: FROM sul_sub_use_limit, sbd_sub_dets
		// #-- SLJM: WHERE sul_subscriber_id = sbd_subscriber_id
		// #-- SLJM: AND sbd_bill_ac_no = l_bill_ac_no
		// SELECT SUM(blh_bill_limit_val)
		// INTO l_total_sul
		// FROM blh_bill_limit_hd,sbd_sub_dets
		// WHERE blh_subscriber_id = sbd_subscriber_id
		// AND blh_service_code = 'SUL'
		// AND sbd_bill_ac_no = l_bill_ac_no
		// #--> SLJM: 08/09/2015

		totalAccountSUL = this.maxUsageAllowedDAC.getSumSulByAccount(sbdDmo
				.getSbdBillAcNo());

		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// SELECT NVL((crb_unbill_charges + crb_unbill_calls), 0)
		// INTO l_total_chg
		// FROM crb_cust_risk_bal
		// WHERE crb_bill_ac_no = l_bill_ac_no
		subscriptionCharges = this.maxUsageAllowedDAC
				.getCrbUnbillCharges(sbdDmo.getSbdBillAcNo());

		//
		// IF g_status_class != 0 THEN
		// LET l_total_chg = 0
		// END IF
		//
		// CALL DebugLog("l_total_chg")
		// CALL DebugLog(l_total_chg)
		//
		// #SAM
		// SELECT credit_limit
		// INTO l_credit_limit
		// FROM slcustm
		// WHERE customer = l_bill_ac_no
		creditLimit = this.maxUsageAllowedDAC.getAccountCreditLimit(sbdDmo
				.getSbdBillAcNo());
		//
		// CALL DebugLog("l_credit_limit")
		// CALL DebugLog(l_credit_limit)
		//
		// IF g_status_class <> 0 THEN
		// CALL Error_Append ("", l_function)
		// LET l_credit_limit = 0
		// EXIT WHILE
		// END IF
		//
		// #Check for parameterised and adhoc service & charges - KA
		// LET l_sql1 = "SELECT vas_service_code",
		// " FROM vas_active_service",
		// " WHERE vas_subscriber_id = ", p_subscriber_id, ""
		// PREPARE p_vas_list FROM l_sql1
		// DECLARE c_vas_list CURSOR FOR p_vas_list
		vasList = this.maxUsageAllowedDAC.getSubscriberVasServices(sbdDmo
				.getSbdSubscriberId());

		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_sql2 = " SELECT UNIQUE 1 ",
		// " FROM tt_type_text ",
		// " WHERE tt_group = 'ADHC_BUNDL' ",
		// " AND tt_type = ? "
		// PREPARE p_tt_list FROM l_sql2

		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// ##TUTD - Changed sql to include service type and psd_chg_value
		// LET l_sql =
		// "SELECT psh_service_type, psd_sub_charge, psd_chg_value ",
		// " FROM psh_param_serv_hdr, psd_param_serv_det ",
		// " WHERE psd_psh_id = ? ",
		// " AND psh_id = psd_psh_id ",
		// " AND psd_param_active = 'Y' "
		// PREPARE s_psd_charge FROM l_sql
		// DECLARE c_psd_charge CURSOR FOR s_psd_charge
		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_sql = "SELECT chg_netid ",
		// " FROM chg_charges ",
		// " WHERE chg_code = ? ",
		// " ORDER BY chg_effective_date DESC "
		// PREPARE s_chg_netid FROM l_sql
		// DECLARE c_chg_netid CURSOR FOR s_chg_netid
		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// -->MDM ins start 2013/10/03 12:38:48
		// LET l_sql = " SELECT vst_parameterised "
		// , "	FROM vst_service_types,vsr_service,vas_active_service "
		// , "	WHERE vst_service_type = vsr_service_type "
		// , "	AND vsr_service_code = vas_service_code "
		// , "	AND vas_service_code = ? "
		// , "	AND vas_subscriber_id = ?  "
		// PREPARE s_vst_parameterised FROM l_sql
		// DECLARE c_vst_parameterised CURSOR FOR s_vst_parameterised
		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("c_vst_parameterised", l_function)
		// EXIT WHILE
		// END IF
		//
		// IF NOT ALF_Check() THEN
		// -->MDM END 2013/10/03 12:38:48
		// OPEN c_vas_list
		if (vasList != null) {
			while (vasList.hasNext()) {
				// FOREACH c_vas_list INTO l_service_code
				StringDMO serviceCode = (StringDMO) vasList.next();

				// EXECUTE p_tt_list USING l_service_code
				ttDmo = this.getTtTypeText("ADHC_BUNDL",
						serviceCode.getString());
				//
				if (ttDmo != null && ttDmo.getTtText().length() > 0) {
					// IF SQLCA.SQLCODE = 0 THEN
					// LET l_error_text =
					// "Adhoc Service present: ",l_service_code
					// CALL DebugLog(l_error_text)
					// CONTINUE FOREACH
					// ELSE
					continue;
				} else {
					// INITIALIZE l_parameterised TO NULL
					//
					// -->MDM start 2013/10/03 12:38:48
					// OPEN c_vst_parameterised USING l_service_code,
					// p_subscriber_id
					// FOREACH c_vst_parameterised INTO l_parameterised
					// EXIT FOREACH; --run once and go
					// END FOREACH;
					// -->MDM end 2013/10/03 12:38:48
					vstParamterised = this.maxUsageAllowedDAC
							.getVstParameterised(serviceCode.getString(),
									sbdDmo.getSbdSubscriberId());
					//
					// --<MDM start 2013/10/03 12:38:48
					// {SELECT vst_parameterised
					// INTO l_parameterised
					// FROM vst_service_types,vsr_service,vas_active_service
					// WHERE vst_service_type = vsr_service_type
					// AND vsr_service_code = vas_service_code
					// AND vas_service_code = l_service_code
					// AND vas_subscriber_id = p_subscriber_id}
					// --<MDM end 2013/10/03 12:38:48
					//
					// IF SQLCA.SQLCODE != 0 THEN
					// CALL Error_Append("", l_function)
					// EXIT WHILE
					// ELSE
					if ("Y".equals(vstParamterised.getString())) {
						// IF l_parameterised = "Y" THEN
						// LET l_error_text =
						// "Parameterised service code: ",l_service_code
						// CALL DebugLog(l_error_text)
						//
						// INITIALIZE l_psh.*, l_psh_serv_type,
						// l_psd_charge_code, l_psd_chg_value TO NULL
						// CALL d_psh_get(l_service_code,p_subscriber_id,"","")
						// RETURNING l_psh.*
						pshDmo = null;
						pshDmo = subscriberServices.getPsh(
								serviceCode.getString(),
								sbdDmo.getSbdSubscriberId(), null, null);
						//
						// IF LENGTH(l_psh.psh_service_code) > 0 THEN
						if (pshDmo != null) {
							if (pshDmo.getPshServiceCode() != null
									&& pshDmo.getPshServiceCode().length() > 0) {
								// #NNT - 09/09/2013 - Replaced below with
								// FOREACH for services with multiple parameters
								// {SELECT psd_sub_charge
								// INTO l_psd_charge_code
								// FROM psd_param_serv_det
								// WHERE psd_psh_id = l_psh.psh_id}
								//
								// #TUTD
								// FOREACH c_psd_charge USING l_psh.psh_id INTO
								// l_psh_serv_type, l_psd_charge_code,
								// l_psd_chg_value
								// LET l_error_text =
								// "Charge code for parameterised service: ",l_psd_charge_code
								// CALL DebugLog(l_error_text)

								pshpsdList = this.maxUsageAllowedDAC
										.getPshPsdServices(pshDmo.getPshId());
								while (pshpsdList.hasNext()) {
									PshPsdDQO pshpsdDqo = (PshPsdDQO) pshpsdList
											.next();
									// #TUTD
									// #SELF SERVICE RECURRING
									// CALL
									// d_tt_get("CHGVARPARM",l_psh_serv_type)
									// RETURNING l_tt.*
									ttDmo = this.getTtTypeText("CHGVARPARM",
											pshpsdDqo.getPshServiceType());

									if (ttDmo == null) {
										// IF g_status_class = 100 THEN
										// #CALL
										// Error_SeriousError("",l_function)
										// Call error_reset()
										// LET l_tt.tt_type = ""
										ttDmo = new TtTypeTextDMO();
										ttDmo.setTtType("");
									}
									// ELSE
									// IF g_status_class != 0 THEN
									// CALL Error_Append("",l_function)
									// END IF
									// END IF

									//
									// #SELF SERVICE RECURRING
									if (pshpsdDqo.getPshServiceType().equals(
											ttDmo.getTtType())) {
										// IF l_psh_serv_type = l_tt.tt_type
										// THEN #"VPN" EK Self Service
										// LET l_error_text =
										// "l_psd_chg_value :",l_psd_chg_value
										// CALL DebugLog(l_error_text)
										//
										// LET l_param_value = l_param_value +
										// l_psd_chg_value
										subscriptionParamCharges = subscriptionParamCharges
												.add(new BigDecimal(pshpsdDqo
														.getPsdChgValue()));
										//
										// LET l_error_text =
										// "l_param_value: ",l_param_value
										// CALL DebugLog(l_error_text)
										// ELSE
									} else {
										// INITIALIZE l_charges.*, l_net_id TO
										// NULL
										//
										// FOREACH c_chg_netid USING
										// l_psd_charge_code
										// INTO l_net_id
										// #Take 1st record and go
										// EXIT FOREACH
										// END FOREACH
										StringDMO netIdDmo = null;
										DAOIterator netList = this.maxUsageAllowedDAC
												.getChgNetId(pshpsdDqo
														.getPsdSubCharge());
										while (netList.hasNext()) {
											netIdDmo = (StringDMO) netList
													.next();
											break;
										}
										netList.close();
										netList = null;
										//
										// CALL chg_get(l_psd_charge_code,
										// l_net_id, TODAY, "", "F")RETURNING
										// l_charges.*
										chgDmo = null;
										String netid = (netIdDmo == null) ? null
												: netIdDmo.getString();
										chgDmo = subscriberServices.getChg(
												pshpsdDqo.getPsdSubCharge(),
												netid, new Date(), null, "F");

										// IF LENGTH(l_charges.chg_code) > 0
										// THEN
										if (chgDmo != null) {
											if (chgDmo.getChgCode() != null
													&& chgDmo.getChgCode()
															.length() > 0) {
												// LET l_error_text =
												// "l_charges.chg_code: ",l_charges.chg_code
												// CALL DebugLog(l_error_text)
												// LET l_error_text =
												// "l_charges.chg_value: ",l_charges.chg_value
												// CALL DebugLog(l_error_text)
												// LET l_param_value =
												// l_param_value +
												// l_charges.chg_value
												// LET l_error_text =
												// "l_param_value: ",l_param_value
												subscriptionParamCharges = subscriptionParamCharges
														.add(chgDmo
																.getChgValue());
												// CALL DebugLog(l_error_text)
												// END IF
											}
										}

										// END IF
									}
									// #TUTD
									// END FOREACH
								}
								// END IF
								// END IF
							}
						}
						// END IF
					}
					// END IF
				}
				// END FOREACH
			}
			
		}
		//
		// CLOSE c_vas_list
		if(vasList != null) {
			vasList.close();
		}
		
		
		if(pshpsdList != null) {
			pshpsdList.close();
		}
		
		//
		// LET l_error_text = "l_param_value after charge get: ",l_param_value
		// CALL DebugLog(l_error_text)
		// subscriptionCharges =
		// subscriptionCharges.add(subscriptionParamCharges);
		//
		// #---End Check for parameterised and adhoc charges - KA
		// # check customer's credit limit
		// CALL d_blh_get(p_subscriber_id, "SPUL") RETURNING l_blh.*
		try {
			blhDmo = subscriberServices.getBillLimit(sbdDmo.getSbdSubscriberId(),
					"SPUL");
		} catch (Exception e1) {
			logger.error(e1.getMessage());
		}
		//
		// IF g_status_class = 0 THEN
		// CALL DebugLog("blh_bill_limit_val-SPUL")
		// CALL DebugLog(l_blh.blh_bill_limit_val)
		//
		// ## HV REQ:4036104 Changed from < to > for move of Function after
		// updated to credit limit.
		if (blhDmo != null) {
			if (blhDmo.getBlhBillLimitVal().intValue() > creditLimit.intValue()) {
				// IF l_blh.blh_bill_limit_val > l_credit_limit THEN
				// LET l_credit_limit = l_blh.blh_bill_limit_val
				creditLimit = blhDmo.getBlhBillLimitVal();
				// END IF
			}
		}
		// ELSE
		// CALL Error_Reset()
		// END IF
		// LET l_current_sul = 0
		//
		// CALL d_blh_get(p_subscriber_id, "SUL") RETURNING l_blh1.*
		blhDmo = null;
		try {
			blhDmo = subscriberServices.getBillLimit(sbdDmo.getSbdSubscriberId(),
					"SUL");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		//
		if (blhDmo != null) {
			// IF g_status_class = 0 THEN
			// LET l_current_sul = l_blh1.blh_bill_limit_val
			currentSul = blhDmo.getBlhBillLimitVal();
			// CALL DebugLog("l_current_sul")
			// CALL DebugLog(l_current_sul)
			// ELSE
		}
		// CALL Error_Reset()
		// LET l_current_sul = 0
		// CALL DebugLog("l_current_sul")
		// CALL DebugLog(l_current_sul)
		// END IF

		// END IF
		//
		// LET l_error_text = "l_credit_limit:",
		// l_credit_limit,"l_total_chg:",l_total_chg,
		// "l_total_sul:", l_total_sul
		// CALL DebugLog(l_error_text)
		logger.error("\nCREDIT LIMIT: "
				+ creditLimit.setScale(2, RoundingMode.HALF_UP).toString()
				+ "\nTOTAL CHARGES: "
				+ subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
						.toString() + "\nTOTAL SUL"
				+ totalAccountSUL.setScale(2, RoundingMode.HALF_UP).toString());
		//
		// IF l_total_sul > 0 THEN
		if (totalAccountSUL.intValue() > 0) {
			// LET l_total_sul = l_total_sul - l_current_sul
			totalAccountSUL = totalAccountSUL.subtract(currentSul);
			// ELSE
		}
		// LET l_total_sul = 0.00
		// END IF

		//
		// LET l_error_text = "l_total_sul without current SUL:", l_total_sul
		// CALL DebugLog(l_error_text)
		// LET l_error_text = "After l_credit_limit:",
		// l_credit_limit,"l_total_chg:",l_total_chg,"l_total_sul:", l_total_sul
		// CALL DebugLog(l_error_text)
		// LET l_error_text = "Value of Parameterised services: ", l_param_value
		// CALL DebugLog(l_error_text)
		logger.error("\nTOTAL SUL WITHOUT CURRENT SUL: "
				+ totalAccountSUL.setScale(2, RoundingMode.HALF_UP).toString()
				+ "\nAFTER CREDIT LIMIT: "
				+ creditLimit.setScale(2, RoundingMode.HALF_UP).toString()
				+ "\nTOTAL CHARGES: "
				+ subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
						.toString()
				+ "TOTAL SUL: "
				+ totalAccountSUL.setScale(2, RoundingMode.HALF_UP).toString()
				+ "\nPARAM CHARGES: "
				+ subscriptionParamCharges.setScale(2, RoundingMode.HALF_UP)
						.toString());

		// LET l_total_max_allowed = 0.00
		// LET l_total_spuls = 0
		//
		// --NSM Account Limit Fix build 140
		subscriberServices.alfCheck();

		// IF ALF_Check() THEN
		if (subscriberServices.alfCheck) {
			// LET l_unbilled_charges = 0
			// -- CALL d_crb_bill_limit_get(l_bill_ac_no) RETURNING l_crb.*

			// CALL CRB_Charges(l_bill_ac_no, 0) RETURNING l_credit_limit,
			// l_billed_charges, l_unbilled_charges, l_unbilled_discount
			// IF g_status_class != 0 THEN
			// CALL Error_Reset()
			// LET l_crb.crb_unbill_charges = 0
			// END IF

			CustomerCharges custCharges = subscriberServices
					.getCrbCharges(sbdDmo);

			if (custCharges != null) {
				creditLimit = custCharges.getCreditLimit();
				unbilledCharges = custCharges.getUnbilledCharges();
				this.totalMaxAllowed = creditLimit.subtract(unbilledCharges);

				// LET l_error_text = "l_unbilled_charges: ", l_unbilled_charges
				// CALL DebugLog(l_error_text)
				// LET l_error_text = "l_credit_limit: ", l_credit_limit
				// CALL DebugLog(l_error_text)
				// LET l_error_text = "l_total_max_allowed 1: ",
				// l_total_max_allowed
				// CALL DebugLog(l_error_text)
				//
				// LET l_total_max_allowed = l_credit_limit - l_unbilled_charges
				//
				// LET l_error_text = "l_total_max_allowed: ",
				// l_total_max_allowed
				// CALL DebugLog(l_error_text)
				logger.debug("\nTOTAL MAX ALLOWED: "
						+ this.totalMaxAllowed
								.setScale(2, RoundingMode.HALF_UP));
			}
			//
			// CALL Get_AccSubSPULSum(l_bill_ac_no) RETURNING l_total_spuls
			this.totalAccountSPUL = this.maxUsageAllowedDAC
					.getSumSpulByAccount(sbdDmo.getSbdBillAcNo());

			// IF g_status_class != 0 THEN
			// LET l_total_spuls = 0
			// END IF
			// ELSE
		} else {
			// LET l_total_max_allowed = l_credit_limit --If account limit fix
			// is turned off
			this.totalMaxAllowed = creditLimit;

			// LET l_error_text = "l_total_max_allowed CLmt:",
			// l_total_max_allowed
			// CALL DebugLog(l_error_text)
			// #so that we get the discount amount
			// CALL CRB_Charges(l_bill_ac_no, 0) RETURNING l_credit_limit,
			// l_billed_charges, l_unbilled_charges, l_unbilled_discount
			CustomerCharges custCharges = subscriberServices
					.getCrbCharges(sbdDmo);

			if (custCharges != null) {
				// LET l_total_max_allowed = l_total_max_allowed - l_total_chg
				this.totalMaxAllowed = this.totalMaxAllowed
						.subtract(subscriptionCharges);
				// LET l_error_text = "l_total_max_allowed - charge:",
				// l_total_max_allowed
				// CALL DebugLog(l_error_text)
				// LET l_total_max_allowed = l_total_max_allowed - l_total_sul
				this.totalMaxAllowed = this.totalMaxAllowed
						.subtract(totalAccountSUL);
				// CALL DebugLog(l_error_text)
				// LET l_error_text = "l_total_max_allowed with all SUL:",
				// l_total_max_allowed
				// CALL DebugLog(l_error_text)
				//
				// LET l_total_max_allowed = l_total_max_allowed - l_param_value
				this.totalMaxAllowed = this.totalMaxAllowed
						.subtract(subscriptionParamCharges);
				//
				// LET l_error_text =
				// "l_total_max_allowed - Parameterised: ",l_total_max_allowed
				// CALL DebugLog(l_error_text)
			}
			// END IF
		}
		// --END Account Limit Fix
		//
		// #need to get a calculated and updated discount amount
		// CALL Calc_TotalUnbilledDiscount_Get(l_bill_ac_no,0) RETURNING
		// l_unbilled_discount
		unbilledDiscount = subscriberServices.getCrbaDiscountRiskAux(sbdDmo
				.getSbdBillAcNo());

		// IF g_status_class != 0 THEN
		// CALL Error_Reset()
		// LET l_unbilled_discount = 0
		// END IF
		// IF l_total_max_allowed < 0 then
		// LET l_total_max_allowed = 0
		// END IF
		//
		// #add the unbilled discount - build 18.8
		// #check if the unbilled discount is -ve
		// IF (l_unbilled_discount < 0 ) THEN
		if (unbilledDiscount == null) {
			// LET l_unbilled_discount = l_unbilled_discount * -1
			unbilledDiscount = new BigDecimal("0.00");
			// END IF
		} else {
			if (unbilledDiscount.intValue() < 0) {
				unbilledDiscount = unbilledDiscount.multiply(new BigDecimal(
						"-1"));
			}
		}
		// LET l_total_max_allowed = l_total_max_allowed + l_unbilled_discount
		this.totalMaxAllowed = this.totalMaxAllowed.add(unbilledDiscount);
		// LET l_error_text = "l_total_max_allowed:", l_total_max_allowed
		// CALL DebugLog(l_error_text)
		//
		// EXIT WHILE
		// END WHILE
		//
		// RETURN l_total_max_allowed, l_total_spuls
		//
		// END FUNCTION

	}

	private SbdSubDetsDMO getSbd(Integer subscriber)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		SbdSubDetsDMO sbdDmo = null;

		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriber);

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

	private TtTypeTextDMO getTtTypeText(String group, String type) {

		QueryFilter filter = new QueryFilter();
		TtTypeTextDMO ttDmo = null;
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, type);

		try {
			ttDmo = base.ttTypeText().get(filter);

			if (ttDmo == null) {
				logger.error("Failed to get TT for group: " + group
						+ " and type: " + type);
				return null;
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		}

		return ttDmo;
	}

	public BigDecimal getSULMaxUsageOnAccountAllowed(SbdSubDetsDMO sbdDMO,
			String providerId) throws EPPIXSeriousException {
		// FUNCTION Get_SULMaxUsage_on_account_Allowed(p_subscriber_id,
		// l_provider_id)
		// DEFINE
		// -- Parameter variable(s)
		// p_subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id,
		// -- Function variable(s)
		// l_sbd RECORD LIKE sbd_sub_dets.*,
		// l_sul RECORD LIKE sul_sub_use_limit.*,
		// l_total_chg LIKE chg_charges.chg_value,
		// l_function CHAR(150),
		// l_error_text CHAR(800),
		// l_total_sul FLOAT,
		// l_max_allowed FLOAT,
		// l_act_allow SMALLINT,
		// l_chg1 LIKE chg_charges.chg_value,
		// l_chg2 LIKE chg_charges.chg_value,
		// l_chg3 LIKE chg_charges.chg_value,
		// l_chg RECORD LIKE chg_charges.*,
		// l_ts RECORD LIKE ts_tariff_service.*,
		// l_charges1 RECORD LIKE chg_charges.*,
		// l_charges2 RECORD LIKE chg_charges.*,
		// l_charges3 RECORD LIKE chg_charges.*,
		// l_charges RECORD LIKE chg_charges.*,
		// l_act_level_charg FLOAT,
		// l_spul FLOAT,
		// l_total_spuls float,
		// l_sbd_id LIKE sbd_sub_dets.sbd_subscriber_id,
		// l_service_code LIKE vas_active_service.vas_service_code,
		// l_MaxAccAllow FLOAT,
		// l_sql CHAR(1000),
		// l_chg_code CHAR(3),
		// l_provider_id LIKE vsr_service.vsr_provider_id,
		// l_ts_charge_freq LIKE ts_tariff_service.ts_charge_freq-->2013/07/20
		// 09:37:45
		//
		// LET l_function = "SULMaxaccount()"
		// CALL DebugStart("Get_SULMaxU")
		//
		// CALL DebugStart("l_provider_id")
		// CALL DebugStart(l_provider_id)
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_total_chg = 0.00
		// LET l_total_sul = 0.00
		// LET l_spul = 0.00
		// LET g_status_class = 0
		// LET l_max_allowed = 0.00
		// LET l_act_allow = 1
		// LET l_act_level_charg = 0.00

		BigDecimal totalSUL = new BigDecimal("0.00");
		BigDecimal spul = new BigDecimal("0.00");
		BigDecimal maxAccAllowed = new BigDecimal("0.00");
		BigDecimal maxAllowed = new BigDecimal("0.00");
		BigDecimal totalCharges = new BigDecimal("0.00");
		BigDecimal actLevelCharge = new BigDecimal("0.00");
		boolean isActAllow;
		DAOIterator tsList = null;
		// DAOIterator pshpsdList = null;
		// TtTypeTextDMO ttDmo = null;
		// StringDMO vstParamterised = null;
		// PshParamServHdrDMO pshDmo = null;
		ChgChargesDMO chgDmo = null;
		// BlhBillLimitHdDMO blhDmo = null;
		//
		// INITIALIZE l_sbd.*,l_sul.*,l_chg.*,l_chg1,l_chg2,l_chg3,
		// l_charges1,l_charges2,l_charges3 TO NULL
		// WHILE g_status_class = 0
		// CALL error_reset()
		// CASE
		// WHEN (p_subscriber_id IS NULL) OR (p_subscriber_id = 0)
		// LET l_error_text = "Mandatory parameter p_subscriber_id is NULL"
		// CALL Error_SeriousError(l_error_text, l_function)
		//
		// END CASE
		// LET l_error_text = "p_subscriber_id: ", p_subscriber_id
		// call debuglog(l_error_text)
		//
		// --Get Max Usage Allowed without the added service
		// CALL Get_MaxUsage_Allowed(p_subscriber_id) returning l_max_allowed,
		// l_total_spuls
		this.getMaxUsageAllowed(sbdDMO);

		if (this.totalMaxAllowed == null) {
			this.totalMaxAllowed = new BigDecimal("0.00");
		}

		if (this.totalAccountSPUL == null) {
			this.totalAccountSPUL = new BigDecimal("0.00");
		}

		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		// LET l_error_text = "l_max_allowed: "
		// CALL debuglog(l_error_text)
		// CALL debuglog(l_max_allowed)
		//
		// --Get subscriber info
		// CALL sbd_get(p_subscriber_id) RETURNING l_sbd.*
		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// --Get all the subscribers with SUL services and their current SUL
		// Value
		// #--< SLJM: 08/09/2015 - Should be using BLH to get SUL value - Build
		// 139
		// #-- SLJM: SELECT SUM(sul_value)
		// #-- SLJM: INTO l_total_sul
		// #-- SLJM: FROM sul_sub_use_limit, sbd_sub_dets
		// #-- SLJM: WHERE sul_subscriber_id = sbd_subscriber_id
		// #-- SLJM: AND sbd_bill_ac_no = l_sbd.sbd_bill_ac_no
		// SELECT SUM(blh_bill_limit_val)
		// INTO l_total_sul
		// FROM blh_bill_limit_hd,
		// sbd_sub_dets
		// WHERE blh_subscriber_id = sbd_subscriber_id
		// AND blh_service_code = 'SUL'
		// AND sbd_bill_ac_no = l_sbd.sbd_bill_ac_no
		// #--> SLJM: 08/09/2015

		totalSUL = this.maxUsageAllowedDAC.getSumSulByAccount(sbdDMO
				.getSbdBillAcNo());

		if (totalSUL == null) {
			totalSUL = new BigDecimal("0.00");
		}
		//
		// LET l_error_text = "l_total_sul = ",l_total_sul
		// CALL debuglog(l_error_text)
		// -- Check for Errors
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_sql =
		// " select ts_sub_charge1, ts_charge_freq "
		// , " from ts_tariff_service "
		// , " where ts_service_code  in "
		// , " (select vas_service_code from vas_active_service "
		// , " where vas_subscriber_id in  "
		// , " (select sbd_subscriber_id from sbd_sub_dets "
		// , " where sbd_bill_ac_no = ?)) "
		// , " and ts_package_code =  ? "
		// , " and ts_internal_tariff = ? "
		// , " and (ts_sub_charge1 <> '' ) "
		//
		// PREPARE p_ts_sub_1 FROM l_sql
		// DECLARE c_ts_sub_1 cursor FOR p_ts_sub_1
		//
		// OPEN c_ts_sub_1 USING l_sbd.sbd_bill_ac_no,
		// l_sbd.sbd_package_code,
		// l_sbd.sbd_tariff_plan

		tsList = this.maxUsageAllowedDAC.getTsServiceBySubscriber(
				sbdDMO.getSbdBillAcNo(), sbdDMO.getSbdPackageCode(),
				sbdDMO.getSbdTariffPlan());
		//
		while (tsList.hasNext()) {
			TsTariffServiceDMO tsDmo = (TsTariffServiceDMO) tsList.next();

			if (tsDmo.getTsSubCharge1() != null
					&& tsDmo.getTsSubCharge1().length() > 0) {
				chgDmo = this.subscriberServices.getChg(
						tsDmo.getTsSubCharge1(), providerId, new Date(), null,
						"F");

				if (chgDmo != null) {
					actLevelCharge = actLevelCharge
							.add((chgDmo.getChgValue() == null) ? new BigDecimal(
									"0.00") : chgDmo.getChgValue());
				}
			}

			chgDmo = null;
			if (tsDmo.getTsSubCharge2() != null
					&& tsDmo.getTsSubCharge2().length() > 0) {
				chgDmo = this.subscriberServices.getChg(
						tsDmo.getTsSubCharge2(), providerId, new Date(), null,
						"F");

				if (chgDmo != null) {
					actLevelCharge = actLevelCharge
							.add((chgDmo.getChgValue() == null) ? new BigDecimal(
									"0.00") : chgDmo.getChgValue());
				}
			}
			chgDmo = null;
			if (tsDmo.getTsSubCharge3() != null
					&& tsDmo.getTsSubCharge3().length() > 0) {
				chgDmo = this.subscriberServices.getChg(
						tsDmo.getTsSubCharge2(), providerId, new Date(), null,
						"F");

				if (chgDmo != null) {
					actLevelCharge = actLevelCharge
							.add((chgDmo.getChgValue() == null) ? new BigDecimal(
									"0.00") : chgDmo.getChgValue());
				}
			}
		}

		tsList.close();
		tsList = null;
		// CLOSE c_ts_sub_1
		//
		// LET l_sql = ""
		// LET l_chg_code = ""
		//
		// LET l_sql = ""
		// LET l_chg_code = ""
		//
		// LET l_sql =
		// " select ts_sub_charge2, ts_charge_freq "
		// , " from ts_tariff_service "
		// , " where ts_service_code  in "
		// , " (select vas_service_code from vas_active_service "
		// , " where vas_subscriber_id in  "
		// , " (select sbd_subscriber_id from sbd_sub_dets "
		// , " where sbd_bill_ac_no = ?))  "
		// , " and ts_package_code =  ?    "
		// , " and ts_internal_tariff = ?  "
		// , " and (ts_sub_charge2 <> '' ) "
		//
		// prepare p_ts_sub_2 FROM l_sql
		// DECLARE c_ts_sub_2 cursor FOR p_ts_sub_2
		//
		// OPEN c_ts_sub_2 USING l_sbd.sbd_bill_ac_no,
		// l_sbd.sbd_package_code,
		// l_sbd.sbd_tariff_plan
		// FOREACH c_ts_sub_2 INTO l_chg_code, l_ts_charge_freq
		// IF sqlca.sqlcode = 100 THEN
		// CONTINUE FOREACH
		// ELSE
		// CALL chg_get(l_chg_code, l_provider_id, TODAY, "", "F")RETURNING
		// l_charges2.*
		// END IF
		// LET l_act_level_charg = l_act_level_charg + l_charges2.chg_value
		//
		// LET l_error_text = "l_chg_code", l_chg_code, "l_charges2.chg_value",
		// l_charges2.chg_value
		// CALL debuglog(l_error_text)
		// LET l_error_text = "l_act_level_charg", l_act_level_charg
		// CALL debuglog(l_error_text)
		// END FOREACH
		// CALL debuglog("end of subcharge2")
		// CLOSE c_ts_sub_2
		//
		// LET l_sql = ""
		// LET l_chg_code = ""
		//
		// LET l_sql =
		// " select ts_sub_charge3, ts_charge_freq "
		// , " from ts_tariff_service "
		// , " where ts_service_code  in "
		// , " (select vas_service_code from vas_active_service "
		// , " where vas_subscriber_id in  "
		// , " (select sbd_subscriber_id from sbd_sub_dets "
		// , " where sbd_bill_ac_no = ?)) "
		// , " and ts_package_code =  ?"
		// , " and ts_internal_tariff = ? "
		// , " and (ts_sub_charge3 <> '' )  "
		//
		// PREPARE p_ts_sub_3 FROM l_sql
		// DECLARE c_ts_sub_3 cursor FOR p_ts_sub_3
		//
		// OPEN c_ts_sub_3 USING
		// l_sbd.sbd_bill_ac_no,l_sbd.sbd_package_code,l_sbd.sbd_tariff_plan
		// FOREACH c_ts_sub_3 INTO l_chg_code, l_ts_charge_freq
		// IF sqlca.sqlcode = 100 THEN
		// CONTINUE FOREACH
		// ELSE
		// CALL chg_get(l_chg_code, l_provider_id, TODAY, "", "F")RETURNING
		// l_charges3.*
		// END IF
		//
		// LET l_act_level_charg = l_act_level_charg + l_charges3.chg_value
		// LET l_error_text = "l_chg_code", l_chg_code, "l_charges3.chg_value",
		// l_charges3.chg_value
		// CALL debuglog(l_error_text)
		// LET l_error_text = "l_act_level_charg", l_act_level_charg
		// CALL debuglog(l_error_text)
		// END FOREACH
		// -->debuglog"end of subcharge3")
		// CLOSE c_ts_sub_3
		maxAccAllowed = this.totalMaxAllowed.subtract(actLevelCharge
				.add(totalSUL));

		// LET l_MaxAccAllow = l_max_allowed - (l_act_level_charg + l_total_sul)
		// LET l_error_text = "l_max_allowed: "
		// CALL debuglog(l_error_text)
		// CALL debuglog(l_MaxAccAllow)
		//
		// LET l_error_text = "l_total_sul: "
		//
		// CALL debuglog(l_total_sul)
		// LET l_error_text = "l_act_level_charg: "
		// CALL debuglog(l_act_level_charg)
		//
		// EXIT WHILE
		// END WHILE
		// LET l_error_text = "l_MaxAccAllow: "
		// CALL debuglog(l_error_text)
		// CALL debuglog(l_MaxAccAllow)
		// RETURN l_MaxAccAllow
		return maxAccAllowed;
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

}