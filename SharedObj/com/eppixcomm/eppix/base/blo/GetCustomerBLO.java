package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.jws.WebParam;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.CustomerGetRsp;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AulAccUpLowlmtDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DccCreditClassesDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DlhDynmcLmtHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ErbEpxRskBndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivTtDqo;

public class GetCustomerBLO extends BaseBLO implements DTOActionTypes, BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower.getThrower(GetCustomerBLO.class);
	private Logger logger = thrower.getLogger();
	public GetCustomerDAC getCustomerDAC;
	private SimpleDateFormat dtFormatyyyymmddStandard = new SimpleDateFormat("yyyy-MM-dd");
	private BaseBLOBinder base;
	private Connection connection;
	private ResultSet rs = null;
	private Statement st = null;
	private SubscriberUpgradeMigrade service;
	private HeliosRpcServices helRpcService;
	private String userName;
	private String hostName;
	private String language;
	
	@Override
	protected Class getDACClass() {
		return GetCustomerDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.getCustomerDAC = (GetCustomerDAC) dac;
	}

	public CustomerGetRsp getCustomer(String billAcNo, String addressType1, String addressType2, String addressType3,
			String addressType4, String addressType5, String addressType6, String addressType7, String addressType8,
			String addressType9, String addressType10) {

		AudAddressDMO aud1DMO = null;
		AudAddressDMO aud2DMO = null;
		AudAddressDMO aud3DMO = null;
		AudAddressDMO aud4DMO = null;
		AudAddressDMO aud5DMO = null;
		AudAddressDMO aud6DMO = null;
		AudAddressDMO aud7DMO = null;
		AudAddressDMO aud8DMO = null;
		AudAddressDMO aud9DMO = null;
		AudAddressDMO aud10DMO = null;
		String inv1 = "";
		String inv2 = "";
		String inv3 = "";
		String inv4 = "";
		String inv5 = "";
		String inv6 = "";
		String inv7 = "";
		String inv8 = "";
		String inv9 = "";
		String inv10 = "";

		CustomerGetRsp response = new CustomerGetRsp();
		AulAccUpLowlmtDMO aulDmo = null;
		AuxCustomersDMO auxDmo = null;
		BigDecimal balance = null;
		BigDecimal paidDeposit = null;
		BigDecimal pendingDeposit = null;
		String lastDepositStatus = null;
		StringDMO lastDepDmo = null;
		String[] ccaDetails = null;
		DccCreditClassesDMO dccDmo = null;
		CviCrmValueIndDMO cviDmo = null;
		ScSerialCustomerDMO scDmo = null;
		EhHhDQO ehhhDQO = null;
		EhEppixHierarchyDMO	ehDmo = null;
		HhHierarchyHeadDMO	hhDmo = null;
		Integer cugSerial = null;
		Integer scSerial = new Integer(0);
		String ebuCugId = null;
		DlhDynmcLmtHdrDMO dlhDmo = null;
		SlcustmDMO slDmo = null;
		String hhName = null;
		ErbEpxRskBndDMO erbDmo = null;
		UdvUserdocDelivTtDqo udvDqo = null;

		try {
			service = base.subscriberUpgradeMigrade();
			service.setBase(this.base);
			service.setConnection(this.connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			
			logger.error("Failed to initialize GEN services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize services, fatal condition, admin to investigate");
			return response;
		}
		
		try {
			helRpcService = base.getHeliosRpcServices();
			helRpcService.setBase(this.base);
			helRpcService.setConnection(this.connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize HEL RPC services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize services, fatal condition, admin to investigate");
			return response;
		}
		

		try {
			thrower.ifParameterMissing("billAcNo", billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error("Mandatory parameter not provided: EXCEPTION: " + e);
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError(e.getMessage());
			response.setErrorCode(e.getMessageCode());
			return response;
		}

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter, billAcNo);

		try {
			slDmo = base.slcustm().get(filter);

			if (slDmo == null) {
				logger.error("Failed to get the customer details for account: " + billAcNo);
				response.setErrorType("1");
				response.setEppixStatus("0");
				response.setIsamError("Failed to get the customer details for account: " + billAcNo);
				response.setErrorCode("1");
				return response;
			}

		} catch (EPPIXBusinessException e1) {
			logger.error("Failed to get the customer details for account: " + billAcNo + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError("Failed to get the customer details for account: " + billAcNo);
			response.setErrorCode("1");
			return response;
		} catch (EPPIXUnexpectedException e1) {
			logger.error("Failed to get the customer details for account: " + billAcNo + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError("Failed to get the customer details for account: " + billAcNo);
			response.setErrorCode("1");
			return response;
		} catch (EPPIXFatalException e1) {
			logger.error("Failed to get the customer details for account: " + billAcNo + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError("Failed to get the customer details for account: " + billAcNo);
			response.setErrorCode("1");
			return response;
		}


		try {
			auxDmo = service.getAuxCustomer(billAcNo);

			if (auxDmo == null) {
				logger.error("Failed to get the customer details for account: " + billAcNo);
				response.setErrorType("1");
				response.setEppixStatus("0");
				response.setIsamError("Failed to get the customer details for account: " + billAcNo);
				response.setErrorCode("1");
				return response;
			}

		} catch (EPPIXFatalException e1) {
			logger.error("Failed to get the customer details for account: " + billAcNo + ": " + e1.getMessage());
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError("Failed to get the customer details for account: " + billAcNo);
			response.setErrorCode("1");
			return response;
		}

//		# Get the aul details...

//		CALL d_aul_get (p_bill_ac_no) RETURNING l_aul.*
// CALL DebugLog("d_aul_get")
//CALL DebugLog( g_status_class)
//		CASE

		try {
			aulDmo = this.getCustomerDAC.getAul(billAcNo);

			if (aulDmo == null) {
				logger.error("Failed to get Customer: " + billAcNo + ":  from aul_acc_up_lowlmt table");
				response.setErrorType("1");
				response.setEppixStatus("0");
				response.setIsamError("Failed to get Customer: " + billAcNo + ":  from aul_acc_up_lowlmt table");
				response.setErrorCode("1");
				return response;
			}

		} catch (EPPIXSeriousException e1) {
			logger.error("Failed to get Customer: " + billAcNo + ":  from aul_acc_up_lowlmt table" + e1.getMessage());
			response.setErrorType("1");
			response.setEppixStatus("0");
			response.setIsamError(
					"Failed to get Customer: " + billAcNo + ":  from aul_acc_up_lowlmt table" + e1.getMessage());
			response.setErrorCode("1");
			return response;
		}

//			WHEN g_status_class = 100
//
//				# Record not found in aul_acc_up_lowlmt
//
//				LET l_error_text = "Customer ", p_bill_ac_no CLIPPED,
//					" not found on aul_acc_up_lowlmt table"
//				CALL Error_NotFoundError (100000, "", l_error_text, l_function)
//				EXIT WHILE
//
//			WHEN g_status_class <> 0
//
//				CALL Error_Append ("", l_function)
//				EXIT WHILE
//
//		END CASE

//		# Retrieve the balance
//		LET l_sql = "SELECT NVL(SUM(unall_amount), 0) ",
//					"FROM slitemm ",
//					"WHERE customer = ? ",
//					"AND open_indicator = 'O' ",
//					"AND dated <= TODAY "
//
//		PREPARE sqls_open FROM l_sql
//		DECLARE curs_open CURSOR FOR sqls_open
//
//		OPEN curs_open USING p_bill_ac_no
//		FETCH curs_open INTO l_balance
//		CLOSE curs_open

		try {
			balance = this.getCustomerDAC.getAccountBalance(billAcNo);
		} catch (EPPIXSeriousException e1) {
			logger.error("Failed to get Customer: " + billAcNo + ":  balance: " + e1.getMessage());
		}

		if (balance == null) {
			logger.error("Failed to get BALANCE for Customer: " + billAcNo);
			balance = new BigDecimal("0.00");
		}

		Object[] manyAudAddressResults = new Object[10];

		try {
			manyAudAddressResults = this.service.getManyAudAddress(billAcNo, null, addressType1, addressType2,
					addressType3, addressType4, addressType5, addressType6, addressType7, addressType8, addressType9,
					addressType10);

		} catch (EPPIXSeriousException e) {
			logger.error("Exception occured getting the address details for account: " + billAcNo);
		}

		aud1DMO = (AudAddressDMO) manyAudAddressResults[0];
		inv1 = (String) manyAudAddressResults[1];
		aud2DMO = (AudAddressDMO) manyAudAddressResults[2];
		inv2 = (String) manyAudAddressResults[3];
		aud3DMO = (AudAddressDMO) manyAudAddressResults[4];
		inv3 = (String) manyAudAddressResults[5];
		aud4DMO = (AudAddressDMO) manyAudAddressResults[6];
		inv4 = (String) manyAudAddressResults[7];
		aud5DMO = (AudAddressDMO) manyAudAddressResults[8];
		inv5 = (String) manyAudAddressResults[9];
		aud6DMO = (AudAddressDMO) manyAudAddressResults[10];
		inv6 = (String) manyAudAddressResults[11];
		aud7DMO = (AudAddressDMO) manyAudAddressResults[12];
		inv7 = (String) manyAudAddressResults[13];
		aud8DMO = (AudAddressDMO) manyAudAddressResults[14];
		inv8 = (String) manyAudAddressResults[15];
		aud9DMO = (AudAddressDMO) manyAudAddressResults[16];
		inv9 = (String) manyAudAddressResults[17];
		aud10DMO = (AudAddressDMO) manyAudAddressResults[18];
		inv10 = (String) manyAudAddressResults[19];

		/*
		 * # Retrieve the 10 address records CALL aud_getmany(p_bill_ac_no, g_null,
		 * p_address_type1, p_address_type2, p_address_type3, p_address_type4,
		 * p_address_type5, p_address_type6, p_address_type7, p_address_type8,
		 * p_address_type9, p_address_type10) RETURNING l_inv_address[1], l_aud[1].*,
		 * l_inv_address[2], l_aud[2].*, l_inv_address[3], l_aud[3].*, l_inv_address[4],
		 * l_aud[4].*, l_inv_address[5], l_aud[5].*, l_inv_address[6], l_aud[6].*,
		 * l_inv_address[7], l_aud[7].*, l_inv_address[8], l_aud[8].*, l_inv_address[9],
		 * l_aud[9].*, l_inv_address[10], l_aud[10].* CALL DebugLog("aud_getmany") CALL
		 * DebugLog( g_status_class) IF g_status_class != 0 AND g_status_class !=100
		 * THEN # Problem in Address_GetMany CALL Error_Append("", l_function) EXIT
		 * WHILE ELSE IF g_status_class = 100 THEN CALL Error_Reset() END IF END IF
		 * 
		 * #---------------------------------------------------------------------# #
		 * Only raise an error when the Customer Physical Address is NOT found #
		 * #---------------------------------------------------------------------# LET
		 * l_customer_physical_address = FALSE
		 * 
		 * FOR l_i = 1 TO 10
		 * 
		 * CALL DebugLog("Address Type") CALL DebugLog(l_aud[l_i].aud_address_type)
		 * 
		 * IF l_aud[l_i].aud_address_type = "CPHY" THEN LET l_customer_physical_address
		 * = TRUE EXIT FOR END IF END FOR
		 */

//		# Only perform Credit Items for NON Prepaid Customers
//		
//		IF l_aux.aux_prepaid_stat = "CC" THEN
		if ("CC".equals(auxDmo.getAuxPrepaidStat())) {

//			-- Retrieve the credit controller..
//			CALL CreditController_GetAccount(p_bill_ac_no)
			ccaDetails = this.getCreditControllerAccount(billAcNo);
//			RETURNING l_cca.*, l_target_name
//CALL DebugLog("CreditController_GetAccount")
//CALL DebugLog( g_status_class)
//			IF g_status_class = 100 THEN
//				LET l_error_text = "Credit Controller details not found for",
//					" Account: ",p_bill_ac_no
//
//				CALL Error_BusinessError(180765, "", l_error_text, l_function)
//				EXIT WHILE
//			END IF
			if(ccaDetails == null) {
				logger.error("Credit Controller details not found for Account: " + billAcNo);
				response.setErrorType("1");
				response.setEppixStatus("0");
				response.setIsamError("Credit Controller details not found for Account: " + billAcNo);
				response.setErrorCode("180765");
				return response;
				
			}
//
//			LET l_slcustm.credit_controller = l_cca.cca_controller_id
			slDmo.setCreditController(ccaDetails[0]);
//
//			IF g_status_class != 0 THEN
//				CALL Error_Append("", l_function)
//				EXIT WHILE
//			END IF

//			-- Retrieve the credit class description..
			
			try {
				dccDmo = this.getCustomerDAC.getDccCreditClass(auxDmo.getAuxCreditClass());
				
				if(dccDmo == null) {
					logger.error("Credit Class not found on table dcc_credit_class for Class ID:  " + auxDmo.getAuxCreditClass());
					response.setErrorType("1");
					response.setEppixStatus("0");
					response.setIsamError("Credit Class not found on table dcc_credit_class for Class ID:  " + auxDmo.getAuxCreditClass());
					response.setErrorCode("180766");
					return response;
				}
				
			} catch (EPPIXSeriousException e) {
				logger.error("Credit Class not found on table dcc_credit_class for Class ID:  " + auxDmo.getAuxCreditClass() + ": "+ e.getMessage());
				response.setErrorType("1");
				response.setEppixStatus("0");
				response.setIsamError("Credit Class not found on table dcc_credit_class for Class ID:  " + auxDmo.getAuxCreditClass());
				response.setErrorCode("180766");
				return response;
			}
//			CALL d_dcc_get(l_aux.aux_credit_class) RETURNING l_dcc.*
//CALL DebugLog("d_dcc_get")
//CALL DebugLog( g_status_class)
//			IF g_status_class = 100 THEN
//				LET l_error_text = "Credit Class not found on table",
//					" dcc_credit_class for Class ID: ",
//					l_aux.aux_credit_class
//
//				CALL Error_BusinessError(180766, "", l_error_text, l_function)
//				EXIT WHILE
//			END IF
//
//			IF g_status_class != 0 THEN
//				CALL Error_Append("", l_function)
//				EXIT WHILE
//			END IF
//
//		END IF
		}

//		-- Retrieve sum of paid deposits..
		try {
			paidDeposit = this.getCustomerDAC.getCdeTotalSum(billAcNo);

		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		
		if(paidDeposit == null){
			paidDeposit = new BigDecimal("0.00");
		}
		
		
//		CALL d_cde_total_sum(p_bill_ac_no) RETURNING l_paid_deposit
// CALL DebugLog("d_cde_total_sum")
//CALL DebugLog( g_status_class)
//		IF g_status_class != 0 THEN
//			CALL Error_Append("", l_function)
//			EXIT WHILE
//		END IF

//		-- Retrieve sum of paid deposits..
//		CALL d_cde_totalpending_sum(p_bill_ac_no) RETURNING l_pending_deposit
//CALL DebugLog("d_cde_totalpending_sum")
//CALL DebugLog( g_status_class)
//		IF g_status_class != 0 THEN
//			CALL Error_Append("", l_function)
//			EXIT WHILE
//		END IF

//		-- Retrieve last deposit status for customer..
		try {
			pendingDeposit = this.getCustomerDAC.getPendingSum(billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		
		if(pendingDeposit == null){
			pendingDeposit = new BigDecimal("0.00");
		}
		
//		CALL d_cde_last_status_get(p_bill_ac_no) RETURNING l_last_deposit_status
//CALL DebugLog("d_cde_last_status_get")
//CALL DebugLog( g_status_class)
//		IF g_status_class != 0 THEN
//			CALL Error_Append("", l_function)
//			EXIT WHILE
//		END IF
		
		try {
		lastDepDmo = this.getCustomerDAC.getCdeLastStatus(billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		
		if(lastDepDmo == null) {
			lastDepositStatus = "";
		}else {
			lastDepositStatus = lastDepDmo.getString();
		}

		try {
			cviDmo = this.getCustomerDAC.getCviAcv(billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
//		CALL d_cvi_acv_get(p_bill_ac_no) RETURNING l_cvi.*
//CALL DebugLog("d_cvi_acv_get")
//CALL DebugLog( g_status_class)
//		IF g_status_class = 100 THEN
//			CALL Error_Reset ()
//		END IF
//
//		LET l_hh.hh_name = NULL
//
//		IF g_status_class = 0 THEN
//			# Get the legal entity name
		Object[] scEhHH = null;

		try {
			scEhHH = this.service.getScEhHH(null, auxDmo.getBillAcNo(), "COMPANY", "ACCOUNT");

			if (scEhHH != null) {
				scDmo = (ScSerialCustomerDMO) scEhHH[0];
				ehhhDQO = (EhHhDQO) scEhHH[1];

				ehhhDQO.deConstruct();
				ehDmo = ehhhDQO.getEhDMO();
				hhDmo = ehhhDQO.getHhDMO();
//				logger.debug("HH Name for ACCOUNT: " + hhDmo.getHhName());

//			scSerial = scDmo.getScSerial();
//			cugSerial = hhDmo.getHhSerial();
//			ebuCugId = "CUG" + cugSerial.toString();
			} else {
				logger.error("Failed to get the scEhHH records for COMPANY, ACCOUNT");
			}
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
//			CALL d_sc_eh_hh_get("", l_slcustm.customer, "COMPANY", "ACCOUNT")
//				RETURNING l_sc.*, l_eh.*, l_hh.*
//
//			IF g_status_class != 0 THEN
//				LET l_hh.hh_name = NULL
//				CALL Error_Reset()
//			END IF
//		END IF

//		#NNT - Return the risk band
//		CALL Dynamic_CreditLimit_Header_Get (l_aux.id_number, l_aux.aux_analysis_13)
//			RETURNING l_dlh.*
		
		try {
			dlhDmo = this.helRpcService.getDlhDynamicLmtHdr(auxDmo.getIdNumber(), auxDmo.getAuxAnalysis13());
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		

		if(dlhDmo == null) {
//		IF (g_status_class <> 0) THEN
//			INITIALIZE l_erb.* TO NULL
//			CALL Error_Reset ()
//		ELSE
		}else {
//			CALL RiskBands_Get ("", l_dlh.dlh_risk_band_id)
//				RETURNING l_erb.*
			erbDmo = this.getRiskband(dlhDmo.getDlhRiskBandId(), null);
//			IF (g_status_class <> 0) THEN
//				INITIALIZE l_erb.* TO NULL
//				CALL Error_Reset ()
//			END IF
//		END IF
		}

//		#returning delivery method		
		try {
			udvDqo = this.getCustomerDAC.getUdvTT("STATE", billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		
//		CALL d_udv_get(l_slcustm.customer, 0,"STATE") RETURNING
//		  l_udv.*,
//		  l_documentdescription,
//		  l_deliverydescription,
//		  l_formatdescription,
//		  l_addressdescription
//
//        IF g_status_class != 0 THEN
//		   CALL Error_Reset()
//		   LET l_udv.udv_delivery = ""
//		END IF
		
		if(udvDqo == null) {
			slDmo.setDeliveryMethod("");
		}else {
			slDmo.setDeliveryMethod(udvDqo.getUdvDelivery());
		}
		
//		LET  l_slcustm.delivery_method = l_udv.udv_delivery
//		# Make sure only once round loop
//
//		LET l_error_text = "Customer Info Viewed for Customer: ", l_slcustm.customer
//		CALL History_InsUser("CUSTINFO", l_error_text)
//        IF g_status_class != 0 THEN
//		   CALL Error_Reset()
//		END IF
//
//		EXIT WHILE
//
//	END WHILE
		String comment = "Customer Info Viewed for Customer: " + billAcNo;
		try {
			this.getCustomerDAC.insertUserHistory(this.getUserName(), "CUSTINFO", comment, this.getHostName());
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		

//		 * RETURN l_slcustm.customer, 
		response.setAccountNumber((billAcNo == null) ? "" : billAcNo);
//		 * l_slcustm.alpha, 
		response.setAlphaCode((slDmo.getAlpha() == null) ? "" : slDmo.getAlpha());	
//		 * l_slcustm.name,
		response.setCustomerName((slDmo.getName() == null) ? "" : slDmo.getName());
//		 * l_slcustm.credit_category,
		response.setCreditCategory((slDmo.getCreditCategory() == null) ? "" : slDmo.getCreditCategory());
//		 * l_slcustm.export_indicator,
		response.setExportIndicator((slDmo.getExportIndicator() == null) ? "" : slDmo.getExportIndicator());
//		 * l_slcustm.cust_disc_code, 
		response.setDiscountCode((slDmo.getCustDiscCode() == null) ? "" : slDmo.getCustDiscCode());
//		 * l_slcustm.currency, 
		response.setCurrency1((slDmo.getCurrency() == null) ? "" : slDmo.getCurrency());
//		 * l_slcustm.territory,
		response.setTerritory((slDmo.getTerritory() == null) ? "" : slDmo.getTerritory());
//		 * l_slcustm.class, 
		response.setCustomerClass((slDmo.getKlass() == null) ? "" : slDmo.getKlass());
//		 * l_slcustm.region, 
		response.setRegion((slDmo.getRegion() == null) ? "" : slDmo.getRegion());
//		 * l_slcustm.invoice_customer,	
		response.setInvoiceAccount((slDmo.getInvoiceCustomer() == null) ? "" : slDmo.getInvoiceCustomer());
//		 * l_slcustm.statement_customer, 
		response.setStatementAccount((slDmo.getStatementCustomer() == null) ? "" : slDmo.getStatementCustomer());
//		 * l_slcustm.group_customer,
		response.setGroupReference((slDmo.getGroupCustomer() == null) ? "" : slDmo.getGroupCustomer());
//		 * l_slcustm.date_last_issue, 
		response.setDateLastIssue((slDmo.getDateLastIssue() == null) ? "" : dtFormatyyyymmddStandard.format(slDmo.getDateLastIssue()));
//		 * l_slcustm.date_created, 
		response.setDateCreated((slDmo.getDateCreated() == null) ? "" : dtFormatyyyymmddStandard.format(slDmo.getDateCreated()));
//		 * l_slcustm.analysis_codes1,
response.setAnalysisCode1((slDmo.getAnalysisCodes1() == null) ? "" : slDmo.getAnalysisCodes1());
//		 * l_slcustm.analysis_codes2, 
response.setAnalysisCode2((slDmo.getAnalysisCodes2() == null) ? "" : slDmo.getAnalysisCodes2());
//		 * l_slcustm.analysis_codes3,
response.setAnalysisCode3((slDmo.getAnalysisCodes3() == null) ? "" : slDmo.getAnalysisCodes3());
//		 * l_slcustm.analysis_codes4, 
response.setAnalysisCode4((slDmo.getAnalysisCodes4() == null) ? "" : slDmo.getAnalysisCodes4());
//		 * l_slcustm.analysis_codes5, 
response.setAnalysisCode5((slDmo.getAnalysisCodes5() == null) ? "" : slDmo.getAnalysisCodes5());
//		 * l_slcustm.reminder_cat,
response.setReminderCategory((slDmo.getReminderCat() == null) ? "" : slDmo.getReminderCat());
//		 * l_slcustm.settlement_code, 
response.setSettlementDiscount((slDmo.getSettlementCode() == null) ? "" : slDmo.getSettlementCode());
//		 * l_slcustm.sett_days_code, 
response.setSettlementDays((slDmo.getSettDaysCode() == null) ? "" : slDmo.getSettDaysCode());
//		 * l_slcustm.price_list,
response.setPriceList((slDmo.getPriceList() == null) ? "" : slDmo.getPriceList());
//		 * l_slcustm.letter_code, 
response.setLetterCode((slDmo.getLetterCode() == null) ? "" : slDmo.getLetterCode());
//		 * l_slcustm.balance_fwd, 
response.setBalanceForwardMethod((slDmo.getBalanceFwd() == null) ? "" : slDmo.getBalanceFwd());
//		 * l_slcustm.credit_limit,
response.setCreditLimit((slDmo.getCreditLimit()  == null) ? "0.00" : slDmo.getCreditLimit().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.ytd_sales, 
response.setYearToDateSales((slDmo.getYtdSales() == null) ? "" : slDmo.getYtdSales().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.ytd_cost_of_sales, 
response.setYearToDateCostOfSales((slDmo.getYtdCostOfSales() == null) ? "" : slDmo.getYtdCostOfSales().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.cumulative_sales,
response.setCumulativeSales((slDmo.getCumulativeSales() == null) ? "" : slDmo.getCumulativeSales().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.order_balance, 
response.setOrderBalance((slDmo.getOrderBalance() == null) ? "" : slDmo.getOrderBalance().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.sales_nl_cat, 
response.setSalesNominalLedgerCategory((slDmo.getSalesNlCat() == null) ? "" : slDmo.getSalesNlCat());
//		 * l_slcustm.special_price,
response.setSpecialPrice((slDmo.getSpecialPrice() == null) ? "" : slDmo.getSpecialPrice());
//		 * l_slcustm.vat_registration, 
response.setVatRegistrationNo((slDmo.getVatRegistration() == null) ? "" : slDmo.getVatRegistration());
//		 * l_slcustm.direct_debit,
response.setDirectDebit((slDmo.getDirectDebit() == null) ? "" : slDmo.getDirectDebit());
//		 * l_slcustm.invoices_printed, 
response.setProduceInvoicesFlag((slDmo.getInvoicesPrinted() == null) ? "" : slDmo.getInvoicesPrinted());
//		 * l_slcustm.consolidated_inv,
response.setProduceConsolidatedInvoicesFlag((slDmo.getConsolidatedInv() == null) ? "" : slDmo.getConsolidatedInv());
//		 * l_slcustm.comment_only_inv, 
response.setProduceCommentOnlyInvoicesFlag((slDmo.getCommentOnlyInv() == null) ? "" : slDmo.getCommentOnlyInv());
//		 * l_slcustm.bank_address3, 
response.setBankAddress3((slDmo.getBankAddress3() == null) ? "" : slDmo.getBankAddress3());
//		 * l_slcustm.bank_address4,
response.setBankAddress4((slDmo.getBankAddress4() == null) ? "" : slDmo.getBankAddress4());
//		 * l_slcustm.analysis_code_6, 
response.setAnalysisCode6((slDmo.getAnalysisCode6() == null) ? "" : slDmo.getAnalysisCode6());
//		 * l_slcustm.produce_statements,
response.setProduceStatmentsFlag((slDmo.getProduceStatements() == null) ? "" : slDmo.getProduceStatements());
//		 * l_slcustm.edi_customer, 
response.setEdiCustomerFlag((slDmo.getEdiCustomer() == null) ? "" : slDmo.getEdiCustomer());
//		 * l_slcustm.vat_type, 
response.setVatType((slDmo.getVatType() == null) ? "" : slDmo.getVatType());
//		 * l_slcustm.language,
response.setCustomersLanguage((slDmo.getLanguage() == null) ? "" : slDmo.getLanguage());
//		 * l_slcustm.delivery_method,
response.setDeliveryMethod((slDmo.getDeliveryMethod() == null) ? "" : slDmo.getDeliveryMethod());
//		 * l_slcustm.carrier, 
response.setCarrier((slDmo.getCarrier() == null) ? "" : slDmo.getCarrier());
//		 * l_slcustm.vat_reg_number,
response.setVatRegNumber((slDmo.getVatRegNumber() == null) ? "" : slDmo.getVatRegNumber());
//		 * l_slcustm.vat_exe_number, 
response.setVatExeNumber((slDmo.getVatExeNumber() == null) ? "" : slDmo.getVatExeNumber());
//		 * l_slcustm.paydays1, 
response.setPaydays1((slDmo.getPaydays1() == null) ? "" : slDmo.getPaydays1());
//		 * l_slcustm.paydays2,
response.setPaydays2((slDmo.getPaydays2() == null) ? "" : slDmo.getPaydays2());
//		 * l_slcustm.paydays3, 
response.setPaydays3((slDmo.getPaydays3() == null) ? "" : slDmo.getPaydays3());
//		 * l_slcustm.bank_branch_code, 
response.setBankBranchCode((slDmo.getBankBranchCode() == null) ? "" : slDmo.getBankBranchCode());
//		 * l_slcustm.print_cp_with_stat,
response.setPrintCpWithStat((slDmo.getPrintCpWithStat() == null) ? "" : slDmo.getPrintCpWithStat());
//		 * l_slcustm.payment_method, 
response.setPaymentMethod((slDmo.getPaymentMethod() == null) ? "" : slDmo.getPaymentMethod());
//		 * l_slcustm.customer_class, 
response.setCustomerClass((slDmo.getCustomerClass() == null) ? "" : slDmo.getCustomerClass());
//		 * l_slcustm.sales_type,
response.setSalesType((slDmo.getSalesType() == null) ? "" : slDmo.getSalesType());
//		 * l_slcustm.cp_lower_value, 
response.setCpLowerValue((slDmo.getCpLowerValue() == null) ? "" : slDmo.getCpLowerValue().setScale(2, RoundingMode.HALF_UP).toString());
//		 * l_slcustm.btx, 
response.setBtx((slDmo.getBtx() == null) ? "" : slDmo.getBtx());
//		 * l_slcustm.cp_charge,
response.setCpCharge((slDmo.getCpCharge() == null) ? "" : slDmo.getCpCharge());
//		 * l_slcustm.control_digit, 
response.setControlDigit((slDmo.getControlDigit() == null) ? "" : slDmo.getControlDigit());
//		 * l_slcustm.payer, 
response.setPayer((slDmo.getPayer() == null) ? "" : slDmo.getPayer());
//		 * l_slcustm.responsibility,
response.setResponsibility((slDmo.getResponsibility() == null) ? "" : slDmo.getResponsibility());
//		 * l_slcustm.despatch_held, 
response.setDespatchHeld((slDmo.getDespatchHeld() == null) ? "" : slDmo.getDespatchHeld());
//		 * l_slcustm.credit_controller,
response.setCreditController((slDmo.getCreditController() == null) ? "" : slDmo.getCreditController());
//		 * l_slcustm.reminder_letters, 
response.setReminderLetters((slDmo.getReminderLetters() == null) ? "" : slDmo.getReminderLetters());
//		 * l_slcustm.severity_days1,
response.setSeverityDays1((slDmo.getSeverityDays1() == null) ? "" : slDmo.getSeverityDays1().toString());
//		 * l_slcustm.severity_days2, 
response.setSeverityDays2((slDmo.getSeverityDays2() == null) ? "" : slDmo.getSeverityDays2().toString());
//		 * l_slcustm.severity_days3, 
response.setSeverityDays3((slDmo.getSeverityDays3() == null) ? "" : slDmo.getSeverityDays3().toString());
//		 * l_slcustm.severity_days4,
response.setSeverityDays4((slDmo.getSeverityDays4() == null) ? "" : slDmo.getSeverityDays4().toString());
//		 * l_slcustm.severity_days5, 
response.setSeverityDays5((slDmo.getSeverityDays5() == null) ? "" : slDmo.getSeverityDays5().toString());
//		 * l_slcustm.severity_days6,
response.setSeverityDays6((slDmo.getSeverityDays6() == null) ? "" : slDmo.getSeverityDays6().toString());
//		 * l_slcustm.delivery_reason, 
response.setDeliveryReason((slDmo.getDeliveryReason() == null) ? "" : slDmo.getDeliveryReason());
//		 * l_slcustm.shipper_code1, 
response.setShipperCode1((slDmo.getShipperCode1() == null) ? "" : slDmo.getShipperCode1());
//		 * l_slcustm.shipper_code2,
response.setShipperCode2((slDmo.getShipperCode2() == null) ? "" : slDmo.getShipperCode2());
//		 * l_slcustm.shipper_code3, 
response.setShipperCode3((slDmo.getShipperCode3() == null) ? "" : slDmo.getShipperCode3());
//		 * l_slcustm.shipping_note_ind, 
response.setShippingNoteIndicator((slDmo.getShippingNoteInd() == null) ? "" : slDmo.getShippingNoteInd());
//		 * l_slcustm.account_type,
response.setAccountType((slDmo.getKlass() == null) ? "" : slDmo.getKlass());

/**
 * Change made 21-04-2022 SJ
 * replce slDmo.getAccountType() to return auxDmo.getAuxAccountType()
 */

response.setAccType((auxDmo.getAuxAccountType() == null) ? auxDmo.getAuxAccountType() : auxDmo.getAuxAccountType());
//		 * l_slcustm.admin_fee, 
response.setAdminFee((slDmo.getAdminFee() == null) ? "" : slDmo.getAdminFee());
//		 * l_slcustm.intrest_rate, # 80 columns 
response.setInterestRate((slDmo.getIntrestRate() == null) ? "" : slDmo.getIntrestRate());
//		 * 

//		 * l_aux.aux_title,
response.setCustomerTitle((auxDmo.getAuxTitle() == null) ? "" : auxDmo.getAuxTitle());
//		 * l_aux.aux_firstname, 
response.setFirstName((auxDmo.getAuxFirstname() == null) ? "" : auxDmo.getAuxFirstname());
//		 * l_aux.aux_invoice_addrid, 
response.setInvoiceAddressId((auxDmo.getAuxInvoiceAddrid() == null) ? "" : auxDmo.getAuxInvoiceAddrid().toString());
//		 * l_aux.bank_name,
response.setBankName((auxDmo.getBankName() == null) ? "" : auxDmo.getBankName());
//		 * l_aux.bank_addr1, 
response.setBankAddress1((auxDmo.getBankAddr1() == null) ? "" : auxDmo.getBankAddr1());
//		 * l_aux.bank_addr2, 
response.setBankAddress2((auxDmo.getBankAddr2() == null) ? "" : auxDmo.getBankAddr2());
//		 * l_aux.bank_ac_name, 
response.setBankAccountName((auxDmo.getBankAcName() == null) ? "" : auxDmo.getBankAcName());
//		 * l_aux.ref,
response.setBankRef((auxDmo.getRef() == null) ? "" : auxDmo.getRef());
//		 * l_aux.bank_scode, 
response.setBankSortCode((auxDmo.getBankScode() == null) ? "" : auxDmo.getBankScode());
//		 * l_aux.bank_ac_no, 
response.setBankAccountNo((auxDmo.getBankAcNo() == null) ? "" : auxDmo.getBankAcNo());
//		 * l_aux.bank_ac_type, 
response.setBankAccountType((auxDmo.getBankAcType() == null) ? "" : auxDmo.getBankAcType());
//		 * l_aux.bank_pay_type,
response.setPaymentType((auxDmo.getBankPayType() == null) ? "" : auxDmo.getBankPayType());
//		 * l_aux.aux_pref_debit_day, 
response.setPrefferedDebitDay((auxDmo.getAuxPrefDebitDay() == null) ? "" : auxDmo.getAuxPrefDebitDay().toString());
//		 * l_aux.protect_code, 
response.setProtectCode((auxDmo.getProtectCode() == null) ? "" : auxDmo.getProtectCode());
//		 * l_aux.handset_ct,
response.setHandsetCount((auxDmo.getHandsetCt() == null) ? "" : auxDmo.getHandsetCt().toString());
//		 * l_aux.bank_date, 
response.setDirectDebitSubmissionDate((auxDmo.getBankDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getBankDate()));
//		 * l_aux.conf_date, 
response.setDirectDebitConfirmationDate((auxDmo.getConfDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getConfDate()));
//		 * l_aux.aux_comment, 
response.setAuxilaryComment((auxDmo.getAuxComment() == null) ? "" : auxDmo.getAuxComment());
//		 * l_aux.date_of_birth,
response.setDateOfBirth((auxDmo.getDateOfBirth() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getDateOfBirth()));
//		 * l_aux.ref_pay_date, 
response.setReferToPayerDate((auxDmo.getRefPayDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getRefPayDate()));
//		 * l_aux.ac_clos_date, 
response.setAccountTransferredDate((auxDmo.getAcClosDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getAcClosDate()));
//		 * l_aux.no_reas_date,
response.setNoAccountDate((auxDmo.getNoReasDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getNoReasDate()));
//		 * l_aux.rem_let_date, 
response.setReminderLetterDate((auxDmo.getRemLetDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getRemLetDate()));
//		 * l_aux.ac_tran_date, 
response.setNoBarsDate((auxDmo.getAcTranDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getAcTranDate()));
//		 * l_aux.no_ac_date, 
response.setChequeReturnedDate((auxDmo.getNoAcDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getNoAcDate()));
//		 * l_aux.sr_flag,
response.setSrFlag((auxDmo.getSrFlag() == null) ? "" : auxDmo.getSrFlag());
//		 * l_aux.processed, 
response.setProcessedMegaDownload((auxDmo.getProcessed() == null) ? "" : auxDmo.getProcessed());
//		 * l_aux.package_code, 
response.setPackageCode((auxDmo.getPackageCode() == null) ? "" : auxDmo.getPackageCode());
//		 * l_aux.aux_account_type,
response.setAuxAccountType((auxDmo.getAuxAccountType() == null) ? "" : auxDmo.getAuxAccountType());
//		 * l_aux.aux_bill_cycle, 
response.setBillingCycle((auxDmo.getAuxBillCycle() == null) ? "" : auxDmo.getAuxBillCycle());
//		 * l_balance, 
response.setBalance((balance.toString() == null) ? "" : balance.toString());
//		 * l_aux.credit_card_no,
response.setCreditCardNumber((auxDmo.getCreditCardNo() == null) ? "" : auxDmo.getCreditCardNo());
//		 * l_aux.credit_card_name, 
response.setCreditCardName((auxDmo.getCreditCardName() == null) ? "" : auxDmo.getCreditCardName());

	/**
	 * Change done 27-01-2020
	 * Problem when date is set to 1899-12-30 which represends null in informix
	 * check the date if equal or before 1900-01-01 then return empty string as null.
	 * INC000002733626
	 * 
	 */

	Date testDt = new Date(01,01,1900);

	logger.debug("\nEXPIRY DATE IN AUX: " + auxDmo.getExpiryDate());
	logger.debug("\nEXPIRY DATE TEST DATE: " + testDt);
	
//	System.out.println("\nEXPIRY DATE IN AUX: " + auxDmo.getExpiryDate());
//	System.out.println("\nEXPIRY DATE TEST DATE: " + testDt);

//		 * l_aux.expiry_date, 
		if(auxDmo.getExpiryDate() != null) {
//			System.out.println("Check is valid");
			
			if(auxDmo.getExpiryDate().before(testDt)) {
				response.setExpiryDate("");
//				System.out.println("Check is valid: " + response.getExpiryDate());
			}else {
//				System.out.println("Check is in-valid");
				response.setExpiryDate(dtFormatyyyymmddStandard.format(auxDmo.getExpiryDate()));
			}
		}


//response.setExpiryDate((auxDmo.getExpiryDate() == null) ? "" : dtFormatyyyymmddStandard.format(auxDmo.getExpiryDate()));
//		 * l_aux.aux_card_cvv_no,
response.setCreditCardCVVNo((auxDmo.getAuxCardCvvNo() == null) ? "" : auxDmo.getAuxCardCvvNo());
//		 * l_aux.credit_score, 
response.setCreditScore((auxDmo.getCreditScore() == null) ? "" : auxDmo.getCreditScore().toString());
//		 * l_aux.serv_prov_id, 
response.setServiceProviderID((auxDmo.getServProvId() == null) ? "" : auxDmo.getServProvId().toString());
//		 * l_aux.dealer_id, 
response.setDealerID((auxDmo.getDealerId() == null) ? "" : auxDmo.getDealerId());
//		 * l_aux.salesman,
response.setSalesman((auxDmo.getSalesman() == null) ? "" : auxDmo.getSalesman());
//		 * l_aux.id_number, 
response.setIDNumber((auxDmo.getIdNumber() == null) ? "" : auxDmo.getIdNumber());
//		 * l_aux.acc_status, 
response.setAccountStatus((auxDmo.getAccStatus() == null) ? "" : auxDmo.getAccStatus());
//		 * l_aux.comp_reg_no, 
response.setCompanyRegNo((auxDmo.getCompRegNo() == null) ? "" : auxDmo.getCompRegNo());
//		 * l_aux.stationary_type,
response.setStationeryType((auxDmo.getStationaryType() == null) ? "" : auxDmo.getStationaryType());
//		 * l_aux.max_no_subs, 
response.setMaxNoSubscribers((auxDmo.getMaxNoSubs() == null) ? "" : auxDmo.getMaxNoSubs().toString());
//		 * l_aux.aux_currency, 
response.setAltCurrency((auxDmo.getAuxCurrency() == null) ? "" : auxDmo.getAuxCurrency());
//		 * l_aux.aux_country_code,
response.setCountryCode((auxDmo.getAuxCountryCode() == null) ? "" : auxDmo.getAuxCountryCode());
//		 * l_aux.aux_gender, 
response.setGender((auxDmo.getAuxGender() == null) ? "" : auxDmo.getAuxGender());
//		 * l_aux.aux_sub_grp_acc_no, 
response.setSubGroupAccount((auxDmo.getAuxSubGrpAccNo() == null) ? "" : auxDmo.getAuxSubGrpAccNo());
//		 * l_aux.aux_prepaid_stat,
response.setPrePaidStatus((auxDmo.getAuxPrepaidStat() == null) ? "" : auxDmo.getAuxPrepaidStat());
//		 * l_aux.aux_credit_class, 
response.setCreditClass((auxDmo.getAuxCreditClass() == null) ? "" : auxDmo.getAuxCreditClass());
//		 * l_dcc.dcc_class_desc, 
response.setCreditClassDescription((dccDmo.getDccClassDesc() == null) ? "" : dccDmo.getDccClassDesc());
//		 * l_aux.aux_auto_limit_ind,
response.setEvaluateCreditLimit((auxDmo.getAuxAutoLimitInd() == null) ? "" : auxDmo.getAuxAutoLimitInd());
//		 * l_aux.aux_lmt_up_val, 
response.setCreditLimitUpgrade((auxDmo.getAuxLmtUpVal() == null) ? "" : auxDmo.getAuxLmtUpVal().toString());
//		 * l_aux.aux_lmt_dn_val, 
response.setCreditLimitDowngrade((auxDmo.getAuxLmtDnVal() == null) ? "" : auxDmo.getAuxLmtDnVal().toString());
//		 * l_cca.cca_description,
response.setCreditControllerDescription((ccaDetails[1] == null) ? "" : ccaDetails[1]);
//		 * l_cca.cca_telephone, 
response.setCreditControllerTelephone((ccaDetails[2] == null) ? "" : ccaDetails[2]);
//		 * l_paid_deposit, 
response.setPaidDeposit((paidDeposit.toString() == null) ? "" : paidDeposit.toString());
//		 * l_pending_deposit,
response.setPendingDeposit((pendingDeposit.toString() == null) ? "" : pendingDeposit.toString());
//		 * l_last_deposit_status, 
response.setLastDepositStatus((lastDepositStatus == null) ? "" : lastDepositStatus);
//		 * l_aux.aux_analysis_1, 
response.setAnalysis1((auxDmo.getAuxAnalysis1() == null) ? "" : auxDmo.getAuxAnalysis1());
//		 * l_aux.aux_analysis_2,s
response.setAnalysis2((auxDmo.getAuxAnalysis2() == null) ? "" : auxDmo.getAuxAnalysis2());
//		 * l_aux.aux_analysis_3, 
response.setAnalysis3((auxDmo.getAuxAnalysis3() == null) ? "" : auxDmo.getAuxAnalysis3());
//		 * l_aux.aux_analysis_4, 
response.setAnalysis4((auxDmo.getAuxAnalysis4() == null) ? "" : auxDmo.getAuxAnalysis4());
//		 * l_aux.aux_analysis_5,
response.setAnalysis5((auxDmo.getAuxAnalysis5() == null) ? "" : auxDmo.getAuxAnalysis5());
//		 * l_aux.aux_analysis_6, 
response.setAnalysis6((auxDmo.getAuxAnalysis6() == null) ? "" : auxDmo.getAuxAnalysis6());
//		 * l_aux.aux_analysis_7, 
response.setAnalysis7((auxDmo.getAuxAnalysis7() == null) ? "" : auxDmo.getAuxAnalysis7());
//		 * l_aux.aux_analysis_8,
response.setAnalysis8((auxDmo.getAuxAnalysis8() == null) ? "" : auxDmo.getAuxAnalysis8());
//		 * l_aux.aux_analysis_9, 
response.setAnalysis9((auxDmo.getAuxAnalysis9() == null) ? "" : auxDmo.getAuxAnalysis9());
//		 * l_aux.aux_analysis_10, 
response.setAnalysis10((auxDmo.getAuxAnalysis10() == null) ? "" : auxDmo.getAuxAnalysis10());
//		 * l_aux.aux_analysis_11,
response.setAnalysis11((auxDmo.getAuxAnalysis11() == null) ? "" : auxDmo.getAuxAnalysis11());
//		 * l_aux.aux_analysis_12, 
response.setAnalysis12((auxDmo.getAuxAnalysis12() == null) ? "" : auxDmo.getAuxAnalysis12());
//		 * l_aux.aux_analysis_13, 
response.setAnalysis13((auxDmo.getAuxAnalysis13() == null) ? "" : auxDmo.getAuxAnalysis13());
//		 * l_aux.aux_analysis_14,
response.setAnalysis14((auxDmo.getAuxAnalysis14() == null) ? "" : auxDmo.getAuxAnalysis14());
//		 * l_aux.aux_analysis_15, 
response.setAnalysis15((auxDmo.getAuxAnalysis15() == null) ? "" : auxDmo.getAuxAnalysis15());
//		 * l_aux.aux_analysis_16, 
response.setAnalysis16((auxDmo.getAuxAnalysis16() == null) ? "" : auxDmo.getAuxAnalysis16());
//		 * l_aux.aux_analysis_17,
response.setAnalysis17((auxDmo.getAuxAnalysis17() == null) ? "" : auxDmo.getAuxAnalysis17());
//		 * l_aux.aux_analysis_18, 
response.setAnalysis18((auxDmo.getAuxAnalysis18() == null) ? "" : auxDmo.getAuxAnalysis18());
//		 * l_aux.aux_analysis_19, 
response.setAnalysis19((auxDmo.getAuxAnalysis19() == null) ? "" : auxDmo.getAuxAnalysis19());
//		 * l_aux.aux_analysis_20,
response.setAnalysis20((auxDmo.getAuxAnalysis20() == null) ? "" : auxDmo.getAuxAnalysis20());
//		 * l_aux.aux_analysis_21, 
response.setAnalysis21((auxDmo.getAuxAnalysis21() == null) ? "" : auxDmo.getAuxAnalysis21());
//		 * l_aux.aux_analysis_22, 
response.setAnalysis22((auxDmo.getAuxAnalysis22() == null) ? "" : auxDmo.getAuxAnalysis22());
//		 * l_aux.aux_analysis_23,
response.setAnalysis23((auxDmo.getAuxAnalysis23() == null) ? "" : auxDmo.getAuxAnalysis23());
//		 * l_aux.aux_analysis_24, 
response.setAnalysis24((auxDmo.getAuxAnalysis24() == null) ? "" : auxDmo.getAuxAnalysis24());
//		 * l_aux.aux_analysis_25, 
response.setAnalysis25((auxDmo.getAuxAnalysis25() == null) ? "" : auxDmo.getAuxAnalysis25());
//		 * l_aux.aux_analysis_26,
response.setAnalysis26((auxDmo.getAuxAnalysis26() == null) ? "" : auxDmo.getAuxAnalysis26());
//		 * l_aux.aux_analysis_27, 
response.setAnalysis27((auxDmo.getAuxAnalysis27() == null) ? "" : auxDmo.getAuxAnalysis27());
//		 * l_aux.aux_analysis_28, 
response.setAnalysis28((auxDmo.getAuxAnalysis28() == null) ? "" : auxDmo.getAuxAnalysis28());
//		 * l_aux.aux_analysis_29,
response.setAnalysis29((auxDmo.getAuxAnalysis29() == null) ? "" : auxDmo.getAuxAnalysis29());
//		 * l_aux.aux_analysis_30, # 158 Columns
response.setAnalysis30((auxDmo.getAuxAnalysis30() == null) ? "" : auxDmo.getAuxAnalysis30());
		 
		 
		response.setLimitMechanism((aulDmo.getAulLmtMech() == null) ? "" : aulDmo.getAulLmtMech());
		response.setMinimumLimit((aulDmo.getAulLmtMin() == null) ? "" : aulDmo.getAulLmtMin().toString());
		response.setMaximumLimit((aulDmo.getAulLmtMax() == null) ? "" : aulDmo.getAulLmtMax().toString());
		 
		if(cviDmo != null) {
			response.setCRMColour((cviDmo.getCviCrmColour() == null) ? "" : cviDmo.getCviCrmColour().toString());
			response.setCRMKeyword(cviDmo.getCviKeyWord());
			response.setCRMValue(cviDmo.getCviCrmValue());
		}else {
			response.setCRMColour("");
			response.setCRMKeyword("");
			response.setCRMValue("");
		}
		
		String tmpHHName = "";
		
		if ( hhDmo != null) {
			tmpHHName = hhDmo.getHhName();
		}
			
//		logger.debug("HH Name for ACCOUNT: " + tmpHHName);
		
//		tmpHHName = (erbDmo == null ? tmpHHName : (erbDmo.getErbText()== null) ? tmpHHName : erbDmo.getErbText());
		/**
		 * SJ: Fix hierarchyName returned the incorrect value from riskband.
		 */
		
		if(tmpHHName == null) {
			tmpHHName  = "";
		}
		
		response.setHierarchyName(tmpHHName);

		response.setInvoiceAddressFlag_1(inv1);
		response.setAddressID_1((aud1DMO.getAudAddrid() == null) ? "" : aud1DMO.getAudAddrid().toString());
		response.setAccountNo_1(aud1DMO.getAudAccountNo());
		response.setSubscriberId_1(
				(aud1DMO.getAudSubscriberId() == null) ? "" : aud1DMO.getAudSubscriberId().toString());
		response.setAddresType_1(aud1DMO.getAudAddressType());
		response.setAddresInDate_1(
				(aud1DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud1DMO.getAudInDate()));
		response.setAddressClassification_1(aud1DMO.getAudClassification());
		response.setAddressUniqueID_1(aud1DMO.getAudUniqueId());
		response.setAddressName_1(aud1DMO.getAudName());
		response.setAddressLine1_1(aud1DMO.getAudAddress1());
		response.setAddressLine2_1(aud1DMO.getAudAddress2());
		response.setAddressLine3_1(aud1DMO.getAudAddress3());
		response.setAddressLine4_1(aud1DMO.getAudAddress4());
		response.setAddressLine5_1(aud1DMO.getAudAddress5());
		response.setAddressLine6_1(aud1DMO.getAudAddress6());
		response.setAddressPostCode_1(aud1DMO.getAudPostcode());
		response.setAddressTelephone2_1(aud1DMO.getAudTelephoneNo());
		response.setAddressTelephone_1(aud1DMO.getAudTelephoneNo2());
		response.setAddressFax_1(aud1DMO.getAudFaxNo());
		response.setAddressContact_1(aud1DMO.getAudContact());
		response.setAddressEMail_1(aud1DMO.getAudEMail());
		response.setAdressNotes_1(aud1DMO.getAudNotes());
		response.setAddressGeneral1_1(aud1DMO.getAudGeneral1());
		response.setAddressGeneral2_1(aud1DMO.getAudGeneral2());
		response.setAddressGeneral3_1(aud1DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_2(inv2);
		response.setAddressID_2((aud2DMO.getAudAddrid() == null) ? "" : aud2DMO.getAudAddrid().toString());
		response.setAccountNo_2(aud2DMO.getAudAccountNo());
		response.setSubscriberId_2(
				(aud2DMO.getAudSubscriberId() == null) ? "" : aud2DMO.getAudSubscriberId().toString());
		response.setAddresType_2(aud2DMO.getAudAddressType());
		response.setAddresInDate_2(
				(aud2DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud2DMO.getAudInDate()));
		response.setAddressClassification_2(aud2DMO.getAudClassification());
		response.setAddressUniqueID_2(aud2DMO.getAudUniqueId());
		response.setAddressName_2(aud2DMO.getAudName());
		response.setAddressLine1_2(aud2DMO.getAudAddress1());
		response.setAddressLine2_2(aud2DMO.getAudAddress2());
		response.setAddressLine3_2(aud2DMO.getAudAddress3());
		response.setAddressLine4_2(aud2DMO.getAudAddress4());
		response.setAddressLine5_2(aud2DMO.getAudAddress5());
		response.setAddressLine6_2(aud2DMO.getAudAddress6());
		response.setAddressPostCode_2(aud2DMO.getAudPostcode());
		response.setAddressTelephone2_2(aud2DMO.getAudTelephoneNo());
		response.setAddressTelephone_2(aud2DMO.getAudTelephoneNo2());
		response.setAddressFax_2(aud2DMO.getAudFaxNo());
		response.setAddressContact_2(aud2DMO.getAudContact());
		response.setAddressEMail_2(aud2DMO.getAudEMail());
		response.setAdressNotes_2(aud2DMO.getAudNotes());
		response.setAddressGeneral1_2(aud2DMO.getAudGeneral1());
		response.setAddressGeneral2_2(aud2DMO.getAudGeneral2());
		response.setAddressGeneral3_2(aud2DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_3(inv3);
		response.setAddressID_3((aud3DMO.getAudAddrid() == null) ? "" : aud3DMO.getAudAddrid().toString());
		response.setAccountNo_3(aud3DMO.getAudAccountNo());
		response.setSubscriberId_3(
				(aud3DMO.getAudSubscriberId() == null) ? "" : aud3DMO.getAudSubscriberId().toString());
		response.setAddresType_3(aud3DMO.getAudAddressType());
		response.setAddresInDate_3(
				(aud3DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud3DMO.getAudInDate()));
		response.setAddressClassification_3(aud3DMO.getAudClassification());
		response.setAddressUniqueID_3(aud3DMO.getAudUniqueId());
		response.setAddressName_3(aud3DMO.getAudName());
		response.setAddressLine1_3(aud3DMO.getAudAddress1());
		response.setAddressLine2_3(aud3DMO.getAudAddress2());
		response.setAddressLine3_3(aud3DMO.getAudAddress3());
		response.setAddressLine4_3(aud3DMO.getAudAddress4());
		response.setAddressLine5_3(aud3DMO.getAudAddress5());
		response.setAddressLine6_3(aud3DMO.getAudAddress6());
		response.setAddressPostCode_3(aud3DMO.getAudPostcode());
		response.setAddressTelephone2_3(aud3DMO.getAudTelephoneNo());
		response.setAddressTelephone_3(aud3DMO.getAudTelephoneNo2());
		response.setAddressFax_3(aud3DMO.getAudFaxNo());
		response.setAddressContact_3(aud3DMO.getAudContact());
		response.setAddressEMail_3(aud3DMO.getAudEMail());
		response.setAdressNotes_3(aud3DMO.getAudNotes());
		response.setAddressGeneral1_3(aud3DMO.getAudGeneral1());
		response.setAddressGeneral2_3(aud3DMO.getAudGeneral2());
		response.setAddressGeneral3_3(aud3DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_4(inv4);
		response.setAddressID_4((aud4DMO.getAudAddrid() == null) ? "" : aud4DMO.getAudAddrid().toString());
		response.setAccountNo_4(aud4DMO.getAudAccountNo());
		response.setSubscriberId_4(
				(aud4DMO.getAudSubscriberId() == null) ? "" : aud4DMO.getAudSubscriberId().toString());
		response.setAddresType_4(aud4DMO.getAudAddressType());
		response.setAddresInDate_4(
				(aud4DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud4DMO.getAudInDate()));
		response.setAddressClassification_4(aud4DMO.getAudClassification());
		response.setAddressUniqueID_4(aud4DMO.getAudUniqueId());
		response.setAddressName_4(aud4DMO.getAudName());
		response.setAddressLine1_4(aud4DMO.getAudAddress1());
		response.setAddressLine2_4(aud4DMO.getAudAddress2());
		response.setAddressLine3_4(aud4DMO.getAudAddress3());
		response.setAddressLine4_4(aud4DMO.getAudAddress4());
		response.setAddressLine5_4(aud4DMO.getAudAddress5());
		response.setAddressLine6_4(aud4DMO.getAudAddress6());
		response.setAddressPostCode_4(aud4DMO.getAudPostcode());
		response.setAddressTelephone2_4(aud4DMO.getAudTelephoneNo());
		response.setAddressTelephone_4(aud4DMO.getAudTelephoneNo2());
		response.setAddressFax_4(aud4DMO.getAudFaxNo());
		response.setAddressContact_4(aud4DMO.getAudContact());
		response.setAddressEMail_4(aud4DMO.getAudEMail());
		response.setAdressNotes_4(aud4DMO.getAudNotes());
		response.setAddressGeneral1_4(aud4DMO.getAudGeneral1());
		response.setAddressGeneral2_4(aud4DMO.getAudGeneral2());
		response.setAddressGeneral3_4(aud4DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_5(inv5);
		response.setAddressID_5((aud5DMO.getAudAddrid() == null) ? "" : aud5DMO.getAudAddrid().toString());
		response.setAccountNo_5(aud5DMO.getAudAccountNo());
		response.setSubscriberId_5(
				(aud5DMO.getAudSubscriberId() == null) ? "" : aud5DMO.getAudSubscriberId().toString());
		response.setAddresType_5(aud5DMO.getAudAddressType());
		response.setAddresInDate_5(
				(aud5DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud5DMO.getAudInDate()));
		response.setAddressClassification_5(aud5DMO.getAudClassification());
		response.setAddressUniqueID_5(aud5DMO.getAudUniqueId());
		response.setAddressName_5(aud5DMO.getAudName());
		response.setAddressLine1_5(aud5DMO.getAudAddress1());
		response.setAddressLine2_5(aud5DMO.getAudAddress2());
		response.setAddressLine3_5(aud5DMO.getAudAddress3());
		response.setAddressLine4_5(aud5DMO.getAudAddress4());
		response.setAddressLine5_5(aud5DMO.getAudAddress5());
		response.setAddressLine6_5(aud5DMO.getAudAddress6());
		response.setAddressPostCode_5(aud5DMO.getAudPostcode());
		response.setAddressTelephone2_5(aud5DMO.getAudTelephoneNo());
		response.setAddressTelephone_5(aud5DMO.getAudTelephoneNo2());
		response.setAddressFax_5(aud5DMO.getAudFaxNo());
		response.setAddressContact_5(aud5DMO.getAudContact());
		response.setAddressEMail_5(aud5DMO.getAudEMail());
		response.setAdressNotes_5(aud5DMO.getAudNotes());
		response.setAddressGeneral1_5(aud5DMO.getAudGeneral1());
		response.setAddressGeneral2_5(aud5DMO.getAudGeneral2());
		response.setAddressGeneral3_5(aud5DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_6(inv6);
		response.setAddressID_6((aud6DMO.getAudAddrid() == null) ? "" : aud6DMO.getAudAddrid().toString());
		response.setAccountNo_6(aud6DMO.getAudAccountNo());
		response.setSubscriberId_6(
				(aud6DMO.getAudSubscriberId() == null) ? "" : aud6DMO.getAudSubscriberId().toString());
		response.setAddresType_6(aud6DMO.getAudAddressType());
		response.setAddresInDate_6(
				(aud6DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud6DMO.getAudInDate()));
		response.setAddressClassification_6(aud6DMO.getAudClassification());
		response.setAddressUniqueID_6(aud6DMO.getAudUniqueId());
		response.setAddressName_6(aud6DMO.getAudName());
		response.setAddressLine1_6(aud6DMO.getAudAddress1());
		response.setAddressLine2_6(aud6DMO.getAudAddress2());
		response.setAddressLine3_6(aud6DMO.getAudAddress3());
		response.setAddressLine4_6(aud6DMO.getAudAddress4());
		response.setAddressLine5_6(aud6DMO.getAudAddress5());
		response.setAddressLine6_6(aud6DMO.getAudAddress6());
		response.setAddressPostCode_6(aud6DMO.getAudPostcode());
		response.setAddressTelephone2_6(aud6DMO.getAudTelephoneNo());
		response.setAddressTelephone_6(aud6DMO.getAudTelephoneNo2());
		response.setAddressFax_6(aud6DMO.getAudFaxNo());
		response.setAddressContact_6(aud6DMO.getAudContact());
		response.setAddressEMail_6(aud6DMO.getAudEMail());
		response.setAdressNotes_6(aud6DMO.getAudNotes());
		response.setAddressGeneral1_6(aud6DMO.getAudGeneral1());
		response.setAddressGeneral2_6(aud6DMO.getAudGeneral2());
		response.setAddressGeneral3_6(aud6DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_7(inv7);
		response.setAddressID_7((aud7DMO.getAudAddrid() == null) ? "" : aud7DMO.getAudAddrid().toString());
		response.setAccountNo_7(aud7DMO.getAudAccountNo());
		response.setSubscriberId_7(
				(aud7DMO.getAudSubscriberId() == null) ? "" : aud7DMO.getAudSubscriberId().toString());
		response.setAddresType_7(aud7DMO.getAudAddressType());
		response.setAddresInDate_7(
				(aud7DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud7DMO.getAudInDate()));
		response.setAddressClassification_7(aud7DMO.getAudClassification());
		response.setAddressUniqueID_7(aud7DMO.getAudUniqueId());
		response.setAddressName_7(aud7DMO.getAudName());
		response.setAddressLine1_7(aud7DMO.getAudAddress1());
		response.setAddressLine2_7(aud7DMO.getAudAddress2());
		response.setAddressLine3_7(aud7DMO.getAudAddress3());
		response.setAddressLine4_7(aud7DMO.getAudAddress4());
		response.setAddressLine5_7(aud7DMO.getAudAddress5());
		response.setAddressLine6_7(aud7DMO.getAudAddress6());
		response.setAddressPostCode_7(aud7DMO.getAudPostcode());
		response.setAddressTelephone2_7(aud7DMO.getAudTelephoneNo());
		response.setAddressTelephone_7(aud7DMO.getAudTelephoneNo2());
		response.setAddressFax_7(aud7DMO.getAudFaxNo());
		response.setAddressContact_7(aud7DMO.getAudContact());
		response.setAddressEMail_7(aud7DMO.getAudEMail());
		response.setAdressNotes_7(aud7DMO.getAudNotes());
		response.setAddressGeneral1_7(aud7DMO.getAudGeneral1());
		response.setAddressGeneral2_7(aud7DMO.getAudGeneral2());
		response.setAddressGeneral3_7(aud7DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_8(inv8);
		response.setAddressID_8((aud8DMO.getAudAddrid() == null) ? "" : aud8DMO.getAudAddrid().toString());
		response.setAccountNo_8(aud8DMO.getAudAccountNo());
		response.setSubscriberId_8(
				(aud8DMO.getAudSubscriberId() == null) ? "" : aud8DMO.getAudSubscriberId().toString());
		response.setAddresType_8(aud8DMO.getAudAddressType());
		response.setAddresInDate_8(
				(aud8DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud8DMO.getAudInDate()));
		response.setAddressClassification_8(aud8DMO.getAudClassification());
		response.setAddressUniqueID_8(aud8DMO.getAudUniqueId());
		response.setAddressName_8(aud8DMO.getAudName());
		response.setAddressLine1_8(aud8DMO.getAudAddress1());
		response.setAddressLine2_8(aud8DMO.getAudAddress2());
		response.setAddressLine3_8(aud8DMO.getAudAddress3());
		response.setAddressLine4_8(aud8DMO.getAudAddress4());
		response.setAddressLine5_8(aud8DMO.getAudAddress5());
		response.setAddressLine6_8(aud8DMO.getAudAddress6());
		response.setAddressPostCode_8(aud8DMO.getAudPostcode());
		response.setAddressTelephone2_8(aud8DMO.getAudTelephoneNo());
		response.setAddressTelephone_8(aud8DMO.getAudTelephoneNo2());
		response.setAddressFax_8(aud8DMO.getAudFaxNo());
		response.setAddressContact_8(aud8DMO.getAudContact());
		response.setAddressEMail_8(aud8DMO.getAudEMail());
		response.setAdressNotes_8(aud8DMO.getAudNotes());
		response.setAddressGeneral1_8(aud8DMO.getAudGeneral1());
		response.setAddressGeneral2_8(aud8DMO.getAudGeneral2());
		response.setAddressGeneral3_8(aud8DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_9(inv9);
		response.setAddressID_9((aud9DMO.getAudAddrid() == null) ? "" : aud9DMO.getAudAddrid().toString());
		response.setAccountNo_9(aud9DMO.getAudAccountNo());
		response.setSubscriberId_9(
				(aud9DMO.getAudSubscriberId() == null) ? "" : aud9DMO.getAudSubscriberId().toString());
		response.setAddresType_9(aud9DMO.getAudAddressType());
		response.setAddresInDate_9(
				(aud9DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud9DMO.getAudInDate()));
		response.setAddressClassification_9(aud9DMO.getAudClassification());
		response.setAddressUniqueID_9(aud9DMO.getAudUniqueId());
		response.setAddressName_9(aud9DMO.getAudName());
		response.setAddressLine1_9(aud9DMO.getAudAddress1());
		response.setAddressLine2_9(aud9DMO.getAudAddress2());
		response.setAddressLine3_9(aud9DMO.getAudAddress3());
		response.setAddressLine4_9(aud9DMO.getAudAddress4());
		response.setAddressLine5_9(aud9DMO.getAudAddress5());
		response.setAddressLine6_9(aud9DMO.getAudAddress6());
		response.setAddressPostCode_9(aud9DMO.getAudPostcode());
		response.setAddressTelephone2_9(aud9DMO.getAudTelephoneNo());
		response.setAddressTelephone_9(aud9DMO.getAudTelephoneNo2());
		response.setAddressFax_9(aud9DMO.getAudFaxNo());
		response.setAddressContact_9(aud9DMO.getAudContact());
		response.setAddressEMail_9(aud9DMO.getAudEMail());
		response.setAdressNotes_9(aud9DMO.getAudNotes());
		response.setAddressGeneral1_9(aud9DMO.getAudGeneral1());
		response.setAddressGeneral2_9(aud9DMO.getAudGeneral2());
		response.setAddressGeneral3_9(aud9DMO.getAudGeneral3());

		response.setInvoiceAddressFlag_10(inv10);
		response.setAddressID_10((aud10DMO.getAudAddrid() == null) ? "" : aud10DMO.getAudAddrid().toString());
		response.setAccountNo_10(aud10DMO.getAudAccountNo());
		response.setSubscriberId_10(
				(aud10DMO.getAudSubscriberId() == null) ? "" : aud10DMO.getAudSubscriberId().toString());
		response.setAddresType_10(aud10DMO.getAudAddressType());
		response.setAddresInDate_10(
				(aud10DMO.getAudInDate() == null) ? "" : dtFormatyyyymmddStandard.format(aud10DMO.getAudInDate()));
		response.setAddressClassification_10(aud10DMO.getAudClassification());
		response.setAddressUniqueID_10(aud10DMO.getAudUniqueId());
		response.setAddressName_10(aud10DMO.getAudName());
		response.setAddressLine1_10(aud10DMO.getAudAddress1());
		response.setAddressLine2_10(aud10DMO.getAudAddress2());
		response.setAddressLine3_10(aud10DMO.getAudAddress3());
		response.setAddressLine4_10(aud10DMO.getAudAddress4());
		response.setAddressLine5_10(aud10DMO.getAudAddress5());
		response.setAddressLine6_10(aud10DMO.getAudAddress6());
		response.setAddressPostCode_10(aud10DMO.getAudPostcode());
		response.setAddressTelephone2_10(aud10DMO.getAudTelephoneNo());
		response.setAddressTelephone_10(aud10DMO.getAudTelephoneNo2());
		response.setAddressFax_10(aud10DMO.getAudFaxNo());
		response.setAddressContact_10(aud10DMO.getAudContact());
		response.setAddressEMail_10(aud10DMO.getAudEMail());
		response.setAdressNotes_10(aud10DMO.getAudNotes());
		response.setAddressGeneral1_10(aud10DMO.getAudGeneral1());
		response.setAddressGeneral2_10(aud10DMO.getAudGeneral2());
		response.setAddressGeneral3_10(aud10DMO.getAudGeneral3());

		/**
		 * 
		 * l_aul.aul_lmt_mech, l_aul.aul_lmt_min, l_aul.aul_lmt_max, # 411 Columns
		 * Returned l_cvi.*, # PB CRM value l_hh.hh_name, l_erb.erb_text
		 * 
		 * END FUNCTION
		 * 
		 */

		

		return response;

	}

	private String getSksValue(String sksCode) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, sksCode);
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);

		} catch (EPPIXUnexpectedException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);
		} catch (EPPIXFatalException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);
		}

		if (sksDmo == null) {
			logger.error("Failed getting System key SSRSPULUPD");
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD");
		}

		if (sksDmo != null) {
			return sksDmo.getSksValue();
		} else {
			return null;
		}
	}

	public String[] getCreditControllerAccount(String accountNo) {

		String[] credtControllerDetails = null;
		String fieldName = null;
		String fieldKey = null;
		String creditControllerId = null;

		try {
			fieldName = this.getSksValue("CCALLOCFLD");
		} catch (EPPIXSeriousException e1) {
			logger.debug("Failed to get field name from sks_key_code 'CCALLOCFLD' sks_key_setting table");
		}

		if (fieldName == null || fieldName.length() <= 0) {
			logger.debug("Failed to get field name from sks_key_code 'CCALLOCFLD' sks_key_setting table");

		} else {
			fieldKey = getAuxKeyField(accountNo, fieldName);
			creditControllerId = getAcaCreditControllerId(fieldName, fieldKey);

			if (creditControllerId == null || creditControllerId.length() <= 0) {
				logger.debug("No auxilliary customer details found for customer '" + accountNo
						+ "' in the 'aux_customers' table");

			}
		}

		if (creditControllerId != null && creditControllerId.length() > 0) {
			try {
				credtControllerDetails = null;
				credtControllerDetails = this.getCreditController(creditControllerId);
			} catch (EPPIXSeriousException e) {
				logger.error("CREDIT CONTROLLER: " + creditControllerId + " NAME NOT FOUND: " + e.getMessage());
			}
		}

//		if (credtControllerDetails == null) {
//			credtControllerDetails = new String[] { "", "", "", "", "" };
//		}
		
		return credtControllerDetails;

	}

	public String[] getCreditController(String ccId) throws EPPIXSeriousException {

		String sql = "select * from cca_crd_controller	where cca_controller_id = '" + ccId + "'";

		Statement st = null;
		ResultSet rs = null;

		logger.debug(sql);

		String ccControllerId = null;
		String ccDescription = "";
		String ccTelNumber = "";
		String ccTargetType = "";
		String ccTargetGroup = "";
		String ccTargetUser = "";
		String[] ccDetails = null;

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql.toString());

			while (rs.next()) {
				ccControllerId = rs.getString("cca_controller_id");
				ccDescription = rs.getString("cca_description");
				ccTelNumber = rs.getString("cca_telephone");
				ccTargetType = rs.getString("cca_target_type");
				ccTargetGroup = rs.getString("cca_target_group");
				ccTargetUser = rs.getString("cca_target_user");
			}

			logger.debug("\nCREDIT CONTROLLER: " + ccDescription + "\nCREDIT CONTROLLER TEL:" + ccTelNumber);

			ccDetails = new String[] { ccControllerId, ccDescription, ccTelNumber, ccTargetType, ccTargetGroup, ccTargetUser };

		} catch (SQLException e) {

			logger.error("Credit controller details not found: " + e);
			throw new EPPIXSeriousException("1", "Credit controller details not found: " + e);
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				logger.error("EXCEPTION: " + e);
			}

		}

		if(ccDetails != null) {
		logger.debug("\nCONTROLLER ID: " + ccDetails[0] + 
				"\nCREDIT DESCRIPTION: " + ccDetails[1] + 
				"\nCREDIT CONTROLLER TEL:" + ccDetails[2] +
				"\nCREDIT TARGET TYPE:" + ccDetails[3] +
				"\nCREDIT TARGET GROUP:" + ccDetails[4] +
				"\nCREDIT TARGET USER:" + ccDetails[5]);
		}

		return ccDetails;
	}

	public String getAcaCreditControllerId(String fieldName, String acaEnd) {

		String sql = "SELECT aca_controller_id, aca_end FROM aca_credit_alloc " + "WHERE aca_key_field = '" + fieldName
				+ "' " + "AND aca_end >= '" + acaEnd.trim()
				+ "' AND aca_end NOT IN ('<<DEFAULT>>', '<<LAST>>') ORDER BY aca_end";

		String sql1 = "SELECT * FROM aca_credit_alloc	WHERE aca_key_field = '" + fieldName
				+ "' AND aca_end = '<<DEFAULT>>'";

		String sql2 = "SELECT * FROM aca_credit_alloc	WHERE aca_key_field = '" + fieldName
				+ "' AND aca_end = '<<LAST>>'";

		Statement st = null;
		ResultSet rs = null;
		String value = "";

		try {

			st = this.getConnection().createStatement();
			logger.debug("\n" + sql);
			rs = st.executeQuery(sql);

			while (rs.next()) {
				value = rs.getString("aca_controller_id");

				if (value != null && value.length() >= 0) {
					break;
				}
			}

			logger.debug("Controller ID " + value + ":");

			if (value == null || value.length() <= 0) {

				st = this.getConnection().createStatement();
				logger.debug("\n" + sql1);
				rs = st.executeQuery(sql1);

				while (rs.next()) {
					value = rs.getString("aca_controller_id");
				}

			}

			if (value == null || value.length() <= 0) {

				st = this.getConnection().createStatement();
				logger.debug("\n" + sql2);
				rs = st.executeQuery(sql2);

				while (rs.next()) {
					value = rs.getString("aca_controller_id");
				}
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

		return value;

	}

	public String getAuxKeyField(String accountNo, String fieldName) {

		String sql = "SELECT " + fieldName + " FROM aux_customers WHERE bill_ac_no = '" + accountNo + "'";

		Statement st = null;
		ResultSet rs = null;
		String value = "";

		try {

			st = this.getConnection().createStatement();
			logger.debug("\n" + sql);
			rs = st.executeQuery(sql);

			while (rs.next()) {
				value = rs.getString(fieldName);
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

		return value.trim();
	}
	
	public ErbEpxRskBndDMO getRiskband(Integer riskId, String text) {
		ErbEpxRskBndDMO erbDmo = null;
		
		if(riskId != null && riskId.intValue() > 0) {
			try {
				erbDmo = this.getCustomerDAC.getRiskBandById(riskId);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
		}else if(text != null && text.length() > 0) {
			try {
				erbDmo = this.getCustomerDAC.getRiskBandByText(text);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
		}
		
	return erbDmo;	
		
	}
	
	/**
	 * #------------------------------------------------------------------------------#
		#                                                                              #
		# Purpose   : Retrieves a udv_userdoc_deliv record                             #
		#                                                                              #
		# Accepts   : p_bill_ac_no                                                     #
		#             p_subscriber_id                                                  #
		#             p_doc_type                                                       #
		#                                                                              #
		# Returns   : l_udv.*                                                          #
		#             l_documentdescription                                            #
		#             l_deliverydescription                                            #
		#             l_formatdescription                                              #
		#             l_addressdescription                                             #
		#                                                                              #
		#------------------------------------------------------------------------------#
		*
		*FUNCTION d_udv_get(  p_bill_ac_no ,p_subscriber_id,p_doc_type)
	 * @return
	 */
	public UdvUserdocDelivDMO getUdv(String billAccountNo, Integer subscriberzid, String docType) {
		

		

//		        DEFINE   p_bill_ac_no                   LIKE    udv_userdoc_deliv.udv_bill_ac_no
//		                        ,p_subscriber_id                LIKE    udv_userdoc_deliv.udv_subscriber_id
//		                        ,p_doc_type                             LIKE    udv_userdoc_deliv.udv_doc_type
//
//		                        ,l_sql                                  CHAR(500)
//		                        ,l_udv                  RECORD  LIKE    udv_userdoc_deliv.*
//		                        ,l_documentdescription  LIKE    tt_type_text.tt_text
//		                        ,l_deliverydescription  LIKE    tt_type_text.tt_text
//		                        ,l_formatdescription    LIKE    tt_type_text.tt_text
//		                        ,l_addressdescription   LIKE    tt_type_text.tt_text
//		                        ,l_error                                CHAR(200)
//		                        ,l_function                             CHAR(50)
//
//		        WHENEVER ANY ERROR CALL error_classify

//		        LET l_function = ": d_udv_get()"
		UdvUserdocDelivDMO udvDmo = null;

//		        INITIALIZE l_udv.* TO NULL
//		        INITIALIZE l_documentdescription TO NULL
//		        INITIALIZE l_deliverydescription TO NULL
//		        INITIALIZE l_formatdescription TO NULL
//		        INITIALIZE l_addressdescription TO NULL
//		#------------------------------------------------------------------------------#
		        
//		        IF LENGTH(p_bill_ac_no) != 0 THEN
//		                SELECT udv_userdoc_deliv.*,
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_doc_type = tt_type
//		                           AND tt_group = "DOCTYPE"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_delivery = tt_type
//		                           AND tt_group = "DELIVMTHDS"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_format = tt_type
//		                           AND tt_group = "OUTPTFRMTS"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_address_type = tt_type
//		                           AND tt_group = "ADDRESSTYP"
//		                           AND tt_lang = g_language)
//		                INTO l_udv.*
//		                        ,l_documentdescription  
//		                        ,l_deliverydescription  
//		                        ,l_formatdescription    
//		                        ,l_addressdescription   
//		                  FROM udv_userdoc_deliv
//		                WHERE udv_userdoc_deliv.udv_doc_type = p_doc_type
//		                AND udv_userdoc_deliv.udv_bill_ac_no = p_bill_ac_no
//		        ELSE
//		                IF p_subscriber_id IS NOT NULL THEN
//		                SELECT udv_userdoc_deliv.*,
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_doc_type = tt_type
//		                           AND tt_group = "DOCTYPE"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_delivery = tt_type
//		                           AND tt_group = "DELIVMTHDS"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_format = tt_type
//		                           AND tt_group = "OUTPTFRMTS"
//		                           AND tt_lang = g_language),
//		                       (SELECT tt_text FROM tt_type_text
//		                         WHERE udv_address_type = tt_type
//		                           AND tt_group = "ADDRESSTYP"
//		                           AND tt_lang = g_language)
//		                        INTO l_udv.*
//		                                ,l_documentdescription  
//		                                ,l_deliverydescription  
//		                                ,l_formatdescription    
//		                                ,l_addressdescription   
//		                FROM udv_userdoc_deliv
//		                        WHERE udv_userdoc_deliv.udv_doc_type = p_doc_type
//		                        AND udv_userdoc_deliv.udv_subscriber_id = p_subscriber_id
//		                ELSE
//		                        CALL Error_SeriousError(l_error, l_function)
//		                END IF
//		        END IF

//		        IF SQLCA.SQLCODE = 100 THEN
//		                LET l_error = "No record found in udv_userdoc_deliv table"
//		                CALL Error_NotFoundError(180006, "", l_error, l_function)
//		                INITIALIZE l_udv.* TO NULL
//		                INITIALIZE l_documentdescription TO NULL
//		                INITIALIZE l_deliverydescription TO NULL
//		                INITIALIZE l_formatdescription TO NULL
//		                INITIALIZE l_addressdescription TO NULL
//		        ELSE
//		                IF g_status_class != 0 THEN
//		                        CALL Error_Append("", l_function)
//		                        INITIALIZE l_udv.* TO NULL
//		                        INITIALIZE l_documentdescription TO NULL
//		                        INITIALIZE l_deliverydescription TO NULL
//		                        INITIALIZE l_formatdescription TO NULL
//		                        INITIALIZE l_addressdescription TO NULL
//		                END IF
//		        END IF
		        
//		#------------------------------------------------------------------------------#
//		        RETURN    l_udv.*
//		                        , l_documentdescription
//		                        , l_deliverydescription
//		                        , l_formatdescription
//		                        , l_addressdescription
		return udvDmo ;
//
//		END FUNCTION
	}
	
	public TtTypeTextDMO getTT(String ttGroup, String ttType) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, "ttGroup");
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, ttType);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttLangFilter, "ENG");
		TtTypeTextDMO ttDmo = null;

		try {
			ttDmo = base.ttTypeText().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TT GROUP " + ttGroup + ": for TT TYPE: " + ttType + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TT GROUP " + ttGroup + ": for TT TYPE: " + ttType + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TT GROUP " + ttGroup + ": for TT TYPE: " + ttType + e.getMessage());
		}

		return ttDmo;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}