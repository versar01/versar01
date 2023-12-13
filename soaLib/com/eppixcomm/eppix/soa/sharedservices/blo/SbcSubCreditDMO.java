package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SbcSubCreditDMO extends DBO implements Serializable {

	private Integer sbcSubscriberId;
	private Integer sbcCreditScore;

	public static final int sbcSubscriberIdFilter = 0;

	public static final int sbcCreditScoreFilter = 1;

	public SbcSubCreditDMO() {
	};

	public SbcSubCreditDMO(final Integer sbcSubscriberId,
			final Integer sbcCreditScore) {

		this.sbcSubscriberId = sbcSubscriberId;
		this.sbcCreditScore = sbcCreditScore;
	};

	private static final int[] fieldSizes = new int[] { 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.sbcSubscriberId, this.sbcCreditScore };
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
		return new DAOArgs(1).arg(this.sbcSubscriberId);
	}

	protected void set(Object[] fields) {
		this.sbcSubscriberId = ((Integer) fields[0]);
		this.sbcCreditScore = ((Integer) fields[1]);
	}

	public void set(final Integer sbcSubscriberId, final Integer sbcCreditScore) {

		this.sbcSubscriberId = sbcSubscriberId;
		this.sbcCreditScore = sbcCreditScore;
	}

	public Integer getSbcSubscriberId() {
		return sbcSubscriberId;
	}

	public void setSbcSubscriberId(Integer sbcSubscriberId) {
		this.sbcSubscriberId = sbcSubscriberId;
	}

	public Integer getSbcCreditScore() {
		return sbcCreditScore;
	}

	public void setSbcCreditScore(Integer sbcCreditScore) {
		this.sbcCreditScore = sbcCreditScore;
	}

}
