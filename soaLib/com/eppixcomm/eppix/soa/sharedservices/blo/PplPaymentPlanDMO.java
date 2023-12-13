package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PplPaymentPlanDMO extends DBO implements Serializable {

	private String pplPayPlanRef;
	private String pplPayPlanDesc;
	private String pplAdminChg;
	private String pplInterestChg;
	private Double pplInterestRate;
	private Double pplMinPercent;
	private Short pplMinMonths;

	public static final int pplPayPlanRefFilter = 0;
	private static final int pplPayPlanRefSize = 10;

	public static final int pplPayPlanDescFilter = 1;
	private static final int pplPayPlanDescSize = 30;

	public static final int pplAdminChgFilter = 2;
	private static final int pplAdminChgSize = 5;

	public static final int pplInterestChgFilter = 3;
	private static final int pplInterestChgSize = 5;

	public static final int pplInterestRateFilter = 4;

	public static final int pplMinPercentFilter = 5;

	public static final int pplMinMonthsFilter = 6;

	public PplPaymentPlanDMO() {
	};

	public PplPaymentPlanDMO(final String pplPayPlanRef, final String pplPayPlanDesc, final String pplAdminChg,
			final String pplInterestChg, final Double pplInterestRate, final Double pplMinPercent,
			final Short pplMinMonths) {

		this.pplPayPlanRef = pplPayPlanRef;
		this.pplPayPlanDesc = pplPayPlanDesc;
		this.pplAdminChg = pplAdminChg;
		this.pplInterestChg = pplInterestChg;
		this.pplInterestRate = pplInterestRate;
		this.pplMinPercent = pplMinPercent;
		this.pplMinMonths = pplMinMonths;
	};

	private static final int[] fieldSizes = new int[] { pplPayPlanRefSize, pplPayPlanDescSize, pplAdminChgSize,
			pplInterestChgSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.pplPayPlanRef == null) ? null
						: (this.pplPayPlanRef.length() <= pplPayPlanRefSize) ? this.pplPayPlanRef
								: this.pplPayPlanRef.substring(0, this.pplPayPlanRefSize)),
				((this.pplPayPlanDesc == null) ? null
						: (this.pplPayPlanDesc.length() <= pplPayPlanDescSize) ? this.pplPayPlanDesc
								: this.pplPayPlanDesc.substring(0, this.pplPayPlanDescSize)),
				((this.pplAdminChg == null) ? null
						: (this.pplAdminChg.length() <= pplAdminChgSize) ? this.pplAdminChg
								: this.pplAdminChg.substring(0, this.pplAdminChgSize)),
				((this.pplInterestChg == null) ? null
						: (this.pplInterestChg.length() <= pplInterestChgSize) ? this.pplInterestChg
								: this.pplInterestChg.substring(0, this.pplInterestChgSize)),
				this.pplInterestRate, this.pplMinPercent, this.pplMinMonths };
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
		return new DAOArgs().arg(this.pplPayPlanRef);
	}

	protected void set(Object[] fields) {
		this.pplPayPlanRef = rtrim((String) fields[0]);
		this.pplPayPlanDesc = rtrim((String) fields[1]);
		this.pplAdminChg = rtrim((String) fields[2]);
		this.pplInterestChg = rtrim((String) fields[3]);
		this.pplInterestRate = ((Double) fields[4]);
		this.pplMinPercent = ((Double) fields[5]);
		this.pplMinMonths = ((Short) fields[6]);
	}

	public void set(final String pplPayPlanRef, final String pplPayPlanDesc, final String pplAdminChg,
			final String pplInterestChg, final Double pplInterestRate, final Double pplMinPercent,
			final Short pplMinMonths) {

		this.pplPayPlanRef = pplPayPlanRef;
		this.pplPayPlanDesc = pplPayPlanDesc;
		this.pplAdminChg = pplAdminChg;
		this.pplInterestChg = pplInterestChg;
		this.pplInterestRate = pplInterestRate;
		this.pplMinPercent = pplMinPercent;
		this.pplMinMonths = pplMinMonths;
	}

	public String getPplPayPlanRef() {
		return pplPayPlanRef;
	}

	public String getPplPayPlanDesc() {
		return pplPayPlanDesc;
	}

	public String getPplAdminChg() {
		return pplAdminChg;
	}

	public String getPplInterestChg() {
		return pplInterestChg;
	}

	public Double getPplInterestRate() {
		return pplInterestRate;
	}

	public Double getPplMinPercent() {
		return pplMinPercent;
	}

	public Short getPplMinMonths() {
		return pplMinMonths;
	}

	public void setPplPayPlanRef(String pplPayPlanRef) {
		this.pplPayPlanRef = pplPayPlanRef;
	}

	public void setPplPayPlanDesc(String pplPayPlanDesc) {
		this.pplPayPlanDesc = pplPayPlanDesc;
	}

	public void setPplAdminChg(String pplAdminChg) {
		this.pplAdminChg = pplAdminChg;
	}

	public void setPplInterestChg(String pplInterestChg) {
		this.pplInterestChg = pplInterestChg;
	}

	public void setPplInterestRate(Double pplInterestRate) {
		this.pplInterestRate = pplInterestRate;
	}

	public void setPplMinPercent(Double pplMinPercent) {
		this.pplMinPercent = pplMinPercent;
	}

	public void setPplMinMonths(Short pplMinMonths) {
		this.pplMinMonths = pplMinMonths;
	}
}
