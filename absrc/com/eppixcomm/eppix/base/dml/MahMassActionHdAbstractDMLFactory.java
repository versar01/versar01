package com.eppixcomm.eppix.base.dml;

public class MahMassActionHdAbstractDMLFactory extends BaseDMLFactory {
	
	private static DMLFactory dml = null;
	protected MahMassActionHdAbstractDMLFactory() throws DMLException {
		;
		
	    DMLTable table = defTable( "MahMassActionHd", // dmlName
	            "blo.MahMassActionHdDMO", // dmoName
	            "MAH_MASS_ACTION_HD", // tableName MahMassActionHd
	            22, // numColumns
	            "MAH_FILE_ID, MAH_CSV_FILE_ID, MAH_ACT_TYPE, MAH_SERVICE_CODE, MAH_PARAM_ID,"+
	            "MAH_PARAM_VALUE, MAH_PACKAGE_CODE, MAH_TARIFF_CODE, MAH_REASON_CD, MAH_DEACT_TYPE,"+
	            "MAH_USER_ID,MAH_SUBMIT_DATE, MAH_RECS_REQ, MAH_PROCESS_DATE, MAH_FILE_STATUS,"+
	            "MAH_RECS_PROC, MAH_COMMENTS, MAH_ANALYSIS_1, MAH_ANALYSIS_2, MAH_ANALYSIS_3, "+
	            "MAH_ANALYSIS_4, MAH_ANALYSIS_5", // columnList
	            "(MAH_FILE_ID)" + ", (MAH_ACT_TYPE)", //primaryKey
	            "" // versionCol     
	          , true, // generatedKey
	          "MAH_FILE_ID, MAH_CSV_FILE_ID, MAH_ACT_TYPE, MAH_SERVICE_CODE, MAH_PARAM_ID,"+
	            "MAH_PARAM_VALUE, MAH_PACKAGE_CODE, MAH_TARIFF_CODE, MAH_REASON_CD, MAH_DEACT_TYPE,"+
	            "MAH_USER_ID,MAH_SUBMIT_DATE, MAH_RECS_REQ, MAH_PROCESS_DATE, MAH_FILE_STATUS,"+
	            "MAH_RECS_PROC, MAH_COMMENTS, MAH_ANALYSIS_1, MAH_ANALYSIS_2, MAH_ANALYSIS_3, "+
	            "MAH_ANALYSIS_4, MAH_ANALYSIS_5", // columnList
	            "", "",
	            new String[] {
	            "MAH_FILE_ID","MAH_CSV_FILE_ID","MAH_ACT_TYPE","MAH_SERVICE_CODE","MAH_PARAM_ID",
	            "MAH_PARAM_VALUE", "MAH_PACKAGE_CODE","MAH_TARIFF_CODE","MAH_REASON_CD","MAH_DEACT_TYPE",
	            "MAH_USER_ID","MAH_SUBMIT_DATE", "MAH_RECS_REQ","MAH_PROCESS_DATE", "MAH_FILE_STATUS",
	            "MAH_RECS_PROC", "MAH_COMMENTS", "MAH_ANALYSIS_1", "MAH_ANALYSIS_2", "MAH_ANALYSIS_3",
	            "MAH_ANALYSIS_4", "MAH_ANALYSIS_5",
	            } );

	    table.addFilterBy( "equalMahFileId", /* PK attribute */
	      "MAH_FILE_ID = ?" )
	         .addFilterBy( "filterByMahFileIdMatch", "MAH_FILE_ID LIKE ?" )
	         .addFilterBy( "INMahFileId", "MAH_FILE_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINMahFileId", "MAH_FILE_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalMahFileId", "MAH_FILE_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullMahFileId", "MAH_FILE_ID IS NULL" ) // IS NULL

	         .addFilterBy( "notnullMahFileId", "MAH_FILE_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanMahFileId", "MAH_FILE_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanMahFileId", "MAH_FILE_ID > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalMahFileId", "MAH_FILE_ID <= ?" ) // LESS THAN OR EQUAL
	         
	         .addFilterBy( "greaterthanorequalMahFileId", "MAH_FILE_ID >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByMahFileIdMatch", "MAH_FILE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenMahFileId", "MAH_FILE_ID BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullMahFileId", "(MAH_FILE_ID IS NULL OR MAH_FILE_ID = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullMahFileId", "(MAH_FILE_ID IS NULL OR MAH_FILE_ID < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullMahFileId",
	      "(MAH_FILE_ID IS NULL OR MAH_FILE_ID > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "MahFileIdasc", "MAH_FILE_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "MahFileIddesc", "MAH_FILE_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahCsvFileId", /* PK attribute */
	      "MAH_CSV_FILE_ID = ?" )
	         .addFilterBy( "filterByMahCsvFileIdMatch", "MAH_CSV_FILE_ID LIKE ?" )
	         .addFilterBy( "INMahCsvFileId", "MAH_CSV_FILE_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINMahCsvFileId", "MAH_CSV_FILE_ID NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalMahCsvFileId", "MAH_CSV_FILE_ID != ?" ) // NOTEQUAL

	         .addFilterBy( "nullMahCsvFileId", "MAH_CSV_FILE_ID IS NULL" ) // IS NULL

	         .addFilterBy( "notnullMahCsvFileId", "MAH_CSV_FILE_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanMahCsvFileId", "MAH_CSV_FILE_ID < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanMahCsvFileId", "MAH_CSV_FILE_ID > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalMahCsvFileId", "MAH_CSV_FILE_ID <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalMahCsvFileId", "MAH_CSV_FILE_ID >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByMahCsvFileIdMatch", "MAH_CSV_FILE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenMahCsvFileId", "MAH_CSV_FILE_ID BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullMahCsvFileId", "(MAH_CSV_FILE_ID IS NULL OR MAH_CSV_FILE_ID = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullMahCsvFileId", "(MAH_CSV_FILE_ID IS NULL OR MAH_CSV_FILE_ID < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullMahCsvFileId",
	      "(MAH_CSV_FILE_ID IS NULL OR MAH_CSV_FILE_ID > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "MahCsvFileIdasc", "MAH_CSV_FILE_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "MahCsvFileIddesc", "MAH_CSV_FILE_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    
	    table.addFilterBy( "equalMahActType", /* PK attribute */
	      "MAH_ACT_TYPE = ?" )
	         .addFilterBy( "filterByMahActTypeMatch", "MAH_ACT_TYPE LIKE ?" )
	         .addFilterBy( "INMahActType", "MAH_ACT_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINMahActType", "MAH_ACT_TYPE NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalMahActType", "MAH_ACT_TYPE != ?" ) // NOTEQUAL

	         .addFilterBy( "nullMahActType", "MAH_ACT_TYPE IS NULL" ) // IS NULL

	         .addFilterBy( "notnullMahActType", "MAH_ACT_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthanMahActType", "MAH_ACT_TYPE < ?" ) // LESS THAN

	         .addFilterBy( "greaterthanMahActType", "MAH_ACT_TYPE > ?" ) // GREATER THAN

	         .addFilterBy( "lessthanorequalMahActType", "MAH_ACT_TYPE <= ?" ) // LESS THAN OR EQUAL

	         .addFilterBy( "greaterthanorequalMahActType", "MAH_ACT_TYPE >= ?" ) // GREATER THAN OR EQUAL

	         .addFilterBy( "filterByMahActTypeMatch", "MAH_ACT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "betweenMahActType", "MAH_ACT_TYPE BETWEEN ? AND ?" ) // BETWEEN

	         .addFilterBy( "equalornullMahActType", "(MAH_ACT_TYPE IS NULL OR MAH_ACT_TYPE = ?)" ) // EQUALORNULL
	                                                                              // TODO : we may need to wrap this with a () 

	         .addFilterBy( "lessthanornullMahActType", "(MAH_ACT_TYPE IS NULL OR MAH_ACT_TYPE < ?)" ) // LESSTHANORNULL

	         .addFilterBy( "greaterthanornullMahActType",
	      "(MAH_ACT_TYPE IS NULL OR MAH_ACT_TYPE > ?)" ) // GREATERTHANORNULL

	         .addOrderBy( "MahActTypeasc", "MAH_ACT_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "MahActTypedesc", "MAH_ACT_TYPE DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahServiceCode", /* PK attribute */
		      "MAH_SERVICE_CODE = ?" )
			 .addFilterBy( "filterByMahServiceCodeMatch", "MAH_SERVICE_CODE LIKE ?" )
			 .addFilterBy( "INMahServiceCode", "MAH_SERVICE_CODE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahServiceCode", "MAH_SERVICE_CODE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahServiceCode", "MAH_SERVICE_CODE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahServiceCode", "MAH_SERVICE_CODE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahServiceCode", "MAH_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahServiceCode", "MAH_SERVICE_CODE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahServiceCode", "MAH_SERVICE_CODE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahServiceCode", "MAH_SERVICE_CODE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahServiceCode", "MAH_SERVICE_CODE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahServiceCodeMatch", "MAH_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahServiceCode", "MAH_SERVICE_CODE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahServiceCode", "(MAH_SERVICE_CODE IS NULL OR MAH_SERVICE_CODE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahServiceCode", "(MAH_SERVICE_CODE IS NULL OR MAH_SERVICE_CODE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahServiceCode",
		      "(MAH_SERVICE_CODE IS NULL OR MAH_SERVICE_CODE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahServiceCodeasc", "MAH_SERVICE_CODE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahServiceCodedesc", "MAH_SERVICE_CODE DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahParamId", /* PK attribute */
		      "MAH_PARAM_ID = ?" )
			 .addFilterBy( "filterByMahParamIdMatch", "MAH_PARAM_ID LIKE ?" )
			 .addFilterBy( "INMahParamId", "MAH_PARAM_ID IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahParamId", "MAH_PARAM_ID NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahParamId", "MAH_PARAM_ID != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahParamId", "MAH_PARAM_ID IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahParamId", "MAH_PARAM_ID IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahParamId", "MAH_PARAM_ID < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahParamId", "MAH_PARAM_ID > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahParamId", "MAH_PARAM_ID <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahParamId", "MAH_PARAM_ID >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahParamIdMatch", "MAH_PARAM_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahParamId", "MAH_PARAM_ID BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahParamId", "(MAH_PARAM_ID IS NULL OR MAH_PARAM_ID = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahParamId", "(MAH_PARAM_ID IS NULL OR MAH_PARAM_ID < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahParamId",
		      "(MAH_PARAM_ID IS NULL OR MAH_PARAM_ID > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahParamIdasc", "MAH_PARAM_ID ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahParamIddesc", "MAH_PARAM_ID DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalMahParamValue", /* PK attribute */
		      "MAH_PARAM_VALUE = ?" )
			 .addFilterBy( "filterByMahParamValueMatch", "MAH_PARAM_VALUE LIKE ?" )
			 .addFilterBy( "INMahParamValue", "MAH_PARAM_VALUE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahParamValue", "MAH_PARAM_VALUE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahParamValue", "MAH_PARAM_VALUE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahParamValue", "MAH_PARAM_VALUE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahParamValue", "MAH_PARAM_VALUE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahParamValue", "MAH_PARAM_VALUE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahParamValue", "MAH_PARAM_VALUE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahParamValue", "MAH_PARAM_VALUE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahParamValue", "MAH_PARAM_VALUE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahParamValueMatch", "MAH_PARAM_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahParamValue", "MAH_PARAM_VALUE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahParamValue", "(MAH_PARAM_VALUE IS NULL OR MAH_PARAM_VALUE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahParamValue", "(MAH_PARAM_VALUE IS NULL OR MAH_PARAM_VALUE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahParamValue",
		      "(MAH_PARAM_VALUE IS NULL OR MAH_PARAM_VALUE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahParamValueasc", "MAH_PARAM_VALUE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahParamValuedesc", "MAH_PARAM_VALUE DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalMahPackageCode", /* PK attribute */
		      "MAH_PACKAGE_CODE = ?" )
			 .addFilterBy( "filterByMahPackageCodeMatch", "MAH_PACKAGE_CODE LIKE ?" )
			 .addFilterBy( "INMahPackageCode", "MAH_PACKAGE_CODE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahPackageCode", "MAH_PACKAGE_CODE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahPackageCode", "MAH_PACKAGE_CODE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahPackageCode", "MAH_PACKAGE_CODE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahPackageCode", "MAH_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahPackageCode", "MAH_PACKAGE_CODE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahPackageCode", "MAH_PACKAGE_CODE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahPackageCode", "MAH_PACKAGE_CODE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahPackageCode", "MAH_PACKAGE_CODE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahPackageCodeMatch", "MAH_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahPackageCode", "MAH_PACKAGE_CODE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahPackageCode", "(MAH_PACKAGE_CODE IS NULL OR MAH_PACKAGE_CODE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahPackageCode", "(MAH_PACKAGE_CODE IS NULL OR MAH_PACKAGE_CODE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahPackageCode",
		      "(MAH_PACKAGE_CODE IS NULL OR MAH_PACKAGE_CODE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahPackageCodeasc", "MAH_PACKAGE_CODE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahPackageCodedesc", "MAH_PACKAGE_CODE DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalMahTariffCode", /* PK attribute */
		      "MAH_TARIFF_CODE = ?" )
			 .addFilterBy( "filterByMahTariffCodeMatch", "MAH_TARIFF_CODE LIKE ?" )
			 .addFilterBy( "INMahTariffCode", "MAH_TARIFF_CODE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahTariffCode", "MAH_TARIFF_CODE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahTariffCode", "MAH_TARIFF_CODE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahTariffCode", "MAH_TARIFF_CODE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahTariffCode", "MAH_TARIFF_CODE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahTariffCode", "MAH_TARIFF_CODE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahTariffCode", "MAH_TARIFF_CODE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahTariffCode", "MAH_TARIFF_CODE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahTariffCode", "MAH_TARIFF_CODE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahTariffCodeMatch", "MAH_TARIFF_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahTariffCode", "MAH_TARIFF_CODE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahTariffCode", "(MAH_TARIFF_CODE IS NULL OR MAH_TARIFF_CODE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahTariffCode", "(MAH_TARIFF_CODE IS NULL OR MAH_TARIFF_CODE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahTariffCode",
		      "(MAH_TARIFF_CODE IS NULL OR MAH_TARIFF_CODE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahTariffCodeasc", "MAH_TARIFF_CODE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahTariffCodedesc", "MAH_TARIFF_CODE DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalMahReasonCd", /* PK attribute */
		    "MAH_REASON_CD = ?" )
			 .addFilterBy( "filterByMahReasonCdMatch", "MAH_REASON_CD LIKE ?" )
			 .addFilterBy( "INMahReasonCd", "MAH_REASON_CD IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahReasonCd", "MAH_REASON_CD NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahReasonCd", "MAH_REASON_CD != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahReasonCd", "MAH_REASON_CD IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahReasonCd", "MAH_REASON_CD IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahReasonCd", "MAH_REASON_CD < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahReasonCd", "MAH_REASON_CD > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahReasonCd", "MAH_REASON_CD <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahReasonCd", "MAH_REASON_CD >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahReasonCdMatch", "MAH_REASON_CD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahReasonCd", "MAH_REASON_CD BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahReasonCd", "(MAH_REASON_CD IS NULL OR MAH_REASON_CD = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahReasonCd", "(MAH_REASON_CD IS NULL OR MAH_REASON_CD < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahReasonCd",
		      "(MAH_REASON_CD IS NULL OR MAH_REASON_CD > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahReasonCdasc", "MAH_REASON_CD ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahReasonCddesc", "MAH_REASON_CD DESC" ) // ORDER DESCENDING
		;
	    
	    table.addFilterBy( "equalMahDeactType", /* PK attribute */
		      "MAH_DEACT_TYPE = ?" )
			 .addFilterBy( "filterByMahDeactTypeMatch", "MAH_DEACT_TYPE LIKE ?" )
			 .addFilterBy( "INMahDeactType", "MAH_DEACT_TYPE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahDeactType", "MAH_DEACT_TYPE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahDeactType", "MAH_DEACT_TYPE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahDeactType", "MAH_DEACT_TYPE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahDeactType", "MAH_DEACT_TYPE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahDeactType", "MAH_DEACT_TYPE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahDeactType", "MAH_DEACT_TYPE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahDeactType", "MAH_DEACT_TYPE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahDeactType", "MAH_DEACT_TYPE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahDeactTypeMatch", "MAH_DEACT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahDeactType", "MAH_DEACT_TYPE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahDeactType", "(MAH_DEACT_TYPE IS NULL OR MAH_DEACT_TYPE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahDeactType", "(MAH_DEACT_TYPE IS NULL OR MAH_DEACT_TYPE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahDeactType",
		      "(MAH_DEACT_TYPE IS NULL OR MAH_DEACT_TYPE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahDeactTypeasc", "MAH_DEACT_TYPE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahDeactTypedesc", "MAH_DEACT_TYPE DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahUserId", /* PK attribute */
		      "MAH_USER_ID = ?" )
			 .addFilterBy( "filterByMahUserIdMatch", "MAH_USER_ID LIKE ?" )
			 .addFilterBy( "INMahUserId", "MAH_USER_ID IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahUserId", "MAH_USER_ID NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahUserId", "MAH_USER_ID != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahUserId", "MAH_USER_ID IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahUserId", "MAH_USER_ID IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahUserId", "MAH_USER_ID < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahUserId", "MAH_USER_ID > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahUserId", "MAH_USER_ID <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahUserId", "MAH_USER_ID >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahUserIdMatch", "MAH_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahUserId", "MAH_USER_ID BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahUserId", "(MAH_USER_ID IS NULL OR MAH_USER_ID = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahUserId", "(MAH_USER_ID IS NULL OR MAH_USER_ID < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahUserId",
		      "(MAH_USER_ID IS NULL OR MAH_USER_ID > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahUserIdasc", "MAH_USER_ID ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahUserIddesc", "MAH_USER_ID DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahSubmitDate", /* PK attribute */
		      "MAH_SUBMIT_DATE = ?" )
			 .addFilterBy( "filterByMahSubmitDateMatch", "MAH_SUBMIT_DATE LIKE ?" )
			 .addFilterBy( "INMahSubmitDate", "MAH_SUBMIT_DATE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahSubmitDate", "MAH_SUBMIT_DATE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahSubmitDate", "MAH_SUBMIT_DATE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahSubmitDate", "MAH_SUBMIT_DATE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahSubmitDate", "MAH_SUBMIT_DATE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahSubmitDate", "MAH_SUBMIT_DATE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahSubmitDate", "MAH_SUBMIT_DATE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahSubmitDate", "MAH_SUBMIT_DATE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahSubmitDate", "MAH_SUBMIT_DATE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahSubmitDateMatch", "MAH_SUBMIT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahSubmitDate", "MAH_SUBMIT_DATE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahSubmitDate", "(MAH_SUBMIT_DATE IS NULL OR MAH_SUBMIT_DATE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahSubmitDate", "(MAH_SUBMIT_DATE IS NULL OR MAH_SUBMIT_DATE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahSubmitDate",
		      "(MAH_SUBMIT_DATE IS NULL OR MAH_SUBMIT_DATE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahSubmitDateasc", "MAH_SUBMIT_DATE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahSubmitDatedesc", "MAH_SUBMIT_DATE DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahRecsReq", /* PK attribute */
		      "MAH_RECS_REQ = ?" )
			 .addFilterBy( "filterByMahRecsReqMatch", "MAH_RECS_REQ LIKE ?" )
			 .addFilterBy( "INMahRecsReq", "MAH_RECS_REQ IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahRecsReq", "MAH_RECS_REQ NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahRecsReq", "MAH_RECS_REQ != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahRecsReq", "MAH_RECS_REQ IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahRecsReq", "MAH_RECS_REQ IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahRecsReq", "MAH_RECS_REQ < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahRecsReq", "MAH_RECS_REQ > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahRecsReq", "MAH_RECS_REQ <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahRecsReq", "MAH_RECS_REQ >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahRecsReqMatch", "MAH_RECS_REQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahRecsReq", "MAH_RECS_REQ BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahRecsReq", "(MAH_RECS_REQ IS NULL OR MAH_RECS_REQ = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahRecsReq", "(MAH_RECS_REQ IS NULL OR MAH_RECS_REQ < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahRecsReq",
		      "(MAH_RECS_REQ IS NULL OR MAH_RECS_REQ > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahRecsReqasc", "MAH_RECS_REQ ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahRecsReqdesc", "MAH_RECS_REQ DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalMahProcessDate", /* PK attribute */
		      "MAH_PROCESS_DATE = ?" )
			 .addFilterBy( "filterByMahProcessDateMatch", "MAH_PROCESS_DATE LIKE ?" )
			 .addFilterBy( "INMahProcessDate", "MAH_PROCESS_DATE IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahProcessDate", "MAH_PROCESS_DATE NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahProcessDate", "MAH_PROCESS_DATE != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahProcessDate", "MAH_PROCESS_DATE IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahProcessDate", "MAH_PROCESS_DATE IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahProcessDate", "MAH_PROCESS_DATE < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahProcessDate", "MAH_PROCESS_DATE > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahProcessDate", "MAH_PROCESS_DATE <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahProcessDate", "MAH_PROCESS_DATE >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahProcessDateMatch", "MAH_PROCESS_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahProcessDate", "MAH_PROCESS_DATE BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahProcessDate", "(MAH_PROCESS_DATE IS NULL OR MAH_PROCESS_DATE = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahProcessDate", "(MAH_PROCESS_DATE IS NULL OR MAH_PROCESS_DATE < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahProcessDate",
		      "(MAH_PROCESS_DATE IS NULL OR MAH_PROCESS_DATE > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahProcessDateasc", "MAH_PROCESS_DATE ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahProcessDatedesc", "MAH_PROCESS_DATE DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahFileStatus", /* PK attribute */
		      "MAH_FILE_STATUS = ?" )
			 .addFilterBy( "filterByMahFileStatusMatch", "MAH_FILE_STATUS LIKE ?" )
			 .addFilterBy( "INMahFileStatus", "MAH_FILE_STATUS IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahFileStatus", "MAH_FILE_STATUS NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahFileStatus", "MAH_FILE_STATUS != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahFileStatus", "MAH_FILE_STATUS IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahFileStatus", "MAH_FILE_STATUS IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahFileStatus", "MAH_FILE_STATUS < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahFileStatus", "MAH_FILE_STATUS > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahFileStatus", "MAH_FILE_STATUS <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahFileStatus", "MAH_FILE_STATUS >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahFileStatusMatch", "MAH_FILE_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahFileStatus", "MAH_FILE_STATUS BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahFileStatus", "(MAH_FILE_STATUS IS NULL OR MAH_FILE_STATUS = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahFileStatus", "(MAH_FILE_STATUS IS NULL OR MAH_FILE_STATUS < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahFileStatus",
		      "(MAH_FILE_STATUS IS NULL OR MAH_FILE_STATUS > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahFileStatusasc", "MAH_FILE_STATUS ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahFileStatusdesc", "MAH_FILE_STATUS DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahRecsProc", /* PK attribute */
		      "MAH_RECS_PROC = ?" )
			 .addFilterBy( "filterByMahRecsProcMatch", "MAH_RECS_PROC LIKE ?" )
			 .addFilterBy( "INMahRecsProc", "MAH_RECS_PROC IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahRecsProc", "MAH_RECS_PROC NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahRecsProc", "MAH_RECS_PROC != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahRecsProc", "MAH_RECS_PROC IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahRecsProc", "MAH_RECS_PROC IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahRecsProc", "MAH_RECS_PROC < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahRecsProc", "MAH_RECS_PROC > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahRecsProc", "MAH_RECS_PROC <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahRecsProc", "MAH_RECS_PROC >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahRecsProcMatch", "MAH_RECS_PROC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahRecsProc", "MAH_RECS_PROC BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahRecsProc", "(MAH_RECS_PROC IS NULL OR MAH_RECS_PROC = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahRecsProc", "(MAH_RECS_PROC IS NULL OR MAH_RECS_PROC < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahRecsProc",
		      "(MAH_RECS_PROC IS NULL OR MAH_RECS_PROC > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahRecsProcasc", "MAH_RECS_PROC ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahRecsProcdesc", "MAH_RECS_PROC DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahComments", /* PK attribute */
		     "MAH_COMMENTS = ?" )
			 .addFilterBy( "filterByMahCommentsMatch", "MAH_COMMENTS LIKE ?" )
			 .addFilterBy( "INMahComments", "MAH_COMMENTS IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahComments", "MAH_COMMENTS NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahComments", "MAH_COMMENTS != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahComments", "MAH_COMMENTS IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahComments", "MAH_COMMENTS IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahComments", "MAH_COMMENTS < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahComments", "MAH_COMMENTS > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahComments", "MAH_COMMENTS <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahComments", "MAH_COMMENTS >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahCommentsMatch", "MAH_COMMENTS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahComments", "MAH_COMMENTS BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahComments", "(MAH_COMMENTS IS NULL OR MAH_COMMENTS = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahComments", "(MAH_COMMENTS IS NULL OR MAH_COMMENTS < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahComments",
		      "(MAH_COMMENTS IS NULL OR MAH_COMMENTS > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahCommentsasc", "MAH_COMMENTS ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahCommentsdesc", "MAH_COMMENTS DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahAnalysis1", /* PK attribute */
		     "MAH_ANALYSIS_1 = ?" )
			 .addFilterBy( "filterByMahAnalysis1Match", "MAH_ANALYSIS_1 LIKE ?" )
			 .addFilterBy( "INMahAnalysis1", "MAH_ANALYSIS_1 IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahAnalysis1", "MAH_ANALYSIS_1 NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahAnalysis1", "MAH_ANALYSIS_1 != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahAnalysis1", "MAH_ANALYSIS_1 IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahAnalysis1", "MAH_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahAnalysis1", "MAH_ANALYSIS_1 < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahAnalysis1", "MAH_ANALYSIS_1 > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahAnalysis1", "MAH_ANALYSIS_1 <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahAnalysis1", "MAH_ANALYSIS_1 >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahAnalysis1Match", "MAH_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahAnalysis1", "MAH_ANALYSIS_1 BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahAnalysis1", "(MAH_ANALYSIS_1 IS NULL OR MAH_ANALYSIS_1 = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahAnalysis1", "(MAH_ANALYSIS_1 IS NULL OR MAH_ANALYSIS_1 < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahAnalysis1",
		      "(MAH_ANALYSIS_1 IS NULL OR MAH_ANALYSIS_1 > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahAnalysis1asc", "MAH_ANALYSIS_1 ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahAnalysis1desc", "MAH_ANALYSIS_1 DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahAnalysis2", /* PK attribute */
		     "MAH_ANALYSIS_2 = ?" )
			 .addFilterBy( "filterByMahAnalysis2Match", "MAH_ANALYSIS_2 LIKE ?" )
			 .addFilterBy( "INMahAnalysis2", "MAH_ANALYSIS_2 IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahAnalysis2", "MAH_ANALYSIS_2 NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahAnalysis2", "MAH_ANALYSIS_2 != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahAnalysis2", "MAH_ANALYSIS_2 IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahAnalysis2", "MAH_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahAnalysis2", "MAH_ANALYSIS_2 < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahAnalysis2", "MAH_ANALYSIS_2 > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahAnalysis2", "MAH_ANALYSIS_2 <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahAnalysis2", "MAH_ANALYSIS_2 >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahAnalysis2Match", "MAH_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahAnalysis2", "MAH_ANALYSIS_2 BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahAnalysis2", "(MAH_ANALYSIS_2 IS NULL OR MAH_ANALYSIS_2 = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahAnalysis2", "(MAH_ANALYSIS_2 IS NULL OR MAH_ANALYSIS_2 < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahAnalysis2",
		      "(MAH_ANALYSIS_2 IS NULL OR MAH_ANALYSIS_2 > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahAnalysis2asc", "MAH_ANALYSIS_2 ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahAnalysis2desc", "MAH_ANALYSIS_2 DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahAnalysis3", /* PK attribute */
		     "MAH_ANALYSIS_3 = ?" )
			 .addFilterBy( "filterByMahAnalysis3Match", "MAH_ANALYSIS_3 LIKE ?" )
			 .addFilterBy( "INMahAnalysis3", "MAH_ANALYSIS_3 IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahAnalysis3", "MAH_ANALYSIS_3 NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahAnalysis3", "MAH_ANALYSIS_3 != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahAnalysis3", "MAH_ANALYSIS_3 IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahAnalysis3", "MAH_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahAnalysis3", "MAH_ANALYSIS_3 < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahAnalysis3", "MAH_ANALYSIS_3 > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahAnalysis3", "MAH_ANALYSIS_3 <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahAnalysis3", "MAH_ANALYSIS_3 >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahAnalysis3Match", "MAH_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahAnalysis3", "MAH_ANALYSIS_3 BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahAnalysis3", "(MAH_ANALYSIS_3 IS NULL OR MAH_ANALYSIS_3 = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahAnalysis3", "(MAH_ANALYSIS_3 IS NULL OR MAH_ANALYSIS_3 < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahAnalysis3",
		      "(MAH_ANALYSIS_3 IS NULL OR MAH_ANALYSIS_3 > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahAnalysis3asc", "MAH_ANALYSIS_3 ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahAnalysis3desc", "MAH_ANALYSIS_3 DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahAnalysis4", /* PK attribute */
		     "MAH_ANALYSIS_4 = ?" )
			 .addFilterBy( "filterByMahAnalysis4Match", "MAH_ANALYSIS_4 LIKE ?" )
			 .addFilterBy( "INMahAnalysis4", "MAH_ANALYSIS_4 IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahAnalysis4", "MAH_ANALYSIS_4 NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahAnalysis4", "MAH_ANALYSIS_4 != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahAnalysis4", "MAH_ANALYSIS_4 IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahAnalysis4", "MAH_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahAnalysis4", "MAH_ANALYSIS_4 < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahAnalysis4", "MAH_ANALYSIS_4 > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahAnalysis4", "MAH_ANALYSIS_4 <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahAnalysis4", "MAH_ANALYSIS_4 >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahAnalysis4Match", "MAH_ANALYSIS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahAnalysis4", "MAH_ANALYSIS_4 BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahAnalysis4", "(MAH_ANALYSIS_4 IS NULL OR MAH_ANALYSIS_4 = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahAnalysis4", "(MAH_ANALYSIS_4 IS NULL OR MAH_ANALYSIS_4 < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahAnalysis4",
		      "(MAH_ANALYSIS_4 IS NULL OR MAH_ANALYSIS_4 > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahAnalysis4asc", "MAH_ANALYSIS_4 ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahAnalysis4desc", "MAH_ANALYSIS_4 DESC" ) // ORDER DESCENDING
		 ;
	    
	    table.addFilterBy( "equalMahAnalysis5", /* PK attribute */
		     "MAH_ANALYSIS_5 = ?" )
			 .addFilterBy( "filterByMahAnalysis5Match", "MAH_ANALYSIS_5 LIKE ?" )
			 .addFilterBy( "INMahAnalysis5", "MAH_ANALYSIS_5 IN ( ? )" ) // IN
	
			 .addFilterBy( "NOTINMahAnalysis5", "MAH_ANALYSIS_5 NOT IN ( ? )" ) // NOT IN
	
			 .addFilterBy( "notequalMahAnalysis5", "MAH_ANALYSIS_5 != ?" ) // NOTEQUAL
	
			 .addFilterBy( "nullMahAnalysis5", "MAH_ANALYSIS_5 IS NULL" ) // IS NULL
	
			 .addFilterBy( "notnullMahAnalysis5", "MAH_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL
	
			 .addFilterBy( "lessthanMahAnalysis5", "MAH_ANALYSIS_5 < ?" ) // LESS THAN
	
			 .addFilterBy( "greaterthanMahAnalysis5", "MAH_ANALYSIS_5 > ?" ) // GREATER THAN
	
			 .addFilterBy( "lessthanorequalMahAnalysis5", "MAH_ANALYSIS_5 <= ?" ) // LESS THAN OR EQUAL
	
			 .addFilterBy( "greaterthanorequalMahAnalysis5", "MAH_ANALYSIS_5 >= ?" ) // GREATER THAN OR EQUAL
	
			 .addFilterBy( "filterByMahAnalysis5Match", "MAH_ANALYSIS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	
			 .addFilterBy( "betweenMahAnalysis5", "MAH_ANALYSIS_5 BETWEEN ? AND ?" ) // BETWEEN
	
			 .addFilterBy( "equalornullMahAnalysis5", "(MAH_ANALYSIS_5 IS NULL OR MAH_ANALYSIS_5 = ?)" ) // EQUALORNULL
											      // TODO : we may need to wrap this with a () 
	
			 .addFilterBy( "lessthanornullMahAnalysis5", "(MAH_ANALYSIS_5 IS NULL OR MAH_ANALYSIS_5 < ?)" ) // LESSTHANORNULL
	
			 .addFilterBy( "greaterthanornullMahAnalysis5",
		      "(MAH_ANALYSIS_5 IS NULL OR MAH_ANALYSIS_5 > ?)" ) // GREATERTHANORNULL
	
			 .addOrderBy( "MahAnalysis5asc", "MAH_ANALYSIS_5 ASC" ) // ORDER ASCENDING
	
			 .addOrderBy( "MahAnalysis5desc", "MAH_ANALYSIS_5 DESC" ) // ORDER DESCENDING
		 ;
		    
	    
	    /*defStaticQuery(
	     			"rarTrickleDescrarStatusInnerSelect",//dmlName, 
	     			".base.blo.MahMassActionHdDMO",//dmoName, 
	     			"SELECT FIRST 2000 * FROM RICA_ACTION_REQ" +
	     			" WHERE RAR_STATUS IN ( ? )" +
	     			" AND (RAR_STATUS <> RAR_TRICKLE_DESC[1,1]" +
	     			" OR RAR_TRICKLE_DESC[1,1] is null)" + 
	     			" ORDER BY RAR_FILE_ID,RAR_MSISDN_NO",//selectStmt, 
	     			false);//isMultiRow);
*/
	     	/*
				SELECT * FROM RICA_PERSON_VERIFICATION
				WHERE RPV_RICA_STATUS IN ( 'R','D','T' )
				AND (RPV_RICA_STATUS <> RPV_TRICKLE_DESC[1,1]
				OR RPV_TRICKLE_DESC[1,1] is null)
				ORDER BY RPV_MSISDN_NO, RAR_FILE_ID
	     	 * */
	    
	    /*defStaticQuery(
     			"mahUserIdTermIdSelect",//dmlName, 
     			".base.blo.mahMassActionHd",//dmoName, 
     			"SELECT * FROM MAH_MASS_ACTION_HD" +
     			" WHERE MAH_FILE_ID = ( ? )",//selectStmt, 
     			false);//isMultiRow);
*/		
	}


	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new MahMassActionHdDMLFactory(  );
	    }

	    return dml;
	  }

}
