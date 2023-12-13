package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AccountDetailsDMO extends DBO implements Serializable {

	private String exists;
	private String customer;
	private String accStatus;
	private String accountType;
	private String msisdnNo;
	private String statCode;
	private String ttText;

	public static final int existsFilter = 0;
	private static final int existsSize = 6;

	public static final int customerFilter = 1;
	private static final int customerSize = 8;

	public static final int accStatusFilter = 2;
	private static final int accStatusSize = 15;

	public static final int accountTypeFilter = 3;
	private static final int accountTypeSize = 5;

	public static final int msisdnNoFilter = 4;
	private static final int msisdnNoSize = 15;

	public static final int statCodeFilter = 5;
	private static final int statCodeSize = 2;

	public static final int ttTextFilter = 6;
	private static final int ttTextSize = 50;

	public AccountDetailsDMO() {
	};

	public AccountDetailsDMO(final String exists, final String customer, final String accStatus,
			final String accountType, final String msisdnNo, final String statCode, final String ttText) {

		this.exists = exists;
		this.customer = customer;
		this.accStatus = accStatus;
		this.accountType = accountType;
		this.msisdnNo = msisdnNo;
		this.statCode = statCode;
		this.ttText = ttText;
	};

	private static final int[] fieldSizes = new int[] { existsSize, customerSize, accStatusSize, accountTypeSize,
			msisdnNoSize, statCodeSize, ttTextSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.exists == null) ? null
						: (this.exists.length() <= existsSize) ? this.exists
								: this.exists.substring(0, this.existsSize)),
				((this.customer == null) ? null
						: (this.customer.length() <= customerSize) ? this.customer
								: this.customer.substring(0, this.customerSize)),
				((this.accStatus == null) ? null
						: (this.accStatus.length() <= accStatusSize) ? this.accStatus
								: this.accStatus.substring(0, this.accStatusSize)),
				((this.accountType == null) ? null
						: (this.accountType.length() <= accountTypeSize) ? this.accountType
								: this.accountType.substring(0, this.accountTypeSize)),
				((this.msisdnNo == null) ? null
						: (this.msisdnNo.length() <= msisdnNoSize) ? this.msisdnNo
								: this.msisdnNo.substring(0, this.msisdnNoSize)),
				((this.statCode == null) ? null
						: (this.statCode.length() <= statCodeSize) ? this.statCode
								: this.statCode.substring(0, this.statCodeSize)),
				((this.ttText == null) ? null
						: (this.ttText.length() <= ttTextSize) ? this.ttText
								: this.ttText.substring(0, this.ttTextSize)) };
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
		this.exists = rtrim((String) fields[0]);

		this.customer = rtrim((String) fields[1]);

		this.accStatus = rtrim((String) fields[2]);

		this.accountType = rtrim((String) fields[3]);

		this.msisdnNo = rtrim((String) fields[4]);

		this.statCode = rtrim((String) fields[5]);

		this.ttText = rtrim((String) fields[6]);

	}

	public void set(final String exists, final String customer, final String accStatus, final String accountType,
			final String msisdnNo, final String statCode, final String ttText) {

		this.exists = exists;
		this.customer = customer;
		this.accStatus = accStatus;
		this.accountType = accountType;
		this.msisdnNo = msisdnNo;
		this.statCode = statCode;
		this.ttText = ttText;
	}

	public String getExists() {
		return exists;
	}

	public void setExists(String exists) {
		this.exists = exists;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMsisdnNo() {
		return msisdnNo;
	}

	public void setMsisdnNo(String msisdnNo) {
		this.msisdnNo = msisdnNo;
	}

	public String getStatCode() {
		return statCode;
	}

	public void setStatCode(String statCode) {
		this.statCode = statCode;
	}

	public String getTtText() {
		return ttText;
	}

	public void setTtText(String ttText) {
		this.ttText = ttText;
	}

}
