package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class BltBillLimitTrgDMO extends DBO implements Serializable {

	private Integer bltSerialId;
	private Integer bltSubscriberId;
	private String bltServiceCode;
	private Double bltTrigger;

	public static final int bltSerialIdFilter = 0;

	public static final int bltSubscriberIdFilter = 1;

	public static final int bltServiceCodeFilter = 2;
	private static final int bltServiceCodeSize = 5;

	public static final int bltTriggerFilter = 3;

	public BltBillLimitTrgDMO() {
	};

	public BltBillLimitTrgDMO(final Integer bltSerialId,
			final Integer bltSubscriberId, final String bltServiceCode,
			final Double bltTrigger) {

		this.bltSerialId = bltSerialId;
		this.bltSubscriberId = bltSubscriberId;
		this.bltServiceCode = bltServiceCode;
		this.bltTrigger = bltTrigger;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			bltServiceCodeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.bltSerialId,
				this.bltSubscriberId,
				((this.bltServiceCode == null) ? null : (this.bltServiceCode
						.length() <= bltServiceCodeSize) ? this.bltServiceCode
						: this.bltServiceCode.substring(0,
								this.bltServiceCodeSize)), this.bltTrigger };
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
		return new DAOArgs(1).arg(this.bltSerialId);
	}

	protected void set(Object[] fields) {
		this.bltSerialId = (Integer) fields[0];
		this.bltSubscriberId = ((Integer) fields[1]);
		this.bltServiceCode = rtrim((String) fields[2]);
		this.bltTrigger = ((Double) fields[3]);
	}

	public void set(final Integer bltSerialId, final Integer bltSubscriberId,
			final String bltServiceCode, final Double bltTrigger) {

		this.bltSerialId = bltSerialId;
		this.bltSubscriberId = bltSubscriberId;
		this.bltServiceCode = bltServiceCode;
		this.bltTrigger = bltTrigger;
	}

	public Integer getBltSerialId() {
		return bltSerialId;
	}

	public void setBltSerialId(Integer bltSerialId) {
		this.bltSerialId = bltSerialId;
	}

	public Integer getBltSubscriberId() {
		return bltSubscriberId;
	}

	public void setBltSubscriberId(Integer bltSubscriberId) {
		this.bltSubscriberId = bltSubscriberId;
	}

	public String getBltServiceCode() {
		return bltServiceCode;
	}

	public void setBltServiceCode(String bltServiceCode) {
		this.bltServiceCode = bltServiceCode;
	}

	public Double getBltTrigger() {
		return bltTrigger;
	}

	public void setBltTrigger(Double bltTrigger) {
		this.bltTrigger = bltTrigger;
	}

}
