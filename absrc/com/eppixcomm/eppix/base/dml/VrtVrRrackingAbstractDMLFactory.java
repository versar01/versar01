package com.eppixcomm.eppix.base.dml;

public class VrtVrRrackingAbstractDMLFactory extends BaseDMLFactory {

	protected VrtVrRrackingAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"VrtVrTracking", // DML Name
				"blo.VrtVrTrackingDMO", // dmoName
				"vrt_vr_tracking", // tableName
				20, // numColumns
				"VRT_REQUESTOR, VRT_RECEIVER, VRT_PROVIDER, VRT_RECHARGE_TYPE, VRT_RECHARGE_AMT, VRT_REF_ID, VRT_VRR_ID, VRT_VRI_ID, VRT_REFERENCE_NO, VRT_DATE_1, VRT_DATE_2, VRT_DATE_3, VRT_MTW_TRANS_ID, VRT_MTW_TERM_ID, VRT_MTW_BATCH_NUM, VRT_MTW_PRCRE_CD, VRT_MTW_RET_REF, VRT_MTW_FUNDLD_CD, VRT_MTW_LD_RSPNS, VRT_STATUS ", // columnList
				"VRT_REF_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"VRT_REQUESTOR, VRT_RECEIVER, VRT_PROVIDER, VRT_RECHARGE_TYPE, VRT_RECHARGE_AMT, VRT_REF_ID, VRT_VRR_ID, VRT_VRI_ID, VRT_REFERENCE_NO, VRT_DATE_1, VRT_DATE_2, VRT_DATE_3, VRT_MTW_TRANS_ID, VRT_MTW_TERM_ID, VRT_MTW_BATCH_NUM, VRT_MTW_PRCRE_CD, VRT_MTW_RET_REF, VRT_MTW_FUNDLD_CD, VRT_MTW_LD_RSPNS, VRT_STATUS ",
				"", "",
				new String[] { "VRT_REQUESTOR", "VRT_RECEIVER", "VRT_PROVIDER",
						"VRT_RECHARGE_TYPE", "VRT_RECHARGE_AMT", "VRT_REF_ID",
						"VRT_VRR_ID", "VRT_VRI_ID", "VRT_REFERENCE_NO",
						"VRT_DATE_1", "VRT_DATE_2", "VRT_DATE_3",
						"VRT_MTW_TRANS_ID", "VRT_MTW_TERM_ID",
						"VRT_MTW_BATCH_NUM", "VRT_MTW_PRCRE_CD",
						"VRT_MTW_RET_REF", "VRT_MTW_FUNDLD_CD",
						"VRT_MTW_LD_RSPNS", "VRT_STATUS" }, true);
		table.addFilterBy("equalVrtRequestor", /* PK attribute */
		"VRT_REQUESTOR = ? ")
				.addFilterBy("filterByVrtRequestorMatch",
						"VRT_REQUESTOR LIKE ?")
				.addFilterBy("INVrtRequestor", "VRT_REQUESTOR IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtRequestor", "VRT_REQUESTOR NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVrtRequestor", "VRT_REQUESTOR != ?") // NOTEQUAL

				.addFilterBy("nullVrtRequestor",
						"(VRT_REQUESTOR IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtRequestor",
						"VRT_REQUESTOR IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtRequestor", "VRT_REQUESTOR < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrtRequestor", "VRT_REQUESTOR > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrtRequestorMatch",
						"VRT_REQUESTOR LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVrtRequestor",
						"(VRT_REQUESTOR = ? OR VRT_REQUESTOR IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtRequestor asc", "VRT_REQUESTOR ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrtRequestor desc", "VRT_REQUESTOR DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrtReceiver", /* PK attribute */
		"VRT_RECEIVER = ? ")
				.addFilterBy("filterByVrtReceiverMatch", "VRT_RECEIVER LIKE ?")
				.addFilterBy("INVrtReceiver", "VRT_RECEIVER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtReceiver", "VRT_RECEIVER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtReceiver", "VRT_RECEIVER != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtReceiver",
						"(VRT_RECEIVER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtReceiver", "VRT_RECEIVER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVrtReceiver", "VRT_RECEIVER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrtReceiver", "VRT_RECEIVER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVrtReceiverMatch", "VRT_RECEIVER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVrtReceiver",
						"(VRT_RECEIVER = ? OR VRT_RECEIVER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtReceiver asc", "VRT_RECEIVER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VrtReceiver desc", "VRT_RECEIVER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrtProvider", /* PK attribute */
		"VRT_PROVIDER = ? ")
				.addFilterBy("filterByVrtProviderMatch", "VRT_PROVIDER LIKE ?")
				.addFilterBy("INVrtProvider", "VRT_PROVIDER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtProvider", "VRT_PROVIDER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtProvider", "VRT_PROVIDER != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtProvider",
						"(VRT_PROVIDER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtProvider", "VRT_PROVIDER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVrtProvider", "VRT_PROVIDER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrtProvider", "VRT_PROVIDER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVrtProviderMatch", "VRT_PROVIDER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVrtProvider",
						"(VRT_PROVIDER = ? OR VRT_PROVIDER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtProvider asc", "VRT_PROVIDER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VrtProvider desc", "VRT_PROVIDER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrtRechargeType", /* PK attribute */
		"VRT_RECHARGE_TYPE = ? ")
				.addFilterBy("filterByVrtRechargeTypeMatch",
						"VRT_RECHARGE_TYPE LIKE ?")
				.addFilterBy("INVrtRechargeType", "VRT_RECHARGE_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtRechargeType",
						"VRT_RECHARGE_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtRechargeType",
						"VRT_RECHARGE_TYPE != ?") // NOTEQUAL

				.addFilterBy("nullVrtRechargeType",
						"(VRT_RECHARGE_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVrtRechargeType",
						"VRT_RECHARGE_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtRechargeType",
						"VRT_RECHARGE_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtRechargeType",
						"VRT_RECHARGE_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterByVrtRechargeTypeMatch",
						"VRT_RECHARGE_TYPE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVrtRechargeType",
						"(VRT_RECHARGE_TYPE = ? OR VRT_RECHARGE_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtRechargeType asc", "VRT_RECHARGE_TYPE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VrtRechargeType desc", "VRT_RECHARGE_TYPE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrtRechargeAmt", /* PK attribute */
		"VRT_RECHARGE_AMT = ? ")
				.addFilterBy("filterByVrtRechargeAmtMatch",
						"VRT_RECHARGE_AMT LIKE ?")
				.addFilterBy("INVrtRechargeAmt", "VRT_RECHARGE_AMT IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtRechargeAmt",
						"VRT_RECHARGE_AMT NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtRechargeAmt", "VRT_RECHARGE_AMT != ?") // NOTEQUAL

				.addFilterBy("nullVrtRechargeAmt",
						"(VRT_RECHARGE_AMT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtRechargeAmt",
						"VRT_RECHARGE_AMT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtRechargeAmt", "VRT_RECHARGE_AMT < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtRechargeAmt",
						"VRT_RECHARGE_AMT > ? ") // GREATER THAN

				.addFilterBy("filterByVrtRechargeAmtMatch",
						"VRT_RECHARGE_AMT LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtRechargeAmt",
						"(VRT_RECHARGE_AMT = ? OR VRT_RECHARGE_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtRechargeAmt asc", "VRT_RECHARGE_AMT ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtRechargeAmt desc", "VRT_RECHARGE_AMT DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrtRefId", /* PK attribute */
		"VRT_REF_ID = ? ")
				.addFilterBy("filterByVrtRefIdMatch", "VRT_REF_ID LIKE ?")
				.addFilterBy("INVrtRefId", "VRT_REF_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtRefId", "VRT_REF_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtRefId", "VRT_REF_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtRefId",
						"(VRT_REF_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtRefId", "VRT_REF_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtRefId", "VRT_REF_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtRefId", "VRT_REF_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtRefIdMatch", "VRT_REF_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtRefId",
						"(VRT_REF_ID = ? OR VRT_REF_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtRefId asc", "VRT_REF_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtRefId desc", "VRT_REF_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtVrrId", /* PK attribute */
		"VRT_VRR_ID = ? ")
				.addFilterBy("filterByVrtVrrIdMatch", "VRT_VRR_ID LIKE ?")
				.addFilterBy("INVrtVrrId", "VRT_VRR_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtVrrId", "VRT_VRR_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtVrrId", "VRT_VRR_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtVrrId",
						"(VRT_VRR_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtVrrId", "VRT_VRR_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtVrrId", "VRT_VRR_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtVrrId", "VRT_VRR_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtVrrIdMatch", "VRT_VRR_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtVrrId",
						"(VRT_VRR_ID = ? OR VRT_VRR_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtVrrId asc", "VRT_VRR_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtVrrId desc", "VRT_VRR_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtVriId", /* PK attribute */
		"VRT_VRI_ID = ? ")
				.addFilterBy("filterByVrtVriIdMatch", "VRT_VRI_ID LIKE ?")
				.addFilterBy("INVrtVriId", "VRT_VRI_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtVriId", "VRT_VRI_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtVriId", "VRT_VRI_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtVriId",
						"(VRT_VRI_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtVriId", "VRT_VRI_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtVriId", "VRT_VRI_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtVriId", "VRT_VRI_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtVriIdMatch", "VRT_VRI_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtVriId",
						"(VRT_VRI_ID = ? OR VRT_VRI_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtVriId asc", "VRT_VRI_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtVriId desc", "VRT_VRI_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtReferenceNo", /* PK attribute */
		"VRT_REFERENCE_NO = ? ")
				.addFilterBy("filterByVrtReferenceNoMatch",
						"VRT_REFERENCE_NO LIKE ?")
				.addFilterBy("INVrtReferenceNo", "VRT_REFERENCE_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtReferenceNo",
						"VRT_REFERENCE_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtReferenceNo", "VRT_REFERENCE_NO != ?") // NOTEQUAL

				.addFilterBy("nullVrtReferenceNo",
						"(VRT_REFERENCE_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtReferenceNo",
						"VRT_REFERENCE_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtReferenceNo", "VRT_REFERENCE_NO < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtReferenceNo",
						"VRT_REFERENCE_NO > ? ") // GREATER THAN

				.addFilterBy("filterByVrtReferenceNoMatch",
						"VRT_REFERENCE_NO LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtReferenceNo",
						"(VRT_REFERENCE_NO = ? OR VRT_REFERENCE_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtReferenceNo asc", "VRT_REFERENCE_NO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtReferenceNo desc", "VRT_REFERENCE_NO DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrtDate1", /* PK attribute */
		"VRT_DATE_1 = ? ")
				.addFilterBy("filterByVrtDate1Match", "VRT_DATE_1 LIKE ?")
				.addFilterBy("INVrtDate1", "VRT_DATE_1 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtDate1", "VRT_DATE_1 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtDate1", "VRT_DATE_1 != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtDate1",
						"(VRT_DATE_1 IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtDate1", "VRT_DATE_1 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtDate1", "VRT_DATE_1 < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtDate1", "VRT_DATE_1 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtDate1Match", "VRT_DATE_1 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtDate1",
						"(VRT_DATE_1 = ? OR VRT_DATE_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtDate1 asc", "VRT_DATE_1 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtDate1 desc", "VRT_DATE_1 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtDate2", /* PK attribute */
		"VRT_DATE_2 = ? ")
				.addFilterBy("filterByVrtDate2Match", "VRT_DATE_2 LIKE ?")
				.addFilterBy("INVrtDate2", "VRT_DATE_2 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtDate2", "VRT_DATE_2 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtDate2", "VRT_DATE_2 != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtDate2",
						"(VRT_DATE_2 IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtDate2", "VRT_DATE_2 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtDate2", "VRT_DATE_2 < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtDate2", "VRT_DATE_2 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtDate2Match", "VRT_DATE_2 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtDate2",
						"(VRT_DATE_2 = ? OR VRT_DATE_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtDate2 asc", "VRT_DATE_2 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtDate2 desc", "VRT_DATE_2 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtDate3", /* PK attribute */
		"VRT_DATE_3 = ? ")
				.addFilterBy("filterByVrtDate3Match", "VRT_DATE_3 LIKE ?")
				.addFilterBy("INVrtDate3", "VRT_DATE_3 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtDate3", "VRT_DATE_3 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtDate3", "VRT_DATE_3 != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtDate3",
						"(VRT_DATE_3 IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtDate3", "VRT_DATE_3 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVrtDate3", "VRT_DATE_3 < ? ") // LESS THAN

				.addFilterBy("greaterthanVrtDate3", "VRT_DATE_3 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtDate3Match", "VRT_DATE_3 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVrtDate3",
						"(VRT_DATE_3 = ? OR VRT_DATE_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtDate3 asc", "VRT_DATE_3 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtDate3 desc", "VRT_DATE_3 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVrtMtwTransId", /* PK attribute */
		"VRT_MTW_TRANS_ID = ? ")
				.addFilterBy("filterByVrtMtwTransIdMatch",
						"VRT_MTW_TRANS_ID LIKE ?")
				.addFilterBy("INVrtMtwTransId", "VRT_MTW_TRANS_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwTransId",
						"VRT_MTW_TRANS_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwTransId", "VRT_MTW_TRANS_ID != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwTransId",
						"(VRT_MTW_TRANS_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtMtwTransId",
						"VRT_MTW_TRANS_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwTransId", "VRT_MTW_TRANS_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtMtwTransId",
						"VRT_MTW_TRANS_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVrtMtwTransIdMatch",
						"VRT_MTW_TRANS_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwTransId",
						"(VRT_MTW_TRANS_ID = ? OR VRT_MTW_TRANS_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwTransId asc", "VRT_MTW_TRANS_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtMtwTransId desc", "VRT_MTW_TRANS_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrtMtwTermId", /* PK attribute */
		"VRT_MTW_TERM_ID = ? ")
				.addFilterBy("filterByVrtMtwTermIdMatch",
						"VRT_MTW_TERM_ID LIKE ?")
				.addFilterBy("INVrtMtwTermId", "VRT_MTW_TERM_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwTermId",
						"VRT_MTW_TERM_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwTermId", "VRT_MTW_TERM_ID != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwTermId",
						"(VRT_MTW_TERM_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtMtwTermId",
						"VRT_MTW_TERM_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwTermId", "VRT_MTW_TERM_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtMtwTermId", "VRT_MTW_TERM_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrtMtwTermIdMatch",
						"VRT_MTW_TERM_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwTermId",
						"(VRT_MTW_TERM_ID = ? OR VRT_MTW_TERM_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwTermId asc", "VRT_MTW_TERM_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrtMtwTermId desc", "VRT_MTW_TERM_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrtMtwBatchNum", /* PK attribute */
		"VRT_MTW_BATCH_NUM = ? ")
				.addFilterBy("filterByVrtMtwBatchNumMatch",
						"VRT_MTW_BATCH_NUM LIKE ?")
				.addFilterBy("INVrtMtwBatchNum", "VRT_MTW_BATCH_NUM IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwBatchNum",
						"VRT_MTW_BATCH_NUM NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwBatchNum", "VRT_MTW_BATCH_NUM != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwBatchNum",
						"(VRT_MTW_BATCH_NUM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVrtMtwBatchNum",
						"VRT_MTW_BATCH_NUM IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwBatchNum", "VRT_MTW_BATCH_NUM < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanVrtMtwBatchNum",
						"VRT_MTW_BATCH_NUM > ? ") // GREATER THAN

				.addFilterBy("filterByVrtMtwBatchNumMatch",
						"VRT_MTW_BATCH_NUM LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwBatchNum",
						"(VRT_MTW_BATCH_NUM = ? OR VRT_MTW_BATCH_NUM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwBatchNum asc", "VRT_MTW_BATCH_NUM ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtMtwBatchNum desc", "VRT_MTW_BATCH_NUM DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrtMtwPrcreCd", /* PK attribute */
		"VRT_MTW_PRCRE_CD = ? ")
				.addFilterBy("filterByVrtMtwPrcreCdMatch",
						"VRT_MTW_PRCRE_CD LIKE ?")
				.addFilterBy("INVrtMtwPrcreCd", "VRT_MTW_PRCRE_CD IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwPrcreCd",
						"VRT_MTW_PRCRE_CD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwPrcreCd", "VRT_MTW_PRCRE_CD != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwPrcreCd",
						"(VRT_MTW_PRCRE_CD IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtMtwPrcreCd",
						"VRT_MTW_PRCRE_CD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwPrcreCd", "VRT_MTW_PRCRE_CD < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtMtwPrcreCd",
						"VRT_MTW_PRCRE_CD > ? ") // GREATER THAN

				.addFilterBy("filterByVrtMtwPrcreCdMatch",
						"VRT_MTW_PRCRE_CD LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwPrcreCd",
						"(VRT_MTW_PRCRE_CD = ? OR VRT_MTW_PRCRE_CD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwPrcreCd asc", "VRT_MTW_PRCRE_CD ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtMtwPrcreCd desc", "VRT_MTW_PRCRE_CD DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrtMtwRetRef", /* PK attribute */
		"VRT_MTW_RET_REF = ? ")
				.addFilterBy("filterByVrtMtwRetRefMatch",
						"VRT_MTW_RET_REF LIKE ?")
				.addFilterBy("INVrtMtwRetRef", "VRT_MTW_RET_REF IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwRetRef",
						"VRT_MTW_RET_REF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwRetRef", "VRT_MTW_RET_REF != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwRetRef",
						"(VRT_MTW_RET_REF IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtMtwRetRef",
						"VRT_MTW_RET_REF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwRetRef", "VRT_MTW_RET_REF < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtMtwRetRef", "VRT_MTW_RET_REF > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrtMtwRetRefMatch",
						"VRT_MTW_RET_REF LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwRetRef",
						"(VRT_MTW_RET_REF = ? OR VRT_MTW_RET_REF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwRetRef asc", "VRT_MTW_RET_REF ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrtMtwRetRef desc", "VRT_MTW_RET_REF DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrtMtwFundldCd", /* PK attribute */
		"VRT_MTW_FUNDLD_CD = ? ")
				.addFilterBy("filterByVrtMtwFundldCdMatch",
						"VRT_MTW_FUNDLD_CD LIKE ?")
				.addFilterBy("INVrtMtwFundldCd", "VRT_MTW_FUNDLD_CD IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwFundldCd",
						"VRT_MTW_FUNDLD_CD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwFundldCd", "VRT_MTW_FUNDLD_CD != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwFundldCd",
						"(VRT_MTW_FUNDLD_CD IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVrtMtwFundldCd",
						"VRT_MTW_FUNDLD_CD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwFundldCd", "VRT_MTW_FUNDLD_CD < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanVrtMtwFundldCd",
						"VRT_MTW_FUNDLD_CD > ? ") // GREATER THAN

				.addFilterBy("filterByVrtMtwFundldCdMatch",
						"VRT_MTW_FUNDLD_CD LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwFundldCd",
						"(VRT_MTW_FUNDLD_CD = ? OR VRT_MTW_FUNDLD_CD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwFundldCd asc", "VRT_MTW_FUNDLD_CD ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtMtwFundldCd desc", "VRT_MTW_FUNDLD_CD DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrtMtwLdRspns", /* PK attribute */
		"VRT_MTW_LD_RSPNS = ? ")
				.addFilterBy("filterByVrtMtwLdRspnsMatch",
						"VRT_MTW_LD_RSPNS LIKE ?")
				.addFilterBy("INVrtMtwLdRspns", "VRT_MTW_LD_RSPNS IN ( ? ) ") // IN

				.addFilterBy("NOTINVrtMtwLdRspns",
						"VRT_MTW_LD_RSPNS NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrtMtwLdRspns", "VRT_MTW_LD_RSPNS != ?") // NOTEQUAL

				.addFilterBy("nullVrtMtwLdRspns",
						"(VRT_MTW_LD_RSPNS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrtMtwLdRspns",
						"VRT_MTW_LD_RSPNS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrtMtwLdRspns", "VRT_MTW_LD_RSPNS < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrtMtwLdRspns",
						"VRT_MTW_LD_RSPNS > ? ") // GREATER THAN

				.addFilterBy("filterByVrtMtwLdRspnsMatch",
						"VRT_MTW_LD_RSPNS LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrtMtwLdRspns",
						"(VRT_MTW_LD_RSPNS = ? OR VRT_MTW_LD_RSPNS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtMtwLdRspns asc", "VRT_MTW_LD_RSPNS ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrtMtwLdRspns desc", "VRT_MTW_LD_RSPNS DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrtStatus", /* PK attribute */
		"VRT_STATUS = ? ")
				.addFilterBy("filterByVrtStatusMatch", "VRT_STATUS LIKE ?")
				.addFilterBy("INVrtStatus", "VRT_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrtStatus", "VRT_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrtStatus", "VRT_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullVrtStatus",
						"(VRT_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrtStatus", "VRT_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVrtStatus", "VRT_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVrtStatus", "VRT_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrtStatusMatch", "VRT_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVrtStatus",
						"(VRT_STATUS = ? OR VRT_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrtStatus asc", "VRT_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrtStatus desc", "VRT_STATUS DESC ") // ORDER
																	// DESCENDING
		;

	}
}