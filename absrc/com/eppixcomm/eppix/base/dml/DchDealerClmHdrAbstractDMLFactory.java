/*


 */

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;


/**
 * This is the DMLFactory for DchDealerClmHdr.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DchDealerClmHdrAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DchDealerClmHdrAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected DchDealerClmHdrAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"DchDealerClmHdr", // dmlName
				"blo.DchDealerClmHdrDMO", // dmoName
				"DCH_DEALER_CLM_HDR", // tableName
				34, // numColumns
				"DCH_CLAIM_ID, DCH_ACT_TYPE, DCH_CLAIM_DATE, DCH_CONTRACT_DATE, DCH_SUBSCRIBER_ID, DCH_IMEI_1, DCH_IMEI_2, DCH_SERIAL_1, DCH_SERIAL_2"
						+ ", DCH_SERIAL_3, DCH_SIM_NO1, DCH_SIM_NO2, DCH_SIM_PROD1, DCH_SIM_PROD2, DCH_DEALER_ID, DCH_PACKAGE_CODE, DCH_IMEI1_AMT, DCH_IMEI2_AMT, DCH_SERIAL1_AMT, DCH_SERIAL2_AMT, DCH_SERIAL3_AMT"
						+ ", DCH_SIM_AMT1, DCH_SIM_AMT2, DCH_CLM_AMT, DCH_SAVE_DATE, DCH_USER_ID, DCH_ERR_WARN, DCH_SUBMIT_DATE, DCH_ERROR_FLAG, DCH_ERR_RETRY_CNT, DCH_SOURCE_SYSTEM, DCH_OFFER_ID, DCH_GROUP_INDEX, DCH_CREATE_DATE", // columnList
				"DCH_CLAIM_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"DCH_CLAIM_ID, DCH_ACT_TYPE, DCH_CLAIM_DATE, DCH_CONTRACT_DATE, DCH_SUBSCRIBER_ID, DCH_IMEI_1, DCH_IMEI_2, DCH_SERIAL_1, DCH_SERIAL_2"
						+ ", DCH_SERIAL_3, DCH_SIM_NO1, DCH_SIM_NO2, DCH_SIM_PROD1, DCH_SIM_PROD2, DCH_DEALER_ID, DCH_PACKAGE_CODE, DCH_IMEI1_AMT, DCH_IMEI2_AMT, DCH_SERIAL1_AMT, DCH_SERIAL2_AMT, DCH_SERIAL3_AMT"
						+ ", DCH_SIM_AMT1, DCH_SIM_AMT2, DCH_CLM_AMT, DCH_SAVE_DATE, DCH_USER_ID, DCH_ERR_WARN, DCH_SUBMIT_DATE, DCH_ERROR_FLAG, DCH_ERR_RETRY_CNT, DCH_SOURCE_SYSTEM, DCH_OFFER_ID, DCH_GROUP_INDEX, DCH_CREATE_DATE",
				"", "", new String[] { "DCH_CLAIM_ID", "DCH_ACT_TYPE",
						"DCH_CLAIM_DATE", "DCH_CONTRACT_DATE",
						"DCH_SUBSCRIBER_ID", "DCH_IMEI_1", "DCH_IMEI_2",
						"DCH_SERIAL_1", "DCH_SERIAL_2", "DCH_SERIAL_3",
						"DCH_SIM_NO1", "DCH_SIM_NO2", "DCH_SIM_PROD1", "DCH_SIM_PROD2",
						"DCH_DEALER_ID", "DCH_PACKAGE_CODE",
						"DCH_IMEI1_AMT", "DCH_IMEI2_AMT", "DCH_SERIAL1_AMT",
						"DCH_SERIAL2_AMT", "DCH_SERIAL3_AMT", "DCH_SIM_AMT1", "DCH_SIM_AMT2",
						"DCH_CLM_AMT", "DCH_SAVE_DATE", "DCH_USER_ID",
						"DCH_ERR_WARN", "DCH_SUBMIT_DATE", "DCH_ERROR_FLAG",
						"DCH_ERR_RETRY_CNT", "DCH_SOURCE_SYSTEM", "DCH_OFFER_ID", "DCH_GROUP_INDEX", "DCH_CREATE_DATE" });

		table.addFilterBy("equalDchClaimId", /* PK attribute */
		"DCH_CLAIM_ID = ?")
				.addFilterBy("INDchClaimId", "DCH_CLAIM_ID IN ( ? )") // IN

				.addFilterBy("NOTINDchClaimId", "DCH_CLAIM_ID NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchClaimIdasc", "DCH_CLAIM_ID ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchClaimIddesc", "DCH_CLAIM_ID DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchActType", "(DCH_ACT_TYPE) = ?")
				// EQUAL

				.addFilterBy("notequalDchActType", "(DCH_ACT_TYPE) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchActType",
						"(DCH_ACT_TYPE IS NULL OR LENGTH((DCH_ACT_TYPE)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchActType", "DCH_ACT_TYPE IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchActTypeMatch", "DCH_ACT_TYPE LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchActType",
						"((DCH_ACT_TYPE) = ? OR DCH_ACT_TYPE IS NULL)") // EQUALORNULL

				.addFilterBy("INDchActType", "DCH_ACT_TYPE IN ( ? )") // IN

				.addFilterBy("NOTINDchActType", "DCH_ACT_TYPE NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchActTypeasc", "DCH_ACT_TYPE ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchActTypedesc", "DCH_ACT_TYPE DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchClaimDate", "DCH_CLAIM_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDchClaimDate", "DCH_CLAIM_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDchClaimDate", "DCH_CLAIM_DATE IS NULL")
				// IS NULL

				.addFilterBy("notnullDchClaimDate",
						"DCH_CLAIM_DATE IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDchClaimDate", "DCH_CLAIM_DATE < ?")
				// LESS THAN

				.addFilterBy("greaterthanDchClaimDate", "DCH_CLAIM_DATE > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDchClaimDate",
						"DCH_CLAIM_DATE <= ?")
				// LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchClaimDate",
						"DCH_CLAIM_DATE >= ?")
				// GREATER THAN OR EQUAL

				.addFilterBy("betweenDchClaimDate",
						"DCH_CLAIM_DATE BETWEEN ? AND ?")
				// BETWEEN

				.addFilterBy("equalornullDchClaimDate",
						"(DCH_CLAIM_DATE IS NULL OR DCH_CLAIM_DATE = ?)")
				// EQUALORNULL

				.addFilterBy("lessthanornullDchClaimDate",
						"(DCH_CLAIM_DATE IS NULL OR DCH_CLAIM_DATE < ?)")
				// LESSTHANORNULL

				.addFilterBy("greaterthanornullDchClaimDate",
						"(DCH_CLAIM_DATE IS NULL OR DCH_CLAIM_DATE > ?)")
				// GREATERTHANORNULL

				.addFilterBy("INDchClaimDate", "DCH_CLAIM_DATE IN ( ? )")
				// IN

				.addFilterBy("NOTINDchClaimDate", "DCH_CLAIM_DATE NOT IN ( ? )") // NOT
																					// IN

				.addOrderBy("DchClaimDateasc", "DCH_CLAIM_DATE ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchClaimDatedesc", "DCH_CLAIM_DATE DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchContractDate", "DCH_CONTRACT_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDchContractDate",
						"DCH_CONTRACT_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDchContractDate", "DCH_CONTRACT_DATE IS NULL") // IS
																					// NULL

				.addFilterBy("notnullDchContractDate",
						"DCH_CONTRACT_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchContractDate", "DCH_CONTRACT_DATE < ?") // LESS
																					// THAN

				.addFilterBy("greaterthanDchContractDate",
						"DCH_CONTRACT_DATE > ?") // GREATER THAN

				.addFilterBy("lessthanorequalDchContractDate",
						"DCH_CONTRACT_DATE <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchContractDate",
						"DCH_CONTRACT_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchContractDate",
						"DCH_CONTRACT_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchContractDate",
						"(DCH_CONTRACT_DATE IS NULL OR DCH_CONTRACT_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchContractDate",
						"(DCH_CONTRACT_DATE IS NULL OR DCH_CONTRACT_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchContractDate",
						"(DCH_CONTRACT_DATE IS NULL OR DCH_CONTRACT_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchContractDate", "DCH_CONTRACT_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDchContractDate",
						"DCH_CONTRACT_DATE NOT IN ( ? )") // NOT IN

				.addOrderBy("DchContractDateasc", "DCH_CONTRACT_DATE ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DchContractDatedesc", "DCH_CONTRACT_DATE DESC") // ORDER
																				// DESCENDING
		;

		table
				.addFilterBy("equalDchSubscriberId",
						"(DCH_SUBSCRIBER_ID) = ?") // EQUAL

				.addFilterBy("notequalDchSubscriberId",
						"(DCH_SUBSCRIBER_ID) != ?") // NOTEQUAL

				.addFilterBy("nullDchSubscriberId",
						"(DCH_SUBSCRIBER_ID IS NULL OR LENGTH((DCH_SUBSCRIBER_ID)) = 0)") // IS
																								// NULL

				.addFilterBy("notnullDchSubscriberId",
						"DCH_SUBSCRIBER_ID IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDchSubscriberIdMatch",
						"DCH_SUBSCRIBER_ID LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDchSubscriberId",
						"((DCH_SUBSCRIBER_ID) = ? OR DCH_SUBSCRIBER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSubscriberId", "DCH_SUBSCRIBER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDchSubscriberId",
						"DCH_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addOrderBy("DchSubscriberIdasc", "DCH_SUBSCRIBER_ID ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DchSubscriberIddesc", "DCH_SUBSCRIBER_ID DESC") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalDchImei1", "(DCH_IMEI_1) = ?") // EQUAL

				.addFilterBy("notequalDchImei1", "(DCH_IMEI_1) != ?") // NOTEQUAL

				.addFilterBy("nullDchImei1",
						"(DCH_IMEI_1 IS NULL OR LENGTH((DCH_IMEI_1)) = 0)") // IS
																				// NULL

				.addFilterBy("notnullDchImei1", "DCH_IMEI_1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByDchImei1Match", "DCH_IMEI_1 LIKE ?") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullDchImei1",
						"((DCH_IMEI_1) = ? OR DCH_IMEI_1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchImei1", "DCH_IMEI_1 IN ( ? )") // IN

				.addFilterBy("NOTINDchImei1", "DCH_IMEI_1 NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchImei1asc", "DCH_IMEI_1 ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchImei1desc", "DCH_IMEI_1 DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalDchImei2", "(DCH_IMEI_2) = ?") // EQUAL

				.addFilterBy("notequalDchImei2", "(DCH_IMEI_2) != ?") // NOTEQUAL

				.addFilterBy("nullDchImei2",
						"(DCH_IMEI_2 IS NULL OR LENGTH((DCH_IMEI_2)) = 0)") // IS
																				// NULL

				.addFilterBy("notnullDchImei2", "DCH_IMEI_2 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByDchImei2Match", "DCH_IMEI_2 LIKE ?") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullDchImei2",
						"((DCH_IMEI_2) = ? OR DCH_IMEI_2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchImei2", "DCH_IMEI_2 IN ( ? )") // IN

				.addFilterBy("NOTINDchImei2", "DCH_IMEI_2 NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchImei2asc", "DCH_IMEI_2 ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchImei2desc", "DCH_IMEI_2 DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalDchSerial1", "(DCH_SERIAL_1) = ?")
				// EQUAL

				.addFilterBy("notequalDchSerial1", "(DCH_SERIAL_1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSerial1",
						"(DCH_SERIAL_1 IS NULL OR LENGTH((DCH_SERIAL_1)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchSerial1", "DCH_SERIAL_1 IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchSerial1Match", "DCH_SERIAL_1 LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchSerial1",
						"((DCH_SERIAL_1) = ? OR DCH_SERIAL_1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSerial1", "DCH_SERIAL_1 IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial1", "DCH_SERIAL_1 NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSerial1asc", "DCH_SERIAL_1 ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSerial1desc", "DCH_SERIAL_1 DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSerial2", "(DCH_SERIAL_2) = ?")
				// EQUAL

				.addFilterBy("notequalDchSerial2", "(DCH_SERIAL_2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSerial2",
						"(DCH_SERIAL_2 IS NULL OR LENGTH((DCH_SERIAL_2)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchSerial2", "DCH_SERIAL_2 IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchSerial2Match", "DCH_SERIAL_2 LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchSerial2",
						"((DCH_SERIAL_2) = ? OR DCH_SERIAL_2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSerial2", "DCH_SERIAL_2 IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial2", "DCH_SERIAL_2 NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSerial2asc", "DCH_SERIAL_2 ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSerial2desc", "DCH_SERIAL_2 DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSerial3", "(DCH_SERIAL_3) = ?")
				// EQUAL

				.addFilterBy("notequalDchSerial3", "(DCH_SERIAL_3) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSerial3",
						"(DCH_SERIAL_3 IS NULL OR LENGTH((DCH_SERIAL_3)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchSerial3", "DCH_SERIAL_3 IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchSerial3Match", "DCH_SERIAL_3 LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchSerial3",
						"((DCH_SERIAL_3) = ? OR DCH_SERIAL_3 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSerial3", "DCH_SERIAL_3 IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial3", "DCH_SERIAL_3 NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSerial3asc", "DCH_SERIAL_3 ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSerial3desc", "DCH_SERIAL_3 DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSimNo1", "(DCH_SIM_NO1) = ?")
				// EQUAL

				.addFilterBy("notequalDchSimNo1", "(DCH_SIM_NO1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSimNo1",
						"(DCH_SIM_NO1 IS NULL OR LENGTH((DCH_SIM_NO1)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchSimNo1", "DCH_SIM_NO1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByDchSimNo1Match", "DCH_SIM_NO1 LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchSimNo1",
						"((DCH_SIM_NO1) = ? OR DCH_SIM_NO1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSimNo1", "DCH_SIM_NO1 IN ( ? )") // IN

				.addFilterBy("NOTINDchSimNo1", "DCH_SIM_NO1 NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchSimNo1asc", "DCH_SIM_NO1 ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchSimNo1desc", "DCH_SIM_NO1 DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSimNo2", "(DCH_SIM_NO2) = ?")
				// EQUAL

				.addFilterBy("notequalDchSimNo2", "(DCH_SIM_NO2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSimNo2",
						"(DCH_SIM_NO2 IS NULL OR LENGTH((DCH_SIM_NO2)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchSimNo2", "DCH_SIM_NO2 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByDchSimNo2Match", "DCH_SIM_NO2 LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchSimNo2",
						"((DCH_SIM_NO2) = ? OR DCH_SIM_NO2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSimNo2", "DCH_SIM_NO2 IN ( ? )") // IN

				.addFilterBy("NOTINDchSimNo2", "DCH_SIM_NO2 NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchSimNo2asc", "DCH_SIM_NO2 ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchSimNo2desc", "DCH_SIM_NO2 DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSimProd1", "(DCH_SIM_PROD1) = ?")
				// EQUAL

				.addFilterBy("notequalDchSimProd1", "(DCH_SIM_PROD1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSimProd1",
						"(DCH_SIM_PROD1 IS NULL OR LENGTH((DCH_SIM_PROD1)) = 0)") // IS
																						// NULL

				.addFilterBy("notnullDchSimProd1", "DCH_SIM_PROD1 IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchSimProd1Match", "DCH_SIM_PROD1 LIKE ?") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullDchSimProd1",
						"((DCH_SIM_PROD1) = ? OR DCH_SIM_PROD1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSimProd1", "DCH_SIM_PROD1 IN ( ? )") // IN

				.addFilterBy("NOTINDchSimProd1", "DCH_SIM_PROD1 NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSimProd1asc", "DCH_SIM_PROD1 ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSimProd1desc", "DCH_SIM_PROD1 DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchSimProd2", "(DCH_SIM_PROD2) = ?")
				// EQUAL

				.addFilterBy("notequalDchSimProd2", "(DCH_SIM_PROD2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSimProd2",
						"(DCH_SIM_PROD2 IS NULL OR LENGTH((DCH_SIM_PROD2)) = 0)") // IS
																						// NULL

				.addFilterBy("notnullDchSimProd2", "DCH_SIM_PROD2 IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchSimProd2Match", "DCH_SIM_PROD2 LIKE ?") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullDchSimProd2",
						"((DCH_SIM_PROD2) = ? OR DCH_SIM_PROD2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDchSimProd2", "DCH_SIM_PROD2 IN ( ? )") // IN

				.addFilterBy("NOTINDchSimProd2", "DCH_SIM_PROD2 NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSimProd2asc", "DCH_SIM_PROD2 ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSimProd2desc", "DCH_SIM_PROD2 DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchDealerId", "(DCH_DEALER_ID) = ?")
				// EQUAL

				.addFilterBy("notequalDchDealerId", "(DCH_DEALER_ID) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchDealerId",
						"(DCH_DEALER_ID IS NULL OR LENGTH((DCH_DEALER_ID)) = 0)") // IS
																						// NULL

				.addFilterBy("notnullDchDealerId", "DCH_DEALER_ID IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchDealerIdMatch", "DCH_DEALER_ID LIKE ?") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullDchDealerId",
						"((DCH_DEALER_ID) = ? OR DCH_DEALER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDchDealerId", "DCH_DEALER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDchDealerId", "DCH_DEALER_ID NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchDealerIdasc", "DCH_DEALER_ID ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchDealerIddesc", "DCH_DEALER_ID DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchPackageCode",
						"(DCH_PACKAGE_CODE) = ?")
				// EQUAL

				.addFilterBy("notequalDchPackageCode",
						"(DCH_PACKAGE_CODE) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchPackageCode",
						"(DCH_PACKAGE_CODE IS NULL OR LENGTH((DCH_PACKAGE_CODE)) = 0)") // IS
																							// NULL

				.addFilterBy("notnullDchPackageCode",
						"DCH_PACKAGE_CODE IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDchPackageCodeMatch",
						"DCH_PACKAGE_CODE LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDchPackageCode",
						"((DCH_PACKAGE_CODE) = ? OR DCH_PACKAGE_CODE IS NULL)") // EQUALORNULL

				.addFilterBy("INDchPackageCode", "DCH_PACKAGE_CODE IN ( ? )") // IN

				.addFilterBy("NOTINDchPackageCode",
						"DCH_PACKAGE_CODE NOT IN ( ? )") // NOT IN

				.addOrderBy("DchPackageCodeasc", "DCH_PACKAGE_CODE ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DchPackageCodedesc", "DCH_PACKAGE_CODE DESC") // ORDER
																			// DESCENDING
		;

		table
				.addFilterBy("equalDchImei1Amt", "DCH_IMEI1_AMT = ?")
				// EQUAL

				.addFilterBy("notequalDchImei1Amt", "DCH_IMEI1_AMT != ?")
				// NOTEQUAL

				.addFilterBy("nullDchImei1Amt", "DCH_IMEI1_AMT IS NULL")
				// IS NULL

				.addFilterBy("notnullDchImei1Amt", "DCH_IMEI1_AMT IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDchImei1Amt", "DCH_IMEI1_AMT < ?")
				// LESS THAN

				.addFilterBy("greaterthanDchImei1Amt", "DCH_IMEI1_AMT > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDchImei1Amt", "DCH_IMEI1_AMT <= ?") // LESS
																					// THAN
																					// OR
																					// EQUAL

				.addFilterBy("greaterthanorequalDchImei1Amt",
						"DCH_IMEI1_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchImei1Amt",
						"DCH_IMEI1_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchImei1Amt",
						"(DCH_IMEI1_AMT IS NULL OR DCH_IMEI1_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchImei1Amt",
						"(DCH_IMEI1_AMT IS NULL OR DCH_IMEI1_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchImei1Amt",
						"(DCH_IMEI1_AMT IS NULL OR DCH_IMEI1_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchImei1Amt", "DCH_IMEI1_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchImei1Amt", "DCH_IMEI1_AMT NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchImei1Amtasc", "DCH_IMEI1_AMT ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchImei1Amtdesc", "DCH_IMEI1_AMT DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchImei2Amt", "DCH_IMEI2_AMT = ?")
				// EQUAL

				.addFilterBy("notequalDchImei2Amt", "DCH_IMEI2_AMT != ?")
				// NOTEQUAL

				.addFilterBy("nullDchImei2Amt", "DCH_IMEI2_AMT IS NULL")
				// IS NULL

				.addFilterBy("notnullDchImei2Amt", "DCH_IMEI2_AMT IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDchImei2Amt", "DCH_IMEI2_AMT < ?")
				// LESS THAN

				.addFilterBy("greaterthanDchImei2Amt", "DCH_IMEI2_AMT > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDchImei2Amt", "DCH_IMEI2_AMT <= ?") // LESS
																					// THAN
																					// OR
																					// EQUAL

				.addFilterBy("greaterthanorequalDchImei2Amt",
						"DCH_IMEI2_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchImei2Amt",
						"DCH_IMEI2_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchImei2Amt",
						"(DCH_IMEI2_AMT IS NULL OR DCH_IMEI2_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchImei2Amt",
						"(DCH_IMEI2_AMT IS NULL OR DCH_IMEI2_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchImei2Amt",
						"(DCH_IMEI2_AMT IS NULL OR DCH_IMEI2_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchImei2Amt", "DCH_IMEI2_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchImei2Amt", "DCH_IMEI2_AMT NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchImei2Amtasc", "DCH_IMEI2_AMT ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchImei2Amtdesc", "DCH_IMEI2_AMT DESC") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalDchSerial1Amt", "DCH_SERIAL1_AMT = ?") // EQUAL

				.addFilterBy("notequalDchSerial1Amt", "DCH_SERIAL1_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDchSerial1Amt", "DCH_SERIAL1_AMT IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDchSerial1Amt",
						"DCH_SERIAL1_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchSerial1Amt", "DCH_SERIAL1_AMT < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDchSerial1Amt", "DCH_SERIAL1_AMT > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalDchSerial1Amt",
						"DCH_SERIAL1_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchSerial1Amt",
						"DCH_SERIAL1_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchSerial1Amt",
						"DCH_SERIAL1_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSerial1Amt",
						"(DCH_SERIAL1_AMT IS NULL OR DCH_SERIAL1_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSerial1Amt",
						"(DCH_SERIAL1_AMT IS NULL OR DCH_SERIAL1_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSerial1Amt",
						"(DCH_SERIAL1_AMT IS NULL OR DCH_SERIAL1_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSerial1Amt", "DCH_SERIAL1_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial1Amt",
						"DCH_SERIAL1_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DchSerial1Amtasc", "DCH_SERIAL1_AMT ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchSerial1Amtdesc", "DCH_SERIAL1_AMT DESC") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDchSerial2Amt", "DCH_SERIAL2_AMT = ?") // EQUAL

				.addFilterBy("notequalDchSerial2Amt", "DCH_SERIAL2_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDchSerial2Amt", "DCH_SERIAL2_AMT IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDchSerial2Amt",
						"DCH_SERIAL2_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchSerial2Amt", "DCH_SERIAL2_AMT < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDchSerial2Amt", "DCH_SERIAL2_AMT > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalDchSerial2Amt",
						"DCH_SERIAL2_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchSerial2Amt",
						"DCH_SERIAL2_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchSerial2Amt",
						"DCH_SERIAL2_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSerial2Amt",
						"(DCH_SERIAL2_AMT IS NULL OR DCH_SERIAL2_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSerial2Amt",
						"(DCH_SERIAL2_AMT IS NULL OR DCH_SERIAL2_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSerial2Amt",
						"(DCH_SERIAL2_AMT IS NULL OR DCH_SERIAL2_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSerial2Amt", "DCH_SERIAL2_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial2Amt",
						"DCH_SERIAL2_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DchSerial2Amtasc", "DCH_SERIAL2_AMT ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchSerial2Amtdesc", "DCH_SERIAL2_AMT DESC") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDchSerial3Amt", "DCH_SERIAL3_AMT = ?") // EQUAL

				.addFilterBy("notequalDchSerial3Amt", "DCH_SERIAL3_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDchSerial3Amt", "DCH_SERIAL3_AMT IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDchSerial3Amt",
						"DCH_SERIAL3_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchSerial3Amt", "DCH_SERIAL3_AMT < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDchSerial3Amt", "DCH_SERIAL3_AMT > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalDchSerial3Amt",
						"DCH_SERIAL3_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchSerial3Amt",
						"DCH_SERIAL3_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchSerial3Amt",
						"DCH_SERIAL3_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSerial3Amt",
						"(DCH_SERIAL3_AMT IS NULL OR DCH_SERIAL3_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSerial3Amt",
						"(DCH_SERIAL3_AMT IS NULL OR DCH_SERIAL3_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSerial3Amt",
						"(DCH_SERIAL3_AMT IS NULL OR DCH_SERIAL3_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSerial3Amt", "DCH_SERIAL3_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchSerial3Amt",
						"DCH_SERIAL3_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DchSerial3Amtasc", "DCH_SERIAL3_AMT ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchSerial3Amtdesc", "DCH_SERIAL3_AMT DESC") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDchSimAmt1", "DCH_SIM_AMT1 = ?") // EQUAL

				.addFilterBy("notequalDchSimAmt1", "DCH_SIM_AMT1 != ?") // NOTEQUAL

				.addFilterBy("nullDchSimAmt1", "DCH_SIM_AMT1 IS NULL") // IS
																		// NULL

				.addFilterBy("notnullDchSimAmt1", "DCH_SIM_AMT1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDchSimAmt1", "DCH_SIM_AMT1 < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanDchSimAmt1", "DCH_SIM_AMT1 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalDchSimAmt1", "DCH_SIM_AMT1 <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalDchSimAmt1", "DCH_SIM_AMT1 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("betweenDchSimAmt1", "DCH_SIM_AMT1 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSimAmt1",
						"(DCH_SIM_AMT1 IS NULL OR DCH_SIM_AMT1 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSimAmt1",
						"(DCH_SIM_AMT1 IS NULL OR DCH_SIM_AMT1 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSimAmt1",
						"(DCH_SIM_AMT1 IS NULL OR DCH_SIM_AMT1 > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSimAmt1", "DCH_SIM_AMT1 IN ( ? )") // IN

				.addFilterBy("NOTINDchSimAmt1", "DCH_SIM_AMT1 NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchSimAmt1asc", "DCH_SIM_AMT1 ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchSimAmt1desc", "DCH_SIM_AMT1 DESC") // ORDER
																	// DESCENDING
		;
		
		table.addFilterBy("equalDchSimAmt2", "DCH_SIM_AMT2 = ?") // EQUAL

		.addFilterBy("notequalDchSimAmt2", "DCH_SIM_AMT2 != ?") // NOTEQUAL

		.addFilterBy("nullDchSimAmt2", "DCH_SIM_AMT2 IS NULL") // IS
																// NULL

		.addFilterBy("notnullDchSimAmt2", "DCH_SIM_AMT2 IS NOT NULL") // IS
																	// NOT
																	// NULL

		.addFilterBy("lessthanDchSimAmt2", "DCH_SIM_AMT2 < ?") // LESS
																// THAN

		.addFilterBy("greaterthanDchSimAmt2", "DCH_SIM_AMT2 > ?") // GREATER
																// THAN

		.addFilterBy("lessthanorequalDchSimAmt2", "DCH_SIM_AMT2 <= ?") // LESS
																		// THAN
																		// OR
																		// EQUAL

		.addFilterBy("greaterthanorequalDchSimAmt2", "DCH_SIM_AMT2 >= ?") // GREATER
																		// THAN
																		// OR
																		// EQUAL

		.addFilterBy("betweenDchSimAmt2", "DCH_SIM_AMT2 BETWEEN ? AND ?") // BETWEEN

		.addFilterBy("equalornullDchSimAmt2",
				"(DCH_SIM_AMT2 IS NULL OR DCH_SIM_AMT2 = ?)") // EQUALORNULL

		.addFilterBy("lessthanornullDchSimAmt2",
				"(DCH_SIM_AMT2 IS NULL OR DCH_SIM_AMT2 < ?)") // LESSTHANORNULL

		.addFilterBy("greaterthanornullDchSimAmt2",
				"(DCH_SIM_AMT2 IS NULL OR DCH_SIM_AMT2 > ?)") // GREATERTHANORNULL

		.addFilterBy("INDchSimAmt2", "DCH_SIM_AMT2 IN ( ? )") // IN

		.addFilterBy("NOTINDchSimAmt2", "DCH_SIM_AMT2 NOT IN ( ? )") // NOT
																	// IN

		.addOrderBy("DchSimAmt2asc", "DCH_SIM_AMT2 ASC") // ORDER
														// ASCENDING

		.addOrderBy("DchSimAmt2desc", "DCH_SIM_AMT2 DESC") // ORDER
															// DESCENDING
;		

		table.addFilterBy("equalDchClmAmt", "DCH_CLM_AMT = ?") // EQUAL

				.addFilterBy("notequalDchClmAmt", "DCH_CLM_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDchClmAmt", "DCH_CLM_AMT IS NULL") // IS
																		// NULL

				.addFilterBy("notnullDchClmAmt", "DCH_CLM_AMT IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDchClmAmt", "DCH_CLM_AMT < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanDchClmAmt", "DCH_CLM_AMT > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalDchClmAmt", "DCH_CLM_AMT <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalDchClmAmt", "DCH_CLM_AMT >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("betweenDchClmAmt", "DCH_CLM_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchClmAmt",
						"(DCH_CLM_AMT IS NULL OR DCH_CLM_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchClmAmt",
						"(DCH_CLM_AMT IS NULL OR DCH_CLM_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchClmAmt",
						"(DCH_CLM_AMT IS NULL OR DCH_CLM_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchClmAmt", "DCH_CLM_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDchClmAmt", "DCH_CLM_AMT NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchClmAmtasc", "DCH_CLM_AMT ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchClmAmtdesc", "DCH_CLM_AMT DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchSaveDate", "DCH_SAVE_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDchSaveDate", "DCH_SAVE_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDchSaveDate", "DCH_SAVE_DATE IS NULL")
				// IS NULL

				.addFilterBy("notnullDchSaveDate", "DCH_SAVE_DATE IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDchSaveDate", "DCH_SAVE_DATE < ?")
				// LESS THAN

				.addFilterBy("greaterthanDchSaveDate", "DCH_SAVE_DATE > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDchSaveDate", "DCH_SAVE_DATE <= ?") // LESS
																					// THAN
																					// OR
																					// EQUAL

				.addFilterBy("greaterthanorequalDchSaveDate",
						"DCH_SAVE_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchSaveDate",
						"DCH_SAVE_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSaveDate",
						"(DCH_SAVE_DATE IS NULL OR DCH_SAVE_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSaveDate",
						"(DCH_SAVE_DATE IS NULL OR DCH_SAVE_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSaveDate",
						"(DCH_SAVE_DATE IS NULL OR DCH_SAVE_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSaveDate", "DCH_SAVE_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDchSaveDate", "DCH_SAVE_DATE NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchSaveDateasc", "DCH_SAVE_DATE ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchSaveDatedesc", "DCH_SAVE_DATE DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchUserId", "(DCH_USER_ID) = ?")
				// EQUAL

				.addFilterBy("notequalDchUserId", "(DCH_USER_ID) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchUserId",
						"(DCH_USER_ID IS NULL OR LENGTH((DCH_USER_ID)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchUserId", "DCH_USER_ID IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByDchUserIdMatch", "DCH_USER_ID LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchUserId",
						"((DCH_USER_ID) = ? OR DCH_USER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDchUserId", "DCH_USER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDchUserId", "DCH_USER_ID NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DchUserIdasc", "DCH_USER_ID ASC") // ORDER
																// ASCENDING

				.addOrderBy("DchUserIddesc", "DCH_USER_ID DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDchErrWarn", "(DCH_ERR_WARN) = ?")
				// EQUAL

				.addFilterBy("notequalDchErrWarn", "(DCH_ERR_WARN) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchErrWarn",
						"(DCH_ERR_WARN IS NULL OR LENGTH((DCH_ERR_WARN)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullDchErrWarn", "DCH_ERR_WARN IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByDchErrWarnMatch", "DCH_ERR_WARN LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDchErrWarn",
						"((DCH_ERR_WARN) = ? OR DCH_ERR_WARN IS NULL)") // EQUALORNULL

				.addFilterBy("INDchErrWarn", "DCH_ERR_WARN IN ( ? )") // IN

				.addFilterBy("NOTINDchErrWarn", "DCH_ERR_WARN NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DchErrWarnasc", "DCH_ERR_WARN ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DchErrWarndesc", "DCH_ERR_WARN DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalDchSubmitDate", "DCH_SUBMIT_DATE = ?") // EQUAL

				.addFilterBy("notequalDchSubmitDate", "DCH_SUBMIT_DATE != ?") // NOTEQUAL

				.addFilterBy("nullDchSubmitDate", "DCH_SUBMIT_DATE IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDchSubmitDate",
						"DCH_SUBMIT_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchSubmitDate", "DCH_SUBMIT_DATE < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDchSubmitDate", "DCH_SUBMIT_DATE > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalDchSubmitDate",
						"DCH_SUBMIT_DATE <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchSubmitDate",
						"DCH_SUBMIT_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchSubmitDate",
						"DCH_SUBMIT_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchSubmitDate",
						"(DCH_SUBMIT_DATE IS NULL OR DCH_SUBMIT_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchSubmitDate",
						"(DCH_SUBMIT_DATE IS NULL OR DCH_SUBMIT_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchSubmitDate",
						"(DCH_SUBMIT_DATE IS NULL OR DCH_SUBMIT_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchSubmitDate", "DCH_SUBMIT_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDchSubmitDate",
						"DCH_SUBMIT_DATE NOT IN ( ? )") // NOT IN

				.addOrderBy("DchSubmitDateasc", "DCH_SUBMIT_DATE ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchSubmitDatedesc", "DCH_SUBMIT_DATE DESC") // ORDER
																			// DESCENDING
		;

		table
				.addFilterBy("equalDchErrorFlag", "(DCH_ERROR_FLAG) = ?")
				// EQUAL

				.addFilterBy("notequalDchErrorFlag",
						"(DCH_ERROR_FLAG) != ?")
				// NOTEQUAL

				.addFilterBy("nullDchErrorFlag",
						"(DCH_ERROR_FLAG IS NULL OR LENGTH((DCH_ERROR_FLAG)) = 0)") // IS
																						// NULL

				.addFilterBy("notnullDchErrorFlag",
						"DCH_ERROR_FLAG IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDchErrorFlagMatch",
						"DCH_ERROR_FLAG LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDchErrorFlag",
						"((DCH_ERROR_FLAG) = ? OR DCH_ERROR_FLAG IS NULL)") // EQUALORNULL

				.addFilterBy("INDchErrorFlag", "DCH_ERROR_FLAG IN ( ? )") // IN

				.addFilterBy("NOTINDchErrorFlag", "DCH_ERROR_FLAG NOT IN ( ? )") // NOT
																					// IN

				.addOrderBy("DchErrorFlagasc", "DCH_ERROR_FLAG ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DchErrorFlagdesc", "DCH_ERROR_FLAG DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalDchErrRetryCnt", "DCH_ERR_RETRY_CNT = ?")
				// EQUAL

				.addFilterBy("notequalDchErrRetryCnt", "DCH_ERR_RETRY_CNT != ?") // NOTEQUAL

				.addFilterBy("nullDchErrRetryCnt", "DCH_ERR_RETRY_CNT IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDchErrRetryCnt", "DCH_ERR_RETRY_CNT < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT > ?") // GREATER THAN

				.addFilterBy("lessthanorequalDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDchErrRetryCnt",
						"(DCH_ERR_RETRY_CNT IS NULL OR DCH_ERR_RETRY_CNT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDchErrRetryCnt",
						"(DCH_ERR_RETRY_CNT IS NULL OR DCH_ERR_RETRY_CNT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDchErrRetryCnt",
						"(DCH_ERR_RETRY_CNT IS NULL OR DCH_ERR_RETRY_CNT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDchErrRetryCnt", "DCH_ERR_RETRY_CNT IN ( ? )") // IN

				.addFilterBy("NOTINDchErrRetryCnt",
						"DCH_ERR_RETRY_CNT NOT IN ( ? )") // NOT IN

				.addOrderBy("DchErrRetryCntasc", "DCH_ERR_RETRY_CNT ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DchErrRetryCntdesc", "DCH_ERR_RETRY_CNT DESC") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDchErrRetryCnt", "DCH_SOURCE_SYSTEM = ?")
		// EQUAL

		.addFilterBy("notequalDchErrRetryCnt", "DCH_SOURCE_SYSTEM != ?") // NOTEQUAL

		.addFilterBy("nullDchErrRetryCnt", "DCH_SOURCE_SYSTEM IS NULL") // IS
																		// NULL

		.addFilterBy("notnullDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM IS NOT NULL") // IS NOT NULL

		.addFilterBy("lessthanDchErrRetryCnt", "DCH_SOURCE_SYSTEM < ?") // LESS
																		// THAN

		.addFilterBy("greaterthanDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM > ?") // GREATER THAN

		.addFilterBy("lessthanorequalDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM <= ?") // LESS THAN OR EQUAL

		.addFilterBy("greaterthanorequalDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM >= ?") // GREATER THAN OR EQUAL

		.addFilterBy("betweenDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM BETWEEN ? AND ?") // BETWEEN

		.addFilterBy("equalornullDchErrRetryCnt",
				"(DCH_SOURCE_SYSTEM IS NULL OR DCH_SOURCE_SYSTEM = ?)") // EQUALORNULL

		.addFilterBy("lessthanornullDchErrRetryCnt",
				"(DCH_SOURCE_SYSTEM IS NULL OR DCH_SOURCE_SYSTEM < ?)") // LESSTHANORNULL

		.addFilterBy("greaterthanornullDchErrRetryCnt",
				"(DCH_SOURCE_SYSTEM IS NULL OR DCH_SOURCE_SYSTEM > ?)") // GREATERTHANORNULL

		.addFilterBy("INDchErrRetryCnt", "DCH_SOURCE_SYSTEM IN ( ? )") // IN

		.addFilterBy("NOTINDchErrRetryCnt",
				"DCH_SOURCE_SYSTEM NOT IN ( ? )") // NOT IN

		.addOrderBy("DchErrRetryCntasc", "DCH_SOURCE_SYSTEM ASC") // ORDER
																	// ASCENDING

		.addOrderBy("DchErrRetryCntdesc", "DCH_SOURCE_SYSTEM DESC") // ORDER
																	// DESCENDING
		;
		
		table.addFilterBy("equalDchOfferId", "DCH_OFFER_ID = ?")
		// EQUAL

		.addFilterBy("notequalDchOfferId", "DCH_OFFER_ID != ?") // NOTEQUAL

		.addFilterBy("nullDchOfferId", "DCH_OFFER_ID IS NULL") // IS
																		// NULL

		.addFilterBy("notnullDchOfferId",
				"DCH_OFFER_ID IS NOT NULL") // IS NOT NULL

		.addFilterBy("lessthanDchOfferId", "DCH_OFFER_ID < ?") // LESS
																		// THAN

		.addFilterBy("greaterthanDchOfferId",
				"DCH_OFFER_ID > ?") // GREATER THAN

		.addFilterBy("lessthanorequalDchOfferId",
				"DCH_OFFER_ID <= ?") // LESS THAN OR EQUAL

		.addFilterBy("greaterthanorequalDchOfferId",
				"DCH_OFFER_ID >= ?") // GREATER THAN OR EQUAL

		.addFilterBy("betweenDchOfferId",
				"DCH_OFFER_ID BETWEEN ? AND ?") // BETWEEN

		.addFilterBy("equalornullDchOfferId",
				"(DCH_OFFER_ID IS NULL OR DCH_OFFER_ID = ?)") // EQUALORNULL

		.addFilterBy("lessthanornullDchOfferId",
				"(DCH_OFFER_ID IS NULL OR DCH_OFFER_ID < ?)") // LESSTHANORNULL

		.addFilterBy("greaterthanornullDchOfferId",
				"(DCH_OFFER_ID IS NULL OR DCH_OFFER_ID > ?)") // GREATERTHANORNULL

		.addFilterBy("INDchOfferId", "DCH_OFFER_ID IN ( ? )") // IN

		.addFilterBy("NOTINDchOfferId",
				"DCH_OFFER_ID NOT IN ( ? )") // NOT IN

		.addOrderBy("DchOfferIdasc", "DCH_OFFER_ID ASC") // ORDER
																	// ASCENDING

		.addOrderBy("DchOfferIddesc", "DCH_OFFER_ID DESC") // ORDER
																	// DESCENDING
;
		
		table.addFilterBy("equalDchGroupIndex", "DCH_GROUP_INDEX = ?")
		// EQUAL

		.addFilterBy("notequalDchGroupIndex", "DCH_GROUP_INDEX != ?") // NOTEQUAL

		.addFilterBy("nullDchGroupIndex", "DCH_GROUP_INDEX IS NULL") // IS
																		// NULL

		.addFilterBy("notnullDchGroupIndex",
				"DCH_GROUP_INDEX IS NOT NULL") // IS NOT NULL

		.addFilterBy("lessthanDchGroupIndex", "DCH_GROUP_INDEX < ?") // LESS
																		// THAN

		.addFilterBy("greaterthanDchGroupIndex",
				"DCH_GROUP_INDEX > ?") // GREATER THAN

		.addFilterBy("lessthanorequalDchGroupIndex",
				"DCH_GROUP_INDEX <= ?") // LESS THAN OR EQUAL

		.addFilterBy("greaterthanorequalDchGroupIndex",
				"DCH_GROUP_INDEX >= ?") // GREATER THAN OR EQUAL

		.addFilterBy("betweenDchGroupIndex",
				"DCH_GROUP_INDEX BETWEEN ? AND ?") // BETWEEN

		.addFilterBy("equalornullDchGroupIndex",
				"(DCH_GROUP_INDEX IS NULL OR DCH_GROUP_INDEX = ?)") // EQUALORNULL

		.addFilterBy("lessthanornullDchGroupIndex",
				"(DCH_GROUP_INDEX IS NULL OR DCH_GROUP_INDEX < ?)") // LESSTHANORNULL

		.addFilterBy("greaterthanornullDchGroupIndex",
				"(DCH_GROUP_INDEX IS NULL OR DCH_GROUP_INDEX > ?)") // GREATERTHANORNULL

		.addFilterBy("INDchGroupIndex", "DCH_GROUP_INDEX IN ( ? )") // IN

		.addFilterBy("NOTINDchGroupIndex",
				"DCH_GROUP_INDEX NOT IN ( ? )") // NOT IN

		.addOrderBy("DchGroupIndexasc", "DCH_GROUP_INDEX ASC") // ORDER
																	// ASCENDING

		.addOrderBy("DchGroupIndexdesc", "DCH_GROUP_INDEX DESC") // ORDER
																	// DESCENDING
;
		
		table.addFilterBy("equalDchCreateDate", "DCH_CREATE_DATE = ?")
		// EQUAL

		.addFilterBy("notequalDchCreateDate", "DCH_CREATE_DATE != ?") // NOTEQUAL

		.addFilterBy("nullDchCreateDate", "DCH_CREATE_DATE IS NULL") // IS
																		// NULL

		.addFilterBy("notnullDchCreateDate",
				"DCH_CREATE_DATE IS NOT NULL") // IS NOT NULL

		.addFilterBy("lessthanDchCreateDate", "DCH_CREATE_DATE < ?") // LESS
																		// THAN

		.addFilterBy("greaterthanDchCreateDate",
				"DCH_CREATE_DATE > ?") // GREATER THAN

		.addFilterBy("lessthanorequalDchCreateDate",
				"DCH_CREATE_DATE <= ?") // LESS THAN OR EQUAL

		.addFilterBy("greaterthanorequalDchCreateDate",
				"DCH_CREATE_DATE >= ?") // GREATER THAN OR EQUAL

		.addFilterBy("betweenDchCreateDate",
				"DCH_CREATE_DATE BETWEEN ? AND ?") // BETWEEN

		.addFilterBy("equalornullDchCreateDate",
				"(DCH_CREATE_DATE IS NULL OR DCH_CREATE_DATE = ?)") // EQUALORNULL

		.addFilterBy("lessthanornullDchCreateDate",
				"(DCH_CREATE_DATE IS NULL OR DCH_CREATE_DATE < ?)") // LESSTHANORNULL

		.addFilterBy("greaterthanornullDchCreateDate",
				"(DCH_CREATE_DATE IS NULL OR DCH_CREATE_DATE > ?)") // GREATERTHANORNULL

		.addFilterBy("INDchCreateDate", "DCH_CREATE_DATE IN ( ? )") // IN

		.addFilterBy("NOTINDchCreateDate",
				"DCH_CREATE_DATE NOT IN ( ? )") // NOT IN

		.addOrderBy("DchCreateDateasc", "DCH_CREATE_DATE ASC") // ORDER
																	// ASCENDING

		.addOrderBy("DchCreateDatedesc", "DCH_CREATE_DATE DESC") // ORDER
																	// DESCENDING
		;
		
		;
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

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
			dml = new DchDealerClmHdrAbstractDMLFactory();
		}

		return dml;
	}
}
