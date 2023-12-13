package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.DateTime;

public class EppixSOASiebelPublishDMO extends DMO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customer;
	private DateTime timeStamp;
	
	  private static int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_DATETIME
	    };
	  
	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int customerFilter = 0; // filter index
	  private static final int customerSize = 20; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int timeStampFilter = 1; // filter index

	  private final int[] fieldSizes = new int[] {
			  customerSize,0
	  };
	  
	  public EppixSOASiebelPublishDMO(){
		  
	  }
	  
	  public EppixSOASiebelPublishDMO(final String customer, final DateTime timeStamp){
		  this.customer = customer;
		  this.timeStamp = timeStamp;
	  }

	protected DAOArgs primaryKey() {
		return null;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected void set(Object[] fields) {
		customer = rtrim( (String) fields[0] );
		timeStamp = (DateTime) fields[1];
	}
	
	protected Object[] get(  ) {
		    return new Object[] {
		    		( customer == null ) ? null
	                          : ( ( customer.length(  ) <= customerSize ) ? customer
	                                                                    : customer
	      .substring( 0, customerSize ) // auto trimmed to fit, if required.
	       ),
	       timeStamp
		    };
	}
	
	public void set(final String customer, final DateTime timeStamp){
		  this.customer = customer;
		  this.timeStamp = timeStamp;
	  }

	protected int[] fieldSizes() {
		 return fieldSizes;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public DateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(DateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

}
