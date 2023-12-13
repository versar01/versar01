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
 * This is the DMLFactory for DibDiscountBand.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DibDiscountBandAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DibDiscountBandAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DibDiscountBandAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DibDiscountBand", // dmlName
        "blo.DibDiscountBandDMO", // dmoName
        "DIB_DISCOUNT_BAND", // tableName
        8, // numColumns
        "DIB_BAND_ID, DIB_RULE_ID, DIB_BAND_END, DIB_DISC_TYPE, DIB_DISC_VALUE, DIB_MAX_DISCOUNT, DIB_LIMIT_DISC, DIB_CHARGE_REF", // columnList
        "DIB_BAND_ID" + ", DIB_RULE_ID" + ", DIB_BAND_END", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "DIB_BAND_ID, DIB_RULE_ID, DIB_BAND_END, DIB_DISC_TYPE, DIB_DISC_VALUE, DIB_MAX_DISCOUNT, DIB_LIMIT_DISC, DIB_CHARGE_REF",
        "", "",
        new String[] {
          "DIB_BAND_ID", "DIB_RULE_ID", "DIB_BAND_END", "DIB_DISC_TYPE",
          "DIB_DISC_VALUE", "DIB_MAX_DISCOUNT", "DIB_LIMIT_DISC",
          "DIB_CHARGE_REF"
        } );

    table.addFilterBy( "equalDibBandId", /* PK attribute */
      "DIB_BAND_ID = ?" )
         .addFilterBy( "filterByDibBandIdMatch", "DIB_BAND_ID LIKE ?" )
         .addFilterBy( "INDibBandId", "DIB_BAND_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibBandId", "DIB_BAND_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDibBandId", "DIB_BAND_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibBandId", "DIB_BAND_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDibBandId", "DIB_BAND_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibBandId", "DIB_BAND_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibBandId", "DIB_BAND_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDibBandId", "DIB_BAND_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDibBandId", "DIB_BAND_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDibBandIdMatch", "DIB_BAND_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDibBandId", "DIB_BAND_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDibBandId",
      "(DIB_BAND_ID IS NULL OR DIB_BAND_ID = ?)" ) // EQUALORNULL
                                                   // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDibBandId",
      "(DIB_BAND_ID IS NULL OR DIB_BAND_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDibBandId",
      "(DIB_BAND_ID IS NULL OR DIB_BAND_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DibBandIdasc", "DIB_BAND_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibBandIddesc", "DIB_BAND_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalDibRuleId", /* PK attribute */
      "DIB_RULE_ID = ?" )
         .addFilterBy( "filterByDibRuleIdMatch", "DIB_RULE_ID LIKE ?" )
         .addFilterBy( "INDibRuleId", "DIB_RULE_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibRuleId", "DIB_RULE_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDibRuleId", "DIB_RULE_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibRuleId", "DIB_RULE_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDibRuleId", "DIB_RULE_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibRuleId", "DIB_RULE_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibRuleId", "DIB_RULE_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDibRuleId", "DIB_RULE_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDibRuleId", "DIB_RULE_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDibRuleIdMatch", "DIB_RULE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDibRuleId", "DIB_RULE_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDibRuleId",
      "(DIB_RULE_ID IS NULL OR DIB_RULE_ID = ?)" ) // EQUALORNULL
                                                   // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDibRuleId",
      "(DIB_RULE_ID IS NULL OR DIB_RULE_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDibRuleId",
      "(DIB_RULE_ID IS NULL OR DIB_RULE_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DibRuleIdasc", "DIB_RULE_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibRuleIddesc", "DIB_RULE_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalDibBandEnd", /* PK attribute */
      "DIB_BAND_END = ?" )
         .addFilterBy( "filterByDibBandEndMatch", "DIB_BAND_END LIKE ?" )
         .addFilterBy( "INDibBandEnd", "DIB_BAND_END IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibBandEnd", "DIB_BAND_END NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDibBandEnd", "DIB_BAND_END != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibBandEnd", "DIB_BAND_END IS NULL" ) // IS NULL

         .addFilterBy( "notnullDibBandEnd", "DIB_BAND_END IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibBandEnd", "DIB_BAND_END < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibBandEnd", "DIB_BAND_END > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDibBandEnd", "DIB_BAND_END <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDibBandEnd", "DIB_BAND_END >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDibBandEndMatch", "DIB_BAND_END LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDibBandEnd", "DIB_BAND_END BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDibBandEnd",
      "(DIB_BAND_END IS NULL OR DIB_BAND_END = ?)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDibBandEnd",
      "(DIB_BAND_END IS NULL OR DIB_BAND_END < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDibBandEnd",
      "(DIB_BAND_END IS NULL OR DIB_BAND_END > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DibBandEndasc", "DIB_BAND_END ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibBandEnddesc", "DIB_BAND_END DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDibDiscType", "DIB_DISC_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalDibDiscType", "DIB_DISC_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibDiscType",
      "(DIB_DISC_TYPE IS NULL OR LENGTH(DIB_DISC_TYPE) IS NULL OR LENGTH(DIB_DISC_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDibDiscType", "DIB_DISC_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibDiscType", "DIB_DISC_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibDiscType", "DIB_DISC_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDibDiscTypeMatch", "DIB_DISC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDibDiscType",
      "(DIB_DISC_TYPE = ? OR DIB_DISC_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDibDiscType", "DIB_DISC_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibDiscType", "DIB_DISC_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DibDiscTypeasc", "DIB_DISC_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibDiscTypedesc", "DIB_DISC_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDibDiscValue", "DIB_DISC_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalDibDiscValue", "DIB_DISC_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibDiscValue", "DIB_DISC_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDibDiscValue", "DIB_DISC_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibDiscValue", "DIB_DISC_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibDiscValue", "DIB_DISC_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDibDiscValue", "DIB_DISC_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDibDiscValue", "DIB_DISC_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDibDiscValueMatch", "DIB_DISC_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDibDiscValue", "DIB_DISC_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDibDiscValue",
      "(DIB_DISC_VALUE IS NULL OR DIB_DISC_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDibDiscValue",
      "(DIB_DISC_VALUE IS NULL OR DIB_DISC_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDibDiscValue",
      "(DIB_DISC_VALUE IS NULL OR DIB_DISC_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDibDiscValue", "DIB_DISC_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibDiscValue", "DIB_DISC_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DibDiscValueasc", "DIB_DISC_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibDiscValuedesc", "DIB_DISC_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDibMaxDiscount", "DIB_MAX_DISCOUNT = ?" ) // EQUAL

         .addFilterBy( "notequalDibMaxDiscount", "DIB_MAX_DISCOUNT != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibMaxDiscount", "DIB_MAX_DISCOUNT IS NULL" ) // IS NULL

         .addFilterBy( "notnullDibMaxDiscount", "DIB_MAX_DISCOUNT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibMaxDiscount", "DIB_MAX_DISCOUNT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibMaxDiscount", "DIB_MAX_DISCOUNT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDibMaxDiscount",
      "DIB_MAX_DISCOUNT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDibMaxDiscount",
      "DIB_MAX_DISCOUNT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDibMaxDiscountMatch",
      "DIB_MAX_DISCOUNT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDibMaxDiscount",
      "DIB_MAX_DISCOUNT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDibMaxDiscount",
      "(DIB_MAX_DISCOUNT IS NULL OR DIB_MAX_DISCOUNT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDibMaxDiscount",
      "(DIB_MAX_DISCOUNT IS NULL OR DIB_MAX_DISCOUNT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDibMaxDiscount",
      "(DIB_MAX_DISCOUNT IS NULL OR DIB_MAX_DISCOUNT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDibMaxDiscount", "DIB_MAX_DISCOUNT IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibMaxDiscount", "DIB_MAX_DISCOUNT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DibMaxDiscountasc", "DIB_MAX_DISCOUNT ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibMaxDiscountdesc", "DIB_MAX_DISCOUNT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDibLimitDisc", "DIB_LIMIT_DISC = ?" ) // EQUAL

         .addFilterBy( "notequalDibLimitDisc", "DIB_LIMIT_DISC != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibLimitDisc",
      "(DIB_LIMIT_DISC IS NULL OR LENGTH(DIB_LIMIT_DISC) IS NULL OR LENGTH(DIB_LIMIT_DISC) = 0)" ) // IS NULL

         .addFilterBy( "notnullDibLimitDisc", "DIB_LIMIT_DISC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibLimitDisc", "DIB_LIMIT_DISC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibLimitDisc", "DIB_LIMIT_DISC > ?" ) // GREATER THAN

         .addFilterBy( "filterByDibLimitDiscMatch", "DIB_LIMIT_DISC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDibLimitDisc",
      "(DIB_LIMIT_DISC = ? OR DIB_LIMIT_DISC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDibLimitDisc", "DIB_LIMIT_DISC IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibLimitDisc", "DIB_LIMIT_DISC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DibLimitDiscasc", "DIB_LIMIT_DISC ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibLimitDiscdesc", "DIB_LIMIT_DISC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDibChargeRef", "DIB_CHARGE_REF = ?" ) // EQUAL

         .addFilterBy( "notequalDibChargeRef", "DIB_CHARGE_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullDibChargeRef",
      "(DIB_CHARGE_REF IS NULL OR LENGTH(DIB_CHARGE_REF) IS NULL OR LENGTH(DIB_CHARGE_REF) = 0)" ) // IS NULL

         .addFilterBy( "notnullDibChargeRef", "DIB_CHARGE_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDibChargeRef", "DIB_CHARGE_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDibChargeRef", "DIB_CHARGE_REF > ?" ) // GREATER THAN

         .addFilterBy( "filterByDibChargeRefMatch", "DIB_CHARGE_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDibChargeRef",
      "(DIB_CHARGE_REF = ? OR DIB_CHARGE_REF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDibChargeRef", "DIB_CHARGE_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINDibChargeRef", "DIB_CHARGE_REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DibChargeRefasc", "DIB_CHARGE_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "DibChargeRefdesc", "DIB_CHARGE_REF DESC" ) // ORDER DESCENDING
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
      dml = new DibDiscountBandDMLFactory(  );
    }

    return dml;
  }
}
