package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class DlhDealClaimHisDMO extends DBO implements Serializable {

	private Integer dlhClaimId;
	private String dlhDealerId;
	private Integer dlhFieldId;
	private String dlhHistCode;
	private String dlhOldValue;
	private String dlhNewValue;
	private String dlhUserId;
	private DateTime dlhTimestamp;

	public static final int dlhClaimIdFilter = 0;

	public static final int dlhDealerIdFilter = 1;
	private static final int dlhDealerIdSize = 8;

	public static final int dlhFieldIdFilter = 2;

	public static final int dlhHistCodeFilter = 3;
	private static final int dlhHistCodeSize = 10;

	public static final int dlhOldValueFilter = 4;
	private static final int dlhOldValueSize = 50;

	public static final int dlhNewValueFilter = 5;
	private static final int dlhNewValueSize = 50;

	public static final int dlhUserIdFilter = 6;
	private static final int dlhUserIdSize = 10;

	public static final int dlhTimestampFilter = 7;

	public DlhDealClaimHisDMO() {
	};

	public DlhDealClaimHisDMO(final Integer dlhClaimId, final String dlhDealerId, final Integer dlhFieldId,
			final String dlhHistCode, final String dlhOldValue, final String dlhNewValue, final String dlhUserId,
			final DateTime dlhTimestamp) {

		this.dlhClaimId = dlhClaimId;
		this.dlhDealerId = dlhDealerId;
		this.dlhFieldId = dlhFieldId;
		this.dlhHistCode = dlhHistCode;
		this.dlhOldValue = dlhOldValue;
		this.dlhNewValue = dlhNewValue;
		this.dlhUserId = dlhUserId;
		this.dlhTimestamp = dlhTimestamp;
	};

	private static final int[] fieldSizes = new int[] { 0, dlhDealerIdSize, 0, dlhHistCodeSize, dlhOldValueSize,
			dlhNewValueSize, dlhUserIdSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.dlhClaimId,
				((this.dlhDealerId == null) ? null
						: (this.dlhDealerId.length() <= dlhDealerIdSize) ? this.dlhDealerId
								: this.dlhDealerId.substring(0, this.dlhDealerIdSize)),
				this.dlhFieldId,
				((this.dlhHistCode == null) ? null
						: (this.dlhHistCode.length() <= dlhHistCodeSize) ? this.dlhHistCode
								: this.dlhHistCode.substring(0, this.dlhHistCodeSize)),
				((this.dlhOldValue == null) ? null
						: (this.dlhOldValue.length() <= dlhOldValueSize) ? this.dlhOldValue
								: this.dlhOldValue.substring(0, this.dlhOldValueSize)),
				((this.dlhNewValue == null) ? null
						: (this.dlhNewValue.length() <= dlhNewValueSize) ? this.dlhNewValue
								: this.dlhNewValue.substring(0, this.dlhNewValueSize)),
				((this.dlhUserId == null) ? null
						: (this.dlhUserId.length() <= dlhUserIdSize) ? this.dlhUserId
								: this.dlhUserId.substring(0, this.dlhUserIdSize)),
				this.dlhTimestamp };
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
		this.dlhClaimId = ((Integer) fields[0]);
		this.dlhDealerId = rtrim((String) fields[1]);
		this.dlhFieldId = ((Integer) fields[2]);
		this.dlhHistCode = rtrim((String) fields[3]);
		this.dlhOldValue = rtrim((String) fields[4]);
		this.dlhNewValue = rtrim((String) fields[5]);
		this.dlhUserId = rtrim((String) fields[6]);
		this.dlhTimestamp = ((fields[7] == null) ? null : (DateTime) fields[7]);
	}

	public void set(final Integer dlhClaimId, final String dlhDealerId, final Integer dlhFieldId,
			final String dlhHistCode, final String dlhOldValue, final String dlhNewValue, final String dlhUserId,
			final DateTime dlhTimestamp) {

		this.dlhClaimId = dlhClaimId;
		this.dlhDealerId = dlhDealerId;
		this.dlhFieldId = dlhFieldId;
		this.dlhHistCode = dlhHistCode;
		this.dlhOldValue = dlhOldValue;
		this.dlhNewValue = dlhNewValue;
		this.dlhUserId = dlhUserId;
		this.dlhTimestamp = dlhTimestamp;
	}

	public Integer getDlhClaimId() {
		return dlhClaimId;
	}

	public void setDlhClaimId(Integer dlhClaimId) {
		this.dlhClaimId = dlhClaimId;
	}

	public String getDlhDealerId() {
		return dlhDealerId;
	}

	public void setDlhDealerId(String dlhDealerId) {
		this.dlhDealerId = dlhDealerId;
	}

	public Integer getDlhFieldId() {
		return dlhFieldId;
	}

	public void setDlhFieldId(Integer dlhFieldId) {
		this.dlhFieldId = dlhFieldId;
	}

	public String getDlhHistCode() {
		return dlhHistCode;
	}

	public void setDlhHistCode(String dlhHistCode) {
		this.dlhHistCode = dlhHistCode;
	}

	public String getDlhOldValue() {
		return dlhOldValue;
	}

	public void setDlhOldValue(String dlhOldValue) {
		this.dlhOldValue = dlhOldValue;
	}

	public String getDlhNewValue() {
		return dlhNewValue;
	}

	public void setDlhNewValue(String dlhNewValue) {
		this.dlhNewValue = dlhNewValue;
	}

	public String getDlhUserId() {
		return dlhUserId;
	}

	public void setDlhUserId(String dlhUserId) {
		this.dlhUserId = dlhUserId;
	}

	public DateTime getDlhTimestamp() {
		return dlhTimestamp;
	}

	public void setDlhTimestamp(DateTime dlhTimestamp) {
		this.dlhTimestamp = dlhTimestamp;
	}

	@Override
	public String toString() {
		return "\nDlhDealClaimHisDMO [\ndlhClaimId=" + dlhClaimId + "\ndlhDealerId=" + dlhDealerId + "\ndlhFieldId="
				+ dlhFieldId + "\ndlhHistCode=" + dlhHistCode + "\ndlhOldValue=" + dlhOldValue + "\ndlhNewValue="
				+ dlhNewValue + "\ndlhUserId=" + dlhUserId + "\ndlhTimestamp=" + dlhTimestamp + "]";
	}

}
