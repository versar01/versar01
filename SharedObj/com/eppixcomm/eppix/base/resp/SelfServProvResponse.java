package com.eppixcomm.eppix.base.resp;


import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "transactionRef" })
public class SelfServProvResponse extends EppixResponse {
	@Override
	public String toString() {
		return "\nSelfServProvResponse [\ntransactionRef=" + transactionRef
				+ "\ngetErrorType()=" + getErrorType() + "\ngetEppixStatus()="
				+ getEppixStatus() + "\ngetErrorCode()=" + getErrorCode()
				+ "\ngetIsamError()=" + getIsamError() + "]";
	}

	private String transactionRef;

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}
}
