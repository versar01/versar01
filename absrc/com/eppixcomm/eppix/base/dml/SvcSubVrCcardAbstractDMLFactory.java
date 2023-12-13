package com.eppixcomm.eppix.base.dml;

public class SvcSubVrCcardAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DotDocTypeAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected SvcSubVrCcardAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SvcSubVrCcard", // DML Name
				"blo.SvcSubVrCcardDMO", // dmoName
				"svc_sub_vr_ccard", // tableName
				5, // numColumns
				"SVC_MSISDN_NO, SVC_CCARD_NO, SVC_CCARD_TYPE, SVC_CCARD_EXPIRY, SVC_CVV_NUMBER", // columnList
				"SVC_MSISDN_NO", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SVC_MSISDN_NO, SVC_CCARD_NO, SVC_CCARD_TYPE, SVC_CCARD_EXPIRY, SVC_CVV_NUMBER",
				"",
				"",
				new String[] { "SVC_MSISDN_NO", "SVC_CCARD_NO",
						"SVC_CCARD_TYPE", "SVC_CCARD_EXPIRY", "SVC_CVV_NUMBER" },
				true);
		table.addFilterBy("equalSvcMsisdnNo", /* PK attribute */
		"SVC_MSISDN_NO = ? ")
				.addFilterBy("filterBySvcMsisdnNoMatch", "SVC_MSISDN_NO LIKE ?")
				.addFilterBy("INSvcMsisdnNo", "SVC_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSvcMsisdnNo", "SVC_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSvcMsisdnNo", "SVC_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSvcMsisdnNo",
						"(SVC_MSISDN_NO IS NULL OR LENGTH(SVC_MSISDN_NO) IS NULL OR LENGTH(SVC_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSvcMsisdnNo",
						"SVC_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSvcMsisdnNo", "SVC_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSvcMsisdnNo", "SVC_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySvcMsisdnNoMatch",
						"SVC_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSvcMsisdnNo",
						"(SVC_MSISDN_NO = ? OR SVC_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SvcMsisdnNo asc", "SVC_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SvcMsisdnNo desc", "SVC_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSvcCcardNo", /* PK attribute */
		"SVC_CCARD_NO = ? ")
				.addFilterBy("filterBySvcCcardNoMatch", "SVC_CCARD_NO LIKE ?")
				.addFilterBy("INSvcCcardNo", "SVC_CCARD_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSvcCcardNo", "SVC_CCARD_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSvcCcardNo", "SVC_CCARD_NO != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSvcCcardNo",
						"(SVC_CCARD_NO IS NULL OR LENGTH(SVC_CCARD_NO) IS NULL OR LENGTH(SVC_CCARD_NO) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSvcCcardNo", "SVC_CCARD_NO IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSvcCcardNo", "SVC_CCARD_NO < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSvcCcardNo", "SVC_CCARD_NO > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySvcCcardNoMatch", "SVC_CCARD_NO LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSvcCcardNo",
						"(SVC_CCARD_NO = ? OR SVC_CCARD_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SvcCcardNo asc", "SVC_CCARD_NO ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SvcCcardNo desc", "SVC_CCARD_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSvcCcardType", /* PK attribute */
		"SVC_CCARD_TYPE = ? ")
				.addFilterBy("filterBySvcCcardTypeMatch",
						"SVC_CCARD_TYPE LIKE ?")
				.addFilterBy("INSvcCcardType", "SVC_CCARD_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINSvcCcardType", "SVC_CCARD_TYPE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSvcCcardType", "SVC_CCARD_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSvcCcardType",
						"(SVC_CCARD_TYPE IS NULL OR LENGTH(SVC_CCARD_TYPE) IS NULL OR LENGTH(SVC_CCARD_TYPE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSvcCcardType",
						"SVC_CCARD_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSvcCcardType", "SVC_CCARD_TYPE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSvcCcardType", "SVC_CCARD_TYPE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySvcCcardTypeMatch",
						"SVC_CCARD_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSvcCcardType",
						"(SVC_CCARD_TYPE = ? OR SVC_CCARD_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SvcCcardType asc", "SVC_CCARD_TYPE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SvcCcardType desc", "SVC_CCARD_TYPE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSvcCcardExpiry", /* PK attribute */
		"SVC_CCARD_EXPIRY = ? ")
				.addFilterBy("filterBySvcCcardExpiryMatch",
						"SVC_CCARD_EXPIRY LIKE ?")
				.addFilterBy("INSvcCcardExpiry", "SVC_CCARD_EXPIRY IN ( ? ) ") // IN

				.addFilterBy("NOTINSvcCcardExpiry",
						"SVC_CCARD_EXPIRY NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSvcCcardExpiry", "SVC_CCARD_EXPIRY != ?") // NOTEQUAL

				.addFilterBy(
						"nullSvcCcardExpiry",
						"(SVC_CCARD_EXPIRY IS NULL OR LENGTH(SVC_CCARD_EXPIRY) IS NULL OR LENGTH(SVC_CCARD_EXPIRY) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSvcCcardExpiry",
						"SVC_CCARD_EXPIRY IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSvcCcardExpiry", "SVC_CCARD_EXPIRY < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSvcCcardExpiry",
						"SVC_CCARD_EXPIRY > ? ") // GREATER THAN

				.addFilterBy("filterBySvcCcardExpiryMatch",
						"SVC_CCARD_EXPIRY LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSvcCcardExpiry",
						"(SVC_CCARD_EXPIRY = ? OR SVC_CCARD_EXPIRY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SvcCcardExpiry asc", "SVC_CCARD_EXPIRY ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SvcCcardExpiry desc", "SVC_CCARD_EXPIRY DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSvcCvvNumber", /* PK attribute */
		"SVC_CVV_NUMBER = ? ")
				.addFilterBy("filterBySvcCvvNumberMatch",
						"SVC_CVV_NUMBER LIKE ?")
				.addFilterBy("INSvcCvvNumber", "SVC_CVV_NUMBER IN ( ? ) ") // IN

				.addFilterBy("NOTINSvcCvvNumber", "SVC_CVV_NUMBER NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSvcCvvNumber", "SVC_CVV_NUMBER != ?") // NOTEQUAL

				.addFilterBy(
						"nullSvcCvvNumber",
						"(SVC_CVV_NUMBER IS NULL OR LENGTH(SVC_CVV_NUMBER) IS NULL OR LENGTH(SVC_CVV_NUMBER) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSvcCvvNumber",
						"SVC_CVV_NUMBER IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSvcCvvNumber", "SVC_CVV_NUMBER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSvcCvvNumber", "SVC_CVV_NUMBER > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySvcCvvNumberMatch",
						"SVC_CVV_NUMBER LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSvcCvvNumber",
						"(SVC_CVV_NUMBER = ? OR SVC_CVV_NUMBER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SvcCvvNumber asc", "SVC_CVV_NUMBER ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SvcCvvNumber desc", "SVC_CVV_NUMBER DESC ") // ORDER
																			// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SvcSubVrCcardAbstractDMLFactory();
		}
		return dml;
	}
}