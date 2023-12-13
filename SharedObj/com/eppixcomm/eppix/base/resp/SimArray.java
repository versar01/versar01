package com.eppixcomm.eppix.base.resp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "details"})
public class SimArray extends EppixResponse {
	// Globals
	private List<SimDetails> details;

	public List<SimDetails> getDetails() {
		return details;
	}

	public void setDetails(List<SimDetails> details) {
		this.details = details;
	}

	public void addSimDetials(SimDetails simDetails){
		
		if(details == null){
			details = new ArrayList<SimDetails>();
			details.add(simDetails);
		}else{
			details.add(simDetails);
		}
	}
	
public void removeSimDetials(){
		
		if(details != null){
			details =null;
		}
	}

	@Override
	public String toString() {
		return "\nSimList [\ndetails=" + details + "]";
	}
}
