package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.BcyBillingCycleDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * 
 *
 */
public class BcyCache extends Cache {

  protected BcyCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(BcyCache.class);

  private Logger logger = thrower.getLogger();

  protected static BcyCache bcyCache = null;

  /**
   * The cache of {@link BcyBillingCycleDMO}
   */
  Map cachedBcy = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static BcyCache getInstance(BaseBLOBinder base) {
    if (bcyCache == null) {
      synchronized (BcyCache.class) {
        if (bcyCache == null) {
          BcyCache bcy = new BcyCache(base);

          bcy.loadCache();
          
          bcyCache = bcy;
        }
      }
    }
    return bcyCache;
  }

  void loadCache() {

    // empty the cache
    cachedBcy.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, BcyBillingCycleDMO.bcyBillCycleFilter);
    DAOIterator i = null;
    try {
      i = getBase().bcyBillingCycle().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        BcyBillingCycleDMO bcy = (BcyBillingCycleDMO) i.next();

        cachedBcy.put(bcy.getBcyBillCycle(), bcy);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a {@link BcyBillingCycleDMO} for the specified cycle.
   * 
   * @param cycle
   * @return a {@link BcyBillingCycleDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public BcyBillingCycleDMO getBillingCycle(String cycle)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getBillingCycle( cycle )");

    return (BcyBillingCycleDMO)cachedBcy.get(cycle);

  }

}
