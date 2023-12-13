package com.eppixcomm.eppix.base.dml;

public class GetRoamingAvgUsageDMLFactory extends BaseDMLFactory{

	private static GetServiceDiscountDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetServiceDiscountDML();
		}
		return dml;
	}
	
	protected GetRoamingAvgUsageDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("getAuxSbdVamByRsaId", ".soa.sharedservices.blo.AuxSbdVamDQO",		
				"SELECT * FROM aux_customers, sbd_sub_dets, vam_active_msisdn "
				+ "WHERE id_number = ? "
				+ "AND bill_ac_no = sbd_bill_ac_no "
				+ "AND vam_subscriber_id = vam_subscriber_id "
				+ "AND vam_msisdn_no = sbd_dialling_no	"
				+ "AND rem_let_date BETWEEN ? AND TODAY;", true);
		
		defStaticQuery("getAuxSbdVamByPassPort", ".soa.sharedservices.blo.AuxSbdVamDQO",		
				"SELECT * FROM aux_customers, sbd_sub_dets, vam_active_msisdn "
				+ "WHERE aux_analysis_13 = ? "
				+ "AND bill_ac_no = sbd_bill_ac_no "
				+ "AND vam_subscriber_id = vam_subscriber_id "
				+ "AND vam_msisdn_no = sbd_dialling_no	"
				+ "AND rem_let_date BETWEEN ? AND TODAY;", true);
		
	}

}
