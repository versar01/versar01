package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface RicaPersonVerificationAbstractDAC {

	public void create(RicaPersonVerificationDMO ricaPersonVerificationDMO)
			throws EPPIXSeriousException;

	public void modify(RicaPersonVerificationDMO ricaPersonVerificationDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException;

	public void delete(RicaPersonVerificationDMO ricaPersonVerificationDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException;

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException;

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException;

	public boolean exists(RicaPersonVerificationDMO ricaPersonVerificationDMO)
			throws EPPIXSeriousException;

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException;

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException;
	
	public DAOIterator iterateTrickleDescrpvStatusInnerSelect(QueryFilter filter) throws EPPIXSeriousException;

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException;

	public RicaPersonVerificationDMO get(QueryFilter filter)
			throws EPPIXSeriousException;

	public Object max(QueryFilter filter) throws EPPIXSeriousException;

	public Object min(QueryFilter filter) throws EPPIXSeriousException;

	public int count(QueryFilter filter) throws EPPIXSeriousException;

}