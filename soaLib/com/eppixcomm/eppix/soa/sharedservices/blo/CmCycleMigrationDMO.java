package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class CmCycleMigrationDMO extends DBO implements Serializable {

	private Integer cmSubscriberId;
	private Date cmDate;
	private String cmStatus;
	private String cmOldCycle;
	private String cmNewCycle;
	private String cmCustSwap;
	private String cmOldBillAcNo;
	private String cmNewBillAcNo;
	private Date cmTimestamp;

	public static final int cmSubscriberIdFilter = 0;

	public static final int cmDateFilter = 1;

	public static final int cmStatusFilter = 2;
	private static final int cmStatusSize = 1;

	public static final int cmOldCycleFilter = 3;
	private static final int cmOldCycleSize = 5;

	public static final int cmNewCycleFilter = 4;
	private static final int cmNewCycleSize = 5;

	public static final int cmCustSwapFilter = 5;
	private static final int cmCustSwapSize = 1;

	public static final int cmOldBillAcNoFilter = 6;
	private static final int cmOldBillAcNoSize = 8;

	public static final int cmNewBillAcNoFilter = 7;
	private static final int cmNewBillAcNoSize = 8;

	public static final int cmTimestampFilter = 8;

	public CmCycleMigrationDMO() {
	};

	public CmCycleMigrationDMO(final Integer cmSubscriberId, final Date cmDate,
			final String cmStatus, final String cmOldCycle,
			final String cmNewCycle, final String cmCustSwap,
			final String cmOldBillAcNo, final String cmNewBillAcNo,
			final Date cmTimestamp) {

		this.cmSubscriberId = cmSubscriberId;
		this.cmDate = cmDate;
		this.cmStatus = cmStatus;
		this.cmOldCycle = cmOldCycle;
		this.cmNewCycle = cmNewCycle;
		this.cmCustSwap = cmCustSwap;
		this.cmOldBillAcNo = cmOldBillAcNo;
		this.cmNewBillAcNo = cmNewBillAcNo;
		this.cmTimestamp = cmTimestamp;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, cmStatusSize,
			cmOldCycleSize, cmNewCycleSize, cmCustSwapSize, cmOldBillAcNoSize,
			cmNewBillAcNoSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.cmSubscriberId,
				this.cmDate,
				((this.cmStatus == null) ? null
						: (this.cmStatus.length() <= cmStatusSize) ? this.cmStatus
								: this.cmStatus.substring(0, this.cmStatusSize)),
				((this.cmOldCycle == null) ? null
						: (this.cmOldCycle.length() <= cmOldCycleSize) ? this.cmOldCycle
								: this.cmOldCycle.substring(0,
										this.cmOldCycleSize)),
				((this.cmNewCycle == null) ? null
						: (this.cmNewCycle.length() <= cmNewCycleSize) ? this.cmNewCycle
								: this.cmNewCycle.substring(0,
										this.cmNewCycleSize)),
				((this.cmCustSwap == null) ? null
						: (this.cmCustSwap.length() <= cmCustSwapSize) ? this.cmCustSwap
								: this.cmCustSwap.substring(0,
										this.cmCustSwapSize)),
				((this.cmOldBillAcNo == null) ? null : (this.cmOldBillAcNo
						.length() <= cmOldBillAcNoSize) ? this.cmOldBillAcNo
						: this.cmOldBillAcNo.substring(0,
								this.cmOldBillAcNoSize)),
				((this.cmNewBillAcNo == null) ? null : (this.cmNewBillAcNo
						.length() <= cmNewBillAcNoSize) ? this.cmNewBillAcNo
						: this.cmNewBillAcNo.substring(0,
								this.cmNewBillAcNoSize)), this.cmTimestamp };
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
		this.cmSubscriberId = ((Integer) fields[0]);
		this.cmDate = ((fields[1] == null) ? null : new Date( fields[1]));
		this.cmStatus = rtrim((String) fields[2]);
		this.cmOldCycle = rtrim((String) fields[3]);
		this.cmNewCycle = rtrim((String) fields[4]);
		this.cmCustSwap = rtrim((String) fields[5]);
		this.cmOldBillAcNo = rtrim((String) fields[6]);
		this.cmNewBillAcNo = rtrim((String) fields[7]);
		this.cmTimestamp = ((fields[8] == null) ? null : new Date(
				 fields[8]));
	}

	public void set(final Integer cmSubscriberId, final Date cmDate,
			final String cmStatus, final String cmOldCycle,
			final String cmNewCycle, final String cmCustSwap,
			final String cmOldBillAcNo, final String cmNewBillAcNo,
			final Date cmTimestamp) {

		this.cmSubscriberId = cmSubscriberId;
		this.cmDate = cmDate;
		this.cmStatus = cmStatus;
		this.cmOldCycle = cmOldCycle;
		this.cmNewCycle = cmNewCycle;
		this.cmCustSwap = cmCustSwap;
		this.cmOldBillAcNo = cmOldBillAcNo;
		this.cmNewBillAcNo = cmNewBillAcNo;
		this.cmTimestamp = cmTimestamp;
	}

	public Integer getCmSubscriberId() {
		return cmSubscriberId;
	}

	public void setCmSubscriberId(Integer cmSubscriberId) {
		this.cmSubscriberId = cmSubscriberId;
	}

	public Date getCmDate() {
		return cmDate;
	}

	public void setCmDate(Date cmDate) {
		this.cmDate = cmDate;
	}

	public String getCmStatus() {
		return cmStatus;
	}

	public void setCmStatus(String cmStatus) {
		this.cmStatus = cmStatus;
	}

	public String getCmOldCycle() {
		return cmOldCycle;
	}

	public void setCmOldCycle(String cmOldCycle) {
		this.cmOldCycle = cmOldCycle;
	}

	public String getCmNewCycle() {
		return cmNewCycle;
	}

	public void setCmNewCycle(String cmNewCycle) {
		this.cmNewCycle = cmNewCycle;
	}

	public String getCmCustSwap() {
		return cmCustSwap;
	}

	public void setCmCustSwap(String cmCustSwap) {
		this.cmCustSwap = cmCustSwap;
	}

	public String getCmOldBillAcNo() {
		return cmOldBillAcNo;
	}

	public void setCmOldBillAcNo(String cmOldBillAcNo) {
		this.cmOldBillAcNo = cmOldBillAcNo;
	}

	public String getCmNewBillAcNo() {
		return cmNewBillAcNo;
	}

	public void setCmNewBillAcNo(String cmNewBillAcNo) {
		this.cmNewBillAcNo = cmNewBillAcNo;
	}

	public Date getCmTimestamp() {
		return cmTimestamp;
	}

	public void setCmTimestamp(Date cmTimestamp) {
		this.cmTimestamp = cmTimestamp;
	}

}
