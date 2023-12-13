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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class NttNtwrkTrfTypeAbstractDACImpl extends DAC implements
		NttNtwrkTrfTypeAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(NttNtwrkTrfTypeAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public NttNtwrkTrfTypeAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public NttNtwrkTrfTypeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public NttNtwrkTrfTypeDMO get(NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("get( NttNtwrkTrfTypeDMO )");

		thrower.ifParameterMissing("NttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO);

		return (NttNtwrkTrfTypeDMO) dao.get(nttNtwrkTrfTypeDMO);
	}

	public void create(NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("create( nttNtwrkTrfTypeDMO )");
		thrower.ifParameterMissing("NttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO);

		dao.insert(nttNtwrkTrfTypeDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new NttNtwrkTrfTypeDMO(),
				filterQueryArgs(filter, "NttNtwrkTrfType"));
	}

	public void delete(NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( NttNtwrkTrfTypeDMO )");

		thrower.ifParameterMissing("NttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO);

		dao.delete(nttNtwrkTrfTypeDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "NttNtwrkTrfType");

		dao.delete("NttNtwrkTrfType", args.getFilterBy(), args);
	}

	public boolean exists(NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( NttNtwrkTrfTypeDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, NttNtwrkTrfTypeDMO.hmManuIdFilter,
		// nttNtwrkTrfTypeDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(nttNtwrkTrfTypeDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, nttNtwrkTrfTypeDMO )");

		return new DTOList(dao.getList(paramQueryArgs(nttNtwrkTrfTypeDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO) {
		logger.debug("paramQueryArgs( nttNtwrkTrfTypeDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("NttNtwrkTrfType",
				2 * 2);

		if (nttNtwrkTrfTypeDMO != null) {

			String NttNtwrkTariff = nttNtwrkTrfTypeDMO.getNttNtwrkTariff();

			if (!DMO.isNull(NttNtwrkTariff)) {
				queryArgs.andFilterBy("NttNtwrkTariffMatch")
						.arg(NttNtwrkTariff);
			}

			Date NttStartDate = nttNtwrkTrfTypeDMO.getNttStartDate();

			if (!DMO.isNull(NttStartDate)) {
				queryArgs.andFilterBy("NttStartDateMatch").arg(NttStartDate);
			}

			Date NttEndDate = nttNtwrkTrfTypeDMO.getNttEndDate();

			if (!DMO.isNull(NttEndDate)) {
				queryArgs.andFilterBy("NttEndDateMatch").arg(NttEndDate);
			}

			Integer NttContractPer = nttNtwrkTrfTypeDMO.getNttContractPer();

			if (!DMO.isNull(NttContractPer)) {
				queryArgs.andFilterBy("NttContractPerMatch")
						.arg(NttContractPer);
			}

			String NttAllowSpMigr = nttNtwrkTrfTypeDMO.getNttAllowSpMigr();

			if (!DMO.isNull(NttAllowSpMigr)) {
				queryArgs.andFilterBy("NttAllowSpMigrMatch")
						.arg(NttAllowSpMigr);
			}

			String NttAllowMsiSwap = nttNtwrkTrfTypeDMO.getNttAllowMsiSwap();

			if (!DMO.isNull(NttAllowMsiSwap)) {
				queryArgs.andFilterBy("NttAllowMsiSwapMatch").arg(
						NttAllowMsiSwap);
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
				(dmlName == null) ? "NttNtwrkTrfType" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case NttNtwrkTrfTypeDMO.NttNtwrkTariffFilter:
				part.andFilterBy(queryArgs, "NttNtwrkTariff",
						dao.wildcardForAnySequence());
				break;

			case NttNtwrkTrfTypeDMO.NttStartDateFilter:
				part.andFilterBy(queryArgs, "NttStartDate",
						dao.wildcardForAnySequence());
				break;

			case NttNtwrkTrfTypeDMO.NttEndDateFilter:
				part.andFilterBy(queryArgs, "NttEndDate",
						dao.wildcardForAnySequence());
				break;

			case NttNtwrkTrfTypeDMO.NttContractPerFilter:
				part.andFilterBy(queryArgs, "NttContractPer",
						dao.wildcardForAnySequence());
				break;

			case NttNtwrkTrfTypeDMO.NttAllowSpMigrFilter:
				part.andFilterBy(queryArgs, "NttAllowSpMigr",
						dao.wildcardForAnySequence());
				break;

			case NttNtwrkTrfTypeDMO.NttAllowMsiSwapFilter:
				part.andFilterBy(queryArgs, "NttAllowMsiSwap",
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

	public NttNtwrkTrfTypeDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "NttNtwrkTrfType");

		return (NttNtwrkTrfTypeDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "NttNtwrkTrfType");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "NttNtwrkTrfType");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "NttNtwrkTrfType");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}