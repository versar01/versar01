package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SbeSubEquipDMO;
import com.eppixcomm.eppix.base.blo.SbuSubUpgradeDMO;
import com.eppixcomm.eppix.base.blo.VpkPackageDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class EtqSbuVpkSbdSbeDQO extends DBO implements Serializable {

	private EtqEtQuoteDMO etqDMO = null;
	private SbuSubUpgradeDMO sbuDMO = null;
	private VpkPackageDMO vpkDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	private SbeSubEquipDMO sbeDMO = null;

	private Integer etqQuoteNo;
	private String etqActionType;
	private String etqQuoteLevel;
	private String etqAccountNo;
	private Integer etqSubscriberId;
	private String etqMsisdnNo;
	private Integer etqRemainingMnt;
	private Date etqEffectiveDate;
	private Date etqContrEndDate;
	private Double etqMnthSubChrg;
	private Double etqDeviceCosts;
	private Double etqEtMigChrg;
	private Double etqEtMigDeviceChrg;
	private Date etqActionDate;
	private String etqActionUser;
	private String etqEtMigReason;
	private String etqOverrideUser;
	private Double etqOverrideChrg;
	private Double etqOverrideDeviceChrg;
	private String etqOverrideReason;
	private String etqOverrideFlag;
	private Integer etqNoticePerApply;
	private String etqQuoteEmailAddr;
	private String etqQuoteSplitChrg;
	private String etqQuoteStatus;
	private Date etqQuoteStatDate;
	private String etqQuoteStatUser;
	private Integer sbuSubupgradeId;
	private Integer sbuSubscriberId;
	private String sbuDealerId;
	private String sbuSalesPerson;
	private String sbuUpgradeQual;
	private String sbuComment;
	private String sbuUserId;
	private Integer sbuModelId;
	private Integer sbuContractLen;
	private BigDecimal sbuCost;
	private String sbuImei;
	private String sbuRegionCode;
	private String sbuAccountStatus;
	private String sbuCollPlan;
	private String sbuMtnStatus;
	private Date sbuActivateDate;
	private Date sbuDeactDate;
	private Integer sbuContractAge;
	private String sbuCustomerType;
	private String sbuTariffCode;
	private String sbuPackageCode;
	private String sbuPaymentPlan;
	private Date sbuTermDate;
	private String sbuAgeingBucket;
	private BigDecimal sbuAveragespend;
	private DateTime sbuDateprocessed;
	private DateTime sbuDateapproved;
	private String sbuUpgradeStatus;
	private String sbuChannel;
	private String sbuRecordStatus;
	private String vpkPackageCode;
	private String vpkPackageDesc;
	private String vpkTarplanRef;
	private String vpkChangeTariff;
	private String vpkSuspend;
	private Integer sbdSubscriberId;
	private String sbdDiallingNo;
	private String sbdBillAcNo;
	private Date sbdConnectDate;
	private Date sbdDconnectDate;
	private Date sbdTermDate;
	private String sbdTitle;
	private String sbdSurname;
	private String sbdFirstname;
	private String sbdGender;
	private Date sbdDob;
	private String sbdPassword;
	private String sbdLocationCode;
	private String sbdBillCycle;
	private String sbdPackageCode;
	private Date sbdBilledUpto;
	private String sbdTariffPlan;
	private Integer sbeSubEquipId;
	private Integer sbeSubscriberId;
	private String sbeImeiNo;
	private String sbeSerialNo;
	private String sbeWarehouse;
	private String sbeProductCode;
	private String sbeAntenna;
	private String sbeMsisdn;
	private String sbeImeiSimPair;
	private String sbeDealId;
	private String sbeGroupIdx;
	private Date sbeActiveDate;
	private Integer sbeUpgradeId;
	private String sbeMake;
	private String sbeModel;
	private String sbeDescription;
	private Double sbeHandsetVal;
	private Double sbeEarlytermChg;
	private Double sbeAddCharge1;
	private Double sbeAddCharge2;
	private String sbeDevicePriority;
	private Date sbeCaptureDate;
	private Date sbeDate1;
	private Date sbeDate2;
	private Date sbeDate3;
	private Integer sbeInt1;
	private Integer sbeInt2;
	private Integer sbeInt3;
	private Double sbeFloat1;
	private Double sbeFloat2;
	private Double sbeFloat3;
	private String sbeChar1;
	private String sbeChar2;
	private String sbeChar3;

	public static final int etqQuoteNoFilter = 0;

	public static final int etqActionTypeFilter = 1;
	private static final int etqActionTypeSize = 2;

	public static final int etqQuoteLevelFilter = 2;
	private static final int etqQuoteLevelSize = 1;

	public static final int etqAccountNoFilter = 3;
	private static final int etqAccountNoSize = 8;

	public static final int etqSubscriberIdFilter = 4;

	public static final int etqMsisdnNoFilter = 5;
	private static final int etqMsisdnNoSize = 15;

	public static final int etqRemainingMntFilter = 6;

	public static final int etqEffectiveDateFilter = 7;

	public static final int etqContrEndDateFilter = 8;

	public static final int etqMnthSubChrgFilter = 9;

	public static final int etqDeviceCostsFilter = 10;

	public static final int etqEtMigChrgFilter = 11;

	public static final int etqEtMigDeviceChrgFilter = 12;

	public static final int etqActionDateFilter = 13;

	public static final int etqActionUserFilter = 14;
	private static final int etqActionUserSize = 10;

	public static final int etqEtMigReasonFilter = 15;
	private static final int etqEtMigReasonSize = 4;

	public static final int etqOverrideUserFilter = 16;
	private static final int etqOverrideUserSize = 10;

	public static final int etqOverrideChrgFilter = 17;

	public static final int etqOverrideDeviceChrgFilter = 18;

	public static final int etqOverrideReasonFilter = 19;
	private static final int etqOverrideReasonSize = 20;

	public static final int etqOverrideFlagFilter = 20;
	private static final int etqOverrideFlagSize = 1;

	public static final int etqNoticePerApplyFilter = 21;

	public static final int etqQuoteEmailAddrFilter = 22;
	private static final int etqQuoteEmailAddrSize = 50;

	public static final int etqQuoteSplitChrgFilter = 23;
	private static final int etqQuoteSplitChrgSize = 1;

	public static final int etqQuoteStatusFilter = 24;
	private static final int etqQuoteStatusSize = 2;

	public static final int etqQuoteStatDateFilter = 25;

	public static final int etqQuoteStatUserFilter = 26;
	private static final int etqQuoteStatUserSize = 10;

	public static final int sbuSubupgradeIdFilter = 27;

	public static final int sbuSubscriberIdFilter = 28;

	public static final int sbuDealerIdFilter = 29;
	private static final int sbuDealerIdSize = 8;

	public static final int sbuSalesPersonFilter = 30;
	private static final int sbuSalesPersonSize = 10;

	public static final int sbuUpgradeQualFilter = 31;
	private static final int sbuUpgradeQualSize = 1;

	public static final int sbuCommentFilter = 32;
	private static final int sbuCommentSize = 64;

	public static final int sbuUserIdFilter = 33;
	private static final int sbuUserIdSize = 10;

	public static final int sbuModelIdFilter = 34;

	public static final int sbuContractLenFilter = 35;

	public static final int sbuCostFilter = 36;

	public static final int sbuImeiFilter = 37;
	private static final int sbuImeiSize = 15;

	public static final int sbuRegionCodeFilter = 38;
	private static final int sbuRegionCodeSize = 6;

	public static final int sbuAccountStatusFilter = 39;
	private static final int sbuAccountStatusSize = 15;

	public static final int sbuCollPlanFilter = 40;
	private static final int sbuCollPlanSize = 15;

	public static final int sbuMtnStatusFilter = 41;
	private static final int sbuMtnStatusSize = 15;

	public static final int sbuActivateDateFilter = 42;

	public static final int sbuDeactDateFilter = 43;

	public static final int sbuContractAgeFilter = 44;

	public static final int sbuCustomerTypeFilter = 45;
	private static final int sbuCustomerTypeSize = 5;

	public static final int sbuTariffCodeFilter = 46;
	private static final int sbuTariffCodeSize = 20;

	public static final int sbuPackageCodeFilter = 47;
	private static final int sbuPackageCodeSize = 5;

	public static final int sbuPaymentPlanFilter = 48;
	private static final int sbuPaymentPlanSize = 10;

	public static final int sbuTermDateFilter = 49;

	public static final int sbuAgeingBucketFilter = 50;
	private static final int sbuAgeingBucketSize = 10;

	public static final int sbuAveragespendFilter = 51;

	public static final int sbuDateprocessedFilter = 52;

	public static final int sbuDateapprovedFilter = 53;

	public static final int sbuUpgradeStatusFilter = 54;
	private static final int sbuUpgradeStatusSize = 1;

	public static final int sbuChannelFilter = 55;
	private static final int sbuChannelSize = 1;

	public static final int sbuRecordStatusFilter = 56;
	private static final int sbuRecordStatusSize = 1;

	public static final int vpkPackageCodeFilter = 57;
	private static final int vpkPackageCodeSize = 5;

	public static final int vpkPackageDescFilter = 58;
	private static final int vpkPackageDescSize = 32;

	public static final int vpkTarplanRefFilter = 59;
	private static final int vpkTarplanRefSize = 20;

	public static final int vpkChangeTariffFilter = 60;
	private static final int vpkChangeTariffSize = 1;

	public static final int vpkSuspendFilter = 61;
	private static final int vpkSuspendSize = 1;

	public static final int sbdSubscriberIdFilter = 62;

	public static final int sbdDiallingNoFilter = 63;
	private static final int sbdDiallingNoSize = 15;

	public static final int sbdBillAcNoFilter = 64;
	private static final int sbdBillAcNoSize = 8;

	public static final int sbdConnectDateFilter = 65;

	public static final int sbdDconnectDateFilter = 66;

	public static final int sbdTermDateFilter = 67;

	public static final int sbdTitleFilter = 68;
	private static final int sbdTitleSize = 10;

	public static final int sbdSurnameFilter = 69;
	private static final int sbdSurnameSize = 50;

	public static final int sbdFirstnameFilter = 70;
	private static final int sbdFirstnameSize = 50;

	public static final int sbdGenderFilter = 71;
	private static final int sbdGenderSize = 1;

	public static final int sbdDobFilter = 72;

	public static final int sbdPasswordFilter = 73;
	private static final int sbdPasswordSize = 20;

	public static final int sbdLocationCodeFilter = 74;
	private static final int sbdLocationCodeSize = 15;

	public static final int sbdBillCycleFilter = 75;
	private static final int sbdBillCycleSize = 5;

	public static final int sbdPackageCodeFilter = 76;
	private static final int sbdPackageCodeSize = 5;

	public static final int sbdBilledUptoFilter = 77;

	public static final int sbdTariffPlanFilter = 78;
	private static final int sbdTariffPlanSize = 20;

	public static final int sbeSubEquipIdFilter = 79;

	public static final int sbeSubscriberIdFilter = 80;

	public static final int sbeImeiNoFilter = 81;
	private static final int sbeImeiNoSize = 15;

	public static final int sbeSerialNoFilter = 82;
	private static final int sbeSerialNoSize = 16;

	public static final int sbeWarehouseFilter = 83;
	private static final int sbeWarehouseSize = 2;

	public static final int sbeProductCodeFilter = 84;
	private static final int sbeProductCodeSize = 20;

	public static final int sbeAntennaFilter = 85;
	private static final int sbeAntennaSize = 15;

	public static final int sbeMsisdnFilter = 86;
	private static final int sbeMsisdnSize = 15;

	public static final int sbeImeiSimPairFilter = 87;

	public static final int sbeDealIdFilter = 88;

	public static final int sbeGroupIdxFilter = 89;

	public static final int sbeActiveDateFilter = 90;

	public static final int sbeUpgradeIdFilter = 91;

	public static final int sbeMakeFilter = 92;

	public static final int sbeModelFilter = 93;

	public static final int sbeDescriptionFilter = 94;

	public static final int sbeHandsetValFilter = 95;

	public static final int sbeEarlytermChgFilter = 96;

	public static final int sbeAddCharge1Filter = 97;

	public static final int sbeAddCharge2Filter = 98;

	public static final int sbeDevicePriorityFilter = 99;
	private static final int sbeDevicePrioritySize = 1;

	public static final int sbeCaptureDateFilter = 100;

	public static final int sbeDate1Filter = 101;

	public static final int sbeDate2Filter = 102;

	public static final int sbeDate3Filter = 103;

	public static final int sbeInt1Filter = 104;

	public static final int sbeInt2Filter = 105;

	public static final int sbeInt3Filter = 106;

	public static final int sbeFloat1Filter = 107;

	public static final int sbeFloat2Filter = 108;

	public static final int sbeFloat3Filter = 109;

	public static final int sbeChar1Filter = 110;

	public static final int sbeChar2Filter = 111;

	public static final int sbeChar3Filter = 112;

	public EtqSbuVpkSbdSbeDQO() {
	};

	public EtqSbuVpkSbdSbeDQO(final Integer etqQuoteNo, final String etqActionType, final String etqQuoteLevel,
			final String etqAccountNo, final Integer etqSubscriberId, final String etqMsisdnNo,
			final Integer etqRemainingMnt, final Date etqEffectiveDate, final Date etqContrEndDate,
			final Double etqMnthSubChrg, final Double etqDeviceCosts, final Double etqEtMigChrg,
			final Double etqEtMigDeviceChrg, final Date etqActionDate, final String etqActionUser,
			final String etqEtMigReason, final String etqOverrideUser, final Double etqOverrideChrg,
			final Double etqOverrideDeviceChrg, final String etqOverrideReason, final String etqOverrideFlag,
			final Integer etqNoticePerApply, final String etqQuoteEmailAddr, final String etqQuoteSplitChrg,
			final String etqQuoteStatus, final Date etqQuoteStatDate, final String etqQuoteStatUser,
			final Integer sbuSubupgradeId, final Integer sbuSubscriberId, final String sbuDealerId,
			final String sbuSalesPerson, final String sbuUpgradeQual, final String sbuComment, final String sbuUserId,
			final Integer sbuModelId, final Integer sbuContractLen, final BigDecimal sbuCost, final String sbuImei,
			final String sbuRegionCode, final String sbuAccountStatus, final String sbuCollPlan,
			final String sbuMtnStatus, final Date sbuActivateDate, final Date sbuDeactDate,
			final Integer sbuContractAge, final String sbuCustomerType, final String sbuTariffCode,
			final String sbuPackageCode, final String sbuPaymentPlan, final Date sbuTermDate,
			final String sbuAgeingBucket, final BigDecimal sbuAveragespend, final DateTime sbuDateprocessed,
			final DateTime sbuDateapproved, final String sbuUpgradeStatus, final String sbuChannel,
			final String sbuRecordStatus, final String vpkPackageCode, final String vpkPackageDesc,
			final String vpkTarplanRef, final String vpkChangeTariff, final String vpkSuspend,
			final Integer sbdSubscriberId, final String sbdDiallingNo, final String sbdBillAcNo,
			final Date sbdConnectDate, final Date sbdDconnectDate, final Date sbdTermDate, final String sbdTitle,
			final String sbdSurname, final String sbdFirstname, final String sbdGender, final Date sbdDob,
			final String sbdPassword, final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto, final String sbdTariffPlan,
			final Integer sbeSubEquipId, final Integer sbeSubscriberId, final String sbeImeiNo,
			final String sbeSerialNo, final String sbeWarehouse, final String sbeProductCode, final String sbeAntenna,
			final String sbeMsisdn, final String sbeImeiSimPair, final String sbeDealId, final String sbeGroupIdx,
			final Date sbeActiveDate, final Integer sbeUpgradeId, final String sbeMake, final String sbeModel,
			final String sbeDescription, final Double sbeHandsetVal, final Double sbeEarlytermChg,
			final Double sbeAddCharge1, final Double sbeAddCharge2, final String sbeDevicePriority,
			final Date sbeCaptureDate, final Date sbeDate1, final Date sbeDate2, final Date sbeDate3,
			final Integer sbeInt1, final Integer sbeInt2, final Integer sbeInt3, final Double sbeFloat1,
			final Double sbeFloat2, final Double sbeFloat3, final String sbeChar1, final String sbeChar2,
			final String sbeChar3) {

		this.etqQuoteNo = etqQuoteNo;
		this.etqActionType = etqActionType;
		this.etqQuoteLevel = etqQuoteLevel;
		this.etqAccountNo = etqAccountNo;
		this.etqSubscriberId = etqSubscriberId;
		this.etqMsisdnNo = etqMsisdnNo;
		this.etqRemainingMnt = etqRemainingMnt;
		this.etqEffectiveDate = etqEffectiveDate;
		this.etqContrEndDate = etqContrEndDate;
		this.etqMnthSubChrg = etqMnthSubChrg;
		this.etqDeviceCosts = etqDeviceCosts;
		this.etqEtMigChrg = etqEtMigChrg;
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
		this.etqActionDate = etqActionDate;
		this.etqActionUser = etqActionUser;
		this.etqEtMigReason = etqEtMigReason;
		this.etqOverrideUser = etqOverrideUser;
		this.etqOverrideChrg = etqOverrideChrg;
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
		this.etqOverrideReason = etqOverrideReason;
		this.etqOverrideFlag = etqOverrideFlag;
		this.etqNoticePerApply = etqNoticePerApply;
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
		this.etqQuoteStatus = etqQuoteStatus;
		this.etqQuoteStatDate = etqQuoteStatDate;
		this.etqQuoteStatUser = etqQuoteStatUser;
		this.sbuSubupgradeId = sbuSubupgradeId;
		this.sbuSubscriberId = sbuSubscriberId;
		this.sbuDealerId = sbuDealerId;
		this.sbuSalesPerson = sbuSalesPerson;
		this.sbuUpgradeQual = sbuUpgradeQual;
		this.sbuComment = sbuComment;
		this.sbuUserId = sbuUserId;
		this.sbuModelId = sbuModelId;
		this.sbuContractLen = sbuContractLen;
		this.sbuCost = sbuCost;
		this.sbuImei = sbuImei;
		this.sbuRegionCode = sbuRegionCode;
		this.sbuAccountStatus = sbuAccountStatus;
		this.sbuCollPlan = sbuCollPlan;
		this.sbuMtnStatus = sbuMtnStatus;
		this.sbuActivateDate = sbuActivateDate;
		this.sbuDeactDate = sbuDeactDate;
		this.sbuContractAge = sbuContractAge;
		this.sbuCustomerType = sbuCustomerType;
		this.sbuTariffCode = sbuTariffCode;
		this.sbuPackageCode = sbuPackageCode;
		this.sbuPaymentPlan = sbuPaymentPlan;
		this.sbuTermDate = sbuTermDate;
		this.sbuAgeingBucket = sbuAgeingBucket;
		this.sbuAveragespend = sbuAveragespend;
		this.sbuDateprocessed = sbuDateprocessed;
		this.sbuDateapproved = sbuDateapproved;
		this.sbuUpgradeStatus = sbuUpgradeStatus;
		this.sbuChannel = sbuChannel;
		this.sbuRecordStatus = sbuRecordStatus;
		this.vpkPackageCode = vpkPackageCode;
		this.vpkPackageDesc = vpkPackageDesc;
		this.vpkTarplanRef = vpkTarplanRef;
		this.vpkChangeTariff = vpkChangeTariff;
		this.vpkSuspend = vpkSuspend;
		this.sbdSubscriberId = sbdSubscriberId;
		this.sbdDiallingNo = sbdDiallingNo;
		this.sbdBillAcNo = sbdBillAcNo;
		this.sbdConnectDate = sbdConnectDate;
		this.sbdDconnectDate = sbdDconnectDate;
		this.sbdTermDate = sbdTermDate;
		this.sbdTitle = sbdTitle;
		this.sbdSurname = sbdSurname;
		this.sbdFirstname = sbdFirstname;
		this.sbdGender = sbdGender;
		this.sbdDob = sbdDob;
		this.sbdPassword = sbdPassword;
		this.sbdLocationCode = sbdLocationCode;
		this.sbdBillCycle = sbdBillCycle;
		this.sbdPackageCode = sbdPackageCode;
		this.sbdBilledUpto = sbdBilledUpto;
		this.sbdTariffPlan = sbdTariffPlan;
		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeImeiSimPair = sbeImeiSimPair;
		this.sbeDealId = sbeDealId;
		this.sbeGroupIdx = sbeGroupIdx;
		this.sbeActiveDate = sbeActiveDate;
		this.sbeUpgradeId = sbeUpgradeId;
		this.sbeMake = sbeMake;
		this.sbeModel = sbeModel;
		this.sbeDescription = sbeDescription;
		this.sbeHandsetVal = sbeHandsetVal;
		this.sbeEarlytermChg = sbeEarlytermChg;
		this.sbeAddCharge1 = sbeAddCharge1;
		this.sbeAddCharge2 = sbeAddCharge2;
		this.sbeDevicePriority = sbeDevicePriority;
		this.sbeCaptureDate = sbeCaptureDate;
		this.sbeDate1 = sbeDate1;
		this.sbeDate2 = sbeDate2;
		this.sbeDate3 = sbeDate3;
		this.sbeInt1 = sbeInt1;
		this.sbeInt2 = sbeInt2;
		this.sbeInt3 = sbeInt3;
		this.sbeFloat1 = sbeFloat1;
		this.sbeFloat2 = sbeFloat2;
		this.sbeFloat3 = sbeFloat3;
		this.sbeChar1 = sbeChar1;
		this.sbeChar2 = sbeChar2;
		this.sbeChar3 = sbeChar3;
	};

	public void deConstruct() {

		etqDMO = new EtqEtQuoteDMO(etqQuoteNo, etqActionType, etqQuoteLevel, etqAccountNo, etqSubscriberId, etqMsisdnNo,
				etqRemainingMnt, etqEffectiveDate, etqContrEndDate, etqMnthSubChrg, etqDeviceCosts, etqEtMigChrg,
				etqEtMigDeviceChrg, etqActionDate, etqActionUser, etqEtMigReason, etqOverrideUser, etqOverrideChrg,
				etqOverrideDeviceChrg, etqOverrideReason, etqOverrideFlag, etqNoticePerApply, etqQuoteEmailAddr,
				etqQuoteSplitChrg, etqQuoteStatus, etqQuoteStatDate, etqQuoteStatUser);

		sbuDMO = new SbuSubUpgradeDMO(sbuSubupgradeId, sbuSubscriberId, sbuDealerId, sbuSalesPerson, sbuUpgradeQual,
				sbuComment, sbuUserId, sbuModelId, sbuContractLen, sbuCost, sbuImei, sbuRegionCode, sbuAccountStatus,
				sbuCollPlan, sbuMtnStatus, sbuActivateDate, sbuDeactDate, sbuContractAge, sbuCustomerType,
				sbuTariffCode, sbuPackageCode, sbuPaymentPlan, sbuTermDate, sbuAgeingBucket, sbuAveragespend,
				sbuDateprocessed, sbuDateapproved, sbuUpgradeStatus, sbuChannel, sbuRecordStatus);

		vpkDMO = new VpkPackageDMO(vpkPackageCode, vpkPackageDesc, vpkTarplanRef, vpkChangeTariff, vpkSuspend);

		sbdDMO = new SbdSubDetsDMO(sbdSubscriberId, sbdDiallingNo, sbdBillAcNo, sbdConnectDate, sbdDconnectDate,
				sbdTermDate, sbdTitle, sbdSurname, sbdFirstname, sbdGender, sbdDob, sbdPassword, sbdLocationCode,
				sbdBillCycle, sbdPackageCode, sbdBilledUpto, sbdTariffPlan);

		sbeDMO = new SbeSubEquipDMO(sbeSubEquipId, sbeSubscriberId, sbeImeiNo, sbeSerialNo, sbeWarehouse,
				sbeProductCode, sbeAntenna, sbeMsisdn, sbeImeiSimPair, sbeDealId, sbeGroupIdx, sbeActiveDate,
				sbeUpgradeId, sbeMake, sbeModel, sbeDescription, sbeHandsetVal, sbeEarlytermChg, sbeAddCharge1,
				sbeAddCharge2, sbeDevicePriority, sbeCaptureDate, sbeDate1, sbeDate2, sbeDate3, sbeInt1, sbeInt2,
				sbeInt3, sbeFloat1, sbeFloat2, sbeFloat3, sbeChar1, sbeChar2, sbeChar3);
	}

	private static final int[] fieldSizes = new int[] { 0, etqActionTypeSize, etqQuoteLevelSize, etqAccountNoSize, 0,
			etqMsisdnNoSize, 0, 0, 0, 0, 0, 0, 0, 0, etqActionUserSize, etqEtMigReasonSize, etqOverrideUserSize, 0, 0,
			etqOverrideReasonSize, etqOverrideFlagSize, 0, etqQuoteEmailAddrSize, etqQuoteSplitChrgSize,
			etqQuoteStatusSize, 0, etqQuoteStatUserSize, 0, 0, sbuDealerIdSize, sbuSalesPersonSize, sbuUpgradeQualSize,
			sbuCommentSize, sbuUserIdSize, 0, 0, 0, sbuImeiSize, sbuRegionCodeSize, sbuAccountStatusSize,
			sbuCollPlanSize, sbuMtnStatusSize, 0, 0, 0, sbuCustomerTypeSize, sbuTariffCodeSize, sbuPackageCodeSize,
			sbuPaymentPlanSize, 0, sbuAgeingBucketSize, 0, 0, 0, sbuUpgradeStatusSize, sbuChannelSize,
			sbuRecordStatusSize, vpkPackageCodeSize, vpkPackageDescSize, vpkTarplanRefSize, vpkChangeTariffSize,
			vpkSuspendSize, 0, sbdDiallingNoSize, sbdBillAcNoSize, 0, 0, 0, sbdTitleSize, sbdSurnameSize,
			sbdFirstnameSize, sbdGenderSize, 0, sbdPasswordSize, sbdLocationCodeSize, sbdBillCycleSize,
			sbdPackageCodeSize, 0, sbdTariffPlanSize, 0, 0, sbeImeiNoSize, sbeSerialNoSize, sbeWarehouseSize,
			sbeProductCodeSize, sbeAntennaSize, sbeMsisdnSize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			sbeDevicePrioritySize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.etqQuoteNo,
				((this.etqActionType == null) ? null
						: (this.etqActionType.length() <= etqActionTypeSize) ? this.etqActionType
								: this.etqActionType.substring(0, this.etqActionTypeSize)),
				((this.etqQuoteLevel == null) ? null
						: (this.etqQuoteLevel.length() <= etqQuoteLevelSize) ? this.etqQuoteLevel
								: this.etqQuoteLevel.substring(0, this.etqQuoteLevelSize)),
				((this.etqAccountNo == null) ? null
						: (this.etqAccountNo.length() <= etqAccountNoSize) ? this.etqAccountNo
								: this.etqAccountNo.substring(0, this.etqAccountNoSize)),
				this.etqSubscriberId,
				((this.etqMsisdnNo == null) ? null
						: (this.etqMsisdnNo.length() <= etqMsisdnNoSize) ? this.etqMsisdnNo
								: this.etqMsisdnNo.substring(0, this.etqMsisdnNoSize)),
				this.etqRemainingMnt, this.etqEffectiveDate, this.etqContrEndDate, this.etqMnthSubChrg,
				this.etqDeviceCosts, this.etqEtMigChrg, this.etqEtMigDeviceChrg, this.etqActionDate,
				((this.etqActionUser == null) ? null
						: (this.etqActionUser.length() <= etqActionUserSize) ? this.etqActionUser
								: this.etqActionUser.substring(0, this.etqActionUserSize)),
				((this.etqEtMigReason == null) ? null
						: (this.etqEtMigReason.length() <= etqEtMigReasonSize) ? this.etqEtMigReason
								: this.etqEtMigReason.substring(0, this.etqEtMigReasonSize)),
				((this.etqOverrideUser == null) ? null
						: (this.etqOverrideUser.length() <= etqOverrideUserSize) ? this.etqOverrideUser
								: this.etqOverrideUser.substring(0, this.etqOverrideUserSize)),
				this.etqOverrideChrg, this.etqOverrideDeviceChrg,
				((this.etqOverrideReason == null) ? null
						: (this.etqOverrideReason.length() <= etqOverrideReasonSize) ? this.etqOverrideReason
								: this.etqOverrideReason.substring(0, this.etqOverrideReasonSize)),
				((this.etqOverrideFlag == null) ? null
						: (this.etqOverrideFlag.length() <= etqOverrideFlagSize) ? this.etqOverrideFlag
								: this.etqOverrideFlag.substring(0, this.etqOverrideFlagSize)),
				this.etqNoticePerApply,
				((this.etqQuoteEmailAddr == null) ? null
						: (this.etqQuoteEmailAddr.length() <= etqQuoteEmailAddrSize) ? this.etqQuoteEmailAddr
								: this.etqQuoteEmailAddr.substring(0, this.etqQuoteEmailAddrSize)),
				((this.etqQuoteSplitChrg == null) ? null
						: (this.etqQuoteSplitChrg.length() <= etqQuoteSplitChrgSize) ? this.etqQuoteSplitChrg
								: this.etqQuoteSplitChrg.substring(0, this.etqQuoteSplitChrgSize)),
				((this.etqQuoteStatus == null) ? null
						: (this.etqQuoteStatus.length() <= etqQuoteStatusSize) ? this.etqQuoteStatus
								: this.etqQuoteStatus.substring(0, this.etqQuoteStatusSize)),
				this.etqQuoteStatDate,
				((this.etqQuoteStatUser == null) ? null
						: (this.etqQuoteStatUser.length() <= etqQuoteStatUserSize) ? this.etqQuoteStatUser
								: this.etqQuoteStatUser.substring(0, this.etqQuoteStatUserSize)),
				this.sbuSubupgradeId, this.sbuSubscriberId,
				((this.sbuDealerId == null) ? null
						: (this.sbuDealerId.length() <= sbuDealerIdSize) ? this.sbuDealerId
								: this.sbuDealerId.substring(0, this.sbuDealerIdSize)),
				((this.sbuSalesPerson == null) ? null
						: (this.sbuSalesPerson.length() <= sbuSalesPersonSize) ? this.sbuSalesPerson
								: this.sbuSalesPerson.substring(0, this.sbuSalesPersonSize)),
				((this.sbuUpgradeQual == null) ? null
						: (this.sbuUpgradeQual.length() <= sbuUpgradeQualSize) ? this.sbuUpgradeQual
								: this.sbuUpgradeQual.substring(0, this.sbuUpgradeQualSize)),
				((this.sbuComment == null) ? null
						: (this.sbuComment.length() <= sbuCommentSize) ? this.sbuComment
								: this.sbuComment.substring(0, this.sbuCommentSize)),
				((this.sbuUserId == null) ? null
						: (this.sbuUserId.length() <= sbuUserIdSize) ? this.sbuUserId
								: this.sbuUserId.substring(0, this.sbuUserIdSize)),
				this.sbuModelId, this.sbuContractLen, this.sbuCost,
				((this.sbuImei == null) ? null
						: (this.sbuImei.length() <= sbuImeiSize) ? this.sbuImei
								: this.sbuImei.substring(0, this.sbuImeiSize)),
				((this.sbuRegionCode == null) ? null
						: (this.sbuRegionCode.length() <= sbuRegionCodeSize) ? this.sbuRegionCode
								: this.sbuRegionCode.substring(0, this.sbuRegionCodeSize)),
				((this.sbuAccountStatus == null) ? null
						: (this.sbuAccountStatus.length() <= sbuAccountStatusSize) ? this.sbuAccountStatus
								: this.sbuAccountStatus.substring(0, this.sbuAccountStatusSize)),
				((this.sbuCollPlan == null) ? null
						: (this.sbuCollPlan.length() <= sbuCollPlanSize) ? this.sbuCollPlan
								: this.sbuCollPlan.substring(0, this.sbuCollPlanSize)),
				((this.sbuMtnStatus == null) ? null
						: (this.sbuMtnStatus.length() <= sbuMtnStatusSize) ? this.sbuMtnStatus
								: this.sbuMtnStatus.substring(0, this.sbuMtnStatusSize)),
				this.sbuActivateDate, this.sbuDeactDate, this.sbuContractAge,
				((this.sbuCustomerType == null) ? null
						: (this.sbuCustomerType.length() <= sbuCustomerTypeSize) ? this.sbuCustomerType
								: this.sbuCustomerType.substring(0, this.sbuCustomerTypeSize)),
				((this.sbuTariffCode == null) ? null
						: (this.sbuTariffCode.length() <= sbuTariffCodeSize) ? this.sbuTariffCode
								: this.sbuTariffCode.substring(0, this.sbuTariffCodeSize)),
				((this.sbuPackageCode == null) ? null
						: (this.sbuPackageCode.length() <= sbuPackageCodeSize) ? this.sbuPackageCode
								: this.sbuPackageCode.substring(0, this.sbuPackageCodeSize)),
				((this.sbuPaymentPlan == null) ? null
						: (this.sbuPaymentPlan.length() <= sbuPaymentPlanSize) ? this.sbuPaymentPlan
								: this.sbuPaymentPlan.substring(0, this.sbuPaymentPlanSize)),
				this.sbuTermDate,
				((this.sbuAgeingBucket == null) ? null
						: (this.sbuAgeingBucket.length() <= sbuAgeingBucketSize) ? this.sbuAgeingBucket
								: this.sbuAgeingBucket.substring(0, this.sbuAgeingBucketSize)),
				this.sbuAveragespend, this.sbuDateprocessed, this.sbuDateapproved,
				((this.sbuUpgradeStatus == null) ? null
						: (this.sbuUpgradeStatus.length() <= sbuUpgradeStatusSize) ? this.sbuUpgradeStatus
								: this.sbuUpgradeStatus.substring(0, this.sbuUpgradeStatusSize)),
				((this.sbuChannel == null) ? null
						: (this.sbuChannel.length() <= sbuChannelSize) ? this.sbuChannel
								: this.sbuChannel.substring(0, this.sbuChannelSize)),
				((this.sbuRecordStatus == null) ? null
						: (this.sbuRecordStatus.length() <= sbuRecordStatusSize) ? this.sbuRecordStatus
								: this.sbuRecordStatus.substring(0, this.sbuRecordStatusSize)),
				((this.vpkPackageCode == null) ? null
						: (this.vpkPackageCode.length() <= vpkPackageCodeSize) ? this.vpkPackageCode
								: this.vpkPackageCode.substring(0, this.vpkPackageCodeSize)),
				((this.vpkPackageDesc == null) ? null
						: (this.vpkPackageDesc.length() <= vpkPackageDescSize) ? this.vpkPackageDesc
								: this.vpkPackageDesc.substring(0, this.vpkPackageDescSize)),
				((this.vpkTarplanRef == null) ? null
						: (this.vpkTarplanRef.length() <= vpkTarplanRefSize) ? this.vpkTarplanRef
								: this.vpkTarplanRef.substring(0, this.vpkTarplanRefSize)),
				((this.vpkChangeTariff == null) ? null
						: (this.vpkChangeTariff.length() <= vpkChangeTariffSize) ? this.vpkChangeTariff
								: this.vpkChangeTariff.substring(0, this.vpkChangeTariffSize)),
				((this.vpkSuspend == null) ? null
						: (this.vpkSuspend.length() <= vpkSuspendSize) ? this.vpkSuspend
								: this.vpkSuspend.substring(0, this.vpkSuspendSize)),
				this.sbdSubscriberId,
				((this.sbdDiallingNo == null) ? null
						: (this.sbdDiallingNo.length() <= sbdDiallingNoSize) ? this.sbdDiallingNo
								: this.sbdDiallingNo.substring(0, this.sbdDiallingNoSize)),
				((this.sbdBillAcNo == null) ? null
						: (this.sbdBillAcNo.length() <= sbdBillAcNoSize) ? this.sbdBillAcNo
								: this.sbdBillAcNo.substring(0, this.sbdBillAcNoSize)),
				this.sbdConnectDate, this.sbdDconnectDate, this.sbdTermDate,
				((this.sbdTitle == null) ? null
						: (this.sbdTitle.length() <= sbdTitleSize) ? this.sbdTitle
								: this.sbdTitle.substring(0, this.sbdTitleSize)),
				((this.sbdSurname == null) ? null
						: (this.sbdSurname.length() <= sbdSurnameSize) ? this.sbdSurname
								: this.sbdSurname.substring(0, this.sbdSurnameSize)),
				((this.sbdFirstname == null) ? null
						: (this.sbdFirstname.length() <= sbdFirstnameSize) ? this.sbdFirstname
								: this.sbdFirstname.substring(0, this.sbdFirstnameSize)),
				((this.sbdGender == null) ? null
						: (this.sbdGender.length() <= sbdGenderSize) ? this.sbdGender
								: this.sbdGender.substring(0, this.sbdGenderSize)),
				this.sbdDob,
				((this.sbdPassword == null) ? null
						: (this.sbdPassword.length() <= sbdPasswordSize) ? this.sbdPassword
								: this.sbdPassword.substring(0, this.sbdPasswordSize)),
				((this.sbdLocationCode == null) ? null
						: (this.sbdLocationCode.length() <= sbdLocationCodeSize) ? this.sbdLocationCode
								: this.sbdLocationCode.substring(0, this.sbdLocationCodeSize)),
				((this.sbdBillCycle == null) ? null
						: (this.sbdBillCycle.length() <= sbdBillCycleSize) ? this.sbdBillCycle
								: this.sbdBillCycle.substring(0, this.sbdBillCycleSize)),
				((this.sbdPackageCode == null) ? null
						: (this.sbdPackageCode.length() <= sbdPackageCodeSize) ? this.sbdPackageCode
								: this.sbdPackageCode.substring(0, this.sbdPackageCodeSize)),
				this.sbdBilledUpto,
				((this.sbdTariffPlan == null) ? null
						: (this.sbdTariffPlan.length() <= sbdTariffPlanSize) ? this.sbdTariffPlan
								: this.sbdTariffPlan.substring(0, this.sbdTariffPlanSize)),
				this.sbeSubEquipId, this.sbeSubscriberId,
				((this.sbeImeiNo == null) ? null
						: (this.sbeImeiNo.length() <= sbeImeiNoSize) ? this.sbeImeiNo
								: this.sbeImeiNo.substring(0, this.sbeImeiNoSize)),
				((this.sbeSerialNo == null) ? null
						: (this.sbeSerialNo.length() <= sbeSerialNoSize) ? this.sbeSerialNo
								: this.sbeSerialNo.substring(0, this.sbeSerialNoSize)),
				((this.sbeWarehouse == null) ? null
						: (this.sbeWarehouse.length() <= sbeWarehouseSize) ? this.sbeWarehouse
								: this.sbeWarehouse.substring(0, this.sbeWarehouseSize)),
				((this.sbeProductCode == null) ? null
						: (this.sbeProductCode.length() <= sbeProductCodeSize) ? this.sbeProductCode
								: this.sbeProductCode.substring(0, this.sbeProductCodeSize)),
				((this.sbeAntenna == null) ? null
						: (this.sbeAntenna.length() <= sbeAntennaSize) ? this.sbeAntenna
								: this.sbeAntenna.substring(0, this.sbeAntennaSize)),
				((this.sbeMsisdn == null) ? null
						: (this.sbeMsisdn.length() <= sbeMsisdnSize) ? this.sbeMsisdn
								: this.sbeMsisdn.substring(0, this.sbeMsisdnSize)),
				this.sbeImeiSimPair, this.sbeDealId, this.sbeGroupIdx, this.sbeActiveDate, this.sbeUpgradeId,
				this.sbeMake, this.sbeModel, this.sbeDescription, this.sbeHandsetVal, this.sbeEarlytermChg,
				this.sbeAddCharge1, this.sbeAddCharge2,
				((this.sbeDevicePriority == null) ? null
						: (this.sbeDevicePriority.length() <= sbeDevicePrioritySize) ? this.sbeDevicePriority
								: this.sbeDevicePriority.substring(0, this.sbeDevicePrioritySize)),
				this.sbeCaptureDate, this.sbeDate1, this.sbeDate2, this.sbeDate3, this.sbeInt1, this.sbeInt2,
				this.sbeInt3, this.sbeFloat1, this.sbeFloat2, this.sbeFloat3, this.sbeChar1, this.sbeChar2,
				this.sbeChar3 };
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
		this.etqQuoteNo = ((Integer) fields[0]);
		this.etqActionType = rtrim((String) fields[1]);

		this.etqQuoteLevel = rtrim((String) fields[2]);

		this.etqAccountNo = rtrim((String) fields[3]);

		this.etqSubscriberId = ((Integer) fields[4]);
		this.etqMsisdnNo = rtrim((String) fields[5]);

		this.etqRemainingMnt = ((Integer) fields[6]);
		this.etqEffectiveDate = ((fields[7] == null) ? null : new Date(fields[7]));
		this.etqContrEndDate = ((fields[8] == null) ? null : new Date(fields[8]));
		this.etqMnthSubChrg = ((Double) fields[9]);
		this.etqDeviceCosts = ((Double) fields[10]);
		this.etqEtMigChrg = ((Double) fields[11]);
		this.etqEtMigDeviceChrg = ((Double) fields[12]);
		this.etqActionDate = ((fields[13] == null) ? null : new Date(fields[13]));
		this.etqActionUser = rtrim((String) fields[14]);

		this.etqEtMigReason = rtrim((String) fields[15]);

		this.etqOverrideUser = rtrim((String) fields[16]);

		this.etqOverrideChrg = ((Double) fields[17]);
		this.etqOverrideDeviceChrg = ((Double) fields[18]);
		this.etqOverrideReason = rtrim((String) fields[19]);

		this.etqOverrideFlag = rtrim((String) fields[20]);

		this.etqNoticePerApply = ((Integer) fields[21]);
		this.etqQuoteEmailAddr = rtrim((String) fields[22]);

		this.etqQuoteSplitChrg = rtrim((String) fields[23]);

		this.etqQuoteStatus = rtrim((String) fields[24]);

		this.etqQuoteStatDate = ((fields[25] == null) ? null : new Date(fields[25]));
		this.etqQuoteStatUser = rtrim((String) fields[26]);

		this.sbuSubupgradeId = ((Integer) fields[27]);
		this.sbuSubscriberId = ((Integer) fields[28]);
		this.sbuDealerId = rtrim((String) fields[29]);

		this.sbuSalesPerson = rtrim((String) fields[30]);

		this.sbuUpgradeQual = rtrim((String) fields[31]);

		this.sbuComment = rtrim((String) fields[32]);

		this.sbuUserId = rtrim((String) fields[33]);

		this.sbuModelId = ((Integer) fields[34]);
		this.sbuContractLen = ((Integer) fields[35]);
		this.sbuCost = ((BigDecimal) fields[36]);
		this.sbuImei = rtrim((String) fields[37]);

		this.sbuRegionCode = rtrim((String) fields[38]);

		this.sbuAccountStatus = rtrim((String) fields[39]);

		this.sbuCollPlan = rtrim((String) fields[40]);

		this.sbuMtnStatus = rtrim((String) fields[41]);

		this.sbuActivateDate = ((fields[42] == null) ? null : new Date(fields[42]));
		this.sbuDeactDate = ((fields[43] == null) ? null : new Date(fields[43]));
		this.sbuContractAge = ((fields[44] == null) ? null : new Integer((Short) fields[44]));
		this.sbuCustomerType = rtrim((String) fields[45]);

		this.sbuTariffCode = rtrim((String) fields[46]);

		this.sbuPackageCode = rtrim((String) fields[47]);

		this.sbuPaymentPlan = rtrim((String) fields[48]);

		this.sbuTermDate = ((fields[49] == null) ? null : new Date(fields[49]));
		this.sbuAgeingBucket = rtrim((String) fields[50]);

		this.sbuAveragespend = ((BigDecimal) fields[51]);
		this.sbuDateprocessed = (sbuDateprocessed != null) ? new DateTime(sbuDateprocessed) : null;
		this.sbuDateapproved = (sbuDateapproved != null) ? new DateTime(sbuDateapproved) : null;
		this.sbuUpgradeStatus = rtrim((String) fields[54]);

		this.sbuChannel = rtrim((String) fields[55]);

		this.sbuRecordStatus = rtrim((String) fields[56]);

		this.vpkPackageCode = rtrim((String) fields[57]);

		this.vpkPackageDesc = rtrim((String) fields[58]);

		this.vpkTarplanRef = rtrim((String) fields[59]);

		this.vpkChangeTariff = rtrim((String) fields[60]);

		this.vpkSuspend = rtrim((String) fields[61]);

		this.sbdSubscriberId = ((Integer) fields[62]);
		this.sbdDiallingNo = rtrim((String) fields[63]);

		this.sbdBillAcNo = rtrim((String) fields[64]);

		this.sbdConnectDate = ((fields[65] == null) ? null : new Date(fields[65]));
		this.sbdDconnectDate = ((fields[66] == null) ? null : new Date(fields[66]));
		this.sbdTermDate = ((fields[67] == null) ? null : new Date(fields[67]));
		this.sbdTitle = rtrim((String) fields[68]);

		this.sbdSurname = rtrim((String) fields[69]);

		this.sbdFirstname = rtrim((String) fields[70]);

		this.sbdGender = rtrim((String) fields[71]);

		this.sbdDob = ((fields[72] == null) ? null : new Date(fields[72]));
		this.sbdPassword = rtrim((String) fields[73]);

		this.sbdLocationCode = rtrim((String) fields[74]);

		this.sbdBillCycle = rtrim((String) fields[75]);

		this.sbdPackageCode = rtrim((String) fields[76]);

		this.sbdBilledUpto = ((fields[77] == null) ? null : new Date(fields[77]));
		this.sbdTariffPlan = rtrim((String) fields[78]);

		this.sbeSubEquipId = ((Integer) fields[79]);
		this.sbeSubscriberId = ((Integer) fields[80]);
		this.sbeImeiNo = rtrim((String) fields[81]);

		this.sbeSerialNo = rtrim((String) fields[82]);

		this.sbeWarehouse = rtrim((String) fields[83]);

		this.sbeProductCode = rtrim((String) fields[84]);

		this.sbeAntenna = rtrim((String) fields[85]);

		this.sbeMsisdn = rtrim((String) fields[86]);

		this.sbeImeiSimPair = ((String) fields[87]);
		this.sbeDealId = ((String) fields[88]);
		this.sbeGroupIdx = ((String) fields[89]);
		this.sbeActiveDate = ((fields[90] == null) ? null : new Date(fields[90]));
		this.sbeUpgradeId = ((Integer) fields[91]);
		this.sbeMake = ((String) fields[92]);
		this.sbeModel = ((String) fields[93]);
		this.sbeDescription = ((String) fields[94]);
		this.sbeHandsetVal = ((Double) fields[95]);
		this.sbeEarlytermChg = ((Double) fields[96]);
		this.sbeAddCharge1 = ((Double) fields[97]);
		this.sbeAddCharge2 = ((Double) fields[98]);
		this.sbeDevicePriority = rtrim((String) fields[99]);

		this.sbeCaptureDate = ((fields[100] == null) ? null : new Date(fields[100]));
		this.sbeDate1 = ((fields[101] == null) ? null : new Date(fields[101]));
		this.sbeDate2 = ((fields[102] == null) ? null : new Date(fields[102]));
		this.sbeDate3 = ((fields[103] == null) ? null : new Date(fields[103]));
		this.sbeInt1 = ((Integer) fields[104]);
		this.sbeInt2 = ((Integer) fields[105]);
		this.sbeInt3 = ((Integer) fields[106]);
		this.sbeFloat1 = ((Double) fields[107]);
		this.sbeFloat2 = ((Double) fields[108]);
		this.sbeFloat3 = ((Double) fields[109]);
		this.sbeChar1 = ((String) fields[110]);
		this.sbeChar2 = ((String) fields[111]);
		this.sbeChar3 = ((String) fields[112]);
	}

	public void set(final Integer etqQuoteNo, final String etqActionType, final String etqQuoteLevel,
			final String etqAccountNo, final Integer etqSubscriberId, final String etqMsisdnNo,
			final Integer etqRemainingMnt, final Date etqEffectiveDate, final Date etqContrEndDate,
			final Double etqMnthSubChrg, final Double etqDeviceCosts, final Double etqEtMigChrg,
			final Double etqEtMigDeviceChrg, final Date etqActionDate, final String etqActionUser,
			final String etqEtMigReason, final String etqOverrideUser, final Double etqOverrideChrg,
			final Double etqOverrideDeviceChrg, final String etqOverrideReason, final String etqOverrideFlag,
			final Integer etqNoticePerApply, final String etqQuoteEmailAddr, final String etqQuoteSplitChrg,
			final String etqQuoteStatus, final Date etqQuoteStatDate, final String etqQuoteStatUser,
			final Integer sbuSubupgradeId, final Integer sbuSubscriberId, final String sbuDealerId,
			final String sbuSalesPerson, final String sbuUpgradeQual, final String sbuComment, final String sbuUserId,
			final Integer sbuModelId, final Integer sbuContractLen, final BigDecimal sbuCost, final String sbuImei,
			final String sbuRegionCode, final String sbuAccountStatus, final String sbuCollPlan,
			final String sbuMtnStatus, final Date sbuActivateDate, final Date sbuDeactDate,
			final Integer sbuContractAge, final String sbuCustomerType, final String sbuTariffCode,
			final String sbuPackageCode, final String sbuPaymentPlan, final Date sbuTermDate,
			final String sbuAgeingBucket, final BigDecimal sbuAveragespend, final DateTime sbuDateprocessed,
			final DateTime sbuDateapproved, final String sbuUpgradeStatus, final String sbuChannel,
			final String sbuRecordStatus, final String vpkPackageCode, final String vpkPackageDesc,
			final String vpkTarplanRef, final String vpkChangeTariff, final String vpkSuspend,
			final Integer sbdSubscriberId, final String sbdDiallingNo, final String sbdBillAcNo,
			final Date sbdConnectDate, final Date sbdDconnectDate, final Date sbdTermDate, final String sbdTitle,
			final String sbdSurname, final String sbdFirstname, final String sbdGender, final Date sbdDob,
			final String sbdPassword, final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto, final String sbdTariffPlan,
			final Integer sbeSubEquipId, final Integer sbeSubscriberId, final String sbeImeiNo,
			final String sbeSerialNo, final String sbeWarehouse, final String sbeProductCode, final String sbeAntenna,
			final String sbeMsisdn, final String sbeImeiSimPair, final String sbeDealId, final String sbeGroupIdx,
			final Date sbeActiveDate, final Integer sbeUpgradeId, final String sbeMake, final String sbeModel,
			final String sbeDescription, final Double sbeHandsetVal, final Double sbeEarlytermChg,
			final Double sbeAddCharge1, final Double sbeAddCharge2, final String sbeDevicePriority,
			final Date sbeCaptureDate, final Date sbeDate1, final Date sbeDate2, final Date sbeDate3,
			final Integer sbeInt1, final Integer sbeInt2, final Integer sbeInt3, final Double sbeFloat1,
			final Double sbeFloat2, final Double sbeFloat3, final String sbeChar1, final String sbeChar2,
			final String sbeChar3) {

		this.etqQuoteNo = etqQuoteNo;
		this.etqActionType = etqActionType;
		this.etqQuoteLevel = etqQuoteLevel;
		this.etqAccountNo = etqAccountNo;
		this.etqSubscriberId = etqSubscriberId;
		this.etqMsisdnNo = etqMsisdnNo;
		this.etqRemainingMnt = etqRemainingMnt;
		this.etqEffectiveDate = etqEffectiveDate;
		this.etqContrEndDate = etqContrEndDate;
		this.etqMnthSubChrg = etqMnthSubChrg;
		this.etqDeviceCosts = etqDeviceCosts;
		this.etqEtMigChrg = etqEtMigChrg;
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
		this.etqActionDate = etqActionDate;
		this.etqActionUser = etqActionUser;
		this.etqEtMigReason = etqEtMigReason;
		this.etqOverrideUser = etqOverrideUser;
		this.etqOverrideChrg = etqOverrideChrg;
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
		this.etqOverrideReason = etqOverrideReason;
		this.etqOverrideFlag = etqOverrideFlag;
		this.etqNoticePerApply = etqNoticePerApply;
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
		this.etqQuoteStatus = etqQuoteStatus;
		this.etqQuoteStatDate = etqQuoteStatDate;
		this.etqQuoteStatUser = etqQuoteStatUser;
		this.sbuSubupgradeId = sbuSubupgradeId;
		this.sbuSubscriberId = sbuSubscriberId;
		this.sbuDealerId = sbuDealerId;
		this.sbuSalesPerson = sbuSalesPerson;
		this.sbuUpgradeQual = sbuUpgradeQual;
		this.sbuComment = sbuComment;
		this.sbuUserId = sbuUserId;
		this.sbuModelId = sbuModelId;
		this.sbuContractLen = sbuContractLen;
		this.sbuCost = sbuCost;
		this.sbuImei = sbuImei;
		this.sbuRegionCode = sbuRegionCode;
		this.sbuAccountStatus = sbuAccountStatus;
		this.sbuCollPlan = sbuCollPlan;
		this.sbuMtnStatus = sbuMtnStatus;
		this.sbuActivateDate = sbuActivateDate;
		this.sbuDeactDate = sbuDeactDate;
		this.sbuContractAge = sbuContractAge;
		this.sbuCustomerType = sbuCustomerType;
		this.sbuTariffCode = sbuTariffCode;
		this.sbuPackageCode = sbuPackageCode;
		this.sbuPaymentPlan = sbuPaymentPlan;
		this.sbuTermDate = sbuTermDate;
		this.sbuAgeingBucket = sbuAgeingBucket;
		this.sbuAveragespend = sbuAveragespend;
		this.sbuDateprocessed = sbuDateprocessed;
		this.sbuDateapproved = sbuDateapproved;
		this.sbuUpgradeStatus = sbuUpgradeStatus;
		this.sbuChannel = sbuChannel;
		this.sbuRecordStatus = sbuRecordStatus;
		this.vpkPackageCode = vpkPackageCode;
		this.vpkPackageDesc = vpkPackageDesc;
		this.vpkTarplanRef = vpkTarplanRef;
		this.vpkChangeTariff = vpkChangeTariff;
		this.vpkSuspend = vpkSuspend;
		this.sbdSubscriberId = sbdSubscriberId;
		this.sbdDiallingNo = sbdDiallingNo;
		this.sbdBillAcNo = sbdBillAcNo;
		this.sbdConnectDate = sbdConnectDate;
		this.sbdDconnectDate = sbdDconnectDate;
		this.sbdTermDate = sbdTermDate;
		this.sbdTitle = sbdTitle;
		this.sbdSurname = sbdSurname;
		this.sbdFirstname = sbdFirstname;
		this.sbdGender = sbdGender;
		this.sbdDob = sbdDob;
		this.sbdPassword = sbdPassword;
		this.sbdLocationCode = sbdLocationCode;
		this.sbdBillCycle = sbdBillCycle;
		this.sbdPackageCode = sbdPackageCode;
		this.sbdBilledUpto = sbdBilledUpto;
		this.sbdTariffPlan = sbdTariffPlan;
		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeImeiSimPair = sbeImeiSimPair;
		this.sbeDealId = sbeDealId;
		this.sbeGroupIdx = sbeGroupIdx;
		this.sbeActiveDate = sbeActiveDate;
		this.sbeUpgradeId = sbeUpgradeId;
		this.sbeMake = sbeMake;
		this.sbeModel = sbeModel;
		this.sbeDescription = sbeDescription;
		this.sbeHandsetVal = sbeHandsetVal;
		this.sbeEarlytermChg = sbeEarlytermChg;
		this.sbeAddCharge1 = sbeAddCharge1;
		this.sbeAddCharge2 = sbeAddCharge2;
		this.sbeDevicePriority = sbeDevicePriority;
		this.sbeCaptureDate = sbeCaptureDate;
		this.sbeDate1 = sbeDate1;
		this.sbeDate2 = sbeDate2;
		this.sbeDate3 = sbeDate3;
		this.sbeInt1 = sbeInt1;
		this.sbeInt2 = sbeInt2;
		this.sbeInt3 = sbeInt3;
		this.sbeFloat1 = sbeFloat1;
		this.sbeFloat2 = sbeFloat2;
		this.sbeFloat3 = sbeFloat3;
		this.sbeChar1 = sbeChar1;
		this.sbeChar2 = sbeChar2;
		this.sbeChar3 = sbeChar3;
	}

	public EtqEtQuoteDMO getEtqDMO() {
		return etqDMO;
	}

	public void setEtqDMO(EtqEtQuoteDMO etqDMO) {
		this.etqDMO = etqDMO;
	}

	public SbuSubUpgradeDMO getSbuDMO() {
		return sbuDMO;
	}

	public void setSbuDMO(SbuSubUpgradeDMO sbuDMO) {
		this.sbuDMO = sbuDMO;
	}

	public VpkPackageDMO getVpkDMO() {
		return vpkDMO;
	}

	public void setVpkDMO(VpkPackageDMO vpkDMO) {
		this.vpkDMO = vpkDMO;
	}

	public SbdSubDetsDMO getSbdDMO() {
		return sbdDMO;
	}

	public void setSbdDMO(SbdSubDetsDMO sbdDMO) {
		this.sbdDMO = sbdDMO;
	}

	public SbeSubEquipDMO getSbeDMO() {
		return sbeDMO;
	}

	public void setSbeDMO(SbeSubEquipDMO sbeDMO) {
		this.sbeDMO = sbeDMO;
	}

	public Integer getEtqQuoteNo() {
		return etqQuoteNo;
	}

	public void setEtqQuoteNo(Integer etqQuoteNo) {
		this.etqQuoteNo = etqQuoteNo;
	}

	public String getEtqActionType() {
		return etqActionType;
	}

	public void setEtqActionType(String etqActionType) {
		this.etqActionType = etqActionType;
	}

	public String getEtqQuoteLevel() {
		return etqQuoteLevel;
	}

	public void setEtqQuoteLevel(String etqQuoteLevel) {
		this.etqQuoteLevel = etqQuoteLevel;
	}

	public String getEtqAccountNo() {
		return etqAccountNo;
	}

	public void setEtqAccountNo(String etqAccountNo) {
		this.etqAccountNo = etqAccountNo;
	}

	public Integer getEtqSubscriberId() {
		return etqSubscriberId;
	}

	public void setEtqSubscriberId(Integer etqSubscriberId) {
		this.etqSubscriberId = etqSubscriberId;
	}

	public String getEtqMsisdnNo() {
		return etqMsisdnNo;
	}

	public void setEtqMsisdnNo(String etqMsisdnNo) {
		this.etqMsisdnNo = etqMsisdnNo;
	}

	public Integer getEtqRemainingMnt() {
		return etqRemainingMnt;
	}

	public void setEtqRemainingMnt(Integer etqRemainingMnt) {
		this.etqRemainingMnt = etqRemainingMnt;
	}

	public Date getEtqEffectiveDate() {
		return etqEffectiveDate;
	}

	public void setEtqEffectiveDate(Date etqEffectiveDate) {
		this.etqEffectiveDate = etqEffectiveDate;
	}

	public Date getEtqContrEndDate() {
		return etqContrEndDate;
	}

	public void setEtqContrEndDate(Date etqContrEndDate) {
		this.etqContrEndDate = etqContrEndDate;
	}

	public Double getEtqMnthSubChrg() {
		return etqMnthSubChrg;
	}

	public void setEtqMnthSubChrg(Double etqMnthSubChrg) {
		this.etqMnthSubChrg = etqMnthSubChrg;
	}

	public Double getEtqDeviceCosts() {
		return etqDeviceCosts;
	}

	public void setEtqDeviceCosts(Double etqDeviceCosts) {
		this.etqDeviceCosts = etqDeviceCosts;
	}

	public Double getEtqEtMigChrg() {
		return etqEtMigChrg;
	}

	public void setEtqEtMigChrg(Double etqEtMigChrg) {
		this.etqEtMigChrg = etqEtMigChrg;
	}

	public Double getEtqEtMigDeviceChrg() {
		return etqEtMigDeviceChrg;
	}

	public void setEtqEtMigDeviceChrg(Double etqEtMigDeviceChrg) {
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
	}

	public Date getEtqActionDate() {
		return etqActionDate;
	}

	public void setEtqActionDate(Date etqActionDate) {
		this.etqActionDate = etqActionDate;
	}

	public String getEtqActionUser() {
		return etqActionUser;
	}

	public void setEtqActionUser(String etqActionUser) {
		this.etqActionUser = etqActionUser;
	}

	public String getEtqEtMigReason() {
		return etqEtMigReason;
	}

	public void setEtqEtMigReason(String etqEtMigReason) {
		this.etqEtMigReason = etqEtMigReason;
	}

	public String getEtqOverrideUser() {
		return etqOverrideUser;
	}

	public void setEtqOverrideUser(String etqOverrideUser) {
		this.etqOverrideUser = etqOverrideUser;
	}

	public Double getEtqOverrideChrg() {
		return etqOverrideChrg;
	}

	public void setEtqOverrideChrg(Double etqOverrideChrg) {
		this.etqOverrideChrg = etqOverrideChrg;
	}

	public Double getEtqOverrideDeviceChrg() {
		return etqOverrideDeviceChrg;
	}

	public void setEtqOverrideDeviceChrg(Double etqOverrideDeviceChrg) {
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
	}

	public String getEtqOverrideReason() {
		return etqOverrideReason;
	}

	public void setEtqOverrideReason(String etqOverrideReason) {
		this.etqOverrideReason = etqOverrideReason;
	}

	public String getEtqOverrideFlag() {
		return etqOverrideFlag;
	}

	public void setEtqOverrideFlag(String etqOverrideFlag) {
		this.etqOverrideFlag = etqOverrideFlag;
	}

	public Integer getEtqNoticePerApply() {
		return etqNoticePerApply;
	}

	public void setEtqNoticePerApply(Integer etqNoticePerApply) {
		this.etqNoticePerApply = etqNoticePerApply;
	}

	public String getEtqQuoteEmailAddr() {
		return etqQuoteEmailAddr;
	}

	public void setEtqQuoteEmailAddr(String etqQuoteEmailAddr) {
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
	}

	public String getEtqQuoteSplitChrg() {
		return etqQuoteSplitChrg;
	}

	public void setEtqQuoteSplitChrg(String etqQuoteSplitChrg) {
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
	}

	public String getEtqQuoteStatus() {
		return etqQuoteStatus;
	}

	public void setEtqQuoteStatus(String etqQuoteStatus) {
		this.etqQuoteStatus = etqQuoteStatus;
	}

	public Date getEtqQuoteStatDate() {
		return etqQuoteStatDate;
	}

	public void setEtqQuoteStatDate(Date etqQuoteStatDate) {
		this.etqQuoteStatDate = etqQuoteStatDate;
	}

	public String getEtqQuoteStatUser() {
		return etqQuoteStatUser;
	}

	public void setEtqQuoteStatUser(String etqQuoteStatUser) {
		this.etqQuoteStatUser = etqQuoteStatUser;
	}

	public Integer getSbuSubupgradeId() {
		return sbuSubupgradeId;
	}

	public void setSbuSubupgradeId(Integer sbuSubupgradeId) {
		this.sbuSubupgradeId = sbuSubupgradeId;
	}

	public Integer getSbuSubscriberId() {
		return sbuSubscriberId;
	}

	public void setSbuSubscriberId(Integer sbuSubscriberId) {
		this.sbuSubscriberId = sbuSubscriberId;
	}

	public String getSbuDealerId() {
		return sbuDealerId;
	}

	public void setSbuDealerId(String sbuDealerId) {
		this.sbuDealerId = sbuDealerId;
	}

	public String getSbuSalesPerson() {
		return sbuSalesPerson;
	}

	public void setSbuSalesPerson(String sbuSalesPerson) {
		this.sbuSalesPerson = sbuSalesPerson;
	}

	public String getSbuUpgradeQual() {
		return sbuUpgradeQual;
	}

	public void setSbuUpgradeQual(String sbuUpgradeQual) {
		this.sbuUpgradeQual = sbuUpgradeQual;
	}

	public String getSbuComment() {
		return sbuComment;
	}

	public void setSbuComment(String sbuComment) {
		this.sbuComment = sbuComment;
	}

	public String getSbuUserId() {
		return sbuUserId;
	}

	public void setSbuUserId(String sbuUserId) {
		this.sbuUserId = sbuUserId;
	}

	public Integer getSbuModelId() {
		return sbuModelId;
	}

	public void setSbuModelId(Integer sbuModelId) {
		this.sbuModelId = sbuModelId;
	}

	public Integer getSbuContractLen() {
		return sbuContractLen;
	}

	public void setSbuContractLen(Integer sbuContractLen) {
		this.sbuContractLen = sbuContractLen;
	}

	public BigDecimal getSbuCost() {
		return sbuCost;
	}

	public void setSbuCost(BigDecimal sbuCost) {
		this.sbuCost = sbuCost;
	}

	public String getSbuImei() {
		return sbuImei;
	}

	public void setSbuImei(String sbuImei) {
		this.sbuImei = sbuImei;
	}

	public String getSbuRegionCode() {
		return sbuRegionCode;
	}

	public void setSbuRegionCode(String sbuRegionCode) {
		this.sbuRegionCode = sbuRegionCode;
	}

	public String getSbuAccountStatus() {
		return sbuAccountStatus;
	}

	public void setSbuAccountStatus(String sbuAccountStatus) {
		this.sbuAccountStatus = sbuAccountStatus;
	}

	public String getSbuCollPlan() {
		return sbuCollPlan;
	}

	public void setSbuCollPlan(String sbuCollPlan) {
		this.sbuCollPlan = sbuCollPlan;
	}

	public String getSbuMtnStatus() {
		return sbuMtnStatus;
	}

	public void setSbuMtnStatus(String sbuMtnStatus) {
		this.sbuMtnStatus = sbuMtnStatus;
	}

	public Date getSbuActivateDate() {
		return sbuActivateDate;
	}

	public void setSbuActivateDate(Date sbuActivateDate) {
		this.sbuActivateDate = sbuActivateDate;
	}

	public Date getSbuDeactDate() {
		return sbuDeactDate;
	}

	public void setSbuDeactDate(Date sbuDeactDate) {
		this.sbuDeactDate = sbuDeactDate;
	}

	public Integer getSbuContractAge() {
		return sbuContractAge;
	}

	public void setSbuContractAge(Integer sbuContractAge) {
		this.sbuContractAge = sbuContractAge;
	}

	public String getSbuCustomerType() {
		return sbuCustomerType;
	}

	public void setSbuCustomerType(String sbuCustomerType) {
		this.sbuCustomerType = sbuCustomerType;
	}

	public String getSbuTariffCode() {
		return sbuTariffCode;
	}

	public void setSbuTariffCode(String sbuTariffCode) {
		this.sbuTariffCode = sbuTariffCode;
	}

	public String getSbuPackageCode() {
		return sbuPackageCode;
	}

	public void setSbuPackageCode(String sbuPackageCode) {
		this.sbuPackageCode = sbuPackageCode;
	}

	public String getSbuPaymentPlan() {
		return sbuPaymentPlan;
	}

	public void setSbuPaymentPlan(String sbuPaymentPlan) {
		this.sbuPaymentPlan = sbuPaymentPlan;
	}

	public Date getSbuTermDate() {
		return sbuTermDate;
	}

	public void setSbuTermDate(Date sbuTermDate) {
		this.sbuTermDate = sbuTermDate;
	}

	public String getSbuAgeingBucket() {
		return sbuAgeingBucket;
	}

	public void setSbuAgeingBucket(String sbuAgeingBucket) {
		this.sbuAgeingBucket = sbuAgeingBucket;
	}

	public BigDecimal getSbuAveragespend() {
		return sbuAveragespend;
	}

	public void setSbuAveragespend(BigDecimal sbuAveragespend) {
		this.sbuAveragespend = sbuAveragespend;
	}

	public DateTime getSbuDateprocessed() {
		return sbuDateprocessed;
	}

	public void setSbuDateprocessed(DateTime sbuDateprocessed) {
		this.sbuDateprocessed = sbuDateprocessed;
	}

	public DateTime getSbuDateapproved() {
		return sbuDateapproved;
	}

	public void setSbuDateapproved(DateTime sbuDateapproved) {
		this.sbuDateapproved = sbuDateapproved;
	}

	public String getSbuUpgradeStatus() {
		return sbuUpgradeStatus;
	}

	public void setSbuUpgradeStatus(String sbuUpgradeStatus) {
		this.sbuUpgradeStatus = sbuUpgradeStatus;
	}

	public String getSbuChannel() {
		return sbuChannel;
	}

	public void setSbuChannel(String sbuChannel) {
		this.sbuChannel = sbuChannel;
	}

	public String getSbuRecordStatus() {
		return sbuRecordStatus;
	}

	public void setSbuRecordStatus(String sbuRecordStatus) {
		this.sbuRecordStatus = sbuRecordStatus;
	}

	public String getVpkPackageCode() {
		return vpkPackageCode;
	}

	public void setVpkPackageCode(String vpkPackageCode) {
		this.vpkPackageCode = vpkPackageCode;
	}

	public String getVpkPackageDesc() {
		return vpkPackageDesc;
	}

	public void setVpkPackageDesc(String vpkPackageDesc) {
		this.vpkPackageDesc = vpkPackageDesc;
	}

	public String getVpkTarplanRef() {
		return vpkTarplanRef;
	}

	public void setVpkTarplanRef(String vpkTarplanRef) {
		this.vpkTarplanRef = vpkTarplanRef;
	}

	public String getVpkChangeTariff() {
		return vpkChangeTariff;
	}

	public void setVpkChangeTariff(String vpkChangeTariff) {
		this.vpkChangeTariff = vpkChangeTariff;
	}

	public String getVpkSuspend() {
		return vpkSuspend;
	}

	public void setVpkSuspend(String vpkSuspend) {
		this.vpkSuspend = vpkSuspend;
	}

	public Integer getSbdSubscriberId() {
		return sbdSubscriberId;
	}

	public void setSbdSubscriberId(Integer sbdSubscriberId) {
		this.sbdSubscriberId = sbdSubscriberId;
	}

	public String getSbdDiallingNo() {
		return sbdDiallingNo;
	}

	public void setSbdDiallingNo(String sbdDiallingNo) {
		this.sbdDiallingNo = sbdDiallingNo;
	}

	public String getSbdBillAcNo() {
		return sbdBillAcNo;
	}

	public void setSbdBillAcNo(String sbdBillAcNo) {
		this.sbdBillAcNo = sbdBillAcNo;
	}

	public Date getSbdConnectDate() {
		return sbdConnectDate;
	}

	public void setSbdConnectDate(Date sbdConnectDate) {
		this.sbdConnectDate = sbdConnectDate;
	}

	public Date getSbdDconnectDate() {
		return sbdDconnectDate;
	}

	public void setSbdDconnectDate(Date sbdDconnectDate) {
		this.sbdDconnectDate = sbdDconnectDate;
	}

	public Date getSbdTermDate() {
		return sbdTermDate;
	}

	public void setSbdTermDate(Date sbdTermDate) {
		this.sbdTermDate = sbdTermDate;
	}

	public String getSbdTitle() {
		return sbdTitle;
	}

	public void setSbdTitle(String sbdTitle) {
		this.sbdTitle = sbdTitle;
	}

	public String getSbdSurname() {
		return sbdSurname;
	}

	public void setSbdSurname(String sbdSurname) {
		this.sbdSurname = sbdSurname;
	}

	public String getSbdFirstname() {
		return sbdFirstname;
	}

	public void setSbdFirstname(String sbdFirstname) {
		this.sbdFirstname = sbdFirstname;
	}

	public String getSbdGender() {
		return sbdGender;
	}

	public void setSbdGender(String sbdGender) {
		this.sbdGender = sbdGender;
	}

	public Date getSbdDob() {
		return sbdDob;
	}

	public void setSbdDob(Date sbdDob) {
		this.sbdDob = sbdDob;
	}

	public String getSbdPassword() {
		return sbdPassword;
	}

	public void setSbdPassword(String sbdPassword) {
		this.sbdPassword = sbdPassword;
	}

	public String getSbdLocationCode() {
		return sbdLocationCode;
	}

	public void setSbdLocationCode(String sbdLocationCode) {
		this.sbdLocationCode = sbdLocationCode;
	}

	public String getSbdBillCycle() {
		return sbdBillCycle;
	}

	public void setSbdBillCycle(String sbdBillCycle) {
		this.sbdBillCycle = sbdBillCycle;
	}

	public String getSbdPackageCode() {
		return sbdPackageCode;
	}

	public void setSbdPackageCode(String sbdPackageCode) {
		this.sbdPackageCode = sbdPackageCode;
	}

	public Date getSbdBilledUpto() {
		return sbdBilledUpto;
	}

	public void setSbdBilledUpto(Date sbdBilledUpto) {
		this.sbdBilledUpto = sbdBilledUpto;
	}

	public String getSbdTariffPlan() {
		return sbdTariffPlan;
	}

	public void setSbdTariffPlan(String sbdTariffPlan) {
		this.sbdTariffPlan = sbdTariffPlan;
	}

	public Integer getSbeSubEquipId() {
		return sbeSubEquipId;
	}

	public void setSbeSubEquipId(Integer sbeSubEquipId) {
		this.sbeSubEquipId = sbeSubEquipId;
	}

	public Integer getSbeSubscriberId() {
		return sbeSubscriberId;
	}

	public void setSbeSubscriberId(Integer sbeSubscriberId) {
		this.sbeSubscriberId = sbeSubscriberId;
	}

	public String getSbeImeiNo() {
		return sbeImeiNo;
	}

	public void setSbeImeiNo(String sbeImeiNo) {
		this.sbeImeiNo = sbeImeiNo;
	}

	public String getSbeSerialNo() {
		return sbeSerialNo;
	}

	public void setSbeSerialNo(String sbeSerialNo) {
		this.sbeSerialNo = sbeSerialNo;
	}

	public String getSbeWarehouse() {
		return sbeWarehouse;
	}

	public void setSbeWarehouse(String sbeWarehouse) {
		this.sbeWarehouse = sbeWarehouse;
	}

	public String getSbeProductCode() {
		return sbeProductCode;
	}

	public void setSbeProductCode(String sbeProductCode) {
		this.sbeProductCode = sbeProductCode;
	}

	public String getSbeAntenna() {
		return sbeAntenna;
	}

	public void setSbeAntenna(String sbeAntenna) {
		this.sbeAntenna = sbeAntenna;
	}

	public String getSbeMsisdn() {
		return sbeMsisdn;
	}

	public void setSbeMsisdn(String sbeMsisdn) {
		this.sbeMsisdn = sbeMsisdn;
	}

	public String getSbeImeiSimPair() {
		return sbeImeiSimPair;
	}

	public void setSbeImeiSimPair(String sbeImeiSimPair) {
		this.sbeImeiSimPair = sbeImeiSimPair;
	}

	public String getSbeDealId() {
		return sbeDealId;
	}

	public void setSbeDealId(String sbeDealId) {
		this.sbeDealId = sbeDealId;
	}

	public String getSbeGroupIdx() {
		return sbeGroupIdx;
	}

	public void setSbeGroupIdx(String sbeGroupIdx) {
		this.sbeGroupIdx = sbeGroupIdx;
	}

	public Date getSbeActiveDate() {
		return sbeActiveDate;
	}

	public void setSbeActiveDate(Date sbeActiveDate) {
		this.sbeActiveDate = sbeActiveDate;
	}

	public Integer getSbeUpgradeId() {
		return sbeUpgradeId;
	}

	public void setSbeUpgradeId(Integer sbeUpgradeId) {
		this.sbeUpgradeId = sbeUpgradeId;
	}

	public String getSbeMake() {
		return sbeMake;
	}

	public void setSbeMake(String sbeMake) {
		this.sbeMake = sbeMake;
	}

	public String getSbeModel() {
		return sbeModel;
	}

	public void setSbeModel(String sbeModel) {
		this.sbeModel = sbeModel;
	}

	public String getSbeDescription() {
		return sbeDescription;
	}

	public void setSbeDescription(String sbeDescription) {
		this.sbeDescription = sbeDescription;
	}

	public Double getSbeHandsetVal() {
		return sbeHandsetVal;
	}

	public void setSbeHandsetVal(Double sbeHandsetVal) {
		this.sbeHandsetVal = sbeHandsetVal;
	}

	public Double getSbeEarlytermChg() {
		return sbeEarlytermChg;
	}

	public void setSbeEarlytermChg(Double sbeEarlytermChg) {
		this.sbeEarlytermChg = sbeEarlytermChg;
	}

	public Double getSbeAddCharge1() {
		return sbeAddCharge1;
	}

	public void setSbeAddCharge1(Double sbeAddCharge1) {
		this.sbeAddCharge1 = sbeAddCharge1;
	}

	public Double getSbeAddCharge2() {
		return sbeAddCharge2;
	}

	public void setSbeAddCharge2(Double sbeAddCharge2) {
		this.sbeAddCharge2 = sbeAddCharge2;
	}

	public String getSbeDevicePriority() {
		return sbeDevicePriority;
	}

	public void setSbeDevicePriority(String sbeDevicePriority) {
		this.sbeDevicePriority = sbeDevicePriority;
	}

	public Date getSbeCaptureDate() {
		return sbeCaptureDate;
	}

	public void setSbeCaptureDate(Date sbeCaptureDate) {
		this.sbeCaptureDate = sbeCaptureDate;
	}

	public Date getSbeDate1() {
		return sbeDate1;
	}

	public void setSbeDate1(Date sbeDate1) {
		this.sbeDate1 = sbeDate1;
	}

	public Date getSbeDate2() {
		return sbeDate2;
	}

	public void setSbeDate2(Date sbeDate2) {
		this.sbeDate2 = sbeDate2;
	}

	public Date getSbeDate3() {
		return sbeDate3;
	}

	public void setSbeDate3(Date sbeDate3) {
		this.sbeDate3 = sbeDate3;
	}

	public Integer getSbeInt1() {
		return sbeInt1;
	}

	public void setSbeInt1(Integer sbeInt1) {
		this.sbeInt1 = sbeInt1;
	}

	public Integer getSbeInt2() {
		return sbeInt2;
	}

	public void setSbeInt2(Integer sbeInt2) {
		this.sbeInt2 = sbeInt2;
	}

	public Integer getSbeInt3() {
		return sbeInt3;
	}

	public void setSbeInt3(Integer sbeInt3) {
		this.sbeInt3 = sbeInt3;
	}

	public Double getSbeFloat1() {
		return sbeFloat1;
	}

	public void setSbeFloat1(Double sbeFloat1) {
		this.sbeFloat1 = sbeFloat1;
	}

	public Double getSbeFloat2() {
		return sbeFloat2;
	}

	public void setSbeFloat2(Double sbeFloat2) {
		this.sbeFloat2 = sbeFloat2;
	}

	public Double getSbeFloat3() {
		return sbeFloat3;
	}

	public void setSbeFloat3(Double sbeFloat3) {
		this.sbeFloat3 = sbeFloat3;
	}

	public String getSbeChar1() {
		return sbeChar1;
	}

	public void setSbeChar1(String sbeChar1) {
		this.sbeChar1 = sbeChar1;
	}

	public String getSbeChar2() {
		return sbeChar2;
	}

	public void setSbeChar2(String sbeChar2) {
		this.sbeChar2 = sbeChar2;
	}

	public String getSbeChar3() {
		return sbeChar3;
	}

	public void setSbeChar3(String sbeChar3) {
		this.sbeChar3 = sbeChar3;
	}

}
