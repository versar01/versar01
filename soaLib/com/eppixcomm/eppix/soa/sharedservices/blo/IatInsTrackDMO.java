package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class IatInsTrackDMO extends DBO implements Serializable {

	private Integer iatInsId;
	private Integer iatSubscriberId;
	private String iatCurrentMsisdn;
	private String iatCurrentAccno;
	private String iatOldValue;
	private Integer iatOldSbeEquipid;
	private Integer iatNewSbeEquipid;
	private DateTime iatActionDate;
	private String iatActionType;

	public static final int iatInsIdFilter = 0;

	public static final int iatSubscriberIdFilter = 1;

	public static final int iatCurrentMsisdnFilter = 2;
	private static final int iatCurrentMsisdnSize = 15;

	public static final int iatCurrentAccnoFilter = 3;
	private static final int iatCurrentAccnoSize = 8;

	public static final int iatOldValueFilter = 4;
	private static final int iatOldValueSize = 30;

	public static final int iatOldSbeEquipidFilter = 5;

	public static final int iatNewSbeEquipidFilter = 6;

	public static final int iatActionDateFilter = 7;

	public static final int iatActionTypeFilter = 8;
	private static final int iatActionTypeSize = 6;

	public IatInsTrackDMO() {
	};

	public IatInsTrackDMO(final Integer iatInsId,
			final Integer iatSubscriberId, final String iatCurrentMsisdn,
			final String iatCurrentAccno, final String iatOldValue,
			final Integer iatOldSbeEquipid, final Integer iatNewSbeEquipid,
			final DateTime iatActionDate, final String iatActionType) {

		this.iatInsId = iatInsId;
		this.iatSubscriberId = iatSubscriberId;
		this.iatCurrentMsisdn = iatCurrentMsisdn;
		this.iatCurrentAccno = iatCurrentAccno;
		this.iatOldValue = iatOldValue;
		this.iatOldSbeEquipid = iatOldSbeEquipid;
		this.iatNewSbeEquipid = iatNewSbeEquipid;
		this.iatActionDate = iatActionDate;
		this.iatActionType = iatActionType;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			iatCurrentMsisdnSize, iatCurrentAccnoSize, iatOldValueSize, 0, 0,
			0, iatActionTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.iatInsId,
				this.iatSubscriberId,
				((this.iatCurrentMsisdn == null) ? null
						: (this.iatCurrentMsisdn.length() <= iatCurrentMsisdnSize) ? this.iatCurrentMsisdn
								: this.iatCurrentMsisdn.substring(0,
										this.iatCurrentMsisdnSize)),
				((this.iatCurrentAccno == null) ? null
						: (this.iatCurrentAccno.length() <= iatCurrentAccnoSize) ? this.iatCurrentAccno
								: this.iatCurrentAccno.substring(0,
										this.iatCurrentAccnoSize)),
				((this.iatOldValue == null) ? null
						: (this.iatOldValue.length() <= iatOldValueSize) ? this.iatOldValue
								: this.iatOldValue.substring(0,
										this.iatOldValueSize)),
				this.iatOldSbeEquipid,
				this.iatNewSbeEquipid,
				this.iatActionDate,
				((this.iatActionType == null) ? null : (this.iatActionType
						.length() <= iatActionTypeSize) ? this.iatActionType
						: this.iatActionType.substring(0,
								this.iatActionTypeSize)) };
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
		return null;
	}

	protected void set(Object[] fields) {
		this.iatInsId = ((Integer) fields[0]);
		this.iatSubscriberId = ((Integer) fields[1]);
		this.iatCurrentMsisdn = rtrim((String) fields[2]);
		this.iatCurrentAccno = rtrim((String) fields[3]);
		this.iatOldValue = rtrim((String) fields[4]);
		this.iatOldSbeEquipid = ((Integer) fields[5]);
		this.iatNewSbeEquipid = ((Integer) fields[6]);
		this.iatActionDate = ((DateTime) fields[7]);
		this.iatActionType = rtrim((String) fields[8]);
	}

	public void set(final Integer iatInsId, final Integer iatSubscriberId,
			final String iatCurrentMsisdn, final String iatCurrentAccno,
			final String iatOldValue, final Integer iatOldSbeEquipid,
			final Integer iatNewSbeEquipid, final DateTime iatActionDate,
			final String iatActionType) {

		this.iatInsId = iatInsId;
		this.iatSubscriberId = iatSubscriberId;
		this.iatCurrentMsisdn = iatCurrentMsisdn;
		this.iatCurrentAccno = iatCurrentAccno;
		this.iatOldValue = iatOldValue;
		this.iatOldSbeEquipid = iatOldSbeEquipid;
		this.iatNewSbeEquipid = iatNewSbeEquipid;
		this.iatActionDate = iatActionDate;
		this.iatActionType = iatActionType;
	}

	public Integer getIatInsId() {
		return iatInsId;
	}

	public void setIatInsId(Integer iatInsId) {
		this.iatInsId = iatInsId;
	}

	public Integer getIatSubscriberId() {
		return iatSubscriberId;
	}

	public void setIatSubscriberId(Integer iatSubscriberId) {
		this.iatSubscriberId = iatSubscriberId;
	}

	public String getIatCurrentMsisdn() {
		return iatCurrentMsisdn;
	}

	public void setIatCurrentMsisdn(String iatCurrentMsisdn) {
		this.iatCurrentMsisdn = iatCurrentMsisdn;
	}

	public String getIatCurrentAccno() {
		return iatCurrentAccno;
	}

	public void setIatCurrentAccno(String iatCurrentAccno) {
		this.iatCurrentAccno = iatCurrentAccno;
	}

	public String getIatOldValue() {
		return iatOldValue;
	}

	public void setIatOldValue(String iatOldValue) {
		this.iatOldValue = iatOldValue;
	}

	public Integer getIatOldSbeEquipid() {
		return iatOldSbeEquipid;
	}

	public void setIatOldSbeEquipid(Integer iatOldSbeEquipid) {
		this.iatOldSbeEquipid = iatOldSbeEquipid;
	}

	public Integer getIatNewSbeEquipid() {
		return iatNewSbeEquipid;
	}

	public void setIatNewSbeEquipid(Integer iatNewSbeEquipid) {
		this.iatNewSbeEquipid = iatNewSbeEquipid;
	}

	public DateTime getIatActionDate() {
		return iatActionDate;
	}

	public void setIatActionDate(DateTime iatActionDate) {
		this.iatActionDate = iatActionDate;
	}

	public String getIatActionType() {
		return iatActionType;
	}

	public void setIatActionType(String iatActionType) {
		this.iatActionType = iatActionType;
	}

	@Override
	public String toString() {
		return "\nIatInsTrackDMO [\niatInsId=" + iatInsId + "\niatSubscriberId="
				+ iatSubscriberId + "\niatCurrentMsisdn=" + iatCurrentMsisdn
				+ "\niatCurrentAccno=" + iatCurrentAccno + "\niatOldValue="
				+ iatOldValue + "\niatOldSbeEquipid=" + iatOldSbeEquipid
				+ "\niatNewSbeEquipid=" + iatNewSbeEquipid + "\niatActionDate="
				+ iatActionDate + "\niatActionType=" + iatActionType + "]";
	}

}
