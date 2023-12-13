package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PcPartnerCyclesDMO extends DBO implements Serializable {

	private Integer pcPartnerId;
	private String pcBillCycle;
	private String pcCycleType;
	private String pcCycleStatus;

	public static final int pcPartnerIdFilter = 0;

	public static final int pcBillCycleFilter = 1;
	private static final int pcBillCycleSize = 5;

	public static final int pcCycleTypeFilter = 2;
	private static final int pcCycleTypeSize = 1;

	public static final int pcCycleStatusFilter = 3;
	private static final int pcCycleStatusSize = 1;

	public PcPartnerCyclesDMO() {
	};

	public PcPartnerCyclesDMO(final Integer pcPartnerId,
			final String pcBillCycle, final String pcCycleType,
			final String pcCycleStatus) {

		this.pcPartnerId = pcPartnerId;
		this.pcBillCycle = pcBillCycle;
		this.pcCycleType = pcCycleType;
		this.pcCycleStatus = pcCycleStatus;
	};

	private static final int[] fieldSizes = new int[] { 0, pcBillCycleSize,
			pcCycleTypeSize, pcCycleStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pcPartnerId,
				((this.pcBillCycle == null) ? null
						: (this.pcBillCycle.length() <= pcBillCycleSize) ? this.pcBillCycle
								: this.pcBillCycle.substring(0,
										this.pcBillCycleSize)),
				((this.pcCycleType == null) ? null
						: (this.pcCycleType.length() <= pcCycleTypeSize) ? this.pcCycleType
								: this.pcCycleType.substring(0,
										this.pcCycleTypeSize)),
				((this.pcCycleStatus == null) ? null : (this.pcCycleStatus
						.length() <= pcCycleStatusSize) ? this.pcCycleStatus
						: this.pcCycleStatus.substring(0,
								this.pcCycleStatusSize)) };
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
		return new DAOArgs(1).arg(this.pcBillCycle);
	}

	protected void set(Object[] fields) {
		this.pcPartnerId = ((Integer) fields[0]);
		this.pcBillCycle = rtrim((String) fields[1]);
		this.pcCycleType = rtrim((String) fields[2]);
		this.pcCycleStatus = rtrim((String) fields[3]);
	}

	public void set(final Integer pcPartnerId, final String pcBillCycle,
			final String pcCycleType, final String pcCycleStatus) {

		this.pcPartnerId = pcPartnerId;
		this.pcBillCycle = pcBillCycle;
		this.pcCycleType = pcCycleType;
		this.pcCycleStatus = pcCycleStatus;
	}

	public Integer getPcPartnerId() {
		return pcPartnerId;
	}

	public void setPcPartnerId(Integer pcPartnerId) {
		this.pcPartnerId = pcPartnerId;
	}

	public String getPcBillCycle() {
		return pcBillCycle;
	}

	public void setPcBillCycle(String pcBillCycle) {
		this.pcBillCycle = pcBillCycle;
	}

	public String getPcCycleType() {
		return pcCycleType;
	}

	public void setPcCycleType(String pcCycleType) {
		this.pcCycleType = pcCycleType;
	}

	public String getPcCycleStatus() {
		return pcCycleStatus;
	}

	public void setPcCycleStatus(String pcCycleStatus) {
		this.pcCycleStatus = pcCycleStatus;
	}

}
