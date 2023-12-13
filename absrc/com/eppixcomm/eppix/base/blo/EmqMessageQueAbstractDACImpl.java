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

public class EmqMessageQueAbstractDACImpl extends DAC implements
		EmqMessageQueAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(EmqMessageQueAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public EmqMessageQueAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public EmqMessageQueAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public EmqMessageQueDMO get(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXSeriousException {
		logger.debug("get( emqMessageQueDMO )");

		thrower.ifParameterMissing("EmqMessageQueDMO", emqMessageQueDMO);

		return (EmqMessageQueDMO) dao.get(emqMessageQueDMO);
	}

	public void create(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXSeriousException {
		logger.debug("create( emqMessageQueDMO )");
		thrower.ifParameterMissing("WmqMessageQueDMO", emqMessageQueDMO);

		dao.insert(emqMessageQueDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new EmqMessageQueDMO(),
				filterQueryArgs(filter, "EmqMessageQue"));
	}

	public void delete(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( emqMessageQueDMO )");

		thrower.ifParameterMissing("EmqMessageQueDMO", emqMessageQueDMO);

		dao.delete(emqMessageQueDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "EmqMessageQue");

		dao.delete("EmqMessageQue", args.getFilterBy(), args);
	}

	public boolean exists(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EmqMessageQueDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, EmqMessageQueDMO.hmManuIdFilter,
		// emqMessageQueDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(emqMessageQueDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, emqMessageQueDMO )");

		return new DTOList(dao.getList(paramQueryArgs(emqMessageQueDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(EmqMessageQueDMO emqMessageQueDMO) {
		logger.debug("paramQueryArgs( emqMessageQueDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("EmqMessageQue",
				2 * 2);

		if (emqMessageQueDMO != null) {

			Integer EmqSerial = emqMessageQueDMO.getEmqSerial();

			if (!DMO.isNull(EmqSerial)) {
				queryArgs.andFilterBy("EmqSerialMatch").arg(EmqSerial);
			}

			Integer EmqMessageId = emqMessageQueDMO.getEmqMessageId();

			if (!DMO.isNull(EmqMessageId)) {
				queryArgs.andFilterBy("EmqMessageIdMatch").arg(EmqMessageId);
			}

			String EmqAccountNo = emqMessageQueDMO.getEmqAccountNo();

			if (!DMO.isNull(EmqAccountNo)) {
				queryArgs.andFilterBy("EmqAccountNoMatch").arg(EmqAccountNo);
			}

			String EmqMsisdnNo = emqMessageQueDMO.getEmqMsisdnNo();

			if (!DMO.isNull(EmqMsisdnNo)) {
				queryArgs.andFilterBy("EmqMsisdnNoMatch").arg(EmqMsisdnNo);
			}

			String EmqSimNo = emqMessageQueDMO.getEmqSimNo();

			if (!DMO.isNull(EmqSimNo)) {
				queryArgs.andFilterBy("EmqSimNoMatch").arg(EmqSimNo);
			}

			String EmqHistoryCode = emqMessageQueDMO.getEmqHistoryCode();

			if (!DMO.isNull(EmqHistoryCode)) {
				queryArgs.andFilterBy("EmqHistoryCodeMatch")
						.arg(EmqHistoryCode);
			}

			String EmqDocLoc = emqMessageQueDMO.getEmqDocLoc();

			if (!DMO.isNull(EmqDocLoc)) {
				queryArgs.andFilterBy("EmqDocLocMatch").arg(EmqDocLoc);
			}

			String EmqSender = emqMessageQueDMO.getEmqSender();

			if (!DMO.isNull(EmqSender)) {
				queryArgs.andFilterBy("EmqSenderMatch").arg(EmqSender);
			}

			String EmqReceiver = emqMessageQueDMO.getEmqReceiver();

			if (!DMO.isNull(EmqReceiver)) {
				queryArgs.andFilterBy("EmqReceiverMatch").arg(EmqReceiver);
			}

			String EmqSubject = emqMessageQueDMO.getEmqSubject();

			if (!DMO.isNull(EmqSubject)) {
				queryArgs.andFilterBy("EmqSubjectMatch").arg(EmqSubject);
			}

			String EmqAttention = emqMessageQueDMO.getEmqAttention();

			if (!DMO.isNull(EmqAttention)) {
				queryArgs.andFilterBy("EmqAttentionMatch").arg(EmqAttention);
			}

			String EmqOldValue = emqMessageQueDMO.getEmqOldValue();

			if (!DMO.isNull(EmqOldValue)) {
				queryArgs.andFilterBy("EmqOldValueMatch").arg(EmqOldValue);
			}

			String EmqNewValue = emqMessageQueDMO.getEmqNewValue();

			if (!DMO.isNull(EmqNewValue)) {
				queryArgs.andFilterBy("EmqNewValueMatch").arg(EmqNewValue);
			}

			Short EmqStatus = emqMessageQueDMO.getEmqStatus();

			if (!DMO.isNull(EmqStatus)) {
				queryArgs.andFilterBy("EmqStatusMatch").arg(EmqStatus);
			}

			String EmqComment = emqMessageQueDMO.getEmqComment();

			if (!DMO.isNull(EmqComment)) {
				queryArgs.andFilterBy("EmqCommentMatch").arg(EmqComment);
			}

			Date EmqSubmittedDate = emqMessageQueDMO.getEmqSubmittedDate();

			if (!DMO.isNull(EmqSubmittedDate)) {
				queryArgs.andFilterBy("EmqSubmittedDateMatch").arg(
						EmqSubmittedDate);
			}

			Date EmqProcessedDate = emqMessageQueDMO.getEmqProcessedDate();

			if (!DMO.isNull(EmqProcessedDate)) {
				queryArgs.andFilterBy("EmqProcessedDateMatch").arg(
						EmqProcessedDate);
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
				(dmlName == null) ? "EmqMessageQue" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case EmqMessageQueDMO.emqSerialFilter:
				part.andFilterBy(queryArgs, "emqSerial",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqMessageIdFilter:
				part.andFilterBy(queryArgs, "emqMessageId",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqAccountNoFilter:
				part.andFilterBy(queryArgs, "emqAccountNo",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqMsisdnNoFilter:
				part.andFilterBy(queryArgs, "emqMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqSimNoFilter:
				part.andFilterBy(queryArgs, "emqSimNo",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqHistoryCodeFilter:
				part.andFilterBy(queryArgs, "emqHistoryCode",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqDocLocFilter:
				part.andFilterBy(queryArgs, "emqDocLoc",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqSenderFilter:
				part.andFilterBy(queryArgs, "emqSender",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqReceiverFilter:
				part.andFilterBy(queryArgs, "emqReceiver",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqSubjectFilter:
				part.andFilterBy(queryArgs, "emqSubject",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqAttentionFilter:
				part.andFilterBy(queryArgs, "emqAttention",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqOldValueFilter:
				part.andFilterBy(queryArgs, "emqOldValue",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqNewValueFilter:
				part.andFilterBy(queryArgs, "emqNewValue",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqStatusFilter:
				part.andFilterBy(queryArgs, "emqStatus",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqCommentFilter:
				part.andFilterBy(queryArgs, "emqComment",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqSubmittedDateFilter:
				part.andFilterBy(queryArgs, "emqSubmittedDate",
						dao.wildcardForAnySequence());
				break;

			case EmqMessageQueDMO.emqProcessedDateFilter:
				part.andFilterBy(queryArgs, "emqProcessedDate",
						dao.wildcardForAnySequence());
				break;

				
			case EmqMessageQueDMO.emqMessagetypeFilter:
				part.andFilterBy(queryArgs, "emqMessageType",
						dao.wildcardForAnySequence());
				break;
				
			case EmqMessageQueDMO.emqMessIntervalFilter:
				part.andFilterBy(queryArgs, "emqMessInterval",
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

	public EmqMessageQueDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "EmqMessageQue");

		return (EmqMessageQueDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "EmqMessageQue");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "EmqMessageQue");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "EmqMessageQue");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}