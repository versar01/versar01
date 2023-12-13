package com.eppixcomm.eppix.common.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AuditFieldDMO extends DBO implements Serializable {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // auditId
    FIELD_TYPE_STRING, // fieldId
    FIELD_TYPE_STRING // newValue
  };

  private String auditId;
  private String fieldId;
  private String fieldName;
  private String newValue;

  // Constructors //////////////////////////////////////////////////////////////

  public AuditFieldDMO() {
  }

  public AuditFieldDMO(String fieldId, String fieldName, String newValue) {
    this.fieldId = fieldId;
    this.fieldName = fieldName;
    this.newValue = newValue;
  }
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
        
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return null;
  }

  protected void versionNumber(Integer versionNumber) {
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(2).arg(auditId).arg(fieldId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {
    return new Object[] {
      auditId,
      fieldId,
      newValue };
  }

  protected void set(Object[] fields) {
    auditId = (String) fields[0];
    fieldId = (String) fields[1];
    newValue = (String) fields[2];
  }

  // Get methods ///////////////////////////////////////////////////////////////

  String getAuditId() {
    return auditId;
  }

  public String getFieldId() {
    return fieldId;
  }

  public String getFieldName() {
    return fieldName;
  }

  public String getNewValue() {
    return newValue;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(String fieldId, String fieldName, String newValue) {
    this.fieldId = fieldId;
    this.fieldName = fieldName;
    this.newValue = newValue;
  }

  void setAuditId(String auditId) {
    this.auditId = auditId;
  }
  
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }
}