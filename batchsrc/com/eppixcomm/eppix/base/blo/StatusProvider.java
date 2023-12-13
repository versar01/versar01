package com.eppixcomm.eppix.base.blo;

public interface StatusProvider {

  public StatusDSO getStatus();
  
  public void stopRun(boolean immediate);
  
}
