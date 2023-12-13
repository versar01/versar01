package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.AudAddressAbstractDMLFactory;

public class AudAddressDMLFactory extends AudAddressAbstractDMLFactory{

private static DMLFactory dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new AudAddressDMLFactory();
		}
		return dml;
	}	
	
  protected AudAddressDMLFactory(  )
    throws DMLException {
    super(  );
  }
}
