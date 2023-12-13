package com.eppixcomm.eppix.base.dml;



public class SulSubUseLimitDMLFactory extends SulSubUseLimitAbstractDMLFactory{


	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SulSubUseLimitDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SulSubUseLimitDMLFactory();
		}
		return dml;
	}  


}