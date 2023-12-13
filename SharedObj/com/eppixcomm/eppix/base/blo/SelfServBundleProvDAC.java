package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsVsrVstDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VamSbdDQO;

public interface SelfServBundleProvDAC {

	
	public VamSbdDQO getVamSbd(String msisdn)throws EPPIXSeriousException;
	
	public TsSpcSpvDQO getTsSpcSpv(String packageCode, String tariffPlan, String netServCode)throws EPPIXSeriousException;
	
	public TsVsrVstDQO getTsVsrVst(String packageCode, String tariffPlan, String netServCode)throws EPPIXSeriousException;
	
	public PshPsdDQO getPshPsd(Integer subscriberid, String netServCode, String psdParamValue)throws EPPIXSeriousException;
	
	public IntegerDMO checkEarlyTermQuoteExists(Integer subscriberId, String msisdn)throws EPPIXSeriousException;
	
}
