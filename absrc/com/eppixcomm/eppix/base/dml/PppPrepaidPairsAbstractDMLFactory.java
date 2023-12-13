package com.eppixcomm.eppix.base.dml;

public class PppPrepaidPairsAbstractDMLFactory extends BaseDMLFactory {

	protected PppPrepaidPairsAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"PppPrepaidPairs", // DML Name
				"blo.PppPrepaidPairsDMO", // dmoName
				"ppp_prepaid_pairs", // tableName
				18, // numColumns
				"PPP_BILL_AC_NO, PPP_SUBSCRIBER_ID, PPP_SIM_NO, PPP_IMSI_NO, PPP_MSISDN_NO, PPP_TYPE, PPP_STATUS, PPP_STATUS_DATE, PPP_VALIDATE_DATE, PPP_ACTIVATE_DATE, PPP_RECHARGE_DATE, PPP_CREDIT_REMAIN, PPP_VALIDITY_END, PPP_ACTIVITY_END, PPP_RECHARGE_END, PPP_PACKAGE_CODE, PPP_INTERN_TARIFF, PPP_BILL_CYCLE ", // columnList
				"PPP_SUBSCRIBER_ID,PPP_SIM_NO,PPP_IMSI_NO,PPP_MSISDN_NO", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"PPP_BILL_AC_NO, PPP_SUBSCRIBER_ID, PPP_SIM_NO, PPP_IMSI_NO, PPP_MSISDN_NO, PPP_TYPE, PPP_STATUS, PPP_STATUS_DATE, PPP_VALIDATE_DATE, PPP_ACTIVATE_DATE, PPP_RECHARGE_DATE, PPP_CREDIT_REMAIN, PPP_VALIDITY_END, PPP_ACTIVITY_END, PPP_RECHARGE_END, PPP_PACKAGE_CODE, PPP_INTERN_TARIFF, PPP_BILL_CYCLE",
				"", "", new String[] { "PPP_BILL_AC_NO", "PPP_SUBSCRIBER_ID", "PPP_SIM_NO",
						"PPP_IMSI_NO", "PPP_MSISDN_NO", "PPP_TYPE",
						"PPP_STATUS", "PPP_STATUS_DATE", "PPP_VALIDATE_DATE",
						"PPP_ACTIVATE_DATE", "PPP_RECHARGE_DATE",
						"PPP_CREDIT_REMAIN", "PPP_VALIDITY_END",
						"PPP_ACTIVITY_END", "PPP_RECHARGE_END",
						"PPP_PACKAGE_CODE", "PPP_INTERN_TARIFF",
						"PPP_BILL_CYCLE", }, true);

		table.addFilterBy("equal", /* PK attribute */
		" = ? ")
				.addFilterBy("filterByMatch", " LIKE ?")
				.addFilterBy("IN", " IN ( ? ) ")
				// IN

				.addFilterBy("NOTIN", " NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequal", " != ?")
				// NOTEQUAL

				.addFilterBy("null",
						"( IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																					// NULL

				.addFilterBy("notnull", " IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthan", " < ? ") // LESS THAN

				.addFilterBy("greaterthan", " > ? ") // GREATER THAN

				.addFilterBy("filterByMatch", " LIKE ? ") // LIKE, BEGINSWITH,
															// ENDSWITH, ANY

				.addFilterBy("equalornull", "( = ? OR  IS NULL) ") // EQUALORNULL
																	// TODO : we
																	// may need
																	// to wrap
																	// this with
																	// a TRIM()

				.addOrderBy(" asc", " ASC ") // ORDER ASCENDING

				.addOrderBy(" desc", " DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalPppSubscriberId", /* PK attribute */
		"PPP_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByPppSubscriberIdMatch",
						"PPP_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INPppSubscriberId", "PPP_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPppSubscriberId",
						"PPP_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppSubscriberId",
						"PPP_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy("nullPppSubscriberId",
						"(PPP_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppSubscriberId",
						"PPP_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppSubscriberId",
						"PPP_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanPppSubscriberId",
						"PPP_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByPppSubscriberIdMatch",
						"PPP_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppSubscriberId",
						"(PPP_SUBSCRIBER_ID = ? OR PPP_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppSubscriberId asc", "PPP_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppSubscriberId desc", "PPP_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppSimNo", /* PK attribute */
		"PPP_SIM_NO = ? ")
				.addFilterBy("filterByPppSimNoMatch", "PPP_SIM_NO LIKE ?")
				.addFilterBy("INPppSimNo", "PPP_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPppSimNo", "PPP_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPppSimNo", "PPP_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullPppSimNo",
						"(PPP_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullPppSimNo", "PPP_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanPppSimNo", "PPP_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanPppSimNo", "PPP_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByPppSimNoMatch", "PPP_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullPppSimNo",
						"(PPP_SIM_NO = ? OR PPP_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppSimNo asc", "PPP_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("PppSimNo desc", "PPP_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPppImsiNo", /* PK attribute */
		"PPP_IMSI_NO = ? ")
				.addFilterBy("filterByPppImsiNoMatch", "PPP_IMSI_NO LIKE ?")
				.addFilterBy("INPppImsiNo", "PPP_IMSI_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPppImsiNo", "PPP_IMSI_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPppImsiNo", "PPP_IMSI_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullPppImsiNo",
						"(PPP_IMSI_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullPppImsiNo", "PPP_IMSI_NO IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPppImsiNo", "PPP_IMSI_NO < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPppImsiNo", "PPP_IMSI_NO > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPppImsiNoMatch", "PPP_IMSI_NO LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPppImsiNo",
						"(PPP_IMSI_NO = ? OR PPP_IMSI_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppImsiNo asc", "PPP_IMSI_NO ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PppImsiNo desc", "PPP_IMSI_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPppMsisdnNo", /* PK attribute */
		"PPP_MSISDN_NO = ? ")
				.addFilterBy("filterByPppMsisdnNoMatch", "PPP_MSISDN_NO LIKE ?")
				.addFilterBy("INPppMsisdnNo", "PPP_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINPppMsisdnNo", "PPP_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPppMsisdnNo", "PPP_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy("nullPppMsisdnNo",
						"(PPP_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppMsisdnNo",
						"PPP_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppMsisdnNo", "PPP_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPppMsisdnNo", "PPP_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPppMsisdnNoMatch",
						"PPP_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPppMsisdnNo",
						"(PPP_MSISDN_NO = ? OR PPP_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppMsisdnNo asc", "PPP_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PppMsisdnNo desc", "PPP_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPppType", /* PK attribute */
		"PPP_TYPE = ? ")
				.addFilterBy("filterByPppTypeMatch", "PPP_TYPE LIKE ?")
				.addFilterBy("INPppType", "PPP_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPppType", "PPP_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPppType", "PPP_TYPE != ?")
				// NOTEQUAL

				.addFilterBy("nullPppType",
						"(PPP_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullPppType", "PPP_TYPE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanPppType", "PPP_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanPppType", "PPP_TYPE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByPppTypeMatch", "PPP_TYPE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullPppType",
						"(PPP_TYPE = ? OR PPP_TYPE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("PppType asc", "PPP_TYPE ASC ") // ORDER ASCENDING

				.addOrderBy("PppType desc", "PPP_TYPE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalPppStatus", /* PK attribute */
		"PPP_STATUS = ? ")
				.addFilterBy("filterByPppStatusMatch", "PPP_STATUS LIKE ?")
				.addFilterBy("INPppStatus", "PPP_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPppStatus", "PPP_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPppStatus", "PPP_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullPppStatus",
						"(PPP_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullPppStatus", "PPP_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPppStatus", "PPP_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPppStatus", "PPP_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByPppStatusMatch", "PPP_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPppStatus",
						"(PPP_STATUS = ? OR PPP_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppStatus asc", "PPP_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("PppStatus desc", "PPP_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPppStatusDate", /* PK attribute */
		"PPP_STATUS_DATE = ? ")
				.addFilterBy("filterByPppStatusDateMatch",
						"PPP_STATUS_DATE LIKE ?")
				.addFilterBy("INPppStatusDate", "PPP_STATUS_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppStatusDate",
						"PPP_STATUS_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppStatusDate", "PPP_STATUS_DATE != ?") // NOTEQUAL

				.addFilterBy("nullPppStatusDate",
						"(PPP_STATUS_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppStatusDate",
						"PPP_STATUS_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppStatusDate", "PPP_STATUS_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPppStatusDate", "PPP_STATUS_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByPppStatusDateMatch",
						"PPP_STATUS_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPppStatusDate",
						"(PPP_STATUS_DATE = ? OR PPP_STATUS_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppStatusDate asc", "PPP_STATUS_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PppStatusDate desc", "PPP_STATUS_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPppValidateDate", /* PK attribute */
		"PPP_VALIDATE_DATE = ? ")
				.addFilterBy("filterByPppValidateDateMatch",
						"PPP_VALIDATE_DATE LIKE ?")
				.addFilterBy("INPppValidateDate", "PPP_VALIDATE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppValidateDate",
						"PPP_VALIDATE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppValidateDate",
						"PPP_VALIDATE_DATE != ?") // NOTEQUAL

				.addFilterBy("nullPppValidateDate",
						"(PPP_VALIDATE_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppValidateDate",
						"PPP_VALIDATE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppValidateDate",
						"PPP_VALIDATE_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanPppValidateDate",
						"PPP_VALIDATE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByPppValidateDateMatch",
						"PPP_VALIDATE_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppValidateDate",
						"(PPP_VALIDATE_DATE = ? OR PPP_VALIDATE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppValidateDate asc", "PPP_VALIDATE_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppValidateDate desc", "PPP_VALIDATE_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppActivateDate", /* PK attribute */
		"PPP_ACTIVATE_DATE = ? ")
				.addFilterBy("filterByPppActivateDateMatch",
						"PPP_ACTIVATE_DATE LIKE ?")
				.addFilterBy("INPppActivateDate", "PPP_ACTIVATE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppActivateDate",
						"PPP_ACTIVATE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppActivateDate",
						"PPP_ACTIVATE_DATE != ?") // NOTEQUAL

				.addFilterBy("nullPppActivateDate",
						"(PPP_ACTIVATE_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppActivateDate",
						"PPP_ACTIVATE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppActivateDate",
						"PPP_ACTIVATE_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanPppActivateDate",
						"PPP_ACTIVATE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByPppActivateDateMatch",
						"PPP_ACTIVATE_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppActivateDate",
						"(PPP_ACTIVATE_DATE = ? OR PPP_ACTIVATE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppActivateDate asc", "PPP_ACTIVATE_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppActivateDate desc", "PPP_ACTIVATE_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppRechargeDate", /* PK attribute */
		"PPP_RECHARGE_DATE = ? ")
				.addFilterBy("filterByPppRechargeDateMatch",
						"PPP_RECHARGE_DATE LIKE ?")
				.addFilterBy("INPppRechargeDate", "PPP_RECHARGE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppRechargeDate",
						"PPP_RECHARGE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppRechargeDate",
						"PPP_RECHARGE_DATE != ?") // NOTEQUAL

				.addFilterBy("nullPppRechargeDate",
						"(PPP_RECHARGE_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppRechargeDate",
						"PPP_RECHARGE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppRechargeDate",
						"PPP_RECHARGE_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanPppRechargeDate",
						"PPP_RECHARGE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterByPppRechargeDateMatch",
						"PPP_RECHARGE_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppRechargeDate",
						"(PPP_RECHARGE_DATE = ? OR PPP_RECHARGE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppRechargeDate asc", "PPP_RECHARGE_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppRechargeDate desc", "PPP_RECHARGE_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppCreditRemain", /* PK attribute */
		"PPP_CREDIT_REMAIN = ? ")
				.addFilterBy("filterByPppCreditRemainMatch",
						"PPP_CREDIT_REMAIN LIKE ?")
				.addFilterBy("INPppCreditRemain", "PPP_CREDIT_REMAIN IN ( ? ) ") // IN

				.addFilterBy("NOTINPppCreditRemain",
						"PPP_CREDIT_REMAIN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppCreditRemain",
						"PPP_CREDIT_REMAIN != ?") // NOTEQUAL

				.addFilterBy("nullPppCreditRemain",
						"(PPP_CREDIT_REMAIN IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppCreditRemain",
						"PPP_CREDIT_REMAIN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppCreditRemain",
						"PPP_CREDIT_REMAIN < ? ") // LESS THAN

				.addFilterBy("greaterthanPppCreditRemain",
						"PPP_CREDIT_REMAIN > ? ") // GREATER THAN

				.addFilterBy("filterByPppCreditRemainMatch",
						"PPP_CREDIT_REMAIN LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppCreditRemain",
						"(PPP_CREDIT_REMAIN = ? OR PPP_CREDIT_REMAIN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppCreditRemain asc", "PPP_CREDIT_REMAIN ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppCreditRemain desc", "PPP_CREDIT_REMAIN DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppValidityEnd", /* PK attribute */
		"PPP_VALIDITY_END = ? ")
				.addFilterBy("filterByPppValidityEndMatch",
						"PPP_VALIDITY_END LIKE ?")
				.addFilterBy("INPppValidityEnd", "PPP_VALIDITY_END IN ( ? ) ") // IN

				.addFilterBy("NOTINPppValidityEnd",
						"PPP_VALIDITY_END NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppValidityEnd", "PPP_VALIDITY_END != ?") // NOTEQUAL

				.addFilterBy("nullPppValidityEnd",
						"(PPP_VALIDITY_END IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppValidityEnd",
						"PPP_VALIDITY_END IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppValidityEnd", "PPP_VALIDITY_END < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPppValidityEnd",
						"PPP_VALIDITY_END > ? ") // GREATER THAN

				.addFilterBy("filterByPppValidityEndMatch",
						"PPP_VALIDITY_END LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPppValidityEnd",
						"(PPP_VALIDITY_END = ? OR PPP_VALIDITY_END IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppValidityEnd asc", "PPP_VALIDITY_END ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PppValidityEnd desc", "PPP_VALIDITY_END DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppActivityEnd", /* PK attribute */
		"PPP_ACTIVITY_END = ? ")
				.addFilterBy("filterByPppActivityEndMatch",
						"PPP_ACTIVITY_END LIKE ?")
				.addFilterBy("INPppActivityEnd", "PPP_ACTIVITY_END IN ( ? ) ") // IN

				.addFilterBy("NOTINPppActivityEnd",
						"PPP_ACTIVITY_END NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppActivityEnd", "PPP_ACTIVITY_END != ?") // NOTEQUAL

				.addFilterBy("nullPppActivityEnd",
						"(PPP_ACTIVITY_END IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppActivityEnd",
						"PPP_ACTIVITY_END IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppActivityEnd", "PPP_ACTIVITY_END < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPppActivityEnd",
						"PPP_ACTIVITY_END > ? ") // GREATER THAN

				.addFilterBy("filterByPppActivityEndMatch",
						"PPP_ACTIVITY_END LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPppActivityEnd",
						"(PPP_ACTIVITY_END = ? OR PPP_ACTIVITY_END IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppActivityEnd asc", "PPP_ACTIVITY_END ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PppActivityEnd desc", "PPP_ACTIVITY_END DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppRechargeEnd", /* PK attribute */
		"PPP_RECHARGE_END = ? ")
				.addFilterBy("filterByPppRechargeEndMatch",
						"PPP_RECHARGE_END LIKE ?")
				.addFilterBy("INPppRechargeEnd", "PPP_RECHARGE_END IN ( ? ) ") // IN

				.addFilterBy("NOTINPppRechargeEnd",
						"PPP_RECHARGE_END NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppRechargeEnd", "PPP_RECHARGE_END != ?") // NOTEQUAL

				.addFilterBy("nullPppRechargeEnd",
						"(PPP_RECHARGE_END IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppRechargeEnd",
						"PPP_RECHARGE_END IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppRechargeEnd", "PPP_RECHARGE_END < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPppRechargeEnd",
						"PPP_RECHARGE_END > ? ") // GREATER THAN

				.addFilterBy("filterByPppRechargeEndMatch",
						"PPP_RECHARGE_END LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPppRechargeEnd",
						"(PPP_RECHARGE_END = ? OR PPP_RECHARGE_END IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppRechargeEnd asc", "PPP_RECHARGE_END ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PppRechargeEnd desc", "PPP_RECHARGE_END DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppPackageCode", /* PK attribute */
		"PPP_PACKAGE_CODE = ? ")
				.addFilterBy("filterByPppPackageCodeMatch",
						"PPP_PACKAGE_CODE LIKE ?")
				.addFilterBy("INPppPackageCode", "PPP_PACKAGE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppPackageCode",
						"PPP_PACKAGE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppPackageCode", "PPP_PACKAGE_CODE != ?") // NOTEQUAL

				.addFilterBy("nullPppPackageCode",
						"(PPP_PACKAGE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppPackageCode",
						"PPP_PACKAGE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppPackageCode", "PPP_PACKAGE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPppPackageCode",
						"PPP_PACKAGE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterByPppPackageCodeMatch",
						"PPP_PACKAGE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPppPackageCode",
						"(PPP_PACKAGE_CODE = ? OR PPP_PACKAGE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppPackageCode asc", "PPP_PACKAGE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PppPackageCode desc", "PPP_PACKAGE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppInternTariff", /* PK attribute */
		"PPP_INTERN_TARIFF = ? ")
				.addFilterBy("filterByPppInternTariffMatch",
						"PPP_INTERN_TARIFF LIKE ?")
				.addFilterBy("INPppInternTariff", "PPP_INTERN_TARIFF IN ( ? ) ") // IN

				.addFilterBy("NOTINPppInternTariff",
						"PPP_INTERN_TARIFF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPppInternTariff",
						"PPP_INTERN_TARIFF != ?") // NOTEQUAL

				.addFilterBy("nullPppInternTariff",
						"(PPP_INTERN_TARIFF IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPppInternTariff",
						"PPP_INTERN_TARIFF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppInternTariff",
						"PPP_INTERN_TARIFF < ? ") // LESS THAN

				.addFilterBy("greaterthanPppInternTariff",
						"PPP_INTERN_TARIFF > ? ") // GREATER THAN

				.addFilterBy("filterByPppInternTariffMatch",
						"PPP_INTERN_TARIFF LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullPppInternTariff",
						"(PPP_INTERN_TARIFF = ? OR PPP_INTERN_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppInternTariff asc", "PPP_INTERN_TARIFF ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("PppInternTariff desc", "PPP_INTERN_TARIFF DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPppBillCycle", /* PK attribute */
		"PPP_BILL_CYCLE = ? ")
				.addFilterBy("filterByPppBillCycleMatch",
						"PPP_BILL_CYCLE LIKE ?")
				.addFilterBy("INPppBillCycle", "PPP_BILL_CYCLE IN ( ? ) ") // IN

				.addFilterBy("NOTINPppBillCycle", "PPP_BILL_CYCLE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalPppBillCycle", "PPP_BILL_CYCLE != ?") // NOTEQUAL

				.addFilterBy("nullPppBillCycle",
						"(PPP_BILL_CYCLE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullPppBillCycle",
						"PPP_BILL_CYCLE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPppBillCycle", "PPP_BILL_CYCLE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPppBillCycle", "PPP_BILL_CYCLE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPppBillCycleMatch",
						"PPP_BILL_CYCLE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPppBillCycle",
						"(PPP_BILL_CYCLE = ? OR PPP_BILL_CYCLE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PppBillCycle asc", "PPP_BILL_CYCLE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PppBillCycle desc", "PPP_BILL_CYCLE DESC ") // ORDER
																			// DESCENDING
		;

	}

}