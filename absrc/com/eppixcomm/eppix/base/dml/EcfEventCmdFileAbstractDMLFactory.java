package com.eppixcomm.eppix.base.dml;

public class EcfEventCmdFileAbstractDMLFactory extends BaseDMLFactory {

	
	private static DMLFactory dml = null;
	
	protected EcfEventCmdFileAbstractDMLFactory(  )
    throws DMLException {
    	
	DMLTable table = defTable( "EcfEventCmdFile", // dmlName
	        "blo.EcfEventCmdFileDMO", // dmoName
	        "ECF_EVENT_CMD_FILE", // tableName
	        6, // numColumns
	        "ECF_COMMAND, ECF_SORB_ORDER, ECF_STATUS, ECF_FILE, ECF_TIMESTAMP, ECF_SPID", // columnList
	        null, //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "ECF_COMMAND, ECF_SORB_ORDER, ECF_STATUS, ECF_FILE, ECF_TIMESTAMP, ECF_SPID",
	        "", "",
	        new String[] {
	          "ECF_COMMAND", "ECF_SORB_ORDER", "ECF_STATUS", "ECF_FILE", "ECF_TIMESTAMP", "ECF_SPID"
	        }, false);
	
	table.addFilterBy( "equalEcfCommand", "(ECF_COMMAND) = ?" ) // EQUAL

       .addFilterBy( "notequalEcfCommand", "(ECF_COMMAND) != ?" ) // NOTEQUAL

       .addFilterBy( "nullEcfCommand",
    "(ECF_COMMAND IS NULL OR LENGTH((ECF_COMMAND)) = 0)" ) // IS NULL

       .addFilterBy( "notnullEcfCommand", "ECF_COMMAND IS NOT NULL" ) // IS NOT NULL

       .addFilterBy( "filterByEcfCommandMatch", "ECF_COMMAND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

       .addFilterBy( "equalornullEcfCommand",
    "((ECF_COMMAND) = ? OR ECF_COMMAND IS NULL)" ) // EQUALORNULL

       .addFilterBy( "INEcfCommand", "ECF_COMMAND IN ( ? )" ) // IN

       .addFilterBy( "NOTINEcfCommand", "ECF_COMMAND NOT IN ( ? )" ) // NOT IN

       .addOrderBy( "EcfCommandasc", "ECF_COMMAND ASC" ) // ORDER ASCENDING

       .addOrderBy( "EcfCommanddesc", "ECF_COMMAND DESC" ) // ORDER DESCENDING
  ;
	
	table.addFilterBy( "equalEcfSorbOrder", "(ECF_SORB_ORDER) = ?" ) // EQUAL

       .addFilterBy( "notequalEcfSorbOrder", "(ECF_SORB_ORDER) != ?" ) // NOTEQUAL

       .addFilterBy( "nullEcfSorbOrder",
    "(ECF_SORB_ORDER IS NULL OR LENGTH((ECF_SORB_ORDER)) = 0)" ) // IS NULL

       .addFilterBy( "notnullEcfSorbOrder", "(ECF_SORB_ORDER IS NOT NULL" ) // IS NOT NULL

       .addFilterBy( "filterByEcfSorbOrderMatch", "(ECF_SORB_ORDER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

       .addFilterBy( "equalornullEcfSorbOrder",
    "((ECF_SORB_ORDER) = ? OR ECF_SORB_ORDER IS NULL)" ) // EQUALORNULL

       .addFilterBy( "INEcfSorbOrder", "ECF_FILE IN ( ? )" ) // IN

       .addFilterBy( "NOTINEcfSorbOrder", "ECF_FILE NOT IN ( ? )" ) // NOT IN

       .addOrderBy( "EcfSorbOrderasc", "ECF_FILE ASC" ) // ORDER ASCENDING

       .addOrderBy( "EcfSorbOrderdesc", "ECF_FILE DESC" ) // ORDER DESCENDING
  ;
	table.addFilterBy( "equalEcfStatus", "(ECF_STATUS) = ?" ) // EQUAL

       .addFilterBy( "notequalEcfStatus", "(ECF_STATUS) != ?" ) // NOTEQUAL

       .addFilterBy( "nullEcfStatus",
    "(ECF_STATUS IS NULL OR LENGTH((ECF_STATUS)) = 0)" ) // IS NULL

       .addFilterBy( "notnullEcfStatus", "ECF_STATUS IS NOT NULL" ) // IS NOT NULL

       .addFilterBy( "filterByEcfStatusMatch", "ECF_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

       .addFilterBy( "equalornullEcfStatus",
    "((ECF_STATUS) = ? OR ECF_STATUS IS NULL)" ) // EQUALORNULL

       .addFilterBy( "INEcfStatus", "ECF_STATUS IN ( ? )" ) // IN

       .addFilterBy( "NOTINEcfStatus", "ECF_STATUS NOT IN ( ? )" ) // NOT IN

       .addOrderBy( "EcfStatusasc", "ECF_STATUS ASC" ) // ORDER ASCENDING

       .addOrderBy( "EcfStatusdesc", "ECF_STATUS DESC" ) // ORDER DESCENDING
  ;
	   
	table.addFilterBy( "equalEcfFile", "(ECF_FILE) = ?" ) // EQUAL

       .addFilterBy( "notequalEcfFile", "(ECF_FILE) != ?" ) // NOTEQUAL

       .addFilterBy( "nullEcfFile",
    "(ECF_FILE IS NULL OR LENGTH((ECF_FILE)) = 0)" ) // IS NULL

       .addFilterBy( "notnullEcfFile", "ECF_FILE IS NOT NULL" ) // IS NOT NULL

       .addFilterBy( "filterByEcfFileMatch", "ECF_FILE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

       .addFilterBy( "equalornullEcfFile",
    "((ECF_FILE) = ? OR ECF_FILE IS NULL)" ) // EQUALORNULL

       .addFilterBy( "INEcfFile", "ECF_FILE IN ( ? )" ) // IN

       .addFilterBy( "NOTINEcfFile", "ECF_FILE NOT IN ( ? )" ) // NOT IN

       .addOrderBy( "EcfFileasc", "ECF_FILE ASC" ) // ORDER ASCENDING

       .addOrderBy( "EcfFiledesc", "ECF_FILE DESC" ) // ORDER DESCENDING
  ;
	   
	table.addFilterBy( "equalEcfTimestamp", "ECF_TIMESTAMP = ?" ) // EQUAL

        .addFilterBy( "notequalEcfTimestamp", "ECF_TIMESTAMP != ?" ) // NOTEQUAL

        .addFilterBy( "nullEcfTimestamp", "ECF_TIMESTAMP IS NULL" ) // IS NULL

        .addFilterBy( "notnullEcfTimestamp", "ECF_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanEcfTimestamp", "ECF_TIMESTAMP < ?" ) // LESS THAN

        .addFilterBy( "greaterthanEcfTimestamp", "ECF_TIMESTAMP > ?" ) // GREATER THAN

        .addFilterBy( "lessthanorequalEcfTimestamp", "ECF_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

        .addFilterBy( "greaterthanorequalEcfTimestamp", "ECF_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

        .addFilterBy( "betweenEcfTimestamp", "ECF_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

        .addFilterBy( "equalornullEcfTimestamp",
     "(ECF_TIMESTAMP IS NULL OR ECF_TIMESTAMP = ?)" ) // EQUALORNULL

        .addFilterBy( "lessthanornullEcfTimestamp",
     "(ECF_TIMESTAMP IS NULL OR ECF_TIMESTAMP < ?)" ) // LESSTHANORNULL

        .addFilterBy( "greaterthanornullEcfTimestamp",
     "(ECF_TIMESTAMP IS NULL OR ECF_TIMESTAMP > ?)" ) // GREATERTHANORNULL

        .addFilterBy( "INEcfTimestamp", "ECF_TIMESTAMP IN ( ? )" ) // IN

        .addFilterBy( "NOTINEcfTimestamp", "ECF_TIMESTAMP NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "EcfTimestampasc", "ECF_TIMESTAMP ASC" ) // ORDER ASCENDING

        .addOrderBy( "EcfTimestampdesc", "ECF_TIMESTAMP DESC" ) // ORDER DESCENDING
   ;
	
	table.addFilterBy( "equalEcfSpid", "(ECF_SPID) = ?" ) // EQUAL

    .addFilterBy( "notequalEcfSpid", "(ECF_SPID) != ?" ) // NOTEQUAL

    .addFilterBy( "nullEcfSpid",
 "(ECF_SPID IS NULL OR LENGTH((ECF_SPID)) = 0)" ) // IS NULL

    .addFilterBy( "notnullEcfSpid", "ECF_SPID IS NOT NULL" ) // IS NOT NULL

    .addFilterBy( "filterByEcfSpidMatch", "ECF_SPID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

    .addFilterBy( "equalornullEcfSpid",
 "((ECF_SPID) = ? OR ECF_SPID IS NULL)" ) // EQUALORNULL

    .addFilterBy( "INEcfSpid", "ECF_SPID IN ( ? )" ) // IN

    .addFilterBy( "NOTINEcfSpid", "ECF_SPID NOT IN ( ? )" ) // NOT IN

    .addOrderBy( "EcfSpidasc", "ECF_SPID ASC" ) // ORDER ASCENDING

    .addOrderBy( "EcfSpiddesc", "ECF_SPID DESC" ) // ORDER DESCENDING
;
	    
	}	   

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EcfEventCmdFileDMLFactory(  );
	    }

	    return dml;
	  }
}
