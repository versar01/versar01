package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SptServParaTarDMO extends DBO implements Serializable {

	private Integer sptParamId;
	private String sptTariffCode;
	private String sptServiceCode;
	private String sptServiceType;
	private String sptNetServCode;
	private String sptActCharge;
	private String sptDeactCharge;
	private String sptActInclusive;
	private String sptPackageCode;

	public static final int sptParamIdFilter = 0;

	public static final int sptTariffCodeFilter = 1;
	private static final int sptTariffCodeSize = 20;

	public static final int sptServiceCodeFilter = 2;
	private static final int sptServiceCodeSize = 4;

	public static final int sptServiceTypeFilter = 3;
	private static final int sptServiceTypeSize = 5;

	public static final int sptNetServCodeFilter = 4;
	private static final int sptNetServCodeSize = 15;

	public static final int sptActChargeFilter = 5;
	private static final int sptActChargeSize = 5;

	public static final int sptDeactChargeFilter = 6;
	private static final int sptDeactChargeSize = 5;

	public static final int sptActInclusiveFilter = 7;
	private static final int sptActInclusiveSize = 1;

	public static final int sptPackageCodeFilter = 8;
	private static final int sptPackageCodeSize = 5;

	public SptServParaTarDMO() {
	};

	public SptServParaTarDMO(final Integer sptParamId,
			final String sptTariffCode, final String sptServiceCode,
			final String sptServiceType, final String sptNetServCode,
			final String sptActCharge, final String sptDeactCharge,
			final String sptActInclusive, final String sptPackageCode) {

		this.sptParamId = sptParamId;
		this.sptTariffCode = sptTariffCode;
		this.sptServiceCode = sptServiceCode;
		this.sptServiceType = sptServiceType;
		this.sptNetServCode = sptNetServCode;
		this.sptActCharge = sptActCharge;
		this.sptDeactCharge = sptDeactCharge;
		this.sptActInclusive = sptActInclusive;
		this.sptPackageCode = sptPackageCode;
	};

	private static final int[] fieldSizes = new int[] { 0, sptTariffCodeSize,
			sptServiceCodeSize, sptServiceTypeSize, sptNetServCodeSize,
			sptActChargeSize, sptDeactChargeSize, sptActInclusiveSize,
			sptPackageCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sptParamId,
				((this.sptTariffCode == null) ? null : (this.sptTariffCode
						.length() <= sptTariffCodeSize) ? this.sptTariffCode
						: this.sptTariffCode.substring(0,
								this.sptTariffCodeSize)),
				((this.sptServiceCode == null) ? null : (this.sptServiceCode
						.length() <= sptServiceCodeSize) ? this.sptServiceCode
						: this.sptServiceCode.substring(0,
								this.sptServiceCodeSize)),
				((this.sptServiceType == null) ? null : (this.sptServiceType
						.length() <= sptServiceTypeSize) ? this.sptServiceType
						: this.sptServiceType.substring(0,
								this.sptServiceTypeSize)),
				((this.sptNetServCode == null) ? null : (this.sptNetServCode
						.length() <= sptNetServCodeSize) ? this.sptNetServCode
						: this.sptNetServCode.substring(0,
								this.sptNetServCodeSize)),
				((this.sptActCharge == null) ? null : (this.sptActCharge
						.length() <= sptActChargeSize) ? this.sptActCharge
						: this.sptActCharge.substring(0, this.sptActChargeSize)),
				((this.sptDeactCharge == null) ? null : (this.sptDeactCharge
						.length() <= sptDeactChargeSize) ? this.sptDeactCharge
						: this.sptDeactCharge.substring(0,
								this.sptDeactChargeSize)),
				((this.sptActInclusive == null) ? null
						: (this.sptActInclusive.length() <= sptActInclusiveSize) ? this.sptActInclusive
								: this.sptActInclusive.substring(0,
										this.sptActInclusiveSize)),
				((this.sptPackageCode == null) ? null : (this.sptPackageCode
						.length() <= sptPackageCodeSize) ? this.sptPackageCode
						: this.sptPackageCode.substring(0,
								this.sptPackageCodeSize)) };
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
		return new DAOArgs(3).arg(this.sptParamId).arg(this.sptTariffCode)
				.arg(this.sptPackageCode);
	}

	protected void set(Object[] fields) {
		this.sptParamId = ((Integer) fields[0]);
		this.sptTariffCode = rtrim((String) fields[1]);
		this.sptServiceCode = rtrim((String) fields[2]);
		this.sptServiceType = rtrim((String) fields[3]);
		this.sptNetServCode = rtrim((String) fields[4]);
		this.sptActCharge = rtrim((String) fields[5]);
		this.sptDeactCharge = rtrim((String) fields[6]);
		this.sptActInclusive = rtrim((String) fields[7]);
		this.sptPackageCode = rtrim((String) fields[8]);
	}

	public void set(final Integer sptParamId, final String sptTariffCode,
			final String sptServiceCode, final String sptServiceType,
			final String sptNetServCode, final String sptActCharge,
			final String sptDeactCharge, final String sptActInclusive,
			final String sptPackageCode) {

		this.sptParamId = sptParamId;
		this.sptTariffCode = sptTariffCode;
		this.sptServiceCode = sptServiceCode;
		this.sptServiceType = sptServiceType;
		this.sptNetServCode = sptNetServCode;
		this.sptActCharge = sptActCharge;
		this.sptDeactCharge = sptDeactCharge;
		this.sptActInclusive = sptActInclusive;
		this.sptPackageCode = sptPackageCode;
	}

	public Integer getSptParamId() {
		return sptParamId;
	}

	public void setSptParamId(Integer sptParamId) {
		this.sptParamId = sptParamId;
	}

	public String getSptTariffCode() {
		return sptTariffCode;
	}

	public void setSptTariffCode(String sptTariffCode) {
		this.sptTariffCode = sptTariffCode;
	}

	public String getSptServiceCode() {
		return sptServiceCode;
	}

	public void setSptServiceCode(String sptServiceCode) {
		this.sptServiceCode = sptServiceCode;
	}

	public String getSptServiceType() {
		return sptServiceType;
	}

	public void setSptServiceType(String sptServiceType) {
		this.sptServiceType = sptServiceType;
	}

	public String getSptNetServCode() {
		return sptNetServCode;
	}

	public void setSptNetServCode(String sptNetServCode) {
		this.sptNetServCode = sptNetServCode;
	}

	public String getSptActCharge() {
		return sptActCharge;
	}

	public void setSptActCharge(String sptActCharge) {
		this.sptActCharge = sptActCharge;
	}

	public String getSptDeactCharge() {
		return sptDeactCharge;
	}

	public void setSptDeactCharge(String sptDeactCharge) {
		this.sptDeactCharge = sptDeactCharge;
	}

	public String getSptActInclusive() {
		return sptActInclusive;
	}

	public void setSptActInclusive(String sptActInclusive) {
		this.sptActInclusive = sptActInclusive;
	}

	public String getSptPackageCode() {
		return sptPackageCode;
	}

	public void setSptPackageCode(String sptPackageCode) {
		this.sptPackageCode = sptPackageCode;
	}

}
