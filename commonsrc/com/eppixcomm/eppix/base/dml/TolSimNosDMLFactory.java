package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.TolSimNosAbstractDMLFactory;

public class TolSimNosDMLFactory extends TolSimNosAbstractDMLFactory 

{

	protected TolSimNosDMLFactory() throws DMLException {
		super();

		this.defStaticQuery("getUniqueTolSimByMsisdn", 
				".common.data.StringDMO", 
				"SELECT UNIQUE tol_sim_no " +
				"FROM tol_sim_nos " +
				"WHERE tol_analysis_1 = ? ", 
				false);
	}
	
	

}
