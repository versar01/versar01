package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "errorType", "eppixStatus", "errorCode", "isamError", "upgradeID", "amnSerial"})
public class ResponseSubscriberMigrUpgrade {
	
	String errorType;
	String eppixStatus;
	String errorCode;
	String isamError;
	Integer upgradeID;
	Integer amnSerial;
	
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
	public Integer getUpgradeID() {
		return upgradeID;
	}
	public void setUpgradeID(Integer upgradeID) {
		this.upgradeID = upgradeID;
	}
	public Integer getAmnSerial() {
		return amnSerial;
	}
	public void setAmnSerial(Integer amnSerial) {
		this.amnSerial = amnSerial;
	}
	@Override
	public String toString() {
		return "ResponseSubscriberMigrUpgrade [\nerrorType=" + errorType
				+ "\neppixStatus=" + eppixStatus + "\nerrorCode=" + errorCode
				+ "\nisamError=" + isamError + "\nupgradeID=" + upgradeID
				+ "\namnSerial=" + amnSerial + "]";
	}


}
