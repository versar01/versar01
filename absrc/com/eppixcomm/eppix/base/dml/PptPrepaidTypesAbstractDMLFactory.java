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
 * This is the DMLFactory for PptPrepaidTypes.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PptPrepaidTypesAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PptPrepaidTypesAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected PptPrepaidTypesAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "PptPrepaidTypes", // dmlName
        "blo.PptPrepaidTypesDMO", // dmoName
        "PPT_PREPAID_TYPES", // tableName
        19, // numColumns
        "PPT_TYPE, PPT_DESCRIPTION, PPT_CREDIT, PPT_VALIDITY, PPT_VALIDITY_UNIT, PPT_ACTIVITY, PPT_ACTIVITY_UNIT, PPT_RECHARGE, PPT_RECHARGE_UNIT"
        + ", PPT_CREDIT_WARN, PPT_VALIDITY_WARN, PPT_VALWARN_UNIT, PPT_ACTIVITY_WARN, PPT_ACTWARN_UNIT, PPT_RECHARGE_WARN, PPT_RECHWARN_UNIT, PPT_DEF_PACKAGE, PPT_DEF_TARIFF"
        + ", PPT_CHANGE_DEF", // columnList
        "PPT_TYPE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "PPT_TYPE, PPT_DESCRIPTION, PPT_CREDIT, PPT_VALIDITY, PPT_VALIDITY_UNIT, PPT_ACTIVITY, PPT_ACTIVITY_UNIT, PPT_RECHARGE, PPT_RECHARGE_UNIT"
        + ", PPT_CREDIT_WARN, PPT_VALIDITY_WARN, PPT_VALWARN_UNIT, PPT_ACTIVITY_WARN, PPT_ACTWARN_UNIT, PPT_RECHARGE_WARN, PPT_RECHWARN_UNIT, PPT_DEF_PACKAGE, PPT_DEF_TARIFF"
        + ", PPT_CHANGE_DEF", "", "",
        new String[] {
          "PPT_TYPE", "PPT_DESCRIPTION", "PPT_CREDIT", "PPT_VALIDITY",
          "PPT_VALIDITY_UNIT", "PPT_ACTIVITY", "PPT_ACTIVITY_UNIT",
          "PPT_RECHARGE", "PPT_RECHARGE_UNIT", "PPT_CREDIT_WARN",
          "PPT_VALIDITY_WARN", "PPT_VALWARN_UNIT", "PPT_ACTIVITY_WARN",
          "PPT_ACTWARN_UNIT", "PPT_RECHARGE_WARN", "PPT_RECHWARN_UNIT",
          "PPT_DEF_PACKAGE", "PPT_DEF_TARIFF", "PPT_CHANGE_DEF"
        } );

    table.addFilterBy( "equalPptType", /* PK attribute */
      "PPT_TYPE = ?" )
         .addFilterBy( "filterByPptTypeMatch", "PPT_TYPE LIKE ?" )
         .addFilterBy( "INPptType", "PPT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptType", "PPT_TYPE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPptType", "PPT_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptType",
      "(PPT_TYPE IS NULL OR LENGTH(PPT_TYPE) IS NULL OR LENGTH(PPT_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptType", "PPT_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptType", "PPT_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptType", "PPT_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptTypeMatch", "PPT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptType",
      "(PPT_TYPE = ? OR PPT_TYPE IS NULL)" ) // EQUALORNULL
                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "PptTypeasc", "PPT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptTypedesc", "PPT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptDescription", "PPT_DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalPptDescription", "PPT_DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptDescription",
      "(PPT_DESCRIPTION IS NULL OR LENGTH(PPT_DESCRIPTION) IS NULL OR LENGTH(PPT_DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptDescription", "PPT_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptDescription", "PPT_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptDescription", "PPT_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptDescriptionMatch", "PPT_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptDescription",
      "(PPT_DESCRIPTION = ? OR PPT_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptDescription", "PPT_DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptDescription", "PPT_DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptDescriptionasc", "PPT_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptDescriptiondesc", "PPT_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptCredit", "PPT_CREDIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptCredit", "PPT_CREDIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptCredit", "PPT_CREDIT IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptCredit", "PPT_CREDIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptCredit", "PPT_CREDIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptCredit", "PPT_CREDIT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptCredit", "PPT_CREDIT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptCredit", "PPT_CREDIT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptCreditMatch", "PPT_CREDIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptCredit", "PPT_CREDIT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptCredit",
      "(PPT_CREDIT IS NULL OR PPT_CREDIT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptCredit",
      "(PPT_CREDIT IS NULL OR PPT_CREDIT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptCredit",
      "(PPT_CREDIT IS NULL OR PPT_CREDIT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptCredit", "PPT_CREDIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptCredit", "PPT_CREDIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptCreditasc", "PPT_CREDIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptCreditdesc", "PPT_CREDIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptValidity", "PPT_VALIDITY = ?" ) // EQUAL

         .addFilterBy( "notequalPptValidity", "PPT_VALIDITY != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptValidity", "PPT_VALIDITY IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptValidity", "PPT_VALIDITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptValidity", "PPT_VALIDITY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptValidity", "PPT_VALIDITY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptValidity", "PPT_VALIDITY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptValidity", "PPT_VALIDITY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptValidityMatch", "PPT_VALIDITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptValidity", "PPT_VALIDITY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptValidity",
      "(PPT_VALIDITY IS NULL OR PPT_VALIDITY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptValidity",
      "(PPT_VALIDITY IS NULL OR PPT_VALIDITY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptValidity",
      "(PPT_VALIDITY IS NULL OR PPT_VALIDITY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptValidity", "PPT_VALIDITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptValidity", "PPT_VALIDITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptValidityasc", "PPT_VALIDITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptValiditydesc", "PPT_VALIDITY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptValidityUnit", "PPT_VALIDITY_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptValidityUnit", "PPT_VALIDITY_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptValidityUnit",
      "(PPT_VALIDITY_UNIT IS NULL OR LENGTH(PPT_VALIDITY_UNIT) IS NULL OR LENGTH(PPT_VALIDITY_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptValidityUnit",
      "PPT_VALIDITY_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptValidityUnit", "PPT_VALIDITY_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptValidityUnit", "PPT_VALIDITY_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptValidityUnitMatch",
      "PPT_VALIDITY_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptValidityUnit",
      "(PPT_VALIDITY_UNIT = ? OR PPT_VALIDITY_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptValidityUnit", "PPT_VALIDITY_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptValidityUnit",
      "PPT_VALIDITY_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptValidityUnitasc", "PPT_VALIDITY_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptValidityUnitdesc", "PPT_VALIDITY_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptActivity", "PPT_ACTIVITY = ?" ) // EQUAL

         .addFilterBy( "notequalPptActivity", "PPT_ACTIVITY != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptActivity", "PPT_ACTIVITY IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptActivity", "PPT_ACTIVITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptActivity", "PPT_ACTIVITY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptActivity", "PPT_ACTIVITY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptActivity", "PPT_ACTIVITY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptActivity", "PPT_ACTIVITY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptActivityMatch", "PPT_ACTIVITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptActivity", "PPT_ACTIVITY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptActivity",
      "(PPT_ACTIVITY IS NULL OR PPT_ACTIVITY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptActivity",
      "(PPT_ACTIVITY IS NULL OR PPT_ACTIVITY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptActivity",
      "(PPT_ACTIVITY IS NULL OR PPT_ACTIVITY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptActivity", "PPT_ACTIVITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptActivity", "PPT_ACTIVITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptActivityasc", "PPT_ACTIVITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptActivitydesc", "PPT_ACTIVITY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptActivityUnit", "PPT_ACTIVITY_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptActivityUnit", "PPT_ACTIVITY_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptActivityUnit",
      "(PPT_ACTIVITY_UNIT IS NULL OR LENGTH(PPT_ACTIVITY_UNIT) IS NULL OR LENGTH(PPT_ACTIVITY_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptActivityUnit",
      "PPT_ACTIVITY_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptActivityUnit", "PPT_ACTIVITY_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptActivityUnit", "PPT_ACTIVITY_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptActivityUnitMatch",
      "PPT_ACTIVITY_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptActivityUnit",
      "(PPT_ACTIVITY_UNIT = ? OR PPT_ACTIVITY_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptActivityUnit", "PPT_ACTIVITY_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptActivityUnit",
      "PPT_ACTIVITY_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptActivityUnitasc", "PPT_ACTIVITY_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptActivityUnitdesc", "PPT_ACTIVITY_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptRecharge", "PPT_RECHARGE = ?" ) // EQUAL

         .addFilterBy( "notequalPptRecharge", "PPT_RECHARGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptRecharge", "PPT_RECHARGE IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptRecharge", "PPT_RECHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptRecharge", "PPT_RECHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptRecharge", "PPT_RECHARGE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptRecharge", "PPT_RECHARGE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptRecharge", "PPT_RECHARGE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptRechargeMatch", "PPT_RECHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptRecharge", "PPT_RECHARGE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptRecharge",
      "(PPT_RECHARGE IS NULL OR PPT_RECHARGE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptRecharge",
      "(PPT_RECHARGE IS NULL OR PPT_RECHARGE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptRecharge",
      "(PPT_RECHARGE IS NULL OR PPT_RECHARGE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptRecharge", "PPT_RECHARGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptRecharge", "PPT_RECHARGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptRechargeasc", "PPT_RECHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptRechargedesc", "PPT_RECHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptRechargeUnit", "PPT_RECHARGE_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptRechargeUnit", "PPT_RECHARGE_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptRechargeUnit",
      "(PPT_RECHARGE_UNIT IS NULL OR LENGTH(PPT_RECHARGE_UNIT) IS NULL OR LENGTH(PPT_RECHARGE_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptRechargeUnit",
      "PPT_RECHARGE_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptRechargeUnit", "PPT_RECHARGE_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptRechargeUnit", "PPT_RECHARGE_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptRechargeUnitMatch",
      "PPT_RECHARGE_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptRechargeUnit",
      "(PPT_RECHARGE_UNIT = ? OR PPT_RECHARGE_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptRechargeUnit", "PPT_RECHARGE_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptRechargeUnit",
      "PPT_RECHARGE_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptRechargeUnitasc", "PPT_RECHARGE_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptRechargeUnitdesc", "PPT_RECHARGE_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptCreditWarn", "PPT_CREDIT_WARN = ?" ) // EQUAL

         .addFilterBy( "notequalPptCreditWarn", "PPT_CREDIT_WARN != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptCreditWarn", "PPT_CREDIT_WARN IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptCreditWarn", "PPT_CREDIT_WARN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptCreditWarn", "PPT_CREDIT_WARN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptCreditWarn", "PPT_CREDIT_WARN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptCreditWarn", "PPT_CREDIT_WARN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptCreditWarn",
      "PPT_CREDIT_WARN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptCreditWarnMatch", "PPT_CREDIT_WARN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptCreditWarn",
      "PPT_CREDIT_WARN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptCreditWarn",
      "(PPT_CREDIT_WARN IS NULL OR PPT_CREDIT_WARN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptCreditWarn",
      "(PPT_CREDIT_WARN IS NULL OR PPT_CREDIT_WARN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptCreditWarn",
      "(PPT_CREDIT_WARN IS NULL OR PPT_CREDIT_WARN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptCreditWarn", "PPT_CREDIT_WARN IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptCreditWarn", "PPT_CREDIT_WARN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptCreditWarnasc", "PPT_CREDIT_WARN ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptCreditWarndesc", "PPT_CREDIT_WARN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptValidityWarn", "PPT_VALIDITY_WARN = ?" ) // EQUAL

         .addFilterBy( "notequalPptValidityWarn", "PPT_VALIDITY_WARN != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptValidityWarn", "PPT_VALIDITY_WARN IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptValidityWarn",
      "PPT_VALIDITY_WARN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptValidityWarn", "PPT_VALIDITY_WARN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptValidityWarn", "PPT_VALIDITY_WARN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptValidityWarn",
      "PPT_VALIDITY_WARN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptValidityWarn",
      "PPT_VALIDITY_WARN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptValidityWarnMatch",
      "PPT_VALIDITY_WARN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptValidityWarn",
      "PPT_VALIDITY_WARN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptValidityWarn",
      "(PPT_VALIDITY_WARN IS NULL OR PPT_VALIDITY_WARN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptValidityWarn",
      "(PPT_VALIDITY_WARN IS NULL OR PPT_VALIDITY_WARN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptValidityWarn",
      "(PPT_VALIDITY_WARN IS NULL OR PPT_VALIDITY_WARN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptValidityWarn", "PPT_VALIDITY_WARN IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptValidityWarn",
      "PPT_VALIDITY_WARN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptValidityWarnasc", "PPT_VALIDITY_WARN ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptValidityWarndesc", "PPT_VALIDITY_WARN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptValwarnUnit", "PPT_VALWARN_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptValwarnUnit", "PPT_VALWARN_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptValwarnUnit",
      "(PPT_VALWARN_UNIT IS NULL OR LENGTH(PPT_VALWARN_UNIT) IS NULL OR LENGTH(PPT_VALWARN_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptValwarnUnit", "PPT_VALWARN_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptValwarnUnit", "PPT_VALWARN_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptValwarnUnit", "PPT_VALWARN_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptValwarnUnitMatch",
      "PPT_VALWARN_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptValwarnUnit",
      "(PPT_VALWARN_UNIT = ? OR PPT_VALWARN_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptValwarnUnit", "PPT_VALWARN_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptValwarnUnit", "PPT_VALWARN_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptValwarnUnitasc", "PPT_VALWARN_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptValwarnUnitdesc", "PPT_VALWARN_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptActivityWarn", "PPT_ACTIVITY_WARN = ?" ) // EQUAL

         .addFilterBy( "notequalPptActivityWarn", "PPT_ACTIVITY_WARN != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptActivityWarn", "PPT_ACTIVITY_WARN IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptActivityWarn",
      "PPT_ACTIVITY_WARN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptActivityWarn", "PPT_ACTIVITY_WARN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptActivityWarn", "PPT_ACTIVITY_WARN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptActivityWarn",
      "PPT_ACTIVITY_WARN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptActivityWarn",
      "PPT_ACTIVITY_WARN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptActivityWarnMatch",
      "PPT_ACTIVITY_WARN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptActivityWarn",
      "PPT_ACTIVITY_WARN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptActivityWarn",
      "(PPT_ACTIVITY_WARN IS NULL OR PPT_ACTIVITY_WARN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptActivityWarn",
      "(PPT_ACTIVITY_WARN IS NULL OR PPT_ACTIVITY_WARN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptActivityWarn",
      "(PPT_ACTIVITY_WARN IS NULL OR PPT_ACTIVITY_WARN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptActivityWarn", "PPT_ACTIVITY_WARN IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptActivityWarn",
      "PPT_ACTIVITY_WARN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptActivityWarnasc", "PPT_ACTIVITY_WARN ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptActivityWarndesc", "PPT_ACTIVITY_WARN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptActwarnUnit", "PPT_ACTWARN_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptActwarnUnit", "PPT_ACTWARN_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptActwarnUnit",
      "(PPT_ACTWARN_UNIT IS NULL OR LENGTH(PPT_ACTWARN_UNIT) IS NULL OR LENGTH(PPT_ACTWARN_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptActwarnUnit", "PPT_ACTWARN_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptActwarnUnit", "PPT_ACTWARN_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptActwarnUnit", "PPT_ACTWARN_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptActwarnUnitMatch",
      "PPT_ACTWARN_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptActwarnUnit",
      "(PPT_ACTWARN_UNIT = ? OR PPT_ACTWARN_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptActwarnUnit", "PPT_ACTWARN_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptActwarnUnit", "PPT_ACTWARN_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptActwarnUnitasc", "PPT_ACTWARN_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptActwarnUnitdesc", "PPT_ACTWARN_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptRechargeWarn", "PPT_RECHARGE_WARN = ?" ) // EQUAL

         .addFilterBy( "notequalPptRechargeWarn", "PPT_RECHARGE_WARN != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptRechargeWarn", "PPT_RECHARGE_WARN IS NULL" ) // IS NULL

         .addFilterBy( "notnullPptRechargeWarn",
      "PPT_RECHARGE_WARN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptRechargeWarn", "PPT_RECHARGE_WARN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptRechargeWarn", "PPT_RECHARGE_WARN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPptRechargeWarn",
      "PPT_RECHARGE_WARN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPptRechargeWarn",
      "PPT_RECHARGE_WARN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPptRechargeWarnMatch",
      "PPT_RECHARGE_WARN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPptRechargeWarn",
      "PPT_RECHARGE_WARN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPptRechargeWarn",
      "(PPT_RECHARGE_WARN IS NULL OR PPT_RECHARGE_WARN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPptRechargeWarn",
      "(PPT_RECHARGE_WARN IS NULL OR PPT_RECHARGE_WARN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPptRechargeWarn",
      "(PPT_RECHARGE_WARN IS NULL OR PPT_RECHARGE_WARN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPptRechargeWarn", "PPT_RECHARGE_WARN IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptRechargeWarn",
      "PPT_RECHARGE_WARN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptRechargeWarnasc", "PPT_RECHARGE_WARN ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptRechargeWarndesc", "PPT_RECHARGE_WARN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptRechwarnUnit", "PPT_RECHWARN_UNIT = ?" ) // EQUAL

         .addFilterBy( "notequalPptRechwarnUnit", "PPT_RECHWARN_UNIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptRechwarnUnit",
      "(PPT_RECHWARN_UNIT IS NULL OR LENGTH(PPT_RECHWARN_UNIT) IS NULL OR LENGTH(PPT_RECHWARN_UNIT) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptRechwarnUnit",
      "PPT_RECHWARN_UNIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptRechwarnUnit", "PPT_RECHWARN_UNIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptRechwarnUnit", "PPT_RECHWARN_UNIT > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptRechwarnUnitMatch",
      "PPT_RECHWARN_UNIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptRechwarnUnit",
      "(PPT_RECHWARN_UNIT = ? OR PPT_RECHWARN_UNIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptRechwarnUnit", "PPT_RECHWARN_UNIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptRechwarnUnit",
      "PPT_RECHWARN_UNIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptRechwarnUnitasc", "PPT_RECHWARN_UNIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptRechwarnUnitdesc", "PPT_RECHWARN_UNIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptDefPackage", "PPT_DEF_PACKAGE = ?" ) // EQUAL

         .addFilterBy( "notequalPptDefPackage", "PPT_DEF_PACKAGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptDefPackage",
      "(PPT_DEF_PACKAGE IS NULL OR LENGTH(PPT_DEF_PACKAGE) IS NULL OR LENGTH(PPT_DEF_PACKAGE) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptDefPackage", "PPT_DEF_PACKAGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptDefPackage", "PPT_DEF_PACKAGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptDefPackage", "PPT_DEF_PACKAGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptDefPackageMatch", "PPT_DEF_PACKAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptDefPackage",
      "(PPT_DEF_PACKAGE = ? OR PPT_DEF_PACKAGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptDefPackage", "PPT_DEF_PACKAGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptDefPackage", "PPT_DEF_PACKAGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptDefPackageasc", "PPT_DEF_PACKAGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptDefPackagedesc", "PPT_DEF_PACKAGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptDefTariff", "PPT_DEF_TARIFF = ?" ) // EQUAL

         .addFilterBy( "notequalPptDefTariff", "PPT_DEF_TARIFF != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptDefTariff",
      "(PPT_DEF_TARIFF IS NULL OR LENGTH(PPT_DEF_TARIFF) IS NULL OR LENGTH(PPT_DEF_TARIFF) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptDefTariff", "PPT_DEF_TARIFF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptDefTariff", "PPT_DEF_TARIFF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptDefTariff", "PPT_DEF_TARIFF > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptDefTariffMatch", "PPT_DEF_TARIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptDefTariff",
      "(PPT_DEF_TARIFF = ? OR PPT_DEF_TARIFF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptDefTariff", "PPT_DEF_TARIFF IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptDefTariff", "PPT_DEF_TARIFF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptDefTariffasc", "PPT_DEF_TARIFF ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptDefTariffdesc", "PPT_DEF_TARIFF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPptChangeDef", "PPT_CHANGE_DEF = ?" ) // EQUAL

         .addFilterBy( "notequalPptChangeDef", "PPT_CHANGE_DEF != ?" ) // NOTEQUAL

         .addFilterBy( "nullPptChangeDef",
      "(PPT_CHANGE_DEF IS NULL OR LENGTH(PPT_CHANGE_DEF) IS NULL OR LENGTH(PPT_CHANGE_DEF) = 0)" ) // IS NULL

         .addFilterBy( "notnullPptChangeDef", "PPT_CHANGE_DEF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPptChangeDef", "PPT_CHANGE_DEF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPptChangeDef", "PPT_CHANGE_DEF > ?" ) // GREATER THAN

         .addFilterBy( "filterByPptChangeDefMatch", "PPT_CHANGE_DEF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPptChangeDef",
      "(PPT_CHANGE_DEF = ? OR PPT_CHANGE_DEF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPptChangeDef", "PPT_CHANGE_DEF IN ( ? )" ) // IN

         .addFilterBy( "NOTINPptChangeDef", "PPT_CHANGE_DEF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PptChangeDefasc", "PPT_CHANGE_DEF ASC" ) // ORDER ASCENDING

         .addOrderBy( "PptChangeDefdesc", "PPT_CHANGE_DEF DESC" ) // ORDER DESCENDING
    ;

//    table.addFilterBy( "equalPptProfile", "PPT_PROFILE = ?" ) // EQUAL
//
//         .addFilterBy( "notequalPptProfile", "PPT_PROFILE != ?" ) // NOTEQUAL
//
//         .addFilterBy( "nullPptProfile",
//      "(PPT_PROFILE IS NULL OR LENGTH(PPT_PROFILE) IS NULL OR LENGTH(PPT_PROFILE) = 0)" ) // IS NULL
//
//         .addFilterBy( "notnullPptProfile", "PPT_PROFILE IS NOT NULL" ) // IS NOT NULL
//
//         .addFilterBy( "lessthanPptProfile", "PPT_PROFILE < ?" ) // LESS THAN
//
//         .addFilterBy( "greaterthanPptProfile", "PPT_PROFILE > ?" ) // GREATER THAN
//
//         .addFilterBy( "filterByPptProfileMatch", "PPT_PROFILE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
//
//         .addFilterBy( "equalornullPptProfile",
//      "(PPT_PROFILE = ? OR PPT_PROFILE IS NULL)" ) // EQUALORNULL
//
//         .addFilterBy( "INPptProfile", "PPT_PROFILE IN ( ? )" ) // IN
//
//         .addFilterBy( "NOTINPptProfile", "PPT_PROFILE NOT IN ( ? )" ) // NOT IN
//
//         .addOrderBy( "PptProfileasc", "PPT_PROFILE ASC" ) // ORDER ASCENDING
//
//         .addOrderBy( "PptProfiledesc", "PPT_PROFILE DESC" ) // ORDER DESCENDING
//    ;

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
      dml = new PptPrepaidTypesDMLFactory(  );
    }

    return dml;
  }
}
