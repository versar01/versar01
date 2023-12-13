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

public class MsiMsisdnNosAbstractDACImpl extends DAC implements
		MsiMsisdnNosAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(MsiMsisdnNosAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public MsiMsisdnNosAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public MsiMsisdnNosAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public MsiMsisdnNosDMO get(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXSeriousException {
		logger.debug("get( MsiMsisdnNosDMO )");

		thrower.ifParameterMissing("MsiMsisdnNosDMO", msiMsisdnNosDMO);

		return (MsiMsisdnNosDMO) dao.get(msiMsisdnNosDMO);
	}

	public void create(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXSeriousException {
		logger.debug("create( msiMsisdnNosDMO )");
		thrower.ifParameterMissing("MsiMsisdnNosDMO", msiMsisdnNosDMO);

		dao.insert(msiMsisdnNosDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new MsiMsisdnNosDMO(),
				filterQueryArgs(filter, "MsiMsisdnNos"));
	}

	public void delete(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( MsiMsisdnNosDMO )");

		thrower.ifParameterMissing("MsiMsisdnNosDMO", msiMsisdnNosDMO);

		dao.delete(msiMsisdnNosDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "MsiMsisdnNos");

		dao.delete("MsiMsisdnNos", args.getFilterBy(), args);
	}

	public boolean exists(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( MsiMsisdnNosDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, MsiMsisdnNosDMO.hmManuIdFilter,
		// msiMsisdnNosDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(msiMsisdnNosDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, msiMsisdnNosDMO )");

		return new DTOList(dao.getList(paramQueryArgs(msiMsisdnNosDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(MsiMsisdnNosDMO msiMsisdnNosDMO) {
		logger.debug("paramQueryArgs( msiMsisdnNosDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("MsiMsisdnNos",
				2 * 2);

		if (msiMsisdnNosDMO != null) {

			String MsiOrigProvId = msiMsisdnNosDMO.getMsiOrigProvId();

			if (!DMO.isNull(MsiOrigProvId)) {
				queryArgs.andFilterBy("MsiOrigProvIdMatch").arg(MsiOrigProvId);
			}

			String MsiImpProvId = msiMsisdnNosDMO.getMsiImpProvId();

			if (!DMO.isNull(MsiImpProvId)) {
				queryArgs.andFilterBy("MsiImpProvIdMatch").arg(MsiImpProvId);
			}

			String MsiOrigServProv = msiMsisdnNosDMO.getMsiOrigServProv();

			if (!DMO.isNull(MsiOrigServProv)) {
				queryArgs.andFilterBy("MsiOrigServProvMatch").arg(
						MsiOrigServProv);
			}

			String MsiImpServProv = msiMsisdnNosDMO.getMsiImpServProv();

			if (!DMO.isNull(MsiImpServProv)) {
				queryArgs.andFilterBy("MsiImpServProvMatch")
						.arg(MsiImpServProv);
			}

			String MsiMsisdnNo = msiMsisdnNosDMO.getMsiMsisdnNo();

			if (!DMO.isNull(MsiMsisdnNo)) {
				queryArgs.andFilterBy("MsiMsisdnNoMatch").arg(MsiMsisdnNo);
			}

			Integer MsiSubscriberId = msiMsisdnNosDMO.getMsiSubscriberId();

			if (!DMO.isNull(MsiSubscriberId)) {
				queryArgs.andFilterBy("MsiSubscriberIdMatch").arg(
						MsiSubscriberId);
			}

			String MsiSimNo = msiMsisdnNosDMO.getMsiSimNo();

			if (!DMO.isNull(MsiSimNo)) {
				queryArgs.andFilterBy("MsiSimNoMatch").arg(MsiSimNo);
			}

			String MsiDealerId = msiMsisdnNosDMO.getMsiDealerId();

			if (!DMO.isNull(MsiDealerId)) {
				queryArgs.andFilterBy("MsiDealerIdMatch").arg(MsiDealerId);
			}

			String MsiBillAcNo = msiMsisdnNosDMO.getMsiBillAcNo();

			if (!DMO.isNull(MsiBillAcNo)) {
				queryArgs.andFilterBy("MsiBillAcNoMatch").arg(MsiBillAcNo);
			}

			Integer MsiPartnerId = msiMsisdnNosDMO.getMsiPartnerId();

			if (!DMO.isNull(MsiPartnerId)) {
				queryArgs.andFilterBy("MsiPartnerIdMatch").arg(MsiPartnerId);
			}

			String MsiApnPopId = msiMsisdnNosDMO.getMsiApnPopId();

			if (!DMO.isNull(MsiApnPopId)) {
				queryArgs.andFilterBy("MsiApnPopIdMatch").arg(MsiApnPopId);
			}

			String MsiAccType = msiMsisdnNosDMO.getMsiAccType();

			if (!DMO.isNull(MsiAccType)) {
				queryArgs.andFilterBy("MsiAccTypeMatch").arg(MsiAccType);
			}

			String MsiUserId = msiMsisdnNosDMO.getMsiUserId();

			if (!DMO.isNull(MsiUserId)) {
				queryArgs.andFilterBy("MsiUserIdMatch").arg(MsiUserId);
			}

			String MsiHlr = msiMsisdnNosDMO.getMsiHlr();

			if (!DMO.isNull(MsiHlr)) {
				queryArgs.andFilterBy("MsiHlrMatch").arg(MsiHlr);
			}

			String MsiStatus = msiMsisdnNosDMO.getMsiStatus();

			if (!DMO.isNull(MsiStatus)) {
				queryArgs.andFilterBy("MsiStatusMatch").arg(MsiStatus);
			}

			String MsiMsisdnType = msiMsisdnNosDMO.getMsiMsisdnType();

			if (!DMO.isNull(MsiMsisdnType)) {
				queryArgs.andFilterBy("MsiMsisdnTypeMatch").arg(MsiMsisdnType);
			}

			String MsiDummy = msiMsisdnNosDMO.getMsiDummy();

			if (!DMO.isNull(MsiDummy)) {
				queryArgs.andFilterBy("MsiDummyMatch").arg(MsiDummy);
			}

			String MsiCharAnal1 = msiMsisdnNosDMO.getMsiCharAnal1();

			if (!DMO.isNull(MsiCharAnal1)) {
				queryArgs.andFilterBy("MsiCharAnal1Match").arg(MsiCharAnal1);
			}

			String MsiCharAnal2 = msiMsisdnNosDMO.getMsiCharAnal2();

			if (!DMO.isNull(MsiCharAnal2)) {
				queryArgs.andFilterBy("MsiCharAnal2Match").arg(MsiCharAnal2);
			}

			String MsiCharAnal3 = msiMsisdnNosDMO.getMsiCharAnal3();

			if (!DMO.isNull(MsiCharAnal3)) {
				queryArgs.andFilterBy("MsiCharAnal3Match").arg(MsiCharAnal3);
			}

			String MsiCharAnal4 = msiMsisdnNosDMO.getMsiCharAnal4();

			if (!DMO.isNull(MsiCharAnal4)) {
				queryArgs.andFilterBy("MsiCharAnal4Match").arg(MsiCharAnal4);
			}

			String MsiCharAnal5 = msiMsisdnNosDMO.getMsiCharAnal5();

			if (!DMO.isNull(MsiCharAnal5)) {
				queryArgs.andFilterBy("MsiCharAnal5Match").arg(MsiCharAnal5);
			}

			Integer MsiIntAnal1 = msiMsisdnNosDMO.getMsiIntAnal1();

			if (!DMO.isNull(MsiIntAnal1)) {
				queryArgs.andFilterBy("MsiIntAnal1Match").arg(MsiIntAnal1);
			}

			Integer MsiIntAnal2 = msiMsisdnNosDMO.getMsiIntAnal2();

			if (!DMO.isNull(MsiIntAnal2)) {
				queryArgs.andFilterBy("MsiIntAnal2Match").arg(MsiIntAnal2);
			}

			Integer MsiIntAnal3 = msiMsisdnNosDMO.getMsiIntAnal3();

			if (!DMO.isNull(MsiIntAnal3)) {
				queryArgs.andFilterBy("MsiIntAnal3Match").arg(MsiIntAnal3);
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
				(dmlName == null) ? "MsiMsisdnNos" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case MsiMsisdnNosDMO.MsiOrigProvIdFilter:
				part.andFilterBy(queryArgs, "MsiOrigProvId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiImpProvIdFilter:
				part.andFilterBy(queryArgs, "MsiImpProvId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiOrigServProvFilter:
				part.andFilterBy(queryArgs, "MsiOrigServProv",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiImpServProvFilter:
				part.andFilterBy(queryArgs, "MsiImpServProv",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiMsisdnNoFilter:
				part.andFilterBy(queryArgs, "MsiMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiSubscriberIdFilter:
				part.andFilterBy(queryArgs, "MsiSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiSimNoFilter:
				part.andFilterBy(queryArgs, "MsiSimNo",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiDealerIdFilter:
				part.andFilterBy(queryArgs, "MsiDealerId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiBillAcNoFilter:
				part.andFilterBy(queryArgs, "MsiBillAcNo",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiPartnerIdFilter:
				part.andFilterBy(queryArgs, "MsiPartnerId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiApnPopIdFilter:
				part.andFilterBy(queryArgs, "MsiApnPopId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiAccTypeFilter:
				part.andFilterBy(queryArgs, "MsiAccType",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiUserIdFilter:
				part.andFilterBy(queryArgs, "MsiUserId",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiHlrFilter:
				part.andFilterBy(queryArgs, "MsiHlr",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiStatusFilter:
				part.andFilterBy(queryArgs, "MsiStatus",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiMsisdnTypeFilter:
				part.andFilterBy(queryArgs, "MsiMsisdnType",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiDummyFilter:
				part.andFilterBy(queryArgs, "MsiDummy",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiCharAnal1Filter:
				part.andFilterBy(queryArgs, "MsiCharAnal1",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiCharAnal2Filter:
				part.andFilterBy(queryArgs, "MsiCharAnal2",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiCharAnal3Filter:
				part.andFilterBy(queryArgs, "MsiCharAnal3",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiCharAnal4Filter:
				part.andFilterBy(queryArgs, "MsiCharAnal4",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiCharAnal5Filter:
				part.andFilterBy(queryArgs, "MsiCharAnal5",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiIntAnal1Filter:
				part.andFilterBy(queryArgs, "MsiIntAnal1",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiIntAnal2Filter:
				part.andFilterBy(queryArgs, "MsiIntAnal2",
						dao.wildcardForAnySequence());
				break;

			case MsiMsisdnNosDMO.MsiIntAnal3Filter:
				part.andFilterBy(queryArgs, "MsiIntAnal3",
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

	public MsiMsisdnNosDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "MsiMsisdnNos");

		return (MsiMsisdnNosDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "MsiMsisdnNos");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "MsiMsisdnNos");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "MsiMsisdnNos");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}