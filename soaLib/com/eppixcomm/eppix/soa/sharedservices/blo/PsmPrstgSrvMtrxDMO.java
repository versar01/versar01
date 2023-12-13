package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PsmPrstgSrvMtrxDMO extends DBO implements Serializable {

	private String psmServiceCode;
	private String psmActivateType;
	private String psmDepositWaiver;
	private String psmDeactType;

	public static final int psmServiceCodeFilter = 0;
	private static final int psmServiceCodeSize = 4;

	public static final int psmActivateTypeFilter = 1;
	private static final int psmActivateTypeSize = 2;

	public static final int psmDepositWaiverFilter = 2;
	private static final int psmDepositWaiverSize = 1;

	public static final int psmDeactTypeFilter = 3;
	private static final int psmDeactTypeSize = 2;

	public PsmPrstgSrvMtrxDMO() {
	};

	public PsmPrstgSrvMtrxDMO(final String psmServiceCode,
			final String psmActivateType, final String psmDepositWaiver,
			final String psmDeactType) {

		this.psmServiceCode = psmServiceCode;
		this.psmActivateType = psmActivateType;
		this.psmDepositWaiver = psmDepositWaiver;
		this.psmDeactType = psmDeactType;
	};

	private static final int[] fieldSizes = new int[] { psmServiceCodeSize,
			psmActivateTypeSize, psmDepositWaiverSize, psmDeactTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.psmServiceCode == null) ? null : (this.psmServiceCode
						.length() <= psmServiceCodeSize) ? this.psmServiceCode
						: this.psmServiceCode.substring(0,
								this.psmServiceCodeSize)),
				((this.psmActivateType == null) ? null
						: (this.psmActivateType.length() <= psmActivateTypeSize) ? this.psmActivateType
								: this.psmActivateType.substring(0,
										this.psmActivateTypeSize)),
				((this.psmDepositWaiver == null) ? null
						: (this.psmDepositWaiver.length() <= psmDepositWaiverSize) ? this.psmDepositWaiver
								: this.psmDepositWaiver.substring(0,
										this.psmDepositWaiverSize)),
				((this.psmDeactType == null) ? null : (this.psmDeactType
						.length() <= psmDeactTypeSize) ? this.psmDeactType
						: this.psmDeactType.substring(0, this.psmDeactTypeSize)) };
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
		return new DAOArgs(1).arg(this.psmServiceCode);
	}

	protected void set(Object[] fields) {
		this.psmServiceCode = rtrim((String) fields[0]);
		this.psmActivateType = rtrim((String) fields[1]);
		this.psmDepositWaiver = rtrim((String) fields[2]);
		this.psmDeactType = rtrim((String) fields[3]);
	}

	public void set(final String psmServiceCode, final String psmActivateType,
			final String psmDepositWaiver, final String psmDeactType) {

		this.psmServiceCode = psmServiceCode;
		this.psmActivateType = psmActivateType;
		this.psmDepositWaiver = psmDepositWaiver;
		this.psmDeactType = psmDeactType;
	}

	public String getPsmServiceCode() {
		return psmServiceCode;
	}

	public void setPsmServiceCode(String psmServiceCode) {
		this.psmServiceCode = psmServiceCode;
	}

	public String getPsmActivateType() {
		return psmActivateType;
	}

	public void setPsmActivateType(String psmActivateType) {
		this.psmActivateType = psmActivateType;
	}

	public String getPsmDepositWaiver() {
		return psmDepositWaiver;
	}

	public void setPsmDepositWaiver(String psmDepositWaiver) {
		this.psmDepositWaiver = psmDepositWaiver;
	}

	public String getPsmDeactType() {
		return psmDeactType;
	}

	public void setPsmDeactType(String psmDeactType) {
		this.psmDeactType = psmDeactType;
	}

}
