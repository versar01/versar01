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



public class NpsN2nPerformSendsmsAbstractDACImpl extends DAC implements
NpsN2nPerformSendsmsAbstractDAC {

	static DAOThrower thrower = DAOThrower
			.getDAOThrower(NpsN2nPerformSendsmsAbstractDACImpl.class);

	Logger logger = thrower.getLogger();

	public NpsN2nPerformSendsmsAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public NpsN2nPerformSendsmsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public NpsN2nPerformSendsmsDMO get(NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException {
		logger.debug("get( NpsN2nPerformSendsmsDMO )");

		thrower.ifParameterMissing("NpsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO);

		return (NpsN2nPerformSendsmsDMO) dao.get(npsN2nPerformSendsmsDMO);
	}

	public void create(NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException {
		logger.debug("create( npsN2nPerformSendsmsDMO )");
		thrower.ifParameterMissing("NpsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO);

		dao.insert(npsN2nPerformSendsmsDMO);
	}

	public void modify(NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aNpsN2nPerformSendsmsDMO )");

		thrower.ifParameterMissing("aNpsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO);

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsFunction",
	  	      npsN2nPerformSendsmsDMO.getNpsFunction());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsOption",
	  	      npsN2nPerformSendsmsDMO.getNpsOption());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsPortId",
	  	      npsN2nPerformSendsmsDMO.getNpsPortId());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsMsisdn",
	  	      npsN2nPerformSendsmsDMO.getNpsMsisdn() );

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsDesc",
	  	  	      npsN2nPerformSendsmsDMO.getNpsDesc());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSource",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSource());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTransId",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTransId());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSim",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSim() );
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTimestamp",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTimestamp());

		dao.update(npsN2nPerformSendsmsDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new NpsN2nPerformSendsmsDMO(),
				filterQueryArgs(filter, null));
	}

	public void delete(NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( NpsN2nPerformSendsmsDMO )");

		thrower.ifParameterMissing("NpsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO);

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsFunction",
	  	      npsN2nPerformSendsmsDMO.getNpsFunction());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsOption",
	  	      npsN2nPerformSendsmsDMO.getNpsOption());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsPortId",
	  	      npsN2nPerformSendsmsDMO.getNpsPortId());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsMsisdn",
	  	      npsN2nPerformSendsmsDMO.getNpsMsisdn() );

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsDesc",
	  	  	      npsN2nPerformSendsmsDMO.getNpsDesc());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSource",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSource());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTransId",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTransId());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSim",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSim() );
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTimestamp",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTimestamp());

		dao.delete(npsN2nPerformSendsmsDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("NgsNetGroupServ", args.getFilterBy(), args);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO) {
		logger.debug("paramQueryArgs( npsN2nPerformSendsmsDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("NgsNetGroupServ",
				17 * 2);

		if (npsN2nPerformSendsmsDMO != null) {
			// primary key filters...
			Integer ngsSerial = npsN2nPerformSendsmsDMO.getNpsSerial();

			if (!DMO.isNull(ngsSerial)) {
				queryArgs.andFilterBy("NpsSerialMatch").arg(
						ngsSerial);
			}

			String npsFunction = npsN2nPerformSendsmsDMO.getNpsFunction();

			if (!DMO.isNull(npsFunction)) {
				queryArgs.andFilterBy("NgsNetworkMatch").arg(
						npsFunction + dao.wildcardForAnySequence());
			}

			String npsOption = npsN2nPerformSendsmsDMO.getNpsOption();

			if (!DMO.isNull(npsOption)) {
				queryArgs.andFilterBy("NgsNetServCodeMatch").arg(
						npsOption + dao.wildcardForAnySequence());
			}

			String npsPortId = npsN2nPerformSendsmsDMO.getNpsPortId();

			if (!DMO.isNull(npsPortId)) {
				queryArgs.andFilterBy("NgsSequence").arg(npsPortId + dao.wildcardForAnySequence());
			}

			// define more filters...
			String npsMsisdn = npsN2nPerformSendsmsDMO.getNpsMsisdn();

			if (!DMO.isNull(npsMsisdn)) {
				queryArgs.andFilterBy("NgsApplyTextMatch").arg(
						npsMsisdn + dao.wildcardForAnySequence());
			}

			String npsDesc = npsN2nPerformSendsmsDMO.getNpsDesc();

			if (!DMO.isNull(npsDesc)) {
				queryArgs.andFilterBy("NgsModifyTextMatch").arg(
						npsDesc + dao.wildcardForAnySequence());
			}

			String npsSim = npsN2nPerformSendsmsDMO.getNpsSim();

			if (!DMO.isNull(npsSim)) {
				queryArgs.andFilterBy("NgsRemoveTextMatch").arg(
						npsSim + dao.wildcardForAnySequence());
			}

			String npsSource = npsN2nPerformSendsmsDMO.getNpsSource();

			if (!DMO.isNull(npsSource)) {
				queryArgs.andFilterBy("NgsParamName1Match").arg(
						npsSource + dao.wildcardForAnySequence());
			}

			String npsTransId = npsN2nPerformSendsmsDMO.getNpsTransId();

			if (!DMO.isNull(npsTransId)) {
				queryArgs.andFilterBy("NgsParamValue1Match").arg(
						npsTransId + dao.wildcardForAnySequence());
			}

			DateTime npsTimestamp = npsN2nPerformSendsmsDMO.getNpsTimestamp();

			if (!DMO.isNull(npsTimestamp)) {
				queryArgs.andFilterBy("NgsParamName2Match").arg(
						npsTimestamp);
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
				(dmlName == null) ? "NgsNetGroupServ" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case NpsN2nPerformSendsmsDMO.npsSerialFilter:
				part.andFilterBy(queryArgs, "NpsSerial", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsFunctionFilter:
				part.andFilterBy(queryArgs, "NpsFunction", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsOptionFilter:
				part.andFilterBy(queryArgs, "NpsOption", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsPortIdFilter:
				part.andFilterBy(queryArgs, "NpsPortId", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsMsisdnFilter:
				part.andFilterBy(queryArgs, "NpsMsisdn", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsDescFilter:
				part.andFilterBy(queryArgs, "NpsDesc", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsSourceFilter:
				part.andFilterBy(queryArgs, "NpsSource", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsSimFilter:
				part.andFilterBy(queryArgs, "NpsSim", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsTransIdFilter:
				part.andFilterBy(queryArgs, "NpsTransId", dao
						.wildcardForAnySequence());

				break;

			case NpsN2nPerformSendsmsDMO.npsTimestampFilter:
				part.andFilterBy(queryArgs, "NpsTimestamp", dao
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

	public NpsN2nPerformSendsmsDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (NpsN2nPerformSendsmsDMO) dao.get(args.getDMLName(), args
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

	public NpsN2nPerformSendsmsDMO lock(
			NpsN2nPerformSendsmsDMO aNpsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return false;
	}
}
