package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SdbSimDeactBalDMO extends DBO implements Serializable {

	private String sdbCustomer;
	private String sdbSimNo;
	private Double sdbBalAtDeact;
	private Double sdbForAtDeact;

	public static final int sdbCustomerFilter = 0;
	private static final int sdbCustomerSize = 10;

	public static final int sdbSimNoFilter = 1;
	private static final int sdbSimNoSize = 14;

	public static final int sdbBalAtDeactFilter = 2;

	public static final int sdbForAtDeactFilter = 3;

	public SdbSimDeactBalDMO() {
	};

	public SdbSimDeactBalDMO(final String sdbCustomer, final String sdbSimNo, final Double sdbBalAtDeact,
			final Double sdbForAtDeact) {

		this.sdbCustomer = sdbCustomer;
		this.sdbSimNo = sdbSimNo;
		this.sdbBalAtDeact = sdbBalAtDeact;
		this.sdbForAtDeact = sdbForAtDeact;
	};

	private static final int[] fieldSizes = new int[] { sdbCustomerSize, sdbSimNoSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DOUBLE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sdbCustomer == null) ? null
						: (this.sdbCustomer.length() <= sdbCustomerSize) ? this.sdbCustomer
								: this.sdbCustomer.substring(0, this.sdbCustomerSize)),
				((this.sdbSimNo == null) ? null
						: (this.sdbSimNo.length() <= sdbSimNoSize) ? this.sdbSimNo
								: this.sdbSimNo.substring(0, this.sdbSimNoSize)),
				this.sdbBalAtDeact, this.sdbForAtDeact };
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
		return new DAOArgs(2).arg(this.sdbCustomer).arg(this.sdbSimNo);
	}

	protected void set(Object[] fields) {
		this.sdbCustomer = rtrim((String) fields[0]);
		this.sdbSimNo = rtrim((String) fields[1]);
		this.sdbBalAtDeact = ((Double) fields[2]);
		this.sdbForAtDeact = ((Double) fields[3]);
	}

	public void set(final String sdbCustomer, final String sdbSimNo, final Double sdbBalAtDeact,
			final Double sdbForAtDeact) {

		this.sdbCustomer = sdbCustomer;
		this.sdbSimNo = sdbSimNo;
		this.sdbBalAtDeact = sdbBalAtDeact;
		this.sdbForAtDeact = sdbForAtDeact;
	}

	public String getSdbCustomer() {
		return sdbCustomer;
	}

	public void setSdbCustomer(String sdbCustomer) {
		this.sdbCustomer = sdbCustomer;
	}

	public String getSdbSimNo() {
		return sdbSimNo;
	}

	public void setSdbSimNo(String sdbSimNo) {
		this.sdbSimNo = sdbSimNo;
	}

	public Double getSdbBalAtDeact() {
		return sdbBalAtDeact;
	}

	public void setSdbBalAtDeact(Double sdbBalAtDeact) {
		this.sdbBalAtDeact = sdbBalAtDeact;
	}

	public Double getSdbForAtDeact() {
		return sdbForAtDeact;
	}

	public void setSdbForAtDeact(Double sdbForAtDeact) {
		this.sdbForAtDeact = sdbForAtDeact;
	}

}