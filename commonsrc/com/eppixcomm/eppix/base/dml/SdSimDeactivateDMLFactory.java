package com.eppixcomm.eppix.base.dml;



public class SdSimDeactivateDMLFactory extends SdSimDeactivateAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SdSimDeactivateDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SdSimDeactivateDMLFactory();
		}
		return dml;
	}  
	
}