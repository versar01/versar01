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
 * This is the DMLFactory for NmNetmat.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class NmNetmatAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new NmNetmatAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected NmNetmatAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"NmNetmat", // DML Name
				"blo.NmNetmatDMO", // dmoName
				"nm_netmat", // tableName
				10, // numColumns
				"NM_INTERNAL_TARIFF, NM_NETWORK_TARIFF, NM_CONTRACT_PERIOD, NM_NTWRK_CONTR_PER, NM_MIN_CANC_PERIOD, NM_HIGHER_MIG_TYPE, NM_LOWER_MIG_TYPE, NM_SAME_MIG_TYPE, NM_NETWORK_ID, NM_NET_TYPE ", // columnList
				"NM_INTERNAL_TARIFF", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"NM_INTERNAL_TARIFF, NM_NETWORK_TARIFF, NM_CONTRACT_PERIOD, NM_NTWRK_CONTR_PER, NM_MIN_CANC_PERIOD, NM_HIGHER_MIG_TYPE, NM_LOWER_MIG_TYPE, NM_SAME_MIG_TYPE, NM_NETWORK_ID, NM_NET_TYPE ",
				"", "", new String[] { "NM_INTERNAL_TARIFF",
						"NM_NETWORK_TARIFF", "NM_CONTRACT_PERIOD",
						"NM_NTWRK_CONTR_PER", "NM_MIN_CANC_PERIOD",
						"NM_HIGHER_MIG_TYPE", "NM_LOWER_MIG_TYPE",
						"NM_SAME_MIG_TYPE", "NM_NETWORK_ID", "NM_NET_TYPE"},
				true);
		table.addFilterBy("equalNmInternalTariff", /* PK attribute */
		"NM_INTERNAL_TARIFF = ? ")
				.addFilterBy("filterByNmInternalTariffMatch",
						"NM_INTERNAL_TARIFF LIKE ?")
				.addFilterBy("INNmInternalTariff",
						"NM_INTERNAL_TARIFF IN ( ? ) ") // IN

				.addFilterBy("NOTINNmInternalTariff",
						"NM_INTERNAL_TARIFF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmInternalTariff",
						"NM_INTERNAL_TARIFF != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmInternalTariff",
						"(NM_INTERNAL_TARIFF IS NULL OR LENGTH(NM_INTERNAL_TARIFF) IS NULL OR LENGTH(NM_INTERNAL_TARIFF) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmInternalTariff",
						"NM_INTERNAL_TARIFF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmInternalTariff",
						"NM_INTERNAL_TARIFF < ? ") // LESS THAN

				.addFilterBy("greaterthanNmInternalTariff",
						"NM_INTERNAL_TARIFF > ? ") // GREATER THAN

				.addFilterBy("filterByNmInternalTariffMatch",
						"NM_INTERNAL_TARIFF LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmInternalTariff",
						"(NM_INTERNAL_TARIFF = ? OR NM_INTERNAL_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmInternalTariff asc", "NM_INTERNAL_TARIFF ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmInternalTariff desc", "NM_INTERNAL_TARIFF DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalNmNetworkTariff", /* PK attribute */
		"NM_NETWORK_TARIFF = ? ")
				.addFilterBy("filterByNmNetworkTariffMatch",
						"NM_NETWORK_TARIFF LIKE ?")
				.addFilterBy("INNmNetworkTariff", "NM_NETWORK_TARIFF IN ( ? ) ") // IN

				.addFilterBy("NOTINNmNetworkTariff",
						"NM_NETWORK_TARIFF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmNetworkTariff",
						"NM_NETWORK_TARIFF != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmNetworkTariff",
						"(NM_NETWORK_TARIFF IS NULL OR LENGTH(NM_NETWORK_TARIFF) IS NULL OR LENGTH(NM_NETWORK_TARIFF) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmNetworkTariff",
						"NM_NETWORK_TARIFF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmNetworkTariff",
						"NM_NETWORK_TARIFF < ? ") // LESS THAN

				.addFilterBy("greaterthanNmNetworkTariff",
						"NM_NETWORK_TARIFF > ? ") // GREATER THAN

				.addFilterBy("filterByNmNetworkTariffMatch",
						"NM_NETWORK_TARIFF LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmNetworkTariff",
						"(NM_NETWORK_TARIFF = ? OR NM_NETWORK_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmNetworkTariff asc", "NM_NETWORK_TARIFF ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmNetworkTariff desc", "NM_NETWORK_TARIFF DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNmContractPeriod", /* PK attribute */
		"NM_CONTRACT_PERIOD = ? ")
				.addFilterBy("filterByNmContractPeriodMatch",
						"NM_CONTRACT_PERIOD LIKE ?")
				.addFilterBy("INNmContractPeriod",
						"NM_CONTRACT_PERIOD IN ( ? ) ") // IN

				.addFilterBy("NOTINNmContractPeriod",
						"NM_CONTRACT_PERIOD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmContractPeriod",
						"NM_CONTRACT_PERIOD != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmContractPeriod",
						"(NM_CONTRACT_PERIOD IS NULL OR LENGTH(NM_CONTRACT_PERIOD) IS NULL OR LENGTH(NM_CONTRACT_PERIOD) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmContractPeriod",
						"NM_CONTRACT_PERIOD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmContractPeriod",
						"NM_CONTRACT_PERIOD < ? ") // LESS THAN

				.addFilterBy("greaterthanNmContractPeriod",
						"NM_CONTRACT_PERIOD > ? ") // GREATER THAN

				.addFilterBy("filterByNmContractPeriodMatch",
						"NM_CONTRACT_PERIOD LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmContractPeriod",
						"(NM_CONTRACT_PERIOD = ? OR NM_CONTRACT_PERIOD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmContractPeriod asc", "NM_CONTRACT_PERIOD ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmContractPeriod desc", "NM_CONTRACT_PERIOD DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalNmNtwrkContrPer", /* PK attribute */
		"NM_NTWRK_CONTR_PER = ? ")
				.addFilterBy("filterByNmNtwrkContrPerMatch",
						"NM_NTWRK_CONTR_PER LIKE ?")
				.addFilterBy("INNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER IN ( ? ) ") // IN

				.addFilterBy("NOTINNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmNtwrkContrPer",
						"(NM_NTWRK_CONTR_PER IS NULL OR LENGTH(NM_NTWRK_CONTR_PER) IS NULL OR LENGTH(NM_NTWRK_CONTR_PER) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER < ? ") // LESS THAN

				.addFilterBy("greaterthanNmNtwrkContrPer",
						"NM_NTWRK_CONTR_PER > ? ") // GREATER THAN

				.addFilterBy("filterByNmNtwrkContrPerMatch",
						"NM_NTWRK_CONTR_PER LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmNtwrkContrPer",
						"(NM_NTWRK_CONTR_PER = ? OR NM_NTWRK_CONTR_PER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmNtwrkContrPer asc", "NM_NTWRK_CONTR_PER ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmNtwrkContrPer desc", "NM_NTWRK_CONTR_PER DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNmMinCancPeriod", /* PK attribute */
		"NM_MIN_CANC_PERIOD = ? ")
				.addFilterBy("filterByNmMinCancPeriodMatch",
						"NM_MIN_CANC_PERIOD LIKE ?")
				.addFilterBy("INNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD IN ( ? ) ") // IN

				.addFilterBy("NOTINNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmMinCancPeriod",
						"(NM_MIN_CANC_PERIOD IS NULL OR LENGTH(NM_MIN_CANC_PERIOD) IS NULL OR LENGTH(NM_MIN_CANC_PERIOD) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD < ? ") // LESS THAN

				.addFilterBy("greaterthanNmMinCancPeriod",
						"NM_MIN_CANC_PERIOD > ? ") // GREATER THAN

				.addFilterBy("filterByNmMinCancPeriodMatch",
						"NM_MIN_CANC_PERIOD LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmMinCancPeriod",
						"(NM_MIN_CANC_PERIOD = ? OR NM_MIN_CANC_PERIOD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmMinCancPeriod asc", "NM_MIN_CANC_PERIOD ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmMinCancPeriod desc", "NM_MIN_CANC_PERIOD DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNmHigherMigType", /* PK attribute */
		"NM_HIGHER_MIG_TYPE = ? ")
				.addFilterBy("filterByNmHigherMigTypeMatch",
						"NM_HIGHER_MIG_TYPE LIKE ?")
				.addFilterBy("INNmHigherMigType",
						"NM_HIGHER_MIG_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINNmHigherMigType",
						"NM_HIGHER_MIG_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmHigherMigType",
						"NM_HIGHER_MIG_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmHigherMigType",
						"(NM_HIGHER_MIG_TYPE IS NULL OR LENGTH(NM_HIGHER_MIG_TYPE) IS NULL OR LENGTH(NM_HIGHER_MIG_TYPE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmHigherMigType",
						"NM_HIGHER_MIG_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmHigherMigType",
						"NM_HIGHER_MIG_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanNmHigherMigType",
						"NM_HIGHER_MIG_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterByNmHigherMigTypeMatch",
						"NM_HIGHER_MIG_TYPE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmHigherMigType",
						"(NM_HIGHER_MIG_TYPE = ? OR NM_HIGHER_MIG_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmHigherMigType asc", "NM_HIGHER_MIG_TYPE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NmHigherMigType desc", "NM_HIGHER_MIG_TYPE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNmLowerMigType", /* PK attribute */
		"NM_LOWER_MIG_TYPE = ? ")
				.addFilterBy("filterByNmLowerMigTypeMatch",
						"NM_LOWER_MIG_TYPE LIKE ?")
				.addFilterBy("INNmLowerMigType", "NM_LOWER_MIG_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINNmLowerMigType",
						"NM_LOWER_MIG_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmLowerMigType", "NM_LOWER_MIG_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmLowerMigType",
						"(NM_LOWER_MIG_TYPE IS NULL OR LENGTH(NM_LOWER_MIG_TYPE) IS NULL OR LENGTH(NM_LOWER_MIG_TYPE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullNmLowerMigType",
						"NM_LOWER_MIG_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmLowerMigType", "NM_LOWER_MIG_TYPE < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanNmLowerMigType",
						"NM_LOWER_MIG_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterByNmLowerMigTypeMatch",
						"NM_LOWER_MIG_TYPE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNmLowerMigType",
						"(NM_LOWER_MIG_TYPE = ? OR NM_LOWER_MIG_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmLowerMigType asc", "NM_LOWER_MIG_TYPE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("NmLowerMigType desc", "NM_LOWER_MIG_TYPE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNmSameMigType", /* PK attribute */
		"NM_SAME_MIG_TYPE = ? ")
				.addFilterBy("filterByNmSameMigTypeMatch",
						"NM_SAME_MIG_TYPE LIKE ?")
				.addFilterBy("INNmSameMigType", "NM_SAME_MIG_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINNmSameMigType",
						"NM_SAME_MIG_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNmSameMigType", "NM_SAME_MIG_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmSameMigType",
						"(NM_SAME_MIG_TYPE IS NULL OR LENGTH(NM_SAME_MIG_TYPE) IS NULL OR LENGTH(NM_SAME_MIG_TYPE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullNmSameMigType",
						"NM_SAME_MIG_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmSameMigType", "NM_SAME_MIG_TYPE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanNmSameMigType",
						"NM_SAME_MIG_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterByNmSameMigTypeMatch",
						"NM_SAME_MIG_TYPE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullNmSameMigType",
						"(NM_SAME_MIG_TYPE = ? OR NM_SAME_MIG_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmSameMigType asc", "NM_SAME_MIG_TYPE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("NmSameMigType desc", "NM_SAME_MIG_TYPE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalNmNetworkId", /* PK attribute */
		"NM_NETWORK_ID = ? ")
				.addFilterBy("filterByNmNetworkIdMatch", "NM_NETWORK_ID LIKE ?")
				.addFilterBy("INNmNetworkId", "NM_NETWORK_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINNmNetworkId", "NM_NETWORK_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalNmNetworkId", "NM_NETWORK_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullNmNetworkId",
						"(NM_NETWORK_ID IS NULL OR LENGTH(NM_NETWORK_ID) IS NULL OR LENGTH(NM_NETWORK_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullNmNetworkId",
						"NM_NETWORK_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNmNetworkId", "NM_NETWORK_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanNmNetworkId", "NM_NETWORK_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByNmNetworkIdMatch",
						"NM_NETWORK_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullNmNetworkId",
						"(NM_NETWORK_ID = ? OR NM_NETWORK_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmNetworkId asc", "NM_NETWORK_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("NmNetworkId desc", "NM_NETWORK_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalNmNetType", /* PK attribute */
		"NM_NET_TYPE = ? ")
				.addFilterBy("filterByNmNetTypeMatch", "NM_NET_TYPE LIKE ?")
				.addFilterBy("INNmNetType", "NM_NET_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINNmNetType", "NM_NET_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalNmNetType", "NM_NET_TYPE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullNmNetType",
						"(NM_NET_TYPE IS NULL OR LENGTH(NM_NET_TYPE) IS NULL OR LENGTH(NM_NET_TYPE) = 0)") // IS
																											// NULL

				.addFilterBy("notnullNmNetType", "NM_NET_TYPE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanNmNetType", "NM_NET_TYPE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanNmNetType", "NM_NET_TYPE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByNmNetTypeMatch", "NM_NET_TYPE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullNmNetType",
						"(NM_NET_TYPE = ? OR NM_NET_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NmNetType asc", "NM_NET_TYPE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("NmNetType desc", "NM_NET_TYPE DESC ") // ORDER
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
			dml = new NmNetmatDMLFactory();
		}

		return dml;
	}
}
