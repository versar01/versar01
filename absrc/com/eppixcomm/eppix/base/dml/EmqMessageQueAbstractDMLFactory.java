package com.eppixcomm.eppix.base.dml;

public class EmqMessageQueAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected EmqMessageQueAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"EmqMessageQue", // DML Name
				"blo.EmqMessageQueDMO", // dmoName
				"emq_message_que", // tableName
				19, // numColumns
				"EMQ_SERIAL, EMQ_MESSAGE_ID, EMQ_ACCOUNT_NO, EMQ_MSISDN_NO, EMQ_SIM_NO, EMQ_HISTORY_CODE, EMQ_DOC_LOC, EMQ_SENDER, EMQ_RECEIVER, EMQ_SUBJECT, EMQ_ATTENTION, EMQ_OLD_VALUE, EMQ_NEW_VALUE, EMQ_STATUS, EMQ_COMMENT, EMQ_SUBMITTED_DATE, EMQ_PROCESSED_DATE, EMQ_MESSAGE_TYPE, EMQ_MESS_INTERVAL", // columnList
				"EMQ_SERIAL", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"EMQ_SERIAL, EMQ_MESSAGE_ID, EMQ_ACCOUNT_NO, EMQ_MSISDN_NO, EMQ_SIM_NO, EMQ_HISTORY_CODE, EMQ_DOC_LOC, EMQ_SENDER, EMQ_RECEIVER, EMQ_SUBJECT, EMQ_ATTENTION, EMQ_OLD_VALUE, EMQ_NEW_VALUE, EMQ_STATUS, EMQ_COMMENT, EMQ_SUBMITTED_DATE, EMQ_PROCESSED_DATE, EMQ_MESSAGE_TYPE, EMQ_MESS_INTERVAL",
				"", "", new String[] { "EMQ_SERIAL", "EMQ_MESSAGE_ID",
						"EMQ_ACCOUNT_NO", "EMQ_MSISDN_NO", "EMQ_SIM_NO",
						"EMQ_HISTORY_CODE", "EMQ_DOC_LOC", "EMQ_SENDER",
						"EMQ_RECEIVER", "EMQ_SUBJECT", "EMQ_ATTENTION",
						"EMQ_OLD_VALUE", "EMQ_NEW_VALUE", "EMQ_STATUS",
						"EMQ_COMMENT", "EMQ_SUBMITTED_DATE",
						"EMQ_PROCESSED_DATE","EMQ_MESSAGE_TYPE", "EMQ_MESS_INTERVAL"}, true);
		table.addFilterBy("equalEmqSerial", /* PK attribute */
		"EMQ_SERIAL = ? ")
				.addFilterBy("filterByEmqSerialMatch", "EMQ_SERIAL LIKE ?")
				.addFilterBy("INEmqSerial", "EMQ_SERIAL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqSerial", "EMQ_SERIAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqSerial", "EMQ_SERIAL != ?")
				// NOTEQUAL

				.addFilterBy("nullEmqSerial",
						"(EMQ_SERIAL IS NULL OR LENGTH(EMQ_SERIAL) IS NULL OR LENGTH(EMQ_SERIAL) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmqSerial", "EMQ_SERIAL IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqSerial", "EMQ_SERIAL < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqSerial", "EMQ_SERIAL > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmqSerialMatch", "EMQ_SERIAL LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqSerial",
						"(EMQ_SERIAL = ? OR EMQ_SERIAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqSerial asc", "EMQ_SERIAL ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmqSerial desc", "EMQ_SERIAL DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqMessageId", /* PK attribute */
		"EMQ_MESSAGE_ID = ? ")
				.addFilterBy("filterByEmqMessageIdMatch",
						"EMQ_MESSAGE_ID LIKE ?")
				.addFilterBy("INEmqMessageId", "EMQ_MESSAGE_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqMessageId", "EMQ_MESSAGE_ID NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalEmqMessageId", "EMQ_MESSAGE_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqMessageId",
						"(EMQ_MESSAGE_ID IS NULL OR LENGTH(EMQ_MESSAGE_ID) IS NULL OR LENGTH(EMQ_MESSAGE_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqMessageId",
						"EMQ_MESSAGE_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqMessageId", "EMQ_MESSAGE_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqMessageId", "EMQ_MESSAGE_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqMessageIdMatch",
						"EMQ_MESSAGE_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqMessageId",
						"(EMQ_MESSAGE_ID = ? OR EMQ_MESSAGE_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqMessageId asc", "EMQ_MESSAGE_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqMessageId desc", "EMQ_MESSAGE_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalEmqAccountNo", /* PK attribute */
		"EMQ_ACCOUNT_NO = ? ")
				.addFilterBy("filterByEmqAccountNoMatch",
						"EMQ_ACCOUNT_NO LIKE ?")
				.addFilterBy("INEmqAccountNo", "EMQ_ACCOUNT_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqAccountNo", "EMQ_ACCOUNT_NO NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalEmqAccountNo", "EMQ_ACCOUNT_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqAccountNo",
						"(EMQ_ACCOUNT_NO IS NULL OR LENGTH(EMQ_ACCOUNT_NO) IS NULL OR LENGTH(EMQ_ACCOUNT_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqAccountNo",
						"EMQ_ACCOUNT_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqAccountNo", "EMQ_ACCOUNT_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqAccountNo", "EMQ_ACCOUNT_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqAccountNoMatch",
						"EMQ_ACCOUNT_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqAccountNo",
						"(EMQ_ACCOUNT_NO = ? OR EMQ_ACCOUNT_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqAccountNo asc", "EMQ_ACCOUNT_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqAccountNo desc", "EMQ_ACCOUNT_NO DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalEmqMsisdnNo", /* PK attribute */
		"EMQ_MSISDN_NO = ? ")
				.addFilterBy("filterByEmqMsisdnNoMatch", "EMQ_MSISDN_NO LIKE ?")
				.addFilterBy("INEmqMsisdnNo", "EMQ_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqMsisdnNo", "EMQ_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmqMsisdnNo", "EMQ_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqMsisdnNo",
						"(EMQ_MSISDN_NO IS NULL OR LENGTH(EMQ_MSISDN_NO) IS NULL OR LENGTH(EMQ_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqMsisdnNo",
						"EMQ_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqMsisdnNo", "EMQ_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqMsisdnNo", "EMQ_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqMsisdnNoMatch",
						"EMQ_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqMsisdnNo",
						"(EMQ_MSISDN_NO = ? OR EMQ_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqMsisdnNo asc", "EMQ_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqMsisdnNo desc", "EMQ_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmqSimNo", /* PK attribute */
		"EMQ_SIM_NO = ? ")
				.addFilterBy("filterByEmqSimNoMatch", "EMQ_SIM_NO LIKE ?")
				.addFilterBy("INEmqSimNo", "EMQ_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqSimNo", "EMQ_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqSimNo", "EMQ_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullEmqSimNo",
						"(EMQ_SIM_NO IS NULL OR LENGTH(EMQ_SIM_NO) IS NULL OR LENGTH(EMQ_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmqSimNo", "EMQ_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanEmqSimNo", "EMQ_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanEmqSimNo", "EMQ_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmqSimNoMatch", "EMQ_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullEmqSimNo",
						"(EMQ_SIM_NO = ? OR EMQ_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqSimNo asc", "EMQ_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmqSimNo desc", "EMQ_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqHistoryCode", /* PK attribute */
		"EMQ_HISTORY_CODE = ? ")
				.addFilterBy("filterByEmqHistoryCodeMatch",
						"EMQ_HISTORY_CODE LIKE ?")
				.addFilterBy("INEmqHistoryCode", "EMQ_HISTORY_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqHistoryCode",
						"EMQ_HISTORY_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmqHistoryCode", "EMQ_HISTORY_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqHistoryCode",
						"(EMQ_HISTORY_CODE IS NULL OR LENGTH(EMQ_HISTORY_CODE) IS NULL OR LENGTH(EMQ_HISTORY_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullEmqHistoryCode",
						"EMQ_HISTORY_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqHistoryCode", "EMQ_HISTORY_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanEmqHistoryCode",
						"EMQ_HISTORY_CODE > ? ") // GREATER THAN

				.addFilterBy("filterByEmqHistoryCodeMatch",
						"EMQ_HISTORY_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullEmqHistoryCode",
						"(EMQ_HISTORY_CODE = ? OR EMQ_HISTORY_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqHistoryCode asc", "EMQ_HISTORY_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("EmqHistoryCode desc", "EMQ_HISTORY_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalEmqDocLoc", /* PK attribute */
		"EMQ_DOC_LOC = ? ")
				.addFilterBy("filterByEmqDocLocMatch", "EMQ_DOC_LOC LIKE ?")
				.addFilterBy("INEmqDocLoc", "EMQ_DOC_LOC IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqDocLoc", "EMQ_DOC_LOC NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqDocLoc", "EMQ_DOC_LOC != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmqDocLoc",
						"(EMQ_DOC_LOC IS NULL OR LENGTH(EMQ_DOC_LOC) IS NULL OR LENGTH(EMQ_DOC_LOC) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmqDocLoc", "EMQ_DOC_LOC IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqDocLoc", "EMQ_DOC_LOC < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqDocLoc", "EMQ_DOC_LOC > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmqDocLocMatch", "EMQ_DOC_LOC LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqDocLoc",
						"(EMQ_DOC_LOC = ? OR EMQ_DOC_LOC IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqDocLoc asc", "EMQ_DOC_LOC ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmqDocLoc desc", "EMQ_DOC_LOC DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqSender", /* PK attribute */
		"EMQ_SENDER = ? ")
				.addFilterBy("filterByEmqSenderMatch", "EMQ_SENDER LIKE ?")
				.addFilterBy("INEmqSender", "EMQ_SENDER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqSender", "EMQ_SENDER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqSender", "EMQ_SENDER != ?")
				// NOTEQUAL

				.addFilterBy("nullEmqSender",
						"(EMQ_SENDER IS NULL OR LENGTH(EMQ_SENDER) IS NULL OR LENGTH(EMQ_SENDER) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmqSender", "EMQ_SENDER IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqSender", "EMQ_SENDER < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqSender", "EMQ_SENDER > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmqSenderMatch", "EMQ_SENDER LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqSender",
						"(EMQ_SENDER = ? OR EMQ_SENDER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqSender asc", "EMQ_SENDER ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmqSender desc", "EMQ_SENDER DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqReceiver", /* PK attribute */
		"EMQ_RECEIVER = ? ")
				.addFilterBy("filterByEmqReceiverMatch", "EMQ_RECEIVER LIKE ?")
				.addFilterBy("INEmqReceiver", "EMQ_RECEIVER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqReceiver", "EMQ_RECEIVER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqReceiver", "EMQ_RECEIVER != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmqReceiver",
						"(EMQ_RECEIVER IS NULL OR LENGTH(EMQ_RECEIVER) IS NULL OR LENGTH(EMQ_RECEIVER) = 0)") // IS
																												// NULL

				.addFilterBy("notnullEmqReceiver", "EMQ_RECEIVER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanEmqReceiver", "EMQ_RECEIVER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqReceiver", "EMQ_RECEIVER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmqReceiverMatch", "EMQ_RECEIVER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullEmqReceiver",
						"(EMQ_RECEIVER = ? OR EMQ_RECEIVER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqReceiver asc", "EMQ_RECEIVER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmqReceiver desc", "EMQ_RECEIVER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmqSubject", /* PK attribute */
		"EMQ_SUBJECT = ? ")
				.addFilterBy("filterByEmqSubjectMatch", "EMQ_SUBJECT LIKE ?")
				.addFilterBy("INEmqSubject", "EMQ_SUBJECT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqSubject", "EMQ_SUBJECT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqSubject", "EMQ_SUBJECT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmqSubject",
						"(EMQ_SUBJECT IS NULL OR LENGTH(EMQ_SUBJECT) IS NULL OR LENGTH(EMQ_SUBJECT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmqSubject", "EMQ_SUBJECT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqSubject", "EMQ_SUBJECT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqSubject", "EMQ_SUBJECT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmqSubjectMatch", "EMQ_SUBJECT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqSubject",
						"(EMQ_SUBJECT = ? OR EMQ_SUBJECT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqSubject asc", "EMQ_SUBJECT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmqSubject desc", "EMQ_SUBJECT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqAttention", /* PK attribute */
		"EMQ_ATTENTION = ? ")
				.addFilterBy("filterByEmqAttentionMatch",
						"EMQ_ATTENTION LIKE ?")
				.addFilterBy("INEmqAttention", "EMQ_ATTENTION IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqAttention", "EMQ_ATTENTION NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmqAttention", "EMQ_ATTENTION != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqAttention",
						"(EMQ_ATTENTION IS NULL OR LENGTH(EMQ_ATTENTION) IS NULL OR LENGTH(EMQ_ATTENTION) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqAttention",
						"EMQ_ATTENTION IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqAttention", "EMQ_ATTENTION < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqAttention", "EMQ_ATTENTION > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqAttentionMatch",
						"EMQ_ATTENTION LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqAttention",
						"(EMQ_ATTENTION = ? OR EMQ_ATTENTION IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqAttention asc", "EMQ_ATTENTION ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqAttention desc", "EMQ_ATTENTION DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmqOldValue", /* PK attribute */
		"EMQ_OLD_VALUE = ? ")
				.addFilterBy("filterByEmqOldValueMatch", "EMQ_OLD_VALUE LIKE ?")
				.addFilterBy("INEmqOldValue", "EMQ_OLD_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqOldValue", "EMQ_OLD_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmqOldValue", "EMQ_OLD_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqOldValue",
						"(EMQ_OLD_VALUE IS NULL OR LENGTH(EMQ_OLD_VALUE) IS NULL OR LENGTH(EMQ_OLD_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqOldValue",
						"EMQ_OLD_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqOldValue", "EMQ_OLD_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqOldValue", "EMQ_OLD_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqOldValueMatch",
						"EMQ_OLD_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqOldValue",
						"(EMQ_OLD_VALUE = ? OR EMQ_OLD_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqOldValue asc", "EMQ_OLD_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqOldValue desc", "EMQ_OLD_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmqNewValue", /* PK attribute */
		"EMQ_NEW_VALUE = ? ")
				.addFilterBy("filterByEmqNewValueMatch", "EMQ_NEW_VALUE LIKE ?")
				.addFilterBy("INEmqNewValue", "EMQ_NEW_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqNewValue", "EMQ_NEW_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmqNewValue", "EMQ_NEW_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqNewValue",
						"(EMQ_NEW_VALUE IS NULL OR LENGTH(EMQ_NEW_VALUE) IS NULL OR LENGTH(EMQ_NEW_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmqNewValue",
						"EMQ_NEW_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqNewValue", "EMQ_NEW_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmqNewValue", "EMQ_NEW_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmqNewValueMatch",
						"EMQ_NEW_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmqNewValue",
						"(EMQ_NEW_VALUE = ? OR EMQ_NEW_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqNewValue asc", "EMQ_NEW_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmqNewValue desc", "EMQ_NEW_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmqStatus", /* PK attribute */
		"EMQ_STATUS = ? ")
				.addFilterBy("filterByEmqStatusMatch", "EMQ_STATUS LIKE ?")
				.addFilterBy("INEmqStatus", "EMQ_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqStatus", "EMQ_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqStatus", "EMQ_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullEmqStatus",
						"(EMQ_STATUS IS NULL OR LENGTH(EMQ_STATUS) IS NULL OR LENGTH(EMQ_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmqStatus", "EMQ_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqStatus", "EMQ_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqStatus", "EMQ_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmqStatusMatch", "EMQ_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqStatus",
						"(EMQ_STATUS = ? OR EMQ_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqStatus asc", "EMQ_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmqStatus desc", "EMQ_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqComment", /* PK attribute */
		"EMQ_COMMENT = ? ")
				.addFilterBy("filterByEmqCommentMatch", "EMQ_COMMENT LIKE ?")
				.addFilterBy("INEmqComment", "EMQ_COMMENT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmqComment", "EMQ_COMMENT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmqComment", "EMQ_COMMENT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmqComment",
						"(EMQ_COMMENT IS NULL OR LENGTH(EMQ_COMMENT) IS NULL OR LENGTH(EMQ_COMMENT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmqComment", "EMQ_COMMENT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmqComment", "EMQ_COMMENT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmqComment", "EMQ_COMMENT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmqCommentMatch", "EMQ_COMMENT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmqComment",
						"(EMQ_COMMENT = ? OR EMQ_COMMENT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqComment asc", "EMQ_COMMENT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmqComment desc", "EMQ_COMMENT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmqSubmittedDate", /* PK attribute */
		"EMQ_SUBMITTED_DATE = ? ")
				.addFilterBy("filterByEmqSubmittedDateMatch",
						"EMQ_SUBMITTED_DATE LIKE ?")
				.addFilterBy("INEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqSubmittedDate",
						"(EMQ_SUBMITTED_DATE IS NULL OR LENGTH(EMQ_SUBMITTED_DATE) IS NULL OR LENGTH(EMQ_SUBMITTED_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanEmqSubmittedDate",
						"EMQ_SUBMITTED_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByEmqSubmittedDateMatch",
						"EMQ_SUBMITTED_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullEmqSubmittedDate",
						"(EMQ_SUBMITTED_DATE = ? OR EMQ_SUBMITTED_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqSubmittedDate asc", "EMQ_SUBMITTED_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("EmqSubmittedDate desc", "EMQ_SUBMITTED_DATE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalEmqProcessedDate", /* PK attribute */
		"EMQ_PROCESSED_DATE = ? ")
				.addFilterBy("filterByEmqProcessedDateMatch",
						"EMQ_PROCESSED_DATE LIKE ?")
				.addFilterBy("INEmqProcessedDate",
						"EMQ_PROCESSED_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmqProcessedDate",
						"EMQ_PROCESSED_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmqProcessedDate",
						"EMQ_PROCESSED_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmqProcessedDate",
						"(EMQ_PROCESSED_DATE IS NULL OR LENGTH(EMQ_PROCESSED_DATE) IS NULL OR LENGTH(EMQ_PROCESSED_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullEmqProcessedDate",
						"EMQ_PROCESSED_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmqProcessedDate",
						"EMQ_PROCESSED_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanEmqProcessedDate",
						"EMQ_PROCESSED_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByEmqProcessedDateMatch",
						"EMQ_PROCESSED_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullEmqProcessedDate",
						"(EMQ_PROCESSED_DATE = ? OR EMQ_PROCESSED_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmqProcessedDate asc", "EMQ_PROCESSED_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("EmqProcessedDate desc", "EMQ_PROCESSED_DATE DESC ") // ORDER
																					// DESCENDING
		;
		
		table.addFilterBy("equalEmqMessageType", /* PK attribute */
"EMQ_MESSAGE_TYPE = ? ")
		.addFilterBy("filterByEmqMessageTypeMatch", "EMQ_MESSAGE_TYPE LIKE ?")
		.addFilterBy("INEmqMessageType", "EMQ_MESSAGE_TYPE IN ( ? ) ")
		// IN

		.addFilterBy("NOTINEmqMessageType", "EMQ_MESSAGE_TYPE NOT IN ( ? )")
		// NOT IN

		.addFilterBy("notequalEmqMessageType", "EMQ_MESSAGE_TYPE != ?")
		// NOTEQUAL

		.addFilterBy(
				"nullEmqMessageType",
				"(EMQ_MESSAGE_TYPE IS NULL OR LENGTH(EMQ_MESSAGE_TYPE) IS NULL OR LENGTH(EMQ_MESSAGE_TYPE) = 0)") // IS
																									// NULL

		.addFilterBy("notnullEmqMessageType", "EMQ_MESSAGE_TYPE IS NOT NULL ?") // IS
																		// NOT
																		// NULL

		.addFilterBy("lessthanEmqMessageType", "EMQ_MESSAGE_TYPE < ? ") // LESS
																// THAN

		.addFilterBy("greaterthanEmqMessageType", "EMQ_MESSAGE_TYPE > ? ") // GREATER
																	// THAN

		.addFilterBy("filterByEmqMessageTypeMatch", "EMQ_MESSAGE_TYPE LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

		.addFilterBy("equalornullEmqMessageType",
				"(EMQ_MESSAGE_TYPE = ? OR EMQ_MESSAGE_TYPE IS NULL) ") // EQUALORNULL
		// TODO : we may need to wrap this with a TRIM()

		.addOrderBy("EmqMessageType asc", "EMQ_MESSAGE_TYPE ASC ") // ORDER
															// ASCENDING

		.addOrderBy("EmqMessageType desc", "EMQ_MESSAGE_TYPE DESC ") // ORDER
															// DESCENDING
		;
		table.addFilterBy("equalEmqMessInterval", /* PK attribute */
"EMQ_MESS_INTERVAL = ? ")
		.addFilterBy("filterByEmqMessIntervalMatch", "EMQ_MESS_INTERVAL LIKE ?")
		.addFilterBy("INEmqMessInterval", "EMQ_MESS_INTERVAL IN ( ? ) ")
		// IN

		.addFilterBy("NOTINEmqMessInterval", "EMQ_MESS_INTERVAL NOT IN ( ? )")
		// NOT IN

		.addFilterBy("notequalEmqMessInterval", "EMQ_MESS_INTERVAL != ?")
		// NOTEQUAL

		.addFilterBy(
				"nullEmqMessInterval",
				"(EMQ_MESS_INTERVAL IS NULL OR LENGTH(EMQ_MESS_INTERVAL) IS NULL OR LENGTH(EMQ_MESS_INTERVAL) = 0)") // IS
																									// NULL

		.addFilterBy("notnullEmqMessInterval", "EMQ_MESS_INTERVAL IS NOT NULL ?") // IS
																		// NOT
																		// NULL

		.addFilterBy("lessthanEmqMessInterval", "EMQ_MESS_INTERVAL < ? ") // LESS
																// THAN

		.addFilterBy("greaterthanEmqMessInterval", "EMQ_MESS_INTERVAL > ? ") // GREATER
																	// THAN

		.addFilterBy("filterByEmqMessIntervalMatch", "EMQ_MESS_INTERVAL LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

		.addFilterBy("equalornullEmqMessInterval",
				"(EMQ_MESS_INTERVAL = ? OR EMQ_MESS_INTERVAL IS NULL) ") // EQUALORNULL
		// TODO : we may need to wrap this with a TRIM()

		.addOrderBy("EmqMessInterval asc", "EMQ_MESS_INTERVAL ASC ") // ORDER
															// ASCENDING

		.addOrderBy("EmqMessInterval desc", "EMQ_MESS_INTERVAL DESC ") // ORDER
															// DESCENDING
;

	}
	  /**
	   * Gets the DMLFactory singleton instance.
	   *
	   * @return the DMLFactory object reference.
	   *
	   * @throws DMLException if an error is detected when instantiating the
	   *         DMLFactory.
	   */
	public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EmqMessageQueDMLFactory(  );
	    }

	    return dml;
	  }
}