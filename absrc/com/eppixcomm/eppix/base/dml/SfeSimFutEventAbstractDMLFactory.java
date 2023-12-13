package com.eppixcomm.eppix.base.dml;



public class SfeSimFutEventAbstractDMLFactory extends BaseDMLFactory {


	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new DotDocTypeAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected SfeSimFutEventAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    DMLTable table = defTable( "SfeSimFutEvent", // dmlName
	        "blo.SfeSimFutEventDMO", // dmoName
	        "SFE_SIM_FUT_EVENT", // tableName
	        10, // numColumns
	        "SFE_COMMAND,SFE_FUT_EVENT_ID,SFE_SUBSCRIBER_ID,SFE_SIM_NO,SFE_MSISDN_NO,SFE_SERVICE_CODE,SFE_EVENT_DATE,SFE_TIMESTAMP,SFE_ERROR_COMMENT,SFE_ORIG_STATUS", // columnList
	        "SFE_SIM_NO,SFE_MSISDN_NO,SFE_SERVICE_CODE", //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "SFE_COMMAND,SFE_FUT_EVENT_ID,SFE_SUBSCRIBER_ID,SFE_SIM_NO,SFE_MSISDN_NO,SFE_SERVICE_CODE,SFE_EVENT_DATE,SFE_TIMESTAMP,SFE_ERROR_COMMENT,SFE_ORIG_STATUS",
	        "", "",
	        new String[] {
	    		"SFE_COMMAND",
	    		"SFE_FUT_EVENT_ID",
	    		"SFE_SUBSCRIBER_ID",
	    		"SFE_SIM_NO",
	    		"SFE_MSISDN_NO",
	    		"SFE_SERVICE_CODE",
	    		"SFE_EVENT_DATE",
	    		"SFE_TIMESTAMP",
	    		"SFE_ERROR_COMMENT",
	    		"SFE_ORIG_STATUS"
	        },true );

	    table.addFilterBy( "equalSfeCommand", /* PK attribute */
	    "SFE_COMMAND = ? ")
	         .addFilterBy( "filterBySfeCommandMatch", "SFE_COMMAND LIKE ?")
	         .addFilterBy( "INSfeCommand","SFE_COMMAND IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeCommand","SFE_COMMAND NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeCommand","SFE_COMMAND != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeCommand",   "(SFE_COMMAND IS NULL OR LENGTH(SFE_COMMAND) IS NULL OR LENGTH(SFE_COMMAND) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeCommand","SFE_COMMAND IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeCommand","SFE_COMMAND < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeCommand","SFE_COMMAND > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeCommandMatch","SFE_COMMAND LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeCommand",
	      "(SFE_COMMAND = ? OR SFE_COMMAND IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeCommand asc", "SFE_COMMAND ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeCommand desc", "SFE_COMMAND DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeFutEventId", /* PK attribute */
	    "SFE_FUT_EVENT_ID = ? ")
	         .addFilterBy( "filterBySfeFutEventIdMatch", "SFE_FUT_EVENT_ID LIKE ?")
	         .addFilterBy( "INSfeFutEventId","SFE_FUT_EVENT_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeFutEventId","SFE_FUT_EVENT_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeFutEventId","SFE_FUT_EVENT_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeFutEventId",   "(SFE_FUT_EVENT_ID IS NULL OR LENGTH(SFE_FUT_EVENT_ID) IS NULL OR LENGTH(SFE_FUT_EVENT_ID) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeFutEventId","SFE_FUT_EVENT_ID IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeFutEventId","SFE_FUT_EVENT_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeFutEventId","SFE_FUT_EVENT_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeFutEventIdMatch","SFE_FUT_EVENT_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeFutEventId",
	      "(SFE_FUT_EVENT_ID = ? OR SFE_FUT_EVENT_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeFutEventId asc", "SFE_FUT_EVENT_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeFutEventId desc", "SFE_FUT_EVENT_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeSubscriberId", /* PK attribute */
	    "SFE_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterBySfeSubscriberIdMatch", "SFE_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INSfeSubscriberId","SFE_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeSubscriberId","SFE_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeSubscriberId","SFE_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeSubscriberId",   "(SFE_SUBSCRIBER_ID IS NULL OR LENGTH(SFE_SUBSCRIBER_ID) IS NULL OR LENGTH(SFE_SUBSCRIBER_ID) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeSubscriberId","SFE_SUBSCRIBER_ID IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeSubscriberId","SFE_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeSubscriberId","SFE_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeSubscriberIdMatch","SFE_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeSubscriberId",
	      "(SFE_SUBSCRIBER_ID = ? OR SFE_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeSubscriberId asc", "SFE_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeSubscriberId desc", "SFE_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeSimNo", /* PK attribute */
	    "SFE_SIM_NO = ? ")
	         .addFilterBy( "filterBySfeSimNoMatch", "SFE_SIM_NO LIKE ?")
	         .addFilterBy( "INSfeSimNo","SFE_SIM_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeSimNo","SFE_SIM_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeSimNo","SFE_SIM_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeSimNo",   "(SFE_SIM_NO IS NULL OR LENGTH(SFE_SIM_NO) IS NULL OR LENGTH(SFE_SIM_NO) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeSimNo","SFE_SIM_NO IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeSimNo","SFE_SIM_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeSimNo","SFE_SIM_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeSimNoMatch","SFE_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeSimNo",
	      "(SFE_SIM_NO = ? OR SFE_SIM_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeSimNo asc", "SFE_SIM_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeSimNo desc", "SFE_SIM_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeMsisdnNo", /* PK attribute */
	    "SFE_MSISDN_NO = ? ")
	         .addFilterBy( "filterBySfeMsisdnNoMatch", "SFE_MSISDN_NO LIKE ?")
	         .addFilterBy( "INSfeMsisdnNo","SFE_MSISDN_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeMsisdnNo","SFE_MSISDN_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeMsisdnNo","SFE_MSISDN_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeMsisdnNo",   "(SFE_MSISDN_NO IS NULL OR LENGTH(SFE_MSISDN_NO) IS NULL OR LENGTH(SFE_MSISDN_NO) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeMsisdnNo","SFE_MSISDN_NO IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeMsisdnNo","SFE_MSISDN_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeMsisdnNo","SFE_MSISDN_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeMsisdnNoMatch","SFE_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeMsisdnNo",
	      "(SFE_MSISDN_NO = ? OR SFE_MSISDN_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeMsisdnNo asc", "SFE_MSISDN_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeMsisdnNo desc", "SFE_MSISDN_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeServiceCode", /* PK attribute */
	    "SFE_SERVICE_CODE = ? ")
	         .addFilterBy( "filterBySfeServiceCodeMatch", "SFE_SERVICE_CODE LIKE ?")
	         .addFilterBy( "INSfeServiceCode","SFE_SERVICE_CODE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeServiceCode","SFE_SERVICE_CODE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeServiceCode","SFE_SERVICE_CODE != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeServiceCode",   "(SFE_SERVICE_CODE IS NULL OR LENGTH(SFE_SERVICE_CODE) IS NULL OR LENGTH(SFE_SERVICE_CODE) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeServiceCode","SFE_SERVICE_CODE IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeServiceCode","SFE_SERVICE_CODE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeServiceCode","SFE_SERVICE_CODE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeServiceCodeMatch","SFE_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeServiceCode",
	      "(SFE_SERVICE_CODE = ? OR SFE_SERVICE_CODE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeServiceCode asc", "SFE_SERVICE_CODE ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeServiceCode desc", "SFE_SERVICE_CODE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeEventDate", /* PK attribute */
	    "SFE_EVENT_DATE = ? ")
	         .addFilterBy( "filterBySfeEventDateMatch", "SFE_EVENT_DATE LIKE ?")
	         .addFilterBy( "INSfeEventDate","SFE_EVENT_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeEventDate","SFE_EVENT_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeEventDate","SFE_EVENT_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeEventDate",   "(SFE_EVENT_DATE IS NULL OR LENGTH(SFE_EVENT_DATE) IS NULL OR LENGTH(SFE_EVENT_DATE) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeEventDate","SFE_EVENT_DATE IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeEventDate","SFE_EVENT_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeEventDate","SFE_EVENT_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeEventDateMatch","SFE_EVENT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeEventDate",
	      "(SFE_EVENT_DATE = ? OR SFE_EVENT_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeEventDate asc", "SFE_EVENT_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeEventDate desc", "SFE_EVENT_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeTimestamp", /* PK attribute */
	    "SFE_TIMESTAMP = ? ")
	         .addFilterBy( "filterBySfeTimestampMatch", "SFE_TIMESTAMP LIKE ?")
	         .addFilterBy( "INSfeTimestamp","SFE_TIMESTAMP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeTimestamp","SFE_TIMESTAMP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeTimestamp","SFE_TIMESTAMP != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeTimestamp",   "(SFE_TIMESTAMP IS NULL OR LENGTH(SFE_TIMESTAMP) IS NULL OR LENGTH(SFE_TIMESTAMP) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeTimestamp","SFE_TIMESTAMP IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeTimestamp","SFE_TIMESTAMP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeTimestamp","SFE_TIMESTAMP > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeTimestampMatch","SFE_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeTimestamp",
	      "(SFE_TIMESTAMP = ? OR SFE_TIMESTAMP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeTimestamp asc", "SFE_TIMESTAMP ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeTimestamp desc", "SFE_TIMESTAMP DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeErrorComment", /* PK attribute */
	    "SFE_ERROR_COMMENT = ? ")
	         .addFilterBy( "filterBySfeErrorCommentMatch", "SFE_ERROR_COMMENT LIKE ?")
	         .addFilterBy( "INSfeErrorComment","SFE_ERROR_COMMENT IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeErrorComment","SFE_ERROR_COMMENT NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeErrorComment","SFE_ERROR_COMMENT != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeErrorComment",   "(SFE_ERROR_COMMENT IS NULL OR LENGTH(SFE_ERROR_COMMENT) IS NULL OR LENGTH(SFE_ERROR_COMMENT) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeErrorComment","SFE_ERROR_COMMENT IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeErrorComment","SFE_ERROR_COMMENT < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeErrorComment","SFE_ERROR_COMMENT > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeErrorCommentMatch","SFE_ERROR_COMMENT LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeErrorComment",
	      "(SFE_ERROR_COMMENT = ? OR SFE_ERROR_COMMENT IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeErrorComment asc", "SFE_ERROR_COMMENT ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeErrorComment desc", "SFE_ERROR_COMMENT DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSfeOrigStatus", /* PK attribute */
	    "SFE_ORIG_STATUS = ? ")
	         .addFilterBy( "filterBySfeOrigStatusMatch", "SFE_ORIG_STATUS LIKE ?")
	         .addFilterBy( "INSfeOrigStatus","SFE_ORIG_STATUS IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSfeOrigStatus","SFE_ORIG_STATUS NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSfeOrigStatus","SFE_ORIG_STATUS != ?") // NOTEQUAL

	         .addFilterBy( "nullSfeOrigStatus",   "(SFE_ORIG_STATUS IS NULL OR LENGTH(SFE_ORIG_STATUS) IS NULL OR LENGTH(SFE_ORIG_STATUS) = 0)") // IS NULL

	         .addFilterBy( "notnullSfeOrigStatus","SFE_ORIG_STATUS IS NOT NULL ") // IS NOT NULL

	         .addFilterBy( "lessthanSfeOrigStatus","SFE_ORIG_STATUS < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSfeOrigStatus","SFE_ORIG_STATUS > ? ") // GREATER THAN

	         .addFilterBy( "filterBySfeOrigStatusMatch","SFE_ORIG_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSfeOrigStatus",
	      "(SFE_ORIG_STATUS = ? OR SFE_ORIG_STATUS IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SfeOrigStatus asc", "SFE_ORIG_STATUS ASC ") // ORDER ASCENDING

	         .addOrderBy("SfeOrigStatus desc", "SFE_ORIG_STATUS DESC ") // ORDER DESCENDING
	    ;
	    ;}

}