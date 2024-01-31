package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.BaseDMLFactory;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;

public class GetServdiscOutofcontractDMLFactory extends BaseDMLFactory {

	protected GetServdiscOutofcontractDMLFactory() throws DMLException {		super();
		

		defStaticQuery(
				"percDiscount1",
				".common.data.StringDMO",
					"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)"
					+ " FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, "
					+ " dqk_disc_qual_key,  dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service,  temp_disc_qualification"
					+ " WHERE dip_discount_id = sdi_discount_id"
					+ " AND dir_rule_id = dip_rule_ref"
					+ " AND dib_rule_id = dir_rule_id"
					+ " AND dqk_qual_id = sdi_qual_id"
					+ " AND dgd_group_id = dir_app_disc_id"
					+ " AND (sdi_end_date >= ? OR sdi_end_date IS NULL)"
					+ " AND ts_package_code = ?"
					+ " AND sdi_subscriber_id =  ?"
					+ " AND product = dir_charge_ref"
					+ " AND dir_rule_type = 'C'"
					+ " AND dir_band_type = 'N'"
					+ " AND dib_disc_type = 'P'"
					+ " AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')"
					+ " AND ts_service_code = ?"
					+ " AND LENGTH(ts_sub_charge1) > 0"
					+ " AND c1.chg_code = ts_sub_charge1"
					+ " AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date)"
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
				"percDiscount2",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)\n" + 
				" FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key,dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_disc_qualification\n" + 
				" WHERE dip_discount_id = sdi_discount_id\n" + 
				" AND dir_rule_id = dip_rule_ref\n" + 
				" AND dib_rule_id = dir_rule_id\n" + 
				" AND dqk_qual_id = sdi_qual_id\n" + 
				" AND dgd_group_id = dir_app_disc_id\n" + 
				" AND (sdi_end_date >= ? OR sdi_end_date IS NULL)\n" + 
				" AND ts_package_code = ?\n" + 
				" AND sdi_subscriber_id = ?\n" + 
				" AND product = dir_charge_ref\n" + 
				" AND dir_rule_type = 'C'\n" + 
				" AND dir_band_type = 'N'\n" + 
				" AND dib_disc_type = 'P'\n" + 
				" AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')\n" + 
				" AND ts_service_code = ?\n" + 
				" AND LENGTH(ts_sub_charge2) > 0\n" + 
				" AND c1.chg_code = ts_sub_charge2\n" + 
				" AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date)\n" + 
				" FROM chg_charges c2\n" + 
				" WHERE c2.chg_code = c1.chg_code\n" + 
				" AND c2.chg_code = ts_sub_charge2)\n" + 
				" AND c1.chg_class_id = dgd_class_id\n" + 
				" AND dqk_key = qual_key\n" + 
				" AND qual_val = dqk_key_val\n" + 
				" AND dqk_from <= qual_from\n" +
				" AND qual_to <= dqk_to\n" + 
				" AND c1.chg_value > 0", false);

		defStaticQuery(
				"percDiscount3",
				".common.data.StringDMO",
				"SELECT NVL(SUM((dib_disc_value * chg_value) / 100), 0)\n" + 
				" FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key, dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_disc_qualification\n" + 
				" WHERE dip_discount_id = sdi_discount_id\n" + 
				" AND dir_rule_id = dip_rule_ref\n" + 
				" AND dib_rule_id = dir_rule_id\n" + 
				" AND dqk_qual_id = sdi_qual_id\n" + 
				" AND dgd_group_id = dir_app_disc_id\n" + 
				" AND (sdi_end_date >= ? OR sdi_end_date IS NULL)\n" + 
				" AND ts_package_code = ?\n" + 
				" AND sdi_subscriber_id = ?\n" + 
				" AND product = dir_charge_ref\n" + 
				" AND dir_rule_type = 'C'\n" + 
				" AND dir_band_type = 'N'\n" + 
				" AND dib_disc_type = 'P'\n" + 
				" AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')\n" + 
				" AND ts_service_code = ?\n" + 
				" AND LENGTH(ts_sub_charge3) > 0\n" +
				" AND c1.chg_code = ts_sub_charge3\n" +
				" AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date)\n" + 
				" FROM chg_charges c2\n" + 
				" WHERE c2.chg_code = c1.chg_code\n" + 
				" AND c2.chg_code = ts_sub_charge3)\n" + 
				" AND c1.chg_class_id = dgd_class_id\n" + 
				" AND dqk_key = qual_key\n" + 
				" AND qual_val = dqk_key_val\n" + 
				" AND dqk_from <= qual_from\n" + 
				" AND qual_to <= dqk_to\n" + 
				" AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount1",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)\n" + 
				" FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key, dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_disc_qualification\n" + 
				" WHERE dip_discount_id = sdi_discount_id\n" + 
				" AND dir_rule_id = dip_rule_ref\n" + 
				" AND dib_rule_id = dir_rule_id\n" + 
				" AND dqk_qual_id = sdi_qual_id\n" + 
				" AND dgd_group_id = dir_app_disc_id\n" + 
				" AND (sdi_end_date >= ? OR sdi_end_date IS NULL)\n" + 
				" AND ts_package_code = ?\n" + 
				" AND sdi_subscriber_id =  ?\n" + 
				" AND product = dir_charge_ref\n" + 
				" AND dir_rule_type = 'C'\n" + 
				" AND dir_band_type = 'N'\n" + 
				" AND dib_disc_type = 'F'\n" + 
				" AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')\n" + 
				" AND ts_service_code = ?\n" + 
				" AND LENGTH(ts_sub_charge1) > 0\n" + 
				" AND c1.chg_code = ts_sub_charge1\n" + 
				" AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date) \n" + 
				" FROM chg_charges c2\n" + 
				" WHERE c2.chg_code = c1.chg_code\n" + 
				" AND c2.chg_code = ts_sub_charge1)\n" + 
				" AND c1.chg_class_id = dgd_class_id\n" + 
				" AND dqk_key = qual_key\n" + 
				" AND qual_val = dqk_key_val\n" + 
				" AND dqk_from <= qual_from\n" + 
				" AND qual_to <= dqk_to\n" + 
				" AND c1.chg_value > 0", false);

		defStaticQuery(
				"fixedDiscount2",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)\n" + 
				" FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key, dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_disc_qualification\n" + 
				" WHERE dip_discount_id = sdi_discount_id\n" + 
				" AND dir_rule_id = dip_rule_ref\n" + 
				" AND dib_rule_id = dir_rule_id\n" + 
				" AND dqk_qual_id = sdi_qual_id\n" + 
				" AND dgd_group_id = dir_app_disc_id\n" + 
				" AND (sdi_end_date >= ? OR sdi_end_date IS NULL)\n" + 
				" AND ts_package_code = ?\n" + 
				" AND sdi_subscriber_id =  p_subscriber_id,\n" + 
				" AND product = dir_charge_ref\n" + 
				" AND dir_rule_type = 'C'\n" + 
				" AND dir_band_type = 'N'\n" + 
				" AND dib_disc_type = 'F'\n" + 
				" AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')\n" + 
				" AND ts_service_code = ?\n" + 
				" AND LENGTH(ts_sub_charge2) > 0\n" + 
				" AND c1.chg_code = ts_sub_charge2\n" + 
				" AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date)\" ,\n" + 
				" FROM chg_charges c2\n" + 
				" WHERE c2.chg_code = c1.chg_code\n" + 
				" AND c2.chg_code = ts_sub_charge2)\n" + 
				" AND c1.chg_class_id = dgd_class_id\n" + 
				" AND dqk_key = qual_key\n" + 
				" AND qual_val = dqk_key_val\n" + 
				" AND dqk_from <= qual_from\n" + 
				" AND qual_to <= dqk_to\n" + 
				" AND c1.chg_value > 0", false);


		defStaticQuery(
				"fixedDiscount3",
				".common.data.StringDMO",
				"SELECT NVL(SUM(dib_disc_value), 0)\n" + 
				"FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, dqk_disc_qual_key, dgd_disc_grp_det, opservm, chg_charges c1, ts_tariff_service, temp_disc_qualification\n" + 
				" WHERE dip_discount_id = sdi_discount_id\n" + 
				" AND dir_rule_id = dip_rule_ref\n" + 
				" AND dib_rule_id = dir_rule_id\n" + 
				" AND dqk_qual_id = sdi_qual_id\n" + 
				" AND dgd_group_id = dir_app_disc_id\n" + 
				" AND (sdi_end_date >= ? OR sdi_end_date IS NULL)\n" + 
				" AND ts_package_code = ?\n" + 
				" AND sdi_subscriber_id =  ?\n" + 
				" AND product = dir_charge_ref\n" + 
				" AND dir_rule_type = 'C'\n" + 
				" AND dir_band_type = 'N'\n" + 
				" AND dib_disc_type = 'F'\n" + 
				" AND (ts_internal_tariff = ? OR ts_internal_tariff IS NULL OR ts_internal_tariff = '')\n" + 
				" AND ts_service_code = ?\n" + 
				" AND LENGTH(ts_sub_charge3) > 0\n" + 
				" AND c1.chg_code = ts_sub_charge3\n" + 
				" AND c1.chg_effective_date = (SELECT MAX(c2.chg_effective_date)\n" + 
				" FROM chg_charges c2\n" + 
				" WHERE c2.chg_code = c1.chg_code\n" + 
				" AND c2.chg_code = ts_sub_charge3)\n" + 
				" AND c1.chg_class_id = dgd_class_id\n" + 
				" AND dqk_key = qual_key\n" + 
				" AND qual_val = dqk_key_val\n" + 
				" AND dqk_from <= qual_from\n" + 
				" AND qual_to <= dqk_to\n" + 
				" AND c1.chg_value > 0", false);

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

	/** The DMLFactory singleton */
	private static GetServdiscOutofcontractDMLFactory dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetServdiscOutofcontractDML();
		}
		return dml;
	}
}
