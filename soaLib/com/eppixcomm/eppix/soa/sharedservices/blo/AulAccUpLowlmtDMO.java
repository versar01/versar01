package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AulAccUpLowlmtDMO extends DBO implements Serializable {

	private String aulBillAcNo;
	private Double aulLmtMin;
	private Double aulLmtMax;
	private String aulLmtMech;

	public static final int aulBillAcNoFilter = 0;
	private static final int aulBillAcNoSize = 8;

	public static final int aulLmtMinFilter = 1;

	public static final int aulLmtMaxFilter = 2;

	public static final int aulLmtMechFilter = 3;
	private static final int aulLmtMechSize = 1;

	public AulAccUpLowlmtDMO() {
	};

	public AulAccUpLowlmtDMO(final String aulBillAcNo, final Double aulLmtMin, final Double aulLmtMax,
			final String aulLmtMech) {

		this.aulBillAcNo = aulBillAcNo;
		this.aulLmtMin = aulLmtMin;
		this.aulLmtMax = aulLmtMax;
		this.aulLmtMech = aulLmtMech;
	};

	private static final int[] fieldSizes = new int[] { aulBillAcNoSize, 0, 0, aulLmtMechSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.aulBillAcNo == null) ? null
						: (this.aulBillAcNo.length() <= aulBillAcNoSize) ? this.aulBillAcNo
								: this.aulBillAcNo.substring(0, this.aulBillAcNoSize)),
				this.aulLmtMin, this.aulLmtMax,
				((this.aulLmtMech == null) ? null
						: (this.aulLmtMech.length() <= aulLmtMechSize) ? this.aulLmtMech
								: this.aulLmtMech.substring(0, this.aulLmtMechSize)) };
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
		return new DAOArgs(1).arg(this.aulBillAcNo);
	}

	protected void set(Object[] fields) {
		this.aulBillAcNo = rtrim((String) fields[0]);
		this.aulLmtMin = ((Double) fields[1]);
		this.aulLmtMax = ((Double) fields[2]);
		this.aulLmtMech = rtrim((String) fields[3]);
	}

	public void set(final String aulBillAcNo, final Double aulLmtMin, final Double aulLmtMax, final String aulLmtMech) {

		this.aulBillAcNo = aulBillAcNo;
		this.aulLmtMin = aulLmtMin;
		this.aulLmtMax = aulLmtMax;
		this.aulLmtMech = aulLmtMech;
	}

	public String getAulBillAcNo() {
		return aulBillAcNo;
	}

	public void setAulBillAcNo(String aulBillAcNo) {
		this.aulBillAcNo = aulBillAcNo;
	}

	public Double getAulLmtMin() {
		return aulLmtMin;
	}

	public void setAulLmtMin(Double aulLmtMin) {
		this.aulLmtMin = aulLmtMin;
	}

	public Double getAulLmtMax() {
		return aulLmtMax;
	}

	public void setAulLmtMax(Double aulLmtMax) {
		this.aulLmtMax = aulLmtMax;
	}

	public String getAulLmtMech() {
		return aulLmtMech;
	}

	public void setAulLmtMech(String aulLmtMech) {
		this.aulLmtMech = aulLmtMech;
	}

}
