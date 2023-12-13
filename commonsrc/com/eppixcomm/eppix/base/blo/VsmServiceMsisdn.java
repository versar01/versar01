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

import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
//import com.eppixcomm.eppix.common.data.Direction;
//import com.eppixcomm.eppix.common.data.Period;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
//import com.eppixcomm.eppix.common.util.General;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

/**
 * The entries in this table show what msisdns are used for each service the subscriber has taken up.
 * <p>
 *   This is for ALL services, not just 'basic' ones.
 * </p>
 * <p>
 *   For each entry there is a service taken up by the subscriber (shown by an entry in VAS_ACTIVE_SERVICE) and an msisdn
 *   belonging to the subscriber (shown by an entry in vam_active_msisdn).
 * </p>
 *
 * This class contains any additional logic for VsmServiceMsisdn, if any.
 * It extends the VsmServiceMsisdnAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class VsmServiceMsisdn extends VsmServiceMsisdnAbstractBLO {

  /**
   * Updates the VSM billed-up-to date for the given.
   *
   * @param vsm the VSM record
   * @param bcy the subscriber billing cycle record
   * @param prorataDate
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   *
   */
//  public void updateBilledUpTo(VsmServiceMsisdnDMO vsm, BcyBillingCycleDMO bcy,
//      Date prorataDate) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//
//    logger.debug("updateBilledUpTo( vsm, bcy, prorataDate");
//
//    // Prorata to next scheduled billing run if the current current one passed
//    while (bcy.getBcyNextRun().before(prorataDate)) {
//
//      bcy.setBcyNextRun(General.shiftPeriod(bcy.getBcyNextRun(), Period.map(bcy
//          .getBcyPeriod()), bcy.getBcyFrequency(), bcy.getBcyDayOfRun(),
//          Direction.FORWARD));
//
//    }
//
//    // Update the vsm table with the service billed upto date
//
//    // Set up the last day to bill
//    if ("Y".equals(bcy.getBcyInAdvance())) {
//      // update the passed in VSM
//      // minus one day.
//      vsm.setVsmBilledUpto(Date.addDays(-1, bcy.getBcyNextRun()));
//
//    } else {
//      // update the passed in VSM
//      vsm.setVsmBilledUpto(bcy.getBcyNextRun());
//
//    }
//
//    // store the modification.
//    modifyBilledUpTo(vsm.getVsmSubscriberId(), vsm.getVsmMsisdnNo(), vsm
//        .getVsmServiceCode(), vsm.getVsmBilledUpto());
//
//  }

  /**
   *
   *
   * @param subscriberId
   * @param msisdnNo
   * @param serviceCode
   * @param billedUpToDate
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   *
   */
  public void modifyBilledUpTo(Integer subscriberId, String msisdnNo,
      String serviceCode, Date billedUpToDate) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

	  if(logger.isDebugEnabled()){
		  logger
	        .debug("modifyBilledUpTo( subscriberId, msisdnNo, serviceCode, date )");
	  }
    

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, VsmServiceMsisdnDMO.vsmBilledUptoFilter,
        billedUpToDate);

    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmMsisdnNoFilter, msisdnNo);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
        serviceCode);

    modify(filter);
  }

  /**
   * Updates the "Node Sent" field to Y.
   *
   * @param subscriberId
   * @param serviceCode
   * @param msisdnNo
   * @throws EPPIXFatalException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXBusinessException
   *
   */
  public void modifyNodeSent(Integer subscriberId, String serviceCode,
      String msisdnNo) throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("modifyNodeSent( subscriberId, serviceCode, msisdnNo )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, VsmServiceMsisdnDMO.vsmNodeSentFilter, "Y");
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
        serviceCode);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmMsisdnNoFilter, msisdnNo);

    modify(filter);

  }

  public void updateVsmBillUpto(Date billTo, Integer subscriberId,
      String serviceCode) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("updateVsmBillUpto(billTo, subscriberId, serviceCode)");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, VsmServiceMsisdnDMO.vsmBilledUptoFilter, billTo);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
        serviceCode);

    modify(filter);

  }

  public VsmServiceMsisdnDMO getVsmForSubServDial(Integer subscriberId, String serviceCode, String diallingNo)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getVsmBillUpto(subscriberId, serviceCode, diallingNo)");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
        serviceCode);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmMsisdnNoFilter,
        diallingNo);
    return get(filter);

  }

  public List getTcMsisdnDetails(Integer subscriberId,
      String serviceCode) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getTcMsisdnDetails(subscriberId,serviceCode)");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
        subscriberId);
    filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
        serviceCode);
    return getList(null, filter);

  }
}
