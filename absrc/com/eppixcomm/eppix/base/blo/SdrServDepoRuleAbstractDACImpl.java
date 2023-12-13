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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SdrServDepoRuleAbstractDACImpl extends DAC implements SdrServDepoRuleAbstractDAC{
	static DAOThrower thrower = DAOThrower.getDAOThrower( SdrServDepoRuleAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	protected SdrServDepoRuleAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	protected SdrServDepoRuleAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(SdrServDepoRuleDMO sdrServDepoRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sdrServDepoRuleDMO )");
		thrower.ifParameterMissing("SdrServDepoRuleDMO", sdrServDepoRuleDMO);

		dao.insert(sdrServDepoRuleDMO);	
	}

	public void delete(SdrServDepoRuleDMO sdrServDepoRuleDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( sdrServDepoRuleDMO )");

		thrower.ifParameterMissing("SdrServDepoRuleDMO", sdrServDepoRuleDMO);

		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrPackageCode",
				sdrServDepoRuleDMO.getSdrPackageCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrServiceCode",
				sdrServDepoRuleDMO.getSdrServiceCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrVerRuleNum",
				sdrServDepoRuleDMO.getSdrVerRuleNum());
		
		dao.delete(sdrServDepoRuleDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");
		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		dao.delete("SdrServDepoRule", args.getFilterBy(), args);
	}

	public boolean exists(SdrServDepoRuleDMO sdrServDepoRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EapEpxactionPendDMO)");

		return dao.exists("SdrServDepoRule", "filterByPrimaryKey", new DAOArgs(3)
		.arg((sdrServDepoRuleDMO.getSdrPackageCode() == null) ? null : sdrServDepoRuleDMO.getSdrPackageCode().trim())
		.arg((sdrServDepoRuleDMO.getSdrServiceCode() == null) ? null : sdrServDepoRuleDMO.getSdrServiceCode().trim())
		.arg(sdrServDepoRuleDMO.getSdrVerRuleNum()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public SdrServDepoRuleDMO get(SdrServDepoRuleDMO sdrServDepoRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("get( SdrServDepoRuleDMO )");

		thrower.ifParameterMissing("SdrServDepoRuleDMO", sdrServDepoRuleDMO);
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrPackageCode",
				sdrServDepoRuleDMO.getSdrPackageCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrServiceCode",
				sdrServDepoRuleDMO.getSdrServiceCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrVerRuleNum",
				sdrServDepoRuleDMO.getSdrVerRuleNum());

		return (SdrServDepoRuleDMO) dao.get(sdrServDepoRuleDMO);
	}

	public SdrServDepoRuleDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return (SdrServDepoRuleDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

//	public SdrServDepoRuleDMO lock(SdrServDepoRuleDMO sdrServDepoRuleDMO)
//			throws EPPIXSeriousException, EPPIXObjectBusyException {
//		return null;
//	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.max(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.min(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	public void modify(SdrServDepoRuleDMO sdrServDepoRuleDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( SdrServDepoRuleDMO )");

		thrower.ifParameterMissing("SdrServDepoRuleDMO", sdrServDepoRuleDMO);
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrPackageCode",
				sdrServDepoRuleDMO.getSdrPackageCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrServiceCode",
				sdrServDepoRuleDMO.getSdrServiceCode());
		
		thrower.ifParameterMissing("SdrServDepoRuleDMO.sdrVerRuleNum",
				sdrServDepoRuleDMO.getSdrVerRuleNum());

		dao.update(sdrServDepoRuleDMO);	
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new SdrServDepoRuleDMO(), filterQueryArgs(filter, null));
	}

	protected DAOParamQueryArgs paramQueryArgs(SdrServDepoRuleDMO sdrServDepoRuleDMO) {
		logger.debug("paramQueryArgs( sdrServDepoRuleDMO)");
		
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SdrServDepoRule",
				16 * 2);
		
		if(sdrServDepoRuleDMO != null){
			
			String sdrPackageCode = sdrServDepoRuleDMO.getSdrPackageCode();
			
			if (!DMO.isNull(sdrPackageCode)) {
				queryArgs.andFilterBy("SdrPackageCodeMatch").arg(sdrPackageCode);
			}
			
			String sdrServiceCode = sdrServDepoRuleDMO.getSdrServiceCode();

			if (!DMO.isNull(sdrServiceCode)) {
				queryArgs.andFilterBy("SdrServiceCodeMatch").arg(sdrServiceCode);
			}
			
			Integer sdrVerRuleNum = sdrServDepoRuleDMO.getSdrVerRuleNum();
			
			if (!DMO.isNull(sdrVerRuleNum)) {
				queryArgs.andFilterBy("SdrVerRuleNumMatch").arg(sdrVerRuleNum);
			}
			
			String sdrReasonId = sdrServDepoRuleDMO.getSdrReasonId();
			
			if (!DMO.isNull(sdrReasonId)) {
				queryArgs.andFilterBy("SdrReasonIdMatch").arg(sdrReasonId);
			}
			
			BigDecimal sdrDepositAmount = sdrServDepoRuleDMO.getSdrDepositAmount();
			
			if (!DMO.isNull(sdrDepositAmount)) {
				queryArgs.andFilterBy("SdrDepositAmountMatch").arg(sdrDepositAmount);
			}
			
			String sdrReleaseFlag = sdrServDepoRuleDMO.getSdrReleaseFlag();
			
			if (!DMO.isNull(sdrDepositAmount)) {
				queryArgs.andFilterBy("SdrDepositAmountMatch").arg(sdrDepositAmount);
			}
			
			Integer sdrReleaseType = sdrServDepoRuleDMO.getSdrReleaseType();
			
			if (!DMO.isNull(sdrReleaseType)) {
				queryArgs.andFilterBy("SdrReleaseTypeMatch").arg(sdrReleaseType);
			}
			
			String sdrReleaseTgId = sdrServDepoRuleDMO.getSdrReleaseTgId();
			
			if (!DMO.isNull(sdrReleaseTgId)) {
				queryArgs.andFilterBy("SdrReleaseTgIdMatch").arg(sdrReleaseTgId);
			}
			
			String sdrReleUserId = sdrServDepoRuleDMO.getSdrReleUserId();
			
			if (!DMO.isNull(sdrReleUserId)) {
				queryArgs.andFilterBy("SdrReleUserIdMatch").arg(sdrReleUserId);
			}
			
			String sdrReleLetterId = sdrServDepoRuleDMO.getSdrReleLetterId();
			
			if (!DMO.isNull(sdrReleLetterId)) {
				queryArgs.andFilterBy("SdrReleLetterIdMatch").arg(sdrReleLetterId);
			}
			
			Integer sdrRelDelayDays = sdrServDepoRuleDMO.getSdrRelDelayDays();
			
			if (!DMO.isNull(sdrRelDelayDays)) {
				queryArgs.andFilterBy("SdrRelDelayDaysMatch").arg(sdrRelDelayDays);
			}
			
			Integer sdrPendingType = sdrServDepoRuleDMO.getSdrPendingType();
			
			if (!DMO.isNull(sdrPendingType)) {
				queryArgs.andFilterBy("SdrPendingTypeMatch").arg(sdrPendingType);
			}
			
			String sdrPendTgId = sdrServDepoRuleDMO.getSdrPendTgId();
			
			if (!DMO.isNull(sdrPendTgId)) {
				queryArgs.andFilterBy("SdrPendTgIdMatch").arg(sdrPendTgId);
			}
			
			String sdrPendUserId = sdrServDepoRuleDMO.getSdrPendUserId();
			
			if (!DMO.isNull(sdrPendUserId)) {
				queryArgs.andFilterBy("SdrPendUserIdMatch").arg(sdrPendUserId);
			}
			
			Integer sdrPayDelayDays = sdrServDepoRuleDMO.getSdrPayDelayDays();
			
			if (!DMO.isNull(sdrPayDelayDays)) {
				queryArgs.andFilterBy("SdrPayDelayDaysMatch").arg(sdrPayDelayDays);
			}
			
			String sdrOverrideFlag = sdrServDepoRuleDMO.getSdrOverrideFlag();
			
			if (!DMO.isNull(sdrOverrideFlag)) {
				queryArgs.andFilterBy("SdrOverrideFlagMatch").arg(sdrOverrideFlag);
			}
		}	
		
	
		return null;
	}	
	
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "SdrServDepoRule" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			
			case SdrServDepoRuleDMO.sdrPackageCodeFilter:
				part.andFilterBy(queryArgs, "SdrPackageCode", dao
						.wildcardForAnySequence());
			break;

			case SdrServDepoRuleDMO.sdrServiceCodeFilter:
				part.andFilterBy(queryArgs, "SdrServiceCode", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrVerRuleNumFilter:
				part.andFilterBy(queryArgs, "SdrVerRuleNum", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReasonIdFilter:
				part.andFilterBy(queryArgs, "SdrReasonId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrDepositAmountFilter:
				part.andFilterBy(queryArgs, "SdrDepositAmount", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReleaseFlagFilter:
				part.andFilterBy(queryArgs, "SdrReleaseFlag", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReleaseTgIdFilter:
				part.andFilterBy(queryArgs, "SdrReleaseTgId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReleaseTypeFilter:
				part.andFilterBy(queryArgs, "SdrReleaseType", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReleUserIdFilter:
				part.andFilterBy(queryArgs, "SdrReleUserId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrReleLetterIdFilter:
				part.andFilterBy(queryArgs, "SdrReleLetterId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrRelDelayDaysFilter:
				part.andFilterBy(queryArgs, "SdrRelDelayDays", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrPendingTypeFilter:
				part.andFilterBy(queryArgs, "sdrPendingType", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrPendTgIdFilter:
				part.andFilterBy(queryArgs, "SdrPendTgId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrPendUserIdFilter:
				part.andFilterBy(queryArgs, "SdrPendUserId", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrPayDelayDaysFilter:
				part.andFilterBy(queryArgs, "SdrPayDelayDays", dao
						.wildcardForAnySequence());
			break;
			
			case SdrServDepoRuleDMO.sdrOverrideFlagFilter:
				part.andFilterBy(queryArgs, "SdrOverrideFlag", dao
						.wildcardForAnySequence());
			break;
		}
	}
		return queryArgs;
	}
}
