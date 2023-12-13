package com.eppixcomm.eppix.soa.sharedservices.blo;
import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.NcrCompressRuleDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class NcrCompressRuleCountDQO extends DBO implements Serializable {

  private NcrCompressRuleDMO ncrDMO;

  private Integer count;
  
  private static final int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING,
    FIELD_TYPE_STRING,
    FIELD_TYPE_INTEGER
  };

  private String ncrCode;
  private String ncrCompressCode;

 
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
    return null;
  }

 
  protected int[] fieldTypes() {
    return fieldTypes;
  }

 
  protected DAOArgs primaryKey() {
    return null;
  }

 
  protected void set(Object[] fields) {
    ncrCompressCode = (String) fields[0];
    ncrCode = (String) fields[1];
    count = (Integer) fields[2];
  }
  
  protected void deconstruct() {
    if (ncrCompressCode != null) {
      ncrDMO = new NcrCompressRuleDMO(ncrCompressCode, ncrCode);
    }
  }

  public NcrCompressRuleDMO getNcrDMO() {
    return ncrDMO;
  }

  public void setNcrDMO(NcrCompressRuleDMO ncrDMO) {
    this.ncrDMO = ncrDMO;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getNcrCode() {
    return ncrCode;
  }

  public void setNcrCode(String ncrCode) {
    this.ncrCode = ncrCode;
  }

  public String getNcrCompressCode() {
    return ncrCompressCode;
  }

  public void setNcrCompressCode(String ncrCompressCode) {
    this.ncrCompressCode = ncrCompressCode;
  }

}


