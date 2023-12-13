package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class UsageRecord {
	// Globals
	private Integer subid;
	private String servicecode1;
	private BigDecimal spulValue;
	private String servicecode2;
	private BigDecimal sulValue;
	private BigDecimal sumRecurr;
	private BigDecimal sumUsage;
	private String sultype;
	private String sulStartDate;
	private String sulEndDate;

	public Integer getSubid() {
		return subid;
	}

	public void setSubid(Integer subid) {
		this.subid = subid;
	}

	public String getServicecode1() {
		return servicecode1;
	}

	public void setServicecode1(String servicecode1) {
		this.servicecode1 = servicecode1;
	}

	public BigDecimal getSpulValue() {
		return spulValue;
	}

	public void setSpulValue(BigDecimal spulValue) {
		this.spulValue = spulValue;
	}

	public String getServicecode2() {
		return servicecode2;
	}

	public void setServicecode2(String servicecode2) {
		this.servicecode2 = servicecode2;
	}

	public BigDecimal getSulValue() {
		return sulValue;
	}

	public void setSulValue(BigDecimal sulValue) {
		this.sulValue = sulValue;
	}

	public BigDecimal getSumRecurr() {
		return sumRecurr;
	}

	public void setSumRecurr(BigDecimal sumRecurr) {
		this.sumRecurr = sumRecurr;
	}

	public BigDecimal getSumUsage() {
		return sumUsage;
	}

	public void setSumUsage(BigDecimal sumUsage) {
		this.sumUsage = sumUsage;
	}

	public String getSultype() {
		return sultype;
	}

	public void setSultype(String sultype) {
		this.sultype = sultype;
	}

	public String getSulStartDate() {
		return sulStartDate;
	}

	public void setSulStartDate(String sulStartDate) {
		this.sulStartDate = sulStartDate;
	}

	public String getSulEndDate() {
		return sulEndDate;
	}

	public void setSulEndDate(String sulEndDate) {
		this.sulEndDate = sulEndDate;
	}

}
