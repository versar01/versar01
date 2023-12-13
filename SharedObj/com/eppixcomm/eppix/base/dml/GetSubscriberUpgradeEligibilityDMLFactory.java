package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.soa.sharedservices.blo.SbmSubMatrixDMO;

public class GetSubscriberUpgradeEligibilityDMLFactory extends BaseDMLFactory{

private static GetSubscriberUpgradeEligibilityDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetSubscriberUpgradeEligibilityDML();
		}
		return dml;
	}
	
	public GetSubscriberUpgradeEligibilityDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("isMigrationPending", ".common.data.IntegerDMO",
			    "SELECT UNIQUE(0) FROM mgp_mig_pending WHERE mgp_sim_no = ?", false);
		
		defStaticQuery("getPph", ".soa.sharedservices.blo.PphPayPlanHdrDMO",
				"SELECT * " + "FROM pph_pay_plan_hdr "
						+ "WHERE pph_customer = ?", false);
		
		defStaticQuery("getCviScv",
				".soa.sharedservices.blo.CviCrmValueIndDMO", "SELECT cvi.* "
						+ "FROM cvi_crm_value_ind cvi, scv_sub_crm_value scv "
						+ "WHERE cvi_crm_value = scv_crm_value "
						+ "AND scv_subscriber_id = ?", false);
		
		defStaticQuery("getSbmListAll", ".soa.sharedservices.blo.SbmSubMatrixDMO", 
				"SELECT sbm_sub_matrix.* FROM sbm_sub_matrix "
				+ "WHERE sbm_status = 'A' "
				+ "AND ((sbm_package_code = ? ) OR (sbm_package_code MATCHES '' OR sbm_package_code IS NULL)) "
				+ "AND ((sbm_tariff_code = ? ) OR (sbm_tariff_code MATCHES  '' OR sbm_tariff_code IS NULL)) "
				+ "AND ((sbm_crm_value = ? ) OR (sbm_crm_value MATCHES  '' OR sbm_crm_value IS NULL)) "
				+ "AND ((sbm_account_status = ? ) OR (sbm_account_status MATCHES '' OR sbm_account_status IS NULL)) "
				+ "AND ((sbm_contract_age > ? ) OR (sbm_contract_age = 0)) "
				+ "AND ((sbm_mtn_status = ? ) OR (sbm_mtn_status MATCHES '' OR sbm_mtn_status IS NULL)) "
				+ "AND ((sbm_customer_type = ? ) OR (sbm_customer_type MATCHES '' OR sbm_customer_type IS NULL)) "
				+ "AND ((sbm_days_suspend = ? ) OR (sbm_days_suspend = 0)) "
				+ "AND ((sbm_contract_len = ? ) OR (sbm_contract_len = 0)) "
				+ "AND ((sbm_ageing= ? ) OR (sbm_ageing MATCHES '' OR sbm_ageing IS NULL))", true);
	}

}