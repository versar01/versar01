package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TrgTargetGroupDMO extends DBO implements Serializable {

	private Integer trgGroupSerial;
	private String trgGroupName;
	private String trgSupervisor;
	private String trgSuspended;

	public static final int trgGroupSerialFilter = 0;
	private static final int trgGroupSerialSize = 332;

	public static final int trgGroupNameFilter = 1;
	private static final int trgGroupNameSize = 32;

	public static final int trgSupervisorFilter = 2;
	private static final int trgSupervisorSize = 20;

	public static final int trgSuspendedFilter = 3;
	private static final int trgSuspendedSize = 1;

	public TrgTargetGroupDMO() {
	};

	public TrgTargetGroupDMO(final Integer trgGroupSerial,
			final String trgGroupName, final String trgSupervisor,
			final String trgSuspended) {

		this.trgGroupSerial = trgGroupSerial;
		this.trgGroupName = trgGroupName;
		this.trgSupervisor = trgSupervisor;
		this.trgSuspended = trgSuspended;
	};

	private static final int[] fieldSizes = new int[] { trgGroupSerialSize,
			trgGroupNameSize, trgSupervisorSize, trgSuspendedSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.trgGroupSerial,
				((this.trgGroupName == null) ? null : (this.trgGroupName
						.length() <= trgGroupNameSize) ? this.trgGroupName
						: this.trgGroupName.substring(0, this.trgGroupNameSize)),
				((this.trgSupervisor == null) ? null : (this.trgSupervisor
						.length() <= trgSupervisorSize) ? this.trgSupervisor
						: this.trgSupervisor.substring(0,
								this.trgSupervisorSize)),
				((this.trgSuspended == null) ? null : (this.trgSuspended
						.length() <= trgSuspendedSize) ? this.trgSuspended
						: this.trgSuspended.substring(0, this.trgSuspendedSize)) };
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
		return new DAOArgs(1).arg(this.trgGroupSerial);
	}

	protected void set(Object[] fields) {
		this.trgGroupSerial = (Integer) fields[0];
		this.trgGroupName = rtrim((String) fields[1]);
		this.trgSupervisor = rtrim((String) fields[2]);
		this.trgSuspended = rtrim((String) fields[3]);
	}

	public void set(final Integer trgGroupSerial, final String trgGroupName,
			final String trgSupervisor, final String trgSuspended) {

		this.trgGroupSerial = trgGroupSerial;
		this.trgGroupName = trgGroupName;
		this.trgSupervisor = trgSupervisor;
		this.trgSuspended = trgSuspended;
	}

	public Integer getTrgGroupSerial() {
		return trgGroupSerial;
	}

	public void setTrgGroupSerial(Integer trgGroupSerial) {
		this.trgGroupSerial = trgGroupSerial;
	}

	public String getTrgGroupName() {
		return trgGroupName;
	}

	public void setTrgGroupName(String trgGroupName) {
		this.trgGroupName = trgGroupName;
	}

	public String getTrgSupervisor() {
		return trgSupervisor;
	}

	public void setTrgSupervisor(String trgSupervisor) {
		this.trgSupervisor = trgSupervisor;
	}

	public String getTrgSuspended() {
		return trgSuspended;
	}

	public void setTrgSuspended(String trgSuspended) {
		this.trgSuspended = trgSuspended;
	}

}
