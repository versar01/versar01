package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class AsrSpcSpvDQO extends DBO implements Serializable {

	private Integer asrParamId;
	private String spcParamName;
	private String asrParamValue;
	private String spvChargeCode;

	public static final int asrParamIdFilter = 0;

	public static final int spcParamNameFilter = 1;
	private static final int spcParamNameSize = 20;

	public static final int asrParamValueFilter = 2;
	private static final int asrParamValueSize = 20;

	public static final int spvChargeCodeFilter = 3;
	private static final int spvChargeCodeSize = 5;

	public AsrSpcSpvDQO() {
	};

	public AsrSpcSpvDQO(final Integer asrParamId, final String spcParamName, final String asrParamValue,
			final String spvChargeCode) {

		this.asrParamId = asrParamId;
		this.spcParamName = spcParamName;
		this.asrParamValue = asrParamValue;
		this.spvChargeCode = spvChargeCode;
	};

	private static final int[] fieldSizes = new int[] { 0, spcParamNameSize, asrParamValueSize, spvChargeCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.asrParamId,
				((this.spcParamName == null) ? null
						: (this.spcParamName.length() <= spcParamNameSize) ? this.spcParamName
								: this.spcParamName.substring(0, this.spcParamNameSize)),
				((this.asrParamValue == null) ? null
						: (this.asrParamValue.length() <= asrParamValueSize) ? this.asrParamValue
								: this.asrParamValue.substring(0, this.asrParamValueSize)),
				((this.spvChargeCode == null) ? null
						: (this.spvChargeCode.length() <= spvChargeCodeSize) ? this.spvChargeCode
								: this.spvChargeCode.substring(0, this.spvChargeCodeSize)) };
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
		this.asrParamId = ((Integer) fields[0]);
		this.spcParamName = rtrim((String) fields[1]);
		this.asrParamValue = rtrim((String) fields[2]);
		this.spvChargeCode = rtrim((String) fields[3]);
	}

	public void set(final Integer asrParamId, final String spcParamName, final String asrParamValue,
			final String spvChargeCode) {

		this.asrParamId = asrParamId;
		this.spcParamName = spcParamName;
		this.asrParamValue = asrParamValue;
		this.spvChargeCode = spvChargeCode;
	}

	public Integer getAsrParamId() {
		return asrParamId;
	}

	public void setAsrParamId(Integer asrParamId) {
		this.asrParamId = asrParamId;
	}

	public String getSpcParamName() {
		return spcParamName;
	}

	public void setSpcParamName(String spcParamName) {
		this.spcParamName = spcParamName;
	}

	public String getAsrParamValue() {
		return asrParamValue;
	}

	public void setAsrParamValue(String asrParamValue) {
		this.asrParamValue = asrParamValue;
	}

	public String getSpvChargeCode() {
		return spvChargeCode;
	}

	public void setSpvChargeCode(String spvChargeCode) {
		this.spvChargeCode = spvChargeCode;
	}

}
