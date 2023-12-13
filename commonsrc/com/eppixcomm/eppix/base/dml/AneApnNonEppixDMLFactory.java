package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.AneApnNonEppixAbstractDMLFactory;

public class AneApnNonEppixDMLFactory extends AneApnNonEppixAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new AneApnNonEppixDMLFactory();
		}
		return dml;
	}	
	
  protected AneApnNonEppixDMLFactory(  )
    throws DMLException {
    super(  );
  }
}

