package com.eppixcomm.eppix.base.resp;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "accountNumber",
		"alphaCode",
		"customerName",
		"creditCategory",
		"exportIndicator",
		"discountCode",
		"currency1",
		"territory",
		"accountType",
		"region",
		"invoiceAccount",
		"statementAccount",
		"groupReference",
		"dateLastIssue",
		"dateCreated",
		"analysisCode1",
		"analysisCode2",
		"analysisCode3",
		"analysisCode4",
		"analysisCode5",
		"reminderCategory",
		"settlementDiscount",
		"settlementDays",
		"priceList",
		"letterCode",
		"balanceForwardMethod",
		"creditLimit",
		"yearToDateSales",
		"yearToDateCostOfSales",
		"cumulativeSales",
		"orderBalance",
		"salesNominalLedgerCategory",
		"specialPrice",
		"vatRegistrationNo",
		"directDebit",
		"produceInvoicesFlag",
		"produceConsolidatedInvoicesFlag",
		"produceCommentOnlyInvoicesFlag",
		"bankAddress3",
		"bankAddress4",
		"analysisCode6",
		"produceStatmentsFlag",
		"ediCustomerFlag",
		"vatType",
		"customersLanguage",
		"deliveryMethod",
		"carrier",
		"vatRegNumber",
		"vatExeNumber",
		"paydays1",
		"paydays2",
		"paydays3",
		"bankBranchCode",
		"printCpWithStat",
		"paymentMethod",
		"customerClass",
		"salesType",
		"cpLowerValue",
		"btx",
		"cpCharge",
		"controlDigit",
		"payer",
		"responsibility",
		"despatchHeld",
		"creditController",
		"reminderLetters",
		"severityDays1",
		"severityDays2",
		"severityDays3",
		"severityDays4",
		"severityDays5",
		"severityDays6",
		"deliveryReason",
		"shipperCode1",
		"shipperCode2",
		"shipperCode3",
		"shippingNoteIndicator",
		"accType",
		"adminFee",
		"interestRate",
		"customerTitle",
		"firstName",
		"invoiceAddressId",
		"bankName",
		"bankAddress1",
		"bankAddress2",
		"bankAccountName",
		"bankRef",
		"bankSortCode",
		"bankAccountNo",
		"bankAccountType",
		"paymentType",
		"prefferedDebitDay",
		"protectCode",
		"handsetCount",
		"directDebitSubmissionDate",
		"directDebitConfirmationDate",
		"auxilaryComment",
		"dateOfBirth",
		"referToPayerDate",
		"accountTransferredDate",
		"noAccountDate",
		"reminderLetterDate",
		"noBarsDate",
		"chequeReturnedDate",
		"srFlag",
		"processedMegaDownload",
		"packageCode",
		"auxAccountType",
		"billingCycle",
		"balance",
		"creditCardNumber",
		"creditCardName",
		"expiryDate",
		"creditCardCVVNo",
		"creditScore",
		"serviceProviderID",
		"dealerID",
		"salesman",
		"IDNumber",
		"accountStatus",
		"companyRegNo",
		"stationeryType",
		"maxNoSubscribers",
		"altCurrency",
		"countryCode",
		"gender",
		"subGroupAccount",
		"prePaidStatus",
		"creditClass",
		"creditClassDescription",
		"evaluateCreditLimit",
		"creditLimitUpgrade",
		"creditLimitDowngrade",
		"creditControllerDescription",
		"creditControllerTelephone",
		"paidDeposit",
		"pendingDeposit",
		"lastDepositStatus",
		"analysis1",
		"analysis2",
		"analysis3",
		"analysis4",
		"analysis5",
		"analysis6",
		"analysis7",
		"analysis8",
		"analysis9",
		"analysis10",
		"analysis11",
		"analysis12",
		"analysis13",
		"analysis14",
		"analysis15",
		"analysis16",
		"analysis17",
		"analysis18",
		"analysis19",
		"analysis20",
		"analysis21",
		"analysis22",
		"analysis23",
		"analysis24",
		"analysis25",
		"analysis26",
		"analysis27",
		"analysis28",
		"analysis29",
		"analysis30",

		"invoiceAddressFlag_1",
		"addressID_1",
		"accountNo_1",
		"subscriberId_1",
		"addresType_1",
		"addresInDate_1",
		"addressClassification_1",
		"addressUniqueID_1",
		"addressName_1",
		"addressLine1_1",
		"addressLine2_1",
		"addressLine3_1",
		"addressLine4_1",
		"addressLine5_1",
		"addressLine6_1",
		"addressPostCode_1",
		"addressTelephone_1",
		"addressTelephone2_1",
		"addressFax_1",
		"addressContact_1",
		"addressEMail_1",
		"adressNotes_1",
		"addressGeneral1_1",
		"addressGeneral2_1",
		"addressGeneral3_1",
		"invoiceAddressFlag_2",
		"addressID_2",
		"accountNo_2",
		"subscriberId_2",
		"addresType_2",
		"addresInDate_2",
		"addressClassification_2",
		"addressUniqueID_2",
		"addressName_2",
		"addressLine1_2",
		"addressLine2_2",
		"addressLine3_2",
		"addressLine4_2",
		"addressLine5_2",
		"addressLine6_2",
		"addressPostCode_2",
		"addressTelephone_2",
		"addressTelephone2_2",
		"addressFax_2",
		"addressContact_2",
		"addressEMail_2",
		"adressNotes_2",
		"addressGeneral1_2",
		"addressGeneral2_2",
		"addressGeneral3_2",
		"invoiceAddressFlag_3",
		"addressID_3",
		"accountNo_3",
		"subscriberId_3",
		"addresType_3",
		"addresInDate_3",
		"addressClassification_3",
		"addressUniqueID_3",
		"addressName_3",
		"addressLine1_3",
		"addressLine2_3",
		"addressLine3_3",
		"addressLine4_3",
		"addressLine5_3",
		"addressLine6_3",
		"addressPostCode_3",
		"addressTelephone_3",
		"addressTelephone2_3",
		"addressFax_3",
		"addressContact_3",
		"addressEMail_3",
		"adressNotes_3",
		"addressGeneral1_3",
		"addressGeneral2_3",
		"addressGeneral3_3",
		"invoiceAddressFlag_4",
		"addressID_4",
		"accountNo_4",
		"subscriberId_4",
		"addresType_4",
		"addresInDate_4",
		"addressClassification_4",
		"addressUniqueID_4",
		"addressName_4",
		"addressLine1_4",
		"addressLine2_4",
		"addressLine3_4",
		"addressLine4_4",
		"addressLine5_4",
		"addressLine6_4",
		"addressPostCode_4",
		"addressTelephone_4",
		"addressTelephone2_4",
		"addressFax_4",
		"addressContact_4",
		"addressEMail_4",
		"adressNotes_4",
		"addressGeneral1_4",
		"addressGeneral2_4",
		"addressGeneral3_4",
		"invoiceAddressFlag_5",
		"addressID_5",
		"accountNo_5",
		"subscriberId_5",
		"addresType_5",
		"addresInDate_5",
		"addressClassification_5",
		"addressUniqueID_5",
		"addressName_5",
		"addressLine1_5",
		"addressLine2_5",
		"addressLine3_5",
		"addressLine4_5",
		"addressLine5_5",
		"addressLine6_5",
		"addressPostCode_5",
		"addressTelephone_5",
		"addressTelephone2_5",
		"addressFax_5",
		"addressContact_5",
		"addressEMail_5",
		"adressNotes_5",
		"addressGeneral1_5",
		"addressGeneral2_5",
		"addressGeneral3_5",
		"invoiceAddressFlag_6",
		"addressID_6",
		"accountNo_6",
		"subscriberId_6",
		"addresType_6",
		"addresInDate_6",
		"addressClassification_6",
		"addressUniqueID_6",
		"addressName_6",
		"addressLine1_6",
		"addressLine2_6",
		"addressLine3_6",
		"addressLine4_6",
		"addressLine5_6",
		"addressLine6_6",
		"addressPostCode_6",
		"addressTelephone_6",
		"addressTelephone2_6",
		"addressFax_6",
		"addressContact_6",
		"addressEMail_6",
		"adressNotes_6",
		"addressGeneral1_6",
		"addressGeneral2_6",
		"addressGeneral3_6",
		"invoiceAddressFlag_7",
		"addressID_7",
		"accountNo_7",
		"subscriberId_7",
		"addresType_7",
		"addresInDate_7",
		"addressClassification_7",
		"addressUniqueID_7",
		"addressName_7",
		"addressLine1_7",
		"addressLine2_7",
		"addressLine3_7",
		"addressLine4_7",
		"addressLine5_7",
		"addressLine6_7",
		"addressPostCode_7",
		"addressTelephone_7",
		"addressTelephone2_7",
		"addressFax_7",
		"addressContact_7",
		"addressEMail_7",
		"adressNotes_7",
		"addressGeneral1_7",
		"addressGeneral2_7",
		"addressGeneral3_7",
		"invoiceAddressFlag_8",
		"addressID_8",
		"accountNo_8",
		"subscriberId_8",
		"addresType_8",
		"addresInDate_8",
		"addressClassification_8",
		"addressUniqueID_8",
		"addressName_8",
		"addressLine1_8",
		"addressLine2_8",
		"addressLine3_8",
		"addressLine4_8",
		"addressLine5_8",
		"addressLine6_8",
		"addressPostCode_8",
		"addressTelephone_8",
		"addressTelephone2_8",
		"addressFax_8",
		"addressContact_8",
		"addressEMail_8",
		"adressNotes_8",
		"addressGeneral1_8",
		"addressGeneral2_8",
		"addressGeneral3_8",
		"invoiceAddressFlag_9",
		"addressID_9",
		"accountNo_9",
		"subscriberId_9",
		"addresType_9",
		"addresInDate_9",
		"addressClassification_9",
		"addressUniqueID_9",
		"addressName_9",
		"addressLine1_9",
		"addressLine2_9",
		"addressLine3_9",
		"addressLine4_9",
		"addressLine5_9",
		"addressLine6_9",
		"addressPostCode_9",
		"addressTelephone_9",
		"addressTelephone2_9",
		"addressFax_9",
		"addressContact_9",
		"addressEMail_9",
		"adressNotes_9",
		"addressGeneral1_9",
		"addressGeneral2_9",
		"addressGeneral3_9",
		"invoiceAddressFlag_10",
		"addressID_10",
		"accountNo_10",
		"subscriberId_10",
		"addresType_10",
		"addresInDate_10",
		"addressClassification_10",
		"addressUniqueID_10",
		"addressName_10",
		"addressLine1_10",
		"addressLine2_10",
		"addressLine3_10",
		"addressLine4_10",
		"addressLine5_10",
		"addressLine6_10",
		"addressPostCode_10",
		"addressTelephone_10",
		"addressTelephone2_10",
		"addressFax_10",
		"addressContact_10",
		"addressEMail_10",
		"adressNotes_10",
		"addressGeneral1_10",
		"addressGeneral2_10",
		"addressGeneral3_10",
		"limitMechanism",
		"minimumLimit",
		"maximumLimit",
		"CRMValue",
		"CRMKeyword",
		"CRMColour",
		"hierarchyName"})

public class CustomerGetRsp extends EppixResponse{
	private String 	CRMColour;
	private String 	CRMKeyword;
	private String 	CRMValue;
	private String 	IDNumber;
	private String 	accType;
	private String 	accountNo_1;
	private String 	accountNo_10;
	private String 	accountNo_2;
	private String 	accountNo_3;
	private String 	accountNo_4;
	private String 	accountNo_5;
	private String 	accountNo_6;
	private String 	accountNo_7;
	private String 	accountNo_8;
	private String 	accountNo_9;
	private String 	accountNumber;
	private String 	accountStatus;
	private String 	accountTransferredDate;
	private String 	accountType;
	private String 	addresInDate_1;
	private String 	addresInDate_10;
	private String 	addresInDate_2;
	private String 	addresInDate_3;
	private String 	addresInDate_4;
	private String 	addresInDate_5;
	private String 	addresInDate_6;
	private String 	addresInDate_7;
	private String 	addresInDate_8;
	private String 	addresInDate_9;
	private String 	addresType_1;
	private String 	addresType_10;
	private String 	addresType_2 ;
	private String 	addresType_3;
	private String 	addresType_4;
	private String 	addresType_5;
	private String 	addresType_6;
	private String 	addresType_7;
	private String 	addresType_8;
	private String 	addresType_9;
	private String 	addressClassification_1;
	private String 	addressClassification_10;
	private String 	addressClassification_2;
	private String 	addressClassification_3;
	private String 	addressClassification_4;
	private String 	addressClassification_5;
	private String 	addressClassification_6;
	private String 	addressClassification_7;
	private String 	addressClassification_8;
	private String 	addressClassification_9;
	private String 	addressContact_1;
	private String 	addressContact_10;
	private String 	addressContact_2;
	private String 	addressContact_3;
	private String 	addressContact_4;
	private String 	addressContact_5;
	private String 	addressContact_6;
	private String 	addressContact_7;
	private String 	addressContact_8;
	private String 	addressContact_9;
	private String 	addressEMail_1;
	private String 	addressEMail_10;
	private String 	addressEMail_2;
	private String 	addressEMail_3;
	private String 	addressEMail_4;
	private String 	addressEMail_5;
	private String 	addressEMail_6;
	private String 	addressEMail_7;
	private String 	addressEMail_8;
	private String 	addressEMail_9;
	private String 	addressFax_1;
	private String 	addressFax_10;
	private String 	addressFax_2;
	private String 	addressFax_3;
	private String 	addressFax_4;
	private String 	addressFax_5;
	private String 	addressFax_6;
	private String 	addressFax_7;
	private String 	addressFax_8;
	private String 	addressFax_9;
	private String 	addressGeneral1_1;
	private String 	addressGeneral1_10;
	private String 	addressGeneral1_2;
	private String 	addressGeneral1_3;
	private String 	addressGeneral1_4;
	private String 	addressGeneral1_5;
	private String 	addressGeneral1_6;
	private String 	addressGeneral1_7;
	private String 	addressGeneral1_8;
	private String 	addressGeneral1_9;
	private String 	addressGeneral2_1;
	private String 	addressGeneral2_10;
	private String 	addressGeneral2_2;
	private String 	addressGeneral2_3;
	private String 	addressGeneral2_4;
	private String 	addressGeneral2_5;
	private String 	addressGeneral2_6;
	private String 	addressGeneral2_7;
	private String 	addressGeneral2_8;
	private String 	addressGeneral2_9;
	private String 	addressGeneral3_1;
	private String 	addressGeneral3_10;
	private String 	addressGeneral3_2;
	private String 	addressGeneral3_3;
	private String 	addressGeneral3_4;
	private String 	addressGeneral3_5;
	private String 	addressGeneral3_6;
	private String 	addressGeneral3_7;
	private String 	addressGeneral3_8;
	private String 	addressGeneral3_9;
	private String 	addressID_1;
	private String 	addressID_10;
	private String 	addressID_2;
	private String 	addressID_3;
	private String 	addressID_4;
	private String 	addressID_5;
	private String 	addressID_6;
	private String 	addressID_7;
	private String 	addressID_8;
	private String 	addressID_9;
	private String 	addressLine1_1;
	private String 	addressLine1_10;
	private String 	addressLine1_2;
	private String 	addressLine1_3;
	private String 	addressLine1_4;
	private String 	addressLine1_5;
	private String 	addressLine1_6;
	private String 	addressLine1_7;
	private String 	addressLine1_8;
	private String 	addressLine1_9;
	private String 	addressLine2_1;
	private String 	addressLine2_10;
	private String 	addressLine2_2;
	private String 	addressLine2_3;
	private String 	addressLine2_4;
	private String 	addressLine2_5;
	private String 	addressLine2_6;
	private String 	addressLine2_7;
	private String 	addressLine2_8;
	private String 	addressLine2_9;
	private String 	addressLine3_1;
	private String 	addressLine3_10;
	private String 	addressLine3_2;
	private String 	addressLine3_3;
	private String 	addressLine3_4;
	private String 	addressLine3_5;
	private String 	addressLine3_6;
	private String 	addressLine3_7;
	private String 	addressLine3_8;
	private String 	addressLine3_9;
	private String 	addressLine4_1;
	private String 	addressLine4_10;
	private String 	addressLine4_2;
	private String 	addressLine4_3;
	private String 	addressLine4_4;
	private String 	addressLine4_5;
	private String 	addressLine4_6;
	private String 	addressLine4_7;
	private String 	addressLine4_8;
	private String 	addressLine4_9;
	private String 	addressLine5_1;
	private String 	addressLine5_10;
	private String 	addressLine5_2;
	private String 	addressLine5_3;
	private String 	addressLine5_4;
	private String 	addressLine5_5;
	private String 	addressLine5_6;
	private String 	addressLine5_7;
	private String 	addressLine5_8;
	private String 	addressLine5_9;
	private String 	addressLine6_1;
	private String 	addressLine6_10;
	private String 	addressLine6_2;
	private String 	addressLine6_3;
	private String 	addressLine6_4;
	private String 	addressLine6_5;
	private String 	addressLine6_6;
	private String 	addressLine6_7;
	private String 	addressLine6_8;
	private String 	addressLine6_9;
	private String 	addressName_1;
	private String 	addressName_10;
	private String 	addressName_2;
	private String 	addressName_3;
	private String 	addressName_4;
	private String 	addressName_5;
	private String 	addressName_6;
	private String 	addressName_7;
	private String 	addressName_8;
	private String 	addressName_9;
	private String 	addressPostCode_1;
	private String 	addressPostCode_10;
	private String 	addressPostCode_2;
	private String 	addressPostCode_3;
	private String 	addressPostCode_4;
	private String 	addressPostCode_5;
	private String 	addressPostCode_6;
	private String 	addressPostCode_7;
	private String 	addressPostCode_8;
	private String 	addressPostCode_9;
	private String 	addressTelephone2_1;
	private String 	addressTelephone2_10;
	private String 	addressTelephone2_2;
	private String 	addressTelephone2_3;
	private String 	addressTelephone2_4;
	private String 	addressTelephone2_5;
	private String 	addressTelephone2_6;
	private String 	addressTelephone2_7;
	private String 	addressTelephone2_8;
	private String 	addressTelephone2_9;
	private String 	addressTelephone_1;
	private String 	addressTelephone_10;
	private String 	addressTelephone_2;
	private String 	addressTelephone_3;
	private String 	addressTelephone_4;
	private String 	addressTelephone_5;
	private String 	addressTelephone_6;
	private String 	addressTelephone_7;
	private String 	addressTelephone_8;
	private String 	addressTelephone_9;
	private String 	addressUniqueID_1;
	private String 	addressUniqueID_10;
	private String 	addressUniqueID_2;
	private String 	addressUniqueID_3;
	private String 	addressUniqueID_4;
	private String 	addressUniqueID_5;
	private String 	addressUniqueID_6;
	private String 	addressUniqueID_7;
	private String 	addressUniqueID_8;
	private String 	addressUniqueID_9;
	private String 	adminFee;
	private String 	adressNotes_1;
	private String 	adressNotes_10;
	private String 	adressNotes_2;
	private String 	adressNotes_3;
	private String 	adressNotes_4;
	private String 	adressNotes_5;
	private String 	adressNotes_6;
	private String 	adressNotes_7;
	private String 	adressNotes_8;
	private String 	adressNotes_9;
	private String 	alphaCode;
	private String 	altCurrency;
	private String 	analysis1;
	private String 	analysis10;
	private String 	analysis11;
	private String 	analysis12;
	private String 	analysis13;
	private String 	analysis14;
	private String 	analysis15;
	private String 	analysis16;
	private String 	analysis17;
	private String 	analysis18;
	private String 	analysis19;
	private String 	analysis2;
	private String 	analysis20;
	private String 	analysis21;
	private String 	analysis22;
	private String 	analysis23;
	private String 	analysis24;
	private String 	analysis25;
	private String 	analysis26;
	private String 	analysis27;
	private String 	analysis28;
	private String 	analysis29;
	private String 	analysis3;
	private String 	analysis30;
	private String 	analysis4;
	private String 	analysis5;
	private String 	analysis6;
	private String 	analysis7;
	private String 	analysis8;
	private String 	analysis9;
	private String 	analysisCode1;
	private String 	analysisCode2;
	private String 	analysisCode3;
	private String 	analysisCode4;
	private String 	analysisCode5;
	private String 	analysisCode6;
	private String 	auxAccountType;
	private String 	auxilaryComment;
	private String 	balance;
	private String 	balanceForwardMethod;
	private String 	bankAccountName;
	private String 	bankAccountNo;
	private String 	bankAccountType;
	private String 	bankAddress1;
	private String 	bankAddress2;
	private String 	bankAddress3;
	private String 	bankAddress4;
	private String 	bankBranchCode;
	private String 	bankName;
	private String 	bankRef;
	private String 	bankSortCode;
	private String 	billingCycle;
	private String 	btx;
	private String 	carrier;
	private String 	chequeReturnedDate;
	private String 	companyRegNo;
	private String 	controlDigit;
	private String 	countryCode;
	private String 	cpCharge;
	private String 	cpLowerValue;
	private String 	creditCardCVVNo;
	private String 	creditCardName;
	private String 	creditCardNumber;
	private String 	creditCategory;
	private String 	creditClass;
	private String 	creditClassDescription;
	private String 	creditController;
	private String 	creditControllerDescription;
	private String 	creditControllerTelephone;
	private String 	creditLimit;
	private String 	creditLimitDowngrade;
	private String 	creditLimitUpgrade;
	private String 	creditScore;
	private String 	cumulativeSales;
	private String 	currency1;
	private String 	customerClass;
	private String 	customerName;
	private String 	customerTitle;
	private String 	customersLanguage;
	private String 	dateCreated;
	private String 	dateLastIssue;
	private String 	dateOfBirth;
	private String 	dealerID;
	private String 	deliveryMethod;
	private String 	deliveryReason;
	private String 	despatchHeld;
	private String 	directDebit;
	private String 	directDebitConfirmationDate;
	private String 	directDebitSubmissionDate;
	private String 	discountCode;
	private String 	ediCustomerFlag;
	private String 	evaluateCreditLimit;
	private String 	expiryDate;
	private String 	exportIndicator;
	private String 	firstName;
	private String 	gender;
	private String 	groupReference;
	private String 	handsetCount;
	private String 	hierarchyName;
	private String 	interestRate;
	private String 	invoiceAccount;
	private String 	invoiceAddressFlag_1;
	private String 	invoiceAddressFlag_10;
	private String 	invoiceAddressFlag_2;
	private String 	invoiceAddressFlag_3;
	private String 	invoiceAddressFlag_4;
	private String 	invoiceAddressFlag_5;
	private String 	invoiceAddressFlag_6;
	private String 	invoiceAddressFlag_7;
	private String 	invoiceAddressFlag_8;
	private String 	invoiceAddressFlag_9;
	private String 	invoiceAddressId;
	private String 	lastDepositStatus;
	private String 	letterCode;
	private String 	limitMechanism;
	private String 	maxNoSubscribers;
	private String 	maximumLimit;
	private String 	minimumLimit;
	private String 	noAccountDate;
	private String 	noBarsDate;
	private String 	orderBalance;
	private String 	packageCode;
	private String 	paidDeposit;
	private String 	paydays1;
	private String 	paydays2;
	private String 	paydays3;
	private String 	payer;
	private String 	paymentMethod;
	private String 	paymentType;
	private String 	pendingDeposit;
	private String 	prePaidStatus;
	private String 	prefferedDebitDay;
	private String 	priceList;
	private String 	printCpWithStat;
	private String 	processedMegaDownload;
	private String 	produceCommentOnlyInvoicesFlag;
	private String 	produceConsolidatedInvoicesFlag;
	private String 	produceInvoicesFlag;
	private String 	produceStatmentsFlag;
	private String 	protectCode;
	private String 	referToPayerDate;
	private String 	region;
	private String 	reminderCategory;
	private String 	reminderLetterDate;
	private String 	reminderLetters;
	private String 	responsibility;
	private String 	salesNominalLedgerCategory;
	private String 	salesType;
	private String 	salesman;
	private String 	serviceProviderID;
	private String 	settlementDays;
	private String 	settlementDiscount;
	private String 	severityDays1;
	private String 	severityDays2;
	private String 	severityDays3;
	private String 	severityDays4;
	private String 	severityDays5;
	private String 	severityDays6;
	private String 	shipperCode1;
	private String 	shipperCode2;
	private String 	shipperCode3;
	private String 	shippingNoteIndicator;
	private String 	specialPrice;
	private String 	srFlag;
	private String 	statementAccount;
	private String 	stationeryType;
	private String 	subGroupAccount;
	private String 	subscriberId_1;
	private String 	subscriberId_10;
	private String 	subscriberId_2;
	private String 	subscriberId_3;
	private String 	subscriberId_4;
	private String 	subscriberId_5;
	private String 	subscriberId_6;
	private String 	subscriberId_7;
	private String 	subscriberId_8;
	private String 	subscriberId_9;
	private String 	territory;
	private String 	vatExeNumber;
	private String 	vatRegNumber;
	private String 	vatRegistrationNo;
	private String 	vatType;
	private String 	yearToDateCostOfSales;
	private String 	yearToDateSales;

	public String getCRMColour() {
		return CRMColour;
	}

	public void setCRMColour(String cRMColour) {
		CRMColour = cRMColour;
	}

	public String getCRMKeyword() {
		return CRMKeyword;
	}

	public void setCRMKeyword(String cRMKeyword) {
		CRMKeyword = cRMKeyword;
	}

	public String getCRMValue() {
		return CRMValue;
	}

	public void setCRMValue(String cRMValue) {
		CRMValue = cRMValue;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccountNo_1() {
		return accountNo_1;
	}

	public void setAccountNo_1(String accountNo_1) {
		this.accountNo_1 = accountNo_1;
	}

	public String getAccountNo_10() {
		return accountNo_10;
	}

	public void setAccountNo_10(String accountNo_10) {
		this.accountNo_10 = accountNo_10;
	}

	public String getAccountNo_2() {
		return accountNo_2;
	}

	public void setAccountNo_2(String accountNo_2) {
		this.accountNo_2 = accountNo_2;
	}

	public String getAccountNo_3() {
		return accountNo_3;
	}

	public void setAccountNo_3(String accountNo_3) {
		this.accountNo_3 = accountNo_3;
	}

	public String getAccountNo_4() {
		return accountNo_4;
	}

	public void setAccountNo_4(String accountNo_4) {
		this.accountNo_4 = accountNo_4;
	}

	public String getAccountNo_5() {
		return accountNo_5;
	}

	public void setAccountNo_5(String accountNo_5) {
		this.accountNo_5 = accountNo_5;
	}

	public String getAccountNo_6() {
		return accountNo_6;
	}

	public void setAccountNo_6(String accountNo_6) {
		this.accountNo_6 = accountNo_6;
	}

	public String getAccountNo_7() {
		return accountNo_7;
	}

	public void setAccountNo_7(String accountNo_7) {
		this.accountNo_7 = accountNo_7;
	}

	public String getAccountNo_8() {
		return accountNo_8;
	}

	public void setAccountNo_8(String accountNo_8) {
		this.accountNo_8 = accountNo_8;
	}

	public String getAccountNo_9() {
		return accountNo_9;
	}

	public void setAccountNo_9(String accountNo_9) {
		this.accountNo_9 = accountNo_9;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountTransferredDate() {
		return accountTransferredDate;
	}

	public void setAccountTransferredDate(String accountTransferredDate) {
		this.accountTransferredDate = accountTransferredDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAddresInDate_1() {
		return addresInDate_1;
	}

	public void setAddresInDate_1(String addresInDate_1) {
		this.addresInDate_1 = addresInDate_1;
	}

	public String getAddresInDate_10() {
		return addresInDate_10;
	}

	public void setAddresInDate_10(String addresInDate_10) {
		this.addresInDate_10 = addresInDate_10;
	}

	public String getAddresInDate_2() {
		return addresInDate_2;
	}

	public void setAddresInDate_2(String addresInDate_2) {
		this.addresInDate_2 = addresInDate_2;
	}

	public String getAddresInDate_3() {
		return addresInDate_3;
	}

	public void setAddresInDate_3(String addresInDate_3) {
		this.addresInDate_3 = addresInDate_3;
	}

	public String getAddresInDate_4() {
		return addresInDate_4;
	}

	public void setAddresInDate_4(String addresInDate_4) {
		this.addresInDate_4 = addresInDate_4;
	}

	public String getAddresInDate_5() {
		return addresInDate_5;
	}

	public void setAddresInDate_5(String addresInDate_5) {
		this.addresInDate_5 = addresInDate_5;
	}

	public String getAddresInDate_6() {
		return addresInDate_6;
	}

	public void setAddresInDate_6(String addresInDate_6) {
		this.addresInDate_6 = addresInDate_6;
	}

	public String getAddresInDate_7() {
		return addresInDate_7;
	}

	public void setAddresInDate_7(String addresInDate_7) {
		this.addresInDate_7 = addresInDate_7;
	}

	public String getAddresInDate_8() {
		return addresInDate_8;
	}

	public void setAddresInDate_8(String addresInDate_8) {
		this.addresInDate_8 = addresInDate_8;
	}

	public String getAddresInDate_9() {
		return addresInDate_9;
	}

	public void setAddresInDate_9(String addresInDate_9) {
		this.addresInDate_9 = addresInDate_9;
	}

	public String getAddresType_1() {
		return addresType_1;
	}

	public void setAddresType_1(String addresType_1) {
		this.addresType_1 = addresType_1;
	}

	public String getAddresType_10() {
		return addresType_10;
	}

	public void setAddresType_10(String addresType_10) {
		this.addresType_10 = addresType_10;
	}

	public String getAddresType_2() {
		return addresType_2;
	}

	public void setAddresType_2(String addresType_2) {
		this.addresType_2 = addresType_2;
	}

	public String getAddresType_3() {
		return addresType_3;
	}

	public void setAddresType_3(String addresType_3) {
		this.addresType_3 = addresType_3;
	}

	public String getAddresType_4() {
		return addresType_4;
	}

	public void setAddresType_4(String addresType_4) {
		this.addresType_4 = addresType_4;
	}

	public String getAddresType_5() {
		return addresType_5;
	}

	public void setAddresType_5(String addresType_5) {
		this.addresType_5 = addresType_5;
	}

	public String getAddresType_6() {
		return addresType_6;
	}

	public void setAddresType_6(String addresType_6) {
		this.addresType_6 = addresType_6;
	}

	public String getAddresType_7() {
		return addresType_7;
	}

	public void setAddresType_7(String addresType_7) {
		this.addresType_7 = addresType_7;
	}

	public String getAddresType_8() {
		return addresType_8;
	}

	public void setAddresType_8(String addresType_8) {
		this.addresType_8 = addresType_8;
	}

	public String getAddresType_9() {
		return addresType_9;
	}

	public void setAddresType_9(String addresType_9) {
		this.addresType_9 = addresType_9;
	}

	public String getAddressClassification_1() {
		return addressClassification_1;
	}

	public void setAddressClassification_1(String addressClassification_1) {
		this.addressClassification_1 = addressClassification_1;
	}

	public String getAddressClassification_10() {
		return addressClassification_10;
	}

	public void setAddressClassification_10(String addressClassification_10) {
		this.addressClassification_10 = addressClassification_10;
	}

	public String getAddressClassification_2() {
		return addressClassification_2;
	}

	public void setAddressClassification_2(String addressClassification_2) {
		this.addressClassification_2 = addressClassification_2;
	}

	public String getAddressClassification_3() {
		return addressClassification_3;
	}

	public void setAddressClassification_3(String addressClassification_3) {
		this.addressClassification_3 = addressClassification_3;
	}

	public String getAddressClassification_4() {
		return addressClassification_4;
	}

	public void setAddressClassification_4(String addressClassification_4) {
		this.addressClassification_4 = addressClassification_4;
	}

	public String getAddressClassification_5() {
		return addressClassification_5;
	}

	public void setAddressClassification_5(String addressClassification_5) {
		this.addressClassification_5 = addressClassification_5;
	}

	public String getAddressClassification_6() {
		return addressClassification_6;
	}

	public void setAddressClassification_6(String addressClassification_6) {
		this.addressClassification_6 = addressClassification_6;
	}

	public String getAddressClassification_7() {
		return addressClassification_7;
	}

	public void setAddressClassification_7(String addressClassification_7) {
		this.addressClassification_7 = addressClassification_7;
	}

	public String getAddressClassification_8() {
		return addressClassification_8;
	}

	public void setAddressClassification_8(String addressClassification_8) {
		this.addressClassification_8 = addressClassification_8;
	}

	public String getAddressClassification_9() {
		return addressClassification_9;
	}

	public void setAddressClassification_9(String addressClassification_9) {
		this.addressClassification_9 = addressClassification_9;
	}

	public String getAddressContact_1() {
		return addressContact_1;
	}

	public void setAddressContact_1(String addressContact_1) {
		this.addressContact_1 = addressContact_1;
	}

	public String getAddressContact_10() {
		return addressContact_10;
	}

	public void setAddressContact_10(String addressContact_10) {
		this.addressContact_10 = addressContact_10;
	}

	public String getAddressContact_2() {
		return addressContact_2;
	}

	public void setAddressContact_2(String addressContact_2) {
		this.addressContact_2 = addressContact_2;
	}

	public String getAddressContact_3() {
		return addressContact_3;
	}

	public void setAddressContact_3(String addressContact_3) {
		this.addressContact_3 = addressContact_3;
	}

	public String getAddressContact_4() {
		return addressContact_4;
	}

	public void setAddressContact_4(String addressContact_4) {
		this.addressContact_4 = addressContact_4;
	}

	public String getAddressContact_5() {
		return addressContact_5;
	}

	public void setAddressContact_5(String addressContact_5) {
		this.addressContact_5 = addressContact_5;
	}

	public String getAddressContact_6() {
		return addressContact_6;
	}

	public void setAddressContact_6(String addressContact_6) {
		this.addressContact_6 = addressContact_6;
	}

	public String getAddressContact_7() {
		return addressContact_7;
	}

	public void setAddressContact_7(String addressContact_7) {
		this.addressContact_7 = addressContact_7;
	}

	public String getAddressContact_8() {
		return addressContact_8;
	}

	public void setAddressContact_8(String addressContact_8) {
		this.addressContact_8 = addressContact_8;
	}

	public String getAddressContact_9() {
		return addressContact_9;
	}

	public void setAddressContact_9(String addressContact_9) {
		this.addressContact_9 = addressContact_9;
	}

	public String getAddressEMail_1() {
		return addressEMail_1;
	}

	public void setAddressEMail_1(String addressEMail_1) {
		this.addressEMail_1 = addressEMail_1;
	}

	public String getAddressEMail_10() {
		return addressEMail_10;
	}

	public void setAddressEMail_10(String addressEMail_10) {
		this.addressEMail_10 = addressEMail_10;
	}

	public String getAddressEMail_2() {
		return addressEMail_2;
	}

	public void setAddressEMail_2(String addressEMail_2) {
		this.addressEMail_2 = addressEMail_2;
	}

	public String getAddressEMail_3() {
		return addressEMail_3;
	}

	public void setAddressEMail_3(String addressEMail_3) {
		this.addressEMail_3 = addressEMail_3;
	}

	public String getAddressEMail_4() {
		return addressEMail_4;
	}

	public void setAddressEMail_4(String addressEMail_4) {
		this.addressEMail_4 = addressEMail_4;
	}

	public String getAddressEMail_5() {
		return addressEMail_5;
	}

	public void setAddressEMail_5(String addressEMail_5) {
		this.addressEMail_5 = addressEMail_5;
	}

	public String getAddressEMail_6() {
		return addressEMail_6;
	}

	public void setAddressEMail_6(String addressEMail_6) {
		this.addressEMail_6 = addressEMail_6;
	}

	public String getAddressEMail_7() {
		return addressEMail_7;
	}

	public void setAddressEMail_7(String addressEMail_7) {
		this.addressEMail_7 = addressEMail_7;
	}

	public String getAddressEMail_8() {
		return addressEMail_8;
	}

	public void setAddressEMail_8(String addressEMail_8) {
		this.addressEMail_8 = addressEMail_8;
	}

	public String getAddressEMail_9() {
		return addressEMail_9;
	}

	public void setAddressEMail_9(String addressEMail_9) {
		this.addressEMail_9 = addressEMail_9;
	}

	public String getAddressFax_1() {
		return addressFax_1;
	}

	public void setAddressFax_1(String addressFax_1) {
		this.addressFax_1 = addressFax_1;
	}

	public String getAddressFax_10() {
		return addressFax_10;
	}

	public void setAddressFax_10(String addressFax_10) {
		this.addressFax_10 = addressFax_10;
	}

	public String getAddressFax_2() {
		return addressFax_2;
	}

	public void setAddressFax_2(String addressFax_2) {
		this.addressFax_2 = addressFax_2;
	}

	public String getAddressFax_3() {
		return addressFax_3;
	}

	public void setAddressFax_3(String addressFax_3) {
		this.addressFax_3 = addressFax_3;
	}

	public String getAddressFax_4() {
		return addressFax_4;
	}

	public void setAddressFax_4(String addressFax_4) {
		this.addressFax_4 = addressFax_4;
	}

	public String getAddressFax_5() {
		return addressFax_5;
	}

	public void setAddressFax_5(String addressFax_5) {
		this.addressFax_5 = addressFax_5;
	}

	public String getAddressFax_6() {
		return addressFax_6;
	}

	public void setAddressFax_6(String addressFax_6) {
		this.addressFax_6 = addressFax_6;
	}

	public String getAddressFax_7() {
		return addressFax_7;
	}

	public void setAddressFax_7(String addressFax_7) {
		this.addressFax_7 = addressFax_7;
	}

	public String getAddressFax_8() {
		return addressFax_8;
	}

	public void setAddressFax_8(String addressFax_8) {
		this.addressFax_8 = addressFax_8;
	}

	public String getAddressFax_9() {
		return addressFax_9;
	}

	public void setAddressFax_9(String addressFax_9) {
		this.addressFax_9 = addressFax_9;
	}

	public String getAddressGeneral1_1() {
		return addressGeneral1_1;
	}

	public void setAddressGeneral1_1(String addressGeneral1_1) {
		this.addressGeneral1_1 = addressGeneral1_1;
	}

	public String getAddressGeneral1_10() {
		return addressGeneral1_10;
	}

	public void setAddressGeneral1_10(String addressGeneral1_10) {
		this.addressGeneral1_10 = addressGeneral1_10;
	}

	public String getAddressGeneral1_2() {
		return addressGeneral1_2;
	}

	public void setAddressGeneral1_2(String addressGeneral1_2) {
		this.addressGeneral1_2 = addressGeneral1_2;
	}

	public String getAddressGeneral1_3() {
		return addressGeneral1_3;
	}

	public void setAddressGeneral1_3(String addressGeneral1_3) {
		this.addressGeneral1_3 = addressGeneral1_3;
	}

	public String getAddressGeneral1_4() {
		return addressGeneral1_4;
	}

	public void setAddressGeneral1_4(String addressGeneral1_4) {
		this.addressGeneral1_4 = addressGeneral1_4;
	}

	public String getAddressGeneral1_5() {
		return addressGeneral1_5;
	}

	public void setAddressGeneral1_5(String addressGeneral1_5) {
		this.addressGeneral1_5 = addressGeneral1_5;
	}

	public String getAddressGeneral1_6() {
		return addressGeneral1_6;
	}

	public void setAddressGeneral1_6(String addressGeneral1_6) {
		this.addressGeneral1_6 = addressGeneral1_6;
	}

	public String getAddressGeneral1_7() {
		return addressGeneral1_7;
	}

	public void setAddressGeneral1_7(String addressGeneral1_7) {
		this.addressGeneral1_7 = addressGeneral1_7;
	}

	public String getAddressGeneral1_8() {
		return addressGeneral1_8;
	}

	public void setAddressGeneral1_8(String addressGeneral1_8) {
		this.addressGeneral1_8 = addressGeneral1_8;
	}

	public String getAddressGeneral1_9() {
		return addressGeneral1_9;
	}

	public void setAddressGeneral1_9(String addressGeneral1_9) {
		this.addressGeneral1_9 = addressGeneral1_9;
	}

	public String getAddressGeneral2_1() {
		return addressGeneral2_1;
	}

	public void setAddressGeneral2_1(String addressGeneral2_1) {
		this.addressGeneral2_1 = addressGeneral2_1;
	}

	public String getAddressGeneral2_10() {
		return addressGeneral2_10;
	}

	public void setAddressGeneral2_10(String addressGeneral2_10) {
		this.addressGeneral2_10 = addressGeneral2_10;
	}

	public String getAddressGeneral2_2() {
		return addressGeneral2_2;
	}

	public void setAddressGeneral2_2(String addressGeneral2_2) {
		this.addressGeneral2_2 = addressGeneral2_2;
	}

	public String getAddressGeneral2_3() {
		return addressGeneral2_3;
	}

	public void setAddressGeneral2_3(String addressGeneral2_3) {
		this.addressGeneral2_3 = addressGeneral2_3;
	}

	public String getAddressGeneral2_4() {
		return addressGeneral2_4;
	}

	public void setAddressGeneral2_4(String addressGeneral2_4) {
		this.addressGeneral2_4 = addressGeneral2_4;
	}

	public String getAddressGeneral2_5() {
		return addressGeneral2_5;
	}

	public void setAddressGeneral2_5(String addressGeneral2_5) {
		this.addressGeneral2_5 = addressGeneral2_5;
	}

	public String getAddressGeneral2_6() {
		return addressGeneral2_6;
	}

	public void setAddressGeneral2_6(String addressGeneral2_6) {
		this.addressGeneral2_6 = addressGeneral2_6;
	}

	public String getAddressGeneral2_7() {
		return addressGeneral2_7;
	}

	public void setAddressGeneral2_7(String addressGeneral2_7) {
		this.addressGeneral2_7 = addressGeneral2_7;
	}

	public String getAddressGeneral2_8() {
		return addressGeneral2_8;
	}

	public void setAddressGeneral2_8(String addressGeneral2_8) {
		this.addressGeneral2_8 = addressGeneral2_8;
	}

	public String getAddressGeneral2_9() {
		return addressGeneral2_9;
	}

	public void setAddressGeneral2_9(String addressGeneral2_9) {
		this.addressGeneral2_9 = addressGeneral2_9;
	}

	public String getAddressGeneral3_1() {
		return addressGeneral3_1;
	}

	public void setAddressGeneral3_1(String addressGeneral3_1) {
		this.addressGeneral3_1 = addressGeneral3_1;
	}

	public String getAddressGeneral3_10() {
		return addressGeneral3_10;
	}

	public void setAddressGeneral3_10(String addressGeneral3_10) {
		this.addressGeneral3_10 = addressGeneral3_10;
	}

	public String getAddressGeneral3_2() {
		return addressGeneral3_2;
	}

	public void setAddressGeneral3_2(String addressGeneral3_2) {
		this.addressGeneral3_2 = addressGeneral3_2;
	}

	public String getAddressGeneral3_3() {
		return addressGeneral3_3;
	}

	public void setAddressGeneral3_3(String addressGeneral3_3) {
		this.addressGeneral3_3 = addressGeneral3_3;
	}

	public String getAddressGeneral3_4() {
		return addressGeneral3_4;
	}

	public void setAddressGeneral3_4(String addressGeneral3_4) {
		this.addressGeneral3_4 = addressGeneral3_4;
	}

	public String getAddressGeneral3_5() {
		return addressGeneral3_5;
	}

	public void setAddressGeneral3_5(String addressGeneral3_5) {
		this.addressGeneral3_5 = addressGeneral3_5;
	}

	public String getAddressGeneral3_6() {
		return addressGeneral3_6;
	}

	public void setAddressGeneral3_6(String addressGeneral3_6) {
		this.addressGeneral3_6 = addressGeneral3_6;
	}

	public String getAddressGeneral3_7() {
		return addressGeneral3_7;
	}

	public void setAddressGeneral3_7(String addressGeneral3_7) {
		this.addressGeneral3_7 = addressGeneral3_7;
	}

	public String getAddressGeneral3_8() {
		return addressGeneral3_8;
	}

	public void setAddressGeneral3_8(String addressGeneral3_8) {
		this.addressGeneral3_8 = addressGeneral3_8;
	}

	public String getAddressGeneral3_9() {
		return addressGeneral3_9;
	}

	public void setAddressGeneral3_9(String addressGeneral3_9) {
		this.addressGeneral3_9 = addressGeneral3_9;
	}

	public String getAddressID_1() {
		return addressID_1;
	}

	public void setAddressID_1(String addressID_1) {
		this.addressID_1 = addressID_1;
	}

	public String getAddressID_10() {
		return addressID_10;
	}

	public void setAddressID_10(String addressID_10) {
		this.addressID_10 = addressID_10;
	}

	public String getAddressID_2() {
		return addressID_2;
	}

	public void setAddressID_2(String addressID_2) {
		this.addressID_2 = addressID_2;
	}

	public String getAddressID_3() {
		return addressID_3;
	}

	public void setAddressID_3(String addressID_3) {
		this.addressID_3 = addressID_3;
	}

	public String getAddressID_4() {
		return addressID_4;
	}

	public void setAddressID_4(String addressID_4) {
		this.addressID_4 = addressID_4;
	}

	public String getAddressID_5() {
		return addressID_5;
	}

	public void setAddressID_5(String addressID_5) {
		this.addressID_5 = addressID_5;
	}

	public String getAddressID_6() {
		return addressID_6;
	}

	public void setAddressID_6(String addressID_6) {
		this.addressID_6 = addressID_6;
	}

	public String getAddressID_7() {
		return addressID_7;
	}

	public void setAddressID_7(String addressID_7) {
		this.addressID_7 = addressID_7;
	}

	public String getAddressID_8() {
		return addressID_8;
	}

	public void setAddressID_8(String addressID_8) {
		this.addressID_8 = addressID_8;
	}

	public String getAddressID_9() {
		return addressID_9;
	}

	public void setAddressID_9(String addressID_9) {
		this.addressID_9 = addressID_9;
	}

	public String getAddressLine1_1() {
		return addressLine1_1;
	}

	public void setAddressLine1_1(String addressLine1_1) {
		this.addressLine1_1 = addressLine1_1;
	}

	public String getAddressLine1_10() {
		return addressLine1_10;
	}

	public void setAddressLine1_10(String addressLine1_10) {
		this.addressLine1_10 = addressLine1_10;
	}

	public String getAddressLine1_2() {
		return addressLine1_2;
	}

	public void setAddressLine1_2(String addressLine1_2) {
		this.addressLine1_2 = addressLine1_2;
	}

	public String getAddressLine1_3() {
		return addressLine1_3;
	}

	public void setAddressLine1_3(String addressLine1_3) {
		this.addressLine1_3 = addressLine1_3;
	}

	public String getAddressLine1_4() {
		return addressLine1_4;
	}

	public void setAddressLine1_4(String addressLine1_4) {
		this.addressLine1_4 = addressLine1_4;
	}

	public String getAddressLine1_5() {
		return addressLine1_5;
	}

	public void setAddressLine1_5(String addressLine1_5) {
		this.addressLine1_5 = addressLine1_5;
	}

	public String getAddressLine1_6() {
		return addressLine1_6;
	}

	public void setAddressLine1_6(String addressLine1_6) {
		this.addressLine1_6 = addressLine1_6;
	}

	public String getAddressLine1_7() {
		return addressLine1_7;
	}

	public void setAddressLine1_7(String addressLine1_7) {
		this.addressLine1_7 = addressLine1_7;
	}

	public String getAddressLine1_8() {
		return addressLine1_8;
	}

	public void setAddressLine1_8(String addressLine1_8) {
		this.addressLine1_8 = addressLine1_8;
	}

	public String getAddressLine1_9() {
		return addressLine1_9;
	}

	public void setAddressLine1_9(String addressLine1_9) {
		this.addressLine1_9 = addressLine1_9;
	}

	public String getAddressLine2_1() {
		return addressLine2_1;
	}

	public void setAddressLine2_1(String addressLine2_1) {
		this.addressLine2_1 = addressLine2_1;
	}

	public String getAddressLine2_10() {
		return addressLine2_10;
	}

	public void setAddressLine2_10(String addressLine2_10) {
		this.addressLine2_10 = addressLine2_10;
	}

	public String getAddressLine2_2() {
		return addressLine2_2;
	}

	public void setAddressLine2_2(String addressLine2_2) {
		this.addressLine2_2 = addressLine2_2;
	}

	public String getAddressLine2_3() {
		return addressLine2_3;
	}

	public void setAddressLine2_3(String addressLine2_3) {
		this.addressLine2_3 = addressLine2_3;
	}

	public String getAddressLine2_4() {
		return addressLine2_4;
	}

	public void setAddressLine2_4(String addressLine2_4) {
		this.addressLine2_4 = addressLine2_4;
	}

	public String getAddressLine2_5() {
		return addressLine2_5;
	}

	public void setAddressLine2_5(String addressLine2_5) {
		this.addressLine2_5 = addressLine2_5;
	}

	public String getAddressLine2_6() {
		return addressLine2_6;
	}

	public void setAddressLine2_6(String addressLine2_6) {
		this.addressLine2_6 = addressLine2_6;
	}

	public String getAddressLine2_7() {
		return addressLine2_7;
	}

	public void setAddressLine2_7(String addressLine2_7) {
		this.addressLine2_7 = addressLine2_7;
	}

	public String getAddressLine2_8() {
		return addressLine2_8;
	}

	public void setAddressLine2_8(String addressLine2_8) {
		this.addressLine2_8 = addressLine2_8;
	}

	public String getAddressLine2_9() {
		return addressLine2_9;
	}

	public void setAddressLine2_9(String addressLine2_9) {
		this.addressLine2_9 = addressLine2_9;
	}

	public String getAddressLine3_1() {
		return addressLine3_1;
	}

	public void setAddressLine3_1(String addressLine3_1) {
		this.addressLine3_1 = addressLine3_1;
	}

	public String getAddressLine3_10() {
		return addressLine3_10;
	}

	public void setAddressLine3_10(String addressLine3_10) {
		this.addressLine3_10 = addressLine3_10;
	}

	public String getAddressLine3_2() {
		return addressLine3_2;
	}

	public void setAddressLine3_2(String addressLine3_2) {
		this.addressLine3_2 = addressLine3_2;
	}

	public String getAddressLine3_3() {
		return addressLine3_3;
	}

	public void setAddressLine3_3(String addressLine3_3) {
		this.addressLine3_3 = addressLine3_3;
	}

	public String getAddressLine3_4() {
		return addressLine3_4;
	}

	public void setAddressLine3_4(String addressLine3_4) {
		this.addressLine3_4 = addressLine3_4;
	}

	public String getAddressLine3_5() {
		return addressLine3_5;
	}

	public void setAddressLine3_5(String addressLine3_5) {
		this.addressLine3_5 = addressLine3_5;
	}

	public String getAddressLine3_6() {
		return addressLine3_6;
	}

	public void setAddressLine3_6(String addressLine3_6) {
		this.addressLine3_6 = addressLine3_6;
	}

	public String getAddressLine3_7() {
		return addressLine3_7;
	}

	public void setAddressLine3_7(String addressLine3_7) {
		this.addressLine3_7 = addressLine3_7;
	}

	public String getAddressLine3_8() {
		return addressLine3_8;
	}

	public void setAddressLine3_8(String addressLine3_8) {
		this.addressLine3_8 = addressLine3_8;
	}

	public String getAddressLine3_9() {
		return addressLine3_9;
	}

	public void setAddressLine3_9(String addressLine3_9) {
		this.addressLine3_9 = addressLine3_9;
	}

	public String getAddressLine4_1() {
		return addressLine4_1;
	}

	public void setAddressLine4_1(String addressLine4_1) {
		this.addressLine4_1 = addressLine4_1;
	}

	public String getAddressLine4_10() {
		return addressLine4_10;
	}

	public void setAddressLine4_10(String addressLine4_10) {
		this.addressLine4_10 = addressLine4_10;
	}

	public String getAddressLine4_2() {
		return addressLine4_2;
	}

	public void setAddressLine4_2(String addressLine4_2) {
		this.addressLine4_2 = addressLine4_2;
	}

	public String getAddressLine4_3() {
		return addressLine4_3;
	}

	public void setAddressLine4_3(String addressLine4_3) {
		this.addressLine4_3 = addressLine4_3;
	}

	public String getAddressLine4_4() {
		return addressLine4_4;
	}

	public void setAddressLine4_4(String addressLine4_4) {
		this.addressLine4_4 = addressLine4_4;
	}

	public String getAddressLine4_5() {
		return addressLine4_5;
	}

	public void setAddressLine4_5(String addressLine4_5) {
		this.addressLine4_5 = addressLine4_5;
	}

	public String getAddressLine4_6() {
		return addressLine4_6;
	}

	public void setAddressLine4_6(String addressLine4_6) {
		this.addressLine4_6 = addressLine4_6;
	}

	public String getAddressLine4_7() {
		return addressLine4_7;
	}

	public void setAddressLine4_7(String addressLine4_7) {
		this.addressLine4_7 = addressLine4_7;
	}

	public String getAddressLine4_8() {
		return addressLine4_8;
	}

	public void setAddressLine4_8(String addressLine4_8) {
		this.addressLine4_8 = addressLine4_8;
	}

	public String getAddressLine4_9() {
		return addressLine4_9;
	}

	public void setAddressLine4_9(String addressLine4_9) {
		this.addressLine4_9 = addressLine4_9;
	}

	public String getAddressLine5_1() {
		return addressLine5_1;
	}

	public void setAddressLine5_1(String addressLine5_1) {
		this.addressLine5_1 = addressLine5_1;
	}

	public String getAddressLine5_10() {
		return addressLine5_10;
	}

	public void setAddressLine5_10(String addressLine5_10) {
		this.addressLine5_10 = addressLine5_10;
	}

	public String getAddressLine5_2() {
		return addressLine5_2;
	}

	public void setAddressLine5_2(String addressLine5_2) {
		this.addressLine5_2 = addressLine5_2;
	}

	public String getAddressLine5_3() {
		return addressLine5_3;
	}

	public void setAddressLine5_3(String addressLine5_3) {
		this.addressLine5_3 = addressLine5_3;
	}

	public String getAddressLine5_4() {
		return addressLine5_4;
	}

	public void setAddressLine5_4(String addressLine5_4) {
		this.addressLine5_4 = addressLine5_4;
	}

	public String getAddressLine5_5() {
		return addressLine5_5;
	}

	public void setAddressLine5_5(String addressLine5_5) {
		this.addressLine5_5 = addressLine5_5;
	}

	public String getAddressLine5_6() {
		return addressLine5_6;
	}

	public void setAddressLine5_6(String addressLine5_6) {
		this.addressLine5_6 = addressLine5_6;
	}

	public String getAddressLine5_7() {
		return addressLine5_7;
	}

	public void setAddressLine5_7(String addressLine5_7) {
		this.addressLine5_7 = addressLine5_7;
	}

	public String getAddressLine5_8() {
		return addressLine5_8;
	}

	public void setAddressLine5_8(String addressLine5_8) {
		this.addressLine5_8 = addressLine5_8;
	}

	public String getAddressLine5_9() {
		return addressLine5_9;
	}

	public void setAddressLine5_9(String addressLine5_9) {
		this.addressLine5_9 = addressLine5_9;
	}

	public String getAddressLine6_1() {
		return addressLine6_1;
	}

	public void setAddressLine6_1(String addressLine6_1) {
		this.addressLine6_1 = addressLine6_1;
	}

	public String getAddressLine6_10() {
		return addressLine6_10;
	}

	public void setAddressLine6_10(String addressLine6_10) {
		this.addressLine6_10 = addressLine6_10;
	}

	public String getAddressLine6_2() {
		return addressLine6_2;
	}

	public void setAddressLine6_2(String addressLine6_2) {
		this.addressLine6_2 = addressLine6_2;
	}

	public String getAddressLine6_3() {
		return addressLine6_3;
	}

	public void setAddressLine6_3(String addressLine6_3) {
		this.addressLine6_3 = addressLine6_3;
	}

	public String getAddressLine6_4() {
		return addressLine6_4;
	}

	public void setAddressLine6_4(String addressLine6_4) {
		this.addressLine6_4 = addressLine6_4;
	}

	public String getAddressLine6_5() {
		return addressLine6_5;
	}

	public void setAddressLine6_5(String addressLine6_5) {
		this.addressLine6_5 = addressLine6_5;
	}

	public String getAddressLine6_6() {
		return addressLine6_6;
	}

	public void setAddressLine6_6(String addressLine6_6) {
		this.addressLine6_6 = addressLine6_6;
	}

	public String getAddressLine6_7() {
		return addressLine6_7;
	}

	public void setAddressLine6_7(String addressLine6_7) {
		this.addressLine6_7 = addressLine6_7;
	}

	public String getAddressLine6_8() {
		return addressLine6_8;
	}

	public void setAddressLine6_8(String addressLine6_8) {
		this.addressLine6_8 = addressLine6_8;
	}

	public String getAddressLine6_9() {
		return addressLine6_9;
	}

	public void setAddressLine6_9(String addressLine6_9) {
		this.addressLine6_9 = addressLine6_9;
	}

	public String getAddressName_1() {
		return addressName_1;
	}

	public void setAddressName_1(String addressName_1) {
		this.addressName_1 = addressName_1;
	}

	public String getAddressName_10() {
		return addressName_10;
	}

	public void setAddressName_10(String addressName_10) {
		this.addressName_10 = addressName_10;
	}

	public String getAddressName_2() {
		return addressName_2;
	}

	public void setAddressName_2(String addressName_2) {
		this.addressName_2 = addressName_2;
	}

	public String getAddressName_3() {
		return addressName_3;
	}

	public void setAddressName_3(String addressName_3) {
		this.addressName_3 = addressName_3;
	}

	public String getAddressName_4() {
		return addressName_4;
	}

	public void setAddressName_4(String addressName_4) {
		this.addressName_4 = addressName_4;
	}

	public String getAddressName_5() {
		return addressName_5;
	}

	public void setAddressName_5(String addressName_5) {
		this.addressName_5 = addressName_5;
	}

	public String getAddressName_6() {
		return addressName_6;
	}

	public void setAddressName_6(String addressName_6) {
		this.addressName_6 = addressName_6;
	}

	public String getAddressName_7() {
		return addressName_7;
	}

	public void setAddressName_7(String addressName_7) {
		this.addressName_7 = addressName_7;
	}

	public String getAddressName_8() {
		return addressName_8;
	}

	public void setAddressName_8(String addressName_8) {
		this.addressName_8 = addressName_8;
	}

	public String getAddressName_9() {
		return addressName_9;
	}

	public void setAddressName_9(String addressName_9) {
		this.addressName_9 = addressName_9;
	}

	public String getAddressPostCode_1() {
		return addressPostCode_1;
	}

	public void setAddressPostCode_1(String addressPostCode_1) {
		this.addressPostCode_1 = addressPostCode_1;
	}

	public String getAddressPostCode_10() {
		return addressPostCode_10;
	}

	public void setAddressPostCode_10(String addressPostCode_10) {
		this.addressPostCode_10 = addressPostCode_10;
	}

	public String getAddressPostCode_2() {
		return addressPostCode_2;
	}

	public void setAddressPostCode_2(String addressPostCode_2) {
		this.addressPostCode_2 = addressPostCode_2;
	}

	public String getAddressPostCode_3() {
		return addressPostCode_3;
	}

	public void setAddressPostCode_3(String addressPostCode_3) {
		this.addressPostCode_3 = addressPostCode_3;
	}

	public String getAddressPostCode_4() {
		return addressPostCode_4;
	}

	public void setAddressPostCode_4(String addressPostCode_4) {
		this.addressPostCode_4 = addressPostCode_4;
	}

	public String getAddressPostCode_5() {
		return addressPostCode_5;
	}

	public void setAddressPostCode_5(String addressPostCode_5) {
		this.addressPostCode_5 = addressPostCode_5;
	}

	public String getAddressPostCode_6() {
		return addressPostCode_6;
	}

	public void setAddressPostCode_6(String addressPostCode_6) {
		this.addressPostCode_6 = addressPostCode_6;
	}

	public String getAddressPostCode_7() {
		return addressPostCode_7;
	}

	public void setAddressPostCode_7(String addressPostCode_7) {
		this.addressPostCode_7 = addressPostCode_7;
	}

	public String getAddressPostCode_8() {
		return addressPostCode_8;
	}

	public void setAddressPostCode_8(String addressPostCode_8) {
		this.addressPostCode_8 = addressPostCode_8;
	}

	public String getAddressPostCode_9() {
		return addressPostCode_9;
	}

	public void setAddressPostCode_9(String addressPostCode_9) {
		this.addressPostCode_9 = addressPostCode_9;
	}

	public String getAddressTelephone2_1() {
		return addressTelephone2_1;
	}

	public void setAddressTelephone2_1(String addressTelephone2_1) {
		this.addressTelephone2_1 = addressTelephone2_1;
	}

	public String getAddressTelephone2_10() {
		return addressTelephone2_10;
	}

	public void setAddressTelephone2_10(String addressTelephone2_10) {
		this.addressTelephone2_10 = addressTelephone2_10;
	}

	public String getAddressTelephone2_2() {
		return addressTelephone2_2;
	}

	public void setAddressTelephone2_2(String addressTelephone2_2) {
		this.addressTelephone2_2 = addressTelephone2_2;
	}

	public String getAddressTelephone2_3() {
		return addressTelephone2_3;
	}

	public void setAddressTelephone2_3(String addressTelephone2_3) {
		this.addressTelephone2_3 = addressTelephone2_3;
	}

	public String getAddressTelephone2_4() {
		return addressTelephone2_4;
	}

	public void setAddressTelephone2_4(String addressTelephone2_4) {
		this.addressTelephone2_4 = addressTelephone2_4;
	}

	public String getAddressTelephone2_5() {
		return addressTelephone2_5;
	}

	public void setAddressTelephone2_5(String addressTelephone2_5) {
		this.addressTelephone2_5 = addressTelephone2_5;
	}

	public String getAddressTelephone2_6() {
		return addressTelephone2_6;
	}

	public void setAddressTelephone2_6(String addressTelephone2_6) {
		this.addressTelephone2_6 = addressTelephone2_6;
	}

	public String getAddressTelephone2_7() {
		return addressTelephone2_7;
	}

	public void setAddressTelephone2_7(String addressTelephone2_7) {
		this.addressTelephone2_7 = addressTelephone2_7;
	}

	public String getAddressTelephone2_8() {
		return addressTelephone2_8;
	}

	public void setAddressTelephone2_8(String addressTelephone2_8) {
		this.addressTelephone2_8 = addressTelephone2_8;
	}

	public String getAddressTelephone2_9() {
		return addressTelephone2_9;
	}

	public void setAddressTelephone2_9(String addressTelephone2_9) {
		this.addressTelephone2_9 = addressTelephone2_9;
	}

	public String getAddressTelephone_1() {
		return addressTelephone_1;
	}

	public void setAddressTelephone_1(String addressTelephone_1) {
		this.addressTelephone_1 = addressTelephone_1;
	}

	public String getAddressTelephone_10() {
		return addressTelephone_10;
	}

	public void setAddressTelephone_10(String addressTelephone_10) {
		this.addressTelephone_10 = addressTelephone_10;
	}

	public String getAddressTelephone_2() {
		return addressTelephone_2;
	}

	public void setAddressTelephone_2(String addressTelephone_2) {
		this.addressTelephone_2 = addressTelephone_2;
	}

	public String getAddressTelephone_3() {
		return addressTelephone_3;
	}

	public void setAddressTelephone_3(String addressTelephone_3) {
		this.addressTelephone_3 = addressTelephone_3;
	}

	public String getAddressTelephone_4() {
		return addressTelephone_4;
	}

	public void setAddressTelephone_4(String addressTelephone_4) {
		this.addressTelephone_4 = addressTelephone_4;
	}

	public String getAddressTelephone_5() {
		return addressTelephone_5;
	}

	public void setAddressTelephone_5(String addressTelephone_5) {
		this.addressTelephone_5 = addressTelephone_5;
	}

	public String getAddressTelephone_6() {
		return addressTelephone_6;
	}

	public void setAddressTelephone_6(String addressTelephone_6) {
		this.addressTelephone_6 = addressTelephone_6;
	}

	public String getAddressTelephone_7() {
		return addressTelephone_7;
	}

	public void setAddressTelephone_7(String addressTelephone_7) {
		this.addressTelephone_7 = addressTelephone_7;
	}

	public String getAddressTelephone_8() {
		return addressTelephone_8;
	}

	public void setAddressTelephone_8(String addressTelephone_8) {
		this.addressTelephone_8 = addressTelephone_8;
	}

	public String getAddressTelephone_9() {
		return addressTelephone_9;
	}

	public void setAddressTelephone_9(String addressTelephone_9) {
		this.addressTelephone_9 = addressTelephone_9;
	}

	public String getAddressUniqueID_1() {
		return addressUniqueID_1;
	}

	public void setAddressUniqueID_1(String addressUniqueID_1) {
		this.addressUniqueID_1 = addressUniqueID_1;
	}

	public String getAddressUniqueID_10() {
		return addressUniqueID_10;
	}

	public void setAddressUniqueID_10(String addressUniqueID_10) {
		this.addressUniqueID_10 = addressUniqueID_10;
	}

	public String getAddressUniqueID_2() {
		return addressUniqueID_2;
	}

	public void setAddressUniqueID_2(String addressUniqueID_2) {
		this.addressUniqueID_2 = addressUniqueID_2;
	}

	public String getAddressUniqueID_3() {
		return addressUniqueID_3;
	}

	public void setAddressUniqueID_3(String addressUniqueID_3) {
		this.addressUniqueID_3 = addressUniqueID_3;
	}

	public String getAddressUniqueID_4() {
		return addressUniqueID_4;
	}

	public void setAddressUniqueID_4(String addressUniqueID_4) {
		this.addressUniqueID_4 = addressUniqueID_4;
	}

	public String getAddressUniqueID_5() {
		return addressUniqueID_5;
	}

	public void setAddressUniqueID_5(String addressUniqueID_5) {
		this.addressUniqueID_5 = addressUniqueID_5;
	}

	public String getAddressUniqueID_6() {
		return addressUniqueID_6;
	}

	public void setAddressUniqueID_6(String addressUniqueID_6) {
		this.addressUniqueID_6 = addressUniqueID_6;
	}

	public String getAddressUniqueID_7() {
		return addressUniqueID_7;
	}

	public void setAddressUniqueID_7(String addressUniqueID_7) {
		this.addressUniqueID_7 = addressUniqueID_7;
	}

	public String getAddressUniqueID_8() {
		return addressUniqueID_8;
	}

	public void setAddressUniqueID_8(String addressUniqueID_8) {
		this.addressUniqueID_8 = addressUniqueID_8;
	}

	public String getAddressUniqueID_9() {
		return addressUniqueID_9;
	}

	public void setAddressUniqueID_9(String addressUniqueID_9) {
		this.addressUniqueID_9 = addressUniqueID_9;
	}

	public String getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(String adminFee) {
		this.adminFee = adminFee;
	}

	public String getAdressNotes_1() {
		return adressNotes_1;
	}

	public void setAdressNotes_1(String adressNotes_1) {
		this.adressNotes_1 = adressNotes_1;
	}

	public String getAdressNotes_10() {
		return adressNotes_10;
	}

	public void setAdressNotes_10(String adressNotes_10) {
		this.adressNotes_10 = adressNotes_10;
	}

	public String getAdressNotes_2() {
		return adressNotes_2;
	}

	public void setAdressNotes_2(String adressNotes_2) {
		this.adressNotes_2 = adressNotes_2;
	}

	public String getAdressNotes_3() {
		return adressNotes_3;
	}

	public void setAdressNotes_3(String adressNotes_3) {
		this.adressNotes_3 = adressNotes_3;
	}

	public String getAdressNotes_4() {
		return adressNotes_4;
	}

	public void setAdressNotes_4(String adressNotes_4) {
		this.adressNotes_4 = adressNotes_4;
	}

	public String getAdressNotes_5() {
		return adressNotes_5;
	}

	public void setAdressNotes_5(String adressNotes_5) {
		this.adressNotes_5 = adressNotes_5;
	}

	public String getAdressNotes_6() {
		return adressNotes_6;
	}

	public void setAdressNotes_6(String adressNotes_6) {
		this.adressNotes_6 = adressNotes_6;
	}

	public String getAdressNotes_7() {
		return adressNotes_7;
	}

	public void setAdressNotes_7(String adressNotes_7) {
		this.adressNotes_7 = adressNotes_7;
	}

	public String getAdressNotes_8() {
		return adressNotes_8;
	}

	public void setAdressNotes_8(String adressNotes_8) {
		this.adressNotes_8 = adressNotes_8;
	}

	public String getAdressNotes_9() {
		return adressNotes_9;
	}

	public void setAdressNotes_9(String adressNotes_9) {
		this.adressNotes_9 = adressNotes_9;
	}

	public String getAlphaCode() {
		return alphaCode;
	}

	public void setAlphaCode(String alphaCode) {
		this.alphaCode = alphaCode;
	}

	public String getAltCurrency() {
		return altCurrency;
	}

	public void setAltCurrency(String altCurrency) {
		this.altCurrency = altCurrency;
	}

	public String getAnalysis1() {
		return analysis1;
	}

	public void setAnalysis1(String analysis1) {
		this.analysis1 = analysis1;
	}

	public String getAnalysis10() {
		return analysis10;
	}

	public void setAnalysis10(String analysis10) {
		this.analysis10 = analysis10;
	}

	public String getAnalysis11() {
		return analysis11;
	}

	public void setAnalysis11(String analysis11) {
		this.analysis11 = analysis11;
	}

	public String getAnalysis12() {
		return analysis12;
	}

	public void setAnalysis12(String analysis12) {
		this.analysis12 = analysis12;
	}

	public String getAnalysis13() {
		return analysis13;
	}

	public void setAnalysis13(String analysis13) {
		this.analysis13 = analysis13;
	}

	public String getAnalysis14() {
		return analysis14;
	}

	public void setAnalysis14(String analysis14) {
		this.analysis14 = analysis14;
	}

	public String getAnalysis15() {
		return analysis15;
	}

	public void setAnalysis15(String analysis15) {
		this.analysis15 = analysis15;
	}

	public String getAnalysis16() {
		return analysis16;
	}

	public void setAnalysis16(String analysis16) {
		this.analysis16 = analysis16;
	}

	public String getAnalysis17() {
		return analysis17;
	}

	public void setAnalysis17(String analysis17) {
		this.analysis17 = analysis17;
	}

	public String getAnalysis18() {
		return analysis18;
	}

	public void setAnalysis18(String analysis18) {
		this.analysis18 = analysis18;
	}

	public String getAnalysis19() {
		return analysis19;
	}

	public void setAnalysis19(String analysis19) {
		this.analysis19 = analysis19;
	}

	public String getAnalysis2() {
		return analysis2;
	}

	public void setAnalysis2(String analysis2) {
		this.analysis2 = analysis2;
	}

	public String getAnalysis20() {
		return analysis20;
	}

	public void setAnalysis20(String analysis20) {
		this.analysis20 = analysis20;
	}

	public String getAnalysis21() {
		return analysis21;
	}

	public void setAnalysis21(String analysis21) {
		this.analysis21 = analysis21;
	}

	public String getAnalysis22() {
		return analysis22;
	}

	public void setAnalysis22(String analysis22) {
		this.analysis22 = analysis22;
	}

	public String getAnalysis23() {
		return analysis23;
	}

	public void setAnalysis23(String analysis23) {
		this.analysis23 = analysis23;
	}

	public String getAnalysis24() {
		return analysis24;
	}

	public void setAnalysis24(String analysis24) {
		this.analysis24 = analysis24;
	}

	public String getAnalysis25() {
		return analysis25;
	}

	public void setAnalysis25(String analysis25) {
		this.analysis25 = analysis25;
	}

	public String getAnalysis26() {
		return analysis26;
	}

	public void setAnalysis26(String analysis26) {
		this.analysis26 = analysis26;
	}

	public String getAnalysis27() {
		return analysis27;
	}

	public void setAnalysis27(String analysis27) {
		this.analysis27 = analysis27;
	}

	public String getAnalysis28() {
		return analysis28;
	}

	public void setAnalysis28(String analysis28) {
		this.analysis28 = analysis28;
	}

	public String getAnalysis29() {
		return analysis29;
	}

	public void setAnalysis29(String analysis29) {
		this.analysis29 = analysis29;
	}

	public String getAnalysis3() {
		return analysis3;
	}

	public void setAnalysis3(String analysis3) {
		this.analysis3 = analysis3;
	}

	public String getAnalysis30() {
		return analysis30;
	}

	public void setAnalysis30(String analysis30) {
		this.analysis30 = analysis30;
	}

	public String getAnalysis4() {
		return analysis4;
	}

	public void setAnalysis4(String analysis4) {
		this.analysis4 = analysis4;
	}

	public String getAnalysis5() {
		return analysis5;
	}

	public void setAnalysis5(String analysis5) {
		this.analysis5 = analysis5;
	}

	public String getAnalysis6() {
		return analysis6;
	}

	public void setAnalysis6(String analysis6) {
		this.analysis6 = analysis6;
	}

	public String getAnalysis7() {
		return analysis7;
	}

	public void setAnalysis7(String analysis7) {
		this.analysis7 = analysis7;
	}

	public String getAnalysis8() {
		return analysis8;
	}

	public void setAnalysis8(String analysis8) {
		this.analysis8 = analysis8;
	}

	public String getAnalysis9() {
		return analysis9;
	}

	public void setAnalysis9(String analysis9) {
		this.analysis9 = analysis9;
	}

	public String getAnalysisCode6() {
		return analysisCode6;
	}

	public void setAnalysisCode6(String analysisCode6) {
		this.analysisCode6 = analysisCode6;
	}

	public String getAuxAccountType() {
		return auxAccountType;
	}

	public void setAuxAccountType(String auxAccountType) {
		this.auxAccountType = auxAccountType;
	}

	public String getAuxilaryComment() {
		return auxilaryComment;
	}

	public void setAuxilaryComment(String auxilaryComment) {
		this.auxilaryComment = auxilaryComment;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBalanceForwardMethod() {
		return balanceForwardMethod;
	}

	public void setBalanceForwardMethod(String balanceForwardMethod) {
		this.balanceForwardMethod = balanceForwardMethod;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
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

	public String getBankBranchCode() {
		return bankBranchCode;
	}

	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankRef() {
		return bankRef;
	}

	public void setBankRef(String bankRef) {
		this.bankRef = bankRef;
	}

	public String getBankSortCode() {
		return bankSortCode;
	}

	public void setBankSortCode(String bankSortCode) {
		this.bankSortCode = bankSortCode;
	}

	public String getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public String getBtx() {
		return btx;
	}

	public void setBtx(String btx) {
		this.btx = btx;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getChequeReturnedDate() {
		return chequeReturnedDate;
	}

	public void setChequeReturnedDate(String chequeReturnedDate) {
		this.chequeReturnedDate = chequeReturnedDate;
	}

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getControlDigit() {
		return controlDigit;
	}

	public void setControlDigit(String controlDigit) {
		this.controlDigit = controlDigit;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCpCharge() {
		return cpCharge;
	}

	public void setCpCharge(String cpCharge) {
		this.cpCharge = cpCharge;
	}

	public String getCpLowerValue() {
		return cpLowerValue;
	}

	public void setCpLowerValue(String cpLowerValue) {
		this.cpLowerValue = cpLowerValue;
	}

	public String getCreditCardCVVNo() {
		return creditCardCVVNo;
	}

	public void setCreditCardCVVNo(String creditCardCVVNo) {
		this.creditCardCVVNo = creditCardCVVNo;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCategory() {
		return creditCategory;
	}

	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

	public String getCreditClass() {
		return creditClass;
	}

	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}

	public String getCreditClassDescription() {
		return creditClassDescription;
	}

	public void setCreditClassDescription(String creditClassDescription) {
		this.creditClassDescription = creditClassDescription;
	}

	public String getCreditController() {
		return creditController;
	}

	public void setCreditController(String creditController) {
		this.creditController = creditController;
	}

	public String getCreditControllerDescription() {
		return creditControllerDescription;
	}

	public void setCreditControllerDescription(String creditControllerDescription) {
		this.creditControllerDescription = creditControllerDescription;
	}

	public String getCreditControllerTelephone() {
		return creditControllerTelephone;
	}

	public void setCreditControllerTelephone(String creditControllerTelephone) {
		this.creditControllerTelephone = creditControllerTelephone;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCreditLimitDowngrade() {
		return creditLimitDowngrade;
	}

	public void setCreditLimitDowngrade(String creditLimitDowngrade) {
		this.creditLimitDowngrade = creditLimitDowngrade;
	}

	public String getCreditLimitUpgrade() {
		return creditLimitUpgrade;
	}

	public void setCreditLimitUpgrade(String creditLimitUpgrade) {
		this.creditLimitUpgrade = creditLimitUpgrade;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

	public String getCumulativeSales() {
		return cumulativeSales;
	}

	public void setCumulativeSales(String cumulativeSales) {
		this.cumulativeSales = cumulativeSales;
	}

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCustomerClass() {
		return customerClass;
	}

	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerTitle() {
		return customerTitle;
	}

	public void setCustomerTitle(String customerTitle) {
		this.customerTitle = customerTitle;
	}

	public String getCustomersLanguage() {
		return customersLanguage;
	}

	public void setCustomersLanguage(String customersLanguage) {
		this.customersLanguage = customersLanguage;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateLastIssue() {
		return dateLastIssue;
	}

	public void setDateLastIssue(String dateLastIssue) {
		this.dateLastIssue = dateLastIssue;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDealerID() {
		return dealerID;
	}

	public void setDealerID(String dealerID) {
		this.dealerID = dealerID;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getDeliveryReason() {
		return deliveryReason;
	}

	public void setDeliveryReason(String deliveryReason) {
		this.deliveryReason = deliveryReason;
	}

	public String getDespatchHeld() {
		return despatchHeld;
	}

	public void setDespatchHeld(String despatchHeld) {
		this.despatchHeld = despatchHeld;
	}

	public String getDirectDebit() {
		return directDebit;
	}

	public void setDirectDebit(String directDebit) {
		this.directDebit = directDebit;
	}

	public String getDirectDebitConfirmationDate() {
		return directDebitConfirmationDate;
	}

	public void setDirectDebitConfirmationDate(String directDebitConfirmationDate) {
		this.directDebitConfirmationDate = directDebitConfirmationDate;
	}

	public String getDirectDebitSubmissionDate() {
		return directDebitSubmissionDate;
	}

	public void setDirectDebitSubmissionDate(String directDebitSubmissionDate) {
		this.directDebitSubmissionDate = directDebitSubmissionDate;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getEdiCustomerFlag() {
		return ediCustomerFlag;
	}

	public void setEdiCustomerFlag(String ediCustomerFlag) {
		this.ediCustomerFlag = ediCustomerFlag;
	}

	public String getEvaluateCreditLimit() {
		return evaluateCreditLimit;
	}

	public void setEvaluateCreditLimit(String evaluateCreditLimit) {
		this.evaluateCreditLimit = evaluateCreditLimit;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getExportIndicator() {
		return exportIndicator;
	}

	public void setExportIndicator(String exportIndicator) {
		this.exportIndicator = exportIndicator;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGroupReference() {
		return groupReference;
	}

	public void setGroupReference(String groupReference) {
		this.groupReference = groupReference;
	}

	public String getHandsetCount() {
		return handsetCount;
	}

	public void setHandsetCount(String handsetCount) {
		this.handsetCount = handsetCount;
	}

	public String getHierarchyName() {
		return hierarchyName;
	}

	public void setHierarchyName(String hierarchyName) {
		this.hierarchyName = hierarchyName;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getInvoiceAccount() {
		return invoiceAccount;
	}

	public void setInvoiceAccount(String invoiceAccount) {
		this.invoiceAccount = invoiceAccount;
	}

	public String getInvoiceAddressFlag_1() {
		return invoiceAddressFlag_1;
	}

	public void setInvoiceAddressFlag_1(String invoiceAddressFlag_1) {
		this.invoiceAddressFlag_1 = invoiceAddressFlag_1;
	}

	public String getInvoiceAddressFlag_10() {
		return invoiceAddressFlag_10;
	}

	public void setInvoiceAddressFlag_10(String invoiceAddressFlag_10) {
		this.invoiceAddressFlag_10 = invoiceAddressFlag_10;
	}

	public String getInvoiceAddressFlag_2() {
		return invoiceAddressFlag_2;
	}

	public void setInvoiceAddressFlag_2(String invoiceAddressFlag_2) {
		this.invoiceAddressFlag_2 = invoiceAddressFlag_2;
	}

	public String getInvoiceAddressFlag_3() {
		return invoiceAddressFlag_3;
	}

	public void setInvoiceAddressFlag_3(String invoiceAddressFlag_3) {
		this.invoiceAddressFlag_3 = invoiceAddressFlag_3;
	}

	public String getInvoiceAddressFlag_4() {
		return invoiceAddressFlag_4;
	}

	public void setInvoiceAddressFlag_4(String invoiceAddressFlag_4) {
		this.invoiceAddressFlag_4 = invoiceAddressFlag_4;
	}

	public String getInvoiceAddressFlag_5() {
		return invoiceAddressFlag_5;
	}

	public void setInvoiceAddressFlag_5(String invoiceAddressFlag_5) {
		this.invoiceAddressFlag_5 = invoiceAddressFlag_5;
	}

	public String getInvoiceAddressFlag_6() {
		return invoiceAddressFlag_6;
	}

	public void setInvoiceAddressFlag_6(String invoiceAddressFlag_6) {
		this.invoiceAddressFlag_6 = invoiceAddressFlag_6;
	}

	public String getInvoiceAddressFlag_7() {
		return invoiceAddressFlag_7;
	}

	public void setInvoiceAddressFlag_7(String invoiceAddressFlag_7) {
		this.invoiceAddressFlag_7 = invoiceAddressFlag_7;
	}

	public String getInvoiceAddressFlag_8() {
		return invoiceAddressFlag_8;
	}

	public void setInvoiceAddressFlag_8(String invoiceAddressFlag_8) {
		this.invoiceAddressFlag_8 = invoiceAddressFlag_8;
	}

	public String getInvoiceAddressFlag_9() {
		return invoiceAddressFlag_9;
	}

	public void setInvoiceAddressFlag_9(String invoiceAddressFlag_9) {
		this.invoiceAddressFlag_9 = invoiceAddressFlag_9;
	}

	public String getInvoiceAddressId() {
		return invoiceAddressId;
	}

	public void setInvoiceAddressId(String invoiceAddressId) {
		this.invoiceAddressId = invoiceAddressId;
	}

	public String getLastDepositStatus() {
		return lastDepositStatus;
	}

	public void setLastDepositStatus(String lastDepositStatus) {
		this.lastDepositStatus = lastDepositStatus;
	}

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

	public String getLimitMechanism() {
		return limitMechanism;
	}

	public void setLimitMechanism(String limitMechanism) {
		this.limitMechanism = limitMechanism;
	}

	public String getMaxNoSubscribers() {
		return maxNoSubscribers;
	}

	public void setMaxNoSubscribers(String maxNoSubscribers) {
		this.maxNoSubscribers = maxNoSubscribers;
	}

	public String getMaximumLimit() {
		return maximumLimit;
	}

	public void setMaximumLimit(String maximumLimit) {
		this.maximumLimit = maximumLimit;
	}

	public String getMinimumLimit() {
		return minimumLimit;
	}

	public void setMinimumLimit(String minimumLimit) {
		this.minimumLimit = minimumLimit;
	}

	public String getNoAccountDate() {
		return noAccountDate;
	}

	public void setNoAccountDate(String noAccountDate) {
		this.noAccountDate = noAccountDate;
	}

	public String getNoBarsDate() {
		return noBarsDate;
	}

	public void setNoBarsDate(String noBarsDate) {
		this.noBarsDate = noBarsDate;
	}

	public String getOrderBalance() {
		return orderBalance;
	}

	public void setOrderBalance(String orderBalance) {
		this.orderBalance = orderBalance;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPaidDeposit() {
		return paidDeposit;
	}

	public void setPaidDeposit(String paidDeposit) {
		this.paidDeposit = paidDeposit;
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

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPendingDeposit() {
		return pendingDeposit;
	}

	public void setPendingDeposit(String pendingDeposit) {
		this.pendingDeposit = pendingDeposit;
	}

	public String getPrePaidStatus() {
		return prePaidStatus;
	}

	public void setPrePaidStatus(String prePaidStatus) {
		this.prePaidStatus = prePaidStatus;
	}

	public String getPrefferedDebitDay() {
		return prefferedDebitDay;
	}

	public void setPrefferedDebitDay(String prefferedDebitDay) {
		this.prefferedDebitDay = prefferedDebitDay;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getPrintCpWithStat() {
		return printCpWithStat;
	}

	public void setPrintCpWithStat(String printCpWithStat) {
		this.printCpWithStat = printCpWithStat;
	}

	public String getProcessedMegaDownload() {
		return processedMegaDownload;
	}

	public void setProcessedMegaDownload(String processedMegaDownload) {
		this.processedMegaDownload = processedMegaDownload;
	}

	public String getProduceCommentOnlyInvoicesFlag() {
		return produceCommentOnlyInvoicesFlag;
	}

	public void setProduceCommentOnlyInvoicesFlag(String produceCommentOnlyInvoicesFlag) {
		this.produceCommentOnlyInvoicesFlag = produceCommentOnlyInvoicesFlag;
	}

	public String getProduceConsolidatedInvoicesFlag() {
		return produceConsolidatedInvoicesFlag;
	}

	public void setProduceConsolidatedInvoicesFlag(String produceConsolidatedInvoicesFlag) {
		this.produceConsolidatedInvoicesFlag = produceConsolidatedInvoicesFlag;
	}

	public String getProduceInvoicesFlag() {
		return produceInvoicesFlag;
	}

	public void setProduceInvoicesFlag(String produceInvoicesFlag) {
		this.produceInvoicesFlag = produceInvoicesFlag;
	}

	public String getProduceStatmentsFlag() {
		return produceStatmentsFlag;
	}

	public void setProduceStatmentsFlag(String produceStatmentsFlag) {
		this.produceStatmentsFlag = produceStatmentsFlag;
	}

	public String getProtectCode() {
		return protectCode;
	}

	public void setProtectCode(String protectCode) {
		this.protectCode = protectCode;
	}

	public String getReferToPayerDate() {
		return referToPayerDate;
	}

	public void setReferToPayerDate(String referToPayerDate) {
		this.referToPayerDate = referToPayerDate;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReminderCategory() {
		return reminderCategory;
	}

	public void setReminderCategory(String reminderCategory) {
		this.reminderCategory = reminderCategory;
	}

	public String getReminderLetterDate() {
		return reminderLetterDate;
	}

	public void setReminderLetterDate(String reminderLetterDate) {
		this.reminderLetterDate = reminderLetterDate;
	}

	public String getReminderLetters() {
		return reminderLetters;
	}

	public void setReminderLetters(String reminderLetters) {
		this.reminderLetters = reminderLetters;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getSalesNominalLedgerCategory() {
		return salesNominalLedgerCategory;
	}

	public void setSalesNominalLedgerCategory(String salesNominalLedgerCategory) {
		this.salesNominalLedgerCategory = salesNominalLedgerCategory;
	}

	public String getSalesType() {
		return salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getServiceProviderID() {
		return serviceProviderID;
	}

	public void setServiceProviderID(String serviceProviderID) {
		this.serviceProviderID = serviceProviderID;
	}

	public String getSettlementDays() {
		return settlementDays;
	}

	public void setSettlementDays(String settlementDays) {
		this.settlementDays = settlementDays;
	}

	public String getSettlementDiscount() {
		return settlementDiscount;
	}

	public void setSettlementDiscount(String settlementDiscount) {
		this.settlementDiscount = settlementDiscount;
	}

	public String getSeverityDays1() {
		return severityDays1;
	}

	public void setSeverityDays1(String severityDays1) {
		this.severityDays1 = severityDays1;
	}

	public String getSeverityDays2() {
		return severityDays2;
	}

	public void setSeverityDays2(String severityDays2) {
		this.severityDays2 = severityDays2;
	}

	public String getSeverityDays3() {
		return severityDays3;
	}

	public void setSeverityDays3(String severityDays3) {
		this.severityDays3 = severityDays3;
	}

	public String getSeverityDays4() {
		return severityDays4;
	}

	public void setSeverityDays4(String severityDays4) {
		this.severityDays4 = severityDays4;
	}

	public String getSeverityDays5() {
		return severityDays5;
	}

	public void setSeverityDays5(String severityDays5) {
		this.severityDays5 = severityDays5;
	}

	public String getSeverityDays6() {
		return severityDays6;
	}

	public void setSeverityDays6(String severityDays6) {
		this.severityDays6 = severityDays6;
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

	public String getShippingNoteIndicator() {
		return shippingNoteIndicator;
	}

	public void setShippingNoteIndicator(String shippingNoteIndicator) {
		this.shippingNoteIndicator = shippingNoteIndicator;
	}

	public String getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(String specialPrice) {
		this.specialPrice = specialPrice;
	}

	public String getSrFlag() {
		return srFlag;
	}

	public void setSrFlag(String srFlag) {
		this.srFlag = srFlag;
	}

	public String getStatementAccount() {
		return statementAccount;
	}

	public void setStatementAccount(String statementAccount) {
		this.statementAccount = statementAccount;
	}

	public String getStationeryType() {
		return stationeryType;
	}

	public void setStationeryType(String stationeryType) {
		this.stationeryType = stationeryType;
	}

	public String getSubGroupAccount() {
		return subGroupAccount;
	}

	public void setSubGroupAccount(String subGroupAccount) {
		this.subGroupAccount = subGroupAccount;
	}

	public String getSubscriberId_1() {
		return subscriberId_1;
	}

	public void setSubscriberId_1(String subscriberId_1) {
		this.subscriberId_1 = subscriberId_1;
	}

	public String getSubscriberId_10() {
		return subscriberId_10;
	}

	public void setSubscriberId_10(String subscriberId_10) {
		this.subscriberId_10 = subscriberId_10;
	}

	public String getSubscriberId_2() {
		return subscriberId_2;
	}

	public void setSubscriberId_2(String subscriberId_2) {
		this.subscriberId_2 = subscriberId_2;
	}

	public String getSubscriberId_3() {
		return subscriberId_3;
	}

	public void setSubscriberId_3(String subscriberId_3) {
		this.subscriberId_3 = subscriberId_3;
	}

	public String getSubscriberId_4() {
		return subscriberId_4;
	}

	public void setSubscriberId_4(String subscriberId_4) {
		this.subscriberId_4 = subscriberId_4;
	}

	public String getSubscriberId_5() {
		return subscriberId_5;
	}

	public void setSubscriberId_5(String subscriberId_5) {
		this.subscriberId_5 = subscriberId_5;
	}

	public String getSubscriberId_6() {
		return subscriberId_6;
	}

	public void setSubscriberId_6(String subscriberId_6) {
		this.subscriberId_6 = subscriberId_6;
	}

	public String getSubscriberId_7() {
		return subscriberId_7;
	}

	public void setSubscriberId_7(String subscriberId_7) {
		this.subscriberId_7 = subscriberId_7;
	}

	public String getSubscriberId_8() {
		return subscriberId_8;
	}

	public void setSubscriberId_8(String subscriberId_8) {
		this.subscriberId_8 = subscriberId_8;
	}

	public String getSubscriberId_9() {
		return subscriberId_9;
	}

	public void setSubscriberId_9(String subscriberId_9) {
		this.subscriberId_9 = subscriberId_9;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getVatExeNumber() {
		return vatExeNumber;
	}

	public void setVatExeNumber(String vatExeNumber) {
		this.vatExeNumber = vatExeNumber;
	}

	public String getVatRegNumber() {
		return vatRegNumber;
	}

	public void setVatRegNumber(String vatRegNumber) {
		this.vatRegNumber = vatRegNumber;
	}

	public String getVatRegistrationNo() {
		return vatRegistrationNo;
	}

	public void setVatRegistrationNo(String vatRegistrationNo) {
		this.vatRegistrationNo = vatRegistrationNo;
	}

	public String getVatType() {
		return vatType;
	}

	public void setVatType(String vatType) {
		this.vatType = vatType;
	}

	public String getYearToDateCostOfSales() {
		return yearToDateCostOfSales;
	}

	public void setYearToDateCostOfSales(String yearToDateCostOfSales) {
		this.yearToDateCostOfSales = yearToDateCostOfSales;
	}

	public String getYearToDateSales() {
		return yearToDateSales;
	}

	public void setYearToDateSales(String yearToDateSales) {
		this.yearToDateSales = yearToDateSales;
	}

	@Override
	public String toString() {
		return "\nCustomerGetRsp [CRMColour=" + CRMColour + "\nCRMKeyword=" + CRMKeyword + "\nCRMValue=" + CRMValue
				+ "\nIDNumber=" + IDNumber + "\naccType=" + accType + "\naccountNo_1=" + accountNo_1 + "\naccountNo_10="
				+ accountNo_10 + "\naccountNo_2=" + accountNo_2 + "\naccountNo_3=" + accountNo_3 + "\naccountNo_4="
				+ accountNo_4 + "\naccountNo_5=" + accountNo_5 + "\naccountNo_6=" + accountNo_6 + "\naccountNo_7="
				+ accountNo_7 + "\naccountNo_8=" + accountNo_8 + "\naccountNo_9=" + accountNo_9 + "\naccountNumber="
				+ accountNumber + "\naccountStatus=" + accountStatus + "\naccountTransferredDate="
				+ accountTransferredDate + "\naccountType=" + accountType + "\naddresInDate_1=" + addresInDate_1
				+ "\naddresInDate_10=" + addresInDate_10 + "\naddresInDate_2=" + addresInDate_2 + "\naddresInDate_3="
				+ addresInDate_3 + "\naddresInDate_4=" + addresInDate_4 + "\naddresInDate_5=" + addresInDate_5
				+ "\naddresInDate_6=" + addresInDate_6 + "\naddresInDate_7=" + addresInDate_7 + "\naddresInDate_8="
				+ addresInDate_8 + "\naddresInDate_9=" + addresInDate_9 + "\naddresType_1=" + addresType_1
				+ "\naddresType_10=" + addresType_10 + "\naddresType_2=" + addresType_2 + "\naddresType_3="
				+ addresType_3 + "\naddresType_4=" + addresType_4 + "\naddresType_5=" + addresType_5 + "\naddresType_6="
				+ addresType_6 + "\naddresType_7=" + addresType_7 + "\naddresType_8=" + addresType_8 + "\naddresType_9="
				+ addresType_9 + "\naddressClassification_1=" + addressClassification_1 + "\naddressClassification_10="
				+ addressClassification_10 + "\naddressClassification_2=" + addressClassification_2
				+ "\naddressClassification_3=" + addressClassification_3 + "\naddressClassification_4="
				+ addressClassification_4 + "\naddressClassification_5=" + addressClassification_5
				+ "\naddressClassification_6=" + addressClassification_6 + "\naddressClassification_7="
				+ addressClassification_7 + "\naddressClassification_8=" + addressClassification_8
				+ "\naddressClassification_9=" + addressClassification_9 + "\naddressContact_1=" + addressContact_1
				+ "\naddressContact_10=" + addressContact_10 + "\naddressContact_2=" + addressContact_2
				+ "\naddressContact_3=" + addressContact_3 + "\naddressContact_4=" + addressContact_4
				+ "\naddressContact_5=" + addressContact_5 + "\naddressContact_6=" + addressContact_6
				+ "\naddressContact_7=" + addressContact_7 + "\naddressContact_8=" + addressContact_8
				+ "\naddressContact_9=" + addressContact_9 + "\naddressEMail_1=" + addressEMail_1 + "\naddressEMail_10="
				+ addressEMail_10 + "\naddressEMail_2=" + addressEMail_2 + "\naddressEMail_3=" + addressEMail_3
				+ "\naddressEMail_4=" + addressEMail_4 + "\naddressEMail_5=" + addressEMail_5 + "\naddressEMail_6="
				+ addressEMail_6 + "\naddressEMail_7=" + addressEMail_7 + "\naddressEMail_8=" + addressEMail_8
				+ "\naddressEMail_9=" + addressEMail_9 + "\naddressFax_1=" + addressFax_1 + "\naddressFax_10="
				+ addressFax_10 + "\naddressFax_2=" + addressFax_2 + "\naddressFax_3=" + addressFax_3
				+ "\naddressFax_4=" + addressFax_4 + "\naddressFax_5=" + addressFax_5 + "\naddressFax_6=" + addressFax_6
				+ "\naddressFax_7=" + addressFax_7 + "\naddressFax_8=" + addressFax_8 + "\naddressFax_9=" + addressFax_9
				+ "\naddressGeneral1_1=" + addressGeneral1_1 + "\naddressGeneral1_10=" + addressGeneral1_10
				+ "\naddressGeneral1_2=" + addressGeneral1_2 + "\naddressGeneral1_3=" + addressGeneral1_3
				+ "\naddressGeneral1_4=" + addressGeneral1_4 + "\naddressGeneral1_5=" + addressGeneral1_5
				+ "\naddressGeneral1_6=" + addressGeneral1_6 + "\naddressGeneral1_7=" + addressGeneral1_7
				+ "\naddressGeneral1_8=" + addressGeneral1_8 + "\naddressGeneral1_9=" + addressGeneral1_9
				+ "\naddressGeneral2_1=" + addressGeneral2_1 + "\naddressGeneral2_10=" + addressGeneral2_10
				+ "\naddressGeneral2_2=" + addressGeneral2_2 + "\naddressGeneral2_3=" + addressGeneral2_3
				+ "\naddressGeneral2_4=" + addressGeneral2_4 + "\naddressGeneral2_5=" + addressGeneral2_5
				+ "\naddressGeneral2_6=" + addressGeneral2_6 + "\naddressGeneral2_7=" + addressGeneral2_7
				+ "\naddressGeneral2_8=" + addressGeneral2_8 + "\naddressGeneral2_9=" + addressGeneral2_9
				+ "\naddressGeneral3_1=" + addressGeneral3_1 + "\naddressGeneral3_10=" + addressGeneral3_10
				+ "\naddressGeneral3_2=" + addressGeneral3_2 + "\naddressGeneral3_3=" + addressGeneral3_3
				+ "\naddressGeneral3_4=" + addressGeneral3_4 + "\naddressGeneral3_5=" + addressGeneral3_5
				+ "\naddressGeneral3_6=" + addressGeneral3_6 + "\naddressGeneral3_7=" + addressGeneral3_7
				+ "\naddressGeneral3_8=" + addressGeneral3_8 + "\naddressGeneral3_9=" + addressGeneral3_9
				+ "\naddressID_1=" + addressID_1 + "\naddressID_10=" + addressID_10 + "\naddressID_2=" + addressID_2
				+ "\naddressID_3=" + addressID_3 + "\naddressID_4=" + addressID_4 + "\naddressID_5=" + addressID_5
				+ "\naddressID_6=" + addressID_6 + "\naddressID_7=" + addressID_7 + "\naddressID_8=" + addressID_8
				+ "\naddressID_9=" + addressID_9 + "\naddressLine1_1=" + addressLine1_1 + "\naddressLine1_10="
				+ addressLine1_10 + "\naddressLine1_2=" + addressLine1_2 + "\naddressLine1_3=" + addressLine1_3
				+ "\naddressLine1_4=" + addressLine1_4 + "\naddressLine1_5=" + addressLine1_5 + "\naddressLine1_6="
				+ addressLine1_6 + "\naddressLine1_7=" + addressLine1_7 + "\naddressLine1_8=" + addressLine1_8
				+ "\naddressLine1_9=" + addressLine1_9 + "\naddressLine2_1=" + addressLine2_1 + "\naddressLine2_10="
				+ addressLine2_10 + "\naddressLine2_2=" + addressLine2_2 + "\naddressLine2_3=" + addressLine2_3
				+ "\naddressLine2_4=" + addressLine2_4 + "\naddressLine2_5=" + addressLine2_5 + "\naddressLine2_6="
				+ addressLine2_6 + "\naddressLine2_7=" + addressLine2_7 + "\naddressLine2_8=" + addressLine2_8
				+ "\naddressLine2_9=" + addressLine2_9 + "\naddressLine3_1=" + addressLine3_1 + "\naddressLine3_10="
				+ addressLine3_10 + "\naddressLine3_2=" + addressLine3_2 + "\naddressLine3_3=" + addressLine3_3
				+ "\naddressLine3_4=" + addressLine3_4 + "\naddressLine3_5=" + addressLine3_5 + "\naddressLine3_6="
				+ addressLine3_6 + "\naddressLine3_7=" + addressLine3_7 + "\naddressLine3_8=" + addressLine3_8
				+ "\naddressLine3_9=" + addressLine3_9 + "\naddressLine4_1=" + addressLine4_1 + "\naddressLine4_10="
				+ addressLine4_10 + "\naddressLine4_2=" + addressLine4_2 + "\naddressLine4_3=" + addressLine4_3
				+ "\naddressLine4_4=" + addressLine4_4 + "\naddressLine4_5=" + addressLine4_5 + "\naddressLine4_6="
				+ addressLine4_6 + "\naddressLine4_7=" + addressLine4_7 + "\naddressLine4_8=" + addressLine4_8
				+ "\naddressLine4_9=" + addressLine4_9 + "\naddressLine5_1=" + addressLine5_1 + "\naddressLine5_10="
				+ addressLine5_10 + "\naddressLine5_2=" + addressLine5_2 + "\naddressLine5_3=" + addressLine5_3
				+ "\naddressLine5_4=" + addressLine5_4 + "\naddressLine5_5=" + addressLine5_5 + "\naddressLine5_6="
				+ addressLine5_6 + "\naddressLine5_7=" + addressLine5_7 + "\naddressLine5_8=" + addressLine5_8
				+ "\naddressLine5_9=" + addressLine5_9 + "\naddressLine6_1=" + addressLine6_1 + "\naddressLine6_10="
				+ addressLine6_10 + "\naddressLine6_2=" + addressLine6_2 + "\naddressLine6_3=" + addressLine6_3
				+ "\naddressLine6_4=" + addressLine6_4 + "\naddressLine6_5=" + addressLine6_5 + "\naddressLine6_6="
				+ addressLine6_6 + "\naddressLine6_7=" + addressLine6_7 + "\naddressLine6_8=" + addressLine6_8
				+ "\naddressLine6_9=" + addressLine6_9 + "\naddressName_1=" + addressName_1 + "\naddressName_10="
				+ addressName_10 + "\naddressName_2=" + addressName_2 + "\naddressName_3=" + addressName_3
				+ "\naddressName_4=" + addressName_4 + "\naddressName_5=" + addressName_5 + "\naddressName_6="
				+ addressName_6 + "\naddressName_7=" + addressName_7 + "\naddressName_8=" + addressName_8
				+ "\naddressName_9=" + addressName_9 + "\naddressPostCode_1=" + addressPostCode_1
				+ "\naddressPostCode_10=" + addressPostCode_10 + "\naddressPostCode_2=" + addressPostCode_2
				+ "\naddressPostCode_3=" + addressPostCode_3 + "\naddressPostCode_4=" + addressPostCode_4
				+ "\naddressPostCode_5=" + addressPostCode_5 + "\naddressPostCode_6=" + addressPostCode_6
				+ "\naddressPostCode_7=" + addressPostCode_7 + "\naddressPostCode_8=" + addressPostCode_8
				+ "\naddressPostCode_9=" + addressPostCode_9 + "\naddressTelephone2_1=" + addressTelephone2_1
				+ "\naddressTelephone2_10=" + addressTelephone2_10 + "\naddressTelephone2_2=" + addressTelephone2_2
				+ "\naddressTelephone2_3=" + addressTelephone2_3 + "\naddressTelephone2_4=" + addressTelephone2_4
				+ "\naddressTelephone2_5=" + addressTelephone2_5 + "\naddressTelephone2_6=" + addressTelephone2_6
				+ "\naddressTelephone2_7=" + addressTelephone2_7 + "\naddressTelephone2_8=" + addressTelephone2_8
				+ "\naddressTelephone2_9=" + addressTelephone2_9 + "\naddressTelephone_1=" + addressTelephone_1
				+ "\naddressTelephone_10=" + addressTelephone_10 + "\naddressTelephone_2=" + addressTelephone_2
				+ "\naddressTelephone_3=" + addressTelephone_3 + "\naddressTelephone_4=" + addressTelephone_4
				+ "\naddressTelephone_5=" + addressTelephone_5 + "\naddressTelephone_6=" + addressTelephone_6
				+ "\naddressTelephone_7=" + addressTelephone_7 + "\naddressTelephone_8=" + addressTelephone_8
				+ "\naddressTelephone_9=" + addressTelephone_9 + "\naddressUniqueID_1=" + addressUniqueID_1
				+ "\naddressUniqueID_10=" + addressUniqueID_10 + "\naddressUniqueID_2=" + addressUniqueID_2
				+ "\naddressUniqueID_3=" + addressUniqueID_3 + "\naddressUniqueID_4=" + addressUniqueID_4
				+ "\naddressUniqueID_5=" + addressUniqueID_5 + "\naddressUniqueID_6=" + addressUniqueID_6
				+ "\naddressUniqueID_7=" + addressUniqueID_7 + "\naddressUniqueID_8=" + addressUniqueID_8
				+ "\naddressUniqueID_9=" + addressUniqueID_9 + "\nadminFee=" + adminFee + "\nadressNotes_1="
				+ adressNotes_1 + "\nadressNotes_10=" + adressNotes_10 + "\nadressNotes_2=" + adressNotes_2
				+ "\nadressNotes_3=" + adressNotes_3 + "\nadressNotes_4=" + adressNotes_4 + "\nadressNotes_5="
				+ adressNotes_5 + "\nadressNotes_6=" + adressNotes_6 + "\nadressNotes_7=" + adressNotes_7
				+ "\nadressNotes_8=" + adressNotes_8 + "\nadressNotes_9=" + adressNotes_9 + "\nalphaCode=" + alphaCode
				+ "\naltCurrency=" + altCurrency + "\nanalysis1=" + analysis1 + "\nanalysis10=" + analysis10
				+ "\nanalysis11=" + analysis11 + "\nanalysis12=" + analysis12 + "\nanalysis13=" + analysis13
				+ "\nanalysis14=" + analysis14 + "\nanalysis15=" + analysis15 + "\nanalysis16=" + analysis16
				+ "\nanalysis17=" + analysis17 + "\nanalysis18=" + analysis18 + "\nanalysis19=" + analysis19
				+ "\nanalysis2=" + analysis2 + "\nanalysis20=" + analysis20 + "\nanalysis21=" + analysis21
				+ "\nanalysis22=" + analysis22 + "\nanalysis23=" + analysis23 + "\nanalysis24=" + analysis24
				+ "\nanalysis25=" + analysis25 + "\nanalysis26=" + analysis26 + "\nanalysis27=" + analysis27
				+ "\nanalysis28=" + analysis28 + "\nanalysis29=" + analysis29 + "\nanalysis3=" + analysis3
				+ "\nanalysis30=" + analysis30 + "\nanalysis4=" + analysis4 + "\nanalysis5=" + analysis5
				+ "\nanalysis6=" + analysis6 + "\nanalysis7=" + analysis7 + "\nanalysis8=" + analysis8 + "\nanalysis9="
				+ analysis9 + "\nanalysisCode1=" + analysisCode1 + "\nanalysisCode2=" + analysisCode2 + "\nanalysisCode3=" + analysisCode3
				+ "\nanalysisCode6=" + analysisCode6 + "\nanalysisCode4=" + analysisCode4 + "\nanalysisCode5=" + analysisCode5
				+ "\nauxAccountType=" + auxAccountType + "\nauxilaryComment=" + auxilaryComment + "\nbalance=" + balance
				+ "\nbalanceForwardMethod=" + balanceForwardMethod + "\nbankAccountName=" + bankAccountName
				+ "\nbankAccountNo=" + bankAccountNo + "\nbankAccountType=" + bankAccountType + "\nbankAddress1="
				+ bankAddress1 + "\nbankAddress2=" + bankAddress2 + "\nbankAddress3=" + bankAddress3 + "\nbankAddress4="
				+ bankAddress4 + "\nbankBranchCode=" + bankBranchCode + "\nbankName=" + bankName + "\nbankRef="
				+ bankRef + "\nbankSortCode=" + bankSortCode + "\nbillingCycle=" + billingCycle + "\nbtx=" + btx
				+ "\ncarrier=" + carrier + "\nchequeReturnedDate=" + chequeReturnedDate + "\ncompanyRegNo="
				+ companyRegNo + "\ncontrolDigit=" + controlDigit + "\ncountryCode=" + countryCode + "\ncpCharge="
				+ cpCharge + "\ncpLowerValue=" + cpLowerValue + "\ncreditCardCVVNo=" + creditCardCVVNo
				+ "\ncreditCardName=" + creditCardName + "\ncreditCardNumber=" + creditCardNumber + "\ncreditCategory="
				+ creditCategory + "\ncreditClass=" + creditClass + "\ncreditClassDescription=" + creditClassDescription
				+ "\ncreditController=" + creditController + "\ncreditControllerDescription="
				+ creditControllerDescription + "\ncreditControllerTelephone=" + creditControllerTelephone
				+ "\ncreditLimit=" + creditLimit + "\ncreditLimitDowngrade=" + creditLimitDowngrade
				+ "\ncreditLimitUpgrade=" + creditLimitUpgrade + "\ncreditScore=" + creditScore + "\ncumulativeSales="
				+ cumulativeSales + "\ncurrency1=" + currency1 + "\ncustomerClass=" + customerClass + "\ncustomerName="
				+ customerName + "\ncustomerTitle=" + customerTitle + "\ncustomersLanguage=" + customersLanguage
				+ "\ndateCreated=" + dateCreated + "\ndateLastIssue=" + dateLastIssue + "\ndateOfBirth=" + dateOfBirth
				+ "\ndealerID=" + dealerID + "\ndeliveryMethod=" + deliveryMethod + "\ndeliveryReason=" + deliveryReason
				+ "\ndespatchHeld=" + despatchHeld + "\ndirectDebit=" + directDebit + "\ndirectDebitConfirmationDate="
				+ directDebitConfirmationDate + "\ndirectDebitSubmissionDate=" + directDebitSubmissionDate
				+ "\ndiscountCode=" + discountCode + "\nediCustomerFlag=" + ediCustomerFlag + "\nevaluateCreditLimit="
				+ evaluateCreditLimit + "\nexpiryDate=" + expiryDate + "\nexportIndicator=" + exportIndicator
				+ "\nfirstName=" + firstName + "\ngender=" + gender + "\ngroupReference=" + groupReference
				+ "\nhandsetCount=" + handsetCount + "\nhierarchyName=" + hierarchyName + "\ninterestRate="
				+ interestRate + "\ninvoiceAccount=" + invoiceAccount + "\ninvoiceAddressFlag_1=" + invoiceAddressFlag_1
				+ "\ninvoiceAddressFlag_10=" + invoiceAddressFlag_10 + "\ninvoiceAddressFlag_2=" + invoiceAddressFlag_2
				+ "\ninvoiceAddressFlag_3=" + invoiceAddressFlag_3 + "\ninvoiceAddressFlag_4=" + invoiceAddressFlag_4
				+ "\ninvoiceAddressFlag_5=" + invoiceAddressFlag_5 + "\ninvoiceAddressFlag_6=" + invoiceAddressFlag_6
				+ "\ninvoiceAddressFlag_7=" + invoiceAddressFlag_7 + "\ninvoiceAddressFlag_8=" + invoiceAddressFlag_8
				+ "\ninvoiceAddressFlag_9=" + invoiceAddressFlag_9 + "\ninvoiceAddressId=" + invoiceAddressId
				+ "\nlastDepositStatus=" + lastDepositStatus + "\nletterCode=" + letterCode + "\nlimitMechanism="
				+ limitMechanism + "\nmaxNoSubscribers=" + maxNoSubscribers + "\nmaximumLimit=" + maximumLimit
				+ "\nminimumLimit=" + minimumLimit + "\nnoAccountDate=" + noAccountDate + "\nnoBarsDate=" + noBarsDate
				+ "\norderBalance=" + orderBalance + "\npackageCode=" + packageCode + "\npaidDeposit=" + paidDeposit
				+ "\npaydays1=" + paydays1 + "\npaydays2=" + paydays2 + "\npaydays3=" + paydays3 + "\npayer=" + payer
				+ "\npaymentMethod=" + paymentMethod + "\npaymentType=" + paymentType + "\npendingDeposit="
				+ pendingDeposit + "\nprePaidStatus=" + prePaidStatus + "\nprefferedDebitDay=" + prefferedDebitDay
				+ "\npriceList=" + priceList + "\nprintCpWithStat=" + printCpWithStat + "\nprocessedMegaDownload="
				+ processedMegaDownload + "\nproduceCommentOnlyInvoicesFlag=" + produceCommentOnlyInvoicesFlag
				+ "\nproduceConsolidatedInvoicesFlag=" + produceConsolidatedInvoicesFlag + "\nproduceInvoicesFlag="
				+ produceInvoicesFlag + "\nproduceStatmentsFlag=" + produceStatmentsFlag + "\nprotectCode="
				+ protectCode + "\nreferToPayerDate=" + referToPayerDate + "\nregion=" + region + "\nreminderCategory="
				+ reminderCategory + "\nreminderLetterDate=" + reminderLetterDate + "\nreminderLetters="
				+ reminderLetters + "\nresponsibility=" + responsibility + "\nsalesNominalLedgerCategory="
				+ salesNominalLedgerCategory + "\nsalesType=" + salesType + "\nsalesman=" + salesman
				+ "\nserviceProviderID=" + serviceProviderID + "\nsettlementDays=" + settlementDays
				+ "\nsettlementDiscount=" + settlementDiscount + "\nseverityDays1=" + severityDays1 + "\nseverityDays2="
				+ severityDays2 + "\nseverityDays3=" + severityDays3 + "\nseverityDays4=" + severityDays4
				+ "\nseverityDays5=" + severityDays5 + "\nseverityDays6=" + severityDays6 + "\nshipperCode1="
				+ shipperCode1 + "\nshipperCode2=" + shipperCode2 + "\nshipperCode3=" + shipperCode3
				+ "\nshippingNoteIndicator=" + shippingNoteIndicator + "\nspecialPrice=" + specialPrice + "\nsrFlag="
				+ srFlag + "\nstatementAccount=" + statementAccount + "\nstationeryType=" + stationeryType
				+ "\nsubGroupAccount=" + subGroupAccount + "\nsubscriberId_1=" + subscriberId_1 + "\nsubscriberId_10="
				+ subscriberId_10 + "\nsubscriberId_2=" + subscriberId_2 + "\nsubscriberId_3=" + subscriberId_3
				+ "\nsubscriberId_4=" + subscriberId_4 + "\nsubscriberId_5=" + subscriberId_5 + "\nsubscriberId_6="
				+ subscriberId_6 + "\nsubscriberId_7=" + subscriberId_7 + "\nsubscriberId_8=" + subscriberId_8
				+ "\nsubscriberId_9=" + subscriberId_9 + "\nterritory=" + territory + "\nvatExeNumber=" + vatExeNumber
				+ "\nvatRegNumber=" + vatRegNumber + "\nvatRegistrationNo=" + vatRegistrationNo + "\nvatType=" + vatType
				+ "\nyearToDateCostOfSales=" + yearToDateCostOfSales + "\nyearToDateSales=" + yearToDateSales + "]";
	}

	public String getAnalysisCode1() {
		return analysisCode1;
	}

	public void setAnalysisCode1(String analysisCode1) {
		this.analysisCode1 = analysisCode1;
	}

	public String getAnalysisCode2() {
		return analysisCode2;
	}

	public void setAnalysisCode2(String analysisCode2) {
		this.analysisCode2 = analysisCode2;
	}

	public String getAnalysisCode3() {
		return analysisCode3;
	}

	public void setAnalysisCode3(String analysisCode3) {
		this.analysisCode3 = analysisCode3;
	}

	public String getAnalysisCode4() {
		return analysisCode4;
	}

	public void setAnalysisCode4(String analysisCode4) {
		this.analysisCode4 = analysisCode4;
	}

	public String getAnalysisCode5() {
		return analysisCode5;
	}

	public void setAnalysisCode5(String analysisCode5) {
		this.analysisCode5 = analysisCode5;
	}
	
	

}
