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

public class SmqSmsMesgQueueAbstractDACImpl extends DAC implements
		SmqSmsMesgQueueAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SmqSmsMesgQueueAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SmqSmsMesgQueueAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SmqSmsMesgQueueAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SmqSmsMesgQueueDMO get(SmqSmsMesgQueueDMO smqSmsMesgQueueDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SmqSmsMesgQueueDMO )");

		thrower.ifParameterMissing("SmqSmsMesgQueueDMO", smqSmsMesgQueueDMO);

		return (SmqSmsMesgQueueDMO) dao.get(smqSmsMesgQueueDMO);
	}

	public void create(SmqSmsMesgQueueDMO smqSmsMesgQueueDMO)
			throws EPPIXSeriousException {
		logger.debug("create( smqSmsMesgQueueDMO )");
		thrower.ifParameterMissing("SmqSmsMesgQueueDMO", smqSmsMesgQueueDMO);

		dao.insert(smqSmsMesgQueueDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SmqSmsMesgQueueDMO(),
				filterQueryArgs(filter, "SmqSmsMesgQueue"));
	}

	public void delete(SmqSmsMesgQueueDMO smqSmsMesgQueueDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SmqSmsMesgQueueDMO )");

		thrower.ifParameterMissing("SmqSmsMesgQueueDMO", smqSmsMesgQueueDMO);

		dao.delete(smqSmsMesgQueueDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SmqSmsMesgQueue");

		dao.delete("SmqSmsMesgQueue", args.getFilterBy(), args);
	}

	public boolean exists(SmqSmsMesgQueueDMO smqSmsMesgQueueDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SmqSmsMesgQueueDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SmqSmsMesgQueueDMO.hmManuIdFilter,
		// smqSmsMesgQueueDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(smqSmsMesgQueueDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SmqSmsMesgQueueDMO smqSmsMesgQueueDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, smqSmsMesgQueueDMO )");

		return new DTOList(dao.getList(paramQueryArgs(smqSmsMesgQueueDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SmqSmsMesgQueueDMO smqSmsMesgQueueDMO) {
		logger.debug("paramQueryArgs( smqSmsMesgQueueDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SmqSmsMesgQueue",
				2 * 2);

		if (smqSmsMesgQueueDMO != null) {

			Integer SmqId = smqSmsMesgQueueDMO.getSmqId();

			if (!DMO.isNull(SmqId)) {
				queryArgs.andFilterBy("SmqIdMatch").arg(SmqId);
			}

			Integer SmqMesgId = smqSmsMesgQueueDMO.getSmqMesgId();

			if (!DMO.isNull(SmqMesgId)) {
				queryArgs.andFilterBy("SmqMesgIdMatch").arg(SmqMesgId);
			}

			String SmqAccNo = smqSmsMesgQueueDMO.getSmqAccNo();

			if (!DMO.isNull(SmqAccNo)) {
				queryArgs.andFilterBy("SmqAccNoMatch").arg(SmqAccNo);
			}

			Integer SmqSubsId = smqSmsMesgQueueDMO.getSmqSubsId();

			if (!DMO.isNull(SmqSubsId)) {
				queryArgs.andFilterBy("SmqSubsIdMatch").arg(SmqSubsId);
			}

			String SmqMsisdnNo = smqSmsMesgQueueDMO.getSmqMsisdnNo();

			if (!DMO.isNull(SmqMsisdnNo)) {
				queryArgs.andFilterBy("SmqMsisdnNoMatch").arg(SmqMsisdnNo);
			}

			String SmqSimNo = smqSmsMesgQueueDMO.getSmqSimNo();

			if (!DMO.isNull(SmqSimNo)) {
				queryArgs.andFilterBy("SmqSimNoMatch").arg(SmqSimNo);
			}

			String SmqOldValue = smqSmsMesgQueueDMO.getSmqOldValue();

			if (!DMO.isNull(SmqOldValue)) {
				queryArgs.andFilterBy("SmqOldValueMatch").arg(SmqOldValue);
			}

			String SmqNewValue = smqSmsMesgQueueDMO.getSmqNewValue();

			if (!DMO.isNull(SmqNewValue)) {
				queryArgs.andFilterBy("SmqNewValueMatch").arg(SmqNewValue);
			}

			String SmqComment1 = smqSmsMesgQueueDMO.getSmqComment1();

			if (!DMO.isNull(SmqComment1)) {
				queryArgs.andFilterBy("SmqComment1Match").arg(SmqComment1);
			}

			String SmqComment2 = smqSmsMesgQueueDMO.getSmqComment2();

			if (!DMO.isNull(SmqComment2)) {
				queryArgs.andFilterBy("SmqComment2Match").arg(SmqComment2);
			}

			String SmqOperator = smqSmsMesgQueueDMO.getSmqOperator();

			if (!DMO.isNull(SmqOperator)) {
				queryArgs.andFilterBy("SmqOperatorMatch").arg(SmqOperator);
			}

			String SmqTty = smqSmsMesgQueueDMO.getSmqTty();

			if (!DMO.isNull(SmqTty)) {
				queryArgs.andFilterBy("SmqTtyMatch").arg(SmqTty);
			}

			Integer SmqStatus = smqSmsMesgQueueDMO.getSmqStatus();

			if (!DMO.isNull(SmqStatus)) {
				queryArgs.andFilterBy("SmqStatusMatch").arg(SmqStatus);
			}

			Date SmqDate = smqSmsMesgQueueDMO.getSmqDate();

			if (!DMO.isNull(SmqDate)) {
				queryArgs.andFilterBy("SmqDateMatch").arg(SmqDate);
			}

			String SmqSentMsisdn = smqSmsMesgQueueDMO.getSmqSentMsisdn();

			if (!DMO.isNull(SmqSentMsisdn)) {
				queryArgs.andFilterBy("SmqSentMsisdnMatch").arg(SmqSentMsisdn);
			}

			Integer SmqRetry = smqSmsMesgQueueDMO.getSmqRetry();

			if (!DMO.isNull(SmqRetry)) {
				queryArgs.andFilterBy("SmqRetryMatch").arg(SmqRetry);
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
				(dmlName == null) ? "SmqSmsMesgQueue" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SmqSmsMesgQueueDMO.SmqIdFilter:
				part.andFilterBy(queryArgs, "SmqId",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqMesgIdFilter:
				part.andFilterBy(queryArgs, "SmqMesgId",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqAccNoFilter:
				part.andFilterBy(queryArgs, "SmqAccNo",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqSubsIdFilter:
				part.andFilterBy(queryArgs, "SmqSubsId",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqMsisdnNoFilter:
				part.andFilterBy(queryArgs, "SmqMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqSimNoFilter:
				part.andFilterBy(queryArgs, "SmqSimNo",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqOldValueFilter:
				part.andFilterBy(queryArgs, "SmqOldValue",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqNewValueFilter:
				part.andFilterBy(queryArgs, "SmqNewValue",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqComment1Filter:
				part.andFilterBy(queryArgs, "SmqComment1",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqComment2Filter:
				part.andFilterBy(queryArgs, "SmqComment2",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqOperatorFilter:
				part.andFilterBy(queryArgs, "SmqOperator",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqTtyFilter:
				part.andFilterBy(queryArgs, "SmqTty",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqStatusFilter:
				part.andFilterBy(queryArgs, "SmqStatus",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqDateFilter:
				part.andFilterBy(queryArgs, "SmqDate",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqSentMsisdnFilter:
				part.andFilterBy(queryArgs, "SmqSentMsisdn",
						dao.wildcardForAnySequence());
				break;

			case SmqSmsMesgQueueDMO.SmqRetryFilter:
				part.andFilterBy(queryArgs, "SmqRetry",
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

	public SmqSmsMesgQueueDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SmqSmsMesgQueue");

		return (SmqSmsMesgQueueDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SmqSmsMesgQueue");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SmqSmsMesgQueue");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SmqSmsMesgQueue");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}