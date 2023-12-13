package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SpcParamConfigDMO extends DBO implements Serializable {

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

	public static final int spcParamIdFilter = 0;
	private static final int spcParamIdSize = 187;

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

	public SpcParamConfigDMO() {
	};

	public SpcParamConfigDMO(final Integer spcParamId,
			final String spcParamName, final String spcServiceCode,
			final String spcServiceType, final String spcLockToTariff,
			final String spcLockToPack, final String spcValueType,
			final String spcExclusionRule, final String spcLegalEntity,
			final Integer spcContrPeriod, final String spcCanTerm,
			final String spcTaxInv, final String spcParamProrata,
			final String spcNodeString) {

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
	};

	private static final int[] fieldSizes = new int[] { spcParamIdSize,
			spcParamNameSize, spcServiceCodeSize, spcServiceTypeSize,
			spcLockToTariffSize, spcLockToPackSize, spcValueTypeSize,
			spcExclusionRuleSize, spcLegalEntitySize, 0, spcCanTermSize,
			spcTaxInvSize, spcParamProrataSize, spcNodeStringSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.spcParamId,
				((this.spcParamName == null) ? null : (this.spcParamName
						.length() <= spcParamNameSize) ? this.spcParamName
						: this.spcParamName.substring(0, this.spcParamNameSize)),
				((this.spcServiceCode == null) ? null : (this.spcServiceCode
						.length() <= spcServiceCodeSize) ? this.spcServiceCode
						: this.spcServiceCode.substring(0,
								this.spcServiceCodeSize)),
				((this.spcServiceType == null) ? null : (this.spcServiceType
						.length() <= spcServiceTypeSize) ? this.spcServiceType
						: this.spcServiceType.substring(0,
								this.spcServiceTypeSize)),
				((this.spcLockToTariff == null) ? null
						: (this.spcLockToTariff.length() <= spcLockToTariffSize) ? this.spcLockToTariff
								: this.spcLockToTariff.substring(0,
										this.spcLockToTariffSize)),
				((this.spcLockToPack == null) ? null : (this.spcLockToPack
						.length() <= spcLockToPackSize) ? this.spcLockToPack
						: this.spcLockToPack.substring(0,
								this.spcLockToPackSize)),
				((this.spcValueType == null) ? null : (this.spcValueType
						.length() <= spcValueTypeSize) ? this.spcValueType
						: this.spcValueType.substring(0, this.spcValueTypeSize)),
				((this.spcExclusionRule == null) ? null
						: (this.spcExclusionRule.length() <= spcExclusionRuleSize) ? this.spcExclusionRule
								: this.spcExclusionRule.substring(0,
										this.spcExclusionRuleSize)),
				((this.spcLegalEntity == null) ? null : (this.spcLegalEntity
						.length() <= spcLegalEntitySize) ? this.spcLegalEntity
						: this.spcLegalEntity.substring(0,
								this.spcLegalEntitySize)),
				this.spcContrPeriod,
				((this.spcCanTerm == null) ? null
						: (this.spcCanTerm.length() <= spcCanTermSize) ? this.spcCanTerm
								: this.spcCanTerm.substring(0,
										this.spcCanTermSize)),
				((this.spcTaxInv == null) ? null
						: (this.spcTaxInv.length() <= spcTaxInvSize) ? this.spcTaxInv
								: this.spcTaxInv.substring(0,
										this.spcTaxInvSize)),
				((this.spcParamProrata == null) ? null
						: (this.spcParamProrata.length() <= spcParamProrataSize) ? this.spcParamProrata
								: this.spcParamProrata.substring(0,
										this.spcParamProrataSize)),
				((this.spcNodeString == null) ? null : (this.spcNodeString
						.length() <= spcNodeStringSize) ? this.spcNodeString
						: this.spcNodeString.substring(0,
								this.spcNodeStringSize)) };
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
		return new DAOArgs(2).arg(this.spcParamId).arg(this.spcParamName);
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
	}

	public void set(final Integer spcParamId, final String spcParamName,
			final String spcServiceCode, final String spcServiceType,
			final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule,
			final String spcLegalEntity, final Integer spcContrPeriod,
			final String spcCanTerm, final String spcTaxInv,
			final String spcParamProrata, final String spcNodeString) {

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

}
