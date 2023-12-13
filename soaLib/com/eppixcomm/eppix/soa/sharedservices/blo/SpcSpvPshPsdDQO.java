package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.PshParamServHdrDMO;
import com.eppixcomm.eppix.base.blo.SpvParamValuesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SpcSpvPshPsdDQO extends DBO implements Serializable {

	private SpcParamConfigDMO spcDMO;
	private SpvParamValuesDMO spvDMO;
	private PshParamServHdrDMO pshDMO;
	private PsdParamServDetDMO psdDMO;

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
	private Integer pshId;
	private String pshServiceCode;
	private String pshServiceType;
	private Integer pshSubscriberId;
	private String pshSimNo;
	private String pshMsisdnNo;
	private String pshArchived;
	private Integer psdSerialId;
	private Integer psdPshId;
	private Integer psdParamId;
	private Date psdActDate;
	private Date psdTermDate;
	private String psdParamValue;
	private String psdN2nString;
	private String psdParamActive;
	private Date psdDeacDate;
	private String psdSubCharge;
	private Double psdChgValue;
	private String psdActType;
	private Date psdActionDate;

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

	public static final int pshIdFilter = 20;

	public static final int pshServiceCodeFilter = 21;
	private static final int pshServiceCodeSize = 4;

	public static final int pshServiceTypeFilter = 22;
	private static final int pshServiceTypeSize = 5;

	public static final int pshSubscriberIdFilter = 23;

	public static final int pshSimNoFilter = 24;
	private static final int pshSimNoSize = 14;

	public static final int pshMsisdnNoFilter = 25;
	private static final int pshMsisdnNoSize = 15;

	public static final int pshArchivedFilter = 26;
	private static final int pshArchivedSize = 1;

	public static final int psdSerialIdFilter = 27;

	public static final int psdPshIdFilter = 28;

	public static final int psdParamIdFilter = 29;

	public static final int psdActDateFilter = 30;

	public static final int psdTermDateFilter = 31;

	public static final int psdParamValueFilter = 32;
	private static final int psdParamValueSize = 20;

	public static final int psdN2nStringFilter = 33;
	private static final int psdN2nStringSize = 1;

	public static final int psdParamActiveFilter = 34;
	private static final int psdParamActiveSize = 1;

	public static final int psdDeacDateFilter = 35;

	public static final int psdSubChargeFilter = 36;
	private static final int psdSubChargeSize = 5;

	public static final int psdChgValueFilter = 37;

	public static final int psdActTypeFilter = 38;
	private static final int psdActTypeSize = 2;

	public static final int psdActionDateFilter = 39;

	public SpcSpvPshPsdDQO() {
	};

	public SpcSpvPshPsdDQO(final Integer spcParamId, final String spcParamName,
			final String spcServiceCode, final String spcServiceType,
			final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule,
			final String spcLegalEntity, final Integer spcContrPeriod,
			final String spcCanTerm, final String spcTaxInv,
			final String spcParamProrata, final String spcNodeString,
			final Integer spvParamId, final String spvParamValue,
			final String spvActCharge, final String spvChargeCode,
			final String spvDefaultValue, final String spvNetwrkCode,
			final Integer pshId, final String pshServiceCode,
			final String pshServiceType, final Integer pshSubscriberId,
			final String pshSimNo, final String pshMsisdnNo,
			final String pshArchived, final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

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
		this.pshId = pshId;
		this.pshServiceCode = pshServiceCode;
		this.pshServiceType = pshServiceType;
		this.pshSubscriberId = pshSubscriberId;
		this.pshSimNo = pshSimNo;
		this.pshMsisdnNo = pshMsisdnNo;
		this.pshArchived = pshArchived;
		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	};

	private static final int[] fieldSizes = new int[] { 0, spcParamNameSize,
			spcServiceCodeSize, spcServiceTypeSize, spcLockToTariffSize,
			spcLockToPackSize, spcValueTypeSize, spcExclusionRuleSize,
			spcLegalEntitySize, 0, spcCanTermSize, spcTaxInvSize,
			spcParamProrataSize, spcNodeStringSize, 0, spvParamValueSize,
			spvActChargeSize, spvChargeCodeSize, spvDefaultValueSize,
			spvNetwrkCodeSize, 0, pshServiceCodeSize, pshServiceTypeSize, 0,
			pshSimNoSize, pshMsisdnNoSize, pshArchivedSize, 0, 0, 0, 0, 0,
			psdParamValueSize, psdN2nStringSize, psdParamActiveSize, 0,
			psdSubChargeSize, 0, psdActTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

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
								this.spcNodeStringSize)),
				this.spvParamId,
				((this.spvParamValue == null) ? null : (this.spvParamValue
						.length() <= spvParamValueSize) ? this.spvParamValue
						: this.spvParamValue.substring(0,
								this.spvParamValueSize)),
				((this.spvActCharge == null) ? null : (this.spvActCharge
						.length() <= spvActChargeSize) ? this.spvActCharge
						: this.spvActCharge.substring(0, this.spvActChargeSize)),
				((this.spvChargeCode == null) ? null : (this.spvChargeCode
						.length() <= spvChargeCodeSize) ? this.spvChargeCode
						: this.spvChargeCode.substring(0,
								this.spvChargeCodeSize)),
				((this.spvDefaultValue == null) ? null
						: (this.spvDefaultValue.length() <= spvDefaultValueSize) ? this.spvDefaultValue
								: this.spvDefaultValue.substring(0,
										this.spvDefaultValueSize)),
				((this.spvNetwrkCode == null) ? null : (this.spvNetwrkCode
						.length() <= spvNetwrkCodeSize) ? this.spvNetwrkCode
						: this.spvNetwrkCode.substring(0,
								this.spvNetwrkCodeSize)),
				this.pshId,
				((this.pshServiceCode == null) ? null : (this.pshServiceCode
						.length() <= pshServiceCodeSize) ? this.pshServiceCode
						: this.pshServiceCode.substring(0,
								this.pshServiceCodeSize)),
				((this.pshServiceType == null) ? null : (this.pshServiceType
						.length() <= pshServiceTypeSize) ? this.pshServiceType
						: this.pshServiceType.substring(0,
								this.pshServiceTypeSize)),
				this.pshSubscriberId,
				((this.pshSimNo == null) ? null
						: (this.pshSimNo.length() <= pshSimNoSize) ? this.pshSimNo
								: this.pshSimNo.substring(0, this.pshSimNoSize)),
				((this.pshMsisdnNo == null) ? null
						: (this.pshMsisdnNo.length() <= pshMsisdnNoSize) ? this.pshMsisdnNo
								: this.pshMsisdnNo.substring(0,
										this.pshMsisdnNoSize)),
				((this.pshArchived == null) ? null
						: (this.pshArchived.length() <= pshArchivedSize) ? this.pshArchived
								: this.pshArchived.substring(0,
										this.pshArchivedSize)),
				this.psdSerialId,
				this.psdPshId,
				this.psdParamId,
				this.psdActDate,
				this.psdTermDate,
				((this.psdParamValue == null) ? null : (this.psdParamValue
						.length() <= psdParamValueSize) ? this.psdParamValue
						: this.psdParamValue.substring(0,
								this.psdParamValueSize)),
				((this.psdN2nString == null) ? null : (this.psdN2nString
						.length() <= psdN2nStringSize) ? this.psdN2nString
						: this.psdN2nString.substring(0, this.psdN2nStringSize)),
				((this.psdParamActive == null) ? null : (this.psdParamActive
						.length() <= psdParamActiveSize) ? this.psdParamActive
						: this.psdParamActive.substring(0,
								this.psdParamActiveSize)),
				this.psdDeacDate,
				((this.psdSubCharge == null) ? null : (this.psdSubCharge
						.length() <= psdSubChargeSize) ? this.psdSubCharge
						: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				this.psdChgValue,
				((this.psdActType == null) ? null
						: (this.psdActType.length() <= psdActTypeSize) ? this.psdActType
								: this.psdActType.substring(0,
										this.psdActTypeSize)),
				this.psdActionDate };
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
		this.spvParamId = ((Integer) fields[14]);
		this.spvParamValue = rtrim((String) fields[15]);
		this.spvActCharge = rtrim((String) fields[16]);
		this.spvChargeCode = rtrim((String) fields[17]);
		this.spvDefaultValue = rtrim((String) fields[18]);
		this.spvNetwrkCode = rtrim((String) fields[19]);
		this.pshId = (Integer) fields[20];
		this.pshServiceCode = rtrim((String) fields[21]);
		this.pshServiceType = rtrim((String) fields[22]);
		this.pshSubscriberId = ((Integer) fields[23]);
		this.pshSimNo = rtrim((String) fields[24]);
		this.pshMsisdnNo = rtrim((String) fields[25]);
		this.pshArchived = rtrim((String) fields[26]);
		this.psdSerialId = ((Integer) fields[27]);
		this.psdPshId = ((Integer) fields[28]);
		this.psdParamId = ((Integer) fields[29]);
		this.psdActDate = ((fields[30] == null) ? null : new Date(fields[30]));
		this.psdTermDate = ((fields[31] == null) ? null : new Date(fields[31]));
		this.psdParamValue = rtrim((String) fields[32]);
		this.psdN2nString = rtrim((String) fields[33]);
		this.psdParamActive = rtrim((String) fields[34]);
		this.psdDeacDate = ((fields[35] == null) ? null : new Date(fields[35]));
		this.psdSubCharge = rtrim((String) fields[36]);
		this.psdChgValue = ((Double) fields[37]);
		this.psdActType = rtrim((String) fields[38]);
		this.psdActionDate = ((fields[39] == null) ? null
				: new Date(fields[39]));
	}

	public void set(final Integer spcParamId, final String spcParamName,
			final String spcServiceCode, final String spcServiceType,
			final String spcLockToTariff, final String spcLockToPack,
			final String spcValueType, final String spcExclusionRule,
			final String spcLegalEntity, final Integer spcContrPeriod,
			final String spcCanTerm, final String spcTaxInv,
			final String spcParamProrata, final String spcNodeString,
			final Integer spvParamId, final String spvParamValue,
			final String spvActCharge, final String spvChargeCode,
			final String spvDefaultValue, final String spvNetwrkCode,
			final Integer pshId, final String pshServiceCode,
			final String pshServiceType, final Integer pshSubscriberId,
			final String pshSimNo, final String pshMsisdnNo,
			final String pshArchived, final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

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
		this.pshId = pshId;
		this.pshServiceCode = pshServiceCode;
		this.pshServiceType = pshServiceType;
		this.pshSubscriberId = pshSubscriberId;
		this.pshSimNo = pshSimNo;
		this.pshMsisdnNo = pshMsisdnNo;
		this.pshArchived = pshArchived;
		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	}

	public void deConstruct() {
		spcDMO = new SpcParamConfigDMO(spcParamId, spcParamName,
				spcServiceCode, spcServiceType, spcLockToTariff, spcLockToPack,
				spcValueType, spcExclusionRule, spcLegalEntity, spcContrPeriod,
				spcCanTerm, spcTaxInv, spcParamProrata, spcNodeString);
		spvDMO = new SpvParamValuesDMO(spvParamId, spvParamValue, spvActCharge,
				spvChargeCode, spvDefaultValue, spvNetwrkCode);
		pshDMO = new PshParamServHdrDMO(psdPshId, pshServiceCode, pshArchived,
				pshSubscriberId, pshSimNo, pshMsisdnNo);
		psdDMO = new PsdParamServDetDMO(psdSerialId, psdPshId, psdParamId,
				psdActDate, psdTermDate, psdParamValue, psdN2nString,
				psdParamActive, psdDeacDate, psdSubCharge, psdChgValue,
				psdActType, psdActionDate);
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

	public PshParamServHdrDMO getPshDMO() {
		return pshDMO;
	}

	public void setPshDMO(PshParamServHdrDMO pshDMO) {
		this.pshDMO = pshDMO;
	}

	public PsdParamServDetDMO getPsdDMO() {
		return psdDMO;
	}

	public void setPsdDMO(PsdParamServDetDMO psdDMO) {
		this.psdDMO = psdDMO;
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

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getPshServiceCode() {
		return pshServiceCode;
	}

	public void setPshServiceCode(String pshServiceCode) {
		this.pshServiceCode = pshServiceCode;
	}

	public String getPshServiceType() {
		return pshServiceType;
	}

	public void setPshServiceType(String pshServiceType) {
		this.pshServiceType = pshServiceType;
	}

	public Integer getPshSubscriberId() {
		return pshSubscriberId;
	}

	public void setPshSubscriberId(Integer pshSubscriberId) {
		this.pshSubscriberId = pshSubscriberId;
	}

	public String getPshSimNo() {
		return pshSimNo;
	}

	public void setPshSimNo(String pshSimNo) {
		this.pshSimNo = pshSimNo;
	}

	public String getPshMsisdnNo() {
		return pshMsisdnNo;
	}

	public void setPshMsisdnNo(String pshMsisdnNo) {
		this.pshMsisdnNo = pshMsisdnNo;
	}

	public String getPshArchived() {
		return pshArchived;
	}

	public void setPshArchived(String pshArchived) {
		this.pshArchived = pshArchived;
	}

	public Integer getPsdSerialId() {
		return psdSerialId;
	}

	public void setPsdSerialId(Integer psdSerialId) {
		this.psdSerialId = psdSerialId;
	}

	public Integer getPsdPshId() {
		return psdPshId;
	}

	public void setPsdPshId(Integer psdPshId) {
		this.psdPshId = psdPshId;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public Date getPsdActDate() {
		return psdActDate;
	}

	public void setPsdActDate(Date psdActDate) {
		this.psdActDate = psdActDate;
	}

	public Date getPsdTermDate() {
		return psdTermDate;
	}

	public void setPsdTermDate(Date psdTermDate) {
		this.psdTermDate = psdTermDate;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdN2nString() {
		return psdN2nString;
	}

	public void setPsdN2nString(String psdN2nString) {
		this.psdN2nString = psdN2nString;
	}

	public String getPsdParamActive() {
		return psdParamActive;
	}

	public void setPsdParamActive(String psdParamActive) {
		this.psdParamActive = psdParamActive;
	}

	public Date getPsdDeacDate() {
		return psdDeacDate;
	}

	public void setPsdDeacDate(Date psdDeacDate) {
		this.psdDeacDate = psdDeacDate;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	public String getPsdActType() {
		return psdActType;
	}

	public void setPsdActType(String psdActType) {
		this.psdActType = psdActType;
	}

	public Date getPsdActionDate() {
		return psdActionDate;
	}

	public void setPsdActionDate(Date psdActionDate) {
		this.psdActionDate = psdActionDate;
	}

}
