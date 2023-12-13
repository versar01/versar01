package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class PfuPocUsageAbstractDACImpl extends DAC implements
		PfuPocUsageAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PfuPocUsageAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public PfuPocUsageAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public PfuPocUsageAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public PfuPocUsageDMO get(PfuPocUsageDMO PfuPocUsageDMO)
			throws EPPIXSeriousException {
		logger.debug("get( PfuPocUsageDMO )");

		thrower.ifParameterMissing("PfuPocUsageDMO", PfuPocUsageDMO);

		return (PfuPocUsageDMO) dao.get(PfuPocUsageDMO);
	}

	public void create(PfuPocUsageDMO PfuPocUsageDMO)
			throws EPPIXSeriousException {
		logger.debug("create( PfuPocUsageDMO )");
		thrower.ifParameterMissing("PfuPocUsageDMO", PfuPocUsageDMO);

		dao.insert(PfuPocUsageDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new PfuPocUsageDMO(),
				filterQueryArgs(filter, "PfuPocUsage"));
	}

	public void delete(PfuPocUsageDMO PfuPocUsageDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( PfuPocUsageDMO )");

		thrower.ifParameterMissing("PfuPocUsageDMO", PfuPocUsageDMO);

		dao.delete(PfuPocUsageDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfuPocUsage");

		dao.delete("PfuPocUsage", args.getFilterBy(), args);
	}

	public boolean exists(PfuPocUsageDMO PfuPocUsageDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( PfuPocUsageDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, PfuPocUsageDMO.hmManuIdFilter,
		// PfuPocUsageDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(PfuPocUsageDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, PfuPocUsageDMO PfuPocUsageDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, PfuPocUsageDMO )");

		return new DTOList(dao.getList(paramQueryArgs(PfuPocUsageDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(PfuPocUsageDMO PfuPocUsageDMO) {
		logger.debug("paramQueryArgs( PfuPocUsageDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("PfuPocUsage",
				2 * 2);

		if (PfuPocUsageDMO != null) {

			Integer PfuSerialId = PfuPocUsageDMO.getPfuSerialId();

			if (!DMO.isNull(PfuSerialId)) {
				queryArgs.andFilterBy("PfuSerialIdMatch").arg(PfuSerialId);
			}

			String PfuMsisdnNo = PfuPocUsageDMO.getPfuMsisdnNo();

			if (!DMO.isNull(PfuMsisdnNo)) {
				queryArgs.andFilterBy("PfuMsisdnNoMatch").arg(PfuMsisdnNo);
			}

			Integer PfuFolderId = PfuPocUsageDMO.getPfuFolderId();

			if (!DMO.isNull(PfuFolderId)) {
				queryArgs.andFilterBy("PfuFolderIdMatch").arg(PfuFolderId);
			}

			BigDecimal PfuUsage = PfuPocUsageDMO.getPfuUsage();

			if (!DMO.isNull(PfuUsage)) {
				queryArgs.andFilterBy("PfuUsageMatch").arg(PfuUsage);
			}

			Date PfuUsageDate = PfuPocUsageDMO.getPfuUsageDate();

			if (!DMO.isNull(PfuUsageDate)) {
				queryArgs.andFilterBy("PfuUsageDateMatch").arg(PfuUsageDate);
			}

			String PfuStatus = PfuPocUsageDMO.getPfuStatus();

			if (!DMO.isNull(PfuStatus)) {
				queryArgs.andFilterBy("PfuStatusMatch").arg(PfuStatus);
			}

			String PfuComments = PfuPocUsageDMO.getPfuComments();

			if (!DMO.isNull(PfuComments)) {
				queryArgs.andFilterBy("PfuCommentsMatch").arg(PfuComments);
			}

			DateTime PfuXdrDate = PfuPocUsageDMO.getPfuXdrDate();

			if (!DMO.isNull(PfuXdrDate)) {
				queryArgs.andFilterBy("PfuXdrDateMatch").arg(PfuXdrDate);
			}

			DateTime PfuProcessDate = PfuPocUsageDMO.getPfuProcessDate();

			if (!DMO.isNull(PfuProcessDate)) {
				queryArgs.andFilterBy("PfuProcessDateMatch")
						.arg(PfuProcessDate);
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
				(dmlName == null) ? "PfuPocUsage" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case PfuPocUsageDMO.pfuSerialIdFilter:
				part.andFilterBy(queryArgs, "pfuSerialId",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuMsisdnNoFilter:
				part.andFilterBy(queryArgs, "pfuMsisdnNo",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuFolderIdFilter:
				part.andFilterBy(queryArgs, "pfuFolderId",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuUsageFilter:
				part.andFilterBy(queryArgs, "pfuUsage",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuUsageDateFilter:
				part.andFilterBy(queryArgs, "pfuUsageDate",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuStatusFilter:
				part.andFilterBy(queryArgs, "pfuStatus",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuCommentsFilter:
				part.andFilterBy(queryArgs, "pfuComments",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuXdrDateFilter:
				part.andFilterBy(queryArgs, "pfuXdrDate",
						dao.wildcardForAnySequence());
				break;

			case PfuPocUsageDMO.pfuProcessDateFilter:
				part.andFilterBy(queryArgs, "pfuProcessDate",
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

	public PfuPocUsageDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfuPocUsage");

		return (PfuPocUsageDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfuPocUsage");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfuPocUsage");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "PfuPocUsage");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}