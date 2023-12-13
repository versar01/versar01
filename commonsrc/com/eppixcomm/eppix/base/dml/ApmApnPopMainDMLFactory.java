package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.ApmApnPopMainAbstractDMLFactory;

public class ApmApnPopMainDMLFactory extends ApmApnPopMainAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new ApmApnPopMainDMLFactory();
		}
		return dml;
	}	
	
  protected ApmApnPopMainDMLFactory(  )
    throws DMLException {
    super(  );
  }
}
