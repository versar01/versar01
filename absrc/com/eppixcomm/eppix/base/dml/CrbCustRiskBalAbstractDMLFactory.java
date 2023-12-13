package com.eppixcomm.eppix.base.dml;

public class CrbCustRiskBalAbstractDMLFactory extends BaseDMLFactory {
	
	private static DMLFactory dml = null;
	  
	protected CrbCustRiskBalAbstractDMLFactory() throws DMLException {

	    DMLTable table = defTable( "crbCustRiskBal", // dmlName
	            "blo.CrbCustRiskBalDMO", // dmoName
	            "CRB_CUST_RISK_BAL", // tableName
	            23, // numColumns
	            "CRB_BILL_AC_NO, CRB_ACCOUNT_TYPE, CRB_CREDIT_LIMIT, CRB_ACC_BAL, "
	            + "CRB_UNBILL_CHARGES, CRB_UNBILL_CALLS, CRB_DIFF, CRB_NEXT_THRESHOLD, "
	            + "CRB_PREV_THRESHOLD, CRB_COLL_PLAN, CRB_MIN_THRESHOLD, CRB_ACTIVATE_FLAG, "
	            + "CRB_EAP_FLAG, CRB_BL_STATUS, CRB_BL_TYPE, CRB_BL_LIMIT, CRB_BL_DIFF, "
	            + "CRB_BL_NEXT_THRESH, CRB_BL_PREV_THRESH, CRB_BL_NEXT_ACN_ID, CRB_BL_PREV_ACN_ID, "
	            + "CRB_BL_TRIG_FLAG, CRB_BL_LAST_UPDATE", // columnList
	            "CRB_BILL_AC_NO", //primaryKey
	            "" // versionCol     
	          , false, // generatedKey
	          "CRB_BILL_AC_NO, CRB_ACCOUNT_TYPE, CRB_CREDIT_LIMIT, CRB_ACC_BAL, "
	            + "CRB_UNBILL_CHARGES, CRB_UNBILL_CALLS, CRB_DIFF, CRB_NEXT_THRESHOLD, "
	            + "CRB_PREV_THRESHOLD, CRB_COLL_PLAN, CRB_MIN_THRESHOLD, CRB_ACTIVATE_FLAG, "
	            + "CRB_EAP_FLAG, CRB_BL_STATUS, CRB_BL_TYPE, CRB_BL_LIMIT, CRB_BL_DIFF, "
	            + "CRB_BL_NEXT_THRESH, CRB_BL_PREV_THRESH, CRB_BL_NEXT_ACN_ID, CRB_BL_PREV_ACN_ID, "
	            + "CRB_BL_TRIG_FLAG, CRB_BL_LAST_UPDATE", "", "",
	            new String[] {
	    		"CRB_BILL_AC_NO", "CRB_ACCOUNT_TYPE", "CRB_CREDIT_LIMIT", "CRB_ACC_BAL", "CRB_UNBILL_CHARGES",
	    		 "CRB_UNBILL_CALLS", "CRB_DIFF", "CRB_NEXT_THRESHOLD", "CRB_PREV_THRESHOLD", "CRB_COLL_PLAN",
	    		 "CRB_MIN_THRESHOLD", "CRB_ACTIVATE_FLAG", "CRB_EAP_FLAG", "CRB_BL_STATUS", "CRB_BL_TYPE",
	    		 "CRB_BL_LIMIT", "CRB_BL_DIFF", "CRB_BL_NEXT_THRESH", "CRB_BL_PREV_THRESH", "CRB_BL_NEXT_ACN_ID",
	    		 "CRB_BL_PREV_ACN_ID", "CRB_BL_TRIG_FLAG", "CRB_BL_LAST_UPDATE"
	            } );
		
	    table.addFilterBy( "equalcrbBillAcNo", /* PK attribute */
	      "CRB_BILL_AC_NO = ?" )
	         .addFilterBy( "filterBycrbBillAcNoMatch",
	      "CRB_BILL_AC_NO LIKE ?" )
	         .addFilterBy( "INcrbBillAcNo", "CRB_BILL_AC_NO IN ( ? )" ) // IN

	         .addFilterBy( "NOTINcrbBillAcNo", "CRB_BILL_AC_NO NOT IN ( ? )" ) // NOT IN

	         .addFilterBy( "notequalcrbBillAcNo", "CRB_BILL_AC_NO != ?" ) // NOTEQUAL

	         .addFilterBy( "nullcrbBillAcNo",
	      "(CRB_BILL_AC_NO IS NULL OR LENGTH(CRB_BILL_AC_NO) IS NULL OR LENGTH(CRB_BILL_AC_NO) = 0)" ) // IS NULL

	         .addFilterBy( "notnullcrbBillAcNo", "CRB_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthancrbBillAcNo", "CRB_BILL_AC_NO < ?" ) // LESS THAN

	         .addFilterBy( "greaterthancrbBillAcNo", "CRB_BILL_AC_NO > ?" ) // GREATER THAN

	         .addFilterBy( "filterBycrbBillAcNoMatch",
	      "CRB_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullcrbBillAcNo",
	      "(CRB_BILL_AC_NO = ? OR CRB_BILL_AC_NO IS NULL)" ) // EQUALORNULL
	                                                             // TODO : we may need to wrap this with a TRIM() 

	         .addOrderBy( "crbBillAcNoasc", "CRB_BILL_AC_NO ASC" ) // ORDER ASCENDING

	         .addOrderBy( "crbBillAcNodesc", "CRB_BILL_AC_NO DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalcrbAccountType", "CRB_ACCOUNT_TYPE = ?" ) // EQUAL

        .addFilterBy( "notequalcrbAccountType", "CRB_ACCOUNT_TYPE != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbAccountType",
     "(CRB_ACCOUNT_TYPE IS NULL OR LENGTH(CRB_ACCOUNT_TYPE) IS NULL OR LENGTH(CRB_ACCOUNT_TYPE) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbAccountType", "CRB_ACCOUNT_TYPE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbAccountType", "CRB_ACCOUNT_TYPE < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbAccountType", "CRB_ACCOUNT_TYPE > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbAccountTypeMatch", "CRB_ACCOUNT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbAccountType",
     "(CRB_ACCOUNT_TYPE = ? OR CRB_ACCOUNT_TYPE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbAccountType", "CRB_ACCOUNT_TYPE IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbAccountType", "CRB_ACCOUNT_TYPE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbAccountTypeasc", "CRB_ACCOUNT_TYPE ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbAccountTypedesc", "CRB_ACCOUNT_TYPE DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbCreditLimit", "CRB_CREDIT_LIMIT = ?" ) // EQUAL

        .addFilterBy( "notequalcrbCreditLimit", "CRB_CREDIT_LIMIT != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbCreditLimit",
     "(CRB_CREDIT_LIMIT IS NULL OR LENGTH(CRB_CREDIT_LIMIT) IS NULL OR LENGTH(CRB_CREDIT_LIMIT) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbCreditLimit", "CRB_CREDIT_LIMIT IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbCreditLimit", "CRB_CREDIT_LIMIT < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbCreditLimit", "CRB_CREDIT_LIMIT > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbCreditLimitMatch", "CRB_CREDIT_LIMIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbCreditLimit",
     "(CRB_CREDIT_LIMIT = ? OR CRB_CREDIT_LIMIT IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbCreditLimit", "CRB_CREDIT_LIMIT IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbCreditLimit", "CRB_CREDIT_LIMIT NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbCreditLimitasc", "CRB_CREDIT_LIMIT ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbCreditLimitdesc", "CRB_CREDIT_LIMIT DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbAccBal", "CRB_ACC_BAL = ?" ) // EQUAL

        .addFilterBy( "notequalcrbAccBal", "CRB_ACC_BAL != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbAccBal",
     "(CRB_ACC_BAL IS NULL OR LENGTH(CRB_ACC_BAL) IS NULL OR LENGTH(CRB_ACC_BAL) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbAccBal", "CRB_ACC_BAL IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbAccBal", "CRB_ACC_BAL < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbAccBal", "CRB_ACC_BAL > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbAccBalMatch", "CRB_ACC_BAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbAccBal",
     "(CRB_ACC_BAL = ? OR CRB_ACC_BAL IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbAccBal", "CRB_ACC_BAL IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbAccBal", "CRB_ACC_BAL NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbAccBalasc", "CRB_ACC_BAL ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbAccBaldesc", "CRB_ACC_BAL DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbUnbillCharges", "CRB_UNBILL_CHARGES = ?" ) // EQUAL

        .addFilterBy( "notequalcrbUnbillCharges", "CRB_UNBILL_CHARGES != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbUnbillCharges",
     "(CRB_UNBILL_CHARGES IS NULL OR LENGTH(CRB_UNBILL_CHARGES) IS NULL OR LENGTH(CRB_UNBILL_CHARGES) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbUnbillCharges", "CRB_UNBILL_CHARGES IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbUnbillCharges", "CRB_UNBILL_CHARGES < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbUnbillCharges", "CRB_UNBILL_CHARGES > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbUnbillChargesMatch", "CRB_UNBILL_CHARGES LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbUnbillCharges",
     "(CRB_UNBILL_CHARGES = ? OR CRB_UNBILL_CHARGES IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbUnbillCharges", "CRB_UNBILL_CHARGES IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbUnbillCharges", "CRB_UNBILL_CHARGES NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbUnbillChargesasc", "CRB_UNBILL_CHARGES ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbUnbillChargesdesc", "CRB_UNBILL_CHARGES DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbUnbillCalls", "CRB_UNBILL_CALLS = ?" ) // EQUAL

        .addFilterBy( "notequalcrbUnbillCalls", "CRB_UNBILL_CALLS != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbUnbillCalls",
     "(CRB_UNBILL_CALLS IS NULL OR LENGTH(CRB_UNBILL_CALLS) IS NULL OR LENGTH(CRB_UNBILL_CALLS) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbUnbillCalls", "CRB_UNBILL_CALLS IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbUnbillCalls", "CRB_UNBILL_CALLS < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbUnbillCalls", "CRB_UNBILL_CALLS > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbUnbillCallsMatch", "CRB_UNBILL_CALLS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbUnbillCalls",
     "(CRB_UNBILL_CALLS = ? OR CRB_UNBILL_CALLS IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbUnbillCalls", "CRB_UNBILL_CALLS IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbUnbillCalls", "CRB_UNBILL_CALLS NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbUnbillCallsasc", "CRB_UNBILL_CALLS ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbUnbillCallsdesc", "CRB_UNBILL_CALLS DESC" ) // ORDER DESCENDING
   ;
	    

	    table.addFilterBy( "equalcrbDiff", "CRB_DIFF = ?" ) // EQUAL

	         .addFilterBy( "notequalcrbDiff", "CRB_DIFF != ?" ) // NOTEQUAL

	         .addFilterBy( "nullcrbDiff",
	      "(CRB_DIFF IS NULL OR LENGTH(CRB_DIFF) IS NULL OR LENGTH(CRB_DIFF) = 0)" ) // IS NULL

	         .addFilterBy( "notnullcrbDiff", "CRB_DIFF IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "lessthancrbDiff", "CRB_DIFF < ?" ) // LESS THAN

	         .addFilterBy( "greaterthancrbDiff", "CRB_DIFF > ?" ) // GREATER THAN

	         .addFilterBy( "filterBycrbDiffMatch", "CRB_DIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullcrbDiff",
	      "(CRB_DIFF = ? OR CRB_DIFF IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INcrbDiff", "CRB_DIFF IN ( ? )" ) // IN

	         .addFilterBy( "NOTINcrbDiff", "CRB_DIFF NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "crbDiffasc", "CRB_DIFF ASC" ) // ORDER ASCENDING

	         .addOrderBy( "crbDiffdesc", "CRB_DIFF DESC" ) // ORDER DESCENDING
	    ;
	    
	    table.addFilterBy( "equalcrbNextThreshold", "CRB_NEXT_THRESHOLD = ?" ) // EQUAL

        .addFilterBy( "notequalcrbNextThreshold", "CRB_NEXT_THRESHOLD != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbNextThreshold",
     "(CRB_NEXT_THRESHOLD IS NULL OR LENGTH(CRB_NEXT_THRESHOLD) IS NULL OR LENGTH(CRB_NEXT_THRESHOLD) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbNextThreshold", "CRB_NEXT_THRESHOLD IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbNextThreshold", "CRB_NEXT_THRESHOLD < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbNextThreshold", "CRB_NEXT_THRESHOLD > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbNextThresholdMatch", "CRB_NEXT_THRESHOLD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbNextThreshold",
     "(CRB_NEXT_THRESHOLD = ? OR CRB_NEXT_THRESHOLD IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbNextThreshold", "CRB_NEXT_THRESHOLD IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbNextThreshold", "CRB_NEXT_THRESHOLD NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbNextThresholdasc", "CRB_NEXT_THRESHOLD ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbNextThresholddesc", "CRB_NEXT_THRESHOLD DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbPrevThreshold", "CRB_PREV_THRESHOLD = ?" ) // EQUAL

        .addFilterBy( "notequalcrbPrevThreshold", "CRB_PREV_THRESHOLD != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbPrevThreshold",
     "(CRB_PREV_THRESHOLD IS NULL OR LENGTH(CRB_PREV_THRESHOLD) IS NULL OR LENGTH(CRB_PREV_THRESHOLD) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbPrevThreshold", "CRB_PREV_THRESHOLD IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbPrevThreshold", "CRB_PREV_THRESHOLD < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbPrevThreshold", "CRB_PREV_THRESHOLD > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbPrevThresholdMatch", "CRB_PREV_THRESHOLD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbPrevThreshold",
     "(CRB_PREV_THRESHOLD = ? OR CRB_PREV_THRESHOLD IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbPrevThreshold", "CRB_PREV_THRESHOLD IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbPrevThreshold", "CRB_PREV_THRESHOLD NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbPrevThresholdasc", "CRB_PREV_THRESHOLD ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbPrevThresholddesc", "CRB_PREV_THRESHOLD DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbCollPlan", "CRB_COLL_PLAN = ?" ) // EQUAL

        .addFilterBy( "notequalcrbCollPlan", "CRB_COLL_PLAN != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbCollPlan",
     "(CRB_COLL_PLAN IS NULL OR LENGTH(CRB_COLL_PLAN) IS NULL OR LENGTH(CRB_COLL_PLAN) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbCollPlan", "CRB_COLL_PLAN IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbCollPlan", "CRB_COLL_PLAN < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbCollPlan", "CRB_COLL_PLAN > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbCollPlanMatch", "CRB_COLL_PLAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbCollPlan",
     "(CRB_COLL_PLAN = ? OR CRB_COLL_PLAN IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbCollPlan", "CRB_COLL_PLAN IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbCollPlan", "CRB_COLL_PLAN NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbCollPlanasc", "CRB_COLL_PLAN ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbCollPlandesc", "CRB_COLL_PLAN DESC" ) // ORDER DESCENDING
   ;

	    
	    table.addFilterBy( "equalcrbMinThreshold", "CRB_MIN_THRESHOLD = ?" ) // EQUAL

        .addFilterBy( "notequalcrbMinThreshold", "CRB_MIN_THRESHOLD != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbMinThreshold",
     "(CRB_MIN_THRESHOLD IS NULL OR LENGTH(CRB_MIN_THRESHOLD) IS NULL OR LENGTH(CRB_MIN_THRESHOLD) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbMinThreshold", "CRB_MIN_THRESHOLD IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbMinThreshold", "CRB_MIN_THRESHOLD < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbMinThreshold", "CRB_MIN_THRESHOLD > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbMinThresholdMatch", "CRB_MIN_THRESHOLD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbMinThreshold",
     "(CRB_MIN_THRESHOLD = ? OR CRB_MIN_THRESHOLD IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbMinThreshold", "CRB_MIN_THRESHOLD IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbMinThreshold", "CRB_MIN_THRESHOLD NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbMinThresholdasc", "CRB_MIN_THRESHOLD ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbMinThresholddesc", "CRB_MIN_THRESHOLD DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbActivateFlag", "CRB_ACTIVATE_FLAG = ?" ) // EQUAL

        .addFilterBy( "notequalcrbActivateFlag", "CRB_ACTIVATE_FLAG != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbActivateFlag",
     "(CRB_ACTIVATE_FLAG IS NULL OR LENGTH(CRB_ACTIVATE_FLAG) IS NULL OR LENGTH(CRB_ACTIVATE_FLAG) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbActivateFlag", "CRB_ACTIVATE_FLAG IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbActivateFlag", "CRB_ACTIVATE_FLAG < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbActivateFlag", "CRB_ACTIVATE_FLAG > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbActivateFlagMatch", "CRB_ACTIVATE_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbActivateFlag",
     "(CRB_ACTIVATE_FLAG = ? OR CRB_ACTIVATE_FLAG IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbActivateFlag", "CRB_ACTIVATE_FLAG IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbActivateFlag", "CRB_ACTIVATE_FLAG NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbActivateFlagasc", "CRB_ACTIVATE_FLAG ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbActivateFlagdesc", "CRB_ACTIVATE_FLAG DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbEapFlag", "CRB_EAP_FLAG = ?" ) // EQUAL

        .addFilterBy( "notequalcrbEapFlag", "CRB_EAP_FLAG != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbEapFlag",
     "(CRB_EAP_FLAG IS NULL OR LENGTH(CRB_EAP_FLAG) IS NULL OR LENGTH(CRB_EAP_FLAG) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbEapFlag", "CRB_EAP_FLAG IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbEapFlag", "CRB_EAP_FLAG < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbEapFlag", "CRB_EAP_FLAG > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbEapFlagMatch", "CRB_EAP_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbEapFlag",
     "(CRB_EAP_FLAG = ? OR CRB_EAP_FLAG IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbEapFlag", "CRB_EAP_FLAG IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbEapFlag", "CRB_EAP_FLAG NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbEapFlagasc", "CRB_EAP_FLAG ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbEapFlagdesc", "CRB_EAP_FLAG DESC" ) // ORDER DESCENDING
   ;

	    
	    table.addFilterBy( "equalcrbBlStatus", "CRB_BL_STATUS = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlStatus", "CRB_BL_STATUS != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlStatus",
     "(CRB_BL_STATUS IS NULL OR LENGTH(CRB_BL_STATUS) IS NULL OR LENGTH(CRB_BL_STATUS) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlStatus", "CRB_BL_STATUS IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlStatus", "CRB_BL_STATUS < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlStatus", "CRB_BL_STATUS > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlStatusMatch", "CRB_BL_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlStatus",
     "(CRB_BL_STATUS = ? OR CRB_BL_STATUS IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlStatus", "CRB_BL_STATUS IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlStatus", "CRB_BL_STATUS NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlStatusasc", "CRB_BL_STATUS ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlStatusdesc", "CRB_BL_STATUS DESC" ) // ORDER DESCENDING
   ;

	    
	    table.addFilterBy( "equalcrbBlType", "CRB_BL_TYPE = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlType", "CRB_BL_TYPE != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlType",
     "(CRB_BL_TYPE IS NULL OR LENGTH(CRB_BL_TYPE) IS NULL OR LENGTH(CRB_BL_TYPE) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlType", "CRB_BL_TYPE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlType", "CRB_BL_TYPE < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlType", "CRB_BL_TYPE > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlTypeMatch", "CRB_BL_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlType",
     "(CRB_BL_TYPE = ? OR CRB_BL_TYPE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlType", "CRB_BL_TYPE IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlType", "CRB_BL_TYPE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlTypeasc", "CRB_BL_TYPE ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlTypedesc", "CRB_BL_TYPE DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlLimit", "CRB_BL_LIMIT = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlLimit", "CRB_BL_LIMIT != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlLimit",
     "(CRB_BL_LIMIT IS NULL OR LENGTH(CRB_BL_LIMIT) IS NULL OR LENGTH(CRB_BL_LIMIT) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlLimit", "CRB_BL_LIMIT IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlLimit", "CRB_BL_LIMIT < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlLimit", "CRB_BL_LIMIT > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlLimitMatch", "CRB_BL_LIMIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlLimit",
     "(CRB_BL_LIMIT = ? OR CRB_BL_LIMIT IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlLimit", "CRB_BL_LIMIT IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlLimit", "CRB_BL_LIMIT NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlLimitasc", "CRB_BL_LIMIT ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlLimitdesc", "CRB_BL_LIMIT DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlDiff", "CRB_BL_DIFF = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlDiff", "CRB_BL_DIFF != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlDiff",
     "(CRB_BL_DIFF IS NULL OR LENGTH(CRB_BL_DIFF) IS NULL OR LENGTH(CRB_BL_DIFF) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlDiff", "CRB_BL_DIFF IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlDiff", "CRB_BL_DIFF < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlDiff", "CRB_BL_DIFF > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlDiffMatch", "CRB_BL_DIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlDiff",
     "(CRB_BL_DIFF = ? OR CRB_BL_DIFF IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlDiff", "CRB_BL_DIFF IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlDiff", "CRB_BL_DIFF NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlDiffasc", "CRB_BL_DIFF ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlDiffdesc", "CRB_BL_DIFF DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlNextThresh", "CRB_BL_NEXT_THRESH = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlNextThresh", "CRB_BL_NEXT_THRESH != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlNextThresh",
     "(CRB_BL_NEXT_THRESH IS NULL OR LENGTH(CRB_BL_NEXT_THRESH) IS NULL OR LENGTH(CRB_BL_NEXT_THRESH) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlNextThresh", "CRB_BL_NEXT_THRESH IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlNextThresh", "CRB_BL_NEXT_THRESH < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlNextThresh", "CRB_BL_NEXT_THRESH > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlNextThreshMatch", "CRB_BL_NEXT_THRESH LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlNextThresh",
     "(CRB_BL_NEXT_THRESH = ? OR CRB_BL_NEXT_THRESH IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlNextThresh", "CRB_BL_NEXT_THRESH IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlNextThresh", "CRB_BL_NEXT_THRESH NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlNextThreshasc", "CRB_BL_NEXT_THRESH ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlNextThreshdesc", "CRB_BL_NEXT_THRESH DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlPrevThresh", "CRB_BL_PREV_THRESH = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlPrevThresh", "CRB_BL_PREV_THRESH != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlPrevThresh",
     "(CRB_BL_PREV_THRESH IS NULL OR LENGTH(CRB_BL_PREV_THRESH) IS NULL OR LENGTH(CRB_BL_PREV_THRESH) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlPrevThresh", "CRB_BL_PREV_THRESH IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlPrevThresh", "CRB_BL_PREV_THRESH < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlPrevThresh", "CRB_BL_PREV_THRESH > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlPrevThreshMatch", "CRB_BL_PREV_THRESH LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlPrevThresh",
     "(CRB_BL_PREV_THRESH = ? OR CRB_BL_PREV_THRESH IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlPrevThresh", "CRB_BL_PREV_THRESH IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlPrevThresh", "CRB_BL_PREV_THRESH NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlPrevThreshasc", "CRB_BL_PREV_THRESH ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlPrevThreshdesc", "CRB_BL_PREV_THRESH DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlNextAcnId",
     "(CRB_BL_NEXT_ACN_ID IS NULL OR LENGTH(CRB_BL_NEXT_ACN_ID) IS NULL OR LENGTH(CRB_BL_NEXT_ACN_ID) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlNextAcnIdMatch", "CRB_BL_NEXT_ACN_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlNextAcnId",
     "(CRB_BL_NEXT_ACN_ID = ? OR CRB_BL_NEXT_ACN_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlNextAcnId", "CRB_BL_NEXT_ACN_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlNextAcnIdasc", "CRB_BL_NEXT_ACN_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlNextAcnIddesc", "CRB_BL_NEXT_ACN_ID DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlPrevAcnId",
     "(CRB_BL_PREV_ACN_ID IS NULL OR LENGTH(CRB_BL_PREV_ACN_ID) IS NULL OR LENGTH(CRB_BL_PREV_ACN_ID) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlPrevAcnIdMatch", "CRB_BL_PREV_ACN_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlPrevAcnId",
     "(CRB_BL_PREV_ACN_ID = ? OR CRB_BL_PREV_ACN_ID IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlPrevAcnId", "CRB_BL_PREV_ACN_ID NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlPrevAcnIdasc", "CRB_BL_PREV_ACN_ID ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlPrevAcnIddesc", "CRB_BL_PREV_ACN_ID DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlTrigFlag", "CRB_BL_TRIG_FLAG = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlTrigFlag", "CRB_BL_TRIG_FLAG != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlTrigFlag",
     "(CRB_BL_TRIG_FLAG IS NULL OR LENGTH(CRB_BL_TRIG_FLAG) IS NULL OR LENGTH(CRB_BL_TRIG_FLAG) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlTrigFlag", "CRB_BL_TRIG_FLAG IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlTrigFlag", "CRB_BL_TRIG_FLAG < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlTrigFlag", "CRB_BL_TRIG_FLAG > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlTrigFlagMatch", "CRB_BL_TRIG_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlTrigFlag",
     "(CRB_BL_TRIG_FLAG = ? OR CRB_BL_TRIG_FLAG IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlTrigFlag", "CRB_BL_TRIG_FLAG IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlTrigFlag", "CRB_BL_TRIG_FLAG NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlTrigFlagasc", "CRB_BL_TRIG_FLAG ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlTrigFlagdesc", "CRB_BL_TRIG_FLAG DESC" ) // ORDER DESCENDING
   ;
	    
	    table.addFilterBy( "equalcrbBlLastUpdate", "CRB_BL_LAST_UPDATE = ?" ) // EQUAL

        .addFilterBy( "notequalcrbBlLastUpdate", "CRB_BL_LAST_UPDATE != ?" ) // NOTEQUAL

        .addFilterBy( "nullcrbBlLastUpdate",
     "(CRB_BL_LAST_UPDATE IS NULL OR LENGTH(CRB_BL_LAST_UPDATE) IS NULL OR LENGTH(CRB_BL_LAST_UPDATE) = 0)" ) // IS NULL

        .addFilterBy( "notnullcrbBlLastUpdate", "CRB_BL_LAST_UPDATE IS NOT NULL" ) // IS NOT NULL

        .addFilterBy( "lessthancrbBlLastUpdate", "CRB_BL_LAST_UPDATE < ?" ) // LESS THAN

        .addFilterBy( "greaterthancrbBlLastUpdate", "CRB_BL_LAST_UPDATE > ?" ) // GREATER THAN

        .addFilterBy( "filterBycrbBlLastUpdateMatch", "CRB_BL_LAST_UPDATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

        .addFilterBy( "equalornullcrbBlLastUpdate",
     "(CRB_BL_LAST_UPDATE = ? OR CRB_BL_LAST_UPDATE IS NULL)" ) // EQUALORNULL

        .addFilterBy( "INcrbBlLastUpdate", "CRB_BL_LAST_UPDATE IN ( ? )" ) // IN

        .addFilterBy( "NOTINcrbBlLastUpdate", "CRB_BL_LAST_UPDATE NOT IN ( ? )" ) // NOT IN

        .addOrderBy( "crbBlLastUpdateasc", "CRB_BL_LAST_UPDATE ASC" ) // ORDER ASCENDING

        .addOrderBy( "crbBlLastUpdatedesc", "CRB_BL_LAST_UPDATE DESC" ) // ORDER DESCENDING
   ;
		
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new CrbCustRiskBalDMLFactory(  );
	    }
	    return dml;
	  }
}
