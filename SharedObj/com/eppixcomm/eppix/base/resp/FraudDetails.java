package com.eppixcomm.eppix.base.resp;

public class FraudDetails {
	// Globals
	String billAacNo;
	String accountStatus;
	String mtnStatus;
	Integer fraudSubs;
	Integer suspFraudSubs;

	public String getBillAacNo() {
		return billAacNo;
	}

	public void setBillAacNo(String billAacNo) {
		this.billAacNo = billAacNo;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getMtnStatus() {
		return mtnStatus;
	}

	public void setMtnStatus(String mtnStatus) {
		this.mtnStatus = mtnStatus;
	}

	public Integer getFraudSubs() {
		return fraudSubs;
	}

	public void setFraudSubs(Integer fraudSubs) {
		this.fraudSubs = fraudSubs;
	}

	public Integer getSuspFraudSubs() {
		return suspFraudSubs;
	}

	public void setSuspFraudSubs(Integer suspFraudSubs) {
		this.suspFraudSubs = suspFraudSubs;
	}

	@Override
	public String toString() {
		return "\nFraudDetails [\nbillAacNo=" + billAacNo + "\naccountStatus="
				+ accountStatus + "\nmtnStatus=" + mtnStatus + "\nfraudSubs="
				+ fraudSubs + "\nsuspFraudSubs=" + suspFraudSubs + "]";
	}

}
