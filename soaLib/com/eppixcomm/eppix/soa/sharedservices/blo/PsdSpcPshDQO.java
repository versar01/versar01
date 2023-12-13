package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PsdSpcPshDQO extends DBO implements Serializable {

	private Integer psdParamId;
	private String spcParamName;
	private String psdParamValue;
	private String psdSubCharge;
	private String pshServiceType;
	private BigDecimal psdChgValue;

	public static final int psdParamIdFilter = 0;

	public static final int spcParamNameFilter = 1;
	private static final int spcParamNameSize = 20;

	public static final int psdParamValueFilter = 2;
	private static final int psdParamValueSize = 20;

	public static final int psdSubChargeFilter = 3;
	private static final int psdSubChargeSize = 5;

	public static final int pshServiceTypeFilter = 4;
	private static final int pshServiceTypeSize = 5;

	public static final int psdChgValueFilter = 5;

	public PsdSpcPshDQO() {
	};

	public PsdSpcPshDQO(final Integer psdParamId, final String spcParamName, final String psdParamValue,
			final String psdSubCharge, final String pshServiceType, final BigDecimal psdChgValue) {

		this.psdParamId = psdParamId;
		this.spcParamName = spcParamName;
		this.psdParamValue = psdParamValue;
		this.psdSubCharge = psdSubCharge;
		this.pshServiceType = pshServiceType;
		this.psdChgValue = psdChgValue;
	};

	private static final int[] fieldSizes = new int[] { 0, spcParamNameSize, psdParamValueSize, psdSubChargeSize,
			pshServiceTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.psdParamId,
				((this.spcParamName == null) ? null
						: (this.spcParamName.length() <= spcParamNameSize) ? this.spcParamName
								: this.spcParamName.substring(0, this.spcParamNameSize)),
				((this.psdParamValue == null) ? null
						: (this.psdParamValue.length() <= psdParamValueSize) ? this.psdParamValue
								: this.psdParamValue.substring(0, this.psdParamValueSize)),
				((this.psdSubCharge == null) ? null
						: (this.psdSubCharge.length() <= psdSubChargeSize) ? this.psdSubCharge
								: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				((this.pshServiceType == null) ? null
						: (this.pshServiceType.length() <= pshServiceTypeSize) ? this.pshServiceType
								: this.pshServiceType.substring(0, this.pshServiceTypeSize)),
				this.psdChgValue };
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
		this.psdParamId = ((Integer) fields[0]);
		this.spcParamName = rtrim((String) fields[1]);
		this.psdParamValue = rtrim((String) fields[2]);
		this.psdSubCharge = rtrim((String) fields[3]);
		this.pshServiceType = rtrim((String) fields[4]);
		this.psdChgValue = ((BigDecimal) fields[5]);
	}

	public void set(final Integer psdParamId, final String spcParamName, final String psdParamValue,
			final String psdSubCharge, final String pshServiceType, final BigDecimal psdChgValue) {

		this.psdParamId = psdParamId;
		this.spcParamName = spcParamName;
		this.psdParamValue = psdParamValue;
		this.psdSubCharge = psdSubCharge;
		this.pshServiceType = pshServiceType;
		this.psdChgValue = psdChgValue;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public String getSpcParamName() {
		return spcParamName;
	}

	public void setSpcParamName(String spcParamName) {
		this.spcParamName = spcParamName;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public String getPshServiceType() {
		return pshServiceType;
	}

	public void setPshServiceType(String pshServiceType) {
		this.pshServiceType = pshServiceType;
	}

	public BigDecimal getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(BigDecimal psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

}
