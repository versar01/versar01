package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class DcsDealCallSummDMO extends DBO implements Serializable {

	private String dcsDealerId;
	private String dcsSimNo;
	private Short dcsMonth;
	private Short dcsYear;
	private Double dcsTotalCharge;
	private Integer dcsTotalDuration;
	private Short dcsTotalCalls;
	private Integer dcsCommissionRun;

	public static final int dcsDealerIdFilter = 0;
	private static final int dcsDealerIdSize = 8;

	public static final int dcsSimNoFilter = 1;
	private static final int dcsSimNoSize = 14;

	public static final int dcsMonthFilter = 2;

	public static final int dcsYearFilter = 3;

	public static final int dcsTotalChargeFilter = 4;

	public static final int dcsTotalDurationFilter = 5;

	public static final int dcsTotalCallsFilter = 6;

	public static final int dcsCommissionRunFilter = 7;

	public DcsDealCallSummDMO() {
	};

	public DcsDealCallSummDMO(final String dcsDealerId, final String dcsSimNo,
			final Short dcsMonth, final Short dcsYear,
			final Double dcsTotalCharge, final Integer dcsTotalDuration,
			final Short dcsTotalCalls, final Integer dcsCommissionRun) {

		this.dcsDealerId = dcsDealerId;
		this.dcsSimNo = dcsSimNo;
		this.dcsMonth = dcsMonth;
		this.dcsYear = dcsYear;
		this.dcsTotalCharge = dcsTotalCharge;
		this.dcsTotalDuration = dcsTotalDuration;
		this.dcsTotalCalls = dcsTotalCalls;
		this.dcsCommissionRun = dcsCommissionRun;
	};

	private static final int[] fieldSizes = new int[] { dcsDealerIdSize,
			dcsSimNoSize, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_INTEGER, FIELD_TYPE_SHORT,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.dcsDealerId == null) ? null
						: (this.dcsDealerId.length() <= dcsDealerIdSize) ? this.dcsDealerId
								: this.dcsDealerId.substring(0,
										this.dcsDealerIdSize)),
				((this.dcsSimNo == null) ? null
						: (this.dcsSimNo.length() <= dcsSimNoSize) ? this.dcsSimNo
								: this.dcsSimNo.substring(0, this.dcsSimNoSize)),
				this.dcsMonth, this.dcsYear, this.dcsTotalCharge,
				this.dcsTotalDuration, this.dcsTotalCalls,
				this.dcsCommissionRun };
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
		return new DAOArgs(3).arg(this.dcsSimNo).arg(this.dcsMonth)
				.arg(this.dcsYear);
	}

	protected void set(Object[] fields) {
		this.dcsDealerId = rtrim((String) fields[0]);
		this.dcsSimNo = rtrim((String) fields[1]);
		this.dcsMonth = ((Short) fields[2]);
		this.dcsYear = ((Short) fields[3]);
		this.dcsTotalCharge = ((Double) fields[4]);
		this.dcsTotalDuration = ((Integer) fields[5]);
		this.dcsTotalCalls = ((Short) fields[6]);
		this.dcsCommissionRun = ((Integer) fields[7]);
	}

	public void set(final String dcsDealerId, final String dcsSimNo,
			final Short dcsMonth, final Short dcsYear,
			final Double dcsTotalCharge, final Integer dcsTotalDuration,
			final Short dcsTotalCalls, final Integer dcsCommissionRun) {

		this.dcsDealerId = dcsDealerId;
		this.dcsSimNo = dcsSimNo;
		this.dcsMonth = dcsMonth;
		this.dcsYear = dcsYear;
		this.dcsTotalCharge = dcsTotalCharge;
		this.dcsTotalDuration = dcsTotalDuration;
		this.dcsTotalCalls = dcsTotalCalls;
		this.dcsCommissionRun = dcsCommissionRun;
	}

	public String getDcsDealerId() {
		return dcsDealerId;
	}

	public void setDcsDealerId(String dcsDealerId) {
		this.dcsDealerId = dcsDealerId;
	}

	public String getDcsSimNo() {
		return dcsSimNo;
	}

	public void setDcsSimNo(String dcsSimNo) {
		this.dcsSimNo = dcsSimNo;
	}

	public Short getDcsMonth() {
		return dcsMonth;
	}

	public void setDcsMonth(Short dcsMonth) {
		this.dcsMonth = dcsMonth;
	}

	public Short getDcsYear() {
		return dcsYear;
	}

	public void setDcsYear(Short dcsYear) {
		this.dcsYear = dcsYear;
	}

	public Double getDcsTotalCharge() {
		return dcsTotalCharge;
	}

	public void setDcsTotalCharge(Double dcsTotalCharge) {
		this.dcsTotalCharge = dcsTotalCharge;
	}

	public Integer getDcsTotalDuration() {
		return dcsTotalDuration;
	}

	public void setDcsTotalDuration(Integer dcsTotalDuration) {
		this.dcsTotalDuration = dcsTotalDuration;
	}

	public Short getDcsTotalCalls() {
		return dcsTotalCalls;
	}

	public void setDcsTotalCalls(Short dcsTotalCalls) {
		this.dcsTotalCalls = dcsTotalCalls;
	}

	public Integer getDcsCommissionRun() {
		return dcsCommissionRun;
	}

	public void setDcsCommissionRun(Integer dcsCommissionRun) {
		this.dcsCommissionRun = dcsCommissionRun;
	}

}
