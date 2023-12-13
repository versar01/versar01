package com.eppixcomm.eppix.base.dml;

public class VriVrRegInfoAbstractDMLFactory extends BaseDMLFactory {

	protected VriVrRegInfoAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"VriVrRegInfo", // DML Name
				"blo.VriVrRegInfoDMO", // dmoName
				"vri_vr_reg_info", // tableName
				8, // numColumns
				"VRI_ID, VRI_VRA_ID, VRI_MSISDN_NO, VRI_LEVEL, VRI_PROVIDER, VRI_ONCE_OFF_LIMIT, VRI_RECUR_LIMIT, VRI_LIMIT_TYPE ", // columnList
				"VRI_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"VRI_ID, VRI_VRA_ID, VRI_MSISDN_NO, VRI_LEVEL, VRI_PROVIDER, VRI_ONCE_OFF_LIMIT, VRI_RECUR_LIMIT, VRI_LIMIT_TYPE ",
				"", "", new String[] { "VRI_ID", "VRI_VRA_ID", "VRI_MSISDN_NO",
						"VRI_LEVEL", "VRI_PROVIDER", "VRI_ONCE_OFF_LIMIT",
						"VRI_RECUR_LIMIT", "VRI_LIMIT_TYPE"}, true);
		table.addFilterBy("equalVriId", /* PK attribute */
		"VRI_ID = ? ")
				.addFilterBy("filterByVriIdMatch", "VRI_ID LIKE ?")
				.addFilterBy("INVriId", "VRI_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVriId", "VRI_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVriId", "VRI_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVriId",
						"(VRI_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullVriId", "VRI_ID IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanVriId", "VRI_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVriId", "VRI_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVriIdMatch", "VRI_ID LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullVriId",
						"(VRI_ID = ? OR VRI_ID IS NULL) ") // EQUALORNULL
															// TODO : we may
															// need to wrap this
															// with a TRIM()

				.addOrderBy("VriId asc", "VRI_ID ASC ") // ORDER ASCENDING

				.addOrderBy("VriId desc", "VRI_ID DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalVriVraId", /* PK attribute */
		"VRI_VRA_ID = ? ")
				.addFilterBy("filterByVriVraIdMatch", "VRI_VRA_ID LIKE ?")
				.addFilterBy("INVriVraId", "VRI_VRA_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVriVraId", "VRI_VRA_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVriVraId", "VRI_VRA_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVriVraId",
						"(VRI_VRA_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVriVraId", "VRI_VRA_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVriVraId", "VRI_VRA_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVriVraId", "VRI_VRA_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVriVraIdMatch", "VRI_VRA_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVriVraId",
						"(VRI_VRA_ID = ? OR VRI_VRA_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriVraId asc", "VRI_VRA_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VriVraId desc", "VRI_VRA_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVriMsisdnNo", /* PK attribute */
		"VRI_MSISDN_NO = ? ")
				.addFilterBy("filterByVriMsisdnNoMatch", "VRI_MSISDN_NO LIKE ?")
				.addFilterBy("INVriMsisdnNo", "VRI_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINVriMsisdnNo", "VRI_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVriMsisdnNo", "VRI_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy("nullVriMsisdnNo",
						"(VRI_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVriMsisdnNo",
						"VRI_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVriMsisdnNo", "VRI_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVriMsisdnNo", "VRI_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVriMsisdnNoMatch",
						"VRI_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVriMsisdnNo",
						"(VRI_MSISDN_NO = ? OR VRI_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriMsisdnNo asc", "VRI_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VriMsisdnNo desc", "VRI_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVriLevel", /* PK attribute */
		"VRI_LEVEL = ? ")
				.addFilterBy("filterByVriLevelMatch", "VRI_LEVEL LIKE ?")
				.addFilterBy("INVriLevel", "VRI_LEVEL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVriLevel", "VRI_LEVEL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVriLevel", "VRI_LEVEL != ?")
				// NOTEQUAL

				.addFilterBy("nullVriLevel",
						"(VRI_LEVEL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVriLevel", "VRI_LEVEL IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVriLevel", "VRI_LEVEL < ? ") // LESS THAN

				.addFilterBy("greaterthanVriLevel", "VRI_LEVEL > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVriLevelMatch", "VRI_LEVEL LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVriLevel",
						"(VRI_LEVEL = ? OR VRI_LEVEL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriLevel asc", "VRI_LEVEL ASC ") // ORDER ASCENDING

				.addOrderBy("VriLevel desc", "VRI_LEVEL DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalVriProvider", /* PK attribute */
		"VRI_PROVIDER = ? ")
				.addFilterBy("filterByVriProviderMatch", "VRI_PROVIDER LIKE ?")
				.addFilterBy("INVriProvider", "VRI_PROVIDER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVriProvider", "VRI_PROVIDER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVriProvider", "VRI_PROVIDER != ?")
				// NOTEQUAL

				.addFilterBy("nullVriProvider",
						"(VRI_PROVIDER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVriProvider", "VRI_PROVIDER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVriProvider", "VRI_PROVIDER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVriProvider", "VRI_PROVIDER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVriProviderMatch", "VRI_PROVIDER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVriProvider",
						"(VRI_PROVIDER = ? OR VRI_PROVIDER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriProvider asc", "VRI_PROVIDER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VriProvider desc", "VRI_PROVIDER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVriOnceOffLimit", /* PK attribute */
		"VRI_ONCE_OFF_LIMIT = ? ")
				.addFilterBy("filterByVriOnceOffLimitMatch",
						"VRI_ONCE_OFF_LIMIT LIKE ?")
				.addFilterBy("INVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT IN ( ? ) ") // IN

				.addFilterBy("NOTINVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT != ?") // NOTEQUAL

				.addFilterBy("nullVriOnceOffLimit",
						"(VRI_ONCE_OFF_LIMIT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT < ? ") // LESS THAN

				.addFilterBy("greaterthanVriOnceOffLimit",
						"VRI_ONCE_OFF_LIMIT > ? ") // GREATER THAN

				.addFilterBy("filterByVriOnceOffLimitMatch",
						"VRI_ONCE_OFF_LIMIT LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVriOnceOffLimit",
						"(VRI_ONCE_OFF_LIMIT = ? OR VRI_ONCE_OFF_LIMIT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriOnceOffLimit asc", "VRI_ONCE_OFF_LIMIT ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VriOnceOffLimit desc", "VRI_ONCE_OFF_LIMIT DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVriRecurLimit", /* PK attribute */
		"VRI_RECUR_LIMIT = ? ")
				.addFilterBy("filterByVriRecurLimitMatch",
						"VRI_RECUR_LIMIT LIKE ?")
				.addFilterBy("INVriRecurLimit", "VRI_RECUR_LIMIT IN ( ? ) ") // IN

				.addFilterBy("NOTINVriRecurLimit",
						"VRI_RECUR_LIMIT NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVriRecurLimit", "VRI_RECUR_LIMIT != ?") // NOTEQUAL

				.addFilterBy("nullVriRecurLimit",
						"(VRI_RECUR_LIMIT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVriRecurLimit",
						"VRI_RECUR_LIMIT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVriRecurLimit", "VRI_RECUR_LIMIT < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVriRecurLimit", "VRI_RECUR_LIMIT > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByVriRecurLimitMatch",
						"VRI_RECUR_LIMIT LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVriRecurLimit",
						"(VRI_RECUR_LIMIT = ? OR VRI_RECUR_LIMIT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriRecurLimit asc", "VRI_RECUR_LIMIT ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VriRecurLimit desc", "VRI_RECUR_LIMIT DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVriLimitType", /* PK attribute */
		"VRI_LIMIT_TYPE = ? ")
				.addFilterBy("filterByVriLimitTypeMatch",
						"VRI_LIMIT_TYPE LIKE ?")
				.addFilterBy("INVriLimitType", "VRI_LIMIT_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINVriLimitType", "VRI_LIMIT_TYPE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalVriLimitType", "VRI_LIMIT_TYPE != ?") // NOTEQUAL

				.addFilterBy("nullVriLimitType",
						"(VRI_LIMIT_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVriLimitType",
						"VRI_LIMIT_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVriLimitType", "VRI_LIMIT_TYPE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVriLimitType", "VRI_LIMIT_TYPE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVriLimitTypeMatch",
						"VRI_LIMIT_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVriLimitType",
						"(VRI_LIMIT_TYPE = ? OR VRI_LIMIT_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VriLimitType asc", "VRI_LIMIT_TYPE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VriLimitType desc", "VRI_LIMIT_TYPE DESC ") // ORDER
																			// DESCENDING
		;

	}

}