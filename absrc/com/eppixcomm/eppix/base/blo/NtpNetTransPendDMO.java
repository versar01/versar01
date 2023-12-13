package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;
//import com.sun.org.apache.xpath.internal.Arg;

public class NtpNetTransPendDMO extends DBO implements Serializable{

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new AuxCustomersDMO object.
	   */
	  public NtpNetTransPendDMO(  ) {
	  }
	
	  /**
	   * Creates a new AuxCustomersDMO object.
	   * Constructor with all fields as paramaters
	   */
	  public NtpNetTransPendDMO(
			  final Integer ntpSerialId,
			  final String ntpCommand,
			  final Integer ntpSendSeq,
			  final String ntpTranType,
			  final Integer ntpSubscriberId,
			  final String ntpOldValue,
			  final String ntpNewValue,
			  final String ntpServiceCode,
			  final String ntpStatus,
			  final DateTime ntpTimestamp) {
		  
		  this.ntpSerialId = ntpSerialId;
		  this.ntpCommand = ntpCommand;
		  this.ntpSendSeq = ntpSendSeq;
		  this.ntpTranType = ntpTranType;
		  this.ntpSubscriberId = ntpSubscriberId;
		  this.ntpOldValue = ntpOldValue;
		  this.ntpNewValue = ntpNewValue;
		  this.ntpServiceCode = ntpServiceCode;
		  this.ntpStatus = ntpStatus;
		  this.ntpTimestamp = (ntpTimestamp != null)? new DateTime(ntpTimestamp): null;
	  }	  
	
//~ Instance variables /////////////////////////////////////////////////////
	  
	  private Integer ntpSerialId;
	  private String ntpCommand;
	  private Integer ntpSendSeq;
	  private String ntpTranType;
	  private Integer ntpSubscriberId;
	  private String ntpOldValue;
	  private String ntpNewValue;
	  private String ntpServiceCode;
	  private String ntpStatus;
	  private DateTime ntpTimestamp;
	
	  private static final int[] fieldTypes = new int[] {
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_DATETIME		  
	  };
	  
	private final int[] fieldSizes = new int[] {
			0,
			ntpCommandSize,
			0,
			ntpTranTypeSize,
			0,
			ntpOldValueSize,
			ntpNewValueSize,
			ntpServiceCodeSize,
			ntpStatusSize,
			0
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  
	
	  public static final int ntpSerialIdFilter = 0; // filter index
	  
	  public static final int ntpCommandFilter = 1; // filter index
	  private static final int ntpCommandSize = 16; // field size
	  
	  public static final int ntpSendSeqFilter = 2; // filter index
	  
	  public static final int ntpTranTypeFilter = 3; // filter index
	  private static final int ntpTranTypeSize = 2; // field size
	  
	  public static final int ntpSubscriberIdFilter = 4; // filter index
	  
	  public static final int ntpOldValueFilter = 5; // filter index
	  private static final int ntpOldValueSize = 20; // field size
	  
	  public static final int ntpNewValueFilter = 6; // filter index
	  private static final int ntpNewValueSize = 20; // field size
	  
	  public static final int ntpServiceCodeFilter = 7; // filter index
	  private static final int ntpServiceCodeSize = 4; // field size
	  
	  public static final int ntpStatusFilter = 8; // filter index
	  private static final int ntpStatusSize = 1; // field size
	  
	  public static final int ntpTimestampFilter = 9; // filter index

	protected void generatedKey(Integer key) {		
	}

	protected Object[] get() {
		return new Object[]{ntpSerialId,
		(ntpCommand == null) ? null : ((ntpCommand.length() <= ntpCommandSize)
		? ntpCommand : ntpCommand.substring( 0, ntpCommandSize) // auto trimmed to fit, if required.
        ),ntpSendSeq,
        
        (ntpTranType == null)? null :((ntpTranType.length()  <= ntpTranTypeSize) ? ntpTranType :
        		ntpTranType.substring(0, ntpTranTypeSize)),
		ntpSubscriberId,
		(ntpOldValue == null)? null : ((ntpOldValue.length() <= ntpOldValueSize)? ntpOldValue : ntpOldValue.substring(0, ntpOldValueSize)),
		(ntpNewValue == null)? null : ((ntpNewValue.length() <= ntpNewValueSize)? ntpNewValue : ntpNewValue.substring(0, ntpNewValueSize)),
		(ntpServiceCode == null)? null : ((ntpServiceCode.length() <= ntpServiceCodeSize)? ntpServiceCode : ntpServiceCode.substring(0, ntpServiceCodeSize)),
		(ntpStatus == null)? null : ((ntpStatus.length() <= ntpStatusSize)? ntpStatus : ntpStatus.substring(0, ntpStatusSize)),				
		 ntpTimestamp        
		};
	}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub		
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs().arg(this.ntpSerialId);
	}

	protected void set(Object[] fields) {
		  this.ntpSerialId = (Integer)fields[0];
		  this.ntpCommand = rtrim((String)fields[1]);
		  this.ntpSendSeq = (Integer)fields[2];
		  this.ntpTranType = rtrim((String)fields[3]);
		  this.ntpSubscriberId = (Integer)fields[4];
		  this.ntpOldValue = rtrim((String)fields[5]);
		  this.ntpNewValue = rtrim((String)fields[6]);
		  this.ntpServiceCode = rtrim((String)fields[7]);
		  this.ntpStatus = rtrim((String)fields[8]);
		  this.ntpTimestamp = (DateTime)fields[9];
		
	}

	public String getNtpCommand() {
		return ntpCommand;
	}

	public void setNtpCommand(String ntpCommand) {
		this.ntpCommand = getPadded(ntpCommand, ntpCommandFilter);
	}

	public String getNtpNewValue() {
		return ntpNewValue;
	}

	public void setNtpNewValue(String ntpNewValue) {
		this.ntpNewValue = getPadded(ntpNewValue, ntpNewValueFilter);
	}

	public String getNtpOldValue() {
		return ntpOldValue;
	}

	public void setNtpOldValue(String ntpOldValue) {
		this.ntpOldValue = getPadded(ntpOldValue, ntpOldValueFilter);
	}

	public Integer getNtpSendSeq() {
		return ntpSendSeq;
	}

	public void setNtpSendSeq(Integer ntpSendSeq) {
		this.ntpSendSeq = ntpSendSeq;
	}

	public Integer getNtpSerialId() {
		return ntpSerialId;
	}

	public void setNtpSerialId(Integer ntpSerialId) {
		this.ntpSerialId = ntpSerialId;
	}

	public String getNtpServiceCode() {
		return ntpServiceCode;
	}

	public void setNtpServiceCode(String ntpServiceCode) {
		this.ntpServiceCode = getPadded(ntpServiceCode, ntpServiceCodeFilter);
	}

	public String getNtpStatus() {
		return ntpStatus;
	}

	public void setNtpStatus(String ntpStatus) {
		this.ntpStatus = getPadded(ntpStatus, ntpStatusFilter);
	}

	public Integer getNtpSubscriberId() {
		return ntpSubscriberId;
	}

	public void setNtpSubscriberId(Integer ntpSubscriberId) {
		this.ntpSubscriberId = ntpSubscriberId;
	}

	public DateTime getNtpTimestamp() {
		return (ntpTimestamp != null)? new DateTime(ntpTimestamp): null;
	}

	public void setNtpTimestamp(DateTime ntpTimestamp) {
		this.ntpTimestamp = (ntpTimestamp != null)? new DateTime(ntpTimestamp):null;
	}

	public String getNtpTranType() {
		return ntpTranType;
	}

	public void setNtpTranType(String ntpTranType) {
		this.ntpTranType = getPadded(ntpTranType, ntpTranTypeFilter);
	}
	  
	  
}
