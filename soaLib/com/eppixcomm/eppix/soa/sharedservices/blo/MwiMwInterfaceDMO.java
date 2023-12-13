package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class MwiMwInterfaceDMO extends DBO implements Serializable {

	private Integer mwiEventId;
	private String mwiEventType;
	private Short mwiStatus;
	private String mwiEventString;
	private Date mwiDateCreated;
	private String mwiErrorMess;

	public static final int mwiEventIdFilter = 0;
	private static final int mwiEventIdSize = 639573;

	public static final int mwiEventTypeFilter = 1;
	private static final int mwiEventTypeSize = 20;

	public static final int mwiStatusFilter = 2;

	public static final int mwiEventStringFilter = 3;
	private static final int mwiEventStringSize = 1024;

	public static final int mwiDateCreatedFilter = 4;

	public static final int mwiErrorMessFilter = 5;
	private static final int mwiErrorMessSize = 120;

	public MwiMwInterfaceDMO() {
	};

	public MwiMwInterfaceDMO(final Integer mwiEventId,
			final String mwiEventType, final Short mwiStatus,
			final String mwiEventString, final Date mwiDateCreated,
			final String mwiErrorMess) {

		this.mwiEventId = mwiEventId;
		this.mwiEventType = mwiEventType;
		this.mwiStatus = mwiStatus;
		this.mwiEventString = mwiEventString;
		this.mwiDateCreated = mwiDateCreated;
		this.mwiErrorMess = mwiErrorMess;
	};

	private static final int[] fieldSizes = new int[] { mwiEventIdSize,
			mwiEventTypeSize, 0, mwiEventStringSize, 0, mwiErrorMessSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.mwiEventId,
				((this.mwiEventType == null) ? null : (this.mwiEventType
						.length() <= mwiEventTypeSize) ? this.mwiEventType
						: this.mwiEventType.substring(0, this.mwiEventTypeSize)),
				this.mwiStatus,
				((this.mwiEventString == null) ? null : (this.mwiEventString
						.length() <= mwiEventStringSize) ? this.mwiEventString
						: this.mwiEventString.substring(0,
								this.mwiEventStringSize)),
				this.mwiDateCreated,
				((this.mwiErrorMess == null) ? null : (this.mwiErrorMess
						.length() <= mwiErrorMessSize) ? this.mwiErrorMess
						: this.mwiErrorMess.substring(0, this.mwiErrorMessSize)) };
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
		return new DAOArgs(1).arg(this.mwiEventId);
	}

	protected void set(Object[] fields) {
		this.mwiEventId = (Integer) fields[0];
		this.mwiEventType = rtrim((String) fields[1]);
		this.mwiStatus = ((Short) fields[2]);
		this.mwiEventString = rtrim((String) fields[3]);
		this.mwiDateCreated = ((fields[4] == null) ? null : new Date(
				(Date) fields[4]));
		this.mwiErrorMess = rtrim((String) fields[5]);
	}

	public void set(final Integer mwiEventId, final String mwiEventType,
			final Short mwiStatus, final String mwiEventString,
			final Date mwiDateCreated, final String mwiErrorMess) {

		this.mwiEventId = mwiEventId;
		this.mwiEventType = mwiEventType;
		this.mwiStatus = mwiStatus;
		this.mwiEventString = mwiEventString;
		this.mwiDateCreated = mwiDateCreated;
		this.mwiErrorMess = mwiErrorMess;
	}

	public Integer getMwiEventId() {
		return mwiEventId;
	}

	public void setMwiEventId(Integer mwiEventId) {
		this.mwiEventId = mwiEventId;
	}

	public String getMwiEventType() {
		return mwiEventType;
	}

	public void setMwiEventType(String mwiEventType) {
		this.mwiEventType = mwiEventType;
	}

	public Short getMwiStatus() {
		return mwiStatus;
	}

	public void setMwiStatus(Short mwiStatus) {
		this.mwiStatus = mwiStatus;
	}

	public String getMwiEventString() {
		return mwiEventString;
	}

	public void setMwiEventString(String mwiEventString) {
		this.mwiEventString = mwiEventString;
	}

	public Date getMwiDateCreated() {
		return mwiDateCreated;
	}

	public void setMwiDateCreated(Date mwiDateCreated) {
		this.mwiDateCreated = mwiDateCreated;
	}

	public String getMwiErrorMess() {
		return mwiErrorMess;
	}

	public void setMwiErrorMess(String mwiErrorMess) {
		this.mwiErrorMess = mwiErrorMess;
	}

}
