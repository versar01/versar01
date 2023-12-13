/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

import java.io.Serializable;

public class DescriptionDMO extends DBO implements Serializable {

  private static int[] fieldTypes = new int[] { FIELD_TYPE_STRING, // recordId
    FIELD_TYPE_STRING, // entityId
    FIELD_TYPE_STRING, // languageCode
    FIELD_TYPE_BOOLEAN | FIELD_ATTR_QUERYONLY, // isValidCode
    FIELD_TYPE_STRING, // displayCode
    FIELD_TYPE_STRING, // description
    FIELD_TYPE_STRING, // explanation
  };
  private String recordId;
  private String entityId;
  private String languageCode;
  private Boolean isValidCode;
  private String displayCode;
  private String description;
  private String explanation;

  // Constructors //////////////////////////////////////////////////////////////
  public DescriptionDMO() {
  }
  
  DescriptionDMO(
    String entityId,
    HasDescriptions hasDescriptions) {
    this.entityId = entityId;
    this.recordId = hasDescriptions.getRecordId();
    this.languageCode = hasDescriptions.getLanguageCode();
    this.displayCode = hasDescriptions.getDisplayCode();
    this.description = hasDescriptions.getDescription();
    this.explanation = hasDescriptions.getExplanation();
  }

  DescriptionDMO(
    String recordId,
    String entityId,
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation) {
    this.recordId = recordId;
    this.entityId = entityId;
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
  }

  public DescriptionDMO(
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation) {
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
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
    return new DAOArgs(3).arg(this.recordId).arg(this.entityId).arg(
      this.languageCode);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
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

  protected Object[] get() {
    return new Object[] {
      this.recordId,
      this.entityId,
      this.languageCode,
      this.displayCode,
      this.description,
      this.explanation,
      };
  }

  protected void set(Object[] fields) {
    this.recordId = (String) fields[0];
    this.entityId = (String) fields[1];
    this.languageCode = (String) fields[2];
    this.isValidCode = (Boolean) fields[3];
    this.displayCode = (String) fields[4];
    this.description = (String) fields[5];
    this.explanation = (String) fields[6];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  protected String getRecordId() {
    return recordId;
  }

  protected String getEntityId() {
    return entityId;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public Boolean getIsValidCode() {
    return isValidCode;
  }

  public String getDisplayCode() {
    return displayCode;
  }

  public String getDescription() {
    return description;
  }

  public String getExplanation() {
    return explanation;
  }

  // Set methods ///////////////////////////////////////////////////////////////
  protected void set(
    String recordId,
    String entityId,
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation) {
    this.recordId = recordId;
    this.entityId = entityId;
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
  }

  public void set(
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation) {
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
  }

  protected void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  protected void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public void setIsValidCode(Boolean isValidCode) {
    this.isValidCode = isValidCode;
  }

  public void setDisplayCode(String displayCode) {
    this.displayCode = displayCode;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }
}