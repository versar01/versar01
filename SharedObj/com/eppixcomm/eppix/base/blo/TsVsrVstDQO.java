package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

public class TsVsrVstDQO {
	// Globals
	private String tsPackageCode;
	private String tsInternalTariff;
	private String tsServiceCode;
	private String vsrServiceDesc;
	private String vsrServiceType;
	private String vstServiceDesc;
	private String tsActCharge;
	private String tsSubCharge1;
	private String tsSubCharge2;
	private String tsSubCharge3;
	private String vstFutureAct;
	private String vstParameterised;
	private String vstOriginator;
	private String vsrProviderId;
	private String tsChargeFreq;
	private BigDecimal totalSubCharge;
	private boolean actAllow = true;
	private String depositRequired;

	public String getTsPackageCode() {
		return tsPackageCode;
	}

	public void setTsPackageCode(String tsPackageCode) {
		this.tsPackageCode = (tsPackageCode == null) ? "" : tsPackageCode.trim();
	}

	public String getTsInternalTariff() {
		return tsInternalTariff;
	}

	public void setTsInternalTariff(String tsInternalTariff) {
		this.tsInternalTariff =(tsInternalTariff == null) ? "" : tsInternalTariff.trim();
	}

	public String getTsServiceCode() {
		return tsServiceCode;
	}

	public void setTsServiceCode(String tsServiceCode) {
		this.tsServiceCode = (tsServiceCode == null) ? "" : tsServiceCode.trim();;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = (vsrServiceDesc == null) ? "" : vsrServiceDesc.trim();;
	}

	public String getVsrServiceType() {
		return vsrServiceType;
	}

	public void setVsrServiceType(String vsrServiceType) {
		this.vsrServiceType = (vsrServiceType == null) ? "" : vsrServiceType.trim();;
	}

	public String getVstServiceDesc() {
		return vstServiceDesc;
	}

	public void setVstServiceDesc(String vstServiceDesc) {
		this.vstServiceDesc = (vstServiceDesc == null) ? "" : vstServiceDesc.trim();;
	}

	public String getTsActCharge() {
		return tsActCharge;
	}

	public void setTsActCharge(String tsActCharge) {
		this.tsActCharge = (tsActCharge == null) ? "" : tsActCharge.trim();;
	}

	public String getTsSubCharge1() {
		return tsSubCharge1;
	}

	public void setTsSubCharge1(String tsSubCharge1) {
		this.tsSubCharge1 = (tsSubCharge1 == null) ? "" : tsSubCharge1.trim();;
	}

	public String getTsSubCharge2() {
		return tsSubCharge2;
	}

	public void setTsSubCharge2(String tsSubCharge2) {
		this.tsSubCharge2 = (tsSubCharge2 == null) ? "" : tsSubCharge2.trim();;
	}

	public String getTsSubCharge3() {
		return tsSubCharge3;
	}

	public void setTsSubCharge3(String tsSubCharge3) {
		this.tsSubCharge3 = (tsSubCharge3 == null) ? "" : tsSubCharge3.trim();;
	}

	public String getVstFutureAct() {
		return vstFutureAct;
	}

	public void setVstFutureAct(String vstFutureAct) {
		this.vstFutureAct = (vstFutureAct == null) ? "" : vstFutureAct.trim();;
	}

	public String getVstParameterised() {
		return vstParameterised;
	}

	public void setVstParameterised(String vstParameterised) {
		this.vstParameterised = (vstParameterised == null) ? "" : vstParameterised.trim();;
	}

	public String getVstOriginator() {
		return vstOriginator;
	}

	public void setVstOriginator(String vstOriginator) {
		this.vstOriginator = (vstOriginator == null) ? "" : vstOriginator.trim();;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public void setVsrProviderId(String vsrProviderId) {
		this.vsrProviderId = (vsrProviderId == null) ? "" : vsrProviderId.trim();;
	}

	public String getTsChargeFreq() {
		return tsChargeFreq;
	}

	public void setTsChargeFreq(String tsChargeFreq) {
		this.tsChargeFreq = (tsChargeFreq == null) ? "" : tsChargeFreq.trim();;
	}

	public BigDecimal getTotalSubCharge() {
		return totalSubCharge;
	}

	public void setTotalSubCharge(BigDecimal totalSubCharge) {
		this.totalSubCharge = totalSubCharge;
	}

	public boolean isActAllow() {
		return actAllow;
	}

	public void setActAllow(boolean actAllow) {
		this.actAllow = actAllow;
	}

	public String getDepositRequired() {
		return depositRequired;
	}

	public void setDepositRequired(String depositRequired) {
		this.depositRequired = depositRequired;
	}

	@Override
	public String toString() {
		return "\nTsVsrVstDQO [\ntsPackageCode=" + tsPackageCode
				+ "\ntsInternalTariff=" + tsInternalTariff + "\ntsServiceCode="
				+ tsServiceCode + "\nvsrServiceDesc=" + vsrServiceDesc
				+ "\nvsrServiceType=" + vsrServiceType + "\nvstServiceDesc="
				+ vstServiceDesc + "\ntsActCharge=" + tsActCharge
				+ "\ntsSubCharge1=" + tsSubCharge1 + "\ntsSubCharge2="
				+ tsSubCharge2 + "\ntsSubCharge3=" + tsSubCharge3
				+ "\nvstFutureAct=" + vstFutureAct + "\nvstParameterised="
				+ vstParameterised + "\nvstOriginator=" + vstOriginator
				+ "\nvsrProviderId=" + vsrProviderId + "\ntsChargeFreq="
				+ tsChargeFreq + "\ntotalSubCharge=" + totalSubCharge
				+ "\nactAllow=" + actAllow + "\ndepositRequired="
				+ depositRequired + "]";
	}
}
