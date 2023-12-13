package com.eppixcomm.eppix.base.resp;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "errorType", "eppixStatus", "errorCode", "isamError",
		"subscriberId", "packageCode", "internalTariff", "totalCost",
		"totalDiscount", "services" })
public class ServiceDiscount {
	// Globals
	private String errorType;
	private String eppixStatus;
	private String errorCode;
	private String isamError;
	private Integer subscriberId;
	private String packageCode;
	private String internalTariff;
	private BigDecimal totalCost;
	private BigDecimal totalDiscount;
	private Services services;

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getEppixStatus() {
		return eppixStatus;
	}

	public void setEppixStatus(String eppixStatus) {
		this.eppixStatus = eppixStatus;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getIsamError() {
		return isamError;
	}

	public void setIsamError(String isamError) {
		this.isamError = isamError;
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getInternalTariff() {
		return internalTariff;
	}

	public void setInternalTariff(String internalTariff) {
		this.internalTariff = internalTariff;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "\nServiceDiscount [\nerrorType=" + errorType + "\neppixStatus="
				+ eppixStatus + "\nerrorCode=" + errorCode + "\nisamError="
				+ isamError + "\nsubscriberId=" + subscriberId
				+ "\npackageCode=" + packageCode + "\ninternalTariff="
				+ internalTariff + "\ntotalSubscription=" + totalCost
				+ "\ntotalDiscount=" + totalDiscount + "\nservices=" + services
				+ "]";
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
}
