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

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for BillCccccyyyymmdd.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class BillCccccyyyymmddAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BillCccccyyyymmddAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected BillCccccyyyymmddAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "BillCccccyyyymmdd", // dmlName
        "blo.BillCccccyyyymmddDMO", // dmoName
        "BILL_CCCCCYYYYMMDD", // tableName
        25, // numColumns
        "BILL_ID, SUBSCRIBER_ID, HANDSET, CHASERV, BILLIND, BILLDAT, COST, CHARGE, SPARECH"
        + ", INVOICE_NO, TWINBILL_NO, VATAMT, VATRATE, CYCLE_NO, VATCODE, START_PERIOD, END_PERIOD, BATCH_RUN_NUM"
        + ", TIMESTAMP, CURRENCY_CHARGE, EXCHANGE_RATE, EXCH_OPERATOR, CHARGE_CLASS_ID, TECHNOLOGY, PACKAGE", // columnList
        "BILL_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "BILL_ID, SUBSCRIBER_ID, HANDSET, CHASERV, BILLIND, BILLDAT, COST, CHARGE, SPARECH"
        + ", INVOICE_NO, TWINBILL_NO, VATAMT, VATRATE, CYCLE_NO, VATCODE, START_PERIOD, END_PERIOD, BATCH_RUN_NUM"
        + ", TIMESTAMP, CURRENCY_CHARGE, EXCHANGE_RATE, EXCH_OPERATOR, CHARGE_CLASS_ID, TECHNOLOGY, PACKAGE",
        "", "",
        new String[] {
          "BILL_ID", "SUBSCRIBER_ID", "HANDSET", "CHASERV", "BILLIND",
          "BILLDAT", "COST", "CHARGE", "SPARECH", "INVOICE_NO", "TWINBILL_NO",
          "VATAMT", "VATRATE", "CYCLE_NO", "VATCODE", "START_PERIOD",
          "END_PERIOD", "BATCH_RUN_NUM", "TIMESTAMP", "CURRENCY_CHARGE",
          "EXCHANGE_RATE", "EXCH_OPERATOR", "CHARGE_CLASS_ID", "TECHNOLOGY",
          "PACKAGE"
        } );

    table.addFilterBy( "equalBillId", /* PK attribute */
      "BILL_ID = ?" )
         .addFilterBy( "filterByBillIdMatch", "BILL_ID LIKE ?" )
         .addFilterBy( "INBillId", "BILL_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINBillId", "BILL_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalBillId", "BILL_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullBillId", "BILL_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullBillId", "BILL_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBillId", "BILL_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBillId", "BILL_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBillId", "BILL_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBillId", "BILL_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBillIdMatch", "BILL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBillId", "BILL_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBillId", "(BILL_ID IS NULL OR BILL_ID = ?)" ) // EQUALORNULL
                                                                                 // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullBillId",
      "(BILL_ID IS NULL OR BILL_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBillId",
      "(BILL_ID IS NULL OR BILL_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "BillIdasc", "BILL_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BillIddesc", "BILL_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSubscriberId", "SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSubscriberId", "SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSubscriberId", "SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSubscriberId", "SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSubscriberId", "SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSubscriberId", "SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSubscriberId", "SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSubscriberId", "SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySubscriberIdMatch", "SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSubscriberId", "SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSubscriberId",
      "(SUBSCRIBER_ID IS NULL OR SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSubscriberId",
      "(SUBSCRIBER_ID IS NULL OR SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSubscriberId",
      "(SUBSCRIBER_ID IS NULL OR SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSubscriberId", "SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSubscriberId", "SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SubscriberIdasc", "SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SubscriberIddesc", "SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalHandset", "(HANDSET) = ?" ) // EQUAL

         .addFilterBy( "notequalHandset", "(HANDSET) != ?" ) // NOTEQUAL

         .addFilterBy( "nullHandset",
      "(HANDSET IS NULL OR LENGTH((HANDSET)) IS NULL OR LENGTH((HANDSET)) = 0)" ) // IS NULL

         .addFilterBy( "notnullHandset", "HANDSET IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanHandset", "HANDSET < ?" ) // LESS THAN

         .addFilterBy( "greaterthanHandset", "HANDSET > ?" ) // GREATER THAN

         .addFilterBy( "filterByHandsetMatch", "HANDSET LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullHandset",
      "((HANDSET) = ? OR HANDSET IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INHandset", "(HANDSET) IN ( ? )" ) // IN

         .addFilterBy( "NOTINHandset", "(HANDSET) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Handsetasc", "HANDSET ASC" ) // ORDER ASCENDING

         .addOrderBy( "Handsetdesc", "HANDSET DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChaserv", "(CHASERV) = ?" ) // EQUAL

         .addFilterBy( "notequalChaserv", "(CHASERV) != ?" ) // NOTEQUAL

         .addFilterBy( "nullChaserv",
      "(CHASERV IS NULL OR LENGTH((CHASERV)) IS NULL OR LENGTH((CHASERV)) = 0)" ) // IS NULL

         .addFilterBy( "notnullChaserv", "CHASERV IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChaserv", "CHASERV < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChaserv", "CHASERV > ?" ) // GREATER THAN

         .addFilterBy( "filterByChaservMatch", "CHASERV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullChaserv",
      "((CHASERV) = ? OR CHASERV IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INChaserv", "(CHASERV) IN ( ? )" ) // IN

         .addFilterBy( "NOTINChaserv", "(CHASERV) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Chaservasc", "CHASERV ASC" ) // ORDER ASCENDING

         .addOrderBy( "Chaservdesc", "CHASERV DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBillind", "(BILLIND) = ?" ) // EQUAL

         .addFilterBy( "notequalBillind", "(BILLIND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBillind",
      "(BILLIND IS NULL OR LENGTH((BILLIND)) IS NULL OR LENGTH((BILLIND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBillind", "BILLIND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBillind", "BILLIND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBillind", "BILLIND > ?" ) // GREATER THAN

         .addFilterBy( "filterByBillindMatch", "BILLIND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBillind",
      "((BILLIND) = ? OR BILLIND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBillind", "(BILLIND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBillind", "(BILLIND) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Billindasc", "BILLIND ASC" ) // ORDER ASCENDING

         .addOrderBy( "Billinddesc", "BILLIND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBilldat", "BILLDAT = ?" ) // EQUAL

         .addFilterBy( "notequalBilldat", "BILLDAT != ?" ) // NOTEQUAL

         .addFilterBy( "nullBilldat", "BILLDAT IS NULL" ) // IS NULL

         .addFilterBy( "notnullBilldat", "BILLDAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBilldat", "BILLDAT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBilldat", "BILLDAT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBilldat", "BILLDAT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBilldat", "BILLDAT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBilldatMatch", "BILLDAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBilldat", "BILLDAT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBilldat",
      "(BILLDAT IS NULL OR BILLDAT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBilldat",
      "(BILLDAT IS NULL OR BILLDAT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBilldat",
      "(BILLDAT IS NULL OR BILLDAT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBilldat", "BILLDAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINBilldat", "BILLDAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Billdatasc", "BILLDAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "Billdatdesc", "BILLDAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCost", "COST = ?" ) // EQUAL

         .addFilterBy( "notequalCost", "COST != ?" ) // NOTEQUAL

         .addFilterBy( "nullCost", "COST IS NULL" ) // IS NULL

         .addFilterBy( "notnullCost", "COST IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCost", "COST < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCost", "COST > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCost", "COST <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCost", "COST >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCostMatch", "COST LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCost", "COST BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCost", "(COST IS NULL OR COST = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCost", "(COST IS NULL OR COST < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCost", "(COST IS NULL OR COST > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCost", "COST IN ( ? )" ) // IN

         .addFilterBy( "NOTINCost", "COST NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Costasc", "COST ASC" ) // ORDER ASCENDING

         .addOrderBy( "Costdesc", "COST DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCharge", "CHARGE = ?" ) // EQUAL

         .addFilterBy( "notequalCharge", "CHARGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCharge", "CHARGE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCharge", "CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCharge", "CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCharge", "CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCharge", "CHARGE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCharge", "CHARGE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChargeMatch", "CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCharge", "CHARGE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCharge", "(CHARGE IS NULL OR CHARGE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCharge",
      "(CHARGE IS NULL OR CHARGE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCharge",
      "(CHARGE IS NULL OR CHARGE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCharge", "CHARGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCharge", "CHARGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Chargeasc", "CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Chargedesc", "CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSparech", "(SPARECH) = ?" ) // EQUAL

         .addFilterBy( "notequalSparech", "(SPARECH) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSparech",
      "(SPARECH IS NULL OR LENGTH((SPARECH)) IS NULL OR LENGTH((SPARECH)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSparech", "SPARECH IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSparech", "SPARECH < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSparech", "SPARECH > ?" ) // GREATER THAN

         .addFilterBy( "filterBySparechMatch", "SPARECH LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSparech",
      "((SPARECH) = ? OR SPARECH IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSparech", "(SPARECH) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSparech", "(SPARECH) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Sparechasc", "SPARECH ASC" ) // ORDER ASCENDING

         .addOrderBy( "Sparechdesc", "SPARECH DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalInvoiceNo", "(INVOICE_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalInvoiceNo", "(INVOICE_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullInvoiceNo",
      "(INVOICE_NO IS NULL OR LENGTH((INVOICE_NO)) IS NULL OR LENGTH((INVOICE_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullInvoiceNo", "INVOICE_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanInvoiceNo", "INVOICE_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanInvoiceNo", "INVOICE_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByInvoiceNoMatch", "INVOICE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullInvoiceNo",
      "((INVOICE_NO) = ? OR INVOICE_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INInvoiceNo", "(INVOICE_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINInvoiceNo", "(INVOICE_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "InvoiceNoasc", "INVOICE_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "InvoiceNodesc", "INVOICE_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTwinbillNo", "TWINBILL_NO = ?" ) // EQUAL

         .addFilterBy( "notequalTwinbillNo", "TWINBILL_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullTwinbillNo", "TWINBILL_NO IS NULL" ) // IS NULL

         .addFilterBy( "notnullTwinbillNo", "TWINBILL_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTwinbillNo", "TWINBILL_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTwinbillNo", "TWINBILL_NO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalTwinbillNo", "TWINBILL_NO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalTwinbillNo", "TWINBILL_NO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByTwinbillNoMatch", "TWINBILL_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenTwinbillNo", "TWINBILL_NO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullTwinbillNo",
      "(TWINBILL_NO IS NULL OR TWINBILL_NO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullTwinbillNo",
      "(TWINBILL_NO IS NULL OR TWINBILL_NO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullTwinbillNo",
      "(TWINBILL_NO IS NULL OR TWINBILL_NO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INTwinbillNo", "TWINBILL_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINTwinbillNo", "TWINBILL_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TwinbillNoasc", "TWINBILL_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "TwinbillNodesc", "TWINBILL_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatamt", "VATAMT = ?" ) // EQUAL

         .addFilterBy( "notequalVatamt", "VATAMT != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatamt", "VATAMT IS NULL" ) // IS NULL

         .addFilterBy( "notnullVatamt", "VATAMT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatamt", "VATAMT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatamt", "VATAMT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVatamt", "VATAMT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVatamt", "VATAMT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVatamtMatch", "VATAMT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVatamt", "VATAMT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVatamt", "(VATAMT IS NULL OR VATAMT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVatamt",
      "(VATAMT IS NULL OR VATAMT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVatamt",
      "(VATAMT IS NULL OR VATAMT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVatamt", "VATAMT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatamt", "VATAMT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vatamtasc", "VATAMT ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vatamtdesc", "VATAMT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatrate", "VATRATE = ?" ) // EQUAL

         .addFilterBy( "notequalVatrate", "VATRATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatrate", "VATRATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVatrate", "VATRATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatrate", "VATRATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatrate", "VATRATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVatrate", "VATRATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVatrate", "VATRATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVatrateMatch", "VATRATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVatrate", "VATRATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVatrate",
      "(VATRATE IS NULL OR VATRATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVatrate",
      "(VATRATE IS NULL OR VATRATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVatrate",
      "(VATRATE IS NULL OR VATRATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVatrate", "VATRATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatrate", "VATRATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vatrateasc", "VATRATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vatratedesc", "VATRATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCycleNo", "(CYCLE_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalCycleNo", "(CYCLE_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCycleNo",
      "(CYCLE_NO IS NULL OR LENGTH((CYCLE_NO)) IS NULL OR LENGTH((CYCLE_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCycleNo", "CYCLE_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCycleNo", "CYCLE_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCycleNo", "CYCLE_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByCycleNoMatch", "CYCLE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCycleNo",
      "((CYCLE_NO) = ? OR CYCLE_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCycleNo", "(CYCLE_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCycleNo", "(CYCLE_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CycleNoasc", "CYCLE_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "CycleNodesc", "CYCLE_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatcode", "(VATCODE) = ?" ) // EQUAL

         .addFilterBy( "notequalVatcode", "(VATCODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatcode",
      "(VATCODE IS NULL OR LENGTH((VATCODE)) IS NULL OR LENGTH((VATCODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatcode", "VATCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatcode", "VATCODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatcode", "VATCODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVatcodeMatch", "VATCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatcode",
      "((VATCODE) = ? OR VATCODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatcode", "(VATCODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatcode", "(VATCODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vatcodeasc", "VATCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vatcodedesc", "VATCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalStartPeriod", "START_PERIOD = ?" ) // EQUAL

         .addFilterBy( "notequalStartPeriod", "START_PERIOD != ?" ) // NOTEQUAL

         .addFilterBy( "nullStartPeriod", "START_PERIOD IS NULL" ) // IS NULL

         .addFilterBy( "notnullStartPeriod", "START_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanStartPeriod", "START_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanStartPeriod", "START_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalStartPeriod", "START_PERIOD <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalStartPeriod", "START_PERIOD >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByStartPeriodMatch", "START_PERIOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenStartPeriod", "START_PERIOD BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullStartPeriod",
      "(START_PERIOD IS NULL OR START_PERIOD = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullStartPeriod",
      "(START_PERIOD IS NULL OR START_PERIOD < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullStartPeriod",
      "(START_PERIOD IS NULL OR START_PERIOD > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INStartPeriod", "START_PERIOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINStartPeriod", "START_PERIOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "StartPeriodasc", "START_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "StartPerioddesc", "START_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEndPeriod", "END_PERIOD = ?" ) // EQUAL

         .addFilterBy( "notequalEndPeriod", "END_PERIOD != ?" ) // NOTEQUAL

         .addFilterBy( "nullEndPeriod", "END_PERIOD IS NULL" ) // IS NULL

         .addFilterBy( "notnullEndPeriod", "END_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEndPeriod", "END_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEndPeriod", "END_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEndPeriod", "END_PERIOD <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEndPeriod", "END_PERIOD >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEndPeriodMatch", "END_PERIOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEndPeriod", "END_PERIOD BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEndPeriod",
      "(END_PERIOD IS NULL OR END_PERIOD = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEndPeriod",
      "(END_PERIOD IS NULL OR END_PERIOD < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEndPeriod",
      "(END_PERIOD IS NULL OR END_PERIOD > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEndPeriod", "END_PERIOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINEndPeriod", "END_PERIOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EndPeriodasc", "END_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "EndPerioddesc", "END_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBatchRunNum", "BATCH_RUN_NUM = ?" ) // EQUAL

         .addFilterBy( "notequalBatchRunNum", "BATCH_RUN_NUM != ?" ) // NOTEQUAL

         .addFilterBy( "nullBatchRunNum", "BATCH_RUN_NUM IS NULL" ) // IS NULL

         .addFilterBy( "notnullBatchRunNum", "BATCH_RUN_NUM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBatchRunNum", "BATCH_RUN_NUM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBatchRunNum", "BATCH_RUN_NUM > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBatchRunNum", "BATCH_RUN_NUM <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBatchRunNum", "BATCH_RUN_NUM >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBatchRunNumMatch", "BATCH_RUN_NUM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBatchRunNum", "BATCH_RUN_NUM BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBatchRunNum",
      "(BATCH_RUN_NUM IS NULL OR BATCH_RUN_NUM = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBatchRunNum",
      "(BATCH_RUN_NUM IS NULL OR BATCH_RUN_NUM < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBatchRunNum",
      "(BATCH_RUN_NUM IS NULL OR BATCH_RUN_NUM > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBatchRunNum", "BATCH_RUN_NUM IN ( ? )" ) // IN

         .addFilterBy( "NOTINBatchRunNum", "BATCH_RUN_NUM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BatchRunNumasc", "BATCH_RUN_NUM ASC" ) // ORDER ASCENDING

         .addOrderBy( "BatchRunNumdesc", "BATCH_RUN_NUM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTimestamp", "TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalTimestamp", "TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullTimestamp", "TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullTimestamp", "TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTimestamp", "TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTimestamp", "TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalTimestamp", "TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalTimestamp", "TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByTimestampMatch", "TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenTimestamp", "TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullTimestamp",
      "(TIMESTAMP IS NULL OR TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullTimestamp",
      "(TIMESTAMP IS NULL OR TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullTimestamp",
      "(TIMESTAMP IS NULL OR TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INTimestamp", "TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINTimestamp", "TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Timestampasc", "TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "Timestampdesc", "TIMESTAMP DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCurrencyCharge", "CURRENCY_CHARGE = ?" ) // EQUAL

         .addFilterBy( "notequalCurrencyCharge", "CURRENCY_CHARGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCurrencyCharge", "CURRENCY_CHARGE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCurrencyCharge", "CURRENCY_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCurrencyCharge", "CURRENCY_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCurrencyCharge", "CURRENCY_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCurrencyCharge", "CURRENCY_CHARGE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCurrencyCharge",
      "CURRENCY_CHARGE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCurrencyChargeMatch", "CURRENCY_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCurrencyCharge",
      "CURRENCY_CHARGE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCurrencyCharge",
      "(CURRENCY_CHARGE IS NULL OR CURRENCY_CHARGE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCurrencyCharge",
      "(CURRENCY_CHARGE IS NULL OR CURRENCY_CHARGE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCurrencyCharge",
      "(CURRENCY_CHARGE IS NULL OR CURRENCY_CHARGE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCurrencyCharge", "CURRENCY_CHARGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCurrencyCharge", "CURRENCY_CHARGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CurrencyChargeasc", "CURRENCY_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CurrencyChargedesc", "CURRENCY_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalExchangeRate", "EXCHANGE_RATE = ?" ) // EQUAL

         .addFilterBy( "notequalExchangeRate", "EXCHANGE_RATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullExchangeRate", "EXCHANGE_RATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullExchangeRate", "EXCHANGE_RATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanExchangeRate", "EXCHANGE_RATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanExchangeRate", "EXCHANGE_RATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalExchangeRate", "EXCHANGE_RATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalExchangeRate", "EXCHANGE_RATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByExchangeRateMatch", "EXCHANGE_RATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenExchangeRate", "EXCHANGE_RATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullExchangeRate",
      "(EXCHANGE_RATE IS NULL OR EXCHANGE_RATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullExchangeRate",
      "(EXCHANGE_RATE IS NULL OR EXCHANGE_RATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullExchangeRate",
      "(EXCHANGE_RATE IS NULL OR EXCHANGE_RATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INExchangeRate", "EXCHANGE_RATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINExchangeRate", "EXCHANGE_RATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ExchangeRateasc", "EXCHANGE_RATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ExchangeRatedesc", "EXCHANGE_RATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalExchOperator", "(EXCH_OPERATOR) = ?" ) // EQUAL

         .addFilterBy( "notequalExchOperator", "(EXCH_OPERATOR) != ?" ) // NOTEQUAL

         .addFilterBy( "nullExchOperator",
      "(EXCH_OPERATOR IS NULL OR LENGTH((EXCH_OPERATOR)) IS NULL OR LENGTH((EXCH_OPERATOR)) = 0)" ) // IS NULL

         .addFilterBy( "notnullExchOperator", "EXCH_OPERATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanExchOperator", "EXCH_OPERATOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanExchOperator", "EXCH_OPERATOR > ?" ) // GREATER THAN

         .addFilterBy( "filterByExchOperatorMatch", "EXCH_OPERATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullExchOperator",
      "((EXCH_OPERATOR) = ? OR EXCH_OPERATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INExchOperator", "(EXCH_OPERATOR) IN ( ? )" ) // IN

         .addFilterBy( "NOTINExchOperator", "(EXCH_OPERATOR) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ExchOperatorasc", "EXCH_OPERATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "ExchOperatordesc", "EXCH_OPERATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalChargeClassId", "CHARGE_CLASS_ID = ?" ) // EQUAL

         .addFilterBy( "notequalChargeClassId", "CHARGE_CLASS_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullChargeClassId", "CHARGE_CLASS_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullChargeClassId", "CHARGE_CLASS_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanChargeClassId", "CHARGE_CLASS_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanChargeClassId", "CHARGE_CLASS_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalChargeClassId", "CHARGE_CLASS_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalChargeClassId",
      "CHARGE_CLASS_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByChargeClassIdMatch", "CHARGE_CLASS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenChargeClassId",
      "CHARGE_CLASS_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullChargeClassId",
      "(CHARGE_CLASS_ID IS NULL OR CHARGE_CLASS_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullChargeClassId",
      "(CHARGE_CLASS_ID IS NULL OR CHARGE_CLASS_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullChargeClassId",
      "(CHARGE_CLASS_ID IS NULL OR CHARGE_CLASS_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INChargeClassId", "CHARGE_CLASS_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINChargeClassId", "CHARGE_CLASS_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ChargeClassIdasc", "CHARGE_CLASS_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ChargeClassIddesc", "CHARGE_CLASS_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTechnology", "(TECHNOLOGY) = ?" ) // EQUAL

         .addFilterBy( "notequalTechnology", "(TECHNOLOGY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTechnology",
      "(TECHNOLOGY IS NULL OR LENGTH((TECHNOLOGY)) IS NULL OR LENGTH((TECHNOLOGY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTechnology", "TECHNOLOGY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanTechnology", "TECHNOLOGY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanTechnology", "TECHNOLOGY > ?" ) // GREATER THAN

         .addFilterBy( "filterByTechnologyMatch", "TECHNOLOGY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTechnology",
      "((TECHNOLOGY) = ? OR TECHNOLOGY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTechnology", "(TECHNOLOGY) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTechnology", "(TECHNOLOGY) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Technologyasc", "TECHNOLOGY ASC" ) // ORDER ASCENDING

         .addOrderBy( "Technologydesc", "TECHNOLOGY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPackge", "(PACKAGE) = ?" ) // EQUAL

         .addFilterBy( "notequalPackge", "(PACKAGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPackge",
      "(PACKAGE IS NULL OR LENGTH((PACKAGE)) IS NULL OR LENGTH((PACKAGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPackge", "PACKAGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPackge", "PACKAGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPackge", "PACKAGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPackgeMatch", "PACKAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPackge",
      "((PACKAGE) = ? OR PACKAGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPackge", "(PACKAGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPackge", "(PACKAGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Packgeasc", "PACKAGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Packgedesc", "PACKAGE DESC" ) // ORDER DESCENDING
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
      dml = new BillCccccyyyymmddDMLFactory(  );
    }

    return dml;
  }
}
