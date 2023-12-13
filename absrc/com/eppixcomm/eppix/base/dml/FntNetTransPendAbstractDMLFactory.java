package com.eppixcomm.eppix.base.dml;



public class FntNetTransPendAbstractDMLFactory extends BaseDMLFactory {

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new DotDocTypeAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected FntNetTransPendAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    DMLTable table = defTable( "FntNetTransPend", // dmlName
	        "blo.FntNetTransPendDMO", // dmoName
	        "FNT_NET_TRANS_PEND", // tableName
	        14, // numColumns
	        "FNT_SERIAL_ID,FNT_COMMAND,FNT_SEND_SEQ,FNT_TRAN_TYPE,FNT_SUBSCRIBER_ID,FNT_OLD_VALUE,FNT_NEW_VALUE,FNT_SERVICE_CODE,FNT_STATUS,FNT_TIMESTAMP", // columnList
	        "FNT_SERIAL_ID", //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "FNT_SERIAL_ID,FNT_COMMAND,FNT_SEND_SEQ,FNT_TRAN_TYPE,FNT_SUBSCRIBER_ID,FNT_OLD_VALUE,FNT_NEW_VALUE,FNT_SERVICE_CODE,FNT_STATUS,FNT_TIMESTAMP",
	        "", "",
	        new String[] {
	    		"FNT_SERIAL_ID",
	    		"FNT_COMMAND",
	    		"FNT_SEND_SEQ",
	    		"FNT_TRAN_TYPE",
	    		"FNT_SUBSCRIBER_ID",
	    		"FNT_OLD_VALUE",
	    		"FNT_NEW_VALUE",
	    		"FNT_SERVICE_CODE",
	    		"FNT_STATUS",
	    		"FNT_TIMESTAMP"
	        } );

	    table.addFilterBy( "equalFntSerialId", /* PK attribute */
	    "FNT_SERIAL_ID = ? ")
	         .addFilterBy( "filterByFntSerialIdMatch", "FNT_SERIAL_ID LIKE ?")
	         .addFilterBy( "INFntSerialId","FNT_SERIAL_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntSerialId","FNT_SERIAL_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntSerialId","FNT_SERIAL_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullFntSerialId",   "(FNT_SERIAL_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntSerialId","FNT_SERIAL_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntSerialId","FNT_SERIAL_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntSerialId","FNT_SERIAL_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntSerialIdMatch","FNT_SERIAL_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntSerialId",
	      "(FNT_SERIAL_ID = ? OR FNT_SERIAL_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntSerialId asc", "FNT_SERIAL_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("FntSerialId desc", "FNT_SERIAL_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntCommand", /* PK attribute */
	    "FNT_COMMAND = ? ")
	         .addFilterBy( "filterByFntCommandMatch", "FNT_COMMAND LIKE ?")
	         .addFilterBy( "INFntCommand","FNT_COMMAND IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntCommand","FNT_COMMAND NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntCommand","FNT_COMMAND != ?") // NOTEQUAL

	         .addFilterBy( "nullFntCommand",   "(FNT_COMMAND IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntCommand","FNT_COMMAND IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntCommand","FNT_COMMAND < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntCommand","FNT_COMMAND > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntCommandMatch","FNT_COMMAND LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntCommand",
	      "(FNT_COMMAND = ? OR FNT_COMMAND IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntCommand asc", "FNT_COMMAND ASC ") // ORDER ASCENDING

	         .addOrderBy("FntCommand desc", "FNT_COMMAND DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntSendSeq", /* PK attribute */
	    "FNT_SEND_SEQ = ? ")
	         .addFilterBy( "filterByFntSendSeqMatch", "FNT_SEND_SEQ LIKE ?")
	         .addFilterBy( "INFntSendSeq","FNT_SEND_SEQ IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntSendSeq","FNT_SEND_SEQ NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntSendSeq","FNT_SEND_SEQ != ?") // NOTEQUAL

	         .addFilterBy( "nullFntSendSeq",   "(FNT_SEND_SEQ IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntSendSeq","FNT_SEND_SEQ IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntSendSeq","FNT_SEND_SEQ < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntSendSeq","FNT_SEND_SEQ > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntSendSeqMatch","FNT_SEND_SEQ LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntSendSeq",
	      "(FNT_SEND_SEQ = ? OR FNT_SEND_SEQ IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntSendSeq asc", "FNT_SEND_SEQ ASC ") // ORDER ASCENDING

	         .addOrderBy("FntSendSeq desc", "FNT_SEND_SEQ DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntTranType", /* PK attribute */
	    "FNT_TRAN_TYPE = ? ")
	         .addFilterBy( "filterByFntTranTypeMatch", "FNT_TRAN_TYPE LIKE ?")
	         .addFilterBy( "INFntTranType","FNT_TRAN_TYPE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntTranType","FNT_TRAN_TYPE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntTranType","FNT_TRAN_TYPE != ?") // NOTEQUAL

	         .addFilterBy( "nullFntTranType",   "(FNT_TRAN_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntTranType","FNT_TRAN_TYPE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntTranType","FNT_TRAN_TYPE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntTranType","FNT_TRAN_TYPE > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntTranTypeMatch","FNT_TRAN_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntTranType",
	      "(FNT_TRAN_TYPE = ? OR FNT_TRAN_TYPE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntTranType asc", "FNT_TRAN_TYPE ASC ") // ORDER ASCENDING

	         .addOrderBy("FntTranType desc", "FNT_TRAN_TYPE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntSubscriberId", /* PK attribute */
	    "FNT_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterByFntSubscriberIdMatch", "FNT_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INFntSubscriberId","FNT_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntSubscriberId","FNT_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntSubscriberId","FNT_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullFntSubscriberId",   "(FNT_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntSubscriberId","FNT_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntSubscriberId","FNT_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntSubscriberId","FNT_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntSubscriberIdMatch","FNT_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntSubscriberId",
	      "(FNT_SUBSCRIBER_ID = ? OR FNT_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntSubscriberId asc", "FNT_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("FntSubscriberId desc", "FNT_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntOldValue", /* PK attribute */
	    "FNT_OLD_VALUE = ? ")
	         .addFilterBy( "filterByFntOldValueMatch", "FNT_OLD_VALUE LIKE ?")
	         .addFilterBy( "INFntOldValue","FNT_OLD_VALUE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntOldValue","FNT_OLD_VALUE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntOldValue","FNT_OLD_VALUE != ?") // NOTEQUAL

	         .addFilterBy( "nullFntOldValue",   "(FNT_OLD_VALUE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntOldValue","FNT_OLD_VALUE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntOldValue","FNT_OLD_VALUE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntOldValue","FNT_OLD_VALUE > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntOldValueMatch","FNT_OLD_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntOldValue",
	      "(FNT_OLD_VALUE = ? OR FNT_OLD_VALUE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntOldValue asc", "FNT_OLD_VALUE ASC ") // ORDER ASCENDING

	         .addOrderBy("FntOldValue desc", "FNT_OLD_VALUE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntNewValue", /* PK attribute */
	    "FNT_NEW_VALUE = ? ")
	         .addFilterBy( "filterByFntNewValueMatch", "FNT_NEW_VALUE LIKE ?")
	         .addFilterBy( "INFntNewValue","FNT_NEW_VALUE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntNewValue","FNT_NEW_VALUE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntNewValue","FNT_NEW_VALUE != ?") // NOTEQUAL

	         .addFilterBy( "nullFntNewValue",   "(FNT_NEW_VALUE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntNewValue","FNT_NEW_VALUE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntNewValue","FNT_NEW_VALUE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntNewValue","FNT_NEW_VALUE > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntNewValueMatch","FNT_NEW_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntNewValue",
	      "(FNT_NEW_VALUE = ? OR FNT_NEW_VALUE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntNewValue asc", "FNT_NEW_VALUE ASC ") // ORDER ASCENDING

	         .addOrderBy("FntNewValue desc", "FNT_NEW_VALUE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntServiceCode", /* PK attribute */
	    "FNT_SERVICE_CODE = ? ")
	         .addFilterBy( "filterByFntServiceCodeMatch", "FNT_SERVICE_CODE LIKE ?")
	         .addFilterBy( "INFntServiceCode","FNT_SERVICE_CODE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntServiceCode","FNT_SERVICE_CODE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntServiceCode","FNT_SERVICE_CODE != ?") // NOTEQUAL

	         .addFilterBy( "nullFntServiceCode",   "(FNT_SERVICE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntServiceCode","FNT_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntServiceCode","FNT_SERVICE_CODE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntServiceCode","FNT_SERVICE_CODE > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntServiceCodeMatch","FNT_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntServiceCode",
	      "(FNT_SERVICE_CODE = ? OR FNT_SERVICE_CODE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntServiceCode asc", "FNT_SERVICE_CODE ASC ") // ORDER ASCENDING

	         .addOrderBy("FntServiceCode desc", "FNT_SERVICE_CODE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntStatus", /* PK attribute */
	    "FNT_STATUS = ? ")
	         .addFilterBy( "filterByFntStatusMatch", "FNT_STATUS LIKE ?")
	         .addFilterBy( "INFntStatus","FNT_STATUS IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntStatus","FNT_STATUS NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntStatus","FNT_STATUS != ?") // NOTEQUAL

	         .addFilterBy( "nullFntStatus",   "(FNT_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntStatus","FNT_STATUS IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntStatus","FNT_STATUS < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntStatus","FNT_STATUS > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntStatusMatch","FNT_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntStatus",
	      "(FNT_STATUS = ? OR FNT_STATUS IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntStatus asc", "FNT_STATUS ASC ") // ORDER ASCENDING

	         .addOrderBy("FntStatus desc", "FNT_STATUS DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalFntTimestamp", /* PK attribute */
	    "FNT_TIMESTAMP = ? ")
	         .addFilterBy( "filterByFntTimestampMatch", "FNT_TIMESTAMP LIKE ?")
	         .addFilterBy( "INFntTimestamp","FNT_TIMESTAMP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINFntTimestamp","FNT_TIMESTAMP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalFntTimestamp","FNT_TIMESTAMP != ?") // NOTEQUAL

	         .addFilterBy( "nullFntTimestamp",   "(FNT_TIMESTAMP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullFntTimestamp","FNT_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanFntTimestamp","FNT_TIMESTAMP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanFntTimestamp","FNT_TIMESTAMP > ? ") // GREATER THAN

	         .addFilterBy( "filterByFntTimestampMatch","FNT_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullFntTimestamp",
	      "(FNT_TIMESTAMP = ? OR FNT_TIMESTAMP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("FntTimestamp asc", "FNT_TIMESTAMP ASC ") // ORDER ASCENDING

	         .addOrderBy("FntTimestamp desc", "FNT_TIMESTAMP DESC ") // ORDER DESCENDING
	    ;;}

}