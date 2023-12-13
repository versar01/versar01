package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class DshDiscHistoryDMO extends DBO implements Serializable {

	private Integer dshDiscHistId;
	private Integer dshSubscriberId;
	private String dshAccount;
	private Integer dshDiscPlanId;
	private Integer dshRuleRef;
	private Integer dshRuleId;
	private Integer dshBandId;
	private Double dshThreshold;
	private Double dshDiscountable;
	private Double dshDiscValue;
	private String dshInvoiceNo;
	private DateTime dshTimestamp;

	public static final int dshDiscHistIdFilter = 0;

	public static final int dshSubscriberIdFilter = 1;

	public static final int dshAccountFilter = 2;
	private static final int dshAccountSize = 8;

	public static final int dshDiscPlanIdFilter = 3;

	public static final int dshRuleRefFilter = 4;

	public static final int dshRuleIdFilter = 5;

	public static final int dshBandIdFilter = 6;

	public static final int dshThresholdFilter = 7;

	public static final int dshDiscountableFilter = 8;

	public static final int dshDiscValueFilter = 9;

	public static final int dshInvoiceNoFilter = 10;
	private static final int dshInvoiceNoSize = 10;

	public static final int dshTimestampFilter = 11;

	public DshDiscHistoryDMO() {
	};

	public DshDiscHistoryDMO(final Integer dshDiscHistId,
			final Integer dshSubscriberId, final String dshAccount,
			final Integer dshDiscPlanId, final Integer dshRuleRef,
			final Integer dshRuleId, final Integer dshBandId,
			final Double dshThreshold, final Double dshDiscountable,
			final Double dshDiscValue, final String dshInvoiceNo,
			final DateTime dshTimestamp) {

		this.dshDiscHistId = dshDiscHistId;
		this.dshSubscriberId = dshSubscriberId;
		this.dshAccount = dshAccount;
		this.dshDiscPlanId = dshDiscPlanId;
		this.dshRuleRef = dshRuleRef;
		this.dshRuleId = dshRuleId;
		this.dshBandId = dshBandId;
		this.dshThreshold = dshThreshold;
		this.dshDiscountable = dshDiscountable;
		this.dshDiscValue = dshDiscValue;
		this.dshInvoiceNo = dshInvoiceNo;
		this.dshTimestamp = dshTimestamp;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, dshAccountSize,
			0, 0, 0, 0, 0, 0, 0, dshInvoiceNoSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dshDiscHistId,
				this.dshSubscriberId,
				((this.dshAccount == null) ? null
						: (this.dshAccount.length() <= dshAccountSize) ? this.dshAccount
								: this.dshAccount.substring(0,
										this.dshAccountSize)),
				this.dshDiscPlanId,
				this.dshRuleRef,
				this.dshRuleId,
				this.dshBandId,
				this.dshThreshold,
				this.dshDiscountable,
				this.dshDiscValue,
				((this.dshInvoiceNo == null) ? null : (this.dshInvoiceNo
						.length() <= dshInvoiceNoSize) ? this.dshInvoiceNo
						: this.dshInvoiceNo.substring(0, this.dshInvoiceNoSize)),
				this.dshTimestamp };
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
		return new DAOArgs(1).arg(this.dshDiscHistId);
	}

	protected void set(Object[] fields) {
		this.dshDiscHistId = ((Integer) fields[0]);
		this.dshSubscriberId = ((Integer) fields[1]);
		this.dshAccount = rtrim((String) fields[2]);
		this.dshDiscPlanId = ((Integer) fields[3]);
		this.dshRuleRef = ((Integer) fields[4]);
		this.dshRuleId = ((Integer) fields[5]);
		this.dshBandId = ((Integer) fields[6]);
		this.dshThreshold = ((Double) fields[7]);
		this.dshDiscountable = ((Double) fields[8]);
		this.dshDiscValue = ((Double) fields[9]);
		this.dshInvoiceNo = rtrim((String) fields[10]);
		this.dshTimestamp = ((fields[11] == null) ? null : new DateTime(
				(DateTime) fields[11]));
	}

	public void set(final Integer dshDiscHistId, final Integer dshSubscriberId,
			final String dshAccount, final Integer dshDiscPlanId,
			final Integer dshRuleRef, final Integer dshRuleId,
			final Integer dshBandId, final Double dshThreshold,
			final Double dshDiscountable, final Double dshDiscValue,
			final String dshInvoiceNo, final DateTime dshTimestamp) {

		this.dshDiscHistId = dshDiscHistId;
		this.dshSubscriberId = dshSubscriberId;
		this.dshAccount = dshAccount;
		this.dshDiscPlanId = dshDiscPlanId;
		this.dshRuleRef = dshRuleRef;
		this.dshRuleId = dshRuleId;
		this.dshBandId = dshBandId;
		this.dshThreshold = dshThreshold;
		this.dshDiscountable = dshDiscountable;
		this.dshDiscValue = dshDiscValue;
		this.dshInvoiceNo = dshInvoiceNo;
		this.dshTimestamp = dshTimestamp;
	}

	public Integer getDshDiscHistId() {
		return dshDiscHistId;
	}

	public void setDshDiscHistId(Integer dshDiscHistId) {
		this.dshDiscHistId = dshDiscHistId;
	}

	public Integer getDshSubscriberId() {
		return dshSubscriberId;
	}

	public void setDshSubscriberId(Integer dshSubscriberId) {
		this.dshSubscriberId = dshSubscriberId;
	}

	public String getDshAccount() {
		return dshAccount;
	}

	public void setDshAccount(String dshAccount) {
		this.dshAccount = dshAccount;
	}

	public Integer getDshDiscPlanId() {
		return dshDiscPlanId;
	}

	public void setDshDiscPlanId(Integer dshDiscPlanId) {
		this.dshDiscPlanId = dshDiscPlanId;
	}

	public Integer getDshRuleRef() {
		return dshRuleRef;
	}

	public void setDshRuleRef(Integer dshRuleRef) {
		this.dshRuleRef = dshRuleRef;
	}

	public Integer getDshRuleId() {
		return dshRuleId;
	}

	public void setDshRuleId(Integer dshRuleId) {
		this.dshRuleId = dshRuleId;
	}

	public Integer getDshBandId() {
		return dshBandId;
	}

	public void setDshBandId(Integer dshBandId) {
		this.dshBandId = dshBandId;
	}

	public Double getDshThreshold() {
		return dshThreshold;
	}

	public void setDshThreshold(Double dshThreshold) {
		this.dshThreshold = dshThreshold;
	}

	public Double getDshDiscountable() {
		return dshDiscountable;
	}

	public void setDshDiscountable(Double dshDiscountable) {
		this.dshDiscountable = dshDiscountable;
	}

	public Double getDshDiscValue() {
		return dshDiscValue;
	}

	public void setDshDiscValue(Double dshDiscValue) {
		this.dshDiscValue = dshDiscValue;
	}

	public String getDshInvoiceNo() {
		return dshInvoiceNo;
	}

	public void setDshInvoiceNo(String dshInvoiceNo) {
		this.dshInvoiceNo = dshInvoiceNo;
	}

	public DateTime getDshTimestamp() {
		return dshTimestamp;
	}

	public void setDshTimestamp(DateTime dshTimestamp) {
		this.dshTimestamp = dshTimestamp;
	}

}
