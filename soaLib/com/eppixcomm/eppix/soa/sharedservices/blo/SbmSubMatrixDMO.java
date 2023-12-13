package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbmSubMatrixDMO extends DBO implements Serializable {

	private Integer sbmRuleNo;
	private String sbmRuleDesc;
	private String sbmPackageCode;
	private String sbmTariffCode;
	private String sbmAccountStatus;
	private String sbmCollPlan;
	private String sbmPaymentPlan;
	private String sbmMtnStatus;
	private String sbmCustomerType;
	private Integer sbmDaysSuspend;
	private Integer sbmContractLen;
	private String sbmAgeing;
	private Integer sbmContractAge;
	private String sbmAction;
	private Date sbmDate;
	private String sbmUserid;
	private String sbmRuleInd;
	private String sbmStatus;
	private String sbmParentAccount;
	private String sbmRightId;
	private String sbmCrmValue;

	public static final int sbmRuleNoFilter = 0;
	private static final int sbmRuleNoSize = 33;

	public static final int sbmRuleDescFilter = 1;
	private static final int sbmRuleDescSize = 64;

	public static final int sbmPackageCodeFilter = 2;
	private static final int sbmPackageCodeSize = 5;

	public static final int sbmTariffCodeFilter = 3;
	private static final int sbmTariffCodeSize = 3;

	public static final int sbmAccountStatusFilter = 4;
	private static final int sbmAccountStatusSize = 15;

	public static final int sbmCollPlanFilter = 5;
	private static final int sbmCollPlanSize = 8;

	public static final int sbmPaymentPlanFilter = 6;
	private static final int sbmPaymentPlanSize = 10;

	public static final int sbmMtnStatusFilter = 7;
	private static final int sbmMtnStatusSize = 15;

	public static final int sbmCustomerTypeFilter = 8;
	private static final int sbmCustomerTypeSize = 15;

	public static final int sbmDaysSuspendFilter = 9;

	public static final int sbmContractLenFilter = 10;

	public static final int sbmAgeingFilter = 11;
	private static final int sbmAgeingSize = 10;

	public static final int sbmContractAgeFilter = 12;

	public static final int sbmActionFilter = 13;
	private static final int sbmActionSize = 1;

	public static final int sbmDateFilter = 14;

	public static final int sbmUseridFilter = 15;
	private static final int sbmUseridSize = 10;

	public static final int sbmRuleIndFilter = 16;
	private static final int sbmRuleIndSize = 1;

	public static final int sbmStatusFilter = 17;
	private static final int sbmStatusSize = 1;

	public static final int sbmParentAccountFilter = 18;
	private static final int sbmParentAccountSize = 1;

	public static final int sbmRightIdFilter = 19;
	private static final int sbmRightIdSize = 8;

	public static final int sbmCrmValueFilter = 20;
	private static final int sbmCrmValueSize = 8;

	public SbmSubMatrixDMO() {
	};

	public SbmSubMatrixDMO(final Integer sbmRuleNo, final String sbmRuleDesc,
			final String sbmPackageCode, final String sbmTariffCode,
			final String sbmAccountStatus, final String sbmCollPlan,
			final String sbmPaymentPlan, final String sbmMtnStatus,
			final String sbmCustomerType, final Integer sbmDaysSuspend,
			final Integer sbmContractLen, final String sbmAgeing,
			final Integer sbmContractAge, final String sbmAction,
			final Date sbmDate, final String sbmUserid,
			final String sbmRuleInd, final String sbmStatus,
			final String sbmParentAccount, final String sbmRightId,
			final String sbmCrmValue) {

		this.sbmRuleNo = sbmRuleNo;
		this.sbmRuleDesc = sbmRuleDesc;
		this.sbmPackageCode = sbmPackageCode;
		this.sbmTariffCode = sbmTariffCode;
		this.sbmAccountStatus = sbmAccountStatus;
		this.sbmCollPlan = sbmCollPlan;
		this.sbmPaymentPlan = sbmPaymentPlan;
		this.sbmMtnStatus = sbmMtnStatus;
		this.sbmCustomerType = sbmCustomerType;
		this.sbmDaysSuspend = sbmDaysSuspend;
		this.sbmContractLen = sbmContractLen;
		this.sbmAgeing = sbmAgeing;
		this.sbmContractAge = sbmContractAge;
		this.sbmAction = sbmAction;
		this.sbmDate = sbmDate;
		this.sbmUserid = sbmUserid;
		this.sbmRuleInd = sbmRuleInd;
		this.sbmStatus = sbmStatus;
		this.sbmParentAccount = sbmParentAccount;
		this.sbmRightId = sbmRightId;
		this.sbmCrmValue = sbmCrmValue;
	};

	private static final int[] fieldSizes = new int[] { 0, sbmRuleDescSize,
			sbmPackageCodeSize, sbmTariffCodeSize, sbmAccountStatusSize,
			sbmCollPlanSize, sbmPaymentPlanSize, sbmMtnStatusSize,
			sbmCustomerTypeSize, 0, 0, sbmAgeingSize, 0, sbmActionSize, 0,
			sbmUseridSize, sbmRuleIndSize, sbmStatusSize, sbmParentAccountSize,
			sbmRightIdSize, sbmCrmValueSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbmRuleNo,
				((this.sbmRuleDesc == null) ? null
						: (this.sbmRuleDesc.length() <= sbmRuleDescSize) ? this.sbmRuleDesc
								: this.sbmRuleDesc.substring(0,
										this.sbmRuleDescSize)),
				((this.sbmPackageCode == null) ? null : (this.sbmPackageCode
						.length() <= sbmPackageCodeSize) ? this.sbmPackageCode
						: this.sbmPackageCode.substring(0,
								this.sbmPackageCodeSize)),
				((this.sbmTariffCode == null) ? null : (this.sbmTariffCode
						.length() <= sbmTariffCodeSize) ? this.sbmTariffCode
						: this.sbmTariffCode.substring(0,
								this.sbmTariffCodeSize)),
				((this.sbmAccountStatus == null) ? null
						: (this.sbmAccountStatus.length() <= sbmAccountStatusSize) ? this.sbmAccountStatus
								: this.sbmAccountStatus.substring(0,
										this.sbmAccountStatusSize)),
				((this.sbmCollPlan == null) ? null
						: (this.sbmCollPlan.length() <= sbmCollPlanSize) ? this.sbmCollPlan
								: this.sbmCollPlan.substring(0,
										this.sbmCollPlanSize)),
				((this.sbmPaymentPlan == null) ? null : (this.sbmPaymentPlan
						.length() <= sbmPaymentPlanSize) ? this.sbmPaymentPlan
						: this.sbmPaymentPlan.substring(0,
								this.sbmPaymentPlanSize)),
				((this.sbmMtnStatus == null) ? null : (this.sbmMtnStatus
						.length() <= sbmMtnStatusSize) ? this.sbmMtnStatus
						: this.sbmMtnStatus.substring(0, this.sbmMtnStatusSize)),
				((this.sbmCustomerType == null) ? null
						: (this.sbmCustomerType.length() <= sbmCustomerTypeSize) ? this.sbmCustomerType
								: this.sbmCustomerType.substring(0,
										this.sbmCustomerTypeSize)),
				this.sbmDaysSuspend,
				this.sbmContractLen,
				((this.sbmAgeing == null) ? null
						: (this.sbmAgeing.length() <= sbmAgeingSize) ? this.sbmAgeing
								: this.sbmAgeing.substring(0,
										this.sbmAgeingSize)),
				this.sbmContractAge,
				((this.sbmAction == null) ? null
						: (this.sbmAction.length() <= sbmActionSize) ? this.sbmAction
								: this.sbmAction.substring(0,
										this.sbmActionSize)),
				this.sbmDate,
				((this.sbmUserid == null) ? null
						: (this.sbmUserid.length() <= sbmUseridSize) ? this.sbmUserid
								: this.sbmUserid.substring(0,
										this.sbmUseridSize)),
				((this.sbmRuleInd == null) ? null
						: (this.sbmRuleInd.length() <= sbmRuleIndSize) ? this.sbmRuleInd
								: this.sbmRuleInd.substring(0,
										this.sbmRuleIndSize)),
				((this.sbmStatus == null) ? null
						: (this.sbmStatus.length() <= sbmStatusSize) ? this.sbmStatus
								: this.sbmStatus.substring(0,
										this.sbmStatusSize)),
				((this.sbmParentAccount == null) ? null
						: (this.sbmParentAccount.length() <= sbmParentAccountSize) ? this.sbmParentAccount
								: this.sbmParentAccount.substring(0,
										this.sbmParentAccountSize)),
				((this.sbmRightId == null) ? null
						: (this.sbmRightId.length() <= sbmRightIdSize) ? this.sbmRightId
								: this.sbmRightId.substring(0,
										this.sbmRightIdSize)),
				((this.sbmCrmValue == null) ? null
						: (this.sbmCrmValue.length() <= sbmCrmValueSize) ? this.sbmCrmValue
								: this.sbmCrmValue.substring(0,
										this.sbmCrmValueSize)) };
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
		this.sbmRuleNo = (Integer) fields[0];
		this.sbmRuleDesc = rtrim((String) fields[1]);
		this.sbmPackageCode = rtrim((String) fields[2]);
		this.sbmTariffCode = rtrim((String) fields[3]);
		this.sbmAccountStatus = rtrim((String) fields[4]);
		this.sbmCollPlan = rtrim((String) fields[5]);
		this.sbmPaymentPlan = rtrim((String) fields[6]);
		this.sbmMtnStatus = rtrim((String) fields[7]);
		this.sbmCustomerType = rtrim((String) fields[8]);
		this.sbmDaysSuspend = ((Integer) fields[9]);
		this.sbmContractLen = ((Integer) fields[10]);
		this.sbmAgeing = rtrim((String) fields[11]);
		this.sbmContractAge = ((Integer) fields[12]);
		this.sbmAction = rtrim((String) fields[13]);
		this.sbmDate = ((fields[14] == null) ? null : new Date(fields[14]));
		this.sbmUserid = rtrim((String) fields[15]);
		this.sbmRuleInd = rtrim((String) fields[16]);
		this.sbmStatus = rtrim((String) fields[17]);
		this.sbmParentAccount = rtrim((String) fields[18]);
		this.sbmRightId = rtrim((String) fields[19]);
		this.sbmCrmValue = rtrim((String) fields[20]);
	}

	public void set(final Integer sbmRuleNo, final String sbmRuleDesc,
			final String sbmPackageCode, final String sbmTariffCode,
			final String sbmAccountStatus, final String sbmCollPlan,
			final String sbmPaymentPlan, final String sbmMtnStatus,
			final String sbmCustomerType, final Integer sbmDaysSuspend,
			final Integer sbmContractLen, final String sbmAgeing,
			final Integer sbmContractAge, final String sbmAction,
			final Date sbmDate, final String sbmUserid,
			final String sbmRuleInd, final String sbmStatus,
			final String sbmParentAccount, final String sbmRightId,
			final String sbmCrmValue) {

		this.sbmRuleNo = sbmRuleNo;
		this.sbmRuleDesc = sbmRuleDesc;
		this.sbmPackageCode = sbmPackageCode;
		this.sbmTariffCode = sbmTariffCode;
		this.sbmAccountStatus = sbmAccountStatus;
		this.sbmCollPlan = sbmCollPlan;
		this.sbmPaymentPlan = sbmPaymentPlan;
		this.sbmMtnStatus = sbmMtnStatus;
		this.sbmCustomerType = sbmCustomerType;
		this.sbmDaysSuspend = sbmDaysSuspend;
		this.sbmContractLen = sbmContractLen;
		this.sbmAgeing = sbmAgeing;
		this.sbmContractAge = sbmContractAge;
		this.sbmAction = sbmAction;
		this.sbmDate = sbmDate;
		this.sbmUserid = sbmUserid;
		this.sbmRuleInd = sbmRuleInd;
		this.sbmStatus = sbmStatus;
		this.sbmParentAccount = sbmParentAccount;
		this.sbmRightId = sbmRightId;
		this.sbmCrmValue = sbmCrmValue;
	}

	public Integer getSbmRuleNo() {
		return sbmRuleNo;
	}

	public void setSbmRuleNo(Integer sbmRuleNo) {
		this.sbmRuleNo = sbmRuleNo;
	}

	public String getSbmRuleDesc() {
		return sbmRuleDesc;
	}

	public void setSbmRuleDesc(String sbmRuleDesc) {
		this.sbmRuleDesc = sbmRuleDesc;
	}

	public String getSbmPackageCode() {
		return sbmPackageCode;
	}

	public void setSbmPackageCode(String sbmPackageCode) {
		this.sbmPackageCode = sbmPackageCode;
	}

	public String getSbmTariffCode() {
		return sbmTariffCode;
	}

	public void setSbmTariffCode(String sbmTariffCode) {
		this.sbmTariffCode = sbmTariffCode;
	}

	public String getSbmAccountStatus() {
		return sbmAccountStatus;
	}

	public void setSbmAccountStatus(String sbmAccountStatus) {
		this.sbmAccountStatus = sbmAccountStatus;
	}

	public String getSbmCollPlan() {
		return sbmCollPlan;
	}

	public void setSbmCollPlan(String sbmCollPlan) {
		this.sbmCollPlan = sbmCollPlan;
	}

	public String getSbmPaymentPlan() {
		return sbmPaymentPlan;
	}

	public void setSbmPaymentPlan(String sbmPaymentPlan) {
		this.sbmPaymentPlan = sbmPaymentPlan;
	}

	public String getSbmMtnStatus() {
		return sbmMtnStatus;
	}

	public void setSbmMtnStatus(String sbmMtnStatus) {
		this.sbmMtnStatus = sbmMtnStatus;
	}

	public String getSbmCustomerType() {
		return sbmCustomerType;
	}

	public void setSbmCustomerType(String sbmCustomerType) {
		this.sbmCustomerType = sbmCustomerType;
	}

	public Integer getSbmDaysSuspend() {
		return sbmDaysSuspend;
	}

	public void setSbmDaysSuspend(Integer sbmDaysSuspend) {
		this.sbmDaysSuspend = sbmDaysSuspend;
	}

	public Integer getSbmContractLen() {
		return sbmContractLen;
	}

	public void setSbmContractLen(Integer sbmContractLen) {
		this.sbmContractLen = sbmContractLen;
	}

	public String getSbmAgeing() {
		return sbmAgeing;
	}

	public void setSbmAgeing(String sbmAgeing) {
		this.sbmAgeing = sbmAgeing;
	}

	public Integer getSbmContractAge() {
		return sbmContractAge;
	}

	public void setSbmContractAge(Integer sbmContractAge) {
		this.sbmContractAge = sbmContractAge;
	}

	public String getSbmAction() {
		return sbmAction;
	}

	public void setSbmAction(String sbmAction) {
		this.sbmAction = sbmAction;
	}

	public Date getSbmDate() {
		return sbmDate;
	}

	public void setSbmDate(Date sbmDate) {
		this.sbmDate = sbmDate;
	}

	public String getSbmUserid() {
		return sbmUserid;
	}

	public void setSbmUserid(String sbmUserid) {
		this.sbmUserid = sbmUserid;
	}

	public String getSbmRuleInd() {
		return sbmRuleInd;
	}

	public void setSbmRuleInd(String sbmRuleInd) {
		this.sbmRuleInd = sbmRuleInd;
	}

	public String getSbmStatus() {
		return sbmStatus;
	}

	public void setSbmStatus(String sbmStatus) {
		this.sbmStatus = sbmStatus;
	}

	public String getSbmParentAccount() {
		return sbmParentAccount;
	}

	public void setSbmParentAccount(String sbmParentAccount) {
		this.sbmParentAccount = sbmParentAccount;
	}

	public String getSbmRightId() {
		return sbmRightId;
	}

	public void setSbmRightId(String sbmRightId) {
		this.sbmRightId = sbmRightId;
	}

	public String getSbmCrmValue() {
		return sbmCrmValue;
	}

	public void setSbmCrmValue(String sbmCrmValue) {
		this.sbmCrmValue = sbmCrmValue;
	}

	@Override
	public String toString() {
		return "\nSbmSubMatrixDMO [sbmRuleNo=" + sbmRuleNo + "\nsbmRuleDesc=" + sbmRuleDesc + "\nsbmPackageCode="
				+ sbmPackageCode + "\nsbmTariffCode=" + sbmTariffCode + "\nsbmAccountStatus=" + sbmAccountStatus
				+ "\nsbmCollPlan=" + sbmCollPlan + "\nsbmPaymentPlan=" + sbmPaymentPlan + "\nsbmMtnStatus="
				+ sbmMtnStatus + "\nsbmCustomerType=" + sbmCustomerType + "\nsbmDaysSuspend=" + sbmDaysSuspend
				+ "\nsbmContractLen=" + sbmContractLen + "\nsbmAgeing=" + sbmAgeing + "\nsbmContractAge="
				+ sbmContractAge + "\nsbmAction=" + sbmAction + "\nsbmDate=" + sbmDate + "\nsbmUserid=" + sbmUserid
				+ "\nsbmRuleInd=" + sbmRuleInd + "\nsbmStatus=" + sbmStatus + "\nsbmParentAccount=" + sbmParentAccount
				+ "\nsbmRightId=" + sbmRightId + "\nsbmCrmValue=" + sbmCrmValue + "]";
	}

}
