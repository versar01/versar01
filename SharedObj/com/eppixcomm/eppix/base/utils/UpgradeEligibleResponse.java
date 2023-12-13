package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import com.eppixcomm.eppix.base.resp.EppixResponse;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

@XmlType(propOrder = { "upgPackcode", "upgPackname", "upgTariffcode", "upgTariffname", "upgCollplan", "upgPayplan", "upgCustomertype", "upgAccountstatus", "upgMtnstatus", "upgCrmvalue", "upgAgingbucket", "upgContractlen", "upgPerserved", "upgDormantperiod", "upgPendingsimact", "upgAvespend", "upgEligdate", "upgEligFlag", "upgReason", "upgOverwrite" })
public class UpgradeEligibleResponse extends EppixResponse {
	private String upgPackcode;
	private String upgPackname;
	private String upgTariffcode;
	private String upgTariffname;
	private String upgCollplan;
	private String upgPayplan;
	private String upgCustomertype;
	private String upgAccountstatus;
	private String upgMtnstatus;
	private String upgCrmvalue;
	private String upgAgingbucket;
	private Integer upgContractlen;
	private Integer upgPerserved;
	private Integer upgDormantperiod;
	private int upgPendingsimact;
	private BigDecimal upgAvespend;
	private String upgEligdate;
	private String upgEligFlag;
	private String upgReason;
	private String upgOverwrite;

	public String getUpgPackcode() {
		return (upgPackcode == null) ? "" : upgPackcode.trim();
	}

	public void setUpgPackcode(String upgPackcode) {
		this.upgPackcode = upgPackcode;
	}

	public String getUpgPackname() {
		return (upgPackname == null) ? "" : upgPackname.trim();
	}

	public void setUpgPackname(String upgPackname) {
		this.upgPackname = upgPackname;
	}

	public String getUpgTariffcode() {
		return (upgTariffcode == null) ? "" : upgTariffcode.trim();
	}

	public void setUpgTariffcode(String upgTariffcode) {
		this.upgTariffcode = upgTariffcode;
	}

	public String getUpgTariffname() {
		return (upgTariffname == null) ? "" : upgTariffname.trim();
	}

	public void setUpgTariffname(String upgTariffname) {
		this.upgTariffname = upgTariffname;
	}

	public String getUpgCollplan() {
		return (upgCollplan == null) ? "" : upgCollplan.trim();
	}

	public void setUpgCollplan(String upgCollplan) {
		this.upgCollplan = upgCollplan;
	}

	public String getUpgPayplan() {
		return (upgPayplan == null) ? "" : upgPayplan.trim();
	}

	public void setUpgPayplan(String upgPayplan) {
		this.upgPayplan = upgPayplan;
	}

	public String getUpgCustomertype() {
		return (upgCustomertype == null) ? "" : upgCustomertype.trim();
	}

	public void setUpgCustomertype(String upgCustomertype) {
		this.upgCustomertype = upgCustomertype;
	}

	public String getUpgAccountstatus() {
		return (upgAccountstatus == null) ? "" : upgAccountstatus.trim();
	}

	public void setUpgAccountstatus(String upgAccountstatus) {
		this.upgAccountstatus = upgAccountstatus;
	}

	public String getUpgMtnstatus() {
		return (upgMtnstatus == null) ? "" : upgMtnstatus.trim();
	}

	public void setUpgMtnstatus(String upgMtnstatus) {
		this.upgMtnstatus = upgMtnstatus;
	}

	public String getUpgCrmvalue() {
		return (upgCrmvalue == null) ? "" : upgCrmvalue.trim();
	}

	public void setUpgCrmvalue(String upgCrmvalue) {
		this.upgCrmvalue = upgCrmvalue;
	}

	public String getUpgAgingbucket() {
		return (upgAgingbucket == null) ? "" : upgAgingbucket.trim();
	}

	public void setUpgAgingbucket(String upgAgingbucket) {
		this.upgAgingbucket = upgAgingbucket;
	}

	public Integer getUpgContractlen() {
		return (upgContractlen == null) ? new Integer(0) : upgContractlen;
	}

	public void setUpgContractlen(Integer upgContractlen) {
		this.upgContractlen = upgContractlen;
	}

	public Integer getUpgPerserved() {
		return (upgPerserved == null) ? new Integer(0) : upgPerserved;
	}

	public void setUpgPerserved(Integer upgPerserved) {
		this.upgPerserved = upgPerserved;
	}

	public Integer getUpgDormantperiod() {
		return upgDormantperiod;
	}

	public void setUpgDormantperiod(Integer upgDormantperiod) {
		this.upgDormantperiod = upgDormantperiod;
	}

	public int getUpgPendingsimact() {
		return upgPendingsimact;
	}

	public void setUpgPendingsimact(int upgPendingsimact) {
		this.upgPendingsimact = upgPendingsimact;
	}

	public BigDecimal getUpgAvespend() {
		return upgAvespend;
	}

	public void setUpgAvespend(BigDecimal upgAvespend) {
		this.upgAvespend = upgAvespend;
	}

	public String getUpgEligdate() {
		return (upgEligdate == null) ? "" : upgEligdate.trim();
	}

	public void setUpgEligdate(String upgEligdate) {
		this.upgEligdate = upgEligdate;
	}

	public String getUpgEligFlag() {
		return (upgEligFlag == null) ? "" : upgEligFlag.trim();
	}

	public void setUpgEligFlag(String upgEligFlag) {
		this.upgEligFlag = upgEligFlag;
	}

	public String getUpgReason() {
		return (upgReason == null) ? "" : upgReason.trim();
	}

	public void setUpgReason(String upgReason) {
		this.upgReason = upgReason;
	}

	public String getUpgOverwrite() {
		return (upgOverwrite == null) ? "" : upgOverwrite.trim();
	}

	public void setUpgOverwrite(String upgOverwrite) {
		this.upgOverwrite = upgOverwrite;
	}

	@Override
	public String toString() {
		return "\nUpgradeEligibleData [upgPackcode=" + upgPackcode + "\nupgPackname=" + upgPackname + "\nupgTariffcode="
				+ upgTariffcode + "\nupgTariffname=" + upgTariffname + "\nupgCollplan=" + upgCollplan + "\nupgPayplan="
				+ upgPayplan + "\nupgCustomertype=" + upgCustomertype + "\nupgAccountstatus=" + upgAccountstatus
				+ "\nupgMtnstatus=" + upgMtnstatus + "\nupgCrmvalue=" + upgCrmvalue + "\nupgAgingbucket="
				+ upgAgingbucket + "\nupgContractlen=" + upgContractlen + "\nupgPerserved=" + upgPerserved
				+ "\nupgDormantperiod=" + upgDormantperiod + "\nupgPendingsimact=" + upgPendingsimact + "\nupgAvespend="
				+ upgAvespend + "\nupgEligdate=" + upgEligdate + "\nupgEligFlag=" + upgEligFlag + "\nupgReason="
				+ upgReason + "\nupgOverwrite=" + upgOverwrite + "]";
	}
}
