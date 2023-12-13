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

public class VrtVrTrackingAbstractDACImpl extends DAC implements
		VrtVrTrackingAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(VrtVrTrackingAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public VrtVrTrackingAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public VrtVrTrackingAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public VrtVrTrackingDMO get(VrtVrTrackingDMO vrtVrTrackingDMO)
			throws EPPIXSeriousException {
		logger.debug("get( VrtVrTrackingDMO )");

		thrower.ifParameterMissing("VrtVrTrackingDMO", vrtVrTrackingDMO);

		return (VrtVrTrackingDMO) dao.get(vrtVrTrackingDMO);
	}

	public void create(VrtVrTrackingDMO vrtVrTrackingDMO)
			throws EPPIXSeriousException {
		logger.debug("create( vrtVrTrackingDMO )");
		thrower.ifParameterMissing("VrtVrTrackingDMO", vrtVrTrackingDMO);

		dao.insert(vrtVrTrackingDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new VrtVrTrackingDMO(),
				filterQueryArgs(filter, "VrtVrTracking"));
	}

	public void delete(VrtVrTrackingDMO vrtVrTrackingDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( VrtVrTrackingDMO )");

		thrower.ifParameterMissing("VrtVrTrackingDMO", vrtVrTrackingDMO);

		dao.delete(vrtVrTrackingDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrtVrTracking");

		dao.delete("VrtVrTracking", args.getFilterBy(), args);
	}

	public boolean exists(VrtVrTrackingDMO vrtVrTrackingDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( VrtVrTrackingDMO)");

		// QueryFilter filter = new QueryFilter();
		// filter.add(FilterOp.EQUAL, VrtVrTrackingDMO.hmManuIdFilter,
		// vrtVrTrackingDMO.getHmManuId());
		//
		// return this.exists(filter);
		return dao.exists(vrtVrTrackingDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state, VrtVrTrackingDMO vrtVrTrackingDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, vrtVrTrackingDMO )");

		return new DTOList(dao.getList(paramQueryArgs(vrtVrTrackingDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(VrtVrTrackingDMO vrtVrTrackingDMO) {
		logger.debug("paramQueryArgs( vrtVrTrackingDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("VrtVrTracking",
				2 * 2);

		if (vrtVrTrackingDMO != null) {

			String VrtRequestor = vrtVrTrackingDMO.getVrtRequestor();

			if (!DMO.isNull(VrtRequestor)) {
				queryArgs.andFilterBy("VrtRequestorMatch").arg(VrtRequestor);
			}

			String VrtReceiver = vrtVrTrackingDMO.getVrtReceiver();

			if (!DMO.isNull(VrtReceiver)) {
				queryArgs.andFilterBy("VrtReceiverMatch").arg(VrtReceiver);
			}

			String VrtProvider = vrtVrTrackingDMO.getVrtProvider();

			if (!DMO.isNull(VrtProvider)) {
				queryArgs.andFilterBy("VrtProviderMatch").arg(VrtProvider);
			}

			String VrtRechargeType = vrtVrTrackingDMO.getVrtRechargeType();

			if (!DMO.isNull(VrtRechargeType)) {
				queryArgs.andFilterBy("VrtRechargeTypeMatch").arg(
						VrtRechargeType);
			}

			Float VrtRechargeAmt = vrtVrTrackingDMO.getVrtRechargeAmt();

			if (!DMO.isNull(VrtRechargeAmt)) {
				queryArgs.andFilterBy("VrtRechargeAmtMatch")
						.arg(VrtRechargeAmt);
			}

			Integer VrtRefId = vrtVrTrackingDMO.getVrtRefId();

			if (!DMO.isNull(VrtRefId)) {
				queryArgs.andFilterBy("VrtRefIdMatch").arg(VrtRefId);
			}

			Integer VrtVrrId = vrtVrTrackingDMO.getVrtVrrId();

			if (!DMO.isNull(VrtVrrId)) {
				queryArgs.andFilterBy("VrtVrrIdMatch").arg(VrtVrrId);
			}

			Integer VrtVriId = vrtVrTrackingDMO.getVrtVriId();

			if (!DMO.isNull(VrtVriId)) {
				queryArgs.andFilterBy("VrtVriIdMatch").arg(VrtVriId);
			}

			Integer VrtReferenceNo = vrtVrTrackingDMO.getVrtReferenceNo();

			if (!DMO.isNull(VrtReferenceNo)) {
				queryArgs.andFilterBy("VrtReferenceNoMatch")
						.arg(VrtReferenceNo);
			}

			Date VrtDate1 = vrtVrTrackingDMO.getVrtDate1();

			if (!DMO.isNull(VrtDate1)) {
				queryArgs.andFilterBy("VrtDate1Match").arg(VrtDate1);
			}

			Date VrtDate2 = vrtVrTrackingDMO.getVrtDate2();

			if (!DMO.isNull(VrtDate2)) {
				queryArgs.andFilterBy("VrtDate2Match").arg(VrtDate2);
			}

			Date VrtDate3 = vrtVrTrackingDMO.getVrtDate3();

			if (!DMO.isNull(VrtDate3)) {
				queryArgs.andFilterBy("VrtDate3Match").arg(VrtDate3);
			}

			String VrtMtwTransId = vrtVrTrackingDMO.getVrtMtwTransId();

			if (!DMO.isNull(VrtMtwTransId)) {
				queryArgs.andFilterBy("VrtMtwTransIdMatch").arg(VrtMtwTransId);
			}

			String VrtMtwTermId = vrtVrTrackingDMO.getVrtMtwTermId();

			if (!DMO.isNull(VrtMtwTermId)) {
				queryArgs.andFilterBy("VrtMtwTermIdMatch").arg(VrtMtwTermId);
			}

			String VrtMtwBatchNum = vrtVrTrackingDMO.getVrtMtwBatchNum();

			if (!DMO.isNull(VrtMtwBatchNum)) {
				queryArgs.andFilterBy("VrtMtwBatchNumMatch")
						.arg(VrtMtwBatchNum);
			}

			Integer VrtMtwPrcreCd = vrtVrTrackingDMO.getVrtMtwPrcreCd();

			if (!DMO.isNull(VrtMtwPrcreCd)) {
				queryArgs.andFilterBy("VrtMtwPrcreCdMatch").arg(VrtMtwPrcreCd);
			}

			String VrtMtwRetRef = vrtVrTrackingDMO.getVrtMtwRetRef();

			if (!DMO.isNull(VrtMtwRetRef)) {
				queryArgs.andFilterBy("VrtMtwRetRefMatch").arg(VrtMtwRetRef);
			}

			Integer VrtMtwFundldCd = vrtVrTrackingDMO.getVrtMtwFundldCd();

			if (!DMO.isNull(VrtMtwFundldCd)) {
				queryArgs.andFilterBy("VrtMtwFundldCdMatch")
						.arg(VrtMtwFundldCd);
			}

			Integer VrtMtwLdRspns = vrtVrTrackingDMO.getVrtMtwLdRspns();

			if (!DMO.isNull(VrtMtwLdRspns)) {
				queryArgs.andFilterBy("VrtMtwLdRspnsMatch").arg(VrtMtwLdRspns);
			}

			String VrtStatus = vrtVrTrackingDMO.getVrtStatus();

			if (!DMO.isNull(VrtStatus)) {
				queryArgs.andFilterBy("VrtStatusMatch").arg(VrtStatus);
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
				(dmlName == null) ? "VrtVrTracking" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case VrtVrTrackingDMO.VrtRequestorFilter:
				part.andFilterBy(queryArgs, "VrtRequestor",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtReceiverFilter:
				part.andFilterBy(queryArgs, "VrtReceiver",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtProviderFilter:
				part.andFilterBy(queryArgs, "VrtProvider",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtRechargeTypeFilter:
				part.andFilterBy(queryArgs, "VrtRechargeType",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtRechargeAmtFilter:
				part.andFilterBy(queryArgs, "VrtRechargeAmt",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtRefIdFilter:
				part.andFilterBy(queryArgs, "VrtRefId",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtVrrIdFilter:
				part.andFilterBy(queryArgs, "VrtVrrId",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtVriIdFilter:
				part.andFilterBy(queryArgs, "VrtVriId",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtReferenceNoFilter:
				part.andFilterBy(queryArgs, "VrtReferenceNo",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtDate1Filter:
				part.andFilterBy(queryArgs, "VrtDate1",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtDate2Filter:
				part.andFilterBy(queryArgs, "VrtDate2",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtDate3Filter:
				part.andFilterBy(queryArgs, "VrtDate3",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwTransIdFilter:
				part.andFilterBy(queryArgs, "VrtMtwTransId",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwTermIdFilter:
				part.andFilterBy(queryArgs, "VrtMtwTermId",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwBatchNumFilter:
				part.andFilterBy(queryArgs, "VrtMtwBatchNum",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwPrcreCdFilter:
				part.andFilterBy(queryArgs, "VrtMtwPrcreCd",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwRetRefFilter:
				part.andFilterBy(queryArgs, "VrtMtwRetRef",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwFundldCdFilter:
				part.andFilterBy(queryArgs, "VrtMtwFundldCd",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtMtwLdRspnsFilter:
				part.andFilterBy(queryArgs, "VrtMtwLdRspns",
						dao.wildcardForAnySequence());
				break;

			case VrtVrTrackingDMO.VrtStatusFilter:
				part.andFilterBy(queryArgs, "VrtStatus",
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

	public VrtVrTrackingDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrtVrTracking");

		return (VrtVrTrackingDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrtVrTracking");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrtVrTracking");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "VrtVrTracking");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}