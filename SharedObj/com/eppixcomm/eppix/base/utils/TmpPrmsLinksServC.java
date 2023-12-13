package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.common.util.Date;

public class TmpPrmsLinksServC {
	// Globals
	private Integer tmpSubId;
	private Integer pshId;
	private String serviceType;
	private String archived;
	private Integer paramId;
	private Date actDate;
	private Date termDate;
	private String paramValue;
	private String n2nString;
	private String paramActive;
	private Date deacDate;
	private String subCharge;
	private Float chgValue;
	private String actType;
	private Date actionDate;

	public Integer getTmpSubId() {
		return tmpSubId;
	}

	public void setTmpSubId(Integer tmpSubId) {
		this.tmpSubId = tmpSubId;
	}

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getArchived() {
		return archived;
	}

	public void setArchived(String archived) {
		this.archived = archived;
	}

	public Integer getParamId() {
		return paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public Date getActDate() {
		return actDate;
	}

	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}

	public Date getTermDate() {
		return termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getN2nString() {
		return n2nString;
	}

	public void setN2nString(String n2nString) {
		this.n2nString = n2nString;
	}

	public String getParamActive() {
		return paramActive;
	}

	public void setParamActive(String paramActive) {
		this.paramActive = paramActive;
	}

	public Date getDeacDate() {
		return deacDate;
	}

	public void setDeacDate(Date deacDate) {
		this.deacDate = deacDate;
	}

	public String getSubCharge() {
		return subCharge;
	}

	public void setSubCharge(String subCharge) {
		this.subCharge = subCharge;
	}

	public Float getChgValue() {
		return chgValue;
	}

	public void setChgValue(Float chgValue) {
		this.chgValue = chgValue;
	}

	public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	@Override
	public String toString() {
		return "\nTmpPrmsLinksServC [\ntmpSubId=" + tmpSubId + "\npshId=" + pshId
				+ "\nserviceType=" + serviceType + "\narchived=" + archived
				+ "\nparamId=" + paramId + "\nactDate=" + actDate
				+ "\ntermDate=" + termDate + "\nparamValue=" + paramValue
				+ "\nn2nString=" + n2nString + "\nparamActive=" + paramActive
				+ "\ndeacDate=" + deacDate + "\nsubCharge=" + subCharge
				+ "\nchgValue=" + chgValue + "\nactType=" + actType
				+ "\nactionDate=" + actionDate + "]";
	}

}
