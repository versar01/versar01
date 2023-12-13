package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;

public class SimAPNServicesDACImpl extends DAC implements SimAPNServicesDAC{
	// Globals
		private static DAOThrower thrower = DAOThrower
				.getDAOThrower(GetServiceDiscountDACImpl.class);
		private Logger logger = thrower.getLogger();
		
	public SimAPNServicesDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	
	public SimAPNServicesDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}


	public DAOIterator getAsrBySubscriberSim(Integer subscriberId,
			String sim) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getAsrBySubscriberSim", 2);
		args.andFilterBy("getAsrBySubscriberSim").arg(subscriberId).arg(sim);
		return (DAOIterator) dao.iterator("getAsrBySubscriberSim", args);
	}
	
	public ScSerialCustomerDMO getSerialCustomer(String billAccount)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSerialCustomer", 1);
		args.andFilterBy("getSerialCustomer").arg(billAccount);
		return (ScSerialCustomerDMO) dao.get("getSerialCustomer", args);
	}
	
	public DAOIterator getEppixHierarchyByType(Integer ehIdentity, Integer ehLink) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getEppixHierarchyByType", 2);
		args.andFilterBy("getEppixHierarchyByType").arg(ehIdentity).arg(ehLink);
		return (DAOIterator) dao.iterator("getEppixHierarchyByType", args);
	}
	
	public EhEppixHierarchyDMO getEppixHierarchyBySerial(Integer ehSerial)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getEppixHierarchyBySerial", 1);
		args.andFilterBy("getEppixHierarchyBySerial").arg(ehSerial);
		return (EhEppixHierarchyDMO) dao.get("getEppixHierarchyBySerial", args);
	}
	
	public EhHhDQO getMasterEhHh(Integer scSerial, String parentType)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getMasterEhHh", 3);
		args.andFilterBy("getMasterEhHh").arg(scSerial).arg(parentType)
				.arg(parentType);
		return (EhHhDQO) dao.get("getMasterEhHh", args);
	}

	public EhHhDQO getMasterLinkEhHh(Integer ehLink, String parentType)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getMasterLinkEhHh", 3);
		args.andFilterBy("getMasterLinkEhHh").arg(ehLink).arg(parentType)
				.arg(parentType);
		return (EhHhDQO) dao.get("getMasterLinkEhHh", args);
	}


	public HhHierarchyHeadDMO getPartnerIdLinkHhEh(String partnerId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getPartnerIdLinkHhEh", 1);
		args.andFilterBy("getPartnerIdLinkHhEh").arg(partnerId);
		return (HhHierarchyHeadDMO) dao.get("getPartnerIdLinkHhEh", args);	
		}


	public StringDMO getSmhHistory(Integer subscriberId, String simNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSmhHistory", 2);
		args.andFilterBy("getSmhHistory").arg(subscriberId).arg(simNo);
		return (StringDMO) dao.get("getSmhHistory", args);
	}
	
}
