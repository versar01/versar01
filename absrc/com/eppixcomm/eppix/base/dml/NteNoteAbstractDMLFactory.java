package com.eppixcomm.eppix.base.dml;



public class NteNoteAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new ActAccTypesAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected NteNoteAbstractDMLFactory(  )
	    throws DMLException {
	    ;	
	    
	    DMLTable table = defTable( "NteNote", // dmlName
	            "blo.NteNoteDMO", // dmoName
	            "NTE_NOTE", // tableName
	            23, // numColumns
	            "NTE_NOTE_SERIAL,NTE_ACTION_SERIAL,NTE_SOURCE,NTE_OPENED_BY,NTE_OPENED_DATE,NTE_CLOSED_DATE,NTE_TIMESTAMP," +
	            "NTE_STATUS,NTE_DEADLINE,NTE_TARGET_TYPE,NTE_TARGET_GROUP,NTE_TARGET_USER,NTE_REALLOC_BY,NTE_REALLOC_DATE," +
	            "NTE_SUSPENDED_USER,NTE_BILL_AC_NO,NTE_INVOICE_NO,NTE_SUBSCRIBER_ID,NTE_SIM_NO,NTE_MSISDN_NO,NTE_REFERENCE_NO," +
	            "NTE_LAST_PAGE,NTE_PRIORITY_TYPE", // columnList
	            "NTE_NOTE_SERIAL", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	            "NTE_NOTE_SERIAL,NTE_ACTION_SERIAL,NTE_SOURCE,NTE_OPENED_BY,NTE_OPENED_DATE,NTE_CLOSED_DATE,NTE_TIMESTAMP," +
	            "NTE_STATUS,NTE_DEADLINE,NTE_TARGET_TYPE,NTE_TARGET_GROUP,NTE_TARGET_USER,NTE_REALLOC_BY,NTE_REALLOC_DATE," +
	            "NTE_SUSPENDED_USER,NTE_BILL_AC_NO,NTE_INVOICE_NO,NTE_SUBSCRIBER_ID,NTE_SIM_NO,NTE_MSISDN_NO,NTE_REFERENCE_NO," +
	            "NTE_LAST_PAGE,NTE_PRIORITY_TYPE",
	            "", "",
	            new String[] {
	    		"NTE_NOTE_SERIAL","NTE_ACTION_SERIAL","NTE_SOURCE","NTE_OPENED_BY","NTE_OPENED_DATE","NTE_CLOSED_DATE",
	    		"NTE_TIMESTAMP","NTE_STATUS","NTE_DEADLINE","NTE_TARGET_TYPE","NTE_TARGET_GROUP","NTE_TARGET_USER",
	    		"NTE_REALLOC_BY","NTE_REALLOC_DATE","NTE_SUSPENDED_USER","NTE_BILL_AC_NO","NTE_INVOICE_NO","NTE_SUBSCRIBER_ID",
	    		"NTE_SIM_NO","NTE_MSISDN_NO","NTE_REFERENCE_NO","NTE_LAST_PAGE","NTE_PRIORITY_TYPE"
	            } );	    


	    table.addFilterBy( "PrimaryKey", /* PK attribute */
	    					"NTE_NOTE_SERIAL = ? ")
	    	.addFilterBy( "equalNteNoteSerial", /* PK attribute */
	    					"NTE_NOTE_SERIAL = ? ")
	         .addFilterBy( "NteNoteSerialMatch", "NTE_NOTE_SERIAL LIKE ?")
	         .addFilterBy( "INNteNoteSerial","NTE_NOTE_SERIAL IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteNoteSerial","NTE_NOTE_SERIAL NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteNoteSerial","NTE_NOTE_SERIAL != ?") // NOTEQUAL

	         .addFilterBy( "nullNteNoteSerial",   "(NTE_NOTE_SERIAL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteNoteSerial","NTE_NOTE_SERIAL IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteNoteSerial","NTE_NOTE_SERIAL < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteNoteSerial","NTE_NOTE_SERIAL > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteNoteSerialMatch","NTE_NOTE_SERIAL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteNoteSerial",
	      "(NTE_NOTE_SERIAL = ? OR NTE_NOTE_SERIAL IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteNoteSerial asc", "NTE_NOTE_SERIAL ASC ") // ORDER ASCENDING

	         .addOrderBy("NteNoteSerial desc", "NTE_NOTE_SERIAL DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteActionSerial", /* PK attribute */
	    "NTE_ACTION_SERIAL = ? ")
	         .addFilterBy( "filterByNteActionSerialMatch", "NTE_ACTION_SERIAL LIKE ?")
	         .addFilterBy( "INNteActionSerial","NTE_ACTION_SERIAL IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteActionSerial","NTE_ACTION_SERIAL NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteActionSerial","NTE_ACTION_SERIAL != ?") // NOTEQUAL

	         .addFilterBy( "nullNteActionSerial",   "(NTE_ACTION_SERIAL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteActionSerial","NTE_ACTION_SERIAL IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteActionSerial","NTE_ACTION_SERIAL < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteActionSerial","NTE_ACTION_SERIAL > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteActionSerialMatch","NTE_ACTION_SERIAL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteActionSerial",
	      "(NTE_ACTION_SERIAL = ? OR NTE_ACTION_SERIAL IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteActionSerial asc", "NTE_ACTION_SERIAL ASC ") // ORDER ASCENDING

	         .addOrderBy("NteActionSerial desc", "NTE_ACTION_SERIAL DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteSource", /* PK attribute */
	    "NTE_SOURCE = ? ")
	         .addFilterBy( "filterByNteSourceMatch", "NTE_SOURCE LIKE ?")
	         .addFilterBy( "INNteSource","NTE_SOURCE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteSource","NTE_SOURCE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteSource","NTE_SOURCE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteSource",   "(NTE_SOURCE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteSource","NTE_SOURCE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteSource","NTE_SOURCE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteSource","NTE_SOURCE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteSourceMatch","NTE_SOURCE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteSource",
	      "(NTE_SOURCE = ? OR NTE_SOURCE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteSource asc", "NTE_SOURCE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteSource desc", "NTE_SOURCE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteOpenedBy", /* PK attribute */
	    "NTE_OPENED_BY = ? ")
	         .addFilterBy( "filterByNteOpenedByMatch", "NTE_OPENED_BY LIKE ?")
	         .addFilterBy( "INNteOpenedBy","NTE_OPENED_BY IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteOpenedBy","NTE_OPENED_BY NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteOpenedBy","NTE_OPENED_BY != ?") // NOTEQUAL

	         .addFilterBy( "nullNteOpenedBy",   "(NTE_OPENED_BY IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteOpenedBy","NTE_OPENED_BY IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteOpenedBy","NTE_OPENED_BY < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteOpenedBy","NTE_OPENED_BY > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteOpenedByMatch","NTE_OPENED_BY LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteOpenedBy",
	      "(NTE_OPENED_BY = ? OR NTE_OPENED_BY IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteOpenedBy asc", "NTE_OPENED_BY ASC ") // ORDER ASCENDING

	         .addOrderBy("NteOpenedBy desc", "NTE_OPENED_BY DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteOpenedDate", /* PK attribute */
	    "NTE_OPENED_DATE = ? ")
	         .addFilterBy( "filterByNteOpenedDateMatch", "NTE_OPENED_DATE LIKE ?")
	         .addFilterBy( "INNteOpenedDate","NTE_OPENED_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteOpenedDate","NTE_OPENED_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteOpenedDate","NTE_OPENED_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteOpenedDate",   "(NTE_OPENED_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteOpenedDate","NTE_OPENED_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteOpenedDate","NTE_OPENED_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteOpenedDate","NTE_OPENED_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteOpenedDateMatch","NTE_OPENED_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteOpenedDate",
	      "(NTE_OPENED_DATE = ? OR NTE_OPENED_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteOpenedDate asc", "NTE_OPENED_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteOpenedDate desc", "NTE_OPENED_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteClosedDate", /* PK attribute */
	    "NTE_CLOSED_DATE = ? ")
	         .addFilterBy( "filterByNteClosedDateMatch", "NTE_CLOSED_DATE LIKE ?")
	         .addFilterBy( "INNteClosedDate","NTE_CLOSED_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteClosedDate","NTE_CLOSED_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteClosedDate","NTE_CLOSED_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteClosedDate",   "(NTE_CLOSED_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteClosedDate","NTE_CLOSED_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteClosedDate","NTE_CLOSED_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteClosedDate","NTE_CLOSED_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteClosedDateMatch","NTE_CLOSED_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteClosedDate",
	      "(NTE_CLOSED_DATE = ? OR NTE_CLOSED_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteClosedDate asc", "NTE_CLOSED_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteClosedDate desc", "NTE_CLOSED_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteTimestamp", /* PK attribute */
	    "NTE_TIMESTAMP = ? ")
	         .addFilterBy( "filterByNteTimestampMatch", "NTE_TIMESTAMP LIKE ?")
	         .addFilterBy( "INNteTimestamp","NTE_TIMESTAMP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteTimestamp","NTE_TIMESTAMP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteTimestamp","NTE_TIMESTAMP != ?") // NOTEQUAL

	         .addFilterBy( "nullNteTimestamp",   "(NTE_TIMESTAMP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteTimestamp","NTE_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteTimestamp","NTE_TIMESTAMP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteTimestamp","NTE_TIMESTAMP > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteTimestampMatch","NTE_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteTimestamp",
	      "(NTE_TIMESTAMP = ? OR NTE_TIMESTAMP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteTimestamp asc", "NTE_TIMESTAMP ASC ") // ORDER ASCENDING

	         .addOrderBy("NteTimestamp desc", "NTE_TIMESTAMP DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteStatus", /* PK attribute */
	    "NTE_STATUS = ? ")
	         .addFilterBy( "filterByNteStatusMatch", "NTE_STATUS LIKE ?")
	         .addFilterBy( "INNteStatus","NTE_STATUS IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteStatus","NTE_STATUS NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteStatus","NTE_STATUS != ?") // NOTEQUAL

	         .addFilterBy( "nullNteStatus",   "(NTE_STATUS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteStatus","NTE_STATUS IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteStatus","NTE_STATUS < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteStatus","NTE_STATUS > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteStatusMatch","NTE_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteStatus",
	      "(NTE_STATUS = ? OR NTE_STATUS IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteStatus asc", "NTE_STATUS ASC ") // ORDER ASCENDING

	         .addOrderBy("NteStatus desc", "NTE_STATUS DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteDeadline", /* PK attribute */
	    "NTE_DEADLINE = ? ")
	         .addFilterBy( "filterByNteDeadlineMatch", "NTE_DEADLINE LIKE ?")
	         .addFilterBy( "INNteDeadline","NTE_DEADLINE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteDeadline","NTE_DEADLINE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteDeadline","NTE_DEADLINE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteDeadline",   "(NTE_DEADLINE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteDeadline","NTE_DEADLINE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteDeadline","NTE_DEADLINE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteDeadline","NTE_DEADLINE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteDeadlineMatch","NTE_DEADLINE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteDeadline",
	      "(NTE_DEADLINE = ? OR NTE_DEADLINE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteDeadline asc", "NTE_DEADLINE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteDeadline desc", "NTE_DEADLINE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteTargetType", /* PK attribute */
	    "NTE_TARGET_TYPE = ? ")
	         .addFilterBy( "filterByNteTargetTypeMatch", "NTE_TARGET_TYPE LIKE ?")
	         .addFilterBy( "INNteTargetType","NTE_TARGET_TYPE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteTargetType","NTE_TARGET_TYPE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteTargetType","NTE_TARGET_TYPE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteTargetType",   "(NTE_TARGET_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteTargetType","NTE_TARGET_TYPE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteTargetType","NTE_TARGET_TYPE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteTargetType","NTE_TARGET_TYPE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteTargetTypeMatch","NTE_TARGET_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteTargetType",
	      "(NTE_TARGET_TYPE = ? OR NTE_TARGET_TYPE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteTargetType asc", "NTE_TARGET_TYPE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteTargetType desc", "NTE_TARGET_TYPE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteTargetGroup", /* PK attribute */
	    "NTE_TARGET_GROUP = ? ")
	         .addFilterBy( "filterByNteTargetGroupMatch", "NTE_TARGET_GROUP LIKE ?")
	         .addFilterBy( "INNteTargetGroup","NTE_TARGET_GROUP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteTargetGroup","NTE_TARGET_GROUP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteTargetGroup","NTE_TARGET_GROUP != ?") // NOTEQUAL

	         .addFilterBy( "nullNteTargetGroup",   "(NTE_TARGET_GROUP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteTargetGroup","NTE_TARGET_GROUP IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteTargetGroup","NTE_TARGET_GROUP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteTargetGroup","NTE_TARGET_GROUP > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteTargetGroupMatch","NTE_TARGET_GROUP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteTargetGroup",
	      "(NTE_TARGET_GROUP = ? OR NTE_TARGET_GROUP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteTargetGroup asc", "NTE_TARGET_GROUP ASC ") // ORDER ASCENDING

	         .addOrderBy("NteTargetGroup desc", "NTE_TARGET_GROUP DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteTargetUser", /* PK attribute */
	    "NTE_TARGET_USER = ? ")
	         .addFilterBy( "filterByNteTargetUserMatch", "NTE_TARGET_USER LIKE ?")
	         .addFilterBy( "INNteTargetUser","NTE_TARGET_USER IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteTargetUser","NTE_TARGET_USER NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteTargetUser","NTE_TARGET_USER != ?") // NOTEQUAL

	         .addFilterBy( "nullNteTargetUser",   "(NTE_TARGET_USER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteTargetUser","NTE_TARGET_USER IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteTargetUser","NTE_TARGET_USER < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteTargetUser","NTE_TARGET_USER > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteTargetUserMatch","NTE_TARGET_USER LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteTargetUser",
	      "(NTE_TARGET_USER = ? OR NTE_TARGET_USER IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteTargetUser asc", "NTE_TARGET_USER ASC ") // ORDER ASCENDING

	         .addOrderBy("NteTargetUser desc", "NTE_TARGET_USER DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteReallocBy", /* PK attribute */
	    "NTE_REALLOC_BY = ? ")
	         .addFilterBy( "filterByNteReallocByMatch", "NTE_REALLOC_BY LIKE ?")
	         .addFilterBy( "INNteReallocBy","NTE_REALLOC_BY IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteReallocBy","NTE_REALLOC_BY NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteReallocBy","NTE_REALLOC_BY != ?") // NOTEQUAL

	         .addFilterBy( "nullNteReallocBy",   "(NTE_REALLOC_BY IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteReallocBy","NTE_REALLOC_BY IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteReallocBy","NTE_REALLOC_BY < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteReallocBy","NTE_REALLOC_BY > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteReallocByMatch","NTE_REALLOC_BY LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteReallocBy",
	      "(NTE_REALLOC_BY = ? OR NTE_REALLOC_BY IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteReallocBy asc", "NTE_REALLOC_BY ASC ") // ORDER ASCENDING

	         .addOrderBy("NteReallocBy desc", "NTE_REALLOC_BY DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteReallocDate", /* PK attribute */
	    "NTE_REALLOC_DATE = ? ")
	         .addFilterBy( "filterByNteReallocDateMatch", "NTE_REALLOC_DATE LIKE ?")
	         .addFilterBy( "INNteReallocDate","NTE_REALLOC_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteReallocDate","NTE_REALLOC_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteReallocDate","NTE_REALLOC_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteReallocDate",   "(NTE_REALLOC_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteReallocDate","NTE_REALLOC_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteReallocDate","NTE_REALLOC_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteReallocDate","NTE_REALLOC_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteReallocDateMatch","NTE_REALLOC_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteReallocDate",
	      "(NTE_REALLOC_DATE = ? OR NTE_REALLOC_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteReallocDate asc", "NTE_REALLOC_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteReallocDate desc", "NTE_REALLOC_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteSsuspendedUser", /* PK attribute */
	    "NTE_SUSPENDED_USER = ? ")
	         .addFilterBy( "filterByNteSsuspendedUserMatch", "NTE_SUSPENDED_USER LIKE ?")
	         .addFilterBy( "INNteSsuspendedUser","NTE_SUSPENDED_USER IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteSsuspendedUser","NTE_SUSPENDED_USER NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteSsuspendedUser","NTE_SUSPENDED_USER != ?") // NOTEQUAL

	         .addFilterBy( "nullNteSsuspendedUser",   "(NTE_SUSPENDED_USER IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteSsuspendedUser","NTE_SUSPENDED_USER IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteSsuspendedUser","NTE_SUSPENDED_USER < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteSsuspendedUser","NTE_SUSPENDED_USER > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteSsuspendedUserMatch","NTE_SUSPENDED_USER LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteSsuspendedUser",
	      "(NTE_SUSPENDED_USER = ? OR NTE_SUSPENDED_USER IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteSsuspendedUser asc", "NTE_SUSPENDED_USER ASC ") // ORDER ASCENDING

	         .addOrderBy("NteSsuspendedUser desc", "NTE_SUSPENDED_USER DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteBillAcNo", /* PK attribute */
	    "NTE_BILL_AC_NO = ? ")
	         .addFilterBy( "filterByNteBillAcNoMatch", "NTE_BILL_AC_NO LIKE ?")
	         .addFilterBy( "INNteBillAcNo","NTE_BILL_AC_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteBillAcNo","NTE_BILL_AC_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteBillAcNo","NTE_BILL_AC_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullNteBillAcNo",   "(NTE_BILL_AC_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteBillAcNo","NTE_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteBillAcNo","NTE_BILL_AC_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteBillAcNo","NTE_BILL_AC_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteBillAcNoMatch","NTE_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteBillAcNo",
	      "(NTE_BILL_AC_NO = ? OR NTE_BILL_AC_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteBillAcNo asc", "NTE_BILL_AC_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("NteBillAcNo desc", "NTE_BILL_AC_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteInvoiceNo", /* PK attribute */
	    "NTE_INVOICE_NO = ? ")
	         .addFilterBy( "filterByNteInvoiceNoMatch", "NTE_INVOICE_NO LIKE ?")
	         .addFilterBy( "INNteInvoiceNo","NTE_INVOICE_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteInvoiceNo","NTE_INVOICE_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteInvoiceNo","NTE_INVOICE_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullNteInvoiceNo",   "(NTE_INVOICE_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteInvoiceNo","NTE_INVOICE_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteInvoiceNo","NTE_INVOICE_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteInvoiceNo","NTE_INVOICE_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteInvoiceNoMatch","NTE_INVOICE_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteInvoiceNo",
	      "(NTE_INVOICE_NO = ? OR NTE_INVOICE_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteInvoiceNo asc", "NTE_INVOICE_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("NteInvoiceNo desc", "NTE_INVOICE_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteSubscriberId", /* PK attribute */
	    "NTE_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterByNteSubscriberIdMatch", "NTE_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INNteSubscriberId","NTE_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteSubscriberId","NTE_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteSubscriberId","NTE_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullNteSubscriberId",   "(NTE_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteSubscriberId","NTE_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteSubscriberId","NTE_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteSubscriberId","NTE_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteSubscriberIdMatch","NTE_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteSubscriberId",
	      "(NTE_SUBSCRIBER_ID = ? OR NTE_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteSubscriberId asc", "NTE_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("NteSubscriberId desc", "NTE_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteSimNo", /* PK attribute */
	    "NTE_SIM_NO = ? ")
	         .addFilterBy( "filterByNteSimNoMatch", "NTE_SIM_NO LIKE ?")
	         .addFilterBy( "INNteSimNo","NTE_SIM_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteSimNo","NTE_SIM_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteSimNo","NTE_SIM_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullNteSimNo",   "(NTE_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteSimNo","NTE_SIM_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteSimNo","NTE_SIM_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteSimNo","NTE_SIM_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteSimNoMatch","NTE_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteSimNo",
	      "(NTE_SIM_NO = ? OR NTE_SIM_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteSimNo asc", "NTE_SIM_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("NteSimNo desc", "NTE_SIM_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteMsisdnNo", /* PK attribute */
	    "NTE_MSISDN_NO = ? ")
	         .addFilterBy( "filterByNteMsisdnNoMatch", "NTE_MSISDN_NO LIKE ?")
	         .addFilterBy( "INNteMsisdnNo","NTE_MSISDN_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteMsisdnNo","NTE_MSISDN_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteMsisdnNo","NTE_MSISDN_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullNteMsisdnNo",   "(NTE_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteMsisdnNo","NTE_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteMsisdnNo","NTE_MSISDN_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteMsisdnNo","NTE_MSISDN_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteMsisdnNoMatch","NTE_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteMsisdnNo",
	      "(NTE_MSISDN_NO = ? OR NTE_MSISDN_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteMsisdnNo asc", "NTE_MSISDN_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("NteMsisdnNo desc", "NTE_MSISDN_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteReferenceNo", /* PK attribute */
	    "NTE_REFERENCE_NO = ? ")
	         .addFilterBy( "filterByNteReferenceNoMatch", "NTE_REFERENCE_NO LIKE ?")
	         .addFilterBy( "INNteReferenceNo","NTE_REFERENCE_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteReferenceNo","NTE_REFERENCE_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteReferenceNo","NTE_REFERENCE_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullNteReferenceNo",   "(NTE_REFERENCE_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteReferenceNo","NTE_REFERENCE_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteReferenceNo","NTE_REFERENCE_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteReferenceNo","NTE_REFERENCE_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteReferenceNoMatch","NTE_REFERENCE_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteReferenceNo",
	      "(NTE_REFERENCE_NO = ? OR NTE_REFERENCE_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteReferenceNo asc", "NTE_REFERENCE_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("NteReferenceNo desc", "NTE_REFERENCE_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNteLastPage", /* PK attribute */
	    "NTE_LAST_PAGE = ? ")
	         .addFilterBy( "filterByNteLastPageMatch", "NTE_LAST_PAGE LIKE ?")
	         .addFilterBy( "INNteLastPage","NTE_LAST_PAGE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNteLastPage","NTE_LAST_PAGE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNteLastPage","NTE_LAST_PAGE != ?") // NOTEQUAL

	         .addFilterBy( "nullNteLastPage",   "(NTE_LAST_PAGE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNteLastPage","NTE_LAST_PAGE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNteLastPage","NTE_LAST_PAGE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNteLastPage","NTE_LAST_PAGE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNteLastPageMatch","NTE_LAST_PAGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNteLastPage",
	      "(NTE_LAST_PAGE = ? OR NTE_LAST_PAGE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NteLastPage asc", "NTE_LAST_PAGE ASC ") // ORDER ASCENDING

	         .addOrderBy("NteLastPage desc", "NTE_LAST_PAGE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalNtePiorityType", /* PK attribute */
	    "NTE_PRIORITY_TYPE = ? ")
	         .addFilterBy( "filterByNtePiorityTypeMatch", "NTE_PRIORITY_TYPE LIKE ?")
	         .addFilterBy( "INNtePiorityType","NTE_PRIORITY_TYPE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINNtePiorityType","NTE_PRIORITY_TYPE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalNtePiorityType","NTE_PRIORITY_TYPE != ?") // NOTEQUAL

	         .addFilterBy( "nullNtePiorityType",   "(NTE_PRIORITY_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	         .addFilterBy( "notnullNtePiorityType","NTE_PRIORITY_TYPE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanNtePiorityType","NTE_PRIORITY_TYPE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanNtePiorityType","NTE_PRIORITY_TYPE > ? ") // GREATER THAN

	         .addFilterBy( "filterByNtePiorityTypeMatch","NTE_PRIORITY_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullNtePiorityType",
	      "(NTE_PRIORITY_TYPE = ? OR NTE_PRIORITY_TYPE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("NtePiorityType asc", "NTE_PRIORITY_TYPE ASC ") // ORDER ASCENDING

	         .addOrderBy("NtePiorityType desc", "NTE_PRIORITY_TYPE DESC ") // ORDER DESCENDING
	    ;
	  }
	  
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new NteNoteDMLFactory( );
	    }

	    return dml;
	  }	  
}