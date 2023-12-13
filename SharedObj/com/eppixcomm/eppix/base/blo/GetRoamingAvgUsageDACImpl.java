package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class GetRoamingAvgUsageDACImpl extends DAC implements GetRoamingAvgUsageDAC {
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(GetRoamingAvgUsageDACImpl.class);
	private Logger logger = thrower.getLogger();

	public GetRoamingAvgUsageDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public GetRoamingAvgUsageDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public DAOIterator getAuxSbdVamByRsaId(String rsaId, Date fromDate)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getAuxSbdVamByRsaId", 2);
		args.andFilterBy("getAuxSbdVamByRsaId").arg(rsaId).arg(fromDate);
		return (DAOIterator) dao.iterator("getAuxSbdVamByRsaId", args);
	}

	public DAOIterator getAuxSbdVamByPassPort(String passport, Date fromDate)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getAuxSbdVamByPassPort", 2);
		args.andFilterBy("getAuxSbdVamByPassPort").arg(passport).arg(fromDate);
		return (DAOIterator) dao.iterator("getAuxSbdVamByPassPort", args);
	}

}
