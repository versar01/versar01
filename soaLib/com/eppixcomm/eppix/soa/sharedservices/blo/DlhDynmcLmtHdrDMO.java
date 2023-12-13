package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class DlhDynmcLmtHdrDMO extends DBO implements Serializable {

	private Integer dlhId;
	private String dlhIdNo;
	private String dlhPassportNo;
	private Integer dlhRiskBandId;
	private BigDecimal dlhDclValue;
	private BigDecimal dlhAvailCredit;
	private DateTime dlhCreatedDate;

	public static final int dlhIdFilter = 0;

	public static final int dlhIdNoFilter = 1;
	private static final int dlhIdNoSize = 15;

	public static final int dlhPassportNoFilter = 2;
	private static final int dlhPassportNoSize = 30;

	public static final int dlhRiskBandIdFilter = 3;

	public static final int dlhDclValueFilter = 4;

	public static final int dlhAvailCreditFilter = 5;

	public static final int dlhCreatedDateFilter = 6;

	public DlhDynmcLmtHdrDMO() {
	};

	public DlhDynmcLmtHdrDMO(final Integer dlhId, final String dlhIdNo,
			final String dlhPassportNo, final Integer dlhRiskBandId,
			final BigDecimal dlhDclValue, final BigDecimal dlhAvailCredit,
			final DateTime dlhCreatedDate) {

		this.dlhId = dlhId;
		this.dlhIdNo = dlhIdNo;
		this.dlhPassportNo = dlhPassportNo;
		this.dlhRiskBandId = dlhRiskBandId;
		this.dlhDclValue = dlhDclValue;
		this.dlhAvailCredit = dlhAvailCredit;
		this.dlhCreatedDate = dlhCreatedDate;
	};

	private static final int[] fieldSizes = new int[] { 0, dlhIdNoSize,
			dlhPassportNoSize, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dlhId,
				((this.dlhIdNo == null) ? null
						: (this.dlhIdNo.length() <= dlhIdNoSize) ? this.dlhIdNo
								: this.dlhIdNo.substring(0, this.dlhIdNoSize)),
				((this.dlhPassportNo == null) ? null : (this.dlhPassportNo
						.length() <= dlhPassportNoSize) ? this.dlhPassportNo
						: this.dlhPassportNo.substring(0,
								this.dlhPassportNoSize)), this.dlhRiskBandId,
				this.dlhDclValue, this.dlhAvailCredit, this.dlhCreatedDate };
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
		return new DAOArgs(1).arg(this.dlhId);
	}

	protected void set(Object[] fields) {
		this.dlhId = ((Integer) fields[0]);
		this.dlhIdNo = rtrim((String) fields[1]);
		this.dlhPassportNo = rtrim((String) fields[2]);
		this.dlhRiskBandId = ((Integer) fields[3]);
		this.dlhDclValue = ((BigDecimal) fields[4]);
		this.dlhAvailCredit = ((BigDecimal) fields[5]);
		this.dlhCreatedDate = ((fields[6] == null) ? null : new DateTime(
				(DateTime) fields[6]));
	}

	public void set(final Integer dlhId, final String dlhIdNo,
			final String dlhPassportNo, final Integer dlhRiskBandId,
			final BigDecimal dlhDclValue, final BigDecimal dlhAvailCredit,
			final DateTime dlhCreatedDate) {

		this.dlhId = dlhId;
		this.dlhIdNo = dlhIdNo;
		this.dlhPassportNo = dlhPassportNo;
		this.dlhRiskBandId = dlhRiskBandId;
		this.dlhDclValue = dlhDclValue;
		this.dlhAvailCredit = dlhAvailCredit;
		this.dlhCreatedDate = dlhCreatedDate;
	}

	public Integer getDlhId() {
		return dlhId;
	}

	public void setDlhId(Integer dlhId) {
		this.dlhId = dlhId;
	}

	public String getDlhIdNo() {
		return dlhIdNo;
	}

	public void setDlhIdNo(String dlhIdNo) {
		this.dlhIdNo = dlhIdNo;
	}

	public String getDlhPassportNo() {
		return dlhPassportNo;
	}

	public void setDlhPassportNo(String dlhPassportNo) {
		this.dlhPassportNo = dlhPassportNo;
	}

	public Integer getDlhRiskBandId() {
		return dlhRiskBandId;
	}

	public void setDlhRiskBandId(Integer dlhRiskBandId) {
		this.dlhRiskBandId = dlhRiskBandId;
	}

	public BigDecimal getDlhDclValue() {
		return dlhDclValue;
	}

	public void setDlhDclValue(BigDecimal dlhDclValue) {
		this.dlhDclValue = dlhDclValue;
	}

	public BigDecimal getDlhAvailCredit() {
		return dlhAvailCredit;
	}

	public void setDlhAvailCredit(BigDecimal dlhAvailCredit) {
		this.dlhAvailCredit = dlhAvailCredit;
	}

	public DateTime getDlhCreatedDate() {
		return dlhCreatedDate;
	}

	public void setDlhCreatedDate(DateTime dlhCreatedDate) {
		this.dlhCreatedDate = dlhCreatedDate;
	}

}
