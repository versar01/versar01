package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EmaMessageArchiveDMO extends DBO implements Serializable {

	private Integer emaSerial;
	private Integer emaMessageId;
	private String emaAccountNo;
	private String emaMsisdnNo;
	private String emaSimNo;
	private String emaHistoryCode;
	private String emaDocLoc;
	private String emaSender;
	private String emaReceiver;
	private String emaSubject;
	private String emaAttention;
	private String emaOldValue;
	private String emaNewValue;
	private Short emaStatus;
	private String emaComment;
	private Date emaSubmittedDate;
	private Date emaProcessedDate;
	private String emaContents;
	private String emaSentId;
	private String emaMessageType;
	private Integer emaMessInterval;

	public static final int emaSerialFilter = 0;
	private static final int emaSerialSize = 1;

	public static final int emaMessageIdFilter = 1;

	public static final int emaAccountNoFilter = 2;
	private static final int emaAccountNoSize = 8;

	public static final int emaMsisdnNoFilter = 3;
	private static final int emaMsisdnNoSize = 15;

	public static final int emaSimNoFilter = 4;
	private static final int emaSimNoSize = 14;

	public static final int emaHistoryCodeFilter = 5;

	public static final int emaDocLocFilter = 6;

	public static final int emaSenderFilter = 7;

	public static final int emaReceiverFilter = 8;

	public static final int emaSubjectFilter = 9;

	public static final int emaAttentionFilter = 10;

	public static final int emaOldValueFilter = 11;

	public static final int emaNewValueFilter = 12;

	public static final int emaStatusFilter = 13;

	public static final int emaCommentFilter = 14;

	public static final int emaSubmittedDateFilter = 15;

	public static final int emaProcessedDateFilter = 16;

	public static final int emaContentsFilter = 17;

	public static final int emaSentIdFilter = 18;
	
	public static final int emaMessageTypeFilter = 19;
	private static final int emaMessageTypeSize = 10;
	
	public static final int emaMessIntervalFilter = 20;


	public EmaMessageArchiveDMO() {
	};

	public EmaMessageArchiveDMO(final Integer emaSerial,
			final Integer emaMessageId, final String emaAccountNo,
			final String emaMsisdnNo, final String emaSimNo,
			final String emaHistoryCode, final String emaDocLoc,
			final String emaSender, final String emaReceiver,
			final String emaSubject, final String emaAttention,
			final String emaOldValue, final String emaNewValue,
			final Short emaStatus, final String emaComment,
			final Date emaSubmittedDate, final Date emaProcessedDate,
			final String emaContents, final String emaSentId, final String emqMessageType, final Integer emaMessInterval) {

		this.emaSerial = emaSerial;
		this.emaMessageId = emaMessageId;
		this.emaAccountNo = emaAccountNo;
		this.emaMsisdnNo = emaMsisdnNo;
		this.emaSimNo = emaSimNo;
		this.emaHistoryCode = emaHistoryCode;
		this.emaDocLoc = emaDocLoc;
		this.emaSender = emaSender;
		this.emaReceiver = emaReceiver;
		this.emaSubject = emaSubject;
		this.emaAttention = emaAttention;
		this.emaOldValue = emaOldValue;
		this.emaNewValue = emaNewValue;
		this.emaStatus = emaStatus;
		this.emaComment = emaComment;
		this.emaSubmittedDate = emaSubmittedDate;
		this.emaProcessedDate = emaProcessedDate;
		this.emaContents = emaContents;
		this.emaSentId = emaSentId;
		this.emaMessageType = emaMessageType;
		this.emaMessInterval = emaMessInterval;
	};

	private static final int[] fieldSizes = new int[] { emaSerialSize, 0,
			emaAccountNoSize, emaMsisdnNoSize, emaSimNoSize, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, emaMessageTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.emaSerial,
				this.emaMessageId,
				((this.emaAccountNo == null) ? null : (this.emaAccountNo
						.length() <= emaAccountNoSize) ? this.emaAccountNo
						: this.emaAccountNo.substring(0, this.emaAccountNoSize)),
				((this.emaMsisdnNo == null) ? null
						: (this.emaMsisdnNo.length() <= emaMsisdnNoSize) ? this.emaMsisdnNo
								: this.emaMsisdnNo.substring(0,
										this.emaMsisdnNoSize)),
				((this.emaSimNo == null) ? null
						: (this.emaSimNo.length() <= emaSimNoSize) ? this.emaSimNo
								: this.emaSimNo.substring(0, this.emaSimNoSize)),
				this.emaHistoryCode, this.emaDocLoc, this.emaSender,
				this.emaReceiver, this.emaSubject, this.emaAttention,
				this.emaOldValue, this.emaNewValue, this.emaStatus,
				this.emaComment, this.emaSubmittedDate, this.emaProcessedDate,
				this.emaContents, this.emaSentId,
				((this.emaMessageType == null) ? null
						: (this.emaMessageType.length() <= emaMessageTypeSize) ? this.emaMessageType
								: this.emaMessageType.substring(0, this.emaMessageTypeSize)),
				this.emaMessInterval};
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
		return new DAOArgs(1).arg(this.emaSerial);
	}

	protected void set(Object[] fields) {
		this.emaSerial = (Integer) fields[0];
		this.emaMessageId = ((Integer) fields[1]);
		this.emaAccountNo = rtrim((String) fields[2]);
		this.emaMsisdnNo = rtrim((String) fields[3]);
		this.emaSimNo = rtrim((String) fields[4]);
		this.emaHistoryCode = ((String) fields[5]);
		this.emaDocLoc = rtrim((String) fields[6]);
		this.emaSender = rtrim((String) fields[7]);
		this.emaReceiver = rtrim((String) fields[8]);
		this.emaSubject = rtrim((String) fields[9]);
		this.emaAttention = rtrim((String) fields[10]);
		this.emaOldValue = rtrim((String) fields[11]);
		this.emaNewValue = rtrim((String) fields[12]);
		this.emaStatus = ((Short) fields[13]);
		this.emaComment = rtrim((String) fields[14]);
		this.emaSubmittedDate = ((fields[15] == null) ? null : new Date(
				fields[15]));
		this.emaProcessedDate = ((fields[16] == null) ? null : new Date(
				fields[16]));
		this.emaContents = rtrim((String) fields[17]);
		this.emaSentId = rtrim((String) fields[18]);
		this.emaMessageType = rtrim((String) fields[19]);
		this.emaMessInterval = ((Integer) fields[20]);
		
	}

	public void set(final Integer emaSerial, final Integer emaMessageId,
			final String emaAccountNo, final String emaMsisdnNo,
			final String emaSimNo, final String emaHistoryCode,
			final String emaDocLoc, final String emaSender,
			final String emaReceiver, final String emaSubject,
			final String emaAttention, final String emaOldValue,
			final String emaNewValue, final Short emaStatus,
			final String emaComment, final Date emaSubmittedDate,
			final Date emaProcessedDate, final String emaContents,
			final String emaSentId, final String emqMessageType, final Integer emaMessInterval) {

		this.emaSerial = emaSerial;
		this.emaMessageId = emaMessageId;
		this.emaAccountNo = emaAccountNo;
		this.emaMsisdnNo = emaMsisdnNo;
		this.emaSimNo = emaSimNo;
		this.emaHistoryCode = emaHistoryCode;
		this.emaDocLoc = emaDocLoc;
		this.emaSender = emaSender;
		this.emaReceiver = emaReceiver;
		this.emaSubject = emaSubject;
		this.emaAttention = emaAttention;
		this.emaOldValue = emaOldValue;
		this.emaNewValue = emaNewValue;
		this.emaStatus = emaStatus;
		this.emaComment = emaComment;
		this.emaSubmittedDate = emaSubmittedDate;
		this.emaProcessedDate = emaProcessedDate;
		this.emaContents = emaContents;
		this.emaSentId = emaSentId;
		this.emaMessageType = emaMessageType;
		this.emaMessInterval = emaMessInterval;
	}

	public Integer getEmaSerial() {
		return emaSerial;
	}

	public void setEmaSerial(Integer emaSerial) {
		this.emaSerial = emaSerial;
	}

	public Integer getEmaMessageId() {
		return emaMessageId;
	}

	public void setEmaMessageId(Integer emaMessageId) {
		this.emaMessageId = emaMessageId;
	}

	public String getEmaAccountNo() {
		return emaAccountNo;
	}

	public void setEmaAccountNo(String emaAccountNo) {
		this.emaAccountNo = emaAccountNo;
	}

	public String getEmaMsisdnNo() {
		return emaMsisdnNo;
	}

	public void setEmaMsisdnNo(String emaMsisdnNo) {
		this.emaMsisdnNo = emaMsisdnNo;
	}

	public String getEmaSimNo() {
		return emaSimNo;
	}

	public void setEmaSimNo(String emaSimNo) {
		this.emaSimNo = emaSimNo;
	}

	public String getEmaHistoryCode() {
		return emaHistoryCode;
	}

	public void setEmaHistoryCode(String emaHistoryCode) {
		this.emaHistoryCode = emaHistoryCode;
	}

	public String getEmaDocLoc() {
		return emaDocLoc;
	}

	public void setEmaDocLoc(String emaDocLoc) {
		this.emaDocLoc = emaDocLoc;
	}

	public String getEmaSender() {
		return emaSender;
	}

	public void setEmaSender(String emaSender) {
		this.emaSender = emaSender;
	}

	public String getEmaReceiver() {
		return emaReceiver;
	}

	public void setEmaReceiver(String emaReceiver) {
		this.emaReceiver = emaReceiver;
	}

	public String getEmaSubject() {
		return emaSubject;
	}

	public void setEmaSubject(String emaSubject) {
		this.emaSubject = emaSubject;
	}

	public String getEmaAttention() {
		return emaAttention;
	}

	public void setEmaAttention(String emaAttention) {
		this.emaAttention = emaAttention;
	}

	public String getEmaOldValue() {
		return emaOldValue;
	}

	public void setEmaOldValue(String emaOldValue) {
		this.emaOldValue = emaOldValue;
	}

	public String getEmaNewValue() {
		return emaNewValue;
	}

	public void setEmaNewValue(String emaNewValue) {
		this.emaNewValue = emaNewValue;
	}

	public Short getEmaStatus() {
		return emaStatus;
	}

	public void setEmaStatus(Short emaStatus) {
		this.emaStatus = emaStatus;
	}

	public String getEmaComment() {
		return emaComment;
	}

	public void setEmaComment(String emaComment) {
		this.emaComment = emaComment;
	}

	public Date getEmaSubmittedDate() {
		return emaSubmittedDate;
	}

	public void setEmaSubmittedDate(Date emaSubmittedDate) {
		this.emaSubmittedDate = emaSubmittedDate;
	}

	public Date getEmaProcessedDate() {
		return emaProcessedDate;
	}

	public void setEmaProcessedDate(Date emaProcessedDate) {
		this.emaProcessedDate = emaProcessedDate;
	}

	public String getEmaContents() {
		return emaContents;
	}

	public void setEmaContents(String emaContents) {
		this.emaContents = emaContents;
	}

	public String getEmaSentId() {
		return emaSentId;
	}

	public void setEmaSentId(String emaSentId) {
		this.emaSentId = emaSentId;
	}

	public String getEmaMessageType() {
		return emaMessageType;
	}

	public void setEmaMessageType(String emaMessageType) {
		this.emaMessageType = emaMessageType;
	}

	public Integer getEmaMessInterval() {
		return emaMessInterval;
	}

	public void setEmaMessInterval(Integer emaMessInterval) {
		this.emaMessInterval = emaMessInterval;
	}

}