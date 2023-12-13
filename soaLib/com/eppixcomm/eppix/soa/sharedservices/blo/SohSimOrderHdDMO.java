package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SohSimOrderHdDMO extends DBO implements Serializable {

	private String sohOrderNo;
	private String sohManufacturer;
	private String sohAddress1;
	private String sohAddress2;
	private String sohAddress3;
	private String sohAddress4;
	private String sohAddress5;
	private Date sohDateEntered;
	private Date sohDateRequired;
	private Date sohPromiseDate;
	private Date sohActionDate;
	private Date sohDateCompleted;
	private String sohSupplierRef;
	private String sohCurrency;
	private String sohStatus;
	private String sohHoldIndicator;
	private String sohDeliveryAddr1;
	private String sohDeliveryAddr2;
	private String sohDeliveryAddr3;
	private String sohDeliveryAddr4;
	private String sohDeliveryAddr5;
	private String sohDeliveryAddr6;
	private String sohComment;
	private String sohUser;
	private BigDecimal sohOtherCharges;

	public static final int sohOrderNoFilter = 0;
	private static final int sohOrderNoSize = 10;

	public static final int sohManufacturerFilter = 1;
	private static final int sohManufacturerSize = 8;

	public static final int sohAddress1Filter = 2;
	private static final int sohAddress1Size = 32;

	public static final int sohAddress2Filter = 3;
	private static final int sohAddress2Size = 32;

	public static final int sohAddress3Filter = 4;
	private static final int sohAddress3Size = 32;

	public static final int sohAddress4Filter = 5;
	private static final int sohAddress4Size = 32;

	public static final int sohAddress5Filter = 6;
	private static final int sohAddress5Size = 32;

	public static final int sohDateEnteredFilter = 7;

	public static final int sohDateRequiredFilter = 8;

	public static final int sohPromiseDateFilter = 9;

	public static final int sohActionDateFilter = 10;

	public static final int sohDateCompletedFilter = 11;

	public static final int sohSupplierRefFilter = 12;
	private static final int sohSupplierRefSize = 20;

	public static final int sohCurrencyFilter = 13;
	private static final int sohCurrencySize = 3;

	public static final int sohStatusFilter = 14;
	private static final int sohStatusSize = 1;

	public static final int sohHoldIndicatorFilter = 15;
	private static final int sohHoldIndicatorSize = 1;

	public static final int sohDeliveryAddr1Filter = 16;
	private static final int sohDeliveryAddr1Size = 32;

	public static final int sohDeliveryAddr2Filter = 17;
	private static final int sohDeliveryAddr2Size = 32;

	public static final int sohDeliveryAddr3Filter = 18;
	private static final int sohDeliveryAddr3Size = 32;

	public static final int sohDeliveryAddr4Filter = 19;
	private static final int sohDeliveryAddr4Size = 32;

	public static final int sohDeliveryAddr5Filter = 20;
	private static final int sohDeliveryAddr5Size = 32;

	public static final int sohDeliveryAddr6Filter = 21;
	private static final int sohDeliveryAddr6Size = 32;

	public static final int sohCommentFilter = 22;
	private static final int sohCommentSize = 240;

	public static final int sohUserFilter = 23;
	private static final int sohUserSize = 20;

	public static final int sohOtherChargesFilter = 24;

	public SohSimOrderHdDMO() {
	};

	public SohSimOrderHdDMO(final String sohOrderNo,
			final String sohManufacturer, final String sohAddress1,
			final String sohAddress2, final String sohAddress3,
			final String sohAddress4, final String sohAddress5,
			final Date sohDateEntered, final Date sohDateRequired,
			final Date sohPromiseDate, final Date sohActionDate,
			final Date sohDateCompleted, final String sohSupplierRef,
			final String sohCurrency, final String sohStatus,
			final String sohHoldIndicator, final String sohDeliveryAddr1,
			final String sohDeliveryAddr2, final String sohDeliveryAddr3,
			final String sohDeliveryAddr4, final String sohDeliveryAddr5,
			final String sohDeliveryAddr6, final String sohComment,
			final String sohUser, final BigDecimal sohOtherCharges) {

		this.sohOrderNo = sohOrderNo;
		this.sohManufacturer = sohManufacturer;
		this.sohAddress1 = sohAddress1;
		this.sohAddress2 = sohAddress2;
		this.sohAddress3 = sohAddress3;
		this.sohAddress4 = sohAddress4;
		this.sohAddress5 = sohAddress5;
		this.sohDateEntered = sohDateEntered;
		this.sohDateRequired = sohDateRequired;
		this.sohPromiseDate = sohPromiseDate;
		this.sohActionDate = sohActionDate;
		this.sohDateCompleted = sohDateCompleted;
		this.sohSupplierRef = sohSupplierRef;
		this.sohCurrency = sohCurrency;
		this.sohStatus = sohStatus;
		this.sohHoldIndicator = sohHoldIndicator;
		this.sohDeliveryAddr1 = sohDeliveryAddr1;
		this.sohDeliveryAddr2 = sohDeliveryAddr2;
		this.sohDeliveryAddr3 = sohDeliveryAddr3;
		this.sohDeliveryAddr4 = sohDeliveryAddr4;
		this.sohDeliveryAddr5 = sohDeliveryAddr5;
		this.sohDeliveryAddr6 = sohDeliveryAddr6;
		this.sohComment = sohComment;
		this.sohUser = sohUser;
		this.sohOtherCharges = sohOtherCharges;
	};

	private static final int[] fieldSizes = new int[] { sohOrderNoSize,
			sohManufacturerSize, sohAddress1Size, sohAddress2Size,
			sohAddress3Size, sohAddress4Size, sohAddress5Size, 0, 0, 0, 0, 0,
			sohSupplierRefSize, sohCurrencySize, sohStatusSize,
			sohHoldIndicatorSize, sohDeliveryAddr1Size, sohDeliveryAddr2Size,
			sohDeliveryAddr3Size, sohDeliveryAddr4Size, sohDeliveryAddr5Size,
			sohDeliveryAddr6Size, sohCommentSize, sohUserSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sohOrderNo == null) ? null
						: (this.sohOrderNo.length() <= sohOrderNoSize) ? this.sohOrderNo
								: this.sohOrderNo.substring(0,
										this.sohOrderNoSize)),
				((this.sohManufacturer == null) ? null
						: (this.sohManufacturer.length() <= sohManufacturerSize) ? this.sohManufacturer
								: this.sohManufacturer.substring(0,
										this.sohManufacturerSize)),
				((this.sohAddress1 == null) ? null
						: (this.sohAddress1.length() <= sohAddress1Size) ? this.sohAddress1
								: this.sohAddress1.substring(0,
										this.sohAddress1Size)),
				((this.sohAddress2 == null) ? null
						: (this.sohAddress2.length() <= sohAddress2Size) ? this.sohAddress2
								: this.sohAddress2.substring(0,
										this.sohAddress2Size)),
				((this.sohAddress3 == null) ? null
						: (this.sohAddress3.length() <= sohAddress3Size) ? this.sohAddress3
								: this.sohAddress3.substring(0,
										this.sohAddress3Size)),
				((this.sohAddress4 == null) ? null
						: (this.sohAddress4.length() <= sohAddress4Size) ? this.sohAddress4
								: this.sohAddress4.substring(0,
										this.sohAddress4Size)),
				((this.sohAddress5 == null) ? null
						: (this.sohAddress5.length() <= sohAddress5Size) ? this.sohAddress5
								: this.sohAddress5.substring(0,
										this.sohAddress5Size)),
				this.sohDateEntered,
				this.sohDateRequired,
				this.sohPromiseDate,
				this.sohActionDate,
				this.sohDateCompleted,
				((this.sohSupplierRef == null) ? null : (this.sohSupplierRef
						.length() <= sohSupplierRefSize) ? this.sohSupplierRef
						: this.sohSupplierRef.substring(0,
								this.sohSupplierRefSize)),
				((this.sohCurrency == null) ? null
						: (this.sohCurrency.length() <= sohCurrencySize) ? this.sohCurrency
								: this.sohCurrency.substring(0,
										this.sohCurrencySize)),
				((this.sohStatus == null) ? null
						: (this.sohStatus.length() <= sohStatusSize) ? this.sohStatus
								: this.sohStatus.substring(0,
										this.sohStatusSize)),
				((this.sohHoldIndicator == null) ? null
						: (this.sohHoldIndicator.length() <= sohHoldIndicatorSize) ? this.sohHoldIndicator
								: this.sohHoldIndicator.substring(0,
										this.sohHoldIndicatorSize)),
				((this.sohDeliveryAddr1 == null) ? null
						: (this.sohDeliveryAddr1.length() <= sohDeliveryAddr1Size) ? this.sohDeliveryAddr1
								: this.sohDeliveryAddr1.substring(0,
										this.sohDeliveryAddr1Size)),
				((this.sohDeliveryAddr2 == null) ? null
						: (this.sohDeliveryAddr2.length() <= sohDeliveryAddr2Size) ? this.sohDeliveryAddr2
								: this.sohDeliveryAddr2.substring(0,
										this.sohDeliveryAddr2Size)),
				((this.sohDeliveryAddr3 == null) ? null
						: (this.sohDeliveryAddr3.length() <= sohDeliveryAddr3Size) ? this.sohDeliveryAddr3
								: this.sohDeliveryAddr3.substring(0,
										this.sohDeliveryAddr3Size)),
				((this.sohDeliveryAddr4 == null) ? null
						: (this.sohDeliveryAddr4.length() <= sohDeliveryAddr4Size) ? this.sohDeliveryAddr4
								: this.sohDeliveryAddr4.substring(0,
										this.sohDeliveryAddr4Size)),
				((this.sohDeliveryAddr5 == null) ? null
						: (this.sohDeliveryAddr5.length() <= sohDeliveryAddr5Size) ? this.sohDeliveryAddr5
								: this.sohDeliveryAddr5.substring(0,
										this.sohDeliveryAddr5Size)),
				((this.sohDeliveryAddr6 == null) ? null
						: (this.sohDeliveryAddr6.length() <= sohDeliveryAddr6Size) ? this.sohDeliveryAddr6
								: this.sohDeliveryAddr6.substring(0,
										this.sohDeliveryAddr6Size)),
				((this.sohComment == null) ? null
						: (this.sohComment.length() <= sohCommentSize) ? this.sohComment
								: this.sohComment.substring(0,
										this.sohCommentSize)),
				((this.sohUser == null) ? null
						: (this.sohUser.length() <= sohUserSize) ? this.sohUser
								: this.sohUser.substring(0, this.sohUserSize)),
				this.sohOtherCharges };
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
		return new DAOArgs(1).arg(this.sohOrderNo);
	}

	protected void set(Object[] fields) {
		this.sohOrderNo = rtrim((String) fields[0]);
		this.sohManufacturer = rtrim((String) fields[1]);
		this.sohAddress1 = rtrim((String) fields[2]);
		this.sohAddress2 = rtrim((String) fields[3]);
		this.sohAddress3 = rtrim((String) fields[4]);
		this.sohAddress4 = rtrim((String) fields[5]);
		this.sohAddress5 = rtrim((String) fields[6]);
		this.sohDateEntered = ((fields[7] == null) ? null : new Date(
				fields[7]));
		this.sohDateRequired = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.sohPromiseDate = ((fields[9] == null) ? null : new Date(
				fields[9]));
		this.sohActionDate = ((fields[10] == null) ? null : new Date(
				fields[10]));
		this.sohDateCompleted = ((fields[11] == null) ? null : new Date(
				fields[11]));
		this.sohSupplierRef = rtrim((String) fields[12]);
		this.sohCurrency = rtrim((String) fields[13]);
		this.sohStatus = rtrim((String) fields[14]);
		this.sohHoldIndicator = rtrim((String) fields[15]);
		this.sohDeliveryAddr1 = rtrim((String) fields[16]);
		this.sohDeliveryAddr2 = rtrim((String) fields[17]);
		this.sohDeliveryAddr3 = rtrim((String) fields[18]);
		this.sohDeliveryAddr4 = rtrim((String) fields[19]);
		this.sohDeliveryAddr5 = rtrim((String) fields[20]);
		this.sohDeliveryAddr6 = rtrim((String) fields[21]);
		this.sohComment = rtrim((String) fields[22]);
		this.sohUser = rtrim((String) fields[23]);
		this.sohOtherCharges = ((BigDecimal) fields[24]);
	}

	public void set(final String sohOrderNo, final String sohManufacturer,
			final String sohAddress1, final String sohAddress2,
			final String sohAddress3, final String sohAddress4,
			final String sohAddress5, final Date sohDateEntered,
			final Date sohDateRequired, final Date sohPromiseDate,
			final Date sohActionDate, final Date sohDateCompleted,
			final String sohSupplierRef, final String sohCurrency,
			final String sohStatus, final String sohHoldIndicator,
			final String sohDeliveryAddr1, final String sohDeliveryAddr2,
			final String sohDeliveryAddr3, final String sohDeliveryAddr4,
			final String sohDeliveryAddr5, final String sohDeliveryAddr6,
			final String sohComment, final String sohUser,
			final BigDecimal sohOtherCharges) {

		this.sohOrderNo = sohOrderNo;
		this.sohManufacturer = sohManufacturer;
		this.sohAddress1 = sohAddress1;
		this.sohAddress2 = sohAddress2;
		this.sohAddress3 = sohAddress3;
		this.sohAddress4 = sohAddress4;
		this.sohAddress5 = sohAddress5;
		this.sohDateEntered = sohDateEntered;
		this.sohDateRequired = sohDateRequired;
		this.sohPromiseDate = sohPromiseDate;
		this.sohActionDate = sohActionDate;
		this.sohDateCompleted = sohDateCompleted;
		this.sohSupplierRef = sohSupplierRef;
		this.sohCurrency = sohCurrency;
		this.sohStatus = sohStatus;
		this.sohHoldIndicator = sohHoldIndicator;
		this.sohDeliveryAddr1 = sohDeliveryAddr1;
		this.sohDeliveryAddr2 = sohDeliveryAddr2;
		this.sohDeliveryAddr3 = sohDeliveryAddr3;
		this.sohDeliveryAddr4 = sohDeliveryAddr4;
		this.sohDeliveryAddr5 = sohDeliveryAddr5;
		this.sohDeliveryAddr6 = sohDeliveryAddr6;
		this.sohComment = sohComment;
		this.sohUser = sohUser;
		this.sohOtherCharges = sohOtherCharges;
	}

	public String getSohOrderNo() {
		return sohOrderNo;
	}

	public void setSohOrderNo(String sohOrderNo) {
		this.sohOrderNo = sohOrderNo;
	}

	public String getSohManufacturer() {
		return sohManufacturer;
	}

	public void setSohManufacturer(String sohManufacturer) {
		this.sohManufacturer = sohManufacturer;
	}

	public String getSohAddress1() {
		return sohAddress1;
	}

	public void setSohAddress1(String sohAddress1) {
		this.sohAddress1 = sohAddress1;
	}

	public String getSohAddress2() {
		return sohAddress2;
	}

	public void setSohAddress2(String sohAddress2) {
		this.sohAddress2 = sohAddress2;
	}

	public String getSohAddress3() {
		return sohAddress3;
	}

	public void setSohAddress3(String sohAddress3) {
		this.sohAddress3 = sohAddress3;
	}

	public String getSohAddress4() {
		return sohAddress4;
	}

	public void setSohAddress4(String sohAddress4) {
		this.sohAddress4 = sohAddress4;
	}

	public String getSohAddress5() {
		return sohAddress5;
	}

	public void setSohAddress5(String sohAddress5) {
		this.sohAddress5 = sohAddress5;
	}

	public Date getSohDateEntered() {
		return sohDateEntered;
	}

	public void setSohDateEntered(Date sohDateEntered) {
		this.sohDateEntered = sohDateEntered;
	}

	public Date getSohDateRequired() {
		return sohDateRequired;
	}

	public void setSohDateRequired(Date sohDateRequired) {
		this.sohDateRequired = sohDateRequired;
	}

	public Date getSohPromiseDate() {
		return sohPromiseDate;
	}

	public void setSohPromiseDate(Date sohPromiseDate) {
		this.sohPromiseDate = sohPromiseDate;
	}

	public Date getSohActionDate() {
		return sohActionDate;
	}

	public void setSohActionDate(Date sohActionDate) {
		this.sohActionDate = sohActionDate;
	}

	public Date getSohDateCompleted() {
		return sohDateCompleted;
	}

	public void setSohDateCompleted(Date sohDateCompleted) {
		this.sohDateCompleted = sohDateCompleted;
	}

	public String getSohSupplierRef() {
		return sohSupplierRef;
	}

	public void setSohSupplierRef(String sohSupplierRef) {
		this.sohSupplierRef = sohSupplierRef;
	}

	public String getSohCurrency() {
		return sohCurrency;
	}

	public void setSohCurrency(String sohCurrency) {
		this.sohCurrency = sohCurrency;
	}

	public String getSohStatus() {
		return sohStatus;
	}

	public void setSohStatus(String sohStatus) {
		this.sohStatus = sohStatus;
	}

	public String getSohHoldIndicator() {
		return sohHoldIndicator;
	}

	public void setSohHoldIndicator(String sohHoldIndicator) {
		this.sohHoldIndicator = sohHoldIndicator;
	}

	public String getSohDeliveryAddr1() {
		return sohDeliveryAddr1;
	}

	public void setSohDeliveryAddr1(String sohDeliveryAddr1) {
		this.sohDeliveryAddr1 = sohDeliveryAddr1;
	}

	public String getSohDeliveryAddr2() {
		return sohDeliveryAddr2;
	}

	public void setSohDeliveryAddr2(String sohDeliveryAddr2) {
		this.sohDeliveryAddr2 = sohDeliveryAddr2;
	}

	public String getSohDeliveryAddr3() {
		return sohDeliveryAddr3;
	}

	public void setSohDeliveryAddr3(String sohDeliveryAddr3) {
		this.sohDeliveryAddr3 = sohDeliveryAddr3;
	}

	public String getSohDeliveryAddr4() {
		return sohDeliveryAddr4;
	}

	public void setSohDeliveryAddr4(String sohDeliveryAddr4) {
		this.sohDeliveryAddr4 = sohDeliveryAddr4;
	}

	public String getSohDeliveryAddr5() {
		return sohDeliveryAddr5;
	}

	public void setSohDeliveryAddr5(String sohDeliveryAddr5) {
		this.sohDeliveryAddr5 = sohDeliveryAddr5;
	}

	public String getSohDeliveryAddr6() {
		return sohDeliveryAddr6;
	}

	public void setSohDeliveryAddr6(String sohDeliveryAddr6) {
		this.sohDeliveryAddr6 = sohDeliveryAddr6;
	}

	public String getSohComment() {
		return sohComment;
	}

	public void setSohComment(String sohComment) {
		this.sohComment = sohComment;
	}

	public String getSohUser() {
		return sohUser;
	}

	public void setSohUser(String sohUser) {
		this.sohUser = sohUser;
	}

	public BigDecimal getSohOtherCharges() {
		return sohOtherCharges;
	}

	public void setSohOtherCharges(BigDecimal sohOtherCharges) {
		this.sohOtherCharges = sohOtherCharges;
	}

}
