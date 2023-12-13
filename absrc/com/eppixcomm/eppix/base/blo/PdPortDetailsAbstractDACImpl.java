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
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class PdPortDetailsAbstractDACImpl extends DAC implements
		PdPortDetailsAbstractDAC {

	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PdPortDetailsAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	// ~ Constructors
	public PdPortDetailsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	/**
	 * 
	 * @param thrower
	 * @param dao
	 * @param defaultLanguageCode
	 */
	protected PdPortDetailsAbstractDACImpl(DAOThrower thrower, DAO dao,
			String defaultLanguageCode) {
		super(thrower, dao, defaultLanguageCode);
	}

	// Methods ==============================================================
	public PdPortDetailsDMO get(PdPortDetailsDMO pdPortDetailsDMO)
			throws EPPIXSeriousException {
		logger.debug("get( PdPortDetailsDMO )");

		thrower.ifParameterMissing("PdPortDetailsDMO", pdPortDetailsDMO);

		return (PdPortDetailsDMO) dao.get(pdPortDetailsDMO);
	}

	public void create(PdPortDetailsDMO pdPortDetailsDMO)
			throws EPPIXSeriousException {
		logger.debug("create( pdPortDetailsDMO )");
		
		thrower.ifParameterMissing("PdPortDetailsDMO", pdPortDetailsDMO);
		
		dao.insert(pdPortDetailsDMO);
	}

	public PdPortDetailsDMO lock(PdPortDetailsDMO aPdPortDetailsDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aPdPortDetailsDMO )");

		thrower.ifParameterMissing("aPdPortDetailsDMO", aPdPortDetailsDMO);

		PdPortDetailsDMO lockedPdPortDetailsDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedPdPortDetailsDMO = (PdPortDetailsDMO) dao.lock("PshParamServHdr",
				"filterByPrimaryKey", new DAOArgs(1).arg(aPdPortDetailsDMO
						.getPdSerial()));

		return lockedPdPortDetailsDMO;
	}

	public void modify(PdPortDetailsDMO pdPortDetailsDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( PdPortDetailsDMO )");

		thrower.ifParameterMissing("PdPortDetailsDMO", pdPortDetailsDMO);

		// Required individual paramters required. Required getters
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdSerial",
				pdPortDetailsDMO.getPdSerial());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdInOut",
				pdPortDetailsDMO.getPdInOut());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdMsisdn",
				pdPortDetailsDMO.getPdMsisdn());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdN2nSent",
				pdPortDetailsDMO.getPdN2nSent());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdNetwrk",
				pdPortDetailsDMO.getPdNetwrk());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdPortId",
				pdPortDetailsDMO.getPdPortId());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdStatus",
				pdPortDetailsDMO.getPdStatus());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdTrans",
				pdPortDetailsDMO.getPdTrans());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdWaitMid",
				pdPortDetailsDMO.getPdWaitMid());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdTimestamp",
				pdPortDetailsDMO.getPdTimestamp());
		
		thrower.ifParameterMissing("PdPortDetailsDMO.getPdTransDate",
				pdPortDetailsDMO.getPdTransDate());

		dao.update(pdPortDetailsDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new PdPortDetailsDMO(), filterQueryArgs(filter, null));
	}

	public void delete(PdPortDetailsDMO pdPortDetailsDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( PdPortDetailsDMO )");

		thrower.ifParameterMissing("PdPortDetailsDMO", pdPortDetailsDMO);

		thrower.ifParameterMissing("PdPortDetailsDMO.getPdSerial", pdPortDetailsDMO
				.getPdSerial());

		dao.delete(pdPortDetailsDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("PdPortDetails", args.getFilterBy(), args);
	}

	public boolean exists(PdPortDetailsDMO PdPortDetailsDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( PdPortDetailsDMO)");

		return dao.exists("PdPortDetails", "filterByPrimaryKey", new DAOArgs(1)
				.arg(PdPortDetailsDMO.getPdSerial()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, PdPortDetailsDMO pdPortDetailsDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, pdPortDetailsDMO )");

		return new DTOList(dao.getList(paramQueryArgs(pdPortDetailsDMO)));
	}

	// Example filter. Change to fit class builds
	protected DAOParamQueryArgs paramQueryArgs(PdPortDetailsDMO pdPortDetailsDMO) {
		logger.debug("paramQueryArgs( pdPortDetailsDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("PdPortDetails", 11 * 2);

		if (pdPortDetailsDMO != null) {
			// primary key filters...
			Integer pdSerial = pdPortDetailsDMO.getPdSerial();

			if (!DMO.isNull(pdSerial)) {
				queryArgs.andFilterBy("pdSerial").arg(pdSerial);
			}

			// define more filters...
			String pdPortId = pdPortDetailsDMO.getPdPortId();

			if (!DMO.isNull(pdPortId)) {
				queryArgs.andFilterBy("pdPortIdMatch").arg(
						pdPortId + dao.wildcardForAnySequence());
			}

			String pdMsisdn = pdPortDetailsDMO.getPdMsisdn();

			if (!DMO.isNull(pdMsisdn)) {
				queryArgs.andFilterBy("PshSimNoMatch").arg(
						pdMsisdn + dao.wildcardForAnySequence());
			}

			String pdStatus = pdPortDetailsDMO.getPdStatus();

			if (!DMO.isNull(pdStatus)) {
				queryArgs.andFilterBy("PshMsisdnNoMatch").arg(
						pdStatus + dao.wildcardForAnySequence());
			}

			String pdInOut = pdPortDetailsDMO.getPdInOut();

			if (!DMO.isNull(pdInOut)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdInOut + dao.wildcardForAnySequence());
			}
			
			String pdNetwrk = pdPortDetailsDMO.getPdNetwrk();

			if (!DMO.isNull(pdNetwrk)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdNetwrk + dao.wildcardForAnySequence());
			}
			
			String pdWaitMid = pdPortDetailsDMO.getPdWaitMid();

			if (!DMO.isNull(pdWaitMid)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdWaitMid + dao.wildcardForAnySequence());
			}
			
			String pdTrans = pdPortDetailsDMO.getPdTrans();

			if (!DMO.isNull(pdTrans)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdTrans + dao.wildcardForAnySequence());
			}
			
			Date pdTransDate = pdPortDetailsDMO.getPdTransDate();

			if (!DMO.isNull(pdTransDate)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdTransDate + dao.wildcardForAnySequence());
			}			
			
			String pdN2nSent = pdPortDetailsDMO.getPdN2nSent();

			if (!DMO.isNull(pdN2nSent)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdN2nSent + dao.wildcardForAnySequence());
			}
			
			DateTime pdTimestamp = pdPortDetailsDMO.getPdTimestamp();
			
			if (!DMO.isNull(pdTimestamp)) {
				queryArgs.andFilterBy("PshArchivedMatch").arg(
						pdTimestamp + dao.wildcardForAnySequence());
			}				
		} else {
			// include all default languageCode filters where appropriate...
		}

		logger.debug("=============================================\n\r" + queryArgs.toString() + "\n\r");
		return queryArgs;
	}

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("getList( state, filter )");

		return new DTOList(dao.getList(filterQueryArgs(filter, null)));
	}

	// Example filterQuery Arguments
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "PdPortDetails" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();
			// for ( FilterPart part : parts ) {
			switch (part.getIndex()) {
			case PdPortDetailsDMO.pdSerialFilter:
				part.andFilterBy(queryArgs, "pdSerial", dao
						.wildcardForAnySequence());

				break;

			case PdPortDetailsDMO.pdInOutFilter:
				part.andFilterBy(queryArgs, "pdInOut", dao
						.wildcardForAnySequence());

				break;

			case PdPortDetailsDMO.pdMsisdnFilter:
				part.andFilterBy(queryArgs, "pdMsisdn", dao
						.wildcardForAnySequence());

				break;

			case PdPortDetailsDMO.pdN2nSentFilter:
				part.andFilterBy(queryArgs, "pdN2nSent", dao
						.wildcardForAnySequence());

				break;

			case PdPortDetailsDMO.pdNetwrkFilter:
				part.andFilterBy(queryArgs, "pdNetwrk", dao
						.wildcardForAnySequence());

				break;

			case PdPortDetailsDMO.pdPortIdFilter:
				part.andFilterBy(queryArgs, "pdPortId");

				break;

			case PdPortDetailsDMO.pdStatusFilter:
				part.andFilterBy(queryArgs, "pdStatus", dao
						.wildcardForAnySequence());
	
				break;
		
			case PdPortDetailsDMO.pdTimestampFilter:
				part.andFilterBy(queryArgs, "pdTimestamp", dao
						.wildcardForAnySequence());

				break;
	
			case PdPortDetailsDMO.pdTransDateFilter:
				part.andFilterBy(queryArgs, "pdTransDate", dao
						.wildcardForAnySequence());
	
				break;

			case PdPortDetailsDMO.pdTransFilter:
				part.andFilterBy(queryArgs, "pdTrans", dao
						.wildcardForAnySequence());

				break;
				
			case PdPortDetailsDMO.pdWaitMidFilter:
				part.andFilterBy(queryArgs, "pdWaitMid", dao
						.wildcardForAnySequence());

				break;				
			}
		}
		return queryArgs;
	}

	/**
	 * TODO SJ Fixme
	 */
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		 return dao.iterator( filterQueryArgs( filter, null ) );
	}

	/**
	 * TODO SJ Fixme
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		 return dao.iterator(filterQueryArgs( filter, null ));
	}

	public PdPortDetailsDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (PdPortDetailsDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
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

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}
