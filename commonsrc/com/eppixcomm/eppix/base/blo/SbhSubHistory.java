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

import com.eppixcomm.eppix.base.blo.SbhSubHistoryAbstractBLO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.DateTime;

/**
 * Holds details about events occurring at Subscriber Level.
 *
 * This class contains any additional logic for SbhSubHistory, if any.
 * It extends the SbhSubHistoryAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class SbhSubHistory extends SbhSubHistoryAbstractBLO {

  /**
   * Creates a new {@link SbhSubHistoryDMO} record using the specified parameters.
   * 
   * 
   * @param subscriberId
   * @param fieldId
   * @param histCode
   * @param oldValue
   * @param newValue
   * 
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   * 
   */
  public void create(Integer subscriberId, int fieldId, String histCode,
      String oldValue, String newValue) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("create( subscriberId, fieldId, histCode, oldValue, newValue )");

    SbhSubHistoryDMO sbh = new SbhSubHistoryDMO();

    sbh.setSbhSubscriberId(subscriberId);
    sbh.setSbhFieldId(new Integer(fieldId));
    sbh.setSbhHistCode(histCode);
    sbh.setSbhOldValue(oldValue);
    sbh.setSbhNewValue(newValue);
    sbh.setSbhUserId(loginName());
    sbh.setSbhTerminalId(locale().getLoginAddr());
    sbh.setSbhTimestamp(new DateTime());

    create(sbh);

  }
}
