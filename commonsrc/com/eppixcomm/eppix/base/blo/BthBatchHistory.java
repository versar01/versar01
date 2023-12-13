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

import java.math.BigDecimal;

//import com.eppixcomm.eppix.base.enums.InvoiceExtractOption;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * There is one entry in here per attempt at a run of a batch job.
 * <p>
 *   See also the btc_batch_control table which holds one entry per batch job, but not per run of it. A new record is
 *   generated in this table from the generic BatchRun_Start function. The same row is updated when the batch process
 *   finally ends - stored as a permanent record of the run.
 * </p>
 *
 * This class contains any additional logic for BthBatchHistory, if any.
 * It extends the BthBatchHistoryAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class BthBatchHistory extends BthBatchHistoryAbstractBLO {

  /**
   * 
   * @param batchType
   * @param batchId
   * @param state
   * @return a DTOList of {@link BtcBatchControlDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public DTOList getListForTypeId(String batchType, String batchId,
      DTOListState state) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getListForTypeId( batchType, batchId, state");

    QueryFilter filter = new QueryFilter();
    filter
        .add(FilterOp.EQUAL, BthBatchHistoryDMO.bthBatchTypeFilter, batchType);
    filter.add(FilterOp.EQUAL, BthBatchHistoryDMO.bthBatchIdFilter, batchId);
    filter.add(FilterOp.ORDERBYDESC, BthBatchHistoryDMO.bthBatchRunNumFilter);

    return getList(state, filter);

  }

  /**
   * 
   * @param batchRunNum
   * @return a {@link BthBatchHistoryDMO} or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public BthBatchHistoryDMO getForBatchRunNum(Integer batchRunNum)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getForBatchRunNum( batchRunNum )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BthBatchHistoryDMO.bthBatchRunNumFilter,
        batchRunNum);

    return get(filter);
  }

//  public BthBatchHistoryDMO getLatestForCycle(String batchType,
//      String billingCycle, InvoiceExtractOption invoiceMode)
//      throws EPPIXBusinessException, EPPIXUnexpectedException, EPPIXFatalException {
//    
//    QueryFilter filter = new QueryFilter();
//    filter.add(FilterOp.MAX, BthBatchHistoryDMO.bthBatchRunNumFilter);
//    filter.add(FilterOp.EQUAL, BthBatchHistoryDMO.bthBatchTypeFilter,
//        batchType);
//    filter.add(FilterOp.EQUAL, BthBatchHistoryDMO.bthBatchIdFilter,
//        billingCycle);
//    filter.add(FilterOp.EQUAL, BthBatchHistoryDMO.bthParameter3Filter,
//        InvoiceExtractOption.map(invoiceMode));
//    
//    BigDecimal batchRunNum = (BigDecimal) max(filter);
//       
//    BthBatchHistoryDMO bthDMO = new BthBatchHistoryDMO();
//    bthDMO.setBthBatchRunNum(batchRunNum.intValue());
//    bthDMO = get(bthDMO);
//    
//    return bthDMO;
//  }

}
