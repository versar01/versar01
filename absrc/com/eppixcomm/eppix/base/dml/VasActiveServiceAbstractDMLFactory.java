package com.eppixcomm.eppix.base.dml;



public class VasActiveServiceAbstractDMLFactory extends BaseDMLFactory {

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new DotDocTypeAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected VasActiveServiceAbstractDMLFactory(  )
	    throws DMLException {
	    ;

	    DMLTable table = defTable( "VasActiveService", // dmlName
	        "blo.VasActiveServiceDMO", // dmoName
	        "VAS_ACTIVE_SERVICE", // tableName
	        11, // numColumns
	        "VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE", // columnList
	        "VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF ", //primaryKey
	        "" // versionCol     
	      , false, // generatedKey
	        "VAS_SUBSCRIBER_ID,VAS_SERVICE_CODE,VAS_INTERN_TARIFF,VAS_SERVICE_TYPE,VAS_ACT_DATE,VAS_DEACT_DATE,VAS_SUB_CHARGE1,VAS_SUB_CHARGE2,VAS_SUB_CHARGE3,VAS_TWINBILL_NO,VAS_MULTI_CHARGE",
	        "", "",
	        new String[] {
	    		"VAS_SUBSCRIBER_ID",
	    		"VAS_SERVICE_CODE",
	    		"VAS_INTERN_TARIFF",
	    		"VAS_SERVICE_TYPE",
	    		"VAS_ACT_DATE",
	    		"VAS_DEACT_DATE",
	    		"VAS_SUB_CHARGE1",
	    		"VAS_SUB_CHARGE2",
	    		"VAS_SUB_CHARGE3",
	    		"VAS_TWINBILL_NO",
	    		"VAS_MULTI_CHARGE"
	        },true );

	    
	    table.addFilterBy( "equalVasSubscriberId", /* PK attribute */
	    "VAS_SUBSCRIBER_ID = ? ")
	         .addFilterBy( "filterByVasSubscriberIdMatch", "VAS_SUBSCRIBER_ID LIKE ?")
	         .addFilterBy( "INVasSubscriberId","VAS_SUBSCRIBER_ID IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasSubscriberId","VAS_SUBSCRIBER_ID NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasSubscriberId","VAS_SUBSCRIBER_ID != ?") // NOTEQUAL

	         .addFilterBy( "nullVasSubscriberId",   "(VAS_SUBSCRIBER_ID IS NULL OR LENGTH(VAS_SUBSCRIBER_ID) IS NULL OR LENGTH(VAS_SUBSCRIBER_ID) = 0)") // IS NULL

	         .addFilterBy( "notnullVasSubscriberId","VAS_SUBSCRIBER_ID IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasSubscriberId","VAS_SUBSCRIBER_ID < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasSubscriberId","VAS_SUBSCRIBER_ID > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasSubscriberIdMatch","VAS_SUBSCRIBER_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasSubscriberId",
	      "(VAS_SUBSCRIBER_ID = ? OR VAS_SUBSCRIBER_ID IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasSubscriberId asc", "VAS_SUBSCRIBER_ID ASC ") // ORDER ASCENDING

	         .addOrderBy("VasSubscriberId desc", "VAS_SUBSCRIBER_ID DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasServiceCode", /* PK attribute */
	    "VAS_SERVICE_CODE = ? ")
	         .addFilterBy( "filterByVasServiceCodeMatch", "VAS_SERVICE_CODE LIKE ?")
	         .addFilterBy( "INVasServiceCode","VAS_SERVICE_CODE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasServiceCode","VAS_SERVICE_CODE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasServiceCode","VAS_SERVICE_CODE != ?") // NOTEQUAL

	         .addFilterBy( "nullVasServiceCode",   "(VAS_SERVICE_CODE IS NULL OR LENGTH(VAS_SERVICE_CODE) IS NULL OR LENGTH(VAS_SERVICE_CODE) = 0)") // IS NULL

	         .addFilterBy( "notnullVasServiceCode","VAS_SERVICE_CODE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasServiceCode","VAS_SERVICE_CODE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasServiceCode","VAS_SERVICE_CODE > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasServiceCodeMatch","VAS_SERVICE_CODE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasServiceCode",
	      "(VAS_SERVICE_CODE = ? OR VAS_SERVICE_CODE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasServiceCode asc", "VAS_SERVICE_CODE ASC ") // ORDER ASCENDING

	         .addOrderBy("VasServiceCode desc", "VAS_SERVICE_CODE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasInternTariff", /* PK attribute */
	    "VAS_INTERN_TARIFF = ? ")
	         .addFilterBy( "filterByVasInternTariffMatch", "VAS_INTERN_TARIFF LIKE ?")
	         .addFilterBy( "INVasInternTariff","VAS_INTERN_TARIFF IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasInternTariff","VAS_INTERN_TARIFF NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasInternTariff","VAS_INTERN_TARIFF != ?") // NOTEQUAL

	         .addFilterBy( "nullVasInternTariff",   "(VAS_INTERN_TARIFF IS NULL OR LENGTH(VAS_INTERN_TARIFF) IS NULL OR LENGTH(VAS_INTERN_TARIFF) = 0)") // IS NULL

	         .addFilterBy( "notnullVasInternTariff","VAS_INTERN_TARIFF IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasInternTariff","VAS_INTERN_TARIFF < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasInternTariff","VAS_INTERN_TARIFF > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasInternTariffMatch","VAS_INTERN_TARIFF LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasInternTariff",
	      "(VAS_INTERN_TARIFF = ? OR VAS_INTERN_TARIFF IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasInternTariff asc", "VAS_INTERN_TARIFF ASC ") // ORDER ASCENDING

	         .addOrderBy("VasInternTariff desc", "VAS_INTERN_TARIFF DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasServiceType", /* PK attribute */
	    "VAS_SERVICE_TYPE = ? ")
	         .addFilterBy( "filterByVasServiceTypeMatch", "VAS_SERVICE_TYPE LIKE ?")
	         .addFilterBy( "INVasServiceType","VAS_SERVICE_TYPE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasServiceType","VAS_SERVICE_TYPE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasServiceType","VAS_SERVICE_TYPE != ?") // NOTEQUAL

	         .addFilterBy( "nullVasServiceType",   "(VAS_SERVICE_TYPE IS NULL OR LENGTH(VAS_SERVICE_TYPE) IS NULL OR LENGTH(VAS_SERVICE_TYPE) = 0)") // IS NULL

	         .addFilterBy( "notnullVasServiceType","VAS_SERVICE_TYPE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasServiceType","VAS_SERVICE_TYPE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasServiceType","VAS_SERVICE_TYPE > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasServiceTypeMatch","VAS_SERVICE_TYPE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasServiceType",
	      "(VAS_SERVICE_TYPE = ? OR VAS_SERVICE_TYPE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasServiceType asc", "VAS_SERVICE_TYPE ASC ") // ORDER ASCENDING

	         .addOrderBy("VasServiceType desc", "VAS_SERVICE_TYPE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasActDate", /* PK attribute */
	    "VAS_ACT_DATE = ? ")
	         .addFilterBy( "filterByVasActDateMatch", "VAS_ACT_DATE LIKE ?")
	         .addFilterBy( "INVasActDate","VAS_ACT_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasActDate","VAS_ACT_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasActDate","VAS_ACT_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullVasActDate",   "(VAS_ACT_DATE IS NULL)") // IS NULL

	         .addFilterBy( "notnullVasActDate","VAS_ACT_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasActDate","VAS_ACT_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasActDate","VAS_ACT_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasActDateMatch","VAS_ACT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasActDate",
	      "(VAS_ACT_DATE = ? OR VAS_ACT_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasActDate asc", "VAS_ACT_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("VasActDate desc", "VAS_ACT_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasDeactDate", /* PK attribute */
	    "VAS_DEACT_DATE = ? ")
	         .addFilterBy( "filterByVasDeactDateMatch", "VAS_DEACT_DATE LIKE ?")
	         .addFilterBy( "INVasDeactDate","VAS_DEACT_DATE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasDeactDate","VAS_DEACT_DATE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasDeactDate","VAS_DEACT_DATE != ?") // NOTEQUAL

	         .addFilterBy( "nullVasDeactDate",   "(VAS_DEACT_DATE IS NULL)") // IS NULL

	         .addFilterBy( "notnullVasDeactDate","VAS_DEACT_DATE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasDeactDate","VAS_DEACT_DATE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasDeactDate","VAS_DEACT_DATE > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasDeactDateMatch","VAS_DEACT_DATE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasDeactDate",
	      "(VAS_DEACT_DATE = ? OR VAS_DEACT_DATE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasDeactDate asc", "VAS_DEACT_DATE ASC ") // ORDER ASCENDING

	         .addOrderBy("VasDeactDate desc", "VAS_DEACT_DATE DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasSubCharge1", /* PK attribute */
	    "VAS_SUB_CHARGE1 = ? ")
	         .addFilterBy( "filterByVasSubCharge1Match", "VAS_SUB_CHARGE1 LIKE ?")
	         .addFilterBy( "INVasSubCharge1","VAS_SUB_CHARGE1 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasSubCharge1","VAS_SUB_CHARGE1 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasSubCharge1","VAS_SUB_CHARGE1 != ?") // NOTEQUAL

	         .addFilterBy( "nullVasSubCharge1",   "(VAS_SUB_CHARGE1 IS NULL OR LENGTH(VAS_SUB_CHARGE1) IS NULL OR LENGTH(VAS_SUB_CHARGE1) = 0)") // IS NULL

	         .addFilterBy( "notnullVasSubCharge1","VAS_SUB_CHARGE1 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasSubCharge1","VAS_SUB_CHARGE1 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasSubCharge1","VAS_SUB_CHARGE1 > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasSubCharge1Match","VAS_SUB_CHARGE1 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasSubCharge1",
	      "(VAS_SUB_CHARGE1 = ? OR VAS_SUB_CHARGE1 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasSubCharge1 asc", "VAS_SUB_CHARGE1 ASC ") // ORDER ASCENDING

	         .addOrderBy("VasSubCharge1 desc", "VAS_SUB_CHARGE1 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasSubCharge2", /* PK attribute */
	    "VAS_SUB_CHARGE2 = ? ")
	         .addFilterBy( "filterByVasSubCharge2Match", "VAS_SUB_CHARGE2 LIKE ?")
	         .addFilterBy( "INVasSubCharge2","VAS_SUB_CHARGE2 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasSubCharge2","VAS_SUB_CHARGE2 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasSubCharge2","VAS_SUB_CHARGE2 != ?") // NOTEQUAL

	         .addFilterBy( "nullVasSubCharge2",   "(VAS_SUB_CHARGE2 IS NULL OR LENGTH(VAS_SUB_CHARGE2) IS NULL OR LENGTH(VAS_SUB_CHARGE2) = 0)") // IS NULL

	         .addFilterBy( "notnullVasSubCharge2","VAS_SUB_CHARGE2 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasSubCharge2","VAS_SUB_CHARGE2 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasSubCharge2","VAS_SUB_CHARGE2 > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasSubCharge2Match","VAS_SUB_CHARGE2 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasSubCharge2",
	      "(VAS_SUB_CHARGE2 = ? OR VAS_SUB_CHARGE2 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasSubCharge2 asc", "VAS_SUB_CHARGE2 ASC ") // ORDER ASCENDING

	         .addOrderBy("VasSubCharge2 desc", "VAS_SUB_CHARGE2 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasSubCharge3", /* PK attribute */
	    "VAS_SUB_CHARGE3 = ? ")
	         .addFilterBy( "filterByVasSubCharge3Match", "VAS_SUB_CHARGE3 LIKE ?")
	         .addFilterBy( "INVasSubCharge3","VAS_SUB_CHARGE3 IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasSubCharge3","VAS_SUB_CHARGE3 NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasSubCharge3","VAS_SUB_CHARGE3 != ?") // NOTEQUAL

	         .addFilterBy( "nullVasSubCharge3",   "(VAS_SUB_CHARGE3 IS NULL OR LENGTH(VAS_SUB_CHARGE3) IS NULL OR LENGTH(VAS_SUB_CHARGE3) = 0)") // IS NULL

	         .addFilterBy( "notnullVasSubCharge3","VAS_SUB_CHARGE3 IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasSubCharge3","VAS_SUB_CHARGE3 < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasSubCharge3","VAS_SUB_CHARGE3 > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasSubCharge3Match","VAS_SUB_CHARGE3 LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasSubCharge3",
	      "(VAS_SUB_CHARGE3 = ? OR VAS_SUB_CHARGE3 IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasSubCharge3 asc", "VAS_SUB_CHARGE3 ASC ") // ORDER ASCENDING

	         .addOrderBy("VasSubCharge3 desc", "VAS_SUB_CHARGE3 DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasTwinbillNo", /* PK attribute */
	    "VAS_TWINBILL_NO = ? ")
	         .addFilterBy( "filterByVasTwinbillNoMatch", "VAS_TWINBILL_NO LIKE ?")
	         .addFilterBy( "INVasTwinbillNo","VAS_TWINBILL_NO IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasTwinbillNo","VAS_TWINBILL_NO NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasTwinbillNo","VAS_TWINBILL_NO != ?") // NOTEQUAL

	         .addFilterBy( "nullVasTwinbillNo",   "(VAS_TWINBILL_NO IS NULL OR LENGTH(VAS_TWINBILL_NO) IS NULL OR LENGTH(VAS_TWINBILL_NO) = 0)") // IS NULL

	         .addFilterBy( "notnullVasTwinbillNo","VAS_TWINBILL_NO IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasTwinbillNo","VAS_TWINBILL_NO < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasTwinbillNo","VAS_TWINBILL_NO > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasTwinbillNoMatch","VAS_TWINBILL_NO LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasTwinbillNo",
	      "(VAS_TWINBILL_NO = ? OR VAS_TWINBILL_NO IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasTwinbillNo asc", "VAS_TWINBILL_NO ASC ") // ORDER ASCENDING

	         .addOrderBy("VasTwinbillNo desc", "VAS_TWINBILL_NO DESC ") // ORDER DESCENDING
	    ;



	    table.addFilterBy( "equalVasMultiCharge", /* PK attribute */
	    "VAS_MULTI_CHARGE = ? ")
	         .addFilterBy( "filterByVasMultiChargeMatch", "VAS_MULTI_CHARGE LIKE ?")
	         .addFilterBy( "INVasMultiCharge","VAS_MULTI_CHARGE IN ( ? ) ") // IN

	         .addFilterBy( "NOTINVasMultiCharge","VAS_MULTI_CHARGE NOT IN ( ? )") // NOT IN

	         .addFilterBy( "notequalVasMultiCharge","VAS_MULTI_CHARGE != ?") // NOTEQUAL

	         .addFilterBy( "nullVasMultiCharge",   "(VAS_MULTI_CHARGE IS NULL OR LENGTH(VAS_MULTI_CHARGE) IS NULL OR LENGTH(VAS_MULTI_CHARGE) = 0)") // IS NULL

	         .addFilterBy( "notnullVasMultiCharge","VAS_MULTI_CHARGE IS NOT NULL ?") // IS NOT NULL

	         .addFilterBy( "lessthanVasMultiCharge","VAS_MULTI_CHARGE < ? ") // LESS THAN

	         .addFilterBy( "greaterthanVasMultiCharge","VAS_MULTI_CHARGE > ? ") // GREATER THAN

	         .addFilterBy( "filterByVasMultiChargeMatch","VAS_MULTI_CHARGE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullVasMultiCharge",
	      "(VAS_MULTI_CHARGE = ? OR VAS_MULTI_CHARGE IS NULL) ") // EQUALORNULL
	                                           // TODO : we may need to wrap this with a TRIM()

	         .addOrderBy("VasMultiCharge asc", "VAS_MULTI_CHARGE ASC ") // ORDER ASCENDING

	         .addOrderBy("VasMultiCharge desc", "VAS_MULTI_CHARGE DESC ") // ORDER DESCENDING
	    ;

;}

}