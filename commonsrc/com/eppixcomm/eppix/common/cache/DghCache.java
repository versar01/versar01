package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DghDiscGrpHeadDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

// cache of dgh_disc_grp_head table
public class DghCache extends Cache {

  protected DghCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DghCache.class);

  private Logger logger = thrower.getLogger();

  static protected DghCache dghCache = null;

  /**
   * The cache of {@link DghDiscGrpHeadDMO}
   */
  Map cachedDgh = Collections.synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't
   * exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static DghCache getInstance(BaseBLOBinder base) {
    if (dghCache == null) {
      synchronized (DghCache.class) {
        if (dghCache == null) {

          DghCache dgh = new DghCache(base);

          dgh.loadCache();
          
          dghCache = dgh;
        }
      }
    }
    return dghCache;
  }

  void loadCache() {

    // empty the cache
    cachedDgh.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, DghDiscGrpHeadDMO.dghGroupIdFilter);

    DAOIterator i = null;
    try {
      i = getBase().dghDiscGrpHead().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        DghDiscGrpHeadDMO dgh = (DghDiscGrpHeadDMO) i.next();

        cachedDgh.put(dgh.getDghGroupId(), dgh);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets the {@link DghDiscGrpHeadDMO} for the specified group id.
   * 
   * @param groupId
   * @return a {@link DghDiscGrpHeadDMO} or null if not found.
   */
  public DghDiscGrpHeadDMO getDiscountGroupHeader(Integer groupId) {

    logger.debug("getdiscountBand( groupId )");

    return (DghDiscGrpHeadDMO)cachedDgh.get(groupId);

  }
}
