package com.eppixcomm.eppix.base.dml;

public class ShcSmsHistcodeAbstractDMLFactory extends BaseDMLFactory {

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
	protected ShcSmsHistcodeAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable("ShcSmsHistcode", // DML Name
				"blo.ShcSmsHistcodeDMO", // dmoName
				"shc_sms_histcode", // tableName
				2, // numColumns
				"SHC_MESG_ID, SHC_HIST_CODE", // columnList
				"SHC_HIST_CODE", // primaryKey
				"" // versionCol
				, false, // generatedKey
				"SHC_MESG_ID, SHC_HIST_CODE ", "", "", new String[] {
						"SHC_MESG_ID", "SHC_HIST_CODE" }, true);
		table.addFilterBy("equalShcMesgId", /* PK attribute */
		"SHC_MESG_ID = ? ")
				.addFilterBy("filterByShcMesgIdMatch", "SHC_MESG_ID LIKE ?")
				.addFilterBy("INShcMesgId", "SHC_MESG_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINShcMesgId", "SHC_MESG_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalShcMesgId", "SHC_MESG_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullShcMesgId",
						"(SHC_MESG_ID IS NULL OR LENGTH(SHC_MESG_ID) IS NULL OR LENGTH(SHC_MESG_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullShcMesgId", "SHC_MESG_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanShcMesgId", "SHC_MESG_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanShcMesgId", "SHC_MESG_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByShcMesgIdMatch", "SHC_MESG_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullShcMesgId",
						"(SHC_MESG_ID = ? OR SHC_MESG_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("ShcMesgId asc", "SHC_MESG_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("ShcMesgId desc", "SHC_MESG_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalShcHistCode", /* PK attribute */
		"SHC_HIST_CODE = ? ")
				.addFilterBy("filterByShcHistCodeMatch", "SHC_HIST_CODE LIKE ?")
				.addFilterBy("INShcHistCode", "SHC_HIST_CODE IN ( ? ) ") // IN

				.addFilterBy("NOTINShcHistCode", "SHC_HIST_CODE NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalShcHistCode", "SHC_HIST_CODE != ?") // NOTEQUAL

				.addFilterBy(
						"nullShcHistCode",
						"(SHC_HIST_CODE IS NULL OR LENGTH(SHC_HIST_CODE) IS NULL OR LENGTH(SHC_HIST_CODE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullShcHistCode",
						"SHC_HIST_CODE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanShcHistCode", "SHC_HIST_CODE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanShcHistCode", "SHC_HIST_CODE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByShcHistCodeMatch",
						"SHC_HIST_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullShcHistCode",
						"(SHC_HIST_CODE = ? OR SHC_HIST_CODE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("ShcHistCode asc", "SHC_HIST_CODE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("ShcHistCode desc", "SHC_HIST_CODE DESC ") // ORDER
																		// DESCENDING
		;

	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new ShcSmsHistcodeDMLFactory();
		}

		return dml;
	}
}