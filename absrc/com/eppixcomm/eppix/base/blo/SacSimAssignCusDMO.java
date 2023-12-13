package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SacSimAssignCusDMO extends DBO implements Serializable {

	private String sacBillAcNo;
	private String sacSimNo;

	public static final int sacBillAcNoFilter = 0;
	private static final int sacBillAcNoSize = 8;

	public static final int sacSimNoFilter = 1;
	private static final int sacSimNoSize = 14;

	public SacSimAssignCusDMO() {
	};

	public SacSimAssignCusDMO(final String sacBillAcNo, final String sacSimNo) {

		this.sacBillAcNo = sacBillAcNo;
		this.sacSimNo = sacSimNo;
	};

	private static final int[] fieldSizes = new int[] { sacBillAcNoSize,
			sacSimNoSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sacBillAcNo == null) ? null
						: (this.sacBillAcNo.length() <= sacBillAcNoSize) ? this.sacBillAcNo
								: this.sacBillAcNo.substring(0,
										this.sacBillAcNoSize)),
				((this.sacSimNo == null) ? null
						: (this.sacSimNo.length() <= sacSimNoSize) ? this.sacSimNo
								: this.sacSimNo.substring(0, this.sacSimNoSize)) };
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
		return new DAOArgs(2).arg(this.sacBillAcNo).arg(this.sacSimNo);
	}

	protected void set(Object[] fields) {
		this.sacBillAcNo = rtrim((String) fields[0]);
		this.sacSimNo = rtrim((String) fields[1]);
	}

	public void set(final String sacBillAcNo, final String sacSimNo) {

		this.sacBillAcNo = sacBillAcNo;
		this.sacSimNo = sacSimNo;
	}

	public String getSacBillAcNo() {
		return sacBillAcNo;
	}

	public void setSacBillAcNo(String sacBillAcNo) {
		this.sacBillAcNo = sacBillAcNo;
	}

	public String getSacSimNo() {
		return sacSimNo;
	}

	public void setSacSimNo(String sacSimNo) {
		this.sacSimNo = sacSimNo;
	}
}