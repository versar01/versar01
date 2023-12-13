package com.eppixcomm.eppix.base.dml;



public class NpsN2nPerformSendsmsAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new ActAccTypesAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected NpsN2nPerformSendsmsAbstractDMLFactory(  )
	    throws DMLException {
	    ;	
	    
	    DMLTable table = defTable( "NpsN2nPerformSendsms", // dmlName
	            "blo.NpsN2nPerformSendsmsDMO", // dmoName
	            "NPS_N2N_PERFORM_SENDSMS", // tableName
	            10, // numColumns
	            "NPS_SERIAL,NPS_FUNCTION,NPS_OPTION,NPS_PORT_ID,NPS_MSISDN,NPS_DESC,NPS_SOURCE,NPS_TRANS_ID,NPS_SIM,NPS_TIMESTAMP", // columnList
	            "NPS_SERIAL", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	            "NPS_SERIAL,NPS_FUNCTION,NPS_OPTION,NPS_PORT_ID,NPS_MSISDN,NPS_DESC,NPS_SOURCE,NPS_TRANS_ID,NPS_SIM,NPS_TIMESTAMP",
	            "", "",
	            new String[] {
	    		"NPS_SERIAL","NPS_FUNCTION","NPS_OPTION","NPS_PORT_ID","NPS_MSISDN",
	    		"NPS_DESC",	"NPS_SOURCE","NPS_TRANS_ID","NPS_SIM","NPS_TIMESTAMP"
	            } );	    
	
	table.addFilterBy( "equalNpsSerial", /* PK attribute */
	"NPS_SERIAL = ? ")
	     .addFilterBy( "filterByNpsSerialMatch", "NPS_SERIAL LIKE ?")
	     .addFilterBy( "INNpsSerial","NPS_SERIAL IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsSerial","NPS_SERIAL NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsSerial","NPS_SERIAL != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsSerial",   "(NPS_SERIAL IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsSerial","NPS_SERIAL IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsSerial","NPS_SERIAL < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsSerial","NPS_SERIAL > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsSerialMatch","NPS_SERIAL LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsSerial",
	  "(NPS_SERIAL = ? OR NPS_SERIAL IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsSerial asc", "NPS_SERIAL ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsSerial desc", "NPS_SERIAL DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsFunction", /* PK attribute */
	"NPS_FUNCTION = ? ")
	     .addFilterBy( "filterByNpsFunctionMatch", "NPS_FUNCTION LIKE ?")
	     .addFilterBy( "INNpsFunction","NPS_FUNCTION IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsFunction","NPS_FUNCTION NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsFunction","NPS_FUNCTION != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsFunction",   "(NPS_FUNCTION IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsFunction","NPS_FUNCTION IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsFunction","NPS_FUNCTION < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsFunction","NPS_FUNCTION > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsFunctionMatch","NPS_FUNCTION LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsFunction",
	  "(NPS_FUNCTION = ? OR NPS_FUNCTION IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsFunction asc", "NPS_FUNCTION ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsFunction desc", "NPS_FUNCTION DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsOption", /* PK attribute */
	"NPS_OPTION = ? ")
	     .addFilterBy( "filterByNpsOptionMatch", "NPS_OPTION LIKE ?")
	     .addFilterBy( "INNpsOption","NPS_OPTION IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsOption","NPS_OPTION NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsOption","NPS_OPTION != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsOption",   "(NPS_OPTION IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsOption","NPS_OPTION IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsOption","NPS_OPTION < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsOption","NPS_OPTION > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsOptionMatch","NPS_OPTION LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsOption",
	  "(NPS_OPTION = ? OR NPS_OPTION IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsOption asc", "NPS_OPTION ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsOption desc", "NPS_OPTION DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsPortId", /* PK attribute */
	"NPS_PORT_ID = ? ")
	     .addFilterBy( "filterByNpsPortIdMatch", "NPS_PORT_ID LIKE ?")
	     .addFilterBy( "INNpsPortId","NPS_PORT_ID IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsPortId","NPS_PORT_ID NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsPortId","NPS_PORT_ID != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsPortId",   "(NPS_PORT_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsPortId","NPS_PORT_ID IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsPortId","NPS_PORT_ID < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsPortId","NPS_PORT_ID > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsPortIdMatch","NPS_PORT_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsPortId",
	  "(NPS_PORT_ID = ? OR NPS_PORT_ID IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsPortId asc", "NPS_PORT_ID ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsPortId desc", "NPS_PORT_ID DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsMsisdn", /* PK attribute */
	"NPS_MSISDN = ? ")
	     .addFilterBy( "filterByNpsMsisdnMatch", "NPS_MSISDN LIKE ?")
	     .addFilterBy( "INNpsMsisdn","NPS_MSISDN IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsMsisdn","NPS_MSISDN NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsMsisdn","NPS_MSISDN != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsMsisdn",   "(NPS_MSISDN IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsMsisdn","NPS_MSISDN IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsMsisdn","NPS_MSISDN < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsMsisdn","NPS_MSISDN > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsMsisdnMatch","NPS_MSISDN LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsMsisdn",
	  "(NPS_MSISDN = ? OR NPS_MSISDN IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsMsisdn asc", "NPS_MSISDN ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsMsisdn desc", "NPS_MSISDN DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsDesc", /* PK attribute */
	"NPS_DESC = ? ")
	     .addFilterBy( "filterByNpsDescMatch", "NPS_DESC LIKE ?")
	     .addFilterBy( "INNpsDesc","NPS_DESC IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsDesc","NPS_DESC NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsDesc","NPS_DESC != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsDesc",   "(NPS_DESC IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsDesc","NPS_DESC IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsDesc","NPS_DESC < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsDesc","NPS_DESC > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsDescMatch","NPS_DESC LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsDesc",
	  "(NPS_DESC = ? OR NPS_DESC IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsDesc asc", "NPS_DESC ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsDesc desc", "NPS_DESC DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsSource", /* PK attribute */
	"NPS_SOURCE = ? ")
	     .addFilterBy( "filterByNpsSourceMatch", "NPS_SOURCE LIKE ?")
	     .addFilterBy( "INNpsSource","NPS_SOURCE IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsSource","NPS_SOURCE NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsSource","NPS_SOURCE != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsSource",   "(NPS_SOURCE IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsSource","NPS_SOURCE IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsSource","NPS_SOURCE < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsSource","NPS_SOURCE > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsSourceMatch","NPS_SOURCE LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsSource",
	  "(NPS_SOURCE = ? OR NPS_SOURCE IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsSource asc", "NPS_SOURCE ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsSource desc", "NPS_SOURCE DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsTransId", /* PK attribute */
	"NPS_TRANS_ID = ? ")
	     .addFilterBy( "filterByNpsTransIdMatch", "NPS_TRANS_ID LIKE ?")
	     .addFilterBy( "INNpsTransId","NPS_TRANS_ID IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsTransId","NPS_TRANS_ID NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsTransId","NPS_TRANS_ID != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsTransId",   "(NPS_TRANS_ID IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsTransId","NPS_TRANS_ID IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsTransId","NPS_TRANS_ID < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsTransId","NPS_TRANS_ID > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsTransIdMatch","NPS_TRANS_ID LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsTransId",
	  "(NPS_TRANS_ID = ? OR NPS_TRANS_ID IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsTransId asc", "NPS_TRANS_ID ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsTransId desc", "NPS_TRANS_ID DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsSim", /* PK attribute */
	"NPS_SIM = ? ")
	     .addFilterBy( "filterByNpsSimMatch", "NPS_SIM LIKE ?")
	     .addFilterBy( "INNpsSim","NPS_SIM IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsSim","NPS_SIM NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsSim","NPS_SIM != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsSim",   "(NPS_SIM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsSim","NPS_SIM IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsSim","NPS_SIM < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsSim","NPS_SIM > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsSimMatch","NPS_SIM LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsSim",
	  "(NPS_SIM = ? OR NPS_SIM IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsSim asc", "NPS_SIM ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsSim desc", "NPS_SIM DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equalNpsTimestamp", /* PK attribute */
	"NPS_TIMESTAMP = ? ")
	     .addFilterBy( "filterByNpsTimestampMatch", "NPS_TIMESTAMP LIKE ?")
	     .addFilterBy( "INNpsTimestamp","NPS_TIMESTAMP IN ( ? ) ") // IN

	     .addFilterBy( "NOTINNpsTimestamp","NPS_TIMESTAMP NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalNpsTimestamp","NPS_TIMESTAMP != ?") // NOTEQUAL

	     .addFilterBy( "nullNpsTimestamp",   "(NPS_TIMESTAMP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullNpsTimestamp","NPS_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanNpsTimestamp","NPS_TIMESTAMP < ? ") // LESS THAN

	     .addFilterBy( "greaterthanNpsTimestamp","NPS_TIMESTAMP > ? ") // GREATER THAN

	     .addFilterBy( "filterByNpsTimestampMatch","NPS_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullNpsTimestamp",
	  "(NPS_TIMESTAMP = ? OR NPS_TIMESTAMP IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("NpsTimestamp asc", "NPS_TIMESTAMP ASC ") // ORDER ASCENDING

	     .addOrderBy("NpsTimestamp desc", "NPS_TIMESTAMP DESC ") // ORDER DESCENDING
	     ;
    	;
	    }
	  
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new NpsN2nPerformSendsmsDMLFactory( );
	    }

	    return dml;
	  }


}