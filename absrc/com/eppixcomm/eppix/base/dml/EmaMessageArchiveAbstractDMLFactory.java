package com.eppixcomm.eppix.base.dml;

public class EmaMessageArchiveAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected EmaMessageArchiveAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"EmaMessageArchive", // DML Name
				"blo.EmaMessageArchiveDMO", // dmoName
				"ema_message_archive", // tableName
				21, // numColumns
				"EMA_SERIAL, EMA_MESSAGE_ID, EMA_ACCOUNT_NO, EMA_MSISDN_NO, EMA_SIM_NO, EMA_HISTORY_CODE, EMA_DOC_LOC, EMA_SENDER, EMA_RECEIVER, EMA_SUBJECT, EMA_ATTENTION, EMA_OLD_VALUE, EMA_NEW_VALUE, EMA_STATUS, EMA_COMMENT, EMA_SUBMITTED_DATE, EMA_PROCESSED_DATE, EMA_CONTENTS, EMA_SENT_ID, EMA_MESSAGE_TYPE, EMA_MESS_INTERVAL", // columnList
				"EMA_SERIAL", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"EMA_SERIAL, EMA_MESSAGE_ID, EMA_ACCOUNT_NO, EMA_MSISDN_NO, EMA_SIM_NO, EMA_HISTORY_CODE, EMA_DOC_LOC, EMA_SENDER, EMA_RECEIVER, EMA_SUBJECT, EMA_ATTENTION, EMA_OLD_VALUE, EMA_NEW_VALUE, EMA_STATUS, EMA_COMMENT, EMA_SUBMITTED_DATE, EMA_PROCESSED_DATE, EMA_CONTENTS, EMA_SENT_ID, EMA_MESSAGE_TYPE, EMA_MESS_INTERVAL",
				"", "", new String[] { "EMA_SERIAL", "EMA_MESSAGE_ID",
						"EMA_ACCOUNT_NO", "EMA_MSISDN_NO", "EMA_SIM_NO",
						"EMA_HISTORY_CODE", "EMA_DOC_LOC", "EMA_SENDER",
						"EMA_RECEIVER", "EMA_SUBJECT", "EMA_ATTENTION",
						"EMA_OLD_VALUE", "EMA_NEW_VALUE", "EMA_STATUS",
						"EMA_COMMENT", "EMA_SUBMITTED_DATE",
						"EMA_PROCESSED_DATE", "EMA_CONTENTS", "EMA_SENT_ID","EMA_MESSAGE_TYPE","EMA_MESS_INTERVAL" },
				true);
		table.addFilterBy("equalEmaSerial", /* PK attribute */
		"EMA_SERIAL = ? ")
				.addFilterBy("filterByEmaSerialMatch", "EMA_SERIAL LIKE ?")
				.addFilterBy("INEmaSerial", "EMA_SERIAL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaSerial", "EMA_SERIAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaSerial", "EMA_SERIAL != ?")
				// NOTEQUAL

				.addFilterBy("nullEmaSerial",
						"(EMA_SERIAL IS NULL OR LENGTH(EMA_SERIAL) IS NULL OR LENGTH(EMA_SERIAL) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmaSerial", "EMA_SERIAL IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaSerial", "EMA_SERIAL < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaSerial", "EMA_SERIAL > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmaSerialMatch", "EMA_SERIAL LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaSerial",
						"(EMA_SERIAL = ? OR EMA_SERIAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSerial asc", "EMA_SERIAL ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmaSerial desc", "EMA_SERIAL DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaMessageId", /* PK attribute */
		"EMA_MESSAGE_ID = ? ")
				.addFilterBy("filterByEmaMessageIdMatch",
						"EMA_MESSAGE_ID LIKE ?")
				.addFilterBy("INEmaMessageId", "EMA_MESSAGE_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaMessageId", "EMA_MESSAGE_ID NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalEmaMessageId", "EMA_MESSAGE_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaMessageId",
						"(EMA_MESSAGE_ID IS NULL OR LENGTH(EMA_MESSAGE_ID) IS NULL OR LENGTH(EMA_MESSAGE_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaMessageId",
						"EMA_MESSAGE_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaMessageId", "EMA_MESSAGE_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaMessageId", "EMA_MESSAGE_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaMessageIdMatch",
						"EMA_MESSAGE_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaMessageId",
						"(EMA_MESSAGE_ID = ? OR EMA_MESSAGE_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaMessageId asc", "EMA_MESSAGE_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaMessageId desc", "EMA_MESSAGE_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalEmaAccountNo", /* PK attribute */
		"EMA_ACCOUNT_NO = ? ")
				.addFilterBy("filterByEmaAccountNoMatch",
						"EMA_ACCOUNT_NO LIKE ?")
				.addFilterBy("INEmaAccountNo", "EMA_ACCOUNT_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaAccountNo", "EMA_ACCOUNT_NO NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalEmaAccountNo", "EMA_ACCOUNT_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaAccountNo",
						"(EMA_ACCOUNT_NO IS NULL OR LENGTH(EMA_ACCOUNT_NO) IS NULL OR LENGTH(EMA_ACCOUNT_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaAccountNo",
						"EMA_ACCOUNT_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaAccountNo", "EMA_ACCOUNT_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaAccountNo", "EMA_ACCOUNT_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaAccountNoMatch",
						"EMA_ACCOUNT_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaAccountNo",
						"(EMA_ACCOUNT_NO = ? OR EMA_ACCOUNT_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaAccountNo asc", "EMA_ACCOUNT_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaAccountNo desc", "EMA_ACCOUNT_NO DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalEmaMsisdnNo", /* PK attribute */
		"EMA_MSISDN_NO = ? ")
				.addFilterBy("filterByEmaMsisdnNoMatch", "EMA_MSISDN_NO LIKE ?")
				.addFilterBy("INEmaMsisdnNo", "EMA_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaMsisdnNo", "EMA_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmaMsisdnNo", "EMA_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaMsisdnNo",
						"(EMA_MSISDN_NO IS NULL OR LENGTH(EMA_MSISDN_NO) IS NULL OR LENGTH(EMA_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaMsisdnNo",
						"EMA_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaMsisdnNo", "EMA_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaMsisdnNo", "EMA_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaMsisdnNoMatch",
						"EMA_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaMsisdnNo",
						"(EMA_MSISDN_NO = ? OR EMA_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaMsisdnNo asc", "EMA_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaMsisdnNo desc", "EMA_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaSimNo", /* PK attribute */
		"EMA_SIM_NO = ? ")
				.addFilterBy("filterByEmaSimNoMatch", "EMA_SIM_NO LIKE ?")
				.addFilterBy("INEmaSimNo", "EMA_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaSimNo", "EMA_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaSimNo", "EMA_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullEmaSimNo",
						"(EMA_SIM_NO IS NULL OR LENGTH(EMA_SIM_NO) IS NULL OR LENGTH(EMA_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmaSimNo", "EMA_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanEmaSimNo", "EMA_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanEmaSimNo", "EMA_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmaSimNoMatch", "EMA_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullEmaSimNo",
						"(EMA_SIM_NO = ? OR EMA_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSimNo asc", "EMA_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmaSimNo desc", "EMA_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaHistoryCode", /* PK attribute */
		"EMA_HISTORY_CODE = ? ")
				.addFilterBy("filterByEmaHistoryCodeMatch",
						"EMA_HISTORY_CODE LIKE ?")
				.addFilterBy("INEmaHistoryCode", "EMA_HISTORY_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaHistoryCode",
						"EMA_HISTORY_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmaHistoryCode", "EMA_HISTORY_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaHistoryCode",
						"(EMA_HISTORY_CODE IS NULL OR LENGTH(EMA_HISTORY_CODE) IS NULL OR LENGTH(EMA_HISTORY_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullEmaHistoryCode",
						"EMA_HISTORY_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaHistoryCode", "EMA_HISTORY_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanEmaHistoryCode",
						"EMA_HISTORY_CODE > ? ") // GREATER THAN

				.addFilterBy("filterByEmaHistoryCodeMatch",
						"EMA_HISTORY_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullEmaHistoryCode",
						"(EMA_HISTORY_CODE = ? OR EMA_HISTORY_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaHistoryCode asc", "EMA_HISTORY_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("EmaHistoryCode desc", "EMA_HISTORY_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalEmaDocLoc", /* PK attribute */
		"EMA_DOC_LOC = ? ")
				.addFilterBy("filterByEmaDocLocMatch", "EMA_DOC_LOC LIKE ?")
				.addFilterBy("INEmaDocLoc", "EMA_DOC_LOC IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaDocLoc", "EMA_DOC_LOC NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaDocLoc", "EMA_DOC_LOC != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaDocLoc",
						"(EMA_DOC_LOC IS NULL OR LENGTH(EMA_DOC_LOC) IS NULL OR LENGTH(EMA_DOC_LOC) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaDocLoc", "EMA_DOC_LOC IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaDocLoc", "EMA_DOC_LOC < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaDocLoc", "EMA_DOC_LOC > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaDocLocMatch", "EMA_DOC_LOC LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaDocLoc",
						"(EMA_DOC_LOC = ? OR EMA_DOC_LOC IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaDocLoc asc", "EMA_DOC_LOC ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaDocLoc desc", "EMA_DOC_LOC DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaSender", /* PK attribute */
		"EMA_SENDER = ? ")
				.addFilterBy("filterByEmaSenderMatch", "EMA_SENDER LIKE ?")
				.addFilterBy("INEmaSender", "EMA_SENDER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaSender", "EMA_SENDER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaSender", "EMA_SENDER != ?")
				// NOTEQUAL

				.addFilterBy("nullEmaSender",
						"(EMA_SENDER IS NULL OR LENGTH(EMA_SENDER) IS NULL OR LENGTH(EMA_SENDER) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmaSender", "EMA_SENDER IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaSender", "EMA_SENDER < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaSender", "EMA_SENDER > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmaSenderMatch", "EMA_SENDER LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaSender",
						"(EMA_SENDER = ? OR EMA_SENDER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSender asc", "EMA_SENDER ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmaSender desc", "EMA_SENDER DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaReceiver", /* PK attribute */
		"EMA_RECEIVER = ? ")
				.addFilterBy("filterByEmaReceiverMatch", "EMA_RECEIVER LIKE ?")
				.addFilterBy("INEmaReceiver", "EMA_RECEIVER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaReceiver", "EMA_RECEIVER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaReceiver", "EMA_RECEIVER != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaReceiver",
						"(EMA_RECEIVER IS NULL OR LENGTH(EMA_RECEIVER) IS NULL OR LENGTH(EMA_RECEIVER) = 0)") // IS
																												// NULL

				.addFilterBy("notnullEmaReceiver", "EMA_RECEIVER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanEmaReceiver", "EMA_RECEIVER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaReceiver", "EMA_RECEIVER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaReceiverMatch", "EMA_RECEIVER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullEmaReceiver",
						"(EMA_RECEIVER = ? OR EMA_RECEIVER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaReceiver asc", "EMA_RECEIVER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaReceiver desc", "EMA_RECEIVER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaSubject", /* PK attribute */
		"EMA_SUBJECT = ? ")
				.addFilterBy("filterByEmaSubjectMatch", "EMA_SUBJECT LIKE ?")
				.addFilterBy("INEmaSubject", "EMA_SUBJECT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaSubject", "EMA_SUBJECT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaSubject", "EMA_SUBJECT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaSubject",
						"(EMA_SUBJECT IS NULL OR LENGTH(EMA_SUBJECT) IS NULL OR LENGTH(EMA_SUBJECT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaSubject", "EMA_SUBJECT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaSubject", "EMA_SUBJECT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaSubject", "EMA_SUBJECT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaSubjectMatch", "EMA_SUBJECT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaSubject",
						"(EMA_SUBJECT = ? OR EMA_SUBJECT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSubject asc", "EMA_SUBJECT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaSubject desc", "EMA_SUBJECT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaAttention", /* PK attribute */
		"EMA_ATTENTION = ? ")
				.addFilterBy("filterByEmaAttentionMatch",
						"EMA_ATTENTION LIKE ?")
				.addFilterBy("INEmaAttention", "EMA_ATTENTION IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaAttention", "EMA_ATTENTION NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmaAttention", "EMA_ATTENTION != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaAttention",
						"(EMA_ATTENTION IS NULL OR LENGTH(EMA_ATTENTION) IS NULL OR LENGTH(EMA_ATTENTION) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaAttention",
						"EMA_ATTENTION IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaAttention", "EMA_ATTENTION < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaAttention", "EMA_ATTENTION > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaAttentionMatch",
						"EMA_ATTENTION LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaAttention",
						"(EMA_ATTENTION = ? OR EMA_ATTENTION IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaAttention asc", "EMA_ATTENTION ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaAttention desc", "EMA_ATTENTION DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaOldValue", /* PK attribute */
		"EMA_OLD_VALUE = ? ")
				.addFilterBy("filterByEmaOldValueMatch", "EMA_OLD_VALUE LIKE ?")
				.addFilterBy("INEmaOldValue", "EMA_OLD_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaOldValue", "EMA_OLD_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmaOldValue", "EMA_OLD_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaOldValue",
						"(EMA_OLD_VALUE IS NULL OR LENGTH(EMA_OLD_VALUE) IS NULL OR LENGTH(EMA_OLD_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaOldValue",
						"EMA_OLD_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaOldValue", "EMA_OLD_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaOldValue", "EMA_OLD_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaOldValueMatch",
						"EMA_OLD_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaOldValue",
						"(EMA_OLD_VALUE = ? OR EMA_OLD_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaOldValue asc", "EMA_OLD_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaOldValue desc", "EMA_OLD_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaNewValue", /* PK attribute */
		"EMA_NEW_VALUE = ? ")
				.addFilterBy("filterByEmaNewValueMatch", "EMA_NEW_VALUE LIKE ?")
				.addFilterBy("INEmaNewValue", "EMA_NEW_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaNewValue", "EMA_NEW_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalEmaNewValue", "EMA_NEW_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaNewValue",
						"(EMA_NEW_VALUE IS NULL OR LENGTH(EMA_NEW_VALUE) IS NULL OR LENGTH(EMA_NEW_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullEmaNewValue",
						"EMA_NEW_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaNewValue", "EMA_NEW_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaNewValue", "EMA_NEW_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByEmaNewValueMatch",
						"EMA_NEW_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullEmaNewValue",
						"(EMA_NEW_VALUE = ? OR EMA_NEW_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaNewValue asc", "EMA_NEW_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("EmaNewValue desc", "EMA_NEW_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaStatus", /* PK attribute */
		"EMA_STATUS = ? ")
				.addFilterBy("filterByEmaStatusMatch", "EMA_STATUS LIKE ?")
				.addFilterBy("INEmaStatus", "EMA_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaStatus", "EMA_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaStatus", "EMA_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullEmaStatus",
						"(EMA_STATUS IS NULL OR LENGTH(EMA_STATUS) IS NULL OR LENGTH(EMA_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullEmaStatus", "EMA_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaStatus", "EMA_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaStatus", "EMA_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByEmaStatusMatch", "EMA_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaStatus",
						"(EMA_STATUS = ? OR EMA_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaStatus asc", "EMA_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("EmaStatus desc", "EMA_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaComment", /* PK attribute */
		"EMA_COMMENT = ? ")
				.addFilterBy("filterByEmaCommentMatch", "EMA_COMMENT LIKE ?")
				.addFilterBy("INEmaComment", "EMA_COMMENT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaComment", "EMA_COMMENT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaComment", "EMA_COMMENT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaComment",
						"(EMA_COMMENT IS NULL OR LENGTH(EMA_COMMENT) IS NULL OR LENGTH(EMA_COMMENT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaComment", "EMA_COMMENT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaComment", "EMA_COMMENT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaComment", "EMA_COMMENT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaCommentMatch", "EMA_COMMENT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaComment",
						"(EMA_COMMENT = ? OR EMA_COMMENT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaComment asc", "EMA_COMMENT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaComment desc", "EMA_COMMENT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalEmaSubmittedDate", /* PK attribute */
		"EMA_SUBMITTED_DATE = ? ")
				.addFilterBy("filterByEmaSubmittedDateMatch",
						"EMA_SUBMITTED_DATE LIKE ?")
				.addFilterBy("INEmaSubmittedDate",
						"EMA_SUBMITTED_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaSubmittedDate",
						"EMA_SUBMITTED_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmaSubmittedDate",
						"EMA_SUBMITTED_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaSubmittedDate",
						"(EMA_SUBMITTED_DATE IS NULL OR LENGTH(EMA_SUBMITTED_DATE) IS NULL OR LENGTH(EMA_SUBMITTED_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullEmaSubmittedDate",
						"EMA_SUBMITTED_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaSubmittedDate",
						"EMA_SUBMITTED_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanEmaSubmittedDate",
						"EMA_SUBMITTED_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByEmaSubmittedDateMatch",
						"EMA_SUBMITTED_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullEmaSubmittedDate",
						"(EMA_SUBMITTED_DATE = ? OR EMA_SUBMITTED_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSubmittedDate asc", "EMA_SUBMITTED_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("EmaSubmittedDate desc", "EMA_SUBMITTED_DATE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalEmaProcessedDate", /* PK attribute */
		"EMA_PROCESSED_DATE = ? ")
				.addFilterBy("filterByEmaProcessedDateMatch",
						"EMA_PROCESSED_DATE LIKE ?")
				.addFilterBy("INEmaProcessedDate",
						"EMA_PROCESSED_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINEmaProcessedDate",
						"EMA_PROCESSED_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalEmaProcessedDate",
						"EMA_PROCESSED_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullEmaProcessedDate",
						"(EMA_PROCESSED_DATE IS NULL OR LENGTH(EMA_PROCESSED_DATE) IS NULL OR LENGTH(EMA_PROCESSED_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullEmaProcessedDate",
						"EMA_PROCESSED_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanEmaProcessedDate",
						"EMA_PROCESSED_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanEmaProcessedDate",
						"EMA_PROCESSED_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByEmaProcessedDateMatch",
						"EMA_PROCESSED_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullEmaProcessedDate",
						"(EMA_PROCESSED_DATE = ? OR EMA_PROCESSED_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaProcessedDate asc", "EMA_PROCESSED_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("EmaProcessedDate desc", "EMA_PROCESSED_DATE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalEmaContents", /* PK attribute */
		"EMA_CONTENTS = ? ")
				.addFilterBy("filterByEmaContentsMatch", "EMA_CONTENTS LIKE ?")
				.addFilterBy("INEmaContents", "EMA_CONTENTS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaContents", "EMA_CONTENTS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaContents", "EMA_CONTENTS != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaContents",
						"(EMA_CONTENTS IS NULL OR LENGTH(EMA_CONTENTS) IS NULL OR LENGTH(EMA_CONTENTS) = 0)") // IS
																												// NULL

				.addFilterBy("notnullEmaContents", "EMA_CONTENTS IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanEmaContents", "EMA_CONTENTS < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanEmaContents", "EMA_CONTENTS > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaContentsMatch", "EMA_CONTENTS LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullEmaContents",
						"(EMA_CONTENTS = ? OR EMA_CONTENTS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaContents asc", "EMA_CONTENTS ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaContents desc", "EMA_CONTENTS DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalEmaSentId", /* PK attribute */
		"EMA_SENT_ID = ? ")
				.addFilterBy("filterByEmaSentIdMatch", "EMA_SENT_ID LIKE ?")
				.addFilterBy("INEmaSentId", "EMA_SENT_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaSentId", "EMA_SENT_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaSentId", "EMA_SENT_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaSentId",
						"(EMA_SENT_ID IS NULL OR LENGTH(EMA_SENT_ID) IS NULL OR LENGTH(EMA_SENT_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaSentId", "EMA_SENT_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaSentId", "EMA_SENT_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaSentId", "EMA_SENT_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaSentIdMatch", "EMA_SENT_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaSentId",
						"(EMA_SENT_ID = ? OR EMA_SENT_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaSentId asc", "EMA_SENT_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaSentId desc", "EMA_SENT_ID DESC ") // ORDER
																	// DESCENDING
				
				;
				table.addFilterBy("equalEmaMessageType", /* PK attribute */
		"EMA_MESSAGE_TYPE = ? ")
				.addFilterBy("filterByEmaMessageTypeMatch", "EMA_MESSAGE_TYPE LIKE ?")
				.addFilterBy("INEmaMessageType", "EMA_MESSAGE_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaMessageType", "EMA_MESSAGE_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaMessageType", "EMA_MESSAGE_TYPE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaMessageType",
						"(EMA_MESSAGE_TYPE IS NULL OR LENGTH(EMA_MESSAGE_TYPE) IS NULL OR LENGTH(EMA_MESSAGE_TYPE) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaMessageType", "EMA_MESSAGE_TYPE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaMessageType", "EMA_MESSAGE_TYPE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaMessageType", "EMA_MESSAGE_TYPE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaMessageTypeMatch", "EMA_MESSAGE_TYPE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaMessageType",
						"(EMA_MESSAGE_TYPE = ? OR EMA_MESSAGE_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaMessageType asc", "EMA_MESSAGE_TYPE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaMessageType desc", "EMA_MESSAGE_TYPE DESC ") // ORDER
																	// DESCENDING
				;
				table.addFilterBy("equalEmaMessageInterval", /* PK attribute */
		"EMA_MESS_INTERVAL = ? ")
				.addFilterBy("filterByEmaMessageIntervalMatch", "EMA_MESS_INTERVAL LIKE ?")
				.addFilterBy("INEmaMessageInterval", "EMA_MESS_INTERVAL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINEmaMessageInterval", "EMA_MESS_INTERVAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalEmaMessageInterval", "EMA_MESS_INTERVAL != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullEmaMessageInterval",
						"(EMA_MESS_INTERVAL IS NULL OR LENGTH(EMA_MESS_INTERVAL) IS NULL OR LENGTH(EMA_MESS_INTERVAL) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEmaMessageInterval", "EMA_MESS_INTERVAL IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanEmaMessageInterval", "EMA_MESS_INTERVAL < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanEmaMessageInterval", "EMA_MESS_INTERVAL > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByEmaMessageIntervalMatch", "EMA_MESS_INTERVAL LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullEmaMessageInterval",
						"(EMA_MESS_INTERVAL = ? OR EMA_MESS_INTERVAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("EmaMessageInterval asc", "EMA_MESS_INTERVAL ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("EmaMessageInterval desc", "EMA_MESS_INTERVAL DESC ") // ORDER
																	// DESCENDING
		;

	}

	/**
	 * Gets the DMLFactory singleton instance.
	 * 
	 * @return the DMLFactory object reference.
	 * 
	 * @throws DMLException
	 *             if an error is detected when instantiating the DMLFactory.
	 */
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EmaMessageArchiveDMLFactory();
		}

		return dml;
	}

}