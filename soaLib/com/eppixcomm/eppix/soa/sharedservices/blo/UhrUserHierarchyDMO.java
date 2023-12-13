package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class UhrUserHierarchyDMO extends DBO implements Serializable {

	private String uhrLogin;
	private String uhrNodeId;
	private Short uhrNodeLevel;
	private Short uhrStaffCount;
	private String uhrSuperior;

	public static final int uhrLoginFilter = 0;
	private static final int uhrLoginSize = 20;

	public static final int uhrNodeIdFilter = 1;
	private static final int uhrNodeIdSize = 40;

	public static final int uhrNodeLevelFilter = 2;

	public static final int uhrStaffCountFilter = 3;

	public static final int uhrSuperiorFilter = 4;
	private static final int uhrSuperiorSize = 20;

	public UhrUserHierarchyDMO() {
	};

	public UhrUserHierarchyDMO(final String uhrLogin, final String uhrNodeId,
			final Short uhrNodeLevel, final Short uhrStaffCount,
			final String uhrSuperior) {

		this.uhrLogin = uhrLogin;
		this.uhrNodeId = uhrNodeId;
		this.uhrNodeLevel = uhrNodeLevel;
		this.uhrStaffCount = uhrStaffCount;
		this.uhrSuperior = uhrSuperior;
	};

	private static final int[] fieldSizes = new int[] { uhrLoginSize,
			uhrNodeIdSize, 0, 0, uhrSuperiorSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.uhrLogin == null) ? null
						: (this.uhrLogin.length() <= uhrLoginSize) ? this.uhrLogin
								: this.uhrLogin.substring(0, this.uhrLoginSize)),
				((this.uhrNodeId == null) ? null
						: (this.uhrNodeId.length() <= uhrNodeIdSize) ? this.uhrNodeId
								: this.uhrNodeId.substring(0,
										this.uhrNodeIdSize)),
				this.uhrNodeLevel,
				this.uhrStaffCount,
				((this.uhrSuperior == null) ? null
						: (this.uhrSuperior.length() <= uhrSuperiorSize) ? this.uhrSuperior
								: this.uhrSuperior.substring(0,
										this.uhrSuperiorSize)) };
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
		return new DAOArgs(1).arg(this.uhrLogin);
	}

	protected void set(Object[] fields) {
		this.uhrLogin = rtrim((String) fields[0]);
		this.uhrNodeId = rtrim((String) fields[1]);
		this.uhrNodeLevel = ((Short) fields[2]);
		this.uhrStaffCount = ((Short) fields[3]);
		this.uhrSuperior = rtrim((String) fields[4]);
	}

	public void set(final String uhrLogin, final String uhrNodeId,
			final Short uhrNodeLevel, final Short uhrStaffCount,
			final String uhrSuperior) {

		this.uhrLogin = uhrLogin;
		this.uhrNodeId = uhrNodeId;
		this.uhrNodeLevel = uhrNodeLevel;
		this.uhrStaffCount = uhrStaffCount;
		this.uhrSuperior = uhrSuperior;
	}

	public String getUhrLogin() {
		return uhrLogin;
	}

	public void setUhrLogin(String uhrLogin) {
		this.uhrLogin = uhrLogin;
	}

	public String getUhrNodeId() {
		return uhrNodeId;
	}

	public void setUhrNodeId(String uhrNodeId) {
		this.uhrNodeId = uhrNodeId;
	}

	public Short getUhrNodeLevel() {
		return uhrNodeLevel;
	}

	public void setUhrNodeLevel(Short uhrNodeLevel) {
		this.uhrNodeLevel = uhrNodeLevel;
	}

	public Short getUhrStaffCount() {
		return uhrStaffCount;
	}

	public void setUhrStaffCount(Short uhrStaffCount) {
		this.uhrStaffCount = uhrStaffCount;
	}

	public String getUhrSuperior() {
		return uhrSuperior;
	}

	public void setUhrSuperior(String uhrSuperior) {
		this.uhrSuperior = uhrSuperior;
	}

}
