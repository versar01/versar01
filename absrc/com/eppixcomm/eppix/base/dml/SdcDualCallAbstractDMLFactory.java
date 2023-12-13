package com.eppixcomm.eppix.base.dml;

public class SdcDualCallAbstractDMLFactory extends BaseDMLFactory {

	protected SdcDualCallAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"SdcDualCall", // DML Name
				"blo.SdcDualCallDMO", // dmoName
				"sdc_dual_call", // tableName
				6, // numColumns
				"SDC_SUBSCRIBER_ID, SDC_SERVICE_CODE, SDC_SECOND_MSISDN, SDC_FIRST_MSISDN, SDC_LINK_DATE, SDC_EXPIRY_DATE", // columnList
				" SDC_SECOND_MSISDN, SDC_FIRST_MSISDN, SDC_LINK_DATE", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SDC_SUBSCRIBER_ID, SDC_SERVICE_CODE, SDC_SECOND_MSISDN, SDC_FIRST_MSISDN, SDC_LINK_DATE, SDC_EXPIRY_DATE",
				"", "", new String[] { "SDC_SUBSCRIBER_ID", "SDC_SERVICE_CODE",
						"SDC_SECOND_MSISDN", "SDC_FIRST_MSISDN",
						"SDC_LINK_DATE", "SDC_EXPIRY_DATE" }, true);
		table.addFilterBy("equalSdcSubscriberId", /* PK attribute */
		"SDC_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySdcSubscriberIdMatch",
						"SDC_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSdcSubscriberId", "SDC_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcSubscriberId",
						"SDC_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdcSubscriberId",
						"SDC_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy("nullSdcSubscriberId",
						"(SDC_SUBSCRIBER_ID IS NULL OR LENGTH(SDC_SUBSCRIBER_ID) IS NULL OR LENGTH(SDC_SUBSCRIBER_ID) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdcSubscriberId",
						"SDC_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdcSubscriberId",
						"SDC_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSdcSubscriberId",
						"SDC_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySdcSubscriberIdMatch",
						"SDC_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdcSubscriberId",
						"(SDC_SUBSCRIBER_ID = ? OR SDC_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcSubscriberId asc", "SDC_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdcSubscriberId desc", "SDC_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdcServiceCode", /* PK attribute */
		"SDC_SERVICE_CODE = ? ")
				.addFilterBy("filterBySdcServiceCodeMatch",
						"SDC_SERVICE_CODE LIKE ?")
				.addFilterBy("INSdcServiceCode", "SDC_SERVICE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcServiceCode",
						"SDC_SERVICE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdcServiceCode", "SDC_SERVICE_CODE != ?") // NOTEQUAL

				.addFilterBy("nullSdcServiceCode",
						"(SDC_SERVICE_CODE IS NULL OR LENGTH(SDC_SERVICE_CODE) IS NULL OR LENGTH(SDC_SERVICE_CODE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdcServiceCode",
						"SDC_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdcServiceCode", "SDC_SERVICE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdcServiceCode",
						"SDC_SERVICE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySdcServiceCodeMatch",
						"SDC_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdcServiceCode",
						"(SDC_SERVICE_CODE = ? OR SDC_SERVICE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcServiceCode asc", "SDC_SERVICE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdcServiceCode desc", "SDC_SERVICE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdcSecondMsisdn", /* PK attribute */
		"SDC_SECOND_MSISDN = ? ")
				.addFilterBy("filterBySdcSecondMsisdnMatch",
						"SDC_SECOND_MSISDN LIKE ?")
				.addFilterBy("INSdcSecondMsisdn", "SDC_SECOND_MSISDN IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcSecondMsisdn",
						"SDC_SECOND_MSISDN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdcSecondMsisdn",
						"SDC_SECOND_MSISDN != ?") // NOTEQUAL

				.addFilterBy("nullSdcSecondMsisdn",
						"(SDC_SECOND_MSISDN IS NULL OR LENGTH(SDC_SECOND_MSISDN) IS NULL OR LENGTH(SDC_SECOND_MSISDN) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSdcSecondMsisdn",
						"SDC_SECOND_MSISDN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdcSecondMsisdn",
						"SDC_SECOND_MSISDN < ? ") // LESS THAN

				.addFilterBy("greaterthanSdcSecondMsisdn",
						"SDC_SECOND_MSISDN > ? ") // GREATER THAN

				.addFilterBy("filterBySdcSecondMsisdnMatch",
						"SDC_SECOND_MSISDN LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSdcSecondMsisdn",
						"(SDC_SECOND_MSISDN = ? OR SDC_SECOND_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcSecondMsisdn asc", "SDC_SECOND_MSISDN ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SdcSecondMsisdn desc", "SDC_SECOND_MSISDN DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdcFirstMsisdn", /* PK attribute */
		"SDC_FIRST_MSISDN = ? ")
				.addFilterBy("filterBySdcFirstMsisdnMatch",
						"SDC_FIRST_MSISDN LIKE ?")
				.addFilterBy("INSdcFirstMsisdn", "SDC_FIRST_MSISDN IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcFirstMsisdn",
						"SDC_FIRST_MSISDN NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdcFirstMsisdn", "SDC_FIRST_MSISDN != ?") // NOTEQUAL

				.addFilterBy("nullSdcFirstMsisdn",
						"(SDC_FIRST_MSISDN IS NULL OR LENGTH(SDC_FIRST_MSISDN) IS NULL OR LENGTH(SDC_FIRST_MSISDN) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdcFirstMsisdn",
						"SDC_FIRST_MSISDN IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdcFirstMsisdn", "SDC_FIRST_MSISDN < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdcFirstMsisdn",
						"SDC_FIRST_MSISDN > ? ") // GREATER THAN

				.addFilterBy("filterBySdcFirstMsisdnMatch",
						"SDC_FIRST_MSISDN LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdcFirstMsisdn",
						"(SDC_FIRST_MSISDN = ? OR SDC_FIRST_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcFirstMsisdn asc", "SDC_FIRST_MSISDN ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdcFirstMsisdn desc", "SDC_FIRST_MSISDN DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSdcLinkDate", /* PK attribute */
		"SDC_LINK_DATE = ? ")
				.addFilterBy("filterBySdcLinkDateMatch", "SDC_LINK_DATE LIKE ?")
				.addFilterBy("INSdcLinkDate", "SDC_LINK_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcLinkDate", "SDC_LINK_DATE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSdcLinkDate", "SDC_LINK_DATE != ?") // NOTEQUAL

				.addFilterBy("nullSdcLinkDate",
						"(SDC_LINK_DATE IS NULL OR LENGTH(SDC_LINK_DATE) IS NULL OR LENGTH(SDC_LINK_DATE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSdcLinkDate",
						"SDC_LINK_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSdcLinkDate", "SDC_LINK_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSdcLinkDate", "SDC_LINK_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySdcLinkDateMatch",
						"SDC_LINK_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSdcLinkDate",
						"(SDC_LINK_DATE = ? OR SDC_LINK_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcLinkDate asc", "SDC_LINK_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SdcLinkDate desc", "SDC_LINK_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSdcExpiryDate", /* PK attribute */
		"SDC_EXPIRY_DATE = ? ")
				.addFilterBy("filterBySdcExpiryDateMatch",
						"SDC_EXPIRY_DATE LIKE ?")
				.addFilterBy("INSdcExpiryDate", "SDC_EXPIRY_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSdcExpiryDate",
						"SDC_EXPIRY_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSdcExpiryDate", "SDC_EXPIRY_DATE != ?") // NOTEQUAL

				.addFilterBy("nullSdcExpiryDate",
						"SDC_EXPIRY_DATE IS NULL") // IS
																									// NULL

				.addFilterBy("notnullSdcExpiryDate",
						"SDC_EXPIRY_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanSdcExpiryDate", "SDC_EXPIRY_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSdcExpiryDate", "SDC_EXPIRY_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySdcExpiryDateMatch",
						"SDC_EXPIRY_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSdcExpiryDate",
						"(SDC_EXPIRY_DATE = ? OR SDC_EXPIRY_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SdcExpiryDate asc", "SDC_EXPIRY_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SdcExpiryDate desc", "SDC_EXPIRY_DATE DESC ") // ORDER
																			// DESCENDING
		;

	}

}