package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PoheadmDMO extends DBO implements Serializable {


private String orderNo;
private String alpha;
private String supplier;
private String address1;
private String address2;
private String address3;
private String address4;
private String address5;
private Date dateEntered;
private Date dateRequired;
private Date dateCompleted;
private String supplierRef;
private String currency;
private String status;
private String holdIndicator;
private BigDecimal exchangeRate;
private String parentOrder;
private String mrpIncluded;
private String spare;
private String nlCompany;
private String plCompany;
private String committedFlag;
private String committedYear;
private String origReqNo;
private String amendReqNo;
private String origPaperReqNo;
private String origReqId;
private String tranCode1;
private String tranCode2;
private String tranCode3;
private String memo1;
private String memo2;
private Date lastGrnDate;
private Date lastInvLogDate;
private String vatType;
private String priceList;
private String discountCategory;
private String buyerId;
private String deliveryAddress1;
private String deliveryAddress2;
private String deliveryAddress3;
private String deliveryAddress4;
private String deliveryAddress5;
private String deliveryAddress6;
private String firmPlanned;



public static final int orderNoFilter = 0;
private static final int orderNoSize = 10;


public static final int alphaFilter = 1;
private static final int alphaSize = 8;


public static final int supplierFilter = 2;
private static final int supplierSize = 8;


public static final int address1Filter = 3;
private static final int address1Size = 32;


public static final int address2Filter = 4;
private static final int address2Size = 32;


public static final int address3Filter = 5;
private static final int address3Size = 32;


public static final int address4Filter = 6;
private static final int address4Size = 32;


public static final int address5Filter = 7;
private static final int address5Size = 32;


public static final int dateEnteredFilter = 8;

public static final int dateRequiredFilter = 9;

public static final int dateCompletedFilter = 10;

public static final int supplierRefFilter = 11;
private static final int supplierRefSize = 20;


public static final int currencyFilter = 12;
private static final int currencySize = 3;


public static final int statusFilter = 13;
private static final int statusSize = 1;


public static final int holdIndicatorFilter = 14;
private static final int holdIndicatorSize = 1;


public static final int exchangeRateFilter = 15;

public static final int parentOrderFilter = 16;
private static final int parentOrderSize = 10;


public static final int mrpIncludedFilter = 17;
private static final int mrpIncludedSize = 1;


public static final int spareFilter = 18;
private static final int spareSize = 14;


public static final int nlCompanyFilter = 19;
private static final int nlCompanySize = 16;


public static final int plCompanyFilter = 20;
private static final int plCompanySize = 8;


public static final int committedFlagFilter = 21;
private static final int committedFlagSize = 1;


public static final int committedYearFilter = 22;
private static final int committedYearSize = 1;


public static final int origReqNoFilter = 23;
private static final int origReqNoSize = 10;


public static final int amendReqNoFilter = 24;
private static final int amendReqNoSize = 10;


public static final int origPaperReqNoFilter = 25;
private static final int origPaperReqNoSize = 10;


public static final int origReqIdFilter = 26;
private static final int origReqIdSize = 8;


public static final int tranCode1Filter = 27;
private static final int tranCode1Size = 10;


public static final int tranCode2Filter = 28;
private static final int tranCode2Size = 10;


public static final int tranCode3Filter = 29;
private static final int tranCode3Size = 10;


public static final int memo1Filter = 30;
private static final int memo1Size = 10;


public static final int memo2Filter = 31;
private static final int memo2Size = 10;


public static final int lastGrnDateFilter = 32;

public static final int lastInvLogDateFilter = 33;

public static final int vatTypeFilter = 34;
private static final int vatTypeSize = 10;


public static final int priceListFilter = 35;
private static final int priceListSize = 3;


public static final int discountCategoryFilter = 36;
private static final int discountCategorySize = 4;


public static final int buyerIdFilter = 37;
private static final int buyerIdSize = 8;


public static final int deliveryAddress1Filter = 38;
private static final int deliveryAddress1Size = 32;


public static final int deliveryAddress2Filter = 39;
private static final int deliveryAddress2Size = 32;


public static final int deliveryAddress3Filter = 40;
private static final int deliveryAddress3Size = 32;


public static final int deliveryAddress4Filter = 41;
private static final int deliveryAddress4Size = 32;


public static final int deliveryAddress5Filter = 42;
private static final int deliveryAddress5Size = 32;


public static final int deliveryAddress6Filter = 43;
private static final int deliveryAddress6Size = 32;


public static final int firmPlannedFilter = 44;
private static final int firmPlannedSize = 1;





public PoheadmDMO(){};

public PoheadmDMO(final String orderNo,
final String alpha,
final String supplier,
final String address1,
final String address2,
final String address3,
final String address4,
final String address5,
final Date dateEntered,
final Date dateRequired,
final Date dateCompleted,
final String supplierRef,
final String currency,
final String status,
final String holdIndicator,
final BigDecimal exchangeRate,
final String parentOrder,
final String mrpIncluded,
final String spare,
final String nlCompany,
final String plCompany,
final String committedFlag,
final String committedYear,
final String origReqNo,
final String amendReqNo,
final String origPaperReqNo,
final String origReqId,
final String tranCode1,
final String tranCode2,
final String tranCode3,
final String memo1,
final String memo2,
final Date lastGrnDate,
final Date lastInvLogDate,
final String vatType,
final String priceList,
final String discountCategory,
final String buyerId,
final String deliveryAddress1,
final String deliveryAddress2,
final String deliveryAddress3,
final String deliveryAddress4,
final String deliveryAddress5,
final String deliveryAddress6,
final String firmPlanned
){

this.orderNo = orderNo;
this.alpha = alpha;
this.supplier = supplier;
this.address1 = address1;
this.address2 = address2;
this.address3 = address3;
this.address4 = address4;
this.address5 = address5;
this.dateEntered = dateEntered;
this.dateRequired = dateRequired;
this.dateCompleted = dateCompleted;
this.supplierRef = supplierRef;
this.currency = currency;
this.status = status;
this.holdIndicator = holdIndicator;
this.exchangeRate = exchangeRate;
this.parentOrder = parentOrder;
this.mrpIncluded = mrpIncluded;
this.spare = spare;
this.nlCompany = nlCompany;
this.plCompany = plCompany;
this.committedFlag = committedFlag;
this.committedYear = committedYear;
this.origReqNo = origReqNo;
this.amendReqNo = amendReqNo;
this.origPaperReqNo = origPaperReqNo;
this.origReqId = origReqId;
this.tranCode1 = tranCode1;
this.tranCode2 = tranCode2;
this.tranCode3 = tranCode3;
this.memo1 = memo1;
this.memo2 = memo2;
this.lastGrnDate = lastGrnDate;
this.lastInvLogDate = lastInvLogDate;
this.vatType = vatType;
this.priceList = priceList;
this.discountCategory = discountCategory;
this.buyerId = buyerId;
this.deliveryAddress1 = deliveryAddress1;
this.deliveryAddress2 = deliveryAddress2;
this.deliveryAddress3 = deliveryAddress3;
this.deliveryAddress4 = deliveryAddress4;
this.deliveryAddress5 = deliveryAddress5;
this.deliveryAddress6 = deliveryAddress6;
this.firmPlanned = firmPlanned;
};


private static final int[] fieldSizes = new int[]{
orderNoSize,
alphaSize,
supplierSize,
address1Size,
address2Size,
address3Size,
address4Size,
address5Size,
0,
0,
0,
supplierRefSize,
currencySize,
statusSize,
holdIndicatorSize,
0,
parentOrderSize,
mrpIncludedSize,
spareSize,
nlCompanySize,
plCompanySize,
committedFlagSize,
committedYearSize,
origReqNoSize,
amendReqNoSize,
origPaperReqNoSize,
origReqIdSize,
tranCode1Size,
tranCode2Size,
tranCode3Size,
memo1Size,
memo2Size,
0,
0,
vatTypeSize,
priceListSize,
discountCategorySize,
buyerIdSize,
deliveryAddress1Size,
deliveryAddress2Size,
deliveryAddress3Size,
deliveryAddress4Size,
deliveryAddress5Size,
deliveryAddress6Size,
firmPlannedSize
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{			((this.orderNo == null) ? null : (this.orderNo.length() <= orderNoSize) ? this.orderNo : this.orderNo.substring(0, this.orderNoSize)),
			((this.alpha == null) ? null : (this.alpha.length() <= alphaSize) ? this.alpha : this.alpha.substring(0, this.alphaSize)),
			((this.supplier == null) ? null : (this.supplier.length() <= supplierSize) ? this.supplier : this.supplier.substring(0, this.supplierSize)),
			((this.address1 == null) ? null : (this.address1.length() <= address1Size) ? this.address1 : this.address1.substring(0, this.address1Size)),
			((this.address2 == null) ? null : (this.address2.length() <= address2Size) ? this.address2 : this.address2.substring(0, this.address2Size)),
			((this.address3 == null) ? null : (this.address3.length() <= address3Size) ? this.address3 : this.address3.substring(0, this.address3Size)),
			((this.address4 == null) ? null : (this.address4.length() <= address4Size) ? this.address4 : this.address4.substring(0, this.address4Size)),
			((this.address5 == null) ? null : (this.address5.length() <= address5Size) ? this.address5 : this.address5.substring(0, this.address5Size)),
			this.dateEntered,
			this.dateRequired,
			this.dateCompleted,
			((this.supplierRef == null) ? null : (this.supplierRef.length() <= supplierRefSize) ? this.supplierRef : this.supplierRef.substring(0, this.supplierRefSize)),
			((this.currency == null) ? null : (this.currency.length() <= currencySize) ? this.currency : this.currency.substring(0, this.currencySize)),
			((this.status == null) ? null : (this.status.length() <= statusSize) ? this.status : this.status.substring(0, this.statusSize)),
			((this.holdIndicator == null) ? null : (this.holdIndicator.length() <= holdIndicatorSize) ? this.holdIndicator : this.holdIndicator.substring(0, this.holdIndicatorSize)),
			this.exchangeRate,
			((this.parentOrder == null) ? null : (this.parentOrder.length() <= parentOrderSize) ? this.parentOrder : this.parentOrder.substring(0, this.parentOrderSize)),
			((this.mrpIncluded == null) ? null : (this.mrpIncluded.length() <= mrpIncludedSize) ? this.mrpIncluded : this.mrpIncluded.substring(0, this.mrpIncludedSize)),
			((this.spare == null) ? null : (this.spare.length() <= spareSize) ? this.spare : this.spare.substring(0, this.spareSize)),
			((this.nlCompany == null) ? null : (this.nlCompany.length() <= nlCompanySize) ? this.nlCompany : this.nlCompany.substring(0, this.nlCompanySize)),
			((this.plCompany == null) ? null : (this.plCompany.length() <= plCompanySize) ? this.plCompany : this.plCompany.substring(0, this.plCompanySize)),
			((this.committedFlag == null) ? null : (this.committedFlag.length() <= committedFlagSize) ? this.committedFlag : this.committedFlag.substring(0, this.committedFlagSize)),
			((this.committedYear == null) ? null : (this.committedYear.length() <= committedYearSize) ? this.committedYear : this.committedYear.substring(0, this.committedYearSize)),
			((this.origReqNo == null) ? null : (this.origReqNo.length() <= origReqNoSize) ? this.origReqNo : this.origReqNo.substring(0, this.origReqNoSize)),
			((this.amendReqNo == null) ? null : (this.amendReqNo.length() <= amendReqNoSize) ? this.amendReqNo : this.amendReqNo.substring(0, this.amendReqNoSize)),
			((this.origPaperReqNo == null) ? null : (this.origPaperReqNo.length() <= origPaperReqNoSize) ? this.origPaperReqNo : this.origPaperReqNo.substring(0, this.origPaperReqNoSize)),
			((this.origReqId == null) ? null : (this.origReqId.length() <= origReqIdSize) ? this.origReqId : this.origReqId.substring(0, this.origReqIdSize)),
			((this.tranCode1 == null) ? null : (this.tranCode1.length() <= tranCode1Size) ? this.tranCode1 : this.tranCode1.substring(0, this.tranCode1Size)),
			((this.tranCode2 == null) ? null : (this.tranCode2.length() <= tranCode2Size) ? this.tranCode2 : this.tranCode2.substring(0, this.tranCode2Size)),
			((this.tranCode3 == null) ? null : (this.tranCode3.length() <= tranCode3Size) ? this.tranCode3 : this.tranCode3.substring(0, this.tranCode3Size)),
			((this.memo1 == null) ? null : (this.memo1.length() <= memo1Size) ? this.memo1 : this.memo1.substring(0, this.memo1Size)),
			((this.memo2 == null) ? null : (this.memo2.length() <= memo2Size) ? this.memo2 : this.memo2.substring(0, this.memo2Size)),
			this.lastGrnDate,
			this.lastInvLogDate,
			((this.vatType == null) ? null : (this.vatType.length() <= vatTypeSize) ? this.vatType : this.vatType.substring(0, this.vatTypeSize)),
			((this.priceList == null) ? null : (this.priceList.length() <= priceListSize) ? this.priceList : this.priceList.substring(0, this.priceListSize)),
			((this.discountCategory == null) ? null : (this.discountCategory.length() <= discountCategorySize) ? this.discountCategory : this.discountCategory.substring(0, this.discountCategorySize)),
			((this.buyerId == null) ? null : (this.buyerId.length() <= buyerIdSize) ? this.buyerId : this.buyerId.substring(0, this.buyerIdSize)),
			((this.deliveryAddress1 == null) ? null : (this.deliveryAddress1.length() <= deliveryAddress1Size) ? this.deliveryAddress1 : this.deliveryAddress1.substring(0, this.deliveryAddress1Size)),
			((this.deliveryAddress2 == null) ? null : (this.deliveryAddress2.length() <= deliveryAddress2Size) ? this.deliveryAddress2 : this.deliveryAddress2.substring(0, this.deliveryAddress2Size)),
			((this.deliveryAddress3 == null) ? null : (this.deliveryAddress3.length() <= deliveryAddress3Size) ? this.deliveryAddress3 : this.deliveryAddress3.substring(0, this.deliveryAddress3Size)),
			((this.deliveryAddress4 == null) ? null : (this.deliveryAddress4.length() <= deliveryAddress4Size) ? this.deliveryAddress4 : this.deliveryAddress4.substring(0, this.deliveryAddress4Size)),
			((this.deliveryAddress5 == null) ? null : (this.deliveryAddress5.length() <= deliveryAddress5Size) ? this.deliveryAddress5 : this.deliveryAddress5.substring(0, this.deliveryAddress5Size)),
			((this.deliveryAddress6 == null) ? null : (this.deliveryAddress6.length() <= deliveryAddress6Size) ? this.deliveryAddress6 : this.deliveryAddress6.substring(0, this.deliveryAddress6Size)),
			((this.firmPlanned == null) ? null : (this.firmPlanned.length() <= firmPlannedSize) ? this.firmPlanned : this.firmPlanned.substring(0, this.firmPlannedSize))
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
	return new DAOArgs(1).arg(this.orderNo); 
}



protected void set(Object[] fields) {
this.orderNo = rtrim((String)fields[0]);
this.alpha = rtrim((String)fields[1]);
this.supplier = rtrim((String)fields[2]);
this.address1 = rtrim((String)fields[3]);
this.address2 = rtrim((String)fields[4]);
this.address3 = rtrim((String)fields[5]);
this.address4 = rtrim((String)fields[6]);
this.address5 = rtrim((String)fields[7]);
this.dateEntered = ((fields[8] == null)? null : new Date(fields[8]));
this.dateRequired = ((fields[9] == null)? null : new Date(fields[9]));
this.dateCompleted = ((fields[10] == null)? null : new Date(fields[10]));
this.supplierRef = rtrim((String)fields[11]);
this.currency = rtrim((String)fields[12]);
this.status = rtrim((String)fields[13]);
this.holdIndicator = rtrim((String)fields[14]);
this.exchangeRate = ((BigDecimal)fields[15]);
this.parentOrder = rtrim((String)fields[16]);
this.mrpIncluded = rtrim((String)fields[17]);
this.spare = rtrim((String)fields[18]);
this.nlCompany = rtrim((String)fields[19]);
this.plCompany = rtrim((String)fields[20]);
this.committedFlag = rtrim((String)fields[21]);
this.committedYear = rtrim((String)fields[22]);
this.origReqNo = rtrim((String)fields[23]);
this.amendReqNo = rtrim((String)fields[24]);
this.origPaperReqNo = rtrim((String)fields[25]);
this.origReqId = rtrim((String)fields[26]);
this.tranCode1 = rtrim((String)fields[27]);
this.tranCode2 = rtrim((String)fields[28]);
this.tranCode3 = rtrim((String)fields[29]);
this.memo1 = rtrim((String)fields[30]);
this.memo2 = rtrim((String)fields[31]);
this.lastGrnDate = ((fields[32] == null)? null : new Date(fields[32]));
this.lastInvLogDate = ((fields[33] == null)? null : new Date(fields[33]));
this.vatType = rtrim((String)fields[34]);
this.priceList = rtrim((String)fields[35]);
this.discountCategory = rtrim((String)fields[36]);
this.buyerId = rtrim((String)fields[37]);
this.deliveryAddress1 = rtrim((String)fields[38]);
this.deliveryAddress2 = rtrim((String)fields[39]);
this.deliveryAddress3 = rtrim((String)fields[40]);
this.deliveryAddress4 = rtrim((String)fields[41]);
this.deliveryAddress5 = rtrim((String)fields[42]);
this.deliveryAddress6 = rtrim((String)fields[43]);
this.firmPlanned = rtrim((String)fields[44]);
}


public void set(
final String orderNo,
final String alpha,
final String supplier,
final String address1,
final String address2,
final String address3,
final String address4,
final String address5,
final Date dateEntered,
final Date dateRequired,
final Date dateCompleted,
final String supplierRef,
final String currency,
final String status,
final String holdIndicator,
final BigDecimal exchangeRate,
final String parentOrder,
final String mrpIncluded,
final String spare,
final String nlCompany,
final String plCompany,
final String committedFlag,
final String committedYear,
final String origReqNo,
final String amendReqNo,
final String origPaperReqNo,
final String origReqId,
final String tranCode1,
final String tranCode2,
final String tranCode3,
final String memo1,
final String memo2,
final Date lastGrnDate,
final Date lastInvLogDate,
final String vatType,
final String priceList,
final String discountCategory,
final String buyerId,
final String deliveryAddress1,
final String deliveryAddress2,
final String deliveryAddress3,
final String deliveryAddress4,
final String deliveryAddress5,
final String deliveryAddress6,
final String firmPlanned
)
{

this.orderNo = orderNo;
this.alpha = alpha;
this.supplier = supplier;
this.address1 = address1;
this.address2 = address2;
this.address3 = address3;
this.address4 = address4;
this.address5 = address5;
this.dateEntered = dateEntered;
this.dateRequired = dateRequired;
this.dateCompleted = dateCompleted;
this.supplierRef = supplierRef;
this.currency = currency;
this.status = status;
this.holdIndicator = holdIndicator;
this.exchangeRate = exchangeRate;
this.parentOrder = parentOrder;
this.mrpIncluded = mrpIncluded;
this.spare = spare;
this.nlCompany = nlCompany;
this.plCompany = plCompany;
this.committedFlag = committedFlag;
this.committedYear = committedYear;
this.origReqNo = origReqNo;
this.amendReqNo = amendReqNo;
this.origPaperReqNo = origPaperReqNo;
this.origReqId = origReqId;
this.tranCode1 = tranCode1;
this.tranCode2 = tranCode2;
this.tranCode3 = tranCode3;
this.memo1 = memo1;
this.memo2 = memo2;
this.lastGrnDate = lastGrnDate;
this.lastInvLogDate = lastInvLogDate;
this.vatType = vatType;
this.priceList = priceList;
this.discountCategory = discountCategory;
this.buyerId = buyerId;
this.deliveryAddress1 = deliveryAddress1;
this.deliveryAddress2 = deliveryAddress2;
this.deliveryAddress3 = deliveryAddress3;
this.deliveryAddress4 = deliveryAddress4;
this.deliveryAddress5 = deliveryAddress5;
this.deliveryAddress6 = deliveryAddress6;
this.firmPlanned = firmPlanned;
}

public String getOrderNo() {
	return orderNo;
}

public void setOrderNo(String orderNo) {
	this.orderNo = orderNo;
}

public String getAlpha() {
	return alpha;
}

public void setAlpha(String alpha) {
	this.alpha = alpha;
}

public String getSupplier() {
	return supplier;
}

public void setSupplier(String supplier) {
	this.supplier = supplier;
}

public String getAddress1() {
	return address1;
}

public void setAddress1(String address1) {
	this.address1 = address1;
}

public String getAddress2() {
	return address2;
}

public void setAddress2(String address2) {
	this.address2 = address2;
}

public String getAddress3() {
	return address3;
}

public void setAddress3(String address3) {
	this.address3 = address3;
}

public String getAddress4() {
	return address4;
}

public void setAddress4(String address4) {
	this.address4 = address4;
}

public String getAddress5() {
	return address5;
}

public void setAddress5(String address5) {
	this.address5 = address5;
}

public Date getDateEntered() {
	return dateEntered;
}

public void setDateEntered(Date dateEntered) {
	this.dateEntered = dateEntered;
}

public Date getDateRequired() {
	return dateRequired;
}

public void setDateRequired(Date dateRequired) {
	this.dateRequired = dateRequired;
}

public Date getDateCompleted() {
	return dateCompleted;
}

public void setDateCompleted(Date dateCompleted) {
	this.dateCompleted = dateCompleted;
}

public String getSupplierRef() {
	return supplierRef;
}

public void setSupplierRef(String supplierRef) {
	this.supplierRef = supplierRef;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getHoldIndicator() {
	return holdIndicator;
}

public void setHoldIndicator(String holdIndicator) {
	this.holdIndicator = holdIndicator;
}

public BigDecimal getExchangeRate() {
	return exchangeRate;
}

public void setExchangeRate(BigDecimal exchangeRate) {
	this.exchangeRate = exchangeRate;
}

public String getParentOrder() {
	return parentOrder;
}

public void setParentOrder(String parentOrder) {
	this.parentOrder = parentOrder;
}

public String getMrpIncluded() {
	return mrpIncluded;
}

public void setMrpIncluded(String mrpIncluded) {
	this.mrpIncluded = mrpIncluded;
}

public String getSpare() {
	return spare;
}

public void setSpare(String spare) {
	this.spare = spare;
}

public String getNlCompany() {
	return nlCompany;
}

public void setNlCompany(String nlCompany) {
	this.nlCompany = nlCompany;
}

public String getPlCompany() {
	return plCompany;
}

public void setPlCompany(String plCompany) {
	this.plCompany = plCompany;
}

public String getCommittedFlag() {
	return committedFlag;
}

public void setCommittedFlag(String committedFlag) {
	this.committedFlag = committedFlag;
}

public String getCommittedYear() {
	return committedYear;
}

public void setCommittedYear(String committedYear) {
	this.committedYear = committedYear;
}

public String getOrigReqNo() {
	return origReqNo;
}

public void setOrigReqNo(String origReqNo) {
	this.origReqNo = origReqNo;
}

public String getAmendReqNo() {
	return amendReqNo;
}

public void setAmendReqNo(String amendReqNo) {
	this.amendReqNo = amendReqNo;
}

public String getOrigPaperReqNo() {
	return origPaperReqNo;
}

public void setOrigPaperReqNo(String origPaperReqNo) {
	this.origPaperReqNo = origPaperReqNo;
}

public String getOrigReqId() {
	return origReqId;
}

public void setOrigReqId(String origReqId) {
	this.origReqId = origReqId;
}

public String getTranCode1() {
	return tranCode1;
}

public void setTranCode1(String tranCode1) {
	this.tranCode1 = tranCode1;
}

public String getTranCode2() {
	return tranCode2;
}

public void setTranCode2(String tranCode2) {
	this.tranCode2 = tranCode2;
}

public String getTranCode3() {
	return tranCode3;
}

public void setTranCode3(String tranCode3) {
	this.tranCode3 = tranCode3;
}

public String getMemo1() {
	return memo1;
}

public void setMemo1(String memo1) {
	this.memo1 = memo1;
}

public String getMemo2() {
	return memo2;
}

public void setMemo2(String memo2) {
	this.memo2 = memo2;
}

public Date getLastGrnDate() {
	return lastGrnDate;
}

public void setLastGrnDate(Date lastGrnDate) {
	this.lastGrnDate = lastGrnDate;
}

public Date getLastInvLogDate() {
	return lastInvLogDate;
}

public void setLastInvLogDate(Date lastInvLogDate) {
	this.lastInvLogDate = lastInvLogDate;
}

public String getVatType() {
	return vatType;
}

public void setVatType(String vatType) {
	this.vatType = vatType;
}

public String getPriceList() {
	return priceList;
}

public void setPriceList(String priceList) {
	this.priceList = priceList;
}

public String getDiscountCategory() {
	return discountCategory;
}

public void setDiscountCategory(String discountCategory) {
	this.discountCategory = discountCategory;
}

public String getBuyerId() {
	return buyerId;
}

public void setBuyerId(String buyerId) {
	this.buyerId = buyerId;
}

public String getDeliveryAddress1() {
	return deliveryAddress1;
}

public void setDeliveryAddress1(String deliveryAddress1) {
	this.deliveryAddress1 = deliveryAddress1;
}

public String getDeliveryAddress2() {
	return deliveryAddress2;
}

public void setDeliveryAddress2(String deliveryAddress2) {
	this.deliveryAddress2 = deliveryAddress2;
}

public String getDeliveryAddress3() {
	return deliveryAddress3;
}

public void setDeliveryAddress3(String deliveryAddress3) {
	this.deliveryAddress3 = deliveryAddress3;
}

public String getDeliveryAddress4() {
	return deliveryAddress4;
}

public void setDeliveryAddress4(String deliveryAddress4) {
	this.deliveryAddress4 = deliveryAddress4;
}

public String getDeliveryAddress5() {
	return deliveryAddress5;
}

public void setDeliveryAddress5(String deliveryAddress5) {
	this.deliveryAddress5 = deliveryAddress5;
}

public String getDeliveryAddress6() {
	return deliveryAddress6;
}

public void setDeliveryAddress6(String deliveryAddress6) {
	this.deliveryAddress6 = deliveryAddress6;
}

public String getFirmPlanned() {
	return firmPlanned;
}

public void setFirmPlanned(String firmPlanned) {
	this.firmPlanned = firmPlanned;
}


}
