package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SfeSimFutEventAbstractDACImpl extends DAC implements
		SfeSimFutEventAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PshParamServHdrAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public SfeSimFutEventAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SfeSimFutEventDMO get(SfeSimFutEventDMO sfeSimFutEventDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SfeSimFutEventDMO )");

		thrower.ifParameterMissing("SfeSimFutEventDMO", sfeSimFutEventDMO);
		thrower.ifParameterMissing("SfeSimFutEventDMO.getSfeSimNo()", sfeSimFutEventDMO.getSfeSimNo());
		thrower.ifParameterMissing("SfeSimFutEventDMO.getSfeMsisdnNo()", sfeSimFutEventDMO.getSfeMsisdnNo());
		thrower.ifParameterMissing("SfeSimFutEventDMO.getSfeServiceCode()", sfeSimFutEventDMO.getSfeServiceCode());

		return (SfeSimFutEventDMO) dao.get(sfeSimFutEventDMO);
	}

	public void create(SfeSimFutEventDMO sfeSimFutEventDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sfeSimFutEventDMO )");
		thrower.ifParameterMissing("SfeSimFutEventDMO", sfeSimFutEventDMO);

		dao.insert(sfeSimFutEventDMO);

	}

	public void modify(SfeSimFutEventDMO sfeSimFutEventDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( sfeSimFutEventDMO )");

		thrower.ifParameterMissing("sfeSimFutEventDMO", sfeSimFutEventDMO);
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeSimNo()",
				sfeSimFutEventDMO.getSfeSimNo());
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeMsisdnNo()",
				sfeSimFutEventDMO.getSfeMsisdnNo());
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeServiceCode()",
				sfeSimFutEventDMO.getSfeServiceCode());

		dao.update(sfeSimFutEventDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SfeSimFutEventDMO(), filterQueryArgs(filter, null));
	}

	public void delete(SfeSimFutEventDMO sfeSimFutEventDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( sfeSimFutEventDMO )");

		thrower.ifParameterMissing("sfeSimFutEventDMO", sfeSimFutEventDMO);
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeSimNo()",
				sfeSimFutEventDMO.getSfeSimNo());
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeMsisdnNo()",
				sfeSimFutEventDMO.getSfeMsisdnNo());
		thrower.ifParameterMissing("sfeSimFutEventDMO.getSfeServiceCode()",
				sfeSimFutEventDMO.getSfeServiceCode());

		dao.delete(sfeSimFutEventDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("SfeSimFutEvent", args.getFilterBy(), args);
	}

	public boolean exists(SfeSimFutEventDMO sfeSimFutEventDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( sfeSimFutEventDMO)");

		return dao.exists(
				"SfeSimFutEvent",
				"filterByPrimaryKey",
				new DAOArgs(3).arg(sfeSimFutEventDMO.getSfeSimNo())
						.arg(sfeSimFutEventDMO.getSfeMsisdnNo())
						.arg(sfeSimFutEventDMO.getSfeServiceCode()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SfeSimFutEventDMO sfeSimFutEventDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, sfeSimFutEventDMO )");

		return new DTOList(dao.getList(paramQueryArgs(sfeSimFutEventDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SfeSimFutEventDMO sfeSimFutEventDMO) {
		logger.debug("paramQueryArgs( sfeSimFutEventDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SfeSimFutEvent",
				6 * 2);

		if (sfeSimFutEventDMO != null) {
			// define more filters...
			String sfeCommand = sfeSimFutEventDMO.getSfeCommand();

			if (!DMO.isNull(sfeCommand)) {
				queryArgs.andFilterBy("SfeCommandMatch").arg(
						sfeCommand + dao.wildcardForAnySequence());
			}

			String sfeErrorComment = sfeSimFutEventDMO.getSfeErrorComment();

			if (!DMO.isNull(sfeErrorComment)) {
				queryArgs.andFilterBy("SfeErrorCommentMatch").arg(
						sfeErrorComment + dao.wildcardForAnySequence());
			}

			String sfeFutEventId = sfeSimFutEventDMO.getSfeFutEventId();

			if (!DMO.isNull(sfeFutEventId)) {
				queryArgs.andFilterBy("SfeFutEventIdMatch").arg(
						sfeFutEventId + dao.wildcardForAnySequence());
			}

			String sfeMsisdnNo = sfeSimFutEventDMO.getSfeMsisdnNo();

			if (!DMO.isNull(sfeMsisdnNo)) {
				queryArgs.andFilterBy("SfeMsisdnNoMatch").arg(
						sfeMsisdnNo + dao.wildcardForAnySequence());
			}

			// define more filters...
			String sfeServiceCode = sfeSimFutEventDMO.getSfeServiceCode();

			if (!DMO.isNull(sfeServiceCode)) {
				queryArgs.andFilterBy("SfeServiceCodeMatch").arg(
						sfeServiceCode + dao.wildcardForAnySequence());
			}

			String sfeSimNo = sfeSimFutEventDMO.getSfeSimNo();

			if (!DMO.isNull(sfeSimNo)) {
				queryArgs.andFilterBy("SfeSimNoMatch").arg(
						sfeSimNo + dao.wildcardForAnySequence());
			}

			Date sfeDventDate = sfeSimFutEventDMO.getSfeDventDate();

			if (!DMO.isNull(sfeDventDate)) {
				queryArgs.andFilterBy("SfeDventDateMatch").arg(
						sfeDventDate + dao.wildcardForAnySequence());
			}

			Short sfeOrigStatus = sfeSimFutEventDMO.getSfeOrigStatus();

			if (!DMO.isNull(sfeOrigStatus)) {
				queryArgs.andFilterBy("SfeOrigStatusMatch").arg(
						sfeOrigStatus + dao.wildcardForAnySequence());
			}

			Integer sfeSubscriberId = sfeSimFutEventDMO.getSfeSubscriberId();

			if (!DMO.isNull(sfeSubscriberId)) {
				queryArgs.andFilterBy("SfeSubscriberIdMatch").arg(
						sfeSubscriberId + dao.wildcardForAnySequence());
			}

			DateTime sfeTimestamp = sfeSimFutEventDMO.getSfeTimestamp();

			if (!DMO.isNull(sfeTimestamp)) {
				queryArgs.andFilterBy("SfeTimestampMatch").arg(
						sfeTimestamp + dao.wildcardForAnySequence());
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
				(dmlName == null) ? "SfeSimFutEvent" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();
			// for ( FilterPart part : parts ) {
			switch (part.getIndex()) {
			case SfeSimFutEventDMO.sfeCommandFilter:
				part.andFilterBy(queryArgs, "SfeCommand",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeDventDateFilter:
				part.andFilterBy(queryArgs, "SfeDventDate",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeErrorCommentFilter:
				part.andFilterBy(queryArgs, "SfeErrorComment",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeFutEventIdFilter:
				part.andFilterBy(queryArgs, "SfeFutEventId",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeMsisdnNoFilter:
				part.andFilterBy(queryArgs, "SfeMsisdnNo",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeOrigStatusFilter:
				part.andFilterBy(queryArgs, "SfeOrigStatus",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeServiceCodeFilter:
				part.andFilterBy(queryArgs, "SfeServiceCode",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeSimNoFilter:
				part.andFilterBy(queryArgs, "SfeSimNo",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeSubscriberIdFilter:
				part.andFilterBy(queryArgs, "SfeSubscriberId",
						dao.wildcardForAnySequence());

				break;

			case SfeSimFutEventDMO.sfeTimestampFilter:
				part.andFilterBy(queryArgs, "SfeTimestamp",
						dao.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");
		return dao.iterator( filterQueryArgs( filter, null ) );
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return null;
	}

	public SfeSimFutEventDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (SfeSimFutEventDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}
}