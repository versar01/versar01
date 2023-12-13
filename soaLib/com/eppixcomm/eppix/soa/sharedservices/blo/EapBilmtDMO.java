package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EapBilmtDMO extends DBO implements Serializable {

	private String eapBillAcNo;
	private Integer eapSubscriberId;
	private String eapSimNo;
	private String eapImsiNo;
	private String eapMsisdnNo;
	private String eapInvoiceNo;
	private String eapReferenceNo;
	private String eapSubsystem;
	private String eapRelation;
	private String eapTrigger;
	private String eapActionType;
	private Integer eapActionSeq;
	private String eapDocType;
	private String eapServiceCode;
	private String eapReasonCode;
	private String eapTableName;
	private String eapColumnName;
	private String eapNewValue;
	private String eapWhereColumn;
	private String eapWhereType;
	private String eapChargeCode;
	private String eapVoiceMess;
	private Integer eapAmnActionId;
	private String eapAmnTargType;
	private Integer eapAmnTargGrp;
	private String eapAmnTargUser;
	private Date eapAmnDeadline;
	private String eapAmnStatus;
	private String eapAmnSource;
	private String eapAmnOpenedBy;
	private Integer eapUdaActionId;
	private String eapStatus;
	private Short eapRetryRemain;
	private Date eapLastRetry;
	private String eapErrorText;
	private Date eapSubmitted;
	private Date eapActioned;

	public static final int eapBillAcNoFilter = 0;
	private static final int eapBillAcNoSize = 8;

	public static final int eapSubscriberIdFilter = 1;

	public static final int eapSimNoFilter = 2;
	private static final int eapSimNoSize = 14;

	public static final int eapImsiNoFilter = 3;
	private static final int eapImsiNoSize = 15;

	public static final int eapMsisdnNoFilter = 4;
	private static final int eapMsisdnNoSize = 15;

	public static final int eapInvoiceNoFilter = 5;
	private static final int eapInvoiceNoSize = 10;

	public static final int eapReferenceNoFilter = 6;
	private static final int eapReferenceNoSize = 10;

	public static final int eapSubsystemFilter = 7;
	private static final int eapSubsystemSize = 5;

	public static final int eapRelationFilter = 8;
	private static final int eapRelationSize = 10;

	public static final int eapTriggerFilter = 9;
	private static final int eapTriggerSize = 5;

	public static final int eapActionTypeFilter = 10;
	private static final int eapActionTypeSize = 3;

	public static final int eapActionSeqFilter = 11;
	private static final int eapActionSeqSize = 1;

	public static final int eapDocTypeFilter = 12;
	private static final int eapDocTypeSize = 10;

	public static final int eapServiceCodeFilter = 13;
	private static final int eapServiceCodeSize = 4;

	public static final int eapReasonCodeFilter = 14;
	private static final int eapReasonCodeSize = 4;

	public static final int eapTableNameFilter = 15;
	private static final int eapTableNameSize = 18;

	public static final int eapColumnNameFilter = 16;
	private static final int eapColumnNameSize = 18;

	public static final int eapNewValueFilter = 17;
	private static final int eapNewValueSize = 50;

	public static final int eapWhereColumnFilter = 18;
	private static final int eapWhereColumnSize = 18;

	public static final int eapWhereTypeFilter = 19;
	private static final int eapWhereTypeSize = 2;

	public static final int eapChargeCodeFilter = 20;
	private static final int eapChargeCodeSize = 5;

	public static final int eapVoiceMessFilter = 21;
	private static final int eapVoiceMessSize = 10;

	public static final int eapAmnActionIdFilter = 22;

	public static final int eapAmnTargTypeFilter = 23;
	private static final int eapAmnTargTypeSize = 1;

	public static final int eapAmnTargGrpFilter = 24;

	public static final int eapAmnTargUserFilter = 25;
	private static final int eapAmnTargUserSize = 20;

	public static final int eapAmnDeadlineFilter = 26;

	public static final int eapAmnStatusFilter = 27;
	private static final int eapAmnStatusSize = 1;

	public static final int eapAmnSourceFilter = 28;
	private static final int eapAmnSourceSize = 1;

	public static final int eapAmnOpenedByFilter = 29;
	private static final int eapAmnOpenedBySize = 20;

	public static final int eapUdaActionIdFilter = 30;

	public static final int eapStatusFilter = 31;
	private static final int eapStatusSize = 1;

	public static final int eapRetryRemainFilter = 32;

	public static final int eapLastRetryFilter = 33;

	public static final int eapErrorTextFilter = 34;
	private static final int eapErrorTextSize = 192;

	public static final int eapSubmittedFilter = 35;

	public static final int eapActionedFilter = 36;

	public EapBilmtDMO() {
	};

	public EapBilmtDMO(final String eapBillAcNo, final Integer eapSubscriberId,
			final String eapSimNo, final String eapImsiNo,
			final String eapMsisdnNo, final String eapInvoiceNo,
			final String eapReferenceNo, final String eapSubsystem,
			final String eapRelation, final String eapTrigger,
			final String eapActionType, final Integer eapActionSeq,
			final String eapDocType, final String eapServiceCode,
			final String eapReasonCode, final String eapTableName,
			final String eapColumnName, final String eapNewValue,
			final String eapWhereColumn, final String eapWhereType,
			final String eapChargeCode, final String eapVoiceMess,
			final Integer eapAmnActionId, final String eapAmnTargType,
			final Integer eapAmnTargGrp, final String eapAmnTargUser,
			final Date eapAmnDeadline, final String eapAmnStatus,
			final String eapAmnSource, final String eapAmnOpenedBy,
			final Integer eapUdaActionId, final String eapStatus,
			final Short eapRetryRemain, final Date eapLastRetry,
			final String eapErrorText, final Date eapSubmitted,
			final Date eapActioned) {

		this.eapBillAcNo = eapBillAcNo;
		this.eapSubscriberId = eapSubscriberId;
		this.eapSimNo = eapSimNo;
		this.eapImsiNo = eapImsiNo;
		this.eapMsisdnNo = eapMsisdnNo;
		this.eapInvoiceNo = eapInvoiceNo;
		this.eapReferenceNo = eapReferenceNo;
		this.eapSubsystem = eapSubsystem;
		this.eapRelation = eapRelation;
		this.eapTrigger = eapTrigger;
		this.eapActionType = eapActionType;
		this.eapActionSeq = eapActionSeq;
		this.eapDocType = eapDocType;
		this.eapServiceCode = eapServiceCode;
		this.eapReasonCode = eapReasonCode;
		this.eapTableName = eapTableName;
		this.eapColumnName = eapColumnName;
		this.eapNewValue = eapNewValue;
		this.eapWhereColumn = eapWhereColumn;
		this.eapWhereType = eapWhereType;
		this.eapChargeCode = eapChargeCode;
		this.eapVoiceMess = eapVoiceMess;
		this.eapAmnActionId = eapAmnActionId;
		this.eapAmnTargType = eapAmnTargType;
		this.eapAmnTargGrp = eapAmnTargGrp;
		this.eapAmnTargUser = eapAmnTargUser;
		this.eapAmnDeadline = eapAmnDeadline;
		this.eapAmnStatus = eapAmnStatus;
		this.eapAmnSource = eapAmnSource;
		this.eapAmnOpenedBy = eapAmnOpenedBy;
		this.eapUdaActionId = eapUdaActionId;
		this.eapStatus = eapStatus;
		this.eapRetryRemain = eapRetryRemain;
		this.eapLastRetry = eapLastRetry;
		this.eapErrorText = eapErrorText;
		this.eapSubmitted = eapSubmitted;
		this.eapActioned = eapActioned;
	};

	private static final int[] fieldSizes = new int[] { eapBillAcNoSize, 0,
			eapSimNoSize, eapImsiNoSize, eapMsisdnNoSize, eapInvoiceNoSize,
			eapReferenceNoSize, eapSubsystemSize, eapRelationSize,
			eapTriggerSize, eapActionTypeSize, eapActionSeqSize,
			eapDocTypeSize, eapServiceCodeSize, eapReasonCodeSize,
			eapTableNameSize, eapColumnNameSize, eapNewValueSize,
			eapWhereColumnSize, eapWhereTypeSize, eapChargeCodeSize,
			eapVoiceMessSize, 0, eapAmnTargTypeSize, 0, eapAmnTargUserSize, 0,
			eapAmnStatusSize, eapAmnSourceSize, eapAmnOpenedBySize, 0,
			eapStatusSize, 0, 0, eapErrorTextSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.eapBillAcNo == null) ? null
						: (this.eapBillAcNo.length() <= eapBillAcNoSize) ? this.eapBillAcNo
								: this.eapBillAcNo.substring(0,
										this.eapBillAcNoSize)),
				this.eapSubscriberId,
				((this.eapSimNo == null) ? null
						: (this.eapSimNo.length() <= eapSimNoSize) ? this.eapSimNo
								: this.eapSimNo.substring(0, this.eapSimNoSize)),
				((this.eapImsiNo == null) ? null
						: (this.eapImsiNo.length() <= eapImsiNoSize) ? this.eapImsiNo
								: this.eapImsiNo.substring(0,
										this.eapImsiNoSize)),
				((this.eapMsisdnNo == null) ? null
						: (this.eapMsisdnNo.length() <= eapMsisdnNoSize) ? this.eapMsisdnNo
								: this.eapMsisdnNo.substring(0,
										this.eapMsisdnNoSize)),
				((this.eapInvoiceNo == null) ? null : (this.eapInvoiceNo
						.length() <= eapInvoiceNoSize) ? this.eapInvoiceNo
						: this.eapInvoiceNo.substring(0, this.eapInvoiceNoSize)),
				((this.eapReferenceNo == null) ? null : (this.eapReferenceNo
						.length() <= eapReferenceNoSize) ? this.eapReferenceNo
						: this.eapReferenceNo.substring(0,
								this.eapReferenceNoSize)),
				((this.eapSubsystem == null) ? null : (this.eapSubsystem
						.length() <= eapSubsystemSize) ? this.eapSubsystem
						: this.eapSubsystem.substring(0, this.eapSubsystemSize)),
				((this.eapRelation == null) ? null
						: (this.eapRelation.length() <= eapRelationSize) ? this.eapRelation
								: this.eapRelation.substring(0,
										this.eapRelationSize)),
				((this.eapTrigger == null) ? null
						: (this.eapTrigger.length() <= eapTriggerSize) ? this.eapTrigger
								: this.eapTrigger.substring(0,
										this.eapTriggerSize)),
				((this.eapActionType == null) ? null : (this.eapActionType
						.length() <= eapActionTypeSize) ? this.eapActionType
						: this.eapActionType.substring(0,
								this.eapActionTypeSize)),
				this.eapActionSeq,
				((this.eapDocType == null) ? null
						: (this.eapDocType.length() <= eapDocTypeSize) ? this.eapDocType
								: this.eapDocType.substring(0,
										this.eapDocTypeSize)),
				((this.eapServiceCode == null) ? null : (this.eapServiceCode
						.length() <= eapServiceCodeSize) ? this.eapServiceCode
						: this.eapServiceCode.substring(0,
								this.eapServiceCodeSize)),
				((this.eapReasonCode == null) ? null : (this.eapReasonCode
						.length() <= eapReasonCodeSize) ? this.eapReasonCode
						: this.eapReasonCode.substring(0,
								this.eapReasonCodeSize)),
				((this.eapTableName == null) ? null : (this.eapTableName
						.length() <= eapTableNameSize) ? this.eapTableName
						: this.eapTableName.substring(0, this.eapTableNameSize)),
				((this.eapColumnName == null) ? null : (this.eapColumnName
						.length() <= eapColumnNameSize) ? this.eapColumnName
						: this.eapColumnName.substring(0,
								this.eapColumnNameSize)),
				((this.eapNewValue == null) ? null
						: (this.eapNewValue.length() <= eapNewValueSize) ? this.eapNewValue
								: this.eapNewValue.substring(0,
										this.eapNewValueSize)),
				((this.eapWhereColumn == null) ? null : (this.eapWhereColumn
						.length() <= eapWhereColumnSize) ? this.eapWhereColumn
						: this.eapWhereColumn.substring(0,
								this.eapWhereColumnSize)),
				((this.eapWhereType == null) ? null : (this.eapWhereType
						.length() <= eapWhereTypeSize) ? this.eapWhereType
						: this.eapWhereType.substring(0, this.eapWhereTypeSize)),
				((this.eapChargeCode == null) ? null : (this.eapChargeCode
						.length() <= eapChargeCodeSize) ? this.eapChargeCode
						: this.eapChargeCode.substring(0,
								this.eapChargeCodeSize)),
				((this.eapVoiceMess == null) ? null : (this.eapVoiceMess
						.length() <= eapVoiceMessSize) ? this.eapVoiceMess
						: this.eapVoiceMess.substring(0, this.eapVoiceMessSize)),
				this.eapAmnActionId,
				((this.eapAmnTargType == null) ? null : (this.eapAmnTargType
						.length() <= eapAmnTargTypeSize) ? this.eapAmnTargType
						: this.eapAmnTargType.substring(0,
								this.eapAmnTargTypeSize)),
				this.eapAmnTargGrp,
				((this.eapAmnTargUser == null) ? null : (this.eapAmnTargUser
						.length() <= eapAmnTargUserSize) ? this.eapAmnTargUser
						: this.eapAmnTargUser.substring(0,
								this.eapAmnTargUserSize)),
				this.eapAmnDeadline,
				((this.eapAmnStatus == null) ? null : (this.eapAmnStatus
						.length() <= eapAmnStatusSize) ? this.eapAmnStatus
						: this.eapAmnStatus.substring(0, this.eapAmnStatusSize)),
				((this.eapAmnSource == null) ? null : (this.eapAmnSource
						.length() <= eapAmnSourceSize) ? this.eapAmnSource
						: this.eapAmnSource.substring(0, this.eapAmnSourceSize)),
				((this.eapAmnOpenedBy == null) ? null : (this.eapAmnOpenedBy
						.length() <= eapAmnOpenedBySize) ? this.eapAmnOpenedBy
						: this.eapAmnOpenedBy.substring(0,
								this.eapAmnOpenedBySize)),
				this.eapUdaActionId,
				((this.eapStatus == null) ? null
						: (this.eapStatus.length() <= eapStatusSize) ? this.eapStatus
								: this.eapStatus.substring(0,
										this.eapStatusSize)),
				this.eapRetryRemain,
				this.eapLastRetry,
				((this.eapErrorText == null) ? null : (this.eapErrorText
						.length() <= eapErrorTextSize) ? this.eapErrorText
						: this.eapErrorText.substring(0, this.eapErrorTextSize)),
				this.eapSubmitted, this.eapActioned };
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
		return null;
	}

	protected void set(Object[] fields) {
		this.eapBillAcNo = rtrim((String) fields[0]);
		this.eapSubscriberId = ((Integer) fields[1]);
		this.eapSimNo = rtrim((String) fields[2]);
		this.eapImsiNo = rtrim((String) fields[3]);
		this.eapMsisdnNo = rtrim((String) fields[4]);
		this.eapInvoiceNo = rtrim((String) fields[5]);
		this.eapReferenceNo = rtrim((String) fields[6]);
		this.eapSubsystem = rtrim((String) fields[7]);
		this.eapRelation = rtrim((String) fields[8]);
		this.eapTrigger = rtrim((String) fields[9]);
		this.eapActionType = rtrim((String) fields[10]);
		this.eapActionSeq = (Integer) fields[11];
		this.eapDocType = rtrim((String) fields[12]);
		this.eapServiceCode = rtrim((String) fields[13]);
		this.eapReasonCode = rtrim((String) fields[14]);
		this.eapTableName = rtrim((String) fields[15]);
		this.eapColumnName = rtrim((String) fields[16]);
		this.eapNewValue = rtrim((String) fields[17]);
		this.eapWhereColumn = rtrim((String) fields[18]);
		this.eapWhereType = rtrim((String) fields[19]);
		this.eapChargeCode = rtrim((String) fields[20]);
		this.eapVoiceMess = rtrim((String) fields[21]);
		this.eapAmnActionId = ((Integer) fields[22]);
		this.eapAmnTargType = rtrim((String) fields[23]);
		this.eapAmnTargGrp = ((Integer) fields[24]);
		this.eapAmnTargUser = rtrim((String) fields[25]);
		this.eapAmnDeadline = ((fields[26] == null) ? null : new Date(
				(Date) fields[26]));
		this.eapAmnStatus = rtrim((String) fields[27]);
		this.eapAmnSource = rtrim((String) fields[28]);
		this.eapAmnOpenedBy = rtrim((String) fields[29]);
		this.eapUdaActionId = ((Integer) fields[30]);
		this.eapStatus = rtrim((String) fields[31]);
		this.eapRetryRemain = ((Short) fields[32]);
		this.eapLastRetry = ((fields[33] == null) ? null : new Date(
				(Date) fields[33]));
		this.eapErrorText = rtrim((String) fields[34]);
		this.eapSubmitted = ((fields[35] == null) ? null : new Date(
				(Date) fields[35]));
		this.eapActioned = ((fields[36] == null) ? null : new Date(
				(Date) fields[36]));
	}

	public void set(final String eapBillAcNo, final Integer eapSubscriberId,
			final String eapSimNo, final String eapImsiNo,
			final String eapMsisdnNo, final String eapInvoiceNo,
			final String eapReferenceNo, final String eapSubsystem,
			final String eapRelation, final String eapTrigger,
			final String eapActionType, final Integer eapActionSeq,
			final String eapDocType, final String eapServiceCode,
			final String eapReasonCode, final String eapTableName,
			final String eapColumnName, final String eapNewValue,
			final String eapWhereColumn, final String eapWhereType,
			final String eapChargeCode, final String eapVoiceMess,
			final Integer eapAmnActionId, final String eapAmnTargType,
			final Integer eapAmnTargGrp, final String eapAmnTargUser,
			final Date eapAmnDeadline, final String eapAmnStatus,
			final String eapAmnSource, final String eapAmnOpenedBy,
			final Integer eapUdaActionId, final String eapStatus,
			final Short eapRetryRemain, final Date eapLastRetry,
			final String eapErrorText, final Date eapSubmitted,
			final Date eapActioned) {

		this.eapBillAcNo = eapBillAcNo;
		this.eapSubscriberId = eapSubscriberId;
		this.eapSimNo = eapSimNo;
		this.eapImsiNo = eapImsiNo;
		this.eapMsisdnNo = eapMsisdnNo;
		this.eapInvoiceNo = eapInvoiceNo;
		this.eapReferenceNo = eapReferenceNo;
		this.eapSubsystem = eapSubsystem;
		this.eapRelation = eapRelation;
		this.eapTrigger = eapTrigger;
		this.eapActionType = eapActionType;
		this.eapActionSeq = eapActionSeq;
		this.eapDocType = eapDocType;
		this.eapServiceCode = eapServiceCode;
		this.eapReasonCode = eapReasonCode;
		this.eapTableName = eapTableName;
		this.eapColumnName = eapColumnName;
		this.eapNewValue = eapNewValue;
		this.eapWhereColumn = eapWhereColumn;
		this.eapWhereType = eapWhereType;
		this.eapChargeCode = eapChargeCode;
		this.eapVoiceMess = eapVoiceMess;
		this.eapAmnActionId = eapAmnActionId;
		this.eapAmnTargType = eapAmnTargType;
		this.eapAmnTargGrp = eapAmnTargGrp;
		this.eapAmnTargUser = eapAmnTargUser;
		this.eapAmnDeadline = eapAmnDeadline;
		this.eapAmnStatus = eapAmnStatus;
		this.eapAmnSource = eapAmnSource;
		this.eapAmnOpenedBy = eapAmnOpenedBy;
		this.eapUdaActionId = eapUdaActionId;
		this.eapStatus = eapStatus;
		this.eapRetryRemain = eapRetryRemain;
		this.eapLastRetry = eapLastRetry;
		this.eapErrorText = eapErrorText;
		this.eapSubmitted = eapSubmitted;
		this.eapActioned = eapActioned;
	}

	public String getEapBillAcNo() {
		return eapBillAcNo;
	}

	public void setEapBillAcNo(String eapBillAcNo) {
		this.eapBillAcNo = eapBillAcNo;
	}

	public Integer getEapSubscriberId() {
		return eapSubscriberId;
	}

	public void setEapSubscriberId(Integer eapSubscriberId) {
		this.eapSubscriberId = eapSubscriberId;
	}

	public String getEapSimNo() {
		return eapSimNo;
	}

	public void setEapSimNo(String eapSimNo) {
		this.eapSimNo = eapSimNo;
	}

	public String getEapImsiNo() {
		return eapImsiNo;
	}

	public void setEapImsiNo(String eapImsiNo) {
		this.eapImsiNo = eapImsiNo;
	}

	public String getEapMsisdnNo() {
		return eapMsisdnNo;
	}

	public void setEapMsisdnNo(String eapMsisdnNo) {
		this.eapMsisdnNo = eapMsisdnNo;
	}

	public String getEapInvoiceNo() {
		return eapInvoiceNo;
	}

	public void setEapInvoiceNo(String eapInvoiceNo) {
		this.eapInvoiceNo = eapInvoiceNo;
	}

	public String getEapReferenceNo() {
		return eapReferenceNo;
	}

	public void setEapReferenceNo(String eapReferenceNo) {
		this.eapReferenceNo = eapReferenceNo;
	}

	public String getEapSubsystem() {
		return eapSubsystem;
	}

	public void setEapSubsystem(String eapSubsystem) {
		this.eapSubsystem = eapSubsystem;
	}

	public String getEapRelation() {
		return eapRelation;
	}

	public void setEapRelation(String eapRelation) {
		this.eapRelation = eapRelation;
	}

	public String getEapTrigger() {
		return eapTrigger;
	}

	public void setEapTrigger(String eapTrigger) {
		this.eapTrigger = eapTrigger;
	}

	public String getEapActionType() {
		return eapActionType;
	}

	public void setEapActionType(String eapActionType) {
		this.eapActionType = eapActionType;
	}

	public Integer getEapActionSeq() {
		return eapActionSeq;
	}

	public void setEapActionSeq(Integer eapActionSeq) {
		this.eapActionSeq = eapActionSeq;
	}

	public String getEapDocType() {
		return eapDocType;
	}

	public void setEapDocType(String eapDocType) {
		this.eapDocType = eapDocType;
	}

	public String getEapServiceCode() {
		return eapServiceCode;
	}

	public void setEapServiceCode(String eapServiceCode) {
		this.eapServiceCode = eapServiceCode;
	}

	public String getEapReasonCode() {
		return eapReasonCode;
	}

	public void setEapReasonCode(String eapReasonCode) {
		this.eapReasonCode = eapReasonCode;
	}

	public String getEapTableName() {
		return eapTableName;
	}

	public void setEapTableName(String eapTableName) {
		this.eapTableName = eapTableName;
	}

	public String getEapColumnName() {
		return eapColumnName;
	}

	public void setEapColumnName(String eapColumnName) {
		this.eapColumnName = eapColumnName;
	}

	public String getEapNewValue() {
		return eapNewValue;
	}

	public void setEapNewValue(String eapNewValue) {
		this.eapNewValue = eapNewValue;
	}

	public String getEapWhereColumn() {
		return eapWhereColumn;
	}

	public void setEapWhereColumn(String eapWhereColumn) {
		this.eapWhereColumn = eapWhereColumn;
	}

	public String getEapWhereType() {
		return eapWhereType;
	}

	public void setEapWhereType(String eapWhereType) {
		this.eapWhereType = eapWhereType;
	}

	public String getEapChargeCode() {
		return eapChargeCode;
	}

	public void setEapChargeCode(String eapChargeCode) {
		this.eapChargeCode = eapChargeCode;
	}

	public String getEapVoiceMess() {
		return eapVoiceMess;
	}

	public void setEapVoiceMess(String eapVoiceMess) {
		this.eapVoiceMess = eapVoiceMess;
	}

	public Integer getEapAmnActionId() {
		return eapAmnActionId;
	}

	public void setEapAmnActionId(Integer eapAmnActionId) {
		this.eapAmnActionId = eapAmnActionId;
	}

	public String getEapAmnTargType() {
		return eapAmnTargType;
	}

	public void setEapAmnTargType(String eapAmnTargType) {
		this.eapAmnTargType = eapAmnTargType;
	}

	public Integer getEapAmnTargGrp() {
		return eapAmnTargGrp;
	}

	public void setEapAmnTargGrp(Integer eapAmnTargGrp) {
		this.eapAmnTargGrp = eapAmnTargGrp;
	}

	public String getEapAmnTargUser() {
		return eapAmnTargUser;
	}

	public void setEapAmnTargUser(String eapAmnTargUser) {
		this.eapAmnTargUser = eapAmnTargUser;
	}

	public Date getEapAmnDeadline() {
		return eapAmnDeadline;
	}

	public void setEapAmnDeadline(Date eapAmnDeadline) {
		this.eapAmnDeadline = eapAmnDeadline;
	}

	public String getEapAmnStatus() {
		return eapAmnStatus;
	}

	public void setEapAmnStatus(String eapAmnStatus) {
		this.eapAmnStatus = eapAmnStatus;
	}

	public String getEapAmnSource() {
		return eapAmnSource;
	}

	public void setEapAmnSource(String eapAmnSource) {
		this.eapAmnSource = eapAmnSource;
	}

	public String getEapAmnOpenedBy() {
		return eapAmnOpenedBy;
	}

	public void setEapAmnOpenedBy(String eapAmnOpenedBy) {
		this.eapAmnOpenedBy = eapAmnOpenedBy;
	}

	public Integer getEapUdaActionId() {
		return eapUdaActionId;
	}

	public void setEapUdaActionId(Integer eapUdaActionId) {
		this.eapUdaActionId = eapUdaActionId;
	}

	public String getEapStatus() {
		return eapStatus;
	}

	public void setEapStatus(String eapStatus) {
		this.eapStatus = eapStatus;
	}

	public Short getEapRetryRemain() {
		return eapRetryRemain;
	}

	public void setEapRetryRemain(Short eapRetryRemain) {
		this.eapRetryRemain = eapRetryRemain;
	}

	public Date getEapLastRetry() {
		return eapLastRetry;
	}

	public void setEapLastRetry(Date eapLastRetry) {
		this.eapLastRetry = eapLastRetry;
	}

	public String getEapErrorText() {
		return eapErrorText;
	}

	public void setEapErrorText(String eapErrorText) {
		this.eapErrorText = eapErrorText;
	}

	public Date getEapSubmitted() {
		return eapSubmitted;
	}

	public void setEapSubmitted(Date eapSubmitted) {
		this.eapSubmitted = eapSubmitted;
	}

	public Date getEapActioned() {
		return eapActioned;
	}

	public void setEapActioned(Date eapActioned) {
		this.eapActioned = eapActioned;
	}

}
