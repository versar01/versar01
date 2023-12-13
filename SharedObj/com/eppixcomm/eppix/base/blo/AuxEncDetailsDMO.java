package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.util.Date;

public class AuxEncDetailsDMO {
	// Globals
	private String accountNo;
	private String accountStatus;
	private String creditCrd;
	private String creditExp;
	private String statusName;
	private String statusDetail;
	private String vauldId;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getCreditCrd() {
		return creditCrd;
	}

	public void setCreditCrd(String creditCrd) {
		this.creditCrd = creditCrd;
	}

	public String getCreditExp() {
		return creditExp;
	}

	public void setCreditExp(String creditExp) {
		this.creditExp = creditExp;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	public String getVauldId() {
		return vauldId;
	}

	public void setVauldId(String vauldId) {
		this.vauldId = vauldId;
	}

	@Override
	public String toString() {
		return "\nAuxEncDetailsDMO [\naccountNo=" + accountNo + "\naccountStatus="
				+ accountStatus + "\ncreditCrd=" + creditCrd + "\ncreditExp="
				+ creditExp + "\nstatusName=" + statusName + "\nstatusDetail="
				+ statusDetail + "\nvauldId=" + vauldId + "]";
	}

}
