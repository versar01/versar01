package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class ScSerialCustomerDMO extends DBO implements Serializable {

	private Integer scSerial;
	private String scBillAcNo;

	public static final int scSerialFilter = 0;

	public static final int scBillAcNoFilter = 1;
	private static final int scBillAcNoSize = 8;

	public ScSerialCustomerDMO() {
	};

	public ScSerialCustomerDMO(final Integer scSerial, final String scBillAcNo) {

		this.scSerial = scSerial;
		this.scBillAcNo = scBillAcNo;
	};

	private static final int[] fieldSizes = new int[] { 0, scBillAcNoSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.scSerial,
				((this.scBillAcNo == null) ? null
						: (this.scBillAcNo.length() <= scBillAcNoSize) ? this.scBillAcNo
								: this.scBillAcNo.substring(0,
										this.scBillAcNoSize)) };
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
		return new DAOArgs(1).arg(this.scSerial);
	}

	protected void set(Object[] fields) {
		this.scSerial = ((Integer) fields[0]);
		this.scBillAcNo = rtrim((String) fields[1]);
	}

	public void set(final Integer scSerial, final String scBillAcNo) {

		this.scSerial = scSerial;
		this.scBillAcNo = scBillAcNo;
	}

	public Integer getScSerial() {
		return scSerial;
	}

	public void setScSerial(Integer scSerial) {
		this.scSerial = scSerial;
	}

	public String getScBillAcNo() {
		return scBillAcNo;
	}

	public void setScBillAcNo(String scBillAcNo) {
		this.scBillAcNo = scBillAcNo;
	}

}
