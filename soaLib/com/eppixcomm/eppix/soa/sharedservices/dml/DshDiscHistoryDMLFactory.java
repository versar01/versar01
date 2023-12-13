package com.eppixcomm.eppix.soa.sharedservices.dml;

import com.eppixcomm.eppix.base.dml.BaseDMLFactory;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;


public class DshDiscHistoryDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DshDiscHistoryDMLFactory dml = null;


	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new DshDiscHistoryDMLFactory();
		}
		return dml;
	}

	protected DshDiscHistoryDMLFactory() throws DMLException {
		super();
		
		DMLTable table = defTable(
				"DshDiscHistory", // DML Name
				"blo.DshDiscHistoryDMO", // dmoName
				"dsh_disc_history", // tableName
				2, // numColumns
				"DSH_DISC_HIST_ID, DSH_SUBSCRIBER_ID, DSH_ACCOUNT, DSH_DISC_PLAN_ID, DSH_RULE_REF, DSH_RULE_ID, DSH_BAND_ID, DSH_THRESHOLD, DSH_DISCOUNTABLE, DSH_DISC_VALUE, DSH_INVOICE_NO, DSH_TIMESTAMP, ", // columnList
				"", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"DSH_DISC_HIST_ID, DSH_SUBSCRIBER_ID, DSH_ACCOUNT, DSH_DISC_PLAN_ID, DSH_RULE_REF, DSH_RULE_ID, DSH_BAND_ID, DSH_THRESHOLD, DSH_DISCOUNTABLE, DSH_DISC_VALUE, DSH_INVOICE_NO, DSH_TIMESTAMP, ",
				"", "", new String[] { "DSH_DISC_HIST_ID", "DSH_SUBSCRIBER_ID",
						"DSH_ACCOUNT", "DSH_DISC_PLAN_ID", "DSH_RULE_REF",
						"DSH_RULE_ID", "DSH_BAND_ID", "DSH_THRESHOLD",
						"DSH_DISCOUNTABLE", "DSH_DISC_VALUE", "DSH_INVOICE_NO",
						"DSH_TIMESTAMP", }, false);
		table.addFilterBy("equalDshDiscHistId", /* PK attribute */
		"DSH_DISC_HIST_ID = ? ")
				.addFilterBy("filterByDshDiscHistIdMatch",
						"DSH_DISC_HIST_ID LIKE ?")
				.addFilterBy("INDshDiscHistId", "DSH_DISC_HIST_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINDshDiscHistId",
						"DSH_DISC_HIST_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalDshDiscHistId", "DSH_DISC_HIST_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshDiscHistId",
						"(DSH_DISC_HIST_ID IS NULL OR LENGTH(DSH_DISC_HIST_ID) IS NULL OR LENGTH(DSH_DISC_HIST_ID) = 0)") // IS
																															// NULL

				.addFilterBy("notnullDshDiscHistId",
						"DSH_DISC_HIST_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshDiscHistId", "DSH_DISC_HIST_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanDshDiscHistId",
						"DSH_DISC_HIST_ID > ? ") // GREATER THAN

				.addFilterBy("filterByDshDiscHistIdMatch",
						"DSH_DISC_HIST_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDshDiscHistId",
						"(DSH_DISC_HIST_ID = ? OR DSH_DISC_HIST_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshDiscHistId asc", "DSH_DISC_HIST_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("DshDiscHistId desc", "DSH_DISC_HIST_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDshSubscriberId", /* PK attribute */
		"DSH_SUBSCRIBER_ID = ? ")
				.addFilterBy("filterByDshSubscriberIdMatch",
						"DSH_SUBSCRIBER_ID LIKE ?")
				.addFilterBy("INDshSubscriberId", "DSH_SUBSCRIBER_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINDshSubscriberId",
						"DSH_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalDshSubscriberId",
						"DSH_SUBSCRIBER_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshSubscriberId",
						"(DSH_SUBSCRIBER_ID IS NULL OR LENGTH(DSH_SUBSCRIBER_ID) IS NULL OR LENGTH(DSH_SUBSCRIBER_ID) = 0)") // IS
																																// NULL

				.addFilterBy("notnullDshSubscriberId",
						"DSH_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshSubscriberId",
						"DSH_SUBSCRIBER_ID < ? ") // LESS THAN

				.addFilterBy("greaterthanDshSubscriberId",
						"DSH_SUBSCRIBER_ID > ? ") // GREATER THAN

				.addFilterBy("filterByDshSubscriberIdMatch",
						"DSH_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH,
														// ENDSWITH, ANY

				.addFilterBy("equalornullDshSubscriberId",
						"(DSH_SUBSCRIBER_ID = ? OR DSH_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshSubscriberId asc", "DSH_SUBSCRIBER_ID ASC ") // ORDER
																				// ASCENDING

				.addOrderBy("DshSubscriberId desc", "DSH_SUBSCRIBER_ID DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalDshAccount", /* PK attribute */
		"DSH_ACCOUNT = ? ")
				.addFilterBy("filterByDshAccountMatch", "DSH_ACCOUNT LIKE ?")
				.addFilterBy("INDshAccount", "DSH_ACCOUNT IN ( ? ) ")
				// IN

				.addFilterBy("NOTINDshAccount", "DSH_ACCOUNT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalDshAccount", "DSH_ACCOUNT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDshAccount",
						"(DSH_ACCOUNT IS NULL OR LENGTH(DSH_ACCOUNT) IS NULL OR LENGTH(DSH_ACCOUNT) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDshAccount", "DSH_ACCOUNT IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDshAccount", "DSH_ACCOUNT < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanDshAccount", "DSH_ACCOUNT > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByDshAccountMatch", "DSH_ACCOUNT LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDshAccount",
						"(DSH_ACCOUNT = ? OR DSH_ACCOUNT IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshAccount asc", "DSH_ACCOUNT ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("DshAccount desc", "DSH_ACCOUNT DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalDshDiscPlanId", /* PK attribute */
		"DSH_DISC_PLAN_ID = ? ")
				.addFilterBy("filterByDshDiscPlanIdMatch",
						"DSH_DISC_PLAN_ID LIKE ?")
				.addFilterBy("INDshDiscPlanId", "DSH_DISC_PLAN_ID IN ( ? ) ") // IN

				.addFilterBy("NOTINDshDiscPlanId",
						"DSH_DISC_PLAN_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalDshDiscPlanId", "DSH_DISC_PLAN_ID != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshDiscPlanId",
						"(DSH_DISC_PLAN_ID IS NULL OR LENGTH(DSH_DISC_PLAN_ID) IS NULL OR LENGTH(DSH_DISC_PLAN_ID) = 0)") // IS
																															// NULL

				.addFilterBy("notnullDshDiscPlanId",
						"DSH_DISC_PLAN_ID IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshDiscPlanId", "DSH_DISC_PLAN_ID < ? ") // LESS
																				// THAN

				.addFilterBy("greaterthanDshDiscPlanId",
						"DSH_DISC_PLAN_ID > ? ") // GREATER THAN

				.addFilterBy("filterByDshDiscPlanIdMatch",
						"DSH_DISC_PLAN_ID LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDshDiscPlanId",
						"(DSH_DISC_PLAN_ID = ? OR DSH_DISC_PLAN_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshDiscPlanId asc", "DSH_DISC_PLAN_ID ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("DshDiscPlanId desc", "DSH_DISC_PLAN_ID DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDshRuleRef", /* PK attribute */
		"DSH_RULE_REF = ? ")
				.addFilterBy("filterByDshRuleRefMatch", "DSH_RULE_REF LIKE ?")
				.addFilterBy("INDshRuleRef", "DSH_RULE_REF IN ( ? ) ")
				// IN

				.addFilterBy("NOTINDshRuleRef", "DSH_RULE_REF NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalDshRuleRef", "DSH_RULE_REF != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDshRuleRef",
						"(DSH_RULE_REF IS NULL OR LENGTH(DSH_RULE_REF) IS NULL OR LENGTH(DSH_RULE_REF) = 0)") // IS
																												// NULL

				.addFilterBy("notnullDshRuleRef", "DSH_RULE_REF IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDshRuleRef", "DSH_RULE_REF < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanDshRuleRef", "DSH_RULE_REF > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByDshRuleRefMatch", "DSH_RULE_REF LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDshRuleRef",
						"(DSH_RULE_REF = ? OR DSH_RULE_REF IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshRuleRef asc", "DSH_RULE_REF ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("DshRuleRef desc", "DSH_RULE_REF DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalDshRuleId", /* PK attribute */
		"DSH_RULE_ID = ? ")
				.addFilterBy("filterByDshRuleIdMatch", "DSH_RULE_ID LIKE ?")
				.addFilterBy("INDshRuleId", "DSH_RULE_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINDshRuleId", "DSH_RULE_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalDshRuleId", "DSH_RULE_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDshRuleId",
						"(DSH_RULE_ID IS NULL OR LENGTH(DSH_RULE_ID) IS NULL OR LENGTH(DSH_RULE_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDshRuleId", "DSH_RULE_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDshRuleId", "DSH_RULE_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanDshRuleId", "DSH_RULE_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByDshRuleIdMatch", "DSH_RULE_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDshRuleId",
						"(DSH_RULE_ID = ? OR DSH_RULE_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshRuleId asc", "DSH_RULE_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("DshRuleId desc", "DSH_RULE_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalDshBandId", /* PK attribute */
		"DSH_BAND_ID = ? ")
				.addFilterBy("filterByDshBandIdMatch", "DSH_BAND_ID LIKE ?")
				.addFilterBy("INDshBandId", "DSH_BAND_ID IN ( ? ) ")
				// IN

				.addFilterBy("NOTINDshBandId", "DSH_BAND_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalDshBandId", "DSH_BAND_ID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDshBandId",
						"(DSH_BAND_ID IS NULL OR LENGTH(DSH_BAND_ID) IS NULL OR LENGTH(DSH_BAND_ID) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDshBandId", "DSH_BAND_ID IS NOT NULL ?") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDshBandId", "DSH_BAND_ID < ? ") // LESS
																		// THAN

				.addFilterBy("greaterthanDshBandId", "DSH_BAND_ID > ? ") // GREATER
																			// THAN

				.addFilterBy("filterByDshBandIdMatch", "DSH_BAND_ID LIKE ? ") // LIKE,
																				// BEGINSWITH,
																				// ENDSWITH,
																				// ANY

				.addFilterBy("equalornullDshBandId",
						"(DSH_BAND_ID = ? OR DSH_BAND_ID IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshBandId asc", "DSH_BAND_ID ASC ") // ORDER
																	// ASCENDING

				.addOrderBy("DshBandId desc", "DSH_BAND_ID DESC ") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalDshThreshold", /* PK attribute */
		"DSH_THRESHOLD = ? ")
				.addFilterBy("filterByDshThresholdMatch",
						"DSH_THRESHOLD LIKE ?")
				.addFilterBy("INDshThreshold", "DSH_THRESHOLD IN ( ? ) ") // IN

				.addFilterBy("NOTINDshThreshold", "DSH_THRESHOLD NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalDshThreshold", "DSH_THRESHOLD != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshThreshold",
						"(DSH_THRESHOLD IS NULL OR LENGTH(DSH_THRESHOLD) IS NULL OR LENGTH(DSH_THRESHOLD) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDshThreshold",
						"DSH_THRESHOLD IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshThreshold", "DSH_THRESHOLD < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanDshThreshold", "DSH_THRESHOLD > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByDshThresholdMatch",
						"DSH_THRESHOLD LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullDshThreshold",
						"(DSH_THRESHOLD = ? OR DSH_THRESHOLD IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshThreshold asc", "DSH_THRESHOLD ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("DshThreshold desc", "DSH_THRESHOLD DESC ") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalDshDiscountable", /* PK attribute */
		"DSH_DISCOUNTABLE = ? ")
				.addFilterBy("filterByDshDiscountableMatch",
						"DSH_DISCOUNTABLE LIKE ?")
				.addFilterBy("INDshDiscountable", "DSH_DISCOUNTABLE IN ( ? ) ") // IN

				.addFilterBy("NOTINDshDiscountable",
						"DSH_DISCOUNTABLE NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalDshDiscountable", "DSH_DISCOUNTABLE != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshDiscountable",
						"(DSH_DISCOUNTABLE IS NULL OR LENGTH(DSH_DISCOUNTABLE) IS NULL OR LENGTH(DSH_DISCOUNTABLE) = 0)") // IS
																															// NULL

				.addFilterBy("notnullDshDiscountable",
						"DSH_DISCOUNTABLE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshDiscountable", "DSH_DISCOUNTABLE < ? ") // LESS
																					// THAN

				.addFilterBy("greaterthanDshDiscountable",
						"DSH_DISCOUNTABLE > ? ") // GREATER THAN

				.addFilterBy("filterByDshDiscountableMatch",
						"DSH_DISCOUNTABLE LIKE ? ") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDshDiscountable",
						"(DSH_DISCOUNTABLE = ? OR DSH_DISCOUNTABLE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshDiscountable asc", "DSH_DISCOUNTABLE ASC ") // ORDER
																			// ASCENDING

				.addOrderBy("DshDiscountable desc", "DSH_DISCOUNTABLE DESC ") // ORDER
																				// DESCENDING
		;

		table.addFilterBy("equalDshDiscValue", /* PK attribute */
		"DSH_DISC_VALUE = ? ")
				.addFilterBy("filterByDshDiscValueMatch",
						"DSH_DISC_VALUE LIKE ?")
				.addFilterBy("INDshDiscValue", "DSH_DISC_VALUE IN ( ? ) ") // IN

				.addFilterBy("NOTINDshDiscValue", "DSH_DISC_VALUE NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalDshDiscValue", "DSH_DISC_VALUE != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshDiscValue",
						"(DSH_DISC_VALUE IS NULL OR LENGTH(DSH_DISC_VALUE) IS NULL OR LENGTH(DSH_DISC_VALUE) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDshDiscValue",
						"DSH_DISC_VALUE IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshDiscValue", "DSH_DISC_VALUE < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanDshDiscValue", "DSH_DISC_VALUE > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByDshDiscValueMatch",
						"DSH_DISC_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullDshDiscValue",
						"(DSH_DISC_VALUE = ? OR DSH_DISC_VALUE IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshDiscValue asc", "DSH_DISC_VALUE ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("DshDiscValue desc", "DSH_DISC_VALUE DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDshInvoiceNo", /* PK attribute */
		"DSH_INVOICE_NO = ? ")
				.addFilterBy("filterByDshInvoiceNoMatch",
						"DSH_INVOICE_NO LIKE ?")
				.addFilterBy("INDshInvoiceNo", "DSH_INVOICE_NO IN ( ? ) ") // IN

				.addFilterBy("NOTINDshInvoiceNo", "DSH_INVOICE_NO NOT IN ( ? )") // NOT
																					// IN

				.addFilterBy("notequalDshInvoiceNo", "DSH_INVOICE_NO != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshInvoiceNo",
						"(DSH_INVOICE_NO IS NULL OR LENGTH(DSH_INVOICE_NO) IS NULL OR LENGTH(DSH_INVOICE_NO) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDshInvoiceNo",
						"DSH_INVOICE_NO IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshInvoiceNo", "DSH_INVOICE_NO < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanDshInvoiceNo", "DSH_INVOICE_NO > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByDshInvoiceNoMatch",
						"DSH_INVOICE_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullDshInvoiceNo",
						"(DSH_INVOICE_NO = ? OR DSH_INVOICE_NO IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshInvoiceNo asc", "DSH_INVOICE_NO ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("DshInvoiceNo desc", "DSH_INVOICE_NO DESC ") // ORDER
																			// DESCENDING
		;

		table.addFilterBy("equalDshTimestamp", /* PK attribute */
		"DSH_TIMESTAMP = ? ")
				.addFilterBy("filterByDshTimestampMatch",
						"DSH_TIMESTAMP LIKE ?")
				.addFilterBy("INDshTimestamp", "DSH_TIMESTAMP IN ( ? ) ") // IN

				.addFilterBy("NOTINDshTimestamp", "DSH_TIMESTAMP NOT IN ( ? )") // NOT
																				// IN

				.addFilterBy("notequalDshTimestamp", "DSH_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy(
						"nullDshTimestamp",
						"(DSH_TIMESTAMP IS NULL OR LENGTH(DSH_TIMESTAMP) IS NULL OR LENGTH(DSH_TIMESTAMP) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDshTimestamp",
						"DSH_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

				.addFilterBy("lessthanDshTimestamp", "DSH_TIMESTAMP < ? ") // LESS
																			// THAN

				.addFilterBy("greaterthanDshTimestamp", "DSH_TIMESTAMP > ? ") // GREATER
																				// THAN

				.addFilterBy("filterByDshTimestampMatch",
						"DSH_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("equalornullDshTimestamp",
						"(DSH_TIMESTAMP = ? OR DSH_TIMESTAMP IS NULL) ") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("DshTimestamp asc", "DSH_TIMESTAMP ASC ") // ORDER
																		// ASCENDING

				.addOrderBy("DshTimestamp desc", "DSH_TIMESTAMP DESC ") // ORDER
																		// DESCENDING
		;

	}

}
