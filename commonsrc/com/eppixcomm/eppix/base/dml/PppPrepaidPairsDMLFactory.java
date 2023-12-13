package com.eppixcomm.eppix.base.dml;




public class PppPrepaidPairsDMLFactory  extends PppPrepaidPairsAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected PppPrepaidPairsDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PppPrepaidPairsDMLFactory();
		}
		return dml;
	
	}


}