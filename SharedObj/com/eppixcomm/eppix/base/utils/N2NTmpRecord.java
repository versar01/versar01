package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.common.util.Date;

public class N2NTmpRecord {

	String msisdnKnown;				//LIKE vam_active_msisdn.vam_msisdn_known,
	String sim;						//LIKE vam_active_msisdn.vam_sim_no,
	String location;				//CHAR(2),
	Date eventDate;					//LIKE sfe_sim_fut_event.sfe_event_date,
	String servCode;				//LIKE vas_active_service.vas_service_code,
	String servType;				//LIKE vas_active_service.vas_service_type,
	String internTariff;			//LIKE vas_active_service.vas_intern_tariff,
	String msisdn;					//LIKE vam_active_msisdn.vam_msisdn_no,
	Integer rowid;					//INTEGER,
	String originator;				//LIKE vst_service_types.vst_originator,
	String nodeSent;				//LIKE vsm_service_msisdn.vsm_node_sent
	String paramservNetwrkcd;		//LIKE spv_param_values.spv_netwrk_code
	
	public N2NTmpRecord(){
		
	}
	
	public N2NTmpRecord(
			String msisdnKnown,
			String sim,
			String location,
			Date eventDate,
			String servCode,
			String servType,
			String internTariff,
			String msisdn,
			Integer rowid,
			String originator,
			String nodeSent){
		
		this.setMsisdnKnown(msisdnKnown);
		this.setSim(sim);
		this.setLocation(location);
		this.setEventDate(eventDate);
		this.setServCode(servCode);
		this.setServType(servType);
		this.setInternTariff(internTariff);
		this.setMsisdn(msisdn);
		this.setRowid(rowid);
		this.setOriginator(originator);
		this.setNodeSent(nodeSent);
	}
	
	public String getMsisdnKnown() {
		return msisdnKnown;
	}
	public void setMsisdnKnown(String msisdnKnown) {
		this.msisdnKnown = msisdnKnown;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getServCode() {
		return servCode;
	}
	public void setServCode(String servCode) {
		this.servCode = servCode;
	}
	public String getServType() {
		return servType;
	}
	public void setServType(String servType) {
		this.servType = servType;
	}
	public String getInternTariff() {
		return internTariff;
	}
	public void setInternTariff(String internTariff) {
		this.internTariff = internTariff;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Integer getRowid() {
		return rowid;
	}
	public void setRowid(Integer rowid) {
		this.rowid = rowid;
	}
	public String getOriginator() {
		return originator;
	}
	public void setOriginator(String originator) {
		this.originator = originator;
	}
	public String getNodeSent() {
		return nodeSent;
	}
	public void setNodeSent(String nodeSent) {
		this.nodeSent = nodeSent;
	}

	public String getParamservNetwrkcd() {
		return paramservNetwrkcd;
	}

	public void setParamservNetwrkcd(String paramservNetwrkcd) {
		this.paramservNetwrkcd = paramservNetwrkcd;
	}

	@Override
	public String toString() {
		return "\nN2NTmpRecord [msisdnKnown=" + msisdnKnown + "\nsim=" + sim + "\nlocation=" + location + "\neventDate="
				+ eventDate + "\nservCode=" + servCode + "\nservType=" + servType + "\ninternTariff=" + internTariff
				+ "\nmsisdn=" + msisdn + "\nrowid=" + rowid + "\noriginator=" + originator + "\nnodeSent=" + nodeSent
				+ "\nparamservNetwrkcd=" + paramservNetwrkcd + "]";
	}
	
}