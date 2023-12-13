package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class DsvDgtlServVchDMO extends DBO implements Serializable {

	private Integer dsvSerialId;
	private String dsvTransactionId;
	private String dsvServiceCode;
	private Integer dsvStatus;
	private Integer dsvSubscriberId;
	private String dsvMsisdn;
	private String dsvEmail;
	private Date dsvReqDate;
	private Date dsvAllocDate;
	private String dsvErrorMsg;
	private String dsvAnalysis1;
	private String dsvAnalysis2;

	public static final int dsvSerialIdFilter = 0;
	private static final int dsvSerialIdSize = 13926052;

	public static final int dsvTransactionIdFilter = 1;
	private static final int dsvTransactionIdSize = 50;

	public static final int dsvServiceCodeFilter = 2;
	private static final int dsvServiceCodeSize = 12;

	public static final int dsvStatusFilter = 3;

	public static final int dsvSubscriberIdFilter = 4;

	public static final int dsvMsisdnFilter = 5;
	private static final int dsvMsisdnSize = 15;

	public static final int dsvEmailFilter = 6;
	private static final int dsvEmailSize = 50;

	public static final int dsvReqDateFilter = 7;

	public static final int dsvAllocDateFilter = 8;

	public static final int dsvErrorMsgFilter = 9;
	private static final int dsvErrorMsgSize = 500;

	public static final int dsvAnalysis1Filter = 10;
	private static final int dsvAnalysis1Size = 30;

	public static final int dsvAnalysis2Filter = 11;
	private static final int dsvAnalysis2Size = 30;

	public DsvDgtlServVchDMO() {
	};

	public DsvDgtlServVchDMO(final Integer dsvSerialId,
			final String dsvTransactionId, final String dsvServiceCode,
			final Integer dsvStatus, final Integer dsvSubscriberId,
			final String dsvMsisdn, final String dsvEmail,
			final Date dsvReqDate, final Date dsvAllocDate,
			final String dsvErrorMsg, final String dsvAnalysis1,
			final String dsvAnalysis2) {

		this.dsvSerialId = dsvSerialId;
		this.dsvTransactionId = dsvTransactionId;
		this.dsvServiceCode = dsvServiceCode;
		this.dsvStatus = dsvStatus;
		this.dsvSubscriberId = dsvSubscriberId;
		this.dsvMsisdn = dsvMsisdn;
		this.dsvEmail = dsvEmail;
		this.dsvReqDate = dsvReqDate;
		this.dsvAllocDate = dsvAllocDate;
		this.dsvErrorMsg = dsvErrorMsg;
		this.dsvAnalysis1 = dsvAnalysis1;
		this.dsvAnalysis2 = dsvAnalysis2;
	};

	private static final int[] fieldSizes = new int[] { dsvSerialIdSize,
			dsvTransactionIdSize, dsvServiceCodeSize, 0, 0, dsvMsisdnSize,
			dsvEmailSize, 0, 0, dsvErrorMsgSize, dsvAnalysis1Size,
			dsvAnalysis2Size };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dsvSerialId,
				((this.dsvTransactionId == null) ? null
						: (this.dsvTransactionId.length() <= dsvTransactionIdSize) ? this.dsvTransactionId
								: this.dsvTransactionId.substring(0,
										this.dsvTransactionIdSize)),
				((this.dsvServiceCode == null) ? null : (this.dsvServiceCode
						.length() <= dsvServiceCodeSize) ? this.dsvServiceCode
						: this.dsvServiceCode.substring(0,
								this.dsvServiceCodeSize)),
				this.dsvStatus,
				this.dsvSubscriberId,
				((this.dsvMsisdn == null) ? null
						: (this.dsvMsisdn.length() <= dsvMsisdnSize) ? this.dsvMsisdn
								: this.dsvMsisdn.substring(0,
										this.dsvMsisdnSize)),
				((this.dsvEmail == null) ? null
						: (this.dsvEmail.length() <= dsvEmailSize) ? this.dsvEmail
								: this.dsvEmail.substring(0, this.dsvEmailSize)),
				this.dsvReqDate,
				this.dsvAllocDate,
				((this.dsvErrorMsg == null) ? null
						: (this.dsvErrorMsg.length() <= dsvErrorMsgSize) ? this.dsvErrorMsg
								: this.dsvErrorMsg.substring(0,
										this.dsvErrorMsgSize)),
				((this.dsvAnalysis1 == null) ? null : (this.dsvAnalysis1
						.length() <= dsvAnalysis1Size) ? this.dsvAnalysis1
						: this.dsvAnalysis1.substring(0, this.dsvAnalysis1Size)),
				((this.dsvAnalysis2 == null) ? null : (this.dsvAnalysis2
						.length() <= dsvAnalysis2Size) ? this.dsvAnalysis2
						: this.dsvAnalysis2.substring(0, this.dsvAnalysis2Size)) };
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
		return new DAOArgs(1).arg(this.dsvSerialId);
	}

	protected void set(Object[] fields) {
		this.dsvSerialId = (Integer) fields[0];
		this.dsvTransactionId = rtrim((String) fields[1]);
		this.dsvServiceCode = rtrim((String) fields[2]);
		this.dsvStatus = ((Integer) fields[3]);
		this.dsvSubscriberId = ((Integer) fields[4]);
		this.dsvMsisdn = rtrim((String) fields[5]);
		this.dsvEmail = rtrim((String) fields[6]);
		this.dsvReqDate = ((Date) fields[7]);
		this.dsvAllocDate = ((Date) fields[8]);
		this.dsvErrorMsg = rtrim((String) fields[9]);
		this.dsvAnalysis1 = rtrim((String) fields[10]);
		this.dsvAnalysis2 = rtrim((String) fields[11]);
	}

	public void set(final Integer dsvSerialId, final String dsvTransactionId,
			final String dsvServiceCode, final Integer dsvStatus,
			final Integer dsvSubscriberId, final String dsvMsisdn,
			final String dsvEmail, final Date dsvReqDate,
			final Date dsvAllocDate, final String dsvErrorMsg,
			final String dsvAnalysis1, final String dsvAnalysis2) {

		this.dsvSerialId = dsvSerialId;
		this.dsvTransactionId = dsvTransactionId;
		this.dsvServiceCode = dsvServiceCode;
		this.dsvStatus = dsvStatus;
		this.dsvSubscriberId = dsvSubscriberId;
		this.dsvMsisdn = dsvMsisdn;
		this.dsvEmail = dsvEmail;
		this.dsvReqDate = dsvReqDate;
		this.dsvAllocDate = dsvAllocDate;
		this.dsvErrorMsg = dsvErrorMsg;
		this.dsvAnalysis1 = dsvAnalysis1;
		this.dsvAnalysis2 = dsvAnalysis2;
	}

	public Integer getDsvSerialId() {
		return dsvSerialId;
	}

	public void setDsvSerialId(Integer dsvSerialId) {
		this.dsvSerialId = dsvSerialId;
	}

	public String getDsvTransactionId() {
		return dsvTransactionId;
	}

	public void setDsvTransactionId(String dsvTransactionId) {
		this.dsvTransactionId = dsvTransactionId;
	}

	public String getDsvServiceCode() {
		return dsvServiceCode;
	}

	public void setDsvServiceCode(String dsvServiceCode) {
		this.dsvServiceCode = dsvServiceCode;
	}

	public Integer getDsvStatus() {
		return dsvStatus;
	}

	public void setDsvStatus(Integer dsvStatus) {
		this.dsvStatus = dsvStatus;
	}

	public Integer getDsvSubscriberId() {
		return dsvSubscriberId;
	}

	public void setDsvSubscriberId(Integer dsvSubscriberId) {
		this.dsvSubscriberId = dsvSubscriberId;
	}

	public String getDsvMsisdn() {
		return dsvMsisdn;
	}

	public void setDsvMsisdn(String dsvMsisdn) {
		this.dsvMsisdn = dsvMsisdn;
	}

	public String getDsvEmail() {
		return dsvEmail;
	}

	public void setDsvEmail(String dsvEmail) {
		this.dsvEmail = dsvEmail;
	}

	public Date getDsvReqDate() {
		return dsvReqDate;
	}

	public void setDsvReqDate(Date dsvReqDate) {
		this.dsvReqDate = dsvReqDate;
	}

	public Date getDsvAllocDate() {
		return dsvAllocDate;
	}

	public void setDsvAllocDate(Date dsvAllocDate) {
		this.dsvAllocDate = dsvAllocDate;
	}

	public String getDsvErrorMsg() {
		return dsvErrorMsg;
	}

	public void setDsvErrorMsg(String dsvErrorMsg) {
		this.dsvErrorMsg = dsvErrorMsg;
	}

	public String getDsvAnalysis1() {
		return dsvAnalysis1;
	}

	public void setDsvAnalysis1(String dsvAnalysis1) {
		this.dsvAnalysis1 = dsvAnalysis1;
	}

	public String getDsvAnalysis2() {
		return dsvAnalysis2;
	}

	public void setDsvAnalysis2(String dsvAnalysis2) {
		this.dsvAnalysis2 = dsvAnalysis2;
	}

}
