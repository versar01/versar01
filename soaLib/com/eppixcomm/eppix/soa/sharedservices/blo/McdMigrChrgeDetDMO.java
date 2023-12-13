package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class McdMigrChrgeDetDMO extends DBO implements Serializable {

	private Integer mcdId;
	private String mcdChargeCode;
	private String mcdInclRollback;
	private Short mcdProrate;
	private String mcdContractTerm;

	public static final int mcdIdFilter = 0;

	public static final int mcdChargeCodeFilter = 1;
	private static final int mcdChargeCodeSize = 5;

	public static final int mcdInclRollbackFilter = 2;
	private static final int mcdInclRollbackSize = 1;

	public static final int mcdProrateFilter = 3;

	public static final int mcdContractTermFilter = 4;
	private static final int mcdContractTermSize = 1;

	public McdMigrChrgeDetDMO() {
	};

	public McdMigrChrgeDetDMO(final Integer mcdId, final String mcdChargeCode,
			final String mcdInclRollback, final Short mcdProrate,
			final String mcdContractTerm) {

		this.mcdId = mcdId;
		this.mcdChargeCode = mcdChargeCode;
		this.mcdInclRollback = mcdInclRollback;
		this.mcdProrate = mcdProrate;
		this.mcdContractTerm = mcdContractTerm;
	};

	private static final int[] fieldSizes = new int[] { 0, mcdChargeCodeSize,
			mcdInclRollbackSize, 0, mcdContractTermSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.mcdId,
				((this.mcdChargeCode == null) ? null : (this.mcdChargeCode
						.length() <= mcdChargeCodeSize) ? this.mcdChargeCode
						: this.mcdChargeCode.substring(0,
								this.mcdChargeCodeSize)),
				((this.mcdInclRollback == null) ? null
						: (this.mcdInclRollback.length() <= mcdInclRollbackSize) ? this.mcdInclRollback
								: this.mcdInclRollback.substring(0,
										this.mcdInclRollbackSize)),
				this.mcdProrate,
				((this.mcdContractTerm == null) ? null
						: (this.mcdContractTerm.length() <= mcdContractTermSize) ? this.mcdContractTerm
								: this.mcdContractTerm.substring(0,
										this.mcdContractTermSize)) };
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
		return new DAOArgs(2).arg(this.mcdId).arg(this.mcdChargeCode);
	}

	protected void set(Object[] fields) {
		this.mcdId = ((Integer) fields[0]);
		this.mcdChargeCode = rtrim((String) fields[1]);
		this.mcdInclRollback = rtrim((String) fields[2]);
		this.mcdProrate = ((Short) fields[3]);
		this.mcdContractTerm = rtrim((String) fields[4]);
	}

	public void set(final Integer mcdId, final String mcdChargeCode,
			final String mcdInclRollback, final Short mcdProrate,
			final String mcdContractTerm) {

		this.mcdId = mcdId;
		this.mcdChargeCode = mcdChargeCode;
		this.mcdInclRollback = mcdInclRollback;
		this.mcdProrate = mcdProrate;
		this.mcdContractTerm = mcdContractTerm;
	}

	public Integer getMcdId() {
		return mcdId;
	}

	public void setMcdId(Integer mcdId) {
		this.mcdId = mcdId;
	}

	public String getMcdChargeCode() {
		return mcdChargeCode;
	}

	public void setMcdChargeCode(String mcdChargeCode) {
		this.mcdChargeCode = mcdChargeCode;
	}

	public String getMcdInclRollback() {
		return mcdInclRollback;
	}

	public void setMcdInclRollback(String mcdInclRollback) {
		this.mcdInclRollback = mcdInclRollback;
	}

	public Short getMcdProrate() {
		return mcdProrate;
	}

	public void setMcdProrate(Short mcdProrate) {
		this.mcdProrate = mcdProrate;
	}

	public String getMcdContractTerm() {
		return mcdContractTerm;
	}

	public void setMcdContractTerm(String mcdContractTerm) {
		this.mcdContractTerm = mcdContractTerm;
	}

}
