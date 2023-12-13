package com.eppixcomm.eppix.base.dml;

public class ActivationPendAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected ActivationPendAbstractDMLFactory() throws DMLException {
		;
		DMLTable table = defTable("ActivationPend", // DML Name
				"blo.ActivationPendDMO", // dmoName
				"activation_pend", // tableName
				2, // numColumns
				"MSISDN_NO, SIM_NO ", // columnList
				"MSISDN_NO", // primaryKey
				"" // versionCol
				, false, // generatedKey
				"MSISDN_NO, SIM_NO ", "", "", new String[] { "MSISDN_NO",
						"SIM_NO" }, true);

		table.addFilterBy("equalMsisdnNo", /* PK attribute */
		"MSISDN_NO = ? ")
				.addFilterBy("filterByMsisdnNoMatch", "MSISDN_NO LIKE ?")
				.addFilterBy("INMsisdnNo", "MSISDN_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsisdnNo", "MSISDN_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsisdnNo", "MSISDN_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullMsisdnNo",
						"(MSISDN_NO IS NULL OR LENGTH(MSISDN_NO) IS NULL OR LENGTH(MSISDN_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullMsisdnNo", "MSISDN_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanMsisdnNo", "MSISDN_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanMsisdnNo", "MSISDN_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByMsisdnNoMatch", "MSISDN_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullMsisdnNo",
						"(MSISDN_NO = ? OR MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsisdnNo asc", "MSISDN_NO ASC ") // ORDER ASCENDING

				.addOrderBy("MsisdnNo desc", "MSISDN_NO DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSimNo", /* PK attribute */
		"SIM_NO = ? ")
				.addFilterBy("filterBySimNoMatch", "SIM_NO LIKE ?")
				.addFilterBy("INSimNo", "SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSimNo", "SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSimNo", "SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSimNo",
						"(SIM_NO IS NULL OR LENGTH(SIM_NO) IS NULL OR LENGTH(SIM_NO) = 0)") // IS
																							// NULL

				.addFilterBy("notnullSimNo", "SIM_NO IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanSimNo", "SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSimNo", "SIM_NO > ? ") // GREATER THAN

				.addFilterBy("filterBySimNoMatch", "SIM_NO LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullSimNo",
						"(SIM_NO = ? OR SIM_NO IS NULL) ") // EQUALORNULL
															// TODO : we may
															// need to wrap this
															// with a TRIM()

				.addOrderBy("SimNo asc", "SIM_NO ASC ") // ORDER ASCENDING

				.addOrderBy("SimNo desc", "SIM_NO DESC ") // ORDER DESCENDING
		;

	}

}