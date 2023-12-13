package com.eppixcomm.eppix.base.utils;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "accountNo", "fieldID", "historyCode", "oldValue", "newValue", "userID", "terminalID", "historyDate", "historyDesc" })
public class CustomerHistoryDetails {
	// Globals
	private String accountNo;	//Account Number	string	char	8	No	A0000000
	private Integer fieldID;				//History Field ID	integer	integer		Yes	1
	private String historyCode; 		//History Code	string	char	10	No	EDMC
	private String oldValue; 			//Old Value	string	char	50	Yes	Type :INVOICE    :delivery :PRINT : format : bin
	private String newValue; 			//New Value	string	char	50	Yes	
	private String userID;				//User ID	string	char	10	No	HELSERVER
	private String terminalID;			//Terminal ID	string	char	10	No	zanldhelav
	private String historyDate;			//Date Time of History Creation	string	datetime	(year to second)	No	2013-08-11 04:13:29
	private String historyDesc; 		//History Description	string	char	32	No	Delivery method created
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getFieldID() {
		return fieldID;
	}
	public void setFieldID(Integer fieldID) {
		this.fieldID = fieldID;
	}
	public String getHistoryCode() {
		return historyCode;
	}
	public void setHistoryCode(String historyCode) {
		this.historyCode = historyCode;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getTerminalID() {
		return (terminalID == null) ? "" : terminalID;
	}
	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}
	public String getHistoryDate() {
		return historyDate;
	}
	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}
	public String getHistoryDesc() {
		return historyDesc;
	}
	public void setHistoryDesc(String historyDesc) {
		this.historyDesc = historyDesc;
	}
}
