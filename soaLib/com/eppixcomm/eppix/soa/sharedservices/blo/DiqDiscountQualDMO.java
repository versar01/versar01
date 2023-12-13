package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class DiqDiscountQualDMO extends DBO implements Serializable {

	private Integer diqQualId;
	private String diqQualDesc;
	private String diqQualType;
	private Date diqStartDate;
	private Date diqEndDate;
	private String diqPackageCode;
	private Short diqPackAffect;
	private String diqTariffPlan;
	private Short diqTarAffect;
	private String diqServiceCode;
	private Short diqServAffect;
	private String diqPaymentType;
	private Short diqPayAffect;
	private String diqAccountType;
	private Short diqAccAffect;
	private Integer diqDiscountId;
	private Integer diqUsed;

	public static final int diqQualIdFilter = 0;

	public static final int diqQualDescFilter = 1;
	private static final int diqQualDescSize = 50;

	public static final int diqQualTypeFilter = 2;
	private static final int diqQualTypeSize = 1;

	public static final int diqStartDateFilter = 3;

	public static final int diqEndDateFilter = 4;

	public static final int diqPackageCodeFilter = 5;
	private static final int diqPackageCodeSize = 5;

	public static final int diqPackAffectFilter = 6;

	public static final int diqTariffPlanFilter = 7;
	private static final int diqTariffPlanSize = 20;

	public static final int diqTarAffectFilter = 8;

	public static final int diqServiceCodeFilter = 9;
	private static final int diqServiceCodeSize = 4;

	public static final int diqServAffectFilter = 10;

	public static final int diqPaymentTypeFilter = 11;
	private static final int diqPaymentTypeSize = 5;

	public static final int diqPayAffectFilter = 12;

	public static final int diqAccountTypeFilter = 13;
	private static final int diqAccountTypeSize = 5;

	public static final int diqAccAffectFilter = 14;

	public static final int diqDiscountIdFilter = 15;

	public static final int diqUsedFilter = 16;

	public DiqDiscountQualDMO() {
	};

	public DiqDiscountQualDMO(final Integer diqQualId,
			final String diqQualDesc, final String diqQualType,
			final Date diqStartDate, final Date diqEndDate,
			final String diqPackageCode, final Short diqPackAffect,
			final String diqTariffPlan, final Short diqTarAffect,
			final String diqServiceCode, final Short diqServAffect,
			final String diqPaymentType, final Short diqPayAffect,
			final String diqAccountType, final Short diqAccAffect,
			final Integer diqDiscountId, final Integer diqUsed) {

		this.diqQualId = diqQualId;
		this.diqQualDesc = diqQualDesc;
		this.diqQualType = diqQualType;
		this.diqStartDate = diqStartDate;
		this.diqEndDate = diqEndDate;
		this.diqPackageCode = diqPackageCode;
		this.diqPackAffect = diqPackAffect;
		this.diqTariffPlan = diqTariffPlan;
		this.diqTarAffect = diqTarAffect;
		this.diqServiceCode = diqServiceCode;
		this.diqServAffect = diqServAffect;
		this.diqPaymentType = diqPaymentType;
		this.diqPayAffect = diqPayAffect;
		this.diqAccountType = diqAccountType;
		this.diqAccAffect = diqAccAffect;
		this.diqDiscountId = diqDiscountId;
		this.diqUsed = diqUsed;
	};

	private static final int[] fieldSizes = new int[] { 0, diqQualDescSize,
			diqQualTypeSize, 0, 0, diqPackageCodeSize, 0, diqTariffPlanSize, 0,
			diqServiceCodeSize, 0, diqPaymentTypeSize, 0, diqAccountTypeSize,
			0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.diqQualId,
				((this.diqQualDesc == null) ? null
						: (this.diqQualDesc.length() <= diqQualDescSize) ? this.diqQualDesc
								: this.diqQualDesc.substring(0,
										this.diqQualDescSize)),
				((this.diqQualType == null) ? null
						: (this.diqQualType.length() <= diqQualTypeSize) ? this.diqQualType
								: this.diqQualType.substring(0,
										this.diqQualTypeSize)),
				this.diqStartDate,
				this.diqEndDate,
				((this.diqPackageCode == null) ? null : (this.diqPackageCode
						.length() <= diqPackageCodeSize) ? this.diqPackageCode
						: this.diqPackageCode.substring(0,
								this.diqPackageCodeSize)),
				this.diqPackAffect,
				((this.diqTariffPlan == null) ? null : (this.diqTariffPlan
						.length() <= diqTariffPlanSize) ? this.diqTariffPlan
						: this.diqTariffPlan.substring(0,
								this.diqTariffPlanSize)),
				this.diqTarAffect,
				((this.diqServiceCode == null) ? null : (this.diqServiceCode
						.length() <= diqServiceCodeSize) ? this.diqServiceCode
						: this.diqServiceCode.substring(0,
								this.diqServiceCodeSize)),
				this.diqServAffect,
				((this.diqPaymentType == null) ? null : (this.diqPaymentType
						.length() <= diqPaymentTypeSize) ? this.diqPaymentType
						: this.diqPaymentType.substring(0,
								this.diqPaymentTypeSize)),
				this.diqPayAffect,
				((this.diqAccountType == null) ? null : (this.diqAccountType
						.length() <= diqAccountTypeSize) ? this.diqAccountType
						: this.diqAccountType.substring(0,
								this.diqAccountTypeSize)), this.diqAccAffect,
				this.diqDiscountId, this.diqUsed };
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
		this.diqQualId = ((Integer) fields[0]);
		this.diqQualDesc = rtrim((String) fields[1]);
		this.diqQualType = rtrim((String) fields[2]);
		this.diqStartDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.diqEndDate = ((fields[4] == null) ? null : new Date(
				 fields[4]));
		this.diqPackageCode = rtrim((String) fields[5]);
		this.diqPackAffect = ((Short) fields[6]);
		this.diqTariffPlan = rtrim((String) fields[7]);
		this.diqTarAffect = ((Short) fields[8]);
		this.diqServiceCode = rtrim((String) fields[9]);
		this.diqServAffect = ((Short) fields[10]);
		this.diqPaymentType = rtrim((String) fields[11]);
		this.diqPayAffect = ((Short) fields[12]);
		this.diqAccountType = rtrim((String) fields[13]);
		this.diqAccAffect = ((Short) fields[14]);
		this.diqDiscountId = ((Integer) fields[15]);
		this.diqUsed = ((Integer) fields[16]);
	}

	public void set(final Integer diqQualId, final String diqQualDesc,
			final String diqQualType, final Date diqStartDate,
			final Date diqEndDate, final String diqPackageCode,
			final Short diqPackAffect, final String diqTariffPlan,
			final Short diqTarAffect, final String diqServiceCode,
			final Short diqServAffect, final String diqPaymentType,
			final Short diqPayAffect, final String diqAccountType,
			final Short diqAccAffect, final Integer diqDiscountId,
			final Integer diqUsed) {

		this.diqQualId = diqQualId;
		this.diqQualDesc = diqQualDesc;
		this.diqQualType = diqQualType;
		this.diqStartDate = diqStartDate;
		this.diqEndDate = diqEndDate;
		this.diqPackageCode = diqPackageCode;
		this.diqPackAffect = diqPackAffect;
		this.diqTariffPlan = diqTariffPlan;
		this.diqTarAffect = diqTarAffect;
		this.diqServiceCode = diqServiceCode;
		this.diqServAffect = diqServAffect;
		this.diqPaymentType = diqPaymentType;
		this.diqPayAffect = diqPayAffect;
		this.diqAccountType = diqAccountType;
		this.diqAccAffect = diqAccAffect;
		this.diqDiscountId = diqDiscountId;
		this.diqUsed = diqUsed;
	}

	public Integer getDiqQualId() {
		return diqQualId;
	}

	public void setDiqQualId(Integer diqQualId) {
		this.diqQualId = diqQualId;
	}

	public String getDiqQualDesc() {
		return diqQualDesc;
	}

	public void setDiqQualDesc(String diqQualDesc) {
		this.diqQualDesc = diqQualDesc;
	}

	public String getDiqQualType() {
		return diqQualType;
	}

	public void setDiqQualType(String diqQualType) {
		this.diqQualType = diqQualType;
	}

	public Date getDiqStartDate() {
		return diqStartDate;
	}

	public void setDiqStartDate(Date diqStartDate) {
		this.diqStartDate = diqStartDate;
	}

	public Date getDiqEndDate() {
		return diqEndDate;
	}

	public void setDiqEndDate(Date diqEndDate) {
		this.diqEndDate = diqEndDate;
	}

	public String getDiqPackageCode() {
		return diqPackageCode;
	}

	public void setDiqPackageCode(String diqPackageCode) {
		this.diqPackageCode = diqPackageCode;
	}

	public Short getDiqPackAffect() {
		return diqPackAffect;
	}

	public void setDiqPackAffect(Short diqPackAffect) {
		this.diqPackAffect = diqPackAffect;
	}

	public String getDiqTariffPlan() {
		return diqTariffPlan;
	}

	public void setDiqTariffPlan(String diqTariffPlan) {
		this.diqTariffPlan = diqTariffPlan;
	}

	public Short getDiqTarAffect() {
		return diqTarAffect;
	}

	public void setDiqTarAffect(Short diqTarAffect) {
		this.diqTarAffect = diqTarAffect;
	}

	public String getDiqServiceCode() {
		return diqServiceCode;
	}

	public void setDiqServiceCode(String diqServiceCode) {
		this.diqServiceCode = diqServiceCode;
	}

	public Short getDiqServAffect() {
		return diqServAffect;
	}

	public void setDiqServAffect(Short diqServAffect) {
		this.diqServAffect = diqServAffect;
	}

	public String getDiqPaymentType() {
		return diqPaymentType;
	}

	public void setDiqPaymentType(String diqPaymentType) {
		this.diqPaymentType = diqPaymentType;
	}

	public Short getDiqPayAffect() {
		return diqPayAffect;
	}

	public void setDiqPayAffect(Short diqPayAffect) {
		this.diqPayAffect = diqPayAffect;
	}

	public String getDiqAccountType() {
		return diqAccountType;
	}

	public void setDiqAccountType(String diqAccountType) {
		this.diqAccountType = diqAccountType;
	}

	public Short getDiqAccAffect() {
		return diqAccAffect;
	}

	public void setDiqAccAffect(Short diqAccAffect) {
		this.diqAccAffect = diqAccAffect;
	}

	public Integer getDiqDiscountId() {
		return diqDiscountId;
	}

	public void setDiqDiscountId(Integer diqDiscountId) {
		this.diqDiscountId = diqDiscountId;
	}

	public Integer getDiqUsed() {
		return diqUsed;
	}

	public void setDiqUsed(Integer diqUsed) {
		this.diqUsed = diqUsed;
	}

}
