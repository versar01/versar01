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

import com.eppixcomm.eppix.common.util.BatchStatus;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.blo.BtcBatchControlAbstractBLO;
import com.eppixcomm.eppix.base.blo.BtcBatchControlDMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * This table will be used to :-
 define allowable batch runs (including program name) and hence provide definitive lookups for the VB batch routine front ends.
 * <p>
 *   
 hold parameters for the required batch run module. Instead of passing these parameters with the program name, the
 *   batch routine will read this table as one of the first things it does. This allows us to have one generic function ( in
 *   the maintenance server ) to initiate batch runs. 
 hold status information for each batch run, including run status and
 *   start time.
 When a batch process ends the status is reset to IDLE
 * </p>
 *
 * This class contains any additional logic for BtcBatchControl, if any.
 * It extends the BtcBatchControlAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class BtcBatchControl extends BtcBatchControlAbstractBLO {

  /**
   * Returns true if a {@link BtcBatchControlDMO} exists for the given status
   * 
   * @param batchType
   * @param batchId
   * @param status
   * @return true if a {@link BtcBatchControlDMO} exists
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public boolean existsForTypeIdStatus(String batchType, String batchId,
      BatchStatus status) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("existsForTypeIdStatus( batchType, batchId, status )");

    QueryFilter filter = new QueryFilter();
    filter
        .add(FilterOp.EQUAL, BtcBatchControlDMO.btcBatchTypeFilter, batchType);
    filter.add(FilterOp.EQUAL, BtcBatchControlDMO.btcBatchIdFilter, batchId);
    filter.add(FilterOp.EQUAL, BtcBatchControlDMO.btcBatchRunStatFilter,
        BatchStatus.map(status));

    return exists(filter);
  }

  /**
   * 
   * @param batchRunNum
   * @return a {@link BtcBatchControlDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public BtcBatchControlDMO getForBatchRunNum(Integer batchRunNum)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getForBatchRunNum( batchRunNum )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BtcBatchControlDMO.btcBatchRunNumFilter,
        batchRunNum);

    return get(filter);
  }

}
