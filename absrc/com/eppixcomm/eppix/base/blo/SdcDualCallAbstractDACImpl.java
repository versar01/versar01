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

public class SdcDualCallAbstractDACImpl extends DAC implements
		SdcDualCallAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SdcDualCallAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SdcDualCallAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SdcDualCallAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SdcDualCallDMO get(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SdcDualCallDMO )");

		thrower.ifParameterMissing("SdcDualCallDMO", sdcDualCallDMO);

		return (SdcDualCallDMO) dao.get(sdcDualCallDMO);
	}

	public void create(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sdcDualCallDMO )");
		thrower.ifParameterMissing("SdcDualCallDMO", sdcDualCallDMO);

		dao.insert(sdcDualCallDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SdcDualCallDMO(),
				filterQueryArgs(filter, "SdcDualCall"));
	}

	public void delete(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( SdcDualCallDMO )");

		thrower.ifParameterMissing("SdcDualCallDMO", sdcDualCallDMO);

		dao.delete(sdcDualCallDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdcDualCall");

		dao.delete("SdcDualCall", args.getFilterBy(), args);
	}

	public boolean exists(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( SdcDualCallDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, SdcDualCallDMO.hmManuIdFilter,
		// sdcDualCallDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(sdcDualCallDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, sdcDualCallDMO )");

		return new DTOList(dao.getList(paramQueryArgs(sdcDualCallDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(SdcDualCallDMO sdcDualCallDMO) {
		logger.debug("paramQueryArgs( sdcDualCallDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SdcDualCall",
				2 * 2);

		if (sdcDualCallDMO != null) {

			Integer SdcSubscriberId = sdcDualCallDMO.getSdcSubscriberId();

			if (!DMO.isNull(SdcSubscriberId)) {
				queryArgs.andFilterBy("SdcSubscriberIdMatch").arg(
						SdcSubscriberId);
			}

			String SdcServiceCode = sdcDualCallDMO.getSdcServiceCode();

			if (!DMO.isNull(SdcServiceCode)) {
				queryArgs.andFilterBy("SdcServiceCodeMatch")
						.arg(SdcServiceCode);
			}

			String SdcSecondMsisdn = sdcDualCallDMO.getSdcSecondMsisdn();

			if (!DMO.isNull(SdcSecondMsisdn)) {
				queryArgs.andFilterBy("SdcSecondMsisdnMatch").arg(
						SdcSecondMsisdn);
			}

			String SdcFirstMsisdn = sdcDualCallDMO.getSdcFirstMsisdn();

			if (!DMO.isNull(SdcFirstMsisdn)) {
				queryArgs.andFilterBy("SdcFirstMsisdnMatch")
						.arg(SdcFirstMsisdn);
			}

			Date SdcLinkDate = sdcDualCallDMO.getSdcLinkDate();

			if (!DMO.isNull(SdcLinkDate)) {
				queryArgs.andFilterBy("SdcLinkDateMatch").arg(SdcLinkDate);
			}

			Date SdcExpiryDate = sdcDualCallDMO.getSdcExpiryDate();

			if (!DMO.isNull(SdcExpiryDate)) {
				queryArgs.andFilterBy("SdcExpiryDateMatch").arg(SdcExpiryDate);
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
				(dmlName == null) ? "SdcDualCall" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case SdcDualCallDMO.SdcSubscriberIdFilter:
				part.andFilterBy(queryArgs, "SdcSubscriberId",
						dao.wildcardForAnySequence());
				break;

			case SdcDualCallDMO.SdcServiceCodeFilter:
				part.andFilterBy(queryArgs, "SdcServiceCode",
						dao.wildcardForAnySequence());
				break;

			case SdcDualCallDMO.SdcSecondMsisdnFilter:
				part.andFilterBy(queryArgs, "SdcSecondMsisdn",
						dao.wildcardForAnySequence());
				break;

			case SdcDualCallDMO.SdcFirstMsisdnFilter:
				part.andFilterBy(queryArgs, "SdcFirstMsisdn",
						dao.wildcardForAnySequence());
				break;

			case SdcDualCallDMO.SdcLinkDateFilter:
				part.andFilterBy(queryArgs, "SdcLinkDate",
						dao.wildcardForAnySequence());
				break;

			case SdcDualCallDMO.SdcExpiryDateFilter:
				part.andFilterBy(queryArgs, "SdcExpiryDate",
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

	public SdcDualCallDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdcDualCall");

		return (SdcDualCallDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdcDualCall");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdcDualCall");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "SdcDualCall");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}