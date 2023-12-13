package com.eppixcomm.eppix.base.dml;



public class EmqMessageQueDMLFactory extends EmqMessageQueAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	protected EmqMessageQueDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EmqMessageQueDMLFactory();
		}
		return dml;
	}

}