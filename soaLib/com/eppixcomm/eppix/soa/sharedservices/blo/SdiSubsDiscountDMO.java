package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SdiSubsDiscountDMO extends DBO implements Serializable {

	private Integer sdiSubDiscId;
	private Integer sdiSubscriberId;
	private Integer sdiDiscountId;
	private Date sdiStartDate;
	private Date sdiEndDate;
	private Date sdiSuspendDate;
	private Integer sdiQualId;
	private String sdiQualType;
	private String sdiPackageCode;
	private String sdiTariffPlan;
	private String sdiServiceCode;
	private String sdiPaymentType;
	private String sdiAccountType;
	private Date sdiDiscountUpto;

	public static final int sdiSubDiscIdFilter = 0;

	public static final int sdiSubscriberIdFilter = 1;

	public static final int sdiDiscountIdFilter = 2;

	public static final int sdiStartDateFilter = 3;

	public static final int sdiEndDateFilter = 4;

	public static final int sdiSuspendDateFilter = 5;

	public static final int sdiQualIdFilter = 6;

	public static final int sdiQualTypeFilter = 7;
	private static final int sdiQualTypeSize = 1;

	public static final int sdiPackageCodeFilter = 8;
	private static final int sdiPackageCodeSize = 5;

	public static final int sdiTariffPlanFilter = 9;
	private static final int sdiTariffPlanSize = 20;

	public static final int sdiServiceCodeFilter = 10;
	private static final int sdiServiceCodeSize = 4;

	public static final int sdiPaymentTypeFilter = 11;
	private static final int sdiPaymentTypeSize = 5;

	public static final int sdiAccountTypeFilter = 12;
	private static final int sdiAccountTypeSize = 5;

	public static final int sdiDiscountUptoFilter = 13;

	public SdiSubsDiscountDMO() {
	};

	public SdiSubsDiscountDMO(final Integer sdiSubDiscId,
			final Integer sdiSubscriberId, final Integer sdiDiscountId,
			final Date sdiStartDate, final Date sdiEndDate,
			final Date sdiSuspendDate, final Integer sdiQualId,
			final String sdiQualType, final String sdiPackageCode,
			final String sdiTariffPlan, final String sdiServiceCode,
			final String sdiPaymentType, final String sdiAccountType,
			final Date sdiDiscountUpto) {

		this.sdiSubDiscId = sdiSubDiscId;
		this.sdiSubscriberId = sdiSubscriberId;
		this.sdiDiscountId = sdiDiscountId;
		this.sdiStartDate = sdiStartDate;
		this.sdiEndDate = sdiEndDate;
		this.sdiSuspendDate = sdiSuspendDate;
		this.sdiQualId = sdiQualId;
		this.sdiQualType = sdiQualType;
		this.sdiPackageCode = sdiPackageCode;
		this.sdiTariffPlan = sdiTariffPlan;
		this.sdiServiceCode = sdiServiceCode;
		this.sdiPaymentType = sdiPaymentType;
		this.sdiAccountType = sdiAccountType;
		this.sdiDiscountUpto = sdiDiscountUpto;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0, 0, 0, 0, 0,
			sdiQualTypeSize, sdiPackageCodeSize, sdiTariffPlanSize,
			sdiServiceCodeSize, sdiPaymentTypeSize, sdiAccountTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sdiSubDiscId,
				this.sdiSubscriberId,
				this.sdiDiscountId,
				this.sdiStartDate,
				this.sdiEndDate,
				this.sdiSuspendDate,
				this.sdiQualId,
				((this.sdiQualType == null) ? null
						: (this.sdiQualType.length() <= sdiQualTypeSize) ? this.sdiQualType
								: this.sdiQualType.substring(0,
										this.sdiQualTypeSize)),
				((this.sdiPackageCode == null) ? null : (this.sdiPackageCode
						.length() <= sdiPackageCodeSize) ? this.sdiPackageCode
						: this.sdiPackageCode.substring(0,
								this.sdiPackageCodeSize)),
				((this.sdiTariffPlan == null) ? null : (this.sdiTariffPlan
						.length() <= sdiTariffPlanSize) ? this.sdiTariffPlan
						: this.sdiTariffPlan.substring(0,
								this.sdiTariffPlanSize)),
				((this.sdiServiceCode == null) ? null : (this.sdiServiceCode
						.length() <= sdiServiceCodeSize) ? this.sdiServiceCode
						: this.sdiServiceCode.substring(0,
								this.sdiServiceCodeSize)),
				((this.sdiPaymentType == null) ? null : (this.sdiPaymentType
						.length() <= sdiPaymentTypeSize) ? this.sdiPaymentType
						: this.sdiPaymentType.substring(0,
								this.sdiPaymentTypeSize)),
				((this.sdiAccountType == null) ? null : (this.sdiAccountType
						.length() <= sdiAccountTypeSize) ? this.sdiAccountType
						: this.sdiAccountType.substring(0,
								this.sdiAccountTypeSize)), this.sdiDiscountUpto };
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
		return new DAOArgs(1).arg(this.sdiSubDiscId);
	}

	protected void set(Object[] fields) {
		this.sdiSubDiscId = ((Integer) fields[0]);
		this.sdiSubscriberId = ((Integer) fields[1]);
		this.sdiDiscountId = ((Integer) fields[2]);
		this.sdiStartDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.sdiEndDate = ((fields[4] == null) ? null : new Date(
				 fields[4]));
		this.sdiSuspendDate = ((fields[5] == null) ? null : new Date(
				 fields[5]));
		this.sdiQualId = ((Integer) fields[6]);
		this.sdiQualType = rtrim((String) fields[7]);
		this.sdiPackageCode = rtrim((String) fields[8]);
		this.sdiTariffPlan = rtrim((String) fields[9]);
		this.sdiServiceCode = rtrim((String) fields[10]);
		this.sdiPaymentType = rtrim((String) fields[11]);
		this.sdiAccountType = rtrim((String) fields[12]);
		this.sdiDiscountUpto = ((fields[13] == null) ? null : new Date(
				fields[13]));
	}

	public void set(final Integer sdiSubDiscId, final Integer sdiSubscriberId,
			final Integer sdiDiscountId, final Date sdiStartDate,
			final Date sdiEndDate, final Date sdiSuspendDate,
			final Integer sdiQualId, final String sdiQualType,
			final String sdiPackageCode, final String sdiTariffPlan,
			final String sdiServiceCode, final String sdiPaymentType,
			final String sdiAccountType, final Date sdiDiscountUpto) {

		this.sdiSubDiscId = sdiSubDiscId;
		this.sdiSubscriberId = sdiSubscriberId;
		this.sdiDiscountId = sdiDiscountId;
		this.sdiStartDate = sdiStartDate;
		this.sdiEndDate = sdiEndDate;
		this.sdiSuspendDate = sdiSuspendDate;
		this.sdiQualId = sdiQualId;
		this.sdiQualType = sdiQualType;
		this.sdiPackageCode = sdiPackageCode;
		this.sdiTariffPlan = sdiTariffPlan;
		this.sdiServiceCode = sdiServiceCode;
		this.sdiPaymentType = sdiPaymentType;
		this.sdiAccountType = sdiAccountType;
		this.sdiDiscountUpto = sdiDiscountUpto;
	}

	public Integer getSdiSubDiscId() {
		return sdiSubDiscId;
	}

	public void setSdiSubDiscId(Integer sdiSubDiscId) {
		this.sdiSubDiscId = sdiSubDiscId;
	}

	public Integer getSdiSubscriberId() {
		return sdiSubscriberId;
	}

	public void setSdiSubscriberId(Integer sdiSubscriberId) {
		this.sdiSubscriberId = sdiSubscriberId;
	}

	public Integer getSdiDiscountId() {
		return sdiDiscountId;
	}

	public void setSdiDiscountId(Integer sdiDiscountId) {
		this.sdiDiscountId = sdiDiscountId;
	}

	public Date getSdiStartDate() {
		return sdiStartDate;
	}

	public void setSdiStartDate(Date sdiStartDate) {
		this.sdiStartDate = sdiStartDate;
	}

	public Date getSdiEndDate() {
		return sdiEndDate;
	}

	public void setSdiEndDate(Date sdiEndDate) {
		this.sdiEndDate = sdiEndDate;
	}

	public Date getSdiSuspendDate() {
		return sdiSuspendDate;
	}

	public void setSdiSuspendDate(Date sdiSuspendDate) {
		this.sdiSuspendDate = sdiSuspendDate;
	}

	public Integer getSdiQualId() {
		return sdiQualId;
	}

	public void setSdiQualId(Integer sdiQualId) {
		this.sdiQualId = sdiQualId;
	}

	public String getSdiQualType() {
		return sdiQualType;
	}

	public void setSdiQualType(String sdiQualType) {
		this.sdiQualType = sdiQualType;
	}

	public String getSdiPackageCode() {
		return sdiPackageCode;
	}

	public void setSdiPackageCode(String sdiPackageCode) {
		this.sdiPackageCode = sdiPackageCode;
	}

	public String getSdiTariffPlan() {
		return sdiTariffPlan;
	}

	public void setSdiTariffPlan(String sdiTariffPlan) {
		this.sdiTariffPlan = sdiTariffPlan;
	}

	public String getSdiServiceCode() {
		return sdiServiceCode;
	}

	public void setSdiServiceCode(String sdiServiceCode) {
		this.sdiServiceCode = sdiServiceCode;
	}

	public String getSdiPaymentType() {
		return sdiPaymentType;
	}

	public void setSdiPaymentType(String sdiPaymentType) {
		this.sdiPaymentType = sdiPaymentType;
	}

	public String getSdiAccountType() {
		return sdiAccountType;
	}

	public void setSdiAccountType(String sdiAccountType) {
		this.sdiAccountType = sdiAccountType;
	}

	public Date getSdiDiscountUpto() {
		return sdiDiscountUpto;
	}

	public void setSdiDiscountUpto(Date sdiDiscountUpto) {
		this.sdiDiscountUpto = sdiDiscountUpto;
	}

}
