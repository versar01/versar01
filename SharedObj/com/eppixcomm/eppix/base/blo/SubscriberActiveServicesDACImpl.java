package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;

public class SubscriberActiveServicesDACImpl extends DAC implements
		SubscriberActiveServicesDAC {
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(SubscriberActiveServicesDACImpl.class);
	private Logger logger = thrower.getLogger();

	public SubscriberActiveServicesDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SubscriberActiveServicesDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}

	public StringDMO getLastInvoiceDate(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getLastInvoiceDate", 1);
		args.andFilterBy("getLastInvoiceDate").arg(accountNo);
		return (StringDMO) dao.get("getLastInvoiceDate", args);
	}
	
	public boolean isConverged(Integer subscriberId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"isConverged", 1);
		args.andFilterBy("isConverged").arg(subscriberId);
		BlhBillLimitHdDMO dmo = null;
		dmo = (BlhBillLimitHdDMO) dao.get("isConverged", args);
		
		if(dmo == null){
			return false;
		}else{
			return true;
		}
	}

	public IntegerDMO getCountDepositRule(String packagecode, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getCountDepositRule", 2);
		args.andFilterBy("getCountDepositRule").arg(packagecode).arg(serviceCode);
		return (IntegerDMO) dao.get("getCountDepositRule", args);
	}
}
