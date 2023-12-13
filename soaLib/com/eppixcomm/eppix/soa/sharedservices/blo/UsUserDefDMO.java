package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class UsUserDefDMO extends DBO implements Serializable {

	private String usLogin;
	private String usName;
	private String usDepartment;
	private String usPassword;
	private String usEmail;
	private String usDiarySuspended;
	private String usStandin;
	private String usStandinAsMgr;
	private String usExternalType;
	private String usExternalCode;

	public static final int usLoginFilter = 0;
	private static final int usLoginSize = 20;

	public static final int usNameFilter = 1;
	private static final int usNameSize = 32;

	public static final int usDepartmentFilter = 2;
	private static final int usDepartmentSize = 4;

	public static final int usPasswordFilter = 3;
	private static final int usPasswordSize = 20;

	public static final int usEmailFilter = 4;
	private static final int usEmailSize = 50;

	public static final int usDiarySuspendedFilter = 5;
	private static final int usDiarySuspendedSize = 1;

	public static final int usStandinFilter = 6;
	private static final int usStandinSize = 20;

	public static final int usStandinAsMgrFilter = 7;
	private static final int usStandinAsMgrSize = 1;

	public static final int usExternalTypeFilter = 8;
	private static final int usExternalTypeSize = 20;

	public static final int usExternalCodeFilter = 9;
	private static final int usExternalCodeSize = 10;

	public UsUserDefDMO() {
	};

	public UsUserDefDMO(final String usLogin, final String usName,
			final String usDepartment, final String usPassword,
			final String usEmail, final String usDiarySuspended,
			final String usStandin, final String usStandinAsMgr,
			final String usExternalType, final String usExternalCode) {

		this.usLogin = usLogin;
		this.usName = usName;
		this.usDepartment = usDepartment;
		this.usPassword = usPassword;
		this.usEmail = usEmail;
		this.usDiarySuspended = usDiarySuspended;
		this.usStandin = usStandin;
		this.usStandinAsMgr = usStandinAsMgr;
		this.usExternalType = usExternalType;
		this.usExternalCode = usExternalCode;
	};

	private static final int[] fieldSizes = new int[] { usLoginSize,
			usNameSize, usDepartmentSize, usPasswordSize, usEmailSize,
			usDiarySuspendedSize, usStandinSize, usStandinAsMgrSize,
			usExternalTypeSize, usExternalCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.usLogin == null) ? null
						: (this.usLogin.length() <= usLoginSize) ? this.usLogin
								: this.usLogin.substring(0, this.usLoginSize)),
				((this.usName == null) ? null
						: (this.usName.length() <= usNameSize) ? this.usName
								: this.usName.substring(0, this.usNameSize)),
				((this.usDepartment == null) ? null : (this.usDepartment
						.length() <= usDepartmentSize) ? this.usDepartment
						: this.usDepartment.substring(0, this.usDepartmentSize)),
				((this.usPassword == null) ? null
						: (this.usPassword.length() <= usPasswordSize) ? this.usPassword
								: this.usPassword.substring(0,
										this.usPasswordSize)),
				((this.usEmail == null) ? null
						: (this.usEmail.length() <= usEmailSize) ? this.usEmail
								: this.usEmail.substring(0, this.usEmailSize)),
				((this.usDiarySuspended == null) ? null
						: (this.usDiarySuspended.length() <= usDiarySuspendedSize) ? this.usDiarySuspended
								: this.usDiarySuspended.substring(0,
										this.usDiarySuspendedSize)),
				((this.usStandin == null) ? null
						: (this.usStandin.length() <= usStandinSize) ? this.usStandin
								: this.usStandin.substring(0,
										this.usStandinSize)),
				((this.usStandinAsMgr == null) ? null : (this.usStandinAsMgr
						.length() <= usStandinAsMgrSize) ? this.usStandinAsMgr
						: this.usStandinAsMgr.substring(0,
								this.usStandinAsMgrSize)),
				((this.usExternalType == null) ? null : (this.usExternalType
						.length() <= usExternalTypeSize) ? this.usExternalType
						: this.usExternalType.substring(0,
								this.usExternalTypeSize)),
				((this.usExternalCode == null) ? null : (this.usExternalCode
						.length() <= usExternalCodeSize) ? this.usExternalCode
						: this.usExternalCode.substring(0,
								this.usExternalCodeSize)) };
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
		this.usLogin = rtrim((String) fields[0]);
		this.usName = rtrim((String) fields[1]);
		this.usDepartment = rtrim((String) fields[2]);
		this.usPassword = rtrim((String) fields[3]);
		this.usEmail = rtrim((String) fields[4]);
		this.usDiarySuspended = rtrim((String) fields[5]);
		this.usStandin = rtrim((String) fields[6]);
		this.usStandinAsMgr = rtrim((String) fields[7]);
		this.usExternalType = rtrim((String) fields[8]);
		this.usExternalCode = rtrim((String) fields[9]);
	}

	public void set(final String usLogin, final String usName,
			final String usDepartment, final String usPassword,
			final String usEmail, final String usDiarySuspended,
			final String usStandin, final String usStandinAsMgr,
			final String usExternalType, final String usExternalCode) {

		this.usLogin = usLogin;
		this.usName = usName;
		this.usDepartment = usDepartment;
		this.usPassword = usPassword;
		this.usEmail = usEmail;
		this.usDiarySuspended = usDiarySuspended;
		this.usStandin = usStandin;
		this.usStandinAsMgr = usStandinAsMgr;
		this.usExternalType = usExternalType;
		this.usExternalCode = usExternalCode;
	}

	public String getUsLogin() {
		return usLogin;
	}

	public void setUsLogin(String usLogin) {
		this.usLogin = usLogin;
	}

	public String getUsName() {
		return usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public String getUsDepartment() {
		return usDepartment;
	}

	public void setUsDepartment(String usDepartment) {
		this.usDepartment = usDepartment;
	}

	public String getUsPassword() {
		return usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public String getUsEmail() {
		return usEmail;
	}

	public void setUsEmail(String usEmail) {
		this.usEmail = usEmail;
	}

	public String getUsDiarySuspended() {
		return usDiarySuspended;
	}

	public void setUsDiarySuspended(String usDiarySuspended) {
		this.usDiarySuspended = usDiarySuspended;
	}

	public String getUsStandin() {
		return usStandin;
	}

	public void setUsStandin(String usStandin) {
		this.usStandin = usStandin;
	}

	public String getUsStandinAsMgr() {
		return usStandinAsMgr;
	}

	public void setUsStandinAsMgr(String usStandinAsMgr) {
		this.usStandinAsMgr = usStandinAsMgr;
	}

	public String getUsExternalType() {
		return usExternalType;
	}

	public void setUsExternalType(String usExternalType) {
		this.usExternalType = usExternalType;
	}

	public String getUsExternalCode() {
		return usExternalCode;
	}

	public void setUsExternalCode(String usExternalCode) {
		this.usExternalCode = usExternalCode;
	}

}
