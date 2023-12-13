package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SdcDualCallDMO extends DBO implements Serializable {

	private Integer sdcSubscriberId;
	private String sdcServiceCode;
	private String sdcSecondMsisdn;
	private String sdcFirstMsisdn;
	private Date sdcLinkDate;
	private Date sdcExpiryDate;

	public static final int SdcSubscriberIdFilter = 0;

	public static final int SdcServiceCodeFilter = 1;
	private static final int SdcServiceCodeSize = 4;

	public static final int SdcSecondMsisdnFilter = 2;
	private static final int SdcSecondMsisdnSize = 15;

	public static final int SdcFirstMsisdnFilter = 3;
	private static final int SdcFirstMsisdnSize = 15;

	public static final int SdcLinkDateFilter = 4;

	public static final int SdcExpiryDateFilter = 5;

	public SdcDualCallDMO() {
	};

	public SdcDualCallDMO(final Integer SdcSubscriberId,
			final String SdcServiceCode, final String SdcSecondMsisdn,
			final String SdcFirstMsisdn, final Date SdcLinkDate,
			final Date SdcExpiryDate) {

		this.sdcSubscriberId = SdcSubscriberId;
		this.sdcServiceCode = SdcServiceCode;
		this.sdcSecondMsisdn = SdcSecondMsisdn;
		this.sdcFirstMsisdn = SdcFirstMsisdn;
		this.sdcLinkDate = SdcLinkDate;
		this.sdcExpiryDate = SdcExpiryDate;
	};

	private static final int[] fieldSizes = new int[] { 0, SdcServiceCodeSize,
			SdcSecondMsisdnSize, SdcFirstMsisdnSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sdcSubscriberId,
				((this.sdcServiceCode == null) ? null : (this.sdcServiceCode
						.length() <= SdcServiceCodeSize) ? this.sdcServiceCode
						: this.sdcServiceCode.substring(0,
								this.SdcServiceCodeSize)),
				((this.sdcSecondMsisdn == null) ? null
						: (this.sdcSecondMsisdn.length() <= SdcSecondMsisdnSize) ? this.sdcSecondMsisdn
								: this.sdcSecondMsisdn.substring(0,
										this.SdcSecondMsisdnSize)),
				((this.sdcFirstMsisdn == null) ? null : (this.sdcFirstMsisdn
						.length() <= SdcFirstMsisdnSize) ? this.sdcFirstMsisdn
						: this.sdcFirstMsisdn.substring(0,
								this.SdcFirstMsisdnSize)), 
				this.sdcLinkDate,
				this.sdcExpiryDate };
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
		return new DAOArgs(3).arg(this.sdcSecondMsisdn).arg(this.sdcFirstMsisdn).arg(this.sdcLinkDate);
	}

	protected void set(Object[] fields) {
		this.sdcSubscriberId = ((Integer) fields[0]);
		this.sdcServiceCode = rtrim((String) fields[1]);
		this.sdcSecondMsisdn = rtrim((String) fields[2]);
		this.sdcFirstMsisdn = rtrim((String) fields[3]);
		this.sdcLinkDate = ((fields[4] == null) ? null : new Date(fields[4]));
		this.sdcExpiryDate = ((fields[5] == null) ? null : new Date(fields[5]));
	}

	public void set(final Integer SdcSubscriberId, final String SdcServiceCode,
			final String SdcSecondMsisdn, final String SdcFirstMsisdn,
			final Date SdcLinkDate, final Date SdcExpiryDate) {

		this.sdcSubscriberId = SdcSubscriberId;
		this.sdcServiceCode = SdcServiceCode;
		this.sdcSecondMsisdn = SdcSecondMsisdn;
		this.sdcFirstMsisdn = SdcFirstMsisdn;
		this.sdcLinkDate = SdcLinkDate;
		this.sdcExpiryDate = SdcExpiryDate;
	}

	public Integer getSdcSubscriberId() {
		return sdcSubscriberId;
	}

	public void setSdcSubscriberId(Integer sdcSubscriberId) {
		this.sdcSubscriberId = sdcSubscriberId;
	}

	public String getSdcServiceCode() {
		return sdcServiceCode;
	}

	public void setSdcServiceCode(String sdcServiceCode) {
		this.sdcServiceCode = sdcServiceCode;
	}

	public String getSdcSecondMsisdn() {
		return sdcSecondMsisdn;
	}

	public void setSdcSecondMsisdn(String sdcSecondMsisdn) {
		this.sdcSecondMsisdn = sdcSecondMsisdn;
	}

	public String getSdcFirstMsisdn() {
		return sdcFirstMsisdn;
	}

	public void setSdcFirstMsisdn(String sdcFirstMsisdn) {
		this.sdcFirstMsisdn = sdcFirstMsisdn;
	}

	public Date getSdcLinkDate() {
		return sdcLinkDate;
	}

	public void setSdcLinkDate(Date sdcLinkDate) {
		this.sdcLinkDate = sdcLinkDate;
	}

	public Date getSdcExpiryDate() {
		return sdcExpiryDate;
	}

	public void setSdcExpiryDate(Date sdcExpiryDate) {
		this.sdcExpiryDate = sdcExpiryDate;
	}

}