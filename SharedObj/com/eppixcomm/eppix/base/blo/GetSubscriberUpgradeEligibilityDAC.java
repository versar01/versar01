package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PphPayPlanHdrDMO;

public interface GetSubscriberUpgradeEligibilityDAC{


	public boolean isMigrationPending(String simNo) throws EPPIXSeriousException;

	public PphPayPlanHdrDMO getPph(String accountNo) throws EPPIXSeriousException;
	
	public CviCrmValueIndDMO getCviScv(Integer subscriberId) throws EPPIXSeriousException;

	public DAOIterator getSbmListAll(String packageCode, String tariffPlan, 
			String crmValue, String sbuAccountStatus,Integer sbuContractAge, String sbuMtnStatus,
			String sbuCustomerType,int daysSusp,Integer sbuContractLen,String sbuAgeingBucket)throws EPPIXSeriousException;
}