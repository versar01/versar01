package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.PfhPocSubHistAbstractDMLFactory;



public class PfhPocSubHistDMLFactory extends PfhPocSubHistAbstractDMLFactory{

	private static DMLFactory dml = null;
	
	protected PfhPocSubHistDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new PfhPocSubHistDMLFactory();		
		}
		return dml;
	}

}