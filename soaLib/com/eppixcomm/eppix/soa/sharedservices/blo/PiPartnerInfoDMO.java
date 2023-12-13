package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PiPartnerInfoDMO extends DBO implements Serializable {

	private Integer piPartnerId;
	private String piPartnerName;
	private String piPartnerEmail;
	private String piPartnerPhone;
	private String piPartnerCode;
	private Short piPartnerLevel;
	private String piAgreementCode;
	private String piSwapPerson;
	private Date piStartDate;
	private Date piTermDate;
	private String piPartnerStatus;

	public static final int piPartnerIdFilter = 0;
	private static final int piPartnerIdSize = 7;

	public static final int piPartnerNameFilter = 1;
	private static final int piPartnerNameSize = 32;

	public static final int piPartnerEmailFilter = 2;
	private static final int piPartnerEmailSize = 256;

	public static final int piPartnerPhoneFilter = 3;
	private static final int piPartnerPhoneSize = 15;

	public static final int piPartnerCodeFilter = 4;
	private static final int piPartnerCodeSize = 25;

	public static final int piPartnerLevelFilter = 5;

	public static final int piAgreementCodeFilter = 6;
	private static final int piAgreementCodeSize = 30;

	public static final int piSwapPersonFilter = 7;
	private static final int piSwapPersonSize = 1;

	public static final int piStartDateFilter = 8;

	public static final int piTermDateFilter = 9;

	public static final int piPartnerStatusFilter = 10;
	private static final int piPartnerStatusSize = 1;

	public PiPartnerInfoDMO() {
	};

	public PiPartnerInfoDMO(final Integer piPartnerId,
			final String piPartnerName, final String piPartnerEmail,
			final String piPartnerPhone, final String piPartnerCode,
			final Short piPartnerLevel, final String piAgreementCode,
			final String piSwapPerson, final Date piStartDate,
			final Date piTermDate, final String piPartnerStatus) {

		this.piPartnerId = piPartnerId;
		this.piPartnerName = piPartnerName;
		this.piPartnerEmail = piPartnerEmail;
		this.piPartnerPhone = piPartnerPhone;
		this.piPartnerCode = piPartnerCode;
		this.piPartnerLevel = piPartnerLevel;
		this.piAgreementCode = piAgreementCode;
		this.piSwapPerson = piSwapPerson;
		this.piStartDate = piStartDate;
		this.piTermDate = piTermDate;
		this.piPartnerStatus = piPartnerStatus;
	};

	private static final int[] fieldSizes = new int[] { piPartnerIdSize,
			piPartnerNameSize, piPartnerEmailSize, piPartnerPhoneSize,
			piPartnerCodeSize, 0, piAgreementCodeSize, piSwapPersonSize, 0, 0,
			piPartnerStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.piPartnerId,
				((this.piPartnerName == null) ? null : (this.piPartnerName
						.length() <= piPartnerNameSize) ? this.piPartnerName
						: this.piPartnerName.substring(0,
								this.piPartnerNameSize)),
				((this.piPartnerEmail == null) ? null : (this.piPartnerEmail
						.length() <= piPartnerEmailSize) ? this.piPartnerEmail
						: this.piPartnerEmail.substring(0,
								this.piPartnerEmailSize)),
				((this.piPartnerPhone == null) ? null : (this.piPartnerPhone
						.length() <= piPartnerPhoneSize) ? this.piPartnerPhone
						: this.piPartnerPhone.substring(0,
								this.piPartnerPhoneSize)),
				((this.piPartnerCode == null) ? null : (this.piPartnerCode
						.length() <= piPartnerCodeSize) ? this.piPartnerCode
						: this.piPartnerCode.substring(0,
								this.piPartnerCodeSize)),
				this.piPartnerLevel,
				((this.piAgreementCode == null) ? null
						: (this.piAgreementCode.length() <= piAgreementCodeSize) ? this.piAgreementCode
								: this.piAgreementCode.substring(0,
										this.piAgreementCodeSize)),
				((this.piSwapPerson == null) ? null : (this.piSwapPerson
						.length() <= piSwapPersonSize) ? this.piSwapPerson
						: this.piSwapPerson.substring(0, this.piSwapPersonSize)),
				this.piStartDate,
				this.piTermDate,
				((this.piPartnerStatus == null) ? null
						: (this.piPartnerStatus.length() <= piPartnerStatusSize) ? this.piPartnerStatus
								: this.piPartnerStatus.substring(0,
										this.piPartnerStatusSize)) };
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
		return new DAOArgs(1).arg(this.piPartnerId);
	}

	protected void set(Object[] fields) {
		this.piPartnerId = (Integer) fields[0];
		this.piPartnerName = rtrim((String) fields[1]);
		this.piPartnerEmail = rtrim((String) fields[2]);
		this.piPartnerPhone = rtrim((String) fields[3]);
		this.piPartnerCode = rtrim((String) fields[4]);
		this.piPartnerLevel = ((Short) fields[5]);
		this.piAgreementCode = rtrim((String) fields[6]);
		this.piSwapPerson = rtrim((String) fields[7]);
		this.piStartDate = ((Date) fields[8]);
		this.piTermDate = ((Date) fields[9]);
		this.piPartnerStatus = rtrim((String) fields[10]);
	}

	public void set(final Integer piPartnerId, final String piPartnerName,
			final String piPartnerEmail, final String piPartnerPhone,
			final String piPartnerCode, final Short piPartnerLevel,
			final String piAgreementCode, final String piSwapPerson,
			final Date piStartDate, final Date piTermDate,
			final String piPartnerStatus) {

		this.piPartnerId = piPartnerId;
		this.piPartnerName = piPartnerName;
		this.piPartnerEmail = piPartnerEmail;
		this.piPartnerPhone = piPartnerPhone;
		this.piPartnerCode = piPartnerCode;
		this.piPartnerLevel = piPartnerLevel;
		this.piAgreementCode = piAgreementCode;
		this.piSwapPerson = piSwapPerson;
		this.piStartDate = piStartDate;
		this.piTermDate = piTermDate;
		this.piPartnerStatus = piPartnerStatus;
	}

	public Integer getPiPartnerId() {
		return piPartnerId;
	}

	public void setPiPartnerId(Integer piPartnerId) {
		this.piPartnerId = piPartnerId;
	}

	public String getPiPartnerName() {
		return piPartnerName;
	}

	public void setPiPartnerName(String piPartnerName) {
		this.piPartnerName = piPartnerName;
	}

	public String getPiPartnerEmail() {
		return piPartnerEmail;
	}

	public void setPiPartnerEmail(String piPartnerEmail) {
		this.piPartnerEmail = piPartnerEmail;
	}

	public String getPiPartnerPhone() {
		return piPartnerPhone;
	}

	public void setPiPartnerPhone(String piPartnerPhone) {
		this.piPartnerPhone = piPartnerPhone;
	}

	public String getPiPartnerCode() {
		return piPartnerCode;
	}

	public void setPiPartnerCode(String piPartnerCode) {
		this.piPartnerCode = piPartnerCode;
	}

	public Short getPiPartnerLevel() {
		return piPartnerLevel;
	}

	public void setPiPartnerLevel(Short piPartnerLevel) {
		this.piPartnerLevel = piPartnerLevel;
	}

	public String getPiAgreementCode() {
		return piAgreementCode;
	}

	public void setPiAgreementCode(String piAgreementCode) {
		this.piAgreementCode = piAgreementCode;
	}

	public String getPiSwapPerson() {
		return piSwapPerson;
	}

	public void setPiSwapPerson(String piSwapPerson) {
		this.piSwapPerson = piSwapPerson;
	}

	public Date getPiStartDate() {
		return piStartDate;
	}

	public void setPiStartDate(Date piStartDate) {
		this.piStartDate = piStartDate;
	}

	public Date getPiTermDate() {
		return piTermDate;
	}

	public void setPiTermDate(Date piTermDate) {
		this.piTermDate = piTermDate;
	}

	public String getPiPartnerStatus() {
		return piPartnerStatus;
	}

	public void setPiPartnerStatus(String piPartnerStatus) {
		this.piPartnerStatus = piPartnerStatus;
	}

}
