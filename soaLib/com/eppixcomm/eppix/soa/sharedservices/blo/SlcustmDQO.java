package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SlcustmDQO extends DBO implements Serializable {

	private String customer;
	private String name;
	private BigDecimal creditLimit;
	private String analysisCodes1;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String groupCustomer;
	private String groupName;
	private String surname;
	private Integer subscriberId;
	private String firstname;

	public static final int customerFilter = 0;
	private static final int customerSize = 8;

	public static final int nameFilter = 1;
	private static final int nameSize = 50;
	
	public static final int creditLimitFilter = 2;
	
	public static final int analysisCodes1Filter = 3;
	private static final int analysisCodes1Size = 10;

	public static final int address1Filter = 4;
	private static final int address1Size = 32;

	public static final int address2Filter = 5;
	private static final int address2Size = 32;

	public static final int address3Filter = 6;
	private static final int address3Size = 32;

	public static final int address4Filter = 7;
	private static final int address4Size = 32;

	public static final int groupCustomerFilter = 8;
	private static final int groupCustomerSize = 8;

	public static final int address5Filter = 9;
	private static final int address5Size = 2;

	public static final int surnameFilter = 10;
	private static final int surnameSize = 50;

	public static final int subscriberIdFilter = 11;

	public static final int firstnameFilter = 12;
	private static final int firstnameSize = 50;

	public SlcustmDQO() {
	};

	public SlcustmDQO(final String customer, final String name, BigDecimal credtLimit, String analysisCodes1,
			final String address1, final String address2,
			final String address3, final String address4,
			final String groupCustomer, final String address5,
			final String surname, final Integer subscriberId,
			final String firstname) {

		this.customer = customer;
		this.name = name;
		this.creditLimit = creditLimit;
		this.analysisCodes1 = analysisCodes1;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.groupCustomer = groupCustomer;
		this.groupName = address5;
		this.surname = surname;
		this.subscriberId = subscriberId;
		this.firstname = firstname;
	};

	private static final int[] fieldSizes = new int[] { customerSize, nameSize,0,analysisCodes1Filter,
			address1Size, address2Size, address3Size, address4Size,
			groupCustomerSize, address5Size, surnameSize, 0, firstnameSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.customer == null) ? null
						: (this.customer.length() <= customerSize) ? this.customer
								: this.customer.substring(0, this.customerSize)),
				((this.name == null) ? null
						: (this.name.length() <= nameSize) ? this.name
								: this.name.substring(0, this.nameSize)),
				this.creditLimit,				
				((this.analysisCodes1 == null) ? null
						: (this.analysisCodes1.length() <= analysisCodes1Size) ? this.analysisCodes1
								: this.analysisCodes1.substring(0, this.analysisCodes1Size)),				
				((this.address1 == null) ? null
						: (this.address1.length() <= address1Size) ? this.address1
								: this.address1.substring(0, this.address1Size)),
			
				((this.address2 == null) ? null
						: (this.address2.length() <= address2Size) ? this.address2
								: this.address2.substring(0, this.address2Size)),
				((this.address3 == null) ? null
						: (this.address3.length() <= address3Size) ? this.address3
								: this.address3.substring(0, this.address3Size)),
				((this.address4 == null) ? null
						: (this.address4.length() <= address4Size) ? this.address4
								: this.address4.substring(0, this.address4Size)),
				((this.groupCustomer == null) ? null : (this.groupCustomer
						.length() <= groupCustomerSize) ? this.groupCustomer
						: this.groupCustomer.substring(0,
								this.groupCustomerSize)),
				((this.groupName == null) ? null
						: (this.groupName.length() <= address5Size) ? this.groupName
								: this.groupName.substring(0, this.address5Size)),
				((this.surname == null) ? null
						: (this.surname.length() <= surnameSize) ? this.surname
								: this.surname.substring(0, this.surnameSize)),
				this.subscriberId,
				((this.firstname == null) ? null
						: (this.firstname.length() <= firstnameSize) ? this.firstname
								: this.firstname.substring(0,
										this.firstnameSize)) };
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
		this.customer = rtrim((String) fields[0]);
		this.name = rtrim((String) fields[1]);
		this.creditLimit = ((BigDecimal) fields[2]);
		this.analysisCodes1 = rtrim((String) fields[3]);
		this.address1 = rtrim((String) fields[4]);
		this.address2 = rtrim((String) fields[5]);
		this.address3 = rtrim((String) fields[6]);
		this.address4 = rtrim((String) fields[7]);
		this.groupCustomer = rtrim((String) fields[8]);
		this.groupName = rtrim((String) fields[9]);
		this.surname = rtrim((String) fields[10]);
		this.subscriberId = ((Integer) fields[11]);
		this.firstname = rtrim((String) fields[12]);
	}

	public void set(final String customer, final String name, final BigDecimal creditLimit, final String analysisCodes1,
			final String address1, final String address2,
			final String address3, final String address4,
			final String groupCustomer, final String address5,
			final String surname, final Integer subscriberId,
			final String firstname) {

		this.customer = customer;
		this.name = name;
		this.creditLimit = creditLimit;
		this.analysisCodes1 = analysisCodes1;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.groupCustomer = groupCustomer;
		this.groupName = address5;
		this.surname = surname;
		this.subscriberId = subscriberId;
		this.firstname = firstname;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getGroupCustomer() {
		return groupCustomer;
	}

	public void setGroupCustomer(String groupCustomer) {
		this.groupCustomer = groupCustomer;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "\nSlcustmDQO [\ncustomer=" + customer + "\nname=" + name + "\ncreditLimit" + creditLimit
				+ "\naddress1=" + address1 + "\naddress2=" + address2
				+ "\naddress3=" + address3 + "\naddress4=" + address4
				+ "\ngroupCustomer=" + groupCustomer + "\ngroupName=" + groupName
				+ "\nsurname=" + surname + "\nsubscriberId=" + subscriberId
				+ "\nfirstname=" + firstname + "]";
	}


	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getAnalysisCodes1() {
		return analysisCodes1;
	}

	public void setAnalysisCodes1(String analysisCodes1) {
		this.analysisCodes1 = analysisCodes1;
	}

}
