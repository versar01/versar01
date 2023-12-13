package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TmpServiceRejectDMO extends DBO implements Serializable {

	private String tsrSimNo;
	private String tsrServiceCode;
	private String tsrServiceDesc;
	private String tsrReason;

	public static final int tsrSimNoFilter = 0;
	private static final int tsrSimNoSize = 14;

	public static final int tsrServiceCodeFilter = 1;
	private static final int tsrServiceCodeSize = 5;

	public static final int tsrServiceDescFilter = 2;
	private static final int tsrServiceDescSize = 32;

	public static final int tsrReasonFilter = 3;
	private static final int tsrReasonSize = 80;

	public TmpServiceRejectDMO() {
	};

	public TmpServiceRejectDMO(final String tsrSimNo,
			final String tsrServiceCode, final String tsrServiceDesc,
			final String tsrReason) {

		this.tsrSimNo = tsrSimNo;
		this.tsrServiceCode = tsrServiceCode;
		this.tsrServiceDesc = tsrServiceDesc;
		this.tsrReason = tsrReason;
	};

	private static final int[] fieldSizes = new int[] { tsrSimNoSize,
			tsrServiceCodeSize, tsrServiceDescSize, tsrReasonSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

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
								this.tsrServiceDescSize)),
				((this.tsrReason == null) ? null
						: (this.tsrReason.length() <= tsrReasonSize) ? this.tsrReason
								: this.tsrReason.substring(0,
										this.tsrReasonSize)) };
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
		this.tsrReason = rtrim((String) fields[3]);
	}

	public void set(final String tsrSimNo, final String tsrServiceCode,
			final String tsrServiceDesc, final String tsrReason) {

		this.tsrSimNo = tsrSimNo;
		this.tsrServiceCode = tsrServiceCode;
		this.tsrServiceDesc = tsrServiceDesc;
		this.tsrReason = tsrReason;
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

	public String getTsrReason() {
		return tsrReason;
	}

	public void setTsrReason(String tsrReason) {
		this.tsrReason = tsrReason;
	}

	@Override
	public String toString() {
		return "\nTmpServiceRejectDMO [\ntsrSimNo=" + tsrSimNo
				+ "\ntsrServiceCode=" + tsrServiceCode + "\ntsrServiceDesc="
				+ tsrServiceDesc + "\ntsrReason=" + tsrReason + "]";
	}

}
