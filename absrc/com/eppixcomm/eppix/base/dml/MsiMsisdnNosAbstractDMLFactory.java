package com.eppixcomm.eppix.base.dml;

public class MsiMsisdnNosAbstractDMLFactory extends BaseDMLFactory {

	protected MsiMsisdnNosAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable(
				"MsiMsisdnNos", // DML Name
				"blo.MsiMsisdnNosDMO", // dmoName
				"msi_msisdn_nos", // tableName
				25, // numColumns
				"MSI_ORIG_PROV_ID, MSI_IMP_PROV_ID, MSI_ORIG_SERV_PROV, MSI_IMP_SERV_PROV, MSI_MSISDN_NO, MSI_SUBSCRIBER_ID, MSI_SIM_NO, MSI_DEALER_ID, MSI_BILL_AC_NO, MSI_PARTNER_ID, MSI_APN_POP_ID, MSI_ACC_TYPE, MSI_USER_ID, MSI_HLR, MSI_STATUS, MSI_MSISDN_TYPE, MSI_DUMMY, MSI_CHAR_ANAL_1, MSI_CHAR_ANAL_2, MSI_CHAR_ANAL_3, MSI_CHAR_ANAL_4, MSI_CHAR_ANAL_5, MSI_INT_ANAL_1, MSI_INT_ANAL_2, MSI_INT_ANAL_3", // columnList
				"MSI_ORIG_PROV_ID, MSI_MSISDN_NO", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"MSI_ORIG_PROV_ID, MSI_IMP_PROV_ID, MSI_ORIG_SERV_PROV, MSI_IMP_SERV_PROV, MSI_MSISDN_NO, MSI_SUBSCRIBER_ID, MSI_SIM_NO, MSI_DEALER_ID, MSI_BILL_AC_NO, MSI_PARTNER_ID, MSI_APN_POP_ID, MSI_ACC_TYPE, MSI_USER_ID, MSI_HLR, MSI_STATUS, MSI_MSISDN_TYPE, MSI_DUMMY, MSI_CHAR_ANAL_1, MSI_CHAR_ANAL_2, MSI_CHAR_ANAL_3, MSI_CHAR_ANAL_4, MSI_CHAR_ANAL_5, MSI_INT_ANAL_1, MSI_INT_ANAL_2, MSI_INT_ANAL_3 ",
				"", "", new String[] { "MSI_ORIG_PROV_ID", "MSI_IMP_PROV_ID",
						"MSI_ORIG_SERV_PROV", "MSI_IMP_SERV_PROV",
						"MSI_MSISDN_NO", "MSI_SUBSCRIBER_ID", "MSI_SIM_NO",
						"MSI_DEALER_ID", "MSI_BILL_AC_NO", "MSI_PARTNER_ID",
						"MSI_APN_POP_ID", "MSI_ACC_TYPE", "MSI_USER_ID",
						"MSI_HLR", "MSI_STATUS", "MSI_MSISDN_TYPE",
						"MSI_DUMMY", "MSI_CHAR_ANAL_1", "MSI_CHAR_ANAL_2",
						"MSI_CHAR_ANAL_3", "MSI_CHAR_ANAL_4",
						"MSI_CHAR_ANAL_5", "MSI_INT_ANAL_1", "MSI_INT_ANAL_2",
						"MSI_INT_ANAL_3" }, true);
		table.addFilterBy("equalMsiOrigProvId", /* PK attribute */
		"MSI_ORIG_PROV_ID = ? ")
				.addFilterBy("filterByMsiOrigProvIdMatch",
						"MSI_ORIG_PROV_ID LIKE ?")
				.addFilterBy("INMsiOrigProvId", "MSI_ORIG_PROV_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiOrigProvId",
						"MSI_ORIG_PROV_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiOrigProvId", "MSI_ORIG_PROV_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiOrigProvId",
						"(MSI_ORIG_PROV_ID IS NULL OR LENGTH(MSI_ORIG_PROV_ID) IS NULL OR LENGTH(MSI_ORIG_PROV_ID) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiOrigProvId",
						"MSI_ORIG_PROV_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiOrigProvId", "MSI_ORIG_PROV_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiOrigProvId",
						"MSI_ORIG_PROV_ID > ? ") // GREATER THAN

				.addFilterBy("filterByMsiOrigProvIdMatch",
						"MSI_ORIG_PROV_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiOrigProvId",
						"(MSI_ORIG_PROV_ID = ? OR MSI_ORIG_PROV_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiOrigProvId asc", "MSI_ORIG_PROV_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("MsiOrigProvId desc", "MSI_ORIG_PROV_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiImpProvId", /* PK attribute */
		"MSI_IMP_PROV_ID = ? ")
				.addFilterBy("filterByMsiImpProvIdMatch",
						"MSI_IMP_PROV_ID LIKE ?")
				.addFilterBy("INMsiImpProvId", "MSI_IMP_PROV_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiImpProvId",
						"MSI_IMP_PROV_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiImpProvId", "MSI_IMP_PROV_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiImpProvId",
						"(MSI_IMP_PROV_ID IS NULL OR LENGTH(MSI_IMP_PROV_ID) IS NULL OR LENGTH(MSI_IMP_PROV_ID) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiImpProvId",
						"MSI_IMP_PROV_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiImpProvId", "MSI_IMP_PROV_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiImpProvId", "MSI_IMP_PROV_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiImpProvIdMatch",
						"MSI_IMP_PROV_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiImpProvId",
						"(MSI_IMP_PROV_ID = ? OR MSI_IMP_PROV_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiImpProvId asc", "MSI_IMP_PROV_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiImpProvId desc", "MSI_IMP_PROV_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiOrigServProv", /* PK attribute */
		"MSI_ORIG_SERV_PROV = ? ")
				.addFilterBy("filterByMsiOrigServProvMatch",
						"MSI_ORIG_SERV_PROV LIKE ?")
				.addFilterBy("INMsiOrigServProv",
						"MSI_ORIG_SERV_PROV IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiOrigServProv",
						"MSI_ORIG_SERV_PROV NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiOrigServProv",
						"MSI_ORIG_SERV_PROV != ?") // NOTEQUAL

				.addFilterBy("nullMsiOrigServProv",
						"(MSI_ORIG_SERV_PROV IS NULL OR LENGTH(MSI_ORIG_SERV_PROV) IS NULL OR LENGTH(MSI_ORIG_SERV_PROV) = 0)") // IS
																										// NULL

				.addFilterBy("notnullMsiOrigServProv",
						"MSI_ORIG_SERV_PROV IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiOrigServProv",
						"MSI_ORIG_SERV_PROV < ? ") // LESS THAN

				.addFilterBy("greaterthanMsiOrigServProv",
						"MSI_ORIG_SERV_PROV > ? ") // GREATER THAN

				.addFilterBy("filterByMsiOrigServProvMatch",
						"MSI_ORIG_SERV_PROV LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullMsiOrigServProv",
						"(MSI_ORIG_SERV_PROV = ? OR MSI_ORIG_SERV_PROV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiOrigServProv asc", "MSI_ORIG_SERV_PROV ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("MsiOrigServProv desc", "MSI_ORIG_SERV_PROV DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalMsiImpServProv", /* PK attribute */
		"MSI_IMP_SERV_PROV = ? ")
				.addFilterBy("filterByMsiImpServProvMatch",
						"MSI_IMP_SERV_PROV LIKE ?")
				.addFilterBy("INMsiImpServProv", "MSI_IMP_SERV_PROV IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiImpServProv",
						"MSI_IMP_SERV_PROV NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiImpServProv", "MSI_IMP_SERV_PROV != ?") // NOTEQUAL

				.addFilterBy("nullMsiImpServProv",
						"(MSI_IMP_SERV_PROV IS NULL OR LENGTH(MSI_IMP_SERV_PROV) IS NULL OR LENGTH(MSI_IMP_SERV_PROV) = 0)") // IS
																										// NULL

				.addFilterBy("notnullMsiImpServProv",
						"MSI_IMP_SERV_PROV IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiImpServProv", "MSI_IMP_SERV_PROV < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanMsiImpServProv",
						"MSI_IMP_SERV_PROV > ? ") // GREATER THAN

				.addFilterBy("filterByMsiImpServProvMatch",
						"MSI_IMP_SERV_PROV LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullMsiImpServProv",
						"(MSI_IMP_SERV_PROV = ? OR MSI_IMP_SERV_PROV IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiImpServProv asc", "MSI_IMP_SERV_PROV ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("MsiImpServProv desc", "MSI_IMP_SERV_PROV DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalMsiMsisdnNo", /* PK attribute */
		"MSI_MSISDN_NO = ? ")
				.addFilterBy("filterByMsiMsisdnNoMatch", "MSI_MSISDN_NO LIKE ?")
				.addFilterBy("INMsiMsisdnNo", "MSI_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiMsisdnNo", "MSI_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiMsisdnNo", "MSI_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy("nullMsiMsisdnNo",
						"(MSI_MSISDN_NO IS NULL OR LENGTH(MSI_MSISDN_NO) IS NULL OR LENGTH(MSI_MSISDN_NO) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiMsisdnNo",
						"MSI_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiMsisdnNo", "MSI_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiMsisdnNo", "MSI_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiMsisdnNoMatch",
						"MSI_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiMsisdnNo",
						"(MSI_MSISDN_NO = ? OR MSI_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiMsisdnNo asc", "MSI_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiMsisdnNo desc", "MSI_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiSubscriberId", /* PK attribute */
		"MSI_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByMsiSubscriberIdMatch",
						"MSI_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INMsiSubscriberId", "MSI_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiSubscriberId",
						"MSI_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiSubscriberId",
						"MSI_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiSubscriberId",
						"(MSI_SUBSCRIBER_ID IS NULL OR LENGTH(MSI_SUBSCRIBER_ID) IS NULL OR LENGTH(MSI_SUBSCRIBER_ID) = 0)") // IS
																										// NULL

				.addFilterBy("notnullMsiSubscriberId",
						"MSI_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiSubscriberId",
						"MSI_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanMsiSubscriberId",
						"MSI_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByMsiSubscriberIdMatch",
						"MSI_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullMsiSubscriberId",
						"(MSI_SUBSCRIBER_ID = ? OR MSI_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiSubscriberId asc", "MSI_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("MsiSubscriberId desc", "MSI_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalMsiSimNo", /* PK attribute */
		"MSI_SIM_NO = ? ")
				.addFilterBy("filterByMsiSimNoMatch", "MSI_SIM_NO LIKE ?")
				.addFilterBy("INMsiSimNo", "MSI_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiSimNo", "MSI_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiSimNo", "MSI_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiSimNo",
						"(MSI_SIM_NO IS NULL OR LENGTH(MSI_SIM_NO) IS NULL OR LENGTH(MSI_SIM_NO) = 0)") // IS
																								// NULL

				.addFilterBy("notnullMsiSimNo", "MSI_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanMsiSimNo", "MSI_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanMsiSimNo", "MSI_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByMsiSimNoMatch", "MSI_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullMsiSimNo",
						"(MSI_SIM_NO = ? OR MSI_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiSimNo asc", "MSI_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("MsiSimNo desc", "MSI_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalMsiDealerId", /* PK attribute */
		"MSI_DEALER_ID = ? ")
				.addFilterBy("filterByMsiDealerIdMatch", "MSI_DEALER_ID LIKE ?")
				.addFilterBy("INMsiDealerId", "MSI_DEALER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiDealerId", "MSI_DEALER_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiDealerId", "MSI_DEALER_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiDealerId",
						"(MSI_DEALER_ID IS NULL OR LENGTH(MSI_DEALER_ID) IS NULL OR LENGTH(MSI_DEALER_ID) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiDealerId",
						"MSI_DEALER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiDealerId", "MSI_DEALER_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiDealerId", "MSI_DEALER_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiDealerIdMatch",
						"MSI_DEALER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiDealerId",
						"(MSI_DEALER_ID = ? OR MSI_DEALER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiDealerId asc", "MSI_DEALER_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiDealerId desc", "MSI_DEALER_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiBillAcNo", /* PK attribute */
		"MSI_BILL_AC_NO = ? ")
				.addFilterBy("filterByMsiBillAcNoMatch",
						"MSI_BILL_AC_NO LIKE ?")
				.addFilterBy("INMsiBillAcNo", "MSI_BILL_AC_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiBillAcNo", "MSI_BILL_AC_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiBillAcNo", "MSI_BILL_AC_NO != ?") // NOTEQUAL

				.addFilterBy("nullMsiBillAcNo",
						"(MSI_BILL_AC_NO IS NULL OR LENGTH(MSI_BILL_AC_NO) IS NULL OR LENGTH(MSI_BILL_AC_NO) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiBillAcNo",
						"MSI_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiBillAcNo", "MSI_BILL_AC_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiBillAcNo", "MSI_BILL_AC_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiBillAcNoMatch",
						"MSI_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiBillAcNo",
						"(MSI_BILL_AC_NO = ? OR MSI_BILL_AC_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiBillAcNo asc", "MSI_BILL_AC_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiBillAcNo desc", "MSI_BILL_AC_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiPartnerId", /* PK attribute */
		"MSI_PARTNER_ID = ? ")
				.addFilterBy("filterByMsiPartnerIdMatch",
						"MSI_PARTNER_ID LIKE ?")
				.addFilterBy("INMsiPartnerId", "MSI_PARTNER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiPartnerId", "MSI_PARTNER_ID NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalMsiPartnerId", "MSI_PARTNER_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiPartnerId",
						"(MSI_PARTNER_ID IS NULL OR LENGTH(MSI_PARTNER_ID) IS NULL OR LENGTH(MSI_PARTNER_ID) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiPartnerId",
						"MSI_PARTNER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiPartnerId", "MSI_PARTNER_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiPartnerId", "MSI_PARTNER_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiPartnerIdMatch",
						"MSI_PARTNER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiPartnerId",
						"(MSI_PARTNER_ID = ? OR MSI_PARTNER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiPartnerId asc", "MSI_PARTNER_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiPartnerId desc", "MSI_PARTNER_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiApnPopId", /* PK attribute */
		"MSI_APN_POP_ID = ? ")
				.addFilterBy("filterByMsiApnPopIdMatch",
						"MSI_APN_POP_ID LIKE ?")
				.addFilterBy("INMsiApnPopId", "MSI_APN_POP_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiApnPopId", "MSI_APN_POP_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiApnPopId", "MSI_APN_POP_ID != ?") // NOTEQUAL

				.addFilterBy("nullMsiApnPopId",
						"(MSI_APN_POP_ID IS NULL OR LENGTH(MSI_APN_POP_ID) IS NULL OR LENGTH(MSI_APN_POP_ID) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiApnPopId",
						"MSI_APN_POP_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiApnPopId", "MSI_APN_POP_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiApnPopId", "MSI_APN_POP_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiApnPopIdMatch",
						"MSI_APN_POP_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiApnPopId",
						"(MSI_APN_POP_ID = ? OR MSI_APN_POP_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiApnPopId asc", "MSI_APN_POP_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiApnPopId desc", "MSI_APN_POP_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiAccType", /* PK attribute */
		"MSI_ACC_TYPE = ? ")
				.addFilterBy("filterByMsiAccTypeMatch", "MSI_ACC_TYPE LIKE ?")
				.addFilterBy("INMsiAccType", "MSI_ACC_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiAccType", "MSI_ACC_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiAccType", "MSI_ACC_TYPE != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiAccType",
						"(MSI_ACC_TYPE IS NULL OR LENGTH(MSI_ACC_TYPE) IS NULL OR LENGTH(MSI_ACC_TYPE) = 0)") // IS
																								// NULL

				.addFilterBy("notnullMsiAccType", "MSI_ACC_TYPE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanMsiAccType", "MSI_ACC_TYPE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanMsiAccType", "MSI_ACC_TYPE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByMsiAccTypeMatch", "MSI_ACC_TYPE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullMsiAccType",
						"(MSI_ACC_TYPE = ? OR MSI_ACC_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiAccType asc", "MSI_ACC_TYPE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("MsiAccType desc", "MSI_ACC_TYPE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiUserId", /* PK attribute */
		"MSI_USER_ID = ? ")
				.addFilterBy("filterByMsiUserIdMatch", "MSI_USER_ID LIKE ?")
				.addFilterBy("INMsiUserId", "MSI_USER_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiUserId", "MSI_USER_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiUserId", "MSI_USER_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiUserId",
						"(MSI_USER_ID IS NULL OR LENGTH(MSI_USER_ID) IS NULL OR LENGTH(MSI_USER_ID) = 0)") // IS
																								// NULL

				.addFilterBy("notnullMsiUserId", "MSI_USER_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanMsiUserId", "MSI_USER_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanMsiUserId", "MSI_USER_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByMsiUserIdMatch", "MSI_USER_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullMsiUserId",
						"(MSI_USER_ID = ? OR MSI_USER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiUserId asc", "MSI_USER_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("MsiUserId desc", "MSI_USER_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalMsiHlr", /* PK attribute */
		"MSI_HLR = ? ")
				.addFilterBy("filterByMsiHlrMatch", "MSI_HLR LIKE ?")
				.addFilterBy("INMsiHlr", "MSI_HLR IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiHlr", "MSI_HLR NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiHlr", "MSI_HLR != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiHlr",
						"(MSI_HLR IS NULL OR LENGTH(MSI_HLR) IS NULL OR LENGTH(MSI_HLR) = 0)") // IS
																							// NULL

				.addFilterBy("notnullMsiHlr", "MSI_HLR IS NOT NULL ?") // IS NOT
																		// NULL

				.addFilterBy("lessthanMsiHlr", "MSI_HLR < ? ") // LESS THAN

				.addFilterBy("greaterthanMsiHlr", "MSI_HLR > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByMsiHlrMatch", "MSI_HLR LIKE ? ") // LIKE,
																		// BEGINSWITH,
																		// ENDSWITH,
																		// ANY

				.addFilterBy("equalornullMsiHlr",
						"(MSI_HLR = ? OR MSI_HLR IS NULL) ") // EQUALORNULL
																// TODO : we may
																// need to wrap
																// this with a
																// TRIM()

				.addOrderBy("MsiHlr asc", "MSI_HLR ASC ") // ORDER ASCENDING

				.addOrderBy("MsiHlr desc", "MSI_HLR DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalMsiStatus", /* PK attribute */
		"MSI_STATUS = ? ")
				.addFilterBy("filterByMsiStatusMatch", "MSI_STATUS LIKE ?")
				.addFilterBy("INMsiStatus", "MSI_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiStatus", "MSI_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiStatus", "MSI_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiStatus",
						"(MSI_STATUS IS NULL OR LENGTH(MSI_STATUS) IS NULL OR LENGTH(MSI_STATUS) = 0)") // IS
																								// NULL

				.addFilterBy("notnullMsiStatus", "MSI_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanMsiStatus", "MSI_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanMsiStatus", "MSI_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByMsiStatusMatch", "MSI_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullMsiStatus",
						"(MSI_STATUS = ? OR MSI_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiStatus asc", "MSI_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("MsiStatus desc", "MSI_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalMsiMsisdnType", /* PK attribute */
		"MSI_MSISDN_TYPE = ? ")
				.addFilterBy("filterByMsiMsisdnTypeMatch",
						"MSI_MSISDN_TYPE LIKE ?")
				.addFilterBy("INMsiMsisdnType", "MSI_MSISDN_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiMsisdnType",
						"MSI_MSISDN_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiMsisdnType", "MSI_MSISDN_TYPE != ?") // NOTEQUAL

				.addFilterBy("nullMsiMsisdnType",
						"(MSI_MSISDN_TYPE IS NULL OR LENGTH(MSI_MSISDN_TYPE) IS NULL OR LENGTH(MSI_MSISDN_TYPE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiMsisdnType",
						"MSI_MSISDN_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiMsisdnType", "MSI_MSISDN_TYPE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiMsisdnType", "MSI_MSISDN_TYPE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByMsiMsisdnTypeMatch",
						"MSI_MSISDN_TYPE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiMsisdnType",
						"(MSI_MSISDN_TYPE = ? OR MSI_MSISDN_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiMsisdnType asc", "MSI_MSISDN_TYPE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("MsiMsisdnType desc", "MSI_MSISDN_TYPE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiDummy", /* PK attribute */
		"MSI_DUMMY = ? ")
				.addFilterBy("filterByMsiDummyMatch", "MSI_DUMMY LIKE ?")
				.addFilterBy("INMsiDummy", "MSI_DUMMY IN ( ? ) ")
				// IN

				.addFilterBy("NOTINMsiDummy", "MSI_DUMMY NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalMsiDummy", "MSI_DUMMY != ?")
				// NOTEQUAL

				.addFilterBy("nullMsiDummy",
						"(MSI_DUMMY IS NULL OR LENGTH(MSI_DUMMY) IS NULL OR LENGTH(MSI_DUMMY) = 0)") // IS
																								// NULL

				.addFilterBy("notnullMsiDummy", "MSI_DUMMY IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanMsiDummy", "MSI_DUMMY < ? ") // LESS THAN

				.addFilterBy("greaterthanMsiDummy", "MSI_DUMMY > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByMsiDummyMatch", "MSI_DUMMY LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullMsiDummy",
						"(MSI_DUMMY = ? OR MSI_DUMMY IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiDummy asc", "MSI_DUMMY ASC ") // ORDER ASCENDING

				.addOrderBy("MsiDummy desc", "MSI_DUMMY DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalMsiCharAnal1", /* PK attribute */
		"MSI_CHAR_ANAL_1 = ? ")
				.addFilterBy("filterByMsiCharAnal1Match",
						"MSI_CHAR_ANAL_1 LIKE ?")
				.addFilterBy("INMsiCharAnal1", "MSI_CHAR_ANAL_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiCharAnal1",
						"MSI_CHAR_ANAL_1 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiCharAnal1", "MSI_CHAR_ANAL_1 != ?") // NOTEQUAL

				.addFilterBy("nullMsiCharAnal1",
						"(MSI_CHAR_ANAL_1 IS NULL OR LENGTH(MSI_CHAR_ANAL_1) IS NULL OR LENGTH(MSI_CHAR_ANAL_1) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiCharAnal1",
						"MSI_CHAR_ANAL_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiCharAnal1", "MSI_CHAR_ANAL_1 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiCharAnal1", "MSI_CHAR_ANAL_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiCharAnal1Match",
						"MSI_CHAR_ANAL_1 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiCharAnal1",
						"(MSI_CHAR_ANAL_1 = ? OR MSI_CHAR_ANAL_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiCharAnal1 asc", "MSI_CHAR_ANAL_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiCharAnal1 desc", "MSI_CHAR_ANAL_1 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiCharAnal2", /* PK attribute */
		"MSI_CHAR_ANAL_2 = ? ")
				.addFilterBy("filterByMsiCharAnal2Match",
						"MSI_CHAR_ANAL_2 LIKE ?")
				.addFilterBy("INMsiCharAnal2", "MSI_CHAR_ANAL_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiCharAnal2",
						"MSI_CHAR_ANAL_2 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiCharAnal2", "MSI_CHAR_ANAL_2 != ?") // NOTEQUAL

				.addFilterBy("nullMsiCharAnal2",
						"(MSI_CHAR_ANAL_2 IS NULL OR LENGTH(MSI_CHAR_ANAL_2) IS NULL OR LENGTH(MSI_CHAR_ANAL_2) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiCharAnal2",
						"MSI_CHAR_ANAL_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiCharAnal2", "MSI_CHAR_ANAL_2 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiCharAnal2", "MSI_CHAR_ANAL_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiCharAnal2Match",
						"MSI_CHAR_ANAL_2 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiCharAnal2",
						"(MSI_CHAR_ANAL_2 = ? OR MSI_CHAR_ANAL_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiCharAnal2 asc", "MSI_CHAR_ANAL_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiCharAnal2 desc", "MSI_CHAR_ANAL_2 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiCharAnal3", /* PK attribute */
		"MSI_CHAR_ANAL_3 = ? ")
				.addFilterBy("filterByMsiCharAnal3Match",
						"MSI_CHAR_ANAL_3 LIKE ?")
				.addFilterBy("INMsiCharAnal3", "MSI_CHAR_ANAL_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiCharAnal3",
						"MSI_CHAR_ANAL_3 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiCharAnal3", "MSI_CHAR_ANAL_3 != ?") // NOTEQUAL

				.addFilterBy("nullMsiCharAnal3",
						"(MSI_CHAR_ANAL_3 IS NULL OR LENGTH(MSI_CHAR_ANAL_3) IS NULL OR LENGTH(MSI_CHAR_ANAL_3) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiCharAnal3",
						"MSI_CHAR_ANAL_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiCharAnal3", "MSI_CHAR_ANAL_3 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiCharAnal3", "MSI_CHAR_ANAL_3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiCharAnal3Match",
						"MSI_CHAR_ANAL_3 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiCharAnal3",
						"(MSI_CHAR_ANAL_3 = ? OR MSI_CHAR_ANAL_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiCharAnal3 asc", "MSI_CHAR_ANAL_3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiCharAnal3 desc", "MSI_CHAR_ANAL_3 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiCharAnal4", /* PK attribute */
		"MSI_CHAR_ANAL_4 = ? ")
				.addFilterBy("filterByMsiCharAnal4Match",
						"MSI_CHAR_ANAL_4 LIKE ?")
				.addFilterBy("INMsiCharAnal4", "MSI_CHAR_ANAL_4 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiCharAnal4",
						"MSI_CHAR_ANAL_4 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiCharAnal4", "MSI_CHAR_ANAL_4 != ?") // NOTEQUAL

				.addFilterBy("nullMsiCharAnal4",
						"(MSI_CHAR_ANAL_4 IS NULL OR LENGTH(MSI_CHAR_ANAL_4) IS NULL OR LENGTH(MSI_CHAR_ANAL_4) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiCharAnal4",
						"MSI_CHAR_ANAL_4 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiCharAnal4", "MSI_CHAR_ANAL_4 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiCharAnal4", "MSI_CHAR_ANAL_4 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiCharAnal4Match",
						"MSI_CHAR_ANAL_4 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiCharAnal4",
						"(MSI_CHAR_ANAL_4 = ? OR MSI_CHAR_ANAL_4 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiCharAnal4 asc", "MSI_CHAR_ANAL_4 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiCharAnal4 desc", "MSI_CHAR_ANAL_4 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiCharAnal5", /* PK attribute */
		"MSI_CHAR_ANAL_5 = ? ")
				.addFilterBy("filterByMsiCharAnal5Match",
						"MSI_CHAR_ANAL_5 LIKE ?")
				.addFilterBy("INMsiCharAnal5", "MSI_CHAR_ANAL_5 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiCharAnal5",
						"MSI_CHAR_ANAL_5 NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalMsiCharAnal5", "MSI_CHAR_ANAL_5 != ?") // NOTEQUAL

				.addFilterBy("nullMsiCharAnal5",
						"(MSI_CHAR_ANAL_5 IS NULL OR LENGTH(MSI_CHAR_ANAL_5) IS NULL OR LENGTH(MSI_CHAR_ANAL_5) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiCharAnal5",
						"MSI_CHAR_ANAL_5 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiCharAnal5", "MSI_CHAR_ANAL_5 < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanMsiCharAnal5", "MSI_CHAR_ANAL_5 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiCharAnal5Match",
						"MSI_CHAR_ANAL_5 LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullMsiCharAnal5",
						"(MSI_CHAR_ANAL_5 = ? OR MSI_CHAR_ANAL_5 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiCharAnal5 asc", "MSI_CHAR_ANAL_5 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiCharAnal5 desc", "MSI_CHAR_ANAL_5 DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalMsiIntAnal1", /* PK attribute */
		"MSI_INT_ANAL_1 = ? ")
				.addFilterBy("filterByMsiIntAnal1Match",
						"MSI_INT_ANAL_1 LIKE ?")
				.addFilterBy("INMsiIntAnal1", "MSI_INT_ANAL_1 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiIntAnal1", "MSI_INT_ANAL_1 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiIntAnal1", "MSI_INT_ANAL_1 != ?") // NOTEQUAL

				.addFilterBy("nullMsiIntAnal1",
						"(MSI_INT_ANAL_1 IS NULL OR LENGTH(MSI_INT_ANAL_1) IS NULL OR LENGTH(MSI_INT_ANAL_1) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiIntAnal1",
						"MSI_INT_ANAL_1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiIntAnal1", "MSI_INT_ANAL_1 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiIntAnal1", "MSI_INT_ANAL_1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiIntAnal1Match",
						"MSI_INT_ANAL_1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiIntAnal1",
						"(MSI_INT_ANAL_1 = ? OR MSI_INT_ANAL_1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiIntAnal1 asc", "MSI_INT_ANAL_1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiIntAnal1 desc", "MSI_INT_ANAL_1 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiIntAnal2", /* PK attribute */
		"MSI_INT_ANAL_2 = ? ")
				.addFilterBy("filterByMsiIntAnal2Match",
						"MSI_INT_ANAL_2 LIKE ?")
				.addFilterBy("INMsiIntAnal2", "MSI_INT_ANAL_2 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiIntAnal2", "MSI_INT_ANAL_2 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiIntAnal2", "MSI_INT_ANAL_2 != ?") // NOTEQUAL

				.addFilterBy("nullMsiIntAnal2",
						"(MSI_INT_ANAL_2 IS NULL OR LENGTH(MSI_INT_ANAL_2) IS NULL OR LENGTH(MSI_INT_ANAL_2) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiIntAnal2",
						"MSI_INT_ANAL_2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiIntAnal2", "MSI_INT_ANAL_2 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiIntAnal2", "MSI_INT_ANAL_2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiIntAnal2Match",
						"MSI_INT_ANAL_2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiIntAnal2",
						"(MSI_INT_ANAL_2 = ? OR MSI_INT_ANAL_2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiIntAnal2 asc", "MSI_INT_ANAL_2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiIntAnal2 desc", "MSI_INT_ANAL_2 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalMsiIntAnal3", /* PK attribute */
		"MSI_INT_ANAL_3 = ? ")
				.addFilterBy("filterByMsiIntAnal3Match",
						"MSI_INT_ANAL_3 LIKE ?")
				.addFilterBy("INMsiIntAnal3", "MSI_INT_ANAL_3 IN ( ? ) ") // IN

				.addFilterBy("NOTINMsiIntAnal3", "MSI_INT_ANAL_3 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalMsiIntAnal3", "MSI_INT_ANAL_3 != ?") // NOTEQUAL

				.addFilterBy("nullMsiIntAnal3",
						"(MSI_INT_ANAL_3 IS NULL OR LENGTH(MSI_INT_ANAL_3) IS NULL OR LENGTH(MSI_INT_ANAL_3) = 0)") // IS
																									// NULL

				.addFilterBy("notnullMsiIntAnal3",
						"MSI_INT_ANAL_3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanMsiIntAnal3", "MSI_INT_ANAL_3 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanMsiIntAnal3", "MSI_INT_ANAL_3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByMsiIntAnal3Match",
						"MSI_INT_ANAL_3 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullMsiIntAnal3",
						"(MSI_INT_ANAL_3 = ? OR MSI_INT_ANAL_3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("MsiIntAnal3 asc", "MSI_INT_ANAL_3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("MsiIntAnal3 desc", "MSI_INT_ANAL_3 DESC ") // ORDER
																		// DESCENDING
		;

	}
}