package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class VcfVrbleChrgFeeDMO extends DBO implements Serializable {


private Integer vcfEquipId;
private String vcfCustomer;
private Integer vcfSubscriberId;
private String vcfVariableType;
private String vcfProductCode;
private String vcfDescription;
private String vcfMake;
private String vcfModel;
private String vcfInventryItemid;
private Date vcfStartDate;
private Date vcfEndDate;
private Integer vcfContrcLength;
private Double vcfFullAmt;
private Double vcfMonthAmt;
private String vcfNextPeriod;
private String vcfNextYear;
private Double vcfRemAmt;
private Short vcfRemPeriod;
private String vcfChargeCode;
private String vcfStatus;
private DateTime vcfTimestamp;



public static final int vcfEquipIdFilter = 0;
private static final int vcfEquipIdSize = 6;


public static final int vcfCustomerFilter = 1;
private static final int vcfCustomerSize = 8;


public static final int vcfSubscriberIdFilter = 2;

public static final int vcfVariableTypeFilter = 3;
private static final int vcfVariableTypeSize = 2;


public static final int vcfProductCodeFilter = 4;
private static final int vcfProductCodeSize = 20;


public static final int vcfDescriptionFilter = 5;
private static final int vcfDescriptionSize = 32;


public static final int vcfMakeFilter = 6;
private static final int vcfMakeSize = 100;


public static final int vcfModelFilter = 7;
private static final int vcfModelSize = 100;


public static final int vcfInventryItemidFilter = 8;
private static final int vcfInventryItemidSize = 14;


public static final int vcfStartDateFilter = 9;

public static final int vcfEndDateFilter = 10;

public static final int vcfContrcLengthFilter = 11;

public static final int vcfFullAmtFilter = 12;

public static final int vcfMonthAmtFilter = 13;

public static final int vcfNextPeriodFilter = 14;
private static final int vcfNextPeriodSize = 2;


public static final int vcfNextYearFilter = 15;
private static final int vcfNextYearSize = 4;


public static final int vcfRemAmtFilter = 16;

public static final int vcfRemPeriodFilter = 17;

public static final int vcfChargeCodeFilter = 18;
private static final int vcfChargeCodeSize = 5;


public static final int vcfStatusFilter = 19;
private static final int vcfStatusSize = 1;


public static final int vcfTimestampFilter = 20;




public VcfVrbleChrgFeeDMO(){};

public VcfVrbleChrgFeeDMO(final Integer vcfEquipId,
final String vcfCustomer,
final Integer vcfSubscriberId,
final String vcfVariableType,
final String vcfProductCode,
final String vcfDescription,
final String vcfMake,
final String vcfModel,
final String vcfInventryItemid,
final Date vcfStartDate,
final Date vcfEndDate,
final Integer vcfContrcLength,
final Double vcfFullAmt,
final Double vcfMonthAmt,
final String vcfNextPeriod,
final String vcfNextYear,
final Double vcfRemAmt,
final Short vcfRemPeriod,
final String vcfChargeCode,
final String vcfStatus,
final DateTime vcfTimestamp
){

this.vcfEquipId = vcfEquipId;
this.vcfCustomer = vcfCustomer;
this.vcfSubscriberId = vcfSubscriberId;
this.vcfVariableType = vcfVariableType;
this.vcfProductCode = vcfProductCode;
this.vcfDescription = vcfDescription;
this.vcfMake = vcfMake;
this.vcfModel = vcfModel;
this.vcfInventryItemid = vcfInventryItemid;
this.vcfStartDate = vcfStartDate;
this.vcfEndDate = vcfEndDate;
this.vcfContrcLength = vcfContrcLength;
this.vcfFullAmt = vcfFullAmt;
this.vcfMonthAmt = vcfMonthAmt;
this.vcfNextPeriod = vcfNextPeriod;
this.vcfNextYear = vcfNextYear;
this.vcfRemAmt = vcfRemAmt;
this.vcfRemPeriod = vcfRemPeriod;
this.vcfChargeCode = vcfChargeCode;
this.vcfStatus = vcfStatus;
this.vcfTimestamp = vcfTimestamp;
};


private static final int[] fieldSizes = new int[]{
vcfEquipIdSize,
vcfCustomerSize,
0,
vcfVariableTypeSize,
vcfProductCodeSize,
vcfDescriptionSize,
vcfMakeSize,
vcfModelSize,
vcfInventryItemidSize,
0,
0,
0,
0,
0,
vcfNextPeriodSize,
vcfNextYearSize,
0,
0,
vcfChargeCodeSize,
vcfStatusSize,
0
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_INTEGER,
FIELD_TYPE_DOUBLE,
FIELD_TYPE_DOUBLE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DOUBLE,
FIELD_TYPE_SHORT,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{this.vcfEquipId,
			((this.vcfCustomer == null) ? null : (this.vcfCustomer.length() <= vcfCustomerSize) ? this.vcfCustomer : this.vcfCustomer.substring(0, this.vcfCustomerSize)),
			this.vcfSubscriberId,
			((this.vcfVariableType == null) ? null : (this.vcfVariableType.length() <= vcfVariableTypeSize) ? this.vcfVariableType : this.vcfVariableType.substring(0, this.vcfVariableTypeSize)),
			((this.vcfProductCode == null) ? null : (this.vcfProductCode.length() <= vcfProductCodeSize) ? this.vcfProductCode : this.vcfProductCode.substring(0, this.vcfProductCodeSize)),
			((this.vcfDescription == null) ? null : (this.vcfDescription.length() <= vcfDescriptionSize) ? this.vcfDescription : this.vcfDescription.substring(0, this.vcfDescriptionSize)),
			((this.vcfMake == null) ? null : (this.vcfMake.length() <= vcfMakeSize) ? this.vcfMake : this.vcfMake.substring(0, this.vcfMakeSize)),
			((this.vcfModel == null) ? null : (this.vcfModel.length() <= vcfModelSize) ? this.vcfModel : this.vcfModel.substring(0, this.vcfModelSize)),
			((this.vcfInventryItemid == null) ? null : (this.vcfInventryItemid.length() <= vcfInventryItemidSize) ? this.vcfInventryItemid : this.vcfInventryItemid.substring(0, this.vcfInventryItemidSize)),
			this.vcfStartDate,
			this.vcfEndDate,
			this.vcfContrcLength,
			this.vcfFullAmt,
			this.vcfMonthAmt,
			((this.vcfNextPeriod == null) ? null : (this.vcfNextPeriod.length() <= vcfNextPeriodSize) ? this.vcfNextPeriod : this.vcfNextPeriod.substring(0, this.vcfNextPeriodSize)),
			((this.vcfNextYear == null) ? null : (this.vcfNextYear.length() <= vcfNextYearSize) ? this.vcfNextYear : this.vcfNextYear.substring(0, this.vcfNextYearSize)),
			this.vcfRemAmt,
			this.vcfRemPeriod,
			((this.vcfChargeCode == null) ? null : (this.vcfChargeCode.length() <= vcfChargeCodeSize) ? this.vcfChargeCode : this.vcfChargeCode.substring(0, this.vcfChargeCodeSize)),
			((this.vcfStatus == null) ? null : (this.vcfStatus.length() <= vcfStatusSize) ? this.vcfStatus : this.vcfStatus.substring(0, this.vcfStatusSize)),
			this.vcfTimestamp
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
	return new DAOArgs(1).arg(this.vcfEquipId); 
}



protected void set(Object[] fields) {
this.vcfEquipId = (Integer)fields[0];
this.vcfCustomer = rtrim((String)fields[1]);
this.vcfSubscriberId = ((Integer)fields[2]);
this.vcfVariableType = rtrim((String)fields[3]);
this.vcfProductCode = rtrim((String)fields[4]);
this.vcfDescription = rtrim((String)fields[5]);
this.vcfMake = rtrim((String)fields[6]);
this.vcfModel = rtrim((String)fields[7]);
this.vcfInventryItemid = rtrim((String)fields[8]);
this.vcfStartDate = ((fields[9] == null)? null : new Date(fields[9]));
this.vcfEndDate = ((fields[10] == null)? null : new Date(fields[10]));
this.vcfContrcLength = ((Integer)fields[11]);
this.vcfFullAmt = (Double)fields[12];
this.vcfMonthAmt = (Double)fields[13];
this.vcfNextPeriod = rtrim((String)fields[14]);
this.vcfNextYear = rtrim((String)fields[15]);
this.vcfRemAmt = (Double)fields[16];
this.vcfRemPeriod = ((Short)fields[17]);
this.vcfChargeCode = rtrim((String)fields[18]);
this.vcfStatus = rtrim((String)fields[19]);
this.vcfTimestamp = ((fields[20] == null)? null : new DateTime((java.util.Date)fields[20]));
}


public void set(
final Integer vcfEquipId,
final String vcfCustomer,
final Integer vcfSubscriberId,
final String vcfVariableType,
final String vcfProductCode,
final String vcfDescription,
final String vcfMake,
final String vcfModel,
final String vcfInventryItemid,
final Date vcfStartDate,
final Date vcfEndDate,
final Integer vcfContrcLength,
final Double vcfFullAmt,
final Double vcfMonthAmt,
final String vcfNextPeriod,
final String vcfNextYear,
final Double vcfRemAmt,
final Short vcfRemPeriod,
final String vcfChargeCode,
final String vcfStatus,
final DateTime vcfTimestamp
)
{

this.vcfEquipId = vcfEquipId;
this.vcfCustomer = vcfCustomer;
this.vcfSubscriberId = vcfSubscriberId;
this.vcfVariableType = vcfVariableType;
this.vcfProductCode = vcfProductCode;
this.vcfDescription = vcfDescription;
this.vcfMake = vcfMake;
this.vcfModel = vcfModel;
this.vcfInventryItemid = vcfInventryItemid;
this.vcfStartDate = vcfStartDate;
this.vcfEndDate = vcfEndDate;
this.vcfContrcLength = vcfContrcLength;
this.vcfFullAmt = vcfFullAmt;
this.vcfMonthAmt = vcfMonthAmt;
this.vcfNextPeriod = vcfNextPeriod;
this.vcfNextYear = vcfNextYear;
this.vcfRemAmt = vcfRemAmt;
this.vcfRemPeriod = vcfRemPeriod;
this.vcfChargeCode = vcfChargeCode;
this.vcfStatus = vcfStatus;
this.vcfTimestamp = vcfTimestamp;
}

public Integer getVcfEquipId() {
	return vcfEquipId;
}

public void setVcfEquipId(Integer vcfEquipId) {
	this.vcfEquipId = vcfEquipId;
}

public String getVcfCustomer() {
	return vcfCustomer;
}

public void setVcfCustomer(String vcfCustomer) {
	this.vcfCustomer = vcfCustomer;
}

public Integer getVcfSubscriberId() {
	return vcfSubscriberId;
}

public void setVcfSubscriberId(Integer vcfSubscriberId) {
	this.vcfSubscriberId = vcfSubscriberId;
}

public String getVcfVariableType() {
	return vcfVariableType;
}

public void setVcfVariableType(String vcfVariableType) {
	this.vcfVariableType = vcfVariableType;
}

public String getVcfProductCode() {
	return vcfProductCode;
}

public void setVcfProductCode(String vcfProductCode) {
	this.vcfProductCode = vcfProductCode;
}

public String getVcfDescription() {
	return vcfDescription;
}

public void setVcfDescription(String vcfDescription) {
	this.vcfDescription = vcfDescription;
}

public String getVcfMake() {
	return vcfMake;
}

public void setVcfMake(String vcfMake) {
	this.vcfMake = vcfMake;
}

public String getVcfModel() {
	return vcfModel;
}

public void setVcfModel(String vcfModel) {
	this.vcfModel = vcfModel;
}

public String getVcfInventryItemid() {
	return vcfInventryItemid;
}

public void setVcfInventryItemid(String vcfInventryItemid) {
	this.vcfInventryItemid = vcfInventryItemid;
}

public Date getVcfStartDate() {
	return vcfStartDate;
}

public void setVcfStartDate(Date vcfStartDate) {
	this.vcfStartDate = vcfStartDate;
}

public Date getVcfEndDate() {
	return vcfEndDate;
}

public void setVcfEndDate(Date vcfEndDate) {
	this.vcfEndDate = vcfEndDate;
}

public Integer getVcfContrcLength() {
	return vcfContrcLength;
}

public void setVcfContrcLength(Integer vcfContrcLength) {
	this.vcfContrcLength = vcfContrcLength;
}

public Double getVcfFullAmt() {
	return vcfFullAmt;
}

public void setVcfFullAmt(Double vcfFullAmt) {
	this.vcfFullAmt = vcfFullAmt;
}

public Double getVcfMonthAmt() {
	return vcfMonthAmt;
}

public void setVcfMonthAmt(Double vcfMonthAmt) {
	this.vcfMonthAmt = vcfMonthAmt;
}

public String getVcfNextPeriod() {
	return vcfNextPeriod;
}

public void setVcfNextPeriod(String vcfNextPeriod) {
	this.vcfNextPeriod = vcfNextPeriod;
}

public String getVcfNextYear() {
	return vcfNextYear;
}

public void setVcfNextYear(String vcfNextYear) {
	this.vcfNextYear = vcfNextYear;
}

public Double getVcfRemAmt() {
	return vcfRemAmt;
}

public void setVcfRemAmt(Double vcfRemAmt) {
	this.vcfRemAmt = vcfRemAmt;
}

public Short getVcfRemPeriod() {
	return vcfRemPeriod;
}

public void setVcfRemPeriod(Short vcfRemPeriod) {
	this.vcfRemPeriod = vcfRemPeriod;
}

public String getVcfChargeCode() {
	return vcfChargeCode;
}

public void setVcfChargeCode(String vcfChargeCode) {
	this.vcfChargeCode = vcfChargeCode;
}

public String getVcfStatus() {
	return vcfStatus;
}

public void setVcfStatus(String vcfStatus) {
	this.vcfStatus = vcfStatus;
}

public DateTime getVcfTimestamp() {
	return vcfTimestamp;
}

public void setVcfTimestamp(Date vcfTimestamp) {
	this.vcfTimestamp = new DateTime();
}

public void setVcfTimestamp(DateTime vcfTimestamp) {
	this.vcfTimestamp = vcfTimestamp;
}

}