package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class CpoCplanOpenDMO extends DBO implements Serializable {

	private String cpoBillAcNo;
	private String cpoPlan;
	private Short cpoVerId;
	private String cpoTrigger;
	private Date cpoActDate;
	private Date cpoLastMdate;
	private Short cpoLastMilestone;
	private Short cpoStatus;
	private Date cpoStatusDate;
	private String cpoInitiatedInd;
	private Date cpoCreateDate;
	private String cpoSuspFts;

	public static final int cpoBillAcNoFilter = 0;
	private static final int cpoBillAcNoSize = 8;

	public static final int cpoPlanFilter = 1;
	private static final int cpoPlanSize = 5;

	public static final int cpoVerIdFilter = 2;

	public static final int cpoTriggerFilter = 3;
	private static final int cpoTriggerSize = 3;

	public static final int cpoActDateFilter = 4;

	public static final int cpoLastMdateFilter = 5;

	public static final int cpoLastMilestoneFilter = 6;

	public static final int cpoStatusFilter = 7;

	public static final int cpoStatusDateFilter = 8;

	public static final int cpoInitiatedIndFilter = 9;
	private static final int cpoInitiatedIndSize = 1;

	public static final int cpoCreateDateFilter = 10;

	public static final int cpoSuspFtsFilter = 11;
	private static final int cpoSuspFtsSize = 1;

	public CpoCplanOpenDMO() {
	};

	public CpoCplanOpenDMO(final String cpoBillAcNo, final String cpoPlan,
			final Short cpoVerId, final String cpoTrigger,
			final Date cpoActDate, final Date cpoLastMdate,
			final Short cpoLastMilestone, final Short cpoStatus,
			final Date cpoStatusDate, final String cpoInitiatedInd,
			final Date cpoCreateDate, final String cpoSuspFts) {

		this.cpoBillAcNo = cpoBillAcNo;
		this.cpoPlan = cpoPlan;
		this.cpoVerId = cpoVerId;
		this.cpoTrigger = cpoTrigger;
		this.cpoActDate = cpoActDate;
		this.cpoLastMdate = cpoLastMdate;
		this.cpoLastMilestone = cpoLastMilestone;
		this.cpoStatus = cpoStatus;
		this.cpoStatusDate = cpoStatusDate;
		this.cpoInitiatedInd = cpoInitiatedInd;
		this.cpoCreateDate = cpoCreateDate;
		this.cpoSuspFts = cpoSuspFts;
	};

	private static final int[] fieldSizes = new int[] { cpoBillAcNoSize,
			cpoPlanSize, 0, cpoTriggerSize, 0, 0, 0, 0, 0, cpoInitiatedIndSize,
			0, cpoSuspFtsSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.cpoBillAcNo == null) ? null
						: (this.cpoBillAcNo.length() <= cpoBillAcNoSize) ? this.cpoBillAcNo
								: this.cpoBillAcNo.substring(0,
										this.cpoBillAcNoSize)),
				((this.cpoPlan == null) ? null
						: (this.cpoPlan.length() <= cpoPlanSize) ? this.cpoPlan
								: this.cpoPlan.substring(0, this.cpoPlanSize)),
				this.cpoVerId,
				((this.cpoTrigger == null) ? null
						: (this.cpoTrigger.length() <= cpoTriggerSize) ? this.cpoTrigger
								: this.cpoTrigger.substring(0,
										this.cpoTriggerSize)),
				this.cpoActDate,
				this.cpoLastMdate,
				this.cpoLastMilestone,
				this.cpoStatus,
				this.cpoStatusDate,
				((this.cpoInitiatedInd == null) ? null
						: (this.cpoInitiatedInd.length() <= cpoInitiatedIndSize) ? this.cpoInitiatedInd
								: this.cpoInitiatedInd.substring(0,
										this.cpoInitiatedIndSize)),
				this.cpoCreateDate,
				((this.cpoSuspFts == null) ? null
						: (this.cpoSuspFts.length() <= cpoSuspFtsSize) ? this.cpoSuspFts
								: this.cpoSuspFts.substring(0,
										this.cpoSuspFtsSize)) };
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
		this.cpoBillAcNo = rtrim((String) fields[0]);
		this.cpoPlan = rtrim((String) fields[1]);
		this.cpoVerId = ((Short) fields[2]);
		this.cpoTrigger = rtrim((String) fields[3]);
		this.cpoActDate = ((fields[4] == null) ? null : new Date(fields[4]));
		this.cpoLastMdate = ((fields[5] == null) ? null : new Date(fields[5]));
		this.cpoLastMilestone = ((Short) fields[6]);
		this.cpoStatus = ((Short) fields[7]);
		this.cpoStatusDate = ((fields[8] == null) ? null : new Date(fields[8]));
		this.cpoInitiatedInd = rtrim((String) fields[9]);
		this.cpoCreateDate = ((fields[10] == null) ? null
				: new Date(fields[10]));
		this.cpoSuspFts = rtrim((String) fields[11]);
	}

	public void set(final String cpoBillAcNo, final String cpoPlan,
			final Short cpoVerId, final String cpoTrigger,
			final Date cpoActDate, final Date cpoLastMdate,
			final Short cpoLastMilestone, final Short cpoStatus,
			final Date cpoStatusDate, final String cpoInitiatedInd,
			final Date cpoCreateDate, final String cpoSuspFts) {

		this.cpoBillAcNo = cpoBillAcNo;
		this.cpoPlan = cpoPlan;
		this.cpoVerId = cpoVerId;
		this.cpoTrigger = cpoTrigger;
		this.cpoActDate = cpoActDate;
		this.cpoLastMdate = cpoLastMdate;
		this.cpoLastMilestone = cpoLastMilestone;
		this.cpoStatus = cpoStatus;
		this.cpoStatusDate = cpoStatusDate;
		this.cpoInitiatedInd = cpoInitiatedInd;
		this.cpoCreateDate = cpoCreateDate;
		this.cpoSuspFts = cpoSuspFts;
	}

	public String getCpoBillAcNo() {
		return cpoBillAcNo;
	}

	public void setCpoBillAcNo(String cpoBillAcNo) {
		this.cpoBillAcNo = cpoBillAcNo;
	}

	public String getCpoPlan() {
		return cpoPlan;
	}

	public void setCpoPlan(String cpoPlan) {
		this.cpoPlan = cpoPlan;
	}

	public Short getCpoVerId() {
		return cpoVerId;
	}

	public void setCpoVerId(Short cpoVerId) {
		this.cpoVerId = cpoVerId;
	}

	public String getCpoTrigger() {
		return cpoTrigger;
	}

	public void setCpoTrigger(String cpoTrigger) {
		this.cpoTrigger = cpoTrigger;
	}

	public Date getCpoActDate() {
		return cpoActDate;
	}

	public void setCpoActDate(Date cpoActDate) {
		this.cpoActDate = cpoActDate;
	}

	public Date getCpoLastMdate() {
		return cpoLastMdate;
	}

	public void setCpoLastMdate(Date cpoLastMdate) {
		this.cpoLastMdate = cpoLastMdate;
	}

	public Short getCpoLastMilestone() {
		return cpoLastMilestone;
	}

	public void setCpoLastMilestone(Short cpoLastMilestone) {
		this.cpoLastMilestone = cpoLastMilestone;
	}

	public Short getCpoStatus() {
		return cpoStatus;
	}

	public void setCpoStatus(Short cpoStatus) {
		this.cpoStatus = cpoStatus;
	}

	public Date getCpoStatusDate() {
		return cpoStatusDate;
	}

	public void setCpoStatusDate(Date cpoStatusDate) {
		this.cpoStatusDate = cpoStatusDate;
	}

	public String getCpoInitiatedInd() {
		return cpoInitiatedInd;
	}

	public void setCpoInitiatedInd(String cpoInitiatedInd) {
		this.cpoInitiatedInd = cpoInitiatedInd;
	}

	public Date getCpoCreateDate() {
		return cpoCreateDate;
	}

	public void setCpoCreateDate(Date cpoCreateDate) {
		this.cpoCreateDate = cpoCreateDate;
	}

	public String getCpoSuspFts() {
		return cpoSuspFts;
	}

	public void setCpoSuspFts(String cpoSuspFts) {
		this.cpoSuspFts = cpoSuspFts;
	}

}
