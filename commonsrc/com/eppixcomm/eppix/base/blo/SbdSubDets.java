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

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * This table is used to store the generic subscriber details.
 * <p>
 *   The subscriber (or client) specific details are stored in the table sba_sub_aux table.
 * </p>
 * <p>
 *   The subscribers physical address is no longer stored on this table. It has moved to the aud_address table which also holds
 *   any other addresses for the subscriber. The physical address is stored on there with an address_type of "SPHY".
 * </p>
 *
 * This class contains any additional logic for SbdSubDets, if any.
 * It extends the SbdSubDetsAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class SbdSubDets extends SbdSubDetsAbstractBLO {

  /**
   * 
   * @param subscriberId
   * @param cycleEnd
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void updateBilledUpTo(Integer subscriberId, Date billedUpto)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("updateBilledUpTo( subscriberId, cycleEnd )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, SbdSubDetsDMO.sbdBilledUptoFilter, billedUpto);
    filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
        subscriberId);

    modify(filter);

    return;
  }

  /**
   * 
   * @param billCycle
   * @param invoiceDate
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public Integer countSubsOnBillCycle(String billCycle, Date invoiceDate)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    return countSubsOnBillCycle(billCycle, invoiceDate, null);
  }

  /**
   * 
   * @param billCycle
   * @param invoiceDate
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public Integer countSubsOnBillCycle(String billCycle, Date invoiceDate,
      Date billedUpto) throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("countSubsOnBillCycle( billCycle, invoiceDate, billedUpto )");

    //              SELECT COUNT(*) INTO m_total_count
    //              FROM sbd_sub_dets
    //              WHERE sbd_bill_cycle    = m_bp_batch.bp_bill_cycle 
    //              AND sbd_connect_date   <= m_bp_batch.bp_invoice_date 
    //              AND(sbd_dconnect_date IS NULL OR
    //                   sbd_dconnect_date < m_bp_batch.bp_invoice_date)
    QueryFilter filter = new QueryFilter();

    // BROKENLEG - This doesn't seem right - how can both connect and disconnect checks be lessthans
    filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdBillCycleFilter, billCycle);

    if (billedUpto != null) {
      filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdBilledUptoFilter, billedUpto);
    }

    filter.add(FilterOp.LESSTHANOREQUAL, SbdSubDetsDMO.sbdConnectDateFilter,
        invoiceDate);
    filter.add(FilterOp.LESSTHANORNULL, SbdSubDetsDMO.sbdDconnectDateFilter,
        invoiceDate);
    return count(filter);
  }

protected Class getDACClass() {
	return SbdSubDetsDAC.class;
}

}
