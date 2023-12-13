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

public class VrrVrRecurringAbstractDACImpl extends DAC implements
		VrrVrRecurringAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(VrrVrRecurringAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public VrrVrRecurringAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public VrrVrRecurringAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public VrrVrRecurringDMO get(VrrVrRecurringDMO vrrVrRecurringDMO)
			throws EPPIXSeriousException {
		logger.debug("get( VrrVrRecurringDMO )");

		thrower.ifParameterMissing("VrrVrRecurringDMO", vrrVrRecurringDMO);

		return (VrrVrRecurringDMO) dao.get(vrrVrRecurringDMO);
	}

	public void create(VrrVrRecurringDMO vrrVrRecurringDMO)
			throws EPPIXSeriousException {
		logger.debug("create( vrrVrRecurringDMO )");
		thrower.ifParameterMissing("VrrVrRecurringDMO", vrrVrRecurringDMO);

		dao.insert(vrrVrRecurringDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new VrrVrRecurringDMO(),
				filterQueryArgs(filter, "VrrVrRecurring"));
	}

	public void delete(VrrVrRecurringDMO vrrVrRecurringDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( VrrVrRecurringDMO )");

		thrower.ifParameterMissing("VrrVrRecurringDMO", vrrVrRecurringDMO);

		dao.delete(vrrVrRecurringDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrrVrRecurring");

		dao.delete("VrrVrRecurring", args.getFilterBy(), args);
	}

	public boolean exists(VrrVrRecurringDMO vrrVrRecurringDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( VrrVrRecurringDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, VrrVrRecurringDMO.hmManuIdFilter,
		// vrrVrRecurringDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(vrrVrRecurringDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			VrrVrRecurringDMO vrrVrRecurringDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, vrrVrRecurringDMO )");

		return new DTOList(dao.getList(paramQueryArgs(vrrVrRecurringDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			VrrVrRecurringDMO vrrVrRecurringDMO) {
		logger.debug("paramQueryArgs( vrrVrRecurringDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("VrrVrRecurring",
				2 * 2);

		if (vrrVrRecurringDMO != null) {

			Integer VrrRecurringId = vrrVrRecurringDMO.getVrrRecurringId();

			if (!DMO.isNull(VrrRecurringId)) {
				queryArgs.andFilterBy("VrrRecurringIdMatch")
						.arg(VrrRecurringId);
			}

			Integer VrrSubscriberId = vrrVrRecurringDMO.getVrrSubscriberId();

			if (!DMO.isNull(VrrSubscriberId)) {
				queryArgs.andFilterBy("VrrSubscriberIdMatch").arg(
						VrrSubscriberId);
			}

			String VrrReceiver = vrrVrRecurringDMO.getVrrReceiver();

			if (!DMO.isNull(VrrReceiver)) {
				queryArgs.andFilterBy("VrrReceiverMatch").arg(VrrReceiver);
			}

			String VrrProvider = vrrVrRecurringDMO.getVrrProvider();

			if (!DMO.isNull(VrrProvider)) {
				queryArgs.andFilterBy("VrrProviderMatch").arg(VrrProvider);
			}

			Date VrrDateStart = vrrVrRecurringDMO.getVrrDateStart();

			if (!DMO.isNull(VrrDateStart)) {
				queryArgs.andFilterBy("VrrDateStartMatch").arg(VrrDateStart);
			}

			Date VrrDateTerm = vrrVrRecurringDMO.getVrrDateTerm();

			if (!DMO.isNull(VrrDateTerm)) {
				queryArgs.andFilterBy("VrrDateTermMatch").arg(VrrDateTerm);
			}

			Integer VrrTotRecharges = vrrVrRecurringDMO.getVrrTotRecharges();

			if (!DMO.isNull(VrrTotRecharges)) {
				queryArgs.andFilterBy("VrrTotRechargesMatch").arg(
						VrrTotRecharges);
			}

			Integer VrrNoBilling = vrrVrRecurringDMO.getVrrNoBilling();

			if (!DMO.isNull(VrrNoBilling)) {
				queryArgs.andFilterBy("VrrNoBillingMatch").arg(VrrNoBilling);
			}

			Integer VrrNoRecharge = vrrVrRecurringDMO.getVrrNoRecharge();

			if (!DMO.isNull(VrrNoRecharge)) {
				queryArgs.andFilterBy("VrrNoRechargeMatch").arg(VrrNoRecharge);
			}

			Float VrrRechargeAmt = vrrVrRecurringDMO.getVrrRechargeAmt();

			if (!DMO.isNull(VrrRechargeAmt)) {
				queryArgs.andFilterBy("VrrRechargeAmtMatch")
						.arg(VrrRechargeAmt);
			}

			String VrrStatus = vrrVrRecurringDMO.getVrrStatus();

			if (!DMO.isNull(VrrStatus)) {
				queryArgs.andFilterBy("VrrStatusMatch").arg(VrrStatus);
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
				(dmlName == null) ? "VrrVrRecurring" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case VrrVrRecurringDMO.VrrRecurringIdFilter:
				part.andFilterBy(queryArgs, "VrrRecurringId",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrSubscriberIdFilter:
				part.andFilterBy(queryArgs, "VrrSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrReceiverFilter:
				part.andFilterBy(queryArgs, "VrrReceiver",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrProviderFilter:
				part.andFilterBy(queryArgs, "VrrProvider",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrDateStartFilter:
				part.andFilterBy(queryArgs, "VrrDateStart",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrDateTermFilter:
				part.andFilterBy(queryArgs, "VrrDateTerm",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrTotRechargesFilter:
				part.andFilterBy(queryArgs, "VrrTotRecharges",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrNoBillingFilter:
				part.andFilterBy(queryArgs, "VrrNoBilling",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrNoRechargeFilter:
				part.andFilterBy(queryArgs, "VrrNoRecharge",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrRechargeAmtFilter:
				part.andFilterBy(queryArgs, "VrrRechargeAmt",
						dao.wildcardForAnySequence());
				break;

			case VrrVrRecurringDMO.VrrStatusFilter:
				part.andFilterBy(queryArgs, "VrrStatus",
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

	public VrrVrRecurringDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrrVrRecurring");

		return (VrrVrRecurringDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrrVrRecurring");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrrVrRecurring");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrrVrRecurring");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}