package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class FflFamfrndListDMO extends DBO implements Serializable {

	private Integer fflSubscriberId;
	private String fflSimNo;
	private String fflServiceCode;
	private String fflNumber;
	private Integer fflCallGrp;
	private Date fflEffectiveDate;
	private Date fflTermDate;
	private Double fflPreDiscVal;
	private Double fflPostDiscVal;
	private Integer fflInvoiceNo;

	public static final int fflSubscriberIdFilter = 0;

	public static final int fflSimNoFilter = 1;
	private static final int fflSimNoSize = 14;

	public static final int fflServiceCodeFilter = 2;
	private static final int fflServiceCodeSize = 4;

	public static final int fflNumberFilter = 3;
	private static final int fflNumberSize = 20;

	public static final int fflCallGrpFilter = 4;

	public static final int fflEffectiveDateFilter = 5;

	public static final int fflTermDateFilter = 6;

	public static final int fflPreDiscValFilter = 7;

	public static final int fflPostDiscValFilter = 8;

	public static final int fflInvoiceNoFilter = 9;

	public FflFamfrndListDMO() {
	};

	public FflFamfrndListDMO(final Integer fflSubscriberId,
			final String fflSimNo, final String fflServiceCode,
			final String fflNumber, final Integer fflCallGrp,
			final Date fflEffectiveDate, final Date fflTermDate,
			final Double fflPreDiscVal, final Double fflPostDiscVal,
			final Integer fflInvoiceNo) {

		this.fflSubscriberId = fflSubscriberId;
		this.fflSimNo = fflSimNo;
		this.fflServiceCode = fflServiceCode;
		this.fflNumber = fflNumber;
		this.fflCallGrp = fflCallGrp;
		this.fflEffectiveDate = fflEffectiveDate;
		this.fflTermDate = fflTermDate;
		this.fflPreDiscVal = fflPreDiscVal;
		this.fflPostDiscVal = fflPostDiscVal;
		this.fflInvoiceNo = fflInvoiceNo;
	};

	private static final int[] fieldSizes = new int[] { 0, fflSimNoSize,
			fflServiceCodeSize, fflNumberSize, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.fflSubscriberId,
				((this.fflSimNo == null) ? null
						: (this.fflSimNo.length() <= fflSimNoSize) ? this.fflSimNo
								: this.fflSimNo.substring(0, this.fflSimNoSize)),
				((this.fflServiceCode == null) ? null : (this.fflServiceCode
						.length() <= fflServiceCodeSize) ? this.fflServiceCode
						: this.fflServiceCode.substring(0,
								this.fflServiceCodeSize)),
				((this.fflNumber == null) ? null
						: (this.fflNumber.length() <= fflNumberSize) ? this.fflNumber
								: this.fflNumber.substring(0,
										this.fflNumberSize)), this.fflCallGrp,
				this.fflEffectiveDate, this.fflTermDate, this.fflPreDiscVal,
				this.fflPostDiscVal, this.fflInvoiceNo };
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
		this.fflSubscriberId = ((Integer) fields[0]);
		this.fflSimNo = rtrim((String) fields[1]);
		this.fflServiceCode = rtrim((String) fields[2]);
		this.fflNumber = rtrim((String) fields[3]);
		this.fflCallGrp = ((Integer) fields[4]);
		this.fflEffectiveDate = ((fields[5] == null) ? null : new Date(
				 fields[5]));
		this.fflTermDate = ((fields[6] == null) ? null : new Date(
				 fields[6]));
		this.fflPreDiscVal = ((Double) fields[7]);
		this.fflPostDiscVal = ((Double) fields[8]);
		this.fflInvoiceNo = ((Integer) fields[9]);
	}

	public void set(final Integer fflSubscriberId, final String fflSimNo,
			final String fflServiceCode, final String fflNumber,
			final Integer fflCallGrp, final Date fflEffectiveDate,
			final Date fflTermDate, final Double fflPreDiscVal,
			final Double fflPostDiscVal, final Integer fflInvoiceNo) {

		this.fflSubscriberId = fflSubscriberId;
		this.fflSimNo = fflSimNo;
		this.fflServiceCode = fflServiceCode;
		this.fflNumber = fflNumber;
		this.fflCallGrp = fflCallGrp;
		this.fflEffectiveDate = fflEffectiveDate;
		this.fflTermDate = fflTermDate;
		this.fflPreDiscVal = fflPreDiscVal;
		this.fflPostDiscVal = fflPostDiscVal;
		this.fflInvoiceNo = fflInvoiceNo;
	}

	public Integer getFflSubscriberId() {
		return fflSubscriberId;
	}

	public void setFflSubscriberId(Integer fflSubscriberId) {
		this.fflSubscriberId = fflSubscriberId;
	}

	public String getFflSimNo() {
		return fflSimNo;
	}

	public void setFflSimNo(String fflSimNo) {
		this.fflSimNo = fflSimNo;
	}

	public String getFflServiceCode() {
		return fflServiceCode;
	}

	public void setFflServiceCode(String fflServiceCode) {
		this.fflServiceCode = fflServiceCode;
	}

	public String getFflNumber() {
		return fflNumber;
	}

	public void setFflNumber(String fflNumber) {
		this.fflNumber = fflNumber;
	}

	public Integer getFflCallGrp() {
		return fflCallGrp;
	}

	public void setFflCallGrp(Integer fflCallGrp) {
		this.fflCallGrp = fflCallGrp;
	}

	public Date getFflEffectiveDate() {
		return fflEffectiveDate;
	}

	public void setFflEffectiveDate(Date fflEffectiveDate) {
		this.fflEffectiveDate = fflEffectiveDate;
	}

	public Date getFflTermDate() {
		return fflTermDate;
	}

	public void setFflTermDate(Date fflTermDate) {
		this.fflTermDate = fflTermDate;
	}

	public Double getFflPreDiscVal() {
		return fflPreDiscVal;
	}

	public void setFflPreDiscVal(Double fflPreDiscVal) {
		this.fflPreDiscVal = fflPreDiscVal;
	}

	public Double getFflPostDiscVal() {
		return fflPostDiscVal;
	}

	public void setFflPostDiscVal(Double fflPostDiscVal) {
		this.fflPostDiscVal = fflPostDiscVal;
	}

	public Integer getFflInvoiceNo() {
		return fflInvoiceNo;
	}

	public void setFflInvoiceNo(Integer fflInvoiceNo) {
		this.fflInvoiceNo = fflInvoiceNo;
	}

}
