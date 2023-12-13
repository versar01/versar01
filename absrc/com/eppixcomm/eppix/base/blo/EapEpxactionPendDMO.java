package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class EapEpxactionPendDMO extends DBO
implements Serializable {

	private String eapBbillAcNo;
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
	private DateTime eapAmnDeadline;
	private String eapAmnStatus;
	private String eapAmnSource;
	private String eapAmnOpenedBy;
	private Integer eapUdaActionId;
	private String eapStatus;
	private Integer eapRetryRemain;
	private DateTime eapLastRetry;
	private String eapErrorText;
	private DateTime eapSubmitted;
	private DateTime eapActioned;
	
	public static final int eapBbillAcNoFilter = 0;
	private static final int eapBbillAcNoSize = 8;

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
	
	public EapEpxactionPendDMO(
			final String eapBbillAcNo,
			final Integer eapSubscriberId,
			final String eapSimNo,
			final String eapImsiNo,
			final String eapMsisdnNo,
			final String eapInvoiceNo,
			final String eapReferenceNo,
			final String eapSubsystem,
			final String eapRelation,
			final String eapTrigger,
			final String eapActionType,
			final Integer eapActionSeq,
			final String eapDocType,
			final String eapServiceCode,
			final String eapReasonCode,
			final String eapTableName,
			final String eapColumnName,
			final String eapNewValue,
			final String eapWhereColumn,
			final String eapWhereType,
			final String eapChargeCode,
			final String eapVoiceMess,
			final Integer eapAmnActionId,
			final String eapAmnTargType,
			final Integer eapAmnTargGrp,
			final String eapAmnTargUser,
			final DateTime eapAmnDeadline,
			final String eapAmnStatus,
			final String eapAmnSource,
			final String eapAmnOpenedBy,
			final Integer eapUdaActionId,
			final String eapStatus,
			final Integer eapRetryRemain,
			final DateTime eapLastRetry,
			final String eapErrorText,
			final DateTime eapSubmitted,
			final DateTime eapActioned
			){
			this.eapBbillAcNo = eapBbillAcNo;
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

	

		public EapEpxactionPendDMO(){
		}	
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
				(eapBbillAcNo == null ) ? null: ( ( eapBbillAcNo.length(  ) <= eapBbillAcNoSize ) ? eapBbillAcNo : eapBbillAcNo.substring( 0, eapBbillAcNoSize )),	
						eapSubscriberId,
						( eapSimNo == null ) ? null: ( ( eapSimNo.length(  ) <= eapSimNoSize ) ? eapSimNo : eapSimNo.substring( 0, eapSimNoSize )),	
						( eapImsiNo == null ) ? null: ( ( eapImsiNo.length(  ) <= eapImsiNoSize ) ? eapImsiNo : eapImsiNo.substring( 0, eapImsiNoSize )),	
						( eapMsisdnNo == null ) ? null: ( ( eapMsisdnNo.length(  ) <= eapMsisdnNoSize ) ? eapMsisdnNo : eapMsisdnNo.substring( 0, eapMsisdnNoSize )),	
						( eapInvoiceNo == null ) ? null: ( ( eapInvoiceNo.length(  ) <= eapInvoiceNoSize ) ? eapInvoiceNo : eapInvoiceNo.substring( 0, eapInvoiceNoSize )),	
						( eapReferenceNo == null ) ? null: ( ( eapReferenceNo.length(  ) <= eapReferenceNoSize ) ? eapReferenceNo : eapReferenceNo.substring( 0, eapReferenceNoSize )),	
						( eapSubsystem == null ) ? null: ( ( eapSubsystem.length(  ) <= eapSubsystemSize ) ? eapSubsystem : eapSubsystem.substring( 0, eapSubsystemSize )),	
						( eapRelation == null ) ? null: ( ( eapRelation.length(  ) <= eapRelationSize ) ? eapRelation : eapRelation.substring( 0, eapRelationSize )),	
						( eapTrigger == null ) ? null: ( ( eapTrigger.length(  ) <= eapTriggerSize ) ? eapTrigger : eapTrigger.substring( 0, eapTriggerSize )),	
						( eapActionType == null ) ? null: ( ( eapActionType.length(  ) <= eapActionTypeSize ) ? eapActionType : eapActionType.substring( 0, eapActionTypeSize )),	
						eapActionSeq,
						( eapDocType == null ) ? null: ( ( eapDocType.length(  ) <= eapDocTypeSize ) ? eapDocType : eapDocType.substring( 0, eapDocTypeSize )),	
						( eapServiceCode == null ) ? null: ( ( eapServiceCode.length(  ) <= eapServiceCodeSize ) ? eapServiceCode : eapServiceCode.substring( 0, eapServiceCodeSize )),	
						( eapReasonCode == null ) ? null: ( ( eapReasonCode.length(  ) <= eapReasonCodeSize ) ? eapReasonCode : eapReasonCode.substring( 0, eapReasonCodeSize )),	
						( eapTableName == null ) ? null: ( ( eapTableName.length(  ) <= eapTableNameSize ) ? eapTableName : eapTableName.substring( 0, eapTableNameSize )),	
						( eapColumnName == null ) ? null: ( ( eapColumnName.length(  ) <= eapColumnNameSize ) ? eapColumnName : eapColumnName.substring( 0, eapColumnNameSize )),	
						( eapNewValue == null ) ? null: ( ( eapNewValue.length(  ) <= eapNewValueSize ) ? eapNewValue : eapNewValue.substring( 0, eapNewValueSize )),	
						( eapWhereColumn == null ) ? null: ( ( eapWhereColumn.length(  ) <= eapWhereColumnSize ) ? eapWhereColumn : eapWhereColumn.substring( 0, eapWhereColumnSize )),	
						( eapWhereType == null ) ? null: ( ( eapWhereType.length(  ) <= eapWhereTypeSize ) ? eapWhereType : eapWhereType.substring( 0, eapWhereTypeSize )),	
						( eapChargeCode == null ) ? null: ( ( eapChargeCode.length(  ) <= eapChargeCodeSize ) ? eapChargeCode : eapChargeCode.substring( 0, eapChargeCodeSize )),	
						( eapVoiceMess == null ) ? null: ( ( eapVoiceMess.length(  ) <= eapVoiceMessSize ) ? eapVoiceMess : eapVoiceMess.substring( 0, eapVoiceMessSize )),	
						eapAmnActionId,
						( eapAmnTargType == null ) ? null: ( ( eapAmnTargType.length(  ) <= eapAmnTargTypeSize ) ? eapAmnTargType : eapAmnTargType.substring( 0, eapAmnTargTypeSize )),	
						eapAmnTargGrp,
						( eapAmnTargUser == null ) ? null: ( ( eapAmnTargUser.length(  ) <= eapAmnTargUserSize ) ? eapAmnTargUser : eapAmnTargUser.substring( 0, eapAmnTargUserSize )),	
						eapAmnDeadline,
						( eapAmnStatus == null ) ? null: ( ( eapAmnStatus.length(  ) <= eapAmnStatusSize ) ? eapAmnStatus : eapAmnStatus.substring( 0, eapAmnStatusSize )),	
						( eapAmnSource == null ) ? null: ( ( eapAmnSource.length(  ) <= eapAmnSourceSize ) ? eapAmnSource : eapAmnSource.substring( 0, eapAmnSourceSize )),	
						( eapAmnOpenedBy == null ) ? null: ( ( eapAmnOpenedBy.length(  ) <= eapAmnOpenedBySize ) ? eapAmnOpenedBy : eapAmnOpenedBy.substring( 0, eapAmnOpenedBySize )),	
						eapUdaActionId,
						( eapStatus == null ) ? null: ( ( eapStatus.length(  ) <= eapStatusSize ) ? eapStatus : eapStatus.substring( 0, eapStatusSize )),	
						eapRetryRemain,
						eapLastRetry,
						( eapErrorText == null ) ? null: ( ( eapErrorText.length(  ) <= eapErrorTextSize ) ? eapErrorText : eapErrorText.substring( 0, eapErrorTextSize )),	
						eapSubmitted,
						eapActioned,	
		};
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	  private static final int[] fieldTypes = new int[] {
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_DATETIME,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_DATETIME,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_DATETIME,
		  FIELD_TYPE_DATETIME
	    };

	protected int[] fieldTypes() {
		return fieldTypes;
	}
	
	private static final int[] fieldSizes = new int[] {
		eapBbillAcNoSize,
		0,
		eapSimNoSize,
		eapImsiNoSize,
		eapMsisdnNoSize,
		eapInvoiceNoSize,
		eapReferenceNoSize,
		eapSubsystemSize,
		eapRelationSize,
		eapTriggerSize,
		eapActionTypeSize,
		0,
		eapDocTypeSize,
		eapServiceCodeSize,
		eapReasonCodeSize,
		eapTableNameSize,
		eapColumnNameSize,
		eapNewValueSize,
		eapWhereColumnSize,
		eapWhereTypeSize,
		eapChargeCodeSize,
		eapVoiceMessSize,
		0,
		eapAmnTargTypeSize,
		0,
		eapAmnTargUserSize,
		0,
		eapAmnStatusSize,
		eapAmnSourceSize,
		eapAmnOpenedBySize,
		0,
		eapStatusSize,
		0,
		0,
		eapErrorTextSize,
		0,
		0
	};
	
	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs( 2 ).arg((this.eapSubsystem == null) ? null : this.eapSubsystem.trim()).arg(this.eapActionSeq);
	}

	protected void set(Object[] fields) {
		eapBbillAcNo = rtrim( (String) fields[0] );
		eapSubscriberId = (Integer) fields[1];
		eapSimNo = rtrim( (String) fields[2] );
		eapImsiNo = rtrim( (String) fields[3] );
		eapMsisdnNo = rtrim( (String) fields[4] );
		eapInvoiceNo = rtrim( (String) fields[5] );
		eapReferenceNo = rtrim( (String) fields[6] );
		eapSubsystem = rtrim( (String) fields[7] );
		eapRelation = rtrim( (String) fields[8] );
		eapTrigger = rtrim( (String) fields[9] );
		eapActionType = rtrim( (String) fields[10] );
		eapActionSeq = (Integer) fields[11];
		eapDocType = rtrim( (String) fields[12] );
		eapServiceCode = rtrim( (String) fields[13] );
		eapReasonCode = rtrim( (String) fields[14] );
		eapTableName = rtrim( (String) fields[15] );
		eapColumnName = rtrim( (String) fields[16] );
		eapNewValue = rtrim( (String) fields[17] );
		eapWhereColumn = rtrim( (String) fields[18] );
		eapWhereType = rtrim( (String) fields[19] );
		eapChargeCode = rtrim( (String) fields[20] );
		eapVoiceMess = rtrim( (String) fields[21] );
		eapAmnActionId = (Integer) fields[22];
		eapAmnTargType = rtrim( (String) fields[23] );
		eapAmnTargGrp = (Integer) fields[24];
		eapAmnTargUser = rtrim( (String) fields[25] );
		eapAmnDeadline = (DateTime) fields[26];
		eapAmnStatus = rtrim( (String) fields[27] );
		eapAmnSource = rtrim( (String) fields[28] );
		eapAmnOpenedBy = rtrim( (String) fields[29] );
		eapUdaActionId = (Integer) fields[30];
		eapStatus = rtrim( (String) fields[31] );
		eapRetryRemain = (Integer) fields[32];
		eapLastRetry = (DateTime) fields[33];
		eapErrorText = rtrim( (String) fields[34] );
		eapSubmitted = (DateTime) fields[35];
		eapActioned = (DateTime) fields[36];
	}
	public String getEapBbillAcNo() {
		return eapBbillAcNo;
	}

	public void setEapBbillAcNo(String eapBbillAcNo) {
		this.eapBbillAcNo = getPadded(eapBbillAcNo, eapBbillAcNoFilter);
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
		this.eapSimNo = getPadded(eapSimNo, eapSimNoFilter);
	}

	public String getEapImsiNo() {
		return eapImsiNo;
	}

	public void setEapImsiNo(String eapImsiNo) {
		this.eapImsiNo = getPadded(eapImsiNo, eapImsiNoFilter);
	}

	public String getEapMsisdnNo() {
		return eapMsisdnNo;
	}

	public void setEapMsisdnNo(String eapMsisdnNo) {
		this.eapMsisdnNo = getPadded(eapMsisdnNo, eapMsisdnNoFilter);
	}

	public String getEapInvoiceNo() {
		return eapInvoiceNo;
	}

	public void setEapInvoiceNo(String eapInvoiceNo) {
		this.eapInvoiceNo = getPadded(eapInvoiceNo, eapInvoiceNoFilter);
	}

	public String getEapReferenceNo() {
		return eapReferenceNo;
	}

	public void setEapReferenceNo(String eapReferenceNo) {
		this.eapReferenceNo = getPadded(eapReferenceNo, eapReferenceNoFilter);
	}

	public String getEapSubsystem() {
		return eapSubsystem;
	}

	public void setEapSubsystem(String eapSubsystem) {
		this.eapSubsystem = getPadded(eapSubsystem, eapSubsystemFilter);
	}

	public String getEapRelation() {
		return eapRelation;
	}

	public void setEapRelation(String eapRelation) {
		this.eapRelation = getPadded(eapRelation, eapRelationFilter);
	}

	public String getEapTrigger() {
		return eapTrigger;
	}

	public void setEapTrigger(String eapTrigger) {
		this.eapTrigger = getPadded(eapTrigger, eapTriggerFilter);
	}

	public String getEapActionType() {
		return eapActionType;
	}

	public void setEapActionType(String eapActionType) {
		this.eapActionType = getPadded(eapActionType, eapActionedFilter);
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
		this.eapDocType = getPadded(eapDocType, eapDocTypeFilter);
	}

	public String getEapServiceCode() {
		return eapServiceCode;
	}

	public void setEapServiceCode(String eapServiceCode) {
		this.eapServiceCode = getPadded(eapServiceCode, eapServiceCodeFilter);
	}

	public String getEapReasonCode() {
		return eapReasonCode;
	}

	public void setEapReasonCode(String eapReasonCode) {
		this.eapReasonCode = getPadded(eapReasonCode, eapReasonCodeFilter);
	}

	public String getEapTableName() {
		return eapTableName;
	}

	public void setEapTableName(String eapTableName) {
		this.eapTableName = getPadded(eapTableName, eapTableNameFilter);
	}

	public String getEapColumnName() {
		return eapColumnName;
	}

	public void setEapColumnName(String eapColumnName) {
		this.eapColumnName = getPadded(eapColumnName, eapColumnNameFilter);
	}

	public String getEapNewValue() {
		return eapNewValue;
	}

	public void setEapNewValue(String eapNewValue) {
		this.eapNewValue = getPadded(eapNewValue, eapNewValueFilter);
	}

	public String getEapWhereColumn() {
		return eapWhereColumn;
	}

	public void setEapWhereColumn(String eapWhereColumn) {
		this.eapWhereColumn = getPadded(eapWhereColumn, eapWhereColumnFilter);
	}

	public String getEapWhereType() {
		return eapWhereType;
	}

	public void setEapWhereType(String eapWhereType) {
		this.eapWhereType = getPadded(eapWhereType, eapWhereTypeFilter);
	}

	public String getEapChargeCode() {
		return eapChargeCode;
	}

	public void setEapChargeCode(String eapChargeCode) {
		this.eapChargeCode = getPadded(eapChargeCode, eapChargeCodeFilter);
	}

	public String getEapVoiceMess() {
		return eapVoiceMess;
	}

	public void setEapVoiceMess(String eapVoiceMess) {
		this.eapVoiceMess = getPadded(eapVoiceMess, eapVoiceMessFilter);
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
		this.eapAmnTargType = getPadded(eapAmnTargType, eapAmnTargTypeFilter);
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
		this.eapAmnTargUser = getPadded(eapAmnTargUser, eapAmnTargUserFilter);
	}

	public DateTime getEapAmnDeadline() {
		return eapAmnDeadline;
	}

	public void setEapAmnDeadline(DateTime eapAmnDeadline) {
		this.eapAmnDeadline = eapAmnDeadline;
	}

	public String getEapAmnStatus() {
		return eapAmnStatus;
	}

	public void setEapAmnStatus(String eapAmnStatus) {
		this.eapAmnStatus = getPadded(eapAmnStatus, eapAmnStatusFilter);
	}

	public String getEapAmnSource() {
		return eapAmnSource;
	}

	public void setEapAmnSource(String eapAmnSource) {
		this.eapAmnSource = getPadded(eapAmnSource, eapAmnSourceFilter);
	}

	public String getEapAmnOpenedBy() {
		return eapAmnOpenedBy;
	}

	public void setEapAmnOpenedBy(String eapAmnOpenedBy) {
		this.eapAmnOpenedBy = getPadded(eapAmnOpenedBy, eapAmnOpenedByFilter);
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
		this.eapStatus = getPadded(eapStatus, eapStatusFilter);
	}

	public Integer getEapRetryRemain() {
		return eapRetryRemain;
	}

	public void setEapRetryRemain(Integer eapRetryRemain) {
		this.eapRetryRemain = eapRetryRemain;
	}

	public DateTime getEapLastRetry() {
		return eapLastRetry;
	}

	public void setEapLastRetry(DateTime eapLastRetry) {
		this.eapLastRetry = eapLastRetry;
	}

	public String getEapErrorText() {
		return eapErrorText;
	}

	public void setEapErrorText(String eapErrorText) {
		this.eapErrorText = getPadded(eapErrorText, eapErrorTextFilter);
	}

	public DateTime getEapSubmitted() {
		return eapSubmitted;
	}

	public void setEapSubmitted(DateTime eapSubmitted) {
		this.eapSubmitted = eapSubmitted;
	}

	public DateTime getEapActioned() {
		return eapActioned;
	}

	public void setEapActioned(DateTime eapActioned) {
		this.eapActioned = eapActioned;
	}
}
