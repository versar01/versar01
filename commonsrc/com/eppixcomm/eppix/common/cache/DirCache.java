package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DipDiscountPlanDMO;
import com.eppixcomm.eppix.base.blo.DirDiscountRuleDMO;
import com.eppixcomm.eppix.base.blo.DisDiscountDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;

/**
 * 
 * TOTEST - JL
 */
public class DirCache extends Cache {

  protected DirCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DirCache.class);

  private Logger logger = thrower.getLogger();

  static protected DirCache dirCache = null;

  /**
   * The full cache of {@link DirDiscountRuleDMO}
   */
  Map cachedDir = Collections
      .synchronizedMap(new LinkedHashMap());

  //  LinkedHashMap<Integer, DirDiscountRuleDMO> dirList = null;

  /**
   * The full cache of {@link DipDiscountPlanDMO}
   */
  Map cachedDip = Collections
      .synchronizedMap(new LinkedHashMap());

  /**
   * The full cache of {@link DisDiscountDMO}
   */
  Map cachedDis = Collections
      .synchronizedMap(new LinkedHashMap());

  Map dateCache = Collections
      .synchronizedMap(new LinkedHashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't
   * exist.
   * 
   * @param base
   * @return the cache instance.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   */
  public static DirCache getInstance(BaseBLOBinder base)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    if (dirCache == null) {
      synchronized (DirCache.class) {
        if (dirCache == null) {

          DirCache dir = new DirCache(base);

          dir.loadCache();
          
          dirCache = dir;
        }
      }
    }
    return dirCache;
  }

  void loadCache() throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug("loadCache()");
    // empty the cache
    // cachedDir.clear();

    // Load Dir Cache
    QueryFilter dirFilter = new QueryFilter();
    //   dirFilter.add(FilterOp.ANY, DirDiscountRuleDMO.dirRuleIdFilter);
    dirFilter.add(FilterOp.ORDERBYASC, DirDiscountRuleDMO.dirRuleIdFilter);

    //    dirList = base.dirDiscountRule().getList(
    //        new DTOListState(DTOListState.MAX_ELEMENTS), dirFilter);
    DAOIterator dirIterator = null;
    try {
      dirIterator = getBase().dirDiscountRule().iterate(dirFilter);
    } catch (EPPIXException e) {
    }

    if (dirIterator != null) {

      while (dirIterator.hasNext()) {
        DirDiscountRuleDMO dir = (DirDiscountRuleDMO) dirIterator.next();

        cachedDir.put(dir.getDirRuleId(), dir);
      }

      dirIterator.close();
    }

    // Load Dis Cache
    QueryFilter disFilter = new QueryFilter();
    //    disFilter.add(FilterOp.ANY, DisDiscountDMO.disDiscountIdFilter);
    disFilter.add(FilterOp.ORDERBYASC, DisDiscountDMO.disDiscountIdFilter);

    DAOIterator disIterator = null;
    try {
      disIterator = getBase().disDiscount().iterate(disFilter);
    } catch (EPPIXException e) {
    }

    if (disIterator != null) {

      while (disIterator.hasNext()) {
        DisDiscountDMO dis = (DisDiscountDMO) disIterator.next();

        cachedDis.put(dis.getDisDiscountId(), dis);
      }

      disIterator.close();
    }

    // Load Dis Cache
    QueryFilter dipFilter = new QueryFilter();
    //   dipFilter.add(FilterOp.ANY, DipDiscountPlanDMO.dipRuleRefFilter);
    dipFilter.add(FilterOp.ORDERBYASC, DipDiscountPlanDMO.dipSequenceFilter);

    DAOIterator dipIterator = null;
    try {
      dipIterator = getBase().dipDiscountPlan().iterate(dipFilter);
    } catch (EPPIXException e) {
    }

    if (dipIterator != null) {

      while (dipIterator.hasNext()) {
        DipDiscountPlanDMO dip = (DipDiscountPlanDMO) dipIterator.next();

        List list = (List)cachedDip.get(dip.getDipRuleRef());
        if (list == null) {
          list = new ArrayList();
          cachedDip.put(dip.getDipRuleRef(), list);
        }

        list.add(dip);
      }

      dipIterator.close();
    }

  }

  private void checkForDate(Date invoiceDate) {
    logger.debug("checkForDate( invoiceDate )");
    Map map = (Map)dateCache.get(invoiceDate);

    // no cache?  we need to get it !
    if (map == null) {

      synchronized (this) {

        map = (Map)dateCache.get(invoiceDate);

        if (map == null) {

//          for (DirDiscountRuleDMO dirDMO : cachedDir.values()) {
        	for(Iterator i = cachedDir.values().iterator(); i.hasNext();){
        		DirDiscountRuleDMO dirDMO = (DirDiscountRuleDMO)i.next();
        		
            if ((dirDMO.getDirStartDate().before(invoiceDate) || dirDMO
                .getDirStartDate().equals(invoiceDate))
                && (dirDMO.getDirEndDate().after(invoiceDate) || dirDMO
                    .getDirEndDate().equals(invoiceDate))) {

              List dipList = (List)cachedDip.get(dirDMO
                  .getDirRuleRef());

              if (dipList != null) {

//                for (DipDiscountPlanDMO dipDMO : dipList) {
            	for(Iterator it = dipList.iterator(); it.hasNext();){
            	  DipDiscountPlanDMO dipDMO = (DipDiscountPlanDMO)it.next();
            		  
                  DisDiscountDMO disDMO = (DisDiscountDMO)cachedDis.get(dipDMO
                      .getDipDiscountId());

                  if (disDMO != null) {

                    if (map == null) {
                      map = Collections
                          .synchronizedMap(new LinkedHashMap());
                      dateCache.put(invoiceDate, map);
                    }

                    List list = (List)map.get(disDMO
                        .getDisDiscountId());

                    if (list == null) {
                      list = Collections
                          .synchronizedList(new ArrayList());
                      map.put(disDMO.getDisDiscountId(), list);
                    }

                    list.add(dirDMO);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  /**
   * Gets the {@link DirDiscountRuleDMO} for the specified invoiceDate.
   * 
   * @param invoiceDate
   * @return boolean.
   * 
   */
  public boolean existsDiscountRule(Date invoiceDate) {

    logger.debug("existsDiscountRule( invoiceDate )");

    checkForDate(invoiceDate);
    if (dateCache.get(invoiceDate) != null) {
      return true;
    }

    return false;

  }

  public List getDiscountRule(Date invoiceDate,
      Integer discountId) {

    checkForDate(invoiceDate);

    Map map = (Map)dateCache.get(invoiceDate);

    if (map != null) {
      List list = (List)map.get(discountId);
      return list;
    }

    return null;
  }
}
