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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class TpaTariffAuxAbstractDACImpl extends DAC implements
		TpaTariffAuxAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(TpaTariffAuxAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public TpaTariffAuxAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public TpaTariffAuxAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public TpaTariffAuxDMO get(TpaTariffAuxDMO tpaTariffAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("get( TpaTariffAuxDMO )");

		thrower.ifParameterMissing("TpaTariffAuxDMO", tpaTariffAuxDMO);

		return (TpaTariffAuxDMO) dao.get(tpaTariffAuxDMO);
	}

	public void create(TpaTariffAuxDMO tpaTariffAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("create( tpaTariffAuxDMO )");
		thrower.ifParameterMissing("TpaTariffAuxDMO", tpaTariffAuxDMO);

		dao.insert(tpaTariffAuxDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new TpaTariffAuxDMO(),
				filterQueryArgs(filter, "TpaTariffAux"));
	}

	public void delete(TpaTariffAuxDMO tpaTariffAuxDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( TpaTariffAuxDMO )");

		thrower.ifParameterMissing("TpaTariffAuxDMO", tpaTariffAuxDMO);

		dao.delete(tpaTariffAuxDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "TpaTariffAux");

		dao.delete("TpaTariffAux", args.getFilterBy(), args);
	}

	public boolean exists(TpaTariffAuxDMO tpaTariffAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( TpaTariffAuxDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, TpaTariffAuxDMO.hmManuIdFilter,
		// tpaTariffAuxDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(tpaTariffAuxDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, TpaTariffAuxDMO tpaTariffAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, tpaTariffAuxDMO )");

		return new DTOList(dao.getList(paramQueryArgs(tpaTariffAuxDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(TpaTariffAuxDMO tpaTariffAuxDMO) {
		logger.debug("paramQueryArgs( tpaTariffAuxDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("TpaTariffAux",
				2 * 2);

		if (tpaTariffAuxDMO != null) {

			String TpaTariff = tpaTariffAuxDMO.getTpaTariff();

			if (!DMO.isNull(TpaTariff)) {
				queryArgs.andFilterBy("TpaTariffMatch").arg(TpaTariff);
			}

			String TpaAudience = tpaTariffAuxDMO.getTpaAudience();

			if (!DMO.isNull(TpaAudience)) {
				queryArgs.andFilterBy("TpaAudienceMatch").arg(TpaAudience);
			}

			Float TpaPromoSub = tpaTariffAuxDMO.getTpaPromoSub();

			if (!DMO.isNull(TpaPromoSub)) {
				queryArgs.andFilterBy("TpaPromoSubMatch").arg(TpaPromoSub);
			}

			Float TpaNormalSub = tpaTariffAuxDMO.getTpaNormalSub();

			if (!DMO.isNull(TpaNormalSub)) {
				queryArgs.andFilterBy("TpaNormalSubMatch").arg(TpaNormalSub);
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
				(dmlName == null) ? "TpaTariffAux" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case TpaTariffAuxDMO.TpaTariffFilter:
				part.andFilterBy(queryArgs, "TpaTariff",
						dao.wildcardForAnySequence());
				break;

			case TpaTariffAuxDMO.TpaAudienceFilter:
				part.andFilterBy(queryArgs, "TpaAudience",
						dao.wildcardForAnySequence());
				break;

			case TpaTariffAuxDMO.TpaPromoSubFilter:
				part.andFilterBy(queryArgs, "TpaPromoSub",
						dao.wildcardForAnySequence());
				break;

			case TpaTariffAuxDMO.TpaNormalSubFilter:
				part.andFilterBy(queryArgs, "TpaNormalSub",
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

	public TpaTariffAuxDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "TpaTariffAux");

		return (TpaTariffAuxDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "TpaTariffAux");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "TpaTariffAux");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "TpaTariffAux");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}