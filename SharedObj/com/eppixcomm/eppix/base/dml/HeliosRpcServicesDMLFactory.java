package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SbuSubUpgradeDMO;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.common.data.IntegerDMO;

public class HeliosRpcServicesDMLFactory extends BaseDMLFactory {

	private static HeliosRpcServicesDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new HeliosRpcServicesDML();
		}
		return dml;
	}

	protected HeliosRpcServicesDMLFactory() throws DMLException {
		super();

		defStaticQuery("getSbdMsisdn", ".base.blo.SbdSubDetsDMO",
				"SELECT sbd_sub_dets.* "
						+ "FROM sbd_sub_dets, vam_active_msisdn "
						+ "WHERE sbd_subscriber_id = vam_subscriber_id "
						+ "AND vam_msisdn_no = ? ", false);

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

		defStaticQuery(
				"cutomerListT",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name,credit_limit, analysis_codes1,"
						+ " address1, address2, address3, address4,"
						+ " group_customer, '', '', 0, ''"
						+ " from slcustm"
						+ " where customer > ? "
						+ " and customer in (select bill_ac_no from aux_customers where aux_account_type in"
						+ " ( select tt_type from tt_type_text where tt_group = 'ACCTYPE' and tt_text = 'R'))",
				true);

		defStaticQuery(
				"cutomerListTCount",
				".common.data.IntegerDMO",
				"SELECT count(*) from slcustm"
						+ " where customer > ? "
						+ " and customer in (select bill_ac_no from aux_customers where aux_account_type in"
						+ " ( select tt_type from tt_type_text where tt_group = 'ACCTYPE' and tt_text = 'R'))",
				false);

		defStaticQuery(
				"cutomerListTMatchTT",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name,credit_limit, analysis_codes1,"
						+ " address1, address2, address3, address4,"
						+ " group_customer, '', '', 0, ''"
						+ " from slcustm"
						+ " where customer > ? "
						+ " and customer in (select bill_ac_no from aux_customers where aux_account_type in"
						+ " ( select tt_type from tt_type_text where tt_group = 'ACCTYPE' and tt_text = 'R' and tt_type matches ? ))",
				true);

		defStaticQuery(
				"cutomerListTMatchTTCount",
				".common.data.IntegerDMO",
				"SELECT count(*) from slcustm"
						+ " where customer > ? "
						+ " and customer in (select bill_ac_no from aux_customers where aux_account_type in"
						+ " ( select tt_type from tt_type_text where tt_group = 'ACCTYPE' and tt_text = 'R' and tt_type matches ? ))",
				false);

		defStaticQuery("cutomerListADealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' " + "FROM slcustm "
						+ "WHERE customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "AND customer MATCHES ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListA", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' " + " FROM slcustm "
						+ "WHERE customer > ? " + "AND customer MATCHES ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListACount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm " + "WHERE customer > ? "
						+ "AND customer MATCHES ? ", false);

		defStaticQuery("cutomerListBDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0 ,''"
						+ "FROM aux_customers, slcustm "
						+ "WHERE aux_customers.comp_reg_no MATCHES ? "
						+ "AND customer = bill_ac_no " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "ORDER BY customer", true);

		defStaticQuery("cutomerListB", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM aux_customers, slcustm "
						+ "WHERE comp_reg_no MATCHES ? "
						+ "AND customer = bill_ac_no " + "ORDER BY customer",
				true);

		defStaticQuery("cutomerListBCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM aux_customers, slcustm "
						+ "WHERE comp_reg_no MATCHES ? "
						+ "AND customer = bill_ac_no ", false);

		defStaticQuery("cutomerListEDelaerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer , '', '', 0, ''"
						+ "FROM slcustm, tt_type_text "
						+ "WHERE tt_group = 'EBUACCTYPE' "
						+ "AND tt_type = account_type " + "AND customer > ? "
						+ "AND customer IN " + "(SELECT bill_ac_no "
						+ "FROM aux_customers " + "WHERE dealer_id = ?)"
						+ "AND customer MATCHES ? " + "ORDER BY customer", true);

		defStaticQuery("cutomerListE", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS} customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer , '', '', 0, ''"
						+ "FROM slcustm, tt_type_text "
						+ "WHERE tt_group = 'EBUACCTYPE' "
						+ "AND tt_type = account_type " + "AND customer > ? "
						+ "AND customer MATCHES ? " + "ORDER BY customer", true);

		defStaticQuery("cutomerListECount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm, tt_type_text "
						+ "WHERE tt_group = 'EBUACCTYPE' "
						+ "AND tt_type = account_type " + "AND customer > ? "
						+ "AND customer MATCHES ? ", false);

		defStaticQuery("cutomerListRValid",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer , '', '', 0, ''" + " FROM slcustm  "
						+ "WHERE customer in ( " + "SELECT nte_bill_ac_no "
						+ "FROM nte_note " + "WHERE nte_note_serial = ?) "
						+ "ORDER BY customer ", true);

		defStaticQuery("cutomerListRValidCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm  " + "WHERE customer in ( "
						+ "SELECT nte_bill_ac_no " + "FROM nte_note "
						+ "WHERE nte_note_serial = ?) ", false);

		defStaticQuery("cutomerListR", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer , '', '', 0, ''" + " FROM slcustm  "
						+ "WHERE customer in ( " + "SELECT nte_bill_ac_no "
						+ "FROM nte_note " + "WHERE nte_reference_no = ?) "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListRCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm  " + "WHERE customer in ( "
						+ "SELECT nte_bill_ac_no " + "FROM nte_note "
						+ "WHERE nte_reference_no = ?)", false);

		defStaticQuery("cutomerListNDealId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' " + "FROM slcustm "
						+ "WHERE customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)"
						+ "AND slcustm.name MATCHES ? " + "ORDER BY customer",
				true);

		defStaticQuery("cutomerListN", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' " + " FROM slcustm "
						+ "WHERE customer > ? " + "AND slcustm.name MATCHES ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListNCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm " + "WHERE customer > ? "
						+ "AND slcustm.name MATCHES ? ", false);

		defStaticQuery("cutomerListDDealId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', sbd_surname, "
						+ "sbd_subscriber_id, sbd_firstname "
						+ "FROM slcustm, sbd_sub_dets " + "WHERE customer > ? "
						+ "AND customer = sbd_bill_ac_no " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)"
						+ "AND (sbd_surname MATCHES ? "
						+ "OR sbd_firstname MATCHES ?) " + "ORDER BY customer",
				true);

		defStaticQuery("cutomerListD", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', sbd_surname, "
						+ "sbd_subscriber_id, sbd_firstname "
						+ "FROM slcustm, sbd_sub_dets " + "WHERE customer > ? "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND (sbd_surname MATCHES ? "
						+ "OR sbd_firstname MATCHES ?) " + "ORDER BY customer",
				true);

		defStaticQuery("cutomerListDCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm, sbd_sub_dets "
						+ "WHERE customer > ? "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND (sbd_surname MATCHES ? "
						+ "OR sbd_firstname MATCHES ?) ", false);

		defStaticQuery("cutomerListPDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, aud_postcode "
						+ "FROM slcustm, aud_address " + "WHERE customer > ? "
						+ "AND customer = aud_account_no " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)"
						+ "AND aud_postcode MATCHES ? " + "AND aud_addrid = "
						+ "(SELECT MAX(aud_addrid) " + "FROM aud_address "
						+ "WHERE aud_account_no = customer "
						+ "AND aud_address_type = 'CPHY') "
						+ "AND aud_address_type = 'CPHY' "
						+ "GROUP BY 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 "
						+ "ORDER BY 1", true);

		defStaticQuery("cutomerListP", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, aud_postcode "
						+ "FROM slcustm, aud_address " + "WHERE customer > ? "
						+ "AND customer = aud_account_no "
						+ "AND aud_postcode MATCHES ? " + "AND aud_addrid = "
						+ "(SELECT MAX(aud_addrid) " + "FROM aud_address "
						+ "WHERE aud_account_no = customer "
						+ "AND aud_address_type = 'CPHY') "
						+ "AND aud_address_type = 'CPHY' "
						+ "GROUP BY 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 "
						+ "ORDER BY 1", true);

		defStaticQuery("cutomerListPCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm, aud_address "
						+ "WHERE customer > ? "
						+ "AND customer = aud_account_no "
						+ "AND aud_postcode MATCHES ? " + "AND aud_addrid = "
						+ "(SELECT MAX(aud_addrid) " + "FROM aud_address "
						+ "WHERE aud_account_no = customer "
						+ "AND aud_address_type = 'CPHY') "
						+ "AND aud_address_type = 'CPHY' ", false);

		defStaticQuery("cutomerListCDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, alpha " + "FROM slcustm "
						+ "WHERE customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "AND alpha MATCHES ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListC", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, alpha " + "FROM slcustm "
						+ "WHERE customer > ? " + "AND alpha MATCHES ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListCCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm " + "WHERE customer > ? "
						+ "AND alpha MATCHES ? ", false);

		defStaticQuery("cutomerListMDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', vam_subscriber_id, '' "
						+ "FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_msisdn_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "ORDER BY customer", true);

		defStaticQuery("cutomerListM", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', vam_subscriber_id, '' "
						+ "FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_msisdn_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? " + "ORDER BY customer", true);

		defStaticQuery("cutomerListMCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_msisdn_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? ", false);

		defStaticQuery("cutomerListSDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', vam_subscriber_id, '' "
						+ "FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_sim_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "ORDER BY customer", true);

		defStaticQuery("cutomerListS", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', vam_subscriber_id, '' "
						+ "FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_sim_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? " + "ORDER BY customer", true);

		defStaticQuery("cutomerListSCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE vam_sim_no MATCHES ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? ", false);

		defStaticQuery("cutomerListIDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM aux_customers, slcustm "
						+ "WHERE (aux_customers.id_number MATCHES ? "
						+ "OR aux_customers.aux_analysis_13 MATCHES ?) "
						+ "AND customer = bill_ac_no " + "AND customer > ? "
						+ "AND customer IN " + "(SELECT bill_ac_no "
						+ "FROM aux_customers " + "WHERE dealer_id = ?)"
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListI", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM aux_customers, slcustm "
						+ "WHERE (id_number MATCHES ? "
						+ "or aux_analysis_13 MATCHES ?) "
						+ "AND customer = bill_ac_no " + "AND customer > ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListICount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM aux_customers, slcustm "
						+ "WHERE (id_number MATCHES ? "
						+ "or aux_analysis_13 MATCHES ?) "
						+ "AND customer = bill_ac_no " + "AND customer > ? ",
				false);

		defStaticQuery("cutomerListVDealerIdMatch",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, ''"
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE ins_invoice_no[1, ?] = ? "
						+ "AND customer = ins_customer " + "AND customer > ? "
						+ "AND customer IN " + "(SELECT bill_ac_no "
						+ "FROM aux_customers " + "WHERE dealer_id = ?) "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListVMatch",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE ins_invoice_no[1, ? ] = ? "
						+ "AND customer = ins_customer " + "AND customer > ? "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListVMatchCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm, ins_inv_summary "
						+ "WHERE ins_invoice_no[1, ? ] = ? "
						+ "AND customer = ins_customer " + "AND customer > ? ",
				false);

		defStaticQuery("cutomerListVDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE customer = ins_customer "
						+ "AND customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?) " + "ORDER BY customer", true);

		defStaticQuery("cutomerListV", ".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', 0, '' "
						+ "FROM slcustm, ins_inv_summary "
						+ "WHERE customer = ins_customer "
						+ "AND customer > ? " + "ORDER BY customer", true);

		defStaticQuery("cutomerListVCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM slcustm, ins_inv_summary "
						+ "WHERE customer = ins_customer "
						+ "AND customer > ? ", false);

		defStaticQuery("cutomerListUDealerId",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', sbd_subscriber_id, '' "
						+ "FROM vam_active_msisdn, sbd_sub_dets, slcustm "
						+ "WHERE sbd_subscriber_id = ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "AND customer > ? " + "AND customer IN "
						+ "(SELECT bill_ac_no " + "FROM aux_customers "
						+ "WHERE dealer_id = ?)" + "ORDER BY customer", true);

		defStaticQuery(
				"cutomerListU",
				".soa.sharedservices.blo.SlcustmDQO",
				"SELECT {+FIRST_ROWS}  UNIQUE customer, name, credit_limit, analysis_codes1,"
						+ "address1, address2, address3, address4, "
						+ "group_customer, '', '', sbd_subscriber_id, '' "
						+ "FROM sbd_sub_dets, OUTER vam_active_msisdn, slcustm "
						+ "WHERE sbd_subscriber_id = ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no "
						+ "ORDER BY customer", true);

		defStaticQuery("cutomerListUCount", ".common.data.IntegerDMO",
				"SELECT count(*) FROM sbd_sub_dets, OUTER vam_active_msisdn, slcustm "
						+ "WHERE sbd_subscriber_id = ? "
						+ "AND sbd_subscriber_id = vam_subscriber_id "
						+ "AND customer = sbd_bill_ac_no ", false);

		defStaticQuery("getCountFraudSubs", ".common.data.IntegerDMO",
				"SELECT COUNT(*) FROM vam_active_msisdn, sba_sub_aux "
						+ "WHERE vam_subscriber_id = sba_subscriber_id "
						+ "AND sba_inv_account = ? "
						+ "AND sba_analysis_25 = ? " + "AND vam_stat_code = ? "
						+ "AND vam_msisdn_known != '3'", false);

		defStaticQuery("getAuxEncryptKey", ".common.data.StringDMO",
				"SELECT eek_encryption_key "
						+ "FROM aux_encrypted, eek_eppix_enc_key "
						+ "WHERE bill_ac_no = ? "
						+ "AND key_version = eek_version ", false);

		defStaticQuery("getAuxCustEncrypted",
				".soa.sharedservices.blo.AuxEncryptedDMO",
				"SELECT bill_ac_no, key_version,"
						+ " DECRYPT_CHAR (cc_no, ?) as cc_no,"
						+ " DECRYPT_CHAR (cc_cvv_no, ?) as cc_cvv_no,"
						+ " DECRYPT_CHAR (bank_ac_no, ?) as bank_ac_no,"
						+ " DECRYPT_CHAR (id_no, ?) as id_no,"
						+ " DECRYPT_CHAR (passport_no, ?) as passport_no"
						+ " FROM aux_encrypted WHERE bill_ac_no = ?", false);
		
		defStaticQuery("getTariffPackageStatus", ".base.blo.TsTariffServiceDMO", 
				"SELECT * FROM ts_tariff_service "
				+ "WHERE ts_package_code = ? "
				+ "AND ts_internal_tariff = ? "
				+ "AND rowid IN (SELECT MIN(rowid) "
				+ "FROM ts_tariff_service "
				+ "WHERE ts_package_code = ? "
				+ "AND ts_internal_tariff = ?)", false);
		
		defStaticQuery("getSubcriberSbu", ".base.blo.SbuSubUpgradeDMO", " SELECT * FROM sbu_sub_upgrade "
				+ "WHERE sbu_subscriber_id = ? "
				+ "AND sbu_activate_date BETWEEN ? AND TODAY "
				+ "ORDER BY sbu_subupgrade_id desc", false);
		
		defStaticQuery("countAuxByRsaId", ".common.data.IntegerDMO", "SELECT COUNT(*) FROM aux_customers "
				+ "WHERE rem_let_date BETWEEN ? AND ? "
				+ " AND id_number = ? ", false);
		
		defStaticQuery("countAuxByPassport", ".common.data.IntegerDMO", "SELECT COUNT(*) FROM aux_customers "
				+ "WHERE rem_let_date BETWEEN ? AND ? "
				+ " AND aux_analysis_13 = ? ", false);
		
		defStaticQuery("getDlhDynamicLmtHdrById",
				".soa.sharedservices.blo.DlhDynmcLmtHdrDMO",
				"select * from dlh_dynmc_lmt_hdr where dlh_id_no = ? ", false);

		defStaticQuery("getDlhDynamicLmtHdrByPass",
				".soa.sharedservices.blo.DlhDynmcLmtHdrDMO",
				"select * from dlh_dynmc_lmt_hdr where dlh_passport_no = ? ",
				false);
		
		defStaticQuery("getDldDynamicLmtDetById", ".soa.sharedservices.blo.DldDynmcLmtDetDMO", 
				"SELECT * FROM dld_dynmc_lmt_det WHERE dld_id = ? ", true);
		

		defStaticQuery("getDldDynamicLmtDetByAccAndId", ".soa.sharedservices.blo.DldDynmcLmtDetDMO", 
				"SELECT * FROM dld_dynmc_lmt_det "
				+ "WHERE dld_account_no = ? "
				+ "AND dld_id = ? ", false);
		
		defStaticUpdate("InsertHeliosAsyncData", "INSERT INTO had_helios_async_data" + 
				"		VALUES(?, ?, ?, 'I', CURRENT, '','')");
		
	}

}
