package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsVsrVstDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VamSbdDQO;

public class SelfServBundleProvDACImpl extends DAC implements
		SelfServBundleProvDAC {
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(SelfServBundleProvDACImpl.class);
	private Logger logger = thrower.getLogger();

	public SelfServBundleProvDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SelfServBundleProvDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}

	@Override
	public VamSbdDQO getVamSbd(String msisdn) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		DAOParamQueryArgs args = new DAOParamQueryArgs("getVamSbd", 1);
		args.andFilterBy("getVamSbd").arg(msisdn);
		return (VamSbdDQO) dao.get("getVamSbd", args);
	}

	@Override
	public TsSpcSpvDQO getTsSpcSpv(String packageCode, String tariffPlan, String netServCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getTsSpcSpv", 3);
		args.andFilterBy("getTsSpcSpv").arg(packageCode).arg(tariffPlan).arg(netServCode);
		return (TsSpcSpvDQO) dao.get("getTsSpcSpv", args);
	}

	@Override
	public TsVsrVstDQO getTsVsrVst(String packageCode, String tariffPlan, String netServCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getTsVsrVst", 3);
		args.andFilterBy("getTsVsrVst").arg(packageCode).arg(tariffPlan).arg(netServCode);
		return (TsVsrVstDQO) dao.get("getTsVsrVst", args);
	}

	@Override
	public PshPsdDQO getPshPsd(Integer subscriberid, String netServCode, String psdParamValue) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getPshPsd", 3);
		args.andFilterBy("getPshPsd").arg(subscriberid).arg(netServCode).arg(psdParamValue);
		return (PshPsdDQO) dao.get("getPshPsd", args);
	}

	@Override
	public IntegerDMO checkEarlyTermQuoteExists(Integer subscriberId, String msisdn) throws EPPIXSeriousException{
		DAOParamQueryArgs args = new DAOParamQueryArgs("checkEarlyTermQuoteExists", 2);
		args.andFilterBy("checkEarlyTermQuoteExists").arg(subscriberId).arg(msisdn);
		
		return (IntegerDMO) dao.get("checkEarlyTermQuoteExists", args);
	}

}
