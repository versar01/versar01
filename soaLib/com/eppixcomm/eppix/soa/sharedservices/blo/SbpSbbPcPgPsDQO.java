package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbpSbbPcPgPsDQO extends DBO implements Serializable {

	private SbpSubPartnerDMO sbpDMO;
	private SbbSubBenefitDMO sbbDMO;
	private PcPartnerConfigDMO pcDMO;
	private PgPartnerGroupDMO pgDMO;
	private PsPartnerServiceDMO psDMO;

	private Integer sbpSubPartnerId;
	private Integer sbpSubscriberId;
	private Integer sbpPartnerId;
	private String sbpBenefitStatus;
	private String sbpPriMemberNo;
	private String sbpAltMemberNo;
	private String sbpMemberStatus;
	private String sbpLastAuthCode;
	private Date sbpLastStatChge;
	private String sbpHandset;
	private Integer sbpConfigId;
	private String sbpAnalysis1;
	private String sbpAnalysis2;
	private String sbpAnalysis3;
	private String sbpAnalysis4;
	private String sbpAnalysis5;
	private Integer sbbSubPartnerId;
	private Integer sbbBenefitId;
	private Integer pcConfigId;
	private Integer pcPartnerId;
	private String pcMemberStatus;
	private String pcPackageCode;
	private String pcTarplanRef;
	private String pcAltPackage;
	private String pcAltTariff;
	private String pcBenefitName;
	private String pcN2nStatus;
	private Integer pgGroupId;
	private Integer pgConfigId;
	private String pgGroupType;
	private Short pgGroupQuantity;
	private Integer psBenefitId;
	private Integer psGroupId;
	private String psBenefitType;
	private String psBenefitCode;
	private Integer psNotifyMonths;
	private Integer psInstrId;
	private String psPartnerMaster;
	private Integer psContrPeriod;

	public static final int sbpSubPartnerIdFilter = 0;

	public static final int sbpSubscriberIdFilter = 1;

	public static final int sbpPartnerIdFilter = 2;

	public static final int sbpBenefitStatusFilter = 3;
	private static final int sbpBenefitStatusSize = 1;

	public static final int sbpPriMemberNoFilter = 4;
	private static final int sbpPriMemberNoSize = 16;

	public static final int sbpAltMemberNoFilter = 5;
	private static final int sbpAltMemberNoSize = 16;

	public static final int sbpMemberStatusFilter = 6;
	private static final int sbpMemberStatusSize = 16;

	public static final int sbpLastAuthCodeFilter = 7;
	private static final int sbpLastAuthCodeSize = 32;

	public static final int sbpLastStatChgeFilter = 8;

	public static final int sbpHandsetFilter = 9;
	private static final int sbpHandsetSize = 1;

	public static final int sbpConfigIdFilter = 10;

	public static final int sbpAnalysis1Filter = 11;
	private static final int sbpAnalysis1Size = 32;

	public static final int sbpAnalysis2Filter = 12;
	private static final int sbpAnalysis2Size = 32;

	public static final int sbpAnalysis3Filter = 13;
	private static final int sbpAnalysis3Size = 32;

	public static final int sbpAnalysis4Filter = 14;
	private static final int sbpAnalysis4Size = 32;

	public static final int sbpAnalysis5Filter = 15;
	private static final int sbpAnalysis5Size = 32;

	public static final int sbbSubPartnerIdFilter = 16;

	public static final int sbbBenefitIdFilter = 17;

	public static final int pcConfigIdFilter = 18;

	public static final int pcPartnerIdFilter = 19;

	public static final int pcMemberStatusFilter = 20;
	private static final int pcMemberStatusSize = 16;

	public static final int pcPackageCodeFilter = 21;
	private static final int pcPackageCodeSize = 5;

	public static final int pcTarplanRefFilter = 22;
	private static final int pcTarplanRefSize = 20;

	public static final int pcAltPackageFilter = 23;
	private static final int pcAltPackageSize = 5;

	public static final int pcAltTariffFilter = 24;
	private static final int pcAltTariffSize = 20;

	public static final int pcBenefitNameFilter = 25;
	private static final int pcBenefitNameSize = 16;

	public static final int pcN2nStatusFilter = 26;
	private static final int pcN2nStatusSize = 7;

	public static final int pgGroupIdFilter = 27;

	public static final int pgConfigIdFilter = 28;

	public static final int pgGroupTypeFilter = 29;
	private static final int pgGroupTypeSize = 1;

	public static final int pgGroupQuantityFilter = 30;

	public static final int psBenefitIdFilter = 31;

	public static final int psGroupIdFilter = 32;

	public static final int psBenefitTypeFilter = 33;
	private static final int psBenefitTypeSize = 1;

	public static final int psBenefitCodeFilter = 34;
	private static final int psBenefitCodeSize = 5;

	public static final int psNotifyMonthsFilter = 35;

	public static final int psInstrIdFilter = 36;

	public static final int psPartnerMasterFilter = 37;
	private static final int psPartnerMasterSize = 1;

	public static final int psContrPeriodFilter = 38;

	public SbpSbbPcPgPsDQO() {
	};

	public SbpSbbPcPgPsDQO(final Integer sbpSubPartnerId,
			final Integer sbpSubscriberId, final Integer sbpPartnerId,
			final String sbpBenefitStatus, final String sbpPriMemberNo,
			final String sbpAltMemberNo, final String sbpMemberStatus,
			final String sbpLastAuthCode, final Date sbpLastStatChge,
			final String sbpHandset, final Integer sbpConfigId,
			final String sbpAnalysis1, final String sbpAnalysis2,
			final String sbpAnalysis3, final String sbpAnalysis4,
			final String sbpAnalysis5, final Integer sbbSubPartnerId,
			final Integer sbbBenefitId, final Integer pcConfigId,
			final Integer pcPartnerId, final String pcMemberStatus,
			final String pcPackageCode, final String pcTarplanRef,
			final String pcAltPackage, final String pcAltTariff,
			final String pcBenefitName, final String pcN2nStatus,
			final Integer pgGroupId, final Integer pgConfigId,
			final String pgGroupType, final Short pgGroupQuantity,
			final Integer psBenefitId, final Integer psGroupId,
			final String psBenefitType, final String psBenefitCode,
			final Integer psNotifyMonths, final Integer psInstrId,
			final String psPartnerMaster, final Integer psContrPeriod) {

		this.sbpSubPartnerId = sbpSubPartnerId;
		this.sbpSubscriberId = sbpSubscriberId;
		this.sbpPartnerId = sbpPartnerId;
		this.sbpBenefitStatus = sbpBenefitStatus;
		this.sbpPriMemberNo = sbpPriMemberNo;
		this.sbpAltMemberNo = sbpAltMemberNo;
		this.sbpMemberStatus = sbpMemberStatus;
		this.sbpLastAuthCode = sbpLastAuthCode;
		this.sbpLastStatChge = sbpLastStatChge;
		this.sbpHandset = sbpHandset;
		this.sbpConfigId = sbpConfigId;
		this.sbpAnalysis1 = sbpAnalysis1;
		this.sbpAnalysis2 = sbpAnalysis2;
		this.sbpAnalysis3 = sbpAnalysis3;
		this.sbpAnalysis4 = sbpAnalysis4;
		this.sbpAnalysis5 = sbpAnalysis5;
		this.sbbSubPartnerId = sbbSubPartnerId;
		this.sbbBenefitId = sbbBenefitId;
		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNotifyMonths = psNotifyMonths;
		this.psInstrId = psInstrId;
		this.psPartnerMaster = psPartnerMaster;
		this.psContrPeriod = psContrPeriod;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0,
			sbpBenefitStatusSize, sbpPriMemberNoSize, sbpAltMemberNoSize,
			sbpMemberStatusSize, sbpLastAuthCodeSize, 0, sbpHandsetSize, 0,
			sbpAnalysis1Size, sbpAnalysis2Size, sbpAnalysis3Size,
			sbpAnalysis4Size, sbpAnalysis5Size, 0, 0, 0, 0, pcMemberStatusSize,
			pcPackageCodeSize, pcTarplanRefSize, pcAltPackageSize,
			pcAltTariffSize, pcBenefitNameSize, pcN2nStatusSize, 0, 0,
			pgGroupTypeSize, 0, 0, 0, psBenefitTypeSize, psBenefitCodeSize, 0,
			0, psPartnerMasterSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	public void deConstruct() {
		sbpDMO = new SbpSubPartnerDMO(sbpSubPartnerId, sbpSubscriberId,
				sbpPartnerId, sbpBenefitStatus, sbpPriMemberNo, sbpAltMemberNo,
				sbpMemberStatus, sbpLastAuthCode, sbpLastStatChge, sbpHandset,
				sbpConfigId, sbpAnalysis1, sbpAnalysis2, sbpAnalysis3,
				sbpAnalysis4, sbpAnalysis5);

		sbbDMO = new SbbSubBenefitDMO(sbbSubPartnerId, sbbBenefitId);

		pcDMO = new PcPartnerConfigDMO(pcConfigId, pcPartnerId, pcMemberStatus,
				pcPackageCode, pcTarplanRef, pcAltPackage, pcAltTariff,
				pcBenefitName, pcN2nStatus);

		pgDMO = new PgPartnerGroupDMO(pgGroupId, pgConfigId, pgGroupType,
				pgGroupQuantity);

		psDMO = new PsPartnerServiceDMO(psBenefitId, psGroupId, psBenefitType,
				psBenefitCode, psNotifyMonths, psInstrId, psPartnerMaster,
				psContrPeriod);
	}

	protected Object[] get() {
		return new Object[] {
				this.sbpSubPartnerId,
				this.sbpSubscriberId,
				this.sbpPartnerId,
				((this.sbpBenefitStatus == null) ? null
						: (this.sbpBenefitStatus.length() <= sbpBenefitStatusSize) ? this.sbpBenefitStatus
								: this.sbpBenefitStatus.substring(0,
										this.sbpBenefitStatusSize)),
				((this.sbpPriMemberNo == null) ? null : (this.sbpPriMemberNo
						.length() <= sbpPriMemberNoSize) ? this.sbpPriMemberNo
						: this.sbpPriMemberNo.substring(0,
								this.sbpPriMemberNoSize)),
				((this.sbpAltMemberNo == null) ? null : (this.sbpAltMemberNo
						.length() <= sbpAltMemberNoSize) ? this.sbpAltMemberNo
						: this.sbpAltMemberNo.substring(0,
								this.sbpAltMemberNoSize)),
				((this.sbpMemberStatus == null) ? null
						: (this.sbpMemberStatus.length() <= sbpMemberStatusSize) ? this.sbpMemberStatus
								: this.sbpMemberStatus.substring(0,
										this.sbpMemberStatusSize)),
				((this.sbpLastAuthCode == null) ? null
						: (this.sbpLastAuthCode.length() <= sbpLastAuthCodeSize) ? this.sbpLastAuthCode
								: this.sbpLastAuthCode.substring(0,
										this.sbpLastAuthCodeSize)),
				this.sbpLastStatChge,
				((this.sbpHandset == null) ? null
						: (this.sbpHandset.length() <= sbpHandsetSize) ? this.sbpHandset
								: this.sbpHandset.substring(0,
										this.sbpHandsetSize)),
				this.sbpConfigId,
				((this.sbpAnalysis1 == null) ? null : (this.sbpAnalysis1
						.length() <= sbpAnalysis1Size) ? this.sbpAnalysis1
						: this.sbpAnalysis1.substring(0, this.sbpAnalysis1Size)),
				((this.sbpAnalysis2 == null) ? null : (this.sbpAnalysis2
						.length() <= sbpAnalysis2Size) ? this.sbpAnalysis2
						: this.sbpAnalysis2.substring(0, this.sbpAnalysis2Size)),
				((this.sbpAnalysis3 == null) ? null : (this.sbpAnalysis3
						.length() <= sbpAnalysis3Size) ? this.sbpAnalysis3
						: this.sbpAnalysis3.substring(0, this.sbpAnalysis3Size)),
				((this.sbpAnalysis4 == null) ? null : (this.sbpAnalysis4
						.length() <= sbpAnalysis4Size) ? this.sbpAnalysis4
						: this.sbpAnalysis4.substring(0, this.sbpAnalysis4Size)),
				((this.sbpAnalysis5 == null) ? null : (this.sbpAnalysis5
						.length() <= sbpAnalysis5Size) ? this.sbpAnalysis5
						: this.sbpAnalysis5.substring(0, this.sbpAnalysis5Size)),
				this.sbbSubPartnerId,
				this.sbbBenefitId,
				this.pcConfigId,
				this.pcPartnerId,
				((this.pcMemberStatus == null) ? null : (this.pcMemberStatus
						.length() <= pcMemberStatusSize) ? this.pcMemberStatus
						: this.pcMemberStatus.substring(0,
								this.pcMemberStatusSize)),
				((this.pcPackageCode == null) ? null : (this.pcPackageCode
						.length() <= pcPackageCodeSize) ? this.pcPackageCode
						: this.pcPackageCode.substring(0,
								this.pcPackageCodeSize)),
				((this.pcTarplanRef == null) ? null : (this.pcTarplanRef
						.length() <= pcTarplanRefSize) ? this.pcTarplanRef
						: this.pcTarplanRef.substring(0, this.pcTarplanRefSize)),
				((this.pcAltPackage == null) ? null : (this.pcAltPackage
						.length() <= pcAltPackageSize) ? this.pcAltPackage
						: this.pcAltPackage.substring(0, this.pcAltPackageSize)),
				((this.pcAltTariff == null) ? null
						: (this.pcAltTariff.length() <= pcAltTariffSize) ? this.pcAltTariff
								: this.pcAltTariff.substring(0,
										this.pcAltTariffSize)),
				((this.pcBenefitName == null) ? null : (this.pcBenefitName
						.length() <= pcBenefitNameSize) ? this.pcBenefitName
						: this.pcBenefitName.substring(0,
								this.pcBenefitNameSize)),
				((this.pcN2nStatus == null) ? null
						: (this.pcN2nStatus.length() <= pcN2nStatusSize) ? this.pcN2nStatus
								: this.pcN2nStatus.substring(0,
										this.pcN2nStatusSize)),
				this.pgGroupId,
				this.pgConfigId,
				((this.pgGroupType == null) ? null
						: (this.pgGroupType.length() <= pgGroupTypeSize) ? this.pgGroupType
								: this.pgGroupType.substring(0,
										this.pgGroupTypeSize)),
				this.pgGroupQuantity,
				this.psBenefitId,
				this.psGroupId,
				((this.psBenefitType == null) ? null : (this.psBenefitType
						.length() <= psBenefitTypeSize) ? this.psBenefitType
						: this.psBenefitType.substring(0,
								this.psBenefitTypeSize)),
				((this.psBenefitCode == null) ? null : (this.psBenefitCode
						.length() <= psBenefitCodeSize) ? this.psBenefitCode
						: this.psBenefitCode.substring(0,
								this.psBenefitCodeSize)),
				this.psNotifyMonths,
				this.psInstrId,
				((this.psPartnerMaster == null) ? null
						: (this.psPartnerMaster.length() <= psPartnerMasterSize) ? this.psPartnerMaster
								: this.psPartnerMaster.substring(0,
										this.psPartnerMasterSize)),
				this.psContrPeriod };
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
		this.sbpSubPartnerId = (Integer) fields[0];
		this.sbpSubscriberId = ((Integer) fields[1]);
		this.sbpPartnerId = ((Integer) fields[2]);
		this.sbpBenefitStatus = rtrim((String) fields[3]);
		this.sbpPriMemberNo = rtrim((String) fields[4]);
		this.sbpAltMemberNo = rtrim((String) fields[5]);
		this.sbpMemberStatus = rtrim((String) fields[6]);
		this.sbpLastAuthCode = rtrim((String) fields[7]);
		this.sbpLastStatChge = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.sbpHandset = rtrim((String) fields[9]);
		this.sbpConfigId = ((Integer) fields[10]);
		this.sbpAnalysis1 = rtrim((String) fields[11]);
		this.sbpAnalysis2 = rtrim((String) fields[12]);
		this.sbpAnalysis3 = rtrim((String) fields[13]);
		this.sbpAnalysis4 = rtrim((String) fields[14]);
		this.sbpAnalysis5 = rtrim((String) fields[15]);
		this.sbbSubPartnerId = ((Integer) fields[16]);
		this.sbbBenefitId = ((Integer) fields[17]);
		this.pcConfigId = (Integer) fields[18];
		this.pcPartnerId = ((Integer) fields[19]);
		this.pcMemberStatus = rtrim((String) fields[20]);
		this.pcPackageCode = rtrim((String) fields[21]);
		this.pcTarplanRef = rtrim((String) fields[22]);
		this.pcAltPackage = rtrim((String) fields[23]);
		this.pcAltTariff = rtrim((String) fields[24]);
		this.pcBenefitName = rtrim((String) fields[25]);
		this.pcN2nStatus = rtrim((String) fields[26]);
		this.pgGroupId = (Integer) fields[27];
		this.pgConfigId = ((Integer) fields[28]);
		this.pgGroupType = rtrim((String) fields[29]);
		this.pgGroupQuantity = ((Short) fields[30]);
		this.psBenefitId = ((Integer) fields[31]);
		this.psGroupId = ((Integer) fields[32]);
		this.psBenefitType = rtrim((String) fields[33]);
		this.psBenefitCode = rtrim((String) fields[34]);
		this.psNotifyMonths = ((Integer) fields[35]);
		this.psInstrId = ((Integer) fields[36]);
		this.psPartnerMaster = rtrim((String) fields[37]);
		this.psContrPeriod = ((Integer) fields[38]);
	}

	public void set(final Integer sbpSubPartnerId,
			final Integer sbpSubscriberId, final Integer sbpPartnerId,
			final String sbpBenefitStatus, final String sbpPriMemberNo,
			final String sbpAltMemberNo, final String sbpMemberStatus,
			final String sbpLastAuthCode, final Date sbpLastStatChge,
			final String sbpHandset, final Integer sbpConfigId,
			final String sbpAnalysis1, final String sbpAnalysis2,
			final String sbpAnalysis3, final String sbpAnalysis4,
			final String sbpAnalysis5, final Integer sbbSubPartnerId,
			final Integer sbbBenefitId, final Integer pcConfigId,
			final Integer pcPartnerId, final String pcMemberStatus,
			final String pcPackageCode, final String pcTarplanRef,
			final String pcAltPackage, final String pcAltTariff,
			final String pcBenefitName, final String pcN2nStatus,
			final Integer pgGroupId, final Integer pgConfigId,
			final String pgGroupType, final Short pgGroupQuantity,
			final Integer psBenefitId, final Integer psGroupId,
			final String psBenefitType, final String psBenefitCode,
			final Integer psNotifyMonths, final Integer psInstrId,
			final String psPartnerMaster, final Integer psContrPeriod) {

		this.sbpSubPartnerId = sbpSubPartnerId;
		this.sbpSubscriberId = sbpSubscriberId;
		this.sbpPartnerId = sbpPartnerId;
		this.sbpBenefitStatus = sbpBenefitStatus;
		this.sbpPriMemberNo = sbpPriMemberNo;
		this.sbpAltMemberNo = sbpAltMemberNo;
		this.sbpMemberStatus = sbpMemberStatus;
		this.sbpLastAuthCode = sbpLastAuthCode;
		this.sbpLastStatChge = sbpLastStatChge;
		this.sbpHandset = sbpHandset;
		this.sbpConfigId = sbpConfigId;
		this.sbpAnalysis1 = sbpAnalysis1;
		this.sbpAnalysis2 = sbpAnalysis2;
		this.sbpAnalysis3 = sbpAnalysis3;
		this.sbpAnalysis4 = sbpAnalysis4;
		this.sbpAnalysis5 = sbpAnalysis5;
		this.sbbSubPartnerId = sbbSubPartnerId;
		this.sbbBenefitId = sbbBenefitId;
		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNotifyMonths = psNotifyMonths;
		this.psInstrId = psInstrId;
		this.psPartnerMaster = psPartnerMaster;
		this.psContrPeriod = psContrPeriod;
	}

	public SbpSubPartnerDMO getSbpDMO() {
		return sbpDMO;
	}

	public void setSbpDMO(SbpSubPartnerDMO sbpDMO) {
		this.sbpDMO = sbpDMO;
	}

	public SbbSubBenefitDMO getSbbDMO() {
		return sbbDMO;
	}

	public void setSbbDMO(SbbSubBenefitDMO sbbDMO) {
		this.sbbDMO = sbbDMO;
	}

	public PcPartnerConfigDMO getPcDMO() {
		return pcDMO;
	}

	public void setPcDMO(PcPartnerConfigDMO pcDMO) {
		this.pcDMO = pcDMO;
	}

	public PgPartnerGroupDMO getPgDMO() {
		return pgDMO;
	}

	public void setPgDMO(PgPartnerGroupDMO pgDMO) {
		this.pgDMO = pgDMO;
	}

	public PsPartnerServiceDMO getPsDMO() {
		return psDMO;
	}

	public void setPsDMO(PsPartnerServiceDMO psDMO) {
		this.psDMO = psDMO;
	}

	public Integer getSbpSubPartnerId() {
		return sbpSubPartnerId;
	}

	public void setSbpSubPartnerId(Integer sbpSubPartnerId) {
		this.sbpSubPartnerId = sbpSubPartnerId;
	}

	public Integer getSbpSubscriberId() {
		return sbpSubscriberId;
	}

	public void setSbpSubscriberId(Integer sbpSubscriberId) {
		this.sbpSubscriberId = sbpSubscriberId;
	}

	public Integer getSbpPartnerId() {
		return sbpPartnerId;
	}

	public void setSbpPartnerId(Integer sbpPartnerId) {
		this.sbpPartnerId = sbpPartnerId;
	}

	public String getSbpBenefitStatus() {
		return sbpBenefitStatus;
	}

	public void setSbpBenefitStatus(String sbpBenefitStatus) {
		this.sbpBenefitStatus = sbpBenefitStatus;
	}

	public String getSbpPriMemberNo() {
		return sbpPriMemberNo;
	}

	public void setSbpPriMemberNo(String sbpPriMemberNo) {
		this.sbpPriMemberNo = sbpPriMemberNo;
	}

	public String getSbpAltMemberNo() {
		return sbpAltMemberNo;
	}

	public void setSbpAltMemberNo(String sbpAltMemberNo) {
		this.sbpAltMemberNo = sbpAltMemberNo;
	}

	public String getSbpMemberStatus() {
		return sbpMemberStatus;
	}

	public void setSbpMemberStatus(String sbpMemberStatus) {
		this.sbpMemberStatus = sbpMemberStatus;
	}

	public String getSbpLastAuthCode() {
		return sbpLastAuthCode;
	}

	public void setSbpLastAuthCode(String sbpLastAuthCode) {
		this.sbpLastAuthCode = sbpLastAuthCode;
	}

	public Date getSbpLastStatChge() {
		return sbpLastStatChge;
	}

	public void setSbpLastStatChge(Date sbpLastStatChge) {
		this.sbpLastStatChge = sbpLastStatChge;
	}

	public String getSbpHandset() {
		return sbpHandset;
	}

	public void setSbpHandset(String sbpHandset) {
		this.sbpHandset = sbpHandset;
	}

	public Integer getSbpConfigId() {
		return sbpConfigId;
	}

	public void setSbpConfigId(Integer sbpConfigId) {
		this.sbpConfigId = sbpConfigId;
	}

	public String getSbpAnalysis1() {
		return sbpAnalysis1;
	}

	public void setSbpAnalysis1(String sbpAnalysis1) {
		this.sbpAnalysis1 = sbpAnalysis1;
	}

	public String getSbpAnalysis2() {
		return sbpAnalysis2;
	}

	public void setSbpAnalysis2(String sbpAnalysis2) {
		this.sbpAnalysis2 = sbpAnalysis2;
	}

	public String getSbpAnalysis3() {
		return sbpAnalysis3;
	}

	public void setSbpAnalysis3(String sbpAnalysis3) {
		this.sbpAnalysis3 = sbpAnalysis3;
	}

	public String getSbpAnalysis4() {
		return sbpAnalysis4;
	}

	public void setSbpAnalysis4(String sbpAnalysis4) {
		this.sbpAnalysis4 = sbpAnalysis4;
	}

	public String getSbpAnalysis5() {
		return sbpAnalysis5;
	}

	public void setSbpAnalysis5(String sbpAnalysis5) {
		this.sbpAnalysis5 = sbpAnalysis5;
	}

	public Integer getSbbSubPartnerId() {
		return sbbSubPartnerId;
	}

	public void setSbbSubPartnerId(Integer sbbSubPartnerId) {
		this.sbbSubPartnerId = sbbSubPartnerId;
	}

	public Integer getSbbBenefitId() {
		return sbbBenefitId;
	}

	public void setSbbBenefitId(Integer sbbBenefitId) {
		this.sbbBenefitId = sbbBenefitId;
	}

	public Integer getPcConfigId() {
		return pcConfigId;
	}

	public void setPcConfigId(Integer pcConfigId) {
		this.pcConfigId = pcConfigId;
	}

	public Integer getPcPartnerId() {
		return pcPartnerId;
	}

	public void setPcPartnerId(Integer pcPartnerId) {
		this.pcPartnerId = pcPartnerId;
	}

	public String getPcMemberStatus() {
		return pcMemberStatus;
	}

	public void setPcMemberStatus(String pcMemberStatus) {
		this.pcMemberStatus = pcMemberStatus;
	}

	public String getPcPackageCode() {
		return pcPackageCode;
	}

	public void setPcPackageCode(String pcPackageCode) {
		this.pcPackageCode = pcPackageCode;
	}

	public String getPcTarplanRef() {
		return pcTarplanRef;
	}

	public void setPcTarplanRef(String pcTarplanRef) {
		this.pcTarplanRef = pcTarplanRef;
	}

	public String getPcAltPackage() {
		return pcAltPackage;
	}

	public void setPcAltPackage(String pcAltPackage) {
		this.pcAltPackage = pcAltPackage;
	}

	public String getPcAltTariff() {
		return pcAltTariff;
	}

	public void setPcAltTariff(String pcAltTariff) {
		this.pcAltTariff = pcAltTariff;
	}

	public String getPcBenefitName() {
		return pcBenefitName;
	}

	public void setPcBenefitName(String pcBenefitName) {
		this.pcBenefitName = pcBenefitName;
	}

	public String getPcN2nStatus() {
		return pcN2nStatus;
	}

	public void setPcN2nStatus(String pcN2nStatus) {
		this.pcN2nStatus = pcN2nStatus;
	}

	public Integer getPgGroupId() {
		return pgGroupId;
	}

	public void setPgGroupId(Integer pgGroupId) {
		this.pgGroupId = pgGroupId;
	}

	public Integer getPgConfigId() {
		return pgConfigId;
	}

	public void setPgConfigId(Integer pgConfigId) {
		this.pgConfigId = pgConfigId;
	}

	public String getPgGroupType() {
		return pgGroupType;
	}

	public void setPgGroupType(String pgGroupType) {
		this.pgGroupType = pgGroupType;
	}

	public Short getPgGroupQuantity() {
		return pgGroupQuantity;
	}

	public void setPgGroupQuantity(Short pgGroupQuantity) {
		this.pgGroupQuantity = pgGroupQuantity;
	}

	public Integer getPsBenefitId() {
		return psBenefitId;
	}

	public void setPsBenefitId(Integer psBenefitId) {
		this.psBenefitId = psBenefitId;
	}

	public Integer getPsGroupId() {
		return psGroupId;
	}

	public void setPsGroupId(Integer psGroupId) {
		this.psGroupId = psGroupId;
	}

	public String getPsBenefitType() {
		return psBenefitType;
	}

	public void setPsBenefitType(String psBenefitType) {
		this.psBenefitType = psBenefitType;
	}

	public String getPsBenefitCode() {
		return psBenefitCode;
	}

	public void setPsBenefitCode(String psBenefitCode) {
		this.psBenefitCode = psBenefitCode;
	}

	public Integer getPsNotifyMonths() {
		return psNotifyMonths;
	}

	public void setPsNotifyMonths(Integer psNotifyMonths) {
		this.psNotifyMonths = psNotifyMonths;
	}

	public Integer getPsInstrId() {
		return psInstrId;
	}

	public void setPsInstrId(Integer psInstrId) {
		this.psInstrId = psInstrId;
	}

	public String getPsPartnerMaster() {
		return psPartnerMaster;
	}

	public void setPsPartnerMaster(String psPartnerMaster) {
		this.psPartnerMaster = psPartnerMaster;
	}

	public Integer getPsContrPeriod() {
		return psContrPeriod;
	}

	public void setPsContrPeriod(Integer psContrPeriod) {
		this.psContrPeriod = psContrPeriod;
	}

}
