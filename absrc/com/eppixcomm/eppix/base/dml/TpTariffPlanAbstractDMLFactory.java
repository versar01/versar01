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
 * This is the DMLFactory for TpTariffPlan.
 * 
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class TpTariffPlanAbstractDMLFactory extends BaseDMLFactory {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new TpTariffPlanAbstractDMLFactory object.
	 * 
	 * @throws DMLException
	 *             DOCUMENT ME!
	 */
	protected TpTariffPlanAbstractDMLFactory() throws DMLException {
		;

		DMLTable table = defTable(
				"TpTariffPlan", // dmlName
				"blo.TpTariffPlanDMO", // dmoName
				"TP_TARIFF_PLAN", // tableName
				10, // numColumns
				"TP_TARPLAN_REF, TP_TARPLAN_TEXT, TP_CURRNCY_REF, TP_SUSPEND_IND, TP_INCOMMING, TP_INTERNATIONAL, TP_LOCAL"
						+ ", TP_OFF_PEAK, TP_HIGH_SPEND, TP_TIMESTAMP", // columnList
				"(TP_TARPLAN_REF)", // primaryKey
				"" // versionCol
				,
				false, // generatedKey
				"TP_TARPLAN_REF, TP_TARPLAN_TEXT, TP_CURRNCY_REF, TP_SUSPEND_IND, TP_INCOMMING, TP_INTERNATIONAL, TP_LOCAL"
						+ ", TP_OFF_PEAK, TP_HIGH_SPEND, TP_TIMESTAMP", "", "",
				new String[] { "TP_TARPLAN_REF", "TP_TARPLAN_TEXT",
						"TP_CURRNCY_REF", "TP_SUSPEND_IND", "TP_INCOMMING",
						"TP_INTERNATIONAL", "TP_LOCAL", "TP_OFF_PEAK",
						"TP_HIGH_SPEND", "TP_TIMESTAMP" });

		table.addFilterBy("equalTpTarplanRef", /* PK attribute */
		"(TP_TARPLAN_REF) = ?").addFilterBy("filterByTpTarplanRefMatch",
				"TP_TARPLAN_REF LIKE ?")
				.addFilterBy("INTpTarplanRef", "(TP_TARPLAN_REF) IN ( ? )")
				// IN

				.addFilterBy("NOTINTpTarplanRef",
						"(TP_TARPLAN_REF) NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalTpTarplanRef",
						"(TP_TARPLAN_REF) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpTarplanRef",
						"(TP_TARPLAN_REF IS NULL OR LENGTH((TP_TARPLAN_REF)) IS NULL OR LENGTH((TP_TARPLAN_REF)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpTarplanRef",
						"TP_TARPLAN_REF IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanTpTarplanRef", "TP_TARPLAN_REF < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpTarplanRef", "TP_TARPLAN_REF > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpTarplanRefMatch",
						"TP_TARPLAN_REF LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullTpTarplanRef",
						"((TP_TARPLAN_REF) = ? OR TP_TARPLAN_REF IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a ()

				.addOrderBy("TpTarplanRefasc", "TP_TARPLAN_REF ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpTarplanRefdesc", "TP_TARPLAN_REF DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpTarplanText", "(TP_TARPLAN_TEXT) = ?")
				// EQUAL

				.addFilterBy("notequalTpTarplanText",
						"(TP_TARPLAN_TEXT) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpTarplanText",
						"(TP_TARPLAN_TEXT IS NULL OR LENGTH((TP_TARPLAN_TEXT)) IS NULL OR LENGTH((TP_TARPLAN_TEXT)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpTarplanText",
						"TP_TARPLAN_TEXT IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanTpTarplanText", "TP_TARPLAN_TEXT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpTarplanText", "TP_TARPLAN_TEXT > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpTarplanTextMatch",
						"TP_TARPLAN_TEXT LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullTpTarplanText",
						"((TP_TARPLAN_TEXT) = ? OR TP_TARPLAN_TEXT IS NULL)") // EQUALORNULL

				.addFilterBy("INTpTarplanText",
						"(TP_TARPLAN_TEXT) IN ( ? )") // IN

				.addFilterBy("NOTINTpTarplanText",
						"(TP_TARPLAN_TEXT) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpTarplanTextasc", "TP_TARPLAN_TEXT ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpTarplanTextdesc", "TP_TARPLAN_TEXT DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpCurrncyRef", "(TP_CURRNCY_REF) = ?")
				// EQUAL

				.addFilterBy("notequalTpCurrncyRef",
						"(TP_CURRNCY_REF) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpCurrncyRef",
						"(TP_CURRNCY_REF IS NULL OR LENGTH((TP_CURRNCY_REF)) IS NULL OR LENGTH((TP_CURRNCY_REF)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpCurrncyRef",
						"TP_CURRNCY_REF IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanTpCurrncyRef", "TP_CURRNCY_REF < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpCurrncyRef", "TP_CURRNCY_REF > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpCurrncyRefMatch",
						"TP_CURRNCY_REF LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullTpCurrncyRef",
						"((TP_CURRNCY_REF) = ? OR TP_CURRNCY_REF IS NULL)") // EQUALORNULL

				.addFilterBy("INTpCurrncyRef", "(TP_CURRNCY_REF) IN ( ? )") // IN

				.addFilterBy("NOTINTpCurrncyRef",
						"(TP_CURRNCY_REF) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpCurrncyRefasc", "TP_CURRNCY_REF ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpCurrncyRefdesc", "TP_CURRNCY_REF DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpSuspendInd", "(TP_SUSPEND_IND) = ?")
				// EQUAL

				.addFilterBy("notequalTpSuspendInd",
						"(TP_SUSPEND_IND) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpSuspendInd",
						"(TP_SUSPEND_IND IS NULL OR LENGTH((TP_SUSPEND_IND)) IS NULL OR LENGTH((TP_SUSPEND_IND)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpSuspendInd",
						"TP_SUSPEND_IND IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanTpSuspendInd", "TP_SUSPEND_IND < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpSuspendInd", "TP_SUSPEND_IND > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpSuspendIndMatch",
						"TP_SUSPEND_IND LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullTpSuspendInd",
						"((TP_SUSPEND_IND) = ? OR TP_SUSPEND_IND IS NULL)") // EQUALORNULL

				.addFilterBy("INTpSuspendInd", "(TP_SUSPEND_IND) IN ( ? )") // IN

				.addFilterBy("NOTINTpSuspendInd",
						"(TP_SUSPEND_IND) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpSuspendIndasc", "TP_SUSPEND_IND ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpSuspendInddesc", "TP_SUSPEND_IND DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpIncomming", "(TP_INCOMMING) = ?")
				// EQUAL

				.addFilterBy("notequalTpIncomming", "(TP_INCOMMING) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpIncomming",
						"(TP_INCOMMING IS NULL OR LENGTH((TP_INCOMMING)) IS NULL OR LENGTH((TP_INCOMMING)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpIncomming", "TP_INCOMMING IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanTpIncomming", "TP_INCOMMING < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpIncomming", "TP_INCOMMING > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpIncommingMatch", "TP_INCOMMING LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullTpIncomming",
						"((TP_INCOMMING) = ? OR TP_INCOMMING IS NULL)") // EQUALORNULL

				.addFilterBy("INTpIncomming", "(TP_INCOMMING) IN ( ? )") // IN

				.addFilterBy("NOTINTpIncomming",
						"(TP_INCOMMING) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpIncommingasc", "TP_INCOMMING ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpIncommingdesc", "TP_INCOMMING DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpInternational",
						"(TP_INTERNATIONAL) = ?")
				// EQUAL

				.addFilterBy("notequalTpInternational",
						"(TP_INTERNATIONAL) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpInternational",
						"(TP_INTERNATIONAL IS NULL OR LENGTH((TP_INTERNATIONAL)) IS NULL OR LENGTH((TP_INTERNATIONAL)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpInternational",
						"TP_INTERNATIONAL IS NOT NULL") // IS NOT NULL

				.addFilterBy("lessthanTpInternational", "TP_INTERNATIONAL < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpInternational",
						"TP_INTERNATIONAL > ?") // GREATER THAN

				.addFilterBy("filterByTpInternationalMatch",
						"TP_INTERNATIONAL LIKE ?") // LIKE, BEGINSWITH,
				// ENDSWITH, ANY

				.addFilterBy("equalornullTpInternational",
						"((TP_INTERNATIONAL) = ? OR TP_INTERNATIONAL IS NULL)") // EQUALORNULL

				.addFilterBy("INTpInternational",
						"(TP_INTERNATIONAL) IN ( ? )") // IN

				.addFilterBy("NOTINTpInternational",
						"(TP_INTERNATIONAL) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpInternationalasc", "TP_INTERNATIONAL ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpInternationaldesc", "TP_INTERNATIONAL DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpLocal", "(TP_LOCAL) = ?")
				// EQUAL

				.addFilterBy("notequalTpLocal", "(TP_LOCAL) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpLocal",
						"(TP_LOCAL IS NULL OR LENGTH((TP_LOCAL)) IS NULL OR LENGTH((TP_LOCAL)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpLocal", "TP_LOCAL IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanTpLocal", "TP_LOCAL < ?") // LESS THAN

				.addFilterBy("greaterthanTpLocal", "TP_LOCAL > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpLocalMatch", "TP_LOCAL LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullTpLocal",
						"((TP_LOCAL) = ? OR TP_LOCAL IS NULL)") // EQUALORNULL

				.addFilterBy("INTpLocal", "(TP_LOCAL) IN ( ? )") // IN

				.addFilterBy("NOTINTpLocal", "(TP_LOCAL) NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("TpLocalasc", "TP_LOCAL ASC") // ORDER ASCENDING

				.addOrderBy("TpLocaldesc", "TP_LOCAL DESC") // ORDER DESCENDING
		;

		table
				.addFilterBy("equalTpOffPeak", "(TP_OFF_PEAK) = ?")
				// EQUAL

				.addFilterBy("notequalTpOffPeak", "(TP_OFF_PEAK) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpOffPeak",
						"(TP_OFF_PEAK IS NULL OR LENGTH((TP_OFF_PEAK)) IS NULL OR LENGTH((TP_OFF_PEAK)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpOffPeak", "TP_OFF_PEAK IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanTpOffPeak", "TP_OFF_PEAK < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpOffPeak", "TP_OFF_PEAK > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpOffPeakMatch", "TP_OFF_PEAK LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullTpOffPeak",
						"((TP_OFF_PEAK) = ? OR TP_OFF_PEAK IS NULL)") // EQUALORNULL

				.addFilterBy("INTpOffPeak", "(TP_OFF_PEAK) IN ( ? )") // IN

				.addFilterBy("NOTINTpOffPeak", "(TP_OFF_PEAK) NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("TpOffPeakasc", "TP_OFF_PEAK ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpOffPeakdesc", "TP_OFF_PEAK DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalTpHighSpend", "(TP_HIGH_SPEND) = ?")
				// EQUAL

				.addFilterBy("notequalTpHighSpend", "(TP_HIGH_SPEND) != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullTpHighSpend",
						"(TP_HIGH_SPEND IS NULL OR LENGTH((TP_HIGH_SPEND)) IS NULL OR LENGTH((TP_HIGH_SPEND)) = 0)") // IS
				// NULL

				.addFilterBy("notnullTpHighSpend", "TP_HIGH_SPEND IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanTpHighSpend", "TP_HIGH_SPEND < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpHighSpend", "TP_HIGH_SPEND > ?") // GREATER
				// THAN

				.addFilterBy("filterByTpHighSpendMatch", "TP_HIGH_SPEND LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("equalornullTpHighSpend",
						"((TP_HIGH_SPEND) = ? OR TP_HIGH_SPEND IS NULL)") // EQUALORNULL

				.addFilterBy("INTpHighSpend", "(TP_HIGH_SPEND) IN ( ? )") // IN

				.addFilterBy("NOTINTpHighSpend",
						"(TP_HIGH_SPEND) NOT IN ( ? )") // NOT IN

				.addOrderBy("TpHighSpendasc", "TP_HIGH_SPEND ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpHighSpenddesc", "TP_HIGH_SPEND DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalTpTimestamp", "TP_TIMESTAMP = ?") // EQUAL

				.addFilterBy("notequalTpTimestamp", "TP_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy("nullTpTimestamp", "TP_TIMESTAMP IS NULL") // IS
				// NULL

				.addFilterBy("notnullTpTimestamp", "TP_TIMESTAMP IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanTpTimestamp", "TP_TIMESTAMP < ?") // LESS
				// THAN

				.addFilterBy("greaterthanTpTimestamp", "TP_TIMESTAMP > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalTpTimestamp", "TP_TIMESTAMP <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalTpTimestamp",
						"TP_TIMESTAMP >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("filterByTpTimestampMatch", "TP_TIMESTAMP LIKE ?") // LIKE,
				// BEGINSWITH,
				// ENDSWITH,
				// ANY

				.addFilterBy("betweenTpTimestamp",
						"TP_TIMESTAMP BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullTpTimestamp",
						"(TP_TIMESTAMP IS NULL OR TP_TIMESTAMP = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullTpTimestamp",
						"(TP_TIMESTAMP IS NULL OR TP_TIMESTAMP < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullTpTimestamp",
						"(TP_TIMESTAMP IS NULL OR TP_TIMESTAMP > ?)") // GREATERTHANORNULL

				.addFilterBy("INTpTimestamp", "TP_TIMESTAMP IN ( ? )") // IN

				.addFilterBy("NOTINTpTimestamp", "TP_TIMESTAMP NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("TpTimestampasc", "TP_TIMESTAMP ASC") // ORDER
				// ASCENDING

				.addOrderBy("TpTimestampdesc", "TP_TIMESTAMP DESC") // ORDER
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
			dml = new TpTariffPlanDMLFactory();
		}

		return dml;
	}
}
