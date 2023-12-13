package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;

public class GetCrbChargesDACImpl extends DAC implements GetCrbChargesDAC{
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(EppixDeviceInsPlatformDACImpl.class);
	private Logger logger = thrower.getLogger();

	public GetCrbChargesDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public GetCrbChargesDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public StringDMO getVatPercentageByCode(String vatCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getVatPercentageByCode", 1);
		args.andFilterBy("getVatPercentageByCode").arg(vatCode);
		return (StringDMO) dao.get("getVatPercentageByCode", args);
	}

}
