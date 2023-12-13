package com.eppixcomm.eppix.base.dml;



public class ActivationPendDMLFactory extends ActivationPendAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	protected ActivationPendDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new ActivationPendDMLFactory();
		}
		return dml;
	}	

}