package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EtqEtQuoteDMO extends DBO implements Serializable {

	private Integer etqQuoteNo;
	private String etqActionType;
	private String etqQuoteLevel;
	private String etqAccountNo;
	private Integer etqSubscriberId;
	private String etqMsisdnNo;
	private Integer etqRemainingMnt;
	private Date etqEffectiveDate;
	private Date etqContrEndDate;
	private Double etqMnthSubChrg;
	private Double etqDeviceCosts;
	private Double etqEtMigChrg;
	private Double etqEtMigDeviceChrg;
	private Date etqActionDate;
	private String etqActionUser;
	private String etqEtMigReason;
	private String etqOverrideUser;
	private Double etqOverrideChrg;
	private Double etqOverrideDeviceChrg;
	private String etqOverrideReason;
	private String etqOverrideFlag;
	private Integer etqNoticePerApply;
	private String etqQuoteEmailAddr;
	private String etqQuoteSplitChrg;
	private String etqQuoteStatus;
	private Date etqQuoteStatDate;
	private String etqQuoteStatUser;

	public static final int etqQuoteNoFilter = 0;

	public static final int etqActionTypeFilter = 1;
	private static final int etqActionTypeSize = 2;

	public static final int etqQuoteLevelFilter = 2;
	private static final int etqQuoteLevelSize = 1;

	public static final int etqAccountNoFilter = 3;
	private static final int etqAccountNoSize = 8;

	public static final int etqSubscriberIdFilter = 4;

	public static final int etqMsisdnNoFilter = 5;
	private static final int etqMsisdnNoSize = 15;

	public static final int etqRemainingMntFilter = 6;

	public static final int etqEffectiveDateFilter = 7;

	public static final int etqContrEndDateFilter = 8;

	public static final int etqMnthSubChrgFilter = 9;

	public static final int etqDeviceCostsFilter = 10;

	public static final int etqEtMigChrgFilter = 11;

	public static final int etqEtMigDeviceChrgFilter = 12;

	public static final int etqActionDateFilter = 13;

	public static final int etqActionUserFilter = 14;
	private static final int etqActionUserSize = 10;

	public static final int etqEtMigReasonFilter = 15;
	private static final int etqEtMigReasonSize = 4;

	public static final int etqOverrideUserFilter = 16;
	private static final int etqOverrideUserSize = 10;

	public static final int etqOverrideChrgFilter = 17;

	public static final int etqOverrideDeviceChrgFilter = 18;

	public static final int etqOverrideReasonFilter = 19;
	private static final int etqOverrideReasonSize = 20;

	public static final int etqOverrideFlagFilter = 20;
	private static final int etqOverrideFlagSize = 1;

	public static final int etqNoticePerApplyFilter = 21;

	public static final int etqQuoteEmailAddrFilter = 22;
	private static final int etqQuoteEmailAddrSize = 50;

	public static final int etqQuoteSplitChrgFilter = 23;
	private static final int etqQuoteSplitChrgSize = 1;

	public static final int etqQuoteStatusFilter = 24;
	private static final int etqQuoteStatusSize = 2;

	public static final int etqQuoteStatDateFilter = 25;

	public static final int etqQuoteStatUserFilter = 26;
	private static final int etqQuoteStatUserSize = 10;

	public EtqEtQuoteDMO() {
	};

	public EtqEtQuoteDMO(final Integer etqQuoteNo, final String etqActionType, final String etqQuoteLevel,
			final String etqAccountNo, final Integer etqSubscriberId, final String etqMsisdnNo,
			final Integer etqRemainingMnt, final Date etqEffectiveDate, final Date etqContrEndDate,
			final Double etqMnthSubChrg, final Double etqDeviceCosts, final Double etqEtMigChrg,
			final Double etqEtMigDeviceChrg, final Date etqActionDate, final String etqActionUser,
			final String etqEtMigReason, final String etqOverrideUser, final Double etqOverrideChrg,
			final Double etqOverrideDeviceChrg, final String etqOverrideReason, final String etqOverrideFlag,
			final Integer etqNoticePerApply, final String etqQuoteEmailAddr, final String etqQuoteSplitChrg,
			final String etqQuoteStatus, final Date etqQuoteStatDate, final String etqQuoteStatUser) {

		this.etqQuoteNo = etqQuoteNo;
		this.etqActionType = etqActionType;
		this.etqQuoteLevel = etqQuoteLevel;
		this.etqAccountNo = etqAccountNo;
		this.etqSubscriberId = etqSubscriberId;
		this.etqMsisdnNo = etqMsisdnNo;
		this.etqRemainingMnt = etqRemainingMnt;
		this.etqEffectiveDate = etqEffectiveDate;
		this.etqContrEndDate = etqContrEndDate;
		this.etqMnthSubChrg = etqMnthSubChrg;
		this.etqDeviceCosts = etqDeviceCosts;
		this.etqEtMigChrg = etqEtMigChrg;
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
		this.etqActionDate = etqActionDate;
		this.etqActionUser = etqActionUser;
		this.etqEtMigReason = etqEtMigReason;
		this.etqOverrideUser = etqOverrideUser;
		this.etqOverrideChrg = etqOverrideChrg;
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
		this.etqOverrideReason = etqOverrideReason;
		this.etqOverrideFlag = etqOverrideFlag;
		this.etqNoticePerApply = etqNoticePerApply;
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
		this.etqQuoteStatus = etqQuoteStatus;
		this.etqQuoteStatDate = etqQuoteStatDate;
		this.etqQuoteStatUser = etqQuoteStatUser;
	};

	private static final int[] fieldSizes = new int[] { 0, etqActionTypeSize, etqQuoteLevelSize, etqAccountNoSize, 0,
			etqMsisdnNoSize, 0, 0, 0, 0, 0, 0, 0, 0, etqActionUserSize, etqEtMigReasonSize, etqOverrideUserSize, 0, 0,
			etqOverrideReasonSize, etqOverrideFlagSize, 0, etqQuoteEmailAddrSize, etqQuoteSplitChrgSize,
			etqQuoteStatusSize, 0, etqQuoteStatUserSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.etqQuoteNo,
				((this.etqActionType == null) ? null
						: (this.etqActionType.length() <= etqActionTypeSize) ? this.etqActionType
								: this.etqActionType.substring(0, this.etqActionTypeSize)),
				((this.etqQuoteLevel == null) ? null
						: (this.etqQuoteLevel.length() <= etqQuoteLevelSize) ? this.etqQuoteLevel
								: this.etqQuoteLevel.substring(0, this.etqQuoteLevelSize)),
				((this.etqAccountNo == null) ? null
						: (this.etqAccountNo.length() <= etqAccountNoSize) ? this.etqAccountNo
								: this.etqAccountNo.substring(0, this.etqAccountNoSize)),
				this.etqSubscriberId,
				((this.etqMsisdnNo == null) ? null
						: (this.etqMsisdnNo.length() <= etqMsisdnNoSize) ? this.etqMsisdnNo
								: this.etqMsisdnNo.substring(0, this.etqMsisdnNoSize)),
				this.etqRemainingMnt, this.etqEffectiveDate, this.etqContrEndDate, this.etqMnthSubChrg,
				this.etqDeviceCosts, this.etqEtMigChrg, this.etqEtMigDeviceChrg, this.etqActionDate,
				((this.etqActionUser == null) ? null
						: (this.etqActionUser.length() <= etqActionUserSize) ? this.etqActionUser
								: this.etqActionUser.substring(0, this.etqActionUserSize)),
				((this.etqEtMigReason == null) ? null
						: (this.etqEtMigReason.length() <= etqEtMigReasonSize) ? this.etqEtMigReason
								: this.etqEtMigReason.substring(0, this.etqEtMigReasonSize)),
				((this.etqOverrideUser == null) ? null
						: (this.etqOverrideUser.length() <= etqOverrideUserSize) ? this.etqOverrideUser
								: this.etqOverrideUser.substring(0, this.etqOverrideUserSize)),
				this.etqOverrideChrg, this.etqOverrideDeviceChrg,
				((this.etqOverrideReason == null) ? null
						: (this.etqOverrideReason.length() <= etqOverrideReasonSize) ? this.etqOverrideReason
								: this.etqOverrideReason.substring(0, this.etqOverrideReasonSize)),
				((this.etqOverrideFlag == null) ? null
						: (this.etqOverrideFlag.length() <= etqOverrideFlagSize) ? this.etqOverrideFlag
								: this.etqOverrideFlag.substring(0, this.etqOverrideFlagSize)),
				this.etqNoticePerApply,
				((this.etqQuoteEmailAddr == null) ? null
						: (this.etqQuoteEmailAddr.length() <= etqQuoteEmailAddrSize) ? this.etqQuoteEmailAddr
								: this.etqQuoteEmailAddr.substring(0, this.etqQuoteEmailAddrSize)),
				((this.etqQuoteSplitChrg == null) ? null
						: (this.etqQuoteSplitChrg.length() <= etqQuoteSplitChrgSize) ? this.etqQuoteSplitChrg
								: this.etqQuoteSplitChrg.substring(0, this.etqQuoteSplitChrgSize)),
				((this.etqQuoteStatus == null) ? null
						: (this.etqQuoteStatus.length() <= etqQuoteStatusSize) ? this.etqQuoteStatus
								: this.etqQuoteStatus.substring(0, this.etqQuoteStatusSize)),
				this.etqQuoteStatDate,
				((this.etqQuoteStatUser == null) ? null
						: (this.etqQuoteStatUser.length() <= etqQuoteStatUserSize) ? this.etqQuoteStatUser
								: this.etqQuoteStatUser.substring(0, this.etqQuoteStatUserSize)) };
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
		return new DAOArgs(4).arg(this.etqQuoteNo).arg(etqAccountNo).arg(etqSubscriberId).arg(etqMsisdnNo);
	}

	protected void set(Object[] fields) {
		this.etqQuoteNo = ((Integer) fields[0]);
		this.etqActionType = rtrim((String) fields[1]);
		this.etqQuoteLevel = rtrim((String) fields[2]);
		this.etqAccountNo = rtrim((String) fields[3]);
		this.etqSubscriberId = ((Integer) fields[4]);
		this.etqMsisdnNo = rtrim((String) fields[5]);
		this.etqRemainingMnt = ((Integer) fields[6]);
		this.etqEffectiveDate = ((fields[7] == null) ? null : new Date(fields[7]));
		this.etqContrEndDate = ((fields[8] == null) ? null : new Date(fields[8]));
		this.etqMnthSubChrg = ((Double) fields[9]);
		this.etqDeviceCosts = ((Double) fields[10]);
		this.etqEtMigChrg = ((Double) fields[11]);
		this.etqEtMigDeviceChrg = ((Double) fields[12]);
		this.etqActionDate = ((fields[13] == null) ? null : new Date(fields[13]));
		this.etqActionUser = rtrim((String) fields[14]);
		this.etqEtMigReason = rtrim((String) fields[15]);
		this.etqOverrideUser = rtrim((String) fields[16]);
		this.etqOverrideChrg = ((Double) fields[17]);
		this.etqOverrideDeviceChrg = ((Double) fields[18]);
		this.etqOverrideReason = rtrim((String) fields[19]);
		this.etqOverrideFlag = rtrim((String) fields[20]);
		this.etqNoticePerApply = ((Integer) fields[21]);
		this.etqQuoteEmailAddr = rtrim((String) fields[22]);
		this.etqQuoteSplitChrg = rtrim((String) fields[23]);
		this.etqQuoteStatus = rtrim((String) fields[24]);
		this.etqQuoteStatDate = ((fields[25] == null) ? null : new Date(fields[25]));
		this.etqQuoteStatUser = rtrim((String) fields[26]);
	}

	public void set(final Integer etqQuoteNo, final String etqActionType, final String etqQuoteLevel,
			final String etqAccountNo, final Integer etqSubscriberId, final String etqMsisdnNo,
			final Integer etqRemainingMnt, final Date etqEffectiveDate, final Date etqContrEndDate,
			final Double etqMnthSubChrg, final Double etqDeviceCosts, final Double etqEtMigChrg,
			final Double etqEtMigDeviceChrg, final Date etqActionDate, final String etqActionUser,
			final String etqEtMigReason, final String etqOverrideUser, final Double etqOverrideChrg,
			final Double etqOverrideDeviceChrg, final String etqOverrideReason, final String etqOverrideFlag,
			final Integer etqNoticePerApply, final String etqQuoteEmailAddr, final String etqQuoteSplitChrg,
			final String etqQuoteStatus, final Date etqQuoteStatDate, final String etqQuoteStatUser) {

		this.etqQuoteNo = etqQuoteNo;
		this.etqActionType = etqActionType;
		this.etqQuoteLevel = etqQuoteLevel;
		this.etqAccountNo = etqAccountNo;
		this.etqSubscriberId = etqSubscriberId;
		this.etqMsisdnNo = etqMsisdnNo;
		this.etqRemainingMnt = etqRemainingMnt;
		this.etqEffectiveDate = etqEffectiveDate;
		this.etqContrEndDate = etqContrEndDate;
		this.etqMnthSubChrg = etqMnthSubChrg;
		this.etqDeviceCosts = etqDeviceCosts;
		this.etqEtMigChrg = etqEtMigChrg;
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
		this.etqActionDate = etqActionDate;
		this.etqActionUser = etqActionUser;
		this.etqEtMigReason = etqEtMigReason;
		this.etqOverrideUser = etqOverrideUser;
		this.etqOverrideChrg = etqOverrideChrg;
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
		this.etqOverrideReason = etqOverrideReason;
		this.etqOverrideFlag = etqOverrideFlag;
		this.etqNoticePerApply = etqNoticePerApply;
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
		this.etqQuoteStatus = etqQuoteStatus;
		this.etqQuoteStatDate = etqQuoteStatDate;
		this.etqQuoteStatUser = etqQuoteStatUser;
	}

	public Integer getEtqQuoteNo() {
		return etqQuoteNo;
	}

	public void setEtqQuoteNo(Integer etqQuoteNo) {
		this.etqQuoteNo = etqQuoteNo;
	}

	public String getEtqActionType() {
		return etqActionType;
	}

	public void setEtqActionType(String etqActionType) {
		this.etqActionType = etqActionType;
	}

	public String getEtqQuoteLevel() {
		return etqQuoteLevel;
	}

	public void setEtqQuoteLevel(String etqQuoteLevel) {
		this.etqQuoteLevel = etqQuoteLevel;
	}

	public String getEtqAccountNo() {
		return etqAccountNo;
	}

	public void setEtqAccountNo(String etqAccountNo) {
		this.etqAccountNo = etqAccountNo;
	}

	public Integer getEtqSubscriberId() {
		return etqSubscriberId;
	}

	public void setEtqSubscriberId(Integer etqSubscriberId) {
		this.etqSubscriberId = etqSubscriberId;
	}

	public String getEtqMsisdnNo() {
		return etqMsisdnNo;
	}

	public void setEtqMsisdnNo(String etqMsisdnNo) {
		this.etqMsisdnNo = etqMsisdnNo;
	}

	public Integer getEtqRemainingMnt() {
		return etqRemainingMnt;
	}

	public void setEtqRemainingMnt(Integer etqRemainingMnt) {
		this.etqRemainingMnt = etqRemainingMnt;
	}

	public Date getEtqEffectiveDate() {
		return etqEffectiveDate;
	}

	public void setEtqEffectiveDate(Date etqEffectiveDate) {
		this.etqEffectiveDate = etqEffectiveDate;
	}

	public Date getEtqContrEndDate() {
		return etqContrEndDate;
	}

	public void setEtqContrEndDate(Date etqContrEndDate) {
		this.etqContrEndDate = etqContrEndDate;
	}

	public Double getEtqMnthSubChrg() {
		return etqMnthSubChrg;
	}

	public void setEtqMnthSubChrg(Double etqMnthSubChrg) {
		this.etqMnthSubChrg = etqMnthSubChrg;
	}

	public Double getEtqDeviceCosts() {
		return etqDeviceCosts;
	}

	public void setEtqDeviceCosts(Double etqDeviceCosts) {
		this.etqDeviceCosts = etqDeviceCosts;
	}

	public Double getEtqEtMigChrg() {
		return etqEtMigChrg;
	}

	public void setEtqEtMigChrg(Double etqEtMigChrg) {
		this.etqEtMigChrg = etqEtMigChrg;
	}

	public Double getEtqEtMigDeviceChrg() {
		return etqEtMigDeviceChrg;
	}

	public void setEtqEtMigDeviceChrg(Double etqEtMigDeviceChrg) {
		this.etqEtMigDeviceChrg = etqEtMigDeviceChrg;
	}

	public Date getEtqActionDate() {
		return etqActionDate;
	}

	public void setEtqActionDate(Date etqActionDate) {
		this.etqActionDate = etqActionDate;
	}

	public String getEtqActionUser() {
		return etqActionUser;
	}

	public void setEtqActionUser(String etqActionUser) {
		this.etqActionUser = etqActionUser;
	}

	public String getEtqEtMigReason() {
		return etqEtMigReason;
	}

	public void setEtqEtMigReason(String etqEtMigReason) {
		this.etqEtMigReason = etqEtMigReason;
	}

	public String getEtqOverrideUser() {
		return etqOverrideUser;
	}

	public void setEtqOverrideUser(String etqOverrideUser) {
		this.etqOverrideUser = etqOverrideUser;
	}

	public Double getEtqOverrideChrg() {
		return etqOverrideChrg;
	}

	public void setEtqOverrideChrg(Double etqOverrideChrg) {
		this.etqOverrideChrg = etqOverrideChrg;
	}

	public Double getEtqOverrideDeviceChrg() {
		return etqOverrideDeviceChrg;
	}

	public void setEtqOverrideDeviceChrg(Double etqOverrideDeviceChrg) {
		this.etqOverrideDeviceChrg = etqOverrideDeviceChrg;
	}

	public String getEtqOverrideReason() {
		return etqOverrideReason;
	}

	public void setEtqOverrideReason(String etqOverrideReason) {
		this.etqOverrideReason = etqOverrideReason;
	}

	public String getEtqOverrideFlag() {
		return etqOverrideFlag;
	}

	public void setEtqOverrideFlag(String etqOverrideFlag) {
		this.etqOverrideFlag = etqOverrideFlag;
	}

	public Integer getEtqNoticePerApply() {
		return etqNoticePerApply;
	}

	public void setEtqNoticePerApply(Integer etqNoticePerApply) {
		this.etqNoticePerApply = etqNoticePerApply;
	}

	public String getEtqQuoteEmailAddr() {
		return etqQuoteEmailAddr;
	}

	public void setEtqQuoteEmailAddr(String etqQuoteEmailAddr) {
		this.etqQuoteEmailAddr = etqQuoteEmailAddr;
	}

	public String getEtqQuoteSplitChrg() {
		return etqQuoteSplitChrg;
	}

	public void setEtqQuoteSplitChrg(String etqQuoteSplitChrg) {
		this.etqQuoteSplitChrg = etqQuoteSplitChrg;
	}

	public String getEtqQuoteStatus() {
		return etqQuoteStatus;
	}

	public void setEtqQuoteStatus(String etqQuoteStatus) {
		this.etqQuoteStatus = etqQuoteStatus;
	}

	public Date getEtqQuoteStatDate() {
		return etqQuoteStatDate;
	}

	public void setEtqQuoteStatDate(Date etqQuoteStatDate) {
		this.etqQuoteStatDate = etqQuoteStatDate;
	}

	public String getEtqQuoteStatUser() {
		return etqQuoteStatUser;
	}

	public void setEtqQuoteStatUser(String etqQuoteStatUser) {
		this.etqQuoteStatUser = etqQuoteStatUser;
	}

	@Override
	public String toString() {
		return "\nEtqEtQuoteDMO [\netqQuoteNo=" + etqQuoteNo + "\netqActionType=" + etqActionType + "\netqQuoteLevel="
				+ etqQuoteLevel + "\netqAccountNo=" + etqAccountNo + "\netqSubscriberId=" + etqSubscriberId
				+ "\netqMsisdnNo=" + etqMsisdnNo + "\netqRemainingMnt=" + etqRemainingMnt + "\netqEffectiveDate="
				+ etqEffectiveDate + "\netqContrEndDate=" + etqContrEndDate + "\netqMnthSubChrg=" + etqMnthSubChrg
				+ "\netqDeviceCosts=" + etqDeviceCosts + "\netqEtMigChrg=" + etqEtMigChrg + "\netqEtMigDeviceChrg="
				+ etqEtMigDeviceChrg + "\netqActionDate=" + etqActionDate + "\netqActionUser=" + etqActionUser
				+ "\netqEtMigReason=" + etqEtMigReason + "\netqOverrideUser=" + etqOverrideUser + "\netqOverrideChrg="
				+ etqOverrideChrg + "\netqOverrideDeviceChrg=" + etqOverrideDeviceChrg + "\netqOverrideReason="
				+ etqOverrideReason + "\netqOverrideFlag=" + etqOverrideFlag + "\netqNoticePerApply="
				+ etqNoticePerApply + "\netqQuoteEmailAddr=" + etqQuoteEmailAddr + "\netqQuoteSplitChrg="
				+ etqQuoteSplitChrg + "\netqQuoteStatus=" + etqQuoteStatus + "\netqQuoteStatDate=" + etqQuoteStatDate
				+ "\netqQuoteStatUser=" + etqQuoteStatUser + "]";
	}
}
