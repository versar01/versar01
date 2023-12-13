package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class InsInvSummaryDMO extends DBO implements Serializable {

	private String insCustomer;
	private String insInvoiceCust;
	private String insMonthNo;
	private String insYearNo;
	private String insInvoiceNo;
	private Date insInvoiceDate;
	private String insCycle;
	private Float insTotal;
	private String insInvoiceType;
	private Date insBillTabDate;
	private Date insDueDate;
	private Float insCurrencyAmt;
	private Date insStartPeriod;
	private Date insEndPeriod;
	private String insSource;

	public static final int insCustomerFilter = 0;
	private static final int insCustomerSize = 8;

	public static final int insInvoiceCustFilter = 1;
	private static final int insInvoiceCustSize = 8;

	public static final int insMonthNoFilter = 2;
	private static final int insMonthNoSize = 2;

	public static final int insYearNoFilter = 3;
	private static final int insYearNoSize = 4;

	public static final int insInvoiceNoFilter = 4;
	private static final int insInvoiceNoSize = 10;

	public static final int insInvoiceDateFilter = 5;

	public static final int insCycleFilter = 6;
	private static final int insCycleSize = 5;

	public static final int insTotalFilter = 7;

	public static final int insInvoiceTypeFilter = 8;
	private static final int insInvoiceTypeSize = 1;

	public static final int insBillTabDateFilter = 9;

	public static final int insDueDateFilter = 10;

	public static final int insCurrencyAmtFilter = 11;

	public static final int insStartPeriodFilter = 12;

	public static final int insEndPeriodFilter = 13;

	public static final int insSourceFilter = 14;
	private static final int insSourceSize = 1;

	public InsInvSummaryDMO() {
	};

	public InsInvSummaryDMO(final String insCustomer,
			final String insInvoiceCust, final String insMonthNo,
			final String insYearNo, final String insInvoiceNo,
			final Date insInvoiceDate, final String insCycle,
			final Float insTotal, final String insInvoiceType,
			final Date insBillTabDate, final Date insDueDate,
			final Float insCurrencyAmt, final Date insStartPeriod,
			final Date insEndPeriod, final String insSource) {

		this.insCustomer = insCustomer;
		this.insInvoiceCust = insInvoiceCust;
		this.insMonthNo = insMonthNo;
		this.insYearNo = insYearNo;
		this.insInvoiceNo = insInvoiceNo;
		this.insInvoiceDate = insInvoiceDate;
		this.insCycle = insCycle;
		this.insTotal = insTotal;
		this.insInvoiceType = insInvoiceType;
		this.insBillTabDate = insBillTabDate;
		this.insDueDate = insDueDate;
		this.insCurrencyAmt = insCurrencyAmt;
		this.insStartPeriod = insStartPeriod;
		this.insEndPeriod = insEndPeriod;
		this.insSource = insSource;
	};

	private static final int[] fieldSizes = new int[] { insCustomerSize,
			insInvoiceCustSize, insMonthNoSize, insYearNoSize,
			insInvoiceNoSize, 0, insCycleSize, 0, insInvoiceTypeSize, 0, 0, 0,
			0, 0, insSourceSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_FLOAT, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.insCustomer == null) ? null
						: (this.insCustomer.length() <= insCustomerSize) ? this.insCustomer
								: this.insCustomer.substring(0,
										this.insCustomerSize)),
				((this.insInvoiceCust == null) ? null : (this.insInvoiceCust
						.length() <= insInvoiceCustSize) ? this.insInvoiceCust
						: this.insInvoiceCust.substring(0,
								this.insInvoiceCustSize)),
				((this.insMonthNo == null) ? null
						: (this.insMonthNo.length() <= insMonthNoSize) ? this.insMonthNo
								: this.insMonthNo.substring(0,
										this.insMonthNoSize)),
				((this.insYearNo == null) ? null
						: (this.insYearNo.length() <= insYearNoSize) ? this.insYearNo
								: this.insYearNo.substring(0,
										this.insYearNoSize)),
				((this.insInvoiceNo == null) ? null : (this.insInvoiceNo
						.length() <= insInvoiceNoSize) ? this.insInvoiceNo
						: this.insInvoiceNo.substring(0, this.insInvoiceNoSize)),
				this.insInvoiceDate,
				((this.insCycle == null) ? null
						: (this.insCycle.length() <= insCycleSize) ? this.insCycle
								: this.insCycle.substring(0, this.insCycleSize)),
				this.insTotal,
				((this.insInvoiceType == null) ? null : (this.insInvoiceType
						.length() <= insInvoiceTypeSize) ? this.insInvoiceType
						: this.insInvoiceType.substring(0,
								this.insInvoiceTypeSize)),
				this.insBillTabDate,
				this.insDueDate,
				this.insCurrencyAmt,
				this.insStartPeriod,
				this.insEndPeriod,
				((this.insSource == null) ? null
						: (this.insSource.length() <= insSourceSize) ? this.insSource
								: this.insSource.substring(0,
										this.insSourceSize)) };
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
		return new DAOArgs(1).arg(this.insInvoiceNo);
	}

	protected void set(Object[] fields) {
		this.insCustomer = rtrim((String) fields[0]);
		this.insInvoiceCust = rtrim((String) fields[1]);
		this.insMonthNo = rtrim((String) fields[2]);
		this.insYearNo = rtrim((String) fields[3]);
		this.insInvoiceNo = rtrim((String) fields[4]);
		this.insInvoiceDate = ((fields[5] == null) ? null : new Date(
				fields[5]));
		this.insCycle = rtrim((String) fields[6]);
		this.insTotal = ((Float) fields[7]);
		this.insInvoiceType = rtrim((String) fields[8]);
		this.insBillTabDate = ((fields[9] == null) ? null : new Date(
				fields[9]));
		this.insDueDate = ((fields[10] == null) ? null : new Date(
				fields[10]));
		this.insCurrencyAmt = ((Float) fields[11]);
		this.insStartPeriod = ((fields[12] == null) ? null : new Date(
				fields[12]));
		this.insEndPeriod = ((fields[13] == null) ? null : new Date(
				fields[13]));
		this.insSource = rtrim((String) fields[14]);
	}

	public void set(final String insCustomer, final String insInvoiceCust,
			final String insMonthNo, final String insYearNo,
			final String insInvoiceNo, final Date insInvoiceDate,
			final String insCycle, final Float insTotal,
			final String insInvoiceType, final Date insBillTabDate,
			final Date insDueDate, final Float insCurrencyAmt,
			final Date insStartPeriod, final Date insEndPeriod,
			final String insSource) {

		this.insCustomer = insCustomer;
		this.insInvoiceCust = insInvoiceCust;
		this.insMonthNo = insMonthNo;
		this.insYearNo = insYearNo;
		this.insInvoiceNo = insInvoiceNo;
		this.insInvoiceDate = insInvoiceDate;
		this.insCycle = insCycle;
		this.insTotal = insTotal;
		this.insInvoiceType = insInvoiceType;
		this.insBillTabDate = insBillTabDate;
		this.insDueDate = insDueDate;
		this.insCurrencyAmt = insCurrencyAmt;
		this.insStartPeriod = insStartPeriod;
		this.insEndPeriod = insEndPeriod;
		this.insSource = insSource;
	}

	public String getInsCustomer() {
		return insCustomer;
	}

	public void setInsCustomer(String insCustomer) {
		this.insCustomer = insCustomer;
	}

	public String getInsInvoiceCust() {
		return insInvoiceCust;
	}

	public void setInsInvoiceCust(String insInvoiceCust) {
		this.insInvoiceCust = insInvoiceCust;
	}

	public String getInsMonthNo() {
		return insMonthNo;
	}

	public void setInsMonthNo(String insMonthNo) {
		this.insMonthNo = insMonthNo;
	}

	public String getInsYearNo() {
		return insYearNo;
	}

	public void setInsYearNo(String insYearNo) {
		this.insYearNo = insYearNo;
	}

	public String getInsInvoiceNo() {
		return insInvoiceNo;
	}

	public void setInsInvoiceNo(String insInvoiceNo) {
		this.insInvoiceNo = insInvoiceNo;
	}

	public Date getInsInvoiceDate() {
		return insInvoiceDate;
	}

	public void setInsInvoiceDate(Date insInvoiceDate) {
		this.insInvoiceDate = insInvoiceDate;
	}

	public String getInsCycle() {
		return insCycle;
	}

	public void setInsCycle(String insCycle) {
		this.insCycle = insCycle;
	}

	public Float getInsTotal() {
		return insTotal;
	}

	public void setInsTotal(Float insTotal) {
		this.insTotal = insTotal;
	}

	public String getInsInvoiceType() {
		return insInvoiceType;
	}

	public void setInsInvoiceType(String insInvoiceType) {
		this.insInvoiceType = insInvoiceType;
	}

	public Date getInsBillTabDate() {
		return insBillTabDate;
	}

	public void setInsBillTabDate(Date insBillTabDate) {
		this.insBillTabDate = insBillTabDate;
	}

	public Date getInsDueDate() {
		return insDueDate;
	}

	public void setInsDueDate(Date insDueDate) {
		this.insDueDate = insDueDate;
	}

	public Float getInsCurrencyAmt() {
		return insCurrencyAmt;
	}

	public void setInsCurrencyAmt(Float insCurrencyAmt) {
		this.insCurrencyAmt = insCurrencyAmt;
	}

	public Date getInsStartPeriod() {
		return insStartPeriod;
	}

	public void setInsStartPeriod(Date insStartPeriod) {
		this.insStartPeriod = insStartPeriod;
	}

	public Date getInsEndPeriod() {
		return insEndPeriod;
	}

	public void setInsEndPeriod(Date insEndPeriod) {
		this.insEndPeriod = insEndPeriod;
	}

	public String getInsSource() {
		return insSource;
	}

	public void setInsSource(String insSource) {
		this.insSource = insSource;
	}

}
