package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.soa.sharedservices.blo.AsrSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsdSpcPshDQO;

public interface IDAccSubServListDAC {
	
	public VamActiveMsisdnDMO getVamActiveMsisdn(Integer subscriberId)throws EPPIXSeriousException;
	
	public DAOIterator getPsdPshSpc(Integer subscriberId, String simNo, String serviceCode)throws EPPIXSeriousException;
	
	public DAOIterator getAsrSpcSpv(Integer subscriberId, String serviceCode)throws EPPIXSeriousException;

}
