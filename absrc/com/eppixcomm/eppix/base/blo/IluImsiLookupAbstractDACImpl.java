package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
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

public class IluImsiLookupAbstractDACImpl extends DAC implements
		IluImsiLookupAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(IluImsiLookupAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public IluImsiLookupAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public IluImsiLookupAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public IluImsiLookupDMO get(IluImsiLookupDMO iluImsiLookupDMO)
			throws EPPIXSeriousException {
		logger.debug("get( IluImsiLookupDMO )");

		thrower.ifParameterMissing("IluImsiLookupDMO", iluImsiLookupDMO);

		return (IluImsiLookupDMO) dao.get(iluImsiLookupDMO);
	}

	public void create(IluImsiLookupDMO iluImsiLookupDMO)
			throws EPPIXSeriousException {
		logger.debug("create( iluImsiLookupDMO )");
		thrower.ifParameterMissing("IluImsiLookupDMO", iluImsiLookupDMO);

		dao.insert(iluImsiLookupDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new IluImsiLookupDMO(),
				filterQueryArgs(filter, "IluImsiLookup"));
	}

	public void delete(IluImsiLookupDMO iluImsiLookupDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( IluImsiLookupDMO )");

		thrower.ifParameterMissing("IluImsiLookupDMO", iluImsiLookupDMO);

		dao.delete(iluImsiLookupDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "IluImsiLookup");

		dao.delete("IluImsiLookup", args.getFilterBy(), args);
	}

	public boolean exists(IluImsiLookupDMO iluImsiLookupDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( IluImsiLookupDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, IluImsiLookupDMO.hmManuIdFilter,
		// iluImsiLookupDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(iluImsiLookupDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, IluImsiLookupDMO iluImsiLookupDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, iluImsiLookupDMO )");

		return new DTOList(dao.getList(paramQueryArgs(iluImsiLookupDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(IluImsiLookupDMO iluImsiLookupDMO) {
		logger.debug("paramQueryArgs( iluImsiLookupDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("IluImsiLookup",
				2 * 2);

		if (iluImsiLookupDMO != null) {

			String IluImsiNo = iluImsiLookupDMO.getIluImsiNo();

			if (!DMO.isNull(IluImsiNo)) {
				queryArgs.andFilterBy("IluImsiNoMatch").arg(IluImsiNo);
			}

			String IluBasicServ = iluImsiLookupDMO.getIluBasicServ();

			if (!DMO.isNull(IluBasicServ)) {
				queryArgs.andFilterBy("IluBasicServMatch").arg(IluBasicServ);
			}

			String IluSimNo = iluImsiLookupDMO.getIluSimNo();

			if (!DMO.isNull(IluSimNo)) {
				queryArgs.andFilterBy("IluSimNoMatch").arg(IluSimNo);
			}

			String IluMsisdn = iluImsiLookupDMO.getIluMsisdn();

			if (!DMO.isNull(IluMsisdn)) {
				queryArgs.andFilterBy("IluMsisdnMatch").arg(IluMsisdn);
			}

			Date IluDate = iluImsiLookupDMO.getIluDate();

			if (!DMO.isNull(IluDate)) {
				queryArgs.andFilterBy("IluDateMatch").arg(IluDate);
			}

			DateTime IluTimestamp = iluImsiLookupDMO.getIluTimestamp();

			if (!DMO.isNull(IluTimestamp)) {
				queryArgs.andFilterBy("IluTimestampMatch").arg(IluTimestamp);
			}

		} else {
			// include all default languageCode filters where appropriate...
		}

		return queryArgs;
	}

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("getList( state, filter )");

		return new DTOList(dao.getList(filterQueryArgs(filter, null)));
	}

	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "IluImsiLookup" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case IluImsiLookupDMO.IluImsiNoFilter:
				part.andFilterBy(queryArgs, "IluImsiNo",
						dao.wildcardForAnySequence());
				break;

			case IluImsiLookupDMO.IluBasicServFilter:
				part.andFilterBy(queryArgs, "IluBasicServ",
						dao.wildcardForAnySequence());
				break;

			case IluImsiLookupDMO.IluSimNoFilter:
				part.andFilterBy(queryArgs, "IluSimNo",
						dao.wildcardForAnySequence());
				break;

			case IluImsiLookupDMO.IluMsisdnFilter:
				part.andFilterBy(queryArgs, "IluMsisdn",
						dao.wildcardForAnySequence());
				break;

			case IluImsiLookupDMO.IluDateFilter:
				part.andFilterBy(queryArgs, "IluDate",
						dao.wildcardForAnySequence());
				break;

			case IluImsiLookupDMO.IluTimestampFilter:
				part.andFilterBy(queryArgs, "IluTimestamp",
						dao.wildcardForAnySequence());
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

	public IluImsiLookupDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "IluImsiLookup");

		return (IluImsiLookupDMO) dao.get(args.getDMLName(), args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "IluImsiLookup");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "IluImsiLookup");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "IluImsiLookup");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}