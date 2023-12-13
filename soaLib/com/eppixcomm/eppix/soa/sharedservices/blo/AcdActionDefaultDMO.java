package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AcdActionDefaultDMO extends DBO implements Serializable {

	private String acdTypeId;
	private String acdReasonId;
	private Integer acdGroupId;
	private String acdDefault;

	public static final int acdTypeIdFilter = 0;
	private static final int acdTypeIdSize = 8;

	public static final int acdReasonIdFilter = 1;
	private static final int acdReasonIdSize = 8;

	public static final int acdGroupIdFilter = 2;

	public static final int acdDefaultFilter = 3;
	private static final int acdDefaultSize = 1;

	public AcdActionDefaultDMO() {
	};

	public AcdActionDefaultDMO(final String acdTypeId,
			final String acdReasonId, final Integer acdGroupId,
			final String acdDefault) {

		this.acdTypeId = acdTypeId;
		this.acdReasonId = acdReasonId;
		this.acdGroupId = acdGroupId;
		this.acdDefault = acdDefault;
	};

	private static final int[] fieldSizes = new int[] { acdTypeIdSize,
			acdReasonIdSize, 0, acdDefaultSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.acdTypeId == null) ? null
						: (this.acdTypeId.length() <= acdTypeIdSize) ? this.acdTypeId
								: this.acdTypeId.substring(0,
										this.acdTypeIdSize)),
				((this.acdReasonId == null) ? null
						: (this.acdReasonId.length() <= acdReasonIdSize) ? this.acdReasonId
								: this.acdReasonId.substring(0,
										this.acdReasonIdSize)),
				this.acdGroupId,
				((this.acdDefault == null) ? null
						: (this.acdDefault.length() <= acdDefaultSize) ? this.acdDefault
								: this.acdDefault.substring(0,
										this.acdDefaultSize)) };
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
		return new DAOArgs(2).arg(this.acdTypeId).arg(this.acdReasonId); 
	}

	protected void set(Object[] fields) {
		this.acdTypeId = rtrim((String) fields[0]);
		this.acdReasonId = rtrim((String) fields[1]);
		this.acdGroupId = ((Integer) fields[2]);
		this.acdDefault = rtrim((String) fields[3]);
	}

	public void set(final String acdTypeId, final String acdReasonId,
			final Integer acdGroupId, final String acdDefault) {

		this.acdTypeId = acdTypeId;
		this.acdReasonId = acdReasonId;
		this.acdGroupId = acdGroupId;
		this.acdDefault = acdDefault;
	}

	public String getAcdTypeId() {
		return acdTypeId;
	}

	public void setAcdTypeId(String acdTypeId) {
		this.acdTypeId = acdTypeId;
	}

	public String getAcdReasonId() {
		return acdReasonId;
	}

	public void setAcdReasonId(String acdReasonId) {
		this.acdReasonId = acdReasonId;
	}

	public Integer getAcdGroupId() {
		return acdGroupId;
	}

	public void setAcdGroupId(Integer acdGroupId) {
		this.acdGroupId = acdGroupId;
	}

	public String getAcdDefault() {
		return acdDefault;
	}

	public void setAcdDefault(String acdDefault) {
		this.acdDefault = acdDefault;
	}

}
