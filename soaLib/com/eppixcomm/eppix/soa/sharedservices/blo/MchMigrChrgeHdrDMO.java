package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class MchMigrChrgeHdrDMO extends DBO implements Serializable {

	private String mchType;
	private Integer mchId;
	private String mchOldNtwrkTrf;
	private String mchNewNtwrkTrf;
	private Short mchMigrationNo;

	public static final int mchTypeFilter = 0;
	private static final int mchTypeSize = 10;

	public static final int mchIdFilter = 1;
	private static final int mchIdSize = 2104974;

	public static final int mchOldNtwrkTrfFilter = 2;
	private static final int mchOldNtwrkTrfSize = 20;

	public static final int mchNewNtwrkTrfFilter = 3;
	private static final int mchNewNtwrkTrfSize = 20;

	public static final int mchMigrationNoFilter = 4;

	public MchMigrChrgeHdrDMO() {
	};

	public MchMigrChrgeHdrDMO(final String mchType, final Integer mchId,
			final String mchOldNtwrkTrf, final String mchNewNtwrkTrf,
			final Short mchMigrationNo) {

		this.mchType = mchType;
		this.mchId = mchId;
		this.mchOldNtwrkTrf = mchOldNtwrkTrf;
		this.mchNewNtwrkTrf = mchNewNtwrkTrf;
		this.mchMigrationNo = mchMigrationNo;
	};

	private static final int[] fieldSizes = new int[] { mchTypeSize, mchIdSize,
			mchOldNtwrkTrfSize, mchNewNtwrkTrfSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.mchType == null) ? null
						: (this.mchType.length() <= mchTypeSize) ? this.mchType
								: this.mchType.substring(0, this.mchTypeSize)),
				this.mchId,
				((this.mchOldNtwrkTrf == null) ? null : (this.mchOldNtwrkTrf
						.length() <= mchOldNtwrkTrfSize) ? this.mchOldNtwrkTrf
						: this.mchOldNtwrkTrf.substring(0,
								this.mchOldNtwrkTrfSize)),
				((this.mchNewNtwrkTrf == null) ? null : (this.mchNewNtwrkTrf
						.length() <= mchNewNtwrkTrfSize) ? this.mchNewNtwrkTrf
						: this.mchNewNtwrkTrf.substring(0,
								this.mchNewNtwrkTrfSize)), this.mchMigrationNo };
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
		return new DAOArgs(1).arg(this.mchId);
	}

	protected void set(Object[] fields) {
		this.mchType = rtrim((String) fields[0]);
		this.mchId = (Integer) fields[1];
		this.mchOldNtwrkTrf = rtrim((String) fields[2]);
		this.mchNewNtwrkTrf = rtrim((String) fields[3]);
		this.mchMigrationNo = ((Short) fields[4]);
	}

	public void set(final String mchType, final Integer mchId,
			final String mchOldNtwrkTrf, final String mchNewNtwrkTrf,
			final Short mchMigrationNo) {

		this.mchType = mchType;
		this.mchId = mchId;
		this.mchOldNtwrkTrf = mchOldNtwrkTrf;
		this.mchNewNtwrkTrf = mchNewNtwrkTrf;
		this.mchMigrationNo = mchMigrationNo;
	}

	public String getMchType() {
		return mchType;
	}

	public void setMchType(String mchType) {
		this.mchType = mchType;
	}

	public Integer getMchId() {
		return mchId;
	}

	public void setMchId(Integer mchId) {
		this.mchId = mchId;
	}

	public String getMchOldNtwrkTrf() {
		return mchOldNtwrkTrf;
	}

	public void setMchOldNtwrkTrf(String mchOldNtwrkTrf) {
		this.mchOldNtwrkTrf = mchOldNtwrkTrf;
	}

	public String getMchNewNtwrkTrf() {
		return mchNewNtwrkTrf;
	}

	public void setMchNewNtwrkTrf(String mchNewNtwrkTrf) {
		this.mchNewNtwrkTrf = mchNewNtwrkTrf;
	}

	public Short getMchMigrationNo() {
		return mchMigrationNo;
	}

	public void setMchMigrationNo(Short mchMigrationNo) {
		this.mchMigrationNo = mchMigrationNo;
	}

}
