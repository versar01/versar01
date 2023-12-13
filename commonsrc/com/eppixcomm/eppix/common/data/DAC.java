/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.core.UserContext;

/**
 * Data Access Controller superclass.
 * 
 * @author $Author$
 * @version $Revision: 1.3 $
 */
abstract public class DAC {
  /** Exception handler/logger. */
  protected DAOThrower thrower;
  protected Logger logger;
  /** Data Access Object. */
  protected DAO dao;
  /** The user's working language. */
  protected String defaultLanguageCode;
  /** The user's context. */
  protected UserContext userContext;

  /**
   * Creates a new Data Access Controller object.
   *
   * @param thrower Exception handler/logger.
   * @param dao Data Access Object.
   * @param defaultLanguageCode DOCUMENT ME!
   * @deprecated
   */
  protected DAC(DAOThrower thrower, DAO dao, String defaultLanguageCode) {

    this.thrower = thrower;
    this.logger = thrower.getLogger();

    logger.debug("constructor()");

    this.dao = dao;
    this.defaultLanguageCode = defaultLanguageCode;
    dao.setThrower(thrower);
  }

  /**
   * Creates a new Data Access Controller object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   * @param thrower exception handler/logger.
   */
  protected DAC(DAO dao, DAOThrower thrower) {

    this.thrower = thrower;
    this.logger = thrower.getLogger();

    logger.debug("constructor(dao, thrower )");

    this.dao = dao;
    dao.setThrower(thrower);
  }
  
  protected DAC(UserContext userContext, DAO dao, DAOThrower thrower) {

	    this.thrower = thrower;
	    this.logger = thrower.getLogger();

	    logger.debug("constructor( userContext, dao, thrower )");

	    this.userContext = userContext;
	    this.defaultLanguageCode = userContext.getLocale().getLanguageCode();
	    this.dao = dao;
	    dao.setThrower(thrower);
	  }  

  /**
   * Closes the Data Access Controller freeing database resources.
   *
   * @throws EPPIXSeriousException
   */
  protected void close() throws EPPIXSeriousException {

    logger.debug("close()");

    dao.close();
  }

}