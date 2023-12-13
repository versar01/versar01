package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.EdEventDependsAbstractDMLFactory;

public class EdEventDependsDMLFactory extends EdEventDependsAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EdEventDependsDMLFactory();
		}
		return dml;
	}	
	
  protected EdEventDependsDMLFactory(  )
    throws DMLException {
    super(  );
  }		
}
