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

import java.util.ArrayList;
import java.util.List;

/**
 * @author $Author$
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 */
public abstract class EnumeratedTypeDMO extends DBO implements Enumerated,
  Serializable {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // recordId
    FIELD_TYPE_STRING, // entityId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // languageCode
    FIELD_TYPE_BOOLEAN | FIELD_ATTR_QUERYONLY, // isValidCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // displayCode
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // description
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // explanation
    FIELD_TYPE_INTEGER // recordVersion
  };

  String recordId;
  String entityId;
  String languageCode;
  Boolean isValidCode;
  String displayCode;
  String description;
  String explanation;
  Integer recordVersion;
  private List descriptions;

  // Constructors //////////////////////////////////////////////////////////////

  protected EnumeratedTypeDMO() {
  }

  protected EnumeratedTypeDMO(String entityId, String recordId) {
    this.entityId = entityId;
    this.recordId = recordId;
  }

  protected EnumeratedTypeDMO(Enumerated enumeratedTypeDMO) {
    entityId = enumeratedTypeDMO.getEntityId();
    recordId = enumeratedTypeDMO.getRecordId();
    languageCode = enumeratedTypeDMO.getLanguageCode();
    isValidCode = enumeratedTypeDMO.getIsValidCode();
    displayCode = enumeratedTypeDMO.getDisplayCode();
    description = enumeratedTypeDMO.getDescription();
    explanation = enumeratedTypeDMO.getExplanation();
    recordVersion = enumeratedTypeDMO.getRecordVersion();
  }

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return this.recordVersion;
  }

  protected void versionNumber(Integer versionNumber) {
    this.recordVersion = versionNumber;
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(2).arg(recordId).arg(entityId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {
    return new Object[] {
      recordId,
      entityId,
      recordVersion };
  }

  protected void set(Object[] fields) {
    recordId = (String) fields[0];
    entityId = (String) fields[1];
    languageCode = (String) fields[2];
    isValidCode = (Boolean) fields[3];
    displayCode = (String) fields[4];
    description = (String) fields[5];
    explanation = (String) fields[6];
    recordVersion = (Integer) fields[7];
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
  
  // Get methods ///////////////////////////////////////////////////////////////

  public String getEntityId() {
    return entityId;
  }

  public String getRecordId() {
    return recordId;
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

  public Integer getRecordVersion() {
    return recordVersion;
  }

  public List getDescriptions() {
    return descriptions;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(
    String languageCode,
    Boolean isValidCode,
    String displayCode,
    String description,
    String explanation,
    Integer recordVersion) {
    this.languageCode = languageCode;
    this.isValidCode = isValidCode;
    this.displayCode = displayCode;
    this.description = description;
    this.explanation = explanation;
    this.recordVersion = recordVersion;
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

  protected void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  protected void setRecordId(String recordId) {
    this.recordId = recordId;
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

  //////////////////////////////////////////////////////////////////////////////

  /**
   * Indicates whether some other EnumeratedType is "equal to" this one. They
   * are equal if they are instances of the same class and have non-null
   * enumeration values that are equal.
   * 
   * @param enumeratedTypeDMO the reference EnumeratedType with which to
   *        compare.
   * 
   * @return true if this EnumeratedType is the same as the EnumeratedType
   *         argument; false otherwise.
   */
  public boolean equals(EnumeratedTypeDMO enumeratedTypeDMO) {
    return enumeratedTypeDMO != null
      && enumeratedTypeDMO.getClass().isInstance(this)
      && enumeratedTypeDMO.getRecordId() != null && this.getRecordId() != null
      && this.getRecordId().equals(enumeratedTypeDMO.getRecordId());
  }

  //  probably need to override hashCode() to match equals()

  /**
   * Creates a new instance of this EnumeratedType object. EnumeratedType values
   * are declared as public static final so a new instance should be obtained
   * before populating fields. <br>
   * 
   * e.g., <br>
   * 
   * EnumeratedTypeDMO enumTypeDMO = EnumeratedTypeDMO.ENUM_VALUE.newInstance();
   * enumTypeDMO.setDisplayCode("...");
   */
  public abstract EnumeratedTypeDMO newInstance();

}