/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.enums.Technology;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

/**
 * Lists the charges to be paid by a particular subscriber.
 * <p>
 *   There are a number of identical tables, one per cycle per period, named bill_cccccyyyymmdd where ccccc is the cycle
 *   code (see bcy_bill_cycle) yyyymmdd is the invoice date for the period of the cycle (see bcy_next_run)
 * </p>
 * <p>
 *   When a charge is raised it is placed in the bill table for the date it covers and for the billing cycle that the subscriber
 *   is on (see sbd_bill_cycle). However if the billing run has already been run for that period it is placed on the first
 *   unbilled period instead (shown by bcy_next_run). Trial billing creates tables called trl_cccccyyyymmdd using the same
 *   script as bill_cccccyyyymmdd.
 * </p>
 *
 * This class contains any additional logic for BillCccccyyyymmdd, if any.
 * It extends the BillCccccyyyymmddAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class BillCccccyyyymmdd extends BillCccccyyyymmddAbstractBLO {

//  public DAOIterator iterateForMpc(MpcMigPreConDMO mpc,
//      BpBatchParamDMO bpBatch, String tableName) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//    //  --   SELECT l_bill_table.* 
//    // --   FROM l_bill_table 
//    // --   WHERE subscriber_id = ? 
//    // --   AND handset = ? 
//    // --   AND billind = 'n' AND billdat <=?
//    // --  AND technology = ?
//    //--FOR UPDATE
//    QueryFilter filter = new QueryFilter();
//    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter, mpc
//        .getMpcSubscriberId());
//
//    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.handsetFilter, mpc
//        .getMpcDiallingNo());
//
//    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billindFilter, "n");
//
//    filter.add(FilterOp.LESSTHANOREQUAL, BillCccccyyyymmddDMO.billdatFilter,
//        bpBatch.getBpInvoiceDate());
//
//    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.technologyFilter, mpc
//        .getMpcTechnology());
//
//    return iterate(filter, tableName);
//  }

  /**
   * SELECT * FROM bill_tabname 
   * WHERE handset = ?",
   * AND   billdat <= ? ",
   * AND technology = ? 
   * 
   * @param diallingNo
   * @param billDate
   * @param tech
   * @param tableName
   * @return a {@link BillCccccyyyymmddDMO} iterator
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public DAOIterator iterateForHandsetDateTech(
      String diallingNo, Date billDate, Technology tech, String tableName)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger
        .debug("iterateForHandsetDateTech( diallingNo, billDate, tech, tableName )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.handsetFilter, diallingNo);

    filter.add(FilterOp.LESSTHANOREQUAL, BillCccccyyyymmddDMO.billdatFilter,
        billDate);

    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.technologyFilter,
        Technology.map(tech));

    return iterate(filter, tableName);

  }

  public void modifyForSubsIdInvNo(Integer subscriberId, String invoiceNo,
      String tableName) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billindFilter, "n");
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.invoiceNoFilter, "0");
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.invoiceNoFilter, invoiceNo);

    modify(filter, tableName);

  }

  public QueryFilter getSimFilter(Integer subscriberId, Date billDat) {
    //--   SELECT * INTO l_bill_table.*
    //--   FROM l_bill_table 
    //--   WHERE subscriber_id = ?
    //--   AND billind = 'n' AND billdat <= ?
    //--   FOR UPDATE
    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billindFilter, "n");
    filter.add(FilterOp.LESSTHANOREQUAL, BillCccccyyyymmddDMO.billdatFilter,
        billDat);
    return filter;
  }

  public QueryFilter getTwinBillFilter(Integer SubscriberId, Date billDat,
     Short twinBill) {
    //  --   SELECT *
    //  --   FROM l_bill_table
    //  --   WHERE subscriber_id = ?
    //  --   AND twinbill_no = ?
    //  --   AND billind = 'n'
    //  --   AND billdat <= ? FOR UPDATE
    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
        SubscriberId);
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.twinbillNoFilter, twinBill);
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billindFilter, "n");
    filter.add(FilterOp.LESSTHANOREQUAL, BillCccccyyyymmddDMO.billdatFilter,
        billDat);
    return filter;
  }

  public QueryFilter getCollectFilter(Integer subscriberId, Date billDat) {
    //  -- SELECT * ",
    //  --      FROM ", l_bill_table CLIPPED,
    //  --      WHERE subscriber_id = ? ", 
    //  --      AND billind = 'n' ",
    //  --      AND billdat <= ? FOR UPDATE

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billindFilter, "n");
    filter.add(FilterOp.LESSTHANOREQUAL, BillCccccyyyymmddDMO.billdatFilter,
        billDat);
    return filter;
  }

  public void quickUpdate(BillCccccyyyymmddDMO billDMO, String tableName)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug("quickUpdate( billCccccyyyymmddDMO, tableName )");

    // UPDATE bill_cyc120070201 SET BILL_ID = ?, SUBSCRIBER_ID = ?, HANDSET = ?, CHASERV = ?,
    // BILLIND = ?, BILLDAT = ?, COST = ?, CHARGE = ?, SPARECH = ?, INVOICE_NO = ?,
    // TWINBILL_NO = ?, VATAMT = ?, VATRATE = ?, CYCLE_NO = ?, VATCODE = ?, START_PERIOD = ?,
    // END_PERIOD = ?, BATCH_RUN_NUM = ?, TIMESTAMP = ?, CURRENCY_CHARGE = ?,
    // EXCHANGE_RATE = ?, EXCH_OPERATOR = ?, CHARGE_CLASS_ID = ?, TECHNOLOGY = ?, PACKAGE = ?
    //WHERE BILL_ID = ?

    QueryFilter filter = new QueryFilter();
    //filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chaservFilter, billDMO
      //  .getChaserv());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billindFilter, billDMO
        .getBillind());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billdatFilter, billDMO
        .getBilldat());
//    filter
//        .add(FilterOp.SET, BillCccccyyyymmddDMO.costFilter, billDMO.getCost());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeFilter, billDMO
//        .getCharge());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.sparechFilter, billDMO
//        .getSparech());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.invoiceNoFilter, billDMO
        .getInvoiceNo());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.twinbillNoFilter, billDMO
//        .getTwinbillNo());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatamtFilter, billDMO
        .getVatamt());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatrateFilter, billDMO
        .getVatrate());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatcodeFilter, billDMO
        .getVatcode());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.startPeriodFilter, billDMO
//        .getStartPeriod());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.endPeriodFilter, billDMO
//        .getEndPeriod());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.batchRunNumFilter, billDMO
//        .getBatchRunNum());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.timestampFilter, billDMO
//        .getTimestamp());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.currencyChargeFilter, billDMO
        .getCurrencyCharge());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchangeRateFilter, billDMO
        .getExchangeRate());
    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchOperatorFilter, billDMO
        .getExchOperator());
//    filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeClassIdFilter, billDMO
//        .getChargeClassId());
    filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billIdFilter, billDMO
        .getBillId());

    modify(filter, tableName);

  }
}
