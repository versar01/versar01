package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SpcvsrvstDQO extends DBO implements Serializable {

	private SpcParamConfigDMO spcDMO;
	private VsrServiceDMO vsrDMO;
	private VstServiceTypesDMO vstDMO;

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

	public static final int spcParamIdFilter = 0;

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

	public static final int vsrServiceCodeFilter = 14;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 15;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 16;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 17;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 18;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 19;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 20;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 21;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 22;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 23;
	private static final int vsrSuspendSize = 1;

	public static final int vstServiceTypeFilter = 24;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 25;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 26;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 27;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 28;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 29;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 30;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 31;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 32;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 33;

	public static final int vstFutureActFilter = 34;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 35;
	private static final int vstNodeLevelSize = 5;

	public SpcvsrvstDQO() {
	};

	public SpcvsrvstDQO(final Integer spcParamId, final String spcParamName, final String spcServiceCode,
			final String spcServiceType, final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule, final String spcLegalEntity,
			final Integer spcContrPeriod, final String spcCanTerm, final String spcTaxInv, final String spcParamProrata,
			final String spcNodeString, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel) {

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
	};

	public void deConstruct() {

		spcDMO = new SpcParamConfigDMO(spcParamId, spcParamName, spcServiceCode, spcServiceType, spcLockToTariff,
				spcLockToPack, spcValueType, spcExclusionRule, spcLegalEntity, spcContrPeriod, spcCanTerm, spcTaxInv,
				spcParamProrata, spcNodeString);

		vsrDMO = new VsrServiceDMO(vsrServiceCode, vsrServiceType, vsrServiceDesc, vsrOriginator, vsrServiceClass,
				vsrTempDeact, vsrProrata, vsrProviderId, vsrShortDesc, vsrSuspend);

		vstDMO = new VstServiceTypesDMO(vstServiceType, vstServiceDesc, vstMultiCharge, vstServiceClass, vstAutoConnect,
				vstOriginator, vstTariffRelated, vstParameterised, vstParamsLevel, vstArchiveMonths, vstFutureAct,
				vstNodeLevel);
	}

	private static final int[] fieldSizes = new int[] { 0, spcParamNameSize, spcServiceCodeSize, spcServiceTypeSize,
			spcLockToTariffSize, spcLockToPackSize, spcValueTypeSize, spcExclusionRuleSize, spcLegalEntitySize, 0,
			spcCanTermSize, spcTaxInvSize, spcParamProrataSize, spcNodeStringSize, vsrServiceCodeSize,
			vsrServiceTypeSize, vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize, vsrTempDeactSize,
			vsrProrataSize, vsrProviderIdSize, vsrShortDescSize, vsrSuspendSize, vstServiceTypeSize, vstServiceDescSize,
			vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize, vstOriginatorSize, vstTariffRelatedSize,
			vstParameterisedSize, vstParamsLevelSize, 0, vstFutureActSize, vstNodeLevelSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
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
								: this.vstNodeLevel.substring(0, this.vstNodeLevelSize)) };
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
		this.spcParamId = ((Integer) fields[0]);
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

		this.vsrServiceCode = rtrim((String) fields[14]);

		this.vsrServiceType = rtrim((String) fields[15]);

		this.vsrServiceDesc = rtrim((String) fields[16]);

		this.vsrOriginator = rtrim((String) fields[17]);

		this.vsrServiceClass = rtrim((String) fields[18]);

		this.vsrTempDeact = rtrim((String) fields[19]);

		this.vsrProrata = rtrim((String) fields[20]);

		this.vsrProviderId = rtrim((String) fields[21]);

		this.vsrShortDesc = rtrim((String) fields[22]);

		this.vsrSuspend = rtrim((String) fields[23]);

		this.vstServiceType = rtrim((String) fields[24]);

		this.vstServiceDesc = rtrim((String) fields[25]);

		this.vstMultiCharge = rtrim((String) fields[26]);

		this.vstServiceClass = rtrim((String) fields[27]);

		this.vstAutoConnect = rtrim((String) fields[28]);

		this.vstOriginator = rtrim((String) fields[29]);

		this.vstTariffRelated = rtrim((String) fields[30]);

		this.vstParameterised = rtrim((String) fields[31]);

		this.vstParamsLevel = rtrim((String) fields[32]);

		this.vstArchiveMonths = ((Short) fields[33]);
		this.vstFutureAct = rtrim((String) fields[34]);

		this.vstNodeLevel = rtrim((String) fields[35]);

	}

	public void set(final Integer spcParamId, final String spcParamName, final String spcServiceCode,
			final String spcServiceType, final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule, final String spcLegalEntity,
			final Integer spcContrPeriod, final String spcCanTerm, final String spcTaxInv, final String spcParamProrata,
			final String spcNodeString, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel) {

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
	}

	public SpcParamConfigDMO getSpcDMO() {
		return spcDMO;
	}

	public void setSpcDMO(SpcParamConfigDMO spcDMO) {
		this.spcDMO = spcDMO;
	}

	public VsrServiceDMO getVsrDMO() {
		return vsrDMO;
	}

	public void setVsrDMO(VsrServiceDMO vsrDMO) {
		this.vsrDMO = vsrDMO;
	}

	public VstServiceTypesDMO getVstDMO() {
		return vstDMO;
	}

	public void setVstDMO(VstServiceTypesDMO vstDMO) {
		this.vstDMO = vstDMO;
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

}
