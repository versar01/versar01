package com.eppixcomm.eppix.base.dml;




public class SdcDualCallDMLFactory extends SdcDualCallAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SdcDualCallDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SdcDualCallDMLFactory();
		}
		return dml;
	}



}