package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SbdVamSelectDQO extends DBO implements Serializable {

	private String sbdBillAcNo;
	private Integer sbdSubscriberId;
	private String vamMsisdnNo;

	public static final int sbdBillAcNoFilter = 0;
	private static final int sbdBillAcNoSize = 8;

	public static final int sbdSubscriberIdFilter = 1;

	public static final int vamMsisdnNoFilter = 2;
	private static final int vamMsisdnNoSize = 15;

	public SbdVamSelectDQO() {
	};

	public SbdVamSelectDQO(final String sbdBillAcNo, final Integer sbdSubscriberId, final String vamMsisdnNo) {

		this.sbdBillAcNo = sbdBillAcNo;
		this.sbdSubscriberId = sbdSubscriberId;
		this.vamMsisdnNo = vamMsisdnNo;
	};

	private static final int[] fieldSizes = new int[] { sbdBillAcNoSize, 0, vamMsisdnNoSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sbdBillAcNo == null) ? null
						: (this.sbdBillAcNo.length() <= sbdBillAcNoSize) ? this.sbdBillAcNo
								: this.sbdBillAcNo.substring(0, this.sbdBillAcNoSize)),
				this.sbdSubscriberId,
				((this.vamMsisdnNo == null) ? null
						: (this.vamMsisdnNo.length() <= vamMsisdnNoSize) ? this.vamMsisdnNo
								: this.vamMsisdnNo.substring(0, this.vamMsisdnNoSize)) };
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
		this.sbdBillAcNo = rtrim((String) fields[0]);
		this.sbdSubscriberId = ((Integer) fields[1]);
		this.vamMsisdnNo = rtrim((String) fields[2]);
	}

	public void set(final String sbdBillAcNo, final Integer sbdSubscriberId, final String vamMsisdnNo) {

		this.sbdBillAcNo = sbdBillAcNo;
		this.sbdSubscriberId = sbdSubscriberId;
		this.vamMsisdnNo = vamMsisdnNo;
	}

	public String getSbdBillAcNo() {
		return sbdBillAcNo;
	}

	public void setSbdBillAcNo(String sbdBillAcNo) {
		this.sbdBillAcNo = sbdBillAcNo;
	}

	public Integer getSbdSubscriberId() {
		return sbdSubscriberId;
	}

	public void setSbdSubscriberId(Integer sbdSubscriberId) {
		this.sbdSubscriberId = sbdSubscriberId;
	}

	public String getVamMsisdnNo() {
		return vamMsisdnNo;
	}

	public void setVamMsisdnNo(String vamMsisdnNo) {
		this.vamMsisdnNo = vamMsisdnNo;
	}
}