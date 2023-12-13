package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class UdaUserDefActAbstractDACImpl extends DAC implements UdaUserDefActAbstractDAC{
	static DAOThrower thrower = DAOThrower.getDAOThrower( SdrServDepoRuleAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	protected UdaUserDefActAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}
	
	protected UdaUserDefActAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(UdaUserDefActDMO udaUserDefActDMO)
			throws EPPIXSeriousException {
		logger.debug("create( udaUserDefActDMO )");
		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);

		dao.insert(udaUserDefActDMO);	
	}

	public void delete(UdaUserDefActDMO udaUserDefActDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( UdaUserDefActDMO )");

		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);

		thrower.ifParameterMissing("UdaUserDefActDMO.udaActionId",
				udaUserDefActDMO.getUdaActionId());
		
		dao.delete(udaUserDefActDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");
		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		dao.delete("UdaUserDefAct", args.getFilterBy(), args);
	}

	public boolean exists(UdaUserDefActDMO udaUserDefActDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EapEpxactionPendDMO)");

		return dao.exists("UdaUserDefAct", "filterByPrimaryKey", new DAOArgs(1)
		.arg((udaUserDefActDMO.getUdaActionId() == null) ? null : udaUserDefActDMO.getUdaActionId().trim()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public UdaUserDefActDMO get(UdaUserDefActDMO udaUserDefActDMO)
			throws EPPIXSeriousException {
		logger.debug("get( UdaUserDefActDMO )");

		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);
		
		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);

		thrower.ifParameterMissing("UdaUserDefActDMO.udaActionId",
				udaUserDefActDMO.getUdaActionId());

		return (UdaUserDefActDMO) dao.get(udaUserDefActDMO);
	}

	public UdaUserDefActDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return (UdaUserDefActDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

//	public UdaUserDefActDMO lock(UdaUserDefActDMO udaUserDefActDMO)
//			throws EPPIXSeriousException, EPPIXObjectBusyException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.max(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.min(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	public void modify(UdaUserDefActDMO udaUserDefActDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( EapEpxactionPendDMO )");

		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);
		
		thrower.ifParameterMissing("UdaUserDefActDMO", udaUserDefActDMO);

		thrower.ifParameterMissing("UdaUserDefActDMO.udaActionId",
				udaUserDefActDMO.getUdaActionId());

		dao.update(udaUserDefActDMO);	
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new UdaUserDefActDMO(), filterQueryArgs(filter, null));
	}

	protected DAOParamQueryArgs paramQueryArgs(UdaUserDefActDMO udaUserDefActDMO) {
		logger.debug("paramQueryArgs( udaUserDefActDMO)");
	
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("UdaUserDefAct",
				3 * 2);
		
		if(udaUserDefActDMO != null){
		
			String udaActionId = udaUserDefActDMO.getUdaActionId();
			
			if (!DMO.isNull(udaActionId)) {
				queryArgs.andFilterBy("UdaActionIdMatch").arg(
						udaActionId);
			}
			
			String udaActionDesc = udaUserDefActDMO.getUdaActionDesc();
			
			if (!DMO.isNull(udaActionDesc)) {
				queryArgs.andFilterBy("UdaActionDescMatch").arg(
						udaActionDesc);
			}
			
			String udaActionPath = udaUserDefActDMO.getUdaActionPath();
			
			if (!DMO.isNull(udaActionPath)) {
				queryArgs.andFilterBy("UdaActionPathMatch").arg(
						udaActionPath);
			}

		}
		
		return null;
	}
	
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "UdaUserDefAct" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
				case UdaUserDefActDMO.udaActionIdFilter:
					part.andFilterBy(queryArgs, "UdaActionId", dao
							.wildcardForAnySequence());
				break;
				
				case UdaUserDefActDMO.udaActionDescFilter:
					part.andFilterBy(queryArgs, "UdaActionDesc", dao
							.wildcardForAnySequence());
				break;
					
				case UdaUserDefActDMO.udaActionPathFilter:
					part.andFilterBy(queryArgs, "UdaActionPath", dao
							.wildcardForAnySequence());
				break;	
			}
			
		}
		return queryArgs;
	}
}
