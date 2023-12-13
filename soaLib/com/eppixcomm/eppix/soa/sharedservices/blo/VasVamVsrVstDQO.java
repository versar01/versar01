package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class VasVamVsrVstDQO extends DBO implements Serializable {

	private VamActiveMsisdnDMO vamDMO;
	private VasActiveServiceDMO vasDMO;
	private VsrServiceDMO vsrDMO;
	private VstServiceTypesDMO vstDMO;

	private Integer vasSubscriberId;
	private String vasServiceCode;
	private String vasInternTariff;
	private String vasServiceType;
	private Date vasActDate;
	private Date vasDeactDate;
	private String vasSubCharge1;
	private String vasSubCharge2;
	private String vasSubCharge3;
	private Short vasTwinbillNo;
	private String vasMultiCharge;
	private Integer vamSubscriberId;
	private String vamSimNo;
	private String vamMsisdnNo;
	private Short vamTwinbillNo;
	private String vamStatCode;
	private Date vamConnectDate;
	private Date vamDconnectDate;
	private String vamInternTariff;
	private Date vamContrTerminat;
	private Short vamContrPeriod;
	private Date vamTerminatNotif;
	private String vamDirEntry;
	private String vamItemised;
	private String vamDepartment;
	private String vamSalesman;
	private String vamDealerId;
	private Date vamAbarDate;
	private String vamSubsSuffix;
	private String vamMessComment;
	private String vamAirtimeNet;
	private String vamPrFlag;
	private String vamHierarchy;
	private String vamMsisdnKnown;
	private Date vamTariffChg;
	private String vamOrigProvId;
	private String vamImpProvId;
	private String vamOrigServProv;
	private String vamImpServProv;
	private String vamMsisdnType;
	private String vamDummy;
	private Date vamMsisdnExprtd;
	private String vamExportedTo;
	private String vamAnalysis1;
	private String vamAnalysis2;
	private String vamAnalysis3;
	private String vamAnalysis4;
	private String vamAnalysis5;
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

	public void deConstruct() {
		vamDMO = new VamActiveMsisdnDMO(vamSubscriberId, vamSimNo, vamMsisdnNo, vamTwinbillNo, vamStatCode,
				vamConnectDate, vamDconnectDate, vamInternTariff, vamContrTerminat, vamContrPeriod, vamTerminatNotif,
				vamDirEntry, vamItemised, vamDepartment, vamSalesman, vamDealerId, vamAbarDate, vamSubsSuffix,
				vamMessComment, vamAirtimeNet, vamPrFlag, vamHierarchy, vamMsisdnKnown, vamTariffChg, vamOrigProvId,
				vamImpProvId, vamOrigServProv, vamImpServProv, vamMsisdnType, vamDummy, vamMsisdnExprtd, vamExportedTo,
				vamAnalysis1, vamAnalysis2, vamAnalysis3, vamAnalysis4, vamAnalysis5);

		vasDMO = new VasActiveServiceDMO(vasSubscriberId, vasServiceCode, vasInternTariff, vasServiceType, vasActDate,
				vasDeactDate, vasSubCharge1, vasSubCharge2, vasSubCharge3, vasTwinbillNo, vasMultiCharge);

		vsrDMO = new VsrServiceDMO(vsrServiceCode, vsrServiceType, vsrServiceDesc, vsrOriginator, vsrServiceClass,
				vsrTempDeact, vsrProrata, vsrProviderId, vsrShortDesc, vsrSuspend);

		vstDMO = new VstServiceTypesDMO(vstServiceType, vstServiceDesc, vstMultiCharge, vstServiceClass, vstAutoConnect,
				vstOriginator, vstTariffRelated, vstParameterised, vstParamsLevel, vstArchiveMonths, vstFutureAct,
				vstNodeLevel);
	}

	public static final int vasSubscriberIdFilter = 0;

	public static final int vasServiceCodeFilter = 1;
	private static final int vasServiceCodeSize = 4;

	public static final int vasInternTariffFilter = 2;
	private static final int vasInternTariffSize = 20;

	public static final int vasServiceTypeFilter = 3;
	private static final int vasServiceTypeSize = 5;

	public static final int vasActDateFilter = 4;

	public static final int vasDeactDateFilter = 5;

	public static final int vasSubCharge1Filter = 6;
	private static final int vasSubCharge1Size = 5;

	public static final int vasSubCharge2Filter = 7;
	private static final int vasSubCharge2Size = 5;

	public static final int vasSubCharge3Filter = 8;
	private static final int vasSubCharge3Size = 5;

	public static final int vasTwinbillNoFilter = 9;

	public static final int vasMultiChargeFilter = 10;
	private static final int vasMultiChargeSize = 1;

	public static final int vamSubscriberIdFilter = 11;

	public static final int vamSimNoFilter = 12;
	private static final int vamSimNoSize = 14;

	public static final int vamMsisdnNoFilter = 13;
	private static final int vamMsisdnNoSize = 15;

	public static final int vamTwinbillNoFilter = 14;

	public static final int vamStatCodeFilter = 15;
	private static final int vamStatCodeSize = 2;

	public static final int vamConnectDateFilter = 16;

	public static final int vamDconnectDateFilter = 17;

	public static final int vamInternTariffFilter = 18;
	private static final int vamInternTariffSize = 20;

	public static final int vamContrTerminatFilter = 19;

	public static final int vamContrPeriodFilter = 20;

	public static final int vamTerminatNotifFilter = 21;

	public static final int vamDirEntryFilter = 22;
	private static final int vamDirEntrySize = 1;

	public static final int vamItemisedFilter = 23;
	private static final int vamItemisedSize = 1;

	public static final int vamDepartmentFilter = 24;
	private static final int vamDepartmentSize = 3;

	public static final int vamSalesmanFilter = 25;
	private static final int vamSalesmanSize = 10;

	public static final int vamDealerIdFilter = 26;
	private static final int vamDealerIdSize = 8;

	public static final int vamAbarDateFilter = 27;

	public static final int vamSubsSuffixFilter = 28;
	private static final int vamSubsSuffixSize = 1;

	public static final int vamMessCommentFilter = 29;
	private static final int vamMessCommentSize = 20;

	public static final int vamAirtimeNetFilter = 30;
	private static final int vamAirtimeNetSize = 1;

	public static final int vamPrFlagFilter = 31;
	private static final int vamPrFlagSize = 1;

	public static final int vamHierarchyFilter = 32;
	private static final int vamHierarchySize = 1;

	public static final int vamMsisdnKnownFilter = 33;
	private static final int vamMsisdnKnownSize = 1;

	public static final int vamTariffChgFilter = 34;

	public static final int vamOrigProvIdFilter = 35;
	private static final int vamOrigProvIdSize = 5;

	public static final int vamImpProvIdFilter = 36;
	private static final int vamImpProvIdSize = 5;

	public static final int vamOrigServProvFilter = 37;
	private static final int vamOrigServProvSize = 5;

	public static final int vamImpServProvFilter = 38;
	private static final int vamImpServProvSize = 5;

	public static final int vamMsisdnTypeFilter = 39;
	private static final int vamMsisdnTypeSize = 50;

	public static final int vamDummyFilter = 40;
	private static final int vamDummySize = 1;

	public static final int vamMsisdnExprtdFilter = 41;

	public static final int vamExportedToFilter = 42;
	private static final int vamExportedToSize = 5;

	public static final int vamAnalysis1Filter = 43;
	private static final int vamAnalysis1Size = 30;

	public static final int vamAnalysis2Filter = 44;
	private static final int vamAnalysis2Size = 30;

	public static final int vamAnalysis3Filter = 45;
	private static final int vamAnalysis3Size = 30;

	public static final int vamAnalysis4Filter = 46;
	private static final int vamAnalysis4Size = 30;

	public static final int vamAnalysis5Filter = 47;
	private static final int vamAnalysis5Size = 30;

	public static final int vsrServiceCodeFilter = 48;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 49;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 50;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 51;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 52;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 53;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 54;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 55;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 56;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 57;
	private static final int vsrSuspendSize = 1;

	public static final int vstServiceTypeFilter = 58;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 59;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 60;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 61;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 62;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 63;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 64;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 65;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 66;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 67;

	public static final int vstFutureActFilter = 68;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 69;
	private static final int vstNodeLevelSize = 5;

	public VasVamVsrVstDQO() {
	};

	public VasVamVsrVstDQO(final Integer vasSubscriberId, final String vasServiceCode, final String vasInternTariff,
			final String vasServiceType, final Date vasActDate, final Date vasDeactDate, final String vasSubCharge1,
			final String vasSubCharge2, final String vasSubCharge3, final Short vasTwinbillNo,
			final String vasMultiCharge, final Integer vamSubscriberId, final String vamSimNo, final String vamMsisdnNo,
			final Short vamTwinbillNo, final String vamStatCode, final Date vamConnectDate, final Date vamDconnectDate,
			final String vamInternTariff, final Date vamContrTerminat, final Short vamContrPeriod,
			final Date vamTerminatNotif, final String vamDirEntry, final String vamItemised, final String vamDepartment,
			final String vamSalesman, final String vamDealerId, final Date vamAbarDate, final String vamSubsSuffix,
			final String vamMessComment, final String vamAirtimeNet, final String vamPrFlag, final String vamHierarchy,
			final String vamMsisdnKnown, final Date vamTariffChg, final String vamOrigProvId, final String vamImpProvId,
			final String vamOrigServProv, final String vamImpServProv, final String vamMsisdnType,
			final String vamDummy, final Date vamMsisdnExprtd, final String vamExportedTo, final String vamAnalysis1,
			final String vamAnalysis2, final String vamAnalysis3, final String vamAnalysis4, final String vamAnalysis5,
			final String vsrServiceCode, final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass, final String vsrTempDeact,
			final String vsrProrata, final String vsrProviderId, final String vsrShortDesc, final String vsrSuspend,
			final String vstServiceType, final String vstServiceDesc, final String vstMultiCharge,
			final String vstServiceClass, final String vstAutoConnect, final String vstOriginator,
			final String vstTariffRelated, final String vstParameterised, final String vstParamsLevel,
			final Short vstArchiveMonths, final String vstFutureAct, final String vstNodeLevel) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = vasActDate;
		this.vasDeactDate = vasDeactDate;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
		this.vamSubscriberId = vamSubscriberId;
		this.vamSimNo = vamSimNo;
		this.vamMsisdnNo = vamMsisdnNo;
		this.vamTwinbillNo = vamTwinbillNo;
		this.vamStatCode = vamStatCode;
		this.vamConnectDate = vamConnectDate;
		this.vamDconnectDate = vamDconnectDate;
		this.vamInternTariff = vamInternTariff;
		this.vamContrTerminat = vamContrTerminat;
		this.vamContrPeriod = vamContrPeriod;
		this.vamTerminatNotif = vamTerminatNotif;
		this.vamDirEntry = vamDirEntry;
		this.vamItemised = vamItemised;
		this.vamDepartment = vamDepartment;
		this.vamSalesman = vamSalesman;
		this.vamDealerId = vamDealerId;
		this.vamAbarDate = vamAbarDate;
		this.vamSubsSuffix = vamSubsSuffix;
		this.vamMessComment = vamMessComment;
		this.vamAirtimeNet = vamAirtimeNet;
		this.vamPrFlag = vamPrFlag;
		this.vamHierarchy = vamHierarchy;
		this.vamMsisdnKnown = vamMsisdnKnown;
		this.vamTariffChg = vamTariffChg;
		this.vamOrigProvId = vamOrigProvId;
		this.vamImpProvId = vamImpProvId;
		this.vamOrigServProv = vamOrigServProv;
		this.vamImpServProv = vamImpServProv;
		this.vamMsisdnType = vamMsisdnType;
		this.vamDummy = vamDummy;
		this.vamMsisdnExprtd = vamMsisdnExprtd;
		this.vamExportedTo = vamExportedTo;
		this.vamAnalysis1 = vamAnalysis1;
		this.vamAnalysis2 = vamAnalysis2;
		this.vamAnalysis3 = vamAnalysis3;
		this.vamAnalysis4 = vamAnalysis4;
		this.vamAnalysis5 = vamAnalysis5;
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

	private static final int[] fieldSizes = new int[] { 0, vasServiceCodeSize, vasInternTariffSize, vasServiceTypeSize,
			0, 0, vasSubCharge1Size, vasSubCharge2Size, vasSubCharge3Size, 0, vasMultiChargeSize, 0, vamSimNoSize,
			vamMsisdnNoSize, 0, vamStatCodeSize, 0, 0, vamInternTariffSize, 0, 0, 0, vamDirEntrySize, vamItemisedSize,
			vamDepartmentSize, vamSalesmanSize, vamDealerIdSize, 0, vamSubsSuffixSize, vamMessCommentSize,
			vamAirtimeNetSize, vamPrFlagSize, vamHierarchySize, vamMsisdnKnownSize, 0, vamOrigProvIdSize,
			vamImpProvIdSize, vamOrigServProvSize, vamImpServProvSize, vamMsisdnTypeSize, vamDummySize, 0,
			vamExportedToSize, vamAnalysis1Size, vamAnalysis2Size, vamAnalysis3Size, vamAnalysis4Size, vamAnalysis5Size,
			vsrServiceCodeSize, vsrServiceTypeSize, vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize,
			vsrTempDeactSize, vsrProrataSize, vsrProviderIdSize, vsrShortDescSize, vsrSuspendSize, vstServiceTypeSize,
			vstServiceDescSize, vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize, vstOriginatorSize,
			vstTariffRelatedSize, vstParameterisedSize, vstParamsLevelSize, 0, vstFutureActSize, vstNodeLevelSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.vasSubscriberId,
				((this.vasServiceCode == null) ? null
						: (this.vasServiceCode.length() <= vasServiceCodeSize) ? this.vasServiceCode
								: this.vasServiceCode.substring(0, this.vasServiceCodeSize)),
				((this.vasInternTariff == null) ? null
						: (this.vasInternTariff.length() <= vasInternTariffSize) ? this.vasInternTariff
								: this.vasInternTariff.substring(0, this.vasInternTariffSize)),
				((this.vasServiceType == null) ? null
						: (this.vasServiceType.length() <= vasServiceTypeSize) ? this.vasServiceType
								: this.vasServiceType.substring(0, this.vasServiceTypeSize)),
				this.vasActDate, this.vasDeactDate,
				((this.vasSubCharge1 == null) ? null
						: (this.vasSubCharge1.length() <= vasSubCharge1Size) ? this.vasSubCharge1
								: this.vasSubCharge1.substring(0, this.vasSubCharge1Size)),
				((this.vasSubCharge2 == null) ? null
						: (this.vasSubCharge2.length() <= vasSubCharge2Size) ? this.vasSubCharge2
								: this.vasSubCharge2.substring(0, this.vasSubCharge2Size)),
				((this.vasSubCharge3 == null) ? null
						: (this.vasSubCharge3.length() <= vasSubCharge3Size) ? this.vasSubCharge3
								: this.vasSubCharge3.substring(0, this.vasSubCharge3Size)),
				this.vasTwinbillNo,
				((this.vasMultiCharge == null) ? null
						: (this.vasMultiCharge.length() <= vasMultiChargeSize) ? this.vasMultiCharge
								: this.vasMultiCharge.substring(0, this.vasMultiChargeSize)),
				this.vamSubscriberId,
				((this.vamSimNo == null) ? null
						: (this.vamSimNo.length() <= vamSimNoSize) ? this.vamSimNo
								: this.vamSimNo.substring(0, this.vamSimNoSize)),
				((this.vamMsisdnNo == null) ? null
						: (this.vamMsisdnNo.length() <= vamMsisdnNoSize) ? this.vamMsisdnNo
								: this.vamMsisdnNo.substring(0, this.vamMsisdnNoSize)),
				this.vamTwinbillNo,
				((this.vamStatCode == null) ? null
						: (this.vamStatCode.length() <= vamStatCodeSize) ? this.vamStatCode
								: this.vamStatCode.substring(0, this.vamStatCodeSize)),
				this.vamConnectDate, this.vamDconnectDate,
				((this.vamInternTariff == null) ? null
						: (this.vamInternTariff.length() <= vamInternTariffSize) ? this.vamInternTariff
								: this.vamInternTariff.substring(0, this.vamInternTariffSize)),
				this.vamContrTerminat, this.vamContrPeriod, this.vamTerminatNotif,
				((this.vamDirEntry == null) ? null
						: (this.vamDirEntry.length() <= vamDirEntrySize) ? this.vamDirEntry
								: this.vamDirEntry.substring(0, this.vamDirEntrySize)),
				((this.vamItemised == null) ? null
						: (this.vamItemised.length() <= vamItemisedSize) ? this.vamItemised
								: this.vamItemised.substring(0, this.vamItemisedSize)),
				((this.vamDepartment == null) ? null
						: (this.vamDepartment.length() <= vamDepartmentSize) ? this.vamDepartment
								: this.vamDepartment.substring(0, this.vamDepartmentSize)),
				((this.vamSalesman == null) ? null
						: (this.vamSalesman.length() <= vamSalesmanSize) ? this.vamSalesman
								: this.vamSalesman.substring(0, this.vamSalesmanSize)),
				((this.vamDealerId == null) ? null
						: (this.vamDealerId.length() <= vamDealerIdSize) ? this.vamDealerId
								: this.vamDealerId.substring(0, this.vamDealerIdSize)),
				this.vamAbarDate,
				((this.vamSubsSuffix == null) ? null
						: (this.vamSubsSuffix.length() <= vamSubsSuffixSize) ? this.vamSubsSuffix
								: this.vamSubsSuffix.substring(0, this.vamSubsSuffixSize)),
				((this.vamMessComment == null) ? null
						: (this.vamMessComment.length() <= vamMessCommentSize) ? this.vamMessComment
								: this.vamMessComment.substring(0, this.vamMessCommentSize)),
				((this.vamAirtimeNet == null) ? null
						: (this.vamAirtimeNet.length() <= vamAirtimeNetSize) ? this.vamAirtimeNet
								: this.vamAirtimeNet.substring(0, this.vamAirtimeNetSize)),
				((this.vamPrFlag == null) ? null
						: (this.vamPrFlag.length() <= vamPrFlagSize) ? this.vamPrFlag
								: this.vamPrFlag.substring(0, this.vamPrFlagSize)),
				((this.vamHierarchy == null) ? null
						: (this.vamHierarchy.length() <= vamHierarchySize) ? this.vamHierarchy
								: this.vamHierarchy.substring(0, this.vamHierarchySize)),
				((this.vamMsisdnKnown == null) ? null
						: (this.vamMsisdnKnown.length() <= vamMsisdnKnownSize) ? this.vamMsisdnKnown
								: this.vamMsisdnKnown.substring(0, this.vamMsisdnKnownSize)),
				this.vamTariffChg,
				((this.vamOrigProvId == null) ? null
						: (this.vamOrigProvId.length() <= vamOrigProvIdSize) ? this.vamOrigProvId
								: this.vamOrigProvId.substring(0, this.vamOrigProvIdSize)),
				((this.vamImpProvId == null) ? null
						: (this.vamImpProvId.length() <= vamImpProvIdSize) ? this.vamImpProvId
								: this.vamImpProvId.substring(0, this.vamImpProvIdSize)),
				((this.vamOrigServProv == null) ? null
						: (this.vamOrigServProv.length() <= vamOrigServProvSize) ? this.vamOrigServProv
								: this.vamOrigServProv.substring(0, this.vamOrigServProvSize)),
				((this.vamImpServProv == null) ? null
						: (this.vamImpServProv.length() <= vamImpServProvSize) ? this.vamImpServProv
								: this.vamImpServProv.substring(0, this.vamImpServProvSize)),
				((this.vamMsisdnType == null) ? null
						: (this.vamMsisdnType.length() <= vamMsisdnTypeSize) ? this.vamMsisdnType
								: this.vamMsisdnType.substring(0, this.vamMsisdnTypeSize)),
				((this.vamDummy == null) ? null
						: (this.vamDummy.length() <= vamDummySize) ? this.vamDummy
								: this.vamDummy.substring(0, this.vamDummySize)),
				this.vamMsisdnExprtd,
				((this.vamExportedTo == null) ? null
						: (this.vamExportedTo.length() <= vamExportedToSize) ? this.vamExportedTo
								: this.vamExportedTo.substring(0, this.vamExportedToSize)),
				((this.vamAnalysis1 == null) ? null
						: (this.vamAnalysis1.length() <= vamAnalysis1Size) ? this.vamAnalysis1
								: this.vamAnalysis1.substring(0, this.vamAnalysis1Size)),
				((this.vamAnalysis2 == null) ? null
						: (this.vamAnalysis2.length() <= vamAnalysis2Size) ? this.vamAnalysis2
								: this.vamAnalysis2.substring(0, this.vamAnalysis2Size)),
				((this.vamAnalysis3 == null) ? null
						: (this.vamAnalysis3.length() <= vamAnalysis3Size) ? this.vamAnalysis3
								: this.vamAnalysis3.substring(0, this.vamAnalysis3Size)),
				((this.vamAnalysis4 == null) ? null
						: (this.vamAnalysis4.length() <= vamAnalysis4Size) ? this.vamAnalysis4
								: this.vamAnalysis4.substring(0, this.vamAnalysis4Size)),
				((this.vamAnalysis5 == null) ? null
						: (this.vamAnalysis5.length() <= vamAnalysis5Size) ? this.vamAnalysis5
								: this.vamAnalysis5.substring(0, this.vamAnalysis5Size)),
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
		this.vasSubscriberId = ((Integer) fields[0]);
		this.vasServiceCode = rtrim((String) fields[1]);
		this.vasInternTariff = rtrim((String) fields[2]);
		this.vasServiceType = rtrim((String) fields[3]);
		this.vasActDate = ((fields[4] == null) ? null : new Date(fields[4]));
		this.vasDeactDate = ((fields[5] == null) ? null : new Date(fields[5]));
		this.vasSubCharge1 = rtrim((String) fields[6]);
		this.vasSubCharge2 = rtrim((String) fields[7]);
		this.vasSubCharge3 = rtrim((String) fields[8]);
		this.vasTwinbillNo = ((Short) fields[9]);
		this.vasMultiCharge = rtrim((String) fields[10]);
		this.vamSubscriberId = ((Integer) fields[11]);
		this.vamSimNo = rtrim((String) fields[12]);
		this.vamMsisdnNo = rtrim((String) fields[13]);
		this.vamTwinbillNo = ((Short) fields[14]);
		this.vamStatCode = rtrim((String) fields[15]);
		this.vamConnectDate = ((fields[16] == null) ? null : new Date(fields[16]));
		this.vamDconnectDate = ((fields[17] == null) ? null : new Date(fields[17]));
		this.vamInternTariff = rtrim((String) fields[18]);
		this.vamContrTerminat = ((fields[19] == null) ? null : new Date(fields[19]));
		this.vamContrPeriod = ((Short) fields[20]);
		this.vamTerminatNotif = ((fields[21] == null) ? null : new Date(fields[21]));
		this.vamDirEntry = rtrim((String) fields[22]);
		this.vamItemised = rtrim((String) fields[23]);
		this.vamDepartment = rtrim((String) fields[24]);
		this.vamSalesman = rtrim((String) fields[25]);
		this.vamDealerId = rtrim((String) fields[26]);
		this.vamAbarDate = ((fields[27] == null) ? null : new Date(fields[27]));
		this.vamSubsSuffix = rtrim((String) fields[28]);
		this.vamMessComment = rtrim((String) fields[29]);
		this.vamAirtimeNet = rtrim((String) fields[30]);
		this.vamPrFlag = rtrim((String) fields[31]);
		this.vamHierarchy = rtrim((String) fields[32]);
		this.vamMsisdnKnown = rtrim((String) fields[33]);
		this.vamTariffChg = ((fields[34] == null) ? null : new Date(fields[34]));
		this.vamOrigProvId = rtrim((String) fields[35]);
		this.vamImpProvId = rtrim((String) fields[36]);
		this.vamOrigServProv = rtrim((String) fields[37]);
		this.vamImpServProv = rtrim((String) fields[38]);
		this.vamMsisdnType = rtrim((String) fields[39]);
		this.vamDummy = rtrim((String) fields[40]);
		this.vamMsisdnExprtd = ((fields[41] == null) ? null : new Date(fields[41]));
		this.vamExportedTo = rtrim((String) fields[42]);
		this.vamAnalysis1 = rtrim((String) fields[43]);
		this.vamAnalysis2 = rtrim((String) fields[44]);
		this.vamAnalysis3 = rtrim((String) fields[45]);
		this.vamAnalysis4 = rtrim((String) fields[46]);
		this.vamAnalysis5 = rtrim((String) fields[47]);
		this.vsrServiceCode = rtrim((String) fields[48]);
		this.vsrServiceType = rtrim((String) fields[49]);
		this.vsrServiceDesc = rtrim((String) fields[50]);
		this.vsrOriginator = rtrim((String) fields[51]);
		this.vsrServiceClass = rtrim((String) fields[52]);
		this.vsrTempDeact = rtrim((String) fields[53]);
		this.vsrProrata = rtrim((String) fields[54]);
		this.vsrProviderId = rtrim((String) fields[55]);
		this.vsrShortDesc = rtrim((String) fields[56]);
		this.vsrSuspend = rtrim((String) fields[57]);
		this.vstServiceType = rtrim((String) fields[58]);
		this.vstServiceDesc = rtrim((String) fields[59]);
		this.vstMultiCharge = rtrim((String) fields[60]);
		this.vstServiceClass = rtrim((String) fields[61]);
		this.vstAutoConnect = rtrim((String) fields[62]);
		this.vstOriginator = rtrim((String) fields[63]);
		this.vstTariffRelated = rtrim((String) fields[64]);
		this.vstParameterised = rtrim((String) fields[65]);
		this.vstParamsLevel = rtrim((String) fields[66]);
		this.vstArchiveMonths = ((Short) fields[67]);
		this.vstFutureAct = rtrim((String) fields[68]);
		this.vstNodeLevel = rtrim((String) fields[69]);
	}

	public void set(final Integer vasSubscriberId, final String vasServiceCode, final String vasInternTariff,
			final String vasServiceType, final Date vasActDate, final Date vasDeactDate, final String vasSubCharge1,
			final String vasSubCharge2, final String vasSubCharge3, final Short vasTwinbillNo,
			final String vasMultiCharge, final Integer vamSubscriberId, final String vamSimNo, final String vamMsisdnNo,
			final Short vamTwinbillNo, final String vamStatCode, final Date vamConnectDate, final Date vamDconnectDate,
			final String vamInternTariff, final Date vamContrTerminat, final Short vamContrPeriod,
			final Date vamTerminatNotif, final String vamDirEntry, final String vamItemised, final String vamDepartment,
			final String vamSalesman, final String vamDealerId, final Date vamAbarDate, final String vamSubsSuffix,
			final String vamMessComment, final String vamAirtimeNet, final String vamPrFlag, final String vamHierarchy,
			final String vamMsisdnKnown, final Date vamTariffChg, final String vamOrigProvId, final String vamImpProvId,
			final String vamOrigServProv, final String vamImpServProv, final String vamMsisdnType,
			final String vamDummy, final Date vamMsisdnExprtd, final String vamExportedTo, final String vamAnalysis1,
			final String vamAnalysis2, final String vamAnalysis3, final String vamAnalysis4, final String vamAnalysis5,
			final String vsrServiceCode, final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass, final String vsrTempDeact,
			final String vsrProrata, final String vsrProviderId, final String vsrShortDesc, final String vsrSuspend,
			final String vstServiceType, final String vstServiceDesc, final String vstMultiCharge,
			final String vstServiceClass, final String vstAutoConnect, final String vstOriginator,
			final String vstTariffRelated, final String vstParameterised, final String vstParamsLevel,
			final Short vstArchiveMonths, final String vstFutureAct, final String vstNodeLevel) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = vasActDate;
		this.vasDeactDate = vasDeactDate;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
		this.vamSubscriberId = vamSubscriberId;
		this.vamSimNo = vamSimNo;
		this.vamMsisdnNo = vamMsisdnNo;
		this.vamTwinbillNo = vamTwinbillNo;
		this.vamStatCode = vamStatCode;
		this.vamConnectDate = vamConnectDate;
		this.vamDconnectDate = vamDconnectDate;
		this.vamInternTariff = vamInternTariff;
		this.vamContrTerminat = vamContrTerminat;
		this.vamContrPeriod = vamContrPeriod;
		this.vamTerminatNotif = vamTerminatNotif;
		this.vamDirEntry = vamDirEntry;
		this.vamItemised = vamItemised;
		this.vamDepartment = vamDepartment;
		this.vamSalesman = vamSalesman;
		this.vamDealerId = vamDealerId;
		this.vamAbarDate = vamAbarDate;
		this.vamSubsSuffix = vamSubsSuffix;
		this.vamMessComment = vamMessComment;
		this.vamAirtimeNet = vamAirtimeNet;
		this.vamPrFlag = vamPrFlag;
		this.vamHierarchy = vamHierarchy;
		this.vamMsisdnKnown = vamMsisdnKnown;
		this.vamTariffChg = vamTariffChg;
		this.vamOrigProvId = vamOrigProvId;
		this.vamImpProvId = vamImpProvId;
		this.vamOrigServProv = vamOrigServProv;
		this.vamImpServProv = vamImpServProv;
		this.vamMsisdnType = vamMsisdnType;
		this.vamDummy = vamDummy;
		this.vamMsisdnExprtd = vamMsisdnExprtd;
		this.vamExportedTo = vamExportedTo;
		this.vamAnalysis1 = vamAnalysis1;
		this.vamAnalysis2 = vamAnalysis2;
		this.vamAnalysis3 = vamAnalysis3;
		this.vamAnalysis4 = vamAnalysis4;
		this.vamAnalysis5 = vamAnalysis5;
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

	public Integer getVasSubscriberId() {
		return vasSubscriberId;
	}

	public void setVasSubscriberId(Integer vasSubscriberId) {
		this.vasSubscriberId = vasSubscriberId;
	}

	public String getVasServiceCode() {
		return vasServiceCode;
	}

	public void setVasServiceCode(String vasServiceCode) {
		this.vasServiceCode = vasServiceCode;
	}

	public String getVasInternTariff() {
		return vasInternTariff;
	}

	public void setVasInternTariff(String vasInternTariff) {
		this.vasInternTariff = vasInternTariff;
	}

	public String getVasServiceType() {
		return vasServiceType;
	}

	public void setVasServiceType(String vasServiceType) {
		this.vasServiceType = vasServiceType;
	}

	public Date getVasActDate() {
		return vasActDate;
	}

	public void setVasActDate(Date vasActDate) {
		this.vasActDate = vasActDate;
	}

	public Date getVasDeactDate() {
		return vasDeactDate;
	}

	public void setVasDeactDate(Date vasDeactDate) {
		this.vasDeactDate = vasDeactDate;
	}

	public String getVasSubCharge1() {
		return vasSubCharge1;
	}

	public void setVasSubCharge1(String vasSubCharge1) {
		this.vasSubCharge1 = vasSubCharge1;
	}

	public String getVasSubCharge2() {
		return vasSubCharge2;
	}

	public void setVasSubCharge2(String vasSubCharge2) {
		this.vasSubCharge2 = vasSubCharge2;
	}

	public String getVasSubCharge3() {
		return vasSubCharge3;
	}

	public void setVasSubCharge3(String vasSubCharge3) {
		this.vasSubCharge3 = vasSubCharge3;
	}

	public Short getVasTwinbillNo() {
		return vasTwinbillNo;
	}

	public void setVasTwinbillNo(Short vasTwinbillNo) {
		this.vasTwinbillNo = vasTwinbillNo;
	}

	public String getVasMultiCharge() {
		return vasMultiCharge;
	}

	public void setVasMultiCharge(String vasMultiCharge) {
		this.vasMultiCharge = vasMultiCharge;
	}

	public Integer getVamSubscriberId() {
		return vamSubscriberId;
	}

	public void setVamSubscriberId(Integer vamSubscriberId) {
		this.vamSubscriberId = vamSubscriberId;
	}

	public String getVamSimNo() {
		return vamSimNo;
	}

	public void setVamSimNo(String vamSimNo) {
		this.vamSimNo = vamSimNo;
	}

	public String getVamMsisdnNo() {
		return vamMsisdnNo;
	}

	public void setVamMsisdnNo(String vamMsisdnNo) {
		this.vamMsisdnNo = vamMsisdnNo;
	}

	public Short getVamTwinbillNo() {
		return vamTwinbillNo;
	}

	public void setVamTwinbillNo(Short vamTwinbillNo) {
		this.vamTwinbillNo = vamTwinbillNo;
	}

	public String getVamStatCode() {
		return vamStatCode;
	}

	public void setVamStatCode(String vamStatCode) {
		this.vamStatCode = vamStatCode;
	}

	public Date getVamConnectDate() {
		return vamConnectDate;
	}

	public void setVamConnectDate(Date vamConnectDate) {
		this.vamConnectDate = vamConnectDate;
	}

	public Date getVamDconnectDate() {
		return vamDconnectDate;
	}

	public void setVamDconnectDate(Date vamDconnectDate) {
		this.vamDconnectDate = vamDconnectDate;
	}

	public String getVamInternTariff() {
		return vamInternTariff;
	}

	public void setVamInternTariff(String vamInternTariff) {
		this.vamInternTariff = vamInternTariff;
	}

	public Date getVamContrTerminat() {
		return vamContrTerminat;
	}

	public void setVamContrTerminat(Date vamContrTerminat) {
		this.vamContrTerminat = vamContrTerminat;
	}

	public Short getVamContrPeriod() {
		return vamContrPeriod;
	}

	public void setVamContrPeriod(Short vamContrPeriod) {
		this.vamContrPeriod = vamContrPeriod;
	}

	public Date getVamTerminatNotif() {
		return vamTerminatNotif;
	}

	public void setVamTerminatNotif(Date vamTerminatNotif) {
		this.vamTerminatNotif = vamTerminatNotif;
	}

	public String getVamDirEntry() {
		return vamDirEntry;
	}

	public void setVamDirEntry(String vamDirEntry) {
		this.vamDirEntry = vamDirEntry;
	}

	public String getVamItemised() {
		return vamItemised;
	}

	public void setVamItemised(String vamItemised) {
		this.vamItemised = vamItemised;
	}

	public String getVamDepartment() {
		return vamDepartment;
	}

	public void setVamDepartment(String vamDepartment) {
		this.vamDepartment = vamDepartment;
	}

	public String getVamSalesman() {
		return vamSalesman;
	}

	public void setVamSalesman(String vamSalesman) {
		this.vamSalesman = vamSalesman;
	}

	public String getVamDealerId() {
		return vamDealerId;
	}

	public void setVamDealerId(String vamDealerId) {
		this.vamDealerId = vamDealerId;
	}

	public Date getVamAbarDate() {
		return vamAbarDate;
	}

	public void setVamAbarDate(Date vamAbarDate) {
		this.vamAbarDate = vamAbarDate;
	}

	public String getVamSubsSuffix() {
		return vamSubsSuffix;
	}

	public void setVamSubsSuffix(String vamSubsSuffix) {
		this.vamSubsSuffix = vamSubsSuffix;
	}

	public String getVamMessComment() {
		return vamMessComment;
	}

	public void setVamMessComment(String vamMessComment) {
		this.vamMessComment = vamMessComment;
	}

	public String getVamAirtimeNet() {
		return vamAirtimeNet;
	}

	public void setVamAirtimeNet(String vamAirtimeNet) {
		this.vamAirtimeNet = vamAirtimeNet;
	}

	public String getVamPrFlag() {
		return vamPrFlag;
	}

	public void setVamPrFlag(String vamPrFlag) {
		this.vamPrFlag = vamPrFlag;
	}

	public String getVamHierarchy() {
		return vamHierarchy;
	}

	public void setVamHierarchy(String vamHierarchy) {
		this.vamHierarchy = vamHierarchy;
	}

	public String getVamMsisdnKnown() {
		return vamMsisdnKnown;
	}

	public void setVamMsisdnKnown(String vamMsisdnKnown) {
		this.vamMsisdnKnown = vamMsisdnKnown;
	}

	public Date getVamTariffChg() {
		return vamTariffChg;
	}

	public void setVamTariffChg(Date vamTariffChg) {
		this.vamTariffChg = vamTariffChg;
	}

	public String getVamOrigProvId() {
		return vamOrigProvId;
	}

	public void setVamOrigProvId(String vamOrigProvId) {
		this.vamOrigProvId = vamOrigProvId;
	}

	public String getVamImpProvId() {
		return vamImpProvId;
	}

	public void setVamImpProvId(String vamImpProvId) {
		this.vamImpProvId = vamImpProvId;
	}

	public String getVamOrigServProv() {
		return vamOrigServProv;
	}

	public void setVamOrigServProv(String vamOrigServProv) {
		this.vamOrigServProv = vamOrigServProv;
	}

	public String getVamImpServProv() {
		return vamImpServProv;
	}

	public void setVamImpServProv(String vamImpServProv) {
		this.vamImpServProv = vamImpServProv;
	}

	public String getVamMsisdnType() {
		return vamMsisdnType;
	}

	public void setVamMsisdnType(String vamMsisdnType) {
		this.vamMsisdnType = vamMsisdnType;
	}

	public String getVamDummy() {
		return vamDummy;
	}

	public void setVamDummy(String vamDummy) {
		this.vamDummy = vamDummy;
	}

	public Date getVamMsisdnExprtd() {
		return vamMsisdnExprtd;
	}

	public void setVamMsisdnExprtd(Date vamMsisdnExprtd) {
		this.vamMsisdnExprtd = vamMsisdnExprtd;
	}

	public String getVamExportedTo() {
		return vamExportedTo;
	}

	public void setVamExportedTo(String vamExportedTo) {
		this.vamExportedTo = vamExportedTo;
	}

	public String getVamAnalysis1() {
		return vamAnalysis1;
	}

	public void setVamAnalysis1(String vamAnalysis1) {
		this.vamAnalysis1 = vamAnalysis1;
	}

	public String getVamAnalysis2() {
		return vamAnalysis2;
	}

	public void setVamAnalysis2(String vamAnalysis2) {
		this.vamAnalysis2 = vamAnalysis2;
	}

	public String getVamAnalysis3() {
		return vamAnalysis3;
	}

	public void setVamAnalysis3(String vamAnalysis3) {
		this.vamAnalysis3 = vamAnalysis3;
	}

	public String getVamAnalysis4() {
		return vamAnalysis4;
	}

	public void setVamAnalysis4(String vamAnalysis4) {
		this.vamAnalysis4 = vamAnalysis4;
	}

	public String getVamAnalysis5() {
		return vamAnalysis5;
	}

	public void setVamAnalysis5(String vamAnalysis5) {
		this.vamAnalysis5 = vamAnalysis5;
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

	public VamActiveMsisdnDMO getVamDMO() {
		return vamDMO;
	}

	public void setVamDMO(VamActiveMsisdnDMO vamDMO) {
		this.vamDMO = vamDMO;
	}

	public VasActiveServiceDMO getVasDMO() {
		return vasDMO;
	}

	public void setVasDMO(VasActiveServiceDMO vasDMO) {
		this.vasDMO = vasDMO;
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
}
