package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SbaSubAuxDMO;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SbdsbaDQO extends DBO implements Serializable {

	private SbdSubDetsDMO sbdDMO;
	private SbaSubAuxDMO sbaDMO;
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
	private Integer sbaSubscriberId;
	private String sbaIdNumber;
	private String sbaMatchcode;
	private String sbaMarketing;
	private String sbaThirdParty;
	private String sbaCustDept;
	private String sbaDealerId;
	private String sbaDepartment;
	private String sbaSalesman;
	private String sbaRegion;
	private Integer sbaInvoiceAddrid;
	private String sbaInvAccount;
	private String sbaPrepaidStat;
	private String sbaAnalysis1;
	private String sbaAnalysis2;
	private String sbaAnalysis3;
	private String sbaAnalysis4;
	private String sbaAnalysis5;
	private String sbaAnalysis6;
	private String sbaAnalysis7;
	private String sbaAnalysis8;
	private String sbaAnalysis9;
	private String sbaAnalysis10;
	private String sbaAnalysis11;
	private String sbaAnalysis12;
	private String sbaAnalysis13;
	private String sbaAnalysis14;
	private String sbaAnalysis15;
	private String sbaAnalysis16;
	private String sbaAnalysis17;
	private String sbaAnalysis18;
	private String sbaAnalysis19;
	private String sbaAnalysis20;
	private String sbaAnalysis21;
	private String sbaAnalysis22;
	private String sbaAnalysis23;
	private String sbaAnalysis24;
	private String sbaAnalysis25;
	private String sbaAnalysis26;
	private String sbaAnalysis27;
	private String sbaAnalysis28;
	private String sbaAnalysis29;
	private String sbaAnalysis30;
	private String sbaComments;

	public static final int sbdSubscriberIdFilter = 0;

	public static final int sbdDiallingNoFilter = 1;
	private static final int sbdDiallingNoSize = 15;

	public static final int sbdBillAcNoFilter = 2;
	private static final int sbdBillAcNoSize = 8;

	public static final int sbdConnectDateFilter = 3;

	public static final int sbdDconnectDateFilter = 4;

	public static final int sbdTermDateFilter = 5;

	public static final int sbdTitleFilter = 6;
	private static final int sbdTitleSize = 10;

	public static final int sbdSurnameFilter = 7;
	private static final int sbdSurnameSize = 50;

	public static final int sbdFirstnameFilter = 8;
	private static final int sbdFirstnameSize = 50;

	public static final int sbdGenderFilter = 9;
	private static final int sbdGenderSize = 1;

	public static final int sbdDobFilter = 10;

	public static final int sbdPasswordFilter = 11;
	private static final int sbdPasswordSize = 20;

	public static final int sbdLocationCodeFilter = 12;
	private static final int sbdLocationCodeSize = 15;

	public static final int sbdBillCycleFilter = 13;
	private static final int sbdBillCycleSize = 5;

	public static final int sbdPackageCodeFilter = 14;
	private static final int sbdPackageCodeSize = 5;

	public static final int sbdBilledUptoFilter = 15;

	public static final int sbdTariffPlanFilter = 16;
	private static final int sbdTariffPlanSize = 3;

	public static final int sbaSubscriberIdFilter = 17;

	public static final int sbaIdNumberFilter = 18;
	private static final int sbaIdNumberSize = 20;

	public static final int sbaMatchcodeFilter = 19;
	private static final int sbaMatchcodeSize = 20;

	public static final int sbaMarketingFilter = 20;
	private static final int sbaMarketingSize = 1;

	public static final int sbaThirdPartyFilter = 21;
	private static final int sbaThirdPartySize = 1;

	public static final int sbaCustDeptFilter = 22;
	private static final int sbaCustDeptSize = 10;

	public static final int sbaDealerIdFilter = 23;
	private static final int sbaDealerIdSize = 8;

	public static final int sbaDepartmentFilter = 24;
	private static final int sbaDepartmentSize = 10;

	public static final int sbaSalesmanFilter = 25;
	private static final int sbaSalesmanSize = 10;

	public static final int sbaRegionFilter = 26;
	private static final int sbaRegionSize = 6;

	public static final int sbaInvoiceAddridFilter = 27;

	public static final int sbaInvAccountFilter = 28;
	private static final int sbaInvAccountSize = 8;

	public static final int sbaPrepaidStatFilter = 29;
	private static final int sbaPrepaidStatSize = 2;

	public static final int sbaAnalysis1Filter = 30;
	private static final int sbaAnalysis1Size = 30;

	public static final int sbaAnalysis2Filter = 31;
	private static final int sbaAnalysis2Size = 30;

	public static final int sbaAnalysis3Filter = 32;
	private static final int sbaAnalysis3Size = 30;

	public static final int sbaAnalysis4Filter = 33;
	private static final int sbaAnalysis4Size = 30;

	public static final int sbaAnalysis5Filter = 34;
	private static final int sbaAnalysis5Size = 30;

	public static final int sbaAnalysis6Filter = 35;
	private static final int sbaAnalysis6Size = 30;

	public static final int sbaAnalysis7Filter = 36;
	private static final int sbaAnalysis7Size = 30;

	public static final int sbaAnalysis8Filter = 37;
	private static final int sbaAnalysis8Size = 30;

	public static final int sbaAnalysis9Filter = 38;
	private static final int sbaAnalysis9Size = 30;

	public static final int sbaAnalysis10Filter = 39;
	private static final int sbaAnalysis10Size = 30;

	public static final int sbaAnalysis11Filter = 40;
	private static final int sbaAnalysis11Size = 30;

	public static final int sbaAnalysis12Filter = 41;
	private static final int sbaAnalysis12Size = 30;

	public static final int sbaAnalysis13Filter = 42;
	private static final int sbaAnalysis13Size = 30;

	public static final int sbaAnalysis14Filter = 43;
	private static final int sbaAnalysis14Size = 30;

	public static final int sbaAnalysis15Filter = 44;
	private static final int sbaAnalysis15Size = 30;

	public static final int sbaAnalysis16Filter = 45;
	private static final int sbaAnalysis16Size = 30;

	public static final int sbaAnalysis17Filter = 46;
	private static final int sbaAnalysis17Size = 30;

	public static final int sbaAnalysis18Filter = 47;
	private static final int sbaAnalysis18Size = 30;

	public static final int sbaAnalysis19Filter = 48;
	private static final int sbaAnalysis19Size = 30;

	public static final int sbaAnalysis20Filter = 49;
	private static final int sbaAnalysis20Size = 30;

	public static final int sbaAnalysis21Filter = 50;
	private static final int sbaAnalysis21Size = 30;

	public static final int sbaAnalysis22Filter = 51;
	private static final int sbaAnalysis22Size = 30;

	public static final int sbaAnalysis23Filter = 52;
	private static final int sbaAnalysis23Size = 30;

	public static final int sbaAnalysis24Filter = 53;
	private static final int sbaAnalysis24Size = 30;

	public static final int sbaAnalysis25Filter = 54;
	private static final int sbaAnalysis25Size = 30;

	public static final int sbaAnalysis26Filter = 55;
	private static final int sbaAnalysis26Size = 30;

	public static final int sbaAnalysis27Filter = 56;
	private static final int sbaAnalysis27Size = 30;

	public static final int sbaAnalysis28Filter = 57;
	private static final int sbaAnalysis28Size = 30;

	public static final int sbaAnalysis29Filter = 58;
	private static final int sbaAnalysis29Size = 30;

	public static final int sbaAnalysis30Filter = 59;
	private static final int sbaAnalysis30Size = 30;

	public static final int sbaCommentsFilter = 60;
	private static final int sbaCommentsSize = 50;

	public SbdsbaDQO() {
	};

	public SbdsbaDQO(final Integer sbdSubscriberId, final String sbdDiallingNo,
			final String sbdBillAcNo, final Date sbdConnectDate,
			final Date sbdDconnectDate, final Date sbdTermDate,
			final String sbdTitle, final String sbdSurname,
			final String sbdFirstname, final String sbdGender,
			final Date sbdDob, final String sbdPassword,
			final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto,
			final String sbdTariffPlan, final Integer sbaSubscriberId,
			final String sbaIdNumber, final String sbaMatchcode,
			final String sbaMarketing, final String sbaThirdParty,
			final String sbaCustDept, final String sbaDealerId,
			final String sbaDepartment, final String sbaSalesman,
			final String sbaRegion, final Integer sbaInvoiceAddrid,
			final String sbaInvAccount, final String sbaPrepaidStat,
			final String sbaAnalysis1, final String sbaAnalysis2,
			final String sbaAnalysis3, final String sbaAnalysis4,
			final String sbaAnalysis5, final String sbaAnalysis6,
			final String sbaAnalysis7, final String sbaAnalysis8,
			final String sbaAnalysis9, final String sbaAnalysis10,
			final String sbaAnalysis11, final String sbaAnalysis12,
			final String sbaAnalysis13, final String sbaAnalysis14,
			final String sbaAnalysis15, final String sbaAnalysis16,
			final String sbaAnalysis17, final String sbaAnalysis18,
			final String sbaAnalysis19, final String sbaAnalysis20,
			final String sbaAnalysis21, final String sbaAnalysis22,
			final String sbaAnalysis23, final String sbaAnalysis24,
			final String sbaAnalysis25, final String sbaAnalysis26,
			final String sbaAnalysis27, final String sbaAnalysis28,
			final String sbaAnalysis29, final String sbaAnalysis30,
			final String sbaComments) {

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
		this.sbaSubscriberId = sbaSubscriberId;
		this.sbaIdNumber = sbaIdNumber;
		this.sbaMatchcode = sbaMatchcode;
		this.sbaMarketing = sbaMarketing;
		this.sbaThirdParty = sbaThirdParty;
		this.sbaCustDept = sbaCustDept;
		this.sbaDealerId = sbaDealerId;
		this.sbaDepartment = sbaDepartment;
		this.sbaSalesman = sbaSalesman;
		this.sbaRegion = sbaRegion;
		this.sbaInvoiceAddrid = sbaInvoiceAddrid;
		this.sbaInvAccount = sbaInvAccount;
		this.sbaPrepaidStat = sbaPrepaidStat;
		this.sbaAnalysis1 = sbaAnalysis1;
		this.sbaAnalysis2 = sbaAnalysis2;
		this.sbaAnalysis3 = sbaAnalysis3;
		this.sbaAnalysis4 = sbaAnalysis4;
		this.sbaAnalysis5 = sbaAnalysis5;
		this.sbaAnalysis6 = sbaAnalysis6;
		this.sbaAnalysis7 = sbaAnalysis7;
		this.sbaAnalysis8 = sbaAnalysis8;
		this.sbaAnalysis9 = sbaAnalysis9;
		this.sbaAnalysis10 = sbaAnalysis10;
		this.sbaAnalysis11 = sbaAnalysis11;
		this.sbaAnalysis12 = sbaAnalysis12;
		this.sbaAnalysis13 = sbaAnalysis13;
		this.sbaAnalysis14 = sbaAnalysis14;
		this.sbaAnalysis15 = sbaAnalysis15;
		this.sbaAnalysis16 = sbaAnalysis16;
		this.sbaAnalysis17 = sbaAnalysis17;
		this.sbaAnalysis18 = sbaAnalysis18;
		this.sbaAnalysis19 = sbaAnalysis19;
		this.sbaAnalysis20 = sbaAnalysis20;
		this.sbaAnalysis21 = sbaAnalysis21;
		this.sbaAnalysis22 = sbaAnalysis22;
		this.sbaAnalysis23 = sbaAnalysis23;
		this.sbaAnalysis24 = sbaAnalysis24;
		this.sbaAnalysis25 = sbaAnalysis25;
		this.sbaAnalysis26 = sbaAnalysis26;
		this.sbaAnalysis27 = sbaAnalysis27;
		this.sbaAnalysis28 = sbaAnalysis28;
		this.sbaAnalysis29 = sbaAnalysis29;
		this.sbaAnalysis30 = sbaAnalysis30;
		this.sbaComments = sbaComments;
	};

	private static final int[] fieldSizes = new int[] { 0, sbdDiallingNoSize,
			sbdBillAcNoSize, 0, 0, 0, sbdTitleSize, sbdSurnameSize,
			sbdFirstnameSize, sbdGenderSize, 0, sbdPasswordSize,
			sbdLocationCodeSize, sbdBillCycleSize, sbdPackageCodeSize, 0,
			sbdTariffPlanSize, 0, sbaIdNumberSize, sbaMatchcodeSize,
			sbaMarketingSize, sbaThirdPartySize, sbaCustDeptSize,
			sbaDealerIdSize, sbaDepartmentSize, sbaSalesmanSize, sbaRegionSize,
			0, sbaInvAccountSize, sbaPrepaidStatSize, sbaAnalysis1Size,
			sbaAnalysis2Size, sbaAnalysis3Size, sbaAnalysis4Size,
			sbaAnalysis5Size, sbaAnalysis6Size, sbaAnalysis7Size,
			sbaAnalysis8Size, sbaAnalysis9Size, sbaAnalysis10Size,
			sbaAnalysis11Size, sbaAnalysis12Size, sbaAnalysis13Size,
			sbaAnalysis14Size, sbaAnalysis15Size, sbaAnalysis16Size,
			sbaAnalysis17Size, sbaAnalysis18Size, sbaAnalysis19Size,
			sbaAnalysis20Size, sbaAnalysis21Size, sbaAnalysis22Size,
			sbaAnalysis23Size, sbaAnalysis24Size, sbaAnalysis25Size,
			sbaAnalysis26Size, sbaAnalysis27Size, sbaAnalysis28Size,
			sbaAnalysis29Size, sbaAnalysis30Size, sbaCommentsSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbdSubscriberId,
				((this.sbdDiallingNo == null) ? null : (this.sbdDiallingNo
						.length() <= sbdDiallingNoSize) ? this.sbdDiallingNo
						: this.sbdDiallingNo.substring(0,
								this.sbdDiallingNoSize)),
				((this.sbdBillAcNo == null) ? null
						: (this.sbdBillAcNo.length() <= sbdBillAcNoSize) ? this.sbdBillAcNo
								: this.sbdBillAcNo.substring(0,
										this.sbdBillAcNoSize)),
				this.sbdConnectDate,
				this.sbdDconnectDate,
				this.sbdTermDate,
				((this.sbdTitle == null) ? null
						: (this.sbdTitle.length() <= sbdTitleSize) ? this.sbdTitle
								: this.sbdTitle.substring(0, this.sbdTitleSize)),
				((this.sbdSurname == null) ? null
						: (this.sbdSurname.length() <= sbdSurnameSize) ? this.sbdSurname
								: this.sbdSurname.substring(0,
										this.sbdSurnameSize)),
				((this.sbdFirstname == null) ? null : (this.sbdFirstname
						.length() <= sbdFirstnameSize) ? this.sbdFirstname
						: this.sbdFirstname.substring(0, this.sbdFirstnameSize)),
				((this.sbdGender == null) ? null
						: (this.sbdGender.length() <= sbdGenderSize) ? this.sbdGender
								: this.sbdGender.substring(0,
										this.sbdGenderSize)),
				this.sbdDob,
				((this.sbdPassword == null) ? null
						: (this.sbdPassword.length() <= sbdPasswordSize) ? this.sbdPassword
								: this.sbdPassword.substring(0,
										this.sbdPasswordSize)),
				((this.sbdLocationCode == null) ? null
						: (this.sbdLocationCode.length() <= sbdLocationCodeSize) ? this.sbdLocationCode
								: this.sbdLocationCode.substring(0,
										this.sbdLocationCodeSize)),
				((this.sbdBillCycle == null) ? null : (this.sbdBillCycle
						.length() <= sbdBillCycleSize) ? this.sbdBillCycle
						: this.sbdBillCycle.substring(0, this.sbdBillCycleSize)),
				((this.sbdPackageCode == null) ? null : (this.sbdPackageCode
						.length() <= sbdPackageCodeSize) ? this.sbdPackageCode
						: this.sbdPackageCode.substring(0,
								this.sbdPackageCodeSize)),
				this.sbdBilledUpto,
				((this.sbdTariffPlan == null) ? null : (this.sbdTariffPlan
						.length() <= sbdTariffPlanSize) ? this.sbdTariffPlan
						: this.sbdTariffPlan.substring(0,
								this.sbdTariffPlanSize)),
				this.sbaSubscriberId,
				((this.sbaIdNumber == null) ? null
						: (this.sbaIdNumber.length() <= sbaIdNumberSize) ? this.sbaIdNumber
								: this.sbaIdNumber.substring(0,
										this.sbaIdNumberSize)),
				((this.sbaMatchcode == null) ? null : (this.sbaMatchcode
						.length() <= sbaMatchcodeSize) ? this.sbaMatchcode
						: this.sbaMatchcode.substring(0, this.sbaMatchcodeSize)),
				((this.sbaMarketing == null) ? null : (this.sbaMarketing
						.length() <= sbaMarketingSize) ? this.sbaMarketing
						: this.sbaMarketing.substring(0, this.sbaMarketingSize)),
				((this.sbaThirdParty == null) ? null : (this.sbaThirdParty
						.length() <= sbaThirdPartySize) ? this.sbaThirdParty
						: this.sbaThirdParty.substring(0,
								this.sbaThirdPartySize)),
				((this.sbaCustDept == null) ? null
						: (this.sbaCustDept.length() <= sbaCustDeptSize) ? this.sbaCustDept
								: this.sbaCustDept.substring(0,
										this.sbaCustDeptSize)),
				((this.sbaDealerId == null) ? null
						: (this.sbaDealerId.length() <= sbaDealerIdSize) ? this.sbaDealerId
								: this.sbaDealerId.substring(0,
										this.sbaDealerIdSize)),
				((this.sbaDepartment == null) ? null : (this.sbaDepartment
						.length() <= sbaDepartmentSize) ? this.sbaDepartment
						: this.sbaDepartment.substring(0,
								this.sbaDepartmentSize)),
				((this.sbaSalesman == null) ? null
						: (this.sbaSalesman.length() <= sbaSalesmanSize) ? this.sbaSalesman
								: this.sbaSalesman.substring(0,
										this.sbaSalesmanSize)),
				((this.sbaRegion == null) ? null
						: (this.sbaRegion.length() <= sbaRegionSize) ? this.sbaRegion
								: this.sbaRegion.substring(0,
										this.sbaRegionSize)),
				this.sbaInvoiceAddrid,
				((this.sbaInvAccount == null) ? null : (this.sbaInvAccount
						.length() <= sbaInvAccountSize) ? this.sbaInvAccount
						: this.sbaInvAccount.substring(0,
								this.sbaInvAccountSize)),
				((this.sbaPrepaidStat == null) ? null : (this.sbaPrepaidStat
						.length() <= sbaPrepaidStatSize) ? this.sbaPrepaidStat
						: this.sbaPrepaidStat.substring(0,
								this.sbaPrepaidStatSize)),
				((this.sbaAnalysis1 == null) ? null : (this.sbaAnalysis1
						.length() <= sbaAnalysis1Size) ? this.sbaAnalysis1
						: this.sbaAnalysis1.substring(0, this.sbaAnalysis1Size)),
				((this.sbaAnalysis2 == null) ? null : (this.sbaAnalysis2
						.length() <= sbaAnalysis2Size) ? this.sbaAnalysis2
						: this.sbaAnalysis2.substring(0, this.sbaAnalysis2Size)),
				((this.sbaAnalysis3 == null) ? null : (this.sbaAnalysis3
						.length() <= sbaAnalysis3Size) ? this.sbaAnalysis3
						: this.sbaAnalysis3.substring(0, this.sbaAnalysis3Size)),
				((this.sbaAnalysis4 == null) ? null : (this.sbaAnalysis4
						.length() <= sbaAnalysis4Size) ? this.sbaAnalysis4
						: this.sbaAnalysis4.substring(0, this.sbaAnalysis4Size)),
				((this.sbaAnalysis5 == null) ? null : (this.sbaAnalysis5
						.length() <= sbaAnalysis5Size) ? this.sbaAnalysis5
						: this.sbaAnalysis5.substring(0, this.sbaAnalysis5Size)),
				((this.sbaAnalysis6 == null) ? null : (this.sbaAnalysis6
						.length() <= sbaAnalysis6Size) ? this.sbaAnalysis6
						: this.sbaAnalysis6.substring(0, this.sbaAnalysis6Size)),
				((this.sbaAnalysis7 == null) ? null : (this.sbaAnalysis7
						.length() <= sbaAnalysis7Size) ? this.sbaAnalysis7
						: this.sbaAnalysis7.substring(0, this.sbaAnalysis7Size)),
				((this.sbaAnalysis8 == null) ? null : (this.sbaAnalysis8
						.length() <= sbaAnalysis8Size) ? this.sbaAnalysis8
						: this.sbaAnalysis8.substring(0, this.sbaAnalysis8Size)),
				((this.sbaAnalysis9 == null) ? null : (this.sbaAnalysis9
						.length() <= sbaAnalysis9Size) ? this.sbaAnalysis9
						: this.sbaAnalysis9.substring(0, this.sbaAnalysis9Size)),
				((this.sbaAnalysis10 == null) ? null : (this.sbaAnalysis10
						.length() <= sbaAnalysis10Size) ? this.sbaAnalysis10
						: this.sbaAnalysis10.substring(0,
								this.sbaAnalysis10Size)),
				((this.sbaAnalysis11 == null) ? null : (this.sbaAnalysis11
						.length() <= sbaAnalysis11Size) ? this.sbaAnalysis11
						: this.sbaAnalysis11.substring(0,
								this.sbaAnalysis11Size)),
				((this.sbaAnalysis12 == null) ? null : (this.sbaAnalysis12
						.length() <= sbaAnalysis12Size) ? this.sbaAnalysis12
						: this.sbaAnalysis12.substring(0,
								this.sbaAnalysis12Size)),
				((this.sbaAnalysis13 == null) ? null : (this.sbaAnalysis13
						.length() <= sbaAnalysis13Size) ? this.sbaAnalysis13
						: this.sbaAnalysis13.substring(0,
								this.sbaAnalysis13Size)),
				((this.sbaAnalysis14 == null) ? null : (this.sbaAnalysis14
						.length() <= sbaAnalysis14Size) ? this.sbaAnalysis14
						: this.sbaAnalysis14.substring(0,
								this.sbaAnalysis14Size)),
				((this.sbaAnalysis15 == null) ? null : (this.sbaAnalysis15
						.length() <= sbaAnalysis15Size) ? this.sbaAnalysis15
						: this.sbaAnalysis15.substring(0,
								this.sbaAnalysis15Size)),
				((this.sbaAnalysis16 == null) ? null : (this.sbaAnalysis16
						.length() <= sbaAnalysis16Size) ? this.sbaAnalysis16
						: this.sbaAnalysis16.substring(0,
								this.sbaAnalysis16Size)),
				((this.sbaAnalysis17 == null) ? null : (this.sbaAnalysis17
						.length() <= sbaAnalysis17Size) ? this.sbaAnalysis17
						: this.sbaAnalysis17.substring(0,
								this.sbaAnalysis17Size)),
				((this.sbaAnalysis18 == null) ? null : (this.sbaAnalysis18
						.length() <= sbaAnalysis18Size) ? this.sbaAnalysis18
						: this.sbaAnalysis18.substring(0,
								this.sbaAnalysis18Size)),
				((this.sbaAnalysis19 == null) ? null : (this.sbaAnalysis19
						.length() <= sbaAnalysis19Size) ? this.sbaAnalysis19
						: this.sbaAnalysis19.substring(0,
								this.sbaAnalysis19Size)),
				((this.sbaAnalysis20 == null) ? null : (this.sbaAnalysis20
						.length() <= sbaAnalysis20Size) ? this.sbaAnalysis20
						: this.sbaAnalysis20.substring(0,
								this.sbaAnalysis20Size)),
				((this.sbaAnalysis21 == null) ? null : (this.sbaAnalysis21
						.length() <= sbaAnalysis21Size) ? this.sbaAnalysis21
						: this.sbaAnalysis21.substring(0,
								this.sbaAnalysis21Size)),
				((this.sbaAnalysis22 == null) ? null : (this.sbaAnalysis22
						.length() <= sbaAnalysis22Size) ? this.sbaAnalysis22
						: this.sbaAnalysis22.substring(0,
								this.sbaAnalysis22Size)),
				((this.sbaAnalysis23 == null) ? null : (this.sbaAnalysis23
						.length() <= sbaAnalysis23Size) ? this.sbaAnalysis23
						: this.sbaAnalysis23.substring(0,
								this.sbaAnalysis23Size)),
				((this.sbaAnalysis24 == null) ? null : (this.sbaAnalysis24
						.length() <= sbaAnalysis24Size) ? this.sbaAnalysis24
						: this.sbaAnalysis24.substring(0,
								this.sbaAnalysis24Size)),
				((this.sbaAnalysis25 == null) ? null : (this.sbaAnalysis25
						.length() <= sbaAnalysis25Size) ? this.sbaAnalysis25
						: this.sbaAnalysis25.substring(0,
								this.sbaAnalysis25Size)),
				((this.sbaAnalysis26 == null) ? null : (this.sbaAnalysis26
						.length() <= sbaAnalysis26Size) ? this.sbaAnalysis26
						: this.sbaAnalysis26.substring(0,
								this.sbaAnalysis26Size)),
				((this.sbaAnalysis27 == null) ? null : (this.sbaAnalysis27
						.length() <= sbaAnalysis27Size) ? this.sbaAnalysis27
						: this.sbaAnalysis27.substring(0,
								this.sbaAnalysis27Size)),
				((this.sbaAnalysis28 == null) ? null : (this.sbaAnalysis28
						.length() <= sbaAnalysis28Size) ? this.sbaAnalysis28
						: this.sbaAnalysis28.substring(0,
								this.sbaAnalysis28Size)),
				((this.sbaAnalysis29 == null) ? null : (this.sbaAnalysis29
						.length() <= sbaAnalysis29Size) ? this.sbaAnalysis29
						: this.sbaAnalysis29.substring(0,
								this.sbaAnalysis29Size)),
				((this.sbaAnalysis30 == null) ? null : (this.sbaAnalysis30
						.length() <= sbaAnalysis30Size) ? this.sbaAnalysis30
						: this.sbaAnalysis30.substring(0,
								this.sbaAnalysis30Size)),
				((this.sbaComments == null) ? null
						: (this.sbaComments.length() <= sbaCommentsSize) ? this.sbaComments
								: this.sbaComments.substring(0,
										this.sbaCommentsSize)) };
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
		this.sbdSubscriberId = ((Integer) fields[0]);
		this.sbdDiallingNo = rtrim((String) fields[1]);
		this.sbdBillAcNo = rtrim((String) fields[2]);
		this.sbdConnectDate = ((fields[3] == null) ? null : new Date(
				fields[3]));
		this.sbdDconnectDate = ((fields[4] == null) ? null : new Date(
				fields[4]));
		this.sbdTermDate = ((fields[5] == null) ? null : new Date(
				fields[5]));
		this.sbdTitle = rtrim((String) fields[6]);
		this.sbdSurname = rtrim((String) fields[7]);
		this.sbdFirstname = rtrim((String) fields[8]);
		this.sbdGender = rtrim((String) fields[9]);
		this.sbdDob = ((fields[10] == null) ? null
				: new Date(fields[10]));
		this.sbdPassword = rtrim((String) fields[11]);
		this.sbdLocationCode = rtrim((String) fields[12]);
		this.sbdBillCycle = rtrim((String) fields[13]);
		this.sbdPackageCode = rtrim((String) fields[14]);
		this.sbdBilledUpto = ((fields[15] == null) ? null : new Date(
				fields[15]));
		this.sbdTariffPlan = rtrim((String) fields[16]);
		this.sbaSubscriberId = ((Integer) fields[17]);
		this.sbaIdNumber = rtrim((String) fields[18]);
		this.sbaMatchcode = rtrim((String) fields[19]);
		this.sbaMarketing = rtrim((String) fields[20]);
		this.sbaThirdParty = rtrim((String) fields[21]);
		this.sbaCustDept = rtrim((String) fields[22]);
		this.sbaDealerId = rtrim((String) fields[23]);
		this.sbaDepartment = rtrim((String) fields[24]);
		this.sbaSalesman = rtrim((String) fields[25]);
		this.sbaRegion = rtrim((String) fields[26]);
		this.sbaInvoiceAddrid = ((Integer) fields[27]);
		this.sbaInvAccount = rtrim((String) fields[28]);
		this.sbaPrepaidStat = rtrim((String) fields[29]);
		this.sbaAnalysis1 = rtrim((String) fields[30]);
		this.sbaAnalysis2 = rtrim((String) fields[31]);
		this.sbaAnalysis3 = rtrim((String) fields[32]);
		this.sbaAnalysis4 = rtrim((String) fields[33]);
		this.sbaAnalysis5 = rtrim((String) fields[34]);
		this.sbaAnalysis6 = rtrim((String) fields[35]);
		this.sbaAnalysis7 = rtrim((String) fields[36]);
		this.sbaAnalysis8 = rtrim((String) fields[37]);
		this.sbaAnalysis9 = rtrim((String) fields[38]);
		this.sbaAnalysis10 = rtrim((String) fields[39]);
		this.sbaAnalysis11 = rtrim((String) fields[40]);
		this.sbaAnalysis12 = rtrim((String) fields[41]);
		this.sbaAnalysis13 = rtrim((String) fields[42]);
		this.sbaAnalysis14 = rtrim((String) fields[43]);
		this.sbaAnalysis15 = rtrim((String) fields[44]);
		this.sbaAnalysis16 = rtrim((String) fields[45]);
		this.sbaAnalysis17 = rtrim((String) fields[46]);
		this.sbaAnalysis18 = rtrim((String) fields[47]);
		this.sbaAnalysis19 = rtrim((String) fields[48]);
		this.sbaAnalysis20 = rtrim((String) fields[49]);
		this.sbaAnalysis21 = rtrim((String) fields[50]);
		this.sbaAnalysis22 = rtrim((String) fields[51]);
		this.sbaAnalysis23 = rtrim((String) fields[52]);
		this.sbaAnalysis24 = rtrim((String) fields[53]);
		this.sbaAnalysis25 = rtrim((String) fields[54]);
		this.sbaAnalysis26 = rtrim((String) fields[55]);
		this.sbaAnalysis27 = rtrim((String) fields[56]);
		this.sbaAnalysis28 = rtrim((String) fields[57]);
		this.sbaAnalysis29 = rtrim((String) fields[58]);
		this.sbaAnalysis30 = rtrim((String) fields[59]);
		this.sbaComments = rtrim((String) fields[60]);
	}

	public void set(final Integer sbdSubscriberId, final String sbdDiallingNo,
			final String sbdBillAcNo, final Date sbdConnectDate,
			final Date sbdDconnectDate, final Date sbdTermDate,
			final String sbdTitle, final String sbdSurname,
			final String sbdFirstname, final String sbdGender,
			final Date sbdDob, final String sbdPassword,
			final String sbdLocationCode, final String sbdBillCycle,
			final String sbdPackageCode, final Date sbdBilledUpto,
			final String sbdTariffPlan, final Integer sbaSubscriberId,
			final String sbaIdNumber, final String sbaMatchcode,
			final String sbaMarketing, final String sbaThirdParty,
			final String sbaCustDept, final String sbaDealerId,
			final String sbaDepartment, final String sbaSalesman,
			final String sbaRegion, final Integer sbaInvoiceAddrid,
			final String sbaInvAccount, final String sbaPrepaidStat,
			final String sbaAnalysis1, final String sbaAnalysis2,
			final String sbaAnalysis3, final String sbaAnalysis4,
			final String sbaAnalysis5, final String sbaAnalysis6,
			final String sbaAnalysis7, final String sbaAnalysis8,
			final String sbaAnalysis9, final String sbaAnalysis10,
			final String sbaAnalysis11, final String sbaAnalysis12,
			final String sbaAnalysis13, final String sbaAnalysis14,
			final String sbaAnalysis15, final String sbaAnalysis16,
			final String sbaAnalysis17, final String sbaAnalysis18,
			final String sbaAnalysis19, final String sbaAnalysis20,
			final String sbaAnalysis21, final String sbaAnalysis22,
			final String sbaAnalysis23, final String sbaAnalysis24,
			final String sbaAnalysis25, final String sbaAnalysis26,
			final String sbaAnalysis27, final String sbaAnalysis28,
			final String sbaAnalysis29, final String sbaAnalysis30,
			final String sbaComments) {

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
		this.sbaSubscriberId = sbaSubscriberId;
		this.sbaIdNumber = sbaIdNumber;
		this.sbaMatchcode = sbaMatchcode;
		this.sbaMarketing = sbaMarketing;
		this.sbaThirdParty = sbaThirdParty;
		this.sbaCustDept = sbaCustDept;
		this.sbaDealerId = sbaDealerId;
		this.sbaDepartment = sbaDepartment;
		this.sbaSalesman = sbaSalesman;
		this.sbaRegion = sbaRegion;
		this.sbaInvoiceAddrid = sbaInvoiceAddrid;
		this.sbaInvAccount = sbaInvAccount;
		this.sbaPrepaidStat = sbaPrepaidStat;
		this.sbaAnalysis1 = sbaAnalysis1;
		this.sbaAnalysis2 = sbaAnalysis2;
		this.sbaAnalysis3 = sbaAnalysis3;
		this.sbaAnalysis4 = sbaAnalysis4;
		this.sbaAnalysis5 = sbaAnalysis5;
		this.sbaAnalysis6 = sbaAnalysis6;
		this.sbaAnalysis7 = sbaAnalysis7;
		this.sbaAnalysis8 = sbaAnalysis8;
		this.sbaAnalysis9 = sbaAnalysis9;
		this.sbaAnalysis10 = sbaAnalysis10;
		this.sbaAnalysis11 = sbaAnalysis11;
		this.sbaAnalysis12 = sbaAnalysis12;
		this.sbaAnalysis13 = sbaAnalysis13;
		this.sbaAnalysis14 = sbaAnalysis14;
		this.sbaAnalysis15 = sbaAnalysis15;
		this.sbaAnalysis16 = sbaAnalysis16;
		this.sbaAnalysis17 = sbaAnalysis17;
		this.sbaAnalysis18 = sbaAnalysis18;
		this.sbaAnalysis19 = sbaAnalysis19;
		this.sbaAnalysis20 = sbaAnalysis20;
		this.sbaAnalysis21 = sbaAnalysis21;
		this.sbaAnalysis22 = sbaAnalysis22;
		this.sbaAnalysis23 = sbaAnalysis23;
		this.sbaAnalysis24 = sbaAnalysis24;
		this.sbaAnalysis25 = sbaAnalysis25;
		this.sbaAnalysis26 = sbaAnalysis26;
		this.sbaAnalysis27 = sbaAnalysis27;
		this.sbaAnalysis28 = sbaAnalysis28;
		this.sbaAnalysis29 = sbaAnalysis29;
		this.sbaAnalysis30 = sbaAnalysis30;
		this.sbaComments = sbaComments;
	}

	public void deConstruct() {
		sbdDMO = new SbdSubDetsDMO(sbdSubscriberId, sbdDiallingNo, sbdBillAcNo,
				sbdConnectDate, sbdDconnectDate, sbdTermDate, sbdTitle,
				sbdSurname, sbdFirstname, sbdGender, sbdDob, sbdPassword,
				sbdLocationCode, sbdBillCycle, sbdPackageCode, sbdBilledUpto,
				sbdTariffPlan);
		
		sbaDMO = new SbaSubAuxDMO(sbaSubscriberId, sbaIdNumber, sbaMatchcode,
				sbaMarketing, sbaThirdParty, sbaCustDept, sbaDealerId,
				sbaDepartment, sbaSalesman, sbaRegion, sbaInvoiceAddrid,
				sbaInvAccount, sbaPrepaidStat, sbaAnalysis1, sbaAnalysis2,
				sbaAnalysis3, sbaAnalysis4, sbaAnalysis5, sbaAnalysis6,
				sbaAnalysis7, sbaAnalysis8, sbaAnalysis9, sbaAnalysis10,
				sbaAnalysis11, sbaAnalysis12, sbaAnalysis13, sbaAnalysis14,
				sbaAnalysis15, sbaAnalysis16, sbaAnalysis17, sbaAnalysis18,
				sbaAnalysis19, sbaAnalysis20, sbaAnalysis21, sbaAnalysis22,
				sbaAnalysis23, sbaAnalysis24, sbaAnalysis25, sbaAnalysis26,
				sbaAnalysis27, sbaAnalysis28, sbaAnalysis29, sbaAnalysis30,
				sbaComments);
	}

	public SbdSubDetsDMO getSbdDMO() {
		return sbdDMO;
	}

	public void setSbdDMO(SbdSubDetsDMO sbdDMO) {
		this.sbdDMO = sbdDMO;
	}

	public SbaSubAuxDMO getSbaDMO() {
		return sbaDMO;
	}

	public void setSbaDMO(SbaSubAuxDMO sbaDMO) {
		this.sbaDMO = sbaDMO;
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

	public Integer getSbaSubscriberId() {
		return sbaSubscriberId;
	}

	public void setSbaSubscriberId(Integer sbaSubscriberId) {
		this.sbaSubscriberId = sbaSubscriberId;
	}

	public String getSbaIdNumber() {
		return sbaIdNumber;
	}

	public void setSbaIdNumber(String sbaIdNumber) {
		this.sbaIdNumber = sbaIdNumber;
	}

	public String getSbaMatchcode() {
		return sbaMatchcode;
	}

	public void setSbaMatchcode(String sbaMatchcode) {
		this.sbaMatchcode = sbaMatchcode;
	}

	public String getSbaMarketing() {
		return sbaMarketing;
	}

	public void setSbaMarketing(String sbaMarketing) {
		this.sbaMarketing = sbaMarketing;
	}

	public String getSbaThirdParty() {
		return sbaThirdParty;
	}

	public void setSbaThirdParty(String sbaThirdParty) {
		this.sbaThirdParty = sbaThirdParty;
	}

	public String getSbaCustDept() {
		return sbaCustDept;
	}

	public void setSbaCustDept(String sbaCustDept) {
		this.sbaCustDept = sbaCustDept;
	}

	public String getSbaDealerId() {
		return sbaDealerId;
	}

	public void setSbaDealerId(String sbaDealerId) {
		this.sbaDealerId = sbaDealerId;
	}

	public String getSbaDepartment() {
		return sbaDepartment;
	}

	public void setSbaDepartment(String sbaDepartment) {
		this.sbaDepartment = sbaDepartment;
	}

	public String getSbaSalesman() {
		return sbaSalesman;
	}

	public void setSbaSalesman(String sbaSalesman) {
		this.sbaSalesman = sbaSalesman;
	}

	public String getSbaRegion() {
		return sbaRegion;
	}

	public void setSbaRegion(String sbaRegion) {
		this.sbaRegion = sbaRegion;
	}

	public Integer getSbaInvoiceAddrid() {
		return sbaInvoiceAddrid;
	}

	public void setSbaInvoiceAddrid(Integer sbaInvoiceAddrid) {
		this.sbaInvoiceAddrid = sbaInvoiceAddrid;
	}

	public String getSbaInvAccount() {
		return sbaInvAccount;
	}

	public void setSbaInvAccount(String sbaInvAccount) {
		this.sbaInvAccount = sbaInvAccount;
	}

	public String getSbaPrepaidStat() {
		return sbaPrepaidStat;
	}

	public void setSbaPrepaidStat(String sbaPrepaidStat) {
		this.sbaPrepaidStat = sbaPrepaidStat;
	}

	public String getSbaAnalysis1() {
		return sbaAnalysis1;
	}

	public void setSbaAnalysis1(String sbaAnalysis1) {
		this.sbaAnalysis1 = sbaAnalysis1;
	}

	public String getSbaAnalysis2() {
		return sbaAnalysis2;
	}

	public void setSbaAnalysis2(String sbaAnalysis2) {
		this.sbaAnalysis2 = sbaAnalysis2;
	}

	public String getSbaAnalysis3() {
		return sbaAnalysis3;
	}

	public void setSbaAnalysis3(String sbaAnalysis3) {
		this.sbaAnalysis3 = sbaAnalysis3;
	}

	public String getSbaAnalysis4() {
		return sbaAnalysis4;
	}

	public void setSbaAnalysis4(String sbaAnalysis4) {
		this.sbaAnalysis4 = sbaAnalysis4;
	}

	public String getSbaAnalysis5() {
		return sbaAnalysis5;
	}

	public void setSbaAnalysis5(String sbaAnalysis5) {
		this.sbaAnalysis5 = sbaAnalysis5;
	}

	public String getSbaAnalysis6() {
		return sbaAnalysis6;
	}

	public void setSbaAnalysis6(String sbaAnalysis6) {
		this.sbaAnalysis6 = sbaAnalysis6;
	}

	public String getSbaAnalysis7() {
		return sbaAnalysis7;
	}

	public void setSbaAnalysis7(String sbaAnalysis7) {
		this.sbaAnalysis7 = sbaAnalysis7;
	}

	public String getSbaAnalysis8() {
		return sbaAnalysis8;
	}

	public void setSbaAnalysis8(String sbaAnalysis8) {
		this.sbaAnalysis8 = sbaAnalysis8;
	}

	public String getSbaAnalysis9() {
		return sbaAnalysis9;
	}

	public void setSbaAnalysis9(String sbaAnalysis9) {
		this.sbaAnalysis9 = sbaAnalysis9;
	}

	public String getSbaAnalysis10() {
		return sbaAnalysis10;
	}

	public void setSbaAnalysis10(String sbaAnalysis10) {
		this.sbaAnalysis10 = sbaAnalysis10;
	}

	public String getSbaAnalysis11() {
		return sbaAnalysis11;
	}

	public void setSbaAnalysis11(String sbaAnalysis11) {
		this.sbaAnalysis11 = sbaAnalysis11;
	}

	public String getSbaAnalysis12() {
		return sbaAnalysis12;
	}

	public void setSbaAnalysis12(String sbaAnalysis12) {
		this.sbaAnalysis12 = sbaAnalysis12;
	}

	public String getSbaAnalysis13() {
		return sbaAnalysis13;
	}

	public void setSbaAnalysis13(String sbaAnalysis13) {
		this.sbaAnalysis13 = sbaAnalysis13;
	}

	public String getSbaAnalysis14() {
		return sbaAnalysis14;
	}

	public void setSbaAnalysis14(String sbaAnalysis14) {
		this.sbaAnalysis14 = sbaAnalysis14;
	}

	public String getSbaAnalysis15() {
		return sbaAnalysis15;
	}

	public void setSbaAnalysis15(String sbaAnalysis15) {
		this.sbaAnalysis15 = sbaAnalysis15;
	}

	public String getSbaAnalysis16() {
		return sbaAnalysis16;
	}

	public void setSbaAnalysis16(String sbaAnalysis16) {
		this.sbaAnalysis16 = sbaAnalysis16;
	}

	public String getSbaAnalysis17() {
		return sbaAnalysis17;
	}

	public void setSbaAnalysis17(String sbaAnalysis17) {
		this.sbaAnalysis17 = sbaAnalysis17;
	}

	public String getSbaAnalysis18() {
		return sbaAnalysis18;
	}

	public void setSbaAnalysis18(String sbaAnalysis18) {
		this.sbaAnalysis18 = sbaAnalysis18;
	}

	public String getSbaAnalysis19() {
		return sbaAnalysis19;
	}

	public void setSbaAnalysis19(String sbaAnalysis19) {
		this.sbaAnalysis19 = sbaAnalysis19;
	}

	public String getSbaAnalysis20() {
		return sbaAnalysis20;
	}

	public void setSbaAnalysis20(String sbaAnalysis20) {
		this.sbaAnalysis20 = sbaAnalysis20;
	}

	public String getSbaAnalysis21() {
		return sbaAnalysis21;
	}

	public void setSbaAnalysis21(String sbaAnalysis21) {
		this.sbaAnalysis21 = sbaAnalysis21;
	}

	public String getSbaAnalysis22() {
		return sbaAnalysis22;
	}

	public void setSbaAnalysis22(String sbaAnalysis22) {
		this.sbaAnalysis22 = sbaAnalysis22;
	}

	public String getSbaAnalysis23() {
		return sbaAnalysis23;
	}

	public void setSbaAnalysis23(String sbaAnalysis23) {
		this.sbaAnalysis23 = sbaAnalysis23;
	}

	public String getSbaAnalysis24() {
		return sbaAnalysis24;
	}

	public void setSbaAnalysis24(String sbaAnalysis24) {
		this.sbaAnalysis24 = sbaAnalysis24;
	}

	public String getSbaAnalysis25() {
		return sbaAnalysis25;
	}

	public void setSbaAnalysis25(String sbaAnalysis25) {
		this.sbaAnalysis25 = sbaAnalysis25;
	}

	public String getSbaAnalysis26() {
		return sbaAnalysis26;
	}

	public void setSbaAnalysis26(String sbaAnalysis26) {
		this.sbaAnalysis26 = sbaAnalysis26;
	}

	public String getSbaAnalysis27() {
		return sbaAnalysis27;
	}

	public void setSbaAnalysis27(String sbaAnalysis27) {
		this.sbaAnalysis27 = sbaAnalysis27;
	}

	public String getSbaAnalysis28() {
		return sbaAnalysis28;
	}

	public void setSbaAnalysis28(String sbaAnalysis28) {
		this.sbaAnalysis28 = sbaAnalysis28;
	}

	public String getSbaAnalysis29() {
		return sbaAnalysis29;
	}

	public void setSbaAnalysis29(String sbaAnalysis29) {
		this.sbaAnalysis29 = sbaAnalysis29;
	}

	public String getSbaAnalysis30() {
		return sbaAnalysis30;
	}

	public void setSbaAnalysis30(String sbaAnalysis30) {
		this.sbaAnalysis30 = sbaAnalysis30;
	}

	public String getSbaComments() {
		return sbaComments;
	}

	public void setSbaComments(String sbaComments) {
		this.sbaComments = sbaComments;
	}

}