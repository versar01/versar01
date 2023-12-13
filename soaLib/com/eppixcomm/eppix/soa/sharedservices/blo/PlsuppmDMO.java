package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PlsuppmDMO extends DBO implements Serializable {


	private String supplier;
	private String alpha;
	private String name;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String address5;
	private String currency;
	private String letterCode;
	private String payIndicator;
	private String payTerms;
	private String payType;
	private String bankAccount;
	private String bankCode;
	private String bankName;
	private String bankBranch;
	private Date dateLastSale;
	private Date dateCreated;
	private String analysisCodes1;
	private String analysisCodes2;
	private String analysisCodes3;
	private String balanceFwdInd;
	private Float ytdSales;
	private Float cumulativeSales;
	private String paymentReference;
	private String analysisCodes21;
	private String analysisCodes22;
	private String analysisCodes23;
	private String vatType;
	private String vatRegNumber;
	private String address6;
	private String fax;
	private String telex;
	private String btx;
	private String priceList;
	private String specialPriceList;
	private String popDiscountCat;
	private String spare;
	private String supplierCategory;
	private String ediSupplier;
	private String accountType;
	private String settCategory;
	private String citSupplier;



	public static final int supplierFilter = 0;
	private static final int supplierSize = 8;


	public static final int alphaFilter = 1;
	private static final int alphaSize = 8;


	public static final int nameFilter = 2;
	private static final int nameSize = 32;


	public static final int address1Filter = 3;
	private static final int address1Size = 32;


	public static final int address2Filter = 4;
	private static final int address2Size = 32;


	public static final int address3Filter = 5;
	private static final int address3Size = 32;


	public static final int address4Filter = 6;
	private static final int address4Size = 32;


	public static final int address5Filter = 7;
	private static final int address5Size = 32;


	public static final int currencyFilter = 8;
	private static final int currencySize = 3;


	public static final int letterCodeFilter = 9;
	private static final int letterCodeSize = 3;


	public static final int payIndicatorFilter = 10;
	private static final int payIndicatorSize = 1;


	public static final int payTermsFilter = 11;
	private static final int payTermsSize = 10;


	public static final int payTypeFilter = 12;
	private static final int payTypeSize = 1;


	public static final int bankAccountFilter = 13;
	private static final int bankAccountSize = 20;


	public static final int bankCodeFilter = 14;
	private static final int bankCodeSize = 20;


	public static final int bankNameFilter = 15;
	private static final int bankNameSize = 30;


	public static final int bankBranchFilter = 16;
	private static final int bankBranchSize = 30;


	public static final int dateLastSaleFilter = 17;

	public static final int dateCreatedFilter = 18;

	public static final int analysisCodes1Filter = 19;
	private static final int analysisCodes1Size = 10;


	public static final int analysisCodes2Filter = 20;
	private static final int analysisCodes2Size = 10;


	public static final int analysisCodes3Filter = 21;
	private static final int analysisCodes3Size = 10;


	public static final int balanceFwdIndFilter = 22;
	private static final int balanceFwdIndSize = 1;


	public static final int ytdSalesFilter = 23;

	public static final int cumulativeSalesFilter = 24;

	public static final int paymentReferenceFilter = 25;
	private static final int paymentReferenceSize = 8;


	public static final int analysisCodes21Filter = 26;
	private static final int analysisCodes21Size = 10;


	public static final int analysisCodes22Filter = 27;
	private static final int analysisCodes22Size = 10;


	public static final int analysisCodes23Filter = 28;
	private static final int analysisCodes23Size = 10;


	public static final int vatTypeFilter = 29;
	private static final int vatTypeSize = 10;


	public static final int vatRegNumberFilter = 30;
	private static final int vatRegNumberSize = 16;


	public static final int address6Filter = 31;
	private static final int address6Size = 32;


	public static final int faxFilter = 32;
	private static final int faxSize = 30;


	public static final int telexFilter = 33;
	private static final int telexSize = 30;


	public static final int btxFilter = 34;
	private static final int btxSize = 30;


	public static final int priceListFilter = 35;
	private static final int priceListSize = 3;


	public static final int specialPriceListFilter = 36;
	private static final int specialPriceListSize = 3;


	public static final int popDiscountCatFilter = 37;
	private static final int popDiscountCatSize = 4;


	public static final int spareFilter = 38;
	private static final int spareSize = 1;


	public static final int supplierCategoryFilter = 39;
	private static final int supplierCategorySize = 3;


	public static final int ediSupplierFilter = 40;
	private static final int ediSupplierSize = 1;


	public static final int accountTypeFilter = 41;
	private static final int accountTypeSize = 3;


	public static final int settCategoryFilter = 42;
	private static final int settCategorySize = 2;


	public static final int citSupplierFilter = 43;
	private static final int citSupplierSize = 1;





	public PlsuppmDMO(){};

	public PlsuppmDMO(final String supplier,
	final String alpha,
	final String name,
	final String address1,
	final String address2,
	final String address3,
	final String address4,
	final String address5,
	final String currency,
	final String letterCode,
	final String payIndicator,
	final String payTerms,
	final String payType,
	final String bankAccount,
	final String bankCode,
	final String bankName,
	final String bankBranch,
	final Date dateLastSale,
	final Date dateCreated,
	final String analysisCodes1,
	final String analysisCodes2,
	final String analysisCodes3,
	final String balanceFwdInd,
	final Float ytdSales,
	final Float cumulativeSales,
	final String paymentReference,
	final String analysisCodes21,
	final String analysisCodes22,
	final String analysisCodes23,
	final String vatType,
	final String vatRegNumber,
	final String address6,
	final String fax,
	final String telex,
	final String btx,
	final String priceList,
	final String specialPriceList,
	final String popDiscountCat,
	final String spare,
	final String supplierCategory,
	final String ediSupplier,
	final String accountType,
	final String settCategory,
	final String citSupplier
	){

	this.supplier = supplier;
	this.alpha = alpha;
	this.name = name;
	this.address1 = address1;
	this.address2 = address2;
	this.address3 = address3;
	this.address4 = address4;
	this.address5 = address5;
	this.currency = currency;
	this.letterCode = letterCode;
	this.payIndicator = payIndicator;
	this.payTerms = payTerms;
	this.payType = payType;
	this.bankAccount = bankAccount;
	this.bankCode = bankCode;
	this.bankName = bankName;
	this.bankBranch = bankBranch;
	this.dateLastSale = dateLastSale;
	this.dateCreated = dateCreated;
	this.analysisCodes1 = analysisCodes1;
	this.analysisCodes2 = analysisCodes2;
	this.analysisCodes3 = analysisCodes3;
	this.balanceFwdInd = balanceFwdInd;
	this.ytdSales = ytdSales;
	this.cumulativeSales = cumulativeSales;
	this.paymentReference = paymentReference;
	this.analysisCodes21 = analysisCodes21;
	this.analysisCodes22 = analysisCodes22;
	this.analysisCodes23 = analysisCodes23;
	this.vatType = vatType;
	this.vatRegNumber = vatRegNumber;
	this.address6 = address6;
	this.fax = fax;
	this.telex = telex;
	this.btx = btx;
	this.priceList = priceList;
	this.specialPriceList = specialPriceList;
	this.popDiscountCat = popDiscountCat;
	this.spare = spare;
	this.supplierCategory = supplierCategory;
	this.ediSupplier = ediSupplier;
	this.accountType = accountType;
	this.settCategory = settCategory;
	this.citSupplier = citSupplier;
	};


	private static final int[] fieldSizes = new int[]{
	supplierSize,
	alphaSize,
	nameSize,
	address1Size,
	address2Size,
	address3Size,
	address4Size,
	address5Size,
	currencySize,
	letterCodeSize,
	payIndicatorSize,
	payTermsSize,
	payTypeSize,
	bankAccountSize,
	bankCodeSize,
	bankNameSize,
	bankBranchSize,
	0,
	0,
	analysisCodes1Size,
	analysisCodes2Size,
	analysisCodes3Size,
	balanceFwdIndSize,
	0,
	0,
	paymentReferenceSize,
	analysisCodes21Size,
	analysisCodes22Size,
	analysisCodes23Size,
	vatTypeSize,
	vatRegNumberSize,
	address6Size,
	faxSize,
	telexSize,
	btxSize,
	priceListSize,
	specialPriceListSize,
	popDiscountCatSize,
	spareSize,
	supplierCategorySize,
	ediSupplierSize,
	accountTypeSize,
	settCategorySize,
	citSupplierSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_DATE,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_FLOAT,
	FIELD_TYPE_FLOAT,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			((this.supplier == null) ? null : (this.supplier.length() <= supplierSize) ? this.supplier : this.supplier.substring(0, this.supplierSize)),
				((this.alpha == null) ? null : (this.alpha.length() <= alphaSize) ? this.alpha : this.alpha.substring(0, this.alphaSize)),
				((this.name == null) ? null : (this.name.length() <= nameSize) ? this.name : this.name.substring(0, this.nameSize)),
				((this.address1 == null) ? null : (this.address1.length() <= address1Size) ? this.address1 : this.address1.substring(0, this.address1Size)),
				((this.address2 == null) ? null : (this.address2.length() <= address2Size) ? this.address2 : this.address2.substring(0, this.address2Size)),
				((this.address3 == null) ? null : (this.address3.length() <= address3Size) ? this.address3 : this.address3.substring(0, this.address3Size)),
				((this.address4 == null) ? null : (this.address4.length() <= address4Size) ? this.address4 : this.address4.substring(0, this.address4Size)),
				((this.address5 == null) ? null : (this.address5.length() <= address5Size) ? this.address5 : this.address5.substring(0, this.address5Size)),
				((this.currency == null) ? null : (this.currency.length() <= currencySize) ? this.currency : this.currency.substring(0, this.currencySize)),
				((this.letterCode == null) ? null : (this.letterCode.length() <= letterCodeSize) ? this.letterCode : this.letterCode.substring(0, this.letterCodeSize)),
				((this.payIndicator == null) ? null : (this.payIndicator.length() <= payIndicatorSize) ? this.payIndicator : this.payIndicator.substring(0, this.payIndicatorSize)),
				((this.payTerms == null) ? null : (this.payTerms.length() <= payTermsSize) ? this.payTerms : this.payTerms.substring(0, this.payTermsSize)),
				((this.payType == null) ? null : (this.payType.length() <= payTypeSize) ? this.payType : this.payType.substring(0, this.payTypeSize)),
				((this.bankAccount == null) ? null : (this.bankAccount.length() <= bankAccountSize) ? this.bankAccount : this.bankAccount.substring(0, this.bankAccountSize)),
				((this.bankCode == null) ? null : (this.bankCode.length() <= bankCodeSize) ? this.bankCode : this.bankCode.substring(0, this.bankCodeSize)),
				((this.bankName == null) ? null : (this.bankName.length() <= bankNameSize) ? this.bankName : this.bankName.substring(0, this.bankNameSize)),
				((this.bankBranch == null) ? null : (this.bankBranch.length() <= bankBranchSize) ? this.bankBranch : this.bankBranch.substring(0, this.bankBranchSize)),
				this.dateLastSale,
				this.dateCreated,
				((this.analysisCodes1 == null) ? null : (this.analysisCodes1.length() <= analysisCodes1Size) ? this.analysisCodes1 : this.analysisCodes1.substring(0, this.analysisCodes1Size)),
				((this.analysisCodes2 == null) ? null : (this.analysisCodes2.length() <= analysisCodes2Size) ? this.analysisCodes2 : this.analysisCodes2.substring(0, this.analysisCodes2Size)),
				((this.analysisCodes3 == null) ? null : (this.analysisCodes3.length() <= analysisCodes3Size) ? this.analysisCodes3 : this.analysisCodes3.substring(0, this.analysisCodes3Size)),
				((this.balanceFwdInd == null) ? null : (this.balanceFwdInd.length() <= balanceFwdIndSize) ? this.balanceFwdInd : this.balanceFwdInd.substring(0, this.balanceFwdIndSize)),
				this.ytdSales,
				this.cumulativeSales,
				((this.paymentReference == null) ? null : (this.paymentReference.length() <= paymentReferenceSize) ? this.paymentReference : this.paymentReference.substring(0, this.paymentReferenceSize)),
				((this.analysisCodes21 == null) ? null : (this.analysisCodes21.length() <= analysisCodes21Size) ? this.analysisCodes21 : this.analysisCodes21.substring(0, this.analysisCodes21Size)),
				((this.analysisCodes22 == null) ? null : (this.analysisCodes22.length() <= analysisCodes22Size) ? this.analysisCodes22 : this.analysisCodes22.substring(0, this.analysisCodes22Size)),
				((this.analysisCodes23 == null) ? null : (this.analysisCodes23.length() <= analysisCodes23Size) ? this.analysisCodes23 : this.analysisCodes23.substring(0, this.analysisCodes23Size)),
				((this.vatType == null) ? null : (this.vatType.length() <= vatTypeSize) ? this.vatType : this.vatType.substring(0, this.vatTypeSize)),
				((this.vatRegNumber == null) ? null : (this.vatRegNumber.length() <= vatRegNumberSize) ? this.vatRegNumber : this.vatRegNumber.substring(0, this.vatRegNumberSize)),
				((this.address6 == null) ? null : (this.address6.length() <= address6Size) ? this.address6 : this.address6.substring(0, this.address6Size)),
				((this.fax == null) ? null : (this.fax.length() <= faxSize) ? this.fax : this.fax.substring(0, this.faxSize)),
				((this.telex == null) ? null : (this.telex.length() <= telexSize) ? this.telex : this.telex.substring(0, this.telexSize)),
				((this.btx == null) ? null : (this.btx.length() <= btxSize) ? this.btx : this.btx.substring(0, this.btxSize)),
				((this.priceList == null) ? null : (this.priceList.length() <= priceListSize) ? this.priceList : this.priceList.substring(0, this.priceListSize)),
				((this.specialPriceList == null) ? null : (this.specialPriceList.length() <= specialPriceListSize) ? this.specialPriceList : this.specialPriceList.substring(0, this.specialPriceListSize)),
				((this.popDiscountCat == null) ? null : (this.popDiscountCat.length() <= popDiscountCatSize) ? this.popDiscountCat : this.popDiscountCat.substring(0, this.popDiscountCatSize)),
				((this.spare == null) ? null : (this.spare.length() <= spareSize) ? this.spare : this.spare.substring(0, this.spareSize)),
				((this.supplierCategory == null) ? null : (this.supplierCategory.length() <= supplierCategorySize) ? this.supplierCategory : this.supplierCategory.substring(0, this.supplierCategorySize)),
				((this.ediSupplier == null) ? null : (this.ediSupplier.length() <= ediSupplierSize) ? this.ediSupplier : this.ediSupplier.substring(0, this.ediSupplierSize)),
				((this.accountType == null) ? null : (this.accountType.length() <= accountTypeSize) ? this.accountType : this.accountType.substring(0, this.accountTypeSize)),
				((this.settCategory == null) ? null : (this.settCategory.length() <= settCategorySize) ? this.settCategory : this.settCategory.substring(0, this.settCategorySize)),
				((this.citSupplier == null) ? null : (this.citSupplier.length() <= citSupplierSize) ? this.citSupplier : this.citSupplier.substring(0, this.citSupplierSize))
			};
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
		return new DAOArgs(1).arg(this.supplier); 
	}



	protected void set(Object[] fields) {
	this.supplier = rtrim((String)fields[0]);
	this.alpha = rtrim((String)fields[1]);
	this.name = rtrim((String)fields[2]);
	this.address1 = rtrim((String)fields[3]);
	this.address2 = rtrim((String)fields[4]);
	this.address3 = rtrim((String)fields[5]);
	this.address4 = rtrim((String)fields[6]);
	this.address5 = rtrim((String)fields[7]);
	this.currency = rtrim((String)fields[8]);
	this.letterCode = rtrim((String)fields[9]);
	this.payIndicator = rtrim((String)fields[10]);
	this.payTerms = rtrim((String)fields[11]);
	this.payType = rtrim((String)fields[12]);
	this.bankAccount = rtrim((String)fields[13]);
	this.bankCode = rtrim((String)fields[14]);
	this.bankName = rtrim((String)fields[15]);
	this.bankBranch = rtrim((String)fields[16]);
	this.dateLastSale = ((fields[17] == null)? null : new Date(fields[17]));
	this.dateCreated = ((fields[18] == null)? null : new Date(fields[18]));
	this.analysisCodes1 = rtrim((String)fields[19]);
	this.analysisCodes2 = rtrim((String)fields[20]);
	this.analysisCodes3 = rtrim((String)fields[21]);
	this.balanceFwdInd = rtrim((String)fields[22]);
	this.ytdSales = ((Float)fields[23]);
	this.cumulativeSales = ((Float)fields[24]);
	this.paymentReference = rtrim((String)fields[25]);
	this.analysisCodes21 = rtrim((String)fields[26]);
	this.analysisCodes22 = rtrim((String)fields[27]);
	this.analysisCodes23 = rtrim((String)fields[28]);
	this.vatType = rtrim((String)fields[29]);
	this.vatRegNumber = rtrim((String)fields[30]);
	this.address6 = rtrim((String)fields[31]);
	this.fax = rtrim((String)fields[32]);
	this.telex = rtrim((String)fields[33]);
	this.btx = rtrim((String)fields[34]);
	this.priceList = rtrim((String)fields[35]);
	this.specialPriceList = rtrim((String)fields[36]);
	this.popDiscountCat = rtrim((String)fields[37]);
	this.spare = rtrim((String)fields[38]);
	this.supplierCategory = rtrim((String)fields[39]);
	this.ediSupplier = rtrim((String)fields[40]);
	this.accountType = rtrim((String)fields[41]);
	this.settCategory = rtrim((String)fields[42]);
	this.citSupplier = rtrim((String)fields[43]);
	}


	public void set(
	final String supplier,
	final String alpha,
	final String name,
	final String address1,
	final String address2,
	final String address3,
	final String address4,
	final String address5,
	final String currency,
	final String letterCode,
	final String payIndicator,
	final String payTerms,
	final String payType,
	final String bankAccount,
	final String bankCode,
	final String bankName,
	final String bankBranch,
	final Date dateLastSale,
	final Date dateCreated,
	final String analysisCodes1,
	final String analysisCodes2,
	final String analysisCodes3,
	final String balanceFwdInd,
	final Float ytdSales,
	final Float cumulativeSales,
	final String paymentReference,
	final String analysisCodes21,
	final String analysisCodes22,
	final String analysisCodes23,
	final String vatType,
	final String vatRegNumber,
	final String address6,
	final String fax,
	final String telex,
	final String btx,
	final String priceList,
	final String specialPriceList,
	final String popDiscountCat,
	final String spare,
	final String supplierCategory,
	final String ediSupplier,
	final String accountType,
	final String settCategory,
	final String citSupplier
	)
	{

	this.supplier = supplier;
	this.alpha = alpha;
	this.name = name;
	this.address1 = address1;
	this.address2 = address2;
	this.address3 = address3;
	this.address4 = address4;
	this.address5 = address5;
	this.currency = currency;
	this.letterCode = letterCode;
	this.payIndicator = payIndicator;
	this.payTerms = payTerms;
	this.payType = payType;
	this.bankAccount = bankAccount;
	this.bankCode = bankCode;
	this.bankName = bankName;
	this.bankBranch = bankBranch;
	this.dateLastSale = dateLastSale;
	this.dateCreated = dateCreated;
	this.analysisCodes1 = analysisCodes1;
	this.analysisCodes2 = analysisCodes2;
	this.analysisCodes3 = analysisCodes3;
	this.balanceFwdInd = balanceFwdInd;
	this.ytdSales = ytdSales;
	this.cumulativeSales = cumulativeSales;
	this.paymentReference = paymentReference;
	this.analysisCodes21 = analysisCodes21;
	this.analysisCodes22 = analysisCodes22;
	this.analysisCodes23 = analysisCodes23;
	this.vatType = vatType;
	this.vatRegNumber = vatRegNumber;
	this.address6 = address6;
	this.fax = fax;
	this.telex = telex;
	this.btx = btx;
	this.priceList = priceList;
	this.specialPriceList = specialPriceList;
	this.popDiscountCat = popDiscountCat;
	this.spare = spare;
	this.supplierCategory = supplierCategory;
	this.ediSupplier = ediSupplier;
	this.accountType = accountType;
	this.settCategory = settCategory;
	this.citSupplier = citSupplier;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

	public String getPayIndicator() {
		return payIndicator;
	}

	public void setPayIndicator(String payIndicator) {
		this.payIndicator = payIndicator;
	}

	public String getPayTerms() {
		return payTerms;
	}

	public void setPayTerms(String payTerms) {
		this.payTerms = payTerms;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public Date getDateLastSale() {
		return dateLastSale;
	}

	public void setDateLastSale(Date dateLastSale) {
		this.dateLastSale = dateLastSale;
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

	public String getBalanceFwdInd() {
		return balanceFwdInd;
	}

	public void setBalanceFwdInd(String balanceFwdInd) {
		this.balanceFwdInd = balanceFwdInd;
	}

	public Float getYtdSales() {
		return ytdSales;
	}

	public void setYtdSales(Float ytdSales) {
		this.ytdSales = ytdSales;
	}

	public Float getCumulativeSales() {
		return cumulativeSales;
	}

	public void setCumulativeSales(Float cumulativeSales) {
		this.cumulativeSales = cumulativeSales;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getAnalysisCodes21() {
		return analysisCodes21;
	}

	public void setAnalysisCodes21(String analysisCodes21) {
		this.analysisCodes21 = analysisCodes21;
	}

	public String getAnalysisCodes22() {
		return analysisCodes22;
	}

	public void setAnalysisCodes22(String analysisCodes22) {
		this.analysisCodes22 = analysisCodes22;
	}

	public String getAnalysisCodes23() {
		return analysisCodes23;
	}

	public void setAnalysisCodes23(String analysisCodes23) {
		this.analysisCodes23 = analysisCodes23;
	}

	public String getVatType() {
		return vatType;
	}

	public void setVatType(String vatType) {
		this.vatType = vatType;
	}

	public String getVatRegNumber() {
		return vatRegNumber;
	}

	public void setVatRegNumber(String vatRegNumber) {
		this.vatRegNumber = vatRegNumber;
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

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getSpecialPriceList() {
		return specialPriceList;
	}

	public void setSpecialPriceList(String specialPriceList) {
		this.specialPriceList = specialPriceList;
	}

	public String getPopDiscountCat() {
		return popDiscountCat;
	}

	public void setPopDiscountCat(String popDiscountCat) {
		this.popDiscountCat = popDiscountCat;
	}

	public String getSpare() {
		return spare;
	}

	public void setSpare(String spare) {
		this.spare = spare;
	}

	public String getSupplierCategory() {
		return supplierCategory;
	}

	public void setSupplierCategory(String supplierCategory) {
		this.supplierCategory = supplierCategory;
	}

	public String getEdiSupplier() {
		return ediSupplier;
	}

	public void setEdiSupplier(String ediSupplier) {
		this.ediSupplier = ediSupplier;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getSettCategory() {
		return settCategory;
	}

	public void setSettCategory(String settCategory) {
		this.settCategory = settCategory;
	}

	public String getCitSupplier() {
		return citSupplier;
	}

	public void setCitSupplier(String citSupplier) {
		this.citSupplier = citSupplier;
	}

	public static int getYtdsalesfilter() {
		return ytdSalesFilter;
	}

	public static int getVattypefilter() {
		return vatTypeFilter;
	}

	public static int getVattypesize() {
		return vatTypeSize;
	}

}
