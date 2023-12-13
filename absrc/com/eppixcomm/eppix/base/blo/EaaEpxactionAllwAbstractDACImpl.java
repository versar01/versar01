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

public class EaaEpxactionAllwAbstractDACImpl extends DAC implements EaaEpxactionAllwAbstractDAC{
	
	static DAOThrower thrower = DAOThrower.getDAOThrower( EcfEventCmdFileAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	protected EaaEpxactionAllwAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	protected EaaEpxactionAllwAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
			throws EPPIXSeriousException {
		logger.debug("create( eaaEpxactionAllwDMO )");
		thrower.ifParameterMissing("EaaEpxactionAllwDMO", eaaEpxactionAllwDMO);

		dao.insert(eaaEpxactionAllwDMO);		
	}

	public void delete(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( EaaEpxactionAllwDMO )");

		thrower.ifParameterMissing("EaaEpxactionAllwDMO", eaaEpxactionAllwDMO);

		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaSubsystem",
				eaaEpxactionAllwDMO.getEaaSubsystem());
		
		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaActionType",
				eaaEpxactionAllwDMO.getEaaActionType());
		
		dao.delete(eaaEpxactionAllwDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");
		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		dao.delete("EaaEpxactionAllw", args.getFilterBy(), args);
	}

	public boolean exists(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EapEpxactionPendDMO)");

		return dao.exists("EaaEpxactionAllw", "filterByPrimaryKey", new DAOArgs(2)
		.arg((eaaEpxactionAllwDMO.getEaaSubsystem() == null) ? null : eaaEpxactionAllwDMO.getEaaSubsystem().trim())
		.arg((eaaEpxactionAllwDMO.getEaaActionType() == null) ? null : eaaEpxactionAllwDMO.getEaaActionType().trim()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public EaaEpxactionAllwDMO get(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
			throws EPPIXSeriousException {
		logger.debug("get( EaaEpxactionAllwDMO )");

		thrower.ifParameterMissing("EaaEpxactionAllwDMO", eaaEpxactionAllwDMO);
		
		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaSubsystem",
				eaaEpxactionAllwDMO.getEaaSubsystem());
		
		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaActionType",
				eaaEpxactionAllwDMO.getEaaActionType());

		return (EaaEpxactionAllwDMO) dao.get(eaaEpxactionAllwDMO);
	}

	public EaaEpxactionAllwDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return (EaaEpxactionAllwDMO) dao.get(args.getDMLName(), args.getFilterBy(),
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

//	public EaaEpxactionAllwDMO lock(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
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

	public void modify(EaaEpxactionAllwDMO eaaEpxactionAllwDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( EaaEpxactionAllwDMO )");

		thrower.ifParameterMissing("EaaEpxactionAllwDMO", eaaEpxactionAllwDMO);
		
		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaSubsystem",
				eaaEpxactionAllwDMO.getEaaSubsystem());
		
		thrower.ifParameterMissing("EaaEpxactionAllwDMO.eaaActionType",
				eaaEpxactionAllwDMO.getEaaActionType());

		dao.update(eaaEpxactionAllwDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new EaaEpxactionAllwDMO(), filterQueryArgs(filter, null));	
	}

	protected DAOParamQueryArgs paramQueryArgs(EaaEpxactionAllwDMO eaaEpxactionAllwDMO) {
		logger.debug("paramQueryArgs( eaaEpxactionAllwDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("EaaEpxactionAllw",
				4 * 2);
		
		if(eaaEpxactionAllwDMO != null){
			
			String eaaSubsystem  = eaaEpxactionAllwDMO.getEaaSubsystem();
			
			if (!DMO.isNull(eaaSubsystem)) {
				queryArgs.andFilterBy("EaaSubsystemMatch").arg(
						eaaSubsystem);
			}
			
			String eaaActionType = eaaEpxactionAllwDMO.getEaaActionType();
			
			if (!DMO.isNull(eaaActionType)) {
				queryArgs.andFilterBy("EaaActionTypeMatch").arg(
						eaaActionType);
			}
			
			String eaaPendDirect = eaaEpxactionAllwDMO.getEaaPendDirect();
			
			if (!DMO.isNull(eaaPendDirect)) {
				queryArgs.andFilterBy("EaaPendDirectMatch").arg(
						eaaPendDirect);
			}
			
			String eaaActProctype = eaaEpxactionAllwDMO.getEaaActProctype();
			
			if (!DMO.isNull(eaaActProctype)) {
				queryArgs.andFilterBy("EaaActProctypeMatch").arg(
						eaaActProctype);
			}
		}
		
		return null;
	}
	
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "EaaEpxactionAllw" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			
			case EaaEpxactionAllwDMO.eaaActionTypeFilter:
				part.andFilterBy(queryArgs, "EaaActionType", dao
						.wildcardForAnySequence());
			break;

			case EaaEpxactionAllwDMO.eaaActProctypeFilter:
				part.andFilterBy(queryArgs, "EaaActProctype", dao
						.wildcardForAnySequence());
			break;
			
			case EaaEpxactionAllwDMO.eaaPendDirectFilter:
				part.andFilterBy(queryArgs, "EaaPendDirect", dao
						.wildcardForAnySequence());
			break;
			
			case EaaEpxactionAllwDMO.eaaSubsystemFilter:
				part.andFilterBy(queryArgs, "EaaSubsystem", dao
						.wildcardForAnySequence());
			break;
			}
			
		}
		return queryArgs;
	}	
}
