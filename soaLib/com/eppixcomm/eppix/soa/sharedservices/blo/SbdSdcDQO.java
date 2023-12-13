package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbdSdcDQO extends DBO implements Serializable {


	private Integer sbdSubscriberId;
	private String sbdDiallingNo;
	private String sbdBillAcNo;
	private Date sbdConnectDate;
	private Date sbdDconnectDate;
	private Date sbdTermDate;
	private String sbdTitle;
	private String sbdSurname;
	private String sbdFirstname;
	private String sbdGender;
	private Date sbdDob;
	private String sbdPassword;
	private String sbdLocationCode;
	private String sbdBillCycle;
	private String sbdPackageCode;
	private Date sbdBilledUpto;
	private String sbdTariffPlan;
	private Integer sdcSubscriberId;
	private String sdcServiceCode;
	private String sdcSecondMsisdn;
	private String sdcFirstMsisdn;
	private Date sdcLinkDate;
	private Date sdcExpiryDate;


public static final int sbdSubscriberIdFilter = 0;

public static final int sbdDiallingNoFilter = 1;
private static final int sbdDiallingNoSize = 15;


public static final int sbdBillAcNoFilter = 2;
private static final int sbdBillAcNoSize = 8;


public static final int sbdConnectDateFilter = 3;

public static final int sbdDconnectDateFilter = 4;

public static final int sbdTermDateFilter = 5;

public static final int sbdTitleFilter = 6;
private static final int sbdTitleSize = 10;


public static final int sbdSurnameFilter = 7;
private static final int sbdSurnameSize = 50;


public static final int sbdFirstnameFilter = 8;
private static final int sbdFirstnameSize = 50;


public static final int sbdGenderFilter = 9;
private static final int sbdGenderSize = 1;


public static final int sbdDobFilter = 10;

public static final int sbdPasswordFilter = 11;
private static final int sbdPasswordSize = 20;


public static final int sbdLocationCodeFilter = 12;
private static final int sbdLocationCodeSize = 15;


public static final int sbdBillCycleFilter = 13;
private static final int sbdBillCycleSize = 5;


public static final int sbdPackageCodeFilter = 14;
private static final int sbdPackageCodeSize = 5;


public static final int sbdBilledUptoFilter = 15;

public static final int sbdTariffPlanFilter = 16;
private static final int sbdTariffPlanSize = 20;


public static final int sdcSubscriberIdFilter = 17;

public static final int sdcServiceCodeFilter = 18;
private static final int sdcServiceCodeSize = 4;


public static final int sdcSecondMsisdnFilter = 19;
private static final int sdcSecondMsisdnSize = 15;


public static final int sdcFirstMsisdnFilter = 20;
private static final int sdcFirstMsisdnSize = 15;


public static final int sdcLinkDateFilter = 21;

public static final int sdcExpiryDateFilter = 22;




public SbdSdcDQO(){};

public SbdSdcDQO(final Integer sbdSubscriberId,
final String sbdDiallingNo,
final String sbdBillAcNo,
final Date sbdConnectDate,
final Date sbdDconnectDate,
final Date sbdTermDate,
final String sbdTitle,
final String sbdSurname,
final String sbdFirstname,
final String sbdGender,
final Date sbdDob,
final String sbdPassword,
final String sbdLocationCode,
final String sbdBillCycle,
final String sbdPackageCode,
final Date sbdBilledUpto,
final String sbdTariffPlan,
final Integer sdcSubscriberId,
final String sdcServiceCode,
final String sdcSecondMsisdn,
final String sdcFirstMsisdn,
final Date sdcLinkDate,
final Date sdcExpiryDate
){

this.sbdSubscriberId = sbdSubscriberId;
this.sbdDiallingNo = sbdDiallingNo;
this.sbdBillAcNo = sbdBillAcNo;
this.sbdConnectDate = sbdConnectDate;
this.sbdDconnectDate = sbdDconnectDate;
this.sbdTermDate = sbdTermDate;
this.sbdTitle = sbdTitle;
this.sbdSurname = sbdSurname;
this.sbdFirstname = sbdFirstname;
this.sbdGender = sbdGender;
this.sbdDob = sbdDob;
this.sbdPassword = sbdPassword;
this.sbdLocationCode = sbdLocationCode;
this.sbdBillCycle = sbdBillCycle;
this.sbdPackageCode = sbdPackageCode;
this.sbdBilledUpto = sbdBilledUpto;
this.sbdTariffPlan = sbdTariffPlan;
this.sdcSubscriberId = sdcSubscriberId;
this.sdcServiceCode = sdcServiceCode;
this.sdcSecondMsisdn = sdcSecondMsisdn;
this.sdcFirstMsisdn = sdcFirstMsisdn;
this.sdcLinkDate = sdcLinkDate;
this.sdcExpiryDate = sdcExpiryDate;
};


private static final int[] fieldSizes = new int[]{
0,
sbdDiallingNoSize,
sbdBillAcNoSize,
0,
0,
0,
sbdTitleSize,
sbdSurnameSize,
sbdFirstnameSize,
sbdGenderSize,
0,
sbdPasswordSize,
sbdLocationCodeSize,
sbdBillCycleSize,
sbdPackageCodeSize,
0,
sbdTariffPlanSize,
0,
sdcServiceCodeSize,
sdcSecondMsisdnSize,
sdcFirstMsisdnSize,
0,
0
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{this.sbdSubscriberId,
			((this.sbdDiallingNo == null) ? null : (this.sbdDiallingNo.length() <= sbdDiallingNoSize) ? this.sbdDiallingNo : this.sbdDiallingNo.substring(0, this.sbdDiallingNoSize)),
			((this.sbdBillAcNo == null) ? null : (this.sbdBillAcNo.length() <= sbdBillAcNoSize) ? this.sbdBillAcNo : this.sbdBillAcNo.substring(0, this.sbdBillAcNoSize)),
			this.sbdConnectDate,
			this.sbdDconnectDate,
			this.sbdTermDate,
			((this.sbdTitle == null) ? null : (this.sbdTitle.length() <= sbdTitleSize) ? this.sbdTitle : this.sbdTitle.substring(0, this.sbdTitleSize)),
			((this.sbdSurname == null) ? null : (this.sbdSurname.length() <= sbdSurnameSize) ? this.sbdSurname : this.sbdSurname.substring(0, this.sbdSurnameSize)),
			((this.sbdFirstname == null) ? null : (this.sbdFirstname.length() <= sbdFirstnameSize) ? this.sbdFirstname : this.sbdFirstname.substring(0, this.sbdFirstnameSize)),
			((this.sbdGender == null) ? null : (this.sbdGender.length() <= sbdGenderSize) ? this.sbdGender : this.sbdGender.substring(0, this.sbdGenderSize)),
			this.sbdDob,
			((this.sbdPassword == null) ? null : (this.sbdPassword.length() <= sbdPasswordSize) ? this.sbdPassword : this.sbdPassword.substring(0, this.sbdPasswordSize)),
			((this.sbdLocationCode == null) ? null : (this.sbdLocationCode.length() <= sbdLocationCodeSize) ? this.sbdLocationCode : this.sbdLocationCode.substring(0, this.sbdLocationCodeSize)),
			((this.sbdBillCycle == null) ? null : (this.sbdBillCycle.length() <= sbdBillCycleSize) ? this.sbdBillCycle : this.sbdBillCycle.substring(0, this.sbdBillCycleSize)),
			((this.sbdPackageCode == null) ? null : (this.sbdPackageCode.length() <= sbdPackageCodeSize) ? this.sbdPackageCode : this.sbdPackageCode.substring(0, this.sbdPackageCodeSize)),
			this.sbdBilledUpto,
			((this.sbdTariffPlan == null) ? null : (this.sbdTariffPlan.length() <= sbdTariffPlanSize) ? this.sbdTariffPlan : this.sbdTariffPlan.substring(0, this.sbdTariffPlanSize)),
			this.sdcSubscriberId,
			((this.sdcServiceCode == null) ? null : (this.sdcServiceCode.length() <= sdcServiceCodeSize) ? this.sdcServiceCode : this.sdcServiceCode.substring(0, this.sdcServiceCodeSize)),
			((this.sdcSecondMsisdn == null) ? null : (this.sdcSecondMsisdn.length() <= sdcSecondMsisdnSize) ? this.sdcSecondMsisdn : this.sdcSecondMsisdn.substring(0, this.sdcSecondMsisdnSize)),
			((this.sdcFirstMsisdn == null) ? null : (this.sdcFirstMsisdn.length() <= sdcFirstMsisdnSize) ? this.sdcFirstMsisdn : this.sdcFirstMsisdn.substring(0, this.sdcFirstMsisdnSize)),
			this.sdcLinkDate,
			this.sdcExpiryDate
		};
}


protected Integer versionNumber() {
	return null;
}



protected void versionNumber(Integer versionNumber) {
}



protected int[] fieldSizes() {
	return fieldSizes;
}



protected int[] fieldTypes() {
	return fieldTypes;
}



protected DAOArgs primaryKey() {
	return null; 
}



protected void set(Object[] fields) {
this.sbdSubscriberId = ((Integer)fields[0]);
this.sbdDiallingNo = rtrim((String)fields[1]);
this.sbdBillAcNo = rtrim((String)fields[2]);
this.sbdConnectDate = ((fields[3] == null) ? null : new Date(fields[3]));
this.sbdDconnectDate = ((fields[4] == null) ? null : new Date(fields[4]));
this.sbdTermDate = ((fields[5] == null) ? null : new Date(fields[5]));
this.sbdTitle = rtrim((String)fields[6]);
this.sbdSurname = rtrim((String)fields[7]);
this.sbdFirstname = rtrim((String)fields[8]);
this.sbdGender = rtrim((String)fields[9]);
this.sbdDob = ((fields[10] == null) ? null : new Date(fields[10]));
this.sbdPassword = rtrim((String)fields[11]);
this.sbdLocationCode = rtrim((String)fields[12]);
this.sbdBillCycle = rtrim((String)fields[13]);
this.sbdPackageCode = rtrim((String)fields[14]);
this.sbdBilledUpto = ((fields[15] == null) ? null : new Date(fields[15]));
this.sbdTariffPlan = rtrim((String)fields[16]);
this.sdcSubscriberId = ((Integer)fields[17]);
this.sdcServiceCode = rtrim((String)fields[18]);
this.sdcSecondMsisdn = rtrim((String)fields[19]);
this.sdcFirstMsisdn = rtrim((String)fields[20]);
this.sdcLinkDate = ((fields[21] == null) ? null : new Date(fields[21]));
this.sdcExpiryDate = ((fields[22] == null) ? null : new Date(fields[22]));
}


public void set(
final Integer sbdSubscriberId,
final String sbdDiallingNo,
final String sbdBillAcNo,
final Date sbdConnectDate,
final Date sbdDconnectDate,
final Date sbdTermDate,
final String sbdTitle,
final String sbdSurname,
final String sbdFirstname,
final String sbdGender,
final Date sbdDob,
final String sbdPassword,
final String sbdLocationCode,
final String sbdBillCycle,
final String sbdPackageCode,
final Date sbdBilledUpto,
final String sbdTariffPlan,
final Integer sdcSubscriberId,
final String sdcServiceCode,
final String sdcSecondMsisdn,
final String sdcFirstMsisdn,
final Date sdcLinkDate,
final Date sdcExpiryDate
)
{

this.sbdSubscriberId = sbdSubscriberId;
this.sbdDiallingNo = sbdDiallingNo;
this.sbdBillAcNo = sbdBillAcNo;
this.sbdConnectDate = sbdConnectDate;
this.sbdDconnectDate = sbdDconnectDate;
this.sbdTermDate = sbdTermDate;
this.sbdTitle = sbdTitle;
this.sbdSurname = sbdSurname;
this.sbdFirstname = sbdFirstname;
this.sbdGender = sbdGender;
this.sbdDob = sbdDob;
this.sbdPassword = sbdPassword;
this.sbdLocationCode = sbdLocationCode;
this.sbdBillCycle = sbdBillCycle;
this.sbdPackageCode = sbdPackageCode;
this.sbdBilledUpto = sbdBilledUpto;
this.sbdTariffPlan = sbdTariffPlan;
this.sdcSubscriberId = sdcSubscriberId;
this.sdcServiceCode = sdcServiceCode;
this.sdcSecondMsisdn = sdcSecondMsisdn;
this.sdcFirstMsisdn = sdcFirstMsisdn;
this.sdcLinkDate = sdcLinkDate;
this.sdcExpiryDate = sdcExpiryDate;
}

public Integer getSbdSubscriberId() {
	return sbdSubscriberId;
}

public void setSbdSubscriberId(Integer sbdSubscriberId) {
	this.sbdSubscriberId = sbdSubscriberId;
}

public String getSbdDiallingNo() {
	return sbdDiallingNo;
}

public void setSbdDiallingNo(String sbdDiallingNo) {
	this.sbdDiallingNo = sbdDiallingNo;
}

public String getSbdBillAcNo() {
	return sbdBillAcNo;
}

public void setSbdBillAcNo(String sbdBillAcNo) {
	this.sbdBillAcNo = sbdBillAcNo;
}

public Date getSbdConnectDate() {
	return sbdConnectDate;
}

public void setSbdConnectDate(Date sbdConnectDate) {
	this.sbdConnectDate = sbdConnectDate;
}

public Date getSbdDconnectDate() {
	return sbdDconnectDate;
}

public void setSbdDconnectDate(Date sbdDconnectDate) {
	this.sbdDconnectDate = sbdDconnectDate;
}

public Date getSbdTermDate() {
	return sbdTermDate;
}

public void setSbdTermDate(Date sbdTermDate) {
	this.sbdTermDate = sbdTermDate;
}

public String getSbdTitle() {
	return sbdTitle;
}

public void setSbdTitle(String sbdTitle) {
	this.sbdTitle = sbdTitle;
}

public String getSbdSurname() {
	return sbdSurname;
}

public void setSbdSurname(String sbdSurname) {
	this.sbdSurname = sbdSurname;
}

public String getSbdFirstname() {
	return sbdFirstname;
}

public void setSbdFirstname(String sbdFirstname) {
	this.sbdFirstname = sbdFirstname;
}

public String getSbdGender() {
	return sbdGender;
}

public void setSbdGender(String sbdGender) {
	this.sbdGender = sbdGender;
}

public Date getSbdDob() {
	return sbdDob;
}

public void setSbdDob(Date sbdDob) {
	this.sbdDob = sbdDob;
}

public String getSbdPassword() {
	return sbdPassword;
}

public void setSbdPassword(String sbdPassword) {
	this.sbdPassword = sbdPassword;
}

public String getSbdLocationCode() {
	return sbdLocationCode;
}

public void setSbdLocationCode(String sbdLocationCode) {
	this.sbdLocationCode = sbdLocationCode;
}

public String getSbdBillCycle() {
	return sbdBillCycle;
}

public void setSbdBillCycle(String sbdBillCycle) {
	this.sbdBillCycle = sbdBillCycle;
}

public String getSbdPackageCode() {
	return sbdPackageCode;
}

public void setSbdPackageCode(String sbdPackageCode) {
	this.sbdPackageCode = sbdPackageCode;
}

public Date getSbdBilledUpto() {
	return sbdBilledUpto;
}

public void setSbdBilledUpto(Date sbdBilledUpto) {
	this.sbdBilledUpto = sbdBilledUpto;
}

public String getSbdTariffPlan() {
	return sbdTariffPlan;
}

public void setSbdTariffPlan(String sbdTariffPlan) {
	this.sbdTariffPlan = sbdTariffPlan;
}

public Integer getSdcSubscriberId() {
	return sdcSubscriberId;
}

public void setSdcSubscriberId(Integer sdcSubscriberId) {
	this.sdcSubscriberId = sdcSubscriberId;
}

public String getSdcServiceCode() {
	return sdcServiceCode;
}

public void setSdcServiceCode(String sdcServiceCode) {
	this.sdcServiceCode = sdcServiceCode;
}

public String getSdcSecondMsisdn() {
	return sdcSecondMsisdn;
}

public void setSdcSecondMsisdn(String sdcSecondMsisdn) {
	this.sdcSecondMsisdn = sdcSecondMsisdn;
}

public String getSdcFirstMsisdn() {
	return sdcFirstMsisdn;
}

public void setSdcFirstMsisdn(String sdcFirstMsisdn) {
	this.sdcFirstMsisdn = sdcFirstMsisdn;
}

public Date getSdcLinkDate() {
	return sdcLinkDate;
}

public void setSdcLinkDate(Date sdcLinkDate) {
	this.sdcLinkDate = sdcLinkDate;
}

public Date getSdcExpiryDate() {
	return sdcExpiryDate;
}

public void setSdcExpiryDate(Date sdcExpiryDate) {
	this.sdcExpiryDate = sdcExpiryDate;
}


}
