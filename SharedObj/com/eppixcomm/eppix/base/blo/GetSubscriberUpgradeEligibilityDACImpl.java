package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PphPayPlanHdrDMO;

public class GetSubscriberUpgradeEligibilityDACImpl  extends DAC implements GetSubscriberUpgradeEligibilityDAC {
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(GetSubscriberUpgradeEligibilityDACImpl.class);
	private Logger logger = thrower.getLogger();
	
	public GetSubscriberUpgradeEligibilityDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public GetSubscriberUpgradeEligibilityDACImpl(DAO dao) {
		super(dao, thrower);
	}

	@Override
	public boolean isMigrationPending(String simNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("isMigrationPending", 1);
		args.arg(simNo);
		
		boolean isMgr = false;
		
		IntegerDMO val = (IntegerDMO) dao.get("isMigrationPending", args);
		
		logger.debug("IS MIGRATTION PENDING: " + val);
		
		if(val == null || val.getIntValue() < 0){
			isMgr = false;
		}else{
			isMgr = true;
		}
		
		return isMgr;
	}

	@Override
	public PphPayPlanHdrDMO getPph(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getPph", 1);
		args.andFilterBy("getPph").arg(accountNo);
		return (PphPayPlanHdrDMO) dao.get("getPph", args);
	}

	@Override
	public CviCrmValueIndDMO getCviScv(Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCviScv", 1);
			args.andFilterBy("getCviScv").arg(subscriberId);
			return (CviCrmValueIndDMO) dao.get("getCviScv", args);
	}
	
	@Override
	public DAOIterator getSbmListAll(String packageCode, String tariffPlan, String crmValue,
			String sbuAccountStatus, Integer sbuContractAge, String sbuMtnStatus, String sbuCustomerType,
			int daysSusp, Integer sbuContractLen, String sbuAgeingBucket) throws EPPIXSeriousException {

		DAOParamQueryArgs args = new DAOParamQueryArgs("getSbmListAll", 10);
		args.andFilterBy("getSbmListAll").arg( packageCode).arg(tariffPlan).arg(crmValue).arg(sbuAccountStatus).arg(sbuContractAge)
		.arg(sbuMtnStatus).arg(sbuCustomerType).arg(sbuContractLen).arg(daysSusp).arg(sbuAgeingBucket);

		return (DAOIterator) dao.iterator("getSbmListAll", args);
	}
}