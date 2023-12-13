package com.eppixcomm.eppix.base.dml;




public class VrrVrRecurringDMLFactory extends VrrVrRecurringAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected VrrVrRecurringDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VrrVrRecurringDMLFactory();
		}
		return dml;
	}



}