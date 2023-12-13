package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.VpnProviderNetwkDMO;
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
public class VpnCache extends Cache {

  protected VpnCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(VpnCache.class);

  private Logger logger = thrower.getLogger();

  static protected VpnCache vpnCache = null;

  /**
   * The main cache
   */
  Map cachedVpn = Collections.synchronizedMap(new HashMap());

  /**
   * The cached {@link VpnProviderNetwkDMO}, but into ordered lists.
   */
  Map orderedVpn = Collections.synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static VpnCache getInstance(BaseBLOBinder base) {
    if (vpnCache == null) {
      synchronized (VpnCache.class) {
        if (vpnCache == null) {
          VpnCache vpn = new VpnCache(base);

          vpn.loadCache();
          
          vpnCache = vpn;
        }
      }
    }
    return vpnCache;
  }

  void loadCache() {

    // empty the cache
    cachedVpn.clear();
    orderedVpn.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, VpnProviderNetwkDMO.vpnProviderIdFilter);

    DAOIterator i = null;
    try {
      i = getBase().vpnProviderNetwk().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        VpnProviderNetwkDMO vpn = (VpnProviderNetwkDMO) i.next();

        String providerId = vpn.getVpnProviderId();

        LinkedHashMap providers = (LinkedHashMap)cachedVpn.get(providerId);
        List orderedProviders = (List)orderedVpn.get(providerId);

        if (providers == null) {
          providers = new LinkedHashMap();
          cachedVpn.put(providerId, providers);

          orderedProviders = new ArrayList();
          orderedVpn.put(providerId, orderedProviders);
        }

        providers.put(vpn.getVpnNetworkPrefix(), vpn);

        // add to the ordered list
        int len = vpn.getVpnNetworkPrefix().length();

        // List is being ordered in reverse 
        for (int n = orderedProviders.size(); n >= 0; n--) {
          if (n == 0) {
            // reached the bottom of the list... insert here.
            orderedProviders.add(0, vpn);
          } else if (len > ((VpnProviderNetwkDMO) orderedProviders.get(n - 1)).getVpnNetworkPrefix()
              .length()) {

            orderedProviders.add(n, vpn);
            break;

          }
        }
      }
      
      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Returns a {@link VpnProviderNetwkDMO} for the specified provider id and prefix.
   * 
   * @param providerId
   * @param prefix
   * @return a {@link VpnProviderNetwkDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public VpnProviderNetwkDMO getProviderNetwork(String providerId, String prefix)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getProviderNetwork( providerId, prefix )");

    LinkedHashMap providers = (LinkedHashMap)cachedVpn.get(providerId);

    if (providers != null) {

      return (VpnProviderNetwkDMO) providers.get(prefix);

    }

    return null;
  }

  /**
   * Returns a list of network/masks for the specified provider.
   * 
   * @param providerId
   * 
   * @return A list of network details.
   * 
   * 
   */
  public List getListProvider(String providerId) {

    logger.debug("getListProvider( providerId )");

    return (List)(orderedVpn.get(providerId));

  }
}
