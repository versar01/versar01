package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SulSubUseLimitDMO extends DBO implements Serializable {

	private Integer sulSubscriberId;
	private String sulType;
	private Date sulStartDate;
	private Date sulEndDate;
	private Double sulValue;

	public static final int sulSubscriberIdFilter = 0;

	public static final int sulTypeFilter = 1;
	private static final int sulTypeSize = 1;

	public static final int sulStartDateFilter = 2;

	public static final int sulEndDateFilter = 3;

	public static final int sulValueFilter = 4;

	public SulSubUseLimitDMO() {
	};

	public SulSubUseLimitDMO(final Integer sulSubscriberId,
			final String sulType, final Date sulStartDate,
			final Date sulEndDate, final Double sulValue) {

		this.sulSubscriberId = sulSubscriberId;
		this.sulType = sulType;
		this.sulStartDate = sulStartDate;
		this.sulEndDate = sulEndDate;
		this.sulValue = sulValue;
	};

	private static final int[] fieldSizes = new int[] { 0, sulTypeSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_DOUBLE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sulSubscriberId,
				((this.sulType == null) ? null
						: (this.sulType.length() <= sulTypeSize) ? this.sulType
								: this.sulType.substring(0, this.sulTypeSize)),
				this.sulStartDate, this.sulEndDate, this.sulValue };
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
		this.sulSubscriberId = ((Integer) fields[0]);
		this.sulType = rtrim((String) fields[1]);
		this.sulStartDate = ((fields[2] == null) ? null : new Date(fields[2]));
		this.sulEndDate = ((fields[3] == null) ? null : new Date(fields[3]));
		this.sulValue = ((Double) fields[4]);
	}

	public void set(final Integer sulSubscriberId, final String sulType,
			final Date sulStartDate, final Date sulEndDate,
			final Double sulValue) {

		this.sulSubscriberId = sulSubscriberId;
		this.sulType = sulType;
		this.sulStartDate = sulStartDate;
		this.sulEndDate = sulEndDate;
		this.sulValue = sulValue;
	}

	public Integer getSulSubscriberId() {
		return sulSubscriberId;
	}

	public void setSulSubscriberId(Integer sulSubscriberId) {
		this.sulSubscriberId = sulSubscriberId;
	}

	public String getSulType() {
		return sulType;
	}

	public void setSulType(String sulType) {
		this.sulType = sulType;
	}

	public Date getSulStartDate() {
		return sulStartDate;
	}

	public void setSulStartDate(Date sulStartDate) {
		this.sulStartDate = sulStartDate;
	}

	public Date getSulEndDate() {
		return sulEndDate;
	}

	public void setSulEndDate(Date sulEndDate) {
		this.sulEndDate = sulEndDate;
	}

	public Double getSulValue() {
		return sulValue;
	}

	public void setSulValue(Double sulValue) {
		this.sulValue = sulValue;
	}

}