package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EqtEquipTypeDMO extends DBO implements Serializable {

	private String eqtPartialImei;
	private String eqtMake;
	private String eqtModel;

	public static final int eqtPartialImeiFilter = 0;
	private static final int eqtPartialImeiSize = 15;

	public static final int eqtMakeFilter = 1;
	private static final int eqtMakeSize = 20;

	public static final int eqtModelFilter = 2;
	private static final int eqtModelSize = 15;

	public EqtEquipTypeDMO() {
	};

	public EqtEquipTypeDMO(final String eqtPartialImei, final String eqtMake,
			final String eqtModel) {

		this.eqtPartialImei = eqtPartialImei;
		this.eqtMake = eqtMake;
		this.eqtModel = eqtModel;
	};

	private static final int[] fieldSizes = new int[] { eqtPartialImeiSize,
			eqtMakeSize, eqtModelSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.eqtPartialImei == null) ? null : (this.eqtPartialImei
						.length() <= eqtPartialImeiSize) ? this.eqtPartialImei
						: this.eqtPartialImei.substring(0,
								this.eqtPartialImeiSize)),
				((this.eqtMake == null) ? null
						: (this.eqtMake.length() <= eqtMakeSize) ? this.eqtMake
								: this.eqtMake.substring(0, this.eqtMakeSize)),
				((this.eqtModel == null) ? null
						: (this.eqtModel.length() <= eqtModelSize) ? this.eqtModel
								: this.eqtModel.substring(0, this.eqtModelSize)) };
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
		return new DAOArgs(1).arg(this.eqtPartialImei);
	}

	protected void set(Object[] fields) {
		this.eqtPartialImei = rtrim((String) fields[0]);
		this.eqtMake = rtrim((String) fields[1]);
		this.eqtModel = rtrim((String) fields[2]);
	}

	public void set(final String eqtPartialImei, final String eqtMake,
			final String eqtModel) {

		this.eqtPartialImei = eqtPartialImei;
		this.eqtMake = eqtMake;
		this.eqtModel = eqtModel;
	}

	public String getEqtPartialImei() {
		return eqtPartialImei;
	}

	public void setEqtPartialImei(String eqtPartialImei) {
		this.eqtPartialImei = eqtPartialImei;
	}

	public String getEqtMake() {
		return eqtMake;
	}

	public void setEqtMake(String eqtMake) {
		this.eqtMake = eqtMake;
	}

	public String getEqtModel() {
		return eqtModel;
	}

	public void setEqtModel(String eqtModel) {
		this.eqtModel = eqtModel;
	}

}
