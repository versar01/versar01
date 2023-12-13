/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.util;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.ejb.EJBObject;
import javax.ejb.RemoveException;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSecurityException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Provides a cache of EJB objects.
 *  
 * @author $Author$
 * @version $Revision: 1.1 $
 *
 * @since $jdk$
 */
public abstract class EJBObjectCache {

  /** Error handler. */
  private Thrower thrower;
  private Logger logger;
  /** Map of EJB objects by home class name. */
  private Map ejbObjectCache = new HashMap();

  /**
   * Creates a new EJB cache object.
   * 
   * @param thrower error handler to use for this instance.
   */
  public EJBObjectCache(Thrower thrower) {
    this.thrower = thrower;
    this.logger = thrower.getLogger();
  }

  /**
   * Retrieves an EJB object, from the cache, for the specified home interface 
   * class. If the cache does not contain an appropriate EJB object, one is 
   * created from the home interface and stored in the cache.
   * 
   * @param homeClass home interface class.
   * 
   * @return EJB object.
   * 
   * @throws EPPIXSecurityException
   * @throws EPPIXFatalException
   */
  protected EJBObject getEJBObject(Class homeClass)
    throws EPPIXSecurityException, EPPIXFatalException {

    String homeClassName = homeClass.getName();

    if (logger.isDebugEnabled()) {
      logger.debug("getEJBObject( homeClass=" + homeClassName + " )");
    }

    EJBObject ejbObject = (EJBObject)ejbObjectCache.get(homeClassName);

    if (ejbObject == null) {

      try {

        ejbObject = ServiceLocator.getInstance().createEJBObject(homeClass);

      } catch (ServiceLocatorException e) {

        thrower.fatal(e);
      }
      ejbObjectCache.put(homeClassName, ejbObject);
    }
    
    

    return ejbObject;
  }

  /**
   * Removes all EJB objects and clears the cache. The EJB object's remove 
   * method is invoked.
   */
  public void close() {

    logger.debug("close()");

    Iterator ejbItr = ejbObjectCache.values().iterator();

    while (ejbItr.hasNext()) {

      EJBObject ejbObject = (EJBObject)ejbItr.next();

      try {

        ejbObject.remove();

      } catch (RemoteException e) {

        logger.error(e);

      } catch (RemoveException e) {

        logger.error(e);
      }
    }

    ejbObjectCache.clear();
  }
}
