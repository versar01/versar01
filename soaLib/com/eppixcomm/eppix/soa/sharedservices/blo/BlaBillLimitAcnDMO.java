package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class BlaBillLimitAcnDMO extends DBO implements Serializable {

	private Integer blaSerialId;
	private String blaCustomer;
	private Integer blaSubscriber;
	private Integer blaLinkTrg;
	private String blaActionType;
	private Short blaActionSeq;
	private String blaDocType;
	private String blaServiceCode;
	private String blaReasonCode;
	private String blaTableName;
	private String blaColumnName;
	private String blaNewValue;
	private String blaWhereColumn;
	private String blaWhereType;
	private String blaChargeCode;
	private String blaVoiceMess;
	private Integer blaAmActionId;
	private String blaAmTargetType;
	private Integer blaAmTargetGrp;
	private String blaAmTargetUser;
	private Short blaAmDeadline;
	private String blaAmStatus;
	private Date blaLastUpdate;
	private Integer blaUdaActionId;
	private Double blaThresh;
	private String blaStatus;

	public static final int blaSerialIdFilter = 0;

	public static final int blaCustomerFilter = 1;
	private static final int blaCustomerSize = 8;

	public static final int blaSubscriberFilter = 2;

	public static final int blaLinkTrgFilter = 3;

	public static final int blaActionTypeFilter = 4;
	private static final int blaActionTypeSize = 3;

	public static final int blaActionSeqFilter = 5;

	public static final int blaDocTypeFilter = 6;
	private static final int blaDocTypeSize = 10;

	public static final int blaServiceCodeFilter = 7;
	private static final int blaServiceCodeSize = 5;

	public static final int blaReasonCodeFilter = 8;
	private static final int blaReasonCodeSize = 4;

	public static final int blaTableNameFilter = 9;
	private static final int blaTableNameSize = 18;

	public static final int blaColumnNameFilter = 10;
	private static final int blaColumnNameSize = 18;

	public static final int blaNewValueFilter = 11;
	private static final int blaNewValueSize = 50;

	public static final int blaWhereColumnFilter = 12;
	private static final int blaWhereColumnSize = 18;

	public static final int blaWhereTypeFilter = 13;
	private static final int blaWhereTypeSize = 2;

	public static final int blaChargeCodeFilter = 14;
	private static final int blaChargeCodeSize = 5;

	public static final int blaVoiceMessFilter = 15;
	private static final int blaVoiceMessSize = 10;

	public static final int blaAmActionIdFilter = 16;

	public static final int blaAmTargetTypeFilter = 17;
	private static final int blaAmTargetTypeSize = 1;

	public static final int blaAmTargetGrpFilter = 18;

	public static final int blaAmTargetUserFilter = 19;
	private static final int blaAmTargetUserSize = 20;

	public static final int blaAmDeadlineFilter = 20;

	public static final int blaAmStatusFilter = 21;
	private static final int blaAmStatusSize = 1;

	public static final int blaLastUpdateFilter = 22;

	public static final int blaUdaActionIdFilter = 23;

	public static final int blaThreshFilter = 24;

	public static final int blaStatusFilter = 25;
	private static final int blaStatusSize = 1;

	public BlaBillLimitAcnDMO() {
	};

	public BlaBillLimitAcnDMO(final Integer blaSerialId,
			final String blaCustomer, final Integer blaSubscriber,
			final Integer blaLinkTrg, final String blaActionType,
			final Short blaActionSeq, final String blaDocType,
			final String blaServiceCode, final String blaReasonCode,
			final String blaTableName, final String blaColumnName,
			final String blaNewValue, final String blaWhereColumn,
			final String blaWhereType, final String blaChargeCode,
			final String blaVoiceMess, final Integer blaAmActionId,
			final String blaAmTargetType, final Integer blaAmTargetGrp,
			final String blaAmTargetUser, final Short blaAmDeadline,
			final String blaAmStatus, final Date blaLastUpdate,
			final Integer blaUdaActionId, final Double blaThresh,
			final String blaStatus) {

		this.blaSerialId = blaSerialId;
		this.blaCustomer = blaCustomer;
		this.blaSubscriber = blaSubscriber;
		this.blaLinkTrg = blaLinkTrg;
		this.blaActionType = blaActionType;
		this.blaActionSeq = blaActionSeq;
		this.blaDocType = blaDocType;
		this.blaServiceCode = blaServiceCode;
		this.blaReasonCode = blaReasonCode;
		this.blaTableName = blaTableName;
		this.blaColumnName = blaColumnName;
		this.blaNewValue = blaNewValue;
		this.blaWhereColumn = blaWhereColumn;
		this.blaWhereType = blaWhereType;
		this.blaChargeCode = blaChargeCode;
		this.blaVoiceMess = blaVoiceMess;
		this.blaAmActionId = blaAmActionId;
		this.blaAmTargetType = blaAmTargetType;
		this.blaAmTargetGrp = blaAmTargetGrp;
		this.blaAmTargetUser = blaAmTargetUser;
		this.blaAmDeadline = blaAmDeadline;
		this.blaAmStatus = blaAmStatus;
		this.blaLastUpdate = blaLastUpdate;
		this.blaUdaActionId = blaUdaActionId;
		this.blaThresh = blaThresh;
		this.blaStatus = blaStatus;
	};

	private static final int[] fieldSizes = new int[] { 0,
			blaCustomerSize, 0, 0, blaActionTypeSize, 0, blaDocTypeSize,
			blaServiceCodeSize, blaReasonCodeSize, blaTableNameSize,
			blaColumnNameSize, blaNewValueSize, blaWhereColumnSize,
			blaWhereTypeSize, blaChargeCodeSize, blaVoiceMessSize, 0,
			blaAmTargetTypeSize, 0, blaAmTargetUserSize, 0, blaAmStatusSize, 0,
			0, 0, blaStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.blaSerialId,
				((this.blaCustomer == null) ? null
						: (this.blaCustomer.length() <= blaCustomerSize) ? this.blaCustomer
								: this.blaCustomer.substring(0,
										this.blaCustomerSize)),
				this.blaSubscriber,
				this.blaLinkTrg,
				((this.blaActionType == null) ? null : (this.blaActionType
						.length() <= blaActionTypeSize) ? this.blaActionType
						: this.blaActionType.substring(0,
								this.blaActionTypeSize)),
				this.blaActionSeq,
				((this.blaDocType == null) ? null
						: (this.blaDocType.length() <= blaDocTypeSize) ? this.blaDocType
								: this.blaDocType.substring(0,
										this.blaDocTypeSize)),
				((this.blaServiceCode == null) ? null : (this.blaServiceCode
						.length() <= blaServiceCodeSize) ? this.blaServiceCode
						: this.blaServiceCode.substring(0,
								this.blaServiceCodeSize)),
				((this.blaReasonCode == null) ? null : (this.blaReasonCode
						.length() <= blaReasonCodeSize) ? this.blaReasonCode
						: this.blaReasonCode.substring(0,
								this.blaReasonCodeSize)),
				((this.blaTableName == null) ? null : (this.blaTableName
						.length() <= blaTableNameSize) ? this.blaTableName
						: this.blaTableName.substring(0, this.blaTableNameSize)),
				((this.blaColumnName == null) ? null : (this.blaColumnName
						.length() <= blaColumnNameSize) ? this.blaColumnName
						: this.blaColumnName.substring(0,
								this.blaColumnNameSize)),
				((this.blaNewValue == null) ? null
						: (this.blaNewValue.length() <= blaNewValueSize) ? this.blaNewValue
								: this.blaNewValue.substring(0,
										this.blaNewValueSize)),
				((this.blaWhereColumn == null) ? null : (this.blaWhereColumn
						.length() <= blaWhereColumnSize) ? this.blaWhereColumn
						: this.blaWhereColumn.substring(0,
								this.blaWhereColumnSize)),
				((this.blaWhereType == null) ? null : (this.blaWhereType
						.length() <= blaWhereTypeSize) ? this.blaWhereType
						: this.blaWhereType.substring(0, this.blaWhereTypeSize)),
				((this.blaChargeCode == null) ? null : (this.blaChargeCode
						.length() <= blaChargeCodeSize) ? this.blaChargeCode
						: this.blaChargeCode.substring(0,
								this.blaChargeCodeSize)),
				((this.blaVoiceMess == null) ? null : (this.blaVoiceMess
						.length() <= blaVoiceMessSize) ? this.blaVoiceMess
						: this.blaVoiceMess.substring(0, this.blaVoiceMessSize)),
				this.blaAmActionId,
				((this.blaAmTargetType == null) ? null
						: (this.blaAmTargetType.length() <= blaAmTargetTypeSize) ? this.blaAmTargetType
								: this.blaAmTargetType.substring(0,
										this.blaAmTargetTypeSize)),
				this.blaAmTargetGrp,
				((this.blaAmTargetUser == null) ? null
						: (this.blaAmTargetUser.length() <= blaAmTargetUserSize) ? this.blaAmTargetUser
								: this.blaAmTargetUser.substring(0,
										this.blaAmTargetUserSize)),
				this.blaAmDeadline,
				((this.blaAmStatus == null) ? null
						: (this.blaAmStatus.length() <= blaAmStatusSize) ? this.blaAmStatus
								: this.blaAmStatus.substring(0,
										this.blaAmStatusSize)),
				this.blaLastUpdate,
				this.blaUdaActionId,
				this.blaThresh,
				((this.blaStatus == null) ? null
						: (this.blaStatus.length() <= blaStatusSize) ? this.blaStatus
								: this.blaStatus.substring(0,
										this.blaStatusSize)) };
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
		return new DAOArgs(1).arg(this.blaSerialId);
	}

	protected void set(Object[] fields) {
		this.blaSerialId = (Integer) fields[0];
		this.blaCustomer = rtrim((String) fields[1]);
		this.blaSubscriber = ((Integer) fields[2]);
		this.blaLinkTrg = ((Integer) fields[3]);
		this.blaActionType = rtrim((String) fields[4]);
		this.blaActionSeq = ((Short) fields[5]);
		this.blaDocType = rtrim((String) fields[6]);
		this.blaServiceCode = rtrim((String) fields[7]);
		this.blaReasonCode = rtrim((String) fields[8]);
		this.blaTableName = rtrim((String) fields[9]);
		this.blaColumnName = rtrim((String) fields[10]);
		this.blaNewValue = rtrim((String) fields[11]);
		this.blaWhereColumn = rtrim((String) fields[12]);
		this.blaWhereType = rtrim((String) fields[13]);
		this.blaChargeCode = rtrim((String) fields[14]);
		this.blaVoiceMess = rtrim((String) fields[15]);
		this.blaAmActionId = ((Integer) fields[16]);
		this.blaAmTargetType = rtrim((String) fields[17]);
		this.blaAmTargetGrp = ((Integer) fields[18]);
		this.blaAmTargetUser = rtrim((String) fields[19]);
		this.blaAmDeadline = ((Short) fields[20]);
		this.blaAmStatus = rtrim((String) fields[21]);
		this.blaLastUpdate = ((fields[22] == null) ? null : new Date(
				(Date) fields[22]));
		this.blaUdaActionId = ((Integer) fields[23]);
		this.blaThresh = ((Double) fields[24]);
		this.blaStatus = rtrim((String) fields[25]);
	}

	public void set(final Integer blaSerialId, final String blaCustomer,
			final Integer blaSubscriber, final Integer blaLinkTrg,
			final String blaActionType, final Short blaActionSeq,
			final String blaDocType, final String blaServiceCode,
			final String blaReasonCode, final String blaTableName,
			final String blaColumnName, final String blaNewValue,
			final String blaWhereColumn, final String blaWhereType,
			final String blaChargeCode, final String blaVoiceMess,
			final Integer blaAmActionId, final String blaAmTargetType,
			final Integer blaAmTargetGrp, final String blaAmTargetUser,
			final Short blaAmDeadline, final String blaAmStatus,
			final Date blaLastUpdate, final Integer blaUdaActionId,
			final Double blaThresh, final String blaStatus) {

		this.blaSerialId = blaSerialId;
		this.blaCustomer = blaCustomer;
		this.blaSubscriber = blaSubscriber;
		this.blaLinkTrg = blaLinkTrg;
		this.blaActionType = blaActionType;
		this.blaActionSeq = blaActionSeq;
		this.blaDocType = blaDocType;
		this.blaServiceCode = blaServiceCode;
		this.blaReasonCode = blaReasonCode;
		this.blaTableName = blaTableName;
		this.blaColumnName = blaColumnName;
		this.blaNewValue = blaNewValue;
		this.blaWhereColumn = blaWhereColumn;
		this.blaWhereType = blaWhereType;
		this.blaChargeCode = blaChargeCode;
		this.blaVoiceMess = blaVoiceMess;
		this.blaAmActionId = blaAmActionId;
		this.blaAmTargetType = blaAmTargetType;
		this.blaAmTargetGrp = blaAmTargetGrp;
		this.blaAmTargetUser = blaAmTargetUser;
		this.blaAmDeadline = blaAmDeadline;
		this.blaAmStatus = blaAmStatus;
		this.blaLastUpdate = blaLastUpdate;
		this.blaUdaActionId = blaUdaActionId;
		this.blaThresh = blaThresh;
		this.blaStatus = blaStatus;
	}

	public Integer getBlaSerialId() {
		return blaSerialId;
	}

	public void setBlaSerialId(Integer blaSerialId) {
		this.blaSerialId = blaSerialId;
	}

	public String getBlaCustomer() {
		return blaCustomer;
	}

	public void setBlaCustomer(String blaCustomer) {
		this.blaCustomer = blaCustomer;
	}

	public Integer getBlaSubscriber() {
		return blaSubscriber;
	}

	public void setBlaSubscriber(Integer blaSubscriber) {
		this.blaSubscriber = blaSubscriber;
	}

	public Integer getBlaLinkTrg() {
		return blaLinkTrg;
	}

	public void setBlaLinkTrg(Integer blaLinkTrg) {
		this.blaLinkTrg = blaLinkTrg;
	}

	public String getBlaActionType() {
		return blaActionType;
	}

	public void setBlaActionType(String blaActionType) {
		this.blaActionType = blaActionType;
	}

	public Short getBlaActionSeq() {
		return blaActionSeq;
	}

	public void setBlaActionSeq(Short blaActionSeq) {
		this.blaActionSeq = blaActionSeq;
	}

	public String getBlaDocType() {
		return blaDocType;
	}

	public void setBlaDocType(String blaDocType) {
		this.blaDocType = blaDocType;
	}

	public String getBlaServiceCode() {
		return blaServiceCode;
	}

	public void setBlaServiceCode(String blaServiceCode) {
		this.blaServiceCode = blaServiceCode;
	}

	public String getBlaReasonCode() {
		return blaReasonCode;
	}

	public void setBlaReasonCode(String blaReasonCode) {
		this.blaReasonCode = blaReasonCode;
	}

	public String getBlaTableName() {
		return blaTableName;
	}

	public void setBlaTableName(String blaTableName) {
		this.blaTableName = blaTableName;
	}

	public String getBlaColumnName() {
		return blaColumnName;
	}

	public void setBlaColumnName(String blaColumnName) {
		this.blaColumnName = blaColumnName;
	}

	public String getBlaNewValue() {
		return blaNewValue;
	}

	public void setBlaNewValue(String blaNewValue) {
		this.blaNewValue = blaNewValue;
	}

	public String getBlaWhereColumn() {
		return blaWhereColumn;
	}

	public void setBlaWhereColumn(String blaWhereColumn) {
		this.blaWhereColumn = blaWhereColumn;
	}

	public String getBlaWhereType() {
		return blaWhereType;
	}

	public void setBlaWhereType(String blaWhereType) {
		this.blaWhereType = blaWhereType;
	}

	public String getBlaChargeCode() {
		return blaChargeCode;
	}

	public void setBlaChargeCode(String blaChargeCode) {
		this.blaChargeCode = blaChargeCode;
	}

	public String getBlaVoiceMess() {
		return blaVoiceMess;
	}

	public void setBlaVoiceMess(String blaVoiceMess) {
		this.blaVoiceMess = blaVoiceMess;
	}

	public Integer getBlaAmActionId() {
		return blaAmActionId;
	}

	public void setBlaAmActionId(Integer blaAmActionId) {
		this.blaAmActionId = blaAmActionId;
	}

	public String getBlaAmTargetType() {
		return blaAmTargetType;
	}

	public void setBlaAmTargetType(String blaAmTargetType) {
		this.blaAmTargetType = blaAmTargetType;
	}

	public Integer getBlaAmTargetGrp() {
		return blaAmTargetGrp;
	}

	public void setBlaAmTargetGrp(Integer blaAmTargetGrp) {
		this.blaAmTargetGrp = blaAmTargetGrp;
	}

	public String getBlaAmTargetUser() {
		return blaAmTargetUser;
	}

	public void setBlaAmTargetUser(String blaAmTargetUser) {
		this.blaAmTargetUser = blaAmTargetUser;
	}

	public Short getBlaAmDeadline() {
		return blaAmDeadline;
	}

	public void setBlaAmDeadline(Short blaAmDeadline) {
		this.blaAmDeadline = blaAmDeadline;
	}

	public String getBlaAmStatus() {
		return blaAmStatus;
	}

	public void setBlaAmStatus(String blaAmStatus) {
		this.blaAmStatus = blaAmStatus;
	}

	public Date getBlaLastUpdate() {
		return blaLastUpdate;
	}

	public void setBlaLastUpdate(Date blaLastUpdate) {
		this.blaLastUpdate = blaLastUpdate;
	}

	public Integer getBlaUdaActionId() {
		return blaUdaActionId;
	}

	public void setBlaUdaActionId(Integer blaUdaActionId) {
		this.blaUdaActionId = blaUdaActionId;
	}

	public Double getBlaThresh() {
		return blaThresh;
	}

	public void setBlaThresh(Double blaThresh) {
		this.blaThresh = blaThresh;
	}

	public String getBlaStatus() {
		return blaStatus;
	}

	public void setBlaStatus(String blaStatus) {
		this.blaStatus = blaStatus;
	}

}
