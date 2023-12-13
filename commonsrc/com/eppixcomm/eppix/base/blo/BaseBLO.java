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
package com.eppixcomm.eppix.base.blo;

//import com.eppixcomm.eppix.common.cache.MessageCache;
//import com.eppixcomm.eppix.common.cache.SystemKeyCache;
//import com.eppixcomm.eppix.common.cache.TTCache;
import com.eppixcomm.eppix.common.core.BLO;
import com.eppixcomm.eppix.common.core.BLOBinder;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;

/**
 * BASE Business Logic Object. Provides the BASE
 * BLOBinder to the business logic to allow it to call other BASE
 * BLOs.
 *
 * @author
 */
public abstract class BaseBLO
  extends BLO {
  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected BaseBLOBinder base;

  /** Message Cache */
//  protected MessageCache messages;

  /** System Keys Cache */
//  protected SystemKeyCache systemKeys;

  /** TTType Text Cache */
//  protected TTCache ttTexts;  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * DOCUMENT ME!
   *
   * @param bloBinder DOCUMENT ME!
   */
  protected void setBinder( BLOBinder bloBinder ) {
    base = (BaseBLOBinder) bloBinder;
//    messages = MessageCache.getInstance( base );
//    ttTexts = TTCache.getInstance( base );
//    systemKeys = SystemKeyCache.getInstance( base );
  }
}
