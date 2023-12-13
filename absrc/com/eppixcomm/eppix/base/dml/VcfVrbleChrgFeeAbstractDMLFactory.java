package com.eppixcomm.eppix.base.dml;

public class VcfVrbleChrgFeeAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;

	protected VcfVrbleChrgFeeAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"VcfVrbleChrgFee", // DML Name
				"blo.VcfVrbleChrgFeeDMO", // dmoName
				"vcf_vrble_chrg_fee", // tableName
				21, // numColumns
				"VCF_EQUIP_ID, VCF_CUSTOMER, VCF_SUBSCRIBER_ID, VCF_VARIABLE_TYPE, VCF_PRODUCT_CODE, VCF_DESCRIPTION, VCF_MAKE, VCF_MODEL, VCF_INVENTRY_ITEMID, VCF_START_DATE, VCF_END_DATE, VCF_CONTRC_LENGTH, VCF_FULL_AMT, VCF_MONTH_AMT, VCF_NEXT_PERIOD, VCF_NEXT_YEAR, VCF_REM_AMT, VCF_REM_PERIOD, VCF_CHARGE_CODE, VCF_STATUS, VCF_TIMESTAMP", // columnList
				"VCF_EQUIP_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"VCF_EQUIP_ID, VCF_CUSTOMER, VCF_SUBSCRIBER_ID, VCF_VARIABLE_TYPE, VCF_PRODUCT_CODE, VCF_DESCRIPTION, VCF_MAKE, VCF_MODEL, VCF_INVENTRY_ITEMID, VCF_START_DATE, VCF_END_DATE, VCF_CONTRC_LENGTH, VCF_FULL_AMT, VCF_MONTH_AMT, VCF_NEXT_PERIOD, VCF_NEXT_YEAR, VCF_REM_AMT, VCF_REM_PERIOD, VCF_CHARGE_CODE, VCF_STATUS, VCF_TIMESTAMP",
				"", "", new String[] { "VCF_EQUIP_ID", "VCF_CUSTOMER",
						"VCF_SUBSCRIBER_ID", "VCF_VARIABLE_TYPE",
						"VCF_PRODUCT_CODE", "VCF_DESCRIPTION", "VCF_MAKE",
						"VCF_MODEL", "VCF_INVENTRY_ITEMID", "VCF_START_DATE",
						"VCF_END_DATE", "VCF_CONTRC_LENGTH", "VCF_FULL_AMT",
						"VCF_MONTH_AMT", "VCF_NEXT_PERIOD", "VCF_NEXT_YEAR",
						"VCF_REM_AMT", "VCF_REM_PERIOD", "VCF_CHARGE_CODE",
						"VCF_STATUS", "VCF_TIMESTAMP"}, true);
		table.addFilterBy("equalVcfEquipId", /* PK attribute */
		"VCF_EQUIP_ID = ? ")
				.addFilterBy("filterByVcfEquipIdMatch", "VCF_EQUIP_ID LIKE ?")
				.addFilterBy("INVcfEquipId", "VCF_EQUIP_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfEquipId", "VCF_EQUIP_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfEquipId", "VCF_EQUIP_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullVcfEquipId",
						"(VCF_EQUIP_ID IS NULL OR LENGTH(VCF_EQUIP_ID) IS NULL OR LENGTH(VCF_EQUIP_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullVcfEquipId", "VCF_EQUIP_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVcfEquipId", "VCF_EQUIP_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVcfEquipId", "VCF_EQUIP_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVcfEquipIdMatch", "VCF_EQUIP_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVcfEquipId",
						"(VCF_EQUIP_ID = ? OR VCF_EQUIP_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfEquipIdasc", "VCF_EQUIP_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VcfEquipIddesc", "VCF_EQUIP_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfCustomer", /* PK attribute */
		"VCF_CUSTOMER = ? ")
				.addFilterBy("filterByVcfCustomerMatch", "VCF_CUSTOMER LIKE ?")
				.addFilterBy("INVcfCustomer", "VCF_CUSTOMER IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfCustomer", "VCF_CUSTOMER NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfCustomer", "VCF_CUSTOMER != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullVcfCustomer",
						"(VCF_CUSTOMER IS NULL OR LENGTH(VCF_CUSTOMER) IS NULL OR LENGTH(VCF_CUSTOMER) = 0)") // IS
																												// NULL

				.addFilterBy("notnullVcfCustomer", "VCF_CUSTOMER IS NOT NULL ?") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanVcfCustomer", "VCF_CUSTOMER < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfCustomer", "VCF_CUSTOMER > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVcfCustomerMatch", "VCF_CUSTOMER LIKE ? ") // LIKE,
																					// BEGINSWITH,
																					// ENDSWITH,
																					// ANY

				.addFilterBy("equalornullVcfCustomer",
						"(VCF_CUSTOMER = ? OR VCF_CUSTOMER IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfCustomerasc", "VCF_CUSTOMER ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VcfCustomerdesc", "VCF_CUSTOMER DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfSubscriberId", /* PK attribute */
		"VCF_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByVcfSubscriberIdMatch",
						"VCF_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INVcfSubscriberId", "VCF_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfSubscriberId",
						"VCF_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfSubscriberId",
						"VCF_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfSubscriberId",
						"(VCF_SUBSCRIBER_ID IS NULL OR LENGTH(VCF_SUBSCRIBER_ID) IS NULL OR LENGTH(VCF_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullVcfSubscriberId",
						"VCF_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfSubscriberId",
						"VCF_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfSubscriberId",
						"VCF_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByVcfSubscriberIdMatch",
						"VCF_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVcfSubscriberId",
						"(VCF_SUBSCRIBER_ID = ? OR VCF_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfSubscriberIdasc", "VCF_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VcfSubscriberIddesc", "VCF_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVcfVariableType", /* PK attribute */
		"VCF_VARIABLE_TYPE = ? ")
				.addFilterBy("filterByVcfVariableTypeMatch",
						"VCF_VARIABLE_TYPE LIKE ?")
				.addFilterBy("INVcfVariableType", "VCF_VARIABLE_TYPE IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfVariableType",
						"VCF_VARIABLE_TYPE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfVariableType",
						"VCF_VARIABLE_TYPE != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfVariableType",
						"(VCF_VARIABLE_TYPE IS NULL OR LENGTH(VCF_VARIABLE_TYPE) IS NULL OR LENGTH(VCF_VARIABLE_TYPE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullVcfVariableType",
						"VCF_VARIABLE_TYPE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfVariableType",
						"VCF_VARIABLE_TYPE < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfVariableType",
						"VCF_VARIABLE_TYPE > ? ") // GREATER THAN

				.addFilterBy("filterByVcfVariableTypeMatch",
						"VCF_VARIABLE_TYPE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVcfVariableType",
						"(VCF_VARIABLE_TYPE = ? OR VCF_VARIABLE_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfVariableTypeasc", "VCF_VARIABLE_TYPE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VcfVariableTypedesc", "VCF_VARIABLE_TYPE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVcfProductCode", /* PK attribute */
		"VCF_PRODUCT_CODE = ? ")
				.addFilterBy("filterByVcfProductCodeMatch",
						"VCF_PRODUCT_CODE LIKE ?")
				.addFilterBy("INVcfProductCode", "VCF_PRODUCT_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfProductCode",
						"VCF_PRODUCT_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfProductCode", "VCF_PRODUCT_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfProductCode",
						"(VCF_PRODUCT_CODE IS NULL OR LENGTH(VCF_PRODUCT_CODE) IS NULL OR LENGTH(VCF_PRODUCT_CODE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullVcfProductCode",
						"VCF_PRODUCT_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfProductCode", "VCF_PRODUCT_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVcfProductCode",
						"VCF_PRODUCT_CODE > ? ") // GREATER THAN

				.addFilterBy("filterByVcfProductCodeMatch",
						"VCF_PRODUCT_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVcfProductCode",
						"(VCF_PRODUCT_CODE = ? OR VCF_PRODUCT_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfProductCodeasc", "VCF_PRODUCT_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VcfProductCodedesc", "VCF_PRODUCT_CODE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVcfDescription", /* PK attribute */
		"VCF_DESCRIPTION = ? ")
				.addFilterBy("filterByVcfDescriptionMatch",
						"VCF_DESCRIPTION LIKE ?")
				.addFilterBy("INVcfDescription", "VCF_DESCRIPTION IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfDescription",
						"VCF_DESCRIPTION NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfDescription", "VCF_DESCRIPTION != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfDescription",
						"(VCF_DESCRIPTION IS NULL OR LENGTH(VCF_DESCRIPTION) IS NULL OR LENGTH(VCF_DESCRIPTION) = 0)") // IS
																														// NULL

				.addFilterBy("notnullVcfDescription",
						"VCF_DESCRIPTION IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfDescription", "VCF_DESCRIPTION < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVcfDescription",
						"VCF_DESCRIPTION > ? ") // GREATER THAN

				.addFilterBy("filterByVcfDescriptionMatch",
						"VCF_DESCRIPTION LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVcfDescription",
						"(VCF_DESCRIPTION = ? OR VCF_DESCRIPTION IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfDescriptionasc", "VCF_DESCRIPTION ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VcfDescriptiondesc", "VCF_DESCRIPTION DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVcfMake", /* PK attribute */
		"VCF_MAKE = ? ")
				.addFilterBy("filterByVcfMakeMatch", "VCF_MAKE LIKE ?")
				.addFilterBy("INVcfMake", "VCF_MAKE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfMake", "VCF_MAKE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfMake", "VCF_MAKE != ?")
				// NOTEQUAL

				.addFilterBy("nullVcfMake",
						"(VCF_MAKE IS NULL OR LENGTH(VCF_MAKE) IS NULL OR LENGTH(VCF_MAKE) = 0)") // IS
																									// NULL

				.addFilterBy("notnullVcfMake", "VCF_MAKE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVcfMake", "VCF_MAKE < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfMake", "VCF_MAKE > ? ") // GREATER
																	// THAN

				.addFilterBy("filterByVcfMakeMatch", "VCF_MAKE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVcfMake",
						"(VCF_MAKE = ? OR VCF_MAKE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfMakeasc", "VCF_MAKE ASC ") // ORDER ASCENDING

				.addOrderBy("VcfMakedesc", "VCF_MAKE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalVcfModel", /* PK attribute */
		"VCF_MODEL = ? ")
				.addFilterBy("filterByVcfModelMatch", "VCF_MODEL LIKE ?")
				.addFilterBy("INVcfModel", "VCF_MODEL IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfModel", "VCF_MODEL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfModel", "VCF_MODEL != ?")
				// NOTEQUAL

				.addFilterBy("nullVcfModel",
						"(VCF_MODEL IS NULL OR LENGTH(VCF_MODEL) IS NULL OR LENGTH(VCF_MODEL) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVcfModel", "VCF_MODEL IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanVcfModel", "VCF_MODEL < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfModel", "VCF_MODEL > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVcfModelMatch", "VCF_MODEL LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullVcfModel",
						"(VCF_MODEL = ? OR VCF_MODEL IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfModelasc", "VCF_MODEL ASC ") // ORDER ASCENDING

				.addOrderBy("VcfModeldesc", "VCF_MODEL DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalVcfInventryItemid", /* PK attribute */
		"VCF_INVENTRY_ITEMID = ? ")
				.addFilterBy("filterByVcfInventryItemidMatch",
						"VCF_INVENTRY_ITEMID LIKE ?")
				.addFilterBy("INVcfInventryItemid",
						"VCF_INVENTRY_ITEMID IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfInventryItemid",
						"VCF_INVENTRY_ITEMID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfInventryItemid",
						"VCF_INVENTRY_ITEMID != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfInventryItemid",
						"(VCF_INVENTRY_ITEMID IS NULL OR LENGTH(VCF_INVENTRY_ITEMID) IS NULL OR LENGTH(VCF_INVENTRY_ITEMID) = 0)") // IS
																																	// NULL

				.addFilterBy("notnullVcfInventryItemid",
						"VCF_INVENTRY_ITEMID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfInventryItemid",
						"VCF_INVENTRY_ITEMID < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfInventryItemid",
						"VCF_INVENTRY_ITEMID > ? ") // GREATER THAN

				.addFilterBy("filterByVcfInventryItemidMatch",
						"VCF_INVENTRY_ITEMID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVcfInventryItemid",
						"(VCF_INVENTRY_ITEMID = ? OR VCF_INVENTRY_ITEMID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfInventryItemidasc", "VCF_INVENTRY_ITEMID ASC ") // ORDER
																					// ASCENDING
				.addOrderBy("VcfInventryItemiddesc",
						"VCF_INVENTRY_ITEMID DESC ") // ORDER DESCENDING
		;

		table.addFilterBy("equalVcfStartDate", /* PK attribute */
		"VCF_START_DATE = ? ")
				.addFilterBy("filterByVcfStartDateMatch",
						"VCF_START_DATE LIKE ?")
				.addFilterBy("INVcfStartDate", "VCF_START_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfStartDate", "VCF_START_DATE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalVcfStartDate", "VCF_START_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfStartDate",
						"(VCF_START_DATE IS NULL OR LENGTH(VCF_START_DATE) IS NULL OR LENGTH(VCF_START_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullVcfStartDate",
						"VCF_START_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfStartDate", "VCF_START_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfStartDate", "VCF_START_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVcfStartDateMatch",
						"VCF_START_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVcfStartDate",
						"(VCF_START_DATE = ? OR VCF_START_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfStartDateasc", "VCF_START_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VcfStartDatedesc", "VCF_START_DATE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVcfEndDate", /* PK attribute */
		"VCF_END_DATE = ? ")
				.addFilterBy("filterByVcfEndDateMatch", "VCF_END_DATE LIKE ?")
				.addFilterBy("INVcfEndDate", "VCF_END_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfEndDate", "VCF_END_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfEndDate", "VCF_END_DATE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullVcfEndDate",
						"(VCF_END_DATE IS NULL OR LENGTH(VCF_END_DATE) IS NULL OR LENGTH(VCF_END_DATE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullVcfEndDate", "VCF_END_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVcfEndDate", "VCF_END_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVcfEndDate", "VCF_END_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVcfEndDateMatch", "VCF_END_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVcfEndDate",
						"(VCF_END_DATE = ? OR VCF_END_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfEndDateasc", "VCF_END_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VcfEndDatedesc", "VCF_END_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfContrcLength", /* PK attribute */
		"VCF_CONTRC_LENGTH = ? ")
				.addFilterBy("filterByVcfContrcLengthMatch",
						"VCF_CONTRC_LENGTH LIKE ?")
				.addFilterBy("INVcfContrcLength", "VCF_CONTRC_LENGTH IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfContrcLength",
						"VCF_CONTRC_LENGTH NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfContrcLength",
						"VCF_CONTRC_LENGTH != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfContrcLength",
						"(VCF_CONTRC_LENGTH IS NULL OR LENGTH(VCF_CONTRC_LENGTH) IS NULL OR LENGTH(VCF_CONTRC_LENGTH) = 0)") // IS
																																// NULL

				.addFilterBy("notnullVcfContrcLength",
						"VCF_CONTRC_LENGTH IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfContrcLength",
						"VCF_CONTRC_LENGTH < ? ") // LESS THAN

				.addFilterBy("greaterthanVcfContrcLength",
						"VCF_CONTRC_LENGTH > ? ") // GREATER THAN

				.addFilterBy("filterByVcfContrcLengthMatch",
						"VCF_CONTRC_LENGTH LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullVcfContrcLength",
						"(VCF_CONTRC_LENGTH = ? OR VCF_CONTRC_LENGTH IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfContrcLengthasc", "VCF_CONTRC_LENGTH ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("VcfContrcLengthdesc", "VCF_CONTRC_LENGTH DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalVcfFullAmt", /* PK attribute */
		"VCF_FULL_AMT = ? ")
				.addFilterBy("filterByVcfFullAmtMatch", "VCF_FULL_AMT LIKE ?")
				.addFilterBy("INVcfFullAmt", "VCF_FULL_AMT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfFullAmt", "VCF_FULL_AMT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfFullAmt", "VCF_FULL_AMT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullVcfFullAmt",
						"(VCF_FULL_AMT IS NULL OR LENGTH(VCF_FULL_AMT) IS NULL OR LENGTH(VCF_FULL_AMT) = 0)") // IS
																												// NULL

				.addFilterBy("notnullVcfFullAmt", "VCF_FULL_AMT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVcfFullAmt", "VCF_FULL_AMT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVcfFullAmt", "VCF_FULL_AMT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVcfFullAmtMatch", "VCF_FULL_AMT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVcfFullAmt",
						"(VCF_FULL_AMT = ? OR VCF_FULL_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfFullAmtasc", "VCF_FULL_AMT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VcfFullAmtdesc", "VCF_FULL_AMT DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfMonthAmt", /* PK attribute */
		"VCF_MONTH_AMT = ? ")
				.addFilterBy("filterByVcfMonthAmtMatch", "VCF_MONTH_AMT LIKE ?")
				.addFilterBy("INVcfMonthAmt", "VCF_MONTH_AMT IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfMonthAmt", "VCF_MONTH_AMT NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVcfMonthAmt", "VCF_MONTH_AMT != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfMonthAmt",
						"(VCF_MONTH_AMT IS NULL OR LENGTH(VCF_MONTH_AMT) IS NULL OR LENGTH(VCF_MONTH_AMT) = 0)") // IS
																													// NULL

				.addFilterBy("notnullVcfMonthAmt",
						"VCF_MONTH_AMT IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfMonthAmt", "VCF_MONTH_AMT < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfMonthAmt", "VCF_MONTH_AMT > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVcfMonthAmtMatch",
						"VCF_MONTH_AMT LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVcfMonthAmt",
						"(VCF_MONTH_AMT = ? OR VCF_MONTH_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfMonthAmtasc", "VCF_MONTH_AMT ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VcfMonthAmtdesc", "VCF_MONTH_AMT DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfNextPeriod", /* PK attribute */
		"VCF_NEXT_PERIOD = ? ")
				.addFilterBy("filterByVcfNextPeriodMatch",
						"VCF_NEXT_PERIOD LIKE ?")
				.addFilterBy("INVcfNextPeriod", "VCF_NEXT_PERIOD IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfNextPeriod",
						"VCF_NEXT_PERIOD NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfNextPeriod", "VCF_NEXT_PERIOD != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfNextPeriod",
						"(VCF_NEXT_PERIOD IS NULL OR LENGTH(VCF_NEXT_PERIOD) IS NULL OR LENGTH(VCF_NEXT_PERIOD) = 0)") // IS
																														// NULL

				.addFilterBy("notnullVcfNextPeriod",
						"VCF_NEXT_PERIOD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfNextPeriod", "VCF_NEXT_PERIOD < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVcfNextPeriod", "VCF_NEXT_PERIOD > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByVcfNextPeriodMatch",
						"VCF_NEXT_PERIOD LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVcfNextPeriod",
						"(VCF_NEXT_PERIOD = ? OR VCF_NEXT_PERIOD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfNextPeriodasc", "VCF_NEXT_PERIOD ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VcfNextPerioddesc", "VCF_NEXT_PERIOD DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVcfNextYear", /* PK attribute */
		"VCF_NEXT_YEAR = ? ")
				.addFilterBy("filterByVcfNextYearMatch", "VCF_NEXT_YEAR LIKE ?")
				.addFilterBy("INVcfNextYear", "VCF_NEXT_YEAR IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfNextYear", "VCF_NEXT_YEAR NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVcfNextYear", "VCF_NEXT_YEAR != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfNextYear",
						"(VCF_NEXT_YEAR IS NULL OR LENGTH(VCF_NEXT_YEAR) IS NULL OR LENGTH(VCF_NEXT_YEAR) = 0)") // IS
																													// NULL

				.addFilterBy("notnullVcfNextYear",
						"VCF_NEXT_YEAR IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfNextYear", "VCF_NEXT_YEAR < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfNextYear", "VCF_NEXT_YEAR > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVcfNextYearMatch",
						"VCF_NEXT_YEAR LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVcfNextYear",
						"(VCF_NEXT_YEAR = ? OR VCF_NEXT_YEAR IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfNextYearasc", "VCF_NEXT_YEAR ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VcfNextYeardesc", "VCF_NEXT_YEAR DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalVcfRemAmt", /* PK attribute */
		"VCF_REM_AMT = ? ")
				.addFilterBy("filterByVcfRemAmtMatch", "VCF_REM_AMT LIKE ?")
				.addFilterBy("INVcfRemAmt", "VCF_REM_AMT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfRemAmt", "VCF_REM_AMT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfRemAmt", "VCF_REM_AMT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullVcfRemAmt",
						"(VCF_REM_AMT IS NULL OR LENGTH(VCF_REM_AMT) IS NULL OR LENGTH(VCF_REM_AMT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullVcfRemAmt", "VCF_REM_AMT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVcfRemAmt", "VCF_REM_AMT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVcfRemAmt", "VCF_REM_AMT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByVcfRemAmtMatch", "VCF_REM_AMT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVcfRemAmt",
						"(VCF_REM_AMT = ? OR VCF_REM_AMT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfRemAmtasc", "VCF_REM_AMT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("VcfRemAmtdesc", "VCF_REM_AMT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVcfRemPeriod", /* PK attribute */
		"VCF_REM_PERIOD = ? ")
				.addFilterBy("filterByVcfRemPeriodMatch",
						"VCF_REM_PERIOD LIKE ?")
				.addFilterBy("INVcfRemPeriod", "VCF_REM_PERIOD IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfRemPeriod", "VCF_REM_PERIOD NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalVcfRemPeriod", "VCF_REM_PERIOD != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfRemPeriod",
						"(VCF_REM_PERIOD IS NULL OR LENGTH(VCF_REM_PERIOD) IS NULL OR LENGTH(VCF_REM_PERIOD) = 0)") // IS
																													// NULL

				.addFilterBy("notnullVcfRemPeriod",
						"VCF_REM_PERIOD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfRemPeriod", "VCF_REM_PERIOD < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfRemPeriod", "VCF_REM_PERIOD > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVcfRemPeriodMatch",
						"VCF_REM_PERIOD LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVcfRemPeriod",
						"(VCF_REM_PERIOD = ? OR VCF_REM_PERIOD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfRemPeriodasc", "VCF_REM_PERIOD ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VcfRemPerioddesc", "VCF_REM_PERIOD DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVcfChargeCode", /* PK attribute */
		"VCF_CHARGE_CODE = ? ")
				.addFilterBy("filterByVcfChargeCodeMatch",
						"VCF_CHARGE_CODE LIKE ?")
				.addFilterBy("INVcfChargeCode", "VCF_CHARGE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfChargeCode",
						"VCF_CHARGE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalVcfChargeCode", "VCF_CHARGE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfChargeCode",
						"(VCF_CHARGE_CODE IS NULL OR LENGTH(VCF_CHARGE_CODE) IS NULL OR LENGTH(VCF_CHARGE_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullVcfChargeCode",
						"VCF_CHARGE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfChargeCode", "VCF_CHARGE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanVcfChargeCode", "VCF_CHARGE_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByVcfChargeCodeMatch",
						"VCF_CHARGE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullVcfChargeCode",
						"(VCF_CHARGE_CODE = ? OR VCF_CHARGE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfChargeCodeasc", "VCF_CHARGE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("VcfChargeCodedesc", "VCF_CHARGE_CODE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalVcfStatus", /* PK attribute */
		"VCF_STATUS = ? ")
				.addFilterBy("filterByVcfStatusMatch", "VCF_STATUS LIKE ?")
				.addFilterBy("INVcfStatus", "VCF_STATUS IN ( ? ) ")
				// IN

				.addFilterBy("NOTINVcfStatus", "VCF_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalVcfStatus", "VCF_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullVcfStatus",
						"(VCF_STATUS IS NULL OR LENGTH(VCF_STATUS) IS NULL OR LENGTH(VCF_STATUS) = 0)") // IS
																										// NULL

				.addFilterBy("notnullVcfStatus", "VCF_STATUS IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanVcfStatus", "VCF_STATUS < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanVcfStatus", "VCF_STATUS > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByVcfStatusMatch", "VCF_STATUS LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullVcfStatus",
						"(VCF_STATUS = ? OR VCF_STATUS IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfStatusasc", "VCF_STATUS ASC ") // ORDER
																// ASCENDING

				.addOrderBy("VcfStatusdesc", "VCF_STATUS DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalVcfTimestamp", /* PK attribute */
		"VCF_TIMESTAMP = ? ")
				.addFilterBy("filterByVcfTimestampMatch",
						"VCF_TIMESTAMP LIKE ?")
				.addFilterBy("INVcfTimestamp", "VCF_TIMESTAMP IN ( ? ) ") // IN

				.addFilterBy("NOTINVcfTimestamp", "VCF_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalVcfTimestamp", "VCF_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy(
						"nullVcfTimestamp",
						"(VCF_TIMESTAMP IS NULL OR LENGTH(VCF_TIMESTAMP) IS NULL OR LENGTH(VCF_TIMESTAMP) = 0)") // IS
																													// NULL

				.addFilterBy("notnullVcfTimestamp",
						"VCF_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanVcfTimestamp", "VCF_TIMESTAMP < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanVcfTimestamp", "VCF_TIMESTAMP > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByVcfTimestampMatch",
						"VCF_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullVcfTimestamp",
						"(VCF_TIMESTAMP = ? OR VCF_TIMESTAMP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("VcfTimestampasc", "VCF_TIMESTAMP ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("VcfTimestampdesc", "VCF_TIMESTAMP DESC ") // ORDER
																		// DESCENDING
		;

	}

}