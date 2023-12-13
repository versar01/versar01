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
 * This is the DMLFactory for CdiDatabaseInt.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class CdiDatabaseIntAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CdiDatabaseIntAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected CdiDatabaseIntAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"CdiDatabaseInt", // dmlName
				"blo.CdiDatabaseIntDMO", // dmoName
				"CDI_DATABASE_INT", // tableName
				7, // numColumns
				"CDI_BILL_AC_NO, CDI_SUBSCRIBER_ID, CDI_ACC_TYPE, CDI_STATUS, CDI_TEXT, CDI_TIMESTAMP", // columnList
				"CDI_SERIAL", // primaryKey
				"" // versionCol
				,
				true, // generatedKey
				"CDI_SERIAL, CDI_BILL_AC_NO, CDI_SUBSCRIBER_ID, CDI_ACC_TYPE, CDI_STATUS, CDI_TEXT, CDI_TIMESTAMP",
				"", "", new String[] { "CDI_SERIAL", "CDI_BILL_AC_NO",
						"CDI_SUBSCRIBER_ID", "CDI_ACC_TYPE", "CDI_STATUS",
						"CDI_TEXT", "CDI_TIMESTAMP" });

		table.addFilterBy("equalCdiSerial", /* PK attribute */
		"CDI_SERIAL = ?")
		
				.addFilterBy("INCdiSerial", "CDI_SERIAL IN ( ? )") // IN

				.addFilterBy("NOTINCdiSerial", "CDI_SERIAL NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("CdiSerialasc", "CDI_SERIAL ASC") // ORDER
																// ASCENDING

				.addOrderBy("CdiSerialdesc", "CDI_SERIAL DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalCdiBillAcNo", "(CDI_BILL_AC_NO) = ?")
				// EQUAL

				.addFilterBy("notequalCdiBillAcNo", "(CDI_BILL_AC_NO) != ?") // NOTEQUAL

				.addFilterBy("nullCdiBillAcNo",
						"(CDI_BILL_AC_NO IS NULL OR LENGTH((CDI_BILL_AC_NO)) = 0)") // IS
																						// NULL

				.addFilterBy("notnullCdiBillAcNo", "CDI_BILL_AC_NO IS NOT NULL") // IS
																					// NOT
																					// NULL

				.addFilterBy("filterByCdiBillAcNoMatch",
						"CDI_BILL_AC_NO LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullCdiBillAcNo",
						"((CDI_BILL_AC_NO) = ? OR CDI_BILL_AC_NO IS NULL)") // EQUALORNULL

				.addFilterBy("INCdiBillAcNo", "CDI_BILL_AC_NO IN ( ? )") // IN

				.addFilterBy("NOTINCdiBillAcNo", "CDI_BILL_AC_NO NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("CdiBillAcNoasc", "CDI_BILL_AC_NO ASC") // ORDER
																	// ASCENDING

				.addOrderBy("CdiBillAcNodesc", "CDI_BILL_AC_NO DESC") // ORDER
																		// DESCENDING
		;

		table
				.addFilterBy("equalCdiSubscriberId", "CDI_SUBSCRIBER_ID = ?")
				// EQUAL

				.addFilterBy("notequalCdiSubscriberId",
						"CDI_SUBSCRIBER_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullCdiSubscriberId", "CDI_SUBSCRIBER_ID IS NULL") // IS
																					// NULL

				.addFilterBy("notnullCdiSubscriberId",
						"CDI_SUBSCRIBER_ID IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanCdiSubscriberId", "CDI_SUBSCRIBER_ID < ?") // LESS
																					// THAN

				.addFilterBy("greaterthanCdiSubscriberId",
						"CDI_SUBSCRIBER_ID > ?") // GREATER THAN

				.addFilterBy("lessthanorequalCdiSubscriberId",
						"CDI_SUBSCRIBER_ID <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalCdiSubscriberId",
						"CDI_SUBSCRIBER_ID >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenCdiSubscriberId",
						"CDI_SUBSCRIBER_ID BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullCdiSubscriberId",
						"(CDI_SUBSCRIBER_ID IS NULL OR CDI_SUBSCRIBER_ID = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullCdiSubscriberId",
						"(CDI_SUBSCRIBER_ID IS NULL OR CDI_SUBSCRIBER_ID < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullCdiSubscriberId",
						"(CDI_SUBSCRIBER_ID IS NULL OR CDI_SUBSCRIBER_ID > ?)") // GREATERTHANORNULL

				.addFilterBy("INCdiSubscriberId", "CDI_SUBSCRIBER_ID IN ( ? )") // IN

				.addFilterBy("NOTINCdiSubscriberId",
						"CDI_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addOrderBy("CdiSubscriberIdasc", "CDI_SUBSCRIBER_ID ASC") // ORDER
																			// ASCENDING

				.addOrderBy("CdiSubscriberIddesc", "CDI_SUBSCRIBER_ID DESC") // ORDER
																				// DESCENDING
		;

		table
				.addFilterBy("equalCdiAccType", "(CDI_ACC_TYPE) = ?")
				// EQUAL

				.addFilterBy("notequalCdiAccType", "(CDI_ACC_TYPE) != ?")
				// NOTEQUAL

				.addFilterBy("nullCdiAccType",
						"(CDI_ACC_TYPE IS NULL OR LENGTH((CDI_ACC_TYPE)) = 0)") // IS
																					// NULL

				.addFilterBy("notnullCdiAccType", "CDI_ACC_TYPE IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("filterByCdiAccTypeMatch", "CDI_ACC_TYPE LIKE ?") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullCdiAccType",
						"((CDI_ACC_TYPE) = ? OR CDI_ACC_TYPE IS NULL)") // EQUALORNULL

				.addFilterBy("INCdiAccType", "CDI_ACC_TYPE IN ( ? )") // IN

				.addFilterBy("NOTINCdiAccType", "CDI_ACC_TYPE NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("CdiAccTypeasc", "CDI_ACC_TYPE ASC") // ORDER
																	// ASCENDING

				.addOrderBy("CdiAccTypedesc", "CDI_ACC_TYPE DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalCdiStatus", "(CDI_STATUS) = ?") // EQUAL

				.addFilterBy("notequalCdiStatus", "(CDI_STATUS) != ?") // NOTEQUAL

				.addFilterBy("nullCdiStatus",
						"(CDI_STATUS IS NULL OR LENGTH((CDI_STATUS)) = 0)") // IS
																				// NULL

				.addFilterBy("notnullCdiStatus", "CDI_STATUS IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("filterByCdiStatusMatch", "CDI_STATUS LIKE ?") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullCdiStatus",
						"((CDI_STATUS) = ? OR CDI_STATUS IS NULL)") // EQUALORNULL

				.addFilterBy("INCdiStatus", "CDI_STATUS IN ( ? )") // IN

				.addFilterBy("NOTINCdiStatus", "CDI_STATUS NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("CdiStatusasc", "CDI_STATUS ASC") // ORDER
																// ASCENDING

				.addOrderBy("CdiStatusdesc", "CDI_STATUS DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalCdiText", "(CDI_TEXT) = ?") // EQUAL

				.addFilterBy("notequalCdiText", "(CDI_TEXT) != ?") // NOTEQUAL

				.addFilterBy("nullCdiText",
						"(CDI_TEXT IS NULL OR LENGTH((CDI_TEXT)) = 0)") // IS
																			// NULL

				.addFilterBy("notnullCdiText", "CDI_TEXT IS NOT NULL") // IS
																		// NOT
																		// NULL

				.addFilterBy("filterByCdiTextMatch", "CDI_TEXT LIKE ?") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullCdiText",
						"((CDI_TEXT) = ? OR CDI_TEXT IS NULL)") // EQUALORNULL

				.addFilterBy("INCdiText", "CDI_TEXT IN ( ? )") // IN

				.addFilterBy("NOTINCdiText", "CDI_TEXT NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("CdiTextasc", "CDI_TEXT ASC") // ORDER ASCENDING

				.addOrderBy("CdiTextdesc", "CDI_TEXT DESC") // ORDER DESCENDING
		;

		table
				.addFilterBy("equalCdiTimestamp", "CDI_TIMESTAMP = ?")
				// EQUAL

				.addFilterBy("notequalCdiTimestamp", "CDI_TIMESTAMP != ?")
				// NOTEQUAL

				.addFilterBy("nullCdiTimestamp", "CDI_TIMESTAMP IS NULL")
				// IS NULL

				.addFilterBy("notnullCdiTimestamp", "CDI_TIMESTAMP IS NOT NULL") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanCdiTimestamp", "CDI_TIMESTAMP < ?") // LESS
																			// THAN

				.addFilterBy("greaterthanCdiTimestamp", "CDI_TIMESTAMP > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalCdiTimestamp",
						"CDI_TIMESTAMP <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalCdiTimestamp",
						"CDI_TIMESTAMP >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenCdiTimestamp",
						"CDI_TIMESTAMP BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullCdiTimestamp",
						"(CDI_TIMESTAMP IS NULL OR CDI_TIMESTAMP = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullCdiTimestamp",
						"(CDI_TIMESTAMP IS NULL OR CDI_TIMESTAMP < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullCdiTimestamp",
						"(CDI_TIMESTAMP IS NULL OR CDI_TIMESTAMP > ?)") // GREATERTHANORNULL

				.addFilterBy("INCdiTimestamp", "CDI_TIMESTAMP IN ( ? )") // IN

				.addFilterBy("NOTINCdiTimestamp", "CDI_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("CdiTimestampasc", "CDI_TIMESTAMP ASC") // ORDER
																	// ASCENDING

				.addOrderBy("CdiTimestampdesc", "CDI_TIMESTAMP DESC") // ORDER
																		// DESCENDING
		;
		;
				defStaticUpdate("updateCDIStatus", //dmlName, 
						"UPDATE CDI_DATABASE_INT SET " +
						"DI_STATUS = ?," +
						"CDI_TEXT = ?," +
						"CDI_TIMESTAMP = ? " +
						"WHERE CDI_SERIAL = ? "); //isMultiRow)
				
				
				defStaticUpdate("creatCustomCdi", //dmlName, 
						"INSERT INTO CDI_DATABASE_INT (" +
						"CDI_BILL_AC_NO, " +
						"CDI_SUBSCRIBER_ID, " +
						"CDI_ACC_TYPE, " +
						"CDI_STATUS, " +
						"CDI_TEXT, " +
						"CDI_TIMESTAMP)VALUES(?, ?, ?, ?, ?, ?)"); //isMultiRow)
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
			dml = new CdiDatabaseIntAbstractDMLFactory();
		}

		return dml;
	}
}
