package com.eppixcomm.eppix.base.dml;

public class AuxCustEncryptedDMLFactory  extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static AuxCustEncryptedDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new AuxCustEncryptedDML();
		}
		return dml;
	}
	
	public AuxCustEncryptedDMLFactory() throws DMLException{

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
		
		defStaticQuery("getAuxEncryptKey", // dmlName,
				".common.data.StringDMO", // dmoName,
				"SELECT eek_encryption_key "
						+ "FROM aux_encrypted, eek_eppix_enc_key "
						+ "WHERE bill_ac_no = ? "
						+ "AND key_version = eek_version ",// selectStmt,
				false);// isMultiRow);
	}

}
