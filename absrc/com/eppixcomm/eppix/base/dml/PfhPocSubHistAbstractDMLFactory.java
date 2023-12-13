package com.eppixcomm.eppix.base.dml;

public class PfhPocSubHistAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected PfhPocSubHistAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"PfhPocSubHist", // DML Name
				"blo.PfhPocSubHistDMO", // dmoName
				"pfh_poc_sub_hist", // tableName
				8, // numColumns
				"PFH_SUBSCRIBER_ID, PFH_FIELD_ID, PFH_HIST_CODE, PFH_OLD_VALUE, PFH_NEW_VALUE, PFH_USER_ID, PFH_TERMINAL_ID, PFH_TIMESTAMP", // columnList
				"", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"PFH_SUBSCRIBER_ID, PFH_FIELD_ID, PFH_HIST_CODE, PFH_OLD_VALUE, PFH_NEW_VALUE, PFH_USER_ID, PFH_TERMINAL_ID, PFH_TIMESTAMP",
				"", "", new String[] { "PFH_SUBSCRIBER_ID", "PFH_FIELD_ID",
						"PFH_HIST_CODE", "PFH_OLD_VALUE", "PFH_NEW_VALUE",
						"PFH_USER_ID", "PFH_TERMINAL_ID", "PFH_TIMESTAMP", },
				false);
		table.addFilterBy("equalPfhSubscriberId", /* PK attribute */
		"PFH_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByPfhSubscriberIdMatch",
						"PFH_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INPfhSubscriberId", "PFH_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhSubscriberId",
						"PFH_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPfhSubscriberId",
						"PFH_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhSubscriberId",
						"(PFH_SUBSCRIBER_ID IS NULL OR LENGTH(PFH_SUBSCRIBER_ID) IS NULL OR LENGTH(PFH_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullPfhSubscriberId",
						"PFH_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhSubscriberId",
						"PFH_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanPfhSubscriberId",
						"PFH_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByPfhSubscriberIdMatch",
						"PFH_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPfhSubscriberId",
						"(PFH_SUBSCRIBER_ID = ? OR PFH_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhSubscriberId asc", "PFH_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PfhSubscriberId desc", "PFH_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPfhFieldId", /* PK attribute */
		"PFH_FIELD_ID = ? ")
				.addFilterBy("filterByPfhFieldIdMatch", "PFH_FIELD_ID LIKE ?")
				.addFilterBy("INPfhFieldId", "PFH_FIELD_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfhFieldId", "PFH_FIELD_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfhFieldId", "PFH_FIELD_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPfhFieldId",
						"(PFH_FIELD_ID IS NULL OR LENGTH(PFH_FIELD_ID) IS NULL OR LENGTH(PFH_FIELD_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPfhFieldId", "PFH_FIELD_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPfhFieldId", "PFH_FIELD_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPfhFieldId", "PFH_FIELD_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPfhFieldIdMatch", "PFH_FIELD_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPfhFieldId",
						"(PFH_FIELD_ID = ? OR PFH_FIELD_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhFieldId asc", "PFH_FIELD_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PfhFieldId desc", "PFH_FIELD_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfhHistCode", /* PK attribute */
		"PFH_HIST_CODE = ? ")
				.addFilterBy("filterByPfhHistCodeMatch", "PFH_HIST_CODE LIKE ?")
				.addFilterBy("INPfhHistCode", "PFH_HIST_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhHistCode", "PFH_HIST_CODE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfhHistCode", "PFH_HIST_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhHistCode",
						"(PFH_HIST_CODE IS NULL OR LENGTH(PFH_HIST_CODE) IS NULL OR LENGTH(PFH_HIST_CODE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfhHistCode",
						"PFH_HIST_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhHistCode", "PFH_HIST_CODE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfhHistCode", "PFH_HIST_CODE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfhHistCodeMatch",
						"PFH_HIST_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfhHistCode",
						"(PFH_HIST_CODE = ? OR PFH_HIST_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhHistCode asc", "PFH_HIST_CODE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfhHistCode desc", "PFH_HIST_CODE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfhOldValue", /* PK attribute */
		"PFH_OLD_VALUE = ? ")
				.addFilterBy("filterByPfhOldValueMatch", "PFH_OLD_VALUE LIKE ?")
				.addFilterBy("INPfhOldValue", "PFH_OLD_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhOldValue", "PFH_OLD_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfhOldValue", "PFH_OLD_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhOldValue",
						"(PFH_OLD_VALUE IS NULL OR LENGTH(PFH_OLD_VALUE) IS NULL OR LENGTH(PFH_OLD_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfhOldValue",
						"PFH_OLD_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhOldValue", "PFH_OLD_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfhOldValue", "PFH_OLD_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfhOldValueMatch",
						"PFH_OLD_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfhOldValue",
						"(PFH_OLD_VALUE = ? OR PFH_OLD_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhOldValue asc", "PFH_OLD_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfhOldValue desc", "PFH_OLD_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfhNewValue", /* PK attribute */
		"PFH_NEW_VALUE = ? ")
				.addFilterBy("filterByPfhNewValueMatch", "PFH_NEW_VALUE LIKE ?")
				.addFilterBy("INPfhNewValue", "PFH_NEW_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhNewValue", "PFH_NEW_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfhNewValue", "PFH_NEW_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhNewValue",
						"(PFH_NEW_VALUE IS NULL OR LENGTH(PFH_NEW_VALUE) IS NULL OR LENGTH(PFH_NEW_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfhNewValue",
						"PFH_NEW_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhNewValue", "PFH_NEW_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfhNewValue", "PFH_NEW_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfhNewValueMatch",
						"PFH_NEW_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfhNewValue",
						"(PFH_NEW_VALUE = ? OR PFH_NEW_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhNewValue asc", "PFH_NEW_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfhNewValue desc", "PFH_NEW_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPfhUserId", /* PK attribute */
		"PFH_USER_ID = ? ")
				.addFilterBy("filterByPfhUserIdMatch", "PFH_USER_ID LIKE ?")
				.addFilterBy("INPfhUserId", "PFH_USER_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPfhUserId", "PFH_USER_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPfhUserId", "PFH_USER_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPfhUserId",
						"(PFH_USER_ID IS NULL OR LENGTH(PFH_USER_ID) IS NULL OR LENGTH(PFH_USER_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullPfhUserId", "PFH_USER_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPfhUserId", "PFH_USER_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPfhUserId", "PFH_USER_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPfhUserIdMatch", "PFH_USER_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPfhUserId",
						"(PFH_USER_ID = ? OR PFH_USER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhUserId asc", "PFH_USER_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PfhUserId desc", "PFH_USER_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPfhTerminalId", /* PK attribute */
		"PFH_TERMINAL_ID = ? ")
				.addFilterBy("filterByPfhTerminalIdMatch",
						"PFH_TERMINAL_ID LIKE ?")
				.addFilterBy("INPfhTerminalId", "PFH_TERMINAL_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhTerminalId",
						"PFH_TERMINAL_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPfhTerminalId", "PFH_TERMINAL_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhTerminalId",
						"(PFH_TERMINAL_ID IS NULL OR LENGTH(PFH_TERMINAL_ID) IS NULL OR LENGTH(PFH_TERMINAL_ID) = 0)") // IS
																														// NULL

				.addFilterBy("notnullPfhTerminalId",
						"PFH_TERMINAL_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhTerminalId", "PFH_TERMINAL_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPfhTerminalId", "PFH_TERMINAL_ID > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByPfhTerminalIdMatch",
						"PFH_TERMINAL_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPfhTerminalId",
						"(PFH_TERMINAL_ID = ? OR PFH_TERMINAL_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhTerminalId asc", "PFH_TERMINAL_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PfhTerminalId desc", "PFH_TERMINAL_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPfhTimestamp", /* PK attribute */
		"PFH_TIMESTAMP = ? ")
				.addFilterBy("filterByPfhTimestampMatch",
						"PFH_TIMESTAMP LIKE ?")
				.addFilterBy("INPfhTimestamp", "PFH_TIMESTAMP IN ( ? ) ") // IN

				.addFilterBy("NOTINPfhTimestamp", "PFH_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPfhTimestamp", "PFH_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy(
						"nullPfhTimestamp",
						"(PFH_TIMESTAMP IS NULL OR LENGTH(PFH_TIMESTAMP) IS NULL OR LENGTH(PFH_TIMESTAMP) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPfhTimestamp",
						"PFH_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPfhTimestamp", "PFH_TIMESTAMP < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPfhTimestamp", "PFH_TIMESTAMP > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPfhTimestampMatch",
						"PFH_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPfhTimestamp",
						"(PFH_TIMESTAMP = ? OR PFH_TIMESTAMP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PfhTimestamp asc", "PFH_TIMESTAMP ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PfhTimestamp desc", "PFH_TIMESTAMP DESC ") // ORDER
																		// DESCENDING
		;

	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PfhPocSubHistDMLFactory();
		}

		return dml;
	}

}