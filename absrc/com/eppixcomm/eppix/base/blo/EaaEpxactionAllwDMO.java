package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EaaEpxactionAllwDMO extends DBO
implements Serializable {
	
	private String eaaSubsystem;
	private String eaaActionType;
	private String eaaPendDirect;
	private String eaaActProctype;
	
	  public static final int eaaSubsystemFilter = 0; // filter index
	  private static final int eaaSubsystemSize = 5; // field size
	  
	  public static final int eaaActionTypeFilter = 1; // filter index
	  private static final int eaaActionTypeSize = 3; // field size
	  
	  public static final int eaaPendDirectFilter = 2; // filter index
	  private static final int eaaPendDirectSize = 1; // field size
	  
	  public static final int eaaActProctypeFilter = 3; // filter index
	  private static final int eaaActProctypeSize = 1; // field size
	  
	public EaaEpxactionAllwDMO(	final String eaaSubsystem,
	final String eaaActionType,
	final String eaaPendDirect,
	final String eaaActProctype){
		this.eaaActionType = eaaActionType;
		this.eaaSubsystem = eaaSubsystem;
		this.eaaPendDirect = eaaPendDirect;
		this.eaaActProctype = eaaActProctype;
	}
	
	public EaaEpxactionAllwDMO(){
		
	}
	  
	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub		
	}

	  protected Object[] get(  ) {
		    return new Object[] {		    		
		    ( eaaSubsystem == null ) ? null: ( ( eaaSubsystem.length(  ) <= eaaSubsystemSize ) ? eaaSubsystem : eaaSubsystem.substring( 0, eaaSubsystemSize )),
		    ( eaaActionType == null ) ? null : ( ( eaaActionType.length(  ) <= eaaActionTypeSize ) ? eaaActionType : eaaActionType.substring( 0, eaaActionTypeSize )),  
		    ( eaaPendDirect == null ) ? null : ( ( eaaPendDirect.length(  ) <= eaaPendDirectSize ) ? eaaPendDirect: eaaPendDirect.substring( 0, eaaPendDirectSize )),
		    ( eaaActProctype == null ) ? null: ( ( eaaActProctype.length(  ) <= eaaActProctypeSize ) ? eaaActProctype : eaaActProctype.substring( 0, eaaActProctypeSize ))
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
	
	private static final int[] fieldSizes = new int[]{
		eaaActionTypeSize,
		eaaSubsystemSize,
		eaaPendDirectSize,
		eaaActProctypeSize
	};

	  private static final int[] fieldTypes = new int[] {
		  FIELD_TYPE_STRING /* std public attribute: eanActionSeq  */,
		  FIELD_TYPE_STRING /* std public attribute: eanTextSeq  */,
	      FIELD_TYPE_STRING /* std public attribute: eanText  */,
	      FIELD_TYPE_STRING /* std public attribute: eanText  */,
	    };

	protected DAOArgs primaryKey() {
	    return new DAOArgs( 2 )
	    .arg((this.eaaSubsystem == null) ? null : this.eaaSubsystem.trim())
	    .arg((this.eaaActionType == null) ? null : this.eaaActionType.trim());
	}

	protected void set(Object[] fields) {
		eaaSubsystem = rtrim((String) fields[0]);
		eaaActionType = rtrim((String) fields[1]);
		eaaPendDirect = rtrim((String) fields[2]);
		eaaActProctype = rtrim((String) fields[3]);
	}
	
	public String getEaaSubsystem() {
		return eaaSubsystem;
	}

	public void setEaaSubsystem(String eaaSubsystem) {
		this.eaaSubsystem = getPadded(eaaSubsystem, eaaSubsystemFilter);
	}

	public String getEaaActionType() {
		return eaaActionType;
	}

	public void setEaaActionType(String eaaActionType) {
		this.eaaActionType = getPadded(eaaActionType, eaaActionTypeFilter);
	}

	public String getEaaPendDirect() {
		return eaaPendDirect;
	}

	public void setEaaPendDirect(String eaaPendDirect) {
		this.eaaPendDirect = getPadded(eaaPendDirect, eaaPendDirectFilter);
	}

	public String getEaaActProctype() {
		return eaaActProctype;
	}

	public void setEaaActProctype(String eaaActProctype) {
		this.eaaActProctype = getPadded(eaaActProctype, eaaActProctypeFilter);
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

}
