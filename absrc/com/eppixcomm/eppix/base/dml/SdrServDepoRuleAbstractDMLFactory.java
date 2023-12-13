package com.eppixcomm.eppix.base.dml;

public class SdrServDepoRuleAbstractDMLFactory extends BaseDMLFactory{

	private static DMLFactory dml = null;
	
	public SdrServDepoRuleAbstractDMLFactory() throws DMLException{
		
		DMLTable table = defTable( "SdrServDepoRule", // dmlName
		        "blo.SdrServDepoRuleDMO", // dmoName
		        "SDR_SERV_DEPO_RULE", // tableName
		        16, // numColumns
		        "SDR_PACKAGE_CODE,SDR_SERVICE_CODE,SDR_VER_RULE_NUM,"
			 + "SDR_REASON_ID,SDR_DEPOSIT_AMOUNT,SDR_RELEASE_FLAG,"
			 + "SDR_RELEASE_TYPE,SDR_RELEASE_TG_ID,SDR_RELE_USER_ID,"
			 + "SDR_RELE_LETTER_ID,SDR_REL_DELAY_DAYS,SDR_PENDING_TYPE,"
			 + "SDR_PEND_TG_ID,SDR_PEND_USER_ID,SDR_PAY_DELAY_DAYS,"
			 + "SDR_OVERRIDE_FLAG", // columnList
		        "SDR_PACKAGE_CODE,SDR_SERVICE_CODE,SDR_VER_RULE_NUM", //primaryKey
		        "" // versionCol     
		      , false, // generatedKey
		        "SDR_PACKAGE_CODE,SDR_SERVICE_CODE,SDR_VER_RULE_NUM,"
			 + "SDR_REASON_ID,SDR_DEPOSIT_AMOUNT,SDR_RELEASE_FLAG,"
			 + "SDR_RELEASE_TYPE,SDR_RELEASE_TG_ID,SDR_RELE_USER_ID,"
			 + "SDR_RELE_LETTER_ID,SDR_REL_DELAY_DAYS,SDR_PENDING_TYPE,"
			 + "SDR_PEND_TG_ID,SDR_PEND_USER_ID,SDR_PAY_DELAY_DAYS,"
			 + "SDR_OVERRIDE_FLAG", // List of fields
		        "", 
		        "",
		        new String[] {
		          // Field Names
		          "SDR_PACKAGE_CODE", "SDR_SERVICE_CODE", "SDR_VER_RULE_NUM",
			      "SDR_REASON_ID", "SDR_DEPOSIT_AMOUNT", "SDR_RELEASE_FLAG",
			      "SDR_RELEASE_TYPE", "SDR_RELEASE_TG_ID", "SDR_RELE_USER_ID",
			      "SDR_RELE_LETTER_ID", "SDR_REL_DELAY_DAYS", "SDR_PENDING_TYPE",
			      "SDR_PEND_TG_ID", "SDR_PEND_USER_ID", "SDR_PAY_DELAY_DAYS",
			      "SDR_OVERRIDE_FLAG"
		        }, true );
		
		   table.addFilterBy( "equalSdrPackageCode", "(SDR_PACKAGE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrPackageCode", "(SDR_PACKAGE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrPackageCode",
	      "(SDR_PACKAGE_CODE IS NULL OR LENGTH((SDR_PACKAGE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrPackageCode", "SDR_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrPackageCodeMatch", "SDR_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrPackageCode",
	      "((SDR_PACKAGE_CODE) = ? OR SDR_PACKAGE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrPackageCode", "SDR_PACKAGE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrPackageCode", "SDR_PACKAGE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrPackageCodeasc", "SDR_PACKAGE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrPackageCodedesc", "SDR_PACKAGE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrServiceCode", "(SDR_SERVICE_CODE) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrServiceCode", "(SDR_SERVICE_CODE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrServiceCode",
	      "(SDR_SERVICE_CODE IS NULL OR LENGTH((SDR_SERVICE_CODE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrServiceCode", "SDR_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrServiceCodeMatch", "SDR_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrServiceCode",
	      "((SDR_SERVICE_CODE) = ? OR SDR_SERVICE_CODE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrServiceCode", "SDR_SERVICE_CODE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrServiceCode", "SDR_SERVICE_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrServiceCodeasc", "SDR_SERVICE_CODE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrServiceCodedesc", "SDR_SERVICE_CODE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrVerRuleNum", "(SDR_VER_RULE_NUM) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrVerRuleNum", "(SDR_VER_RULE_NUM) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrVerRuleNum",
	      "(SDR_VER_RULE_NUM IS NULL OR LENGTH((SDR_VER_RULE_NUM)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrVerRuleNum", "SDR_VER_RULE_NUM IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrVerRuleNumMatch", "SDR_VER_RULE_NUM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrVerRuleNum",
	      "((SDR_VER_RULE_NUM) = ? OR SDR_VER_RULE_NUM IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrVerRuleNum", "SDR_VER_RULE_NUM IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrVerRuleNum", "SDR_VER_RULE_NUM NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrVerRuleNumasc", "SDR_VER_RULE_NUM ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrVerRuleNumdesc", "SDR_VER_RULE_NUM DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrReasonId", "(SDR_REASON_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReasonId", "(SDR_REASON_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReasonId",
	      "(SDR_REASON_ID IS NULL OR LENGTH((SDR_REASON_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReasonId", "SDR_REASON_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReasonIdMatch", "SDR_REASON_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReasonId",
	      "((SDR_REASON_ID) = ? OR SDR_REASON_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReasonId", "SDR_REASON_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReasonId", "SDR_REASON_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReasonIdasc", "SDR_REASON_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReasonIddesc", "SDR_REASON_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrDepositAmount", "(SDR_DEPOSIT_AMOUNT) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrDepositAmount", "(SDR_DEPOSIT_AMOUNT) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrDepositAmount",
	      "(SDR_DEPOSIT_AMOUNT IS NULL OR LENGTH((SDR_DEPOSIT_AMOUNT)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrDepositAmount", "SDR_DEPOSIT_AMOUNT IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrDepositAmountMatch", "SDR_DEPOSIT_AMOUNT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrDepositAmount",
	      "((SDR_DEPOSIT_AMOUNT) = ? OR SDR_DEPOSIT_AMOUNT IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrDepositAmount", "SDR_DEPOSIT_AMOUNT IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrDepositAmount", "SDR_DEPOSIT_AMOUNT NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrDepositAmountasc", "SDR_DEPOSIT_AMOUNT ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrDepositAmountdesc", "SDR_DEPOSIT_AMOUNT DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrReleaseFlag", "(SDR_RELEASE_FLAG) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReleaseFlag", "(SDR_RELEASE_FLAG) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReleaseFlag",
	      "(SDR_RELEASE_FLAG IS NULL OR LENGTH((SDR_RELEASE_FLAG)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReleaseFlag", "SDR_RELEASE_FLAG IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReleaseFlagMatch", "SDR_RELEASE_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReleaseFlag",
	      "((SDR_RELEASE_FLAG) = ? OR SDR_RELEASE_FLAG IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReleaseFlag", "SDR_RELEASE_FLAG IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReleaseFlag", "SDR_RELEASE_FLAG NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReleaseFlagasc", "SDR_RELEASE_FLAG ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReleaseFlagdesc", "SDR_RELEASE_FLAG DESC" ) // ORDER DESCENDING
	    ;		   
		
		   table.addFilterBy( "equalSdrReleaseType", "(SDR_RELEASE_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReleaseType", "(SDR_RELEASE_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReleaseType",
	      "(SDR_RELEASE_TYPE IS NULL OR LENGTH((SDR_RELEASE_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReleaseType", "SDR_RELEASE_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReleaseTypeMatch", "SDR_RELEASE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReleaseType",
	      "((SDR_RELEASE_TYPE) = ? OR SDR_RELEASE_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReleaseType", "SDR_RELEASE_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReleaseType", "SDR_RELEASE_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReleaseTypeasc", "SDR_RELEASE_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReleaseTypedesc", "SDR_RELEASE_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrReleaseTgId", "(SDR_RELEASE_TG_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReleaseTgId", "(SDR_RELEASE_TG_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReleaseTgId",
	      "(SDR_RELEASE_TG_ID IS NULL OR LENGTH((SDR_RELEASE_TG_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReleaseTgId", "SDR_RELEASE_TG_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReleaseTgIdMatch", "SDR_RELEASE_TG_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReleaseTgId",
	      "((SDR_RELEASE_TG_ID) = ? OR SDR_RELEASE_TG_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReleaseTgId", "SDR_RELEASE_TG_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReleaseTgId", "SDR_RELEASE_TG_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReleaseTgIdasc", "SDR_RELEASE_TG_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReleaseTgIddesc", "SDR_RELEASE_TG_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrReleUserId", "(SDR_RELE_USER_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReleUserId", "(SDR_RELE_USER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReleUserId",
	      "(SDR_RELE_USER_ID IS NULL OR LENGTH((SDR_RELE_USER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReleUserId", "SDR_RELE_USER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReleUserIdMatch", "SDR_RELE_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReleUserId",
	      "((SDR_RELE_USER_ID) = ? OR SDR_RELE_USER_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReleUserId", "SDR_RELE_USER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReleUserId", "SDR_RELE_USER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReleUserIdasc", "SDR_RELE_USER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReleUserIddesc", "SDR_RELE_USER_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrReleLetterId", "(SDR_RELE_LETTER_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrReleLetterId", "(SDR_RELE_LETTER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrReleLetterId",
	      "(SDR_RELE_LETTER_ID IS NULL OR LENGTH((SDR_RELE_LETTER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrReleLetterId", "SDR_RELE_LETTER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrReleLetterIdMatch", "SDR_RELE_LETTER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrReleLetterId",
	      "((SDR_RELE_LETTER_ID) = ? OR SDR_RELE_LETTER_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrReleLetterId", "SDR_RELE_LETTER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrReleLetterId", "SDR_RELE_LETTER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrReleLetterIdasc", "SDR_RELE_LETTER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrReleLetterIddesc", "SDR_RELE_LETTER_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrRelDelayDays", "(SDR_REL_DELAY_DAYS) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrRelDelayDays", "(SDR_REL_DELAY_DAYS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrRelDelayDays",
	      "(SDR_REL_DELAY_DAYS IS NULL OR LENGTH((SDR_REL_DELAY_DAYS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrRelDelayDays", "SDR_REL_DELAY_DAYS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrRelDelayDaysMatch", "SDR_REL_DELAY_DAYS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrRelDelayDays",
	      "((SDR_REL_DELAY_DAYS) = ? OR SDR_REL_DELAY_DAYS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrRelDelayDays", "SDR_REL_DELAY_DAYS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrRelDelayDays", "SDR_REL_DELAY_DAYS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrRelDelayDaysasc", "SDR_REL_DELAY_DAYS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrRelDelayDaysdesc", "SDR_REL_DELAY_DAYS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrPendingType", "(SDR_PENDING_TYPE) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrPendingType", "(SDR_PENDING_TYPE) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrPendingType",
	      "(SDR_PENDING_TYPE IS NULL OR LENGTH((SDR_PENDING_TYPE)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrPendingType", "SDR_PENDING_TYPE IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrPendingTypeMatch", "SDR_PENDING_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrPendingType",
	      "((SDR_PENDING_TYPE) = ? OR SDR_PENDING_TYPE IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrPendingType", "SDR_PENDING_TYPE IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrPendingType", "SDR_PENDING_TYPE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrPendingTypeasc", "SDR_PENDING_TYPE ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrPendingTypedesc", "SDR_PENDING_TYPE DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrPendTgId", "(SDR_PEND_TG_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrPendTgId", "(SDR_PEND_TG_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrPendTgId",
	      "(SDR_PEND_TG_ID IS NULL OR LENGTH((SDR_PEND_TG_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrPendTgId", "SDR_PEND_TG_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrPendTgIdMatch", "SDR_PEND_TG_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrPendTgId",
	      "((SDR_PEND_TG_ID) = ? OR SDR_PEND_TG_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrPendTgId", "SDR_PEND_TG_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrPendTgId", "SDR_PEND_TG_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrPendTgIdasc", "SDR_PEND_TG_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrPendTgIddesc", "SDR_PEND_TG_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrPendUserId", "(SDR_PEND_USER_ID) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrPendUserId", "(SDR_PEND_USER_ID) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrPendUserId",
	      "(SDR_PEND_USER_ID IS NULL OR LENGTH((SDR_PEND_USER_ID)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrPendUserId", "SDR_PEND_USER_ID IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrPendUserIdMatch", "SDR_PEND_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrPendUserId",
	      "((SDR_PEND_USER_ID) = ? OR SDR_PEND_USER_ID IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrPendUserId", "SDR_PEND_USER_ID IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrPendUserId", "SDR_PEND_USER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrPendUserIdasc", "SDR_PEND_USER_ID ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrPendUserIddesc", "SDR_PEND_USER_ID DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrPayDelayDays", "(SDR_PAY_DELAY_DAYS) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrPayDelayDays", "(SDR_PAY_DELAY_DAYS) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrPayDelayDays",
	      "(SDR_PAY_DELAY_DAYS IS NULL OR LENGTH((SDR_PAY_DELAY_DAYS)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrPayDelayDays", "SDR_PAY_DELAY_DAYS IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrPayDelayDaysMatch", "SDR_PAY_DELAY_DAYS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrPayDelayDays",
	      "((SDR_PAY_DELAY_DAYS) = ? OR SDR_PAY_DELAY_DAYS IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrPayDelayDays", "SDR_PAY_DELAY_DAYS IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrPayDelayDays", "SDR_PAY_DELAY_DAYS NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrPayDelayDaysasc", "SDR_PAY_DELAY_DAYS ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrPayDelayDaysdesc", "SDR_PAY_DELAY_DAYS DESC" ) // ORDER DESCENDING
	    ;
		   
		   table.addFilterBy( "equalSdrOverrideFlag", "(SDR_OVERRIDE_FLAG) = ?" ) // EQUAL

	         .addFilterBy( "notequalSdrOverrideFlag", "(SDR_OVERRIDE_FLAG) != ?" ) // NOTEQUAL

	         .addFilterBy( "nullSdrOverrideFlag",
	      "(SDR_OVERRIDE_FLAG IS NULL OR LENGTH((SDR_OVERRIDE_FLAG)) = 0)" ) // IS NULL

	         .addFilterBy( "notnullSdrOverrideFlag", "SDR_OVERRIDE_FLAG IS NOT NULL" ) // IS NOT NULL

	         .addFilterBy( "filterBySdrOverrideFlagMatch", "SDR_OVERRIDE_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

	         .addFilterBy( "equalornullSdrOverrideFlag",
	      "((SDR_OVERRIDE_FLAG) = ? OR SDR_OVERRIDE_FLAG IS NULL)" ) // EQUALORNULL

	         .addFilterBy( "INSdrOverrideFlag", "SDR_OVERRIDE_FLAG IN ( ? )" ) // IN

	         .addFilterBy( "NOTINSdrOverrideFlag", "SDR_OVERRIDE_FLAG NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "SdrOverrideFlagasc", "SDR_OVERRIDE_FLAG ASC" ) // ORDER ASCENDING

	         .addOrderBy( "SdrOverrideFlagdesc", "SDR_OVERRIDE_FLAG DESC" ) // ORDER DESCENDING
	    ;
	}
	
	  public static DMLFactory getDMLFactory(  )
	    throws DMLException {
	    if ( dml == null ) {
	      dml = new SdrServDepoRuleDMLFactory(  );
	    }

	    return dml;
	  }
	
}
