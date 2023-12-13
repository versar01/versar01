package com.eppixcomm.eppix.base.dml;

public class PswPrepaidSwapAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;

	protected PswPrepaidSwapAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"PswPrepaidSwap", // DML Name
				"blo.PswPrepaidSwapDMO", // dmoName
				"psw_prepaid_swap", // tableName
				7, // numColumns
				"PSW_SUBSCRIBER_ID, PSW_MSISDN_NO, PSW_OLD_SIM_NO, PSW_NEW_SIM_NO, PSW_SIM_STATUS, PSW_STATUS_DATE, PSW_RECEIPT_DATE", // columnList
				"PSW_NEW_SIM_NO", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"PSW_SUBSCRIBER_ID, PSW_MSISDN_NO, PSW_OLD_SIM_NO, PSW_NEW_SIM_NO, PSW_SIM_STATUS, PSW_STATUS_DATE, PSW_RECEIPT_DATE",
				"", "", new String[] { "PSW_SUBSCRIBER_ID", "PSW_MSISDN_NO",
						"PSW_OLD_SIM_NO", "PSW_NEW_SIM_NO", "PSW_SIM_STATUS",
						"PSW_STATUS_DATE", "PSW_RECEIPT_DATE" }, true);
		table.addFilterBy("equalPswSubscriberId", /* PK attribute */
		"PSW_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByPswSubscriberIdMatch",
						"PSW_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INPswSubscriberId", "PSW_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPswSubscriberId",
						"PSW_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPswSubscriberId",
						"PSW_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswSubscriberId",
						"(PSW_SUBSCRIBER_ID IS NULL OR LENGTH(PSW_SUBSCRIBER_ID) IS NULL OR LENGTH(PSW_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullPswSubscriberId",
						"PSW_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswSubscriberId",
						"PSW_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanPswSubscriberId",
						"PSW_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByPswSubscriberIdMatch",
						"PSW_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPswSubscriberId",
						"(PSW_SUBSCRIBER_ID = ? OR PSW_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswSubscriberId asc", "PSW_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PswSubscriberId desc", "PSW_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPswMsisdnNo", /* PK attribute */
		"PSW_MSISDN_NO = ? ")
				.addFilterBy("filterByPswMsisdnNoMatch", "PSW_MSISDN_NO LIKE ?")
				.addFilterBy("INPswMsisdnNo", "PSW_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINPswMsisdnNo", "PSW_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPswMsisdnNo", "PSW_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswMsisdnNo",
						"(PSW_MSISDN_NO IS NULL OR LENGTH(PSW_MSISDN_NO) IS NULL OR LENGTH(PSW_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPswMsisdnNo",
						"PSW_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswMsisdnNo", "PSW_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPswMsisdnNo", "PSW_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPswMsisdnNoMatch",
						"PSW_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPswMsisdnNo",
						"(PSW_MSISDN_NO = ? OR PSW_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswMsisdnNo asc", "PSW_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PswMsisdnNo desc", "PSW_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPswOldSimNo", /* PK attribute */
		"PSW_OLD_SIM_NO = ? ")
				.addFilterBy("filterByPswOldSimNoMatch",
						"PSW_OLD_SIM_NO LIKE ?")
				.addFilterBy("INPswOldSimNo", "PSW_OLD_SIM_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINPswOldSimNo", "PSW_OLD_SIM_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPswOldSimNo", "PSW_OLD_SIM_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswOldSimNo",
						"(PSW_OLD_SIM_NO IS NULL OR LENGTH(PSW_OLD_SIM_NO) IS NULL OR LENGTH(PSW_OLD_SIM_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPswOldSimNo",
						"PSW_OLD_SIM_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswOldSimNo", "PSW_OLD_SIM_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPswOldSimNo", "PSW_OLD_SIM_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPswOldSimNoMatch",
						"PSW_OLD_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPswOldSimNo",
						"(PSW_OLD_SIM_NO = ? OR PSW_OLD_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswOldSimNo asc", "PSW_OLD_SIM_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PswOldSimNo desc", "PSW_OLD_SIM_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPswNewSimNo", /* PK attribute */
		"PSW_NEW_SIM_NO = ? ")
				.addFilterBy("filterByPswNewSimNoMatch",
						"PSW_NEW_SIM_NO LIKE ?")
				.addFilterBy("INPswNewSimNo", "PSW_NEW_SIM_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINPswNewSimNo", "PSW_NEW_SIM_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPswNewSimNo", "PSW_NEW_SIM_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswNewSimNo",
						"(PSW_NEW_SIM_NO IS NULL OR LENGTH(PSW_NEW_SIM_NO) IS NULL OR LENGTH(PSW_NEW_SIM_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPswNewSimNo",
						"PSW_NEW_SIM_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswNewSimNo", "PSW_NEW_SIM_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPswNewSimNo", "PSW_NEW_SIM_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPswNewSimNoMatch",
						"PSW_NEW_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPswNewSimNo",
						"(PSW_NEW_SIM_NO = ? OR PSW_NEW_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswNewSimNo asc", "PSW_NEW_SIM_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PswNewSimNo desc", "PSW_NEW_SIM_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPswSimStatus", /* PK attribute */
		"PSW_SIM_STATUS = ? ")
				.addFilterBy("filterByPswSimStatusMatch",
						"PSW_SIM_STATUS LIKE ?")
				.addFilterBy("INPswSimStatus", "PSW_SIM_STATUS IN ( ? ) ") // IN

				.addFilterBy("NOTINPswSimStatus", "PSW_SIM_STATUS NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalPswSimStatus", "PSW_SIM_STATUS != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswSimStatus",
						"(PSW_SIM_STATUS IS NULL OR LENGTH(PSW_SIM_STATUS) IS NULL OR LENGTH(PSW_SIM_STATUS) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPswSimStatus",
						"PSW_SIM_STATUS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswSimStatus", "PSW_SIM_STATUS < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPswSimStatus", "PSW_SIM_STATUS > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPswSimStatusMatch",
						"PSW_SIM_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPswSimStatus",
						"(PSW_SIM_STATUS = ? OR PSW_SIM_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswSimStatus asc", "Psw_SIM_STATUS ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PswSimStatus desc", "PSW_SIM_STATUS DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPswStatusDate", /* PK attribute */
		"PSW_STATUS_DATE = ? ")
				.addFilterBy("filterByPswStatusDateMatch",
						"PSW_STATUS_DATE LIKE ?")
				.addFilterBy("INPswStatusDate", "PSW_STATUS_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPswStatusDate",
						"PSW_STATUS_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPswStatusDate", "PSW_STATUS_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswStatusDate",
						"(PSW_STATUS_DATE IS NULL OR LENGTH(PSW_STATUS_DATE) IS NULL OR LENGTH(PSW_STATUS_DATE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullPswStatusDate",
						"PSW_STATUS_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswStatusDate", "PSW_STATUS_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPswStatusDate", "PSW_STATUS_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByPswStatusDateMatch",
						"PSW_STATUS_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPswStatusDate",
						"(PSW_STATUS_DATE = ? OR PSW_STATUS_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswStatusDate asc", "PSW_STATUS_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PswStatusDate desc", "PSW_STATUS_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPswReceiptDate", /* PK attribute */
		"PSW_RECEIPT_DATE = ? ")
				.addFilterBy("filterByPswReceiptDateMatch",
						"PSW_RECEIPT_DATE LIKE ?")
				.addFilterBy("INPswReceiptDate", "PSW_RECEIPT_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPswReceiptDate",
						"PSW_RECEIPT_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPswReceiptDate", "PSW_RECEIPT_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPswReceiptDate",
						"(PSW_RECEIPT_DATE IS NULL OR LENGTH(PSW_RECEIPT_DATE) IS NULL OR LENGTH(PSW_RECEIPT_DATE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullPswReceiptDate",
						"PSW_RECEIPT_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPswReceiptDate", "PSW_RECEIPT_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPswReceiptDate",
						"PSW_RECEIPT_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByPswReceiptDateMatch",
						"PSW_RECEIPT_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPswReceiptDate",
						"(PSW_RECEIPT_DATE = ? OR PSW_RECEIPT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PswReceiptDate asc", "PSW_RECEIPT_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PswReceiptDate desc", "PSW_RECEIPT_DATE DESC ") // ORDER
																				// DESCENDING
		;

	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PswPrepaidSwapAbstractDMLFactory();
		}

		return dml;
	}

}