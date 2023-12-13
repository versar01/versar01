package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SvrServRuleDMO;
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
public class SvrCache extends Cache {

  protected SvrCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(SvrCache.class);

  private Logger logger = thrower.getLogger();

  static protected SvrCache svrCache = null;

  /**
   * A mapped cache of {@link SvrServRuleDMO}
   */
  Map cachedsvr = Collections
      .synchronizedMap(new HashMap());

  /**
   * The main cache of {@link SvrServRuleDMO}
   */
  Map fullCache = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static SvrCache getInstance(BaseBLOBinder base) {
    if (svrCache == null) {
      synchronized (SvrCache.class) {
        if (svrCache == null) {
          SvrCache svr = new SvrCache(base);

          svr.loadCache();
          
          svrCache = svr;
        }
      }
    }
    return svrCache;
  }

  void loadCache() {

    // empty the cache
    cachedsvr.clear();
    fullCache.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, SvrServRuleDMO.svrPrimaryServFilter);

    DAOIterator i = null;
    try {
      i = getBase().svrServRule().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        SvrServRuleDMO svr = (SvrServRuleDMO) i.next();

        String svrPrimaryServ = svr.getSvrPrimaryServ();
        String svrServType = svr.getSvrServType();

        // add to the "full" cache list
        fullCache.put(svrPrimaryServ + svrServType + svr.getSvrTargetServ(),
            svr);

        // first find one for this code
        LinkedHashMap types = (LinkedHashMap)cachedsvr
            .get(svrPrimaryServ);

        // add new hashmap if one doesn't already exist.
        if (types == null) {

          types = new LinkedHashMap();
          cachedsvr.put(svrPrimaryServ, types);

        }

        List targets = (List)types.get(svrServType);

        if (targets == null) {

          targets = new ArrayList();
          types.put(svrServType, targets);

        }

        targets.add(svr);

      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets a service rule.
   * 
   * @param primary
   * @param type
   * @param target
   * @return a {@link SvrServRuleDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public SvrServRuleDMO getServRule(String primary, String type, String target)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getServRule( primary, type, target )");

    return (SvrServRuleDMO)fullCache.get(primary + type + target);

  }

  /**
   * Returns a list of {@link SvrServRuleDMO} objects based on primary serv and serv type.
   * 
   * @param primary
   * @param type
   * @return a list of {@link SvrServRuleDMO}
   * 
   * 
   */
  public List getList(String primary, String type) {

    logger.debug("getList( primary, type )");

    List list = null;

    // get the code hashmap
    LinkedHashMap types = (LinkedHashMap)cachedsvr.get(primary);

    if (types != null) {

      // get the target list
      list = (List)types.get(type);

    }

    return list;
  }

}
