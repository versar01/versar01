package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class DcgDispChgHistDMO extends DBO implements Serializable {

	private Integer dcgDisputeKey;
	private Integer dcgNoteId;
	private String dcgActionType;
	private String dcgActionReas;
	private Integer dcgBillId;
	private String dcgCycle;
	private Date dcgBillTabDate;
	private String dcgBillAcNo;
	private Integer dcgSubscriberId;
	private String dcgMsisdnNo;
	private String dcgItemNo;
	private String dcgUserId;
	private Date dcgDisputeDate;
	private String dcgChargeCode;
	private Double dcgDisputeValue;
	private Date dcgCreditDate;
	private Double dcgCreditValue;
	private Short dcgDisputeStatus;
	private Short dcgDisputeFlag;
	private String dcgCreditBilltab;

	public static final int dcgDisputeKeyFilter = 0;

	public static final int dcgNoteIdFilter = 1;

	public static final int dcgActionTypeFilter = 2;
	private static final int dcgActionTypeSize = 8;

	public static final int dcgActionReasFilter = 3;
	private static final int dcgActionReasSize = 8;

	public static final int dcgBillIdFilter = 4;

	public static final int dcgCycleFilter = 5;
	private static final int dcgCycleSize = 5;

	public static final int dcgBillTabDateFilter = 6;

	public static final int dcgBillAcNoFilter = 7;
	private static final int dcgBillAcNoSize = 8;

	public static final int dcgSubscriberIdFilter = 8;

	public static final int dcgMsisdnNoFilter = 9;
	private static final int dcgMsisdnNoSize = 15;

	public static final int dcgItemNoFilter = 10;
	private static final int dcgItemNoSize = 10;

	public static final int dcgUserIdFilter = 11;
	private static final int dcgUserIdSize = 20;

	public static final int dcgDisputeDateFilter = 12;

	public static final int dcgChargeCodeFilter = 13;
	private static final int dcgChargeCodeSize = 5;

	public static final int dcgDisputeValueFilter = 14;

	public static final int dcgCreditDateFilter = 15;

	public static final int dcgCreditValueFilter = 16;

	public static final int dcgDisputeStatusFilter = 17;

	public static final int dcgDisputeFlagFilter = 18;

	public static final int dcgCreditBilltabFilter = 19;
	private static final int dcgCreditBilltabSize = 20;

	public DcgDispChgHistDMO() {
	};

	public DcgDispChgHistDMO(final Integer dcgDisputeKey,
			final Integer dcgNoteId, final String dcgActionType,
			final String dcgActionReas, final Integer dcgBillId,
			final String dcgCycle, final Date dcgBillTabDate,
			final String dcgBillAcNo, final Integer dcgSubscriberId,
			final String dcgMsisdnNo, final String dcgItemNo,
			final String dcgUserId, final Date dcgDisputeDate,
			final String dcgChargeCode, final Double dcgDisputeValue,
			final Date dcgCreditDate, final Double dcgCreditValue,
			final Short dcgDisputeStatus, final Short dcgDisputeFlag,
			final String dcgCreditBilltab) {

		this.dcgDisputeKey = dcgDisputeKey;
		this.dcgNoteId = dcgNoteId;
		this.dcgActionType = dcgActionType;
		this.dcgActionReas = dcgActionReas;
		this.dcgBillId = dcgBillId;
		this.dcgCycle = dcgCycle;
		this.dcgBillTabDate = dcgBillTabDate;
		this.dcgBillAcNo = dcgBillAcNo;
		this.dcgSubscriberId = dcgSubscriberId;
		this.dcgMsisdnNo = dcgMsisdnNo;
		this.dcgItemNo = dcgItemNo;
		this.dcgUserId = dcgUserId;
		this.dcgDisputeDate = dcgDisputeDate;
		this.dcgChargeCode = dcgChargeCode;
		this.dcgDisputeValue = dcgDisputeValue;
		this.dcgCreditDate = dcgCreditDate;
		this.dcgCreditValue = dcgCreditValue;
		this.dcgDisputeStatus = dcgDisputeStatus;
		this.dcgDisputeFlag = dcgDisputeFlag;
		this.dcgCreditBilltab = dcgCreditBilltab;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			dcgActionTypeSize, dcgActionReasSize, 0, dcgCycleSize, 0,
			dcgBillAcNoSize, 0, dcgMsisdnNoSize, dcgItemNoSize, dcgUserIdSize,
			0, dcgChargeCodeSize, 0, 0, 0, 0, 0, dcgCreditBilltabSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_FLOAT, FIELD_TYPE_DATE,
			FIELD_TYPE_FLOAT, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dcgDisputeKey,
				this.dcgNoteId,
				((this.dcgActionType == null) ? null : (this.dcgActionType
						.length() <= dcgActionTypeSize) ? this.dcgActionType
						: this.dcgActionType.substring(0,
								this.dcgActionTypeSize)),
				((this.dcgActionReas == null) ? null : (this.dcgActionReas
						.length() <= dcgActionReasSize) ? this.dcgActionReas
						: this.dcgActionReas.substring(0,
								this.dcgActionReasSize)),
				this.dcgBillId,
				((this.dcgCycle == null) ? null
						: (this.dcgCycle.length() <= dcgCycleSize) ? this.dcgCycle
								: this.dcgCycle.substring(0, this.dcgCycleSize)),
				this.dcgBillTabDate,
				((this.dcgBillAcNo == null) ? null
						: (this.dcgBillAcNo.length() <= dcgBillAcNoSize) ? this.dcgBillAcNo
								: this.dcgBillAcNo.substring(0,
										this.dcgBillAcNoSize)),
				this.dcgSubscriberId,
				((this.dcgMsisdnNo == null) ? null
						: (this.dcgMsisdnNo.length() <= dcgMsisdnNoSize) ? this.dcgMsisdnNo
								: this.dcgMsisdnNo.substring(0,
										this.dcgMsisdnNoSize)),
				((this.dcgItemNo == null) ? null
						: (this.dcgItemNo.length() <= dcgItemNoSize) ? this.dcgItemNo
								: this.dcgItemNo.substring(0,
										this.dcgItemNoSize)),
				((this.dcgUserId == null) ? null
						: (this.dcgUserId.length() <= dcgUserIdSize) ? this.dcgUserId
								: this.dcgUserId.substring(0,
										this.dcgUserIdSize)),
				this.dcgDisputeDate,
				((this.dcgChargeCode == null) ? null : (this.dcgChargeCode
						.length() <= dcgChargeCodeSize) ? this.dcgChargeCode
						: this.dcgChargeCode.substring(0,
								this.dcgChargeCodeSize)),
				this.dcgDisputeValue,
				this.dcgCreditDate,
				this.dcgCreditValue,
				this.dcgDisputeStatus,
				this.dcgDisputeFlag,
				((this.dcgCreditBilltab == null) ? null
						: (this.dcgCreditBilltab.length() <= dcgCreditBilltabSize) ? this.dcgCreditBilltab
								: this.dcgCreditBilltab.substring(0,
										this.dcgCreditBilltabSize)) };
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
		return new DAOArgs(1).arg(this.dcgDisputeKey);
	}

	protected void set(Object[] fields) {
		this.dcgDisputeKey = ((Integer) fields[0]);
		this.dcgNoteId = ((Integer) fields[1]);
		this.dcgActionType = rtrim((String) fields[2]);
		this.dcgActionReas = rtrim((String) fields[3]);
		this.dcgBillId = ((Integer) fields[4]);
		this.dcgCycle = rtrim((String) fields[5]);
		this.dcgBillTabDate = ((fields[6] == null) ? null : new Date(
				 fields[6]));
		this.dcgBillAcNo = rtrim((String) fields[7]);
		this.dcgSubscriberId = ((Integer) fields[8]);
		this.dcgMsisdnNo = rtrim((String) fields[9]);
		this.dcgItemNo = rtrim((String) fields[10]);
		this.dcgUserId = rtrim((String) fields[11]);
		this.dcgDisputeDate = ((fields[12] == null) ? null : new Date(
				 fields[12]));
		this.dcgChargeCode = rtrim((String) fields[13]);
		this.dcgDisputeValue = ((Double) fields[14]);
		this.dcgCreditDate = ((fields[15] == null) ? null : new Date(
				 fields[15]));
		this.dcgCreditValue = ((Double) fields[16]);
		this.dcgDisputeStatus = ((Short) fields[17]);
		this.dcgDisputeFlag = ((Short) fields[18]);
		this.dcgCreditBilltab = rtrim((String) fields[19]);
	}

	public void set(final Integer dcgDisputeKey, final Integer dcgNoteId,
			final String dcgActionType, final String dcgActionReas,
			final Integer dcgBillId, final String dcgCycle,
			final Date dcgBillTabDate, final String dcgBillAcNo,
			final Integer dcgSubscriberId, final String dcgMsisdnNo,
			final String dcgItemNo, final String dcgUserId,
			final Date dcgDisputeDate, final String dcgChargeCode,
			final Double dcgDisputeValue, final Date dcgCreditDate,
			final Double dcgCreditValue, final Short dcgDisputeStatus,
			final Short dcgDisputeFlag, final String dcgCreditBilltab) {

		this.dcgDisputeKey = dcgDisputeKey;
		this.dcgNoteId = dcgNoteId;
		this.dcgActionType = dcgActionType;
		this.dcgActionReas = dcgActionReas;
		this.dcgBillId = dcgBillId;
		this.dcgCycle = dcgCycle;
		this.dcgBillTabDate = dcgBillTabDate;
		this.dcgBillAcNo = dcgBillAcNo;
		this.dcgSubscriberId = dcgSubscriberId;
		this.dcgMsisdnNo = dcgMsisdnNo;
		this.dcgItemNo = dcgItemNo;
		this.dcgUserId = dcgUserId;
		this.dcgDisputeDate = dcgDisputeDate;
		this.dcgChargeCode = dcgChargeCode;
		this.dcgDisputeValue = dcgDisputeValue;
		this.dcgCreditDate = dcgCreditDate;
		this.dcgCreditValue = dcgCreditValue;
		this.dcgDisputeStatus = dcgDisputeStatus;
		this.dcgDisputeFlag = dcgDisputeFlag;
		this.dcgCreditBilltab = dcgCreditBilltab;
	}

	public Integer getDcgDisputeKey() {
		return dcgDisputeKey;
	}

	public void setDcgDisputeKey(Integer dcgDisputeKey) {
		this.dcgDisputeKey = dcgDisputeKey;
	}

	public Integer getDcgNoteId() {
		return dcgNoteId;
	}

	public void setDcgNoteId(Integer dcgNoteId) {
		this.dcgNoteId = dcgNoteId;
	}

	public String getDcgActionType() {
		return dcgActionType;
	}

	public void setDcgActionType(String dcgActionType) {
		this.dcgActionType = dcgActionType;
	}

	public String getDcgActionReas() {
		return dcgActionReas;
	}

	public void setDcgActionReas(String dcgActionReas) {
		this.dcgActionReas = dcgActionReas;
	}

	public Integer getDcgBillId() {
		return dcgBillId;
	}

	public void setDcgBillId(Integer dcgBillId) {
		this.dcgBillId = dcgBillId;
	}

	public String getDcgCycle() {
		return dcgCycle;
	}

	public void setDcgCycle(String dcgCycle) {
		this.dcgCycle = dcgCycle;
	}

	public Date getDcgBillTabDate() {
		return dcgBillTabDate;
	}

	public void setDcgBillTabDate(Date dcgBillTabDate) {
		this.dcgBillTabDate = dcgBillTabDate;
	}

	public String getDcgBillAcNo() {
		return dcgBillAcNo;
	}

	public void setDcgBillAcNo(String dcgBillAcNo) {
		this.dcgBillAcNo = dcgBillAcNo;
	}

	public Integer getDcgSubscriberId() {
		return dcgSubscriberId;
	}

	public void setDcgSubscriberId(Integer dcgSubscriberId) {
		this.dcgSubscriberId = dcgSubscriberId;
	}

	public String getDcgMsisdnNo() {
		return dcgMsisdnNo;
	}

	public void setDcgMsisdnNo(String dcgMsisdnNo) {
		this.dcgMsisdnNo = dcgMsisdnNo;
	}

	public String getDcgItemNo() {
		return dcgItemNo;
	}

	public void setDcgItemNo(String dcgItemNo) {
		this.dcgItemNo = dcgItemNo;
	}

	public String getDcgUserId() {
		return dcgUserId;
	}

	public void setDcgUserId(String dcgUserId) {
		this.dcgUserId = dcgUserId;
	}

	public Date getDcgDisputeDate() {
		return dcgDisputeDate;
	}

	public void setDcgDisputeDate(Date dcgDisputeDate) {
		this.dcgDisputeDate = dcgDisputeDate;
	}

	public String getDcgChargeCode() {
		return dcgChargeCode;
	}

	public void setDcgChargeCode(String dcgChargeCode) {
		this.dcgChargeCode = dcgChargeCode;
	}

	public Double getDcgDisputeValue() {
		return dcgDisputeValue;
	}

	public void setDcgDisputeValue(Double dcgDisputeValue) {
		this.dcgDisputeValue = dcgDisputeValue;
	}

	public Date getDcgCreditDate() {
		return dcgCreditDate;
	}

	public void setDcgCreditDate(Date dcgCreditDate) {
		this.dcgCreditDate = dcgCreditDate;
	}

	public Double getDcgCreditValue() {
		return dcgCreditValue;
	}

	public void setDcgCreditValue(Double dcgCreditValue) {
		this.dcgCreditValue = dcgCreditValue;
	}

	public Short getDcgDisputeStatus() {
		return dcgDisputeStatus;
	}

	public void setDcgDisputeStatus(Short dcgDisputeStatus) {
		this.dcgDisputeStatus = dcgDisputeStatus;
	}

	public Short getDcgDisputeFlag() {
		return dcgDisputeFlag;
	}

	public void setDcgDisputeFlag(Short dcgDisputeFlag) {
		this.dcgDisputeFlag = dcgDisputeFlag;
	}

	public String getDcgCreditBilltab() {
		return dcgCreditBilltab;
	}

	public void setDcgCreditBilltab(String dcgCreditBilltab) {
		this.dcgCreditBilltab = dcgCreditBilltab;
	}

}
