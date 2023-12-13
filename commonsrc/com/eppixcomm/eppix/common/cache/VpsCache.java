package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.VpsPackageServDMO;
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
public class VpsCache extends Cache {

  protected VpsCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VpsCache.class);

  private Logger logger = thrower.getLogger();

  static protected VpsCache vpsCache = null;

  /**
   * The cache of {@link VpsPackageServDMO}.
   */
  Map cachedVps = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VpsCache getInstance(BaseBLOBinder base) {
    if (vpsCache == null) {
      synchronized (VpsCache.class) {
        if (vpsCache == null) {
          vpsCache = new VpsCache(base);
        }
      }
    }
    
    vpsCache.setBase(base);
    
    return vpsCache;
  }

  // This cache works on a per-request basis.
  void loadCache(String packageCode) {

    // is this package already cached?
    if (cachedVps.containsKey(packageCode)) {
      return;
    }

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, VpsPackageServDMO.vpsPackageCodeFilter,
        packageCode);
    DAOIterator i = null;
    try {
      i = getBase().vpsPackageServ().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      LinkedHashMap services = new LinkedHashMap(
          30);
      cachedVps.put(packageCode, services);

      while (i.hasNext()) {
        VpsPackageServDMO vps = (VpsPackageServDMO) i.next();

        services.put(vps.getVpsServiceCode(), vps);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a {@link VpsPackageServDMO} for the specified package and service code.
   * 
   * @param packageCode
   * @param serviceCode
   * @returna {@link VpsPackageServDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public VpsPackageServDMO getPackageServ(String packageCode, String serviceCode)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getPackageServ( packageCode, serviceCode )");

    VpsPackageServDMO vps = null;

    LinkedHashMap services = (LinkedHashMap)cachedVps.get(packageCode);

    // try caching it...
    if (services == null) {
      synchronized (this) {
        if (services == null) {
          loadCache(packageCode);

          services = (LinkedHashMap)cachedVps.get(packageCode);
        }
      }
    }
    if (services != null) {

      vps = (VpsPackageServDMO) services.get(serviceCode);

    }

    return vps;
  }

}
