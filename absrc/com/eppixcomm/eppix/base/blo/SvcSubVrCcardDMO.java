package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;


public class SvcSubVrCcardDMO extends DBO implements Serializable {


	private String SvcMsisdnNo;
	private String SvcCcardNo;
	private String SvcCcardType;
	private Date SvcCcardExpiry;
	private String SvcCvvNumber;


	public static final int SvcMsisdnNoFilter = 0;
	private static final int SvcMsisdnNoSize = 15;


	public static final int SvcCcardNoFilter = 1;
	private static final int SvcCcardNoSize = 20;


	public static final int SvcCcardTypeFilter = 2;
	private static final int SvcCcardTypeSize = 15;


	public static final int SvcCcardExpiryFilter = 3;

	public static final int SvcCvvNumberFilter = 4;
	private static final int SvcCvvNumberSize = 3;


	public SvcSubVrCcardDMO(){};

	public SvcSubVrCcardDMO(final String SvcMsisdnNo,
	final String SvcCcardNo,
	final String SvcCcardType,
	final Date SvcCcardExpiry,
	final String SvcCvvNumber
	){

	this.SvcMsisdnNo = SvcMsisdnNo;
	this.SvcCcardNo = SvcCcardNo;
	this.SvcCcardType = SvcCcardType;
	this.SvcCcardExpiry = SvcCcardExpiry;
	this.SvcCvvNumber = SvcCvvNumber;
	};


	private static final int[] fieldSizes = new int[]{
	SvcMsisdnNoSize,
	SvcCcardNoSize,
	SvcCcardTypeSize,
	0,
	SvcCvvNumberSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			((this.SvcMsisdnNo == null) ? null : (this.SvcMsisdnNo.length() <= SvcMsisdnNoSize) ? this.SvcMsisdnNo : this.SvcMsisdnNo.substring(0, this.SvcMsisdnNoSize)),
				((this.SvcCcardNo == null) ? null : (this.SvcCcardNo.length() <= SvcCcardNoSize) ? this.SvcCcardNo : this.SvcCcardNo.substring(0, this.SvcCcardNoSize)),
				((this.SvcCcardType == null) ? null : (this.SvcCcardType.length() <= SvcCcardTypeSize) ? this.SvcCcardType : this.SvcCcardType.substring(0, this.SvcCcardTypeSize)),
				this.SvcCcardExpiry,
				((this.SvcCvvNumber == null) ? null : (this.SvcCvvNumber.length() <= SvcCvvNumberSize) ? this.SvcCvvNumber : this.SvcCvvNumber.substring(0, this.SvcCvvNumberSize))
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
		return new DAOArgs(1).arg(this.SvcMsisdnNo); 
	}



	protected void set(Object[] fields) {
	this.SvcMsisdnNo = rtrim((String)fields[0]);
	this.SvcCcardNo = rtrim((String)fields[1]);
	this.SvcCcardType = rtrim((String)fields[2]);
	this.SvcCcardExpiry = ((fields[3] == null)? null : new Date(fields[3]));
	this.SvcCvvNumber = rtrim((String)fields[4]);
	}


	public void set(
	final String SvcMsisdnNo,
	final String SvcCcardNo,
	final String SvcCcardType,
	final Date SvcCcardExpiry,
	final String SvcCvvNumber
	)
	{

	this.SvcMsisdnNo = SvcMsisdnNo;
	this.SvcCcardNo = SvcCcardNo;
	this.SvcCcardType = SvcCcardType;
	this.SvcCcardExpiry = SvcCcardExpiry;
	this.SvcCvvNumber = SvcCvvNumber;
	}

	public String getSvcMsisdnNo() {
		return SvcMsisdnNo;
	}

	public void setSvcMsisdnNo(String svcMsisdnNo) {
		SvcMsisdnNo = svcMsisdnNo;
	}

	public String getSvcCcardNo() {
		return SvcCcardNo;
	}

	public void setSvcCcardNo(String svcCcardNo) {
		SvcCcardNo = svcCcardNo;
	}

	public String getSvcCcardType() {
		return SvcCcardType;
	}

	public void setSvcCcardType(String svcCcardType) {
		SvcCcardType = svcCcardType;
	}

	public Date getSvcCcardExpiry() {
		return SvcCcardExpiry;
	}

	public void setSvcCcardExpiry(Date svcCcardExpiry) {
		SvcCcardExpiry = svcCcardExpiry;
	}

	public String getSvcCvvNumber() {
		return SvcCvvNumber;
	}

	public void setSvcCvvNumber(String svcCvvNumber) {
		SvcCvvNumber = svcCvvNumber;
	}


}