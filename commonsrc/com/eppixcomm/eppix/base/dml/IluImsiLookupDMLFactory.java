package com.eppixcomm.eppix.base.dml;




public class IluImsiLookupDMLFactory extends IluImsiLookupAbstractDMLFactory{
	
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;

	protected IluImsiLookupDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new IluImsiLookupDMLFactory();
		}
		return dml;
	}

}