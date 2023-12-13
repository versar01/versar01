package com.eppixcomm.eppix.base.dml;

public class UdaUserDefActAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;

	public UdaUserDefActAbstractDMLFactory()throws DMLException {
	
/*
	UDA_ACTION_ID
	UDA_ACTION_DESC
	UDA_ACTION_PATH
*/
		
		DMLTable table = defTable( "UdaUserDefAct", // dmlName
		        "blo.UdaUserDefActDMO", // dmoName
		        "UDA_USER_DEF_ACT", // tableName
		        3, // numColumns
		        "UDA_ACTION_ID, UDA_ACTION_DESC, UDA_ACTION_PATH", // columnList
		        "UDA_ACTION_ID", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "UDA_ACTION_ID, UDA_ACTION_DESC, UDA_ACTION_PATH", // List of fields
		        "", 
		        "",
		        new String[] {
		          // Field Names
				"UDA_ACTION_ID", "UDA_ACTION_DESC", "UDA_ACTION_PATH"
		        } );
		
		   table.addFilterBy( "equalUdaActionId", "(UDA_ACTION_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalUdaActionId", "(UDA_ACTION_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullUdaActionId",
	      "(UDA_ACTION_ID IS NULL OR LENGTH((UDA_ACTION_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullUdaActionId", "UDA_ACTION_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByUdaActionIdMatch", "UDA_ACTION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullUdaActionId",
	      "((UDA_ACTION_ID) = ? OR UDA_ACTION_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INUdaActionId", "UDA_ACTION_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINUdaActionId", "UDA_ACTION_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "UdaActionIdasc", "UDA_ACTION_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "UdaActionIddesc", "UDA_ACTION_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalUdaActionDesc", "(UDA_ACTION_DESC) = ?" ) // EQUAL

	         .addFilterBy( "notequalUdaActionDesc", "(UDA_ACTION_DESC) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullUdaActionDesc",
	      "(UDA_ACTION_DESC IS NULL OR LENGTH((UDA_ACTION_DESC)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullUdaActionDesc", "UDA_ACTION_DESC IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByUdaActionDescMatch", "UDA_ACTION_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullUdaActionDesc",
	      "((UDA_ACTION_DESC) = ? OR UDA_ACTION_DESC IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INUdaActionDesc", "UDA_ACTION_DESC IN ( ? )" ) // IN

	         .addFilterBy( "NOTINUdaActionDesc", "UDA_ACTION_DESC NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "UdaActionDescasc", "UDA_ACTION_DESC ASC" ) // ORDER ASCENDING

	         .addOrderBy( "UdaActionDescdesc", "UDA_ACTION_DESC DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalUdaActionPath", "(UDA_ACTION_PATH) = ?" ) // EQUAL

	         .addFilterBy( "notequalUdaActionPath", "(UDA_ACTION_PATH) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullUdaActionPath",
	      "(UDA_ACTION_PATH IS NULL OR LENGTH((UDA_ACTION_PATH)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullUdaActionPath", "UDA_ACTION_PATH IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByUdaActionPathMatch", "UDA_ACTION_PATH LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullUdaActionPath",
	      "((UDA_ACTION_PATH) = ? OR UDA_ACTION_PATH IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INUdaActionPath", "UDA_ACTION_PATH IN ( ? )" ) // IN

	         .addFilterBy( "NOTINUdaActionPath", "UDA_ACTION_PATH NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "UdaActionPathasc", "UDA_ACTION_PATH ASC" ) // ORDER ASCENDING

	         .addOrderBy( "UdaActionPathdesc", "UDA_ACTION_PATH DESC" ) // ORDER DESCENDING
	    ;
	}
	
	
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new UdaUserDefActDMLFactory(  );
	    }
	    return dml;
	  }
	
}
