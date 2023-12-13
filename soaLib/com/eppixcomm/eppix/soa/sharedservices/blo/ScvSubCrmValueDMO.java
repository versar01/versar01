package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class ScvSubCrmValueDMO extends DBO implements Serializable {

	private Integer scvSubscriberId;
	private String scvCrmValue;
	private String scvType;

	public static final int scvSubscriberIdFilter = 0;

	public static final int scvCrmValueFilter = 1;
	private static final int scvCrmValueSize = 8;

	public static final int scvTypeFilter = 2;
	private static final int scvTypeSize = 1;

	public ScvSubCrmValueDMO() {
	};

	public ScvSubCrmValueDMO(final Integer scvSubscriberId,
			final String scvCrmValue, final String scvType) {

		this.scvSubscriberId = scvSubscriberId;
		this.scvCrmValue = scvCrmValue;
		this.scvType = scvType;
	};

	private static final int[] fieldSizes = new int[] { 0, scvCrmValueSize,
			scvTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.scvSubscriberId,
				((this.scvCrmValue == null) ? null
						: (this.scvCrmValue.length() <= scvCrmValueSize) ? this.scvCrmValue
								: this.scvCrmValue.substring(0,
										this.scvCrmValueSize)),
				((this.scvType == null) ? null
						: (this.scvType.length() <= scvTypeSize) ? this.scvType
								: this.scvType.substring(0, this.scvTypeSize)) };
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
		return new DAOArgs(1).arg(this.scvSubscriberId);
	}

	protected void set(Object[] fields) {
		this.scvSubscriberId = ((Integer) fields[0]);
		this.scvCrmValue = rtrim((String) fields[1]);
		this.scvType = rtrim((String) fields[2]);
	}

	public void set(final Integer scvSubscriberId, final String scvCrmValue,
			final String scvType) {

		this.scvSubscriberId = scvSubscriberId;
		this.scvCrmValue = scvCrmValue;
		this.scvType = scvType;
	}

	public Integer getScvSubscriberId() {
		return scvSubscriberId;
	}

	public void setScvSubscriberId(Integer scvSubscriberId) {
		this.scvSubscriberId = scvSubscriberId;
	}

	public String getScvCrmValue() {
		return scvCrmValue;
	}

	public void setScvCrmValue(String scvCrmValue) {
		this.scvCrmValue = scvCrmValue;
	}

	public String getScvType() {
		return scvType;
	}

	public void setScvType(String scvType) {
		this.scvType = scvType;
	}

}
