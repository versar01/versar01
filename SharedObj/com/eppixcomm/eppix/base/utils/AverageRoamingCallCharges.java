package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class AverageRoamingCallCharges {
	private BigDecimal avgCharges;
	private Integer avgCalls;
	private String errorCode;
	private String errorDesc;
	
	public BigDecimal getAvgCharges() {
		return avgCharges;
	}

	public void setAvgCharges(BigDecimal avgCharges) {
		this.avgCharges = avgCharges;
	}

	public Integer getAvgCalls() {
		return avgCalls;
	}

	public void setAvgCalls(Integer avgCalls) {
		this.avgCalls = avgCalls;
	}

	@Override
	public String toString() {
		return "\nAverageRoamingCallCharges [\navgCharges=" + avgCharges
				+ "\navgCalls=" + avgCalls + "]";
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

}
