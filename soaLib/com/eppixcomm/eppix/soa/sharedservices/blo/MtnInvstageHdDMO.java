package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class MtnInvstageHdDMO extends DBO implements Serializable {

	private String mihOrderNo;
	private String mihBillAcOn;
	private String mihMsisdnNo;
	private String mihStoreCode;
	private Integer mihTotQuantity;
	private BigDecimal mihTotAmount;
	private DateTime mihTransDatetime;
	private String mihTransStatus;
	private DateTime mihStatDatetime;
	private String mihComments;

	public static final int mihOrderNoFilter = 0;
	private static final int mihOrderNoSize = 15;

	public static final int mihBillAcOnFilter = 1;
	private static final int mihBillAcOnSize = 8;

	public static final int mihMsisdnNoFilter = 2;
	private static final int mihMsisdnNoSize = 14;

	public static final int mihStoreCodeFilter = 3;
	private static final int mihStoreCodeSize = 3;

	public static final int mihTotQuantityFilter = 4;

	public static final int mihTotAmountFilter = 5;

	public static final int mihTransDatetimeFilter = 6;

	public static final int mihTransStatusFilter = 7;
	private static final int mihTransStatusSize = 2;

	public static final int mihStatDatetimeFilter = 8;

	public static final int mihCommentsFilter = 9;
	private static final int mihCommentsSize = 250;

	public MtnInvstageHdDMO() {
	};

	public MtnInvstageHdDMO(final String mihOrderNo, final String mihBillAcOn, final String pmihMsisdnNo,
			final String mihStoreCode, final Integer mihTotQuantity, final BigDecimal mihTotAmount,
			final DateTime mihTransDatetime, final String mihTransStatus, final DateTime mihStatDatetime,
			final String mihComments) {

		this.mihOrderNo = mihOrderNo;
		this.mihBillAcOn = mihBillAcOn;
		this.mihMsisdnNo = pmihMsisdnNo;
		this.mihStoreCode = mihStoreCode;
		this.mihTotQuantity = mihTotQuantity;
		this.mihTotAmount = mihTotAmount;
		this.mihTransDatetime = mihTransDatetime;
		this.mihTransStatus = mihTransStatus;
		this.mihStatDatetime = mihStatDatetime;
		this.mihComments = mihComments;
	};

	private static final int[] fieldSizes = new int[] { mihOrderNoSize, mihBillAcOnSize, mihMsisdnNoSize,
			mihStoreCodeSize, 0, 0, 0, mihTransStatusSize, 0, mihCommentsSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_DATETIME, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.mihOrderNo == null) ? null
						: (this.mihOrderNo.length() <= mihOrderNoSize) ? this.mihOrderNo
								: this.mihOrderNo.substring(0, this.mihOrderNoSize)),
				((this.mihBillAcOn == null) ? null
						: (this.mihBillAcOn.length() <= mihBillAcOnSize) ? this.mihBillAcOn
								: this.mihBillAcOn.substring(0, this.mihBillAcOnSize)),
				((this.mihMsisdnNo == null) ? null
						: (this.mihMsisdnNo.length() <= mihMsisdnNoSize) ? this.mihMsisdnNo
								: this.mihMsisdnNo.substring(0, this.mihMsisdnNoSize)),
				((this.mihStoreCode == null) ? null
						: (this.mihStoreCode.length() <= mihStoreCodeSize) ? this.mihStoreCode
								: this.mihStoreCode.substring(0, this.mihStoreCodeSize)),
				this.mihTotQuantity, this.mihTotAmount, this.mihTransDatetime,
				((this.mihTransStatus == null) ? null
						: (this.mihTransStatus.length() <= mihTransStatusSize) ? this.mihTransStatus
								: this.mihTransStatus.substring(0, this.mihTransStatusSize)),
				this.mihStatDatetime,
				((this.mihComments == null) ? null
						: (this.mihComments.length() <= mihCommentsSize) ? this.mihComments
								: this.mihComments.substring(0, this.mihCommentsSize)) };
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
		return new DAOArgs(3).arg(mihOrderNo).arg(mihBillAcOn).arg(mihTransStatus);
	}

	protected void set(Object[] fields) {
		this.mihOrderNo = rtrim((String) fields[0]);
		this.mihBillAcOn = rtrim((String) fields[1]);
		this.mihMsisdnNo = rtrim((String) fields[2]);
		this.mihStoreCode = rtrim((String) fields[3]);
		this.mihTotQuantity = ((Integer) fields[4]);
		this.mihTotAmount = ((BigDecimal) fields[5]);
		this.mihTransDatetime = ((fields[6] == null) ? null : new DateTime((DateTime) fields[6]));
		this.mihTransStatus = rtrim((String) fields[7]);
		this.mihStatDatetime = ((fields[8] == null) ? null : new DateTime((DateTime) fields[8]));
		this.mihComments = rtrim((String) fields[9]);
	}

	public void set(final String mihOrderNo, final String mihBillAcOn, final String pmihMsisdnNo,
			final String mihStoreCode, final Integer mihTotQuantity, final BigDecimal mihTotAmount,
			final DateTime mihTransDatetime, final String mihTransStatus, final DateTime mihStatDatetime,
			final String mihComments) {

		this.mihOrderNo = mihOrderNo;
		this.mihBillAcOn = mihBillAcOn;
		this.mihMsisdnNo = pmihMsisdnNo;
		this.mihStoreCode = mihStoreCode;
		this.mihTotQuantity = mihTotQuantity;
		this.mihTotAmount = mihTotAmount;
		this.mihTransDatetime = mihTransDatetime;
		this.mihTransStatus = mihTransStatus;
		this.mihStatDatetime = mihStatDatetime;
		this.mihComments = mihComments;
	}

	public String getMihOrderNo() {
		return mihOrderNo;
	}

	public void setMihOrderNo(String mihOrderNo) {
		this.mihOrderNo = mihOrderNo;
	}

	public String getMihBillAcOn() {
		return mihBillAcOn;
	}

	public void setMihBillAcOn(String mihBillAcOn) {
		this.mihBillAcOn = mihBillAcOn;
	}

	public String getMihMsisdnNo() {
		return mihMsisdnNo;
	}

	public void setMihMsisdnNo(String pmihMsisdnNo) {
		this.mihMsisdnNo = pmihMsisdnNo;
	}

	public String getMihStoreCode() {
		return mihStoreCode;
	}

	public void setMihStoreCode(String mihStoreCode) {
		this.mihStoreCode = mihStoreCode;
	}

	public Integer getMihTotQuantity() {
		return mihTotQuantity;
	}

	public void setMihTotQuantity(Integer mihTotQuantity) {
		this.mihTotQuantity = mihTotQuantity;
	}

	public BigDecimal getMihTotAmount() {
		return mihTotAmount;
	}

	public void setMihTotAmount(BigDecimal mihTotAmount) {
		this.mihTotAmount = mihTotAmount;
	}

	public DateTime getMihTransDatetime() {
		return mihTransDatetime;
	}

	public void setMihTransDatetime(DateTime mihTransDatetime) {
		this.mihTransDatetime = mihTransDatetime;
	}

	public String getMihTransStatus() {
		return mihTransStatus;
	}

	public void setMihTransStatus(String mihTransStatus) {
		this.mihTransStatus = mihTransStatus;
	}

	public DateTime getMihStatDatetime() {
		return mihStatDatetime;
	}

	public void setMihStatDatetime(DateTime mihStatDatetime) {
		this.mihStatDatetime = mihStatDatetime;
	}

	public String getMihComments() {
		return mihComments;
	}

	public void setMihComments(String mihComments) {
		this.mihComments = mihComments;
	}

}