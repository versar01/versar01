package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.NgsNetGroupServDMO;
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
public class NgsCache extends Cache {

  protected NgsCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(NgsCache.class);

  private Logger logger = thrower.getLogger();

  static protected NgsCache ngsCache = null;

  /**
   * Mapped cache of {@link NgsNetGroupServDMO}
   */
  Map cachedNgs = Collections
      .synchronizedMap(new HashMap());

  /**
   * Main cache of {@link NgsNetGroupServDMO}
   */
  Map fullCache = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static NgsCache getInstance(BaseBLOBinder base) {

    if (ngsCache == null) {
      synchronized (NgsCache.class) {
        if (ngsCache == null) {
          NgsCache ngs = new NgsCache(base);

          ngs.loadCache();
          
          ngsCache = ngs;
        }
      }
    }
    return ngsCache;

  }

  void loadCache() {

    // empty the cache
    cachedNgs.clear();
    fullCache.clear();

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.ANY, NgsNetGroupServDMO.ngsCodeFilter);
    filter.add(FilterOp.ORDERBYASC, NgsNetGroupServDMO.ngsSequenceFilter);

    DAOIterator i = null;
    try {
      i = getBase().ngsNetGroupServ().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        NgsNetGroupServDMO ngs = (NgsNetGroupServDMO) i.next();

        String ngsCode = ngs.getNgsCode();
        String ngsNetwork = ngs.getNgsNetwork();

        // add to the "full" cache list
        fullCache.put(ngsCode + ngsNetwork + ngs.getNgsNetServCode()
            + ngs.getNgsSequence(), ngs);

        // first find one for this code
        HashMap codes = (HashMap)cachedNgs.get(ngsCode);

        // add new hashmap if one doesn't already exist.
        if (codes == null) {

          codes = new HashMap();
          cachedNgs.put(ngsCode, codes);

        }

        List networks = (List)codes.get(ngsNetwork);

        if (networks == null) {

          networks = new ArrayList();
          codes.put(ngsNetwork, networks);

        }

        networks.add(ngs);

      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
    }

  }

  /**
   * Gets an {@link NgsNetGroupServDMO} for the specified parameters.
   * 
   * @param code
   * @param network
   * @param service
   * @param sequence
   * @return an {@link NgsNetGroupServDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public NgsNetGroupServDMO getNetworkGroupServ(String code, String network,
      String service, short sequence) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getNetworkGroupServ( code, network, service, sequence )");

    return (NgsNetGroupServDMO)fullCache.get(code + network + service + sequence);

  }

  /**
   * Retrieves the FIRST network/service code entry.
   * 
   * @param code
   * @param network
   * @return a {@link NgsNetGroupServDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public NgsNetGroupServDMO getNetworkService(String code, String network)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getNetworkService( code, network )");

    NgsNetGroupServDMO ngs = null;

    List list = getList(code, network);

    if (list != null) {

      ngs = (NgsNetGroupServDMO) list.get(0);

    }

    return ngs;
  }

  /**
   * Returns a list of NGS objects based on code and network.
   * 
   * @param code
   * @param network
   * @return a list of {@link NgsNetGroupServDMO}
   * 
   */
  public List getList(String code, String network) {

    logger.debug("getList( code, network )");

    List list = null;

    // get the code hashmap
    HashMap codes = (HashMap)cachedNgs.get(code);

    if (codes != null) {

      // get the network list
      list = (List)codes.get(network);

    }

    return list;
  }

}
