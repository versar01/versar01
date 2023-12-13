package com.eppixcomm.eppix.base.dml;



public class AsrAddServReqDMLFactory extends AsrAddServReqAbstractDMLFactory{
	
private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new AsrAddServReqDMLFactory();
		}
		return dml;
	}	
	
  protected AsrAddServReqDMLFactory(  )
    throws DMLException {
    super(  );
  }
}
