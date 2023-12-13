package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SlitemnInsDQO extends DBO implements Serializable {

	@Override
	public String toString() {
		return "\nSlitemnInsDQO [\ninsInvoiceNo=" + insInvoiceNo
				+ "\ninsInvoiceDate=" + insInvoiceDate + "\ninsCycle="
				+ insCycle + "\nunallAmount=" + unallAmount + "]";
	}

	private String insInvoiceNo;
	private Date insInvoiceDate;
	private String insCycle;
	private Double unallAmount;

	public static final int insInvoiceNoFilter = 0;
	private static final int insInvoiceNoSize = 10;

	public static final int insInvoiceDateFilter = 1;

	public static final int insCycleFilter = 2;
	private static final int insCycleSize = 5;

	public static final int unallAmountFilter = 3;

	public SlitemnInsDQO() {
	};

	public SlitemnInsDQO(final String insInvoiceNo, final Date insInvoiceDate, final String insCycle,
			final Double unallAmount) {

		this.insInvoiceNo = insInvoiceNo;
		this.insInvoiceDate = insInvoiceDate;
		this.insCycle = insCycle;
		this.unallAmount = unallAmount;
	};

	private static final int[] fieldSizes = new int[] { insInvoiceNoSize, 0, insCycleSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DOUBLE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.insInvoiceNo == null) ? null
						: (this.insInvoiceNo.length() <= insInvoiceNoSize) ? this.insInvoiceNo
								: this.insInvoiceNo.substring(0, this.insInvoiceNoSize)),
				this.insInvoiceDate,
				((this.insCycle == null) ? null
						: (this.insCycle.length() <= insCycleSize) ? this.insCycle
								: this.insCycle.substring(0, this.insCycleSize)),
				this.unallAmount };
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
		this.insInvoiceNo = rtrim((String) fields[0]);
		this.insInvoiceDate = ((fields[1] == null) ? null : new Date(fields[1]));
		this.insCycle = rtrim((String) fields[2]);
		this.unallAmount = ((Double) fields[3]);
	}

	public void set(final String insInvoiceNo, final Date insInvoiceDate, final String insCycle,
			final Double unallAmount) {

		this.insInvoiceNo = insInvoiceNo;
		this.insInvoiceDate = insInvoiceDate;
		this.insCycle = insCycle;
		this.unallAmount = unallAmount;
	}

	public String getInsInvoiceNo() {
		return insInvoiceNo;
	}

	public void setInsInvoiceNo(String insInvoiceNo) {
		this.insInvoiceNo = insInvoiceNo;
	}

	public Date getInsInvoiceDate() {
		return insInvoiceDate;
	}

	public void setInsInvoiceDate(Date insInvoiceDate) {
		this.insInvoiceDate = insInvoiceDate;
	}

	public String getInsCycle() {
		return insCycle;
	}

	public void setInsCycle(String insCycle) {
		this.insCycle = insCycle;
	}

	public Double getUnallAmount() {
		return unallAmount;
	}

	public void setUnallAmount(Double unallAmount) {
		this.unallAmount = unallAmount;
	}
}
