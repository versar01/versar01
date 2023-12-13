package com.eppixcomm.eppix.base.dml;



public class FntNetTransPendDMLFactory extends FntNetTransPendAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected FntNetTransPendDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new FntNetTransPendDMLFactory();
		}
		return dml;
	}  

}