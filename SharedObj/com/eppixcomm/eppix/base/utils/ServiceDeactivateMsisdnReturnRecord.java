package com.eppixcomm.eppix.base.utils;

public class ServiceDeactivateMsisdnReturnRecord {

  private String dealerId;
  private boolean lastService;

  public ServiceDeactivateMsisdnReturnRecord(String dealerId,
      boolean lastService) {
    super();
    this.dealerId = dealerId;
    this.lastService = lastService;
  }

  public String getDealerId() {
    return dealerId;
  }

  public void setDealerId(String dealerId) {
    this.dealerId = dealerId;
  }

  public boolean getLastService() {
    return lastService;
  }

  public void setLastService(boolean lastService) {
    this.lastService = lastService;
  }

}