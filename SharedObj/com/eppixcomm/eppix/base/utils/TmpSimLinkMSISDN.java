package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.common.util.Date;

public class TmpSimLinkMSISDN {
	private String simSimNo;
	private String simMSISDN;
	private String simNewTariff;
	private String simOldTariff;
	private Integer simActualPeriod;
	private Date simTerminatNotif;
	private Date simContractTerm;
	private String simSimStatus;
	
	
	public String getSimSimNo() {
		return simSimNo;
	}
	public void setSimSimNo(String simSimNo) {
		this.simSimNo = simSimNo;
	}
	public String getSimMSISDN() {
		return simMSISDN;
	}
	public void setSimMSISDN(String simMSISDN) {
		this.simMSISDN = simMSISDN;
	}
	public String getSimNewTariff() {
		return simNewTariff;
	}
	public void setSimNewTariff(String simNewTariff) {
		this.simNewTariff = simNewTariff;
	}
	public String getSimOldTariff() {
		return simOldTariff;
	}
	public void setSimOldTariff(String simOldTariff) {
		this.simOldTariff = simOldTariff;
	}
	public Integer getSimActualPeriod() {
		return simActualPeriod;
	}
	public void setSimActualPeriod(Integer simActualPeriod) {
		this.simActualPeriod = simActualPeriod;
	}
	public Date getSimTerminatNotif() {
		return simTerminatNotif;
	}
	public void setSimTerminatNotif(Date simTerminatNotif) {
		this.simTerminatNotif = simTerminatNotif;
	}
	public Date getSimContractTerm() {
		return simContractTerm;
	}
	public void setSimContractTerm(Date simContractTerm) {
		this.simContractTerm = simContractTerm;
	}
	public String getSimSimStatus() {
		return simSimStatus;
	}
	public void setSimSimStatus(String simSimStatus) {
		this.simSimStatus = simSimStatus;
	}
	

}
