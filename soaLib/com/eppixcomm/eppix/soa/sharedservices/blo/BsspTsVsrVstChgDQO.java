package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class BsspTsVsrVstChgDQO extends DBO implements Serializable {

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
	private String vstServiceType;
	private String vstServiceDesc;
	private String vstMultiCharge;
	private String vstServiceClass;
	private String vstAutoConnect;
	private String vstOriginator;
	private String vstTariffRelated;
	private String vstParameterised;
	private String vstParamsLevel;
	private Short vstArchiveMonths;
	private String vstFutureAct;
	private String vstNodeLevel;
	private String chgCode;
	private String chgDescription;
	private BigDecimal chgValue;
	private String chgVatCode;
	private String chgNcode;
	private String chgNetid;
	private String chgChargef;
	private String chgPeriod;
	private Short chgFrequency;
	private Date chgEffectiveDate;
	private Integer chgClassId;

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

	public static final int vstServiceTypeFilter = 25;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 26;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 27;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 28;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 29;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 30;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 31;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 32;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 33;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 34;

	public static final int vstFutureActFilter = 35;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 36;
	private static final int vstNodeLevelSize = 5;

	public static final int chgCodeFilter = 37;
	private static final int chgCodeSize = 5;

	public static final int chgDescriptionFilter = 38;
	private static final int chgDescriptionSize = 32;

	public static final int chgValueFilter = 39;

	public static final int chgVatCodeFilter = 40;
	private static final int chgVatCodeSize = 1;

	public static final int chgNcodeFilter = 41;
	private static final int chgNcodeSize = 20;

	public static final int chgNetidFilter = 42;
	private static final int chgNetidSize = 5;

	public static final int chgChargefFilter = 43;
	private static final int chgChargefSize = 1;

	public static final int chgPeriodFilter = 44;
	private static final int chgPeriodSize = 1;

	public static final int chgFrequencyFilter = 45;

	public static final int chgEffectiveDateFilter = 46;

	public static final int chgClassIdFilter = 47;

	public BsspTsVsrVstChgDQO() {
	};

	public BsspTsVsrVstChgDQO(final String tsPackageCode, final String tsInternalTariff, final String tsServiceCode,
			final String tsNetServCode, final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge, final String tsSubCharge1,
			final String tsSubCharge2, final String tsSubCharge3, final String tsChargePeriod, final Short tsChargeFreq,
			final String tsDiscountRef, final String tsActInclusive, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc, final String vsrOriginator,
			final String vsrServiceClass, final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc, final String vsrSuspend, final String vstServiceType,
			final String vstServiceDesc, final String vstMultiCharge, final String vstServiceClass,
			final String vstAutoConnect, final String vstOriginator, final String vstTariffRelated,
			final String vstParameterised, final String vstParamsLevel, final Short vstArchiveMonths,
			final String vstFutureAct, final String vstNodeLevel, final String chgCode, final String chgDescription,
			final BigDecimal chgValue, final String chgVatCode, final String chgNcode, final String chgNetid,
			final String chgChargef, final String chgPeriod, final Short chgFrequency, final Date chgEffectiveDate,
			final Integer chgClassId) {

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
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstMultiCharge = vstMultiCharge;
		this.vstServiceClass = vstServiceClass;
		this.vstAutoConnect = vstAutoConnect;
		this.vstOriginator = vstOriginator;
		this.vstTariffRelated = vstTariffRelated;
		this.vstParameterised = vstParameterised;
		this.vstParamsLevel = vstParamsLevel;
		this.vstArchiveMonths = vstArchiveMonths;
		this.vstFutureAct = vstFutureAct;
		this.vstNodeLevel = vstNodeLevel;
		this.chgCode = chgCode;
		this.chgDescription = chgDescription;
		this.chgValue = chgValue;
		this.chgVatCode = chgVatCode;
		this.chgNcode = chgNcode;
		this.chgNetid = chgNetid;
		this.chgChargef = chgChargef;
		this.chgPeriod = chgPeriod;
		this.chgFrequency = chgFrequency;
		this.chgEffectiveDate = chgEffectiveDate;
		this.chgClassId = chgClassId;
	};

	private static final int[] fieldSizes = new int[] { tsPackageCodeSize, tsInternalTariffSize, tsServiceCodeSize,
			tsNetServCodeSize, tsActChargeSize, tsTdeactChargeSize, tsReactChargeSize, tsPdeactChargeSize,
			tsSubCharge1Size, tsSubCharge2Size, tsSubCharge3Size, tsChargePeriodSize, 0, tsDiscountRefSize,
			tsActInclusiveSize, vsrServiceCodeSize, vsrServiceTypeSize, vsrServiceDescSize, vsrOriginatorSize,
			vsrServiceClassSize, vsrTempDeactSize, vsrProrataSize, vsrProviderIdSize, vsrShortDescSize, vsrSuspendSize,
			vstServiceTypeSize, vstServiceDescSize, vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize,
			vstOriginatorSize, vstTariffRelatedSize, vstParameterisedSize, vstParamsLevelSize, 0, vstFutureActSize,
			vstNodeLevelSize, chgCodeSize, chgDescriptionSize, 0, chgVatCodeSize, chgNcodeSize, chgNetidSize,
			chgChargefSize, chgPeriodSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.tsPackageCode == null) ? null
						: (this.tsPackageCode.length() <= tsPackageCodeSize) ? this.tsPackageCode
								: this.tsPackageCode.substring(0, this.tsPackageCodeSize)),
				((this.tsInternalTariff == null) ? null
						: (this.tsInternalTariff.length() <= tsInternalTariffSize) ? this.tsInternalTariff
								: this.tsInternalTariff.substring(0, this.tsInternalTariffSize)),
				((this.tsServiceCode == null) ? null
						: (this.tsServiceCode.length() <= tsServiceCodeSize) ? this.tsServiceCode
								: this.tsServiceCode.substring(0, this.tsServiceCodeSize)),
				((this.tsNetServCode == null) ? null
						: (this.tsNetServCode.length() <= tsNetServCodeSize) ? this.tsNetServCode
								: this.tsNetServCode.substring(0, this.tsNetServCodeSize)),
				((this.tsActCharge == null) ? null
						: (this.tsActCharge.length() <= tsActChargeSize) ? this.tsActCharge
								: this.tsActCharge.substring(0, this.tsActChargeSize)),
				((this.tsTdeactCharge == null) ? null
						: (this.tsTdeactCharge.length() <= tsTdeactChargeSize) ? this.tsTdeactCharge
								: this.tsTdeactCharge.substring(0, this.tsTdeactChargeSize)),
				((this.tsReactCharge == null) ? null
						: (this.tsReactCharge.length() <= tsReactChargeSize) ? this.tsReactCharge
								: this.tsReactCharge.substring(0, this.tsReactChargeSize)),
				((this.tsPdeactCharge == null) ? null
						: (this.tsPdeactCharge.length() <= tsPdeactChargeSize) ? this.tsPdeactCharge
								: this.tsPdeactCharge.substring(0, this.tsPdeactChargeSize)),
				((this.tsSubCharge1 == null) ? null
						: (this.tsSubCharge1.length() <= tsSubCharge1Size) ? this.tsSubCharge1
								: this.tsSubCharge1.substring(0, this.tsSubCharge1Size)),
				((this.tsSubCharge2 == null) ? null
						: (this.tsSubCharge2.length() <= tsSubCharge2Size) ? this.tsSubCharge2
								: this.tsSubCharge2.substring(0, this.tsSubCharge2Size)),
				((this.tsSubCharge3 == null) ? null
						: (this.tsSubCharge3.length() <= tsSubCharge3Size) ? this.tsSubCharge3
								: this.tsSubCharge3.substring(0, this.tsSubCharge3Size)),
				((this.tsChargePeriod == null) ? null
						: (this.tsChargePeriod.length() <= tsChargePeriodSize) ? this.tsChargePeriod
								: this.tsChargePeriod.substring(0, this.tsChargePeriodSize)),
				this.tsChargeFreq,
				((this.tsDiscountRef == null) ? null
						: (this.tsDiscountRef.length() <= tsDiscountRefSize) ? this.tsDiscountRef
								: this.tsDiscountRef.substring(0, this.tsDiscountRefSize)),
				((this.tsActInclusive == null) ? null
						: (this.tsActInclusive.length() <= tsActInclusiveSize) ? this.tsActInclusive
								: this.tsActInclusive.substring(0, this.tsActInclusiveSize)),
				((this.vsrServiceCode == null) ? null
						: (this.vsrServiceCode.length() <= vsrServiceCodeSize) ? this.vsrServiceCode
								: this.vsrServiceCode.substring(0, this.vsrServiceCodeSize)),
				((this.vsrServiceType == null) ? null
						: (this.vsrServiceType.length() <= vsrServiceTypeSize) ? this.vsrServiceType
								: this.vsrServiceType.substring(0, this.vsrServiceTypeSize)),
				((this.vsrServiceDesc == null) ? null
						: (this.vsrServiceDesc.length() <= vsrServiceDescSize) ? this.vsrServiceDesc
								: this.vsrServiceDesc.substring(0, this.vsrServiceDescSize)),
				((this.vsrOriginator == null) ? null
						: (this.vsrOriginator.length() <= vsrOriginatorSize) ? this.vsrOriginator
								: this.vsrOriginator.substring(0, this.vsrOriginatorSize)),
				((this.vsrServiceClass == null) ? null
						: (this.vsrServiceClass.length() <= vsrServiceClassSize) ? this.vsrServiceClass
								: this.vsrServiceClass.substring(0, this.vsrServiceClassSize)),
				((this.vsrTempDeact == null) ? null
						: (this.vsrTempDeact.length() <= vsrTempDeactSize) ? this.vsrTempDeact
								: this.vsrTempDeact.substring(0, this.vsrTempDeactSize)),
				((this.vsrProrata == null) ? null
						: (this.vsrProrata.length() <= vsrProrataSize) ? this.vsrProrata
								: this.vsrProrata.substring(0, this.vsrProrataSize)),
				((this.vsrProviderId == null) ? null
						: (this.vsrProviderId.length() <= vsrProviderIdSize) ? this.vsrProviderId
								: this.vsrProviderId.substring(0, this.vsrProviderIdSize)),
				((this.vsrShortDesc == null) ? null
						: (this.vsrShortDesc.length() <= vsrShortDescSize) ? this.vsrShortDesc
								: this.vsrShortDesc.substring(0, this.vsrShortDescSize)),
				((this.vsrSuspend == null) ? null
						: (this.vsrSuspend.length() <= vsrSuspendSize) ? this.vsrSuspend
								: this.vsrSuspend.substring(0, this.vsrSuspendSize)),
				((this.vstServiceType == null) ? null
						: (this.vstServiceType.length() <= vstServiceTypeSize) ? this.vstServiceType
								: this.vstServiceType.substring(0, this.vstServiceTypeSize)),
				((this.vstServiceDesc == null) ? null
						: (this.vstServiceDesc.length() <= vstServiceDescSize) ? this.vstServiceDesc
								: this.vstServiceDesc.substring(0, this.vstServiceDescSize)),
				((this.vstMultiCharge == null) ? null
						: (this.vstMultiCharge.length() <= vstMultiChargeSize) ? this.vstMultiCharge
								: this.vstMultiCharge.substring(0, this.vstMultiChargeSize)),
				((this.vstServiceClass == null) ? null
						: (this.vstServiceClass.length() <= vstServiceClassSize) ? this.vstServiceClass
								: this.vstServiceClass.substring(0, this.vstServiceClassSize)),
				((this.vstAutoConnect == null) ? null
						: (this.vstAutoConnect.length() <= vstAutoConnectSize) ? this.vstAutoConnect
								: this.vstAutoConnect.substring(0, this.vstAutoConnectSize)),
				((this.vstOriginator == null) ? null
						: (this.vstOriginator.length() <= vstOriginatorSize) ? this.vstOriginator
								: this.vstOriginator.substring(0, this.vstOriginatorSize)),
				((this.vstTariffRelated == null) ? null
						: (this.vstTariffRelated.length() <= vstTariffRelatedSize) ? this.vstTariffRelated
								: this.vstTariffRelated.substring(0, this.vstTariffRelatedSize)),
				((this.vstParameterised == null) ? null
						: (this.vstParameterised.length() <= vstParameterisedSize) ? this.vstParameterised
								: this.vstParameterised.substring(0, this.vstParameterisedSize)),
				((this.vstParamsLevel == null) ? null
						: (this.vstParamsLevel.length() <= vstParamsLevelSize) ? this.vstParamsLevel
								: this.vstParamsLevel.substring(0, this.vstParamsLevelSize)),
				this.vstArchiveMonths,
				((this.vstFutureAct == null) ? null
						: (this.vstFutureAct.length() <= vstFutureActSize) ? this.vstFutureAct
								: this.vstFutureAct.substring(0, this.vstFutureActSize)),
				((this.vstNodeLevel == null) ? null
						: (this.vstNodeLevel.length() <= vstNodeLevelSize) ? this.vstNodeLevel
								: this.vstNodeLevel.substring(0, this.vstNodeLevelSize)),
				((this.chgCode == null) ? null
						: (this.chgCode.length() <= chgCodeSize) ? this.chgCode
								: this.chgCode.substring(0, this.chgCodeSize)),
				((this.chgDescription == null) ? null
						: (this.chgDescription.length() <= chgDescriptionSize) ? this.chgDescription
								: this.chgDescription.substring(0, this.chgDescriptionSize)),
				this.chgValue,
				((this.chgVatCode == null) ? null
						: (this.chgVatCode.length() <= chgVatCodeSize) ? this.chgVatCode
								: this.chgVatCode.substring(0, this.chgVatCodeSize)),
				((this.chgNcode == null) ? null
						: (this.chgNcode.length() <= chgNcodeSize) ? this.chgNcode
								: this.chgNcode.substring(0, this.chgNcodeSize)),
				((this.chgNetid == null) ? null
						: (this.chgNetid.length() <= chgNetidSize) ? this.chgNetid
								: this.chgNetid.substring(0, this.chgNetidSize)),
				((this.chgChargef == null) ? null
						: (this.chgChargef.length() <= chgChargefSize) ? this.chgChargef
								: this.chgChargef.substring(0, this.chgChargefSize)),
				((this.chgPeriod == null) ? null
						: (this.chgPeriod.length() <= chgPeriodSize) ? this.chgPeriod
								: this.chgPeriod.substring(0, this.chgPeriodSize)),
				this.chgFrequency, this.chgEffectiveDate, this.chgClassId };
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

		this.vstServiceType = rtrim((String) fields[25]);

		this.vstServiceDesc = rtrim((String) fields[26]);

		this.vstMultiCharge = rtrim((String) fields[27]);

		this.vstServiceClass = rtrim((String) fields[28]);

		this.vstAutoConnect = rtrim((String) fields[29]);

		this.vstOriginator = rtrim((String) fields[30]);

		this.vstTariffRelated = rtrim((String) fields[31]);

		this.vstParameterised = rtrim((String) fields[32]);

		this.vstParamsLevel = rtrim((String) fields[33]);

		this.vstArchiveMonths = ((Short) fields[34]);
		this.vstFutureAct = rtrim((String) fields[35]);

		this.vstNodeLevel = rtrim((String) fields[36]);

		this.chgCode = rtrim((String) fields[37]);

		this.chgDescription = rtrim((String) fields[38]);

		this.chgValue = ((BigDecimal) fields[39]);
		this.chgVatCode = rtrim((String) fields[40]);

		this.chgNcode = rtrim((String) fields[41]);

		this.chgNetid = rtrim((String) fields[42]);

		this.chgChargef = rtrim((String) fields[43]);

		this.chgPeriod = rtrim((String) fields[44]);

		this.chgFrequency = ((Short) fields[45]);
		this.chgEffectiveDate = ((fields[46] == null) ? null : new Date(fields[46]));
		this.chgClassId = ((Integer) fields[47]);
	}

	public void set(final String tsPackageCode, final String tsInternalTariff, final String tsServiceCode,
			final String tsNetServCode, final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge, final String tsSubCharge1,
			final String tsSubCharge2, final String tsSubCharge3, final String tsChargePeriod, final Short tsChargeFreq,
			final String tsDiscountRef, final String tsActInclusive, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc, final String vsrOriginator,
			final String vsrServiceClass, final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc, final String vsrSuspend, final String vstServiceType,
			final String vstServiceDesc, final String vstMultiCharge, final String vstServiceClass,
			final String vstAutoConnect, final String vstOriginator, final String vstTariffRelated,
			final String vstParameterised, final String vstParamsLevel, final Short vstArchiveMonths,
			final String vstFutureAct, final String vstNodeLevel, final String chgCode, final String chgDescription,
			final BigDecimal chgValue, final String chgVatCode, final String chgNcode, final String chgNetid,
			final String chgChargef, final String chgPeriod, final Short chgFrequency, final Date chgEffectiveDate,
			final Integer chgClassId) {

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
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstMultiCharge = vstMultiCharge;
		this.vstServiceClass = vstServiceClass;
		this.vstAutoConnect = vstAutoConnect;
		this.vstOriginator = vstOriginator;
		this.vstTariffRelated = vstTariffRelated;
		this.vstParameterised = vstParameterised;
		this.vstParamsLevel = vstParamsLevel;
		this.vstArchiveMonths = vstArchiveMonths;
		this.vstFutureAct = vstFutureAct;
		this.vstNodeLevel = vstNodeLevel;
		this.chgCode = chgCode;
		this.chgDescription = chgDescription;
		this.chgValue = chgValue;
		this.chgVatCode = chgVatCode;
		this.chgNcode = chgNcode;
		this.chgNetid = chgNetid;
		this.chgChargef = chgChargef;
		this.chgPeriod = chgPeriod;
		this.chgFrequency = chgFrequency;
		this.chgEffectiveDate = chgEffectiveDate;
		this.chgClassId = chgClassId;
	}

	public String getTsPackageCode() {
		return tsPackageCode;
	}

	public void setTsPackageCode(String tsPackageCode) {
		this.tsPackageCode = tsPackageCode;
	}

	public String getTsInternalTariff() {
		return tsInternalTariff;
	}

	public void setTsInternalTariff(String tsInternalTariff) {
		this.tsInternalTariff = tsInternalTariff;
	}

	public String getTsServiceCode() {
		return tsServiceCode;
	}

	public void setTsServiceCode(String tsServiceCode) {
		this.tsServiceCode = tsServiceCode;
	}

	public String getTsNetServCode() {
		return tsNetServCode;
	}

	public void setTsNetServCode(String tsNetServCode) {
		this.tsNetServCode = tsNetServCode;
	}

	public String getTsActCharge() {
		return tsActCharge;
	}

	public void setTsActCharge(String tsActCharge) {
		this.tsActCharge = tsActCharge;
	}

	public String getTsTdeactCharge() {
		return tsTdeactCharge;
	}

	public void setTsTdeactCharge(String tsTdeactCharge) {
		this.tsTdeactCharge = tsTdeactCharge;
	}

	public String getTsReactCharge() {
		return tsReactCharge;
	}

	public void setTsReactCharge(String tsReactCharge) {
		this.tsReactCharge = tsReactCharge;
	}

	public String getTsPdeactCharge() {
		return tsPdeactCharge;
	}

	public void setTsPdeactCharge(String tsPdeactCharge) {
		this.tsPdeactCharge = tsPdeactCharge;
	}

	public String getTsSubCharge1() {
		return tsSubCharge1;
	}

	public void setTsSubCharge1(String tsSubCharge1) {
		this.tsSubCharge1 = tsSubCharge1;
	}

	public String getTsSubCharge2() {
		return tsSubCharge2;
	}

	public void setTsSubCharge2(String tsSubCharge2) {
		this.tsSubCharge2 = tsSubCharge2;
	}

	public String getTsSubCharge3() {
		return tsSubCharge3;
	}

	public void setTsSubCharge3(String tsSubCharge3) {
		this.tsSubCharge3 = tsSubCharge3;
	}

	public String getTsChargePeriod() {
		return tsChargePeriod;
	}

	public void setTsChargePeriod(String tsChargePeriod) {
		this.tsChargePeriod = tsChargePeriod;
	}

	public Short getTsChargeFreq() {
		return tsChargeFreq;
	}

	public void setTsChargeFreq(Short tsChargeFreq) {
		this.tsChargeFreq = tsChargeFreq;
	}

	public String getTsDiscountRef() {
		return tsDiscountRef;
	}

	public void setTsDiscountRef(String tsDiscountRef) {
		this.tsDiscountRef = tsDiscountRef;
	}

	public String getTsActInclusive() {
		return tsActInclusive;
	}

	public void setTsActInclusive(String tsActInclusive) {
		this.tsActInclusive = tsActInclusive;
	}

	public String getVsrServiceCode() {
		return vsrServiceCode;
	}

	public void setVsrServiceCode(String vsrServiceCode) {
		this.vsrServiceCode = vsrServiceCode;
	}

	public String getVsrServiceType() {
		return vsrServiceType;
	}

	public void setVsrServiceType(String vsrServiceType) {
		this.vsrServiceType = vsrServiceType;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = vsrServiceDesc;
	}

	public String getVsrOriginator() {
		return vsrOriginator;
	}

	public void setVsrOriginator(String vsrOriginator) {
		this.vsrOriginator = vsrOriginator;
	}

	public String getVsrServiceClass() {
		return vsrServiceClass;
	}

	public void setVsrServiceClass(String vsrServiceClass) {
		this.vsrServiceClass = vsrServiceClass;
	}

	public String getVsrTempDeact() {
		return vsrTempDeact;
	}

	public void setVsrTempDeact(String vsrTempDeact) {
		this.vsrTempDeact = vsrTempDeact;
	}

	public String getVsrProrata() {
		return vsrProrata;
	}

	public void setVsrProrata(String vsrProrata) {
		this.vsrProrata = vsrProrata;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public void setVsrProviderId(String vsrProviderId) {
		this.vsrProviderId = vsrProviderId;
	}

	public String getVsrShortDesc() {
		return vsrShortDesc;
	}

	public void setVsrShortDesc(String vsrShortDesc) {
		this.vsrShortDesc = vsrShortDesc;
	}

	public String getVsrSuspend() {
		return vsrSuspend;
	}

	public void setVsrSuspend(String vsrSuspend) {
		this.vsrSuspend = vsrSuspend;
	}

	public String getVstServiceType() {
		return vstServiceType;
	}

	public void setVstServiceType(String vstServiceType) {
		this.vstServiceType = vstServiceType;
	}

	public String getVstServiceDesc() {
		return vstServiceDesc;
	}

	public void setVstServiceDesc(String vstServiceDesc) {
		this.vstServiceDesc = vstServiceDesc;
	}

	public String getVstMultiCharge() {
		return vstMultiCharge;
	}

	public void setVstMultiCharge(String vstMultiCharge) {
		this.vstMultiCharge = vstMultiCharge;
	}

	public String getVstServiceClass() {
		return vstServiceClass;
	}

	public void setVstServiceClass(String vstServiceClass) {
		this.vstServiceClass = vstServiceClass;
	}

	public String getVstAutoConnect() {
		return vstAutoConnect;
	}

	public void setVstAutoConnect(String vstAutoConnect) {
		this.vstAutoConnect = vstAutoConnect;
	}

	public String getVstOriginator() {
		return vstOriginator;
	}

	public void setVstOriginator(String vstOriginator) {
		this.vstOriginator = vstOriginator;
	}

	public String getVstTariffRelated() {
		return vstTariffRelated;
	}

	public void setVstTariffRelated(String vstTariffRelated) {
		this.vstTariffRelated = vstTariffRelated;
	}

	public String getVstParameterised() {
		return vstParameterised;
	}

	public void setVstParameterised(String vstParameterised) {
		this.vstParameterised = vstParameterised;
	}

	public String getVstParamsLevel() {
		return vstParamsLevel;
	}

	public void setVstParamsLevel(String vstParamsLevel) {
		this.vstParamsLevel = vstParamsLevel;
	}

	public Short getVstArchiveMonths() {
		return vstArchiveMonths;
	}

	public void setVstArchiveMonths(Short vstArchiveMonths) {
		this.vstArchiveMonths = vstArchiveMonths;
	}

	public String getVstFutureAct() {
		return vstFutureAct;
	}

	public void setVstFutureAct(String vstFutureAct) {
		this.vstFutureAct = vstFutureAct;
	}

	public String getVstNodeLevel() {
		return vstNodeLevel;
	}

	public void setVstNodeLevel(String vstNodeLevel) {
		this.vstNodeLevel = vstNodeLevel;
	}

	public String getChgCode() {
		return chgCode;
	}

	public void setChgCode(String chgCode) {
		this.chgCode = chgCode;
	}

	public String getChgDescription() {
		return chgDescription;
	}

	public void setChgDescription(String chgDescription) {
		this.chgDescription = chgDescription;
	}

	public BigDecimal getChgValue() {
		return chgValue;
	}

	public void setChgValue(BigDecimal chgValue) {
		this.chgValue = chgValue;
	}

	public String getChgVatCode() {
		return chgVatCode;
	}

	public void setChgVatCode(String chgVatCode) {
		this.chgVatCode = chgVatCode;
	}

	public String getChgNcode() {
		return chgNcode;
	}

	public void setChgNcode(String chgNcode) {
		this.chgNcode = chgNcode;
	}

	public String getChgNetid() {
		return chgNetid;
	}

	public void setChgNetid(String chgNetid) {
		this.chgNetid = chgNetid;
	}

	public String getChgChargef() {
		return chgChargef;
	}

	public void setChgChargef(String chgChargef) {
		this.chgChargef = chgChargef;
	}

	public String getChgPeriod() {
		return chgPeriod;
	}

	public void setChgPeriod(String chgPeriod) {
		this.chgPeriod = chgPeriod;
	}

	public Short getChgFrequency() {
		return chgFrequency;
	}

	public void setChgFrequency(Short chgFrequency) {
		this.chgFrequency = chgFrequency;
	}

	public Date getChgEffectiveDate() {
		return chgEffectiveDate;
	}

	public void setChgEffectiveDate(Date chgEffectiveDate) {
		this.chgEffectiveDate = chgEffectiveDate;
	}

	public Integer getChgClassId() {
		return chgClassId;
	}

	public void setChgClassId(Integer chgClassId) {
		this.chgClassId = chgClassId;
	}

}
