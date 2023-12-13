package com.eppixcomm.eppix.common.blo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class AuditDMO extends DBO implements Serializable {

  // Field Types
  private static int[] fieldTypes = new int[] {
    FIELD_TYPE_STRING, // auditId
    FIELD_TYPE_STRING, // auditTypeId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // auditTypeDesc
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // ownerEntityId
    FIELD_TYPE_STRING, // ownerRecordId
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // outerEntityId
    FIELD_TYPE_STRING, // outerRecordId
    FIELD_TYPE_DATETIME, // changeDateTime
    FIELD_TYPE_STRING, // changer
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // message
    FIELD_TYPE_STRING, // messageArg0
    FIELD_TYPE_STRING, // messageArg1
    FIELD_TYPE_STRING, // messageArg2
    FIELD_TYPE_STRING, // messageArg3
    FIELD_TYPE_STRING, // messageArg4
    FIELD_TYPE_STRING, // messageArg5
    FIELD_TYPE_STRING, // messageArg6
    FIELD_TYPE_STRING, // messageArg7
    FIELD_TYPE_STRING, // messageArg8
    FIELD_TYPE_STRING // messageArg9
  };

  private String auditId;
  private String auditTypeId;
  private String auditTypeDesc;
  private String ownerEntityId;
  private String ownerRecordId;
  private String outerEntityId;
  private String outerRecordId;
  private DateTime changeDateTime;
  private String changer;
  private String message;
  private Object[] messageArgs;
  private List auditFields;

  // Constructors //////////////////////////////////////////////////////////////

  public AuditDMO() {
  }

  public AuditDMO(
    String auditId,
    String auditTypeId,
    String auditTypeDesc,
    String ownerEntityId,
    String ownerRecordId,
    String outerEntityId,
    String outerRecordId,
    DateTime changeDateTime,
    String changer) {

    this.auditId = auditId;
    this.auditTypeId = auditTypeId;
    this.auditTypeDesc = auditTypeDesc;
    this.ownerEntityId = ownerEntityId;
    this.ownerRecordId = ownerRecordId;
    this.outerEntityId = outerEntityId;
    this.outerRecordId = outerRecordId;
    this.changeDateTime = changeDateTime;
    this.changer = changer;
  }
  
  AuditDMO(
    String auditId,
    String auditTypeId,
    String auditTypeDesc,
    String ownerEntityId,
    String ownerRecordId,
    String outerEntityId,
    String outerRecordId,
    DateTime changeDateTime,
    String changer,
    Object[] messageArgs) {

    this.auditId = auditId;
    this.auditTypeId = auditTypeId;
    this.auditTypeDesc = auditTypeDesc;
    this.ownerEntityId = ownerEntityId;
    this.ownerRecordId = ownerRecordId;
    this.outerEntityId = outerEntityId;
    this.outerRecordId = outerRecordId;
    this.changeDateTime = changeDateTime;
    this.changer = changer;
    this.messageArgs = messageArgs;
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
//    this.auditId = key;
  }

  protected Integer versionNumber() {
    return null;
  }

  protected void versionNumber(Integer versionNumber) {
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(auditId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {
    return new Object[] {
      auditId,
      auditTypeId,
      ownerRecordId,
      outerRecordId,
      changeDateTime,
      changer,
      messageArg(0),
      messageArg(1),
      messageArg(2),
      messageArg(3),
      messageArg(4),
      messageArg(5),
      messageArg(6),
      messageArg(7),
      messageArg(8),
      messageArg(9) };
  }

  private String messageArg(int idx) {

    if (messageArgs != null && idx < messageArgs.length) {
      Object o = messageArgs[idx];
      if (o != null) {
        return o.toString();
      }
    }
    return null;
  }

  protected void set(Object[] fields) {
    auditId = (String) fields[0];
    auditTypeId = (String) fields[1];
    auditTypeDesc = (String) fields[2];
    ownerEntityId = (String) fields[3];
    ownerRecordId = (String) fields[4];
    outerEntityId = (String) fields[5];
    outerRecordId = (String) fields[6];
    changeDateTime = (DateTime) fields[7];
    changer = (String) fields[8];
    message = (String) fields[9];
    messageArgs = null;
    for (int i = 0; i < 10; ++i) {
      String arg = (String) fields[10 + i];
      if (arg != null) {
        if (messageArgs == null) {
          messageArgs = new Object[10];
        }
        messageArgs[i] = arg;
      }
    }
  }

  // Get methods ///////////////////////////////////////////////////////////////

  public String getAuditId() {
    return auditId;
  }

  public String getAuditTypeId() {
    return auditTypeId;
  }

  public String getAuditTypeDesc() {
    return auditTypeDesc;
  }

  public String getOwnerEntityId() {
    return ownerEntityId;
  }

  public String getOwnerRecordId() {
    return ownerRecordId;
  }

  public String getOuterEntityId() {
    return outerEntityId;
  }

  public String getOuterRecordId() {
    return outerRecordId;
  }

  public DateTime getChangeDateTime() {
    return changeDateTime;
  }

  public String getChanger() {
    return changer;
  }

  public String getMessage() {

    if (messageArgs == null) {
      return message;
    }

    try {
      String messageWithArgs = message;

      for (int i = 0; i < messageArgs.length; ++i) {

        String iString = Integer.toString(i);

        if (messageArgs[i] != null) {
          messageWithArgs = messageWithArgs.replaceAll(
            "\\$" + iString,
            messageArgs[i].toString());
        }
      }

      return messageWithArgs;

    } catch (RuntimeException e) {
      // It isn't important if the substitution has failed in some way so we'll
      // just return the original message.
      return message;
    }
  }

  public List getAuditFields() {
    return auditFields;
  }

  // Set methods ///////////////////////////////////////////////////////////////

  public void set(
    String auditId,
    String auditTypeId,
    String auditTypeDesc,
    String ownerEntityId,
    String ownerRecordId,
    String outerEntityId,
    String outerRecordId,
    DateTime changeDateTime,
    String changer) {

    this.auditId = auditId;
    this.auditTypeId = auditTypeId;
    this.auditTypeDesc = auditTypeDesc;
    this.ownerEntityId = ownerEntityId;
    this.ownerRecordId = ownerRecordId;
    this.outerEntityId = outerEntityId;
    this.outerRecordId = outerRecordId;
    this.changeDateTime = changeDateTime;
    this.changer = changer;
  }

  public void setAuditId(String auditId) {
    this.auditId = auditId;
  }

  public void setAuditTypeId(String auditTypeId) {
    this.auditTypeId = auditTypeId;
  }

  public void setAuditTypeDesc(String auditTypeDesc) {
    this.auditTypeDesc = auditTypeDesc;
  }

  public void setOwnerEntityId(String ownerEntityId) {
    this.ownerEntityId = ownerEntityId;
  }

  public void setOwnerRecordId(String ownerRecordId) {
    this.ownerRecordId = ownerRecordId;
  }

  public void setOuterEntityId(String outerEntityId) {
    this.outerEntityId = outerEntityId;
  }

  public void setOuterRecordId(String outerRecordId) {
    this.outerRecordId = outerRecordId;
  }

  public void setChangeDateTime(DateTime changeDateTime) {
    this.changeDateTime = changeDateTime;
  }

  public void setChanger(String changer) {
    this.changer = changer;
  }

  void setMessageArgs(Object[] messageArgs) {
    this.messageArgs = messageArgs;
  }

  public void setAuditFields(List auditFields) {
    this.auditFields = auditFields;
  }

  public void addAuditField(AuditFieldDMO auditFieldDMO) {
    if (auditFields == null) {
      auditFields = new ArrayList();
    }
    auditFields.add(auditFieldDMO);
  }
}