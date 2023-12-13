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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class CrbaCustRiskAuxAbstractDACImpl extends DAC implements
		CrbaCustRiskAuxAbstractDAC {
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(CrbaCustRiskAuxAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public CrbaCustRiskAuxAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public CrbaCustRiskAuxAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public CrbaCustRiskAuxDMO get(CrbaCustRiskAuxDMO crbaCustRiskAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("get( CrbaCustRiskAuxDMO )");

		thrower.ifParameterMissing("CrbaCustRiskAuxDMO", crbaCustRiskAuxDMO);

		return (CrbaCustRiskAuxDMO) dao.get(crbaCustRiskAuxDMO);
	}

	public void create(CrbaCustRiskAuxDMO crbaCustRiskAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("create( crbaCustRiskAuxDMO )");
		thrower.ifParameterMissing("CrbaCustRiskAuxDMO", crbaCustRiskAuxDMO);

		dao.insert(crbaCustRiskAuxDMO);

	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new CrbaCustRiskAuxDMO(),
				filterQueryArgs(filter, "CrbaCustRiskAux"));
	}

	public void delete(CrbaCustRiskAuxDMO crbaCustRiskAuxDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( CrbaCustRiskAuxDMO )");

		thrower.ifParameterMissing("CrbaCustRiskAuxDMO", crbaCustRiskAuxDMO);

		dao.delete(crbaCustRiskAuxDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, "CrbaCustRiskAux");

		dao.delete("CrbaCustRiskAux", args.getFilterBy(), args);
	}

	public boolean exists(CrbaCustRiskAuxDMO crbaCustRiskAuxDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( CrbaCustRiskAuxDMO)");

		return dao.exists(crbaCustRiskAuxDMO);
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public DTOList getList(DTOListState state,
			CrbaCustRiskAuxDMO crbaCustRiskAuxDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, crbaCustRiskAuxDMO )");

		return new DTOList(dao.getList(paramQueryArgs(crbaCustRiskAuxDMO)));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			CrbaCustRiskAuxDMO crbaCustRiskAuxDMO) {
		logger.debug("paramQueryArgs( crbaCustRiskAuxDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("CrbaCustRiskAux",
				2 * 2);

		if (crbaCustRiskAuxDMO != null) {

			String CrbaBillAcNo = crbaCustRiskAuxDMO.getCrbaBillAcNo();

			if (!DMO.isNull(CrbaBillAcNo)) {
				queryArgs.andFilterBy("CrbaBillAcNoMatch").arg(CrbaBillAcNo);
			}

			BigDecimal CrbaAccDiscVal = crbaCustRiskAuxDMO.getCrbaAccDiscVal();

			if (!DMO.isNull(CrbaAccDiscVal)) {
				queryArgs.andFilterBy("CrbaAccDiscValMatch")
						.arg(CrbaAccDiscVal);
			}

			BigDecimal CrbaAuxFloat1 = crbaCustRiskAuxDMO.getCrbaAuxFloat1();

			if (!DMO.isNull(CrbaAuxFloat1)) {
				queryArgs.andFilterBy("CrbaAuxFloat1Match").arg(CrbaAuxFloat1);
			}

			BigDecimal CrbaAuxFloat2 = crbaCustRiskAuxDMO.getCrbaAuxFloat2();

			if (!DMO.isNull(CrbaAuxFloat2)) {
				queryArgs.andFilterBy("CrbaAuxFloat2Match").arg(CrbaAuxFloat2);
			}

			BigDecimal CrbaAuxFloat3 = crbaCustRiskAuxDMO.getCrbaAuxFloat3();

			if (!DMO.isNull(CrbaAuxFloat3)) {
				queryArgs.andFilterBy("CrbaAuxFloat3Match").arg(CrbaAuxFloat3);
			}

			BigDecimal CrbaAuxInt1 = crbaCustRiskAuxDMO.getCrbaAuxInt1();

			if (!DMO.isNull(CrbaAuxInt1)) {
				queryArgs.andFilterBy("CrbaAuxInt1Match").arg(CrbaAuxInt1);
			}

			BigDecimal CrbaAuxInt2 = crbaCustRiskAuxDMO.getCrbaAuxInt2();

			if (!DMO.isNull(CrbaAuxInt2)) {
				queryArgs.andFilterBy("CrbaAuxInt2Match").arg(CrbaAuxInt2);
			}

			BigDecimal CrbaAuxInt3 = crbaCustRiskAuxDMO.getCrbaAuxInt3();

			if (!DMO.isNull(CrbaAuxInt3)) {
				queryArgs.andFilterBy("CrbaAuxInt3Match").arg(CrbaAuxInt3);
			}

			String CrbaAuxChar1 = crbaCustRiskAuxDMO.getCrbaAuxChar1();

			if (!DMO.isNull(CrbaAuxChar1)) {
				queryArgs.andFilterBy("CrbaAuxChar1Match").arg(CrbaAuxChar1);
			}

			String CrbaAuxChar2 = crbaCustRiskAuxDMO.getCrbaAuxChar2();

			if (!DMO.isNull(CrbaAuxChar2)) {
				queryArgs.andFilterBy("CrbaAuxChar2Match").arg(CrbaAuxChar2);
			}

			String CrbaAuxChar3 = crbaCustRiskAuxDMO.getCrbaAuxChar3();

			if (!DMO.isNull(CrbaAuxChar3)) {
				queryArgs.andFilterBy("CrbaAuxChar3Match").arg(CrbaAuxChar3);
			}

			DateTime CrbaAuxDate1 = crbaCustRiskAuxDMO.getCrbaAuxDate1();

			if (!DMO.isNull(CrbaAuxDate1)) {
				queryArgs.andFilterBy("CrbaAuxDate1Match").arg(CrbaAuxDate1);
			}

			DateTime CrbaAuxDate2 = crbaCustRiskAuxDMO.getCrbaAuxDate2();

			if (!DMO.isNull(CrbaAuxDate2)) {
				queryArgs.andFilterBy("CrbaAuxDate2Match").arg(CrbaAuxDate2);
			}

			DateTime CrbaAuxDate3 = crbaCustRiskAuxDMO.getCrbaAuxDate3();

			if (!DMO.isNull(CrbaAuxDate3)) {
				queryArgs.andFilterBy("CrbaAuxDate3Match").arg(CrbaAuxDate3);
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
				(dmlName == null) ? "CrbaCustRiskAux" : dmlName, parts.size());

		Iterator it = parts.iterator();
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case CrbaCustRiskAuxDMO.crbaBillAcNoFilter:
				part.andFilterBy(queryArgs, "crbaBillAcNo",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAccDiscValFilter:
				part.andFilterBy(queryArgs, "crbaAccDiscVal",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxFloat1Filter:
				part.andFilterBy(queryArgs, "crbaAuxFloat1",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxFloat2Filter:
				part.andFilterBy(queryArgs, "crbaAuxFloat2",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxFloat3Filter:
				part.andFilterBy(queryArgs, "crbaAuxFloat3",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxInt1Filter:
				part.andFilterBy(queryArgs, "crbaAuxInt1",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxInt2Filter:
				part.andFilterBy(queryArgs, "crbaAuxInt2",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxInt3Filter:
				part.andFilterBy(queryArgs, "crbaAuxInt3",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxChar1Filter:
				part.andFilterBy(queryArgs, "crbaAuxChar1",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxChar2Filter:
				part.andFilterBy(queryArgs, "crbaAuxChar2",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxChar3Filter:
				part.andFilterBy(queryArgs, "crbaAuxChar3",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxDate1Filter:
				part.andFilterBy(queryArgs, "crbaAuxDate1",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxDate2Filter:
				part.andFilterBy(queryArgs, "crbaAuxDate2",
						dao.wildcardForAnySequence());
				break;

			case CrbaCustRiskAuxDMO.crbaAuxDate3Filter:
				part.andFilterBy(queryArgs, "crbaAuxDate3",
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

	public CrbaCustRiskAuxDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "CrbaCustRiskAux");

		return (CrbaCustRiskAuxDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "CrbaCustRiskAux");

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "CrbaCustRiskAux");

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, "CrbaCustRiskAux");

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

}