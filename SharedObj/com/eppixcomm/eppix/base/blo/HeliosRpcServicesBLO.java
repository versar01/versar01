package com.eppixcomm.eppix.base.blo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.Query;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.FraudDetails;
import com.eppixcomm.eppix.base.resp.PackageTariffStatus;
import com.eppixcomm.eppix.base.resp.SimMsisdnAvailable;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DldDynmcLmtDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DlhDynmcLmtHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SlcustmDQO;

public class HeliosRpcServicesBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(GetServiceDiscountBLO.class);
	private Logger logger = thrower.getLogger();
	public HeliosRpcServicesDAC heliosRpcServicesDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private int returnRecords = 0;
	private List<SlcustmDQO> customersList = null;

	@Override
	protected Class getDACClass() {
		return HeliosRpcServicesDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.heliosRpcServicesDAC = (HeliosRpcServicesDAC) dac;
	}

	public SmnSimNosDMO getSimByMsisdn(String msisdn)
			throws EPPIXSeriousException {
		thrower.ifParameterMissing("msisdn", msisdn);

		VamActiveMsisdnDMO vamDmo = null;
		SmnSimNosDMO smnDmo = null;

		// ## Fetch SIM number for 1st MSISDN
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter, msisdn);
		try {
			vamDmo = base.vamActiveMsisdn().get(filter);
		} catch (EPPIXBusinessException e2) {
			logger.error("Exception getting VAM record for MSISDN: " + msisdn
					+ " EXCDEPTION: " + e2);
			throw new EPPIXSeriousException("2",
					"Exception getting record for MSISDN: " + msisdn);
		} catch (EPPIXUnexpectedException e2) {
			logger.error("Exception getting VAM record for MSISDN: " + msisdn
					+ " EXCDEPTION: " + e2);
			throw new EPPIXSeriousException("2",
					"Exception getting record for MSISDN: " + msisdn);
		} catch (EPPIXFatalException e2) {
			logger.error("Exception getting VAM record for MSISDN: " + msisdn
					+ " EXCDEPTION: " + e2);
			throw new EPPIXSeriousException("2",
					"Exception getting record for MSISDN: " + msisdn);
		}

		if (vamDmo == null) {
			logger.error("Failed to get VAM record for MSISDN: " + msisdn);
			throw new EPPIXSeriousException("1", "Record for MSISDN: " + msisdn
					+ " does not exists");
		}

		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter,
				vamDmo.getVamSimNo());

		try {
			smnDmo = base.smnSimNos().get(filter);
		} catch (EPPIXBusinessException e1) {
			logger.error("Exception to get SMN record for MSISDN: " + msisdn
					+ " EXCEPTION: " + e1);
			throw new EPPIXSeriousException("2",
					"Exception to get SMN record for MSISDN: " + msisdn);
		} catch (EPPIXUnexpectedException e1) {
			logger.error("Exception to get SMN record for MSISDN: " + msisdn
					+ " EXCEPTION: " + e1);
			throw new EPPIXSeriousException("2",
					"Exception to get SMN record for MSISDN: " + msisdn);
		} catch (EPPIXFatalException e1) {
			logger.error("Exception to get SMN record for MSISDN: " + msisdn
					+ " EXCEPTION: " + e1);
			throw new EPPIXSeriousException("2",
					"Exception to get SMN record for MSISDN: " + msisdn);
		}

		return smnDmo;

	}

	/**
	 * FUNCTION MsisdnSubscriber_Get(p_msisdn)
	 */
	public SbdSubDetsDMO getMsisdnSubscriber(String msisdn)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("msisdn", msisdn);

		SbdSubDetsDMO sbdDMO = null;

		sbdDMO = this.heliosRpcServicesDAC.getSbdMsisdn(msisdn);

		return sbdDMO;

	}

	/**
	 * FUNCTION CustomerSubFraud_List (p_bill_ac_no, p_Msisdn_No, p_ID_Number,
	 * p_Passport_No, zsize)
	 * 
	 * NOTE: This functionality also exist in HeliosCusotmer Web services. When
	 * making changes to the above service remove from there and make central
	 * from this point.
	 * 
	 * @param billAccount
	 * @param msisdn
	 * @param RsaId
	 * @param passport
	 * @param size
	 * @throws EPPIXSeriousException
	 */
	public List<FraudDetails> getCustomerSubFraudList(String billAccount,
			String msisdn, String rsaId, String passport, int size)
			throws EPPIXSeriousException {

		if ((billAccount == null || billAccount.length() <= 0)
				&& (msisdn == null || msisdn.length() <= 0)
				&& (rsaId == null || rsaId.length() <= 0)
				&& (passport == null || passport.length() <= 0)) {
			logger.error("No Input Parameters provided.");
			throw new EPPIXSeriousException("1",
					"No Input Parameters provided.");
		}

		this.returnRecords = size;
		String searchType = "";
		String searchValue = "";
		DAOIterator custIt = null;
		List<FraudDetails> list = null;

		// FUNCTION CustomerSubFraud_List (p_bill_ac_no, p_Msisdn_No,
		// p_ID_Number, p_Passport_No, zsize)
		// DEFINE
		// p_bill_ac_no LIKE aux_customers.bill_ac_no,
		// p_Msisdn_No LIKE vam_active_msisdn.vam_msisdn_no,
		// p_ID_Number LIKE aux_customers.id_number,
		// p_Passport_No LIKE aux_customers.aux_analysis_13,
		// zsize INTEGER,
		//
		// lr_fraud ARRAY[2000] OF RECORD
		// bill_ac_no LIKE aux_customers.bill_ac_no,
		// account_status LIKE aux_customers.acc_status,
		// mtn_status LIKE aux_customers.aux_analysis_24,
		// fraud_subs INTEGER,
		// susp_fraud_subs INTEGER
		String fraudStr = null;
		String statCode = null;
		IntegerDMO countFraudSubs = null;

		// END RECORD,
		// lr_cust_list RECORD
		// customer LIKE slcustm.customer,
		// name LIKE slcustm.name,
		// address1 LIKE slcustm.address1,
		// address2 LIKE slcustm.address2,
		// address3 LIKE slcustm.address3,
		// address4 LIKE slcustm.address4,
		// group_customer LIKE slcustm.group_customer,
		// group_name LIKE slcustm.name,
		// user_name LIKE sbd_sub_dets.sbd_surname,
		// subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id
		// END RECORD,
		// lr_aux RECORD LIKE aux_customers.*,
		// l_start_at LIKE slcustm.customer,
		// l_stat_code LIKE vam_active_msisdn.vam_stat_code,
		// l_fraud_str LIKE sba_sub_aux.sba_analysis_25,
		// l_error CHAR(512),
		// l_sql CHAR(512),
		// l_search_value CHAR(32),
		// l_function CHAR(50),
		// l_search_type CHAR(1),
		// l_found_cust CHAR(1),
		// l_loop INTEGER,
		// l_no_records INTEGER,
		// l_push_status SMALLINT

		//
		// WHENEVER ANY ERROR CALL error_classify
		// LET l_function = ": CustomerSubFraud_List()"
		// CALL DebugStart ("CustSubFraud_List")
		// INITIALIZE lr_cust_list.*, lr_aux.* TO NULL
		// LET l_found_cust = "N"
		// LET l_start_at = "1"
		// LET l_search_value = ""
		// LET l_search_type = ""
		// LET l_stat_code = ""
		// LET l_fraud_str = ""
		// LET l_loop = 0
		// LET l_no_records = 0
		//
		// WHILE TRUE
		// IF ((LENGTH(p_bill_ac_no) = 0 OR p_bill_ac_no IS NULL)
		// AND (LENGTH(p_Msisdn_No) = 0 OR p_Msisdn_No IS NULL)
		// AND (LENGTH(p_ID_Number) = 0 OR p_ID_Number IS NULL)
		// AND (LENGTH(p_Passport_No) = 0 OR p_Passport_No IS NULL)) THEN
		// LET l_error = "No Input Parameters provided."
		// CALL Error_SeriousError (l_error, l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_error = "INFO: p_bill_ac_no : ", p_bill_ac_no CLIPPED, "\n",
		// "p_Msisdn_No : ", p_Msisdn_No CLIPPED, "\n",
		// "p_ID_Number : ", p_ID_Number CLIPPED, "\n",
		// "p_Passport_No : ", p_Passport_No CLIPPED, "\n"
		// CALL DebugLog (l_error)
		//
		// FOR l_loop = 1 TO 2000
		// INITIALIZE lr_fraud[l_loop].* TO NULL
		// LET lr_fraud[l_loop].bill_ac_no = ""
		// LET lr_fraud[l_loop].account_status = ""
		// LET lr_fraud[l_loop].mtn_status = ""
		// LET lr_fraud[l_loop].fraud_subs = 0
		// LET lr_fraud[l_loop].susp_fraud_subs = 0
		// END FOR
		//
		// CASE
		// WHEN LENGTH(p_bill_ac_no) > 0
		// LET l_search_value = p_bill_ac_no CLIPPED
		// LET l_search_type = "A"
		// WHEN LENGTH(p_Msisdn_No) > 0
		// LET l_search_value = p_Msisdn_No CLIPPED
		// LET l_search_type = "M"
		// WHEN LENGTH(p_ID_Number) > 0
		// LET l_search_value = p_ID_Number CLIPPED
		// LET l_search_type = "I"
		// WHEN LENGTH(p_Passport_No) > 0
		// LET l_search_value = p_Passport_No CLIPPED
		// LET l_search_type = "I"
		// END CASE
		if (billAccount != null && billAccount.length() > 0) {
			searchType = "A";
			searchValue = billAccount;
		} else if (msisdn != null && msisdn.length() > 0) {
			searchType = "M";
			searchValue = msisdn;
		} else if (rsaId != null && rsaId.length() > 0) {
			searchType = "I";
			searchValue = rsaId;
		} else if (passport != null && passport.length() > 0) {
			searchType = "I";
			searchValue = passport;
		}

		// \\
		// CALL d_customer_list_open (l_start_at, l_search_type, l_search_value)

		//
		// LET l_error = "INFO: d_customer_list_open (", l_start_at CLIPPED,
		// ", ", l_search_type CLIPPED, ", ", l_search_value CLIPPED, ")",
		// " g_status_class : ", g_status_class
		// CALL DebugLog (l_error)
		//
		// IF (g_status_class != 0) THEN
		// CALL Error_Append ("", l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_error = "INFO : l_search_type : ", l_search_type CLIPPED,
		// " l_search_value : ", l_search_value CLIPPED
		// CALL DebugLog (l_error)
		//
		// LET l_sql = "SELECT COUNT(*) ",
		// " FROM vam_active_msisdn, sba_sub_aux ",
		// " WHERE vam_subscriber_id = sba_subscriber_id ",
		// " AND sba_inv_account = ? ",
		// " AND sba_analysis_25 = ? ",
		// " AND vam_stat_code = ? ",
		// " AND vam_msisdn_known != '3'"
		//
		// PREPARE s_get_fraud FROM l_sql
		// DECLARE c_get_fraud CURSOR FOR s_get_fraud
		//
		// IF (g_status_class != 0) THEN
		// LET l_error = "Error with Declare CURSOR c_get_fraud FOR s_get_fraud"
		// CALL Error_Append (l_error, l_function)
		// EXIT WHILE
		// END IF
		//
		// LET l_error = "INFO: l_sql : ", l_sql CLIPPED
		// CALL DebugLog (l_error)
		//
		// WHILE TRUE
		// CALL d_customer_list_fetch (l_search_type, l_search_value)
		// RETURNING lr_cust_list.*
		custIt = this.getCustomerListIterator("1", searchType, searchValue,
				null);
		AuxCustomersDMO auxDMO = null;

		int count = 0;

		while (custIt.hasNext() && count < this.getReturnRecords()) {
			SlcustmDQO dqo = (SlcustmDQO) custIt.next();
			// LET l_error = "INFO: d_customer_list_fetch (", l_search_type
			// CLIPPED, ",", l_search_value CLIPPED, ") g_status_class : ",
			// g_status_class
			// CALL DebugLog (l_error)
			auxDMO = null;
			//
			// CASE
			// WHEN g_status_class = 100
			// IF (l_found_cust = "Y") THEN
			// CALL Error_Reset ()
			// END IF
			// EXIT WHILE
			// WHEN g_status_class != 0
			// CALL Error_Append ("", l_function)
			// EXIT WHILE
			// END CASE
			//
			// CALL aux_cust_get (lr_cust_list.customer)
			// RETURNING lr_aux.*
			try {
				auxDMO = this.getAuxCustomer(dqo.getCustomer());

				if (auxDMO == null) {
					logger.error("\nFailed getting aux customer: "
							+ dqo.getCustomer());
					break;
				}

			} catch (EPPIXFatalException e) {
				logger.error("\nException getting aux customer: "
						+ dqo.getCustomer() + " " + e.getMessage());
				break;
			}
			//
			// LET l_error = "INFO: aux_cust_get (", lr_cust_list.customer
			// CLIPPED, ") g_status_class : ", g_status_class
			// CALL DebugLog (l_error)
			//
			// IF (g_status_class != 0) THEN
			// CALL Error_Append ("", l_function)
			// EXIT WHILE
			// END IF
			FraudDetails fDetails = new FraudDetails();
			//
			// LET l_found_cust = "Y"
			// LET l_no_records = l_no_records + 1
			// LET lr_fraud[l_no_records].bill_ac_no = lr_aux.bill_ac_no
			// LET lr_fraud[l_no_records].account_status = lr_aux.acc_status
			// LET lr_fraud[l_no_records].mtn_status = lr_aux.aux_analysis_24
			// LET lr_fraud[l_no_records].susp_fraud_subs = 0
			// LET lr_fraud[l_no_records].fraud_subs = 0
			fDetails.setBillAacNo(auxDMO.getBillAcNo());
			fDetails.setAccountStatus(auxDMO.getAccStatus());
			fDetails.setMtnStatus(auxDMO.getAuxAnalysis24());
			fDetails.setFraudSubs(new Integer(0));
			fDetails.setSuspFraudSubs(new Integer(0));

			statCode = "4";
			fraudStr = "FRAUD SUSPECTED";
			// LET l_stat_code = "4"
			// LET l_fraud_str = "FRAUD SUSPECTED"
			// FOREACH c_get_fraud USING lr_aux.bill_ac_no, l_fraud_str,
			// l_stat_code
			// INTO lr_fraud[l_no_records].susp_fraud_subs
			// EXIT FOREACH
			// END FOREACH
			countFraudSubs = this.heliosRpcServicesDAC.getCountFraudSubs(
					auxDMO.getBillAcNo(), fraudStr, statCode);

			if (countFraudSubs != null && countFraudSubs.getIntValue() > 0) {
				fDetails.setSuspFraudSubs(new Integer(countFraudSubs
						.getIntValue()));
			}
			//
			// LET l_stat_code = "6"
			// LET l_fraud_str = "FRAUD"
			statCode = "6";
			fraudStr = "FRAUD";
			// FOREACH c_get_fraud USING lr_aux.bill_ac_no, l_fraud_str,
			// l_stat_code
			// INTO lr_fraud[l_no_records].fraud_subs
			// EXIT FOREACH
			// END FOREACH
			countFraudSubs = this.heliosRpcServicesDAC.getCountFraudSubs(
					auxDMO.getBillAcNo(), fraudStr, statCode);

			if (countFraudSubs != null && countFraudSubs.getIntValue() > 0) {
				fDetails.setFraudSubs(new Integer(countFraudSubs.getIntValue()));
			}
			//
			// LET l_error = "INFO: lr_aux.bill_ac_no : ", lr_aux.bill_ac_no
			// CLIPPED, " lr_fraud.susp_fraud_subs : ",
			// lr_fraud[l_no_records].susp_fraud_subs,
			// " lr_fraud.fraud_subs : ", lr_fraud[l_no_records].fraud_subs,
			// " g_status_class : ", g_status_class
			// CALL DebugLog (l_error)
			// END WHILE

			if (list == null) {
				list = new ArrayList<FraudDetails>();
			}

			logger.debug(fDetails.toString());
			list.add(fDetails);
			count++;
		}
		//
		// LET l_error = "INFO: Before FOR LOOP, g_status_class : ",
		// g_status_class, " l_no_records : ", l_no_records
		// CALL DebugLog (l_error)
		//
		// IF (g_status_class = 0) THEN
		// IF (l_no_records = 0) THEN
		// LET l_no_records = 1
		// END IF
		//
		// FOR l_loop = 1 TO l_no_records
		// -- Return data thru 'C' Push function
		// CALL Push_CustomerSubFraud_List (lr_fraud[l_loop].bill_ac_no,
		// lr_fraud[l_loop].account_status,
		// lr_fraud[l_loop].mtn_status,
		// lr_fraud[l_loop].fraud_subs,
		// lr_fraud[l_loop].susp_fraud_subs)
		// RETURNING l_push_status
		//
		// LET l_error = "INFO : Push_CustomerSubFraud_List(",
		// lr_fraud[l_loop].bill_ac_no CLIPPED, " ...) l_push_status : ",
		// l_push_status
		// CALL DebugLog (l_error)
		//
		// IF (l_push_status != 0) THEN
		// LET l_error =
		// "Error in Push_CustomerSubFraud_List, l_push_status : ",
		// l_push_status
		// CALL Error_SeriousError (l_error, l_function)
		// EXIT FOR
		// END IF
		// END FOR
		// END IF
		// EXIT WHILE
		// END WHILE
		//
		// IF (g_status_class = 0) THEN
		// CALL d_customer_list_close(l_search_type)
		//
		// IF (g_status_class != 0) THEN
		// CALL Error_Append ("", l_function)
		// END IF
		// END IF
		//
		// END FUNCTION
		return list;
	}

	private DAOIterator getCustomerListIterator(String accountNo,
			String searchType, String matchString, String dealerId)
			throws EPPIXSeriousException {

		DAOIterator custIt = null;
		int matchLen = matchString.length();
		IntegerDMO count = null;

		// # initialize the m_last_match_len, if req'd
		// # used to signal if sql needs re-prepared for invoice number query
		if (searchType.equals("T")) {

			// # if p_match_string = "*" then we do not include it in the select
			// because all the acc types will by default be included.
			if (matchString.equals("*")) {

				custIt = this.heliosRpcServicesDAC.cutomerListT(accountNo);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListTMatchTTCount(
						accountNo, matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListTMatchTT(
						accountNo, matchString);
			}

		} else if (searchType.equals("A")) {
			// -- Search on account number

			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListADealerId(
						accountNo, dealerId, matchString);
			} else {

//				 count =  this.heliosRpcServicesDAC.cutomerListACount(accountNo,
//				 matchString);
//				
//				 if(count.getIntValue() > this.getReturnRecords()){
//				 logger.error("Records exceed the MAX number of records (" +
//				 this.getReturnRecords() +
//				 ") for the search criteria. Record returned: " +
//				 count.getIntValue());
//				 throw new EPPIXSeriousException("102",
//				 "Records exceed the MAX number of records (" +
//				 this.getReturnRecords() +
//				 ") for the search criteria. Record returned: " +
//				 count.getIntValue());
//				 }

				custIt = this.heliosRpcServicesDAC.cutomerListA(accountNo,
						matchString);
			}
		} else if (searchType.equals("B")) {

			// -- Search on Customer ID number
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListBDealerId(
						matchString, dealerId);
			} else {
				count = this.heliosRpcServicesDAC
						.cutomerListBCount(matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListB(matchString);
			}
		} else if (searchType.equals("E")) {
			// -- Search on account number
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListEDelaerId(
						accountNo, dealerId, matchString);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListECount(accountNo,
						matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListE(accountNo,
						matchString);
			}
		} else if (searchType.equals("R")) {

			// -- Search on account number
			// CALL Validate_String(p_match_string) RETURNING l_string_valid
			/**
			 * SJ: validate string function only check if matchString is a valid
			 * integer (serial) value.
			 */
			Integer serial = null;
			boolean isValidString = false;

			try {
				serial = new Integer(matchString);
				isValidString = true;
			} catch (NumberFormatException e) {
				isValidString = false;
			}

			if (isValidString) {

				count = this.heliosRpcServicesDAC
						.cutomerListRValidCount(matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC
						.cutomerListRValid(matchString);
			} else {

				count = this.heliosRpcServicesDAC
						.cutomerListRCount(matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListR(matchString);
			}

		} else if (searchType.equals("N")) {

			// -- Search on Customer name
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListNDealId(
						accountNo, dealerId, matchString);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListNCount(accountNo,
						matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListN(accountNo,
						matchString);
			}

		} else if (searchType.equals("D")) {

			// ## Search on subscriber name
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListDDealId(
						accountNo, dealerId, matchString, matchString);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListDCount(accountNo,
						matchString, matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListD(accountNo,
						matchString, matchString);
			}

		} else if (searchType.equals("P")) {

			// -- Search on postcode
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListPDealerId(
						accountNo, dealerId, matchString);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListPCount(accountNo,
						matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListP(accountNo,
						matchString);
			}
		} else if (searchType.equals("C")) {

			// ---search on account search code
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListCDealerId(
						accountNo, dealerId, matchString);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListCCount(accountNo,
						matchString);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListC(accountNo,
						matchString);
			}

		} else if (searchType.equals("M")) {

			// -- Search on MSISDN number
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListMDealerId(
						matchString, accountNo, dealerId);
			} else {

				// count = this.heliosRpcServicesDAC.cutomerListMCount(
				// matchString, accountNo);
				//
				// if(count.getIntValue() > this.getReturnRecords()){
				// logger.error("Records exceed the MAX number of records (" +
				// this.getReturnRecords() +
				// ") for the search criteria. Record returned: " +
				// count.getIntValue());
				// throw new EPPIXSeriousException("102",
				// "Records exceed the MAX number of records (" +
				// this.getReturnRecords() +
				// ") for the search criteria. Record returned: " +
				// count.getIntValue());
				// }

				custIt = this.heliosRpcServicesDAC.cutomerListM(matchString,
						accountNo);
			}
		} else if (searchType.equals("S")) {

			// -- Search on SIM number
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListSDealerId(
						matchString, accountNo, dealerId);
			} else {

				count = this.heliosRpcServicesDAC.cutomerListSCount(
						matchString, accountNo);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListS(matchString,
						accountNo);
			}
		} else if (searchType.equals("I")) {

			// -- Search on Customer ID number
			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListIDealerId(
						matchString, matchString, accountNo, dealerId);
			} else {

				// count =
				// this.heliosRpcServicesDAC.cutomerListICount(matchString,matchString,
				// accountNo);

				// if(count.getIntValue() > this.getReturnRecords()){
				// logger.error("Records exceed the MAX number of records (" +
				// this.getReturnRecords() +
				// ") for the search criteria. Record returned: " +
				// count.getIntValue());
				// throw new EPPIXSeriousException("102",
				// "Records exceed the MAX number of records (" +
				// this.getReturnRecords() +
				// ") for the search criteria. Record returned: " +
				// count.getIntValue());
				// }

				custIt = this.heliosRpcServicesDAC.cutomerListI(matchString,
						matchString, accountNo);
			}
		} else if (searchType.equals("V")) {

			logger.debug("\nmatchLen: " + matchLen + "\nmatchString: "
					+ matchString + "\naccountNo: " + accountNo
					+ "\ndealerId: " + dealerId);
			// -- Search on Invoice Number
			if (dealerId != null && dealerId.length() > 0 && matchLen > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListVDealerIdMatch(
						matchLen, matchString, accountNo, dealerId);
			} else if (dealerId == null || dealerId.length() == 0
					&& matchLen > 0) {

				count = getCutomerSearchTypeVCount(matchString, accountNo);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				getCutomerSearchTypeV(matchString, accountNo);

			} else if (dealerId != null && dealerId.length() > 0
					&& matchLen <= 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListVDealerId(
						accountNo, dealerId);
			} else {

				count = getCutomerSearchTypeVCount(matchString, accountNo);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				this.getCutomerSearchTypeV(null, accountNo);
			}
		} else if (searchType.equals("U")) {

			// #SR - Story:49168 - 07/07/2015
			// -- Search on Subscriber ID
			Integer subscriberId = null;
			if (matchString != null && matchString.length() > 0) {
				subscriberId = new Integer(matchString);
			}

			if (dealerId != null && dealerId.length() > 0) {
				custIt = this.heliosRpcServicesDAC.cutomerListUDealerId(
						subscriberId, accountNo, dealerId);
			} else {

				count = this.heliosRpcServicesDAC
						.cutomerListUCount(subscriberId);

				if (count.getIntValue() > this.getReturnRecords()) {
					logger.error("Records exceed the MAX number of records ("
							+ this.getReturnRecords()
							+ ") for the search criteria. Record returned: "
							+ count.getIntValue());
					throw new EPPIXSeriousException(
							"102",
							"Records exceed the MAX number of records ("
									+ this.getReturnRecords()
									+ ") for the search criteria. Record returned: "
									+ count.getIntValue());
				}

				custIt = this.heliosRpcServicesDAC.cutomerListU(subscriberId);
			}
		}
		return custIt;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose : High Level function to check if the Package and
	 * Tariff is active. # # Accepts : p_package_code - Package Code # # Returns
	 * : p_tariff - Intrnal Tariff code #
	 * #--------------------------------------
	 * ----------------------------------------# FUNCTION
	 * PackageTariffStatus_Get(p_package_code, p_tariff)
	 * 
	 * @param pacKage
	 * @param tariff
	 */
	public PackageTariffStatus getPackageTariffStatus(String pacKage,
			String tariff) throws EPPIXSeriousException {

		logger.debug("\nString pacKage: " + pacKage + "\nString tariff: "
				+ tariff);

		thrower.ifParameterMissing("pacKage", pacKage);
		thrower.ifParameterMissing("tariff", tariff);

		VpkPackageDMO vpkDMO = null;
		TsTariffServiceDMO tsDMO = null;

		PackageTariffStatus packTariffActive = new PackageTariffStatus();

		// --Get package STATUS
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VpkPackageDMO.vpkPackageCodeFilter, pacKage);

		try {
			vpkDMO = base.vpkPackage().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
		
		logger.debug("\nvpkDMO: " + vpkDMO);
		
		if (vpkDMO == null) {
			packTariffActive.setPackageActive(false);
			packTariffActive.setTariffActive(false);
			return packTariffActive;
		} else {
			logger.debug("\nvpkDMO.getVpkSuspend(): " + vpkDMO.getVpkSuspend());
			if (vpkDMO.getVpkSuspend().equals("N")) {
				packTariffActive.setPackageActive(true);
			} else {
				packTariffActive.setPackageActive(false);
			}
		}

		// --Get tariff STATUS
		try {
			tsDMO = this.heliosRpcServicesDAC.getTariffPackageStatus(pacKage,
					tariff);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		logger.debug("\ntsDMO" + tsDMO);

		if (tsDMO == null) {
//			packTariffActive.setPackageActive(false);
			packTariffActive.setTariffActive(false);
			return packTariffActive;
		} else {
			logger.debug("\ntsDMO.getTsActInclusive(): " + tsDMO.getTsActInclusive());
			if (!tsDMO.getTsActInclusive().equals("S")) {
				packTariffActive.setTariffActive(true);
			} else {
				packTariffActive.setTariffActive(false);
			}
		}

		return packTariffActive;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose: Validates SIM and MSISDN # # Accepts: p_sim_no,
	 * p_msisdn # # Returns: l_sim_avail, l_msisdn_avail #
	 * #----------------------
	 * --------------------------------------------------------# FUNCTION
	 * Validate_Available(p_sim_no, p_msisdn)
	 * 
	 * @param simNo
	 * @param msisdn
	 */
	public SimMsisdnAvailable validateAvailableSimMsisdn(String simNo,
			String msisdn) throws EPPIXSeriousException {

		logger.debug("\nString simNo: " + simNo + "\nString msisdn: " + msisdn);

		VamActiveMsisdnDMO vamDMO = null;
		MsiMsisdnNosDMO msiDMO = null;
		SmnSimNosDMO smnDMO = null;
		SimMsisdnAvailable response = new SimMsisdnAvailable();
		
		
		if((simNo == null || simNo.length() <= 0) && (msisdn == null || msisdn.length() <= 0)){
			logger.error("Parameter 'simNo and  msisdn' may not be null!");
			throw new EPPIXSeriousException("1", "Parameter 'simNo and  msisdn' may not be null!");
			
		}

//		if((rsaId != null && rsaId.length() > 0) && (msisdn != null && msisdn.length() > 0)){
//			logger.error("Only One of ID or Passort should be provided!");
//			throw new EPPIXSeriousException("1", "Only One of ID or Passort should be provided!");
//
//		}
		

		// # Perform GET
		if (simNo != null && simNo.length() > 0) {
			QueryFilter filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

			try {
				smnDMO = base.smnSimNos().get(filter);
			} catch (EPPIXBusinessException e) {
				logger.error(e.getMessage());
			} catch (EPPIXUnexpectedException e) {
				logger.error(e.getMessage());
			} catch (EPPIXFatalException e) {
				logger.error(e.getMessage());
			}

			if (smnDMO == null) {
				response.setSimAvailable("3");
			} else {
				if (smnDMO.getSmnStatus().equals("0")) {
					response.setSimAvailable("1");
				} else {
					response.setSimAvailable("2");
				}
			}
		} 
		
		if (msisdn != null && msisdn.length() > 0) {

			QueryFilter filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter,
					msisdn);
			try {
				vamDMO = base.vamActiveMsisdn().get(filter);
			} catch (EPPIXBusinessException e2) {
				logger.error("Exception getting VAM record for MSISDN: "
						+ msisdn + " EXCDEPTION: " + e2);
			} catch (EPPIXUnexpectedException e2) {
				logger.error("Exception getting VAM record for MSISDN: "
						+ msisdn + " EXCDEPTION: " + e2);
			} catch (EPPIXFatalException e2) {
				logger.error("Exception getting VAM record for MSISDN: "
						+ msisdn + " EXCDEPTION: " + e2);
			}

			if (vamDMO == null) {
				logger.error("Failed to get VAM record for MSISDN: " + msisdn);

				try {
					msiDMO = this.getMsi(msisdn);
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}

				if (msiDMO == null) {
					response.setMsisdnAvailable("3");
				} else {
					if (msiDMO.getMsiStatus().equals("0")) {
						response.setMsisdnAvailable("1");
					} else {
						response.setMsisdnAvailable("2");
					}
				}

			} else {
				response.setMsisdnAvailable("3");
			}
		} 
//		else {
//			// This is an error as no valid paramters was recieved.
//			logger.error("Failed to find msisdn: " + msisdn);
//			response.setMsisdnAvailable("3");
//		}

		return response;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose : Retrieves details from the msi_msisdn_nos table # #
	 * Accepts : p_msisdn_no - MSISDN Number # # Returns : l_msi - MSISDN
	 * Details #
	 * #----------------------------------------------------------------
	 * --------------# FUNCTION d_msi_get(p_msisdn_no)
	 * 
	 * @param msisnd
	 * @return
	 */
	public MsiMsisdnNosDMO getMsi(String msisdn) throws EPPIXSeriousException {

		TtTypeTextDMO ttDMO = null;
		MsiMsisdnNosDMO msiDMO = null;

		String origMsisdn = null;
		String billAcNo = null;
		String accType = null;

		// --NSM - check for a hosted number to return dummy msi record. I put
		// it in this to make one central code change
		logger.debug("\nMSISDN FORM TT GROUP : 'HPBXNONMTN'"
				+ msisdn.substring(0, 3));

		ttDMO = this.getTtTypeTextByGroup("HPBXNONMTN", msisdn.substring(0, 3));

		if (ttDMO != null) {
			origMsisdn = msisdn;
			msisdn = "0110000000";
		}

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, MsiMsisdnNosDMO.MsiMsisdnNoFilter, msisdn);

		try {
			msiDMO = base.msiMsisdnNos().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		if (msiDMO == null) {
			logger.error("Cannot find details for MSISDN " + msisdn);
			throw new EPPIXSeriousException("122039",
					"Cannot find details for MSISDN " + msisdn);
		}

		// --NSM - need to check if we had stored the original msisdn [hosted]
		// so we can pass it back
		if (origMsisdn != null && origMsisdn.length() > 0) {
			msiDMO.setMsiMsisdnNo(origMsisdn);
		}

		return msiDMO;
	}

	private TtTypeTextDMO getTtTypeTextByGroup(String group, String type) {

		TtTypeTextDMO ttDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, type);
		String val = null;

		try {
			ttDmo = base.ttTypeText().get(filter);

			if (ttDmo == null) {
				logger.error("Failed getting TT_TYPE_TEXT for group: " + group);
				return null;
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting TT_TYPE_TEXT for group: " + group
					+ " " + e);
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting TT_TYPE_TEXT for group: " + group
					+ " " + e);
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting TT_TYPE_TEXT for group: " + group
					+ " " + e);
			return null;
		}

		return ttDmo;
	}
	
	/**
	 * 	#------------------------------------------------------------------------------#
		# Purpose: Creates a record in the 'sbe_sub_equip' table.                      #
		# Accepts: p_sbe.*              - Complete sbe_sub_equip table record          #
		# Returns: l_serial             - Serial ID for INSERT                         #
		#------------------------------------------------------------------------------#
		FUNCTION SubscriberDevice_Create(p_sbe)
	 */
	public Integer createSubscriberDevice(SbeSubEquipDMO sbeDmo)throws EPPIXSeriousException{

		logger.debug(sbeDmo.toString());

		SksKeySettingDMO sksDMO = null;
		int waitDays = 0;
		Date sbeDate = null;
		SbuSubUpgradeDMO sbuDMO = null;
		SbdSubDetsDMO sbdDMO = null;
		String histComment = "";

//			-- Get user's logname and terminal id
//			LET l_username = getuser()
//			LET l_hostname = gethost()
		
		if(sbeDmo.getSbeSubEquipId() == null){
			sbeDmo.setSbeSubEquipId(new Integer(0));
		}else{
			if(sbeDmo.getSbeSubEquipId().intValue() > 0){
			logger.error("Serial field 'p_sbe.sbe_sub_equip_id' must be 0 for create!: " + sbeDmo.getSbeSubEquipId());
			throw new EPPIXSeriousException("1", "Serial field 'p_sbe.sbe_sub_equip_id' must be 0 for create!");
			}
		}

		thrower.ifParameterMissing("sbeDmo.getSbeSubscriberId()", sbeDmo.getSbeSubscriberId());
		thrower.ifParameterMissing("sbeDmo.getSbeCaptureDate()", sbeDmo.getSbeCaptureDate());
		
		if((sbeDmo.getSbeImeiNo() == null || sbeDmo.getSbeImeiNo().length() <= 0) &&
				(sbeDmo.getSbeSerialNo() == null || sbeDmo.getSbeSerialNo().length() <= 0)){
			logger.error("Either IMEI No or Serial No is required");
			throw new EPPIXSeriousException("Either IMEI No or Serial No is required");
		}

//		Column sbe_active_date is defined as NOT NULL
		if(sbeDmo.getSbeActiveDate() == null){
			sbeDmo.setSbeActiveDate(new Date());
		}

		if(sbeDmo.getSbeHandsetVal() == null){
			sbeDmo.setSbeHandsetVal(new Double("0"));
		}

		if(sbeDmo.getSbeEarlytermChg() == null){
			sbeDmo.setSbeEarlytermChg(new Double("0"));
		}

		sbeDmo.setSbeHandsetVal(sbeDmo.getSbeHandsetVal() - sbeDmo.getSbeEarlytermChg());
		sbeDmo.setSbeEarlytermChg(new Double("0"));
		
		if(sbeDmo.getSbeAddCharge1() == null){
			sbeDmo.setSbeAddCharge1(new Double("0"));
		}

		if(sbeDmo.getSbeAddCharge2() == null){
			sbeDmo.setSbeAddCharge2(new Double("0"));
	}
		
//		#GNCS - Yellow Trader - MAKE desc to CAPS
		if(sbeDmo.getSbeMake() != null && sbeDmo.getSbeMake().length() > 0){
			sbeDmo.setSbeMake(sbeDmo.getSbeMake().toUpperCase());
		}
//
		if(sbeDmo.getSbeUpgradeId().intValue() == 0){
			sksDMO = this.getSks("EQPWAITPRD");

			if(sksDMO == null){
				waitDays = 7;
			}else{
				waitDays = new Integer(sksDMO.getSksValue()).intValue();
			}
				
			sbeDate = new Date(sbeDmo.getSbeActiveDate());
			sbeDate = Date.addDays(-waitDays, sbeDate);

			try {
				sbuDMO = this.heliosRpcServicesDAC.getSubcriberSbu(sbeDmo.getSbeSubscriberId(), sbeDate);
			} catch (EPPIXSeriousException e) {
				logger.error("\nFailed to get SBU for subscriber: " + sbeDmo.getSbeSubscriberId() + " and date: " + sbeDate + " " + e.getMessage());
			}
			
			if(sbuDMO != null){
				sbeDmo.setSbeUpgradeId(sbuDMO.getSbuSubupgradeId());
			}

			sbdDMO = this.getSbd(sbeDmo.getSbeSubscriberId());
			
			if(sbdDMO != null){
				sbeDmo.setSbeMsisdn(sbdDMO.getSbdDiallingNo());
			}
		}

//		--Perform INSERT into sbe_sub_equip
		try {
			base.sbeSubEquip().create(sbeDmo);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to insert the subscriber equipement record");
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to insert the subscriber equipement record");
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to insert the subscriber equipement record");
		}
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.MAX, SbeSubEquipDMO.sbeSubEquipIdFilter);
		Integer serialDMO = null;
		try {
			serialDMO = (Integer)base.sbeSubEquip().max(filter);
		} catch (EPPIXBusinessException e2) {
			logger.error(e2.getMessage());
		} catch (EPPIXUnexpectedException e2) {
			logger.error(e2.getMessage());
		} catch (EPPIXFatalException e2) {
			logger.error(e2.getMessage());
		}

//		#Create the history of this
		if( sbeDmo.getSbeProductCode() != null){
			histComment = sbeDmo.getSbeProductCode().trim();
		}else{
			histComment = "";
		}
		
		if(sbeDmo.getSbeImeiNo() != null && sbeDmo.getSbeImeiNo().length() > 0){
			histComment = histComment + " " + sbeDmo.getSbeImeiNo().trim();
		}
	
		if(sbeDmo.getSbeSerialNo() != null && sbeDmo.getSbeSerialNo().length() > 0){
			histComment = "Serial - " + sbeDmo.getSbeSerialNo();
		}
		
		/**
		 * Change done 04-10-2019
		 * INC2537483
		 */

		try {
			this.createSubscriberHistory(sbeDmo.getSbeSubscriberId(), new Integer("0"), "EQPA", "", histComment);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
//		} catch (NumberFormatException e) {
//			logger.error(e.getMessage());
//			try {
//				this.createSubscriberHistory(sbeDmo.getSbeSubscriberId(), new Integer(0), "EQPA", "", histComment);
//			} catch (EPPIXSeriousException e1) {
//				logger.error(e.getMessage());
//			}
		}

		return serialDMO;
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
	
	protected void createSubscriberHistory(Integer subscriberId,
			Integer fieldId, String histCode, String oldValue, String newValue)
			throws EPPIXSeriousException {

		SbhSubHistoryDMO sbhDMO = new SbhSubHistoryDMO();
		sbhDMO.setSbhSubscriberId(subscriberId);
		sbhDMO.setSbhFieldId(fieldId);
		sbhDMO.setSbhHistCode(histCode);
		sbhDMO.setSbhOldValue(oldValue);
		sbhDMO.setSbhNewValue(newValue);
		sbhDMO.setSbhUserId("eppixcomm");
		sbhDMO.setSbhTimestamp(new DateTime());

		try {
			base.sbhSubHistory().create(sbhDMO);
		} catch (EPPIXBusinessException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXUnexpectedException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		}
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
	
	/**
	 * 	#------------------------------------------------------------------------------#
		# Purpose: Gets a field in table aux_customers for Helios                      #
		# Accepts: p_id                                                                #
		#          p_passport                                                          #
		# Returns: l_roaming_id  - TRUE: Roaming exists, False: Roaming Does not Exist #
		#------------------------------------------------------------------------------#
		FUNCTION RoamingInd_Get (p_id, p_passport)
	 */
	public boolean getRoamingInd(String rsaId, String passport)throws EPPIXSeriousException{
	
		
		boolean roamingExist = false;
		Integer valueMonth = null;
		Date fromDate = null;
		Date toDate = null;
		IntegerDMO countDMO = null;
		SksKeySettingDMO sksDMO = null;

//		-- Validate mandatory parameters
		if((rsaId == null || rsaId.length() <= 0) && (passport == null || passport.length() <= 0)){
			logger.error("Parameter 'rsaId and  passport' may not be null!");
			throw new EPPIXSeriousException("1", "Parameter 'rsaId and  passport' may not be null!");
			
		}

		// Column p_plan is defined as NOT NULL in the database
		if((rsaId != null && rsaId.length() > 0) && (passport != null && passport.length() > 0)){
			logger.error("Only One of ID or Passort should be provided!");
			throw new EPPIXSeriousException("1", "Only One of ID or Passort should be provided!");

		}

		sksDMO = this.getSks("ROAMININD");
		
		if(sksDMO == null){
			valueMonth = new Integer("12");
		}else{
			valueMonth = new Integer(sksDMO.getSksValue());
		}

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1);
		cal.add(Calendar.MONTH, -valueMonth.intValue());

		fromDate = new Date(cal.getTime());
		toDate = new Date();
		logger.debug("\nFROM DATE: " + fromDate + " TO DATE: " + toDate);
		
		if(rsaId != null && rsaId.length() > 0){
			countDMO = this.heliosRpcServicesDAC.countAuxByRsaId(fromDate, toDate, rsaId);
		}else{
			countDMO = this.heliosRpcServicesDAC.countAuxByPassport(fromDate, toDate, passport);
		}
		
		if(countDMO != null && countDMO.getIntValue() > 0){
			roamingExist = true;
		}

		return roamingExist;
	}

	public int getReturnRecords() {
		return returnRecords;
	}

	public void setReturnRecords(int returnRecords) {
		this.returnRecords = returnRecords;
	}

	public void getCutomerSearchTypeV(String matchString, String accountNo) {

		Statement st = null;
		// List<SlcustmDQO> customers = null;
		DAOIterator iter = null;
		try {
			st = this.getConnection().createStatement();

			ResultSet rs = null;
			String sql = "";

			if (matchString != null && matchString.length() > 0) {
				sql = "SELECT {+FIRST_ROWS} FIRST " + this.returnRecords
						+ " UNIQUE customer, name, "
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE ins_invoice_no[1, " + matchString.length()
						+ "] = '" + matchString + "' "
						+ "AND customer = ins_customer " + "AND customer > '"
						+ accountNo + "' " + "ORDER BY customer";
			} else {
				sql = "SELECT {+FIRST_ROWS} FIRST " + this.returnRecords
						+ " UNIQUE customer, name, "
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE customer = ins_customer " + "AND customer > '"
						+ accountNo + "' " + "ORDER BY customer";
			}

			logger.debug("\n" + sql);
			// System.out.println(sql);

			rs = st.executeQuery(sql);
			SlcustmDQO dqo = null;
			this.customersList = new ArrayList<SlcustmDQO>();
			int count = 0;

			while (rs.next()) {
				// dqo.set(customer, name, address1, address2, address3,
				// address4, groupCustomer, address5, surname, subscriberId,
				// firstname);
				dqo = new SlcustmDQO();
				dqo.setCustomer(rs.getString(1));
				dqo.setName(rs.getString(2));
				dqo.setAddress1(rs.getString(3));
				dqo.setAddress2(rs.getString(4));
				dqo.setAddress3(rs.getString(5));
				dqo.setAddress4(rs.getString(6));
				dqo.setGroupCustomer(rs.getString(7));
				dqo.setGroupName(rs.getString(8));
				dqo.setSurname(rs.getString(9));
				dqo.setSubscriberId(rs.getInt(10));
				dqo.setFirstname(rs.getString(11));

				logger.debug(dqo.toString());
				this.customersList.add(dqo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// iter = (DAOIterator) customers.iterator();

		// return this.customers;
	}

	public IntegerDMO getCutomerSearchTypeVCount(String matchString,
			String accountNo) {

		Statement st = null;
		IntegerDMO count = null;

		try {
			st = this.getConnection().createStatement();

			ResultSet rs = null;
			String sql = "";

			if (matchString != null && matchString.length() > 0) {
				sql = "SELECT count(*) FROM slcustm, ins_inv_summary "
						+ "WHERE ins_invoice_no[1, " + matchString.length()
						+ "] = '" + matchString + "' "
						+ "AND customer = ins_customer " + "AND customer > '"
						+ accountNo + "'";
			} else {
				sql = "SELECT count(*) FROM slcustm, ins_inv_summary "
						+ "WHERE customer = ins_customer " + "AND customer > '"
						+ accountNo + "'";
			}

			logger.debug("\n" + sql);
			// System.out.println(sql);

			rs = st.executeQuery(sql);

			while (rs.next()) {
				// dqo.set(customer, name, address1, address2, address3,
				// address4, groupCustomer, address5, surname, subscriberId,
				// firstname);
				count = new IntegerDMO();
				count.setIntValue(rs.getInt(1));

				logger.debug("\ncount: " + count.getIntValue());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose : Retrieve a record from the ax_cstomers table # #
	 * Accepts : p_bill_ac_no - Customer bill account number # # Returns :
	 * l_aux.* - Complete aux_customers record #
	 * #--------------------------------
	 * ----------------------------------------------# FUNCTION
	 * aux_cust_get(p_bill_ac_no)
	 * 
	 * @param billAccount
	 * @return
	 * @throws EPPIXFatalException
	 */
	public AuxCustomersDMO getAuxCustomer(String billAccount)
			throws EPPIXFatalException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, AuxCustomersDMO.billAcNoFilter, billAccount);

		AuxCustomersDMO auxDMO = null;

		try {
			auxDMO = base.auxCustomers().get(filter);
		} catch (EPPIXBusinessException e) {
			throw new EPPIXFatalException(
					"Unable to SELECT aux_customers details for bill account "
							+ billAccount + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			throw new EPPIXFatalException(
					"Unable to SELECT aux_customers details for bill account "
							+ billAccount + " EXCEPTION: " + e);
		}

		if (auxDMO == null) {
			throw new EPPIXFatalException(
					"Unable to SELECT aux_customers details for bill account "
							+ billAccount);
		}

		/**
		 * SJ: If EppixFatalException is thrown, it is passed to calling
		 * function
		 * 
		 * Changed to catch the exception. WIll throw only when the encrypt key
		 * is required.
		 */

		String regex = "[a-zA-Z[x]]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = null;
		AuxEncryptedDMO encDMO = null;
		boolean encryptFound = false;

		if (auxDMO.getCreditCardNo() != null) {
			matcher = pattern.matcher(auxDMO.getCreditCardNo());
			if (matcher.find()) {
				encryptFound = true;
			}

		} else if (auxDMO.getAuxCardCvvNo() != null) {
			matcher = pattern.matcher(auxDMO.getAuxCardCvvNo());

			if (matcher.find()) {
				encryptFound = true;
			}
		}

		if (encryptFound) {
			try {
				encDMO = this.getAuxCustEncrypted(auxDMO.getBillAcNo());

				if (encDMO == null) {
					encryptFound = false;
				} else {
					encryptFound = true;
				}

			} catch (EPPIXFatalException e) {
				encryptFound = false;
			}
		}

		if (encryptFound) {
			if (auxDMO.getCreditCardNo() != null) {
				matcher = pattern.matcher(auxDMO.getCreditCardNo());

				if (matcher.find()) {
					auxDMO.setCreditCardNo(encDMO.getCcNo());
				}
			} else {
				auxDMO.setCreditCardNo(encDMO.getCcNo());
			}

			if (auxDMO.getAuxCardCvvNo() != null) {
				matcher = pattern.matcher(auxDMO.getAuxCardCvvNo());

				if (matcher.find()) {
					auxDMO.setAuxCardCvvNo(encDMO.getCcCvvNo());
				}
			} else {
				auxDMO.setAuxCardCvvNo(encDMO.getCcCvvNo());
			}

			if (auxDMO.getBankAcNo() != null) {
				matcher = pattern.matcher(auxDMO.getBankAcNo());

				if (matcher.find()) {
					auxDMO.setBankAcNo(encDMO.getBankAcNo());
				}
			} else {
				auxDMO.setBankAcNo(encDMO.getBankAcNo());
			}

			if (auxDMO.getIdNumber() != null) {
				matcher = pattern.matcher(auxDMO.getIdNumber());

				if (matcher.find()) {
					auxDMO.setIdNumber(encDMO.getIdNo());
				}
			} else {
				auxDMO.setIdNumber(encDMO.getIdNo());
			}

			if (auxDMO.getAuxAnalysis13() != null) {
				matcher = pattern.matcher(auxDMO.getAuxAnalysis13());

				if (matcher.find()) {
					auxDMO.setAuxAnalysis13(encDMO.getPassportNo());
				}
			} else {
				auxDMO.setAuxAnalysis13(encDMO.getPassportNo());
			}
		}
		return auxDMO;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose: Get and decrypt a record from the 'aux_encrypted'
	 * table # # Accepts: p_bill_ac_no - Customer account number # # Returns:
	 * l_cc_no - Customer Credit Card Number # # l_cc_cvv_no - Customer Credit
	 * Card CVV Number # # l_bank_ac_no - Customer Bank Account Number # #
	 * l_id_no - Customer ID Number # # l_passport_no - Customer Passport Number
	 * # #----------------------------------------------------------------------
	 * --------# FUNCTION aux_cust_encrypted_get (p_bill_ac_no)
	 * 
	 * @param billAcNo
	 * @return
	 * @throws EPPIXFatalException
	 */
	public AuxEncryptedDMO getAuxCustEncrypted(String billAcNo)
			throws EPPIXFatalException {

		StringDMO sysEnc_Key;

		String accEncKey;

		try {
			sysEnc_Key = this.heliosRpcServicesDAC.getAuxEncryptKey(billAcNo);

			if (sysEnc_Key == null) {
				throw new EPPIXFatalException(
						"Encryption key not found for account " + billAcNo);
			} else {
				accEncKey = billAcNo.substring(0, 4) + sysEnc_Key.getString()
						+ billAcNo.substring(4, 8);
			}
		} catch (EPPIXSeriousException e) {
			throw new EPPIXFatalException(
					"Encryption key not found for account " + billAcNo);
		}

		logger.debug("ENCRYPTION KEY: " + accEncKey);

		AuxEncryptedDMO auxEncryptedDMO = null;
		try {
			auxEncryptedDMO = this.heliosRpcServicesDAC.getAuxCustEncrypted(
					accEncKey, accEncKey, accEncKey, accEncKey, accEncKey,
					billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error("EXCEPTION retrieving record in table aux_encrypted for account number "
					+ billAcNo + " EXCEPTION: " + e);
			throw new EPPIXFatalException(
					"EXCEPTION retrieving record in table aux_encrypted for account number "
							+ billAcNo + " EXCEPTION: " + e);
		}

		if (auxEncryptedDMO == null) {

			logger.error("Failed retrieving record in table aux_encrypted for account number "
					+ billAcNo);

			throw new EPPIXFatalException(
					"Record not found in table aux_encrypted for account number "
							+ billAcNo);
		}
		return auxEncryptedDMO;
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

	public List<SlcustmDQO> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(List<SlcustmDQO> customersList) {
		this.customersList = customersList;
	}
	
	public void writehelDbLog(String operation, DateTime startTime, DateTime endTime, String request, String response) {

		Statement st = null;
		IntegerDMO count = null;

		try {
			st = this.getConnection().createStatement();

			ResultSet rs = null;
			String sql = "";

			sql = "INSERT INTO hwl_hel_ws_log(hwl_operation, hwl_startTime, hwl_endTime, hwl_request, hwl_response) "
					+ "VALUES('" + operation + "', '" + startTime.toString() + "', '" + endTime.toString() + "', '" + request + "', '" + response + "')";

			logger.debug("\n" + sql);
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	public DlhDynmcLmtHdrDMO getDlhDynamicLmtHdr(String rsaId, String passport) throws EPPIXSeriousException{
		
	DlhDynmcLmtHdrDMO dlhDmo = null;
	
	if(rsaId != null && rsaId.length() > 0){		
		dlhDmo = this.heliosRpcServicesDAC.getDlhDynamicLmtHdrById(rsaId);
	}else if(passport != null && passport.length() > 0) {
		dlhDmo = this.heliosRpcServicesDAC.getDlhDynamicLmtHdrByPass(passport);
	}else {
		logger.equals("Both rsaId and Passport cannot be null");
		throw new EPPIXSeriousException("Both rsaId and Passport cannot be null");
	}
	
	return dlhDmo;
		
	}

	public DAOIterator getDldDynamicLmtDetById(Integer id) throws EPPIXSeriousException {
		DAOIterator dldIt = null;
		
		dldIt = this.heliosRpcServicesDAC.getDldDynamicLmtDetById(id);
		return dldIt;		
	}
	
	public DldDynmcLmtDetDMO getDldDynamicLmtDetByAccAndId(String accountNo, Integer id) throws EPPIXSeriousException {
		DldDynmcLmtDetDMO dldDmo = null;
		
		dldDmo = this.heliosRpcServicesDAC.getDldDynamicLmtDetByAccAndId(accountNo, id);
		return dldDmo;		
	}
	
}
