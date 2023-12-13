/* ====================================================================== *
 * Copyright 2002 CMG Wireless Data Solutions (UK) Ltd.                   *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

import java.io.Serializable;

import java.util.*;

/**
 * Generic Batch Process Run Controller class
 *
 * @author $Author: adonohoe $
 * @version $Revision: 1.1 $
 * @since $jdk$
 */
public class BatchProcessControlDMO
  extends DBO
  implements Serializable {
  
  protected String runId;
  protected Integer batchType;
  protected DateTime startRunDatetime;
  protected DateTime endRunDatetime;
  protected Integer runStatusId;
  protected Long qtySucceeded;
  protected Long qtyRejected;
  protected Long qtyToProcess;
  protected String errorText;
  protected String userId;
  protected Integer configId;
  protected Integer recordVersion;
  protected BatchProcessConfigDMO batchProcessConfigDMO;
  protected List batchProcessStats;

// Field Types

  private static int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_DATETIME,
      FIELD_TYPE_DATETIME,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_LONG,
      FIELD_TYPE_LONG,
      FIELD_TYPE_LONG,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_INTEGER };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
        
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  // DBO method implementations ///////////////////////////////////
  protected void generatedKey( Integer key) {
//  	runId = key;
  }
  
  protected Integer versionNumber() {
    return this.recordVersion;
  }
  
  protected void versionNumber(Integer versionNumber) {
    this.recordVersion = versionNumber;
  }
  
  // DMO method implementations ///////////////////////////////////
  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(this.runId);
  }
  
  protected int[] fieldTypes() {
    return fieldTypes;
  }
  
  protected Object[] get() {
    return new Object[] {
      this.runId,
      this.batchType,
      this.startRunDatetime,
      this.endRunDatetime,
      this.runStatusId,
      this.qtyToProcess,
      this.qtySucceeded,
      this.qtyRejected,
      this.errorText,
      this.userId,
      this.configId,
      this.recordVersion };
  }
  
  protected void set( Object[] fields ) {
    int counter = 0;
    this.runId = (String)fields[counter++];
    this.batchType = (Integer)fields[counter++];
    this.startRunDatetime = (DateTime)fields[counter++];
    this.endRunDatetime = (DateTime)fields[counter++];
    this.runStatusId = (Integer)fields[counter++];
    this.qtyToProcess = (Long)fields[counter++];
    this.qtySucceeded = (Long)fields[counter++];
    this.qtyRejected = (Long)fields[counter++];
    this.errorText = (String)fields[counter++];
    this.userId = (String)fields[counter++];
    this.configId = (Integer)fields[counter++];
    this.recordVersion = (Integer)fields[counter++];
  }
  
  // Constructors /////////////////////////////////////////////////
  public BatchProcessControlDMO() {
  }
  
  public BatchProcessControlDMO(
    String runId,
    Integer batchType,
    DateTime startRunDatetime,
    DateTime endRunDatetime,
    Integer runStatusId,
    Long qtyToProcess,
    Long qtySucceeded,
    Long qtyRejected,
    String errorText,
    String userId,
    Integer configId,
    Integer recordVersion) {
    this.runId = runId;
    this.batchType = batchType;
    this.startRunDatetime = startRunDatetime;
    this.endRunDatetime = endRunDatetime;
    this.runStatusId = runStatusId;
    this.qtyToProcess = qtyToProcess;
    this.qtySucceeded = qtySucceeded;
    this.qtyRejected = qtyRejected;
    this.errorText = errorText;
    this.userId = userId;
    this.configId = configId;
    this.recordVersion = recordVersion;
  }
  
  // Get methods //////////////////////////////////////////////////
  public String getRunId() {
    return runId;
  }
  
  public Integer getBatchType() {
    return batchType;
  }
  
  public Integer getConfigId() {
    return configId;
  }
  
  public String getUserId() {
    return userId;
  }

  public DateTime getStartRunDatetime() {
    return startRunDatetime;
  }

  public Integer getRunStatusId() {
    return runStatusId;
  }

  public DateTime getEndRunDatetime() {
    return endRunDatetime;
  }

  public Long getQtyToProcess() {
    return qtyToProcess;
  } 
  
  public Long getQtySucceeded() {
    return qtySucceeded;
  }

  public Long getQtyRejected() {
    return qtyRejected;
  }

  public String getErrorText() {
    return errorText;
  }
  
  public Integer getRecordVersion() {
    return recordVersion;
  }
  
  public BatchProcessConfigDMO getBatchProcessConfigDMO() {
    return batchProcessConfigDMO;
  }
  
  public List getBatchProcessStats() {
    return batchProcessStats;
  }
  
  // Set methods //////////////////////////////////////////////
  public void set(
      String runId,
      Integer batchType,
      DateTime startRunDatetime,
      DateTime endRunDatetime,
      Integer runStatusId,
      Long qtyToProcess,
      Long qtySucceeded,
      Long qtyRejected,
      String errorText,
      String userId,
      Integer configId,
      Integer recordVersion) {
    this.runId = runId;
    this.batchType = batchType;
    this.startRunDatetime = startRunDatetime;
    this.endRunDatetime = endRunDatetime;
    this.runStatusId = runStatusId;
    this.qtyToProcess = qtyToProcess;
    this.qtySucceeded = qtySucceeded;
    this.qtyRejected = qtyRejected;
    this.errorText = errorText;
    this.userId = userId;
    this.configId = configId;
    this.recordVersion = recordVersion;
  }

  public void setRunId(String runId){
    this.runId = runId;
  }
  
  public void setBatchType(Integer batchType){
    this.batchType = batchType;
  }
  
    public void setConfigId(Integer aConfigId) {
    this.configId = aConfigId;
  }
  
  public void setUserId(String aUserId) {
    this.userId = aUserId;
  }

  public void setStartRunDatetime(DateTime aStartRunDatetime) {
    this.startRunDatetime = aStartRunDatetime;
  }

  public void setEndRunDatetime(DateTime anEndRunDatetime) {
    this.endRunDatetime = anEndRunDatetime;
  }

  public void setQtyToProcess(Long aQtyToProcess) {
    this.qtyToProcess = aQtyToProcess;
  }
  
  public void setQtySucceeded(Long aQtySucceeded) {
    this.qtySucceeded = aQtySucceeded;
  }

  public void setQtyRejected(Long aQtyRejected) {
    this.qtyRejected = aQtyRejected;
  }

  public void setErrorText(String anErrorText) {
    this.errorText = anErrorText;
  }

  public void setRecordVersion(Integer aRecordVersion) {
    this.recordVersion = aRecordVersion;
  }
  
  public void setBatchProcessConfigDMO(BatchProcessConfigDMO aBatchProcessConfigDMO) {
    this.batchProcessConfigDMO = aBatchProcessConfigDMO;
  }
  
  public void setBatchProcessStats(List aBatchProcessStats) {
    this.batchProcessStats = aBatchProcessStats;
  }


  
  
}
