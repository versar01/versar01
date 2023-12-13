package com.eppixcomm.eppix.base.dml;




public class MsiMsisdnNosDMLFactory  extends MsiMsisdnNosAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected MsiMsisdnNosDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new MsiMsisdnNosDMLFactory();
		}
		return dml;
	}



}