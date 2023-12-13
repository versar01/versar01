package com.eppixcomm.eppix.base.dml;



public class SfeSimFutEventDMLFactory extends SfeSimFutEventAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SfeSimFutEventDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SfeSimFutEventDMLFactory();
		}
		return dml;
	}  
	

}