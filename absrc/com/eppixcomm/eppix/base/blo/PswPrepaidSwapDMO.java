package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class PswPrepaidSwapDMO extends DBO implements Serializable {

	private Integer pswSubscriberId;
	private String pswMsisdnNo;
	private String pswOldSimNo;
	private String pswNewSimNo;
	private String pswSimStatus;
	private DateTime pswStatusDate;
	private DateTime pswReceiptDate;

	public static final int pswSubscriberIdFilter = 0;

	public static final int pswMsisdnNoFilter = 1;
	private static final int pswMsisdnNoSize = 15;

	public static final int pswOldSimNoFilter = 2;
	private static final int pswOldSimNoSize = 14;

	public static final int pswNewSimNoFilter = 3;
	private static final int pswNewSimNoSize = 14;

	public static final int pswSimStatusFilter = 4;
	private static final int pswSimStatusSize = 1;

	public static final int pswStatusDateFilter = 5;

	public static final int pswReceiptDateFilter = 6;

	public PswPrepaidSwapDMO() {
	};

	public PswPrepaidSwapDMO(final Integer pswSubscriberId,
			final String pswMsisdnNo, final String pswOldSimNo,
			final String pswNewSimNo, final String pswSimStatus,
			final DateTime pswStatusDate, final DateTime pswReceiptDate) {

		this.pswSubscriberId = pswSubscriberId;
		this.pswMsisdnNo = pswMsisdnNo;
		this.pswOldSimNo = pswOldSimNo;
		this.pswNewSimNo = pswNewSimNo;
		this.pswSimStatus = pswSimStatus;
		this.pswStatusDate = pswStatusDate;
		this.pswReceiptDate = pswReceiptDate;
	};

	private static final int[] fieldSizes = new int[] { 0, pswMsisdnNoSize,
			pswOldSimNoSize, pswNewSimNoSize, pswSimStatusSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pswSubscriberId,
				((this.pswMsisdnNo == null) ? null
						: (this.pswMsisdnNo.length() <= pswMsisdnNoSize) ? this.pswMsisdnNo
								: this.pswMsisdnNo.substring(0,
										this.pswMsisdnNoSize)),
				((this.pswOldSimNo == null) ? null
						: (this.pswOldSimNo.length() <= pswOldSimNoSize) ? this.pswOldSimNo
								: this.pswOldSimNo.substring(0,
										this.pswOldSimNoSize)),
				((this.pswNewSimNo == null) ? null
						: (this.pswNewSimNo.length() <= pswNewSimNoSize) ? this.pswNewSimNo
								: this.pswNewSimNo.substring(0,
										this.pswNewSimNoSize)),
				((this.pswSimStatus == null) ? null : (this.pswSimStatus
						.length() <= pswSimStatusSize) ? this.pswSimStatus
						: this.pswSimStatus.substring(0, this.pswSimStatusSize)),
				this.pswStatusDate, this.pswReceiptDate };
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
		return new DAOArgs(1).arg(this.pswNewSimNo);
	}

	protected void set(Object[] fields) {
		this.pswSubscriberId = ((Integer) fields[0]);
		this.pswMsisdnNo = rtrim((String) fields[1]);
		this.pswOldSimNo = rtrim((String) fields[2]);
		this.pswNewSimNo = rtrim((String) fields[3]);
		this.pswSimStatus = rtrim((String) fields[4]);
		this.pswStatusDate = ((fields[5] == null) ? null : new DateTime(
				(DateTime) fields[5]));
		this.pswReceiptDate = ((fields[6] == null) ? null : new DateTime(
				(DateTime) fields[6]));
	}

	public void set(final Integer pswSubscriberId, final String pswMsisdnNo,
			final String pswOldSimNo, final String pswNewSimNo,
			final String pswSimStatus, final DateTime pswStatusDate,
			final DateTime pswReceiptDate) {

		this.pswSubscriberId = pswSubscriberId;
		this.pswMsisdnNo = pswMsisdnNo;
		this.pswOldSimNo = pswOldSimNo;
		this.pswNewSimNo = pswNewSimNo;
		this.pswSimStatus = pswSimStatus;
		this.pswStatusDate = pswStatusDate;
		this.pswReceiptDate = pswReceiptDate;
	}

	public Integer getPswSubscriberId() {
		return pswSubscriberId;
	}

	public void setPswSubscriberId(Integer pswSubscriberId) {
		this.pswSubscriberId = pswSubscriberId;
	}

	public String getPswMsisdnNo() {
		return pswMsisdnNo;
	}

	public void setPswMsisdnNo(String pswMsisdnNo) {
		this.pswMsisdnNo = pswMsisdnNo;
	}

	public String getPswOldSimNo() {
		return pswOldSimNo;
	}

	public void setPswOldSimNo(String pswOldSimNo) {
		this.pswOldSimNo = pswOldSimNo;
	}

	public String getPswNewSimNo() {
		return pswNewSimNo;
	}

	public void setPswNewSimNo(String pswNewSimNo) {
		this.pswNewSimNo = pswNewSimNo;
	}

	public String getPswSimStatus() {
		return pswSimStatus;
	}

	public void setPswSimStatus(String pswSimStatus) {
		this.pswSimStatus = pswSimStatus;
	}

	public DateTime getPswStatusDate() {
		return pswStatusDate;
	}

	public void setPswStatusDate(DateTime pswStatusDate) {
		this.pswStatusDate = pswStatusDate;
	}

	public DateTime getPswReceiptDate() {
		return pswReceiptDate;
	}

	public void setPswReceiptDate(DateTime pswReceiptDate) {
		this.pswReceiptDate = pswReceiptDate;
	}

}