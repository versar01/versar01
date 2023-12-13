package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbhdSplitBillHdDMO extends DBO implements Serializable {


	private Integer SbhdSbId;
	private Integer SbhdSubscriberId;
	private String SbhdChildAcNo;
	private String SbhdChildMsisdn;
	private String SbhdParentAcNo;
	private String SbhdParentMsisdn;
	private String SbhdCreditAccum;
	private String SbhdMigrated;
	private Float SbhdTotBillAmt;
	private Integer SbhdDdRd;
	private Date SbhdActDate;
	private Date SbhdDeactDate;
	private Date SbhdBilledUpto;
	private String SbhdStatus;



	public static final int SbhdSbIdFilter = 0;

	public static final int SbhdSubscriberIdFilter = 1;

	public static final int SbhdChildAcNoFilter = 2;
	private static final int SbhdChildAcNoSize = 8;


	public static final int SbhdChildMsisdnFilter = 3;
	private static final int SbhdChildMsisdnSize = 10;


	public static final int SbhdParentAcNoFilter = 4;
	private static final int SbhdParentAcNoSize = 8;


	public static final int SbhdParentMsisdnFilter = 5;
	private static final int SbhdParentMsisdnSize = 10;


	public static final int SbhdCreditAccumFilter = 6;
	private static final int SbhdCreditAccumSize = 1;


	public static final int SbhdMigratedFilter = 7;
	private static final int SbhdMigratedSize = 1;


	public static final int SbhdTotBillAmtFilter = 8;

	public static final int SbhdDdRdFilter = 9;

	public static final int SbhdActDateFilter = 10;

	public static final int SbhdDeactDateFilter = 11;

	public static final int SbhdBilledUptoFilter = 12;

	public static final int SbhdStatusFilter = 13;
	private static final int SbhdStatusSize = 1;





	public SbhdSplitBillHdDMO(){};

	public SbhdSplitBillHdDMO(final Integer SbhdSbId,
	final Integer SbhdSubscriberId,
	final String SbhdChildAcNo,
	final String SbhdChildMsisdn,
	final String SbhdParentAcNo,
	final String SbhdParentMsisdn,
	final String SbhdCreditAccum,
	final String SbhdMigrated,
	final Float SbhdTotBillAmt,
	final Integer SbhdDdRd,
	final Date SbhdActDate,
	final Date SbhdDeactDate,
	final Date SbhdBilledUpto,
	final String SbhdStatus
	){

	this.SbhdSbId = SbhdSbId;
	this.SbhdSubscriberId = SbhdSubscriberId;
	this.SbhdChildAcNo = SbhdChildAcNo;
	this.SbhdChildMsisdn = SbhdChildMsisdn;
	this.SbhdParentAcNo = SbhdParentAcNo;
	this.SbhdParentMsisdn = SbhdParentMsisdn;
	this.SbhdCreditAccum = SbhdCreditAccum;
	this.SbhdMigrated = SbhdMigrated;
	this.SbhdTotBillAmt = SbhdTotBillAmt;
	this.SbhdDdRd = SbhdDdRd;
	this.SbhdActDate = SbhdActDate;
	this.SbhdDeactDate = SbhdDeactDate;
	this.SbhdBilledUpto = SbhdBilledUpto;
	this.SbhdStatus = SbhdStatus;
	};


	private static final int[] fieldSizes = new int[]{
	0,
	0,
	SbhdChildAcNoSize,
	SbhdChildMsisdnSize,
	SbhdParentAcNoSize,
	SbhdParentMsisdnSize,
	SbhdCreditAccumSize,
	SbhdMigratedSize,
	0,
	0,
	0,
	0,
	0,
	SbhdStatusSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_FLOAT,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_DATE,
	FIELD_TYPE_DATE,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			this.SbhdSbId,
				this.SbhdSubscriberId,
				((this.SbhdChildAcNo == null) ? null : (this.SbhdChildAcNo.length() <= SbhdChildAcNoSize) ? this.SbhdChildAcNo : this.SbhdChildAcNo.substring(0, this.SbhdChildAcNoSize)),
				((this.SbhdChildMsisdn == null) ? null : (this.SbhdChildMsisdn.length() <= SbhdChildMsisdnSize) ? this.SbhdChildMsisdn : this.SbhdChildMsisdn.substring(0, this.SbhdChildMsisdnSize)),
				((this.SbhdParentAcNo == null) ? null : (this.SbhdParentAcNo.length() <= SbhdParentAcNoSize) ? this.SbhdParentAcNo : this.SbhdParentAcNo.substring(0, this.SbhdParentAcNoSize)),
				((this.SbhdParentMsisdn == null) ? null : (this.SbhdParentMsisdn.length() <= SbhdParentMsisdnSize) ? this.SbhdParentMsisdn : this.SbhdParentMsisdn.substring(0, this.SbhdParentMsisdnSize)),
				((this.SbhdCreditAccum == null) ? null : (this.SbhdCreditAccum.length() <= SbhdCreditAccumSize) ? this.SbhdCreditAccum : this.SbhdCreditAccum.substring(0, this.SbhdCreditAccumSize)),
				((this.SbhdMigrated == null) ? null : (this.SbhdMigrated.length() <= SbhdMigratedSize) ? this.SbhdMigrated : this.SbhdMigrated.substring(0, this.SbhdMigratedSize)),
				this.SbhdTotBillAmt,
				this.SbhdDdRd,
				this.SbhdActDate,
				this.SbhdDeactDate,
				this.SbhdBilledUpto,
				((this.SbhdStatus == null) ? null : (this.SbhdStatus.length() <= SbhdStatusSize) ? this.SbhdStatus : this.SbhdStatus.substring(0, this.SbhdStatusSize))
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
		return new DAOArgs(5).arg(this.SbhdSubscriberId).arg(this.SbhdChildAcNo).arg(this.SbhdChildMsisdn).arg(this.SbhdParentAcNo).arg(this.SbhdParentMsisdn); 
	}



	protected void set(Object[] fields) {
	this.SbhdSbId = ((Integer)fields[0]);
	this.SbhdSubscriberId = ((Integer)fields[1]);
	this.SbhdChildAcNo = rtrim((String)fields[2]);
	this.SbhdChildMsisdn = rtrim((String)fields[3]);
	this.SbhdParentAcNo = rtrim((String)fields[4]);
	this.SbhdParentMsisdn = rtrim((String)fields[5]);
	this.SbhdCreditAccum = rtrim((String)fields[6]);
	this.SbhdMigrated = rtrim((String)fields[7]);
	this.SbhdTotBillAmt = ((Float)fields[8]);
	this.SbhdDdRd = ((Integer)fields[9]);
	this.SbhdActDate = ((fields[10] == null)? null : new Date(fields[10]));
	this.SbhdDeactDate = ((fields[11] == null)? null : new Date(fields[11]));
	this.SbhdBilledUpto = ((fields[12] == null)? null : new Date(fields[12]));
	this.SbhdStatus = rtrim((String)fields[13]);
	}


	public void set(
	final Integer SbhdSbId,
	final Integer SbhdSubscriberId,
	final String SbhdChildAcNo,
	final String SbhdChildMsisdn,
	final String SbhdParentAcNo,
	final String SbhdParentMsisdn,
	final String SbhdCreditAccum,
	final String SbhdMigrated,
	final Float SbhdTotBillAmt,
	final Integer SbhdDdRd,
	final Date SbhdActDate,
	final Date SbhdDeactDate,
	final Date SbhdBilledUpto,
	final String SbhdStatus
	)
	{

	this.SbhdSbId = SbhdSbId;
	this.SbhdSubscriberId = SbhdSubscriberId;
	this.SbhdChildAcNo = SbhdChildAcNo;
	this.SbhdChildMsisdn = SbhdChildMsisdn;
	this.SbhdParentAcNo = SbhdParentAcNo;
	this.SbhdParentMsisdn = SbhdParentMsisdn;
	this.SbhdCreditAccum = SbhdCreditAccum;
	this.SbhdMigrated = SbhdMigrated;
	this.SbhdTotBillAmt = SbhdTotBillAmt;
	this.SbhdDdRd = SbhdDdRd;
	this.SbhdActDate = SbhdActDate;
	this.SbhdDeactDate = SbhdDeactDate;
	this.SbhdBilledUpto = SbhdBilledUpto;
	this.SbhdStatus = SbhdStatus;
	}

	public Integer getSbhdSbId() {
		return SbhdSbId;
	}

	public void setSbhdSbId(Integer sbhdSbId) {
		SbhdSbId = sbhdSbId;
	}

	public Integer getSbhdSubscriberId() {
		return SbhdSubscriberId;
	}

	public void setSbhdSubscriberId(Integer sbhdSubscriberId) {
		SbhdSubscriberId = sbhdSubscriberId;
	}

	public String getSbhdChildAcNo() {
		return SbhdChildAcNo;
	}

	public void setSbhdChildAcNo(String sbhdChildAcNo) {
		SbhdChildAcNo = sbhdChildAcNo;
	}

	public String getSbhdChildMsisdn() {
		return SbhdChildMsisdn;
	}

	public void setSbhdChildMsisdn(String sbhdChildMsisdn) {
		SbhdChildMsisdn = sbhdChildMsisdn;
	}

	public String getSbhdParentAcNo() {
		return SbhdParentAcNo;
	}

	public void setSbhdParentAcNo(String sbhdParentAcNo) {
		SbhdParentAcNo = sbhdParentAcNo;
	}

	public String getSbhdParentMsisdn() {
		return SbhdParentMsisdn;
	}

	public void setSbhdParentMsisdn(String sbhdParentMsisdn) {
		SbhdParentMsisdn = sbhdParentMsisdn;
	}

	public String getSbhdCreditAccum() {
		return SbhdCreditAccum;
	}

	public void setSbhdCreditAccum(String sbhdCreditAccum) {
		SbhdCreditAccum = sbhdCreditAccum;
	}

	public String getSbhdMigrated() {
		return SbhdMigrated;
	}

	public void setSbhdMigrated(String sbhdMigrated) {
		SbhdMigrated = sbhdMigrated;
	}

	public Float getSbhdTotBillAmt() {
		return SbhdTotBillAmt;
	}

	public void setSbhdTotBillAmt(Float sbhdTotBillAmt) {
		SbhdTotBillAmt = sbhdTotBillAmt;
	}

	public Integer getSbhdDdRd() {
		return SbhdDdRd;
	}

	public void setSbhdDdRd(Integer sbhdDdRd) {
		SbhdDdRd = sbhdDdRd;
	}

	public Date getSbhdActDate() {
		return SbhdActDate;
	}

	public void setSbhdActDate(Date sbhdActDate) {
		SbhdActDate = sbhdActDate;
	}

	public Date getSbhdDeactDate() {
		return SbhdDeactDate;
	}

	public void setSbhdDeactDate(Date sbhdDeactDate) {
		SbhdDeactDate = sbhdDeactDate;
	}

	public Date getSbhdBilledUpto() {
		return SbhdBilledUpto;
	}

	public void setSbhdBilledUpto(Date sbhdBilledUpto) {
		SbhdBilledUpto = sbhdBilledUpto;
	}

	public String getSbhdStatus() {
		return SbhdStatus;
	}

	public void setSbhdStatus(String sbhdStatus) {
		SbhdStatus = sbhdStatus;
	}


}