package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
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
public class VstCache extends Cache {

  protected VstCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VstCache.class);

  private Logger logger = thrower.getLogger();

  static protected VstCache vstCache = null;

  /**
   * The cache of {@link VstServiceTypesDMO}
   */
  Map cachedVst = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VstCache getInstance(BaseBLOBinder base) {
    if (vstCache == null) {
      synchronized (VstCache.class) {
        if (vstCache == null) {
          VstCache vst = new VstCache(base);

          vst.loadCache();
          
          vstCache = vst;
        }
      }
    }
    return vstCache;
  }

  void loadCache() {

    // empty the cache
    cachedVst.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, VstServiceTypesDMO.vstServiceTypeFilter);
    DAOIterator i = null;
    try {
      i = getBase().vstServiceTypes().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        VstServiceTypesDMO vsr = (VstServiceTypesDMO) i.next();

        cachedVst.put(vsr.getVstServiceType(), vsr);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }

    }

  }

  /**
   * Gets a {@link VstServiceTypesDMO} for the specified service type.
   * 
   * @param serviceType
   * @return a {@link VstServiceTypesDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public VstServiceTypesDMO getServiceType(String serviceType)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getServiceType( serviceType )");

    return (VstServiceTypesDMO)cachedVst.get(serviceType);

  }

}
