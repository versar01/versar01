package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbtSplitBillDetDMO extends DBO implements Serializable {

	private Integer sbtSbId;
	private Integer sbtDirRuleId;
	private String sbtDiscType;
	private Double sbtDiscFixed;
	private Double sbtDiscPerc;
	private String sbtServiceCode;
	private String sbtServiceType;
	private Date sbtStartDate;
	private Date sbtEndDate;
	private Integer sbtIndicator;

	public static final int sbtSbIdFilter = 0;

	public static final int sbtDirRuleIdFilter = 1;

	public static final int sbtDiscTypeFilter = 2;
	private static final int sbtDiscTypeSize = 1;

	public static final int sbtDiscFixedFilter = 3;

	public static final int sbtDiscPercFilter = 4;

	public static final int sbtServiceCodeFilter = 5;
	private static final int sbtServiceCodeSize = 4;

	public static final int sbtServiceTypeFilter = 6;
	private static final int sbtServiceTypeSize = 5;

	public static final int sbtStartDateFilter = 7;

	public static final int sbtEndDateFilter = 8;

	public static final int sbtIndicatorFilter = 9;

	public SbtSplitBillDetDMO() {
	};

	public SbtSplitBillDetDMO(final Integer sbtSbId,
			final Integer sbtDirRuleId, final String sbtDiscType,
			final Double sbtDiscFixed, final Double sbtDiscPerc,
			final String sbtServiceCode, final String sbtServiceType,
			final Date sbtStartDate, final Date sbtEndDate,
			final Integer sbtIndicator) {

		this.sbtSbId = sbtSbId;
		this.sbtDirRuleId = sbtDirRuleId;
		this.sbtDiscType = sbtDiscType;
		this.sbtDiscFixed = sbtDiscFixed;
		this.sbtDiscPerc = sbtDiscPerc;
		this.sbtServiceCode = sbtServiceCode;
		this.sbtServiceType = sbtServiceType;
		this.sbtStartDate = sbtStartDate;
		this.sbtEndDate = sbtEndDate;
		this.sbtIndicator = sbtIndicator;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, sbtDiscTypeSize,
			0, 0, sbtServiceCodeSize, sbtServiceTypeSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbtSbId,
				this.sbtDirRuleId,
				((this.sbtDiscType == null) ? null
						: (this.sbtDiscType.length() <= sbtDiscTypeSize) ? this.sbtDiscType
								: this.sbtDiscType.substring(0,
										this.sbtDiscTypeSize)),
				this.sbtDiscFixed,
				this.sbtDiscPerc,
				((this.sbtServiceCode == null) ? null : (this.sbtServiceCode
						.length() <= sbtServiceCodeSize) ? this.sbtServiceCode
						: this.sbtServiceCode.substring(0,
								this.sbtServiceCodeSize)),
				((this.sbtServiceType == null) ? null : (this.sbtServiceType
						.length() <= sbtServiceTypeSize) ? this.sbtServiceType
						: this.sbtServiceType.substring(0,
								this.sbtServiceTypeSize)), this.sbtStartDate,
				this.sbtEndDate, this.sbtIndicator };
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
		return new DAOArgs(3).arg(this.sbtSbId).arg(this.sbtServiceCode)
				.arg(this.sbtServiceType);
	}

	protected void set(Object[] fields) {
		this.sbtSbId = ((Integer) fields[0]);
		this.sbtDirRuleId = ((Integer) fields[1]);
		this.sbtDiscType = rtrim((String) fields[2]);
		this.sbtDiscFixed = ((Double) fields[3]);
		this.sbtDiscPerc = ((Double) fields[4]);
		this.sbtServiceCode = rtrim((String) fields[5]);
		this.sbtServiceType = rtrim((String) fields[6]);
		this.sbtStartDate = ((fields[7] == null) ? null : new Date(
				(Date) fields[7]));
		this.sbtEndDate = ((fields[8] == null) ? null : new Date(
				(Date) fields[8]));
		this.sbtIndicator = ((Integer) fields[9]);
	}

	public void set(final Integer sbtSbId, final Integer sbtDirRuleId,
			final String sbtDiscType, final Double sbtDiscFixed,
			final Double sbtDiscPerc, final String sbtServiceCode,
			final String sbtServiceType, final Date sbtStartDate,
			final Date sbtEndDate, final Integer sbtIndicator) {

		this.sbtSbId = sbtSbId;
		this.sbtDirRuleId = sbtDirRuleId;
		this.sbtDiscType = sbtDiscType;
		this.sbtDiscFixed = sbtDiscFixed;
		this.sbtDiscPerc = sbtDiscPerc;
		this.sbtServiceCode = sbtServiceCode;
		this.sbtServiceType = sbtServiceType;
		this.sbtStartDate = sbtStartDate;
		this.sbtEndDate = sbtEndDate;
		this.sbtIndicator = sbtIndicator;
	}

	public Integer getSbtSbId() {
		return sbtSbId;
	}

	public void setSbtSbId(Integer sbtSbId) {
		this.sbtSbId = sbtSbId;
	}

	public Integer getSbtDirRuleId() {
		return sbtDirRuleId;
	}

	public void setSbtDirRuleId(Integer sbtDirRuleId) {
		this.sbtDirRuleId = sbtDirRuleId;
	}

	public String getSbtDiscType() {
		return sbtDiscType;
	}

	public void setSbtDiscType(String sbtDiscType) {
		this.sbtDiscType = sbtDiscType;
	}

	public Double getSbtDiscFixed() {
		return sbtDiscFixed;
	}

	public void setSbtDiscFixed(Double sbtDiscFixed) {
		this.sbtDiscFixed = sbtDiscFixed;
	}

	public Double getSbtDiscPerc() {
		return sbtDiscPerc;
	}

	public void setSbtDiscPerc(Double sbtDiscPerc) {
		this.sbtDiscPerc = sbtDiscPerc;
	}

	public String getSbtServiceCode() {
		return sbtServiceCode;
	}

	public void setSbtServiceCode(String sbtServiceCode) {
		this.sbtServiceCode = sbtServiceCode;
	}

	public String getSbtServiceType() {
		return sbtServiceType;
	}

	public void setSbtServiceType(String sbtServiceType) {
		this.sbtServiceType = sbtServiceType;
	}

	public Date getSbtStartDate() {
		return sbtStartDate;
	}

	public void setSbtStartDate(Date sbtStartDate) {
		this.sbtStartDate = sbtStartDate;
	}

	public Date getSbtEndDate() {
		return sbtEndDate;
	}

	public void setSbtEndDate(Date sbtEndDate) {
		this.sbtEndDate = sbtEndDate;
	}

	public Integer getSbtIndicator() {
		return sbtIndicator;
	}

	public void setSbtIndicator(Integer sbtIndicator) {
		this.sbtIndicator = sbtIndicator;
	}

}
