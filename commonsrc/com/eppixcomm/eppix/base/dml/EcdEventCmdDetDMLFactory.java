package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.EcdEventCmdDetAbstractDMLFactory;

public class EcdEventCmdDetDMLFactory extends EcdEventCmdDetAbstractDMLFactory{
	
	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EcdEventCmdDetDMLFactory();
		}
		return dml;
	}	
	
	protected EcdEventCmdDetDMLFactory(  )
	    throws DMLException {
	    super(  );
	}	
	
}
