package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;



public class SmqSmsMesgQueueDMO extends DBO implements Serializable {

	private Integer SmqId;
	private Integer SmqMesgId;
	private String SmqAccNo;
	private Integer SmqSubsId;
	private String SmqMsisdnNo;
	private String SmqSimNo;
	private String SmqOldValue;
	private String SmqNewValue;
	private String SmqComment1;
	private String SmqComment2;
	private String SmqOperator;
	private String SmqTty;
	private Integer SmqStatus;
	private Date SmqDate;
	private String SmqSentMsisdn;
	private Integer SmqRetry;



	public static final int SmqIdFilter = 0;

	public static final int SmqMesgIdFilter = 1;

	public static final int SmqAccNoFilter = 2;
	private static final int SmqAccNoSize = 8;


	public static final int SmqSubsIdFilter = 3;

	public static final int SmqMsisdnNoFilter = 4;
	private static final int SmqMsisdnNoSize = 14;


	public static final int SmqSimNoFilter = 5;
	private static final int SmqSimNoSize = 14;


	public static final int SmqOldValueFilter = 6;

	public static final int SmqNewValueFilter = 7;

	public static final int SmqComment1Filter = 8;

	public static final int SmqComment2Filter = 9;

	public static final int SmqOperatorFilter = 10;
	private static final int SmqOperatorSize = 10;


	public static final int SmqTtyFilter = 11;
	private static final int SmqTtySize = 14;


	public static final int SmqStatusFilter = 12;

	public static final int SmqDateFilter = 13;

	public static final int SmqSentMsisdnFilter = 14;
	private static final int SmqSentMsisdnSize = 14;


	public static final int SmqRetryFilter = 15;




	public SmqSmsMesgQueueDMO(){};

	public SmqSmsMesgQueueDMO(final Integer SmqId,
	final Integer SmqMesgId,
	final String SmqAccNo,
	final Integer SmqSubsId,
	final String SmqMsisdnNo,
	final String SmqSimNo,
	final String SmqOldValue,
	final String SmqNewValue,
	final String SmqComment1,
	final String SmqComment2,
	final String SmqOperator,
	final String SmqTty,
	final Integer SmqStatus,
	final Date SmqDate,
	final String SmqSentMsisdn,
	final Integer SmqRetry
	){

	this.SmqId = SmqId;
	this.SmqMesgId = SmqMesgId;
	this.SmqAccNo = SmqAccNo;
	this.SmqSubsId = SmqSubsId;
	this.SmqMsisdnNo = SmqMsisdnNo;
	this.SmqSimNo = SmqSimNo;
	this.SmqOldValue = SmqOldValue;
	this.SmqNewValue = SmqNewValue;
	this.SmqComment1 = SmqComment1;
	this.SmqComment2 = SmqComment2;
	this.SmqOperator = SmqOperator;
	this.SmqTty = SmqTty;
	this.SmqStatus = SmqStatus;
	this.SmqDate = SmqDate;
	this.SmqSentMsisdn = SmqSentMsisdn;
	this.SmqRetry = SmqRetry;
	};


	private static final int[] fieldSizes = new int[]{
	0,
	0,
	SmqAccNoSize,
	0,
	SmqMsisdnNoSize,
	SmqSimNoSize,
	0,
	0,
	0,
	0,
	SmqOperatorSize,
	SmqTtySize,
	0,
	0,
	SmqSentMsisdnSize,
	0
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			this.SmqId,
				this.SmqMesgId,
				((this.SmqAccNo == null) ? null : (this.SmqAccNo.length() <= SmqAccNoSize) ? this.SmqAccNo : this.SmqAccNo.substring(0, this.SmqAccNoSize)),
				this.SmqSubsId,
				((this.SmqMsisdnNo == null) ? null : (this.SmqMsisdnNo.length() <= SmqMsisdnNoSize) ? this.SmqMsisdnNo : this.SmqMsisdnNo.substring(0, this.SmqMsisdnNoSize)),
				((this.SmqSimNo == null) ? null : (this.SmqSimNo.length() <= SmqSimNoSize) ? this.SmqSimNo : this.SmqSimNo.substring(0, this.SmqSimNoSize)),
				this.SmqOldValue,
				this.SmqNewValue,
				this.SmqComment1,
				this.SmqComment2,
				((this.SmqOperator == null) ? null : (this.SmqOperator.length() <= SmqOperatorSize) ? this.SmqOperator : this.SmqOperator.substring(0, this.SmqOperatorSize)),
				((this.SmqTty == null) ? null : (this.SmqTty.length() <= SmqTtySize) ? this.SmqTty : this.SmqTty.substring(0, this.SmqTtySize)),
				this.SmqStatus,
				this.SmqDate,
				((this.SmqSentMsisdn == null) ? null : (this.SmqSentMsisdn.length() <= SmqSentMsisdnSize) ? this.SmqSentMsisdn : this.SmqSentMsisdn.substring(0, this.SmqSentMsisdnSize)),
				this.SmqRetry
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
		return new DAOArgs().arg(this.SmqId); 
	}


	protected void set(Object[] fields) {
	this.SmqId = ((Integer)fields[0]);
	this.SmqMesgId = ((Integer)fields[1]);
	this.SmqAccNo = rtrim((String)fields[2]);
	this.SmqSubsId = ((Integer)fields[3]);
	this.SmqMsisdnNo = rtrim((String)fields[4]);
	this.SmqSimNo = rtrim((String)fields[5]);
	this.SmqOldValue = ((String)fields[6]);
	this.SmqNewValue = ((String)fields[7]);
	this.SmqComment1 = ((String)fields[8]);
	this.SmqComment2 = ((String)fields[9]);
	this.SmqOperator = rtrim((String)fields[10]);
	this.SmqTty = rtrim((String)fields[11]);
	this.SmqStatus = ((Integer)fields[12]);
	this.SmqDate = ((fields[13] == null)? null : new Date(fields[13]));
	this.SmqSentMsisdn = rtrim((String)fields[14]);
	this.SmqRetry = ((Integer)fields[15]);
	}


	public void set(
	final Integer SmqId,
	final Integer SmqMesgId,
	final String SmqAccNo,
	final Integer SmqSubsId,
	final String SmqMsisdnNo,
	final String SmqSimNo,
	final String SmqOldValue,
	final String SmqNewValue,
	final String SmqComment1,
	final String SmqComment2,
	final String SmqOperator,
	final String SmqTty,
	final Integer SmqStatus,
	final Date SmqDate,
	final String SmqSentMsisdn,
	final Integer SmqRetry
	)
	{

	this.SmqId = SmqId;
	this.SmqMesgId = SmqMesgId;
	this.SmqAccNo = SmqAccNo;
	this.SmqSubsId = SmqSubsId;
	this.SmqMsisdnNo = SmqMsisdnNo;
	this.SmqSimNo = SmqSimNo;
	this.SmqOldValue = SmqOldValue;
	this.SmqNewValue = SmqNewValue;
	this.SmqComment1 = SmqComment1;
	this.SmqComment2 = SmqComment2;
	this.SmqOperator = SmqOperator;
	this.SmqTty = SmqTty;
	this.SmqStatus = SmqStatus;
	this.SmqDate = SmqDate;
	this.SmqSentMsisdn = SmqSentMsisdn;
	this.SmqRetry = SmqRetry;
	}

	public Integer getSmqId() {
		return SmqId;
	}

	public void setSmqId(Integer smqId) {
		SmqId = smqId;
	}

	public Integer getSmqMesgId() {
		return SmqMesgId;
	}

	public void setSmqMesgId(Integer smqMesgId) {
		SmqMesgId = smqMesgId;
	}

	public String getSmqAccNo() {
		return SmqAccNo;
	}

	public void setSmqAccNo(String smqAccNo) {
		SmqAccNo = smqAccNo;
	}

	public Integer getSmqSubsId() {
		return SmqSubsId;
	}

	public void setSmqSubsId(Integer smqSubsId) {
		SmqSubsId = smqSubsId;
	}

	public String getSmqMsisdnNo() {
		return SmqMsisdnNo;
	}

	public void setSmqMsisdnNo(String smqMsisdnNo) {
		SmqMsisdnNo = smqMsisdnNo;
	}

	public String getSmqSimNo() {
		return SmqSimNo;
	}

	public void setSmqSimNo(String smqSimNo) {
		SmqSimNo = smqSimNo;
	}

	public String getSmqOldValue() {
		return SmqOldValue;
	}

	public void setSmqOldValue(String smqOldValue) {
		SmqOldValue = smqOldValue;
	}

	public String getSmqNewValue() {
		return SmqNewValue;
	}

	public void setSmqNewValue(String smqNewValue) {
		SmqNewValue = smqNewValue;
	}

	public String getSmqComment1() {
		return SmqComment1;
	}

	public void setSmqComment1(String smqComment1) {
		SmqComment1 = smqComment1;
	}

	public String getSmqComment2() {
		return SmqComment2;
	}

	public void setSmqComment2(String smqComment2) {
		SmqComment2 = smqComment2;
	}

	public String getSmqOperator() {
		return SmqOperator;
	}

	public void setSmqOperator(String smqOperator) {
		SmqOperator = smqOperator;
	}

	public String getSmqTty() {
		return SmqTty;
	}

	public void setSmqTty(String smqTty) {
		SmqTty = smqTty;
	}

	public Integer getSmqStatus() {
		return SmqStatus;
	}

	public void setSmqStatus(Integer smqStatus) {
		SmqStatus = smqStatus;
	}

	public Date getSmqDate() {
		return SmqDate;
	}

	public void setSmqDate(Date smqDate) {
		SmqDate = smqDate;
	}

	public String getSmqSentMsisdn() {
		return SmqSentMsisdn;
	}

	public void setSmqSentMsisdn(String smqSentMsisdn) {
		SmqSentMsisdn = smqSentMsisdn;
	}

	public Integer getSmqRetry() {
		return SmqRetry;
	}

	public void setSmqRetry(Integer smqRetry) {
		SmqRetry = smqRetry;
	}

}