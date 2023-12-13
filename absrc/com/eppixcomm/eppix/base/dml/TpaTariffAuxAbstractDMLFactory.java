package com.eppixcomm.eppix.base.dml;

public class TpaTariffAuxAbstractDMLFactory extends BaseDMLFactory {

	protected TpaTariffAuxAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"TpaTariffAux", // DML Name
				"blo.TpaTariffAuxDMO", // dmoName
				"tpa_tariff_aux", // tableName
				4, // numColumns
				"TPA_TARIFF, TPA_AUDIENCE, TPA_PROMO_SUB, TPA_NORMAL_SUB", // columnList
				"TPA_TARIFF", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"TPA_TARIFF, TPA_AUDIENCE, TPA_PROMO_SUB, TPA_NORMAL_SUB", "",
				"", new String[] { "TPA_TARIFF", "TPA_AUDIENCE",
						"TPA_PROMO_SUB", "TPA_NORMAL_SUB" }, true);
		table.addFilterBy("equalTpaTariff", /* PK attribute */
		"TPA_TARIFF = ? ")
				.addFilterBy("filterByTpaTariffMatch", "TPA_TARIFF LIKE ?")
				.addFilterBy("INTpaTariff", "TPA_TARIFF IN ( ? ) ")
				// IN

				.addFilterBy("NOTINTpaTariff", "TPA_TARIFF NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalTpaTariff", "TPA_TARIFF != ?")
				// NOTEQUAL

				.addFilterBy("nullTpaTariff",
						"(TPA_TARIFF IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullTpaTariff", "TPA_TARIFF IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanTpaTariff", "TPA_TARIFF < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanTpaTariff", "TPA_TARIFF > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByTpaTariffMatch", "TPA_TARIFF LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullTpaTariff",
						"(TPA_TARIFF = ? OR TPA_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("TpaTariff asc", "TPA_TARIFF ASC ") // ORDER
																// ASCENDING

				.addOrderBy("TpaTariff desc", "TPA_TARIFF DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalTpaAudience", /* PK attribute */
		"TPA_AUDIENCE = ? ")
				.addFilterBy("filterByTpaAudienceMatch", "TPA_AUDIENCE LIKE ?")
				.addFilterBy("INTpaAudience", "TPA_AUDIENCE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINTpaAudience", "TPA_AUDIENCE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalTpaAudience", "TPA_AUDIENCE != ?")
				// NOTEQUAL

				.addFilterBy("nullTpaAudience",
						"(TPA_AUDIENCE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullTpaAudience", "TPA_AUDIENCE IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanTpaAudience", "TPA_AUDIENCE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanTpaAudience", "TPA_AUDIENCE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByTpaAudienceMatch", "TPA_AUDIENCE LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullTpaAudience",
						"(TPA_AUDIENCE = ? OR TPA_AUDIENCE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("TpaAudience asc", "TPA_AUDIENCE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("TpaAudience desc", "TPA_AUDIENCE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalTpaPromoSub", /* PK attribute */
		"TPA_PROMO_SUB = ? ")
				.addFilterBy("filterByTpaPromoSubMatch", "TPA_PROMO_SUB LIKE ?")
				.addFilterBy("INTpaPromoSub", "TPA_PROMO_SUB IN ( ? ) ") // IN

				.addFilterBy("NOTINTpaPromoSub", "TPA_PROMO_SUB NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalTpaPromoSub", "TPA_PROMO_SUB != ?") // NOTEQUAL

				.addFilterBy("nullTpaPromoSub",
						"(TPA_PROMO_SUB IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullTpaPromoSub",
						"TPA_PROMO_SUB IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanTpaPromoSub", "TPA_PROMO_SUB < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanTpaPromoSub", "TPA_PROMO_SUB > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByTpaPromoSubMatch",
						"TPA_PROMO_SUB LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullTpaPromoSub",
						"(TPA_PROMO_SUB = ? OR TPA_PROMO_SUB IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("TpaPromoSub asc", "TPA_PROMO_SUB ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("TpaPromoSub desc", "TPA_PROMO_SUB DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalTpaNormalSub", /* PK attribute */
		"TPA_NORMAL_SUB = ? ")
				.addFilterBy("filterByTpaNormalSubMatch",
						"TPA_NORMAL_SUB LIKE ?")
				.addFilterBy("INTpaNormalSub", "TPA_NORMAL_SUB IN ( ? ) ") // IN

				.addFilterBy("NOTINTpaNormalSub", "TPA_NORMAL_SUB NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalTpaNormalSub", "TPA_NORMAL_SUB != ?") // NOTEQUAL

				.addFilterBy("nullTpaNormalSub",
						"(TPA_NORMAL_SUB IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullTpaNormalSub",
						"TPA_NORMAL_SUB IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanTpaNormalSub", "TPA_NORMAL_SUB < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanTpaNormalSub", "TPA_NORMAL_SUB > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByTpaNormalSubMatch",
						"TPA_NORMAL_SUB LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullTpaNormalSub",
						"(TPA_NORMAL_SUB = ? OR TPA_NORMAL_SUB IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("TpaNormalSub asc", "TPA_NORMAL_SUB ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("TpaNormalSub desc", "TPA_NORMAL_SUB DESC ") // ORDER
																			// DESCENDING
		;

	}

}