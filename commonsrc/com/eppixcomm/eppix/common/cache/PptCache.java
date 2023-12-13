package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.PptPrepaidTypesDMO;
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
public class PptCache extends Cache {

  protected PptCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(PptCache.class);

  private Logger logger = thrower.getLogger();

  static protected PptCache pptCache = null;

  /**
   * The cache of {@link PptPrepaidTypesDMO}
   */
  Map cachedPpt = Collections.synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static PptCache getInstance(BaseBLOBinder base) {
    if (pptCache == null) {
      synchronized (PptCache.class) {
        if (pptCache == null) {
          PptCache ppt = new PptCache(base);

          ppt.loadCache();
          
          pptCache = ppt;
        }
      }
    }
    return pptCache;
  }

  void loadCache() {

    // empty the cache
    cachedPpt.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, PptPrepaidTypesDMO.pptTypeFilter);
    DAOIterator i = null;
    try {
      i = getBase().pptPrepaidTypes().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        PptPrepaidTypesDMO ppt = (PptPrepaidTypesDMO) i.next();

        cachedPpt.put(ppt.getPptType(), ppt);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets a {@link PptPrepaidTypesDMO} for the specified type.
   * 
   * @param type
   * @return a {@link PptPrepaidTypesDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public PptPrepaidTypesDMO getPrepaidType(String type)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getPrepaidType( type )");

    return (PptPrepaidTypesDMO)cachedPpt.get(type);

  }

}
