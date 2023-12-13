package com.eppixcomm.eppix.base.dml;




public class SdeServDepositDMLFactory extends SdeServDepositAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SdeServDepositDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SdeServDepositDMLFactory();
		}
		return dml;
	}



}