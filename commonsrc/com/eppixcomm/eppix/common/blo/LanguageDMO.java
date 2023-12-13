/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.blo.HasDescriptions;
import com.eppixcomm.eppix.common.blo.DescriptionDMO;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $Author: nhollingsworth $
 * @version $Revision: 1.5 $
 */
public class LanguageDMO extends DBO implements HasDescriptions, Serializable {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // languageId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // languageCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // description
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // explanation
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // nullDisplayCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // nullDescription
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // nullExplanation
    FIELD_TYPE_BOOLEAN, // isSystemDefault
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

  private String languageId;
  private String languageCode;
  private String description;
  private String explanation;
  private Boolean isUsed;
  private String nullDisplayCode;
  private String nullDescription;
  private String nullExplanation;
  private Boolean isSystemDefault;
  
  private Integer recordVersion;

  private List descriptions;

  // Constructors //////////////////////////////////////////////////////////////

  public LanguageDMO() {
  }

  public LanguageDMO(String languageId) {
    this.languageId = languageId;
  }

  public LanguageDMO(
    String languageId,
    String languageCode,
    String description,
    String explanation,
    Boolean isUsed,
    String nullDisplayCode,
    String nullDescription,
    String nullExplanation,
    Boolean isSystemDefault,
    Integer recordVersion) {
    this.languageId = languageId;
    this.languageCode = languageCode;
    this.description = description;
    this.explanation = explanation;
    this.isUsed = isUsed;
    this.nullDisplayCode = nullDisplayCode;
    this.nullDescription = nullDescription;
    this.nullExplanation = nullExplanation;
    this.isSystemDefault = isSystemDefault;
    this.recordVersion = recordVersion;
  }

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return recordVersion;
  }

  protected void versionNumber(Integer versionNumber) {
    this.recordVersion = versionNumber;
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(languageId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {
    return new Object[] {
      languageId,
      isSystemDefault,
      recordVersion };
  }

  protected void set(Object[] fields) {

    int pos = 0;
    languageId = (String) fields[pos++];
    languageCode = (String) fields[pos++];
    description = (String) fields[pos++];
    explanation = (String) fields[pos++];
    isUsed = null;
    nullDisplayCode = (String) fields[pos++];
    nullDescription = (String) fields[pos++];
    nullExplanation = (String) fields[pos++];
    isSystemDefault = (Boolean) fields[pos++];
    recordVersion = (Integer) fields[pos++];
  }

  // Get methods ///////////////////////////////////////////////////////////////

  public String getRecordId() {
    return languageId;
  }

  public String getLanguageId() {
    return languageId;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  /**
   * Always returns true since the languages display code is actually handled by the infrastructure and cant be set by the user.
   * @return true
   */
  public Boolean getIsValidCode(  ) {
    return new Boolean(true);
  }
  
  /**
   * Nonstandard method. Actually returns the language id.
   */
  public String getDisplayCode() {
    return languageId;
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

  public String getNullDisplayCode() {
    return nullDisplayCode;
  }

  public String getNullDescription() {
    return nullDescription;
  }

  public String getNullExplanation() {
    return nullExplanation;
  }

  public Boolean getIsSystemDefault() {
    return isSystemDefault;
  }

  public Integer getRecordVersion() {
    return recordVersion;
  }

  public List getDescriptions() {
    return descriptions;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(
    String languageId,
    String languageCode,
    String description,
    String explanation,
    Boolean isUsed,
    String nullDisplayCode,
    String nullDescription,
    String nullExplanation,
    Boolean isSystemDefault,
    Integer recordVersion) {
    this.languageId = languageId;
    this.languageCode = languageCode;
    this.description = description;
    this.explanation = explanation;
    this.isUsed = isUsed;
    this.nullDisplayCode = nullDisplayCode;
    this.nullDescription = nullDescription;
    this.nullExplanation = nullExplanation;
    this.isSystemDefault = isSystemDefault;
    this.recordVersion = recordVersion;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  /**
   * Dummy method. Provided because required for all multilingual classes. But in this case does nothing.
   * @param isValidCode
   */
  public void setIsValidCode( Boolean isValidCode ) {
  }
  
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Dummy method that does nothing. Only provided because multilingual classes are supposed to have such a method.
   * @param displayCode
   */
  public void setDisplayCode( String displayCode ) {
  }
  
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public void setIsUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }

  public void setNullDisplayCode(String nullDisplayCode) {
    this.nullDisplayCode = nullDisplayCode;
  }

  public void setNullDescription(String nullDescription) {
    this.nullDescription = nullDescription;
  }

  public void setNullExplanation(String nullExplanation) {
    this.nullExplanation = nullExplanation;
  }

  public void setIsSystemDefault(Boolean isSystemDefault) {
    this.isSystemDefault = isSystemDefault;
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