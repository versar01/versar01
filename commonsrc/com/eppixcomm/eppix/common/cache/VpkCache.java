package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.VpkPackageDMO;
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
public class VpkCache extends Cache {

  protected VpkCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VpkCache.class);

  private Logger logger = thrower.getLogger();

  static protected VpkCache vpkCache = null;

  /**
   * The cache of {@link VpkPackageDMO}
   */
  Map cachedVpk = (Map)Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VpkCache getInstance(BaseBLOBinder base) {
    if (vpkCache == null) {
      synchronized (VpkCache.class) {
        if (vpkCache == null) {
          VpkCache vpk = new VpkCache(base);

          vpk.loadCache();
          
          vpkCache = vpk;
        }
      }
    }
    return vpkCache;
  }

  void loadCache() {

    // empty the cache
    cachedVpk.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, VpkPackageDMO.vpkPackageCodeFilter);
    DAOIterator i = null;
    try {
      i = getBase().vpkPackage().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        VpkPackageDMO vpk = (VpkPackageDMO) i.next();

        cachedVpk.put(vpk.getVpkPackageCode(), vpk);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a {@link VpkPackageDMO} for the specified package code.
   * 
   * @param packageCode
   * @return a {@link VpkPackageDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public VpkPackageDMO getPackage(String packageCode)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getPackage( packageCode )");

    return (VpkPackageDMO)cachedVpk.get(packageCode);

  }

}
