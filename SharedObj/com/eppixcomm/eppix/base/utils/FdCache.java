package com.eppixcomm.eppix.base.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.BcyBillingCycleDMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.blo.FdFieldDefDMO;

/**
 * 
 *
 */
public class FdCache extends Cache {

  protected FdCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(FdCache.class);

  private Logger logger = thrower.getLogger();

  protected static FdCache fdCache = null;

  /**
   * The cache of {@link BcyBillingCycleDMO}
   */
  Map<String, FdFieldDefDMO> cachedFd = Collections
      .synchronizedMap(new HashMap<String, FdFieldDefDMO>());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static FdCache getInstance(BaseBLOBinder base) {
    if (fdCache == null) {
      synchronized (FdCache.class) {
        if (fdCache == null) {
          FdCache fd = new FdCache(base);

          fd.loadCache();
          
          fdCache = fd;
        }
      }
    }
    return fdCache;
  }

  void loadCache() {

    // empty the cache
    cachedFd.clear();

    QueryFilter filter = new QueryFilter(FdFieldDefDMO.class);
    filter.add(FilterOp.ANY, FdFieldDefDMO.fdFieldNameFilter);
    DAOIterator i = null;
    try {
      i = getBase().fdFieldDef().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        FdFieldDefDMO fd = (FdFieldDefDMO) i.next();

        cachedFd.put(fd.getFdFieldName(), fd);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a {@link FdFieldDefDMO} for the specified service code.
   * 
   * @param serviceCode
   * @return a {@link FdFieldDefDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public FdFieldDefDMO getFieldDef(String fieldName)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getFd( fieldName )");

    return cachedFd.get(fieldName);

  }

}
