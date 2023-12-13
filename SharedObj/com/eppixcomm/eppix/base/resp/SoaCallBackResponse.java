package com.eppixcomm.eppix.base.resp;

public class SoaCallBackResponse {
	private String statusCode;
	private String statusMessage;
	private String supportMessage;
	private String transactionId;
	private String transSeq;
	private String msisdn;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getSupportMessage() {
		return supportMessage;
	}

	public void setSupportMessage(String supportMessage) {
		this.supportMessage = supportMessage;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransSeq() {
		return transSeq;
	}

	public void setTransSeq(String transSeq) {
		this.transSeq = transSeq;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	@Override
	public String toString() {
		return "SoaCallBackResponse [\nstatusCode=" + statusCode + "\nstatusMessage=" + statusMessage
				+ "\nsupportMessage=" + supportMessage + "\ntransactionId=" + transactionId + "\ntransSeq=" + transSeq
				+ "\nmsisdn=" + msisdn + "]";
	}
}
