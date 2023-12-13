package com.eppixcomm.eppix.base.dml;



public class EarEpxactionArchAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;
	
	public EarEpxactionArchAbstractDMLFactory()throws DMLException{
		
		DMLTable table = defTable( "EarEpxactionArch", // dmlName
		        "blo.EarEpxactionArchDMO", // dmoName
		        "EAR_EPXACTION_ARCH", // tableName
		        37, // numColumns
		        "EAR_BILL_AC_NO,EAR_SUBSCRIBER_ID,EAR_SIM_NO," +
		        "EAR_IMSI_NO,EAR_MSISDN_NO,EAR_INVOICE_NO," +
		        "EAR_REFERENCE_NO,EAR_SUBSYSTEM,EAR_RELATION," +
		        "EAR_TRIGGER,EAR_ACTION_TYPE,EAR_ACTION_SEQ," +
		        "EAR_DOC_TYPE,EAR_SERVICE_CODE,EAR_REASON_CODE," +
		        "EAR_TABLE_NAME,EAR_COLUMN_NAME,EAR_NEW_VALUE," +
		        "EAR_WHERE_COLUMN,EAR_WHERE_TYPE,EAR_CHARGE_CODE," +
		        "EAR_VOICE_MESS,EAR_AMN_ACTION_ID,EAR_AMN_TARG_TYPE," +
		        "EAR_AMN_TARG_GRP,EAR_AMN_TARG_USER,EAR_AMN_DEADLINE," +
		        "EAR_AMN_STATUS,EAR_AMN_SOURCE,EAR_AMN_OPENED_BY," +
		        "EAR_UDA_ACTION_ID,EAR_STATUS,EAR_RETRY_REMAIN," +
		        "EAR_LAST_RETRY,EAR_ERROR_TEXT,EAR_SUBMITTED,EAR_ACTIONED",// columnList
		        null, //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "EAR_BILL_AC_NO,EAR_SUBSCRIBER_ID,EAR_SIM_NO," +
		        "EAR_IMSI_NO,EAR_MSISDN_NO,EAR_INVOICE_NO," +
		        "EAR_REFERENCE_NO,EAR_SUBSYSTEM,EAR_RELATION," +
		        "EAR_TRIGGER,EAR_ACTION_TYPE,EAR_ACTION_SEQ," +
		        "EAR_DOC_TYPE,EAR_SERVICE_CODE,EAR_REASON_CODE," +
		        "EAR_TABLE_NAME,EAR_COLUMN_NAME,EAR_NEW_VALUE," +
		        "EAR_WHERE_COLUMN,EAR_WHERE_TYPE,EAR_CHARGE_CODE," +
		        "EAR_VOICE_MESS,EAR_AMN_ACTION_ID,EAR_AMN_TARG_TYPE," +
		        "EAR_AMN_TARG_GRP,EAR_AMN_TARG_USER,EAR_AMN_DEADLINE," +
		        "EAR_AMN_STATUS,EAR_AMN_SOURCE,EAR_AMN_OPENED_BY," +
		        "EAR_UDA_ACTION_ID,EAR_STATUS,EAR_RETRY_REMAIN," +
		        "EAR_LAST_RETRY,EAR_ERROR_TEXT,EAR_SUBMITTED,EAR_ACTIONED", // List of fields
		        "", 
		        "",
		        new String[] {
				"EAR_BILL_AC_NO","EAR_SUBSCRIBER_ID","EAR_SIM_NO",
				"EAR_IMSI_NO","EAR_MSISDN_NO","EAR_INVOICE_NO",
				"EAR_REFERENCE_NO","EAR_SUBSYSTEM","EAR_RELATION",
				"EAR_TRIGGER","EAR_ACTION_TYPE","EAR_ACTION_SEQ",
				"EAR_DOC_TYPE","EAR_SERVICE_CODE","EAR_REASON_CODE",
				"EAR_TABLE_NAME","EAR_COLUMN_NAME","EAR_NEW_VALUE",
				"EAR_WHERE_COLUMN","EAR_WHERE_TYPE","EAR_VOICE_MESS",
				"EAR_AMN_ACTION_ID","EAR_AMN_TARG_TYPE","EAR_AMN_TARG_GRP",
				"EAR_AMN_TARG_USER","EAR_AMN_DEADLINE","EAR_AMN_STATUS",
				"EAR_AMN_SOURCE","EAR_AMN_OPENED_BY","EAR_UDA_ACTION_ID",
				"EAR_STATUS","EAR_RETRY_REMAIN","EAR_LAST_RETRY",
				"EAR_ERROR_TEXT","EAR_SUBMITTED","EAR_ACTIONED" 
		}, false);
			
			
		   table.addFilterBy( "equalEarBillAcNo", "(EAR_BILL_AC_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarBillAcNo", "(EAR_BILL_AC_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarBillAcNo",
	      "(EAR_BILL_AC_NO IS NULL OR LENGTH((EAR_BILL_AC_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarBillAcNo", "EAR_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarBillAcNoMatch", "EAR_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarBillAcNo",
	      "((EAR_BILL_AC_NO) = ? OR EAR_BILL_AC_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarBillAcNo", "EAR_BILL_AC_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarBillAcNo", "EAR_BILL_AC_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarBillAcNoasc", "EAR_BILL_AC_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarBillAcNodesc", "EAR_BILL_AC_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarSubscriberId", "(EAR_SUBSCRIBER_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarSubscriberId", "(EAR_SUBSCRIBER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarSubscriberId",
	      "(EAR_SUBSCRIBER_ID IS NULL OR LENGTH((EAR_SUBSCRIBER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarSubscriberId", "EAR_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarSubscriberIdMatch", "EAR_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarSubscriberId",
	      "((EAR_SUBSCRIBER_ID) = ? OR EAR_SUBSCRIBER_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarSubscriberId", "EAR_SUBSCRIBER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarSubscriberId", "EAR_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarSubscriberIdasc", "EAR_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarSubscriberIddesc", "EAR_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarSimNo", "(EAR_SIM_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarSimNo", "(EAR_SIM_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarSimNo",
	      "(EAR_SIM_NO IS NULL OR LENGTH((EAR_SIM_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarSimNo", "EAR_SIM_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarSimNoMatch", "EAR_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarSimNo",
	      "((EAR_SIM_NO) = ? OR EAR_SIM_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarSimNo", "EAR_SIM_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarSimNo", "EAR_SIM_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarSimNoasc", "EAR_SIM_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarSimNodesc", "EAR_SIM_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarImsiNo", "(EAR_IMSI_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarImsiNo", "(EAR_IMSI_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarImsiNo",
	      "(EAR_IMSI_NO IS NULL OR LENGTH((EAR_IMSI_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarImsiNo", "EAR_IMSI_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarImsiNoMatch", "EAR_IMSI_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarImsiNo",
	      "((EAR_IMSI_NO) = ? OR EAR_IMSI_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarImsiNo", "EAR_IMSI_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarImsiNo", "EAR_IMSI_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarImsiNoasc", "EAR_IMSI_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarImsiNodesc", "EAR_IMSI_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarMsisdnNo", "(EAR_MSISDN_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarMsisdnNo", "(EAR_MSISDN_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarMsisdnNo",
	      "(EAR_MSISDN_NO IS NULL OR LENGTH((EAR_MSISDN_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarMsisdnNo", "EAR_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarMsisdnNoMatch", "EAR_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarMsisdnNo",
	      "((EAR_MSISDN_NO) = ? OR EAR_MSISDN_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarMsisdnNo", "EAR_MSISDN_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarMsisdnNo", "EAR_MSISDN_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarMsisdnNoasc", "EAR_MSISDN_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarMsisdnNodesc", "EAR_MSISDN_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarInvoiceNo", "(EAR_INVOICE_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarInvoiceNo", "(EAR_INVOICE_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarInvoiceNo",
	      "(EAR_INVOICE_NO IS NULL OR LENGTH((EAR_INVOICE_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarInvoiceNo", "EAR_INVOICE_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarInvoiceNoMatch", "EAR_INVOICE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarInvoiceNo",
	      "((EAR_INVOICE_NO) = ? OR EAR_INVOICE_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarInvoiceNo", "EAR_INVOICE_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarInvoiceNo", "EAR_INVOICE_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarInvoiceNoasc", "EAR_INVOICE_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarInvoiceNodesc", "EAR_INVOICE_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarReferenceNo", "(EAR_REFERENCE_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarReferenceNo", "(EAR_REFERENCE_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarReferenceNo",
	      "(EAR_REFERENCE_NO IS NULL OR LENGTH((EAR_REFERENCE_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarReferenceNo", "EAR_REFERENCE_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarReferenceNoMatch", "EAR_REFERENCE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarReferenceNo",
	      "((EAR_REFERENCE_NO) = ? OR EAR_REFERENCE_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarReferenceNo", "EAR_REFERENCE_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarReferenceNo", "EAR_REFERENCE_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarReferenceNoasc", "EAR_REFERENCE_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarReferenceNodesc", "EAR_REFERENCE_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarSubsystem", "(EAR_SUBSYSTEM) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarSubsystem", "(EAR_SUBSYSTEM) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarSubsystem",
	      "(EAR_SUBSYSTEM IS NULL OR LENGTH((EAR_SUBSYSTEM)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarSubsystem", "EAR_SUBSYSTEM IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarSubsystemMatch", "EAR_SUBSYSTEM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarSubsystem",
	      "((EAR_SUBSYSTEM) = ? OR EAR_SUBSYSTEM IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarSubsystem", "EAR_SUBSYSTEM IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarSubsystem", "EAR_SUBSYSTEM NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarSubsystemasc", "EAR_SUBSYSTEM ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarSubsystemdesc", "EAR_SUBSYSTEM DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarRelation", "(EAR_RELATION) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarRelation", "(EAR_RELATION) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarRelation",
	      "(EAR_RELATION IS NULL OR LENGTH((EAR_RELATION)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarRelation", "EAR_RELATION IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarRelationMatch", "EAR_RELATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarRelation",
	      "((EAR_RELATION) = ? OR EAR_RELATION IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarRelation", "EAR_RELATION IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarRelation", "EAR_RELATION NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarRelationasc", "EAR_RELATION ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarRelationdesc", "EAR_RELATION DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarTrigger", "(EAR_TRIGGER) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarTrigger", "(EAR_TRIGGER) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarTrigger",
	      "(EAR_TRIGGER IS NULL OR LENGTH((EAR_TRIGGER)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarTrigger", "EAR_TRIGGER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarTriggerMatch", "EAR_TRIGGER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarTrigger",
	      "((EAR_TRIGGER) = ? OR EAR_TRIGGER IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarTrigger", "EAR_TRIGGER IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarTrigger", "EAR_TRIGGER NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarTriggerasc", "EAR_TRIGGER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarTriggerdesc", "EAR_TRIGGER DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarActionType", "(EAR_ACTION_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarActionType", "(EAR_ACTION_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarActionType",
	      "(EAR_ACTION_TYPE IS NULL OR LENGTH((EAR_ACTION_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarActionType", "EAR_ACTION_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarActionTypeMatch", "EAR_ACTION_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarActionType",
	      "((EAR_ACTION_TYPE) = ? OR EAR_ACTION_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarActionType", "EAR_ACTION_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarActionType", "EAR_ACTION_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarActionTypeasc", "EAR_ACTION_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarActionTypedesc", "EAR_ACTION_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarActionSeq", "(EAR_ACTION_SEQ) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarActionSeq", "(EAR_ACTION_SEQ) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarActionSeq",
	      "(EAR_ACTION_SEQ IS NULL OR LENGTH((EAR_ACTION_SEQ)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarActionSeq", "EAR_ACTION_SEQ IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarActionSeqMatch", "EAR_ACTION_SEQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarActionSeq",
	      "((EAR_ACTION_SEQ) = ? OR EAR_ACTION_SEQ IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarActionSeq", "EAR_ACTION_SEQ IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarActionSeq", "EAR_ACTION_SEQ NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarActionSeqasc", "EAR_ACTION_SEQ ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarActionSeqdesc", "EAR_ACTION_SEQ DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarDocType", "(EAR_DOC_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarDocType", "(EAR_DOC_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarDocType",
	      "(EAR_DOC_TYPE IS NULL OR LENGTH((EAR_DOC_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarDocType", "EAR_DOC_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarDocTypeMatch", "EAR_DOC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarDocType",
	      "((EAR_DOC_TYPE) = ? OR EAR_DOC_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarDocType", "EAR_DOC_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarDocType", "EAR_DOC_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarDocTypeasc", "EAR_DOC_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarDocTypedesc", "EAR_DOC_TYPE DESC" ) // ORDER DESCENDING
	    ;

		   table.addFilterBy( "equalEarServiceCode", "(EAR_SERVICE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarServiceCode", "(EAR_SERVICE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarServiceCode",
	      "(EAR_SERVICE_CODE IS NULL OR LENGTH((EAR_SERVICE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarServiceCode", "EAR_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarServiceCodeMatch", "EAR_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarServiceCode",
	      "((EAR_SERVICE_CODE) = ? OR EAR_SERVICE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarServiceCode", "EAR_SERVICE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarServiceCode", "EAR_SERVICE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarServiceCodeasc", "EAR_SERVICE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarServiceCodedesc", "EAR_SERVICE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarReasonCode", "(EAR_REASON_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarReasonCode", "(EAR_REASON_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarReasonCode",
	      "(EAR_REASON_CODE IS NULL OR LENGTH((EAR_REASON_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarReasonCode", "EAR_REASON_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarReasonCodeMatch", "EAR_REASON_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarReasonCode",
	      "((EAR_REASON_CODE) = ? OR EAR_REASON_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarReasonCode", "EAR_REASON_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarReasonCode", "EAR_REASON_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarReasonCodeasc", "EAR_REASON_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarReasonCodedesc", "EAR_REASON_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarTableName", "(EAR_TABLE_NAME) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarTableName", "(EAR_TABLE_NAME) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarTableName",
	      "(EAR_TABLE_NAME IS NULL OR LENGTH((EAR_TABLE_NAME)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarTableName", "EAR_TABLE_NAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarTableNameMatch", "EAR_TABLE_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarTableName",
	      "((EAR_TABLE_NAME) = ? OR EAR_TABLE_NAME IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarTableName", "EAR_TABLE_NAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarTableName", "EAR_TABLE_NAME NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarTableNameasc", "EAR_TABLE_NAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarTableNamedesc", "EAR_TABLE_NAME DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarColumnName", "(EAR_COLUMN_NAME) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarColumnName", "(EAR_COLUMN_NAME) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarColumnName",
	      "(EAR_COLUMN_NAME IS NULL OR LENGTH((EAR_COLUMN_NAME)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarColumnName", "EAR_COLUMN_NAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarColumnNameMatch", "EAR_COLUMN_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarColumnName",
	      "((EAR_COLUMN_NAME) = ? OR EAR_COLUMN_NAME IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarColumnName", "EAR_COLUMN_NAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarColumnName", "EAR_COLUMN_NAME NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarColumnNameasc", "EAR_COLUMN_NAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarColumnNamedesc", "EAR_COLUMN_NAME DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarNewValue", "(EAR_NEW_VALUE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarNewValue", "(EAR_NEW_VALUE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarNewValue",
	      "(EAR_NEW_VALUE IS NULL OR LENGTH((EAR_NEW_VALUE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarNewValue", "EAR_NEW_VALUE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarNewValueMatch", "EAR_NEW_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarNewValue",
	      "((EAR_NEW_VALUE) = ? OR EAR_NEW_VALUE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarNewValue", "EAR_NEW_VALUE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarNewValue", "EAR_NEW_VALUE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarNewValueasc", "EAR_NEW_VALUE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarNewValuedesc", "EAR_NEW_VALUE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarWhereColumn", "(EAR_WHERE_COLUMN) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarWhereColumn", "(EAR_WHERE_COLUMN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarWhereColumn",
	      "(EAR_WHERE_COLUMN IS NULL OR LENGTH((EAR_WHERE_COLUMN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarWhereColumn", "EAR_WHERE_COLUMN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarWhereColumnMatch", "EAR_WHERE_COLUMN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarWhereColumn",
	      "((EAR_WHERE_COLUMN) = ? OR EAR_WHERE_COLUMN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarWhereColumn", "EAR_WHERE_COLUMN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarWhereColumn", "EAR_WHERE_COLUMN NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarWhereColumnasc", "EAR_WHERE_COLUMN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarWhereColumndesc", "EAR_WHERE_COLUMN DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarWhereType", "(EAR_WHERE_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarWhereType", "(EAR_WHERE_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarWhereType",
	      "(EAR_WHERE_TYPE IS NULL OR LENGTH((EAR_WHERE_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarWhereType", "EAR_WHERE_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarWhereTypeMatch", "EAR_WHERE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarWhereType",
	      "((EAR_WHERE_TYPE) = ? OR EAR_WHERE_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarWhereType", "EAR_WHERE_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarWhereType", "EAR_WHERE_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarWhereTypeasc", "EAR_WHERE_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarWhereTypedesc", "EAR_WHERE_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarChargeCode", "(EAR_CHARGE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarChargeCode", "(EAR_CHARGE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarChargeCode",
	      "(EAR_CHARGE_CODE IS NULL OR LENGTH((EAR_CHARGE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarChargeCode", "EAR_CHARGE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarChargeCodeMatch", "EAR_CHARGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarChargeCode",
	      "((EAR_CHARGE_CODE) = ? OR EAR_CHARGE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarChargeCode", "EAR_CHARGE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarChargeCode", "EAR_CHARGE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarChargeCodeasc", "EAR_CHARGE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarChargeCodedesc", "EAR_CHARGE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarVoiceMess", "(EAR_VOICE_MESS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarVoiceMess", "(EAR_VOICE_MESS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarVoiceMess",
	      "(EAR_VOICE_MESS IS NULL OR LENGTH((EAR_VOICE_MESS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarVoiceMess", "EAR_VOICE_MESS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarVoiceMessMatch", "EAR_VOICE_MESS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarVoiceMess",
	      "((EAR_VOICE_MESS) = ? OR EAR_VOICE_MESS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarVoiceMess", "EAR_VOICE_MESS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarVoiceMess", "EAR_VOICE_MESS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarVoiceMessasc", "EAR_VOICE_MESS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarVoiceMessdesc", "EAR_VOICE_MESS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnActionId", "(EAR_AMN_ACTION_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnActionId", "(EAR_AMN_ACTION_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnActionId",
	      "(EAR_AMN_ACTION_ID IS NULL OR LENGTH((EAR_AMN_ACTION_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnActionId", "EAR_AMN_ACTION_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnActionIdMatch", "EAR_AMN_ACTION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnActionId",
	      "((EAR_AMN_ACTION_ID) = ? OR EAR_AMN_ACTION_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnActionId", "EAR_AMN_ACTION_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnActionId", "EAR_AMN_ACTION_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnActionIdasc", "EAR_AMN_ACTION_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnActionIddesc", "EAR_AMN_ACTION_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnTargType", "(EAR_AMN_TARG_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnTargType", "(EAR_AMN_TARG_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnTargType",
	      "(EAR_AMN_TARG_TYPE IS NULL OR LENGTH((EAR_AMN_TARG_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnTargType", "EAR_AMN_TARG_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnTargTypeMatch", "EAR_AMN_TARG_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnTargType",
	      "((EAR_AMN_TARG_TYPE) = ? OR EAR_AMN_TARG_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnTargType", "EAR_AMN_TARG_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnTargType", "EAR_AMN_TARG_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnTargTypeasc", "EAR_AMN_TARG_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnTargTypedesc", "EAR_AMN_TARG_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnTarggrp", "(EAR_AMN_TARG_GRP) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnTarggrp", "(EAR_AMN_TARG_GRP) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnTarggrp",
	      "(EAR_AMN_TARG_GRP IS NULL OR LENGTH((EAR_AMN_TARG_GRP)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnTarggrp", "EAR_AMN_TARG_GRP IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnTarggrpMatch", "EAR_AMN_TARG_GRP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnTarggrp",
	      "((EAR_AMN_TARG_GRP) = ? OR EAR_AMN_TARG_GRP IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnTarggrp", "EAR_AMN_TARG_GRP IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnTarggrp", "EAR_AMN_TARG_GRP NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnTarggrpasc", "EAR_AMN_TARG_GRP ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnTarggrpdesc", "EAR_AMN_TARG_GRP DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnTarguser", "(EAR_AMN_TARG_USER) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnTarguser", "(EAR_AMN_TARG_USER) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnTarguser",
	      "(EAR_AMN_TARG_USER IS NULL OR LENGTH((EAR_AMN_TARG_USER)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnTarguser", "EAR_AMN_TARG_USER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnTarguserMatch", "EAR_AMN_TARG_USER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnTarguser",
	      "((EAR_AMN_TARG_USER) = ? OR EAR_AMN_TARG_USER IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnTarguser", "EAR_AMN_TARG_USER IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnTarguser", "EAR_AMN_TARG_USER NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnTarguserasc", "EAR_AMN_TARG_USER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnTarguserdesc", "EAR_AMN_TARG_USER DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnDeadline", "(EAR_AMN_DEADLINE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnDeadline", "(EAR_AMN_DEADLINE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnDeadline",
	      "(EAR_AMN_DEADLINE IS NULL OR LENGTH((EAR_AMN_DEADLINE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnDeadline", "EAR_AMN_DEADLINE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnDeadlineMatch", "EAR_AMN_DEADLINE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnDeadline",
	      "((EAR_AMN_DEADLINE) = ? OR EAR_AMN_DEADLINE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnDeadline", "EAR_AMN_DEADLINE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnDeadline", "EAR_AMN_DEADLINE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnDeadlineasc", "EAR_AMN_DEADLINE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnDeadlinedesc", "EAR_AMN_DEADLINE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnStatus", "(EAR_AMN_STATUS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnStatus", "(EAR_AMN_STATUS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnStatus",
	      "(EAR_AMN_STATUS IS NULL OR LENGTH((EAR_AMN_STATUS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnStatus", "EAR_AMN_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnStatusMatch", "EAR_AMN_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnStatus",
	      "((EAR_AMN_STATUS) = ? OR EAR_AMN_STATUS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnStatus", "EAR_AMN_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnStatus", "EAR_AMN_STATUS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnStatusasc", "EAR_AMN_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnStatusdesc", "EAR_AMN_STATUS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnSource", "(EAR_AMN_SOURCE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnSource", "(EAR_AMN_SOURCE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnSource",
	      "(EAR_AMN_SOURCE IS NULL OR LENGTH((EAR_AMN_SOURCE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnSource", "EAR_AMN_SOURCE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnSourceMatch", "EAR_AMN_SOURCE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnSource",
	      "((EAR_AMN_SOURCE) = ? OR EAR_AMN_SOURCE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnSource", "EAR_AMN_SOURCE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnSource", "EAR_AMN_SOURCE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnSourceasc", "EAR_AMN_SOURCE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnSourcedesc", "EAR_AMN_SOURCE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarAmnopenedBy", "(EAR_AMN_OPENED_BY) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarAmnopenedBy", "(EAR_AMN_OPENED_BY) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarAmnopenedBy",
	      "(EAR_AMN_OPENED_BY IS NULL OR LENGTH((EAR_AMN_OPENED_BY)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarAmnopenedBy", "EAR_AMN_OPENED_BY IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarAmnopenedByMatch", "EAR_AMN_OPENED_BY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarAmnopenedBy",
	      "((EAR_AMN_OPENED_BY) = ? OR EAR_AMN_OPENED_BY IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarAmnopenedBy", "EAR_AMN_OPENED_BY IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarAmnopenedBy", "EAR_AMN_OPENED_BY NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarAmnopenedByasc", "EAR_AMN_OPENED_BY ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarAmnopenedBydesc", "EAR_AMN_OPENED_BY DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarUdaActionId", "(EAR_UDA_ACTION_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarUdaActionId", "(EAR_UDA_ACTION_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarUdaActionId",
	      "(EAR_UDA_ACTION_ID IS NULL OR LENGTH((EAR_UDA_ACTION_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarUdaActionId", "EAR_UDA_ACTION_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarUdaActionIdMatch", "EAR_UDA_ACTION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarUdaActionId",
	      "((EAR_UDA_ACTION_ID) = ? OR EAR_UDA_ACTION_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarUdaActionId", "EAR_UDA_ACTION_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarUdaActionId", "EAR_UDA_ACTION_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarUdaActionIdasc", "EAR_UDA_ACTION_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarUdaActionIddesc", "EAR_UDA_ACTION_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarStatus", "(EAR_STATUS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarStatus", "(EAR_STATUS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarStatus",
	      "(EAR_STATUS IS NULL OR LENGTH((EAR_STATUS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarStatus", "EAR_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarStatusMatch", "EAR_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarStatus",
	      "((EAR_STATUS) = ? OR EAR_STATUS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarStatus", "EAR_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarStatus", "EAR_STATUS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarStatusasc", "EAR_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarStatusdesc", "EAR_STATUS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarRetryTemain", "(EAR_RETRY_REMAIN) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarRetryTemain", "(EAR_RETRY_REMAIN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarRetryTemain",
	      "(EAR_RETRY_REMAIN IS NULL OR LENGTH((EAR_RETRY_REMAIN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarRetryTemain", "EAR_RETRY_REMAIN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarRetryTemainMatch", "EAR_RETRY_REMAIN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarRetryTemain",
	      "((EAR_RETRY_REMAIN) = ? OR EAR_RETRY_REMAIN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarRetryTemain", "EAR_RETRY_REMAIN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarRetryTemain", "EAR_RETRY_REMAIN NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarRetryTemainasc", "EAR_RETRY_REMAIN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarRetryTemaindesc", "EAR_RETRY_REMAIN DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarLastRetry", "(EAR_LAST_RETRY) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarLastRetry", "(EAR_LAST_RETRY) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarLastRetry",
	      "(EAR_LAST_RETRY IS NULL OR LENGTH((EAR_LAST_RETRY)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarLastRetry", "EAR_LAST_RETRY IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarLastRetryMatch", "EAR_LAST_RETRY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarLastRetry",
	      "((EAR_LAST_RETRY) = ? OR EAR_LAST_RETRY IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarLastRetry", "EAR_LAST_RETRY IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarLastRetry", "EAR_LAST_RETRY NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarLastRetryasc", "EAR_LAST_RETRY ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarLastRetrydesc", "EAR_LAST_RETRY DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarErrorText", "(EAR_ERROR_TEXT) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarErrorText", "(EAR_ERROR_TEXT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarErrorText",
	      "(EAR_ERROR_TEXT IS NULL OR LENGTH((EAR_ERROR_TEXT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarErrorText", "EAR_ERROR_TEXT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarErrorTextMatch", "EAR_ERROR_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarErrorText",
	      "((EAR_ERROR_TEXT) = ? OR EAR_ERROR_TEXT IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarErrorText", "EAR_ERROR_TEXT IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarErrorText", "EAR_ERROR_TEXT NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarErrorTextasc", "EAR_ERROR_TEXT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarErrorTextdesc", "EAR_ERROR_TEXT DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarSubmitted", "(EAR_SUBMITTED) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarSubmitted", "(EAR_SUBMITTED) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarSubmitted",
	      "(EAR_SUBMITTED IS NULL OR LENGTH((EAR_SUBMITTED)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarSubmitted", "EAR_SUBMITTED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarSubmittedMatch", "EAR_SUBMITTED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarSubmitted",
	      "((EAR_SUBMITTED) = ? OR EAR_SUBMITTED IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarSubmitted", "EAR_SUBMITTED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarSubmitted", "EAR_SUBMITTED NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarSubmittedasc", "EAR_SUBMITTED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarSubmitteddesc", "EAR_SUBMITTED DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEarActioned", "(EAR_ACTIONED) = ?" ) // EQUAL

	         .addFilterBy( "notequalEarActioned", "(EAR_ACTIONED) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEarActioned",
	      "(EAR_ACTIONED IS NULL OR LENGTH((EAR_ACTIONED)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEarActioned", "EAR_ACTIONED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEarActionedMatch", "EAR_ACTIONED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEarActioned",
	      "((EAR_ACTIONED) = ? OR EAR_ACTIONED IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEarActioned", "EAR_ACTIONED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEarActioned", "EAR_ACTIONED NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EarActionedasc", "EAR_ACTIONED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EarActioneddesc", "EAR_ACTIONED DESC" ) // ORDER DESCENDING
	    ;
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EarEpxactionArchDMLFactory(  );
	    }

	    return dml;
	  }
}
