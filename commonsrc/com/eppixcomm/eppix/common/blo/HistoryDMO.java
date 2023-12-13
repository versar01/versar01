/* ====================================================================== *
 * Copyright 2002 CMG Wireless Data Solutions (UK) Ltd.                                      *
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
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public class HistoryDMO extends DBO implements Serializable {

  private static int[] fieldTypes = new int[]{
    FIELD_TYPE_STRING, // history Id
    FIELD_TYPE_INTEGER, // history defn Id
    FIELD_TYPE_STRING, // tech desc
    FIELD_TYPE_STRING, // user Type
    FIELD_TYPE_STRING, // user Id
    FIELD_TYPE_DATETIME, // history Timestamp
    FIELD_TYPE_STRING, // entity Id
    FIELD_TYPE_STRING, // record Id
    FIELD_TYPE_STRING, // data name 1
    FIELD_TYPE_STRING, // data value 1
    FIELD_TYPE_STRING, // data name 2
    FIELD_TYPE_STRING, // data value 2
    FIELD_TYPE_STRING, // data name 3
    FIELD_TYPE_STRING, // data value 3
    FIELD_TYPE_STRING, // data name 4
    FIELD_TYPE_STRING, // data value 4
    FIELD_TYPE_STRING, // data name 5
    FIELD_TYPE_STRING, // data value 5
    FIELD_TYPE_STRING, // data name 6
    FIELD_TYPE_STRING, // data value 6
    FIELD_TYPE_STRING, // data name 7
    FIELD_TYPE_STRING, // data value 7
    FIELD_TYPE_STRING, // data name 8
    FIELD_TYPE_STRING, // data value 8
    FIELD_TYPE_STRING, // data name 9
    FIELD_TYPE_STRING, // data value 9
    FIELD_TYPE_STRING, // data name 10
    FIELD_TYPE_STRING, // data value 10
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // history description
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // history message
    FIELD_TYPE_STRING | FIELD_ATTR_QUERYONLY, // language id
    FIELD_TYPE_INTEGER | FIELD_ATTR_QUERYONLY, // record version
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

  private String historyId; // generated key
  private Integer historyDefnId;
  private String techDesc;
  private String userType;
  private String userId;
  private DateTime historyTimestamp;
  private String entityId;
  private String recordId;
  private String dataName1;
  private String dataValue1;
  private String dataName2;
  private String dataValue2;
  private String dataName3;
  private String dataValue3;
  private String dataName4;
  private String dataValue4;
  private String dataName5;
  private String dataValue5;
  private String dataName6;
  private String dataValue6;
  private String dataName7;
  private String dataValue7;
  private String dataName8;
  private String dataValue8;
  private String dataName9;
  private String dataValue9;
  private String dataName10;
  private String dataValue10;
  private String historyDescription;
  private String historyMessage;
  private String languageId;
  private Integer recordVersion;

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
//    this.historyId = key;
  }

  protected Integer versionNumber() {
    return this.recordVersion;
  }

  protected void versionNumber(Integer versionNumber) {
    this.recordVersion = versionNumber;
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(this.historyId);
  }

  protected int[] fieldTypes() {
    return fieldTypes;
  }

  protected Object[] get() {

    return new Object[]{
      this.historyId,
      this.historyDefnId,
      this.techDesc,
      this.userType,
      this.userId,
      this.historyTimestamp,
      this.entityId,
      this.recordId,
      this.dataName1,
      this.dataValue1,
      this.dataName2,
      this.dataValue2,
      this.dataName3,
      this.dataValue3,
      this.dataName4,
      this.dataValue4,
      this.dataName5,
      this.dataValue5,
      this.dataName6,
      this.dataValue6,
      this.dataName7,
      this.dataValue7,
      this.dataName8,
      this.dataValue8,
      this.dataName9,
      this.dataValue9,
      this.dataName10,
      this.dataValue10};
  }

  protected void set(Object[] fields) {

    this.historyId = (String) fields[0];
    this.historyDefnId = (Integer) fields[1];
    this.techDesc = (String) fields[2];
    this.userType = (String) fields[3];
    this.userId = (String) fields[4];
    this.historyTimestamp = (DateTime) fields[5];
    this.entityId = (String) fields[6];
    this.recordId = (String) fields[7];
    this.dataName1 = (String) fields[8];
    this.dataValue1 = (String) fields[9];
    this.dataName2 = (String) fields[10];
    this.dataValue2 = (String) fields[11];
    this.dataName3 = (String) fields[12];
    this.dataValue3 = (String) fields[13];
    this.dataName4 = (String) fields[14];
    this.dataValue4 = (String) fields[15];
    this.dataName5 = (String) fields[16];
    this.dataValue5 = (String) fields[17];
    this.dataName6 = (String) fields[18];
    this.dataValue6 = (String) fields[19];
    this.dataName7 = (String) fields[20];
    this.dataValue7 = (String) fields[21];
    this.dataName8 = (String) fields[22];
    this.dataValue8 = (String) fields[23];
    this.dataName9 = (String) fields[24];
    this.dataValue9 = (String) fields[25];
    this.dataName10 = (String) fields[26];
    this.dataValue10 = (String) fields[27];
    this.historyDescription = (String) fields[28];
    this.historyMessage = (String) fields[29];
    this.languageId = (String) fields[30];
    this.recordVersion = (Integer) fields[31];
  }

  // Constructors //////////////////////////////////////////////////////////////
  public HistoryDMO() {
  }

  public HistoryDMO(
    String historyId,
    Integer historyDefnId,
    String techDesc,
    String userType,
    String userId,
    DateTime historyTimestamp,
    String entityId,
    String recordId,
    String dataName1,
    String dataValue1,
    String dataName2,
    String dataValue2,
    String dataName3,
    String dataValue3,
    String dataName4,
    String dataValue4,
    String dataName5,
    String dataValue5,
    String dataName6,
    String dataValue6,
    String dataName7,
    String dataValue7,
    String dataName8,
    String dataValue8,
    String dataName9,
    String dataValue9,
    String dataName10,
    String dataValue10,
    String historyDescription,
    String historyMessage,
    String languageId,
    Integer recordVersion) {

    this.historyId = historyId;
    this.historyDefnId = historyDefnId;
    this.techDesc = techDesc;
    this.userType = userType;
    this.userId = userId;
    this.historyTimestamp = historyTimestamp;
    this.entityId = entityId;
    this.recordId = recordId;
    this.dataName1 = dataName1;
    this.dataValue1 = dataValue1;
    this.dataName2 = dataName2;
    this.dataValue2 = dataValue2;
    this.dataName3 = dataName3;
    this.dataValue3 = dataValue3;
    this.dataName4 = dataName4;
    this.dataValue4 = dataValue4;
    this.dataName5 = dataName5;
    this.dataValue5 = dataValue5;
    this.dataName6 = dataName6;
    this.dataValue6 = dataValue6;
    this.dataName7 = dataName7;
    this.dataValue7 = dataValue7;
    this.dataName8 = dataName8;
    this.dataValue8 = dataValue8;
    this.dataName9 = dataName9;
    this.dataValue9 = dataValue9;
    this.dataName10 = dataName10;
    this.dataValue10 = dataValue10;
    this.historyDescription = historyDescription;
    this.historyMessage = historyMessage;
    this.languageId = languageId;
    this.recordVersion = recordVersion;
  }

  // Get methods ///////////////////////////////////////////////////////////////
  public String getHistoryId() {
    return historyId;
  }

  public Integer getHistoryDefnId() {
    return historyDefnId;
  }

  public String getTechDesc() {
    return techDesc;
  }

  public String getUserType() {
    return userType;
  }

  public String getUserId() {
    return userId;
  }

  public DateTime getHistoryTimestamp() {
    return historyTimestamp;
  }

  public String getEntityId() {
    return entityId;
  }

  public String getRecordId() {
    return recordId;
  }

  public String getDataName1() {
    return dataName1;
  }

  public String getDataValue1() {
    return dataValue1;
  }

  public String getDataName2() {
    return dataName2;
  }

  public String getDataValue2() {
    return dataValue2;
  }

  public String getDataName3() {
    return dataName3;
  }

  public String getDataValue3() {
    return dataValue3;
  }

  public String getDataName4() {
    return dataName4;
  }

  public String getDataValue4() {
    return dataValue4;
  }

  public String getDataName5() {
    return dataName5;
  }

  public String getDataValue5() {
    return dataValue5;
  }

  public String getDataName6() {
    return dataName6;
  }

  public String getDataValue6() {
    return dataValue6;
  }

  public String getDataName7() {
    return dataName7;
  }

  public String getDataValue7() {
    return dataValue7;
  }

  public String getDataName8() {
    return dataName8;
  }

  public String getDataValue8() {
    return dataValue8;
  }

  public String getDataName9() {
    return dataName9;
  }

  public String getDataValue9() {
    return dataValue9;
  }

  public String getDataName10() {
    return dataName10;
  }

  public String getDataValue10() {
    return dataValue10;
  }

  public String getHistoryDescription() {
    return historyDescription;
  }

  public String getHistoryMessage() {
    return historyMessage;
  }

  public String getLanguageId() {
    return languageId;
  }

  public Integer getRecordVersion() {
    return recordVersion;
  }

  // Set methods ///////////////////////////////////////////////////////////////
  public void set(
    String historyId,
    Integer historyDefnId,
    String techDesc,
    String userType,
    String userId,
    DateTime historyTimestamp,
    String entityId,
    String recordId,
    String dataName1,
    String dataValue1,
    String dataName2,
    String dataValue2,
    String dataName3,
    String dataValue3,
    String dataName4,
    String dataValue4,
    String dataName5,
    String dataValue5,
    String dataName6,
    String dataValue6,
    String dataName7,
    String dataValue7,
    String dataName8,
    String dataValue8,
    String dataName9,
    String dataValue9,
    String dataName10,
    String dataValue10,
    String historyDescription,
    String historyMessage,
    String languageId,
    Integer recordVersion) {

    this.historyId = historyId;
    this.historyDefnId = historyDefnId;
    this.techDesc = techDesc;
    this.userType = userType;
    this.userId = userId;
    this.historyTimestamp = historyTimestamp;
    this.entityId = entityId;
    this.recordId = recordId;
    this.dataName1 = dataName1;
    this.dataValue1 = dataValue1;
    this.dataName2 = dataName2;
    this.dataValue2 = dataValue2;
    this.dataName3 = dataName3;
    this.dataValue3 = dataValue3;
    this.dataName4 = dataName4;
    this.dataValue4 = dataValue4;
    this.dataName5 = dataName5;
    this.dataValue5 = dataValue5;
    this.dataName6 = dataName6;
    this.dataValue6 = dataValue6;
    this.dataName7 = dataName7;
    this.dataValue7 = dataValue7;
    this.dataName8 = dataName8;
    this.dataValue8 = dataValue8;
    this.dataName9 = dataName9;
    this.dataValue9 = dataValue9;
    this.dataName10 = dataName10;
    this.dataValue10 = dataValue10;
    this.historyDescription = historyDescription;
    this.historyMessage = historyMessage;
    this.languageId = languageId;
    this.recordVersion = recordVersion;
  }

  public void setHistoryId(String historyId) {
    this.historyId = historyId;
  }

  public void setHistoryDefnId(Integer historyDefnId) {
    this.historyDefnId = historyDefnId;
  }

  public void setTechDesc(String techDesc) {
    this.techDesc = techDesc;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setHistoryTimestamp(DateTime historyTimestamp) {
    this.historyTimestamp = historyTimestamp;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public void setDataName1(String dataName1) {
    this.dataName1 = dataName1;
  }

  public void setDataValue1(String dataValue1) {
    this.dataValue1 = dataValue1;
  }

  public void setDataName2(String dataName2) {
    this.dataName2 = dataName2;
  }

  public void setDataValue2(String dataValue2) {
    this.dataValue2 = dataValue2;
  }

  public void setDataName3(String dataName3) {
    this.dataName3 = dataName3;
  }

  public void setDataValue3(String dataValue3) {
    this.dataValue3 = dataValue3;
  }

  public void setDataName4(String dataName4) {
    this.dataName4 = dataName4;
  }

  public void setDataValue4(String dataValue4) {
    this.dataValue4 = dataValue4;
  }

  public void setDataName5(String dataName5) {
    this.dataName5 = dataName5;
  }

  public void setDataValue5(String dataValue5) {
    this.dataValue5 = dataValue5;
  }

  public void setDataName6(String dataName6) {
    this.dataName6 = dataName6;
  }

  public void setDataValue6(String dataValue6) {
    this.dataValue6 = dataValue6;
  }

  public void setDataName7(String dataName7) {
    this.dataName7 = dataName7;
  }

  public void setDataValue7(String dataValue7) {
    this.dataValue7 = dataValue7;
  }

  public void setDataName8(String dataName8) {
    this.dataName8 = dataName8;
  }

  public void setDataValue8(String dataValue8) {
    this.dataValue8 = dataValue8;
  }

  public void setDataName9(String dataName9) {
    this.dataName9 = dataName9;
  }

  public void setDataValue9(String dataValue9) {
    this.dataValue9 = dataValue9;
  }

  public void setDataName10(String dataName10) {
    this.dataName10 = dataName10;
  }

  public void setDataValue10(String dataValue10) {
    this.dataValue10 = dataValue10;
  }

  public void setHistoryDescription(String historyDescription) {
    this.historyDescription = historyDescription;
  }

  public void setHistoryMessage(String historyMessage) {
    this.historyMessage = historyMessage;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public void setrecordVersion(Integer recordVersion) {
    this.recordVersion = recordVersion;
  }
}