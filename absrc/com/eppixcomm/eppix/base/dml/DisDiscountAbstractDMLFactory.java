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

/**
 * This is the DMLFactory for DisDiscount.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DisDiscountAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DisDiscountAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected DisDiscountAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"DisDiscount", // dmlName
				"blo.DisDiscountDMO", // dmoName
				"DIS_DISCOUNT", // tableName
				4, // numColumns
				"DIS_DISCOUNT_ID, DIS_DISCOUNT_REF, DIS_DISCOUNT_DESC, DIS_DPRIORITY", // columnList
				"DIS_DISCOUNT_ID", // primaryKey
				"" // versionCol
				,
				true, // generatedKey
				"DIS_DISCOUNT_ID, DIS_DISCOUNT_REF, DIS_DISCOUNT_DESC, DIS_DPRIORITY",
				"", "", new String[] { "DIS_DISCOUNT_ID", "DIS_DISCOUNT_REF",
						"DIS_DISCOUNT_DESC", "DIS_DPRIORITY" }, true);

		table.addFilterBy("equalDisDiscountId", /* PK attribute */
		"DIS_DISCOUNT_ID = ?").addFilterBy("filterByDisDiscountIdMatch",
				"DIS_DISCOUNT_ID LIKE ?").addFilterBy("INDisDiscountId",
				"DIS_DISCOUNT_ID IN ( ? )") // IN

				.addFilterBy("NOTINDisDiscountId",
						"DIS_DISCOUNT_ID NOT IN ( ? )") // NOT IN

				.addFilterBy("notequalDisDiscountId", "DIS_DISCOUNT_ID != ?") // NOTEQUAL

				.addFilterBy("nullDisDiscountId", "DIS_DISCOUNT_ID IS NULL") // IS
																				// NULL

				.addFilterBy("notnullDisDiscountId",
						"DIS_DISCOUNT_ID IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDisDiscountId", "DIS_DISCOUNT_ID < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDisDiscountId", "DIS_DISCOUNT_ID > ?") // GREATER
																				// THAN

				.addFilterBy("lessthanorequalDisDiscountId",
						"DIS_DISCOUNT_ID <= ?") // LESS THAN OR EQUAL

				.addFilterBy("greaterthanorequalDisDiscountId",
						"DIS_DISCOUNT_ID >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("filterByDisDiscountIdMatch",
						"DIS_DISCOUNT_ID LIKE ?") // LIKE, BEGINSWITH, ENDSWITH,
													// ANY

				.addFilterBy("betweenDisDiscountId",
						"DIS_DISCOUNT_ID BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullDisDiscountId",
						"(DIS_DISCOUNT_ID IS NULL OR DIS_DISCOUNT_ID = ?)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addFilterBy("lessthanornullDisDiscountId",
						"(DIS_DISCOUNT_ID IS NULL OR DIS_DISCOUNT_ID < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullDisDiscountId",
						"(DIS_DISCOUNT_ID IS NULL OR DIS_DISCOUNT_ID > ?)") // GREATERTHANORNULL

				.addOrderBy("DisDiscountIdasc", "DIS_DISCOUNT_ID ASC") // ORDER
																		// ASCENDING

				.addOrderBy("DisDiscountIddesc", "DIS_DISCOUNT_ID DESC") // ORDER
																			// DESCENDING
		;

		table
				.addFilterBy("equalDisDiscountRef", "DIS_DISCOUNT_REF = ?")
				// EQUAL

				.addFilterBy("notequalDisDiscountRef", "DIS_DISCOUNT_REF != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDisDiscountRef",
						"(DIS_DISCOUNT_REF IS NULL OR LENGTH(DIS_DISCOUNT_REF) IS NULL OR LENGTH(DIS_DISCOUNT_REF) = 0)") // IS
																															// NULL

				.addFilterBy("notnullDisDiscountRef",
						"DIS_DISCOUNT_REF IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDisDiscountRef", "DIS_DISCOUNT_REF < ?") // LESS
																				// THAN

				.addFilterBy("greaterthanDisDiscountRef",
						"DIS_DISCOUNT_REF > ?") // GREATER THAN

				.addFilterBy("filterByDisDiscountRefMatch",
						"DIS_DISCOUNT_REF LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDisDiscountRef",
						"(DIS_DISCOUNT_REF = ? OR DIS_DISCOUNT_REF IS NULL)") // EQUALORNULL

				.addFilterBy("INDisDiscountRef", "DIS_DISCOUNT_REF IN ( ? )") // IN

				.addFilterBy("NOTINDisDiscountRef",
						"DIS_DISCOUNT_REF NOT IN ( ? )") // NOT IN

				.addOrderBy("DisDiscountRefasc", "DIS_DISCOUNT_REF ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DisDiscountRefdesc", "DIS_DISCOUNT_REF DESC") // ORDER
																			// DESCENDING
		;

		table
				.addFilterBy("equalDisDiscountDesc", "DIS_DISCOUNT_DESC = ?")
				// EQUAL

				.addFilterBy("notequalDisDiscountDesc",
						"DIS_DISCOUNT_DESC != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDisDiscountDesc",
						"(DIS_DISCOUNT_DESC IS NULL OR LENGTH(DIS_DISCOUNT_DESC) IS NULL OR LENGTH(DIS_DISCOUNT_DESC) = 0)") // IS
																																// NULL

				.addFilterBy("notnullDisDiscountDesc",
						"DIS_DISCOUNT_DESC IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanDisDiscountDesc", "DIS_DISCOUNT_DESC < ?") // LESS
																					// THAN

				.addFilterBy("greaterthanDisDiscountDesc",
						"DIS_DISCOUNT_DESC > ?") // GREATER THAN

				.addFilterBy("filterByDisDiscountDescMatch",
						"DIS_DISCOUNT_DESC LIKE ?") // LIKE, BEGINSWITH,
													// ENDSWITH, ANY

				.addFilterBy("equalornullDisDiscountDesc",
						"(DIS_DISCOUNT_DESC = ? OR DIS_DISCOUNT_DESC IS NULL)") // EQUALORNULL

				.addFilterBy("INDisDiscountDesc", "DIS_DISCOUNT_DESC IN ( ? )") // IN

				.addFilterBy("NOTINDisDiscountDesc",
						"DIS_DISCOUNT_DESC NOT IN ( ? )") // NOT IN

				.addOrderBy("DisDiscountDescasc", "DIS_DISCOUNT_DESC ASC") // ORDER
																			// ASCENDING

				.addOrderBy("DisDiscountDescdesc", "DIS_DISCOUNT_DESC DESC") // ORDER
																				// DESCENDING
		;

		table
				.addFilterBy("equalDisDpriority", "DIS_DPRIORITY = ?")
				// EQUAL

				.addFilterBy("notequalDisDpriority", "DIS_DPRIORITY != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullDisDpriority",
						"(DIS_DPRIORITY IS NULL OR LENGTH(DIS_DPRIORITY) IS NULL OR LENGTH(DIS_DPRIORITY) = 0)") // IS
																													// NULL

				.addFilterBy("notnullDisDpriority", "DIS_DPRIORITY IS NOT NULL") // IS
																					// NOT
																					// NULL

				.addFilterBy("lessthanDisDpriority", "DIS_DPRIORITY < ?") // LESS
																			// THAN

				.addFilterBy("greaterthanDisDpriority", "DIS_DPRIORITY > ?") // GREATER
																				// THAN

				.addFilterBy("filterByDisDpriorityMatch",
						"DIS_DPRIORITY LIKE ?") // LIKE, BEGINSWITH, ENDSWITH,
												// ANY

				.addFilterBy("equalornullDisDpriority",
						"(DIS_DPRIORITY = ? OR DIS_DPRIORITY IS NULL)") // EQUALORNULL

				.addFilterBy("INDisDpriority", "DIS_DPRIORITY IN ( ? )") // IN

				.addFilterBy("NOTINDisDpriority", "DIS_DPRIORITY NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("DisDpriorityasc", "DIS_DPRIORITY ASC") // ORDER
																	// ASCENDING

				.addOrderBy("DisDprioritydesc", "DIS_DPRIORITY DESC") // ORDER
																		// DESCENDING
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
			dml = new DisDiscountDMLFactory();
		}

		return dml;
	}
}
