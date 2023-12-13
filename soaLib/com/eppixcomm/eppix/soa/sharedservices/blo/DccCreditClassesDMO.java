package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class DccCreditClassesDMO extends DBO implements Serializable {

	private String dccClassId;
	private Short dccClassOrder;
	private String dccClassDesc;

	public static final int dccClassIdFilter = 0;
	private static final int dccClassIdSize = 5;

	public static final int dccClassOrderFilter = 1;

	public static final int dccClassDescFilter = 2;
	private static final int dccClassDescSize = 20;

	public DccCreditClassesDMO() {
	};

	public DccCreditClassesDMO(final String dccClassId, final Short dccClassOrder, final String dccClassDesc) {

		this.dccClassId = dccClassId;
		this.dccClassOrder = dccClassOrder;
		this.dccClassDesc = dccClassDesc;
	};

	private static final int[] fieldSizes = new int[] { dccClassIdSize, 0, dccClassDescSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.dccClassId == null) ? null
						: (this.dccClassId.length() <= dccClassIdSize) ? this.dccClassId
								: this.dccClassId.substring(0, this.dccClassIdSize)),
				this.dccClassOrder,
				((this.dccClassDesc == null) ? null
						: (this.dccClassDesc.length() <= dccClassDescSize) ? this.dccClassDesc
								: this.dccClassDesc.substring(0, this.dccClassDescSize)) };
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
		return new DAOArgs(1).arg(this.dccClassOrder);
	}

	protected void set(Object[] fields) {
		this.dccClassId = rtrim((String) fields[0]);
		this.dccClassOrder = ((Short) fields[1]);
		this.dccClassDesc = rtrim((String) fields[2]);
	}

	public void set(final String dccClassId, final Short dccClassOrder, final String dccClassDesc) {

		this.dccClassId = dccClassId;
		this.dccClassOrder = dccClassOrder;
		this.dccClassDesc = dccClassDesc;
	}

	public String getDccClassId() {
		return dccClassId;
	}

	public void setDccClassId(String dccClassId) {
		this.dccClassId = dccClassId;
	}

	public Short getDccClassOrder() {
		return dccClassOrder;
	}

	public void setDccClassOrder(Short dccClassOrder) {
		this.dccClassOrder = dccClassOrder;
	}

	public String getDccClassDesc() {
		return dccClassDesc;
	}

	public void setDccClassDesc(String dccClassDesc) {
		this.dccClassDesc = dccClassDesc;
	}

	@Override
	public String toString() {
		return "\nDccCreditClassesDMO [\ndccClassId=" + dccClassId + "\ndccClassOrder=" + dccClassOrder + "\ndccClassDesc="
				+ dccClassDesc + "]";
	}

}
