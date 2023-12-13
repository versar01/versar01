package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PphPayPlanHdrDMO extends DBO implements Serializable {

	private String pphCustomer;
	private String pphPayPlanRef;
	private String pphReasonCode;
	private Double pphAdminFee;
	private String pphInterest;
	private Double pphInterestRate;
	private Short pphNoOfInstall;
	private String pphInstalmntUnit;
	private Short pphNoOfUnits;
	private Double pphInitCapital;
	private Double pphTotalCapital;
	private Double pphTotInterest;
	private Double pphTotRepayment;
	private String pphPayRef;
	private Date pphDateCreated;

	public static final int pphCustomerFilter = 0;
	private static final int pphCustomerSize = 8;

	public static final int pphPayPlanRefFilter = 1;
	private static final int pphPayPlanRefSize = 10;

	public static final int pphReasonCodeFilter = 2;
	private static final int pphReasonCodeSize = 5;

	public static final int pphAdminFeeFilter = 3;

	public static final int pphInterestFilter = 4;
	private static final int pphInterestSize = 5;

	public static final int pphInterestRateFilter = 5;

	public static final int pphNoOfInstallFilter = 6;

	public static final int pphInstalmntUnitFilter = 7;
	private static final int pphInstalmntUnitSize = 1;

	public static final int pphNoOfUnitsFilter = 8;

	public static final int pphInitCapitalFilter = 9;

	public static final int pphTotalCapitalFilter = 10;

	public static final int pphTotInterestFilter = 11;

	public static final int pphTotRepaymentFilter = 12;

	public static final int pphPayRefFilter = 13;
	private static final int pphPayRefSize = 5;

	public static final int pphDateCreatedFilter = 14;

	public PphPayPlanHdrDMO() {
	};

	public PphPayPlanHdrDMO(final String pphCustomer,
			final String pphPayPlanRef, final String pphReasonCode,
			final Double pphAdminFee, final String pphInterest,
			final Double pphInterestRate, final Short pphNoOfInstall,
			final String pphInstalmntUnit, final Short pphNoOfUnits,
			final Double pphInitCapital, final Double pphTotalCapital,
			final Double pphTotInterest, final Double pphTotRepayment,
			final String pphPayRef, final Date pphDateCreated) {

		this.pphCustomer = pphCustomer;
		this.pphPayPlanRef = pphPayPlanRef;
		this.pphReasonCode = pphReasonCode;
		this.pphAdminFee = pphAdminFee;
		this.pphInterest = pphInterest;
		this.pphInterestRate = pphInterestRate;
		this.pphNoOfInstall = pphNoOfInstall;
		this.pphInstalmntUnit = pphInstalmntUnit;
		this.pphNoOfUnits = pphNoOfUnits;
		this.pphInitCapital = pphInitCapital;
		this.pphTotalCapital = pphTotalCapital;
		this.pphTotInterest = pphTotInterest;
		this.pphTotRepayment = pphTotRepayment;
		this.pphPayRef = pphPayRef;
		this.pphDateCreated = pphDateCreated;
	};

	private static final int[] fieldSizes = new int[] { pphCustomerSize,
			pphPayPlanRefSize, pphReasonCodeSize, 0, pphInterestSize, 0, 0,
			pphInstalmntUnitSize, 0, 0, 0, 0, 0, pphPayRefSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING, FIELD_TYPE_FLOAT, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.pphCustomer == null) ? null
						: (this.pphCustomer.length() <= pphCustomerSize) ? this.pphCustomer
								: this.pphCustomer.substring(0,
										this.pphCustomerSize)),
				((this.pphPayPlanRef == null) ? null : (this.pphPayPlanRef
						.length() <= pphPayPlanRefSize) ? this.pphPayPlanRef
						: this.pphPayPlanRef.substring(0,
								this.pphPayPlanRefSize)),
				((this.pphReasonCode == null) ? null : (this.pphReasonCode
						.length() <= pphReasonCodeSize) ? this.pphReasonCode
						: this.pphReasonCode.substring(0,
								this.pphReasonCodeSize)),
				this.pphAdminFee,
				((this.pphInterest == null) ? null
						: (this.pphInterest.length() <= pphInterestSize) ? this.pphInterest
								: this.pphInterest.substring(0,
										this.pphInterestSize)),
				this.pphInterestRate,
				this.pphNoOfInstall,
				((this.pphInstalmntUnit == null) ? null
						: (this.pphInstalmntUnit.length() <= pphInstalmntUnitSize) ? this.pphInstalmntUnit
								: this.pphInstalmntUnit.substring(0,
										this.pphInstalmntUnitSize)),
				this.pphNoOfUnits,
				this.pphInitCapital,
				this.pphTotalCapital,
				this.pphTotInterest,
				this.pphTotRepayment,
				((this.pphPayRef == null) ? null
						: (this.pphPayRef.length() <= pphPayRefSize) ? this.pphPayRef
								: this.pphPayRef.substring(0,
										this.pphPayRefSize)),
				this.pphDateCreated };
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
		this.pphCustomer = rtrim((String) fields[0]);
		this.pphPayPlanRef = rtrim((String) fields[1]);
		this.pphReasonCode = rtrim((String) fields[2]);
		this.pphAdminFee = (new Double((Float)fields[3]));
		this.pphInterest = rtrim((String) fields[4]);
		this.pphInterestRate = (new Double((Float)fields[5]));
		this.pphNoOfInstall = ((Short) fields[6]);
		this.pphInstalmntUnit = rtrim((String) fields[7]);
		this.pphNoOfUnits = ((Short) fields[8]);
		this.pphInitCapital = (new Double((Float)fields[9]));
		this.pphTotalCapital = (new Double((Float)fields[10]));
		this.pphTotInterest = (new Double((Float)fields[11]));
		this.pphTotRepayment = (new Double((Float)fields[12]));
		this.pphPayRef = rtrim((String) fields[13]);
		this.pphDateCreated = ((fields[14] == null) ? null : new Date(
				fields[14]));
	}

	public void set(final String pphCustomer, final String pphPayPlanRef,
			final String pphReasonCode, final Double pphAdminFee,
			final String pphInterest, final Double pphInterestRate,
			final Short pphNoOfInstall, final String pphInstalmntUnit,
			final Short pphNoOfUnits, final Double pphInitCapital,
			final Double pphTotalCapital, final Double pphTotInterest,
			final Double pphTotRepayment, final String pphPayRef,
			final Date pphDateCreated) {

		this.pphCustomer = pphCustomer;
		this.pphPayPlanRef = pphPayPlanRef;
		this.pphReasonCode = pphReasonCode;
		this.pphAdminFee = pphAdminFee;
		this.pphInterest = pphInterest;
		this.pphInterestRate = pphInterestRate;
		this.pphNoOfInstall = pphNoOfInstall;
		this.pphInstalmntUnit = pphInstalmntUnit;
		this.pphNoOfUnits = pphNoOfUnits;
		this.pphInitCapital = pphInitCapital;
		this.pphTotalCapital = pphTotalCapital;
		this.pphTotInterest = pphTotInterest;
		this.pphTotRepayment = pphTotRepayment;
		this.pphPayRef = pphPayRef;
		this.pphDateCreated = pphDateCreated;
	}

	public String getPphCustomer() {
		return pphCustomer;
	}

	public void setPphCustomer(String pphCustomer) {
		this.pphCustomer = pphCustomer;
	}

	public String getPphPayPlanRef() {
		return pphPayPlanRef;
	}

	public void setPphPayPlanRef(String pphPayPlanRef) {
		this.pphPayPlanRef = pphPayPlanRef;
	}

	public String getPphReasonCode() {
		return pphReasonCode;
	}

	public void setPphReasonCode(String pphReasonCode) {
		this.pphReasonCode = pphReasonCode;
	}

	public Double getPphAdminFee() {
		return pphAdminFee;
	}

	public void setPphAdminFee(Double pphAdminFee) {
		this.pphAdminFee = pphAdminFee;
	}

	public String getPphInterest() {
		return pphInterest;
	}

	public void setPphInterest(String pphInterest) {
		this.pphInterest = pphInterest;
	}

	public Double getPphInterestRate() {
		return pphInterestRate;
	}

	public void setPphInterestRate(Double pphInterestRate) {
		this.pphInterestRate = pphInterestRate;
	}

	public Short getPphNoOfInstall() {
		return pphNoOfInstall;
	}

	public void setPphNoOfInstall(Short pphNoOfInstall) {
		this.pphNoOfInstall = pphNoOfInstall;
	}

	public String getPphInstalmntUnit() {
		return pphInstalmntUnit;
	}

	public void setPphInstalmntUnit(String pphInstalmntUnit) {
		this.pphInstalmntUnit = pphInstalmntUnit;
	}

	public Short getPphNoOfUnits() {
		return pphNoOfUnits;
	}

	public void setPphNoOfUnits(Short pphNoOfUnits) {
		this.pphNoOfUnits = pphNoOfUnits;
	}

	public Double getPphInitCapital() {
		return pphInitCapital;
	}

	public void setPphInitCapital(Double pphInitCapital) {
		this.pphInitCapital = pphInitCapital;
	}

	public Double getPphTotalCapital() {
		return pphTotalCapital;
	}

	public void setPphTotalCapital(Double pphTotalCapital) {
		this.pphTotalCapital = pphTotalCapital;
	}

	public Double getPphTotInterest() {
		return pphTotInterest;
	}

	public void setPphTotInterest(Double pphTotInterest) {
		this.pphTotInterest = pphTotInterest;
	}

	public Double getPphTotRepayment() {
		return pphTotRepayment;
	}

	public void setPphTotRepayment(Double pphTotRepayment) {
		this.pphTotRepayment = pphTotRepayment;
	}

	public String getPphPayRef() {
		return pphPayRef;
	}

	public void setPphPayRef(String pphPayRef) {
		this.pphPayRef = pphPayRef;
	}

	public Date getPphDateCreated() {
		return pphDateCreated;
	}

	public void setPphDateCreated(Date pphDateCreated) {
		this.pphDateCreated = pphDateCreated;
	}

	@Override
	public String toString() {
		return "\nPphPayPlanHdrDMO [pphCustomer=" + pphCustomer + "\npphPayPlanRef=" + pphPayPlanRef + "\npphReasonCode="
				+ pphReasonCode + "\npphAdminFee=" + pphAdminFee + "\npphInterest=" + pphInterest + "\npphInterestRate="
				+ pphInterestRate + "\npphNoOfInstall=" + pphNoOfInstall + "\npphInstalmntUnit=" + pphInstalmntUnit
				+ "\npphNoOfUnits=" + pphNoOfUnits + "\npphInitCapital=" + pphInitCapital + "\npphTotalCapital="
				+ pphTotalCapital + "\npphTotInterest=" + pphTotInterest + "\npphTotRepayment=" + pphTotRepayment
				+ "\npphPayRef=" + pphPayRef + "\npphDateCreated=" + pphDateCreated + "]";
	}
}
