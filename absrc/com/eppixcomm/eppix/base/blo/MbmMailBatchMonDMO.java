package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class MbmMailBatchMonDMO extends DBO implements Serializable {

	private Integer mbmId;
	private String mbmProgramName;
	private DateTime mbmStartDate;
	private DateTime mbmEndDate;
	private DateTime mbmTimestamp;

	public static final int mbmIdFilter = 0;
	private static final int mbmIdSize = 57;

	public static final int mbmProgramNameFilter = 1;
	private static final int mbmProgramNameSize = 100;

	public static final int mbmStartDateFilter = 2;

	public static final int mbmEndDateFilter = 3;

	public static final int mbmTimestampFilter = 4;

	public MbmMailBatchMonDMO() {
	};

	public MbmMailBatchMonDMO(final Integer mbmId, final String mbmProgramName,
			final DateTime mbmStartDate, final DateTime mbmEndDate,
			final DateTime mbmTimestamp) {

		this.mbmId = mbmId;
		this.mbmProgramName = mbmProgramName;
		this.mbmStartDate = mbmStartDate;
		this.mbmEndDate = mbmEndDate;
		this.mbmTimestamp = mbmTimestamp;
	};

	private static final int[] fieldSizes = new int[] { mbmIdSize,
			mbmProgramNameSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_DATETIME,
			FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.mbmId,
				((this.mbmProgramName == null) ? null : (this.mbmProgramName
						.length() <= mbmProgramNameSize) ? this.mbmProgramName
						: this.mbmProgramName.substring(0,
								this.mbmProgramNameSize)), this.mbmStartDate,
				this.mbmEndDate, this.mbmTimestamp };
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
		return new DAOArgs(1).arg(this.mbmId);
	}

	protected void set(Object[] fields) {
		this.mbmId = (Integer) fields[0];
		this.mbmProgramName = rtrim((String) fields[1]);
		this.mbmStartDate = ((fields[2] == null) ? null : new DateTime(
				(DateTime) fields[2]));
		this.mbmEndDate = ((fields[3] == null) ? null : new DateTime(
				(DateTime) fields[3]));
		this.mbmTimestamp = ((fields[4] == null) ? null : new DateTime(
				(DateTime) fields[4]));
	}

	public void set(final Integer mbmId, final String mbmProgramName,
			final DateTime mbmStartDate, final DateTime mbmEndDate,
			final DateTime mbmTimestamp) {

		this.mbmId = mbmId;
		this.mbmProgramName = mbmProgramName;
		this.mbmStartDate = mbmStartDate;
		this.mbmEndDate = mbmEndDate;
		this.mbmTimestamp = mbmTimestamp;
	}

	public Integer getMbmId() {
		return mbmId;
	}

	public void setMbmId(Integer mbmId) {
		this.mbmId = mbmId;
	}

	public String getMbmProgramName() {
		return mbmProgramName;
	}

	public void setMbmProgramName(String mbmProgramName) {
		this.mbmProgramName = mbmProgramName;
	}

	public DateTime getMbmStartDate() {
		return mbmStartDate;
	}

	public void setMbmStartDate(DateTime mbmStartDate) {
		this.mbmStartDate = mbmStartDate;
	}

	public DateTime getMbmEndDate() {
		return mbmEndDate;
	}

	public void setMbmEndDate(DateTime mbmEndDate) {
		this.mbmEndDate = mbmEndDate;
	}

	public DateTime getMbmTimestamp() {
		return mbmTimestamp;
	}

	public void setMbmTimestamp(DateTime mbmTimestamp) {
		this.mbmTimestamp = mbmTimestamp;
	}

}