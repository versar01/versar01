package com.eppixcomm.eppix.base.dml;


public class NcrCompressRuleAbstractDMLFactory  extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;
	  
	  protected NcrCompressRuleAbstractDMLFactory()
	    throws DMLException {
		  
		    DMLTable table = defTable( "NcrCompressRule", // dmlName
		            "blo.NcrCompressRuleDMO", // dmoName
		            "NCR_COMPRESS_RULE", // tableName
		            2, // numColumns
		            "NCR_COMPRESS_CODE, NCR_CODE", // columnList
		            "", //primaryKey
		            "" // versionCol     
		          , false, // generatedKey
		            "NCR_COMPRESS_CODE, NCR_CODE", "", "",
		            new String[] {
		              "NCR_COMPRESS_CODE", "NCR_CODE"
		            },false);

		    table.addFilterBy( "equalncrCompressCode", /* PK attribute */
		      "(NCR_COMPRESS_CODE) = ?" )
		         .addFilterBy( "filterBynctCompressCodeMatch", "NCR_COMPRESS_CODE LIKE ?" )
		         .addFilterBy( "INncrCompressCode", "(NCR_COMPRESS_CODE) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINncrCompressCode", "(NCR_COMPRESS_CODE) NOT IN ( ? )" ) // NOT IN

		         .addFilterBy( "notequalncrCompressCode", "(NCR_COMPRESS_CODE) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullncrCompressCode",
		      "(NCR_COMPRESS_CODE IS NULL OR LENGTH((NCR_COMPRESS_CODE)) IS NULL OR LENGTH((ECD_COMMAND)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullncrCompressCode", "NCR_COMPRESS_CODE IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanncrCompressCode", "NCR_COMPRESS_CODE < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanncrCompressCode", "NCR_COMPRESS_CODE > ?" ) // GREATER THAN

		         .addFilterBy( "filterByncrCompressCodeMatch", "NCR_COMPRESS_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullncrCompressCode",
		      "((NCR_COMPRESS_CODE) = ? OR NCR_COMPRESS_CODE IS NULL)" ) // EQUALORNULL
		                                                         // TODO : we may need to wrap this with a () 

		         .addOrderBy( "ncrCompressCodeasc", "NCR_COMPRESS_CODE ASC" ) // ORDER ASCENDING

		         .addOrderBy( "ncrCompressCodedesc", "NCR_COMPRESS_CODE DESC" ) // ORDER DESCENDING
		    ;

		    table.addFilterBy( "equalncrCode", "(NCR_CODE) = ?" ) // EQUAL

		         .addFilterBy( "notequalncrCode", "(NCR_CODE) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullncrCode",
		      "(NCR_CODE IS NULL OR LENGTH((NCR_CODE)) IS NULL OR LENGTH((NCR_CODE)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullncrCode", "NCR_CODE IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanncrCode", "NCR_CODE < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanncrCode", "NCR_CODE > ?" ) // GREATER THAN

		         .addFilterBy( "filterByncrCodeMatch", "NCR_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullncrCode",
		      "((NCR_CODE) = ? OR NCR_CODE IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INncrCode", "(NCR_CODE) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINncrCode", "(NCR_CODE) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "ncrCodeasc", "NCR_CODE ASC" ) // ORDER ASCENDING

		         .addOrderBy( "ncrCodedesc", "NCR_CODE DESC" ) // ORDER DESCENDING
		    ;
	  }
	  
	  /**
	   * Gets the DMLFactory singleton instance.
	   *
	   * @return the DMLFactory object reference.
	   *
	   * @throws DMLException if an error is detected when instantiating the
	   *         DMLFactory.
	   */
	  public static DMLFactory getDMLFactory()
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new NcrCompressRuleAbstractDMLFactory();
	    }

	    return dml;
	  }	  
}

