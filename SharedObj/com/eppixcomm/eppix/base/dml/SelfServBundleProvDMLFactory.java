package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsVsrVstDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VamSbdDQO;

public class SelfServBundleProvDMLFactory extends BaseDMLFactory {

	protected SelfServBundleProvDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
		
		defStaticQuery("getVamSbd", ".soa.sharedservices.blo.VamSbdDQO",
				"select * from vam_active_msisdn, sbd_sub_dets "
				+ "where vam_subscriber_id = sbd_subscriber_id "
				+ "and vam_msisdn_no = ? "
				+ "and vam_stat_code in ('1', '4');",
				false);

		defStaticQuery("getTsSpcSpv", ".soa.sharedservices.blo.TsSpcSpvDQO",
				"select * from ts_tariff_service, spc_param_config, spv_param_values "
				+ "where ts_package_code = ? "
				+ "and ts_internal_tariff = ? "
				+ "and ts_service_code = spc_service_code "
				+ "and  spc_param_id = spv_param_id "
				+ "and spv_netwrk_code = ? ;",
				false);

		defStaticQuery("getTsVsrVst", ".soa.sharedservices.blo.TsVsrVstDQO",
				"select * from ts_tariff_service, vsr_service, vst_service_types "
				+ "where ts_package_code = ? "
				+ "and ts_internal_tariff = ? "
				+ "and ts_net_serv_code = ? "
				+ "and ts_service_code = vsr_service_code "
				+ "and vsr_service_type = vst_service_type;",
				false);

		defStaticQuery("getPshPsd", ".soa.sharedservices.blo.PshPsdDQO",
				"select * from psh_param_serv_hdr, psd_param_serv_det "
				+ "where psh_subscriber_id = ? "
				+ "and psh_service_code = ? "
				+ "and psh_archived = 'N' "
				+ "and psd_param_value = ? "
				+ "and psh_id = psd_psh_id;",
				false);
		
		defStaticQuery("checkEarlyTermQuoteExists", ".common.data.IntegerDMO", 
				"select count(*) from etq_et_quote "
				+ "WHERE (etq_subscriber_id = ? "
				+ "OR etq_msisdn_no = ?) "
				+ "AND etq_quote_status in ('G', 'A', 'P') ", false);
	}

	private static SelfServBundleProvDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SelfServBundleProvDML();
		}
		return dml;
	}
	
	

}
