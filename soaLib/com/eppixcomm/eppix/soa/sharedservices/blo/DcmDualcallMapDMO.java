package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class DcmDualcallMapDMO extends DBO implements Serializable {

	private String dcmServiceCode;
	private String dcmMapServCode;

	public static final int dcmServiceCodeFilter = 0;
	private static final int dcmServiceCodeSize = 4;

	public static final int dcmMapServCodeFilter = 1;
	private static final int dcmMapServCodeSize = 4;

	public DcmDualcallMapDMO() {
	};

	public DcmDualcallMapDMO(final String dcmServiceCode,
			final String dcmMapServCode) {

		this.dcmServiceCode = dcmServiceCode;
		this.dcmMapServCode = dcmMapServCode;
	};

	private static final int[] fieldSizes = new int[] { dcmServiceCodeSize,
			dcmMapServCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.dcmServiceCode == null) ? null : (this.dcmServiceCode
						.length() <= dcmServiceCodeSize) ? this.dcmServiceCode
						: this.dcmServiceCode.substring(0,
								this.dcmServiceCodeSize)),
				((this.dcmMapServCode == null) ? null : (this.dcmMapServCode
						.length() <= dcmMapServCodeSize) ? this.dcmMapServCode
						: this.dcmMapServCode.substring(0,
								this.dcmMapServCodeSize)) };
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
		return new DAOArgs(2).arg(this.dcmServiceCode).arg(this.dcmMapServCode);
	}

	protected void set(Object[] fields) {
		this.dcmServiceCode = rtrim((String) fields[0]);
		this.dcmMapServCode = rtrim((String) fields[1]);
	}

	public void set(final String dcmServiceCode, final String dcmMapServCode) {

		this.dcmServiceCode = dcmServiceCode;
		this.dcmMapServCode = dcmMapServCode;
	}

	public String getDcmServiceCode() {
		return dcmServiceCode;
	}

	public void setDcmServiceCode(String dcmServiceCode) {
		this.dcmServiceCode = dcmServiceCode;
	}

	public String getDcmMapServCode() {
		return dcmMapServCode;
	}

	public void setDcmMapServCode(String dcmMapServCode) {
		this.dcmMapServCode = dcmMapServCode;
	}

}
