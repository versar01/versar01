package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class FtFreeairTimeDMO extends DBO implements Serializable {

	private Integer FtSubscriberId;
	private String FtMsisdnNo;
	private String FtSimNo;
	private String FtServiceCode;
	private Date FtDeactDate;
	private String FtTarplanRef;
	private String FtBillCycle;
	private Date FtContStart;
	private Date FtContEnd;
	private Integer FtOrigSecs;
	private Date FtPrdStart;
	private Date FtPrdEnd;
	private Integer FtSecsRemaining;
	private Float FtValueUsed;

	public static final int FtSubscriberIdFilter = 0;

	public static final int FtMsisdnNoFilter = 1;
	private static final int FtMsisdnNoSize = 15;

	public static final int FtSimNoFilter = 2;
	private static final int FtSimNoSize = 14;

	public static final int FtServiceCodeFilter = 3;
	private static final int FtServiceCodeSize = 4;

	public static final int FtDeactDateFilter = 4;

	public static final int FtTarplanRefFilter = 5;
	private static final int FtTarplanRefSize = 20;

	public static final int FtBillCycleFilter = 6;
	private static final int FtBillCycleSize = 5;

	public static final int FtContStartFilter = 7;

	public static final int FtContEndFilter = 8;

	public static final int FtOrigSecsFilter = 9;

	public static final int FtPrdStartFilter = 10;

	public static final int FtPrdEndFilter = 11;

	public static final int FtSecsRemainingFilter = 12;

	public static final int FtValueUsedFilter = 13;

	public FtFreeairTimeDMO() {
	};

	public FtFreeairTimeDMO(final Integer FtSubscriberId,
			final String FtMsisdnNo, final String FtSimNo,
			final String FtServiceCode, final Date FtDeactDate,
			final String FtTarplanRef, final String FtBillCycle,
			final Date FtContStart, final Date FtContEnd,
			final Integer FtOrigSecs, final Date FtPrdStart,
			final Date FtPrdEnd, final Integer FtSecsRemaining,
			final Float FtValueUsed) {

		this.FtSubscriberId = FtSubscriberId;
		this.FtMsisdnNo = FtMsisdnNo;
		this.FtSimNo = FtSimNo;
		this.FtServiceCode = FtServiceCode;
		this.FtDeactDate = FtDeactDate;
		this.FtTarplanRef = FtTarplanRef;
		this.FtBillCycle = FtBillCycle;
		this.FtContStart = FtContStart;
		this.FtContEnd = FtContEnd;
		this.FtOrigSecs = FtOrigSecs;
		this.FtPrdStart = FtPrdStart;
		this.FtPrdEnd = FtPrdEnd;
		this.FtSecsRemaining = FtSecsRemaining;
		this.FtValueUsed = FtValueUsed;
	};

	private static final int[] fieldSizes = new int[] { 0, FtMsisdnNoSize,
			FtSimNoSize, FtServiceCodeSize, 0, FtTarplanRefSize,
			FtBillCycleSize, 0, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_FLOAT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.FtSubscriberId,
				((this.FtMsisdnNo == null) ? null
						: (this.FtMsisdnNo.length() <= FtMsisdnNoSize) ? this.FtMsisdnNo
								: this.FtMsisdnNo.substring(0,
										this.FtMsisdnNoSize)),
				((this.FtSimNo == null) ? null
						: (this.FtSimNo.length() <= FtSimNoSize) ? this.FtSimNo
								: this.FtSimNo.substring(0, this.FtSimNoSize)),
				((this.FtServiceCode == null) ? null : (this.FtServiceCode
						.length() <= FtServiceCodeSize) ? this.FtServiceCode
						: this.FtServiceCode.substring(0,
								this.FtServiceCodeSize)),
				this.FtDeactDate,
				((this.FtTarplanRef == null) ? null : (this.FtTarplanRef
						.length() <= FtTarplanRefSize) ? this.FtTarplanRef
						: this.FtTarplanRef.substring(0, this.FtTarplanRefSize)),
				((this.FtBillCycle == null) ? null
						: (this.FtBillCycle.length() <= FtBillCycleSize) ? this.FtBillCycle
								: this.FtBillCycle.substring(0,
										this.FtBillCycleSize)),
				this.FtContStart, this.FtContEnd, this.FtOrigSecs,
				this.FtPrdStart, this.FtPrdEnd, this.FtSecsRemaining,
				this.FtValueUsed };
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
		return new DAOArgs(3).arg(this.FtSubscriberId).arg(this.FtMsisdnNo)
				.arg(this.FtServiceCode);
	}

	protected void set(Object[] fields) {
		this.FtSubscriberId = ((Integer) fields[0]);
		this.FtMsisdnNo = rtrim((String) fields[1]);
		this.FtSimNo = rtrim((String) fields[2]);
		this.FtServiceCode = rtrim((String) fields[3]);
		this.FtDeactDate = ((fields[4] == null) ? null : new Date(
				(Date) fields[4]));
		this.FtTarplanRef = rtrim((String) fields[5]);
		this.FtBillCycle = rtrim((String) fields[6]);
		this.FtContStart = ((fields[7] == null) ? null : new Date(
				fields[7]));
		this.FtContEnd = ((fields[8] == null) ? null : new Date(
				 fields[8]));
		this.FtOrigSecs = ((Integer) fields[9]);
		this.FtPrdStart = ((fields[10] == null) ? null : new Date(
				 fields[10]));
		this.FtPrdEnd = ((fields[11] == null) ? null : new Date(
				 fields[11]));
		this.FtSecsRemaining = ((Integer) fields[12]);
		this.FtValueUsed = ((Float) fields[13]);
	}

	public void set(final Integer FtSubscriberId, final String FtMsisdnNo,
			final String FtSimNo, final String FtServiceCode,
			final Date FtDeactDate, final String FtTarplanRef,
			final String FtBillCycle, final Date FtContStart,
			final Date FtContEnd, final Integer FtOrigSecs,
			final Date FtPrdStart, final Date FtPrdEnd,
			final Integer FtSecsRemaining, final Float FtValueUsed) {

		this.FtSubscriberId = FtSubscriberId;
		this.FtMsisdnNo = FtMsisdnNo;
		this.FtSimNo = FtSimNo;
		this.FtServiceCode = FtServiceCode;
		this.FtDeactDate = FtDeactDate;
		this.FtTarplanRef = FtTarplanRef;
		this.FtBillCycle = FtBillCycle;
		this.FtContStart = FtContStart;
		this.FtContEnd = FtContEnd;
		this.FtOrigSecs = FtOrigSecs;
		this.FtPrdStart = FtPrdStart;
		this.FtPrdEnd = FtPrdEnd;
		this.FtSecsRemaining = FtSecsRemaining;
		this.FtValueUsed = FtValueUsed;
	}

	public Integer getFtSubscriberId() {
		return FtSubscriberId;
	}

	public void setFtSubscriberId(Integer ftSubscriberId) {
		FtSubscriberId = ftSubscriberId;
	}

	public String getFtMsisdnNo() {
		return FtMsisdnNo;
	}

	public void setFtMsisdnNo(String ftMsisdnNo) {
		FtMsisdnNo = ftMsisdnNo;
	}

	public String getFtSimNo() {
		return FtSimNo;
	}

	public void setFtSimNo(String ftSimNo) {
		FtSimNo = ftSimNo;
	}

	public String getFtServiceCode() {
		return FtServiceCode;
	}

	public void setFtServiceCode(String ftServiceCode) {
		FtServiceCode = ftServiceCode;
	}

	public Date getFtDeactDate() {
		return FtDeactDate;
	}

	public void setFtDeactDate(Date ftDeactDate) {
		FtDeactDate = ftDeactDate;
	}

	public String getFtTarplanRef() {
		return FtTarplanRef;
	}

	public void setFtTarplanRef(String ftTarplanRef) {
		FtTarplanRef = ftTarplanRef;
	}

	public String getFtBillCycle() {
		return FtBillCycle;
	}

	public void setFtBillCycle(String ftBillCycle) {
		FtBillCycle = ftBillCycle;
	}

	public Date getFtContStart() {
		return FtContStart;
	}

	public void setFtContStart(Date ftContStart) {
		FtContStart = ftContStart;
	}

	public Date getFtContEnd() {
		return FtContEnd;
	}

	public void setFtContEnd(Date ftContEnd) {
		FtContEnd = ftContEnd;
	}

	public Integer getFtOrigSecs() {
		return FtOrigSecs;
	}

	public void setFtOrigSecs(Integer ftOrigSecs) {
		FtOrigSecs = ftOrigSecs;
	}

	public Date getFtPrdStart() {
		return FtPrdStart;
	}

	public void setFtPrdStart(Date ftPrdStart) {
		FtPrdStart = ftPrdStart;
	}

	public Date getFtPrdEnd() {
		return FtPrdEnd;
	}

	public void setFtPrdEnd(Date ftPrdEnd) {
		FtPrdEnd = ftPrdEnd;
	}

	public Integer getFtSecsRemaining() {
		return FtSecsRemaining;
	}

	public void setFtSecsRemaining(Integer ftSecsRemaining) {
		FtSecsRemaining = ftSecsRemaining;
	}

	public Float getFtValueUsed() {
		return FtValueUsed;
	}

	public void setFtValueUsed(Float ftValueUsed) {
		FtValueUsed = ftValueUsed;
	}

}