package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class CuhCustomerHistDescDQO extends DBO implements Serializable {
	// Globals
	private String cuhBillAcNo;
	private Integer cuhFieldId;
	private String cuhHistCode;
	private String cuhOldValue;
	private String cuhNewValue;
	private String cuhUserId;
	private String cuhTerminalId;
	private DateTime cuhTimestamp;
	private String dcode;
	private String ddesc;
	private String dflag;

	public static final int cuhBillAcNoFilter = 0;
	private static final int cuhBillAcNoSize = 8;

	public static final int cuhFieldIdFilter = 1;

	public static final int cuhHistCodeFilter = 2;
	private static final int cuhHistCodeSize = 10;

	public static final int cuhOldValueFilter = 3;
	private static final int cuhOldValueSize = 50;

	public static final int cuhNewValueFilter = 4;
	private static final int cuhNewValueSize = 50;

	public static final int cuhUserIdFilter = 5;
	private static final int cuhUserIdSize = 10;

	public static final int cuhTerminalIdFilter = 6;
	private static final int cuhTerminalIdSize = 10;

	public static final int cuhTimestampFilter = 7;

	public static final int dcodeFilter = 8;
	private static final int dcodeSize = 10;

	public static final int ddescFilter = 9;
	private static final int ddescSize = 32;

	public static final int dflagFilter = 10;
	private static final int dflagSize = 1;

	public CuhCustomerHistDescDQO() {
	};

	public CuhCustomerHistDescDQO(final String cuhBillAcNo,
			final Integer cuhFieldId, final String cuhHistCode,
			final String cuhOldValue, final String cuhNewValue,
			final String cuhUserId, final String cuhTerminalId,
			final DateTime cuhTimestamp, final String dcode, final String ddesc,
			final String dflag) {

		this.cuhBillAcNo = cuhBillAcNo;
		this.cuhFieldId = cuhFieldId;
		this.cuhHistCode = cuhHistCode;
		this.cuhOldValue = cuhOldValue;
		this.cuhNewValue = cuhNewValue;
		this.cuhUserId = cuhUserId;
		this.cuhTerminalId = cuhTerminalId;
		this.cuhTimestamp = cuhTimestamp;
		this.dcode = dcode;
		this.ddesc = ddesc;
		this.dflag = dflag;
	};

	private static final int[] fieldSizes = new int[] { cuhBillAcNoSize, 0,
			cuhHistCodeSize, cuhOldValueSize, cuhNewValueSize, cuhUserIdSize,
			cuhTerminalIdSize, 0, dcodeSize, ddescSize, dflagSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.cuhBillAcNo == null) ? null
						: (this.cuhBillAcNo.length() <= cuhBillAcNoSize) ? this.cuhBillAcNo
								: this.cuhBillAcNo.substring(0,
										this.cuhBillAcNoSize)),
				this.cuhFieldId,
				((this.cuhHistCode == null) ? null
						: (this.cuhHistCode.length() <= cuhHistCodeSize) ? this.cuhHistCode
								: this.cuhHistCode.substring(0,
										this.cuhHistCodeSize)),
				((this.cuhOldValue == null) ? null
						: (this.cuhOldValue.length() <= cuhOldValueSize) ? this.cuhOldValue
								: this.cuhOldValue.substring(0,
										this.cuhOldValueSize)),
				((this.cuhNewValue == null) ? null
						: (this.cuhNewValue.length() <= cuhNewValueSize) ? this.cuhNewValue
								: this.cuhNewValue.substring(0,
										this.cuhNewValueSize)),
				((this.cuhUserId == null) ? null
						: (this.cuhUserId.length() <= cuhUserIdSize) ? this.cuhUserId
								: this.cuhUserId.substring(0,
										this.cuhUserIdSize)),
				((this.cuhTerminalId == null) ? null : (this.cuhTerminalId
						.length() <= cuhTerminalIdSize) ? this.cuhTerminalId
						: this.cuhTerminalId.substring(0,
								this.cuhTerminalIdSize)),
				this.cuhTimestamp,
				((this.dcode == null) ? null
						: (this.dcode.length() <= dcodeSize) ? this.dcode
								: this.dcode.substring(0, this.dcodeSize)),
				((this.ddesc == null) ? null
						: (this.ddesc.length() <= ddescSize) ? this.ddesc
								: this.ddesc.substring(0, this.ddescSize)),
				((this.dflag == null) ? null
						: (this.dflag.length() <= dflagSize) ? this.dflag
								: this.dflag.substring(0, this.dflagSize)) };
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
		this.cuhBillAcNo = rtrim((String) fields[0]);
		this.cuhFieldId = ((Integer) fields[1]);
		this.cuhHistCode = rtrim((String) fields[2]);
		this.cuhOldValue = rtrim((String) fields[3]);
		this.cuhNewValue = rtrim((String) fields[4]);
		this.cuhUserId = rtrim((String) fields[5]);
		this.cuhTerminalId = rtrim((String) fields[6]);
		this.cuhTimestamp = ((fields[7] == null) ? null : new DateTime((DateTime)fields[7]));
		this.dcode = rtrim((String) fields[8]);
		this.ddesc = rtrim((String) fields[9]);
		this.dflag = rtrim((String) fields[10]);
	}

	public void set(final String cuhBillAcNo, final Integer cuhFieldId,
			final String cuhHistCode, final String cuhOldValue,
			final String cuhNewValue, final String cuhUserId,
			final String cuhTerminalId, final DateTime cuhTimestamp,
			final String dcode, final String ddesc, final String dflag) {

		this.cuhBillAcNo = cuhBillAcNo;
		this.cuhFieldId = cuhFieldId;
		this.cuhHistCode = cuhHistCode;
		this.cuhOldValue = cuhOldValue;
		this.cuhNewValue = cuhNewValue;
		this.cuhUserId = cuhUserId;
		this.cuhTerminalId = cuhTerminalId;
		this.cuhTimestamp = cuhTimestamp;
		this.dcode = dcode;
		this.ddesc = ddesc;
		this.dflag = dflag;
	}

	public String getCuhBillAcNo() {
		return cuhBillAcNo;
	}

	public void setCuhBillAcNo(String cuhBillAcNo) {
		this.cuhBillAcNo = cuhBillAcNo;
	}

	public Integer getCuhFieldId() {
		return cuhFieldId;
	}

	public void setCuhFieldId(Integer cuhFieldId) {
		this.cuhFieldId = cuhFieldId;
	}

	public String getCuhHistCode() {
		return cuhHistCode;
	}

	public void setCuhHistCode(String cuhHistCode) {
		this.cuhHistCode = cuhHistCode;
	}

	public String getCuhOldValue() {
		return cuhOldValue;
	}

	public void setCuhOldValue(String cuhOldValue) {
		this.cuhOldValue = cuhOldValue;
	}

	public String getCuhNewValue() {
		return cuhNewValue;
	}

	public void setCuhNewValue(String cuhNewValue) {
		this.cuhNewValue = cuhNewValue;
	}

	public String getCuhUserId() {
		return cuhUserId;
	}

	public void setCuhUserId(String cuhUserId) {
		this.cuhUserId = cuhUserId;
	}

	public String getCuhTerminalId() {
		return cuhTerminalId;
	}

	public void setCuhTerminalId(String cuhTerminalId) {
		this.cuhTerminalId = cuhTerminalId;
	}

	public DateTime getCuhTimestamp() {
		return cuhTimestamp;
	}

	public void setCuhTimestamp(DateTime cuhTimestamp) {
		this.cuhTimestamp = cuhTimestamp;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}

	public String getDflag() {
		return dflag;
	}

	public void setDflag(String dflag) {
		this.dflag = dflag;
	}

}
