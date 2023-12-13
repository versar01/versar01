package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "subscriberId", "simNo", "msisdn", "connectDate", "disConnectDate", "msisdnsetUp", "msisdnType", "status", "historyCode", "historyDesc", "reasonCode", "comment", "statusText"})
public class SimDetails {
	// Globals
	private String subscriberId;
	private String simNo;
	private String msisdn;
	private String connectDate;
	private String disConnectDate;
	private String msisdnsetUp;
	private String msisdnType;
	private String status;
	private String historyCode;
	private String historyDesc;
	private String reasonCode;
	private String comment;
	private String statusText;

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getSimNo() {
		return simNo;
	}

	public void setSimNo(String simNo) {
		this.simNo = simNo;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getConnectDate() {
		return connectDate;
	}

	public void setConnectDate(String connectDate) {
		this.connectDate = connectDate;
	}

	public String getDisConnectDate() {
		return disConnectDate;
	}

	public void setDisConnectDate(String disConnectDate) {
		this.disConnectDate = disConnectDate;
	}

	public String getMsisdnsetUp() {
		return msisdnsetUp;
	}

	public void setMsisdnsetUp(String msisdnsetUp) {
		this.msisdnsetUp = msisdnsetUp;
	}

	public String getMsisdnType() {
		return msisdnType;
	}

	public void setMsisdnType(String msisdnType) {
		this.msisdnType = msisdnType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHistoryCode() {
		return historyCode;
	}

	public void setHistoryCode(String historyCode) {
		this.historyCode = historyCode;
	}

	public String getHistoryDesc() {
		return historyDesc;
	}

	public void setHistoryDesc(String historyDesc) {
		this.historyDesc = historyDesc;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatusText() {
		return this.statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	@Override
	public String toString() {
		return "\nSimDetails [subscriberId=" + subscriberId + "\nsimNo=" + simNo
				+ "\nmsisdn=" + msisdn + "\nconnectDate=" + connectDate
				+ "\ndisConnectDate=" + disConnectDate + "\nmsisdnsetUp="
				+ msisdnsetUp + "\nmsisdnType=" + msisdnType + "\nstatus="
				+ status + "\nhistoryCode=" + historyCode + "\nhistoryDesc="
				+ historyDesc + "\nreasonCode=" + reasonCode + "\ncomment="
				+ comment + "\nStatusText=" + statusText + "]";
	}

}
