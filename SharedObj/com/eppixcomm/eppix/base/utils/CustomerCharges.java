package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class CustomerCharges {
	// Globals
	BigDecimal creditLimit;
	BigDecimal billedCharges;
	BigDecimal unbilledCharges;
	BigDecimal discountValue;

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getBilledCharges() {
		return billedCharges;
	}

	public void setBilledCharges(BigDecimal billedCharges) {
		this.billedCharges = billedCharges;
	}

	public BigDecimal getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
	}

	public BigDecimal getUnbilledCharges() {
		return unbilledCharges;
	}

	public void setUnbilledCharges(BigDecimal unbilledCharges) {
		this.unbilledCharges = unbilledCharges;
	}

	@Override
	public String toString() {
		return "CustomerCharges [\ncreditLimit=" + creditLimit
				+ "\nbilledCharges=" + billedCharges + "\nunbilledCharges="
				+ unbilledCharges + "\ndiscountValue=" + discountValue + "]";
	}

}
