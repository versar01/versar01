package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class DynamicCreditLimit {
// Globals
	private BigDecimal totalSubscription;
	private BigDecimal advPayments;
	private Integer dclId;
	private BigDecimal totalDCL;
	private BigDecimal allocatedDCL;
	private BigDecimal availableDCL;

	public BigDecimal getTotalSubscription() {
		return totalSubscription;
	}

	public void setTotalSubscription(BigDecimal totalSubscription) {
		this.totalSubscription = totalSubscription;
	}

	public BigDecimal getAdvPayments() {
		return advPayments;
	}

	public void setAdvPayments(BigDecimal advPayments) {
		this.advPayments = advPayments;
	}

	public Integer getDclId() {
		return dclId;
	}

	public void setDclId(Integer dclId) {
		this.dclId = dclId;
	}

	public BigDecimal getTotalDCL() {
		return totalDCL;
	}

	public void setTotalDCL(BigDecimal totalDCL) {
		this.totalDCL = totalDCL;
	}

	public BigDecimal getAllocatedDCL() {
		return allocatedDCL;
	}

	public void setAllocatedDCL(BigDecimal allocatedDCL) {
		this.allocatedDCL = allocatedDCL;
	}

	public BigDecimal getAvailableDCL() {
		return availableDCL;
	}

	public void setAvailableDCL(BigDecimal availableDCL) {
		this.availableDCL = availableDCL;
	}
}
