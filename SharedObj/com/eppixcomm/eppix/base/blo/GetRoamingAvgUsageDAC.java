package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.Date;

public interface GetRoamingAvgUsageDAC {

	public DAOIterator getAuxSbdVamByRsaId(String rsaId, Date fromDate)throws EPPIXSeriousException;
	
	public DAOIterator getAuxSbdVamByPassPort(String passport, Date fromDate)throws EPPIXSeriousException;
}
