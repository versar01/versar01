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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class PfhPocSubHistAbstractDACImpl extends DAC implements
		PfhPocSubHistAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PfhPocSubHistAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public PfhPocSubHistAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public PfhPocSubHistAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public PfhPocSubHistDMO get(PfhPocSubHistDMO pfhPocSubHistDMO)
			throws EPPIXSeriousException {
		logger.debug("get( PfhPocSubHistDMO )");

		thrower.ifParameterMissing("PfhPocSubHistDMO", pfhPocSubHistDMO);

		return (PfhPocSubHistDMO) dao.get(pfhPocSubHistDMO);
	}

	public void create(PfhPocSubHistDMO pfhPocSubHistDMO)
			throws EPPIXSeriousException {
		logger.debug("create( pfhPocSubHistDMO )");
		thrower.ifParameterMissing("PfhPocSubHistDMO", pfhPocSubHistDMO);

		dao.insert(pfhPocSubHistDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new PfhPocSubHistDMO(),
				filterQueryArgs(filter, "PfhPocSubHist"));
	}

	public void delete(PfhPocSubHistDMO pfhPocSubHistDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( PfhPocSubHistDMO )");

		thrower.ifParameterMissing("PfhPocSubHistDMO", pfhPocSubHistDMO);

		dao.delete(pfhPocSubHistDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfhPocSubHist");

		dao.delete("PfhPocSubHist", args.getFilterBy(), args);
	}

	public boolean exists(PfhPocSubHistDMO pfhPocSubHistDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( PfhPocSubHistDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, PfhPocSubHistDMO.hmManuIdFilter,
		// pfhPocSubHistDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(pfhPocSubHistDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, PfhPocSubHistDMO pfhPocSubHistDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, pfhPocSubHistDMO )");

		return new DTOList(dao.getList(paramQueryArgs(pfhPocSubHistDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(PfhPocSubHistDMO pfhPocSubHistDMO) {
		logger.debug("paramQueryArgs( pfhPocSubHistDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("PfhPocSubHist",
				2 * 2);

		if (pfhPocSubHistDMO != null) {

			Integer PfhSubscriberId = pfhPocSubHistDMO.getPfhSubscriberId();

			if (!DMO.isNull(PfhSubscriberId)) {
				queryArgs.andFilterBy("PfhSubscriberIdMatch").arg(
						PfhSubscriberId);
			}

			Integer PfhFieldId = pfhPocSubHistDMO.getPfhFieldId();

			if (!DMO.isNull(PfhFieldId)) {
				queryArgs.andFilterBy("PfhFieldIdMatch").arg(PfhFieldId);
			}

			String PfhHistCode = pfhPocSubHistDMO.getPfhHistCode();

			if (!DMO.isNull(PfhHistCode)) {
				queryArgs.andFilterBy("PfhHistCodeMatch").arg(PfhHistCode);
			}

			String PfhOldValue = pfhPocSubHistDMO.getPfhOldValue();

			if (!DMO.isNull(PfhOldValue)) {
				queryArgs.andFilterBy("PfhOldValueMatch").arg(PfhOldValue);
			}

			String PfhNewValue = pfhPocSubHistDMO.getPfhNewValue();

			if (!DMO.isNull(PfhNewValue)) {
				queryArgs.andFilterBy("PfhNewValueMatch").arg(PfhNewValue);
			}

			String PfhUserId = pfhPocSubHistDMO.getPfhUserId();

			if (!DMO.isNull(PfhUserId)) {
				queryArgs.andFilterBy("PfhUserIdMatch").arg(PfhUserId);
			}

			String PfhTerminalId = pfhPocSubHistDMO.getPfhTerminalId();

			if (!DMO.isNull(PfhTerminalId)) {
				queryArgs.andFilterBy("PfhTerminalIdMatch").arg(PfhTerminalId);
			}

			DateTime PfhTimestamp = pfhPocSubHistDMO.getPfhTimestamp();

			if (!DMO.isNull(PfhTimestamp)) {
				queryArgs.andFilterBy("PfhTimestampMatch").arg(PfhTimestamp);
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
				(dmlName == null) ? "PfhPocSubHist" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case PfhPocSubHistDMO.pfhSubscriberIdFilter:
				part.andFilterBy(queryArgs, "pfhSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhFieldIdFilter:
				part.andFilterBy(queryArgs, "pfhFieldId",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhHistCodeFilter:
				part.andFilterBy(queryArgs, "pfhHistCode",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhOldValueFilter:
				part.andFilterBy(queryArgs, "pfhOldValue",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhNewValueFilter:
				part.andFilterBy(queryArgs, "pfhNewValue",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhUserIdFilter:
				part.andFilterBy(queryArgs, "pfhUserId",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhTerminalIdFilter:
				part.andFilterBy(queryArgs, "pfhTerminalId",
						dao.wildcardForAnySequence());
				break;

			case PfhPocSubHistDMO.pfhTimestampFilter:
				part.andFilterBy(queryArgs, "pfhTimestamp",
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

	public PfhPocSubHistDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfhPocSubHist");

		return (PfhPocSubHistDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfhPocSubHist");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfhPocSubHist");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfhPocSubHist");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}