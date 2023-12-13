package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AuxEncryptedDMO extends DBO implements Serializable {

	private String billAcNo;
	private Integer keyVersion;
	private String ccNo;
	private String ccCvvNo;
	private String bankAcNo;
	private String idNo;
	private String passportNo;

	public static final int billAcNoFilter = 0;

	public static final int keyVersionFilter = 1;

	public static final int ccNoFilter = 2;

	public static final int ccCvvNoFilter = 3;

	public static final int bankAcNoFilter = 4;

	public static final int idNoFilter = 5;

	public static final int passportNoFilter = 6;

	public AuxEncryptedDMO() {
	};

	public AuxEncryptedDMO(final String billAcNo, final Integer keyVersion,
			final String ccNo, final String ccCvvNo, final String bankAcNo,
			final String idNo, final String passportNo) {

		this.billAcNo = billAcNo;
		this.keyVersion = keyVersion;
		this.ccNo = ccNo;
		this.ccCvvNo = ccCvvNo;
		this.bankAcNo = bankAcNo;
		this.idNo = idNo;
		this.passportNo = passportNo;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.billAcNo, this.keyVersion, this.ccNo,
				this.ccCvvNo, this.bankAcNo, this.idNo, this.passportNo };
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
		this.billAcNo = ((String) fields[0]);
		this.keyVersion = ((Integer) fields[1]);
		this.ccNo = ((String) fields[2]);
		this.ccCvvNo = ((String) fields[3]);
		this.bankAcNo = ((String) fields[4]);
		this.idNo = ((String) fields[5]);
		this.passportNo = ((String) fields[6]);
	}

	public void set(final String billAcNo, final Integer keyVersion,
			final String ccNo, final String ccCvvNo, final String bankAcNo,
			final String idNo, final String passportNo) {

		this.billAcNo = billAcNo;
		this.keyVersion = keyVersion;
		this.ccNo = ccNo;
		this.ccCvvNo = ccCvvNo;
		this.bankAcNo = bankAcNo;
		this.idNo = idNo;
		this.passportNo = passportNo;
	}

	public String getBillAcNo() {
		return billAcNo;
	}

	public void setBillAcNo(String billAcNo) {
		this.billAcNo = billAcNo;
	}

	public Integer getKeyVersion() {
		return keyVersion;
	}

	public void setKeyVersion(Integer keyVersion) {
		this.keyVersion = keyVersion;
	}

	public String getCcNo() {
		return ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public String getCcCvvNo() {
		return ccCvvNo;
	}

	public void setCcCvvNo(String ccCvvNo) {
		this.ccCvvNo = ccCvvNo;
	}

	public String getBankAcNo() {
		return bankAcNo;
	}

	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	@Override
	public String toString() {
		return "\nAuxEncryptedDMO [billAcNo=" + billAcNo + "\nkeyVersion="
				+ keyVersion + "\nccNo=" + ccNo + "\nccCvvNo=" + ccCvvNo
				+ "\nbankAcNo=" + bankAcNo + "\nidNo=" + idNo + "\npassportNo="
				+ passportNo + "]";
	}

}
