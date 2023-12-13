/*


*/

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;


/**
 * This is the DMLFactory for DirDiscountRule.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DirDiscountRuleAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DirDiscountRuleAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DirDiscountRuleAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DirDiscountRule", // dmlName
        "blo.DirDiscountRuleDMO", // dmoName
        "DIR_DISCOUNT_RULE", // tableName
        25, // numColumns
//        "DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE, DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER, DIR_APPLY_FOR, DIR_BAND_TYPE"
//        + ", DIR_THRESHOLD_ID, DIR_APP_DISC_ID, DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL", // columnList
        "DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE, DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER,"
    	+ "DIR_APPLY_FOR, DIR_TYPE_CODE, DIR_UOM_ID, DIR_APPLY_EVERY, DIR_FILTER_ACC, DIR_FILTER_LEGAL, DIR_FILTER_PACKAGE,"
    	+ "DIR_FILTER_TARIFF, DIR_PERCENT_COUNT, DIR_ONCE_OFF_FEE, DIR_BAND_TYPE, DIR_THRESHOLD_ID, DIR_APP_DISC_ID,"
    	+ "DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL , DIR_PERCENT_SPLIT, DIR_INV_DISPLAY",// columnList
        "DIR_RULE_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
//        "DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE, DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER, DIR_APPLY_FOR, DIR_BAND_TYPE"
//        + ", DIR_THRESHOLD_ID, DIR_APP_DISC_ID, DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL",
        "DIR_RULE_ID, DIR_RULE_REF, DIR_START_DATE, DIR_END_DATE, DIR_RULE_DESC, DIR_RULE_TYPE, DIR_START_AFTER,"
    	+ "DIR_APPLY_FOR, DIR_TYPE_CODE, DIR_UOM_ID, DIR_APPLY_EVERY, DIR_FILTER_ACC, DIR_FILTER_LEGAL, DIR_FILTER_PACKAGE,"
    	+ "DIR_FILTER_TARIFF, DIR_PERCENT_COUNT, DIR_ONCE_OFF_FEE, DIR_BAND_TYPE, DIR_THRESHOLD_ID, DIR_APP_DISC_ID,"
    	+ "DIR_CHARGE_REF, DIR_RULE_USED, DIR_APP_TO_VAL , DIR_PERCENT_SPLIT, DIR_INV_DISPLAY",        
        "", "",
        new String[] {
//          "DIR_RULE_ID", "DIR_RULE_REF", "DIR_START_DATE", "DIR_END_DATE",
//          "DIR_RULE_DESC", "DIR_RULE_TYPE", "DIR_START_AFTER", "DIR_APPLY_FOR",
//          "DIR_BAND_TYPE", "DIR_THRESHOLD_ID", "DIR_APP_DISC_ID",
//          "DIR_CHARGE_REF", "DIR_RULE_USED", "DIR_APP_TO_VAL"
    		"DIR_RULE_ID", "DIR_RULE_REF",  "DIR_START_DATE", "DIR_END_DATE", "DIR_RULE_DESC",
    		 "DIR_RULE_TYPE", "DIR_START_AFTER", "DIR_APPLY_FOR", "DIR_TYPE_CODE", "DIR_UOM_ID",
    		 "DIR_APPLY_EVERY", "DIR_FILTER_ACC", "DIR_FILTER_LEGAL", "DIR_FILTER_PACKAGE",
    		 "DIR_FILTER_TARIFF", "DIR_PERCENT_COUNT", "DIR_ONCE_OFF_FEE", "DIR_BAND_TYPE",
    		 "DIR_THRESHOLD_ID", "DIR_APP_DISC_ID", "DIR_CHARGE_REF", "DIR_RULE_USED",
    		 "DIR_APP_TO_VAL ", "DIR_PERCENT_SPLIT", "DIR_INV_DISPLAY"
        } );

    table.addFilterBy( "equalDirRuleId", /* PK attribute */
      "DIR_RULE_ID = ?" )
         .addFilterBy( "filterByDirRuleIdMatch", "DIR_RULE_ID LIKE ?" )
         .addFilterBy( "INDirRuleId", "DIR_RULE_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirRuleId", "DIR_RULE_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDirRuleId", "DIR_RULE_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirRuleId", "DIR_RULE_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirRuleId", "DIR_RULE_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirRuleId", "DIR_RULE_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirRuleId", "DIR_RULE_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirRuleId", "DIR_RULE_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirRuleId", "DIR_RULE_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirRuleIdMatch", "DIR_RULE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirRuleId", "DIR_RULE_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirRuleId",
      "(DIR_RULE_ID IS NULL OR DIR_RULE_ID = ?)" ) // EQUALORNULL
                                                   // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDirRuleId",
      "(DIR_RULE_ID IS NULL OR DIR_RULE_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirRuleId",
      "(DIR_RULE_ID IS NULL OR DIR_RULE_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DirRuleIdasc", "DIR_RULE_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirRuleIddesc", "DIR_RULE_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirRuleRef", "DIR_RULE_REF = ?" ) // EQUAL

         .addFilterBy( "notequalDirRuleRef", "DIR_RULE_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirRuleRef", "DIR_RULE_REF IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirRuleRef", "DIR_RULE_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirRuleRef", "DIR_RULE_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirRuleRef", "DIR_RULE_REF > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirRuleRef", "DIR_RULE_REF <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirRuleRef", "DIR_RULE_REF >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirRuleRefMatch", "DIR_RULE_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirRuleRef", "DIR_RULE_REF BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirRuleRef",
      "(DIR_RULE_REF IS NULL OR DIR_RULE_REF = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirRuleRef",
      "(DIR_RULE_REF IS NULL OR DIR_RULE_REF < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirRuleRef",
      "(DIR_RULE_REF IS NULL OR DIR_RULE_REF > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirRuleRef", "DIR_RULE_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirRuleRef", "DIR_RULE_REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirRuleRefasc", "DIR_RULE_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirRuleRefdesc", "DIR_RULE_REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirStartDate", "DIR_START_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalDirStartDate", "DIR_START_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirStartDate", "DIR_START_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirStartDate", "DIR_START_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirStartDate", "DIR_START_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirStartDate", "DIR_START_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirStartDate", "DIR_START_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirStartDate", "DIR_START_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirStartDateMatch", "DIR_START_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirStartDate", "DIR_START_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirStartDate",
      "(DIR_START_DATE IS NULL OR DIR_START_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirStartDate",
      "(DIR_START_DATE IS NULL OR DIR_START_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirStartDate",
      "(DIR_START_DATE IS NULL OR DIR_START_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirStartDate", "DIR_START_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirStartDate", "DIR_START_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirStartDateasc", "DIR_START_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirStartDatedesc", "DIR_START_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirEndDate", "DIR_END_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalDirEndDate", "DIR_END_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirEndDate", "DIR_END_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirEndDate", "DIR_END_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirEndDate", "DIR_END_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirEndDate", "DIR_END_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirEndDate", "DIR_END_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirEndDate", "DIR_END_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirEndDateMatch", "DIR_END_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirEndDate", "DIR_END_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirEndDate",
      "(DIR_END_DATE IS NULL OR DIR_END_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirEndDate",
      "(DIR_END_DATE IS NULL OR DIR_END_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirEndDate",
      "(DIR_END_DATE IS NULL OR DIR_END_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirEndDate", "DIR_END_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirEndDate", "DIR_END_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirEndDateasc", "DIR_END_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirEndDatedesc", "DIR_END_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirRuleDesc", "DIR_RULE_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalDirRuleDesc", "DIR_RULE_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirRuleDesc",
      "(DIR_RULE_DESC IS NULL OR LENGTH(DIR_RULE_DESC) IS NULL OR LENGTH(DIR_RULE_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirRuleDesc", "DIR_RULE_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirRuleDesc", "DIR_RULE_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirRuleDesc", "DIR_RULE_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByDirRuleDescMatch", "DIR_RULE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirRuleDesc",
      "(DIR_RULE_DESC = ? OR DIR_RULE_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirRuleDesc", "DIR_RULE_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirRuleDesc", "DIR_RULE_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirRuleDescasc", "DIR_RULE_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirRuleDescdesc", "DIR_RULE_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirRuleType", "DIR_RULE_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalDirRuleType", "DIR_RULE_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirRuleType",
      "(DIR_RULE_TYPE IS NULL OR LENGTH(DIR_RULE_TYPE) IS NULL OR LENGTH(DIR_RULE_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirRuleType", "DIR_RULE_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirRuleType", "DIR_RULE_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirRuleType", "DIR_RULE_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDirRuleTypeMatch", "DIR_RULE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirRuleType",
      "(DIR_RULE_TYPE = ? OR DIR_RULE_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirRuleType", "DIR_RULE_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirRuleType", "DIR_RULE_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirRuleTypeasc", "DIR_RULE_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirRuleTypedesc", "DIR_RULE_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirStartAfter", "DIR_START_AFTER = ?" ) // EQUAL

         .addFilterBy( "notequalDirStartAfter", "DIR_START_AFTER != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirStartAfter", "DIR_START_AFTER IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirStartAfter", "DIR_START_AFTER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirStartAfter", "DIR_START_AFTER < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirStartAfter", "DIR_START_AFTER > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirStartAfter", "DIR_START_AFTER <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirStartAfter",
      "DIR_START_AFTER >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirStartAfterMatch", "DIR_START_AFTER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirStartAfter",
      "DIR_START_AFTER BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirStartAfter",
      "(DIR_START_AFTER IS NULL OR DIR_START_AFTER = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirStartAfter",
      "(DIR_START_AFTER IS NULL OR DIR_START_AFTER < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirStartAfter",
      "(DIR_START_AFTER IS NULL OR DIR_START_AFTER > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirStartAfter", "DIR_START_AFTER IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirStartAfter", "DIR_START_AFTER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirStartAfterasc", "DIR_START_AFTER ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirStartAfterdesc", "DIR_START_AFTER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirApplyFor", "DIR_APPLY_FOR = ?" ) // EQUAL

         .addFilterBy( "notequalDirApplyFor", "DIR_APPLY_FOR != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirApplyFor", "DIR_APPLY_FOR IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirApplyFor", "DIR_APPLY_FOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirApplyFor", "DIR_APPLY_FOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirApplyFor", "DIR_APPLY_FOR > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirApplyFor", "DIR_APPLY_FOR <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirApplyFor", "DIR_APPLY_FOR >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirApplyForMatch", "DIR_APPLY_FOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirApplyFor", "DIR_APPLY_FOR BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirApplyFor",
      "(DIR_APPLY_FOR IS NULL OR DIR_APPLY_FOR = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirApplyFor",
      "(DIR_APPLY_FOR IS NULL OR DIR_APPLY_FOR < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirApplyFor",
      "(DIR_APPLY_FOR IS NULL OR DIR_APPLY_FOR > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirApplyFor", "DIR_APPLY_FOR IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirApplyFor", "DIR_APPLY_FOR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirApplyForasc", "DIR_APPLY_FOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirApplyFordesc", "DIR_APPLY_FOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirBandType", "DIR_BAND_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalDirBandType", "DIR_BAND_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirBandType",
      "(DIR_BAND_TYPE IS NULL OR LENGTH(DIR_BAND_TYPE) IS NULL OR LENGTH(DIR_BAND_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirBandType", "DIR_BAND_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirBandType", "DIR_BAND_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirBandType", "DIR_BAND_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDirBandTypeMatch", "DIR_BAND_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirBandType",
      "(DIR_BAND_TYPE = ? OR DIR_BAND_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirBandType", "DIR_BAND_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirBandType", "DIR_BAND_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirBandTypeasc", "DIR_BAND_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirBandTypedesc", "DIR_BAND_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirThresholdId", "DIR_THRESHOLD_ID = ?" ) // EQUAL

         .addFilterBy( "notequalDirThresholdId", "DIR_THRESHOLD_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirThresholdId", "DIR_THRESHOLD_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirThresholdId", "DIR_THRESHOLD_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirThresholdId", "DIR_THRESHOLD_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirThresholdId", "DIR_THRESHOLD_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirThresholdId",
      "DIR_THRESHOLD_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirThresholdId",
      "DIR_THRESHOLD_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirThresholdIdMatch",
      "DIR_THRESHOLD_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirThresholdId",
      "DIR_THRESHOLD_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirThresholdId",
      "(DIR_THRESHOLD_ID IS NULL OR DIR_THRESHOLD_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirThresholdId",
      "(DIR_THRESHOLD_ID IS NULL OR DIR_THRESHOLD_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirThresholdId",
      "(DIR_THRESHOLD_ID IS NULL OR DIR_THRESHOLD_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirThresholdId", "DIR_THRESHOLD_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirThresholdId", "DIR_THRESHOLD_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirThresholdIdasc", "DIR_THRESHOLD_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirThresholdIddesc", "DIR_THRESHOLD_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirAppDiscId", "DIR_APP_DISC_ID = ?" ) // EQUAL

         .addFilterBy( "notequalDirAppDiscId", "DIR_APP_DISC_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirAppDiscId", "DIR_APP_DISC_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirAppDiscId", "DIR_APP_DISC_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirAppDiscId", "DIR_APP_DISC_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirAppDiscId", "DIR_APP_DISC_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirAppDiscId", "DIR_APP_DISC_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirAppDiscId",
      "DIR_APP_DISC_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirAppDiscIdMatch", "DIR_APP_DISC_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirAppDiscId",
      "DIR_APP_DISC_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirAppDiscId",
      "(DIR_APP_DISC_ID IS NULL OR DIR_APP_DISC_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirAppDiscId",
      "(DIR_APP_DISC_ID IS NULL OR DIR_APP_DISC_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirAppDiscId",
      "(DIR_APP_DISC_ID IS NULL OR DIR_APP_DISC_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirAppDiscId", "DIR_APP_DISC_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirAppDiscId", "DIR_APP_DISC_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirAppDiscIdasc", "DIR_APP_DISC_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirAppDiscIddesc", "DIR_APP_DISC_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirChargeRef", "DIR_CHARGE_REF = ?" ) // EQUAL

         .addFilterBy( "notequalDirChargeRef", "DIR_CHARGE_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirChargeRef",
      "(DIR_CHARGE_REF IS NULL OR LENGTH(DIR_CHARGE_REF) IS NULL OR LENGTH(DIR_CHARGE_REF) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirChargeRef", "DIR_CHARGE_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirChargeRef", "DIR_CHARGE_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirChargeRef", "DIR_CHARGE_REF > ?" ) // GREATER THAN

         .addFilterBy( "filterByDirChargeRefMatch", "DIR_CHARGE_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirChargeRef",
      "(DIR_CHARGE_REF = ? OR DIR_CHARGE_REF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirChargeRef", "DIR_CHARGE_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirChargeRef", "DIR_CHARGE_REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirChargeRefasc", "DIR_CHARGE_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirChargeRefdesc", "DIR_CHARGE_REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirRuleUsed", "DIR_RULE_USED = ?" ) // EQUAL

         .addFilterBy( "notequalDirRuleUsed", "DIR_RULE_USED != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirRuleUsed", "DIR_RULE_USED IS NULL" ) // IS NULL

         .addFilterBy( "notnullDirRuleUsed", "DIR_RULE_USED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirRuleUsed", "DIR_RULE_USED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirRuleUsed", "DIR_RULE_USED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDirRuleUsed", "DIR_RULE_USED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDirRuleUsed", "DIR_RULE_USED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDirRuleUsedMatch", "DIR_RULE_USED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDirRuleUsed", "DIR_RULE_USED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDirRuleUsed",
      "(DIR_RULE_USED IS NULL OR DIR_RULE_USED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDirRuleUsed",
      "(DIR_RULE_USED IS NULL OR DIR_RULE_USED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDirRuleUsed",
      "(DIR_RULE_USED IS NULL OR DIR_RULE_USED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDirRuleUsed", "DIR_RULE_USED IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirRuleUsed", "DIR_RULE_USED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirRuleUsedasc", "DIR_RULE_USED ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirRuleUseddesc", "DIR_RULE_USED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirAppToVal", "DIR_APP_TO_VAL = ?" ) // EQUAL

         .addFilterBy( "notequalDirAppToVal", "DIR_APP_TO_VAL != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirAppToVal",
      "(DIR_APP_TO_VAL IS NULL OR LENGTH(DIR_APP_TO_VAL) IS NULL OR LENGTH(DIR_APP_TO_VAL) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirAppToVal", "DIR_APP_TO_VAL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDirAppToVal", "DIR_APP_TO_VAL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDirAppToVal", "DIR_APP_TO_VAL > ?" ) // GREATER THAN

         .addFilterBy( "filterByDirAppToValMatch", "DIR_APP_TO_VAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirAppToVal",
      "(DIR_APP_TO_VAL = ? OR DIR_APP_TO_VAL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirAppToVal", "DIR_APP_TO_VAL IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirAppToVal", "DIR_APP_TO_VAL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirAppToValasc", "DIR_APP_TO_VAL ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirAppToValdesc", "DIR_APP_TO_VAL DESC" ) // ORDER DESCENDING
    ;

    ;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

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
      dml = new DirDiscountRuleDMLFactory(  );
    }

    return dml;
  }
}
