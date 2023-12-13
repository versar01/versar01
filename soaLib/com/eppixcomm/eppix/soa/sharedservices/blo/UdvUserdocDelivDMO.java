package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class UdvUserdocDelivDMO extends DBO implements Serializable {

	private String udvBillAcNo;
	private Integer udvSubscriberId;
	private String udvDocType;
	private String udvDelivery;
	private String udvFormat;
	private String udvAddressType;
	private Short udvFrequency;
	private String udvSuspend;
	private Date udvDateSuspended;
	private Date udvSuspendUpto;
	private Short udvPeriodCount;
	private String udvPrintArrears;
	private Date udvLastIssued;
	private Date udvLastPdcount;

	public static final int udvBillAcNoFilter = 0;
	private static final int udvBillAcNoSize = 8;

	public static final int udvSubscriberIdFilter = 1;

	public static final int udvDocTypeFilter = 2;
	private static final int udvDocTypeSize = 10;

	public static final int udvDeliveryFilter = 3;
	private static final int udvDeliverySize = 5;

	public static final int udvFormatFilter = 4;
	private static final int udvFormatSize = 5;

	public static final int udvAddressTypeFilter = 5;
	private static final int udvAddressTypeSize = 4;

	public static final int udvFrequencyFilter = 6;

	public static final int udvSuspendFilter = 7;
	private static final int udvSuspendSize = 1;

	public static final int udvDateSuspendedFilter = 8;

	public static final int udvSuspendUptoFilter = 9;

	public static final int udvPeriodCountFilter = 10;

	public static final int udvPrintArrearsFilter = 11;
	private static final int udvPrintArrearsSize = 1;

	public static final int udvLastIssuedFilter = 12;

	public static final int udvLastPdcountFilter = 13;

	public UdvUserdocDelivDMO() {
	};

	public UdvUserdocDelivDMO(final String udvBillAcNo,
			final Integer udvSubscriberId, final String udvDocType,
			final String udvDelivery, final String udvFormat,
			final String udvAddressType, final Short udvFrequency,
			final String udvSuspend, final Date udvDateSuspended,
			final Date udvSuspendUpto, final Short udvPeriodCount,
			final String udvPrintArrears, final Date udvLastIssued,
			final Date udvLastPdcount) {

		this.udvBillAcNo = udvBillAcNo;
		this.udvSubscriberId = udvSubscriberId;
		this.udvDocType = udvDocType;
		this.udvDelivery = udvDelivery;
		this.udvFormat = udvFormat;
		this.udvAddressType = udvAddressType;
		this.udvFrequency = udvFrequency;
		this.udvSuspend = udvSuspend;
		this.udvDateSuspended = udvDateSuspended;
		this.udvSuspendUpto = udvSuspendUpto;
		this.udvPeriodCount = udvPeriodCount;
		this.udvPrintArrears = udvPrintArrears;
		this.udvLastIssued = udvLastIssued;
		this.udvLastPdcount = udvLastPdcount;
	};

	private static final int[] fieldSizes = new int[] { udvBillAcNoSize, 0,
			udvDocTypeSize, udvDeliverySize, udvFormatSize, udvAddressTypeSize,
			0, udvSuspendSize, 0, 0, 0, udvPrintArrearsSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.udvBillAcNo == null) ? null
						: (this.udvBillAcNo.length() <= udvBillAcNoSize) ? this.udvBillAcNo
								: this.udvBillAcNo.substring(0,
										this.udvBillAcNoSize)),
				this.udvSubscriberId,
				((this.udvDocType == null) ? null
						: (this.udvDocType.length() <= udvDocTypeSize) ? this.udvDocType
								: this.udvDocType.substring(0,
										this.udvDocTypeSize)),
				((this.udvDelivery == null) ? null
						: (this.udvDelivery.length() <= udvDeliverySize) ? this.udvDelivery
								: this.udvDelivery.substring(0,
										this.udvDeliverySize)),
				((this.udvFormat == null) ? null
						: (this.udvFormat.length() <= udvFormatSize) ? this.udvFormat
								: this.udvFormat.substring(0,
										this.udvFormatSize)),
				((this.udvAddressType == null) ? null : (this.udvAddressType
						.length() <= udvAddressTypeSize) ? this.udvAddressType
						: this.udvAddressType.substring(0,
								this.udvAddressTypeSize)),
				this.udvFrequency,
				((this.udvSuspend == null) ? null
						: (this.udvSuspend.length() <= udvSuspendSize) ? this.udvSuspend
								: this.udvSuspend.substring(0,
										this.udvSuspendSize)),
				this.udvDateSuspended,
				this.udvSuspendUpto,
				this.udvPeriodCount,
				((this.udvPrintArrears == null) ? null
						: (this.udvPrintArrears.length() <= udvPrintArrearsSize) ? this.udvPrintArrears
								: this.udvPrintArrears.substring(0,
										this.udvPrintArrearsSize)),
				this.udvLastIssued, this.udvLastPdcount };
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
		return new DAOArgs(3).arg(this.udvBillAcNo).arg(this.udvSubscriberId)
				.arg(this.udvDocType);
	}

	protected void set(Object[] fields) {
		this.udvBillAcNo = rtrim((String) fields[0]);
		this.udvSubscriberId = ((Integer) fields[1]);
		this.udvDocType = rtrim((String) fields[2]);
		this.udvDelivery = rtrim((String) fields[3]);
		this.udvFormat = rtrim((String) fields[4]);
		this.udvAddressType = rtrim((String) fields[5]);
		this.udvFrequency = ((Short) fields[6]);
		this.udvSuspend = rtrim((String) fields[7]);
		this.udvDateSuspended = ((fields[8] == null) ? null : new Date(fields[8]));
		this.udvSuspendUpto = ((fields[9] == null) ? null : new Date(fields[9]));
		this.udvPeriodCount = ((Short) fields[10]);
		this.udvPrintArrears = rtrim((String) fields[11]);
		this.udvLastIssued = ((fields[12] == null) ? null : new Date(fields[12]));
		this.udvLastPdcount = ((fields[13] == null) ? null : new Date( fields[13]));
	}

	public void set(final String udvBillAcNo, final Integer udvSubscriberId,
			final String udvDocType, final String udvDelivery,
			final String udvFormat, final String udvAddressType,
			final Short udvFrequency, final String udvSuspend,
			final Date udvDateSuspended, final Date udvSuspendUpto,
			final Short udvPeriodCount, final String udvPrintArrears,
			final Date udvLastIssued, final Date udvLastPdcount) {

		this.udvBillAcNo = udvBillAcNo;
		this.udvSubscriberId = udvSubscriberId;
		this.udvDocType = udvDocType;
		this.udvDelivery = udvDelivery;
		this.udvFormat = udvFormat;
		this.udvAddressType = udvAddressType;
		this.udvFrequency = udvFrequency;
		this.udvSuspend = udvSuspend;
		this.udvDateSuspended = udvDateSuspended;
		this.udvSuspendUpto = udvSuspendUpto;
		this.udvPeriodCount = udvPeriodCount;
		this.udvPrintArrears = udvPrintArrears;
		this.udvLastIssued = udvLastIssued;
		this.udvLastPdcount = udvLastPdcount;
	}

	public String getUdvBillAcNo() {
		return udvBillAcNo;
	}

	public void setUdvBillAcNo(String udvBillAcNo) {
		this.udvBillAcNo = udvBillAcNo;
	}

	public Integer getUdvSubscriberId() {
		return udvSubscriberId;
	}

	public void setUdvSubscriberId(Integer udvSubscriberId) {
		this.udvSubscriberId = udvSubscriberId;
	}

	public String getUdvDocType() {
		return udvDocType;
	}

	public void setUdvDocType(String udvDocType) {
		this.udvDocType = udvDocType;
	}

	public String getUdvDelivery() {
		return udvDelivery;
	}

	public void setUdvDelivery(String udvDelivery) {
		this.udvDelivery = udvDelivery;
	}

	public String getUdvFormat() {
		return udvFormat;
	}

	public void setUdvFormat(String udvFormat) {
		this.udvFormat = udvFormat;
	}

	public String getUdvAddressType() {
		return udvAddressType;
	}

	public void setUdvAddressType(String udvAddressType) {
		this.udvAddressType = udvAddressType;
	}

	public Short getUdvFrequency() {
		return udvFrequency;
	}

	public void setUdvFrequency(Short udvFrequency) {
		this.udvFrequency = udvFrequency;
	}

	public String getUdvSuspend() {
		return udvSuspend;
	}

	public void setUdvSuspend(String udvSuspend) {
		this.udvSuspend = udvSuspend;
	}

	public Date getUdvDateSuspended() {
		return udvDateSuspended;
	}

	public void setUdvDateSuspended(Date udvDateSuspended) {
		this.udvDateSuspended = udvDateSuspended;
	}

	public Date getUdvSuspendUpto() {
		return udvSuspendUpto;
	}

	public void setUdvSuspendUpto(Date udvSuspendUpto) {
		this.udvSuspendUpto = udvSuspendUpto;
	}

	public Short getUdvPeriodCount() {
		return udvPeriodCount;
	}

	public void setUdvPeriodCount(Short udvPeriodCount) {
		this.udvPeriodCount = udvPeriodCount;
	}

	public String getUdvPrintArrears() {
		return udvPrintArrears;
	}

	public void setUdvPrintArrears(String udvPrintArrears) {
		this.udvPrintArrears = udvPrintArrears;
	}

	public Date getUdvLastIssued() {
		return udvLastIssued;
	}

	public void setUdvLastIssued(Date udvLastIssued) {
		this.udvLastIssued = udvLastIssued;
	}

	public Date getUdvLastPdcount() {
		return udvLastPdcount;
	}

	public void setUdvLastPdcount(Date udvLastPdcount) {
		this.udvLastPdcount = udvLastPdcount;
	}

}