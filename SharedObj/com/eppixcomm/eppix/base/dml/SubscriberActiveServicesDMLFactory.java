package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;


public class SubscriberActiveServicesDMLFactory  extends BaseDMLFactory {

	private static SubscriberActiveServicesDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SubscriberActiveServicesDML();
		}
		return dml;
	}

		public SubscriberActiveServicesDMLFactory() throws DMLException{
			super();
			
			
			defStaticQuery("getLastInvoiceDate", ".common.data.StringDMO", 
					"SELECT MAX(ins_invoice_date) FROM ins_inv_summary	WHERE ins_customer = ? " , false);
			
			defStaticQuery("isConverged", ".base.blo.BlhBillLimitHdDMO", 
					"SELECT * FROM blh_bill_limit_hd "
					+ "WHERE blh_subscriber_id = ? "
					+ "AND blh_service_code = 'SPUL'", false);
			
			defStaticQuery("getCountDepositRule", ".common.data.IntegerDMO", 
					"SELECT COUNT(*) FROM sdr_serv_depo_rule "
					+ "WHERE sdr_package_code = ? "
					+ "AND sdr_service_code = ? ", false);
			
		}

}
