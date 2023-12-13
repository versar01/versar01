package com.eppixcomm.eppix.base.dml;

public class GetServiceDiscountDMLFactory extends BaseDMLFactory{

	private static GetServiceDiscountDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetServiceDiscountDML();
		}
		return dml;
	}
	
	protected GetServiceDiscountDMLFactory() throws DMLException {
		super();

		defStaticQuery(
				"percDiscount1E",
				".common.data.StringDMO",
			"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
				+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
				+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
				+ " WHERE dip_discount_id = sdi_discount_id"
				+ " AND dir_rule_id = dip_rule_ref"
				+ " AND dib_rule_id = dir_rule_id"
				+ " AND dqk_qual_id = sdi_qual_id"
				+ " AND dgd_group_id = dir_app_disc_id"
				+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
				+ " AND ts_package_code = ?"
				+ " AND sdi_subscriber_id = ? "
				+ " AND product = dir_charge_ref"
				+ " AND dir_rule_type = 'C'"
				+ " AND dir_band_type = 'N'"
				+ " AND dib_disc_type = 'P'"
				+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
				+ " AND ts_service_code = ?"
				+ " AND LENGTH(ts_sub_charge1) > 0"
				+ " AND c1.chg_code = ts_sub_charge1"
				+ " AND c1.chg_effective_date ="
				+ " (SELECT MAX(c2.chg_effective_date)"
				+ " FROM chg_charges c2"
				+ " WHERE c2.chg_code = c1.chg_code"
				+ " AND c2.chg_code = ts_sub_charge1)"
				+ " AND c1.chg_class_id = dgd_class_id"
				+ " AND dqk_key = qual_key"
				+ " AND qual_val = dqk_key_val"
				+ " AND dqk_from <= qual_from"
				+ " AND qual_to <= dqk_to"
				+ " AND c1.chg_value > 0", false);


		
		defStaticQuery(
				"percDiscount1",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'P'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge1) > 0"
					+ " AND c1.chg_code = ts_sub_charge1"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge1)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);
		
		defStaticQuery(
				"percDiscount2E",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
				+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
				+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
				+ " WHERE dip_discount_id = sdi_discount_id"
				+ " AND dir_rule_id = dip_rule_ref"
				+ " AND dib_rule_id = dir_rule_id"
				+ " AND dqk_qual_id = sdi_qual_id"
				+ " AND dgd_group_id = dir_app_disc_id"
				+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
				+ " AND ts_package_code = ?"
				+ " AND sdi_subscriber_id = ? "
				+ " AND product = dir_charge_ref"
				+ " AND dir_rule_type = 'C'"
				+ " AND dir_band_type = 'N'"
				+ " AND dib_disc_type = 'P'"
				+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
				+ " AND ts_service_code = ?"
				+ " AND LENGTH(ts_sub_charge2) > 0"
				+ " AND c1.chg_code = ts_sub_charge2"
				+ " AND c1.chg_effective_date ="
				+ " (SELECT MAX(c2.chg_effective_date)"
				+ " FROM chg_charges c2"
				+ " WHERE c2.chg_code = c1.chg_code"
				+ " AND c2.chg_code = ts_sub_charge2)"
				+ " AND c1.chg_class_id = dgd_class_id"
				+ " AND dqk_key = qual_key"
				+ " AND qual_val = dqk_key_val"
				+ " AND dqk_from <= qual_from"
				+ " AND qual_to <= dqk_to"
				+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"percDiscount2",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'P'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge2) > 0"
					+ " AND c1.chg_code = ts_sub_charge2"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge2)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"percDiscount3E",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
					+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
					+ " WHERE dip_discount_id = sdi_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = sdi_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
					+ " AND ts_package_code = ?"
					+ " AND sdi_subscriber_id = ? "
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'P'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge3) > 0"
					+ " AND c1.chg_code = ts_sub_charge3"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge3)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"percDiscount3",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'P'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge3) > 0"
					+ " AND c1.chg_code = ts_sub_charge3"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge3)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount1E",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
					+ " WHERE dip_discount_id = sdi_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = sdi_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
					+ " AND ts_package_code = ?"
					+ " AND sdi_subscriber_id = ? "
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge1) > 0"
					+ " AND c1.chg_code = ts_sub_charge1"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)" 
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge1)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount1",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge1) > 0"
					+ " AND c1.chg_code = ts_sub_charge1"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)" 
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge1)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount2E",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
					+ " WHERE dip_discount_id = sdi_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = sdi_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
					+ " AND ts_package_code = ?"
					+ " AND sdi_subscriber_id = ? "
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge2) > 0"
					+ " AND c1.chg_code = ts_sub_charge2"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date) "
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge2)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount2",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge2) > 0"
					+ " AND c1.chg_code = ts_sub_charge2"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date) "
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge2)"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount3E",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_qualification"
					+ " WHERE dip_discount_id = sdi_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = sdi_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
					+ " AND ts_package_code = ?"
					+ " AND sdi_subscriber_id = ? "
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge3) > 0"
					+ " AND c1.chg_code = ts_sub_charge3"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge3)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount3",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)"
					+ " FROM diq_discount_qual, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,"
					+ " dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, cd_class_def, temp_qualification"
					+ " WHERE dip_discount_id = diq_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = diq_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND diq_end_date >= ?"
					+ " AND ts_package_code = ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'F'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge3) > 0"
					+ " AND c1.chg_code = ts_sub_charge3"
					+ " AND c1.chg_effective_date ="
					+ " (SELECT MAX(c2.chg_effective_date)"
					+ " FROM chg_charges c2"
					+ " WHERE c2.chg_code = c1.chg_code"
					+ " AND c2.chg_code = ts_sub_charge3)"
					+ " AND c1.chg_class_id = dgd_class_id"
					+ " AND dqk_key = qual_key"
					+ " AND qual_val = dqk_key_val"
					+ " AND dqk_from <= qual_from"
					+ " AND qual_to <= dqk_to"
					+ " AND cd_class_id = c1.chg_class_id "
					+ " AND c1.chg_value > 0", false);

	defStaticQuery(
			"getTsTariffService",
			".base.blo.TsTariffServiceDMO",
			"SELECT * FROM ts_tariff_service "
					+ "WHERE ts_package_code = ? "
					+ "AND ts_service_code = ? "
					+ "AND (ts_internal_tariff = ? "
					+ "OR ts_internal_tariff IS NULL "
					+ "OR ts_internal_tariff = '' OR ts_internal_tariff = ' ')",
			true);
	
	defStaticQuery("getVatPercentageByCode", ".common.data.StringDMO",
			"SELECT percentage " + "FROM cevatm " + "WHERE vat_code = ? ",
			false);
	
	defStaticQuery("getActiveSubCount", ".common.data.IntegerDMO", "select count(*) from sbd_sub_dets, vam_active_msisdn "
			+ "where sbd_bill_ac_no = ? "
			+ "and sbd_subscriber_id = vam_subscriber_id "
			+ "and vam_stat_code IN (1, 2 , 4)", false);
	
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
