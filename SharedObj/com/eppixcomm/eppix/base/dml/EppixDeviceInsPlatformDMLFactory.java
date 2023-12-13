package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VcfVrbleChrgFeeDMO;

public class EppixDeviceInsPlatformDMLFactory extends BaseDMLFactory{

	private static EppixDeviceInsPlatformDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EppixDeviceInsPlatformDML();
		}
		return dml;
	}
	
	public EppixDeviceInsPlatformDMLFactory() throws DMLException {
		super();
			
		
//		defStaticQuery("getSumSpulByAccount", ".common.data.StringDMO", "Select SUM(BLH_BILL_LIMIT_VAL) FROM BLH_BILL_LIMIT_HD " +
//				"WHERE BLH_SUBSCRIBER_ID IN (SELECT sbd_subscriber_id from sbd_sub_dets " +
//				"where  sbd_bill_ac_no = ?) AND BLH_SERVICE_CODE = 'SPUL'", false);
		
		defStaticQuery("getSumSpulByAccount", ".common.data.StringDMO", "SELECT nvl(SUM(blh_bill_limit_val), 0.00) "
				+ "FROM blh_bill_limit_hd, sbd_sub_dets "
				+ "WHERE blh_service_code = 'SPUL' "
				+ "AND blh_subscriber_id = sbd_subscriber_id "
				+ "AND sbd_bill_ac_no = ? ;", false);
		
		defStaticQuery("getSumAccountSubsciptionCharges", ".common.data.StringDMO",
				"Select sum(chg_value) from vas_active_service, vst_service_types, chg_charges " +
				"where vas_subscriber_id IN (Select sbd_subscriber_id FROM sbd_sub_dets WHERE sbd_bill_ac_no = ?)" +
				"and vas_service_type = vst_service_type " +
				"and vas_sub_charge1 = chg_code " +
				"and chg_effective_date = (SELECT MAX(chg_effective_date) " +
				"FROM chg_charges " +
				"WHERE chg_code = vas_sub_charge1)", false);
		
		defStaticQuery("getSumAccountParamCharges", ".common.data.StringDMO",
				"Select sum(chg_value) from psh_Param_serv_hdr, psd_param_serv_det,chg_charges " +
				"where psh_subscriber_id IN (Select sbd_subscriber_id FROM sbd_sub_dets WHERE sbd_bill_ac_no = ?)" +
				"AND psh_id = psd_psh_id " +
				"AND PSD_SUB_CHARGE = chg_ncode " +
				"and chg_effective_date = (SELECT MAX(chg_effective_date) " +
				"FROM chg_charges " +
				"WHERE chg_code = PSD_SUB_CHARGE)", false);
		
		defStaticQuery("getSumSpulBySubscriber", ".common.data.StringDMO", "Select SUM(BLH_BILL_LIMIT_VAL) FROM BLH_BILL_LIMIT_HD " +
				"WHERE BLH_SUBSCRIBER_ID = ? AND BLH_SERVICE_CODE = 'SPUL'", false);
		
		defStaticQuery("getCountINSUFromVcf", ".common.data.IntegerDMO", 
				"Select count(*) from vcf_vrble_chrg_fee "
				+ "Where vcf_subscriber_id = ? "
				+ "AND vcf_status = 'A' "
				+ "AND vcf_variable_type = 'SR' "
				+ "AND vcf_description = 'INSURANCE'", false);
		
//		defStaticQuery("getSubscriberVcfCharges", ".base.blo.VcfVrbleChrgFeeDMO", 
//				"Select * from vcf_vrble_chrg_fee Where vcf_subscriber_id = ? "
//				+ "AND  vcf_status = 'A' "
//				+ "AND vcf_product_code = ? ", false);
		
		defStaticQuery("getSumSubscriberVcfCharges", ".common.data.StringDMO", 
				"Select sum(vcf_month_amt) from vcf_vrble_chrg_fee "
				+ "Where vcf_subscriber_id IN (Select sbd_subscriber_id FROM sbd_sub_dets WHERE sbd_bill_ac_no = ? ) "
				+ "AND  vcf_status = 'A' ", false);
		
		defStaticQuery("getVcfSubscriberInsDevice", ".base.blo.VcfVrbleChrgFeeDMO", 
				"Select * from vcf_vrble_chrg_fee "
				+ "Where vcf_subscriber_id = ? "
//				+ "And vam_msisdn_no = ? "
				+ "And vcf_status = 'A' "
				+ "And vcf_variable_type = 'SR' "
				+ "And vcf_description = 'INSURANCE' "
				+ "AND (vcf_inventry_itemid = ? "
				+ "OR vcf_product_code = ?)",				
				false);
		
		/** 
		 * Change made 03-02-2020
		 * Change Request: CR189197
		 * 
		 */
		defStaticQuery("getSubscriberVcfCharges", ".base.blo.VcfVrbleChrgFeeDMO", 
				"SELECT * FROM vcf_vrble_chrg_fee "
				+ "WHERE vcf_variable_type = 'SR' "
				+ "AND vcf_description = 'INSURANCE' "
				+ "AND vcf_status = 'A' "
				+ "AND vcf_product_code = ?", false);
		
		defStaticQuery("getVcfUniqueInsurancePol", ".base.blo.VcfVrbleChrgFeeDMO", 
				"SELECT * FROM vcf_vrble_chrg_fee "
				+ "WHERE vcf_variable_type = 'SR' "
				+ "AND vcf_description = 'INSURANCE' "
				+ "AND vcf_inventry_itemid = ?", false);
		
		/**
		 * End Change Request: CR189197
		 */
		
		defStaticQuery("getVcfSubscriberInsDeviceOld", ".base.blo.VcfVrbleChrgFeeDMO", 
				"Select * from vcf_vrble_chrg_fee "
				+ "Where vcf_subscriber_id = ? "
				+ "And vcf_status = 'A' "
				+ "And vcf_variable_type = 'SR' "
				+ "And vcf_description = 'INSURANCE' "
				+ "and (vcf_inventry_itemid = ? "
				+ "or vcf_equip_id = ? )",				
				false);
		/**
		 * Change 25-11-2019
		where vam_subscriber_Id = vcf_subscriber_id
				and (Serialid = vcf_inventry_itemid
				or (Serialid = vcf_equip_id and Serialid not matches '*P*'))
		*/
		
		
//		defStaticQuery("getCustomerVasServiceAll", ".base.blo.VasActiveServiceDMO", 
//				"Select * from vas_active_service, vst_service_types, chg_charges "
//				+ "where vas_subscriber_id IN (Select sbd_subscriber_id "
//				+ "FROM sbd_sub_dets WHERE sbd_bill_ac_no = ?) "
//				+ "and vas_service_type = vst_service_type "
//				+ "and vas_sub_charge1 = chg_code "
//				+ "and chg_effective_date = (SELECT MAX(chg_effective_date) "
//				+ "FROM chg_charges WHERE chg_code = vas_sub_charge1)", true);
		
		
	}


}
