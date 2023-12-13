package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class VamSbdDQO extends DBO implements Serializable {

	private VamActiveMsisdnDMO vamDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	
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

	public static final int vamSubscriberIdFilter = 0;

	public static final int vamSimNoFilter = 1;
	private static final int vamSimNoSize = 14;

	public static final int vamMsisdnNoFilter = 2;
	private static final int vamMsisdnNoSize = 15;

	public static final int vamTwinbillNoFilter = 3;

	public static final int vamStatCodeFilter = 4;
	private static final int vamStatCodeSize = 2;

	public static final int vamConnectDateFilter = 5;

	public static final int vamDconnectDateFilter = 6;

	public static final int vamInternTariffFilter = 7;
	private static final int vamInternTariffSize = 20;

	public static final int vamContrTerminatFilter = 8;

	public static final int vamContrPeriodFilter = 9;

	public static final int vamTerminatNotifFilter = 10;

	public static final int vamDirEntryFilter = 11;
	private static final int vamDirEntrySize = 1;

	public static final int vamItemisedFilter = 12;
	private static final int vamItemisedSize = 1;

	public static final int vamDepartmentFilter = 13;
	private static final int vamDepartmentSize = 3;

	public static final int vamSalesmanFilter = 14;
	private static final int vamSalesmanSize = 10;

	public static final int vamDealerIdFilter = 15;
	private static final int vamDealerIdSize = 8;

	public static final int vamAbarDateFilter = 16;

	public static final int vamSubsSuffixFilter = 17;
	private static final int vamSubsSuffixSize = 1;

	public static final int vamMessCommentFilter = 18;
	private static final int vamMessCommentSize = 20;

	public static final int vamAirtimeNetFilter = 19;
	private static final int vamAirtimeNetSize = 1;

	public static final int vamPrFlagFilter = 20;
	private static final int vamPrFlagSize = 1;

	public static final int vamHierarchyFilter = 21;
	private static final int vamHierarchySize = 1;

	public static final int vamMsisdnKnownFilter = 22;
	private static final int vamMsisdnKnownSize = 1;

	public static final int vamTariffChgFilter = 23;

	public static final int vamOrigProvIdFilter = 24;
	private static final int vamOrigProvIdSize = 5;

	public static final int vamImpProvIdFilter = 25;
	private static final int vamImpProvIdSize = 5;

	public static final int vamOrigServProvFilter = 26;
	private static final int vamOrigServProvSize = 5;

	public static final int vamImpServProvFilter = 27;
	private static final int vamImpServProvSize = 5;

	public static final int vamMsisdnTypeFilter = 28;
	private static final int vamMsisdnTypeSize = 50;

	public static final int vamDummyFilter = 29;
	private static final int vamDummySize = 1;

	public static final int vamMsisdnExprtdFilter = 30;

	public static final int vamExportedToFilter = 31;
	private static final int vamExportedToSize = 5;

	public static final int vamAnalysis1Filter = 32;
	private static final int vamAnalysis1Size = 30;

	public static final int vamAnalysis2Filter = 33;
	private static final int vamAnalysis2Size = 30;

	public static final int vamAnalysis3Filter = 34;
	private static final int vamAnalysis3Size = 30;

	public static final int vamAnalysis4Filter = 35;
	private static final int vamAnalysis4Size = 30;

	public static final int vamAnalysis5Filter = 36;
	private static final int vamAnalysis5Size = 30;

	public static final int sbdSubscriberIdFilter = 37;

	public static final int sbdDiallingNoFilter = 38;
	private static final int sbdDiallingNoSize = 15;

	public static final int sbdBillAcNoFilter = 39;
	private static final int sbdBillAcNoSize = 8;

	public static final int sbdConnectDateFilter = 40;

	public static final int sbdDconnectDateFilter = 41;

	public static final int sbdTermDateFilter = 42;

	public static final int sbdTitleFilter = 43;
	private static final int sbdTitleSize = 10;

	public static final int sbdSurnameFilter = 44;
	private static final int sbdSurnameSize = 50;

	public static final int sbdFirstnameFilter = 45;
	private static final int sbdFirstnameSize = 50;

	public static final int sbdGenderFilter = 46;
	private static final int sbdGenderSize = 1;

	public static final int sbdDobFilter = 47;

	public static final int sbdPasswordFilter = 48;
	private static final int sbdPasswordSize = 20;

	public static final int sbdLocationCodeFilter = 49;
	private static final int sbdLocationCodeSize = 15;

	public static final int sbdBillCycleFilter = 50;
	private static final int sbdBillCycleSize = 5;

	public static final int sbdPackageCodeFilter = 51;
	private static final int sbdPackageCodeSize = 5;

	public static final int sbdBilledUptoFilter = 52;

	public static final int sbdTariffPlanFilter = 53;
	private static final int sbdTariffPlanSize = 20;

	public VamSbdDQO() {
	};

	public VamSbdDQO(final Integer vamSubscriberId, final String vamSimNo, final String vamMsisdnNo,
			final Short vamTwinbillNo, final String vamStatCode, final Date vamConnectDate, final Date vamDconnectDate,
			final String vamInternTariff, final Date vamContrTerminat, final Short vamContrPeriod,
			final Date vamTerminatNotif, final String vamDirEntry, final String vamItemised, final String vamDepartment,
			final String vamSalesman, final String vamDealerId, final Date vamAbarDate, final String vamSubsSuffix,
			final String vamMessComment, final String vamAirtimeNet, final String vamPrFlag, final String vamHierarchy,
			final String vamMsisdnKnown, final Date vamTariffChg, final String vamOrigProvId, final String vamImpProvId,
			final String vamOrigServProv, final String vamImpServProv, final String vamMsisdnType,
			final String vamDummy, final Date vamMsisdnExprtd, final String vamExportedTo, final String vamAnalysis1,
			final String vamAnalysis2, final String vamAnalysis3, final String vamAnalysis4, final String vamAnalysis5,
			final Integer sbdSubscriberId, final String sbdDiallingNo, final String sbdBillAcNo,
			final Date sbdConnectDate, final Date sbdDconnectDate, final Date sbdTermDate, final String sbdTitle,
			final String sbdSurname, final String sbdFirstname, final String sbdGender, final Date sbdDob,
			final String sbdPassword, final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto, final String sbdTariffPlan) {

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
	};

	private static final int[] fieldSizes = new int[] { 0, vamSimNoSize, vamMsisdnNoSize, 0, vamStatCodeSize, 0, 0,
			vamInternTariffSize, 0, 0, 0, vamDirEntrySize, vamItemisedSize, vamDepartmentSize, vamSalesmanSize,
			vamDealerIdSize, 0, vamSubsSuffixSize, vamMessCommentSize, vamAirtimeNetSize, vamPrFlagSize,
			vamHierarchySize, vamMsisdnKnownSize, 0, vamOrigProvIdSize, vamImpProvIdSize, vamOrigServProvSize,
			vamImpServProvSize, vamMsisdnTypeSize, vamDummySize, 0, vamExportedToSize, vamAnalysis1Size,
			vamAnalysis2Size, vamAnalysis3Size, vamAnalysis4Size, vamAnalysis5Size, 0, sbdDiallingNoSize,
			sbdBillAcNoSize, 0, 0, 0, sbdTitleSize, sbdSurnameSize, sbdFirstnameSize, sbdGenderSize, 0, sbdPasswordSize,
			sbdLocationCodeSize, sbdBillCycleSize, sbdPackageCodeSize, 0, sbdTariffPlanSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING };

	public void deConstruct() {		
		sbdDMO = new SbdSubDetsDMO(sbdSubscriberId, sbdDiallingNo, sbdBillAcNo, sbdConnectDate, sbdDconnectDate, sbdTermDate, sbdTitle, sbdSurname, sbdFirstname, sbdGender, sbdDob, sbdPassword, sbdLocationCode, sbdBillCycle, sbdPackageCode, sbdBilledUpto, sbdTariffPlan);
		vamDMO = new VamActiveMsisdnDMO(vamSubscriberId, vamSimNo, vamMsisdnNo, vamTwinbillNo, vamStatCode, vamConnectDate, vamDconnectDate, vamInternTariff, vamContrTerminat, vamContrPeriod, vamTerminatNotif, vamDirEntry, vamItemised, vamDepartment, vamSalesman, vamDealerId, vamAbarDate, vamSubsSuffix, vamMessComment, vamAirtimeNet, vamPrFlag, vamHierarchy, vamMsisdnKnown, vamTariffChg, vamOrigProvId, vamImpProvId, vamOrigServProv, vamImpServProv, vamMsisdnType, vamDummy, vamMsisdnExprtd, vamExportedTo, vamAnalysis1, vamAnalysis2, vamAnalysis3, vamAnalysis4, vamAnalysis5);
	}
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.vamSubscriberId,
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
								: this.sbdTariffPlan.substring(0, this.sbdTariffPlanSize)) };
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
		this.vamSubscriberId = ((Integer) fields[0]);
		this.vamSimNo = rtrim((String) fields[1]);
		this.vamMsisdnNo = rtrim((String) fields[2]);
		this.vamTwinbillNo = ((Short) fields[3]);
		this.vamStatCode = rtrim((String) fields[4]);
		this.vamConnectDate = ((fields[5] == null) ? null : new Date(fields[5]));
		this.vamDconnectDate = ((fields[6] == null) ? null : new Date(fields[6]));
		this.vamInternTariff = rtrim((String) fields[7]);
		this.vamContrTerminat = ((fields[8] == null) ? null : new Date(fields[8]));
		this.vamContrPeriod = ((Short) fields[9]);
		this.vamTerminatNotif = ((fields[10] == null) ? null : new Date(fields[10]));
		this.vamDirEntry = rtrim((String) fields[11]);
		this.vamItemised = rtrim((String) fields[12]);
		this.vamDepartment = rtrim((String) fields[13]);
		this.vamSalesman = rtrim((String) fields[14]);
		this.vamDealerId = rtrim((String) fields[15]);
		this.vamAbarDate = ((fields[16] == null) ? null : new Date(fields[16]));
		this.vamSubsSuffix = rtrim((String) fields[17]);
		this.vamMessComment = rtrim((String) fields[18]);
		this.vamAirtimeNet = rtrim((String) fields[19]);
		this.vamPrFlag = rtrim((String) fields[20]);
		this.vamHierarchy = rtrim((String) fields[21]);
		this.vamMsisdnKnown = rtrim((String) fields[22]);
		this.vamTariffChg = ((fields[23] == null) ? null : new Date(fields[23]));
		this.vamOrigProvId = rtrim((String) fields[24]);
		this.vamImpProvId = rtrim((String) fields[25]);
		this.vamOrigServProv = rtrim((String) fields[26]);
		this.vamImpServProv = rtrim((String) fields[27]);
		this.vamMsisdnType = rtrim((String) fields[28]);
		this.vamDummy = rtrim((String) fields[29]);
		this.vamMsisdnExprtd = ((fields[30] == null) ? null : new Date(fields[30]));
		this.vamExportedTo = rtrim((String) fields[31]);
		this.vamAnalysis1 = rtrim((String) fields[32]);
		this.vamAnalysis2 = rtrim((String) fields[33]);
		this.vamAnalysis3 = rtrim((String) fields[34]);
		this.vamAnalysis4 = rtrim((String) fields[35]);
		this.vamAnalysis5 = rtrim((String) fields[36]);
		this.sbdSubscriberId = ((Integer) fields[37]);
		this.sbdDiallingNo = rtrim((String) fields[38]);
		this.sbdBillAcNo = rtrim((String) fields[39]);
		this.sbdConnectDate = ((fields[40] == null) ? null : new Date(fields[40]));
		this.sbdDconnectDate = ((fields[41] == null) ? null : new Date(fields[41]));
		this.sbdTermDate = ((fields[42] == null) ? null : new Date(fields[42]));
		this.sbdTitle = rtrim((String) fields[43]);
		this.sbdSurname = rtrim((String) fields[44]);
		this.sbdFirstname = rtrim((String) fields[45]);
		this.sbdGender = rtrim((String) fields[46]);
		this.sbdDob = ((fields[47] == null) ? null : new Date(fields[47]));
		this.sbdPassword = rtrim((String) fields[48]);
		this.sbdLocationCode = rtrim((String) fields[49]);
		this.sbdBillCycle = rtrim((String) fields[50]);
		this.sbdPackageCode = rtrim((String) fields[51]);
		this.sbdBilledUpto = ((fields[52] == null) ? null : new Date(fields[52]));
		this.sbdTariffPlan = rtrim((String) fields[53]);
	}

	public void set(final Integer vamSubscriberId, final String vamSimNo, final String vamMsisdnNo,
			final Short vamTwinbillNo, final String vamStatCode, final Date vamConnectDate, final Date vamDconnectDate,
			final String vamInternTariff, final Date vamContrTerminat, final Short vamContrPeriod,
			final Date vamTerminatNotif, final String vamDirEntry, final String vamItemised, final String vamDepartment,
			final String vamSalesman, final String vamDealerId, final Date vamAbarDate, final String vamSubsSuffix,
			final String vamMessComment, final String vamAirtimeNet, final String vamPrFlag, final String vamHierarchy,
			final String vamMsisdnKnown, final Date vamTariffChg, final String vamOrigProvId, final String vamImpProvId,
			final String vamOrigServProv, final String vamImpServProv, final String vamMsisdnType,
			final String vamDummy, final Date vamMsisdnExprtd, final String vamExportedTo, final String vamAnalysis1,
			final String vamAnalysis2, final String vamAnalysis3, final String vamAnalysis4, final String vamAnalysis5,
			final Integer sbdSubscriberId, final String sbdDiallingNo, final String sbdBillAcNo,
			final Date sbdConnectDate, final Date sbdDconnectDate, final Date sbdTermDate, final String sbdTitle,
			final String sbdSurname, final String sbdFirstname, final String sbdGender, final Date sbdDob,
			final String sbdPassword, final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto, final String sbdTariffPlan) {

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

	public VamActiveMsisdnDMO getVamDMO() {
		return vamDMO;
	}

	public void setVamDMO(VamActiveMsisdnDMO vamDMO) {
		this.vamDMO = vamDMO;
	}

	public SbdSubDetsDMO getSbdDMO() {
		return sbdDMO;
	}

	public void setSbdDMO(SbdSubDetsDMO sbdDMO) {
		this.sbdDMO = sbdDMO;
	}

}
