package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

public class VasVsrVamTsVstVsmDQO {
	private Integer vasSubscriberId;
	private String vasServiceCode;
	private String vasServiceType;
	private String vasActDate;
	private String vasSubCharge1;
	private String vasSubCharge2;
	private String vasSubCharge3;
	private String vasMultiCharge;
	private String vsrServiceDesc;
	private String vsrProviderId;
	private String vsr2ServiceOrder;
	private String vsr2SimRelated;
	private String vsr2EntryType;
	private String vamSimNo;
	private String vamMsisdnKnown;
	private String tsActInclusive;
	private String vamMsisdnNo;
	private String tsPdeactCharge;
	private String vstParameterised;
	private String vsmMsisdnNo;
	private BigDecimal discount;
	private BigDecimal totalSubCharge;
	private BigDecimal deactCharge;

	public Integer getVasSubscriberId() {
		return vasSubscriberId;
	}

	public void setVasSubscriberId(Integer vasSubscriberId) {
		this.vasSubscriberId = vasSubscriberId;
	}

	public String getVasServiceCode() {
		return vasServiceCode;
	}

	public void setVasServiceCode(String vasServiceCode) {
		this.vasServiceCode = vasServiceCode;
	}

	public String getVasServiceType() {
		return vasServiceType;
	}

	public void setVasServiceType(String vasServiceType) {
		this.vasServiceType = vasServiceType;
	}

	public String getVasActDate() {
		return vasActDate;
	}

	public void setVasActDate(String vasActDate) {
		this.vasActDate = vasActDate;
	}

	public String getVasSubCharge1() {
		return vasSubCharge1;
	}

	public void setVasSubCharge1(String vasSubCharge1) {
		this.vasSubCharge1 = vasSubCharge1;
	}

	public String getVasSubCharge2() {
		return vasSubCharge2;
	}

	public void setVasSubCharge2(String vasSubCharge2) {
		this.vasSubCharge2 = vasSubCharge2;
	}

	public String getVasSubCharge3() {
		return vasSubCharge3;
	}

	public void setVasSubCharge3(String vasSubCharge3) {
		this.vasSubCharge3 = vasSubCharge3;
	}

	public String getVasMultiCharge() {
		return vasMultiCharge;
	}

	public void setVasMultiCharge(String vasMultiCharge) {
		this.vasMultiCharge = vasMultiCharge;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = vsrServiceDesc;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public void setVsrProviderId(String vsrProviderId) {
		this.vsrProviderId = vsrProviderId;
	}

	public String getVsr2ServiceOrder() {
		return vsr2ServiceOrder;
	}

	public void setVsr2ServiceOrder(String vsr2ServiceOrder) {
		this.vsr2ServiceOrder = vsr2ServiceOrder;
	}

	public String getVsr2SimRelated() {
		return vsr2SimRelated;
	}

	public void setVsr2SimRelated(String vsr2SimRelated) {
		this.vsr2SimRelated = vsr2SimRelated;
	}

	public String getVsr2EntryType() {
		return vsr2EntryType;
	}

	public void setVsr2EntryType(String vsr2EntryType) {
		this.vsr2EntryType = vsr2EntryType;
	}

	public String getVamSimNo() {
		return vamSimNo;
	}

	public void setVamSimNo(String vamSimNo) {
		this.vamSimNo = vamSimNo;
	}

	public String getVamMsisdnKnown() {
		return vamMsisdnKnown;
	}

	public void setVamMsisdnKnown(String vamMsisdnKnown) {
		this.vamMsisdnKnown = vamMsisdnKnown;
	}

	public String getTsActInclusive() {
		return tsActInclusive;
	}

	public void setTsActInclusive(String tsActInclusive) {
		this.tsActInclusive = tsActInclusive;
	}

	public String getVamMsisdnNo() {
		return vamMsisdnNo;
	}

	public void setVamMsisdnNo(String vamMsisdnNo) {
		this.vamMsisdnNo = vamMsisdnNo;
	}

	public String getTsPdeactCharge() {
		return tsPdeactCharge;
	}

	public void setTsPdeactCharge(String tsPdeactCharge) {
		this.tsPdeactCharge = tsPdeactCharge;
	}

	public String getVstParameterised() {
		return vstParameterised;
	}

	public void setVstParameterised(String vstParameterised) {
		this.vstParameterised = vstParameterised;
	}

	public String getVsmMsisdnNo() {
		return vsmMsisdnNo;
	}

	public void setVsmMsisdnNo(String vsmMsisdnNo) {
		this.vsmMsisdnNo = vsmMsisdnNo;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getTotalSubCharge() {
		return totalSubCharge;
	}

	public void setTotalSubCharge(BigDecimal totalSubCharge) {
		this.totalSubCharge = totalSubCharge;
	}

	public BigDecimal getDeactCharge() {
		return deactCharge;
	}

	public void setDeactCharge(BigDecimal deactCharge) {
		this.deactCharge = deactCharge;
	}

	@Override
	public String toString() {
		return "\nVasVsrVamTsVstVsmDMO [\nvasSubscriberId=" + vasSubscriberId
				+ "\nvasServiceCode=" + vasServiceCode + "\nvasServiceType="
				+ vasServiceType + "\nvasActDate=" + vasActDate
				+ "\nvasSubCharge1=" + vasSubCharge1 + "\nvasSubCharge2="
				+ vasSubCharge2 + "\nvasSubCharge3=" + vasSubCharge3
				+ "\nvasMultiCharge=" + vasMultiCharge + "\nvsrServiceDesc="
				+ vsrServiceDesc + "\nvsrProviderId=" + vsrProviderId
				+ "\nvsr2ServiceOrder=" + vsr2ServiceOrder
				+ "\nvsr2SimRelated=" + vsr2SimRelated + "\nvsr2EntryType="
				+ vsr2EntryType + "\nvamSimNo=" + vamSimNo
				+ "\nvamMsisdnKnown=" + vamMsisdnKnown + "\ntsActInclusive="
				+ tsActInclusive + "\nvamMsisdnNo=" + vamMsisdnNo
				+ "\ntsPdeactCharge=" + tsPdeactCharge + "\nvstParameterised="
				+ vstParameterised + "\nvsmMsisdnNo=" + vsmMsisdnNo
				+ "\ndiscount=" + discount + "\ntotalSubCharge="
				+ totalSubCharge + "\ndeactCharge=" + deactCharge + "]";
	}

}
