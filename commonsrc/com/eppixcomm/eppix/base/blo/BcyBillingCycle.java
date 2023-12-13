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

import com.eppixcomm.eppix.base.blo.BcyBillingCycleAbstractBLO;
import com.eppixcomm.eppix.base.blo.BcyBillingCycleDMO;
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

/**
 * Holds the details of the current state of the cycle.
 * <p>
 *   This table is the definition of a cycle. It's the place that shows that a given cycle exists.
 * </p>
 * <p>
 *   There is one entry in here for a cycle. It shows details of the last run, gives the dates for the next and shows which
 *   call_pcccccmmddyy and bill_cccccddmmyy tables to use.
 * </p>
 * <p>
 *   Once a cycle is in use it can't be removed from this table, it has to be retained so old runs can be located by the enquiry
 *   GUIs.
 * </p>
 *
 * This class contains any additional logic for BcyBillingCycle, if any.
 * It extends the BcyBillingCycleAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class BcyBillingCycle extends BcyBillingCycleAbstractBLO {

  /**
   * 
   * @param cycle
   * @return
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public BcyBillingCycleDMO getForCycle(String cycle)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getForCycle( cycle )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, BcyBillingCycleDMO.bcyBillCycleFilter, cycle);

    return get(filter);
  }
}
