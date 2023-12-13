package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.VprProviderDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.FilterOp;
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
public class VprCache extends Cache {

  protected VprCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VprCache.class);

  private Logger logger = thrower.getLogger();

  static protected VprCache vprCache = null;

  /**
   * The cache of {@link VprProviderDMO}
   */
  Map cachedVpr = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VprCache getInstance(BaseBLOBinder base) {
    if (vprCache == null) {
      synchronized (VprCache.class) {
        if (vprCache == null) {
          VprCache vpr = new VprCache(base);

          vpr.loadCache();
          
          vprCache = vpr;
        }
      }
    }
    return vprCache;
  }

  void loadCache() {

    // empty the cache
    cachedVpr.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, VprProviderDMO.vprProviderIdFilter);
    DAOIterator i = null;
    try {
      i = getBase().vprProvider().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        VprProviderDMO vpr = (VprProviderDMO) i.next();

        cachedVpr.put(vpr.getVprProviderId(), vpr);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a {@link VprProviderDMO} using the specified provider id.
   * 
   * @param providerId
   * @return the {@link VprProviderDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public VprProviderDMO getProvider(String providerId)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getProvider( providerId )");

    return (VprProviderDMO)cachedVpr.get(providerId);

  }

}
