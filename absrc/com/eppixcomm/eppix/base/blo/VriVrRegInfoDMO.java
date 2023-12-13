package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class VriVrRegInfoDMO extends DBO implements Serializable {

	private Integer vriId;
	private Integer vriVraId;
	private String vriMsisdnNo;
	private Integer vriLevel;
	private String vriProvider;
	private Float vriOnceOffLimit;
	private Float vriRecurLimit;
	private String vriLimitType;

	public static final int VriIdFilter = 0;

	public static final int VriVraIdFilter = 1;

	public static final int VriMsisdnNoFilter = 2;
	private static final int VriMsisdnNoSize = 15;

	public static final int VriLevelFilter = 3;

	public static final int VriProviderFilter = 4;
	private static final int VriProviderSize = 5;

	public static final int VriOnceOffLimitFilter = 5;

	public static final int VriRecurLimitFilter = 6;

	public static final int VriLimitTypeFilter = 7;
	private static final int VriLimitTypeSize = 1;

	public VriVrRegInfoDMO() {
	};

	public VriVrRegInfoDMO(final Integer VriId, final Integer VriVraId,
			final String VriMsisdnNo, final Integer VriLevel,
			final String VriProvider, final Float VriOnceOffLimit,
			final Float VriRecurLimit, final String VriLimitType) {

		this.vriId = VriId;
		this.vriVraId = VriVraId;
		this.vriMsisdnNo = VriMsisdnNo;
		this.vriLevel = VriLevel;
		this.vriProvider = VriProvider;
		this.vriOnceOffLimit = VriOnceOffLimit;
		this.vriRecurLimit = VriRecurLimit;
		this.vriLimitType = VriLimitType;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, VriMsisdnNoSize,
			0, VriProviderSize, 0, 0, VriLimitTypeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.vriId,
				this.vriVraId,
				((this.vriMsisdnNo == null) ? null
						: (this.vriMsisdnNo.length() <= VriMsisdnNoSize) ? this.vriMsisdnNo
								: this.vriMsisdnNo.substring(0,
										this.VriMsisdnNoSize)),
				this.vriLevel,
				((this.vriProvider == null) ? null
						: (this.vriProvider.length() <= VriProviderSize) ? this.vriProvider
								: this.vriProvider.substring(0,
										this.VriProviderSize)),
				this.vriOnceOffLimit,
				this.vriRecurLimit,
				((this.vriLimitType == null) ? null : (this.vriLimitType
						.length() <= VriLimitTypeSize) ? this.vriLimitType
						: this.vriLimitType.substring(0, this.VriLimitTypeSize)) };
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
		return new DAOArgs(1).arg(this.vriId);
	}

	protected void set(Object[] fields) {
		this.vriId = ((Integer) fields[0]);
		this.vriVraId = ((Integer) fields[1]);
		this.vriMsisdnNo = rtrim((String) fields[2]);
		this.vriLevel = ((Integer) fields[3]);
		this.vriProvider = rtrim((String) fields[4]);
		this.vriOnceOffLimit = ((Float) fields[5]);
		this.vriRecurLimit = ((Float) fields[6]);
		this.vriLimitType = rtrim((String) fields[7]);
	}

	public void set(final Integer VriId, final Integer VriVraId,
			final String VriMsisdnNo, final Integer VriLevel,
			final String VriProvider, final Float VriOnceOffLimit,
			final Float VriRecurLimit, final String VriLimitType) {

		this.vriId = VriId;
		this.vriVraId = VriVraId;
		this.vriMsisdnNo = VriMsisdnNo;
		this.vriLevel = VriLevel;
		this.vriProvider = VriProvider;
		this.vriOnceOffLimit = VriOnceOffLimit;
		this.vriRecurLimit = VriRecurLimit;
		this.vriLimitType = VriLimitType;
	}

	public Integer getVriId() {
		return vriId;
	}

	public void setVriId(Integer vriId) {
		this.vriId = vriId;
	}

	public Integer getVriVraId() {
		return vriVraId;
	}

	public void setVriVraId(Integer vriVraId) {
		this.vriVraId = vriVraId;
	}

	public String getVriMsisdnNo() {
		return vriMsisdnNo;
	}

	public void setVriMsisdnNo(String vriMsisdnNo) {
		this.vriMsisdnNo = vriMsisdnNo;
	}

	public Integer getVriLevel() {
		return vriLevel;
	}

	public void setVriLevel(Integer vriLevel) {
		this.vriLevel = vriLevel;
	}

	public String getVriProvider() {
		return vriProvider;
	}

	public void setVriProvider(String vriProvider) {
		this.vriProvider = vriProvider;
	}

	public Float getVriOnceOffLimit() {
		return vriOnceOffLimit;
	}

	public void setVriOnceOffLimit(Float vriOnceOffLimit) {
		this.vriOnceOffLimit = vriOnceOffLimit;
	}

	public Float getVriRecurLimit() {
		return vriRecurLimit;
	}

	public void setVriRecurLimit(Float vriRecurLimit) {
		this.vriRecurLimit = vriRecurLimit;
	}

	public String getVriLimitType() {
		return vriLimitType;
	}

	public void setVriLimitType(String vriLimitType) {
		this.vriLimitType = vriLimitType;
	}

}