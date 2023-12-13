package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;


public class EdfEnhancedDataFaxAbstractDACImpl extends DAC implements
		EdfEnhancedDataFaxAbstractDAC {
	static DAOThrower thrower = DAOThrower
	.getDAOThrower(NpsN2nPerformSendsmsAbstractDACImpl.class);
	
	Logger logger = thrower.getLogger();
	
	public EdfEnhancedDataFaxAbstractDACImpl(UserContext userContext, DAO dao) {
	super(userContext, dao, thrower);
	}
	
	public EdfEnhancedDataFaxAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public EdfEnhancedDataFaxDMO get(EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO)
			throws EPPIXSeriousException {
		logger.debug("get( edfEnhancedDataFaxDMO )");

		thrower.ifParameterMissing("EdfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO);

		return (EdfEnhancedDataFaxDMO) dao.get(edfEnhancedDataFaxDMO);
	}

	public void create(EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO)
			throws EPPIXSeriousException {
		logger.debug("create( edfEnhancedDataFaxDMO )");
		thrower.ifParameterMissing("EdfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO);

		dao.insert(edfEnhancedDataFaxDMO);
	}

	public void modify(EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aEdfEnhancedDataFaxDMO )");

		thrower.ifParameterMissing("aEdfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO);

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
	  	      edfEnhancedDataFaxDMO.getEdfPrimarySim());

	  	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfMsisdn",
	  	      edfEnhancedDataFaxDMO.getEdfMsisdn());
	  	    
	  	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfTimestamp",
	  	  	      edfEnhancedDataFaxDMO.getEdfTimestamp());

		dao.update(edfEnhancedDataFaxDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new EdfEnhancedDataFaxDMO(),
				filterQueryArgs(filter, null));
	}

	public void delete(EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( EdfEnhancedDataFaxDMO )");

		thrower.ifParameterMissing("edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO);

			thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
		  	      edfEnhancedDataFaxDMO.getEdfPrimarySim());

			thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfMsisdn",
		  	      edfEnhancedDataFaxDMO.getEdfMsisdn());

		dao.delete(edfEnhancedDataFaxDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("EdfEnhancedDataFax", args.getFilterBy(), args);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO) {
		logger.debug("paramQueryArgs( edfEnhancedDataFaxDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("EdfEnhancedDataFax",
				3 * 2);

		if (edfEnhancedDataFaxDMO != null) {
			// primary key filters...
			String edfPrimarySim = edfEnhancedDataFaxDMO.getEdfPrimarySim();

			if (!DMO.isNull(edfPrimarySim)) {
				queryArgs.andFilterBy("EdfPrimarySimMatch").arg(
						edfPrimarySim + dao.wildcardForAnySequence());
			}

			String edfMsisdn = edfEnhancedDataFaxDMO.getEdfMsisdn();

			if (!DMO.isNull(edfMsisdn)) {
				queryArgs.andFilterBy("EdfMsisdnMatch").arg(
						edfMsisdn + dao.wildcardForAnySequence());
			}
			
			DateTime edfTimestamp = edfEnhancedDataFaxDMO.getEdfTimestamp();

			if (!DMO.isNull(edfTimestamp)) {
				queryArgs.andFilterBy("EdfTimestampMatch").arg(
						edfTimestamp);
			}

		} else {
			// include all default languageCode filters where appropriate...
		}

		return queryArgs;
	}

	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "EdfEnhancedDataFax" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case EdfEnhancedDataFaxDMO.edfPrimarySimFilter:
				part.andFilterBy(queryArgs, "EdfPrimarySim", dao
						.wildcardForAnySequence());

				break;

			case EdfEnhancedDataFaxDMO.edfMsisdnFilter:
				part.andFilterBy(queryArgs, "EdfMsisdn", dao
						.wildcardForAnySequence());

				break;
				
			case EdfEnhancedDataFaxDMO.edfTimestampFilter:
				part.andFilterBy(queryArgs, "EdfTimestamp", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null), true);
	}

	public EdfEnhancedDataFaxDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (EdfEnhancedDataFaxDMO) dao.get(args.getDMLName(), args
				.getFilterBy(), args);
	}

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

	/**
	 * Counts (COUNT(*)) the number of rows for the specified filter.
	 * 
	 * @param filter
	 * @return the count of rows.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public EdfEnhancedDataFaxDMO lock(
			EdfEnhancedDataFaxDMO aEdfEnhancedDataFaxDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		// TODO Auto-generated method stub
		return null;
	}
	

	public boolean exists(EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return false;
	}
}
