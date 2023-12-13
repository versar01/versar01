package com.eppixcomm.eppix.base.dml;



public class EdfEnhancedDataFaxAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new EdfEnhancedDataFaxAbstractDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected EdfEnhancedDataFaxAbstractDMLFactory(  )
	    throws DMLException {
	    ;	
	    
	    DMLTable table = defTable( "EdfEnhancedDataFax", // dmlName
	            "blo.EdfEnhancedDataFaxDMO", // dmoName
	            "EDF_ENHANCED_DATA_FAX", // tableName
	            3, // numColumns
	            "EDF_PRIMARY_SIM, EDF_MSISDN, EDF_TIMESTAMP", // columnList
	            null, //primaryKey
	            "", // versionCol     
	            false, // generatedKey
	            "EDF_PRIMARY_SIM, EDF_MSISDN, EDF_TIMESTAMP",
	            "", "",
	            new String[] {
	    		"EDF_PRIMARY_SIM" , "EDF_MSISDN", "EDF_TIMESTAMP"
	            },false);	    
	
	table.addFilterBy( "equalEdfPrimarySim", /* PK attribute */
	"EDF_PRIMARY_SIM = ? ")
	     .addFilterBy( "filterByEdfPrimarySimMatch", "EDF_PRIMARY_SIM LIKE ?")
	     .addFilterBy( "INEdfPrimarySim","EDF_PRIMARY_SIM IN ( ? ) ") // IN

	     .addFilterBy( "NOTINEdfPrimarySim","EDF_PRIMARY_SIM NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalEdfPrimarySim","EDF_PRIMARY_SIM != ?") // NOTEQUAL

	     .addFilterBy( "nullEdfPrimarySim",   "(EDF_PRIMARY_SIM IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullEdfPrimarySim","EDF_PRIMARY_SIM IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanEdfPrimarySim","EDF_PRIMARY_SIM < ? ") // LESS THAN

	     .addFilterBy( "greaterthanEdfPrimarySim","EDF_PRIMARY_SIM > ? ") // GREATER THAN

	     .addFilterBy( "filterByEdfPrimarySimMatch","EDF_PRIMARY_SIM LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullEdfPrimarySim",
	  "(EDF_PRIMARY_SIM = ? OR EDF_PRIMARY_SIM IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("EdfPrimarySim asc", "EDF_PRIMARY_SIM ASC ") // ORDER ASCENDING

	     .addOrderBy("EdfPrimarySim desc", "EDF_PRIMARY_SIM DESC ") // ORDER DESCENDING
	;



	table.addFilterBy( "equaledfMsisdn", /* PK attribute */
	"EDF_MSISDN = ? ")
	     .addFilterBy( "filterByEdfMsisdnMatch", "EDF_MSISDN LIKE ?")
	     .addFilterBy( "INEdfMsisdn","EDF_MSISDN IN ( ? ) ") // IN

	     .addFilterBy( "NOTINEdfMsisdn","EDF_MSISDN NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalEdfMsisdn","EDF_MSISDN != ?") // NOTEQUAL

	     .addFilterBy( "nullEdfMsisdn",   "(EDF_MSISDN IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullEdfMsisdn","EDF_MSISDN IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanEdfMsisdn","EDF_MSISDN < ? ") // LESS THAN

	     .addFilterBy( "greaterthanEdfMsisdn","EDF_MSISDN > ? ") // GREATER THAN

	     .addFilterBy( "filterByEdfMsisdnMatch","EDF_MSISDN LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullEdfMsisdn",
	  "(EDF_MSISDN = ? OR EDF_MSISDN IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("EdfMsisdn asc", "EDF_MSISDN ASC ") // ORDER ASCENDING

	     .addOrderBy("EdfMsisdn desc", "EDF_MSISDN DESC ") // ORDER DESCENDING
	;




	table.addFilterBy( "equalEdfTimestamp", /* PK attribute */
	"EDF_TIMESTAMP = ? ")
	     .addFilterBy( "filterByEdfTimestampMatch", "EDF_TIMESTAMP LIKE ?")
	     .addFilterBy( "INEdfTimestamp","EDF_TIMESTAMP IN ( ? ) ") // IN

	     .addFilterBy( "NOTINEdfTimestamp","EDF_TIMESTAMP NOT IN ( ? )") // NOT IN

	     .addFilterBy( "notequalEdfTimestamp","EDF_TIMESTAMP != ?") // NOTEQUAL

	     .addFilterBy( "nullEdfTimestamp",   "(EDF_TIMESTAMP IS NULL OR LENGTH(FIELD) IS NULL OR LENGTH(FIELD) = 0)") // IS NULL

	     .addFilterBy( "notnullEdfTimestamp","EDF_TIMESTAMP IS NOT NULL ?") // IS NOT NULL

	     .addFilterBy( "lessthanEdfTimestamp","EDF_TIMESTAMP < ? ") // LESS THAN

	     .addFilterBy( "greaterthanEdfTimestamp","EDF_TIMESTAMP > ? ") // GREATER THAN

	     .addFilterBy( "filterByEdfTimestampMatch","EDF_TIMESTAMP LIKE ? ") // LIKE, BEGINSWITH, ENDSWITH, ANY

	     .addFilterBy( "equalornullEdfTimestamp",
	  "(EDF_TIMESTAMP = ? OR EDF_TIMESTAMP IS NULL) ") // EQUALORNULL
	                                       // TODO : we may need to wrap this with a TRIM()

	     .addOrderBy("EdfTimestamp asc", "EDF_TIMESTAMP ASC ") // ORDER ASCENDING

	     .addOrderBy("EdfTimestamp desc", "EDF_TIMESTAMP DESC ") // ORDER DESCENDING
	     ;
    	;
	    }
	  
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new EdfEnhancedDataFaxAbstractDMLFactory( );
	    }

	    return dml;
	  }


}