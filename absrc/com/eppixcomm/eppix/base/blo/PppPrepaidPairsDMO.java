package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
//import java.util.Date;

public class PppPrepaidPairsDMO extends DBO implements Serializable {

	private String PppBillAcNo;
	private Integer PppSubscriberId;
	private String PppSimNo;
	private String PppImsiNo;
	private String PppMsisdnNo;
	private String PppType;
	private Integer PppStatus;
	private Date PppStatusDate;
	private Date PppValidateDate;
	private Date PppActivateDate;
	private Date PppRechargeDate;
	private Float PppCreditRemain;
	private Date PppValidityEnd;
	private Date PppActivityEnd;
	private Date PppRechargeEnd;
	private String PppPackageCode;
	private String PppInternTariff;
	private String PppBillCycle;

	public static final int PppBillAcNoFilter = 0;
	private static final int PppBillAcNoSize = 8;

	public static final int PppSubscriberIdFilter = 1;

	public static final int PppSimNoFilter = 2;
	private static final int PppSimNoSize = 14;

	public static final int PppImsiNoFilter = 3;
	private static final int PppImsiNoSize = 15;

	public static final int PppMsisdnNoFilter = 4;
	private static final int PppMsisdnNoSize = 15;

	public static final int PppTypeFilter = 5;
	private static final int PppTypeSize = 5;

	public static final int PppStatusFilter = 6;

	public static final int PppStatusDateFilter = 7;

	public static final int PppValidateDateFilter = 8;

	public static final int PppActivateDateFilter = 9;

	public static final int PppRechargeDateFilter = 10;

	public static final int PppCreditRemainFilter = 11;

	public static final int PppValidityEndFilter = 12;

	public static final int PppActivityEndFilter = 13;

	public static final int PppRechargeEndFilter = 14;

	public static final int PppPackageCodeFilter = 15;
	private static final int PppPackageCodeSize = 5;

	public static final int PppInternTariffFilter = 16;
	private static final int PppInternTariffSize = 20;

	public static final int PppBillCycleFilter = 17;
	private static final int PppBillCycleSize = 5;

	public PppPrepaidPairsDMO() {
	};

	public PppPrepaidPairsDMO(final String PppBillAcNo,
			final Integer PppSubscriberId, final String PppSimNo,
			final String PppImsiNo, final String PppMsisdnNo,
			final String PppType, final Integer PppStatus,
			final Date PppStatusDate, final Date PppValidateDate,
			final Date PppActivateDate, final Date PppRechargeDate,
			final Float PppCreditRemain, final Date PppValidityEnd,
			final Date PppActivityEnd, final Date PppRechargeEnd,
			final String PppPackageCode, final String PppInternTariff,
			final String PppBillCycle) {

		this.PppBillAcNo = PppBillAcNo;
		this.PppSubscriberId = PppSubscriberId;
		this.PppSimNo = PppSimNo;
		this.PppImsiNo = PppImsiNo;
		this.PppMsisdnNo = PppMsisdnNo;
		this.PppType = PppType;
		this.PppStatus = PppStatus;
		this.PppStatusDate = PppStatusDate;
		this.PppValidateDate = PppValidateDate;
		this.PppActivateDate = PppActivateDate;
		this.PppRechargeDate = PppRechargeDate;
		this.PppCreditRemain = PppCreditRemain;
		this.PppValidityEnd = PppValidityEnd;
		this.PppActivityEnd = PppActivityEnd;
		this.PppRechargeEnd = PppRechargeEnd;
		this.PppPackageCode = PppPackageCode;
		this.PppInternTariff = PppInternTariff;
		this.PppBillCycle = PppBillCycle;
	};

	private static final int[] fieldSizes = new int[] { PppBillAcNoSize, 0,
			PppSimNoSize, PppImsiNoSize, PppMsisdnNoSize, PppTypeSize, 0, 0, 0,
			0, 0, 0, 0, 0, 0, PppPackageCodeSize, PppInternTariffSize,
			PppBillCycleSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATEONLY, FIELD_TYPE_DATEONLY, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_FLOAT, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.PppBillAcNo == null) ? null
						: (this.PppBillAcNo.length() <= PppBillAcNoSize) ? this.PppBillAcNo
								: this.PppBillAcNo.substring(0,
										this.PppBillAcNoSize)),
				this.PppSubscriberId,
				((this.PppSimNo == null) ? null
						: (this.PppSimNo.length() <= PppSimNoSize) ? this.PppSimNo
								: this.PppSimNo.substring(0, this.PppSimNoSize)),
				((this.PppImsiNo == null) ? null
						: (this.PppImsiNo.length() <= PppImsiNoSize) ? this.PppImsiNo
								: this.PppImsiNo.substring(0,
										this.PppImsiNoSize)),
				((this.PppMsisdnNo == null) ? null
						: (this.PppMsisdnNo.length() <= PppMsisdnNoSize) ? this.PppMsisdnNo
								: this.PppMsisdnNo.substring(0,
										this.PppMsisdnNoSize)),
				((this.PppType == null) ? null
						: (this.PppType.length() <= PppTypeSize) ? this.PppType
								: this.PppType.substring(0, this.PppTypeSize)),
				this.PppStatus,
				this.PppStatusDate,
				this.PppValidateDate,
				this.PppActivateDate,
				this.PppRechargeDate,
				this.PppCreditRemain,
				this.PppValidityEnd,
				this.PppActivityEnd,
				this.PppRechargeEnd,
				((this.PppPackageCode == null) ? null : (this.PppPackageCode
						.length() <= PppPackageCodeSize) ? this.PppPackageCode
						: this.PppPackageCode.substring(0,
								this.PppPackageCodeSize)),
				((this.PppInternTariff == null) ? null
						: (this.PppInternTariff.length() <= PppInternTariffSize) ? this.PppInternTariff
								: this.PppInternTariff.substring(0,
										this.PppInternTariffSize)),
				((this.PppBillCycle == null) ? null : (this.PppBillCycle
						.length() <= PppBillCycleSize) ? this.PppBillCycle
						: this.PppBillCycle.substring(0, this.PppBillCycleSize)) };
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
		return new DAOArgs(4).arg(this.PppSubscriberId).arg(this.PppSimNo)
				.arg(this.PppImsiNo).arg(PppMsisdnNo);
	}

	protected void set(Object[] fields) {
		this.PppBillAcNo = rtrim((String) fields[0]);
		this.PppSubscriberId = ((Integer) fields[1]);
		this.PppSimNo = rtrim((String) fields[2]);
		this.PppImsiNo = rtrim((String) fields[3]);
		this.PppMsisdnNo = rtrim((String) fields[4]);
		this.PppType = rtrim((String) fields[5]);
		this.PppStatus = ((Integer) fields[6]);
		this.PppStatusDate = (Date) fields[7];
		this.PppValidateDate = (Date) fields[8];
		this.PppActivateDate =(Date)fields[9];		
		this.PppRechargeDate = (Date) fields[10];
		this.PppCreditRemain = ((Float) fields[11]);
		this.PppValidityEnd = (fields[12] == null) ? null : new Date(fields[12]);
		this.PppActivityEnd = (fields[13] == null) ? null : new Date(fields[13]);
		this.PppRechargeEnd = (fields[14] == null) ? null : new Date(fields[14]);
		this.PppPackageCode = rtrim((String) fields[15]);
		this.PppInternTariff = rtrim((String) fields[16]);
		this.PppBillCycle = rtrim((String) fields[17]);
	}

	public void set(final String PppBillAcNo, final Integer PppSubscriberId,
			final String PppSimNo, final String PppImsiNo,
			final String PppMsisdnNo, final String PppType,
			final Integer PppStatus, final Date PppStatusDate,
			final Date PppValidateDate, final Date PppActivateDate,
			final Date PppRechargeDate, final Float PppCreditRemain,
			final Date PppValidityEnd, final Date PppActivityEnd,
			final Date PppRechargeEnd, final String PppPackageCode,
			final String PppInternTariff, final String PppBillCycle) {

		this.PppBillAcNo = PppBillAcNo;
		this.PppSubscriberId = PppSubscriberId;
		this.PppSimNo = PppSimNo;
		this.PppImsiNo = PppImsiNo;
		this.PppMsisdnNo = PppMsisdnNo;
		this.PppType = PppType;
		this.PppStatus = PppStatus;
		this.PppStatusDate = PppStatusDate;
		this.PppValidateDate = PppValidateDate;
		this.PppActivateDate = PppActivateDate;
		this.PppRechargeDate = PppRechargeDate;
		this.PppCreditRemain = PppCreditRemain;
		this.PppValidityEnd = PppValidityEnd;
		this.PppActivityEnd = PppActivityEnd;
		this.PppRechargeEnd = PppRechargeEnd;
		this.PppPackageCode = PppPackageCode;
		this.PppInternTariff = PppInternTariff;
		this.PppBillCycle = PppBillCycle;
	}

	public String getPppBillAcNo() {
		return PppBillAcNo;
	}

	public void setPppBillAcNo(String pppBillAcNo) {
		PppBillAcNo = pppBillAcNo;
	}

	public Integer getPppSubscriberId() {
		return PppSubscriberId;
	}

	public void setPppSubscriberId(Integer pppSubscriberId) {
		PppSubscriberId = pppSubscriberId;
	}

	public String getPppSimNo() {
		return PppSimNo;
	}

	public void setPppSimNo(String pppSimNo) {
		PppSimNo = pppSimNo;
	}

	public String getPppImsiNo() {
		return PppImsiNo;
	}

	public void setPppImsiNo(String pppImsiNo) {
		PppImsiNo = pppImsiNo;
	}

	public String getPppMsisdnNo() {
		return PppMsisdnNo;
	}

	public void setPppMsisdnNo(String pppMsisdnNo) {
		PppMsisdnNo = pppMsisdnNo;
	}

	public String getPppType() {
		return PppType;
	}

	public void setPppType(String pppType) {
		PppType = pppType;
	}

	public Integer getPppStatus() {
		return PppStatus;
	}

	public void setPppStatus(Integer pppStatus) {
		PppStatus = pppStatus;
	}

	public Date getPppStatusDate() {
		return PppStatusDate;
	}

	public void setPppStatusDate(Date pppStatusDate) {
		PppStatusDate = pppStatusDate;
	}

	public Date getPppValidateDate() {
		return PppValidateDate;
	}

	public void setPppValidateDate(Date pppValidateDate) {
		PppValidateDate = pppValidateDate;
	}

	public Date getPppActivateDate() {
		return PppActivateDate;
	}

	public void setPppActivateDate(Date pppActivateDate) {
		PppActivateDate = pppActivateDate;
	}

	public Date getPppRechargeDate() {
		return PppRechargeDate;
	}

	public void setPppRechargeDate(Date pppRechargeDate) {
		PppRechargeDate = pppRechargeDate;
	}

	public Float getPppCreditRemain() {
		return PppCreditRemain;
	}

	public void setPppCreditRemain(Float pppCreditRemain) {
		PppCreditRemain = pppCreditRemain;
	}

	public Date getPppValidityEnd() {
		return PppValidityEnd;
	}

	public void setPppValidityEnd(Date pppValidityEnd) {
		PppValidityEnd = pppValidityEnd;
	}

	public Date getPppActivityEnd() {
		return PppActivityEnd;
	}

	public void setPppActivityEnd(Date pppActivityEnd) {
		PppActivityEnd = pppActivityEnd;
	}

	public Date getPppRechargeEnd() {
		return PppRechargeEnd;
	}

	public void setPppRechargeEnd(Date pppRechargeEnd) {
		PppRechargeEnd = pppRechargeEnd;
	}

	public String getPppPackageCode() {
		return PppPackageCode;
	}

	public void setPppPackageCode(String pppPackageCode) {
		PppPackageCode = pppPackageCode;
	}

	public String getPppInternTariff() {
		return PppInternTariff;
	}

	public void setPppInternTariff(String pppInternTariff) {
		PppInternTariff = pppInternTariff;
	}

	public String getPppBillCycle() {
		return PppBillCycle;
	}

	public void setPppBillCycle(String pppBillCycle) {
		PppBillCycle = pppBillCycle;
	}

}