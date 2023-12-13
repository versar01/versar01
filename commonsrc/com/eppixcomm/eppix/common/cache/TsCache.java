package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.base.blo.Vsr2ServiceAuxDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
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
public class TsCache extends Cache {

  protected TsCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(TsCache.class);

  private Logger logger = thrower.getLogger();

  static protected TsCache tsCache = null;

  /**
   * A mapped cache of {@link TsTariffServiceDMO}
   */
  Map cachedTs = Collections
      .synchronizedMap(new HashMap());

  /**
   * A sorted cache of {@link TsTariffServiceDMO}
   */
  Map sortedTs = Collections
      .synchronizedMap(new HashMap());

  /**
   * The main cache of {@link TsTariffServiceDMO}
   */
  Map fullCache = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static TsCache getInstance(BaseBLOBinder base) {
    if (tsCache == null) {
      synchronized (TsCache.class) {
        if (tsCache == null) {
          tsCache = new TsCache(base);
        }
      }
    }
    
    tsCache.setBase(base);
    
    return tsCache;
  }

  // Cache works on a per-request basis
  void loadCache(String packageCode) {

    // already cached this package ?
    if (!DMO.isNull(packageCode) && cachedTs.get(packageCode) != null) {
      return;
    }

    // empty the cache

    QueryFilter filter = new QueryFilter();
    if (DMO.isNull(packageCode)) {
      cachedTs.clear();
      fullCache.clear();
      filter.add(FilterOp.ANY, TsTariffServiceDMO.tsPackageCodeFilter);
    } else {
      filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter,
          packageCode);
    }

    DAOIterator i = null;
    try {
      i = getBase().tsTariffService().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        TsTariffServiceDMO ts = (TsTariffServiceDMO) i.next();

        String tsPackageCode = ts.getTsPackageCode();

        // add to the "full" cache list
        fullCache.put(tsPackageCode + '*' + ts.getTsInternalTariff() + '*'
            + ts.getTsServiceCode(), ts);

        // first find one for this code
        LinkedHashMap packages = (LinkedHashMap)cachedTs.get(tsPackageCode);

        // add new hashmap if one doesn't already exist.
        if (packages == null) {

          packages = new LinkedHashMap(20);
          cachedTs.put(tsPackageCode, packages);

        }

        List services = (List)packages.get(ts.getTsServiceCode());

        if (services == null) {

          services = new ArrayList();
          packages.put(ts.getTsServiceCode(), services);

        }

        services.add(ts);

      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets a {@link TsTariffServiceDMO} for the specified parameters.
   * 
   * @param packageCode
   * @param internalTariff
   * @param serviceCode
   * @return a {@link TsTariffServiceDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public TsTariffServiceDMO getTariffService(String packageCode,
      String internalTariff, String serviceCode) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger
        .debug("getNetworkGroupServ( packageCode, internalTariff, serviceCode )");

    TsTariffServiceDMO tariff = null;
    synchronized (this) {
      LinkedHashMap packages = (LinkedHashMap)cachedTs.get(packageCode);

      if (packages == null) {
        // try to load the package
        loadCache(packageCode);

        packages = (LinkedHashMap)cachedTs.get(packageCode);
      }

      // matched the package ?
      if (packages != null) {

        // matched the service ?
        List services = (List)packages.get(serviceCode);

        if (services != null) {

          TsTariffServiceDMO nullTariff = null;

//          for (TsTariffServiceDMO ts : services) {
        for(Iterator i = services.iterator(); i.hasNext();){  
        	TsTariffServiceDMO ts = (TsTariffServiceDMO)i.next();
        	
            if (DMO.isNull(internalTariff)) {
              if (DMO.isNull(ts.getTsInternalTariff())) {
                tariff = ts;
                break;
              }
            } else {
              if (DMO.isNull(ts.getTsInternalTariff())) {
                nullTariff = ts;
              } else {
                if (internalTariff.equals(ts.getTsInternalTariff())) {
                  tariff = ts;
                  break;
                }
              }
            }
          }

          // if we didn't find a match
          if (tariff == null && nullTariff != null) {
            tariff = nullTariff;
          }
        }
      }
    }
    //return fullCache.get(packageCode + '*' + internalTariff + '*' + serviceCode);

    return tariff;

  }

  /**
   * Returns a list of {@link TsTariffServiceDMO} based on package code.
   * 
   * @param packageCode
   * @return a list of {@link TsTariffServiceDMO}
   * 
   * 
   */
  public List getList(String packageCode) {

    logger.debug("getList( packageCode )");

    List list = null;

    synchronized (this) {
      // is this package code cached yet ?
      LinkedHashMap packages = (LinkedHashMap)cachedTs.get(packageCode);

      if (packages == null) {
        // try to load the package
        loadCache(packageCode);

        packages = (LinkedHashMap)cachedTs.get(packageCode);
      }

      // can we build the list for the package code ?
      if (packages != null) {

//        for (List<TsTariffServiceDMO> ts : packages.values()) {
    	  
    	  for(Iterator i = packages.values().iterator(); i.hasNext();){	
    		  List ts = (List)i.next();
    		  
          if (list == null) {
            list = new ArrayList();
          }

          list.addAll(ts);
        }
      }
    }

    return list;

  }

  /**
   * Returns a sorted list of {@link TsTariffServiceDMO} for the specified package code.
   * 
   * @param packageCode
   * @return a sorted list of {@link TsTariffServiceDMO}
   * @throws EPPIXSeriousException 
   * 
   * 
   */
  public List getSortedList(String packageCode)
      throws EPPIXSeriousException {

    logger.debug("getSortedList( packageCode )");

    List list = null;

    synchronized (this) {
      list = (List)sortedTs.get(packageCode);

      // if the list is empty, we'll need to create it first...
      if (list == null) {
        List serviceList = getList(packageCode);

        VsrCache vsrCache = VsrCache.getInstance(getBase());

        list = new ArrayList(serviceList.size());

//        for (TsTariffServiceDMO ts : serviceList) {
        for(Iterator i = serviceList.iterator(); i.hasNext();){	
        	TsTariffServiceDMO ts = (TsTariffServiceDMO)i.next();
        	
          Vsr2ServiceAuxDMO vsr2 = vsrCache
              .getServiceAux(ts.getTsServiceCode());

          if (vsr2 == null) {
            throw new EPPIXSeriousException(
                "Vsr2ServiceAuxDMO record not found for '"
                    + ts.getTsServiceCode() + "'.");
          }

          short order = vsr2.getVsr2ServiceOrder().shortValue();

          boolean swapped = false;
          int count = 0;
//          for (TsTariffServiceDMO ts2 : list) {
          for(Iterator it = list.iterator(); it.hasNext();){
        	  TsTariffServiceDMO ts2 = (TsTariffServiceDMO)it.next();
        	  
            vsr2 = vsrCache.getServiceAux(ts2.getTsServiceCode());

            if (vsr2 == null) {
              throw new EPPIXSeriousException(
                  "Vsr2ServiceAuxDMO record not found for '"
                      + ts.getTsServiceCode() + "'.");
            }

            if (order < vsr2.getVsr2ServiceOrder().shortValue()) {
              swapped = true;
              break;
            }
            count++;
          }

          if (!swapped) {
            list.add(ts);
          } else {
            list.add(count, ts);
          }
        }
      }
    }
    return list;
  }

}
