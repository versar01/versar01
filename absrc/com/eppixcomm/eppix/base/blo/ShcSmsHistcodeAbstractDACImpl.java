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

public class ShcSmsHistcodeAbstractDACImpl extends DAC implements
		ShcSmsHistcodeAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(ShcSmsHistcodeAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public ShcSmsHistcodeAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public ShcSmsHistcodeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public ShcSmsHistcodeDMO get(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXSeriousException {
		logger.debug("get( ShcSmsHistcodeDMO )");

		thrower.ifParameterMissing("ShcSmsHistcodeDMO", shcSmsHistcodeDMO);

		return (ShcSmsHistcodeDMO) dao.get(shcSmsHistcodeDMO);
	}

	public void create(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXSeriousException {
		logger.debug("create( shcSmsHistcodeDMO )");
		thrower.ifParameterMissing("ShcSmsHistcodeDMO", shcSmsHistcodeDMO);

		dao.insert(shcSmsHistcodeDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new ShcSmsHistcodeDMO(),
				filterQueryArgs(filter, "ShcSmsHistcode"));
	}

	public void delete(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( ShcSmsHistcodeDMO )");

		thrower.ifParameterMissing("ShcSmsHistcodeDMO", shcSmsHistcodeDMO);

		dao.delete(shcSmsHistcodeDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "ShcSmsHistcode");

		dao.delete("ShcSmsHistcode", args.getFilterBy(), args);
	}

	public boolean exists(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( ShcSmsHistcodeDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, ShcSmsHistcodeDMO.hmManuIdFilter,
		// shcSmsHistcodeDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(shcSmsHistcodeDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			ShcSmsHistcodeDMO shcSmsHistcodeDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, shcSmsHistcodeDMO )");

		return new DTOList(dao.getList(paramQueryArgs(shcSmsHistcodeDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			ShcSmsHistcodeDMO shcSmsHistcodeDMO) {
		logger.debug("paramQueryArgs( shcSmsHistcodeDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("ShcSmsHistcode",
				2 * 2);

		if (shcSmsHistcodeDMO != null) {

			Integer ShcMesgId = shcSmsHistcodeDMO.getShcMesgId();

			if (!DMO.isNull(ShcMesgId)) {
				queryArgs.andFilterBy("ShcMesgIdMatch").arg(ShcMesgId);
			}

			String ShcHistCode = shcSmsHistcodeDMO.getShcHistCode();

			if (!DMO.isNull(ShcHistCode)) {
				queryArgs.andFilterBy("ShcHistCodeMatch").arg(ShcHistCode);
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
				(dmlName == null) ? "ShcSmsHistcode" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case ShcSmsHistcodeDMO.ShcMesgIdFilter:
				part.andFilterBy(queryArgs, "ShcMesgId",
						dao.wildcardForAnySequence());
				break;

			case ShcSmsHistcodeDMO.ShcHistCodeFilter:
				part.andFilterBy(queryArgs, "ShcHistCode",
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

	public ShcSmsHistcodeDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "ShcSmsHistcode");

		return (ShcSmsHistcodeDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "ShcSmsHistcode");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "ShcSmsHistcode");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "ShcSmsHistcode");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}