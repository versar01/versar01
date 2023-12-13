package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.base.blo.ChgChargesDMO;
import com.eppixcomm.eppix.base.blo.DibDiscountBandDMO;
import com.eppixcomm.eppix.base.blo.DipDiscountPlanDMO;
import com.eppixcomm.eppix.base.blo.DirDiscountRuleDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SdiDipDirDibChgDQO extends DBO implements Serializable {

	SdiSubsDiscountDMO sdiDMO;
	DipDiscountPlanDMO dipDMO;
	DirDiscountRuleDMO dirDMO;
	DibDiscountBandDMO dibDMO;
	ChgChargesDMO chgDMO;

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
	private Integer dipDiscountId;
	private Short dipSequence;
	private Integer dipRuleRef;
	private Integer dirRuleId;
	private Integer dirRuleRef;
	private DateTime dirStartDate;
	private DateTime dirEndDate;
	private String dirRuleDesc;
	private String dirRuleType;
	private Short dirStartAfter;
	private Short dirApplyFor;
	private String dirTypeCode;
	private Integer dirUomId;
	private Short dirApplyEvery;
	private Short dirFilterAcc;
	private Short dirFilterLegal;
	private Short dirFilterPackage;
	private Short dirFilterTariff;
	private String dirPercentCount;
	private String dirOnceOffFee;
	private String dirBandType;
	private Integer dirThresholdId;
	private Integer dirAppDiscId;
	private String dirChargeRef;
	private Integer dirRuleUsed;
	private String dirAppToVal;
	private BigDecimal dirPercentSplit;
	private Short dirInvDisplay;
	private Integer dibBandId;
	private Integer dibRuleId;
	private BigDecimal dibBandEnd;
	private String dibDiscType;
	private BigDecimal dibDiscValue;
	private BigDecimal dibMaxDiscount;
	private String dibLimitDisc;
	private String dibChargeRef;
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
	private static final int sdiTariffPlanSize = 3;

	public static final int sdiServiceCodeFilter = 10;
	private static final int sdiServiceCodeSize = 4;

	public static final int sdiPaymentTypeFilter = 11;
	private static final int sdiPaymentTypeSize = 5;

	public static final int sdiAccountTypeFilter = 12;
	private static final int sdiAccountTypeSize = 5;

	public static final int sdiDiscountUptoFilter = 13;

	public static final int dipDiscountIdFilter = 14;

	public static final int dipSequenceFilter = 15;

	public static final int dipRuleRefFilter = 16;

	public static final int dirRuleIdFilter = 17;

	public static final int dirRuleRefFilter = 18;

	public static final int dirStartDateFilter = 19;

	public static final int dirEndDateFilter = 20;

	public static final int dirRuleDescFilter = 21;
	private static final int dirRuleDescSize = 50;

	public static final int dirRuleTypeFilter = 22;
	private static final int dirRuleTypeSize = 1;

	public static final int dirStartAfterFilter = 23;

	public static final int dirApplyForFilter = 24;

	public static final int dirTypeCodeFilter = 25;
	private static final int dirTypeCodeSize = 2;

	public static final int dirUomIdFilter = 26;

	public static final int dirApplyEveryFilter = 27;

	public static final int dirFilterAccFilter = 28;

	public static final int dirFilterLegalFilter = 29;

	public static final int dirFilterPackageFilter = 30;

	public static final int dirFilterTariffFilter = 31;

	public static final int dirPercentCountFilter = 32;
	private static final int dirPercentCountSize = 1;

	public static final int dirOnceOffFeeFilter = 33;
	private static final int dirOnceOffFeeSize = 1;

	public static final int dirBandTypeFilter = 34;
	private static final int dirBandTypeSize = 1;

	public static final int dirThresholdIdFilter = 35;

	public static final int dirAppDiscIdFilter = 36;

	public static final int dirChargeRefFilter = 37;
	private static final int dirChargeRefSize = 5;

	public static final int dirRuleUsedFilter = 38;

	public static final int dirAppToValFilter = 39;
	private static final int dirAppToValSize = 1;

	public static final int dirPercentSplitFilter = 40;

	public static final int dirInvDisplayFilter = 41;

	public static final int dibBandIdFilter = 42;

	public static final int dibRuleIdFilter = 43;

	public static final int dibBandEndFilter = 44;

	public static final int dibDiscTypeFilter = 45;
	private static final int dibDiscTypeSize = 1;

	public static final int dibDiscValueFilter = 46;

	public static final int dibMaxDiscountFilter = 47;

	public static final int dibLimitDiscFilter = 48;
	private static final int dibLimitDiscSize = 1;

	public static final int dibChargeRefFilter = 49;
	private static final int dibChargeRefSize = 5;

	public static final int chgCodeFilter = 50;
	private static final int chgCodeSize = 5;

	public static final int chgDescriptionFilter = 51;
	private static final int chgDescriptionSize = 32;

	public static final int chgValueFilter = 52;

	public static final int chgVatCodeFilter = 53;
	private static final int chgVatCodeSize = 1;

	public static final int chgNcodeFilter = 54;
	private static final int chgNcodeSize = 20;

	public static final int chgNetidFilter = 55;
	private static final int chgNetidSize = 5;

	public static final int chgChargefFilter = 56;
	private static final int chgChargefSize = 1;

	public static final int chgPeriodFilter = 57;
	private static final int chgPeriodSize = 1;

	public static final int chgFrequencyFilter = 58;

	public static final int chgEffectiveDateFilter = 59;

	public static final int chgClassIdFilter = 60;

	public SdiDipDirDibChgDQO() {
	};

	public SdiDipDirDibChgDQO(final Integer sdiSubDiscId,
			final Integer sdiSubscriberId, final Integer sdiDiscountId,
			final Date sdiStartDate, final Date sdiEndDate,
			final Date sdiSuspendDate, final Integer sdiQualId,
			final String sdiQualType, final String sdiPackageCode,
			final String sdiTariffPlan, final String sdiServiceCode,
			final String sdiPaymentType, final String sdiAccountType,
			final Date sdiDiscountUpto, final Integer dipDiscountId,
			final Short dipSequence, final Integer dipRuleRef,
			final Integer dirRuleId, final Integer dirRuleRef,
			final DateTime dirStartDate, final DateTime dirEndDate,
			final String dirRuleDesc, final String dirRuleType,
			final Short dirStartAfter, final Short dirApplyFor,
			final String dirTypeCode, final Integer dirUomId,
			final Short dirApplyEvery, final Short dirFilterAcc,
			final Short dirFilterLegal, final Short dirFilterPackage,
			final Short dirFilterTariff, final String dirPercentCount,
			final String dirOnceOffFee, final String dirBandType,
			final Integer dirThresholdId, final Integer dirAppDiscId,
			final String dirChargeRef, final Integer dirRuleUsed,
			final String dirAppToVal, final BigDecimal dirPercentSplit,
			final Short dirInvDisplay, final Integer dibBandId,
			final Integer dibRuleId, final BigDecimal dibBandEnd,
			final String dibDiscType, final BigDecimal dibDiscValue,
			final BigDecimal dibMaxDiscount, final String dibLimitDisc,
			final String dibChargeRef, final String chgCode,
			final String chgDescription, final BigDecimal chgValue,
			final String chgVatCode, final String chgNcode,
			final String chgNetid, final String chgChargef,
			final String chgPeriod, final Short chgFrequency,
			final Date chgEffectiveDate, final Integer chgClassId) {

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
		this.dipDiscountId = dipDiscountId;
		this.dipSequence = dipSequence;
		this.dipRuleRef = dipRuleRef;
		this.dirRuleId = dirRuleId;
		this.dirRuleRef = dirRuleRef;
		this.dirStartDate = dirStartDate;
		this.dirEndDate = dirEndDate;
		this.dirRuleDesc = dirRuleDesc;
		this.dirRuleType = dirRuleType;
		this.dirStartAfter = dirStartAfter;
		this.dirApplyFor = dirApplyFor;
		this.dirTypeCode = dirTypeCode;
		this.dirUomId = dirUomId;
		this.dirApplyEvery = dirApplyEvery;
		this.dirFilterAcc = dirFilterAcc;
		this.dirFilterLegal = dirFilterLegal;
		this.dirFilterPackage = dirFilterPackage;
		this.dirFilterTariff = dirFilterTariff;
		this.dirPercentCount = dirPercentCount;
		this.dirOnceOffFee = dirOnceOffFee;
		this.dirBandType = dirBandType;
		this.dirThresholdId = dirThresholdId;
		this.dirAppDiscId = dirAppDiscId;
		this.dirChargeRef = dirChargeRef;
		this.dirRuleUsed = dirRuleUsed;
		this.dirAppToVal = dirAppToVal;
		this.dirPercentSplit = dirPercentSplit;
		this.dirInvDisplay = dirInvDisplay;
		this.dibBandId = dibBandId;
		this.dibRuleId = dibRuleId;
		this.dibBandEnd = dibBandEnd;
		this.dibDiscType = dibDiscType;
		this.dibDiscValue = dibDiscValue;
		this.dibMaxDiscount = dibMaxDiscount;
		this.dibLimitDisc = dibLimitDisc;
		this.dibChargeRef = dibChargeRef;
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

	public void deConstruct(){
		sdiDMO = new SdiSubsDiscountDMO(sdiSubDiscId, sdiSubscriberId, sdiDiscountId, sdiStartDate, sdiEndDate, sdiSuspendDate, sdiQualId, sdiQualType, sdiPackageCode, sdiTariffPlan, sdiServiceCode, sdiPaymentType, sdiAccountType, sdiDiscountUpto);

		dipDMO = new DipDiscountPlanDMO(dipDiscountId, dipSequence, dipRuleRef);

		dirDMO = new DirDiscountRuleDMO(dirRuleId, dirRuleRef, dirStartDate, dirEndDate, dirRuleDesc, dirRuleType, dirStartAfter, dirApplyFor, dirTypeCode, dirUomId, dirApplyEvery, dirFilterAcc, dirFilterLegal, dirFilterPackage, dirFilterTariff, dirPercentCount, dirOnceOffFee, dirBandType, dirThresholdId, dirAppDiscId, dirChargeRef, dirRuleUsed, dirAppToVal, dirPercentSplit, dirInvDisplay);

		dibDMO = new DibDiscountBandDMO(dibBandId, dibRuleId, dibBandEnd, dibDiscType, dibDiscValue, dibMaxDiscount, dibLimitDisc, dibChargeRef);

		chgDMO = new ChgChargesDMO(chgCode, chgDescription, chgValue, chgVatCode, chgNcode, chgNetid, chgChargef, chgPeriod, chgFrequency, chgEffectiveDate, chgClassId);

	}

	private static final int[] fieldSizes = new int[] { 0, 0, 0, 0, 0, 0, 0,
			sdiQualTypeSize, sdiPackageCodeSize, sdiTariffPlanSize,
			sdiServiceCodeSize, sdiPaymentTypeSize, sdiAccountTypeSize, 0, 0,
			0, 0, 0, 0, 0, 0, dirRuleDescSize, dirRuleTypeSize, 0, 0,
			dirTypeCodeSize, 0, 0, 0, 0, 0, 0, dirPercentCountSize,
			dirOnceOffFeeSize, dirBandTypeSize, 0, 0, dirChargeRefSize, 0,
			dirAppToValSize, 0, 0, 0, 0, 0, dibDiscTypeSize, 0, 0,
			dibLimitDiscSize, dibChargeRefSize, chgCodeSize,
			chgDescriptionSize, 0, chgVatCodeSize, chgNcodeSize, chgNetidSize,
			chgChargefSize, chgPeriodSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_SHORT,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_SHORT, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER };

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
								this.sdiAccountTypeSize)),
				this.sdiDiscountUpto,
				this.dipDiscountId,
				this.dipSequence,
				this.dipRuleRef,
				this.dirRuleId,
				this.dirRuleRef,
				this.dirStartDate,
				this.dirEndDate,
				((this.dirRuleDesc == null) ? null
						: (this.dirRuleDesc.length() <= dirRuleDescSize) ? this.dirRuleDesc
								: this.dirRuleDesc.substring(0,
										this.dirRuleDescSize)),
				((this.dirRuleType == null) ? null
						: (this.dirRuleType.length() <= dirRuleTypeSize) ? this.dirRuleType
								: this.dirRuleType.substring(0,
										this.dirRuleTypeSize)),
				this.dirStartAfter,
				this.dirApplyFor,
				((this.dirTypeCode == null) ? null
						: (this.dirTypeCode.length() <= dirTypeCodeSize) ? this.dirTypeCode
								: this.dirTypeCode.substring(0,
										this.dirTypeCodeSize)),
				this.dirUomId,
				this.dirApplyEvery,
				this.dirFilterAcc,
				this.dirFilterLegal,
				this.dirFilterPackage,
				this.dirFilterTariff,
				((this.dirPercentCount == null) ? null
						: (this.dirPercentCount.length() <= dirPercentCountSize) ? this.dirPercentCount
								: this.dirPercentCount.substring(0,
										this.dirPercentCountSize)),
				((this.dirOnceOffFee == null) ? null : (this.dirOnceOffFee
						.length() <= dirOnceOffFeeSize) ? this.dirOnceOffFee
						: this.dirOnceOffFee.substring(0,
								this.dirOnceOffFeeSize)),
				((this.dirBandType == null) ? null
						: (this.dirBandType.length() <= dirBandTypeSize) ? this.dirBandType
								: this.dirBandType.substring(0,
										this.dirBandTypeSize)),
				this.dirThresholdId,
				this.dirAppDiscId,
				((this.dirChargeRef == null) ? null : (this.dirChargeRef
						.length() <= dirChargeRefSize) ? this.dirChargeRef
						: this.dirChargeRef.substring(0, this.dirChargeRefSize)),
				this.dirRuleUsed,
				((this.dirAppToVal == null) ? null
						: (this.dirAppToVal.length() <= dirAppToValSize) ? this.dirAppToVal
								: this.dirAppToVal.substring(0,
										this.dirAppToValSize)),
				this.dirPercentSplit,
				this.dirInvDisplay,
				this.dibBandId,
				this.dibRuleId,
				this.dibBandEnd,
				((this.dibDiscType == null) ? null
						: (this.dibDiscType.length() <= dibDiscTypeSize) ? this.dibDiscType
								: this.dibDiscType.substring(0,
										this.dibDiscTypeSize)),
				this.dibDiscValue,
				this.dibMaxDiscount,
				((this.dibLimitDisc == null) ? null : (this.dibLimitDisc
						.length() <= dibLimitDiscSize) ? this.dibLimitDisc
						: this.dibLimitDisc.substring(0, this.dibLimitDiscSize)),
				((this.dibChargeRef == null) ? null : (this.dibChargeRef
						.length() <= dibChargeRefSize) ? this.dibChargeRef
						: this.dibChargeRef.substring(0, this.dibChargeRefSize)),
				((this.chgCode == null) ? null
						: (this.chgCode.length() <= chgCodeSize) ? this.chgCode
								: this.chgCode.substring(0, this.chgCodeSize)),
				((this.chgDescription == null) ? null : (this.chgDescription
						.length() <= chgDescriptionSize) ? this.chgDescription
						: this.chgDescription.substring(0,
								this.chgDescriptionSize)),
				this.chgValue,
				((this.chgVatCode == null) ? null
						: (this.chgVatCode.length() <= chgVatCodeSize) ? this.chgVatCode
								: this.chgVatCode.substring(0,
										this.chgVatCodeSize)),
				((this.chgNcode == null) ? null
						: (this.chgNcode.length() <= chgNcodeSize) ? this.chgNcode
								: this.chgNcode.substring(0, this.chgNcodeSize)),
				((this.chgNetid == null) ? null
						: (this.chgNetid.length() <= chgNetidSize) ? this.chgNetid
								: this.chgNetid.substring(0, this.chgNetidSize)),
				((this.chgChargef == null) ? null
						: (this.chgChargef.length() <= chgChargefSize) ? this.chgChargef
								: this.chgChargef.substring(0,
										this.chgChargefSize)),
				((this.chgPeriod == null) ? null
						: (this.chgPeriod.length() <= chgPeriodSize) ? this.chgPeriod
								: this.chgPeriod.substring(0,
										this.chgPeriodSize)),
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
		this.dipDiscountId = ((Integer) fields[14]);
		this.dipSequence = ((Short) fields[15]);
		this.dipRuleRef = ((Integer) fields[16]);
		this.dirRuleId = ((Integer) fields[17]);
		this.dirRuleRef = ((Integer) fields[18]);
		this.dirStartDate = ((fields[19] == null) ? null : new DateTime(
				(DateTime) fields[19]));
		this.dirEndDate = ((fields[20] == null) ? null : new DateTime(
				(DateTime) fields[20]));
		this.dirRuleDesc = rtrim((String) fields[21]);
		this.dirRuleType = rtrim((String) fields[22]);
		this.dirStartAfter = ((Short) fields[23]);
		this.dirApplyFor = ((Short) fields[24]);
		this.dirTypeCode = rtrim((String) fields[25]);
		this.dirUomId = ((Integer) fields[26]);
		this.dirApplyEvery = ((Short) fields[27]);
		this.dirFilterAcc = ((Short) fields[28]);
		this.dirFilterLegal = ((Short) fields[29]);
		this.dirFilterPackage = ((Short) fields[30]);
		this.dirFilterTariff = ((Short) fields[31]);
		this.dirPercentCount = rtrim((String) fields[32]);
		this.dirOnceOffFee = rtrim((String) fields[33]);
		this.dirBandType = rtrim((String) fields[34]);
		this.dirThresholdId = ((Integer) fields[35]);
		this.dirAppDiscId = ((Integer) fields[36]);
		this.dirChargeRef = rtrim((String) fields[37]);
		this.dirRuleUsed = ((Integer) fields[38]);
		this.dirAppToVal = rtrim((String) fields[39]);
		this.dirPercentSplit = ((BigDecimal) fields[40]);
		this.dirInvDisplay = ((Short) fields[41]);
		this.dibBandId = ((Integer) fields[42]);
		this.dibRuleId = ((Integer) fields[43]);
		this.dibBandEnd = ((BigDecimal) fields[44]);
		this.dibDiscType = rtrim((String) fields[45]);
		this.dibDiscValue = ((BigDecimal) fields[46]);
		this.dibMaxDiscount = ((BigDecimal) fields[47]);
		this.dibLimitDisc = rtrim((String) fields[48]);
		this.dibChargeRef = rtrim((String) fields[49]);
		this.chgCode = rtrim((String) fields[50]);
		this.chgDescription = rtrim((String) fields[51]);
		this.chgValue = ((BigDecimal) fields[52]);
		this.chgVatCode = rtrim((String) fields[53]);
		this.chgNcode = rtrim((String) fields[54]);
		this.chgNetid = rtrim((String) fields[55]);
		this.chgChargef = rtrim((String) fields[56]);
		this.chgPeriod = rtrim((String) fields[57]);
		this.chgFrequency = ((Short) fields[58]);
		this.chgEffectiveDate = ((fields[59] == null) ? null : new Date(
				 fields[59]));
		this.chgClassId = ((Integer) fields[60]);
	}

	public void set(final Integer sdiSubDiscId, final Integer sdiSubscriberId,
			final Integer sdiDiscountId, final Date sdiStartDate,
			final Date sdiEndDate, final Date sdiSuspendDate,
			final Integer sdiQualId, final String sdiQualType,
			final String sdiPackageCode, final String sdiTariffPlan,
			final String sdiServiceCode, final String sdiPaymentType,
			final String sdiAccountType, final Date sdiDiscountUpto,
			final Integer dipDiscountId, final Short dipSequence,
			final Integer dipRuleRef, final Integer dirRuleId,
			final Integer dirRuleRef, final DateTime dirStartDate,
			final DateTime dirEndDate, final String dirRuleDesc,
			final String dirRuleType, final Short dirStartAfter,
			final Short dirApplyFor, final String dirTypeCode,
			final Integer dirUomId, final Short dirApplyEvery,
			final Short dirFilterAcc, final Short dirFilterLegal,
			final Short dirFilterPackage, final Short dirFilterTariff,
			final String dirPercentCount, final String dirOnceOffFee,
			final String dirBandType, final Integer dirThresholdId,
			final Integer dirAppDiscId, final String dirChargeRef,
			final Integer dirRuleUsed, final String dirAppToVal,
			final BigDecimal dirPercentSplit, final Short dirInvDisplay,
			final Integer dibBandId, final Integer dibRuleId,
			final BigDecimal dibBandEnd, final String dibDiscType,
			final BigDecimal dibDiscValue, final BigDecimal dibMaxDiscount,
			final String dibLimitDisc, final String dibChargeRef,
			final String chgCode, final String chgDescription,
			final BigDecimal chgValue, final String chgVatCode,
			final String chgNcode, final String chgNetid,
			final String chgChargef, final String chgPeriod,
			final Short chgFrequency, final Date chgEffectiveDate,
			final Integer chgClassId) {

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
		this.dipDiscountId = dipDiscountId;
		this.dipSequence = dipSequence;
		this.dipRuleRef = dipRuleRef;
		this.dirRuleId = dirRuleId;
		this.dirRuleRef = dirRuleRef;
		this.dirStartDate = dirStartDate;
		this.dirEndDate = dirEndDate;
		this.dirRuleDesc = dirRuleDesc;
		this.dirRuleType = dirRuleType;
		this.dirStartAfter = dirStartAfter;
		this.dirApplyFor = dirApplyFor;
		this.dirTypeCode = dirTypeCode;
		this.dirUomId = dirUomId;
		this.dirApplyEvery = dirApplyEvery;
		this.dirFilterAcc = dirFilterAcc;
		this.dirFilterLegal = dirFilterLegal;
		this.dirFilterPackage = dirFilterPackage;
		this.dirFilterTariff = dirFilterTariff;
		this.dirPercentCount = dirPercentCount;
		this.dirOnceOffFee = dirOnceOffFee;
		this.dirBandType = dirBandType;
		this.dirThresholdId = dirThresholdId;
		this.dirAppDiscId = dirAppDiscId;
		this.dirChargeRef = dirChargeRef;
		this.dirRuleUsed = dirRuleUsed;
		this.dirAppToVal = dirAppToVal;
		this.dirPercentSplit = dirPercentSplit;
		this.dirInvDisplay = dirInvDisplay;
		this.dibBandId = dibBandId;
		this.dibRuleId = dibRuleId;
		this.dibBandEnd = dibBandEnd;
		this.dibDiscType = dibDiscType;
		this.dibDiscValue = dibDiscValue;
		this.dibMaxDiscount = dibMaxDiscount;
		this.dibLimitDisc = dibLimitDisc;
		this.dibChargeRef = dibChargeRef;
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

	public SdiSubsDiscountDMO getSdiDMO() {
		return sdiDMO;
	}

	public void setSdiDMO(SdiSubsDiscountDMO sdiDMO) {
		this.sdiDMO = sdiDMO;
	}

	public DipDiscountPlanDMO getDipDMO() {
		return dipDMO;
	}

	public void setDipDMO(DipDiscountPlanDMO dipDMO) {
		this.dipDMO = dipDMO;
	}

	public DirDiscountRuleDMO getDirDMO() {
		return dirDMO;
	}

	public void setDirDMO(DirDiscountRuleDMO dirDMO) {
		this.dirDMO = dirDMO;
	}

	public DibDiscountBandDMO getDibDMO() {
		return dibDMO;
	}

	public void setDibDMO(DibDiscountBandDMO dibDMO) {
		this.dibDMO = dibDMO;
	}

	public ChgChargesDMO getChgDMO() {
		return chgDMO;
	}

	public void setChgDMO(ChgChargesDMO chgDMO) {
		this.chgDMO = chgDMO;
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

	public Integer getDipDiscountId() {
		return dipDiscountId;
	}

	public void setDipDiscountId(Integer dipDiscountId) {
		this.dipDiscountId = dipDiscountId;
	}

	public Short getDipSequence() {
		return dipSequence;
	}

	public void setDipSequence(Short dipSequence) {
		this.dipSequence = dipSequence;
	}

	public Integer getDipRuleRef() {
		return dipRuleRef;
	}

	public void setDipRuleRef(Integer dipRuleRef) {
		this.dipRuleRef = dipRuleRef;
	}

	public Integer getDirRuleId() {
		return dirRuleId;
	}

	public void setDirRuleId(Integer dirRuleId) {
		this.dirRuleId = dirRuleId;
	}

	public Integer getDirRuleRef() {
		return dirRuleRef;
	}

	public void setDirRuleRef(Integer dirRuleRef) {
		this.dirRuleRef = dirRuleRef;
	}

	public DateTime getDirStartDate() {
		return dirStartDate;
	}

	public void setDirStartDate(DateTime dirStartDate) {
		this.dirStartDate = dirStartDate;
	}

	public DateTime getDirEndDate() {
		return dirEndDate;
	}

	public void setDirEndDate(DateTime dirEndDate) {
		this.dirEndDate = dirEndDate;
	}

	public String getDirRuleDesc() {
		return dirRuleDesc;
	}

	public void setDirRuleDesc(String dirRuleDesc) {
		this.dirRuleDesc = dirRuleDesc;
	}

	public String getDirRuleType() {
		return dirRuleType;
	}

	public void setDirRuleType(String dirRuleType) {
		this.dirRuleType = dirRuleType;
	}

	public Short getDirStartAfter() {
		return dirStartAfter;
	}

	public void setDirStartAfter(Short dirStartAfter) {
		this.dirStartAfter = dirStartAfter;
	}

	public Short getDirApplyFor() {
		return dirApplyFor;
	}

	public void setDirApplyFor(Short dirApplyFor) {
		this.dirApplyFor = dirApplyFor;
	}

	public String getDirTypeCode() {
		return dirTypeCode;
	}

	public void setDirTypeCode(String dirTypeCode) {
		this.dirTypeCode = dirTypeCode;
	}

	public Integer getDirUomId() {
		return dirUomId;
	}

	public void setDirUomId(Integer dirUomId) {
		this.dirUomId = dirUomId;
	}

	public Short getDirApplyEvery() {
		return dirApplyEvery;
	}

	public void setDirApplyEvery(Short dirApplyEvery) {
		this.dirApplyEvery = dirApplyEvery;
	}

	public Short getDirFilterAcc() {
		return dirFilterAcc;
	}

	public void setDirFilterAcc(Short dirFilterAcc) {
		this.dirFilterAcc = dirFilterAcc;
	}

	public Short getDirFilterLegal() {
		return dirFilterLegal;
	}

	public void setDirFilterLegal(Short dirFilterLegal) {
		this.dirFilterLegal = dirFilterLegal;
	}

	public Short getDirFilterPackage() {
		return dirFilterPackage;
	}

	public void setDirFilterPackage(Short dirFilterPackage) {
		this.dirFilterPackage = dirFilterPackage;
	}

	public Short getDirFilterTariff() {
		return dirFilterTariff;
	}

	public void setDirFilterTariff(Short dirFilterTariff) {
		this.dirFilterTariff = dirFilterTariff;
	}

	public String getDirPercentCount() {
		return dirPercentCount;
	}

	public void setDirPercentCount(String dirPercentCount) {
		this.dirPercentCount = dirPercentCount;
	}

	public String getDirOnceOffFee() {
		return dirOnceOffFee;
	}

	public void setDirOnceOffFee(String dirOnceOffFee) {
		this.dirOnceOffFee = dirOnceOffFee;
	}

	public String getDirBandType() {
		return dirBandType;
	}

	public void setDirBandType(String dirBandType) {
		this.dirBandType = dirBandType;
	}

	public Integer getDirThresholdId() {
		return dirThresholdId;
	}

	public void setDirThresholdId(Integer dirThresholdId) {
		this.dirThresholdId = dirThresholdId;
	}

	public Integer getDirAppDiscId() {
		return dirAppDiscId;
	}

	public void setDirAppDiscId(Integer dirAppDiscId) {
		this.dirAppDiscId = dirAppDiscId;
	}

	public String getDirChargeRef() {
		return dirChargeRef;
	}

	public void setDirChargeRef(String dirChargeRef) {
		this.dirChargeRef = dirChargeRef;
	}

	public Integer getDirRuleUsed() {
		return dirRuleUsed;
	}

	public void setDirRuleUsed(Integer dirRuleUsed) {
		this.dirRuleUsed = dirRuleUsed;
	}

	public String getDirAppToVal() {
		return dirAppToVal;
	}

	public void setDirAppToVal(String dirAppToVal) {
		this.dirAppToVal = dirAppToVal;
	}

	public BigDecimal getDirPercentSplit() {
		return dirPercentSplit;
	}

	public void setDirPercentSplit(BigDecimal dirPercentSplit) {
		this.dirPercentSplit = dirPercentSplit;
	}

	public Short getDirInvDisplay() {
		return dirInvDisplay;
	}

	public void setDirInvDisplay(Short dirInvDisplay) {
		this.dirInvDisplay = dirInvDisplay;
	}

	public Integer getDibBandId() {
		return dibBandId;
	}

	public void setDibBandId(Integer dibBandId) {
		this.dibBandId = dibBandId;
	}

	public Integer getDibRuleId() {
		return dibRuleId;
	}

	public void setDibRuleId(Integer dibRuleId) {
		this.dibRuleId = dibRuleId;
	}

	public BigDecimal getDibBandEnd() {
		return dibBandEnd;
	}

	public void setDibBandEnd(BigDecimal dibBandEnd) {
		this.dibBandEnd = dibBandEnd;
	}

	public String getDibDiscType() {
		return dibDiscType;
	}

	public void setDibDiscType(String dibDiscType) {
		this.dibDiscType = dibDiscType;
	}

	public BigDecimal getDibDiscValue() {
		return dibDiscValue;
	}

	public void setDibDiscValue(BigDecimal dibDiscValue) {
		this.dibDiscValue = dibDiscValue;
	}

	public BigDecimal getDibMaxDiscount() {
		return dibMaxDiscount;
	}

	public void setDibMaxDiscount(BigDecimal dibMaxDiscount) {
		this.dibMaxDiscount = dibMaxDiscount;
	}

	public String getDibLimitDisc() {
		return dibLimitDisc;
	}

	public void setDibLimitDisc(String dibLimitDisc) {
		this.dibLimitDisc = dibLimitDisc;
	}

	public String getDibChargeRef() {
		return dibChargeRef;
	}

	public void setDibChargeRef(String dibChargeRef) {
		this.dibChargeRef = dibChargeRef;
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
