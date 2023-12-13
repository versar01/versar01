package com.eppixcomm.eppix.base.dml;

public class EapEpxactionPendAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;
	
	public EapEpxactionPendAbstractDMLFactory()throws DMLException{
		
		DMLTable table = defTable( "EapEpxactionPend", // dmlName
		        "blo.EapEpxactionPendDMO", // dmoName
		        "EAP_EPXACTION_PEND", // tableName
		        37, // numColumns
		        "EAP_BILL_AC_NO,EAP_SUBSCRIBER_ID,EAP_SIM_NO," +
		        "EAP_IMSI_NO,EAP_MSISDN_NO,EAP_INVOICE_NO," +
		        "EAP_REFERENCE_NO,EAP_SUBSYSTEM,EAP_RELATION," +
		        "EAP_TRIGGER,EAP_ACTION_TYPE,EAP_ACTION_SEQ," +
		        "EAP_DOC_TYPE,EAP_SERVICE_CODE,EAP_REASON_CODE," +
		        "EAP_TABLE_NAME,EAP_COLUMN_NAME,EAP_NEW_VALUE," +
		        "EAP_WHERE_COLUMN,EAP_WHERE_TYPE,EAP_CHARGE_CODE," +
		        "EAP_VOICE_MESS,EAP_AMN_ACTION_ID,EAP_AMN_TARG_TYPE," +
		        "EAP_AMN_TARG_GRP,EAP_AMN_TARG_USER,EAP_AMN_DEADLINE," +
		        "EAP_AMN_STATUS,EAP_AMN_SOURCE,EAP_AMN_OPENED_BY," +
		        "EAP_UDA_ACTION_ID,EAP_STATUS,EAP_RETRY_REMAIN," +
		        "EAP_LAST_RETRY,EAP_ERROR_TEXT,EAP_SUBMITTED,EAP_ACTIONED",// columnList
		        "EAP_SUBSYSTEM, EAP_ACTION_SEQ", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "EAP_BILL_AC_NO,EAP_SUBSCRIBER_ID,EAP_SIM_NO," +
		        "EAP_IMSI_NO,EAP_MSISDN_NO,EAP_INVOICE_NO," +
		        "EAP_REFERENCE_NO,EAP_SUBSYSTEM,EAP_RELATION," +
		        "EAP_TRIGGER,EAP_ACTION_TYPE,EAP_ACTION_SEQ," +
		        "EAP_DOC_TYPE,EAP_SERVICE_CODE,EAP_REASON_CODE," +
		        "EAP_TABLE_NAME,EAP_COLUMN_NAME,EAP_NEW_VALUE," +
		        "EAP_WHERE_COLUMN,EAP_WHERE_TYPE,EAP_CHARGE_CODE," +
		        "EAP_VOICE_MESS,EAP_AMN_ACTION_ID,EAP_AMN_TARG_TYPE," +
		        "EAP_AMN_TARG_GRP,EAP_AMN_TARG_USER,EAP_AMN_DEADLINE," +
		        "EAP_AMN_STATUS,EAP_AMN_SOURCE,EAP_AMN_OPENED_BY," +
		        "EAP_UDA_ACTION_ID,EAP_STATUS,EAP_RETRY_REMAIN," +
		        "EAP_LAST_RETRY,EAP_ERROR_TEXT,EAP_SUBMITTED,EAP_ACTIONED", // List of fields
		        "", 
		        "",
		        new String[] {
				"EAP_BILL_AC_NO","EAP_SUBSCRIBER_ID","EAP_SIM_NO",
				"EAP_IMSI_NO","EAP_MSISDN_NO","EAP_INVOICE_NO",
				"EAP_REFERENCE_NO","EAP_SUBSYSTEM","EAP_RELATION",
				"EAP_TRIGGER","EAP_ACTION_TYPE","EAP_ACTION_SEQ",
				"EAP_DOC_TYPE","EAP_SERVICE_CODE","EAP_REASON_CODE",
				"EAP_TABLE_NAME","EAP_COLUMN_NAME","EAP_NEW_VALUE",
				"EAP_WHERE_COLUMN","EAP_WHERE_TYPE","EAP_CHARGE_CODE","EAP_VOICE_MESS",
				"EAP_AMN_ACTION_ID","EAP_AMN_TARG_TYPE","EAP_AMN_TARG_GRP",
				"EAP_AMN_TARG_USER","EAP_AMN_DEADLINE","EAP_AMN_STATUS",
				"EAP_AMN_SOURCE","EAP_AMN_OPENED_BY","EAP_UDA_ACTION_ID",
				"EAP_STATUS","EAP_RETRY_REMAIN","EAP_LAST_RETRY",
				"EAP_ERROR_TEXT","EAP_SUBMITTED","EAP_ACTIONED" 
		}, true);
			
			
		   table.addFilterBy( "equalEapBillAcNo", "(EAP_BILL_AC_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapBillAcNo", "(EAP_BILL_AC_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapBillAcNo",
	      "(EAP_BILL_AC_NO IS NULL OR LENGTH((EAP_BILL_AC_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapBillAcNo", "EAP_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapBillAcNoMatch", "EAP_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapBillAcNo",
	      "((EAP_BILL_AC_NO) = ? OR EAP_BILL_AC_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapBillAcNo", "EAP_BILL_AC_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapBillAcNo", "EAP_BILL_AC_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapBillAcNoasc", "EAP_BILL_AC_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapBillAcNodesc", "EAP_BILL_AC_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapSubscriberId", "(EAP_SUBSCRIBER_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapSubscriberId", "(EAP_SUBSCRIBER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapSubscriberId",
	      "(EAP_SUBSCRIBER_ID IS NULL OR LENGTH((EAP_SUBSCRIBER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapSubscriberId", "EAP_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapSubscriberIdMatch", "EAP_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapSubscriberId",
	      "((EAP_SUBSCRIBER_ID) = ? OR EAP_SUBSCRIBER_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapSubscriberId", "EAP_SUBSCRIBER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapSubscriberId", "EAP_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapSubscriberIdasc", "EAP_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapSubscriberIddesc", "EAP_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapSimNo", "(EAP_SIM_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapSimNo", "(EAP_SIM_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapSimNo",
	      "(EAP_SIM_NO IS NULL OR LENGTH((EAP_SIM_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapSimNo", "EAP_SIM_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapSimNoMatch", "EAP_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapSimNo",
	      "((EAP_SIM_NO) = ? OR EAP_SIM_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapSimNo", "EAP_SIM_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapSimNo", "EAP_SIM_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapSimNoasc", "EAP_SIM_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapSimNodesc", "EAP_SIM_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapImsiNo", "(EAP_IMSI_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapImsiNo", "(EAP_IMSI_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapImsiNo",
	      "(EAP_IMSI_NO IS NULL OR LENGTH((EAP_IMSI_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapImsiNo", "EAP_IMSI_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapImsiNoMatch", "EAP_IMSI_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapImsiNo",
	      "((EAP_IMSI_NO) = ? OR EAP_IMSI_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapImsiNo", "EAP_IMSI_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapImsiNo", "EAP_IMSI_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapImsiNoasc", "EAP_IMSI_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapImsiNodesc", "EAP_IMSI_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapMsisdnNo", "(EAP_MSISDN_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapMsisdnNo", "(EAP_MSISDN_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapMsisdnNo",
	      "(EAP_MSISDN_NO IS NULL OR LENGTH((EAP_MSISDN_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapMsisdnNo", "EAP_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapMsisdnNoMatch", "EAP_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapMsisdnNo",
	      "((EAP_MSISDN_NO) = ? OR EAP_MSISDN_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapMsisdnNo", "EAP_MSISDN_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapMsisdnNo", "EAP_MSISDN_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapMsisdnNoasc", "EAP_MSISDN_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapMsisdnNodesc", "EAP_MSISDN_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapInvoiceNo", "(EAP_INVOICE_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapInvoiceNo", "(EAP_INVOICE_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapInvoiceNo",
	      "(EAP_INVOICE_NO IS NULL OR LENGTH((EAP_INVOICE_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapInvoiceNo", "EAP_INVOICE_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapInvoiceNoMatch", "EAP_INVOICE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapInvoiceNo",
	      "((EAP_INVOICE_NO) = ? OR EAP_INVOICE_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapInvoiceNo", "EAP_INVOICE_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapInvoiceNo", "EAP_INVOICE_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapInvoiceNoasc", "EAP_INVOICE_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapInvoiceNodesc", "EAP_INVOICE_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapReferenceNo", "(EAP_REFERENCE_NO) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapReferenceNo", "(EAP_REFERENCE_NO) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapReferenceNo",
	      "(EAP_REFERENCE_NO IS NULL OR LENGTH((EAP_REFERENCE_NO)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapReferenceNo", "EAP_REFERENCE_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapReferenceNoMatch", "EAP_REFERENCE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapReferenceNo",
	      "((EAP_REFERENCE_NO) = ? OR EAP_REFERENCE_NO IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapReferenceNo", "EAP_REFERENCE_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapReferenceNo", "EAP_REFERENCE_NO NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapReferenceNoasc", "EAP_REFERENCE_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapReferenceNodesc", "EAP_REFERENCE_NO DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapSubsystem", "(EAP_SUBSYSTEM) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapSubsystem", "(EAP_SUBSYSTEM) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapSubsystem",
	      "(EAP_SUBSYSTEM IS NULL OR LENGTH((EAP_SUBSYSTEM)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapSubsystem", "EAP_SUBSYSTEM IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapSubsystemMatch", "EAP_SUBSYSTEM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapSubsystem",
	      "((EAP_SUBSYSTEM) = ? OR EAP_SUBSYSTEM IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapSubsystem", "EAP_SUBSYSTEM IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapSubsystem", "EAP_SUBSYSTEM NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapSubsystemasc", "EAP_SUBSYSTEM ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapSubsystemdesc", "EAP_SUBSYSTEM DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapRelation", "(EAP_RELATION) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapRelation", "(EAP_RELATION) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapRelation",
	      "(EAP_RELATION IS NULL OR LENGTH((EAP_RELATION)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapRelation", "EAP_RELATION IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapRelationMatch", "EAP_RELATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapRelation",
	      "((EAP_RELATION) = ? OR EAP_RELATION IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapRelation", "EAP_RELATION IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapRelation", "EAP_RELATION NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapRelationasc", "EAP_RELATION ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapRelationdesc", "EAP_RELATION DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapTrigger", "(EAP_TRIGGER) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapTrigger", "(EAP_TRIGGER) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapTrigger",
	      "(EAP_TRIGGER IS NULL OR LENGTH((EAP_TRIGGER)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapTrigger", "EAP_TRIGGER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapTriggerMatch", "EAP_TRIGGER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapTrigger",
	      "((EAP_TRIGGER) = ? OR EAP_TRIGGER IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapTrigger", "EAP_TRIGGER IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapTrigger", "EAP_TRIGGER NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapTriggerasc", "EAP_TRIGGER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapTriggerdesc", "EAP_TRIGGER DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapActionType", "(EAP_ACTION_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapActionType", "(EAP_ACTION_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapActionType",
	      "(EAP_ACTION_TYPE IS NULL OR LENGTH((EAP_ACTION_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapActionType", "EAP_ACTION_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapActionTypeMatch", "EAP_ACTION_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapActionType",
	      "((EAP_ACTION_TYPE) = ? OR EAP_ACTION_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapActionType", "EAP_ACTION_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapActionType", "EAP_ACTION_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapActionTypeasc", "EAP_ACTION_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapActionTypedesc", "EAP_ACTION_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapActionSeq", "(EAP_ACTION_SEQ) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapActionSeq", "(EAP_ACTION_SEQ) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapActionSeq",
	      "(EAP_ACTION_SEQ IS NULL OR LENGTH((EAP_ACTION_SEQ)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapActionSeq", "EAP_ACTION_SEQ IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapActionSeqMatch", "EAP_ACTION_SEQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapActionSeq",
	      "((EAP_ACTION_SEQ) = ? OR EAP_ACTION_SEQ IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapActionSeq", "EAP_ACTION_SEQ IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapActionSeq", "EAP_ACTION_SEQ NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapActionSeqasc", "EAP_ACTION_SEQ ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapActionSeqdesc", "EAP_ACTION_SEQ DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapDocType", "(EAP_DOC_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapDocType", "(EAP_DOC_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapDocType",
	      "(EAP_DOC_TYPE IS NULL OR LENGTH((EAP_DOC_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapDocType", "EAP_DOC_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapDocTypeMatch", "EAP_DOC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapDocType",
	      "((EAP_DOC_TYPE) = ? OR EAP_DOC_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapDocType", "EAP_DOC_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapDocType", "EAP_DOC_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapDocTypeasc", "EAP_DOC_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapDocTypedesc", "EAP_DOC_TYPE DESC" ) // ORDER DESCENDING
	    ;

		   table.addFilterBy( "equalEapServiceCode", "(EAP_SERVICE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapServiceCode", "(EAP_SERVICE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapServiceCode",
	      "(EAP_SERVICE_CODE IS NULL OR LENGTH((EAP_SERVICE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapServiceCode", "EAP_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapServiceCodeMatch", "EAP_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapServiceCode",
	      "((EAP_SERVICE_CODE) = ? OR EAP_SERVICE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapServiceCode", "EAP_SERVICE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapServiceCode", "EAP_SERVICE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapServiceCodeasc", "EAP_SERVICE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapServiceCodedesc", "EAP_SERVICE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapReasonCode", "(EAP_REASON_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapReasonCode", "(EAP_REASON_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapReasonCode",
	      "(EAP_REASON_CODE IS NULL OR LENGTH((EAP_REASON_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapReasonCode", "EAP_REASON_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapReasonCodeMatch", "EAP_REASON_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapReasonCode",
	      "((EAP_REASON_CODE) = ? OR EAP_REASON_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapReasonCode", "EAP_REASON_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapReasonCode", "EAP_REASON_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapReasonCodeasc", "EAP_REASON_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapReasonCodedesc", "EAP_REASON_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapTableName", "(EAP_TABLE_NAME) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapTableName", "(EAP_TABLE_NAME) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapTableName",
	      "(EAP_TABLE_NAME IS NULL OR LENGTH((EAP_TABLE_NAME)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapTableName", "EAP_TABLE_NAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapTableNameMatch", "EAP_TABLE_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapTableName",
	      "((EAP_TABLE_NAME) = ? OR EAP_TABLE_NAME IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapTableName", "EAP_TABLE_NAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapTableName", "EAP_TABLE_NAME NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapTableNameasc", "EAP_TABLE_NAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapTableNamedesc", "EAP_TABLE_NAME DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapColumnName", "(EAP_COLUMN_NAME) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapColumnName", "(EAP_COLUMN_NAME) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapColumnName",
	      "(EAP_COLUMN_NAME IS NULL OR LENGTH((EAP_COLUMN_NAME)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapColumnName", "EAP_COLUMN_NAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapColumnNameMatch", "EAP_COLUMN_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapColumnName",
	      "((EAP_COLUMN_NAME) = ? OR EAP_COLUMN_NAME IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapColumnName", "EAP_COLUMN_NAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapColumnName", "EAP_COLUMN_NAME NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapColumnNameasc", "EAP_COLUMN_NAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapColumnNamedesc", "EAP_COLUMN_NAME DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapNewValue", "(EAP_NEW_VALUE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapNewValue", "(EAP_NEW_VALUE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapNewValue",
	      "(EAP_NEW_VALUE IS NULL OR LENGTH((EAP_NEW_VALUE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapNewValue", "EAP_NEW_VALUE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapNewValueMatch", "EAP_NEW_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapNewValue",
	      "((EAP_NEW_VALUE) = ? OR EAP_NEW_VALUE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapNewValue", "EAP_NEW_VALUE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapNewValue", "EAP_NEW_VALUE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapNewValueasc", "EAP_NEW_VALUE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapNewValuedesc", "EAP_NEW_VALUE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapWhereColumn", "(EAP_WHERE_COLUMN) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapWhereColumn", "(EAP_WHERE_COLUMN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapWhereColumn",
	      "(EAP_WHERE_COLUMN IS NULL OR LENGTH((EAP_WHERE_COLUMN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapWhereColumn", "EAP_WHERE_COLUMN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapWhereColumnMatch", "EAP_WHERE_COLUMN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapWhereColumn",
	      "((EAP_WHERE_COLUMN) = ? OR EAP_WHERE_COLUMN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapWhereColumn", "EAP_WHERE_COLUMN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapWhereColumn", "EAP_WHERE_COLUMN NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapWhereColumnasc", "EAP_WHERE_COLUMN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapWhereColumndesc", "EAP_WHERE_COLUMN DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapWhereType", "(EAP_WHERE_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapWhereType", "(EAP_WHERE_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapWhereType",
	      "(EAP_WHERE_TYPE IS NULL OR LENGTH((EAP_WHERE_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapWhereType", "EAP_WHERE_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapWhereTypeMatch", "EAP_WHERE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapWhereType",
	      "((EAP_WHERE_TYPE) = ? OR EAP_WHERE_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapWhereType", "EAP_WHERE_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapWhereType", "EAP_WHERE_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapWhereTypeasc", "EAP_WHERE_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapWhereTypedesc", "EAP_WHERE_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapChargeCode", "(EAP_CHARGE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapChargeCode", "(EAP_CHARGE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapChargeCode",
	      "(EAP_CHARGE_CODE IS NULL OR LENGTH((EAP_CHARGE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapChargeCode", "EAP_CHARGE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapChargeCodeMatch", "EAP_CHARGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapChargeCode",
	      "((EAP_CHARGE_CODE) = ? OR EAP_CHARGE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapChargeCode", "EAP_CHARGE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapChargeCode", "EAP_CHARGE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapChargeCodeasc", "EAP_CHARGE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapChargeCodedesc", "EAP_CHARGE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapVoiceMess", "(EAP_VOICE_MESS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapVoiceMess", "(EAP_VOICE_MESS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapVoiceMess",
	      "(EAP_VOICE_MESS IS NULL OR LENGTH((EAP_VOICE_MESS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapVoiceMess", "EAP_VOICE_MESS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapVoiceMessMatch", "EAP_VOICE_MESS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapVoiceMess",
	      "((EAP_VOICE_MESS) = ? OR EAP_VOICE_MESS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapVoiceMess", "EAP_VOICE_MESS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapVoiceMess", "EAP_VOICE_MESS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapVoiceMessasc", "EAP_VOICE_MESS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapVoiceMessdesc", "EAP_VOICE_MESS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnActionId", "(EAP_AMN_ACTION_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnActionId", "(EAP_AMN_ACTION_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnActionId",
	      "(EAP_AMN_ACTION_ID IS NULL OR LENGTH((EAP_AMN_ACTION_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnActionId", "EAP_AMN_ACTION_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnActionIdMatch", "EAP_AMN_ACTION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnActionId",
	      "((EAP_AMN_ACTION_ID) = ? OR EAP_AMN_ACTION_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnActionId", "EAP_AMN_ACTION_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnActionId", "EAP_AMN_ACTION_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnActionIdasc", "EAP_AMN_ACTION_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnActionIddesc", "EAP_AMN_ACTION_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnTargType", "(EAP_AMN_TARG_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnTargType", "(EAP_AMN_TARG_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnTargType",
	      "(EAP_AMN_TARG_TYPE IS NULL OR LENGTH((EAP_AMN_TARG_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnTargType", "EAP_AMN_TARG_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnTargTypeMatch", "EAP_AMN_TARG_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnTargType",
	      "((EAP_AMN_TARG_TYPE) = ? OR EAP_AMN_TARG_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnTargType", "EAP_AMN_TARG_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnTargType", "EAP_AMN_TARG_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnTargTypeasc", "EAP_AMN_TARG_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnTargTypedesc", "EAP_AMN_TARG_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnTarggrp", "(EAP_AMN_TARG_GRP) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnTarggrp", "(EAP_AMN_TARG_GRP) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnTarggrp",
	      "(EAP_AMN_TARG_GRP IS NULL OR LENGTH((EAP_AMN_TARG_GRP)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnTarggrp", "EAP_AMN_TARG_GRP IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnTarggrpMatch", "EAP_AMN_TARG_GRP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnTarggrp",
	      "((EAP_AMN_TARG_GRP) = ? OR EAP_AMN_TARG_GRP IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnTarggrp", "EAP_AMN_TARG_GRP IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnTarggrp", "EAP_AMN_TARG_GRP NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnTarggrpasc", "EAP_AMN_TARG_GRP ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnTarggrpdesc", "EAP_AMN_TARG_GRP DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnTarguser", "(EAP_AMN_TARG_USER) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnTarguser", "(EAP_AMN_TARG_USER) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnTarguser",
	      "(EAP_AMN_TARG_USER IS NULL OR LENGTH((EAP_AMN_TARG_USER)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnTarguser", "EAP_AMN_TARG_USER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnTarguserMatch", "EAP_AMN_TARG_USER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnTarguser",
	      "((EAP_AMN_TARG_USER) = ? OR EAP_AMN_TARG_USER IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnTarguser", "EAP_AMN_TARG_USER IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnTarguser", "EAP_AMN_TARG_USER NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnTarguserasc", "EAP_AMN_TARG_USER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnTarguserdesc", "EAP_AMN_TARG_USER DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnDeadline", "(EAP_AMN_DEADLINE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnDeadline", "(EAP_AMN_DEADLINE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnDeadline",
	      "(EAP_AMN_DEADLINE IS NULL OR LENGTH((EAP_AMN_DEADLINE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnDeadline", "EAP_AMN_DEADLINE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnDeadlineMatch", "EAP_AMN_DEADLINE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnDeadline",
	      "((EAP_AMN_DEADLINE) = ? OR EAP_AMN_DEADLINE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnDeadline", "EAP_AMN_DEADLINE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnDeadline", "EAP_AMN_DEADLINE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnDeadlineasc", "EAP_AMN_DEADLINE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnDeadlinedesc", "EAP_AMN_DEADLINE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnStatus", "(EAP_AMN_STATUS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnStatus", "(EAP_AMN_STATUS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnStatus",
	      "(EAP_AMN_STATUS IS NULL OR LENGTH((EAP_AMN_STATUS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnStatus", "EAP_AMN_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnStatusMatch", "EAP_AMN_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnStatus",
	      "((EAP_AMN_STATUS) = ? OR EAP_AMN_STATUS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnStatus", "EAP_AMN_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnStatus", "EAP_AMN_STATUS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnStatusasc", "EAP_AMN_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnStatusdesc", "EAP_AMN_STATUS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnSource", "(EAP_AMN_SOURCE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnSource", "(EAP_AMN_SOURCE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnSource",
	      "(EAP_AMN_SOURCE IS NULL OR LENGTH((EAP_AMN_SOURCE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnSource", "EAP_AMN_SOURCE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnSourceMatch", "EAP_AMN_SOURCE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnSource",
	      "((EAP_AMN_SOURCE) = ? OR EAP_AMN_SOURCE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnSource", "EAP_AMN_SOURCE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnSource", "EAP_AMN_SOURCE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnSourceasc", "EAP_AMN_SOURCE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnSourcedesc", "EAP_AMN_SOURCE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapAmnopenedBy", "(EAP_AMN_OPENED_BY) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapAmnopenedBy", "(EAP_AMN_OPENED_BY) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapAmnopenedBy",
	      "(EAP_AMN_OPENED_BY IS NULL OR LENGTH((EAP_AMN_OPENED_BY)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapAmnopenedBy", "EAP_AMN_OPENED_BY IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapAmnopenedByMatch", "EAP_AMN_OPENED_BY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapAmnopenedBy",
	      "((EAP_AMN_OPENED_BY) = ? OR EAP_AMN_OPENED_BY IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapAmnopenedBy", "EAP_AMN_OPENED_BY IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapAmnopenedBy", "EAP_AMN_OPENED_BY NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapAmnopenedByasc", "EAP_AMN_OPENED_BY ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapAmnopenedBydesc", "EAP_AMN_OPENED_BY DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapUdaActionId", "(EAP_UDA_ACTION_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapUdaActionId", "(EAP_UDA_ACTION_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapUdaActionId",
	      "(EAP_UDA_ACTION_ID IS NULL OR LENGTH((EAP_UDA_ACTION_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapUdaActionId", "EAP_UDA_ACTION_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapUdaActionIdMatch", "EAP_UDA_ACTION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapUdaActionId",
	      "((EAP_UDA_ACTION_ID) = ? OR EAP_UDA_ACTION_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapUdaActionId", "EAP_UDA_ACTION_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapUdaActionId", "EAP_UDA_ACTION_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapUdaActionIdasc", "EAP_UDA_ACTION_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapUdaActionIddesc", "EAP_UDA_ACTION_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapStatus", "(EAP_STATUS) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapStatus", "(EAP_STATUS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapStatus",
	      "(EAP_STATUS IS NULL OR LENGTH((EAP_STATUS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapStatus", "EAP_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapStatusMatch", "EAP_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapStatus",
	      "((EAP_STATUS) = ? OR EAP_STATUS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapStatus", "EAP_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapStatus", "EAP_STATUS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapStatusasc", "EAP_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapStatusdesc", "EAP_STATUS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapRetryTemain", "(EAP_RETRY_REMAIN) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapRetryTemain", "(EAP_RETRY_REMAIN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapRetryTemain",
	      "(EAP_RETRY_REMAIN IS NULL OR LENGTH((EAP_RETRY_REMAIN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapRetryTemain", "EAP_RETRY_REMAIN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapRetryTemainMatch", "EAP_RETRY_REMAIN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapRetryTemain",
	      "((EAP_RETRY_REMAIN) = ? OR EAP_RETRY_REMAIN IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapRetryTemain", "EAP_RETRY_REMAIN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapRetryTemain", "EAP_RETRY_REMAIN NOT IN ( ? )" ) // NOT IN
	         
	         .addFilterBy( "greaterthanEapRetryRemain", "EAP_RETRY_REMAIN > ( ? )" ) // NOT IN
	         
	         .addOrderBy( "EapRetryTemainasc", "EAP_RETRY_REMAIN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapRetryTemaindesc", "EAP_RETRY_REMAIN DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapLastRetry", "(EAP_LAST_RETRY) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapLastRetry", "(EAP_LAST_RETRY) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapLastRetry",
	      "(EAP_LAST_RETRY IS NULL OR LENGTH((EAP_LAST_RETRY)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapLastRetry", "EAP_LAST_RETRY IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapLastRetryMatch", "EAP_LAST_RETRY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapLastRetry",
	      "((EAP_LAST_RETRY) = ? OR EAP_LAST_RETRY IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapLastRetry", "EAP_LAST_RETRY IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapLastRetry", "EAP_LAST_RETRY NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapLastRetryasc", "EAP_LAST_RETRY ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapLastRetrydesc", "EAP_LAST_RETRY DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapErrorText", "(EAP_ERROR_TEXT) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapErrorText", "(EAP_ERROR_TEXT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapErrorText",
	      "(EAP_ERROR_TEXT IS NULL OR LENGTH((EAP_ERROR_TEXT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapErrorText", "EAP_ERROR_TEXT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapErrorTextMatch", "EAP_ERROR_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapErrorText",
	      "((EAP_ERROR_TEXT) = ? OR EAP_ERROR_TEXT IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapErrorText", "EAP_ERROR_TEXT IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapErrorText", "EAP_ERROR_TEXT NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapErrorTextasc", "EAP_ERROR_TEXT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapErrorTextdesc", "EAP_ERROR_TEXT DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapSubmitted", "(EAP_SUBMITTED) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapSubmitted", "(EAP_SUBMITTED) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapSubmitted",
	      "(EAP_SUBMITTED IS NULL OR LENGTH((EAP_SUBMITTED)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapSubmitted", "EAP_SUBMITTED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapSubmittedMatch", "EAP_SUBMITTED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapSubmitted",
	      "((EAP_SUBMITTED) = ? OR EAP_SUBMITTED IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapSubmitted", "EAP_SUBMITTED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapSubmitted", "EAP_SUBMITTED NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapSubmittedasc", "EAP_SUBMITTED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapSubmitteddesc", "EAP_SUBMITTED DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalEapActioned", "(EAP_ACTIONED) = ?" ) // EQUAL

	         .addFilterBy( "notequalEapActioned", "(EAP_ACTIONED) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEapActioned",
	      "(EAP_ACTIONED IS NULL OR LENGTH((EAP_ACTIONED)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEapActioned", "EAP_ACTIONED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterByEapActionedMatch", "EAP_ACTIONED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEapActioned",
	      "((EAP_ACTIONED) = ? OR EAP_ACTIONED IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEapActioned", "EAP_ACTIONED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEapActioned", "EAP_ACTIONED NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EapActionedasc", "EAP_ACTIONED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EapActioneddesc", "EAP_ACTIONED DESC" ) // ORDER DESCENDING
	    ;
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EapEpxactionPendDMLFactory(  );
	    }

	    return dml;
	  }
}
