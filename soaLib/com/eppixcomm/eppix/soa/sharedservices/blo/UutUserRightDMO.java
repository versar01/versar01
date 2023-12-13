package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class UutUserRightDMO extends DBO implements Serializable {

	private String uutLogin;
	private String uutRightId;
	private Integer uutAttribId;
	private String uutAddRemove;

	public static final int uutLoginFilter = 0;
	private static final int uutLoginSize = 20;

	public static final int uutRightIdFilter = 1;
	private static final int uutRightIdSize = 8;

	public static final int uutAttribIdFilter = 2;

	public static final int uutAddRemoveFilter = 3;
	private static final int uutAddRemoveSize = 1;

	public UutUserRightDMO() {
	};

	public UutUserRightDMO(final String uutLogin, final String uutRightId,
			final Integer uutAttribId, final String uutAddRemove) {

		this.uutLogin = uutLogin;
		this.uutRightId = uutRightId;
		this.uutAttribId = uutAttribId;
		this.uutAddRemove = uutAddRemove;
	};

	private static final int[] fieldSizes = new int[] { uutLoginSize,
			uutRightIdSize, 0, uutAddRemoveSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.uutLogin == null) ? null
						: (this.uutLogin.length() <= uutLoginSize) ? this.uutLogin
								: this.uutLogin.substring(0, this.uutLoginSize)),
				((this.uutRightId == null) ? null
						: (this.uutRightId.length() <= uutRightIdSize) ? this.uutRightId
								: this.uutRightId.substring(0,
										this.uutRightIdSize)),
				this.uutAttribId,
				((this.uutAddRemove == null) ? null : (this.uutAddRemove
						.length() <= uutAddRemoveSize) ? this.uutAddRemove
						: this.uutAddRemove.substring(0, this.uutAddRemoveSize)) };
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
		return new DAOArgs(2).arg(this.uutLogin).arg(this.uutRightId);
	}

	protected void set(Object[] fields) {
		this.uutLogin = rtrim((String) fields[0]);
		this.uutRightId = rtrim((String) fields[1]);
		this.uutAttribId = ((Integer) fields[2]);
		this.uutAddRemove = rtrim((String) fields[3]);
	}

	public void set(final String uutLogin, final String uutRightId,
			final Integer uutAttribId, final String uutAddRemove) {

		this.uutLogin = uutLogin;
		this.uutRightId = uutRightId;
		this.uutAttribId = uutAttribId;
		this.uutAddRemove = uutAddRemove;
	}

	public String getUutLogin() {
		return uutLogin;
	}

	public void setUutLogin(String uutLogin) {
		this.uutLogin = uutLogin;
	}

	public String getUutRightId() {
		return uutRightId;
	}

	public void setUutRightId(String uutRightId) {
		this.uutRightId = uutRightId;
	}

	public Integer getUutAttribId() {
		return uutAttribId;
	}

	public void setUutAttribId(Integer uutAttribId) {
		this.uutAttribId = uutAttribId;
	}

	public String getUutAddRemove() {
		return uutAddRemove;
	}

	public void setUutAddRemove(String uutAddRemove) {
		this.uutAddRemove = uutAddRemove;
	}

}
