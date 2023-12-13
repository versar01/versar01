package com.eppixcomm.eppix.base.dml;

public class PdPortDetailsAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected PdPortDetailsAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable("PdPortDetails", // dmlName
				"blo.PdPortDetailsDMO", // dmoName
				"PD_PORT_DETAIL", // tableName
				11, // numColumns);
				"PD_SERIAL, PD_PORT_ID,PD_MSISDN, "
						+ "PD_STATUS, PD_IN_OUT,PD_NETWRK, "
						+ "PD_WAIT_MID,PD_TRANS,PD_TRANS_DATE,  "
						+ "PD_N2N_SENT,PD_TIMESTAMP", // columnList
				"PD_SERIAL", // primaryKey
				"" // versionCol
				, true, // generatedKey
				"PD_SERIAL, PD_PORT_ID,PD_MSISDN, "
						+ "PD_STATUS, PD_IN_OUT,PD_NETWRK, "
						+ "PD_WAIT_MID,PD_TRANS,PD_TRANS_DATE,  "
						+ "PD_N2N_SENT,PD_TIMESTAMP", "", "", new String[] {
						"PD_SERIAL", "PD_PORT_ID", "PD_MSISDN", "PD_STATUS",
						"PD_IN_OUT", "PD_NETWRK", "PD_WAIT_MID", "PD_TRANS",
						"PD_TRANS_DATE", "PD_N2N_SENT", "PD_TIMESTAMP" });

		table.addFilterBy("equalPdSerial", /* PK attribute */
		"PD_SERIAL = ?").addFilterBy("filterByPdSerialMatch",
				"PD_SERIAL LIKE ?")
				.addFilterBy("INPdSerial", "PD_SERIAL IN ( ? )")
				// IN

				.addFilterBy("NOTINPdSerial", "PD_SERIAL NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdSerial", "PD_SERIAL != ?")
				// NOTEQUAL

				.addFilterBy("nullPdSerial",
						"(PD_SERIAL IS NULL OR LENGTH(PD_SERIAL) IS NULL OR LENGTH(PD_SERIAL) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdSerial", "PD_SERIAL IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdSerial", "PD_SERIAL < ?") // LESS THAN

				.addFilterBy("greaterthanPdSerial", "PD_SERIAL > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdSerialMatch", "PD_SERIAL LIKE ?") //LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdSerial",
						"(PD_SERIAL = ? OR PD_SERIAL IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdSerialasc", "PD_SERIAL ASC") // ORDER ASCENDING

				.addOrderBy("PdSerialdesc", "PD_SERIAL DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdPortId", /* PK attribute */
		"PD_PORT_ID = ?").addFilterBy("filterByPdPortIdMatch",
				"PD_PORT_ID LIKE ?")
				.addFilterBy("INPdPortId", "PD_PORT_ID IN ( ? )")
				// IN

				.addFilterBy("NOTINPdPortId", "PD_PORT_ID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdPortId", "PD_PORT_ID != ?")
				// NOTEQUAL

				.addFilterBy("nullPdPortId",
						"(PD_PORT_ID IS NULL OR LENGTH(PD_PORT_ID) IS NULL OR LENGTH(PD_PORT_ID) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdPortId", "PD_PORT_ID IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdPortId", "PD_PORT_ID < ?") // LESS THAN

				.addFilterBy("greaterthanPdPortId", "PD_PORT_ID > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdPortIdMatch", "PD_PORT_ID LIKE ?") // LIKE
				// ,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdPortId",
						"(PD_PORT_ID = ? OR PD_PORT_ID IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdPortIdasc", "PD_PORT_ID ASC") // ORDER ASCENDING

				.addOrderBy("PdPortIddesc", "PD_PORT_ID DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdMsisdn", /* PK attribute */
		"PD_MSISDN = ?").addFilterBy("filterByPdMsisdnMatch",
				"PD_MSISDN LIKE ?")
				.addFilterBy("INPdMsisdn", "PD_MSISDN IN ( ? )")
				// IN

				.addFilterBy("NOTINPdMsisdn", "PD_MSISDN NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdMsisdn", "PD_MSISDN != ?")
				// NOTEQUAL

				.addFilterBy("nullPdMsisdn",
						"(PD_MSISDN IS NULL OR LENGTH(PD_MSISDN) IS NULL OR LENGTH(PD_MSISDN) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdMsisdn", "PD_MSISDN IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdMsisdn", "PD_MSISDN < ?") // LESS THAN

				.addFilterBy("greaterthanPdMsisdn", "PD_MSISDN > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdMsisdnMatch", "PD_MSISDN LIKE ?") //LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdMsisdn",
						"(PD_MSISDN = ? OR PD_MSISDN IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdMsisdnasc", "PD_MSISDN ASC") // ORDER ASCENDING

				.addOrderBy("PdMsisdndesc", "PD_MSISDN DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdStatus", /* PK attribute */
		"PD_STATUS = ?").addFilterBy("filterByPdStatusMatch",
				"PD_STATUS LIKE ?")
				.addFilterBy("INPdStatus", "PD_STATUS IN ( ? )")
				// IN

				.addFilterBy("NOTINPdStatus", "PD_STATUS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdStatus", "PD_STATUS != ?")
				// NOTEQUAL

				.addFilterBy("nullPdStatus",
						"(PD_STATUS IS NULL OR LENGTH(PD_STATUS) IS NULL OR LENGTH(PD_STATUS) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdStatus", "PD_STATUS IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdStatus", "PD_STATUS < ?") // LESS THAN

				.addFilterBy("greaterthanPdStatus", "PD_STATUS > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdStatusMatch", "PD_STATUS LIKE ?") //LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdStatus",
						"(PD_STATUS = ? OR PD_STATUS IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdStatusasc", "PD_STATUS ASC") // ORDER ASCENDING

				.addOrderBy("PdStatusdesc", "PD_STATUS DESC") // ORDER
		// DESCENDING
		;

		table
				.addFilterBy("equalPdInOut", /* PK attribute */
				"PD_IN_OUT = ?")
				.addFilterBy("filterByPdInOutMatch", "PD_IN_OUT LIKE ?")
				.addFilterBy("INPdInOut", "PD_IN_OUT IN ( ? )")
				// IN

				.addFilterBy("NOTINPdInOut", "PD_IN_OUT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdInOut", "PD_IN_OUT != ?")
				// NOTEQUAL

				.addFilterBy("nullPdInOut",
						"(PD_IN_OUT IS NULL OR LENGTH(PD_IN_OUT) IS NULL OR LENGTH(PD_IN_OUT) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdInOut", "PD_IN_OUT IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdInOut", "PD_IN_OUT < ?") // LESS THAN

				.addFilterBy("greaterthanPdInOut", "PD_IN_OUT > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdInOutMatch", "PD_IN_OUT LIKE ?") //LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdInOut",
						"(PD_IN_OUT = ? OR PD_IN_OUT IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdInOutasc", "PD_IN_OUT ASC") // ORDER ASCENDING

				.addOrderBy("PdInOutdesc", "PD_IN_OUT DESC") // ORDER DESCENDING
		;

		table.addFilterBy("equalPdNetwrk", /* PK attribute */
		"PD_NETWRK = ?").addFilterBy("filterByPdNetwrkMatch",
				"PD_NETWRK LIKE ?")
				.addFilterBy("INPdNetwrk", "PD_NETWRK IN ( ? )")
				// IN

				.addFilterBy("NOTINPdNetwrk", "PD_NETWRK NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdNetwrk", "PD_NETWRK != ?")
				// NOTEQUAL

				.addFilterBy("nullPdNetwrk",
						"(PD_NETWRK IS NULL OR LENGTH(PD_NETWRK) IS NULL OR LENGTH(PD_NETWRK) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdNetwrk", "PD_NETWRK IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdNetwrk", "PD_NETWRK < ?") // LESS THAN

				.addFilterBy("greaterthanPdNetwrk", "PD_NETWRK > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdNetwrkMatch", "PD_NETWRK LIKE ?") //LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdNetwrk",
						"(PD_NETWRK = ? OR PD_NETWRK IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdNetwrkasc", "PD_NETWRK ASC") // ORDER ASCENDING

				.addOrderBy("PdNetwrkdesc", "PD_NETWRK DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdWaitMid", /* PK attribute */
		"PD_WAIT_MID = ?").addFilterBy("filterByPdWaitMidMatch",
				"PD_WAIT_MID LIKE ?")
				.addFilterBy("INPdWaitMid", "PD_WAIT_MID IN ( ? )")
				// IN

				.addFilterBy("NOTINPdWaitMid", "PD_WAIT_MID NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdWaitMid", "PD_WAIT_MID != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPdWaitMid",
						"(PD_WAIT_MID IS NULL OR LENGTH(PD_WAIT_MID) IS NULL OR LENGTH(PD_WAIT_MID) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdWaitMid", "PD_WAIT_MID IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdWaitMid", "PD_WAIT_MID < ?") // LESS
				// THAN

				.addFilterBy("greaterthanPdWaitMid", "PD_WAIT_MID > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdWaitMidMatch", "PD_WAIT_MID LIKE ?") // LIKE
				// ,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdWaitMid",
						"(PD_WAIT_MID = ? OR PD_WAIT_MID IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdWaitMidasc", "PD_WAIT_MID ASC") // ORDER
				// ASCENDING

				.addOrderBy("PdWaitMiddesc", "PD_WAIT_MID DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdTrans", /* PK attribute */
		"PD_TRANS = ?")
				.addFilterBy("filterByPdTransMatch", "PD_TRANS LIKE ?")
				.addFilterBy("INPdTrans", "PD_TRANS IN ( ? )")
				// IN

				.addFilterBy("NOTINPdTrans", "PD_TRANS NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdTrans", "PD_TRANS != ?")
				// NOTEQUAL

				.addFilterBy("nullPdTrans",
						"(PD_TRANS IS NULL OR LENGTH(PD_TRANS) IS NULL OR LENGTH(PD_TRANS) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdTrans", "PD_TRANS IS NOT NULL") // IS NOT
				// NULL

				.addFilterBy("lessthanPdTrans", "PD_TRANS < ?") // LESS THAN

				.addFilterBy("greaterthanPdTrans", "PD_TRANS > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdTransMatch", "PD_TRANS LIKE ?") // LIKE,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// , ANY

				.addFilterBy("equalornullPdTrans",
						"(PD_TRANS = ? OR PD_TRANS IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdTransasc", "PD_TRANS ASC") // ORDER ASCENDING

				.addOrderBy("PdTransdesc", "PD_TRANS DESC") // ORDER DESCENDING
		;

		table
				.addFilterBy("equalPdTransDate", "PD_TRANS_DATE = ?")
				// EQUAL

				.addFilterBy("notequalPdTransDate", "PD_TRANS_DATE != ?")
				// NOTEQUAL

				.addFilterBy("nullPdTransDate", "PD_TRANS_DATE IS NULL")
				// IS NULL

				.addFilterBy("notnullPdTransDate", "PD_TRANS_DATE IS NOT NULL")
				// IS NOT NULL

				.addFilterBy("lessthanPdTransDate", "PD_TRANS_DATE < ?")
				// LESS THAN

				.addFilterBy("greaterthanPdTransDate", "PD_TRANS_DATE > ?")
				// GREATER THAN

				.addFilterBy("lessthanorequalPdTransDate", "PD_TRANS_DATE <= ?") // LESS
																					// THAN
																					// OR
																					// EQUAL

				.addFilterBy("greaterthanorequalPdTransDate",
						"PD_TRANS_DATE >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenPdTransDate",
						"PD_TRANS_DATE BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullPdTransDate",
						"(PD_TRANS_DATE IS NULL OR PD_TRANS_DATE = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullPdTransDate",
						"(PD_TRANS_DATE IS NULL OR PD_TRANS_DATE < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullPdTransDate",
						"(PD_TRANS_DATE IS NULL OR PD_TRANS_DATE > ?)") // GREATERTHANORNULL

				.addFilterBy("INPdTransDate", "PD_TRANS_DATE IN ( ? )") // IN

				.addFilterBy("NOTINPdTransDate", "PD_TRANS_DATE NOT IN ( ? )") // NOT
																				// IN

				.addOrderBy("PdTransDateasc", "PD_TRANS_DATE ASC") // ORDER
																	// ASCENDING

				.addOrderBy("PdTransDatedesc", "PD_TRANS_DATE DESC") // ORDER
																		// DESCENDING
		;

		table.addFilterBy("equalPdN2nSent", /* PK attribute */
		"PD_N2N_SENT = ?").addFilterBy("filterByPdN2nSentMatch",
				"PD_N2N_SENT LIKE ?")
				.addFilterBy("INPdN2nSent", "PD_N2N_SENT IN ( ? )")
				// IN

				.addFilterBy("NOTINPdN2nSent", "PD_N2N_SENT NOT IN ( ? )")
				// NOT IN

				.addFilterBy("notequalPdN2nSent", "PD_N2N_SENT != ?")
				// NOTEQUAL

				.addFilterBy(
						"nullPdN2nSent",
						"(PD_N2N_SENT IS NULL OR LENGTH(PD_N2N_SENT) IS NULL OR LENGTH(PD_N2N_SENT) = 0)") // IS
				// NULL

				.addFilterBy("notnullPdN2nSent", "PD_N2N_SENT IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdN2nSent", "PD_N2N_SENT < ?") // LESS
				// THAN

				.addFilterBy("greaterthanPdN2nSent", "PD_N2N_SENT > ?") // GREATER
				// THAN

				.addFilterBy("filterByPdN2nSentMatch", "PD_N2N_SENT LIKE ?") // LIKE
				// ,
				// BEGINSWITH
				// ,
				// ENDSWITH
				// ,
				// ANY

				.addFilterBy("equalornullPdN2nSent",
						"(PD_N2N_SENT = ? OR PD_N2N_SENT IS NULL)") // EQUALORNULL
				// TODO : we may need to wrap this with a TRIM()

				.addOrderBy("PdN2nSentasc", "PD_N2N_SENT ASC") // ORDER
				// ASCENDING

				.addOrderBy("PdN2nSentdesc", "PD_N2N_SENT DESC") // ORDER
		// DESCENDING
		;

		table.addFilterBy("equalPdTimestamp", "PD_TIMESTAMP = ?") // EQUAL

				.addFilterBy("notequalPdTimestamp", "PD_TIMESTAMP != ?") // NOTEQUAL

				.addFilterBy("nullPdTimestamp", "PD_TIMESTAMP IS NULL") // IS
				// NULL

				.addFilterBy("notnullPdTimestamp", "PD_TIMESTAMP IS NOT NULL") // IS
				// NOT
				// NULL

				.addFilterBy("lessthanPdTimestamp", "PD_TIMESTAMP < ?") // LESS
				// THAN

				.addFilterBy("greaterthanPdTimestamp", "PD_TIMESTAMP > ?") // GREATER
				// THAN

				.addFilterBy("lessthanorequalPdTimestamp", "PD_TIMESTAMP <= ?") // LESS
				// THAN
				// OR
				// EQUAL

				.addFilterBy("greaterthanorequalPdTimestamp",
						"PD_TIMESTAMP >= ?") // GREATER THAN OR EQUAL

				.addFilterBy("betweenPdTimestamp",
						"PD_TIMESTAMP BETWEEN ? AND ?") // BETWEEN

				.addFilterBy("equalornullPdTimestamp",
						"(PD_TIMESTAMP IS NULL OR PD_TIMESTAMP = ?)") // EQUALORNULL

				.addFilterBy("lessthanornullPdTimestamp",
						"(PD_TIMESTAMP IS NULL OR PD_TIMESTAMP < ?)") // LESSTHANORNULL

				.addFilterBy("greaterthanornullPdTimestamp",
						"(PD_TIMESTAMP IS NULL OR PD_TIMESTAMP > ?)") // GREATERTHANORNULL

				.addFilterBy("INPdTimestamp", "PD_TIMESTAMP IN ( ? )") // IN

				.addFilterBy("NOTINPdTimestamp", "PD_TIMESTAMP NOT IN ( ? )") // NOT
				// IN

				.addOrderBy("PdTimestampasc", "PD_TIMESTAMP ASC") // ORDER
				// ASCENDING

				.addOrderBy("PdTimestampdesc", "PD_TIMESTAMP DESC") // ORDER
		// DESCENDING
		;
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PdPortDetailsAbstractDMLFactory();
		}

		return dml;
	}
}
