package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class CenContExpiryNotifyDMO extends DBO implements Serializable {

	private Integer cenSubscriberId;
	private String cenExpiryMsisdn;
	private String cenSmsSentTo;
	private Date cenTermDate;
	private Date cenNotifGenDt;
	private String cenContact;
	private String cenEmailSentTo;
	private String cenNotifyLevel;
	private BigDecimal cenCurrCharge;
	private BigDecimal cenNewCharge;
	private String cenAnalysis1;
	private String cenAnalysis2;
	private String cenAnalysis3;
	private String cenAnalysis4;
	private String cenAnalysis5;

	public static final int cenSubscriberIdFilter = 0;

	public static final int cenExpiryMsisdnFilter = 1;
	private static final int cenExpiryMsisdnSize = 15;

	public static final int cenSmsSentToFilter = 2;
	private static final int cenSmsSentToSize = 15;

	public static final int cenTermDateFilter = 3;

	public static final int cenNotifGenDtFilter = 4;

	public static final int cenContactFilter = 5;
	private static final int cenContactSize = 110;

	public static final int cenEmailSentToFilter = 6;
	private static final int cenEmailSentToSize = 50;

	public static final int cenNotifyLevelFilter = 7;
	private static final int cenNotifyLevelSize = 2;

	public static final int cenCurrChargeFilter = 8;

	public static final int cenNewChargeFilter = 9;

	public static final int cenAnalysis1Filter = 10;
	private static final int cenAnalysis1Size = 50;

	public static final int cenAnalysis2Filter = 11;
	private static final int cenAnalysis2Size = 50;

	public static final int cenAnalysis3Filter = 12;
	private static final int cenAnalysis3Size = 50;

	public static final int cenAnalysis4Filter = 13;
	private static final int cenAnalysis4Size = 50;

	public static final int cenAnalysis5Filter = 14;
	private static final int cenAnalysis5Size = 50;

	public CenContExpiryNotifyDMO() {
	};

	public CenContExpiryNotifyDMO(final Integer cenSubscriberId, final String cenExpiryMsisdn,
			final String cenSmsSentTo, final Date cenTermDate, final Date cenNotifGenDt, final String cenContact,
			final String cenEmailSentTo, final String cenNotifyLevel, final BigDecimal cenCurrCharge,
			final BigDecimal cenNewCharge, final String cenAnalysis1, final String cenAnalysis2,
			final String cenAnalysis3, final String cenAnalysis4, final String cenAnalysis5) {

		this.cenSubscriberId = cenSubscriberId;
		this.cenExpiryMsisdn = cenExpiryMsisdn;
		this.cenSmsSentTo = cenSmsSentTo;
		this.cenTermDate = cenTermDate;
		this.cenNotifGenDt = cenNotifGenDt;
		this.cenContact = cenContact;
		this.cenEmailSentTo = cenEmailSentTo;
		this.cenNotifyLevel = cenNotifyLevel;
		this.cenCurrCharge = cenCurrCharge;
		this.cenNewCharge = cenNewCharge;
		this.cenAnalysis1 = cenAnalysis1;
		this.cenAnalysis2 = cenAnalysis2;
		this.cenAnalysis3 = cenAnalysis3;
		this.cenAnalysis4 = cenAnalysis4;
		this.cenAnalysis5 = cenAnalysis5;
	};

	private static final int[] fieldSizes = new int[] { 0, cenExpiryMsisdnSize, cenSmsSentToSize, 0, 0, cenContactSize,
			cenEmailSentToSize, cenNotifyLevelSize, 0, 0, cenAnalysis1Size, cenAnalysis2Size, cenAnalysis3Size,
			cenAnalysis4Size, cenAnalysis5Size };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.cenSubscriberId,
				((this.cenExpiryMsisdn == null) ? null
						: (this.cenExpiryMsisdn.length() <= cenExpiryMsisdnSize) ? this.cenExpiryMsisdn
								: this.cenExpiryMsisdn.substring(0, this.cenExpiryMsisdnSize)),
				((this.cenSmsSentTo == null) ? null
						: (this.cenSmsSentTo.length() <= cenSmsSentToSize) ? this.cenSmsSentTo
								: this.cenSmsSentTo.substring(0, this.cenSmsSentToSize)),
				this.cenTermDate, this.cenNotifGenDt,
				((this.cenContact == null) ? null
						: (this.cenContact.length() <= cenContactSize) ? this.cenContact
								: this.cenContact.substring(0, this.cenContactSize)),
				((this.cenEmailSentTo == null) ? null
						: (this.cenEmailSentTo.length() <= cenEmailSentToSize) ? this.cenEmailSentTo
								: this.cenEmailSentTo.substring(0, this.cenEmailSentToSize)),
				((this.cenNotifyLevel == null) ? null
						: (this.cenNotifyLevel.length() <= cenNotifyLevelSize) ? this.cenNotifyLevel
								: this.cenNotifyLevel.substring(0, this.cenNotifyLevelSize)),
				this.cenCurrCharge, this.cenNewCharge,
				((this.cenAnalysis1 == null) ? null
						: (this.cenAnalysis1.length() <= cenAnalysis1Size) ? this.cenAnalysis1
								: this.cenAnalysis1.substring(0, this.cenAnalysis1Size)),
				((this.cenAnalysis2 == null) ? null
						: (this.cenAnalysis2.length() <= cenAnalysis2Size) ? this.cenAnalysis2
								: this.cenAnalysis2.substring(0, this.cenAnalysis2Size)),
				((this.cenAnalysis3 == null) ? null
						: (this.cenAnalysis3.length() <= cenAnalysis3Size) ? this.cenAnalysis3
								: this.cenAnalysis3.substring(0, this.cenAnalysis3Size)),
				((this.cenAnalysis4 == null) ? null
						: (this.cenAnalysis4.length() <= cenAnalysis4Size) ? this.cenAnalysis4
								: this.cenAnalysis4.substring(0, this.cenAnalysis4Size)),
				((this.cenAnalysis5 == null) ? null
						: (this.cenAnalysis5.length() <= cenAnalysis5Size) ? this.cenAnalysis5
								: this.cenAnalysis5.substring(0, this.cenAnalysis5Size)) };
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
		return new DAOArgs().arg(this.getCenSubscriberId()).arg(this.getCenExpiryMsisdn()).arg(this.getCenEmailSentTo())
				.arg(this.getCenTermDate());
	}

	protected void set(Object[] fields) {
		this.cenSubscriberId = ((Integer) fields[0]);
		this.cenExpiryMsisdn = rtrim((String) fields[1]);

		this.cenSmsSentTo = rtrim((String) fields[2]);

		this.cenTermDate = ((fields[3] == null) ? null : new Date(fields[3]));
		this.cenNotifGenDt = ((fields[4] == null) ? null : new Date(fields[4]));
		this.cenContact = rtrim((String) fields[5]);

		this.cenEmailSentTo = rtrim((String) fields[6]);

		this.cenNotifyLevel = rtrim((String) fields[7]);

		this.cenCurrCharge = (BigDecimal) fields[8];

		this.cenNewCharge = (BigDecimal) fields[9];

		this.cenAnalysis1 = rtrim((String) fields[10]);

		this.cenAnalysis2 = rtrim((String) fields[11]);

		this.cenAnalysis3 = rtrim((String) fields[12]);

		this.cenAnalysis4 = rtrim((String) fields[13]);

		this.cenAnalysis5 = rtrim((String) fields[14]);

	}

	public void set(final Integer cenSubscriberId, final String cenExpiryMsisdn, final String cenSmsSentTo,
			final Date cenTermDate, final Date cenNotifGenDt, final String cenContact, final String cenEmailSentTo,
			final String cenNotifyLevel, final BigDecimal cenCurrCharge, final BigDecimal cenNewCharge,
			final String cenAnalysis1, final String cenAnalysis2, final String cenAnalysis3, final String cenAnalysis4,
			final String cenAnalysis5) {

		this.cenSubscriberId = cenSubscriberId;
		this.cenExpiryMsisdn = cenExpiryMsisdn;
		this.cenSmsSentTo = cenSmsSentTo;
		this.cenTermDate = cenTermDate;
		this.cenNotifGenDt = cenNotifGenDt;
		this.cenContact = cenContact;
		this.cenEmailSentTo = cenEmailSentTo;
		this.cenNotifyLevel = cenNotifyLevel;
		this.cenCurrCharge = cenCurrCharge;
		this.cenNewCharge = cenNewCharge;
		this.cenAnalysis1 = cenAnalysis1;
		this.cenAnalysis2 = cenAnalysis2;
		this.cenAnalysis3 = cenAnalysis3;
		this.cenAnalysis4 = cenAnalysis4;
		this.cenAnalysis5 = cenAnalysis5;
	}

	public Integer getCenSubscriberId() {
		return cenSubscriberId;
	}

	public void setCenSubscriberId(Integer cenSubscriberId) {
		this.cenSubscriberId = cenSubscriberId;
	}

	public String getCenExpiryMsisdn() {
		return cenExpiryMsisdn;
	}

	public void setCenExpiryMsisdn(String cenExpiryMsisdn) {
		this.cenExpiryMsisdn = cenExpiryMsisdn;
	}

	public String getCenSmsSentTo() {
		return cenSmsSentTo;
	}

	public void setCenSmsSentTo(String cenSmsSentTo) {
		this.cenSmsSentTo = cenSmsSentTo;
	}

	public Date getCenTermDate() {
		return cenTermDate;
	}

	public void setCenTermDate(Date cenTermDate) {
		this.cenTermDate = cenTermDate;
	}

	public Date getCenNotifGenDt() {
		return cenNotifGenDt;
	}

	public void setCenNotifGenDt(Date cenNotifGenDt) {
		this.cenNotifGenDt = cenNotifGenDt;
	}

	public String getCenContact() {
		return cenContact;
	}

	public void setCenContact(String cenContact) {
		this.cenContact = cenContact;
	}

	public String getCenEmailSentTo() {
		return cenEmailSentTo;
	}

	public void setCenEmailSentTo(String cenEmailSentTo) {
		this.cenEmailSentTo = cenEmailSentTo;
	}

	public String getCenNotifyLevel() {
		return cenNotifyLevel;
	}

	public void setCenNotifyLevel(String cenNotifyLevel) {
		this.cenNotifyLevel = cenNotifyLevel;
	}

	public BigDecimal getCenCurrCharge() {
		return cenCurrCharge;
	}

	public void setCenCurrCharge(BigDecimal cenCurrCharge) {
		this.cenCurrCharge = cenCurrCharge;
	}

	public BigDecimal getCenNewCharge() {
		return cenNewCharge;
	}

	public void setCenNewCharge(BigDecimal cenNewCharge) {
		this.cenNewCharge = cenNewCharge;
	}

	public String getCenAnalysis1() {
		return cenAnalysis1;
	}

	public void setCenAnalysis1(String cenAnalysis1) {
		this.cenAnalysis1 = cenAnalysis1;
	}

	public String getCenAnalysis2() {
		return cenAnalysis2;
	}

	public void setCenAnalysis2(String cenAnalysis2) {
		this.cenAnalysis2 = cenAnalysis2;
	}

	public String getCenAnalysis3() {
		return cenAnalysis3;
	}

	public void setCenAnalysis3(String cenAnalysis3) {
		this.cenAnalysis3 = cenAnalysis3;
	}

	public String getCenAnalysis4() {
		return cenAnalysis4;
	}

	public void setCenAnalysis4(String cenAnalysis4) {
		this.cenAnalysis4 = cenAnalysis4;
	}

	public String getCenAnalysis5() {
		return cenAnalysis5;
	}

	public void setCenAnalysis5(String cenAnalysis5) {
		this.cenAnalysis5 = cenAnalysis5;
	}

}
