package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class HtHierarchyTypeDMO extends DBO implements Serializable {

	private String htType;
	private String htDesc;
	private String htServiceCode;
	private Short htMulti;
	private String htView;
	private String htModify;

	public static final int htTypeFilter = 0;
	private static final int htTypeSize = 10;

	public static final int htDescFilter = 1;
	private static final int htDescSize = 50;

	public static final int htServiceCodeFilter = 2;
	private static final int htServiceCodeSize = 4;

	public static final int htMultiFilter = 3;

	public static final int htViewFilter = 4;
	private static final int htViewSize = 8;

	public static final int htModifyFilter = 5;
	private static final int htModifySize = 8;

	public HtHierarchyTypeDMO() {
	};

	public HtHierarchyTypeDMO(final String htType, final String htDesc,
			final String htServiceCode, final Short htMulti,
			final String htView, final String htModify) {

		this.htType = htType;
		this.htDesc = htDesc;
		this.htServiceCode = htServiceCode;
		this.htMulti = htMulti;
		this.htView = htView;
		this.htModify = htModify;
	};

	private static final int[] fieldSizes = new int[] { htTypeSize, htDescSize,
			htServiceCodeSize, 0, htViewSize, htModifySize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.htType == null) ? null
						: (this.htType.length() <= htTypeSize) ? this.htType
								: this.htType.substring(0, this.htTypeSize)),
				((this.htDesc == null) ? null
						: (this.htDesc.length() <= htDescSize) ? this.htDesc
								: this.htDesc.substring(0, this.htDescSize)),
				((this.htServiceCode == null) ? null : (this.htServiceCode
						.length() <= htServiceCodeSize) ? this.htServiceCode
						: this.htServiceCode.substring(0,
								this.htServiceCodeSize)),
				this.htMulti,
				((this.htView == null) ? null
						: (this.htView.length() <= htViewSize) ? this.htView
								: this.htView.substring(0, this.htViewSize)),
				((this.htModify == null) ? null
						: (this.htModify.length() <= htModifySize) ? this.htModify
								: this.htModify.substring(0, this.htModifySize)) };
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
		return new DAOArgs(1).arg(this.htType);
	}

	protected void set(Object[] fields) {
		this.htType = rtrim((String) fields[0]);
		this.htDesc = rtrim((String) fields[1]);
		this.htServiceCode = rtrim((String) fields[2]);
		this.htMulti = ((Short) fields[3]);
		this.htView = rtrim((String) fields[4]);
		this.htModify = rtrim((String) fields[5]);
	}

	public void set(final String htType, final String htDesc,
			final String htServiceCode, final Short htMulti,
			final String htView, final String htModify) {

		this.htType = htType;
		this.htDesc = htDesc;
		this.htServiceCode = htServiceCode;
		this.htMulti = htMulti;
		this.htView = htView;
		this.htModify = htModify;
	}

	public String getHtType() {
		return htType;
	}

	public void setHtType(String htType) {
		this.htType = htType;
	}

	public String getHtDesc() {
		return htDesc;
	}

	public void setHtDesc(String htDesc) {
		this.htDesc = htDesc;
	}

	public String getHtServiceCode() {
		return htServiceCode;
	}

	public void setHtServiceCode(String htServiceCode) {
		this.htServiceCode = htServiceCode;
	}

	public Short getHtMulti() {
		return htMulti;
	}

	public void setHtMulti(Short htMulti) {
		this.htMulti = htMulti;
	}

	public String getHtView() {
		return htView;
	}

	public void setHtView(String htView) {
		this.htView = htView;
	}

	public String getHtModify() {
		return htModify;
	}

	public void setHtModify(String htModify) {
		this.htModify = htModify;
	}

}
