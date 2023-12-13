package com.eppixcomm.eppix.base.dml;

/**
 * This is the DMLFactory for PsdParamServDet.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PsdParamServDetAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new PsdParamServDetAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected PsdParamServDetAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"PsdParamServDet", // DML Name
				"blo.PsdParamServDetDMO", // dmoName
				"psd_param_serv_det", // tableName
				13, // numColumns
				"PSD_SERIAL_ID, PSD_PSH_ID, PSD_PARAM_ID, PSD_ACT_DATE, PSD_TERM_DATE, PSD_PARAM_VALUE, PSD_N2N_STRING, PSD_PARAM_ACTIVE, PSD_DEAC_DATE, PSD_SUB_CHARGE, PSD_CHG_VALUE, PSD_ACT_TYPE, PSD_ACTION_DATE", // columnList
				"PSD_SERIAL_ID, PSD_PSH_ID, PSD_PARAM_ID", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"PSD_SERIAL_ID, PSD_PSH_ID, PSD_PARAM_ID, PSD_ACT_DATE, PSD_TERM_DATE, PSD_PARAM_VALUE, PSD_N2N_STRING, PSD_PARAM_ACTIVE, PSD_DEAC_DATE, PSD_SUB_CHARGE, PSD_CHG_VALUE, PSD_ACT_TYPE, PSD_ACTION_DATE",
				"", "", new String[] { "PSD_SERIAL_ID", "PSD_PSH_ID",
						"PSD_PARAM_ID", "PSD_ACT_DATE", "PSD_TERM_DATE",
						"PSD_PARAM_VALUE", "PSD_N2N_STRING",
						"PSD_PARAM_ACTIVE", "PSD_DEAC_DATE", "PSD_SUB_CHARGE",
						"PSD_CHG_VALUE", "PSD_ACT_TYPE", "PSD_ACTION_DATE", },
				true);
		table.addFilterBy("equalPsdSerialId", /* PK attribute */
		"PSD_SERIAL_ID = ? ")
				.addFilterBy("filterByPsdSerialIdMatch", "PSD_SERIAL_ID LIKE ?")
				.addFilterBy("INPsdSerialId", "PSD_SERIAL_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdSerialId", "PSD_SERIAL_ID NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPsdSerialId", "PSD_SERIAL_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdSerialId",
						"(PSD_SERIAL_ID IS NULL OR LENGTH(PSD_SERIAL_ID) IS NULL OR LENGTH(PSD_SERIAL_ID) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPsdSerialId",
						"PSD_SERIAL_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdSerialId", "PSD_SERIAL_ID < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdSerialId", "PSD_SERIAL_ID > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdSerialIdMatch",
						"PSD_SERIAL_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdSerialId",
						"(PSD_SERIAL_ID = ? OR PSD_SERIAL_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdSerialId asc", "PSD_SERIAL_ID ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdSerialId desc", "PSD_SERIAL_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdPshId", /* PK attribute */
		"PSD_PSH_ID = ? ")
				.addFilterBy("filterByPsdPshIdMatch", "PSD_PSH_ID LIKE ?")
				.addFilterBy("INPsdPshId", "PSD_PSH_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPsdPshId", "PSD_PSH_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPsdPshId", "PSD_PSH_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullPsdPshId",
						"(PSD_PSH_ID IS NULL OR LENGTH(PSD_PSH_ID) IS NULL OR LENGTH(PSD_PSH_ID) = 0)") // IS
																										// NULL

				.addFilterBy("notnullPsdPshId", "PSD_PSH_ID IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanPsdPshId", "PSD_PSH_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanPsdPshId", "PSD_PSH_ID > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByPsdPshIdMatch", "PSD_PSH_ID LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullPsdPshId",
						"(PSD_PSH_ID = ? OR PSD_PSH_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdPshId asc", "PSD_PSH_ID ASC ") // ORDER
																// ASCENDING

				.addOrderBy("PsdPshId desc", "PSD_PSH_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalPsdParamId", /* PK attribute */
		"PSD_PARAM_ID = ? ")
				.addFilterBy("filterByPsdParamIdMatch", "PSD_PARAM_ID LIKE ?")
				.addFilterBy("INPsdParamId", "PSD_PARAM_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPsdParamId", "PSD_PARAM_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPsdParamId", "PSD_PARAM_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPsdParamId",
						"(PSD_PARAM_ID IS NULL OR LENGTH(PSD_PARAM_ID) IS NULL OR LENGTH(PSD_PARAM_ID) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPsdParamId", "PSD_PARAM_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPsdParamId", "PSD_PARAM_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPsdParamId", "PSD_PARAM_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPsdParamIdMatch", "PSD_PARAM_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPsdParamId",
						"(PSD_PARAM_ID = ? OR PSD_PARAM_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdParamIdasc", "PSD_PARAM_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PsdParamIddesc", "PSD_PARAM_ID DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdActDate", /* PK attribute */
		"PSD_ACT_DATE = ? ")
				.addFilterBy("filterByPsdActDateMatch", "PSD_ACT_DATE LIKE ?")
				.addFilterBy("INPsdActDate", "PSD_ACT_DATE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPsdActDate", "PSD_ACT_DATE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPsdActDate", "PSD_ACT_DATE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPsdActDate",
						"(PSD_ACT_DATE IS NULL OR LENGTH(PSD_ACT_DATE) IS NULL OR LENGTH(PSD_ACT_DATE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPsdActDate", "PSD_ACT_DATE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPsdActDate", "PSD_ACT_DATE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPsdActDate", "PSD_ACT_DATE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPsdActDateMatch", "PSD_ACT_DATE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPsdActDate",
						"(PSD_ACT_DATE = ? OR PSD_ACT_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdActDate asc", "PSD_ACT_DATE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PsdActDate desc", "PSD_ACT_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdTermDate", /* PK attribute */
		"PSD_TERM_DATE = ? ")
				.addFilterBy("filterByPsdTermDateMatch", "PSD_TERM_DATE LIKE ?")
				.addFilterBy("INPsdTermDate", "PSD_TERM_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdTermDate", "PSD_TERM_DATE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPsdTermDate", "PSD_TERM_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdTermDate",
						"(PSD_TERM_DATE IS NULL OR LENGTH(PSD_TERM_DATE) IS NULL OR LENGTH(PSD_TERM_DATE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPsdTermDate",
						"PSD_TERM_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdTermDate", "PSD_TERM_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdTermDate", "PSD_TERM_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdTermDateMatch",
						"PSD_TERM_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdTermDate",
						"(PSD_TERM_DATE = ? OR PSD_TERM_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdTermDate asc", "PSD_TERM_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdTermDate desc", "PSD_TERM_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdParamValue", /* PK attribute */
		"PSD_PARAM_VALUE = ? ")
				.addFilterBy("filterByPsdParamValueMatch",
						"PSD_PARAM_VALUE LIKE ?")
				.addFilterBy("INPsdParamValue", "PSD_PARAM_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdParamValue",
						"PSD_PARAM_VALUE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPsdParamValue", "PSD_PARAM_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdParamValue",
						"(PSD_PARAM_VALUE IS NULL OR LENGTH(PSD_PARAM_VALUE) IS NULL OR LENGTH(PSD_PARAM_VALUE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullPsdParamValue",
						"PSD_PARAM_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdParamValue", "PSD_PARAM_VALUE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPsdParamValue", "PSD_PARAM_VALUE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByPsdParamValueMatch",
						"PSD_PARAM_VALUE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPsdParamValue",
						"(PSD_PARAM_VALUE = ? OR PSD_PARAM_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdParamValue asc", "PSD_PARAM_VALUE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PsdParamValue desc", "PSD_PARAM_VALUE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPsdN2nString", /* PK attribute */
		"PSD_N2N_STRING = ? ")
				.addFilterBy("filterByPsdN2nStringMatch",
						"PSD_N2N_STRING LIKE ?")
				.addFilterBy("INPsdN2nString", "PSD_N2N_STRING IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdN2nString", "PSD_N2N_STRING NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalPsdN2nString", "PSD_N2N_STRING != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdN2nString",
						"(PSD_N2N_STRING IS NULL OR LENGTH(PSD_N2N_STRING) IS NULL OR LENGTH(PSD_N2N_STRING) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPsdN2nString",
						"PSD_N2N_STRING IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdN2nString", "PSD_N2N_STRING < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdN2nString", "PSD_N2N_STRING > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdN2nStringMatch",
						"PSD_N2N_STRING LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdN2nString",
						"(PSD_N2N_STRING = ? OR PSD_N2N_STRING IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdN2nString asc", "PSD_N2N_STRING ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdN2nString desc", "PSD_N2N_STRING DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPsdParamActive", /* PK attribute */
		"PSD_PARAM_ACTIVE = ? ")
				.addFilterBy("filterByPsdParamActiveMatch",
						"PSD_PARAM_ACTIVE LIKE ?")
				.addFilterBy("INPsdParamActive", "PSD_PARAM_ACTIVE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdParamActive",
						"PSD_PARAM_ACTIVE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPsdParamActive", "PSD_PARAM_ACTIVE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdParamActive",
						"(PSD_PARAM_ACTIVE IS NULL OR LENGTH(PSD_PARAM_ACTIVE) IS NULL OR LENGTH(PSD_PARAM_ACTIVE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullPsdParamActive",
						"PSD_PARAM_ACTIVE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdParamActive", "PSD_PARAM_ACTIVE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPsdParamActive",
						"PSD_PARAM_ACTIVE > ? ") // GREATER THAN

				.addFilterBy("filterByPsdParamActiveMatch",
						"PSD_PARAM_ACTIVE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPsdParamActive",
						"(PSD_PARAM_ACTIVE = ? OR PSD_PARAM_ACTIVE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdParamActive asc", "PSD_PARAM_ACTIVE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PsdParamActive desc", "PSD_PARAM_ACTIVE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalPsdDeacDate", /* PK attribute */
		"PSD_DEAC_DATE = ? ")
				.addFilterBy("filterByPsdDeacDateMatch", "PSD_DEAC_DATE LIKE ?")
				.addFilterBy("INPsdDeacDate", "PSD_DEAC_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdDeacDate", "PSD_DEAC_DATE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPsdDeacDate", "PSD_DEAC_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdDeacDate",	"PSD_DEAC_DATE IS NULL") // IS
																													// NULL

				.addFilterBy("notnullPsdDeacDate",
						"PSD_DEAC_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdDeacDate", "PSD_DEAC_DATE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdDeacDate", "PSD_DEAC_DATE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdDeacDateMatch",
						"PSD_DEAC_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdDeacDate",
						"(PSD_DEAC_DATE = ? OR PSD_DEAC_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdDeacDate asc", "PSD_DEAC_DATE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdDeacDate desc", "PSD_DEAC_DATE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdSubCharge", /* PK attribute */
		"PSD_SUB_CHARGE = ? ")
				.addFilterBy("filterByPsdSubChargeMatch",
						"PSD_SUB_CHARGE LIKE ?")
				.addFilterBy("INPsdSubCharge", "PSD_SUB_CHARGE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdSubCharge", "PSD_SUB_CHARGE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalPsdSubCharge", "PSD_SUB_CHARGE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdSubCharge",
						"(PSD_SUB_CHARGE IS NULL OR LENGTH(PSD_SUB_CHARGE) IS NULL OR LENGTH(PSD_SUB_CHARGE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPsdSubCharge",
						"PSD_SUB_CHARGE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdSubCharge", "PSD_SUB_CHARGE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdSubCharge", "PSD_SUB_CHARGE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdSubChargeMatch",
						"PSD_SUB_CHARGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdSubCharge",
						"(PSD_SUB_CHARGE = ? OR PSD_SUB_CHARGE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdSubCharge asc", "PSD_SUB_CHARGE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdSubCharge desc", "PSD_SUB_CHARGE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalPsdChgValue", /* PK attribute */
		"PSD_CHG_VALUE = ? ")
				.addFilterBy("filterByPsdChgValueMatch", "PSD_CHG_VALUE LIKE ?")
				.addFilterBy("INPsdChgValue", "PSD_CHG_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdChgValue", "PSD_CHG_VALUE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalPsdChgValue", "PSD_CHG_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdChgValue",
						"(PSD_CHG_VALUE IS NULL OR LENGTH(PSD_CHG_VALUE) IS NULL OR LENGTH(PSD_CHG_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullPsdChgValue",
						"PSD_CHG_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdChgValue", "PSD_CHG_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanPsdChgValue", "PSD_CHG_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByPsdChgValueMatch",
						"PSD_CHG_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullPsdChgValue",
						"(PSD_CHG_VALUE = ? OR PSD_CHG_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdChgValue asc", "PSD_CHG_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("PsdChgValue desc", "PSD_CHG_VALUE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdActType", /* PK attribute */
		"PSD_ACT_TYPE = ? ")
				.addFilterBy("filterByPsdActTypeMatch", "PSD_ACT_TYPE LIKE ?")
				.addFilterBy("INPsdActType", "PSD_ACT_TYPE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINPsdActType", "PSD_ACT_TYPE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPsdActType", "PSD_ACT_TYPE != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPsdActType",
						"(PSD_ACT_TYPE IS NULL OR LENGTH(PSD_ACT_TYPE) IS NULL OR LENGTH(PSD_ACT_TYPE) = 0)") // IS
																												// NULL

				.addFilterBy("notnullPsdActType", "PSD_ACT_TYPE IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanPsdActType", "PSD_ACT_TYPE < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanPsdActType", "PSD_ACT_TYPE > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByPsdActTypeMatch", "PSD_ACT_TYPE LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullPsdActType",
						"(PSD_ACT_TYPE = ? OR PSD_ACT_TYPE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdActType asc", "PSD_ACT_TYPE ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("PsdActType desc", "PSD_ACT_TYPE DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPsdActionDate", /* PK attribute */
		"PSD_ACTION_DATE = ? ")
				.addFilterBy("filterByPsdActionDateMatch",
						"PSD_ACTION_DATE LIKE ?")
				.addFilterBy("INPsdActionDate", "PSD_ACTION_DATE IN ( ? ) ") // IN

				.addFilterBy("NOTINPsdActionDate",
						"PSD_ACTION_DATE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalPsdActionDate", "PSD_ACTION_DATE != ?") // NOTEQUAL

				.addFilterBy(
						"nullPsdActionDate",
						"(PSD_ACTION_DATE IS NULL OR LENGTH(PSD_ACTION_DATE) IS NULL OR LENGTH(PSD_ACTION_DATE) = 0)") // IS
																														// NULL

				.addFilterBy("notnullPsdActionDate",
						"PSD_ACTION_DATE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanPsdActionDate", "PSD_ACTION_DATE < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanPsdActionDate", "PSD_ACTION_DATE > ? ") // GREATER
																					// THAN

				.addFilterBy("filterByPsdActionDateMatch",
						"PSD_ACTION_DATE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullPsdActionDate",
						"(PSD_ACTION_DATE = ? OR PSD_ACTION_DATE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PsdActionDate asc", "PSD_ACTION_DATE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("PsdActionDate desc", "PSD_ACTION_DATE DESC ") // ORDER
																			// DESCENDING
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
			dml = new PsdParamServDetAbstractDMLFactory();
		}

		return dml;
	}
}
