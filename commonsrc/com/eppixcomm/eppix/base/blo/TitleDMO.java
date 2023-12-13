/*******************************************************************************
 * ====================================================================== (c)
 * Copyright Eppixcomm Tech Ltd. * All Rights Reserved * *
 * Legal Information *
 * ======================================================================
 */
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.blo.DescriptionDMO;
import com.eppixcomm.eppix.common.blo.HasDescriptions;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class TitleDMO extends DBO implements HasDescriptions, Serializable {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // titleId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // languageCode
    FIELD_TYPE_BOOLEAN | FIELD_ATTR_QUERYONLY, // isValidCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // displayCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // description
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // explanation
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

  private String titleId; // generatedKey
  private String languageCode;
  private Boolean isValidCode;
  private String displayCode;
  private String description;
  private String explanation;
  private Boolean isUsed;
  private Integer recordVersion;
  private List descriptions;

  // Constructors //////////////////////////////////////////////////////////////

  public TitleDMO() {
  }

  public TitleDMO(String titleId, String displayCode) {

    this.titleId = titleId;
    this.displayCode = displayCode;
  }

  public TitleDMO(
    String titleId,
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation,
    Boolean isUsed,
    Integer recordVersion) {
    
    this.titleId = titleId;
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
    this.isUsed = isUsed;
    this.recordVersion = recordVersion;
  }

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
//    this.titleId = key;
  }

  protected Integer versionNumber() {
    return this.recordVersion;
  }

  protected void versionNumber(Integer versionNumber) {
    this.recordVersion = versionNumber;
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(this.titleId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {
    return new Object[] {
      this.titleId,
      this.recordVersion };
  }

  protected void set(Object[] fields) {
    this.titleId = (String) fields[0];
    this.languageCode = (String) fields[1];
    this.isValidCode = (Boolean) fields[2];
    this.displayCode = (String) fields[3];
    this.description = (String) fields[4];
    this.explanation = (String) fields[5];
    this.isUsed = null;
    this.recordVersion = (Integer) fields[6];
  }

  // Get methods ///////////////////////////////////////////////////////////////

  public String getRecordId() {
    return titleId;
  }

  public String getTitleId() {
    return titleId;
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

  public Boolean getIsUsed() {
    return isUsed;
  }

  public Integer getRecordVersion() {
    return recordVersion;
  }

  public List getDescriptions() {
    return descriptions;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(
    String titleId,
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation,
    Boolean isUsed,
    Integer recordVersion) {
    
    this.titleId = titleId;
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
    this.isUsed = isUsed;
    this.recordVersion = recordVersion;
  }

  public void setTitleId(String titleId) {
    this.titleId = titleId;
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

  public void setIsUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }

  public void setRecordVersion(Integer recordVersion) {
    this.recordVersion = recordVersion;
  }

  public void setDescriptions(List descriptions) {
    this.descriptions = descriptions;
  }

  public void addDescription(DescriptionDMO descriptionDMO) {
    if (descriptions == null) {
      descriptions = new ArrayList();
    }
    descriptions.add(descriptionDMO);
  }
}