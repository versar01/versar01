package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EhEppixHierarchyDMO extends DBO implements Serializable {

	private Integer ehSerial;
	private Integer ehEntityId;
	private String ehType;
	private String ehValue;
	private Integer ehLink;
	private String ehHierType;

	public static final int ehSerialFilter = 0;

	public static final int ehEntityIdFilter = 1;

	public static final int ehTypeFilter = 2;
	private static final int ehTypeSize = 10;

	public static final int ehValueFilter = 3;
	private static final int ehValueSize = 32;

	public static final int ehLinkFilter = 4;

	public static final int ehHierTypeFilter = 5;
	private static final int ehHierTypeSize = 10;

	public EhEppixHierarchyDMO() {
	};

	public EhEppixHierarchyDMO(final Integer ehSerial,
			final Integer ehEntityId, final String ehType,
			final String ehValue, final Integer ehLink, final String ehHierType) {

		this.ehSerial = ehSerial;
		this.ehEntityId = ehEntityId;
		this.ehType = ehType;
		this.ehValue = ehValue;
		this.ehLink = ehLink;
		this.ehHierType = ehHierType;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, ehTypeSize,
			ehValueSize, 0, ehHierTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.ehSerial,
				this.ehEntityId,
				((this.ehType == null) ? null
						: (this.ehType.length() <= ehTypeSize) ? this.ehType
								: this.ehType.substring(0, this.ehTypeSize)),
				((this.ehValue == null) ? null
						: (this.ehValue.length() <= ehValueSize) ? this.ehValue
								: this.ehValue.substring(0, this.ehValueSize)),
				this.ehLink,
				((this.ehHierType == null) ? null
						: (this.ehHierType.length() <= ehHierTypeSize) ? this.ehHierType
								: this.ehHierType.substring(0,
										this.ehHierTypeSize)) };
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
		return new DAOArgs(1).arg(this.ehSerial);
	}

	protected void set(Object[] fields) {
		this.ehSerial = ((Integer) fields[0]);
		this.ehEntityId = ((Integer) fields[1]);
		this.ehType = rtrim((String) fields[2]);
		this.ehValue = rtrim((String) fields[3]);
		this.ehLink = ((Integer) fields[4]);
		this.ehHierType = rtrim((String) fields[5]);
	}

	public void set(final Integer ehSerial, final Integer ehEntityId,
			final String ehType, final String ehValue, final Integer ehLink,
			final String ehHierType) {

		this.ehSerial = ehSerial;
		this.ehEntityId = ehEntityId;
		this.ehType = ehType;
		this.ehValue = ehValue;
		this.ehLink = ehLink;
		this.ehHierType = ehHierType;
	}

	public Integer getEhSerial() {
		return ehSerial;
	}

	public void setEhSerial(Integer ehSerial) {
		this.ehSerial = ehSerial;
	}

	public Integer getEhEntityId() {
		return ehEntityId;
	}

	public void setEhEntityId(Integer ehEntityId) {
		this.ehEntityId = ehEntityId;
	}

	public String getEhType() {
		return ehType;
	}

	public void setEhType(String ehType) {
		this.ehType = ehType;
	}

	public String getEhValue() {
		return ehValue;
	}

	public void setEhValue(String ehValue) {
		this.ehValue = ehValue;
	}

	public Integer getEhLink() {
		return ehLink;
	}

	public void setEhLink(Integer ehLink) {
		this.ehLink = ehLink;
	}

	public String getEhHierType() {
		return ehHierType;
	}

	public void setEhHierType(String ehHierType) {
		this.ehHierType = ehHierType;
	}

}
