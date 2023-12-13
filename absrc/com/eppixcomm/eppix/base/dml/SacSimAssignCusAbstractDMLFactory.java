package com.eppixcomm.eppix.base.dml;

public class SacSimAssignCusAbstractDMLFactory extends BaseDMLFactory {
	
	private static DMLFactory dml = null;

	protected SacSimAssignCusAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable("SacSimAssignCus", // DML Name
				"blo.SacSimAssignCusDMO", // dmoName
				"sac_sim_assign_cus", // tableName
				2, // numColumns
				"SAC_BILL_AC_NO, SAC_SIM_NO", // columnList
				"SAC_BILL_AC_NO, SAC_SIM_NO", // primaryKey
				"" // versionCol
				, false, // generatedKey
				"SAC_BILL_AC_NO, SAC_SIM_NO ", "", "", new String[] {
						"SAC_BILL_AC_NO", "SAC_SIM_NO" }, true);
		table.addFilterBy("equalSacBillAcNo", /* PK attribute */
		"SAC_BILL_AC_NO = ? ")
				.addFilterBy("filterBySacBillAcNoMatch",
						"SAC_BILL_AC_NO LIKE ?")
				.addFilterBy("INSacBillAcNo", "SAC_BILL_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSacBillAcNo", "SAC_BILL_AC_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSacBillAcNo", "SAC_BILL_AC_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSacBillAcNo",
						"(SAC_BILL_AC_NO IS NULL OR LENGTH(SAC_BILL_AC_NO) IS NULL OR LENGTH(SAC_BILL_AC_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSacBillAcNo",
						"SAC_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSacBillAcNo", "SAC_BILL_AC_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSacBillAcNo", "SAC_BILL_AC_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySacBillAcNoMatch",
						"SAC_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSacBillAcNo",
						"(SAC_BILL_AC_NO = ? OR SAC_BILL_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SacBillAcNo asc", "SAC_BILL_AC_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SacBillAcNo desc", "SAC_BILL_AC_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSacSimNo", /* PK attribute */
		"SAC_SIM_NO = ? ")
				.addFilterBy("filterBySacSimNoMatch", "SAC_SIM_NO LIKE ?")
				.addFilterBy("INSacSimNo", "SAC_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSacSimNo", "SAC_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSacSimNo", "SAC_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSacSimNo",
						"(SAC_SIM_NO IS NULL OR LENGTH(SAC_SIM_NO) IS NULL OR LENGTH(SAC_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSacSimNo", "SAC_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSacSimNo", "SAC_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSacSimNo", "SAC_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySacSimNoMatch", "SAC_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSacSimNo",
						"(SAC_SIM_NO = ? OR SAC_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SacSimNo asc", "SAC_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SacSimNo desc", "SAC_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

	}

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SacSimAssignCusDMLFactory(  );
	    }

	    return dml;
	  }
}