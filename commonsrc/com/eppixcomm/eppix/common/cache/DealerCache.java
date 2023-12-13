package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DealersDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * 
 *
 */
public class DealerCache extends Cache {

  protected DealerCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DealerCache.class);

  private Logger logger = thrower.getLogger();

  static protected DealerCache dealerCache = null;

  /**
   * The cache of {@link DealersDMO} 
   */
  Map cachedDealers = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static DealerCache getInstance(BaseBLOBinder base) {
    if (dealerCache == null) {
      synchronized (DealerCache.class) {
        if (dealerCache == null) {
          dealerCache = new DealerCache(base);
        }
      }
    }
    
    dealerCache.setBase(base);
    
    return dealerCache;
  }

  /**
   * Gets a {@link DealersDMO} for the specified dealer id.
   * 
   * @param dealerId
   * @return a {@link DealersDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public DealersDMO getDealer(String dealerId) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("DealersCMO( dealerId )");

    DealersDMO dealer = null;

    // get the cached dealer
    dealer = (DealersDMO)cachedDealers.get(dealerId);

    // not there?  Get it from the database, and cache it.
    if (dealer == null) {
      synchronized (this) {
        if (dealer == null) {
          
          QueryFilter filter = new QueryFilter();
          filter.add(FilterOp.EQUAL, DealersDMO.dealerIdFilter, dealerId);

          dealer = getBase().dealers().get(filter);

          if (dealer != null) {

            cachedDealers.put(dealerId, dealer);

          }
        }
      }
    }

    return dealer;
  }
}
