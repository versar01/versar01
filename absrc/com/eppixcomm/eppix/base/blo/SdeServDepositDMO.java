package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SdeServDepositDMO extends DBO implements Serializable {

	private Integer sdeDepositId;
	private String sdeServiceCode;
	private String sdePackageCode;
	private Integer sdeVerRuleNum;
	private String sdeCustomerId;
	private Integer sdeSubscriberId;
	private Date sdeLatesPayDate;
	private Date sdePayDate;
	private Integer sdeDepositStatus;
	private Date sdeDeactDate;
	private Date sdeReleaseDate;
	private Float sdeAmountDue;
	private Float sdeAmountPaid;
	private Integer sdeServiceStatus;
	private Integer sdeBatchRunNum;
	private String sdeSimNo;
	private String sdeMsisdnNo;
	private String sdePendLetterId;
	private String sdeCurrency;
	private Float sdeExchangeRate;

	public static final int SdeDepositIdFilter = 0;

	public static final int SdeServiceCodeFilter = 1;
	private static final int SdeServiceCodeSize = 4;

	public static final int SdePackageCodeFilter = 2;
	private static final int SdePackageCodeSize = 5;

	public static final int SdeVerRuleNumFilter = 3;

	public static final int SdeCustomerIdFilter = 4;
	private static final int SdeCustomerIdSize = 8;

	public static final int SdeSubscriberIdFilter = 5;

	public static final int SdeLatesPayDateFilter = 6;

	public static final int SdePayDateFilter = 7;

	public static final int SdeDepositStatusFilter = 8;

	public static final int SdeDeactDateFilter = 9;

	public static final int SdeReleaseDateFilter = 10;

	public static final int SdeAmountDueFilter = 11;

	public static final int SdeAmountPaidFilter = 12;

	public static final int SdeServiceStatusFilter = 13;

	public static final int SdeBatchRunNumFilter = 14;

	public static final int SdeSimNoFilter = 15;
	private static final int SdeSimNoSize = 14;

	public static final int SdeMsisdnNoFilter = 16;
	private static final int SdeMsisdnNoSize = 15;

	public static final int SdePendLetterIdFilter = 17;
	private static final int SdePendLetterIdSize = 10;

	public static final int SdeCurrencyFilter = 18;
	private static final int SdeCurrencySize = 3;

	public static final int SdeExchangeRateFilter = 19;

	public SdeServDepositDMO() {
	};

	public SdeServDepositDMO(final Integer SdeDepositId,
			final String SdeServiceCode, final String SdePackageCode,
			final Integer SdeVerRuleNum, final String SdeCustomerId,
			final Integer SdeSubscriberId, final Date SdeLatesPayDate,
			final Date SdePayDate, final Integer SdeDepositStatus,
			final Date SdeDeactDate, final Date SdeReleaseDate,
			final Float SdeAmountDue, final Float SdeAmountPaid,
			final Integer SdeServiceStatus, final Integer SdeBatchRunNum,
			final String SdeSimNo, final String SdeMsisdnNo,
			final String SdePendLetterId, final String SdeCurrency,
			final Float SdeExchangeRate) {

		this.sdeDepositId = SdeDepositId;
		this.sdeServiceCode = SdeServiceCode;
		this.sdePackageCode = SdePackageCode;
		this.sdeVerRuleNum = SdeVerRuleNum;
		this.sdeCustomerId = SdeCustomerId;
		this.sdeSubscriberId = SdeSubscriberId;
		this.sdeLatesPayDate = SdeLatesPayDate;
		this.sdePayDate = SdePayDate;
		this.sdeDepositStatus = SdeDepositStatus;
		this.sdeDeactDate = SdeDeactDate;
		this.sdeReleaseDate = SdeReleaseDate;
		this.sdeAmountDue = SdeAmountDue;
		this.sdeAmountPaid = SdeAmountPaid;
		this.sdeServiceStatus = SdeServiceStatus;
		this.sdeBatchRunNum = SdeBatchRunNum;
		this.sdeSimNo = SdeSimNo;
		this.sdeMsisdnNo = SdeMsisdnNo;
		this.sdePendLetterId = SdePendLetterId;
		this.sdeCurrency = SdeCurrency;
		this.sdeExchangeRate = SdeExchangeRate;
	};

	private static final int[] fieldSizes = new int[] { 0, SdeServiceCodeSize,
			SdePackageCodeSize, 0, SdeCustomerIdSize, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, SdeSimNoSize, SdeMsisdnNoSize, SdePendLetterIdSize,
			SdeCurrencySize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sdeDepositId,
				((this.sdeServiceCode == null) ? null : (this.sdeServiceCode
						.length() <= SdeServiceCodeSize) ? this.sdeServiceCode
						: this.sdeServiceCode.substring(0,
								this.SdeServiceCodeSize)),
				((this.sdePackageCode == null) ? null : (this.sdePackageCode
						.length() <= SdePackageCodeSize) ? this.sdePackageCode
						: this.sdePackageCode.substring(0,
								this.SdePackageCodeSize)),
				this.sdeVerRuleNum,
				((this.sdeCustomerId == null) ? null : (this.sdeCustomerId
						.length() <= SdeCustomerIdSize) ? this.sdeCustomerId
						: this.sdeCustomerId.substring(0,
								this.SdeCustomerIdSize)),
				this.sdeSubscriberId,
				this.sdeLatesPayDate,
				this.sdePayDate,
				this.sdeDepositStatus,
				this.sdeDeactDate,
				this.sdeReleaseDate,
				this.sdeAmountDue,
				this.sdeAmountPaid,
				this.sdeServiceStatus,
				this.sdeBatchRunNum,
				((this.sdeSimNo == null) ? null
						: (this.sdeSimNo.length() <= SdeSimNoSize) ? this.sdeSimNo
								: this.sdeSimNo.substring(0, this.SdeSimNoSize)),
				((this.sdeMsisdnNo == null) ? null
						: (this.sdeMsisdnNo.length() <= SdeMsisdnNoSize) ? this.sdeMsisdnNo
								: this.sdeMsisdnNo.substring(0,
										this.SdeMsisdnNoSize)),
				((this.sdePendLetterId == null) ? null
						: (this.sdePendLetterId.length() <= SdePendLetterIdSize) ? this.sdePendLetterId
								: this.sdePendLetterId.substring(0,
										this.SdePendLetterIdSize)),
				((this.sdeCurrency == null) ? null
						: (this.sdeCurrency.length() <= SdeCurrencySize) ? this.sdeCurrency
								: this.sdeCurrency.substring(0,
										this.SdeCurrencySize)),
				this.sdeExchangeRate };
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
		return new DAOArgs(4).arg(this.sdeDepositId).arg(this.sdeServiceCode).arg(this.sdePackageCode).arg(this.sdeVerRuleNum);
	}

	protected void set(Object[] fields) {
		this.sdeDepositId = ((Integer) fields[0]);
		this.sdeServiceCode = rtrim((String) fields[1]);
		this.sdePackageCode = rtrim((String) fields[2]);
		this.sdeVerRuleNum = ((Integer) fields[3]);
		this.sdeCustomerId = rtrim((String) fields[4]);
		this.sdeSubscriberId = ((Integer) fields[5]);
		this.sdeLatesPayDate = ((fields[6] == null) ? null : new Date(fields[6]));
		this.sdePayDate = ((fields[7] == null) ? null : new Date( fields[7]));
		this.sdeDepositStatus = ((Integer) fields[8]);
		this.sdeDeactDate = ((fields[9] == null) ? null : new Date(fields[9]));
		this.sdeReleaseDate = ((fields[10] == null) ? null : new Date(fields[10]));
		this.sdeAmountDue = ((Float) fields[11]);
		this.sdeAmountPaid = ((Float) fields[12]);
		this.sdeServiceStatus = ((Integer) fields[13]);
		this.sdeBatchRunNum = ((Integer) fields[14]);
		this.sdeSimNo = rtrim((String) fields[15]);
		this.sdeMsisdnNo = rtrim((String) fields[16]);
		this.sdePendLetterId = rtrim((String) fields[17]);
		this.sdeCurrency = rtrim((String) fields[18]);
		this.sdeExchangeRate = ((Float) fields[19]);
	}

	public void set(final Integer SdeDepositId, final String SdeServiceCode,
			final String SdePackageCode, final Integer SdeVerRuleNum,
			final String SdeCustomerId, final Integer SdeSubscriberId,
			final Date SdeLatesPayDate, final Date SdePayDate,
			final Integer SdeDepositStatus, final Date SdeDeactDate,
			final Date SdeReleaseDate, final Float SdeAmountDue,
			final Float SdeAmountPaid, final Integer SdeServiceStatus,
			final Integer SdeBatchRunNum, final String SdeSimNo,
			final String SdeMsisdnNo, final String SdePendLetterId,
			final String SdeCurrency, final Float SdeExchangeRate) {

		this.sdeDepositId = SdeDepositId;
		this.sdeServiceCode = SdeServiceCode;
		this.sdePackageCode = SdePackageCode;
		this.sdeVerRuleNum = SdeVerRuleNum;
		this.sdeCustomerId = SdeCustomerId;
		this.sdeSubscriberId = SdeSubscriberId;
		this.sdeLatesPayDate = SdeLatesPayDate;
		this.sdePayDate = SdePayDate;
		this.sdeDepositStatus = SdeDepositStatus;
		this.sdeDeactDate = SdeDeactDate;
		this.sdeReleaseDate = SdeReleaseDate;
		this.sdeAmountDue = SdeAmountDue;
		this.sdeAmountPaid = SdeAmountPaid;
		this.sdeServiceStatus = SdeServiceStatus;
		this.sdeBatchRunNum = SdeBatchRunNum;
		this.sdeSimNo = SdeSimNo;
		this.sdeMsisdnNo = SdeMsisdnNo;
		this.sdePendLetterId = SdePendLetterId;
		this.sdeCurrency = SdeCurrency;
		this.sdeExchangeRate = SdeExchangeRate;
	}

	public Integer getSdeDepositId() {
		return sdeDepositId;
	}

	public void setSdeDepositId(Integer sdeDepositId) {
		this.sdeDepositId = sdeDepositId;
	}

	public String getSdeServiceCode() {
		return sdeServiceCode;
	}

	public void setSdeServiceCode(String sdeServiceCode) {
		this.sdeServiceCode = sdeServiceCode;
	}

	public String getSdePackageCode() {
		return sdePackageCode;
	}

	public void setSdePackageCode(String sdePackageCode) {
		this.sdePackageCode = sdePackageCode;
	}

	public Integer getSdeVerRuleNum() {
		return sdeVerRuleNum;
	}

	public void setSdeVerRuleNum(Integer sdeVerRuleNum) {
		this.sdeVerRuleNum = sdeVerRuleNum;
	}

	public String getSdeCustomerId() {
		return sdeCustomerId;
	}

	public void setSdeCustomerId(String sdeCustomerId) {
		this.sdeCustomerId = sdeCustomerId;
	}

	public Integer getSdeSubscriberId() {
		return sdeSubscriberId;
	}

	public void setSdeSubscriberId(Integer sdeSubscriberId) {
		this.sdeSubscriberId = sdeSubscriberId;
	}

	public Date getSdeLatesPayDate() {
		return sdeLatesPayDate;
	}

	public void setSdeLatesPayDate(Date sdeLatesPayDate) {
		this.sdeLatesPayDate = sdeLatesPayDate;
	}

	public Date getSdePayDate() {
		return sdePayDate;
	}

	public void setSdePayDate(Date sdePayDate) {
		this.sdePayDate = sdePayDate;
	}

	public Integer getSdeDepositStatus() {
		return sdeDepositStatus;
	}

	public void setSdeDepositStatus(Integer sdeDepositStatus) {
		this.sdeDepositStatus = sdeDepositStatus;
	}

	public Date getSdeDeactDate() {
		return sdeDeactDate;
	}

	public void setSdeDeactDate(Date sdeDeactDate) {
		this.sdeDeactDate = sdeDeactDate;
	}

	public Date getSdeReleaseDate() {
		return sdeReleaseDate;
	}

	public void setSdeReleaseDate(Date sdeReleaseDate) {
		this.sdeReleaseDate = sdeReleaseDate;
	}

	public Float getSdeAmountDue() {
		return sdeAmountDue;
	}

	public void setSdeAmountDue(Float sdeAmountDue) {
		this.sdeAmountDue = sdeAmountDue;
	}

	public Float getSdeAmountPaid() {
		return sdeAmountPaid;
	}

	public void setSdeAmountPaid(Float sdeAmountPaid) {
		this.sdeAmountPaid = sdeAmountPaid;
	}

	public Integer getSdeServiceStatus() {
		return sdeServiceStatus;
	}

	public void setSdeServiceStatus(Integer sdeServiceStatus) {
		this.sdeServiceStatus = sdeServiceStatus;
	}

	public Integer getSdeBatchRunNum() {
		return sdeBatchRunNum;
	}

	public void setSdeBatchRunNum(Integer sdeBatchRunNum) {
		this.sdeBatchRunNum = sdeBatchRunNum;
	}

	public String getSdeSimNo() {
		return sdeSimNo;
	}

	public void setSdeSimNo(String sdeSimNo) {
		this.sdeSimNo = sdeSimNo;
	}

	public String getSdeMsisdnNo() {
		return sdeMsisdnNo;
	}

	public void setSdeMsisdnNo(String sdeMsisdnNo) {
		this.sdeMsisdnNo = sdeMsisdnNo;
	}

	public String getSdePendLetterId() {
		return sdePendLetterId;
	}

	public void setSdePendLetterId(String sdePendLetterId) {
		this.sdePendLetterId = sdePendLetterId;
	}

	public String getSdeCurrency() {
		return sdeCurrency;
	}

	public void setSdeCurrency(String sdeCurrency) {
		this.sdeCurrency = sdeCurrency;
	}

	public Float getSdeExchangeRate() {
		return sdeExchangeRate;
	}

	public void setSdeExchangeRate(Float sdeExchangeRate) {
		this.sdeExchangeRate = sdeExchangeRate;
	}

}