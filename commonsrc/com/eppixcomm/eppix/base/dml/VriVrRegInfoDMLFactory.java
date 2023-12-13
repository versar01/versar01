package com.eppixcomm.eppix.base.dml;




public class VriVrRegInfoDMLFactory extends VriVrRegInfoAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected VriVrRegInfoDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VriVrRegInfoDMLFactory();
		}
		return dml;
	}



}