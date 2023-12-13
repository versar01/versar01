package com.eppixcomm.eppix.base.blo;

import java.util.List;

public interface QueryRegistry {

  public void addStatusProvider(StatusProvider statusSupplier,
      String prov);

  public void removeStatusProvider(StatusProvider provider,
      String prov);
  
  public StatusProvider[] getStatusProviders(String prov);
  
  public List statusList(String prov);
  
  public void stopRun(String prov, boolean immediate);
  
}
