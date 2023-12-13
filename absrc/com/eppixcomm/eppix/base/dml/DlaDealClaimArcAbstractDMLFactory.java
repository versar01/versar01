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

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for DlaDealClaimArc.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DlaDealClaimArcAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DlaDealClaimArcAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected DlaDealClaimArcAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"DlaDealClaimArc", // dmlName
				"blo.DlaDealClaimArcDMO", // dmoName
				"DLA_DEAL_CLAIM_ARC", // tableName
				35, // numColumns
				"DLA_CLAIM_ID, DLA_ACT_TYPE, DLA_CLAIM_DATE, DLA_CONTRACT_DATE, DLA_SUBSCRIBER_ID, DLA_IMEI_1, DLA_IMEI_2, DLA_SERIAL_1, DLA_SERIAL_2"
						+ ", DLA_SERIAL_3, DLA_SIM_NO1, DLA_SIM_NO2, DLA_SIM_PROD1, DLA_SIM_PROD2, DLA_DEALER_ID, DLA_PACKAGE_CODE, DLA_IMEI1_AMT, DLA_IMEI2_AMT, DLA_SERIAL1_AMT, DLA_SERIAL2_AMT, DLA_SERIAL3_AMT"
						+ ", DLA_SIM_AMT1, DLA_SIM_AMT2, DLA_CLM_AMT, DLA_SAVE_DATE, DLA_USER_ID, DLA_ERR_WARN, DLA_SUBMIT_DATE, DLA_ERROR_FLAG, DLA_ERR_RETRY_CNT"
						+ ", DLA_SOURCE_SYSTEM, DLA_OFFER_ID, DLA_GROUP_INDEX, DLA_CREATE_DATE, DLA_CLAIM_POST_ID ", // columnList
				"DLA_CLAIM_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"DLA_CLAIM_ID, DLA_ACT_TYPE, DLA_CLAIM_DATE, DLA_CONTRACT_DATE, DLA_SUBSCRIBER_ID, DLA_IMEI_1, DLA_IMEI_2, DLA_SERIAL_1, DLA_SERIAL_2"
						+ ", DLA_SERIAL_3, DLA_SIM_NO1, DLA_SIM_NO2, DLA_SIM_PROD1, DLA_SIM_PROD2, DLA_DEALER_ID, DLA_PACKAGE_CODE, DLA_IMEI1_AMT, DLA_IMEI2_AMT, DLA_SERIAL1_AMT, DLA_SERIAL2_AMT, DLA_SERIAL3_AMT"
						+ ", DLA_SIM_AMT1, DLA_SIM_AMT2, DLA_CLM_AMT, DLA_SAVE_DATE, DLA_USER_ID, DLA_ERR_WARN, DLA_SUBMIT_DATE, DLA_ERROR_FLAG, DLA_ERR_RETRY_CNT"
						+ ", DLA_SOURCE_SYSTEM, DLA_OFFER_ID, DLA_GROUP_INDEX, DLA_CREATE_DATE, DLA_CLAIM_POST_ID ", // columnList
				"", "", new String[] { "DLA_CLAIM_ID", "DLA_ACT_TYPE",
						"DLA_CLAIM_DATE", "DLA_CONTRACT_DATE",
						"DLA_SUBSCRIBER_ID", "DLA_IMEI_1", "DLA_IMEI_2",
						"DLA_SERIAL_1", "DLA_SERIAL_2", "DLA_SERIAL_3",
						"DLA_SIM_NO1", "DLA_SIM_NO2", "DLA_SIM_PROD1",
						"DLA_SIM_PROD2", "DLA_DEALER_ID", "DLA_PACKAGE_CODE",
						"DLA_IMEI1_AMT", "DLA_IMEI2_AMT", "DLA_SERIAL1_AMT",
						"DLA_SERIAL2_AMT", "DLA_SERIAL3_AMT", "DLA_SIM_AMT1",
						"DLA_SIM_AMT2", "DLA_CLM_AMT", "DLA_SAVE_DATE",
						"DLA_USER_ID", "DLA_ERR_WARN", "DLA_SUBMIT_DATE",
						"DLA_ERROR_FLAG", "DLA_ERR_RETRY_CNT",
						"DLA_SOURCE_SYSTEM", "DLA_OFFER_ID", "DLA_GROUP_INDEX",
						"DLA_CREATE_DATE", "DLA_CLAIM_POST_ID" });

		table.addFilterBy("equalDlaClaimId", /* PK attribute */
		"DLA_CLAIM_ID = ?")
				.addFilterBy("INDlaClaimId", "DLA_CLAIM_ID IN ( ? )") // IN

				.addFilterBy("NOTINDlaClaimId", "DLA_CLAIM_ID NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaClaimIdasc", "DLA_CLAIM_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaClaimIddesc", "DLA_CLAIM_ID DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaActType", "(DLA_ACT_TYPE) = ?")
				// EQUAL

				.addFilterBy("notequalDlaActType", "(DLA_ACT_TYPE) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaActType",
						"(DLA_ACT_TYPE IS NULL OR LENGTH(TRIM(DLA_ACT_TYPE)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaActType", "DLA_ACT_TYPE IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaActTypeMatch", "DLA_ACT_TYPE LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaActType",
						"((DLA_ACT_TYPE) = ? OR DLA_ACT_TYPE IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaActType", "DLA_ACT_TYPE IN ( ? )") // IN

				.addFilterBy("NOTINDlaActType", "DLA_ACT_TYPE NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaActTypeasc", "DLA_ACT_TYPE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaActTypedesc", "DLA_ACT_TYPE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaClaimDate", "DLA_CLAIM_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDlaClaimDate", "DLA_CLAIM_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaClaimDate", "DLA_CLAIM_DATE IS NULL")
				// IS NULL

				.addFilterBy("notnullDlaClaimDate",
						"DLA_CLAIM_DATE IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDlaClaimDate", "DLA_CLAIM_DATE < ?")
				// LESS THAN

				.addFilterBy("greaterthanDlaClaimDate", "DLA_CLAIM_DATE > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDlaClaimDate",
						"DLA_CLAIM_DATE <= ?")
				// LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaClaimDate",
						"DLA_CLAIM_DATE >= ?")
				// GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaClaimDate",
						"DLA_CLAIM_DATE BETWEEN ? AND ?")
				// BETWEEN

				.addFilterBy("equalornullDlaClaimDate",
						"(DLA_CLAIM_DATE IS NULL OR DLA_CLAIM_DATE = ?)")
				// EQUALORNULL

				.addFilterBy("lessthanornullDlaClaimDate",
						"(DLA_CLAIM_DATE IS NULL OR DLA_CLAIM_DATE < ?)")
				// LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaClaimDate",
						"(DLA_CLAIM_DATE IS NULL OR DLA_CLAIM_DATE > ?)")
				// GREATERTHANORNULL

				.addFilterBy("INDlaClaimDate", "DLA_CLAIM_DATE IN ( ? )")
				// IN

				.addFilterBy("NOTINDlaClaimDate", "DLA_CLAIM_DATE NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaClaimDateasc", "DLA_CLAIM_DATE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaClaimDatedesc", "DLA_CLAIM_DATE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaContractDate", "DLA_CONTRACT_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDlaContractDate",
						"DLA_CONTRACT_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaContractDate", "DLA_CONTRACT_DATE IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaContractDate",
						"DLA_CONTRACT_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaContractDate", "DLA_CONTRACT_DATE < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaContractDate",
						"DLA_CONTRACT_DATE > ?") // GREATER THAN

				.addFilterBy("lessthanorequalDlaContractDate",
						"DLA_CONTRACT_DATE <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaContractDate",
						"DLA_CONTRACT_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaContractDate",
						"DLA_CONTRACT_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaContractDate",
						"(DLA_CONTRACT_DATE IS NULL OR DLA_CONTRACT_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaContractDate",
						"(DLA_CONTRACT_DATE IS NULL OR DLA_CONTRACT_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaContractDate",
						"(DLA_CONTRACT_DATE IS NULL OR DLA_CONTRACT_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaContractDate", "DLA_CONTRACT_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDlaContractDate",
						"DLA_CONTRACT_DATE NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaContractDateasc", "DLA_CONTRACT_DATE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaContractDatedesc", "DLA_CONTRACT_DATE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSubscriberId",
						"(DLA_SUBSCRIBER_ID) = ?") // EQUAL

				.addFilterBy("notequalDlaSubscriberId",
						"(DLA_SUBSCRIBER_ID) != ?") // NOTEQUAL

				.addFilterBy("nullDlaSubscriberId",
						"(DLA_SUBSCRIBER_ID IS NULL OR LENGTH(TRIM(DLA_SUBSCRIBER_ID)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSubscriberId",
						"DLA_SUBSCRIBER_ID IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDlaSubscriberIdMatch",
						"DLA_SUBSCRIBER_ID LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullDlaSubscriberId",
						"((DLA_SUBSCRIBER_ID) = ? OR DLA_SUBSCRIBER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSubscriberId", "DLA_SUBSCRIBER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDlaSubscriberId",
						"DLA_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSubscriberIdasc", "DLA_SUBSCRIBER_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSubscriberIddesc", "DLA_SUBSCRIBER_ID DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaImei1", "(DLA_IMEI_1) = ?") // EQUAL

				.addFilterBy("notequalDlaImei1", "(DLA_IMEI_1) != ?") // NOTEQUAL

				.addFilterBy("nullDlaImei1",
						"(DLA_IMEI_1 IS NULL OR LENGTH(TRIM(DLA_IMEI_1)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaImei1", "DLA_IMEI_1 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaImei1Match", "DLA_IMEI_1 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaImei1",
						"((DLA_IMEI_1) = ? OR DLA_IMEI_1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaImei1", "DLA_IMEI_1 IN ( ? )") // IN

				.addFilterBy("NOTINDlaImei1", "DLA_IMEI_1 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaImei1asc", "DLA_IMEI_1 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaImei1desc", "DLA_IMEI_1 DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaImei2", "(DLA_IMEI_2) = ?") // EQUAL

				.addFilterBy("notequalDlaImei2", "(DLA_IMEI_2) != ?") // NOTEQUAL

				.addFilterBy("nullDlaImei2",
						"(DLA_IMEI_2 IS NULL OR LENGTH(TRIM(DLA_IMEI_2)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaImei2", "DLA_IMEI_2 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaImei2Match", "DLA_IMEI_2 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaImei2",
						"((DLA_IMEI_2) = ? OR DLA_IMEI_2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaImei2", "DLA_IMEI_2 IN ( ? )") // IN

				.addFilterBy("NOTINDlaImei2", "DLA_IMEI_2 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaImei2asc", "DLA_IMEI_2 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaImei2desc", "DLA_IMEI_2 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSerial1", "(DLA_SERIAL_1) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSerial1", "(DLA_SERIAL_1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSerial1",
						"(DLA_SERIAL_1 IS NULL OR LENGTH(TRIM(DLA_SERIAL_1)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSerial1", "DLA_SERIAL_1 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSerial1Match", "DLA_SERIAL_1 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSerial1",
						"((DLA_SERIAL_1) = ? OR DLA_SERIAL_1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSerial1", "DLA_SERIAL_1 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial1", "DLA_SERIAL_1 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSerial1asc", "DLA_SERIAL_1 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial1desc", "DLA_SERIAL_1 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSerial2", "(DLA_SERIAL_2) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSerial2", "(DLA_SERIAL_2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSerial2",
						"(DLA_SERIAL_2 IS NULL OR LENGTH(TRIM(DLA_SERIAL_2)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSerial2", "DLA_SERIAL_2 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSerial2Match", "DLA_SERIAL_2 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSerial2",
						"((DLA_SERIAL_2) = ? OR DLA_SERIAL_2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSerial2", "DLA_SERIAL_2 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial2", "DLA_SERIAL_2 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSerial2asc", "DLA_SERIAL_2 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial2desc", "DLA_SERIAL_2 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSerial3", "(DLA_SERIAL_3) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSerial3", "(DLA_SERIAL_3) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSerial3",
						"(DLA_SERIAL_3 IS NULL OR LENGTH(TRIM(DLA_SERIAL_3)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSerial3", "DLA_SERIAL_3 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSerial3Match", "DLA_SERIAL_3 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSerial3",
						"((DLA_SERIAL_3) = ? OR DLA_SERIAL_3 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSerial3", "DLA_SERIAL_3 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial3", "DLA_SERIAL_3 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSerial3asc", "DLA_SERIAL_3 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial3desc", "DLA_SERIAL_3 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSimNo1", "(DLA_SIM_NO1) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSimNo1", "(DLA_SIM_NO1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSimNo1",
						"(DLA_SIM_NO1 IS NULL OR LENGTH(TRIM(DLA_SIM_NO1)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSimNo1", "DLA_SIM_NO1 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSimNo1Match", "DLA_SIM_NO1 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSimNo1",
						"((DLA_SIM_NO1) = ? OR DLA_SIM_NO1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSimNo1", "DLA_SIM_NO1 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimNo1", "DLA_SIM_NO1 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimNo1asc", "DLA_SIM_NO1 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimNo1desc", "DLA_SIM_NO1 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSimNo2", "(DLA_SIM_NO2) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSimNo2", "(DLA_SIM_NO2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSimNo2",
						"(DLA_SIM_NO2 IS NULL OR LENGTH(TRIM(DLA_SIM_NO2)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSimNo2", "DLA_SIM_NO2 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSimNo2Match", "DLA_SIM_NO2 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSimNo2",
						"((DLA_SIM_NO2) = ? OR DLA_SIM_NO2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSimNo2", "DLA_SIM_NO2 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimNo2", "DLA_SIM_NO2 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimNo2asc", "DLA_SIM_NO2 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimNo2desc", "DLA_SIM_NO2 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSimProd1", "(DLA_SIM_PROD1) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSimProd1", "(DLA_SIM_PROD1) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSimProd1",
						"(DLA_SIM_PROD1 IS NULL OR LENGTH(TRIM(DLA_SIM_PROD1)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSimProd1", "DLA_SIM_PROD1 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSimProd1Match", "DLA_SIM_PROD1 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSimProd1",
						"((DLA_SIM_PROD1) = ? OR DLA_SIM_PROD1 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSimProd1", "DLA_SIM_PROD1 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimProd1", "DLA_SIM_PROD1 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimProd1asc", "DLA_SIM_PROD1 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimProd1desc", "DLA_SIM_PROD1 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSimProd2", "(DLA_SIM_PROD2) = ?")
				// EQUAL

				.addFilterBy("notequalDlaSimProd2", "(DLA_SIM_PROD2) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSimProd2",
						"(DLA_SIM_PROD2 IS NULL OR LENGTH(TRIM(DLA_SIM_PROD2)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaSimProd2", "DLA_SIM_PROD2 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaSimProd2Match", "DLA_SIM_PROD2 LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaSimProd2",
						"((DLA_SIM_PROD2) = ? OR DLA_SIM_PROD2 IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaSimProd2", "DLA_SIM_PROD2 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimProd2", "DLA_SIM_PROD2 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimProd2asc", "DLA_SIM_PROD2 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimProd2desc", "DLA_SIM_PROD2 DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaDealerId", "(DLA_DEALER_ID) = ?")
				// EQUAL

				.addFilterBy("notequalDlaDealerId", "(DLA_DEALER_ID) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaDealerId",
						"(DLA_DEALER_ID IS NULL OR LENGTH(TRIM(DLA_DEALER_ID)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaDealerId", "DLA_DEALER_ID IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaDealerIdMatch", "DLA_DEALER_ID LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaDealerId",
						"((DLA_DEALER_ID) = ? OR DLA_DEALER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaDealerId", "DLA_DEALER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDlaDealerId", "DLA_DEALER_ID NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaDealerIdasc", "DLA_DEALER_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaDealerIddesc", "DLA_DEALER_ID DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaPackageCode",
						"(DLA_PACKAGE_CODE) = ?")
				// EQUAL

				.addFilterBy("notequalDlaPackageCode",
						"(DLA_PACKAGE_CODE) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaPackageCode",
						"(DLA_PACKAGE_CODE IS NULL OR LENGTH(TRIM(DLA_PACKAGE_CODE)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaPackageCode",
						"DLA_PACKAGE_CODE IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDlaPackageCodeMatch",
						"DLA_PACKAGE_CODE LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullDlaPackageCode",
						"((DLA_PACKAGE_CODE) = ? OR DLA_PACKAGE_CODE IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaPackageCode", "DLA_PACKAGE_CODE IN ( ? )") // IN

				.addFilterBy("NOTINDlaPackageCode",
						"DLA_PACKAGE_CODE NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaPackageCodeasc", "DLA_PACKAGE_CODE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaPackageCodedesc", "DLA_PACKAGE_CODE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaImei1Amt", "DLA_IMEI1_AMT = ?")
				// EQUAL

				.addFilterBy("notequalDlaImei1Amt", "DLA_IMEI1_AMT != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaImei1Amt", "DLA_IMEI1_AMT IS NULL")
				// IS NULL

				.addFilterBy("notnullDlaImei1Amt", "DLA_IMEI1_AMT IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDlaImei1Amt", "DLA_IMEI1_AMT < ?")
				// LESS THAN

				.addFilterBy("greaterthanDlaImei1Amt", "DLA_IMEI1_AMT > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDlaImei1Amt", "DLA_IMEI1_AMT <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaImei1Amt",
						"DLA_IMEI1_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaImei1Amt",
						"DLA_IMEI1_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaImei1Amt",
						"(DLA_IMEI1_AMT IS NULL OR DLA_IMEI1_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaImei1Amt",
						"(DLA_IMEI1_AMT IS NULL OR DLA_IMEI1_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaImei1Amt",
						"(DLA_IMEI1_AMT IS NULL OR DLA_IMEI1_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaImei1Amt", "DLA_IMEI1_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaImei1Amt", "DLA_IMEI1_AMT NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaImei1Amtasc", "DLA_IMEI1_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaImei1Amtdesc", "DLA_IMEI1_AMT DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaImei2Amt", "DLA_IMEI2_AMT = ?")
				// EQUAL

				.addFilterBy("notequalDlaImei2Amt", "DLA_IMEI2_AMT != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaImei2Amt", "DLA_IMEI2_AMT IS NULL")
				// IS NULL

				.addFilterBy("notnullDlaImei2Amt", "DLA_IMEI2_AMT IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDlaImei2Amt", "DLA_IMEI2_AMT < ?")
				// LESS THAN

				.addFilterBy("greaterthanDlaImei2Amt", "DLA_IMEI2_AMT > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDlaImei2Amt", "DLA_IMEI2_AMT <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaImei2Amt",
						"DLA_IMEI2_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaImei2Amt",
						"DLA_IMEI2_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaImei2Amt",
						"(DLA_IMEI2_AMT IS NULL OR DLA_IMEI2_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaImei2Amt",
						"(DLA_IMEI2_AMT IS NULL OR DLA_IMEI2_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaImei2Amt",
						"(DLA_IMEI2_AMT IS NULL OR DLA_IMEI2_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaImei2Amt", "DLA_IMEI2_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaImei2Amt", "DLA_IMEI2_AMT NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaImei2Amtasc", "DLA_IMEI2_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaImei2Amtdesc", "DLA_IMEI2_AMT DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSerial1Amt", "DLA_SERIAL1_AMT = ?") // EQUAL

				.addFilterBy("notequalDlaSerial1Amt", "DLA_SERIAL1_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDlaSerial1Amt", "DLA_SERIAL1_AMT IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSerial1Amt",
						"DLA_SERIAL1_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaSerial1Amt", "DLA_SERIAL1_AMT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSerial1Amt", "DLA_SERIAL1_AMT > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSerial1Amt",
						"DLA_SERIAL1_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaSerial1Amt",
						"DLA_SERIAL1_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSerial1Amt",
						"DLA_SERIAL1_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSerial1Amt",
						"(DLA_SERIAL1_AMT IS NULL OR DLA_SERIAL1_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSerial1Amt",
						"(DLA_SERIAL1_AMT IS NULL OR DLA_SERIAL1_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSerial1Amt",
						"(DLA_SERIAL1_AMT IS NULL OR DLA_SERIAL1_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSerial1Amt", "DLA_SERIAL1_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial1Amt",
						"DLA_SERIAL1_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSerial1Amtasc", "DLA_SERIAL1_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial1Amtdesc", "DLA_SERIAL1_AMT DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSerial2Amt", "DLA_SERIAL2_AMT = ?") // EQUAL

				.addFilterBy("notequalDlaSerial2Amt", "DLA_SERIAL2_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDlaSerial2Amt", "DLA_SERIAL2_AMT IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSerial2Amt",
						"DLA_SERIAL2_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaSerial2Amt", "DLA_SERIAL2_AMT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSerial2Amt", "DLA_SERIAL2_AMT > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSerial2Amt",
						"DLA_SERIAL2_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaSerial2Amt",
						"DLA_SERIAL2_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSerial2Amt",
						"DLA_SERIAL2_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSerial2Amt",
						"(DLA_SERIAL2_AMT IS NULL OR DLA_SERIAL2_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSerial2Amt",
						"(DLA_SERIAL2_AMT IS NULL OR DLA_SERIAL2_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSerial2Amt",
						"(DLA_SERIAL2_AMT IS NULL OR DLA_SERIAL2_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSerial2Amt", "DLA_SERIAL2_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial2Amt",
						"DLA_SERIAL2_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSerial2Amtasc", "DLA_SERIAL2_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial2Amtdesc", "DLA_SERIAL2_AMT DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSerial3Amt", "DLA_SERIAL3_AMT = ?") // EQUAL

				.addFilterBy("notequalDlaSerial3Amt", "DLA_SERIAL3_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDlaSerial3Amt", "DLA_SERIAL3_AMT IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSerial3Amt",
						"DLA_SERIAL3_AMT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaSerial3Amt", "DLA_SERIAL3_AMT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSerial3Amt", "DLA_SERIAL3_AMT > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSerial3Amt",
						"DLA_SERIAL3_AMT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaSerial3Amt",
						"DLA_SERIAL3_AMT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSerial3Amt",
						"DLA_SERIAL3_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSerial3Amt",
						"(DLA_SERIAL3_AMT IS NULL OR DLA_SERIAL3_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSerial3Amt",
						"(DLA_SERIAL3_AMT IS NULL OR DLA_SERIAL3_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSerial3Amt",
						"(DLA_SERIAL3_AMT IS NULL OR DLA_SERIAL3_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSerial3Amt", "DLA_SERIAL3_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaSerial3Amt",
						"DLA_SERIAL3_AMT NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSerial3Amtasc", "DLA_SERIAL3_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSerial3Amtdesc", "DLA_SERIAL3_AMT DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSimAmt1", "DLA_SIM_AMT1 = ?") // EQUAL

				.addFilterBy("notequalDlaSimAmt1", "DLA_SIM_AMT1 != ?") // NOTEQUAL

				.addFilterBy("nullDlaSimAmt1", "DLA_SIM_AMT1 IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSimAmt1", "DLA_SIM_AMT1 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanDlaSimAmt1", "DLA_SIM_AMT1 < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSimAmt1", "DLA_SIM_AMT1 > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSimAmt1", "DLA_SIM_AMT1 <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaSimAmt1",
						"DLA_SIM_AMT1 >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSimAmt1",
						"DLA_SIM_AMT1 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSimAmt1",
						"(DLA_SIM_AMT1 IS NULL OR DLA_SIM_AMT1 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSimAmt",
						"(DLA_SIM_AMT1 IS NULL OR DLA_SIM_AMT1 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSimAmt1",
						"(DLA_SIM_AMT1 IS NULL OR DLA_SIM_AMT1 > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSimAmt1", "DLA_SIM_AMT1 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimAmt1", "DLA_SIM_AMT1 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimAmt1asc", "DLA_SIM_AMT1 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimAmt1desc", "DLA_SIM_AMT1 DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSimAmt2", "DLA_SIM_AMT2 = ?") // EQUAL

				.addFilterBy("notequalDlaSimAmt2", "DLA_SIM_AMT2 != ?") // NOTEQUAL

				.addFilterBy("nullDlaSimAmt2", "DLA_SIM_AMT2 IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSimAmt2", "DLA_SIM_AMT2 IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanDlaSimAmt2", "DLA_SIM_AMT2 < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSimAmt2", "DLA_SIM_AMT2 > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSimAmt2", "DLA_SIM_AMT2 <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaSimAmt2",
						"DLA_SIM_AMT2 >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSimAmt2",
						"DLA_SIM_AMT2 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSimAmt2",
						"(DLA_SIM_AMT2 IS NULL OR DLA_SIM_AMT2 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSimAmt2",
						"(DLA_SIM_AMT2 IS NULL OR DLA_SIM_AMT2 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSimAmt2",
						"(DLA_SIM_AMT2 IS NULL OR DLA_SIM_AMT2 > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSimAmt2", "DLA_SIM_AMT2 IN ( ? )") // IN

				.addFilterBy("NOTINDlaSimAmt2", "DLA_SIM_AMT2 NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSimAmt2asc", "DLA_SIM_AMT2 ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSimAmt2desc", "DLA_SIM_AMT2 DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaClmAmt", "DLA_CLM_AMT = ?") // EQUAL

				.addFilterBy("notequalDlaClmAmt", "DLA_CLM_AMT != ?") // NOTEQUAL

				.addFilterBy("nullDlaClmAmt", "DLA_CLM_AMT IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaClmAmt", "DLA_CLM_AMT IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanDlaClmAmt", "DLA_CLM_AMT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaClmAmt", "DLA_CLM_AMT > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaClmAmt", "DLA_CLM_AMT <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaClmAmt", "DLA_CLM_AMT >= ?") // GREATER
				// THAN
				// OR
				// EQUAL

				.addFilterBy("betweenDlaClmAmt", "DLA_CLM_AMT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaClmAmt",
						"(DLA_CLM_AMT IS NULL OR DLA_CLM_AMT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaClmAmt",
						"(DLA_CLM_AMT IS NULL OR DLA_CLM_AMT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaClmAmt",
						"(DLA_CLM_AMT IS NULL OR DLA_CLM_AMT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaClmAmt", "DLA_CLM_AMT IN ( ? )") // IN

				.addFilterBy("NOTINDlaClmAmt", "DLA_CLM_AMT NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaClmAmtasc", "DLA_CLM_AMT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaClmAmtdesc", "DLA_CLM_AMT DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSaveDate", "DLA_SAVE_DATE = ?")
				// EQUAL

				.addFilterBy("notequalDlaSaveDate", "DLA_SAVE_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSaveDate", "DLA_SAVE_DATE IS NULL")
				// IS NULL

				.addFilterBy("notnullDlaSaveDate", "DLA_SAVE_DATE IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanDlaSaveDate", "DLA_SAVE_DATE < ?")
				// LESS THAN

				.addFilterBy("greaterthanDlaSaveDate", "DLA_SAVE_DATE > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalDlaSaveDate", "DLA_SAVE_DATE <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaSaveDate",
						"DLA_SAVE_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSaveDate",
						"DLA_SAVE_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSaveDate",
						"(DLA_SAVE_DATE IS NULL OR DLA_SAVE_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSaveDate",
						"(DLA_SAVE_DATE IS NULL OR DLA_SAVE_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSaveDate",
						"(DLA_SAVE_DATE IS NULL OR DLA_SAVE_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSaveDate", "DLA_SAVE_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDlaSaveDate", "DLA_SAVE_DATE NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaSaveDateasc", "DLA_SAVE_DATE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSaveDatedesc", "DLA_SAVE_DATE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaUserId", "(DLA_USER_ID) = ?")
				// EQUAL

				.addFilterBy("notequalDlaUserId", "(DLA_USER_ID) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaUserId",
						"(DLA_USER_ID IS NULL OR LENGTH(TRIM(DLA_USER_ID)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaUserId", "DLA_USER_ID IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaUserIdMatch", "DLA_USER_ID LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaUserId",
						"((DLA_USER_ID) = ? OR DLA_USER_ID IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaUserId", "DLA_USER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDlaUserId", "DLA_USER_ID NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaUserIdasc", "DLA_USER_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaUserIddesc", "DLA_USER_ID DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaErrWarn", "(DLA_ERR_WARN) = ?")
				// EQUAL

				.addFilterBy("notequalDlaErrWarn", "(DLA_ERR_WARN) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaErrWarn",
						"(DLA_ERR_WARN IS NULL OR LENGTH(TRIM(DLA_ERR_WARN)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaErrWarn", "DLA_ERR_WARN IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("filterByDlaErrWarnMatch", "DLA_ERR_WARN LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullDlaErrWarn",
						"((DLA_ERR_WARN) = ? OR DLA_ERR_WARN IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaErrWarn", "DLA_ERR_WARN IN ( ? )") // IN

				.addFilterBy("NOTINDlaErrWarn", "DLA_ERR_WARN NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaErrWarnasc", "DLA_ERR_WARN ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaErrWarndesc", "DLA_ERR_WARN DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaSubmitDate", "DLA_SUBMIT_DATE = ?") // EQUAL

				.addFilterBy("notequalDlaSubmitDate", "DLA_SUBMIT_DATE != ?") // NOTEQUAL

				.addFilterBy("nullDlaSubmitDate", "DLA_SUBMIT_DATE IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSubmitDate",
						"DLA_SUBMIT_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaSubmitDate", "DLA_SUBMIT_DATE < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSubmitDate", "DLA_SUBMIT_DATE > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaSubmitDate",
						"DLA_SUBMIT_DATE <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaSubmitDate",
						"DLA_SUBMIT_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSubmitDate",
						"DLA_SUBMIT_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSubmitDate",
						"(DLA_SUBMIT_DATE IS NULL OR DLA_SUBMIT_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSubmitDate",
						"(DLA_SUBMIT_DATE IS NULL OR DLA_SUBMIT_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSubmitDate",
						"(DLA_SUBMIT_DATE IS NULL OR DLA_SUBMIT_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSubmitDate", "DLA_SUBMIT_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDlaSubmitDate",
						"DLA_SUBMIT_DATE NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSubmitDateasc", "DLA_SUBMIT_DATE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSubmitDatedesc", "DLA_SUBMIT_DATE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaErrorFlag", "(DLA_ERROR_FLAG) = ?")
				// EQUAL

				.addFilterBy("notequalDlaErrorFlag",
						"(DLA_ERROR_FLAG) != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaErrorFlag",
						"(DLA_ERROR_FLAG IS NULL OR LENGTH(TRIM(DLA_ERROR_FLAG)) = 0)") // IS
				// NULL

				.addFilterBy("notnullDlaErrorFlag",
						"DLA_ERROR_FLAG IS NOT NULL") // IS NOT NULL

				.addFilterBy("filterByDlaErrorFlagMatch",
						"DLA_ERROR_FLAG LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullDlaErrorFlag",
						"((DLA_ERROR_FLAG) = ? OR DLA_ERROR_FLAG IS NULL)") // EQUALORNULL

				.addFilterBy("INDlaErrorFlag", "DLA_ERROR_FLAG IN ( ? )") // IN

				.addFilterBy("NOTINDlaErrorFlag", "DLA_ERROR_FLAG NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaErrorFlagasc", "DLA_ERROR_FLAG ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaErrorFlagdesc", "DLA_ERROR_FLAG DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaErrRetryCnt", "DLA_ERR_RETRY_CNT = ?")
				// EQUAL

				.addFilterBy("notequalDlaErrRetryCnt", "DLA_ERR_RETRY_CNT != ?") // NOTEQUAL

				.addFilterBy("nullDlaErrRetryCnt", "DLA_ERR_RETRY_CNT IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaErrRetryCnt", "DLA_ERR_RETRY_CNT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT > ?") // GREATER THAN

				.addFilterBy("lessthanorequalDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaErrRetryCnt",
						"(DLA_ERR_RETRY_CNT IS NULL OR DLA_ERR_RETRY_CNT = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaErrRetryCnt",
						"(DLA_ERR_RETRY_CNT IS NULL OR DLA_ERR_RETRY_CNT < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaErrRetryCnt",
						"(DLA_ERR_RETRY_CNT IS NULL OR DLA_ERR_RETRY_CNT > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaErrRetryCnt", "DLA_ERR_RETRY_CNT IN ( ? )") // IN

				.addFilterBy("NOTINDlaErrRetryCnt",
						"DLA_ERR_RETRY_CNT NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaErrRetryCntasc", "DLA_ERR_RETRY_CNT ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaErrRetryCntdesc", "DLA_ERR_RETRY_CNT DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaSourceSystem", "DLA_SOURCE_SYSTEM = ?")
				// EQUAL

				.addFilterBy("notequalDlaSourceSystem",
						"DLA_SOURCE_SYSTEM != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaSourceSystem", "DLA_SOURCE_SYSTEM IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaSourceSystem",
						"DLA_SOURCE_SYSTEM IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaSourceSystem", "DLA_SOURCE_SYSTEM < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaSourceSystem",
						"DLA_SOURCE_SYSTEM > ?") // GREATER THAN

				.addFilterBy("lessthanorequalDlaSourceSystem",
						"DLA_SOURCE_SYSTEM <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaSourceSystem",
						"DLA_SOURCE_SYSTEM >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaSourceSystem",
						"DLA_SOURCE_SYSTEM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaSourceSystem",
						"(DLA_SOURCE_SYSTEM IS NULL OR DLA_SOURCE_SYSTEM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaSourceSystem",
						"(DLA_SOURCE_SYSTEM IS NULL OR DLA_SOURCE_SYSTEM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaSourceSystem",
						"(DLA_SOURCE_SYSTEM IS NULL OR DLA_SOURCE_SYSTEM > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaSourceSystem", "DLA_SOURCE_SYSTEM IN ( ? )") // IN

				.addFilterBy("NOTINDlaSourceSystem",
						"DLA_SOURCE_SYSTEM NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaSourceSystemasc", "DLA_SOURCE_SYSTEM ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaSourceSystemdesc", "DLA_SOURCE_SYSTEM DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaOfferId", "DLA_OFFER_ID = ?")
		// EQUAL

				.addFilterBy("notequalDlaOfferId", "DLA_OFFER_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaOfferId", "DLA_OFFER_ID IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaOfferId", "DLA_OFFER_ID IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanDlaOfferId", "DLA_OFFER_ID < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaOfferId", "DLA_OFFER_ID > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaOfferId", "DLA_OFFER_ID <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalDlaOfferId",
						"DLA_OFFER_ID >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaOfferId",
						"DLA_OFFER_ID BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaOfferId",
						"(DLA_OFFER_ID IS NULL OR DLA_OFFER_ID = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaOfferId",
						"(DLA_OFFER_ID IS NULL OR DLA_OFFER_ID < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaOfferId",
						"(DLA_OFFER_ID IS NULL OR DLA_OFFER_ID > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaOfferId", "DLA_OFFER_ID IN ( ? )") // IN

				.addFilterBy("NOTINDlaOfferId", "DLA_OFFER_ID NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("DlaOfferIdasc", "DLA_OFFER_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaOfferIddesc", "DLA_OFFER_ID DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaGroupIndex", "DLA_GROUP_INDEX = ?")
		// EQUAL

				.addFilterBy("notequalDlaGroupIndex", "DLA_GROUP_INDEX != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaGroupIndex", "DLA_GROUP_INDEX IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaGroupIndex",
						"DLA_GROUP_INDEX IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaGroupIndex", "DLA_GROUP_INDEX < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaGroupIndex", "DLA_GROUP_INDEX > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaGroupIndex",
						"DLA_GROUP_INDEX <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaGroupIndex",
						"DLA_GROUP_INDEX >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaGroupIndex",
						"DLA_GROUP_INDEX BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaGroupIndex",
						"(DLA_GROUP_INDEX IS NULL OR DLA_GROUP_INDEX = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaGroupIndex",
						"(DLA_GROUP_INDEX IS NULL OR DLA_GROUP_INDEX < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaGroupIndex",
						"(DLA_GROUP_INDEX IS NULL OR DLA_GROUP_INDEX > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaGroupIndex", "DLA_GROUP_INDEX IN ( ? )") // IN

				.addFilterBy("NOTINDlaGroupIndex",
						"DLA_GROUP_INDEX NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaGroupIndexasc", "DLA_GROUP_INDEX ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaGroupIndexdesc", "DLA_GROUP_INDEX DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalDlaCreateDate", "DLA_CREATE_DATE = ?")
		// EQUAL

				.addFilterBy("notequalDlaCreateDate", "DLA_CREATE_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaCreateDate", "DLA_CREATE_DATE IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaCreateDate",
						"DLA_CREATE_DATE IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaCreateDate", "DLA_CREATE_DATE < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaCreateDate", "DLA_CREATE_DATE > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaCreateDate",
						"DLA_CREATE_DATE <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaCreateDate",
						"DLA_CREATE_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaCreateDate",
						"DLA_CREATE_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaCreateDate",
						"(DLA_CREATE_DATE IS NULL OR DLA_CREATE_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaCreateDate",
						"(DLA_CREATE_DATE IS NULL OR DLA_CREATE_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaCreateDate",
						"(DLA_CREATE_DATE IS NULL OR DLA_CREATE_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaCreateDate", "DLA_CREATE_DATE IN ( ? )") // IN

				.addFilterBy("NOTINDlaCreateDate",
						"DLA_CREATE_DATE NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaCreateDateasc", "DLA_CREATE_DATE ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaCreateDatedesc", "DLA_CREATE_DATE DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalDlaClaimPostId", "DLA_CLAIM_POST_ID = ?")
				// EQUAL

				.addFilterBy("notequalDlaClaimPostId", "DLA_CLAIM_POST_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullDlaClaimPostId", "DLA_CLAIM_POST_ID IS NULL") // IS
				// NULL

				.addFilterBy("notnullDlaClaimPostId",
						"DLA_CLAIM_POST_ID IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDlaClaimPostId", "DLA_CLAIM_POST_ID < ?") // LESS
				// THAN

				.addFilterBy("greaterthanDlaClaimPostId",
						"DLA_CLAIM_POST_ID > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalDlaClaimPostId",
						"DLA_CLAIM_POST_ID <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDlaClaimPostId",
						"DLA_CLAIM_POST_ID >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenDlaClaimPostId",
						"DLA_CLAIM_POST_ID BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDlaClaimPostId",
						"(DLA_CLAIM_POST_ID IS NULL OR DLA_CLAIM_POST_ID = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDlaClaimPostId",
						"(DLA_CLAIM_POST_ID IS NULL OR DLA_CLAIM_POST_ID < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDlaClaimPostId",
						"(DLA_CLAIM_POST_ID IS NULL OR DLA_CLAIM_POST_ID > ?)") // GREATERTHANORNULL

				.addFilterBy("INDlaClaimPostId", "DLA_CLAIM_POST_ID IN ( ? )") // IN

				.addFilterBy("MAXDlaClaimPostId", "MAX(DLA_CLAIM_POST_ID)") // MAX

				.addFilterBy("NOTINDlaClaimPostId",
						"DLA_CLAIM_POST_ID NOT IN ( ? )") // NOT IN

				.addOrderBy("DlaClaimPostIdasc", "DLA_CLAIM_POST_ID ASC") // ORDER
				// ASCENDING

				.addOrderBy("DlaClaimPostIddesc", "DLA_CLAIM_POST_ID DESC") // ORDER
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
			dml = new DlaDealClaimArcDMLFactory();
		}

		return dml;
	}
}
