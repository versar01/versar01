package com.eppixcomm.eppix.base.dml;



public class FdFieldDefDMLFactory extends FdFieldDefAbstractDMLFactory {
	private static DMLFactory dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new FdFieldDefDMLFactory();
		}
		return dml;
	}
	
	protected FdFieldDefDMLFactory(  )
		    throws DMLException {
		    super(  );
			  
	  }	


}