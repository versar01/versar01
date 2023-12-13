package com.eppixcomm.eppix.base.dml;



public class SsrServiceReqDMLFactory extends SsrServiceReqAbstractDMLFactory{

	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected SsrServiceReqDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SsrServiceReqDMLFactory();
		}
		return dml;
	}  



}