package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EafEpxAuxFieldsDMO extends DBO implements Serializable {

	private Integer eafId;
	private String eafTable;
	private String eafLink;
	private String eafAuxName;
	private String eafValue;

	public static final int eafIdFilter = 0;
	private static final int eafIdSize = 1;

	public static final int eafTableFilter = 1;
	private static final int eafTableSize = 30;

	public static final int eafLinkFilter = 2;
	private static final int eafLinkSize = 30;

	public static final int eafAuxNameFilter = 3;
	private static final int eafAuxNameSize = 30;

	public static final int eafValueFilter = 4;
	private static final int eafValueSize = 18;

	public EafEpxAuxFieldsDMO() {
	};

	public EafEpxAuxFieldsDMO(final Integer eafId, final String eafTable,
			final String eafLink, final String eafAuxName, final String eafValue) {

		this.eafId = eafId;
		this.eafTable = eafTable;
		this.eafLink = eafLink;
		this.eafAuxName = eafAuxName;
		this.eafValue = eafValue;
	};

	private static final int[] fieldSizes = new int[] { eafIdSize,
			eafTableSize, eafLinkSize, eafAuxNameSize, eafValueSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.eafId,
				((this.eafTable == null) ? null
						: (this.eafTable.length() <= eafTableSize) ? this.eafTable
								: this.eafTable.substring(0, this.eafTableSize)),
				((this.eafLink == null) ? null
						: (this.eafLink.length() <= eafLinkSize) ? this.eafLink
								: this.eafLink.substring(0, this.eafLinkSize)),
				((this.eafAuxName == null) ? null
						: (this.eafAuxName.length() <= eafAuxNameSize) ? this.eafAuxName
								: this.eafAuxName.substring(0,
										this.eafAuxNameSize)),
				((this.eafValue == null) ? null
						: (this.eafValue.length() <= eafValueSize) ? this.eafValue
								: this.eafValue.substring(0, this.eafValueSize)) };
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
		return new DAOArgs(1).arg(this.getEafId());
	}

	protected void set(Object[] fields) {
		this.eafId = (Integer) fields[0];
		this.eafTable = rtrim((String) fields[1]);
		this.eafLink = rtrim((String) fields[2]);
		this.eafAuxName = rtrim((String) fields[3]);
		this.eafValue = rtrim((String) fields[4]);
	}

	public void set(final Integer eafId, final String eafTable,
			final String eafLink, final String eafAuxName, final String eafValue) {

		this.eafId = eafId;
		this.eafTable = eafTable;
		this.eafLink = eafLink;
		this.eafAuxName = eafAuxName;
		this.eafValue = eafValue;
	}

	public Integer getEafId() {
		return eafId;
	}

	public void setEafId(Integer eafId) {
		this.eafId = eafId;
	}

	public String getEafTable() {
		return eafTable;
	}

	public void setEafTable(String eafTable) {
		this.eafTable = eafTable;
	}

	public String getEafLink() {
		return eafLink;
	}

	public void setEafLink(String eafLink) {
		this.eafLink = eafLink;
	}

	public String getEafAuxName() {
		return eafAuxName;
	}

	public void setEafAuxName(String eafAuxName) {
		this.eafAuxName = eafAuxName;
	}

	public String getEafValue() {
		return eafValue;
	}

	public void setEafValue(String eafValue) {
		this.eafValue = eafValue;
	}
}
