package com.eppixcomm.eppix.base.dml;

public class IDAccSubServListDMLFactory  extends BaseDMLFactory {

	protected IDAccSubServListDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("getVamActiveMsisdn", ".base.blo.VamActiveMsisdnDMO", "SELECT * FROM vam_active_msisdn "
				+ "WHERE vam_subscriber_id = ? "
				+ "AND vam_hierarchy = '0' "
				+ "AND vam_msisdn_known in ('1','2') "
				+ "AND vam_stat_code not in ('6','7') "
				+ "ORDER BY vam_msisdn_known", false);
		
		defStaticQuery("getPsdPshSpc", ".soa.sharedservices.blo.PsdSpcPshDQO", 
				"SELECT psd_param_id, spc_param_name, psd_param_value, psd_sub_charge, psh_service_type, psd_chg_value "
				+ "FROM psd_param_serv_det, psh_param_serv_hdr, spc_param_config "
				+ "WHERE psh_subscriber_id = ? "
				+ "AND psh_sim_no = ? "
				+ "AND psh_id = psd_psh_id "
				+ "AND psh_service_code = ? "
				+ "AND psd_param_id = spc_param_id "
				+ "AND psd_param_active = 'Y' "
				+ "ORDER by psd_param_id, spc_param_name", true);

		defStaticQuery("getAsrSpcSpv", ".soa.sharedservices.blo.AsrSpcSpvDQO", "SELECT asr_param_id, spc_param_name, asr_param_value, spv_charge_code "
				+ "FROM asr_add_serv_req, spc_param_config, spv_param_values "
				+ "WHERE asr_subscriber_id = ? "
				+ "AND asr_service_code = ? "
				+ "AND asr_param_id = spc_param_id "
				+ "AND asr_param_id = spv_param_id "
				+ "AND spv_default_value = 'Y' "
				+ "ORDER by asr_param_id, spc_param_name", true);

	}

	private static IDAccSubServListDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new IDAccSubServListDML();
		}
		return dml;
	}
}
