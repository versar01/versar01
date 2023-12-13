package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class InxInvoiceXrefDMO extends DBO implements Serializable {

	private String inxCustomer;
	private Integer inxSubscriberId;
	private String inxInvoiceNo;
	private String inxMsisdnNo;
	private String inxMsisdnFlag;

	public static final int inxCustomerFilter = 0;
	private static final int inxCustomerSize = 8;

	public static final int inxSubscriberIdFilter = 1;

	public static final int inxInvoiceNoFilter = 2;
	private static final int inxInvoiceNoSize = 10;

	public static final int inxMsisdnNoFilter = 3;
	private static final int inxMsisdnNoSize = 15;

	public static final int inxMsisdnFlagFilter = 4;
	private static final int inxMsisdnFlagSize = 1;

	public InxInvoiceXrefDMO() {
	};

	public InxInvoiceXrefDMO(final String inxCustomer,
			final Integer inxSubscriberId, final String inxInvoiceNo,
			final String inxMsisdnNo, final String inxMsisdnFlag) {

		this.inxCustomer = inxCustomer;
		this.inxSubscriberId = inxSubscriberId;
		this.inxInvoiceNo = inxInvoiceNo;
		this.inxMsisdnNo = inxMsisdnNo;
		this.inxMsisdnFlag = inxMsisdnFlag;
	};

	private static final int[] fieldSizes = new int[] { inxCustomerSize, 0,
			inxInvoiceNoSize, inxMsisdnNoSize, inxMsisdnFlagSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.inxCustomer == null) ? null
						: (this.inxCustomer.length() <= inxCustomerSize) ? this.inxCustomer
								: this.inxCustomer.substring(0,
										this.inxCustomerSize)),
				this.inxSubscriberId,
				((this.inxInvoiceNo == null) ? null : (this.inxInvoiceNo
						.length() <= inxInvoiceNoSize) ? this.inxInvoiceNo
						: this.inxInvoiceNo.substring(0, this.inxInvoiceNoSize)),
				((this.inxMsisdnNo == null) ? null
						: (this.inxMsisdnNo.length() <= inxMsisdnNoSize) ? this.inxMsisdnNo
								: this.inxMsisdnNo.substring(0,
										this.inxMsisdnNoSize)),
				((this.inxMsisdnFlag == null) ? null : (this.inxMsisdnFlag
						.length() <= inxMsisdnFlagSize) ? this.inxMsisdnFlag
						: this.inxMsisdnFlag.substring(0,
								this.inxMsisdnFlagSize)) };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return null;
	}

	protected void set(Object[] fields) {
		this.inxCustomer = rtrim((String) fields[0]);
		this.inxSubscriberId = ((Integer) fields[1]);
		this.inxInvoiceNo = rtrim((String) fields[2]);
		this.inxMsisdnNo = rtrim((String) fields[3]);
		this.inxMsisdnFlag = rtrim((String) fields[4]);
	}

	public void set(final String inxCustomer, final Integer inxSubscriberId,
			final String inxInvoiceNo, final String inxMsisdnNo,
			final String inxMsisdnFlag) {

		this.inxCustomer = inxCustomer;
		this.inxSubscriberId = inxSubscriberId;
		this.inxInvoiceNo = inxInvoiceNo;
		this.inxMsisdnNo = inxMsisdnNo;
		this.inxMsisdnFlag = inxMsisdnFlag;
	}

	public String getInxCustomer() {
		return inxCustomer;
	}

	public void setInxCustomer(String inxCustomer) {
		this.inxCustomer = inxCustomer;
	}

	public Integer getInxSubscriberId() {
		return inxSubscriberId;
	}

	public void setInxSubscriberId(Integer inxSubscriberId) {
		this.inxSubscriberId = inxSubscriberId;
	}

	public String getInxInvoiceNo() {
		return inxInvoiceNo;
	}

	public void setInxInvoiceNo(String inxInvoiceNo) {
		this.inxInvoiceNo = inxInvoiceNo;
	}

	public String getInxMsisdnNo() {
		return inxMsisdnNo;
	}

	public void setInxMsisdnNo(String inxMsisdnNo) {
		this.inxMsisdnNo = inxMsisdnNo;
	}

	public String getInxMsisdnFlag() {
		return inxMsisdnFlag;
	}

	public void setInxMsisdnFlag(String inxMsisdnFlag) {
		this.inxMsisdnFlag = inxMsisdnFlag;
	}

}
