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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SulSubUseLimitAbstractDACImpl extends DAC implements
		SulSubUseLimitAbstractDAC {
	
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SulSubUseLimitAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SulSubUseLimitAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SulSubUseLimitAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SulSubUseLimitDMO get(SulSubUseLimitDMO SulSubUseLimitDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SulSubUseLimitDMO )");

		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);

		return (SulSubUseLimitDMO) dao.get(SulSubUseLimitDMO);
	}

	public void create(SulSubUseLimitDMO SulSubUseLimitDMO)
			throws EPPIXSeriousException {
		logger.debug("create( SulSubUseLimitDMO )");
		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);

		dao.insert(SulSubUseLimitDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SulSubUseLimitDMO(),
				filterQueryArgs(filter, "SulSubUseLimit"));
	}

	public void delete(SulSubUseLimitDMO SulSubUseLimitDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SulSubUseLimitDMO )");

		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);

		dao.delete(SulSubUseLimitDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SulSubUseLimit");

		dao.delete("SulSubUseLimit", args.getFilterBy(), args);
	}

	public boolean exists(SulSubUseLimitDMO SulSubUseLimitDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SulSubUseLimitDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SulSubUseLimitDMO.hmManuIdFilter,
		// SulSubUseLimitDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(SulSubUseLimitDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SulSubUseLimitDMO SulSubUseLimitDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, SulSubUseLimitDMO )");

		return new DTOList(dao.getList(paramQueryArgs(SulSubUseLimitDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SulSubUseLimitDMO SulSubUseLimitDMO) {
		logger.debug("paramQueryArgs( SulSubUseLimitDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SulSubUseLimit",
				2 * 2);

		if (SulSubUseLimitDMO != null) {

			Integer SulSubscriberId = SulSubUseLimitDMO.getSulSubscriberId();

			if (!DMO.isNull(SulSubscriberId)) {
				queryArgs.andFilterBy("SulSubscriberIdMatch").arg(
						SulSubscriberId);
			}

			String SulType = SulSubUseLimitDMO.getSulType();

			if (!DMO.isNull(SulType)) {
				queryArgs.andFilterBy("SulTypeMatch").arg(SulType);
			}

			Date SulStartDate = SulSubUseLimitDMO.getSulStartDate();

			if (!DMO.isNull(SulStartDate)) {
				queryArgs.andFilterBy("SulStartDateMatch").arg(SulStartDate);
			}

			Date SulEndDate = SulSubUseLimitDMO.getSulEndDate();

			if (!DMO.isNull(SulEndDate)) {
				queryArgs.andFilterBy("SulEndDateMatch").arg(SulEndDate);
			}

			Double SulValue = SulSubUseLimitDMO.getSulValue();

			if (!DMO.isNull(SulValue)) {
				queryArgs.andFilterBy("SulValueMatch").arg(SulValue);
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
				(dmlName == null) ? "SulSubUseLimit" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SulSubUseLimitDMO.sulSubscriberIdFilter:
				part.andFilterBy(queryArgs, "sulSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case SulSubUseLimitDMO.sulTypeFilter:
				part.andFilterBy(queryArgs, "sulType",
						dao.wildcardForAnySequence());
				break;

			case SulSubUseLimitDMO.sulStartDateFilter:
				part.andFilterBy(queryArgs, "sulStartDate",
						dao.wildcardForAnySequence());
				break;

			case SulSubUseLimitDMO.sulEndDateFilter:
				part.andFilterBy(queryArgs, "sulEndDate",
						dao.wildcardForAnySequence());
				break;

			case SulSubUseLimitDMO.sulValueFilter:
				part.andFilterBy(queryArgs, "sulValue",
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

	public SulSubUseLimitDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SulSubUseLimit");

		return (SulSubUseLimitDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SulSubUseLimit");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SulSubUseLimit");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SulSubUseLimit");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}