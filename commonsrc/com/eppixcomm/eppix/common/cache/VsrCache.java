package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.Vsr2ServiceAuxDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * A cache for both {@link VsrServiceDMO} and {@link Vsr2ServiceAuxDMO}.
 *
 */
public class VsrCache extends Cache {

  protected VsrCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VsrCache.class);

  private Logger logger = thrower.getLogger();

  static protected VsrCache vsrCache = null;

  /**
   * The cache of {@link VsrServiceDMO}
   */
  Map cachedVsr = Collections.synchronizedMap(new HashMap());

  /**
   * The cache of {@link Vsr2ServiceAuxDMO}
   */
  Map cachedVsr2 = Collections
      .synchronizedMap(new LinkedHashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VsrCache getInstance(BaseBLOBinder base) {
    if (vsrCache == null) {
      synchronized (VsrCache.class) {
        if (vsrCache == null) {
          VsrCache vsr = new VsrCache(base);

          vsr.loadCache();
          
          vsrCache = vsr;
        }
      }
    }
    return vsrCache;
  }

  void loadCache() {

    // empty the cache
    cachedVsr.clear();
    cachedVsr2.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, VsrServiceDMO.vsrServiceCodeFilter);
    DAOIterator i = null;
    try {
      i = getBase().vsrService().iterate(filter);
    } catch (EPPIXException e) {
      // ignore errors...
    }

    if (i != null) {

      while (i.hasNext()) {
        VsrServiceDMO vsr = (VsrServiceDMO) i.next();

        cachedVsr.put(vsr.getVsrServiceCode(), vsr);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }

    }

    filter = new QueryFilter();
    filter.add(FilterOp.ANY, Vsr2ServiceAuxDMO.vsr2ServiceCodeFilter);
    filter.add(FilterOp.ORDERBYASC, Vsr2ServiceAuxDMO.vsr2ServiceOrderFilter);

    try {
      i = getBase().vsr2ServiceAux().iterate(filter);
    } catch (EPPIXException e) {
      // ignore errors.
    }

    if (i != null) {

      while (i.hasNext()) {
        Vsr2ServiceAuxDMO vsr2 = (Vsr2ServiceAuxDMO) i.next();

        cachedVsr2.put(vsr2.getVsr2ServiceCode(), vsr2);
      }
    }
  }

  /**
   * Returns a {@link VsrServiceDMO} for the specified service code.
   * 
   * @param serviceCode
   * @return a {@link VsrServiceDMO}, or null if not found.
   */
  public VsrServiceDMO getService(String serviceCode) {

    logger.debug("getService( serviceCode )");

    return (VsrServiceDMO)cachedVsr.get(serviceCode);
  }

  /**
   * Returns a {@link Vsr2ServiceAuxDMO} for the specified service code.
   * 
   * @param serviceCode
   * @return a {@link Vsr2ServiceAuxDMO}, or null if not found.
   */
  public Vsr2ServiceAuxDMO getServiceAux(String serviceCode) {

    logger.debug("getServiceAux( serviceCode )");

    return (Vsr2ServiceAuxDMO)cachedVsr2.get(serviceCode);

  }

  /**
   * Gets the full list of {@link Vsr2ServiceAuxDMO}.
   * 
   * @return a list of {@link Vsr2ServiceAuxDMO}
   */
  public List getServiceAuxList() {

    logger.debug("getServiceAuxList()");

    return  (List)cachedVsr2.values();

  }

}
