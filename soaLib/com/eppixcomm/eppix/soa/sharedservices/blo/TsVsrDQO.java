package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.base.blo.AuxCustomersDMO;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SlcustmDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class TsVsrDQO extends DBO implements Serializable {

	private String tsPackageCode;
	private String tsInternalTariff;
	private String tsServiceCode;
	private String tsNetServCode;
	private String tsActCharge;
	private String tsTdeactCharge;
	private String tsReactCharge;
	private String tsPdeactCharge;
	private String tsSubCharge1;
	private String tsSubCharge2;
	private String tsSubCharge3;
	private String tsChargePeriod;
	private Short tsChargeFreq;
	private String tsDiscountRef;
	private String tsActInclusive;
	private String vsrServiceCode;
	private String vsrServiceType;
	private String vsrServiceDesc;
	private String vsrOriginator;
	private String vsrServiceClass;
	private String vsrTempDeact;
	private String vsrProrata;
	private String vsrProviderId;
	private String vsrShortDesc;
	private String vsrSuspend;

	public static final int tsPackageCodeFilter = 0;
	private static final int tsPackageCodeSize = 5;

	public static final int tsInternalTariffFilter = 1;
	private static final int tsInternalTariffSize = 20;

	public static final int tsServiceCodeFilter = 2;
	private static final int tsServiceCodeSize = 4;

	public static final int tsNetServCodeFilter = 3;
	private static final int tsNetServCodeSize = 15;

	public static final int tsActChargeFilter = 4;
	private static final int tsActChargeSize = 5;

	public static final int tsTdeactChargeFilter = 5;
	private static final int tsTdeactChargeSize = 5;

	public static final int tsReactChargeFilter = 6;
	private static final int tsReactChargeSize = 5;

	public static final int tsPdeactChargeFilter = 7;
	private static final int tsPdeactChargeSize = 5;

	public static final int tsSubCharge1Filter = 8;
	private static final int tsSubCharge1Size = 5;

	public static final int tsSubCharge2Filter = 9;
	private static final int tsSubCharge2Size = 5;

	public static final int tsSubCharge3Filter = 10;
	private static final int tsSubCharge3Size = 5;

	public static final int tsChargePeriodFilter = 11;
	private static final int tsChargePeriodSize = 1;

	public static final int tsChargeFreqFilter = 12;

	public static final int tsDiscountRefFilter = 13;
	private static final int tsDiscountRefSize = 4;

	public static final int tsActInclusiveFilter = 14;
	private static final int tsActInclusiveSize = 1;

	public static final int vsrServiceCodeFilter = 15;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 16;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 17;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 18;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 19;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 20;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 21;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 22;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 23;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 24;
	private static final int vsrSuspendSize = 1;

	public TsVsrDQO() {
	};

	public TsVsrDQO(final String tsPackageCode, final String tsInternalTariff,
			final String tsServiceCode, final String tsNetServCode,
			final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge,
			final String tsSubCharge1, final String tsSubCharge2,
			final String tsSubCharge3, final String tsChargePeriod,
			final Short tsChargeFreq, final String tsDiscountRef,
			final String tsActInclusive, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend) {

		this.tsPackageCode = tsPackageCode;
		this.tsInternalTariff = tsInternalTariff;
		this.tsServiceCode = tsServiceCode;
		this.tsNetServCode = tsNetServCode;
		this.tsActCharge = tsActCharge;
		this.tsTdeactCharge = tsTdeactCharge;
		this.tsReactCharge = tsReactCharge;
		this.tsPdeactCharge = tsPdeactCharge;
		this.tsSubCharge1 = tsSubCharge1;
		this.tsSubCharge2 = tsSubCharge2;
		this.tsSubCharge3 = tsSubCharge3;
		this.tsChargePeriod = tsChargePeriod;
		this.tsChargeFreq = tsChargeFreq;
		this.tsDiscountRef = tsDiscountRef;
		this.tsActInclusive = tsActInclusive;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
	};

	private static final int[] fieldSizes = new int[] { tsPackageCodeSize,
			tsInternalTariffSize, tsServiceCodeSize, tsNetServCodeSize,
			tsActChargeSize, tsTdeactChargeSize, tsReactChargeSize,
			tsPdeactChargeSize, tsSubCharge1Size, tsSubCharge2Size,
			tsSubCharge3Size, tsChargePeriodSize, 0, tsDiscountRefSize,
			tsActInclusiveSize, vsrServiceCodeSize, vsrServiceTypeSize,
			vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize,
			vsrTempDeactSize, vsrProrataSize, vsrProviderIdSize,
			vsrShortDescSize, vsrSuspendSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.tsPackageCode == null) ? null : (this.tsPackageCode
						.length() <= tsPackageCodeSize) ? this.tsPackageCode
						: this.tsPackageCode.substring(0,
								this.tsPackageCodeSize)),
				((this.tsInternalTariff == null) ? null
						: (this.tsInternalTariff.length() <= tsInternalTariffSize) ? this.tsInternalTariff
								: this.tsInternalTariff.substring(0,
										this.tsInternalTariffSize)),
				((this.tsServiceCode == null) ? null : (this.tsServiceCode
						.length() <= tsServiceCodeSize) ? this.tsServiceCode
						: this.tsServiceCode.substring(0,
								this.tsServiceCodeSize)),
				((this.tsNetServCode == null) ? null : (this.tsNetServCode
						.length() <= tsNetServCodeSize) ? this.tsNetServCode
						: this.tsNetServCode.substring(0,
								this.tsNetServCodeSize)),
				((this.tsActCharge == null) ? null
						: (this.tsActCharge.length() <= tsActChargeSize) ? this.tsActCharge
								: this.tsActCharge.substring(0,
										this.tsActChargeSize)),
				((this.tsTdeactCharge == null) ? null : (this.tsTdeactCharge
						.length() <= tsTdeactChargeSize) ? this.tsTdeactCharge
						: this.tsTdeactCharge.substring(0,
								this.tsTdeactChargeSize)),
				((this.tsReactCharge == null) ? null : (this.tsReactCharge
						.length() <= tsReactChargeSize) ? this.tsReactCharge
						: this.tsReactCharge.substring(0,
								this.tsReactChargeSize)),
				((this.tsPdeactCharge == null) ? null : (this.tsPdeactCharge
						.length() <= tsPdeactChargeSize) ? this.tsPdeactCharge
						: this.tsPdeactCharge.substring(0,
								this.tsPdeactChargeSize)),
				((this.tsSubCharge1 == null) ? null : (this.tsSubCharge1
						.length() <= tsSubCharge1Size) ? this.tsSubCharge1
						: this.tsSubCharge1.substring(0, this.tsSubCharge1Size)),
				((this.tsSubCharge2 == null) ? null : (this.tsSubCharge2
						.length() <= tsSubCharge2Size) ? this.tsSubCharge2
						: this.tsSubCharge2.substring(0, this.tsSubCharge2Size)),
				((this.tsSubCharge3 == null) ? null : (this.tsSubCharge3
						.length() <= tsSubCharge3Size) ? this.tsSubCharge3
						: this.tsSubCharge3.substring(0, this.tsSubCharge3Size)),
				((this.tsChargePeriod == null) ? null : (this.tsChargePeriod
						.length() <= tsChargePeriodSize) ? this.tsChargePeriod
						: this.tsChargePeriod.substring(0,
								this.tsChargePeriodSize)),
				this.tsChargeFreq,
				((this.tsDiscountRef == null) ? null : (this.tsDiscountRef
						.length() <= tsDiscountRefSize) ? this.tsDiscountRef
						: this.tsDiscountRef.substring(0,
								this.tsDiscountRefSize)),
				((this.tsActInclusive == null) ? null : (this.tsActInclusive
						.length() <= tsActInclusiveSize) ? this.tsActInclusive
						: this.tsActInclusive.substring(0,
								this.tsActInclusiveSize)),
				((this.vsrServiceCode == null) ? null : (this.vsrServiceCode
						.length() <= vsrServiceCodeSize) ? this.vsrServiceCode
						: this.vsrServiceCode.substring(0,
								this.vsrServiceCodeSize)),
				((this.vsrServiceType == null) ? null : (this.vsrServiceType
						.length() <= vsrServiceTypeSize) ? this.vsrServiceType
						: this.vsrServiceType.substring(0,
								this.vsrServiceTypeSize)),
				((this.vsrServiceDesc == null) ? null : (this.vsrServiceDesc
						.length() <= vsrServiceDescSize) ? this.vsrServiceDesc
						: this.vsrServiceDesc.substring(0,
								this.vsrServiceDescSize)),
				((this.vsrOriginator == null) ? null : (this.vsrOriginator
						.length() <= vsrOriginatorSize) ? this.vsrOriginator
						: this.vsrOriginator.substring(0,
								this.vsrOriginatorSize)),
				((this.vsrServiceClass == null) ? null
						: (this.vsrServiceClass.length() <= vsrServiceClassSize) ? this.vsrServiceClass
								: this.vsrServiceClass.substring(0,
										this.vsrServiceClassSize)),
				((this.vsrTempDeact == null) ? null : (this.vsrTempDeact
						.length() <= vsrTempDeactSize) ? this.vsrTempDeact
						: this.vsrTempDeact.substring(0, this.vsrTempDeactSize)),
				((this.vsrProrata == null) ? null
						: (this.vsrProrata.length() <= vsrProrataSize) ? this.vsrProrata
								: this.vsrProrata.substring(0,
										this.vsrProrataSize)),
				((this.vsrProviderId == null) ? null : (this.vsrProviderId
						.length() <= vsrProviderIdSize) ? this.vsrProviderId
						: this.vsrProviderId.substring(0,
								this.vsrProviderIdSize)),
				((this.vsrShortDesc == null) ? null : (this.vsrShortDesc
						.length() <= vsrShortDescSize) ? this.vsrShortDesc
						: this.vsrShortDesc.substring(0, this.vsrShortDescSize)),
				((this.vsrSuspend == null) ? null
						: (this.vsrSuspend.length() <= vsrSuspendSize) ? this.vsrSuspend
								: this.vsrSuspend.substring(0,
										this.vsrSuspendSize)) };
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
		this.tsPackageCode = rtrim((String) fields[0]);
		this.tsInternalTariff = rtrim((String) fields[1]);
		this.tsServiceCode = rtrim((String) fields[2]);
		this.tsNetServCode = rtrim((String) fields[3]);
		this.tsActCharge = rtrim((String) fields[4]);
		this.tsTdeactCharge = rtrim((String) fields[5]);
		this.tsReactCharge = rtrim((String) fields[6]);
		this.tsPdeactCharge = rtrim((String) fields[7]);
		this.tsSubCharge1 = rtrim((String) fields[8]);
		this.tsSubCharge2 = rtrim((String) fields[9]);
		this.tsSubCharge3 = rtrim((String) fields[10]);
		this.tsChargePeriod = rtrim((String) fields[11]);
		this.tsChargeFreq = ((Short) fields[12]);
		this.tsDiscountRef = rtrim((String) fields[13]);
		this.tsActInclusive = rtrim((String) fields[14]);
		this.vsrServiceCode = rtrim((String) fields[15]);
		this.vsrServiceType = rtrim((String) fields[16]);
		this.vsrServiceDesc = rtrim((String) fields[17]);
		this.vsrOriginator = rtrim((String) fields[18]);
		this.vsrServiceClass = rtrim((String) fields[19]);
		this.vsrTempDeact = rtrim((String) fields[20]);
		this.vsrProrata = rtrim((String) fields[21]);
		this.vsrProviderId = rtrim((String) fields[22]);
		this.vsrShortDesc = rtrim((String) fields[23]);
		this.vsrSuspend = rtrim((String) fields[24]);
	}

	public void set(final String tsPackageCode, final String tsInternalTariff,
			final String tsServiceCode, final String tsNetServCode,
			final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge,
			final String tsSubCharge1, final String tsSubCharge2,
			final String tsSubCharge3, final String tsChargePeriod,
			final Short tsChargeFreq, final String tsDiscountRef,
			final String tsActInclusive, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend) {

		this.tsPackageCode = tsPackageCode;
		this.tsInternalTariff = tsInternalTariff;
		this.tsServiceCode = tsServiceCode;
		this.tsNetServCode = tsNetServCode;
		this.tsActCharge = tsActCharge;
		this.tsTdeactCharge = tsTdeactCharge;
		this.tsReactCharge = tsReactCharge;
		this.tsPdeactCharge = tsPdeactCharge;
		this.tsSubCharge1 = tsSubCharge1;
		this.tsSubCharge2 = tsSubCharge2;
		this.tsSubCharge3 = tsSubCharge3;
		this.tsChargePeriod = tsChargePeriod;
		this.tsChargeFreq = tsChargeFreq;
		this.tsDiscountRef = tsDiscountRef;
		this.tsActInclusive = tsActInclusive;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
	}

	public String getTsPackageCode() {
		return tsPackageCode;
	}

	public String getTsInternalTariff() {
		return tsInternalTariff;
	}

	public String getTsServiceCode() {
		return tsServiceCode;
	}

	public String getTsNetServCode() {
		return tsNetServCode;
	}

	public String getTsActCharge() {
		return tsActCharge;
	}

	public String getTsTdeactCharge() {
		return tsTdeactCharge;
	}

	public String getTsReactCharge() {
		return tsReactCharge;
	}

	public String getTsPdeactCharge() {
		return tsPdeactCharge;
	}

	public String getTsSubCharge1() {
		return tsSubCharge1;
	}

	public String getTsSubCharge2() {
		return tsSubCharge2;
	}

	public String getTsSubCharge3() {
		return tsSubCharge3;
	}

	public String getTsChargePeriod() {
		return tsChargePeriod;
	}

	public Short getTsChargeFreq() {
		return tsChargeFreq;
	}

	public String getTsDiscountRef() {
		return tsDiscountRef;
	}

	public String getTsActInclusive() {
		return tsActInclusive;
	}

	public void setTsPackageCode(final String tsPackageCode) {
		this.tsPackageCode = getPadded(tsPackageCode, tsPackageCodeFilter);
	}

	public void setTsInternalTariff(final String tsInternalTariff) {
		this.tsInternalTariff = getPadded(tsInternalTariff,
				tsInternalTariffFilter);
	}

	public void setTsServiceCode(final String tsServiceCode) {
		this.tsServiceCode = getPadded(tsServiceCode, tsServiceCodeFilter);
	}

	public void setTsNetServCode(final String tsNetServCode) {
		this.tsNetServCode = getPadded(tsNetServCode, tsNetServCodeFilter);
	}

	public void setTsActCharge(final String tsActCharge) {
		this.tsActCharge = getPadded(tsActCharge, tsActChargeFilter);
	}

	public void setTsTdeactCharge(final String tsTdeactCharge) {
		this.tsTdeactCharge = getPadded(tsTdeactCharge, tsTdeactChargeFilter);
	}

	public void setTsReactCharge(final String tsReactCharge) {
		this.tsReactCharge = getPadded(tsReactCharge, tsReactChargeFilter);
	}

	public void setTsPdeactCharge(final String tsPdeactCharge) {
		this.tsPdeactCharge = getPadded(tsPdeactCharge, tsPdeactChargeFilter);
	}

	public void setTsSubCharge1(final String tsSubCharge1) {
		this.tsSubCharge1 = getPadded(tsSubCharge1, tsSubCharge1Filter);
	}

	public void setTsSubCharge2(final String tsSubCharge2) {
		this.tsSubCharge2 = getPadded(tsSubCharge2, tsSubCharge2Filter);
	}

	public void setTsSubCharge3(final String tsSubCharge3) {
		this.tsSubCharge3 = getPadded(tsSubCharge3, tsSubCharge3Filter);
	}

	public void setTsChargePeriod(final String tsChargePeriod) {
		this.tsChargePeriod = getPadded(tsChargePeriod, tsChargePeriodFilter);
	}

	public void setTsChargeFreq(final Short tsChargeFreq) {
		this.tsChargeFreq = tsChargeFreq;
	}

	public void setTsChargeFreq(final int tsChargeFreq) {
		this.tsChargeFreq = Short.valueOf((short) tsChargeFreq);
	}

	public void setTsDiscountRef(final String tsDiscountRef) {
		this.tsDiscountRef = getPadded(tsDiscountRef, tsDiscountRefFilter);
	}

	public void setTsActInclusive(final String tsActInclusive) {
		this.tsActInclusive = getPadded(tsActInclusive, tsActInclusiveFilter);
	}

	public String getVsrServiceCode() {
		return vsrServiceCode;
	}

	public String getVsrServiceType() {
		return vsrServiceType;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public String getVsrOriginator() {
		return vsrOriginator;
	}

	public String getVsrServiceClass() {
		return vsrServiceClass;
	}

	public String getVsrTempDeact() {
		return vsrTempDeact;
	}

	public String getVsrProrata() {
		return vsrProrata;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public String getVsrShortDesc() {
		return vsrShortDesc;
	}

	public String getVsrSuspend() {
		return vsrSuspend;
	}

	public void setVsrServiceCode(final String vsrServiceCode) {
		this.vsrServiceCode = getPadded(vsrServiceCode, vsrServiceCodeFilter);
	}

	public void setVsrServiceType(final String vsrServiceType) {
		this.vsrServiceType = getPadded(vsrServiceType, vsrServiceTypeFilter);
	}

	public void setVsrServiceDesc(final String vsrServiceDesc) {
		this.vsrServiceDesc = getPadded(vsrServiceDesc, vsrServiceDescFilter);
	}

	public void setVsrOriginator(final String vsrOriginator) {
		this.vsrOriginator = getPadded(vsrOriginator, vsrOriginatorFilter);
	}

	public void setVsrServiceClass(final String vsrServiceClass) {
		this.vsrServiceClass = getPadded(vsrServiceClass, vsrServiceClassFilter);
	}

	public void setVsrTempDeact(final String vsrTempDeact) {
		this.vsrTempDeact = getPadded(vsrTempDeact, vsrTempDeactFilter);
	}

	public void setVsrProrata(final String vsrProrata) {
		this.vsrProrata = getPadded(vsrProrata, vsrProrataFilter);
	}

	public void setVsrProviderId(final String vsrProviderId) {
		this.vsrProviderId = getPadded(vsrProviderId, vsrProviderIdFilter);
	}

	public void setVsrShortDesc(final String vsrShortDesc) {
		this.vsrShortDesc = getPadded(vsrShortDesc, vsrShortDescFilter);
	}

	public void setVsrSuspend(final String vsrSuspend) {
		this.vsrSuspend = getPadded(vsrSuspend, vsrSuspendFilter);
	}

}
