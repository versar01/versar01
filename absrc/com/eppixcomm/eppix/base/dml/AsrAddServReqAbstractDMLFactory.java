package com.eppixcomm.eppix.base.dml;



public class AsrAddServReqAbstractDMLFactory extends BaseDMLFactory{

	 /** The DMLFactory singleton */
	  private static DMLFactory dml = null;
	  
	  
	  protected AsrAddServReqAbstractDMLFactory() 
	  throws DMLException{
		  ;


	   DMLTable table = defTable("AsrAddServReq", // dmlName
		        "blo.AsrAddServReqDMO", // dmoName
		        "ASR_ADD_SERV_REQ", // tableName
		        30, // numColumns
		        "ASR_TRANSACT_ID, ASR_SUBSCRIBER_ID, ASR_SERVICE_CODE, ASR_ACTIVE_FLAG, " +
		        "ASR_PARAM_ID, ASR_PARAM_VALUE, ASR_MSISDN_NO, ASR_TO_MSISDN, " +
		        "ASR_SIM_NO, ASR_TO_SIM, ASR_PORT_ID, ASR_FILE_ID, ASR_BILL_AC_NO, " +
		        "ASR_PACKAGE_CODE, ASR_TO_PACKAGE, ASR_TARIFF_CODE, ASR_TO_TAR_CODE, " +
		        "ASR_SUBMIT_DATE, ASR_PROCESSED_DATE, ASR_PROCESSED_STAT, " +
		        "ASR_ACTION_TYPE, ASR_COMMENTS, ASR_SYSTEM_REQ, ASR_ACT_REAS_CODE, " +
		        "ASR_DEACT_TYPE, ASR_CNTR_PERIOD, ASR_HANDSET_MAKE, ASR_HANDSET_MODEL, " +
		        "ASR_IMEI, ASR_HANDSET_SUBVAL", // columnList
		        "", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		      "ASR_TRANSACT_ID, ASR_SUBSCRIBER_ID, ASR_SERVICE_CODE, ASR_ACTIVE_FLAG, " +
		        "ASR_PARAM_ID, ASR_PARAM_VALUE, ASR_MSISDN_NO, ASR_TO_MSISDN, " +
		        "ASR_SIM_NO, ASR_TO_SIM, ASR_PORT_ID, ASR_FILE_ID, ASR_BILL_AC_NO, " +
		        "ASR_PACKAGE_CODE, ASR_TO_PACKAGE, ASR_TARIFF_CODE, ASR_TO_TAR_CODE, " +
		        "ASR_SUBMIT_DATE, ASR_PROCESSED_DATE, ASR_PROCESSED_STAT, " +
		        "ASR_ACTION_TYPE, ASR_COMMENTS, ASR_SYSTEM_REQ, ASR_ACT_REAS_CODE, " +
		        "ASR_DEACT_TYPE, ASR_CNTR_PERIOD, ASR_HANDSET_MAKE, ASR_HANDSET_MODEL, " +
		        "ASR_IMEI, ASR_HANDSET_SUBVAL", "", "",
		        new String[] {
					 "ASR_TRANSACT_ID", "ASR_SUBSCRIBER_ID", "ASR_SERVICE_CODE", "ASR_ACTIVE_FLAG",
					 "ASR_PARAM_ID", "ASR_PARAM_VALUE", "ASR_MSISDN_NO", "ASR_TO_MSISDN",
					 "ASR_SIM_NO", "ASR_TO_SIM", "ASR_PORT_ID", "ASR_FILE_ID",
					 "ASR_BILL_AC_NO", "ASR_PACKAGE_CODE", "ASR_TO_PACKAGE", "ASR_TARIFF_CODE", 
					 "ASR_TO_TAR_CODE", "ASR_SUBMIT_DATE", "ASR_PROCESSED_DATE", "ASR_PROCESSED_STAT", 
					 "ASR_ACTION_TYPE", "ASR_COMMENTS", "ASR_SYSTEM_REQ", "ASR_ACT_REAS_CODE", 
					 "ASR_DEACT_TYPE", "ASR_CNTR_PERIOD", "ASR_HANDSET_MAKE", "ASR_HANDSET_MODEL", 
					 "ASR_IMEI", "ASR_HANDSET_SUBVAL"
		    	},false );
	   

	   table.addFilterBy( "equalAsrTransactId", /* PK attribute */
	   "ASR_TRANSACT_ID = ? ")
	        .addFilterBy( "filterByAsrTransactIdMatch", "ASR_TRANSACT_ID LIKE ?")
	        .addFilterBy( "INAsrTransactId","ASR_TRANSACT_ID IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrTransactId","ASR_TRANSACT_ID NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrTransactId","ASR_TRANSACT_ID != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrTransactId",   "(ASR_TRANSACT_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrTransactId","ASR_TRANSACT_ID IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrTransactId","ASR_TRANSACT_ID < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrTransactId","ASR_TRANSACT_ID > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrTransactIdMatch","ASR_TRANSACT_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrTransactId",
	     "(ASR_TRANSACT_ID = ? OR ASR_TRANSACT_ID IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrTransactId asc", "ASR_TRANSACT_ID ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrTransactId desc", "ASR_TRANSACT_ID DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrSubscriberId", /* PK attribute */
	   "ASR_SUBSCRIBER_ID = ? ")
	        .addFilterBy( "filterByAsrSubscriberIdMatch", "ASR_SUBSCRIBER_ID LIKE ?")
	        .addFilterBy( "INAsrSubscriberId","ASR_SUBSCRIBER_ID IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrSubscriberId","ASR_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrSubscriberId","ASR_SUBSCRIBER_ID != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrSubscriberId",   "(ASR_SUBSCRIBER_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrSubscriberId","ASR_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrSubscriberId","ASR_SUBSCRIBER_ID < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrSubscriberId","ASR_SUBSCRIBER_ID > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrSubscriberIdMatch","ASR_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrSubscriberId",
	     "(ASR_SUBSCRIBER_ID = ? OR ASR_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrSubscriberId asc", "ASR_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrSubscriberId desc", "ASR_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrServiceCode", /* PK attribute */
	   "ASR_SERVICE_CODE = ? ")
	        .addFilterBy( "filterByAsrServiceCodeMatch", "ASR_SERVICE_CODE LIKE ?")
	        .addFilterBy( "INAsrServiceCode","ASR_SERVICE_CODE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrServiceCode","ASR_SERVICE_CODE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrServiceCode","ASR_SERVICE_CODE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrServiceCode",   "(ASR_SERVICE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrServiceCode","ASR_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrServiceCode","ASR_SERVICE_CODE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrServiceCode","ASR_SERVICE_CODE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrServiceCodeMatch","ASR_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrServiceCode",
	     "(ASR_SERVICE_CODE = ? OR ASR_SERVICE_CODE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrServiceCode asc", "ASR_SERVICE_CODE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrServiceCode desc", "ASR_SERVICE_CODE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrActiveFlag", /* PK attribute */
	   "ASR_ACTIVE_FLAG = ? ")
	        .addFilterBy( "filterByAsrActiveFlagMatch", "ASR_ACTIVE_FLAG LIKE ?")
	        .addFilterBy( "INAsrActiveFlag","ASR_ACTIVE_FLAG IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrActiveFlag","ASR_ACTIVE_FLAG NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrActiveFlag","ASR_ACTIVE_FLAG != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrActiveFlag",   "(ASR_ACTIVE_FLAG IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrActiveFlag","ASR_ACTIVE_FLAG IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrActiveFlag","ASR_ACTIVE_FLAG < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrActiveFlag","ASR_ACTIVE_FLAG > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrActiveFlagMatch","ASR_ACTIVE_FLAG LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrActiveFlag",
	     "(ASR_ACTIVE_FLAG = ? OR ASR_ACTIVE_FLAG IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrActiveFlag asc", "ASR_ACTIVE_FLAG ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrActiveFlag desc", "ASR_ACTIVE_FLAG DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrParamId", /* PK attribute */
	   "ASR_PARAM_ID = ? ")
	        .addFilterBy( "filterByAsrParamIdMatch", "ASR_PARAM_ID LIKE ?")
	        .addFilterBy( "INAsrParamId","ASR_PARAM_ID IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrParamId","ASR_PARAM_ID NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrParamId","ASR_PARAM_ID != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrParamId",   "(ASR_PARAM_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrParamId","ASR_PARAM_ID IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrParamId","ASR_PARAM_ID < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrParamId","ASR_PARAM_ID > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrParamIdMatch","ASR_PARAM_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrParamId",
	     "(ASR_PARAM_ID = ? OR ASR_PARAM_ID IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrParamId asc", "ASR_PARAM_ID ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrParamId desc", "ASR_PARAM_ID DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrParamValue", /* PK attribute */
	   "ASR_PARAM_VALUE = ? ")
	        .addFilterBy( "filterByAsrParamValueMatch", "ASR_PARAM_VALUE LIKE ?")
	        .addFilterBy( "INAsrParamValue","ASR_PARAM_VALUE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrParamValue","ASR_PARAM_VALUE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrParamValue","ASR_PARAM_VALUE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrParamValue",   "(ASR_PARAM_VALUE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrParamValue","ASR_PARAM_VALUE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrParamValue","ASR_PARAM_VALUE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrParamValue","ASR_PARAM_VALUE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrParamValueMatch","ASR_PARAM_VALUE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrParamValue",
	     "(ASR_PARAM_VALUE = ? OR ASR_PARAM_VALUE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrParamValue asc", "ASR_PARAM_VALUE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrParamValue desc", "ASR_PARAM_VALUE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrMsisdnNo", /* PK attribute */
	   "ASR_MSISDN_NO = ? ")
	        .addFilterBy( "filterByAsrMsisdnNoMatch", "ASR_MSISDN_NO LIKE ?")
	        .addFilterBy( "INAsrMsisdnNo","ASR_MSISDN_NO IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrMsisdnNo","ASR_MSISDN_NO NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrMsisdnNo","ASR_MSISDN_NO != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrMsisdnNo",   "(ASR_MSISDN_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrMsisdnNo","ASR_MSISDN_NO IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrMsisdnNo","ASR_MSISDN_NO < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrMsisdnNo","ASR_MSISDN_NO > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrMsisdnNoMatch","ASR_MSISDN_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrMsisdnNo",
	     "(ASR_MSISDN_NO = ? OR ASR_MSISDN_NO IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrMsisdnNo asc", "ASR_MSISDN_NO ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrMsisdnNo desc", "ASR_MSISDN_NO DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrToMsisdn", /* PK attribute */
	   "ASR_TO_MSISDN = ? ")
	        .addFilterBy( "filterByAsrToMsisdnMatch", "ASR_TO_MSISDN LIKE ?")
	        .addFilterBy( "INAsrToMsisdn","ASR_TO_MSISDN IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrToMsisdn","ASR_TO_MSISDN NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrToMsisdn","ASR_TO_MSISDN != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrToMsisdn",   "(ASR_TO_MSISDN IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrToMsisdn","ASR_TO_MSISDN IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrToMsisdn","ASR_TO_MSISDN < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrToMsisdn","ASR_TO_MSISDN > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrToMsisdnMatch","ASR_TO_MSISDN LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrToMsisdn",
	     "(ASR_TO_MSISDN = ? OR ASR_TO_MSISDN IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrToMsisdn asc", "ASR_TO_MSISDN ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrToMsisdn desc", "ASR_TO_MSISDN DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrSimNo", /* PK attribute */
	   "ASR_SIM_NO = ? ")
	        .addFilterBy( "filterByAsrSimNoMatch", "ASR_SIM_NO LIKE ?")
	        .addFilterBy( "INAsrSimNo","ASR_SIM_NO IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrSimNo","ASR_SIM_NO NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrSimNo","ASR_SIM_NO != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrSimNo",   "(ASR_SIM_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrSimNo","ASR_SIM_NO IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrSimNo","ASR_SIM_NO < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrSimNo","ASR_SIM_NO > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrSimNoMatch","ASR_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrSimNo",
	     "(ASR_SIM_NO = ? OR ASR_SIM_NO IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrSimNo asc", "ASR_SIM_NO ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrSimNo desc", "ASR_SIM_NO DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrToSim", /* PK attribute */
	   "ASR_TO_SIM = ? ")
	        .addFilterBy( "filterByAsrToSimMatch", "ASR_TO_SIM LIKE ?")
	        .addFilterBy( "INAsrToSim","ASR_TO_SIM IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrToSim","ASR_TO_SIM NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrToSim","ASR_TO_SIM != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrToSim",   "(ASR_TO_SIM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrToSim","ASR_TO_SIM IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrToSim","ASR_TO_SIM < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrToSim","ASR_TO_SIM > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrToSimMatch","ASR_TO_SIM LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrToSim",
	     "(ASR_TO_SIM = ? OR ASR_TO_SIM IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrToSim asc", "ASR_TO_SIM ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrToSim desc", "ASR_TO_SIM DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrPortId", /* PK attribute */
	   "ASR_PORT_ID = ? ")
	        .addFilterBy( "filterByAsrPortIdMatch", "ASR_PORT_ID LIKE ?")
	        .addFilterBy( "INAsrPortId","ASR_PORT_ID IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrPortId","ASR_PORT_ID NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrPortId","ASR_PORT_ID != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrPortId",   "(ASR_PORT_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrPortId","ASR_PORT_ID IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrPortId","ASR_PORT_ID < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrPortId","ASR_PORT_ID > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrPortIdMatch","ASR_PORT_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrPortId",
	     "(ASR_PORT_ID = ? OR ASR_PORT_ID IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrPortId asc", "ASR_PORT_ID ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrPortId desc", "ASR_PORT_ID DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrFileId", /* PK attribute */
	   "ASR_FILE_ID = ? ")
	        .addFilterBy( "filterByAsrFileIdMatch", "ASR_FILE_ID LIKE ?")
	        .addFilterBy( "INAsrFileId","ASR_FILE_ID IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrFileId","ASR_FILE_ID NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrFileId","ASR_FILE_ID != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrFileId",   "(ASR_FILE_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrFileId","ASR_FILE_ID IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrFileId","ASR_FILE_ID < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrFileId","ASR_FILE_ID > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrFileIdMatch","ASR_FILE_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrFileId",
	     "(ASR_FILE_ID = ? OR ASR_FILE_ID IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrFileId asc", "ASR_FILE_ID ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrFileId desc", "ASR_FILE_ID DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrBillAcNo", /* PK attribute */
	   "ASR_BILL_AC_NO = ? ")
	        .addFilterBy( "filterByAsrBillAcNoMatch", "ASR_BILL_AC_NO LIKE ?")
	        .addFilterBy( "INAsrBillAcNo","ASR_BILL_AC_NO IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrBillAcNo","ASR_BILL_AC_NO NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrBillAcNo","ASR_BILL_AC_NO != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrBillAcNo",   "(ASR_BILL_AC_NO IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrBillAcNo","ASR_BILL_AC_NO IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrBillAcNo","ASR_BILL_AC_NO < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrBillAcNo","ASR_BILL_AC_NO > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrBillAcNoMatch","ASR_BILL_AC_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrBillAcNo",
	     "(ASR_BILL_AC_NO = ? OR ASR_BILL_AC_NO IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrBillAcNo asc", "ASR_BILL_AC_NO ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrBillAcNo desc", "ASR_BILL_AC_NO DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrPackageCode", /* PK attribute */
	   "ASR_PACKAGE_CODE = ? ")
	        .addFilterBy( "filterByAsrPackageCodeMatch", "ASR_PACKAGE_CODE LIKE ?")
	        .addFilterBy( "INAsrPackageCode","ASR_PACKAGE_CODE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrPackageCode","ASR_PACKAGE_CODE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrPackageCode","ASR_PACKAGE_CODE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrPackageCode",   "(ASR_PACKAGE_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrPackageCode","ASR_PACKAGE_CODE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrPackageCode","ASR_PACKAGE_CODE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrPackageCode","ASR_PACKAGE_CODE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrPackageCodeMatch","ASR_PACKAGE_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrPackageCode",
	     "(ASR_PACKAGE_CODE = ? OR ASR_PACKAGE_CODE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrPackageCode asc", "ASR_PACKAGE_CODE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrPackageCode desc", "ASR_PACKAGE_CODE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrToPackage", /* PK attribute */
	   "ASR_TO_PACKAGE = ? ")
	        .addFilterBy( "filterByAsrToPackageMatch", "ASR_TO_PACKAGE LIKE ?")
	        .addFilterBy( "INAsrToPackage","ASR_TO_PACKAGE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrToPackage","ASR_TO_PACKAGE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrToPackage","ASR_TO_PACKAGE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrToPackage",   "(ASR_TO_PACKAGE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrToPackage","ASR_TO_PACKAGE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrToPackage","ASR_TO_PACKAGE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrToPackage","ASR_TO_PACKAGE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrToPackageMatch","ASR_TO_PACKAGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrToPackage",
	     "(ASR_TO_PACKAGE = ? OR ASR_TO_PACKAGE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrToPackage asc", "ASR_TO_PACKAGE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrToPackage desc", "ASR_TO_PACKAGE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrTariffCode", /* PK attribute */
	   "ASR_TARIFF_CODE = ? ")
	        .addFilterBy( "filterByAsrTariffCodeMatch", "ASR_TARIFF_CODE LIKE ?")
	        .addFilterBy( "INAsrTariffCode","ASR_TARIFF_CODE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrTariffCode","ASR_TARIFF_CODE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrTariffCode","ASR_TARIFF_CODE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrTariffCode",   "(ASR_TARIFF_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrTariffCode","ASR_TARIFF_CODE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrTariffCode","ASR_TARIFF_CODE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrTariffCode","ASR_TARIFF_CODE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrTariffCodeMatch","ASR_TARIFF_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrTariffCode",
	     "(ASR_TARIFF_CODE = ? OR ASR_TARIFF_CODE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrTariffCode asc", "ASR_TARIFF_CODE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrTariffCode desc", "ASR_TARIFF_CODE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrToTarCode", /* PK attribute */
	   "ASR_TO_TAR_CODE = ? ")
	        .addFilterBy( "filterByAsrToTarCodeMatch", "ASR_TO_TAR_CODE LIKE ?")
	        .addFilterBy( "INAsrToTarCode","ASR_TO_TAR_CODE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrToTarCode","ASR_TO_TAR_CODE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrToTarCode","ASR_TO_TAR_CODE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrToTarCode",   "(ASR_TO_TAR_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrToTarCode","ASR_TO_TAR_CODE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrToTarCode","ASR_TO_TAR_CODE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrToTarCode","ASR_TO_TAR_CODE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrToTarCodeMatch","ASR_TO_TAR_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrToTarCode",
	     "(ASR_TO_TAR_CODE = ? OR ASR_TO_TAR_CODE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrToTarCode asc", "ASR_TO_TAR_CODE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrToTarCode desc", "ASR_TO_TAR_CODE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrSubmitDate", /* PK attribute */
	   "ASR_SUBMIT_DATE = ? ")
	        .addFilterBy( "filterByAsrSubmitDateMatch", "ASR_SUBMIT_DATE LIKE ?")
	        .addFilterBy( "INAsrSubmitDate","ASR_SUBMIT_DATE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrSubmitDate","ASR_SUBMIT_DATE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrSubmitDate","ASR_SUBMIT_DATE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrSubmitDate",   "(ASR_SUBMIT_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrSubmitDate","ASR_SUBMIT_DATE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrSubmitDate","ASR_SUBMIT_DATE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrSubmitDate","ASR_SUBMIT_DATE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrSubmitDateMatch","ASR_SUBMIT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrSubmitDate",
	     "(ASR_SUBMIT_DATE = ? OR ASR_SUBMIT_DATE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrSubmitDate asc", "ASR_SUBMIT_DATE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrSubmitDate desc", "ASR_SUBMIT_DATE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrProcessedDate", /* PK attribute */
	   "ASR_PROCESSED_DATE = ? ")
	        .addFilterBy( "filterByAsrProcessedDateMatch", "ASR_PROCESSED_DATE LIKE ?")
	        .addFilterBy( "INAsrProcessedDate","ASR_PROCESSED_DATE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrProcessedDate","ASR_PROCESSED_DATE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrProcessedDate","ASR_PROCESSED_DATE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrProcessedDate",   "(ASR_PROCESSED_DATE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrProcessedDate","ASR_PROCESSED_DATE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrProcessedDate","ASR_PROCESSED_DATE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrProcessedDate","ASR_PROCESSED_DATE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrProcessedDateMatch","ASR_PROCESSED_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrProcessedDate",
	     "(ASR_PROCESSED_DATE = ? OR ASR_PROCESSED_DATE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrProcessedDate asc", "ASR_PROCESSED_DATE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrProcessedDate desc", "ASR_PROCESSED_DATE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrProcessedStat", /* PK attribute */
	   "ASR_PROCESSED_STAT = ? ")
	        .addFilterBy( "filterByAsrProcessedStatMatch", "ASR_PROCESSED_STAT LIKE ?")
	        .addFilterBy( "INAsrProcessedStat","ASR_PROCESSED_STAT IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrProcessedStat","ASR_PROCESSED_STAT NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrProcessedStat","ASR_PROCESSED_STAT != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrProcessedStat",   "(ASR_PROCESSED_STAT IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrProcessedStat","ASR_PROCESSED_STAT IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrProcessedStat","ASR_PROCESSED_STAT < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrProcessedStat","ASR_PROCESSED_STAT > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrProcessedStatMatch","ASR_PROCESSED_STAT LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrProcessedStat",
	     "(ASR_PROCESSED_STAT = ? OR ASR_PROCESSED_STAT IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrProcessedStat asc", "ASR_PROCESSED_STAT ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrProcessedStat desc", "ASR_PROCESSED_STAT DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrActionType", /* PK attribute */
	   "ASR_ACTION_TYPE = ? ")
	        .addFilterBy( "filterByAsrActionTypeMatch", "ASR_ACTION_TYPE LIKE ?")
	        .addFilterBy( "INAsrActionType","ASR_ACTION_TYPE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrActionType","ASR_ACTION_TYPE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrActionType","ASR_ACTION_TYPE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrActionType",   "(ASR_ACTION_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrActionType","ASR_ACTION_TYPE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrActionType","ASR_ACTION_TYPE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrActionType","ASR_ACTION_TYPE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrActionTypeMatch","ASR_ACTION_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrActionType",
	     "(ASR_ACTION_TYPE = ? OR ASR_ACTION_TYPE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrActionType asc", "ASR_ACTION_TYPE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrActionType desc", "ASR_ACTION_TYPE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrComments", /* PK attribute */
	   "ASR_COMMENTS = ? ")
	        .addFilterBy( "filterByAsrCommentsMatch", "ASR_COMMENTS LIKE ?")
	        .addFilterBy( "INAsrComments","ASR_COMMENTS IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrComments","ASR_COMMENTS NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrComments","ASR_COMMENTS != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrComments",   "(ASR_COMMENTS IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrComments","ASR_COMMENTS IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrComments","ASR_COMMENTS < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrComments","ASR_COMMENTS > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrCommentsMatch","ASR_COMMENTS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrComments",
	     "(ASR_COMMENTS = ? OR ASR_COMMENTS IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrComments asc", "ASR_COMMENTS ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrComments desc", "ASR_COMMENTS DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrSystemReq", /* PK attribute */
	   "ASR_SYSTEM_REQ = ? ")
	        .addFilterBy( "filterByAsrSystemReqMatch", "ASR_SYSTEM_REQ LIKE ?")
	        .addFilterBy( "INAsrSystemReq","ASR_SYSTEM_REQ IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrSystemReq","ASR_SYSTEM_REQ NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrSystemReq","ASR_SYSTEM_REQ != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrSystemReq",   "(ASR_SYSTEM_REQ IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrSystemReq","ASR_SYSTEM_REQ IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrSystemReq","ASR_SYSTEM_REQ < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrSystemReq","ASR_SYSTEM_REQ > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrSystemReqMatch","ASR_SYSTEM_REQ LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrSystemReq",
	     "(ASR_SYSTEM_REQ = ? OR ASR_SYSTEM_REQ IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrSystemReq asc", "ASR_SYSTEM_REQ ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrSystemReq desc", "ASR_SYSTEM_REQ DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrActReasCode", /* PK attribute */
	   "ASR_ACT_REAS_CODE = ? ")
	        .addFilterBy( "filterByAsrActReasCodeMatch", "ASR_ACT_REAS_CODE LIKE ?")
	        .addFilterBy( "INAsrActReasCode","ASR_ACT_REAS_CODE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrActReasCode","ASR_ACT_REAS_CODE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrActReasCode","ASR_ACT_REAS_CODE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrActReasCode",   "(ASR_ACT_REAS_CODE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrActReasCode","ASR_ACT_REAS_CODE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrActReasCode","ASR_ACT_REAS_CODE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrActReasCode","ASR_ACT_REAS_CODE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrActReasCodeMatch","ASR_ACT_REAS_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrActReasCode",
	     "(ASR_ACT_REAS_CODE = ? OR ASR_ACT_REAS_CODE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrActReasCode asc", "ASR_ACT_REAS_CODE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrActReasCode desc", "ASR_ACT_REAS_CODE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrDeactType", /* PK attribute */
	   "ASR_DEACT_TYPE = ? ")
	        .addFilterBy( "filterByAsrDeactTypeMatch", "ASR_DEACT_TYPE LIKE ?")
	        .addFilterBy( "INAsrDeactType","ASR_DEACT_TYPE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrDeactType","ASR_DEACT_TYPE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrDeactType","ASR_DEACT_TYPE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrDeactType",   "(ASR_DEACT_TYPE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrDeactType","ASR_DEACT_TYPE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrDeactType","ASR_DEACT_TYPE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrDeactType","ASR_DEACT_TYPE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrDeactTypeMatch","ASR_DEACT_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrDeactType",
	     "(ASR_DEACT_TYPE = ? OR ASR_DEACT_TYPE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrDeactType asc", "ASR_DEACT_TYPE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrDeactType desc", "ASR_DEACT_TYPE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrCntrPeriod", /* PK attribute */
	   "ASR_CNTR_PERIOD = ? ")
	        .addFilterBy( "filterByAsrCntrPeriodMatch", "ASR_CNTR_PERIOD LIKE ?")
	        .addFilterBy( "INAsrCntrPeriod","ASR_CNTR_PERIOD IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrCntrPeriod","ASR_CNTR_PERIOD NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrCntrPeriod","ASR_CNTR_PERIOD != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrCntrPeriod",   "(ASR_CNTR_PERIOD IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrCntrPeriod","ASR_CNTR_PERIOD IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrCntrPeriod","ASR_CNTR_PERIOD < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrCntrPeriod","ASR_CNTR_PERIOD > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrCntrPeriodMatch","ASR_CNTR_PERIOD LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrCntrPeriod",
	     "(ASR_CNTR_PERIOD = ? OR ASR_CNTR_PERIOD IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrCntrPeriod asc", "ASR_CNTR_PERIOD ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrCntrPeriod desc", "ASR_CNTR_PERIOD DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrHandsetMake", /* PK attribute */
	   "ASR_HANDSET_MAKE = ? ")
	        .addFilterBy( "filterByAsrHandsetMakeMatch", "ASR_HANDSET_MAKE LIKE ?")
	        .addFilterBy( "INAsrHandsetMake","ASR_HANDSET_MAKE IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrHandsetMake","ASR_HANDSET_MAKE NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrHandsetMake","ASR_HANDSET_MAKE != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrHandsetMake",   "(ASR_HANDSET_MAKE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrHandsetMake","ASR_HANDSET_MAKE IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrHandsetMake","ASR_HANDSET_MAKE < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrHandsetMake","ASR_HANDSET_MAKE > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrHandsetMakeMatch","ASR_HANDSET_MAKE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrHandsetMake",
	     "(ASR_HANDSET_MAKE = ? OR ASR_HANDSET_MAKE IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrHandsetMake asc", "ASR_HANDSET_MAKE ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrHandsetMake desc", "ASR_HANDSET_MAKE DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrHandsetModel", /* PK attribute */
	   "ASR_HANDSET_MODEL = ? ")
	        .addFilterBy( "filterByAsrHandsetModelMatch", "ASR_HANDSET_MODEL LIKE ?")
	        .addFilterBy( "INAsrHandsetModel","ASR_HANDSET_MODEL IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrHandsetModel","ASR_HANDSET_MODEL NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrHandsetModel","ASR_HANDSET_MODEL != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrHandsetModel",   "(ASR_HANDSET_MODEL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrHandsetModel","ASR_HANDSET_MODEL IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrHandsetModel","ASR_HANDSET_MODEL < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrHandsetModel","ASR_HANDSET_MODEL > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrHandsetModelMatch","ASR_HANDSET_MODEL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrHandsetModel",
	     "(ASR_HANDSET_MODEL = ? OR ASR_HANDSET_MODEL IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrHandsetModel asc", "ASR_HANDSET_MODEL ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrHandsetModel desc", "ASR_HANDSET_MODEL DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrImei", /* PK attribute */
	   "ASR_IMEI = ? ")
	        .addFilterBy( "filterByAsrImeiMatch", "ASR_IMEI LIKE ?")
	        .addFilterBy( "INAsrImei","ASR_IMEI IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrImei","ASR_IMEI NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrImei","ASR_IMEI != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrImei",   "(ASR_IMEI IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrImei","ASR_IMEI IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrImei","ASR_IMEI < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrImei","ASR_IMEI > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrImeiMatch","ASR_IMEI LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrImei",
	     "(ASR_IMEI = ? OR ASR_IMEI IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrImei asc", "ASR_IMEI ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrImei desc", "ASR_IMEI DESC ") // ORDER DESCENDING
	   ;



	   table.addFilterBy( "equalAsrHandsetSubval", /* PK attribute */
	   "ASR_HANDSET_SUBVAL = ? ")
	        .addFilterBy( "filterByAsrHandsetSubvalMatch", "ASR_HANDSET_SUBVAL LIKE ?")
	        .addFilterBy( "INAsrHandsetSubval","ASR_HANDSET_SUBVAL IN ( ? ) ") // IN

	        .addFilterBy( "NOTINAsrHandsetSubval","ASR_HANDSET_SUBVAL NOT IN ( ? )") // NOT IN

	        .addFilterBy( "notequalAsrHandsetSubval","ASR_HANDSET_SUBVAL != ?") // NOTEQUAL

	        .addFilterBy( "nullAsrHandsetSubval",   "(ASR_HANDSET_SUBVAL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	        .addFilterBy( "notnullAsrHandsetSubval","ASR_HANDSET_SUBVAL IS NOT NULL ?") // IS NOT NULL

	        .addFilterBy( "lessthanAsrHandsetSubval","ASR_HANDSET_SUBVAL < ? ") // LESS THAN

	        .addFilterBy( "greaterthanAsrHandsetSubval","ASR_HANDSET_SUBVAL > ? ") // GREATER THAN

	        .addFilterBy( "filterByAsrHandsetSubvalMatch","ASR_HANDSET_SUBVAL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	        .addFilterBy( "equalornullAsrHandsetSubval",
	     "(ASR_HANDSET_SUBVAL = ? OR ASR_HANDSET_SUBVAL IS NULL) ") // EQUALORNULL
	                                          // TODO : we may need to wrap this with a TRIM()

	        .addOrderBy("AsrHandsetSubval asc", "ASR_HANDSET_SUBVAL ASC ") // ORDER ASCENDING

	        .addOrderBy("AsrHandsetSubval desc", "ASR_HANDSET_SUBVAL DESC ") // ORDER DESCENDING
	   ;
	   
	  }

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new AsrAddServReqDMLFactory(  );
	    }

	    return dml;
	  }
}

