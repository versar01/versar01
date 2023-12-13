package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class BsaBlimtSimAcnDMO extends DBO implements Serializable {

	private Integer bsaSubscriberId;
	private String bsaLevel;
	private String bsaSimAcn;
	private Integer bsaAcnId;
	private Double bsaThresh;
	private Date bsaDate;

	public static final int bsaSubscriberIdFilter = 0;

	public static final int bsaLevelFilter = 1;
	private static final int bsaLevelSize = 1;

	public static final int bsaSimAcnFilter = 2;
	private static final int bsaSimAcnSize = 3;

	public static final int bsaAcnIdFilter = 3;

	public static final int bsaThreshFilter = 4;

	public static final int bsaDateFilter = 5;

	public BsaBlimtSimAcnDMO() {
	};

	public BsaBlimtSimAcnDMO(final Integer bsaSubscriberId,
			final String bsaLevel, final String bsaSimAcn,
			final Integer bsaAcnId, final Double bsaThresh, final Date bsaDate) {

		this.bsaSubscriberId = bsaSubscriberId;
		this.bsaLevel = bsaLevel;
		this.bsaSimAcn = bsaSimAcn;
		this.bsaAcnId = bsaAcnId;
		this.bsaThresh = bsaThresh;
		this.bsaDate = bsaDate;
	};

	private static final int[] fieldSizes = new int[] { 0, bsaLevelSize,
			bsaSimAcnSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_FLOAT, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.bsaSubscriberId,
				((this.bsaLevel == null) ? null
						: (this.bsaLevel.length() <= bsaLevelSize) ? this.bsaLevel
								: this.bsaLevel.substring(0, this.bsaLevelSize)),
				((this.bsaSimAcn == null) ? null
						: (this.bsaSimAcn.length() <= bsaSimAcnSize) ? this.bsaSimAcn
								: this.bsaSimAcn.substring(0,
										this.bsaSimAcnSize)), this.bsaAcnId,
				this.bsaThresh, this.bsaDate };
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
		return new DAOArgs(2).arg(this.bsaSubscriberId).arg(this.bsaSimAcn);
	}

	protected void set(Object[] fields) {
		this.bsaSubscriberId = ((Integer) fields[0]);
		this.bsaLevel = rtrim((String) fields[1]);
		this.bsaSimAcn = rtrim((String) fields[2]);
		this.bsaAcnId = ((Integer) fields[3]);
		this.bsaThresh = ((Double) fields[4]);
		this.bsaDate = ((fields[5] == null) ? null : new Date((Date) fields[5]));
	}

	public void set(final Integer bsaSubscriberId, final String bsaLevel,
			final String bsaSimAcn, final Integer bsaAcnId,
			final Double bsaThresh, final Date bsaDate) {

		this.bsaSubscriberId = bsaSubscriberId;
		this.bsaLevel = bsaLevel;
		this.bsaSimAcn = bsaSimAcn;
		this.bsaAcnId = bsaAcnId;
		this.bsaThresh = bsaThresh;
		this.bsaDate = bsaDate;
	}

	public Integer getBsaSubscriberId() {
		return bsaSubscriberId;
	}

	public void setBsaSubscriberId(Integer bsaSubscriberId) {
		this.bsaSubscriberId = bsaSubscriberId;
	}

	public String getBsaLevel() {
		return bsaLevel;
	}

	public void setBsaLevel(String bsaLevel) {
		this.bsaLevel = bsaLevel;
	}

	public String getBsaSimAcn() {
		return bsaSimAcn;
	}

	public void setBsaSimAcn(String bsaSimAcn) {
		this.bsaSimAcn = bsaSimAcn;
	}

	public Integer getBsaAcnId() {
		return bsaAcnId;
	}

	public void setBsaAcnId(Integer bsaAcnId) {
		this.bsaAcnId = bsaAcnId;
	}

	public Double getBsaThresh() {
		return bsaThresh;
	}

	public void setBsaThresh(Double bsaThresh) {
		this.bsaThresh = bsaThresh;
	}

	public Date getBsaDate() {
		return bsaDate;
	}

	public void setBsaDate(Date bsaDate) {
		this.bsaDate = bsaDate;
	}

}
