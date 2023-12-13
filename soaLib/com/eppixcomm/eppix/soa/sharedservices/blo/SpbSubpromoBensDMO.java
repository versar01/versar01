package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SpbSubpromoBensDMO extends DBO implements Serializable {

	private Integer spbSerialId;
	private Integer spbBillId;
	private Integer spbSpqSerialId;
	private String spbDeviceType;
	private String spbBenType;
	private String spbBenValue;
	private Integer spbParamId;
	private String spbParamValue;
	private Integer spbSubparamId;
	private String spbAmount;
	private Integer spbPeriod;
	private String spbBenefitStatus;
	private String spbErrorMess;
	private DateTime spbStatusDate;
	private String spbUserId;

	public static final int spbSerialIdFilter = 0;

	public static final int spbBillIdFilter = 1;

	public static final int spbSpqSerialIdFilter = 2;

	public static final int spbDeviceTypeFilter = 3;
	private static final int spbDeviceTypeSize = 20;

	public static final int spbBenTypeFilter = 4;
	private static final int spbBenTypeSize = 20;

	public static final int spbBenValueFilter = 5;
	private static final int spbBenValueSize = 100;

	public static final int spbParamIdFilter = 6;

	public static final int spbParamValueFilter = 7;
	private static final int spbParamValueSize = 100;

	public static final int spbSubparamIdFilter = 8;

	public static final int spbAmountFilter = 9;
	private static final int spbAmountSize = 100;

	public static final int spbPeriodFilter = 10;

	public static final int spbBenefitStatusFilter = 11;
	private static final int spbBenefitStatusSize = 1;

	public static final int spbErrorMessFilter = 12;
	private static final int spbErrorMessSize = 512;

	public static final int spbStatusDateFilter = 13;

	public static final int spbUserIdFilter = 14;
	private static final int spbUserIdSize = 20;

	public SpbSubpromoBensDMO() {
	};

	public SpbSubpromoBensDMO(final Integer spbSerialId,
			final Integer spbBillId, final Integer spbSpqSerialId,
			final String spbDeviceType, final String spbBenType,
			final String spbBenValue, final Integer spbParamId,
			final String spbParamValue, final Integer spbSubparamId,
			final String spbAmount, final Integer spbPeriod,
			final String spbBenefitStatus, final String spbErrorMess,
			final DateTime spbStatusDate, final String spbUserId) {

		this.spbSerialId = spbSerialId;
		this.spbBillId = spbBillId;
		this.spbSpqSerialId = spbSpqSerialId;
		this.spbDeviceType = spbDeviceType;
		this.spbBenType = spbBenType;
		this.spbBenValue = spbBenValue;
		this.spbParamId = spbParamId;
		this.spbParamValue = spbParamValue;
		this.spbSubparamId = spbSubparamId;
		this.spbAmount = spbAmount;
		this.spbPeriod = spbPeriod;
		this.spbBenefitStatus = spbBenefitStatus;
		this.spbErrorMess = spbErrorMess;
		this.spbStatusDate = spbStatusDate;
		this.spbUserId = spbUserId;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0,
			spbDeviceTypeSize, spbBenTypeSize, spbBenValueSize, 0,
			spbParamValueSize, 0, spbAmountSize, 0, spbBenefitStatusSize,
			spbErrorMessSize, 0, spbUserIdSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.spbSerialId,
				this.spbBillId,
				this.spbSpqSerialId,
				((this.spbDeviceType == null) ? null : (this.spbDeviceType
						.length() <= spbDeviceTypeSize) ? this.spbDeviceType
						: this.spbDeviceType.substring(0,
								this.spbDeviceTypeSize)),
				((this.spbBenType == null) ? null
						: (this.spbBenType.length() <= spbBenTypeSize) ? this.spbBenType
								: this.spbBenType.substring(0,
										this.spbBenTypeSize)),
				((this.spbBenValue == null) ? null
						: (this.spbBenValue.length() <= spbBenValueSize) ? this.spbBenValue
								: this.spbBenValue.substring(0,
										this.spbBenValueSize)),
				this.spbParamId,
				((this.spbParamValue == null) ? null : (this.spbParamValue
						.length() <= spbParamValueSize) ? this.spbParamValue
						: this.spbParamValue.substring(0,
								this.spbParamValueSize)),
				this.spbSubparamId,
				((this.spbAmount == null) ? null
						: (this.spbAmount.length() <= spbAmountSize) ? this.spbAmount
								: this.spbAmount.substring(0,
										this.spbAmountSize)),
				this.spbPeriod,
				((this.spbBenefitStatus == null) ? null
						: (this.spbBenefitStatus.length() <= spbBenefitStatusSize) ? this.spbBenefitStatus
								: this.spbBenefitStatus.substring(0,
										this.spbBenefitStatusSize)),
				((this.spbErrorMess == null) ? null : (this.spbErrorMess
						.length() <= spbErrorMessSize) ? this.spbErrorMess
						: this.spbErrorMess.substring(0, this.spbErrorMessSize)),
				this.spbStatusDate,
				((this.spbUserId == null) ? null
						: (this.spbUserId.length() <= spbUserIdSize) ? this.spbUserId
								: this.spbUserId.substring(0,
										this.spbUserIdSize)) };
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
		return new DAOArgs(1).arg(this.spbSerialId);
	}

	protected void set(Object[] fields) {
		this.spbSerialId = ((Integer) fields[0]);
		this.spbBillId = ((Integer) fields[1]);
		this.spbSpqSerialId = ((Integer) fields[2]);
		this.spbDeviceType = rtrim((String) fields[3]);
		this.spbBenType = rtrim((String) fields[4]);
		this.spbBenValue = rtrim((String) fields[5]);
		this.spbParamId = ((Integer) fields[6]);
		this.spbParamValue = rtrim((String) fields[7]);
		this.spbSubparamId = ((Integer) fields[8]);
		this.spbAmount = rtrim((String) fields[9]);
		this.spbPeriod = ((Integer) fields[10]);
		this.spbBenefitStatus = rtrim((String) fields[11]);
		this.spbErrorMess = rtrim((String) fields[12]);
		this.spbStatusDate = ((DateTime) fields[13]);
		this.spbUserId = rtrim((String) fields[14]);
	}

	public void set(final Integer spbSerialId, final Integer spbBillId,
			final Integer spbSpqSerialId, final String spbDeviceType,
			final String spbBenType, final String spbBenValue,
			final Integer spbParamId, final String spbParamValue,
			final Integer spbSubparamId, final String spbAmount,
			final Integer spbPeriod, final String spbBenefitStatus,
			final String spbErrorMess, final DateTime spbStatusDate,
			final String spbUserId) {

		this.spbSerialId = spbSerialId;
		this.spbBillId = spbBillId;
		this.spbSpqSerialId = spbSpqSerialId;
		this.spbDeviceType = spbDeviceType;
		this.spbBenType = spbBenType;
		this.spbBenValue = spbBenValue;
		this.spbParamId = spbParamId;
		this.spbParamValue = spbParamValue;
		this.spbSubparamId = spbSubparamId;
		this.spbAmount = spbAmount;
		this.spbPeriod = spbPeriod;
		this.spbBenefitStatus = spbBenefitStatus;
		this.spbErrorMess = spbErrorMess;
		this.spbStatusDate = spbStatusDate;
		this.spbUserId = spbUserId;
	}

	public Integer getSpbSerialId() {
		return spbSerialId;
	}

	public void setSpbSerialId(Integer spbSerialId) {
		this.spbSerialId = spbSerialId;
	}

	public Integer getSpbBillId() {
		return spbBillId;
	}

	public void setSpbBillId(Integer spbBillId) {
		this.spbBillId = spbBillId;
	}

	public Integer getSpbSpqSerialId() {
		return spbSpqSerialId;
	}

	public void setSpbSpqSerialId(Integer spbSpqSerialId) {
		this.spbSpqSerialId = spbSpqSerialId;
	}

	public String getSpbDeviceType() {
		return spbDeviceType;
	}

	public void setSpbDeviceType(String spbDeviceType) {
		this.spbDeviceType = spbDeviceType;
	}

	public String getSpbBenType() {
		return spbBenType;
	}

	public void setSpbBenType(String spbBenType) {
		this.spbBenType = spbBenType;
	}

	public String getSpbBenValue() {
		return spbBenValue;
	}

	public void setSpbBenValue(String spbBenValue) {
		this.spbBenValue = spbBenValue;
	}

	public Integer getSpbParamId() {
		return spbParamId;
	}

	public void setSpbParamId(Integer spbParamId) {
		this.spbParamId = spbParamId;
	}

	public String getSpbParamValue() {
		return spbParamValue;
	}

	public void setSpbParamValue(String spbParamValue) {
		this.spbParamValue = spbParamValue;
	}

	public Integer getSpbSubparamId() {
		return spbSubparamId;
	}

	public void setSpbSubparamId(Integer spbSubparamId) {
		this.spbSubparamId = spbSubparamId;
	}

	public String getSpbAmount() {
		return spbAmount;
	}

	public void setSpbAmount(String spbAmount) {
		this.spbAmount = spbAmount;
	}

	public Integer getSpbPeriod() {
		return spbPeriod;
	}

	public void setSpbPeriod(Integer spbPeriod) {
		this.spbPeriod = spbPeriod;
	}

	public String getSpbBenefitStatus() {
		return spbBenefitStatus;
	}

	public void setSpbBenefitStatus(String spbBenefitStatus) {
		this.spbBenefitStatus = spbBenefitStatus;
	}

	public String getSpbErrorMess() {
		return spbErrorMess;
	}

	public void setSpbErrorMess(String spbErrorMess) {
		this.spbErrorMess = spbErrorMess;
	}

	public DateTime getSpbStatusDate() {
		return spbStatusDate;
	}

	public void setSpbStatusDate(DateTime spbStatusDate) {
		this.spbStatusDate = spbStatusDate;
	}

	public String getSpbUserId() {
		return spbUserId;
	}

	public void setSpbUserId(String spbUserId) {
		this.spbUserId = spbUserId;
	}

}
