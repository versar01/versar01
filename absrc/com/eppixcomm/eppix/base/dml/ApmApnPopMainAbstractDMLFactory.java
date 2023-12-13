package com.eppixcomm.eppix.base.dml;


public class ApmApnPopMainAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;
	  
	  protected ApmApnPopMainAbstractDMLFactory() throws DMLException{
 
		    DMLTable table = defTable( "ApmApnPopMain", // dmlName
		            "blo.ApmApnPopMainDMO", // dmoName
		            "APM_APN_POP_MAIN", // tableName
		            10, // numColumns
		            "APM_TYPE, APM_ID, APM_NAME, APM_BILL_METHOD, APM_MSISDN, APM_ASSIGNED, APM_ACT_DATE, APM_DEACT_DATE, APM_ACTIVE, APM_WDP", // columnList
		            "APM_ID", //primaryKey
		            "" // versionCol     
		          , false, // generatedKey
		            "APM_TYPE, APM_ID, APM_NAME, APM_BILL_METHOD, APM_MSISDN, APM_ASSIGNED, APM_ACT_DATE, APM_DEACT_DATE, APM_ACTIVE, APM_WDP",
		            "", "",
		            new String[] {
		              "APM_TYPE", "APM_ID", "APM_NAME", "APM_BILL_METHOD", "APM_MSISDN", "APM_ASSIGNED", "APM_ACT_DATE", "APM_DEACT_DATE", "APM_ACTIVE", "APM_WDP"
		            }, true );

//============================================================================================
//		    ApmType APM_TYPE
		    table.addFilterBy( "equalApmType", "(APM_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmType", "(APM_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmType",
	      "(APM_TYPE IS NULL OR LENGTH((APM_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmType", "APM_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmType", "APM_TYPE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmType", "APM_TYPE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmTypeMatch", "APM_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmType",
	      "((APM_TYPE) = ? OR APM_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmType", "(APM_TYPE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmType", "(APM_TYPE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmTypeasc", "APM_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmTypedesc", "APM_TYPE DESC" ) // ORDER DESCENDING
	         ;
//============================================================================================
//		    ApmId APM_ID
		        table.addFilterBy( "equalApmId", "(APM_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalApmId", "(APM_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullApmId",
      "(APM_ID IS NULL OR LENGTH((APM_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullApmId", "APM_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanApmId", "APM_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanApmId", "APM_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByApmIdMatch", "APM_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullApmId",
      "((APM_ID) = ? OR APM_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INApmId", "(APM_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINApmId", "(APM_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ApmIdasc", "APM_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ApmIddesc", "APM_ID DESC" ) // ORDER DESCENDING
         ;
//============================================================================================
//		    ApmName APM_NAME
		        table.addFilterBy( "equalApmName", "(APM_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalApmName", "(APM_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullApmName",
      "(APM_NAME IS NULL OR LENGTH((APM_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullApmName", "APM_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanApmName", "APM_NAME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanApmName", "APM_NAME > ?" ) // GREATER THAN

         .addFilterBy( "filterByApmNameMatch", "APM_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullApmName",
      "((APM_NAME) = ? OR APM_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INApmName", "(APM_NAME) IN ( ? )" ) // IN

         .addFilterBy( "NOTINApmName", "(APM_NAME) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ApmNameasc", "APM_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "ApmNamedesc", "APM_NAME DESC" ) // ORDER DESCENDING
         ;
//============================================================================================
//		    ApmBillMethod APM_BILL_METHOD
         table.addFilterBy( "equalApmBillMethod", "(APM_BILL_METHOD) = ?" ) // EQUAL

         .addFilterBy( "notequalApmBillMethod", "(APM_BILL_METHOD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullApmBillMethod",
      "(APM_BILL_METHOD IS NULL OR LENGTH((APM_BILL_METHOD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullApmBillMethod", "APM_BILL_METHOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanApmBillMethod", "APM_BILL_METHOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanApmBillMethod", "APM_BILL_METHOD > ?" ) // GREATER THAN

         .addFilterBy( "filterByApmBillMethodMatch", "APM_BILL_METHOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullApmBillMethod",
      "((APM_BILL_METHOD) = ? OR APM_BILL_METHOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INApmBillMethod", "(APM_BILL_METHOD) IN ( ? )" ) // IN

         .addFilterBy( "NOTINApmBillMethod", "(APM_BILL_METHOD) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ApmBillMethodasc", "APM_BILL_METHOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "ApmBillMethoddesc", "APM_BILL_METHOD DESC" ) // ORDER DESCENDING
    ;		    
//============================================================================================
//		    ApmMsisdn APM_MSISDN
		    table.addFilterBy( "equalApmMsisdn", "(APM_MSISDN) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmMsisdn", "(APM_MSISDN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmMsisdn",
	      "(APM_MSISDN IS NULL OR LENGTH((APM_MSISDN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmMsisdn", "APM_MSISDN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmMsisdn", "APM_MSISDN < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmMsisdn", "APM_MSISDN > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmMsisdnMatch", "APM_MSISDN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmMsisdn",
	      "((APM_MSISDN) = ? OR APM_MSISDN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmMsisdn", "(APM_MSISDN) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmMsisdn", "(APM_MSISDN) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmMsisdnasc", "APM_MSISDN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmMsisdndesc", "APM_MSISDN DESC" ) // ORDER DESCENDING 
	         ;
//============================================================================================
//		    ApmAssigned APM_ASSIGNED
	         table.addFilterBy( "equalApmAssigned", "(APM_ASSIGNED) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmAssigned", "(APM_ASSIGNED) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmAssigned",
	      "(APM_ASSIGNED IS NULL OR LENGTH((APM_ASSIGNED)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmAssigned", "APM_ASSIGNED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmAssigned", "APM_ASSIGNED < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmAssigned", "APM_ASSIGNED > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmAssignedMatch", "APM_ASSIGNED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmAssigned",
	      "((APM_ASSIGNED) = ? OR APM_ASSIGNED IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmAssigned", "(APM_ASSIGNED) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmAssigned", "(APM_ASSIGNED) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmAssignedasc", "APM_ASSIGNED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmAssigneddesc", "APM_ASSIGNED DESC" ) // ORDER DESCENDING
	    ;
//============================================================================================
//		    ApmActDate APM_ACT_DATE
		    table.addFilterBy( "equalApmActDate", "(APM_ACT_DATE) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmActDate", "(APM_ACT_DATE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmActDate",
	      "(APM_ACT_DATE IS NULL OR LENGTH((APM_ACT_DATE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmActDate", "APM_ACT_DATE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmActDate", "APM_ACT_DATE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmActDate", "APM_ACT_DATE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmActDateMatch", "APM_ACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmActDate",
	      "((APM_ACT_DATE) = ? OR APM_ACT_DATE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmActDate", "(APM_ACT_DATE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmActDate", "(APM_ACT_DATE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmActDateasc", "APM_ACT_DATE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmActDatedesc", "APM_ACT_DATE DESC" ) // ORDER DESCENDING
	    ;
//============================================================================================
//		    ApmDeactDate APM_DEACT_DATE
		    table.addFilterBy( "equalApmDeactDate", "(APM_DEACT_DATE) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmDeactDate", "(APM_DEACT_DATE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmDeactDate",
	      "(APM_DEACT_DATE IS NULL)" ) // IS NULL

	         .addFilterBy( "notnullApmDeactDate", "APM_DEACT_DATE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmDeactDate", "APM_DEACT_DATE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmDeactDate", "APM_DEACT_DATE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmDeactDateMatch", "APM_DEACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmDeactDate",
	      "((APM_DEACT_DATE) = ? OR APM_DEACT_DATE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmDeactDate", "(APM_DEACT_DATE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmDeactDate", "(APM_DEACT_DATE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmDeactDateasc", "APM_DEACT_DATE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmDeactDatedesc", "APM_DEACT_DATE DESC" ) // ORDER DESCENDING
	    ;		    
//============================================================================================
//		    ApmActive APM_ACTIVE
		    table.addFilterBy( "equalApmActive", "(APM_ACTIVE) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmActive", "(APM_ACTIVE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmActive",
	      "(APM_ACTIVE IS NULL OR LENGTH((APM_ACTIVE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmActive", "APM_ACTIVE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmActive", "APM_ACTIVE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmActive", "APM_ACTIVE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmActiveMatch", "APM_ACTIVE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmActive",
	      "((APM_ACTIVE) = ? OR APM_ACTIVE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmActive", "(APM_ACTIVE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmActive", "(APM_ACTIVE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmActiveasc", "APM_ACTIVE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmActivedesc", "APM_ACTIVE DESC" ) // ORDER DESCENDING
	    ;
//============================================================================================
//		    ApmWdp APM_WDP
		    table.addFilterBy( "equalApmWdp", "(APM_WDP) = ?" ) // EQUAL

	         .addFilterBy( "notequalApmWdp", "(APM_WDP) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullApmWdp",
	      "(APM_WDP IS NULL OR LENGTH((APM_WDP)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullApmWdp", "APM_WDP IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanApmWdp", "APM_WDP < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanApmWdp", "APM_WDP > ?" ) // GREATER THAN

	         .addFilterBy( "filterByApmWdpMatch", "APM_WDP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullApmWdp",
	      "((APM_WDP) = ? OR APM_WDP IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INApmWdp", "(APM_WDP) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINApmWdp", "(APM_WDP) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "ApmWdpasc", "APM_WDP ASC" ) // ORDER ASCENDING

	         .addOrderBy( "ApmWdpdesc", "APM_WDP DESC" ) // ORDER DESCENDING
	    ;		    
//============================================================================================
		  
	  }
	
}
