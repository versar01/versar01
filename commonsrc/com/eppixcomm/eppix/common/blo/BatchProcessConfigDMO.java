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

/**
 * Generic Batch Process Configuration DMO class
 *
 * @author $Author: adonohoe $
 * @version $Revision: 1.1 $
 * @since $jdk$
 */
public class BatchProcessConfigDMO extends DBO implements Serializable {

  private Integer configId;
  private Integer transactionSize;
  private String errorLogDirectory;
  private String errorLogFilePrefix;
  private String userId;
  private DateTime datetimeCreated;
  private Boolean currentConfig;
      
  private static int[] fieldTypes =
    new int[] {
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_DATETIME,
      FIELD_TYPE_BOOLEAN };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
        
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  // DMO method implementations ////////////////////////////////////////////////
  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return null;
  }

  protected void versionNumber(Integer versionNumber) {
  }

  // DMO method implementations ////////////////////////////////////////////////
  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(this.configId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }
  
  protected Object[] get() {
    return new Object[] {
      this.configId,
      this.transactionSize,
      this.errorLogDirectory,
      this.errorLogFilePrefix,
      this.userId,
      this.datetimeCreated,
      this.currentConfig
    };
  }

  protected void set(Object[] fields) {
    int counter = 0;
    this.configId = (Integer)fields[counter++];
    this.transactionSize = (Integer)fields[counter++];
    this.errorLogDirectory = (String)fields[counter++];
    this.errorLogFilePrefix = (String)fields[counter++];
    this.userId = (String)fields[counter++];
    this.datetimeCreated = (DateTime)fields[counter++];
    this.currentConfig = (Boolean)fields[counter++];
  }

  // Constructors //////////////////////////////////////////////////////////////
  public BatchProcessConfigDMO() {}

  public BatchProcessConfigDMO(
    Integer configId,
    Integer transactionSize,
    String errorLogDirectory,
    String errorLogFilePrefix,
    String userId,
    DateTime datetimeCreated,
    Boolean currentConfig) {
    this.configId = configId;
    this.transactionSize = transactionSize;
    this.errorLogDirectory = errorLogDirectory;
    this.errorLogFilePrefix = errorLogFilePrefix;
    this.userId = userId;
    this.datetimeCreated = datetimeCreated;
    this.currentConfig = currentConfig;
  }

  // Get methods ///////////////////////////////////////////////////////////////
  public Integer getConfigId() {
    return configId;
  }
  
  public Integer getTransactionSize() {
    return transactionSize;
  }
  
  public String getErrorLogDirectory() {
    return errorLogDirectory;
  }

  public String getErrorLogFilePrefix() {
    return errorLogFilePrefix;
  }
  
  public String getUserId() {
    return userId;
  }
  
  public DateTime getDatetimeCreated() {
    return datetimeCreated;
  }
  
  public Boolean getCurrentConfig() {
    return currentConfig;
  }

  // Set methods ///////////////////////////////////////////////////////////////
  
  public void set(
    Integer configId,
    Integer transactionSize,
    String errorLogDirectory,
    String errorLogFilePrefix,
    String userId,
    DateTime datetimeCreated,
    Boolean currentConfig) {
    this.configId = configId;
    this.transactionSize = transactionSize;
    this.errorLogDirectory = errorLogDirectory;
    this.errorLogFilePrefix = errorLogFilePrefix;
    this.userId = userId;
    this.datetimeCreated = datetimeCreated;
    this.currentConfig = currentConfig;
  }

  public void setConfigId(Integer aConfigId) {
    this.configId = aConfigId;
  }
  
  public void setTransactionSize(Integer aTransactionSize) {
    this.transactionSize = aTransactionSize;
  }
  
  public void setErrorLogDirectory(String anErrorLogDirectory) {
    this.errorLogDirectory = anErrorLogDirectory;
  }

  public void setErrorLogFilePrefix(String anErrorLogFilePrefix) {
    this.errorLogFilePrefix = anErrorLogFilePrefix;
  }
  
  public void setUserId(String aUserId) {
    this.userId = aUserId;
  }
  
  public void setDatetimeCreated(DateTime aDatetimeCreated) {
    this.datetimeCreated = aDatetimeCreated;
  }
  
  public void setCurrentConfig(Boolean aCurrentConfig) {
    this.currentConfig = aCurrentConfig;
  }

}