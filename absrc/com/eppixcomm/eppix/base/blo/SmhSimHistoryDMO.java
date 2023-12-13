package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

/*
 * This claa represent an Data Model Object for table 
 * SMH_SIM_HISTORY
 */
public class SmhSimHistoryDMO extends DBO
implements Serializable{

	private String  	smhComment;
	private String  	smhHistCode;	
	private String  	smhSimNo;	
	private Integer 	smhSubscriberId;	
	private String  	smhTerminalId;	
	private DateTime    smhTimestamp;	
	private String  	smhUserId;

	/**
	 * 
	 */
	private static final int[] fieldTypes = new int[] {
		FIELD_TYPE_STRING, // smhComment
		FIELD_TYPE_STRING, // smhHistCode
		FIELD_TYPE_STRING, // smhSimNo
		FIELD_TYPE_INTEGER, // smhSubscriberId
		FIELD_TYPE_STRING, // smhTerminalId
		FIELD_TYPE_DATETIME, // smhTimestamp
		FIELD_TYPE_STRING // smhUserId
	};
	
	private final int[] fieldSizes = new int[] {
			smhCommentSize,
			smhHistCodeSize,
			smhSimNoSize,
			0,
			smhTerminalIdSize,
			smhTimestampSize,
			smhUserIdSize
	};
	    

	public int[] fieldSizes() {
		return fieldSizes;
	}  
	
	  public static final int smhCommentFilter = 0; // filter index
	  private static final int smhCommentSize = 50; // field size

	  public static final int smhHistCodeFilter = 1; // filter index
	  private static final int smhHistCodeSize = 10; // field size

	  public static final int smhSimNoFilter = 2; // filter index
	  private static final int smhSimNoSize = 14; // field size

	  public static final int smhSubscriberIdFilter = 3; // filter index

	  public static final int smhTerminalIdFilter = 4; // filter index
	  private static final int smhTerminalIdSize = 10; // field size

	  public static final int smhTimestampFilter = 5; // filter index
	  private static final int smhTimestampSize = 32; // field size

	  public static final int smhUserIdFilter = 6; // filter index
	  private static final int smhUserIdSize = 10; // field size
	
	/**
	 *   
	 */
	protected int[] fieldTypes(){
		return fieldTypes;
	}
	
	/**
	 * Constructor
	 */
	public void SmhSimHistoryDMO(){
		
	}
	
	/**
	 * 
	 * @param smhComment
	 * @param smhHistCode
	 * @param smhSimNo
	 * @param smhSubscriberId
	 * @param smhTerminalId
	 * @param smhTimestamp
	 * @param smhUserId
	 */
	public void SmhSimHistoryDMO(String  smhComment,
	String  smhHistCode,	
	String  smhSimNo,	
	Integer smhSubscriberId,	
	String  smhTerminalId,	
	Date    smhTimestamp,	
	String  smhUserId){
		this.smhComment = smhComment;
		this.smhHistCode = smhHistCode;
		this.smhSimNo = smhSimNo; 
		this.smhSubscriberId = smhSubscriberId;
		this.smhTerminalId = smhTerminalId;
		this.smhTimestamp = ( smhTimestamp != null )
	      ? new DateTime( smhTimestamp ) : null;;
		this.smhUserId = smhUserId;
	}

	/**
	 * 
	 */
	protected void generatedKey(Integer key) {
	}

	/**
	 * 
	 */
	protected Integer versionNumber() {
		return null;
	}

	/**
	 * 
	 */
	protected void versionNumber(Integer versionNumber) {
		
	}

	/**
	 * 
	 */
	protected DAOArgs primaryKey() {
		return null;
	}
	
	/**
	 * 
	 * @param smhComment
	 * @param smhHistCode
	 * @param smhSimNo
	 * @param smhSubscriberId
	 * @param smhTerminalId
	 * @param smhTimestamp
	 * @param smhUserId
	 */
	public void set(final String  smhComment,
			final String  smhHistCode,	
			final String  smhSimNo,	
			final Integer smhSubscriberId,	
			final String  smhTerminalId,	
			final Date    smhTimestamp,	
			final String  smhUserId){
				this.smhComment = smhComment;
				this.smhHistCode = smhHistCode;
				this.smhSimNo = smhSimNo; 
				this.smhSubscriberId = smhSubscriberId;
				this.smhTerminalId = smhTerminalId;
				this.smhTimestamp = ( smhTimestamp != null )
			      ? new DateTime( smhTimestamp ) : null;;
				this.smhUserId = smhUserId;
	}

	/**
	 * 
	 */
	protected void set(final Object[] fields) {
		smhComment = rtrim( (String) fields[0] );
		smhHistCode = rtrim( (String) fields[1] );
		smhSimNo = rtrim( (String) fields[2] );
		smhSubscriberId = (Integer) fields[3] ;
		smhTerminalId = rtrim( (String) fields[4] );
		smhTimestamp =(DateTime) fields[5] ;
		smhUserId = rtrim( (String) fields[6] );		
	}
	
	/**
	 * 
	 */
	protected Object[] get() {return new Object[] {
			( smhComment == null ) ? null : ( ( smhComment.length(  ) <= smhCommentSize )
			? smhComment : smhComment.substring( 0, smhCommentSize ) // auto trimmed to fit, if required.
			),
			
			( smhHistCode == null ) ? null : ( ( smhHistCode.length(  ) <= smhHistCodeSize )
			? smhHistCode : smhHistCode.substring( 0, smhHistCodeSize ) // auto trimmed to fit, if required.
			),
			
			( smhSimNo == null ) ? null : ( ( smhSimNo.length(  ) <= smhSimNoSize )
			? smhSimNo : smhSimNo.substring( 0, smhSimNoSize ) // auto trimmed to fit, if required.
			),
			
			smhSubscriberId,
			
			( smhTerminalId == null ) ? null : ( ( smhTerminalId.length(  ) <= smhTerminalIdSize )
			? smhTerminalId : smhTerminalId.substring( 0, smhTerminalIdSize ) // auto trimmed to fit, if required.
			),
		
			smhTimestamp,
			
			( smhUserId == null ) ? null : ( ( smhUserId.length(  ) <= smhUserIdSize )
			? smhUserId : smhUserId.substring( 0, smhUserIdSize ) // auto trimmed to fit, if required.
			)
		};
	}

	/**
	 * 
	 * @return
	 */
	public String getSmhComment() {
		return smhComment;
	}

	/**
	 * 
	 * @param smhComment
	 */
	public void setSmhComment(String smhComment) {
		this.smhComment = getPadded(smhComment, smhCommentFilter);
	}

	/**
	 * 
	 * @return
	 */
	public String getSmhHistCode() {
		return smhHistCode;
	}

	/**
	 * 
	 * @param smhHistCode
	 */
	public void setSmhHistCode(String smhHistCode) {
		this.smhHistCode = getPadded(smhHistCode, smhHistCodeFilter);
	}

	/**
	 * 
	 * @return
	 */
	public String getSmhSimNo() {
		return smhSimNo;
	}

	/**
	 * 
	 * @param smhSimNo
	 */
	public void setSmhSimNo(String smhSimNo) {
		this.smhSimNo = getPadded(smhSimNo, smhSimNoFilter);
	}

	/**
	 * 
	 * @return
	 */
	public Integer getSmhSubscriberId() {
		return smhSubscriberId;
	}

	/**
	 * 
	 * @param smhSubscriberId
	 */
	public void setSmhSubscriberId(Integer smhSubscriberId) {
		this.smhSubscriberId = smhSubscriberId;
	}

	/**
	 * 
	 * @return
	 */
	public String getSmhTerminalId() {
		return smhTerminalId;
	}

	/**
	 * 
	 * @param smhTerminalId
	 */
	public void setSmhTerminalId(String smhTerminalId) {
		this.smhTerminalId = getPadded(smhTerminalId, smhTerminalIdFilter);
	}

	/**
	 * 
	 * @return
	 */
	public DateTime getSmhTimestamp() {
		return smhTimestamp;
	}

	/**
	 * 
	 * @param smhTimestamp
	 */
	public void setSmhTimestamp(DateTime smhTimestamp) {
		this.smhTimestamp = smhTimestamp;
	}

	/**
	 * 
	 * @return
	 */
	public String getSmhUserId() {
		return smhUserId;
	}

	/**
	 * 
	 * @param smhUserId
	 */
	public void setSmhUserId(String smhUserId) {
		this.smhUserId = getPadded(smhUserId, smhUserIdFilter);
	}

}
