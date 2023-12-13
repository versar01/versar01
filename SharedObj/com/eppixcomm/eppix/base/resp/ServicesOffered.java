package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "serviceCode", "vsrServiceDesc", "serviceType",
		"vstServiceDesc", "actCharge", "subCharge1", "subCharge2",
		"subCharge3", "futureAct", "parameterised", "depositRequired"})
public class ServicesOffered {
	// Globals
	private String serviceCode;
	private String vsrServiceDesc;
	private String serviceType;
	private String vstServiceDesc;
	private String actCharge;
	private String subCharge1;
	private String subCharge2;
	private String subCharge3;
	private String futureAct;
	private String parameterised;
	private String depositRequired;

	
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = vsrServiceDesc;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getVstServiceDesc() {
		return vstServiceDesc;
	}

	public void setVstServiceDesc(String vstServiceDesc) {
		this.vstServiceDesc = vstServiceDesc;
	}

	public String getActCharge() {
		return actCharge;
	}

	public void setActCharge(String actCharge) {
		this.actCharge = actCharge;
	}

	public String getSubCharge1() {
		return subCharge1;
	}

	public void setSubCharge1(String subCharge1) {
		this.subCharge1 = subCharge1;
	}

	public String getSubCharge2() {
		return subCharge2;
	}

	public void setSubCharge2(String subCharge2) {
		this.subCharge2 = subCharge2;
	}

	public String getSubCharge3() {
		return subCharge3;
	}

	public void setSubCharge3(String subCharge3) {
		this.subCharge3 = subCharge3;
	}

	public String getParameterised() {
		return parameterised;
	}

	public void setParameterised(String parameterised) {
		this.parameterised = parameterised;
	}

	public String getFutureAct() {
		return futureAct;
	}

	public void setFutureAct(String futureAct) {
		this.futureAct = futureAct;
	}

	public String getDepositRequired() {
		return depositRequired;
	}

	public void setDepositRequired(String depositRequired) {
		this.depositRequired = depositRequired;
	}

	@Override
	public String toString() {
		return "\nServicesOffered [serviceCode=" + serviceCode
				+ "\nvsrServiceDesc=" + vsrServiceDesc + "\nserviceType="
				+ serviceType + "\nvstServiceDesc=" + vstServiceDesc
				+ "\nactCharge=" + actCharge + "\nsubCharge1=" + subCharge1
				+ "\nsubCharge2=" + subCharge2 + "\nsubCharge3=" + subCharge3
				+ "\nfutureAct=" + futureAct + "\nparameterised="
				+ parameterised + "\ndepositRequired=" + depositRequired + "]";
	}

}
