package com.eppixcomm.eppix.base.req;

import javax.xml.bind.annotation.XmlType;

import com.eppixcomm.eppix.common.util.Date;

@XmlType(propOrder = { "pshId", "pshServiceType", "pshArchived", "psdParamId","psdActDate", "psdTermDate","psdParamValue",
		"psdN2nString","psdParamActive", "psdDeacDate","psdSubCharge", "psdChgValue","psdActType", "psdActionDate" })
public class ParamList {
	// Globals
	private Integer pshId;
	private String pshServiceType;
	private String pshArchived;
	private Integer psdParamId;
	private String psdActDate;
	private String psdTermDate;
	private String psdParamValue;
	private String psdN2nString;
	private String psdParamActive;
	private String psdDeacDate;
	private String psdSubCharge;
	private Double psdChgValue;
	private String psdActType;
	private String psdActionDate;

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getPshServiceType() {
		return pshServiceType;
	}

	public void setPshServiceType(String pshServiceType) {
		this.pshServiceType = pshServiceType;
	}

	public String getPshArchived() {
		return pshArchived;
	}

	public void setPshArchived(String pshArchived) {
		this.pshArchived = pshArchived;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public String getPsdActDate() {
		return psdActDate;
	}

	public void setPsdActDate(String psdActDate) {
		this.psdActDate = psdActDate;
	}

	public String getPsdTermDate() {
		return psdTermDate;
	}

	public void setPsdTermDate(String psdTermDate) {
		this.psdTermDate = psdTermDate;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdN2nString() {
		return psdN2nString;
	}

	public void setPsdN2nString(String psdN2nString) {
		this.psdN2nString = psdN2nString;
	}

	public String getPsdParamActive() {
		return psdParamActive;
	}

	public void setPsdParamActive(String psdParamActive) {
		this.psdParamActive = psdParamActive;
	}

	public String getPsdDeacDate() {
		return psdDeacDate;
	}

	public void setPsdDeacDate(String psdDeacDate) {
		this.psdDeacDate = psdDeacDate;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	public String getPsdActType() {
		return psdActType;
	}

	public void setPsdActType(String psdActType) {
		this.psdActType = psdActType;
	}

	public String getPsdActionDate() {
		return psdActionDate;
	}

	public void setPsdActionDate(String psdActionDate) {
		this.psdActionDate = psdActionDate;
	}

}
