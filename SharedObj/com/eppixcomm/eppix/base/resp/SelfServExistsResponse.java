package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "exists", "description" })
public class SelfServExistsResponse  extends EppixResponse {
	private String exists;
	private String description;
	
	@Override
	public String toString() {
		return "\nSelfServExistsResponse [exists=" + exists + "\ndescription=" + description + "\ngetErrorType()="
				+ getErrorType() + "\ngetEppixStatus()=" + getEppixStatus() + "\ngetErrorCode()=" + getErrorCode()
				+ "\ngetIsamError()=" + getIsamError() + "]";
	}

	public String getExists() {
		return exists;
	}

	public void setExists(String exists) {
		this.exists = exists;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

