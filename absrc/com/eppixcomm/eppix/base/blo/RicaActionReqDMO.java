package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class RicaActionReqDMO extends DBO implements Serializable {
	// Globals
	private String rarFileId;
	private String rarEppixUserId;
	private String rarRicaAgentId;
	private String rarBillAcNo;
	private String rarMsisdnNo;
	private String rarSimNo;
	private Integer rarSubscriberId;
	private String rarStatus;
	private String rarActionType;
	private DateTime rarSubmitDate;
	private String rarComments;
	private String rarError;
	private String rarTrickleDesc;
	private DateTime rarProcessDate;

	public RicaActionReqDMO() {

	}

	public RicaActionReqDMO(final String rarFileId,
			final String rarEppixUserId,final String rarRicaAgentId,
			final String rarBillAcNo,final String rarMsisdnNo,
			final String rarSimNo,final Integer rarSubscriberId,
			final String rarStatus,final String rarActionType,
			final DateTime rarSubmitDate,final String rarComments,
			final String rarError,final String rarTrickleDesc,
			final DateTime rarProcessDate) {

		this.rarFileId = rarFileId;
		this.rarEppixUserId = rarEppixUserId;
		this.rarRicaAgentId = rarRicaAgentId;
		this.rarBillAcNo = rarBillAcNo;
		this.rarMsisdnNo = rarMsisdnNo;
		this.rarSimNo = rarSimNo;
		this.rarSubscriberId = rarSubscriberId;
		this.rarStatus = rarStatus;
		this.rarActionType = rarActionType;
		this.rarSubmitDate = rarSubmitDate;
		this.rarComments = rarComments;
		this.rarError = rarError;
		this.rarTrickleDesc = rarTrickleDesc;
		this.rarProcessDate = rarProcessDate;
	}

	private static int[] fieldTypes = new int[] {
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATETIME };

	public static final int rarFileIdFilter = 0;
	public static final int rarFileIdSize = 30;

	public static final int rarEppixUserIdFilter = 1;
	public static final int rarEppixUserIdSize = 20;

	public static final int rarRicaAgentIdFilter = 2;
	public static final int rarRicaAgentIdSize = 20;

	public static final int rarBillAcNoFilter = 3;
	public static final int rarBillAcNoSize = 88;

	public static final int rarMsisdnNoFilter = 4;
	public static final int rarMsisdnNoSize = 15;

	public static final int rarSimNoFilter = 5;
	public static final int rarSimNoSize = 14;

	public static final int rarSubscriberIdFilter = 6;

	public static final int rarStatusFilter = 7;
	public static final int rarStatusSize = 1;

	public static final int rarActionTypeFilter = 8;
	public static final int rarActionTypeSize = 5;

	public static final int rarSubmitDateFilter = 9;

	public static final int rarCommentsFilter = 10;
	public static final int rarCommentsSize = 500;

	public static final int rarErrorFilter = 11;
	public static final int rarErrorSize = 500;

	public static final int rarTrickleDescFilter = 12;
	public static final int rarTrickleDescSize = 50;

	public static final int rarProcessDateFilter = 13;
	
	protected void generatedKey(Integer key) {

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
	
	protected DAOArgs primaryKey(  ) {
	    return new DAOArgs( 4 ).arg( ( this.rarFileId == null ) ? null
	                          : this.rarFileId.trim(  ) )
	                           .arg( ( this.rarMsisdnNo == null ) ? null
	                          : this.rarMsisdnNo.trim(  ) )
	                           .arg( ( this.rarActionType == null ) ? null
	      	                  : this.rarActionType.trim(  ) )
	      	                   .arg( ( this.rarSubmitDate == null ) ? null
	      	                  : this.rarSubmitDate);	    
	  }	
	
	protected Object[] get() {
		return new Object[] {
		(rarFileId == null ) ? null : ( ( rarFileId.length(  ) <= rarFileIdSize ) ? rarFileId 
		: rarFileId.substring( 0, rarFileIdSize ) // auto trimmed to fit, if required.
		),

		(rarEppixUserId == null ) ? null : ( ( rarEppixUserId.length(  ) <= rarEppixUserIdSize ) ? rarEppixUserId 
		: rarEppixUserId.substring( 0, rarEppixUserIdSize ) // auto trimmed to fit, if required.
		),	

		(rarRicaAgentId == null ) ? null : ( ( rarRicaAgentId.length(  ) <= rarRicaAgentIdSize ) ? rarRicaAgentId 
		: rarRicaAgentId.substring( 0, rarRicaAgentIdSize ) // auto trimmed to fit, if required.
		),	

		(rarBillAcNo == null ) ? null : ( ( rarBillAcNo.length(  ) <= rarBillAcNoSize ) ? rarBillAcNo 
		: rarBillAcNo.substring( 0, rarBillAcNoSize ) // auto trimmed to fit, if required.
		),	

		(rarMsisdnNo == null ) ? null : ( ( rarMsisdnNo.length(  ) <= rarMsisdnNoSize ) ? rarMsisdnNo 
		: rarMsisdnNo.substring( 0, rarMsisdnNoSize ) // auto trimmed to fit, if required.
		),	

		(rarSimNo == null ) ? null : ( ( rarSimNo.length(  ) <= rarSimNoSize ) ? rarSimNo 
		: rarSimNo.substring( 0, rarSimNoSize ) // auto trimmed to fit, if required.
		),	

		rarSubscriberId,	

		(rarStatus == null ) ? null : ( ( rarStatus.length(  ) <= rarStatusSize ) ? rarStatus 
		: rarStatus.substring( 0, rarStatusSize ) // auto trimmed to fit, if required.
		),	

		(rarActionType == null ) ? null : ( ( rarActionType.length(  ) <= rarActionTypeSize ) ? rarActionType 
		: rarActionType.substring( 0, rarActionTypeSize ) // auto trimmed to fit, if required.
		),	


		(rarSubmitDate == null ) ? null : rarSubmitDate,	

		(rarComments == null ) ? null : ( ( rarComments.length(  ) <= rarCommentsSize ) ? rarComments 
		: rarComments.substring( 0, rarCommentsSize ) // auto trimmed to fit, if required.
		),	

		(rarError == null ) ? null : ( ( rarError.length(  ) <= rarErrorSize ) ? rarError 
		: rarError.substring( 0, rarErrorSize ) // auto trimmed to fit, if required.
		),	

		(rarTrickleDesc == null ) ? null : ( ( rarTrickleDesc.length(  ) <= rarTrickleDescSize ) ? rarTrickleDesc 
		: rarTrickleDesc.substring( 0, rarTrickleDescSize ) // auto trimmed to fit, if required.
		),	

		(rarProcessDate == null ) ? null : rarProcessDate};
		
	} 
	
	protected void set(Object[] fields) {
		this.rarFileId = rtrim( (String) fields[0] );
		this.rarEppixUserId = rtrim( (String) fields[1] );
		this.rarRicaAgentId = rtrim( (String) fields[2]);
		this.rarBillAcNo = rtrim( (String) fields[3] );
		this.rarMsisdnNo = rtrim( (String) fields[4] );
		this.rarSimNo = rtrim( (String) fields[5] );
		this.rarSubscriberId = (Integer) fields[6];
		this.rarStatus = rtrim( (String) fields[7] );
		this.rarActionType = rtrim( (String) fields[8] );
		this.rarSubmitDate = (DateTime) fields[9];
		this.rarComments = rtrim( (String) fields[10] );
		this.rarError = rtrim( (String) fields[11] );
		this.rarTrickleDesc = rtrim( (String) fields[12] );
		this.rarProcessDate = (DateTime) fields[13];
		}

	private static int[] fieldSizes = new int[] { rarFileIdSize,
		rarEppixUserIdSize,rarRicaAgentIdSize,rarBillAcNoSize,rarMsisdnNoSize,
		rarSimNoSize,0,rarStatusSize,rarActionTypeSize,0,rarCommentsSize,
		rarErrorSize,rarTrickleDescSize,0};

	public String getRarFileId() {
		return rarFileId;
	}

	public void setRarFileId(String rarFileId) {
		this.rarFileId = rarFileId;
	}

	public String getRarEppixUserId() {
		return rarEppixUserId;
	}

	public void setRarEppixUserId(String rarEppixUserId) {
		this.rarEppixUserId = rarEppixUserId;
	}

	public String getRarRicaAgentId() {
		return rarRicaAgentId;
	}

	public void setRarRicaAgentId(String rarRicaAgentId) {
		this.rarRicaAgentId = rarRicaAgentId;
	}

	public String getRarBillAcNo() {
		return rarBillAcNo;
	}

	public void setRarBillAcNo(String rarBillAcNo) {
		this.rarBillAcNo = rarBillAcNo;
	}

	public String getRarMsisdnNo() {
		return rarMsisdnNo;
	}

	public void setRarMsisdnNo(String rarMsisdnNo) {
		this.rarMsisdnNo = rarMsisdnNo;
	}

	public String getRarSimNo() {
		return rarSimNo;
	}

	public void setRarSimNo(String rarSimNo) {
		this.rarSimNo = rarSimNo;
	}

	public Integer getRarSubscriberId() {
		return rarSubscriberId;
	}

	public void setRarSubscriberId(Integer rarSubscriberId) {
		this.rarSubscriberId = rarSubscriberId;
	}

	public String getRarStatus() {
		return rarStatus;
	}

	public void setRarStatus(String rarStatus) {
		this.rarStatus = rarStatus;
	}

	public String getRarActionType() {
		return rarActionType;
	}

	public void setRarActionType(String rarActionType) {
		this.rarActionType = rarActionType;
	}

	public DateTime getRarSubmitDate() {
		return rarSubmitDate;
	}

	public void setRarSubmitDate(DateTime rarSubmitDate) {
		this.rarSubmitDate = rarSubmitDate;
	}

	public String getRarComments() {
		return rarComments;
	}

	public void setRarComments(String rarComments) {
		this.rarComments = rarComments;
	}

	public String getRarError() {
		return rarError;
	}

	public void setRarError(String rarError) {
		this.rarError = rarError;
	}

	public String getRarTrickleDesc() {
		return rarTrickleDesc;
	}

	public void setRarTrickleDesc(String rarTrickleDesc) {
		this.rarTrickleDesc = rarTrickleDesc;
	}

	public DateTime getRarProcessDate() {
		return rarProcessDate;
	}

	public void setRarProcessDate(DateTime rarProcessDate) {
		this.rarProcessDate = rarProcessDate;
	}

	public static int[] getFieldTypes() {
		return fieldTypes;
	}

	public static void setFieldTypes(int[] fieldTypes) {
		RicaActionReqDMO.fieldTypes = fieldTypes;
	}

	public static int[] getFieldSizes() {
		return fieldSizes;
	}

	public static void setFieldSizes(int[] fieldSizes) {
		RicaActionReqDMO.fieldSizes = fieldSizes;
	}

	public static int getRarfileidfilter() {
		return rarFileIdFilter;
	}

	public static int getRarfileidsize() {
		return rarFileIdSize;
	}

	public static int getRareppixuseridfilter() {
		return rarEppixUserIdFilter;
	}

	public static int getRareppixuseridsize() {
		return rarEppixUserIdSize;
	}

	public static int getRarricaagentidfilter() {
		return rarRicaAgentIdFilter;
	}

	public static int getRarricaagentidsize() {
		return rarRicaAgentIdSize;
	}

	public static int getRarbillacnofilter() {
		return rarBillAcNoFilter;
	}

	public static int getRarbillacnosize() {
		return rarBillAcNoSize;
	}

	public static int getRarmsisdnnofilter() {
		return rarMsisdnNoFilter;
	}

	public static int getRarmsisdnnosize() {
		return rarMsisdnNoSize;
	}

	public static int getRarsimnofilter() {
		return rarSimNoFilter;
	}

	public static int getRarsimnosize() {
		return rarSimNoSize;
	}

	public static int getRarsubscriberidfilter() {
		return rarSubscriberIdFilter;
	}

	public static int getRarstatusfilter() {
		return rarStatusFilter;
	}

	public static int getRarstatussize() {
		return rarStatusSize;
	}

	public static int getRaractiontypefilter() {
		return rarActionTypeFilter;
	}

	public static int getRaractiontypesize() {
		return rarActionTypeSize;
	}

	public static int getRarsubmitdatefilter() {
		return rarSubmitDateFilter;
	}
	
	public static int getRarcommentsfilter() {
		return rarCommentsFilter;
	}

	public static int getRarcommentssize() {
		return rarCommentsSize;
	}

	public static int getRarerrorfilter() {
		return rarErrorFilter;
	}

	public static int getRarerrorsize() {
		return rarErrorSize;
	}

	public static int getRartrickledescfilter() {
		return rarTrickleDescFilter;
	}

	public static int getRartrickledescsize() {
		return rarTrickleDescSize;
	}

	public static int getRarprocessdatefilter() {
		return rarProcessDateFilter;
	}

}
