package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DgdDiscGrpDetDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * 
 */
public class DgdCache extends Cache {

  protected DgdCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DgdCache.class);

  private Logger logger = thrower.getLogger();

  static protected DgdCache dgdCache = null;

  /**
   * The cache of {@link DgdDiscGrpDetDMO}
   */
  Map cachedDgd = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't
   * exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static DgdCache getInstance(BaseBLOBinder base) {
    if (dgdCache == null) {
      synchronized (DgdCache.class) {
        if (dgdCache == null) {
          DgdCache dgd = new DgdCache(base);

          dgd.loadCache();
          
          dgdCache = dgd;
        }
      }
    }
    return dgdCache;
  }

  void loadCache() {

    // empty the cache
    cachedDgd.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, DgdDiscGrpDetDMO.dgdGroupIdFilter);

    DAOIterator i = null;
    try {
      i = getBase().dgdDiscGrpDet().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        DgdDiscGrpDetDMO dgd = (DgdDiscGrpDetDMO) i.next();

        List list = (List)cachedDgd.get(dgd.getDgdGroupId());

        if (list == null) {
          list = new ArrayList();

          cachedDgd.put(dgd.getDgdGroupId(), list);
        }

        list.add(dgd);
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets a list of {@link DgdDiscGrpDetDMO} for the specified group id.
   * 
   * @param groupId
   * @return a list of {@link DgdDiscGrpDetDMO} or null if not found.
   */
  public List getDiscountGroupDetail(Integer groupId) {

    logger.debug("getDiscountGroupDetail( groupId )");

    return (List)cachedDgd.get(groupId);

  }

  /**
   * Determines whether a given class is part of a specific group.
   * 
   * @param groupId
   * @param classId
   * @return true if class exists in group.
   */
  public boolean groupContainsClass(Integer groupId, Integer classId) {

    logger.debug("groupContainsClass( groupId, classId )");

    List list = (List)cachedDgd.get(groupId);

    if (list != null) {

//      for (DgdDiscGrpDetDMO dgd : list) {
//        if (dgd.getDgdClassId().equals(classId)) {
//          return true;
//        }
//      }
//    }
    
	    for(Iterator i = list.iterator(); i.hasNext();){
	    	DgdDiscGrpDetDMO dgd = (DgdDiscGrpDetDMO)i.next();
	        if (dgd.getDgdClassId().equals(classId)) {
	            return true;
	        }
	    }
    }else{
        return false;
    }
    
    return false;
  }
}
