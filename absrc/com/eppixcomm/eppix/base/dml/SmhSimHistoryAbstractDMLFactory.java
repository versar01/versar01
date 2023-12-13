package com.eppixcomm.eppix.base.dml;


public class SmhSimHistoryAbstractDMLFactory extends BaseDMLFactory{
	
	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	protected SmhSimHistoryAbstractDMLFactory() throws DMLException {

	    DMLTable table = defTable( "SmhSimHistory", // dmlName
	            "blo.SmhSimHistoryDMO", // dmoName
	            "SMH_SIM_HISTORY", // tableName
	            7, // numColumns
	            "SMH_COMMENT,SMH_HIST_CODE,SMH_SIM_NO,SMH_SUBSCRIBER_ID,SMH_TERMINAL_ID,SMH_TIMESTAMP,SMH_USER_ID", // columnList
	            null, //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	            "SMH_COMMENT,SMH_HIST_CODE,SMH_SIM_NO,SMH_SUBSCRIBER_ID,SMH_TERMINAL_ID,SMH_TIMESTAMP,SMH_USER_ID",
	            "", "",
	            new String[] {
	    		"SMH_COMMENT","SMH_HIST_CODE",
	    		"SMH_SIM_NO","SMH_SUBSCRIBER_ID",
	    		"SMH_TERMINAL_ID",
	    		"SMH_TIMESTAMP","SMH_USER_ID"
	            },false );

	        table.addFilterBy( "equalSmhComment", /* PK attribute */
	          "(VAM_MSISDN_NO) = ?" )
	             .addFilterBy( "filterBySmhCommentMatch", "SMH_COMMENT LIKE ?" )
	             .addFilterBy( "INSmhComment", "SMH_COMMENT IN ( ? )" ) // IN

	             .addFilterBy( "NOTINSmhComment", "SMH_COMMENT NOT IN ( ? )" ) // NOT IN

	             .addOrderBy( "SmhCommentasc", "SMH_COMMENT ASC" ) // ORDER ASCENDING

	             .addOrderBy( "SmhCommentdesc", "SMH_COMMENT DESC" ) // ORDER DESCENDING
	        ;

	        table.addFilterBy( "equalSmhSubscriberId", "SMH_SUBSCRIBER_ID = ?" ) // EQUAL

	             .addFilterBy( "notequalSmhSubscriberId", "SMH_SUBSCRIBER_ID != ?" ) // NOTEQUAL

	             .addFilterBy( "nullSmhSubscriberId", "SMH_SUBSCRIBER_ID IS NULL" ) // IS NULL

	             .addFilterBy( "notnullSmhSubscriberId",
	          "SMH_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

	             .addFilterBy( "lessthanSmhSubscriberId", "SMH_SUBSCRIBER_ID < ?" ) // LESS THAN

	             .addFilterBy( "greaterthanSmhSubscriberId", "SMH_SUBSCRIBER_ID > ?" ) // GREATER THAN

	             .addFilterBy( "lessthanorequalSmhSubscriberId",
	          "SMH_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

	             .addFilterBy( "greaterthanorequalSmhSubscriberId",
	          "SMH_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

	             .addFilterBy( "betweenVamSmhSubscriberId",
	          "SMH_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

	             .addFilterBy( "equalornullSmhSubscriberId",
	          "(SMH_SUBSCRIBER_ID IS NULL OR SMH_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

	             .addFilterBy( "lessthanornullSmhSubscriberId",
	          "(SMH_SUBSCRIBER_ID IS NULL OR SMH_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

	             .addFilterBy( "greaterthanornullSmhSubscriberId",
	          "(SMH_SUBSCRIBER_ID IS NULL OR SMH_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

	             .addFilterBy( "INSmhSubscriberId", "SMH_SUBSCRIBER_ID IN ( ? )" ) // IN

	             .addFilterBy( "NOTINSmhSubscriberId",
	          "SMH_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

	             .addOrderBy( "SmhSubscriberIdasc", "SMH_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

	             .addOrderBy( "SmhSubscriberIddesc", "SMH_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
	        ;

	        table.addFilterBy( "equalSmhSimNo", "(SMH_SIM_NO) = ?" ) // EQUAL

	             .addFilterBy( "notequalSmhSimNo", "(SMH_SIM_NO) != ?" ) // NOTEQUAL

	             .addFilterBy( "nullSmhSimNo",
	          "(SMH_SIM_NO IS NULL OR LENGTH((SMH_SIM_NO)) = 0)" ) // IS NULL

	             .addFilterBy( "notnullSmhSimNo", "SMH_SIM_NO IS NOT NULL" ) // IS NOT NULL

	             .addFilterBy( "filterBySmhSimNoMatch", "SMH_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	             .addFilterBy( "equalornullSmhSimNo",
	          "((SMH_SIM_NO) = ? OR SMH_SIM_NO IS NULL)" ) // EQUALORNULL

	             .addFilterBy( "INSmhSimNo", "SMH_SIM_NO IN ( ? )" ) // IN

	             .addFilterBy( "NOTINSmhSimNo", "SMH_SIM_NO NOT IN ( ? )" ) // NOT IN

	             .addOrderBy( "SmhSimNoasc", "SMH_SIM_NO ASC" ) // ORDER ASCENDING

	             .addOrderBy( "SmhSimNodesc", "SMH_SIM_NO DESC" ) // ORDER DESCENDING
	        ;

	        table.addFilterBy( "equalSmhHistCode", "(SMH_HIST_CODE) = ?" ) // EQUAL

	            .addFilterBy( "notequalSmhHistCode", "(SMH_HIST_CODE) != ?" ) // NOTEQUAL
	
	            .addFilterBy( "nullSmhHistCode",
	         "(SMH_HIST_CODE IS NULL OR LENGTH((SMH_HIST_CODE)) = 0)" ) // IS NULL
	
	            .addFilterBy( "notnullSmhHistCode", "SMH_HIST_CODE IS NOT NULL" ) // IS NOT NULL
	
	            .addFilterBy( "filterBySmhHistCodeMatch", "SMH_HIST_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	            .addFilterBy( "equalornullSmhHistCode",
	         "((SMH_HIST_CODE) = ? OR SMH_HIST_CODE IS NULL)" ) // EQUALORNULL
	
	            .addFilterBy( "INSmhHistCode", "SMH_HIST_CODE IN ( ? )" ) // IN
	
	            .addFilterBy( "NOTINSmhHistCode", "SMH_HIST_CODE NOT IN ( ? )" ) // NOT IN
	
	            .addOrderBy( "SmhHistCodeasc", "SMH_HIST_CODE ASC" ) // ORDER ASCENDING
	
	            .addOrderBy( "SmhHistCodedesc", "SMH_HIST_CODE DESC" ) // ORDER DESCENDING
	          ;	     
	        
	        table.addFilterBy( "equalSmhTerminalId", "(SMH_TERMINAL_ID) = ?" ) // EQUAL

	            .addFilterBy( "notequalSmhTerminalId", "(SMH_TERMINAL_ID) != ?" ) // NOTEQUAL
	
	            .addFilterBy( "nullSmhTerminalId",
	         "(SMH_TERMINAL_ID IS NULL OR LENGTH((SMH_TERMINAL_ID)) = 0)" ) // IS NULL
	
	            .addFilterBy( "notnullSmhTerminalId", "SMH_TERMINAL_ID IS NOT NULL" ) // IS NOT NULL
	
	            .addFilterBy( "filterBySmhTerminalIdMatch", "SMH_TERMINAL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	            .addFilterBy( "equalornullSmhTerminalId",
	         "((SMH_TERMINAL_ID) = ? OR SMH_TERMINAL_ID IS NULL)" ) // EQUALORNULL
	
	            .addFilterBy( "INSmhTerminalId", "SMH_TERMINAL_ID IN ( ? )" ) // IN
	
	            .addFilterBy( "NOTINSmhTerminalId", "SMH_TERMINAL_ID NOT IN ( ? )" ) // NOT IN
	
	            .addOrderBy( "SmhTerminalIdasc", "SMH_TERMINAL_ID ASC" ) // ORDER ASCENDING
	
	            .addOrderBy( "SmhTerminalIddesc", "SMH_TERMINAL_ID DESC" ) // ORDER DESCENDING
	          ;	
	        
	        table.addFilterBy( "equalSmhUserId", "(SMH_USER_ID) = ?" ) // EQUAL

	            .addFilterBy( "notequalSmhUserId", "(SMH_USER_ID) != ?" ) // NOTEQUAL
	
	            .addFilterBy( "nullSmhUserId",
	         "(SMH_USER_ID IS NULL OR LENGTH((SMH_USER_ID)) = 0)" ) // IS NULL
	
	            .addFilterBy( "notnullSmhUserId", "SMH_USER_ID IS NOT NULL" ) // IS NOT NULL
	
	            .addFilterBy( "filterBySmhUserIdMatch", "SMH_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	            .addFilterBy( "equalornullSmhUserId",
	         "((SMH_USER_ID) = ? OR SMH_USER_ID IS NULL)" ) // EQUALORNULL
	
	            .addFilterBy( "INSmhUserId", "SMH_USER_ID IN ( ? )" ) // IN
	
	            .addFilterBy( "NOTINSmhUserId", "SMH_USER_ID NOT IN ( ? )" ) // NOT IN
	
	            .addOrderBy( "SmhUserIdasc", "SMH_USER_ID ASC" ) // ORDER ASCENDING
	
	            .addOrderBy( "SmhUserIddesc", "SMH_USER_ID DESC" ) // ORDER DESCENDING
	          ;
	        
	        table.addFilterBy( "equalSmhTimestamp", "SMH_TIMESTAMP = ?" ) // EQUAL

		         .addFilterBy( "notequalSmhTimestamp", "SMH_TIMESTAMP != ?" ) // NOTEQUAL
	
		         .addFilterBy( "nullSmhTimestamp", "SMH_TIMESTAMP IS NULL" ) // IS NULL
	
		         .addFilterBy( "notnullSmhTimestamp", "SMH_TIMESTAMP IS NOT NULL" ) // IS NOT NULL
	
		         .addFilterBy( "lessthanSmhTimestamp", "SMH_TIMESTAMP < ?" ) // LESS THAN
	
		         .addFilterBy( "greaterthanSmhTimestamp", "SMH_TIMESTAMP > ?" ) // GREATER THAN
	
		         .addFilterBy( "lessthanorequalSmhTimestamp",
		      "SMH_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL
	
		         .addFilterBy( "greaterthanorequalSmhTimestamp",
		      "SMH_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL
	
		         .addFilterBy( "betweenSmhTimestamp",
		      "SMH_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN
	
		         .addFilterBy( "equalornullSmhTimestamp",
		      "(SMH_TIMESTAMP IS NULL OR SMH_TIMESTAMP = ?)" ) // EQUALORNULL
	
		         .addFilterBy( "lessthanornullSmhTimestamp",
		      "(SMH_TIMESTAMP IS NULL OR SMH_TIMESTAMP < ?)" ) // LESSTHANORNULL
	
		         .addFilterBy( "greaterthanornullSmhTimestamp",
		      "(SMH_TIMESTAMP IS NULL OR SMH_TIMESTAMP > ?)" ) // GREATERTHANORNULL
	
		         .addFilterBy( "INSmhTimestamp", "SMH_TIMESTAMP IN ( ? )" ) // IN
	
		         .addFilterBy( "NOTINSmhTimestamp", "SMH_TIMESTAMP NOT IN ( ? )" ) // NOT IN
	
		         .addOrderBy( "SmhTimestampasc", "SMH_TIMESTAMP ASC" ) // ORDER ASCENDING
	
		         .addOrderBy( "SmhTimestampdesc", "SMH_TIMESTAMP DESC" ) // ORDER DESCENDING
		       ;	        
	        ;
	      }

	
	public static DMLFactory getDMLFactory(  )
		throws DMLException {
			if ( dml == null ) {
			  dml = new SmhSimHistoryAbstractDMLFactory(  );
			}
		
			return dml;
		}
	
}
