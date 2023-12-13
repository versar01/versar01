package com.eppixcomm.eppix.base.resp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.eppixcomm.eppix.base.utils.AccSubServRecord;

@XmlType(propOrder = { "details"})
public class IDAccSubServListResp extends EppixResponse{
	// Globals
	private List<AccSubServRecord> details;

	public List<AccSubServRecord> getDetails() {
		return details;
	}

	public void setDetails(List<AccSubServRecord> details) {
		this.details = details;
	}
	
	public void addDetails(AccSubServRecord detail) {
		if(this.details == null) {
			this.details = new ArrayList<AccSubServRecord>();
			this.details.add(detail);
		}else {
			this.details.add(detail);
		}
	}
}
