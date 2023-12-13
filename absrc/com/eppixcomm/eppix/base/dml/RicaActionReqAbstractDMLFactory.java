package com.eppixcomm.eppix.base.dml;

public class RicaActionReqAbstractDMLFactory extends BaseDMLFactory {
	
	private static DMLFactory dml = null;
	protected RicaActionReqAbstractDMLFactory() throws DMLException {
		;
		
	    DMLTable table = defTable( "RicaActionReq", // dmlName
	            "blo.RicaActionReqDMO", // dmoName
	            "RICA_ACTION_REQ", // tableName RicaActionReq
	            14, // numColumns
	            "RAR_FILE_ID, RAR_EPPIX_USER_ID, RAR_RICA_AGENT_ID, RAR_BILL_AC_NO, RAR_MSISDN_NO,RAR_SIM_NO, "+
	            "RAR_SUBSCRIBER_ID, RAR_STATUS, RAR_ACTION_TYPE, RAR_SUBMIT_DATE, RAR_COMMENTS,RAR_ERROR, "+
	            "RAR_TRICKLE_DESC, RAR_PROCESS_DATE", // columnList
	            "(RAR_FILE_ID)" + ", (RAR_MSISDN_NO)"+"(RAR_ACTION_TYPE)" + ", (RAR_SUBMIT_DATE)", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	            "RAR_FILE_ID, RAR_EPPIX_USER_ID, RAR_RICA_AGENT_ID, RAR_BILL_AC_NO, RAR_MSISDN_NO,RAR_SIM_NO, "+
	            "RAR_SUBSCRIBER_ID, RAR_STATUS, RAR_ACTION_TYPE, RAR_SUBMIT_DATE, RAR_COMMENTS,RAR_ERROR, "+
	            "RAR_TRICKLE_DESC, RAR_PROCESS_DATE", // columnList
	            "", "",
	            new String[] {
	            "RAR_FILE_ID","RAR_EPPIX_USER_ID","RAR_RICA_AGENT_ID","RAR_BILL_AC_NO","RAR_MSISDN_NO","RAR_SIM_NO",
	            "RAR_SUBSCRIBER_ID","RAR_STATUS","RAR_ACTION_TYPE","RAR_SUBMIT_DATE","RAR_COMMENTS","RAR_ERROR",
	            "RAR_TRICKLE_DESC","RAR_PROCESS_DATE"
	            } );

	    table.addFilterBy( "equalRarFileId", /* PK attribute */
	      "RAR_FILE_ID = ?" )
	         .addFilterBy( "filterByRarFileIdMatch", "RAR_FILE_ID LIKE ?" )
	         .addFilterBy( "INRarFileId", "RAR_FILE_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINRarFileId", "RAR_FILE_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalRarFileId", "RAR_FILE_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullRarFileId", "RAR_FILE_ID IS NULL" ) // IS NULL

	         .addFilterBy( "notnullRarFileId", "RAR_FILE_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanRarFileId", "RAR_FILE_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanRarFileId", "RAR_FILE_ID > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalRarFileId", "RAR_FILE_ID <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalRarFileId", "RAR_FILE_ID >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByRarFileIdMatch", "RAR_FILE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenRarFileId", "RAR_FILE_ID BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullRarFileId", "(RAR_FILE_ID IS NULL OR RAR_FILE_ID = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullRarFileId", "(RAR_FILE_ID IS NULL OR RAR_FILE_ID < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullRarFileId",
	      "(RAR_FILE_ID IS NULL OR RAR_FILE_ID > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "RarFileIdasc", "RAR_FILE_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "RarFileIddesc", "RAR_FILE_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalRarEppixUserId", /* PK attribute */
	      "RAR_EPPIX_USER_ID = ?" )
	         .addFilterBy( "filterByRarEppixUserIdMatch", "RAR_EPPIX_USER_ID LIKE ?" )
	         .addFilterBy( "INRarEppixUserId", "RAR_EPPIX_USER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINRarEppixUserId", "RAR_EPPIX_USER_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalRarEppixUserId", "RAR_EPPIX_USER_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullRarEppixUserId", "RAR_EPPIX_USER_ID IS NULL" ) // IS NULL

	         .addFilterBy( "notnullRarEppixUserId", "RAR_EPPIX_USER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanRarEppixUserId", "RAR_EPPIX_USER_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanRarEppixUserId", "RAR_EPPIX_USER_ID > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalRarEppixUserId", "RAR_EPPIX_USER_ID <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalRarEppixUserId", "RAR_EPPIX_USER_ID >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByRarEppixUserIdMatch", "RAR_EPPIX_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenRarEppixUserId", "RAR_EPPIX_USER_ID BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullRarEppixUserId", "(RAR_EPPIX_USER_ID IS NULL OR RAR_EPPIX_USER_ID = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullRarEppixUserId", "(RAR_EPPIX_USER_ID IS NULL OR RAR_EPPIX_USER_ID < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullRarEppixUserId",
	      "(RAR_EPPIX_USER_ID IS NULL OR RAR_EPPIX_USER_ID > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "RarEppixUserIdasc", "RAR_EPPIX_USER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "RarEppixUserIddesc", "RAR_EPPIX_USER_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    
	    table.addFilterBy( "equalRarRicaAgentId", /* PK attribute */
	      "RAR_RICA_AGENT_ID = ?" )
	         .addFilterBy( "filterByRarRicaAgentIdMatch", "RAR_RICA_AGENT_ID LIKE ?" )
	         .addFilterBy( "INRarRicaAgentId", "RAR_RICA_AGENT_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINRarRicaAgentId", "RAR_RICA_AGENT_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalRarRicaAgentId", "RAR_RICA_AGENT_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullRarRicaAgentId", "RAR_RICA_AGENT_ID IS NULL" ) // IS NULL

	         .addFilterBy( "notnullRarRicaAgentId", "RAR_RICA_AGENT_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanRarRicaAgentId", "RAR_RICA_AGENT_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanRarRicaAgentId", "RAR_RICA_AGENT_ID > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalRarRicaAgentId", "RAR_RICA_AGENT_ID <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalRarRicaAgentId", "RAR_RICA_AGENT_ID >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByRarRicaAgentIdMatch", "RAR_RICA_AGENT_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenRarRicaAgentId", "RAR_RICA_AGENT_ID BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullRarRicaAgentId", "(RAR_RICA_AGENT_ID IS NULL OR RAR_RICA_AGENT_ID = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullRarRicaAgentId", "(RAR_RICA_AGENT_ID IS NULL OR RAR_RICA_AGENT_ID < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullRarRicaAgentId",
	      "(RAR_RICA_AGENT_ID IS NULL OR RAR_RICA_AGENT_ID > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "RarRicaAgentIdasc", "RAR_RICA_AGENT_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "RarRicaAgentIddesc", "RAR_RICA_AGENT_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalRarBillAcNo", /* PK attribute */
		      "RAR_BILL_AC_NO = ?" )
			 .addFilterBy( "filterByRarBillAcNoMatch", "RAR_BILL_AC_NO LIKE ?" )
			 .addFilterBy( "INRarBillAcNo", "RAR_BILL_AC_NO IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarBillAcNo", "RAR_BILL_AC_NO NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarBillAcNo", "RAR_BILL_AC_NO != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarBillAcNo", "RAR_BILL_AC_NO IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarBillAcNo", "RAR_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarBillAcNo", "RAR_BILL_AC_NO < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarBillAcNo", "RAR_BILL_AC_NO > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarBillAcNo", "RAR_BILL_AC_NO <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarBillAcNo", "RAR_BILL_AC_NO >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarBillAcNoMatch", "RAR_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarBillAcNo", "RAR_BILL_AC_NO BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarBillAcNo", "(RAR_BILL_AC_NO IS NULL OR RAR_BILL_AC_NO = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarBillAcNo", "(RAR_BILL_AC_NO IS NULL OR RAR_BILL_AC_NO < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarBillAcNo",
		      "(RAR_BILL_AC_NO IS NULL OR RAR_BILL_AC_NO > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarBillAcNoasc", "RAR_BILL_AC_NO ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarBillAcNodesc", "RAR_BILL_AC_NO DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalRarMsisdnNo", /* PK attribute */
		      "RAR_MSISDN_NO = ?" )
			 .addFilterBy( "filterByRarMsisdnNoMatch", "RAR_MSISDN_NO LIKE ?" )
			 .addFilterBy( "INRarMsisdnNo", "RAR_MSISDN_NO IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarMsisdnNo", "RAR_MSISDN_NO NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarMsisdnNo", "RAR_MSISDN_NO != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarMsisdnNo", "RAR_MSISDN_NO IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarMsisdnNo", "RAR_MSISDN_NO IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarMsisdnNo", "RAR_MSISDN_NO < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarMsisdnNo", "RAR_MSISDN_NO > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarMsisdnNo", "RAR_MSISDN_NO <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarMsisdnNo", "RAR_MSISDN_NO >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarMsisdnNoMatch", "RAR_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarMsisdnNo", "RAR_MSISDN_NO BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarMsisdnNo", "(RAR_MSISDN_NO IS NULL OR RAR_MSISDN_NO = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarMsisdnNo", "(RAR_MSISDN_NO IS NULL OR RAR_MSISDN_NO < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarMsisdnNo",
		      "(RAR_MSISDN_NO IS NULL OR RAR_MSISDN_NO > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarMsisdnNoasc", "RAR_MSISDN_NO ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarMsisdnNodesc", "RAR_MSISDN_NO DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalRarSimNo", /* PK attribute */
		      "RAR_SIM_NO = ?" )
			 .addFilterBy( "filterByRarSimNoMatch", "RAR_SIM_NO LIKE ?" )
			 .addFilterBy( "INRarSimNo", "RAR_SIM_NO IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarSimNo", "RAR_SIM_NO NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarSimNo", "RAR_SIM_NO != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarSimNo", "RAR_SIM_NO IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarSimNo", "RAR_SIM_NO IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarSimNo", "RAR_SIM_NO < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarSimNo", "RAR_SIM_NO > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarSimNo", "RAR_SIM_NO <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarSimNo", "RAR_SIM_NO >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarSimNoMatch", "RAR_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarSimNo", "RAR_SIM_NO BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarSimNo", "(RAR_SIM_NO IS NULL OR RAR_SIM_NO = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarSimNo", "(RAR_SIM_NO IS NULL OR RAR_SIM_NO < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarSimNo",
		      "(RAR_SIM_NO IS NULL OR RAR_SIM_NO > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarSimNoasc", "RAR_SIM_NO ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarSimNodesc", "RAR_SIM_NO DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalRarSubscriberId", /* PK attribute */
		      "RAR_SUBSCRIBER_ID = ?" )
			 .addFilterBy( "filterByRarSubscriberIdMatch", "RAR_SUBSCRIBER_ID LIKE ?" )
			 .addFilterBy( "INRarSubscriberId", "RAR_SUBSCRIBER_ID IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarSubscriberId", "RAR_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarSubscriberId", "RAR_SUBSCRIBER_ID != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarSubscriberId", "RAR_SUBSCRIBER_ID IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarSubscriberId", "RAR_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarSubscriberId", "RAR_SUBSCRIBER_ID < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarSubscriberId", "RAR_SUBSCRIBER_ID > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarSubscriberId", "RAR_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarSubscriberId", "RAR_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarSubscriberIdMatch", "RAR_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarSubscriberId", "RAR_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarSubscriberId", "(RAR_SUBSCRIBER_ID IS NULL OR RAR_SUBSCRIBER_ID = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarSubscriberId", "(RAR_SUBSCRIBER_ID IS NULL OR RAR_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarSubscriberId",
		      "(RAR_SUBSCRIBER_ID IS NULL OR RAR_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarSubscriberIdasc", "RAR_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarSubscriberIddesc", "RAR_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalRarStatus", /* PK attribute */
		      "RAR_STATUS = ?" )
			 .addFilterBy( "filterByRarStatusMatch", "RAR_STATUS LIKE ?" )
			 .addFilterBy( "INRarStatus", "RAR_STATUS IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarStatus", "RAR_STATUS NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarStatus", "RAR_STATUS != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarStatus", "RAR_STATUS IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarStatus", "RAR_STATUS IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarStatus", "RAR_STATUS < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarStatus", "RAR_STATUS > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarStatus", "RAR_STATUS <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarStatus", "RAR_STATUS >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarStatusMatch", "RAR_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarStatus", "RAR_STATUS BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarStatus", "(RAR_STATUS IS NULL OR RAR_STATUS = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarStatus", "(RAR_STATUS IS NULL OR RAR_STATUS < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarStatus",
		      "(RAR_STATUS IS NULL OR RAR_STATUS > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarStatusasc", "RAR_STATUS ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarStatusdesc", "RAR_STATUS DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalRarActionType", /* PK attribute */
		    "RAR_ACTION_TYPE = ?" )
			 .addFilterBy( "filterByRarActionTypeMatch", "RAR_ACTION_TYPE LIKE ?" )
			 .addFilterBy( "INRarActionType", "RAR_ACTION_TYPE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarActionType", "RAR_ACTION_TYPE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarActionType", "RAR_ACTION_TYPE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarActionType", "RAR_ACTION_TYPE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarActionType", "RAR_ACTION_TYPE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarActionType", "RAR_ACTION_TYPE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarActionType", "RAR_ACTION_TYPE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarActionType", "RAR_ACTION_TYPE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarActionType", "RAR_ACTION_TYPE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarActionTypeMatch", "RAR_ACTION_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarActionType", "RAR_ACTION_TYPE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarActionType", "(RAR_ACTION_TYPE IS NULL OR RAR_ACTION_TYPE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarActionType", "(RAR_ACTION_TYPE IS NULL OR RAR_ACTION_TYPE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarActionType",
		      "(RAR_ACTION_TYPE IS NULL OR RAR_ACTION_TYPE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarActionTypeasc", "RAR_ACTION_TYPE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarActionTypedesc", "RAR_ACTION_TYPE DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalRarSubmitDate", /* PK attribute */
		      "RAR_SUBMIT_DATE = ?" )
			 .addFilterBy( "filterByRarSubmitDateMatch", "RAR_SUBMIT_DATE LIKE ?" )
			 .addFilterBy( "INRarSubmitDate", "RAR_SUBMIT_DATE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarSubmitDate", "RAR_SUBMIT_DATE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarSubmitDate", "RAR_SUBMIT_DATE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarSubmitDate", "RAR_SUBMIT_DATE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarSubmitDate", "RAR_SUBMIT_DATE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarSubmitDate", "RAR_SUBMIT_DATE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarSubmitDate", "RAR_SUBMIT_DATE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarSubmitDate", "RAR_SUBMIT_DATE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarSubmitDate", "RAR_SUBMIT_DATE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarSubmitDateMatch", "RAR_SUBMIT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarSubmitDate", "RAR_SUBMIT_DATE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarSubmitDate", "(RAR_SUBMIT_DATE IS NULL OR RAR_SUBMIT_DATE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarSubmitDate", "(RAR_SUBMIT_DATE IS NULL OR RAR_SUBMIT_DATE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarSubmitDate",
		      "(RAR_SUBMIT_DATE IS NULL OR RAR_SUBMIT_DATE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarSubmitDateasc", "RAR_SUBMIT_DATE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarSubmitDatedesc", "RAR_SUBMIT_DATE DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalRarComments", /* PK attribute */
		      "RAR_COMMENTS = ?" )
			 .addFilterBy( "filterByRarCommentsMatch", "RAR_COMMENTS LIKE ?" )
			 .addFilterBy( "INRarComments", "RAR_COMMENTS IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarComments", "RAR_COMMENTS NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarComments", "RAR_COMMENTS != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarComments", "RAR_COMMENTS IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarComments", "RAR_COMMENTS IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarComments", "RAR_COMMENTS < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarComments", "RAR_COMMENTS > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarComments", "RAR_COMMENTS <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarComments", "RAR_COMMENTS >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarCommentsMatch", "RAR_COMMENTS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarComments", "RAR_COMMENTS BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarComments", "(RAR_COMMENTS IS NULL OR RAR_COMMENTS = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarComments", "(RAR_COMMENTS IS NULL OR RAR_COMMENTS < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarComments",
		      "(RAR_COMMENTS IS NULL OR RAR_COMMENTS > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarCommentsasc", "RAR_COMMENTS ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarCommentsdesc", "RAR_COMMENTS DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalRarError", /* PK attribute */
		      "RAR_ERROR = ?" )
			 .addFilterBy( "filterByRarErrorMatch", "RAR_ERROR LIKE ?" )
			 .addFilterBy( "INRarError", "RAR_ERROR IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarError", "RAR_ERROR NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarError", "RAR_ERROR != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarError", "RAR_ERROR IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarError", "RAR_ERROR IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarError", "RAR_ERROR < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarError", "RAR_ERROR > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarError", "RAR_ERROR <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarError", "RAR_ERROR >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarErrorMatch", "RAR_ERROR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarError", "RAR_ERROR BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarError", "(RAR_ERROR IS NULL OR RAR_ERROR = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarError", "(RAR_ERROR IS NULL OR RAR_ERROR < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarError",
		      "(RAR_ERROR IS NULL OR RAR_ERROR > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarErrorasc", "RAR_ERROR ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarErrordesc", "RAR_ERROR DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalRarTrickleDesc", /* PK attribute */
		      "RAR_TRICKLE_DESC = ?" )
			 .addFilterBy( "filterByRarTrickleDescMatch", "RAR_TRICKLE_DESC LIKE ?" )
			 .addFilterBy( "INRarTrickleDesc", "RAR_TRICKLE_DESC IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINRarTrickleDesc", "RAR_TRICKLE_DESC NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalRarTrickleDesc", "RAR_TRICKLE_DESC != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullRarTrickleDesc", "RAR_TRICKLE_DESC IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullRarTrickleDesc", "RAR_TRICKLE_DESC IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanRarTrickleDesc", "RAR_TRICKLE_DESC < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanRarTrickleDesc", "RAR_TRICKLE_DESC > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalRarTrickleDesc", "RAR_TRICKLE_DESC <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalRarTrickleDesc", "RAR_TRICKLE_DESC >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByRarTrickleDescMatch", "RAR_TRICKLE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenRarTrickleDesc", "RAR_TRICKLE_DESC BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullRarTrickleDesc", "(RAR_TRICKLE_DESC IS NULL OR RAR_TRICKLE_DESC = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullRarTrickleDesc", "(RAR_TRICKLE_DESC IS NULL OR RAR_TRICKLE_DESC < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullRarTrickleDesc",
		      "(RAR_TRICKLE_DESC IS NULL OR RAR_TRICKLE_DESC > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "RarTrickleDescasc", "RAR_TRICKLE_DESC ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "RarTrickleDescdesc", "RAR_TRICKLE_DESC DESC" ) // ORDER DESCENDING
	    ;
	    
	    
	    
	    defStaticQuery(
	     			"rarTrickleDescrarStatusInnerSelect",//dmlName, 
	     			".base.blo.RicaActionReqDMO",//dmoName, 
	     			"SELECT FIRST 2000 * FROM RICA_ACTION_REQ" +
	     			" WHERE RAR_STATUS IN ( ? )" +
	     			" AND (RAR_STATUS <> RAR_TRICKLE_DESC[1,1]" +
	     			" OR RAR_TRICKLE_DESC[1,1] is null)" + 
	     			" ORDER BY RAR_FILE_ID,RAR_MSISDN_NO",//selectStmt, 
	     			false);//isMultiRow);

	     	/*
				SELECT * FROM RICA_PERSON_VERIFICATION
				WHERE RPV_RICA_STATUS IN ( 'R','D','T' )
				AND (RPV_RICA_STATUS <> RPV_TRICKLE_DESC[1,1]
				OR RPV_TRICKLE_DESC[1,1] is null)
				ORDER BY RPV_MSISDN_NO, RAR_FILE_ID
	     	 * */
		
	}


	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new RicaActionReqDMLFactory(  );
	    }

	    return dml;
	  }

}
