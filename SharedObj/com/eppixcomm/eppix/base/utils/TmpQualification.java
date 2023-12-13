package com.eppixcomm.eppix.base.utils;

public class TmpQualification {

	/**
	 * SJ: Creatre class to hold the values. 
	 * 
	 * Will use ArrayList for each record.
	 * 
	 * CREATE TEMP TABLE temp_qualification ( qual_val INTEGER, qual_key
	 * VARCHAR(255), qual_from INTEGER, qual_to INTEGER )
	 */

	Integer qualVal;
	String qualKey;
	Integer qualFrom;
	Integer qualTo;

	public Integer getQualVal() {
		return qualVal;
	}

	public void setQualVal(Integer qualVal) {
		this.qualVal = qualVal;
	}

	public String getQualKey() {
		return qualKey;
	}

	public void setQualKey(String qualKey) {
		this.qualKey = qualKey;
	}

	public Integer getQualFrom() {
		return qualFrom;
	}

	public void setQualFrom(Integer qualFrom) {
		this.qualFrom = qualFrom;
	}

	public Integer getQualTo() {
		return qualTo;
	}

	public void setQualTo(Integer qualTo) {
		this.qualTo = qualTo;
	}
	
}
