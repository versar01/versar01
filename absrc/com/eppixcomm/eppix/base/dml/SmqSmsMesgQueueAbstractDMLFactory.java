package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.SmqSmsMesgQueueDMLFactory;

public class SmqSmsMesgQueueAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new SmnSimNosAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected SmqSmsMesgQueueAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SmqSmsMesgQueue", // DML Name
				"blo.SmqSmsMesgQueueDMO", // dmoName
				"smq_sms_mesg_queue", // tableName
				16, // numColumns
				"SMQ_ID, SMQ_MESG_ID, SMQ_ACC_NO, SMQ_SUBS_ID, SMQ_MSISDN_NO, SMQ_SIM_NO, SMQ_OLD_VALUE, SMQ_NEW_VALUE, SMQ_COMMENT_1, SMQ_COMMENT_2, SMQ_OPERATOR, SMQ_TTY, SMQ_STATUS, SMQ_DATE, SMQ_SENT_MSISDN, SMQ_RETRY ", // columnList
				"SMQ_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SMQ_ID, SMQ_MESG_ID, SMQ_ACC_NO, SMQ_SUBS_ID, SMQ_MSISDN_NO, SMQ_SIM_NO, SMQ_OLD_VALUE, SMQ_NEW_VALUE, SMQ_COMMENT_1, SMQ_COMMENT_2, SMQ_OPERATOR, SMQ_TTY, SMQ_STATUS, SMQ_DATE, SMQ_SENT_MSISDN, SMQ_RETRY ",
				"", "", new String[] { "SMQ_ID", "SMQ_MESG_ID", "SMQ_ACC_NO",
						"SMQ_SUBS_ID", "SMQ_MSISDN_NO", "SMQ_SIM_NO",
						"SMQ_OLD_VALUE", "SMQ_NEW_VALUE", "SMQ_COMMENT_1",
						"SMQ_COMMENT_2", "SMQ_OPERATOR", "SMQ_TTY",
						"SMQ_STATUS", "SMQ_DATE", "SMQ_SENT_MSISDN",
						"SMQ_RETRY" }, true);
		table.addFilterBy("equalSmqId", /* PK attribute */
		"SMQ_ID = ? ")
				.addFilterBy("filterBySmqIdMatch", "SMQ_ID LIKE ?")
				.addFilterBy("INSmqId", "SMQ_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqId", "SMQ_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqId", "SMQ_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqId",
						"(SMQ_ID IS NULL OR LENGTH(SMQ_ID) IS NULL OR LENGTH(SMQ_ID) = 0)") // IS
																							// NULL

				.addFilterBy("notnullSmqId", "SMQ_ID IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanSmqId", "SMQ_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqId", "SMQ_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySmqIdMatch", "SMQ_ID LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullSmqId",
						"(SMQ_ID = ? OR SMQ_ID IS NULL) ") // EQUALORNULL
															// TODO : we may
															// need to wrap this
															// with a TRIM()

				.addOrderBy("SmqId asc", "SMQ_ID ASC ") // ORDER ASCENDING

				.addOrderBy("SmqId desc", "SMQ_ID DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalSmqMesgId", /* PK attribute */
		"SMQ_MESG_ID = ? ")
				.addFilterBy("filterBySmqMesgIdMatch", "SMQ_MESG_ID LIKE ?")
				.addFilterBy("INSmqMesgId", "SMQ_MESG_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqMesgId", "SMQ_MESG_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqMesgId", "SMQ_MESG_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSmqMesgId",
						"(SMQ_MESG_ID IS NULL OR LENGTH(SMQ_MESG_ID) IS NULL OR LENGTH(SMQ_MESG_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSmqMesgId", "SMQ_MESG_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSmqMesgId", "SMQ_MESG_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSmqMesgId", "SMQ_MESG_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySmqMesgIdMatch", "SMQ_MESG_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSmqMesgId",
						"(SMQ_MESG_ID = ? OR SMQ_MESG_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqMesgId asc", "SMQ_MESG_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SmqMesgId desc", "SMQ_MESG_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSmqAccNo", /* PK attribute */
		"SMQ_ACC_NO = ? ")
				.addFilterBy("filterBySmqAccNoMatch", "SMQ_ACC_NO LIKE ?")
				.addFilterBy("INSmqAccNo", "SMQ_ACC_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqAccNo", "SMQ_ACC_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqAccNo", "SMQ_ACC_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqAccNo",
						"(SMQ_ACC_NO IS NULL OR LENGTH(SMQ_ACC_NO) IS NULL OR LENGTH(SMQ_ACC_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSmqAccNo", "SMQ_ACC_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSmqAccNo", "SMQ_ACC_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqAccNo", "SMQ_ACC_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySmqAccNoMatch", "SMQ_ACC_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSmqAccNo",
						"(SMQ_ACC_NO = ? OR SMQ_ACC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqAccNo asc", "SMQ_ACC_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SmqAccNo desc", "SMQ_ACC_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSmqSubsId", /* PK attribute */
		"SMQ_SUBS_ID = ? ")
				.addFilterBy("filterBySmqSubsIdMatch", "SMQ_SUBS_ID LIKE ?")
				.addFilterBy("INSmqSubsId", "SMQ_SUBS_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqSubsId", "SMQ_SUBS_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqSubsId", "SMQ_SUBS_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSmqSubsId",
						"(SMQ_SUBS_ID IS NULL OR LENGTH(SMQ_SUBS_ID) IS NULL OR LENGTH(SMQ_SUBS_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSmqSubsId", "SMQ_SUBS_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSmqSubsId", "SMQ_SUBS_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSmqSubsId", "SMQ_SUBS_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySmqSubsIdMatch", "SMQ_SUBS_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSmqSubsId",
						"(SMQ_SUBS_ID = ? OR SMQ_SUBS_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqSubsId asc", "SMQ_SUBS_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SmqSubsId desc", "SMQ_SUBS_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSmqMsisdnNo", /* PK attribute */
		"SMQ_MSISDN_NO = ? ")
				.addFilterBy("filterBySmqMsisdnNoMatch", "SMQ_MSISDN_NO LIKE ?")
				.addFilterBy("INSmqMsisdnNo", "SMQ_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqMsisdnNo", "SMQ_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSmqMsisdnNo", "SMQ_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqMsisdnNo",
						"(SMQ_MSISDN_NO IS NULL OR LENGTH(SMQ_MSISDN_NO) IS NULL OR LENGTH(SMQ_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSmqMsisdnNo",
						"SMQ_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqMsisdnNo", "SMQ_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqMsisdnNo", "SMQ_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySmqMsisdnNoMatch",
						"SMQ_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSmqMsisdnNo",
						"(SMQ_MSISDN_NO = ? OR SMQ_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqMsisdnNo asc", "SMQ_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SmqMsisdnNo desc", "SMQ_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqSimNo", /* PK attribute */
		"SMQ_SIM_NO = ? ")
				.addFilterBy("filterBySmqSimNoMatch", "SMQ_SIM_NO LIKE ?")
				.addFilterBy("INSmqSimNo", "SMQ_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqSimNo", "SMQ_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqSimNo", "SMQ_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqSimNo",
						"(SMQ_SIM_NO IS NULL OR LENGTH(SMQ_SIM_NO) IS NULL OR LENGTH(SMQ_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSmqSimNo", "SMQ_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSmqSimNo", "SMQ_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqSimNo", "SMQ_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySmqSimNoMatch", "SMQ_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSmqSimNo",
						"(SMQ_SIM_NO = ? OR SMQ_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqSimNo asc", "SMQ_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SmqSimNo desc", "SMQ_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSmqOldValue", /* PK attribute */
		"SMQ_OLD_VALUE = ? ")
				.addFilterBy("filterBySmqOldValueMatch", "SMQ_OLD_VALUE LIKE ?")
				.addFilterBy("INSmqOldValue", "SMQ_OLD_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqOldValue", "SMQ_OLD_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSmqOldValue", "SMQ_OLD_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqOldValue",
						"(SMQ_OLD_VALUE IS NULL OR LENGTH(SMQ_OLD_VALUE) IS NULL OR LENGTH(SMQ_OLD_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSmqOldValue",
						"SMQ_OLD_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqOldValue", "SMQ_OLD_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqOldValue", "SMQ_OLD_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySmqOldValueMatch",
						"SMQ_OLD_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSmqOldValue",
						"(SMQ_OLD_VALUE = ? OR SMQ_OLD_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqOldValue asc", "SMQ_OLD_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SmqOldValue desc", "SMQ_OLD_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqNewValue", /* PK attribute */
		"SMQ_NEW_VALUE = ? ")
				.addFilterBy("filterBySmqNewValueMatch", "SMQ_NEW_VALUE LIKE ?")
				.addFilterBy("INSmqNewValue", "SMQ_NEW_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqNewValue", "SMQ_NEW_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSmqNewValue", "SMQ_NEW_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqNewValue",
						"(SMQ_NEW_VALUE IS NULL OR LENGTH(SMQ_NEW_VALUE) IS NULL OR LENGTH(SMQ_NEW_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSmqNewValue",
						"SMQ_NEW_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqNewValue", "SMQ_NEW_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqNewValue", "SMQ_NEW_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySmqNewValueMatch",
						"SMQ_NEW_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSmqNewValue",
						"(SMQ_NEW_VALUE = ? OR SMQ_NEW_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqNewValue asc", "SMQ_NEW_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SmqNewValue desc", "SMQ_NEW_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqComment1", /* PK attribute */
		"SMQ_COMMENT_1 = ? ")
				.addFilterBy("filterBySmqComment1Match", "SMQ_COMMENT_1 LIKE ?")
				.addFilterBy("INSmqComment1", "SMQ_COMMENT_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqComment1", "SMQ_COMMENT_1 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSmqComment1", "SMQ_COMMENT_1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqComment1",
						"(SMQ_COMMENT_1 IS NULL OR LENGTH(SMQ_COMMENT_1) IS NULL OR LENGTH(SMQ_COMMENT_1) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSmqComment1",
						"SMQ_COMMENT_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqComment1", "SMQ_COMMENT_1 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqComment1", "SMQ_COMMENT_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySmqComment1Match",
						"SMQ_COMMENT_1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSmqComment1",
						"(SMQ_COMMENT_1 = ? OR SMQ_COMMENT_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqComment1 asc", "SMQ_COMMENT_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SmqComment1 desc", "SMQ_COMMENT_1 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqComment2", /* PK attribute */
		"SMQ_COMMENT_2 = ? ")
				.addFilterBy("filterBySmqComment2Match", "SMQ_COMMENT_2 LIKE ?")
				.addFilterBy("INSmqComment2", "SMQ_COMMENT_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqComment2", "SMQ_COMMENT_2 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSmqComment2", "SMQ_COMMENT_2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqComment2",
						"(SMQ_COMMENT_2 IS NULL OR LENGTH(SMQ_COMMENT_2) IS NULL OR LENGTH(SMQ_COMMENT_2) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSmqComment2",
						"SMQ_COMMENT_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqComment2", "SMQ_COMMENT_2 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqComment2", "SMQ_COMMENT_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySmqComment2Match",
						"SMQ_COMMENT_2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSmqComment2",
						"(SMQ_COMMENT_2 = ? OR SMQ_COMMENT_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqComment2 asc", "SMQ_COMMENT_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SmqComment2 desc", "SMQ_COMMENT_2 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqOperator", /* PK attribute */
		"SMQ_OPERATOR = ? ")
				.addFilterBy("filterBySmqOperatorMatch", "SMQ_OPERATOR LIKE ?")
				.addFilterBy("INSmqOperator", "SMQ_OPERATOR IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqOperator", "SMQ_OPERATOR NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqOperator", "SMQ_OPERATOR != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSmqOperator",
						"(SMQ_OPERATOR IS NULL OR LENGTH(SMQ_OPERATOR) IS NULL OR LENGTH(SMQ_OPERATOR) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSmqOperator", "SMQ_OPERATOR IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanSmqOperator", "SMQ_OPERATOR < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSmqOperator", "SMQ_OPERATOR > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySmqOperatorMatch", "SMQ_OPERATOR LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullSmqOperator",
						"(SMQ_OPERATOR = ? OR SMQ_OPERATOR IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqOperator asc", "SMQ_OPERATOR ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SmqOperator desc", "SMQ_OPERATOR DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSmqTty", /* PK attribute */
		"SMQ_TTY = ? ")
				.addFilterBy("filterBySmqTtyMatch", "SMQ_TTY LIKE ?")
				.addFilterBy("INSmqTty", "SMQ_TTY IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqTty", "SMQ_TTY NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqTty", "SMQ_TTY != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqTty",
						"(SMQ_TTY IS NULL OR LENGTH(SMQ_TTY) IS NULL OR LENGTH(SMQ_TTY) = 0)") // IS
																								// NULL

				.addFilterBy("notnullSmqTty", "SMQ_TTY IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanSmqTty", "SMQ_TTY < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqTty", "SMQ_TTY > ? ") // GREATER
																	// THAN

				.addFilterBy("filterBySmqTtyMatch", "SMQ_TTY LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullSmqTty",
						"(SMQ_TTY = ? OR SMQ_TTY IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("SmqTty asc", "SMQ_TTY ASC ") // ORDER ASCENDING

				.addOrderBy("SmqTty desc", "SMQ_TTY DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalSmqStatus", /* PK attribute */
		"SMQ_STATUS = ? ")
				.addFilterBy("filterBySmqStatusMatch", "SMQ_STATUS LIKE ?")
				.addFilterBy("INSmqStatus", "SMQ_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqStatus", "SMQ_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqStatus", "SMQ_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqStatus",
						"(SMQ_STATUS IS NULL OR LENGTH(SMQ_STATUS) IS NULL OR LENGTH(SMQ_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSmqStatus", "SMQ_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSmqStatus", "SMQ_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSmqStatus", "SMQ_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySmqStatusMatch", "SMQ_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSmqStatus",
						"(SMQ_STATUS = ? OR SMQ_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqStatus asc", "SMQ_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SmqStatus desc", "SMQ_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSmqDate", /* PK attribute */
		"SMQ_DATE = ? ")
				.addFilterBy("filterBySmqDateMatch", "SMQ_DATE LIKE ?")
				.addFilterBy("INSmqDate", "SMQ_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqDate", "SMQ_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqDate", "SMQ_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqDate",
						"(SMQ_DATE IS NULL OR LENGTH(SMQ_DATE) IS NULL OR LENGTH(SMQ_DATE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSmqDate", "SMQ_DATE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSmqDate", "SMQ_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqDate", "SMQ_DATE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterBySmqDateMatch", "SMQ_DATE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSmqDate",
						"(SMQ_DATE = ? OR SMQ_DATE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("SmqDate asc", "SMQ_DATE ASC ") // ORDER ASCENDING

				.addOrderBy("SmqDate desc", "SMQ_DATE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSmqSentMsisdn", /* PK attribute */
		"SMQ_SENT_MSISDN = ? ")
				.addFilterBy("filterBySmqSentMsisdnMatch",
						"SMQ_SENT_MSISDN LIKE ?")
				.addFilterBy("INSmqSentMsisdn", "SMQ_SENT_MSISDN IN ( ? ) ") // IN

				.addFilterBy("NOTINSmqSentMsisdn",
						"SMQ_SENT_MSISDN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSmqSentMsisdn", "SMQ_SENT_MSISDN != ?") // NOTEQUAL

				.addFilterBy(
						"nullSmqSentMsisdn",
						"(SMQ_SENT_MSISDN IS NULL OR LENGTH(SMQ_SENT_MSISDN) IS NULL OR LENGTH(SMQ_SENT_MSISDN) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSmqSentMsisdn",
						"SMQ_SENT_MSISDN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSmqSentMsisdn", "SMQ_SENT_MSISDN < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSmqSentMsisdn", "SMQ_SENT_MSISDN > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySmqSentMsisdnMatch",
						"SMQ_SENT_MSISDN LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSmqSentMsisdn",
						"(SMQ_SENT_MSISDN = ? OR SMQ_SENT_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqSentMsisdn asc", "SMQ_SENT_MSISDN ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SmqSentMsisdn desc", "SMQ_SENT_MSISDN DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSmqRetry", /* PK attribute */
		"SMQ_RETRY = ? ")
				.addFilterBy("filterBySmqRetryMatch", "SMQ_RETRY LIKE ?")
				.addFilterBy("INSmqRetry", "SMQ_RETRY IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSmqRetry", "SMQ_RETRY NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSmqRetry", "SMQ_RETRY != ?")
				// NOTEQUAL

				.addFilterBy("nullSmqRetry",
						"(SMQ_RETRY IS NULL OR LENGTH(SMQ_RETRY) IS NULL OR LENGTH(SMQ_RETRY) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSmqRetry", "SMQ_RETRY IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSmqRetry", "SMQ_RETRY < ? ") // LESS THAN

				.addFilterBy("greaterthanSmqRetry", "SMQ_RETRY > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySmqRetryMatch", "SMQ_RETRY LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSmqRetry",
						"(SMQ_RETRY = ? OR SMQ_RETRY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SmqRetry asc", "SMQ_RETRY ASC ") // ORDER ASCENDING

				.addOrderBy("SmqRetry desc", "SMQ_RETRY DESC ") // ORDER
																// DESCENDING
		;

	}

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SmqSmsMesgQueueDMLFactory();
	    }

	    return dml;
	  }
	
}