package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;


public class ApmApnPopMainDMO extends DBO
implements Serializable {

	// Constructors
	public ApmApnPopMainDMO(){
		
	}
	
	public ApmApnPopMainDMO(String apmType, 
	  String apmId,
	  String apmName,
	  String apmBillMethod,
	  String apmMsisdn,
	  String apmAssigned,
	  Date apmActDate,
	  Date apmDeactDate,
	  String apmActive,
	  String apmWdp){
		this.apmType = apmType; 
		this.apmId = apmId;
		this.apmName = apmName; 
		this.apmBillMethod = apmBillMethod;
		this.apmMsisdn = apmMsisdn; 
		this.apmAssigned = apmAssigned;
		this.apmActDate = apmActDate;
		this.apmDeactDate = apmDeactDate;	
		this.apmActive = apmActive; 
		this.apmWdp = apmWdp;		
	}

	  private static final int[] fieldTypes = new int[] {
		  FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING
	    };	

	  private final int[] fieldSizes = new int[] {
			 apmTypeSize, apmIdSize, apmNameSize, apmBillMethodSize ,apmMsisdnSize,
			 apmAssignedSize, 0, 0, apmActiveSize, apmWdpSize,
	  };
	  
	  public static final int apmTypeFilter = 0; // filter index
	  private static final int apmTypeSize = 1; // field size
	  
	  public static final int apmIdFilter = 1; // filter index
	  private static final int apmIdSize = 15; // field size
	  
	  public static final int apmNameFilter = 2; // filter index
	  private static final int apmNameSize = 41; // field size
	  
	  public static final int apmBillMethodFilter = 3; // filter index
	  private static final int apmBillMethodSize = 1; // field size
	  
	  public static final int apmMsisdnFilter = 4; // filter index
	  private static final int apmMsisdnSize = 15; // field size
	  
	  public static final int apmAssignedFilter = 5; // filter index
	  private static final int apmAssignedSize = 1; // field size
	  
	  public static final int apmActDateFilter = 6; // filter index
	  
	  public static final int apmDeactDateFilter = 7; // filter index
	  	  
	  public static final int apmActiveFilter = 8; // filter index
	  private static final int apmActiveSize = 1; // field size
	  
	  public static final int apmWdpFilter = 9; // filter index
	  private static final int apmWdpSize = 8; // field size
	  
	  // all attributes
	  private String apmType; 
	  private String apmId;
	  private String apmName; 
	  private String apmBillMethod;
	  private String apmMsisdn; 
	  private String apmAssigned;
	  private Date apmActDate;
	  private Date apmDeactDate;	
	  private String apmActive; 
	  private String apmWdp;

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
		(apmType == null)? null:(apmType.length() <= apmTypeSize)? apmType:apmType.substring(0, apmTypeSize),
		(apmId == null)? null:(apmId.length() <= apmIdSize)? apmId:apmId.substring(0, apmIdSize),
		(apmName == null)? null:(apmName.length() <= apmNameSize)? apmName:apmName.substring(0, apmNameSize),
		(apmBillMethod == null)? null:(apmBillMethod.length() <= apmBillMethodSize)? apmBillMethod:apmType.substring(0, apmBillMethodSize),
		(apmMsisdn == null)? null:(apmMsisdn.length() <= apmMsisdnSize)? apmMsisdn:apmMsisdn.substring(0, apmMsisdnSize),
		(apmAssigned == null)? null:(apmAssigned.length() <= apmAssignedSize)? apmAssigned:apmAssigned.substring(0, apmAssignedSize),
		(apmActDate == null)? null: new Date(apmActDate),
		(apmDeactDate == null)? null : new Date(apmDeactDate),
		apmActive,
		(apmActive == null)? null:(apmActive.length() <= apmActiveSize)? apmActive:apmActive.substring(0, apmActiveSize),
		(apmWdp == null)? null:(apmWdp.length() <= apmWdpSize)? apmWdp:apmWdp.substring(0, apmWdpSize)
		};
	}
	
	protected void set(final Object[] fields) {
		apmType = rtrim((String)fields[0]);
		apmId = rtrim((String)fields[1]);
		apmName = rtrim((String)fields[2]);
		apmBillMethod = rtrim((String)fields[3]);
		apmMsisdn = rtrim((String)fields[4]);
		apmAssigned = rtrim((String)fields[5]);
		apmActDate = (Date)fields[6];
		apmDeactDate = (Date)fields[7];
		apmActive = rtrim((String)fields[8]);
		apmWdp = rtrim((String)fields[9]);	
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
		return new DAOArgs(1).arg(this.apmId);
	}

	public Date getApmActDate() {
		return apmActDate;
	}

	public void setApmActDate(Date apmActDate) {
		this.apmActDate = apmActDate;
	}

	public String getApmActive() {
		return apmActive;
	}

	public void setApmActive(String apmActive) {
		this.apmActive =  getPadded(apmActive, apmActiveFilter); 
	}

	public String getApmAssigned() {
		return apmAssigned;
	}

	public void setApmAssigned(String apmAssigned) {
		this.apmAssigned = getPadded(apmAssigned, apmAssignedFilter);
		}

	public String getApmBillMethod() {
		return apmBillMethod;
	}

	public void setApmBillMethod(String apmBillMethod) {
		this.apmBillMethod = getPadded(apmBillMethod, apmBillMethodFilter);
	}

	public Date getApmDeactDate() {
		return apmDeactDate;
	}

	public void setApmDeactDate(Date apmDeactDate) {
		this.apmDeactDate = apmDeactDate;
	}

	public String getApmId() {
		return apmId;
	}

	public void setApmId(String apmId) {
		this.apmId = getPadded(apmId, apmIdFilter);
	}

	public String getApmMsisdn() {
		return apmMsisdn;
	}

	public void setApmMsisdn(String apmMsisdn) {
		this.apmMsisdn = getPadded(apmMsisdn, apmMsisdnFilter);
	}

	public String getApmName() {
		return apmName;
	}

	public void setApmName(String apmName) {
		this.apmName = getPadded(apmName, apmNameFilter);
	}

	public String getApmType() {
		return apmType;
	}

	public void setApmType(String apmType) {
		this.apmType = getPadded(apmType, apmTypeFilter);
	}

	public String getApmWdp() {
		return apmWdp;
	}

	public void setApmWdp(String apmWdp) {
		this.apmWdp = getPadded(apmWdp, apmWdpFilter);
	}

	public int[] fieldSizes() {
		return fieldSizes;
	}
}
