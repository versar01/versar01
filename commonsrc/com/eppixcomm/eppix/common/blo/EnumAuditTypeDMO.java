/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;

/**
 * @author $Author$
 * @version $Revision: 1.2 $
 * 
 * @since $jdk$
 */
public abstract class EnumAuditTypeDMO extends EnumeratedTypeDMO {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // recordId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // languageCode
    FIELD_TYPE_BOOLEAN | FIELD_ATTR_QUERYONLY, // isValidCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // displayCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // description
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // explanation
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // ownerEntityId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // outerEntityId
    FIELD_TYPE_BOOLEAN, // isAuditEnabled
    FIELD_TYPE_BOOLEAN, // isFieldAuditEnabled
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // availableFields1
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // availableFields2
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // availableFields3
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // availableFields4
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // availableFields5
    FIELD_TYPE_STRING, // auditFields1
    FIELD_TYPE_STRING, // auditFields2
    FIELD_TYPE_STRING, // auditFields3
    FIELD_TYPE_STRING, // auditFields4
    FIELD_TYPE_STRING, // auditFields5
    FIELD_TYPE_INTEGER // recordVersion
  };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
        
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  private String ownerEntityId;
  private String outerEntityId;
  private Boolean isAuditEnabled;
  private Boolean isFieldAuditEnabled;
  private String availableFields;
  private String auditFields;

  // Constructors //////////////////////////////////////////////////////////////

  public EnumAuditTypeDMO() {
  }

  protected EnumAuditTypeDMO(String entityId, String recordId) {
    this.entityId = entityId;
    this.recordId = recordId;
  }

  protected EnumAuditTypeDMO(EnumAuditTypeDMO enumAuditTypeDMO) {
    entityId = enumAuditTypeDMO.getEntityId();
    recordId = enumAuditTypeDMO.getRecordId();
    languageCode = enumAuditTypeDMO.getLanguageCode();
    isValidCode = enumAuditTypeDMO.getIsValidCode();
    displayCode = enumAuditTypeDMO.getDisplayCode();
    description = enumAuditTypeDMO.getDescription();
    explanation = enumAuditTypeDMO.getExplanation();
    ownerEntityId = enumAuditTypeDMO.getOwnerEntityId();
    outerEntityId = enumAuditTypeDMO.getOuterEntityId();
    isAuditEnabled = enumAuditTypeDMO.getIsAuditEnabled();
    isFieldAuditEnabled = enumAuditTypeDMO.getIsFieldAuditEnabled();
    availableFields = enumAuditTypeDMO.getAvailableFields();
    auditFields = enumAuditTypeDMO.getAuditFields();
    recordVersion = enumAuditTypeDMO.getRecordVersion();
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(recordId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected void set(Object[] fields) {
    int pos = 0;
    recordId = (String) fields[pos++];
    languageCode = (String) fields[pos++];
    isValidCode = (Boolean) fields[pos++];
    displayCode = (String) fields[pos++];
    description = (String) fields[pos++];
    explanation = (String) fields[pos++];
    ownerEntityId = (String) fields[pos++];
    outerEntityId = (String) fields[pos++];
    isAuditEnabled = (Boolean) fields[pos++];
    isFieldAuditEnabled = (Boolean) fields[pos++];
    pos = setAvailableFields(pos, fields);
    pos = setAuditFields(pos, fields);
    recordVersion = (Integer) fields[pos++];
  }

  protected int setAvailableFields(int pos, Object[] fields) {
    StringBuffer sb = new StringBuffer(1000);
    for (int i = 0; i < 5; ++i) {
      String str = (String) fields[pos++];
      if (str != null) {
        sb.append(str);
      }
    }
    availableFields = sb.toString();
    return pos;
  }

  protected int setAuditFields(int pos, Object[] fields) {
    StringBuffer sb = new StringBuffer(1000);
    sb.setLength(0);
    for (int i = 0; i < 5; ++i) {
      String str = (String) fields[pos++];
      if (str != null) {
        sb.append(str);
      }
    }
    auditFields = sb.toString();
    return pos;
  }

  // DBO method implementations ////////////////////////////////////////////////

  protected Object[] get() {
    return new Object[] {
      recordId,
      isAuditEnabled,
      isFieldAuditEnabled,
      getAuditField(0),
      getAuditField(1),
      getAuditField(2),
      getAuditField(3),
      getAuditField(4),
      recordVersion };
  }

  protected String getAuditField(int idx) {

    if (auditFields != null) {
      int beginIndex = idx * 200;
      int endIndex = beginIndex + 200;
      int length = auditFields.length();
      if (beginIndex < length) {
        if (endIndex <= length) {
          return auditFields.substring(beginIndex, endIndex);
        }
        return auditFields.substring(beginIndex);
      }
    }
    return null;
  }

  // Get methods ///////////////////////////////////////////////////////////////

  protected String getOwnerEntityId() {
    return ownerEntityId;
  }

  protected String getOuterEntityId() {
    return outerEntityId;
  }

  public Boolean getIsAuditEnabled() {
    return isAuditEnabled;
  }

  public Boolean getIsFieldAuditEnabled() {
    return isFieldAuditEnabled;
  }

  public String getAvailableFields() {
    return availableFields;
  }

  public String getAuditFields() {
    return auditFields;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation,
    Boolean isAuditEnabled,
    Boolean isFieldAuditEnabled,
    String availableFields,
    String auditFields,
    Integer recordVersion) {

    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
    this.isAuditEnabled = isAuditEnabled;
    this.isFieldAuditEnabled = isFieldAuditEnabled;
    this.availableFields = availableFields;
    this.auditFields = auditFields;
    this.recordVersion = recordVersion;
  }

  protected void setOwnerEntityId(String ownerEntityId) {
    this.ownerEntityId = ownerEntityId;
  }

  protected void setOuterEntityId(String outerEntityId) {
    this.outerEntityId = outerEntityId;
  }

  public void setIsAuditEnabled(Boolean isAuditEnabled) {
    this.isAuditEnabled = isAuditEnabled;
  }

  public void setIsFieldAuditEnabled(Boolean isFieldAuditEnabled) {
    this.isFieldAuditEnabled = isFieldAuditEnabled;
  }

  public void setAvailableFields(String availableFields) {
    this.availableFields = availableFields;
  }

  public void setAuditFields(String auditFields) {
    this.auditFields = auditFields;
  }
}