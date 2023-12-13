package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.utils.AverageRoamingCallCharges;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxSbdVamDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SlcustmDQO;

public class GetRoamingAvgUsageBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(GetRoamingAvgUsageBLO.class);
	private Logger logger = thrower.getLogger();
	public GetRoamingAvgUsageDAC getRoamingAvgUsageDAC;
	private BaseBLOBinder base;
	private Connection connection;
	protected SimpleDateFormat dtFormat1yyyymmdd = new SimpleDateFormat(
			"yyyyMMdd");

	@Override
	protected Class getDACClass() {
		return GetRoamingAvgUsageBLO.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.getRoamingAvgUsageDAC = (GetRoamingAvgUsageDAC) dac;
	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose: Gets a field in table aux_customers for Helios # #
	 * Accepts: p_id # # p_passport # # Returns: l_avg_no_calls - average number
	 * of calls # # l_avg_usage_chrg - average number of charges #
	 * #--------------
	 * ----------------------------------------------------------------#
	 */
	public AverageRoamingCallCharges getRoamingAvgUsage(String rsaId, String passport) {
		// FUNCTION RoamingAvgUsage_Get (p_id, p_passport)

		logger.debug("\ngetRoamingAvgUsage\nString rsaId: " + rsaId
				+ "\nString passport" + passport);
		// DEFINE
		// p_id LIKE aux_customers.id_number,
		// p_passport LIKE aux_customers.aux_analysis_13,
		//
		// l_count, i INTEGER,
		// l_charge FLOAT,

		Integer count = null;
		Integer totalCount = null;
		Integer avgCount = null;
		BigDecimal charge = null;
		BigDecimal totalCharges = null;
		BigDecimal avgCharges = null;

		//
		// l_tot_no_calls INTEGER,
		// l_tot_usage_chrg FLOAT,
		//
		// l_avg_no_calls INTEGER,
		// l_avg_usage_chrg FLOAT,
		//
		// l_value SMALLINT,
		//
		// l_tt RECORD LIKE tt_type_text.*,
		// l_bcy RECORD LIKE bcy_billing_cycle.*,
		// l_cfrom_date CHAR(10),
		// l_from_date DATE,
		// l_to_date DATE,
		//
		// l_bill_ac_no LIKE aux_customers.bill_ac_no,
		// l_subscriber_id LIKE sbd_sub_dets.sbd_subscriber_id,
		// l_bill_cycle LIKE sbd_sub_dets.sbd_bill_cycle,
		// l_msisdn_no LIKE vam_active_msisdn.vam_msisdn_no,
		//
		// l_call_tabname CHAR(20),
		String callTabName = "";
		//
		// l_cnt INTEGER,
		//
		// l_sql CHAR(500),
		//
		// l_error CHAR(200),
		// l_function CHAR(50)

		AuxSbdVamDQO auxSbdVamDqo = null;
		DAOIterator auxSbdVamIt = null;
		Date fromDate = null;
		SksKeySettingDMO sksDmo = null;
		Integer valueMonth = null;
		BcyBillingCycleDMO bcyDmo = null;
		Object[] values = null;
		String lastAccount = "";
		//
		// WHENEVER ANY ERROR CALL error_classify
		// LET l_function = ": RoamingAvgUsage_Get()"
		//
		// CALL DebugStart("RoamingAvgUsage_Get")
		//
		// INITIALIZE l_tt.* TO NULL
		// LET l_count = 0
		// LET l_charge = "0.00"
		//
		// LET l_tot_no_calls = 0
		// LET l_tot_usage_chrg = "0.00"
		//
		// LET l_avg_no_calls = 0
		// LET l_avg_usage_chrg = "0.00"
		//
		// WHILE g_status_class = 0
		//
		// -- Validate mandatory parameters
		//
		// -- Column p_plan is defined as NOT NULL in the database
		// IF (p_id IS NULL OR LENGTH (p_id) = 0) AND (p_passport IS NULL OR
		// LENGTH (p_passport) = 0) THEN
		// LET l_error = "Parameter 'p_id / p_passport' may not be null!"
		// CALL Error_SeriousError (l_error, l_function)
		// EXIT WHILE
		// END IF
		//
		// -- Column p_plan is defined as NOT NULL in the database
		// IF (p_id IS NOT NULL AND LENGTH (p_id) != 0) THEN
		// IF (p_passport IS NOT NULL AND LENGTH (p_passport) != 0) THEN
		// LET l_error = "Only One of ID / Passort should be provided!"
		// CALL Error_SeriousError (l_error, l_function)
		// EXIT WHILE
		// END IF
		// END IF
		//
		// CALL sks_val_get("ROAMININD")
		// RETURNING l_value
		sksDmo = this.getSks("ROAMININD");

		if (sksDmo == null) {
			valueMonth = new Integer(12);
		} else {
			try {
				valueMonth = new Integer(sksDmo.getSksValue());
			} catch (NumberFormatException e) {
				valueMonth = new Integer(12);
			}
		}
		
		if(valueMonth.intValue() == 0){
			AverageRoamingCallCharges averages = new AverageRoamingCallCharges();
			averages.setAvgCalls(new Integer("0"));
			averages.setAvgCharges(new BigDecimal("0.00"));
			averages.setErrorCode("0");
			averages.setErrorDesc("");
			return averages;
		}
		//
		// IF g_status_class != 0 THEN
		// LET l_value = "12"
		// CALL Error_Reset()
		// END IF
		//
		// LET l_cfrom_date = "01/", Month(TODAY) USING "&&", "/", YEAR(TODAY)
		// USING "&&&&"
		// CALL DebugLog(l_cfrom_date)
		// LET l_from_date = l_cfrom_date
		// CALL DebugLog(l_from_date)
		// LET l_from_date = l_from_date - l_value UNITS MONTH
		// CALL DebugLog(l_from_date)
		// LET l_to_date = TODAY
		// CALL DebugLog(l_to_date)
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1);
		cal.add(Calendar.MONTH, -valueMonth.intValue());

		fromDate = new Date(cal.getTime());
		logger.debug("\nFROM DATE: " + fromDate);
		//
		// LET l_sql = "SELECT bill_ac_no, aux_bill_cycle ",
		// "FROM aux_customers ",
		// "WHERE rem_let_date BETWEEN '",l_from_date, "' AND '",l_to_date, "' "
		//
		// IF LENGTH(p_id) > 1 THEN
		// LET l_sql = l_sql CLIPPED, " AND id_number = '",p_id CLIPPED, "'"
		// ELSE
		// LET l_sql = l_sql CLIPPED, " AND aux_analysis_13 = '",p_passport
		// CLIPPED, "'"
		// END IF
		//
		// LET l_sql = l_sql CLIPPED, " ORDER BY bill_ac_no, aux_bill_cycle"
		/**
		 * Replace select with Retrieve ALL Account Number, Subscriber IDs, Bill
		 * Cycles, MSISDNs for the Passed ID or Passport FROM aux_customers,
		 * sbd_sub_dets AND vam_active_msisdn WHERE aux_customers.rem_let_date
		 * BETWEEN l_from_date AND TODAY, ORDER BY Account Number, Bill Cycle
		 * and Subscriber ID
		 */

		if (rsaId != null && rsaId.length() > 0) {
			try {
				auxSbdVamIt = this.getRoamingAvgUsageDAC.getAuxSbdVamByRsaId(
						rsaId, fromDate);
			} catch (EPPIXSeriousException e) {
				logger.error("Failed to get AUX records for RSA ID: " + rsaId
						+ " " + e.getMessage());

			}
		} else {
			try {
				auxSbdVamIt = this.getRoamingAvgUsageDAC
						.getAuxSbdVamByPassPort(passport, fromDate);
			} catch (EPPIXSeriousException e) {
				logger.error("Failed to get AUX records for PASSPORT: "
						+ passport + " " + e.getMessage());
				
				AverageRoamingCallCharges averages = new AverageRoamingCallCharges();
				averages.setAvgCalls(null);
				averages.setAvgCharges(null);
				averages.setErrorCode("2");
				averages.setErrorDesc("Error getting records from Eppix");
				return averages;
			}
		}
		
		
		if(auxSbdVamIt == null || !auxSbdVamIt.hasNext()){
			AverageRoamingCallCharges averages = new AverageRoamingCallCharges();
			averages.setAvgCalls(null);
			averages.setAvgCharges(null);
			averages.setErrorCode("1");
			averages.setErrorDesc("NO ROWS FOUND");
			return averages;
		}


		// CALL DebugLog(l_sql)
		// PREPARE sqls_list FROM l_sql
		// DECLARE curs_list CURSOR FOR sqls_list
		//
		// OPEN curs_list
		while (auxSbdVamIt.hasNext()) {
			auxSbdVamDqo = (AuxSbdVamDQO) auxSbdVamIt.next();
			// FOREACH curs_list INTO l_bill_ac_no, l_bill_cycle
			// CALL d_bcy_get(l_bill_cycle)
			// RETURNING l_bcy.*
			if(lastAccount.equals(auxSbdVamDqo.getBillAcNo())){
				continue;
			}
			
			bcyDmo = this.getBcy(auxSbdVamDqo.getSbdBillCycle());
			
			for(int i = 0 ; i < valueMonth.intValue(); i++){

			callTabName = "call_"
					+ auxSbdVamDqo.getSbdBillCycle().toLowerCase()
					+ dtFormat1yyyymmdd.format(bcyDmo.getBcyNextRun());
			
			bcyDmo.setBcyNextRun(Date.addMonths(-1, bcyDmo.getBcyNextRun()));

			logger.debug("\ncallTabName: " + callTabName);
			//
			// IF g_status_class != 0 THEN
			// CALL Error_Append ("", l_function)
			// EXIT FOREACH
			// END IF
			//
			// FOR i = 1 TO l_value
			// LET l_error = "l_value: ", l_value
			// CALL DebugLog(l_error)
			//
			// LET l_error = "l_bcy.bcy_next_run: ", l_bcy.bcy_next_run
			// CALL DebugLog(l_error)
			//
			// # Use new period table names (_cccccyyyymmdd)
			// LET l_call_tabname = "call_", DOWNSHIFT(l_bill_cycle) CLIPPED,
			// l_bcy.bcy_next_run USING "yyyymmdd"
			//
			// LET l_bcy.bcy_next_run = l_bcy.bcy_next_run - 1 UNITS MONTH
			//
			// SELECT UNIQUE(0)
			// FROM systables
			// WHERE tabname = l_call_tabname
			//
			// IF SQLCA.SQLCODE = 100 THEN
			// LET l_error = "Call Table does not exist: ", l_call_tabname
			// CALL DebugLog(l_error)
			// CALL Error_Reset()
			// CONTINUE FOR
			// END IF
			//
			// LET l_sql = "SELECT nvl(sum(ca_call_charge), '0.00'), count(*) ",
			// "FROM ", l_call_tabname,
			// "WHERE ca_subscription_id in (select sbd_subscriber_id from sbd_sub_dets where sbd_bill_ac_no = ?) ",
			// "AND ca_usage_type_ref in (select tt_type from tt_type_text where tt_group = 'ROAMUSGTYP') "

			values = this.getSumCallChargesRoaming(
					auxSbdVamDqo.getSbdBillAcNo(), callTabName);

			if (values == null) {
				logger.error("No call charges returned for account: "
						+ auxSbdVamDqo.getSbdBillAcNo());
			}else{
				charge = (BigDecimal)values[0];
				count = (Integer)values[1];
				
				if(totalCharges == null){
					totalCharges = charge;
				}else{
					totalCharges = totalCharges.add(charge);
				}
				
				if(totalCount == null){
					totalCount = count;
				}else{
					totalCount = totalCount.intValue() + count.intValue();
				}
				
				logger.debug("\n ACCOUNT: " + auxSbdVamDqo.getSbdBillAcNo()  + " \nCHARGE: " + charge + "\nCOUNT: " + count + "\nTOTAL CHARGE: " +  totalCharges + "\nTOTAL COUNT: " + totalCount);
				
			}
			//
			// CALL DebugLog(l_sql)
			// PREPARE sqls_calls FROM l_sql
			// DECLARE curs_calls CURSOR FOR sqls_calls
			//
			// OPEN curs_calls USING l_bill_ac_no
			// FETCH curs_calls INTO l_charge, l_count
			//
			// LET l_error = "l_count: ", l_count
			// CALL DebugLog(l_error)
			// LET l_error = "l_charge: ", l_charge
			// CALL DebugLog(l_error)
			// IF l_count > 0 THEN
			// LET l_tot_no_calls = l_tot_no_calls + l_count
			// LET l_error = "l_tot_no_calls: ", l_tot_no_calls
			// CALL DebugLog(l_error)
			//
			// LET l_tot_usage_chrg = l_tot_usage_chrg + l_charge
			// LET l_error = "l_tot_usage_chrg: ", l_tot_usage_chrg
			// CALL DebugLog(l_error)
			// END IF
			//
			// END FOR
			}
			//
			//
			// -- Only loop through WHILE once
			// END FOREACH
			lastAccount = auxSbdVamDqo.getSbdBillAcNo();
		}
		//
		// LET l_error = "l_tot_no_calls: ", l_tot_no_calls
		// CALL DebugLog(l_error)
		logger.debug("\nTOTAL CHARGE: " +  totalCharges + "\nTOTAL COUNT: " + totalCount);
		
		if(totalCharges == null){
			totalCharges =new BigDecimal("0.00");
		}
		
		if(totalCount == null){
			totalCount = new Integer("0");
		}
		
		//
		if(avgCount == null){
			avgCount = new Integer("0");
		}
		
		if(avgCharges == null){
			avgCharges = new BigDecimal("0.00");
		}
		
		// LET l_avg_no_calls = l_tot_no_calls / l_value
		avgCount = totalCount.intValue() / valueMonth.intValue();
		avgCharges = totalCharges.divide(new BigDecimal(valueMonth.intValue()), BigDecimal.ROUND_UP);
		
		avgCharges = avgCharges.setScale(2, BigDecimal.ROUND_UP);
		
		logger.debug("\nAVG CHARGE: " +  avgCharges + "\nAVG CALLS: " + avgCount);
		
		// LET l_error = "l_avg_no_calls: ", l_avg_no_calls
		// CALL DebugLog(l_error)
		//
		// LET l_error = "l_tot_usage_chrg: ", l_tot_usage_chrg
		// CALL DebugLog(l_error)
		//
		// LET l_avg_usage_chrg = l_tot_usage_chrg / l_value
		//
		// LET l_error = "l_avg_usage_chrg: ", l_avg_usage_chrg
		// CALL DebugLog(l_error)
		//
		// EXIT WHILE
		// END WHILE
		//
		// RETURN l_avg_no_calls, l_avg_usage_chrg
		//
		// END FUNCTION
		AverageRoamingCallCharges averages = new AverageRoamingCallCharges();
		averages.setAvgCalls(avgCount);
		averages.setAvgCharges(avgCharges);
		averages.setErrorCode("0");
		averages.setErrorDesc("");
		
		return averages;

	}

	private Object[] getSumCallChargesRoaming(String account, String tabName) {

		Statement st = null;
		String sql = "SELECT nvl(sum(ca_call_charge), '0.00'), count(*) FROM "
				+ tabName
				+ " WHERE ca_subscription_id in (select sbd_subscriber_id "
				+ "from sbd_sub_dets where sbd_bill_ac_no = '" + account + "') "
				+ " AND ca_usage_type_ref in (select tt_type from tt_type_text where tt_group = 'ROAMUSGTYP')";

		BigDecimal charges = null;
		Integer calls = null;
		Object[] values = null;
		
		logger.debug("\nSQL: " + sql);

		try {
			st = this.connection.createStatement();

			ResultSet rs = null;
			rs = st.executeQuery(sql);

			while (rs.next()) {
				charges = rs.getBigDecimal(1);
				calls = rs.getInt(2);

				values = new Object[] { charges, calls };
			}

		} catch (SQLException e) {
			logger.error("Failed to get call charges: " + e.getMessage());
		}

		return values;
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
	
	private DAOIterator getAux(String rsaId, String passport, Date startDate)throws EPPIXSeriousException{
		
		DAOIterator it = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.BETWEEN, AuxCustomersDMO.remLetDateFilter, startDate);
		filter.add(FilterOp.EQUAL, AuxCustomersDMO.remLetDateFilter, new Date());
		
		if(rsaId != null && rsaId.length() > 0){
			filter.add(FilterOp.EQUAL, AuxCustomersDMO.idNumberFilter, rsaId);
		}
		
		if(passport != null && passport.length() > 0){
			filter.add(FilterOp.EQUAL, AuxCustomersDMO.auxAnalysis13Filter, passport);
		}
		
		try {
			it = base.auxCustomers().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}
		
		return it;
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
