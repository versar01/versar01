package com.eppixcomm.eppix.base.dml;

public class CrbaCustRiskAuxAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	  public static DMLFactory getDMLFactory(  )
			    throws DMLException {
			    if ( dml == null ) {
			      dml = new CrbaCustRiskAuxDMLFactory();
			    }

			    return dml;
			  }

	public CrbaCustRiskAuxAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"CrbaCustRiskAux", // DML Name
				"blo.CrbaCustRiskAuxDMO", // dmoName
				"crba_cust_risk_aux", // tableName
				14, // numColumns
				"CRBA_BILL_AC_NO, CRBA_ACC_DISC_VAL, CRBA_AUX_FLOAT_1, CRBA_AUX_FLOAT_2, CRBA_AUX_FLOAT_3, CRBA_AUX_INT_1, CRBA_AUX_INT_2, CRBA_AUX_INT_3, CRBA_AUX_CHAR_1, CRBA_AUX_CHAR_2, CRBA_AUX_CHAR_3, CRBA_AUX_DATE_1, CRBA_AUX_DATE_2, CRBA_AUX_DATE_3", // columnList
				"CRBA_BILL_AC_NO", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"CRBA_BILL_AC_NO, CRBA_ACC_DISC_VAL, CRBA_AUX_FLOAT_1, CRBA_AUX_FLOAT_2, CRBA_AUX_FLOAT_3, CRBA_AUX_INT_1, CRBA_AUX_INT_2, CRBA_AUX_INT_3, CRBA_AUX_CHAR_1, CRBA_AUX_CHAR_2, CRBA_AUX_CHAR_3, CRBA_AUX_DATE_1, CRBA_AUX_DATE_2, CRBA_AUX_DATE_3",
				"", "", new String[] { "CRBA_BILL_AC_NO", "CRBA_ACC_DISC_VAL",
						"CRBA_AUX_FLOAT_1", "CRBA_AUX_FLOAT_2",
						"CRBA_AUX_FLOAT_3", "CRBA_AUX_INT_1", "CRBA_AUX_INT_2",
						"CRBA_AUX_INT_3", "CRBA_AUX_CHAR_1", "CRBA_AUX_CHAR_2",
						"CRBA_AUX_CHAR_3", "CRBA_AUX_DATE_1",
						"CRBA_AUX_DATE_2", "CRBA_AUX_DATE_3", }, true);
		table.addFilterBy("equalCrbaBillAcNo", /* PK attribute */
		"CRBA_BILL_AC_NO = ? ")
				.addFilterBy("filterByCrbaBillAcNoMatch",
						"CRBA_BILL_AC_NO LIKE ?")
				.addFilterBy("INCrbaBillAcNo", "CRBA_BILL_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaBillAcNo",
						"CRBA_BILL_AC_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaBillAcNo", "CRBA_BILL_AC_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaBillAcNo",
						"(CRBA_BILL_AC_NO IS NULL OR LENGTH(CRBA_BILL_AC_NO) IS NULL OR LENGTH(CRBA_BILL_AC_NO) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaBillAcNo",
						"CRBA_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaBillAcNo", "CRBA_BILL_AC_NO < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaBillAcNo", "CRBA_BILL_AC_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaBillAcNoMatch",
						"CRBA_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaBillAcNo",
						"(CRBA_BILL_AC_NO = ? OR CRBA_BILL_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaBillAcNo asc", "CRBA_BILL_AC_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaBillAcNo desc", "CRBA_BILL_AC_NO DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAccDiscVal", /* PK attribute */
		"CRBA_ACC_DISC_VAL = ? ")
				.addFilterBy("filterByCrbaAccDiscValMatch",
						"CRBA_ACC_DISC_VAL LIKE ?")
				.addFilterBy("INCrbaAccDiscVal", "CRBA_ACC_DISC_VAL IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAccDiscVal",
						"CRBA_ACC_DISC_VAL NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAccDiscVal", "CRBA_ACC_DISC_VAL != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAccDiscVal",
						"(CRBA_ACC_DISC_VAL IS NULL OR LENGTH(CRBA_ACC_DISC_VAL) IS NULL OR LENGTH(CRBA_ACC_DISC_VAL) = 0)") // IS
																																// NULL

				.addFilterBy("notnullCrbaAccDiscVal",
						"CRBA_ACC_DISC_VAL IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAccDiscVal", "CRBA_ACC_DISC_VAL < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanCrbaAccDiscVal",
						"CRBA_ACC_DISC_VAL > ? ") // GREATER THAN

				.addFilterBy("filterByCrbaAccDiscValMatch",
						"CRBA_ACC_DISC_VAL LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAccDiscVal",
						"(CRBA_ACC_DISC_VAL = ? OR CRBA_ACC_DISC_VAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAccDiscVal asc", "CRBA_ACC_DISC_VAL ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("CrbaAccDiscVal desc", "CRBA_ACC_DISC_VAL DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxFloat1", /* PK attribute */
		"CRBA_AUX_FLOAT_1 = ? ")
				.addFilterBy("filterByCrbaAuxFloat1Match",
						"CRBA_AUX_FLOAT_1 LIKE ?")
				.addFilterBy("INCrbaAuxFloat1", "CRBA_AUX_FLOAT_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxFloat1",
						"CRBA_AUX_FLOAT_1 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxFloat1", "CRBA_AUX_FLOAT_1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxFloat1",
						"(CRBA_AUX_FLOAT_1 IS NULL OR LENGTH(CRBA_AUX_FLOAT_1) IS NULL OR LENGTH(CRBA_AUX_FLOAT_1) = 0)") // IS
																															// NULL

				.addFilterBy("notnullCrbaAuxFloat1",
						"CRBA_AUX_FLOAT_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxFloat1", "CRBA_AUX_FLOAT_1 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxFloat1",
						"CRBA_AUX_FLOAT_1 > ? ") // GREATER THAN

				.addFilterBy("filterByCrbaAuxFloat1Match",
						"CRBA_AUX_FLOAT_1 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxFloat1",
						"(CRBA_AUX_FLOAT_1 = ? OR CRBA_AUX_FLOAT_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxFloat1 asc", "CRBA_AUX_FLOAT_1 ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("CrbaAuxFloat1 desc", "CRBA_AUX_FLOAT_1 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxFloat2", /* PK attribute */
		"CRBA_AUX_FLOAT_2 = ? ")
				.addFilterBy("filterByCrbaAuxFloat2Match",
						"CRBA_AUX_FLOAT_2 LIKE ?")
				.addFilterBy("INCrbaAuxFloat2", "CRBA_AUX_FLOAT_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxFloat2",
						"CRBA_AUX_FLOAT_2 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxFloat2", "CRBA_AUX_FLOAT_2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxFloat2",
						"(CRBA_AUX_FLOAT_2 IS NULL OR LENGTH(CRBA_AUX_FLOAT_2) IS NULL OR LENGTH(CRBA_AUX_FLOAT_2) = 0)") // IS
																															// NULL

				.addFilterBy("notnullCrbaAuxFloat2",
						"CRBA_AUX_FLOAT_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxFloat2", "CRBA_AUX_FLOAT_2 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxFloat2",
						"CRBA_AUX_FLOAT_2 > ? ") // GREATER THAN

				.addFilterBy("filterByCrbaAuxFloat2Match",
						"CRBA_AUX_FLOAT_2 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxFloat2",
						"(CRBA_AUX_FLOAT_2 = ? OR CRBA_AUX_FLOAT_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxFloat2 asc", "CRBA_AUX_FLOAT_2 ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("CrbaAuxFloat2 desc", "CRBA_AUX_FLOAT_2 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxFloat3", /* PK attribute */
		"CRBA_AUX_FLOAT_3 = ? ")
				.addFilterBy("filterByCrbaAuxFloat3Match",
						"CRBA_AUX_FLOAT_3 LIKE ?")
				.addFilterBy("INCrbaAuxFloat3", "CRBA_AUX_FLOAT_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxFloat3",
						"CRBA_AUX_FLOAT_3 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxFloat3", "CRBA_AUX_FLOAT_3 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxFloat3",
						"(CRBA_AUX_FLOAT_3 IS NULL OR LENGTH(CRBA_AUX_FLOAT_3) IS NULL OR LENGTH(CRBA_AUX_FLOAT_3) = 0)") // IS
																															// NULL

				.addFilterBy("notnullCrbaAuxFloat3",
						"CRBA_AUX_FLOAT_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxFloat3", "CRBA_AUX_FLOAT_3 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxFloat3",
						"CRBA_AUX_FLOAT_3 > ? ") // GREATER THAN

				.addFilterBy("filterByCrbaAuxFloat3Match",
						"CRBA_AUX_FLOAT_3 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxFloat3",
						"(CRBA_AUX_FLOAT_3 = ? OR CRBA_AUX_FLOAT_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxFloat3 asc", "CRBA_AUX_FLOAT_3 ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("CrbaAuxFloat3 desc", "CRBA_AUX_FLOAT_3 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxInt1", /* PK attribute */
		"CRBA_AUX_INT_1 = ? ")
				.addFilterBy("filterByCrbaAuxInt1Match",
						"CRBA_AUX_INT_1 LIKE ?")
				.addFilterBy("INCrbaAuxInt1", "CRBA_AUX_INT_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxInt1", "CRBA_AUX_INT_1 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalCrbaAuxInt1", "CRBA_AUX_INT_1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxInt1",
						"(CRBA_AUX_INT_1 IS NULL OR LENGTH(CRBA_AUX_INT_1) IS NULL OR LENGTH(CRBA_AUX_INT_1) = 0)") // IS
																													// NULL

				.addFilterBy("notnullCrbaAuxInt1",
						"CRBA_AUX_INT_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxInt1", "CRBA_AUX_INT_1 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanCrbaAuxInt1", "CRBA_AUX_INT_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxInt1Match",
						"CRBA_AUX_INT_1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullCrbaAuxInt1",
						"(CRBA_AUX_INT_1 = ? OR CRBA_AUX_INT_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxInt1 asc", "CRBA_AUX_INT_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxInt1 desc", "CRBA_AUX_INT_1 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxInt2", /* PK attribute */
		"CRBA_AUX_INT_2 = ? ")
				.addFilterBy("filterByCrbaAuxInt2Match",
						"CRBA_AUX_INT_2 LIKE ?")
				.addFilterBy("INCrbaAuxInt2", "CRBA_AUX_INT_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxInt2", "CRBA_AUX_INT_2 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalCrbaAuxInt2", "CRBA_AUX_INT_2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxInt2",
						"(CRBA_AUX_INT_2 IS NULL OR LENGTH(CRBA_AUX_INT_2) IS NULL OR LENGTH(CRBA_AUX_INT_2) = 0)") // IS
																													// NULL

				.addFilterBy("notnullCrbaAuxInt2",
						"CRBA_AUX_INT_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxInt2", "CRBA_AUX_INT_2 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanCrbaAuxInt2", "CRBA_AUX_INT_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxInt2Match",
						"CRBA_AUX_INT_2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullCrbaAuxInt2",
						"(CRBA_AUX_INT_2 = ? OR CRBA_AUX_INT_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxInt2 asc", "CRBA_AUX_INT_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxInt2 desc", "CRBA_AUX_INT_2 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxInt3", /* PK attribute */
		"CRBA_AUX_INT_3 = ? ")
				.addFilterBy("filterByCrbaAuxInt3Match",
						"CRBA_AUX_INT_3 LIKE ?")
				.addFilterBy("INCrbaAuxInt3", "CRBA_AUX_INT_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxInt3", "CRBA_AUX_INT_3 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalCrbaAuxInt3", "CRBA_AUX_INT_3 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxInt3",
						"(CRBA_AUX_INT_3 IS NULL OR LENGTH(CRBA_AUX_INT_3) IS NULL OR LENGTH(CRBA_AUX_INT_3) = 0)") // IS
																													// NULL

				.addFilterBy("notnullCrbaAuxInt3",
						"CRBA_AUX_INT_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxInt3", "CRBA_AUX_INT_3 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanCrbaAuxInt3", "CRBA_AUX_INT_3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxInt3Match",
						"CRBA_AUX_INT_3 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullCrbaAuxInt3",
						"(CRBA_AUX_INT_3 = ? OR CRBA_AUX_INT_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxInt3 asc", "CRBA_AUX_INT_3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxInt3 desc", "CRBA_AUX_INT_3 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxChar1", /* PK attribute */
		"CRBA_AUX_CHAR_1 = ? ")
				.addFilterBy("filterByCrbaAuxChar1Match",
						"CRBA_AUX_CHAR_1 LIKE ?")
				.addFilterBy("INCrbaAuxChar1", "CRBA_AUX_CHAR_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxChar1",
						"CRBA_AUX_CHAR_1 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxChar1", "CRBA_AUX_CHAR_1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxChar1",
						"(CRBA_AUX_CHAR_1 IS NULL OR LENGTH(CRBA_AUX_CHAR_1) IS NULL OR LENGTH(CRBA_AUX_CHAR_1) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxChar1",
						"CRBA_AUX_CHAR_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxChar1", "CRBA_AUX_CHAR_1 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxChar1", "CRBA_AUX_CHAR_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxChar1Match",
						"CRBA_AUX_CHAR_1 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxChar1",
						"(CRBA_AUX_CHAR_1 = ? OR CRBA_AUX_CHAR_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxChar1 asc", "CRBA_AUX_CHAR_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxChar1 desc", "CRBA_AUX_CHAR_1 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxChar2", /* PK attribute */
		"CRBA_AUX_CHAR_2 = ? ")
				.addFilterBy("filterByCrbaAuxChar2Match",
						"CRBA_AUX_CHAR_2 LIKE ?")
				.addFilterBy("INCrbaAuxChar2", "CRBA_AUX_CHAR_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxChar2",
						"CRBA_AUX_CHAR_2 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxChar2", "CRBA_AUX_CHAR_2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxChar2",
						"(CRBA_AUX_CHAR_2 IS NULL OR LENGTH(CRBA_AUX_CHAR_2) IS NULL OR LENGTH(CRBA_AUX_CHAR_2) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxChar2",
						"CRBA_AUX_CHAR_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxChar2", "CRBA_AUX_CHAR_2 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxChar2", "CRBA_AUX_CHAR_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxChar2Match",
						"CRBA_AUX_CHAR_2 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxChar2",
						"(CRBA_AUX_CHAR_2 = ? OR CRBA_AUX_CHAR_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxChar2 asc", "CRBA_AUX_CHAR_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxChar2 desc", "CRBA_AUX_CHAR_2 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxChar3", /* PK attribute */
		"CRBA_AUX_CHAR_3 = ? ")
				.addFilterBy("filterByCrbaAuxChar3Match",
						"CRBA_AUX_CHAR_3 LIKE ?")
				.addFilterBy("INCrbaAuxChar3", "CRBA_AUX_CHAR_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxChar3",
						"CRBA_AUX_CHAR_3 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxChar3", "CRBA_AUX_CHAR_3 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxChar3",
						"(CRBA_AUX_CHAR_3 IS NULL OR LENGTH(CRBA_AUX_CHAR_3) IS NULL OR LENGTH(CRBA_AUX_CHAR_3) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxChar3",
						"CRBA_AUX_CHAR_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxChar3", "CRBA_AUX_CHAR_3 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxChar3", "CRBA_AUX_CHAR_3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxChar3Match",
						"CRBA_AUX_CHAR_3 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxChar3",
						"(CRBA_AUX_CHAR_3 = ? OR CRBA_AUX_CHAR_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxChar3 asc", "CRBA_AUX_CHAR_3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxChar3 desc", "CRBA_AUX_CHAR_3 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxDate1", /* PK attribute */
		"CRBA_AUX_DATE_1 = ? ")
				.addFilterBy("filterByCrbaAuxDate1Match",
						"CRBA_AUX_DATE_1 LIKE ?")
				.addFilterBy("INCrbaAuxDate1", "CRBA_AUX_DATE_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxDate1",
						"CRBA_AUX_DATE_1 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxDate1", "CRBA_AUX_DATE_1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxDate1",
						"(CRBA_AUX_DATE_1 IS NULL OR LENGTH(CRBA_AUX_DATE_1) IS NULL OR LENGTH(CRBA_AUX_DATE_1) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxDate1",
						"CRBA_AUX_DATE_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxDate1", "CRBA_AUX_DATE_1 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxDate1", "CRBA_AUX_DATE_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxDate1Match",
						"CRBA_AUX_DATE_1 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxDate1",
						"(CRBA_AUX_DATE_1 = ? OR CRBA_AUX_DATE_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxDate1 asc", "CRBA_AUX_DATE_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxDate1 desc", "CRBA_AUX_DATE_1 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxDate2", /* PK attribute */
		"CRBA_AUX_DATE_2 = ? ")
				.addFilterBy("filterByCrbaAuxDate2Match",
						"CRBA_AUX_DATE_2 LIKE ?")
				.addFilterBy("INCrbaAuxDate2", "CRBA_AUX_DATE_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxDate2",
						"CRBA_AUX_DATE_2 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxDate2", "CRBA_AUX_DATE_2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxDate2",
						"(CRBA_AUX_DATE_2 IS NULL OR LENGTH(CRBA_AUX_DATE_2) IS NULL OR LENGTH(CRBA_AUX_DATE_2) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxDate2",
						"CRBA_AUX_DATE_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxDate2", "CRBA_AUX_DATE_2 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxDate2", "CRBA_AUX_DATE_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxDate2Match",
						"CRBA_AUX_DATE_2 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxDate2",
						"(CRBA_AUX_DATE_2 = ? OR CRBA_AUX_DATE_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxDate2 asc", "CRBA_AUX_DATE_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxDate2 desc", "CRBA_AUX_DATE_2 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalCrbaAuxDate3", /* PK attribute */
		"CRBA_AUX_DATE_3 = ? ")
				.addFilterBy("filterByCrbaAuxDate3Match",
						"CRBA_AUX_DATE_3 LIKE ?")
				.addFilterBy("INCrbaAuxDate3", "CRBA_AUX_DATE_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINCrbaAuxDate3",
						"CRBA_AUX_DATE_3 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalCrbaAuxDate3", "CRBA_AUX_DATE_3 != ?") // NOTEQUAL

				.addFilterBy(
						"nullCrbaAuxDate3",
						"(CRBA_AUX_DATE_3 IS NULL OR LENGTH(CRBA_AUX_DATE_3) IS NULL OR LENGTH(CRBA_AUX_DATE_3) = 0)") // IS
																														// NULL

				.addFilterBy("notnullCrbaAuxDate3",
						"CRBA_AUX_DATE_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanCrbaAuxDate3", "CRBA_AUX_DATE_3 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanCrbaAuxDate3", "CRBA_AUX_DATE_3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByCrbaAuxDate3Match",
						"CRBA_AUX_DATE_3 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCrbaAuxDate3",
						"(CRBA_AUX_DATE_3 = ? OR CRBA_AUX_DATE_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("CrbaAuxDate3 asc", "CRBA_AUX_DATE_3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("CrbaAuxDate3 desc", "CRBA_AUX_DATE_3 DESC ") // ORDER
																			// DESCENDING
		;
	}

}