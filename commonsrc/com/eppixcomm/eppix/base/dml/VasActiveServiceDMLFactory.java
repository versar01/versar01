package com.eppixcomm.eppix.base.dml;



public class VasActiveServiceDMLFactory extends VasActiveServiceAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected VasActiveServiceDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VasActiveServiceDMLFactory();
		}
		return dml;
	}  
}