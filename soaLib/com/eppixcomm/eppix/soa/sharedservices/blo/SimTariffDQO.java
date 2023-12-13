package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SimTariffDQO extends DBO implements Serializable {
  private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
      FIELD_TYPE_STRING };

  private String simNo;
  private String internTariff;

  private static final int internTariffSize = 3; // field size
  private static final int simNoSize = 14; // field size

  protected final int[] fieldSizes = new int[] { internTariffSize, simNoSize };

  public SimTariffDQO() {
  }

 
  protected void generatedKey(Integer arg0) {
  }

 
  protected Object[] get() {
    return null;
  }

 
  protected Integer versionNumber() {
    return null;
  }

 
  protected void versionNumber(Integer arg0) {

  }

 
  protected int[] fieldSizes() {
    return fieldSizes;
  }

 
  protected int[] fieldTypes() {
    return fieldTypes;
  }

 
  protected DAOArgs primaryKey() {
    return null;
  }

 
  protected void set(Object[] fields) {
    setInternTariff((String) fields[0]);
    setSimNo((String) fields[1]);
  }

  public String getSimNo() {
    return simNo;
  }

  public void setSimNo(String simNo) {
    this.simNo = simNo;
  }

  public String getInternTariff() {
    return internTariff;
  }

  public void setInternTariff(String internTariff) {
    this.internTariff = internTariff;
  }

}


