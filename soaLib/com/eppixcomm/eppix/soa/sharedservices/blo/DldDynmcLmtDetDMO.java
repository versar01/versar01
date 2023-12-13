package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class DldDynmcLmtDetDMO extends DBO implements Serializable {

	private Integer dldId;
	private String dldAccountNo;
	private BigDecimal dldAllocatedDcl;
	private String dldNaedoFlag;
	private Integer dldStrikeDay;

	public static final int dldIdFilter = 0;

	public static final int dldAccountNoFilter = 1;
	private static final int dldAccountNoSize = 8;

	public static final int dldAllocatedDclFilter = 2;

	public static final int dldNaedoFlagFilter = 3;

	public static final int dldStrikeDayFilter = 4;

	public DldDynmcLmtDetDMO() {
	};

	public DldDynmcLmtDetDMO(final Integer dldId, final String dldAccountNo,
			final BigDecimal dldAllocatedDcl, final String dldNaedoFlag,
			final Integer dldStrikeDay) {

		this.dldId = dldId;
		this.dldAccountNo = dldAccountNo;
		this.dldAllocatedDcl = dldAllocatedDcl;
		this.dldNaedoFlag = dldNaedoFlag;
		this.dldStrikeDay = dldStrikeDay;
	};

	private static final int[] fieldSizes = new int[] { 0, dldAccountNoSize, 0,
			0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.dldId,
				((this.dldAccountNo == null) ? null : (this.dldAccountNo
						.length() <= dldAccountNoSize) ? this.dldAccountNo
						: this.dldAccountNo.substring(0, this.dldAccountNoSize)),
				this.dldAllocatedDcl, this.dldNaedoFlag, this.dldStrikeDay };
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
		this.dldId = ((Integer) fields[0]);
		this.dldAccountNo = rtrim((String) fields[1]);
		this.dldAllocatedDcl = ((BigDecimal) fields[2]);
		this.dldNaedoFlag = ((String) fields[3]);
		this.dldStrikeDay = ((Integer) fields[4]);
	}

	public void set(final Integer dldId, final String dldAccountNo,
			final BigDecimal dldAllocatedDcl, final String dldNaedoFlag,
			final Integer dldStrikeDay) {

		this.dldId = dldId;
		this.dldAccountNo = dldAccountNo;
		this.dldAllocatedDcl = dldAllocatedDcl;
		this.dldNaedoFlag = dldNaedoFlag;
		this.dldStrikeDay = dldStrikeDay;
	}

	public Integer getDldId() {
		return dldId;
	}

	public void setDldId(Integer dldId) {
		this.dldId = dldId;
	}

	public String getDldAccountNo() {
		return dldAccountNo;
	}

	public void setDldAccountNo(String dldAccountNo) {
		this.dldAccountNo = dldAccountNo;
	}

	public BigDecimal getDldAllocatedDcl() {
		return dldAllocatedDcl;
	}

	public void setDldAllocatedDcl(BigDecimal dldAllocatedDcl) {
		this.dldAllocatedDcl = dldAllocatedDcl;
	}

	public String getDldNaedoFlag() {
		return dldNaedoFlag;
	}

	public void setDldNaedoFlag(String dldNaedoFlag) {
		this.dldNaedoFlag = dldNaedoFlag;
	}

	public Integer getDldStrikeDay() {
		return dldStrikeDay;
	}

	public void setDldStrikeDay(Integer dldStrikeDay) {
		this.dldStrikeDay = dldStrikeDay;
	}

}
