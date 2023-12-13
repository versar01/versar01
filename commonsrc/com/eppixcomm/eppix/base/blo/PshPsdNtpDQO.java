package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class PshPsdNtpDQO extends DBO
implements Serializable{
	
	protected PshParamServHdrDMO psh;
	protected PsdParamServDetDMO psd;
	protected NtpNetTransPendDMO ntp;
	
	
	  private static final int[] fieldTypes = new int[] {
		FIELD_TYPE_INTEGER /* std public attribute: pshSubscriberId  */,
		FIELD_TYPE_STRING /* std public attribute: pshSimNo  */,
		FIELD_TYPE_STRING /* std public attribute: pshMsisdnNo  */,
		FIELD_TYPE_STRING /* std public attribute: pshArchived  */,		
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_INTEGER /* std public attribute: psdPshId */,
		FIELD_TYPE_INTEGER /* std public attribute: psdParamId */,
		FIELD_TYPE_DATEONLY, 
		FIELD_TYPE_DATEONLY, 
		FIELD_TYPE_STRING /*std public attribute psdParamValue*/,
		FIELD_TYPE_STRING, 
		FIELD_TYPE_STRING, 
		FIELD_TYPE_DATEONLY,
		FIELD_TYPE_STRING,		
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_DOUBLE,
		FIELD_TYPE_STRING,
		FIELD_TYPE_INTEGER,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_DATETIME	      
	  };
	  
	  /**
	  * TODO SJ Implement the array of field sizes
	  *
	  */
	  private final int[] fieldSizes = new int[] {
	        
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshIdFilter = 0; // filter index

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshServiceCodeFilter = 1; // filter index
	  private static final int pshServiceCodeSize = 4; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshServiceTypeFilter = 2; // filter index
	  private static final int pshServiceTypeSize = 5; // field size
	  
	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshSubscriberIdFilter = 3; // filter index

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshSimNoFilter = 4; // filter index
	  private static final int pshSimNoSize = 14; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshMsisdnNoFilter = 5; // filter index
	  private static final int pshMsisdnNoSize = 15; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int pshArchivedFilter = 6; // filter index
	  private static final int pshArchivedSize = 1; // field size
	  
	  
	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  
	  
	  public static final int psdSerialIdFilter = 7;
		
	  public static final int psdPshIdFilter = 8;	
	  public static final int psdParamIdFilter = 9;
		
	  public static final int psdActDateFilter = 10;	
	  public static final int psdTermDateFilter = 11;
		
	  public static final int psdParamValueFilter = 12;
	  private static final int psdParamValueSize = 20; // field size
		
	  public static final int psdN2nStringFilter = 13;
	  private static final int psdN2nStringSize = 1; // field size
		
	  public static final int psdParamActiveFilter = 14;
	  private static final int psdParamActiveSize = 1; // field size
		
	  public static final int psdDeacDateFilter = 15;
		
	  public static final int psdSubChargeFilter = 16;
	  private static final int psdSubChargeSize = 5; // field size
	  
	  public static final int psdSubChgValueFilter = 17;
	  
	  public static final int ntpSerialIdFilter = 18; // filter index
	  
	  public static final int ntpCommandFilter = 19; // filter index
	  private static final int ntpCommandSize = 16; // field size
	  
	  public static final int ntpSendSeqFilter = 20; // filter index
	  
	  public static final int ntpTranTypeFilter = 21; // filter index
	  private static final int ntpTranTypeSize = 2; // field size
	  
	  public static final int ntpSubscriberIdFilter = 22; // filter index
	  
	  public static final int ntpOldValueFilter = 23; // filter index
	  private static final int ntpOldValueSize = 20; // field size
	  
	  public static final int ntpNewValueFilter = 23; // filter index
	  private static final int ntpNewValueSize = 20; // field size
	  
	  public static final int ntpServiceCodeFilter = 25; // filter index
	  private static final int ntpServiceCodeSize = 4; // field size
	  
	  public static final int ntpStatusFilter = 26; // filter index
	  private static final int ntpStatusSize = 1; // field size
	  
	  public static final int ntpTimestampFilter = 27; // filter index


	  public PshPsdNtpDQO(  ) {
	  }

	  // Constructor - taking public attributes
	  /**
	   * Creates a new PshParamServHdrDMO object.
	   *
	   * @param pshId DOCUMENT ME!
	   * @param pshServiceCode DOCUMENT ME!
	   * @param pshSubscriberId DOCUMENT ME!
	   * @param pshSimNo DOCUMENT ME!
	   * @param pshMsisdnNo DOCUMENT ME!
	   * @param pshArchived DOCUMENT ME!
	   */
	  public PshPsdNtpDQO( 
		final Integer psdSerialId,
		final Integer psdPshId,
		final Integer psdParamId,
		final Date psdActDate,
		final Date psdTermDate,
		final String psdParamValue,
		final String psdN2nString,
		final String psdParamActive,
		final Date psdDeacDate,
		final String psdSubCharge,	
		final Double psdChgValue,
	    final Integer pshSubscriberId,
	    final String  pshSimNo,
	    final String  pshMsisdnNo,
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
		  
	    this.pshId = pshId;
	    this.pshServiceCode = pshServiceCode;
	    this.pshSubscriberId = pshSubscriberId;
	    this.pshSimNo = pshSimNo;
	    this.pshMsisdnNo = pshMsisdnNo;
	    this.pshArchived = pshArchived;
	    this.pshServiceType = pshServiceType;

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

	  //---------------------
	  // Field declarations
	  //---------------------
	  
	  // all attributes
	  private Integer pshId; // Loaded from Schema
	  private String pshServiceCode; // Loaded from Schema
	  private String pshServiceType;  
	  private Integer pshSubscriberId; // Loaded from Schema
	  private String pshSimNo; // Loaded from Schema
	  private String pshMsisdnNo; // Loaded from Schema
	  private String pshArchived; // Loaded from Schema
	  private Integer psdSerialId;
	  private Integer psdPshId; // Loaded from Schema
	  private Integer psdParamId; // Loaded from Schema
	  private Date psdActDate;
	  private Date psdTermDate;
	  private String psdParamValue; // Loaded from Schema
	  private String psdN2nString;
	  private String psdParamActive;
	  private Date psdDeacDate;
	  private String psdSubCharge;
	  private Double psdChgValue;
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
	  
	  //~ Constructors ///////////////////////////////////////////////////////////

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
		
	}

	protected Object[] get() {
	    return new Object[] {
	    	      pshId,
	    	      ( pshServiceCode == null ) ? null
	    	                                 : ( ( pshServiceCode.length(  ) <= pshServiceCodeSize )
	    	      ? pshServiceCode
	    	      : pshServiceCode.substring( 0, pshServiceCodeSize ) // auto trimmed to fit, if required.
	    	       ),
	    	       ( pshServiceType == null ) ? null
	    	                                 : ( ( pshServiceType.length(  ) <= pshServiceTypeSize )
	    	      ? pshServiceType
	    	      : pshServiceType.substring( 0, pshServiceTypeSize ) // auto trimmed to fit, if required.
	    	       ), pshSubscriberId,
	    	      ( pshSimNo == null ) ? null
	    	                           : ( ( pshSimNo.length(  ) <= pshSimNoSize )
	    	      ? pshSimNo
	    	      : pshSimNo.substring( 0, pshSimNoSize ) // auto trimmed to fit, if required.
	    	       ),
	    	      ( pshMsisdnNo == null ) ? null
	    	                              : ( ( pshMsisdnNo.length(  ) <= pshMsisdnNoSize )
	    	      ? pshMsisdnNo
	    	      : pshMsisdnNo.substring( 0, pshMsisdnNoSize ) // auto trimmed to fit, if required.
	    	       ),
	    	      ( pshArchived == null ) ? null
	    	                              : ( ( pshArchived.length(  ) <= pshArchivedSize )
	    	      ? pshArchived
	    	      : pshArchived.substring( 0, pshArchivedSize ) // auto trimmed to fit, if required.
	    	       ),
	    	       
	    	       
	    	       psdSerialId,		
	    			psdPshId,
	    			psdParamId,
	    			(psdTermDate == null) ? null : new Date(psdTermDate),
	    			(psdTermDate == null) ? null : new Date(psdTermDate),
	    			(psdParamValue == null) ? null 
	    					: ((psdParamValue.length() <= psdParamValueSize) ? psdParamValue 
	    							: psdParamValue.substring(0, psdParamValueSize)),
	    							// auto trimmed to fit, if required.,
	    			(psdN2nString == null) ? null 
	    					: ((psdN2nString.length() <= psdN2nStringSize) ? psdN2nString 
	    							: psdN2nString.substring(0, psdN2nStringSize)), 
	    			(psdParamActive == null) ? null 
	    					: ((psdParamActive.length() <= psdParamActiveSize) ? psdParamActive 
	    							: psdParamActive.substring(0, psdParamActiveSize)), 
	    			(psdDeacDate == null) ? null : new Date(psdDeacDate),
	    			(psdSubCharge == null) ? null 
	    					: ((psdSubCharge.length() <= psdSubChargeSize) ? psdSubCharge 
	    							: psdSubCharge.substring(0, psdSubChargeSize)),
	    							
	    			psdChgValue,		
	    	        	    	        
	    	        ntpSerialId,
	    			(ntpCommand == null) ? null : ((ntpCommand.length() <= ntpCommandSize)
	    			? ntpCommand : ntpCommand.substring( 0, ntpCommandSize) // auto trimmed to fit, if required.
	    	        ),ntpSendSeq,
	    	        
	    	        (ntpTranType == null)? null :((ntpTranType.length()  <= ntpTranTypeSize) ? ntpTranType :
	    	        		ntpTranType.substring(0, ntpTranTypeSize)),
	    			
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
		// TODO Auto-generated method stub
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	private void deConstruct(){
//		psh = new PshParamServHdrDMO(pshId,pshServiceCode,pshArchived,
//			    pshSubscriberId,pshSimNo,pshMsisdnNo);
//		
////		psd = new PsdParamServDetDMO(psdSerialId, psdPshId, psdParamId, psdActDate, psdTermDate, psdParamValue, psdN2nString, psdParamActive, psdDeacDate, psdSubCharge, psdChgValue);
//		
//		ntp = new NtpNetTransPendDMO(ntpSerialId,ntpCommand,ntpSendSeq,ntpTranType,
//				ntpSubscriberId,ntpOldValue,ntpNewValue,
//				ntpServiceCode,ntpStatus,ntpTimestamp);
//		
//	}

	protected void set(Object[] fields) {
	    pshId = (Integer) fields[0];
	    pshServiceCode = rtrim( (String) fields[1] );
	    pshServiceType = rtrim( (String) fields[2] );
	    pshSubscriberId = (Integer) fields[3];
	    pshSimNo = rtrim( (String) fields[4] );
	    pshMsisdnNo = rtrim( (String) fields[5] );
	    pshArchived = rtrim( (String) fields[6] );
		psdSerialId = (Integer) fields[7];		
		psdPshId = (Integer) fields[8];
		psdParamId = (Integer) fields[9];
		psdTermDate = (Date) fields[10];
		psdTermDate = (Date) fields[11];
		psdParamValue = rtrim((String) fields[12]);
		psdN2nString = rtrim((String) fields[13]);
		psdParamActive = rtrim((String) fields[14]);
		psdDeacDate = (Date) fields[15];
		psdSubCharge = rtrim((String) fields[16]);
		ntpSerialId = (Integer)fields[17];
		ntpCommand = rtrim((String)fields[18]);
		ntpSendSeq = (Integer)fields[19];
		ntpTranType = rtrim((String)fields[20]);
		ntpSubscriberId = (Integer)fields[21];
		ntpOldValue = rtrim((String)fields[22]);
		ntpNewValue = rtrim((String)fields[23]);
		ntpServiceCode = rtrim((String)fields[24]);
		ntpStatus = rtrim((String)fields[25]);
		ntpTimestamp = (DateTime)fields[26];
	}
	
	  public void set( 
			    final Integer pshId,
			    final String  pshServiceCode,
			    final String pshServiceType,
			    final Integer pshSubscriberId,
			    final String  pshSimNo,
			    final String  pshMsisdnNo,
			    final String  pshArchived,
			    final Integer psdSerialId,
			    final Integer psdPshId,
				final Integer psdParamId,
				final Date psdActDate,
				final Date psdTermDate,
				final String psdParamValue,
				final String psdN2nString,
				final String psdParamActive,
				final Date psdDeacDate,
				final String psdSubCharge,	
				final Double psdChgValue,
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
			    this.pshId = pshId;
			    this.pshServiceCode = pshServiceCode;
			    this.pshServiceType = pshServiceType;
			    this.pshSubscriberId = pshSubscriberId;
			    this.pshSimNo = pshSimNo;
			    this.pshMsisdnNo = pshMsisdnNo;
			    this.pshArchived = pshArchived;
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

	public String getNtpCommand() {
		return ntpCommand;
	}

	public void setNtpCommand(String ntpCommand) {
		this.ntpCommand = ntpCommand;
	}

	public String getNtpNewValue() {
		return ntpNewValue;
	}

	public void setNtpNewValue(String ntpNewValue) {
		this.ntpNewValue = ntpNewValue;
	}

	public String getNtpOldValue() {
		return ntpOldValue;
	}

	public void setNtpOldValue(String ntpOldValue) {
		this.ntpOldValue = ntpOldValue;
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
		this.ntpServiceCode = ntpServiceCode;
	}

	public String getNtpStatus() {
		return ntpStatus;
	}

	public void setNtpStatus(String ntpStatus) {
		this.ntpStatus = ntpStatus;
	}

	public Integer getNtpSubscriberId() {
		return ntpSubscriberId;
	}

	public void setNtpSubscriberId(Integer ntpSubscriberId) {
		this.ntpSubscriberId = ntpSubscriberId;
	}

	public DateTime getNtpTimestamp() {
		return ntpTimestamp;
	}

	public void setNtpTimestamp(DateTime ntpTimestamp) {
		this.ntpTimestamp = ntpTimestamp;
	}

	public String getNtpTranType() {
		return ntpTranType;
	}

	public void setNtpTranType(String ntpTranType) {
		this.ntpTranType = ntpTranType;
	}

	public String getPshArchived() {
		return pshArchived;
	}

	public void setPshArchived(String pshArchived) {
		this.pshArchived = pshArchived;
	}

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getPshMsisdnNo() {
		return pshMsisdnNo;
	}

	public void setPshMsisdnNo(String pshMsisdnNo) {
		this.pshMsisdnNo = pshMsisdnNo;
	}

	public String getPshServiceCode() {
		return pshServiceCode;
	}

	public void setPshServiceCode(String pshServiceCode) {
		this.pshServiceCode = pshServiceCode;
	}

	public String getPshServiceType() {
		return pshServiceType;
	}

	public void setPshServiceType(String pshServiceType) {
		this.pshServiceType = pshServiceType;
	}

	public String getPshSimNo() {
		return pshSimNo;
	}

	public void setPshSimNo(String pshSimNo) {
		this.pshSimNo = pshSimNo;
	}

	public Integer getPshSubscriberId() {
		return pshSubscriberId;
	}

	public void setPshSubscriberId(Integer pshSubscriberId) {
		this.pshSubscriberId = pshSubscriberId;
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

}
