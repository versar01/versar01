package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class CrlCycleRulesDMO extends DBO implements Serializable {

	private Integer crlRuleId;
	private String crlType;
	private String crlValue;
	private Integer crlItems;

	public static final int crlRuleIdFilter = 0;

	public static final int crlTypeFilter = 1;
	private static final int crlTypeSize = 1;

	public static final int crlValueFilter = 2;
	private static final int crlValueSize = 10;

	public static final int crlItemsFilter = 3;

	public CrlCycleRulesDMO() {
	};

	public CrlCycleRulesDMO(final Integer crlRuleId, final String crlType,
			final String crlValue, final Integer crlItems) {

		this.crlRuleId = crlRuleId;
		this.crlType = crlType;
		this.crlValue = crlValue;
		this.crlItems = crlItems;
	};

	private static final int[] fieldSizes = new int[] { 0, crlTypeSize,
			crlValueSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.crlRuleId,
				((this.crlType == null) ? null
						: (this.crlType.length() <= crlTypeSize) ? this.crlType
								: this.crlType.substring(0, this.crlTypeSize)),
				((this.crlValue == null) ? null
						: (this.crlValue.length() <= crlValueSize) ? this.crlValue
								: this.crlValue.substring(0, this.crlValueSize)),
				this.crlItems };
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
		this.crlRuleId = ((Integer) fields[0]);
		this.crlType = rtrim((String) fields[1]);
		this.crlValue = rtrim((String) fields[2]);
		this.crlItems = ((Integer) fields[3]);
	}

	public void set(final Integer crlRuleId, final String crlType,
			final String crlValue, final Integer crlItems) {

		this.crlRuleId = crlRuleId;
		this.crlType = crlType;
		this.crlValue = crlValue;
		this.crlItems = crlItems;
	}

	public Integer getCrlRuleId() {
		return crlRuleId;
	}

	public void setCrlRuleId(Integer crlRuleId) {
		this.crlRuleId = crlRuleId;
	}

	public String getCrlType() {
		return crlType;
	}

	public void setCrlType(String crlType) {
		this.crlType = crlType;
	}

	public String getCrlValue() {
		return crlValue;
	}

	public void setCrlValue(String crlValue) {
		this.crlValue = crlValue;
	}

	public Integer getCrlItems() {
		return crlItems;
	}

	public void setCrlItems(Integer crlItems) {
		this.crlItems = crlItems;
	}

}
