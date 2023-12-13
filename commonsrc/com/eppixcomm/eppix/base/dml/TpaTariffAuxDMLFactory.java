package com.eppixcomm.eppix.base.dml;




public class TpaTariffAuxDMLFactory extends TpaTariffAuxAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected TpaTariffAuxDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new TpaTariffAuxDMLFactory();
		}
		return dml;
	}



}