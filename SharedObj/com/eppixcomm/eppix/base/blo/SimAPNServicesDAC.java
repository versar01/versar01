package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;

public interface SimAPNServicesDAC {
	
	public DAOIterator getAsrBySubscriberSim(Integer subscriberId, String sim)throws EPPIXSeriousException;
	
	public ScSerialCustomerDMO getSerialCustomer(String billAccount)
			throws EPPIXSeriousException;

	public DAOIterator getEppixHierarchyByType(Integer ehIdentity, Integer ehLink) throws EPPIXSeriousException;

	public EhEppixHierarchyDMO getEppixHierarchyBySerial(Integer ehSerial)
			throws EPPIXSeriousException;
	
	public EhHhDQO getMasterEhHh(Integer scSerial, String parentType)
			throws EPPIXSeriousException;

	public EhHhDQO getMasterLinkEhHh(Integer ehLink, String parentType)
			throws EPPIXSeriousException;
	
	public HhHierarchyHeadDMO getPartnerIdLinkHhEh(String partnerId)throws EPPIXSeriousException;	
	
	public StringDMO getSmhHistory(Integer subscriberId, String simNo)throws EPPIXSeriousException;
	
	}
