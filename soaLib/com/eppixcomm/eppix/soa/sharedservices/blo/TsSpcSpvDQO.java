package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SpvParamValuesDMO;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TsSpcSpvDQO extends DBO implements Serializable {

	private TsTariffServiceDMO tsDMO = null;
	private SpcParamConfigDMO spcDMO = null;
	private SpvParamValuesDMO spvDMO = null;

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
	private Integer spcParamId;
	private String spcParamName;
	private String spcServiceCode;
	private String spcServiceType;
	private String spcLockToTariff;
	private String spcLockToPack;
	private String spcValueType;
	private String spcExclusionRule;
	private String spcLegalEntity;
	private Integer spcContrPeriod;
	private String spcCanTerm;
	private String spcTaxInv;
	private String spcParamProrata;
	private String spcNodeString;
	private Integer spvParamId;
	private String spvParamValue;
	private String spvActCharge;
	private String spvChargeCode;
	private String spvDefaultValue;
	private String spvNetwrkCode;

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

	public static final int spcParamIdFilter = 15;
	private static final int spcParamIdSize = 397;

	public static final int spcParamNameFilter = 16;
	private static final int spcParamNameSize = 20;

	public static final int spcServiceCodeFilter = 17;
	private static final int spcServiceCodeSize = 4;

	public static final int spcServiceTypeFilter = 18;
	private static final int spcServiceTypeSize = 5;

	public static final int spcLockToTariffFilter = 19;
	private static final int spcLockToTariffSize = 1;

	public static final int spcLockToPackFilter = 20;
	private static final int spcLockToPackSize = 1;

	public static final int spcValueTypeFilter = 21;
	private static final int spcValueTypeSize = 1;

	public static final int spcExclusionRuleFilter = 22;
	private static final int spcExclusionRuleSize = 1;

	public static final int spcLegalEntityFilter = 23;
	private static final int spcLegalEntitySize = 1;

	public static final int spcContrPeriodFilter = 24;

	public static final int spcCanTermFilter = 25;
	private static final int spcCanTermSize = 1;

	public static final int spcTaxInvFilter = 26;
	private static final int spcTaxInvSize = 1;

	public static final int spcParamProrataFilter = 27;
	private static final int spcParamProrataSize = 1;

	public static final int spcNodeStringFilter = 28;
	private static final int spcNodeStringSize = 1;

	public static final int spvParamIdFilter = 29;

	public static final int spvParamValueFilter = 30;
	private static final int spvParamValueSize = 20;

	public static final int spvActChargeFilter = 31;
	private static final int spvActChargeSize = 5;

	public static final int spvChargeCodeFilter = 32;
	private static final int spvChargeCodeSize = 5;

	public static final int spvDefaultValueFilter = 33;
	private static final int spvDefaultValueSize = 1;

	public static final int spvNetwrkCodeFilter = 34;
	private static final int spvNetwrkCodeSize = 15;

	public TsSpcSpvDQO() {
	};

	public TsSpcSpvDQO(final String tsPackageCode, final String tsInternalTariff, final String tsServiceCode,
			final String tsNetServCode, final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge, final String tsSubCharge1,
			final String tsSubCharge2, final String tsSubCharge3, final String tsChargePeriod, final Short tsChargeFreq,
			final String tsDiscountRef, final String tsActInclusive, final Integer spcParamId,
			final String spcParamName, final String spcServiceCode, final String spcServiceType,
			final String spcLockToTariff, final String spcLockToPack, final String spcValueType,
			final String spcExclusionRule, final String spcLegalEntity, final Integer spcContrPeriod,
			final String spcCanTerm, final String spcTaxInv, final String spcParamProrata, final String spcNodeString,
			final Integer spvParamId, final String spvParamValue, final String spvActCharge, final String spvChargeCode,
			final String spvDefaultValue, final String spvNetwrkCode) {

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
		this.spcParamId = spcParamId;
		this.spcParamName = spcParamName;
		this.spcServiceCode = spcServiceCode;
		this.spcServiceType = spcServiceType;
		this.spcLockToTariff = spcLockToTariff;
		this.spcLockToPack = spcLockToPack;
		this.spcValueType = spcValueType;
		this.spcExclusionRule = spcExclusionRule;
		this.spcLegalEntity = spcLegalEntity;
		this.spcContrPeriod = spcContrPeriod;
		this.spcCanTerm = spcCanTerm;
		this.spcTaxInv = spcTaxInv;
		this.spcParamProrata = spcParamProrata;
		this.spcNodeString = spcNodeString;
		this.spvParamId = spvParamId;
		this.spvParamValue = spvParamValue;
		this.spvActCharge = spvActCharge;
		this.spvChargeCode = spvChargeCode;
		this.spvDefaultValue = spvDefaultValue;
		this.spvNetwrkCode = spvNetwrkCode;
	};
	
	private void deConstruct() {
		tsDMO = new TsTariffServiceDMO(tsPackageCode, tsInternalTariff, tsServiceCode, tsNetServCode, tsActCharge, tsTdeactCharge, tsReactCharge, tsPdeactCharge, tsSubCharge1, tsSubCharge2, tsSubCharge3, tsChargePeriod, tsChargeFreq, tsDiscountRef, tsActInclusive);
		spcDMO = new SpcParamConfigDMO(spcParamId, spcParamName, spcServiceCode, spcServiceType, spcLockToTariff, spcLockToPack, spcValueType, spcExclusionRule, spcLegalEntity, spcContrPeriod, spcCanTerm, spcTaxInv, spcParamProrata, spcNodeString);
		spvDMO = new SpvParamValuesDMO(spvParamId, spvParamValue, spvActCharge, spvChargeCode, spvDefaultValue, spvNetwrkCode);
	}

	private static final int[] fieldSizes = new int[] { tsPackageCodeSize, tsInternalTariffSize, tsServiceCodeSize,
			tsNetServCodeSize, tsActChargeSize, tsTdeactChargeSize, tsReactChargeSize, tsPdeactChargeSize,
			tsSubCharge1Size, tsSubCharge2Size, tsSubCharge3Size, tsChargePeriodSize, 0, tsDiscountRefSize,
			tsActInclusiveSize, spcParamIdSize, spcParamNameSize, spcServiceCodeSize, spcServiceTypeSize,
			spcLockToTariffSize, spcLockToPackSize, spcValueTypeSize, spcExclusionRuleSize, spcLegalEntitySize, 0,
			spcCanTermSize, spcTaxInvSize, spcParamProrataSize, spcNodeStringSize, 0, spvParamValueSize,
			spvActChargeSize, spvChargeCodeSize, spvDefaultValueSize, spvNetwrkCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

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
				this.spcParamId == null,
				((this.spcParamName == null) ? null
						: (this.spcParamName.length() <= spcParamNameSize) ? this.spcParamName
								: this.spcParamName.substring(0, this.spcParamNameSize)),
				((this.spcServiceCode == null) ? null
						: (this.spcServiceCode.length() <= spcServiceCodeSize) ? this.spcServiceCode
								: this.spcServiceCode.substring(0, this.spcServiceCodeSize)),
				((this.spcServiceType == null) ? null
						: (this.spcServiceType.length() <= spcServiceTypeSize) ? this.spcServiceType
								: this.spcServiceType.substring(0, this.spcServiceTypeSize)),
				((this.spcLockToTariff == null) ? null
						: (this.spcLockToTariff.length() <= spcLockToTariffSize) ? this.spcLockToTariff
								: this.spcLockToTariff.substring(0, this.spcLockToTariffSize)),
				((this.spcLockToPack == null) ? null
						: (this.spcLockToPack.length() <= spcLockToPackSize) ? this.spcLockToPack
								: this.spcLockToPack.substring(0, this.spcLockToPackSize)),
				((this.spcValueType == null) ? null
						: (this.spcValueType.length() <= spcValueTypeSize) ? this.spcValueType
								: this.spcValueType.substring(0, this.spcValueTypeSize)),
				((this.spcExclusionRule == null) ? null
						: (this.spcExclusionRule.length() <= spcExclusionRuleSize) ? this.spcExclusionRule
								: this.spcExclusionRule.substring(0, this.spcExclusionRuleSize)),
				((this.spcLegalEntity == null) ? null
						: (this.spcLegalEntity.length() <= spcLegalEntitySize) ? this.spcLegalEntity
								: this.spcLegalEntity.substring(0, this.spcLegalEntitySize)),
				this.spcContrPeriod,
				((this.spcCanTerm == null) ? null
						: (this.spcCanTerm.length() <= spcCanTermSize) ? this.spcCanTerm
								: this.spcCanTerm.substring(0, this.spcCanTermSize)),
				((this.spcTaxInv == null) ? null
						: (this.spcTaxInv.length() <= spcTaxInvSize) ? this.spcTaxInv
								: this.spcTaxInv.substring(0, this.spcTaxInvSize)),
				((this.spcParamProrata == null) ? null
						: (this.spcParamProrata.length() <= spcParamProrataSize) ? this.spcParamProrata
								: this.spcParamProrata.substring(0, this.spcParamProrataSize)),
				((this.spcNodeString == null) ? null
						: (this.spcNodeString.length() <= spcNodeStringSize) ? this.spcNodeString
								: this.spcNodeString.substring(0, this.spcNodeStringSize)),
				this.spvParamId,
				((this.spvParamValue == null) ? null
						: (this.spvParamValue.length() <= spvParamValueSize) ? this.spvParamValue
								: this.spvParamValue.substring(0, this.spvParamValueSize)),
				((this.spvActCharge == null) ? null
						: (this.spvActCharge.length() <= spvActChargeSize) ? this.spvActCharge
								: this.spvActCharge.substring(0, this.spvActChargeSize)),
				((this.spvChargeCode == null) ? null
						: (this.spvChargeCode.length() <= spvChargeCodeSize) ? this.spvChargeCode
								: this.spvChargeCode.substring(0, this.spvChargeCodeSize)),
				((this.spvDefaultValue == null) ? null
						: (this.spvDefaultValue.length() <= spvDefaultValueSize) ? this.spvDefaultValue
								: this.spvDefaultValue.substring(0, this.spvDefaultValueSize)),
				((this.spvNetwrkCode == null) ? null
						: (this.spvNetwrkCode.length() <= spvNetwrkCodeSize) ? this.spvNetwrkCode
								: this.spvNetwrkCode.substring(0, this.spvNetwrkCodeSize)) };
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

		this.spcParamId = (Integer) fields[15];

		this.spcParamName = rtrim((String) fields[16]);

		this.spcServiceCode = rtrim((String) fields[17]);

		this.spcServiceType = rtrim((String) fields[18]);

		this.spcLockToTariff = rtrim((String) fields[19]);

		this.spcLockToPack = rtrim((String) fields[20]);

		this.spcValueType = rtrim((String) fields[21]);

		this.spcExclusionRule = rtrim((String) fields[22]);

		this.spcLegalEntity = rtrim((String) fields[23]);

		this.spcContrPeriod = ((Integer) fields[24]);
		this.spcCanTerm = rtrim((String) fields[25]);

		this.spcTaxInv = rtrim((String) fields[26]);

		this.spcParamProrata = rtrim((String) fields[27]);

		this.spcNodeString = rtrim((String) fields[28]);

		this.spvParamId = ((Integer) fields[29]);
		this.spvParamValue = rtrim((String) fields[30]);

		this.spvActCharge = rtrim((String) fields[31]);

		this.spvChargeCode = rtrim((String) fields[32]);

		this.spvDefaultValue = rtrim((String) fields[33]);

		this.spvNetwrkCode = rtrim((String) fields[34]);

	}

	public void set(final String tsPackageCode, final String tsInternalTariff, final String tsServiceCode,
			final String tsNetServCode, final String tsActCharge, final String tsTdeactCharge,
			final String tsReactCharge, final String tsPdeactCharge, final String tsSubCharge1,
			final String tsSubCharge2, final String tsSubCharge3, final String tsChargePeriod, final Short tsChargeFreq,
			final String tsDiscountRef, final String tsActInclusive, final Integer spcParamId,
			final String spcParamName, final String spcServiceCode, final String spcServiceType,
			final String spcLockToTariff, final String spcLockToPack, final String spcValueType,
			final String spcExclusionRule, final String spcLegalEntity, final Integer spcContrPeriod,
			final String spcCanTerm, final String spcTaxInv, final String spcParamProrata, final String spcNodeString,
			final Integer spvParamId, final String spvParamValue, final String spvActCharge, final String spvChargeCode,
			final String spvDefaultValue, final String spvNetwrkCode) {

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
		this.spcParamId = spcParamId;
		this.spcParamName = spcParamName;
		this.spcServiceCode = spcServiceCode;
		this.spcServiceType = spcServiceType;
		this.spcLockToTariff = spcLockToTariff;
		this.spcLockToPack = spcLockToPack;
		this.spcValueType = spcValueType;
		this.spcExclusionRule = spcExclusionRule;
		this.spcLegalEntity = spcLegalEntity;
		this.spcContrPeriod = spcContrPeriod;
		this.spcCanTerm = spcCanTerm;
		this.spcTaxInv = spcTaxInv;
		this.spcParamProrata = spcParamProrata;
		this.spcNodeString = spcNodeString;
		this.spvParamId = spvParamId;
		this.spvParamValue = spvParamValue;
		this.spvActCharge = spvActCharge;
		this.spvChargeCode = spvChargeCode;
		this.spvDefaultValue = spvDefaultValue;
		this.spvNetwrkCode = spvNetwrkCode;
	}

	public TsTariffServiceDMO getTsDMO() {
		return tsDMO;
	}

	public void setTsDMO(TsTariffServiceDMO tsDMO) {
		this.tsDMO = tsDMO;
	}

	public SpcParamConfigDMO getSpcDMO() {
		return spcDMO;
	}

	public void setSpcDMO(SpcParamConfigDMO spcDMO) {
		this.spcDMO = spcDMO;
	}

	public SpvParamValuesDMO getSpvDMO() {
		return spvDMO;
	}

	public void setSpvDMO(SpvParamValuesDMO spvDMO) {
		this.spvDMO = spvDMO;
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

	public Integer getSpcParamId() {
		return spcParamId;
	}

	public void setSpcParamId(Integer spcParamId) {
		this.spcParamId = spcParamId;
	}

	public String getSpcParamName() {
		return spcParamName;
	}

	public void setSpcParamName(String spcParamName) {
		this.spcParamName = spcParamName;
	}

	public String getSpcServiceCode() {
		return spcServiceCode;
	}

	public void setSpcServiceCode(String spcServiceCode) {
		this.spcServiceCode = spcServiceCode;
	}

	public String getSpcServiceType() {
		return spcServiceType;
	}

	public void setSpcServiceType(String spcServiceType) {
		this.spcServiceType = spcServiceType;
	}

	public String getSpcLockToTariff() {
		return spcLockToTariff;
	}

	public void setSpcLockToTariff(String spcLockToTariff) {
		this.spcLockToTariff = spcLockToTariff;
	}

	public String getSpcLockToPack() {
		return spcLockToPack;
	}

	public void setSpcLockToPack(String spcLockToPack) {
		this.spcLockToPack = spcLockToPack;
	}

	public String getSpcValueType() {
		return spcValueType;
	}

	public void setSpcValueType(String spcValueType) {
		this.spcValueType = spcValueType;
	}

	public String getSpcExclusionRule() {
		return spcExclusionRule;
	}

	public void setSpcExclusionRule(String spcExclusionRule) {
		this.spcExclusionRule = spcExclusionRule;
	}

	public String getSpcLegalEntity() {
		return spcLegalEntity;
	}

	public void setSpcLegalEntity(String spcLegalEntity) {
		this.spcLegalEntity = spcLegalEntity;
	}

	public Integer getSpcContrPeriod() {
		return spcContrPeriod;
	}

	public void setSpcContrPeriod(Integer spcContrPeriod) {
		this.spcContrPeriod = spcContrPeriod;
	}

	public String getSpcCanTerm() {
		return spcCanTerm;
	}

	public void setSpcCanTerm(String spcCanTerm) {
		this.spcCanTerm = spcCanTerm;
	}

	public String getSpcTaxInv() {
		return spcTaxInv;
	}

	public void setSpcTaxInv(String spcTaxInv) {
		this.spcTaxInv = spcTaxInv;
	}

	public String getSpcParamProrata() {
		return spcParamProrata;
	}

	public void setSpcParamProrata(String spcParamProrata) {
		this.spcParamProrata = spcParamProrata;
	}

	public String getSpcNodeString() {
		return spcNodeString;
	}

	public void setSpcNodeString(String spcNodeString) {
		this.spcNodeString = spcNodeString;
	}

	public Integer getSpvParamId() {
		return spvParamId;
	}

	public void setSpvParamId(Integer spvParamId) {
		this.spvParamId = spvParamId;
	}

	public String getSpvParamValue() {
		return spvParamValue;
	}

	public void setSpvParamValue(String spvParamValue) {
		this.spvParamValue = spvParamValue;
	}

	public String getSpvActCharge() {
		return spvActCharge;
	}

	public void setSpvActCharge(String spvActCharge) {
		this.spvActCharge = spvActCharge;
	}

	public String getSpvChargeCode() {
		return spvChargeCode;
	}

	public void setSpvChargeCode(String spvChargeCode) {
		this.spvChargeCode = spvChargeCode;
	}

	public String getSpvDefaultValue() {
		return spvDefaultValue;
	}

	public void setSpvDefaultValue(String spvDefaultValue) {
		this.spvDefaultValue = spvDefaultValue;
	}

	public String getSpvNetwrkCode() {
		return spvNetwrkCode;
	}

	public void setSpvNetwrkCode(String spvNetwrkCode) {
		this.spvNetwrkCode = spvNetwrkCode;
	}

}
