package com.eppixcomm.eppix.base.resp;

/**
 * API used to make a asynchronous callback to IBF in response to the IBB notification
 * @author Sarel.Vermeulen
 *
 */
public class EPxSoaIbbNotificationCallbackResponseV1 {
	private String statusCode;
	private String statusMessage;
	private String supportMessage;
	private String transactionId;
	private String transId;
	private String msisdn;
	private String svcResult;
	private String svc_err_nr;

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

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getSvcResult() {
		return svcResult;
	}

	public void setSvcResult(String svcResult) {
		this.svcResult = svcResult;
	}

	public String getSvc_err_nr() {
		return svc_err_nr;
	}

	public void setSvc_err_nr(String svc_err_nr) {
		this.svc_err_nr = svc_err_nr;
	}

}
