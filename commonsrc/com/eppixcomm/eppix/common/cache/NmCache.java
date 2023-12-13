package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.NmNetmatDMO;
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
public class NmCache extends Cache {

  protected NmCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(NmCache.class);

  private Logger logger = thrower.getLogger();

  static protected NmCache nmCache = null;

  /**
   * The cache of {@link NmNetmatDMO}
   */
  Map cachedNm = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static NmCache getInstance(BaseBLOBinder base) {
    if (nmCache == null) {
      synchronized (NmCache.class) {
        if (nmCache == null) {
          NmCache nm = new NmCache(base);

          nm.loadCache();
          
          nmCache = nm;
        }
      }
    }
    return nmCache;
  }

  void loadCache() {

    // empty the cache
    cachedNm.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, NmNetmatDMO.nmInternalTariffFilter);
    DAOIterator i = null;
    try {
      i = getBase().nmNetmat().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        NmNetmatDMO nm = (NmNetmatDMO) i.next();

        cachedNm.put(nm.getNmInternalTariff(), nm);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets an {@link NmNetmatDMO} for the specified internal tariff.
   * 
   * @param internalTariff
   * @return an {@link NmNetmatDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public NmNetmatDMO getNetmat(String internalTariff)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getNetmat( internalTariff )");

    return (NmNetmatDMO)cachedNm.get(internalTariff);

  }

}
