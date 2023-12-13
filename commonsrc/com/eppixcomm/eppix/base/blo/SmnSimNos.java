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

import com.eppixcomm.eppix.common.cache.MessageCache;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.blo.SmnSimNosAbstractBLO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Message;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * Holds information on all SIM cards available within EPPIX and their current status.
 *
 * This class contains any additional logic for SmnSimNos, if any.
 * It extends the SmnSimNosAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class SmnSimNos extends SmnSimNosAbstractBLO {

  /**
   * Swaps the SIM's current dealer Id with a new one.
   * 
   * Also creates an SMH entry to record the change.
   * 
   * @param subscriberId the subscrider id.
   * @param simNo the sim number.
   * @param newDealerId the new dealer id.
   * @param oldDealerId the old dealer id.
   * 
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public void swapDealer(Integer subscriberId, String simNo,
      String newDealerId, String oldDealerId) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("swapDealer( subscriberId, simNo, newDealerId, oldDealerId )");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, SmnSimNosDMO.smnDealerIdFilter, newDealerId);
    filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

    // update the new dealer
    modify(filter);

    MessageCache message = MessageCache.getInstance(base);
    
    String mesg = oldDealerId + " " + message.getMessage(180390) + " "
        + newDealerId;

    // insert a sim history record
    base.smhSimHistory().create(subscriberId, simNo, "SWPD", mesg);

  }

  /**
   * Returns a list of available SIMs.
   * 
   * @param simNo
   * @param networkId
   * @return
   * @throws EPPIXSeriousException 
   * 
   */
  public DTOList getListAvailable(DTOListState state, String simNo,
      String networkId) throws EPPIXSeriousException {

    QueryFilter filter = new QueryFilter();

    if (!DMO.isNull(simNo)) {

      filter.add((simNo.length() < 14) ? FilterOp.BEGINSWITH : FilterOp.EQUAL,
          SmnSimNosDMO.smnSimNoFilter, simNo);

    }

    if (!DMO.isNull(networkId)) {
      filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnNetworkIdFilter, networkId);
    }

    return smnAbstractDAC.getList(state, filter);

  }

  /**
   * Modifies the dealerId for a specific SIM number.
   * 
   * @param simNo
   * @param dealerId
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public void modifyDealerForSimNo(String simNo, String dealerId)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, SmnSimNosDMO.smnDealerIdFilter, dealerId);
    filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

    modify(filter);

  }

  /**
   * Updates On Network flag for SIM to "Y".
   * 
   * @param simNo
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException
   * 
   */
  public void modifySimOnNetwork(String simNo) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("modifySimOnNetwork( simNo )");

    QueryFilter filter = new QueryFilter();

    filter.add(FilterOp.SET, SmnSimNosDMO.smnOnNetworkFilter, "Y");
    filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

    modify(filter);

  }

  /**
   * Gets the {@link SmnSimNosDMO} for the specified SIM number.
   * 
   * @param simNo
   * @return an {@link SmnSimNosDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public SmnSimNosDMO getForSimNo(String simNo) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getForSimNo( simNo )");

    QueryFilter filter = new QueryFilter();

    filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

    return get(filter);

  }

}
