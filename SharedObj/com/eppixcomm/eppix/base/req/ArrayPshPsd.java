package com.eppixcomm.eppix.base.req;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "records", propOrder = { "record" })
public class ArrayPshPsd {
	// Globals
	private List<ParamList> record;

	public void addRecord(ParamList record) {

			if (this.record == null) {
				this.record = new ArrayList<ParamList>();
			}
			this.record.add(record);
		}

	public List<ParamList> getRecord() {
		return record;
	}

	public void setRecord(List<ParamList> record) {
		this.record = record;
	}

}
