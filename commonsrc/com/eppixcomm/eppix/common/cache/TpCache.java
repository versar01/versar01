package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.TpTariffPlanDMO;
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
public class TpCache extends Cache {

  protected TpCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(TpCache.class);

  private Logger logger = thrower.getLogger();

  static protected TpCache tpCache = null;

  /**
   * The cache of {@link TpTariffPlanDMO}
   */
  Map cachedTp = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static TpCache getInstance(BaseBLOBinder base) {
    if (tpCache == null) {
      synchronized (TpCache.class) {
        if (tpCache == null) {
          TpCache tp = new TpCache(base);

          tp.loadCache();
          
          tpCache = tp;
        }
      }
    }
    return tpCache;
  }

  void loadCache() {

    // empty the cache
    cachedTp.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, TpTariffPlanDMO.tpTarplanRefFilter);
    DAOIterator i = null;
    try {
      i = getBase().TpTariffPlan().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        TpTariffPlanDMO tp = (TpTariffPlanDMO) i.next();

        cachedTp.put(tp.getTpTarplanRef(), tp);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }

    }

  }

  /**
   * Gets a {@link TpTariffPlanDMO} for the specified tarplan ref.
   * 
   * @param tarplanRef
   * @return a {@link TpTariffPlanDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public TpTariffPlanDMO getTariffPlan(String tarplanRef)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getTariffPlan( tarplanRef )");

    return (TpTariffPlanDMO)cachedTp.get(tarplanRef);

  }

}
