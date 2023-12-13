package com.eppixcomm.eppix.base.dml;


public class NctCompressTypeAbstractDMLFactory extends BaseDMLFactory{
	
	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;
	  
	  protected NctCompressTypeAbstractDMLFactory(  )
	    throws DMLException {
		  
//		  nctCompressCode
//		  nctCompressType
		  
		    DMLTable table = defTable( "nctCompressType", // dmlName
		            "blo.NctCompressTypeDMO", // dmoName
		            "NCT_COMPRESS_TYPE", // tableName
		            2, // numColumns
		            "NCT_COMPRESS_CODE, NCT_COMPRESS_TYPE", // columnList
		            "", //primaryKey
		            "" // versionCol     
		          , false, // generatedKey
		            "NCT_COMPRESS_CODE, NCT_COMPRESS_TYPE", "", "",
		            new String[] {
		              "NCT_COMPRESS_CODE", "NCT_COMPRESS_TYPE"
		            },false );

		    table.addFilterBy( "equalnctCompressCode", /* PK attribute */
		      "(NCT_COMPRESS_CODE) = ?" )
		         .addFilterBy( "filterBynctCompressCodeMatch", "NCT_COMPRESS_CODE LIKE ?" )
		         .addFilterBy( "INnctCompressCode", "(NCT_COMPRESS_CODE) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINnctCompressCode", "(NCT_COMPRESS_CODE) NOT IN ( ? )" ) // NOT IN

		         .addFilterBy( "notequalnctCompressCode", "(NCT_COMPRESS_CODE) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullnctCompressCode",
		      "(NCT_COMPRESS_CODE IS NULL OR LENGTH((NCT_COMPRESS_CODE)) IS NULL OR LENGTH((ECD_COMMAND)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullnctCompressCode", "NCT_COMPRESS_CODE IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthannctCompressCode", "NCT_COMPRESS_CODE < ?" ) // LESS THAN

		         .addFilterBy( "greaterthannctCompressCode", "NCT_COMPRESS_CODE > ?" ) // GREATER THAN

		         .addFilterBy( "filterBynctCompressCodeMatch", "NCT_COMPRESS_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullnctCompressCode",
		      "((NCT_COMPRESS_CODE) = ? OR NCT_COMPRESS_CODE IS NULL)" ) // EQUALORNULL
		                                                         // TODO : we may need to wrap this with a () 

		         .addOrderBy( "nctCompressCodeasc", "NCT_COMPRESS_CODE ASC" ) // ORDER ASCENDING

		         .addOrderBy( "nctCompressCodedesc", "NCT_COMPRESS_CODE DESC" ) // ORDER DESCENDING
		    ;

		    table.addFilterBy( "equalnctCompressType", "(NCT_COMPRESS_TYPE) = ?" ) // EQUAL

		         .addFilterBy( "notequalnctCompressType", "(NCT_COMPRESS_TYPE) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullnctCompressType",
		      "(NCT_COMPRESS_TYPE IS NULL OR LENGTH((NCT_COMPRESS_TYPE)) IS NULL OR LENGTH((NCT_COMPRESS_TYPE)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullnctCompressType", "NCT_COMPRESS_TYPE IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthannctCompressType", "NCT_COMPRESS_TYPE < ?" ) // LESS THAN

		         .addFilterBy( "greaterthannctCompressType", "NCT_COMPRESS_TYPE > ?" ) // GREATER THAN

		         .addFilterBy( "filterBynctCompressTypeMatch", "NCT_COMPRESS_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullnctCompressType",
		      "((NCT_COMPRESS_TYPE) = ? OR NCT_COMPRESS_TYPE IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INnctCompressType", "(NCT_COMPRESS_TYPE) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINnctCompressType", "(NCT_COMPRESS_TYPE) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "nctCompressTypeasc", "NCT_COMPRESS_TYPE ASC" ) // ORDER ASCENDING

		         .addOrderBy( "nctCompressTypedesc", "NCT_COMPRESS_TYPE DESC" ) // ORDER DESCENDING
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
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new NctCompressTypeAbstractDMLFactory(  );
	    }

	    return dml;
	  }	  
}
