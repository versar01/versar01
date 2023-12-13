package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AcvAccCrmValueDMO extends DBO implements Serializable {

	private String acvBillAcNo;
	private String acvCrmValue;
	private String acvType;

	public static final int acvBillAcNoFilter = 0;
	private static final int acvBillAcNoSize = 8;

	public static final int acvCrmValueFilter = 1;
	private static final int acvCrmValueSize = 8;

	public static final int acvTypeFilter = 2;
	private static final int acvTypeSize = 1;

	public AcvAccCrmValueDMO() {
	};

	public AcvAccCrmValueDMO(final String acvBillAcNo,
			final String acvCrmValue, final String acvType) {

		this.acvBillAcNo = acvBillAcNo;
		this.acvCrmValue = acvCrmValue;
		this.acvType = acvType;
	};

	private static final int[] fieldSizes = new int[] { acvBillAcNoSize,
			acvCrmValueSize, acvTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.acvBillAcNo == null) ? null
						: (this.acvBillAcNo.length() <= acvBillAcNoSize) ? this.acvBillAcNo
								: this.acvBillAcNo.substring(0,
										this.acvBillAcNoSize)),
				((this.acvCrmValue == null) ? null
						: (this.acvCrmValue.length() <= acvCrmValueSize) ? this.acvCrmValue
								: this.acvCrmValue.substring(0,
										this.acvCrmValueSize)),
				((this.acvType == null) ? null
						: (this.acvType.length() <= acvTypeSize) ? this.acvType
								: this.acvType.substring(0, this.acvTypeSize)) };
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
		return new DAOArgs(1).arg(this.acvBillAcNo);
	}

	protected void set(Object[] fields) {
		this.acvBillAcNo = rtrim((String) fields[0]);
		this.acvCrmValue = rtrim((String) fields[1]);
		this.acvType = rtrim((String) fields[2]);
	}

	public void set(final String acvBillAcNo, final String acvCrmValue,
			final String acvType) {

		this.acvBillAcNo = acvBillAcNo;
		this.acvCrmValue = acvCrmValue;
		this.acvType = acvType;
	}

	public String getAcvBillAcNo() {
		return acvBillAcNo;
	}

	public void setAcvBillAcNo(String acvBillAcNo) {
		this.acvBillAcNo = acvBillAcNo;
	}

	public String getAcvCrmValue() {
		return acvCrmValue;
	}

	public void setAcvCrmValue(String acvCrmValue) {
		this.acvCrmValue = acvCrmValue;
	}

	public String getAcvType() {
		return acvType;
	}

	public void setAcvType(String acvType) {
		this.acvType = acvType;
	}

}
