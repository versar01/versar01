package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EpxslcauxvamDQO extends DBO implements Serializable {

	private String customer;
	private String accStatus;
	private String vamStatCode;
	private String auxAnalysis24;

	public static final int customerFilter = 0;
	private static final int customerSize = 8;

	public static final int accStatusFilter = 1;
	private static final int accStatusSize = 15;

	public static final int vamStatCodeFilter = 2;
	private static final int vamStatCodeSize = 2;
	
	public static final int auxAnalysis24Filter = 4;
	private static final int auxAnalysis24Size = 30;
	
	public EpxslcauxvamDQO() {
	};

	public EpxslcauxvamDQO(final String customer, final String accStatus,
			final String vamStatCode, final String auxAnalysis24) {
		this.customer = customer;
		this.accStatus = accStatus;
		this.vamStatCode = vamStatCode;
		this.auxAnalysis24 = auxAnalysis24;
	};

	private static final int[] fieldSizes = new int[] { customerSize,
			accStatusSize, vamStatCodeSize, auxAnalysis24Filter };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING};

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.customer == null) ? null
						: (this.customer.length() <= customerSize) ? this.customer
								: this.customer.substring(0, this.customerSize)),
				((this.accStatus == null) ? null
						: (this.accStatus.length() <= accStatusSize) ? this.accStatus
								: this.accStatus.substring(0,
										this.accStatusSize)),
				((this.vamStatCode == null) ? null
						: (this.vamStatCode.length() <= vamStatCodeSize) ? this.vamStatCode
								: this.vamStatCode.substring(0,
										this.vamStatCodeSize)),
				((this.auxAnalysis24 == null) ? null
						: (this.auxAnalysis24.length() <= auxAnalysis24Size) ? this.auxAnalysis24
								: this.auxAnalysis24.substring(0,
										this.auxAnalysis24Size))};
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
		this.accStatus = rtrim((String) fields[1]);
		this.vamStatCode = rtrim((String) fields[2]);
		this.auxAnalysis24 = rtrim((String) fields[3]);
	}

	public void set(final String customer, final String accStatus,
			final String vamStatCode, final String auxAnalysis24) {

		this.customer = customer;
		this.accStatus = accStatus;
		this.vamStatCode = vamStatCode;
		this.auxAnalysis24 = auxAnalysis24;
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

	public String getVamStatCode() {
		return vamStatCode;
	}

	public void setVamStatCode(String vamStatCode) {
		this.vamStatCode = vamStatCode;
	}

	public String getAuxAnalysis24() {
		return auxAnalysis24;
	}

	public void setAuxAnalysis24(String auxAnalysis24) {
		this.auxAnalysis24 = auxAnalysis24;
	}

}

