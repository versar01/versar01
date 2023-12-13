package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class BlhVamSbdNmDQO extends DBO implements Serializable {
	
	private Integer blhSubscriberId;
	private Double blhBillLimitVal;
	private String vamMsisdnNo;
	private String sbdPackageCode;
	private String sbdTariffPlan;

	public static final int blhSubscriberIdFilter = 0;

	public static final int blhBillLimitValFilter = 1;

	public static final int vamMsisdnNoFilter = 2;
	private static final int vamMsisdnNoSize = 16;

	public static final int sbdPackageCodeFilter = 3;
	private static final int sbdPackageCodeSize = 6;

	public static final int sbdTariffPlanFilter = 4;
	private static final int sbdTariffPlanSize = 20;

	public BlhVamSbdNmDQO() {
	};

	public BlhVamSbdNmDQO(final Integer blhSubscriberId, final Double blhBillLimitVal, final String vamMsisdnNo,
			final String sbdPackageCode, final String sbdTariffPlan) {

		this.blhSubscriberId = blhSubscriberId;
		this.blhBillLimitVal = blhBillLimitVal;
		this.vamMsisdnNo = vamMsisdnNo;
		this.sbdPackageCode = sbdPackageCode;
		this.sbdTariffPlan = sbdTariffPlan;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, vamMsisdnNoSize, sbdPackageCodeSize, sbdTariffPlanSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.blhSubscriberId, this.blhBillLimitVal,
				((this.vamMsisdnNo == null) ? null
						: (this.vamMsisdnNo.length() <= vamMsisdnNoSize) ? this.vamMsisdnNo
								: this.vamMsisdnNo.substring(0, this.vamMsisdnNoSize)),
				((this.sbdPackageCode == null) ? null
						: (this.sbdPackageCode.length() <= sbdPackageCodeSize) ? this.sbdPackageCode
								: this.sbdPackageCode.substring(0, this.sbdPackageCodeSize)),
				((this.sbdTariffPlan == null) ? null
						: (this.sbdTariffPlan.length() <= sbdTariffPlanSize) ? this.sbdTariffPlan
								: this.sbdTariffPlan.substring(0, this.sbdTariffPlanSize)), };
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
		this.blhSubscriberId = ((Integer) fields[0]);
		this.blhBillLimitVal = ((Double) fields[1]);
		this.vamMsisdnNo = rtrim((String) fields[2]);
		this.sbdPackageCode = rtrim((String) fields[3]);
		this.sbdTariffPlan = rtrim((String) fields[4]);
	}

	public void set(final Integer blhSubscriberId, final Double blhBillLimitVal, final String vamMsisdnNo,
			final String sbdPackageCode, final String sbdTariffPlan) {

		this.blhSubscriberId = blhSubscriberId;
		this.blhBillLimitVal = blhBillLimitVal;
		this.vamMsisdnNo = vamMsisdnNo;
		this.sbdPackageCode = sbdPackageCode;
		this.sbdTariffPlan = sbdTariffPlan;
	}


	public Integer getBlhSubscriberId() {
		return blhSubscriberId;
	}

	public void setBlhSubscriberId(Integer blhSubscriberId) {
		this.blhSubscriberId = blhSubscriberId;
	}

	public Double getBlhBillLimitVal() {
		return blhBillLimitVal;
	}

	public void setBlhBillLimitVal(Double blhBillLimitVal) {
		this.blhBillLimitVal = blhBillLimitVal;
	}

	public String getVamMsisdnNo() {
		return vamMsisdnNo;
	}

	public void setVamMsisdnNo(String vamMsisdnNo) {
		this.vamMsisdnNo = vamMsisdnNo;
	}

	public String getSbdPackageCode() {
		return sbdPackageCode;
	}

	public void setSbdPackageCode(String sbdPackageCode) {
		this.sbdPackageCode = sbdPackageCode;
	}

	public String getSbdTariffPlan() {
		return sbdTariffPlan;
	}

	public void setSbdTariffPlan(String sbdTariffPlan) {
		this.sbdTariffPlan = sbdTariffPlan;
	}

	@Override
	public String toString() {
		return "\nBlhVamSbdNmDQO [\nblhSubscriberId=" + blhSubscriberId + "\nblhBillLimitVal=" + blhBillLimitVal
				+ "\nvamMsisdnNo=" + vamMsisdnNo + "\nsbdPackageCode=" + sbdPackageCode + "\nsbdTariffPlan="
				+ sbdTariffPlan + "]";
	}
}
