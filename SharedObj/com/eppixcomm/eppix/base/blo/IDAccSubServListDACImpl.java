package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.soa.sharedservices.blo.AsrSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsdSpcPshDQO;

public class IDAccSubServListDACImpl extends DAC implements IDAccSubServListDAC {
	// Globals
	private static DAOThrower thrower = DAOThrower.getDAOThrower(IDAccSubServListDACImpl.class);
	private Logger logger = thrower.getLogger();

	public IDAccSubServListDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}

	public IDAccSubServListDACImpl(DAO dao) {
		super(dao, thrower);
	}

	@Override
	public VamActiveMsisdnDMO getVamActiveMsisdn(Integer subscriberId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getVamActiveMsisdn", 1);
		args.andFilterBy("getVamActiveMsisdn").arg(subscriberId);
		return (VamActiveMsisdnDMO) dao.get("getVamActiveMsisdn", args);
	}

	@Override
	public DAOIterator getPsdPshSpc(Integer subscriberId, String simNo, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getPsdPshSpc", 3);
		args.andFilterBy("getPsdPshSpc").arg(subscriberId).arg(simNo).arg(serviceCode);
		return (DAOIterator) dao.iterator("getPsdPshSpc", args);
	}

	@Override
	public DAOIterator getAsrSpcSpv(Integer subscriberId, String serviceCode) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getAsrSpcSpv", 2);
		args.andFilterBy("getAsrSpcSpv").arg(subscriberId).arg(serviceCode);
		return (DAOIterator) dao.iterator("getAsrSpcSpv", args);
	}

	
}
