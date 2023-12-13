/*


 */

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;

//import com.eppixcomm.eppix.common.dml.DMLException;
//import com.eppixcomm.eppix.common.dml.DMLFactory;
//import com.eppixcomm.eppix.common.dml.DMLTabl;

/**
 * This is the DMLFactory for Dealers.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DealersAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DealersAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected DealersAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"Dealers", // dmlName
				"blo.DealersDMO", // dmoName
				"DEALERS", // tableName
				38, // numColumns
				"DEALER_ID, PL_ACC_NO, COMM_PLAN, DEAL_TYPE, ACTIV_MTD, DEACT_MTD, REVEN_MTD, ACTIV_YTD, DEACT_YTD"
						+ ", ITEMI_YTD, REVEN_YTD, COMMI_YTD, ACTIV_CUM, DEACT_CUM, ITEMI_CUM, REVEN_CUM, COMMI_CUM, LAST_COMM"
						+ ", BARR_INDI, CLAW_BAC1, CLAW_BAC2, DEALER_NL, QUAL_PERIOD, QBONUSYTD, DATE_CREATED, CLAW_INT1, CLAW_VAL1"
						+ ", CLAW_INT2, CLAW_VAL2, EPOS_FLAG, ACC_MIN_QTY, ACC_CURR_QTY, ACC_SHIP_QTY, REGION, DEALER_GROUP, DEALER_DIRECT, DEALER_ACTIVE, DEALER_INACTIVE", // columnList
				"(DEALER_ID)", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"DEALER_ID, PL_ACC_NO, COMM_PLAN, DEAL_TYPE, ACTIV_MTD, DEACT_MTD, REVEN_MTD, ACTIV_YTD, DEACT_YTD"
						+ ", ITEMI_YTD, REVEN_YTD, COMMI_YTD, ACTIV_CUM, DEACT_CUM, ITEMI_CUM, REVEN_CUM, COMMI_CUM, LAST_COMM"
						+ ", BARR_INDI, CLAW_BAC1, CLAW_BAC2, DEALER_NL, QUAL_PERIOD, QBONUSYTD, DATE_CREATED, CLAW_INT1, CLAW_VAL1"
						+ ", CLAW_INT2, CLAW_VAL2, EPOS_FLAG, ACC_MIN_QTY, ACC_CURR_QTY, ACC_SHIP_QTY, REGION, DEALER_GROUP, DEALER_DIRECT, DEALER_ACTIVE, DEALER_INACTIVE",
				"", "", new String[] { "DEALER_ID", "PL_ACC_NO", "COMM_PLAN",
						"DEAL_TYPE", "ACTIV_MTD", "DEACT_MTD", "REVEN_MTD",
						"ACTIV_YTD", "DEACT_YTD", "ITEMI_YTD", "REVEN_YTD",
						"COMMI_YTD", "ACTIV_CUM", "DEACT_CUM", "ITEMI_CUM",
						"REVEN_CUM", "COMMI_CUM", "LAST_COMM", "BARR_INDI",
						"CLAW_BAC1", "CLAW_BAC2", "DEALER_NL", "QUAL_PERIOD",
						"QBONUSYTD", "DATE_CREATED", "CLAW_INT1", "CLAW_VAL1",
						"CLAW_INT2", "CLAW_VAL2", "EPOS_FLAG", "ACC_MIN_QTY",
						"ACC_CURR_QTY", "ACC_SHIP_QTY", "REGION",
						"DEALER_GROUP", "DEALER_DIRECT", "DEALER_ACTIVE",
						"DEALER_INACTIVE" });

		table.addFilterBy("equalDealerId", /* PK attribute */
		"(DEALER_ID) = ?").addFilterBy("filterByDealerIdMatch",
				"DEALER_ID LIKE ?")
				.addFilterBy("INDealerId", "(DEALER_ID) IN ( ? )")
				// IN

				.addFilterBy("NOTINDealerId", "(DEALER_ID) NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalDealerId", "(DEALER_ID) != ?")
				// NOTEQUAL

				.addFilterBy("nullDealerId",
						"(DEALER_ID IS NULL OR LENGTH((DEALER_ID)) IS NULL OR LENGTH((DEALER_ID)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDealerId", "DEALER_ID IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDealerId", "DEALER_ID < ?") // LESS THAN

				.addFilterBy("greaterthanDealerId", "DEALER_ID > ?") // GREATER
																		// THAN

				.addFilterBy("filterByDealerIdMatch", "DEALER_ID LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullDealerId",
						"((DEALER_ID) = ? OR DEALER_ID IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a ()

				.addOrderBy("DealerIdasc", "DEALER_ID ASC") // ORDER ASCENDING

				.addOrderBy("DealerIddesc", "DEALER_ID DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalPlAccNo", "(PL_ACC_NO) = ?")
				// EQUAL

				.addFilterBy("notequalPlAccNo", "(PL_ACC_NO) != ?")
				// NOTEQUAL

				.addFilterBy("nullPlAccNo",
						"(PL_ACC_NO IS NULL OR LENGTH((PL_ACC_NO)) IS NULL OR LENGTH((PL_ACC_NO)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullPlAccNo", "PL_ACC_NO IS NOT NULL") // IS
																		// NOT
																		// NULL

				.addFilterBy("lessthanPlAccNo", "PL_ACC_NO < ?") // LESS THAN

				.addFilterBy("greaterthanPlAccNo", "PL_ACC_NO > ?") // GREATER
																	// THAN

				.addFilterBy("filterByPlAccNoMatch", "PL_ACC_NO LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullPlAccNo",
						"((PL_ACC_NO) = ? OR PL_ACC_NO IS NULL)") // EQUALORNULL

				.addFilterBy("INPlAccNo", "(PL_ACC_NO) IN ( ? )") // IN

				.addFilterBy("NOTINPlAccNo", "(PL_ACC_NO) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("PlAccNoasc", "PL_ACC_NO ASC") // ORDER ASCENDING

				.addOrderBy("PlAccNodesc", "PL_ACC_NO DESC") // ORDER DESCENDING
		;

		table
				.addFilterBy("equalCommPlan", "(COMM_PLAN) = ?")
				// EQUAL

				.addFilterBy("notequalCommPlan", "(COMM_PLAN) != ?")
				// NOTEQUAL

				.addFilterBy("nullCommPlan",
						"(COMM_PLAN IS NULL OR LENGTH((COMM_PLAN)) IS NULL OR LENGTH((COMM_PLAN)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullCommPlan", "COMM_PLAN IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanCommPlan", "COMM_PLAN < ?") // LESS THAN

				.addFilterBy("greaterthanCommPlan", "COMM_PLAN > ?") // GREATER
																		// THAN

				.addFilterBy("filterByCommPlanMatch", "COMM_PLAN LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullCommPlan",
						"((COMM_PLAN) = ? OR COMM_PLAN IS NULL)") // EQUALORNULL

				.addFilterBy("INCommPlan", "(COMM_PLAN) IN ( ? )") // IN

				.addFilterBy("NOTINCommPlan", "(COMM_PLAN) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("CommPlanasc", "COMM_PLAN ASC") // ORDER ASCENDING

				.addOrderBy("CommPlandesc", "COMM_PLAN DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalDealType", "(DEAL_TYPE) = ?")
				// EQUAL

				.addFilterBy("notequalDealType", "(DEAL_TYPE) != ?")
				// NOTEQUAL

				.addFilterBy("nullDealType",
						"(DEAL_TYPE IS NULL OR LENGTH((DEAL_TYPE)) IS NULL OR LENGTH((DEAL_TYPE)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDealType", "DEAL_TYPE IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDealType", "DEAL_TYPE < ?") // LESS THAN

				.addFilterBy("greaterthanDealType", "DEAL_TYPE > ?") // GREATER
																		// THAN

				.addFilterBy("filterByDealTypeMatch", "DEAL_TYPE LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullDealType",
						"((DEAL_TYPE) = ? OR DEAL_TYPE IS NULL)") // EQUALORNULL

				.addFilterBy("INDealType", "(DEAL_TYPE) IN ( ? )") // IN

				.addFilterBy("NOTINDealType", "(DEAL_TYPE) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DealTypeasc", "DEAL_TYPE ASC") // ORDER ASCENDING

				.addOrderBy("DealTypedesc", "DEAL_TYPE DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalActivMtd", "ACTIV_MTD = ?") // EQUAL

				.addFilterBy("notequalActivMtd", "ACTIV_MTD != ?") // NOTEQUAL

				.addFilterBy("nullActivMtd", "ACTIV_MTD IS NULL") // IS NULL

				.addFilterBy("notnullActivMtd", "ACTIV_MTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanActivMtd", "ACTIV_MTD < ?") // LESS THAN

				.addFilterBy("greaterthanActivMtd", "ACTIV_MTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalActivMtd", "ACTIV_MTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalActivMtd", "ACTIV_MTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByActivMtdMatch", "ACTIV_MTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenActivMtd", "ACTIV_MTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullActivMtd",
						"(ACTIV_MTD IS NULL OR ACTIV_MTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullActivMtd",
						"(ACTIV_MTD IS NULL OR ACTIV_MTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullActivMtd",
						"(ACTIV_MTD IS NULL OR ACTIV_MTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INActivMtd", "ACTIV_MTD IN ( ? )") // IN

				.addFilterBy("NOTINActivMtd", "ACTIV_MTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ActivMtdasc", "ACTIV_MTD ASC") // ORDER ASCENDING

				.addOrderBy("ActivMtddesc", "ACTIV_MTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalDeactMtd", "DEACT_MTD = ?") // EQUAL

				.addFilterBy("notequalDeactMtd", "DEACT_MTD != ?") // NOTEQUAL

				.addFilterBy("nullDeactMtd", "DEACT_MTD IS NULL") // IS NULL

				.addFilterBy("notnullDeactMtd", "DEACT_MTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDeactMtd", "DEACT_MTD < ?") // LESS THAN

				.addFilterBy("greaterthanDeactMtd", "DEACT_MTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalDeactMtd", "DEACT_MTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalDeactMtd", "DEACT_MTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByDeactMtdMatch", "DEACT_MTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenDeactMtd", "DEACT_MTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDeactMtd",
						"(DEACT_MTD IS NULL OR DEACT_MTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDeactMtd",
						"(DEACT_MTD IS NULL OR DEACT_MTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDeactMtd",
						"(DEACT_MTD IS NULL OR DEACT_MTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INDeactMtd", "DEACT_MTD IN ( ? )") // IN

				.addFilterBy("NOTINDeactMtd", "DEACT_MTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("DeactMtdasc", "DEACT_MTD ASC") // ORDER ASCENDING

				.addOrderBy("DeactMtddesc", "DEACT_MTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalRevenMtd", "REVEN_MTD = ?") // EQUAL

				.addFilterBy("notequalRevenMtd", "REVEN_MTD != ?") // NOTEQUAL

				.addFilterBy("nullRevenMtd", "REVEN_MTD IS NULL") // IS NULL

				.addFilterBy("notnullRevenMtd", "REVEN_MTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanRevenMtd", "REVEN_MTD < ?") // LESS THAN

				.addFilterBy("greaterthanRevenMtd", "REVEN_MTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalRevenMtd", "REVEN_MTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalRevenMtd", "REVEN_MTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByRevenMtdMatch", "REVEN_MTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenRevenMtd", "REVEN_MTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullRevenMtd",
						"(REVEN_MTD IS NULL OR REVEN_MTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullRevenMtd",
						"(REVEN_MTD IS NULL OR REVEN_MTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullRevenMtd",
						"(REVEN_MTD IS NULL OR REVEN_MTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INRevenMtd", "REVEN_MTD IN ( ? )") // IN

				.addFilterBy("NOTINRevenMtd", "REVEN_MTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("RevenMtdasc", "REVEN_MTD ASC") // ORDER ASCENDING

				.addOrderBy("RevenMtddesc", "REVEN_MTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalActivYtd", "ACTIV_YTD = ?") // EQUAL

				.addFilterBy("notequalActivYtd", "ACTIV_YTD != ?") // NOTEQUAL

				.addFilterBy("nullActivYtd", "ACTIV_YTD IS NULL") // IS NULL

				.addFilterBy("notnullActivYtd", "ACTIV_YTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanActivYtd", "ACTIV_YTD < ?") // LESS THAN

				.addFilterBy("greaterthanActivYtd", "ACTIV_YTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalActivYtd", "ACTIV_YTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalActivYtd", "ACTIV_YTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByActivYtdMatch", "ACTIV_YTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenActivYtd", "ACTIV_YTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullActivYtd",
						"(ACTIV_YTD IS NULL OR ACTIV_YTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullActivYtd",
						"(ACTIV_YTD IS NULL OR ACTIV_YTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullActivYtd",
						"(ACTIV_YTD IS NULL OR ACTIV_YTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INActivYtd", "ACTIV_YTD IN ( ? )") // IN

				.addFilterBy("NOTINActivYtd", "ACTIV_YTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ActivYtdasc", "ACTIV_YTD ASC") // ORDER ASCENDING

				.addOrderBy("ActivYtddesc", "ACTIV_YTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalDeactYtd", "DEACT_YTD = ?") // EQUAL

				.addFilterBy("notequalDeactYtd", "DEACT_YTD != ?") // NOTEQUAL

				.addFilterBy("nullDeactYtd", "DEACT_YTD IS NULL") // IS NULL

				.addFilterBy("notnullDeactYtd", "DEACT_YTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDeactYtd", "DEACT_YTD < ?") // LESS THAN

				.addFilterBy("greaterthanDeactYtd", "DEACT_YTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalDeactYtd", "DEACT_YTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalDeactYtd", "DEACT_YTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByDeactYtdMatch", "DEACT_YTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenDeactYtd", "DEACT_YTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDeactYtd",
						"(DEACT_YTD IS NULL OR DEACT_YTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDeactYtd",
						"(DEACT_YTD IS NULL OR DEACT_YTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDeactYtd",
						"(DEACT_YTD IS NULL OR DEACT_YTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INDeactYtd", "DEACT_YTD IN ( ? )") // IN

				.addFilterBy("NOTINDeactYtd", "DEACT_YTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("DeactYtdasc", "DEACT_YTD ASC") // ORDER ASCENDING

				.addOrderBy("DeactYtddesc", "DEACT_YTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalItemiYtd", "ITEMI_YTD = ?") // EQUAL

				.addFilterBy("notequalItemiYtd", "ITEMI_YTD != ?") // NOTEQUAL

				.addFilterBy("nullItemiYtd", "ITEMI_YTD IS NULL") // IS NULL

				.addFilterBy("notnullItemiYtd", "ITEMI_YTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanItemiYtd", "ITEMI_YTD < ?") // LESS THAN

				.addFilterBy("greaterthanItemiYtd", "ITEMI_YTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalItemiYtd", "ITEMI_YTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalItemiYtd", "ITEMI_YTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByItemiYtdMatch", "ITEMI_YTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenItemiYtd", "ITEMI_YTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullItemiYtd",
						"(ITEMI_YTD IS NULL OR ITEMI_YTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullItemiYtd",
						"(ITEMI_YTD IS NULL OR ITEMI_YTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullItemiYtd",
						"(ITEMI_YTD IS NULL OR ITEMI_YTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INItemiYtd", "ITEMI_YTD IN ( ? )") // IN

				.addFilterBy("NOTINItemiYtd", "ITEMI_YTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ItemiYtdasc", "ITEMI_YTD ASC") // ORDER ASCENDING

				.addOrderBy("ItemiYtddesc", "ITEMI_YTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalRevenYtd", "REVEN_YTD = ?") // EQUAL

				.addFilterBy("notequalRevenYtd", "REVEN_YTD != ?") // NOTEQUAL

				.addFilterBy("nullRevenYtd", "REVEN_YTD IS NULL") // IS NULL

				.addFilterBy("notnullRevenYtd", "REVEN_YTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanRevenYtd", "REVEN_YTD < ?") // LESS THAN

				.addFilterBy("greaterthanRevenYtd", "REVEN_YTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalRevenYtd", "REVEN_YTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalRevenYtd", "REVEN_YTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByRevenYtdMatch", "REVEN_YTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenRevenYtd", "REVEN_YTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullRevenYtd",
						"(REVEN_YTD IS NULL OR REVEN_YTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullRevenYtd",
						"(REVEN_YTD IS NULL OR REVEN_YTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullRevenYtd",
						"(REVEN_YTD IS NULL OR REVEN_YTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INRevenYtd", "REVEN_YTD IN ( ? )") // IN

				.addFilterBy("NOTINRevenYtd", "REVEN_YTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("RevenYtdasc", "REVEN_YTD ASC") // ORDER ASCENDING

				.addOrderBy("RevenYtddesc", "REVEN_YTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalCommiYtd", "COMMI_YTD = ?") // EQUAL

				.addFilterBy("notequalCommiYtd", "COMMI_YTD != ?") // NOTEQUAL

				.addFilterBy("nullCommiYtd", "COMMI_YTD IS NULL") // IS NULL

				.addFilterBy("notnullCommiYtd", "COMMI_YTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanCommiYtd", "COMMI_YTD < ?") // LESS THAN

				.addFilterBy("greaterthanCommiYtd", "COMMI_YTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalCommiYtd", "COMMI_YTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalCommiYtd", "COMMI_YTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByCommiYtdMatch", "COMMI_YTD LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenCommiYtd", "COMMI_YTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullCommiYtd",
						"(COMMI_YTD IS NULL OR COMMI_YTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullCommiYtd",
						"(COMMI_YTD IS NULL OR COMMI_YTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullCommiYtd",
						"(COMMI_YTD IS NULL OR COMMI_YTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INCommiYtd", "COMMI_YTD IN ( ? )") // IN

				.addFilterBy("NOTINCommiYtd", "COMMI_YTD NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("CommiYtdasc", "COMMI_YTD ASC") // ORDER ASCENDING

				.addOrderBy("CommiYtddesc", "COMMI_YTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalActivCum", "ACTIV_CUM = ?") // EQUAL

				.addFilterBy("notequalActivCum", "ACTIV_CUM != ?") // NOTEQUAL

				.addFilterBy("nullActivCum", "ACTIV_CUM IS NULL") // IS NULL

				.addFilterBy("notnullActivCum", "ACTIV_CUM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanActivCum", "ACTIV_CUM < ?") // LESS THAN

				.addFilterBy("greaterthanActivCum", "ACTIV_CUM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalActivCum", "ACTIV_CUM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalActivCum", "ACTIV_CUM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByActivCumMatch", "ACTIV_CUM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenActivCum", "ACTIV_CUM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullActivCum",
						"(ACTIV_CUM IS NULL OR ACTIV_CUM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullActivCum",
						"(ACTIV_CUM IS NULL OR ACTIV_CUM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullActivCum",
						"(ACTIV_CUM IS NULL OR ACTIV_CUM > ?)") // GREATERTHANORNULL

				.addFilterBy("INActivCum", "ACTIV_CUM IN ( ? )") // IN

				.addFilterBy("NOTINActivCum", "ACTIV_CUM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ActivCumasc", "ACTIV_CUM ASC") // ORDER ASCENDING

				.addOrderBy("ActivCumdesc", "ACTIV_CUM DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalDeactCum", "DEACT_CUM = ?") // EQUAL

				.addFilterBy("notequalDeactCum", "DEACT_CUM != ?") // NOTEQUAL

				.addFilterBy("nullDeactCum", "DEACT_CUM IS NULL") // IS NULL

				.addFilterBy("notnullDeactCum", "DEACT_CUM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDeactCum", "DEACT_CUM < ?") // LESS THAN

				.addFilterBy("greaterthanDeactCum", "DEACT_CUM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalDeactCum", "DEACT_CUM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalDeactCum", "DEACT_CUM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByDeactCumMatch", "DEACT_CUM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenDeactCum", "DEACT_CUM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDeactCum",
						"(DEACT_CUM IS NULL OR DEACT_CUM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDeactCum",
						"(DEACT_CUM IS NULL OR DEACT_CUM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDeactCum",
						"(DEACT_CUM IS NULL OR DEACT_CUM > ?)") // GREATERTHANORNULL

				.addFilterBy("INDeactCum", "DEACT_CUM IN ( ? )") // IN

				.addFilterBy("NOTINDeactCum", "DEACT_CUM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("DeactCumasc", "DEACT_CUM ASC") // ORDER ASCENDING

				.addOrderBy("DeactCumdesc", "DEACT_CUM DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalItemiCum", "ITEMI_CUM = ?") // EQUAL

				.addFilterBy("notequalItemiCum", "ITEMI_CUM != ?") // NOTEQUAL

				.addFilterBy("nullItemiCum", "ITEMI_CUM IS NULL") // IS NULL

				.addFilterBy("notnullItemiCum", "ITEMI_CUM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanItemiCum", "ITEMI_CUM < ?") // LESS THAN

				.addFilterBy("greaterthanItemiCum", "ITEMI_CUM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalItemiCum", "ITEMI_CUM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalItemiCum", "ITEMI_CUM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByItemiCumMatch", "ITEMI_CUM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenItemiCum", "ITEMI_CUM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullItemiCum",
						"(ITEMI_CUM IS NULL OR ITEMI_CUM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullItemiCum",
						"(ITEMI_CUM IS NULL OR ITEMI_CUM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullItemiCum",
						"(ITEMI_CUM IS NULL OR ITEMI_CUM > ?)") // GREATERTHANORNULL

				.addFilterBy("INItemiCum", "ITEMI_CUM IN ( ? )") // IN

				.addFilterBy("NOTINItemiCum", "ITEMI_CUM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ItemiCumasc", "ITEMI_CUM ASC") // ORDER ASCENDING

				.addOrderBy("ItemiCumdesc", "ITEMI_CUM DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalRevenCum", "REVEN_CUM = ?") // EQUAL

				.addFilterBy("notequalRevenCum", "REVEN_CUM != ?") // NOTEQUAL

				.addFilterBy("nullRevenCum", "REVEN_CUM IS NULL") // IS NULL

				.addFilterBy("notnullRevenCum", "REVEN_CUM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanRevenCum", "REVEN_CUM < ?") // LESS THAN

				.addFilterBy("greaterthanRevenCum", "REVEN_CUM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalRevenCum", "REVEN_CUM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalRevenCum", "REVEN_CUM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByRevenCumMatch", "REVEN_CUM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenRevenCum", "REVEN_CUM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullRevenCum",
						"(REVEN_CUM IS NULL OR REVEN_CUM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullRevenCum",
						"(REVEN_CUM IS NULL OR REVEN_CUM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullRevenCum",
						"(REVEN_CUM IS NULL OR REVEN_CUM > ?)") // GREATERTHANORNULL

				.addFilterBy("INRevenCum", "REVEN_CUM IN ( ? )") // IN

				.addFilterBy("NOTINRevenCum", "REVEN_CUM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("RevenCumasc", "REVEN_CUM ASC") // ORDER ASCENDING

				.addOrderBy("RevenCumdesc", "REVEN_CUM DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalCommiCum", "COMMI_CUM = ?") // EQUAL

				.addFilterBy("notequalCommiCum", "COMMI_CUM != ?") // NOTEQUAL

				.addFilterBy("nullCommiCum", "COMMI_CUM IS NULL") // IS NULL

				.addFilterBy("notnullCommiCum", "COMMI_CUM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanCommiCum", "COMMI_CUM < ?") // LESS THAN

				.addFilterBy("greaterthanCommiCum", "COMMI_CUM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalCommiCum", "COMMI_CUM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalCommiCum", "COMMI_CUM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByCommiCumMatch", "COMMI_CUM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenCommiCum", "COMMI_CUM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullCommiCum",
						"(COMMI_CUM IS NULL OR COMMI_CUM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullCommiCum",
						"(COMMI_CUM IS NULL OR COMMI_CUM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullCommiCum",
						"(COMMI_CUM IS NULL OR COMMI_CUM > ?)") // GREATERTHANORNULL

				.addFilterBy("INCommiCum", "COMMI_CUM IN ( ? )") // IN

				.addFilterBy("NOTINCommiCum", "COMMI_CUM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("CommiCumasc", "COMMI_CUM ASC") // ORDER ASCENDING

				.addOrderBy("CommiCumdesc", "COMMI_CUM DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalLastComm", "LAST_COMM = ?") // EQUAL

				.addFilterBy("notequalLastComm", "LAST_COMM != ?") // NOTEQUAL

				.addFilterBy("nullLastComm", "LAST_COMM IS NULL") // IS NULL

				.addFilterBy("notnullLastComm", "LAST_COMM IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanLastComm", "LAST_COMM < ?") // LESS THAN

				.addFilterBy("greaterthanLastComm", "LAST_COMM > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalLastComm", "LAST_COMM <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalLastComm", "LAST_COMM >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByLastCommMatch", "LAST_COMM LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenLastComm", "LAST_COMM BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullLastComm",
						"(LAST_COMM IS NULL OR LAST_COMM = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullLastComm",
						"(LAST_COMM IS NULL OR LAST_COMM < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullLastComm",
						"(LAST_COMM IS NULL OR LAST_COMM > ?)") // GREATERTHANORNULL

				.addFilterBy("INLastComm", "LAST_COMM IN ( ? )") // IN

				.addFilterBy("NOTINLastComm", "LAST_COMM NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("LastCommasc", "LAST_COMM ASC") // ORDER ASCENDING

				.addOrderBy("LastCommdesc", "LAST_COMM DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalBarrIndi", "(BARR_INDI) = ?")
				// EQUAL

				.addFilterBy("notequalBarrIndi", "(BARR_INDI) != ?")
				// NOTEQUAL

				.addFilterBy("nullBarrIndi",
						"(BARR_INDI IS NULL OR LENGTH((BARR_INDI)) IS NULL OR LENGTH((BARR_INDI)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullBarrIndi", "BARR_INDI IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanBarrIndi", "BARR_INDI < ?") // LESS THAN

				.addFilterBy("greaterthanBarrIndi", "BARR_INDI > ?") // GREATER
																		// THAN

				.addFilterBy("filterByBarrIndiMatch", "BARR_INDI LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullBarrIndi",
						"((BARR_INDI) = ? OR BARR_INDI IS NULL)") // EQUALORNULL

				.addFilterBy("INBarrIndi", "(BARR_INDI) IN ( ? )") // IN

				.addFilterBy("NOTINBarrIndi", "(BARR_INDI) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("BarrIndiasc", "BARR_INDI ASC") // ORDER ASCENDING

				.addOrderBy("BarrIndidesc", "BARR_INDI DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalClawBac1", "CLAW_BAC1 = ?") // EQUAL

				.addFilterBy("notequalClawBac1", "CLAW_BAC1 != ?") // NOTEQUAL

				.addFilterBy("nullClawBac1", "CLAW_BAC1 IS NULL") // IS NULL

				.addFilterBy("notnullClawBac1", "CLAW_BAC1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawBac1", "CLAW_BAC1 < ?") // LESS THAN

				.addFilterBy("greaterthanClawBac1", "CLAW_BAC1 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawBac1", "CLAW_BAC1 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawBac1", "CLAW_BAC1 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawBac1Match", "CLAW_BAC1 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawBac1", "CLAW_BAC1 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawBac1",
						"(CLAW_BAC1 IS NULL OR CLAW_BAC1 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawBac1",
						"(CLAW_BAC1 IS NULL OR CLAW_BAC1 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawBac1",
						"(CLAW_BAC1 IS NULL OR CLAW_BAC1 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawBac1", "CLAW_BAC1 IN ( ? )") // IN

				.addFilterBy("NOTINClawBac1", "CLAW_BAC1 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawBac1asc", "CLAW_BAC1 ASC") // ORDER ASCENDING

				.addOrderBy("ClawBac1desc", "CLAW_BAC1 DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalClawBac2", "CLAW_BAC2 = ?") // EQUAL

				.addFilterBy("notequalClawBac2", "CLAW_BAC2 != ?") // NOTEQUAL

				.addFilterBy("nullClawBac2", "CLAW_BAC2 IS NULL") // IS NULL

				.addFilterBy("notnullClawBac2", "CLAW_BAC2 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawBac2", "CLAW_BAC2 < ?") // LESS THAN

				.addFilterBy("greaterthanClawBac2", "CLAW_BAC2 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawBac2", "CLAW_BAC2 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawBac2", "CLAW_BAC2 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawBac2Match", "CLAW_BAC2 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawBac2", "CLAW_BAC2 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawBac2",
						"(CLAW_BAC2 IS NULL OR CLAW_BAC2 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawBac2",
						"(CLAW_BAC2 IS NULL OR CLAW_BAC2 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawBac2",
						"(CLAW_BAC2 IS NULL OR CLAW_BAC2 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawBac2", "CLAW_BAC2 IN ( ? )") // IN

				.addFilterBy("NOTINClawBac2", "CLAW_BAC2 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawBac2asc", "CLAW_BAC2 ASC") // ORDER ASCENDING

				.addOrderBy("ClawBac2desc", "CLAW_BAC2 DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalDealerNl", "(DEALER_NL) = ?")
				// EQUAL

				.addFilterBy("notequalDealerNl", "(DEALER_NL) != ?")
				// NOTEQUAL

				.addFilterBy("nullDealerNl",
						"(DEALER_NL IS NULL OR LENGTH((DEALER_NL)) IS NULL OR LENGTH((DEALER_NL)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullDealerNl", "DEALER_NL IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanDealerNl", "DEALER_NL < ?") // LESS THAN

				.addFilterBy("greaterthanDealerNl", "DEALER_NL > ?") // GREATER
																		// THAN

				.addFilterBy("filterByDealerNlMatch", "DEALER_NL LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullDealerNl",
						"((DEALER_NL) = ? OR DEALER_NL IS NULL)") // EQUALORNULL

				.addFilterBy("INDealerNl", "(DEALER_NL) IN ( ? )") // IN

				.addFilterBy("NOTINDealerNl", "(DEALER_NL) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("DealerNlasc", "DEALER_NL ASC") // ORDER ASCENDING

				.addOrderBy("DealerNldesc", "DEALER_NL DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalQualPeriod", "QUAL_PERIOD = ?")
				// EQUAL

				.addFilterBy("notequalQualPeriod", "QUAL_PERIOD != ?")
				// NOTEQUAL

				.addFilterBy("nullQualPeriod", "QUAL_PERIOD IS NULL")
				// IS NULL

				.addFilterBy("notnullQualPeriod", "QUAL_PERIOD IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanQualPeriod", "QUAL_PERIOD < ?")
				// LESS THAN

				.addFilterBy("greaterthanQualPeriod", "QUAL_PERIOD > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalQualPeriod", "QUAL_PERIOD <= ?")
				// LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalQualPeriod", "QUAL_PERIOD >= ?") // GREATER
																					// THAN
																					// OR
																					// EQUAL

				.addFilterBy("filterByQualPeriodMatch", "QUAL_PERIOD LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("betweenQualPeriod", "QUAL_PERIOD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullQualPeriod",
						"(QUAL_PERIOD IS NULL OR QUAL_PERIOD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullQualPeriod",
						"(QUAL_PERIOD IS NULL OR QUAL_PERIOD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullQualPeriod",
						"(QUAL_PERIOD IS NULL OR QUAL_PERIOD > ?)") // GREATERTHANORNULL

				.addFilterBy("INQualPeriod", "QUAL_PERIOD IN ( ? )") // IN

				.addFilterBy("NOTINQualPeriod", "QUAL_PERIOD NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("QualPeriodasc", "QUAL_PERIOD ASC") // ORDER
																// ASCENDING

				.addOrderBy("QualPerioddesc", "QUAL_PERIOD DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalQbonusytd", "QBONUSYTD = ?") // EQUAL

				.addFilterBy("notequalQbonusytd", "QBONUSYTD != ?") // NOTEQUAL

				.addFilterBy("nullQbonusytd", "QBONUSYTD IS NULL") // IS NULL

				.addFilterBy("notnullQbonusytd", "QBONUSYTD IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanQbonusytd", "QBONUSYTD < ?") // LESS THAN

				.addFilterBy("greaterthanQbonusytd", "QBONUSYTD > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalQbonusytd", "QBONUSYTD <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalQbonusytd", "QBONUSYTD >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByQbonusytdMatch", "QBONUSYTD LIKE ?") // LIKE
																			// ,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenQbonusytd", "QBONUSYTD BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullQbonusytd",
						"(QBONUSYTD IS NULL OR QBONUSYTD = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullQbonusytd",
						"(QBONUSYTD IS NULL OR QBONUSYTD < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullQbonusytd",
						"(QBONUSYTD IS NULL OR QBONUSYTD > ?)") // GREATERTHANORNULL

				.addFilterBy("INQbonusytd", "QBONUSYTD IN ( ? )") // IN

				.addFilterBy("NOTINQbonusytd", "QBONUSYTD NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("Qbonusytdasc", "QBONUSYTD ASC") // ORDER ASCENDING

				.addOrderBy("Qbonusytddesc", "QBONUSYTD DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalDateCreated", "DATE_CREATED = ?") // EQUAL

				.addFilterBy("notequalDateCreated", "DATE_CREATED != ?") // NOTEQUAL

				.addFilterBy("nullDateCreated", "DATE_CREATED IS NULL") // IS
																		// NULL

				.addFilterBy("notnullDateCreated", "DATE_CREATED IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDateCreated", "DATE_CREATED < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanDateCreated", "DATE_CREATED > ?") // GREATER
																			// THAN

				.addFilterBy("lessthanorequalDateCreated", "DATE_CREATED <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalDateCreated",
						"DATE_CREATED >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("filterByDateCreatedMatch", "DATE_CREATED LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("betweenDateCreated",
						"DATE_CREATED BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDateCreated",
						"(DATE_CREATED IS NULL OR DATE_CREATED = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullDateCreated",
						"(DATE_CREATED IS NULL OR DATE_CREATED < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDateCreated",
						"(DATE_CREATED IS NULL OR DATE_CREATED > ?)") // GREATERTHANORNULL

				.addFilterBy("INDateCreated", "DATE_CREATED IN ( ? )") // IN

				.addFilterBy("NOTINDateCreated", "DATE_CREATED NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DateCreatedasc", "DATE_CREATED ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DateCreateddesc", "DATE_CREATED DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalClawInt1", "CLAW_INT1 = ?") // EQUAL

				.addFilterBy("notequalClawInt1", "CLAW_INT1 != ?") // NOTEQUAL

				.addFilterBy("nullClawInt1", "CLAW_INT1 IS NULL") // IS NULL

				.addFilterBy("notnullClawInt1", "CLAW_INT1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawInt1", "CLAW_INT1 < ?") // LESS THAN

				.addFilterBy("greaterthanClawInt1", "CLAW_INT1 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawInt1", "CLAW_INT1 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawInt1", "CLAW_INT1 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawInt1Match", "CLAW_INT1 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawInt1", "CLAW_INT1 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawInt1",
						"(CLAW_INT1 IS NULL OR CLAW_INT1 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawInt1",
						"(CLAW_INT1 IS NULL OR CLAW_INT1 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawInt1",
						"(CLAW_INT1 IS NULL OR CLAW_INT1 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawInt1", "CLAW_INT1 IN ( ? )") // IN

				.addFilterBy("NOTINClawInt1", "CLAW_INT1 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawInt1asc", "CLAW_INT1 ASC") // ORDER ASCENDING

				.addOrderBy("ClawInt1desc", "CLAW_INT1 DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalClawVal1", "CLAW_VAL1 = ?") // EQUAL

				.addFilterBy("notequalClawVal1", "CLAW_VAL1 != ?") // NOTEQUAL

				.addFilterBy("nullClawVal1", "CLAW_VAL1 IS NULL") // IS NULL

				.addFilterBy("notnullClawVal1", "CLAW_VAL1 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawVal1", "CLAW_VAL1 < ?") // LESS THAN

				.addFilterBy("greaterthanClawVal1", "CLAW_VAL1 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawVal1", "CLAW_VAL1 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawVal1", "CLAW_VAL1 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawVal1Match", "CLAW_VAL1 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawVal1", "CLAW_VAL1 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawVal1",
						"(CLAW_VAL1 IS NULL OR CLAW_VAL1 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawVal1",
						"(CLAW_VAL1 IS NULL OR CLAW_VAL1 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawVal1",
						"(CLAW_VAL1 IS NULL OR CLAW_VAL1 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawVal1", "CLAW_VAL1 IN ( ? )") // IN

				.addFilterBy("NOTINClawVal1", "CLAW_VAL1 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawVal1asc", "CLAW_VAL1 ASC") // ORDER ASCENDING

				.addOrderBy("ClawVal1desc", "CLAW_VAL1 DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalClawInt2", "CLAW_INT2 = ?") // EQUAL

				.addFilterBy("notequalClawInt2", "CLAW_INT2 != ?") // NOTEQUAL

				.addFilterBy("nullClawInt2", "CLAW_INT2 IS NULL") // IS NULL

				.addFilterBy("notnullClawInt2", "CLAW_INT2 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawInt2", "CLAW_INT2 < ?") // LESS THAN

				.addFilterBy("greaterthanClawInt2", "CLAW_INT2 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawInt2", "CLAW_INT2 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawInt2", "CLAW_INT2 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawInt2Match", "CLAW_INT2 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawInt2", "CLAW_INT2 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawInt2",
						"(CLAW_INT2 IS NULL OR CLAW_INT2 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawInt2",
						"(CLAW_INT2 IS NULL OR CLAW_INT2 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawInt2",
						"(CLAW_INT2 IS NULL OR CLAW_INT2 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawInt2", "CLAW_INT2 IN ( ? )") // IN

				.addFilterBy("NOTINClawInt2", "CLAW_INT2 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawInt2asc", "CLAW_INT2 ASC") // ORDER ASCENDING

				.addOrderBy("ClawInt2desc", "CLAW_INT2 DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalClawVal2", "CLAW_VAL2 = ?") // EQUAL

				.addFilterBy("notequalClawVal2", "CLAW_VAL2 != ?") // NOTEQUAL

				.addFilterBy("nullClawVal2", "CLAW_VAL2 IS NULL") // IS NULL

				.addFilterBy("notnullClawVal2", "CLAW_VAL2 IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanClawVal2", "CLAW_VAL2 < ?") // LESS THAN

				.addFilterBy("greaterthanClawVal2", "CLAW_VAL2 > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalClawVal2", "CLAW_VAL2 <= ?") // LESS
																			// THAN
																			// OR
																			// EQUAL

				.addFilterBy("greaterthanorequalClawVal2", "CLAW_VAL2 >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByClawVal2Match", "CLAW_VAL2 LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("betweenClawVal2", "CLAW_VAL2 BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullClawVal2",
						"(CLAW_VAL2 IS NULL OR CLAW_VAL2 = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullClawVal2",
						"(CLAW_VAL2 IS NULL OR CLAW_VAL2 < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullClawVal2",
						"(CLAW_VAL2 IS NULL OR CLAW_VAL2 > ?)") // GREATERTHANORNULL

				.addFilterBy("INClawVal2", "CLAW_VAL2 IN ( ? )") // IN

				.addFilterBy("NOTINClawVal2", "CLAW_VAL2 NOT IN ( ? )") // NOT
																		// IN

				.addOrderBy("ClawVal2asc", "CLAW_VAL2 ASC") // ORDER ASCENDING

				.addOrderBy("ClawVal2desc", "CLAW_VAL2 DESC") // ORDER
																// DESCENDING
		;

		table
				.addFilterBy("equalEposFlag", "(EPOS_FLAG) = ?")
				// EQUAL

				.addFilterBy("notequalEposFlag", "(EPOS_FLAG) != ?")
				// NOTEQUAL

				.addFilterBy("nullEposFlag",
						"(EPOS_FLAG IS NULL OR LENGTH((EPOS_FLAG)) IS NULL OR LENGTH((EPOS_FLAG)) = 0)") // IS
																											// NULL

				.addFilterBy("notnullEposFlag", "EPOS_FLAG IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanEposFlag", "EPOS_FLAG < ?") // LESS THAN

				.addFilterBy("greaterthanEposFlag", "EPOS_FLAG > ?") // GREATER
																		// THAN

				.addFilterBy("filterByEposFlagMatch", "EPOS_FLAG LIKE ?") //LIKE,
																			// BEGINSWITH
																			// ,
																			// ENDSWITH
																			// ,
																			// ANY

				.addFilterBy("equalornullEposFlag",
						"((EPOS_FLAG) = ? OR EPOS_FLAG IS NULL)") // EQUALORNULL

				.addFilterBy("INEposFlag", "(EPOS_FLAG) IN ( ? )") // IN

				.addFilterBy("NOTINEposFlag", "(EPOS_FLAG) NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("EposFlagasc", "EPOS_FLAG ASC") // ORDER ASCENDING

				.addOrderBy("EposFlagdesc", "EPOS_FLAG DESC") // ORDER
																// DESCENDING
		;

		table.addFilterBy("equalAccMinQty", "ACC_MIN_QTY = ?") // EQUAL

				.addFilterBy("notequalAccMinQty", "ACC_MIN_QTY != ?") // NOTEQUAL

				.addFilterBy("nullAccMinQty", "ACC_MIN_QTY IS NULL") // IS NULL

				.addFilterBy("notnullAccMinQty", "ACC_MIN_QTY IS NOT NULL") // IS
																			// NOT
																			// NULL

				.addFilterBy("lessthanAccMinQty", "ACC_MIN_QTY < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanAccMinQty", "ACC_MIN_QTY > ?") // GREATER
																		// THAN

				.addFilterBy("lessthanorequalAccMinQty", "ACC_MIN_QTY <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalAccMinQty", "ACC_MIN_QTY >= ?") // GREATER
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("filterByAccMinQtyMatch", "ACC_MIN_QTY LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("betweenAccMinQty", "ACC_MIN_QTY BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullAccMinQty",
						"(ACC_MIN_QTY IS NULL OR ACC_MIN_QTY = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullAccMinQty",
						"(ACC_MIN_QTY IS NULL OR ACC_MIN_QTY < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullAccMinQty",
						"(ACC_MIN_QTY IS NULL OR ACC_MIN_QTY > ?)") // GREATERTHANORNULL

				.addFilterBy("INAccMinQty", "ACC_MIN_QTY IN ( ? )") // IN

				.addFilterBy("NOTINAccMinQty", "ACC_MIN_QTY NOT IN ( ? )") // NOT
																			// IN

				.addOrderBy("AccMinQtyasc", "ACC_MIN_QTY ASC") // ORDER
																// ASCENDING

				.addOrderBy("AccMinQtydesc", "ACC_MIN_QTY DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalAccCurrQty", "ACC_CURR_QTY = ?") // EQUAL

				.addFilterBy("notequalAccCurrQty", "ACC_CURR_QTY != ?") // NOTEQUAL

				.addFilterBy("nullAccCurrQty", "ACC_CURR_QTY IS NULL") // IS
																		// NULL

				.addFilterBy("notnullAccCurrQty", "ACC_CURR_QTY IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanAccCurrQty", "ACC_CURR_QTY < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanAccCurrQty", "ACC_CURR_QTY > ?") // GREATER
																			// THAN

				.addFilterBy("lessthanorequalAccCurrQty", "ACC_CURR_QTY <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalAccCurrQty",
						"ACC_CURR_QTY >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("filterByAccCurrQtyMatch", "ACC_CURR_QTY LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("betweenAccCurrQty",
						"ACC_CURR_QTY BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullAccCurrQty",
						"(ACC_CURR_QTY IS NULL OR ACC_CURR_QTY = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullAccCurrQty",
						"(ACC_CURR_QTY IS NULL OR ACC_CURR_QTY < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullAccCurrQty",
						"(ACC_CURR_QTY IS NULL OR ACC_CURR_QTY > ?)") // GREATERTHANORNULL

				.addFilterBy("INAccCurrQty", "ACC_CURR_QTY IN ( ? )") // IN

				.addFilterBy("NOTINAccCurrQty", "ACC_CURR_QTY NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("AccCurrQtyasc", "ACC_CURR_QTY ASC") // ORDER
																	// ASCENDING

				.addOrderBy("AccCurrQtydesc", "ACC_CURR_QTY DESC") // ORDER
																	// DESCENDING
		;

		table.addFilterBy("equalAccShipQty", "ACC_SHIP_QTY = ?") // EQUAL

				.addFilterBy("notequalAccShipQty", "ACC_SHIP_QTY != ?") // NOTEQUAL

				.addFilterBy("nullAccShipQty", "ACC_SHIP_QTY IS NULL") // IS
																		// NULL

				.addFilterBy("notnullAccShipQty", "ACC_SHIP_QTY IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanAccShipQty", "ACC_SHIP_QTY < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanAccShipQty", "ACC_SHIP_QTY > ?") // GREATER
																			// THAN

				.addFilterBy("lessthanorequalAccShipQty", "ACC_SHIP_QTY <= ?") // LESS
																				// THAN
																				// OR
																				// EQUAL

				.addFilterBy("greaterthanorequalAccShipQty",
						"ACC_SHIP_QTY >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("filterByAccShipQtyMatch", "ACC_SHIP_QTY LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("betweenAccShipQty",
						"ACC_SHIP_QTY BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullAccShipQty",
						"(ACC_SHIP_QTY IS NULL OR ACC_SHIP_QTY = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullAccShipQty",
						"(ACC_SHIP_QTY IS NULL OR ACC_SHIP_QTY < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullAccShipQty",
						"(ACC_SHIP_QTY IS NULL OR ACC_SHIP_QTY > ?)") // GREATERTHANORNULL

				.addFilterBy("INAccShipQty", "ACC_SHIP_QTY IN ( ? )") // IN

				.addFilterBy("NOTINAccShipQty", "ACC_SHIP_QTY NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("AccShipQtyasc", "ACC_SHIP_QTY ASC") // ORDER
																	// ASCENDING

				.addOrderBy("AccShipQtydesc", "ACC_SHIP_QTY DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalRegion", "(REGION) = ?")
				// EQUAL

				.addFilterBy("notequalRegion", "(REGION) != ?")
				// NOTEQUAL

				.addFilterBy("nullRegion",
						"(REGION IS NULL OR LENGTH((REGION)) IS NULL OR LENGTH((REGION)) = 0)") // IS
																								// NULL

				.addFilterBy("notnullRegion", "REGION IS NOT NULL") // IS NOT
																	// NULL

				.addFilterBy("lessthanRegion", "REGION < ?") // LESS THAN

				.addFilterBy("greaterthanRegion", "REGION > ?") // GREATER THAN

				.addFilterBy("filterByRegionMatch", "REGION LIKE ?") // LIKE,
																		// BEGINSWITH
																		// ,
																		// ENDSWITH
																		// , ANY

				.addFilterBy("equalornullRegion",
						"((REGION) = ? OR REGION IS NULL)") // EQUALORNULL

				.addFilterBy("INRegion", "(REGION) IN ( ? )") // IN

				.addFilterBy("NOTINRegion", "(REGION) NOT IN ( ? )") // NOT IN

				.addOrderBy("Regionasc", "REGION ASC") // ORDER ASCENDING

				.addOrderBy("Regiondesc", "REGION DESC") // ORDER DESCENDING
		;

		table
				.addFilterBy("equalDealerGroup", "(DEALER_GROUP) = ?")
				// EQUAL

				.addFilterBy("notequalDealerGroup", "(DEALER_GROUP) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDealerGroup",
						"(DEALER_GROUP IS NULL OR LENGTH((DEALER_GROUP)) IS NULL OR LENGTH((DEALER_GROUP)) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDealerGroup", "DEALER_GROUP IS NOT NULL") // IS
																				// NOT
																				// NULL

				.addFilterBy("lessthanDealerGroup", "DEALER_GROUP < ?") // LESS
																		// THAN

				.addFilterBy("greaterthanDealerGroup", "DEALER_GROUP > ?") // GREATER
																			// THAN

				.addFilterBy("filterByDealerGroupMatch", "DEALER_GROUP LIKE ?") // LIKE
																				// ,
																				// BEGINSWITH
																				// ,
																				// ENDSWITH
																				// ,
																				// ANY

				.addFilterBy("equalornullDealerGroup",
						"((DEALER_GROUP) = ? OR DEALER_GROUP IS NULL)") // EQUALORNULL

				.addFilterBy("INDealerGroup", "(DEALER_GROUP) IN ( ? )") // IN

				.addFilterBy("NOTINDealerGroup", "(DEALER_GROUP) NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DealerGroupasc", "DEALER_GROUP ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DealerGroupdesc", "DEALER_GROUP DESC") // ORDER
																	// DESCENDING
		;

		table
				.addFilterBy("equalDealerDirect", "(DEALER_DIRECT) = ?")
				// EQUAL

				.addFilterBy("notequalDealerDirect", "(DEALER_DIRECT) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDealerDirect",
						"(DEALER_DIRECT IS NULL OR LENGTH((DEALER_DIRECT)) IS NULL OR LENGTH((DEALER_DIRECT)) = 0)") // IS
																														// NULL

				.addFilterBy("notnullDealerDirect", "DEALER_DIRECT IS NOT NULL") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanDealerDirect", "DEALER_DIRECT < ?") // LESS
																			// THAN

				.addFilterBy("greaterthanDealerDirect", "DEALER_DIRECT > ?") // GREATER
																				// THAN

				.addFilterBy("filterByDealerDirectMatch",
						"DEALER_DIRECT LIKE ?") // LIKE, BEGINSWITH, ENDSWITH,
												// ANY

				.addFilterBy("equalornullDealerDirect",
						"((DEALER_DIRECT) = ? OR DEALER_DIRECT IS NULL)") // EQUALORNULL

				.addFilterBy("INDealerDirect", "(DEALER_DIRECT) IN ( ? )") // IN

				.addFilterBy("NOTINDealerDirect",
						"(DEALER_DIRECT) NOT IN ( ? )") // NOT IN

				.addOrderBy("DealerDirectasc", "DEALER_DIRECT ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DealerDirectdesc", "DEALER_DIRECT DESC") // ORDER
																		// DESCENDING
		;
		table.addFilterBy("equalDealerActive", "(DEALER_ACTIVE) = ?")// EQUAL
		.addFilterBy("notequalDealerActive", "(DEALER_ACTIVE) != ?")// NOTEQUAL
		.addFilterBy("nullDealerActive","(DEALER_ACTIVE IS NULL OR LENGTH((DEALER_ACTIVE)) IS NULL OR LENGTH((DEALER_ACTIVE)) = 0)") // IS NULL
		.addFilterBy("notnullDealerActive", "DEALER_ACTIVE IS NOT NULL") // IS
		.addFilterBy("lessthanDealerActive", "DEALER_ACTIVE < ?") // LESS
		.addFilterBy("greaterthanDealerActive", "DEALER_ACTIVE > ?") // GREATER
		.addFilterBy("filterByDealerActiveMatch",
				"DEALER_ACTIVE LIKE ?") // LIKE, BEGINSWITH, ENDSWITH,// ANY
		.addFilterBy("equalornullDealerActive",
				"((DEALER_ACTIVE) = ? OR DEALER_ACTIVE IS NULL)") // EQUALORNULL
		.addFilterBy("INDealerActive", "(DEALER_ACTIVE) IN ( ? )") // IN
		.addFilterBy("NOTINDealerActive",
				"(DEALER_ACTIVE) NOT IN ( ? )") // NOT IN
		.addOrderBy("DealerActiveasc", "DEALER_ACTIVE ASC") // ORDER// ASCENDING
		.addOrderBy("DealerActivedesc", "DEALER_ACTIVE DESC") // ORDER
																			// DESCENDING
		;
		table.addFilterBy("equalDealerInactive", "(DEALER_INACTIVE) = ?")// EQUAL
		.addFilterBy("notequalDealerInactive", "(DEALER_INACTIVE) != ?")// NOTEQUAL
		.addFilterBy("nullDealerInactive","(DEALER_INACTIVE IS NULL OR LENGTH((DEALER_INACTIVE))IS NULL OR LENGTH((DEALER_INACTIVE)) = 0)") // IS NULL
		.addFilterBy("notnullDealerInactive", "DEALER_INACTIVE IS NOT NULL") // IS
		.addFilterBy("lessthanDealerInactive", "DEALER_INACTIVE < ?") // LESS
		.addFilterBy("greaterthanDealerInactive", "DEALER_INACTIVE > ?") // GREATER
		.addFilterBy("filterByDealerInactiveMatch","DEALER_INACTIVE LIKE ?") // LIKE, BEGINSWITH, ENDSWITH,// ANY
		.addFilterBy("equalornullDealerInactive","((DEALER_INACTIVE) = ? OR DEALER_ACTIVE IS NULL)") // EQUALORNULL
		.addFilterBy("INDealerInactive", "(DEALER_INACTIVE) IN ( ? )") // IN
		.addFilterBy("NOTINDealerInactive","(DEALER_INACTIVE) NOT IN ( ? )") // NOT IN
		.addOrderBy("DealerInactiveasc", "DEALER_INACTIVE ASC") // ORDER
		.addOrderBy("DealerInactivedesc", "DEALER_INACTIVE DESC") // ORDER
		;
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
			dml = new DealersDMLFactory();
		}

		return dml;
	}
}
