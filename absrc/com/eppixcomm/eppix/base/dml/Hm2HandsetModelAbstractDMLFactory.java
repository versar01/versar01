package com.eppixcomm.eppix.base.dml;


public class Hm2HandsetModelAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;
	
	protected Hm2HandsetModelAbstractDMLFactory() throws DMLException {

		 DMLTable table = defTable( "Hm2HandsetModel", // dmlName
			        "blo.Hm2HandsetModelDMO", // dmoName
			        "Hm2_Handset_Model", // tableName
			        4, // numColumns
			        "HM2_MODEL_ID, HM2_MANU_ID, HM2_MODEL, HM2_ACTIVE_IND", // columnList
			        "HM2_MODEL_ID", //primaryKey
			        "" // versionCol     
			      , false, // generatedKey
			        "HM2_MODEL_ID, HM2_MANU_ID, HM2_MODEL, HM2_ACTIVE_IND",
			        "", "",
			        new String[] {
			          "HM2_MODEL_ID", "HM2_MANU_ID", "HM2_MODEL", "HM2_ACTIVE_IND"
			        }, true );
			    ;
			    
			    table.addFilterBy( "equalhm2ModelId", "(HM2_MODEL_ID) = ?" ) // EQUAL

		         .addFilterBy( "notequalhm2ModelId", "(HM2_MODEL_ID) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhm2ModelId",
		      "(HM2_MODEL_ID IS NULL OR LENGTH((HM2_MODEL_ID)) IS NULL OR LENGTH((HM2_MODEL_ID)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhm2ModelId", "HM2_MODEL_ID IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhm2ModelId", "HM2_MODEL_ID < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhm2ModelId", "HM2_MODEL_ID > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhm2ModelIdMatch", "HM2_MODEL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhm2ModelId",
		      "((HM2_MODEL_ID) = ? OR HM2_MODEL_ID IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhm2ModelId", "(HM2_MODEL_ID) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhm2ModelId", "(HM2_MODEL_ID) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hm2ModelIdasc", "HM2_MODEL_ID ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hm2ModelIddesc", "HM2_MODEL_ID DESC" ) // ORDER DESCENDING
		      ;
			    
			    table.addFilterBy( "equalhm2ManuId", "(HM2_MODEL_ID) = ?" ) // EQUAL

		         .addFilterBy( "notequalhm2ManuId", "(HM2_MODEL_ID) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhm2ManuId",
		      "(HM2_MODEL_ID IS NULL OR LENGTH((HM2_MODEL_ID)) IS NULL OR LENGTH((HM2_MODEL_ID)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhm2ManuId", "HM2_MODEL_ID IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhm2ManuId", "HM2_MODEL_ID < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhm2ManuId", "HM2_MODEL_ID > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhm2ManuIdMatch", "HM2_MODEL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhm2ManuId",
		      "((HM2_MODEL_ID) = ? OR HM2_MODEL_ID IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhm2ManuId", "(HM2_MODEL_ID) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhm2ManuId", "(HM2_MODEL_ID) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hm2ManuIdasc", "HM2_MODEL_ID ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hm2ManuIddesc", "HM2_MODEL_ID DESC" ) // ORDER DESCENDING
		    ;
			    
			    table.addFilterBy( "equalhm2Model", "(HM2_MODEL) = ?" ) // EQUAL

		         .addFilterBy( "notequalhm2Model", "(HM2_MODEL) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhm2Model",
		      "(HM2_MODEL IS NULL OR LENGTH((HM2_MODEL)) IS NULL OR LENGTH((HM2_MODEL)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhm2Model", "HM2_MODEL IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhm2Model", "HM2_MODEL < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhm2Model", "HM2_MODEL > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhm2ModelMatch", "HM2_MODEL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhm2Model",
		      "((HM2_MODEL) = ? OR HM2_MODEL IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhm2Model", "(HM2_MODEL) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhm2Model", "(HM2_MODEL) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hm2Modelasc", "HM2_MODEL ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hm2Modeldesc", "HM2_MODEL DESC" ) // ORDER DESCENDING
		    ;
			    
			    table.addFilterBy( "equalhm2ActiveInd", "(HM2_ACTIVE_IND) = ?" ) // EQUAL

		         .addFilterBy( "notequalhm2ActiveInd", "(HM2_ACTIVE_IND) != ?" ) // NOTEQUAL

		         .addFilterBy( "nullhm2ActiveInd",
		      "(HM2_ACTIVE_IND IS NULL OR LENGTH((HM2_ACTIVE_IND)) IS NULL OR LENGTH((HM2_ACTIVE_IND)) = 0)" ) // IS NULL

		         .addFilterBy( "notnullhm2ActiveInd", "HM2_ACTIVE_IND IS NOT NULL" ) // IS NOT NULL

		         .addFilterBy( "lessthanhm2ActiveInd", "HM2_ACTIVE_IND < ?" ) // LESS THAN

		         .addFilterBy( "greaterthanhm2ActiveInd", "HM2_ACTIVE_IND > ?" ) // GREATER THAN

		         .addFilterBy( "filterByhm2ActiveIndMatch", "HM2_ACTIVE_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

		         .addFilterBy( "equalornullhm2ActiveInd",
		      "((HM2_ACTIVE_IND) = ? OR HM2_ACTIVE_IND IS NULL)" ) // EQUALORNULL

		         .addFilterBy( "INhm2ActiveInd", "(HM2_ACTIVE_IND) IN ( ? )" ) // IN

		         .addFilterBy( "NOTINhm2ActiveInd", "(HM2_ACTIVE_IND) NOT IN ( ? )" ) // NOT IN

		         .addOrderBy( "hm2ActiveIndasc", "HM2_ACTIVE_IND ASC" ) // ORDER ASCENDING

		         .addOrderBy( "hm2ActiveInddesc", "HM2_ACTIVE_IND DESC" ) // ORDER DESCENDING
		    ;

	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new Hm2HandsetModelDMLFactory(  );
	    }

	    return dml;
	  }
	


	
}