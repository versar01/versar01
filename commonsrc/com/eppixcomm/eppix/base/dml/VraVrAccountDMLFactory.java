package com.eppixcomm.eppix.base.dml;




public class VraVrAccountDMLFactory extends VraVrAccountAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected VraVrAccountDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VraVrAccountDMLFactory();
		}
		return dml;
	}



}