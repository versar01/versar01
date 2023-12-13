package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class MgrMigRuleDMO extends DBO implements Serializable {

	private String mgrPrimaryServ;
	private String mgrProviderId;
	private String mgrTargetServ;

	public static final int mgrPrimaryServFilter = 0;
	private static final int mgrPrimaryServSize = 4;

	public static final int mgrProviderIdFilter = 1;
	private static final int mgrProviderIdSize = 5;

	public static final int mgrTargetServFilter = 2;
	private static final int mgrTargetServSize = 4;

	public MgrMigRuleDMO() {
	};

	public MgrMigRuleDMO(final String mgrPrimaryServ,
			final String mgrProviderId, final String mgrTargetServ) {

		this.mgrPrimaryServ = mgrPrimaryServ;
		this.mgrProviderId = mgrProviderId;
		this.mgrTargetServ = mgrTargetServ;
	};

	private static final int[] fieldSizes = new int[] { mgrPrimaryServSize,
			mgrProviderIdSize, mgrTargetServSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.mgrPrimaryServ == null) ? null : (this.mgrPrimaryServ
						.length() <= mgrPrimaryServSize) ? this.mgrPrimaryServ
						: this.mgrPrimaryServ.substring(0,
								this.mgrPrimaryServSize)),
				((this.mgrProviderId == null) ? null : (this.mgrProviderId
						.length() <= mgrProviderIdSize) ? this.mgrProviderId
						: this.mgrProviderId.substring(0,
								this.mgrProviderIdSize)),
				((this.mgrTargetServ == null) ? null : (this.mgrTargetServ
						.length() <= mgrTargetServSize) ? this.mgrTargetServ
						: this.mgrTargetServ.substring(0,
								this.mgrTargetServSize)) };
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
		return new DAOArgs(3).arg(this.mgrPrimaryServ).arg(this.mgrProviderId)
				.arg(this.mgrTargetServ);
	}

	protected void set(Object[] fields) {
		this.mgrPrimaryServ = rtrim((String) fields[0]);
		this.mgrProviderId = rtrim((String) fields[1]);
		this.mgrTargetServ = rtrim((String) fields[2]);
	}

	public void set(final String mgrPrimaryServ, final String mgrProviderId,
			final String mgrTargetServ) {

		this.mgrPrimaryServ = mgrPrimaryServ;
		this.mgrProviderId = mgrProviderId;
		this.mgrTargetServ = mgrTargetServ;
	}

	public String getMgrPrimaryServ() {
		return mgrPrimaryServ;
	}

	public void setMgrPrimaryServ(String mgrPrimaryServ) {
		this.mgrPrimaryServ = mgrPrimaryServ;
	}

	public String getMgrProviderId() {
		return mgrProviderId;
	}

	public void setMgrProviderId(String mgrProviderId) {
		this.mgrProviderId = mgrProviderId;
	}

	public String getMgrTargetServ() {
		return mgrTargetServ;
	}

	public void setMgrTargetServ(String mgrTargetServ) {
		this.mgrTargetServ = mgrTargetServ;
	}

}
