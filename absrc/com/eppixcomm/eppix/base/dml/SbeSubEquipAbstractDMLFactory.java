package com.eppixcomm.eppix.base.dml;

public class SbeSubEquipAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new SbdSubDetsAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected SbeSubEquipAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SbeSubEquip", // DML Name
				"blo.SbeSubEquipDMO", // dmoName
				"sbe_sub_equip", // tableName
				34, // numColumns
				"SBE_SUB_EQUIP_ID, SBE_SUBSCRIBER_ID, SBE_IMEI_NO, SBE_SERIAL_NO, SBE_WAREHOUSE, SBE_PRODUCT_CODE, SBE_ANTENNA, SBE_MSISDN, SBE_IMEI_SIM_PAIR, SBE_DEAL_ID, SBE_GROUP_IDX, SBE_ACTIVE_DATE, SBE_UPGRADE_ID, SBE_MAKE, SBE_MODEL, SBE_DESCRIPTION, SBE_HANDSET_VAL, SBE_EARLYTERM_CHG, SBE_ADD_CHARGE1, SBE_ADD_CHARGE2, SBE_DEVICE_PRIORITY, SBE_CAPTURE_DATE, SBE_DATE_1, SBE_DATE_2, SBE_DATE_3, SBE_INT_1, SBE_INT_2, SBE_INT_3, SBE_FLOAT_1, SBE_FLOAT_2, SBE_FLOAT_3, SBE_CHAR_1, SBE_CHAR_2, SBE_CHAR_3", // columnList
				"SBE_SUB_EQUIP_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SBE_SUB_EQUIP_ID, SBE_SUBSCRIBER_ID, SBE_IMEI_NO, SBE_SERIAL_NO, SBE_WAREHOUSE, SBE_PRODUCT_CODE, SBE_ANTENNA, SBE_MSISDN, SBE_IMEI_SIM_PAIR, SBE_DEAL_ID, SBE_GROUP_IDX, SBE_ACTIVE_DATE, SBE_UPGRADE_ID, SBE_MAKE, SBE_MODEL, SBE_DESCRIPTION, SBE_HANDSET_VAL, SBE_EARLYTERM_CHG, SBE_ADD_CHARGE1, SBE_ADD_CHARGE2, SBE_DEVICE_PRIORITY, SBE_CAPTURE_DATE, SBE_DATE_1, SBE_DATE_2, SBE_DATE_3, SBE_INT_1, SBE_INT_2, SBE_INT_3, SBE_FLOAT_1, SBE_FLOAT_2, SBE_FLOAT_3, SBE_CHAR_1, SBE_CHAR_2, SBE_CHAR_3",
				"", "", new String[] { "SBE_SUB_EQUIP_ID", "SBE_SUBSCRIBER_ID",
						"SBE_IMEI_NO", "SBE_SERIAL_NO", "SBE_WAREHOUSE",
						"SBE_PRODUCT_CODE", "SBE_ANTENNA", "SBE_MSISDN",
						"SBE_IMEI_SIM_PAIR", "SBE_DEAL_ID", "SBE_GROUP_IDX",
						"SBE_ACTIVE_DATE", "SBE_UPGRADE_ID", "SBE_MAKE",
						"SBE_MODEL", "SBE_DESCRIPTION", "SBE_HANDSET_VAL",
						"SBE_EARLYTERM_CHG", "SBE_ADD_CHARGE1",
						"SBE_ADD_CHARGE2", "SBE_DEVICE_PRIORITY",
						"SBE_CAPTURE_DATE", "SBE_DATE_1", "SBE_DATE_2",
						"SBE_DATE_3", "SBE_INT_1", "SBE_INT_2", "SBE_INT_3",
						"SBE_FLOAT_1", "SBE_FLOAT_2", "SBE_FLOAT_3",
						"SBE_CHAR_1", "SBE_CHAR_2", "SBE_CHAR_3"}, true);
		table.addFilterBy("equalSbeSubEquipId", /* PK attribute */
		"SBE_SUB_EQUIP_ID = ? ")
				.addFilterBy("filterBySbeSubEquipIdMatch",
						"SBE_SUB_EQUIP_ID LIKE ?")
				.addFilterBy("INSbeSubEquipId", "SBE_SUB_EQUIP_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeSubEquipId",
						"SBE_SUB_EQUIP_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeSubEquipId", "SBE_SUB_EQUIP_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeSubEquipId",
						"(SBE_SUB_EQUIP_ID IS NULL OR LENGTH(SBE_SUB_EQUIP_ID) IS NULL OR LENGTH(SBE_SUB_EQUIP_ID) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSbeSubEquipId",
						"SBE_SUB_EQUIP_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeSubEquipId", "SBE_SUB_EQUIP_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeSubEquipId",
						"SBE_SUB_EQUIP_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySbeSubEquipIdMatch",
						"SBE_SUB_EQUIP_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeSubEquipId",
						"(SBE_SUB_EQUIP_ID = ? OR SBE_SUB_EQUIP_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeSubEquipId asc", "SBE_SUB_EQUIP_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeSubEquipId desc", "SBE_SUB_EQUIP_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeSubscriberId", /* PK attribute */
		"SBE_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySbeSubscriberIdMatch",
						"SBE_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSbeSubscriberId", "SBE_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeSubscriberId",
						"SBE_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeSubscriberId",
						"SBE_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeSubscriberId",
						"(SBE_SUBSCRIBER_ID IS NULL OR LENGTH(SBE_SUBSCRIBER_ID) IS NULL OR LENGTH(SBE_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbeSubscriberId",
						"SBE_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeSubscriberId",
						"SBE_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeSubscriberId",
						"SBE_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySbeSubscriberIdMatch",
						"SBE_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbeSubscriberId",
						"(SBE_SUBSCRIBER_ID = ? OR SBE_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeSubscriberId asc", "SBE_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbeSubscriberId desc", "SBE_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbeImeiNo", /* PK attribute */
		"SBE_IMEI_NO = ? ")
				.addFilterBy("filterBySbeImeiNoMatch", "SBE_IMEI_NO LIKE ?")
				.addFilterBy("INSbeImeiNo", "SBE_IMEI_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeImeiNo", "SBE_IMEI_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeImeiNo", "SBE_IMEI_NO != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeImeiNo",
						"(SBE_IMEI_NO IS NULL OR LENGTH(SBE_IMEI_NO) IS NULL OR LENGTH(SBE_IMEI_NO) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeImeiNo", "SBE_IMEI_NO IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeImeiNo", "SBE_IMEI_NO < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeImeiNo", "SBE_IMEI_NO > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeImeiNoMatch", "SBE_IMEI_NO LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeImeiNo",
						"(SBE_IMEI_NO = ? OR SBE_IMEI_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeImeiNo asc", "SBE_IMEI_NO ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeImeiNo desc", "SBE_IMEI_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeSerialNo", /* PK attribute */
		"SBE_SERIAL_NO = ? ")
				.addFilterBy("filterBySbeSerialNoMatch", "SBE_SERIAL_NO LIKE ?")
				.addFilterBy("INSbeSerialNo", "SBE_SERIAL_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeSerialNo", "SBE_SERIAL_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSbeSerialNo", "SBE_SERIAL_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeSerialNo",
						"(SBE_SERIAL_NO IS NULL OR LENGTH(SBE_SERIAL_NO) IS NULL OR LENGTH(SBE_SERIAL_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbeSerialNo",
						"SBE_SERIAL_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeSerialNo", "SBE_SERIAL_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbeSerialNo", "SBE_SERIAL_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbeSerialNoMatch",
						"SBE_SERIAL_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbeSerialNo",
						"(SBE_SERIAL_NO = ? OR SBE_SERIAL_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeSerialNoasc", "SBE_SERIAL_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbeSerialNodesc", "SBE_SERIAL_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbeWarehouse", /* PK attribute */
		"SBE_WAREHOUSE = ? ")
				.addFilterBy("filterBySbeWarehouseMatch",
						"SBE_WAREHOUSE LIKE ?")
				.addFilterBy("INSbeWarehouse", "SBE_WAREHOUSE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeWarehouse", "SBE_WAREHOUSE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSbeWarehouse", "SBE_WAREHOUSE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeWarehouse",
						"(SBE_WAREHOUSE IS NULL OR LENGTH(SBE_WAREHOUSE) IS NULL OR LENGTH(SBE_WAREHOUSE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbeWarehouse",
						"SBE_WAREHOUSE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeWarehouse", "SBE_WAREHOUSE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbeWarehouse", "SBE_WAREHOUSE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbeWarehouseMatch",
						"SBE_WAREHOUSE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbeWarehouse",
						"(SBE_WAREHOUSE = ? OR SBE_WAREHOUSE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeWarehouse asc", "SBE_WAREHOUSE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbeWarehouse desc", "SBE_WAREHOUSE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbeProductCode", /* PK attribute */
		"SBE_PRODUCT_CODE = ? ")
				.addFilterBy("filterBySbeProductCodeMatch",
						"SBE_PRODUCT_CODE LIKE ?")
				.addFilterBy("INSbeProductCode", "SBE_PRODUCT_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeProductCode",
						"SBE_PRODUCT_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeProductCode", "SBE_PRODUCT_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeProductCode",
						"(SBE_PRODUCT_CODE IS NULL OR LENGTH(SBE_PRODUCT_CODE) IS NULL OR LENGTH(SBE_PRODUCT_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSbeProductCode",
						"SBE_PRODUCT_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeProductCode", "SBE_PRODUCT_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeProductCode",
						"SBE_PRODUCT_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySbeProductCodeMatch",
						"SBE_PRODUCT_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeProductCode",
						"(SBE_PRODUCT_CODE = ? OR SBE_PRODUCT_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeProductCode asc", "SBE_PRODUCT_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeProductCode desc", "SBE_PRODUCT_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbeAntenna", /* PK attribute */
		"SBE_ANTENNA = ? ")
				.addFilterBy("filterBySbeAntennaMatch", "SBE_ANTENNA LIKE ?")
				.addFilterBy("INSbeAntenna", "SBE_ANTENNA IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeAntenna", "SBE_ANTENNA NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeAntenna", "SBE_ANTENNA != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeAntenna",
						"(SBE_ANTENNA IS NULL OR LENGTH(SBE_ANTENNA) IS NULL OR LENGTH(SBE_ANTENNA) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeAntenna", "SBE_ANTENNA IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeAntenna", "SBE_ANTENNA < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeAntenna", "SBE_ANTENNA > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeAntennaMatch", "SBE_ANTENNA LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeAntenna",
						"(SBE_ANTENNA = ? OR SBE_ANTENNA IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeAntenna asc", "SBE_ANTENNA ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeAntenna desc", "SBE_ANTENNA DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeMsisdn", /* PK attribute */
		"SBE_MSISDN = ? ")
				.addFilterBy("filterBySbeMsisdnMatch", "SBE_MSISDN LIKE ?")
				.addFilterBy("INSbeMsisdn", "SBE_MSISDN IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeMsisdn", "SBE_MSISDN NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeMsisdn", "SBE_MSISDN != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeMsisdn",
						"(SBE_MSISDN IS NULL OR LENGTH(SBE_MSISDN) IS NULL OR LENGTH(SBE_MSISDN) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeMsisdn", "SBE_MSISDN IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeMsisdn", "SBE_MSISDN < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeMsisdn", "SBE_MSISDN > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeMsisdnMatch", "SBE_MSISDN LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeMsisdn",
						"(SBE_MSISDN = ? OR SBE_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeMsisdn asc", "SBE_MSISDN ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeMsisdn desc", "SBE_MSISDN DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeImeiSimPair", /* PK attribute */
		"SBE_IMEI_SIM_PAIR = ? ")
				.addFilterBy("filterBySbeImeiSimPairMatch",
						"SBE_IMEI_SIM_PAIR LIKE ?")
				.addFilterBy("INSbeImeiSimPair", "SBE_IMEI_SIM_PAIR IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeImeiSimPair",
						"SBE_IMEI_SIM_PAIR NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeImeiSimPair", "SBE_IMEI_SIM_PAIR != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeImeiSimPair",
						"(SBE_IMEI_SIM_PAIR IS NULL OR LENGTH(SBE_IMEI_SIM_PAIR) IS NULL OR LENGTH(SBE_IMEI_SIM_PAIR) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbeImeiSimPair",
						"SBE_IMEI_SIM_PAIR IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeImeiSimPair", "SBE_IMEI_SIM_PAIR < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanSbeImeiSimPair",
						"SBE_IMEI_SIM_PAIR > ? ") // GREATER THAN

				.addFilterBy("filterBySbeImeiSimPairMatch",
						"SBE_IMEI_SIM_PAIR LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbeImeiSimPair",
						"(SBE_IMEI_SIM_PAIR = ? OR SBE_IMEI_SIM_PAIR IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeImeiSimPair asc", "SBE_IMEI_SIM_PAIR ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeImeiSimPair desc", "SBE_IMEI_SIM_PAIR DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbeDealId", /* PK attribute */
		"SBE_DEAL_ID = ? ")
				.addFilterBy("filterBySbeDealIdMatch", "SBE_DEAL_ID LIKE ?")
				.addFilterBy("INSbeDealId", "SBE_DEAL_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeDealId", "SBE_DEAL_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeDealId", "SBE_DEAL_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeDealId",
						"(SBE_DEAL_ID IS NULL OR LENGTH(SBE_DEAL_ID) IS NULL OR LENGTH(SBE_DEAL_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeDealId", "SBE_DEAL_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeDealId", "SBE_DEAL_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeDealId", "SBE_DEAL_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeDealIdMatch", "SBE_DEAL_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeDealId",
						"(SBE_DEAL_ID = ? OR SBE_DEAL_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDealId asc", "SBE_DEAL_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeDealId desc", "SBE_DEAL_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeGroupIdx", /* PK attribute */
		"SBE_GROUP_IDX = ? ")
				.addFilterBy("filterBySbeGroupIdxMatch", "SBE_GROUP_IDX LIKE ?")
				.addFilterBy("INSbeGroupIdx", "SBE_GROUP_IDX IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeGroupIdx", "SBE_GROUP_IDX NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSbeGroupIdx", "SBE_GROUP_IDX != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeGroupIdx",
						"(SBE_GROUP_IDX IS NULL OR LENGTH(SBE_GROUP_IDX) IS NULL OR LENGTH(SBE_GROUP_IDX) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbeGroupIdx",
						"SBE_GROUP_IDX IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeGroupIdx", "SBE_GROUP_IDX < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbeGroupIdx", "SBE_GROUP_IDX > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbeGroupIdxMatch",
						"SBE_GROUP_IDX LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbeGroupIdx",
						"(SBE_GROUP_IDX = ? OR SBE_GROUP_IDX IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeGroupIdx asc", "SBE_GROUP_IDX ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbeGroupIdx desc", "SBE_GROUP_IDX DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSbeActiveDate", /* PK attribute */
		"SBE_ACTIVE_DATE = ? ")
				.addFilterBy("filterBySbeActiveDateMatch",
						"SBE_ACTIVE_DATE LIKE ?")
				.addFilterBy("INSbeActiveDate", "SBE_ACTIVE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeActiveDate",
						"SBE_ACTIVE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeActiveDate", "SBE_ACTIVE_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeActiveDate",
						"(SBE_ACTIVE_DATE IS NULL OR LENGTH(SBE_ACTIVE_DATE) IS NULL OR LENGTH(SBE_ACTIVE_DATE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbeActiveDate",
						"SBE_ACTIVE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeActiveDate", "SBE_ACTIVE_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeActiveDate", "SBE_ACTIVE_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySbeActiveDateMatch",
						"SBE_ACTIVE_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeActiveDate",
						"(SBE_ACTIVE_DATE = ? OR SBE_ACTIVE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeActiveDate asc", "SBE_ACTIVE_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeActiveDate desc", "SBE_ACTIVE_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeUpgradeId", /* PK attribute */
		"SBE_UPGRADE_ID = ? ")
				.addFilterBy("filterBySbeUpgradeIdMatch",
						"SBE_UPGRADE_ID LIKE ?")
				.addFilterBy("INSbeUpgradeId", "SBE_UPGRADE_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeUpgradeId", "SBE_UPGRADE_ID NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSbeUpgradeId", "SBE_UPGRADE_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeUpgradeId",
						"(SBE_UPGRADE_ID IS NULL OR LENGTH(SBE_UPGRADE_ID) IS NULL OR LENGTH(SBE_UPGRADE_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSbeUpgradeId",
						"SBE_UPGRADE_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeUpgradeId", "SBE_UPGRADE_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSbeUpgradeId", "SBE_UPGRADE_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySbeUpgradeIdMatch",
						"SBE_UPGRADE_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSbeUpgradeId",
						"(SBE_UPGRADE_ID = ? OR SBE_UPGRADE_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeUpgradeId asc", "SBE_UPGRADE_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SbeUpgradeId desc", "SBE_UPGRADE_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeMake", /* PK attribute */
		"SBE_MAKE = ? ")
				.addFilterBy("filterBySbeMakeMatch", "SBE_MAKE LIKE ?")
				.addFilterBy("INSbeMake", "SBE_MAKE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeMake", "SBE_MAKE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeMake", "SBE_MAKE != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeMake",
						"(SBE_MAKE IS NULL OR LENGTH(SBE_MAKE) IS NULL OR LENGTH(SBE_MAKE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullSbeMake", "SBE_MAKE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeMake", "SBE_MAKE < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeMake", "SBE_MAKE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterBySbeMakeMatch", "SBE_MAKE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeMake",
						"(SBE_MAKE = ? OR SBE_MAKE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("SbeMake asc", "SBE_MAKE ASC ") // ORDER ASCENDING

				.addOrderBy("SbeMake desc", "SBE_MAKE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbeModel", /* PK attribute */
		"SBE_MODEL = ? ")
				.addFilterBy("filterBySbeModelMatch", "SBE_MODEL LIKE ?")
				.addFilterBy("INSbeModel", "SBE_MODEL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeModel", "SBE_MODEL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeModel", "SBE_MODEL != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeModel",
						"(SBE_MODEL IS NULL OR LENGTH(SBE_MODEL) IS NULL OR LENGTH(SBE_MODEL) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeModel", "SBE_MODEL IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeModel", "SBE_MODEL < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeModel", "SBE_MODEL > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeModelMatch", "SBE_MODEL LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeModel",
						"(SBE_MODEL = ? OR SBE_MODEL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeModel asc", "SBE_MODEL ASC ") // ORDER ASCENDING

				.addOrderBy("SbeModel desc", "SBE_MODEL DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbeDescription", /* PK attribute */
		"SBE_DESCRIPTION = ? ")
				.addFilterBy("filterBySbeDescriptionMatch",
						"SBE_DESCRIPTION LIKE ?")
				.addFilterBy("INSbeDescription", "SBE_DESCRIPTION IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeDescription",
						"SBE_DESCRIPTION NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeDescription", "SBE_DESCRIPTION != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeDescription",
						"(SBE_DESCRIPTION IS NULL OR LENGTH(SBE_DESCRIPTION) IS NULL OR LENGTH(SBE_DESCRIPTION) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbeDescription",
						"SBE_DESCRIPTION IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeDescription", "SBE_DESCRIPTION < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeDescription",
						"SBE_DESCRIPTION > ? ") // GREATER THAN

				.addFilterBy("filterBySbeDescriptionMatch",
						"SBE_DESCRIPTION LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeDescription",
						"(SBE_DESCRIPTION = ? OR SBE_DESCRIPTION IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDescription asc", "SBE_DESCRIPTION ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeDescription desc", "SBE_DESCRIPTION DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeHandsetVal", /* PK attribute */
		"SBE_HANDSET_VAL = ? ")
				.addFilterBy("filterBySbeHandsetValMatch",
						"SBE_HANDSET_VAL LIKE ?")
				.addFilterBy("INSbeHandsetVal", "SBE_HANDSET_VAL IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeHandsetVal",
						"SBE_HANDSET_VAL NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeHandsetVal", "SBE_HANDSET_VAL != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeHandsetVal",
						"(SBE_HANDSET_VAL IS NULL OR LENGTH(SBE_HANDSET_VAL) IS NULL OR LENGTH(SBE_HANDSET_VAL) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbeHandsetVal",
						"SBE_HANDSET_VAL IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeHandsetVal", "SBE_HANDSET_VAL < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeHandsetVal", "SBE_HANDSET_VAL > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySbeHandsetValMatch",
						"SBE_HANDSET_VAL LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeHandsetVal",
						"(SBE_HANDSET_VAL = ? OR SBE_HANDSET_VAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeHandsetVal asc", "SBE_HANDSET_VAL ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeHandsetVal desc", "SBE_HANDSET_VAL DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeEarlytermChg", /* PK attribute */
		"SBE_EARLYTERM_CHG = ? ")
				.addFilterBy("filterBySbeEarlytermChgMatch",
						"SBE_EARLYTERM_CHG LIKE ?")
				.addFilterBy("INSbeEarlytermChg", "SBE_EARLYTERM_CHG IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeEarlytermChg",
						"SBE_EARLYTERM_CHG NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeEarlytermChg",
						"SBE_EARLYTERM_CHG != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeEarlytermChg",
						"(SBE_EARLYTERM_CHG IS NULL OR LENGTH(SBE_EARLYTERM_CHG) IS NULL OR LENGTH(SBE_EARLYTERM_CHG) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSbeEarlytermChg",
						"SBE_EARLYTERM_CHG IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeEarlytermChg",
						"SBE_EARLYTERM_CHG < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeEarlytermChg",
						"SBE_EARLYTERM_CHG > ? ") // GREATER THAN

				.addFilterBy("filterBySbeEarlytermChgMatch",
						"SBE_EARLYTERM_CHG LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbeEarlytermChg",
						"(SBE_EARLYTERM_CHG = ? OR SBE_EARLYTERM_CHG IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeEarlytermChg asc", "SBE_EARLYTERM_CHG ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SbeEarlytermChg desc", "SBE_EARLYTERM_CHG DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbeAddCharge1", /* PK attribute */
		"SBE_ADD_CHARGE1 = ? ")
				.addFilterBy("filterBySbeAddCharge1Match",
						"SBE_ADD_CHARGE1 LIKE ?")
				.addFilterBy("INSbeAddCharge1", "SBE_ADD_CHARGE1 IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeAddCharge1",
						"SBE_ADD_CHARGE1 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeAddCharge1", "SBE_ADD_CHARGE1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeAddCharge1",
						"(SBE_ADD_CHARGE1 IS NULL OR LENGTH(SBE_ADD_CHARGE1) IS NULL OR LENGTH(SBE_ADD_CHARGE1) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbeAddCharge1",
						"SBE_ADD_CHARGE1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeAddCharge1", "SBE_ADD_CHARGE1 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeAddCharge1", "SBE_ADD_CHARGE1 > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySbeAddCharge1Match",
						"SBE_ADD_CHARGE1 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeAddCharge1",
						"(SBE_ADD_CHARGE1 = ? OR SBE_ADD_CHARGE1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeAddCharge1 asc", "SBE_ADD_CHARGE1 ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeAddCharge1 desc", "SBE_ADD_CHARGE1 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeAddCharge2", /* PK attribute */
		"SBE_ADD_CHARGE2 = ? ")
				.addFilterBy("filterBySbeAddCharge2Match",
						"SBE_ADD_CHARGE2 LIKE ?")
				.addFilterBy("INSbeAddCharge2", "SBE_ADD_CHARGE2 IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeAddCharge2",
						"SBE_ADD_CHARGE2 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeAddCharge2", "SBE_ADD_CHARGE2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeAddCharge2",
						"(SBE_ADD_CHARGE2 IS NULL OR LENGTH(SBE_ADD_CHARGE2) IS NULL OR LENGTH(SBE_ADD_CHARGE2) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSbeAddCharge2",
						"SBE_ADD_CHARGE2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeAddCharge2", "SBE_ADD_CHARGE2 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeAddCharge2", "SBE_ADD_CHARGE2 > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySbeAddCharge2Match",
						"SBE_ADD_CHARGE2 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeAddCharge2",
						"(SBE_ADD_CHARGE2 = ? OR SBE_ADD_CHARGE2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeAddCharge2 asc", "SBE_ADD_CHARGE2 ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeAddCharge2 desc", "SBE_ADD_CHARGE2 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSbeDevicePriority", /* PK attribute */
		"SBE_DEVICE_PRIORITY = ? ")
				.addFilterBy("filterBySbeDevicePriorityMatch",
						"SBE_DEVICE_PRIORITY LIKE ?")
				.addFilterBy("INSbeDevicePriority",
						"SBE_DEVICE_PRIORITY IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeDevicePriority",
						"SBE_DEVICE_PRIORITY NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeDevicePriority",
						"SBE_DEVICE_PRIORITY != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeDevicePriority",
						"(SBE_DEVICE_PRIORITY IS NULL OR LENGTH(SBE_DEVICE_PRIORITY) IS NULL OR LENGTH(SBE_DEVICE_PRIORITY) = 0)") // IS
																																	// NULL

				.addFilterBy("notnullSbeDevicePriority",
						"SBE_DEVICE_PRIORITY IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeDevicePriority",
						"SBE_DEVICE_PRIORITY < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeDevicePriority",
						"SBE_DEVICE_PRIORITY > ? ") // GREATER THAN

				.addFilterBy("filterBySbeDevicePriorityMatch",
						"SBE_DEVICE_PRIORITY LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSbeDevicePriority",
						"(SBE_DEVICE_PRIORITY = ? OR SBE_DEVICE_PRIORITY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDevicePriority asc", "SBE_DEVICE_PRIORITY ASC ") // ORDER
																					// ASCENDING

				.addOrderBy("SbeDevicePriority desc",
						"SBE_DEVICE_PRIORITY DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalSbeCaptureDate", /* PK attribute */
		"SBE_CAPTURE_DATE = ? ")
				.addFilterBy("filterBySbeCaptureDateMatch",
						"SBE_CAPTURE_DATE LIKE ?")
				.addFilterBy("INSbeCaptureDate", "SBE_CAPTURE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSbeCaptureDate",
						"SBE_CAPTURE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSbeCaptureDate", "SBE_CAPTURE_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSbeCaptureDate",
						"(SBE_CAPTURE_DATE IS NULL OR LENGTH(SBE_CAPTURE_DATE) IS NULL OR LENGTH(SBE_CAPTURE_DATE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSbeCaptureDate",
						"SBE_CAPTURE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSbeCaptureDate", "SBE_CAPTURE_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSbeCaptureDate",
						"SBE_CAPTURE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterBySbeCaptureDateMatch",
						"SBE_CAPTURE_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSbeCaptureDate",
						"(SBE_CAPTURE_DATE = ? OR SBE_CAPTURE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeCaptureDate asc", "SBE_CAPTURE_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SbeCaptureDate desc", "SBE_CAPTURE_DATE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSbeDate1", /* PK attribute */
		"SBE_DATE_1 = ? ")
				.addFilterBy("filterBySbeDate1Match", "SBE_DATE_1 LIKE ?")
				.addFilterBy("INSbeDate1", "SBE_DATE_1 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeDate1", "SBE_DATE_1 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeDate1", "SBE_DATE_1 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeDate1",
						"(SBE_DATE_1 IS NULL OR LENGTH(SBE_DATE_1) IS NULL OR LENGTH(SBE_DATE_1) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeDate1", "SBE_DATE_1 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeDate1", "SBE_DATE_1 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeDate1", "SBE_DATE_1 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeDate1Match", "SBE_DATE_1 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeDate1",
						"(SBE_DATE_1 = ? OR SBE_DATE_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDate1 asc", "SBE_DATE_1 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeDate1 desc", "SBE_DATE_1 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeDate2", /* PK attribute */
		"SBE_DATE_2 = ? ")
				.addFilterBy("filterBySbeDate2Match", "SBE_DATE_2 LIKE ?")
				.addFilterBy("INSbeDate2", "SBE_DATE_2 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeDate2", "SBE_DATE_2 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeDate2", "SBE_DATE_2 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeDate2",
						"(SBE_DATE_2 IS NULL OR LENGTH(SBE_DATE_2) IS NULL OR LENGTH(SBE_DATE_2) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeDate2", "SBE_DATE_2 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeDate2", "SBE_DATE_2 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeDate2", "SBE_DATE_2 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeDate2Match", "SBE_DATE_2 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeDate2",
						"(SBE_DATE_2 = ? OR SBE_DATE_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDate2 asc", "SBE_DATE_2 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeDate2 desc", "SBE_DATE_2 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeDate3", /* PK attribute */
		"SBE_DATE_3 = ? ")
				.addFilterBy("filterBySbeDate3Match", "SBE_DATE_3 LIKE ?")
				.addFilterBy("INSbeDate3", "SBE_DATE_3 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeDate3", "SBE_DATE_3 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeDate3", "SBE_DATE_3 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeDate3",
						"(SBE_DATE_3 IS NULL OR LENGTH(SBE_DATE_3) IS NULL OR LENGTH(SBE_DATE_3) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeDate3", "SBE_DATE_3 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeDate3", "SBE_DATE_3 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeDate3", "SBE_DATE_3 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeDate3Match", "SBE_DATE_3 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeDate3",
						"(SBE_DATE_3 = ? OR SBE_DATE_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeDate3 asc", "SBE_DATE_3 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeDate3 desc", "SBE_DATE_3 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeInt1", /* PK attribute */
		"SBE_INT_1 = ? ")
				.addFilterBy("filterBySbeInt1Match", "SBE_INT_1 LIKE ?")
				.addFilterBy("INSbeInt1", "SBE_INT_1 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeInt1", "SBE_INT_1 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeInt1", "SBE_INT_1 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeInt1",
						"(SBE_INT_1 IS NULL OR LENGTH(SBE_INT_1) IS NULL OR LENGTH(SBE_INT_1) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeInt1", "SBE_INT_1 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeInt1", "SBE_INT_1 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeInt1", "SBE_INT_1 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeInt1Match", "SBE_INT_1 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeInt1",
						"(SBE_INT_1 = ? OR SBE_INT_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeInt1 asc", "SBE_INT_1 ASC ") // ORDER ASCENDING

				.addOrderBy("SbeInt1 desc", "SBE_INT_1 DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbeInt2", /* PK attribute */
		"SBE_INT_2 = ? ")
				.addFilterBy("filterBySbeInt2Match", "SBE_INT_2 LIKE ?")
				.addFilterBy("INSbeInt2", "SBE_INT_2 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeInt2", "SBE_INT_2 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeInt2", "SBE_INT_2 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeInt2",
						"(SBE_INT_2 IS NULL OR LENGTH(SBE_INT_2) IS NULL OR LENGTH(SBE_INT_2) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeInt2", "SBE_INT_2 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeInt2", "SBE_INT_2 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeInt2", "SBE_INT_2 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeInt2Match", "SBE_INT_2 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeInt2",
						"(SBE_INT_2 = ? OR SBE_INT_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeInt2 asc", "SBE_INT_2 ASC ") // ORDER ASCENDING

				.addOrderBy("SbeInt2 desc", "SBE_INT_2 DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbeInt3", /* PK attribute */
		"SBE_INT_3 = ? ")
				.addFilterBy("filterBySbeInt3Match", "SBE_INT_3 LIKE ?")
				.addFilterBy("INSbeInt3", "SBE_INT_3 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeInt3", "SBE_INT_3 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeInt3", "SBE_INT_3 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeInt3",
						"(SBE_INT_3 IS NULL OR LENGTH(SBE_INT_3) IS NULL OR LENGTH(SBE_INT_3) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeInt3", "SBE_INT_3 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeInt3", "SBE_INT_3 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeInt3", "SBE_INT_3 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeInt3Match", "SBE_INT_3 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeInt3",
						"(SBE_INT_3 = ? OR SBE_INT_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeInt3 asc", "SBE_INT_3 ASC ") // ORDER ASCENDING

				.addOrderBy("SbeInt3 desc", "SBE_INT_3 DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSbeFloat1", /* PK attribute */
		"SBE_FLOAT_1 = ? ")
				.addFilterBy("filterBySbeFloat1Match", "SBE_FLOAT_1 LIKE ?")
				.addFilterBy("INSbeFloat1", "SBE_FLOAT_1 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeFloat1", "SBE_FLOAT_1 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeFloat1", "SBE_FLOAT_1 != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeFloat1",
						"(SBE_FLOAT_1 IS NULL OR LENGTH(SBE_FLOAT_1) IS NULL OR LENGTH(SBE_FLOAT_1) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeFloat1", "SBE_FLOAT_1 IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeFloat1", "SBE_FLOAT_1 < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeFloat1", "SBE_FLOAT_1 > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeFloat1Match", "SBE_FLOAT_1 LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeFloat1",
						"(SBE_FLOAT_1 = ? OR SBE_FLOAT_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeFloat1 asc", "SBE_FLOAT_1 ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeFloat1 desc", "SBE_FLOAT_1 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeFloat2", /* PK attribute */
		"SBE_FLOAT_2 = ? ")
				.addFilterBy("filterBySbeFloat2Match", "SBE_FLOAT_2 LIKE ?")
				.addFilterBy("INSbeFloat2", "SBE_FLOAT_2 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeFloat2", "SBE_FLOAT_2 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeFloat2", "SBE_FLOAT_2 != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeFloat2",
						"(SBE_FLOAT_2 IS NULL OR LENGTH(SBE_FLOAT_2) IS NULL OR LENGTH(SBE_FLOAT_2) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeFloat2", "SBE_FLOAT_2 IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeFloat2", "SBE_FLOAT_2 < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeFloat2", "SBE_FLOAT_2 > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeFloat2Match", "SBE_FLOAT_2 LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeFloat2",
						"(SBE_FLOAT_2 = ? OR SBE_FLOAT_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeFloat2 asc", "SBE_FLOAT_2 ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeFloat2 desc", "SBE_FLOAT_2 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeFloat3", /* PK attribute */
		"SBE_FLOAT_3 = ? ")
				.addFilterBy("filterBySbeFloat3Match", "SBE_FLOAT_3 LIKE ?")
				.addFilterBy("INSbeFloat3", "SBE_FLOAT_3 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeFloat3", "SBE_FLOAT_3 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeFloat3", "SBE_FLOAT_3 != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSbeFloat3",
						"(SBE_FLOAT_3 IS NULL OR LENGTH(SBE_FLOAT_3) IS NULL OR LENGTH(SBE_FLOAT_3) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSbeFloat3", "SBE_FLOAT_3 IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSbeFloat3", "SBE_FLOAT_3 < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSbeFloat3", "SBE_FLOAT_3 > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySbeFloat3Match", "SBE_FLOAT_3 LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSbeFloat3",
						"(SBE_FLOAT_3 = ? OR SBE_FLOAT_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeFloat3 asc", "SBE_FLOAT_3 ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SbeFloat3 desc", "SBE_FLOAT_3 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeChar1", /* PK attribute */
		"SBE_CHAR_1 = ? ")
				.addFilterBy("filterBySbeChar1Match", "SBE_CHAR_1 LIKE ?")
				.addFilterBy("INSbeChar1", "SBE_CHAR_1 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeChar1", "SBE_CHAR_1 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeChar1", "SBE_CHAR_1 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeChar1",
						"(SBE_CHAR_1 IS NULL OR LENGTH(SBE_CHAR_1) IS NULL OR LENGTH(SBE_CHAR_1) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeChar1", "SBE_CHAR_1 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeChar1", "SBE_CHAR_1 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeChar1", "SBE_CHAR_1 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeChar1Match", "SBE_CHAR_1 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeChar1",
						"(SBE_CHAR_1 = ? OR SBE_CHAR_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeChar1 asc", "SBE_CHAR_1 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeChar1 desc", "SBE_CHAR_1 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeChar2", /* PK attribute */
		"SBE_CHAR_2 = ? ")
				.addFilterBy("filterBySbeChar2Match", "SBE_CHAR_2 LIKE ?")
				.addFilterBy("INSbeChar2", "SBE_CHAR_2 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeChar2", "SBE_CHAR_2 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeChar2", "SBE_CHAR_2 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeChar2",
						"(SBE_CHAR_2 IS NULL OR LENGTH(SBE_CHAR_2) IS NULL OR LENGTH(SBE_CHAR_2) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeChar2", "SBE_CHAR_2 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeChar2", "SBE_CHAR_2 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeChar2", "SBE_CHAR_2 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeChar2Match", "SBE_CHAR_2 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeChar2",
						"(SBE_CHAR_2 = ? OR SBE_CHAR_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeChar2 asc", "SBE_CHAR_2 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeChar2 desc", "SBE_CHAR_2 DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSbeChar3", /* PK attribute */
		"SBE_CHAR_3 = ? ")
				.addFilterBy("filterBySbeChar3Match", "SBE_CHAR_3 LIKE ?")
				.addFilterBy("INSbeChar3", "SBE_CHAR_3 IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSbeChar3", "SBE_CHAR_3 NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSbeChar3", "SBE_CHAR_3 != ?")
				// NOTEQUAL

				.addFilterBy("nullSbeChar3",
						"(SBE_CHAR_3 IS NULL OR LENGTH(SBE_CHAR_3) IS NULL OR LENGTH(SBE_CHAR_3) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSbeChar3", "SBE_CHAR_3 IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSbeChar3", "SBE_CHAR_3 < ? ") // LESS THAN

				.addFilterBy("greaterthanSbeChar3", "SBE_CHAR_3 > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySbeChar3Match", "SBE_CHAR_3 LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSbeChar3",
						"(SBE_CHAR_3 = ? OR SBE_CHAR_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SbeChar3 asc", "SBE_CHAR_3 ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SbeChar3 desc", "SBE_CHAR_3 DESC ") // ORDER
																	// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SbeSubEquipDMLFactory();
		}

		return dml;
	}

}