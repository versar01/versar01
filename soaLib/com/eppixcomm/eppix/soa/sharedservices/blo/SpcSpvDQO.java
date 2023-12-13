package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SpcParamConfigDMO;
import com.eppixcomm.eppix.base.blo.SpvParamValuesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SpcSpvDQO extends DBO implements Serializable {

	private SpcParamConfigDMO spcDMO = null;
	private SpvParamValuesDMO spvDMO = null;
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

	public static final int spcParamIdFilter = 0;
	private static final int spcParamIdSize = 397;

	public static final int spcParamNameFilter = 1;
	private static final int spcParamNameSize = 20;

	public static final int spcServiceCodeFilter = 2;
	private static final int spcServiceCodeSize = 4;

	public static final int spcServiceTypeFilter = 3;
	private static final int spcServiceTypeSize = 5;

	public static final int spcLockToTariffFilter = 4;
	private static final int spcLockToTariffSize = 1;

	public static final int spcLockToPackFilter = 5;
	private static final int spcLockToPackSize = 1;

	public static final int spcValueTypeFilter = 6;
	private static final int spcValueTypeSize = 1;

	public static final int spcExclusionRuleFilter = 7;
	private static final int spcExclusionRuleSize = 1;

	public static final int spcLegalEntityFilter = 8;
	private static final int spcLegalEntitySize = 1;

	public static final int spcContrPeriodFilter = 9;

	public static final int spcCanTermFilter = 10;
	private static final int spcCanTermSize = 1;

	public static final int spcTaxInvFilter = 11;
	private static final int spcTaxInvSize = 1;

	public static final int spcParamProrataFilter = 12;
	private static final int spcParamProrataSize = 1;

	public static final int spcNodeStringFilter = 13;
	private static final int spcNodeStringSize = 1;

	public static final int spvParamIdFilter = 14;

	public static final int spvParamValueFilter = 15;
	private static final int spvParamValueSize = 20;

	public static final int spvActChargeFilter = 16;
	private static final int spvActChargeSize = 5;

	public static final int spvChargeCodeFilter = 17;
	private static final int spvChargeCodeSize = 5;

	public static final int spvDefaultValueFilter = 18;
	private static final int spvDefaultValueSize = 1;

	public static final int spvNetwrkCodeFilter = 19;
	private static final int spvNetwrkCodeSize = 15;

	public SpcSpvDQO() {
	};

	public SpcSpvDQO(final Integer spcParamId, final String spcParamName, final String spcServiceCode,
			final String spcServiceType, final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule, final String spcLegalEntity,
			final Integer spcContrPeriod, final String spcCanTerm, final String spcTaxInv, final String spcParamProrata,
			final String spcNodeString, final Integer spvParamId, final String spvParamValue, final String spvActCharge,
			final String spvChargeCode, final String spvDefaultValue, final String spvNetwrkCode) {

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

	private static final int[] fieldSizes = new int[] { spcParamIdSize, spcParamNameSize, spcServiceCodeSize,
			spcServiceTypeSize, spcLockToTariffSize, spcLockToPackSize, spcValueTypeSize, spcExclusionRuleSize,
			spcLegalEntitySize, 0, spcCanTermSize, spcTaxInvSize, spcParamProrataSize, spcNodeStringSize, 0,
			spvParamValueSize, spvActChargeSize, spvChargeCodeSize, spvDefaultValueSize, spvNetwrkCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}
	
	protected void deConstruct() {
		this.setSpcDMO(new SpcParamConfigDMO(spcParamId, spcParamName, spcServiceCode, spcServiceType, spcLockToTariff, spcLockToPack, spcValueType, spcExclusionRule, spcLegalEntity, spcContrPeriod, spcCanTerm, spcTaxInv, spcParamProrata, spcNodeString));
		this.setSpvDMO(new SpvParamValuesDMO(spvParamId, spvParamValue, spvActCharge, spvChargeCode, spvDefaultValue, spvNetwrkCode));
	}

	protected Object[] get() {
		return new Object[] { this.spcParamId,
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
		this.spcParamId = (Integer) fields[0];
		this.spcParamName = rtrim((String) fields[1]);
		this.spcServiceCode = rtrim((String) fields[2]);
		this.spcServiceType = rtrim((String) fields[3]);
		this.spcLockToTariff = rtrim((String) fields[4]);
		this.spcLockToPack = rtrim((String) fields[5]);
		this.spcValueType = rtrim((String) fields[6]);
		this.spcExclusionRule = rtrim((String) fields[7]);
		this.spcLegalEntity = rtrim((String) fields[8]);
		this.spcContrPeriod = ((Integer) fields[9]);
		this.spcCanTerm = rtrim((String) fields[10]);
		this.spcTaxInv = rtrim((String) fields[11]);
		this.spcParamProrata = rtrim((String) fields[12]);
		this.spcNodeString = rtrim((String) fields[13]);
		this.spvParamId = ((Integer) fields[14]);
		this.spvParamValue = rtrim((String) fields[15]);
		this.spvActCharge = rtrim((String) fields[16]);
		this.spvChargeCode = rtrim((String) fields[17]);
		this.spvDefaultValue = rtrim((String) fields[18]);
		this.spvNetwrkCode = rtrim((String) fields[19]);

	}

	public void set(final Integer spcParamId, final String spcParamName, final String spcServiceCode,
			final String spcServiceType, final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule, final String spcLegalEntity,
			final Integer spcContrPeriod, final String spcCanTerm, final String spcTaxInv, final String spcParamProrata,
			final String spcNodeString, final Integer spvParamId, final String spvParamValue, final String spvActCharge,
			final String spvChargeCode, final String spvDefaultValue, final String spvNetwrkCode) {

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
