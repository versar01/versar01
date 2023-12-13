package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SpdServParamDefDMO;
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
public class SpdCache extends Cache {

  protected SpdCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(SpdCache.class);

  private Logger logger = thrower.getLogger();

  static protected SpdCache spdCache = null;

  /**
   * The cache of {@link SpdServParamDefDMO}
   */
  Map cachedSpd = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static SpdCache getInstance(BaseBLOBinder base) {
    if (spdCache == null) {
      synchronized (SpdCache.class) {
        if (spdCache == null) {
          SpdCache spd = new SpdCache(base);

          spd.loadCache();
          
          spdCache = spd;
        }
      }
    }
    return spdCache;
  }

  void loadCache() {

    // empty the cache
    cachedSpd.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, SpdServParamDefDMO.spdServiceCodeFilter);

    DAOIterator i = null;
    try {
      i = getBase().spdServParamDef().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        SpdServParamDefDMO spd = (SpdServParamDefDMO) i.next();

        List list = (List)cachedSpd.get(spd.getSpdServiceCode());

        if (list == null) {
          list = new ArrayList();
          cachedSpd.put(spd.getSpdServiceCode(), list);
        }

        list.add(spd);

      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }

  }

  /**
   * Gets a list of {@link SpdServParamDefDMO} for the specified service code.
   * 
   * @param serviceCode
   * @return a list of {@link SpdServParamDefDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public List getServiceParameters(String serviceCode)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getServiceParameters( serviceCode )");

    return (List)cachedSpd.get(serviceCode);

  }

}
