package com.eppixcomm.eppix.base.dml;

public class VraVrAccountAbstractDMLFactory extends BaseDMLFactory {

	protected VraVrAccountAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"VraVrAccount", // DML Name
				"blo.VraVrAccountDMO", // dmoName
				"vra_vr_account", // tableName
				4, // numColumns
				"VRA_ID, VRA_BILL_AC_NO, VRA_CAP_VALUE, VRA_ENABLED", // columnList
				"VRA_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"VRA_ID, VRA_BILL_AC_NO, VRA_CAP_VALUE, VRA_ENABLED", "", "",
				new String[] { "VRA_ID", "VRA_BILL_AC_NO", "VRA_CAP_VALUE",
						"VRA_ENABLED"}, true);
		table.addFilterBy("equalVraId", /* PK attribute */
		"VRA_ID = ? ")
				.addFilterBy("filterByVraIdMatch", "VRA_ID LIKE ?")
				.addFilterBy("INVraId", "VRA_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVraId", "VRA_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVraId", "VRA_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVraId",
						"(VRA_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullVraId", "VRA_ID IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanVraId", "VRA_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVraId", "VRA_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVraIdMatch", "VRA_ID LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullVraId",
						"(VRA_ID = ? OR VRA_ID IS NULL) ") // EQUALORNULL
															// TODO : we may
															// need to wrap this
															// with a TRIM()

				.addOrderBy("VraId asc", "VRA_ID ASC ") // ORDER ASCENDING

				.addOrderBy("VraId desc", "VRA_ID DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalVraBillAcNo", /* PK attribute */
		"VRA_BILL_AC_NO = ? ")
				.addFilterBy("filterByVraBillAcNoMatch",
						"VRA_BILL_AC_NO LIKE ?")
				.addFilterBy("INVraBillAcNo", "VRA_BILL_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINVraBillAcNo", "VRA_BILL_AC_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVraBillAcNo", "VRA_BILL_AC_NO != ?") // NOTEQUAL

				.addFilterBy("nullVraBillAcNo",
						"(VRA_BILL_AC_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVraBillAcNo",
						"VRA_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVraBillAcNo", "VRA_BILL_AC_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVraBillAcNo", "VRA_BILL_AC_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVraBillAcNoMatch",
						"VRA_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVraBillAcNo",
						"(VRA_BILL_AC_NO = ? OR VRA_BILL_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VraBillAcNo asc", "VRA_BILL_AC_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VraBillAcNo desc", "VRA_BILL_AC_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVraCapValue", /* PK attribute */
		"VRA_CAP_VALUE = ? ")
				.addFilterBy("filterByVraCapValueMatch", "VRA_CAP_VALUE LIKE ?")
				.addFilterBy("INVraCapValue", "VRA_CAP_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINVraCapValue", "VRA_CAP_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVraCapValue", "VRA_CAP_VALUE != ?") // NOTEQUAL

				.addFilterBy("nullVraCapValue",
						"(VRA_CAP_VALUE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVraCapValue",
						"VRA_CAP_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVraCapValue", "VRA_CAP_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVraCapValue", "VRA_CAP_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVraCapValueMatch",
						"VRA_CAP_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVraCapValue",
						"(VRA_CAP_VALUE = ? OR VRA_CAP_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VraCapValue asc", "VRA_CAP_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VraCapValue desc", "VRA_CAP_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVraEnabled", /* PK attribute */
		"VRA_ENABLED = ? ")
				.addFilterBy("filterByVraEnabledMatch", "VRA_ENABLED LIKE ?")
				.addFilterBy("INVraEnabled", "VRA_ENABLED IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVraEnabled", "VRA_ENABLED NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVraEnabled", "VRA_ENABLED != ?")
				// NOTEQUAL

				.addFilterBy("nullVraEnabled",
						"(VRA_ENABLED IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVraEnabled", "VRA_ENABLED IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVraEnabled", "VRA_ENABLED < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVraEnabled", "VRA_ENABLED > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVraEnabledMatch", "VRA_ENABLED LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVraEnabled",
						"(VRA_ENABLED = ? OR VRA_ENABLED IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VraEnabled asc", "VRA_ENABLED ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VraEnabled desc", "VRA_ENABLED DESC ") // ORDER
																	// DESCENDING
		;

	}
}