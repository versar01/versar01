package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.DotDocTypeDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

public class DotCache extends Cache {

  protected DotCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(DotCache.class);

  private Logger logger = thrower.getLogger();

  static protected DotCache dotCache = null;

  /**
   * The cache of {@link DotDocTypeDMO}
   */
  Map cachedDot = Collections
      .synchronizedMap(new HashMap());

  Map cachedSubsystem = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static DotCache getInstance(BaseBLOBinder base) {
    if (dotCache == null) {
      synchronized (DotCache.class) {
        if (dotCache == null) {
          DotCache dot = new DotCache(base);

          dot.loadCache();
          
          dotCache = dot;
        }
      }
    }
    return dotCache;
  }

  void loadCache() {
    // empty the cache
    cachedDot.clear();
    cachedSubsystem.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, DotDocTypeDMO.dotTypeCodeFilter);
    DAOIterator i = null;
    try {
      i = getBase().dotDocType().iterate(filter);
    } catch (EPPIXException e) {
      // ignore errors...
    }

    List dotList = null;

    if (i != null) {

      while (i.hasNext()) {
        DotDocTypeDMO dot = (DotDocTypeDMO) i.next();

        cachedDot.put(dot.getDotTypeCode(), dot);

        dotList = (List)cachedSubsystem.get(dot.getDotSubsystem());
        if (dotList == null) {
          dotList = new ArrayList();
        }
        dotList.add(dot);

        cachedSubsystem.put(dot.getDotSubsystem(), dotList);
      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
        // ignore errors...
      }
    }
  }

  public DotDocTypeDMO getDotDocType(String dotTypeCode) {
    logger.debug("getDotDocType( dotTypeCode )");
    return (DotDocTypeDMO)cachedDot.get(dotTypeCode);
  }

  public List getListDotDocType(String dotSubSystem) {
    logger.debug("getListDotDocType(String dotSubSystem)");
    return (List)cachedSubsystem.get(dotSubSystem);
  }

  public List getListDotDocType(String[] dotSubSystem) {
    logger.debug("getListDotDocType(String[]  dotSubSystem )");
    List dotList = null;
    
//    for (String subSystem : dotSubSystem) {
    for(int i = 0; i <= dotSubSystem.length; i++){
    	String subSystem = (String)dotSubSystem[i];
    	
      if (dotList == null) {
        dotList = new ArrayList();
      }
      dotList.add(cachedSubsystem.get(subSystem));
    }
    return dotList;
  }

  public String[] getDotTypeCodes(String[] dotSubSystem) {
    logger.debug("getDotTypeCodes(dotSubSystem )");
    List dotList = null;
//    for (String subSystem : dotSubSystem) {
    for(int i = 0; i <= dotSubSystem.length; i++){
    	String subSystem = (String)dotSubSystem[i];
    	
    	List dotList2 = (List)cachedSubsystem.get(subSystem);
   
	      if (dotList2 != null) {
	    	  
//	        for (DotDocTypeDMO dotDMO : dotList2) {
	        for(Iterator it = dotList2.iterator();it.hasNext();){
	        	DotDocTypeDMO dotDMO = (DotDocTypeDMO)it.next();
	          if (dotList == null) {
	            dotList = new ArrayList();
	          }
	          dotList.add(dotDMO.getDotTypeCode());
	        }
	      }
    }
    return (dotList != null) ? (String[])dotList.toArray(new String[0]) : null;
  }
}
