package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.XmlType;

import com.eppixcomm.eppix.common.util.Date;

@XmlType(propOrder = { "account", "idNum", "accountType", "creditLimit", "creditClass", "accountStatus", "mtnStatus",
		"ladStatus1", "collPlan", "subscriberId", "msisdnNo", "packageCode", "tariffPlan", "serviceCode", "chgCode1",
		"chgValue1", "chgCode2", "chgValue2", "chgCode3", "chgValue3", "servDiscount", "actInc", "dualCall", "param",
		"paramId", "paramName", "paramValue", "paramCharge", "paramChargeValue", "handsetCost", "averageSpend",
		"maxUsage", "termDate" })
public class AccSubServRecord {
	// Globals
	private String account;
	private String idNum;
	private String accountType;
	private BigDecimal creditLimit;
	private String creditClass;
	private String accountStatus;
	private String mtnStatus;
	private String ladStatus1;
	private String collPlan;
	private Integer subscriberId;
	private String msisdnNo;
	private String packageCode;
	private String tariffPlan;
	private String serviceCode;
	private String chgCode1;
	private BigDecimal chgValue1;
	private String chgCode2;
	private BigDecimal chgValue2;
	private String chgCode3;
	private BigDecimal chgValue3;
	private BigDecimal servDiscount;
	private String actInc;
	private String dualCall;
	private String param;
	private String paramId;
	private String paramName;
	private String paramValue;
	private String paramCharge;
	private BigDecimal paramChargeValue;
	private BigDecimal handsetCost;
	private BigDecimal averageSpend;
	private BigDecimal maxUsage;
	private String termDate;

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = (idNum == null) ? "" : idNum.trim();
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = (accountType == null) ? "" : accountType.trim();
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCreditClass() {
		return creditClass;
	}

	public void setCreditClass(String creditClass) {
		this.creditClass = (creditClass == null) ? "" : creditClass.trim();
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = (accountStatus == null) ? "" : accountStatus.trim();
	}

	public String getMtnStatus() {
		return mtnStatus;
	}

	public void setMtnStatus(String mtnStatus) {
		this.mtnStatus = (mtnStatus == null) ? "" : mtnStatus.trim();
	}

	public String getLadStatus1() {
		return ladStatus1;
	}

	public void setLadStatus1(String ladStatus1) {
		this.ladStatus1 = (ladStatus1 == null) ? "" : ladStatus1.trim();
	}

	public String getCollPlan() {
		return collPlan;
	}

	public void setCollPlan(String collPlan) {
		this.collPlan = (collPlan == null) ? "" : collPlan.trim();
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getMsisdnNo() {
		return msisdnNo;
	}

	public void setMsisdnNo(String msisdnNo) {
		this.msisdnNo = (msisdnNo == null) ? "" : msisdnNo.trim();
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = (packageCode == null) ? "" : packageCode.trim();
	}

	public String getTariffPlan() {
		return tariffPlan;
	}

	public void setTariffPlan(String tariffPlan) {
		this.tariffPlan = (tariffPlan == null) ? "" : tariffPlan.trim();
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = (serviceCode == null) ? "" : serviceCode.trim();
	}

	public String getChgCode1() {
		return chgCode1;
	}

	public void setChgCode1(String chgCode1) {
		this.chgCode1 = (chgCode1 == null) ? "" : chgCode1.trim();
	}

	public BigDecimal getChgValue1() {
		return chgValue1;
	}

	public void setChgValue1(BigDecimal chgValue1) {
		this.chgValue1 = chgValue1;
	}

	public String getChgCode2() {
		return chgCode2;
	}

	public void setChgCode2(String chgCode2) {
		this.chgCode2 = (chgCode2 == null) ? "" : chgCode2.trim();
	}

	public BigDecimal getChgValue2() {
		return chgValue2;
	}

	public void setChgValue2(BigDecimal chgValue2) {
		this.chgValue2 = chgValue2;
	}

	public String getChgCode3() {
		return chgCode3;
	}

	public void setChgCode3(String chgCode3) {
		this.chgCode3 = (chgCode3 == null) ? "" : chgCode3.trim();
	}

	public BigDecimal getChgValue3() {
		return chgValue3;
	}

	public void setChgValue3(BigDecimal chgValue3) {
		this.chgValue3 = chgValue3;
	}

	public BigDecimal getServDiscount() {
		return servDiscount;
	}

	public void setServDiscount(BigDecimal servDiscount) {
		this.servDiscount = servDiscount;
	}

	public String getActInc() {
		return actInc;
	}

	public void setActInc(String actInc) {
		this.actInc = (actInc == null) ? "" : actInc.trim();
	}

	public String getDualCall() {
		return dualCall;
	}

	public void setDualCall(String dualCall) {
		this.dualCall = (dualCall == null) ? "" : dualCall.trim();
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = (param == null) ? "" : param.trim();
	}

	public String getParamId() {
		return paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = (paramId == null) ? "" : paramId.trim();
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = (paramName == null) ? "" : paramName.trim();
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = (paramValue == null) ? "" : paramValue.trim();
	}

	public String getParamCharge() {
		return paramCharge;
	}

	public void setParamCharge(String paramCharge) {
		this.paramCharge = (paramCharge == null) ? "" : paramCharge.trim();
	}

	public BigDecimal getParamChargeValue() {
		return paramChargeValue;
	}

	public void setParamChargeValue(BigDecimal paramChargeValue) {
		this.paramChargeValue = paramChargeValue;
	}

	public BigDecimal getHandsetCost() {
		return handsetCost;
	}

	public void setHandsetCost(BigDecimal handsetCost) {
		this.handsetCost = handsetCost;
	}

	public BigDecimal getAverageSpend() {
		return averageSpend;
	}

	public void setAverageSpend(BigDecimal averageSpend) {
		this.averageSpend = averageSpend;
	}

	public BigDecimal getMaxUsage() {
		return maxUsage;
	}

	public void setMaxUsage(BigDecimal maxUsage) {
		this.maxUsage = maxUsage;
	}

	public String getTermDate() {
		return termDate;
	}

	public void setTermDate(String termDate) {
		this.termDate = (termDate == null) ? "" : termDate.trim();
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = (account == null) ? "" : account.trim();;
	}

	@Override
	public String toString() {
		return "\nAccSubServRecord [\naccount=" + account + "\nidNum=" + idNum + "\naccountType=" + accountType
				+ "\ncreditLimit=" + creditLimit + "\ncreditClass=" + creditClass + "\naccountStatus=" + accountStatus
				+ "\nmtnStatus=" + mtnStatus + "\nladStatus1=" + ladStatus1 + "\ncollPlan=" + collPlan
				+ "\nsubscriberId=" + subscriberId + "\nmsisdnNo=" + msisdnNo + "\npackageCode=" + packageCode
				+ "\ntariffPlan=" + tariffPlan + "\nserviceCode=" + serviceCode + "\nchgCode1=" + chgCode1
				+ "\nchgValue1=" + chgValue1 + "\nchgCode2=" + chgCode2 + "\nchgValue2=" + chgValue2 + "\nchgCode3="
				+ chgCode3 + "\nchgValue3=" + chgValue3 + "\nservDiscount=" + servDiscount + "\nactInc=" + actInc
				+ "\ndualCall=" + dualCall + "\nparam=" + param + "\nparamId=" + paramId + "\nparamName=" + paramName
				+ "\nparamValue=" + paramValue + "\nparamCharge=" + paramCharge + "\nparamChargeValue="
				+ paramChargeValue + "\nhandsetCost=" + handsetCost + "\naverageSpend=" + averageSpend + "\nmaxUsage="
				+ maxUsage + "\ntermDate=" + termDate + "]";
	}

}
