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

public class SbhsSplitBillHsAbstractDACImpl extends DAC implements
		SbhsSplitBillHsAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SbhsSplitBillHsAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SbhsSplitBillHsAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SbhsSplitBillHsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SbhsSplitBillHsDMO get(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SbhsSplitBillHsDMO )");

		thrower.ifParameterMissing("SbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		return (SbhsSplitBillHsDMO) dao.get(sbhsSplitBillHsDMO);
	}

	public void create(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sbhsSplitBillHsDMO )");
		thrower.ifParameterMissing("SbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		dao.insert(sbhsSplitBillHsDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SbhsSplitBillHsDMO(),
				filterQueryArgs(filter, "SbhsSplitBillHs"));
	}

	public void delete(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SbhsSplitBillHsDMO )");

		thrower.ifParameterMissing("SbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		dao.delete(sbhsSplitBillHsDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SbhsSplitBillHs");

		dao.delete("SbhsSplitBillHs", args.getFilterBy(), args);
	}

	public boolean exists(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SbhsSplitBillHsDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SbhsSplitBillHsDMO.hmManuIdFilter,
		// sbhsSplitBillHsDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(sbhsSplitBillHsDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SbhsSplitBillHsDMO sbhsSplitBillHsDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, sbhsSplitBillHsDMO )");

		return new DTOList(dao.getList(paramQueryArgs(sbhsSplitBillHsDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SbhsSplitBillHsDMO sbhsSplitBillHsDMO) {
		logger.debug("paramQueryArgs( sbhsSplitBillHsDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SbhsSplitBillHs",
				2 * 2);

		if (sbhsSplitBillHsDMO != null) {

			Integer SbhsSbId = sbhsSplitBillHsDMO.getSbhsSbId();

			if (!DMO.isNull(SbhsSbId)) {
				queryArgs.andFilterBy("SbhsSbIdMatch").arg(SbhsSbId);
			}

			String SbhsOldVal = sbhsSplitBillHsDMO.getSbhsOldVal();

			if (!DMO.isNull(SbhsOldVal)) {
				queryArgs.andFilterBy("SbhsOldValMatch").arg(SbhsOldVal);
			}

			String SbhsNewVal = sbhsSplitBillHsDMO.getSbhsNewVal();

			if (!DMO.isNull(SbhsNewVal)) {
				queryArgs.andFilterBy("SbhsNewValMatch").arg(SbhsNewVal);
			}

			String SbhsReason = sbhsSplitBillHsDMO.getSbhsReason();

			if (!DMO.isNull(SbhsReason)) {
				queryArgs.andFilterBy("SbhsReasonMatch").arg(SbhsReason);
			}

			Date SbhsDate = sbhsSplitBillHsDMO.getSbhsDate();

			if (!DMO.isNull(SbhsDate)) {
				queryArgs.andFilterBy("SbhsDateMatch").arg(SbhsDate);
			}

			String SbhsUserId = sbhsSplitBillHsDMO.getSbhsUserId();

			if (!DMO.isNull(SbhsUserId)) {
				queryArgs.andFilterBy("SbhsUserIdMatch").arg(SbhsUserId);
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
				(dmlName == null) ? "SbhsSplitBillHs" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SbhsSplitBillHsDMO.SbhsSbIdFilter:
				part.andFilterBy(queryArgs, "SbhsSbId",
						dao.wildcardForAnySequence());
				break;

			case SbhsSplitBillHsDMO.SbhsOldValFilter:
				part.andFilterBy(queryArgs, "SbhsOldVal",
						dao.wildcardForAnySequence());
				break;

			case SbhsSplitBillHsDMO.SbhsNewValFilter:
				part.andFilterBy(queryArgs, "SbhsNewVal",
						dao.wildcardForAnySequence());
				break;

			case SbhsSplitBillHsDMO.SbhsReasonFilter:
				part.andFilterBy(queryArgs, "SbhsReason",
						dao.wildcardForAnySequence());
				break;

			case SbhsSplitBillHsDMO.SbhsDateFilter:
				part.andFilterBy(queryArgs, "SbhsDate",
						dao.wildcardForAnySequence());
				break;

			case SbhsSplitBillHsDMO.SbhsUserIdFilter:
				part.andFilterBy(queryArgs, "SbhsUserId",
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

	public SbhsSplitBillHsDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SbhsSplitBillHs");

		return (SbhsSplitBillHsDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SbhsSplitBillHs");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SbhsSplitBillHs");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SbhsSplitBillHs");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}