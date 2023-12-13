package com.eppixcomm.eppix.base.dml;

public class IluImsiLookupAbstractDMLFactory extends BaseDMLFactory {

	protected IluImsiLookupAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"IluImsiLookup", // DML Name
				"blo.IluImsiLookupDMO", // dmoName
				"ilu_imsi_lookup", // tableName
				6, // numColumns
				"ILU_IMSI_NO, ILU_BASIC_SERV, ILU_SIM_NO, ILU_MSISDN, ILU_DATE, ILU_TIMESTAMP", // columnList
				"ILU_MSISDN, ILU_DATE", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"ILU_IMSI_NO, ILU_BASIC_SERV, ILU_SIM_NO, ILU_MSISDN, ILU_DATE, ILU_TIMESTAMP",
				"", "", new String[] { "ILU_IMSI_NO", "ILU_BASIC_SERV",
						"ILU_SIM_NO", "ILU_MSISDN", "ILU_DATE",
						"ILU_TIMESTAMP"}, true);
		table.addFilterBy("equalIluImsiNo", /* PK attribute */
		"ILU_IMSI_NO = ? ")
				.addFilterBy("filterByIluImsiNoMatch", "ILU_IMSI_NO LIKE ?")
				.addFilterBy("INIluImsiNo", "ILU_IMSI_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINIluImsiNo", "ILU_IMSI_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalIluImsiNo", "ILU_IMSI_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullIluImsiNo",
						"(ILU_IMSI_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullIluImsiNo", "ILU_IMSI_NO IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanIluImsiNo", "ILU_IMSI_NO < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanIluImsiNo", "ILU_IMSI_NO > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByIluImsiNoMatch", "ILU_IMSI_NO LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullIluImsiNo",
						"(ILU_IMSI_NO = ? OR ILU_IMSI_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("IluImsiNo asc", "ILU_IMSI_NO ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("IluImsiNo desc", "ILU_IMSI_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalIluBasicServ", /* PK attribute */
		"ILU_BASIC_SERV = ? ")
				.addFilterBy("filterByIluBasicServMatch",
						"ILU_BASIC_SERV LIKE ?")
				.addFilterBy("INIluBasicServ", "ILU_BASIC_SERV IN ( ? ) ") // IN

				.addFilterBy("NOTINIluBasicServ", "ILU_BASIC_SERV NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalIluBasicServ", "ILU_BASIC_SERV != ?") // NOTEQUAL

				.addFilterBy("nullIluBasicServ",
						"(ILU_BASIC_SERV IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullIluBasicServ",
						"ILU_BASIC_SERV IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanIluBasicServ", "ILU_BASIC_SERV < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanIluBasicServ", "ILU_BASIC_SERV > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByIluBasicServMatch",
						"ILU_BASIC_SERV LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullIluBasicServ",
						"(ILU_BASIC_SERV = ? OR ILU_BASIC_SERV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("IluBasicServ asc", "ILU_BASIC_SERV ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("IluBasicServ desc", "ILU_BASIC_SERV DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalIluSimNo", /* PK attribute */
		"ILU_SIM_NO = ? ")
				.addFilterBy("filterByIluSimNoMatch", "ILU_SIM_NO LIKE ?")
				.addFilterBy("INIluSimNo", "ILU_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINIluSimNo", "ILU_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalIluSimNo", "ILU_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullIluSimNo",
						"(ILU_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullIluSimNo", "ILU_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanIluSimNo", "ILU_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanIluSimNo", "ILU_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByIluSimNoMatch", "ILU_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullIluSimNo",
						"(ILU_SIM_NO = ? OR ILU_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("IluSimNo asc", "ILU_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("IluSimNo desc", "ILU_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalIluMsisdn", /* PK attribute */
		"ILU_MSISDN = ? ")
				.addFilterBy("filterByIluMsisdnMatch", "ILU_MSISDN LIKE ?")
				.addFilterBy("INIluMsisdn", "ILU_MSISDN IN ( ? ) ")
				// IN

				.addFilterBy("NOTINIluMsisdn", "ILU_MSISDN NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalIluMsisdn", "ILU_MSISDN != ?")
				// NOTEQUAL

				.addFilterBy("nullIluMsisdn",
						"(ILU_MSISDN IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																								// NULL

				.addFilterBy("notnullIluMsisdn", "ILU_MSISDN IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanIluMsisdn", "ILU_MSISDN < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanIluMsisdn", "ILU_MSISDN > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByIluMsisdnMatch", "ILU_MSISDN LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullIluMsisdn",
						"(ILU_MSISDN = ? OR ILU_MSISDN IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("IluMsisdn asc", "ILU_MSISDN ASC ") // ORDER
																// ASCENDING

				.addOrderBy("IluMsisdn desc", "ILU_MSISDN DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalIluDate", /* PK attribute */
		"ILU_DATE = ? ")
				.addFilterBy("filterByIluDateMatch", "ILU_DATE LIKE ?")
				.addFilterBy("INIluDate", "ILU_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINIluDate", "ILU_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalIluDate", "ILU_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullIluDate",
						"(ILU_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																							// NULL

				.addFilterBy("notnullIluDate", "ILU_DATE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanIluDate", "ILU_DATE < ? ") // LESS THAN

				.addFilterBy("greaterthanIluDate", "ILU_DATE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByIluDateMatch", "ILU_DATE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullIluDate",
						"(ILU_DATE = ? OR ILU_DATE IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("IluDate asc", "ILU_DATE ASC ") // ORDER ASCENDING

				.addOrderBy("IluDate desc", "ILU_DATE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalIluTimestamp", /* PK attribute */
		"ILU_TIMESTAMP = ? ")
				.addFilterBy("filterByIluTimestampMatch",
						"ILU_TIMESTAMP LIKE ?")
				.addFilterBy("INIluTimestamp", "ILU_TIMESTAMP IN ( ? ) ") // IN

				.addFilterBy("NOTINIluTimestamp", "ILU_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalIluTimestamp", "ILU_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy("nullIluTimestamp",
						"(ILU_TIMESTAMP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS
																									// NULL

				.addFilterBy("notnullIluTimestamp",
						"ILU_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanIluTimestamp", "ILU_TIMESTAMP < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanIluTimestamp", "ILU_TIMESTAMP > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByIluTimestampMatch",
						"ILU_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullIluTimestamp",
						"(ILU_TIMESTAMP = ? OR ILU_TIMESTAMP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("IluTimestamp asc", "ILU_TIMESTAMP ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("IluTimestamp desc", "ILU_TIMESTAMP DESC ") // ORDER
																		// DESCENDING
		;
	}
}