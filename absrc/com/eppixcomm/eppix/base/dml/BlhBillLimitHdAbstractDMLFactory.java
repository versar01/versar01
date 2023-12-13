package com.eppixcomm.eppix.base.dml;

public class BlhBillLimitHdAbstractDMLFactory extends BaseDMLFactory {

	  private static DMLFactory dml = null;
	  
	protected BlhBillLimitHdAbstractDMLFactory() throws DMLException {

		DMLTable table = defTable( "BlhBillLimitHd", // dmlName
		        "blo.BlhBillLimitHdDMO", // dmoName
		        "BLH_BILL_LIMIT_HD", // tableName
		        17, // numColumns
		        "BLH_SUBSCRIBER_ID, BLH_SERVICE_CODE, BLH_BILL_LIMIT_VAL, BLH_LEVEL,"
		        + "BLH_TYPE, BLH_VAT_IND, BLH_UNBILL_USAGE, BLH_UNBILL_CHARGES, BLH_DIFF,"
		        + "BLH_USER_STATUS, BLH_NEXT_THRESHOLD, BLH_PREV_THRESHOLD, BLH_NEXT_ACN_ID,"
		        + "BLH_PREV_ACN_ID, BLH_NETWORK_ACN, BLH_TRIG_FLAG, BLH_LAST_UPDATE", // columnList
		        "BLH_SUBSCRIBER_ID" + ", BLH_SERVICE_CODE", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		      "BLH_SUBSCRIBER_ID, BLH_SERVICE_CODE, BLH_BILL_LIMIT_VAL, BLH_LEVEL,"
		        + "BLH_TYPE, BLH_VAT_IND, BLH_UNBILL_USAGE, BLH_UNBILL_CHARGES, BLH_DIFF,"
		        + "BLH_USER_STATUS, BLH_NEXT_THRESHOLD, BLH_PREV_THRESHOLD, BLH_NEXT_ACN_ID,"
		        + "BLH_PREV_ACN_ID, BLH_NETWORK_ACN, BLH_TRIG_FLAG, BLH_LAST_UPDATE",
		        "", "",
		        new String[] {
				"BLH_SUBSCRIBER_ID", "BLH_SERVICE_CODE","BLH_BILL_LIMIT_VAL", "BLH_LEVEL",
				"BLH_TYPE", "BLH_VAT_IND", "BLH_UNBILL_USAGE", "BLH_UNBILL_CHARGES",
				"BLH_DIFF", "BLH_USER_STATUS", "BLH_NEXT_THRESHOLD", "BLH_PREV_THRESHOLD",
				"BLH_NEXT_ACN_ID", "BLH_PREV_ACN_ID", "BLH_NETWORK_ACN", "BLH_TRIG_FLAG",
				"BLH_LAST_UPDATE"
		        } );
		
		table.addFilterBy( "equalBlhSubscriberId", /* PK attribute */
	      "BLH_SUBSCRIBER_ID = ?" )
	         .addFilterBy( "filterByBlhSubscriberIdMatch", "BLH_SUBSCRIBER_ID LIKE ?" )
	         .addFilterBy( "INBlhSubscriberId", "BLH_SUBSCRIBER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINBlhSubscriberId", "BLH_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalBlhSubscriberId", "BLH_SUBSCRIBER_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullBlhSubscriberId",
	      "(BLH_SUBSCRIBER_ID IS NULL OR LENGTH(BLH_SUBSCRIBER_ID) IS NULL OR LENGTH(BLH_SUBSCRIBER_ID) = 0)" ) // IS NULL

	         .addFilterBy( "notnullBlhSubscriberId", "BLH_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanBlhSubscriberId", "BLH_SUBSCRIBER_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanBlhSubscriberId", "BLH_SUBSCRIBER_ID > ?" ) // GREATER THAN

	         .addFilterBy( "filterByBlhSubscriberIdMatch", "BLH_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullBlhSubscriberId",
	      "(BLH_SUBSCRIBER_ID = ? OR BLH_SUBSCRIBER_ID IS NULL)" ) // EQUALORNULL
	                                                         // TODO : we may need to wrap this with a TRIM() 

	         .addOrderBy( "BlhSubscriberIdasc", "BLH_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "BlhSubscriberIddesc", "BLH_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING

	         .addFilterBy( "equalBlhServiceCode", /* PK attribute */
	         "BLH_SERVICE_CODE = ?" )
	            .addFilterBy( "filterByBlhServiceCodeMatch", "BLH_SERVICE_CODE LIKE ?" )
	            .addFilterBy( "INBlhServiceCode", "BLH_SERVICE_CODE IN ( ? )" ) // IN

	            .addFilterBy( "NOTINBlhServiceCode", "BLH_SERVICE_CODE NOT IN ( ? )" ) // NOT IN

	            .addFilterBy( "notequalBlhServiceCode", "BLH_SERVICE_CODE != ?" ) // NOTEQUAL

	            .addFilterBy( "nullBlhServiceCode",
	         "(BLH_SERVICE_CODE IS NULL OR LENGTH(BLH_SERVICE_CODE) IS NULL OR LENGTH(BLH_SERVICE_CODE) = 0)" ) // IS NULL

	            .addFilterBy( "notnullBlhServiceCode", "BLH_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

	            .addFilterBy( "lessthanBlhServiceCode", "BLH_SERVICE_CODE < ?" ) // LESS THAN

	            .addFilterBy( "greaterthanBlhServiceCode", "BLH_SERVICE_CODE > ?" ) // GREATER THAN

	            .addFilterBy( "filterByBlhServiceCodeMatch", "BLH_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	            .addFilterBy( "equalornullBlhServiceCode",
	         "(BLH_SERVICE_CODE = ? OR BLH_SERVICE_CODE IS NULL)" ) // EQUALORNULL
	                                                        // TODO : we may need to wrap this with a TRIM() 

	            .addOrderBy( "BlhServiceCodeasc", "BLH_SERVICE_CODE ASC" ) // ORDER ASCENDING

	            .addOrderBy( "BlhServiceCodedesc", "BLH_SERVICE_CODE DESC" ) // ORDER DESCENDING
	       ;
		
	    table.addFilterBy( "equalBlhBillLimitVal", "BLH_BILL_LIMIT_VAL = ?" ) // EQUAL

        .addFilterBy( "notequalBlhBillLimitVal", "BLH_BILL_LIMIT_VAL != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhBillLimitVal",
     "(BLH_BILL_LIMIT_VAL IS NULL OR LENGTH(BLH_BILL_LIMIT_VAL) IS NULL OR LENGTH(BLH_BILL_LIMIT_VAL) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhBillLimitVal", "BLH_BILL_LIMIT_VAL IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhBillLimitVal", "BLH_BILL_LIMIT_VAL < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhBillLimitVal", "BLH_BILL_LIMIT_VAL > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhBillLimitValMatch", "BLH_BILL_LIMIT_VAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhBillLimitVal",
     "(BLH_BILL_LIMIT_VAL = ? OR BLH_BILL_LIMIT_VAL IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhBillLimitVal", "BLH_BILL_LIMIT_VAL IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhBillLimitVal", "BLH_BILL_LIMIT_VAL NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhBillLimitValasc", "BLH_BILL_LIMIT_VAL ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhBillLimitValdesc", "BLH_BILL_LIMIT_VAL DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhLevel", "BLH_LEVEL = ?" ) // EQUAL

        .addFilterBy( "notequalBlhLevel", "BLH_LEVEL != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhLevel",
     "(BLH_LEVEL IS NULL OR LENGTH(BLH_LEVEL) IS NULL OR LENGTH(BLH_LEVEL) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhLevel", "BLH_LEVEL IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhLevel", "BLH_LEVEL < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhLevel", "BLH_LEVEL > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhLevelMatch", "BLH_LEVEL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhLevel",
     "(BLH_LEVEL = ? OR BLH_LEVEL IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhLevel", "BLH_LEVEL IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhLevel", "BLH_LEVEL NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhLevelasc", "BLH_LEVEL ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhLeveldesc", "BLH_LEVEL DESC" ) // ORDER DESCENDING
   ;
	    

	    table.addFilterBy( "equalBlhType", "BLH_TYPE = ?" ) // EQUAL

	         .addFilterBy( "notequalBlhType", "BLH_TYPE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullBlhType",
	      "(BLH_TYPE IS NULL OR LENGTH(BLH_TYPE) IS NULL OR LENGTH(BLH_TYPE) = 0)" ) // IS NULL

	         .addFilterBy( "notnullBlhType", "BLH_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanBlhType", "BLH_TYPE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanBlhType", "BLH_TYPE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByBlhTypeMatch", "BLH_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullBlhType",
	      "(BLH_TYPE = ? OR BLH_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INBlhType", "BLH_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINBlhType", "BLH_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "BlhTypeasc", "BLH_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "BlhTypedesc", "BLH_TYPE DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalBlhVatInd", "BLH_VAT_IND = ?" ) // EQUAL

        .addFilterBy( "notequalBlhVatInd", "BLH_VAT_IND != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhVatInd",
     "(BLH_VAT_IND IS NULL OR LENGTH(BLH_VAT_IND) IS NULL OR LENGTH(BLH_VAT_IND) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhVatInd", "BLH_VAT_IND IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhVatInd", "BLH_VAT_IND < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhVatInd", "BLH_VAT_IND > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhVatIndMatch", "BLH_VAT_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhVatInd",
     "(BLH_VAT_IND = ? OR BLH_VAT_IND IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhVatInd", "BLH_VAT_IND IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhVatInd", "BLH_VAT_IND NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhVatIndasc", "BLH_VAT_IND ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhVatInddesc", "BLH_VAT_IND DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhUnbillUsage", "BLH_UNBILL_USAGE = ?" ) // EQUAL

        .addFilterBy( "notequalBlhUnbillUsage", "BLH_UNBILL_USAGE != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhUnbillUsage",
     "(BLH_UNBILL_USAGE IS NULL OR LENGTH(BLH_UNBILL_USAGE) IS NULL OR LENGTH(BLH_UNBILL_USAGE) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhUnbillUsage", "BLH_UNBILL_USAGE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhUnbillUsage", "BLH_UNBILL_USAGE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhUnbillUsage", "BLH_UNBILL_USAGE > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhUnbillUsageMatch", "BLH_UNBILL_USAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhUnbillUsage",
     "(BLH_UNBILL_USAGE = ? OR BLH_UNBILL_USAGE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhUnbillUsage", "BLH_UNBILL_USAGE IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhUnbillUsage", "BLH_UNBILL_USAGE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhUnbillUsageasc", "BLH_UNBILL_USAGE ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhUnbillUsagedesc", "BLH_UNBILL_USAGE DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhUnbillCharges", "BLH_UNBILL_CHARGES = ?" ) // EQUAL

        .addFilterBy( "notequalBlhUnbillCharges", "BLH_UNBILL_CHARGES != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhUnbillCharges",
     "(BLH_UNBILL_CHARGES IS NULL OR LENGTH(BLH_UNBILL_CHARGES) IS NULL OR LENGTH(BLH_UNBILL_CHARGES) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhUnbillCharges", "BLH_UNBILL_CHARGES IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhUnbillCharges", "BLH_UNBILL_CHARGES < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhUnbillCharges", "BLH_UNBILL_CHARGES > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhUnbillChargesMatch", "BLH_UNBILL_CHARGES LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhUnbillCharges",
     "(BLH_UNBILL_CHARGES = ? OR BLH_UNBILL_CHARGES IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhUnbillCharges", "BLH_UNBILL_CHARGES IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhUnbillCharges", "BLH_UNBILL_CHARGES NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhUnbillChargesasc", "BLH_UNBILL_CHARGES ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhUnbillChargesdesc", "BLH_UNBILL_CHARGES DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhDiff", "BLH_DIFF = ?" ) // EQUAL

        .addFilterBy( "notequalBlhDiff", "BLH_DIFF != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhDiff",
     "(BLH_DIFF IS NULL OR LENGTH(BLH_DIFF) IS NULL OR LENGTH(BLH_DIFF) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhDiff", "BLH_DIFF IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhDiff", "BLH_DIFF < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhDiff", "BLH_DIFF > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhDiffMatch", "BLH_DIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhDiff",
     "(BLH_DIFF = ? OR BLH_DIFF IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhDiff", "BLH_DIFF IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhDiff", "BLH_DIFF NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhDiffasc", "BLH_DIFF ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhDiffdesc", "BLH_DIFF DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhUserStatus", "BLH_USER_STATUS = ?" ) // EQUAL

        .addFilterBy( "notequalBlhUserStatus", "BLH_USER_STATUS != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhUserStatus",
     "(BLH_USER_STATUS IS NULL OR LENGTH(BLH_USER_STATUS) IS NULL OR LENGTH(BLH_USER_STATUS) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhUserStatus", "BLH_USER_STATUS IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhUserStatus", "BLH_USER_STATUS < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhUserStatus", "BLH_USER_STATUS > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhUserStatusMatch", "BLH_USER_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhUserStatus",
     "(BLH_USER_STATUS = ? OR BLH_USER_STATUS IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhUserStatus", "BLH_USER_STATUS IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhUserStatus", "BLH_USER_STATUS NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhUserStatusasc", "BLH_USER_STATUS ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhUserStatusdesc", "BLH_USER_STATUS DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhNextThreshold", "BLH_NEXT_THRESHOLD = ?" ) // EQUAL

        .addFilterBy( "notequalBlhNextThreshold", "BLH_NEXT_THRESHOLD != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhNextThreshold",
     "(BLH_NEXT_THRESHOLD IS NULL OR LENGTH(BLH_NEXT_THRESHOLD) IS NULL OR LENGTH(BLH_NEXT_THRESHOLD) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhNextThreshold", "BLH_NEXT_THRESHOLD IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhNextThreshold", "BLH_NEXT_THRESHOLD < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhNextThreshold", "BLH_NEXT_THRESHOLD > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhNextThresholdMatch", "BLH_NEXT_THRESHOLD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhNextThreshold",
     "(BLH_NEXT_THRESHOLD = ? OR BLH_NEXT_THRESHOLD IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhNextThreshold", "BLH_NEXT_THRESHOLD IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhNextThreshold", "BLH_NEXT_THRESHOLD NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhNextThresholdasc", "BLH_NEXT_THRESHOLD ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhNextThresholddesc", "BLH_NEXT_THRESHOLD DESC" ) // ORDER DESCENDING
   ;

	    table.addFilterBy( "equalBlhPrevThreshold", "BLH_PREV_THRESHOLD = ?" ) // EQUAL

        .addFilterBy( "notequalBlhPrevThreshold", "BLH_PREV_THRESHOLD != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhPrevThreshold",
     "(BLH_PREV_THRESHOLD IS NULL OR LENGTH(BLH_PREV_THRESHOLD) IS NULL OR LENGTH(BLH_PREV_THRESHOLD) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhPrevThreshold", "BLH_PREV_THRESHOLD IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhPrevThreshold", "BLH_PREV_THRESHOLD < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhPrevThreshold", "BLH_PREV_THRESHOLD > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhPrevThresholdMatch", "BLH_PREV_THRESHOLD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhPrevThreshold",
     "(BLH_PREV_THRESHOLD = ? OR BLH_PREV_THRESHOLD IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhPrevThreshold", "BLH_PREV_THRESHOLD IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhPrevThreshold", "BLH_PREV_THRESHOLD NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhPrevThresholdasc", "BLH_PREV_THRESHOLD ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhPrevThresholddesc", "BLH_PREV_THRESHOLD DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhNextacnId", "BLH_NEXT_ACN_ID = ?" ) // EQUAL

        .addFilterBy( "notequalBlhNextacnId", "BLH_NEXT_ACN_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhNextacnId",
     "(BLH_NEXT_ACN_ID IS NULL OR LENGTH(BLH_NEXT_ACN_ID) IS NULL OR LENGTH(BLH_NEXT_ACN_ID) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhNextacnId", "BLH_NEXT_ACN_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhNextacnId", "BLH_NEXT_ACN_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhNextacnId", "BLH_NEXT_ACN_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhNextacnIdMatch", "BLH_NEXT_ACN_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhNextacnId",
     "(BLH_NEXT_ACN_ID = ? OR BLH_NEXT_ACN_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhNextacnId", "BLH_NEXT_ACN_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhNextacnId", "BLH_NEXT_ACN_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhNextacnIdasc", "BLH_NEXT_ACN_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhNextacnIddesc", "BLH_NEXT_ACN_ID DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhPrevacnId", "BLH_PREV_ACN_ID = ?" ) // EQUAL

        .addFilterBy( "notequalBlhPrevacnId", "BLH_PREV_ACN_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhPrevacnId",
     "(BLH_PREV_ACN_ID IS NULL OR LENGTH(BLH_PREV_ACN_ID) IS NULL OR LENGTH(BLH_PREV_ACN_ID) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhPrevacnId", "BLH_PREV_ACN_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhPrevacnId", "BLH_PREV_ACN_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhPrevacnId", "BLH_PREV_ACN_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhPrevacnIdMatch", "BLH_PREV_ACN_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhPrevacnId",
     "(BLH_PREV_ACN_ID = ? OR BLH_PREV_ACN_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhPrevacnId", "BLH_PREV_ACN_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhPrevacnId", "BLH_PREV_ACN_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhPrevacnIdasc", "BLH_PREV_ACN_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhPrevacnIddesc", "BLH_PREV_ACN_ID DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhNetworkAcn", "BLH_NETWORK_ACN = ?" ) // EQUAL

        .addFilterBy( "notequalBlhNetworkAcn", "BLH_NETWORK_ACN != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhNetworkAcn",
     "(BLH_NETWORK_ACN IS NULL OR LENGTH(BLH_NETWORK_ACN) IS NULL OR LENGTH(BLH_NETWORK_ACN) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhNetworkAcn", "BLH_NETWORK_ACN IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhNetworkAcn", "BLH_NETWORK_ACN < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhNetworkAcn", "BLH_NETWORK_ACN > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhNetworkAcnMatch", "BLH_NETWORK_ACN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhNetworkAcn",
     "(BLH_NETWORK_ACN = ? OR BLH_NETWORK_ACN IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhNetworkAcn", "BLH_NETWORK_ACN IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhNetworkAcn", "BLH_NETWORK_ACN NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhNetworkAcnasc", "BLH_NETWORK_ACN ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhNetworkAcndesc", "BLH_NETWORK_ACN DESC" ) // ORDER DESCENDING
   ;

	    
	    table.addFilterBy( "equalBlhTrigFlag", "BLH_TRIG_FLAG = ?" ) // EQUAL

        .addFilterBy( "notequalBlhTrigFlag", "BLH_TRIG_FLAG != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhTrigFlag",
     "(BLH_TRIG_FLAG IS NULL OR LENGTH(BLH_TRIG_FLAG) IS NULL OR LENGTH(BLH_TRIG_FLAG) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhTrigFlag", "BLH_TRIG_FLAG IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhTrigFlag", "BLH_TRIG_FLAG < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhTrigFlag", "BLH_TRIG_FLAG > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhTrigFlagMatch", "BLH_TRIG_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhTrigFlag",
     "(BLH_TRIG_FLAG = ? OR BLH_TRIG_FLAG IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhTrigFlag", "BLH_TRIG_FLAG IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhTrigFlag", "BLH_TRIG_FLAG NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhTrigFlagasc", "BLH_TRIG_FLAG ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhTrigFlagdesc", "BLH_TRIG_FLAG DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalBlhLastUpdate", "BLH_LAST_UPDATE = ?" ) // EQUAL

        .addFilterBy( "notequalBlhLastUpdate", "BLH_LAST_UPDATE != ?" ) // NOTEQUAL

        .addFilterBy( "nullBlhLastUpdate",
     "(BLH_LAST_UPDATE IS NULL OR LENGTH(BLH_LAST_UPDATE) IS NULL OR LENGTH(BLH_LAST_UPDATE) = 0)" ) // IS NULL

        .addFilterBy( "notnullBlhLastUpdate", "BLH_LAST_UPDATE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanBlhLastUpdate", "BLH_LAST_UPDATE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanBlhLastUpdate", "BLH_LAST_UPDATE > ?" ) // GREATER THAN

        .addFilterBy( "filterByBlhLastUpdateMatch", "BLH_LAST_UPDATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullBlhLastUpdate",
     "(BLH_LAST_UPDATE = ? OR BLH_LAST_UPDATE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INBlhLastUpdate", "BLH_LAST_UPDATE IN ( ? )" ) // IN

        .addFilterBy( "NOTINBlhLastUpdate", "BLH_LAST_UPDATE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "BlhLastUpdateasc", "BLH_LAST_UPDATE ASC" ) // ORDER ASCENDING

        .addOrderBy( "BlhLastUpdatedesc", "BLH_LAST_UPDATE DESC" ) // ORDER DESCENDING
   ;
		}

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new BlhBillLimitHdDMLFactory(  );
	    }

	    return dml;
	  }

}
