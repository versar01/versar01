package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class CmpServiceRejectDMO extends DBO implements Serializable {

	private String tsrSimNo;
	private String tsrServiceCode;
	private String tsrServiceDesc;

	public static final int tsrSimNoFilter = 0;
	private static final int tsrSimNoSize = 14;

	public static final int tsrServiceCodeFilter = 1;
	private static final int tsrServiceCodeSize = 5;

	public static final int tsrServiceDescFilter = 2;
	private static final int tsrServiceDescSize = 32;

	public CmpServiceRejectDMO() {
	};

	public CmpServiceRejectDMO(final String tsrSimNo,
			final String tsrServiceCode, final String tsrServiceDesc) {

		this.tsrSimNo = tsrSimNo;
		this.tsrServiceCode = tsrServiceCode;
		this.tsrServiceDesc = tsrServiceDesc;
	};

	private static final int[] fieldSizes = new int[] { tsrSimNoSize,
			tsrServiceCodeSize, tsrServiceDescSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.tsrSimNo == null) ? null
						: (this.tsrSimNo.length() <= tsrSimNoSize) ? this.tsrSimNo
								: this.tsrSimNo.substring(0, this.tsrSimNoSize)),
				((this.tsrServiceCode == null) ? null : (this.tsrServiceCode
						.length() <= tsrServiceCodeSize) ? this.tsrServiceCode
						: this.tsrServiceCode.substring(0,
								this.tsrServiceCodeSize)),
				((this.tsrServiceDesc == null) ? null : (this.tsrServiceDesc
						.length() <= tsrServiceDescSize) ? this.tsrServiceDesc
						: this.tsrServiceDesc.substring(0,
								this.tsrServiceDescSize)) };
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
		this.tsrSimNo = rtrim((String) fields[0]);
		this.tsrServiceCode = rtrim((String) fields[1]);
		this.tsrServiceDesc = rtrim((String) fields[2]);
	}

	public void set(final String tsrSimNo, final String tsrServiceCode,
			final String tsrServiceDesc) {

		this.tsrSimNo = tsrSimNo;
		this.tsrServiceCode = tsrServiceCode;
		this.tsrServiceDesc = tsrServiceDesc;
	}

	public String getTsrSimNo() {
		return tsrSimNo;
	}

	public void setTsrSimNo(String tsrSimNo) {
		this.tsrSimNo = tsrSimNo;
	}

	public String getTsrServiceCode() {
		return tsrServiceCode;
	}

	public void setTsrServiceCode(String tsrServiceCode) {
		this.tsrServiceCode = tsrServiceCode;
	}

	public String getTsrServiceDesc() {
		return tsrServiceDesc;
	}

	public void setTsrServiceDesc(String tsrServiceDesc) {
		this.tsrServiceDesc = tsrServiceDesc;
	}

	@Override
	public String toString() {
		return "\nCmpServiceRejectDMO [\ntsrSimNo=" + tsrSimNo
				+ "\ntsrServiceCode=" + tsrServiceCode + "\ntsrServiceDesc="
				+ tsrServiceDesc + "]";
	}

}
