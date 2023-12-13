package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class PfuPocUsageDMO extends DBO implements Serializable {

	private Integer pfuSerialId;
	private String pfuMsisdnNo;
	private Integer pfuFolderId;
	private BigDecimal pfuUsage;
	private Date pfuUsageDate;
	private String pfuStatus;
	private String pfuComments;
	private DateTime pfuXdrDate;
	private DateTime pfuProcessDate;

	public static final int pfuSerialIdFilter = 0;
	private static final int pfuSerialIdSize = 1;

	public static final int pfuMsisdnNoFilter = 1;
	private static final int pfuMsisdnNoSize = 15;

	public static final int pfuFolderIdFilter = 2;

	public static final int pfuUsageFilter = 3;

	public static final int pfuUsageDateFilter = 4;

	public static final int pfuStatusFilter = 5;
	private static final int pfuStatusSize = 1;

	public static final int pfuCommentsFilter = 6;
	private static final int pfuCommentsSize = 500;

	public static final int pfuXdrDateFilter = 7;

	public static final int pfuProcessDateFilter = 8;

	public PfuPocUsageDMO() {
	};

	public PfuPocUsageDMO(final Integer pfuSerialId, final String pfuMsisdnNo,
			final Integer pfuFolderId, final BigDecimal pfuUsage,
			final Date pfuUsageDate, final String pfuStatus,
			final String pfuComments, final DateTime pfuXdrDate,
			final DateTime pfuProcessDate) {

		this.pfuSerialId = pfuSerialId;
		this.pfuMsisdnNo = pfuMsisdnNo;
		this.pfuFolderId = pfuFolderId;
		this.pfuUsage = pfuUsage;
		this.pfuUsageDate = pfuUsageDate;
		this.pfuStatus = pfuStatus;
		this.pfuComments = pfuComments;
		this.pfuXdrDate = pfuXdrDate;
		this.pfuProcessDate = pfuProcessDate;
	};

	private static final int[] fieldSizes = new int[] { pfuSerialIdSize,
			pfuMsisdnNoSize, 0, 0, 0, pfuStatusSize, pfuCommentsSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pfuSerialId,
				((this.pfuMsisdnNo == null) ? null
						: (this.pfuMsisdnNo.length() <= pfuMsisdnNoSize) ? this.pfuMsisdnNo
								: this.pfuMsisdnNo.substring(0,
										this.pfuMsisdnNoSize)),
				this.pfuFolderId,
				this.pfuUsage,
				this.pfuUsageDate,
				((this.pfuStatus == null) ? null
						: (this.pfuStatus.length() <= pfuStatusSize) ? this.pfuStatus
								: this.pfuStatus.substring(0,
										this.pfuStatusSize)),
				((this.pfuComments == null) ? null
						: (this.pfuComments.length() <= pfuCommentsSize) ? this.pfuComments
								: this.pfuComments.substring(0,
										this.pfuCommentsSize)),
				this.pfuXdrDate, this.pfuProcessDate };
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
		return new DAOArgs().arg(this.pfuSerialId);
	}

	protected void set(Object[] fields) {
		this.pfuSerialId = (Integer) fields[0];
		this.pfuMsisdnNo = rtrim((String) fields[1]);
		this.pfuFolderId = ((Integer) fields[2]);
		this.pfuUsage = (BigDecimal) fields[3];
		this.pfuUsageDate = ((fields[4] == null) ? null : new Date(fields[4]));
		this.pfuStatus = rtrim((String) fields[5]);
		this.pfuComments = rtrim((String) fields[6]);
		this.pfuXdrDate = ((fields[7] == null) ? null : ( DateTime)(fields[7]));
		this.pfuProcessDate = ((fields[8] == null) ? null : ( DateTime)(fields[8]));
	}

	public void set(final Integer pfuSerialId, final String pfuMsisdnNo,
			final Integer pfuFolderId, final BigDecimal pfuUsage,
			final Date pfuUsageDate, final String pfuStatus,
			final String pfuComments, final DateTime pfuXdrDate,
			final DateTime pfuProcessDate) {

		this.pfuSerialId = pfuSerialId;
		this.pfuMsisdnNo = pfuMsisdnNo;
		this.pfuFolderId = pfuFolderId;
		this.pfuUsage = pfuUsage;
		this.pfuUsageDate = pfuUsageDate;
		this.pfuStatus = pfuStatus;
		this.pfuComments = pfuComments;
		this.pfuXdrDate = pfuXdrDate;
		this.pfuProcessDate = pfuProcessDate;
	}

	public Integer getPfuSerialId() {
		return pfuSerialId;
	}

	public void setPfuSerialId(Integer pfuSerialId) {
		this.pfuSerialId = pfuSerialId;
	}

	public String getPfuMsisdnNo() {
		return pfuMsisdnNo;
	}

	public void setPfuMsisdnNo(String pfuMsisdnNo) {
		this.pfuMsisdnNo = pfuMsisdnNo;
	}

	public Integer getPfuFolderId() {
		return pfuFolderId;
	}

	public void setPfuFolderId(Integer pfuFolderId) {
		this.pfuFolderId = pfuFolderId;
	}

	public BigDecimal getPfuUsage() {
		return pfuUsage;
	}

	public void setPfuUsage(BigDecimal pfuUsage) {
		this.pfuUsage = pfuUsage;
	}

	public Date getPfuUsageDate() {
		return pfuUsageDate;
	}

	public void setPfuUsageDate(Date pfuUsageDate) {
		this.pfuUsageDate = pfuUsageDate;
	}

	public String getPfuStatus() {
		return pfuStatus;
	}

	public void setPfuStatus(String pfuStatus) {
		this.pfuStatus = pfuStatus;
	}

	public String getPfuComments() {
		return pfuComments;
	}

	public void setPfuComments(String pfuComments) {
		this.pfuComments = pfuComments;
	}

	public DateTime getPfuXdrDate() {
		return pfuXdrDate;
	}

	public void setPfuXdrDate(DateTime pfuXdrDate) {
		this.pfuXdrDate = pfuXdrDate;
	}

	public DateTime getPfuProcessDate() {
		return pfuProcessDate;
	}

	public void setPfuProcessDate(DateTime pfuProcessDate) {
		this.pfuProcessDate = pfuProcessDate;
	}

}