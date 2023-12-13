package com.eppixcomm.eppix.base.dml;


public class HmHandsetManuAbstractDMLFactory extends BaseDMLFactory{

	  /** The DMLFactory singleton */
	  private static DMLFactory dml = null;

	  protected HmHandsetManuAbstractDMLFactory() throws DMLException{
		  
		  DMLTable table = defTable( "HmHandsetManu", // dmlName
			        "blo.HmHandsetManuDMO", // dmoName
			        "HM_HANDSET_MANU", // tableName
			        2, // numColumns
			        "HM_MANU_ID, HM_DESCRIPTION", // columnList
			        null, //primaryKey
			        "" // versionCol     
			      , false, // generatedKey
			      "HM_MANU_ID, HM_DESCRIPTION",
			        "", "",
			        new String[] {
			          "HM_MANU_ID", "HM_DESCRIPTION"
			        }, false );

			    ;
		  
			    table.addFilterBy( "equalhmManuId", "(HM_MANU_ID) = ?" ) // EQUAL

		         .addFilterBy( "notequalhmManuId", "(HM_MANU_ID) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhmManuId",
		      "(HM_MANU_ID IS NULL OR LENGTH((HM_MANU_ID)) IS NULL OR LENGTH((HM_MANU_ID)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhmManuId", "HM_MANU_ID IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhmManuId", "HM_MANU_ID < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhmManuId", "HM_MANU_ID > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhmManuIdMatch", "HM_MANU_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhmManuId",
		      "((HM_MANU_ID) = ? OR HM_MANU_ID IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhmManuId", "(HM_MANU_ID) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhmManuId", "(HM_MANU_ID) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hmManuIdasc", "HM_MANU_ID ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hmManuIddesc", "HM_MANU_ID DESC" ) // ORDER DESCENDING
		    ;
			    
			    table.addFilterBy( "equalhmDescription", "(HM_DESCRIPTION) = ?" ) // EQUAL

		         .addFilterBy( "notequalhmDescription", "(HM_DESCRIPTION) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhmDescription",
		      "(HM_DESCRIPTION IS NULL OR LENGTH((HM_DESCRIPTION)) IS NULL OR LENGTH((HM_DESCRIPTION)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhmDescription", "HM_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhmDescription", "HM_DESCRIPTION < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhmDescription", "HM_DESCRIPTION > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhmDescriptionMatch", "HM_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhmDescription",
		      "((HM_DESCRIPTION) = ? OR HM_DESCRIPTION IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhmDescription", "(HM_DESCRIPTION) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhmDescription", "(HM_DESCRIPTION) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hmDescriptionasc", "HM_DESCRIPTION ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hmDescriptiondesc", "HM_DESCRIPTION DESC" ) // ORDER DESCENDING
		    ;
	  }

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new HmHandsetManuDMLFactory(  );
	    }

	    return dml;
	  }
}