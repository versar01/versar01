package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.util.Arrays;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class AsrAddServReqDMO extends DBO implements Serializable {

	private String asrTransactId;
	private Integer asrSubscriberId;
	private String asrServiceCode;
	private String asrActiveFlag;
	private Integer asrParamId;
	private String asrParamValue;
	private String asrMsisdnNo;
	private String asrToMsisdn;
	private String asrSimNo;
	private String asrToSim;
	private String asrPortId;
	private String asrFileId;
	private String asrBillAcNo;
	private String asrPackageCode;
	private String asrToPackage;
	private String asrTariffCode;
	private String asrToTarCode;
	private DateTime asrSubmitDate;
	private DateTime asrProcessedDate;
	private String asrProcessedStat;
	private String asrActionType;
	private String asrComments;
	private String asrSystemReq;
	private String asrActReasCode;
	private String asrDeactType;
	private Integer asrCntrPeriod;
	private String asrHandsetMake;
	private String asrHandsetModel;
	private String asrImei;
	private Double asrHandsetSubval;

	public static final int asrTransactIdFilter = 0; // filter index
	public static final int asrTransactIdSize = 45; // field size

	public static final int asrSubscriberIdFilter = 1; // filter index

	public static final int asrServiceCodeFilter = 2; // filter index
	public static final int asrServiceCodeSize = 4; // field size

	public static final int asrActiveFlagFilter = 3; // filter index
	public static final int asrActiveFlagSize = 1; // field size

	public static final int asrParamIdFilter = 4; // filter index

	public static final int asrParamValueFilter = 5; // filter index
	public static final int asrParamValueSize = 20; // field size

	public static final int asrMsisdnNoFilter = 6; // filter index
	public static final int asrMsisdnNoSize = 15; // field size

	public static final int asrToMsisdnFilter = 7; // filter index
	public static final int asrToMsisdnSize = 14; // field size

	public static final int asrSimNoFilter = 8; // filter index
	public static final int asrSimNoSize = 14; // field size

	public static final int asrToSimFilter = 9; // filter index
	public static final int asrToSimSize = 14; // field size

	public static final int asrPortIdFilter = 10; // filter index
	public static final int asrPortIdSize = 50; // field size

	public static final int asrFileIdFilter = 11; // filter index
	public static final int asrFileIdSize = 30; // field size

	public static final int asrBillAcNoFilter = 12; // filter index
	public static final int asrBillAcNoSize = 8; // field size

	public static final int asrPackageCodeFilter = 13; // filter index
	public static final int asrPackageCodeSize = 5; // field size

	public static final int asrToPackageFilter = 14; // filter index
	public static final int asrToPackageSize = 5; // field size

	public static final int asrTariffCodeFilter = 15; // filter index
	public static final int asrTariffCodeSize = 20; // field size

	public static final int asrToTarCodeFilter = 16; // filter index
	public static final int asrToTarCodeSize = 20; // field size

	public static final int asrSubmitDateFilter = 17; // filter index

	public static final int asrProcessedDateFilter = 18; // filter index

	public static final int asrProcessedStatFilter = 19; // filter index
	public static final int asrProcessedStatSize = 1; // field size

	public static final int asrActionTypeFilter = 20; // filter index
	public static final int asrActionTypeSize = 5; // field size

	public static final int asrCommentsFilter = 21; // filter index
	public static final int asrCommentsSize = 500; // field size

	public static final int asrSystemReqFilter = 22; // filter index
	public static final int asrSystemReqSize = 10; // field size

	public static final int asrActReasCodeFilter = 23; // filter index
	public static final int asrActReasCodeSize = 5; // field size

	public static final int asrDeactTypeFilter = 24; // filter index
	public static final int asrDeactTypeSize = 4; // field size

	public static final int asrCntrPeriodFilter = 25; // filter index

	public static final int asrHandsetMakeFilter = 26; // filter index
	public static final int asrHandsetMakeSize = 100; // field size

	public static final int asrHandsetModelFilter = 27; // filter index
	public static final int asrHandsetModelSize = 100; // field size

	public static final int asrImeiFilter = 28; // filter index
	public static final int asrImeiSize = 100; // field size

	public static final int asrHandsetSubvalFilter = 29; // filter index

	public AsrAddServReqDMO() {
	}

	public AsrAddServReqDMO(final String asrTransactId,
			final Integer asrSubscriberId, final String asrServiceCode,
			final String asrActiveFlag, final Integer asrParamId,
			final String asrParamValue, final String asrMsisdnNo,
			final String asrToMsisdn, final String asrSimNo,
			final String asrToSim, final String asrPortId,
			final String asrFileId, final String asrBillAcNo,
			final String asrPackageCode, final String asrToPackage,
			final String asrTariffCode, final String asrToTarCode,
			final DateTime asrSubmitDate, final DateTime asrProcessedDate,
			final String asrProcessedStat, final String asrActionType,
			final String asrComments, final String asrSystemReq,
			final String asrActReasCode, final String asrDeactType,
			final Integer asrCntrPeriod, final String asrHandsetMake,
			final String asrHandsetModel, final String asrImei,
			final Double asrHandsetSubval) {

		this.asrTransactId = asrTransactId;
		this.asrSubscriberId = asrSubscriberId;
		this.asrServiceCode = asrServiceCode;
		this.asrActiveFlag = asrActiveFlag;
		this.asrParamId = asrParamId;
		this.asrParamValue = asrParamValue;
		this.asrMsisdnNo = asrMsisdnNo;
		this.asrToMsisdn = asrToMsisdn;
		this.asrSimNo = asrSimNo;
		this.asrToSim = asrToSim;
		this.asrPortId = asrPortId;
		this.asrFileId = asrFileId;
		this.asrBillAcNo = asrBillAcNo;
		this.asrPackageCode = asrPackageCode;
		this.asrToPackage = asrToPackage;
		this.asrTariffCode = asrTariffCode;
		this.asrToTarCode = asrToTarCode;
		this.asrSubmitDate = asrSubmitDate;
		this.asrProcessedDate = asrProcessedDate;
		this.asrProcessedStat = asrProcessedStat;
		this.asrActionType = asrActionType;
		this.asrComments = asrComments;
		this.asrSystemReq = asrSystemReq;
		this.asrActReasCode = asrActReasCode;
		this.asrDeactType = asrDeactType;
		this.asrCntrPeriod = asrCntrPeriod;
		this.asrHandsetMake = asrHandsetMake;
		this.asrHandsetModel = asrHandsetModel;
		this.asrImei = asrImei;
		this.asrHandsetSubval = asrHandsetSubval;

	}

	protected void set(final String asrTransactId,
			final Integer asrSubscriberId, final String asrServiceCode,
			final String asrActiveFlag, final Integer asrParamId,
			final String asrParamValue, final String asrMsisdnNo,
			final String asrToMsisdn, final String asrSimNo,
			final String asrToSim, final String asrPortId,
			final String asrFileId, final String asrBillAcNo,
			final String asrPackageCode, final String asrToPackage,
			final String asrTariffCode, final String asrToTarCode,
			final DateTime asrSubmitDate, final DateTime asrProcessedDate,
			final String asrProcessedStat, final String asrActionType,
			final String asrComments, final String asrSystemReq,
			final String asrActReasCode, final String asrDeactType,
			final Integer asrCntrPeriod, final String asrHandsetMake,
			final String asrHandsetModel, final String asrImei,
			final Double asrHandsetSubval) {

		this.asrTransactId = asrTransactId;
		this.asrSubscriberId = asrSubscriberId;
		this.asrServiceCode = asrServiceCode;
		this.asrActiveFlag = asrActiveFlag;
		this.asrParamId = asrParamId;
		this.asrParamValue = asrParamValue;
		this.asrMsisdnNo = asrMsisdnNo;
		this.asrToMsisdn = asrToMsisdn;
		this.asrSimNo = asrSimNo;
		this.asrToSim = asrToSim;
		this.asrPortId = asrPortId;
		this.asrFileId = asrFileId;
		this.asrBillAcNo = asrBillAcNo;
		this.asrPackageCode = asrPackageCode;
		this.asrToPackage = asrToPackage;
		this.asrTariffCode = asrTariffCode;
		this.asrToTarCode = asrToTarCode;
		this.asrSubmitDate = asrSubmitDate;
		this.asrProcessedDate = asrProcessedDate;
		this.asrProcessedStat = asrProcessedStat;
		this.asrActionType = asrActionType;
		this.asrComments = asrComments;
		this.asrSystemReq = asrSystemReq;
		this.asrActReasCode = asrActReasCode;
		this.asrDeactType = asrDeactType;
		this.asrCntrPeriod = asrCntrPeriod;
		this.asrHandsetMake = asrHandsetMake;
		this.asrHandsetModel = asrHandsetModel;
		this.asrImei = asrImei;
		this.asrHandsetSubval = asrHandsetSubval;

	}

	protected void generatedKey(Integer key) {

	}

	protected Object[] get() {
		return new Object[] {
				(asrTransactId == null) ? null
						: ((asrTransactId.length() <= asrTransactIdSize) ? asrTransactId
								: asrTransactId.substring(0, asrTransactIdSize)),

				asrSubscriberId,

				(asrServiceCode == null) ? null
						: ((asrServiceCode.length() <= asrServiceCodeSize) ? asrServiceCode
								: asrServiceCode.substring(0,
										asrServiceCodeSize)),

				(asrActiveFlag == null) ? null
						: ((asrActiveFlag.length() <= asrActiveFlagSize) ? asrActiveFlag
								: asrActiveFlag.substring(0, asrActiveFlagSize)),

				asrParamId,

				(asrParamValue == null) ? null
						: ((asrParamValue.length() <= asrParamValueSize) ? asrParamValue
								: asrParamValue.substring(0, asrParamValueSize)),

				(asrMsisdnNo == null) ? null
						: ((asrMsisdnNo.length() <= asrMsisdnNoSize) ? asrMsisdnNo
								: asrMsisdnNo.substring(0, asrMsisdnNoSize)),

				(asrToMsisdn == null) ? null
						: ((asrToMsisdn.length() <= asrToMsisdnSize) ? asrToMsisdn
								: asrToMsisdn.substring(0, asrToMsisdnSize)),

				(asrSimNo == null) ? null
						: ((asrSimNo.length() <= asrSimNoSize) ? asrSimNo
								: asrSimNo.substring(0, asrSimNoSize)),

				(asrToSim == null) ? null
						: ((asrToSim.length() <= asrToSimSize) ? asrToSim
								: asrToSim.substring(0, asrToSimSize)),

				(asrPortId == null) ? null
						: ((asrPortId.length() <= asrPortIdSize) ? asrPortId
								: asrPortId.substring(0, asrPortIdSize)),

				(asrFileId == null) ? null
						: ((asrFileId.length() <= asrFileIdSize) ? asrFileId
								: asrFileId.substring(0, asrFileIdSize)),

				(asrBillAcNo == null) ? null
						: ((asrBillAcNo.length() <= asrBillAcNoSize) ? asrBillAcNo
								: asrBillAcNo.substring(0, asrBillAcNoSize)),

				(asrPackageCode == null) ? null
						: ((asrPackageCode.length() <= asrPackageCodeSize) ? asrPackageCode
								: asrPackageCode.substring(0,
										asrPackageCodeSize)),

				(asrToPackage == null) ? null
						: ((asrToPackage.length() <= asrToPackageSize) ? asrToPackage
								: asrToPackage.substring(0, asrToPackageSize)),

				(asrTariffCode == null) ? null
						: ((asrTariffCode.length() <= asrTariffCodeSize) ? asrTariffCode
								: asrTariffCode.substring(0, asrTariffCodeSize)),

				(asrToTarCode == null) ? null
						: ((asrToTarCode.length() <= asrToTarCodeSize) ? asrToTarCode
								: asrToTarCode.substring(0, asrToTarCodeSize)),

				asrSubmitDate,
				asrProcessedDate,

				(asrProcessedStat == null) ? null
						: ((asrProcessedStat.length() <= asrProcessedStatSize) ? asrProcessedStat
								: asrProcessedStat.substring(0,
										asrProcessedStatSize)),

				(asrActionType == null) ? null
						: ((asrActionType.length() <= asrActionTypeSize) ? asrActionType
								: asrActionType.substring(0, asrActionTypeSize)),

				(asrComments == null) ? null
						: ((asrComments.length() <= asrCommentsSize) ? asrComments
								: asrComments.substring(0, asrCommentsSize)),

				(asrSystemReq == null) ? null
						: ((asrSystemReq.length() <= asrSystemReqSize) ? asrSystemReq
								: asrSystemReq.substring(0, asrSystemReqSize)),

				(asrActReasCode == null) ? null
						: ((asrActReasCode.length() <= asrActReasCodeSize) ? asrActReasCode
								: asrActReasCode.substring(0,
										asrActReasCodeSize)),

				(asrDeactType == null) ? null
						: ((asrDeactType.length() <= asrDeactTypeSize) ? asrDeactType
								: asrDeactType.substring(0, asrDeactTypeSize)),

				asrCntrPeriod,

				(asrHandsetMake == null) ? null
						: ((asrHandsetMake.length() <= asrHandsetMakeSize) ? asrHandsetMake
								: asrHandsetMake.substring(0,
										asrHandsetMakeSize)),

				(asrHandsetModel == null) ? null
						: ((asrHandsetModel.length() <= asrHandsetModelSize) ? asrHandsetModel
								: asrHandsetModel.substring(0,
										asrHandsetModelSize)),

				(asrImei == null) ? null
						: ((asrImei.length() <= asrImeiSize) ? asrImei
								: asrImei.substring(0, asrImeiSize)),

				asrHandsetSubval

		};
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	private final int[] fieldSizes = new int[] { asrTransactIdSize, 0,
			asrServiceCodeSize, asrActiveFlagSize, 0, asrParamValueSize,
			asrMsisdnNoSize, asrToMsisdnSize, asrSimNoSize, asrToSimSize,
			asrPortIdSize, asrFileIdSize, asrBillAcNoSize, asrPackageCodeSize,
			asrToPackageSize, asrTariffCodeSize, asrToTarCodeSize, 0, 0,
			asrProcessedStatSize, asrActionTypeSize, asrCommentsSize,
			asrSystemReqSize, asrActReasCodeSize, asrDeactTypeSize, 0,
			asrHandsetMakeSize, asrHandsetModelSize, asrImeiSize, 0 };

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_DATETIME,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE };

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	// protected DAOArgs primaryKey() {
	// return new DAOArgs(6).arg(asrTransactId).
	// arg(asrServiceCode).
	// arg(asrFileId).
	// arg(asrSystemReq).
	// arg(asrParamId).
	// arg(asrParamValue);
	//
	// }

	protected DAOArgs primaryKey() {
		return null;
	}

	protected void set(final Object[] fields) {

		this.asrTransactId = rtrim((String) fields[0]);
		this.asrSubscriberId = (Integer) fields[1];
		this.asrServiceCode = rtrim((String) fields[2]);
		this.asrActiveFlag = rtrim((String) fields[3]);
		this.asrParamId = (Integer) fields[4];
		this.asrParamValue = rtrim((String) fields[5]);
		this.asrMsisdnNo = rtrim((String) fields[6]);
		this.asrToMsisdn = rtrim((String) fields[7]);
		this.asrSimNo = rtrim((String) fields[8]);
		this.asrToSim = rtrim((String) fields[9]);
		this.asrPortId = rtrim((String) fields[10]);
		this.asrFileId = rtrim((String) fields[11]);
		this.asrBillAcNo = rtrim((String) fields[12]);
		this.asrPackageCode = rtrim((String) fields[13]);
		this.asrToPackage = rtrim((String) fields[14]);
		this.asrTariffCode = rtrim((String) fields[15]);
		this.asrToTarCode = rtrim((String) fields[16]);
		this.asrSubmitDate = (DateTime) fields[17];
		this.asrProcessedDate = (DateTime) fields[18];
		this.asrProcessedStat = rtrim((String) fields[19]);
		this.asrActionType = rtrim((String) fields[20]);
		this.asrComments = rtrim((String) fields[21]);
		this.asrSystemReq = rtrim((String) fields[22]);
		this.asrActReasCode = rtrim((String) fields[23]);
		this.asrDeactType = rtrim((String) fields[24]);
		this.asrCntrPeriod = (Integer) fields[25];
		this.asrHandsetMake = rtrim((String) fields[26]);
		this.asrHandsetModel = rtrim((String) fields[27]);
		this.asrImei = rtrim((String) fields[28]);
		this.asrHandsetSubval = (Double) fields[29];
	}

	public String getAsrTransactId() {
		return asrTransactId;
	}

	public void setAsrTransactId(String asrTransactId) {
		this.asrTransactId = getPadded(asrTransactId, asrTransactIdFilter);
	}

	public Integer getAsrSubscriberId() {
		return asrSubscriberId;
	}

	public void setAsrSubscriberId(Integer asrSubscriberId) {
		this.asrSubscriberId = asrSubscriberId;
	}

	public String getAsrServiceCode() {
		return asrServiceCode;
	}

	public void setAsrServiceCode(String asrServiceCode) {
		this.asrServiceCode = getPadded(asrServiceCode, asrServiceCodeFilter);
	}

	public String getAsrActiveFlag() {
		return asrActiveFlag;
	}

	public void setAsrActiveFlag(String asrActiveFlag) {
		this.asrActiveFlag = getPadded(asrActiveFlag, asrActiveFlagFilter);
	}

	public Integer getAsrParamId() {
		return asrParamId;
	}

	public void setAsrParamId(Integer asrParamId) {
		this.asrParamId = asrParamId;
	}

	public String getAsrParamValue() {
		return asrParamValue;
	}

	public void setAsrParamValue(String asrParamValue) {
		this.asrParamValue = getPadded(asrParamValue, asrParamValueFilter);
	}

	public String getAsrMsisdnNo() {
		return asrMsisdnNo;
	}

	public void setAsrMsisdnNo(String asrMsisdnNo) {
		this.asrMsisdnNo = getPadded(asrMsisdnNo, asrMsisdnNoFilter);
	}

	public String getAsrToMsisdn() {
		return asrToMsisdn;
	}

	public void setAsrToMsisdn(String asrToMsisdn) {
		this.asrToMsisdn = getPadded(asrToMsisdn, asrToMsisdnFilter);
	}

	public String getAsrSimNo() {
		return asrSimNo;
	}

	public void setAsrSimNo(String asrSimNo) {
		this.asrSimNo = getPadded(asrSimNo, asrSimNoFilter);
	}

	public String getAsrToSim() {
		return asrToSim;
	}

	public void setAsrToSim(String asrToSim) {
		this.asrToSim = getPadded(asrToSim, asrToSimFilter);
	}

	public String getAsrPortId() {
		return asrPortId;
	}

	public void setAsrPortId(String asrPortId) {
		this.asrPortId = getPadded(asrPortId, asrPortIdFilter);
	}

	public String getAsrFileId() {
		return asrFileId;
	}

	public void setAsrFileId(String asrFileId) {
		this.asrFileId = getPadded(asrFileId, asrFileIdFilter);
	}

	public String getAsrBillAcNo() {
		return asrBillAcNo;
	}

	public void setAsrBillAcNo(String asrBillAcNo) {
		this.asrBillAcNo = getPadded(asrBillAcNo, asrBillAcNoFilter);
	}

	public String getAsrPackageCode() {
		return asrPackageCode;
	}

	public void setAsrPackageCode(String asrPackageCode) {
		this.asrPackageCode = getPadded(asrPackageCode, asrPackageCodeFilter);
	}

	public String getAsrToPackage() {
		return asrToPackage;
	}

	public void setAsrToPackage(String asrToPackage) {
		this.asrToPackage = getPadded(asrToPackage, asrToPackageFilter);
	}

	public String getAsrTariffCode() {
		return asrTariffCode;
	}

	public void setAsrTariffCode(String asrTariffCode) {
		this.asrTariffCode = getPadded(asrTariffCode, asrTariffCodeFilter);
	}

	public String getAsrToTarCode() {
		return asrToTarCode;
	}

	public void setAsrToTarCode(String asrToTarCode) {
		this.asrToTarCode = getPadded(asrToTarCode, asrToTarCodeFilter);
	}

	public DateTime getAsrSubmitDate() {
		return asrSubmitDate;
	}

	public void setAsrSubmitDate(DateTime asrSubmitDate) {
		this.asrSubmitDate = asrSubmitDate;
	}

	public DateTime getAsrProcessedDate() {
		return asrProcessedDate;
	}

	public void setAsrProcessedDate(DateTime asrProcessedDate) {
		this.asrProcessedDate = asrProcessedDate;
	}

	public String getAsrProcessedStat() {
		return asrProcessedStat;
	}

	public void setAsrProcessedStat(String asrProcessedStat) {
		this.asrProcessedStat = getPadded(asrProcessedStat,
				asrProcessedStatFilter);
	}

	public String getAsrActionType() {
		return asrActionType;
	}

	public void setAsrActionType(String asrActionType) {
		this.asrActionType = getPadded(asrActionType, asrActionTypeFilter);
	}

	public String getAsrComments() {
		return asrComments;
	}

	public void setAsrComments(String asrComments) {
		this.asrComments = getPadded(asrComments, asrCommentsFilter);
	}

	public String getAsrSystemReq() {
		return asrSystemReq;
	}

	public void setAsrSystemReq(String asrSystemReq) {
		this.asrSystemReq = getPadded(asrSystemReq, asrSystemReqFilter);
	}

	public String getAsrActReasCode() {
		return asrActReasCode;
	}

	public void setAsrActReasCode(String asrActReasCode) {
		this.asrActReasCode = getPadded(asrActReasCode, asrActReasCodeFilter);
	}

	public String getAsrDeactType() {
		return asrDeactType;
	}

	public void setAsrDeactType(String asrDeactType) {
		this.asrDeactType = getPadded(asrDeactType, asrDeactTypeFilter);
	}

	public Integer getAsrCntrPeriod() {
		return asrCntrPeriod;
	}

	public void setAsrCntrPeriod(Integer asrCntrPeriod) {
		this.asrCntrPeriod = asrCntrPeriod;
	}

	public String getAsrHandsetMake() {
		return asrHandsetMake;
	}

	public void setAsrHandsetMake(String asrHandsetMake) {
		this.asrHandsetMake = getPadded(asrHandsetMake, asrHandsetMakeFilter);
	}

	public String getAsrHandsetModel() {
		return asrHandsetModel;
	}

	public void setAsrHandsetModel(String asrHandsetModel) {
		this.asrHandsetModel = getPadded(asrHandsetModel, asrHandsetModelFilter);
	}

	public String getAsrImei() {
		return asrImei;
	}

	public void setAsrImei(String asrImei) {
		this.asrImei = getPadded(asrImei, asrImeiFilter);
	}

	public Double getAsrHandsetSubval() {
		return asrHandsetSubval;
	}

	public void setAsrHandsetSubval(Double asrHandsetSubval) {
		this.asrHandsetSubval = asrHandsetSubval;
	}

	@Override
	public String toString() {
		return "\nAsrAddServReqDMO [\nasrTransactId=" + asrTransactId
				+ "\nasrSubscriberId=" + asrSubscriberId + "\nasrServiceCode="
				+ asrServiceCode + "\nasrActiveFlag=" + asrActiveFlag
				+ "\nasrParamId=" + asrParamId + "\nasrParamValue="
				+ asrParamValue + "\nasrMsisdnNo=" + asrMsisdnNo
				+ "\nasrToMsisdn=" + asrToMsisdn + "\nasrSimNo=" + asrSimNo
				+ "\nasrToSim=" + asrToSim + "\nasrPortId=" + asrPortId
				+ "\nasrFileId=" + asrFileId + "\nasrBillAcNo=" + asrBillAcNo
				+ "\nasrPackageCode=" + asrPackageCode + "\nasrToPackage="
				+ asrToPackage + "\nasrTariffCode=" + asrTariffCode
				+ "\nasrToTarCode=" + asrToTarCode + "\nasrSubmitDate="
				+ asrSubmitDate + "\nasrProcessedDate=" + asrProcessedDate
				+ "\nasrProcessedStat=" + asrProcessedStat + "\nasrActionType="
				+ asrActionType + "\nasrComments=" + asrComments
				+ "\nasrSystemReq=" + asrSystemReq + "\nasrActReasCode="
				+ asrActReasCode + "\nasrDeactType=" + asrDeactType
				+ "\nasrCntrPeriod=" + asrCntrPeriod + "\nasrHandsetMake="
				+ asrHandsetMake + "\nasrHandsetModel=" + asrHandsetModel
				+ "\nasrImei=" + asrImei + "\nasrHandsetSubval="
				+ asrHandsetSubval + "\nfieldSizes="
				+ Arrays.toString(fieldSizes) + "]";
	}

}