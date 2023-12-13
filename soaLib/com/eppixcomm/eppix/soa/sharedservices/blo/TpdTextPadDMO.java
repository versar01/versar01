package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TpdTextPadDMO extends DBO implements Serializable {

	private Integer tpdOwnerSerial;
	private String tpdType;
	private Short tpdPageNo;
	private Short tpdBlockNo;
	private Short tpdBlockAttr;
	private String tpdBlockText;

	public static final int tpdOwnerSerialFilter = 0;

	public static final int tpdTypeFilter = 1;
	private static final int tpdTypeSize = 1;

	public static final int tpdPageNoFilter = 2;

	public static final int tpdBlockNoFilter = 3;

	public static final int tpdBlockAttrFilter = 4;

	public static final int tpdBlockTextFilter = 5;
	private static final int tpdBlockTextSize = 100;

	public TpdTextPadDMO() {
	};

	public TpdTextPadDMO(final Integer tpdOwnerSerial, final String tpdType,
			final Short tpdPageNo, final Short tpdBlockNo,
			final Short tpdBlockAttr, final String tpdBlockText) {

		this.tpdOwnerSerial = tpdOwnerSerial;
		this.tpdType = tpdType;
		this.tpdPageNo = tpdPageNo;
		this.tpdBlockNo = tpdBlockNo;
		this.tpdBlockAttr = tpdBlockAttr;
		this.tpdBlockText = tpdBlockText;
	};

	private static final int[] fieldSizes = new int[] { 0, tpdTypeSize, 0, 0,
			0, tpdBlockTextSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.tpdOwnerSerial,
				((this.tpdType == null) ? null
						: (this.tpdType.length() <= tpdTypeSize) ? this.tpdType
								: this.tpdType.substring(0, this.tpdTypeSize)),
				this.tpdPageNo,
				this.tpdBlockNo,
				this.tpdBlockAttr,
				((this.tpdBlockText == null) ? null : (this.tpdBlockText
						.length() <= tpdBlockTextSize) ? this.tpdBlockText
						: this.tpdBlockText.substring(0, this.tpdBlockTextSize)) };
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
		this.tpdOwnerSerial = ((Integer) fields[0]);
		this.tpdType = rtrim((String) fields[1]);
		this.tpdPageNo = ((Short) fields[2]);
		this.tpdBlockNo = ((Short) fields[3]);
		this.tpdBlockAttr = ((Short) fields[4]);
		this.tpdBlockText = rtrim((String) fields[5]);
	}

	public void set(final Integer tpdOwnerSerial, final String tpdType,
			final Short tpdPageNo, final Short tpdBlockNo,
			final Short tpdBlockAttr, final String tpdBlockText) {

		this.tpdOwnerSerial = tpdOwnerSerial;
		this.tpdType = tpdType;
		this.tpdPageNo = tpdPageNo;
		this.tpdBlockNo = tpdBlockNo;
		this.tpdBlockAttr = tpdBlockAttr;
		this.tpdBlockText = tpdBlockText;
	}

	public Integer getTpdOwnerSerial() {
		return tpdOwnerSerial;
	}

	public void setTpdOwnerSerial(Integer tpdOwnerSerial) {
		this.tpdOwnerSerial = tpdOwnerSerial;
	}

	public String getTpdType() {
		return tpdType;
	}

	public void setTpdType(String tpdType) {
		this.tpdType = tpdType;
	}

	public Short getTpdPageNo() {
		return tpdPageNo;
	}

	public void setTpdPageNo(Short tpdPageNo) {
		this.tpdPageNo = tpdPageNo;
	}

	public Short getTpdBlockNo() {
		return tpdBlockNo;
	}

	public void setTpdBlockNo(Short tpdBlockNo) {
		this.tpdBlockNo = tpdBlockNo;
	}

	public Short getTpdBlockAttr() {
		return tpdBlockAttr;
	}

	public void setTpdBlockAttr(Short tpdBlockAttr) {
		this.tpdBlockAttr = tpdBlockAttr;
	}

	public String getTpdBlockText() {
		return tpdBlockText;
	}

	public void setTpdBlockText(String tpdBlockText) {
		this.tpdBlockText = tpdBlockText;
	}

}
