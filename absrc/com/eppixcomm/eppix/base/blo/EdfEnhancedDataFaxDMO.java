/**
 * 
 */
package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

/**
 * @author Mahant_S
 *
 */
public class EdfEnhancedDataFaxDMO extends DBO
implements Serializable{

	private String edfPrimarySim;
	private String edfMsisdn;
	private DateTime edfTimestamp;
	
	public static final int edfPrimarySimFilter = 0;
	public static final int edfPrimarySimSize = 14;

	public static final int edfMsisdnFilter = 1;
	public static final int edfMsisdnSize = 9;

	public static final int edfTimestampFilter = 2;
	
	public EdfEnhancedDataFaxDMO(){
		
	}

	public EdfEnhancedDataFaxDMO(final String edfPrimarySim,
			final String edfMsisdn,
			final DateTime edfTimestamp){
		this.edfPrimarySim = edfPrimarySim;
		this.edfMsisdn = edfMsisdn;
		this.edfTimestamp = edfTimestamp;
	}
	
	private static final int[] fieldSizes = new int[]{
		edfPrimarySimSize,
		edfMsisdnSize,
		0
	};	
	
	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_DATETIME
	};
	
	/* (non-Javadoc)
	 * @see com.eppixcomm.eppix.common.data.DBO#get()
	 */
	
	protected Object[] get() {
		return new Object[]{
			((this.edfPrimarySim == null) ? null : (this.edfPrimarySim.length() <= edfPrimarySimSize) ? this.edfPrimarySim : this.edfPrimarySim.substring(0, this.edfPrimarySimSize)),
			((this.edfMsisdn == null) ? null : (this.edfMsisdn.length() <= edfMsisdnSize) ? this.edfMsisdn : this.edfMsisdn.substring(0, this.edfMsisdnSize)),
			this.edfTimestamp
		};
	}
	
	/* (non-Javadoc)
	 * @see com.eppixcomm.eppix.common.data.DBO#generatedKey(java.lang.Integer)
	 */
	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.eppixcomm.eppix.common.data.DBO#versionNumber()
	 */
	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.eppixcomm.eppix.common.data.DBO#versionNumber(java.lang.Integer)
	 */
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
//	    return new DAOArgs( 1 ).arg( ( this.edfPrimarySim == null ) ? null
//                : this.edfPrimarySim);
		return null;
	}
	
	protected void set(Object[] fields) {
		this.edfPrimarySim = rtrim((String)fields[0]);
		this.edfMsisdn = rtrim((String)fields[1]);
		this.edfTimestamp = ((fields[2] == null) ? null : new DateTime((DateTime)fields[2]));	
	}
	
	public void set(final String edfPrimarySim,
			final String edfMsisdn,
			final DateTime edfTimestamp){
		this.edfPrimarySim = edfPrimarySim;
		this.edfMsisdn = edfMsisdn;
		this.edfTimestamp = edfTimestamp;
	}

	public String getEdfPrimarySim() {
		return edfPrimarySim;
	}

	public void setEdfPrimarySim(String edfPrimarySim) {
		this.edfPrimarySim = edfPrimarySim;
	}

	public String getEdfMsisdn() {
		return edfMsisdn;
	}

	public void setEdfMsisdn(String edfMsisdn) {
		this.edfMsisdn = edfMsisdn;
	}

	public DateTime getEdfTimestamp() {
		return edfTimestamp;
	}

	public void setEdfTimestamp(DateTime edfTimestamp) {
		this.edfTimestamp = edfTimestamp;
	}

}
