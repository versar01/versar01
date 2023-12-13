package com.eppixcomm.eppix.base.dml;



public class RicaVerificationAuditAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;
	  
	protected RicaVerificationAuditAbstractDMLFactory() throws DMLException {
		;
	    DMLTable table = defTable( "RicaVerificationAudit", // dmlName
	            "blo.RicaVerificationAuditDMO", // dmoName
	            "RICA_VERIFICATION_AUDIT", // tableName RicaPersonVerification
	            7, // numColumns
	            "RVA_SERIAL, RVA_RPV_SERIAL, RVA_RICA_STATUS, RVA_ACTION, RVA_DATETIME_ACTIONED, " +
	            "RVA_RICA_OFFICER, RVA_PROCESS_AGENT", // columnList
	            "RVA_SERIAL", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	            "RVA_SERIAL, RVA_RPV_SERIAL, RVA_RICA_STATUS, RVA_ACTION, RVA_DATETIME_ACTIONED, " +
	            "RVA_RICA_OFFICER, RVA_PROCESS_AGENT", // columnList
	            "", "",
	            new String[] {
	    		"RVA_SERIAL", "RVA_RPV_SERIAL", "RVA_RICA_STATUS", 
	    		"RVA_ACTION", "RVA_DATETIME_ACTIONED", "RVA_RICA_OFFICER", 
	    		"RVA_PROCESS_AGENT"
	            } );
	    table.addFilterBy( "equalrvaSerial", /* PK attribute */
	      "RVA_SERIAL = ?" )
	         .addFilterBy( "filterByrvaSerialMatch", "RVA_SERIAL LIKE ?" )
	         .addFilterBy( "INrvaSerial", "RVA_SERIAL IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaSerial", "RVA_SERIAL NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaSerial", "RVA_SERIAL != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaSerial", "RVA_SERIAL IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaSerial", "RVA_SERIAL IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaSerial", "RVA_SERIAL < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaSerial", "RVA_SERIAL > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaSerial", "RVA_SERIAL <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaSerial", "RVA_SERIAL >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaSerialMatch", "RVA_SERIAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaSerial", "RVA_SERIAL BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaSerial", "(RVA_SERIAL IS NULL OR RVA_SERIAL = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaSerial", "(RVA_SERIAL IS NULL OR RVA_SERIAL < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaSerial",
	      "(RVA_SERIAL IS NULL OR RVA_SERIAL > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaSerialasc", "RVA_SERIAL ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaSerialdesc", "RVA_SERIAL DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaRpvSerial", /* PK attribute */
	      "RVA_RPV_SERIAL = ?" )
	         .addFilterBy( "filterByrvaRpvSerialMatch", "RVA_RPV_SERIAL LIKE ?" )
	         .addFilterBy( "INrvaRpvSerial", "RVA_RPV_SERIAL IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaRpvSerial", "RVA_RPV_SERIAL NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaRpvSerial", "RVA_RPV_SERIAL != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaRpvSerial", "RVA_RPV_SERIAL IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaRpvSerial", "RVA_RPV_SERIAL IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaRpvSerial", "RVA_RPV_SERIAL < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaRpvSerial", "RVA_RPV_SERIAL > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaRpvSerial", "RVA_RPV_SERIAL <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaRpvSerial", "RVA_RPV_SERIAL >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaRpvSerialMatch", "RVA_RPV_SERIAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaRpvSerial", "RVA_RPV_SERIAL BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaRpvSerial", "(RVA_RPV_SERIAL IS NULL OR RVA_RPV_SERIAL = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaRpvSerial", "(RVA_RPV_SERIAL IS NULL OR RVA_RPV_SERIAL < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaRpvSerial",
	      "(RVA_RPV_SERIAL IS NULL OR RVA_RPV_SERIAL > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaRpvSerialasc", "RVA_RPV_SERIAL ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaRpvSerialdesc", "RVA_RPV_SERIAL DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaRicaStatus", /* PK attribute */
	      "RVA_RICA_STATUS = ?" )
	         .addFilterBy( "filterByrvaRicaStatusMatch", "RVA_RICA_STATUS LIKE ?" )
	         .addFilterBy( "INrvaRicaStatus", "RVA_RICA_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaRicaStatus", "RVA_RICA_STATUS NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaRicaStatus", "RVA_RICA_STATUS != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaRicaStatus", "RVA_RICA_STATUS IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaRicaStatus", "RVA_RICA_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaRicaStatus", "RVA_RICA_STATUS < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaRicaStatus", "RVA_RICA_STATUS > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaRicaStatus", "RVA_RICA_STATUS <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaRicaStatus", "RVA_RICA_STATUS >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaRicaStatusMatch", "RVA_RICA_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaRicaStatus", "RVA_RICA_STATUS BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaRicaStatus", "(RVA_RICA_STATUS IS NULL OR RVA_RICA_STATUS = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaRicaStatus", "(RVA_RICA_STATUS IS NULL OR RVA_RICA_STATUS < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaRicaStatus",
	      "(RVA_RICA_STATUS IS NULL OR RVA_RICA_STATUS > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaRicaStatusasc", "RVA_RICA_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaRicaStatusdesc", "RVA_RICA_STATUS DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaAction", /* PK attribute */
	      "RVA_ACTION = ?" )
	         .addFilterBy( "filterByrvaActionMatch", "RVA_ACTION LIKE ?" )
	         .addFilterBy( "INrvaAction", "RVA_ACTION IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaAction", "RVA_ACTION NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaAction", "RVA_ACTION != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaAction", "RVA_ACTION IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaAction", "RVA_ACTION IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaAction", "RVA_ACTION < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaAction", "RVA_ACTION > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaAction", "RVA_ACTION <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaAction", "RVA_ACTION >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaActionMatch", "RVA_ACTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaAction", "RVA_ACTION BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaAction", "(RVA_ACTION IS NULL OR RVA_ACTION = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaAction", "(RVA_ACTION IS NULL OR RVA_ACTION < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaAction",
	      "(RVA_ACTION IS NULL OR RVA_ACTION > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaActionasc", "RVA_ACTION ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaActiondesc", "RVA_ACTION DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaDatetimeActioned", /* PK attribute */
	      "RVA_DATETIME_ACTIONED = ?" )
	         .addFilterBy( "filterByrvaDatetimeActionedMatch", "RVA_DATETIME_ACTIONED LIKE ?" )
	         .addFilterBy( "INrvaDatetimeActioned", "RVA_DATETIME_ACTIONED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaDatetimeActioned", "RVA_DATETIME_ACTIONED NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaDatetimeActioned", "RVA_DATETIME_ACTIONED != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaDatetimeActioned", "RVA_DATETIME_ACTIONED IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaDatetimeActioned", "RVA_DATETIME_ACTIONED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaDatetimeActioned", "RVA_DATETIME_ACTIONED < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaDatetimeActioned", "RVA_DATETIME_ACTIONED > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaDatetimeActioned", "RVA_DATETIME_ACTIONED <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaDatetimeActioned", "RVA_DATETIME_ACTIONED >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaDatetimeActionedMatch", "RVA_DATETIME_ACTIONED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaDatetimeActioned", "RVA_DATETIME_ACTIONED BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaDatetimeActioned", "(RVA_DATETIME_ACTIONED IS NULL OR RVA_DATETIME_ACTIONED = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaDatetimeActioned", "(RVA_DATETIME_ACTIONED IS NULL OR RVA_DATETIME_ACTIONED < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaDatetimeActioned",
	      "(RVA_DATETIME_ACTIONED IS NULL OR RVA_DATETIME_ACTIONED > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaDatetimeActionedasc", "RVA_DATETIME_ACTIONED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaDatetimeActioneddesc", "RVA_DATETIME_ACTIONED DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaRicaOfficer", /* PK attribute */
	      "RVA_RICA_OFFICER = ?" )
	         .addFilterBy( "filterByrvaRicaOfficerMatch", "RVA_RICA_OFFICER LIKE ?" )
	         .addFilterBy( "INrvaRicaOfficer", "RVA_RICA_OFFICER IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaRicaOfficer", "RVA_RICA_OFFICER NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaRicaOfficer", "RVA_RICA_OFFICER != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaRicaOfficer", "RVA_RICA_OFFICER IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaRicaOfficer", "RVA_RICA_OFFICER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaRicaOfficer", "RVA_RICA_OFFICER < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaRicaOfficer", "RVA_RICA_OFFICER > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaRicaOfficer", "RVA_RICA_OFFICER <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaRicaOfficer", "RVA_RICA_OFFICER >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaRicaOfficerMatch", "RVA_RICA_OFFICER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaRicaOfficer", "RVA_RICA_OFFICER BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaRicaOfficer", "(RVA_RICA_OFFICER IS NULL OR RVA_RICA_OFFICER = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaRicaOfficer", "(RVA_RICA_OFFICER IS NULL OR RVA_RICA_OFFICER < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaRicaOfficer",
	      "(RVA_RICA_OFFICER IS NULL OR RVA_RICA_OFFICER > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaRicaOfficerasc", "RVA_RICA_OFFICER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaRicaOfficerdesc", "RVA_RICA_OFFICER DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrvaProcessAgent", /* PK attribute */
	      "RVA_PROCESS_AGENT = ?" )
	         .addFilterBy( "filterByrvaProcessAgentMatch", "RVA_PROCESS_AGENT LIKE ?" )
	         .addFilterBy( "INrvaProcessAgent", "RVA_PROCESS_AGENT IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrvaProcessAgent", "RVA_PROCESS_AGENT NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrvaProcessAgent", "RVA_PROCESS_AGENT != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrvaProcessAgent", "RVA_PROCESS_AGENT IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrvaProcessAgent", "RVA_PROCESS_AGENT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrvaProcessAgent", "RVA_PROCESS_AGENT < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrvaProcessAgent", "RVA_PROCESS_AGENT > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrvaProcessAgent", "RVA_PROCESS_AGENT <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrvaProcessAgent", "RVA_PROCESS_AGENT >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrvaProcessAgentMatch", "RVA_PROCESS_AGENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrvaProcessAgent", "RVA_PROCESS_AGENT BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrvaProcessAgent", "(RVA_PROCESS_AGENT IS NULL OR RVA_PROCESS_AGENT = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrvaProcessAgent", "(RVA_PROCESS_AGENT IS NULL OR RVA_PROCESS_AGENT < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrvaProcessAgent",
	      "(RVA_PROCESS_AGENT IS NULL OR RVA_PROCESS_AGENT > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rvaProcessAgentasc", "RVA_PROCESS_AGENT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rvaProcessAgentdesc", "RVA_PROCESS_AGENT DESC" ) // ORDER DESCENDING
	    ;
	    
	}

	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new RicaVerificationAuditDMLFactory(  );
	    }

	    return dml;
	  }

}