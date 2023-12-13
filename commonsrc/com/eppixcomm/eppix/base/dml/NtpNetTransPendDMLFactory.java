package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.NtpNetTransPendAbstractDMLFactory;

public class NtpNetTransPendDMLFactory extends NtpNetTransPendAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new NtpNetTransPendDMLFactory();
		}
		return dml;
	}	
	
	protected NtpNetTransPendDMLFactory(  )
	    throws DMLException {
	    super(  );
	}	
}
