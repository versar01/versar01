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

public class VriVrRegInfoAbstractDACImpl extends DAC implements
		VriVrRegInfoAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(VriVrRegInfoAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public VriVrRegInfoAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public VriVrRegInfoAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public VriVrRegInfoDMO get(VriVrRegInfoDMO vriVrRegInfoDMO)
			throws EPPIXSeriousException {
		logger.debug("get( VriVrRegInfoDMO )");

		thrower.ifParameterMissing("VriVrRegInfoDMO", vriVrRegInfoDMO);

		return (VriVrRegInfoDMO) dao.get(vriVrRegInfoDMO);
	}

	public void create(VriVrRegInfoDMO vriVrRegInfoDMO)
			throws EPPIXSeriousException {
		logger.debug("create( vriVrRegInfoDMO )");
		thrower.ifParameterMissing("VriVrRegInfoDMO", vriVrRegInfoDMO);

		dao.insert(vriVrRegInfoDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new VriVrRegInfoDMO(),
				filterQueryArgs(filter, "VriVrRegInfo"));
	}

	public void delete(VriVrRegInfoDMO vriVrRegInfoDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( VriVrRegInfoDMO )");

		thrower.ifParameterMissing("VriVrRegInfoDMO", vriVrRegInfoDMO);

		dao.delete(vriVrRegInfoDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "VriVrRegInfo");

		dao.delete("VriVrRegInfo", args.getFilterBy(), args);
	}

	public boolean exists(VriVrRegInfoDMO vriVrRegInfoDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( VriVrRegInfoDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, VriVrRegInfoDMO.hmManuIdFilter,
		// vriVrRegInfoDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(vriVrRegInfoDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, VriVrRegInfoDMO vriVrRegInfoDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, vriVrRegInfoDMO )");

		return new DTOList(dao.getList(paramQueryArgs(vriVrRegInfoDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(VriVrRegInfoDMO vriVrRegInfoDMO) {
		logger.debug("paramQueryArgs( vriVrRegInfoDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("VriVrRegInfo",
				2 * 2);

		if (vriVrRegInfoDMO != null) {

			Integer VriId = vriVrRegInfoDMO.getVriId();

			if (!DMO.isNull(VriId)) {
				queryArgs.andFilterBy("VriIdMatch").arg(VriId);
			}

			Integer VriVraId = vriVrRegInfoDMO.getVriVraId();

			if (!DMO.isNull(VriVraId)) {
				queryArgs.andFilterBy("VriVraIdMatch").arg(VriVraId);
			}

			String VriMsisdnNo = vriVrRegInfoDMO.getVriMsisdnNo();

			if (!DMO.isNull(VriMsisdnNo)) {
				queryArgs.andFilterBy("VriMsisdnNoMatch").arg(VriMsisdnNo);
			}

			Integer VriLevel = vriVrRegInfoDMO.getVriLevel();

			if (!DMO.isNull(VriLevel)) {
				queryArgs.andFilterBy("VriLevelMatch").arg(VriLevel);
			}

			String VriProvider = vriVrRegInfoDMO.getVriProvider();

			if (!DMO.isNull(VriProvider)) {
				queryArgs.andFilterBy("VriProviderMatch").arg(VriProvider);
			}

			Float VriOnceOffLimit = vriVrRegInfoDMO.getVriOnceOffLimit();

			if (!DMO.isNull(VriOnceOffLimit)) {
				queryArgs.andFilterBy("VriOnceOffLimitMatch").arg(
						VriOnceOffLimit);
			}

			Float VriRecurLimit = vriVrRegInfoDMO.getVriRecurLimit();

			if (!DMO.isNull(VriRecurLimit)) {
				queryArgs.andFilterBy("VriRecurLimitMatch").arg(VriRecurLimit);
			}

			String VriLimitType = vriVrRegInfoDMO.getVriLimitType();

			if (!DMO.isNull(VriLimitType)) {
				queryArgs.andFilterBy("VriLimitTypeMatch").arg(VriLimitType);
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
				(dmlName == null) ? "VriVrRegInfo" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case VriVrRegInfoDMO.VriIdFilter:
				part.andFilterBy(queryArgs, "VriId",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriVraIdFilter:
				part.andFilterBy(queryArgs, "VriVraId",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriMsisdnNoFilter:
				part.andFilterBy(queryArgs, "VriMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriLevelFilter:
				part.andFilterBy(queryArgs, "VriLevel",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriProviderFilter:
				part.andFilterBy(queryArgs, "VriProvider",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriOnceOffLimitFilter:
				part.andFilterBy(queryArgs, "VriOnceOffLimit",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriRecurLimitFilter:
				part.andFilterBy(queryArgs, "VriRecurLimit",
						dao.wildcardForAnySequence());
				break;

			case VriVrRegInfoDMO.VriLimitTypeFilter:
				part.andFilterBy(queryArgs, "VriLimitType",
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

	public VriVrRegInfoDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VriVrRegInfo");

		return (VriVrRegInfoDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VriVrRegInfo");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VriVrRegInfo");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VriVrRegInfo");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}