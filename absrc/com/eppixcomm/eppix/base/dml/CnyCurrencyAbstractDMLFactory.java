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
 * This is the DMLFactory for CnyCurrency.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class CnyCurrencyAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CnyCurrencyAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected CnyCurrencyAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "CnyCurrency", // dmlName
        "blo.CnyCurrencyDMO", // dmoName
        "CNY_CURRENCY", // tableName
        10, // numColumns
        "CNY_CURRENCY_REF, CNY_CURRENCY_TEXT, CNY_EXCHANGE_RATE, CNY_NO_DECS, CNY_OPERATOR, CNY_CUR_SYMBOL, CNY_GRP_SYMBOL, CNY_DEC_SYMBOL, CNY_ROUND_FROM"
        + ", CNY_TIMESTAMP", // columnList
        "CNY_CURRENCY_REF", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "CNY_CURRENCY_REF, CNY_CURRENCY_TEXT, CNY_EXCHANGE_RATE, CNY_NO_DECS, CNY_OPERATOR, CNY_CUR_SYMBOL, CNY_GRP_SYMBOL, CNY_DEC_SYMBOL, CNY_ROUND_FROM"
        + ", CNY_TIMESTAMP", "", "",
        new String[] {
          "CNY_CURRENCY_REF", "CNY_CURRENCY_TEXT", "CNY_EXCHANGE_RATE",
          "CNY_NO_DECS", "CNY_OPERATOR", "CNY_CUR_SYMBOL", "CNY_GRP_SYMBOL",
          "CNY_DEC_SYMBOL", "CNY_ROUND_FROM", "CNY_TIMESTAMP"
        } );

    table.addFilterBy( "equalCnyCurrencyRef", /* PK attribute */
      "CNY_CURRENCY_REF = ?" )
         .addFilterBy( "filterByCnyCurrencyRefMatch",
      "CNY_CURRENCY_REF LIKE ?" )
         .addFilterBy( "INCnyCurrencyRef", "CNY_CURRENCY_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyCurrencyRef", "CNY_CURRENCY_REF NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalCnyCurrencyRef", "CNY_CURRENCY_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyCurrencyRef",
      "(CNY_CURRENCY_REF IS NULL OR LENGTH(CNY_CURRENCY_REF) IS NULL OR LENGTH(CNY_CURRENCY_REF) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyCurrencyRef", "CNY_CURRENCY_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyCurrencyRef", "CNY_CURRENCY_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyCurrencyRef", "CNY_CURRENCY_REF > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyCurrencyRefMatch",
      "CNY_CURRENCY_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyCurrencyRef",
      "(CNY_CURRENCY_REF = ? OR CNY_CURRENCY_REF IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "CnyCurrencyRefasc", "CNY_CURRENCY_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyCurrencyRefdesc", "CNY_CURRENCY_REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyCurrencyText", "CNY_CURRENCY_TEXT = ?" ) // EQUAL

         .addFilterBy( "notequalCnyCurrencyText", "CNY_CURRENCY_TEXT != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyCurrencyText",
      "(CNY_CURRENCY_TEXT IS NULL OR LENGTH(CNY_CURRENCY_TEXT) IS NULL OR LENGTH(CNY_CURRENCY_TEXT) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyCurrencyText",
      "CNY_CURRENCY_TEXT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyCurrencyText", "CNY_CURRENCY_TEXT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyCurrencyText", "CNY_CURRENCY_TEXT > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyCurrencyTextMatch",
      "CNY_CURRENCY_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyCurrencyText",
      "(CNY_CURRENCY_TEXT = ? OR CNY_CURRENCY_TEXT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCnyCurrencyText", "CNY_CURRENCY_TEXT IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyCurrencyText",
      "CNY_CURRENCY_TEXT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyCurrencyTextasc", "CNY_CURRENCY_TEXT ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyCurrencyTextdesc", "CNY_CURRENCY_TEXT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyExchangeRate", "CNY_EXCHANGE_RATE = ?" ) // EQUAL

         .addFilterBy( "notequalCnyExchangeRate", "CNY_EXCHANGE_RATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyExchangeRate", "CNY_EXCHANGE_RATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCnyExchangeRate",
      "CNY_EXCHANGE_RATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyExchangeRate", "CNY_EXCHANGE_RATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyExchangeRate", "CNY_EXCHANGE_RATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCnyExchangeRate",
      "CNY_EXCHANGE_RATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCnyExchangeRate",
      "CNY_EXCHANGE_RATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCnyExchangeRateMatch",
      "CNY_EXCHANGE_RATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCnyExchangeRate",
      "CNY_EXCHANGE_RATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCnyExchangeRate",
      "(CNY_EXCHANGE_RATE IS NULL OR CNY_EXCHANGE_RATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCnyExchangeRate",
      "(CNY_EXCHANGE_RATE IS NULL OR CNY_EXCHANGE_RATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCnyExchangeRate",
      "(CNY_EXCHANGE_RATE IS NULL OR CNY_EXCHANGE_RATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCnyExchangeRate", "CNY_EXCHANGE_RATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyExchangeRate",
      "CNY_EXCHANGE_RATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyExchangeRateasc", "CNY_EXCHANGE_RATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyExchangeRatedesc", "CNY_EXCHANGE_RATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyNoDecs", "CNY_NO_DECS = ?" ) // EQUAL

         .addFilterBy( "notequalCnyNoDecs", "CNY_NO_DECS != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyNoDecs", "CNY_NO_DECS IS NULL" ) // IS NULL

         .addFilterBy( "notnullCnyNoDecs", "CNY_NO_DECS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyNoDecs", "CNY_NO_DECS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyNoDecs", "CNY_NO_DECS > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCnyNoDecs", "CNY_NO_DECS <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCnyNoDecs", "CNY_NO_DECS >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCnyNoDecsMatch", "CNY_NO_DECS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCnyNoDecs", "CNY_NO_DECS BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCnyNoDecs",
      "(CNY_NO_DECS IS NULL OR CNY_NO_DECS = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCnyNoDecs",
      "(CNY_NO_DECS IS NULL OR CNY_NO_DECS < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCnyNoDecs",
      "(CNY_NO_DECS IS NULL OR CNY_NO_DECS > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCnyNoDecs", "CNY_NO_DECS IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyNoDecs", "CNY_NO_DECS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyNoDecsasc", "CNY_NO_DECS ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyNoDecsdesc", "CNY_NO_DECS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyOperator", "CNY_OPERATOR = ?" ) // EQUAL

         .addFilterBy( "notequalCnyOperator", "CNY_OPERATOR != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyOperator",
      "(CNY_OPERATOR IS NULL OR LENGTH(CNY_OPERATOR) IS NULL OR LENGTH(CNY_OPERATOR) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyOperator", "CNY_OPERATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyOperator", "CNY_OPERATOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyOperator", "CNY_OPERATOR > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyOperatorMatch", "CNY_OPERATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyOperator",
      "(CNY_OPERATOR = ? OR CNY_OPERATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCnyOperator", "CNY_OPERATOR IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyOperator", "CNY_OPERATOR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyOperatorasc", "CNY_OPERATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyOperatordesc", "CNY_OPERATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyCurSymbol", "CNY_CUR_SYMBOL = ?" ) // EQUAL

         .addFilterBy( "notequalCnyCurSymbol", "CNY_CUR_SYMBOL != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyCurSymbol",
      "(CNY_CUR_SYMBOL IS NULL OR LENGTH(CNY_CUR_SYMBOL) IS NULL OR LENGTH(CNY_CUR_SYMBOL) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyCurSymbol", "CNY_CUR_SYMBOL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyCurSymbol", "CNY_CUR_SYMBOL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyCurSymbol", "CNY_CUR_SYMBOL > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyCurSymbolMatch", "CNY_CUR_SYMBOL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyCurSymbol",
      "(CNY_CUR_SYMBOL = ? OR CNY_CUR_SYMBOL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCnyCurSymbol", "CNY_CUR_SYMBOL IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyCurSymbol", "CNY_CUR_SYMBOL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyCurSymbolasc", "CNY_CUR_SYMBOL ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyCurSymboldesc", "CNY_CUR_SYMBOL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyGrpSymbol", "CNY_GRP_SYMBOL = ?" ) // EQUAL

         .addFilterBy( "notequalCnyGrpSymbol", "CNY_GRP_SYMBOL != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyGrpSymbol",
      "(CNY_GRP_SYMBOL IS NULL OR LENGTH(CNY_GRP_SYMBOL) IS NULL OR LENGTH(CNY_GRP_SYMBOL) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyGrpSymbol", "CNY_GRP_SYMBOL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyGrpSymbol", "CNY_GRP_SYMBOL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyGrpSymbol", "CNY_GRP_SYMBOL > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyGrpSymbolMatch", "CNY_GRP_SYMBOL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyGrpSymbol",
      "(CNY_GRP_SYMBOL = ? OR CNY_GRP_SYMBOL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCnyGrpSymbol", "CNY_GRP_SYMBOL IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyGrpSymbol", "CNY_GRP_SYMBOL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyGrpSymbolasc", "CNY_GRP_SYMBOL ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyGrpSymboldesc", "CNY_GRP_SYMBOL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyDecSymbol", "CNY_DEC_SYMBOL = ?" ) // EQUAL

         .addFilterBy( "notequalCnyDecSymbol", "CNY_DEC_SYMBOL != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyDecSymbol",
      "(CNY_DEC_SYMBOL IS NULL OR LENGTH(CNY_DEC_SYMBOL) IS NULL OR LENGTH(CNY_DEC_SYMBOL) = 0)" ) // IS NULL

         .addFilterBy( "notnullCnyDecSymbol", "CNY_DEC_SYMBOL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyDecSymbol", "CNY_DEC_SYMBOL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyDecSymbol", "CNY_DEC_SYMBOL > ?" ) // GREATER THAN

         .addFilterBy( "filterByCnyDecSymbolMatch", "CNY_DEC_SYMBOL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCnyDecSymbol",
      "(CNY_DEC_SYMBOL = ? OR CNY_DEC_SYMBOL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCnyDecSymbol", "CNY_DEC_SYMBOL IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyDecSymbol", "CNY_DEC_SYMBOL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyDecSymbolasc", "CNY_DEC_SYMBOL ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyDecSymboldesc", "CNY_DEC_SYMBOL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyRoundFrom", "CNY_ROUND_FROM = ?" ) // EQUAL

         .addFilterBy( "notequalCnyRoundFrom", "CNY_ROUND_FROM != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyRoundFrom", "CNY_ROUND_FROM IS NULL" ) // IS NULL

         .addFilterBy( "notnullCnyRoundFrom", "CNY_ROUND_FROM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyRoundFrom", "CNY_ROUND_FROM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyRoundFrom", "CNY_ROUND_FROM > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCnyRoundFrom", "CNY_ROUND_FROM <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCnyRoundFrom", "CNY_ROUND_FROM >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCnyRoundFromMatch", "CNY_ROUND_FROM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCnyRoundFrom", "CNY_ROUND_FROM BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCnyRoundFrom",
      "(CNY_ROUND_FROM IS NULL OR CNY_ROUND_FROM = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCnyRoundFrom",
      "(CNY_ROUND_FROM IS NULL OR CNY_ROUND_FROM < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCnyRoundFrom",
      "(CNY_ROUND_FROM IS NULL OR CNY_ROUND_FROM > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCnyRoundFrom", "CNY_ROUND_FROM IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyRoundFrom", "CNY_ROUND_FROM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyRoundFromasc", "CNY_ROUND_FROM ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyRoundFromdesc", "CNY_ROUND_FROM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCnyTimestamp", "CNY_TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalCnyTimestamp", "CNY_TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullCnyTimestamp", "CNY_TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullCnyTimestamp", "CNY_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCnyTimestamp", "CNY_TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCnyTimestamp", "CNY_TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCnyTimestamp", "CNY_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCnyTimestamp", "CNY_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCnyTimestampMatch", "CNY_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCnyTimestamp", "CNY_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCnyTimestamp",
      "(CNY_TIMESTAMP IS NULL OR CNY_TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCnyTimestamp",
      "(CNY_TIMESTAMP IS NULL OR CNY_TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCnyTimestamp",
      "(CNY_TIMESTAMP IS NULL OR CNY_TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCnyTimestamp", "CNY_TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINCnyTimestamp", "CNY_TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CnyTimestampasc", "CNY_TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "CnyTimestampdesc", "CNY_TIMESTAMP DESC" ) // ORDER DESCENDING
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
      dml = new CnyCurrencyDMLFactory(  );
    }

    return dml;
  }
}
