package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;


public class PdPortDetailDMO extends DBO implements Serializable {

	private Integer pdSerial;
	private String pdPortId;
	private Integer pdSequence;
	private String pdMsisdn;
	private String pdStatus;
	private String pdInOut;
	private String pdNetwrk;
	private String pdWaitMid;
	private String pdTrans;
	private Date pdTransDate;
	private String pdN2nSent;
	private DateTime pdTimestamp;
	private String pdComments;

	public static final int pdSerialFilter = 0;

	public static final int pdPortIdFilter = 1;
	private static final int pdPortIdSize = 50;

	public static final int pdSequenceFilter = 2;

	public static final int pdMsisdnFilter = 3;
	private static final int pdMsisdnSize = 15;

	public static final int pdStatusFilter = 4;
	private static final int pdStatusSize = 1;

	public static final int pdInOutFilter = 5;
	private static final int pdInOutSize = 1;

	public static final int pdNetwrkFilter = 6;
	private static final int pdNetwrkSize = 5;

	public static final int pdWaitMidFilter = 7;
	private static final int pdWaitMidSize = 1;

	public static final int pdTransFilter = 8;
	private static final int pdTransSize = 2;

	public static final int pdTransDateFilter = 9;

	public static final int pdN2nSentFilter = 10;
	private static final int pdN2nSentSize = 1;

	public static final int pdTimestampFilter = 11;

	public static final int pdCommentsFilter = 12;
	private static final int pdCommentsSize = 100;

	public PdPortDetailDMO() {
	};

	public PdPortDetailDMO(final Integer pdSerial, final String pdPortId, final Integer pdSequence,
			final String pdMsisdn, final String pdStatus, final String pdInOut, final String pdNetwrk,
			final String pdWaitMid, final String pdTrans, final Date pdTransDate, final String pdN2nSent,
			final DateTime pdTimestamp, final String pdComments) {

		this.pdSerial = pdSerial;
		this.pdPortId = pdPortId;
		this.pdSequence = pdSequence;
		this.pdMsisdn = pdMsisdn;
		this.pdStatus = pdStatus;
		this.pdInOut = pdInOut;
		this.pdNetwrk = pdNetwrk;
		this.pdWaitMid = pdWaitMid;
		this.pdTrans = pdTrans;
		this.pdTransDate = pdTransDate;
		this.pdN2nSent = pdN2nSent;
		this.pdTimestamp = pdTimestamp;
		this.pdComments = pdComments;
	};

	private static final int[] fieldSizes = new int[] { 0, pdPortIdSize, 0, pdMsisdnSize, pdStatusSize, pdInOutSize,
			pdNetwrkSize, pdWaitMidSize, pdTransSize, 0, pdN2nSentSize, 0, pdCommentsSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.pdSerial,
				((this.pdPortId == null) ? null
						: (this.pdPortId.length() <= pdPortIdSize) ? this.pdPortId
								: this.pdPortId.substring(0, this.pdPortIdSize)),
				this.pdSequence,
				((this.pdMsisdn == null) ? null
						: (this.pdMsisdn.length() <= pdMsisdnSize) ? this.pdMsisdn
								: this.pdMsisdn.substring(0, this.pdMsisdnSize)),
				((this.pdStatus == null) ? null
						: (this.pdStatus.length() <= pdStatusSize) ? this.pdStatus
								: this.pdStatus.substring(0, this.pdStatusSize)),
				((this.pdInOut == null) ? null
						: (this.pdInOut.length() <= pdInOutSize) ? this.pdInOut
								: this.pdInOut.substring(0, this.pdInOutSize)),
				((this.pdNetwrk == null) ? null
						: (this.pdNetwrk.length() <= pdNetwrkSize) ? this.pdNetwrk
								: this.pdNetwrk.substring(0, this.pdNetwrkSize)),
				((this.pdWaitMid == null) ? null
						: (this.pdWaitMid.length() <= pdWaitMidSize) ? this.pdWaitMid
								: this.pdWaitMid.substring(0, this.pdWaitMidSize)),
				((this.pdTrans == null) ? null
						: (this.pdTrans.length() <= pdTransSize) ? this.pdTrans
								: this.pdTrans.substring(0, this.pdTransSize)),
				this.pdTransDate,
				((this.pdN2nSent == null) ? null
						: (this.pdN2nSent.length() <= pdN2nSentSize) ? this.pdN2nSent
								: this.pdN2nSent.substring(0, this.pdN2nSentSize)),
				this.pdTimestamp,
				((this.pdComments == null) ? null
						: (this.pdComments.length() <= pdCommentsSize) ? this.pdComments
								: this.pdComments.substring(0, this.pdCommentsSize)) };
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
		return new DAOArgs().arg(this.pdSerial).arg(this.pdPortId);
	}

	protected void set(Object[] fields) {
		this.pdSerial = ((Integer) fields[0]);
		this.pdPortId = rtrim((String) fields[1]);

		this.pdSequence = ((Integer) fields[2]);
		this.pdMsisdn = rtrim((String) fields[3]);

		this.pdStatus = rtrim((String) fields[4]);

		this.pdInOut = rtrim((String) fields[5]);

		this.pdNetwrk = rtrim((String) fields[6]);

		this.pdWaitMid = rtrim((String) fields[7]);

		this.pdTrans = rtrim((String) fields[8]);

		this.pdTransDate = ((fields[9] == null) ? null : new Date(fields[9]));
		this.pdN2nSent = rtrim((String) fields[10]);
		this.pdTimestamp = ((fields[11] == null) ? null :new DateTime((DateTime) fields[11]));
		this.pdComments = rtrim((String) fields[12]);

	}

	public void set(final Integer pdSerial, final String pdPortId, final Integer pdSequence, final String pdMsisdn,
			final String pdStatus, final String pdInOut, final String pdNetwrk, final String pdWaitMid,
			final String pdTrans, final Date pdTransDate, final String pdN2nSent, final DateTime pdTimestamp,
			final String pdComments) {

		this.pdSerial = pdSerial;
		this.pdPortId = pdPortId;
		this.pdSequence = pdSequence;
		this.pdMsisdn = pdMsisdn;
		this.pdStatus = pdStatus;
		this.pdInOut = pdInOut;
		this.pdNetwrk = pdNetwrk;
		this.pdWaitMid = pdWaitMid;
		this.pdTrans = pdTrans;
		this.pdTransDate = pdTransDate;
		this.pdN2nSent = pdN2nSent;
		this.pdTimestamp = pdTimestamp;
		this.pdComments = pdComments;
	}

	public Integer getPdSerial() {
		return pdSerial;
	}

	public void setPdSerial(Integer pdSerial) {
		this.pdSerial = pdSerial;
	}

	public String getPdPortId() {
		return pdPortId;
	}

	public void setPdPortId(String pdPortId) {
		this.pdPortId = pdPortId;
	}

	public Integer getPdSequence() {
		return pdSequence;
	}

	public void setPdSequence(Integer pdSequence) {
		this.pdSequence = pdSequence;
	}

	public String getPdMsisdn() {
		return pdMsisdn;
	}

	public void setPdMsisdn(String pdMsisdn) {
		this.pdMsisdn = pdMsisdn;
	}

	public String getPdStatus() {
		return pdStatus;
	}

	public void setPdStatus(String pdStatus) {
		this.pdStatus = pdStatus;
	}

	public String getPdInOut() {
		return pdInOut;
	}

	public void setPdInOut(String pdInOut) {
		this.pdInOut = pdInOut;
	}

	public String getPdNetwrk() {
		return pdNetwrk;
	}

	public void setPdNetwrk(String pdNetwrk) {
		this.pdNetwrk = pdNetwrk;
	}

	public String getPdWaitMid() {
		return pdWaitMid;
	}

	public void setPdWaitMid(String pdWaitMid) {
		this.pdWaitMid = pdWaitMid;
	}

	public String getPdTrans() {
		return pdTrans;
	}

	public void setPdTrans(String pdTrans) {
		this.pdTrans = pdTrans;
	}

	public Date getPdTransDate() {
		return pdTransDate;
	}

	public void setPdTransDate(Date pdTransDate) {
		this.pdTransDate = pdTransDate;
	}

	public String getPdN2nSent() {
		return pdN2nSent;
	}

	public void setPdN2nSent(String pdN2nSent) {
		this.pdN2nSent = pdN2nSent;
	}

	public DateTime getPdTimestamp() {
		return pdTimestamp;
	}

	public void setPdTimestamp(DateTime pdTimestamp) {
		this.pdTimestamp = pdTimestamp;
	}

	public String getPdComments() {
		return pdComments;
	}

	public void setPdComments(String pdComments) {
		this.pdComments = pdComments;
	}

	@Override
	public String toString() {
		return "\nPdPortDetailDMO [\npdSerial=" + pdSerial + "\npdPortId=" + pdPortId + "\npdSequence=" + pdSequence
				+ "\npdMsisdn=" + pdMsisdn + "\npdStatus=" + pdStatus + "\npdInOut=" + pdInOut + "\npdNetwrk="
				+ pdNetwrk + "\npdWaitMid=" + pdWaitMid + "\npdTrans=" + pdTrans + "\npdTransDate=" + pdTransDate
				+ "\npdN2nSent=" + pdN2nSent + "\npdTimestamp=" + pdTimestamp + "\npdComments=" + pdComments + "]";
	}
}