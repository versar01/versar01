package com.eppixcomm.eppix.base.dml;




public class NttNtwrkTrfTypeDMLFactory extends NttNtwrkTrfTypeAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected NttNtwrkTrfTypeDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new NttNtwrkTrfTypeDMLFactory();
		}
		return dml;
	}


}