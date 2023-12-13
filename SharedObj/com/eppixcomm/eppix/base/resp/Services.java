package com.eppixcomm.eppix.base.resp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Services", propOrder = { "service" })
public class Services {
	// Globals
	@XmlElement(name = "service", nillable = true)
	private List<ServiceCharges> service;

	public void addService(ServiceCharges serv) {

		if (this.service == null) {
			this.service = new ArrayList<ServiceCharges>();
		}
		this.service.add(serv);
	}

	public List<ServiceCharges> getService() {
		return service;
	}

	public void setService(List<ServiceCharges> service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "\nServices [\nservice=" + service + "]";
	}
}

