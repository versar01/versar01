package com.eppixcomm.eppix.base.dml;

public class PfuPocUsageAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected PfuPocUsageAbstractDMLFactory() throws DMLException {
		DMLTable table = defTable(
				"PfuPocUsage", // DML Name
				"blo.PfuPocUsageDMO", // dmoName
				"pfu_poc_usage", // tableName
				9, // numColumns
				"PFU_SERIAL_ID, PFU_MSISDN_NO, PFU_FOLDER_ID, PFU_USAGE, PFU_USAGE_DATE, PFU_STATUS, PFU_COMMENTS, PFU_XDR_DATE, PFU_PROCESS_DATE", // columnList
				"PFU_SERIAL_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"PFU_SERIAL_ID, PFU_MSISDN_NO, PFU_FOLDER_ID, PFU_USAGE, PFU_USAGE_DATE, PFU_STATUS, PFU_COMMENTS, PFU_XDR_DATE, PFU_PROCESS_DATE",
				"", "", new String[] { "PFU_SERIAL_ID", "PFU_MSISDN_NO",
						"PFU_FOLDER_ID", "PFU_USAGE", "PFU_USAGE_DATE",
						"PFU_STATUS", "PFU_COMMENTS", "PFU_XDR_DATE",
						"PFU_PROCESS_DATE", }, true);
		table.addFilterBy("equalPfuSerialId", /* PK attribute */
		"PFU_SERIAL_ID = ? ")
				.addFilterBy("filterByPfuSerialIdMatch", "PFU_SERIAL_ID LIKE ?")
				.addFilterBy("INPfuSerialId", "PFU_SERIAL_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPfuSerialId", "PFU_SERIAL_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfuSerialId", "PFU_SERIAL_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfuSerialId",
						"(PFU_SERIAL_ID IS NULL OR LENGTH(PFU_SERIAL_ID) IS NULL OR LENGTH(PFU_SERIAL_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfuSerialId",
						"PFU_SERIAL_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfuSerialId", "PFU_SERIAL_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfuSerialId", "PFU_SERIAL_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfuSerialIdMatch",
						"PFU_SERIAL_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfuSerialId",
						"(PFU_SERIAL_ID = ? OR PFU_SERIAL_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuSerialId asc", "PFU_SERIAL_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfuSerialId desc", "PFU_SERIAL_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfuMsisdnNo", /* PK attribute */
		"PFU_MSISDN_NO = ? ")
				.addFilterBy("filterByPfuMsisdnNoMatch", "PFU_MSISDN_NO LIKE ?")
				.addFilterBy("INPfuMsisdnNo", "PFU_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINPfuMsisdnNo", "PFU_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfuMsisdnNo", "PFU_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfuMsisdnNo",
						"(PFU_MSISDN_NO IS NULL OR LENGTH(PFU_MSISDN_NO) IS NULL OR LENGTH(PFU_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfuMsisdnNo",
						"PFU_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfuMsisdnNo", "PFU_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfuMsisdnNo", "PFU_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfuMsisdnNoMatch",
						"PFU_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfuMsisdnNo",
						"(PFU_MSISDN_NO = ? OR PFU_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuMsisdnNo asc", "PFU_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfuMsisdnNo desc", "PFU_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfuFolderId", /* PK attribute */
		"PFU_FOLDER_ID = ? ")
				.addFilterBy("filterByPfuFolderIdMatch", "PFU_FOLDER_ID LIKE ?")
				.addFilterBy("INPfuFolderId", "PFU_FOLDER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPfuFolderId", "PFU_FOLDER_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfuFolderId", "PFU_FOLDER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfuFolderId",
						"(PFU_FOLDER_ID IS NULL OR LENGTH(PFU_FOLDER_ID) IS NULL OR LENGTH(PFU_FOLDER_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfuFolderId",
						"PFU_FOLDER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfuFolderId", "PFU_FOLDER_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfuFolderId", "PFU_FOLDER_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfuFolderIdMatch",
						"PFU_FOLDER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfuFolderId",
						"(PFU_FOLDER_ID = ? OR PFU_FOLDER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuFolderId asc", "PFU_FOLDER_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfuFolderId desc", "PFU_FOLDER_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfuUsage", /* PK attribute */
		"PFU_USAGE = ? ")
				.addFilterBy("filterByPfuUsageMatch", "PFU_USAGE LIKE ?")
				.addFilterBy("INPfuUsage", "PFU_USAGE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfuUsage", "PFU_USAGE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfuUsage", "PFU_USAGE != ?")
				// NOTEQUAL

				.addFilterBy("nullPfuUsage",
						"(PFU_USAGE IS NULL OR LENGTH(PFU_USAGE) IS NULL OR LENGTH(PFU_USAGE) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPfuUsage", "PFU_USAGE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanPfuUsage", "PFU_USAGE < ? ") // LESS THAN

				.addFilterBy("greaterthanPfuUsage", "PFU_USAGE > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByPfuUsageMatch", "PFU_USAGE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullPfuUsage",
						"(PFU_USAGE = ? OR PFU_USAGE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuUsage asc", "PFU_USAGE ASC ") // ORDER ASCENDING

				.addOrderBy("PfuUsage desc", "PFU_USAGE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalPfuUsageDate", /* PK attribute */
		"PFU_USAGE_DATE = ? ")
				.addFilterBy("filterByPfuUsageDateMatch",
						"PFU_USAGE_DATE LIKE ?")
				.addFilterBy("INPfuUsageDate", "PFU_USAGE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPfuUsageDate", "PFU_USAGE_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalPfuUsageDate", "PFU_USAGE_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfuUsageDate",
						"(PFU_USAGE_DATE IS NULL OR LENGTH(PFU_USAGE_DATE) IS NULL OR LENGTH(PFU_USAGE_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfuUsageDate",
						"PFU_USAGE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfuUsageDate", "PFU_USAGE_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfuUsageDate", "PFU_USAGE_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfuUsageDateMatch",
						"PFU_USAGE_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfuUsageDate",
						"(PFU_USAGE_DATE = ? OR PFU_USAGE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuUsageDate asc", "PFU_USAGE_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfuUsageDate desc", "PFU_USAGE_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPfuStatus", /* PK attribute */
		"PFU_STATUS = ? ")
				.addFilterBy("filterByPfuStatusMatch", "PFU_STATUS LIKE ?")
				.addFilterBy("INPfuStatus", "PFU_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfuStatus", "PFU_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfuStatus", "PFU_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullPfuStatus",
						"(PFU_STATUS IS NULL OR LENGTH(PFU_STATUS) IS NULL OR LENGTH(PFU_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPfuStatus", "PFU_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPfuStatus", "PFU_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPfuStatus", "PFU_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByPfuStatusMatch", "PFU_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPfuStatus",
						"(PFU_STATUS = ? OR PFU_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuStatus asc", "PFU_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("PfuStatus desc", "PFU_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPfuComments", /* PK attribute */
		"PFU_COMMENTS = ? ")
				.addFilterBy("filterByPfuCommentsMatch", "PFU_COMMENTS LIKE ?")
				.addFilterBy("INPfuComments", "PFU_COMMENTS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfuComments", "PFU_COMMENTS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfuComments", "PFU_COMMENTS != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPfuComments",
						"(PFU_COMMENTS IS NULL OR LENGTH(PFU_COMMENTS) IS NULL OR LENGTH(PFU_COMMENTS) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPfuComments", "PFU_COMMENTS IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanPfuComments", "PFU_COMMENTS < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfuComments", "PFU_COMMENTS > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPfuCommentsMatch", "PFU_COMMENTS LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullPfuComments",
						"(PFU_COMMENTS = ? OR PFU_COMMENTS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuComments asc", "PFU_COMMENTS ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PfuComments desc", "PFU_COMMENTS DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfuXdrDate", /* PK attribute */
		"PFU_XDR_DATE = ? ")
				.addFilterBy("filterByPfuXdrDateMatch", "PFU_XDR_DATE LIKE ?")
				.addFilterBy("INPfuXdrDate", "PFU_XDR_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfuXdrDate", "PFU_XDR_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfuXdrDate", "PFU_XDR_DATE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPfuXdrDate",
						"(PFU_XDR_DATE IS NULL OR LENGTH(PFU_XDR_DATE) IS NULL OR LENGTH(PFU_XDR_DATE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPfuXdrDate", "PFU_XDR_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPfuXdrDate", "PFU_XDR_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPfuXdrDate", "PFU_XDR_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPfuXdrDateMatch", "PFU_XDR_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPfuXdrDate",
						"(PFU_XDR_DATE = ? OR PFU_XDR_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuXdrDate asc", "PFU_XDR_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PfuXdrDate desc", "PFU_XDR_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfuProcessDate", /* PK attribute */
		"PFU_PROCESS_DATE = ? ")
				.addFilterBy("filterByPfuProcessDateMatch",
						"PFU_PROCESS_DATE LIKE ?")
				.addFilterBy("INPfuProcessDate", "PFU_PROCESS_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPfuProcessDate",
						"PFU_PROCESS_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPfuProcessDate", "PFU_PROCESS_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfuProcessDate",
						"(PFU_PROCESS_DATE IS NULL OR LENGTH(PFU_PROCESS_DATE) IS NULL OR LENGTH(PFU_PROCESS_DATE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullPfuProcessDate",
						"PFU_PROCESS_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfuProcessDate", "PFU_PROCESS_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPfuProcessDate",
						"PFU_PROCESS_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByPfuProcessDateMatch",
						"PFU_PROCESS_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPfuProcessDate",
						"(PFU_PROCESS_DATE = ? OR PFU_PROCESS_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfuProcessDate asc", "PFU_PROCESS_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PfuProcessDate desc", "PFU_PROCESS_DATE DESC ") // ORDER
																				// DESCENDING
		;

	}
	
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PfuPocUsageDMLFactory();
		}

		return dml;
	}


}