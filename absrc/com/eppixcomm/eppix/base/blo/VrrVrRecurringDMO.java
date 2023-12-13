package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class VrrVrRecurringDMO extends DBO implements Serializable {

	private Integer vrrRecurringId;
	private Integer vrrSubscriberId;
	private String vrrReceiver;
	private String vrrProvider;
	private Date vrrDateStart;
	private Date vrrDateTerm;
	private Integer vrrTotRecharges;
	private Integer vrrNoBilling;
	private Integer vrrNoRecharge;
	private Float vrrRechargeAmt;
	private String vrrStatus;

	public static final int VrrRecurringIdFilter = 0;

	public static final int VrrSubscriberIdFilter = 1;

	public static final int VrrReceiverFilter = 2;
	private static final int VrrReceiverSize = 15;

	public static final int VrrProviderFilter = 3;
	private static final int VrrProviderSize = 5;

	public static final int VrrDateStartFilter = 4;

	public static final int VrrDateTermFilter = 5;

	public static final int VrrTotRechargesFilter = 6;

	public static final int VrrNoBillingFilter = 7;

	public static final int VrrNoRechargeFilter = 8;

	public static final int VrrRechargeAmtFilter = 9;

	public static final int VrrStatusFilter = 10;
	private static final int VrrStatusSize = 1;

	public VrrVrRecurringDMO() {
	};

	public VrrVrRecurringDMO(final Integer VrrRecurringId,
			final Integer VrrSubscriberId, final String VrrReceiver,
			final String VrrProvider, final Date VrrDateStart,
			final Date VrrDateTerm, final Integer VrrTotRecharges,
			final Integer VrrNoBilling, final Integer VrrNoRecharge,
			final Float VrrRechargeAmt, final String VrrStatus) {

		this.vrrRecurringId = VrrRecurringId;
		this.vrrSubscriberId = VrrSubscriberId;
		this.vrrReceiver = VrrReceiver;
		this.vrrProvider = VrrProvider;
		this.vrrDateStart = VrrDateStart;
		this.vrrDateTerm = VrrDateTerm;
		this.vrrTotRecharges = VrrTotRecharges;
		this.vrrNoBilling = VrrNoBilling;
		this.vrrNoRecharge = VrrNoRecharge;
		this.vrrRechargeAmt = VrrRechargeAmt;
		this.vrrStatus = VrrStatus;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, VrrReceiverSize,
			VrrProviderSize, 0, 0, 0, 0, 0, 0, VrrStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATEONLY, FIELD_TYPE_DATEONLY, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.vrrRecurringId,
				this.vrrSubscriberId,
				((this.vrrReceiver == null) ? null
						: (this.vrrReceiver.length() <= VrrReceiverSize) ? this.vrrReceiver
								: this.vrrReceiver.substring(0,
										this.VrrReceiverSize)),
				((this.vrrProvider == null) ? null
						: (this.vrrProvider.length() <= VrrProviderSize) ? this.vrrProvider
								: this.vrrProvider.substring(0,
										this.VrrProviderSize)),
				this.vrrDateStart,
				this.vrrDateTerm,
				this.vrrTotRecharges,
				this.vrrNoBilling,
				this.vrrNoRecharge,
				this.vrrRechargeAmt,
				((this.vrrStatus == null) ? null
						: (this.vrrStatus.length() <= VrrStatusSize) ? this.vrrStatus
								: this.vrrStatus.substring(0,
										this.VrrStatusSize)) };
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
		return new DAOArgs(1).arg(this.vrrRecurringId);
	}

	protected void set(Object[] fields) {
		this.vrrRecurringId = ((Integer) fields[0]);
		this.vrrSubscriberId = ((Integer) fields[1]);
		this.vrrReceiver = rtrim((String) fields[2]);
		this.vrrProvider = rtrim((String) fields[3]);
		this.vrrDateStart = ((fields[4] == null) ? null : new Date(fields[4]));
		this.vrrDateTerm = ((fields[5] == null) ? null : new Date(fields[5]));
		this.vrrTotRecharges = ((Integer) fields[6]);
		this.vrrNoBilling = ((Integer) fields[7]);
		this.vrrNoRecharge = ((Integer) fields[8]);
		this.vrrRechargeAmt = (Float)fields[9];
		this.vrrStatus = rtrim((String) fields[10]);
	}

	public void set(final Integer VrrRecurringId,
			final Integer VrrSubscriberId, final String VrrReceiver,
			final String VrrProvider, final Date VrrDateStart,
			final Date VrrDateTerm, final Integer VrrTotRecharges,
			final Integer VrrNoBilling, final Integer VrrNoRecharge,
			final Float VrrRechargeAmt, final String VrrStatus) {

		this.vrrRecurringId = VrrRecurringId;
		this.vrrSubscriberId = VrrSubscriberId;
		this.vrrReceiver = VrrReceiver;
		this.vrrProvider = VrrProvider;
		this.vrrDateStart = VrrDateStart;
		this.vrrDateTerm = VrrDateTerm;
		this.vrrTotRecharges = VrrTotRecharges;
		this.vrrNoBilling = VrrNoBilling;
		this.vrrNoRecharge = VrrNoRecharge;
		this.vrrRechargeAmt = VrrRechargeAmt;
		this.vrrStatus = VrrStatus;
	}

	public Integer getVrrRecurringId() {
		return vrrRecurringId;
	}

	public void setVrrRecurringId(Integer vrrRecurringId) {
		this.vrrRecurringId = vrrRecurringId;
	}

	public Integer getVrrSubscriberId() {
		return vrrSubscriberId;
	}

	public void setVrrSubscriberId(Integer vrrSubscriberId) {
		this.vrrSubscriberId = vrrSubscriberId;
	}

	public String getVrrReceiver() {
		return vrrReceiver;
	}

	public void setVrrReceiver(String vrrReceiver) {
		this.vrrReceiver = vrrReceiver;
	}

	public String getVrrProvider() {
		return vrrProvider;
	}

	public void setVrrProvider(String vrrProvider) {
		this.vrrProvider = vrrProvider;
	}

	public Date getVrrDateStart() {
		return vrrDateStart;
	}

	public void setVrrDateStart(Date vrrDateStart) {
		this.vrrDateStart = vrrDateStart;
	}

	public Date getVrrDateTerm() {
		return vrrDateTerm;
	}

	public void setVrrDateTerm(Date vrrDateTerm) {
		this.vrrDateTerm = vrrDateTerm;
	}

	public Integer getVrrTotRecharges() {
		return vrrTotRecharges;
	}

	public void setVrrTotRecharges(Integer vrrTotRecharges) {
		this.vrrTotRecharges = vrrTotRecharges;
	}

	public Integer getVrrNoBilling() {
		return vrrNoBilling;
	}

	public void setVrrNoBilling(Integer vrrNoBilling) {
		this.vrrNoBilling = vrrNoBilling;
	}

	public Integer getVrrNoRecharge() {
		return vrrNoRecharge;
	}

	public void setVrrNoRecharge(Integer vrrNoRecharge) {
		this.vrrNoRecharge = vrrNoRecharge;
	}

	public Float getVrrRechargeAmt() {
		return vrrRechargeAmt;
	}

	public void setVrrRechargeAmt(Float vrrRechargeAmt) {
		this.vrrRechargeAmt = vrrRechargeAmt;
	}

	public String getVrrStatus() {
		return vrrStatus;
	}

	public void setVrrStatus(String vrrStatus) {
		this.vrrStatus = vrrStatus;
	}

}