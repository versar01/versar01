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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SpcParamConfigAbstractDACImpl extends DAC implements
		SpcParamConfigAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SpcParamConfigAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SpcParamConfigAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SpcParamConfigAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SpcParamConfigDMO get(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SpcParamConfigDMO )");

		thrower.ifParameterMissing("SpcParamConfigDMO", spcParamConfigDMO);

		return (SpcParamConfigDMO) dao.get(spcParamConfigDMO);
	}

	public void create(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXSeriousException {
		logger.debug("create( spcParamConfigDMO )");
		thrower.ifParameterMissing("SpcParamConfigDMO", spcParamConfigDMO);

		dao.insert(spcParamConfigDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SpcParamConfigDMO(),
				filterQueryArgs(filter, "SpcParamConfig"));
	}

	public void delete(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SpcParamConfigDMO )");

		thrower.ifParameterMissing("SpcParamConfigDMO", spcParamConfigDMO);

		dao.delete(spcParamConfigDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SpcParamConfig");

		dao.delete("SpcParamConfig", args.getFilterBy(), args);
	}

	public boolean exists(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SpcParamConfigDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SpcParamConfigDMO.hmManuIdFilter,
		// spcParamConfigDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(spcParamConfigDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SpcParamConfigDMO spcParamConfigDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, spcParamConfigDMO )");

		return new DTOList(dao.getList(paramQueryArgs(spcParamConfigDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SpcParamConfigDMO spcParamConfigDMO) {
		logger.debug("paramQueryArgs( spcParamConfigDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SpcParamConfig",
				2 * 2);

		if (spcParamConfigDMO != null) {

			Integer SpcParamId = spcParamConfigDMO.getSpcParamId();

			if (!DMO.isNull(SpcParamId)) {
				queryArgs.andFilterBy("SpcParamIdMatch").arg(SpcParamId);
			}

			String SpcParamName = spcParamConfigDMO.getSpcParamName();

			if (!DMO.isNull(SpcParamName)) {
				queryArgs.andFilterBy("SpcParamNameMatch").arg(SpcParamName);
			}

			String SpcServiceCode = spcParamConfigDMO.getSpcServiceCode();

			if (!DMO.isNull(SpcServiceCode)) {
				queryArgs.andFilterBy("SpcServiceCodeMatch")
						.arg(SpcServiceCode);
			}

			String SpcServiceType = spcParamConfigDMO.getSpcServiceType();

			if (!DMO.isNull(SpcServiceType)) {
				queryArgs.andFilterBy("SpcServiceTypeMatch")
						.arg(SpcServiceType);
			}

			String SpcLockToTariff = spcParamConfigDMO.getSpcLockToTariff();

			if (!DMO.isNull(SpcLockToTariff)) {
				queryArgs.andFilterBy("SpcLockToTariffMatch").arg(
						SpcLockToTariff);
			}

			String SpcLockToPack = spcParamConfigDMO.getSpcLockToPack();

			if (!DMO.isNull(SpcLockToPack)) {
				queryArgs.andFilterBy("SpcLockToPackMatch").arg(SpcLockToPack);
			}

			String SpcValueType = spcParamConfigDMO.getSpcValueType();

			if (!DMO.isNull(SpcValueType)) {
				queryArgs.andFilterBy("SpcValueTypeMatch").arg(SpcValueType);
			}

			String SpcExclusionRule = spcParamConfigDMO.getSpcExclusionRule();

			if (!DMO.isNull(SpcExclusionRule)) {
				queryArgs.andFilterBy("SpcExclusionRuleMatch").arg(
						SpcExclusionRule);
			}

			String SpcLegalEntity = spcParamConfigDMO.getSpcLegalEntity();

			if (!DMO.isNull(SpcLegalEntity)) {
				queryArgs.andFilterBy("SpcLegalEntityMatch")
						.arg(SpcLegalEntity);
			}

			Integer SpcContrPeriod = spcParamConfigDMO.getSpcContrPeriod();

			if (!DMO.isNull(SpcContrPeriod)) {
				queryArgs.andFilterBy("SpcContrPeriodMatch")
						.arg(SpcContrPeriod);
			}

			String SpcCanTerm = spcParamConfigDMO.getSpcCanTerm();

			if (!DMO.isNull(SpcCanTerm)) {
				queryArgs.andFilterBy("SpcCanTermMatch").arg(SpcCanTerm);
			}

			String SpcTaxInv = spcParamConfigDMO.getSpcTaxInv();

			if (!DMO.isNull(SpcTaxInv)) {
				queryArgs.andFilterBy("SpcTaxInvMatch").arg(SpcTaxInv);
			}

			String SpcParamProrata = spcParamConfigDMO.getSpcParamProrata();

			if (!DMO.isNull(SpcParamProrata)) {
				queryArgs.andFilterBy("SpcParamProrataMatch").arg(
						SpcParamProrata);
			}

			String SpcNodeString = spcParamConfigDMO.getSpcNodeString();

			if (!DMO.isNull(SpcNodeString)) {
				queryArgs.andFilterBy("SpcNodeStringMatch").arg(SpcNodeString);
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
				(dmlName == null) ? "SpcParamConfig" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SpcParamConfigDMO.spcParamIdFilter:
				part.andFilterBy(queryArgs, "SpcParamId",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcParamNameFilter:
				part.andFilterBy(queryArgs, "SpcParamName",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcServiceCodeFilter:
				part.andFilterBy(queryArgs, "SpcServiceCode",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcServiceTypeFilter:
				part.andFilterBy(queryArgs, "SpcServiceType",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcLockToTariffFilter:
				part.andFilterBy(queryArgs, "SpcLockToTariff",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcLockToPackFilter:
				part.andFilterBy(queryArgs, "SpcLockToPack",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcValueTypeFilter:
				part.andFilterBy(queryArgs, "SpcValueType",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcExclusionRuleFilter:
				part.andFilterBy(queryArgs, "SpcExclusionRule",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcLegalEntityFilter:
				part.andFilterBy(queryArgs, "SpcLegalEntity",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcContrPeriodFilter:
				part.andFilterBy(queryArgs, "SpcContrPeriod",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcCanTermFilter:
				part.andFilterBy(queryArgs, "SpcCanTerm",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcTaxInvFilter:
				part.andFilterBy(queryArgs, "SpcTaxInv",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcParamProrataFilter:
				part.andFilterBy(queryArgs, "SpcParamProrata",
						dao.wildcardForAnySequence());
				break;

			case SpcParamConfigDMO.spcNodeStringFilter:
				part.andFilterBy(queryArgs, "SpcNodeString",
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

	public SpcParamConfigDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SpcParamConfig");

		return (SpcParamConfigDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SpcParamConfig");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SpcParamConfig");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SpcParamConfig");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}