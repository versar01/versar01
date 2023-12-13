package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class RcReasonCodeDMO extends DBO implements Serializable {

	private String RcCode;
	private String RcType;
	private String RcDesc;

	public static final int RcCodeFilter = 0;
	private static final int RcCodeSize = 4;

	public static final int RcTypeFilter = 1;
	private static final int RcTypeSize = 15;

	public static final int RcDescFilter = 2;
	private static final int RcDescSize = 32;

	public RcReasonCodeDMO() {
	};

	public RcReasonCodeDMO(final String RcCode, final String RcType,
			final String RcDesc) {

		this.RcCode = RcCode;
		this.RcType = RcType;
		this.RcDesc = RcDesc;
	};

	private static final int[] fieldSizes = new int[] { RcCodeSize, RcTypeSize,
			RcDescSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.RcCode == null) ? null
						: (this.RcCode.length() <= RcCodeSize) ? this.RcCode
								: this.RcCode.substring(0, this.RcCodeSize)),
				((this.RcType == null) ? null
						: (this.RcType.length() <= RcTypeSize) ? this.RcType
								: this.RcType.substring(0, this.RcTypeSize)),
				((this.RcDesc == null) ? null
						: (this.RcDesc.length() <= RcDescSize) ? this.RcDesc
								: this.RcDesc.substring(0, this.RcDescSize)) };
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
		return new DAOArgs(1).arg(this.RcCode);
	}

	protected void set(Object[] fields) {
		this.RcCode = rtrim((String) fields[0]);
		this.RcType = rtrim((String) fields[1]);
		this.RcDesc = rtrim((String) fields[2]);
	}

	public void set(final String RcCode, final String RcType,
			final String RcDesc) {

		this.RcCode = RcCode;
		this.RcType = RcType;
		this.RcDesc = RcDesc;
	}

	public String getRcCode() {
		return RcCode;
	}

	public void setRcCode(String rcCode) {
		RcCode = rcCode;
	}

	public String getRcType() {
		return RcType;
	}

	public void setRcType(String rcType) {
		RcType = rcType;
	}

	public String getRcDesc() {
		return RcDesc;
	}

	public void setRcDesc(String rcDesc) {
		RcDesc = rcDesc;
	}

}