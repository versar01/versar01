package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SeqMapN2NDMO   extends DBO
implements Serializable {
	
	  // Field declarations
	  //---------------------
	  // all attributes
	  private String seqProviderId; 
      private String seqN2ntransId; 
	  private String seqNetwktransId;
	  private String seqStatus;	
	  private DateTime seqDatetime;
	  
	  // Constructor - taking public attributes
	  public SeqMapN2NDMO(){
		  
	  }
	  
	  public SeqMapN2NDMO(String seqProviderId,
	  String seqN2ntransId,
	  String seqNetwktransId,
	  String seqStatus,
	  DateTime seqDatetime){
		  this.setSeqProviderId(seqProviderId);
		  this.setSeqN2ntransId(seqN2ntransId);
		  this.setSeqNetwktransId(seqNetwktransId);
		  this.setSeqStatus(seqStatus);
		  this.setSeqDatetime((seqDatetime == null)? new DateTime() : seqDatetime);
	  }
	  
	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING /* std public attribute: seq_provider_id  */,
	      FIELD_TYPE_STRING /* std public attribute: seq_n2ntrans_id  */,
	      FIELD_TYPE_STRING /* std public attribute: seq_netwktrans_id  */,
	      FIELD_TYPE_STRING /* std public attribute: seq_status  */,
	      FIELD_TYPE_DATETIME /* std public attribute: seq_datetime  */
	      
	    };
	  
	  private final int[] fieldSizes = new int[] {
			  seqProviderIdSize,
			  seqN2ntransIdSize,
			  seqNetwktransIdSize,
			  seqStatusSize,
			  0
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  

	  public static final int seqProviderIdFilter = 0; // filter index
	  private static final int seqProviderIdSize = 5; // field size

	  public static final int seqN2ntransIdFilter = 1; // filter index
	  private static final int seqN2ntransIdSize = 10; // field size

	  public static final int seqNetwktransIdFilter = 2; // filter index
	  private static final int seqNetwktransIdSize = 10; // field size
	  
	  public static final int seqStatusFilter = 3; // filter index
	  private static final int seqStatusSize = 5; // field size
	  
	  public static final int seqDatetimeFilter = 4; // filter index
	  
	  
public void generatedKey(Integer key) {
}

public Object[] get() {
	return new Object[] {
		      (seqProviderId == null)?null : (seqProviderId.length() <= seqProviderIdSize)? seqProviderId: 
		    	  seqProviderId.substring(0, seqProviderIdSize),
		    	  
		      (seqN2ntransId == null)?null : (seqN2ntransId.length() <= seqN2ntransIdSize)? seqN2ntransId: 
		    	  seqN2ntransId.substring(0, seqN2ntransIdSize), 
		    	  
		      (seqNetwktransId == null)?null : (seqNetwktransId.length() <= seqNetwktransIdSize)? seqNetwktransId: 
		    	  seqNetwktransId.substring(0, seqNetwktransIdSize),
		    	  
		      (seqStatus == null)?null : (seqStatus.length() <= seqStatusSize)? seqStatus: 
		    	  seqStatus.substring(0, seqStatusSize),		    	  
				    		  
    		  (seqDatetime == null ) ? null : new DateTime(seqDatetime)			    		  
		    };
}

public Integer versionNumber() {
	// TODO Auto-generated method stub
	return null;
}

public void versionNumber(Integer versionNumber) {
	// TODO Auto-generated method stub
	
}

public int[] fieldTypes() {
	return fieldTypes;
}

public DAOArgs primaryKey() {
    return new DAOArgs( 3 ).arg( ( this.seqProviderId == null ) ? null
            : this.seqProviderId.trim(  ) )
            .arg( ( this.seqN2ntransId == null ) ? null
            : this.seqN2ntransId.trim())
            .arg((seqNetwktransId == null) ? null 
            : this.seqNetwktransId.trim());
}

public void set(Object[] fields) {
	  seqProviderId = rtrim((String)fields[0]); 
      seqN2ntransId = rtrim((String)fields[1]); 
	  seqNetwktransId = rtrim((String)fields[2]);
	  seqStatus = rtrim((String)fields[3]);	
	  seqDatetime = (DateTime)fields[4];	  
}

/**
 * Setter that takes all attributes
 */
public void set( 
  final String seqProviderId,
  final String   seqN2ntransId,
  final String  seqNetwktransId,
  final String seqStatus,
  final DateTime seqDatetime) {
	  this.setSeqProviderId(seqProviderId);
	  this.setSeqN2ntransId(seqN2ntransId);
	  this.setSeqNetwktransId(seqNetwktransId);
	  this.setSeqStatus(seqStatus);
	  this.setSeqDatetime((seqDatetime == null)? new DateTime() : seqDatetime);
}

public String getSeqProviderId() {
	return seqProviderId;
}

public void setSeqProviderId(String seqProviderId) {
	this.seqProviderId = getPadded(seqProviderId, seqProviderIdFilter);
}

public String getSeqN2ntransId() {
	return seqN2ntransId;
}

public void setSeqN2ntransId(String seqN2ntransId) {
	this.seqN2ntransId = getPadded(seqN2ntransId, seqN2ntransIdFilter);
}

public String getSeqNetwktransId() {
	return seqNetwktransId;
}

public void setSeqNetwktransId(String seqNetwktransId) {
	this.seqNetwktransId = getPadded(seqNetwktransId, seqNetwktransIdFilter);
}

public String getSeqStatus() {
	return seqStatus;
}

public void setSeqStatus(String seqStatus) {
	this.seqStatus = getPadded(seqStatus, seqStatusFilter);
}

public DateTime getSeqDatetime() {
	return seqDatetime;
}

public void setSeqDatetime(DateTime seqDatetime) {
	this.seqDatetime = seqDatetime;
}
	
}
