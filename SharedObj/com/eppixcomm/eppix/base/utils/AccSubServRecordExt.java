package com.eppixcomm.eppix.base.utils;

public class AccSubServRecordExt extends AccSubServRecord {
	private String tsChargePeriod;
	private String tsChargeFreq;
	private String billCycle;

	public String getTsChargePeriod() {
		return tsChargePeriod;
	}

	public void setTsChargePeriod(String tsChargePeriod) {
		this.tsChargePeriod = tsChargePeriod;
	}

	public String getTsChargeFreq() {
		return tsChargeFreq;
	}

	public void setTsChargeFreq(String tsChargeFreq) {
		this.tsChargeFreq = tsChargeFreq;
	}

	public String getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

}
