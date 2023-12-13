package com.eppixcomm.eppix.base.dml;



public class PfsPocFldrSubsDMLFactory extends PfsPocFldrSubsAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected PfsPocFldrSubsDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PfsPocFldrSubsDMLFactory();
		}
		return dml;
	}  
}