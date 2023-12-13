package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.base.blo.AuxCustomers;
import com.eppixcomm.eppix.base.blo.AuxCustomersDMO;
import com.eppixcomm.eppix.base.blo.SlcustmDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class AuxSlcustmDQO extends DBO implements Serializable {

	private AuxCustomersDMO auxDMO;
	private SlcustmDMO slcustDMO;

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
	private Short auxPrefDebitDay;
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
	private String customer;
	private String alpha;
	private String name;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String address5;
	private String creditCategory;
	private String exportIndicator;
	private String custDiscCode;
	private String currency;
	private String territory;
	private String klass;
	private String region;
	private String invoiceCustomer;
	private String statementCustomer;
	private String groupCustomer;
	private Date dateLastIssue;
	private Date dateCreated;
	private String analysisCodes1;
	private String analysisCodes2;
	private String analysisCodes3;
	private String analysisCodes4;
	private String analysisCodes5;
	private String reminderCat;
	private String settlementCode;
	private String settDaysCode;
	private String priceList;
	private String letterCode;
	private String balanceFwd;
	private BigDecimal creditLimit;
	private BigDecimal ytdSales;
	private BigDecimal ytdCostOfSales;
	private BigDecimal cumulativeSales;
	private BigDecimal orderBalance;
	private String salesNlCat;
	private String specialPrice;
	private String vatRegistration;
	private String directDebit;
	private String invoicesPrinted;
	private String consolidatedInv;
	private String commentOnlyInv;
	private String bankAccountNo;
	private String bankSortCode;
	private String bankname;
	private String bankAddress1;
	private String bankAddress2;
	private String bankAddress3;
	private String bankAddress4;
	private String analysisCode6;
	private String produceStatements;
	private String ediCustomer;
	private String vatType;
	private String language;
	private String deliveryMethod;
	private String carrier;
	private String vatRegNumber;
	private String vatExeNumber;
	private String paydays1;
	private String paydays2;
	private String paydays3;
	private String bankBranchCode;
	private String printCpWithStat;
	private String paymentMethod;
	private String customerClass;
	private String salesType;
	private BigDecimal cpLowerValue;
	private String address6;
	private String fax;
	private String telex;
	private String btx;
	private String cpCharge;
	private String controlDigit;
	private String payer;
	private String responsibility;
	private String despatchHeld;
	private String creditController;
	private String reminderLetters;
	private Integer severityDays1;
	private Integer severityDays2;
	private Integer severityDays3;
	private Integer severityDays4;
	private Integer severityDays5;
	private Integer severityDays6;
	private String deliveryReason;
	private String shipperCode1;
	private String shipperCode2;
	private String shipperCode3;
	private String shippingNoteInd;
	private String accountType;
	private String adminFee;
	private String intrestRate;

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

	public static final int customerFilter = 83;
	private static final int customerSize = 8;

	public static final int alphaFilter = 84;
	private static final int alphaSize = 8;

	public static final int nameFilter = 85;
	private static final int nameSize = 50;

	public static final int address1Filter = 86;
	private static final int address1Size = 32;

	public static final int address2Filter = 87;
	private static final int address2Size = 32;

	public static final int address3Filter = 88;
	private static final int address3Size = 32;

	public static final int address4Filter = 89;
	private static final int address4Size = 32;

	public static final int address5Filter = 90;
	private static final int address5Size = 32;

	public static final int creditCategoryFilter = 91;
	private static final int creditCategorySize = 1;

	public static final int exportIndicatorFilter = 92;
	private static final int exportIndicatorSize = 1;

	public static final int custDiscCodeFilter = 93;
	private static final int custDiscCodeSize = 4;

	public static final int currencyFilter = 94;
	private static final int currencySize = 3;

	public static final int territoryFilter = 95;
	private static final int territorySize = 6;

	public static final int klassFilter = 96;
	private static final int klassSize = 6;

	public static final int regionFilter = 97;
	private static final int regionSize = 6;

	public static final int invoiceCustomerFilter = 98;
	private static final int invoiceCustomerSize = 8;

	public static final int statementCustomerFilter = 99;
	private static final int statementCustomerSize = 8;

	public static final int groupCustomerFilter = 100;
	private static final int groupCustomerSize = 8;

	public static final int dateLastIssueFilter = 101;

	public static final int dateCreatedFilter = 102;

	public static final int analysisCodes1Filter = 103;
	private static final int analysisCodes1Size = 10;

	public static final int analysisCodes2Filter = 104;
	private static final int analysisCodes2Size = 10;

	public static final int analysisCodes3Filter = 105;
	private static final int analysisCodes3Size = 10;

	public static final int analysisCodes4Filter = 106;
	private static final int analysisCodes4Size = 10;

	public static final int analysisCodes5Filter = 107;
	private static final int analysisCodes5Size = 10;

	public static final int reminderCatFilter = 108;
	private static final int reminderCatSize = 3;

	public static final int settlementCodeFilter = 109;
	private static final int settlementCodeSize = 2;

	public static final int settDaysCodeFilter = 110;
	private static final int settDaysCodeSize = 1;

	public static final int priceListFilter = 111;
	private static final int priceListSize = 3;

	public static final int letterCodeFilter = 112;
	private static final int letterCodeSize = 3;

	public static final int balanceFwdFilter = 113;
	private static final int balanceFwdSize = 1;

	public static final int creditLimitFilter = 114;

	public static final int ytdSalesFilter = 115;

	public static final int ytdCostOfSalesFilter = 116;

	public static final int cumulativeSalesFilter = 117;

	public static final int orderBalanceFilter = 118;

	public static final int salesNlCatFilter = 119;
	private static final int salesNlCatSize = 3;

	public static final int specialPriceFilter = 120;
	private static final int specialPriceSize = 3;

	public static final int vatRegistrationFilter = 121;
	private static final int vatRegistrationSize = 14;

	public static final int directDebitFilter = 122;
	private static final int directDebitSize = 1;

	public static final int invoicesPrintedFilter = 123;
	private static final int invoicesPrintedSize = 1;

	public static final int consolidatedInvFilter = 124;
	private static final int consolidatedInvSize = 1;

	public static final int commentOnlyInvFilter = 125;
	private static final int commentOnlyInvSize = 1;

	public static final int bankAccountNoFilter = 126;
	private static final int bankAccountNoSize = 20;

	public static final int bankSortCodeFilter = 127;
	private static final int bankSortCodeSize = 8;

	public static final int banknameFilter = 128;
	private static final int banknameSize = 20;

	public static final int bankAddress1Filter = 129;
	private static final int bankAddress1Size = 30;

	public static final int bankAddress2Filter = 130;
	private static final int bankAddress2Size = 30;

	public static final int bankAddress3Filter = 131;
	private static final int bankAddress3Size = 30;

	public static final int bankAddress4Filter = 132;
	private static final int bankAddress4Size = 30;

	public static final int analysisCode6Filter = 133;
	private static final int analysisCode6Size = 10;

	public static final int produceStatementsFilter = 134;
	private static final int produceStatementsSize = 1;

	public static final int ediCustomerFilter = 135;
	private static final int ediCustomerSize = 1;

	public static final int vatTypeFilter = 136;
	private static final int vatTypeSize = 10;

	public static final int languageFilter = 137;
	private static final int languageSize = 10;

	public static final int deliveryMethodFilter = 138;
	private static final int deliveryMethodSize = 10;

	public static final int carrierFilter = 139;
	private static final int carrierSize = 10;

	public static final int vatRegNumberFilter = 140;
	private static final int vatRegNumberSize = 16;

	public static final int vatExeNumberFilter = 141;
	private static final int vatExeNumberSize = 16;

	public static final int paydays1Filter = 142;
	private static final int paydays1Size = 2;

	public static final int paydays2Filter = 143;
	private static final int paydays2Size = 2;

	public static final int paydays3Filter = 144;
	private static final int paydays3Size = 2;

	public static final int bankBranchCodeFilter = 145;
	private static final int bankBranchCodeSize = 8;

	public static final int printCpWithStatFilter = 146;
	private static final int printCpWithStatSize = 1;

	public static final int paymentMethodFilter = 147;
	private static final int paymentMethodSize = 2;

	public static final int customerClassFilter = 148;
	private static final int customerClassSize = 8;

	public static final int salesTypeFilter = 149;
	private static final int salesTypeSize = 2;

	public static final int cpLowerValueFilter = 150;

	public static final int address6Filter = 151;
	private static final int address6Size = 32;

	public static final int faxFilter = 152;
	private static final int faxSize = 30;

	public static final int telexFilter = 153;
	private static final int telexSize = 30;

	public static final int btxFilter = 154;
	private static final int btxSize = 30;

	public static final int cpChargeFilter = 155;
	private static final int cpChargeSize = 1;

	public static final int controlDigitFilter = 156;
	private static final int controlDigitSize = 2;

	public static final int payerFilter = 157;
	private static final int payerSize = 10;

	public static final int responsibilityFilter = 158;
	private static final int responsibilitySize = 10;

	public static final int despatchHeldFilter = 159;
	private static final int despatchHeldSize = 1;

	public static final int creditControllerFilter = 160;
	private static final int creditControllerSize = 3;

	public static final int reminderLettersFilter = 161;
	private static final int reminderLettersSize = 1;

	public static final int severityDays1Filter = 162;

	public static final int severityDays2Filter = 163;

	public static final int severityDays3Filter = 164;

	public static final int severityDays4Filter = 165;

	public static final int severityDays5Filter = 166;

	public static final int severityDays6Filter = 167;

	public static final int deliveryReasonFilter = 168;
	private static final int deliveryReasonSize = 10;

	public static final int shipperCode1Filter = 169;
	private static final int shipperCode1Size = 10;

	public static final int shipperCode2Filter = 170;
	private static final int shipperCode2Size = 10;

	public static final int shipperCode3Filter = 171;
	private static final int shipperCode3Size = 10;

	public static final int shippingNoteIndFilter = 172;
	private static final int shippingNoteIndSize = 1;

	public static final int accountTypeFilter = 173;
	private static final int accountTypeSize = 3;

	public static final int adminFeeFilter = 174;
	private static final int adminFeeSize = 20;

	public static final int intrestRateFilter = 175;
	private static final int intrestRateSize = 20;

	public void deConstruct() {
		auxDMO = new AuxCustomersDMO(auxTitle, auxFirstname, auxInvoiceAddrid,
				bankName, bankAddr1, bankAddr2, bankAcName, ref, bankScode,
				bankAcNo, bankAcType, bankPayType, auxPrefDebitDay, billAcNo,
				protectCode, handsetCt, bankDate, confDate, auxComment,
				dateOfBirth, refPayDate, acClosDate, noReasDate, remLetDate,
				acTranDate, noAcDate, srFlag, processed, packageCode,
				auxAccountType, auxBillCycle, creditCardNo, creditCardName,
				expiryDate, auxCardCvvNo, creditScore, servProvId, dealerId,
				salesman, idNumber, accStatus, compRegNo, stationaryType,
				maxNoSubs, auxCurrency, auxCountryCode, auxGender,
				auxSubGrpAccNo, auxPrepaidStat, auxCreditClass,
				auxAutoLimitInd, auxLmtUpVal, auxLmtDnVal, auxAnalysis1,
				auxAnalysis2, auxAnalysis3, auxAnalysis4, auxAnalysis5,
				auxAnalysis6, auxAnalysis7, auxAnalysis8, auxAnalysis9,
				auxAnalysis10, auxAnalysis11, auxAnalysis12, auxAnalysis13,
				auxAnalysis14, auxAnalysis15, auxAnalysis16, auxAnalysis17,
				auxAnalysis18, auxAnalysis19, auxAnalysis20, auxAnalysis21,
				auxAnalysis22, auxAnalysis23, auxAnalysis24, auxAnalysis25,
				auxAnalysis26, auxAnalysis27, auxAnalysis28, auxAnalysis29,
				auxAnalysis30);
		
		slcustDMO = new SlcustmDMO(customer, alpha, auxFirstname, address1,
				address2, address3, address4, address5, creditCategory,
				exportIndicator, custDiscCode, auxCurrency, territory, klass,
				region, invoiceCustomer, statementCustomer, groupCustomer,
				dateLastIssue, dateCreated, analysisCodes1, analysisCodes2,
				analysisCodes3, analysisCodes4, analysisCodes5, reminderCat,
				settlementCode, settDaysCode, priceList, letterCode,
				balanceFwd, creditLimit, ytdSales, ytdCostOfSales,
				cumulativeSales, orderBalance, salesNlCat, specialPrice,
				vatRegistration, directDebit, invoicesPrinted, consolidatedInv,
				commentOnlyInv, bankAccountNo, bankSortCode, bankname,
				bankAddress1, bankAddress2, bankAddress3, bankAddress4,
				analysisCode6, produceStatements, ediCustomer, vatType,
				language, deliveryMethod, carrier, vatRegNumber, vatExeNumber,
				paydays1, paydays2, paydays3, bankBranchCode, printCpWithStat,
				paymentMethod, customerClass, salesType, cpLowerValue,
				address6, fax, telex, btx, cpCharge, controlDigit, payer,
				responsibility, despatchHeld, creditController,
				reminderLetters, severityDays1, severityDays2, severityDays3,
				severityDays4, severityDays5, severityDays6, deliveryReason,
				shipperCode1, shipperCode2, shipperCode3, shippingNoteInd,
				accountType, adminFee, intrestRate);
	}

	public AuxSlcustmDQO() {
	};

	public AuxSlcustmDQO(final String auxTitle, final String auxFirstname,
			final Integer auxInvoiceAddrid, final String bankName,
			final String bankAddr1, final String bankAddr2,
			final String bankAcName, final String ref, final String bankScode,
			final String bankAcNo, final String bankAcType,
			final String bankPayType, final Short auxPrefDebitDay,
			final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate,
			final String auxComment, final Date dateOfBirth,
			final Date refPayDate, final Date acClosDate,
			final Date noReasDate, final Date remLetDate,
			final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode,
			final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName,
			final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId,
			final String dealerId, final String salesman,
			final String idNumber, final String accStatus,
			final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency,
			final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat,
			final String auxCreditClass, final String auxAutoLimitInd,
			final Short auxLmtUpVal, final Short auxLmtDnVal,
			final String auxAnalysis1, final String auxAnalysis2,
			final String auxAnalysis3, final String auxAnalysis4,
			final String auxAnalysis5, final String auxAnalysis6,
			final String auxAnalysis7, final String auxAnalysis8,
			final String auxAnalysis9, final String auxAnalysis10,
			final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14,
			final String auxAnalysis15, final String auxAnalysis16,
			final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20,
			final String auxAnalysis21, final String auxAnalysis22,
			final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26,
			final String auxAnalysis27, final String auxAnalysis28,
			final String auxAnalysis29, final String auxAnalysis30,
			final String customer, final String alpha, final String name,
			final String address1, final String address2,
			final String address3, final String address4,
			final String address5, final String creditCategory,
			final String exportIndicator, final String custDiscCode,
			final String currency, final String territory, final String klass,
			final String region, final String invoiceCustomer,
			final String statementCustomer, final String groupCustomer,
			final Date dateLastIssue, final Date dateCreated,
			final String analysisCodes1, final String analysisCodes2,
			final String analysisCodes3, final String analysisCodes4,
			final String analysisCodes5, final String reminderCat,
			final String settlementCode, final String settDaysCode,
			final String priceList, final String letterCode,
			final String balanceFwd, final BigDecimal creditLimit,
			final BigDecimal ytdSales, final BigDecimal ytdCostOfSales,
			final BigDecimal cumulativeSales, final BigDecimal orderBalance,
			final String salesNlCat, final String specialPrice,
			final String vatRegistration, final String directDebit,
			final String invoicesPrinted, final String consolidatedInv,
			final String commentOnlyInv, final String bankAccountNo,
			final String bankSortCode, final String bankname,
			final String bankAddress1, final String bankAddress2,
			final String bankAddress3, final String bankAddress4,
			final String analysisCode6, final String produceStatements,
			final String ediCustomer, final String vatType,
			final String language, final String deliveryMethod,
			final String carrier, final String vatRegNumber,
			final String vatExeNumber, final String paydays1,
			final String paydays2, final String paydays3,
			final String bankBranchCode, final String printCpWithStat,
			final String paymentMethod, final String customerClass,
			final String salesType, final BigDecimal cpLowerValue,
			final String address6, final String fax, final String telex,
			final String btx, final String cpCharge, final String controlDigit,
			final String payer, final String responsibility,
			final String despatchHeld, final String creditController,
			final String reminderLetters, final Integer severityDays1,
			final Integer severityDays2, final Integer severityDays3,
			final Integer severityDays4, final Integer severityDays5,
			final Integer severityDays6, final String deliveryReason,
			final String shipperCode1, final String shipperCode2,
			final String shipperCode3, final String shippingNoteInd,
			final String accountType, final String adminFee,
			final String intrestRate) {

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
		this.customer = customer;
		this.alpha = alpha;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.address5 = address5;
		this.creditCategory = creditCategory;
		this.exportIndicator = exportIndicator;
		this.custDiscCode = custDiscCode;
		this.currency = currency;
		this.territory = territory;
		this.klass = klass;
		this.region = region;
		this.invoiceCustomer = invoiceCustomer;
		this.statementCustomer = statementCustomer;
		this.groupCustomer = groupCustomer;
		this.dateLastIssue = dateLastIssue;
		this.dateCreated = dateCreated;
		this.analysisCodes1 = analysisCodes1;
		this.analysisCodes2 = analysisCodes2;
		this.analysisCodes3 = analysisCodes3;
		this.analysisCodes4 = analysisCodes4;
		this.analysisCodes5 = analysisCodes5;
		this.reminderCat = reminderCat;
		this.settlementCode = settlementCode;
		this.settDaysCode = settDaysCode;
		this.priceList = priceList;
		this.letterCode = letterCode;
		this.balanceFwd = balanceFwd;
		this.creditLimit = creditLimit;
		this.ytdSales = ytdSales;
		this.ytdCostOfSales = ytdCostOfSales;
		this.cumulativeSales = cumulativeSales;
		this.orderBalance = orderBalance;
		this.salesNlCat = salesNlCat;
		this.specialPrice = specialPrice;
		this.vatRegistration = vatRegistration;
		this.directDebit = directDebit;
		this.invoicesPrinted = invoicesPrinted;
		this.consolidatedInv = consolidatedInv;
		this.commentOnlyInv = commentOnlyInv;
		this.bankAccountNo = bankAccountNo;
		this.bankSortCode = bankSortCode;
		this.bankname = bankname;
		this.bankAddress1 = bankAddress1;
		this.bankAddress2 = bankAddress2;
		this.bankAddress3 = bankAddress3;
		this.bankAddress4 = bankAddress4;
		this.analysisCode6 = analysisCode6;
		this.produceStatements = produceStatements;
		this.ediCustomer = ediCustomer;
		this.vatType = vatType;
		this.language = language;
		this.deliveryMethod = deliveryMethod;
		this.carrier = carrier;
		this.vatRegNumber = vatRegNumber;
		this.vatExeNumber = vatExeNumber;
		this.paydays1 = paydays1;
		this.paydays2 = paydays2;
		this.paydays3 = paydays3;
		this.bankBranchCode = bankBranchCode;
		this.printCpWithStat = printCpWithStat;
		this.paymentMethod = paymentMethod;
		this.customerClass = customerClass;
		this.salesType = salesType;
		this.cpLowerValue = cpLowerValue;
		this.address6 = address6;
		this.fax = fax;
		this.telex = telex;
		this.btx = btx;
		this.cpCharge = cpCharge;
		this.controlDigit = controlDigit;
		this.payer = payer;
		this.responsibility = responsibility;
		this.despatchHeld = despatchHeld;
		this.creditController = creditController;
		this.reminderLetters = reminderLetters;
		this.severityDays1 = severityDays1;
		this.severityDays2 = severityDays2;
		this.severityDays3 = severityDays3;
		this.severityDays4 = severityDays4;
		this.severityDays5 = severityDays5;
		this.severityDays6 = severityDays6;
		this.deliveryReason = deliveryReason;
		this.shipperCode1 = shipperCode1;
		this.shipperCode2 = shipperCode2;
		this.shipperCode3 = shipperCode3;
		this.shippingNoteInd = shippingNoteInd;
		this.accountType = accountType;
		this.adminFee = adminFee;
		this.intrestRate = intrestRate;
	};

	private static final int[] fieldSizes = new int[] { auxTitleSize,
			auxFirstnameSize, 0, bankNameSize, bankAddr1Size, bankAddr2Size,
			bankAcNameSize, refSize, bankScodeSize, bankAcNoSize,
			bankAcTypeSize, bankPayTypeSize, 0, billAcNoSize, protectCodeSize,
			0, 0, 0, auxCommentSize, 0, 0, 0, 0, 0, 0, 0, srFlagSize,
			processedSize, packageCodeSize, auxAccountTypeSize,
			auxBillCycleSize, creditCardNoSize, creditCardNameSize, 0,
			auxCardCvvNoSize, 0, 0, dealerIdSize, salesmanSize, idNumberSize,
			accStatusSize, compRegNoSize, stationaryTypeSize, 0,
			auxCurrencySize, auxCountryCodeSize, auxGenderSize,
			auxSubGrpAccNoSize, auxPrepaidStatSize, auxCreditClassSize,
			auxAutoLimitIndSize, 0, 0, auxAnalysis1Size, auxAnalysis2Size,
			auxAnalysis3Size, auxAnalysis4Size, auxAnalysis5Size,
			auxAnalysis6Size, auxAnalysis7Size, auxAnalysis8Size,
			auxAnalysis9Size, auxAnalysis10Size, auxAnalysis11Size,
			auxAnalysis12Size, auxAnalysis13Size, auxAnalysis14Size,
			auxAnalysis15Size, auxAnalysis16Size, auxAnalysis17Size,
			auxAnalysis18Size, auxAnalysis19Size, auxAnalysis20Size,
			auxAnalysis21Size, auxAnalysis22Size, auxAnalysis23Size,
			auxAnalysis24Size, auxAnalysis25Size, auxAnalysis26Size,
			auxAnalysis27Size, auxAnalysis28Size, auxAnalysis29Size,
			auxAnalysis30Size, customerSize, alphaSize, nameSize, address1Size,
			address2Size, address3Size, address4Size, address5Size,
			creditCategorySize, exportIndicatorSize, custDiscCodeSize,
			currencySize, territorySize, klassSize, regionSize,
			invoiceCustomerSize, statementCustomerSize, groupCustomerSize, 0,
			0, analysisCodes1Size, analysisCodes2Size, analysisCodes3Size,
			analysisCodes4Size, analysisCodes5Size, reminderCatSize,
			settlementCodeSize, settDaysCodeSize, priceListSize,
			letterCodeSize, balanceFwdSize, 0, 0, 0, 0, 0, salesNlCatSize,
			specialPriceSize, vatRegistrationSize, directDebitSize,
			invoicesPrintedSize, consolidatedInvSize, commentOnlyInvSize,
			bankAccountNoSize, bankSortCodeSize, banknameSize,
			bankAddress1Size, bankAddress2Size, bankAddress3Size,
			bankAddress4Size, analysisCode6Size, produceStatementsSize,
			ediCustomerSize, vatTypeSize, languageSize, deliveryMethodSize,
			carrierSize, vatRegNumberSize, vatExeNumberSize, paydays1Size,
			paydays2Size, paydays3Size, bankBranchCodeSize,
			printCpWithStatSize, paymentMethodSize, customerClassSize,
			salesTypeSize, 0, address6Size, faxSize, telexSize, btxSize,
			cpChargeSize, controlDigitSize, payerSize, responsibilitySize,
			despatchHeldSize, creditControllerSize, reminderLettersSize, 0, 0,
			0, 0, 0, 0, deliveryReasonSize, shipperCode1Size, shipperCode2Size,
			shipperCode3Size, shippingNoteIndSize, accountTypeSize,
			adminFeeSize, intrestRateSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
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
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
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
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.auxTitle == null) ? null
						: (this.auxTitle.length() <= auxTitleSize) ? this.auxTitle
								: this.auxTitle.substring(0, this.auxTitleSize)),
				((this.auxFirstname == null) ? null : (this.auxFirstname
						.length() <= auxFirstnameSize) ? this.auxFirstname
						: this.auxFirstname.substring(0, this.auxFirstnameSize)),
				this.auxInvoiceAddrid,
				((this.bankName == null) ? null
						: (this.bankName.length() <= bankNameSize) ? this.bankName
								: this.bankName.substring(0, this.bankNameSize)),
				((this.bankAddr1 == null) ? null
						: (this.bankAddr1.length() <= bankAddr1Size) ? this.bankAddr1
								: this.bankAddr1.substring(0,
										this.bankAddr1Size)),
				((this.bankAddr2 == null) ? null
						: (this.bankAddr2.length() <= bankAddr2Size) ? this.bankAddr2
								: this.bankAddr2.substring(0,
										this.bankAddr2Size)),
				((this.bankAcName == null) ? null
						: (this.bankAcName.length() <= bankAcNameSize) ? this.bankAcName
								: this.bankAcName.substring(0,
										this.bankAcNameSize)),
				((this.ref == null) ? null
						: (this.ref.length() <= refSize) ? this.ref : this.ref
								.substring(0, this.refSize)),
				((this.bankScode == null) ? null
						: (this.bankScode.length() <= bankScodeSize) ? this.bankScode
								: this.bankScode.substring(0,
										this.bankScodeSize)),
				((this.bankAcNo == null) ? null
						: (this.bankAcNo.length() <= bankAcNoSize) ? this.bankAcNo
								: this.bankAcNo.substring(0, this.bankAcNoSize)),
				((this.bankAcType == null) ? null
						: (this.bankAcType.length() <= bankAcTypeSize) ? this.bankAcType
								: this.bankAcType.substring(0,
										this.bankAcTypeSize)),
				((this.bankPayType == null) ? null
						: (this.bankPayType.length() <= bankPayTypeSize) ? this.bankPayType
								: this.bankPayType.substring(0,
										this.bankPayTypeSize)),
				this.auxPrefDebitDay,
				((this.billAcNo == null) ? null
						: (this.billAcNo.length() <= billAcNoSize) ? this.billAcNo
								: this.billAcNo.substring(0, this.billAcNoSize)),
				((this.protectCode == null) ? null
						: (this.protectCode.length() <= protectCodeSize) ? this.protectCode
								: this.protectCode.substring(0,
										this.protectCodeSize)),
				this.handsetCt,
				this.bankDate,
				this.confDate,
				((this.auxComment == null) ? null
						: (this.auxComment.length() <= auxCommentSize) ? this.auxComment
								: this.auxComment.substring(0,
										this.auxCommentSize)),
				this.dateOfBirth,
				this.refPayDate,
				this.acClosDate,
				this.noReasDate,
				this.remLetDate,
				this.acTranDate,
				this.noAcDate,
				((this.srFlag == null) ? null
						: (this.srFlag.length() <= srFlagSize) ? this.srFlag
								: this.srFlag.substring(0, this.srFlagSize)),
				((this.processed == null) ? null
						: (this.processed.length() <= processedSize) ? this.processed
								: this.processed.substring(0,
										this.processedSize)),
				((this.packageCode == null) ? null
						: (this.packageCode.length() <= packageCodeSize) ? this.packageCode
								: this.packageCode.substring(0,
										this.packageCodeSize)),
				((this.auxAccountType == null) ? null : (this.auxAccountType
						.length() <= auxAccountTypeSize) ? this.auxAccountType
						: this.auxAccountType.substring(0,
								this.auxAccountTypeSize)),
				((this.auxBillCycle == null) ? null : (this.auxBillCycle
						.length() <= auxBillCycleSize) ? this.auxBillCycle
						: this.auxBillCycle.substring(0, this.auxBillCycleSize)),
				((this.creditCardNo == null) ? null : (this.creditCardNo
						.length() <= creditCardNoSize) ? this.creditCardNo
						: this.creditCardNo.substring(0, this.creditCardNoSize)),
				((this.creditCardName == null) ? null : (this.creditCardName
						.length() <= creditCardNameSize) ? this.creditCardName
						: this.creditCardName.substring(0,
								this.creditCardNameSize)),
				this.expiryDate,
				((this.auxCardCvvNo == null) ? null : (this.auxCardCvvNo
						.length() <= auxCardCvvNoSize) ? this.auxCardCvvNo
						: this.auxCardCvvNo.substring(0, this.auxCardCvvNoSize)),
				this.creditScore,
				this.servProvId,
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
								: this.accStatus.substring(0,
										this.accStatusSize)),
				((this.compRegNo == null) ? null
						: (this.compRegNo.length() <= compRegNoSize) ? this.compRegNo
								: this.compRegNo.substring(0,
										this.compRegNoSize)),
				((this.stationaryType == null) ? null : (this.stationaryType
						.length() <= stationaryTypeSize) ? this.stationaryType
						: this.stationaryType.substring(0,
								this.stationaryTypeSize)),
				this.maxNoSubs,
				((this.auxCurrency == null) ? null
						: (this.auxCurrency.length() <= auxCurrencySize) ? this.auxCurrency
								: this.auxCurrency.substring(0,
										this.auxCurrencySize)),
				((this.auxCountryCode == null) ? null : (this.auxCountryCode
						.length() <= auxCountryCodeSize) ? this.auxCountryCode
						: this.auxCountryCode.substring(0,
								this.auxCountryCodeSize)),
				((this.auxGender == null) ? null
						: (this.auxGender.length() <= auxGenderSize) ? this.auxGender
								: this.auxGender.substring(0,
										this.auxGenderSize)),
				((this.auxSubGrpAccNo == null) ? null : (this.auxSubGrpAccNo
						.length() <= auxSubGrpAccNoSize) ? this.auxSubGrpAccNo
						: this.auxSubGrpAccNo.substring(0,
								this.auxSubGrpAccNoSize)),
				((this.auxPrepaidStat == null) ? null : (this.auxPrepaidStat
						.length() <= auxPrepaidStatSize) ? this.auxPrepaidStat
						: this.auxPrepaidStat.substring(0,
								this.auxPrepaidStatSize)),
				((this.auxCreditClass == null) ? null : (this.auxCreditClass
						.length() <= auxCreditClassSize) ? this.auxCreditClass
						: this.auxCreditClass.substring(0,
								this.auxCreditClassSize)),
				((this.auxAutoLimitInd == null) ? null
						: (this.auxAutoLimitInd.length() <= auxAutoLimitIndSize) ? this.auxAutoLimitInd
								: this.auxAutoLimitInd.substring(0,
										this.auxAutoLimitIndSize)),
				this.auxLmtUpVal,
				this.auxLmtDnVal,
				((this.auxAnalysis1 == null) ? null : (this.auxAnalysis1
						.length() <= auxAnalysis1Size) ? this.auxAnalysis1
						: this.auxAnalysis1.substring(0, this.auxAnalysis1Size)),
				((this.auxAnalysis2 == null) ? null : (this.auxAnalysis2
						.length() <= auxAnalysis2Size) ? this.auxAnalysis2
						: this.auxAnalysis2.substring(0, this.auxAnalysis2Size)),
				((this.auxAnalysis3 == null) ? null : (this.auxAnalysis3
						.length() <= auxAnalysis3Size) ? this.auxAnalysis3
						: this.auxAnalysis3.substring(0, this.auxAnalysis3Size)),
				((this.auxAnalysis4 == null) ? null : (this.auxAnalysis4
						.length() <= auxAnalysis4Size) ? this.auxAnalysis4
						: this.auxAnalysis4.substring(0, this.auxAnalysis4Size)),
				((this.auxAnalysis5 == null) ? null : (this.auxAnalysis5
						.length() <= auxAnalysis5Size) ? this.auxAnalysis5
						: this.auxAnalysis5.substring(0, this.auxAnalysis5Size)),
				((this.auxAnalysis6 == null) ? null : (this.auxAnalysis6
						.length() <= auxAnalysis6Size) ? this.auxAnalysis6
						: this.auxAnalysis6.substring(0, this.auxAnalysis6Size)),
				((this.auxAnalysis7 == null) ? null : (this.auxAnalysis7
						.length() <= auxAnalysis7Size) ? this.auxAnalysis7
						: this.auxAnalysis7.substring(0, this.auxAnalysis7Size)),
				((this.auxAnalysis8 == null) ? null : (this.auxAnalysis8
						.length() <= auxAnalysis8Size) ? this.auxAnalysis8
						: this.auxAnalysis8.substring(0, this.auxAnalysis8Size)),
				((this.auxAnalysis9 == null) ? null : (this.auxAnalysis9
						.length() <= auxAnalysis9Size) ? this.auxAnalysis9
						: this.auxAnalysis9.substring(0, this.auxAnalysis9Size)),
				((this.auxAnalysis10 == null) ? null : (this.auxAnalysis10
						.length() <= auxAnalysis10Size) ? this.auxAnalysis10
						: this.auxAnalysis10.substring(0,
								this.auxAnalysis10Size)),
				((this.auxAnalysis11 == null) ? null : (this.auxAnalysis11
						.length() <= auxAnalysis11Size) ? this.auxAnalysis11
						: this.auxAnalysis11.substring(0,
								this.auxAnalysis11Size)),
				((this.auxAnalysis12 == null) ? null : (this.auxAnalysis12
						.length() <= auxAnalysis12Size) ? this.auxAnalysis12
						: this.auxAnalysis12.substring(0,
								this.auxAnalysis12Size)),
				((this.auxAnalysis13 == null) ? null : (this.auxAnalysis13
						.length() <= auxAnalysis13Size) ? this.auxAnalysis13
						: this.auxAnalysis13.substring(0,
								this.auxAnalysis13Size)),
				((this.auxAnalysis14 == null) ? null : (this.auxAnalysis14
						.length() <= auxAnalysis14Size) ? this.auxAnalysis14
						: this.auxAnalysis14.substring(0,
								this.auxAnalysis14Size)),
				((this.auxAnalysis15 == null) ? null : (this.auxAnalysis15
						.length() <= auxAnalysis15Size) ? this.auxAnalysis15
						: this.auxAnalysis15.substring(0,
								this.auxAnalysis15Size)),
				((this.auxAnalysis16 == null) ? null : (this.auxAnalysis16
						.length() <= auxAnalysis16Size) ? this.auxAnalysis16
						: this.auxAnalysis16.substring(0,
								this.auxAnalysis16Size)),
				((this.auxAnalysis17 == null) ? null : (this.auxAnalysis17
						.length() <= auxAnalysis17Size) ? this.auxAnalysis17
						: this.auxAnalysis17.substring(0,
								this.auxAnalysis17Size)),
				((this.auxAnalysis18 == null) ? null : (this.auxAnalysis18
						.length() <= auxAnalysis18Size) ? this.auxAnalysis18
						: this.auxAnalysis18.substring(0,
								this.auxAnalysis18Size)),
				((this.auxAnalysis19 == null) ? null : (this.auxAnalysis19
						.length() <= auxAnalysis19Size) ? this.auxAnalysis19
						: this.auxAnalysis19.substring(0,
								this.auxAnalysis19Size)),
				((this.auxAnalysis20 == null) ? null : (this.auxAnalysis20
						.length() <= auxAnalysis20Size) ? this.auxAnalysis20
						: this.auxAnalysis20.substring(0,
								this.auxAnalysis20Size)),
				((this.auxAnalysis21 == null) ? null : (this.auxAnalysis21
						.length() <= auxAnalysis21Size) ? this.auxAnalysis21
						: this.auxAnalysis21.substring(0,
								this.auxAnalysis21Size)),
				((this.auxAnalysis22 == null) ? null : (this.auxAnalysis22
						.length() <= auxAnalysis22Size) ? this.auxAnalysis22
						: this.auxAnalysis22.substring(0,
								this.auxAnalysis22Size)),
				((this.auxAnalysis23 == null) ? null : (this.auxAnalysis23
						.length() <= auxAnalysis23Size) ? this.auxAnalysis23
						: this.auxAnalysis23.substring(0,
								this.auxAnalysis23Size)),
				((this.auxAnalysis24 == null) ? null : (this.auxAnalysis24
						.length() <= auxAnalysis24Size) ? this.auxAnalysis24
						: this.auxAnalysis24.substring(0,
								this.auxAnalysis24Size)),
				((this.auxAnalysis25 == null) ? null : (this.auxAnalysis25
						.length() <= auxAnalysis25Size) ? this.auxAnalysis25
						: this.auxAnalysis25.substring(0,
								this.auxAnalysis25Size)),
				((this.auxAnalysis26 == null) ? null : (this.auxAnalysis26
						.length() <= auxAnalysis26Size) ? this.auxAnalysis26
						: this.auxAnalysis26.substring(0,
								this.auxAnalysis26Size)),
				((this.auxAnalysis27 == null) ? null : (this.auxAnalysis27
						.length() <= auxAnalysis27Size) ? this.auxAnalysis27
						: this.auxAnalysis27.substring(0,
								this.auxAnalysis27Size)),
				((this.auxAnalysis28 == null) ? null : (this.auxAnalysis28
						.length() <= auxAnalysis28Size) ? this.auxAnalysis28
						: this.auxAnalysis28.substring(0,
								this.auxAnalysis28Size)),
				((this.auxAnalysis29 == null) ? null : (this.auxAnalysis29
						.length() <= auxAnalysis29Size) ? this.auxAnalysis29
						: this.auxAnalysis29.substring(0,
								this.auxAnalysis29Size)),
				((this.auxAnalysis30 == null) ? null : (this.auxAnalysis30
						.length() <= auxAnalysis30Size) ? this.auxAnalysis30
						: this.auxAnalysis30.substring(0,
								this.auxAnalysis30Size)),
				((this.customer == null) ? null
						: (this.customer.length() <= customerSize) ? this.customer
								: this.customer.substring(0, this.customerSize)),
				((this.alpha == null) ? null
						: (this.alpha.length() <= alphaSize) ? this.alpha
								: this.alpha.substring(0, this.alphaSize)),
				((this.name == null) ? null
						: (this.name.length() <= nameSize) ? this.name
								: this.name.substring(0, this.nameSize)),
				((this.address1 == null) ? null
						: (this.address1.length() <= address1Size) ? this.address1
								: this.address1.substring(0, this.address1Size)),
				((this.address2 == null) ? null
						: (this.address2.length() <= address2Size) ? this.address2
								: this.address2.substring(0, this.address2Size)),
				((this.address3 == null) ? null
						: (this.address3.length() <= address3Size) ? this.address3
								: this.address3.substring(0, this.address3Size)),
				((this.address4 == null) ? null
						: (this.address4.length() <= address4Size) ? this.address4
								: this.address4.substring(0, this.address4Size)),
				((this.address5 == null) ? null
						: (this.address5.length() <= address5Size) ? this.address5
								: this.address5.substring(0, this.address5Size)),
				((this.creditCategory == null) ? null : (this.creditCategory
						.length() <= creditCategorySize) ? this.creditCategory
						: this.creditCategory.substring(0,
								this.creditCategorySize)),
				((this.exportIndicator == null) ? null
						: (this.exportIndicator.length() <= exportIndicatorSize) ? this.exportIndicator
								: this.exportIndicator.substring(0,
										this.exportIndicatorSize)),
				((this.custDiscCode == null) ? null : (this.custDiscCode
						.length() <= custDiscCodeSize) ? this.custDiscCode
						: this.custDiscCode.substring(0, this.custDiscCodeSize)),
				((this.currency == null) ? null
						: (this.currency.length() <= currencySize) ? this.currency
								: this.currency.substring(0, this.currencySize)),
				((this.territory == null) ? null
						: (this.territory.length() <= territorySize) ? this.territory
								: this.territory.substring(0,
										this.territorySize)),
				((this.klass == null) ? null
						: (this.klass.length() <= klassSize) ? this.klass
								: this.klass.substring(0, this.klassSize)),
				((this.region == null) ? null
						: (this.region.length() <= regionSize) ? this.region
								: this.region.substring(0, this.regionSize)),
				((this.invoiceCustomer == null) ? null
						: (this.invoiceCustomer.length() <= invoiceCustomerSize) ? this.invoiceCustomer
								: this.invoiceCustomer.substring(0,
										this.invoiceCustomerSize)),
				((this.statementCustomer == null) ? null
						: (this.statementCustomer.length() <= statementCustomerSize) ? this.statementCustomer
								: this.statementCustomer.substring(0,
										this.statementCustomerSize)),
				((this.groupCustomer == null) ? null : (this.groupCustomer
						.length() <= groupCustomerSize) ? this.groupCustomer
						: this.groupCustomer.substring(0,
								this.groupCustomerSize)),
				this.dateLastIssue,
				this.dateCreated,
				((this.analysisCodes1 == null) ? null : (this.analysisCodes1
						.length() <= analysisCodes1Size) ? this.analysisCodes1
						: this.analysisCodes1.substring(0,
								this.analysisCodes1Size)),
				((this.analysisCodes2 == null) ? null : (this.analysisCodes2
						.length() <= analysisCodes2Size) ? this.analysisCodes2
						: this.analysisCodes2.substring(0,
								this.analysisCodes2Size)),
				((this.analysisCodes3 == null) ? null : (this.analysisCodes3
						.length() <= analysisCodes3Size) ? this.analysisCodes3
						: this.analysisCodes3.substring(0,
								this.analysisCodes3Size)),
				((this.analysisCodes4 == null) ? null : (this.analysisCodes4
						.length() <= analysisCodes4Size) ? this.analysisCodes4
						: this.analysisCodes4.substring(0,
								this.analysisCodes4Size)),
				((this.analysisCodes5 == null) ? null : (this.analysisCodes5
						.length() <= analysisCodes5Size) ? this.analysisCodes5
						: this.analysisCodes5.substring(0,
								this.analysisCodes5Size)),
				((this.reminderCat == null) ? null
						: (this.reminderCat.length() <= reminderCatSize) ? this.reminderCat
								: this.reminderCat.substring(0,
										this.reminderCatSize)),
				((this.settlementCode == null) ? null : (this.settlementCode
						.length() <= settlementCodeSize) ? this.settlementCode
						: this.settlementCode.substring(0,
								this.settlementCodeSize)),
				((this.settDaysCode == null) ? null : (this.settDaysCode
						.length() <= settDaysCodeSize) ? this.settDaysCode
						: this.settDaysCode.substring(0, this.settDaysCodeSize)),
				((this.priceList == null) ? null
						: (this.priceList.length() <= priceListSize) ? this.priceList
								: this.priceList.substring(0,
										this.priceListSize)),
				((this.letterCode == null) ? null
						: (this.letterCode.length() <= letterCodeSize) ? this.letterCode
								: this.letterCode.substring(0,
										this.letterCodeSize)),
				((this.balanceFwd == null) ? null
						: (this.balanceFwd.length() <= balanceFwdSize) ? this.balanceFwd
								: this.balanceFwd.substring(0,
										this.balanceFwdSize)),
				this.creditLimit,
				this.ytdSales,
				this.ytdCostOfSales,
				this.cumulativeSales,
				this.orderBalance,
				((this.salesNlCat == null) ? null
						: (this.salesNlCat.length() <= salesNlCatSize) ? this.salesNlCat
								: this.salesNlCat.substring(0,
										this.salesNlCatSize)),
				((this.specialPrice == null) ? null : (this.specialPrice
						.length() <= specialPriceSize) ? this.specialPrice
						: this.specialPrice.substring(0, this.specialPriceSize)),
				((this.vatRegistration == null) ? null
						: (this.vatRegistration.length() <= vatRegistrationSize) ? this.vatRegistration
								: this.vatRegistration.substring(0,
										this.vatRegistrationSize)),
				((this.directDebit == null) ? null
						: (this.directDebit.length() <= directDebitSize) ? this.directDebit
								: this.directDebit.substring(0,
										this.directDebitSize)),
				((this.invoicesPrinted == null) ? null
						: (this.invoicesPrinted.length() <= invoicesPrintedSize) ? this.invoicesPrinted
								: this.invoicesPrinted.substring(0,
										this.invoicesPrintedSize)),
				((this.consolidatedInv == null) ? null
						: (this.consolidatedInv.length() <= consolidatedInvSize) ? this.consolidatedInv
								: this.consolidatedInv.substring(0,
										this.consolidatedInvSize)),
				((this.commentOnlyInv == null) ? null : (this.commentOnlyInv
						.length() <= commentOnlyInvSize) ? this.commentOnlyInv
						: this.commentOnlyInv.substring(0,
								this.commentOnlyInvSize)),
				((this.bankAccountNo == null) ? null : (this.bankAccountNo
						.length() <= bankAccountNoSize) ? this.bankAccountNo
						: this.bankAccountNo.substring(0,
								this.bankAccountNoSize)),
				((this.bankSortCode == null) ? null : (this.bankSortCode
						.length() <= bankSortCodeSize) ? this.bankSortCode
						: this.bankSortCode.substring(0, this.bankSortCodeSize)),
				((this.bankname == null) ? null
						: (this.bankname.length() <= banknameSize) ? this.bankname
								: this.bankname.substring(0, this.banknameSize)),
				((this.bankAddress1 == null) ? null : (this.bankAddress1
						.length() <= bankAddress1Size) ? this.bankAddress1
						: this.bankAddress1.substring(0, this.bankAddress1Size)),
				((this.bankAddress2 == null) ? null : (this.bankAddress2
						.length() <= bankAddress2Size) ? this.bankAddress2
						: this.bankAddress2.substring(0, this.bankAddress2Size)),
				((this.bankAddress3 == null) ? null : (this.bankAddress3
						.length() <= bankAddress3Size) ? this.bankAddress3
						: this.bankAddress3.substring(0, this.bankAddress3Size)),
				((this.bankAddress4 == null) ? null : (this.bankAddress4
						.length() <= bankAddress4Size) ? this.bankAddress4
						: this.bankAddress4.substring(0, this.bankAddress4Size)),
				((this.analysisCode6 == null) ? null : (this.analysisCode6
						.length() <= analysisCode6Size) ? this.analysisCode6
						: this.analysisCode6.substring(0,
								this.analysisCode6Size)),
				((this.produceStatements == null) ? null
						: (this.produceStatements.length() <= produceStatementsSize) ? this.produceStatements
								: this.produceStatements.substring(0,
										this.produceStatementsSize)),
				((this.ediCustomer == null) ? null
						: (this.ediCustomer.length() <= ediCustomerSize) ? this.ediCustomer
								: this.ediCustomer.substring(0,
										this.ediCustomerSize)),
				((this.vatType == null) ? null
						: (this.vatType.length() <= vatTypeSize) ? this.vatType
								: this.vatType.substring(0, this.vatTypeSize)),
				((this.language == null) ? null
						: (this.language.length() <= languageSize) ? this.language
								: this.language.substring(0, this.languageSize)),
				((this.deliveryMethod == null) ? null : (this.deliveryMethod
						.length() <= deliveryMethodSize) ? this.deliveryMethod
						: this.deliveryMethod.substring(0,
								this.deliveryMethodSize)),
				((this.carrier == null) ? null
						: (this.carrier.length() <= carrierSize) ? this.carrier
								: this.carrier.substring(0, this.carrierSize)),
				((this.vatRegNumber == null) ? null : (this.vatRegNumber
						.length() <= vatRegNumberSize) ? this.vatRegNumber
						: this.vatRegNumber.substring(0, this.vatRegNumberSize)),
				((this.vatExeNumber == null) ? null : (this.vatExeNumber
						.length() <= vatExeNumberSize) ? this.vatExeNumber
						: this.vatExeNumber.substring(0, this.vatExeNumberSize)),
				((this.paydays1 == null) ? null
						: (this.paydays1.length() <= paydays1Size) ? this.paydays1
								: this.paydays1.substring(0, this.paydays1Size)),
				((this.paydays2 == null) ? null
						: (this.paydays2.length() <= paydays2Size) ? this.paydays2
								: this.paydays2.substring(0, this.paydays2Size)),
				((this.paydays3 == null) ? null
						: (this.paydays3.length() <= paydays3Size) ? this.paydays3
								: this.paydays3.substring(0, this.paydays3Size)),
				((this.bankBranchCode == null) ? null : (this.bankBranchCode
						.length() <= bankBranchCodeSize) ? this.bankBranchCode
						: this.bankBranchCode.substring(0,
								this.bankBranchCodeSize)),
				((this.printCpWithStat == null) ? null
						: (this.printCpWithStat.length() <= printCpWithStatSize) ? this.printCpWithStat
								: this.printCpWithStat.substring(0,
										this.printCpWithStatSize)),
				((this.paymentMethod == null) ? null : (this.paymentMethod
						.length() <= paymentMethodSize) ? this.paymentMethod
						: this.paymentMethod.substring(0,
								this.paymentMethodSize)),
				((this.customerClass == null) ? null : (this.customerClass
						.length() <= customerClassSize) ? this.customerClass
						: this.customerClass.substring(0,
								this.customerClassSize)),
				((this.salesType == null) ? null
						: (this.salesType.length() <= salesTypeSize) ? this.salesType
								: this.salesType.substring(0,
										this.salesTypeSize)),
				this.cpLowerValue,
				((this.address6 == null) ? null
						: (this.address6.length() <= address6Size) ? this.address6
								: this.address6.substring(0, this.address6Size)),
				((this.fax == null) ? null
						: (this.fax.length() <= faxSize) ? this.fax : this.fax
								.substring(0, this.faxSize)),
				((this.telex == null) ? null
						: (this.telex.length() <= telexSize) ? this.telex
								: this.telex.substring(0, this.telexSize)),
				((this.btx == null) ? null
						: (this.btx.length() <= btxSize) ? this.btx : this.btx
								.substring(0, this.btxSize)),
				((this.cpCharge == null) ? null
						: (this.cpCharge.length() <= cpChargeSize) ? this.cpCharge
								: this.cpCharge.substring(0, this.cpChargeSize)),
				((this.controlDigit == null) ? null : (this.controlDigit
						.length() <= controlDigitSize) ? this.controlDigit
						: this.controlDigit.substring(0, this.controlDigitSize)),
				((this.payer == null) ? null
						: (this.payer.length() <= payerSize) ? this.payer
								: this.payer.substring(0, this.payerSize)),
				((this.responsibility == null) ? null : (this.responsibility
						.length() <= responsibilitySize) ? this.responsibility
						: this.responsibility.substring(0,
								this.responsibilitySize)),
				((this.despatchHeld == null) ? null : (this.despatchHeld
						.length() <= despatchHeldSize) ? this.despatchHeld
						: this.despatchHeld.substring(0, this.despatchHeldSize)),
				((this.creditController == null) ? null
						: (this.creditController.length() <= creditControllerSize) ? this.creditController
								: this.creditController.substring(0,
										this.creditControllerSize)),
				((this.reminderLetters == null) ? null
						: (this.reminderLetters.length() <= reminderLettersSize) ? this.reminderLetters
								: this.reminderLetters.substring(0,
										this.reminderLettersSize)),
				this.severityDays1,
				this.severityDays2,
				this.severityDays3,
				this.severityDays4,
				this.severityDays5,
				this.severityDays6,
				((this.deliveryReason == null) ? null : (this.deliveryReason
						.length() <= deliveryReasonSize) ? this.deliveryReason
						: this.deliveryReason.substring(0,
								this.deliveryReasonSize)),
				((this.shipperCode1 == null) ? null : (this.shipperCode1
						.length() <= shipperCode1Size) ? this.shipperCode1
						: this.shipperCode1.substring(0, this.shipperCode1Size)),
				((this.shipperCode2 == null) ? null : (this.shipperCode2
						.length() <= shipperCode2Size) ? this.shipperCode2
						: this.shipperCode2.substring(0, this.shipperCode2Size)),
				((this.shipperCode3 == null) ? null : (this.shipperCode3
						.length() <= shipperCode3Size) ? this.shipperCode3
						: this.shipperCode3.substring(0, this.shipperCode3Size)),
				((this.shippingNoteInd == null) ? null
						: (this.shippingNoteInd.length() <= shippingNoteIndSize) ? this.shippingNoteInd
								: this.shippingNoteInd.substring(0,
										this.shippingNoteIndSize)),
				((this.accountType == null) ? null
						: (this.accountType.length() <= accountTypeSize) ? this.accountType
								: this.accountType.substring(0,
										this.accountTypeSize)),
				((this.adminFee == null) ? null
						: (this.adminFee.length() <= adminFeeSize) ? this.adminFee
								: this.adminFee.substring(0, this.adminFeeSize)),
				((this.intrestRate == null) ? null
						: (this.intrestRate.length() <= intrestRateSize) ? this.intrestRate
								: this.intrestRate.substring(0,
										this.intrestRateSize)) };
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
		this.auxPrefDebitDay = ((Short) fields[12]);
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
		this.customer = rtrim((String) fields[83]);
		this.alpha = rtrim((String) fields[84]);
		this.name = rtrim((String) fields[85]);
		this.address1 = rtrim((String) fields[86]);
		this.address2 = rtrim((String) fields[87]);
		this.address3 = rtrim((String) fields[88]);
		this.address4 = rtrim((String) fields[89]);
		this.address5 = rtrim((String) fields[90]);
		this.creditCategory = rtrim((String) fields[91]);
		this.exportIndicator = rtrim((String) fields[92]);
		this.custDiscCode = rtrim((String) fields[93]);
		this.currency = rtrim((String) fields[94]);
		this.territory = rtrim((String) fields[95]);
		this.klass = rtrim((String) fields[96]);
		this.region = rtrim((String) fields[97]);
		this.invoiceCustomer = rtrim((String) fields[98]);
		this.statementCustomer = rtrim((String) fields[99]);
		this.groupCustomer = rtrim((String) fields[100]);
		this.dateLastIssue = ((fields[101] == null) ? null : new Date(
				fields[101]));
		this.dateCreated = ((fields[102] == null) ? null : new Date(
				fields[102]));
		this.analysisCodes1 = rtrim((String) fields[103]);
		this.analysisCodes2 = rtrim((String) fields[104]);
		this.analysisCodes3 = rtrim((String) fields[105]);
		this.analysisCodes4 = rtrim((String) fields[106]);
		this.analysisCodes5 = rtrim((String) fields[107]);
		this.reminderCat = rtrim((String) fields[108]);
		this.settlementCode = rtrim((String) fields[109]);
		this.settDaysCode = rtrim((String) fields[110]);
		this.priceList = rtrim((String) fields[111]);
		this.letterCode = rtrim((String) fields[112]);
		this.balanceFwd = rtrim((String) fields[113]);
		this.creditLimit = ((BigDecimal) fields[114]);
		this.ytdSales = ((BigDecimal) fields[115]);
		this.ytdCostOfSales = ((BigDecimal) fields[116]);
		this.cumulativeSales = ((BigDecimal) fields[117]);
		this.orderBalance = ((BigDecimal) fields[118]);
		this.salesNlCat = rtrim((String) fields[119]);
		this.specialPrice = rtrim((String) fields[120]);
		this.vatRegistration = rtrim((String) fields[121]);
		this.directDebit = rtrim((String) fields[122]);
		this.invoicesPrinted = rtrim((String) fields[123]);
		this.consolidatedInv = rtrim((String) fields[124]);
		this.commentOnlyInv = rtrim((String) fields[125]);
		this.bankAccountNo = rtrim((String) fields[126]);
		this.bankSortCode = rtrim((String) fields[127]);
		this.bankname = rtrim((String) fields[128]);
		this.bankAddress1 = rtrim((String) fields[129]);
		this.bankAddress2 = rtrim((String) fields[130]);
		this.bankAddress3 = rtrim((String) fields[131]);
		this.bankAddress4 = rtrim((String) fields[132]);
		this.analysisCode6 = rtrim((String) fields[133]);
		this.produceStatements = rtrim((String) fields[134]);
		this.ediCustomer = rtrim((String) fields[135]);
		this.vatType = rtrim((String) fields[136]);
		this.language = rtrim((String) fields[137]);
		this.deliveryMethod = rtrim((String) fields[138]);
		this.carrier = rtrim((String) fields[139]);
		this.vatRegNumber = rtrim((String) fields[140]);
		this.vatExeNumber = rtrim((String) fields[141]);
		this.paydays1 = rtrim((String) fields[142]);
		this.paydays2 = rtrim((String) fields[143]);
		this.paydays3 = rtrim((String) fields[144]);
		this.bankBranchCode = rtrim((String) fields[145]);
		this.printCpWithStat = rtrim((String) fields[146]);
		this.paymentMethod = rtrim((String) fields[147]);
		this.customerClass = rtrim((String) fields[148]);
		this.salesType = rtrim((String) fields[149]);
		this.cpLowerValue = ((BigDecimal) fields[150]);
		this.address6 = rtrim((String) fields[151]);
		this.fax = rtrim((String) fields[152]);
		this.telex = rtrim((String) fields[153]);
		this.btx = rtrim((String) fields[154]);
		this.cpCharge = rtrim((String) fields[155]);
		this.controlDigit = rtrim((String) fields[156]);
		this.payer = rtrim((String) fields[157]);
		this.responsibility = rtrim((String) fields[158]);
		this.despatchHeld = rtrim((String) fields[159]);
		this.creditController = rtrim((String) fields[160]);
		this.reminderLetters = rtrim((String) fields[161]);
		this.severityDays1 = ((Integer) fields[162]);
		this.severityDays2 = ((Integer) fields[163]);
		this.severityDays3 = ((Integer) fields[164]);
		this.severityDays4 = ((Integer) fields[165]);
		this.severityDays5 = ((Integer) fields[166]);
		this.severityDays6 = ((Integer) fields[167]);
		this.deliveryReason = rtrim((String) fields[168]);
		this.shipperCode1 = rtrim((String) fields[169]);
		this.shipperCode2 = rtrim((String) fields[170]);
		this.shipperCode3 = rtrim((String) fields[171]);
		this.shippingNoteInd = rtrim((String) fields[172]);
		this.accountType = rtrim((String) fields[173]);
		this.adminFee = rtrim((String) fields[174]);
		this.intrestRate = rtrim((String) fields[175]);
	}

	public void set(final String auxTitle, final String auxFirstname,
			final Integer auxInvoiceAddrid, final String bankName,
			final String bankAddr1, final String bankAddr2,
			final String bankAcName, final String ref, final String bankScode,
			final String bankAcNo, final String bankAcType,
			final String bankPayType, final Short auxPrefDebitDay,
			final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate,
			final String auxComment, final Date dateOfBirth,
			final Date refPayDate, final Date acClosDate,
			final Date noReasDate, final Date remLetDate,
			final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode,
			final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName,
			final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId,
			final String dealerId, final String salesman,
			final String idNumber, final String accStatus,
			final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency,
			final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat,
			final String auxCreditClass, final String auxAutoLimitInd,
			final Short auxLmtUpVal, final Short auxLmtDnVal,
			final String auxAnalysis1, final String auxAnalysis2,
			final String auxAnalysis3, final String auxAnalysis4,
			final String auxAnalysis5, final String auxAnalysis6,
			final String auxAnalysis7, final String auxAnalysis8,
			final String auxAnalysis9, final String auxAnalysis10,
			final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14,
			final String auxAnalysis15, final String auxAnalysis16,
			final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20,
			final String auxAnalysis21, final String auxAnalysis22,
			final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26,
			final String auxAnalysis27, final String auxAnalysis28,
			final String auxAnalysis29, final String auxAnalysis30,
			final String customer, final String alpha, final String name,
			final String address1, final String address2,
			final String address3, final String address4,
			final String address5, final String creditCategory,
			final String exportIndicator, final String custDiscCode,
			final String currency, final String territory, final String klass,
			final String region, final String invoiceCustomer,
			final String statementCustomer, final String groupCustomer,
			final Date dateLastIssue, final Date dateCreated,
			final String analysisCodes1, final String analysisCodes2,
			final String analysisCodes3, final String analysisCodes4,
			final String analysisCodes5, final String reminderCat,
			final String settlementCode, final String settDaysCode,
			final String priceList, final String letterCode,
			final String balanceFwd, final BigDecimal creditLimit,
			final BigDecimal ytdSales, final BigDecimal ytdCostOfSales,
			final BigDecimal cumulativeSales, final BigDecimal orderBalance,
			final String salesNlCat, final String specialPrice,
			final String vatRegistration, final String directDebit,
			final String invoicesPrinted, final String consolidatedInv,
			final String commentOnlyInv, final String bankAccountNo,
			final String bankSortCode, final String bankname,
			final String bankAddress1, final String bankAddress2,
			final String bankAddress3, final String bankAddress4,
			final String analysisCode6, final String produceStatements,
			final String ediCustomer, final String vatType,
			final String language, final String deliveryMethod,
			final String carrier, final String vatRegNumber,
			final String vatExeNumber, final String paydays1,
			final String paydays2, final String paydays3,
			final String bankBranchCode, final String printCpWithStat,
			final String paymentMethod, final String customerClass,
			final String salesType, final BigDecimal cpLowerValue,
			final String address6, final String fax, final String telex,
			final String btx, final String cpCharge, final String controlDigit,
			final String payer, final String responsibility,
			final String despatchHeld, final String creditController,
			final String reminderLetters, final Integer severityDays1,
			final Integer severityDays2, final Integer severityDays3,
			final Integer severityDays4, final Integer severityDays5,
			final Integer severityDays6, final String deliveryReason,
			final String shipperCode1, final String shipperCode2,
			final String shipperCode3, final String shippingNoteInd,
			final String accountType, final String adminFee,
			final String intrestRate) {

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
		this.customer = customer;
		this.alpha = alpha;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.address5 = address5;
		this.creditCategory = creditCategory;
		this.exportIndicator = exportIndicator;
		this.custDiscCode = custDiscCode;
		this.currency = currency;
		this.territory = territory;
		this.klass = klass;
		this.region = region;
		this.invoiceCustomer = invoiceCustomer;
		this.statementCustomer = statementCustomer;
		this.groupCustomer = groupCustomer;
		this.dateLastIssue = dateLastIssue;
		this.dateCreated = dateCreated;
		this.analysisCodes1 = analysisCodes1;
		this.analysisCodes2 = analysisCodes2;
		this.analysisCodes3 = analysisCodes3;
		this.analysisCodes4 = analysisCodes4;
		this.analysisCodes5 = analysisCodes5;
		this.reminderCat = reminderCat;
		this.settlementCode = settlementCode;
		this.settDaysCode = settDaysCode;
		this.priceList = priceList;
		this.letterCode = letterCode;
		this.balanceFwd = balanceFwd;
		this.creditLimit = creditLimit;
		this.ytdSales = ytdSales;
		this.ytdCostOfSales = ytdCostOfSales;
		this.cumulativeSales = cumulativeSales;
		this.orderBalance = orderBalance;
		this.salesNlCat = salesNlCat;
		this.specialPrice = specialPrice;
		this.vatRegistration = vatRegistration;
		this.directDebit = directDebit;
		this.invoicesPrinted = invoicesPrinted;
		this.consolidatedInv = consolidatedInv;
		this.commentOnlyInv = commentOnlyInv;
		this.bankAccountNo = bankAccountNo;
		this.bankSortCode = bankSortCode;
		this.bankname = bankname;
		this.bankAddress1 = bankAddress1;
		this.bankAddress2 = bankAddress2;
		this.bankAddress3 = bankAddress3;
		this.bankAddress4 = bankAddress4;
		this.analysisCode6 = analysisCode6;
		this.produceStatements = produceStatements;
		this.ediCustomer = ediCustomer;
		this.vatType = vatType;
		this.language = language;
		this.deliveryMethod = deliveryMethod;
		this.carrier = carrier;
		this.vatRegNumber = vatRegNumber;
		this.vatExeNumber = vatExeNumber;
		this.paydays1 = paydays1;
		this.paydays2 = paydays2;
		this.paydays3 = paydays3;
		this.bankBranchCode = bankBranchCode;
		this.printCpWithStat = printCpWithStat;
		this.paymentMethod = paymentMethod;
		this.customerClass = customerClass;
		this.salesType = salesType;
		this.cpLowerValue = cpLowerValue;
		this.address6 = address6;
		this.fax = fax;
		this.telex = telex;
		this.btx = btx;
		this.cpCharge = cpCharge;
		this.controlDigit = controlDigit;
		this.payer = payer;
		this.responsibility = responsibility;
		this.despatchHeld = despatchHeld;
		this.creditController = creditController;
		this.reminderLetters = reminderLetters;
		this.severityDays1 = severityDays1;
		this.severityDays2 = severityDays2;
		this.severityDays3 = severityDays3;
		this.severityDays4 = severityDays4;
		this.severityDays5 = severityDays5;
		this.severityDays6 = severityDays6;
		this.deliveryReason = deliveryReason;
		this.shipperCode1 = shipperCode1;
		this.shipperCode2 = shipperCode2;
		this.shipperCode3 = shipperCode3;
		this.shippingNoteInd = shippingNoteInd;
		this.accountType = accountType;
		this.adminFee = adminFee;
		this.intrestRate = intrestRate;

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

	public Short getAuxPrefDebitDay() {
		return auxPrefDebitDay;
	}

	public void setAuxPrefDebitDay(Short auxPrefDebitDay) {
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

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAlpha() {
		return alpha;
	}

	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public String getCreditCategory() {
		return creditCategory;
	}

	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

	public String getExportIndicator() {
		return exportIndicator;
	}

	public void setExportIndicator(String exportIndicator) {
		this.exportIndicator = exportIndicator;
	}

	public String getCustDiscCode() {
		return custDiscCode;
	}

	public void setCustDiscCode(String custDiscCode) {
		this.custDiscCode = custDiscCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getKlass() {
		return klass;
	}

	public void setKlass(String klass) {
		this.klass = klass;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getInvoiceCustomer() {
		return invoiceCustomer;
	}

	public void setInvoiceCustomer(String invoiceCustomer) {
		this.invoiceCustomer = invoiceCustomer;
	}

	public String getStatementCustomer() {
		return statementCustomer;
	}

	public void setStatementCustomer(String statementCustomer) {
		this.statementCustomer = statementCustomer;
	}

	public String getGroupCustomer() {
		return groupCustomer;
	}

	public void setGroupCustomer(String groupCustomer) {
		this.groupCustomer = groupCustomer;
	}

	public Date getDateLastIssue() {
		return dateLastIssue;
	}

	public void setDateLastIssue(Date dateLastIssue) {
		this.dateLastIssue = dateLastIssue;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getAnalysisCodes1() {
		return analysisCodes1;
	}

	public void setAnalysisCodes1(String analysisCodes1) {
		this.analysisCodes1 = analysisCodes1;
	}

	public String getAnalysisCodes2() {
		return analysisCodes2;
	}

	public void setAnalysisCodes2(String analysisCodes2) {
		this.analysisCodes2 = analysisCodes2;
	}

	public String getAnalysisCodes3() {
		return analysisCodes3;
	}

	public void setAnalysisCodes3(String analysisCodes3) {
		this.analysisCodes3 = analysisCodes3;
	}

	public String getAnalysisCodes4() {
		return analysisCodes4;
	}

	public void setAnalysisCodes4(String analysisCodes4) {
		this.analysisCodes4 = analysisCodes4;
	}

	public String getAnalysisCodes5() {
		return analysisCodes5;
	}

	public void setAnalysisCodes5(String analysisCodes5) {
		this.analysisCodes5 = analysisCodes5;
	}

	public String getReminderCat() {
		return reminderCat;
	}

	public void setReminderCat(String reminderCat) {
		this.reminderCat = reminderCat;
	}

	public String getSettlementCode() {
		return settlementCode;
	}

	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}

	public String getSettDaysCode() {
		return settDaysCode;
	}

	public void setSettDaysCode(String settDaysCode) {
		this.settDaysCode = settDaysCode;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

	public String getBalanceFwd() {
		return balanceFwd;
	}

	public void setBalanceFwd(String balanceFwd) {
		this.balanceFwd = balanceFwd;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getYtdSales() {
		return ytdSales;
	}

	public void setYtdSales(BigDecimal ytdSales) {
		this.ytdSales = ytdSales;
	}

	public BigDecimal getYtdCostOfSales() {
		return ytdCostOfSales;
	}

	public void setYtdCostOfSales(BigDecimal ytdCostOfSales) {
		this.ytdCostOfSales = ytdCostOfSales;
	}

	public BigDecimal getCumulativeSales() {
		return cumulativeSales;
	}

	public void setCumulativeSales(BigDecimal cumulativeSales) {
		this.cumulativeSales = cumulativeSales;
	}

	public BigDecimal getOrderBalance() {
		return orderBalance;
	}

	public void setOrderBalance(BigDecimal orderBalance) {
		this.orderBalance = orderBalance;
	}

	public String getSalesNlCat() {
		return salesNlCat;
	}

	public void setSalesNlCat(String salesNlCat) {
		this.salesNlCat = salesNlCat;
	}

	public String getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(String specialPrice) {
		this.specialPrice = specialPrice;
	}

	public String getVatRegistration() {
		return vatRegistration;
	}

	public void setVatRegistration(String vatRegistration) {
		this.vatRegistration = vatRegistration;
	}

	public String getDirectDebit() {
		return directDebit;
	}

	public void setDirectDebit(String directDebit) {
		this.directDebit = directDebit;
	}

	public String getInvoicesPrinted() {
		return invoicesPrinted;
	}

	public void setInvoicesPrinted(String invoicesPrinted) {
		this.invoicesPrinted = invoicesPrinted;
	}

	public String getConsolidatedInv() {
		return consolidatedInv;
	}

	public void setConsolidatedInv(String consolidatedInv) {
		this.consolidatedInv = consolidatedInv;
	}

	public String getCommentOnlyInv() {
		return commentOnlyInv;
	}

	public void setCommentOnlyInv(String commentOnlyInv) {
		this.commentOnlyInv = commentOnlyInv;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankSortCode() {
		return bankSortCode;
	}

	public void setBankSortCode(String bankSortCode) {
		this.bankSortCode = bankSortCode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankAddress1() {
		return bankAddress1;
	}

	public void setBankAddress1(String bankAddress1) {
		this.bankAddress1 = bankAddress1;
	}

	public String getBankAddress2() {
		return bankAddress2;
	}

	public void setBankAddress2(String bankAddress2) {
		this.bankAddress2 = bankAddress2;
	}

	public String getBankAddress3() {
		return bankAddress3;
	}

	public void setBankAddress3(String bankAddress3) {
		this.bankAddress3 = bankAddress3;
	}

	public String getBankAddress4() {
		return bankAddress4;
	}

	public void setBankAddress4(String bankAddress4) {
		this.bankAddress4 = bankAddress4;
	}

	public String getAnalysisCode6() {
		return analysisCode6;
	}

	public void setAnalysisCode6(String analysisCode6) {
		this.analysisCode6 = analysisCode6;
	}

	public String getProduceStatements() {
		return produceStatements;
	}

	public void setProduceStatements(String produceStatements) {
		this.produceStatements = produceStatements;
	}

	public String getEdiCustomer() {
		return ediCustomer;
	}

	public void setEdiCustomer(String ediCustomer) {
		this.ediCustomer = ediCustomer;
	}

	public String getVatType() {
		return vatType;
	}

	public void setVatType(String vatType) {
		this.vatType = vatType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getVatRegNumber() {
		return vatRegNumber;
	}

	public void setVatRegNumber(String vatRegNumber) {
		this.vatRegNumber = vatRegNumber;
	}

	public String getVatExeNumber() {
		return vatExeNumber;
	}

	public void setVatExeNumber(String vatExeNumber) {
		this.vatExeNumber = vatExeNumber;
	}

	public String getPaydays1() {
		return paydays1;
	}

	public void setPaydays1(String paydays1) {
		this.paydays1 = paydays1;
	}

	public String getPaydays2() {
		return paydays2;
	}

	public void setPaydays2(String paydays2) {
		this.paydays2 = paydays2;
	}

	public String getPaydays3() {
		return paydays3;
	}

	public void setPaydays3(String paydays3) {
		this.paydays3 = paydays3;
	}

	public String getBankBranchCode() {
		return bankBranchCode;
	}

	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getPrintCpWithStat() {
		return printCpWithStat;
	}

	public void setPrintCpWithStat(String printCpWithStat) {
		this.printCpWithStat = printCpWithStat;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCustomerClass() {
		return customerClass;
	}

	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}

	public String getSalesType() {
		return salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	public BigDecimal getCpLowerValue() {
		return cpLowerValue;
	}

	public void setCpLowerValue(BigDecimal cpLowerValue) {
		this.cpLowerValue = cpLowerValue;
	}

	public String getAddress6() {
		return address6;
	}

	public void setAddress6(String address6) {
		this.address6 = address6;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTelex() {
		return telex;
	}

	public void setTelex(String telex) {
		this.telex = telex;
	}

	public String getBtx() {
		return btx;
	}

	public void setBtx(String btx) {
		this.btx = btx;
	}

	public String getCpCharge() {
		return cpCharge;
	}

	public void setCpCharge(String cpCharge) {
		this.cpCharge = cpCharge;
	}

	public String getControlDigit() {
		return controlDigit;
	}

	public void setControlDigit(String controlDigit) {
		this.controlDigit = controlDigit;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getDespatchHeld() {
		return despatchHeld;
	}

	public void setDespatchHeld(String despatchHeld) {
		this.despatchHeld = despatchHeld;
	}

	public String getCreditController() {
		return creditController;
	}

	public void setCreditController(String creditController) {
		this.creditController = creditController;
	}

	public String getReminderLetters() {
		return reminderLetters;
	}

	public void setReminderLetters(String reminderLetters) {
		this.reminderLetters = reminderLetters;
	}

	public Integer getSeverityDays1() {
		return severityDays1;
	}

	public void setSeverityDays1(Integer severityDays1) {
		this.severityDays1 = severityDays1;
	}

	public Integer getSeverityDays2() {
		return severityDays2;
	}

	public void setSeverityDays2(Integer severityDays2) {
		this.severityDays2 = severityDays2;
	}

	public Integer getSeverityDays3() {
		return severityDays3;
	}

	public void setSeverityDays3(Integer severityDays3) {
		this.severityDays3 = severityDays3;
	}

	public Integer getSeverityDays4() {
		return severityDays4;
	}

	public void setSeverityDays4(Integer severityDays4) {
		this.severityDays4 = severityDays4;
	}

	public Integer getSeverityDays5() {
		return severityDays5;
	}

	public void setSeverityDays5(Integer severityDays5) {
		this.severityDays5 = severityDays5;
	}

	public Integer getSeverityDays6() {
		return severityDays6;
	}

	public void setSeverityDays6(Integer severityDays6) {
		this.severityDays6 = severityDays6;
	}

	public String getDeliveryReason() {
		return deliveryReason;
	}

	public void setDeliveryReason(String deliveryReason) {
		this.deliveryReason = deliveryReason;
	}

	public String getShipperCode1() {
		return shipperCode1;
	}

	public void setShipperCode1(String shipperCode1) {
		this.shipperCode1 = shipperCode1;
	}

	public String getShipperCode2() {
		return shipperCode2;
	}

	public void setShipperCode2(String shipperCode2) {
		this.shipperCode2 = shipperCode2;
	}

	public String getShipperCode3() {
		return shipperCode3;
	}

	public void setShipperCode3(String shipperCode3) {
		this.shipperCode3 = shipperCode3;
	}

	public String getShippingNoteInd() {
		return shippingNoteInd;
	}

	public void setShippingNoteInd(String shippingNoteInd) {
		this.shippingNoteInd = shippingNoteInd;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(String adminFee) {
		this.adminFee = adminFee;
	}

	public String getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(String intrestRate) {
		this.intrestRate = intrestRate;
	}

	public AuxCustomersDMO getAuxDMO() {
		return auxDMO;
	}

	public void setAuxDMO(AuxCustomersDMO auxDMO) {
		this.auxDMO = auxDMO;
	}

	public SlcustmDMO getSlcustDMO() {
		return slcustDMO;
	}

	public void setSlcustDMO(SlcustmDMO slcustDMO) {
		this.slcustDMO = slcustDMO;
	}

}
