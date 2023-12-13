package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.CugUserGroupDMO;
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
public class CugCache extends Cache {

  protected CugCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(CugCache.class);

  private Logger logger = thrower.getLogger();

  static protected CugCache cugCache = null;

  /**
   * The cache of {@link CugUserGroupDMO}
   */
  Map cachedCug = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static CugCache getInstance(BaseBLOBinder base) {
    if (cugCache == null) {
      synchronized (CugCache.class) {
        if (cugCache == null) {
          CugCache cug = new CugCache(base);

          cug.loadCache();
          
          cugCache = cug;
        }
      }
    }
    return cugCache;
  }

  void loadCache() {

    // empty the cache
    cachedCug.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, CugUserGroupDMO.cugIdFilter);
    DAOIterator i = null;
    try {
      i = getBase().cugUserGroup().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        CugUserGroupDMO cug = (CugUserGroupDMO) i.next();

        cachedCug.put(cug.getCugId(), cug);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }

    }

  }

  /**
   * Gets a {@link CugUserGroupDMO} for the specified id.
   * 
   * @param cugId
   * @return a {@link CugUserGroupDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public CugUserGroupDMO getUserGroup(String cugId)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getUserGroup( cugId )");

    return (CugUserGroupDMO)cachedCug.get(cugId);
  }
}
