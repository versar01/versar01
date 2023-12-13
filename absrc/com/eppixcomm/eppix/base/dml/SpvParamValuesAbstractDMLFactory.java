package com.eppixcomm.eppix.base.dml;

public class SpvParamValuesAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DotDocTypeAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected SpvParamValuesAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"SpvParamValues", // DML Name
				"blo.SpvParamValuesDMO", // dmoName
				"spv_param_values", // tableName
				2, // numColumns
				"SPV_PARAM_ID, SPV_PARAM_VALUE, SPV_ACT_CHARGE, SPV_CHARGE_CODE, SPV_DEFAULT_VALUE, SPV_NETWRK_CODE", // columnList
				"SPV_PARAM_ID, SPV_PARAM_VALUE", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"SPV_PARAM_ID, SPV_PARAM_VALUE, SPV_ACT_CHARGE, SPV_CHARGE_CODE, SPV_DEFAULT_VALUE, SPV_NETWRK_CODE",
				"", "", new String[] { "SPV_PARAM_ID", "SPV_PARAM_VALUE",
						"SPV_ACT_CHARGE", "SPV_CHARGE_CODE",
						"SPV_DEFAULT_VALUE", "SPV_NETWRK_CODE", }, true);
		table.addFilterBy("equalSpvParamId", /* PK attribute */
		"SPV_PARAM_ID = ? ")
				.addFilterBy("filterBySpvParamIdMatch", "SPV_PARAM_ID LIKE ?")
				.addFilterBy("INSpvParamId", "SPV_PARAM_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINSpvParamId", "SPV_PARAM_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalSpvParamId", "SPV_PARAM_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullSpvParamId",
						"(SPV_PARAM_ID IS NULL OR LENGTH(SPV_PARAM_ID) IS NULL OR LENGTH(SPV_PARAM_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullSpvParamId", "SPV_PARAM_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanSpvParamId", "SPV_PARAM_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanSpvParamId", "SPV_PARAM_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterBySpvParamIdMatch", "SPV_PARAM_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullSpvParamId",
						"(SPV_PARAM_ID = ? OR SPV_PARAM_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvParamId asc", "SPV_PARAM_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("SpvParamId desc", "SPV_PARAM_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalSpvParamValue", /* PK attribute */
		"SPV_PARAM_VALUE = ? ")
				.addFilterBy("filterBySpvParamValueMatch",
						"SPV_PARAM_VALUE LIKE ?")
				.addFilterBy("INSpvParamValue", "SPV_PARAM_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpvParamValue",
						"SPV_PARAM_VALUE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpvParamValue", "SPV_PARAM_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpvParamValue",
						"(SPV_PARAM_VALUE IS NULL OR LENGTH(SPV_PARAM_VALUE) IS NULL OR LENGTH(SPV_PARAM_VALUE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSpvParamValue",
						"SPV_PARAM_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpvParamValue", "SPV_PARAM_VALUE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpvParamValue", "SPV_PARAM_VALUE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySpvParamValueMatch",
						"SPV_PARAM_VALUE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpvParamValue",
						"(SPV_PARAM_VALUE = ? OR SPV_PARAM_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvParamValue asc", "SPV_PARAM_VALUE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpvParamValue desc", "SPV_PARAM_VALUE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpvActCharge", /* PK attribute */
		"SPV_ACT_CHARGE = ? ")
				.addFilterBy("filterBySpvActChargeMatch",
						"SPV_ACT_CHARGE LIKE ?")
				.addFilterBy("INSpvActCharge", "SPV_ACT_CHARGE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpvActCharge", "SPV_ACT_CHARGE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalSpvActCharge", "SPV_ACT_CHARGE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpvActCharge",
						"(SPV_ACT_CHARGE IS NULL OR LENGTH(SPV_ACT_CHARGE) IS NULL OR LENGTH(SPV_ACT_CHARGE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullSpvActCharge",
						"SPV_ACT_CHARGE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpvActCharge", "SPV_ACT_CHARGE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanSpvActCharge", "SPV_ACT_CHARGE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterBySpvActChargeMatch",
						"SPV_ACT_CHARGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullSpvActCharge",
						"(SPV_ACT_CHARGE = ? OR SPV_ACT_CHARGE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvActCharge asc", "SPV_ACT_CHARGE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("SpvActCharge desc", "SPV_ACT_CHARGE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpvChargeCode", /* PK attribute */
		"SPV_CHARGE_CODE = ? ")
				.addFilterBy("filterBySpvChargeCodeMatch",
						"SPV_CHARGE_CODE LIKE ?")
				.addFilterBy("INSpvChargeCode", "SPV_CHARGE_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpvChargeCode",
						"SPV_CHARGE_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpvChargeCode", "SPV_CHARGE_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpvChargeCode",
						"(SPV_CHARGE_CODE IS NULL OR LENGTH(SPV_CHARGE_CODE) IS NULL OR LENGTH(SPV_CHARGE_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSpvChargeCode",
						"SPV_CHARGE_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpvChargeCode", "SPV_CHARGE_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpvChargeCode", "SPV_CHARGE_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySpvChargeCodeMatch",
						"SPV_CHARGE_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpvChargeCode",
						"(SPV_CHARGE_CODE = ? OR SPV_CHARGE_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvChargeCode asc", "SPV_CHARGE_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpvChargeCode desc", "SPV_CHARGE_CODE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalSpvDefaultValue", /* PK attribute */
		"SPV_DEFAULT_VALUE = ? ")
				.addFilterBy("filterBySpvDefaultValueMatch",
						"SPV_DEFAULT_VALUE LIKE ?")
				.addFilterBy("INSpvDefaultValue", "SPV_DEFAULT_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpvDefaultValue",
						"SPV_DEFAULT_VALUE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpvDefaultValue",
						"SPV_DEFAULT_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpvDefaultValue",
						"(SPV_DEFAULT_VALUE IS NULL OR LENGTH(SPV_DEFAULT_VALUE) IS NULL OR LENGTH(SPV_DEFAULT_VALUE) = 0)") // IS
																																// NULL

				.addFilterBy("notnullSpvDefaultValue",
						"SPV_DEFAULT_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpvDefaultValue",
						"SPV_DEFAULT_VALUE < ? ") // LESS THAN

				.addFilterBy("greaterthanSpvDefaultValue",
						"SPV_DEFAULT_VALUE > ? ") // GREATER THAN

				.addFilterBy("filterBySpvDefaultValueMatch",
						"SPV_DEFAULT_VALUE LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullSpvDefaultValue",
						"(SPV_DEFAULT_VALUE = ? OR SPV_DEFAULT_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvDefaultValue asc", "SPV_DEFAULT_VALUE ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("SpvDefaultValue desc", "SPV_DEFAULT_VALUE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalSpvNetwrkCode", /* PK attribute */
		"SPV_NETWRK_CODE = ? ")
				.addFilterBy("filterBySpvNetwrkCodeMatch",
						"SPV_NETWRK_CODE LIKE ?")
				.addFilterBy("INSpvNetwrkCode", "SPV_NETWRK_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINSpvNetwrkCode",
						"SPV_NETWRK_CODE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalSpvNetwrkCode", "SPV_NETWRK_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullSpvNetwrkCode",
						"(SPV_NETWRK_CODE IS NULL OR LENGTH(SPV_NETWRK_CODE) IS NULL OR LENGTH(SPV_NETWRK_CODE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullSpvNetwrkCode",
						"SPV_NETWRK_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanSpvNetwrkCode", "SPV_NETWRK_CODE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanSpvNetwrkCode", "SPV_NETWRK_CODE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterBySpvNetwrkCodeMatch",
						"SPV_NETWRK_CODE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullSpvNetwrkCode",
						"(SPV_NETWRK_CODE = ? OR SPV_NETWRK_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("SpvNetwrkCode asc", "SPV_NETWRK_CODE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("SpvNetwrkCode desc", "SPV_NETWRK_CODE DESC ") // ORDER
																			// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SpvParamValuesDMLFactory();
		}
		return dml;
	}
}