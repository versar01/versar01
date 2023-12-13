package com.eppixcomm.eppix.base.dml;

public class FtFreeairTimeAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new EdfEnhancedDataFaxAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected FtFreeairTimeAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"FtFreeairTime", // DML Name
				"blo.FtFreeairTimeDMO", // dmoName
				"ft_freeair_time", // tableName
				14, // numColumns
				"FT_SUBSCRIBER_ID, FT_MSISDN_NO, FT_SIM_NO, FT_SERVICE_CODE, FT_DEACT_DATE, FT_TARPLAN_REF, FT_BILL_CYCLE, FT_CONT_START, FT_CONT_END, FT_ORIG_SECS, FT_PRD_START, FT_PRD_END, FT_SECS_REMAINING, FT_VALUE_USED", // columnList
				"FT_SUBSCRIBER_ID, FT_MSISDN_NO, FT_SERVICE_CODE", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"FT_SUBSCRIBER_ID, FT_MSISDN_NO, FT_SIM_NO, FT_SERVICE_CODE, FT_DEACT_DATE, FT_TARPLAN_REF, FT_BILL_CYCLE, FT_CONT_START, FT_CONT_END, FT_ORIG_SECS, FT_PRD_START, FT_PRD_END, FT_SECS_REMAINING, FT_VALUE_USED",
				"", "", new String[] { "FT_SUBSCRIBER_ID", "FT_MSISDN_NO",
						"FT_SIM_NO", "FT_SERVICE_CODE", "FT_DEACT_DATE",
						"FT_TARPLAN_REF", "FT_BILL_CYCLE", "FT_CONT_START",
						"FT_CONT_END", "FT_ORIG_SECS", "FT_PRD_START",
						"FT_PRD_END", "FT_SECS_REMAINING", "FT_VALUE_USED" },
				true);
		table.addFilterBy("equalFtSubscriberId", /* PK attribute */
		"FT_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByFtSubscriberIdMatch",
						"FT_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INFtSubscriberId", "FT_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINFtSubscriberId",
						"FT_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFtSubscriberId", "FT_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtSubscriberId",
						"(FT_SUBSCRIBER_ID IS NULL OR LENGTH(FT_SUBSCRIBER_ID) IS NULL OR LENGTH(FT_SUBSCRIBER_ID) = 0)") // IS
																															// NULL

				.addFilterBy("notnullFtSubscriberId",
						"FT_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtSubscriberId", "FT_SUBSCRIBER_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFtSubscriberId",
						"FT_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByFtSubscriberIdMatch",
						"FT_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFtSubscriberId",
						"(FT_SUBSCRIBER_ID = ? OR FT_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtSubscriberId asc", "FT_SUBSCRIBER_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FtSubscriberId desc", "FT_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalFtMsisdnNo", /* PK attribute */
		"FT_MSISDN_NO = ? ")
				.addFilterBy("filterByFtMsisdnNoMatch", "FT_MSISDN_NO LIKE ?")
				.addFilterBy("INFtMsisdnNo", "FT_MSISDN_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtMsisdnNo", "FT_MSISDN_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtMsisdnNo", "FT_MSISDN_NO != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFtMsisdnNo",
						"(FT_MSISDN_NO IS NULL OR LENGTH(FT_MSISDN_NO) IS NULL OR LENGTH(FT_MSISDN_NO) = 0)") // IS
																												// NULL

				.addFilterBy("notnullFtMsisdnNo", "FT_MSISDN_NO IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFtMsisdnNo", "FT_MSISDN_NO < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFtMsisdnNo", "FT_MSISDN_NO > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFtMsisdnNoMatch", "FT_MSISDN_NO LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFtMsisdnNo",
						"(FT_MSISDN_NO = ? OR FT_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtMsisdnNo asc", "FT_MSISDN_NO ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FtMsisdnNo desc", "FT_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtSimNo", /* PK attribute */
		"FT_SIM_NO = ? ")
				.addFilterBy("filterByFtSimNoMatch", "FT_SIM_NO LIKE ?")
				.addFilterBy("INFtSimNo", "FT_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtSimNo", "FT_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtSimNo", "FT_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullFtSimNo",
						"(FT_SIM_NO IS NULL OR LENGTH(FT_SIM_NO) IS NULL OR LENGTH(FT_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullFtSimNo", "FT_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanFtSimNo", "FT_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanFtSimNo", "FT_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByFtSimNoMatch", "FT_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullFtSimNo",
						"(FT_SIM_NO = ? OR FT_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtSimNo asc", "FT_SIM_NO ASC ") // ORDER ASCENDING

				.addOrderBy("FtSimNo desc", "FT_SIM_NO DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalFtServiceCode", /* PK attribute */
		"FT_SERVICE_CODE = ? ")
				.addFilterBy("filterByFtServiceCodeMatch",
						"FT_SERVICE_CODE LIKE ?")
				.addFilterBy("INFtServiceCode", "FT_SERVICE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINFtServiceCode",
						"FT_SERVICE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFtServiceCode", "FT_SERVICE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtServiceCode",
						"(FT_SERVICE_CODE IS NULL OR LENGTH(FT_SERVICE_CODE) IS NULL OR LENGTH(FT_SERVICE_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullFtServiceCode",
						"FT_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtServiceCode", "FT_SERVICE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanFtServiceCode", "FT_SERVICE_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByFtServiceCodeMatch",
						"FT_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullFtServiceCode",
						"(FT_SERVICE_CODE = ? OR FT_SERVICE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtServiceCode asc", "FT_SERVICE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("FtServiceCode desc", "FT_SERVICE_CODE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalFtDeactDate", /* PK attribute */
		"FT_DEACT_DATE = ? ")
				.addFilterBy("filterByFtDeactDateMatch", "FT_DEACT_DATE LIKE ?")
				.addFilterBy("INFtDeactDate", "FT_DEACT_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINFtDeactDate", "FT_DEACT_DATE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFtDeactDate", "FT_DEACT_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtDeactDate",
						"(FT_DEACT_DATE IS NULL OR LENGTH(FT_DEACT_DATE) IS NULL OR LENGTH(FT_DEACT_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFtDeactDate",
						"FT_DEACT_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtDeactDate", "FT_DEACT_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFtDeactDate", "FT_DEACT_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFtDeactDateMatch",
						"FT_DEACT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFtDeactDate",
						"(FT_DEACT_DATE = ? OR FT_DEACT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtDeactDate asc", "FT_DEACT_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FtDeactDate desc", "FT_DEACT_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtTarplanRef", /* PK attribute */
		"FT_TARPLAN_REF = ? ")
				.addFilterBy("filterByFtTarplanRefMatch",
						"FT_TARPLAN_REF LIKE ?")
				.addFilterBy("INFtTarplanRef", "FT_TARPLAN_REF IN ( ? ) ") // IN

				.addFilterBy("NOTINFtTarplanRef", "FT_TARPLAN_REF NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalFtTarplanRef", "FT_TARPLAN_REF != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtTarplanRef",
						"(FT_TARPLAN_REF IS NULL OR LENGTH(FT_TARPLAN_REF) IS NULL OR LENGTH(FT_TARPLAN_REF) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFtTarplanRef",
						"FT_TARPLAN_REF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtTarplanRef", "FT_TARPLAN_REF < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFtTarplanRef", "FT_TARPLAN_REF > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFtTarplanRefMatch",
						"FT_TARPLAN_REF LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFtTarplanRef",
						"(FT_TARPLAN_REF = ? OR FT_TARPLAN_REF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtTarplanRef asc", "FT_TARPLAN_REF ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FtTarplanRef desc", "FT_TARPLAN_REF DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalFtBillCycle", /* PK attribute */
		"FT_BILL_CYCLE = ? ")
				.addFilterBy("filterByFtBillCycleMatch", "FT_BILL_CYCLE LIKE ?")
				.addFilterBy("INFtBillCycle", "FT_BILL_CYCLE IN ( ? ) ") // IN

				.addFilterBy("NOTINFtBillCycle", "FT_BILL_CYCLE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFtBillCycle", "FT_BILL_CYCLE != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtBillCycle",
						"(FT_BILL_CYCLE IS NULL OR LENGTH(FT_BILL_CYCLE) IS NULL OR LENGTH(FT_BILL_CYCLE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFtBillCycle",
						"FT_BILL_CYCLE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtBillCycle", "FT_BILL_CYCLE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFtBillCycle", "FT_BILL_CYCLE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFtBillCycleMatch",
						"FT_BILL_CYCLE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFtBillCycle",
						"(FT_BILL_CYCLE = ? OR FT_BILL_CYCLE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtBillCycle asc", "FT_BILL_CYCLE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FtBillCycle desc", "FT_BILL_CYCLE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtContStart", /* PK attribute */
		"FT_CONT_START = ? ")
				.addFilterBy("filterByFtContStartMatch", "FT_CONT_START LIKE ?")
				.addFilterBy("INFtContStart", "FT_CONT_START IN ( ? ) ") // IN

				.addFilterBy("NOTINFtContStart", "FT_CONT_START NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFtContStart", "FT_CONT_START != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtContStart",
						"(FT_CONT_START IS NULL OR LENGTH(FT_CONT_START) IS NULL OR LENGTH(FT_CONT_START) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFtContStart",
						"FT_CONT_START IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtContStart", "FT_CONT_START < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFtContStart", "FT_CONT_START > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFtContStartMatch",
						"FT_CONT_START LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFtContStart",
						"(FT_CONT_START = ? OR FT_CONT_START IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtContStart asc", "FT_CONT_START ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FtContStart desc", "FT_CONT_START DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtContEnd", /* PK attribute */
		"FT_CONT_END = ? ")
				.addFilterBy("filterByFtContEndMatch", "FT_CONT_END LIKE ?")
				.addFilterBy("INFtContEnd", "FT_CONT_END IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtContEnd", "FT_CONT_END NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtContEnd", "FT_CONT_END != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFtContEnd",
						"(FT_CONT_END IS NULL OR LENGTH(FT_CONT_END) IS NULL OR LENGTH(FT_CONT_END) = 0)") // IS
																											// NULL

				.addFilterBy("notnullFtContEnd", "FT_CONT_END IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFtContEnd", "FT_CONT_END < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFtContEnd", "FT_CONT_END > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFtContEndMatch", "FT_CONT_END LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFtContEnd",
						"(FT_CONT_END = ? OR FT_CONT_END IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtContEnd asc", "FT_CONT_END ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FtContEnd desc", "FT_CONT_END DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalFtOrigSecs", /* PK attribute */
		"FT_ORIG_SECS = ? ")
				.addFilterBy("filterByFtOrigSecsMatch", "FT_ORIG_SECS LIKE ?")
				.addFilterBy("INFtOrigSecs", "FT_ORIG_SECS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtOrigSecs", "FT_ORIG_SECS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtOrigSecs", "FT_ORIG_SECS != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFtOrigSecs",
						"(FT_ORIG_SECS IS NULL OR LENGTH(FT_ORIG_SECS) IS NULL OR LENGTH(FT_ORIG_SECS) = 0)") // IS
																												// NULL

				.addFilterBy("notnullFtOrigSecs", "FT_ORIG_SECS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFtOrigSecs", "FT_ORIG_SECS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFtOrigSecs", "FT_ORIG_SECS > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFtOrigSecsMatch", "FT_ORIG_SECS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFtOrigSecs",
						"(FT_ORIG_SECS = ? OR FT_ORIG_SECS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtOrigSecs asc", "FT_ORIG_SECS ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FtOrigSecs desc", "FT_ORIG_SECS DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtPrdStart", /* PK attribute */
		"FT_PRD_START = ? ")
				.addFilterBy("filterByFtPrdStartMatch", "FT_PRD_START LIKE ?")
				.addFilterBy("INFtPrdStart", "FT_PRD_START IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtPrdStart", "FT_PRD_START NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtPrdStart", "FT_PRD_START != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullFtPrdStart",
						"(FT_PRD_START IS NULL OR LENGTH(FT_PRD_START) IS NULL OR LENGTH(FT_PRD_START) = 0)") // IS
																												// NULL

				.addFilterBy("notnullFtPrdStart", "FT_PRD_START IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanFtPrdStart", "FT_PRD_START < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanFtPrdStart", "FT_PRD_START > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByFtPrdStartMatch", "FT_PRD_START LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullFtPrdStart",
						"(FT_PRD_START = ? OR FT_PRD_START IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtPrdStart asc", "FT_PRD_START ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("FtPrdStart desc", "FT_PRD_START DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalFtPrdEnd", /* PK attribute */
		"FT_PRD_END = ? ")
				.addFilterBy("filterByFtPrdEndMatch", "FT_PRD_END LIKE ?")
				.addFilterBy("INFtPrdEnd", "FT_PRD_END IN ( ? ) ")
				// IN

				.addFilterBy("NOTINFtPrdEnd", "FT_PRD_END NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalFtPrdEnd", "FT_PRD_END != ?")
				// NOTEQUAL

				.addFilterBy("nullFtPrdEnd",
						"(FT_PRD_END IS NULL OR LENGTH(FT_PRD_END) IS NULL OR LENGTH(FT_PRD_END) = 0)") // IS
																										// NULL

				.addFilterBy("notnullFtPrdEnd", "FT_PRD_END IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanFtPrdEnd", "FT_PRD_END < ? ") // LESS THAN

				.addFilterBy("greaterthanFtPrdEnd", "FT_PRD_END > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByFtPrdEndMatch", "FT_PRD_END LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullFtPrdEnd",
						"(FT_PRD_END = ? OR FT_PRD_END IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtPrdEnd asc", "FT_PRD_END ASC ") // ORDER
																// ASCENDING

				.addOrderBy("FtPrdEnd desc", "FT_PRD_END DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalFtSecsRemaining", /* PK attribute */
		"FT_SECS_REMAINING = ? ")
				.addFilterBy("filterByFtSecsRemainingMatch",
						"FT_SECS_REMAINING LIKE ?")
				.addFilterBy("INFtSecsRemaining", "FT_SECS_REMAINING IN ( ? ) ") // IN

				.addFilterBy("NOTINFtSecsRemaining",
						"FT_SECS_REMAINING NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalFtSecsRemaining",
						"FT_SECS_REMAINING != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtSecsRemaining",
						"(FT_SECS_REMAINING IS NULL OR LENGTH(FT_SECS_REMAINING) IS NULL OR LENGTH(FT_SECS_REMAINING) = 0)") // IS
																																// NULL

				.addFilterBy("notnullFtSecsRemaining",
						"FT_SECS_REMAINING IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtSecsRemaining",
						"FT_SECS_REMAINING < ? ") // LESS THAN

				.addFilterBy("greaterthanFtSecsRemaining",
						"FT_SECS_REMAINING > ? ") // GREATER THAN

				.addFilterBy("filterByFtSecsRemainingMatch",
						"FT_SECS_REMAINING LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullFtSecsRemaining",
						"(FT_SECS_REMAINING = ? OR FT_SECS_REMAINING IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtSecsRemaining asc", "FT_SECS_REMAINING ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("FtSecsRemaining desc", "FT_SECS_REMAINING DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalFtValueUsed", /* PK attribute */
		"FT_VALUE_USED = ? ")
				.addFilterBy("filterByFtValueUsedMatch", "FT_VALUE_USED LIKE ?")
				.addFilterBy("INFtValueUsed", "FT_VALUE_USED IN ( ? ) ") // IN

				.addFilterBy("NOTINFtValueUsed", "FT_VALUE_USED NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalFtValueUsed", "FT_VALUE_USED != ?") // NOTEQUAL

				.addFilterBy(
						"nullFtValueUsed",
						"(FT_VALUE_USED IS NULL OR LENGTH(FT_VALUE_USED) IS NULL OR LENGTH(FT_VALUE_USED) = 0)") // IS
																													// NULL

				.addFilterBy("notnullFtValueUsed",
						"FT_VALUE_USED IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanFtValueUsed", "FT_VALUE_USED < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanFtValueUsed", "FT_VALUE_USED > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByFtValueUsedMatch",
						"FT_VALUE_USED LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullFtValueUsed",
						"(FT_VALUE_USED = ? OR FT_VALUE_USED IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("FtValueUsed asc", "FT_VALUE_USED ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("FtValueUsed desc", "FT_VALUE_USED DESC ") // ORDER
																		// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new FtFreeairTimeDMLFactory();
		}

		return dml;
	}

}