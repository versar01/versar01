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

public class SdeServDepositAbstractDACImpl extends DAC implements
		SdeServDepositAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SdeServDepositAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SdeServDepositAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SdeServDepositAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SdeServDepositDMO get(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SdeServDepositDMO )");

		thrower.ifParameterMissing("SdeServDepositDMO", sdeServDepositDMO);

		return (SdeServDepositDMO) dao.get(sdeServDepositDMO);
	}

	public void create(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sdeServDepositDMO )");
		thrower.ifParameterMissing("SdeServDepositDMO", sdeServDepositDMO);

		dao.insert(sdeServDepositDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SdeServDepositDMO(),
				filterQueryArgs(filter, "SdeServDeposit"));
	}

	public void delete(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SdeServDepositDMO )");

		thrower.ifParameterMissing("SdeServDepositDMO", sdeServDepositDMO);

		dao.delete(sdeServDepositDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdeServDeposit");

		dao.delete("SdeServDeposit", args.getFilterBy(), args);
	}

	public boolean exists(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SdeServDepositDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SdeServDepositDMO.hmManuIdFilter,
		// sdeServDepositDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(sdeServDepositDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SdeServDepositDMO sdeServDepositDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, sdeServDepositDMO )");

		return new DTOList(dao.getList(paramQueryArgs(sdeServDepositDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SdeServDepositDMO sdeServDepositDMO) {
		logger.debug("paramQueryArgs( sdeServDepositDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SdeServDeposit",
				20 * 20);

		if (sdeServDepositDMO != null) {

			Integer SdeDepositId = sdeServDepositDMO.getSdeDepositId();

			if (!DMO.isNull(SdeDepositId)) {
				queryArgs.andFilterBy("SdeDepositIdMatch").arg(SdeDepositId);
			}

			String SdeServiceCode = sdeServDepositDMO.getSdeServiceCode();

			if (!DMO.isNull(SdeServiceCode)) {
				queryArgs.andFilterBy("SdeServiceCodeMatch")
						.arg(SdeServiceCode);
			}

			String SdePackageCode = sdeServDepositDMO.getSdePackageCode();

			if (!DMO.isNull(SdePackageCode)) {
				queryArgs.andFilterBy("SdePackageCodeMatch")
						.arg(SdePackageCode);
			}

			Integer SdeVerRuleNum = sdeServDepositDMO.getSdeVerRuleNum();

			if (!DMO.isNull(SdeVerRuleNum)) {
				queryArgs.andFilterBy("SdeVerRuleNumMatch").arg(SdeVerRuleNum);
			}

			String SdeCustomerId = sdeServDepositDMO.getSdeCustomerId();

			if (!DMO.isNull(SdeCustomerId)) {
				queryArgs.andFilterBy("SdeCustomerIdMatch").arg(SdeCustomerId);
			}

			Integer SdeSubscriberId = sdeServDepositDMO.getSdeSubscriberId();

			if (!DMO.isNull(SdeSubscriberId)) {
				queryArgs.andFilterBy("SdeSubscriberIdMatch").arg(
						SdeSubscriberId);
			}

			Date SdeLatesPayDate = sdeServDepositDMO.getSdeLatesPayDate();

			if (!DMO.isNull(SdeLatesPayDate)) {
				queryArgs.andFilterBy("SdeLatesPayDateMatch").arg(
						SdeLatesPayDate);
			}

			Date SdePayDate = sdeServDepositDMO.getSdePayDate();

			if (!DMO.isNull(SdePayDate)) {
				queryArgs.andFilterBy("SdePayDateMatch").arg(SdePayDate);
			}

			Integer SdeDepositStatus = sdeServDepositDMO.getSdeDepositStatus();

			if (!DMO.isNull(SdeDepositStatus)) {
				queryArgs.andFilterBy("SdeDepositStatusMatch").arg(
						SdeDepositStatus);
			}

			Date SdeDeactDate = sdeServDepositDMO.getSdeDeactDate();

			if (!DMO.isNull(SdeDeactDate)) {
				queryArgs.andFilterBy("SdeDeactDateMatch").arg(SdeDeactDate);
			}

			Date SdeReleaseDate = sdeServDepositDMO.getSdeReleaseDate();

			if (!DMO.isNull(SdeReleaseDate)) {
				queryArgs.andFilterBy("SdeReleaseDateMatch")
						.arg(SdeReleaseDate);
			}

			Float SdeAmountDue = sdeServDepositDMO.getSdeAmountDue();

			if (!DMO.isNull(SdeAmountDue)) {
				queryArgs.andFilterBy("SdeAmountDueMatch").arg(SdeAmountDue);
			}

			Float SdeAmountPaid = sdeServDepositDMO.getSdeAmountPaid();

			if (!DMO.isNull(SdeAmountPaid)) {
				queryArgs.andFilterBy("SdeAmountPaidMatch").arg(SdeAmountPaid);
			}

			Integer SdeServiceStatus = sdeServDepositDMO.getSdeServiceStatus();

			if (!DMO.isNull(SdeServiceStatus)) {
				queryArgs.andFilterBy("SdeServiceStatusMatch").arg(
						SdeServiceStatus);
			}

			Integer SdeBatchRunNum = sdeServDepositDMO.getSdeBatchRunNum();

			if (!DMO.isNull(SdeBatchRunNum)) {
				queryArgs.andFilterBy("SdeBatchRunNumMatch")
						.arg(SdeBatchRunNum);
			}

			String SdeSimNo = sdeServDepositDMO.getSdeSimNo();

			if (!DMO.isNull(SdeSimNo)) {
				queryArgs.andFilterBy("SdeSimNoMatch").arg(SdeSimNo);
			}

			String SdeMsisdnNo = sdeServDepositDMO.getSdeMsisdnNo();

			if (!DMO.isNull(SdeMsisdnNo)) {
				queryArgs.andFilterBy("SdeMsisdnNoMatch").arg(SdeMsisdnNo);
			}

			String SdePendLetterId = sdeServDepositDMO.getSdePendLetterId();

			if (!DMO.isNull(SdePendLetterId)) {
				queryArgs.andFilterBy("SdePendLetterIdMatch").arg(
						SdePendLetterId);
			}

			String SdeCurrency = sdeServDepositDMO.getSdeCurrency();

			if (!DMO.isNull(SdeCurrency)) {
				queryArgs.andFilterBy("SdeCurrencyMatch").arg(SdeCurrency);
			}

			Float SdeExchangeRate = sdeServDepositDMO.getSdeExchangeRate();

			if (!DMO.isNull(SdeExchangeRate)) {
				queryArgs.andFilterBy("SdeExchangeRateMatch").arg(
						SdeExchangeRate);
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
				(dmlName == null) ? "SdeServDeposit" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SdeServDepositDMO.SdeDepositIdFilter:
				part.andFilterBy(queryArgs, "SdeDepositId",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeServiceCodeFilter:
				part.andFilterBy(queryArgs, "SdeServiceCode",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdePackageCodeFilter:
				part.andFilterBy(queryArgs, "SdePackageCode",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeVerRuleNumFilter:
				part.andFilterBy(queryArgs, "SdeVerRuleNum",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeCustomerIdFilter:
				part.andFilterBy(queryArgs, "SdeCustomerId",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeSubscriberIdFilter:
				part.andFilterBy(queryArgs, "SdeSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeLatesPayDateFilter:
				part.andFilterBy(queryArgs, "SdeLatesPayDate",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdePayDateFilter:
				part.andFilterBy(queryArgs, "SdePayDate",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeDepositStatusFilter:
				part.andFilterBy(queryArgs, "SdeDepositStatus",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeDeactDateFilter:
				part.andFilterBy(queryArgs, "SdeDeactDate",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeReleaseDateFilter:
				part.andFilterBy(queryArgs, "SdeReleaseDate",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeAmountDueFilter:
				part.andFilterBy(queryArgs, "SdeAmountDue",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeAmountPaidFilter:
				part.andFilterBy(queryArgs, "SdeAmountPaid",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeServiceStatusFilter:
				part.andFilterBy(queryArgs, "SdeServiceStatus",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeBatchRunNumFilter:
				part.andFilterBy(queryArgs, "SdeBatchRunNum",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeSimNoFilter:
				part.andFilterBy(queryArgs, "SdeSimNo",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeMsisdnNoFilter:
				part.andFilterBy(queryArgs, "SdeMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdePendLetterIdFilter:
				part.andFilterBy(queryArgs, "SdePendLetterId",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeCurrencyFilter:
				part.andFilterBy(queryArgs, "SdeCurrency",
						dao.wildcardForAnySequence());
				break;

			case SdeServDepositDMO.SdeExchangeRateFilter:
				part.andFilterBy(queryArgs, "SdeExchangeRate",
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

	public SdeServDepositDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdeServDeposit");

		return (SdeServDepositDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdeServDeposit");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdeServDeposit");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdeServDeposit");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}