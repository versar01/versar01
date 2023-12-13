package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EdEventDelayDMO extends DBO implements Serializable {


	private Integer edPartnerId;
	private Integer edSubscriberId;
	private String edSimNo;
	private String edMsisdnNo;
	private Integer edSendSeq;
	private Short edStatus;
	private String edCycle;
	private String edActionCode;
	private String edPartnerStatus;
	private String edOldProduct;
	private String edNewProduct;
	private String edSuperproduct;
	private String edPriceplan;
	private String edNewPriceplan;
	private Date edDatetimeStamp;
	private Date edN2nTimestamp;
	private String edComment;


	public static final int edPartnerIdFilter = 0;

	public static final int edSubscriberIdFilter = 1;

	public static final int edSimNoFilter = 2;
	private static final int edSimNoSize = 14;


	public static final int edMsisdnNoFilter = 3;
	private static final int edMsisdnNoSize = 15;


	public static final int edSendSeqFilter = 4;

	public static final int edStatusFilter = 5;

	public static final int edCycleFilter = 6;
	private static final int edCycleSize = 5;


	public static final int edActionCodeFilter = 7;
	private static final int edActionCodeSize = 2;


	public static final int edPartnerStatusFilter = 8;
	private static final int edPartnerStatusSize = 7;


	public static final int edOldProductFilter = 9;
	private static final int edOldProductSize = 7;


	public static final int edNewProductFilter = 10;
	private static final int edNewProductSize = 7;


	public static final int edSuperproductFilter = 11;
	private static final int edSuperproductSize = 7;


	public static final int edPriceplanFilter = 12;
	private static final int edPriceplanSize = 20;


	public static final int edNewPriceplanFilter = 13;
	private static final int edNewPriceplanSize = 20;


	public static final int edDatetimeStampFilter = 14;

	public static final int edN2nTimestampFilter = 15;

	public static final int edCommentFilter = 16;
	private static final int edCommentSize = 30;





	public EdEventDelayDMO(){};

	public EdEventDelayDMO(final Integer edPartnerId,
	final Integer edSubscriberId,
	final String edSimNo,
	final String edMsisdnNo,
	final Integer edSendSeq,
	final Short edStatus,
	final String edCycle,
	final String edActionCode,
	final String edPartnerStatus,
	final String edOldProduct,
	final String edNewProduct,
	final String edSuperproduct,
	final String edPriceplan,
	final String edNewPriceplan,
	final Date edDatetimeStamp,
	final Date edN2nTimestamp,
	final String edComment
	){

	this.edPartnerId = edPartnerId;
	this.edSubscriberId = edSubscriberId;
	this.edSimNo = edSimNo;
	this.edMsisdnNo = edMsisdnNo;
	this.edSendSeq = edSendSeq;
	this.edStatus = edStatus;
	this.edCycle = edCycle;
	this.edActionCode = edActionCode;
	this.edPartnerStatus = edPartnerStatus;
	this.edOldProduct = edOldProduct;
	this.edNewProduct = edNewProduct;
	this.edSuperproduct = edSuperproduct;
	this.edPriceplan = edPriceplan;
	this.edNewPriceplan = edNewPriceplan;
	this.edDatetimeStamp = edDatetimeStamp;
	this.edN2nTimestamp = edN2nTimestamp;
	this.edComment = edComment;
	};


	private static final int[] fieldSizes = new int[]{
	0,
	0,
	edSimNoSize,
	edMsisdnNoSize,
	0,
	0,
	edCycleSize,
	edActionCodeSize,
	edPartnerStatusSize,
	edOldProductSize,
	edNewProductSize,
	edSuperproductSize,
	edPriceplanSize,
	edNewPriceplanSize,
	0,
	0,
	edCommentSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_INTEGER,
	FIELD_TYPE_SHORT,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_DATE,
	FIELD_TYPE_DATE,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			this.edPartnerId,
				this.edSubscriberId,
				((this.edSimNo == null) ? null : (this.edSimNo.length() <= edSimNoSize) ? this.edSimNo : this.edSimNo.substring(0, this.edSimNoSize)),
				((this.edMsisdnNo == null) ? null : (this.edMsisdnNo.length() <= edMsisdnNoSize) ? this.edMsisdnNo : this.edMsisdnNo.substring(0, this.edMsisdnNoSize)),
				this.edSendSeq,
				this.edStatus,
				((this.edCycle == null) ? null : (this.edCycle.length() <= edCycleSize) ? this.edCycle : this.edCycle.substring(0, this.edCycleSize)),
				((this.edActionCode == null) ? null : (this.edActionCode.length() <= edActionCodeSize) ? this.edActionCode : this.edActionCode.substring(0, this.edActionCodeSize)),
				((this.edPartnerStatus == null) ? null : (this.edPartnerStatus.length() <= edPartnerStatusSize) ? this.edPartnerStatus : this.edPartnerStatus.substring(0, this.edPartnerStatusSize)),
				((this.edOldProduct == null) ? null : (this.edOldProduct.length() <= edOldProductSize) ? this.edOldProduct : this.edOldProduct.substring(0, this.edOldProductSize)),
				((this.edNewProduct == null) ? null : (this.edNewProduct.length() <= edNewProductSize) ? this.edNewProduct : this.edNewProduct.substring(0, this.edNewProductSize)),
				((this.edSuperproduct == null) ? null : (this.edSuperproduct.length() <= edSuperproductSize) ? this.edSuperproduct : this.edSuperproduct.substring(0, this.edSuperproductSize)),
				((this.edPriceplan == null) ? null : (this.edPriceplan.length() <= edPriceplanSize) ? this.edPriceplan : this.edPriceplan.substring(0, this.edPriceplanSize)),
				((this.edNewPriceplan == null) ? null : (this.edNewPriceplan.length() <= edNewPriceplanSize) ? this.edNewPriceplan : this.edNewPriceplan.substring(0, this.edNewPriceplanSize)),
				this.edDatetimeStamp,
				this.edN2nTimestamp,
				((this.edComment == null) ? null : (this.edComment.length() <= edCommentSize) ? this.edComment : this.edComment.substring(0, this.edCommentSize))
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
	this.edPartnerId = ((Integer)fields[0]);
	this.edSubscriberId = ((Integer)fields[1]);
	this.edSimNo = rtrim((String)fields[2]);
	this.edMsisdnNo = rtrim((String)fields[3]);
	this.edSendSeq = ((Integer)fields[4]);
	this.edStatus = ((Short)fields[5]);
	this.edCycle = rtrim((String)fields[6]);
	this.edActionCode = rtrim((String)fields[7]);
	this.edPartnerStatus = rtrim((String)fields[8]);
	this.edOldProduct = rtrim((String)fields[9]);
	this.edNewProduct = rtrim((String)fields[10]);
	this.edSuperproduct = rtrim((String)fields[11]);
	this.edPriceplan = rtrim((String)fields[12]);
	this.edNewPriceplan = rtrim((String)fields[13]);
	this.edDatetimeStamp = ((fields[14] == null)? null : new Date((Date)fields[14]));
	this.edN2nTimestamp = ((fields[15] == null)? null : new Date((Date)fields[15]));
	this.edComment = rtrim((String)fields[16]);
	}


	public void set(
	final Integer edPartnerId,
	final Integer edSubscriberId,
	final String edSimNo,
	final String edMsisdnNo,
	final Integer edSendSeq,
	final Short edStatus,
	final String edCycle,
	final String edActionCode,
	final String edPartnerStatus,
	final String edOldProduct,
	final String edNewProduct,
	final String edSuperproduct,
	final String edPriceplan,
	final String edNewPriceplan,
	final Date edDatetimeStamp,
	final Date edN2nTimestamp,
	final String edComment
	)
	{

	this.edPartnerId = edPartnerId;
	this.edSubscriberId = edSubscriberId;
	this.edSimNo = edSimNo;
	this.edMsisdnNo = edMsisdnNo;
	this.edSendSeq = edSendSeq;
	this.edStatus = edStatus;
	this.edCycle = edCycle;
	this.edActionCode = edActionCode;
	this.edPartnerStatus = edPartnerStatus;
	this.edOldProduct = edOldProduct;
	this.edNewProduct = edNewProduct;
	this.edSuperproduct = edSuperproduct;
	this.edPriceplan = edPriceplan;
	this.edNewPriceplan = edNewPriceplan;
	this.edDatetimeStamp = edDatetimeStamp;
	this.edN2nTimestamp = edN2nTimestamp;
	this.edComment = edComment;
	}

	public Integer getEdPartnerId() {
		return edPartnerId;
	}

	public void setEdPartnerId(Integer edPartnerId) {
		this.edPartnerId = edPartnerId;
	}

	public Integer getEdSubscriberId() {
		return edSubscriberId;
	}

	public void setEdSubscriberId(Integer edSubscriberId) {
		this.edSubscriberId = edSubscriberId;
	}

	public String getEdSimNo() {
		return edSimNo;
	}

	public void setEdSimNo(String edSimNo) {
		this.edSimNo = edSimNo;
	}

	public String getEdMsisdnNo() {
		return edMsisdnNo;
	}

	public void setEdMsisdnNo(String edMsisdnNo) {
		this.edMsisdnNo = edMsisdnNo;
	}

	public Integer getEdSendSeq() {
		return edSendSeq;
	}

	public void setEdSendSeq(Integer edSendSeq) {
		this.edSendSeq = edSendSeq;
	}

	public Short getEdStatus() {
		return edStatus;
	}

	public void setEdStatus(Short edStatus) {
		this.edStatus = edStatus;
	}

	public String getEdCycle() {
		return edCycle;
	}

	public void setEdCycle(String edCycle) {
		this.edCycle = edCycle;
	}

	public String getEdActionCode() {
		return edActionCode;
	}

	public void setEdActionCode(String edActionCode) {
		this.edActionCode = edActionCode;
	}

	public String getEdPartnerStatus() {
		return edPartnerStatus;
	}

	public void setEdPartnerStatus(String edPartnerStatus) {
		this.edPartnerStatus = edPartnerStatus;
	}

	public String getEdOldProduct() {
		return edOldProduct;
	}

	public void setEdOldProduct(String edOldProduct) {
		this.edOldProduct = edOldProduct;
	}

	public String getEdNewProduct() {
		return edNewProduct;
	}

	public void setEdNewProduct(String edNewProduct) {
		this.edNewProduct = edNewProduct;
	}

	public String getEdSuperproduct() {
		return edSuperproduct;
	}

	public void setEdSuperproduct(String edSuperproduct) {
		this.edSuperproduct = edSuperproduct;
	}

	public String getEdPriceplan() {
		return edPriceplan;
	}

	public void setEdPriceplan(String edPriceplan) {
		this.edPriceplan = edPriceplan;
	}

	public String getEdNewPriceplan() {
		return edNewPriceplan;
	}

	public void setEdNewPriceplan(String edNewPriceplan) {
		this.edNewPriceplan = edNewPriceplan;
	}

	public Date getEdDatetimeStamp() {
		return edDatetimeStamp;
	}

	public void setEdDatetimeStamp(Date edDatetimeStamp) {
		this.edDatetimeStamp = edDatetimeStamp;
	}

	public Date getEdN2nTimestamp() {
		return edN2nTimestamp;
	}

	public void setEdN2nTimestamp(Date edN2nTimestamp) {
		this.edN2nTimestamp = edN2nTimestamp;
	}

	public String getEdComment() {
		return edComment;
	}

	public void setEdComment(String edComment) {
		this.edComment = edComment;
	}
}
