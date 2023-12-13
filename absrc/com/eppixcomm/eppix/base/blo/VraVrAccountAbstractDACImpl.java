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

public class VraVrAccountAbstractDACImpl extends DAC implements
		VraVrAccountAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(VraVrAccountAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public VraVrAccountAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public VraVrAccountAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public VraVrAccountDMO get(VraVrAccountDMO vraVrAccountDMO)
			throws EPPIXSeriousException {
		logger.debug("get( VraVrAccountDMO )");

		thrower.ifParameterMissing("VraVrAccountDMO", vraVrAccountDMO);

		return (VraVrAccountDMO) dao.get(vraVrAccountDMO);
	}

	public void create(VraVrAccountDMO vraVrAccountDMO)
			throws EPPIXSeriousException {
		logger.debug("create( vraVrAccountDMO )");
		thrower.ifParameterMissing("VraVrAccountDMO", vraVrAccountDMO);

		dao.insert(vraVrAccountDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new VraVrAccountDMO(),
				filterQueryArgs(filter, "VraVrAccount"));
	}

	public void delete(VraVrAccountDMO vraVrAccountDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( VraVrAccountDMO )");

		thrower.ifParameterMissing("VraVrAccountDMO", vraVrAccountDMO);

		dao.delete(vraVrAccountDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "VraVrAccount");

		dao.delete("VraVrAccount", args.getFilterBy(), args);
	}

	public boolean exists(VraVrAccountDMO vraVrAccountDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( VraVrAccountDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, VraVrAccountDMO.hmManuIdFilter,
		// vraVrAccountDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(vraVrAccountDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, VraVrAccountDMO vraVrAccountDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, vraVrAccountDMO )");

		return new DTOList(dao.getList(paramQueryArgs(vraVrAccountDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(VraVrAccountDMO vraVrAccountDMO) {
		logger.debug("paramQueryArgs( vraVrAccountDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("VraVrAccount",
				2 * 2);

		if (vraVrAccountDMO != null) {

			Integer VraId = vraVrAccountDMO.getVraId();

			if (!DMO.isNull(VraId)) {
				queryArgs.andFilterBy("VraIdMatch").arg(VraId);
			}

			String VraBillAcNo = vraVrAccountDMO.getVraBillAcNo();

			if (!DMO.isNull(VraBillAcNo)) {
				queryArgs.andFilterBy("VraBillAcNoMatch").arg(VraBillAcNo);
			}

			Integer VraCapValue = vraVrAccountDMO.getVraCapValue();

			if (!DMO.isNull(VraCapValue)) {
				queryArgs.andFilterBy("VraCapValueMatch").arg(VraCapValue);
			}

			String VraEnabled = vraVrAccountDMO.getVraEnabled();

			if (!DMO.isNull(VraEnabled)) {
				queryArgs.andFilterBy("VraEnabledMatch").arg(VraEnabled);
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
				(dmlName == null) ? "VraVrAccount" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case VraVrAccountDMO.VraIdFilter:
				part.andFilterBy(queryArgs, "VraId",
						dao.wildcardForAnySequence());
				break;

			case VraVrAccountDMO.VraBillAcNoFilter:
				part.andFilterBy(queryArgs, "VraBillAcNo",
						dao.wildcardForAnySequence());
				break;

			case VraVrAccountDMO.VraCapValueFilter:
				part.andFilterBy(queryArgs, "VraCapValue",
						dao.wildcardForAnySequence());
				break;

			case VraVrAccountDMO.VraEnabledFilter:
				part.andFilterBy(queryArgs, "VraEnabled",
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

	public VraVrAccountDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VraVrAccount");

		return (VraVrAccountDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VraVrAccount");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VraVrAccount");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VraVrAccount");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}