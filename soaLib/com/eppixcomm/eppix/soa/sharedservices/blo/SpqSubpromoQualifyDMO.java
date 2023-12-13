package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SpqSubpromoQualifyDMO extends DBO implements Serializable {

	private Integer spqSerialId;
	private String spqBillAcNo;
	private Integer spqSubscriberId;
	private Integer spqPromoHdId;
	private String spqPlan;
	private Integer spqPlanVerId;
	private Date spqApplyDate;
	private String spqCreatedBy;
	private Date spqExptermDate;
	private String spqStatus;
	private DateTime spqStatusDate;
	private String spqErrorMess;
	private String spqUserId;

	public static final int spqSerialIdFilter = 0;

	public static final int spqBillAcNoFilter = 1;
	private static final int spqBillAcNoSize = 8;

	public static final int spqSubscriberIdFilter = 2;

	public static final int spqPromoHdIdFilter = 3;

	public static final int spqPlanFilter = 4;
	private static final int spqPlanSize = 5;

	public static final int spqPlanVerIdFilter = 5;

	public static final int spqApplyDateFilter = 6;

	public static final int spqCreatedByFilter = 7;
	private static final int spqCreatedBySize = 1;

	public static final int spqExptermDateFilter = 8;

	public static final int spqStatusFilter = 9;
	private static final int spqStatusSize = 1;

	public static final int spqStatusDateFilter = 10;

	public static final int spqErrorMessFilter = 11;
	private static final int spqErrorMessSize = 500;

	public static final int spqUserIdFilter = 12;
	private static final int spqUserIdSize = 20;

	public SpqSubpromoQualifyDMO() {
	};

	public SpqSubpromoQualifyDMO(final Integer spqSerialId,
			final String spqBillAcNo, final Integer spqSubscriberId,
			final Integer spqPromoHdId, final String spqPlan,
			final Integer spqPlanVerId, final Date spqApplyDate,
			final String spqCreatedBy, final Date spqExptermDate,
			final String spqStatus, final DateTime spqStatusDate,
			final String spqErrorMess, final String spqUserId) {

		this.spqSerialId = spqSerialId;
		this.spqBillAcNo = spqBillAcNo;
		this.spqSubscriberId = spqSubscriberId;
		this.spqPromoHdId = spqPromoHdId;
		this.spqPlan = spqPlan;
		this.spqPlanVerId = spqPlanVerId;
		this.spqApplyDate = spqApplyDate;
		this.spqCreatedBy = spqCreatedBy;
		this.spqExptermDate = spqExptermDate;
		this.spqStatus = spqStatus;
		this.spqStatusDate = spqStatusDate;
		this.spqErrorMess = spqErrorMess;
		this.spqUserId = spqUserId;
	};

	private static final int[] fieldSizes = new int[] { 0, spqBillAcNoSize, 0,
			0, spqPlanSize, 0, 0, spqCreatedBySize, 0, spqStatusSize, 0,
			spqErrorMessSize, spqUserIdSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.spqSerialId,
				((this.spqBillAcNo == null) ? null
						: (this.spqBillAcNo.length() <= spqBillAcNoSize) ? this.spqBillAcNo
								: this.spqBillAcNo.substring(0,
										this.spqBillAcNoSize)),
				this.spqSubscriberId,
				this.spqPromoHdId,
				((this.spqPlan == null) ? null
						: (this.spqPlan.length() <= spqPlanSize) ? this.spqPlan
								: this.spqPlan.substring(0, this.spqPlanSize)),
				this.spqPlanVerId,
				this.spqApplyDate,
				((this.spqCreatedBy == null) ? null : (this.spqCreatedBy
						.length() <= spqCreatedBySize) ? this.spqCreatedBy
						: this.spqCreatedBy.substring(0, this.spqCreatedBySize)),
				this.spqExptermDate,
				((this.spqStatus == null) ? null
						: (this.spqStatus.length() <= spqStatusSize) ? this.spqStatus
								: this.spqStatus.substring(0,
										this.spqStatusSize)),
				this.spqStatusDate,
				((this.spqErrorMess == null) ? null : (this.spqErrorMess
						.length() <= spqErrorMessSize) ? this.spqErrorMess
						: this.spqErrorMess.substring(0, this.spqErrorMessSize)),
				((this.spqUserId == null) ? null
						: (this.spqUserId.length() <= spqUserIdSize) ? this.spqUserId
								: this.spqUserId.substring(0,
										this.spqUserIdSize)) };
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
		return new DAOArgs(2).arg(this.spqSerialId).arg(this.spqStatus);
	}

	protected void set(Object[] fields) {
		this.spqSerialId = ((Integer) fields[0]);
		this.spqBillAcNo = rtrim((String) fields[1]);
		this.spqSubscriberId = ((Integer) fields[2]);
		this.spqPromoHdId = ((Integer) fields[3]);
		this.spqPlan = rtrim((String) fields[4]);
		this.spqPlanVerId = ((Integer) fields[5]);
		this.spqApplyDate = ((fields[6] == null) ? null : new Date(fields[6]));
		this.spqCreatedBy = rtrim((String) fields[7]);
		this.spqExptermDate = ((fields[8] == null) ? null : new Date(fields[8]));
		this.spqStatus = rtrim((String) fields[9]);
		this.spqStatusDate = ((fields[10] == null) ? null : new DateTime(
				(DateTime) fields[10]));
		this.spqErrorMess = rtrim((String) fields[11]);
		this.spqUserId = rtrim((String) fields[12]);
	}

	public void set(final Integer spqSerialId, final String spqBillAcNo,
			final Integer spqSubscriberId, final Integer spqPromoHdId,
			final String spqPlan, final Integer spqPlanVerId,
			final Date spqApplyDate, final String spqCreatedBy,
			final Date spqExptermDate, final String spqStatus,
			final DateTime spqStatusDate, final String spqErrorMess,
			final String spqUserId) {

		this.spqSerialId = spqSerialId;
		this.spqBillAcNo = spqBillAcNo;
		this.spqSubscriberId = spqSubscriberId;
		this.spqPromoHdId = spqPromoHdId;
		this.spqPlan = spqPlan;
		this.spqPlanVerId = spqPlanVerId;
		this.spqApplyDate = spqApplyDate;
		this.spqCreatedBy = spqCreatedBy;
		this.spqExptermDate = spqExptermDate;
		this.spqStatus = spqStatus;
		this.spqStatusDate = spqStatusDate;
		this.spqErrorMess = spqErrorMess;
		this.spqUserId = spqUserId;
	}

	public Integer getSpqSerialId() {
		return spqSerialId;
	}

	public void setSpqSerialId(Integer spqSerialId) {
		this.spqSerialId = spqSerialId;
	}

	public String getSpqBillAcNo() {
		return spqBillAcNo;
	}

	public void setSpqBillAcNo(String spqBillAcNo) {
		this.spqBillAcNo = spqBillAcNo;
	}

	public Integer getSpqSubscriberId() {
		return spqSubscriberId;
	}

	public void setSpqSubscriberId(Integer spqSubscriberId) {
		this.spqSubscriberId = spqSubscriberId;
	}

	public Integer getSpqPromoHdId() {
		return spqPromoHdId;
	}

	public void setSpqPromoHdId(Integer spqPromoHdId) {
		this.spqPromoHdId = spqPromoHdId;
	}

	public String getSpqPlan() {
		return spqPlan;
	}

	public void setSpqPlan(String spqPlan) {
		this.spqPlan = spqPlan;
	}

	public Integer getSpqPlanVerId() {
		return spqPlanVerId;
	}

	public void setSpqPlanVerId(Integer spqPlanVerId) {
		this.spqPlanVerId = spqPlanVerId;
	}

	public Date getSpqApplyDate() {
		return spqApplyDate;
	}

	public void setSpqApplyDate(Date spqApplyDate) {
		this.spqApplyDate = spqApplyDate;
	}

	public String getSpqCreatedBy() {
		return spqCreatedBy;
	}

	public void setSpqCreatedBy(String spqCreatedBy) {
		this.spqCreatedBy = spqCreatedBy;
	}

	public Date getSpqExptermDate() {
		return spqExptermDate;
	}

	public void setSpqExptermDate(Date spqExptermDate) {
		this.spqExptermDate = spqExptermDate;
	}

	public String getSpqStatus() {
		return spqStatus;
	}

	public void setSpqStatus(String spqStatus) {
		this.spqStatus = spqStatus;
	}

	public DateTime getSpqStatusDate() {
		return spqStatusDate;
	}

	public void setSpqStatusDate(DateTime spqStatusDate) {
		this.spqStatusDate = spqStatusDate;
	}

	public String getSpqErrorMess() {
		return spqErrorMess;
	}

	public void setSpqErrorMess(String spqErrorMess) {
		this.spqErrorMess = spqErrorMess;
	}

	public String getSpqUserId() {
		return spqUserId;
	}

	public void setSpqUserId(String spqUserId) {
		this.spqUserId = spqUserId;
	}

}
