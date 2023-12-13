package com.eppixcomm.eppix.base.dml;


public class EiEppixIsisAbstractDMLFactory extends BaseDMLFactory{
	
	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	protected EiEppixIsisAbstractDMLFactory() throws DMLException {
//		EiBillCycle EI_BILL_CYCLE
//		EiServProv EI_SERV_PROV
//		ei_max_subs EI_MAX_SUBS
//		ei_subs_count EI_SUBS_COUNT

		DMLTable table = defTable( "EiEppixIsis", // dmlName
		        "blo.EiEppixIsisDMO", // dmoName
		        "EI_EPPIX_ISIS", // tableName
		        4, // numColumns
		        "EI_BILL_CYCLE, EI_SERV_PROV, EI_MAX_SUBS, EI_SUBS_COUNT", // columnList
		        null, //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "EI_BILL_CYCLE, EI_SERV_PROV, EI_MAX_SUBS, EI_SUBS_COUNT","","",
		        new String[] {
				"EI_BILL_CYCLE", "EI_SERV_PROV", "EI_MAX_SUBS", "EI_SUBS_COUNT"
		        }, false );

		//===========================================================================================
		   table.addFilterBy( "equalEiBillCycle", "(EI_BILL_CYCLE) = ?" ) // EQUAL

	         .addFilterBy( "notequalEiBillCycle", "(EI_BILL_CYCLE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEiBillCycle",
	      "(EI_BILL_CYCLE IS NULL OR LENGTH((EI_BILL_CYCLE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEiBillCycle", "EI_BILL_CYCLE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanEiBillCycle", "EI_BILL_CYCLE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanEiBillCycle", "EI_BILL_CYCLE > ?" ) // GREATER THAN

	         .addFilterBy( "filterByEiBillCycle", "EI_BILL_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEiBillCycle",
	      "((EI_BILL_CYCLE) = ? OR EI_BILL_CYCLE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEiBillCycle", "(EI_BILL_CYCLE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEiBillCycle", "(EI_BILL_CYCLE) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EiBillCycleasc", "EI_BILL_CYCLE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EiBillCycledesc", "EI_BILL_CYCLE DESC" ) // ORDER DESCENDING
	    ;
		//===========================================================================================
		   table.addFilterBy( "equalEiServProv", "(EI_SERV_PROV) = ?" ) // EQUAL

	         .addFilterBy( "notequalEiServProv", "(EI_SERV_PROV) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullEiServProv",
	      "(EI_SERV_PROV IS NULL OR LENGTH((EI_SERV_PROV)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullEiServProv", "EI_SERV_PROV IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanEiServProv", "EI_SERV_PROV < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanEiServProv", "EI_SERV_PROV > ?" ) // GREATER THAN

	         .addFilterBy( "filterByEiServProv", "EI_SERV_PROV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullEiServProv",
	      "((EI_SERV_PROV) = ? OR EI_SERV_PROV IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INEiServProv", "(EI_SERV_PROV) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINEiServProv", "(EI_SERV_PROV) NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "EiServProvasc", "EI_SERV_PROV ASC" ) // ORDER ASCENDING

	         .addOrderBy( "EiServProvdesc", "EI_SERV_PROV DESC" ) // ORDER DESCENDING
	    ;
		//===========================================================================================
			defStaticQuery("getEiEppixIsisBySpid", // dmlName
					".common.data.IntegerDMO", // dmoName,
					"SELECT UNIQUE EI_SERV_PROV " +
					"FROM EI_EPPIX_ISIS " +
					"ORDER BY EI_SERV_PROV", true);
		//===========================================================================================
	}
	
	
	
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
	      dml = new EiEppixIsisAbstractDMLFactory(  );
	    }

	    return dml;
	  }
}
