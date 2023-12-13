package com.eppixcomm.eppix.base.dml;




public class RcReasonCodeDMLFactory extends RcReasonCodeAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected RcReasonCodeDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new RcReasonCodeDMLFactory();
		}
		return dml;
	}



}