package com.eppixcomm.eppix.base.utils;

import java.util.ArrayList;

public class ServiceDeactivateMsisdnRecord {

  private Integer subscriber_id;
  private String msisdn_no;
  private String service_code;
  private String add_charges[] = new String[6];
  private String multi_charge;
  private String prorata;

  public ServiceDeactivateMsisdnRecord(Integer subscriber_id, String msisdn_no,
      String service_code, String deact_charge, String add_charge1,
      String add_charge2, String add_charge3, String add_charge4,
      String add_charge5, String multi_charge, String prorata) {
    super();
    this.subscriber_id = subscriber_id;
    this.msisdn_no = msisdn_no;
    this.service_code = service_code;
    setCharge(0, deact_charge);
    setCharge(1, add_charge1);
    setCharge(2, add_charge2);
    setCharge(3, add_charge3);
    setCharge(4, add_charge4);
    setCharge(5, add_charge5);
    this.multi_charge = multi_charge;
    this.prorata = prorata;
  }

  public void setCharge(int index, String add_charge) {
    if (add_charge != null && add_charge.length() > 0) {
      add_charges[index] = add_charge;
    }
  }

  public String[] getCharges() {
    return add_charges;
  }

  public Integer getSubscriber_id() {
    return subscriber_id;
  }

  public void setSubscriber_id(Integer subscriber_id) {
    this.subscriber_id = subscriber_id;
  }

  public String getMsisdn_no() {
    return msisdn_no;
  }

  public void setMsisdn_no(String msisdn_no) {
    this.msisdn_no = msisdn_no;
  }

  public String getService_code() {
    return service_code;
  }

  public void setService_code(String service_code) {
    this.service_code = service_code;
  }

  public String getMulti_charge() {
    return multi_charge;
  }

  public void setMulti_charge(String multi_charge) {
    this.multi_charge = multi_charge;
  }

  public String getProrata() {
    return prorata;
  }

  public void setProrata(String prorata) {
    this.prorata = prorata;
  }

}