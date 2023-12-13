package com.eppixcomm.eppix.base.dml;

public class NttNtwrkTrfTypeAbstractDMLFactory extends BaseDMLFactory {

	protected NttNtwrkTrfTypeAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"NttNtwrkTrfType", // DML Name
				"blo.NttNtwrkTrfTypeDMO", // dmoName
				"ntt_ntwrk_trf_type", // tableName
				6, // numColumns
				"NTT_NTWRK_TARIFF, NTT_START_DATE, NTT_END_DATE, NTT_CONTRACT_PER, NTT_ALLOW_SP_MIGR, NTT_ALLOW_MSI_SWAP", // columnList
				"NTT_NTWRK_TARIFF", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"NTT_NTWRK_TARIFF, NTT_START_DATE, NTT_END_DATE, NTT_CONTRACT_PER, NTT_ALLOW_SP_MIGR, NTT_ALLOW_MSI_SWAP",
				"", "", new String[] { "NTT_NTWRK_TARIFF", "NTT_START_DATE",
						"NTT_END_DATE", "NTT_CONTRACT_PER",
						"NTT_ALLOW_SP_MIGR", "NTT_ALLOW_MSI_SWAP" }, true);
		table.addFilterBy("equalNttNtwrkTariff", /* PK attribute */
		"NTT_NTWRK_TARIFF = ? ")
				.addFilterBy("filterByNttNtwrkTariffMatch",
						"NTT_NTWRK_TARIFF LIKE ?")
				.addFilterBy("INNttNtwrkTariff", "NTT_NTWRK_TARIFF IN ( ? ) ") // IN

				.addFilterBy("NOTINNttNtwrkTariff",
						"NTT_NTWRK_TARIFF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNttNtwrkTariff", "NTT_NTWRK_TARIFF != ?") // NOTEQUAL

				.addFilterBy("nullNttNtwrkTariff",
						"(NTT_NTWRK_TARIFF IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullNttNtwrkTariff",
						"NTT_NTWRK_TARIFF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNttNtwrkTariff", "NTT_NTWRK_TARIFF < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanNttNtwrkTariff",
						"NTT_NTWRK_TARIFF > ? ") // GREATER THAN

				.addFilterBy("filterByNttNtwrkTariffMatch",
						"NTT_NTWRK_TARIFF LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullNttNtwrkTariff",
						"(NTT_NTWRK_TARIFF = ? OR NTT_NTWRK_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttNtwrkTariff asc", "NTT_NTWRK_TARIFF ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("NttNtwrkTariff desc", "NTT_NTWRK_TARIFF DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNttStartDate", /* PK attribute */
		"NTT_START_DATE = ? ")
				.addFilterBy("filterByNttStartDateMatch",
						"NTT_START_DATE LIKE ?")
				.addFilterBy("INNttStartDate", "NTT_START_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINNttStartDate", "NTT_START_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalNttStartDate", "NTT_START_DATE != ?") // NOTEQUAL

				.addFilterBy("nullNttStartDate",
						"(NTT_START_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullNttStartDate",
						"NTT_START_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNttStartDate", "NTT_START_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanNttStartDate", "NTT_START_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByNttStartDateMatch",
						"NTT_START_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullNttStartDate",
						"(NTT_START_DATE = ? OR NTT_START_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttStartDate asc", "NTT_START_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("NttStartDate desc", "NTT_START_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalNttEndDate", /* PK attribute */
		"NTT_END_DATE = ? ")
				.addFilterBy("filterByNttEndDateMatch", "NTT_END_DATE LIKE ?")
				.addFilterBy("INNttEndDate", "NTT_END_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINNttEndDate", "NTT_END_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalNttEndDate", "NTT_END_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullNttEndDate",
						"(NTT_END_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullNttEndDate", "NTT_END_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanNttEndDate", "NTT_END_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanNttEndDate", "NTT_END_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByNttEndDateMatch", "NTT_END_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullNttEndDate",
						"(NTT_END_DATE = ? OR NTT_END_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttEndDate asc", "NTT_END_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("NttEndDate desc", "NTT_END_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalNttContractPer", /* PK attribute */
		"NTT_CONTRACT_PER = ? ")
				.addFilterBy("filterByNttContractPerMatch",
						"NTT_CONTRACT_PER LIKE ?")
				.addFilterBy("INNttContractPer", "NTT_CONTRACT_PER IN ( ? ) ") // IN

				.addFilterBy("NOTINNttContractPer",
						"NTT_CONTRACT_PER NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNttContractPer", "NTT_CONTRACT_PER != ?") // NOTEQUAL

				.addFilterBy("nullNttContractPer",
						"(NTT_CONTRACT_PER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullNttContractPer",
						"NTT_CONTRACT_PER IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNttContractPer", "NTT_CONTRACT_PER < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanNttContractPer",
						"NTT_CONTRACT_PER > ? ") // GREATER THAN

				.addFilterBy("filterByNttContractPerMatch",
						"NTT_CONTRACT_PER LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullNttContractPer",
						"(NTT_CONTRACT_PER = ? OR NTT_CONTRACT_PER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttContractPer asc", "NTT_CONTRACT_PER ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("NttContractPer desc", "NTT_CONTRACT_PER DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNttAllowSpMigr", /* PK attribute */
		"NTT_ALLOW_SP_MIGR = ? ")
				.addFilterBy("filterByNttAllowSpMigrMatch",
						"NTT_ALLOW_SP_MIGR LIKE ?")
				.addFilterBy("INNttAllowSpMigr", "NTT_ALLOW_SP_MIGR IN ( ? ) ") // IN

				.addFilterBy("NOTINNttAllowSpMigr",
						"NTT_ALLOW_SP_MIGR NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNttAllowSpMigr", "NTT_ALLOW_SP_MIGR != ?") // NOTEQUAL

				.addFilterBy("nullNttAllowSpMigr",
						"(NTT_ALLOW_SP_MIGR IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullNttAllowSpMigr",
						"NTT_ALLOW_SP_MIGR IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNttAllowSpMigr", "NTT_ALLOW_SP_MIGR < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanNttAllowSpMigr",
						"NTT_ALLOW_SP_MIGR > ? ") // GREATER THAN

				.addFilterBy("filterByNttAllowSpMigrMatch",
						"NTT_ALLOW_SP_MIGR LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNttAllowSpMigr",
						"(NTT_ALLOW_SP_MIGR = ? OR NTT_ALLOW_SP_MIGR IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttAllowSpMigr asc", "NTT_ALLOW_SP_MIGR ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("NttAllowSpMigr desc", "NTT_ALLOW_SP_MIGR DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalNttAllowMsiSwap", /* PK attribute */
		"NTT_ALLOW_MSI_SWAP = ? ")
				.addFilterBy("filterByNttAllowMsiSwapMatch",
						"NTT_ALLOW_MSI_SWAP LIKE ?")
				.addFilterBy("INNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP IN ( ? ) ") // IN

				.addFilterBy("NOTINNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP != ?") // NOTEQUAL

				.addFilterBy("nullNttAllowMsiSwap",
						"(NTT_ALLOW_MSI_SWAP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																										// NULL

				.addFilterBy("notnullNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP < ? ") // LESS THAN

				.addFilterBy("greaterthanNttAllowMsiSwap",
						"NTT_ALLOW_MSI_SWAP > ? ") // GREATER THAN

				.addFilterBy("filterByNttAllowMsiSwapMatch",
						"NTT_ALLOW_MSI_SWAP LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullNttAllowMsiSwap",
						"(NTT_ALLOW_MSI_SWAP = ? OR NTT_ALLOW_MSI_SWAP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("NttAllowMsiSwap asc", "NTT_ALLOW_MSI_SWAP ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("NttAllowMsiSwap desc", "NTT_ALLOW_MSI_SWAP DESC ") // ORDER
																				// DESCENDING
		;

	}

}