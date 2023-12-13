package com.eppixcomm.eppix.base.dml;



public class SbaSubAuxAbstractDMLFactory extends BaseDMLFactory {

	 private static DMLFactory dml = null;

	 
	 public SbaSubAuxAbstractDMLFactory() throws DMLException{
		 
		 DMLTable table = defTable("SbaSubAux", 
				 "blo.SbaSubAuxDMO", 
				 "SBA_SUB_AUX", 
				 44, 
				 "SBA_SUBSCRIBER_ID, SBA_ID_NUMBER, SBA_MATCHCODE, SBA_MARKETING,"
				 + " SBA_THIRD_PARTY, SBA_CUST_DEPT, SBA_DEALER_ID, SBA_DEPARTMENT,"
				 + " SBA_SALESMAN, SBA_REGION, SBA_INVOICE_ADDRID, SBA_INV_ACCOUNT,"
				 + " SBA_PREPAID_STAT, SBA_ANALYSIS_1, SBA_ANALYSIS_2, SBA_ANALYSIS_3,"
				 + " SBA_ANALYSIS_4, SBA_ANALYSIS_5, SBA_ANALYSIS_6, SBA_ANALYSIS_7,"
				 + " SBA_ANALYSIS_8, SBA_ANALYSIS_9, SBA_ANALYSIS_10, SBA_ANALYSIS_11,"
				 + " SBA_ANALYSIS_12, SBA_ANALYSIS_13, SBA_ANALYSIS_14, SBA_ANALYSIS_15,"
				 + " SBA_ANALYSIS_16, SBA_ANALYSIS_17, SBA_ANALYSIS_18, SBA_ANALYSIS_19,"
				 + " SBA_ANALYSIS_20, SBA_ANALYSIS_21, SBA_ANALYSIS_22, SBA_ANALYSIS_23,"
				 + " SBA_ANALYSIS_24, SBA_ANALYSIS_25, SBA_ANALYSIS_26, SBA_ANALYSIS_27," 
				 + " SBA_ANALYSIS_28, SBA_ANALYSIS_29, SBA_ANALYSIS_30,SBA_COMMENTS",  // Column List
				 "SBA_SUBSCRIBER_ID", //primaryKey, 
				 "", //versionCol, 
				 false, //generateKey, 
				 "SBA_SUBSCRIBER_ID, SBA_ID_NUMBER, SBA_MATCHCODE, SBA_MARKETING,"
				 + " SBA_THIRD_PARTY, SBA_CUST_DEPT, SBA_DEALER_ID, SBA_DEPARTMENT,"
				 + " SBA_SALESMAN, SBA_REGION, SBA_INVOICE_ADDRID, SBA_INV_ACCOUNT,"
				 + " SBA_PREPAID_STAT, SBA_ANALYSIS_1, SBA_ANALYSIS_2, SBA_ANALYSIS_3,"
				 + " SBA_ANALYSIS_4, SBA_ANALYSIS_5, SBA_ANALYSIS_6, SBA_ANALYSIS_7,"
				 + " SBA_ANALYSIS_8, SBA_ANALYSIS_9, SBA_ANALYSIS_10, SBA_ANALYSIS_11,"
				 + " SBA_ANALYSIS_12, SBA_ANALYSIS_13, SBA_ANALYSIS_14, SBA_ANALYSIS_15,"
				 + " SBA_ANALYSIS_16, SBA_ANALYSIS_17, SBA_ANALYSIS_18, SBA_ANALYSIS_19,"
				 + " SBA_ANALYSIS_20, SBA_ANALYSIS_21, SBA_ANALYSIS_22, SBA_ANALYSIS_23,"
				 + " SBA_ANALYSIS_24, SBA_ANALYSIS_25, SBA_ANALYSIS_26, SBA_ANALYSIS_27," 
				 + " SBA_ANALYSIS_28, SBA_ANALYSIS_29, SBA_ANALYSIS_30,SBA_COMMENTS", //selectList, 
				 "",
				 "",
				 new String[]{"SBA_SUBSCRIBER_ID","SBA_ID_NUMBER","SBA_MATCHCODE","SBA_MARKETING",
				 "SBA_THIRD_PARTY","SBA_CUST_DEPT","SBA_DEALER_ID","SBA_DEPARTMENT",
				 "SBA_SALESMAN","SBA_REGION","SBA_INVOICE_ADDRID","SBA_INV_ACCOUNT",
				 "SBA_PREPAID_STAT","SBA_ANALYSIS_1","SBA_ANALYSIS_2","SBA_ANALYSIS_3",
				 "SBA_ANALYSIS_4","SBA_ANALYSIS_5","SBA_ANALYSIS_6","SBA_ANALYSIS_7",
				 "SBA_ANALYSIS_8","SBA_ANALYSIS_9","SBA_ANALYSIS_10","SBA_ANALYSIS_11",
				 "SBA_ANALYSIS_12","SBA_ANALYSIS_13","SBA_ANALYSIS_14","SBA_ANALYSIS_15",
				 "SBA_ANALYSIS_16","SBA_ANALYSIS_17","SBA_ANALYSIS_18","SBA_ANALYSIS_19",
				 "SBA_ANALYSIS_20","SBA_ANALYSIS_21","SBA_ANALYSIS_22","SBA_ANALYSIS_23",
				 "SBA_ANALYSIS_24","SBA_ANALYSIS_25","SBA_ANALYSIS_26","SBA_ANALYSIS_27",
				 "SBA_ANALYSIS_28","SBA_ANALYSIS_29","SBA_ANALYSIS_30","SBA_COMMENTS"}, //fields, 
				 true);
		 	 
		 table.addFilterBy( "equalSbaSubscriberId", /* PK attribute */
	      "SBA_SUBSCRIBER_ID = ?" )
	         .addFilterBy( "filterBySbaSubscriberIdMatch", "SBA_SUBSCRIBER_ID LIKE ?" )
	         .addFilterBy( "INSbaSubscriberId", "(SBA_SUBSCRIBER_ID) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSubscriberId", "(SBA_SUBSCRIBER_ID) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSubscriberId", "(SBA_SUBSCRIBER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSubscriberId",
	      "(SBA_SUBSCRIBER_ID IS NULL OR LENGTH((SBA_SUBSCRIBER_ID)) IS NULL OR LENGTH((SBA_SUBSCRIBER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSubscriberId", "SBA_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSubscriberIdMatch", "SBA_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSubscriberId",
	      "(SBA_SUBSCRIBER_ID = ? OR SBA_SUBSCRIBER_ID IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSubscriberIdasc", "SBA_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSubscriberIddesc", "SBA_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaIdnumber", /* PK attribute */
	      "SBA_ID_NUMBER = ?" )
	         .addFilterBy( "filterBySbaIdnumberMatch", "SBA_ID_NUMBER LIKE ?" )
	         .addFilterBy( "INSbaIdnumber", "(SBA_ID_NUMBER) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaIdnumber", "(SBA_ID_NUMBER) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaIdnumber", "(SBA_ID_NUMBER) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaIdnumber",
	      "(SBA_ID_NUMBER IS NULL OR LENGTH((SBA_ID_NUMBER)) IS NULL OR LENGTH((SBA_ID_NUMBER)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaIdnumber", "SBA_ID_NUMBER IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaIdnumberMatch", "SBA_ID_NUMBER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaIdnumber",
	      "(SBA_ID_NUMBER = ? OR SBA_ID_NUMBER IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaIdnumberasc", "SBA_ID_NUMBER ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaIdnumberdesc", "SBA_ID_NUMBER DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaMatchcode", /* PK attribute */
	      "SBA_MATCHCODE = ?" )
	         .addFilterBy( "filterBySbaMatchcodeMatch", "SBA_MATCHCODE LIKE ?" )
	         .addFilterBy( "INSbaMatchcode", "(SBA_MATCHCODE) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaMatchcode", "(SBA_MATCHCODE) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaMatchcode", "(SBA_MATCHCODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaMatchcode",
	      "(SBA_MATCHCODE IS NULL OR LENGTH((SBA_MATCHCODE)) IS NULL OR LENGTH((SBA_MATCHCODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaMatchcode", "SBA_MATCHCODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaMatchcodeMatch", "SBA_MATCHCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaMatchcode",
	      "(SBA_MATCHCODE = ? OR SBA_MATCHCODE IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaMatchcodeasc", "SBA_MATCHCODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaMatchcodedesc", "SBA_MATCHCODE DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaMarketing", /* PK attribute */
	      "SBA_MARKETING = ?" )
	         .addFilterBy( "filterBySbaMarketingMatch", "SBA_MARKETING LIKE ?" )
	         .addFilterBy( "INSbaMarketing", "(SBA_MARKETING) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaMarketing", "(SBA_MARKETING) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaMarketing", "(SBA_MARKETING) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaMarketing",
	      "(SBA_MARKETING IS NULL OR LENGTH((SBA_MARKETING)) IS NULL OR LENGTH((SBA_MARKETING)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaMarketing", "SBA_MARKETING IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaMarketingMatch", "SBA_MARKETING LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaMarketing",
	      "(SBA_MARKETING = ? OR SBA_MARKETING IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaMarketingasc", "SBA_MARKETING ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaMarketingdesc", "SBA_MARKETING DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaThirdParty", /* PK attribute */
	      "SBA_THIRD_PARTY = ?" )
	         .addFilterBy( "filterBySbaThirdPartyMatch", "SBA_THIRD_PARTY LIKE ?" )
	         .addFilterBy( "INSbaThirdParty", "(SBA_THIRD_PARTY) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaThirdParty", "(SBA_THIRD_PARTY) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaThirdParty", "(SBA_THIRD_PARTY) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaThirdParty",
	      "(SBA_THIRD_PARTY IS NULL OR LENGTH((SBA_THIRD_PARTY)) IS NULL OR LENGTH((SBA_THIRD_PARTY)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaThirdParty", "SBA_THIRD_PARTY IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaThirdPartyMatch", "SBA_THIRD_PARTY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaThirdParty",
	      "(SBA_THIRD_PARTY = ? OR SBA_THIRD_PARTY IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaThirdPartyasc", "SBA_THIRD_PARTY ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaThirdPartydesc", "SBA_THIRD_PARTY DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaCustDept", /* PK attribute */
	      "SBA_CUST_DEPT = ?" )
	         .addFilterBy( "filterBySbaCustDeptMatch", "SBA_CUST_DEPT LIKE ?" )
	         .addFilterBy( "INSbaCustDept", "(SBA_CUST_DEPT) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaCustDept", "(SBA_CUST_DEPT) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaCustDept", "(SBA_CUST_DEPT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaCustDept",
	      "(SBA_CUST_DEPT IS NULL OR LENGTH((SBA_CUST_DEPT)) IS NULL OR LENGTH((SBA_CUST_DEPT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaCustDept", "SBA_CUST_DEPT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaCustDeptMatch", "SBA_CUST_DEPT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaCustDept",
	      "(SBA_CUST_DEPT = ? OR SBA_CUST_DEPT IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaCustDeptasc", "SBA_CUST_DEPT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaCustDeptdesc", "SBA_CUST_DEPT DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaDealerId", /* PK attribute */
	      "SBA_DEALER_ID = ?" )
	         .addFilterBy( "filterBySbaDealerIdMatch", "SBA_DEALER_ID LIKE ?" )
	         .addFilterBy( "INSbaDealerId", "(SBA_DEALER_ID) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaDealerId", "(SBA_DEALER_ID) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaDealerId", "(SBA_DEALER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaDealerId",
	      "(SBA_DEALER_ID IS NULL OR LENGTH((SBA_DEALER_ID)) IS NULL OR LENGTH((SBA_DEALER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaDealerId", "SBA_DEALER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaDealerIdMatch", "SBA_DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaDealerId",
	      "(SBA_DEALER_ID = ? OR SBA_DEALER_ID IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaDealerIdasc", "SBA_DEALER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaDealerIddesc", "SBA_DEALER_ID DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaDepartment", /* PK attribute */
	      "SBA_DEPARTMENT = ?" )
	         .addFilterBy( "filterBySbaDepartmentMatch", "SBA_DEPARTMENT LIKE ?" )
	         .addFilterBy( "INSbaDepartment", "(SBA_DEPARTMENT) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaDepartment", "(SBA_DEPARTMENT) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaDepartment", "(SBA_DEPARTMENT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaDepartment",
	      "(SBA_DEPARTMENT IS NULL OR LENGTH((SBA_DEPARTMENT)) IS NULL OR LENGTH((SBA_DEPARTMENT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaDepartment", "SBA_DEPARTMENT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaDepartmentMatch", "SBA_DEPARTMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaDepartment",
	      "(SBA_DEPARTMENT = ? OR SBA_DEPARTMENT IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaDepartmentasc", "SBA_DEPARTMENT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaDepartmentdesc", "SBA_DEPARTMENT DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSalesman", /* PK attribute */
	      "SBA_SALESMAN = ?" )
	         .addFilterBy( "filterBySbaSalesmanMatch", "SBA_SALESMAN LIKE ?" )
	         .addFilterBy( "INSbaSalesman", "(SBA_SALESMAN) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSalesman", "(SBA_SALESMAN) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSalesman", "(SBA_SALESMAN) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSalesman",
	      "(SBA_SALESMAN IS NULL OR LENGTH((SBA_SALESMAN)) IS NULL OR LENGTH((SBA_SALESMAN)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSalesman", "SBA_SALESMAN IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSalesmanMatch", "SBA_SALESMAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSalesman",
	      "(SBA_SALESMAN = ? OR SBA_SALESMAN IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSalesmanasc", "SBA_SALESMAN ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSalesmandesc", "SBA_SALESMAN DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaRegion", /* PK attribute */
	      "SBA_REGION = ?" )
	         .addFilterBy( "filterBySbaRegionMatch", "SBA_REGION LIKE ?" )
	         .addFilterBy( "INSbaRegion", "(SBA_REGION) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaRegion", "(SBA_REGION) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaRegion", "(SBA_REGION) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaRegion",
	      "(SBA_REGION IS NULL OR LENGTH((SBA_REGION)) IS NULL OR LENGTH((SBA_REGION)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaRegion", "SBA_REGION IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaRegionMatch", "SBA_REGION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaRegion",
	      "(SBA_REGION = ? OR SBA_REGION IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaRegionasc", "SBA_REGION ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaRegiondesc", "SBA_REGION DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaInvoiceAddrid", /* PK attribute */
	      "SBA_INVOICE_ADDRID = ?" )
	         .addFilterBy( "filterBySbaInvoiceAddridMatch", "SBA_INVOICE_ADDRID LIKE ?" )
	         .addFilterBy( "INSbaInvoiceAddrid", "(SBA_INVOICE_ADDRID) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaInvoiceAddrid", "(SBA_INVOICE_ADDRID) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaInvoiceAddrid", "(SBA_INVOICE_ADDRID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaInvoiceAddrid",
	      "(SBA_INVOICE_ADDRID IS NULL OR LENGTH((SBA_INVOICE_ADDRID)) IS NULL OR LENGTH((SBA_INVOICE_ADDRID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaInvoiceAddrid", "SBA_INVOICE_ADDRID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaInvoiceAddridMatch", "SBA_INVOICE_ADDRID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaInvoiceAddrid",
	      "(SBA_INVOICE_ADDRID = ? OR SBA_INVOICE_ADDRID IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaInvoiceAddridasc", "SBA_INVOICE_ADDRID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaInvoiceAddriddesc", "SBA_INVOICE_ADDRID DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaInvAccount", /* PK attribute */
	      "SBA_INV_ACCOUNT = ?" )
	         .addFilterBy( "filterBySbaInvAccountMatch", "SBA_INV_ACCOUNT LIKE ?" )
	         .addFilterBy( "INSbaInvAccount", "(SBA_INV_ACCOUNT) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaInvAccount", "(SBA_INV_ACCOUNT) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaInvAccount", "(SBA_INV_ACCOUNT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaInvAccount",
	      "(SBA_INV_ACCOUNT IS NULL OR LENGTH((SBA_INV_ACCOUNT)) IS NULL OR LENGTH((SBA_INV_ACCOUNT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaInvAccount", "SBA_INV_ACCOUNT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaInvAccountMatch", "SBA_INV_ACCOUNT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaInvAccount",
	      "(SBA_INV_ACCOUNT = ? OR SBA_INV_ACCOUNT IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaInvAccountasc", "SBA_INV_ACCOUNT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaInvAccountdesc", "SBA_INV_ACCOUNT DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaPrepaidStat", /* PK attribute */
	      "SBA_PREPAID_STAT = ?" )
	         .addFilterBy( "filterBySbaPrepaidStatMatch", "SBA_PREPAID_STAT LIKE ?" )
	         .addFilterBy( "INSbaPrepaidStat", "(SBA_PREPAID_STAT) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaPrepaidStat", "(SBA_PREPAID_STAT) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaPrepaidStat", "(SBA_PREPAID_STAT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaPrepaidStat",
	      "(SBA_PREPAID_STAT IS NULL OR LENGTH((SBA_PREPAID_STAT)) IS NULL OR LENGTH((SBA_PREPAID_STAT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaPrepaidStat", "SBA_PREPAID_STAT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaPrepaidStatMatch", "SBA_PREPAID_STAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaPrepaidStat",
	      "(SBA_PREPAID_STAT = ? OR SBA_PREPAID_STAT IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaPrepaidStatasc", "SBA_PREPAID_STAT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaPrepaidStatdesc", "SBA_PREPAID_STAT DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis1", /* PK attribute */
	      "SBA_ANALYSIS_1 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis1Match", "SBA_ANALYSIS_1 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis1", "(SBA_ANALYSIS_1) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis1", "(SBA_ANALYSIS_1) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis1", "(SBA_ANALYSIS_1) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis1",
	      "(SBA_ANALYSIS_1 IS NULL OR LENGTH((SBA_ANALYSIS_1)) IS NULL OR LENGTH((SBA_ANALYSIS_1)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis1", "SBA_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis1Match", "SBA_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis1",
	      "(SBA_ANALYSIS_1 = ? OR SBA_ANALYSIS_1 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis1asc", "SBA_ANALYSIS_1 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis1desc", "SBA_ANALYSIS_1 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis2", /* PK attribute */
	      "SBA_ANALYSIS_2 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis2Match", "SBA_ANALYSIS_2 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis2", "(SBA_ANALYSIS_2) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis2", "(SBA_ANALYSIS_2) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis2", "(SBA_ANALYSIS_2) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis2",
	      "(SBA_ANALYSIS_2 IS NULL OR LENGTH((SBA_ANALYSIS_2)) IS NULL OR LENGTH((SBA_ANALYSIS_2)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis2", "SBA_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis2Match", "SBA_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis2",
	      "(SBA_ANALYSIS_2 = ? OR SBA_ANALYSIS_2 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis2asc", "SBA_ANALYSIS_2 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis2desc", "SBA_ANALYSIS_2 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis3", /* PK attribute */
	      "SBA_ANALYSIS_3 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis3Match", "SBA_ANALYSIS_3 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis3", "(SBA_ANALYSIS_3) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis3", "(SBA_ANALYSIS_3) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis3", "(SBA_ANALYSIS_3) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis3",
	      "(SBA_ANALYSIS_3 IS NULL OR LENGTH((SBA_ANALYSIS_3)) IS NULL OR LENGTH((SBA_ANALYSIS_3)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis3", "SBA_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis3Match", "SBA_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis3",
	      "(SBA_ANALYSIS_3 = ? OR SBA_ANALYSIS_3 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis3asc", "SBA_ANALYSIS_3 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis3desc", "SBA_ANALYSIS_3 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis4", /* PK attribute */
	      "SBA_ANALYSIS_4 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis4Match", "SBA_ANALYSIS_4 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis4", "(SBA_ANALYSIS_4) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis4", "(SBA_ANALYSIS_4) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis4", "(SBA_ANALYSIS_4) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis4",
	      "(SBA_ANALYSIS_4 IS NULL OR LENGTH((SBA_ANALYSIS_4)) IS NULL OR LENGTH((SBA_ANALYSIS_4)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis4", "SBA_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis4Match", "SBA_ANALYSIS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis4",
	      "(SBA_ANALYSIS_4 = ? OR SBA_ANALYSIS_4 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis4asc", "SBA_ANALYSIS_4 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis4desc", "SBA_ANALYSIS_4 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis5", /* PK attribute */
	      "SBA_ANALYSIS_5 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis5Match", "SBA_ANALYSIS_5 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis5", "(SBA_ANALYSIS_5) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis5", "(SBA_ANALYSIS_5) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis5", "(SBA_ANALYSIS_5) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis5",
	      "(SBA_ANALYSIS_5 IS NULL OR LENGTH((SBA_ANALYSIS_5)) IS NULL OR LENGTH((SBA_ANALYSIS_5)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis5", "SBA_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis5Match", "SBA_ANALYSIS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis5",
	      "(SBA_ANALYSIS_5 = ? OR SBA_ANALYSIS_5 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis5asc", "SBA_ANALYSIS_5 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis5desc", "SBA_ANALYSIS_5 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis6", /* PK attribute */
	      "SBA_ANALYSIS_6 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis6Match", "SBA_ANALYSIS_6 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis6", "(SBA_ANALYSIS_6) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis6", "(SBA_ANALYSIS_6) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis6", "(SBA_ANALYSIS_6) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis6",
	      "(SBA_ANALYSIS_6 IS NULL OR LENGTH((SBA_ANALYSIS_6)) IS NULL OR LENGTH((SBA_ANALYSIS_6)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis6", "SBA_ANALYSIS_6 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis6Match", "SBA_ANALYSIS_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis6",
	      "(SBA_ANALYSIS_6 = ? OR SBA_ANALYSIS_6 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis6asc", "SBA_ANALYSIS_6 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis6desc", "SBA_ANALYSIS_6 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis7", /* PK attribute */
	      "SBA_ANALYSIS_7 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis7Match", "SBA_ANALYSIS_7 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis7", "(SBA_ANALYSIS_7) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis7", "(SBA_ANALYSIS_7) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis7", "(SBA_ANALYSIS_7) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis7",
	      "(SBA_ANALYSIS_7 IS NULL OR LENGTH((SBA_ANALYSIS_7)) IS NULL OR LENGTH((SBA_ANALYSIS_7)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis7", "SBA_ANALYSIS_7 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis7Match", "SBA_ANALYSIS_7 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis7",
	      "(SBA_ANALYSIS_7 = ? OR SBA_ANALYSIS_7 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis7asc", "SBA_ANALYSIS_7 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis7desc", "SBA_ANALYSIS_7 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis8", /* PK attribute */
	      "SBA_ANALYSIS_8 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis8Match", "SBA_ANALYSIS_8 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis8", "(SBA_ANALYSIS_8) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis8", "(SBA_ANALYSIS_8) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis8", "(SBA_ANALYSIS_8) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis8",
	      "(SBA_ANALYSIS_8 IS NULL OR LENGTH((SBA_ANALYSIS_8)) IS NULL OR LENGTH((SBA_ANALYSIS_8)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis8", "SBA_ANALYSIS_8 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis8Match", "SBA_ANALYSIS_8 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis8",
	      "(SBA_ANALYSIS_8 = ? OR SBA_ANALYSIS_8 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis8asc", "SBA_ANALYSIS_8 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis8desc", "SBA_ANALYSIS_8 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis9", /* PK attribute */
	      "SBA_ANALYSIS_9 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis9Match", "SBA_ANALYSIS_9 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis9", "(SBA_ANALYSIS_9) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis9", "(SBA_ANALYSIS_9) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis9", "(SBA_ANALYSIS_9) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis9",
	      "(SBA_ANALYSIS_9 IS NULL OR LENGTH((SBA_ANALYSIS_9)) IS NULL OR LENGTH((SBA_ANALYSIS_9)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis9", "SBA_ANALYSIS_9 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis9Match", "SBA_ANALYSIS_9 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis9",
	      "(SBA_ANALYSIS_9 = ? OR SBA_ANALYSIS_9 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis9asc", "SBA_ANALYSIS_9 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis9desc", "SBA_ANALYSIS_9 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis10", /* PK attribute */
	      "SBA_ANALYSIS_10 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis10Match", "SBA_ANALYSIS_10 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis10", "(SBA_ANALYSIS_10) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis10", "(SBA_ANALYSIS_10) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis10", "(SBA_ANALYSIS_10) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis10",
	      "(SBA_ANALYSIS_10 IS NULL OR LENGTH((SBA_ANALYSIS_10)) IS NULL OR LENGTH((SBA_ANALYSIS_10)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis10", "SBA_ANALYSIS_10 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis10Match", "SBA_ANALYSIS_10 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis10",
	      "(SBA_ANALYSIS_10 = ? OR SBA_ANALYSIS_10 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis10asc", "SBA_ANALYSIS_10 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis10desc", "SBA_ANALYSIS_10 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis11", /* PK attribute */
	      "SBA_ANALYSIS_11 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis11Match", "SBA_ANALYSIS_11 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis11", "(SBA_ANALYSIS_11) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis11", "(SBA_ANALYSIS_11) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis11", "(SBA_ANALYSIS_11) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis11",
	      "(SBA_ANALYSIS_11 IS NULL OR LENGTH((SBA_ANALYSIS_11)) IS NULL OR LENGTH((SBA_ANALYSIS_11)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis11", "SBA_ANALYSIS_11 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis11Match", "SBA_ANALYSIS_11 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis11",
	      "(SBA_ANALYSIS_11 = ? OR SBA_ANALYSIS_11 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis11asc", "SBA_ANALYSIS_11 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis11desc", "SBA_ANALYSIS_11 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis12", /* PK attribute */
	      "SBA_ANALYSIS_12 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis12Match", "SBA_ANALYSIS_12 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis12", "(SBA_ANALYSIS_12) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis12", "(SBA_ANALYSIS_12) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis12", "(SBA_ANALYSIS_12) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis12",
	      "(SBA_ANALYSIS_12 IS NULL OR LENGTH((SBA_ANALYSIS_12)) IS NULL OR LENGTH((SBA_ANALYSIS_12)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis12", "SBA_ANALYSIS_12 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis12Match", "SBA_ANALYSIS_12 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis12",
	      "(SBA_ANALYSIS_12 = ? OR SBA_ANALYSIS_12 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis12asc", "SBA_ANALYSIS_12 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis12desc", "SBA_ANALYSIS_12 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis13", /* PK attribute */
	      "SBA_ANALYSIS_13 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis13Match", "SBA_ANALYSIS_13 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis13", "(SBA_ANALYSIS_13) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis13", "(SBA_ANALYSIS_13) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis13", "(SBA_ANALYSIS_13) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis13",
	      "(SBA_ANALYSIS_13 IS NULL OR LENGTH((SBA_ANALYSIS_13)) IS NULL OR LENGTH((SBA_ANALYSIS_13)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis13", "SBA_ANALYSIS_13 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis13Match", "SBA_ANALYSIS_13 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis13",
	      "(SBA_ANALYSIS_13 = ? OR SBA_ANALYSIS_13 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis13asc", "SBA_ANALYSIS_13 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis13desc", "SBA_ANALYSIS_13 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis14", /* PK attribute */
	      "SBA_ANALYSIS_14 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis14Match", "SBA_ANALYSIS_14 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis14", "(SBA_ANALYSIS_14) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis14", "(SBA_ANALYSIS_14) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis14", "(SBA_ANALYSIS_14) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis14",
	      "(SBA_ANALYSIS_14 IS NULL OR LENGTH((SBA_ANALYSIS_14)) IS NULL OR LENGTH((SBA_ANALYSIS_14)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis14", "SBA_ANALYSIS_14 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis14Match", "SBA_ANALYSIS_14 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis14",
	      "(SBA_ANALYSIS_14 = ? OR SBA_ANALYSIS_14 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis14asc", "SBA_ANALYSIS_14 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis14desc", "SBA_ANALYSIS_14 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis15", /* PK attribute */
	      "SBA_ANALYSIS_15 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis15Match", "SBA_ANALYSIS_15 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis15", "(SBA_ANALYSIS_15) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis15", "(SBA_ANALYSIS_15) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis15", "(SBA_ANALYSIS_15) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis15",
	      "(SBA_ANALYSIS_15 IS NULL OR LENGTH((SBA_ANALYSIS_15)) IS NULL OR LENGTH((SBA_ANALYSIS_15)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis15", "SBA_ANALYSIS_15 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis15Match", "SBA_ANALYSIS_15 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis15",
	      "(SBA_ANALYSIS_15 = ? OR SBA_ANALYSIS_15 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis15asc", "SBA_ANALYSIS_15 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis15desc", "SBA_ANALYSIS_15 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis16", /* PK attribute */
	      "SBA_ANALYSIS_16 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis16Match", "SBA_ANALYSIS_16 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis16", "(SBA_ANALYSIS_16) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis16", "(SBA_ANALYSIS_16) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis16", "(SBA_ANALYSIS_16) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis16",
	      "(SBA_ANALYSIS_16 IS NULL OR LENGTH((SBA_ANALYSIS_16)) IS NULL OR LENGTH((SBA_ANALYSIS_16)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis16", "SBA_ANALYSIS_16 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis16Match", "SBA_ANALYSIS_16 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis16",
	      "(SBA_ANALYSIS_16 = ? OR SBA_ANALYSIS_16 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis16asc", "SBA_ANALYSIS_16 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis16desc", "SBA_ANALYSIS_16 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis17", /* PK attribute */
	      "SBA_ANALYSIS_17 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis17Match", "SBA_ANALYSIS_17 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis17", "(SBA_ANALYSIS_17) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis17", "(SBA_ANALYSIS_17) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis17", "(SBA_ANALYSIS_17) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis17",
	      "(SBA_ANALYSIS_17 IS NULL OR LENGTH((SBA_ANALYSIS_17)) IS NULL OR LENGTH((SBA_ANALYSIS_17)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis17", "SBA_ANALYSIS_17 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis17Match", "SBA_ANALYSIS_17 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis17",
	      "(SBA_ANALYSIS_17 = ? OR SBA_ANALYSIS_17 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis17asc", "SBA_ANALYSIS_17 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis17desc", "SBA_ANALYSIS_17 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis18", /* PK attribute */
	      "SBA_ANALYSIS_18 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis18Match", "SBA_ANALYSIS_18 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis18", "(SBA_ANALYSIS_18) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis18", "(SBA_ANALYSIS_18) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis18", "(SBA_ANALYSIS_18) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis18",
	      "(SBA_ANALYSIS_18 IS NULL OR LENGTH((SBA_ANALYSIS_18)) IS NULL OR LENGTH((SBA_ANALYSIS_18)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis18", "SBA_ANALYSIS_18 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis18Match", "SBA_ANALYSIS_18 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis18",
	      "(SBA_ANALYSIS_18 = ? OR SBA_ANALYSIS_18 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis18asc", "SBA_ANALYSIS_18 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis18desc", "SBA_ANALYSIS_18 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis19", /* PK attribute */
	      "SBA_ANALYSIS_19 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis19Match", "SBA_ANALYSIS_19 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis19", "(SBA_ANALYSIS_19) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis19", "(SBA_ANALYSIS_19) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis19", "(SBA_ANALYSIS_19) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis19",
	      "(SBA_ANALYSIS_19 IS NULL OR LENGTH((SBA_ANALYSIS_19)) IS NULL OR LENGTH((SBA_ANALYSIS_19)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis19", "SBA_ANALYSIS_19 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis19Match", "SBA_ANALYSIS_19 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis19",
	      "(SBA_ANALYSIS_19 = ? OR SBA_ANALYSIS_19 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis19asc", "SBA_ANALYSIS_19 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis19desc", "SBA_ANALYSIS_19 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis20", /* PK attribute */
	      "SBA_ANALYSIS_20 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis20Match", "SBA_ANALYSIS_20 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis20", "(SBA_ANALYSIS_20) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis20", "(SBA_ANALYSIS_20) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis20", "(SBA_ANALYSIS_20) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis20",
	      "(SBA_ANALYSIS_20 IS NULL OR LENGTH((SBA_ANALYSIS_20)) IS NULL OR LENGTH((SBA_ANALYSIS_20)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis20", "SBA_ANALYSIS_20 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis20Match", "SBA_ANALYSIS_20 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis20",
	      "(SBA_ANALYSIS_20 = ? OR SBA_ANALYSIS_20 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis20asc", "SBA_ANALYSIS_20 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis20desc", "SBA_ANALYSIS_20 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis21", /* PK attribute */
	      "SBA_ANALYSIS_21 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis21Match", "SBA_ANALYSIS_21 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis21", "(SBA_ANALYSIS_21) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis21", "(SBA_ANALYSIS_21) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis21", "(SBA_ANALYSIS_21) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis21",
	      "(SBA_ANALYSIS_21 IS NULL OR LENGTH((SBA_ANALYSIS_21)) IS NULL OR LENGTH((SBA_ANALYSIS_21)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis21", "SBA_ANALYSIS_21 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis21Match", "SBA_ANALYSIS_21 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis21",
	      "(SBA_ANALYSIS_21 = ? OR SBA_ANALYSIS_21 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis21asc", "SBA_ANALYSIS_21 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis21desc", "SBA_ANALYSIS_21 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis22", /* PK attribute */
	      "SBA_ANALYSIS_22 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis22Match", "SBA_ANALYSIS_22 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis22", "(SBA_ANALYSIS_22) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis22", "(SBA_ANALYSIS_22) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis22", "(SBA_ANALYSIS_22) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis22",
	      "(SBA_ANALYSIS_22 IS NULL OR LENGTH((SBA_ANALYSIS_22)) IS NULL OR LENGTH((SBA_ANALYSIS_22)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis22", "SBA_ANALYSIS_22 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis22Match", "SBA_ANALYSIS_22 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis22",
	      "(SBA_ANALYSIS_22 = ? OR SBA_ANALYSIS_22 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis22asc", "SBA_ANALYSIS_22 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis22desc", "SBA_ANALYSIS_22 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis23", /* PK attribute */
	      "SBA_ANALYSIS_23 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis23Match", "SBA_ANALYSIS_23 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis23", "(SBA_ANALYSIS_23) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis23", "(SBA_ANALYSIS_23) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis23", "(SBA_ANALYSIS_23) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis23",
	      "(SBA_ANALYSIS_23 IS NULL OR LENGTH((SBA_ANALYSIS_23)) IS NULL OR LENGTH((SBA_ANALYSIS_23)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis23", "SBA_ANALYSIS_23 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis23Match", "SBA_ANALYSIS_23 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis23",
	      "(SBA_ANALYSIS_23 = ? OR SBA_ANALYSIS_23 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis23asc", "SBA_ANALYSIS_23 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis23desc", "SBA_ANALYSIS_23 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis24", /* PK attribute */
	      "SBA_ANALYSIS_24 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis24Match", "SBA_ANALYSIS_24 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis24", "(SBA_ANALYSIS_24) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis24", "(SBA_ANALYSIS_24) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis24", "(SBA_ANALYSIS_24) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis24",
	      "(SBA_ANALYSIS_24 IS NULL OR LENGTH((SBA_ANALYSIS_24)) IS NULL OR LENGTH((SBA_ANALYSIS_24)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis24", "SBA_ANALYSIS_24 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis24Match", "SBA_ANALYSIS_24 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis24",
	      "(SBA_ANALYSIS_24 = ? OR SBA_ANALYSIS_24 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis24asc", "SBA_ANALYSIS_24 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis24desc", "SBA_ANALYSIS_24 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis25", /* PK attribute */
	      "SBA_ANALYSIS_25 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis25Match", "SBA_ANALYSIS_25 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis25", "(SBA_ANALYSIS_25) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis25", "(SBA_ANALYSIS_25) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis25", "(SBA_ANALYSIS_25) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis25",
	      "(SBA_ANALYSIS_25 IS NULL OR LENGTH((SBA_ANALYSIS_25)) IS NULL OR LENGTH((SBA_ANALYSIS_25)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis25", "SBA_ANALYSIS_25 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis25Match", "SBA_ANALYSIS_25 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis25",
	      "(SBA_ANALYSIS_25 = ? OR SBA_ANALYSIS_25 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis25asc", "SBA_ANALYSIS_25 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis25desc", "SBA_ANALYSIS_25 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis26", /* PK attribute */
	      "SBA_ANALYSIS_26 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis26Match", "SBA_ANALYSIS_26 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis26", "(SBA_ANALYSIS_26) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis26", "(SBA_ANALYSIS_26) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis26", "(SBA_ANALYSIS_26) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis26",
	      "(SBA_ANALYSIS_26 IS NULL OR LENGTH((SBA_ANALYSIS_26)) IS NULL OR LENGTH((SBA_ANALYSIS_26)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis26", "SBA_ANALYSIS_26 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis26Match", "SBA_ANALYSIS_26 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis26",
	      "(SBA_ANALYSIS_26 = ? OR SBA_ANALYSIS_26 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis26asc", "SBA_ANALYSIS_26 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis26desc", "SBA_ANALYSIS_26 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis27", /* PK attribute */
	      "SBA_ANALYSIS_27 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis27Match", "SBA_ANALYSIS_27 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis27", "(SBA_ANALYSIS_27) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis27", "(SBA_ANALYSIS_27) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis27", "(SBA_ANALYSIS_27) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis27",
	      "(SBA_ANALYSIS_27 IS NULL OR LENGTH((SBA_ANALYSIS_27)) IS NULL OR LENGTH((SBA_ANALYSIS_27)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis27", "SBA_ANALYSIS_27 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis27Match", "SBA_ANALYSIS_27 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis27",
	      "(SBA_ANALYSIS_27 = ? OR SBA_ANALYSIS_27 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis27asc", "SBA_ANALYSIS_27 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis27desc", "SBA_ANALYSIS_27 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis28", /* PK attribute */
	      "SBA_ANALYSIS_28 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis28Match", "SBA_ANALYSIS_28 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis28", "(SBA_ANALYSIS_28) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis28", "(SBA_ANALYSIS_28) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis28", "(SBA_ANALYSIS_28) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis28",
	      "(SBA_ANALYSIS_28 IS NULL OR LENGTH((SBA_ANALYSIS_28)) IS NULL OR LENGTH((SBA_ANALYSIS_28)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis28", "SBA_ANALYSIS_28 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis28Match", "SBA_ANALYSIS_28 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis28",
	      "(SBA_ANALYSIS_28 = ? OR SBA_ANALYSIS_28 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis28asc", "SBA_ANALYSIS_28 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis28desc", "SBA_ANALYSIS_28 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis29", /* PK attribute */
	      "SBA_ANALYSIS_29 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis29Match", "SBA_ANALYSIS_29 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis29", "(SBA_ANALYSIS_29) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis29", "(SBA_ANALYSIS_29) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis29", "(SBA_ANALYSIS_29) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis29",
	      "(SBA_ANALYSIS_29 IS NULL OR LENGTH((SBA_ANALYSIS_29)) IS NULL OR LENGTH((SBA_ANALYSIS_29)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis29", "SBA_ANALYSIS_29 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis29Match", "SBA_ANALYSIS_29 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis29",
	      "(SBA_ANALYSIS_29 = ? OR SBA_ANALYSIS_29 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis29asc", "SBA_ANALYSIS_29 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis29desc", "SBA_ANALYSIS_29 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaSbaAanalysis30", /* PK attribute */
	      "SBA_ANALYSIS_30 = ?" )
	         .addFilterBy( "filterBySbaSbaAanalysis30Match", "SBA_ANALYSIS_30 LIKE ?" )
	         .addFilterBy( "INSbaSbaAanalysis30", "(SBA_ANALYSIS_30) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaSbaAanalysis30", "(SBA_ANALYSIS_30) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaSbaAanalysis30", "(SBA_ANALYSIS_30) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaSbaAanalysis30",
	      "(SBA_ANALYSIS_30 IS NULL OR LENGTH((SBA_ANALYSIS_30)) IS NULL OR LENGTH((SBA_ANALYSIS_30)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaSbaAanalysis30", "SBA_ANALYSIS_30 IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaSbaAanalysis30Match", "SBA_ANALYSIS_30 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaSbaAanalysis30",
	      "(SBA_ANALYSIS_30 = ? OR SBA_ANALYSIS_30 IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaSbaAanalysis30asc", "SBA_ANALYSIS_30 ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaSbaAanalysis30desc", "SBA_ANALYSIS_30 DESC" ) // ORDER DESCENDING
	    ;
		 
		 table.addFilterBy( "equalSbaComments", /* PK attribute */
	      "SBA_COMMENTS = ?" )
	         .addFilterBy( "filterBySbaCommentsMatch", "SBA_COMMENTS LIKE ?" )
	         .addFilterBy( "INSbaComments", "(SBA_COMMENTS) IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSbaComments", "(SBA_COMMENTS) NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalSbaComments", "(SBA_COMMENTS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSbaComments",
	      "(SBA_COMMENTS IS NULL OR LENGTH((SBA_COMMENTS)) IS NULL OR LENGTH((SBA_COMMENTS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSbaComments", "SBA_COMMENTS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySbaCommentsMatch", "SBA_COMMENTS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSbaComments",
	      "(SBA_COMMENTS = ? OR SBA_COMMENTS IS NULL)" ) // EQUALORNULL
	                                                               // TODO : we may need to wrap this with a () 

	         .addOrderBy( "SbaCommentsasc", "SBA_COMMENTS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SbaCommentsdesc", "SBA_COMMENTS DESC" ) // ORDER DESCENDING
	    ;
		 
	 }


	public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SbaSubAuxDMLFactory(  );
	    }
	    return dml;
	  }

}