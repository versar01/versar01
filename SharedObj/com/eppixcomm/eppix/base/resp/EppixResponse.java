package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "errorType", "eppixStatus", "errorCode", "isamError" })
public class EppixResponse {
	// Globals
	private String errorType;
	private String eppixStatus;
	private String errorCode;
	private String isamError;

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

	@Override
	public String toString() {
		return "\nEppixResponse [\nerrorType=" + errorType + "\neppixStatus="
				+ eppixStatus + "\nerrorCode=" + errorCode + "\nisamError="
				+ isamError + "]";
	}
}
