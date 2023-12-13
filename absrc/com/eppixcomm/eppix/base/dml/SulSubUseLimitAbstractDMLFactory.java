package com.eppixcomm.eppix.base.dml;

public class SulSubUseLimitAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected SulSubUseLimitAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SulSubUseLimit", // DML Name
				"blo.SulSubUseLimitDMO", // dmoName
				"sul_sub_use_limit", // tableName
				5, // numColumns
				"SUL_SUBSCRIBER_ID, SUL_TYPE, SUL_START_DATE, SUL_END_DATE, SUL_VALUE", // columnList
				"", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SUL_SUBSCRIBER_ID, SUL_TYPE, SUL_START_DATE, SUL_END_DATE, SUL_VALUE",
				"", "", new String[] { "SUL_SUBSCRIBER_ID", "SUL_TYPE",
						"SUL_START_DATE", "SUL_END_DATE", "SUL_VALUE", }, false);
		table.addFilterBy("equalSulSubscriberId", /* PK attribute */
		"SUL_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySulSubscriberIdMatch",
						"SUL_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSulSubscriberId", "SUL_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSulSubscriberId",
						"SUL_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSulSubscriberId",
						"SUL_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSulSubscriberId",
						"(SUL_SUBSCRIBER_ID IS NULL OR LENGTH(SUL_SUBSCRIBER_ID) IS NULL OR LENGTH(SUL_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSulSubscriberId",
						"SUL_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSulSubscriberId",
						"SUL_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSulSubscriberId",
						"SUL_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySulSubscriberIdMatch",
						"SUL_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSulSubscriberId",
						"(SUL_SUBSCRIBER_ID = ? OR SUL_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SulSubscriberId asc", "SUL_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SulSubscriberId desc", "SUL_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSulType", /* PK attribute */
		"SUL_TYPE = ? ")
				.addFilterBy("filterBySulTypeMatch", "SUL_TYPE LIKE ?")
				.addFilterBy("INSulType", "SUL_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSulType", "SUL_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSulType", "SUL_TYPE != ?")
				// NOTEQUAL

				.addFilterBy("nullSulType",
						"(SUL_TYPE IS NULL OR LENGTH(SUL_TYPE) IS NULL OR LENGTH(SUL_TYPE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSulType", "SUL_TYPE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSulType", "SUL_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanSulType", "SUL_TYPE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterBySulTypeMatch", "SUL_TYPE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSulType",
						"(SUL_TYPE = ? OR SUL_TYPE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("SulType asc", "SUL_TYPE ASC ") // ORDER ASCENDING

				.addOrderBy("SulType desc", "SUL_TYPE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSulStartDate", /* PK attribute */
		"SUL_START_DATE = ? ")
				.addFilterBy("filterBySulStartDateMatch",
						"SUL_START_DATE LIKE ?")
				.addFilterBy("INSulStartDate", "SUL_START_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSulStartDate", "SUL_START_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSulStartDate", "SUL_START_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSulStartDate",
						"(SUL_START_DATE IS NULL OR LENGTH(SUL_START_DATE) IS NULL OR LENGTH(SUL_START_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSulStartDate",
						"SUL_START_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSulStartDate", "SUL_START_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSulStartDate", "SUL_START_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySulStartDateMatch",
						"SUL_START_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSulStartDate",
						"(SUL_START_DATE = ? OR SUL_START_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SulStartDate asc", "SUL_START_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SulStartDate desc", "SUL_START_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSulEndDate", /* PK attribute */
		"SUL_END_DATE = ? ")
				.addFilterBy("filterBySulEndDateMatch", "SUL_END_DATE LIKE ?")
				.addFilterBy("INSulEndDate", "SUL_END_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSulEndDate", "SUL_END_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSulEndDate", "SUL_END_DATE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSulEndDate",
						"(SUL_END_DATE IS NULL OR LENGTH(SUL_END_DATE) IS NULL OR LENGTH(SUL_END_DATE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSulEndDate", "SUL_END_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSulEndDate", "SUL_END_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSulEndDate", "SUL_END_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySulEndDateMatch", "SUL_END_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSulEndDate",
						"(SUL_END_DATE = ? OR SUL_END_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SulEndDate asc", "SUL_END_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SulEndDate desc", "SUL_END_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSulValue", /* PK attribute */
		"SUL_VALUE = ? ")
				.addFilterBy("filterBySulValueMatch", "SUL_VALUE LIKE ?")
				.addFilterBy("INSulValue", "SUL_VALUE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSulValue", "SUL_VALUE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSulValue", "SUL_VALUE != ?")
				// NOTEQUAL

				.addFilterBy("nullSulValue",
						"(SUL_VALUE IS NULL OR LENGTH(SUL_VALUE) IS NULL OR LENGTH(SUL_VALUE) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSulValue", "SUL_VALUE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSulValue", "SUL_VALUE < ? ") // LESS THAN

				.addFilterBy("greaterthanSulValue", "SUL_VALUE > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySulValueMatch", "SUL_VALUE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSulValue",
						"(SUL_VALUE = ? OR SUL_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SulValue asc", "SUL_VALUE ASC ") // ORDER ASCENDING

				.addOrderBy("SulValue desc", "SUL_VALUE DESC ") // ORDER
																// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SulSubUseLimitDMLFactory();
		}
		return dml;
	}
}