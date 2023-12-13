package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PsdParamServDetDMO extends DBO implements Serializable {

	private Integer psdSerialId;
	private Integer psdPshId;
	private Integer psdParamId;
	private Date psdActDate;
	private Date psdTermDate;
	private String psdParamValue;
	private String psdN2nString;
	private String psdParamActive;
	private Date psdDeacDate;
	private String psdSubCharge;
	private Double psdChgValue;
	private String psdActType;
	private Date psdActionDate;

	public static final int psdSerialIdFilter = 0;

	public static final int psdPshIdFilter = 1;

	public static final int psdParamIdFilter = 2;

	public static final int psdActDateFilter = 3;

	public static final int psdTermDateFilter = 4;

	public static final int psdParamValueFilter = 5;
	private static final int psdParamValueSize = 20;

	public static final int psdN2nStringFilter = 6;
	private static final int psdN2nStringSize = 1;

	public static final int psdParamActiveFilter = 7;
	private static final int psdParamActiveSize = 1;

	public static final int psdDeacDateFilter = 8;

	public static final int psdSubChargeFilter = 9;
	private static final int psdSubChargeSize = 5;

	public static final int psdChgValueFilter = 10;

	public static final int psdActTypeFilter = 11;
	private static final int psdActTypeSize = 2;

	public static final int psdActionDateFilter = 12;

	public PsdParamServDetDMO() {
	};

	public PsdParamServDetDMO(final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0, 0, 0,
			psdParamValueSize, psdN2nStringSize, psdParamActiveSize, 0,
			psdSubChargeSize, 0, psdActTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.psdSerialId,
				this.psdPshId,
				this.psdParamId,
				this.psdActDate,
				this.psdTermDate,
				((this.psdParamValue == null) ? null : (this.psdParamValue
						.length() <= psdParamValueSize) ? this.psdParamValue
						: this.psdParamValue.substring(0,
								this.psdParamValueSize)),
				((this.psdN2nString == null) ? null : (this.psdN2nString
						.length() <= psdN2nStringSize) ? this.psdN2nString
						: this.psdN2nString.substring(0, this.psdN2nStringSize)),
				((this.psdParamActive == null) ? null : (this.psdParamActive
						.length() <= psdParamActiveSize) ? this.psdParamActive
						: this.psdParamActive.substring(0,
								this.psdParamActiveSize)),
				this.psdDeacDate,
				((this.psdSubCharge == null) ? null : (this.psdSubCharge
						.length() <= psdSubChargeSize) ? this.psdSubCharge
						: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				this.psdChgValue,
				((this.psdActType == null) ? null
						: (this.psdActType.length() <= psdActTypeSize) ? this.psdActType
								: this.psdActType.substring(0,
										this.psdActTypeSize)),
				this.psdActionDate };
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
		return new DAOArgs(3).arg(this.getPsdSerialId()).arg(this.getPsdPshId()).arg(this.getPsdParamId());
	}

	protected void set(Object[] fields) {
		this.psdSerialId = ((Integer) fields[0]);
		this.psdPshId = ((Integer) fields[1]);
		this.psdParamId = ((Integer) fields[2]);
		this.psdActDate = ((fields[3] == null) ? null : new Date(
				fields[3]));
		this.psdTermDate = ((fields[4] == null) ? null : new Date(
				fields[4]));
		this.psdParamValue = rtrim((String) fields[5]);
		this.psdN2nString = rtrim((String) fields[6]);
		this.psdParamActive = rtrim((String) fields[7]);
		this.psdDeacDate = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.psdSubCharge = rtrim((String) fields[9]);
		this.psdChgValue = ((Double) fields[10]);
		this.psdActType = rtrim((String) fields[11]);
		this.psdActionDate = ((fields[12] == null) ? null : new Date(
				fields[12]));
	}

	public void set(final Integer psdSerialId, final Integer psdPshId,
			final Integer psdParamId, final Date psdActDate,
			final Date psdTermDate, final String psdParamValue,
			final String psdN2nString, final String psdParamActive,
			final Date psdDeacDate, final String psdSubCharge,
			final Double psdChgValue, final String psdActType,
			final Date psdActionDate) {

		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	}

	public Integer getPsdSerialId() {
		return psdSerialId;
	}

	public void setPsdSerialId(Integer psdSerialId) {
		this.psdSerialId = psdSerialId;
	}

	public Integer getPsdPshId() {
		return psdPshId;
	}

	public void setPsdPshId(Integer psdPshId) {
		this.psdPshId = psdPshId;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public Date getPsdActDate() {
		return psdActDate;
	}

	public void setPsdActDate(Date psdActDate) {
		this.psdActDate = psdActDate;
	}

	public Date getPsdTermDate() {
		return psdTermDate;
	}

	public void setPsdTermDate(Date psdTermDate) {
		this.psdTermDate = psdTermDate;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdN2nString() {
		return psdN2nString;
	}

	public void setPsdN2nString(String psdN2nString) {
		this.psdN2nString = psdN2nString;
	}

	public String getPsdParamActive() {
		return psdParamActive;
	}

	public void setPsdParamActive(String psdParamActive) {
		this.psdParamActive = psdParamActive;
	}

	public Date getPsdDeacDate() {
		return psdDeacDate;
	}

	public void setPsdDeacDate(Date psdDeacDate) {
		this.psdDeacDate = psdDeacDate;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	public String getPsdActType() {
		return psdActType;
	}

	public void setPsdActType(String psdActType) {
		this.psdActType = psdActType;
	}

	public Date getPsdActionDate() {
		return psdActionDate;
	}

	public void setPsdActionDate(Date psdActionDate) {
		this.psdActionDate = psdActionDate;
	}
}