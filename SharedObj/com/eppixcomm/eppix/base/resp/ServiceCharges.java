package com.eppixcomm.eppix.base.resp;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "serviceCode", "serviceDesc", "subCharge1",
		"subCharge2", "subCharge3", "serviceDiscount" })
public class ServiceCharges {
	// Globals
	private String serviceCode;
	private String serviceDesc;
	private BigDecimal subCharge1;
	private BigDecimal subCharge2;
	private BigDecimal subCharge3;
	private BigDecimal serviceDiscount;

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public BigDecimal getSubCharge1() {
		return subCharge1;
	}

	public void setSubCharge1(BigDecimal subCharge1) {
		this.subCharge1 = subCharge1;
	}

	public BigDecimal getSubCharge2() {
		return subCharge2;
	}

	public void setSubCharge2(BigDecimal subCharge2) {
		this.subCharge2 = subCharge2;
	}

	public BigDecimal getSubCharge3() {
		return subCharge3;
	}

	public void setSubCharge3(BigDecimal subCharge3) {
		this.subCharge3 = subCharge3;
	}

	public BigDecimal getServiceDiscount() {
		return serviceDiscount;
	}

	public void setServiceDiscount(BigDecimal serviceDiscount) {
		this.serviceDiscount = serviceDiscount;
	}

	@Override
	public String toString() {
		return "\nServiceCharges [\nserviceCode=" + serviceCode + "\nserviceDesc="
				+ serviceDesc + "\nsubCharge1=" + subCharge1 + "\nsubCharge2="
				+ subCharge2 + "\nsubCharge3=" + subCharge3
				+ "\nserviceDiscount=" + serviceDiscount + "]";
	}

}
