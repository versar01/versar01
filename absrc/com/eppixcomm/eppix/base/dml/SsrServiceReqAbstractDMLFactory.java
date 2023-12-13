package com.eppixcomm.eppix.base.dml;

public class SsrServiceReqAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected SsrServiceReqAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SsrServiceReq", // DML Name
				"blo.SsrServiceReqDMO", // dmoName
				"ssr_service_req", // tableName
				24, // numColumns
				"SSR_MSISDN_NO, SSR_EFFECTIVE_DATE, SSR_REFERENCE_NO, SSR_NETWRK_SERV, SSR_RECURRING, SSR_ACTION_REQ, SSR_PRORATE_CHG, SSR_SUB_CHARGE, SSR_UNITS, SSR_UNIT_OF_MEAS, SSR_LIMIT_VALUE, SSR_SYSTEM_REQ, SSR_STATUS, SSR_N2N_REQ, SSR_BILL_AC_NO, SSR_SUBSCRIBER_ID, SSR_SIM_NO, SSR_PACKAGE_CODE, SSR_TARIFF_CODE, SSR_INTERNAL_SERV, SSR_SERV_PARAM_ID, SSR_SERV_PARAM_VAL, SSR_PROCESSED_DATE, SSR_ERROR_MESS", // columnList
				"SSR_MSISDN_NO, SSR_REFERENCE_NO, SSR_ACTION_REQ", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SSR_MSISDN_NO, SSR_EFFECTIVE_DATE, SSR_REFERENCE_NO, SSR_NETWRK_SERV, SSR_RECURRING, SSR_ACTION_REQ, SSR_PRORATE_CHG, SSR_SUB_CHARGE, SSR_UNITS, SSR_UNIT_OF_MEAS, SSR_LIMIT_VALUE, SSR_SYSTEM_REQ, SSR_STATUS, SSR_N2N_REQ, SSR_BILL_AC_NO, SSR_SUBSCRIBER_ID, SSR_SIM_NO, SSR_PACKAGE_CODE, SSR_TARIFF_CODE, SSR_INTERNAL_SERV, SSR_SERV_PARAM_ID, SSR_SERV_PARAM_VAL, SSR_PROCESSED_DATE, SSR_ERROR_MESS",
				"", "", new String[] { "SSR_MSISDN_NO", "SSR_EFFECTIVE_DATE",
						"SSR_REFERENCE_NO", "SSR_NETWRK_SERV", "SSR_RECURRING",
						"SSR_ACTION_REQ", "SSR_PRORATE_CHG", "SSR_SUB_CHARGE",
						"SSR_UNITS", "SSR_UNIT_OF_MEAS", "SSR_LIMIT_VALUE",
						"SSR_SYSTEM_REQ", "SSR_STATUS", "SSR_N2N_REQ",
						"SSR_BILL_AC_NO", "SSR_SUBSCRIBER_ID", "SSR_SIM_NO",
						"SSR_PACKAGE_CODE", "SSR_TARIFF_CODE",
						"SSR_INTERNAL_SERV", "SSR_SERV_PARAM_ID",
						"SSR_SERV_PARAM_VAL", "SSR_PROCESSED_DATE",
						"SSR_ERROR_MESS", }, true);
		table.addFilterBy("equalSsrMsisdnNo", /* PK attribute */
		"SSR_MSISDN_NO = ? ")
				.addFilterBy("filterBySsrMsisdnNoMatch", "SSR_MSISDN_NO LIKE ?")
				.addFilterBy("INSsrMsisdnNo", "SSR_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrMsisdnNo", "SSR_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSsrMsisdnNo", "SSR_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrMsisdnNo",
						"(SSR_MSISDN_NO IS NULL OR LENGTH(SSR_MSISDN_NO) IS NULL OR LENGTH(SSR_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrMsisdnNo",
						"SSR_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrMsisdnNo", "SSR_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrMsisdnNo", "SSR_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrMsisdnNoMatch",
						"SSR_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrMsisdnNo",
						"(SSR_MSISDN_NO = ? OR SSR_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrMsisdnNo asc", "SSR_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrMsisdnNo desc", "SSR_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSsrEffectiveDate", /* PK attribute */
		"SSR_EFFECTIVE_DATE = ? ")
				.addFilterBy("filterBySsrEffectiveDateMatch",
						"SSR_EFFECTIVE_DATE LIKE ?")
				.addFilterBy("INSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrEffectiveDate",
						"(SSR_EFFECTIVE_DATE IS NULL OR LENGTH(SSR_EFFECTIVE_DATE) IS NULL OR LENGTH(SSR_EFFECTIVE_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrEffectiveDate",
						"SSR_EFFECTIVE_DATE > ? ") // GREATER THAN

				.addFilterBy("filterBySsrEffectiveDateMatch",
						"SSR_EFFECTIVE_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrEffectiveDate",
						"(SSR_EFFECTIVE_DATE = ? OR SSR_EFFECTIVE_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrEffectiveDate asc", "SSR_EFFECTIVE_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SsrEffectiveDate desc", "SSR_EFFECTIVE_DATE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSsrReferenceNo", /* PK attribute */
		"SSR_REFERENCE_NO = ? ")
				.addFilterBy("filterBySsrReferenceNoMatch",
						"SSR_REFERENCE_NO LIKE ?")
				.addFilterBy("INSsrReferenceNo", "SSR_REFERENCE_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrReferenceNo",
						"SSR_REFERENCE_NO NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrReferenceNo", "SSR_REFERENCE_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrReferenceNo",
						"(SSR_REFERENCE_NO IS NULL OR LENGTH(SSR_REFERENCE_NO) IS NULL OR LENGTH(SSR_REFERENCE_NO) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSsrReferenceNo",
						"SSR_REFERENCE_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrReferenceNo", "SSR_REFERENCE_NO < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrReferenceNo",
						"SSR_REFERENCE_NO > ? ") // GREATER THAN

				.addFilterBy("filterBySsrReferenceNoMatch",
						"SSR_REFERENCE_NO LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrReferenceNo",
						"(SSR_REFERENCE_NO = ? OR SSR_REFERENCE_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrReferenceNo asc", "SSR_REFERENCE_NO ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrReferenceNo desc", "SSR_REFERENCE_NO DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrNetwrkServ", /* PK attribute */
		"SSR_NETWRK_SERV = ? ")
				.addFilterBy("filterBySsrNetwrkServMatch",
						"SSR_NETWRK_SERV LIKE ?")
				.addFilterBy("INSsrNetwrkServ", "SSR_NETWRK_SERV IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrNetwrkServ",
						"SSR_NETWRK_SERV NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrNetwrkServ", "SSR_NETWRK_SERV != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrNetwrkServ",
						"(SSR_NETWRK_SERV IS NULL OR LENGTH(SSR_NETWRK_SERV) IS NULL OR LENGTH(SSR_NETWRK_SERV) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSsrNetwrkServ",
						"SSR_NETWRK_SERV IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrNetwrkServ", "SSR_NETWRK_SERV < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrNetwrkServ", "SSR_NETWRK_SERV > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySsrNetwrkServMatch",
						"SSR_NETWRK_SERV LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrNetwrkServ",
						"(SSR_NETWRK_SERV = ? OR SSR_NETWRK_SERV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrNetwrkServ asc", "SSR_NETWRK_SERV ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrNetwrkServ desc", "SSR_NETWRK_SERV DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrRecurring", /* PK attribute */
		"SSR_RECURRING = ? ")
				.addFilterBy("filterBySsrRecurringMatch",
						"SSR_RECURRING LIKE ?")
				.addFilterBy("INSsrRecurring", "SSR_RECURRING IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrRecurring", "SSR_RECURRING NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSsrRecurring", "SSR_RECURRING != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrRecurring",
						"(SSR_RECURRING IS NULL OR LENGTH(SSR_RECURRING) IS NULL OR LENGTH(SSR_RECURRING) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrRecurring",
						"SSR_RECURRING IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrRecurring", "SSR_RECURRING < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrRecurring", "SSR_RECURRING > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrRecurringMatch",
						"SSR_RECURRING LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrRecurring",
						"(SSR_RECURRING = ? OR SSR_RECURRING IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrRecurring asc", "SSR_RECURRING ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrRecurring desc", "SSR_RECURRING DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSsrActionReq", /* PK attribute */
		"SSR_ACTION_REQ = ? ")
				.addFilterBy("filterBySsrActionReqMatch",
						"SSR_ACTION_REQ LIKE ?")
				.addFilterBy("INSsrActionReq", "SSR_ACTION_REQ IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrActionReq", "SSR_ACTION_REQ NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSsrActionReq", "SSR_ACTION_REQ != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrActionReq",
						"(SSR_ACTION_REQ IS NULL OR LENGTH(SSR_ACTION_REQ) IS NULL OR LENGTH(SSR_ACTION_REQ) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrActionReq",
						"SSR_ACTION_REQ IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrActionReq", "SSR_ACTION_REQ < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrActionReq", "SSR_ACTION_REQ > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrActionReqMatch",
						"SSR_ACTION_REQ LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrActionReq",
						"(SSR_ACTION_REQ = ? OR SSR_ACTION_REQ IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrActionReq asc", "SSR_ACTION_REQ ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrActionReq desc", "SSR_ACTION_REQ DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrProrateChg", /* PK attribute */
		"SSR_PRORATE_CHG = ? ")
				.addFilterBy("filterBySsrProrateChgMatch",
						"SSR_PRORATE_CHG LIKE ?")
				.addFilterBy("INSsrProrateChg", "SSR_PRORATE_CHG IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrProrateChg",
						"SSR_PRORATE_CHG NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrProrateChg", "SSR_PRORATE_CHG != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrProrateChg",
						"(SSR_PRORATE_CHG IS NULL OR LENGTH(SSR_PRORATE_CHG) IS NULL OR LENGTH(SSR_PRORATE_CHG) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSsrProrateChg",
						"SSR_PRORATE_CHG IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrProrateChg", "SSR_PRORATE_CHG < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrProrateChg", "SSR_PRORATE_CHG > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySsrProrateChgMatch",
						"SSR_PRORATE_CHG LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrProrateChg",
						"(SSR_PRORATE_CHG = ? OR SSR_PRORATE_CHG IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrProrateChg asc", "SSR_PRORATE_CHG ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrProrateChg desc", "SSR_PRORATE_CHG DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrSubCharge", /* PK attribute */
		"SSR_SUB_CHARGE = ? ")
				.addFilterBy("filterBySsrSubChargeMatch",
						"SSR_SUB_CHARGE LIKE ?")
				.addFilterBy("INSsrSubCharge", "SSR_SUB_CHARGE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrSubCharge", "SSR_SUB_CHARGE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSsrSubCharge", "SSR_SUB_CHARGE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrSubCharge",
						"(SSR_SUB_CHARGE IS NULL OR LENGTH(SSR_SUB_CHARGE) IS NULL OR LENGTH(SSR_SUB_CHARGE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrSubCharge",
						"SSR_SUB_CHARGE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrSubCharge", "SSR_SUB_CHARGE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrSubCharge", "SSR_SUB_CHARGE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrSubChargeMatch",
						"SSR_SUB_CHARGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrSubCharge",
						"(SSR_SUB_CHARGE = ? OR SSR_SUB_CHARGE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrSubCharge asc", "SSR_SUB_CHARGE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrSubCharge desc", "SSR_SUB_CHARGE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrUnits", /* PK attribute */
		"SSR_UNITS = ? ")
				.addFilterBy("filterBySsrUnitsMatch", "SSR_UNITS LIKE ?")
				.addFilterBy("INSsrUnits", "SSR_UNITS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSsrUnits", "SSR_UNITS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSsrUnits", "SSR_UNITS != ?")
				// NOTEQUAL

				.addFilterBy("nullSsrUnits",
						"(SSR_UNITS IS NULL OR LENGTH(SSR_UNITS) IS NULL OR LENGTH(SSR_UNITS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSsrUnits", "SSR_UNITS IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSsrUnits", "SSR_UNITS < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrUnits", "SSR_UNITS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySsrUnitsMatch", "SSR_UNITS LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSsrUnits",
						"(SSR_UNITS = ? OR SSR_UNITS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrUnits asc", "SSR_UNITS ASC ") // ORDER ASCENDING

				.addOrderBy("SsrUnits desc", "SSR_UNITS DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalSsrUnitOfMeas", /* PK attribute */
		"SSR_UNIT_OF_MEAS = ? ")
				.addFilterBy("filterBySsrUnitOfMeasMatch",
						"SSR_UNIT_OF_MEAS LIKE ?")
				.addFilterBy("INSsrUnitOfMeas", "SSR_UNIT_OF_MEAS IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrUnitOfMeas",
						"SSR_UNIT_OF_MEAS NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrUnitOfMeas", "SSR_UNIT_OF_MEAS != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrUnitOfMeas",
						"(SSR_UNIT_OF_MEAS IS NULL OR LENGTH(SSR_UNIT_OF_MEAS) IS NULL OR LENGTH(SSR_UNIT_OF_MEAS) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSsrUnitOfMeas",
						"SSR_UNIT_OF_MEAS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrUnitOfMeas", "SSR_UNIT_OF_MEAS < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrUnitOfMeas",
						"SSR_UNIT_OF_MEAS > ? ") // GREATER THAN

				.addFilterBy("filterBySsrUnitOfMeasMatch",
						"SSR_UNIT_OF_MEAS LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrUnitOfMeas",
						"(SSR_UNIT_OF_MEAS = ? OR SSR_UNIT_OF_MEAS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrUnitOfMeas asc", "SSR_UNIT_OF_MEAS ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrUnitOfMeas desc", "SSR_UNIT_OF_MEAS DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrLimitValue", /* PK attribute */
		"SSR_LIMIT_VALUE = ? ")
				.addFilterBy("filterBySsrLimitValueMatch",
						"SSR_LIMIT_VALUE LIKE ?")
				.addFilterBy("INSsrLimitValue", "SSR_LIMIT_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrLimitValue",
						"SSR_LIMIT_VALUE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrLimitValue", "SSR_LIMIT_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrLimitValue",
						"(SSR_LIMIT_VALUE IS NULL OR LENGTH(SSR_LIMIT_VALUE) IS NULL OR LENGTH(SSR_LIMIT_VALUE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSsrLimitValue",
						"SSR_LIMIT_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrLimitValue", "SSR_LIMIT_VALUE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrLimitValue", "SSR_LIMIT_VALUE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySsrLimitValueMatch",
						"SSR_LIMIT_VALUE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrLimitValue",
						"(SSR_LIMIT_VALUE = ? OR SSR_LIMIT_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrLimitValue asc", "SSR_LIMIT_VALUE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrLimitValue desc", "SSR_LIMIT_VALUE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrSystemReq", /* PK attribute */
		"SSR_SYSTEM_REQ = ? ")
				.addFilterBy("filterBySsrSystemReqMatch",
						"SSR_SYSTEM_REQ LIKE ?")
				.addFilterBy("INSsrSystemReq", "SSR_SYSTEM_REQ IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrSystemReq", "SSR_SYSTEM_REQ NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSsrSystemReq", "SSR_SYSTEM_REQ != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrSystemReq",
						"(SSR_SYSTEM_REQ IS NULL OR LENGTH(SSR_SYSTEM_REQ) IS NULL OR LENGTH(SSR_SYSTEM_REQ) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrSystemReq",
						"SSR_SYSTEM_REQ IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrSystemReq", "SSR_SYSTEM_REQ < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrSystemReq", "SSR_SYSTEM_REQ > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrSystemReqMatch",
						"SSR_SYSTEM_REQ LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrSystemReq",
						"(SSR_SYSTEM_REQ = ? OR SSR_SYSTEM_REQ IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrSystemReq asc", "SSR_SYSTEM_REQ ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrSystemReq desc", "SSR_SYSTEM_REQ DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrStatus", /* PK attribute */
		"SSR_STATUS = ? ")
				.addFilterBy("filterBySsrStatusMatch", "SSR_STATUS LIKE ?")
				.addFilterBy("INSsrStatus", "SSR_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSsrStatus", "SSR_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSsrStatus", "SSR_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullSsrStatus",
						"(SSR_STATUS IS NULL OR LENGTH(SSR_STATUS) IS NULL OR LENGTH(SSR_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSsrStatus", "SSR_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSsrStatus", "SSR_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSsrStatus", "SSR_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySsrStatusMatch", "SSR_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSsrStatus",
						"(SSR_STATUS = ? OR SSR_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrStatus asc", "SSR_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SsrStatus desc", "SSR_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSsrN2nReq", /* PK attribute */
		"SSR_N2N_REQ = ? ")
				.addFilterBy("filterBySsrN2nReqMatch", "SSR_N2N_REQ LIKE ?")
				.addFilterBy("INSsrN2nReq", "SSR_N2N_REQ IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSsrN2nReq", "SSR_N2N_REQ NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSsrN2nReq", "SSR_N2N_REQ != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSsrN2nReq",
						"(SSR_N2N_REQ IS NULL OR LENGTH(SSR_N2N_REQ) IS NULL OR LENGTH(SSR_N2N_REQ) = 0)") // IS
																											// NULL

				.addFilterBy("notnullSsrN2nReq", "SSR_N2N_REQ IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSsrN2nReq", "SSR_N2N_REQ < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSsrN2nReq", "SSR_N2N_REQ > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySsrN2nReqMatch", "SSR_N2N_REQ LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSsrN2nReq",
						"(SSR_N2N_REQ = ? OR SSR_N2N_REQ IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrN2nReq asc", "SSR_N2N_REQ ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SsrN2nReq desc", "SSR_N2N_REQ DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSsrBillAcNo", /* PK attribute */
		"SSR_BILL_AC_NO = ? ")
				.addFilterBy("filterBySsrBillAcNoMatch",
						"SSR_BILL_AC_NO LIKE ?")
				.addFilterBy("INSsrBillAcNo", "SSR_BILL_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrBillAcNo", "SSR_BILL_AC_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalSsrBillAcNo", "SSR_BILL_AC_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrBillAcNo",
						"(SSR_BILL_AC_NO IS NULL OR LENGTH(SSR_BILL_AC_NO) IS NULL OR LENGTH(SSR_BILL_AC_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrBillAcNo",
						"SSR_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrBillAcNo", "SSR_BILL_AC_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrBillAcNo", "SSR_BILL_AC_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrBillAcNoMatch",
						"SSR_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrBillAcNo",
						"(SSR_BILL_AC_NO = ? OR SSR_BILL_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrBillAcNo asc", "SSR_BILL_AC_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrBillAcNo desc", "SSR_BILL_AC_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSsrSubscriberId", /* PK attribute */
		"SSR_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterBySsrSubscriberIdMatch",
						"SSR_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INSsrSubscriberId", "SSR_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrSubscriberId",
						"SSR_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrSubscriberId",
						"SSR_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrSubscriberId",
						"(SSR_SUBSCRIBER_ID IS NULL OR LENGTH(SSR_SUBSCRIBER_ID) IS NULL OR LENGTH(SSR_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrSubscriberId",
						"SSR_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrSubscriberId",
						"SSR_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrSubscriberId",
						"SSR_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySsrSubscriberIdMatch",
						"SSR_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrSubscriberId",
						"(SSR_SUBSCRIBER_ID = ? OR SSR_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrSubscriberId asc", "SSR_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SsrSubscriberId desc", "SSR_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrSimNo", /* PK attribute */
		"SSR_SIM_NO = ? ")
				.addFilterBy("filterBySsrSimNoMatch", "SSR_SIM_NO LIKE ?")
				.addFilterBy("INSsrSimNo", "SSR_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSsrSimNo", "SSR_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSsrSimNo", "SSR_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullSsrSimNo",
						"(SSR_SIM_NO IS NULL OR LENGTH(SSR_SIM_NO) IS NULL OR LENGTH(SSR_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullSsrSimNo", "SSR_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanSsrSimNo", "SSR_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrSimNo", "SSR_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterBySsrSimNoMatch", "SSR_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullSsrSimNo",
						"(SSR_SIM_NO = ? OR SSR_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrSimNo asc", "SSR_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("SsrSimNo desc", "SSR_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalSsrPackageCode", /* PK attribute */
		"SSR_PACKAGE_CODE = ? ")
				.addFilterBy("filterBySsrPackageCodeMatch",
						"SSR_PACKAGE_CODE LIKE ?")
				.addFilterBy("INSsrPackageCode", "SSR_PACKAGE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrPackageCode",
						"SSR_PACKAGE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrPackageCode", "SSR_PACKAGE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrPackageCode",
						"(SSR_PACKAGE_CODE IS NULL OR LENGTH(SSR_PACKAGE_CODE) IS NULL OR LENGTH(SSR_PACKAGE_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullSsrPackageCode",
						"SSR_PACKAGE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrPackageCode", "SSR_PACKAGE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrPackageCode",
						"SSR_PACKAGE_CODE > ? ") // GREATER THAN

				.addFilterBy("filterBySsrPackageCodeMatch",
						"SSR_PACKAGE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrPackageCode",
						"(SSR_PACKAGE_CODE = ? OR SSR_PACKAGE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrPackageCode asc", "SSR_PACKAGE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrPackageCode desc", "SSR_PACKAGE_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrTariffCode", /* PK attribute */
		"SSR_TARIFF_CODE = ? ")
				.addFilterBy("filterBySsrTariffCodeMatch",
						"SSR_TARIFF_CODE LIKE ?")
				.addFilterBy("INSsrTariffCode", "SSR_TARIFF_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrTariffCode",
						"SSR_TARIFF_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrTariffCode", "SSR_TARIFF_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrTariffCode",
						"(SSR_TARIFF_CODE IS NULL OR LENGTH(SSR_TARIFF_CODE) IS NULL OR LENGTH(SSR_TARIFF_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSsrTariffCode",
						"SSR_TARIFF_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrTariffCode", "SSR_TARIFF_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSsrTariffCode", "SSR_TARIFF_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySsrTariffCodeMatch",
						"SSR_TARIFF_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSsrTariffCode",
						"(SSR_TARIFF_CODE = ? OR SSR_TARIFF_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrTariffCode asc", "SSR_TARIFF_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrTariffCode desc", "SSR_TARIFF_CODE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSsrInternalServ", /* PK attribute */
		"SSR_INTERNAL_SERV = ? ")
				.addFilterBy("filterBySsrInternalServMatch",
						"SSR_INTERNAL_SERV LIKE ?")
				.addFilterBy("INSsrInternalServ", "SSR_INTERNAL_SERV IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrInternalServ",
						"SSR_INTERNAL_SERV NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrInternalServ",
						"SSR_INTERNAL_SERV != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrInternalServ",
						"(SSR_INTERNAL_SERV IS NULL OR LENGTH(SSR_INTERNAL_SERV) IS NULL OR LENGTH(SSR_INTERNAL_SERV) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrInternalServ",
						"SSR_INTERNAL_SERV IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrInternalServ",
						"SSR_INTERNAL_SERV < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrInternalServ",
						"SSR_INTERNAL_SERV > ? ") // GREATER THAN

				.addFilterBy("filterBySsrInternalServMatch",
						"SSR_INTERNAL_SERV LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrInternalServ",
						"(SSR_INTERNAL_SERV = ? OR SSR_INTERNAL_SERV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrInternalServ asc", "SSR_INTERNAL_SERV ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SsrInternalServ desc", "SSR_INTERNAL_SERV DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrServParamId", /* PK attribute */
		"SSR_SERV_PARAM_ID = ? ")
				.addFilterBy("filterBySsrServParamIdMatch",
						"SSR_SERV_PARAM_ID LIKE ?")
				.addFilterBy("INSsrServParamId", "SSR_SERV_PARAM_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrServParamId",
						"SSR_SERV_PARAM_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrServParamId", "SSR_SERV_PARAM_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrServParamId",
						"(SSR_SERV_PARAM_ID IS NULL OR LENGTH(SSR_SERV_PARAM_ID) IS NULL OR LENGTH(SSR_SERV_PARAM_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrServParamId",
						"SSR_SERV_PARAM_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrServParamId", "SSR_SERV_PARAM_ID < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanSsrServParamId",
						"SSR_SERV_PARAM_ID > ? ") // GREATER THAN

				.addFilterBy("filterBySsrServParamIdMatch",
						"SSR_SERV_PARAM_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrServParamId",
						"(SSR_SERV_PARAM_ID = ? OR SSR_SERV_PARAM_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrServParamId asc", "SSR_SERV_PARAM_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SsrServParamId desc", "SSR_SERV_PARAM_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrServParamVal", /* PK attribute */
		"SSR_SERV_PARAM_VAL = ? ")
				.addFilterBy("filterBySsrServParamValMatch",
						"SSR_SERV_PARAM_VAL LIKE ?")
				.addFilterBy("INSsrServParamVal",
						"SSR_SERV_PARAM_VAL IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrServParamVal",
						"SSR_SERV_PARAM_VAL NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrServParamVal",
						"SSR_SERV_PARAM_VAL != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrServParamVal",
						"(SSR_SERV_PARAM_VAL IS NULL OR LENGTH(SSR_SERV_PARAM_VAL) IS NULL OR LENGTH(SSR_SERV_PARAM_VAL) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrServParamVal",
						"SSR_SERV_PARAM_VAL IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrServParamVal",
						"SSR_SERV_PARAM_VAL < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrServParamVal",
						"SSR_SERV_PARAM_VAL > ? ") // GREATER THAN

				.addFilterBy("filterBySsrServParamValMatch",
						"SSR_SERV_PARAM_VAL LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrServParamVal",
						"(SSR_SERV_PARAM_VAL = ? OR SSR_SERV_PARAM_VAL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrServParamVal asc", "SSR_SERV_PARAM_VAL ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SsrServParamVal desc", "SSR_SERV_PARAM_VAL DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSsrProcessedDate", /* PK attribute */
		"SSR_PROCESSED_DATE = ? ")
				.addFilterBy("filterBySsrProcessedDateMatch",
						"SSR_PROCESSED_DATE LIKE ?")
				.addFilterBy("INSsrProcessedDate",
						"SSR_PROCESSED_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrProcessedDate",
						"SSR_PROCESSED_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSsrProcessedDate",
						"SSR_PROCESSED_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrProcessedDate",
						"(SSR_PROCESSED_DATE IS NULL OR LENGTH(SSR_PROCESSED_DATE) IS NULL OR LENGTH(SSR_PROCESSED_DATE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSsrProcessedDate",
						"SSR_PROCESSED_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrProcessedDate",
						"SSR_PROCESSED_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanSsrProcessedDate",
						"SSR_PROCESSED_DATE > ? ") // GREATER THAN

				.addFilterBy("filterBySsrProcessedDateMatch",
						"SSR_PROCESSED_DATE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSsrProcessedDate",
						"(SSR_PROCESSED_DATE = ? OR SSR_PROCESSED_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrProcessedDate asc", "SSR_PROCESSED_DATE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SsrProcessedDate desc", "SSR_PROCESSED_DATE DESC ") // ORDER
																					// DESCENDING
		;

		table.addFilterBy("equalSsrErrorMess", /* PK attribute */
		"SSR_ERROR_MESS = ? ")
				.addFilterBy("filterBySsrErrorMessMatch",
						"SSR_ERROR_MESS LIKE ?")
				.addFilterBy("INSsrErrorMess", "SSR_ERROR_MESS IN ( ? ) ") // IN

				.addFilterBy("NOTINSsrErrorMess", "SSR_ERROR_MESS NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSsrErrorMess", "SSR_ERROR_MESS != ?") // NOTEQUAL

				.addFilterBy(
						"nullSsrErrorMess",
						"(SSR_ERROR_MESS IS NULL OR LENGTH(SSR_ERROR_MESS) IS NULL OR LENGTH(SSR_ERROR_MESS) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSsrErrorMess",
						"SSR_ERROR_MESS IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSsrErrorMess", "SSR_ERROR_MESS < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSsrErrorMess", "SSR_ERROR_MESS > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySsrErrorMessMatch",
						"SSR_ERROR_MESS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSsrErrorMess",
						"(SSR_ERROR_MESS = ? OR SSR_ERROR_MESS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SsrErrorMess asc", "SSR_ERROR_MESS ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SsrErrorMess desc", "SSR_ERROR_MESS DESC ") // ORDER
																			// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SsrServiceReqDMLFactory();
		}
		return dml;
	}

}