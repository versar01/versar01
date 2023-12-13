package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;


public class SbhsSplitBillHsDMO extends DBO implements Serializable {


	private Integer SbhsSbId;
	private String SbhsOldVal;
	private String SbhsNewVal;
	private String SbhsReason;
	private Date SbhsDate;
	private String SbhsUserId;



	public static final int SbhsSbIdFilter = 0;

	public static final int SbhsOldValFilter = 1;
	private static final int SbhsOldValSize = 50;


	public static final int SbhsNewValFilter = 2;
	private static final int SbhsNewValSize = 50;


	public static final int SbhsReasonFilter = 3;
	private static final int SbhsReasonSize = 10;


	public static final int SbhsDateFilter = 4;

	public static final int SbhsUserIdFilter = 5;
	private static final int SbhsUserIdSize = 10;





	public SbhsSplitBillHsDMO(){};

	public SbhsSplitBillHsDMO(final Integer SbhsSbId,
	final String SbhsOldVal,
	final String SbhsNewVal,
	final String SbhsReason,
	final Date SbhsDate,
	final String SbhsUserId
	){

	this.SbhsSbId = SbhsSbId;
	this.SbhsOldVal = SbhsOldVal;
	this.SbhsNewVal = SbhsNewVal;
	this.SbhsReason = SbhsReason;
	this.SbhsDate = SbhsDate;
	this.SbhsUserId = SbhsUserId;
	};


	private static final int[] fieldSizes = new int[]{
	0,
	SbhsOldValSize,
	SbhsNewValSize,
	SbhsReasonSize,
	0,
	SbhsUserIdSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			this.SbhsSbId,
				((this.SbhsOldVal == null) ? null : (this.SbhsOldVal.length() <= SbhsOldValSize) ? this.SbhsOldVal : this.SbhsOldVal.substring(0, this.SbhsOldValSize)),
				((this.SbhsNewVal == null) ? null : (this.SbhsNewVal.length() <= SbhsNewValSize) ? this.SbhsNewVal : this.SbhsNewVal.substring(0, this.SbhsNewValSize)),
				((this.SbhsReason == null) ? null : (this.SbhsReason.length() <= SbhsReasonSize) ? this.SbhsReason : this.SbhsReason.substring(0, this.SbhsReasonSize)),
				this.SbhsDate,
				((this.SbhsUserId == null) ? null : (this.SbhsUserId.length() <= SbhsUserIdSize) ? this.SbhsUserId : this.SbhsUserId.substring(0, this.SbhsUserIdSize))
			};
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
	this.SbhsSbId = ((Integer)fields[0]);
	this.SbhsOldVal = rtrim((String)fields[1]);
	this.SbhsNewVal = rtrim((String)fields[2]);
	this.SbhsReason = rtrim((String)fields[3]);
	this.SbhsDate = ((fields[4] == null)? null : new Date(fields[4]));
	this.SbhsUserId = rtrim((String)fields[5]);
	}


	public void set(
	final Integer SbhsSbId,
	final String SbhsOldVal,
	final String SbhsNewVal,
	final String SbhsReason,
	final Date SbhsDate,
	final String SbhsUserId
	)
	{

	this.SbhsSbId = SbhsSbId;
	this.SbhsOldVal = SbhsOldVal;
	this.SbhsNewVal = SbhsNewVal;
	this.SbhsReason = SbhsReason;
	this.SbhsDate = SbhsDate;
	this.SbhsUserId = SbhsUserId;
	}

	public Integer getSbhsSbId() {
		return SbhsSbId;
	}

	public void setSbhsSbId(Integer sbhsSbId) {
		SbhsSbId = sbhsSbId;
	}

	public String getSbhsOldVal() {
		return SbhsOldVal;
	}

	public void setSbhsOldVal(String sbhsOldVal) {
		SbhsOldVal = sbhsOldVal;
	}

	public String getSbhsNewVal() {
		return SbhsNewVal;
	}

	public void setSbhsNewVal(String sbhsNewVal) {
		SbhsNewVal = sbhsNewVal;
	}

	public String getSbhsReason() {
		return SbhsReason;
	}

	public void setSbhsReason(String sbhsReason) {
		SbhsReason = sbhsReason;
	}

	public Date getSbhsDate() {
		return SbhsDate;
	}

	public void setSbhsDate(Date sbhsDate) {
		SbhsDate = sbhsDate;
	}

	public String getSbhsUserId() {
		return SbhsUserId;
	}

	public void setSbhsUserId(String sbhsUserId) {
		SbhsUserId = sbhsUserId;
	}



}