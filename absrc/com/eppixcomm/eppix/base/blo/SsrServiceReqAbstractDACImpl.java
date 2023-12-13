package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SsrServiceReqAbstractDACImpl extends DAC implements
		SsrServiceReqAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SsrServiceReqAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SsrServiceReqAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SsrServiceReqAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SsrServiceReqDMO get(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SsrServiceReqDMO )");

		thrower.ifParameterMissing("SsrServiceReqDMO", ssrSelfServRecurrDMO);

		return (SsrServiceReqDMO) dao.get(ssrSelfServRecurrDMO);
	}

	public void create(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXSeriousException {
		logger.debug("create( SsrServiceReqDMO )");
		thrower.ifParameterMissing("SsrServiceReqDMO", ssrSelfServRecurrDMO);

		dao.insert(ssrSelfServRecurrDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SsrServiceReqDMO(),
				filterQueryArgs(filter, "SsrServiceReqDMO"));
	}

	public void delete(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SsrServiceReqDMO )");

		thrower.ifParameterMissing("SsrServiceReqDMO", ssrSelfServRecurrDMO);

		dao.delete(ssrSelfServRecurrDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SsrServiceReq");

		dao.delete("SsrServiceReq", args.getFilterBy(), args);
	}

	public boolean exists(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SsrServiceReqDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SsrServiceReqDMO.hmManuIdFilter,
		// ssrSelfServRecurrDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(ssrSelfServRecurrDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, ssrSelfServRecurrDMO )");

		return new DTOList(dao.getList(paramQueryArgs(ssrSelfServRecurrDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			SsrServiceReqDMO ssrSelfServRecurrDMO) {
		logger.debug("paramQueryArgs( ssrSelfServRecurrDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				"SsrServiceReq", 2 * 2);

		if (ssrSelfServRecurrDMO != null) {

			String SsrMsisdnNo = ssrSelfServRecurrDMO.getSsrMsisdnNo();

			if (!DMO.isNull(SsrMsisdnNo)) {
				queryArgs.andFilterBy("SsrMsisdnNoMatch").arg(SsrMsisdnNo);
			}

			DateTime SsrEffectiveDate = ssrSelfServRecurrDMO.getSsrEffectiveDate();

			if (!DMO.isNull(SsrEffectiveDate)) {
				queryArgs.andFilterBy("SsrEffectiveDateMatch").arg(
						SsrEffectiveDate);
			}

			String SsrReferenceNo = ssrSelfServRecurrDMO.getSsrReferenceNo();

			if (!DMO.isNull(SsrReferenceNo)) {
				queryArgs.andFilterBy("SsrReferenceNoMatch")
						.arg(SsrReferenceNo);
			}

			String SsrNetwrkServ = ssrSelfServRecurrDMO.getSsrNetwrkServ();

			if (!DMO.isNull(SsrNetwrkServ)) {
				queryArgs.andFilterBy("SsrNetwrkServMatch").arg(SsrNetwrkServ);
			}

			String SsrRecurring = ssrSelfServRecurrDMO.getSsrRecurring();

			if (!DMO.isNull(SsrRecurring)) {
				queryArgs.andFilterBy("SsrRecurringMatch").arg(SsrRecurring);
			}

			String SsrActionReq = ssrSelfServRecurrDMO.getSsrActionReq();

			if (!DMO.isNull(SsrActionReq)) {
				queryArgs.andFilterBy("SsrActionReqMatch").arg(SsrActionReq);
			}

			BigDecimal SsrProrateChg = ssrSelfServRecurrDMO.getSsrProrateChg();

			if (!DMO.isNull(SsrProrateChg)) {
				queryArgs.andFilterBy("SsrProrateChgMatch").arg(SsrProrateChg);
			}

			BigDecimal SsrSubCharge = ssrSelfServRecurrDMO.getSsrSubCharge();

			if (!DMO.isNull(SsrSubCharge)) {
				queryArgs.andFilterBy("SsrSubChargeMatch").arg(SsrSubCharge);
			}

			String SsrUnits = ssrSelfServRecurrDMO.getSsrUnits();

			if (!DMO.isNull(SsrUnits)) {
				queryArgs.andFilterBy("SsrUnitsMatch").arg(SsrUnits);
			}

			String SsrUnitOfMeas = ssrSelfServRecurrDMO.getSsrUnitOfMeas();

			if (!DMO.isNull(SsrUnitOfMeas)) {
				queryArgs.andFilterBy("SsrUnitOfMeasMatch").arg(SsrUnitOfMeas);
			}

			Integer SsrLimitValue = ssrSelfServRecurrDMO.getSsrLimitValue();

			if (!DMO.isNull(SsrLimitValue)) {
				queryArgs.andFilterBy("SsrLimitValueMatch").arg(SsrLimitValue);
			}

			String SsrSystemReq = ssrSelfServRecurrDMO.getSsrSystemReq();

			if (!DMO.isNull(SsrSystemReq)) {
				queryArgs.andFilterBy("SsrSystemReqMatch").arg(SsrSystemReq);
			}

			String SsrStatus = ssrSelfServRecurrDMO.getSsrStatus();

			if (!DMO.isNull(SsrStatus)) {
				queryArgs.andFilterBy("SsrStatusMatch").arg(SsrStatus);
			}

			String SsrN2nReq = ssrSelfServRecurrDMO.getSsrN2nReq();

			if (!DMO.isNull(SsrN2nReq)) {
				queryArgs.andFilterBy("SsrN2nReqMatch").arg(SsrN2nReq);
			}

			String SsrBillAcNo = ssrSelfServRecurrDMO.getSsrBillAcNo();

			if (!DMO.isNull(SsrBillAcNo)) {
				queryArgs.andFilterBy("SsrBillAcNoMatch").arg(SsrBillAcNo);
			}

			Integer SsrSubscriberId = ssrSelfServRecurrDMO.getSsrSubscriberId();

			if (!DMO.isNull(SsrSubscriberId)) {
				queryArgs.andFilterBy("SsrSubscriberIdMatch").arg(
						SsrSubscriberId);
			}

			String SsrSimNo = ssrSelfServRecurrDMO.getSsrSimNo();

			if (!DMO.isNull(SsrSimNo)) {
				queryArgs.andFilterBy("SsrSimNoMatch").arg(SsrSimNo);
			}

			String SsrPackageCode = ssrSelfServRecurrDMO.getSsrPackageCode();

			if (!DMO.isNull(SsrPackageCode)) {
				queryArgs.andFilterBy("SsrPackageCodeMatch")
						.arg(SsrPackageCode);
			}

			String SsrTariffCode = ssrSelfServRecurrDMO.getSsrTariffCode();

			if (!DMO.isNull(SsrTariffCode)) {
				queryArgs.andFilterBy("SsrTariffCodeMatch").arg(SsrTariffCode);
			}

			String SsrInternalServ = ssrSelfServRecurrDMO.getSsrInternalServ();

			if (!DMO.isNull(SsrInternalServ)) {
				queryArgs.andFilterBy("SsrInternalServMatch").arg(
						SsrInternalServ);
			}

			Integer SsrServParamId = ssrSelfServRecurrDMO.getSsrServParamId();

			if (!DMO.isNull(SsrServParamId)) {
				queryArgs.andFilterBy("SsrServParamIdMatch")
						.arg(SsrServParamId);
			}

			String SsrServParamVal = ssrSelfServRecurrDMO.getSsrServParamVal();

			if (!DMO.isNull(SsrServParamVal)) {
				queryArgs.andFilterBy("SsrServParamValMatch").arg(
						SsrServParamVal);
			}

			DateTime SsrProcessedDate = ssrSelfServRecurrDMO.getSsrProcessedDate();

			if (!DMO.isNull(SsrProcessedDate)) {
				queryArgs.andFilterBy("SsrProcessedDateMatch").arg(
						SsrProcessedDate);
			}

			String SsrErrorMess = ssrSelfServRecurrDMO.getSsrErrorMess();

			if (!DMO.isNull(SsrErrorMess)) {
				queryArgs.andFilterBy("SsrErrorMessMatch").arg(SsrErrorMess);
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
				(dmlName == null) ? "SsrServiceReq" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SsrServiceReqDMO.ssrMsisdnNoFilter:
				part.andFilterBy(queryArgs, "ssrMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrEffectiveDateFilter:
				part.andFilterBy(queryArgs, "ssrEffectiveDate",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrReferenceNoFilter:
				part.andFilterBy(queryArgs, "ssrReferenceNo",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrNetwrkServFilter:
				part.andFilterBy(queryArgs, "ssrNetwrkServ",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrRecurringFilter:
				part.andFilterBy(queryArgs, "ssrRecurring",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrActionReqFilter:
				part.andFilterBy(queryArgs, "ssrActionReq",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrProrateChgFilter:
				part.andFilterBy(queryArgs, "ssrProrateChg",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrSubChargeFilter:
				part.andFilterBy(queryArgs, "ssrSubCharge",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrUnitsFilter:
				part.andFilterBy(queryArgs, "ssrUnits",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrUnitOfMeasFilter:
				part.andFilterBy(queryArgs, "ssrUnitOfMeas",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrLimitValueFilter:
				part.andFilterBy(queryArgs, "ssrLimitValue",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrSystemReqFilter:
				part.andFilterBy(queryArgs, "ssrSystemReq",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrStatusFilter:
				part.andFilterBy(queryArgs, "ssrStatus",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrN2nReqFilter:
				part.andFilterBy(queryArgs, "ssrN2nReq",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrBillAcNoFilter:
				part.andFilterBy(queryArgs, "ssrBillAcNo",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrSubscriberIdFilter:
				part.andFilterBy(queryArgs, "ssrSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrSimNoFilter:
				part.andFilterBy(queryArgs, "ssrSimNo",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrPackageCodeFilter:
				part.andFilterBy(queryArgs, "ssrPackageCode",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrTariffCodeFilter:
				part.andFilterBy(queryArgs, "ssrTariffCode",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrInternalServFilter:
				part.andFilterBy(queryArgs, "ssrInternalServ",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrServParamIdFilter:
				part.andFilterBy(queryArgs, "ssrServParamId",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrServParamValFilter:
				part.andFilterBy(queryArgs, "ssrServParamVal",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrProcessedDateFilter:
				part.andFilterBy(queryArgs, "ssrProcessedDate",
						dao.wildcardForAnySequence());
				break;

			case SsrServiceReqDMO.ssrErrorMessFilter:
				part.andFilterBy(queryArgs, "ssrErrorMess",
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

	public SsrServiceReqDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SsrServiceReq");

		return (SsrServiceReqDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SsrServiceReq");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SsrServiceReq");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SsrServiceReq");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}