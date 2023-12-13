package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class PfhPocSubHistDMO extends DBO implements Serializable {

	private Integer pfhSubscriberId;
	private Integer pfhFieldId;
	private String pfhHistCode;
	private String pfhOldValue;
	private String pfhNewValue;
	private String pfhUserId;
	private String pfhTerminalId;
	private DateTime pfhTimestamp;

	public static final int pfhSubscriberIdFilter = 0;

	public static final int pfhFieldIdFilter = 1;

	public static final int pfhHistCodeFilter = 2;
	private static final int pfhHistCodeSize = 10;

	public static final int pfhOldValueFilter = 3;
	private static final int pfhOldValueSize = 300;

	public static final int pfhNewValueFilter = 4;
	private static final int pfhNewValueSize = 300;

	public static final int pfhUserIdFilter = 5;
	private static final int pfhUserIdSize = 10;

	public static final int pfhTerminalIdFilter = 6;
	private static final int pfhTerminalIdSize = 10;

	public static final int pfhTimestampFilter = 7;

	public PfhPocSubHistDMO() {
	};

	public PfhPocSubHistDMO(final Integer pfhSubscriberId,
			final Integer pfhFieldId, final String pfhHistCode,
			final String pfhOldValue, final String pfhNewValue,
			final String pfhUserId, final String pfhTerminalId,
			final DateTime pfhTimestamp) {

		this.pfhSubscriberId = pfhSubscriberId;
		this.pfhFieldId = pfhFieldId;
		this.pfhHistCode = pfhHistCode;
		this.pfhOldValue = pfhOldValue;
		this.pfhNewValue = pfhNewValue;
		this.pfhUserId = pfhUserId;
		this.pfhTerminalId = pfhTerminalId;
		this.pfhTimestamp = pfhTimestamp;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, pfhHistCodeSize,
			pfhOldValueSize, pfhNewValueSize, pfhUserIdSize, pfhTerminalIdSize,
			0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pfhSubscriberId,
				this.pfhFieldId,
				((this.pfhHistCode == null) ? null
						: (this.pfhHistCode.length() <= pfhHistCodeSize) ? this.pfhHistCode
								: this.pfhHistCode.substring(0,
										this.pfhHistCodeSize)),
				((this.pfhOldValue == null) ? null
						: (this.pfhOldValue.length() <= pfhOldValueSize) ? this.pfhOldValue
								: this.pfhOldValue.substring(0,
										this.pfhOldValueSize)),
				((this.pfhNewValue == null) ? null
						: (this.pfhNewValue.length() <= pfhNewValueSize) ? this.pfhNewValue
								: this.pfhNewValue.substring(0,
										this.pfhNewValueSize)),
				((this.pfhUserId == null) ? null
						: (this.pfhUserId.length() <= pfhUserIdSize) ? this.pfhUserId
								: this.pfhUserId.substring(0,
										this.pfhUserIdSize)),
				((this.pfhTerminalId == null) ? null : (this.pfhTerminalId
						.length() <= pfhTerminalIdSize) ? this.pfhTerminalId
						: this.pfhTerminalId.substring(0,
								this.pfhTerminalIdSize)), this.pfhTimestamp };
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
		this.pfhSubscriberId = ((Integer) fields[0]);
		this.pfhFieldId = ((Integer) fields[1]);
		this.pfhHistCode = rtrim((String) fields[2]);
		this.pfhOldValue = rtrim((String) fields[3]);
		this.pfhNewValue = rtrim((String) fields[4]);
		this.pfhUserId = rtrim((String) fields[5]);
		this.pfhTerminalId = rtrim((String) fields[6]);
		this.pfhTimestamp = ((fields[7] == null) ? null : (DateTime)fields[7]);
	}

	public void set(final Integer pfhSubscriberId, final Integer pfhFieldId,
			final String pfhHistCode, final String pfhOldValue,
			final String pfhNewValue, final String pfhUserId,
			final String pfhTerminalId, final DateTime pfhTimestamp) {

		this.pfhSubscriberId = pfhSubscriberId;
		this.pfhFieldId = pfhFieldId;
		this.pfhHistCode = pfhHistCode;
		this.pfhOldValue = pfhOldValue;
		this.pfhNewValue = pfhNewValue;
		this.pfhUserId = pfhUserId;
		this.pfhTerminalId = pfhTerminalId;
		this.pfhTimestamp = pfhTimestamp;
	}

	public Integer getPfhSubscriberId() {
		return pfhSubscriberId;
	}

	public void setPfhSubscriberId(Integer pfhSubscriberId) {
		this.pfhSubscriberId = pfhSubscriberId;
	}

	public Integer getPfhFieldId() {
		return pfhFieldId;
	}

	public void setPfhFieldId(Integer pfhFieldId) {
		this.pfhFieldId = pfhFieldId;
	}

	public String getPfhHistCode() {
		return pfhHistCode;
	}

	public void setPfhHistCode(String pfhHistCode) {
		this.pfhHistCode = pfhHistCode;
	}

	public String getPfhOldValue() {
		return pfhOldValue;
	}

	public void setPfhOldValue(String pfhOldValue) {
		this.pfhOldValue = pfhOldValue;
	}

	public String getPfhNewValue() {
		return pfhNewValue;
	}

	public void setPfhNewValue(String pfhNewValue) {
		this.pfhNewValue = pfhNewValue;
	}

	public String getPfhUserId() {
		return pfhUserId;
	}

	public void setPfhUserId(String pfhUserId) {
		this.pfhUserId = pfhUserId;
	}

	public String getPfhTerminalId() {
		return pfhTerminalId;
	}

	public void setPfhTerminalId(String pfhTerminalId) {
		this.pfhTerminalId = pfhTerminalId;
	}

	public DateTime getPfhTimestamp() {
		return pfhTimestamp;
	}

	public void setPfhTimestamp(DateTime pfhTimestamp) {
		this.pfhTimestamp = pfhTimestamp;
	}
}