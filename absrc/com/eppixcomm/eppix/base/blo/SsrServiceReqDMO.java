package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SsrServiceReqDMO extends DBO implements Serializable {

	private String ssrMsisdnNo;
	private DateTime ssrEffectiveDate;
	private String ssrReferenceNo;
	private String ssrNetwrkServ;
	private String ssrRecurring;
	private String ssrActionReq;
	private BigDecimal ssrProrateChg;
	private BigDecimal ssrSubCharge;
	private String ssrUnits;
	private String ssrUnitOfMeas;
	private Integer ssrLimitValue;
	private String ssrSystemReq;
	private String ssrStatus;
	private String ssrN2nReq;
	private String ssrBillAcNo;
	private Integer ssrSubscriberId;
	private String ssrSimNo;
	private String ssrPackageCode;
	private String ssrTariffCode;
	private String ssrInternalServ;
	private Integer ssrServParamId;
	private String ssrServParamVal;
	private DateTime ssrProcessedDate;
	private String ssrErrorMess;

	public static final int ssrMsisdnNoFilter = 0;
	private static final int ssrMsisdnNoSize = 15;

	public static final int ssrEffectiveDateFilter = 1;

	public static final int ssrReferenceNoFilter = 2;
	private static final int ssrReferenceNoSize = 32;

	public static final int ssrNetwrkServFilter = 3;
	private static final int ssrNetwrkServSize = 15;

	public static final int ssrRecurringFilter = 4;
	private static final int ssrRecurringSize = 1;

	public static final int ssrActionReqFilter = 5;
	private static final int ssrActionReqSize = 10;

	public static final int ssrProrateChgFilter = 6;

	public static final int ssrSubChargeFilter = 7;

	public static final int ssrUnitsFilter = 8;
	private static final int ssrUnitsSize = 10;

	public static final int ssrUnitOfMeasFilter = 9;
	private static final int ssrUnitOfMeasSize = 10;

	public static final int ssrLimitValueFilter = 10;

	public static final int ssrSystemReqFilter = 11;
	private static final int ssrSystemReqSize = 15;

	public static final int ssrStatusFilter = 12;
	private static final int ssrStatusSize = 1;

	public static final int ssrN2nReqFilter = 13;
	private static final int ssrN2nReqSize = 1;

	public static final int ssrBillAcNoFilter = 14;
	private static final int ssrBillAcNoSize = 8;

	public static final int ssrSubscriberIdFilter = 15;

	public static final int ssrSimNoFilter = 16;
	private static final int ssrSimNoSize = 14;

	public static final int ssrPackageCodeFilter = 17;
	private static final int ssrPackageCodeSize = 5;

	public static final int ssrTariffCodeFilter = 18;
	private static final int ssrTariffCodeSize = 20;

	public static final int ssrInternalServFilter = 19;
	private static final int ssrInternalServSize = 4;

	public static final int ssrServParamIdFilter = 20;

	public static final int ssrServParamValFilter = 21;
	private static final int ssrServParamValSize = 20;

	public static final int ssrProcessedDateFilter = 22;

	public static final int ssrErrorMessFilter = 23;
	private static final int ssrErrorMessSize = 500;

	public SsrServiceReqDMO() {
	};

	public SsrServiceReqDMO(final String ssrMsisdnNo,
			final DateTime ssrEffectiveDate, final String ssrReferenceNo,
			final String ssrNetwrkServ, final String ssrRecurring,
			final String ssrActionReq, final BigDecimal ssrProrateChg,
			final BigDecimal ssrSubCharge, final String ssrUnits,
			final String ssrUnitOfMeas, final Integer ssrLimitValue,
			final String ssrSystemReq, final String ssrStatus,
			final String ssrN2nReq, final String ssrBillAcNo,
			final Integer ssrSubscriberId, final String ssrSimNo,
			final String ssrPackageCode, final String ssrTariffCode,
			final String ssrInternalServ, final Integer ssrServParamId,
			final String ssrServParamVal, final DateTime ssrProcessedDate,
			final String ssrErrorMess) {

		this.ssrMsisdnNo = ssrMsisdnNo;
		this.ssrEffectiveDate = ssrEffectiveDate;
		this.ssrReferenceNo = ssrReferenceNo;
		this.ssrNetwrkServ = ssrNetwrkServ;
		this.ssrRecurring = ssrRecurring;
		this.ssrActionReq = ssrActionReq;
		this.ssrProrateChg = ssrProrateChg;
		this.ssrSubCharge = ssrSubCharge;
		this.ssrUnits = ssrUnits;
		this.ssrUnitOfMeas = ssrUnitOfMeas;
		this.ssrLimitValue = ssrLimitValue;
		this.ssrSystemReq = ssrSystemReq;
		this.ssrStatus = ssrStatus;
		this.ssrN2nReq = ssrN2nReq;
		this.ssrBillAcNo = ssrBillAcNo;
		this.ssrSubscriberId = ssrSubscriberId;
		this.ssrSimNo = ssrSimNo;
		this.ssrPackageCode = ssrPackageCode;
		this.ssrTariffCode = ssrTariffCode;
		this.ssrInternalServ = ssrInternalServ;
		this.ssrServParamId = ssrServParamId;
		this.ssrServParamVal = ssrServParamVal;
		this.ssrProcessedDate = ssrProcessedDate;
		this.ssrErrorMess = ssrErrorMess;
	};

	private static final int[] fieldSizes = new int[] { ssrMsisdnNoSize, 0, 0,
			ssrNetwrkServSize, ssrRecurringSize, ssrActionReqSize, 0, 0,
			ssrUnitsSize, ssrUnitOfMeasSize, 0, ssrSystemReqSize,
			ssrStatusSize, ssrN2nReqSize, ssrBillAcNoSize, 0, ssrSimNoSize,
			ssrPackageCodeSize, ssrTariffCodeSize, ssrInternalServSize, 0,
			ssrServParamValSize, 0, ssrErrorMessSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.ssrMsisdnNo == null) ? null
						: (this.ssrMsisdnNo.length() <= ssrMsisdnNoSize) ? this.ssrMsisdnNo
								: this.ssrMsisdnNo.substring(0,
										this.ssrMsisdnNoSize)),
				this.ssrEffectiveDate,

				((this.ssrReferenceNo == null) ? null : (this.ssrReferenceNo
						.length() <= ssrReferenceNoSize) ? this.ssrReferenceNo
						: this.ssrReferenceNo.substring(0,
								this.ssrReferenceNoSize)),
				((this.ssrNetwrkServ == null) ? null : (this.ssrNetwrkServ
						.length() <= ssrNetwrkServSize) ? this.ssrNetwrkServ
						: this.ssrNetwrkServ.substring(0,
								this.ssrNetwrkServSize)),
				((this.ssrRecurring == null) ? null : (this.ssrRecurring
						.length() <= ssrRecurringSize) ? this.ssrRecurring
						: this.ssrRecurring.substring(0, this.ssrRecurringSize)),
				((this.ssrActionReq == null) ? null : (this.ssrActionReq
						.length() <= ssrActionReqSize) ? this.ssrActionReq
						: this.ssrActionReq.substring(0, this.ssrActionReqSize)),
				this.ssrProrateChg,
				this.ssrSubCharge,
				((this.ssrUnits == null) ? null
						: (this.ssrUnits.length() <= ssrUnitsSize) ? this.ssrUnits
								: this.ssrUnits.substring(0, this.ssrUnitsSize)),
				((this.ssrUnitOfMeas == null) ? null : (this.ssrUnitOfMeas
						.length() <= ssrUnitOfMeasSize) ? this.ssrUnitOfMeas
						: this.ssrUnitOfMeas.substring(0,
								this.ssrUnitOfMeasSize)),
				this.ssrLimitValue,
				((this.ssrSystemReq == null) ? null : (this.ssrSystemReq
						.length() <= ssrSystemReqSize) ? this.ssrSystemReq
						: this.ssrSystemReq.substring(0, this.ssrSystemReqSize)),
				((this.ssrStatus == null) ? null
						: (this.ssrStatus.length() <= ssrStatusSize) ? this.ssrStatus
								: this.ssrStatus.substring(0,
										this.ssrStatusSize)),
				((this.ssrN2nReq == null) ? null
						: (this.ssrN2nReq.length() <= ssrN2nReqSize) ? this.ssrN2nReq
								: this.ssrN2nReq.substring(0,
										this.ssrN2nReqSize)),
				((this.ssrBillAcNo == null) ? null
						: (this.ssrBillAcNo.length() <= ssrBillAcNoSize) ? this.ssrBillAcNo
								: this.ssrBillAcNo.substring(0,
										this.ssrBillAcNoSize)),
				this.ssrSubscriberId,
				((this.ssrSimNo == null) ? null
						: (this.ssrSimNo.length() <= ssrSimNoSize) ? this.ssrSimNo
								: this.ssrSimNo.substring(0, this.ssrSimNoSize)),
				((this.ssrPackageCode == null) ? null : (this.ssrPackageCode
						.length() <= ssrPackageCodeSize) ? this.ssrPackageCode
						: this.ssrPackageCode.substring(0,
								this.ssrPackageCodeSize)),
				((this.ssrTariffCode == null) ? null : (this.ssrTariffCode
						.length() <= ssrTariffCodeSize) ? this.ssrTariffCode
						: this.ssrTariffCode.substring(0,
								this.ssrTariffCodeSize)),
				((this.ssrInternalServ == null) ? null
						: (this.ssrInternalServ.length() <= ssrInternalServSize) ? this.ssrInternalServ
								: this.ssrInternalServ.substring(0,
										this.ssrInternalServSize)),
				this.ssrServParamId,
				((this.ssrServParamVal == null) ? null
						: (this.ssrServParamVal.length() <= ssrServParamValSize) ? this.ssrServParamVal
								: this.ssrServParamVal.substring(0,
										this.ssrServParamValSize)),
				this.ssrProcessedDate,
				((this.ssrErrorMess == null) ? null : (this.ssrErrorMess
						.length() <= ssrErrorMessSize) ? this.ssrErrorMess
						: this.ssrErrorMess.substring(0, this.ssrErrorMessSize)) };
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
		return new DAOArgs(3).arg(this.ssrMsisdnNo).arg(this.ssrReferenceNo).arg(this.ssrActionReq);
	}

	protected void set(Object[] fields) {
		this.ssrMsisdnNo = rtrim((String) fields[0]);
		this.ssrEffectiveDate = ((fields[1] == null) ? null : (DateTime)fields[1]);
		this.ssrReferenceNo =  rtrim((String) fields[2]);
		this.ssrNetwrkServ = rtrim((String) fields[3]);
		this.ssrRecurring = rtrim((String) fields[4]);
		this.ssrActionReq = rtrim((String) fields[5]);
		this.ssrProrateChg = ((BigDecimal) fields[6]);
		this.ssrSubCharge = ((BigDecimal) fields[7]);
		this.ssrUnits = rtrim((String) fields[8]);
		this.ssrUnitOfMeas = rtrim((String) fields[9]);
		this.ssrLimitValue = ((Integer) fields[10]);
		this.ssrSystemReq = rtrim((String) fields[11]);
		this.ssrStatus = rtrim((String) fields[12]);
		this.ssrN2nReq = rtrim((String) fields[13]);
		this.ssrBillAcNo = rtrim((String) fields[14]);
		this.ssrSubscriberId = ((Integer) fields[15]);
		this.ssrSimNo = rtrim((String) fields[16]);
		this.ssrPackageCode = rtrim((String) fields[17]);
		this.ssrTariffCode = rtrim((String) fields[18]);
		this.ssrInternalServ = rtrim((String) fields[19]);
		this.ssrServParamId = ((Integer) fields[20]);
		this.ssrServParamVal = rtrim((String) fields[21]);
		this.ssrProcessedDate = ((fields[22] == null) ? null : (DateTime)fields[22]);
		this.ssrErrorMess = rtrim((String) fields[23]);
	}

	public void set(final String ssrMsisdnNo, final DateTime ssrEffectiveDate,
			final String ssrReferenceNo, final String ssrNetwrkServ,
			final String ssrRecurring, final String ssrActionReq,
			final BigDecimal ssrProrateChg, final BigDecimal ssrSubCharge,
			final String ssrUnits, final String ssrUnitOfMeas,
			final Integer ssrLimitValue, final String ssrSystemReq,
			final String ssrStatus, final String ssrN2nReq,
			final String ssrBillAcNo, final Integer ssrSubscriberId,
			final String ssrSimNo, final String ssrPackageCode,
			final String ssrTariffCode, final String ssrInternalServ,
			final Integer ssrServParamId, final String ssrServParamVal,
			final DateTime ssrProcessedDate, final String ssrErrorMess) {

		this.ssrMsisdnNo = ssrMsisdnNo;
		this.ssrEffectiveDate = ssrEffectiveDate;
		this.ssrReferenceNo = ssrReferenceNo;
		this.ssrNetwrkServ = ssrNetwrkServ;
		this.ssrRecurring = ssrRecurring;
		this.ssrActionReq = ssrActionReq;
		this.ssrProrateChg = ssrProrateChg;
		this.ssrSubCharge = ssrSubCharge;
		this.ssrUnits = ssrUnits;
		this.ssrUnitOfMeas = ssrUnitOfMeas;
		this.ssrLimitValue = ssrLimitValue;
		this.ssrSystemReq = ssrSystemReq;
		this.ssrStatus = ssrStatus;
		this.ssrN2nReq = ssrN2nReq;
		this.ssrBillAcNo = ssrBillAcNo;
		this.ssrSubscriberId = ssrSubscriberId;
		this.ssrSimNo = ssrSimNo;
		this.ssrPackageCode = ssrPackageCode;
		this.ssrTariffCode = ssrTariffCode;
		this.ssrInternalServ = ssrInternalServ;
		this.ssrServParamId = ssrServParamId;
		this.ssrServParamVal = ssrServParamVal;
		this.ssrProcessedDate = ssrProcessedDate;
		this.ssrErrorMess = ssrErrorMess;
	}

	public String getSsrMsisdnNo() {
		return ssrMsisdnNo;
	}

	public void setSsrMsisdnNo(String ssrMsisdnNo) {
		this.ssrMsisdnNo = ssrMsisdnNo;
	}

	public DateTime getSsrEffectiveDate() {
		return ssrEffectiveDate;
	}

	public void setSsrEffectiveDate(DateTime ssrEffectiveDate) {
		this.ssrEffectiveDate = ssrEffectiveDate;
	}

	public String getSsrReferenceNo() {
		return ssrReferenceNo;
	}

	public void setSsrReferenceNo(String ssrReferenceNo) {
		this.ssrReferenceNo = ssrReferenceNo;
	}

	public String getSsrNetwrkServ() {
		return ssrNetwrkServ;
	}

	public void setSsrNetwrkServ(String ssrNetwrkServ) {
		this.ssrNetwrkServ = ssrNetwrkServ;
	}

	public String getSsrRecurring() {
		return ssrRecurring;
	}

	public void setSsrRecurring(String ssrRecurring) {
		this.ssrRecurring = ssrRecurring;
	}

	public String getSsrActionReq() {
		return ssrActionReq;
	}

	public void setSsrActionReq(String ssrActionReq) {
		this.ssrActionReq = ssrActionReq;
	}

	public BigDecimal getSsrProrateChg() {
		return ssrProrateChg;
	}

	public void setSsrProrateChg(BigDecimal ssrProrateChg) {
		this.ssrProrateChg = ssrProrateChg;
	}

	public BigDecimal getSsrSubCharge() {
		return ssrSubCharge;
	}

	public void setSsrSubCharge(BigDecimal ssrSubCharge) {
		this.ssrSubCharge = ssrSubCharge;
	}

	public String getSsrUnits() {
		return ssrUnits;
	}

	public void setSsrUnits(String ssrUnits) {
		this.ssrUnits = ssrUnits;
	}

	public String getSsrUnitOfMeas() {
		return ssrUnitOfMeas;
	}

	public void setSsrUnitOfMeas(String ssrUnitOfMeas) {
		this.ssrUnitOfMeas = ssrUnitOfMeas;
	}

	public Integer getSsrLimitValue() {
		return ssrLimitValue;
	}

	public void setSsrLimitValue(Integer ssrLimitValue) {
		this.ssrLimitValue = ssrLimitValue;
	}

	public String getSsrSystemReq() {
		return ssrSystemReq;
	}

	public void setSsrSystemReq(String ssrSystemReq) {
		this.ssrSystemReq = ssrSystemReq;
	}

	public String getSsrStatus() {
		return ssrStatus;
	}

	public void setSsrStatus(String ssrStatus) {
		this.ssrStatus = ssrStatus;
	}

	public String getSsrN2nReq() {
		return ssrN2nReq;
	}

	public void setSsrN2nReq(String ssrN2nReq) {
		this.ssrN2nReq = ssrN2nReq;
	}

	public String getSsrBillAcNo() {
		return ssrBillAcNo;
	}

	public void setSsrBillAcNo(String ssrBillAcNo) {
		this.ssrBillAcNo = ssrBillAcNo;
	}

	public Integer getSsrSubscriberId() {
		return ssrSubscriberId;
	}

	public void setSsrSubscriberId(Integer ssrSubscriberId) {
		this.ssrSubscriberId = ssrSubscriberId;
	}

	public String getSsrSimNo() {
		return ssrSimNo;
	}

	public void setSsrSimNo(String ssrSimNo) {
		this.ssrSimNo = ssrSimNo;
	}

	public String getSsrPackageCode() {
		return ssrPackageCode;
	}

	public void setSsrPackageCode(String ssrPackageCode) {
		this.ssrPackageCode = ssrPackageCode;
	}

	public String getSsrTariffCode() {
		return ssrTariffCode;
	}

	public void setSsrTariffCode(String ssrTariffCode) {
		this.ssrTariffCode = ssrTariffCode;
	}

	public String getSsrInternalServ() {
		return ssrInternalServ;
	}

	public void setSsrInternalServ(String ssrInternalServ) {
		this.ssrInternalServ = ssrInternalServ;
	}

	public Integer getSsrServParamId() {
		return ssrServParamId;
	}

	public void setSsrServParamId(Integer ssrServParamId) {
		this.ssrServParamId = ssrServParamId;
	}

	public String getSsrServParamVal() {
		return ssrServParamVal;
	}

	public void setSsrServParamVal(String ssrServParamVal) {
		this.ssrServParamVal = ssrServParamVal;
	}

	public DateTime getSsrProcessedDate() {
		return ssrProcessedDate;
	}

	public void setSsrProcessedDate(DateTime ssrProcessedDate) {
		this.ssrProcessedDate = ssrProcessedDate;
	}

	public String getSsrErrorMess() {
		return ssrErrorMess;
	}

	public void setSsrErrorMess(String ssrErrorMess) {
		this.ssrErrorMess = ssrErrorMess;
	}

}