package com.eppixcomm.eppix.base.dml;

public class SdeServDepositAbstractDMLFactory extends BaseDMLFactory {

	protected SdeServDepositAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"SdeServDeposit", // DML Name
				"blo.SdeServDepositDMO", // dmoName
				"sde_serv_deposit", // tableName
				20, // numColumns
				"SDE_DEPOSIT_ID, SDE_SERVICE_CODE, SDE_PACKAGE_CODE, SDE_VER_RULE_NUM, SDE_CUSTOMER_ID, SDE_SUBSCRIBER_ID, SDE_LATES_PAY_DATE, SDE_PAY_DATE, SDE_DEPOSIT_STATUS, SDE_DEACT_DATE, SDE_RELEASE_DATE, SDE_AMOUNT_DUE, SDE_AMOUNT_PAID, SDE_SERVICE_STATUS, SDE_BATCH_RUN_NUM, SDE_SIM_NO, SDE_MSISDN_NO, SDE_PEND_LETTER_ID, SDE_CURRENCY, SDE_EXCHANGE_RATE", // columnList
				"SDE_DEPOSIT_ID, SDE_SERVICE_CODE, SDE_PACKAGE_CODE, SDE_VER_RULE_NUM", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SDE_DEPOSIT_ID, SDE_SERVICE_CODE, SDE_PACKAGE_CODE, SDE_VER_RULE_NUM, SDE_CUSTOMER_ID, SDE_SUBSCRIBER_ID, SDE_LATES_PAY_DATE, SDE_PAY_DATE, SDE_DEPOSIT_STATUS, SDE_DEACT_DATE, SDE_RELEASE_DATE, SDE_AMOUNT_DUE, SDE_AMOUNT_PAID, SDE_SERVICE_STATUS, SDE_BATCH_RUN_NUM, SDE_SIM_NO, SDE_MSISDN_NO, SDE_PEND_LETTER_ID, SDE_CURRENCY, SDE_EXCHANGE_RATE",
				"", "", new String[] { "SDE_DEPOSIT_ID", "SDE_SERVICE_CODE",
						"SDE_PACKAGE_CODE", "SDE_VER_RULE_NUM",
						"SDE_CUSTOMER_ID", "SDE_SUBSCRIBER_ID",
						"SDE_LATES_PAY_DATE", "SDE_PAY_DATE",
						"SDE_DEPOSIT_STATUS", "SDE_DEACT_DATE",
						"SDE_RELEASE_DATE", "SDE_AMOUNT_DUE",
						"SDE_AMOUNT_PAID", "SDE_SERVICE_STATUS",
						"SDE_BATCH_RUN_NUM", "SDE_SIM_NO", "SDE_MSISDN_NO",
						"SDE_PEND_LETTER_ID", "SDE_CURRENCY",
						"SDE_EXCHANGE_RATE" }, true);
		table.addFilterBy("equalSdeDepositId", /* PK attribute */
		"SDE_DEPOSIT_ID = ? ")
				.addFilterBy("filterBySdeDepositIdMatch",
						"SDE_DEPOSIT_ID LIKE ?")
				.addFilterBy("INSdeDepositId", "SDE_DEPOSIT_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeDepositId", "SDE_DEPOSIT_ID NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSdeDepositId", "SDE_DEPOSIT_ID != ?") // NOTEQUAL

				.addFilterBy("nullSdeDepositId",
						"(SDE_DEPOSIT_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeDepositId",
						"SDE_DEPOSIT_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeDepositId", "SDE_DEPOSIT_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdeDepositId", "SDE_DEPOSIT_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySdeDepositIdMatch",
						"SDE_DEPOSIT_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSdeDepositId",
						"(SDE_DEPOSIT_ID = ? OR SDE_DEPOSIT_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeDepositId asc", "SDE_DEPOSIT_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SdeDepositId desc", "SDE_DEPOSIT_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeServiceCode", /* PK attribute */
		"SDE_SERVICE_CODE = ? ")
				.addFilterBy("filterBySdeServiceCodeMatch",
						"SDE_SERVICE_CODE LIKE ?")
				.addFilterBy("INSdeServiceCode", "SDE_SERVICE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeServiceCode",
						"SDE_SERVICE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeServiceCode", "SDE_SERVICE_CODE != ?") // NOTEQUAL

				.addFilterBy("nullSdeServiceCode",
						"(SDE_SERVICE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeServiceCode",
						"SDE_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeServiceCode", "SDE_SERVICE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdeServiceCode",
						"SDE_SERVICE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySdeServiceCodeMatch",
						"SDE_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdeServiceCode",
						"(SDE_SERVICE_CODE = ? OR SDE_SERVICE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeServiceCode asc", "SDE_SERVICE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeServiceCode desc", "SDE_SERVICE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdePackageCode", /* PK attribute */
		"SDE_PACKAGE_CODE = ? ")
				.addFilterBy("filterBySdePackageCodeMatch",
						"SDE_PACKAGE_CODE LIKE ?")
				.addFilterBy("INSdePackageCode", "SDE_PACKAGE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdePackageCode",
						"SDE_PACKAGE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdePackageCode", "SDE_PACKAGE_CODE != ?") // NOTEQUAL

				.addFilterBy("nullSdePackageCode",
						"(SDE_PACKAGE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdePackageCode",
						"SDE_PACKAGE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdePackageCode", "SDE_PACKAGE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdePackageCode",
						"SDE_PACKAGE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySdePackageCodeMatch",
						"SDE_PACKAGE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdePackageCode",
						"(SDE_PACKAGE_CODE = ? OR SDE_PACKAGE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdePackageCode asc", "SDE_PACKAGE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdePackageCode desc", "SDE_PACKAGE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdeVerRuleNum", /* PK attribute */
		"SDE_VER_RULE_NUM = ? ")
				.addFilterBy("filterBySdeVerRuleNumMatch",
						"SDE_VER_RULE_NUM LIKE ?")
				.addFilterBy("INSdeVerRuleNum", "SDE_VER_RULE_NUM IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeVerRuleNum",
						"SDE_VER_RULE_NUM NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeVerRuleNum", "SDE_VER_RULE_NUM != ?") // NOTEQUAL

				.addFilterBy("nullSdeVerRuleNum",
						"(SDE_VER_RULE_NUM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeVerRuleNum",
						"SDE_VER_RULE_NUM IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeVerRuleNum", "SDE_VER_RULE_NUM < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdeVerRuleNum",
						"SDE_VER_RULE_NUM > ? ") // GREATER THAN

				.addFilterBy("filterBySdeVerRuleNumMatch",
						"SDE_VER_RULE_NUM LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdeVerRuleNum",
						"(SDE_VER_RULE_NUM = ? OR SDE_VER_RULE_NUM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeVerRuleNum asc", "SDE_VER_RULE_NUM ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeVerRuleNum desc", "SDE_VER_RULE_NUM DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeCustomerId", /* PK attribute */
		"SDE_CUSTOMER_ID = ? ")
				.addFilterBy("filterBySdeCustomerIdMatch",
						"SDE_CUSTOMER_ID LIKE ?")
				.addFilterBy("INSdeCustomerId", "SDE_CUSTOMER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeCustomerId",
						"SDE_CUSTOMER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeCustomerId", "SDE_CUSTOMER_ID != ?") // NOTEQUAL

				.addFilterBy("nullSdeCustomerId",
						"(SDE_CUSTOMER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeCustomerId",
						"SDE_CUSTOMER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeCustomerId", "SDE_CUSTOMER_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdeCustomerId", "SDE_CUSTOMER_ID > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySdeCustomerIdMatch",
						"SDE_CUSTOMER_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdeCustomerId",
						"(SDE_CUSTOMER_ID = ? OR SDE_CUSTOMER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeCustomerId asc", "SDE_CUSTOMER_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeCustomerId desc", "SDE_CUSTOMER_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeSubscriberId", /* PK attribute */
		"SDE_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySdeSubscriberIdMatch",
						"SDE_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSdeSubscriberId", "SDE_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeSubscriberId",
						"SDE_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeSubscriberId",
						"SDE_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy("nullSdeSubscriberId",
						"(SDE_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeSubscriberId",
						"SDE_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeSubscriberId",
						"SDE_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeSubscriberId",
						"SDE_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySdeSubscriberIdMatch",
						"SDE_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeSubscriberId",
						"(SDE_SUBSCRIBER_ID = ? OR SDE_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeSubscriberId asc", "SDE_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdeSubscriberId desc", "SDE_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdeLatesPayDate", /* PK attribute */
		"SDE_LATES_PAY_DATE = ? ")
				.addFilterBy("filterBySdeLatesPayDateMatch",
						"SDE_LATES_PAY_DATE LIKE ?")
				.addFilterBy("INSdeLatesPayDate",
						"SDE_LATES_PAY_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeLatesPayDate",
						"SDE_LATES_PAY_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeLatesPayDate",
						"SDE_LATES_PAY_DATE != ?") // NOTEQUAL

				.addFilterBy("nullSdeLatesPayDate",
						"(SDE_LATES_PAY_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeLatesPayDate",
						"SDE_LATES_PAY_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeLatesPayDate",
						"SDE_LATES_PAY_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeLatesPayDate",
						"SDE_LATES_PAY_DATE > ? ") // GREATER THAN

				.addFilterBy("filterBySdeLatesPayDateMatch",
						"SDE_LATES_PAY_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeLatesPayDate",
						"(SDE_LATES_PAY_DATE = ? OR SDE_LATES_PAY_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeLatesPayDate asc", "SDE_LATES_PAY_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdeLatesPayDate desc", "SDE_LATES_PAY_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdePayDate", /* PK attribute */
		"SDE_PAY_DATE = ? ")
				.addFilterBy("filterBySdePayDateMatch", "SDE_PAY_DATE LIKE ?")
				.addFilterBy("INSdePayDate", "SDE_PAY_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSdePayDate", "SDE_PAY_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSdePayDate", "SDE_PAY_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullSdePayDate",
						"(SDE_PAY_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullSdePayDate", "SDE_PAY_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSdePayDate", "SDE_PAY_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSdePayDate", "SDE_PAY_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySdePayDateMatch", "SDE_PAY_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSdePayDate",
						"(SDE_PAY_DATE = ? OR SDE_PAY_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdePayDate asc", "SDE_PAY_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SdePayDate desc", "SDE_PAY_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSdeDepositStatus", /* PK attribute */
		"SDE_DEPOSIT_STATUS = ? ")
				.addFilterBy("filterBySdeDepositStatusMatch",
						"SDE_DEPOSIT_STATUS LIKE ?")
				.addFilterBy("INSdeDepositStatus",
						"SDE_DEPOSIT_STATUS IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeDepositStatus",
						"SDE_DEPOSIT_STATUS NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeDepositStatus",
						"SDE_DEPOSIT_STATUS != ?") // NOTEQUAL

				.addFilterBy("nullSdeDepositStatus",
						"(SDE_DEPOSIT_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeDepositStatus",
						"SDE_DEPOSIT_STATUS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeDepositStatus",
						"SDE_DEPOSIT_STATUS < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeDepositStatus",
						"SDE_DEPOSIT_STATUS > ? ") // GREATER THAN

				.addFilterBy("filterBySdeDepositStatusMatch",
						"SDE_DEPOSIT_STATUS LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeDepositStatus",
						"(SDE_DEPOSIT_STATUS = ? OR SDE_DEPOSIT_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeDepositStatus asc", "SDE_DEPOSIT_STATUS ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdeDepositStatus desc", "SDE_DEPOSIT_STATUS DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSdeDeactDate", /* PK attribute */
		"SDE_DEACT_DATE = ? ")
				.addFilterBy("filterBySdeDeactDateMatch",
						"SDE_DEACT_DATE LIKE ?")
				.addFilterBy("INSdeDeactDate", "SDE_DEACT_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeDeactDate", "SDE_DEACT_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSdeDeactDate", "SDE_DEACT_DATE != ?") // NOTEQUAL

				.addFilterBy("nullSdeDeactDate",
						"(SDE_DEACT_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeDeactDate",
						"SDE_DEACT_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeDeactDate", "SDE_DEACT_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdeDeactDate", "SDE_DEACT_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySdeDeactDateMatch",
						"SDE_DEACT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSdeDeactDate",
						"(SDE_DEACT_DATE = ? OR SDE_DEACT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeDeactDate asc", "SDE_DEACT_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SdeDeactDate desc", "SDE_DEACT_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeReleaseDate", /* PK attribute */
		"SDE_RELEASE_DATE = ? ")
				.addFilterBy("filterBySdeReleaseDateMatch",
						"SDE_RELEASE_DATE LIKE ?")
				.addFilterBy("INSdeReleaseDate", "SDE_RELEASE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeReleaseDate",
						"SDE_RELEASE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeReleaseDate", "SDE_RELEASE_DATE != ?") // NOTEQUAL

				.addFilterBy("nullSdeReleaseDate",
						"(SDE_RELEASE_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeReleaseDate",
						"SDE_RELEASE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeReleaseDate", "SDE_RELEASE_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdeReleaseDate",
						"SDE_RELEASE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterBySdeReleaseDateMatch",
						"SDE_RELEASE_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdeReleaseDate",
						"(SDE_RELEASE_DATE = ? OR SDE_RELEASE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeReleaseDate asc", "SDE_RELEASE_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeReleaseDate desc", "SDE_RELEASE_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdeAmountDue", /* PK attribute */
		"SDE_AMOUNT_DUE = ? ")
				.addFilterBy("filterBySdeAmountDueMatch",
						"SDE_AMOUNT_DUE LIKE ?")
				.addFilterBy("INSdeAmountDue", "SDE_AMOUNT_DUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeAmountDue", "SDE_AMOUNT_DUE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSdeAmountDue", "SDE_AMOUNT_DUE != ?") // NOTEQUAL

				.addFilterBy("nullSdeAmountDue",
						"(SDE_AMOUNT_DUE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeAmountDue",
						"SDE_AMOUNT_DUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeAmountDue", "SDE_AMOUNT_DUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdeAmountDue", "SDE_AMOUNT_DUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySdeAmountDueMatch",
						"SDE_AMOUNT_DUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSdeAmountDue",
						"(SDE_AMOUNT_DUE = ? OR SDE_AMOUNT_DUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeAmountDue asc", "SDE_AMOUNT_DUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SdeAmountDue desc", "SDE_AMOUNT_DUE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeAmountPaid", /* PK attribute */
		"SDE_AMOUNT_PAID = ? ")
				.addFilterBy("filterBySdeAmountPaidMatch",
						"SDE_AMOUNT_PAID LIKE ?")
				.addFilterBy("INSdeAmountPaid", "SDE_AMOUNT_PAID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeAmountPaid",
						"SDE_AMOUNT_PAID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeAmountPaid", "SDE_AMOUNT_PAID != ?") // NOTEQUAL

				.addFilterBy("nullSdeAmountPaid",
						"(SDE_AMOUNT_PAID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeAmountPaid",
						"SDE_AMOUNT_PAID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeAmountPaid", "SDE_AMOUNT_PAID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdeAmountPaid", "SDE_AMOUNT_PAID > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySdeAmountPaidMatch",
						"SDE_AMOUNT_PAID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdeAmountPaid",
						"(SDE_AMOUNT_PAID = ? OR SDE_AMOUNT_PAID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeAmountPaid asc", "SDE_AMOUNT_PAID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeAmountPaid desc", "SDE_AMOUNT_PAID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSdeServiceStatus", /* PK attribute */
		"SDE_SERVICE_STATUS = ? ")
				.addFilterBy("filterBySdeServiceStatusMatch",
						"SDE_SERVICE_STATUS LIKE ?")
				.addFilterBy("INSdeServiceStatus",
						"SDE_SERVICE_STATUS IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeServiceStatus",
						"SDE_SERVICE_STATUS NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeServiceStatus",
						"SDE_SERVICE_STATUS != ?") // NOTEQUAL

				.addFilterBy("nullSdeServiceStatus",
						"(SDE_SERVICE_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeServiceStatus",
						"SDE_SERVICE_STATUS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeServiceStatus",
						"SDE_SERVICE_STATUS < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeServiceStatus",
						"SDE_SERVICE_STATUS > ? ") // GREATER THAN

				.addFilterBy("filterBySdeServiceStatusMatch",
						"SDE_SERVICE_STATUS LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeServiceStatus",
						"(SDE_SERVICE_STATUS = ? OR SDE_SERVICE_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeServiceStatus asc", "SDE_SERVICE_STATUS ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdeServiceStatus desc", "SDE_SERVICE_STATUS DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSdeBatchRunNum", /* PK attribute */
		"SDE_BATCH_RUN_NUM = ? ")
				.addFilterBy("filterBySdeBatchRunNumMatch",
						"SDE_BATCH_RUN_NUM LIKE ?")
				.addFilterBy("INSdeBatchRunNum", "SDE_BATCH_RUN_NUM IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeBatchRunNum",
						"SDE_BATCH_RUN_NUM NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeBatchRunNum", "SDE_BATCH_RUN_NUM != ?") // NOTEQUAL

				.addFilterBy("nullSdeBatchRunNum",
						"(SDE_BATCH_RUN_NUM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeBatchRunNum",
						"SDE_BATCH_RUN_NUM IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeBatchRunNum", "SDE_BATCH_RUN_NUM < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanSdeBatchRunNum",
						"SDE_BATCH_RUN_NUM > ? ") // GREATER THAN

				.addFilterBy("filterBySdeBatchRunNumMatch",
						"SDE_BATCH_RUN_NUM LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeBatchRunNum",
						"(SDE_BATCH_RUN_NUM = ? OR SDE_BATCH_RUN_NUM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeBatchRunNum asc", "SDE_BATCH_RUN_NUM ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdeBatchRunNum desc", "SDE_BATCH_RUN_NUM DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdeSimNo", /* PK attribute */
		"SDE_SIM_NO = ? ")
				.addFilterBy("filterBySdeSimNoMatch", "SDE_SIM_NO LIKE ?")
				.addFilterBy("INSdeSimNo", "SDE_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSdeSimNo", "SDE_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSdeSimNo", "SDE_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSdeSimNo",
						"(SDE_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullSdeSimNo", "SDE_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSdeSimNo", "SDE_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeSimNo", "SDE_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySdeSimNoMatch", "SDE_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSdeSimNo",
						"(SDE_SIM_NO = ? OR SDE_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeSimNo asc", "SDE_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SdeSimNo desc", "SDE_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSdeMsisdnNo", /* PK attribute */
		"SDE_MSISDN_NO = ? ")
				.addFilterBy("filterBySdeMsisdnNoMatch", "SDE_MSISDN_NO LIKE ?")
				.addFilterBy("INSdeMsisdnNo", "SDE_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeMsisdnNo", "SDE_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSdeMsisdnNo", "SDE_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy("nullSdeMsisdnNo",
						"(SDE_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdeMsisdnNo",
						"SDE_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeMsisdnNo", "SDE_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdeMsisdnNo", "SDE_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySdeMsisdnNoMatch",
						"SDE_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSdeMsisdnNo",
						"(SDE_MSISDN_NO = ? OR SDE_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeMsisdnNo asc", "SDE_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SdeMsisdnNo desc", "SDE_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSdePendLetterId", /* PK attribute */
		"SDE_PEND_LETTER_ID = ? ")
				.addFilterBy("filterBySdePendLetterIdMatch",
						"SDE_PEND_LETTER_ID LIKE ?")
				.addFilterBy("INSdePendLetterId",
						"SDE_PEND_LETTER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdePendLetterId",
						"SDE_PEND_LETTER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdePendLetterId",
						"SDE_PEND_LETTER_ID != ?") // NOTEQUAL

				.addFilterBy("nullSdePendLetterId",
						"(SDE_PEND_LETTER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdePendLetterId",
						"SDE_PEND_LETTER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdePendLetterId",
						"SDE_PEND_LETTER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSdePendLetterId",
						"SDE_PEND_LETTER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySdePendLetterIdMatch",
						"SDE_PEND_LETTER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdePendLetterId",
						"(SDE_PEND_LETTER_ID = ? OR SDE_PEND_LETTER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdePendLetterId asc", "SDE_PEND_LETTER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdePendLetterId desc", "SDE_PEND_LETTER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdeCurrency", /* PK attribute */
		"SDE_CURRENCY = ? ")
				.addFilterBy("filterBySdeCurrencyMatch", "SDE_CURRENCY LIKE ?")
				.addFilterBy("INSdeCurrency", "SDE_CURRENCY IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSdeCurrency", "SDE_CURRENCY NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSdeCurrency", "SDE_CURRENCY != ?")
				// NOTEQUAL

				.addFilterBy("nullSdeCurrency",
						"(SDE_CURRENCY IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullSdeCurrency", "SDE_CURRENCY IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanSdeCurrency", "SDE_CURRENCY < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdeCurrency", "SDE_CURRENCY > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySdeCurrencyMatch", "SDE_CURRENCY LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullSdeCurrency",
						"(SDE_CURRENCY = ? OR SDE_CURRENCY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeCurrency asc", "SDE_CURRENCY ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SdeCurrency desc", "SDE_CURRENCY DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSdeExchangeRate", /* PK attribute */
		"SDE_EXCHANGE_RATE = ? ")
				.addFilterBy("filterBySdeExchangeRateMatch",
						"SDE_EXCHANGE_RATE LIKE ?")
				.addFilterBy("INSdeExchangeRate", "SDE_EXCHANGE_RATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdeExchangeRate",
						"SDE_EXCHANGE_RATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdeExchangeRate",
						"SDE_EXCHANGE_RATE != ?") // NOTEQUAL

				.addFilterBy("nullSdeExchangeRate",
						"(SDE_EXCHANGE_RATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdeExchangeRate",
						"SDE_EXCHANGE_RATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdeExchangeRate",
						"SDE_EXCHANGE_RATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSdeExchangeRate",
						"SDE_EXCHANGE_RATE > ? ") // GREATER THAN

				.addFilterBy("filterBySdeExchangeRateMatch",
						"SDE_EXCHANGE_RATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdeExchangeRate",
						"(SDE_EXCHANGE_RATE = ? OR SDE_EXCHANGE_RATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdeExchangeRate asc", "SDE_EXCHANGE_RATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdeExchangeRate desc", "SDE_EXCHANGE_RATE DESC ") // ORDER
																				// DESCENDING
		;

	}

}