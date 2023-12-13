package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AcrActionReasonDMO extends DBO implements Serializable {

	private String acrReasonId;
	private String acrReasonDesc;

	public static final int acrReasonIdFilter = 0;
	private static final int acrReasonIdSize = 8;

	public static final int acrReasonDescFilter = 1;
	private static final int acrReasonDescSize = 32;

	public AcrActionReasonDMO() {
	};

	public AcrActionReasonDMO(final String acrReasonId,
			final String acrReasonDesc) {

		this.acrReasonId = acrReasonId;
		this.acrReasonDesc = acrReasonDesc;
	};

	private static final int[] fieldSizes = new int[] { acrReasonIdSize,
			acrReasonDescSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.acrReasonId == null) ? null
						: (this.acrReasonId.length() <= acrReasonIdSize) ? this.acrReasonId
								: this.acrReasonId.substring(0,
										this.acrReasonIdSize)),
				((this.acrReasonDesc == null) ? null : (this.acrReasonDesc
						.length() <= acrReasonDescSize) ? this.acrReasonDesc
						: this.acrReasonDesc.substring(0,
								this.acrReasonDescSize)) };
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
		return new DAOArgs(1).arg(this.acrReasonId);
	}

	protected void set(Object[] fields) {
		this.acrReasonId = rtrim((String) fields[0]);
		this.acrReasonDesc = rtrim((String) fields[1]);
	}

	public void set(final String acrReasonId, final String acrReasonDesc) {

		this.acrReasonId = acrReasonId;
		this.acrReasonDesc = acrReasonDesc;
	}

	public String getAcrReasonId() {
		return acrReasonId;
	}

	public void setAcrReasonId(String acrReasonId) {
		this.acrReasonId = acrReasonId;
	}

	public String getAcrReasonDesc() {
		return acrReasonDesc;
	}

	public void setAcrReasonDesc(String acrReasonDesc) {
		this.acrReasonDesc = acrReasonDesc;
	}

}
