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
 * This is the DMLFactory for SbuSubUpgrade.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SbuSubUpgradeAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbuSubUpgradeAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SbuSubUpgradeAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SbuSubUpgrade", // dmlName
        "blo.SbuSubUpgradeDMO", // dmoName
        "SBU_SUB_UPGRADE", // tableName
        30, // numColumns
        "SBU_SUBUPGRADE_ID, SBU_SUBSCRIBER_ID, SBU_DEALER_ID, SBU_SALES_PERSON, SBU_UPGRADE_QUAL, SBU_COMMENT, SBU_USER_ID, SBU_MODEL_ID, SBU_CONTRACT_LEN"
        + ", SBU_COST, SBU_IMEI, SBU_REGION_CODE, SBU_ACCOUNT_STATUS, SBU_COLL_PLAN, SBU_MTN_STATUS, SBU_ACTIVATE_DATE, SBU_DEACT_DATE, SBU_CONTRACT_AGE"
        + ", SBU_CUSTOMER_TYPE, SBU_TARIFF_CODE, SBU_PACKAGE_CODE, SBU_PAYMENT_PLAN, SBU_TERM_DATE, SBU_AGEING_BUCKET, SBU_AVERAGESPEND, SBU_DATEPROCESSED, SBU_DATEAPPROVED"
        + ", SBU_UPGRADE_STATUS, SBU_CHANNEL, SBU_RECORD_STATUS", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SBU_SUBUPGRADE_ID, SBU_SUBSCRIBER_ID, SBU_DEALER_ID, SBU_SALES_PERSON, SBU_UPGRADE_QUAL, SBU_COMMENT, SBU_USER_ID, SBU_MODEL_ID, SBU_CONTRACT_LEN"
        + ", SBU_COST, SBU_IMEI, SBU_REGION_CODE, SBU_ACCOUNT_STATUS, SBU_COLL_PLAN, SBU_MTN_STATUS, SBU_ACTIVATE_DATE, SBU_DEACT_DATE, SBU_CONTRACT_AGE"
        + ", SBU_CUSTOMER_TYPE, SBU_TARIFF_CODE, SBU_PACKAGE_CODE, SBU_PAYMENT_PLAN, SBU_TERM_DATE, SBU_AGEING_BUCKET, SBU_AVERAGESPEND, SBU_DATEPROCESSED, SBU_DATEAPPROVED"
        + ", SBU_UPGRADE_STATUS, SBU_CHANNEL, SBU_RECORD_STATUS", "", "",
        new String[] {
          "SBU_SUBUPGRADE_ID", "SBU_SUBSCRIBER_ID", "SBU_DEALER_ID",
          "SBU_SALES_PERSON", "SBU_UPGRADE_QUAL", "SBU_COMMENT", "SBU_USER_ID",
          "SBU_MODEL_ID", "SBU_CONTRACT_LEN", "SBU_COST", "SBU_IMEI",
          "SBU_REGION_CODE", "SBU_ACCOUNT_STATUS", "SBU_COLL_PLAN",
          "SBU_MTN_STATUS", "SBU_ACTIVATE_DATE", "SBU_DEACT_DATE",
          "SBU_CONTRACT_AGE", "SBU_CUSTOMER_TYPE", "SBU_TARIFF_CODE",
          "SBU_PACKAGE_CODE", "SBU_PAYMENT_PLAN", "SBU_TERM_DATE",
          "SBU_AGEING_BUCKET", "SBU_AVERAGESPEND", "SBU_DATEPROCESSED",
          "SBU_DATEAPPROVED", "SBU_UPGRADE_STATUS", "SBU_CHANNEL",
          "SBU_RECORD_STATUS"
        }, false );

    ;

    table.addFilterBy( "equalSbuSubupgradeId", "SBU_SUBUPGRADE_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbuSubupgradeId", "SBU_SUBUPGRADE_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuSubupgradeId", "SBU_SUBUPGRADE_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuSubupgradeId",
      "SBU_SUBUPGRADE_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuSubupgradeId", "SBU_SUBUPGRADE_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuSubupgradeId", "SBU_SUBUPGRADE_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuSubupgradeId",
      "SBU_SUBUPGRADE_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuSubupgradeId",
      "SBU_SUBUPGRADE_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuSubupgradeIdMatch",
      "SBU_SUBUPGRADE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuSubupgradeId",
      "SBU_SUBUPGRADE_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuSubupgradeId",
      "(SBU_SUBUPGRADE_ID IS NULL OR SBU_SUBUPGRADE_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuSubupgradeId",
      "(SBU_SUBUPGRADE_ID IS NULL OR SBU_SUBUPGRADE_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuSubupgradeId",
      "(SBU_SUBUPGRADE_ID IS NULL OR SBU_SUBUPGRADE_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuSubupgradeId", "SBU_SUBUPGRADE_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuSubupgradeId",
      "SBU_SUBUPGRADE_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuSubupgradeIdasc", "SBU_SUBUPGRADE_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuSubupgradeIddesc", "SBU_SUBUPGRADE_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuSubscriberId", "SBU_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbuSubscriberId", "SBU_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuSubscriberId", "SBU_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuSubscriberId",
      "SBU_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuSubscriberId", "SBU_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuSubscriberId", "SBU_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuSubscriberId",
      "SBU_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuSubscriberId",
      "SBU_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuSubscriberIdMatch",
      "SBU_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuSubscriberId",
      "SBU_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuSubscriberId",
      "(SBU_SUBSCRIBER_ID IS NULL OR SBU_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuSubscriberId",
      "(SBU_SUBSCRIBER_ID IS NULL OR SBU_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuSubscriberId",
      "(SBU_SUBSCRIBER_ID IS NULL OR SBU_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuSubscriberId", "SBU_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuSubscriberId",
      "SBU_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuSubscriberIdasc", "SBU_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuSubscriberIddesc", "SBU_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuDealerId", "(SBU_DEALER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuDealerId", "(SBU_DEALER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuDealerId",
      "(SBU_DEALER_ID IS NULL OR LENGTH((SBU_DEALER_ID)) IS NULL OR LENGTH((SBU_DEALER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuDealerId", "SBU_DEALER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuDealerIdMatch", "SBU_DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuDealerId",
      "((SBU_DEALER_ID) = ? OR SBU_DEALER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuDealerId", "(SBU_DEALER_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuDealerId", "(SBU_DEALER_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuDealerIdasc", "SBU_DEALER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuDealerIddesc", "SBU_DEALER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuSalesPerson", "(SBU_SALES_PERSON) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuSalesPerson", "(SBU_SALES_PERSON) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuSalesPerson",
      "(SBU_SALES_PERSON IS NULL OR LENGTH((SBU_SALES_PERSON)) IS NULL OR LENGTH((SBU_SALES_PERSON)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuSalesPerson", "SBU_SALES_PERSON IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuSalesPersonMatch",
      "SBU_SALES_PERSON LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuSalesPerson",
      "((SBU_SALES_PERSON) = ? OR SBU_SALES_PERSON IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuSalesPerson", "(SBU_SALES_PERSON) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuSalesPerson",
      "(SBU_SALES_PERSON) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuSalesPersonasc", "SBU_SALES_PERSON ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuSalesPersondesc", "SBU_SALES_PERSON DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuUpgradeQual", "(SBU_UPGRADE_QUAL) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuUpgradeQual", "(SBU_UPGRADE_QUAL) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuUpgradeQual",
      "(SBU_UPGRADE_QUAL IS NULL OR LENGTH((SBU_UPGRADE_QUAL)) IS NULL OR LENGTH((SBU_UPGRADE_QUAL)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuUpgradeQual", "SBU_UPGRADE_QUAL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuUpgradeQualMatch",
      "SBU_UPGRADE_QUAL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuUpgradeQual",
      "((SBU_UPGRADE_QUAL) = ? OR SBU_UPGRADE_QUAL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuUpgradeQual", "(SBU_UPGRADE_QUAL) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuUpgradeQual",
      "(SBU_UPGRADE_QUAL) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuUpgradeQualasc", "SBU_UPGRADE_QUAL ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuUpgradeQualdesc", "SBU_UPGRADE_QUAL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuComment", "(SBU_COMMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuComment", "(SBU_COMMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuComment",
      "(SBU_COMMENT IS NULL OR LENGTH((SBU_COMMENT)) IS NULL OR LENGTH((SBU_COMMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuComment", "SBU_COMMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuCommentMatch", "SBU_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuComment",
      "((SBU_COMMENT) = ? OR SBU_COMMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuComment", "(SBU_COMMENT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuComment", "(SBU_COMMENT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuCommentasc", "SBU_COMMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuCommentdesc", "SBU_COMMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuUserId", "(SBU_USER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuUserId", "(SBU_USER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuUserId",
      "(SBU_USER_ID IS NULL OR LENGTH((SBU_USER_ID)) IS NULL OR LENGTH((SBU_USER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuUserId", "SBU_USER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuUserIdMatch", "SBU_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuUserId",
      "((SBU_USER_ID) = ? OR SBU_USER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuUserId", "(SBU_USER_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuUserId", "(SBU_USER_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuUserIdasc", "SBU_USER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuUserIddesc", "SBU_USER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuModelId", "SBU_MODEL_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbuModelId", "SBU_MODEL_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuModelId", "SBU_MODEL_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuModelId", "SBU_MODEL_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuModelId", "SBU_MODEL_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuModelId", "SBU_MODEL_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuModelId", "SBU_MODEL_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuModelId", "SBU_MODEL_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuModelIdMatch", "SBU_MODEL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuModelId", "SBU_MODEL_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuModelId",
      "(SBU_MODEL_ID IS NULL OR SBU_MODEL_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuModelId",
      "(SBU_MODEL_ID IS NULL OR SBU_MODEL_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuModelId",
      "(SBU_MODEL_ID IS NULL OR SBU_MODEL_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuModelId", "SBU_MODEL_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuModelId", "SBU_MODEL_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuModelIdasc", "SBU_MODEL_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuModelIddesc", "SBU_MODEL_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuContractLen", "SBU_CONTRACT_LEN = ?" ) // EQUAL

         .addFilterBy( "notequalSbuContractLen", "SBU_CONTRACT_LEN != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuContractLen", "SBU_CONTRACT_LEN IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuContractLen", "SBU_CONTRACT_LEN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuContractLen", "SBU_CONTRACT_LEN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuContractLen", "SBU_CONTRACT_LEN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuContractLen",
      "SBU_CONTRACT_LEN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuContractLen",
      "SBU_CONTRACT_LEN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuContractLenMatch",
      "SBU_CONTRACT_LEN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuContractLen",
      "SBU_CONTRACT_LEN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuContractLen",
      "(SBU_CONTRACT_LEN IS NULL OR SBU_CONTRACT_LEN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuContractLen",
      "(SBU_CONTRACT_LEN IS NULL OR SBU_CONTRACT_LEN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuContractLen",
      "(SBU_CONTRACT_LEN IS NULL OR SBU_CONTRACT_LEN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuContractLen", "SBU_CONTRACT_LEN IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuContractLen", "SBU_CONTRACT_LEN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuContractLenasc", "SBU_CONTRACT_LEN ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuContractLendesc", "SBU_CONTRACT_LEN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuCost", "SBU_COST = ?" ) // EQUAL

         .addFilterBy( "notequalSbuCost", "SBU_COST != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuCost", "SBU_COST IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuCost", "SBU_COST IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuCost", "SBU_COST < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuCost", "SBU_COST > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuCost", "SBU_COST <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuCost", "SBU_COST >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuCostMatch", "SBU_COST LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuCost", "SBU_COST BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuCost",
      "(SBU_COST IS NULL OR SBU_COST = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuCost",
      "(SBU_COST IS NULL OR SBU_COST < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuCost",
      "(SBU_COST IS NULL OR SBU_COST > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuCost", "SBU_COST IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuCost", "SBU_COST NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuCostasc", "SBU_COST ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuCostdesc", "SBU_COST DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuImei", "(SBU_IMEI) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuImei", "(SBU_IMEI) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuImei",
      "(SBU_IMEI IS NULL OR LENGTH((SBU_IMEI)) IS NULL OR LENGTH((SBU_IMEI)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuImei", "SBU_IMEI IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuImeiMatch", "SBU_IMEI LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuImei",
      "((SBU_IMEI) = ? OR SBU_IMEI IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuImei", "(SBU_IMEI) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuImei", "(SBU_IMEI) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuImeiasc", "SBU_IMEI ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuImeidesc", "SBU_IMEI DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuRegionCode", "(SBU_REGION_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuRegionCode", "(SBU_REGION_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuRegionCode",
      "(SBU_REGION_CODE IS NULL OR LENGTH((SBU_REGION_CODE)) IS NULL OR LENGTH((SBU_REGION_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuRegionCode", "SBU_REGION_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuRegionCodeMatch", "SBU_REGION_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuRegionCode",
      "((SBU_REGION_CODE) = ? OR SBU_REGION_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuRegionCode", "(SBU_REGION_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuRegionCode",
      "(SBU_REGION_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuRegionCodeasc", "SBU_REGION_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuRegionCodedesc", "SBU_REGION_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuAccountStatus", "(SBU_ACCOUNT_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuAccountStatus",
      "(SBU_ACCOUNT_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuAccountStatus",
      "(SBU_ACCOUNT_STATUS IS NULL OR LENGTH((SBU_ACCOUNT_STATUS)) IS NULL OR LENGTH((SBU_ACCOUNT_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuAccountStatus",
      "SBU_ACCOUNT_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuAccountStatusMatch",
      "SBU_ACCOUNT_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuAccountStatus",
      "((SBU_ACCOUNT_STATUS) = ? OR SBU_ACCOUNT_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuAccountStatus",
      "(SBU_ACCOUNT_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuAccountStatus",
      "(SBU_ACCOUNT_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuAccountStatusasc", "SBU_ACCOUNT_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuAccountStatusdesc", "SBU_ACCOUNT_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuCollPlan", "(SBU_COLL_PLAN) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuCollPlan", "(SBU_COLL_PLAN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuCollPlan",
      "(SBU_COLL_PLAN IS NULL OR LENGTH((SBU_COLL_PLAN)) IS NULL OR LENGTH((SBU_COLL_PLAN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuCollPlan", "SBU_COLL_PLAN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuCollPlanMatch", "SBU_COLL_PLAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuCollPlan",
      "((SBU_COLL_PLAN) = ? OR SBU_COLL_PLAN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuCollPlan", "(SBU_COLL_PLAN) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuCollPlan", "(SBU_COLL_PLAN) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuCollPlanasc", "SBU_COLL_PLAN ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuCollPlandesc", "SBU_COLL_PLAN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuMtnStatus", "(SBU_MTN_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuMtnStatus", "(SBU_MTN_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuMtnStatus",
      "(SBU_MTN_STATUS IS NULL OR LENGTH((SBU_MTN_STATUS)) IS NULL OR LENGTH((SBU_MTN_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuMtnStatus", "SBU_MTN_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuMtnStatusMatch", "SBU_MTN_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuMtnStatus",
      "((SBU_MTN_STATUS) = ? OR SBU_MTN_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuMtnStatus", "(SBU_MTN_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuMtnStatus",
      "(SBU_MTN_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuMtnStatusasc", "SBU_MTN_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuMtnStatusdesc", "SBU_MTN_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuActivateDate", "SBU_ACTIVATE_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbuActivateDate", "SBU_ACTIVATE_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuActivateDate", "SBU_ACTIVATE_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuActivateDate",
      "SBU_ACTIVATE_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuActivateDate", "SBU_ACTIVATE_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuActivateDate", "SBU_ACTIVATE_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuActivateDate",
      "SBU_ACTIVATE_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuActivateDate",
      "SBU_ACTIVATE_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuActivateDateMatch",
      "SBU_ACTIVATE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuActivateDate",
      "SBU_ACTIVATE_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuActivateDate",
      "(SBU_ACTIVATE_DATE IS NULL OR SBU_ACTIVATE_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuActivateDate",
      "(SBU_ACTIVATE_DATE IS NULL OR SBU_ACTIVATE_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuActivateDate",
      "(SBU_ACTIVATE_DATE IS NULL OR SBU_ACTIVATE_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuActivateDate", "SBU_ACTIVATE_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuActivateDate",
      "SBU_ACTIVATE_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuActivateDateasc", "SBU_ACTIVATE_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuActivateDatedesc", "SBU_ACTIVATE_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuDeactDate", "SBU_DEACT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbuDeactDate", "SBU_DEACT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuDeactDate", "SBU_DEACT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuDeactDate", "SBU_DEACT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuDeactDate", "SBU_DEACT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuDeactDate", "SBU_DEACT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuDeactDate", "SBU_DEACT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuDeactDate", "SBU_DEACT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuDeactDateMatch", "SBU_DEACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuDeactDate", "SBU_DEACT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuDeactDate",
      "(SBU_DEACT_DATE IS NULL OR SBU_DEACT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuDeactDate",
      "(SBU_DEACT_DATE IS NULL OR SBU_DEACT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuDeactDate",
      "(SBU_DEACT_DATE IS NULL OR SBU_DEACT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuDeactDate", "SBU_DEACT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuDeactDate", "SBU_DEACT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuDeactDateasc", "SBU_DEACT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuDeactDatedesc", "SBU_DEACT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuContractAge", "SBU_CONTRACT_AGE = ?" ) // EQUAL

         .addFilterBy( "notequalSbuContractAge", "SBU_CONTRACT_AGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuContractAge", "SBU_CONTRACT_AGE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuContractAge", "SBU_CONTRACT_AGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuContractAge", "SBU_CONTRACT_AGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuContractAge", "SBU_CONTRACT_AGE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuContractAge",
      "SBU_CONTRACT_AGE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuContractAge",
      "SBU_CONTRACT_AGE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuContractAgeMatch",
      "SBU_CONTRACT_AGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuContractAge",
      "SBU_CONTRACT_AGE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuContractAge",
      "(SBU_CONTRACT_AGE IS NULL OR SBU_CONTRACT_AGE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuContractAge",
      "(SBU_CONTRACT_AGE IS NULL OR SBU_CONTRACT_AGE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuContractAge",
      "(SBU_CONTRACT_AGE IS NULL OR SBU_CONTRACT_AGE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuContractAge", "SBU_CONTRACT_AGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuContractAge", "SBU_CONTRACT_AGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuContractAgeasc", "SBU_CONTRACT_AGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuContractAgedesc", "SBU_CONTRACT_AGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuCustomerType", "(SBU_CUSTOMER_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuCustomerType",
      "(SBU_CUSTOMER_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuCustomerType",
      "(SBU_CUSTOMER_TYPE IS NULL OR LENGTH((SBU_CUSTOMER_TYPE)) IS NULL OR LENGTH((SBU_CUSTOMER_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuCustomerType",
      "SBU_CUSTOMER_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuCustomerTypeMatch",
      "SBU_CUSTOMER_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuCustomerType",
      "((SBU_CUSTOMER_TYPE) = ? OR SBU_CUSTOMER_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuCustomerType", "(SBU_CUSTOMER_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuCustomerType",
      "(SBU_CUSTOMER_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuCustomerTypeasc", "SBU_CUSTOMER_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuCustomerTypedesc", "SBU_CUSTOMER_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuTariffCode", "(SBU_TARIFF_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuTariffCode", "(SBU_TARIFF_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuTariffCode",
      "(SBU_TARIFF_CODE IS NULL OR LENGTH((SBU_TARIFF_CODE)) IS NULL OR LENGTH((SBU_TARIFF_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuTariffCode", "SBU_TARIFF_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuTariffCodeMatch", "SBU_TARIFF_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuTariffCode",
      "((SBU_TARIFF_CODE) = ? OR SBU_TARIFF_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuTariffCode", "(SBU_TARIFF_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuTariffCode",
      "(SBU_TARIFF_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuTariffCodeasc", "SBU_TARIFF_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuTariffCodedesc", "SBU_TARIFF_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuPackageCode", "(SBU_PACKAGE_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuPackageCode", "(SBU_PACKAGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuPackageCode",
      "(SBU_PACKAGE_CODE IS NULL OR LENGTH((SBU_PACKAGE_CODE)) IS NULL OR LENGTH((SBU_PACKAGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuPackageCode", "SBU_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuPackageCodeMatch",
      "SBU_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuPackageCode",
      "((SBU_PACKAGE_CODE) = ? OR SBU_PACKAGE_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuPackageCode", "(SBU_PACKAGE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuPackageCode",
      "(SBU_PACKAGE_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuPackageCodeasc", "SBU_PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuPackageCodedesc", "SBU_PACKAGE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuPaymentPlan", "(SBU_PAYMENT_PLAN) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuPaymentPlan", "(SBU_PAYMENT_PLAN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuPaymentPlan",
      "(SBU_PAYMENT_PLAN IS NULL OR LENGTH((SBU_PAYMENT_PLAN)) IS NULL OR LENGTH((SBU_PAYMENT_PLAN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuPaymentPlan", "SBU_PAYMENT_PLAN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuPaymentPlanMatch",
      "SBU_PAYMENT_PLAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuPaymentPlan",
      "((SBU_PAYMENT_PLAN) = ? OR SBU_PAYMENT_PLAN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuPaymentPlan", "(SBU_PAYMENT_PLAN) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuPaymentPlan",
      "(SBU_PAYMENT_PLAN) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuPaymentPlanasc", "SBU_PAYMENT_PLAN ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuPaymentPlandesc", "SBU_PAYMENT_PLAN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuTermDate", "SBU_TERM_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbuTermDate", "SBU_TERM_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuTermDate", "SBU_TERM_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuTermDate", "SBU_TERM_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuTermDate", "SBU_TERM_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuTermDate", "SBU_TERM_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuTermDate", "SBU_TERM_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuTermDate", "SBU_TERM_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuTermDateMatch", "SBU_TERM_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuTermDate", "SBU_TERM_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuTermDate",
      "(SBU_TERM_DATE IS NULL OR SBU_TERM_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuTermDate",
      "(SBU_TERM_DATE IS NULL OR SBU_TERM_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuTermDate",
      "(SBU_TERM_DATE IS NULL OR SBU_TERM_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuTermDate", "SBU_TERM_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuTermDate", "SBU_TERM_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuTermDateasc", "SBU_TERM_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuTermDatedesc", "SBU_TERM_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuAgeingBucket", "(SBU_AGEING_BUCKET) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuAgeingBucket",
      "(SBU_AGEING_BUCKET) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuAgeingBucket",
      "(SBU_AGEING_BUCKET IS NULL OR LENGTH((SBU_AGEING_BUCKET)) IS NULL OR LENGTH((SBU_AGEING_BUCKET)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuAgeingBucket",
      "SBU_AGEING_BUCKET IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuAgeingBucketMatch",
      "SBU_AGEING_BUCKET LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuAgeingBucket",
      "((SBU_AGEING_BUCKET) = ? OR SBU_AGEING_BUCKET IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuAgeingBucket", "(SBU_AGEING_BUCKET) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuAgeingBucket",
      "(SBU_AGEING_BUCKET) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuAgeingBucketasc", "SBU_AGEING_BUCKET ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuAgeingBucketdesc", "SBU_AGEING_BUCKET DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuAveragespend", "SBU_AVERAGESPEND = ?" ) // EQUAL

         .addFilterBy( "notequalSbuAveragespend", "SBU_AVERAGESPEND != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuAveragespend", "SBU_AVERAGESPEND IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuAveragespend",
      "SBU_AVERAGESPEND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuAveragespend", "SBU_AVERAGESPEND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuAveragespend", "SBU_AVERAGESPEND > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuAveragespend",
      "SBU_AVERAGESPEND <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuAveragespend",
      "SBU_AVERAGESPEND >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuAveragespendMatch",
      "SBU_AVERAGESPEND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuAveragespend",
      "SBU_AVERAGESPEND BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuAveragespend",
      "(SBU_AVERAGESPEND IS NULL OR SBU_AVERAGESPEND = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuAveragespend",
      "(SBU_AVERAGESPEND IS NULL OR SBU_AVERAGESPEND < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuAveragespend",
      "(SBU_AVERAGESPEND IS NULL OR SBU_AVERAGESPEND > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuAveragespend", "SBU_AVERAGESPEND IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuAveragespend", "SBU_AVERAGESPEND NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuAveragespendasc", "SBU_AVERAGESPEND ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuAveragespenddesc", "SBU_AVERAGESPEND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuDateprocessed", "SBU_DATEPROCESSED = ?" ) // EQUAL

         .addFilterBy( "notequalSbuDateprocessed", "SBU_DATEPROCESSED != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuDateprocessed", "SBU_DATEPROCESSED IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuDateprocessed",
      "SBU_DATEPROCESSED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuDateprocessed", "SBU_DATEPROCESSED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuDateprocessed", "SBU_DATEPROCESSED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuDateprocessed",
      "SBU_DATEPROCESSED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuDateprocessed",
      "SBU_DATEPROCESSED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuDateprocessedMatch",
      "SBU_DATEPROCESSED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuDateprocessed",
      "SBU_DATEPROCESSED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuDateprocessed",
      "(SBU_DATEPROCESSED IS NULL OR SBU_DATEPROCESSED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuDateprocessed",
      "(SBU_DATEPROCESSED IS NULL OR SBU_DATEPROCESSED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuDateprocessed",
      "(SBU_DATEPROCESSED IS NULL OR SBU_DATEPROCESSED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuDateprocessed", "SBU_DATEPROCESSED IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuDateprocessed",
      "SBU_DATEPROCESSED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuDateprocessedasc", "SBU_DATEPROCESSED ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuDateprocesseddesc", "SBU_DATEPROCESSED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuDateapproved", "SBU_DATEAPPROVED = ?" ) // EQUAL

         .addFilterBy( "notequalSbuDateapproved", "SBU_DATEAPPROVED != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuDateapproved", "SBU_DATEAPPROVED IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbuDateapproved",
      "SBU_DATEAPPROVED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbuDateapproved", "SBU_DATEAPPROVED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbuDateapproved", "SBU_DATEAPPROVED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbuDateapproved",
      "SBU_DATEAPPROVED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbuDateapproved",
      "SBU_DATEAPPROVED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbuDateapprovedMatch",
      "SBU_DATEAPPROVED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbuDateapproved",
      "SBU_DATEAPPROVED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbuDateapproved",
      "(SBU_DATEAPPROVED IS NULL OR SBU_DATEAPPROVED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbuDateapproved",
      "(SBU_DATEAPPROVED IS NULL OR SBU_DATEAPPROVED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbuDateapproved",
      "(SBU_DATEAPPROVED IS NULL OR SBU_DATEAPPROVED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbuDateapproved", "SBU_DATEAPPROVED IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuDateapproved", "SBU_DATEAPPROVED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuDateapprovedasc", "SBU_DATEAPPROVED ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuDateapproveddesc", "SBU_DATEAPPROVED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuUpgradeStatus", "(SBU_UPGRADE_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuUpgradeStatus",
      "(SBU_UPGRADE_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuUpgradeStatus",
      "(SBU_UPGRADE_STATUS IS NULL OR LENGTH((SBU_UPGRADE_STATUS)) IS NULL OR LENGTH((SBU_UPGRADE_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuUpgradeStatus",
      "SBU_UPGRADE_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuUpgradeStatusMatch",
      "SBU_UPGRADE_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuUpgradeStatus",
      "((SBU_UPGRADE_STATUS) = ? OR SBU_UPGRADE_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuUpgradeStatus",
      "(SBU_UPGRADE_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuUpgradeStatus",
      "(SBU_UPGRADE_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuUpgradeStatusasc", "SBU_UPGRADE_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuUpgradeStatusdesc", "SBU_UPGRADE_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuChannel", "(SBU_CHANNEL) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuChannel", "(SBU_CHANNEL) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuChannel",
      "(SBU_CHANNEL IS NULL OR LENGTH((SBU_CHANNEL)) IS NULL OR LENGTH((SBU_CHANNEL)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuChannel", "SBU_CHANNEL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuChannelMatch", "SBU_CHANNEL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuChannel",
      "((SBU_CHANNEL) = ? OR SBU_CHANNEL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuChannel", "(SBU_CHANNEL) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuChannel", "(SBU_CHANNEL) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuChannelasc", "SBU_CHANNEL ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuChanneldesc", "SBU_CHANNEL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbuRecordStatus", "(SBU_RECORD_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalSbuRecordStatus",
      "(SBU_RECORD_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbuRecordStatus",
      "(SBU_RECORD_STATUS IS NULL OR LENGTH((SBU_RECORD_STATUS)) IS NULL OR LENGTH((SBU_RECORD_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbuRecordStatus",
      "SBU_RECORD_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbuRecordStatusMatch",
      "SBU_RECORD_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbuRecordStatus",
      "((SBU_RECORD_STATUS) = ? OR SBU_RECORD_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbuRecordStatus", "(SBU_RECORD_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbuRecordStatus",
      "(SBU_RECORD_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbuRecordStatusasc", "SBU_RECORD_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbuRecordStatusdesc", "SBU_RECORD_STATUS DESC" ) // ORDER DESCENDING
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
      dml = new SbuSubUpgradeDMLFactory(  );
    }

    return dml;
  }
}
