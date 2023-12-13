package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

/**
 * @author sarel.vermeulen
 * 
 */
public class PdPortDetailsDMO extends DBO implements Serializable {

	// ~ Instance variables
	// /////////////////////////////////////////////////////
	private Integer pdSerial;
	private String pdPortId;
	private String pdMsisdn;
	private String pdStatus;
	private String pdInOut;
	private String pdNetwrk;
	private String pdWaitMid;
	private String pdTrans;
	private Date pdTransDate;
	private String pdN2nSent;
	private DateTime pdTimestamp;

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATEONLY, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME };

	/**
	 * TODO SJ Implement the array of field sizes
	 * 
	 */
	private final int[] fieldSizes = new int[] {
			0,
			pdPortIdSize,
			pdMsisdnSize,
			pdStatusSize,
			pdInOutSize,
			pdNetwrkSize,
			pdWaitMidSize,
			pdTransSize,
			0,
			pdN2nSentSize,
			0
	};

	public int[] fieldSizes() {
		return fieldSizes;
	}

	public static final int pdSerialFilter = 0; // filter index

	public static final int pdPortIdFilter = 1; // filter index
	private static final int pdPortIdSize = 50; // field size

	public static final int pdMsisdnFilter = 2; // filter index
	private static final int pdMsisdnSize = 15; // field size

	public static final int pdStatusFilter = 3; // filter index
	private static final int pdStatusSize = 1; // field size

	public static final int pdInOutFilter = 4; // filter index
	private static final int pdInOutSize = 1; // field size

	public static final int pdNetwrkFilter = 5; // filter index
	private static final int pdNetwrkSize = 5; // field size

	public static final int pdWaitMidFilter = 6; // filter index
	private static final int pdWaitMidSize = 1; // field size

	public static final int pdTransFilter = 7; // filter index
	private static final int pdTransSize = 2; // field size

	public static final int pdTransDateFilter = 8; // filter index

	public static final int pdN2nSentFilter = 9; // filter index
	private static final int pdN2nSentSize = 1; // field size

	public static final int pdTimestampFilter = 10; // filter index

	protected void generatedKey(Integer key) {
		this.setPdSerial(key);
	}

	protected Object[] get() {
		return new Object[] {
				pdSerial,
				(pdPortId == null) ? null
						: ((pdPortId.length() <= pdPortIdSize) ? pdPortId
								: pdPortId.substring(0, pdPortIdSize)),
				(pdMsisdn == null) ? null
						: ((pdMsisdn.length() <= pdMsisdnSize) ? pdMsisdn
								: pdMsisdn.substring(0, pdMsisdnSize)),
				(pdStatus == null) ? null
						: ((pdStatus.length() <= pdStatusSize) ? pdStatus
								: pdStatus.substring(0, pdStatusSize)),
				(pdInOut == null) ? null
						: ((pdInOut.length() <= pdInOutSize) ? pdInOut
								: pdInOut.substring(0, pdInOutSize)),
				(pdNetwrk == null) ? null
						: ((pdNetwrk.length() <= pdNetwrkSize) ? pdNetwrk
								: pdNetwrk.substring(0, pdNetwrkSize)),
				(pdWaitMid == null) ? null
						: ((pdWaitMid.length() <= pdWaitMidSize) ? pdWaitMid
								: pdWaitMid.substring(0, pdWaitMidSize)),
				(pdTrans == null) ? null
						: ((pdTrans.length() <= pdTransSize) ? pdTrans
								: pdTrans.substring(0, pdTransSize)),

				(pdTransDate == null) ? null : new Date(pdTransDate),

				(pdN2nSent == null) ? null
						: ((pdN2nSent.length() <= pdN2nSentSize) ? pdN2nSent
								: pdN2nSent.substring(0, pdN2nSentSize)),
				pdTimestamp };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(1).arg((this.pdSerial == null) ? null
				: this.pdSerial);
	}


	protected void set(Object[] fields) {
		pdSerial = (Integer) fields[0];
		pdPortId = rtrim((String) fields[1]);
		pdMsisdn = rtrim((String) fields[2]);
		pdStatus = rtrim((String) fields[3]);
		pdInOut = rtrim((String) fields[4]);
		pdNetwrk = rtrim((String) fields[5]);
		pdWaitMid = rtrim((String) fields[6]);
		pdTrans = rtrim((String) fields[7]);
		pdTransDate = (Date) fields[8];
		pdN2nSent = rtrim((String) fields[9]);
		pdTimestamp = (DateTime) fields[10];
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
		this.pdPortId = getPadded(pdPortId, pdPortIdFilter);
	}

	public String getPdMsisdn() {
		return pdMsisdn;
	}

	public void setPdMsisdn(String pdMsisdn) {
		this.pdMsisdn = getPadded(pdMsisdn, pdMsisdnFilter);
	}

	public String getPdStatus() {
		return pdStatus;
	}

	public void setPdStatus(String pdStatus) {
		this.pdStatus = getPadded(pdStatus, pdStatusFilter);
	}

	public String getPdInOut() {
		return pdInOut;
	}

	public void setPdInOut(String pdInOut) {
		this.pdInOut = getPadded(pdInOut, pdInOutFilter);
	}

	public String getPdNetwrk() {
		return pdNetwrk;
	}

	public void setPdNetwrk(String pdNetwrk) {
		this.pdNetwrk = getPadded(pdNetwrk, pdNetwrkFilter);
	}

	public String getPdWaitMid() {
		return pdWaitMid;
	}

	public void setPdWaitMid(String pdWaitMid) {
		this.pdWaitMid = getPadded(pdWaitMid, pdWaitMidFilter);
	}

	public String getPdTrans() {
		return pdTrans;
	}

	public void setPdTrans(String pdTrans) {
		this.pdTrans = getPadded(pdTrans, pdTransDateFilter);
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
		this.pdN2nSent = getPadded(pdN2nSent, pdN2nSentFilter);
	}

	public DateTime getPdTimestamp() {
		return pdTimestamp;
	}

	public void setPdTimestamp(DateTime pdTimestamp) {
		this.pdTimestamp = pdTimestamp;
	}
}
