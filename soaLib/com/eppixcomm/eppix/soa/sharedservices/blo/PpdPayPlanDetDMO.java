package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PpdPayPlanDetDMO extends DBO implements Serializable {

	private String ppdCustomer;
	private Short ppdUnitNo;
	private Date ppdDueDate;
	private Double ppdCapital;
	private Double ppdInterest;

	public static final int ppdCustomerFilter = 0;
	private static final int ppdCustomerSize = 8;

	public static final int ppdUnitNoFilter = 1;

	public static final int ppdDueDateFilter = 2;

	public static final int ppdCapitalFilter = 3;

	public static final int ppdInterestFilter = 4;

	public PpdPayPlanDetDMO() {
	};

	public PpdPayPlanDetDMO(final String ppdCustomer, final Short ppdUnitNo, final Date ppdDueDate,
			final Double ppdCapital, final Double ppdInterest) {

		this.ppdCustomer = ppdCustomer;
		this.ppdUnitNo = ppdUnitNo;
		this.ppdDueDate = ppdDueDate;
		this.ppdCapital = ppdCapital;
		this.ppdInterest = ppdInterest;
	};

	private static final int[] fieldSizes = new int[] { ppdCustomerSize, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_DATE,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.ppdCustomer == null) ? null
						: (this.ppdCustomer.length() <= ppdCustomerSize) ? this.ppdCustomer
								: this.ppdCustomer.substring(0, this.ppdCustomerSize)),
				this.ppdUnitNo, this.ppdDueDate, this.ppdCapital, this.ppdInterest };
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
		this.ppdCustomer = rtrim((String) fields[0]);
		this.ppdUnitNo = ((Short) fields[1]);
		this.ppdDueDate = (new Date(fields[2]));
		this.ppdCapital = ((Double) fields[3]);
		this.ppdInterest = ((Double) fields[4]);
	}

	public void set(final String ppdCustomer, final Short ppdUnitNo, final Date ppdDueDate, final Double ppdCapital,
			final Double ppdInterest) {

		this.ppdCustomer = ppdCustomer;
		this.ppdUnitNo = ppdUnitNo;
		this.ppdDueDate = ppdDueDate;
		this.ppdCapital = ppdCapital;
		this.ppdInterest = ppdInterest;
	}

	public String getPpdCustomer() {
		return ppdCustomer;
	}

	public Short getPpdUnitNo() {
		return ppdUnitNo;
	}

	public Date getPpdDueDate() {
		return ppdDueDate;
	}

	public Double getPpdCapital() {
		return ppdCapital;
	}

	public Double getPpdInterest() {
		return ppdInterest;
	}

	public void setPpdCustomer(String ppdCustomer) {
		this.ppdCustomer = ppdCustomer;
	}

	public void setPpdUnitNo(Short ppdUnitNo) {
		this.ppdUnitNo = ppdUnitNo;
	}

	public void setPpdDueDate(Date ppdDueDate) {
		this.ppdDueDate = ppdDueDate;
	}

	public void setPpdCapital(Double ppdCapital) {
		this.ppdCapital = ppdCapital;
	}

	public void setPpdInterest(Double ppdInterest) {
		this.ppdInterest = ppdInterest;
	}

	@Override
	public String toString() {
		return "\nPpdPayPlanDetDMO [ppdCustomer=" + ppdCustomer + "\nppdUnitNo=" + ppdUnitNo + "\nppdDueDate="
				+ ppdDueDate + "\nppdCapital=" + ppdCapital + "\nppdInterest=" + ppdInterest + "]";
	}
}
