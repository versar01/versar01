package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class HhHierarchyHeadDMO extends DBO implements Serializable {

	private String hhType;
	private Integer hhSerial;
	private String hhName;
	private Date hhActiveDate;
	private Date hhDeactiveDate;

	public static final int hhTypeFilter = 0;
	private static final int hhTypeSize = 10;

	public static final int hhSerialFilter = 1;

	public static final int hhNameFilter = 2;
	private static final int hhNameSize = 50;

	public static final int hhActiveDateFilter = 3;

	public static final int hhDeactiveDateFilter = 4;

	public HhHierarchyHeadDMO() {
	};

	public HhHierarchyHeadDMO(final String hhType, final Integer hhSerial,
			final String hhName, final Date hhActiveDate,
			final Date hhDeactiveDate) {

		this.hhType = hhType;
		this.hhSerial = hhSerial;
		this.hhName = hhName;
		this.hhActiveDate = hhActiveDate;
		this.hhDeactiveDate = hhDeactiveDate;
	};

	private static final int[] fieldSizes = new int[] { hhTypeSize, 0,
			hhNameSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.hhType == null) ? null
						: (this.hhType.length() <= hhTypeSize) ? this.hhType
								: this.hhType.substring(0, this.hhTypeSize)),
				this.hhSerial,
				((this.hhName == null) ? null
						: (this.hhName.length() <= hhNameSize) ? this.hhName
								: this.hhName.substring(0, this.hhNameSize)),
				this.hhActiveDate, this.hhDeactiveDate };
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
		return new DAOArgs(1).arg(this.hhSerial);
	}

	protected void set(Object[] fields) {
		this.hhType = rtrim((String) fields[0]);
		this.hhSerial = ((Integer) fields[1]);
		this.hhName = rtrim((String) fields[2]);
		this.hhActiveDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.hhDeactiveDate = ((fields[4] == null) ? null : new Date(
				 fields[4]));
	}

	public void set(final String hhType, final Integer hhSerial,
			final String hhName, final Date hhActiveDate,
			final Date hhDeactiveDate) {

		this.hhType = hhType;
		this.hhSerial = hhSerial;
		this.hhName = hhName;
		this.hhActiveDate = hhActiveDate;
		this.hhDeactiveDate = hhDeactiveDate;
	}

	public String getHhType() {
		return hhType;
	}

	public void setHhType(String hhType) {
		this.hhType = hhType;
	}

	public Integer getHhSerial() {
		return hhSerial;
	}

	public void setHhSerial(Integer hhSerial) {
		this.hhSerial = hhSerial;
	}

	public String getHhName() {
		return hhName;
	}

	public void setHhName(String hhName) {
		this.hhName = hhName;
	}

	public Date getHhActiveDate() {
		return hhActiveDate;
	}

	public void setHhActiveDate(Date hhActiveDate) {
		this.hhActiveDate = hhActiveDate;
	}

	public Date getHhDeactiveDate() {
		return hhDeactiveDate;
	}

	public void setHhDeactiveDate(Date hhDeactiveDate) {
		this.hhDeactiveDate = hhDeactiveDate;
	}

}
