package com.eppixcomm.eppix.base.dml;

public class SpcParamConfigAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;

	public SpcParamConfigAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SpcParamConfig", // DML Name
				"blo.SpcParamConfigDMO", // dmoName
				"spc_param_config", // tableName
				14, // numColumns
				"SPC_PARAM_ID, SPC_PARAM_NAME, SPC_SERVICE_CODE, SPC_SERVICE_TYPE, SPC_LOCK_TO_TARIFF, SPC_LOCK_TO_PACK, SPC_VALUE_TYPE, SPC_EXCLUSION_RULE, SPC_LEGAL_ENTITY, SPC_CONTR_PERIOD, SPC_CAN_TERM, SPC_TAX_INV, SPC_PARAM_PRORATA, SPC_NODE_STRING", // columnList
				"SPC_PARAM_ID, SPC_PARAM_NAME", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SPC_PARAM_ID, SPC_PARAM_NAME, SPC_SERVICE_CODE, SPC_SERVICE_TYPE, SPC_LOCK_TO_TARIFF, SPC_LOCK_TO_PACK, SPC_VALUE_TYPE, SPC_EXCLUSION_RULE, SPC_LEGAL_ENTITY, SPC_CONTR_PERIOD, SPC_CAN_TERM, SPC_TAX_INV, SPC_PARAM_PRORATA, SPC_NODE_STRING",
				"",
				"",
				new String[] { "SPC_PARAM_ID", "SPC_PARAM_NAME",
						"SPC_SERVICE_CODE", "SPC_SERVICE_TYPE",
						"SPC_LOCK_TO_TARIFF", "SPC_LOCK_TO_PACK",
						"SPC_VALUE_TYPE", "SPC_EXCLUSION_RULE",
						"SPC_LEGAL_ENTITY", "SPC_CONTR_PERIOD", "SPC_CAN_TERM",
						"SPC_TAX_INV", "SPC_PARAM_PRORATA", "SPC_NODE_STRING"},
				true);
		
		table.addFilterBy("equalSpcParamId", /* PK attribute */
		"SPC_PARAM_ID = ? ")
				.addFilterBy("filterBySpcParamIdMatch", "SPC_PARAM_ID LIKE ?")
				.addFilterBy("INSpcParamId", "SPC_PARAM_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSpcParamId", "SPC_PARAM_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSpcParamId", "SPC_PARAM_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSpcParamId",
						"(SPC_PARAM_ID IS NULL OR LENGTH(SPC_PARAM_ID) IS NULL OR LENGTH(SPC_PARAM_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSpcParamId", "SPC_PARAM_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSpcParamId", "SPC_PARAM_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSpcParamId", "SPC_PARAM_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySpcParamIdMatch", "SPC_PARAM_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSpcParamId",
						"(SPC_PARAM_ID = ? OR SPC_PARAM_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcParamIdasc", "SPC_PARAM_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SpcParamIddesc", "SPC_PARAM_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSpcParamName", /* PK attribute */
		"SPC_PARAM_NAME = ? ")
				.addFilterBy("filterBySpcParamNameMatch",
						"SPC_PARAM_NAME LIKE ?")
				.addFilterBy("INSpcParamName", "SPC_PARAM_NAME IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcParamName", "SPC_PARAM_NAME NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSpcParamName", "SPC_PARAM_NAME != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcParamName",
						"(SPC_PARAM_NAME IS NULL OR LENGTH(SPC_PARAM_NAME) IS NULL OR LENGTH(SPC_PARAM_NAME) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSpcParamName",
						"SPC_PARAM_NAME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcParamName", "SPC_PARAM_NAME < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSpcParamName", "SPC_PARAM_NAME > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySpcParamNameMatch",
						"SPC_PARAM_NAME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSpcParamName",
						"(SPC_PARAM_NAME = ? OR SPC_PARAM_NAME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcParamNameasc", "SPC_PARAM_NAME ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SpcParamNamedesc", "SPC_PARAM_NAME DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpcServiceCode", /* PK attribute */
		"SPC_SERVICE_CODE = ? ")
				.addFilterBy("filterBySpcServiceCodeMatch",
						"SPC_SERVICE_CODE LIKE ?")
				.addFilterBy("INSpcServiceCode", "SPC_SERVICE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcServiceCode",
						"SPC_SERVICE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcServiceCode", "SPC_SERVICE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcServiceCode",
						"(SPC_SERVICE_CODE IS NULL OR LENGTH(SPC_SERVICE_CODE) IS NULL OR LENGTH(SPC_SERVICE_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSpcServiceCode",
						"SPC_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcServiceCode", "SPC_SERVICE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcServiceCode",
						"SPC_SERVICE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySpcServiceCodeMatch",
						"SPC_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcServiceCode",
						"(SPC_SERVICE_CODE = ? OR SPC_SERVICE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcServiceCodeasc", "SPC_SERVICE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcServiceCodedesc", "SPC_SERVICE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcServiceType", /* PK attribute */
		"SPC_SERVICE_TYPE = ? ")
				.addFilterBy("filterBySpcServiceTypeMatch",
						"SPC_SERVICE_TYPE LIKE ?")
				.addFilterBy("INSpcServiceType", "SPC_SERVICE_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcServiceType",
						"SPC_SERVICE_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcServiceType", "SPC_SERVICE_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcServiceType",
						"(SPC_SERVICE_TYPE IS NULL OR LENGTH(SPC_SERVICE_TYPE) IS NULL OR LENGTH(SPC_SERVICE_TYPE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSpcServiceType",
						"SPC_SERVICE_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcServiceType", "SPC_SERVICE_TYPE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcServiceType",
						"SPC_SERVICE_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterBySpcServiceTypeMatch",
						"SPC_SERVICE_TYPE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcServiceType",
						"(SPC_SERVICE_TYPE = ? OR SPC_SERVICE_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcServiceTypeasc", "SPC_SERVICE_TYPE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcServiceTypedesc", "SPC_SERVICE_TYPE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcLockToTariff", /* PK attribute */
		"SPC_LOCK_TO_TARIFF = ? ")
				.addFilterBy("filterBySpcLockToTariffMatch",
						"SPC_LOCK_TO_TARIFF LIKE ?")
				.addFilterBy("INSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcLockToTariff",
						"(SPC_LOCK_TO_TARIFF IS NULL OR LENGTH(SPC_LOCK_TO_TARIFF) IS NULL OR LENGTH(SPC_LOCK_TO_TARIFF) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF < ? ") // LESS THAN

				.addFilterBy("greaterthanSpcLockToTariff",
						"SPC_LOCK_TO_TARIFF > ? ") // GREATER THAN

				.addFilterBy("filterBySpcLockToTariffMatch",
						"SPC_LOCK_TO_TARIFF LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSpcLockToTariff",
						"(SPC_LOCK_TO_TARIFF = ? OR SPC_LOCK_TO_TARIFF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcLockToTariffasc", "SPC_LOCK_TO_TARIFF ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SpcLockToTariffdesc", "SPC_LOCK_TO_TARIFF DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcLockToPack", /* PK attribute */
		"SPC_LOCK_TO_PACK = ? ")
				.addFilterBy("filterBySpcLockToPackMatch",
						"SPC_LOCK_TO_PACK LIKE ?")
				.addFilterBy("INSpcLockToPack", "SPC_LOCK_TO_PACK IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcLockToPack",
						"SPC_LOCK_TO_PACK NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcLockToPack", "SPC_LOCK_TO_PACK != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcLockToPack",
						"(SPC_LOCK_TO_PACK IS NULL OR LENGTH(SPC_LOCK_TO_PACK) IS NULL OR LENGTH(SPC_LOCK_TO_PACK) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSpcLockToPack",
						"SPC_LOCK_TO_PACK IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcLockToPack", "SPC_LOCK_TO_PACK < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcLockToPack",
						"SPC_LOCK_TO_PACK > ? ") // GREATER THAN

				.addFilterBy("filterBySpcLockToPackMatch",
						"SPC_LOCK_TO_PACK LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcLockToPack",
						"(SPC_LOCK_TO_PACK = ? OR SPC_LOCK_TO_PACK IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcLockToPackasc", "SPC_LOCK_TO_PACK ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcLockToPackdesc", "SPC_LOCK_TO_PACK DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpcValueType", /* PK attribute */
		"SPC_VALUE_TYPE = ? ")
				.addFilterBy("filterBySpcValueTypeMatch",
						"SPC_VALUE_TYPE LIKE ?")
				.addFilterBy("INSpcValueType", "SPC_VALUE_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcValueType", "SPC_VALUE_TYPE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSpcValueType", "SPC_VALUE_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcValueType",
						"(SPC_VALUE_TYPE IS NULL OR LENGTH(SPC_VALUE_TYPE) IS NULL OR LENGTH(SPC_VALUE_TYPE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSpcValueType",
						"SPC_VALUE_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcValueType", "SPC_VALUE_TYPE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSpcValueType", "SPC_VALUE_TYPE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySpcValueTypeMatch",
						"SPC_VALUE_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSpcValueType",
						"(SPC_VALUE_TYPE = ? OR SPC_VALUE_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcValueTypeasc", "SPC_VALUE_TYPE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SpcValueTypedesc", "SPC_VALUE_TYPE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpcExclusionRule", /* PK attribute */
		"SPC_EXCLUSION_RULE = ? ")
				.addFilterBy("filterBySpcExclusionRuleMatch",
						"SPC_EXCLUSION_RULE LIKE ?")
				.addFilterBy("INSpcExclusionRule",
						"SPC_EXCLUSION_RULE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcExclusionRule",
						"SPC_EXCLUSION_RULE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcExclusionRule",
						"SPC_EXCLUSION_RULE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcExclusionRule",
						"(SPC_EXCLUSION_RULE IS NULL OR LENGTH(SPC_EXCLUSION_RULE) IS NULL OR LENGTH(SPC_EXCLUSION_RULE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSpcExclusionRule",
						"SPC_EXCLUSION_RULE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcExclusionRule",
						"SPC_EXCLUSION_RULE < ? ") // LESS THAN

				.addFilterBy("greaterthanSpcExclusionRule",
						"SPC_EXCLUSION_RULE > ? ") // GREATER THAN

				.addFilterBy("filterBySpcExclusionRuleMatch",
						"SPC_EXCLUSION_RULE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSpcExclusionRule",
						"(SPC_EXCLUSION_RULE = ? OR SPC_EXCLUSION_RULE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcExclusionRuleasc", "SPC_EXCLUSION_RULE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SpcExclusionRuledesc", "SPC_EXCLUSION_RULE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSpcLegalEntity", /* PK attribute */
		"SPC_LEGAL_ENTITY = ? ")
				.addFilterBy("filterBySpcLegalEntityMatch",
						"SPC_LEGAL_ENTITY LIKE ?")
				.addFilterBy("INSpcLegalEntity", "SPC_LEGAL_ENTITY IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcLegalEntity",
						"SPC_LEGAL_ENTITY NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcLegalEntity", "SPC_LEGAL_ENTITY != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcLegalEntity",
						"(SPC_LEGAL_ENTITY IS NULL OR LENGTH(SPC_LEGAL_ENTITY) IS NULL OR LENGTH(SPC_LEGAL_ENTITY) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSpcLegalEntity",
						"SPC_LEGAL_ENTITY IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcLegalEntity", "SPC_LEGAL_ENTITY < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcLegalEntity",
						"SPC_LEGAL_ENTITY > ? ") // GREATER THAN

				.addFilterBy("filterBySpcLegalEntityMatch",
						"SPC_LEGAL_ENTITY LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcLegalEntity",
						"(SPC_LEGAL_ENTITY = ? OR SPC_LEGAL_ENTITY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcLegalEntityasc", "SPC_LEGAL_ENTITY ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcLegalEntitydesc", "SPC_LEGAL_ENTITY DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcContrPeriod", /* PK attribute */
		"SPC_CONTR_PERIOD = ? ")
				.addFilterBy("filterBySpcContrPeriodMatch",
						"SPC_CONTR_PERIOD LIKE ?")
				.addFilterBy("INSpcContrPeriod", "SPC_CONTR_PERIOD IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcContrPeriod",
						"SPC_CONTR_PERIOD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcContrPeriod", "SPC_CONTR_PERIOD != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcContrPeriod",
						"(SPC_CONTR_PERIOD IS NULL OR LENGTH(SPC_CONTR_PERIOD) IS NULL OR LENGTH(SPC_CONTR_PERIOD) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSpcContrPeriod",
						"SPC_CONTR_PERIOD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcContrPeriod", "SPC_CONTR_PERIOD < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcContrPeriod",
						"SPC_CONTR_PERIOD > ? ") // GREATER THAN

				.addFilterBy("filterBySpcContrPeriodMatch",
						"SPC_CONTR_PERIOD LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcContrPeriod",
						"(SPC_CONTR_PERIOD = ? OR SPC_CONTR_PERIOD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcContrPeriodasc", "SPC_CONTR_PERIOD ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcContrPerioddesc", "SPC_CONTR_PERIOD DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcCanTerm", /* PK attribute */
		"SPC_CAN_TERM = ? ")
				.addFilterBy("filterBySpcCanTermMatch", "SPC_CAN_TERM LIKE ?")
				.addFilterBy("INSpcCanTerm", "SPC_CAN_TERM IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSpcCanTerm", "SPC_CAN_TERM NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSpcCanTerm", "SPC_CAN_TERM != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSpcCanTerm",
						"(SPC_CAN_TERM IS NULL OR LENGTH(SPC_CAN_TERM) IS NULL OR LENGTH(SPC_CAN_TERM) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSpcCanTerm", "SPC_CAN_TERM IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSpcCanTerm", "SPC_CAN_TERM < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSpcCanTerm", "SPC_CAN_TERM > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySpcCanTermMatch", "SPC_CAN_TERM LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSpcCanTerm",
						"(SPC_CAN_TERM = ? OR SPC_CAN_TERM IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcCanTermasc", "SPC_CAN_TERM ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SpcCanTermdesc", "SPC_CAN_TERM DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSpcTaxInv", /* PK attribute */
		"SPC_TAX_INV = ? ")
				.addFilterBy("filterBySpcTaxInvMatch", "SPC_TAX_INV LIKE ?")
				.addFilterBy("INSpcTaxInv", "SPC_TAX_INV IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSpcTaxInv", "SPC_TAX_INV NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSpcTaxInv", "SPC_TAX_INV != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSpcTaxInv",
						"(SPC_TAX_INV IS NULL OR LENGTH(SPC_TAX_INV) IS NULL OR LENGTH(SPC_TAX_INV) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSpcTaxInv", "SPC_TAX_INV IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSpcTaxInv", "SPC_TAX_INV < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSpcTaxInv", "SPC_TAX_INV > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySpcTaxInvMatch", "SPC_TAX_INV LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSpcTaxInv",
						"(SPC_TAX_INV = ? OR SPC_TAX_INV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcTaxInvasc", "SPC_TAX_INV ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SpcTaxInvdesc", "SPC_TAX_INV DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSpcParamProrata", /* PK attribute */
		"SPC_PARAM_PRORATA = ? ")
				.addFilterBy("filterBySpcParamProrataMatch",
						"SPC_PARAM_PRORATA LIKE ?")
				.addFilterBy("INSpcParamProrata", "SPC_PARAM_PRORATA IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcParamProrata",
						"SPC_PARAM_PRORATA NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcParamProrata",
						"SPC_PARAM_PRORATA != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcParamProrata",
						"(SPC_PARAM_PRORATA IS NULL OR LENGTH(SPC_PARAM_PRORATA) IS NULL OR LENGTH(SPC_PARAM_PRORATA) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSpcParamProrata",
						"SPC_PARAM_PRORATA IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcParamProrata",
						"SPC_PARAM_PRORATA < ? ") // LESS THAN

				.addFilterBy("greaterthanSpcParamProrata",
						"SPC_PARAM_PRORATA > ? ") // GREATER THAN

				.addFilterBy("filterBySpcParamProrataMatch",
						"SPC_PARAM_PRORATA LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSpcParamProrata",
						"(SPC_PARAM_PRORATA = ? OR SPC_PARAM_PRORATA IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcParamProrataasc", "SPC_PARAM_PRORATA ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SpcParamProratadesc", "SPC_PARAM_PRORATA DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpcNodeString", /* PK attribute */
		"SPC_NODE_STRING = ? ")
				.addFilterBy("filterBySpcNodeStringMatch",
						"SPC_NODE_STRING LIKE ?")
				.addFilterBy("INSpcNodeString", "SPC_NODE_STRING IN ( ? ) ") // IN

				.addFilterBy("NOTINSpcNodeString",
						"SPC_NODE_STRING NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpcNodeString", "SPC_NODE_STRING != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpcNodeString",
						"(SPC_NODE_STRING IS NULL OR LENGTH(SPC_NODE_STRING) IS NULL OR LENGTH(SPC_NODE_STRING) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSpcNodeString",
						"SPC_NODE_STRING IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpcNodeString", "SPC_NODE_STRING < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpcNodeString", "SPC_NODE_STRING > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySpcNodeStringMatch",
						"SPC_NODE_STRING LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpcNodeString",
						"(SPC_NODE_STRING = ? OR SPC_NODE_STRING IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpcNodeStringasc", "SPC_NODE_STRING ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpcNodeStringdesc", "SPC_NODE_STRING DESC ") // ORDER
																			// DESCENDING
		;
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SpcParamConfigDMLFactory();
		}

		return dml;
	}

}