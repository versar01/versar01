package com.eppixcomm.eppix.soa.sharedservices.blo;
import java.io.Serializable;
import java.util.Arrays;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TmpDualCallN2NServicesDQO extends DBO implements Serializable {
  //          l_dc_rec RECORD
  //              net_serv    LIKE ts_tariff_service.ts_net_serv_code,
  //              sim1        LIKE vam_active_msisdn.vam_sim_no,
  //              msisdn1  LIKE vam_active_msisdn.vam_msisdn_no,
  //              sim2        LIKE vam_active_msisdn.vam_sim_no,
  //              msisdn2  LIKE vam_active_msisdn.vam_msisdn_no,
  //              rowid      INTEGER,
  //              serv_exist      CHAR(1),
  //              serv_type       LIKE vas_active_service.vas_service_type
  //          END RECORD,
  private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
      FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
      FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
      FIELD_TYPE_STRING };

  private String netServCode;
  private String simNo1;
  private String msisdnNo1;
  private String simNo2;
  private String msisdnNo2;
  private Integer rowid;
  private String serviceExist;
  private String serviceType;

  private static final int netServCodeSize = 15; // field size 
  private static final int simNoSize = 14; // field size
  private static final int msisdnNoSize = 15; // field size
  private static final int serviceExistSize = 1; // field size
  private static final int serviceTypeSize = 5; // field size

  // list of string field sizes
  protected final int[] fieldSizes = new int[] { netServCodeSize, simNoSize,
      msisdnNoSize, simNoSize, msisdnNoSize, 0, serviceExistSize,
      serviceTypeSize };

  public TmpDualCallN2NServicesDQO() {
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

    netServCode = (String) fields[0];
    simNo1 = (String) fields[1];
    msisdnNo1 = (String) fields[2];
    simNo2 = (String) fields[3];
    msisdnNo2 = (String) fields[4];
    rowid = (Integer) fields[5];
    serviceExist = (String) fields[6];
    serviceType = (String) fields[7];
  }

 
  protected int[] fieldSizes() {
    return fieldSizes;
  }

  public String getNetServCode() {
    return netServCode;
  }

  public void setNetServCode(String netServCode) {
    this.netServCode = netServCode;
  }

  public String getSimNo1() {
    return simNo1;
  }

  public void setSimNo1(String simNo1) {
    this.simNo1 = simNo1;
  }

  public String getMsisdnNo1() {
    return msisdnNo1;
  }

  public void setMsisdnNo1(String msisdnNo1) {
    this.msisdnNo1 = msisdnNo1;
  }

  public String getSimNo2() {
    return simNo2;
  }

  public void setSimNo2(String simNo2) {
    this.simNo2 = simNo2;
  }

  public String getMsisdnNo2() {
    return msisdnNo2;
  }

  public void setMsisdnNo2(String msisdnNo2) {
    this.msisdnNo2 = msisdnNo2;
  }

  public Integer getRowid() {
    return rowid;
  }

  public void setRowid(Integer rowid) {
    this.rowid = rowid;
  }

  public String getServiceExist() {
    return serviceExist;
  }

  public void setServiceExist(String serviceExist) {
    this.serviceExist = serviceExist;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


@Override
public String toString() {
	return "\nTmpDualCallN2NServicesDQO [\nnetServCode=" + netServCode
			+ "\nsimNo1=" + simNo1 + "\nmsisdnNo1=" + msisdnNo1 + "\nsimNo2="
			+ simNo2 + "\nmsisdnNo2=" + msisdnNo2 + "\nrowid=" + rowid
			+ "\nserviceExist=" + serviceExist + "\nserviceType=" + serviceType
			+ "\nfieldSizes=" + Arrays.toString(fieldSizes) + "]";
}

}
