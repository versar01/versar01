package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EmqMessageQueDMO extends DBO implements Serializable {

	private Integer emqSerial;
	private Integer emqMessageId;
	private String emqAccountNo;
	private String emqMsisdnNo;
	private String emqSimNo;
	private String emqHistoryCode;
	private String emqDocLoc;
	private String emqSender;
	private String emqReceiver;
	private String emqSubject;
	private String emqAttention;
	private String emqOldValue;
	private String emqNewValue;
	private Short emqStatus;
	private String emqComment;
	private Date emqSubmittedDate;
	private Date emqProcessedDate;
	private String emqMessageType;
	private Integer emqMessInterval;

	public static final int emqSerialFilter = 0;
	private static final int emqSerialSize = 1;

	public static final int emqMessageIdFilter = 1;

	public static final int emqAccountNoFilter = 2;
	private static final int emqAccountNoSize = 8;

	public static final int emqMsisdnNoFilter = 3;
	private static final int emqMsisdnNoSize = 15;

	public static final int emqSimNoFilter = 4;
	private static final int emqSimNoSize = 14;

	public static final int emqHistoryCodeFilter = 5;

	public static final int emqDocLocFilter = 6;

	public static final int emqSenderFilter = 7;

	public static final int emqReceiverFilter = 8;

	public static final int emqSubjectFilter = 9;

	public static final int emqAttentionFilter = 10;

	public static final int emqOldValueFilter = 11;

	public static final int emqNewValueFilter = 12;

	public static final int emqStatusFilter = 13;

	public static final int emqCommentFilter = 14;

	public static final int emqSubmittedDateFilter = 15;

	public static final int emqProcessedDateFilter = 16;
	
	public static final int emqMessagetypeFilter = 17;
	private static final int emqMessageTypeSize = 10;
	
	public static final int emqMessIntervalFilter = 18;


	public EmqMessageQueDMO() {
	};

	public EmqMessageQueDMO(final Integer emqSerial, final Integer emqMessageId,
			final String emqAccountNo, final String emqMsisdnNo,
			final String emqSimNo, final String emqHistoryCode,
			final String emqDocLoc, final String emqSender,
			final String emqReceiver, final String emqSubject,
			final String emqAttention, final String emqOldValue,
			final String emqNewValue, final Short emqStatus,
			final String emqComment, final Date emqSubmittedDate,
			final Date emqProcessedDate,final String emqMessageType, final Integer emqMessageInterval) {

		this.emqSerial = emqSerial;
		this.emqMessageId = emqMessageId;
		this.emqAccountNo = emqAccountNo;
		this.emqMsisdnNo = emqMsisdnNo;
		this.emqSimNo = emqSimNo;
		this.emqHistoryCode = emqHistoryCode;
		this.emqDocLoc = emqDocLoc;
		this.emqSender = emqSender;
		this.emqReceiver = emqReceiver;
		this.emqSubject = emqSubject;
		this.emqAttention = emqAttention;
		this.emqOldValue = emqOldValue;
		this.emqNewValue = emqNewValue;
		this.emqStatus = emqStatus;
		this.emqComment = emqComment;
		this.emqSubmittedDate = emqSubmittedDate;
		this.emqProcessedDate = emqProcessedDate;
		this.emqMessageType = emqMessageType;
		this.emqMessInterval = emqMessageInterval;
	};

	private static final int[] fieldSizes = new int[] { emqSerialSize, 0,
			emqAccountNoSize, emqMsisdnNoSize, emqSimNoSize, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, emqMessageTypeSize,0};

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE,  FIELD_TYPE_STRING, FIELD_TYPE_INTEGER};

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.emqSerial,
				this.emqMessageId,
				((this.emqAccountNo == null) ? null : (this.emqAccountNo
						.length() <= emqAccountNoSize) ? this.emqAccountNo
						: this.emqAccountNo.substring(0, this.emqAccountNoSize)),
				((this.emqMsisdnNo == null) ? null
						: (this.emqMsisdnNo.length() <= emqMsisdnNoSize) ? this.emqMsisdnNo
								: this.emqMsisdnNo.substring(0,
										this.emqMsisdnNoSize)),
				((this.emqSimNo == null) ? null
						: (this.emqSimNo.length() <= emqSimNoSize) ? this.emqSimNo
								: this.emqSimNo.substring(0, this.emqSimNoSize)),
				this.emqHistoryCode, this.emqDocLoc, this.emqSender,
				this.emqReceiver, this.emqSubject, this.emqAttention,
				this.emqOldValue, this.emqNewValue, this.emqStatus,
				this.emqComment, this.emqSubmittedDate, this.emqProcessedDate,
				((this.emqMessageType == null) ? null
						: (this.emqMessageType.length() <= emqMessageTypeSize) ? this.emqMessageType
								: this.emqMessageType.substring(0, this.emqMessageTypeSize)),
				this.emqMessInterval};
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
		return new DAOArgs(1).arg(this.emqSerial);
	}

	protected void set(Object[] fields) {
		this.emqSerial = (Integer) fields[0];
		this.emqMessageId = ((Integer) fields[1]);
		this.emqAccountNo = rtrim((String) fields[2]);
		this.emqMsisdnNo = rtrim((String) fields[3]);
		this.emqSimNo = rtrim((String) fields[4]);
		this.emqHistoryCode = ((String) fields[5]);
		this.emqDocLoc = ((String) fields[6]);
		this.emqSender = ((String) fields[7]);
		this.emqReceiver = ((String) fields[8]);
		this.emqSubject = ((String) fields[9]);
		this.emqAttention = ((String) fields[10]);
		this.emqOldValue = ((String) fields[11]);
		this.emqNewValue = ((String) fields[12]);
		this.emqStatus = ((Short) fields[13]);
		this.emqComment = ((String) fields[14]);
		this.emqSubmittedDate = ((fields[15] == null) ? null : new Date(fields[15]));
		this.emqProcessedDate = ((fields[16] == null) ? null : new Date(fields[16]));
		this.emqMessageType = rtrim((String) fields[17]);
		this.emqMessInterval = (Integer) fields[18];
	}

	public void set(final Integer emqSerial, final Integer emqMessageId,
			final String emqAccountNo, final String emqMsisdnNo,
			final String emqSimNo, final String emqHistoryCode,
			final String emqDocLoc, final String emqSender,
			final String emqReceiver, final String emqSubject,
			final String emqAttention, final String emqOldValue,
			final String emqNewValue, final Short emqStatus,
			final String emqComment, final Date emqSubmittedDate,
			final Date emqProcessedDate, final String emqMessageType, final Integer emqMessageInterval) {

		this.emqSerial = emqSerial;
		this.emqMessageId = emqMessageId;
		this.emqAccountNo = emqAccountNo;
		this.emqMsisdnNo = emqMsisdnNo;
		this.emqSimNo = emqSimNo;
		this.emqHistoryCode = emqHistoryCode;
		this.emqDocLoc = emqDocLoc;
		this.emqSender = emqSender;
		this.emqReceiver = emqReceiver;
		this.emqSubject = emqSubject;
		this.emqAttention = emqAttention;
		this.emqOldValue = emqOldValue;
		this.emqNewValue = emqNewValue;
		this.emqStatus = emqStatus;
		this.emqComment = emqComment;
		this.emqSubmittedDate = emqSubmittedDate;
		this.emqProcessedDate = emqProcessedDate;
		this.emqMessageType = emqMessageType;
		this.emqMessInterval = emqMessageInterval;
	}

	public Integer getEmqSerial() {
		return emqSerial;
	}

	public void setEmqSerial(Integer emqSerial) {
		this.emqSerial = emqSerial;
	}

	public Integer getEmqMessageId() {
		return emqMessageId;
	}

	public void setEmqMessageId(Integer emqMessageId) {
		this.emqMessageId = emqMessageId;
	}

	public String getEmqAccountNo() {
		return emqAccountNo;
	}

	public void setEmqAccountNo(String emqAccountNo) {
		this.emqAccountNo = emqAccountNo;
	}

	public String getEmqMsisdnNo() {
		return emqMsisdnNo;
	}

	public void setEmqMsisdnNo(String emqMsisdnNo) {
		this.emqMsisdnNo = emqMsisdnNo;
	}

	public String getEmqSimNo() {
		return emqSimNo;
	}

	public void setEmqSimNo(String emqSimNo) {
		this.emqSimNo = emqSimNo;
	}

	public String getEmqHistoryCode() {
		return emqHistoryCode;
	}

	public void setEmqHistoryCode(String emqHistoryCode) {
		this.emqHistoryCode = emqHistoryCode;
	}

	public String getEmqDocLoc() {
		return emqDocLoc;
	}

	public void setEmqDocLoc(String emqDocLoc) {
		this.emqDocLoc = emqDocLoc;
	}

	public String getEmqSender() {
		return emqSender;
	}

	public void setEmqSender(String emqSender) {
		this.emqSender = emqSender;
	}

	public String getEmqReceiver() {
		return emqReceiver;
	}

	public void setEmqReceiver(String emqReceiver) {
		this.emqReceiver = emqReceiver;
	}

	public String getEmqSubject() {
		return emqSubject;
	}

	public void setEmqSubject(String emqSubject) {
		this.emqSubject = emqSubject;
	}

	public String getEmqAttention() {
		return emqAttention;
	}

	public void setEmqAttention(String emqAttention) {
		this.emqAttention = emqAttention;
	}

	public String getEmqOldValue() {
		return emqOldValue;
	}

	public void setEmqOldValue(String emqOldValue) {
		this.emqOldValue = emqOldValue;
	}

	public String getEmqNewValue() {
		return emqNewValue;
	}

	public void setEmqNewValue(String emqNewValue) {
		this.emqNewValue = emqNewValue;
	}

	public Short getEmqStatus() {
		return emqStatus;
	}

	public void setEmqStatus(Short emqStatus) {
		this.emqStatus = emqStatus;
	}

	public String getEmqComment() {
		return emqComment;
	}

	public void setEmqComment(String emqComment) {
		this.emqComment = emqComment;
	}

	public Date getEmqSubmittedDate() {
		return emqSubmittedDate;
	}

	public void setEmqSubmittedDate(Date emqSubmittedDate) {
		this.emqSubmittedDate = emqSubmittedDate;
	}

	public Date getEmqProcessedDate() {
		return emqProcessedDate;
	}

	public void setEmqProcessedDate(Date emqProcessedDate) {
		this.emqProcessedDate = emqProcessedDate;
	}

	public String getEmqMessageType() {
		return emqMessageType;
	}

	public void setEmqMessageType(String emqMessageType) {
		this.emqMessageType = emqMessageType;
	}

	public Integer getEmqMessInterval() {
		return emqMessInterval;
	}

	public void setEmqMessInterval(Integer emqMessageInterval) {
		this.emqMessInterval = emqMessageInterval;
	}

}
