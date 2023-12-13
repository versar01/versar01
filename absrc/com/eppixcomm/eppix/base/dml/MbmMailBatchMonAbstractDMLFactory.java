package com.eppixcomm.eppix.base.dml;

public class MbmMailBatchMonAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;

	protected MbmMailBatchMonAbstractDMLFactory() throws DMLException {
		;
		DMLTable table = defTable(
				"MbmMailBatchMon", // DML Name
				"blo.MbmMailBatchMonDMO", // dmoName
				"mbm_mail_batch_mon", // tableName
				5, // numColumns
				"MBM_ID, MBM_PROGRAM_NAME, MBM_START_DATE, MBM_END_DATE, MBM_TIMESTAMP", // columnList
				"MBM_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"MBM_ID, MBM_PROGRAM_NAME, MBM_START_DATE, MBM_END_DATE, MBM_TIMESTAMP",
				"", "", new String[] { "MBM_ID", "MBM_PROGRAM_NAME",
						"MBM_START_DATE", "MBM_END_DATE", "MBM_TIMESTAMP", },
				true);
		table.addFilterBy("equalMbmId", /* PK attribute */
		"MBM_ID = ? ")
				.addFilterBy("filterByMbmIdMatch", "MBM_ID LIKE ?")
				.addFilterBy("INMbmId", "MBM_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMbmId", "MBM_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMbmId", "MBM_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullMbmId",
						"(MBM_ID IS NULL OR LENGTH(MBM_ID) IS NULL OR LENGTH(MBM_ID) = 0)") // IS
																							// NULL

				.addFilterBy("notnullMbmId", "MBM_ID IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanMbmId", "MBM_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanMbmId", "MBM_ID > ? ") // GREATER THAN

				.addFilterBy("filterByMbmIdMatch", "MBM_ID LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullMbmId",
						"(MBM_ID = ? OR MBM_ID IS NULL) ") // EQUALORNULL
															// TODO : we may
															// need to wrap this
															// with a TRIM()

				.addOrderBy("MbmId asc", "MBM_ID ASC ") // ORDER ASCENDING

				.addOrderBy("MbmId desc", "MBM_ID DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalMbmProgramName", /* PK attribute */
		"MBM_PROGRAM_NAME = ? ")
				.addFilterBy("filterByMbmProgramNameMatch",
						"MBM_PROGRAM_NAME LIKE ?")
				.addFilterBy("INMbmProgramName", "MBM_PROGRAM_NAME IN ( ? ) ") // IN

				.addFilterBy("NOTINMbmProgramName",
						"MBM_PROGRAM_NAME NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMbmProgramName", "MBM_PROGRAM_NAME != ?") // NOTEQUAL

				.addFilterBy(
						"nullMbmProgramName",
						"(MBM_PROGRAM_NAME IS NULL OR LENGTH(MBM_PROGRAM_NAME) IS NULL OR LENGTH(MBM_PROGRAM_NAME) = 0)") // IS
																															// NULL

				.addFilterBy("notnullMbmProgramName",
						"MBM_PROGRAM_NAME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMbmProgramName", "MBM_PROGRAM_NAME < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMbmProgramName",
						"MBM_PROGRAM_NAME > ? ") // GREATER THAN

				.addFilterBy("filterByMbmProgramNameMatch",
						"MBM_PROGRAM_NAME LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMbmProgramName",
						"(MBM_PROGRAM_NAME = ? OR MBM_PROGRAM_NAME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MbmProgramName asc", "MBM_PROGRAM_NAME ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("MbmProgramName desc", "MBM_PROGRAM_NAME DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalMbmStartDate", /* PK attribute */
		"MBM_START_DATE = ? ")
				.addFilterBy("filterByMbmStartDateMatch",
						"MBM_START_DATE LIKE ?")
				.addFilterBy("INMbmStartDate", "MBM_START_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINMbmStartDate", "MBM_START_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalMbmStartDate", "MBM_START_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullMbmStartDate",
						"(MBM_START_DATE IS NULL OR LENGTH(MBM_START_DATE) IS NULL OR LENGTH(MBM_START_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullMbmStartDate",
						"MBM_START_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMbmStartDate", "MBM_START_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMbmStartDate", "MBM_START_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMbmStartDateMatch",
						"MBM_START_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMbmStartDate",
						"(MBM_START_DATE = ? OR MBM_START_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MbmStartDate asc", "MBM_START_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MbmStartDate desc", "MBM_START_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMbmEndDate", /* PK attribute */
		"MBM_END_DATE = ? ")
				.addFilterBy("filterByMbmEndDateMatch", "MBM_END_DATE LIKE ?")
				.addFilterBy("INMbmEndDate", "MBM_END_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMbmEndDate", "MBM_END_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMbmEndDate", "MBM_END_DATE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullMbmEndDate",
						"(MBM_END_DATE IS NULL OR LENGTH(MBM_END_DATE) IS NULL OR LENGTH(MBM_END_DATE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullMbmEndDate", "MBM_END_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanMbmEndDate", "MBM_END_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanMbmEndDate", "MBM_END_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByMbmEndDateMatch", "MBM_END_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullMbmEndDate",
						"(MBM_END_DATE = ? OR MBM_END_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MbmEndDate asc", "MBM_END_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("MbmEndDate desc", "MBM_END_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMbmTimestamp", /* PK attribute */
		"MBM_TIMESTAMP = ? ")
				.addFilterBy("filterByMbmTimestampMatch",
						"MBM_TIMESTAMP LIKE ?")
				.addFilterBy("INMbmTimestamp", "MBM_TIMESTAMP IN ( ? ) ") // IN

				.addFilterBy("NOTINMbmTimestamp", "MBM_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMbmTimestamp", "MBM_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy(
						"nullMbmTimestamp",
						"(MBM_TIMESTAMP IS NULL OR LENGTH(MBM_TIMESTAMP) IS NULL OR LENGTH(MBM_TIMESTAMP) = 0)") // IS
																													// NULL

				.addFilterBy("notnullMbmTimestamp",
						"MBM_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMbmTimestamp", "MBM_TIMESTAMP < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMbmTimestamp", "MBM_TIMESTAMP > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMbmTimestampMatch",
						"MBM_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMbmTimestamp",
						"(MBM_TIMESTAMP = ? OR MBM_TIMESTAMP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MbmTimestamp asc", "MBM_TIMESTAMP ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MbmTimestamp desc", "MBM_TIMESTAMP DESC ") // ORDER
																		// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new MbmMailBatchMonDMLFactory();
		}

		return dml;

	}
}