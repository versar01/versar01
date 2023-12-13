package com.eppixcomm.eppix.base.dml;



public class RicaPersonVerificationAbstractDMLFactory extends BaseDMLFactory {

	private static DMLFactory dml = null;
	  
	protected RicaPersonVerificationAbstractDMLFactory() throws DMLException {
		;
		
	    DMLTable table = defTable( "RicaPersonVerification", // dmlName
	            "blo.RicaPersonVerificationDMO", // dmoName
	            "RICA_PERSON_VERIFICATION", // tableName RicaPersonVerification
	            26, // numColumns
	            "RPV_SERIAL, RPV_CUSTOMER_TYPE, RPV_ID_PASSPORT_NO, RPV_ID_TYPE, RPV_COUNTRY_CODE, " +
	            "RPV_ACC_NO, RPV_RICA_STATUS, RPV_FIRSTNAMES, RPV_SURNAME, RPV_REGISTRATION, " +
	            "RPV_ADDRESS_LINE1, RPV_ADDRESS_LINE2, RPV_ADDRESS_LINE3, RPV_POSTAL_CODE, " +
	            "RPV_SUBURB, RPV_CITY_TOWN, RPV_BUSINESS_NAME, RPV_BADDRESS_LINE1, RPV_BADDRESS_LINE2, " +
	            "RPV_BADDRESS_LINE3, RPV_BPOSTAL_CODE, RPV_BSUBURB, RPV_BCITY_TOWN, RPV_MSISDN_NO, " +
	            "RPV_DATETIME_ACTIONED, RPV_TRICKLE_DESC", // columnList
	            "RPV_SERIAL", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	          "RPV_SERIAL, RPV_CUSTOMER_TYPE, RPV_ID_PASSPORT_NO, RPV_ID_TYPE, RPV_COUNTRY_CODE, " +
	            "RPV_ACC_NO, RPV_RICA_STATUS, RPV_FIRSTNAMES, RPV_SURNAME, RPV_REGISTRATION, " +
	            "RPV_ADDRESS_LINE1, RPV_ADDRESS_LINE2, RPV_ADDRESS_LINE3, RPV_POSTAL_CODE, " +
	            "RPV_SUBURB, RPV_CITY_TOWN, RPV_BUSINESS_NAME, RPV_BADDRESS_LINE1, RPV_BADDRESS_LINE2, " +
	            "RPV_BADDRESS_LINE3, RPV_BPOSTAL_CODE, RPV_BSUBURB, RPV_BCITY_TOWN, RPV_MSISDN_NO, " +
	            "RPV_DATETIME_ACTIONED, RPV_TRICKLE_DESC", // columnList
	            "", "",
	            new String[] {
	    		"RPV_SERIAL", "RPV_CUSTOMER_TYPE", "RPV_ID_PASSPORT_NO", 
	    		"RPV_ID_TYPE", "RPV_COUNTRY_CODE", "RPV_ACC_NO", 
	    		"RPV_RICA_STATUS", "RPV_FIRSTNAMES", "RPV_SURNAME", 
	    		"RPV_REGISTRATION", "RPV_ADDRESS_LINE1", "RPV_ADDRESS_LINE2", 
	    		"RPV_ADDRESS_LINE3", "RPV_POSTAL_CODE", "RPV_SUBURB", 
	    		"RPV_CITY_TOWN", "RPV_BUSINESS_NAME", "RPV_BADDRESS_LINE1", 
	    		"RPV_BADDRESS_LINE2", "RPV_BADDRESS_LINE3", "RPV_BPOSTAL_CODE", 
	    		"RPV_BSUBURB", "RPV_BCITY_TOWN", "RPV_MSISDN_NO", 
	    		"RPV_DATETIME_ACTIONED", "RPV_TRICKLE_DESC"
	            } );

	    table.addFilterBy( "equalRpvSerial", /* PK attribute */
	      "RPV_SERIAL = ?" )
	         .addFilterBy( "filterByrpvSerialMatch", "RPV_SERIAL LIKE ?" )
	         .addFilterBy( "INrpvSerial", "RPV_SERIAL IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvSerial", "RPV_SERIAL NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvSerial", "RPV_SERIAL != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvSerial", "RPV_SERIAL IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvSerial", "RPV_SERIAL IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvSerial", "RPV_SERIAL < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvSerial", "RPV_SERIAL > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvSerial", "RPV_SERIAL <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvSerial", "RPV_SERIAL >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvSerialMatch", "RPV_SERIAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvSerial", "RPV_SERIAL BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvSerial", "(RPV_SERIAL IS NULL OR RPV_SERIAL = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvSerial", "(RPV_SERIAL IS NULL OR RPV_SERIAL < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvSerial",
	      "(RPV_SERIAL IS NULL OR RPV_SERIAL > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvSerialasc", "RPV_SERIAL ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvSerialdesc", "RPV_SERIAL DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalRpvCustomerType", /* PK attribute */
	      "RPV_CUSTOMER_TYPE = ?" )
	         .addFilterBy( "filterByrpvCustomerTypeMatch", "RPV_CUSTOMER_TYPE LIKE ?" )
	         .addFilterBy( "INrpvCustomerType", "RPV_CUSTOMER_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvCustomerType", "RPV_CUSTOMER_TYPE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvCustomerType", "RPV_CUSTOMER_TYPE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvCustomerType", "RPV_CUSTOMER_TYPE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvCustomerType", "RPV_CUSTOMER_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvCustomerType", "RPV_CUSTOMER_TYPE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvCustomerType", "RPV_CUSTOMER_TYPE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvCustomerType", "RPV_CUSTOMER_TYPE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvCustomerType", "RPV_CUSTOMER_TYPE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvCustomerTypeMatch", "RPV_CUSTOMER_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvCustomerType", "RPV_CUSTOMER_TYPE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvCustomerType", "(RPV_CUSTOMER_TYPE IS NULL OR RPV_CUSTOMER_TYPE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvCustomerType", "(RPV_CUSTOMER_TYPE IS NULL OR RPV_CUSTOMER_TYPE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvCustomerType",
	      "(RPV_CUSTOMER_TYPE IS NULL OR RPV_CUSTOMER_TYPE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvCustomerTypeasc", "RPV_CUSTOMER_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvCustomerTypedesc", "RPV_CUSTOMER_TYPE DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalRpvIdPassportNo", /* PK attribute */
	      "RPV_ID_PASSPORT_NO = ?" )
	         .addFilterBy( "filterByRpvIdPassportNoMatch", "RPV_ID_PASSPORT_NO LIKE ?" )
	         .addFilterBy( "INrpvIdPassportNo", "RPV_ID_PASSPORT_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvIdPassportNo", "RPV_ID_PASSPORT_NO NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvIdPassportNo", "RPV_ID_PASSPORT_NO != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvIdPassportNo", "RPV_ID_PASSPORT_NO IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvIdPassportNo", "RPV_ID_PASSPORT_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvIdPassportNo", "RPV_ID_PASSPORT_NO < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvIdPassportNo", "RPV_ID_PASSPORT_NO > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvIdPassportNo", "RPV_ID_PASSPORT_NO <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvIdPassportNo", "RPV_ID_PASSPORT_NO >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvIdPassportNoMatch", "RPV_ID_PASSPORT_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvIdPassportNo", "RPV_ID_PASSPORT_NO BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvIdPassportNo", "(RPV_ID_PASSPORT_NO IS NULL OR RPV_ID_PASSPORT_NO = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvIdPassportNo", "(RPV_ID_PASSPORT_NO IS NULL OR RPV_ID_PASSPORT_NO < ?)" ) // LESSTHANORNULL

	         .addFilterBy("notnullrpvIdPassport", "RPV_ID_PASSPORT_NO IS NOT NULL") // NOT NULL
	         
	         .addFilterBy("equalornullrpvIdPassport", "(RPV_ID_PASSPORT_NO IS NOT NULL AND RPV_ID_PASSPORT_NO = ?)")
	         
	         .addFilterBy("notequalrpvIdPassport", "RPV_ID_PASSPORT_NO <> ?")
	         
	         .addFilterBy( "greaterthanornullrpvIdPassportNo",
	      "(RPV_ID_PASSPORT_NO IS NULL OR RPV_ID_PASSPORT_NO > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvIdPassportNoasc", "RPV_ID_PASSPORT_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvIdPassportNodesc", "RPV_ID_PASSPORT_NO DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalRpvIdType", /* PK attribute */
	      "RPV_ID_TYPE = ?" )
	         .addFilterBy( "filterByRpvIdTypeMatch", "RPV_ID_TYPE LIKE ?" )
	         .addFilterBy( "INrpvIdType", "RPV_ID_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvIdType", "RPV_ID_TYPE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvIdType", "RPV_ID_TYPE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvIdType", "RPV_ID_TYPE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvIdType", "RPV_ID_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvIdType", "RPV_ID_TYPE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvIdType", "RPV_ID_TYPE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvIdType", "RPV_ID_TYPE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvIdType", "RPV_ID_TYPE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvIdTypeMatch", "RPV_ID_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvIdType", "RPV_ID_TYPE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvIdType", "(RPV_ID_TYPE IS NULL OR RPV_ID_TYPE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvIdType", "(RPV_ID_TYPE IS NULL OR RPV_ID_TYPE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvIdType",
	      "(RPV_ID_TYPE IS NULL OR RPV_ID_TYPE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvIdTypeasc", "RPV_ID_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvIdTypedesc", "RPV_ID_TYPE DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvCountryCode", /* PK attribute */
	      "RPV_COUNTRY_CODE = ?" )
	         .addFilterBy( "filterByrpvCountryCodeMatch", "RPV_COUNTRY_CODE LIKE ?" )
	         .addFilterBy( "INrpvCountryCode", "RPV_COUNTRY_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvCountryCode", "RPV_COUNTRY_CODE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvCountryCode", "RPV_COUNTRY_CODE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvCountryCode", "RPV_COUNTRY_CODE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvCountryCode", "RPV_COUNTRY_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvCountryCode", "RPV_COUNTRY_CODE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvCountryCode", "RPV_COUNTRY_CODE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvCountryCode", "RPV_COUNTRY_CODE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvCountryCode", "RPV_COUNTRY_CODE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvCountryCodeMatch", "RPV_COUNTRY_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvCountryCode", "RPV_COUNTRY_CODE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvCountryCode", "(RPV_COUNTRY_CODE IS NULL OR RPV_COUNTRY_CODE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvCountryCode", "(RPV_COUNTRY_CODE IS NULL OR RPV_COUNTRY_CODE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvCountryCode",
	      "(RPV_COUNTRY_CODE IS NULL OR RPV_COUNTRY_CODE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvCountryCodeasc", "RPV_COUNTRY_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvCountryCodedesc", "RPV_COUNTRY_CODE DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvAccNo", /* PK attribute */
	      "RPV_ACC_NO = ?" )
	         .addFilterBy( "filterByrpvAccNoMatch", "RPV_ACC_NO LIKE ?" )
	         .addFilterBy( "INrpvAccNo", "RPV_ACC_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvAccNo", "RPV_ACC_NO NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvAccNo", "RPV_ACC_NO != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvAccNo", "RPV_ACC_NO IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvAccNo", "RPV_ACC_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvAccNo", "RPV_ACC_NO < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvAccNo", "RPV_ACC_NO > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvAccNo", "RPV_ACC_NO <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvAccNo", "RPV_ACC_NO >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvAccNoMatch", "RPV_ACC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvAccNo", "RPV_ACC_NO BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvAccNo", "(RPV_ACC_NO IS NULL OR RPV_ACC_NO = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvAccNo", "(RPV_ACC_NO IS NULL OR RPV_ACC_NO < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvAccNo",
	      "(RPV_ACC_NO IS NULL OR RPV_ACC_NO > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvAccNoasc", "RPV_ACC_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvAccNodesc", "RPV_ACC_NO DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvRicaStatus", /* PK attribute */
	      "RPV_RICA_STATUS = ?" )
	         .addFilterBy( "filterByrpvRicaStatusMatch", "RPV_RICA_STATUS LIKE ?" )
	         .addFilterBy( "INrpvRicaStatus", "RPV_RICA_STATUS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvRicaStatus", "RPV_RICA_STATUS NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvRicaStatus", "RPV_RICA_STATUS != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvRicaStatus", "RPV_RICA_STATUS IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvRicaStatus", "RPV_RICA_STATUS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvRicaStatus", "RPV_RICA_STATUS < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvRicaStatus", "RPV_RICA_STATUS > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvRicaStatus", "RPV_RICA_STATUS <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvRicaStatus", "RPV_RICA_STATUS >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvRicaStatusMatch", "RPV_RICA_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvRicaStatus", "RPV_RICA_STATUS BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvRicaStatus", "(RPV_RICA_STATUS IS NULL OR RPV_RICA_STATUS = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvRicaStatus", "(RPV_RICA_STATUS IS NULL OR RPV_RICA_STATUS < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvRicaStatus",
	      "(RPV_RICA_STATUS IS NULL OR RPV_RICA_STATUS > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvRicaStatusasc", "RPV_RICA_STATUS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvRicaStatusdesc", "RPV_RICA_STATUS DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvFirstnames", /* PK attribute */
	      "RPV_FIRSTNAMES = ?" )
	         .addFilterBy( "filterByrpvFirstnamesMatch", "RPV_FIRSTNAMES LIKE ?" )
	         .addFilterBy( "INrpvFirstnames", "RPV_FIRSTNAMES IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvFirstnames", "RPV_FIRSTNAMES NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvFirstnames", "RPV_FIRSTNAMES != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvFirstnames", "RPV_FIRSTNAMES IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvFirstnames", "RPV_FIRSTNAMES IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvFirstnames", "RPV_FIRSTNAMES < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvFirstnames", "RPV_FIRSTNAMES > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvFirstnames", "RPV_FIRSTNAMES <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvFirstnames", "RPV_FIRSTNAMES >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvFirstnamesMatch", "RPV_FIRSTNAMES LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvFirstnames", "RPV_FIRSTNAMES BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvFirstnames", "(RPV_FIRSTNAMES IS NULL OR RPV_FIRSTNAMES = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvFirstnames", "(RPV_FIRSTNAMES IS NULL OR RPV_FIRSTNAMES < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvFirstnames",
	      "(RPV_FIRSTNAMES IS NULL OR RPV_FIRSTNAMES > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvFirstnamesasc", "RPV_FIRSTNAMES ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvFirstnamesdesc", "RPV_FIRSTNAMES DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvSurname", /* PK attribute */
	      "RPV_SURNAME = ?" )
	         .addFilterBy( "filterByrpvSurnameMatch", "RPV_SURNAME LIKE ?" )
	         .addFilterBy( "INrpvSurname", "RPV_SURNAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvSurname", "RPV_SURNAME NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvSurname", "RPV_SURNAME != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvSurname", "RPV_SURNAME IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvSurname", "RPV_SURNAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvSurname", "RPV_SURNAME < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvSurname", "RPV_SURNAME > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvSurname", "RPV_SURNAME <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvSurname", "RPV_SURNAME >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvSurnameMatch", "RPV_SURNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvSurname", "RPV_SURNAME BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvSurname", "(RPV_SURNAME IS NULL OR RPV_SURNAME = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvSurname", "(RPV_SURNAME IS NULL OR RPV_SURNAME < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvSurname",
	      "(RPV_SURNAME IS NULL OR RPV_SURNAME > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvSurnameasc", "RPV_SURNAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvSurnamedesc", "RPV_SURNAME DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvRegistration", /* PK attribute */
	      "RPV_REGISTRATION = ?" )
	         .addFilterBy( "filterByrpvRegistrationMatch", "RPV_REGISTRATION LIKE ?" )
	         .addFilterBy( "INrpvRegistration", "RPV_REGISTRATION IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvRegistration", "RPV_REGISTRATION NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvRegistration", "RPV_REGISTRATION != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvRegistration", "RPV_REGISTRATION IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvRegistration", "RPV_REGISTRATION IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvRegistration", "RPV_REGISTRATION < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvRegistration", "RPV_REGISTRATION > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvRegistration", "RPV_REGISTRATION <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvRegistration", "RPV_REGISTRATION >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvRegistrationMatch", "RPV_REGISTRATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvRegistration", "RPV_REGISTRATION BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvRegistration", "(RPV_REGISTRATION IS NULL OR RPV_REGISTRATION = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvRegistration", "(RPV_REGISTRATION IS NULL OR RPV_REGISTRATION < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvRegistration",
	      "(RPV_REGISTRATION IS NULL OR RPV_REGISTRATION > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvRegistrationasc", "RPV_REGISTRATION ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvRegistrationdesc", "RPV_REGISTRATION DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvAddressLine1", /* PK attribute */
	      "RPV_ADDRESS_LINE1 = ?" )
	         .addFilterBy( "filterByrpvAddressLine1Match", "RPV_ADDRESS_LINE1 LIKE ?" )
	         .addFilterBy( "INrpvAddressLine1", "RPV_ADDRESS_LINE1 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvAddressLine1", "RPV_ADDRESS_LINE1 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvAddressLine1", "RPV_ADDRESS_LINE1 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvAddressLine1", "RPV_ADDRESS_LINE1 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvAddressLine1", "RPV_ADDRESS_LINE1 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvAddressLine1", "RPV_ADDRESS_LINE1 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvAddressLine1", "RPV_ADDRESS_LINE1 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvAddressLine1", "RPV_ADDRESS_LINE1 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvAddressLine1", "RPV_ADDRESS_LINE1 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvAddressLine1Match", "RPV_ADDRESS_LINE1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvAddressLine1", "RPV_ADDRESS_LINE1 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvAddressLine1", "(RPV_ADDRESS_LINE1 IS NULL OR RPV_ADDRESS_LINE1 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvAddressLine1", "(RPV_ADDRESS_LINE1 IS NULL OR RPV_ADDRESS_LINE1 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvAddressLine1",
	      "(RPV_ADDRESS_LINE1 IS NULL OR RPV_ADDRESS_LINE1 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvAddressLine1asc", "RPV_ADDRESS_LINE1 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvAddressLine1desc", "RPV_ADDRESS_LINE1 DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvAddressLine2", /* PK attribute */
	      "RPV_ADDRESS_LINE2 = ?" )
	         .addFilterBy( "filterByrpvAddressLine2Match", "RPV_ADDRESS_LINE2 LIKE ?" )
	         .addFilterBy( "INrpvAddressLine2", "RPV_ADDRESS_LINE2 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvAddressLine2", "RPV_ADDRESS_LINE2 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvAddressLine2", "RPV_ADDRESS_LINE2 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvAddressLine2", "RPV_ADDRESS_LINE2 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvAddressLine2", "RPV_ADDRESS_LINE2 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvAddressLine2", "RPV_ADDRESS_LINE2 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvAddressLine2", "RPV_ADDRESS_LINE2 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvAddressLine2", "RPV_ADDRESS_LINE2 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvAddressLine2", "RPV_ADDRESS_LINE2 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvAddressLine2Match", "RPV_ADDRESS_LINE2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvAddressLine2", "RPV_ADDRESS_LINE2 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvAddressLine2", "(RPV_ADDRESS_LINE2 IS NULL OR RPV_ADDRESS_LINE2 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvAddressLine2", "(RPV_ADDRESS_LINE2 IS NULL OR RPV_ADDRESS_LINE2 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvAddressLine2",
	      "(RPV_ADDRESS_LINE2 IS NULL OR RPV_ADDRESS_LINE2 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvAddressLine2asc", "RPV_ADDRESS_LINE2 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvAddressLine2desc", "RPV_ADDRESS_LINE2 DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvAddressLine3", /* PK attribute */
	      "RPV_ADDRESS_LINE3 = ?" )
	         .addFilterBy( "filterByrpvAddressLine3Match", "RPV_ADDRESS_LINE3 LIKE ?" )
	         .addFilterBy( "INrpvAddressLine3", "RPV_ADDRESS_LINE3 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvAddressLine3", "RPV_ADDRESS_LINE3 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvAddressLine3", "RPV_ADDRESS_LINE3 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvAddressLine3", "RPV_ADDRESS_LINE3 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvAddressLine3", "RPV_ADDRESS_LINE3 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvAddressLine3", "RPV_ADDRESS_LINE3 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvAddressLine3", "RPV_ADDRESS_LINE3 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvAddressLine3", "RPV_ADDRESS_LINE3 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvAddressLine3", "RPV_ADDRESS_LINE3 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvAddressLine3Match", "RPV_ADDRESS_LINE3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvAddressLine3", "RPV_ADDRESS_LINE3 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvAddressLine3", "(RPV_ADDRESS_LINE3 IS NULL OR RPV_ADDRESS_LINE3 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvAddressLine3", "(RPV_ADDRESS_LINE3 IS NULL OR RPV_ADDRESS_LINE3 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvAddressLine3",
	      "(RPV_ADDRESS_LINE3 IS NULL OR RPV_ADDRESS_LINE3 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvAddressLine3asc", "RPV_ADDRESS_LINE3 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvAddressLine3desc", "RPV_ADDRESS_LINE3 DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvPostalCode", /* PK attribute */
	      "RPV_POSTAL_CODE = ?" )
	         .addFilterBy( "filterByrpvPostalCodeMatch", "RPV_POSTAL_CODE LIKE ?" )
	         .addFilterBy( "INrpvPostalCode", "RPV_POSTAL_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvPostalCode", "RPV_POSTAL_CODE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvPostalCode", "RPV_POSTAL_CODE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvPostalCode", "RPV_POSTAL_CODE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvPostalCode", "RPV_POSTAL_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvPostalCode", "RPV_POSTAL_CODE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvPostalCode", "RPV_POSTAL_CODE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvPostalCode", "RPV_POSTAL_CODE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvPostalCode", "RPV_POSTAL_CODE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvPostalCodeMatch", "RPV_POSTAL_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvPostalCode", "RPV_POSTAL_CODE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvPostalCode", "(RPV_POSTAL_CODE IS NULL OR RPV_POSTAL_CODE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvPostalCode", "(RPV_POSTAL_CODE IS NULL OR RPV_POSTAL_CODE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvPostalCode",
	      "(RPV_POSTAL_CODE IS NULL OR RPV_POSTAL_CODE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvPostalCodeasc", "RPV_POSTAL_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvPostalCodedesc", "RPV_POSTAL_CODE DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvSuburb", /* PK attribute */
	      "RPV_SUBURB = ?" )
	         .addFilterBy( "filterByrpvSuburbMatch", "RPV_SUBURB LIKE ?" )
	         .addFilterBy( "INrpvSuburb", "RPV_SUBURB IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvSuburb", "RPV_SUBURB NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvSuburb", "RPV_SUBURB != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvSuburb", "RPV_SUBURB IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvSuburb", "RPV_SUBURB IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvSuburb", "RPV_SUBURB < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvSuburb", "RPV_SUBURB > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvSuburb", "RPV_SUBURB <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvSuburb", "RPV_SUBURB >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvSuburbMatch", "RPV_SUBURB LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvSuburb", "RPV_SUBURB BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvSuburb", "(RPV_SUBURB IS NULL OR RPV_SUBURB = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvSuburb", "(RPV_SUBURB IS NULL OR RPV_SUBURB < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvSuburb",
	      "(RPV_SUBURB IS NULL OR RPV_SUBURB > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvSuburbasc", "RPV_SUBURB ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvSuburbdesc", "RPV_SUBURB DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvCityTown", /* PK attribute */
	      "RPV_CITY_TOWN = ?" )
	         .addFilterBy( "filterByrpvCityTownMatch", "RPV_CITY_TOWN LIKE ?" )
	         .addFilterBy( "INrpvCityTown", "RPV_CITY_TOWN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvCityTown", "RPV_CITY_TOWN NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvCityTown", "RPV_CITY_TOWN != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvCityTown", "RPV_CITY_TOWN IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvCityTown", "RPV_CITY_TOWN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvCityTown", "RPV_CITY_TOWN < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvCityTown", "RPV_CITY_TOWN > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvCityTown", "RPV_CITY_TOWN <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvCityTown", "RPV_CITY_TOWN >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvCityTownMatch", "RPV_CITY_TOWN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvCityTown", "RPV_CITY_TOWN BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvCityTown", "(RPV_CITY_TOWN IS NULL OR RPV_CITY_TOWN = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvCityTown", "(RPV_CITY_TOWN IS NULL OR RPV_CITY_TOWN < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvCityTown",
	      "(RPV_CITY_TOWN IS NULL OR RPV_CITY_TOWN > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvCityTownasc", "RPV_CITY_TOWN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvCityTowndesc", "RPV_CITY_TOWN DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBusinessName", /* PK attribute */
	      "RPV_BUSINESS_NAME = ?" )
	         .addFilterBy( "filterByrpvBusinessNameMatch", "RPV_BUSINESS_NAME LIKE ?" )
	         .addFilterBy( "INrpvBusinessName", "RPV_BUSINESS_NAME IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBusinessName", "RPV_BUSINESS_NAME NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBusinessName", "RPV_BUSINESS_NAME != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBusinessName", "RPV_BUSINESS_NAME IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBusinessName", "RPV_BUSINESS_NAME IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBusinessName", "RPV_BUSINESS_NAME < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBusinessName", "RPV_BUSINESS_NAME > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBusinessName", "RPV_BUSINESS_NAME <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBusinessName", "RPV_BUSINESS_NAME >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBusinessNameMatch", "RPV_BUSINESS_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBusinessName", "RPV_BUSINESS_NAME BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBusinessName", "(RPV_BUSINESS_NAME IS NULL OR RPV_BUSINESS_NAME = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBusinessName", "(RPV_BUSINESS_NAME IS NULL OR RPV_BUSINESS_NAME < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBusinessName",
	      "(RPV_BUSINESS_NAME IS NULL OR RPV_BUSINESS_NAME > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBusinessNameasc", "RPV_BUSINESS_NAME ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBusinessNamedesc", "RPV_BUSINESS_NAME DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBaddressLine1", /* PK attribute */
	      "RPV_BADDRESS_LINE1 = ?" )
	         .addFilterBy( "filterByrpvBaddressLine1Match", "RPV_BADDRESS_LINE1 LIKE ?" )
	         .addFilterBy( "INrpvBaddressLine1", "RPV_BADDRESS_LINE1 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBaddressLine1", "RPV_BADDRESS_LINE1 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBaddressLine1", "RPV_BADDRESS_LINE1 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBaddressLine1", "RPV_BADDRESS_LINE1 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBaddressLine1", "RPV_BADDRESS_LINE1 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBaddressLine1", "RPV_BADDRESS_LINE1 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBaddressLine1", "RPV_BADDRESS_LINE1 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBaddressLine1", "RPV_BADDRESS_LINE1 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBaddressLine1", "RPV_BADDRESS_LINE1 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBaddressLine1Match", "RPV_BADDRESS_LINE1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBaddressLine1", "RPV_BADDRESS_LINE1 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBaddressLine1", "(RPV_BADDRESS_LINE1 IS NULL OR RPV_BADDRESS_LINE1 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBaddressLine1", "(RPV_BADDRESS_LINE1 IS NULL OR RPV_BADDRESS_LINE1 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBaddressLine1",
	      "(RPV_BADDRESS_LINE1 IS NULL OR RPV_BADDRESS_LINE1 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBaddressLine1asc", "RPV_BADDRESS_LINE1 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBaddressLine1desc", "RPV_BADDRESS_LINE1 DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBaddressLine2", /* PK attribute */
	      "RPV_BADDRESS_LINE2 = ?" )
	         .addFilterBy( "filterByrpvBaddressLine2Match", "RPV_BADDRESS_LINE2 LIKE ?" )
	         .addFilterBy( "INrpvBaddressLine2", "RPV_BADDRESS_LINE2 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBaddressLine2", "RPV_BADDRESS_LINE2 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBaddressLine2", "RPV_BADDRESS_LINE2 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBaddressLine2", "RPV_BADDRESS_LINE2 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBaddressLine2", "RPV_BADDRESS_LINE2 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBaddressLine2", "RPV_BADDRESS_LINE2 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBaddressLine2", "RPV_BADDRESS_LINE2 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBaddressLine2", "RPV_BADDRESS_LINE2 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBaddressLine2", "RPV_BADDRESS_LINE2 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBaddressLine2Match", "RPV_BADDRESS_LINE2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBaddressLine2", "RPV_BADDRESS_LINE2 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBaddressLine2", "(RPV_BADDRESS_LINE2 IS NULL OR RPV_BADDRESS_LINE2 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBaddressLine2", "(RPV_BADDRESS_LINE2 IS NULL OR RPV_BADDRESS_LINE2 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBaddressLine2",
	      "(RPV_BADDRESS_LINE2 IS NULL OR RPV_BADDRESS_LINE2 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBaddressLine2asc", "RPV_BADDRESS_LINE2 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBaddressLine2desc", "RPV_BADDRESS_LINE2 DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBaddressLine3", /* PK attribute */
	      "RPV_BADDRESS_LINE3 = ?" )
	         .addFilterBy( "filterByrpvBaddressLine3Match", "RPV_BADDRESS_LINE3 LIKE ?" )
	         .addFilterBy( "INrpvBaddressLine3", "RPV_BADDRESS_LINE3 IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBaddressLine3", "RPV_BADDRESS_LINE3 NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBaddressLine3", "RPV_BADDRESS_LINE3 != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBaddressLine3", "RPV_BADDRESS_LINE3 IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBaddressLine3", "RPV_BADDRESS_LINE3 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBaddressLine3", "RPV_BADDRESS_LINE3 < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBaddressLine3", "RPV_BADDRESS_LINE3 > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBaddressLine3", "RPV_BADDRESS_LINE3 <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBaddressLine3", "RPV_BADDRESS_LINE3 >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBaddressLine3Match", "RPV_BADDRESS_LINE3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBaddressLine3", "RPV_BADDRESS_LINE3 BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBaddressLine3", "(RPV_BADDRESS_LINE3 IS NULL OR RPV_BADDRESS_LINE3 = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBaddressLine3", "(RPV_BADDRESS_LINE3 IS NULL OR RPV_BADDRESS_LINE3 < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBaddressLine3",
	      "(RPV_BADDRESS_LINE3 IS NULL OR RPV_BADDRESS_LINE3 > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBaddressLine3asc", "RPV_BADDRESS_LINE3 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBaddressLine3desc", "RPV_BADDRESS_LINE3 DESC" ) // ORDER DESCENDING
	    ;

	    table.addFilterBy( "equalrpvBpostalCode", /* PK attribute */
	      "RPV_BPOSTAL_CODE = ?" )
	         .addFilterBy( "filterByrpvBpostalCodeMatch", "RPV_BPOSTAL_CODE LIKE ?" )
	         .addFilterBy( "INrpvBpostalCode", "RPV_BPOSTAL_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBpostalCode", "RPV_BPOSTAL_CODE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBpostalCode", "RPV_BPOSTAL_CODE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBpostalCode", "RPV_BPOSTAL_CODE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBpostalCode", "RPV_BPOSTAL_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBpostalCode", "RPV_BPOSTAL_CODE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBpostalCode", "RPV_BPOSTAL_CODE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBpostalCode", "RPV_BPOSTAL_CODE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBpostalCode", "RPV_BPOSTAL_CODE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBpostalCodeMatch", "RPV_BPOSTAL_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBpostalCode", "RPV_BPOSTAL_CODE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBpostalCode", "(RPV_BPOSTAL_CODE IS NULL OR RPV_BPOSTAL_CODE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBpostalCode", "(RPV_BPOSTAL_CODE IS NULL OR RPV_BPOSTAL_CODE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBpostalCode",
	      "(RPV_BPOSTAL_CODE IS NULL OR RPV_BPOSTAL_CODE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBpostalCodeasc", "RPV_BPOSTAL_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBpostalCodedesc", "RPV_BPOSTAL_CODE DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBsuburb", /* PK attribute */
	      "RPV_BSUBURB = ?" )
	         .addFilterBy( "filterByrpvBsuburbMatch", "RPV_BSUBURB LIKE ?" )
	         .addFilterBy( "INrpvBsuburb", "RPV_BSUBURB IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBsuburb", "RPV_BSUBURB NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBsuburb", "RPV_BSUBURB != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBsuburb", "RPV_BSUBURB IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBsuburb", "RPV_BSUBURB IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBsuburb", "RPV_BSUBURB < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBsuburb", "RPV_BSUBURB > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBsuburb", "RPV_BSUBURB <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBsuburb", "RPV_BSUBURB >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBsuburbMatch", "RPV_BSUBURB LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBsuburb", "RPV_BSUBURB BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBsuburb", "(RPV_BSUBURB IS NULL OR RPV_BSUBURB = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBsuburb", "(RPV_BSUBURB IS NULL OR RPV_BSUBURB < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBsuburb",
	      "(RPV_BSUBURB IS NULL OR RPV_BSUBURB > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBsuburbasc", "RPV_BSUBURB ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBsuburbdesc", "RPV_BSUBURB DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvBcityTown", /* PK attribute */
	      "RPV_BCITY_TOWN = ?" )
	         .addFilterBy( "filterByrpvBcityTownMatch", "RPV_BCITY_TOWN LIKE ?" )
	         .addFilterBy( "INrpvBcityTown", "RPV_BCITY_TOWN IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvBcityTown", "RPV_BCITY_TOWN NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvBcityTown", "RPV_BCITY_TOWN != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvBcityTown", "RPV_BCITY_TOWN IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvBcityTown", "RPV_BCITY_TOWN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvBcityTown", "RPV_BCITY_TOWN < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvBcityTown", "RPV_BCITY_TOWN > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvBcityTown", "RPV_BCITY_TOWN <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvBcityTown", "RPV_BCITY_TOWN >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvBcityTownMatch", "RPV_BCITY_TOWN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvBcityTown", "RPV_BCITY_TOWN BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvBcityTown", "(RPV_BCITY_TOWN IS NULL OR RPV_BCITY_TOWN = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvBcityTown", "(RPV_BCITY_TOWN IS NULL OR RPV_BCITY_TOWN < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvBcityTown",
	      "(RPV_BCITY_TOWN IS NULL OR RPV_BCITY_TOWN > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvBcityTownasc", "RPV_BCITY_TOWN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvBcityTowndesc", "RPV_BCITY_TOWN DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvMsisdnNo", /* PK attribute */
	      "RPV_MSISDN_NO = ?" )
	         .addFilterBy( "filterByrpvMsisdnNoMatch", "RPV_MSISDN_NO LIKE ?" )
	         .addFilterBy( "INrpvMsisdnNo", "RPV_MSISDN_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvMsisdnNo", "RPV_MSISDN_NO NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvMsisdnNo", "RPV_MSISDN_NO != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvMsisdnNo", "RPV_MSISDN_NO IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvMsisdnNo", "RPV_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvMsisdnNo", "RPV_MSISDN_NO < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvMsisdnNo", "RPV_MSISDN_NO > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvMsisdnNo", "RPV_MSISDN_NO <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvMsisdnNo", "RPV_MSISDN_NO >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvMsisdnNoMatch", "RPV_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvMsisdnNo", "RPV_MSISDN_NO BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvMsisdnNo", "(RPV_MSISDN_NO IS NULL OR RPV_MSISDN_NO = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvMsisdnNo", "(RPV_MSISDN_NO IS NULL OR RPV_MSISDN_NO < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvMsisdnNo",
	      "(RPV_MSISDN_NO IS NULL OR RPV_MSISDN_NO > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvMsisdnNoasc", "RPV_MSISDN_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvMsisdnNodesc", "RPV_MSISDN_NO DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvDatetimeActioned", /* PK attribute */
	      "RPV_DATETIME_ACTIONED = ?" )
	         .addFilterBy( "filterByrpvDatetimeActionedMatch", "RPV_DATETIME_ACTIONED LIKE ?" )
	         .addFilterBy( "INrpvDatetimeActioned", "RPV_DATETIME_ACTIONED IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvDatetimeActioned", "RPV_DATETIME_ACTIONED NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvDatetimeActioned", "RPV_DATETIME_ACTIONED != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvDatetimeActioned", "RPV_DATETIME_ACTIONED IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvDatetimeActioned", "RPV_DATETIME_ACTIONED IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvDatetimeActioned", "RPV_DATETIME_ACTIONED < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvDatetimeActioned", "RPV_DATETIME_ACTIONED > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvDatetimeActioned", "RPV_DATETIME_ACTIONED <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvDatetimeActioned", "RPV_DATETIME_ACTIONED >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvDatetimeActionedMatch", "RPV_DATETIME_ACTIONED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvDatetimeActioned", "RPV_DATETIME_ACTIONED BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvDatetimeActioned", "(RPV_DATETIME_ACTIONED IS NULL OR RPV_DATETIME_ACTIONED = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvDatetimeActioned", "(RPV_DATETIME_ACTIONED IS NULL OR RPV_DATETIME_ACTIONED < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvDatetimeActioned",
	      "(RPV_DATETIME_ACTIONED IS NULL OR RPV_DATETIME_ACTIONED > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvDatetimeActionedasc", "RPV_DATETIME_ACTIONED ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvDatetimeActioneddesc", "RPV_DATETIME_ACTIONED DESC" ) // ORDER DESCENDING
	    ;
	    table.addFilterBy( "equalrpvTrickleDesc", /* PK attribute */
	      "RPV_TRICKLE_DESC = ?" )
	         .addFilterBy( "filterByRpvTrickleDescMatch", "RPV_TRICKLE_DESC LIKE ?" )
	         .addFilterBy( "INrpvTrickleDesc", "RPV_TRICKLE_DESC IN ( ? )" ) // IN

	         .addFilterBy( "NOTINrpvTrickleDesc", "RPV_TRICKLE_DESC NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalrpvTrickleDesc", "RPV_TRICKLE_DESC != ?" ) // NOTEQUAL

	         .addFilterBy( "nullrpvTrickleDesc", "RPV_TRICKLE_DESC IS NULL" ) // IS NULL

	         .addFilterBy( "notnullrpvTrickleDesc", "RPV_TRICKLE_DESC IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanrpvTrickleDesc", "RPV_TRICKLE_DESC < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanrpvTrickleDesc", "RPV_TRICKLE_DESC > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalrpvTrickleDesc", "RPV_TRICKLE_DESC <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalrpvTrickleDesc", "RPV_TRICKLE_DESC >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByrpvTrickleDescMatch", "RPV_TRICKLE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenrpvTrickleDesc", "RPV_TRICKLE_DESC BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullrpvTrickleDesc", "(RPV_TRICKLE_DESC IS NULL OR RPV_TRICKLE_DESC = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullrpvTrickleDesc", "(RPV_TRICKLE_DESC IS NULL OR RPV_TRICKLE_DESC < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullrpvTrickleDesc",
	      "(RPV_TRICKLE_DESC IS NULL OR RPV_TRICKLE_DESC > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "rpvTrickleDescasc", "RPV_TRICKLE_DESC ASC" ) // ORDER ASCENDING

	         .addOrderBy( "rpvTrickleDescdesc", "RPV_TRICKLE_DESC DESC" ) // ORDER DESCENDING
	         ;;
	    
	    defStaticQuery(
	     			"rpvTrickleDescrpvStatusInnerSelect",//dmlName, 
	     			".base.blo.RicaPersonVerificationDMO",//dmoName, 
	     			"SELECT FIRST 2000 * FROM RICA_PERSON_VERIFICATION" +
	     			" WHERE RPV_RICA_STATUS IN ( ?, ?, ? )" +
	     			" AND (RPV_RICA_STATUS <> RPV_TRICKLE_DESC[1,1]" +
	     			" OR RPV_TRICKLE_DESC[1,1] is null)" + 
	     			" ORDER BY RPV_MSISDN_NO, RPV_SERIAL",//selectStmt, 
	     			false);//isMultiRow);

	     	/*
				SELECT * FROM RICA_PERSON_VERIFICATION
				WHERE RPV_RICA_STATUS IN ( 'R','D','T' )
				AND (RPV_RICA_STATUS <> RPV_TRICKLE_DESC[1,1]
				OR RPV_TRICKLE_DESC[1,1] is null)
				ORDER BY RPV_MSISDN_NO, RPV_SERIAL
	     	 * */
		
	}


	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new RicaPersonVerificationDMLFactory(  );
	    }

	    return dml;
	  }


}