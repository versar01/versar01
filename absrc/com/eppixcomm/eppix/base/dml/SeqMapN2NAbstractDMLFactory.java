package com.eppixcomm.eppix.base.dml;


public class SeqMapN2NAbstractDMLFactory extends BaseDMLFactory{
	
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	  /**
	   * Gets the DMLFactory singleton instance.
	   *
	   * @return the DMLFactory object reference.
	   *
	   * @throws DMLException if an error is detected when instantiating the
	   *         DMLFactory.
	   */
	public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SeqMapN2NAbstractDMLFactory(  );
	    }

	    return dml;
	  }	

	protected SeqMapN2NAbstractDMLFactory() throws DMLException {

	    DMLTable table = defTable( "SeqMapN2N", // dmlName
	            "blo.SeqMapN2NDMO", // dmoName
	            "SEQ_MAP_N2N", // tableName
	            5, // numColumns
	            "SEQ_PROVIDER_ID, SEQ_N2NTRANS_ID, SEQ_NETWKTRANS_ID, SEQ_STATUS, SEQ_DATETIME", // columnList
	            "SEQ_PROVIDER_ID, SEQ_N2NTRANS_ID, SEQ_NETWKTRANS_ID", //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	            "SEQ_PROVIDER_ID, SEQ_N2NTRANS_ID, SEQ_NETWKTRANS_ID, SEQ_STATUS, SEQ_DATETIME",
	            "", "",
	            new String[] {"SEQ_PROVIDER_ID", "SEQ_N2NTRANS_ID", "SEQ_NETWKTRANS_ID", "SEQ_STATUS", "SEQ_DATETIME"} 
	    		,true);
	
    table.addFilterBy( "equalSeqProviderId", "(SEQ_PROVIDER_ID) = ?" ) // EQUAL

	    .addFilterBy( "notequalSeqProviderId", "(SEQ_PROVIDER_ID) != ?" ) // NOTEQUAL
	
	    .addFilterBy( "nullSeqProviderId",
	    "(SEQ_PROVIDER_ID IS NULL OR LENGTH((SEQ_PROVIDER_ID)) = 0)" ) // IS NULL
	
	    .addFilterBy( "notnullSeqProviderId", "SEQ_PROVIDER_ID IS NOT NULL" ) // IS NOT NULL
	
	    .addFilterBy( "filterBySeqProviderIdMatch", "SEQ_PROVIDER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	    .addFilterBy( "equalornullSeqProviderId",
	    "((SEQ_PROVIDER_ID) = ? OR SEQ_PROVIDER_ID IS NULL)" ) // EQUALORNULL
	
	    .addFilterBy( "INSeqProviderId", "SEQ_PROVIDER_ID IN ( ? )" ) // IN
	
	    .addFilterBy( "NOTINSeqProviderId", "SEQ_PROVIDER_ID NOT IN ( ? )" ) // NOT IN
	
	    .addOrderBy( "SbdSeqProviderIdasc", "SEQ_PROVIDER_ID ASC" ) // ORDER ASCENDING
	
	    .addOrderBy( "SbdSeqProviderIddesc", "SEQ_PROVIDER_ID DESC" ) // ORDER DESCENDING
	    ;
    
    table.addFilterBy( "equalSeqN2NTransId", "(SEQ_N2NTRANS_ID) = ?" ) // EQUAL

	    .addFilterBy( "notequalSeqN2NTransId", "(SEQ_N2NTRANS_ID) != ?" ) // NOTEQUAL
	
	    .addFilterBy( "nullSeqN2NTransId",
	    "(SEQ_N2NTRANS_ID IS NULL OR LENGTH((SEQ_N2NTRANS_ID)) = 0)" ) // IS NULL
	
	    .addFilterBy( "notnullSeqN2NTransId", "SEQ_N2NTRANS_ID IS NOT NULL" ) // IS NOT NULL
	
	    .addFilterBy( "filterBySeqN2NTransIdMatch", "SEQ_N2NTRANS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	    .addFilterBy( "equalornullSeqN2NTransId",
	    "((SEQ_N2NTRANS_ID) = ? OR SEQ_N2NTRANS_ID IS NULL)" ) // EQUALORNULL
	
	    .addFilterBy( "INSeqN2NTransId", "SEQ_N2NTRANS_ID IN ( ? )" ) // IN
	
	    .addFilterBy( "NOTINSeqN2NTransId", "SEQ_N2NTRANS_ID NOT IN ( ? )" ) // NOT IN
	
	    .addOrderBy( "SbdSeqN2NTransIdasc", "SEQ_N2NTRANS_ID ASC" ) // ORDER ASCENDING
	
	    .addOrderBy( "SbdSeqN2NTransIddesc", "SEQ_N2NTRANS_ID DESC" ) // ORDER DESCENDING
	    ;
    
    table.addFilterBy( "equalSeqNetwktransId", "(SEQ_NETWKTRANS_ID) = ?" ) // EQUAL

	    .addFilterBy( "notequalSeqNetwktransId", "(SEQ_NETWKTRANS_ID) != ?" ) // NOTEQUAL
	
	    .addFilterBy( "nullSeqNetwktransId",
	    "(SEQ_NETWKTRANS_ID IS NULL OR LENGTH((SEQ_NETWKTRANS_ID)) = 0)" ) // IS NULL
	
	    .addFilterBy( "notnullSeqNetwktransId", "SEQ_NETWKTRANS_ID IS NOT NULL" ) // IS NOT NULL
	
	    .addFilterBy( "filterBySeqNetwktransIdMatch", "SEQ_NETWKTRANS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	    .addFilterBy( "equalornullSeqNetwktransId",
	    "((SEQ_NETWKTRANS_ID) = ? OR SEQ_NETWKTRANS_ID IS NULL)" ) // EQUALORNULL
	
	    .addFilterBy( "INSeqNetwktransId", "SEQ_NETWKTRANS_ID IN ( ? )" ) // IN
	
	    .addFilterBy( "NOTINSeqNetwktransId", "SEQ_NETWKTRANS_ID NOT IN ( ? )" ) // NOT IN
	
	    .addOrderBy( "SbdSeqNetwktransIdasc", "SEQ_NETWKTRANS_ID ASC" ) // ORDER ASCENDING
	
	    .addOrderBy( "SbdSeqNetwktransIddesc", "SEQ_NETWKTRANS_ID DESC" ) // ORDER DESCENDING
	    ; 
    
    table.addFilterBy( "equalSseqStatus", "(SEQ_STATUS) = ?" ) // EQUAL

	    .addFilterBy( "notequalseqStatus", "(SEQ_STATUS) != ?" ) // NOTEQUAL
	
	    .addFilterBy( "nullseqStatus",
	    "(SEQ_STATUS IS NULL OR LENGTH((SEQ_STATUS)) = 0)" ) // IS NULL
	
	    .addFilterBy( "notnullseqStatus", "SEQ_STATUS IS NOT NULL" ) // IS NOT NULL
	
	    .addFilterBy( "filterByseqStatusMatch", "SEQ_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	    .addFilterBy( "equalornullseqStatus",
	    "((SEQ_STATUS) = ? OR SEQ_STATUS IS NULL)" ) // EQUALORNULL
	
	    .addFilterBy( "INseqStatus", "SEQ_STATUS IN ( ? )" ) // IN
	
	    .addFilterBy( "NOTINseqStatus", "SEQ_STATUS NOT IN ( ? )" ) // NOT IN
	
	    .addOrderBy( "SbdseqStatusasc", "SEQ_STATUS ASC" ) // ORDER ASCENDING
	
	    .addOrderBy( "SbdseqStatusdesc", "SEQ_STATUS DESC" ) // ORDER DESCENDING
	    ;
    
    table.addFilterBy( "equalSseqDatetime", "(SEQ_DATETIME) = ?" ) // EQUAL

	    .addFilterBy( "notequalseqDatetime", "(SEQ_DATETIME) != ?" ) // NOTEQUAL
	
	    .addFilterBy( "nullseqDatetime",
	    "(SEQ_DATETIME IS NULL OR LENGTH((SEQ_DATETIME)) = 0)" ) // IS NULL
	
	    .addFilterBy( "notnullseqDatetime", "SEQ_DATETIME IS NOT NULL" ) // IS NOT NULL
	
	    .addFilterBy( "filterByseqDatetimeMatch", "SEQ_DATETIME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
	    .addFilterBy( "equalornullseqDatetime",
	    "((SEQ_DATETIME) = ? OR SEQ_DATETIME IS NULL)" ) // EQUALORNULL
	
	    .addFilterBy( "INseqDatetime", "SEQ_DATETIME IN ( ? )" ) // IN
	
	    .addFilterBy( "NOTINseqDatetime", "SEQ_DATETIME NOT IN ( ? )" ) // NOT IN
	    
	    .addFilterBy( "greaterthanorequalseqDatetime",
	    "SEQ_DATETIME >= ?" ) // GREATER THAN OR EQUAL
	
	    .addOrderBy( "SbdseqDatetimeasc", "SEQ_DATETIME ASC" ) // ORDER ASCENDING
	
	    .addOrderBy( "SbdseqDatetimedesc", "SEQ_DATETIME DESC" ) // ORDER DESCENDING
	    ;    

	}
}
