package com.eppixcomm.eppix.base.dml;

public class SbhdSplitBillHdAbstractDMLFactory extends BaseDMLFactory {

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	public SbhdSplitBillHdAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"SbhdSplitBillHd", // DML Name
				"blo.SbhdSplitBillHdDMO", // dmoName
				"sbhd_split_bill_hd", // tableName
				14, // numColumns
				"SBHD_SB_ID, SBHD_SUBSCRIBER_ID, SBHD_CHILD_AC_NO, SBHD_CHILD_MSISDN, SBHD_PARENT_AC_NO, SBHD_PARENT_MSISDN, SBHD_CREDIT_ACCUM, SBHD_MIGRATED, SBHD_TOT_BILL_AMT, SBHD_DD_RD, SBHD_ACT_DATE, SBHD_DEACT_DATE, SBHD_BILLED_UPTO, SBHD_STATUS", // columnList
				"SBHD_SUBSCRIBER_ID, SBHD_CHILD_AC_NO, SBHD_CHILD_MSISDN, SBHD_PARENT_AC_NO, SBHD_PARENT_MSISDN", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SBHD_SB_ID, SBHD_SUBSCRIBER_ID, SBHD_CHILD_AC_NO, SBHD_CHILD_MSISDN, SBHD_PARENT_AC_NO, SBHD_PARENT_MSISDN, SBHD_CREDIT_ACCUM, SBHD_MIGRATED, SBHD_TOT_BILL_AMT, SBHD_DD_RD, SBHD_ACT_DATE, SBHD_DEACT_DATE, SBHD_BILLED_UPTO, SBHD_STATUS",
				"",
				"",
				new String[] { "SBHD_SB_ID", "SBHD_SUBSCRIBER_ID",
						"SBHD_CHILD_AC_NO", "SBHD_CHILD_MSISDN",
						"SBHD_PARENT_AC_NO", "SBHD_PARENT_MSISDN",
						"SBHD_CREDIT_ACCUM", "SBHD_MIGRATED",
						"SBHD_TOT_BILL_AMT", "SBHD_DD_RD", "SBHD_ACT_DATE",
						"SBHD_DEACT_DATE", "SBHD_BILLED_UPTO", "SBHD_STATUS"},
				true);
		table.addFilterBy("equalSbhdSbId", /* PK attribute */
		"SBHD_SB_ID = ? ")
				.addFilterBy("filterBySbhdSbIdMatch", "SBHD_SB_ID LIKE ?")
				.addFilterBy("INSbhdSbId", "SBHD_SB_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhdSbId", "SBHD_SB_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhdSbId", "SBHD_SB_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullSbhdSbId",
						"(SBHD_SB_ID IS NULL OR LENGTH(SBHD_SB_ID) IS NULL OR LENGTH(SBHD_SB_ID) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbhdSbId", "SBHD_SB_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbhdSbId", "SBHD_SB_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdSbId", "SBHD_SB_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbhdSbIdMatch", "SBHD_SB_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbhdSbId",
						"(SBHD_SB_ID = ? OR SBHD_SB_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdSbId asc", "SBHD_SB_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbhdSbId desc", "SBHD_SB_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbhdSubscriberId", /* PK attribute */
		"SBHD_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySbhdSubscriberIdMatch",
						"SBHD_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdSubscriberId",
						"(SBHD_SUBSCRIBER_ID IS NULL OR LENGTH(SBHD_SUBSCRIBER_ID) IS NULL OR LENGTH(SBHD_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdSubscriberId",
						"SBHD_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdSubscriberIdMatch",
						"SBHD_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdSubscriberId",
						"(SBHD_SUBSCRIBER_ID = ? OR SBHD_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdSubscriberId asc", "SBHD_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbhdSubscriberId desc", "SBHD_SUBSCRIBER_ID DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSbhdChildAcNo", /* PK attribute */
		"SBHD_CHILD_AC_NO = ? ")
				.addFilterBy("filterBySbhdChildAcNoMatch",
						"SBHD_CHILD_AC_NO LIKE ?")
				.addFilterBy("INSbhdChildAcNo", "SBHD_CHILD_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdChildAcNo",
						"SBHD_CHILD_AC_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdChildAcNo", "SBHD_CHILD_AC_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdChildAcNo",
						"(SBHD_CHILD_AC_NO IS NULL OR LENGTH(SBHD_CHILD_AC_NO) IS NULL OR LENGTH(SBHD_CHILD_AC_NO) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSbhdChildAcNo",
						"SBHD_CHILD_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdChildAcNo", "SBHD_CHILD_AC_NO < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbhdChildAcNo",
						"SBHD_CHILD_AC_NO > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdChildAcNoMatch",
						"SBHD_CHILD_AC_NO LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdChildAcNo",
						"(SBHD_CHILD_AC_NO = ? OR SBHD_CHILD_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdChildAcNo asc", "SBHD_CHILD_AC_NO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbhdChildAcNo desc", "SBHD_CHILD_AC_NO DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbhdChildMsisdn", /* PK attribute */
		"SBHD_CHILD_MSISDN = ? ")
				.addFilterBy("filterBySbhdChildMsisdnMatch",
						"SBHD_CHILD_MSISDN LIKE ?")
				.addFilterBy("INSbhdChildMsisdn", "SBHD_CHILD_MSISDN IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdChildMsisdn",
						"SBHD_CHILD_MSISDN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdChildMsisdn",
						"SBHD_CHILD_MSISDN != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdChildMsisdn",
						"(SBHD_CHILD_MSISDN IS NULL OR LENGTH(SBHD_CHILD_MSISDN) IS NULL OR LENGTH(SBHD_CHILD_MSISDN) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdChildMsisdn",
						"SBHD_CHILD_MSISDN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdChildMsisdn",
						"SBHD_CHILD_MSISDN < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdChildMsisdn",
						"SBHD_CHILD_MSISDN > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdChildMsisdnMatch",
						"SBHD_CHILD_MSISDN LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdChildMsisdn",
						"(SBHD_CHILD_MSISDN = ? OR SBHD_CHILD_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdChildMsisdn asc", "SBHD_CHILD_MSISDN ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbhdChildMsisdn desc", "SBHD_CHILD_MSISDN DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbhdParentAcNo", /* PK attribute */
		"SBHD_PARENT_AC_NO = ? ")
				.addFilterBy("filterBySbhdParentAcNoMatch",
						"SBHD_PARENT_AC_NO LIKE ?")
				.addFilterBy("INSbhdParentAcNo", "SBHD_PARENT_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdParentAcNo",
						"SBHD_PARENT_AC_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdParentAcNo", "SBHD_PARENT_AC_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdParentAcNo",
						"(SBHD_PARENT_AC_NO IS NULL OR LENGTH(SBHD_PARENT_AC_NO) IS NULL OR LENGTH(SBHD_PARENT_AC_NO) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdParentAcNo",
						"SBHD_PARENT_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdParentAcNo", "SBHD_PARENT_AC_NO < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanSbhdParentAcNo",
						"SBHD_PARENT_AC_NO > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdParentAcNoMatch",
						"SBHD_PARENT_AC_NO LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdParentAcNo",
						"(SBHD_PARENT_AC_NO = ? OR SBHD_PARENT_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdParentAcNo asc", "SBHD_PARENT_AC_NO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbhdParentAcNo desc", "SBHD_PARENT_AC_NO DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbhdParentMsisdn", /* PK attribute */
		"SBHD_PARENT_MSISDN = ? ")
				.addFilterBy("filterBySbhdParentMsisdnMatch",
						"SBHD_PARENT_MSISDN LIKE ?")
				.addFilterBy("INSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdParentMsisdn",
						"(SBHD_PARENT_MSISDN IS NULL OR LENGTH(SBHD_PARENT_MSISDN) IS NULL OR LENGTH(SBHD_PARENT_MSISDN) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdParentMsisdn",
						"SBHD_PARENT_MSISDN > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdParentMsisdnMatch",
						"SBHD_PARENT_MSISDN LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdParentMsisdn",
						"(SBHD_PARENT_MSISDN = ? OR SBHD_PARENT_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdParentMsisdn asc", "SBHD_PARENT_MSISDN ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbhdParentMsisdn desc", "SBHD_PARENT_MSISDN DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSbhdCreditAccum", /* PK attribute */
		"SBHD_CREDIT_ACCUM = ? ")
				.addFilterBy("filterBySbhdCreditAccumMatch",
						"SBHD_CREDIT_ACCUM LIKE ?")
				.addFilterBy("INSbhdCreditAccum", "SBHD_CREDIT_ACCUM IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdCreditAccum",
						"SBHD_CREDIT_ACCUM NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdCreditAccum",
						"SBHD_CREDIT_ACCUM != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdCreditAccum",
						"(SBHD_CREDIT_ACCUM IS NULL OR LENGTH(SBHD_CREDIT_ACCUM) IS NULL OR LENGTH(SBHD_CREDIT_ACCUM) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdCreditAccum",
						"SBHD_CREDIT_ACCUM IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdCreditAccum",
						"SBHD_CREDIT_ACCUM < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdCreditAccum",
						"SBHD_CREDIT_ACCUM > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdCreditAccumMatch",
						"SBHD_CREDIT_ACCUM LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdCreditAccum",
						"(SBHD_CREDIT_ACCUM = ? OR SBHD_CREDIT_ACCUM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdCreditAccum asc", "SBHD_CREDIT_ACCUM ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbhdCreditAccum desc", "SBHD_CREDIT_ACCUM DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbhdMigrated", /* PK attribute */
		"SBHD_MIGRATED = ? ")
				.addFilterBy("filterBySbhdMigratedMatch",
						"SBHD_MIGRATED LIKE ?")
				.addFilterBy("INSbhdMigrated", "SBHD_MIGRATED IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdMigrated", "SBHD_MIGRATED NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSbhdMigrated", "SBHD_MIGRATED != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdMigrated",
						"(SBHD_MIGRATED IS NULL OR LENGTH(SBHD_MIGRATED) IS NULL OR LENGTH(SBHD_MIGRATED) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbhdMigrated",
						"SBHD_MIGRATED IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdMigrated", "SBHD_MIGRATED < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbhdMigrated", "SBHD_MIGRATED > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbhdMigratedMatch",
						"SBHD_MIGRATED LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbhdMigrated",
						"(SBHD_MIGRATED = ? OR SBHD_MIGRATED IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdMigrated asc", "SBHD_MIGRATED ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbhdMigrated desc", "SBHD_MIGRATED DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbhdTotBillAmt", /* PK attribute */
		"SBHD_TOT_BILL_AMT = ? ")
				.addFilterBy("filterBySbhdTotBillAmtMatch",
						"SBHD_TOT_BILL_AMT LIKE ?")
				.addFilterBy("INSbhdTotBillAmt", "SBHD_TOT_BILL_AMT IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdTotBillAmt",
						"SBHD_TOT_BILL_AMT NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdTotBillAmt", "SBHD_TOT_BILL_AMT != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdTotBillAmt",
						"(SBHD_TOT_BILL_AMT IS NULL OR LENGTH(SBHD_TOT_BILL_AMT) IS NULL OR LENGTH(SBHD_TOT_BILL_AMT) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbhdTotBillAmt",
						"SBHD_TOT_BILL_AMT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdTotBillAmt", "SBHD_TOT_BILL_AMT < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanSbhdTotBillAmt",
						"SBHD_TOT_BILL_AMT > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdTotBillAmtMatch",
						"SBHD_TOT_BILL_AMT LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdTotBillAmt",
						"(SBHD_TOT_BILL_AMT = ? OR SBHD_TOT_BILL_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdTotBillAmt asc", "SBHD_TOT_BILL_AMT ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbhdTotBillAmt desc", "SBHD_TOT_BILL_AMT DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbhdDdRd", /* PK attribute */
		"SBHD_DD_RD = ? ")
				.addFilterBy("filterBySbhdDdRdMatch", "SBHD_DD_RD LIKE ?")
				.addFilterBy("INSbhdDdRd", "SBHD_DD_RD IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhdDdRd", "SBHD_DD_RD NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhdDdRd", "SBHD_DD_RD != ?")
				// NOTEQUAL

				.addFilterBy("nullSbhdDdRd",
						"(SBHD_DD_RD IS NULL OR LENGTH(SBHD_DD_RD) IS NULL OR LENGTH(SBHD_DD_RD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbhdDdRd", "SBHD_DD_RD IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbhdDdRd", "SBHD_DD_RD < ? ") // LESS THAN

				.addFilterBy("greaterthanSbhdDdRd", "SBHD_DD_RD > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbhdDdRdMatch", "SBHD_DD_RD LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbhdDdRd",
						"(SBHD_DD_RD = ? OR SBHD_DD_RD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdDdRd asc", "SBHD_DD_RD ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbhdDdRd desc", "SBHD_DD_RD DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbhdActDate", /* PK attribute */
		"SBHD_ACT_DATE = ? ")
				.addFilterBy("filterBySbhdActDateMatch", "SBHD_ACT_DATE LIKE ?")
				.addFilterBy("INSbhdActDate", "SBHD_ACT_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdActDate", "SBHD_ACT_DATE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSbhdActDate", "SBHD_ACT_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdActDate",
						"(SBHD_ACT_DATE IS NULL OR LENGTH(SBHD_ACT_DATE) IS NULL OR LENGTH(SBHD_ACT_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbhdActDate",
						"SBHD_ACT_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdActDate", "SBHD_ACT_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbhdActDate", "SBHD_ACT_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbhdActDateMatch",
						"SBHD_ACT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbhdActDate",
						"(SBHD_ACT_DATE = ? OR SBHD_ACT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdActDate asc", "SBHD_ACT_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbhdActDate desc", "SBHD_ACT_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbhdDeactDate", /* PK attribute */
		"SBHD_DEACT_DATE = ? ")
				.addFilterBy("filterBySbhdDeactDateMatch",
						"SBHD_DEACT_DATE LIKE ?")
				.addFilterBy("INSbhdDeactDate", "SBHD_DEACT_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdDeactDate",
						"SBHD_DEACT_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdDeactDate", "SBHD_DEACT_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdDeactDate",
						"(SBHD_DEACT_DATE IS NULL OR LENGTH(SBHD_DEACT_DATE) IS NULL OR LENGTH(SBHD_DEACT_DATE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbhdDeactDate",
						"SBHD_DEACT_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdDeactDate", "SBHD_DEACT_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbhdDeactDate", "SBHD_DEACT_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySbhdDeactDateMatch",
						"SBHD_DEACT_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdDeactDate",
						"(SBHD_DEACT_DATE = ? OR SBHD_DEACT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdDeactDate asc", "SBHD_DEACT_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbhdDeactDate desc", "SBHD_DEACT_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbhdBilledUpto", /* PK attribute */
		"SBHD_BILLED_UPTO = ? ")
				.addFilterBy("filterBySbhdBilledUptoMatch",
						"SBHD_BILLED_UPTO LIKE ?")
				.addFilterBy("INSbhdBilledUpto", "SBHD_BILLED_UPTO IN ( ? ) ") // IN

				.addFilterBy("NOTINSbhdBilledUpto",
						"SBHD_BILLED_UPTO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbhdBilledUpto", "SBHD_BILLED_UPTO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbhdBilledUpto",
						"(SBHD_BILLED_UPTO IS NULL OR LENGTH(SBHD_BILLED_UPTO) IS NULL OR LENGTH(SBHD_BILLED_UPTO) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSbhdBilledUpto",
						"SBHD_BILLED_UPTO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbhdBilledUpto", "SBHD_BILLED_UPTO < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbhdBilledUpto",
						"SBHD_BILLED_UPTO > ? ") // GREATER THAN

				.addFilterBy("filterBySbhdBilledUptoMatch",
						"SBHD_BILLED_UPTO LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbhdBilledUpto",
						"(SBHD_BILLED_UPTO = ? OR SBHD_BILLED_UPTO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdBilledUpto asc", "SBHD_BILLED_UPTO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbhdBilledUpto desc", "SBHD_BILLED_UPTO DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbhdStatus", /* PK attribute */
		"SBHD_STATUS = ? ")
				.addFilterBy("filterBySbhdStatusMatch", "SBHD_STATUS LIKE ?")
				.addFilterBy("INSbhdStatus", "SBHD_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbhdStatus", "SBHD_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbhdStatus", "SBHD_STATUS != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbhdStatus",
						"(SBHD_STATUS IS NULL OR LENGTH(SBHD_STATUS) IS NULL OR LENGTH(SBHD_STATUS) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbhdStatus", "SBHD_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbhdStatus", "SBHD_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbhdStatus", "SBHD_STATUS > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbhdStatusMatch", "SBHD_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbhdStatus",
						"(SBHD_STATUS = ? OR SBHD_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbhdStatus asc", "SBHD_STATUS ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbhdStatus desc", "SBHD_STATUS DESC ") // ORDER
																	// DESCENDING
		;

	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SbhdSplitBillHdDMLFactory();
	    }

	    return dml;
	  }

}