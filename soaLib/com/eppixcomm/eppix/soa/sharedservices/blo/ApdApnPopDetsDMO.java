package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class ApdApnPopDetsDMO extends DBO implements Serializable {

	private String apdId;
	private String apdName;
	private String apdMsisdn;
	private Integer apdActiveNo;
	private Integer apdDeactNo;
	private Integer apdChrgNo;
	private Double apdChrgAmount;
	private Date apdStartPeriod;
	private Date apdEndPeriod;
	private String apdCycle;
	private String apdInvNo;

	public static final int apdIdFilter = 0;
	private static final int apdIdSize = 15;

	public static final int apdNameFilter = 1;
	private static final int apdNameSize = 41;

	public static final int apdMsisdnFilter = 2;
	private static final int apdMsisdnSize = 15;

	public static final int apdActiveNoFilter = 3;

	public static final int apdDeactNoFilter = 4;

	public static final int apdChrgNoFilter = 5;

	public static final int apdChrgAmountFilter = 6;

	public static final int apdStartPeriodFilter = 7;

	public static final int apdEndPeriodFilter = 8;

	public static final int apdCycleFilter = 9;
	private static final int apdCycleSize = 5;

	public static final int apdInvNoFilter = 10;
	private static final int apdInvNoSize = 10;

	public ApdApnPopDetsDMO() {
	};

	public ApdApnPopDetsDMO(final String apdId, final String apdName,
			final String apdMsisdn, final Integer apdActiveNo,
			final Integer apdDeactNo, final Integer apdChrgNo,
			final Double apdChrgAmount, final Date apdStartPeriod,
			final Date apdEndPeriod, final String apdCycle,
			final String apdInvNo) {

		this.apdId = apdId;
		this.apdName = apdName;
		this.apdMsisdn = apdMsisdn;
		this.apdActiveNo = apdActiveNo;
		this.apdDeactNo = apdDeactNo;
		this.apdChrgNo = apdChrgNo;
		this.apdChrgAmount = apdChrgAmount;
		this.apdStartPeriod = apdStartPeriod;
		this.apdEndPeriod = apdEndPeriod;
		this.apdCycle = apdCycle;
		this.apdInvNo = apdInvNo;
	};

	private static final int[] fieldSizes = new int[] { apdIdSize, apdNameSize,
			apdMsisdnSize, 0, 0, 0, 0, 0, 0, apdCycleSize, apdInvNoSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.apdId == null) ? null
						: (this.apdId.length() <= apdIdSize) ? this.apdId
								: this.apdId.substring(0, this.apdIdSize)),
				((this.apdName == null) ? null
						: (this.apdName.length() <= apdNameSize) ? this.apdName
								: this.apdName.substring(0, this.apdNameSize)),
				((this.apdMsisdn == null) ? null
						: (this.apdMsisdn.length() <= apdMsisdnSize) ? this.apdMsisdn
								: this.apdMsisdn.substring(0,
										this.apdMsisdnSize)),
				this.apdActiveNo,
				this.apdDeactNo,
				this.apdChrgNo,
				this.apdChrgAmount,
				this.apdStartPeriod,
				this.apdEndPeriod,
				((this.apdCycle == null) ? null
						: (this.apdCycle.length() <= apdCycleSize) ? this.apdCycle
								: this.apdCycle.substring(0, this.apdCycleSize)),
				((this.apdInvNo == null) ? null
						: (this.apdInvNo.length() <= apdInvNoSize) ? this.apdInvNo
								: this.apdInvNo.substring(0, this.apdInvNoSize)) };
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
		this.apdId = rtrim((String) fields[0]);
		this.apdName = rtrim((String) fields[1]);
		this.apdMsisdn = rtrim((String) fields[2]);
		this.apdActiveNo = ((Integer) fields[3]);
		this.apdDeactNo = ((Integer) fields[4]);
		this.apdChrgNo = ((Integer) fields[5]);
		this.apdChrgAmount = ((Double) fields[6]);
		this.apdStartPeriod = ((fields[7] == null) ? null : new Date(
				 fields[7]));
		this.apdEndPeriod = ((fields[8] == null) ? null : new Date(
				 fields[8]));
		this.apdCycle = rtrim((String) fields[9]);
		this.apdInvNo = rtrim((String) fields[10]);
	}

	public void set(final String apdId, final String apdName,
			final String apdMsisdn, final Integer apdActiveNo,
			final Integer apdDeactNo, final Integer apdChrgNo,
			final Double apdChrgAmount, final Date apdStartPeriod,
			final Date apdEndPeriod, final String apdCycle,
			final String apdInvNo) {

		this.apdId = apdId;
		this.apdName = apdName;
		this.apdMsisdn = apdMsisdn;
		this.apdActiveNo = apdActiveNo;
		this.apdDeactNo = apdDeactNo;
		this.apdChrgNo = apdChrgNo;
		this.apdChrgAmount = apdChrgAmount;
		this.apdStartPeriod = apdStartPeriod;
		this.apdEndPeriod = apdEndPeriod;
		this.apdCycle = apdCycle;
		this.apdInvNo = apdInvNo;
	}

	public String getApdId() {
		return apdId;
	}

	public void setApdId(String apdId) {
		this.apdId = apdId;
	}

	public String getApdName() {
		return apdName;
	}

	public void setApdName(String apdName) {
		this.apdName = apdName;
	}

	public String getApdMsisdn() {
		return apdMsisdn;
	}

	public void setApdMsisdn(String apdMsisdn) {
		this.apdMsisdn = apdMsisdn;
	}

	public Integer getApdActiveNo() {
		return apdActiveNo;
	}

	public void setApdActiveNo(Integer apdActiveNo) {
		this.apdActiveNo = apdActiveNo;
	}

	public Integer getApdDeactNo() {
		return apdDeactNo;
	}

	public void setApdDeactNo(Integer apdDeactNo) {
		this.apdDeactNo = apdDeactNo;
	}

	public Integer getApdChrgNo() {
		return apdChrgNo;
	}

	public void setApdChrgNo(Integer apdChrgNo) {
		this.apdChrgNo = apdChrgNo;
	}

	public Double getApdChrgAmount() {
		return apdChrgAmount;
	}

	public void setApdChrgAmount(Double apdChrgAmount) {
		this.apdChrgAmount = apdChrgAmount;
	}

	public Date getApdStartPeriod() {
		return apdStartPeriod;
	}

	public void setApdStartPeriod(Date apdStartPeriod) {
		this.apdStartPeriod = apdStartPeriod;
	}

	public Date getApdEndPeriod() {
		return apdEndPeriod;
	}

	public void setApdEndPeriod(Date apdEndPeriod) {
		this.apdEndPeriod = apdEndPeriod;
	}

	public String getApdCycle() {
		return apdCycle;
	}

	public void setApdCycle(String apdCycle) {
		this.apdCycle = apdCycle;
	}

	public String getApdInvNo() {
		return apdInvNo;
	}

	public void setApdInvNo(String apdInvNo) {
		this.apdInvNo = apdInvNo;
	}

}
