package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class SbbSubBenefitDMO extends DBO implements Serializable {

	private Integer sbbSubPartnerId;
	private Integer sbbBenefitId;

	public static final int sbbSubPartnerIdFilter = 0;

	public static final int sbbBenefitIdFilter = 1;

	public SbbSubBenefitDMO() {
	};

	public SbbSubBenefitDMO(final Integer sbbSubPartnerId,
			final Integer sbbBenefitId) {

		this.sbbSubPartnerId = sbbSubPartnerId;
		this.sbbBenefitId = sbbBenefitId;
	};

	private static final int[] fieldSizes = new int[] { 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.sbbSubPartnerId, this.sbbBenefitId };
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
		return new DAOArgs(2).arg(this.sbbSubPartnerId).arg(
				this.sbbBenefitIdFilter);
	}

	protected void set(Object[] fields) {
		this.sbbSubPartnerId = ((Integer) fields[0]);
		this.sbbBenefitId = ((Integer) fields[1]);
	}

	public void set(final Integer sbbSubPartnerId, final Integer sbbBenefitId) {

		this.sbbSubPartnerId = sbbSubPartnerId;
		this.sbbBenefitId = sbbBenefitId;
	}

	public Integer getSbbSubPartnerId() {
		return sbbSubPartnerId;
	}

	public void setSbbSubPartnerId(Integer sbbSubPartnerId) {
		this.sbbSubPartnerId = sbbSubPartnerId;
	}

	public Integer getSbbBenefitId() {
		return sbbBenefitId;
	}

	public void setSbbBenefitId(Integer sbbBenefitId) {
		this.sbbBenefitId = sbbBenefitId;
	}

}
