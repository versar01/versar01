package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.SbhsSplitBillHsDMLFactory;;

public class SbhsSplitBillHsAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	public SbhsSplitBillHsAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"SbhsSplitBillHs", // DML Name
				"blo.SbhsSplitBillHsDMO", // dmoName
				"sbhs_split_bill_hs", // tableName
				6, // numColumns
				"SBHS_SB_ID, SBHS_OLD_VAL, SBHS_NEW_VAL, SBHS_REASON, SBHS_DATE, SBHS_USER_ID", // columnList
				"", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SBHS_SB_ID, SBHS_OLD_VAL, SBHS_NEW_VAL, SBHS_REASON, SBHS_DATE, SBHS_USER_ID",
				"", "", new String[] { "SBHS_SB_ID", "SBHS_OLD_VAL",
						"SBHS_NEW_VAL", "SBHS_REASON", "SBHS_DATE",
						"SBHS_USER_ID" }, false);
		table.addFilterBy("equalSbhsSbId", /* PK attribute */
		"SBHS_SB_ID = ? ")
				.addFilterBy("filterBySbhsSbIdMatch", "SBHS_SB_ID LIKE ?")
				.addFilterBy("INSbhsSbId", "SBHS_SB_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsSbId", "SBHS_SB_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsSbId", "SBHS_SB_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullSbhsSbId",
						"(SBHS_SB_ID IS NULL OR LENGTH(SBHS_SB_ID) IS NULL OR LENGTH(SBHS_SB_ID) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbhsSbId", "SBHS_SB_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbhsSbId", "SBHS_SB_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhsSbId", "SBHS_SB_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbhsSbIdMatch", "SBHS_SB_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbhsSbId",
						"(SBHS_SB_ID = ? OR SBHS_SB_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsSbId asc", "SBHS_SB_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbhsSbId desc", "SBHS_SB_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbhsOldVal", /* PK attribute */
		"SBHS_OLD_VAL = ? ")
				.addFilterBy("filterBySbhsOldValMatch", "SBHS_OLD_VAL LIKE ?")
				.addFilterBy("INSbhsOldVal", "SBHS_OLD_VAL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsOldVal", "SBHS_OLD_VAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsOldVal", "SBHS_OLD_VAL != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbhsOldVal",
						"(SBHS_OLD_VAL IS NULL OR LENGTH(SBHS_OLD_VAL) IS NULL OR LENGTH(SBHS_OLD_VAL) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSbhsOldVal", "SBHS_OLD_VAL IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbhsOldVal", "SBHS_OLD_VAL < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbhsOldVal", "SBHS_OLD_VAL > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbhsOldValMatch", "SBHS_OLD_VAL LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbhsOldVal",
						"(SBHS_OLD_VAL = ? OR SBHS_OLD_VAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsOldVal asc", "SBHS_OLD_VAL ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbhsOldVal desc", "SBHS_OLD_VAL DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbhsNewVal", /* PK attribute */
		"SBHS_NEW_VAL = ? ")
				.addFilterBy("filterBySbhsNewValMatch", "SBHS_NEW_VAL LIKE ?")
				.addFilterBy("INSbhsNewVal", "SBHS_NEW_VAL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsNewVal", "SBHS_NEW_VAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsNewVal", "SBHS_NEW_VAL != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbhsNewVal",
						"(SBHS_NEW_VAL IS NULL OR LENGTH(SBHS_NEW_VAL) IS NULL OR LENGTH(SBHS_NEW_VAL) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSbhsNewVal", "SBHS_NEW_VAL IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbhsNewVal", "SBHS_NEW_VAL < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbhsNewVal", "SBHS_NEW_VAL > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbhsNewValMatch", "SBHS_NEW_VAL LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbhsNewVal",
						"(SBHS_NEW_VAL = ? OR SBHS_NEW_VAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsNewVal asc", "SBHS_NEW_VAL ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbhsNewVal desc", "SBHS_NEW_VAL DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbhsReason", /* PK attribute */
		"SBHS_REASON = ? ")
				.addFilterBy("filterBySbhsReasonMatch", "SBHS_REASON LIKE ?")
				.addFilterBy("INSbhsReason", "SBHS_REASON IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsReason", "SBHS_REASON NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsReason", "SBHS_REASON != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbhsReason",
						"(SBHS_REASON IS NULL OR LENGTH(SBHS_REASON) IS NULL OR LENGTH(SBHS_REASON) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbhsReason", "SBHS_REASON IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbhsReason", "SBHS_REASON < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbhsReason", "SBHS_REASON > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbhsReasonMatch", "SBHS_REASON LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbhsReason",
						"(SBHS_REASON = ? OR SBHS_REASON IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsReason asc", "SBHS_REASON ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbhsReason desc", "SBHS_REASON DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbhsDate", /* PK attribute */
		"SBHS_DATE = ? ")
				.addFilterBy("filterBySbhsDateMatch", "SBHS_DATE LIKE ?")
				.addFilterBy("INSbhsDate", "SBHS_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsDate", "SBHS_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsDate", "SBHS_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullSbhsDate",
						"(SBHS_DATE IS NULL OR LENGTH(SBHS_DATE) IS NULL OR LENGTH(SBHS_DATE) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbhsDate", "SBHS_DATE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbhsDate", "SBHS_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhsDate", "SBHS_DATE > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbhsDateMatch", "SBHS_DATE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbhsDate",
						"(SBHS_DATE = ? OR SBHS_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsDate asc", "SBHS_DATE ASC ") // ORDER ASCENDING

				.addOrderBy("SbhsDate desc", "SBHS_DATE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbhsUserId", /* PK attribute */
		"SBHS_USER_ID = ? ")
				.addFilterBy("filterBySbhsUserIdMatch", "SBHS_USER_ID LIKE ?")
				.addFilterBy("INSbhsUserId", "SBHS_USER_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhsUserId", "SBHS_USER_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhsUserId", "SBHS_USER_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbhsUserId",
						"(SBHS_USER_ID IS NULL OR LENGTH(SBHS_USER_ID) IS NULL OR LENGTH(SBHS_USER_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSbhsUserId", "SBHS_USER_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbhsUserId", "SBHS_USER_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbhsUserId", "SBHS_USER_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbhsUserIdMatch", "SBHS_USER_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbhsUserId",
						"(SBHS_USER_ID = ? OR SBHS_USER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhsUserId asc", "SBHS_USER_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbhsUserId desc", "SBHS_USER_ID DESC ") // ORDER
																		// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SbhsSplitBillHsDMLFactory();
		}

		return dml;
	}

}