package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class AphApnPopHistDMO extends DBO implements Serializable {

	private String aphApnPopId;
	private String aphHistCode;
	private String aphOldValue;
	private String aphNewValue;
	private String aphUserId;
	private String aphTerminalId;
	private Date aphTimestamp;

	public static final int aphApnPopIdFilter = 0;
	private static final int aphApnPopIdSize = 15;

	public static final int aphHistCodeFilter = 1;
	private static final int aphHistCodeSize = 10;

	public static final int aphOldValueFilter = 2;
	private static final int aphOldValueSize = 50;

	public static final int aphNewValueFilter = 3;
	private static final int aphNewValueSize = 50;

	public static final int aphUserIdFilter = 4;
	private static final int aphUserIdSize = 10;

	public static final int aphTerminalIdFilter = 5;
	private static final int aphTerminalIdSize = 10;

	public static final int aphTimestampFilter = 6;

	public AphApnPopHistDMO() {
	};

	public AphApnPopHistDMO(final String aphApnPopId, final String aphHistCode,
			final String aphOldValue, final String aphNewValue,
			final String aphUserId, final String aphTerminalId,
			final Date aphTimestamp) {

		this.aphApnPopId = aphApnPopId;
		this.aphHistCode = aphHistCode;
		this.aphOldValue = aphOldValue;
		this.aphNewValue = aphNewValue;
		this.aphUserId = aphUserId;
		this.aphTerminalId = aphTerminalId;
		this.aphTimestamp = aphTimestamp;
	};

	private static final int[] fieldSizes = new int[] { aphApnPopIdSize,
			aphHistCodeSize, aphOldValueSize, aphNewValueSize, aphUserIdSize,
			aphTerminalIdSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.aphApnPopId == null) ? null
						: (this.aphApnPopId.length() <= aphApnPopIdSize) ? this.aphApnPopId
								: this.aphApnPopId.substring(0,
										this.aphApnPopIdSize)),
				((this.aphHistCode == null) ? null
						: (this.aphHistCode.length() <= aphHistCodeSize) ? this.aphHistCode
								: this.aphHistCode.substring(0,
										this.aphHistCodeSize)),
				((this.aphOldValue == null) ? null
						: (this.aphOldValue.length() <= aphOldValueSize) ? this.aphOldValue
								: this.aphOldValue.substring(0,
										this.aphOldValueSize)),
				((this.aphNewValue == null) ? null
						: (this.aphNewValue.length() <= aphNewValueSize) ? this.aphNewValue
								: this.aphNewValue.substring(0,
										this.aphNewValueSize)),
				((this.aphUserId == null) ? null
						: (this.aphUserId.length() <= aphUserIdSize) ? this.aphUserId
								: this.aphUserId.substring(0,
										this.aphUserIdSize)),
				((this.aphTerminalId == null) ? null : (this.aphTerminalId
						.length() <= aphTerminalIdSize) ? this.aphTerminalId
						: this.aphTerminalId.substring(0,
								this.aphTerminalIdSize)), this.aphTimestamp };
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
		this.aphApnPopId = rtrim((String) fields[0]);
		this.aphHistCode = rtrim((String) fields[1]);
		this.aphOldValue = rtrim((String) fields[2]);
		this.aphNewValue = rtrim((String) fields[3]);
		this.aphUserId = rtrim((String) fields[4]);
		this.aphTerminalId = rtrim((String) fields[5]);
		this.aphTimestamp = ((fields[6] == null) ? null : new Date(fields[6]));
	}

	public void set(final String aphApnPopId, final String aphHistCode,
			final String aphOldValue, final String aphNewValue,
			final String aphUserId, final String aphTerminalId,
			final Date aphTimestamp) {

		this.aphApnPopId = aphApnPopId;
		this.aphHistCode = aphHistCode;
		this.aphOldValue = aphOldValue;
		this.aphNewValue = aphNewValue;
		this.aphUserId = aphUserId;
		this.aphTerminalId = aphTerminalId;
		this.aphTimestamp = aphTimestamp;
	}

	public String getAphApnPopId() {
		return aphApnPopId;
	}

	public void setAphApnPopId(String aphApnPopId) {
		this.aphApnPopId = aphApnPopId;
	}

	public String getAphHistCode() {
		return aphHistCode;
	}

	public void setAphHistCode(String aphHistCode) {
		this.aphHistCode = aphHistCode;
	}

	public String getAphOldValue() {
		return aphOldValue;
	}

	public void setAphOldValue(String aphOldValue) {
		this.aphOldValue = aphOldValue;
	}

	public String getAphNewValue() {
		return aphNewValue;
	}

	public void setAphNewValue(String aphNewValue) {
		this.aphNewValue = aphNewValue;
	}

	public String getAphUserId() {
		return aphUserId;
	}

	public void setAphUserId(String aphUserId) {
		this.aphUserId = aphUserId;
	}

	public String getAphTerminalId() {
		return aphTerminalId;
	}

	public void setAphTerminalId(String aphTerminalId) {
		this.aphTerminalId = aphTerminalId;
	}

	public Date getAphTimestamp() {
		return aphTimestamp;
	}

	public void setAphTimestamp(Date aphTimestamp) {
		this.aphTimestamp = aphTimestamp;
	}
}
