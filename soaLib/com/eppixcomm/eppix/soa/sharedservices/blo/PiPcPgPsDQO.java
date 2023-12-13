package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PiPcPgPsDQO extends DBO implements Serializable {

	private Integer piPartnerId;
	private String piPartnerName;
	private String piPartnerEmail;
	private String piPartnerPhone;
	private String piPartnerCode;
	private Short piPartnerLevel;
	private String piAgreementCode;
	private String piSwapPerson;
	private Date piStartDate;
	private Date piTermDate;
	private String piPartnerStatus;
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

	public static final int piPartnerIdFilter = 0;
	private static final int piPartnerIdSize = 24;

	public static final int piPartnerNameFilter = 1;
	private static final int piPartnerNameSize = 32;

	public static final int piPartnerEmailFilter = 2;
	private static final int piPartnerEmailSize = 256;

	public static final int piPartnerPhoneFilter = 3;
	private static final int piPartnerPhoneSize = 15;

	public static final int piPartnerCodeFilter = 4;
	private static final int piPartnerCodeSize = 25;

	public static final int piPartnerLevelFilter = 5;

	public static final int piAgreementCodeFilter = 6;
	private static final int piAgreementCodeSize = 30;

	public static final int piSwapPersonFilter = 7;
	private static final int piSwapPersonSize = 1;

	public static final int piStartDateFilter = 8;

	public static final int piTermDateFilter = 9;

	public static final int piPartnerStatusFilter = 10;
	private static final int piPartnerStatusSize = 1;

	public static final int pcConfigIdFilter = 11;
	private static final int pcConfigIdSize = 18;

	public static final int pcPartnerIdFilter = 12;

	public static final int pcMemberStatusFilter = 13;
	private static final int pcMemberStatusSize = 16;

	public static final int pcPackageCodeFilter = 14;
	private static final int pcPackageCodeSize = 5;

	public static final int pcTarplanRefFilter = 15;
	private static final int pcTarplanRefSize = 20;

	public static final int pcAltPackageFilter = 16;
	private static final int pcAltPackageSize = 5;

	public static final int pcAltTariffFilter = 17;
	private static final int pcAltTariffSize = 20;

	public static final int pcBenefitNameFilter = 18;
	private static final int pcBenefitNameSize = 16;

	public static final int pcN2nStatusFilter = 19;
	private static final int pcN2nStatusSize = 7;

	public static final int pgGroupIdFilter = 20;
	private static final int pgGroupIdSize = 93;

	public static final int pgConfigIdFilter = 21;

	public static final int pgGroupTypeFilter = 22;
	private static final int pgGroupTypeSize = 1;

	public static final int pgGroupQuantityFilter = 23;

	public static final int psBenefitIdFilter = 24;

	public static final int psGroupIdFilter = 25;

	public static final int psBenefitTypeFilter = 26;
	private static final int psBenefitTypeSize = 1;

	public static final int psBenefitCodeFilter = 27;
	private static final int psBenefitCodeSize = 5;

	public static final int psNotifyMonthsFilter = 28;

	public static final int psInstrIdFilter = 29;

	public static final int psPartnerMasterFilter = 30;
	private static final int psPartnerMasterSize = 1;

	public static final int psContrPeriodFilter = 31;

	public PiPcPgPsDQO() {
	};

	public PiPcPgPsDQO(final Integer piPartnerId, final String piPartnerName,
			final String piPartnerEmail, final String piPartnerPhone,
			final String piPartnerCode, final Short piPartnerLevel,
			final String piAgreementCode, final String piSwapPerson,
			final Date piStartDate, final Date piTermDate,
			final String piPartnerStatus, final Integer pcConfigId,
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

		this.piPartnerId = piPartnerId;
		this.piPartnerName = piPartnerName;
		this.piPartnerEmail = piPartnerEmail;
		this.piPartnerPhone = piPartnerPhone;
		this.piPartnerCode = piPartnerCode;
		this.piPartnerLevel = piPartnerLevel;
		this.piAgreementCode = piAgreementCode;
		this.piSwapPerson = piSwapPerson;
		this.piStartDate = piStartDate;
		this.piTermDate = piTermDate;
		this.piPartnerStatus = piPartnerStatus;
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

	private static final int[] fieldSizes = new int[] { 0, piPartnerNameSize,
			piPartnerEmailSize, piPartnerPhoneSize, piPartnerCodeSize, 0,
			piAgreementCodeSize, piSwapPersonSize, 0, 0, piPartnerStatusSize,
			0, 0, pcMemberStatusSize, pcPackageCodeSize, pcTarplanRefSize,
			pcAltPackageSize, pcAltTariffSize, pcBenefitNameSize,
			pcN2nStatusSize, 0, 0, pgGroupTypeSize, 0, 0, 0, psBenefitTypeSize,
			psBenefitCodeSize, 0, 0, psPartnerMasterSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.piPartnerId,
				((this.piPartnerName == null) ? null : (this.piPartnerName
						.length() <= piPartnerNameSize) ? this.piPartnerName
						: this.piPartnerName.substring(0,
								this.piPartnerNameSize)),
				((this.piPartnerEmail == null) ? null : (this.piPartnerEmail
						.length() <= piPartnerEmailSize) ? this.piPartnerEmail
						: this.piPartnerEmail.substring(0,
								this.piPartnerEmailSize)),
				((this.piPartnerPhone == null) ? null : (this.piPartnerPhone
						.length() <= piPartnerPhoneSize) ? this.piPartnerPhone
						: this.piPartnerPhone.substring(0,
								this.piPartnerPhoneSize)),
				((this.piPartnerCode == null) ? null : (this.piPartnerCode
						.length() <= piPartnerCodeSize) ? this.piPartnerCode
						: this.piPartnerCode.substring(0,
								this.piPartnerCodeSize)),
				this.piPartnerLevel,
				((this.piAgreementCode == null) ? null
						: (this.piAgreementCode.length() <= piAgreementCodeSize) ? this.piAgreementCode
								: this.piAgreementCode.substring(0,
										this.piAgreementCodeSize)),
				((this.piSwapPerson == null) ? null : (this.piSwapPerson
						.length() <= piSwapPersonSize) ? this.piSwapPerson
						: this.piSwapPerson.substring(0, this.piSwapPersonSize)),
				this.piStartDate,
				this.piTermDate,
				((this.piPartnerStatus == null) ? null
						: (this.piPartnerStatus.length() <= piPartnerStatusSize) ? this.piPartnerStatus
								: this.piPartnerStatus.substring(0,
										this.piPartnerStatusSize)),
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
		this.piPartnerId = (Integer) fields[0];
		this.piPartnerName = rtrim((String) fields[1]);
		this.piPartnerEmail = rtrim((String) fields[2]);
		this.piPartnerPhone = rtrim((String) fields[3]);
		this.piPartnerCode = rtrim((String) fields[4]);
		this.piPartnerLevel = ((Short) fields[5]);
		this.piAgreementCode = rtrim((String) fields[6]);
		this.piSwapPerson = rtrim((String) fields[7]);
		this.piStartDate = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.piTermDate = ((fields[9] == null) ? null : new Date(
				fields[9]));
		this.piPartnerStatus = rtrim((String) fields[10]);
		this.pcConfigId = (Integer) fields[11];
		this.pcPartnerId = ((Integer) fields[12]);
		this.pcMemberStatus = rtrim((String) fields[13]);
		this.pcPackageCode = rtrim((String) fields[14]);
		this.pcTarplanRef = rtrim((String) fields[15]);
		this.pcAltPackage = rtrim((String) fields[16]);
		this.pcAltTariff = rtrim((String) fields[17]);
		this.pcBenefitName = rtrim((String) fields[18]);
		this.pcN2nStatus = rtrim((String) fields[19]);
		this.pgGroupId = (Integer) fields[20];
		this.pgConfigId = ((Integer) fields[21]);
		this.pgGroupType = rtrim((String) fields[22]);
		this.pgGroupQuantity = ((Short) fields[23]);
		this.psBenefitId = ((Integer) fields[24]);
		this.psGroupId = ((Integer) fields[25]);
		this.psBenefitType = rtrim((String) fields[26]);
		this.psBenefitCode = rtrim((String) fields[27]);
		this.psNotifyMonths = ((Integer) fields[28]);
		this.psInstrId = ((Integer) fields[29]);
		this.psPartnerMaster = rtrim((String) fields[30]);
		this.psContrPeriod = ((Integer) fields[31]);
	}

	public void set(final Integer piPartnerId, final String piPartnerName,
			final String piPartnerEmail, final String piPartnerPhone,
			final String piPartnerCode, final Short piPartnerLevel,
			final String piAgreementCode, final String piSwapPerson,
			final Date piStartDate, final Date piTermDate,
			final String piPartnerStatus, final Integer pcConfigId,
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

		this.piPartnerId = piPartnerId;
		this.piPartnerName = piPartnerName;
		this.piPartnerEmail = piPartnerEmail;
		this.piPartnerPhone = piPartnerPhone;
		this.piPartnerCode = piPartnerCode;
		this.piPartnerLevel = piPartnerLevel;
		this.piAgreementCode = piAgreementCode;
		this.piSwapPerson = piSwapPerson;
		this.piStartDate = piStartDate;
		this.piTermDate = piTermDate;
		this.piPartnerStatus = piPartnerStatus;
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

	public Integer getPiPartnerId() {
		return piPartnerId;
	}

	public void setPiPartnerId(Integer piPartnerId) {
		this.piPartnerId = piPartnerId;
	}

	public String getPiPartnerName() {
		return piPartnerName;
	}

	public void setPiPartnerName(String piPartnerName) {
		this.piPartnerName = piPartnerName;
	}

	public String getPiPartnerEmail() {
		return piPartnerEmail;
	}

	public void setPiPartnerEmail(String piPartnerEmail) {
		this.piPartnerEmail = piPartnerEmail;
	}

	public String getPiPartnerPhone() {
		return piPartnerPhone;
	}

	public void setPiPartnerPhone(String piPartnerPhone) {
		this.piPartnerPhone = piPartnerPhone;
	}

	public String getPiPartnerCode() {
		return piPartnerCode;
	}

	public void setPiPartnerCode(String piPartnerCode) {
		this.piPartnerCode = piPartnerCode;
	}

	public Short getPiPartnerLevel() {
		return piPartnerLevel;
	}

	public void setPiPartnerLevel(Short piPartnerLevel) {
		this.piPartnerLevel = piPartnerLevel;
	}

	public String getPiAgreementCode() {
		return piAgreementCode;
	}

	public void setPiAgreementCode(String piAgreementCode) {
		this.piAgreementCode = piAgreementCode;
	}

	public String getPiSwapPerson() {
		return piSwapPerson;
	}

	public void setPiSwapPerson(String piSwapPerson) {
		this.piSwapPerson = piSwapPerson;
	}

	public Date getPiStartDate() {
		return piStartDate;
	}

	public void setPiStartDate(Date piStartDate) {
		this.piStartDate = piStartDate;
	}

	public Date getPiTermDate() {
		return piTermDate;
	}

	public void setPiTermDate(Date piTermDate) {
		this.piTermDate = piTermDate;
	}

	public String getPiPartnerStatus() {
		return piPartnerStatus;
	}

	public void setPiPartnerStatus(String piPartnerStatus) {
		this.piPartnerStatus = piPartnerStatus;
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
