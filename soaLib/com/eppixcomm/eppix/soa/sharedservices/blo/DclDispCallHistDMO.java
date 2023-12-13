package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class DclDispCallHistDMO extends DBO implements Serializable {

	private Integer dclDisputeKey;
	private Integer dclCallSerial;
	private String dclCycle;
	private Date dclBillTabDate;
	private Double dclDisputeValue;
	private Short dclDisputeStatus;

	public static final int dclDisputeKeyFilter = 0;

	public static final int dclCallSerialFilter = 1;

	public static final int dclCycleFilter = 2;
	private static final int dclCycleSize = 5;

	public static final int dclBillTabDateFilter = 3;

	public static final int dclDisputeValueFilter = 4;

	public static final int dclDisputeStatusFilter = 5;

	public DclDispCallHistDMO() {
	};

	public DclDispCallHistDMO(final Integer dclDisputeKey,
			final Integer dclCallSerial, final String dclCycle,
			final Date dclBillTabDate, final Double dclDisputeValue,
			final Short dclDisputeStatus) {

		this.dclDisputeKey = dclDisputeKey;
		this.dclCallSerial = dclCallSerial;
		this.dclCycle = dclCycle;
		this.dclBillTabDate = dclBillTabDate;
		this.dclDisputeValue = dclDisputeValue;
		this.dclDisputeStatus = dclDisputeStatus;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, dclCycleSize, 0,
			0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_FLOAT, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dclDisputeKey,
				this.dclCallSerial,
				((this.dclCycle == null) ? null
						: (this.dclCycle.length() <= dclCycleSize) ? this.dclCycle
								: this.dclCycle.substring(0, this.dclCycleSize)),
				this.dclBillTabDate, this.dclDisputeValue,
				this.dclDisputeStatus };
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
		return new DAOArgs(2).arg(this.dclDisputeKey).arg(this.dclCallSerial);
	}

	protected void set(Object[] fields) {
		this.dclDisputeKey = ((Integer) fields[0]);
		this.dclCallSerial = ((Integer) fields[1]);
		this.dclCycle = rtrim((String) fields[2]);
		this.dclBillTabDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.dclDisputeValue = ((Double) fields[4]);
		this.dclDisputeStatus = ((Short) fields[5]);
	}

	public void set(final Integer dclDisputeKey, final Integer dclCallSerial,
			final String dclCycle, final Date dclBillTabDate,
			final Double dclDisputeValue, final Short dclDisputeStatus) {

		this.dclDisputeKey = dclDisputeKey;
		this.dclCallSerial = dclCallSerial;
		this.dclCycle = dclCycle;
		this.dclBillTabDate = dclBillTabDate;
		this.dclDisputeValue = dclDisputeValue;
		this.dclDisputeStatus = dclDisputeStatus;
	}

	public Integer getDclDisputeKey() {
		return dclDisputeKey;
	}

	public void setDclDisputeKey(Integer dclDisputeKey) {
		this.dclDisputeKey = dclDisputeKey;
	}

	public Integer getDclCallSerial() {
		return dclCallSerial;
	}

	public void setDclCallSerial(Integer dclCallSerial) {
		this.dclCallSerial = dclCallSerial;
	}

	public String getDclCycle() {
		return dclCycle;
	}

	public void setDclCycle(String dclCycle) {
		this.dclCycle = dclCycle;
	}

	public Date getDclBillTabDate() {
		return dclBillTabDate;
	}

	public void setDclBillTabDate(Date dclBillTabDate) {
		this.dclBillTabDate = dclBillTabDate;
	}

	public Double getDclDisputeValue() {
		return dclDisputeValue;
	}

	public void setDclDisputeValue(Double dclDisputeValue) {
		this.dclDisputeValue = dclDisputeValue;
	}

	public Short getDclDisputeStatus() {
		return dclDisputeStatus;
	}

	public void setDclDisputeStatus(Short dclDisputeStatus) {
		this.dclDisputeStatus = dclDisputeStatus;
	}

}
