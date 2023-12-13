/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.core.BLO;
import com.eppixcomm.eppix.common.core.BLOBinder;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * Common Business Logic Object. Provides the Common BLOBinder to the business
 * logic to allow it to call other Common BLOs.
 * 
 * @author $Author$
 */
public abstract class CommonBLO extends BLO {

  protected CommonBLOBinder common;

  protected void setBinder(BLOBinder bloBinder) {
    common = (CommonBLOBinder) bloBinder;
  }

//  @Override
  protected Class getDACClass() {
    return null;
  }

  /**
   * Provides the system language code to the business logic.
   * 
   * @return system language code
   * @throws EPPIXFatalException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXBusinessException
   */
  protected String systemLanguageCode() throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    return common.systemLanguageCode();
  }
}