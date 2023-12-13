package com.eppixcomm.eppix.base.dml;



public class SpvParamValuesDMLFactory extends SpvParamValuesAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SpvParamValuesDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SpvParamValuesDMLFactory();
		}
		return dml;
	}  

}