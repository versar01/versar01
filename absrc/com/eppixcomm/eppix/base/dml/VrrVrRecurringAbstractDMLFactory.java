package com.eppixcomm.eppix.base.dml;

public class VrrVrRecurringAbstractDMLFactory extends BaseDMLFactory {

	protected VrrVrRecurringAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"VrrVrRecurring", // DML Name
				"blo.VrrVrRecurringDMO", // dmoName
				"vrr_vr_recurring", // tableName
				11, // numColumns
				"VRR_RECURRING_ID, VRR_SUBSCRIBER_ID, VRR_RECEIVER, VRR_PROVIDER, VRR_DATE_START, VRR_DATE_TERM, VRR_TOT_RECHARGES, VRR_NO_BILLING, VRR_NO_RECHARGE, VRR_RECHARGE_AMT, VRR_STATUS", // columnList
				"VRR_RECURRING_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"VRR_RECURRING_ID, VRR_SUBSCRIBER_ID, VRR_RECEIVER, VRR_PROVIDER, VRR_DATE_START, VRR_DATE_TERM, VRR_TOT_RECHARGES, VRR_NO_BILLING, VRR_NO_RECHARGE, VRR_RECHARGE_AMT, VRR_STATUS",
				"", "", new String[] { "VRR_RECURRING_ID", "VRR_SUBSCRIBER_ID",
						"VRR_RECEIVER", "VRR_PROVIDER", "VRR_DATE_START",
						"VRR_DATE_TERM", "VRR_TOT_RECHARGES", "VRR_NO_BILLING",
						"VRR_NO_RECHARGE", "VRR_RECHARGE_AMT", "VRR_STATUS"},
				true);
		table.addFilterBy("equalVrrRecurringId", /* PK attribute */
		"VRR_RECURRING_ID = ? ")
				.addFilterBy("filterByVrrRecurringIdMatch",
						"VRR_RECURRING_ID LIKE ?")
				.addFilterBy("INVrrRecurringId", "VRR_RECURRING_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrRecurringId",
						"VRR_RECURRING_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrrRecurringId", "VRR_RECURRING_ID != ?") // NOTEQUAL

				.addFilterBy("nullVrrRecurringId",
						"(VRR_RECURRING_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrRecurringId",
						"VRR_RECURRING_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrRecurringId", "VRR_RECURRING_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrrRecurringId",
						"VRR_RECURRING_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVrrRecurringIdMatch",
						"VRR_RECURRING_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrrRecurringId",
						"(VRR_RECURRING_ID = ? OR VRR_RECURRING_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrRecurringId asc", "VRR_RECURRING_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrrRecurringId desc", "VRR_RECURRING_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrrSubscriberId", /* PK attribute */
		"VRR_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByVrrSubscriberIdMatch",
						"VRR_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INVrrSubscriberId", "VRR_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrSubscriberId",
						"VRR_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrrSubscriberId",
						"VRR_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy("nullVrrSubscriberId",
						"(VRR_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVrrSubscriberId",
						"VRR_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrSubscriberId",
						"VRR_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVrrSubscriberId",
						"VRR_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVrrSubscriberIdMatch",
						"VRR_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVrrSubscriberId",
						"(VRR_SUBSCRIBER_ID = ? OR VRR_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrSubscriberId asc", "VRR_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VrrSubscriberId desc", "VRR_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrrReceiver", /* PK attribute */
		"VRR_RECEIVER = ? ")
				.addFilterBy("filterByVrrReceiverMatch", "VRR_RECEIVER LIKE ?")
				.addFilterBy("INVrrReceiver", "VRR_RECEIVER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrrReceiver", "VRR_RECEIVER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrrReceiver", "VRR_RECEIVER != ?")
				// NOTEQUAL

				.addFilterBy("nullVrrReceiver",
						"(VRR_RECEIVER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrrReceiver", "VRR_RECEIVER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVrrReceiver", "VRR_RECEIVER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrrReceiver", "VRR_RECEIVER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVrrReceiverMatch", "VRR_RECEIVER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVrrReceiver",
						"(VRR_RECEIVER = ? OR VRR_RECEIVER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrReceiver asc", "VRR_RECEIVER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VrrReceiver desc", "VRR_RECEIVER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrrProvider", /* PK attribute */
		"VRR_PROVIDER = ? ")
				.addFilterBy("filterByVrrProviderMatch", "VRR_PROVIDER LIKE ?")
				.addFilterBy("INVrrProvider", "VRR_PROVIDER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrrProvider", "VRR_PROVIDER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrrProvider", "VRR_PROVIDER != ?")
				// NOTEQUAL

				.addFilterBy("nullVrrProvider",
						"(VRR_PROVIDER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrrProvider", "VRR_PROVIDER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVrrProvider", "VRR_PROVIDER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrrProvider", "VRR_PROVIDER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVrrProviderMatch", "VRR_PROVIDER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVrrProvider",
						"(VRR_PROVIDER = ? OR VRR_PROVIDER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrProvider asc", "VRR_PROVIDER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VrrProvider desc", "VRR_PROVIDER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrrDateStart", /* PK attribute */
		"VRR_DATE_START = ? ")
				.addFilterBy("filterByVrrDateStartMatch",
						"VRR_DATE_START LIKE ?")
				.addFilterBy("INVrrDateStart", "VRR_DATE_START IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrDateStart", "VRR_DATE_START NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalVrrDateStart", "VRR_DATE_START != ?") // NOTEQUAL

				.addFilterBy("nullVrrDateStart",
						"(VRR_DATE_START IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrDateStart",
						"VRR_DATE_START IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrDateStart", "VRR_DATE_START < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrrDateStart", "VRR_DATE_START > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrrDateStartMatch",
						"VRR_DATE_START LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVrrDateStart",
						"(VRR_DATE_START = ? OR VRR_DATE_START IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrDateStart asc", "VRR_DATE_START ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrrDateStart desc", "VRR_DATE_START DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrrDateTerm", /* PK attribute */
		"VRR_DATE_TERM = ? ")
				.addFilterBy("filterByVrrDateTermMatch", "VRR_DATE_TERM LIKE ?")
				.addFilterBy("INVrrDateTerm", "VRR_DATE_TERM IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrDateTerm", "VRR_DATE_TERM NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVrrDateTerm", "VRR_DATE_TERM != ?") // NOTEQUAL

				.addFilterBy("nullVrrDateTerm",
						"(VRR_DATE_TERM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrDateTerm",
						"VRR_DATE_TERM IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrDateTerm", "VRR_DATE_TERM < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrrDateTerm", "VRR_DATE_TERM > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrrDateTermMatch",
						"VRR_DATE_TERM LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVrrDateTerm",
						"(VRR_DATE_TERM = ? OR VRR_DATE_TERM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrDateTerm asc", "VRR_DATE_TERM ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrrDateTerm desc", "VRR_DATE_TERM DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVrrTotRecharges", /* PK attribute */
		"VRR_TOT_RECHARGES = ? ")
				.addFilterBy("filterByVrrTotRechargesMatch",
						"VRR_TOT_RECHARGES LIKE ?")
				.addFilterBy("INVrrTotRecharges", "VRR_TOT_RECHARGES IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrTotRecharges",
						"VRR_TOT_RECHARGES NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrrTotRecharges",
						"VRR_TOT_RECHARGES != ?") // NOTEQUAL

				.addFilterBy("nullVrrTotRecharges",
						"(VRR_TOT_RECHARGES IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVrrTotRecharges",
						"VRR_TOT_RECHARGES IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrTotRecharges",
						"VRR_TOT_RECHARGES < ? ") // LESS THAN

				.addFilterBy("greaterthanVrrTotRecharges",
						"VRR_TOT_RECHARGES > ? ") // GREATER THAN

				.addFilterBy("filterByVrrTotRechargesMatch",
						"VRR_TOT_RECHARGES LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVrrTotRecharges",
						"(VRR_TOT_RECHARGES = ? OR VRR_TOT_RECHARGES IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrTotRecharges asc", "VRR_TOT_RECHARGES ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VrrTotRecharges desc", "VRR_TOT_RECHARGES DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrrNoBilling", /* PK attribute */
		"VRR_NO_BILLING = ? ")
				.addFilterBy("filterByVrrNoBillingMatch",
						"VRR_NO_BILLING LIKE ?")
				.addFilterBy("INVrrNoBilling", "VRR_NO_BILLING IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrNoBilling", "VRR_NO_BILLING NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalVrrNoBilling", "VRR_NO_BILLING != ?") // NOTEQUAL

				.addFilterBy("nullVrrNoBilling",
						"(VRR_NO_BILLING IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrNoBilling",
						"VRR_NO_BILLING IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrNoBilling", "VRR_NO_BILLING < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVrrNoBilling", "VRR_NO_BILLING > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVrrNoBillingMatch",
						"VRR_NO_BILLING LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVrrNoBilling",
						"(VRR_NO_BILLING = ? OR VRR_NO_BILLING IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrNoBilling asc", "VRR_NO_BILLING ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VrrNoBilling desc", "VRR_NO_BILLING DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrrNoRecharge", /* PK attribute */
		"VRR_NO_RECHARGE = ? ")
				.addFilterBy("filterByVrrNoRechargeMatch",
						"VRR_NO_RECHARGE LIKE ?")
				.addFilterBy("INVrrNoRecharge", "VRR_NO_RECHARGE IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrNoRecharge",
						"VRR_NO_RECHARGE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrrNoRecharge", "VRR_NO_RECHARGE != ?") // NOTEQUAL

				.addFilterBy("nullVrrNoRecharge",
						"(VRR_NO_RECHARGE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrNoRecharge",
						"VRR_NO_RECHARGE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrNoRecharge", "VRR_NO_RECHARGE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrrNoRecharge", "VRR_NO_RECHARGE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByVrrNoRechargeMatch",
						"VRR_NO_RECHARGE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrrNoRecharge",
						"(VRR_NO_RECHARGE = ? OR VRR_NO_RECHARGE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrNoRecharge asc", "VRR_NO_RECHARGE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrrNoRecharge desc", "VRR_NO_RECHARGE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVrrRechargeAmt", /* PK attribute */
		"VRR_RECHARGE_AMT = ? ")
				.addFilterBy("filterByVrrRechargeAmtMatch",
						"VRR_RECHARGE_AMT LIKE ?")
				.addFilterBy("INVrrRechargeAmt", "VRR_RECHARGE_AMT IN ( ? ) ") // IN

				.addFilterBy("NOTINVrrRechargeAmt",
						"VRR_RECHARGE_AMT NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVrrRechargeAmt", "VRR_RECHARGE_AMT != ?") // NOTEQUAL

				.addFilterBy("nullVrrRechargeAmt",
						"(VRR_RECHARGE_AMT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVrrRechargeAmt",
						"VRR_RECHARGE_AMT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVrrRechargeAmt", "VRR_RECHARGE_AMT < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVrrRechargeAmt",
						"VRR_RECHARGE_AMT > ? ") // GREATER THAN

				.addFilterBy("filterByVrrRechargeAmtMatch",
						"VRR_RECHARGE_AMT LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVrrRechargeAmt",
						"(VRR_RECHARGE_AMT = ? OR VRR_RECHARGE_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrRechargeAmt asc", "VRR_RECHARGE_AMT ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VrrRechargeAmt desc", "VRR_RECHARGE_AMT DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVrrStatus", /* PK attribute */
		"VRR_STATUS = ? ")
				.addFilterBy("filterByVrrStatusMatch", "VRR_STATUS LIKE ?")
				.addFilterBy("INVrrStatus", "VRR_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVrrStatus", "VRR_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVrrStatus", "VRR_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullVrrStatus",
						"(VRR_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullVrrStatus", "VRR_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVrrStatus", "VRR_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVrrStatus", "VRR_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVrrStatusMatch", "VRR_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVrrStatus",
						"(VRR_STATUS = ? OR VRR_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VrrStatus asc", "VRR_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VrrStatus desc", "VRR_STATUS DESC ") // ORDER
																	// DESCENDING
		;

	}
}