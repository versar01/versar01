/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.DateTime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Common history business logic object.
 *
 * @author $Author: adonohoe $
 * @version $Revision: 1.4 $
 */
public class History extends CommonBLO {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(History.class);
  private Logger logger = thrower.getLogger();

  /** Data Access Controller. */
  private HistoryDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (HistoryDAC) dac;
  }

  //~ Methods //////////////////////////////////////////////////////////////////

  /**
   * 
   *
   * @param dmo DOCUMENT ME!
   *
   * @throws EPPIXUnexpectedException
   */
  protected void create(HistoryDMO historyDMO) throws EPPIXUnexpectedException {

    logger.debug("create( historyDMO )");

    thrower.ifParameterMissing("historyDMO", historyDMO);

    set(historyDMO);
    
    // If the User Type has been manually set in the calling function, don't override...
    if (DMO.isNull(historyDMO.getUserType()) 
        || !historyDMO.getUserType().equals("B")) {
      historyDMO.setUserType("U");
    }

    dac.create(historyDMO);
  }

  /**
   * Creates a set of History Data Model Objects from a List. 
   * @param historys the list of History Data Model Objects.
   * @throws EPPIXSeriousException
   */
  protected void create(List history) throws EPPIXSeriousException {

    logger.debug("create( history )");

    List tmpHistory = new ArrayList(history.size());
    
    for (Iterator historyItr = history.iterator(); historyItr.hasNext();) {
      
      HistoryDMO historyDMO = (HistoryDMO) historyItr.next();

      set(historyDMO);
      
      // If the User Type has been manually set in the calling function, don't override...
      if (DMO.isNull(historyDMO.getUserType()) 
          || !historyDMO.getUserType().equals("B")) {
        historyDMO.setUserType("U");
      }
      
      tmpHistory.add(historyDMO);
      
    }
    
    dac.create(history);
  }

  /**
   * Sets the timestamp and user details.
   * @param historyDMO the History Data Model Object to set.
   */
  protected void set(HistoryDMO historyDMO) {
    historyDMO.setHistoryTimestamp(new DateTime());
    historyDMO.setUserId(loginName());
  }

  /**
   * 
   * 
   * @param dmo
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  protected void delete(HistoryDMO dmo)
    throws
      EPPIXSeriousException,
      EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {

    logger.debug("delete( historyDMO )");

    dac.delete(dmo);
  }

  /**
   * Return a list of history objects matching the passed in values. If no
   * values have been passed in, all history objects are retrieved. Note: a
   * languageId is always retrieved, even if a language specific description
   * does not exist.
   *
   * @param historyDMO History Data Model Object
   *
   * @return List of History Data Model Objects.
   *
   * @throws EPPIXUnexpectedException
   */
  public List getList(HistoryDMO historyDMO) throws EPPIXUnexpectedException {

    logger.debug("getList( historyDMO )");

    return dac.getList(historyDMO);
  }

  /**
   * Return a list of history objects matching the passed in values. If no
   * values have been passed in, all history objects are retrieved. Note: a
   * languageId is always retrieved, even if a language specific description
   * does not exist. 
   * 
   * @param state previous state of the list.
   * @param historyDMO History object.
   * 
   * @return DTOList of History objects.
   * 
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(DTOListState state, HistoryDMO historyDMO)
    throws EPPIXUnexpectedException {

    logger.debug("getList( state, historyDMO )");

    return dac.getList(state, historyDMO);
  }
}