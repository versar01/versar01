package com.eppixcomm.eppix.base.dml;


public class AneApnNonEppixAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;
	  
	  protected AneApnNonEppixAbstractDMLFactory() throws DMLException{
		  
		    DMLTable table = defTable( "AneApnNonEppix", // dmlName
		            "blo.AneApnNonEppixDMO", // dmoName
		            "ANE_APN_NON_EPPIX", // tableName
		            4, // numColumns
		            "ANE_APN_ID, ANE_MSISDN, ANE_ACT_DATE, ANE_DEACT_DATE", // columnList
		            null, //primaryKey
		            "" // versionCol     
		          , false, // generatedKey
		            "ANE_APN_ID, ANE_MSISDN, ANE_ACT_DATE, ANE_DEACT_DATE",
		            "", "",
		            new String[] {
		              "ANE_APN_ID", "ANE_MSISDN", "ANE_ACT_DATE", "ANE_DEACT_DATE"
		            }, false );
		    
//============================================================================================		    
		    table.addFilterBy( "equalAneApnId", "(ANE_APN_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalAneApnId", "(ANE_APN_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullAneApnId",
	      "(ANE_APN_ID IS NULL OR LENGTH((ANE_APN_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullAneApnId", "ANE_APN_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanAneApnId", "ANE_APN_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanAneApnId", "ANE_APN_ID > ?" ) // GREATER THAN

	         .addFilterBy( "filterByAneApnIdMatch", "ANE_APN_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullAneApnId",
	      "((ANE_APN_ID) = ? OR ANE_APN_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INAneApnId", "(ANE_APN_ID) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINAneApnId", "(ANE_APN_ID) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "AneApnIdasc", "ANE_APN_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "AneApnIddesc", "ANE_APN_ID DESC" ) // ORDER DESCENDING
	    ;		    
//============================================================================================
//		    AneMsisdn ANE_MSISDN 
		    
		    table.addFilterBy( "equalAneMsisdn", "(ANE_MSISDN) = ?" ) // EQUAL

	         .addFilterBy( "notequalAneMsisdn", "(ANE_MSISDN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullAneMsisdn",
	      "(ANE_MSISDN IS NULL OR LENGTH((ANE_MSISDN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullAneMsisdn", "ANE_MSISDN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanAneMsisdn", "ANE_MSISDN < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanAneMsisdn", "ANE_MSISDN > ?" ) // GREATER THAN

	         .addFilterBy( "filterByAneMsisdnMatch", "ANE_MSISDN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullAneMsisdn",
	      "((ANE_MSISDN) = ? OR ANE_MSISDN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INAneMsisdn", "(ANE_MSISDN) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINAneMsisdn", "(ANE_MSISDN) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "AneMsisdnasc", "ANE_MSISDN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "AneMsisdndesc", "ANE_MSISDN DESC" ) // ORDER DESCENDING
	    ;		    
		    
//============================================================================================
//		  AneActdate ANE_ACT_DATE
		    
		    table.addFilterBy( "equalAneActdate", "(ANE_ACT_DATE) = ?" ) // EQUAL

	         .addFilterBy( "notequalAneActdate", "(ANE_ACT_DATE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullAneActdate",
	      "(ANE_ACT_DATE IS NULL OR LENGTH((ANE_ACT_DATE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullAneActdate", "ANE_ACT_DATE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanAneActdate", "ANE_ACT_DATE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanAneActdate", "ANE_ACT_DATE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByAneActdateMatch", "ANE_ACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullAneActdate",
	      "((ANE_ACT_DATE) = ? OR ANE_ACT_DATE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INAneActdate", "(ANE_ACT_DATE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINAneActdate", "(ANE_ACT_DATE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "AneActdateasc", "ANE_ACT_DATE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "AneActdatedesc", "ANE_ACT_DATE DESC" ) // ORDER DESCENDING
	    ;		    
//============================================================================================
// 	AneDeactDate ANE_DEACT_DATE		   
		    table.addFilterBy( "equalAneDeactDate", "(ANE_DEACT_DATE) = ?" ) // EQUAL

	         .addFilterBy( "notequalAneDeactDate", "(ANE_DEACT_DATE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullAneDeactDate",
	      "(ANE_DEACT_DATE IS NULL OR LENGTH((ANE_DEACT_DATE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullAneDeactDate", "ANE_DEACT_DATE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanAneDeactDate", "ANE_DEACT_DATE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanAneDeactDate", "ANE_DEACT_DATE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByAneDeactDateMatch", "ANE_DEACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullAneDeactDate",
	      "((ANE_DEACT_DATE) = ? OR ANE_DEACT_DATE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INAneDeactDate", "(ANE_DEACT_DATE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINAneDeactDate", "(ANE_DEACT_DATE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "AneDeactDateasc", "ANE_DEACT_DATE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "AneDeactDatedesc", "ANE_DEACT_DATE DESC" ) // ORDER DESCENDING
	    ;		    
//============================================================================================
		  
	  }
}
