package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.AsrAddServReqDMO;
import com.eppixcomm.eppix.base.blo.AudAddressDMO;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.dml.BaseDMLFactory;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DpfDefPocFolderDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivDMO;

public class SubscriberUpgradeMigradeDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static SubscriberUpgradeMigradeDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SubscriberUpgradeMigradeDML();
		}
		return dml;
	}

	protected SubscriberUpgradeMigradeDMLFactory() throws DMLException {

		defStaticQuery("getTsTariffService", ".base.blo.TsTariffServiceDMO",
				"SELECT * FROM ts_tariff_service"
						+ " WHERE ts_package_code = ? "
						+ " AND ts_service_code = ? "
						+ " AND (ts_internal_tariff = ? "
						+ " OR ts_internal_tariff IS NULL)", false);

		defStaticQuery(
				"getVamSimService",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT vam_active_msisdn.* "
						+ " FROM vam_active_msisdn, vsm_service_msisdn"
						+ " WHERE vam_active_msisdn.vam_sim_no = ? "
						+ " AND vam_active_msisdn.vam_msisdn_no = vsm_service_msisdn.vsm_msisdn_no"
						+ " AND vsm_service_msisdn.vsm_service_code =  ?"
						+ " ORDER BY vam_hierarchy", false);

		defStaticQuery("getSbhdIterator", ".soa.sharedservices.blo.SbhdSbtDQO",
				"SELECT sbhd_split_bill_hd.* FROM sbhd_split_bill_hd, sbt_split_bill_det "
						+ " WHERE sbhd_subscriber_id = ?"
						+ " AND sbhd_status = 'A' "
						+ " AND sbhd_sb_id = sbt_sb_id "
						+ " AND sbt_service_code = ? ", true);

		defStaticQuery("getSplitBillHeaderIterator",
				".soa.sharedservices.blo.SbhdSplitBillHdDMO",
				"SELECT sbhd_sb_id, sbhd_subscriber_id, "
						+ " sbhd_child_ac_no, " + " sbhd_child_msisdn, "
						+ " sbhd_parent_ac_no, " + " sbhd_parent_msisdn, "
						+ " sbhd_credit_accum, " + " sbhd_migrated, "
						+ " sbhd_tot_bill_amt, " + " sbhd_dd_rd, "
						+ " sbhd_act_date," + " sbhd_deact_date,"
						+ " sbhd_billed_upto," + " sbhd_status "
						+ " FROM sbhd_split_bill_hd"
						+ " WHERE sbhd_subscriber_id = ? "
						+ " AND sbhd_status IN ('A', 'S')", true);

		defStaticUpdate("updateSplitBillHeader", "UPDATE sbhd_split_bill_hd "
				+ " SET sbhd_split_bill_hd.sbhd_child_ac_no = ?, "
				+ " sbhd_split_bill_hd.sbhd_child_msisdn = ?,"
				+ " sbhd_split_bill_hd.sbhd_parent_ac_no = ?,"
				+ " sbhd_split_bill_hd.sbhd_parent_msisdn = ?,"
				+ " sbhd_split_bill_hd.sbhd_act_date = ?,"
				+ " sbhd_split_bill_hd.sbhd_deact_date = ?,"
				+ " sbhd_split_bill_hd.sbhd_status = ?"
				+ " WHERE sbhd_sb_id = ?");

		defStaticQuery("getSplitBillHeaderByParentAc",
				".soa.sharedservices.blo.SbhdSplitBillHdDMO",
				"SELECT sbhd_sb_id, sbhd_subscriber_id, "
						+ " sbhd_child_ac_no, " + " sbhd_child_msisdn, "
						+ " sbhd_parent_ac_no, " + " sbhd_parent_msisdn, "
						+ " sbhd_credit_accum, " + " sbhd_migrated, "
						+ " sbhd_tot_bill_amt, " + " sbhd_dd_rd, "
						+ " sbhd_act_date," + " sbhd_deact_date,"
						+ " sbhd_billed_upto," + " sbhd_status "
						+ " FROM sbhd_split_bill_hd"
						+ " WHERE sbhd_subscriber_id = ? "
						+ " AND sbhd_parent_ac_no = ? ", true);

		defStaticUpdate(
				"insertSbhd",
				"insert into sbhd_split_bill_hd(sbhd_sb_id,sbhd_subscriber_id,sbhd_child_ac_no,"
						+ "sbhd_child_msisdn,sbhd_parent_ac_no,sbhd_parent_msisdn,sbhd_credit_accum,"
						+ "sbhd_migrated,sbhd_tot_bill_amt,sbhd_dd_rd,sbhd_act_date,"
						+ "sbhd_deact_date,sbhd_billed_upto,sbhd_status) "
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

		defStaticUpdate("updateSbtEndDate", "UPDATE sbt_split_bill_det "
				+ " SET sbt_end_date = TODAY" + "	WHERE sbt_sb_id = ");

		defStaticUpdate("insertSbtDetails", "INSERT INTO SBT_SPLIT_BILL_DET("
				+ " SBT_SB_ID," + " SBT_DIR_RULE_ID," + " SBT_DISC_TYPE,"
				+ " SBT_DISC_FIXED," + " SBT_DISC_PERC," + " SBT_SERVICE_CODE,"
				+ " SBT_SERVICE_TYPE," + " SBT_START_DATE," + " SBT_END_DATE,"
				+ " SBT_INDICATOR)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		defStaticQuery(
				"getVasBillLimitByMsisdnTariff",
				".base.blo.VasActiveServiceDMO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,"
						+ "VAS_SERVICE_TYPE,VAS_ACT_DATE,VAS_DEACT_DATE, "
						+ "VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE "
						+ " FROM vas_active_service, vam_active_msisdn "
						+ " WHERE vas_service_code = ? "
						+ " AND vam_msisdn_no = ? "
						+ " AND vas_subscriber_id = vam_subscriber_id "
						+ " AND (vas_intern_tariff = ? "
						+ " OR vas_intern_tariff IS NULL)", false);

		defStaticQuery(
				"getServiceByDealer",
				".base.blo.VsrServiceDMO",
				"SELECT VSR_SERVICE_CODE, VSR_SERVICE_TYPE, VSR_SERVICE_DESC, VSR_ORIGINATOR, "
						+ " VSR_SERVICE_CLASS, VSR_TEMP_DEACT, VSR_PRORATA, VSR_PROVIDER_ID, VSR_SHORT_DESC, VSR_SUSPEND "
						+ " FROM vsr_service " + " WHERE vsr_service_code = ? "
						+ " AND vsr_service_code IN (SELECT dsr_service_code "
						+ " FROM dsr_dealer_service "
						+ " WHERE dsr_dealer_id = ? )", true);

		defStaticQuery("getMAXSbuSbeNotUpgradeStatusC",
				".common.data.IntegerDMO", "SELECT MAX(sbu_subupgrade_id) "
						+ "FROM sbu_sub_upgrade "
						+ "WHERE sbu_subscriber_id = ? "
						+ "AND sbu_upgrade_status != 'C'", false);

		defStaticQuery("getAcnAction", // dmlName,
				".soa.sharedservices.blo.AcnActionDMO", // dmoName,
				"SELECT * FROM acn_action WHERE acn_action_type = ? "
						+ "AND acn_action_rsn = ? ",// selectStmt,
				false);// isMultiRow);

		defStaticQuery(
				"getDealrsAct",
				".base.blo.DealersDMO",
				"SELECT DEALER_ID, PL_ACC_NO, COMM_PLAN, DEAL_TYPE, ACTIV_MTD, DEACT_MTD, REVEN_MTD, ACTIV_YTD, DEACT_YTD"
						+ ", ITEMI_YTD, REVEN_YTD, COMMI_YTD, ACTIV_CUM, DEACT_CUM, ITEMI_CUM, REVEN_CUM, COMMI_CUM, LAST_COMM"
						+ ", BARR_INDI, CLAW_BAC1, CLAW_BAC2, DEALER_NL, QUAL_PERIOD, QBONUSYTD, dealers.DATE_CREATED, CLAW_INT1, CLAW_VAL1"
						+ ", CLAW_INT2, CLAW_VAL2, EPOS_FLAG, ACC_MIN_QTY, ACC_CURR_QTY, ACC_SHIP_QTY, REGION, DEALER_GROUP, DEALER_DIRECT, DEALER_ACTIVE, DEALER_INACTIVE"
						+ " FROM dealers, OUTER plsuppm"
						+ " WHERE dealer_id = ? "
						+ " AND (dealer_inactive IS NULL"
						+ " OR dealer_inactive >= TODAY)"
						+ " AND dealer_active <= TODAY"
						+ " AND supplier  = dealer_id", false);

		defStaticQuery("getMAXSbuSbe", ".common.data.IntegerDMO",
				"SELECT MAX(sbu_subupgrade_id) " + "FROM sbu_sub_upgrade "
						+ "WHERE sbu_subscriber_id = ? "
						+ "AND sbu_upgrade_status = 'C'", false);

		defStaticQuery(
				"getSalePersonAct",
				".soa.sharedservices.blo.SlpSalespersonDMO",
				"SELECT SLP_SALESPERSON_ID,SLP_NAME,SLP_DEALER_ID,SLP_ACTIVE_DATE,SLP_INACTIVE_DATE,SLP_MTN_NO,SLP_REGION,SLP_DEPARTMENT,SLP_IND_MANAGER"
						+ " FROM SLP_SALESPERSON "
						+ " WHERE SLP_SALESPERSON_ID = ? "
						+ " AND SLP_DEALER_ID = ? "
						+ " AND (SLP_INACTIVE_DATE IS NULL "
						+ " OR SLP_INACTIVE_DATE >= TODAY) "
						+ " AND SLP_ACTIVE_DATE <= TODAY", false);

		defStaticQuery(
				"getSalePersonAll",
				".soa.sharedservices.blo.SlpSalespersonDMO",
				"SELECT SLP_SALESPERSON_ID,SLP_NAME,SLP_DEALER_ID,SLP_ACTIVE_DATE,SLP_INACTIVE_DATE,SLP_MTN_NO,SLP_REGION,SLP_DEPARTMENT,SLP_IND_MANAGER"
						+ "FROM SLP_SALESPERSON "
						+ "WHERE SLP_SALESPERSON_ID = ? "
						+ "AND SLP_DEALER_ID = ? ", false);

		defStaticQuery("getVamMinMSISDNByStatus",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT * FROM VAM_ACTIVE_MSISDN" + " WHERE (VAM_SIM_NO) = ?"
						+ " AND (VAM_STAT_CODE) = ?"
						+ " AND VAM_MSISDN_NO = (SELECT MIN(vam_msisdn_no)"
						+ " FROM vam_active_msisdn" + " WHERE (VAM_SIM_NO) = ?"
						+ " AND (VAM_STAT_CODE) = ?)", false);

		defStaticQuery("getVamMinMSISDNNoStatus",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT * FROM VAM_ACTIVE_MSISDN" + " WHERE (VAM_SIM_NO) = ?"
						+ " AND VAM_MSISDN_NO = (SELECT MIN(vam_msisdn_no)"
						+ " FROM vam_active_msisdn"
						+ " WHERE (VAM_SIM_NO) = ?)", false);

		defStaticQuery(
				"getPcBenefit",
				".soa.sharedservices.blo.PcPartnerConfigDMO",
				"SELECT pc_partner_config.* "
						+ " FROM pc_partner_config, pg_partner_group, ps_partner_service "
						+ " WHERE ps_benefit_type = ? "
						+ " AND ps_benefit_code = ? "
						+ " AND pg_group_id = ps_group_id "
						+ " AND pc_config_id = pg_config_id", false);

		defStaticQuery("paramServiceCheck", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0)"
						+ " FROM vsm_service_msisdn, vam_active_msisdn"
						+ " WHERE vsm_subscriber_id = ?"
						+ " AND vsm_service_code = ? " + " AND vam_sim_no = ?"
						+ " AND vam_subscriber_id = vsm_subscriber_id"
						+ " AND vam_msisdn_no = vsm_msisdn_no", false);
		
		

		defStaticQuery("iterateSimDeact", ".base.blo.VamActiveMsisdnDMO",
				"SELECT vam_active_msisdn.* "
						+ " FROM vam_active_msisdn, vsm_service_msisdn "
						+ " WHERE vam_subscriber_id = vsm_subscriber_id "
						+ " AND   vam_subscriber_id = ? "
						+ " AND vam_sim_no = ? "
						+ " AND vam_msisdn_no = vsm_msisdn_no "
						+ " AND vsm_service_code = ?", true);

		defStaticUpdate("deleteEfgFuturQueue", "DELETE FROM efq_future_queue "
				+ " WHERE efq_command = ? ");

		defStaticQuery("iteratePrimaryMsisdns", ".base.blo.VamActiveMsisdnDMO",
				" SELECT * " + " FROM vam_active_msisdn "
						+ " WHERE vam_subscriber_id = ? "
						+ " AND vam_msisdn_no != ? "
						+ " AND vam_stat_code IN ('1', '4')", false);

		defStaticQuery("serviceExistsOnSim", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) "
						+ "FROM vam_active_msisdn, vsm_service_msisdn "
						+ " WHERE vam_msisdn_no = vsm_msisdn_no"
						+ " AND vam_sim_no = ?" + " AND vsm_service_code = ? ",
				false);

		defStaticQuery("iterateSdeSubServSimMsisdnPackage",
				".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_service_code    =  ? "
						+ " AND sde_sim_no          =  ? "
						+ " AND sde_msisdn_no MATCHES  ? "
						+ " AND sde_package_code = ? "
						+ " ORDER BY sde_deposit_id DESC", true);

		defStaticUpdate("updateDiqDiscountQual", "UPDATE diq_discount_qual "
				+ "SET diq_used = diq_used - 1 " + " WHERE diq_qual_id = ? ");

		defStaticUpdate("insertDshDiscHistory",
				"INSERT INTO DSH_DISC_HISTORY (" + "DSH_DISC_HIST_ID, "
						+ "DSH_SUBSCRIBER_ID, " + "DSH_ACCOUNT, "
						+ "DSH_DISC_PLAN_ID, " + "DSH_RULE_REF, "
						+ "DSH_RULE_ID, " + "DSH_BAND_ID, " + "DSH_THRESHOLD, "
						+ "DSH_DISCOUNTABLE, " + "DSH_DISC_VALUE, "
						+ "DSH_INVOICE_NO, " + "DSH_TIMESTAMP) "
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");

		defStaticQuery(
				"getSdiDipDirDibChgByStartDate",
				".soa.sharedservices.blo.SdiDipDirDibChgDQO",
				"SELECT SDI_SUB_DISC_ID, SDI_SUBSCRIBER_ID, SDI_DISCOUNT_ID, SDI_START_DATE, SDI_END_DATE,  "
						+ "SDI_SUSPEND_DATE, SDI_QUAL_ID, SDI_QUAL_TYPE, SDI_PACKAGE_CODE, SDI_TARIFF_PLAN,  "
						+ "SDI_SERVICE_CODE, SDI_PAYMENT_TYPE, SDI_ACCOUNT_TYPE, SDI_DISCOUNT_UPTO, DIP_DISCOUNT_ID,  "
						+ "DIP_SEQUENCE, DIP_RULE_REF, DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE,  "
						+ "DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER, DIR_APPLY_FOR, DIR_TYPE_CODE, DIR_UOM_ID,  "
						+ "DIR_APPLY_EVERY, DIR_FILTER_ACC, DIR_FILTER_LEGAL, DIR_FILTER_PACKAGE, DIR_FILTER_TARIFF,  "
						+ "DIR_PERCENT_COUNT, DIR_ONCE_OFF_FEE, DIR_BAND_TYPE, DIR_THRESHOLD_ID, DIR_APP_DISC_ID,  "
						+ "DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL, DIR_PERCENT_SPLIT, DIR_INV_DISPLAY,  "
						+ "DIB_BAND_ID, DIB_RULE_ID, DIB_BAND_END, DIB_DISC_TYPE, DIB_DISC_VALUE, DIB_MAX_DISCOUNT,  "
						+ "DIB_LIMIT_DISC, DIB_CHARGE_REF, CHG_CODE, CHG_DESCRIPTION, CHG_VALUE, CHG_VAT_CODE,  "
						+ "CHG_NCODE, CHG_NETID, CHG_CHARGEF, CHG_PERIOD, CHG_FREQUENCY, CHG_EFFECTIVE_DATE,  "
						+ "CHG_CLASS_ID "
						+ "FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, chg_charges "
						+ "WHERE sdi_sub_disc_id = ? "
						+ "AND sdi_discount_id = dip_discount_id "
						+ "AND dip_rule_ref = dir_rule_ref "
						+ "AND dir_rule_id = dib_rule_id "
						+ "AND dib_disc_type = 'F' "
						+ "AND dib_charge_ref = chg_code "
						+ "AND DATE(sdi_start_date) = ?  ", false);

		defStaticQuery(
				"getSdiDipDirDibChgByEndDate",
				".soa.sharedservices.blo.SdiDipDirDibChgDQO",
				"SELECT SDI_SUB_DISC_ID, SDI_SUBSCRIBER_ID, SDI_DISCOUNT_ID, SDI_START_DATE, SDI_END_DATE, "
						+ "SDI_SUSPEND_DATE, SDI_QUAL_ID, SDI_QUAL_TYPE, SDI_PACKAGE_CODE, SDI_TARIFF_PLAN,  "
						+ "SDI_SERVICE_CODE, SDI_PAYMENT_TYPE, SDI_ACCOUNT_TYPE, SDI_DISCOUNT_UPTO, DIP_DISCOUNT_ID,  "
						+ "DIP_SEQUENCE, DIP_RULE_REF, DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE,  "
						+ "DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER, DIR_APPLY_FOR, DIR_TYPE_CODE, DIR_UOM_ID,  "
						+ "DIR_APPLY_EVERY, DIR_FILTER_ACC, DIR_FILTER_LEGAL, DIR_FILTER_PACKAGE, DIR_FILTER_TARIFF,  "
						+ "DIR_PERCENT_COUNT, DIR_ONCE_OFF_FEE, DIR_BAND_TYPE, DIR_THRESHOLD_ID, DIR_APP_DISC_ID,  "
						+ "DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL, DIR_PERCENT_SPLIT, DIR_INV_DISPLAY,  "
						+ "DIB_BAND_ID, DIB_RULE_ID, DIB_BAND_END, DIB_DISC_TYPE, DIB_DISC_VALUE, DIB_MAX_DISCOUNT,  "
						+ "DIB_LIMIT_DISC, DIB_CHARGE_REF, CHG_CODE, CHG_DESCRIPTION, CHG_VALUE, CHG_VAT_CODE,  "
						+ "CHG_NCODE, CHG_NETID, CHG_CHARGEF, CHG_PERIOD, CHG_FREQUENCY, CHG_EFFECTIVE_DATE,  "
						+ "CHG_CLASS_ID "
						+ "FROM sdi_subs_discount, dip_discount_plan, dir_discount_rule, dib_discount_band, chg_charges "
						+ "WHERE sdi_sub_disc_id = ? "
						+ "AND sdi_discount_id = dip_discount_id "
						+ "AND dip_rule_ref = dir_rule_ref "
						+ "AND dir_rule_id = dib_rule_id "
						+ "AND dib_disc_type = 'F' "
						+ "AND dib_charge_ref = chg_code "
						+ "AND DATE(sdi_end_date) = ? ", false);

		defStaticQuery(
				"getSdiBySubscriberDiscEndDate",
				".soa.sharedservices.blo.SdiSubsDiscountDMO",
				"SELECT SDI_SUB_DISC_ID,SDI_SUBSCRIBER_ID,SDI_DISCOUNT_ID,"
						+ "SDI_START_DATE,SDI_END_DATE,SDI_SUSPEND_DATE,SDI_QUAL_ID,SDI_QUAL_TYPE,"
						+ "SDI_PACKAGE_CODE,SDI_TARIFF_PLAN,SDI_SERVICE_CODE,SDI_PAYMENT_TYPE,"
						+ "SDI_ACCOUNT_TYPE,SDI_DISCOUNT_UPTO DATE "
						+ " FROM SDI_SUBS_DISCOUNT"
						+ " WHERE SDI_SUBSCRIBER_ID = ?"
						+ " AND SDI_DISCOUNT_ID = ?"
						+ " AND (SDI_END_DATE IS NULL OR SDI_END_DATE > ?)",
				false);

		defStaticUpdate("terminateSubscriberDiscount",
				"UPDATE sdi_subs_discount " + "SET sdi_end_date  = CURRENT "
						+ "WHERE sdi_subscriber_id = ? "
						+ "AND sdi_qual_id = ? " + "AND sdi_discount_id = ?");

		defStaticQuery(
				"getSbeSubEquipBySubscriber",
				".soa.sharedservices.blo.SbeSubEquipDMO",
				"SELECT sbe_sub_equip_id,sbe_subscriber_id,sbe_imei_no,sbe_serial_no,"
						+ "sbe_warehouse,sbe_product_code,sbe_antenna,sbe_msisdn,sbe_analysis1,"
						+ "sbe_analysis2,sbe_analysis3,sbe_active_date "
						+ "FROM sbe_sub_equip "
						+ "WHERE sbe_subscriber_id = ? ORDER BY sbe_active_date DESC",
				true);
		
		defStaticQuery(
				"getSbeEquipBySubscriber",
				".soa.sharedservices.blo.SbeSubEquipDMO",
				"SELECT sbe_sub_equip_id,sbe_subscriber_id,sbe_imei_no,sbe_serial_no,"
						+ "sbe_warehouse,sbe_product_code,sbe_antenna,sbe_msisdn,sbe_analysis1,"
						+ "sbe_analysis2,sbe_analysis3,sbe_active_date "
						+ "FROM sbe_sub_equip "
						+ "WHERE sbe_subscriber_id = ? ORDER BY sbe_sub_equip_id DESC",
				false);

		defStaticQuery("getHhHierarchyHead", ".common.data.IntegerDMO",
				"SELECT COUNT(*) AS REC " + "FROM hh_hierarchy_head "
						+ "WHERE hh_serial= ? ", false);

		defStaticQuery("getCountEppixHierarchyByEntityId",
				".common.data.IntegerDMO", "SELECT COUNT(*) AS REC "
						+ "FROM EH_EPPIX_HIERARCHY "
						+ "WHERE EH_ENTITY_ID = ? ", false);

		defStaticQuery("getCountVsrSdiByTTGroup", ".common.data.IntegerDMO",
				"SELECT COUNT(*) as rec "
						+ "FROM vsr_service, sdi_subs_discount "
						+ "WHERE vsr_service_type IN ( "
						+ "SELECT tt_type FROM tt_type_text "
						+ "WHERE tt_group = 'DISCTUG3') "
						+ "AND vsr_service_code = sdi_service_code "
						+ "AND sdi_subscriber_id = ? "
						+ "AND sdi_end_date >= ? ", false);

		defStaticQuery("getSerialCustomer",
				".soa.sharedservices.blo.ScSerialCustomerDMO",
				"SELECT SC_SERIAL, SC_BILL_AC_NO " + "FROM SC_SERIAL_CUSTOMER "
						+ "WHERE SC_BILL_AC_NO = ?", false);

		defStaticUpdate("insSubEquipHistory",
				"INSERT INTO SBE_SUB_EQUIP_HIST (" + "SBE_HIST_EQUIP_ID,"
						+ "SBE_HIST_SUB_ID," + "SBE_HIST_COMMENT,"
						+ "SBE_HIST_ACTION," + "SBE_HIST_USER_ID,"
						+ "SBE_HIST_TIMESTAMP)" + "VALUES(?,?,?,?,?,?)");

		defStaticUpdate("delSbeSubEquipByEquipId",
				"DELETE FROM sbe_sub_equip	WHERE sbe_sub_equip_id = ? ");

		defStaticQuery(
				"getAcnSerial",
				".soa.sharedservices.blo.AcnActionDMO",
				""
						+ "SELECT ACN_ACTION_SERIAL,ACN_ACTION_TYPE,ACN_ACTION_RSN,"
						+ "ACN_SUSPENDED,ACN_DEF_DEADLINE,ACN_MAX_DEADLINE,ACN_ESC_IND,"
						+ "ACN_ESC_DELAY,ACN_ATTACH_LEVEL,ACN_REF_NO_FLD,ACN_INV_NO_FLD,"
						+ "ACN_ARCHIVE_NOTES,ACN_DEF_PRIORITY "
						+ "FROM ACN_ACTION " + "WHERE ACN_ACTION_SERIAL = ?",
				false);

		defStaticQuery("getUsUserDef", ".soa.sharedservices.blo.UsUserDefDMO",
				"SELECT US_LOGIN,US_NAME,US_DEPARTMENT,"
						+ "US_PASSWORD,US_EMAIL,US_DIARY_SUSPENDED,"
						+ "US_STANDIN,US_STANDIN_AS_MGR,US_EXTERNAL_TYPE, "
						+ "US_EXTERNAL_CODE " + "FROM US_USER_DEF "
						+ "WHERE US_LOGIN = ?", false);

		defStaticQuery("checkAcnMgrUser", ".common.data.IntegerDMO",
				"SELECT COUNT(*) FROM acg_action_group "
						+ "WHERE acg_action_serial = ? "
						+ "AND acg_create_note = 'Y' "
						+ "AND (acg_group_serial IN "
						+ "(SELECT trg_group_serial "
						+ "FROM trg_target_group "
						+ "WHERE trg_supervisor =  ? "
						+ "OR trg_supervisor IN " + "(SELECT us_login "
						+ "FROM us_user_def "
						+ "WHERE us_diary_suspended = 'Y' "
						+ "AND us_standin =  ? "
						+ "AND us_standin_as_mgr = 'Y')) "
						+ "OR acg_group_serial IN "
						+ "(SELECT usg_group_serial " + "FROM usg_user_group "
						+ "WHERE usg_login =  ? " + "OR usg_login IN "
						+ "(SELECT us_login " + "FROM us_user_def "
						+ "WHERE us_diary_suspended = 'Y' "
						+ "AND us_standin =  ? "
						+ "AND us_standin_as_mgr = 'Y')))", false);

		defStaticQuery("getUhrUserHierarchy",
				".soa.sharedservices.blo.UhrUserHierarchyDMO",
				"SELECT UHR_LOGIN, UHR_NODE_ID, UHR_NODE_LEVEL, "
						+ "UHR_STAFF_COUNT, UHR_SUPERIOR "
						+ "FROM UHR_USER_HIERARCHY " + "WHERE UHR_LOGIN = ?",
				false);

		defStaticQuery("getTrgTargetGroupByGrpName",
				".soa.sharedservices.blo.TrgTargetGroupDMO",
				"SELECT TRG_GROUP_SERIAL, TRG_GROUP_NAME, TRG_SUPERVISOR, "
						+ "TRG_SUSPENDED " + "FROM TRG_TARGET_GROUP "
						+ "WHERE TRG_GROUP_NAME= ? ", false);

		defStaticQuery("getTrgTargetGroupBySerial",
				".soa.sharedservices.blo.TrgTargetGroupDMO",
				"SELECT TRG_GROUP_SERIAL, TRG_GROUP_NAME, TRG_SUPERVISOR, "
						+ "TRG_SUSPENDED " + "FROM TRG_TARGET_GROUP "
						+ "WHERE TRG_GROUP_SERIAL= ? ", false);

		defStaticQuery("getInxInvoiceXREF",
				".soa.sharedservices.blo.InxInvoiceXrefDMO",
				"SELECT INX_CUSTOMER,INX_SUBSCRIBER_ID,INX_INVOICE_NO,"
						+ "INX_MSISDN_NO,INX_MSISDN_FLAG "
						+ "FROM INX_INVOICE_XREF "
						+ "WHERE INX_INVOICE_NO = ? ", false);

		defStaticUpdate("insertTpdTextPad", "INSERT INTO TPD_TEXT_PAD ("
				+ "TPD_OWNER_SERIAL, " + "TPD_TYPE, " + "TPD_PAGE_NO, "
				+ "TPD_BLOCK_NO, " + "TPD_BLOCK_ATTR, " + "TPD_BLOCK_TEXT) "
				+ "VALUES(?, ?, ?, ?, ?, ?);");

		defStaticUpdate("updateTpdTextPad",
				"UPDATE TPD_TEXT_PAD SET TPD_BLOCK_ATTR = ?, "
						+ "TPD_BLOCK_TEXT = ? " + "WHERE TPD_OWNER_SERIAL = ? "
						+ "AND TPD_TYPE = ? " + "AND TPD_PAGE_NO = ? "
						+ "AND TPD_BLOCK_NO = ? ");

		defStaticQuery(
				"getSbdSba",
				".soa.sharedservices.blo.SbdsbaDQO",
				"SELECT SBD_SUBSCRIBER_ID, SBD_DIALLING_NO, SBD_BILL_AC_NO, SBD_CONNECT_DATE, SBD_DCONNECT_DATE, SBD_TERM_DATE, SBD_TITLE, SBD_SURNAME, SBD_FIRSTNAME"
						+ ", SBD_GENDER, SBD_DOB, SBD_PASSWORD, SBD_LOCATION_CODE, SBD_BILL_CYCLE, SBD_PACKAGE_CODE, SBD_BILLED_UPTO, SBD_TARIFF_PLAN,"
						+ " SBA_SUBSCRIBER_ID, SBA_ID_NUMBER, SBA_MATCHCODE, SBA_MARKETING,"
						+ " SBA_THIRD_PARTY, SBA_CUST_DEPT, SBA_DEALER_ID, SBA_DEPARTMENT,"
						+ " SBA_SALESMAN, SBA_REGION, SBA_INVOICE_ADDRID, SBA_INV_ACCOUNT,"
						+ " SBA_PREPAID_STAT, SBA_ANALYSIS_1, SBA_ANALYSIS_2, SBA_ANALYSIS_3,"
						+ " SBA_ANALYSIS_4, SBA_ANALYSIS_5, SBA_ANALYSIS_6, SBA_ANALYSIS_7,"
						+ " SBA_ANALYSIS_8, SBA_ANALYSIS_9, SBA_ANALYSIS_10, SBA_ANALYSIS_11,"
						+ " SBA_ANALYSIS_12, SBA_ANALYSIS_13, SBA_ANALYSIS_14, SBA_ANALYSIS_15,"
						+ " SBA_ANALYSIS_16, SBA_ANALYSIS_17, SBA_ANALYSIS_18, SBA_ANALYSIS_19,"
						+ " SBA_ANALYSIS_20, SBA_ANALYSIS_21, SBA_ANALYSIS_22, SBA_ANALYSIS_23,"
						+ " SBA_ANALYSIS_24, SBA_ANALYSIS_25, SBA_ANALYSIS_26, SBA_ANALYSIS_27,"
						+ " SBA_ANALYSIS_28, SBA_ANALYSIS_29, SBA_ANALYSIS_30,SBA_COMMENTS "
						+ "FROM sbd_sub_dets,sba_sub_aux "
						+ "WHERE sbd_subscriber_id = ? "
						+ "AND sba_subscriber_id = sbd_subscriber_id", false);

		defStaticQuery("getTpdTextPad",
				".soa.sharedservices.blo.TpdTextPadDMO",
				"SELECT TPD_OWNER_SERIAL, TPD_TYPE, TPD_PAGE_NO, "
						+ "TPD_BLOCK_NO, TPD_BLOCK_ATTR, TPD_BLOCK_TEXT "
						+ "FROM TPD_TEXT_PAD  " + "WHERE TPD_OWNER_SERIAL = ? "
						+ "AND TPD_TYPE = ? " + "AND TPD_PAGE_NO = ? "
						+ "AND TPD_BLOCK_NO = ? ", false);

		defStaticQuery("getAuxCustEncrypted", // dmlName,
				".soa.sharedservices.blo.AuxEncryptedDMO", // dmoName,
				"SELECT bill_ac_no, key_version,"
						+ " DECRYPT_CHAR (cc_no, ?) as cc_no,"
						+ " DECRYPT_CHAR (cc_cvv_no, ?) as cc_cvv_no,"
						+ " DECRYPT_CHAR (bank_ac_no, ?) as bank_ac_no,"
						+ " DECRYPT_CHAR (id_no, ?) as id_no,"
						+ " DECRYPT_CHAR (passport_no, ?) as passport_no"
						+ " FROM aux_encrypted WHERE bill_ac_no = ?",// selectStmt,
				false);// isMultiRow);

		defStaticQuery(
				"getVamBySbd",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5 "
						+ " FROM vam_active_msisdn, sbd_sub_dets"
						+ " WHERE sbd_subscriber_id = ?"
						+ " AND vam_msisdn_no = ?", false);

		defStaticQuery("getAuxEncryptKey", // dmlName,
				".common.data.StringDMO", // dmoName,
				"SELECT eek_encryption_key "
						+ "FROM aux_encrypted, eek_eppix_enc_key "
						+ "WHERE bill_ac_no = ? "
						+ "AND key_version = eek_version ",// selectStmt,
				false);// isMultiRow);

		defStaticQuery(
				"getMmcMigCntrl",
				".soa.sharedservices.blo.MmcMigCntrlDMO",
				"SELECT  mmc_type,mmc_from,mmc_to,mmc_automate,mmc_in_cont_chg,mmc_out_cont_chg,"
						+ "mmc_chg_map_act,mmc_chg_nomap_act,mmc_chg_map_pro,mmc_chg_nomap_pro,mmc_ins_pending "
						+ "FROM mmc_mig_cntrl "
						+ "WHERE mmc_type = ? "
						+ "AND mmc_from = ? " + "AND mmc_to = ?", false);

		defStaticQuery(
				"getVamBySbd",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5 "
						+ " FROM vam_active_msisdn, sbd_sub_dets"
						+ " WHERE sbd_subscriber_id = ?"
						+ " AND vam_msisdn_no = ?", false);

		defStaticQuery("getPartnerTarExists", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0)" + " FROM pc_partner_config"
						+ " WHERE pc_package_code = ?"
						+ " AND (pc_tarplan_ref = ?"
						+ " OR pc_tarplan_ref = ?)", false);

		defStaticQuery(
				"verifyServiceTypeExistsOnSim",
				".common.data.IntegerDMO",
				"SELECT UNIQUE(0) "
						+ "FROM vam_active_msisdn, vsm_service_msisdn, vsr_service, vst_service_types "
						+ "WHERE vam_msisdn_no = vsm_msisdn_no "
						+ "AND vam_sim_no = ? "
						+ "AND vsm_service_code = vsr_service_code "
						+ "AND vst_service_type = vsr_service_type "
						+ "AND vst_service_type = ? ", false);

		defStaticQuery(
				"getTsBenefit",
				".base.blo.TsTariffServiceDMO",
				"SELECT ts_tariff_service.* "
						+ " FROM pc_partner_config, pg_partner_group,ps_partner_service, ts_tariff_service "
						+ " WHERE pc_partner_id = ? "
						+ " AND pc_member_status = ? "
						+ " AND pc_config_id = pg_config_id "
						+ " AND pc_package_code = ts_package_code "
						+ " AND pc_tarplan_ref = ts_internal_tariff "
						+ " AND ps_group_id = pg_group_id "
						+ " AND ts_package_code = ? "
						+ " AND ts_internal_tariff = ? "
						+ " AND ts_service_code = ps_benefit_code", false);

		defStaticQuery(
				"getPcPgPs",
				".soa.sharedservices.blo.PcPgPsDQO",
				"SELECT *  "
						+ "FROM pc_partner_config, pg_partner_group, ps_partner_service "
						+ " WHERE pc_config_id = pg_config_id "
						+ " AND ps_group_id = pg_group_id "
						+ " AND pc_partner_id = ? "
						+ " AND pc_member_status = ? "
						+ " AND pc_package_code = ? "
						+ " AND  pc_tarplan_ref = ? "
						+ " AND ps_benefit_code = ?", false);

		defStaticUpdate(
				"createEdEventDelay",
				"INSERT INTO ED_EVENT_DELAY ("
						+ "ED_PARTNER_ID, ED_SUBSCRIBER_ID, ED_SIM_NO, ED_MSISDN_NO, ED_SEND_SEQ, ED_STATUS,"
						+ "ED_CYCLE, ED_ACTION_CODE, ED_PARTNER_STATUS, ED_OLD_PRODUCT, ED_NEW_PRODUCT, ED_SUPERPRODUCT,"
						+ "ED_PRICEPLAN, ED_NEW_PRICEPLAN, ED_DATETIME_STAMP, ED_N2N_TIMESTAMP, ED_COMMENT)"
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? );");

		defStaticQuery("getSptServParamTar",
				".soa.sharedservices.blo.SptServParaTarDMO",
				"SELECT * FROM spt_serv_para_tar " + " WHERE spt_param_id = ? "
						+ " AND spt_tariff_code = ? "
						+ " AND spt_package_code = ? ", false);

		defStaticQuery("getScv", ".soa.sharedservices.blo.ScvSubCrmValueDMO",
				"SELECT SCV_SUBSCRIBER_ID, SCV_CRM_VALUE, SCV_TYPE "
						+ "FROM SCV_SUB_CRM_VALUE "
						+ "WHERE SCV_SUBSCRIBER_ID = ?", false);

		defStaticQuery("getVsmUniqueServiceCodeBySubsciber",
				".common.data.StringDMO",
				"select vsm_service_code from vsm_service_msisdn	"
						+ "where vsm_subscriber_id = ? "
						+ "group by vsm_service_code", true);

		defStaticQuery("getEppixHierarchyByTypeSubscriber",
				".soa.sharedservices.blo.EhEppixHierarchyDMO",
				"SELECT EH_SERIAL, EH_ENTITY_ID, EH_TYPE, EH_VALUE, EH_LINK, EH_HIER_TYPE "
						+ "FROM EH_EPPIX_HIERARCHY "
						+ "WHERE EH_TYPE = 'SUBSCRIBER' "
						+ "AND EH_ENTITY_ID = ? ", false);

		defStaticQuery("getEppixHierarchyByType",
				".soa.sharedservices.blo.EhEppixHierarchyDMO",
				"SELECT EH_SERIAL, EH_ENTITY_ID, EH_TYPE, EH_VALUE, EH_LINK, EH_HIER_TYPE "
						+ "FROM EH_EPPIX_HIERARCHY "
						+ "WHERE EH_ENTITY_ID = ? " + "AND EH_HIER_TYPE = ? "
						+ "AND EH_TYPE = ? ", false);

		defStaticQuery("getEppixHierarchyBySerial",
				".soa.sharedservices.blo.EhEppixHierarchyDMO",
				"SELECT EH_SERIAL, EH_ENTITY_ID, EH_TYPE, EH_VALUE, EH_LINK, EH_HIER_TYPE "
						+ "FROM EH_EPPIX_HIERARCHY " + "WHERE EH_SERIAL = ? ",
				false);

		defStaticQuery(
				"getPcPartnerConfigbyStatusCodeAndTariff",
				".soa.sharedservices.blo.PcPartnerConfigDMO",
				"SELECT pc_config_id, pc_partner_id, pc_member_status, pc_package_code, pc_tarplan_ref, pc_alt_package, pc_alt_tariff, pc_benefit_name, pc_n2n_status "
						+ "FROM pc_partner_config "
						+ "WHERE pc_member_status = ? "
						+ "AND pc_package_code = ? " + "AND pc_tarplan_ref = ?",
				false);

		defStaticQuery("getPiSbpPartnerExists", ".common.data.IntegerDMO",
				"SELECT COUNT(*) AS REC "
						+ "FROM sbp_sub_partner, pi_partner_info "
						+ "WHERE sbp_partner_id = pi_partner_id "
						+ "AND pi_partner_level = 1 "
						+ "AND sbp_subscriber_id = ?", false);

		defStaticQuery("getPiPartnerByAgreementCode",
				".soa.sharedservices.blo.PiPartnerInfoDMO", "SELECT * "
						+ "FROM pi_partner_info "
						+ "WHERE pi_agreement_code = ?", false);

		defStaticQuery(
				"getSbbListBySubIdAndPartnerId",
				".soa.sharedservices.blo.SbpSbbPcPgPsDQO",
				"SELECT sbp_sub_partner_id, sbp_subscriber_id, sbp_partner_id, sbp_benefit_status, sbp_pri_member_no, sbp_alt_member_no, sbp_member_status, "
						+ "sbp_last_auth_code, sbp_last_stat_chge, sbp_handset, sbp_config_id, sbp_analysis_1, sbp_analysis_2, sbp_analysis_3, sbp_analysis_4, sbp_analysis_5, "
						+ "sbb_sub_partner_id, sbb_benefit_id, pc_config_id, pc_partner_id, pc_member_status, pc_package_code, pc_tarplan_ref, pc_alt_package, pc_alt_tariff, "
						+ "pc_benefit_name, pc_n2n_status, pg_group_id, pg_config_id, pg_group_type, pg_group_quantity, ps_benefit_id, ps_group_id, ps_benefit_type, "
						+ "ps_benefit_code, ps_nn_superproduct, ps_nn_product "
						+ "FROM sbp_sub_partner, sbb_sub_benefit, pc_partner_config, pg_partner_group, ps_partner_service "
						+ "WHERE sbp_sub_partner_id = sbb_sub_partner_id "
						+ "AND sbp_subscriber_id =  ?, "
						+ "AND pc_config_id = pg_config_id "
						+ "AND ps_group_id = pg_group_id "
						+ "AND ps_benefit_id = sbb_benefit_id "
						+ "AND sbp_partner_id = ? ", false);

		defStaticQuery(
				"getSbbListBySubId",
				".soa.sharedservices.blo.SbpSbbPcPgPsDQO",
				"SELECT sbp_sub_partner_id, sbp_subscriber_id, sbp_partner_id, sbp_benefit_status, sbp_pri_member_no, sbp_alt_member_no, sbp_member_status, "
						+ "sbp_last_auth_code, sbp_last_stat_chge, sbp_handset, sbp_config_id, sbp_analysis_1, sbp_analysis_2, sbp_analysis_3, sbp_analysis_4, sbp_analysis_5, "
						+ "sbb_sub_partner_id, sbb_benefit_id, pc_config_id, pc_partner_id, pc_member_status, pc_package_code, pc_tarplan_ref, pc_alt_package, pc_alt_tariff, "
						+ "pc_benefit_name, pc_n2n_status, pg_group_id, pg_config_id, pg_group_type, pg_group_quantity, ps_benefit_id, ps_group_id, ps_benefit_type, "
						+ "ps_benefit_code, ps_nn_superproduct, ps_nn_product "
						+ "FROM sbp_sub_partner, sbb_sub_benefit, pc_partner_config, pg_partner_group, ps_partner_service "
						+ "WHERE sbp_sub_partner_id = sbb_sub_partner_id "
						+ "AND sbp_subscriber_id =  ?, "
						+ "AND pc_config_id = pg_config_id "
						+ "AND ps_group_id = pg_group_id "
						+ "AND ps_benefit_id = sbb_benefit_id", false);

		defStaticQuery(
				"getPcPartnerConfigbyPackageCodeAndTariff",
				".soa.sharedservices.blo.PcPartnerConfigDMO",
				"SELECT pc_config_id, pc_partner_id, pc_member_status, pc_package_code, pc_tarplan_ref, pc_alt_package, pc_alt_tariff, pc_benefit_name, pc_n2n_status "
						+ "FROM pc_partner_config "
						+ "WHERE pc_package_code = ? "
						+ "AND pc_tarplan_ref = ?", false);

		defStaticQuery(
				"getPcPartnerConfigbyPackageCodeAndTariff",
				".soa.sharedservices.blo.PcPartnerConfigDMO",
				"SELECT pc_config_id, pc_partner_id, pc_member_status, pc_package_code, pc_tarplan_ref, pc_alt_package, pc_alt_tariff, pc_benefit_name, pc_n2n_status "
						+ "FROM pc_partner_config "
						+ "WHERE pc_package_code = ? "
						+ "AND pc_tarplan_ref = ?", false);

		defStaticQuery("getPPCProduct",
				".soa.sharedservices.blo.PpcPttProdCfgDQO",
				"SELECT PPC_PRODUCT, PPC_DESCRIPTION, PPC_MAX_USERS, PPC_SERVICE_CODE "
						+ "FROM PPC_PTT_PROD_CFG " + "WHERE PPC_PRODUCT = ? ",
				false);

		defStaticQuery(
				"getAuxSbd",
				".base.blo.AuxCustomersDMO",
				"SELECT AUX_TITLE, AUX_FIRSTNAME, AUX_INVOICE_ADDRID, BANK_NAME, BANK_ADDR1, BANK_ADDR2, BANK_AC_NAME, REF, BANK_SCODE"
						+ ", BANK_AC_NO, BANK_AC_TYPE, BANK_PAY_TYPE, AUX_PREF_DEBIT_DAY, BILL_AC_NO, PROTECT_CODE, HANDSET_CT, BANK_DATE, CONF_DATE"
						+ ", AUX_COMMENT, DATE_OF_BIRTH, REF_PAY_DATE, AC_CLOS_DATE, NO_REAS_DATE, REM_LET_DATE, AC_TRAN_DATE, NO_AC_DATE, SR_FLAG"
						+ ", PROCESSED, PACKAGE_CODE, AUX_ACCOUNT_TYPE, AUX_BILL_CYCLE, CREDIT_CARD_NO, CREDIT_CARD_NAME, EXPIRY_DATE, AUX_CARD_CVV_NO, CREDIT_SCORE"
						+ ", SERV_PROV_ID, DEALER_ID, SALESMAN, ID_NUMBER, ACC_STATUS, COMP_REG_NO, STATIONARY_TYPE, MAX_NO_SUBS, AUX_CURRENCY"
						+ ", AUX_COUNTRY_CODE, AUX_GENDER, AUX_SUB_GRP_ACC_NO, AUX_PREPAID_STAT, AUX_CREDIT_CLASS, AUX_AUTO_LIMIT_IND, AUX_LMT_UP_VAL, AUX_LMT_DN_VAL"
						+ ", AUX_ANALYSIS_1, AUX_ANALYSIS_2, AUX_ANALYSIS_3, AUX_ANALYSIS_4, AUX_ANALYSIS_5, AUX_ANALYSIS_6, AUX_ANALYSIS_7"
						+ ", AUX_ANALYSIS_8, AUX_ANALYSIS_9, AUX_ANALYSIS_10, AUX_ANALYSIS_11, AUX_ANALYSIS_12, AUX_ANALYSIS_13, AUX_ANALYSIS_14, AUX_ANALYSIS_15, AUX_ANALYSIS_16"
						+ ", AUX_ANALYSIS_17, AUX_ANALYSIS_18, AUX_ANALYSIS_19, AUX_ANALYSIS_20, AUX_ANALYSIS_21, AUX_ANALYSIS_22, AUX_ANALYSIS_23, AUX_ANALYSIS_24, AUX_ANALYSIS_25"
						+ ", AUX_ANALYSIS_26, AUX_ANALYSIS_27, AUX_ANALYSIS_28, AUX_ANALYSIS_29, AUX_ANALYSIS_30"
						+ " FROM aux_customers, sbd_sub_dets"
						+ " WHERE sbd_bill_ac_no = bill_ac_no"
						+ " AND sbd_subscriber_id = ? ", false);

		defStaticQuery(
				"getNmMsisdnVam",
				".base.blo.NmNetmatDMO",
				"SELECT NM_INTERNAL_TARIFF, NM_NETWORK_TARIFF, NM_CONTRACT_PERIOD, NM_NTWRK_CONTR_PER, NM_MIN_CANC_PERIOD, NM_HIGHER_MIG_TYPE, "
						+ "NM_LOWER_MIG_TYPE, NM_SAME_MIG_TYPE, NM_NETWORK_ID, NM_NET_TYPE"
						+ " FROM nm_netmat, vam_active_msisdn"
						+ " WHERE vam_msisdn_no = ? "
						+ " AND vam_intern_tariff = nm_internal_tariff", false);

		defStaticQuery(
				"getImsiRestriction",
				".common.data.StringDMO",
				"SELECT UNIQUE(vas_active_service.vas_service_type)"
						+ " FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ " WHERE vam_subscriber_id = ? "
						+ " AND   vam_sim_no        = ? "
						+ " AND   vam_subscriber_id = vas_subscriber_id"
						+ " AND   vas_service_type  IN ('NR','HR','HF')"
						+ " AND   vas_service_code  = vsm_service_code"
						+ " AND   vsm_msisdn_no     = vam_msisdn_no"
						+ " AND   vsm_subscriber_id = vam_subscriber_id"
						+ " ORDER BY vas_service_type", false);

		defStaticQuery(
				"getImsiCategory",
				".common.data.StringDMO",
				"SELECT vas_active_service.vas_service_type"
						+ " FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ " WHERE vam_subscriber_id = ?"
						+ " AND vam_sim_no = ?"
						+ " AND vam_subscriber_id = vas_subscriber_id"
						+ " AND vas_service_type = 'HB'"
						+ " AND vas_service_code = vsm_service_code"
						+ " AND vsm_msisdn_no = vam_msisdn_no"
						+ " AND vsm_subscriber_id = vam_subscriber_id"
						+ " ORDER BY vas_service_type", false);

		defStaticUpdate("delEdEventDelay", "DELETE FROM ed_event_delay "
				+ "WHERE ed_partner_id = ? " + "AND ed_subscriber_id = ? "
				+ "AND ed_sim_no = ? " + "AND ed_msisdn_no = ? "
				+ "AND ed_status = 1 "
				+ "AND (ed_send_seq = 0 OR ed_send_seq IS NULL)");

		defStaticUpdate("delEdEventDelayOnActionCode",
				"DELETE FROM ed_event_delay " + "WHERE ed_partner_id = ? "
						+ "AND ed_subscriber_id = ? " + "AND ed_sim_no = ? "
						+ "AND ed_msisdn_no = ? " + "AND ed_action_code = ? "
						+ "AND ed_status = 1 "
						+ "AND (ed_send_seq = 0 OR ed_send_seq IS NULL)");

		defStaticQuery("getVatRateByAccount", ".common.data.StringDMO",
				"SELECT vat_code " + "FROM cevatmatm "
						+ "WHERE account_vat_type = ? "
						+ "AND item_vat_type = ? ", false);

		defStaticQuery("getVatRateByCode", ".common.data.StringDMO",
				"SELECT vat_code " + "FROM cevatmatm " + "WHERE vat_code = ? ",
				false);

		defStaticQuery("getVatPercentageByCode", ".common.data.StringDMO",
				"SELECT percentage " + "FROM cevatm " + "WHERE vat_code = ? ",
				false);

		defStaticQuery("getchgNcode", ".common.data.StringDMO",
				"SELECT UNIQUE chg_code "
						+ "FROM chg_charges WHERE chg_ncode = ? "
						+ "AND rowid IN (SELECT MAX(rowid) FROM chg_charges "
						+ "WHERE chg_ncode = p_chg_ncode) ", false);

		defStaticUpdate("updateSbpSubPartner", "UPDATE sbp_sub_partner "
				+ "SET sbp_benefit_status = ?, " + "sbp_member_status = ?, "
				+ "sbp_last_auth_code = ?, " + "sbp_config_id = ?, "
				+ "sbp_analysis_1 = ? " + "WHERE sbp_subscriber_id = ? "
				+ "AND sbp_partner_id = ?");

		defStaticUpdate("updatePsdParametersForPshPsdSerial",
				"UPDATE psd_param_serv_det " + "SET psd_n2n_string = 'Y' "
						+ " WHERE psd_psh_id IN ( " + " SELECT psh_id "
						+ " FROM psh_param_serv_hdr "
						+ " WHERE psh_subscriber_id = ? "
						+ " AND psh_service_code = ?) "
						+ " AND psd_n2n_string = 'N' "
						+ " AND psd_serial_id != ?");

		defStaticQuery("iteratePsdParametersForPshPsdSerial",
				".common.data.IntegerDMO", "SELECT UNIQUE psd_serial_id "
						+ " FROM psd_param_serv_det, psh_param_serv_hdr "
						+ " WHERE psh_id = psd_psh_id "
						+ " AND psh_subscriber_id = ? "
						+ " AND psh_service_code = ? "
						+ " AND psd_n2n_string = 'N' "
						+ " AND psd_serial_id != ?", true);

		defStaticQuery(
				"getSbpByPartnerIdAndSubscriberId",
				".soa.sharedservices.blo.SbpSubPartnerDMO",
				"SELECT sbp_sub_partner_id, sbp_subscriber_id, sbp_partner_id, sbp_benefit_status, sbp_pri_member_no, sbp_alt_member_no, sbp_member_status, sbp_last_auth_code, "
						+ "sbp_last_stat_chge, sbp_handset, sbp_config_id, sbp_analysis_1, sbp_analysis_2, sbp_analysis_3, sbp_analysis_4, sbp_analysis_5 "
						+ "FROM sbp_sub_partner "
						+ "WHERE sbp_partner_id = ? "
						+ "AND sbp_subscriber_id = ?", true);

		defStaticQuery("getSbdBillCycle", ".common.data.StringDMO",
				"SELECT UNIQUE sbd_bill_cycle "
						+ "FROM sbd_sub_dets, pc_partner_cycles "
						+ "WHERE sbd_bill_cycle = pc_bill_cycle "
						+ "AND sbd_bill_ac_no = ? " + "AND pc_cycle_type = ?",
				false);

		defStaticUpdate("updateEapEpxactionPend", "UPDATE eap_epxaction_pend "
				+ "SET eap_status = '9', eap_subsystem = 'CYCRLBK' "
				+ "WHERE eap_subsystem = 'CYCMIG' " + "AND eap_bill_ac_no = ? "
				+ "AND eap_subscriber_id = ? " + "AND eap_status IN ('0', '2')");

		defStaticQuery("getCycle", ".soa.sharedservices.blo.CycleDMO",
				"SELECT * " + "FROM cycle " + "WHERE cycle = ? "
						+ "AND invoice_date = (SELECT MAX(invoice_date) "
						+ "FROM cycle " + "WHERE cycle = ?)", false);

		defStaticQuery("getPcPartnerCycleByPartnerId",
				".soa.sharedservices.blo.PcPartnerCyclesDMO", "SELECT * "
						+ "FROM pc_partner_cycles "
						+ "WHERE pc_partner_id = ? " + "AND pc_bill_cycle = ?",
				false);

		defStaticQuery("getPcPartnerCycle",
				".soa.sharedservices.blo.PcPartnerCyclesDMO",
				"SELECT * " + "FROM pc_partner_cycles "
						+ "WHERE pc_bill_cycle = ?", false);

		defStaticQuery("getCmBySubscriberId",
				".soa.sharedservices.blo.CmCycleMigrationDMO", " SELECT * "
						+ "FROM cm_cycle_migration "
						+ "WHERE cm_subscriber_id = ? "
						+ "AND cm_status <> 'B' "
						+ "AND cm_timestamp = (SELECT MAX(cm_timestamp) "
						+ "FROM cm_cycle_migration "
						+ "WHERE cm_subscriber_id = ? "
						+ "AND cm_status <> 'B')", false);

		defStaticQuery(
				"getCustActSubListByBillAcNo",
				".soa.sharedservices.blo.VamSbdBcyDQO",
				" SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ ", sbd_subscriber_id, sbd_dialling_no, sbd_bill_ac_no, sbd_connect_date, sbd_dconnect_date, sbd_term_date, sbd_title, sbd_surname, sbd_firstname, sbd_gender, sbd_dob, sbd_password"
						+ ", sbd_location_code, sbd_bill_cycle, sbd_package_code, sbd_billed_upto, sbd_tariff_plan"
						+ ", bcy_bill_cycle, bcy_description, bcy_period, bcy_frequency, bcy_day_of_run, bcy_next_run, bcy_suspended, bcy_use_status, bcy_next_call_run, bcy_in_advance "
						+ "FROM vam_active_msisdn, sbd_sub_dets, bcy_billing_cycle "
						+ "WHERE vam_subscriber_id = sbd_subscriber_id "
						+ "AND vam_stat_code = '1' "
						+ "AND sbd_bill_cycle = bcy_bill_cycle "
						+ "AND sbd_bill_ac_no = ? "
						+ "AND vam_msisdn_no IN ("
						+ "SELECT sbd_dialling_no "
						+ "FROM sbd_sub_dets "
						+ "WHERE sbd_bill_ac_no = ? ) "
						+ "ORDER BY sbd_sub_dets.sbd_surname ASC", false);

		defStaticQuery(
				"getCustActSubListByBillAcNoAndMsisdn",
				".soa.sharedservices.blo.VamSbdBcyDQO",
				" SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ ", sbd_subscriber_id, sbd_dialling_no, sbd_bill_ac_no, sbd_connect_date, sbd_dconnect_date, sbd_term_date, sbd_title, sbd_surname, sbd_firstname, sbd_gender, sbd_dob, sbd_password"
						+ ", sbd_location_code, sbd_bill_cycle, sbd_package_code, sbd_billed_upto, sbd_tariff_plan"
						+ ", bcy_bill_cycle, bcy_description, bcy_period, bcy_frequency, bcy_day_of_run, bcy_next_run, bcy_suspended, bcy_use_status, bcy_next_call_run, bcy_in_advance "
						+ "FROM vam_active_msisdn, sbd_sub_dets, bcy_billing_cycle "
						+ "WHERE vam_subscriber_id = sbd_subscriber_id "
						+ "AND vam_stat_code = '1' "
						+ "AND sbd_bill_cycle = bcy_bill_cycle "
						+ "AND sbd_bill_ac_no = ? "
						+ "AND vam_msisdn_no = ? "
						+ "ORDER BY sbd_sub_dets.sbd_surname ASC", false);

		defStaticQuery("getCrRulelList",
				".soa.sharedservices.blo.CrlCycleRulesDMO", " SELECT * "
						+ "FROM crl_cycle_rules "
						+ "ORDER BY crl_rule_id,crl_items", false);

		defStaticQuery("getCrRulelListByRuleId",
				".soa.sharedservices.blo.CrlCycleRulesDMO", " SELECT * "
						+ "FROM crl_cycle_rules " + "WHERE crl_rule_id = ?",
				false);

		defStaticQuery("getCountSbpStatus", ".common.data.IntegerDMO",
				"SELECT COUNT(*) AS REC "
						+ "FROM sbd_sub_dets, sbp_sub_partner "
						+ "WHERE sbd_subscriber_id = sbp_subscriber_id "
						+ "AND sbd_bill_ac_no = ? "
						+ "AND sbp_benefit_status = ? ", false);

		defStaticQuery("getApdApnPopDets",
				".soa.sharedservices.blo.ApdApnPopDetsDMO", "SELECT * "
						+ "FROM apd_apn_pop_dets " + "WHERE apd_msisdn = ? ",
				false);

		defStaticQuery("getApdApnPopDetsByInvoiceNo",
				".soa.sharedservices.blo.ApdApnPopDetsDMO", "SELECT * "
						+ "FROM apd_apn_pop_dets " + "WHERE apd_msisdn = ? "
						+ "AND apd_inv_no = ? ", false);

		defStaticQuery("getPph", ".soa.sharedservices.blo.PphPayPlanHdrDMO",
				"SELECT * " + "FROM pph_pay_plan_hdr "
						+ "WHERE pph_customer = ?", false);

		defStaticQuery("getCmList",
				".soa.sharedservices.blo.CmCycleMigrationDMO", " SELECT * "
						+ "FROM cm_cycle_migration "
						+ "WHERE cm_subscriber_id = ? "
						+ "AND cm_status != 'B' ", false);

		defStaticQuery(
				"getVasVamVsmSubSimlist",
				".soa.sharedservices.blo.VasVamVsmSubSimDQO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ "FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ "WHERE vam_subscriber_id =  ? "
						+ "AND vam_sim_no MATCHES ? "
						+ "AND vam_subscriber_id = vas_subscriber_id "
						+ "AND vas_service_code = vsm_service_code "
						+ "AND vsm_msisdn_no = vam_msisdn_no "
						+ "AND vsm_subscriber_id = vam_subscriber_id "
						+ "ORDER BY vas_service_code", false);

		defStaticQuery("getMaxEfgCommand", ".common.data.StringDMO",
				"SELECT MAX(efq_command)" + " FROM efq_future_queue"
						+ " WHERE efq_command MATCHES ? ", false);

		defStaticQuery("getCpo", ".soa.sharedservices.blo.CpoCplanOpenDMO",
				" SELECT *  " + "FROM cpo_cplan_open "
						+ "WHERE cpo_bill_ac_no = ? " + "AND cpo_status = ?",
				false);

		defStaticQuery("getNetServcodePackservtariff",
				".base.blo.NgsNetGroupServDMO",
				"SELECT * FROM ngs_net_group_serv,ts_tariff_service,vsr_service"
						+ " WHERE ts_package_code = ? "
						+ " AND ts_service_code = ? "
						+ " AND ts_internal_tariff = ? "
						+ " AND ts_service_code = vsr_service_code"
						+ " AND ngs_code = ts_net_serv_code"
						+ " AND ngs_network = vsr_provider_id"
						+ " AND ngs_sequence = 1", false);

		defStaticQuery(
				"getMsisdnBasicServiceSimVamVsmList",
				".soa.sharedservices.blo.VamVsmServiceDQO",
				"SELECT VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ " FROM vam_active_msisdn,vsm_service_msisdn,vsr_service"
						+ " WHERE vam_msisdn_no = vsm_msisdn_no"
						+ " AND vsm_service_code = vsr_service_code"
						+ " AND vam_sim_no = ? "
						+ " AND vsr_service_class = 'B'", true);

		defStaticQuery(
				"getSbdSim",
				".base.blo.SbdSubDetsDMO",
				"SELECT UNIQUE SBD_SUBSCRIBER_ID, SBD_DIALLING_NO, SBD_BILL_AC_NO, SBD_CONNECT_DATE, SBD_DCONNECT_DATE, SBD_TERM_DATE, SBD_TITLE, SBD_SURNAME, SBD_FIRSTNAME"
						+ ", SBD_GENDER, SBD_DOB, SBD_PASSWORD, SBD_LOCATION_CODE, SBD_BILL_CYCLE, SBD_PACKAGE_CODE, SBD_BILLED_UPTO, SBD_TARIFF_PLAN"
						+ " FROM sbd_sub_dets,vam_active_msisdn "
						+ " WHERE vam_sim_no = ? "
						+ " AND vam_subscriber_id = sbd_subscriber_id", false);

		defStaticQuery("getNgsNetServCode", ".common.data.StringDMO",
				"SELECT first 1 ngs_net_serv_code "
						+ " FROM ngs_net_group_serv " + " WHERE ngs_code = ? "
						+ " AND ngs_network  = ? " + " AND ngs_sequence  = 1",
				true);

		defStaticUpdate("modifyEiAsA", "UPDATE ei_eppix_isis "
				+ "SET ei_subs_count = ei_subs_count + 1 "
				+ "WHERE ei_bill_cycle = ?");

		defStaticUpdate("modifyEiAsD", "UPDATE ei_eppix_isis "
				+ "SET ei_subs_count = ei_subs_count - 1 "
				+ "WHERE ei_bill_cycle = ?");

		defStaticUpdate("insertCm", "INSERT INTO cm_cycle_migration "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

		defStaticUpdate("updateCm", "UPDATE cm_cycle_migration "
				+ "SET cm_status = ?, cm_old_cycle = ?, cm_new_cycle = ?  "
				+ "WHERE cm_subscriber_id = ? " + "AND cm_old_cycle = ? "
				+ "AND cm_new_cycle = ? " + "AND cm_timestamp = ? "
				+ "AND cm_status <> 'B'");

		defStaticUpdate(
				"updateApd",
				"UPDATE apd_apn_pop_dets "
						+ "SET apd_id = ? , apd_name = ? , apd_msisdn = ? , apd_active_no = ? , apd_deact_no = ? , apd_chrg_no = ? , "
						+ "apd_chrg_amount = ? , apd_start_period = ? , apd_end_period = ? , apd_cycle = ? , apd_inv_no = ? "
						+ "WHERE apd_apn_pop_dets.apd_id = ? "
						+ "AND apd_apn_pop_dets.apd_msisdn = ? ");

		defStaticQuery("getCountSbdSubDetsByBillAcNo",
				".common.data.IntegerDMO", "SELECT COUNT(*) AS REC "
						+ "FROM sbd_sub_dets " + "WHERE sbd_bill_ac_no = ? ",
				false);

		defStaticQuery(
				"getVsrVasVamVsmList",
				".soa.sharedservices.blo.VsrVasVamVsmDQO",
				"SELECT VSR_SERVICE_CODE, VSR_SERVICE_TYPE, VSR_SERVICE_DESC, VSR_ORIGINATOR, VSR_SERVICE_CLASS, VSR_TEMP_DEACT, VSR_PRORATA, VSR_PROVIDER_ID, VSR_SHORT_DESC, VSR_SUSPEND "
						+ ", VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ " FROM vsr_service, vas_active_service, vam_active_msisdn, "
						+ " vsm_service_msisdn "
						+ " WHERE vam_sim_no = ? "
						+ " AND vam_msisdn_no = vsm_msisdn_no "
						+ " AND vsm_service_code = vsr_service_code "
						+ " AND vas_subscriber_id = vam_subscriber_id "
						+ " AND vas_service_code = vsm_service_code "
						+ " AND (vas_intern_tariff = vam_intern_tariff "
						+ " OR   vas_intern_tariff IS NULL) "
						+ " ORDER BY vsr_service_code ", true);

		defStaticQuery(
				"getSdrForServicePackageVersion",
				".base.blo.SdrServDepoRuleDMO",
				"SELECT * FROM sdr_serv_depo_rule "
						+ " WHERE sdr_service_code = ? "
						+ " AND sdr_package_code = ? "
						+ " AND sdr_ver_rule_num= (SELECT MAX(sdr_ver_rule_num) "
						+ " FROM sdr_serv_depo_rule "
						+ " WHERE sdr_service_code = ? "
						+ " AND sdr_package_code = ?)", false);

		defStaticQuery("checkAcnMrgTargetGroup", ".common.data.IntegerDMO",
				"SELECT COUNT(*) " + "FROM ACG_ACTION_GROUP "
						+ "WHERE ACG_ACTION_SERIAL = ? "
						+ "AND ACG_CREATE_NOTE = 'Y' "
						+ "AND ACG_GROUP_SERIAL = ?", false);

		defStaticQuery("iterateSdeSubSimServP", ".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_sim_no          = ? "
						+ " AND sde_service_code    = ? "
						+ " AND sde_deposit_status = 1 "
						+ " AND sde_service_status != 2 "
						+ " ORDER BY sde_deposit_id DESC", false);

		defStaticQuery(
				"iterateSdeSubSimServW",
				".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_sim_no          = ? "
						+ " AND sde_service_code    = ? "
						+ " AND ((sde_deposit_status IN (1,5) AND sde_service_status != 2) "
						+ " OR (sde_deposit_status = 0 AND sde_service_status = 1)) "
						+ " ORDER BY sde_deposit_id DESC", false);

		defStaticUpdate(
				"creatSbbSubBenefit",
				"INSERT INTO sbb_sub_benefit(sbb_sub_partner_id, sbb_benefit_id) VALUES (? , ?)");

		defStaticQuery("countSmc", ".common.data.IntegerDMO",
				"SELECT COUNT(*) FROM smc_sub_migr_cntrl"
						+ " WHERE smc_subscriber_id = ? "
						+ " AND smc_count = ? " + " AND smc_expiry_date = ? ",
				false);

		// defStaticQuery(
		// "getSubServices",
		// ".base.blo.VasActiveServiceDMO",
		// "SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,"
		// + "VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,"
		// + "VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
		// + " FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
		// + " WHERE  vam_subscriber_id = ? "
		// + "	AND vam_subscriber_id  = vas_subscriber_id "
		// + " AND vam_subscriber_id = vsm_subscriber_id "
		// + " AND vam_msisdn_no     = vsm_msisdn_no "
		// + " AND vas_service_code  = vsm_service_code "
		// + " AND (vas_intern_tariff IS NULL OR vas_intern_tariff = ?) "
		// + " ORDER BY 2", true);

		defStaticQuery(
				"getSubServices",
				".soa.sharedservices.blo.VamVasDQO",
				"SELECT VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE"
						+ ", VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ " FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ " WHERE  vam_subscriber_id = ? "
						+ "	AND vam_subscriber_id  = vas_subscriber_id "
						+ " AND vam_subscriber_id = vsm_subscriber_id "
						+ " AND vam_msisdn_no     = vsm_msisdn_no "
						+ " AND vas_service_code  = vsm_service_code "
						+ " AND (vas_intern_tariff IS NULL OR vas_intern_tariff = ?) "
						+ " ORDER BY 2", true);

		defStaticQuery(
				"getVpsVsrVstServices",
				".soa.sharedservices.blo.VpsVsrVstDQO",
				"SELECT * FROM vps_package_serv, vsr_service, "
						+ "vst_service_types WHERE vps_service_code = vsr_service_code "
						+ "AND vsr_service_type = vst_service_type AND vps_service_code = ? "
						+ "AND vps_package_code = ? ", false);

		defStaticQuery(
				"getServiceRecord",
				".base.blo.TsTariffServiceDMO",
				"SELECT * FROM mgr_mig_rule, ts_tariff_service "
						+ "WHERE mgr_primary_serv = ? "
						+ "AND mgr_target_serv = ts_service_code "
						+ "AND ts_package_code = ? AND (ts_internal_tariff IS NULL "
						+ "OR ts_internal_tariff = ?)", false);

		defStaticQuery(
				"getSbpBySubscriberId",
				".soa.sharedservices.blo.SbpSubPartnerDMO",
				"SELECT sbp_sub_partner_id, sbp_subscriber_id, sbp_partner_id, sbp_benefit_status, sbp_pri_member_no, sbp_alt_member_no, sbp_member_status, sbp_last_auth_code, "
						+ "sbp_last_stat_chge, sbp_handset, sbp_config_id, sbp_analysis_1, sbp_analysis_2, sbp_analysis_3, sbp_analysis_4, sbp_analysis_5 "
						+ "FROM sbp_sub_partner "
						+ "WHERE sbp_subscriber_id = ?"
						+ " AND sbp_benefit_status = ? ", true);

		defStaticQuery(
				"getServRule",
				".base.blo.TsTariffServiceDMO",
				"SELECT ts_tariff_service.* FROM svr_serv_rule, ts_tariff_service "
						+ "WHERE svr_primary_serv = ? AND svr_target_serv = ts_service_code "
						+ "AND ts_package_code = ? AND (ts_internal_tariff IS NULL "
						+ "OR ts_internal_tariff = ?) AND svr_serv_type = ?",
				true);
		
		defStaticQuery("getServRuleVas", ".common.data.IntegerDMO", 
				"SELECT count(*) FROM svr_serv_rule, vas_active_service "
				+ "WHERE svr_serv_type = 'E' "
				+ "AND svr_target_serv = vas_service_code "
				+ "AND svr_primary_serv = ? AND vas_subscriber_id =? ", false);
		
		

		defStaticQuery("validateTsPackageTariff", ".common.data.IntegerDMO",
				"SELECT UNIQUE (0)" + " FROM ts_tariff_service"
						+ " WHERE ts_package_code = ?"
						+ " AND ts_internal_tariff = ?"
						+ " AND ts_act_inclusive != 'S'", false);

		defStaticUpdate("updateVasChg123", "UPDATE vas_active_service "
				+ " SET vas_sub_charge1  = ?, " + " vas_sub_charge2  = ?, "
				+ " vas_sub_charge3  = ? " + " WHERE vas_subscriber_id = ? "
				+ " AND vas_service_code = ? " + " AND (vas_intern_tariff = ? "
				+ " OR vas_intern_tariff IS NULL"
				+ " OR LENGTH(vas_intern_tariff) = 0)");

		defStaticQuery("getFflList",
				".soa.sharedservices.blo.FflFamfrndListDMO",
				"SELECT * FROM ffl_famfrnd_list"
						+ " WHERE ffl_subscriber_id = ?"
						+ " AND ffl_sim_no = ? AND ffl_service_code = ?", true);

		defStaticUpdate("updateFamilyFriendsTermDt", "UPDATE ffl_famfrnd_list "
				+ "SET ffl_term_date = ? " + " WHERE ffl_subscriber_id = ? "
				+ "and ffl_sim_no = ? " + "and ffl_service_code = ?");

		defStaticQuery("getSdeSim", ".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_service_code    = ? "
						+ " AND sde_sim_no          = ? "
						+ " AND sde_msisdn_no MATCHES ? "
						+ " AND sde_service_status != 2 ", false);

		defStaticQuery(
				"getSdeSimByPackage",
				".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_service_code    = ? "
						+ " AND sde_sim_no          = ? "
						+ " AND sde_msisdn_no MATCHES ? "
						+ " AND sde_service_status != 2 "
						+ " AND sde_package_code = ?  ORDER BY sde_deposit_id DESC",
				false);

		defStaticQuery("getSpvParamValue", ".base.blo.SpvParamValuesDMO",
				"SELECT * FROM spv_param_values " + "WHERE spv_param_id = ? "
						+ "AND spv_param_value = ? ", false);

		defStaticQuery("getPrstServices",
				".soa.sharedservices.blo.PsmPrstgSrvMtrxDMO",
				"SELECT psm_prstg_srv_mtrx.* "
						+ " FROM psm_prstg_srv_mtrx, vsr_service "
						+ " WHERE vsr_service_code = psm_service_code"
						+ " AND vsr_suspend = 'N'"
						+ " AND psm_activate_type not in ('MR','MW')", true);

		defStaticQuery("getCvi", ".soa.sharedservices.blo.CviCrmValueIndDMO",
				"SELECT * FROM cvi_crm_value_ind WHERE cvi_crm_value = ?",
				false);

		defStaticQuery(
				"getAcv",
				".soa.sharedservices.blo.AcvAccCrmValueDMO",
				"SELECT * FROM acv_acc_crm_value WHERE acv_bill_ac_no = p_bill_ac_no",
				false);

		defStaticUpdate("updateAcvAccCrmValue", "UPDATE acv_acc_crm_value "
				+ "SET acv_crm_value = ?, " + "acv_type = ? "
				+ "WHERE acv_bill_ac_no = ?");

		defStaticUpdate(
				"insertScvSubCrmValue",
				"INSERT INTO scv_sub_crm_value (scv_subscriber_id, scv_crm_value, scv_type) VALUES(?,?,?)");

		defStaticUpdate("updateScvSubCrmValueScvType",
				"UPDATE scv_sub_crm_value " + "SET scv_crm_value = ? ,"
						+ "scv_type = ? " + "WHERE scv_subscriber_id = ?");

		defStaticUpdate("updateScvSubCrmValue", "UPDATE scv_sub_crm_value "
				+ "SET scv_crm_value = ? " + "WHERE scv_subscriber_id = ?");

		defStaticUpdate(
				"insertScvSubHistory",
				"INSERT INTO SCV_SUB_HISTORY "
						+ "(SCV_SUBSCRIBER_ID,SCV_CRM_OLD_VALUE,SCV_CRM_NEW_VALUE,SCV_USER_ID,SCV_TERMINAL_ID,SCV_TIMESTAMP) "
						+ "VALUES(?,?,?,?,?,?)");

		defStaticQuery("getFfhFamFrndHead",
				".soa.sharedservices.blo.FfhFamfrndHeadDMO",
				"SELECT * FROM ffh_famfrnd_head"
						+ " WHERE ffh_service_code = ?", false);

		defStaticQuery("getTmpServicesRejectList",
				".soa.sharedservices.blo.TmpServiceRejectDMO",
				"SELECT * FROM tmp_service_reject " + "WHERE tsr_sim_no = ?  "
						+ "ORDER BY tsr_service_code", true);

		defStaticQuery(
				"countScvByCrmValue",
				".common.data.IntegerDMO",
				"SELECT COUNT(*) FROM SCV_SUB_CRM_VALUE "
						+ "where scv_crm_value = 'PR' AND SCV_SUBSCRIBER_ID = ?",
				false);

		defStaticQuery("getMinVamConnectDate", ".common.data.StringDMO",
				"SELECT MIN((VAM_CONNECT_DATE)) FROM VAM_ACTIVE_MSISDN "
						+ " WHERE VAM_SUBSCRIBER_ID = ? "
						+ " AND VAM_STAT_CODE IN ( 1 , 4 )", false);

		defStaticUpdate("createVas", "INSERT INTO VAS_ACTIVE_SERVICE ("
				+ "VAS_SUBSCRIBER_ID," + "VAS_SERVICE_CODE,"
				+ "VAS_INTERN_TARIFF," + "VAS_SERVICE_TYPE," + "VAS_ACT_DATE,"
				+ "VAS_DEACT_DATE," + "VAS_SUB_CHARGE1," + "VAS_SUB_CHARGE2,"
				+ "VAS_SUB_CHARGE3," + "VAS_TWINBILL_NO," + "VAS_MULTI_CHARGE)"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)");

		defStaticQuery("getSdeSim", ".base.blo.SdeServDepositDMO",
				"SELECT * FROM sde_serv_deposit "
						+ " WHERE sde_subscriber_id = ? "
						+ " AND sde_service_code    = ? "
						+ " AND sde_sim_no          = ? "
						+ " AND sde_msisdn_no MATCHES ? "
						+ " AND sde_service_status != 2 ", false);

		defStaticUpdate(
				"createMgp",
				"INSERT INTO MGP_MIG_PENDING"
						+ "(MGP_SIM_NO,MGP_OLD_TARIFF,MGP_NEW_TARIFF,MGP_MIGRATION_DATE,MGP_FREE_TEXT) "
						+ "VALUES(?, ?, ?, ?, ?);");

		defStaticQuery(
				"getVamByVsmServiceCode",
				".base.blo.VamActiveMsisdnDMO",
				"SELECT vam_active_msisdn.* "
						+ " FROM vam_active_msisdn,vsm_service_msisdn"
						+ " WHERE vam_subscriber_id = vsm_subscriber_id"
						+ " AND vam_msisdn_no = vsm_msisdn_no"
						+ " AND vam_sim_no = ? " + " AND vsm_service_code = ? ",
				true);

		/**
		 * SJ:
		 * 
		 * Take out the temp table join, not required as the msisdn and service
		 * is an extract from the table. Possible problem is that multiple
		 * entries in the table may exists for the same msisdn and service
		 * 
		 */
		defStaticQuery("getVamSrvPrmsMSISDN",
				".soa.sharedservices.blo.PshPsdDQO",
				// "SELECT psh_id,psh_service_code,psh_msisdn_no,psh_subscriber_id,psd_param_id,psd_param_value "
				"SELECT * "
						// "FROM tmp_servlinkmsisdn, psh_param_serv_hdr, psd_param_serv_det "
						+ "FROM psh_param_serv_hdr, psd_param_serv_det "
						+ "WHERE psh_msisdn_no = ? "
						+ "AND psh_service_code = ? "
						// + "AND psh_service_code = srm_service "
						// + "AND psh_msisdn_no = srm_msisdn "
						+ "AND psd_psh_id = psh_id "
						+ "AND psd_act_date <= TODAY "
						+ "AND (psd_term_date IS NULL "
						+ "OR psd_term_date > TODAY) order by psd_serial_id desc", true);

		/**
		 * SJ Changed according to 4gl 14-08-2018
		 */
		defStaticQuery("getVamSrvPrmsSIM", ".soa.sharedservices.blo.PshPsdDQO",
		// "SELECT psh_id,psh_service_code,psh_msisdn_no,psh_subscriber_id,psd_param_id,psd_param_value "
				"SELECT * "
						// "FROM tmp_servlinkmsisdn, psh_param_serv_hdr, psd_param_serv_det "
						+ "FROM psh_param_serv_hdr, psd_param_serv_det "
						+ "WHERE psh_sim_no = ? "
						+ "AND psh_service_code = ? "
						// + "AND psh_service_code = srm_service "
						// + "AND psh_msisdn_no = srm_msisdn "
						+ "AND psd_psh_id = psh_id "
						+ "AND psd_act_date <= TODAY "
						+ "AND (psd_term_date IS NULL "
						+ "OR psd_term_date > TODAY) order by psd_serial_id desc", true);

		defStaticQuery("getSdcSimList", ".base.blo.SdcDualCallDMO",
				"SELECT sdc_dual_call.* "
						+ " FROM sdc_dual_call,vam_active_msisdn"
						+ " WHERE sdc_subscriber_id = ?"
						+ " AND sdc_subscriber_id = vam_subscriber_id"
						+ " AND sdc_first_msisdn = vam_msisdn_no"
						+ " AND sdc_service_code = ?" + " AND vam_sim_no = ?"
						+ " AND sdc_expiry_date IS NULL", true);

		defStaticUpdate(
				"insertTmpServiceReject",
				"INSERT INTO TMP_SERVICE_REJECT("
						+ "TSR_SIM_NO, TSR_SERVICE_CODE, TSR_SERVICE_DESC, TSR_REASON) "
						+ "VALUES(?, ?, ?, ?)");

		defStaticUpdate("deleteSul",
				"DELETE FROM sul_sub_use_limit WHERE sul_subscriber_id = ?");

		defStaticQuery(
				"getVasVamVsmSimlist",
				".soa.sharedservices.blo.VasVamVsmSubSimDQO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ " FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ " WHERE vam_subscriber_id  = vas_subscriber_id "
						+ " AND vam_subscriber_id = vsm_subscriber_id "
						+ " AND vam_msisdn_no     = vsm_msisdn_no "
						+ " AND vas_service_code  = vsm_service_code "
						+ " AND vam_stat_code IN ('1','4','6') "
						+ " AND vas_service_type  = ? "
						+ " AND vam_sim_no = ? ",// selectStmt,
				true);// isMultiRow);

		defStaticUpdate(
				"updateAuxBillLmt",
				"UPDATE aux_customers SET aux_analysis_12 = (SELECT NVL(SUM(blh_bill_limit_val),0) "
						+ " FROM blh_bill_limit_hd "
						+ " WHERE blh_subscriber_id IN (SELECT sbd_subscriber_id "
						+ " FROM sbd_sub_dets "
						+ " WHERE sbd_bill_ac_no = ? )"
						+ " AND blh_level = 1 "
						+ " AND blh_user_status = 'T') "
						+ " WHERE bill_ac_no = ? )");

		defStaticUpdate("UpdateDealerItemValues", "UPDATE dealers SET "
				+ "itemi_ytd = itemi_ytd - 1" + "itemi_cum = itemi_cum - 1"
				+ "WHERE dealer_id = ?");

		defStaticQuery(
				"checkexistsVasOtherSim",
				".common.data.IntegerDMO",
				"SELECT UNIQUE(0)"
						+ " FROM vsm_service_msisdn, vam_active_msisdn, vas_active_service"
						+ " WHERE vam_subscriber_id = ?"
						+ " AND vam_sim_no != ?"
						+ " AND vam_msisdn_no = vsm_msisdn_no"
						// + " AND vsm_subscriber_id = vas_subscriber_id" // SJ:
						// Made change 01-04-2015 also ")" after intern tariff =
						// ?
						+ " AND vsm_subscriber_id = vas_subscriber_id"
						+ " AND vsm_service_code = vas_service_code"
						+ " AND vas_service_code = ?"
						+ " AND vas_intern_tariff = ? ", false);

		defStaticQuery(
				"getSrvPrmTariffDefault",
				".soa.sharedservices.blo.SptServParaTarDMO",
				"SELECT * FROM spt_serv_para_tar "
						+ " WHERE spt_param_id = ? "
						+ " AND spt_service_code = ? "
						+ " AND spt_tariff_code = ? ", false);

		defStaticQuery("checkParamTariff", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) " + " FROM spt_serv_para_tar"
						+ " WHERE spt_tariff_code = ? "
						+ " AND spt_param_id = ? ", false);

		defStaticQuery("getMgrList", ".soa.sharedservices.blo.MgrMigRuleDMO",
				"SELECT * FROM mgr_mig_rule" + " WHERE mgr_primary_serv = ? "
						+ " AND mgr_provider_id = ? ", true);

		defStaticQuery("getDefManInd", ".base.blo.TsTariffServiceDMO",
				"SELECT * " + " FROM ts_tariff_service "
						+ " WHERE ts_package_code = ? "
						+ " AND ts_service_code = ? "
						+ " AND (ts_internal_tariff IS NULL "
						+ " OR ts_internal_tariff = ? ) "
						+ " AND (ts_act_inclusive = 'M' "
						+ " OR ts_act_inclusive =  'D') "
						+ " AND ts_act_inclusive != 'S' ", false);

		defStaticQuery("checkParamPackage", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) " + " FROM spp_param_package "
						+ " WHERE spp_param_id = ? "
						+ " AND spp_package_code = ? ", false);

		defStaticQuery(
				"getMSISDNBasicService",
				".common.data.StringDMO",
				"SELECT vas_service_code"
						+ " FROM  vas_active_service, vsm_service_msisdn, vsr_service"
						+ " WHERE vsm_msisdn_no     = ? "
						+ " AND   vsm_subscriber_id = vas_subscriber_id"
						+ " AND   vas_service_code  = vsm_service_code"
						+ " AND   vsr_service_code  = vas_service_code"
						+ " AND   vsr_service_class = 'B'", false);

		defStaticQuery("getBlaIterator",
				".soa.sharedservices.blo.BlaBillLimitAcnDMO",
				"SELECT * FROM bla_bill_limit_acn "
						+ " WHERE bla_link_trg = ? "
						+ " ORDER BY bla_action_seq", true);

		defStaticUpdate("deleteBlnAcn ", "DELETE FROM bln_bill_limit_nte "
				+ "WHERE bln_link_acn = ? ");

		defStaticQuery(
				"getVasBillLimitBySubscriber",
				".soa.sharedservices.blo.VasVamDQO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE,VAS_DEACT_DATE, "
						+ "VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE,VAM_SUBSCRIBER_ID,VAM_SIM_NO,VAM_MSISDN_NO, "
						+ "VAM_TWINBILL_NO,VAM_STAT_CODE,VAM_CONNECT_DATE,VAM_DCONNECT_DATE,VAM_INTERN_TARIFF,VAM_CONTR_TERMINAT,VAM_CONTR_PERIOD, "
						+ "VAM_TERMINAT_NOTIF,VAM_DIR_ENTRY,VAM_ITEMISED,VAM_DEPARTMENT,VAM_SALESMAN,VAM_DEALER_ID,VAM_ABAR_DATE,VAM_SUBS_SUFFIX, "
						+ "VAM_MESS_COMMENT,VAM_AIRTIME_NET,VAM_PR_FLAG,VAM_HIERARCHY,VAM_MSISDN_KNOWN,VAM_TARIFF_CHG,VAM_ORIG_PROV_ID,VAM_IMP_PROV_ID, "
						+ "VAM_ORIG_SERV_PROV,VAM_IMP_SERV_PROV,VAM_MSISDN_TYPE,VAM_DUMMY,VAM_MSISDN_EXPRTD,VAM_EXPORTED_TO,VAM_ANALYSIS_1,VAM_ANALYSIS_2, "
						+ "VAM_ANALYSIS_3,VAM_ANALYSIS_4,VAM_ANALYSIS_5"
						+ " FROM vas_active_service, vam_active_msisdn"
						+ " WHERE vam_subscriber_id = ? "
						+ " AND vam_hierarchy = 0"
						+ " AND vam_msisdn_known in ('1','2')"
						+ " AND vam_stat_code < 7 "
						+ " AND vas_subscriber_id = vam_subscriber_id "
						+ " AND vas_service_type[1,2] = 'BL'"
						+ " AND vas_service_code = ?", false);

		defStaticUpdate("deleteBlt",
				"DELETE FROM blt_bill_limit_trg WHERE blt_serial_id = ?");

		defStaticUpdate("deleteBla",
				"DELETE FROM bla_bill_limit_acn WHERE  bla_serial_id = ?");

		defStaticQuery("getBltBySubscriberServiceCode",
				".soa.sharedservices.blo.BltBillLimitTrgDMO",
				"SELECT * FROM blt_bill_limit_trg "
						+ " WHERE blt_subscriber_id = ? "
						+ " AND blt_service_code = ? "
						+ " ORDER BY blt_trigger", true);

		defStaticQuery("userRestrictionGetAdd1", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_add = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticQuery("userRestrictionGetAdd2", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_add = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND ur_right_id IN "
						+ " (SELECT ur2.ur_right_id FROM ur_user_restrict ur2 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur2.ur_group_id) "
						+ " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticQuery("userRestrictionGetAdd3", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_add = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND ur_right_id IN "
						+ " (SELECT ur2.ur_right_id FROM ur_user_restrict ur2 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur2.ur_group_id "
						+ " AND ur_right_id IN "
						+ " (SELECT ur3.ur_right_id FROM ur_user_restrict ur3 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur3.ur_group_id)) "
						+ " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticQuery("userRestrictionGetRemove1", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_remove = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticQuery("userRestrictionGetRemove2", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_remove = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND ur_right_id IN "
						+ " (SELECT ur2.ur_right_id FROM ur_user_restrict ur2 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur2.ur_group_id) "
						+ " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticQuery("userRestrictionGetRemove3", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM ur_user_restrict ur1 "
						+ " WHERE ur_remove = 'Y' " + " AND ur_type = ? "
						+ " AND ur_code = ? " + " AND ur_right_id IN "
						+ " (SELECT ur2.ur_right_id FROM ur_user_restrict ur2 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur2.ur_group_id "
						+ " AND ur_right_id IN "
						+ " (SELECT ur3.ur_right_id FROM ur_user_restrict ur3 "
						+ " WHERE ur_type = ? " + " AND ur_code = ? "
						+ " AND ur1.ur_group_id = ur3.ur_group_id)) "
						+ " AND (ur_right_id IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'Y') " + " OR ur_right_id IN "
						+ " (SELECT urr_right_id FROM urr_role_right, "
						+ " uur_user_role "
						+ " WHERE uur_role_id = urr_role_id "
						+ " AND uur_login = ? " + " AND urr_right_id NOT IN "
						+ " (SELECT uut_right_id FROM uut_user_right "
						+ " WHERE uut_login = ? "
						+ " AND uut_add_remove = 'N') " + " ))", false);

		defStaticUpdate(
				"insertBackupEapBilmt",
				"INSERT INTO eap_bilmt(eap_bill_ac_no,"
						+ "eap_subscriber_id,eap_sim_no,eap_imsi_no,"
						+ "eap_msisdn_no,eap_invoice_no,eap_reference_no,"
						+ "eap_subsystem,eap_relation,eap_trigger,eap_action_type,"
						+ "eap_action_seq,eap_doc_type,eap_service_code,"
						+ "eap_reason_code,eap_table_name,eap_column_name,"
						+ "eap_new_value,eap_where_column,eap_where_type,"
						+ "eap_charge_code,eap_voice_mess,eap_amn_action_id,"
						+ "eap_amn_targ_type,eap_amn_targ_grp,eap_amn_targ_user,"
						+ "eap_amn_deadline,eap_amn_status,eap_amn_source,"
						+ "eap_amn_opened_by,eap_uda_action_id,eap_status,"
						+ "eap_retry_remain,eap_last_retry,eap_error_text,"
						+ "eap_submitted,eap_actioned)"
						+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

		defStaticUpdate("deleteBsaSimAcn", "DELETE FROM bsa_blimt_sim_acn "
				+ " WHERE bsa_subscriber_id = ?" + "  AND bsa_sim_acn = ? ");

		defStaticQuery("getEapSeq", ".common.data.IntegerDMO",
				" SELECT MAX(eap_action_seq) FROM eap_epxaction_pend"
						+ " WHERE eap_subscriber_id = ?"
						+ " AND eap_msisdn_no = ?" + " AND eap_action_type = ?"
						+ " AND eap_subsystem = 'BLIMT'"
						+ " AND eap_relation = 'BLMT'", false);

		defStaticQuery(
				"getBlhNetAcnIterator",
				".common.data.StringDMO",
				"SELECT bsa_sim_acn "
						+ " FROM bsa_blimt_sim_acn WHERE bsa_subscriber_id = ? "
						+ " AND bsa_level = ? ", true);

		defStaticUpdate("insertTmpPrmsLinkServC",
				"INSERT INTO tmp_prmslinkserv_c "
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");

		defStaticQuery("getTmpPrmsLinkServC",
				".soa.sharedservices.blo.TmpPrmslinkservCDMO",
				"SELECT * FROM tmp_prmslinkserv_c WHERE tmp_sub_id = ? ", true);

		defStaticUpdate("deleteTmpPrmsLinkServC",
				"DELETE FROM tmp_prmslinkserv_c " + "WHERE tmp_sub_id = ? ");

		defStaticQuery("getSumHWFeesByAccount", ".common.data.StringDMO",
				"SELECT SUM(vcf_month_amt) " + "FROM vcf_vrble_chrg_fee "
						+ "WHERE vcf_customer = ? " + "AND vcf_status = 'A' "
						+ "AND vcf_charge_code in ('PSFS', 'HRD1') ", false);

		defStaticQuery(
				"getSumSpulByAccount",
				".common.data.StringDMO",
				"Select SUM(BLH_BILL_LIMIT_VAL) FROM BLH_BILL_LIMIT_HD "
						+ "WHERE BLH_SUBSCRIBER_ID IN (SELECT sbd_subscriber_id from sbd_sub_dets "
						+ "where  sbd_bill_ac_no = ?) AND BLH_SERVICE_CODE = 'SPUL'",
				false);

		defStaticQuery(
				"getVas",
				".base.blo.VasActiveServiceDMO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,"
						+ "VAS_SERVICE_TYPE,VAS_ACT_DATE,VAS_DEACT_DATE, "
						+ "VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE "
						+ " FROM vas_active_service "
						+ " WHERE vas_subscriber_id = ? "
						+ " AND vas_service_code = ? "
						+ " AND (vas_intern_tariff = ? "
						+ " OR vas_intern_tariff IS NULL)", false);

		defStaticQuery(
				"getParameterizedValues",
				".base.blo.PsdParamServDetDMO",
				//"SELECT psd_sub_charge,psd_chg_value FROM psh_param_serv_hdr, psd_param_serv_det, spc_param_config "
				"SELECT psd_serial_id,psd_psh_id,psd_param_id,psd_act_date,psd_term_date,psd_param_value,"
						+ "psd_n2n_string,psd_param_active,psd_deac_date,"
						+ "psd_sub_charge,psd_chg_value,psd_act_type,psd_action_date "
						+ "FROM psh_param_serv_hdr, psd_param_serv_det, spc_param_config "
						+ "WHERE psd_param_active = 'Y' "
						+ "AND psd_psh_id = psh_id "
						+ "AND spc_param_id = psd_param_id "
						+ "AND spc_service_code = ? "
						+ "AND psh_subscriber_id = ? ", true);

		defStaticQuery("getMasterEhHh", ".soa.sharedservices.blo.EhHhDQO",
				"SELECT eh.*, hh.* FROM eh_eppix_hierarchy eh, hh_hierarchy_head hh "
						+ "WHERE eh.eh_entity_id = hh.hh_serial "
						+ "AND hh.hh_serial = ? " + "AND eh.eh_hier_type = ? "
						+ "AND eh.eh_type = ? ", false);

		defStaticQuery("getMasterLinkEhHh", ".soa.sharedservices.blo.EhHhDQO",
				"SELECT eh.*, hh.* FROM eh_eppix_hierarchy eh, hh_hierarchy_head hh "
						+ "WHERE eh.eh_entity_id = hh.hh_serial "
						+ "AND eh.eh_serial = ? " + "AND eh.eh_hier_type = ? "
						+ "AND eh.eh_type = ? ", false);

		defStaticQuery("getEppBearer",
				".soa.sharedservices.blo.EppEbuPromoPriceDMO",
				"SELECT * FROM epp_ebu_promo_price "
						+ "WHERE epp_hierarchy_id = ?	"
						+ "AND epp_shortname = ?	" + "AND epp_status = ? ",
				false);

		defStaticQuery("getTdc", ".soa.sharedservices.blo.TdTelemtryDeviceDMO",
				"SELECT * " + "FROM td_telemtry_device "
						+ "WHERE td_subscriber_id = ?", false);

		defStaticQuery(
				"getSpcSpvPshPsdBySubServCode",
				".soa.sharedservices.blo.SpcSpvPshPsdDQO",
				"SELECT * FROM spc_param_config, spv_param_values, psh_param_serv_hdr, psd_param_serv_det "
						+ "WHERE spc_param_id = spv_param_id "
						+ "AND spc_service_code = psh_service_code "
						+ "AND psd_psh_id = psh_id "
						+ "AND psh_archived = 'N' "
						+ "AND psd_param_value = spv_param_value "
						+ "AND psh_service_code = ? "
						+ "AND psh_subscriber_id = ? ", false);

		defStaticQuery("getMsisdnSba", ".base.blo.SbaSubAuxDMO",
				"SELECT sba_sub_aux.* "
						+ "FROM sba_sub_aux, vam_active_msisdn "
						+ "WHERE sba_subscriber_id = vam_subscriber_id "
						+ "AND vam_msisdn_no = ? ", false);

		defStaticQuery("getAuxSbdVamBySub",
				".soa.sharedservices.blo.AuxSbdVamDQO",
				"SELECT * FROM aux_customers, sbd_sub_dets, vam_active_msisdn "
						+ "WHERE sbd_subscriber_id = ? "
						+ "AND bill_ac_no = sbd_bill_ac_no "
						+ "AND vam_subscriber_id = vam_subscriber_id "
						+ "AND vam_msisdn_no = sbd_dialling_no", false);

		defStaticQuery("getMaxAcsSwapDate", ".common.data.StringDMO",
				"SELECT MAX(acs_swap_date) " + "FROM acs_cust_swap "
						+ "WHERE acs_bill_ac_no = ? "
						+ "AND acs_subscriber_id = ? ", false);

		defStaticQuery(
				"getTTAdhoc",
				".base.blo.TtTypeTextDMO",
				"SELECT * FROM tt_type_text "
						+ "WHERE tt_group = 'ADHC_BUNDL' " + "AND tt_type = ? ",
				false);

		defStaticQuery(
				"isInsuranceByAccount",
				".common.data.IntegerDMO",
				"select count(*) from sbd_sub_dets, vas_active_service "
						+ "where sbd_subscriber_id = vas_subscriber_id "
						+ "and sbd_bill_ac_no = ? "
						+ "and vas_subscriber_id = sbd_subscriber_id "
						+ "and vas_service_type = 'IS' "
						+ "and vas_act_date <= TODAY "
						+ "and (vas_deact_date >= TODAY or vas_deact_date IS NULL)",
				false);

		defStaticQuery(
				"isInsuranceByMsisdn",
				".common.data.IntegerDMO",
				"select count(*) from vam_active_msisdn, vas_active_service "
						+ "where vas_subscriber_id = vam_subscriber_id "
						+ "and vam_msisdn_no = ? "
						+ "and vas_service_type = 'IS' "
						+ "and vas_act_date <= TODAY "
						+ "and (vas_deact_date >= TODAY or vas_deact_date IS NULL)",
				false);

		defStaticQuery(
				"isInsuranceBySubscriber",
				".common.data.IntegerDMO",
				"select count(*) from vam_active_msisdn, vas_active_service "
						+ "where vas_subscriber_id = vam_subscriber_id "
						+ "and vam_subscriber_id = ? "
						+ "and vas_service_type = 'IS' "
						+ "and vas_act_date <= TODAY "
						+ "and (vas_deact_date >= TODAY or vas_deact_date IS NULL)",
				false);

		defStaticQuery(
				"checkSubscriberHasInsurance",
				".common.data.IntegerDMO",
				"SELECT count(*) from vcf_vrble_chrg_fee "
						+ "where vcf_subscriber_id = ? "
						+ "AND vcf_charge_code in ("
						+ "select tt_type from tt_type_text where tt_group = 'PREFUSION' )"
						+ " AND vcf_status = 'A'", false);

		defStaticQuery("getInsuranceTrack",
				".soa.sharedservices.blo.IatInsTrackDMO",
				"SELECT * FROM iat_ins_track " + "WHERE iat_ins_id = ? "
						+ "AND iat_subscriber_id = ? "
						+ "AND iat_current_msisdn = ? "
						+ "AND iat_current_accno = ? ", false);

		defStaticUpdate("insertIatInsTrack", "INSERT INTO iat_ins_track("
				+ "IAT_INS_ID," + "IAT_SUBSCRIBER_ID," + "IAT_CURRENT_MSISDN,"
				+ "IAT_CURRENT_ACCNO," + "IAT_OLD_VALUE,"
				+ "IAT_OLD_SBE_EQUIPID," + "IAT_NEW_SBE_EQUIPID,"
				+ "IAT_ACTION_DATE,"
				+ "IAT_ACTION_TYPE)values(?,?,?,?,?,?,?,?,?)");

		defStaticQuery("getPsdSerialBySubscriber", ".common.data.IntegerDMO",
				"select psd_serial_id from psd_param_serv_det, psh_param_serv_hdr "
						+ " where psh_id = psd_psh_id "
						+ " and psh_service_type = 'IS' "
						+ " and psh_subscriber_id = ? "
						+ " and psh_archived = 'N' ", false);

		defStaticQuery("getPsdSerial", ".common.data.IntegerDMO",
				"SELECT psd_serial_id " + "FROM psd_param_serv_det "
						+ "WHERE psd_psh_id = ? " + "AND psd_param_id = ? "
						+ "AND psd_param_active = 'Y' "
						+ "AND psd_deac_date IS NULL ", false);

		defStaticQuery(
				"getVcfEquipIdBySubscriber",
				".common.data.IntegerDMO",
				"select vcf_equip_id  "
						+ " from vcf_vrble_chrg_fee where vcf_subscriber_id = ? "
						+ " and vcf_status = 'A' "
						+ " and vcf_charge_code in "
						+ " (select tt_type from tt_type_text where tt_group = 'PREFUSION')",
				false);

		defStaticQuery("getManyAudWithSubscriberId", ".base.blo.AudAddressDMO",
				"SELECT * FROM aud_address " + "WHERE aud_account_no = ? "
						+ "AND aud_subscriber_id = ? AND aud_address_type = ? "
						+ "AND (aud_in_date <= TODAY OR aud_in_date IS NULL) "
						+ "ORDER BY aud_in_date DESC, aud_addrid DESC", false);

		defStaticQuery("getManyAud", ".base.blo.AudAddressDMO",
				"SELECT * FROM aud_address " + "WHERE aud_account_no = ? "
						+ "AND aud_address_type = ? "
						+ "AND (aud_in_date <= TODAY OR aud_in_date IS NULL) "
						+ "ORDER BY aud_in_date DESC, aud_addrid DESC", false);

		defStaticQuery(
				"getAudBySubSPHY",
				".base.blo.AudAddressDMO",
				"SELECT * FROM aud_address "
						+ "WHERE aud_address_type = ? "
						+ "AND aud_subscriber_id =  ? "
						+ "AND aud_addrid = (SELECT MAX(aud_addrid) "
						+ "FROM aud_address "
						+ "WHERE aud_address_type = ? AND aud_subscriber_id =  ? )",
				false);

		defStaticQuery("getPartnerServiceBenefit",
				".soa.sharedservices.blo.PsPartnerServiceDMO",
				"SELECT * FROM ps_partner_service "
						+ "WHERE ps_benefit_type = ? "
						+ "AND ps_benefit_code = ? ", false);

		defStaticQuery(
				"getPartnerInstructionCode",
				".soa.sharedservices.blo.PicPrtnrInstCdeDMO",
				"SELECT * FROM pic_prtnr_inst_cde " + "WHERE pic_instr_id = ? ",
				false);

		defStaticQuery("getPartner",
				".soa.sharedservices.blo.PiPartnerInfoDMO",
				"SELECT * FROM pi_partner_info WHERE pi_partner_id = ? ", false);

		defStaticQuery("getSlcustAuxByAccount",
				".soa.sharedservices.blo.AuxSlcustmDQO",
				"SELECT * FROM aux_customers, slcustm " + "WHERE customer = ? "
						+ "AND bill_ac_no = ? ", false);

		defStaticQuery(
				"getSbuActive",
				".base.blo.SbuSubUpgradeDMO",
				"SELECT * FROM sbu_sub_upgrade "
						+ "WHERE sbu_subscriber_id = ? "
						+ "AND sbu_subupgrade_id = "
						+ "(SELECT MAX (sbu_subupgrade_id) FROM sbu_sub_upgrade "
						+ "WHERE sbu_subscriber_id = ? "
						+ "AND sbu_record_status = 'A');", false);

		defStaticQuery("getDsvDigital",
				".soa.sharedservices.blo.DsvDgtlServVchDMO",
				"SELECT FIRST 1 * " + " FROM dsv_dgtl_serv_vch "
						+ " WHERE dsv_subscriber_id = ? "
						+ " AND dsv_transaction_id <> '0' "
						+ " AND dsv_status = 0 " + " AND dsv_req_date >= ? "
						+ " ORDER BY dsv_req_date DESC ", false);

		defStaticUpdate("insertDsvDigital", "INSERT INTO dsv_dgtl_serv_vch("
				+ "dsv_serial_id, " + "dsv_transaction_id,"
				+ "dsv_service_code," + "dsv_status," + "dsv_subscriber_id,"
				+ "dsv_msisdn," + "dsv_email," + "dsv_req_date,"
				+ "dsv_alloc_date," + "dsv_error_msg," + "dsv_analysis1,"
				+ "dsv_analysis2)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");

		defStaticQuery(
				"getSul",
				".base.blo.BlhBillLimitHdDMO",
				//"SELECT blh_subscriber_id,  'P', TODAY, TODAY + 30 UNITS YEAR, blh_bill_limit_val "
						"SELECT * FROM blh_bill_limit_hd "
						+ "WHERE blh_subscriber_id = ? "
						+ "AND blh_service_code  = 'SUL'", false);

		defStaticUpdate("updateSul", "UPDATE sul_sub_use_limit SET "
				+ "sul_start_date = ? ," + "sul_end_date = ? ,"
				+ "sul_value = ? ," + "sul_type = ? "
				+ "WHERE sul_subscriber_id = ? ");

		defStaticUpdate("tmpN2NServicesDelete", "DELETE FROM tmp_n2n_services "
				+ " WHERE sim_no in ( " + " SELECT UNIQUE(vam_sim_no) "
				+ " FROM vam_active_msisdn " + " WHERE vam_subscriber_id = ?)");

		defStaticUpdate("tmpN2NCompDelete", "DELETE FROM tmp_n2n_comp "
				+ " WHERE n_sim_no in ( " + " SELECT vam_sim_no "
				+ " FROM vam_active_msisdn " + " WHERE vam_subscriber_id = ?)");

		defStaticUpdate("updateTmpN2NServices", "UPDATE tmp_n2n_services "
				+ " SET activate_order = activate_order + 100 "
				+ " WHERE service_type != \"DC\" "
				+ " AND sim_no in ( SELECT UNIQUE(vam_sim_no) "
				+ " FROM vam_active_msisdn " + " WHERE vam_subscriber_id = ?)");

		defStaticUpdate("updateTmpN2NCompression", "UPDATE tmp_n2n_services "
				+ " SET activate_order = activate_order + 100 "
				+ " WHERE vsm_rowid IN "
				+ " (SELECT n_serv_rowid FROM tmp_n2n_comp "
				+ "  WHERE n_super_serv_code IS NULL) "
				+ " AND service_type != \"DC\" "
				+ " AND sim_no in ( SELECT UNIQUE(vam_sim_no) "
				+ " FROM vam_active_msisdn " + " WHERE vam_subscriber_id = ?)");

		defStaticQuery(
				"simServiceExists",
				".common.data.IntegerDMO",
				"SELECT  UNIQUE(0) "
						+ " FROM vam_active_msisdn, "
						+ " vsm_service_msisdn, "
						+ " vsr_service "
						+ " WHERE   vam_sim_no            = ? "
						+ " AND      vam_subscriber_id       = vsm_subscriber_id "
						+ " AND      vam_msisdn_no     = vsm_msisdn_no "
						+ " AND      vsm_node_sent     = \"Y\" "
						+ " AND      vsm_service_code   = vsr_service_code "
						+ " AND      vsr_originator   != \"S\"", false);

		defStaticUpdate("tmpN2NDcDelete", "DELETE FROM tmp_n2n_dc "
				+ " WHERE second_sim_no = ?");

		defStaticUpdate("tmpN2NDcInsert", "INSERT INTO tmp_n2n_dc"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?);");

		defStaticQuery("isMigrationPending", ".common.data.IntegerDMO",
				"SELECT UNIQUE(0) FROM mgp_mig_pending WHERE mgp_sim_no = ?",
				false);

		defStaticQuery(
				"getVasVamVsmSubSimRowIdlist",
				".soa.sharedservices.blo.VasVamVsmSubSimRowIdDQO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT"
						+ ", vsm_service_msisdn.ROWID "
						+ "FROM vam_active_msisdn, vas_active_service, vsm_service_msisdn "
						+ "WHERE vam_subscriber_id =  ? "
						+ "AND vam_sim_no MATCHES ? "
						+ "AND vam_subscriber_id = vas_subscriber_id "
						+ "AND vas_service_code = vsm_service_code "
						+ "AND vsm_msisdn_no = vam_msisdn_no "
						+ "AND vsm_subscriber_id = vam_subscriber_id "
						+ "ORDER BY vas_service_code", false);

		defStaticQuery("iteratetmpN2NDc",
				".soa.sharedservices.blo.TmpDualCallN2NServicesDQO",
				"SELECT * " + " FROM tmp_n2n_dc "
						+ " WHERE primary_sim_no MATCHES ?", true);

		defStaticUpdate("updateVsmDetails", "UPDATE  vsm_service_msisdn "
				+ " SET vsm_node_sent = 'Y' WHERE ROWID = ? ");

		defStaticUpdate("updatePshDetails", "UPDATE psd_param_serv_det "
				+ " SET psd_n2n_string = \"Y\" " + " WHERE psd_psh_id IN ( "
				+ "    SELECT psh_id FROM psh_param_serv_hdr "
				+ "    WHERE psh_subscriber_id = ? "
				+ "    AND psh_service_code = ?) "
				+ " AND psd_n2n_string = \"N\" "
				+ " AND psd_act_date <= TODAY " + " AND psd_deac_date IS NULL");

		defStaticQuery("getSbbListByPartnerId",
				".soa.sharedservices.blo.SbbSubBenefitDMO",
				" SELECT * FROM sbb_sub_benefit WHERE sbb_sub_partner_id = ? ",
				false);

		defStaticUpdate("updateTmpN2NSim", "UPDATE tmp_n2n_comp "
				+ " SET n_super_serv_code = ? " + " WHERE n_sim_no = ? "
				+ " AND n_net_serv_code = ? "
				+ " AND n_super_serv_code IS NULL ");

		defStaticQuery("getTmpN2NCompCount", ".common.data.IntegerDMO",
				" SELECT COUNT(*) FROM tmp_n2n_comp "
						+ " WHERE n_sim_no = ? "
						+ " AND n_super_serv_code IS NULL ", false);

		defStaticQuery(
				"iterateNcrCompressRule",
				".soa.sharedservices.blo.NcrCompressRuleCountDQO",
				"SELECT ncr_compress_rule.*, cnt "
						+ " FROM NCR_COMPRESS_RULE, ("
						+ "    SELECT ncr_compress_code AS COMP_CODE, COUNT(*) AS cnt "
						+ "    FROM nct_compress_type, ncr_compress_rule "
						+ "    WHERE nct_compress_type != 'TARIF' "
						+ "    AND nct_compress_code = ncr_compress_code "
						+ "    GROUP BY ncr_compress_code "
						+ "    HAVING COUNT(*) <= 1 "
						+ "    ORDER BY 2 DESC ) "
						+ " WHERE COMP_CODE = NCR_COMPRESS_RULE.NCR_COMPRESS_CODE",
				true);

		defStaticQuery("tmpN2NCompExists", ".common.data.IntegerDMO",
				"SELECT UNIQUE(n_sim_no) " + " FROM tmp_n2n_comp"
						+ " WHERE n_sim_no = ?" + " AND n_net_serv_code = ?"
						+ " AND n_super_serv_code IS NULL", false);

		defStaticUpdate("updateTmpN2NServCode", "UPDATE tmp_n2n_comp"
				+ " SET n_super_serv_code = ?" + " WHERE n_serv_rowid = ?");

		defStaticQuery("iterateTmpN2NCompForSim",
				".soa.sharedservices.blo.SimTariffDQO",
				" SELECT n_sim_no, n_intern_tariff " + " FROM tmp_n2n_comp "
						+ " WHERE n_sim_no in "
						+ "     (SELECT vam_sim_no FROM vam_active_msisdn "
						+ "     WHERE vam_subscriber_id = p_subscriber_id) "
						+ "GROUP BY n_sim_no, n_intern_tariff", true);

		defStaticUpdate("tmpN2NCompInsert", "INSERT INTO tmp_n2n_comp"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?);");

		defStaticQuery("getTmpN2NServicesForRowId",
				".soa.sharedservices.blo.TmpN2NServicesDQO",
				"SELECT * FROM tmp_n2n_services " + " WHERE vsm_rowid = ? ",
				false);

		defStaticQuery(
				"iterateTmpN2NServices",
				".soa.sharedservices.blo.TmpN2NServicesDQO",
				" SELECT * "
						+ " FROM tmp_n2n_services "
						+ " WHERE sim_no in (select vam_sim_no from vam_active_msisdn "
						+ " where vam_subscriber_id = ?) "
						+ " ORDER BY msisdn_known, sim_no, location, event_date, service_code ",
				true);
		
		defStaticQuery("iterateTmpN2NServicesVam", ".soa.sharedservices.blo.TmpN2NServicesDQO", 
						"SELECT tmp_n2n_services.* FROM tmp_n2n_services, vam_active_msisdn " + 
						"WHERE vam_subscriber_id = ? " +
						"and vam_sim_no = sim_no " +
						"and vam_msisdn_no = msisdn_no " + 
						"ORDER BY activate_order, service_order, dep_reqd, msisdn_known, sim_no, location, event_date, service_code", true);

		defStaticQuery("iterateNcrCompressRule", "NcrCompressRuleDMO",
				" SELECT * FROM ncr_compress_rule"
						+ " WHERE ncr_compress_code MATCHES ?", true);

		defStaticQuery("iterateTmpN2NSimServ",
				".soa.sharedservices.blo.TmpN2NSimServicesDQO",
				" SELECT * FROM tmp_n2n_comp" + " WHERE n_sim_no = ?"
						+ " AND n_net_serv_code = ?"
						+ " AND n_super_serv_code IS NULL", true);

		defStaticQuery("getPsPartner",
				".soa.sharedservices.blo.PsPartnerServiceDMO",
				" SELECT * FROM ps_partner_service WHERE ps_benefit_id = ? ",
				false);

		defStaticQuery(
				"getVasTotalCharge",
				".common.data.StringDMO",
				"select NVL(sum(chg_value),0) "
						+ "from vas_active_service, chg_charges c1 "
						+ " where vas_sub_charge1 = c1.chg_code "
						+ " and c1.chg_effective_date = (select max(c2.chg_effective_date) from chg_charges c2 "
						+ " where c2.chg_code = c1.chg_code ) "
						+ " and vas_subscriber_id = ? ", false);

		defStaticQuery(
				"getParamtersTotalCharge",
				".common.data.StringDMO",
				"select sum(chg_value) from psh_param_serv_hdr, psd_param_serv_det, chg_charges "
						+ "where psh_id = psd_psh_id "
						+ "and psd_param_active = 'Y' "
						+ "and psd_sub_charge = chg_code "
						+ "and chg_effective_date in "
						+ "(select max(chg_effective_date) from chg_charges "
						+ "where chg_code = psd_sub_charge) "
						+ "and psh_subscriber_id = ? ", false);

		defStaticUpdate("createTestTran",
				"insert into ttr_testtran_rec values (?,?,?,?,?,?,?,?,?,?)");

		defStaticQuery("uurUrrExists", ".common.data.StringDMO",
				"SELECT UNIQUE(uur_login) FROM uur_user_role, urr_role_right "
						+ "WHERE uur_login = ? "
						+ "AND uur_role_id = urr_role_id "
						+ "AND urr_right_id = ? ", false);

		defStaticQuery("getUut", ".soa.sharedservices.blo.UutUserRightDMO",
				"SELECT uut_add_remove FROM uut_user_right "
						+ "WHERE uut_login = ? " + "AND uut_right_id = ?",
				false);

		defStaticQuery("getSriServRight",
				".soa.sharedservices.blo.SriServRightDMO",
				"select * from sri_serv_right " + "where sri_service_code = ? "
						+ "and sri_service_type = ? "
						+ "and sri_parameter_id = ? "
						+ "and sri_param_value = ? "
						+ "and sri_service_action = ? ", false);

		defStaticQuery("getHt", ".soa.sharedservices.blo.HtHierarchyTypeDMO",
				"SELECT * FROM ht_hierarchy_type " + "WHERE ht_type = ? ",
				false);

		defStaticUpdate("updateVamContractDealer",
				"UPDATE VAM_ACTIVE_MSISDN SET VAM_CONTR_PERIOD = ?, "
						+ "VAM_CONTR_TERMINAT = ?, " + "VAM_SALESMAN = ?, "
						+ "VAM_DEALER_ID = ? " + "WHERE VAM_SUBSCRIBER_ID = ? ");

		defStaticUpdate("updateVamContract",
				"UPDATE VAM_ACTIVE_MSISDN SET VAM_CONTR_PERIOD = ?, "
						+ "VAM_CONTR_TERMINAT = ?, " + "VAM_SALESMAN = ?, "
						+ "WHERE VAM_SUBSCRIBER_ID = ? ");
		
		defStaticUpdate("updateSbuSubscriberStatus", "UPDATE SBU_SUB_UPGRADE SET SBU_RECORD_STATUS = ? WHERE SBU_SUBSCRIBER_ID = ? ");
		
		defStaticQuery(
				"getBasicVasVamVsm",
				".soa.sharedservices.blo.VasVamVsmSubSimDQO",
				"SELECT VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE"
						+ ", VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
						+ ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
						+ ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
						+ ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
						+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5"
						+ ", VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT "
						+ " FROM vas_active_service, vam_active_msisdn, vsm_service_msisdn"
						+ " WHERE vas_subscriber_id = vam_subscriber_id"
						+ " AND vas_service_code = vsm_service_code"
						+ " AND vam_msisdn_no = vsm_msisdn_no"
						+ " AND vam_sim_no = ?"
						+ " AND vas_service_code = ?"
						+ " AND vam_intern_tariff = ?", false);
		
		defStaticQuery("checkIfSubHasSSRBundle", ".base.blo.VasActiveServiceDMO", "Select * from vas_active_service " +
				"where vas_subscriber_id = ? " +
				"and vas_service_code in (Select tt_type " +
				"from TT_type_text " +
				"where tt_group = 'SSRSERVTYP');", false);
		
		defStaticQuery("getDpfSubEcug", ".base.blo.DpfDefPocFolder", 
				"SELECT * FROM dpf_def_poc_folder "
				+ "WHERE dpf_bill_ac_no IN("
				+ "SELECT sbd_bill_ac_no FROM sbd_sub_dets WHERE sbd_subscriber_id = ?)"
				+ " AND dpf_product in ('ECUG', 'EBUN')", false);
		
		defStaticUpdate("tmpN2NServicesInsert", "Insert into tmp_n2n_services values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
		
		defStaticUpdate("updateTdTelementary", "UPDATE td_telemtry_device SET td_device_desc = 'ACTIVE' WHERE td_subscriber_id = ? ");
		
		defStaticQuery("checkHeliosNotify", ".base.blo.AsrAddServReqDMO", 	
				"SELECT * FROM asr_add_serv_req "
				+ "WHERE asr_subscriber_id = ? "
				+ "AND asr_service_code in ("
				+ "select vsr_service_code from vsr_service where vsr_service_type in ("
				+ "select tt_type from tt_type_text where tt_group = 'TYPENOTIF')) "
				+ "AND asr_action_type in ("
				+ "select tt_type from tt_type_text where tt_group = 'ACTNOTIF') "
				+ "AND asr_act_reas_code = 'NOTFY' "
				+ "AND asr_active_flag = 'Y' "
				+ "order by asr_submit_date desc ", false);
		
		defStaticUpdate("createMWEvent", "INSERT INTO mwi_mw_interface VALUES(?,?,?,?,?,?);");
		
	    defStaticQuery("getDcm", ".soa.sharedservices.blo.DcmDualcallMapDMO",
	    		"SELECT * FROM dcm_dualcall_map " +
	    		"WHERE dcm_service_code = ? ", false);
	    
	    defStaticQuery("getSbdBIllAccountByVamSim",".base.blo.SbdSubDetsDMO", 
	    		"SELECT sbd_bill_ac_no "
				+ " FROM vam_active_msisdn, sbd_sub_dets "
				+ " WHERE sbd_subscriber_id = vam_subscriber_id "
				+ " AND vam_stat_code in ('1','4') "
				+ " AND vam_sim_no = ? ", true);
	    
	    defStaticQuery("getMsisdnSbdVamByPocFolder",".common.data.StringDMO", 
	    			"SELECT vam_msisdn_no FROM sbd_sub_dets, vam_active_msisdn, dpf_def_poc_folder "
					+"WHERE sbd_bill_ac_no = ? "
					+"AND sbd_subscriber_id = vam_subscriber_id "
					+"AND vam_msisdn_no = dpf_msisdn_no "
					+"AND (dpf_product = 'PTT' OR dpf_product = 'HXMOB')", true);
	    
	    defStaticQuery("getDpfPocFolder", ".soa.sharedservices.blo.DpfDefPocFolderDMO", 
	    		"SELECT * FROM dpf_def_poc_folder where "
	    		+ " AND dpf_name = ? "
	    		+ " AND dpf_folder_id = ?", false);
	    
	    defStaticUpdate("insertMcdSubMigrCntrl", "INSERT INTO SMC_SUB_MIGR_CNTRL" +
	    		" (SMC_SUBSCRIBER_ID,SMC_FROM_PACKAGE,SMC_FROM_TARIFF," +
	    		" SMC_FROM_NTWRK_TRF,SMC_TO_PACKAGE,SMC_TO_TARIFF," +
	    		" SMC_TO_NTWRK_TRF,SMC_MIGR_DATE," +
	    		" SMC_COUNT,SMC_EXPIRY_DATE,SMC_MIGR_CHARGE) " +
	    		" VALUES(?,?,?,?,?,?,?,?,?,?,?)");
	    
	    defStaticQuery("getLteAudDetails", ".base.blo.AudAddressDMO", "select aud_contact,aud_e_mail "
	    		+ "from aux_customers, aud_address "
	    		+ "where bill_ac_no = aud_account_no "
	    		+ "and aud_account_no = ? "
	    		+ "and aud_addrid = aux_invoice_addrid", false);
	    
	    defStaticQuery("getUdvCustSubSystem", ".soa.sharedservices.blo.UdvUserdocDelivDMO", 
	    		"SELECT udv_userdoc_deliv.* FROM udv_userdoc_deliv, dot_doc_type "
	    		+ "WHERE udv_bill_ac_no = ? "
	    		+ "AND dot_subsystem = ? "
	    		+ "AND udv_doc_type = dot_type_code", false);
	    
	    defStaticQuery("getChgMaxEffectiveDate", ".common.data.StringDMO", 
	    		"SELECT MAX(chg_effective_date) "
	    		+ "FROM chg_charges "
	    		+ "WHERE chg_code = ? "
	    		+ "AND chg_netid = ? "
	    		+ "AND chg_effective_date <= ?	"
	    		+ "AND chg_chargef = ? ", false);
	    
	    defStaticQuery("getPsdActiveCount", ".common.data.IntegerDMO", 
	    		"SELECT COUNT(*) FROM psh_param_serv_hdr, psd_param_serv_det	"
	    		+ "WHERE psh_id = psd_psh_id "
	    		+ "AND psh_subscriber_id = ? "
	    		+ "AND psh_service_code = ? "
	    		+ "AND psd_param_active = 'Y'", false);
	    
	    defStaticQuery("getSubscriberVasServiceCodeTariff", ".base.blo.VasActiveServiceDMO", "SELECT * FROM vas_active_service "
	    		+ "WHERE vas_subscriber_id = ? "
	    		+ "AND VAS_SERVICE_CODE = ? "
	    		+ "AND (VAS_INTERN_TARIFF = ? OR VAS_INTERN_TARIFF IS NULL OR LENGTH(VAS_INTERN_TARIFF) <= 0) ", false);
	    
	    
		
	}
}

