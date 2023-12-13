package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class N2NSubDetailsDQO extends DBO implements Serializable {

    private static final int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_DATEONLY,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER,
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER
    };
    
    private String serviceCode; 
    private String serviceType; 
    private String internTariff;
    private String simNo;
    private String msisdnNo;
    private Integer rowid;
    private String netServCode; 
    private String supServCode;
    private String msisdnKnown;
    private String location;
    private Date eventDate;
    private String originator; 
    private String nodeSent;
    private Integer depReqd;
    private String serviceOrder;
    private Integer activateOrder;

  private static final int serviceCodeSize = 4; // field size
  private static final int serviceTypeSize = 5; // field size
  private static final int internTariffSize = 3; // field size
  private static final int simNoSize = 14; // field size
  private static final int msisdnNoSize = 15; // field size
  private static final int netServCodeSize = 15; // field size 
  private static final int supServCodeSize = 15; // field size
  private static final int msisdnKnownSize = 1; // field size
  private static final int locationSize = 2; // field size
  private static final int originatorSize = 1; // field size
  private static final int nodeSentSize = 1; // field size
  private static final int serviceOrderSize = 5; // field size
	
  // list of string field sizes
  protected final int[] fieldSizes = new int[] { serviceCodeSize,
      serviceTypeSize, internTariffSize, simNoSize, msisdnNoSize, 0,
      //      netServCodeSize, supServCodeSize, 
      msisdnKnownSize, locationSize,
      0, originatorSize, nodeSentSize, 0, serviceOrderSize, 0 };

  public N2NSubDetailsDQO() {
  }

  public N2NSubDetailsDQO(String serviceCode, String serviceType,
      String internTariff, String simNo, String msisdnNo, Integer rowid,
      String netServCode, String supServCode, String msisdnKnown,
      String location, Date eventDate, String originator, String nodeSent,
      Integer depReqd, String serviceOrder, Integer activateOrder) {
    this.serviceCode = serviceCode;
    this.serviceType = serviceType;
    this.internTariff = internTariff;
    this.simNo = simNo;
    this.msisdnNo = msisdnNo;
    this.rowid = rowid;
    this.netServCode = netServCode;
    this.supServCode = supServCode;
    this.msisdnKnown = msisdnKnown;
    this.location = location;
    this.eventDate = eventDate;
    this.originator = originator;
    this.nodeSent = nodeSent;
    this.depReqd = depReqd;
    this.serviceOrder = serviceOrder;
    this.activateOrder = activateOrder;
  }

 
  protected void generatedKey(Integer arg0) {
    // TODO Auto-generated method stub
  }

 
  protected Object[] get() {
    return null;
  }

 
  protected Integer versionNumber() {
    return null;
  }

 
  protected void versionNumber(Integer arg0) {
  }

 
  protected int[] fieldTypes() {
    return fieldTypes;
  }

 
  protected DAOArgs primaryKey() {
    return null;
  }

 
  protected void set(Object[] fields) {
    serviceCode = (String) fields[0];
    serviceType = (String) fields[1];
    internTariff = (String) fields[2];
    simNo = (String) fields[3];
    msisdnNo = (String) fields[4];
    rowid = (Integer) fields[5];
    netServCode = (String) fields[6];
    supServCode = (String) fields[7];
    msisdnKnown = (String) fields[8];
    location = (String) fields[9];
    eventDate = (Date) fields[10];
    originator = (String) fields[11];
    nodeSent = (String) fields[12];
    depReqd = (Integer) fields[13];
    serviceOrder = (String) fields[14];
    activateOrder = (Integer) fields[15];
  }

 
  protected int[] fieldSizes() {
    return fieldSizes;
  }

  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public String getInternTariff() {
    return internTariff;
  }

  public void setInternTariff(String internTariff) {
    this.internTariff = internTariff;
  }

  public String getSimNo() {
    return simNo;
  }

  public void setSimNo(String simNo) {
    this.simNo = simNo;
  }

  public String getMsisdnNo() {
    return msisdnNo;
  }

  public void setMsisdnNo(String msisdnNo) {
    this.msisdnNo = msisdnNo;
  }

  public Integer getRowid() {
    return rowid;
  }

  public void setRowid(Integer rowid) {
    this.rowid = rowid;
  }

  public String getNetServCode() {
    return netServCode;
  }

  public void setNetServCode(String netServCode) {
    this.netServCode = netServCode;
  }

  public String getSupServCode() {
    return supServCode;
  }

  public void setSupServCode(String supServCode) {
    this.supServCode = supServCode;
  }

  public String getMsisdnKnown() {
    return msisdnKnown;
  }

  public void setMsisdnKnown(String msisdnKnown) {
    this.msisdnKnown = msisdnKnown;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getEventDate() {
    return eventDate;
  }

  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }

  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public String getNodeSent() {
    return nodeSent;
  }

  public void setNodeSent(String nodeSent) {
    this.nodeSent = nodeSent;
  }

  public Integer getDepReqd() {
    return depReqd;
  }

  public void setDepReqd(Integer depReqd) {
    this.depReqd = depReqd;
  }

  public String getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(String serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  public Integer getActivateOrder() {
    return activateOrder;
  }

  public void setActivateOrder(Integer activateOrder) {
    this.activateOrder = activateOrder;
  }

}


