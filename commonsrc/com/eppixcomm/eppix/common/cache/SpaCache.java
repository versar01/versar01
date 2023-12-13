package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SpaServiceParamsDMO;
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
public class SpaCache extends Cache {

  protected SpaCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(SpaCache.class);

  private Logger logger = thrower.getLogger();

  static protected SpaCache spaCache = null;

  /**
   * The main cache of {@link SpaServiceParamsDMO}
   */
  Map cachedSpa = Collections
      .synchronizedMap(new HashMap());

  /**
   * The cache of {@link SpaServiceParamsDMO} by name.
   */
  Map cachedSpaNames = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static SpaCache getInstance(BaseBLOBinder base) {
    if (spaCache == null) {
      synchronized (SpaCache.class) {
        if (spaCache == null) {
          SpaCache spa = new SpaCache(base);

          spa.loadCache();
          
          spaCache = spa;
        }
      }
    }
    return spaCache;
  }

  void loadCache() {

    // empty the cache
    cachedSpa.clear();
    cachedSpaNames.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, SpaServiceParamsDMO.spaServiceTypeFilter);
    DAOIterator i = null;
    try {
      i = getBase().spaServiceParams().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        SpaServiceParamsDMO spa = (SpaServiceParamsDMO) i.next();

        LinkedHashMap serviceTypes = (LinkedHashMap)cachedSpa.get(spa.getSpaServiceType());

        if (serviceTypes == null) {
          serviceTypes = new LinkedHashMap();
          cachedSpa.put(spa.getSpaServiceType(), serviceTypes);
        }

        serviceTypes.put(spa.getSpaParamId(), spa);

        HashMap serviceTypesNames = (HashMap)cachedSpaNames.get(spa.getSpaServiceType());

        if (serviceTypesNames == null) {
          serviceTypesNames = new HashMap();
          cachedSpaNames.put(spa.getSpaServiceType(), serviceTypesNames);
        }

        serviceTypesNames.put(spa.getSpaParamName(), spa);

      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets an {@link SpaServiceParamsDMO} for the specified service type and id.
   * 
   * @param serviceType
   * @param paramId
   * @return a {@link SpaServiceParamsDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public SpaServiceParamsDMO getServiceParameterById(String serviceType,
      Short paramId) throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getServiceParameterById( serviceType, paramId )");

    SpaServiceParamsDMO spa = null;

    HashMap serviceTypes = (HashMap)cachedSpa.get(serviceType);

    if (serviceTypes != null) {
      spa = (SpaServiceParamsDMO) serviceTypes.get(paramId);
    }

    return spa;

  }

  /**
   * Gets an {@link SpaServiceParamsDMO} for the specified service type and name.
   * 
   * @param serviceType
   * @param paramName
   * @return a {@link SpaServiceParamsDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public SpaServiceParamsDMO getServiceParameterByName(String serviceType,
      String paramName) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getServiceParameterByName( serviceType, paramName )");

    SpaServiceParamsDMO spa = null;

    HashMap serviceTypes = (HashMap)cachedSpaNames.get(serviceType);

    if (serviceTypes != null) {
      spa = (SpaServiceParamsDMO) serviceTypes.get(paramName);
    }

    return spa;

  }

  /**
   * Gets a list of {@link SpaServiceParamsDMO}, for the specified service type.
   * 
   * @param serviceType
   * @return a list of {@link SpaServiceParamsDMO}
   * 
   */
  public List getServiceParameters(String serviceType) {

    logger.debug("getServiceParameters( serviceType )");

    return new ArrayList(
        ((LinkedHashMap) cachedSpa.get(serviceType))
            .values());

  }

}
