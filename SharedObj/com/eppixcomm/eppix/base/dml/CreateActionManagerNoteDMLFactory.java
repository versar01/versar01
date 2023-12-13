package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.BaseDMLFactory;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;

public class CreateActionManagerNoteDMLFactory extends BaseDMLFactory {

	protected CreateActionManagerNoteDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("getUsUserDef", ".soa.sharedservices.blo.UsUserDefDMO",
				"SELECT US_LOGIN,US_NAME,US_DEPARTMENT,"
						+ "US_PASSWORD,US_EMAIL,US_DIARY_SUSPENDED,"
						+ "US_STANDIN,US_STANDIN_AS_MGR,US_EXTERNAL_TYPE, "
						+ "US_EXTERNAL_CODE " + "FROM US_USER_DEF "
						+ "WHERE US_LOGIN = ?", false);
		
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
		
		defStaticQuery("getInxInvoiceXREF",
				".soa.sharedservices.blo.InxInvoiceXrefDMO",
				"SELECT INX_CUSTOMER,INX_SUBSCRIBER_ID,INX_INVOICE_NO,"
						+ "INX_MSISDN_NO,INX_MSISDN_FLAG "
						+ "FROM INX_INVOICE_XREF "
						+ "WHERE INX_INVOICE_NO = ? ", false);
		
		defStaticQuery("getMaxNteNote", ".common.data.IntegerDMO",
				"SELECT MAX(NTE_NOTE_SERIAL) " + "FROM NTE_NOTE", false);
		
		
		defStaticUpdate("insertTpdTextPad", "INSERT INTO TPD_TEXT_PAD ("
				+ "TPD_OWNER_SERIAL, " + "TPD_TYPE, " + "TPD_PAGE_NO, "
				+ "TPD_BLOCK_NO, " + "TPD_BLOCK_ATTR, " + "TPD_BLOCK_TEXT) "
				+ "VALUES(?, ?, ?, ?, ?, ?);");
		
		defStaticQuery("getMaxTpdBlock", ".common.data.IntegerDMO",
				"SELECT NVL(MAX(TPD_BLOCK_NO), 0) " + "FROM TPD_TEXT_PAD "
						+ "WHERE TPD_OWNER_SERIAL = ? " + "AND TPD_TYPE = ? "
						+ "AND TPD_PAGE_NO = ? ", false);
		
		defStaticQuery("getTpdTextPad",
				".soa.sharedservices.blo.TpdTextPadDMO",
				"SELECT TPD_OWNER_SERIAL, TPD_TYPE, TPD_PAGE_NO, "
						+ "TPD_BLOCK_NO, TPD_BLOCK_ATTR, TPD_BLOCK_TEXT "
						+ "FROM TPD_TEXT_PAD  " + "WHERE TPD_OWNER_SERIAL = ? "
						+ "AND TPD_TYPE = ? " + "AND TPD_PAGE_NO = ? "
						+ "AND TPD_BLOCK_NO = ? ", false);
		
		defStaticUpdate("updateTpdTextPad",
				"UPDATE TPD_TEXT_PAD SET TPD_BLOCK_ATTR = ?, "
						+ "TPD_BLOCK_TEXT = ? " + "WHERE TPD_OWNER_SERIAL = ? "
						+ "AND TPD_TYPE = ? " + "AND TPD_PAGE_NO = ? "
						+ "AND TPD_BLOCK_NO = ? ");

	}

	/** The DMLFactory singleton */
	private static CreateActionManagerNoteDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new CreateActionManagerNoteDML();
		}
		return dml;
	}
}
