package com.eppixcomm.eppix.base.blo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * TODO This class is incomplete need to be finalised
 * 
 *
 */
public class DefaultQueryRegistry implements QueryRegistry {

  private static DefaultQueryRegistry instance = new DefaultQueryRegistry();

  protected HashMap statusProviders = new HashMap();

  private DefaultQueryRegistry() {
  }

  public static DefaultQueryRegistry getInstance() {
    return instance;
  }

  public synchronized void addStatusProvider(StatusProvider provider,
      String prov) {

//    List<StatusProvider> providers = statusProviders.get(prov);
//    if (providers == null) {
//      providers = new ArrayList<StatusProvider>();
//      statusProviders.put(prov, providers);
//    }
//    providers.add(provider);
  }

  public synchronized void removeStatusProvider(StatusProvider provider,
      String prov) {

//    List providers = statusProviders.get(prov);
//    if (providers == null) {
//      return;
//    }
//    providers.remove(provider);
//    if (providers.isEmpty()) {
//      statusProviders.remove(prov);
//    }
  }

  public StatusProvider[] getStatusProviders(String prov) {
    // TODO Auto-generated method stub
    return null;
  }

//  public List<StatusDSO> statusList(String prov) {
	public List statusList(String prov) {
		

    List list = new ArrayList();
    List providers = null;

    if (prov == null) {
      if (statusProviders.size() > 0) {
        providers = new ArrayList();
        
//        for (List<StatusProvider> provs : statusProviders.values()) {
//          providers.addAll(provs);
//        }

        
      }
    } else {
//      providers = statusProviders.get(prov);
    }

    if (providers != null) {
//      for (StatusProvider p : providers) {
//        list.add(p.getStatus());
//      }
    }

    return list;
  }

  public void stopRun(String prov, boolean immediate) {
//    List<StatusProvider> providers = null;
//    if (prov != null) {
//      providers = statusProviders.get(prov);
//    }
//
//    if (providers != null) {
//      for (StatusProvider p : providers) {
//        p.stopRun(immediate);
//      }
//    }
  }

}
