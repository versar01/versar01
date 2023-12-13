package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.NtpNetTransPendDMO;

public class NtpNetTransPendAbstractDMLFactory extends BaseDMLFactory {

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected NtpNetTransPendAbstractDMLFactory() 
		throws DMLException {

		
	    DMLTable table = defTable( "NtpNetTransPend", // dmlName
	            "blo.NtpNetTransPendDMO", // dmoName 
	            "NTP_NET_TRANS_PEND", // tableName
	            10, // numColumns
	            "NTP_SERIAL_ID, NTP_COMMAND, NTP_SEND_SEQ," +
	            "NTP_TRAN_TYPE, NTP_SUBSCRIBER_ID, NTP_OLD_VALUE, " +
	            "NTP_NEW_VALUE, NTP_SERVICE_CODE, NTP_STATUS, NTP_TIMESTAMP", // columnList
	            "NTP_SERIAL_ID", //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	          "NTP_SERIAL_ID, NTP_COMMAND, NTP_SEND_SEQ," +
	            "NTP_TRAN_TYPE, NTP_SUBSCRIBER_ID, NTP_OLD_VALUE, " +
	            "NTP_NEW_VALUE, NTP_SERVICE_CODE, NTP_STATUS, NTP_TIMESTAMP",
	            "", "",
	            new String[] {
	    		"NTP_SERIAL_ID","NTP_COMMAND", 
	    		"NTP_SEND_SEQ", "NTP_TRAN_TYPE", 
	    		"NTP_SUBSCRIBER_ID","NTP_OLD_VALUE",
	    		"NTP_NEW_VALUE", "NTP_SERVICE_CODE", 
	    		"NTP_STATUS", "NTP_TIMESTAMP"
	            },true );	
//==========================================================================================	    
	    table.addFilterBy( "equalNtpSerialId", "NTP_SERIAL_ID = ?" ) // EQUAL

        .addFilterBy( "notequalNtpSerialId", "NTP_SERIAL_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpSerialId",
     "(NTP_SERIAL_ID IS NULL OR NTP_SERIAL_ID = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpSerialId", "NTP_SERIAL_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpSerialId", "NTP_SERIAL_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpSerialId", "NTP_SERIAL_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpSerialIdMatch", "NTP_SERIAL_ID ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpSerialId",
     "NTP_SERIAL_ID = ? OR NTP_SERIAL_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpSerialId", "NTP_SERIAL_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpSerialId", "NTP_SERIAL_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpSerialIdasc", "NTP_SERIAL_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpSerialIddesc", "NTP_SERIAL_ID DESC" ) // ORDER DESCENDING
   ;
	    
//	  ==========================================================================================	    
	    table.addFilterBy( "equalNtpCommand", "(NTP_COMMAND) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpCommand", "(NTP_COMMAND) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpCommand",
     "(NTP_COMMAND IS NULL OR LENGTH((NTP_COMMAND)) IS NULL OR LENGTH((NTP_COMMAND)) = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpCommand", "NTP_COMMAND IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpCommand", "NTP_COMMAND < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpCommand", "NTP_COMMAND > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpCommandMatch", "NTP_COMMAND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpCommand",
     "((NTP_COMMAND) = ? OR NTP_COMMAND IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpCommand", "(NTP_COMMAND) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpCommand", "(NTP_COMMAND) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpCommandasc", "NTP_COMMAND ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpCommanddesc", "NTP_COMMAND DESC" ) // ORDER DESCENDING
   ;
//	  ==========================================================================================
///NtpSendSeq NTP_SEND_SEQ
	    table.addFilterBy( "equalNtpSendSeq", "NTP_SEND_SEQ = ?" ) // EQUAL

        .addFilterBy( "notequalNtpSendSeq", "NTP_SEND_SEQ != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpSendSeq",
     "(NTP_SEND_SEQ IS NULL OR NTP_SEND_SEQ = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpSendSeq", "NTP_SEND_SEQ IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpSendSeq", "NTP_SEND_SEQ < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpSendSeq", "NTP_SEND_SEQ > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpSendSeqMatch", "NTP_SEND_SEQ ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpSendSeq",
     "NTP_SEND_SEQ = ? OR NTP_SEND_SEQ IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpSendSeq", "NTP_SEND_SEQ IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpSendSeq", "NTP_SEND_SEQ NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpSendSeqasc", "NTP_SEND_SEQ ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpSendSeqdesc", "NTP_SEND_SEQ DESC" ) // ORDER DESCENDING
   ;
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpTranType", "(NTP_TRAN_TYPE) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpTranType", "(NTP_TRAN_TYPE) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpTranType",
     "(NTP_TRAN_TYPE IS NULL OR LENGTH((NTP_TRAN_TYPE)) IS NULL OR LENGTH((NTP_TRAN_TYPE)) = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpTranType", "NTP_TRAN_TYPE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpTranType", "NTP_TRAN_TYPE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpTranType", "NTP_TRAN_TYPE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpTranTypeMatch", "NTP_TRAN_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpTranType",
     "((NTP_TRAN_TYPE) = ? OR NTP_TRAN_TYPE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpTranType", "(NTP_TRAN_TYPE) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpTranType", "(NTP_TRAN_TYPE) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpTranTypeasc", "NTP_TRAN_TYPE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpTranTypedesc", "NTP_TRAN_TYPE DESC" ) // ORDER DESCENDING
   ;	    
//	  ==========================================================================================
// NtpSubscriberId NTP_SUBSCRIBER_ID
	    table.addFilterBy( "equalNtpSubscriberId", "k = ?" ) // EQUAL

        .addFilterBy( "notequalNtpSubscriberId", "NTP_SUBSCRIBER_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpSubscriberId",
     "(NTP_SUBSCRIBER_ID IS NULL OR NTP_SUBSCRIBER_ID = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpSubscriberId", "NTP_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpSubscriberId", "NTP_SUBSCRIBER_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpSubscriberId", "NTP_SUBSCRIBER_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpSubscriberIdMatch", "NTP_SUBSCRIBER_ID ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpSubscriberId",
     "NTP_SUBSCRIBER_ID = ? OR NTP_SUBSCRIBER_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpSubscriberId", "NTP_SUBSCRIBER_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpSubscriberId", "NTP_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpSubscriberIdasc", "NTP_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpSubscriberIddesc", "NTP_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
   ;
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpOldValue", "(NTP_OLD_VALUE) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpOldValue", "(NTP_OLD_VALUE) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpOldValue",
     "(NTP_OLD_VALUE IS NULL OR LENGTH((NTP_OLD_VALUE)) IS NULL OR LENGTH((NTP_OLD_VALUE)) = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpOldValue", "NTP_OLD_VALUE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpOldValue", "NTP_OLD_VALUE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpOldValue", "NTP_OLD_VALUE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpOldValueMatch", "NTP_OLD_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpOldValue",
     "((NTP_OLD_VALUE) = ? OR NTP_OLD_VALUE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpOldValue", "(NTP_OLD_VALUE) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpOldValue", "(NTP_OLD_VALUE) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpOldValueasc", "NTP_OLD_VALUE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpOldValuedesc", "NTP_OLD_VALUE DESC" ) // ORDER DESCENDING
   ;
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpNewValue", "(NTP_NEW_VALUE) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpNewValue", "(NTP_NEW_VALUE) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpNewValue",
     "(NTP_NEW_VALUE IS NULL OR LENGTH((NTP_NEW_VALUE)) IS NULL OR LENGTH((NTP_NEW_VALUE)) = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpNewValue", "NTP_NEW_VALUE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpNewValue", "NTP_NEW_VALUE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpNewValue", "NTP_NEW_VALUE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpNewValueMatch", "NTP_NEW_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpNewValue",
     "((NTP_NEW_VALUE) = ? OR NTP_NEW_VALUE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpNewValue", "(NTP_NEW_VALUE) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpNewValue", "(NTP_NEW_VALUE) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpNewValueasc", "NTP_NEW_VALUE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpNewValuedesc", "NTP_NEW_VALUE DESC" ) // ORDER DESCENDING	
        ;
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpServiceCode", "(NTP_SERVICE_CODE) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpServiceCode", "(NTP_SERVICE_CODE) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpServiceCode", "NTP_SERVICE_CODE IS NULL" ) // IS NULL

        .addFilterBy( "notnullNtpServiceCode", "NTP_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpServiceCode", "NTP_SERVICE_CODE < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpServiceCode", "NTP_SERVICE_CODE > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpServiceCodeMatch", "NTP_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpServiceCode",
     "((NTP_SERVICE_CODE) = ? OR NTP_SERVICE_CODE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpServiceCode", "(NTP_SERVICE_CODE) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpServiceCode", "(NTP_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpServiceCodeasc", "NTP_SERVICE_CODE ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpServiceCodedesc", "NTP_SERVICE_CODE DESC" ) // ORDER DESCENDING	
        ;
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpStatus", "(NTP_STATUS) = ?" ) // EQUAL

        .addFilterBy( "notequalNtpStatus", "(NTP_STATUS) != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpStatus",
     "(NTP_STATUS IS NULL OR LENGTH((NTP_STATUS)) IS NULL OR LENGTH((NTP_STATUS)) = 0)" ) // IS NULL

        .addFilterBy( "notnullNtpStatus", "NTP_STATUS IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpStatus", "NTP_STATUS < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpStatus", "NTP_STATUS > ?" ) // GREATER THAN

        .addFilterBy( "filterByNtpStatusMatch", "NTP_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullNtpStatus",
     "((NTP_STATUS) = ? OR NTP_STATUS IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INNtpStatus", "(NTP_STATUS) IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpStatus", "(NTP_STATUS) NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpStatusasc", "NTP_STATUS ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpStatusdesc", "NTP_STATUS DESC" ) // ORDER DESCENDING	
        ;	    
//	  ==========================================================================================
	    table.addFilterBy( "equalNtpTimestamp", "NTP_TIMESTAMP = ?" ) // EQUAL

        .addFilterBy( "notequalNtpTimestamp", "NTP_TIMESTAMP != ?" ) // NOTEQUAL

        .addFilterBy( "nullNtpTimestamp", "NTP_TIMESTAMP IS NULL" ) // IS NULL

        .addFilterBy( "notnullNtpTimestamp", "NTP_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthanNtpTimestamp", "NTP_TIMESTAMP < ?" ) // LESS THAN

        .addFilterBy( "greaterthanNtpTimestamp", "NTP_TIMESTAMP > ?" ) // GREATER THAN

        .addFilterBy( "lessthanorequalNtpTimestamp", "NTP_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

        .addFilterBy( "greaterthanorequalNtpTimestamp", "NTP_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

        .addFilterBy( "filterByNtpTimestampMatch", "NTP_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "betweenNtpTimestamp", "NTP_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

        .addFilterBy( "equalornullNtpTimestamp",
     "(NTP_TIMESTAMP IS NULL OR NTP_TIMESTAMP = ?)" ) // EQUALORNULL

        .addFilterBy( "lessthanornullNtpTimestamp",
     "(NTP_TIMESTAMP IS NULL OR NTP_TIMESTAMP < ?)" ) // LESSTHANORNULL

        .addFilterBy( "greaterthanornullNtpTimestamp",
     "(NTP_TIMESTAMP IS NULL OR NTP_TIMESTAMP > ?)" ) // GREATERTHANORNULL

        .addFilterBy( "INNtpTimestamp", "NTP_TIMESTAMP IN ( ? )" ) // IN

        .addFilterBy( "NOTINNtpTimestamp", "NTP_TIMESTAMP NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "NtpTimestampasc", "NTP_TIMESTAMP ASC" ) // ORDER ASCENDING

        .addOrderBy( "NtpTimestampdesc", "NTP_TIMESTAMP DESC" ) // ORDER DESCENDING
   ;
//	  ==========================================================================================
	}

}
