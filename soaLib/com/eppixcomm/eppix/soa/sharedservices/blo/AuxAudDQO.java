package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class AuxAudDQO extends DBO implements Serializable {

	private String auxTitle;
	private String auxFirstname;
	private Integer auxInvoiceAddrid;
	private String bankName;
	private String bankAddr1;
	private String bankAddr2;
	private String bankAcName;
	private String ref;
	private String bankScode;
	private String bankAcNo;
	private String bankAcType;
	private String bankPayType;
	private Integer auxPrefDebitDay;
	private String billAcNo;
	private String protectCode;
	private Integer handsetCt;
	private Date bankDate;
	private Date confDate;
	private String auxComment;
	private Date dateOfBirth;
	private Date refPayDate;
	private Date acClosDate;
	private Date noReasDate;
	private Date remLetDate;
	private Date acTranDate;
	private Date noAcDate;
	private String srFlag;
	private String processed;
	private String packageCode;
	private String auxAccountType;
	private String auxBillCycle;
	private String creditCardNo;
	private String creditCardName;
	private Date expiryDate;
	private String auxCardCvvNo;
	private Integer creditScore;
	private Integer servProvId;
	private String dealerId;
	private String salesman;
	private String idNumber;
	private String accStatus;
	private String compRegNo;
	private String stationaryType;
	private Integer maxNoSubs;
	private String auxCurrency;
	private String auxCountryCode;
	private String auxGender;
	private String auxSubGrpAccNo;
	private String auxPrepaidStat;
	private String auxCreditClass;
	private String auxAutoLimitInd;
	private Short auxLmtUpVal;
	private Short auxLmtDnVal;
	private String auxAnalysis1;
	private String auxAnalysis2;
	private String auxAnalysis3;
	private String auxAnalysis4;
	private String auxAnalysis5;
	private String auxAnalysis6;
	private String auxAnalysis7;
	private String auxAnalysis8;
	private String auxAnalysis9;
	private String auxAnalysis10;
	private String auxAnalysis11;
	private String auxAnalysis12;
	private String auxAnalysis13;
	private String auxAnalysis14;
	private String auxAnalysis15;
	private String auxAnalysis16;
	private String auxAnalysis17;
	private String auxAnalysis18;
	private String auxAnalysis19;
	private String auxAnalysis20;
	private String auxAnalysis21;
	private String auxAnalysis22;
	private String auxAnalysis23;
	private String auxAnalysis24;
	private String auxAnalysis25;
	private String auxAnalysis26;
	private String auxAnalysis27;
	private String auxAnalysis28;
	private String auxAnalysis29;
	private String auxAnalysis30;
	private Integer audAddrid;
	private String audAccountNo;
	private Integer audSubscriberId;
	private String audAddressType;
	private Date audInDate;
	private Date audInvEffDate;
	private String audClassification;
	private String audUniqueId;
	private String audName;
	private String audAddress1;
	private String audAddress2;
	private String audAddress3;
	private String audAddress4;
	private String audAddress5;
	private String audAddress6;
	private String audPostcode;
	private String audTelephoneNo;
	private String audTelephoneNo2;
	private String audFaxNo;
	private String audContact;
	private String audEMail;
	private String audNotes;
	private String audGeneral1;
	private String audGeneral2;
	private String audGeneral3;

	public static final int auxTitleFilter = 0;
	private static final int auxTitleSize = 10;

	public static final int auxFirstnameFilter = 1;
	private static final int auxFirstnameSize = 50;

	public static final int auxInvoiceAddridFilter = 2;

	public static final int bankNameFilter = 3;
	private static final int bankNameSize = 50;

	public static final int bankAddr1Filter = 4;
	private static final int bankAddr1Size = 50;

	public static final int bankAddr2Filter = 5;
	private static final int bankAddr2Size = 50;

	public static final int bankAcNameFilter = 6;
	private static final int bankAcNameSize = 32;

	public static final int refFilter = 7;
	private static final int refSize = 8;

	public static final int bankScodeFilter = 8;
	private static final int bankScodeSize = 10;

	public static final int bankAcNoFilter = 9;
	private static final int bankAcNoSize = 30;

	public static final int bankAcTypeFilter = 10;
	private static final int bankAcTypeSize = 15;

	public static final int bankPayTypeFilter = 11;
	private static final int bankPayTypeSize = 5;

	public static final int auxPrefDebitDayFilter = 12;

	public static final int billAcNoFilter = 13;
	private static final int billAcNoSize = 8;

	public static final int protectCodeFilter = 14;
	private static final int protectCodeSize = 1;

	public static final int handsetCtFilter = 15;

	public static final int bankDateFilter = 16;

	public static final int confDateFilter = 17;

	public static final int auxCommentFilter = 18;
	private static final int auxCommentSize = 30;

	public static final int dateOfBirthFilter = 19;

	public static final int refPayDateFilter = 20;

	public static final int acClosDateFilter = 21;

	public static final int noReasDateFilter = 22;

	public static final int remLetDateFilter = 23;

	public static final int acTranDateFilter = 24;

	public static final int noAcDateFilter = 25;

	public static final int srFlagFilter = 26;
	private static final int srFlagSize = 1;

	public static final int processedFilter = 27;
	private static final int processedSize = 1;

	public static final int packageCodeFilter = 28;
	private static final int packageCodeSize = 5;

	public static final int auxAccountTypeFilter = 29;
	private static final int auxAccountTypeSize = 5;

	public static final int auxBillCycleFilter = 30;
	private static final int auxBillCycleSize = 5;

	public static final int creditCardNoFilter = 31;
	private static final int creditCardNoSize = 20;

	public static final int creditCardNameFilter = 32;
	private static final int creditCardNameSize = 30;

	public static final int expiryDateFilter = 33;

	public static final int auxCardCvvNoFilter = 34;
	private static final int auxCardCvvNoSize = 3;

	public static final int creditScoreFilter = 35;

	public static final int servProvIdFilter = 36;

	public static final int dealerIdFilter = 37;
	private static final int dealerIdSize = 8;

	public static final int salesmanFilter = 38;
	private static final int salesmanSize = 10;

	public static final int idNumberFilter = 39;
	private static final int idNumberSize = 20;

	public static final int accStatusFilter = 40;
	private static final int accStatusSize = 15;

	public static final int compRegNoFilter = 41;
	private static final int compRegNoSize = 20;

	public static final int stationaryTypeFilter = 42;
	private static final int stationaryTypeSize = 15;

	public static final int maxNoSubsFilter = 43;

	public static final int auxCurrencyFilter = 44;
	private static final int auxCurrencySize = 3;

	public static final int auxCountryCodeFilter = 45;
	private static final int auxCountryCodeSize = 3;

	public static final int auxGenderFilter = 46;
	private static final int auxGenderSize = 1;

	public static final int auxSubGrpAccNoFilter = 47;
	private static final int auxSubGrpAccNoSize = 8;

	public static final int auxPrepaidStatFilter = 48;
	private static final int auxPrepaidStatSize = 2;

	public static final int auxCreditClassFilter = 49;
	private static final int auxCreditClassSize = 5;

	public static final int auxAutoLimitIndFilter = 50;
	private static final int auxAutoLimitIndSize = 1;

	public static final int auxLmtUpValFilter = 51;

	public static final int auxLmtDnValFilter = 52;

	public static final int auxAnalysis1Filter = 53;
	private static final int auxAnalysis1Size = 30;

	public static final int auxAnalysis2Filter = 54;
	private static final int auxAnalysis2Size = 30;

	public static final int auxAnalysis3Filter = 55;
	private static final int auxAnalysis3Size = 30;

	public static final int auxAnalysis4Filter = 56;
	private static final int auxAnalysis4Size = 30;

	public static final int auxAnalysis5Filter = 57;
	private static final int auxAnalysis5Size = 30;

	public static final int auxAnalysis6Filter = 58;
	private static final int auxAnalysis6Size = 30;

	public static final int auxAnalysis7Filter = 59;
	private static final int auxAnalysis7Size = 30;

	public static final int auxAnalysis8Filter = 60;
	private static final int auxAnalysis8Size = 30;

	public static final int auxAnalysis9Filter = 61;
	private static final int auxAnalysis9Size = 30;

	public static final int auxAnalysis10Filter = 62;
	private static final int auxAnalysis10Size = 30;

	public static final int auxAnalysis11Filter = 63;
	private static final int auxAnalysis11Size = 30;

	public static final int auxAnalysis12Filter = 64;
	private static final int auxAnalysis12Size = 30;

	public static final int auxAnalysis13Filter = 65;
	private static final int auxAnalysis13Size = 30;

	public static final int auxAnalysis14Filter = 66;
	private static final int auxAnalysis14Size = 30;

	public static final int auxAnalysis15Filter = 67;
	private static final int auxAnalysis15Size = 30;

	public static final int auxAnalysis16Filter = 68;
	private static final int auxAnalysis16Size = 30;

	public static final int auxAnalysis17Filter = 69;
	private static final int auxAnalysis17Size = 30;

	public static final int auxAnalysis18Filter = 70;
	private static final int auxAnalysis18Size = 30;

	public static final int auxAnalysis19Filter = 71;
	private static final int auxAnalysis19Size = 30;

	public static final int auxAnalysis20Filter = 72;
	private static final int auxAnalysis20Size = 30;

	public static final int auxAnalysis21Filter = 73;
	private static final int auxAnalysis21Size = 30;

	public static final int auxAnalysis22Filter = 74;
	private static final int auxAnalysis22Size = 30;

	public static final int auxAnalysis23Filter = 75;
	private static final int auxAnalysis23Size = 30;

	public static final int auxAnalysis24Filter = 76;
	private static final int auxAnalysis24Size = 30;

	public static final int auxAnalysis25Filter = 77;
	private static final int auxAnalysis25Size = 30;

	public static final int auxAnalysis26Filter = 78;
	private static final int auxAnalysis26Size = 30;

	public static final int auxAnalysis27Filter = 79;
	private static final int auxAnalysis27Size = 30;

	public static final int auxAnalysis28Filter = 80;
	private static final int auxAnalysis28Size = 30;

	public static final int auxAnalysis29Filter = 81;
	private static final int auxAnalysis29Size = 30;

	public static final int auxAnalysis30Filter = 82;
	private static final int auxAnalysis30Size = 30;

	public static final int audAddridFilter = 83;

	public static final int audAccountNoFilter = 84;
	private static final int audAccountNoSize = 8;

	public static final int audSubscriberIdFilter = 85;

	public static final int audAddressTypeFilter = 86;
	private static final int audAddressTypeSize = 4;

	public static final int audInDateFilter = 87;

	public static final int audInvEffDateFilter = 88;

	public static final int audClassificationFilter = 89;
	private static final int audClassificationSize = 4;

	public static final int audUniqueIdFilter = 90;
	private static final int audUniqueIdSize = 20;

	public static final int audNameFilter = 91;
	private static final int audNameSize = 110;

	public static final int audAddress1Filter = 92;
	private static final int audAddress1Size = 110;

	public static final int audAddress2Filter = 93;
	private static final int audAddress2Size = 40;

	public static final int audAddress3Filter = 94;
	private static final int audAddress3Size = 40;

	public static final int audAddress4Filter = 95;
	private static final int audAddress4Size = 40;

	public static final int audAddress5Filter = 96;
	private static final int audAddress5Size = 40;

	public static final int audAddress6Filter = 97;
	private static final int audAddress6Size = 40;

	public static final int audPostcodeFilter = 98;
	private static final int audPostcodeSize = 15;

	public static final int audTelephoneNoFilter = 99;
	private static final int audTelephoneNoSize = 20;

	public static final int audTelephoneNo2Filter = 100;
	private static final int audTelephoneNo2Size = 20;

	public static final int audFaxNoFilter = 101;
	private static final int audFaxNoSize = 20;

	public static final int audContactFilter = 102;
	private static final int audContactSize = 110;

	public static final int audEMailFilter = 103;
	private static final int audEMailSize = 50;

	public static final int audNotesFilter = 104;
	private static final int audNotesSize = 100;

	public static final int audGeneral1Filter = 105;
	private static final int audGeneral1Size = 30;

	public static final int audGeneral2Filter = 106;
	private static final int audGeneral2Size = 30;

	public static final int audGeneral3Filter = 107;
	private static final int audGeneral3Size = 30;

	public AuxAudDQO() {
	};

	public AuxAudDQO(final String auxTitle, final String auxFirstname, final Integer auxInvoiceAddrid,
			final String bankName, final String bankAddr1, final String bankAddr2, final String bankAcName,
			final String ref, final String bankScode, final String bankAcNo, final String bankAcType,
			final String bankPayType, final Integer auxPrefDebitDay, final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate, final String auxComment,
			final Date dateOfBirth, final Date refPayDate, final Date acClosDate, final Date noReasDate,
			final Date remLetDate, final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode, final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName, final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId, final String dealerId, final String salesman,
			final String idNumber, final String accStatus, final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency, final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat, final String auxCreditClass,
			final String auxAutoLimitInd, final Short auxLmtUpVal, final Short auxLmtDnVal, final String auxAnalysis1,
			final String auxAnalysis2, final String auxAnalysis3, final String auxAnalysis4, final String auxAnalysis5,
			final String auxAnalysis6, final String auxAnalysis7, final String auxAnalysis8, final String auxAnalysis9,
			final String auxAnalysis10, final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14, final String auxAnalysis15,
			final String auxAnalysis16, final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20, final String auxAnalysis21,
			final String auxAnalysis22, final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26, final String auxAnalysis27,
			final String auxAnalysis28, final String auxAnalysis29, final String auxAnalysis30, final Integer audAddrid,
			final String audAccountNo, final Integer audSubscriberId, final String audAddressType, final Date audInDate,
			final Date audInvEffDate, final String audClassification, final String audUniqueId, final String audName,
			final String audAddress1, final String audAddress2, final String audAddress3, final String audAddress4,
			final String audAddress5, final String audAddress6, final String audPostcode, final String audTelephoneNo,
			final String audTelephoneNo2, final String audFaxNo, final String audContact, final String audEMail,
			final String audNotes, final String audGeneral1, final String audGeneral2, final String audGeneral3) {

		this.auxTitle = auxTitle;
		this.auxFirstname = auxFirstname;
		this.auxInvoiceAddrid = auxInvoiceAddrid;
		this.bankName = bankName;
		this.bankAddr1 = bankAddr1;
		this.bankAddr2 = bankAddr2;
		this.bankAcName = bankAcName;
		this.ref = ref;
		this.bankScode = bankScode;
		this.bankAcNo = bankAcNo;
		this.bankAcType = bankAcType;
		this.bankPayType = bankPayType;
		this.auxPrefDebitDay = auxPrefDebitDay;
		this.billAcNo = billAcNo;
		this.protectCode = protectCode;
		this.handsetCt = handsetCt;
		this.bankDate = bankDate;
		this.confDate = confDate;
		this.auxComment = auxComment;
		this.dateOfBirth = dateOfBirth;
		this.refPayDate = refPayDate;
		this.acClosDate = acClosDate;
		this.noReasDate = noReasDate;
		this.remLetDate = remLetDate;
		this.acTranDate = acTranDate;
		this.noAcDate = noAcDate;
		this.srFlag = srFlag;
		this.processed = processed;
		this.packageCode = packageCode;
		this.auxAccountType = auxAccountType;
		this.auxBillCycle = auxBillCycle;
		this.creditCardNo = creditCardNo;
		this.creditCardName = creditCardName;
		this.expiryDate = expiryDate;
		this.auxCardCvvNo = auxCardCvvNo;
		this.creditScore = creditScore;
		this.servProvId = servProvId;
		this.dealerId = dealerId;
		this.salesman = salesman;
		this.idNumber = idNumber;
		this.accStatus = accStatus;
		this.compRegNo = compRegNo;
		this.stationaryType = stationaryType;
		this.maxNoSubs = maxNoSubs;
		this.auxCurrency = auxCurrency;
		this.auxCountryCode = auxCountryCode;
		this.auxGender = auxGender;
		this.auxSubGrpAccNo = auxSubGrpAccNo;
		this.auxPrepaidStat = auxPrepaidStat;
		this.auxCreditClass = auxCreditClass;
		this.auxAutoLimitInd = auxAutoLimitInd;
		this.auxLmtUpVal = auxLmtUpVal;
		this.auxLmtDnVal = auxLmtDnVal;
		this.auxAnalysis1 = auxAnalysis1;
		this.auxAnalysis2 = auxAnalysis2;
		this.auxAnalysis3 = auxAnalysis3;
		this.auxAnalysis4 = auxAnalysis4;
		this.auxAnalysis5 = auxAnalysis5;
		this.auxAnalysis6 = auxAnalysis6;
		this.auxAnalysis7 = auxAnalysis7;
		this.auxAnalysis8 = auxAnalysis8;
		this.auxAnalysis9 = auxAnalysis9;
		this.auxAnalysis10 = auxAnalysis10;
		this.auxAnalysis11 = auxAnalysis11;
		this.auxAnalysis12 = auxAnalysis12;
		this.auxAnalysis13 = auxAnalysis13;
		this.auxAnalysis14 = auxAnalysis14;
		this.auxAnalysis15 = auxAnalysis15;
		this.auxAnalysis16 = auxAnalysis16;
		this.auxAnalysis17 = auxAnalysis17;
		this.auxAnalysis18 = auxAnalysis18;
		this.auxAnalysis19 = auxAnalysis19;
		this.auxAnalysis20 = auxAnalysis20;
		this.auxAnalysis21 = auxAnalysis21;
		this.auxAnalysis22 = auxAnalysis22;
		this.auxAnalysis23 = auxAnalysis23;
		this.auxAnalysis24 = auxAnalysis24;
		this.auxAnalysis25 = auxAnalysis25;
		this.auxAnalysis26 = auxAnalysis26;
		this.auxAnalysis27 = auxAnalysis27;
		this.auxAnalysis28 = auxAnalysis28;
		this.auxAnalysis29 = auxAnalysis29;
		this.auxAnalysis30 = auxAnalysis30;
		this.audAddrid = audAddrid;
		this.audAccountNo = audAccountNo;
		this.audSubscriberId = audSubscriberId;
		this.audAddressType = audAddressType;
		this.audInDate = audInDate;
		this.audInvEffDate = audInvEffDate;
		this.audClassification = audClassification;
		this.audUniqueId = audUniqueId;
		this.audName = audName;
		this.audAddress1 = audAddress1;
		this.audAddress2 = audAddress2;
		this.audAddress3 = audAddress3;
		this.audAddress4 = audAddress4;
		this.audAddress5 = audAddress5;
		this.audAddress6 = audAddress6;
		this.audPostcode = audPostcode;
		this.audTelephoneNo = audTelephoneNo;
		this.audTelephoneNo2 = audTelephoneNo2;
		this.audFaxNo = audFaxNo;
		this.audContact = audContact;
		this.audEMail = audEMail;
		this.audNotes = audNotes;
		this.audGeneral1 = audGeneral1;
		this.audGeneral2 = audGeneral2;
		this.audGeneral3 = audGeneral3;
	};

	private static final int[] fieldSizes = new int[] { auxTitleSize, auxFirstnameSize, 0, bankNameSize, bankAddr1Size,
			bankAddr2Size, bankAcNameSize, refSize, bankScodeSize, bankAcNoSize, bankAcTypeSize, bankPayTypeSize, 0,
			billAcNoSize, protectCodeSize, 0, 0, 0, auxCommentSize, 0, 0, 0, 0, 0, 0, 0, srFlagSize, processedSize,
			packageCodeSize, auxAccountTypeSize, auxBillCycleSize, creditCardNoSize, creditCardNameSize, 0,
			auxCardCvvNoSize, 0, 0, dealerIdSize, salesmanSize, idNumberSize, accStatusSize, compRegNoSize,
			stationaryTypeSize, 0, auxCurrencySize, auxCountryCodeSize, auxGenderSize, auxSubGrpAccNoSize,
			auxPrepaidStatSize, auxCreditClassSize, auxAutoLimitIndSize, 0, 0, auxAnalysis1Size, auxAnalysis2Size,
			auxAnalysis3Size, auxAnalysis4Size, auxAnalysis5Size, auxAnalysis6Size, auxAnalysis7Size, auxAnalysis8Size,
			auxAnalysis9Size, auxAnalysis10Size, auxAnalysis11Size, auxAnalysis12Size, auxAnalysis13Size,
			auxAnalysis14Size, auxAnalysis15Size, auxAnalysis16Size, auxAnalysis17Size, auxAnalysis18Size,
			auxAnalysis19Size, auxAnalysis20Size, auxAnalysis21Size, auxAnalysis22Size, auxAnalysis23Size,
			auxAnalysis24Size, auxAnalysis25Size, auxAnalysis26Size, auxAnalysis27Size, auxAnalysis28Size,
			auxAnalysis29Size, auxAnalysis30Size, 0, audAccountNoSize, 0, audAddressTypeSize, 0, 0,
			audClassificationSize, audUniqueIdSize, audNameSize, audAddress1Size, audAddress2Size, audAddress3Size,
			audAddress4Size, audAddress5Size, audAddress6Size, audPostcodeSize, audTelephoneNoSize, audTelephoneNo2Size,
			audFaxNoSize, audContactSize, audEMailSize, audNotesSize, audGeneral1Size, audGeneral2Size,
			audGeneral3Size };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.auxTitle == null) ? null
						: (this.auxTitle.length() <= auxTitleSize) ? this.auxTitle
								: this.auxTitle.substring(0, this.auxTitleSize)),
				((this.auxFirstname == null) ? null
						: (this.auxFirstname.length() <= auxFirstnameSize) ? this.auxFirstname
								: this.auxFirstname.substring(0, this.auxFirstnameSize)),
				this.auxInvoiceAddrid,
				((this.bankName == null) ? null
						: (this.bankName.length() <= bankNameSize) ? this.bankName
								: this.bankName.substring(0, this.bankNameSize)),
				((this.bankAddr1 == null) ? null
						: (this.bankAddr1.length() <= bankAddr1Size) ? this.bankAddr1
								: this.bankAddr1.substring(0, this.bankAddr1Size)),
				((this.bankAddr2 == null) ? null
						: (this.bankAddr2.length() <= bankAddr2Size) ? this.bankAddr2
								: this.bankAddr2.substring(0, this.bankAddr2Size)),
				((this.bankAcName == null) ? null
						: (this.bankAcName.length() <= bankAcNameSize) ? this.bankAcName
								: this.bankAcName.substring(0, this.bankAcNameSize)),
				((this.ref == null) ? null
						: (this.ref.length() <= refSize) ? this.ref : this.ref.substring(0, this.refSize)),
				((this.bankScode == null) ? null
						: (this.bankScode.length() <= bankScodeSize) ? this.bankScode
								: this.bankScode.substring(0, this.bankScodeSize)),
				((this.bankAcNo == null) ? null
						: (this.bankAcNo.length() <= bankAcNoSize) ? this.bankAcNo
								: this.bankAcNo.substring(0, this.bankAcNoSize)),
				((this.bankAcType == null) ? null
						: (this.bankAcType.length() <= bankAcTypeSize) ? this.bankAcType
								: this.bankAcType.substring(0, this.bankAcTypeSize)),
				((this.bankPayType == null) ? null
						: (this.bankPayType.length() <= bankPayTypeSize) ? this.bankPayType
								: this.bankPayType.substring(0, this.bankPayTypeSize)),
				this.auxPrefDebitDay,
				((this.billAcNo == null) ? null
						: (this.billAcNo.length() <= billAcNoSize) ? this.billAcNo
								: this.billAcNo.substring(0, this.billAcNoSize)),
				((this.protectCode == null) ? null
						: (this.protectCode.length() <= protectCodeSize) ? this.protectCode
								: this.protectCode.substring(0, this.protectCodeSize)),
				this.handsetCt, this.bankDate, this.confDate,
				((this.auxComment == null) ? null
						: (this.auxComment.length() <= auxCommentSize) ? this.auxComment
								: this.auxComment.substring(0, this.auxCommentSize)),
				this.dateOfBirth, this.refPayDate, this.acClosDate, this.noReasDate, this.remLetDate, this.acTranDate,
				this.noAcDate,
				((this.srFlag == null) ? null
						: (this.srFlag.length() <= srFlagSize) ? this.srFlag
								: this.srFlag.substring(0, this.srFlagSize)),
				((this.processed == null) ? null
						: (this.processed.length() <= processedSize) ? this.processed
								: this.processed.substring(0, this.processedSize)),
				((this.packageCode == null) ? null
						: (this.packageCode.length() <= packageCodeSize) ? this.packageCode
								: this.packageCode.substring(0, this.packageCodeSize)),
				((this.auxAccountType == null) ? null
						: (this.auxAccountType.length() <= auxAccountTypeSize) ? this.auxAccountType
								: this.auxAccountType.substring(0, this.auxAccountTypeSize)),
				((this.auxBillCycle == null) ? null
						: (this.auxBillCycle.length() <= auxBillCycleSize) ? this.auxBillCycle
								: this.auxBillCycle.substring(0, this.auxBillCycleSize)),
				((this.creditCardNo == null) ? null
						: (this.creditCardNo.length() <= creditCardNoSize) ? this.creditCardNo
								: this.creditCardNo.substring(0, this.creditCardNoSize)),
				((this.creditCardName == null) ? null
						: (this.creditCardName.length() <= creditCardNameSize) ? this.creditCardName
								: this.creditCardName.substring(0, this.creditCardNameSize)),
				this.expiryDate,
				((this.auxCardCvvNo == null) ? null
						: (this.auxCardCvvNo.length() <= auxCardCvvNoSize) ? this.auxCardCvvNo
								: this.auxCardCvvNo.substring(0, this.auxCardCvvNoSize)),
				this.creditScore, this.servProvId,
				((this.dealerId == null) ? null
						: (this.dealerId.length() <= dealerIdSize) ? this.dealerId
								: this.dealerId.substring(0, this.dealerIdSize)),
				((this.salesman == null) ? null
						: (this.salesman.length() <= salesmanSize) ? this.salesman
								: this.salesman.substring(0, this.salesmanSize)),
				((this.idNumber == null) ? null
						: (this.idNumber.length() <= idNumberSize) ? this.idNumber
								: this.idNumber.substring(0, this.idNumberSize)),
				((this.accStatus == null) ? null
						: (this.accStatus.length() <= accStatusSize) ? this.accStatus
								: this.accStatus.substring(0, this.accStatusSize)),
				((this.compRegNo == null) ? null
						: (this.compRegNo.length() <= compRegNoSize) ? this.compRegNo
								: this.compRegNo.substring(0, this.compRegNoSize)),
				((this.stationaryType == null) ? null
						: (this.stationaryType.length() <= stationaryTypeSize) ? this.stationaryType
								: this.stationaryType.substring(0, this.stationaryTypeSize)),
				this.maxNoSubs,
				((this.auxCurrency == null) ? null
						: (this.auxCurrency.length() <= auxCurrencySize) ? this.auxCurrency
								: this.auxCurrency.substring(0, this.auxCurrencySize)),
				((this.auxCountryCode == null) ? null
						: (this.auxCountryCode.length() <= auxCountryCodeSize) ? this.auxCountryCode
								: this.auxCountryCode.substring(0, this.auxCountryCodeSize)),
				((this.auxGender == null) ? null
						: (this.auxGender.length() <= auxGenderSize) ? this.auxGender
								: this.auxGender.substring(0, this.auxGenderSize)),
				((this.auxSubGrpAccNo == null) ? null
						: (this.auxSubGrpAccNo.length() <= auxSubGrpAccNoSize) ? this.auxSubGrpAccNo
								: this.auxSubGrpAccNo.substring(0, this.auxSubGrpAccNoSize)),
				((this.auxPrepaidStat == null) ? null
						: (this.auxPrepaidStat.length() <= auxPrepaidStatSize) ? this.auxPrepaidStat
								: this.auxPrepaidStat.substring(0, this.auxPrepaidStatSize)),
				((this.auxCreditClass == null) ? null
						: (this.auxCreditClass.length() <= auxCreditClassSize) ? this.auxCreditClass
								: this.auxCreditClass.substring(0, this.auxCreditClassSize)),
				((this.auxAutoLimitInd == null) ? null
						: (this.auxAutoLimitInd.length() <= auxAutoLimitIndSize) ? this.auxAutoLimitInd
								: this.auxAutoLimitInd.substring(0, this.auxAutoLimitIndSize)),
				this.auxLmtUpVal, this.auxLmtDnVal,
				((this.auxAnalysis1 == null) ? null
						: (this.auxAnalysis1.length() <= auxAnalysis1Size) ? this.auxAnalysis1
								: this.auxAnalysis1.substring(0, this.auxAnalysis1Size)),
				((this.auxAnalysis2 == null) ? null
						: (this.auxAnalysis2.length() <= auxAnalysis2Size) ? this.auxAnalysis2
								: this.auxAnalysis2.substring(0, this.auxAnalysis2Size)),
				((this.auxAnalysis3 == null) ? null
						: (this.auxAnalysis3.length() <= auxAnalysis3Size) ? this.auxAnalysis3
								: this.auxAnalysis3.substring(0, this.auxAnalysis3Size)),
				((this.auxAnalysis4 == null) ? null
						: (this.auxAnalysis4.length() <= auxAnalysis4Size) ? this.auxAnalysis4
								: this.auxAnalysis4.substring(0, this.auxAnalysis4Size)),
				((this.auxAnalysis5 == null) ? null
						: (this.auxAnalysis5.length() <= auxAnalysis5Size) ? this.auxAnalysis5
								: this.auxAnalysis5.substring(0, this.auxAnalysis5Size)),
				((this.auxAnalysis6 == null) ? null
						: (this.auxAnalysis6.length() <= auxAnalysis6Size) ? this.auxAnalysis6
								: this.auxAnalysis6.substring(0, this.auxAnalysis6Size)),
				((this.auxAnalysis7 == null) ? null
						: (this.auxAnalysis7.length() <= auxAnalysis7Size) ? this.auxAnalysis7
								: this.auxAnalysis7.substring(0, this.auxAnalysis7Size)),
				((this.auxAnalysis8 == null) ? null
						: (this.auxAnalysis8.length() <= auxAnalysis8Size) ? this.auxAnalysis8
								: this.auxAnalysis8.substring(0, this.auxAnalysis8Size)),
				((this.auxAnalysis9 == null) ? null
						: (this.auxAnalysis9.length() <= auxAnalysis9Size) ? this.auxAnalysis9
								: this.auxAnalysis9.substring(0, this.auxAnalysis9Size)),
				((this.auxAnalysis10 == null) ? null
						: (this.auxAnalysis10.length() <= auxAnalysis10Size) ? this.auxAnalysis10
								: this.auxAnalysis10.substring(0, this.auxAnalysis10Size)),
				((this.auxAnalysis11 == null) ? null
						: (this.auxAnalysis11.length() <= auxAnalysis11Size) ? this.auxAnalysis11
								: this.auxAnalysis11.substring(0, this.auxAnalysis11Size)),
				((this.auxAnalysis12 == null) ? null
						: (this.auxAnalysis12.length() <= auxAnalysis12Size) ? this.auxAnalysis12
								: this.auxAnalysis12.substring(0, this.auxAnalysis12Size)),
				((this.auxAnalysis13 == null) ? null
						: (this.auxAnalysis13.length() <= auxAnalysis13Size) ? this.auxAnalysis13
								: this.auxAnalysis13.substring(0, this.auxAnalysis13Size)),
				((this.auxAnalysis14 == null) ? null
						: (this.auxAnalysis14.length() <= auxAnalysis14Size) ? this.auxAnalysis14
								: this.auxAnalysis14.substring(0, this.auxAnalysis14Size)),
				((this.auxAnalysis15 == null) ? null
						: (this.auxAnalysis15.length() <= auxAnalysis15Size) ? this.auxAnalysis15
								: this.auxAnalysis15.substring(0, this.auxAnalysis15Size)),
				((this.auxAnalysis16 == null) ? null
						: (this.auxAnalysis16.length() <= auxAnalysis16Size) ? this.auxAnalysis16
								: this.auxAnalysis16.substring(0, this.auxAnalysis16Size)),
				((this.auxAnalysis17 == null) ? null
						: (this.auxAnalysis17.length() <= auxAnalysis17Size) ? this.auxAnalysis17
								: this.auxAnalysis17.substring(0, this.auxAnalysis17Size)),
				((this.auxAnalysis18 == null) ? null
						: (this.auxAnalysis18.length() <= auxAnalysis18Size) ? this.auxAnalysis18
								: this.auxAnalysis18.substring(0, this.auxAnalysis18Size)),
				((this.auxAnalysis19 == null) ? null
						: (this.auxAnalysis19.length() <= auxAnalysis19Size) ? this.auxAnalysis19
								: this.auxAnalysis19.substring(0, this.auxAnalysis19Size)),
				((this.auxAnalysis20 == null) ? null
						: (this.auxAnalysis20.length() <= auxAnalysis20Size) ? this.auxAnalysis20
								: this.auxAnalysis20.substring(0, this.auxAnalysis20Size)),
				((this.auxAnalysis21 == null) ? null
						: (this.auxAnalysis21.length() <= auxAnalysis21Size) ? this.auxAnalysis21
								: this.auxAnalysis21.substring(0, this.auxAnalysis21Size)),
				((this.auxAnalysis22 == null) ? null
						: (this.auxAnalysis22.length() <= auxAnalysis22Size) ? this.auxAnalysis22
								: this.auxAnalysis22.substring(0, this.auxAnalysis22Size)),
				((this.auxAnalysis23 == null) ? null
						: (this.auxAnalysis23.length() <= auxAnalysis23Size) ? this.auxAnalysis23
								: this.auxAnalysis23.substring(0, this.auxAnalysis23Size)),
				((this.auxAnalysis24 == null) ? null
						: (this.auxAnalysis24.length() <= auxAnalysis24Size) ? this.auxAnalysis24
								: this.auxAnalysis24.substring(0, this.auxAnalysis24Size)),
				((this.auxAnalysis25 == null) ? null
						: (this.auxAnalysis25.length() <= auxAnalysis25Size) ? this.auxAnalysis25
								: this.auxAnalysis25.substring(0, this.auxAnalysis25Size)),
				((this.auxAnalysis26 == null) ? null
						: (this.auxAnalysis26.length() <= auxAnalysis26Size) ? this.auxAnalysis26
								: this.auxAnalysis26.substring(0, this.auxAnalysis26Size)),
				((this.auxAnalysis27 == null) ? null
						: (this.auxAnalysis27.length() <= auxAnalysis27Size) ? this.auxAnalysis27
								: this.auxAnalysis27.substring(0, this.auxAnalysis27Size)),
				((this.auxAnalysis28 == null) ? null
						: (this.auxAnalysis28.length() <= auxAnalysis28Size) ? this.auxAnalysis28
								: this.auxAnalysis28.substring(0, this.auxAnalysis28Size)),
				((this.auxAnalysis29 == null) ? null
						: (this.auxAnalysis29.length() <= auxAnalysis29Size) ? this.auxAnalysis29
								: this.auxAnalysis29.substring(0, this.auxAnalysis29Size)),
				((this.auxAnalysis30 == null) ? null
						: (this.auxAnalysis30.length() <= auxAnalysis30Size) ? this.auxAnalysis30
								: this.auxAnalysis30.substring(0, this.auxAnalysis30Size)),
				this.audAddrid,
				((this.audAccountNo == null) ? null
						: (this.audAccountNo.length() <= audAccountNoSize) ? this.audAccountNo
								: this.audAccountNo.substring(0, this.audAccountNoSize)),
				this.audSubscriberId,
				((this.audAddressType == null) ? null
						: (this.audAddressType.length() <= audAddressTypeSize) ? this.audAddressType
								: this.audAddressType.substring(0, this.audAddressTypeSize)),
				this.audInDate, this.audInvEffDate,
				((this.audClassification == null) ? null
						: (this.audClassification.length() <= audClassificationSize) ? this.audClassification
								: this.audClassification.substring(0, this.audClassificationSize)),
				((this.audUniqueId == null) ? null
						: (this.audUniqueId.length() <= audUniqueIdSize) ? this.audUniqueId
								: this.audUniqueId.substring(0, this.audUniqueIdSize)),
				((this.audName == null) ? null
						: (this.audName.length() <= audNameSize) ? this.audName
								: this.audName.substring(0, this.audNameSize)),
				((this.audAddress1 == null) ? null
						: (this.audAddress1.length() <= audAddress1Size) ? this.audAddress1
								: this.audAddress1.substring(0, this.audAddress1Size)),
				((this.audAddress2 == null) ? null
						: (this.audAddress2.length() <= audAddress2Size) ? this.audAddress2
								: this.audAddress2.substring(0, this.audAddress2Size)),
				((this.audAddress3 == null) ? null
						: (this.audAddress3.length() <= audAddress3Size) ? this.audAddress3
								: this.audAddress3.substring(0, this.audAddress3Size)),
				((this.audAddress4 == null) ? null
						: (this.audAddress4.length() <= audAddress4Size) ? this.audAddress4
								: this.audAddress4.substring(0, this.audAddress4Size)),
				((this.audAddress5 == null) ? null
						: (this.audAddress5.length() <= audAddress5Size) ? this.audAddress5
								: this.audAddress5.substring(0, this.audAddress5Size)),
				((this.audAddress6 == null) ? null
						: (this.audAddress6.length() <= audAddress6Size) ? this.audAddress6
								: this.audAddress6.substring(0, this.audAddress6Size)),
				((this.audPostcode == null) ? null
						: (this.audPostcode.length() <= audPostcodeSize) ? this.audPostcode
								: this.audPostcode.substring(0, this.audPostcodeSize)),
				((this.audTelephoneNo == null) ? null
						: (this.audTelephoneNo.length() <= audTelephoneNoSize) ? this.audTelephoneNo
								: this.audTelephoneNo.substring(0, this.audTelephoneNoSize)),
				((this.audTelephoneNo2 == null) ? null
						: (this.audTelephoneNo2.length() <= audTelephoneNo2Size) ? this.audTelephoneNo2
								: this.audTelephoneNo2.substring(0, this.audTelephoneNo2Size)),
				((this.audFaxNo == null) ? null
						: (this.audFaxNo.length() <= audFaxNoSize) ? this.audFaxNo
								: this.audFaxNo.substring(0, this.audFaxNoSize)),
				((this.audContact == null) ? null
						: (this.audContact.length() <= audContactSize) ? this.audContact
								: this.audContact.substring(0, this.audContactSize)),
				((this.audEMail == null) ? null
						: (this.audEMail.length() <= audEMailSize) ? this.audEMail
								: this.audEMail.substring(0, this.audEMailSize)),
				((this.audNotes == null) ? null
						: (this.audNotes.length() <= audNotesSize) ? this.audNotes
								: this.audNotes.substring(0, this.audNotesSize)),
				((this.audGeneral1 == null) ? null
						: (this.audGeneral1.length() <= audGeneral1Size) ? this.audGeneral1
								: this.audGeneral1.substring(0, this.audGeneral1Size)),
				((this.audGeneral2 == null) ? null
						: (this.audGeneral2.length() <= audGeneral2Size) ? this.audGeneral2
								: this.audGeneral2.substring(0, this.audGeneral2Size)),
				((this.audGeneral3 == null) ? null
						: (this.audGeneral3.length() <= audGeneral3Size) ? this.audGeneral3
								: this.audGeneral3.substring(0, this.audGeneral3Size)) };
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
		this.auxTitle = rtrim((String) fields[0]);

		this.auxFirstname = rtrim((String) fields[1]);

		this.auxInvoiceAddrid = ((Integer) fields[2]);
		this.bankName = rtrim((String) fields[3]);

		this.bankAddr1 = rtrim((String) fields[4]);

		this.bankAddr2 = rtrim((String) fields[5]);

		this.bankAcName = rtrim((String) fields[6]);

		this.ref = rtrim((String) fields[7]);

		this.bankScode = rtrim((String) fields[8]);

		this.bankAcNo = rtrim((String) fields[9]);

		this.bankAcType = rtrim((String) fields[10]);

		this.bankPayType = rtrim((String) fields[11]);

		this.auxPrefDebitDay = ((Integer) fields[12]);
		this.billAcNo = rtrim((String) fields[13]);

		this.protectCode = rtrim((String) fields[14]);

		this.handsetCt = ((Integer) fields[15]);
		this.bankDate = ((fields[16] == null) ? null : new Date(fields[16]));
		this.confDate = ((fields[17] == null) ? null : new Date(fields[17]));
		this.auxComment = rtrim((String) fields[18]);

		this.dateOfBirth = ((fields[19] == null) ? null : new Date(fields[19]));
		this.refPayDate = ((fields[20] == null) ? null : new Date(fields[20]));
		this.acClosDate = ((fields[21] == null) ? null : new Date(fields[21]));
		this.noReasDate = ((fields[22] == null) ? null : new Date(fields[22]));
		this.remLetDate = ((fields[23] == null) ? null : new Date(fields[23]));
		this.acTranDate = ((fields[24] == null) ? null : new Date(fields[24]));
		this.noAcDate = ((fields[25] == null) ? null : new Date(fields[25]));
		this.srFlag = rtrim((String) fields[26]);

		this.processed = rtrim((String) fields[27]);

		this.packageCode = rtrim((String) fields[28]);

		this.auxAccountType = rtrim((String) fields[29]);

		this.auxBillCycle = rtrim((String) fields[30]);

		this.creditCardNo = rtrim((String) fields[31]);

		this.creditCardName = rtrim((String) fields[32]);

		this.expiryDate = ((fields[33] == null) ? null : new Date(fields[33]));
		this.auxCardCvvNo = rtrim((String) fields[34]);

		this.creditScore = ((Integer) fields[35]);
		this.servProvId = ((Integer) fields[36]);
		this.dealerId = rtrim((String) fields[37]);

		this.salesman = rtrim((String) fields[38]);

		this.idNumber = rtrim((String) fields[39]);

		this.accStatus = rtrim((String) fields[40]);

		this.compRegNo = rtrim((String) fields[41]);

		this.stationaryType = rtrim((String) fields[42]);

		this.maxNoSubs = ((Integer) fields[43]);
		this.auxCurrency = rtrim((String) fields[44]);

		this.auxCountryCode = rtrim((String) fields[45]);

		this.auxGender = rtrim((String) fields[46]);

		this.auxSubGrpAccNo = rtrim((String) fields[47]);

		this.auxPrepaidStat = rtrim((String) fields[48]);

		this.auxCreditClass = rtrim((String) fields[49]);

		this.auxAutoLimitInd = rtrim((String) fields[50]);

		this.auxLmtUpVal = ((Short) fields[51]);
		this.auxLmtDnVal = ((Short) fields[52]);
		this.auxAnalysis1 = rtrim((String) fields[53]);

		this.auxAnalysis2 = rtrim((String) fields[54]);

		this.auxAnalysis3 = rtrim((String) fields[55]);

		this.auxAnalysis4 = rtrim((String) fields[56]);

		this.auxAnalysis5 = rtrim((String) fields[57]);

		this.auxAnalysis6 = rtrim((String) fields[58]);

		this.auxAnalysis7 = rtrim((String) fields[59]);

		this.auxAnalysis8 = rtrim((String) fields[60]);

		this.auxAnalysis9 = rtrim((String) fields[61]);

		this.auxAnalysis10 = rtrim((String) fields[62]);

		this.auxAnalysis11 = rtrim((String) fields[63]);

		this.auxAnalysis12 = rtrim((String) fields[64]);

		this.auxAnalysis13 = rtrim((String) fields[65]);

		this.auxAnalysis14 = rtrim((String) fields[66]);

		this.auxAnalysis15 = rtrim((String) fields[67]);

		this.auxAnalysis16 = rtrim((String) fields[68]);

		this.auxAnalysis17 = rtrim((String) fields[69]);

		this.auxAnalysis18 = rtrim((String) fields[70]);

		this.auxAnalysis19 = rtrim((String) fields[71]);

		this.auxAnalysis20 = rtrim((String) fields[72]);

		this.auxAnalysis21 = rtrim((String) fields[73]);

		this.auxAnalysis22 = rtrim((String) fields[74]);

		this.auxAnalysis23 = rtrim((String) fields[75]);

		this.auxAnalysis24 = rtrim((String) fields[76]);

		this.auxAnalysis25 = rtrim((String) fields[77]);

		this.auxAnalysis26 = rtrim((String) fields[78]);

		this.auxAnalysis27 = rtrim((String) fields[79]);

		this.auxAnalysis28 = rtrim((String) fields[80]);

		this.auxAnalysis29 = rtrim((String) fields[81]);

		this.auxAnalysis30 = rtrim((String) fields[82]);

		this.audAddrid = (Integer) fields[83];

		this.audAccountNo = rtrim((String) fields[84]);

		this.audSubscriberId = ((Integer) fields[85]);
		this.audAddressType = rtrim((String) fields[86]);

		this.audInDate = ((fields[87] == null) ? null : new Date(fields[87]));
		this.audInvEffDate = ((fields[88] == null) ? null : new Date(fields[88]));
		this.audClassification = rtrim((String) fields[89]);

		this.audUniqueId = rtrim((String) fields[90]);

		this.audName = rtrim((String) fields[91]);

		this.audAddress1 = rtrim((String) fields[92]);

		this.audAddress2 = rtrim((String) fields[93]);

		this.audAddress3 = rtrim((String) fields[94]);

		this.audAddress4 = rtrim((String) fields[95]);

		this.audAddress5 = rtrim((String) fields[96]);

		this.audAddress6 = rtrim((String) fields[97]);

		this.audPostcode = rtrim((String) fields[98]);

		this.audTelephoneNo = rtrim((String) fields[99]);

		this.audTelephoneNo2 = rtrim((String) fields[100]);

		this.audFaxNo = rtrim((String) fields[101]);

		this.audContact = rtrim((String) fields[102]);

		this.audEMail = rtrim((String) fields[103]);

		this.audNotes = rtrim((String) fields[104]);

		this.audGeneral1 = rtrim((String) fields[105]);

		this.audGeneral2 = rtrim((String) fields[106]);

		this.audGeneral3 = rtrim((String) fields[107]);

	}

	public void set(final String auxTitle, final String auxFirstname, final Integer auxInvoiceAddrid,
			final String bankName, final String bankAddr1, final String bankAddr2, final String bankAcName,
			final String ref, final String bankScode, final String bankAcNo, final String bankAcType,
			final String bankPayType, final Integer auxPrefDebitDay, final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate, final String auxComment,
			final Date dateOfBirth, final Date refPayDate, final Date acClosDate, final Date noReasDate,
			final Date remLetDate, final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode, final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName, final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId, final String dealerId, final String salesman,
			final String idNumber, final String accStatus, final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency, final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat, final String auxCreditClass,
			final String auxAutoLimitInd, final Short auxLmtUpVal, final Short auxLmtDnVal, final String auxAnalysis1,
			final String auxAnalysis2, final String auxAnalysis3, final String auxAnalysis4, final String auxAnalysis5,
			final String auxAnalysis6, final String auxAnalysis7, final String auxAnalysis8, final String auxAnalysis9,
			final String auxAnalysis10, final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14, final String auxAnalysis15,
			final String auxAnalysis16, final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20, final String auxAnalysis21,
			final String auxAnalysis22, final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26, final String auxAnalysis27,
			final String auxAnalysis28, final String auxAnalysis29, final String auxAnalysis30, final Integer audAddrid,
			final String audAccountNo, final Integer audSubscriberId, final String audAddressType, final Date audInDate,
			final Date audInvEffDate, final String audClassification, final String audUniqueId, final String audName,
			final String audAddress1, final String audAddress2, final String audAddress3, final String audAddress4,
			final String audAddress5, final String audAddress6, final String audPostcode, final String audTelephoneNo,
			final String audTelephoneNo2, final String audFaxNo, final String audContact, final String audEMail,
			final String audNotes, final String audGeneral1, final String audGeneral2, final String audGeneral3) {

		this.auxTitle = auxTitle;
		this.auxFirstname = auxFirstname;
		this.auxInvoiceAddrid = auxInvoiceAddrid;
		this.bankName = bankName;
		this.bankAddr1 = bankAddr1;
		this.bankAddr2 = bankAddr2;
		this.bankAcName = bankAcName;
		this.ref = ref;
		this.bankScode = bankScode;
		this.bankAcNo = bankAcNo;
		this.bankAcType = bankAcType;
		this.bankPayType = bankPayType;
		this.auxPrefDebitDay = auxPrefDebitDay;
		this.billAcNo = billAcNo;
		this.protectCode = protectCode;
		this.handsetCt = handsetCt;
		this.bankDate = bankDate;
		this.confDate = confDate;
		this.auxComment = auxComment;
		this.dateOfBirth = dateOfBirth;
		this.refPayDate = refPayDate;
		this.acClosDate = acClosDate;
		this.noReasDate = noReasDate;
		this.remLetDate = remLetDate;
		this.acTranDate = acTranDate;
		this.noAcDate = noAcDate;
		this.srFlag = srFlag;
		this.processed = processed;
		this.packageCode = packageCode;
		this.auxAccountType = auxAccountType;
		this.auxBillCycle = auxBillCycle;
		this.creditCardNo = creditCardNo;
		this.creditCardName = creditCardName;
		this.expiryDate = expiryDate;
		this.auxCardCvvNo = auxCardCvvNo;
		this.creditScore = creditScore;
		this.servProvId = servProvId;
		this.dealerId = dealerId;
		this.salesman = salesman;
		this.idNumber = idNumber;
		this.accStatus = accStatus;
		this.compRegNo = compRegNo;
		this.stationaryType = stationaryType;
		this.maxNoSubs = maxNoSubs;
		this.auxCurrency = auxCurrency;
		this.auxCountryCode = auxCountryCode;
		this.auxGender = auxGender;
		this.auxSubGrpAccNo = auxSubGrpAccNo;
		this.auxPrepaidStat = auxPrepaidStat;
		this.auxCreditClass = auxCreditClass;
		this.auxAutoLimitInd = auxAutoLimitInd;
		this.auxLmtUpVal = auxLmtUpVal;
		this.auxLmtDnVal = auxLmtDnVal;
		this.auxAnalysis1 = auxAnalysis1;
		this.auxAnalysis2 = auxAnalysis2;
		this.auxAnalysis3 = auxAnalysis3;
		this.auxAnalysis4 = auxAnalysis4;
		this.auxAnalysis5 = auxAnalysis5;
		this.auxAnalysis6 = auxAnalysis6;
		this.auxAnalysis7 = auxAnalysis7;
		this.auxAnalysis8 = auxAnalysis8;
		this.auxAnalysis9 = auxAnalysis9;
		this.auxAnalysis10 = auxAnalysis10;
		this.auxAnalysis11 = auxAnalysis11;
		this.auxAnalysis12 = auxAnalysis12;
		this.auxAnalysis13 = auxAnalysis13;
		this.auxAnalysis14 = auxAnalysis14;
		this.auxAnalysis15 = auxAnalysis15;
		this.auxAnalysis16 = auxAnalysis16;
		this.auxAnalysis17 = auxAnalysis17;
		this.auxAnalysis18 = auxAnalysis18;
		this.auxAnalysis19 = auxAnalysis19;
		this.auxAnalysis20 = auxAnalysis20;
		this.auxAnalysis21 = auxAnalysis21;
		this.auxAnalysis22 = auxAnalysis22;
		this.auxAnalysis23 = auxAnalysis23;
		this.auxAnalysis24 = auxAnalysis24;
		this.auxAnalysis25 = auxAnalysis25;
		this.auxAnalysis26 = auxAnalysis26;
		this.auxAnalysis27 = auxAnalysis27;
		this.auxAnalysis28 = auxAnalysis28;
		this.auxAnalysis29 = auxAnalysis29;
		this.auxAnalysis30 = auxAnalysis30;
		this.audAddrid = audAddrid;
		this.audAccountNo = audAccountNo;
		this.audSubscriberId = audSubscriberId;
		this.audAddressType = audAddressType;
		this.audInDate = audInDate;
		this.audInvEffDate = audInvEffDate;
		this.audClassification = audClassification;
		this.audUniqueId = audUniqueId;
		this.audName = audName;
		this.audAddress1 = audAddress1;
		this.audAddress2 = audAddress2;
		this.audAddress3 = audAddress3;
		this.audAddress4 = audAddress4;
		this.audAddress5 = audAddress5;
		this.audAddress6 = audAddress6;
		this.audPostcode = audPostcode;
		this.audTelephoneNo = audTelephoneNo;
		this.audTelephoneNo2 = audTelephoneNo2;
		this.audFaxNo = audFaxNo;
		this.audContact = audContact;
		this.audEMail = audEMail;
		this.audNotes = audNotes;
		this.audGeneral1 = audGeneral1;
		this.audGeneral2 = audGeneral2;
		this.audGeneral3 = audGeneral3;
	}

	public String getAuxTitle() {
		return auxTitle;
	}

	public void setAuxTitle(String auxTitle) {
		this.auxTitle = auxTitle;
	}

	public String getAuxFirstname() {
		return auxFirstname;
	}

	public void setAuxFirstname(String auxFirstname) {
		this.auxFirstname = auxFirstname;
	}

	public Integer getAuxInvoiceAddrid() {
		return auxInvoiceAddrid;
	}

	public void setAuxInvoiceAddrid(Integer auxInvoiceAddrid) {
		this.auxInvoiceAddrid = auxInvoiceAddrid;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddr1() {
		return bankAddr1;
	}

	public void setBankAddr1(String bankAddr1) {
		this.bankAddr1 = bankAddr1;
	}

	public String getBankAddr2() {
		return bankAddr2;
	}

	public void setBankAddr2(String bankAddr2) {
		this.bankAddr2 = bankAddr2;
	}

	public String getBankAcName() {
		return bankAcName;
	}

	public void setBankAcName(String bankAcName) {
		this.bankAcName = bankAcName;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getBankScode() {
		return bankScode;
	}

	public void setBankScode(String bankScode) {
		this.bankScode = bankScode;
	}

	public String getBankAcNo() {
		return bankAcNo;
	}

	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
	}

	public String getBankAcType() {
		return bankAcType;
	}

	public void setBankAcType(String bankAcType) {
		this.bankAcType = bankAcType;
	}

	public String getBankPayType() {
		return bankPayType;
	}

	public void setBankPayType(String bankPayType) {
		this.bankPayType = bankPayType;
	}

	public Integer getAuxPrefDebitDay() {
		return auxPrefDebitDay;
	}

	public void setAuxPrefDebitDay(Integer auxPrefDebitDay) {
		this.auxPrefDebitDay = auxPrefDebitDay;
	}

	public String getBillAcNo() {
		return billAcNo;
	}

	public void setBillAcNo(String billAcNo) {
		this.billAcNo = billAcNo;
	}

	public String getProtectCode() {
		return protectCode;
	}

	public void setProtectCode(String protectCode) {
		this.protectCode = protectCode;
	}

	public Integer getHandsetCt() {
		return handsetCt;
	}

	public void setHandsetCt(Integer handsetCt) {
		this.handsetCt = handsetCt;
	}

	public Date getBankDate() {
		return bankDate;
	}

	public void setBankDate(Date bankDate) {
		this.bankDate = bankDate;
	}

	public Date getConfDate() {
		return confDate;
	}

	public void setConfDate(Date confDate) {
		this.confDate = confDate;
	}

	public String getAuxComment() {
		return auxComment;
	}

	public void setAuxComment(String auxComment) {
		this.auxComment = auxComment;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getRefPayDate() {
		return refPayDate;
	}

	public void setRefPayDate(Date refPayDate) {
		this.refPayDate = refPayDate;
	}

	public Date getAcClosDate() {
		return acClosDate;
	}

	public void setAcClosDate(Date acClosDate) {
		this.acClosDate = acClosDate;
	}

	public Date getNoReasDate() {
		return noReasDate;
	}

	public void setNoReasDate(Date noReasDate) {
		this.noReasDate = noReasDate;
	}

	public Date getRemLetDate() {
		return remLetDate;
	}

	public void setRemLetDate(Date remLetDate) {
		this.remLetDate = remLetDate;
	}

	public Date getAcTranDate() {
		return acTranDate;
	}

	public void setAcTranDate(Date acTranDate) {
		this.acTranDate = acTranDate;
	}

	public Date getNoAcDate() {
		return noAcDate;
	}

	public void setNoAcDate(Date noAcDate) {
		this.noAcDate = noAcDate;
	}

	public String getSrFlag() {
		return srFlag;
	}

	public void setSrFlag(String srFlag) {
		this.srFlag = srFlag;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getAuxAccountType() {
		return auxAccountType;
	}

	public void setAuxAccountType(String auxAccountType) {
		this.auxAccountType = auxAccountType;
	}

	public String getAuxBillCycle() {
		return auxBillCycle;
	}

	public void setAuxBillCycle(String auxBillCycle) {
		this.auxBillCycle = auxBillCycle;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getAuxCardCvvNo() {
		return auxCardCvvNo;
	}

	public void setAuxCardCvvNo(String auxCardCvvNo) {
		this.auxCardCvvNo = auxCardCvvNo;
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	public Integer getServProvId() {
		return servProvId;
	}

	public void setServProvId(Integer servProvId) {
		this.servProvId = servProvId;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getCompRegNo() {
		return compRegNo;
	}

	public void setCompRegNo(String compRegNo) {
		this.compRegNo = compRegNo;
	}

	public String getStationaryType() {
		return stationaryType;
	}

	public void setStationaryType(String stationaryType) {
		this.stationaryType = stationaryType;
	}

	public Integer getMaxNoSubs() {
		return maxNoSubs;
	}

	public void setMaxNoSubs(Integer maxNoSubs) {
		this.maxNoSubs = maxNoSubs;
	}

	public String getAuxCurrency() {
		return auxCurrency;
	}

	public void setAuxCurrency(String auxCurrency) {
		this.auxCurrency = auxCurrency;
	}

	public String getAuxCountryCode() {
		return auxCountryCode;
	}

	public void setAuxCountryCode(String auxCountryCode) {
		this.auxCountryCode = auxCountryCode;
	}

	public String getAuxGender() {
		return auxGender;
	}

	public void setAuxGender(String auxGender) {
		this.auxGender = auxGender;
	}

	public String getAuxSubGrpAccNo() {
		return auxSubGrpAccNo;
	}

	public void setAuxSubGrpAccNo(String auxSubGrpAccNo) {
		this.auxSubGrpAccNo = auxSubGrpAccNo;
	}

	public String getAuxPrepaidStat() {
		return auxPrepaidStat;
	}

	public void setAuxPrepaidStat(String auxPrepaidStat) {
		this.auxPrepaidStat = auxPrepaidStat;
	}

	public String getAuxCreditClass() {
		return auxCreditClass;
	}

	public void setAuxCreditClass(String auxCreditClass) {
		this.auxCreditClass = auxCreditClass;
	}

	public String getAuxAutoLimitInd() {
		return auxAutoLimitInd;
	}

	public void setAuxAutoLimitInd(String auxAutoLimitInd) {
		this.auxAutoLimitInd = auxAutoLimitInd;
	}

	public Short getAuxLmtUpVal() {
		return auxLmtUpVal;
	}

	public void setAuxLmtUpVal(Short auxLmtUpVal) {
		this.auxLmtUpVal = auxLmtUpVal;
	}

	public Short getAuxLmtDnVal() {
		return auxLmtDnVal;
	}

	public void setAuxLmtDnVal(Short auxLmtDnVal) {
		this.auxLmtDnVal = auxLmtDnVal;
	}

	public String getAuxAnalysis1() {
		return auxAnalysis1;
	}

	public void setAuxAnalysis1(String auxAnalysis1) {
		this.auxAnalysis1 = auxAnalysis1;
	}

	public String getAuxAnalysis2() {
		return auxAnalysis2;
	}

	public void setAuxAnalysis2(String auxAnalysis2) {
		this.auxAnalysis2 = auxAnalysis2;
	}

	public String getAuxAnalysis3() {
		return auxAnalysis3;
	}

	public void setAuxAnalysis3(String auxAnalysis3) {
		this.auxAnalysis3 = auxAnalysis3;
	}

	public String getAuxAnalysis4() {
		return auxAnalysis4;
	}

	public void setAuxAnalysis4(String auxAnalysis4) {
		this.auxAnalysis4 = auxAnalysis4;
	}

	public String getAuxAnalysis5() {
		return auxAnalysis5;
	}

	public void setAuxAnalysis5(String auxAnalysis5) {
		this.auxAnalysis5 = auxAnalysis5;
	}

	public String getAuxAnalysis6() {
		return auxAnalysis6;
	}

	public void setAuxAnalysis6(String auxAnalysis6) {
		this.auxAnalysis6 = auxAnalysis6;
	}

	public String getAuxAnalysis7() {
		return auxAnalysis7;
	}

	public void setAuxAnalysis7(String auxAnalysis7) {
		this.auxAnalysis7 = auxAnalysis7;
	}

	public String getAuxAnalysis8() {
		return auxAnalysis8;
	}

	public void setAuxAnalysis8(String auxAnalysis8) {
		this.auxAnalysis8 = auxAnalysis8;
	}

	public String getAuxAnalysis9() {
		return auxAnalysis9;
	}

	public void setAuxAnalysis9(String auxAnalysis9) {
		this.auxAnalysis9 = auxAnalysis9;
	}

	public String getAuxAnalysis10() {
		return auxAnalysis10;
	}

	public void setAuxAnalysis10(String auxAnalysis10) {
		this.auxAnalysis10 = auxAnalysis10;
	}

	public String getAuxAnalysis11() {
		return auxAnalysis11;
	}

	public void setAuxAnalysis11(String auxAnalysis11) {
		this.auxAnalysis11 = auxAnalysis11;
	}

	public String getAuxAnalysis12() {
		return auxAnalysis12;
	}

	public void setAuxAnalysis12(String auxAnalysis12) {
		this.auxAnalysis12 = auxAnalysis12;
	}

	public String getAuxAnalysis13() {
		return auxAnalysis13;
	}

	public void setAuxAnalysis13(String auxAnalysis13) {
		this.auxAnalysis13 = auxAnalysis13;
	}

	public String getAuxAnalysis14() {
		return auxAnalysis14;
	}

	public void setAuxAnalysis14(String auxAnalysis14) {
		this.auxAnalysis14 = auxAnalysis14;
	}

	public String getAuxAnalysis15() {
		return auxAnalysis15;
	}

	public void setAuxAnalysis15(String auxAnalysis15) {
		this.auxAnalysis15 = auxAnalysis15;
	}

	public String getAuxAnalysis16() {
		return auxAnalysis16;
	}

	public void setAuxAnalysis16(String auxAnalysis16) {
		this.auxAnalysis16 = auxAnalysis16;
	}

	public String getAuxAnalysis17() {
		return auxAnalysis17;
	}

	public void setAuxAnalysis17(String auxAnalysis17) {
		this.auxAnalysis17 = auxAnalysis17;
	}

	public String getAuxAnalysis18() {
		return auxAnalysis18;
	}

	public void setAuxAnalysis18(String auxAnalysis18) {
		this.auxAnalysis18 = auxAnalysis18;
	}

	public String getAuxAnalysis19() {
		return auxAnalysis19;
	}

	public void setAuxAnalysis19(String auxAnalysis19) {
		this.auxAnalysis19 = auxAnalysis19;
	}

	public String getAuxAnalysis20() {
		return auxAnalysis20;
	}

	public void setAuxAnalysis20(String auxAnalysis20) {
		this.auxAnalysis20 = auxAnalysis20;
	}

	public String getAuxAnalysis21() {
		return auxAnalysis21;
	}

	public void setAuxAnalysis21(String auxAnalysis21) {
		this.auxAnalysis21 = auxAnalysis21;
	}

	public String getAuxAnalysis22() {
		return auxAnalysis22;
	}

	public void setAuxAnalysis22(String auxAnalysis22) {
		this.auxAnalysis22 = auxAnalysis22;
	}

	public String getAuxAnalysis23() {
		return auxAnalysis23;
	}

	public void setAuxAnalysis23(String auxAnalysis23) {
		this.auxAnalysis23 = auxAnalysis23;
	}

	public String getAuxAnalysis24() {
		return auxAnalysis24;
	}

	public void setAuxAnalysis24(String auxAnalysis24) {
		this.auxAnalysis24 = auxAnalysis24;
	}

	public String getAuxAnalysis25() {
		return auxAnalysis25;
	}

	public void setAuxAnalysis25(String auxAnalysis25) {
		this.auxAnalysis25 = auxAnalysis25;
	}

	public String getAuxAnalysis26() {
		return auxAnalysis26;
	}

	public void setAuxAnalysis26(String auxAnalysis26) {
		this.auxAnalysis26 = auxAnalysis26;
	}

	public String getAuxAnalysis27() {
		return auxAnalysis27;
	}

	public void setAuxAnalysis27(String auxAnalysis27) {
		this.auxAnalysis27 = auxAnalysis27;
	}

	public String getAuxAnalysis28() {
		return auxAnalysis28;
	}

	public void setAuxAnalysis28(String auxAnalysis28) {
		this.auxAnalysis28 = auxAnalysis28;
	}

	public String getAuxAnalysis29() {
		return auxAnalysis29;
	}

	public void setAuxAnalysis29(String auxAnalysis29) {
		this.auxAnalysis29 = auxAnalysis29;
	}

	public String getAuxAnalysis30() {
		return auxAnalysis30;
	}

	public void setAuxAnalysis30(String auxAnalysis30) {
		this.auxAnalysis30 = auxAnalysis30;
	}

	public Integer getAudAddrid() {
		return audAddrid;
	}

	public void setAudAddrid(Integer audAddrid) {
		this.audAddrid = audAddrid;
	}

	public String getAudAccountNo() {
		return audAccountNo;
	}

	public void setAudAccountNo(String audAccountNo) {
		this.audAccountNo = audAccountNo;
	}

	public Integer getAudSubscriberId() {
		return audSubscriberId;
	}

	public void setAudSubscriberId(Integer audSubscriberId) {
		this.audSubscriberId = audSubscriberId;
	}

	public String getAudAddressType() {
		return audAddressType;
	}

	public void setAudAddressType(String audAddressType) {
		this.audAddressType = audAddressType;
	}

	public Date getAudInDate() {
		return audInDate;
	}

	public void setAudInDate(Date audInDate) {
		this.audInDate = audInDate;
	}

	public Date getAudInvEffDate() {
		return audInvEffDate;
	}

	public void setAudInvEffDate(Date audInvEffDate) {
		this.audInvEffDate = audInvEffDate;
	}

	public String getAudClassification() {
		return audClassification;
	}

	public void setAudClassification(String audClassification) {
		this.audClassification = audClassification;
	}

	public String getAudUniqueId() {
		return audUniqueId;
	}

	public void setAudUniqueId(String audUniqueId) {
		this.audUniqueId = audUniqueId;
	}

	public String getAudName() {
		return audName;
	}

	public void setAudName(String audName) {
		this.audName = audName;
	}

	public String getAudAddress1() {
		return audAddress1;
	}

	public void setAudAddress1(String audAddress1) {
		this.audAddress1 = audAddress1;
	}

	public String getAudAddress2() {
		return audAddress2;
	}

	public void setAudAddress2(String audAddress2) {
		this.audAddress2 = audAddress2;
	}

	public String getAudAddress3() {
		return audAddress3;
	}

	public void setAudAddress3(String audAddress3) {
		this.audAddress3 = audAddress3;
	}

	public String getAudAddress4() {
		return audAddress4;
	}

	public void setAudAddress4(String audAddress4) {
		this.audAddress4 = audAddress4;
	}

	public String getAudAddress5() {
		return audAddress5;
	}

	public void setAudAddress5(String audAddress5) {
		this.audAddress5 = audAddress5;
	}

	public String getAudAddress6() {
		return audAddress6;
	}

	public void setAudAddress6(String audAddress6) {
		this.audAddress6 = audAddress6;
	}

	public String getAudPostcode() {
		return audPostcode;
	}

	public void setAudPostcode(String audPostcode) {
		this.audPostcode = audPostcode;
	}

	public String getAudTelephoneNo() {
		return audTelephoneNo;
	}

	public void setAudTelephoneNo(String audTelephoneNo) {
		this.audTelephoneNo = audTelephoneNo;
	}

	public String getAudTelephoneNo2() {
		return audTelephoneNo2;
	}

	public void setAudTelephoneNo2(String audTelephoneNo2) {
		this.audTelephoneNo2 = audTelephoneNo2;
	}

	public String getAudFaxNo() {
		return audFaxNo;
	}

	public void setAudFaxNo(String audFaxNo) {
		this.audFaxNo = audFaxNo;
	}

	public String getAudContact() {
		return audContact;
	}

	public void setAudContact(String audContact) {
		this.audContact = audContact;
	}

	public String getAudEMail() {
		return audEMail;
	}

	public void setAudEMail(String audEMail) {
		this.audEMail = audEMail;
	}

	public String getAudNotes() {
		return audNotes;
	}

	public void setAudNotes(String audNotes) {
		this.audNotes = audNotes;
	}

	public String getAudGeneral1() {
		return audGeneral1;
	}

	public void setAudGeneral1(String audGeneral1) {
		this.audGeneral1 = audGeneral1;
	}

	public String getAudGeneral2() {
		return audGeneral2;
	}

	public void setAudGeneral2(String audGeneral2) {
		this.audGeneral2 = audGeneral2;
	}

	public String getAudGeneral3() {
		return audGeneral3;
	}

	public void setAudGeneral3(String audGeneral3) {
		this.audGeneral3 = audGeneral3;
	}

}
