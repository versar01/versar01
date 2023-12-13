package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.AchActionHistory;

public class AchActionHistoryAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new ActAccTypesAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected AchActionHistoryAbstractDMLFactory() throws DMLException {
		;
		DMLTable table = defTable(
				"AchActionHistory", // DML Name
				"blo.AchActionHistoryDMO", // dmoName
				"ach_action_history", // tableName
				10, // numColumns
				"ACH_SUBSCRIBER_ID, ACH_SIM_NO, ACH_MSISDN_NO, ACH_OPERATION, ACH_VALUE, ACH_ANALYSIS1, ACH_ANALYSIS2, ACH_ANALYSIS3, ACH_STDATETIME, ACH_ENDATETIME", // columnList
				"", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"ACH_SUBSCRIBER_ID, ACH_SIM_NO, ACH_MSISDN_NO, ACH_OPERATION, ACH_VALUE, ACH_ANALYSIS1, ACH_ANALYSIS2, ACH_ANALYSIS3, ACH_STDATETIME, ACH_ENDATETIME",
				"", "", new String[] { "ACH_SUBSCRIBER_ID", "ACH_SIM_NO",
						"ACH_MSISDN_NO", "ACH_OPERATION", "ACH_VALUE",
						"ACH_ANALYSIS1", "ACH_ANALYSIS2", "ACH_ANALYSIS3",
						"ACH_STDATETIME", "ACH_ENDATETIME"}, false);
		table.addFilterBy("equalAchSubscriberId", /* PK attribute */
		"ACH_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByAchSubscriberIdMatch",
						"ACH_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INAchSubscriberId", "ACH_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINAchSubscriberId",
						"ACH_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalAchSubscriberId",
						"ACH_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchSubscriberId",
						"(ACH_SUBSCRIBER_ID IS NULL OR LENGTH(ACH_SUBSCRIBER_ID) IS NULL OR LENGTH(ACH_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullAchSubscriberId",
						"ACH_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchSubscriberId",
						"ACH_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanAchSubscriberId",
						"ACH_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByAchSubscriberIdMatch",
						"ACH_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullAchSubscriberId",
						"(ACH_SUBSCRIBER_ID = ? OR ACH_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchSubscriberId asc", "ACH_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("AchSubscriberId desc", "ACH_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalAchSimNo", /* PK attribute */
		"ACH_SIM_NO = ? ")
				.addFilterBy("filterByAchSimNoMatch", "ACH_SIM_NO LIKE ?")
				.addFilterBy("INAchSimNo", "ACH_SIM_NO IN ( ? ) ")
				// IN

				.addFilterBy("NOTINAchSimNo", "ACH_SIM_NO NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalAchSimNo", "ACH_SIM_NO != ?")
				// NOTEQUAL

				.addFilterBy("nullAchSimNo",
						"(ACH_SIM_NO IS NULL OR LENGTH(ACH_SIM_NO) IS NULL OR LENGTH(ACH_SIM_NO) = 0)") // IS
																										// NULL

				.addFilterBy("notnullAchSimNo", "ACH_SIM_NO IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanAchSimNo", "ACH_SIM_NO < ? ") // LESS THAN

				.addFilterBy("greaterthanAchSimNo", "ACH_SIM_NO > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByAchSimNoMatch", "ACH_SIM_NO LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullAchSimNo",
						"(ACH_SIM_NO = ? OR ACH_SIM_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchSimNo asc", "ACH_SIM_NO ASC ") // ORDER
																// ASCENDING

				.addOrderBy("AchSimNo desc", "ACH_SIM_NO DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalAchMsisdnNo", /* PK attribute */
		"ACH_MSISDN_NO = ? ")
				.addFilterBy("filterByAchMsisdnNoMatch", "ACH_MSISDN_NO LIKE ?")
				.addFilterBy("INAchMsisdnNo", "ACH_MSISDN_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINAchMsisdnNo", "ACH_MSISDN_NO NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalAchMsisdnNo", "ACH_MSISDN_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchMsisdnNo",
						"(ACH_MSISDN_NO IS NULL OR LENGTH(ACH_MSISDN_NO) IS NULL OR LENGTH(ACH_MSISDN_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullAchMsisdnNo",
						"ACH_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchMsisdnNo", "ACH_MSISDN_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanAchMsisdnNo", "ACH_MSISDN_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchMsisdnNoMatch",
						"ACH_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchMsisdnNo",
						"(ACH_MSISDN_NO = ? OR ACH_MSISDN_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchMsisdnNo asc", "ACH_MSISDN_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchMsisdnNo desc", "ACH_MSISDN_NO DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalAchOperation", /* PK attribute */
		"ACH_OPERATION = ? ")
				.addFilterBy("filterByAchOperationMatch",
						"ACH_OPERATION LIKE ?")
				.addFilterBy("INAchOperation", "ACH_OPERATION IN ( ? ) ") // IN

				.addFilterBy("NOTINAchOperation", "ACH_OPERATION NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalAchOperation", "ACH_OPERATION != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchOperation",
						"(ACH_OPERATION IS NULL OR LENGTH(ACH_OPERATION) IS NULL OR LENGTH(ACH_OPERATION) = 0)") // IS
																													// NULL

				.addFilterBy("notnullAchOperation",
						"ACH_OPERATION IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchOperation", "ACH_OPERATION < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanAchOperation", "ACH_OPERATION > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchOperationMatch",
						"ACH_OPERATION LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchOperation",
						"(ACH_OPERATION = ? OR ACH_OPERATION IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchOperation asc", "ACH_OPERATION ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchOperation desc", "ACH_OPERATION DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalAchValue", /* PK attribute */
		"ACH_VALUE = ? ")
				.addFilterBy("filterByAchValueMatch", "ACH_VALUE LIKE ?")
				.addFilterBy("INAchValue", "ACH_VALUE IN ( ? ) ")
				// IN

				.addFilterBy("NOTINAchValue", "ACH_VALUE NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalAchValue", "ACH_VALUE != ?")
				// NOTEQUAL

				.addFilterBy("nullAchValue",
						"(ACH_VALUE IS NULL OR LENGTH(ACH_VALUE) IS NULL OR LENGTH(ACH_VALUE) = 0)") // IS
																										// NULL

				.addFilterBy("notnullAchValue", "ACH_VALUE IS NOT NULL ?") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanAchValue", "ACH_VALUE < ? ") // LESS THAN

				.addFilterBy("greaterthanAchValue", "ACH_VALUE > ? ") // GREATER
																		// THAN

				.addFilterBy("filterByAchValueMatch", "ACH_VALUE LIKE ? ") // LIKE,
																			// BEGINSWITH,
																			// ENDSWITH,
																			// ANY

				.addFilterBy("equalornullAchValue",
						"(ACH_VALUE = ? OR ACH_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchValue asc", "ACH_VALUE ASC ") // ORDER ASCENDING

				.addOrderBy("AchValue desc", "ACH_VALUE DESC ") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalAchAnalysis1", /* PK attribute */
		"ACH_ANALYSIS1 = ? ")
				.addFilterBy("filterByAchAnalysis1Match",
						"ACH_ANALYSIS1 LIKE ?")
				.addFilterBy("INAchAnalysis1", "ACH_ANALYSIS1 IN ( ? ) ") // IN

				.addFilterBy("NOTINAchAnalysis1", "ACH_ANALYSIS1 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalAchAnalysis1", "ACH_ANALYSIS1 != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchAnalysis1",
						"(ACH_ANALYSIS1 IS NULL OR LENGTH(ACH_ANALYSIS1) IS NULL OR LENGTH(ACH_ANALYSIS1) = 0)") // IS
																													// NULL

				.addFilterBy("notnullAchAnalysis1",
						"ACH_ANALYSIS1 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchAnalysis1", "ACH_ANALYSIS1 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanAchAnalysis1", "ACH_ANALYSIS1 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchAnalysis1Match",
						"ACH_ANALYSIS1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchAnalysis1",
						"(ACH_ANALYSIS1 = ? OR ACH_ANALYSIS1 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchAnalysis1 asc", "ACH_ANALYSIS1 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchAnalysis1 desc", "ACH_ANALYSIS1 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalAchAnalysis2", /* PK attribute */
		"ACH_ANALYSIS2 = ? ")
				.addFilterBy("filterByAchAnalysis2Match",
						"ACH_ANALYSIS2 LIKE ?")
				.addFilterBy("INAchAnalysis2", "ACH_ANALYSIS2 IN ( ? ) ") // IN

				.addFilterBy("NOTINAchAnalysis2", "ACH_ANALYSIS2 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalAchAnalysis2", "ACH_ANALYSIS2 != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchAnalysis2",
						"(ACH_ANALYSIS2 IS NULL OR LENGTH(ACH_ANALYSIS2) IS NULL OR LENGTH(ACH_ANALYSIS2) = 0)") // IS
																													// NULL

				.addFilterBy("notnullAchAnalysis2",
						"ACH_ANALYSIS2 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchAnalysis2", "ACH_ANALYSIS2 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanAchAnalysis2", "ACH_ANALYSIS2 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchAnalysis2Match",
						"ACH_ANALYSIS2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchAnalysis2",
						"(ACH_ANALYSIS2 = ? OR ACH_ANALYSIS2 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchAnalysis2 asc", "ACH_ANALYSIS2 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchAnalysis2 desc", "ACH_ANALYSIS2 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalAchAnalysis3", /* PK attribute */
		"ACH_ANALYSIS3 = ? ")
				.addFilterBy("filterByAchAnalysis3Match",
						"ACH_ANALYSIS3 LIKE ?")
				.addFilterBy("INAchAnalysis3", "ACH_ANALYSIS3 IN ( ? ) ") // IN

				.addFilterBy("NOTINAchAnalysis3", "ACH_ANALYSIS3 NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalAchAnalysis3", "ACH_ANALYSIS3 != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchAnalysis3",
						"(ACH_ANALYSIS3 IS NULL OR LENGTH(ACH_ANALYSIS3) IS NULL OR LENGTH(ACH_ANALYSIS3) = 0)") // IS
																													// NULL

				.addFilterBy("notnullAchAnalysis3",
						"ACH_ANALYSIS3 IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchAnalysis3", "ACH_ANALYSIS3 < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanAchAnalysis3", "ACH_ANALYSIS3 > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchAnalysis3Match",
						"ACH_ANALYSIS3 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchAnalysis3",
						"(ACH_ANALYSIS3 = ? OR ACH_ANALYSIS3 IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchAnalysis3 asc", "ACH_ANALYSIS3 ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchAnalysis3 desc", "ACH_ANALYSIS3 DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalAchStdatetime", /* PK attribute */
		"ACH_STDATETIME = ? ")
				.addFilterBy("filterByAchStdatetimeMatch",
						"ACH_STDATETIME LIKE ?")
				.addFilterBy("INAchStdatetime", "ACH_STDATETIME IN ( ? ) ") // IN

				.addFilterBy("NOTINAchStdatetime",
						"ACH_STDATETIME NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalAchStdatetime", "ACH_STDATETIME != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchStdatetime",
						"ACH_STDATETIME IS NULL") // IS
																													// NULL

				.addFilterBy("notnullAchStdatetime",
						"ACH_STDATETIME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchStdatetime", "ACH_STDATETIME < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanAchStdatetime", "ACH_STDATETIME > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchStdatetimeMatch",
						"ACH_STDATETIME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchStdatetime",
						"(ACH_STDATETIME = ? OR ACH_STDATETIME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchStdatetime asc", "ACH_STDATETIME ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchStdatetime desc", "ACH_STDATETIME DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalAchEndatetime", /* PK attribute */
		"ACH_ENDATETIME = ? ")
				.addFilterBy("filterByAchEndatetimeMatch",
						"ACH_ENDATETIME LIKE ?")
				.addFilterBy("INAchEndatetime", "ACH_ENDATETIME IN ( ? ) ") // IN

				.addFilterBy("NOTINAchEndatetime",
						"ACH_ENDATETIME NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalAchEndatetime", "ACH_ENDATETIME != ?") // NOTEQUAL

				.addFilterBy(
						"nullAchEndatetime",
						"ACH_ENDATETIME IS NULL") // IS
																													// NULL

				.addFilterBy("notnullAchEndatetime",
						"ACH_ENDATETIME IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanAchEndatetime", "ACH_ENDATETIME < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanAchEndatetime", "ACH_ENDATETIME > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByAchEndatetimeMatch",
						"ACH_ENDATETIME LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullAchEndatetime",
						"(ACH_ENDATETIME = ? OR ACH_ENDATETIME IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("AchEndatetime asc", "ACH_ENDATETIME ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("AchEndatetime desc", "ACH_ENDATETIME DESC ") // ORDER
																			// DESCENDING
		;
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new AchActionHistoryDMLFactory();
	    }

	    return dml;
	  }

}