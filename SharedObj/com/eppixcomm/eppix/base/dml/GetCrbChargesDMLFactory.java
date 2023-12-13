package com.eppixcomm.eppix.base.dml;

public class GetCrbChargesDMLFactory extends BaseDMLFactory{

	private static GetCrbChargesDML dml = null;
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new GetCrbChargesDML();
		}
		return dml;
	}
	
	protected GetCrbChargesDMLFactory() throws DMLException {
		super();
		
		defStaticQuery("getVatPercentageByCode", ".common.data.StringDMO",
				"SELECT percentage " + "FROM cevatm " + "WHERE vat_code = ? ",
				false);
		
	}

}
