package com.eppixcomm.eppix.base.blo;

import java.util.List;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class EcdEventCmdDetDACImpl extends EcdEventCmdDetAbstractDACImpl implements EcdEventCmdDetDAC{

	public EcdEventCmdDetDACImpl(DAO dao){
		super(dao);
	}
	
	
//	protected EcdEventCmdDetDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
//		super(thrower, dao, defaultLanguageCode);
//		// TODO Auto-generated constructor stub
//	}
//	
//	protected EcdEventCmdDetDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
//		super(thrower, dao, defaultLanguageCode);
//		// TODO Auto-generated constructor stub
//	}	
//
//	public void create(List details) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public int count(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public void create(EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void delete(EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException, EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void delete(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public boolean exists(EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public EcdEventCmdDetDMO get(EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public EcdEventCmdDetDMO get(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public DTOList getList(DTOListState state, EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public DAOIterator iterateWithLock(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public EcdEventCmdDetDMO lock(EcdEventCmdDetDMO aEcdEventCmdDetDMO) throws EPPIXSeriousException, EPPIXObjectBusyException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object max(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object min(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void modify(EcdEventCmdDetDMO ecdEventCmdDetDMO) throws EPPIXSeriousException, EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void modify(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}
}
