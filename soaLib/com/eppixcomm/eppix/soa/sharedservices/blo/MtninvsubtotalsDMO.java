package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class MtninvsubtotalsDMO extends DBO implements Serializable {

	private Integer inCount;
	private BigDecimal inValue;

	public static final int inCountFilter = 0;

	public static final int inValueFilter = 1;

	public MtninvsubtotalsDMO() {
	};

	public MtninvsubtotalsDMO(final Integer inCount, final BigDecimal inValue) {

		this.inCount = inCount;
		this.inValue = inValue;
	};

	private static final int[] fieldSizes = new int[] { 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.inCount, this.inValue };
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
		this.inCount = ((Integer) fields[0]);
		this.inValue = ((BigDecimal) fields[1]);
	}

	public void set(final Integer inCount, final BigDecimal inValue) {

		this.inCount = inCount;
		this.inValue = inValue;
	}

	public Integer getInCount() {
		return inCount;
	}

	public void setInCount(Integer inCount) {
		this.inCount = inCount;
	}

	public BigDecimal getInValue() {
		return inValue;
	}

	public void setInValue(BigDecimal inValue) {
		this.inValue = inValue;
	}
}
