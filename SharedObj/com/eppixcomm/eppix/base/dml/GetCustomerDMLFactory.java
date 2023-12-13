package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AulAccUpLowlmtDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ErbEpxRskBndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivTtDqo;

public class GetCustomerDMLFactory extends BaseDMLFactory{

	private static GetCustomerDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetCustomerDML();
		}
		return dml;
	}
	
	protected GetCustomerDMLFactory() throws DMLException {
		super();

		defStaticQuery("getAul", ".soa.sharedservices.blo.AulAccUpLowlmtDMO", "SELECT * FROM aul_acc_up_lowlmt " + 
					"WHERE aul_bill_ac_no = ? ", false);
		
		defStaticQuery("getAccountBalance", ".common.data.StringDMO", 
				"SELECT NVL(SUM(unall_amount), 0) "
				+ "FROM slitemm WHERE customer = ? "
				+ "AND open_indicator = 'O' "
				+ "AND dated <= TODAY", false);
		
		defStaticQuery("getDccCreditClass", ".soa.sharedservices.blo.DccCreditClassesDMO", 
				"SELECT * FROM dcc_credit_classes "
				+ "WHERE dcc_class_id = ? ", false);
		
		defStaticQuery("getCdeTotalSum", ".common.data.StringDMO", 
				"SELECT SUM(cde_amount_paid - cde_amount_rel) "
				+ "FROM cde_cust_deposit "
				+ "WHERE cde_customer_id = ? "
				+ "AND (cde_deposit_status = 1 OR cde_deposit_status= 3)", false);
		
		defStaticQuery("getPendingSum",  ".common.data.StringDMO", 
				"SELECT SUM(cde_amount_due - cde_amount_paid - cde_amount_rel) FROM cde_cust_deposit "
				+ "WHERE cde_customer_id = ? "
				+ "AND (cde_deposit_status = 0 OR cde_deposit_status= 2)", false);
		
		defStaticQuery("getCviAcv",
				".soa.sharedservices.blo.CviCrmValueIndDMO", "SELECT cvi.* "
						+ "FROM cvi_crm_value_ind cvi, acv_acc_crm_value acv "
						+ "WHERE cvi_crm_value = acv_crm_value "
						+ "AND acv_bill_ac_no = ? ", false);
		
		defStaticQuery("getRiskBandById", ".soa.sharedservices.blo.ErbEpxRskBndDMO", 
				"SELECT * FROM erb_epx_rsk_bnd WHERE erb_risk_id = ? ", false);
		
		defStaticQuery("getRiskBandByText", ".soa.sharedservices.blo.ErbEpxRskBndDMO", 
				"SELECT * FROM erb_epx_rsk_bnd WHERE erb_text = ? ", false);
		
		defStaticQuery("getUdvTT", ".soa.sharedservices.blo.UdvUserdocDelivTtDqo", "SELECT udv_userdoc_deliv.* ,"
				+ "(SELECT tt_text FROM tt_type_text "
				+ "WHERE udv_doc_type = tt_type "
				+ "AND tt_group = 'DOCTYPE' "
				+ "AND tt_lang = 'ENG' ), "
				+ "(SELECT tt_text FROM tt_type_text "
				+ "WHERE udv_delivery = tt_type "
				+ "AND tt_group = 'DELIVMTHDS' "
				+ "AND tt_lang = 'ENG'), "
				+ "(SELECT tt_text FROM tt_type_text "
				+ "WHERE udv_format = tt_type "
				+ "AND tt_group = 'OUTPTFRMTS' "
				+ "AND tt_lang = 'ENG'), "
				+ "(SELECT tt_text FROM tt_type_text "
				+ "WHERE udv_address_type = tt_type "
				+ "AND tt_group = 'ADDRESSTYP' "
				+ "AND tt_lang = 'ENG') "
				+ "FROM udv_userdoc_deliv "
				+ "WHERE udv_userdoc_deliv.udv_doc_type = ? "
				+ "AND udv_userdoc_deliv.udv_bill_ac_no = ? ", false);
		
		defStaticUpdate("insertUserHistory", "INSERT INTO ush_user_history(ush_login, ush_hist_code, ush_comment, ush_terminal_id, ush_timestamp)" + 
				"VALUES( ?, ?, ?, ?, CURRENT);");
		
		defStaticQuery("getCdeLastStatus", ".common.data.StringDMO", 
				"SELECT cde_deposit_status "
				+ "FROM cde_cust_deposit "
				+ "WHERE cde_deposit_id = (SELECT MAX(cde_deposit_id) "
				+ "FROM cde_cust_deposit "
				+ "WHERE cde_customer_id = ?)\n" + 
				"", false);
	}
}