package com.eppixcomm.eppix.base.dml;



public class VcfVrbleChrgFeeDMLFactory extends VcfVrbleChrgFeeAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VcfVrbleChrgFeeDMLFactory();
		}
		return dml;
	}  
	
	  protected VcfVrbleChrgFeeDMLFactory(  )
	    throws DMLException {
		  super();
	  }


}