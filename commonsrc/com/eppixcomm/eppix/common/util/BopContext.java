/* ====================================================================== *
 * Copyright 2002 CMG Wireless Data Solutions (UK) Ltd.                   *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.util;

import java.io.Serializable;
import java.util.HashMap;

import com.eppixcomm.eppix.base.blo.StatusDSO;
import com.eppixcomm.eppix.base.blo.StatusProvider;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * @author $Author$
 * @version $Revision: 1.1 $
 * @since $jdk$
 */
public class BopContext implements Serializable, StatusProvider {

  /** Batch Run Identification */
  private int batchRunNum;

  /** Batch Type */
  private String batchType;

  /** Batch Id */
  private String batchId;

  private String cycle;

  private boolean continuous = false;

  /** Number of rows to process in each transaction */
  private int transactionSize;

  /** Number of rows to process in each chunk - slightly different to transSize */
  private int statRefresh;

  /** Directory in which the Log File should be created. (Use / not \ in path) */
  private String errorLogDirectory;

  /** Holds error text if the whole batch dies */
  private String errorText;

  /** PLog Files name */
  private String errorLogFile;

  private int qtyTotal;

  /** Quantity of Succeeded Batch Rows */
  private int qtySucceeded;

  /** Quantity of Failed Batch Rows */
  private int qtyRejected;

  /** ID of last record processed in data table*/
  private String lastId;

  /** locale */
  private EppixLocale locale;

  /** Stores the status of the run between the Beans */
  private boolean stillRunning;

  /** Session Context - Used to pass the login details over the Message Driven Bean gap.*/
  private String sessionContextLoginName;

  /** Start DateTime - Ie Holds the time a chunk was started if this is used as 
   * a chunk context, or the time a batch was started if this is used as the overall
   * batch context */
  private DateTime startTime;

  /** Start DateTime - Ie Holds the time a chunk was started if this is used as 
   * a chunk context, or the time a batch was started if this is used as the overall
   * batch context */
  private DateTime endTime;

  private HashMap miscData;
  
  private boolean shouldStop = false;
  private boolean stopImmediately = false;

  // Get methods ///////////////////////////////////////////////////////////////

  public int getBatchRunNum() {
    return batchRunNum;
  }

  public int getTransactionSize() {
    return transactionSize;
  }

  public int getStatRefresh() {
    return statRefresh;
  }

  public String getErrorLogDirectory() {
    return errorLogDirectory;
  }

  public String getErrorLogFile() {
    return errorLogFile;
  }

  public String getErrorText() {
    return errorText;
  }

  public int getQtySucceeded() {
    return qtySucceeded;
  }

  public int getQtyRejected() {
    return qtyRejected;
  }

  public String getLastId() {
    return lastId;
  }

  public EppixLocale getEppixLocale() {
    return locale;
  }

  public boolean getStillRunning() {
    return stillRunning;
  }

  public String getSessionContextLoginName() {
    return sessionContextLoginName;
  }

  public DateTime getStartTime() {
    return startTime;
  }

  public DateTime getEndTime() {
    return endTime;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void setBatchRunNum(int batchRunNum) {
    this.batchRunNum = batchRunNum;
  }

  public void setTransactionSize(int aTransactionSize) {
    this.transactionSize = aTransactionSize;
  }

  public void setStatRefresh(int aStatRefresh) {
    this.statRefresh = aStatRefresh;
  }

  public void setErrorLogDirectory(String anErrorLogDirectory) {
    this.errorLogDirectory = anErrorLogDirectory;
  }

  public void setErrorLogFile(String errorLogFile) {
    this.errorLogFile = errorLogFile;
  }

  public void setErrorText(String anErrorText) {
    this.errorText = anErrorText;
  }

  public void setQtySucceeded(int aQtySucceeded) {
    this.qtySucceeded = aQtySucceeded;
  }

  public void setQtyRejected(int aQtyRejected) {
    this.qtyRejected = aQtyRejected;
  }

  public void setLastId(String string) {
    this.lastId = string;
  }

  public void setEppixLocale(EppixLocale locale) {
    this.locale = locale;
  }

  public void setStillRunning(boolean stillRunning) {
    this.stillRunning = stillRunning;
  }

  public void setSessionContextLoginName(String sessionContextLoginName) {
    this.sessionContextLoginName = sessionContextLoginName;
  }

  public void setStartTime(DateTime aStartTime) {
    this.startTime = aStartTime;
  }

  public void setEndTime(DateTime aEndTime) {
    this.endTime = aEndTime;
  }

  public void incrementSucceeded() {
    this.qtySucceeded++;
  }

  public void incrementRejected() {
    this.qtyRejected++;
  }

  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public String getBatchType() {
    return batchType;
  }

  public void setBatchType(String batchType) {
    this.batchType = batchType;
  }

  public String getCycle() {
    return cycle;
  }

  public void setCycle(String cycle) {
    this.cycle = cycle;
  }

  public boolean isContinuous() {
    return continuous;
  }

  public void setContinuous(boolean continuous) {
    this.continuous = continuous;
  }

  public Object getData(String key) {
    if (miscData != null) {
      return miscData.get(key);
    }
    return null;
  }

  public void putData(String key, Object value) {
    if (miscData == null) {
      miscData = new HashMap(10);
    }
    miscData.put(key, value);

  }

  public void removeData(String key) {
    if (miscData != null) {
      miscData.remove(key);
    }
  }

  public StatusDSO getStatus() {
    StatusDSO status = new StatusDSO();
    status.setBatchRunNum(batchRunNum);
    status.setBatchName(batchId);
    status.setBatchType(getBatchType());
    status.setQuantityTotal(qtyTotal);
    status.setQuantityProcessed(qtySucceeded);
    status.setStartTime(getStartTime());
    status.setBatchExtra(cycle);

    return status;
  }

  public int getQtyTotal() {
    return qtyTotal;
  }

  public void setQtyTotal(int qtyTotal) {
    this.qtyTotal = qtyTotal;
  }

  public void stopRun(boolean immediate) {
    shouldStop = true;
    stopImmediately = immediate;
  }

  public boolean isShouldStop() {
    return shouldStop;
  }

  public void setShouldStop(boolean shouldStop) {
    this.shouldStop = shouldStop;
  }

  public boolean isStopImmediately() {
    return stopImmediately;
  }

  public void setStopImmediately(boolean stopImmediately) {
    this.stopImmediately = stopImmediately;
  }

}