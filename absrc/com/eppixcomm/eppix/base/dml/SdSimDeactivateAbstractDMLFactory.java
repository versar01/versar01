package com.eppixcomm.eppix.base.dml;



public class SdSimDeactivateAbstractDMLFactory extends BaseDMLFactory {

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new DotDocTypeAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected SdSimDeactivateAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    DMLTable table = defTable( "SdSimDeactivate", // dmlName
	        "blo.SdSimDeactivateDMO", // dmoName
	        "SD_SIM_DEACTIVATE", // tableName
	        18, // numColumns
	        "SD_SUBSCRIBER_ID,SD_HANDSET_NO,SD_SIM_NO,SD_TRANS_STATUS,SD_STAT_CODE,SD_DCONNECT_DATE,SD_PRORATA_TO_DATE,SD_REASON,SD_LETTER_TYPE,SD_DISCON_CHARGE1,SD_DISCON_CHARGE2,SD_DISCON_CHARGE3,SD_DISCON_CHARGE4,SD_DISCON_CHARGE5,SD_EL_COMMAND,SD_EPPIX_STAMP,SD_N2N_STAMP,SD_ERROR_COMMENT", // columnList
	        "", //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "SD_SUBSCRIBER_ID,SD_HANDSET_NO,SD_SIM_NO,SD_TRANS_STATUS,SD_STAT_CODE,SD_DCONNECT_DATE,SD_PRORATA_TO_DATE,SD_REASON,SD_LETTER_TYPE,SD_DISCON_CHARGE1,SD_DISCON_CHARGE2,SD_DISCON_CHARGE3,SD_DISCON_CHARGE4,SD_DISCON_CHARGE5,SD_EL_COMMAND,SD_EPPIX_STAMP,SD_N2N_STAMP,SD_ERROR_COMMENT",
	        "", "",
	        new String[] {
	    		"SD_SUBSCRIBER_ID",
	    		"SD_HANDSET_NO",
	    		"SD_SIM_NO",
	    		"SD_TRANS_STATUS",
	    		"SD_STAT_CODE",
	    		"SD_DCONNECT_DATE",
	    		"SD_PRORATA_TO_DATE",
	    		"SD_REASON",
	    		"SD_LETTER_TYPE",
	    		"SD_DISCON_CHARGE1",
	    		"SD_DISCON_CHARGE2",
	    		"SD_DISCON_CHARGE3",
	    		"SD_DISCON_CHARGE4",
	    		"SD_DISCON_CHARGE5",
	    		"SD_EL_COMMAND",
	    		"SD_EPPIX_STAMP",
	    		"SD_N2N_STAMP",
	    		"SD_ERROR_COMMENT"
	        },false );
	    
	    table.addFilterBy( "equalSdSubscriberId", /* PK attribute */
	    "SD_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterBySdSubscriberIdMatch", "SD_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INSdSubscriberId","SD_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdSubscriberId","SD_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdSubscriberId","SD_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullSdSubscriberId",   "(SD_SUBSCRIBER_ID IS NULL OR LENGTH(SD_SUBSCRIBER_ID) IS NULL OR LENGTH(SD_SUBSCRIBER_ID) = 0)") // IS NULL

	         .addFilterBy( "notnullSdSubscriberId","SD_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdSubscriberId","SD_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdSubscriberId","SD_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdSubscriberIdMatch","SD_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdSubscriberId",
	      "(SD_SUBSCRIBER_ID = ? OR SD_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdSubscriberId asc", "SD_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("SdSubscriberId desc", "SD_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdHandsetNo", /* PK attribute */
	    "SD_HANDSET_NO = ? ")
	         .addFilterBy( "filterBySdHandsetNoMatch", "SD_HANDSET_NO LIKE ?")
	         .addFilterBy( "INSdHandsetNo","SD_HANDSET_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdHandsetNo","SD_HANDSET_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdHandsetNo","SD_HANDSET_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullSdHandsetNo",   "(SD_HANDSET_NO IS NULL OR LENGTH(SD_HANDSET_NO) IS NULL OR LENGTH(SD_HANDSET_NO) = 0)") // IS NULL

	         .addFilterBy( "notnullSdHandsetNo","SD_HANDSET_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdHandsetNo","SD_HANDSET_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdHandsetNo","SD_HANDSET_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdHandsetNoMatch","SD_HANDSET_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdHandsetNo",
	      "(SD_HANDSET_NO = ? OR SD_HANDSET_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdHandsetNo asc", "SD_HANDSET_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("SdHandsetNo desc", "SD_HANDSET_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdSimNo", /* PK attribute */
	    "SD_SIM_NO = ? ")
	         .addFilterBy( "filterBySdSimNoMatch", "SD_SIM_NO LIKE ?")
	         .addFilterBy( "INSdSimNo","SD_SIM_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdSimNo","SD_SIM_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdSimNo","SD_SIM_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullSdSimNo",   "(SD_SIM_NO IS NULL OR LENGTH(SD_SIM_NO) IS NULL OR LENGTH(SD_SIM_NO) = 0)") // IS NULL

	         .addFilterBy( "notnullSdSimNo","SD_SIM_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdSimNo","SD_SIM_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdSimNo","SD_SIM_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdSimNoMatch","SD_SIM_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdSimNo",
	      "(SD_SIM_NO = ? OR SD_SIM_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdSimNo asc", "SD_SIM_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("SdSimNo desc", "SD_SIM_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdTransStatus", /* PK attribute */
	    "SD_TRANS_STATUS = ? ")
	         .addFilterBy( "filterBySdTransStatusMatch", "SD_TRANS_STATUS LIKE ?")
	         .addFilterBy( "INSdTransStatus","SD_TRANS_STATUS IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdTransStatus","SD_TRANS_STATUS NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdTransStatus","SD_TRANS_STATUS != ?") // NOTEQUAL

	         .addFilterBy( "nullSdTransStatus",   "(SD_TRANS_STATUS IS NULL OR LENGTH(SD_TRANS_STATUS) IS NULL OR LENGTH(SD_TRANS_STATUS) = 0)") // IS NULL

	         .addFilterBy( "notnullSdTransStatus","SD_TRANS_STATUS IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdTransStatus","SD_TRANS_STATUS < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdTransStatus","SD_TRANS_STATUS > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdTransStatusMatch","SD_TRANS_STATUS LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdTransStatus",
	      "(SD_TRANS_STATUS = ? OR SD_TRANS_STATUS IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdTransStatus asc", "SD_TRANS_STATUS ASC ") // ORDER ASCENDING

	         .addOrderBy("SdTransStatus desc", "SD_TRANS_STATUS DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdStatCode", /* PK attribute */
	    "SD_STAT_CODE = ? ")
	         .addFilterBy( "filterBySdStatCodeMatch", "SD_STAT_CODE LIKE ?")
	         .addFilterBy( "INSdStatCode","SD_STAT_CODE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdStatCode","SD_STAT_CODE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdStatCode","SD_STAT_CODE != ?") // NOTEQUAL

	         .addFilterBy( "nullSdStatCode",   "(SD_STAT_CODE IS NULL OR LENGTH(SD_STAT_CODE) IS NULL OR LENGTH(SD_STAT_CODE) = 0)") // IS NULL

	         .addFilterBy( "notnullSdStatCode","SD_STAT_CODE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdStatCode","SD_STAT_CODE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdStatCode","SD_STAT_CODE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdStatCodeMatch","SD_STAT_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdStatCode",
	      "(SD_STAT_CODE = ? OR SD_STAT_CODE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdStatCode asc", "SD_STAT_CODE ASC ") // ORDER ASCENDING

	         .addOrderBy("SdStatCode desc", "SD_STAT_CODE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDconnectDate", /* PK attribute */
	    "SD_DCONNECT_DATE = ? ")
	         .addFilterBy( "filterBySdDconnectDateMatch", "SD_DCONNECT_DATE LIKE ?")
	         .addFilterBy( "INSdDconnectDate","SD_DCONNECT_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDconnectDate","SD_DCONNECT_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDconnectDate","SD_DCONNECT_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDconnectDate",   "(SD_DCONNECT_DATE IS NULL)") // IS NULL IS NOT NULL Fix bug SJ 09-09-2014

	         .addFilterBy( "notnullSdDconnectDate","SD_DCONNECT_DATE IS NOT NULL") // IS NOT NULL Fix bug SJ 11-02-2014

	         .addFilterBy( "lessthanSdDconnectDate","SD_DCONNECT_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDconnectDate","SD_DCONNECT_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDconnectDateMatch","SD_DCONNECT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDconnectDate",
	      "(SD_DCONNECT_DATE = ? OR SD_DCONNECT_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDconnectDate asc", "SD_DCONNECT_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDconnectDate desc", "SD_DCONNECT_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdProrataToDate", /* PK attribute */
	    "SD_PRORATA_TO_DATE = ? ")
	         .addFilterBy( "filterBySdProrataToDateMatch", "SD_PRORATA_TO_DATE LIKE ?")
	         .addFilterBy( "INSdProrataToDate","SD_PRORATA_TO_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdProrataToDate","SD_PRORATA_TO_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdProrataToDate","SD_PRORATA_TO_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullSdProrataToDate",   "(SD_PRORATA_TO_DATE IS NULL)") // IS NULL

	         .addFilterBy( "notnullSdProrataToDate","SD_PRORATA_TO_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdProrataToDate","SD_PRORATA_TO_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdProrataToDate","SD_PRORATA_TO_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdProrataToDateMatch","SD_PRORATA_TO_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdProrataToDate",
	      "(SD_PRORATA_TO_DATE = ? OR SD_PRORATA_TO_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdProrataToDate asc", "SD_PRORATA_TO_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("SdProrataToDate desc", "SD_PRORATA_TO_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdReason", /* PK attribute */
	    "SD_REASON = ? ")
	         .addFilterBy( "filterBySdReasonMatch", "SD_REASON LIKE ?")
	         .addFilterBy( "INSdReason","SD_REASON IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdReason","SD_REASON NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdReason","SD_REASON != ?") // NOTEQUAL

	         .addFilterBy( "nullSdReason",   "(SD_REASON IS NULL OR LENGTH(SD_REASON) IS NULL OR LENGTH(SD_REASON) = 0)") // IS NULL

	         .addFilterBy( "notnullSdReason","SD_REASON IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdReason","SD_REASON < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdReason","SD_REASON > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdReasonMatch","SD_REASON LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdReason",
	      "(SD_REASON = ? OR SD_REASON IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdReason asc", "SD_REASON ASC ") // ORDER ASCENDING

	         .addOrderBy("SdReason desc", "SD_REASON DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdLetterType", /* PK attribute */
	    "SD_LETTER_TYPE = ? ")
	         .addFilterBy( "filterBySdLetterTypeMatch", "SD_LETTER_TYPE LIKE ?")
	         .addFilterBy( "INSdLetterType","SD_LETTER_TYPE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdLetterType","SD_LETTER_TYPE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdLetterType","SD_LETTER_TYPE != ?") // NOTEQUAL

	         .addFilterBy( "nullSdLetterType",   "(SD_LETTER_TYPE IS NULL OR LENGTH(SD_LETTER_TYPE) IS NULL OR LENGTH(SD_LETTER_TYPE) = 0)") // IS NULL

	         .addFilterBy( "notnullSdLetterType","SD_LETTER_TYPE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdLetterType","SD_LETTER_TYPE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdLetterType","SD_LETTER_TYPE > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdLetterTypeMatch","SD_LETTER_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdLetterType",
	      "(SD_LETTER_TYPE = ? OR SD_LETTER_TYPE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdLetterType asc", "SD_LETTER_TYPE ASC ") // ORDER ASCENDING

	         .addOrderBy("SdLetterType desc", "SD_LETTER_TYPE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDisconCharge1", /* PK attribute */
	    "SD_DISCON_CHARGE1 = ? ")
	         .addFilterBy( "filterBySdDisconCharge1Match", "SD_DISCON_CHARGE1 LIKE ?")
	         .addFilterBy( "INSdDisconCharge1","SD_DISCON_CHARGE1 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDisconCharge1","SD_DISCON_CHARGE1 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDisconCharge1","SD_DISCON_CHARGE1 != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDisconCharge1",   "(SD_DISCON_CHARGE1 IS NULL OR LENGTH(SD_DISCON_CHARGE1) IS NULL OR LENGTH(SD_DISCON_CHARGE1) = 0)") // IS NULL

	         .addFilterBy( "notnullSdDisconCharge1","SD_DISCON_CHARGE1 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdDisconCharge1","SD_DISCON_CHARGE1 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDisconCharge1","SD_DISCON_CHARGE1 > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDisconCharge1Match","SD_DISCON_CHARGE1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDisconCharge1",
	      "(SD_DISCON_CHARGE1 = ? OR SD_DISCON_CHARGE1 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDisconCharge1 asc", "SD_DISCON_CHARGE1 ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDisconCharge1 desc", "SD_DISCON_CHARGE1 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDisconCharge2", /* PK attribute */
	    "SD_DISCON_CHARGE2 = ? ")
	         .addFilterBy( "filterBySdDisconCharge2Match", "SD_DISCON_CHARGE2 LIKE ?")
	         .addFilterBy( "INSdDisconCharge2","SD_DISCON_CHARGE2 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDisconCharge2","SD_DISCON_CHARGE2 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDisconCharge2","SD_DISCON_CHARGE2 != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDisconCharge2",   "(SD_DISCON_CHARGE2 IS NULL OR LENGTH(SD_DISCON_CHARGE2) IS NULL OR LENGTH(SD_DISCON_CHARGE2) = 0)") // IS NULL

	         .addFilterBy( "notnullSdDisconCharge2","SD_DISCON_CHARGE2 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdDisconCharge2","SD_DISCON_CHARGE2 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDisconCharge2","SD_DISCON_CHARGE2 > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDisconCharge2Match","SD_DISCON_CHARGE2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDisconCharge2",
	      "(SD_DISCON_CHARGE2 = ? OR SD_DISCON_CHARGE2 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDisconCharge2 asc", "SD_DISCON_CHARGE2 ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDisconCharge2 desc", "SD_DISCON_CHARGE2 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDisconCharge3", /* PK attribute */
	    "SD_DISCON_CHARGE3 = ? ")
	         .addFilterBy( "filterBySdDisconCharge3Match", "SD_DISCON_CHARGE3 LIKE ?")
	         .addFilterBy( "INSdDisconCharge3","SD_DISCON_CHARGE3 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDisconCharge3","SD_DISCON_CHARGE3 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDisconCharge3","SD_DISCON_CHARGE3 != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDisconCharge3",   "(SD_DISCON_CHARGE3 IS NULL OR LENGTH(SD_DISCON_CHARGE3) IS NULL OR LENGTH(SD_DISCON_CHARGE3) = 0)") // IS NULL

	         .addFilterBy( "notnullSdDisconCharge3","SD_DISCON_CHARGE3 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdDisconCharge3","SD_DISCON_CHARGE3 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDisconCharge3","SD_DISCON_CHARGE3 > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDisconCharge3Match","SD_DISCON_CHARGE3 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDisconCharge3",
	      "(SD_DISCON_CHARGE3 = ? OR SD_DISCON_CHARGE3 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDisconCharge3 asc", "SD_DISCON_CHARGE3 ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDisconCharge3 desc", "SD_DISCON_CHARGE3 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDisconCharge4", /* PK attribute */
	    "SD_DISCON_CHARGE4 = ? ")
	         .addFilterBy( "filterBySdDisconCharge4Match", "SD_DISCON_CHARGE4 LIKE ?")
	         .addFilterBy( "INSdDisconCharge4","SD_DISCON_CHARGE4 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDisconCharge4","SD_DISCON_CHARGE4 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDisconCharge4","SD_DISCON_CHARGE4 != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDisconCharge4",   "(SD_DISCON_CHARGE4 IS NULL OR LENGTH(SD_DISCON_CHARGE4) IS NULL OR LENGTH(SD_DISCON_CHARGE4) = 0)") // IS NULL

	         .addFilterBy( "notnullSdDisconCharge4","SD_DISCON_CHARGE4 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdDisconCharge4","SD_DISCON_CHARGE4 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDisconCharge4","SD_DISCON_CHARGE4 > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDisconCharge4Match","SD_DISCON_CHARGE4 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDisconCharge4",
	      "(SD_DISCON_CHARGE4 = ? OR SD_DISCON_CHARGE4 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDisconCharge4 asc", "SD_DISCON_CHARGE4 ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDisconCharge4 desc", "SD_DISCON_CHARGE4 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdDisconCharge5", /* PK attribute */
	    "SD_DISCON_CHARGE5 = ? ")
	         .addFilterBy( "filterBySdDisconCharge5Match", "SD_DISCON_CHARGE5 LIKE ?")
	         .addFilterBy( "INSdDisconCharge5","SD_DISCON_CHARGE5 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdDisconCharge5","SD_DISCON_CHARGE5 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdDisconCharge5","SD_DISCON_CHARGE5 != ?") // NOTEQUAL

	         .addFilterBy( "nullSdDisconCharge5",   "(SD_DISCON_CHARGE5 IS NULL OR LENGTH(SD_DISCON_CHARGE5) IS NULL OR LENGTH(SD_DISCON_CHARGE5) = 0)") // IS NULL

	         .addFilterBy( "notnullSdDisconCharge5","SD_DISCON_CHARGE5 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdDisconCharge5","SD_DISCON_CHARGE5 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdDisconCharge5","SD_DISCON_CHARGE5 > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdDisconCharge5Match","SD_DISCON_CHARGE5 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdDisconCharge5",
	      "(SD_DISCON_CHARGE5 = ? OR SD_DISCON_CHARGE5 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdDisconCharge5 asc", "SD_DISCON_CHARGE5 ASC ") // ORDER ASCENDING

	         .addOrderBy("SdDisconCharge5 desc", "SD_DISCON_CHARGE5 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdElCommand", /* PK attribute */
	    "SD_EL_COMMAND = ? ")
	         .addFilterBy( "filterBySdElCommandMatch", "SD_EL_COMMAND LIKE ?")
	         .addFilterBy( "INSdElCommand","SD_EL_COMMAND IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdElCommand","SD_EL_COMMAND NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdElCommand","SD_EL_COMMAND != ?") // NOTEQUAL

	         .addFilterBy( "nullSdElCommand",   "(SD_EL_COMMAND IS NULL OR LENGTH(SD_EL_COMMAND) IS NULL OR LENGTH(SD_EL_COMMAND) = 0)") // IS NULL

	         .addFilterBy( "notnullSdElCommand","SD_EL_COMMAND IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdElCommand","SD_EL_COMMAND < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdElCommand","SD_EL_COMMAND > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdElCommandMatch","SD_EL_COMMAND LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdElCommand",
	      "(SD_EL_COMMAND = ? OR SD_EL_COMMAND IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdElCommand asc", "SD_EL_COMMAND ASC ") // ORDER ASCENDING

	         .addOrderBy("SdElCommand desc", "SD_EL_COMMAND DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdEppixStamp", /* PK attribute */
	    "SD_EPPIX_STAMP = ? ")
	         .addFilterBy( "filterBySdEppixStampMatch", "SD_EPPIX_STAMP LIKE ?")
	         .addFilterBy( "INSdEppixStamp","SD_EPPIX_STAMP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdEppixStamp","SD_EPPIX_STAMP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdEppixStamp","SD_EPPIX_STAMP != ?") // NOTEQUAL

	         .addFilterBy( "nullSdEppixStamp",   "(SD_EPPIX_STAMP IS NULL OR LENGTH(SD_EPPIX_STAMP) IS NULL OR LENGTH(SD_EPPIX_STAMP) = 0)") // IS NULL

	         .addFilterBy( "notnullSdEppixStamp","SD_EPPIX_STAMP IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdEppixStamp","SD_EPPIX_STAMP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdEppixStamp","SD_EPPIX_STAMP > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdEppixStampMatch","SD_EPPIX_STAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdEppixStamp",
	      "(SD_EPPIX_STAMP = ? OR SD_EPPIX_STAMP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdEppixStamp asc", "SD_EPPIX_STAMP ASC ") // ORDER ASCENDING

	         .addOrderBy("SdEppixStamp desc", "SD_EPPIX_STAMP DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdN2nStamp", /* PK attribute */
	    "SD_N2N_STAMP = ? ")
	         .addFilterBy( "filterBySdN2nStampMatch", "SD_N2N_STAMP LIKE ?")
	         .addFilterBy( "INSdN2nStamp","SD_N2N_STAMP IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdN2nStamp","SD_N2N_STAMP NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdN2nStamp","SD_N2N_STAMP != ?") // NOTEQUAL

	         .addFilterBy( "nullSdN2nStamp",   "(SD_N2N_STAMP IS NULL OR LENGTH(SD_N2N_STAMP) IS NULL OR LENGTH(SD_N2N_STAMP) = 0)") // IS NULL

	         .addFilterBy( "notnullSdN2nStamp","SD_N2N_STAMP IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdN2nStamp","SD_N2N_STAMP < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdN2nStamp","SD_N2N_STAMP > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdN2nStampMatch","SD_N2N_STAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdN2nStamp",
	      "(SD_N2N_STAMP = ? OR SD_N2N_STAMP IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdN2nStamp asc", "SD_N2N_STAMP ASC ") // ORDER ASCENDING

	         .addOrderBy("SdN2nStamp desc", "SD_N2N_STAMP DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalSdErrorComment", /* PK attribute */
	    "SD_ERROR_COMMENT = ? ")
	         .addFilterBy( "filterBySdErrorCommentMatch", "SD_ERROR_COMMENT LIKE ?")
	         .addFilterBy( "INSdErrorComment","SD_ERROR_COMMENT IN ( ? ) ") // IN

	         .addFilterBy( "NOTINSdErrorComment","SD_ERROR_COMMENT NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalSdErrorComment","SD_ERROR_COMMENT != ?") // NOTEQUAL

	         .addFilterBy( "nullSdErrorComment",   "(SD_ERROR_COMMENT IS NULL OR LENGTH(SD_ERROR_COMMENT) IS NULL OR LENGTH(SD_ERROR_COMMENT) = 0)") // IS NULL

	         .addFilterBy( "notnullSdErrorComment","SD_ERROR_COMMENT IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanSdErrorComment","SD_ERROR_COMMENT < ? ") // LESS THAN

	         .addFilterBy( "greaterthanSdErrorComment","SD_ERROR_COMMENT > ? ") // GREATER THAN

	         .addFilterBy( "filterBySdErrorCommentMatch","SD_ERROR_COMMENT LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdErrorComment",
	      "(SD_ERROR_COMMENT = ? OR SD_ERROR_COMMENT IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("SdErrorComment asc", "SD_ERROR_COMMENT ASC ") // ORDER ASCENDING

	         .addOrderBy("SdErrorComment desc", "SD_ERROR_COMMENT DESC ") // ORDER DESCENDING
	    ;
;}


}