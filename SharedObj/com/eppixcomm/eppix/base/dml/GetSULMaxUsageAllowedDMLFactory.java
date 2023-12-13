package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;



public class GetSULMaxUsageAllowedDMLFactory extends BaseDMLFactory {

	private static GetSULMaxUsageAllowedDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetSULMaxUsageAllowedDML();
		}
		return dml;
	}

	protected GetSULMaxUsageAllowedDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("getSumSulByAccount", ".common.data.StringDMO", 
				"Select SUM(BLH_BILL_LIMIT_VAL) "
				+ "FROM blh_bill_limit_hd,sbd_sub_dets "
				+ "WHERE blh_subscriber_id = sbd_subscriber_id "
				+ "AND blh_service_code  = 'SUL' AND sbd_bill_ac_no = ? ", false);	
		
		defStaticQuery("getSumSulBySubscriber", ".common.data.StringDMO", 
				"Select SUM(BLH_BILL_LIMIT_VAL) "
				+ "FROM blh_bill_limit_hd "
				+ "WHERE blh_subscriber_id =? "
				+ "AND blh_service_code  = 'SUL'", false);	
		
		defStaticQuery("getSumSpulByAccount", ".common.data.StringDMO", 
				"Select SUM(BLH_BILL_LIMIT_VAL) "
				+ "FROM blh_bill_limit_hd,sbd_sub_dets "
				+ "WHERE blh_subscriber_id = sbd_subscriber_id "
				+ "AND blh_service_code  = 'SPUL' AND sbd_bill_ac_no = ? ", false);
		
		defStaticQuery("getCrbUnbillCharges", ".common.data.StringDMO", 
				"SELECT NVL((crb_unbill_charges + crb_unbill_calls), 0) "
				+ "FROM crb_cust_risk_bal "
				+ "WHERE crb_bill_ac_no = ? ", false);
		
		defStaticQuery("getAccountCreditLimit", ".common.data.StringDMO", 
				"SELECT credit_limit "
				+ "FROM slcustm "
				+ "WHERE customer = ? ", false);
		
		defStaticQuery("getSubscriberVasServices", ".common.data.StringDMO", 
				"SELECT vas_service_code "
				+ "FROM vas_active_service "
				+ "WHERE vas_subscriber_id = ? "
				+ "AND vas_service_code NOT IN "  
				+ "(SELECT tt_type FROM tt_type_text WHERE tt_group = 'IDACCSRVEX');", true);
		
		defStaticQuery("getPshPsdServices", ".soa.sharedservices.blo.PshPsdDQO", 
				"SELECT * FROM psh_param_serv_hdr, psd_param_serv_det "
				+ "WHERE psd_psh_id = ? "
				+ "AND psh_id = psd_psh_id "
				+ "AND psd_param_active = 'Y' ", false);
		
		defStaticQuery("getChgNetId", ".common.data.StringDMO", 
				"SELECT chg_netid "
				+ "FROM chg_charges "
				+ "WHERE chg_code = ? "
				+ "ORDER BY chg_effective_date DESC", false);
		
		defStaticQuery("getVstParameterised", ".common.data.StringDMO", 
				"SELECT vst_parameterised "
				+ "FROM vst_service_types,vsr_service,vas_active_service "
				+ "WHERE vst_service_type = vsr_service_type "
				+ "AND vsr_service_code = vas_service_code "
				+ "AND vas_service_code = ? "
				+ "AND vas_subscriber_id = ? ", false);
		
		defStaticQuery(	"getTsTariffService", ".base.blo.TsTariffServiceDMO",
				"SELECT * FROM ts_tariff_service "
						+ "WHERE ts_package_code = ? "
						+ "AND ts_service_code = ? "
						+ "AND (ts_internal_tariff = ? "
						+ "OR ts_internal_tariff IS NULL "
						+ "OR ts_internal_tariff = '' OR ts_internal_tariff = ' ')", true);
		
		
		defStaticQuery("getTsServiceBySubscriber", ".base.blo.TsTariffServiceDMO", " select * from ts_tariff_service "
			 + " where ts_service_code  in "
			 + " (select vas_service_code from vas_active_service "
			 + " where vas_subscriber_id in  "
			 + " (select sbd_subscriber_id from sbd_sub_dets "
			 + " where sbd_bill_ac_no = ?)) "
			 + " and ts_package_code =  ? "  
			 + " and ts_internal_tariff = ? "
			 + " and (ts_sub_charge1 <> '' ) ", true);

	}




}