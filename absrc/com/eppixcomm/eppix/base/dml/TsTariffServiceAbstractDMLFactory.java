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
 * This is the DMLFactory for TsTariffService.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class TsTariffServiceAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TsTariffServiceAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected TsTariffServiceAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "TsTariffService", // dmlName
        "blo.TsTariffServiceDMO", // dmoName
        "TS_TARIFF_SERVICE", // tableName
        15, // numColumns
        "TS_PACKAGE_CODE, TS_INTERNAL_TARIFF, TS_SERVICE_CODE, TS_NET_SERV_CODE, TS_ACT_CHARGE, TS_TDEACT_CHARGE, TS_REACT_CHARGE, TS_PDEACT_CHARGE, TS_SUB_CHARGE1"
        + ", TS_SUB_CHARGE2, TS_SUB_CHARGE3, TS_CHARGE_PERIOD, TS_CHARGE_FREQ, TS_DISCOUNT_REF, TS_ACT_INCLUSIVE", // columnList
        "(TS_PACKAGE_CODE)" + ", (TS_INTERNAL_TARIFF)"
        + ", (TS_SERVICE_CODE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "TS_PACKAGE_CODE, TS_INTERNAL_TARIFF, TS_SERVICE_CODE, TS_NET_SERV_CODE, TS_ACT_CHARGE, TS_TDEACT_CHARGE, TS_REACT_CHARGE, TS_PDEACT_CHARGE, TS_SUB_CHARGE1"
        + ", TS_SUB_CHARGE2, TS_SUB_CHARGE3, TS_CHARGE_PERIOD, TS_CHARGE_FREQ, TS_DISCOUNT_REF, TS_ACT_INCLUSIVE",
        "", "",
        new String[] {
          "TS_PACKAGE_CODE", "TS_INTERNAL_TARIFF", "TS_SERVICE_CODE",
          "TS_NET_SERV_CODE", "TS_ACT_CHARGE", "TS_TDEACT_CHARGE",
          "TS_REACT_CHARGE", "TS_PDEACT_CHARGE", "TS_SUB_CHARGE1",
          "TS_SUB_CHARGE2", "TS_SUB_CHARGE3", "TS_CHARGE_PERIOD",
          "TS_CHARGE_FREQ", "TS_DISCOUNT_REF", "TS_ACT_INCLUSIVE"
        },true );

    table.addFilterBy( "equalTsPackageCode", /* PK attribute */
      "(TS_PACKAGE_CODE) = ?" )
         .addFilterBy( "filterByTsPackageCodeMatch", "TS_PACKAGE_CODE LIKE ?" )
         .addFilterBy( "INTsPackageCode", "(TS_PACKAGE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsPackageCode",
      "(TS_PACKAGE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalTsPackageCode", "(TS_PACKAGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsPackageCode",
      "(TS_PACKAGE_CODE IS NULL OR LENGTH((TS_PACKAGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsPackageCode", "TS_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsPackageCode", "TS_PACKAGE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsPackageCode", "TS_PACKAGE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsPackageCodeMatch", "TS_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsPackageCode",
      "((TS_PACKAGE_CODE) = ? OR TS_PACKAGE_CODE IS NULL)" ) // EQUALORNULL
                                                                 // TODO : we may need to wrap this with a () 

         .addOrderBy( "TsPackageCodeasc", "TS_PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsPackageCodedesc", "TS_PACKAGE_CODE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalTsInternalTariff", /* PK attribute */
      "(TS_INTERNAL_TARIFF) = ?" )
         .addFilterBy( "filterByTsInternalTariffMatch",
      "TS_INTERNAL_TARIFF LIKE ?" )
         .addFilterBy( "INTsInternalTariff",
      "(TS_INTERNAL_TARIFF) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsInternalTariff",
      "(TS_INTERNAL_TARIFF) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalTsInternalTariff",
      "(TS_INTERNAL_TARIFF) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsInternalTariff",
      "(TS_INTERNAL_TARIFF IS NULL OR LENGTH((TS_INTERNAL_TARIFF)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsInternalTariff",
      "TS_INTERNAL_TARIFF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsInternalTariff", "TS_INTERNAL_TARIFF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsInternalTariff", "TS_INTERNAL_TARIFF > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsInternalTariffMatch",
      "TS_INTERNAL_TARIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsInternalTariff",
      "((TS_INTERNAL_TARIFF) = ? OR TS_INTERNAL_TARIFF IS NULL)" ) // EQUALORNULL
                                                                       // TODO : we may need to wrap this with a () 

         .addOrderBy( "TsInternalTariffasc", "TS_INTERNAL_TARIFF ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsInternalTariffdesc", "TS_INTERNAL_TARIFF DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalTsServiceCode", /* PK attribute */
      "(TS_SERVICE_CODE) = ?" )
         .addFilterBy( "filterByTsServiceCodeMatch", "TS_SERVICE_CODE LIKE ?" )
         .addFilterBy( "INTsServiceCode", "(TS_SERVICE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsServiceCode",
      "(TS_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalTsServiceCode", "(TS_SERVICE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsServiceCode",
      "(TS_SERVICE_CODE IS NULL OR LENGTH((TS_SERVICE_CODE)) IS NULL OR LENGTH((TS_SERVICE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsServiceCode", "TS_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsServiceCode", "TS_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsServiceCode", "TS_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsServiceCodeMatch", "TS_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsServiceCode",
      "((TS_SERVICE_CODE) = ? OR TS_SERVICE_CODE IS NULL)" ) // EQUALORNULL
                                                                 // TODO : we may need to wrap this with a () 

         .addOrderBy( "TsServiceCodeasc", "TS_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsServiceCodedesc", "TS_SERVICE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsNetServCode", "(TS_NET_SERV_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsNetServCode", "(TS_NET_SERV_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsNetServCode",
      "(TS_NET_SERV_CODE IS NULL OR LENGTH((TS_NET_SERV_CODE)) IS NULL OR LENGTH((TS_NET_SERV_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsNetServCode", "TS_NET_SERV_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsNetServCode", "TS_NET_SERV_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsNetServCode", "TS_NET_SERV_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsNetServCodeMatch", "TS_NET_SERV_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsNetServCode",
      "((TS_NET_SERV_CODE) = ? OR TS_NET_SERV_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsNetServCode", "(TS_NET_SERV_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsNetServCode",
      "(TS_NET_SERV_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsNetServCodeasc", "TS_NET_SERV_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsNetServCodedesc", "TS_NET_SERV_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsActCharge", "(TS_ACT_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsActCharge", "(TS_ACT_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsActCharge",
      "(TS_ACT_CHARGE IS NULL OR LENGTH((TS_ACT_CHARGE)) IS NULL OR LENGTH((TS_ACT_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsActCharge", "TS_ACT_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsActCharge", "TS_ACT_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsActCharge", "TS_ACT_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsActChargeMatch", "TS_ACT_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsActCharge",
      "((TS_ACT_CHARGE) = ? OR TS_ACT_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsActCharge", "(TS_ACT_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsActCharge", "(TS_ACT_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsActChargeasc", "TS_ACT_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsActChargedesc", "TS_ACT_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsTdeactCharge", "(TS_TDEACT_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsTdeactCharge", "(TS_TDEACT_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsTdeactCharge",
      "(TS_TDEACT_CHARGE IS NULL OR LENGTH((TS_TDEACT_CHARGE)) IS NULL OR LENGTH((TS_TDEACT_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsTdeactCharge", "TS_TDEACT_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsTdeactCharge", "TS_TDEACT_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsTdeactCharge", "TS_TDEACT_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsTdeactChargeMatch",
      "TS_TDEACT_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsTdeactCharge",
      "((TS_TDEACT_CHARGE) = ? OR TS_TDEACT_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsTdeactCharge", "(TS_TDEACT_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsTdeactCharge",
      "(TS_TDEACT_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsTdeactChargeasc", "TS_TDEACT_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsTdeactChargedesc", "TS_TDEACT_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsReactCharge", "(TS_REACT_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsReactCharge", "(TS_REACT_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsReactCharge",
      "(TS_REACT_CHARGE IS NULL OR LENGTH((TS_REACT_CHARGE)) IS NULL OR LENGTH((TS_REACT_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsReactCharge", "TS_REACT_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsReactCharge", "TS_REACT_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsReactCharge", "TS_REACT_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsReactChargeMatch", "TS_REACT_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsReactCharge",
      "((TS_REACT_CHARGE) = ? OR TS_REACT_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsReactCharge", "(TS_REACT_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsReactCharge",
      "(TS_REACT_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsReactChargeasc", "TS_REACT_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsReactChargedesc", "TS_REACT_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsPdeactCharge", "(TS_PDEACT_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsPdeactCharge", "(TS_PDEACT_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsPdeactCharge",
      "(TS_PDEACT_CHARGE IS NULL OR LENGTH((TS_PDEACT_CHARGE)) IS NULL OR LENGTH((TS_PDEACT_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsPdeactCharge", "TS_PDEACT_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsPdeactCharge", "TS_PDEACT_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsPdeactCharge", "TS_PDEACT_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsPdeactChargeMatch",
      "TS_PDEACT_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsPdeactCharge",
      "((TS_PDEACT_CHARGE) = ? OR TS_PDEACT_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsPdeactCharge", "(TS_PDEACT_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsPdeactCharge",
      "(TS_PDEACT_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsPdeactChargeasc", "TS_PDEACT_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsPdeactChargedesc", "TS_PDEACT_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsSubCharge1", "(TS_SUB_CHARGE1) = ?" ) // EQUAL

         .addFilterBy( "notequalTsSubCharge1", "(TS_SUB_CHARGE1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsSubCharge1",
      "(TS_SUB_CHARGE1 IS NULL OR LENGTH((TS_SUB_CHARGE1)) IS NULL OR LENGTH((TS_SUB_CHARGE1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsSubCharge1", "TS_SUB_CHARGE1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsSubCharge1", "TS_SUB_CHARGE1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsSubCharge1", "TS_SUB_CHARGE1 > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsSubCharge1Match", "TS_SUB_CHARGE1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsSubCharge1",
      "((TS_SUB_CHARGE1) = ? OR TS_SUB_CHARGE1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsSubCharge1", "(TS_SUB_CHARGE1) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsSubCharge1",
      "(TS_SUB_CHARGE1) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsSubCharge1asc", "TS_SUB_CHARGE1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsSubCharge1desc", "TS_SUB_CHARGE1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsSubCharge2", "(TS_SUB_CHARGE2) = ?" ) // EQUAL

         .addFilterBy( "notequalTsSubCharge2", "(TS_SUB_CHARGE2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsSubCharge2",
      "(TS_SUB_CHARGE2 IS NULL OR LENGTH((TS_SUB_CHARGE2)) IS NULL OR LENGTH((TS_SUB_CHARGE2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsSubCharge2", "TS_SUB_CHARGE2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsSubCharge2", "TS_SUB_CHARGE2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsSubCharge2", "TS_SUB_CHARGE2 > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsSubCharge2Match", "TS_SUB_CHARGE2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsSubCharge2",
      "((TS_SUB_CHARGE2) = ? OR TS_SUB_CHARGE2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsSubCharge2", "(TS_SUB_CHARGE2) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsSubCharge2",
      "(TS_SUB_CHARGE2) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsSubCharge2asc", "TS_SUB_CHARGE2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsSubCharge2desc", "TS_SUB_CHARGE2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsSubCharge3", "(TS_SUB_CHARGE3) = ?" ) // EQUAL

         .addFilterBy( "notequalTsSubCharge3", "(TS_SUB_CHARGE3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsSubCharge3",
      "(TS_SUB_CHARGE3 IS NULL OR LENGTH((TS_SUB_CHARGE3)) IS NULL OR LENGTH((TS_SUB_CHARGE3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsSubCharge3", "TS_SUB_CHARGE3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsSubCharge3", "TS_SUB_CHARGE3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsSubCharge3", "TS_SUB_CHARGE3 > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsSubCharge3Match", "TS_SUB_CHARGE3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsSubCharge3",
      "((TS_SUB_CHARGE3) = ? OR TS_SUB_CHARGE3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsSubCharge3", "(TS_SUB_CHARGE3) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsSubCharge3",
      "(TS_SUB_CHARGE3) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsSubCharge3asc", "TS_SUB_CHARGE3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsSubCharge3desc", "TS_SUB_CHARGE3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsChargePeriod", "(TS_CHARGE_PERIOD) = ?" ) // EQUAL

         .addFilterBy( "notequalTsChargePeriod", "(TS_CHARGE_PERIOD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsChargePeriod",
      "(TS_CHARGE_PERIOD IS NULL OR LENGTH((TS_CHARGE_PERIOD)) IS NULL OR LENGTH((TS_CHARGE_PERIOD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsChargePeriod", "TS_CHARGE_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsChargePeriod", "TS_CHARGE_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsChargePeriod", "TS_CHARGE_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsChargePeriodMatch",
      "TS_CHARGE_PERIOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsChargePeriod",
      "((TS_CHARGE_PERIOD) = ? OR TS_CHARGE_PERIOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsChargePeriod", "(TS_CHARGE_PERIOD) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsChargePeriod",
      "(TS_CHARGE_PERIOD) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsChargePeriodasc", "TS_CHARGE_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsChargePerioddesc", "TS_CHARGE_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsChargeFreq", "TS_CHARGE_FREQ = ?" ) // EQUAL

         .addFilterBy( "notequalTsChargeFreq", "TS_CHARGE_FREQ != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsChargeFreq", "TS_CHARGE_FREQ IS NULL" ) // IS NULL

         .addFilterBy( "notnullTsChargeFreq", "TS_CHARGE_FREQ IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsChargeFreq", "TS_CHARGE_FREQ < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsChargeFreq", "TS_CHARGE_FREQ > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalTsChargeFreq", "TS_CHARGE_FREQ <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalTsChargeFreq", "TS_CHARGE_FREQ >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByTsChargeFreqMatch", "TS_CHARGE_FREQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenTsChargeFreq", "TS_CHARGE_FREQ BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullTsChargeFreq",
      "(TS_CHARGE_FREQ IS NULL OR TS_CHARGE_FREQ = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullTsChargeFreq",
      "(TS_CHARGE_FREQ IS NULL OR TS_CHARGE_FREQ < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullTsChargeFreq",
      "(TS_CHARGE_FREQ IS NULL OR TS_CHARGE_FREQ > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INTsChargeFreq", "TS_CHARGE_FREQ IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsChargeFreq", "TS_CHARGE_FREQ NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsChargeFreqasc", "TS_CHARGE_FREQ ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsChargeFreqdesc", "TS_CHARGE_FREQ DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsDiscountRef", "(TS_DISCOUNT_REF) = ?" ) // EQUAL

         .addFilterBy( "notequalTsDiscountRef", "(TS_DISCOUNT_REF) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsDiscountRef",
      "(TS_DISCOUNT_REF IS NULL OR LENGTH((TS_DISCOUNT_REF)) IS NULL OR LENGTH((TS_DISCOUNT_REF)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsDiscountRef", "TS_DISCOUNT_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsDiscountRef", "TS_DISCOUNT_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsDiscountRef", "TS_DISCOUNT_REF > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsDiscountRefMatch", "TS_DISCOUNT_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsDiscountRef",
      "((TS_DISCOUNT_REF) = ? OR TS_DISCOUNT_REF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsDiscountRef", "(TS_DISCOUNT_REF) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsDiscountRef",
      "(TS_DISCOUNT_REF) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsDiscountRefasc", "TS_DISCOUNT_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsDiscountRefdesc", "TS_DISCOUNT_REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTsActInclusive", "(TS_ACT_INCLUSIVE) = ?" ) // EQUAL

         .addFilterBy( "notequalTsActInclusive", "(TS_ACT_INCLUSIVE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTsActInclusive",
      "(TS_ACT_INCLUSIVE IS NULL OR LENGTH((TS_ACT_INCLUSIVE)) IS NULL OR LENGTH((TS_ACT_INCLUSIVE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTsActInclusive", "TS_ACT_INCLUSIVE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTsActInclusive", "TS_ACT_INCLUSIVE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTsActInclusive", "TS_ACT_INCLUSIVE > ?" ) // GREATER THAN

         .addFilterBy( "filterByTsActInclusiveMatch",
      "TS_ACT_INCLUSIVE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTsActInclusive",
      "((TS_ACT_INCLUSIVE) = ? OR TS_ACT_INCLUSIVE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTsActInclusive", "(TS_ACT_INCLUSIVE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTsActInclusive",
      "(TS_ACT_INCLUSIVE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TsActInclusiveasc", "TS_ACT_INCLUSIVE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TsActInclusivedesc", "TS_ACT_INCLUSIVE DESC" ) // ORDER DESCENDING
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
      dml = new TsTariffServiceAbstractDMLFactory(  );
    }

    return dml;
  }
}
