package com.eppixcomm.eppix.base.dml;




public class VrtVrTrackingDMLFactory extends VrtVrRrackingAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected VrtVrTrackingDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}


	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VrtVrTrackingDMLFactory();
		}
		return dml;
	}


}