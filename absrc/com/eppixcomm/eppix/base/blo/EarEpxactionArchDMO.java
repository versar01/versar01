package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;



public class EarEpxactionArchDMO extends DBO
implements Serializable {

	private String earBbillAcNo;
	private Integer earSubscriberId;
	private String earSimNo;
	private String earImsiNo;
	private String earMsisdnNo;
	private String earInvoiceNo;
	private String earReferenceNo;
	private String earSubsystem;
	private String earRelation;
	private String earTrigger;
	private String earActionType;
	private Integer earActionSeq;
	private String earDocType;
	private String earServiceCode;
	private String earReasonCode;
	private String earTableName;
	private String earColumnName;
	private String earNewValue;
	private String earWhereColumn;
	private String earWhereType;
	private String earChargeCode;
	private String earVoiceMess;
	private Integer earAmnActionId;
	private String earAmnTargType;
	private Integer earAmnTargGrp;
	private String earAmnTargUser;
	private DateTime earAmnDeadline;
	private String earAmnStatus;
	private String earAmnSource;
	private String earAmnOpenedBy;
	private Integer earUdaActionId;
	private String earStatus;
	private Integer earRetryRemain;
	private DateTime earLastRetry;
	private String earErrorText;
	private DateTime earSubmitted;
	private DateTime earActioned;
	
	public static final int earBbillAcNoFilter = 0;
	private static final int earBbillAcNoSize = 8;

	public static final int earSubscriberIdFilter = 1;

	public static final int earSimNoFilter = 2;
	private static final int earSimNoSize = 14;

	public static final int earImsiNoFilter = 3;
	private static final int earImsiNoSize = 15;

	public static final int earMsisdnNoFilter = 4;
	private static final int earMsisdnNoSize = 15;

	public static final int earInvoiceNoFilter = 5;
	private static final int earInvoiceNoSize = 10;

	public static final int earReferenceNoFilter = 6;
	private static final int earReferenceNoSize = 10;

	public static final int earSubsystemFilter = 7;
	private static final int earSubsystemSize = 5;

	public static final int earRelationFilter = 8;
	private static final int earRelationSize = 10;

	public static final int earTriggerFilter = 9;
	private static final int earTriggerSize = 5;

	public static final int earActionTypeFilter = 10;
	private static final int earActionTypeSize = 3;

	public static final int earActionSeqFilter = 11;

	public static final int earDocTypeFilter = 12;
	private static final int earDocTypeSize = 10;

	public static final int earServiceCodeFilter = 13;
	private static final int earServiceCodeSize = 4;

	public static final int earReasonCodeFilter = 14;
	private static final int earReasonCodeSize = 4;

	public static final int earTableNameFilter = 15;
	private static final int earTableNameSize = 18;

	public static final int earColumnNameFilter = 16;
	private static final int earColumnNameSize = 18;

	public static final int earNewValueFilter = 17;
	private static final int earNewValueSize = 50;

	public static final int earWhereColumnFilter = 18;
	private static final int earWhereColumnSize = 18;

	public static final int earWhereTypeFilter = 19;
	private static final int earWhereTypeSize = 2;

	public static final int earChargeCodeFilter = 20;
	private static final int earChargeCodeSize = 5;

	public static final int earVoiceMessFilter = 21;
	private static final int earVoiceMessSize = 10;

	public static final int earAmnActionIdFilter = 22;

	public static final int earAmnTargTypeFilter = 23;
	private static final int earAmnTargTypeSize = 1;

	public static final int earAmnTargGrpFilter = 24;

	public static final int earAmnTargUserFilter = 25;
	private static final int earAmnTargUserSize = 20;

	public static final int earAmnDeadlineFilter = 26;

	public static final int earAmnStatusFilter = 27;
	private static final int earAmnStatusSize = 1;

	public static final int earAmnSourceFilter = 28;
	private static final int earAmnSourceSize = 1;

	public static final int earAmnOpenedByFilter = 29;
	private static final int earAmnOpenedBySize = 20;

	public static final int earUdaActionIdFilter = 30;

	public static final int earStatusFilter = 31;
	private static final int earStatusSize = 1;

	public static final int earRetryRemainFilter = 32;

	public static final int earLastRetryFilter = 33;

	public static final int earErrorTextFilter = 34;
	private static final int earErrorTextSize = 192;

	public static final int earSubmittedFilter = 35;

	public static final int earActionedFilter = 36;
	
	public EarEpxactionArchDMO(
			final String earBbillAcNo,
			final Integer earSubscriberId,
			final String earSimNo,
			final String earImsiNo,
			final String earMsisdnNo,
			final String earInvoiceNo,
			final String earReferenceNo,
			final String earSubsystem,
			final String earRelation,
			final String earTrigger,
			final String earActionType,
			final Integer earActionSeq,
			final String earDocType,
			final String earServiceCode,
			final String earReasonCode,
			final String earTableName,
			final String earColumnName,
			final String earNewValue,
			final String earWhereColumn,
			final String earWhereType,
			final String earChargeCode,
			final String earVoiceMess,
			final Integer earAmnActionId,
			final String earAmnTargType,
			final Integer earAmnTargGrp,
			final String earAmnTargUser,
			final DateTime earAmnDeadline,
			final String earAmnStatus,
			final String earAmnSource,
			final String earAmnOpenedBy,
			final Integer earUdaActionId,
			final String earStatus,
			final Integer earRetryRemain,
			final DateTime earLastRetry,
			final String earErrorText,
			final DateTime earSubmitted,
			final DateTime earActioned
			){
			this.earBbillAcNo = earBbillAcNo;
			this.earSubscriberId = earSubscriberId;
			this.earSimNo = earSimNo;
			this.earImsiNo = earImsiNo;
			this.earMsisdnNo = earMsisdnNo;
			this.earInvoiceNo = earInvoiceNo;
			this.earReferenceNo = earReferenceNo;
			this.earSubsystem = earSubsystem;
			this.earRelation = earRelation;
			this.earTrigger = earTrigger;
			this.earActionType = earActionType;
			this.earActionSeq = earActionSeq;
			this.earDocType = earDocType;
			this.earServiceCode = earServiceCode;
			this.earReasonCode = earReasonCode;
			this.earTableName = earTableName;
			this.earColumnName = earColumnName;
			this.earNewValue = earNewValue;
			this.earWhereColumn = earWhereColumn;
			this.earWhereType = earWhereType;
			this.earChargeCode = earChargeCode;
			this.earVoiceMess = earVoiceMess;
			this.earAmnActionId = earAmnActionId;
			this.earAmnTargType = earAmnTargType;
			this.earAmnTargGrp = earAmnTargGrp;
			this.earAmnTargUser = earAmnTargUser;
			this.earAmnDeadline = earAmnDeadline;
			this.earAmnStatus = earAmnStatus;
			this.earAmnSource = earAmnSource;
			this.earAmnOpenedBy = earAmnOpenedBy;
			this.earUdaActionId = earUdaActionId;
			this.earStatus = earStatus;
			this.earRetryRemain = earRetryRemain;
			this.earLastRetry = earLastRetry;
			this.earErrorText = earErrorText;
			this.earSubmitted = earSubmitted;
			this.earActioned = earActioned;
			}

	

		public EarEpxactionArchDMO(){
		}	
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
				(earBbillAcNo == null ) ? null: ( ( earBbillAcNo.length(  ) <= earBbillAcNoSize ) ? earBbillAcNo : earBbillAcNo.substring( 0, earBbillAcNoSize )),	
						earSubscriberId,
						( earSimNo == null ) ? null: ( ( earSimNo.length(  ) <= earSimNoSize ) ? earSimNo : earSimNo.substring( 0, earSimNoSize )),	
						( earImsiNo == null ) ? null: ( ( earImsiNo.length(  ) <= earImsiNoSize ) ? earImsiNo : earImsiNo.substring( 0, earImsiNoSize )),	
						( earMsisdnNo == null ) ? null: ( ( earMsisdnNo.length(  ) <= earMsisdnNoSize ) ? earMsisdnNo : earMsisdnNo.substring( 0, earMsisdnNoSize )),	
						( earInvoiceNo == null ) ? null: ( ( earInvoiceNo.length(  ) <= earInvoiceNoSize ) ? earInvoiceNo : earInvoiceNo.substring( 0, earInvoiceNoSize )),	
						( earReferenceNo == null ) ? null: ( ( earReferenceNo.length(  ) <= earReferenceNoSize ) ? earReferenceNo : earReferenceNo.substring( 0, earReferenceNoSize )),	
						( earSubsystem == null ) ? null: ( ( earSubsystem.length(  ) <= earSubsystemSize ) ? earSubsystem : earSubsystem.substring( 0, earSubsystemSize )),	
						( earRelation == null ) ? null: ( ( earRelation.length(  ) <= earRelationSize ) ? earRelation : earRelation.substring( 0, earRelationSize )),	
						( earTrigger == null ) ? null: ( ( earTrigger.length(  ) <= earTriggerSize ) ? earTrigger : earTrigger.substring( 0, earTriggerSize )),	
						( earActionType == null ) ? null: ( ( earActionType.length(  ) <= earActionTypeSize ) ? earActionType : earActionType.substring( 0, earActionTypeSize )),	
						earActionSeq,
						( earDocType == null ) ? null: ( ( earDocType.length(  ) <= earDocTypeSize ) ? earDocType : earDocType.substring( 0, earDocTypeSize )),	
						( earServiceCode == null ) ? null: ( ( earServiceCode.length(  ) <= earServiceCodeSize ) ? earServiceCode : earServiceCode.substring( 0, earServiceCodeSize )),	
						( earReasonCode == null ) ? null: ( ( earReasonCode.length(  ) <= earReasonCodeSize ) ? earReasonCode : earReasonCode.substring( 0, earReasonCodeSize )),	
						( earTableName == null ) ? null: ( ( earTableName.length(  ) <= earTableNameSize ) ? earTableName : earTableName.substring( 0, earTableNameSize )),	
						( earColumnName == null ) ? null: ( ( earColumnName.length(  ) <= earColumnNameSize ) ? earColumnName : earColumnName.substring( 0, earColumnNameSize )),	
						( earNewValue == null ) ? null: ( ( earNewValue.length(  ) <= earNewValueSize ) ? earNewValue : earNewValue.substring( 0, earNewValueSize )),	
						( earWhereColumn == null ) ? null: ( ( earWhereColumn.length(  ) <= earWhereColumnSize ) ? earWhereColumn : earWhereColumn.substring( 0, earWhereColumnSize )),	
						( earWhereType == null ) ? null: ( ( earWhereType.length(  ) <= earWhereTypeSize ) ? earWhereType : earWhereType.substring( 0, earWhereTypeSize )),	
						( earChargeCode == null ) ? null: ( ( earChargeCode.length(  ) <= earChargeCodeSize ) ? earChargeCode : earChargeCode.substring( 0, earChargeCodeSize )),	
						( earVoiceMess == null ) ? null: ( ( earVoiceMess.length(  ) <= earVoiceMessSize ) ? earVoiceMess : earVoiceMess.substring( 0, earVoiceMessSize )),	
						earAmnActionId,
						( earAmnTargType == null ) ? null: ( ( earAmnTargType.length(  ) <= earAmnTargTypeSize ) ? earAmnTargType : earAmnTargType.substring( 0, earAmnTargTypeSize )),	
						earAmnTargGrp,
						( earAmnTargUser == null ) ? null: ( ( earAmnTargUser.length(  ) <= earAmnTargUserSize ) ? earAmnTargUser : earAmnTargUser.substring( 0, earAmnTargUserSize )),	
						earAmnDeadline,
						( earAmnStatus == null ) ? null: ( ( earAmnStatus.length(  ) <= earAmnStatusSize ) ? earAmnStatus : earAmnStatus.substring( 0, earAmnStatusSize )),	
						( earAmnSource == null ) ? null: ( ( earAmnSource.length(  ) <= earAmnSourceSize ) ? earAmnSource : earAmnSource.substring( 0, earAmnSourceSize )),	
						( earAmnOpenedBy == null ) ? null: ( ( earAmnOpenedBy.length(  ) <= earAmnOpenedBySize ) ? earAmnOpenedBy : earAmnOpenedBy.substring( 0, earAmnOpenedBySize )),	
						earUdaActionId,
						( earStatus == null ) ? null: ( ( earStatus.length(  ) <= earStatusSize ) ? earStatus : earStatus.substring( 0, earStatusSize )),	
						earRetryRemain,
						earLastRetry,
						( earErrorText == null ) ? null: ( ( earErrorText.length(  ) <= earErrorTextSize ) ? earErrorText : earErrorText.substring( 0, earErrorTextSize )),	
						earSubmitted,
						earActioned,	
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
		earBbillAcNoSize,
		0,
		earSimNoSize,
		earImsiNoSize,
		earMsisdnNoSize,
		earInvoiceNoSize,
		earReferenceNoSize,
		earSubsystemSize,
		earRelationSize,
		earTriggerSize,
		earActionTypeSize,
		0,
		earDocTypeSize,
		earServiceCodeSize,
		earReasonCodeSize,
		earTableNameSize,
		earColumnNameSize,
		earNewValueSize,
		earWhereColumnSize,
		earWhereTypeSize,
		earChargeCodeSize,
		earVoiceMessSize,
		0,
		earAmnTargTypeSize,
		0,
		earAmnTargUserSize,
		0,
		earAmnStatusSize,
		earAmnSourceSize,
		earAmnOpenedBySize,
		0,
		earStatusSize,
		0,
		0,
		earErrorTextSize,
		0,
		0
	};
	
	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected DAOArgs primaryKey() {
		return null; // new DAOArgs( 2 ).arg((this.earSubsystem == null) ? null : this.earSubsystem.trim()).arg(this.earActionSeq);
	}

	protected void set(Object[] fields) {
		earBbillAcNo = rtrim( (String) fields[0] );
		earSubscriberId = (Integer) fields[1];
		earSimNo = rtrim( (String) fields[2] );
		earImsiNo = rtrim( (String) fields[3] );
		earMsisdnNo = rtrim( (String) fields[4] );
		earInvoiceNo = rtrim( (String) fields[5] );
		earReferenceNo = rtrim( (String) fields[6] );
		earSubsystem = rtrim( (String) fields[7] );
		earRelation = rtrim( (String) fields[8] );
		earTrigger = rtrim( (String) fields[9] );
		earActionType = rtrim( (String) fields[10] );
		earActionSeq = (Integer) fields[11];
		earDocType = rtrim( (String) fields[12] );
		earServiceCode = rtrim( (String) fields[13] );
		earReasonCode = rtrim( (String) fields[14] );
		earTableName = rtrim( (String) fields[15] );
		earColumnName = rtrim( (String) fields[16] );
		earNewValue = rtrim( (String) fields[17] );
		earWhereColumn = rtrim( (String) fields[18] );
		earWhereType = rtrim( (String) fields[19] );
		earChargeCode = rtrim( (String) fields[20] );
		earVoiceMess = rtrim( (String) fields[21] );
		earAmnActionId = (Integer) fields[22];
		earAmnTargType = rtrim( (String) fields[23] );
		earAmnTargGrp = (Integer) fields[24];
		earAmnTargUser = rtrim( (String) fields[25] );
		earAmnDeadline = (DateTime) fields[26];
		earAmnStatus = rtrim( (String) fields[27] );
		earAmnSource = rtrim( (String) fields[28] );
		earAmnOpenedBy = rtrim( (String) fields[29] );
		earUdaActionId = (Integer) fields[30];
		earStatus = rtrim( (String) fields[31] );
		earRetryRemain = (Integer) fields[32];
		earLastRetry = (DateTime) fields[33];
		earErrorText = rtrim( (String) fields[34] );
		earSubmitted = (DateTime) fields[35];
		earActioned = (DateTime) fields[36];
	}
	public String getEarBbillAcNo() {
		return earBbillAcNo;
	}

	public void setEarBbillAcNo(String earBbillAcNo) {
		this.earBbillAcNo = getPadded(earBbillAcNo, earBbillAcNoFilter);
	}

	public Integer getEarSubscriberId() {
		return earSubscriberId;
	}

	public void setEarSubscriberId(Integer earSubscriberId) {
		this.earSubscriberId = earSubscriberId;
	}

	public String getEarSimNo() {
		return earSimNo;
	}

	public void setEarSimNo(String earSimNo) {
		this.earSimNo = getPadded(earSimNo, earSimNoFilter);
	}

	public String getEarImsiNo() {
		return earImsiNo;
	}

	public void setEarImsiNo(String earImsiNo) {
		this.earImsiNo = getPadded(earImsiNo, earImsiNoFilter);
	}

	public String getEarMsisdnNo() {
		return earMsisdnNo;
	}

	public void setEarMsisdnNo(String earMsisdnNo) {
		this.earMsisdnNo = getPadded(earMsisdnNo, earMsisdnNoFilter);
	}

	public String getEarInvoiceNo() {
		return earInvoiceNo;
	}

	public void setEarInvoiceNo(String earInvoiceNo) {
		this.earInvoiceNo = getPadded(earInvoiceNo, earInvoiceNoFilter);
	}

	public String getEarReferenceNo() {
		return earReferenceNo;
	}

	public void setEarReferenceNo(String earReferenceNo) {
		this.earReferenceNo = getPadded(earReferenceNo, earReferenceNoFilter);
	}

	public String getEarSubsystem() {
		return earSubsystem;
	}

	public void setEarSubsystem(String earSubsystem) {
		this.earSubsystem = getPadded(earSubsystem, earSubsystemFilter);
	}

	public String getEarRelation() {
		return earRelation;
	}

	public void setEarRelation(String earRelation) {
		this.earRelation = getPadded(earRelation, earRelationFilter);
	}

	public String getEarTrigger() {
		return earTrigger;
	}

	public void setEarTrigger(String earTrigger) {
		this.earTrigger = getPadded(earTrigger, earTriggerFilter);
	}

	public String getEarActionType() {
		return earActionType;
	}

	public void setEarActionType(String earActionType) {
		this.earActionType = getPadded(earActionType, earActionedFilter);
	}

	public Integer getEarActionSeq() {
		return earActionSeq;
	}

	public void setEarActionSeq(Integer earActionSeq) {
		this.earActionSeq = earActionSeq;
	}

	public String getEarDocType() {
		return earDocType;
	}

	public void setEarDocType(String earDocType) {
		this.earDocType = getPadded(earDocType, earDocTypeFilter);
	}

	public String getEarServiceCode() {
		return earServiceCode;
	}

	public void setEarServiceCode(String earServiceCode) {
		this.earServiceCode = getPadded(earServiceCode, earServiceCodeFilter);
	}

	public String getEarReasonCode() {
		return earReasonCode;
	}

	public void setEarReasonCode(String earReasonCode) {
		this.earReasonCode = getPadded(earReasonCode, earReasonCodeFilter);
	}

	public String getEarTableName() {
		return earTableName;
	}

	public void setEarTableName(String earTableName) {
		this.earTableName = getPadded(earTableName, earTableNameFilter);
	}

	public String getEarColumnName() {
		return earColumnName;
	}

	public void setEarColumnName(String earColumnName) {
		this.earColumnName = getPadded(earColumnName, earColumnNameFilter);
	}

	public String getEarNewValue() {
		return earNewValue;
	}

	public void setEarNewValue(String earNewValue) {
		this.earNewValue = getPadded(earNewValue, earNewValueFilter);
	}

	public String getEarWhereColumn() {
		return earWhereColumn;
	}

	public void setEarWhereColumn(String earWhereColumn) {
		this.earWhereColumn = getPadded(earWhereColumn, earWhereColumnFilter);
	}

	public String getEarWhereType() {
		return earWhereType;
	}

	public void setEarWhereType(String earWhereType) {
		this.earWhereType = getPadded(earWhereType, earWhereTypeFilter);
	}

	public String getEarChargeCode() {
		return earChargeCode;
	}

	public void setEarChargeCode(String earChargeCode) {
		this.earChargeCode = getPadded(earChargeCode, earChargeCodeFilter);
	}

	public String getEarVoiceMess() {
		return earVoiceMess;
	}

	public void setEarVoiceMess(String earVoiceMess) {
		this.earVoiceMess = getPadded(earVoiceMess, earVoiceMessFilter);
	}

	public Integer getEarAmnActionId() {
		return earAmnActionId;
	}

	public void setEarAmnActionId(Integer earAmnActionId) {
		this.earAmnActionId = earAmnActionId;
	}

	public String getEarAmnTargType() {
		return earAmnTargType;
	}

	public void setEarAmnTargType(String earAmnTargType) {
		this.earAmnTargType = getPadded(earAmnTargType, earAmnTargTypeFilter);
	}

	public Integer getEarAmnTargGrp() {
		return earAmnTargGrp;
	}

	public void setEarAmnTargGrp(Integer earAmnTargGrp) {
		this.earAmnTargGrp = earAmnTargGrp;
	}

	public String getEarAmnTargUser() {
		return earAmnTargUser;
	}

	public void setEarAmnTargUser(String earAmnTargUser) {
		this.earAmnTargUser = getPadded(earAmnTargUser, earAmnTargUserFilter);
	}

	public DateTime getEarAmnDeadline() {
		return earAmnDeadline;
	}

	public void setEarAmnDeadline(DateTime earAmnDeadline) {
		this.earAmnDeadline = earAmnDeadline;
	}

	public String getEarAmnStatus() {
		return earAmnStatus;
	}

	public void setEarAmnStatus(String earAmnStatus) {
		this.earAmnStatus = getPadded(earAmnStatus, earAmnStatusFilter);
	}

	public String getEarAmnSource() {
		return earAmnSource;
	}

	public void setEarAmnSource(String earAmnSource) {
		this.earAmnSource = getPadded(earAmnSource, earAmnSourceFilter);
	}

	public String getEarAmnOpenedBy() {
		return earAmnOpenedBy;
	}

	public void setEarAmnOpenedBy(String earAmnOpenedBy) {
		this.earAmnOpenedBy = getPadded(earAmnOpenedBy, earAmnOpenedByFilter);
	}

	public Integer getEarUdaActionId() {
		return earUdaActionId;
	}

	public void setEarUdaActionId(Integer earUdaActionId) {
		this.earUdaActionId = earUdaActionId;
	}

	public String getEarStatus() {
		return earStatus;
	}

	public void setEarStatus(String earStatus) {
		this.earStatus = getPadded(earStatus, earStatusFilter);
	}

	public Integer getEarRetryRemain() {
		return earRetryRemain;
	}

	public void setEarRetryRemain(Integer earRetryRemain) {
		this.earRetryRemain = earRetryRemain;
	}

	public DateTime getEarLastRetry() {
		return earLastRetry;
	}

	public void setEarLastRetry(DateTime earLastRetry) {
		this.earLastRetry = earLastRetry;
	}

	public String getEarErrorText() {
		return earErrorText;
	}

	public void setEarErrorText(String earErrorText) {
		this.earErrorText = getPadded(earErrorText, earErrorTextFilter);
	}

	public DateTime getEarSubmitted() {
		return earSubmitted;
	}

	public void setEarSubmitted(DateTime earSubmitted) {
		this.earSubmitted = earSubmitted;
	}

	public DateTime getEarActioned() {
		return earActioned;
	}

	public void setEarActioned(DateTime earActioned) {
		this.earActioned = earActioned;
	}
}
