package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;



public class HmHandsetManuDMO extends DBO
implements Serializable {
	private String hmManuId;
	private String hmDescription;
	
	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING
	    };

	  protected static final int hmManuIdFilter = 0;
	  protected static final int hmManuIdSize = 5;

	  protected static final int hmDescriptionFilter = 1;
	  protected static final int hmDescriptionSize = 15;
	  
	  protected final int[] fieldSizes = new int[]{
			hmManuIdSize,
			hmDescriptionSize		  
	  };
	  
	 public HmHandsetManuDMO(){
		 
	 }
	 
	 public HmHandsetManuDMO(String hmManuId, String hmDescription){
		 this.setHmManuId(hmManuId);
		 this.setHmDescription(hmDescription);
	 }

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
	}

	protected Object[] get() {
		 return new Object[] {
			      ( hmManuId == null ) ? null
			                            : ( ( hmManuId.length(  ) <= hmManuIdSize )
			      ? hmManuId
			      : hmManuId.substring( 0, hmManuIdSize ) // auto trimmed to fit, if required.
			       ),
			      ( hmDescription == null ) ? null
			                            : ( ( hmDescription.length(  ) <= hmDescriptionSize )
			      ? hmDescription
			      : hmDescription.substring( 0, hmDescriptionSize ) // auto trimmed to fit, if required.
			       )
		 };
	}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub
		
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

	protected void set(final Object[] fields) {
		this.hmManuId = rtrim((String)fields[0]);
		this.hmDescription = rtrim((String) fields[1]);
	}

	public String getHmManuId() {
		return hmManuId;
	}

	public void setHmManuId(String hmManuId) {
		this.hmManuId = getPadded(hmManuId, hmManuIdFilter);
	}

	public String getHmDescription() {
		return hmDescription;
	}

	public void setHmDescription(String hmDescription) {
		this.hmDescription = getPadded(hmDescription, hmDescriptionFilter);
	}



}