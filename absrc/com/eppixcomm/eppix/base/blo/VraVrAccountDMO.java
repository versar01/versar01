package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class VraVrAccountDMO extends DBO implements Serializable {

	private Integer vraId;
	private String vraBillAcNo;
	private Integer vraCapValue;
	private String vraEnabled;

	public static final int VraIdFilter = 0;

	public static final int VraBillAcNoFilter = 1;
	private static final int VraBillAcNoSize = 8;

	public static final int VraCapValueFilter = 2;

	public static final int VraEnabledFilter = 3;
	private static final int VraEnabledSize = 1;

	public VraVrAccountDMO() {
	};

	public VraVrAccountDMO(final Integer VraId, final String VraBillAcNo,
			final Integer VraCapValue, final String VraEnabled) {

		this.vraId = VraId;
		this.vraBillAcNo = VraBillAcNo;
		this.vraCapValue = VraCapValue;
		this.vraEnabled = VraEnabled;
	};

	private static final int[] fieldSizes = new int[] { 0, VraBillAcNoSize, 0,
			VraEnabledSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.vraId,
				((this.vraBillAcNo == null) ? null
						: (this.vraBillAcNo.length() <= VraBillAcNoSize) ? this.vraBillAcNo
								: this.vraBillAcNo.substring(0,
										this.VraBillAcNoSize)),
				this.vraCapValue,
				((this.vraEnabled == null) ? null
						: (this.vraEnabled.length() <= VraEnabledSize) ? this.vraEnabled
								: this.vraEnabled.substring(0,
										this.VraEnabledSize)) };
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
		return new DAOArgs(1).arg(this.vraId);
	}

	protected void set(Object[] fields) {
		this.vraId = ((Integer) fields[0]);
		this.vraBillAcNo = rtrim((String) fields[1]);
		this.vraCapValue = ((Integer) fields[2]);
		this.vraEnabled = rtrim((String) fields[3]);
	}

	public void set(final Integer VraId, final String VraBillAcNo,
			final Integer VraCapValue, final String VraEnabled) {

		this.vraId = VraId;
		this.vraBillAcNo = VraBillAcNo;
		this.vraCapValue = VraCapValue;
		this.vraEnabled = VraEnabled;
	}

	public Integer getVraId() {
		return vraId;
	}

	public void setVraId(Integer vraId) {
		this.vraId = vraId;
	}

	public String getVraBillAcNo() {
		return vraBillAcNo;
	}

	public void setVraBillAcNo(String vraBillAcNo) {
		this.vraBillAcNo = vraBillAcNo;
	}

	public Integer getVraCapValue() {
		return vraCapValue;
	}

	public void setVraCapValue(Integer vraCapValue) {
		this.vraCapValue = vraCapValue;
	}

	public String getVraEnabled() {
		return vraEnabled;
	}

	public void setVraEnabled(String vraEnabled) {
		this.vraEnabled = vraEnabled;
	}

}