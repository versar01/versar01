package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "subscriberId", "simNo", "msisdn", "eventDate", "eventId" })
public class SimFutureEvent extends EppixResponse {
	// Globals
	private String subscriberId;
	private String simNo;
	private String msisdn;
	private String eventDate;
	private String eventId;

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

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "\nSimFutureEevent [\nsubscriberId=" + subscriberId + "\nsimNo="
				+ simNo + "\nmsisdn=" + msisdn + "\neventDate=" + eventDate
				+ "\neventId=" + eventId + "]";
	}

}
