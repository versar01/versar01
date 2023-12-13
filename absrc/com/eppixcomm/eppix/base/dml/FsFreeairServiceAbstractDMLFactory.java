package com.eppixcomm.eppix.base.dml;

public class FsFreeairServiceAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected FsFreeairServiceAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"FsFreeairService", // DML Name
				"blo.FsFreeairServiceDMO", // dmoName
				"fs_freeair_service", // tableName
				9, // numColumns
				"FS_SERVICE_CODE, FS_GROUP_ID, FS_FREE_SECONDS, FS_ACT_RULE, FS_DEACT_RULE, FS_AIR_LATE_CALL, FS_BILL_PERIOD_NO, FS_SHARE_TIME, FS_TAKE_TIME_OVER", // columnList
				"FS_SERVICE_CODE", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"FS_SERVICE_CODE, FS_GROUP_ID, FS_FREE_SECONDS, FS_ACT_RULE, FS_DEACT_RULE, FS_AIR_LATE_CALL, FS_BILL_PERIOD_NO, FS_SHARE_TIME, FS_TAKE_TIME_OVER",
				"", "", new String[] { "FS_SERVICE_CODE", "FS_GROUP_ID",
						"FS_FREE_SECONDS", "FS_ACT_RULE", "FS_DEACT_RULE",
						"FS_AIR_LATE_CALL", "FS_BILL_PERIOD_NO",
						"FS_SHARE_TIME", "FS_TAKE_TIME_OVER"}, true);
		table.addFilterBy("equalFsServiceCode", /* PK attribute */
		"FS_SERVICE_CODE = ? ")
				.addFilterBy("filterByFsServiceCodeMatch",
						"FS_SERVICE_CODE LIKE ?")
				.addFilterBy("INFsServiceCode", "FS_SERVICE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINFsServiceCode",
						"FS_SERVICE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFsServiceCode", "FS_SERVICE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsServiceCode",
						"(FS_SERVICE_CODE IS NULL OR LENGTH(FS_SERVICE_CODE) IS NULL OR LENGTH(FS_SERVICE_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullFsServiceCode",
						"FS_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsServiceCode", "FS_SERVICE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFsServiceCode", "FS_SERVICE_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByFsServiceCodeMatch",
						"FS_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFsServiceCode",
						"(FS_SERVICE_CODE = ? OR FS_SERVICE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsServiceCode asc", "FS_SERVICE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FsServiceCode desc", "FS_SERVICE_CODE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalFsGroupId", /* PK attribute */
		"FS_GROUP_ID = ? ")
				.addFilterBy("filterByFsGroupIdMatch", "FS_GROUP_ID LIKE ?")
				.addFilterBy("INFsGroupId", "FS_GROUP_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFsGroupId", "FS_GROUP_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFsGroupId", "FS_GROUP_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFsGroupId",
						"(FS_GROUP_ID IS NULL OR LENGTH(FS_GROUP_ID) IS NULL OR LENGTH(FS_GROUP_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullFsGroupId", "FS_GROUP_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFsGroupId", "FS_GROUP_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFsGroupId", "FS_GROUP_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFsGroupIdMatch", "FS_GROUP_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFsGroupId",
						"(FS_GROUP_ID = ? OR FS_GROUP_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsGroupId asc", "FS_GROUP_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FsGroupId desc", "FS_GROUP_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalFsFreeSeconds", /* PK attribute */
		"FS_FREE_SECONDS = ? ")
				.addFilterBy("filterByFsFreeSecondsMatch",
						"FS_FREE_SECONDS LIKE ?")
				.addFilterBy("INFsFreeSeconds", "FS_FREE_SECONDS IN ( ? ) ") // IN

				.addFilterBy("NOTINFsFreeSeconds",
						"FS_FREE_SECONDS NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFsFreeSeconds", "FS_FREE_SECONDS != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsFreeSeconds",
						"(FS_FREE_SECONDS IS NULL OR LENGTH(FS_FREE_SECONDS) IS NULL OR LENGTH(FS_FREE_SECONDS) = 0)") // IS
																														// NULL

				.addFilterBy("notnullFsFreeSeconds",
						"FS_FREE_SECONDS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsFreeSeconds", "FS_FREE_SECONDS < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFsFreeSeconds", "FS_FREE_SECONDS > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByFsFreeSecondsMatch",
						"FS_FREE_SECONDS LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFsFreeSeconds",
						"(FS_FREE_SECONDS = ? OR FS_FREE_SECONDS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsFreeSeconds asc", "FS_FREE_SECONDS ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FsFreeSeconds desc", "FS_FREE_SECONDS DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalFsActRule", /* PK attribute */
		"FS_ACT_RULE = ? ")
				.addFilterBy("filterByFsActRuleMatch", "FS_ACT_RULE LIKE ?")
				.addFilterBy("INFsActRule", "FS_ACT_RULE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFsActRule", "FS_ACT_RULE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFsActRule", "FS_ACT_RULE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFsActRule",
						"(FS_ACT_RULE IS NULL OR LENGTH(FS_ACT_RULE) IS NULL OR LENGTH(FS_ACT_RULE) = 0)") // IS
																											// NULL

				.addFilterBy("notnullFsActRule", "FS_ACT_RULE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFsActRule", "FS_ACT_RULE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFsActRule", "FS_ACT_RULE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFsActRuleMatch", "FS_ACT_RULE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFsActRule",
						"(FS_ACT_RULE = ? OR FS_ACT_RULE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsActRule asc", "FS_ACT_RULE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FsActRule desc", "FS_ACT_RULE DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalFsDeactRule", /* PK attribute */
		"FS_DEACT_RULE = ? ")
				.addFilterBy("filterByFsDeactRuleMatch", "FS_DEACT_RULE LIKE ?")
				.addFilterBy("INFsDeactRule", "FS_DEACT_RULE IN ( ? ) ") // IN

				.addFilterBy("NOTINFsDeactRule", "FS_DEACT_RULE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFsDeactRule", "FS_DEACT_RULE != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsDeactRule",
						"(FS_DEACT_RULE IS NULL OR LENGTH(FS_DEACT_RULE) IS NULL OR LENGTH(FS_DEACT_RULE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFsDeactRule",
						"FS_DEACT_RULE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsDeactRule", "FS_DEACT_RULE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFsDeactRule", "FS_DEACT_RULE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFsDeactRuleMatch",
						"FS_DEACT_RULE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFsDeactRule",
						"(FS_DEACT_RULE = ? OR FS_DEACT_RULE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsDeactRule asc", "FS_DEACT_RULE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FsDeactRule desc", "FS_DEACT_RULE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFsAirLateCall", /* PK attribute */
		"FS_AIR_LATE_CALL = ? ")
				.addFilterBy("filterByFsAirLateCallMatch",
						"FS_AIR_LATE_CALL LIKE ?")
				.addFilterBy("INFsAirLateCall", "FS_AIR_LATE_CALL IN ( ? ) ") // IN

				.addFilterBy("NOTINFsAirLateCall",
						"FS_AIR_LATE_CALL NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFsAirLateCall", "FS_AIR_LATE_CALL != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsAirLateCall",
						"(FS_AIR_LATE_CALL IS NULL OR LENGTH(FS_AIR_LATE_CALL) IS NULL OR LENGTH(FS_AIR_LATE_CALL) = 0)") // IS
																															// NULL

				.addFilterBy("notnullFsAirLateCall",
						"FS_AIR_LATE_CALL IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsAirLateCall", "FS_AIR_LATE_CALL < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFsAirLateCall",
						"FS_AIR_LATE_CALL > ? ") // GREATER THAN

				.addFilterBy("filterByFsAirLateCallMatch",
						"FS_AIR_LATE_CALL LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFsAirLateCall",
						"(FS_AIR_LATE_CALL = ? OR FS_AIR_LATE_CALL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsAirLateCall asc", "FS_AIR_LATE_CALL ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FsAirLateCall desc", "FS_AIR_LATE_CALL DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalFsBillPeriodNo", /* PK attribute */
		"FS_BILL_PERIOD_NO = ? ")
				.addFilterBy("filterByFsBillPeriodNoMatch",
						"FS_BILL_PERIOD_NO LIKE ?")
				.addFilterBy("INFsBillPeriodNo", "FS_BILL_PERIOD_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINFsBillPeriodNo",
						"FS_BILL_PERIOD_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFsBillPeriodNo", "FS_BILL_PERIOD_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsBillPeriodNo",
						"(FS_BILL_PERIOD_NO IS NULL OR LENGTH(FS_BILL_PERIOD_NO) IS NULL OR LENGTH(FS_BILL_PERIOD_NO) = 0)") // IS
																																// NULL

				.addFilterBy("notnullFsBillPeriodNo",
						"FS_BILL_PERIOD_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsBillPeriodNo", "FS_BILL_PERIOD_NO < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanFsBillPeriodNo",
						"FS_BILL_PERIOD_NO > ? ") // GREATER THAN

				.addFilterBy("filterByFsBillPeriodNoMatch",
						"FS_BILL_PERIOD_NO LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullFsBillPeriodNo",
						"(FS_BILL_PERIOD_NO = ? OR FS_BILL_PERIOD_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsBillPeriodNo asc", "FS_BILL_PERIOD_NO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FsBillPeriodNo desc", "FS_BILL_PERIOD_NO DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalFsShareTime", /* PK attribute */
		"FS_SHARE_TIME = ? ")
				.addFilterBy("filterByFsShareTimeMatch", "FS_SHARE_TIME LIKE ?")
				.addFilterBy("INFsShareTime", "FS_SHARE_TIME IN ( ? ) ") // IN

				.addFilterBy("NOTINFsShareTime", "FS_SHARE_TIME NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFsShareTime", "FS_SHARE_TIME != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsShareTime",
						"(FS_SHARE_TIME IS NULL OR LENGTH(FS_SHARE_TIME) IS NULL OR LENGTH(FS_SHARE_TIME) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFsShareTime",
						"FS_SHARE_TIME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsShareTime", "FS_SHARE_TIME < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFsShareTime", "FS_SHARE_TIME > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFsShareTimeMatch",
						"FS_SHARE_TIME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFsShareTime",
						"(FS_SHARE_TIME = ? OR FS_SHARE_TIME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsShareTime asc", "FS_SHARE_TIME ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FsShareTime desc", "FS_SHARE_TIME DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFsTakeTimeOver", /* PK attribute */
		"FS_TAKE_TIME_OVER = ? ")
				.addFilterBy("filterByFsTakeTimeOverMatch",
						"FS_TAKE_TIME_OVER LIKE ?")
				.addFilterBy("INFsTakeTimeOver", "FS_TAKE_TIME_OVER IN ( ? ) ") // IN

				.addFilterBy("NOTINFsTakeTimeOver",
						"FS_TAKE_TIME_OVER NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFsTakeTimeOver", "FS_TAKE_TIME_OVER != ?") // NOTEQUAL

				.addFilterBy(
						"nullFsTakeTimeOver",
						"(FS_TAKE_TIME_OVER IS NULL OR LENGTH(FS_TAKE_TIME_OVER) IS NULL OR LENGTH(FS_TAKE_TIME_OVER) = 0)") // IS
																																// NULL

				.addFilterBy("notnullFsTakeTimeOver",
						"FS_TAKE_TIME_OVER IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFsTakeTimeOver", "FS_TAKE_TIME_OVER < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanFsTakeTimeOver",
						"FS_TAKE_TIME_OVER > ? ") // GREATER THAN

				.addFilterBy("filterByFsTakeTimeOverMatch",
						"FS_TAKE_TIME_OVER LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullFsTakeTimeOver",
						"(FS_TAKE_TIME_OVER = ? OR FS_TAKE_TIME_OVER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FsTakeTimeOver asc", "FS_TAKE_TIME_OVER ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FsTakeTimeOver desc", "FS_TAKE_TIME_OVER DESC ") // ORDER
																				// DESCENDING
		;
	}
	
	public static DMLFactory getDMLFactory(  )
    throws DMLException {
    if ( dml == null ) {
      dml = new FsFreeairServiceDMLFactory(  );
    }

    return dml;
  }
}