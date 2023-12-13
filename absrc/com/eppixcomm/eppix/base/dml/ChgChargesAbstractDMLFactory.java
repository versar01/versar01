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
 * This is the DMLFactory for ChgCharges.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class ChgChargesAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new ChgChargesAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected ChgChargesAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "ChgCharges", // dmlName
        "blo.ChgChargesDMO", // dmoName
        "CHG_CHARGES", // tableName
        11, // numColumns
        "CHG_CODE, CHG_DESCRIPTION, CHG_VALUE, CHG_VAT_CODE, CHG_NCODE, CHG_NETID, CHG_CHARGEF, CHG_PERIOD, CHG_FREQUENCY"
        + ", CHG_EFFECTIVE_DATE, CHG_CLASS_ID", // columnList
        "CHG_CODE" + ", CHG_NETID" + ", CHG_EFFECTIVE_DATE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "CHG_CODE, CHG_DESCRIPTION, CHG_VALUE, CHG_VAT_CODE, CHG_NCODE, CHG_NETID, CHG_CHARGEF, CHG_PERIOD, CHG_FREQUENCY"
        + ", CHG_EFFECTIVE_DATE, CHG_CLASS_ID", "", "",
        new String[] {
          "CHG_CODE", "CHG_DESCRIPTION", "CHG_VALUE", "CHG_VAT_CODE",
          "CHG_NCODE", "CHG_NETID", "CHG_CHARGEF", "CHG_PERIOD",
          "CHG_FREQUENCY", "CHG_EFFECTIVE_DATE", "CHG_CLASS_ID"
        } );

    table.addFilterBy( "equalChgCode", /* PK attribute */
      "CHG_CODE = ?" )
         .addFilterBy( "filterByChgCodeMatch", "CHG_CODE LIKE ?" )
         .addFilterBy( "INChgCode", "CHG_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgCode", "CHG_CODE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalChgCode", "CHG_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgCode",
      "(CHG_CODE IS NULL OR LENGTH(CHG_CODE) IS NULL OR LENGTH(CHG_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgCode", "CHG_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgCode", "CHG_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgCode", "CHG_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgCodeMatch", "CHG_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgCode",
      "(CHG_CODE = ? OR CHG_CODE IS NULL)" ) // EQUALORNULL
                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "ChgCodeasc", "CHG_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgCodedesc", "CHG_CODE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalChgNetid", /* PK attribute */
      "CHG_NETID = ?" )
         .addFilterBy( "filterByChgNetidMatch", "CHG_NETID LIKE ?" )
         .addFilterBy( "INChgNetid", "CHG_NETID IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgNetid", "CHG_NETID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalChgNetid", "CHG_NETID != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgNetid",
      "(CHG_NETID IS NULL OR LENGTH(CHG_NETID) IS NULL OR LENGTH(CHG_NETID) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgNetid", "CHG_NETID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgNetid", "CHG_NETID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgNetid", "CHG_NETID > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgNetidMatch", "CHG_NETID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgNetid",
      "(CHG_NETID = ? OR CHG_NETID IS NULL)" ) // EQUALORNULL
                                               // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "ChgNetidasc", "CHG_NETID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgNetiddesc", "CHG_NETID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalChgEffectiveDate", /* PK attribute */
      "CHG_EFFECTIVE_DATE = ?" )
         .addFilterBy( "filterByChgEffectiveDateMatch",
      "CHG_EFFECTIVE_DATE LIKE ?" )
         .addFilterBy( "INChgEffectiveDate", "CHG_EFFECTIVE_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgEffectiveDate",
      "CHG_EFFECTIVE_DATE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalChgEffectiveDate", "CHG_EFFECTIVE_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgEffectiveDate", "CHG_EFFECTIVE_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullChgEffectiveDate",
      "CHG_EFFECTIVE_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgEffectiveDate", "CHG_EFFECTIVE_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgEffectiveDate", "CHG_EFFECTIVE_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalChgEffectiveDate",
      "CHG_EFFECTIVE_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalChgEffectiveDate",
      "CHG_EFFECTIVE_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChgEffectiveDateMatch",
      "CHG_EFFECTIVE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenChgEffectiveDate",
      "CHG_EFFECTIVE_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullChgEffectiveDate",
      "(CHG_EFFECTIVE_DATE IS NULL OR CHG_EFFECTIVE_DATE = ?)" ) // EQUALORNULL
                                                                 // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullChgEffectiveDate",
      "(CHG_EFFECTIVE_DATE IS NULL OR CHG_EFFECTIVE_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullChgEffectiveDate",
      "(CHG_EFFECTIVE_DATE IS NULL OR CHG_EFFECTIVE_DATE > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "ChgEffectiveDateasc", "CHG_EFFECTIVE_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgEffectiveDatedesc", "CHG_EFFECTIVE_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgDescription", "CHG_DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalChgDescription", "CHG_DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgDescription",
      "(CHG_DESCRIPTION IS NULL OR LENGTH(CHG_DESCRIPTION) IS NULL OR LENGTH(CHG_DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgDescription", "CHG_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgDescription", "CHG_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgDescription", "CHG_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgDescriptionMatch", "CHG_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgDescription",
      "(CHG_DESCRIPTION = ? OR CHG_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChgDescription", "CHG_DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgDescription", "CHG_DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgDescriptionasc", "CHG_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgDescriptiondesc", "CHG_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgValue", "CHG_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalChgValue", "CHG_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgValue", "CHG_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullChgValue", "CHG_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgValue", "CHG_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgValue", "CHG_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalChgValue", "CHG_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalChgValue", "CHG_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChgValueMatch", "CHG_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenChgValue", "CHG_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullChgValue",
      "(CHG_VALUE IS NULL OR CHG_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullChgValue",
      "(CHG_VALUE IS NULL OR CHG_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullChgValue",
      "(CHG_VALUE IS NULL OR CHG_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INChgValue", "CHG_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgValue", "CHG_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgValueasc", "CHG_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgValuedesc", "CHG_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgVatCode", "CHG_VAT_CODE = ?" ) // EQUAL

         .addFilterBy( "notequalChgVatCode", "CHG_VAT_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgVatCode",
      "(CHG_VAT_CODE IS NULL OR LENGTH(CHG_VAT_CODE) IS NULL OR LENGTH(CHG_VAT_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgVatCode", "CHG_VAT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgVatCode", "CHG_VAT_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgVatCode", "CHG_VAT_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgVatCodeMatch", "CHG_VAT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgVatCode",
      "(CHG_VAT_CODE = ? OR CHG_VAT_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChgVatCode", "CHG_VAT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgVatCode", "CHG_VAT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgVatCodeasc", "CHG_VAT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgVatCodedesc", "CHG_VAT_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgNcode", "CHG_NCODE = ?" ) // EQUAL

         .addFilterBy( "notequalChgNcode", "CHG_NCODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgNcode",
      "(CHG_NCODE IS NULL OR LENGTH(CHG_NCODE) IS NULL OR LENGTH(CHG_NCODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgNcode", "CHG_NCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgNcode", "CHG_NCODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgNcode", "CHG_NCODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgNcodeMatch", "CHG_NCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgNcode",
      "(CHG_NCODE = ? OR CHG_NCODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChgNcode", "CHG_NCODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgNcode", "CHG_NCODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgNcodeasc", "CHG_NCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgNcodedesc", "CHG_NCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgChargef", "CHG_CHARGEF = ?" ) // EQUAL

         .addFilterBy( "notequalChgChargef", "CHG_CHARGEF != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgChargef",
      "(CHG_CHARGEF IS NULL OR LENGTH(CHG_CHARGEF) IS NULL OR LENGTH(CHG_CHARGEF) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgChargef", "CHG_CHARGEF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgChargef", "CHG_CHARGEF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgChargef", "CHG_CHARGEF > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgChargefMatch", "CHG_CHARGEF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgChargef",
      "(CHG_CHARGEF = ? OR CHG_CHARGEF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChgChargef", "CHG_CHARGEF IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgChargef", "CHG_CHARGEF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgChargefasc", "CHG_CHARGEF ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgChargefdesc", "CHG_CHARGEF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgPeriod", "CHG_PERIOD = ?" ) // EQUAL

         .addFilterBy( "notequalChgPeriod", "CHG_PERIOD != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgPeriod",
      "(CHG_PERIOD IS NULL OR LENGTH(CHG_PERIOD) IS NULL OR LENGTH(CHG_PERIOD) = 0)" ) // IS NULL

         .addFilterBy( "notnullChgPeriod", "CHG_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgPeriod", "CHG_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgPeriod", "CHG_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "filterByChgPeriodMatch", "CHG_PERIOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChgPeriod",
      "(CHG_PERIOD = ? OR CHG_PERIOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChgPeriod", "CHG_PERIOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgPeriod", "CHG_PERIOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgPeriodasc", "CHG_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgPerioddesc", "CHG_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgFrequency", "CHG_FREQUENCY = ?" ) // EQUAL

         .addFilterBy( "notequalChgFrequency", "CHG_FREQUENCY != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgFrequency", "CHG_FREQUENCY IS NULL" ) // IS NULL

         .addFilterBy( "notnullChgFrequency", "CHG_FREQUENCY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgFrequency", "CHG_FREQUENCY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgFrequency", "CHG_FREQUENCY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalChgFrequency", "CHG_FREQUENCY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalChgFrequency", "CHG_FREQUENCY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChgFrequencyMatch", "CHG_FREQUENCY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenChgFrequency", "CHG_FREQUENCY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullChgFrequency",
      "(CHG_FREQUENCY IS NULL OR CHG_FREQUENCY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullChgFrequency",
      "(CHG_FREQUENCY IS NULL OR CHG_FREQUENCY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullChgFrequency",
      "(CHG_FREQUENCY IS NULL OR CHG_FREQUENCY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INChgFrequency", "CHG_FREQUENCY IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgFrequency", "CHG_FREQUENCY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgFrequencyasc", "CHG_FREQUENCY ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgFrequencydesc", "CHG_FREQUENCY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChgClassId", "CHG_CLASS_ID = ?" ) // EQUAL

         .addFilterBy( "notequalChgClassId", "CHG_CLASS_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullChgClassId", "CHG_CLASS_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullChgClassId", "CHG_CLASS_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChgClassId", "CHG_CLASS_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChgClassId", "CHG_CLASS_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalChgClassId", "CHG_CLASS_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalChgClassId", "CHG_CLASS_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChgClassIdMatch", "CHG_CLASS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenChgClassId", "CHG_CLASS_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullChgClassId",
      "(CHG_CLASS_ID IS NULL OR CHG_CLASS_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullChgClassId",
      "(CHG_CLASS_ID IS NULL OR CHG_CLASS_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullChgClassId",
      "(CHG_CLASS_ID IS NULL OR CHG_CLASS_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INChgClassId", "CHG_CLASS_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINChgClassId", "CHG_CLASS_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChgClassIdasc", "CHG_CLASS_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChgClassIddesc", "CHG_CLASS_ID DESC" ) // ORDER DESCENDING
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
      dml = new ChgChargesDMLFactory(  );
    }

    return dml;
  }
}
