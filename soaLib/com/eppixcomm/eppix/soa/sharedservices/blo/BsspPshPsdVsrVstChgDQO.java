package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class BsspPshPsdVsrVstChgDQO extends DBO implements Serializable {

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
	private BigDecimal psdChgValue;
	private String psdActType;
	private Date psdActionDate;
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

	public static final int pshIdFilter = 0;
	private static final int pshIdSize = 23664173;

	public static final int pshServiceCodeFilter = 1;
	private static final int pshServiceCodeSize = 4;

	public static final int pshServiceTypeFilter = 2;
	private static final int pshServiceTypeSize = 5;

	public static final int pshSubscriberIdFilter = 3;

	public static final int pshSimNoFilter = 4;
	private static final int pshSimNoSize = 14;

	public static final int pshMsisdnNoFilter = 5;
	private static final int pshMsisdnNoSize = 15;

	public static final int pshArchivedFilter = 6;
	private static final int pshArchivedSize = 1;

	public static final int psdSerialIdFilter = 7;
	private static final int psdSerialIdSize = 219761159;

	public static final int psdPshIdFilter = 8;

	public static final int psdParamIdFilter = 9;

	public static final int psdActDateFilter = 10;

	public static final int psdTermDateFilter = 11;

	public static final int psdParamValueFilter = 12;
	private static final int psdParamValueSize = 20;

	public static final int psdN2nStringFilter = 13;
	private static final int psdN2nStringSize = 1;

	public static final int psdParamActiveFilter = 14;
	private static final int psdParamActiveSize = 1;

	public static final int psdDeacDateFilter = 15;

	public static final int psdSubChargeFilter = 16;
	private static final int psdSubChargeSize = 5;

	public static final int psdChgValueFilter = 17;

	public static final int psdActTypeFilter = 18;
	private static final int psdActTypeSize = 2;

	public static final int psdActionDateFilter = 19;

	public static final int vsrServiceCodeFilter = 20;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 21;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 22;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 23;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 24;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 25;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 26;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 27;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 28;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 29;
	private static final int vsrSuspendSize = 1;

	public static final int vstServiceTypeFilter = 30;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 31;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 32;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 33;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 34;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 35;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 36;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 37;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 38;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 39;

	public static final int vstFutureActFilter = 40;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 41;
	private static final int vstNodeLevelSize = 5;

	public static final int chgCodeFilter = 42;
	private static final int chgCodeSize = 5;

	public static final int chgDescriptionFilter = 43;
	private static final int chgDescriptionSize = 32;

	public static final int chgValueFilter = 44;

	public static final int chgVatCodeFilter = 45;
	private static final int chgVatCodeSize = 1;

	public static final int chgNcodeFilter = 46;
	private static final int chgNcodeSize = 20;

	public static final int chgNetidFilter = 47;
	private static final int chgNetidSize = 5;

	public static final int chgChargefFilter = 48;
	private static final int chgChargefSize = 1;

	public static final int chgPeriodFilter = 49;
	private static final int chgPeriodSize = 1;

	public static final int chgFrequencyFilter = 50;

	public static final int chgEffectiveDateFilter = 51;

	public static final int chgClassIdFilter = 52;

	public BsspPshPsdVsrVstChgDQO() {
	};

	public BsspPshPsdVsrVstChgDQO(final Integer pshId, final String pshServiceCode, final String pshServiceType,
			final Integer pshSubscriberId, final String pshSimNo, final String pshMsisdnNo, final String pshArchived,
			final Integer psdSerialId, final Integer psdPshId, final Integer psdParamId, final Date psdActDate,
			final Date psdTermDate, final String psdParamValue, final String psdN2nString, final String psdParamActive,
			final Date psdDeacDate, final String psdSubCharge, final BigDecimal psdChgValue, final String psdActType,
			final Date psdActionDate, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel, final String chgCode, final String chgDescription, final BigDecimal chgValue,
			final String chgVatCode, final String chgNcode, final String chgNetid, final String chgChargef,
			final String chgPeriod, final Short chgFrequency, final Date chgEffectiveDate, final Integer chgClassId) {

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

	private static final int[] fieldSizes = new int[] { pshIdSize, pshServiceCodeSize, pshServiceTypeSize, 0,
			pshSimNoSize, pshMsisdnNoSize, pshArchivedSize, psdSerialIdSize, 0, 0, 0, 0, psdParamValueSize,
			psdN2nStringSize, psdParamActiveSize, 0, psdSubChargeSize, 0, psdActTypeSize, 0, vsrServiceCodeSize,
			vsrServiceTypeSize, vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize, vsrTempDeactSize,
			vsrProrataSize, vsrProviderIdSize, vsrShortDescSize, vsrSuspendSize, vstServiceTypeSize, vstServiceDescSize,
			vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize, vstOriginatorSize, vstTariffRelatedSize,
			vstParameterisedSize, vstParamsLevelSize, 0, vstFutureActSize, vstNodeLevelSize, chgCodeSize,
			chgDescriptionSize, 0, chgVatCodeSize, chgNcodeSize, chgNetidSize, chgChargefSize, chgPeriodSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.pshId,
				((this.pshServiceCode == null) ? null
						: (this.pshServiceCode.length() <= pshServiceCodeSize) ? this.pshServiceCode
								: this.pshServiceCode.substring(0, this.pshServiceCodeSize)),
				((this.pshServiceType == null) ? null
						: (this.pshServiceType.length() <= pshServiceTypeSize) ? this.pshServiceType
								: this.pshServiceType.substring(0, this.pshServiceTypeSize)),
				this.pshSubscriberId,
				((this.pshSimNo == null) ? null
						: (this.pshSimNo.length() <= pshSimNoSize) ? this.pshSimNo
								: this.pshSimNo.substring(0, this.pshSimNoSize)),
				((this.pshMsisdnNo == null) ? null
						: (this.pshMsisdnNo.length() <= pshMsisdnNoSize) ? this.pshMsisdnNo
								: this.pshMsisdnNo.substring(0, this.pshMsisdnNoSize)),
				((this.pshArchived == null) ? null
						: (this.pshArchived.length() <= pshArchivedSize) ? this.pshArchived
								: this.pshArchived.substring(0, this.pshArchivedSize)),
				this.psdSerialId, this.psdPshId, this.psdParamId, this.psdActDate, this.psdTermDate,
				((this.psdParamValue == null) ? null
						: (this.psdParamValue.length() <= psdParamValueSize) ? this.psdParamValue
								: this.psdParamValue.substring(0, this.psdParamValueSize)),
				((this.psdN2nString == null) ? null
						: (this.psdN2nString.length() <= psdN2nStringSize) ? this.psdN2nString
								: this.psdN2nString.substring(0, this.psdN2nStringSize)),
				((this.psdParamActive == null) ? null
						: (this.psdParamActive.length() <= psdParamActiveSize) ? this.psdParamActive
								: this.psdParamActive.substring(0, this.psdParamActiveSize)),
				this.psdDeacDate,
				((this.psdSubCharge == null) ? null
						: (this.psdSubCharge.length() <= psdSubChargeSize) ? this.psdSubCharge
								: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				this.psdChgValue,
				((this.psdActType == null) ? null
						: (this.psdActType.length() <= psdActTypeSize) ? this.psdActType
								: this.psdActType.substring(0, this.psdActTypeSize)),
				this.psdActionDate,
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
		this.pshId = (Integer) fields[0];

		this.pshServiceCode = rtrim((String) fields[1]);

		this.pshServiceType = rtrim((String) fields[2]);

		this.pshSubscriberId = ((Integer) fields[3]);
		this.pshSimNo = rtrim((String) fields[4]);

		this.pshMsisdnNo = rtrim((String) fields[5]);

		this.pshArchived = rtrim((String) fields[6]);

		this.psdSerialId = (Integer) fields[7];

		this.psdPshId = ((Integer) fields[8]);
		this.psdParamId = ((Integer) fields[9]);
		this.psdActDate = ((fields[10] == null) ? null : new Date(fields[10]));
		this.psdTermDate = ((fields[11] == null) ? null : new Date(fields[11]));
		this.psdParamValue = rtrim((String) fields[12]);

		this.psdN2nString = rtrim((String) fields[13]);

		this.psdParamActive = rtrim((String) fields[14]);

		this.psdDeacDate = ((fields[15] == null) ? null : new Date(fields[15]));
		this.psdSubCharge = rtrim((String) fields[16]);

		this.psdChgValue = ((BigDecimal) fields[17]);
		this.psdActType = rtrim((String) fields[18]);

		this.psdActionDate = ((fields[19] == null) ? null : new Date(fields[19]));
		this.vsrServiceCode = rtrim((String) fields[20]);

		this.vsrServiceType = rtrim((String) fields[21]);

		this.vsrServiceDesc = rtrim((String) fields[22]);

		this.vsrOriginator = rtrim((String) fields[23]);

		this.vsrServiceClass = rtrim((String) fields[24]);

		this.vsrTempDeact = rtrim((String) fields[25]);

		this.vsrProrata = rtrim((String) fields[26]);

		this.vsrProviderId = rtrim((String) fields[27]);

		this.vsrShortDesc = rtrim((String) fields[28]);

		this.vsrSuspend = rtrim((String) fields[29]);

		this.vstServiceType = rtrim((String) fields[30]);

		this.vstServiceDesc = rtrim((String) fields[31]);

		this.vstMultiCharge = rtrim((String) fields[32]);

		this.vstServiceClass = rtrim((String) fields[33]);

		this.vstAutoConnect = rtrim((String) fields[34]);

		this.vstOriginator = rtrim((String) fields[35]);

		this.vstTariffRelated = rtrim((String) fields[36]);

		this.vstParameterised = rtrim((String) fields[37]);

		this.vstParamsLevel = rtrim((String) fields[38]);

		this.vstArchiveMonths = ((Short) fields[39]);
		this.vstFutureAct = rtrim((String) fields[40]);

		this.vstNodeLevel = rtrim((String) fields[41]);

		this.chgCode = rtrim((String) fields[42]);

		this.chgDescription = rtrim((String) fields[43]);

		this.chgValue = ((BigDecimal) fields[44]);
		this.chgVatCode = rtrim((String) fields[45]);

		this.chgNcode = rtrim((String) fields[46]);

		this.chgNetid = rtrim((String) fields[47]);

		this.chgChargef = rtrim((String) fields[48]);

		this.chgPeriod = rtrim((String) fields[49]);

		this.chgFrequency = ((Short) fields[50]);
		this.chgEffectiveDate = ((fields[51] == null) ? null : new Date(fields[51]));
		this.chgClassId = ((Integer) fields[52]);
	}

	public void set(final Integer pshId, final String pshServiceCode, final String pshServiceType,
			final Integer pshSubscriberId, final String pshSimNo, final String pshMsisdnNo, final String pshArchived,
			final Integer psdSerialId, final Integer psdPshId, final Integer psdParamId, final Date psdActDate,
			final Date psdTermDate, final String psdParamValue, final String psdN2nString, final String psdParamActive,
			final Date psdDeacDate, final String psdSubCharge, final BigDecimal psdChgValue, final String psdActType,
			final Date psdActionDate, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel, final String chgCode, final String chgDescription, final BigDecimal chgValue,
			final String chgVatCode, final String chgNcode, final String chgNetid, final String chgChargef,
			final String chgPeriod, final Short chgFrequency, final Date chgEffectiveDate, final Integer chgClassId) {

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

	public BigDecimal getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(BigDecimal psdChgValue) {
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
