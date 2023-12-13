package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DSO;
import com.eppixcomm.eppix.common.util.DateTime;

public class StatusDSO extends DSO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private int batchRunNum;
  
  private String BatchType;

  private String batchExtra;

  private String batchName;

  private int quantityTotal;

  private int quantityProcessed;

  private DateTime startTime;

  public int getQuantityProcessed() {
    return quantityProcessed;
  }

  public void setQuantityProcessed(int quantityProcessed) {
    this.quantityProcessed = quantityProcessed;
  }

  public int getQuantityTotal() {
    return quantityTotal;
  }

  public void setQuantityTotal(int quantityTotal) {
    this.quantityTotal = quantityTotal;
  }

  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }

  public String getBatchType() {
    return BatchType;
  }

  public void setBatchType(String batchType) {
    BatchType = batchType;
  }

  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public String getBatchExtra() {
    return batchExtra;
  }

  public void setBatchExtra(String batchExtra) {
    this.batchExtra = batchExtra;
  }

  public int getBatchRunNum() {
    return batchRunNum;
  }

  public void setBatchRunNum(int batchRunNum) {
    this.batchRunNum = batchRunNum;
  }

}
