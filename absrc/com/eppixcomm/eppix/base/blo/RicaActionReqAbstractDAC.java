package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface RicaActionReqAbstractDAC {
	public void create(RicaActionReqDMO ricaActionReqDMO)
	throws EPPIXSeriousException;

public void modify(RicaActionReqDMO ricaActionReqDMO)
	throws EPPIXSeriousException, EPPIXObjectExpiredException,
	EPPIXObjectNotFoundException;

public void delete(RicaActionReqDMO ricaActionReqDMO)
	throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	EPPIXObjectExpiredException;

public void delete(QueryFilter filter) throws EPPIXSeriousException,
	EPPIXObjectNotFoundException, EPPIXObjectExpiredException;

public void modify(QueryFilter filter) throws EPPIXSeriousException,
	EPPIXObjectExpiredException, EPPIXObjectNotFoundException;

public boolean exists(RicaActionReqDMO ricaActionReqDMO)
	throws EPPIXSeriousException;

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException;
	
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException;
	
	public DAOIterator iterateTrickleDescrarStatusInnerSelect(QueryFilter filter) throws EPPIXSeriousException;
	
	public DAOIterator iterateWithLock(QueryFilter filter)
		throws EPPIXSeriousException;
	
	public RicaActionReqDMO get(QueryFilter filter)
		throws EPPIXSeriousException;
	
	public Object max(QueryFilter filter) throws EPPIXSeriousException;
	
	public Object min(QueryFilter filter) throws EPPIXSeriousException;
	
	public int count(QueryFilter filter) throws EPPIXSeriousException;
}
