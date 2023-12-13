package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DibDiscountBandDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * 
 *
 */
public class DibCache extends Cache {

  protected DibCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DibCache.class);

  private Logger logger = thrower.getLogger();

  protected static DibCache dibCache = null;


  /**
   * The full cache of {@link DibDiscountBandDMO}
   */
  Map cachedDib = Collections
      .synchronizedMap(new HashMap());

  /**
   * Cache of bands in groups of rule Id.
   */
  Map ruleCache = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't
   * exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static DibCache getInstance(BaseBLOBinder base) {
    if (dibCache == null) {
      synchronized (DibCache.class) {
        if (dibCache == null) {
          DibCache dib = new DibCache(base);

          dib.loadCache();
          
          dibCache = dib;
        }
      }
    }
    return dibCache;
  }

  void loadCache() {

    // empty the cache
    cachedDib.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, DibDiscountBandDMO.dibBandIdFilter);
    filter.add(FilterOp.ORDERBYASC, DibDiscountBandDMO.dibRuleIdFilter);
    filter.add(FilterOp.ORDERBYASC, DibDiscountBandDMO.dibBandEndFilter);

    DAOIterator i = null;
    try {
      i = getBase().dibDiscountBand().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        DibDiscountBandDMO dib = (DibDiscountBandDMO) i.next();

        cachedDib.put(dib.getDibBandId(), dib);

        List rules = (List)ruleCache.get(dib.getDibRuleId());

        if (rules == null) {
          rules = new ArrayList();

          ruleCache.put(dib.getDibRuleId(), rules);
        }

        rules.add(dib);

      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
        // ignore errors...
      }

    }
  }

  /**
   * Gets the {@link DibDiscountBandDMO} for the specified band id.
   * 
   * @param bandId
   * @return a {@link DibDiscountBandDMO} or null if not found.
   * 
   */
  public DibDiscountBandDMO getdiscountBand(Integer bandId) {

    logger.debug("getdiscountBand( bandId )");

    return (DibDiscountBandDMO)cachedDib.get(bandId);

  }

  /**
   * Returns the list of {@link DibDiscountBandDMO} for the specified rule id.
   * 
   * @param ruleId
   * @return a list of {@link DibDiscountBandDMO}
   * 
   */
  public List getBandsForRule(Integer ruleId) {

    logger.debug("getBandsForRule( ruleId )");

    return (List)ruleCache.get(ruleId);
  }

  /**
   * Returns a {@link DibDiscountBandDMO} for the specified rule id that falls within
   * the threshold value.
   * 
   * @param ruleId
   * @param threshold
   * @return a {@link DibDiscountBandDMO} or null if not found.
   * 
   */
  public DibDiscountBandDMO getBandForThreshold(Integer ruleId, double threshold) {

    logger.debug("getBandForThreshold( ruleId, threshold )");

    List list = getBandsForRule(ruleId);

//    for (DibDiscountBandDMO dib : list) {
//      if (threshold <= dib.getDibBandEnd().doubleValue()) {
//        return dib;
//      }
//    }
    Iterator i = list.iterator();
//    for(Iterator i = list.iterator();i.next();){
    while(i.hasNext()){	
    	DibDiscountBandDMO dib = (DibDiscountBandDMO)i.next();
        if (threshold <= dib.getDibBandEnd().doubleValue()) {
            return dib;
          }
    }

    return null;
  }

}
