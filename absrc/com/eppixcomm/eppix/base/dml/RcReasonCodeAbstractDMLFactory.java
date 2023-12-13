package com.eppixcomm.eppix.base.dml;

public class RcReasonCodeAbstractDMLFactory extends BaseDMLFactory {

	protected RcReasonCodeAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable("RcReasonCode", // DML Name
				"blo.RcReasonCodeDMO", // dmoName
				"rc_reason_code", // tableName
				3, // numColumns
				"RC_CODE, RC_TYPE, RC_DESC", // columnList
				"RC_CODE", // primaryKey
				"" // versionCol
				, false, // generatedKey
				"RC_CODE, RC_TYPE, RC_DESC", "", "", new String[] {
						"RC_CODE", "RC_TYPE", "RC_DESC" }, true);
		table.addFilterBy("equalRcCode", /* PK attribute */
		"RC_CODE = ? ")
				.addFilterBy("filterByRcCodeMatch", "RC_CODE LIKE ?")
				.addFilterBy("INRcCode", "RC_CODE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINRcCode", "RC_CODE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalRcCode", "RC_CODE != ?")
				// NOTEQUAL

				.addFilterBy("nullRcCode",
						"(RC_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullRcCode", "RC_CODE IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanRcCode", "RC_CODE < ? ") // LESS THAN

				.addFilterBy("greaterthanRcCode", "RC_CODE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByRcCodeMatch", "RC_CODE LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullRcCode",
						"(RC_CODE = ? OR RC_CODE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("RcCode asc", "RC_CODE ASC ") // ORDER ASCENDING

				.addOrderBy("RcCode desc", "RC_CODE DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalRcType", /* PK attribute */
		"RC_TYPE = ? ")
				.addFilterBy("filterByRcTypeMatch", "RC_TYPE LIKE ?")
				.addFilterBy("INRcType", "RC_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINRcType", "RC_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalRcType", "RC_TYPE != ?")
				// NOTEQUAL

				.addFilterBy("nullRcType",
						"(RC_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullRcType", "RC_TYPE IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanRcType", "RC_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanRcType", "RC_TYPE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByRcTypeMatch", "RC_TYPE LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullRcType",
						"(RC_TYPE = ? OR RC_TYPE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("RcType asc", "RC_TYPE ASC ") // ORDER ASCENDING

				.addOrderBy("RcType desc", "RC_TYPE DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalRcDesc", /* PK attribute */
		"RC_DESC = ? ")
				.addFilterBy("filterByRcDescMatch", "RC_DESC LIKE ?")
				.addFilterBy("INRcDesc", "RC_DESC IN ( ? ) ")
				// IN

				.addFilterBy("NOTINRcDesc", "RC_DESC NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalRcDesc", "RC_DESC != ?")
				// NOTEQUAL

				.addFilterBy("nullRcDesc",
						"(RC_DESC IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullRcDesc", "RC_DESC IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanRcDesc", "RC_DESC < ? ") // LESS THAN

				.addFilterBy("greaterthanRcDesc", "RC_DESC > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByRcDescMatch", "RC_DESC LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullRcDesc",
						"(RC_DESC = ? OR RC_DESC IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("RcDesc asc", "RC_DESC ASC ") // ORDER ASCENDING

				.addOrderBy("RcDesc desc", "RC_DESC DESC ") // ORDER DESCENDING
		;

	}

}