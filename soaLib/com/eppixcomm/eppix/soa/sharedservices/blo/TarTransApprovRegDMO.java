package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TarTransApprovRegDMO extends DBO implements Serializable {

	private String tarBillAcNo;
	private Integer tarSubscriberId;
	private String tarMsisdnNo;
	private String tarApprovalLevel;
	private String tarChannelType;
	private String tarChannelValue;
	private String tarOverride;
	private String tarOverrideUser;
	private String tarUserId;
	private String tarSystemReq;

	public static final int tarBillAcNoFilter = 0;
	private static final int tarBillAcNoSize = 8;

	public static final int tarSubscriberIdFilter = 1;

	public static final int tarMsisdnNoFilter = 2;
	private static final int tarMsisdnNoSize = 15;

	public static final int tarApprovalLevelFilter = 3;
	private static final int tarApprovalLevelSize = 1;

	public static final int tarChannelTypeFilter = 4;
	private static final int tarChannelTypeSize = 5;

	public static final int tarChannelValueFilter = 5;
	private static final int tarChannelValueSize = 50;

	public static final int tarOverrideFilter = 6;
	private static final int tarOverrideSize = 1;

	public static final int tarOverrideUserFilter = 7;
	private static final int tarOverrideUserSize = 20;

	public static final int tarUserIdFilter = 8;
	private static final int tarUserIdSize = 20;

	public static final int tarSystemReqFilter = 9;
	private static final int tarSystemReqSize = 10;

	public TarTransApprovRegDMO() {
	};

	public TarTransApprovRegDMO(final String tarBillAcNo, final Integer tarSubscriberId, final String tarMsisdnNo,
			final String tarApprovalLevel, final String tarChannelType, final String tarChannelValue,
			final String tarOverride, final String tarOverrideUser, final String tarUserId, final String tarSystemReq) {

		this.tarBillAcNo = tarBillAcNo;
		this.tarSubscriberId = tarSubscriberId;
		this.tarMsisdnNo = tarMsisdnNo;
		this.tarApprovalLevel = tarApprovalLevel;
		this.tarChannelType = tarChannelType;
		this.tarChannelValue = tarChannelValue;
		this.tarOverride = tarOverride;
		this.tarOverrideUser = tarOverrideUser;
		this.tarUserId = tarUserId;
		this.tarSystemReq = tarSystemReq;
	};

	private static final int[] fieldSizes = new int[] { tarBillAcNoSize, 0, tarMsisdnNoSize, tarApprovalLevelSize,
			tarChannelTypeSize, tarChannelValueSize, tarOverrideSize, tarOverrideUserSize, tarUserIdSize,
			tarSystemReqSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.tarBillAcNo == null) ? null
						: (this.tarBillAcNo.length() <= tarBillAcNoSize) ? this.tarBillAcNo
								: this.tarBillAcNo.substring(0, this.tarBillAcNoSize)),
				this.tarSubscriberId,
				((this.tarMsisdnNo == null) ? null
						: (this.tarMsisdnNo.length() <= tarMsisdnNoSize) ? this.tarMsisdnNo
								: this.tarMsisdnNo.substring(0, this.tarMsisdnNoSize)),
				((this.tarApprovalLevel == null) ? null
						: (this.tarApprovalLevel.length() <= tarApprovalLevelSize) ? this.tarApprovalLevel
								: this.tarApprovalLevel.substring(0, this.tarApprovalLevelSize)),
				((this.tarChannelType == null) ? null
						: (this.tarChannelType.length() <= tarChannelTypeSize) ? this.tarChannelType
								: this.tarChannelType.substring(0, this.tarChannelTypeSize)),
				((this.tarChannelValue == null) ? null
						: (this.tarChannelValue.length() <= tarChannelValueSize) ? this.tarChannelValue
								: this.tarChannelValue.substring(0, this.tarChannelValueSize)),
				((this.tarOverride == null) ? null
						: (this.tarOverride.length() <= tarOverrideSize) ? this.tarOverride
								: this.tarOverride.substring(0, this.tarOverrideSize)),
				((this.tarOverrideUser == null) ? null
						: (this.tarOverrideUser.length() <= tarOverrideUserSize) ? this.tarOverrideUser
								: this.tarOverrideUser.substring(0, this.tarOverrideUserSize)),
				((this.tarUserId == null) ? null
						: (this.tarUserId.length() <= tarUserIdSize) ? this.tarUserId
								: this.tarUserId.substring(0, this.tarUserIdSize)),
				((this.tarSystemReq == null) ? null
						: (this.tarSystemReq.length() <= tarSystemReqSize) ? this.tarSystemReq
								: this.tarSystemReq.substring(0, this.tarSystemReqSize)) };
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
		return new DAOArgs().arg(tarBillAcNo).arg(tarApprovalLevel).arg(tarChannelType);
	}

	protected void set(Object[] fields) {
		this.tarBillAcNo = rtrim((String) fields[0]);
		this.tarSubscriberId = ((Integer) fields[1]);
		this.tarMsisdnNo = rtrim((String) fields[2]);
		this.tarApprovalLevel = rtrim((String) fields[3]);
		this.tarChannelType = rtrim((String) fields[4]);
		this.tarChannelValue = rtrim((String) fields[5]);
		this.tarOverride = rtrim((String) fields[6]);
		this.tarOverrideUser = rtrim((String) fields[7]);
		this.tarUserId = rtrim((String) fields[8]);
		this.tarSystemReq = rtrim((String) fields[9]);
	}

	public void set(final String tarBillAcNo, final Integer tarSubscriberId, final String tarMsisdnNo,
			final String tarApprovalLevel, final String tarChannelType, final String tarChannelValue,
			final String tarOverride, final String tarOverrideUser, final String tarUserId, final String tarSystemReq) {

		this.tarBillAcNo = tarBillAcNo;
		this.tarSubscriberId = tarSubscriberId;
		this.tarMsisdnNo = tarMsisdnNo;
		this.tarApprovalLevel = tarApprovalLevel;
		this.tarChannelType = tarChannelType;
		this.tarChannelValue = tarChannelValue;
		this.tarOverride = tarOverride;
		this.tarOverrideUser = tarOverrideUser;
		this.tarUserId = tarUserId;
		this.tarSystemReq = tarSystemReq;
	}

	public String getTarBillAcNo() {
		return tarBillAcNo;
	}

	public Integer getTarSubscriberId() {
		return tarSubscriberId;
	}

	public String getTarMsisdnNo() {
		return tarMsisdnNo;
	}

	public String getTarApprovalLevel() {
		return tarApprovalLevel;
	}

	public String getTarChannelType() {
		return tarChannelType;
	}

	public String getTarChannelValue() {
		return tarChannelValue;
	}

	public String getTarOverride() {
		return tarOverride;
	}

	public String getTarOverrideUser() {
		return tarOverrideUser;
	}

	public String getTarUserId() {
		return tarUserId;
	}

	public String getTarSystemReq() {
		return tarSystemReq;
	}

	public void setTarBillAcNo(String tarBillAcNo) {
		this.tarBillAcNo = tarBillAcNo;
	}

	public void setTarSubscriberId(Integer tarSubscriberId) {
		this.tarSubscriberId = tarSubscriberId;
	}

	public void setTarMsisdnNo(String tarMsisdnNo) {
		this.tarMsisdnNo = tarMsisdnNo;
	}

	public void setTarApprovalLevel(String tarApprovalLevel) {
		this.tarApprovalLevel = tarApprovalLevel;
	}

	public void setTarChannelType(String tarChannelType) {
		this.tarChannelType = tarChannelType;
	}

	public void setTarChannelValue(String tarChannelValue) {
		this.tarChannelValue = tarChannelValue;
	}

	public void setTarOverride(String tarOverride) {
		this.tarOverride = tarOverride;
	}

	public void setTarOverrideUser(String tarOverrideUser) {
		this.tarOverrideUser = tarOverrideUser;
	}

	public void setTarUserId(String tarUserId) {
		this.tarUserId = tarUserId;
	}

	public void setTarSystemReq(String tarSystemReq) {
		this.tarSystemReq = tarSystemReq;
	}

}
