package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.core.UserContext;
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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class CrbCustRiskBalAbstractDACImpl extends DAC implements
		CrbCustRiskBalAbstractDAC {

	static DAOThrower thrower = DAOThrower
			.getDAOThrower(CrbCustRiskBalAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public CrbCustRiskBalAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public CrbCustRiskBalAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");
		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public CrbCustRiskBalDMO create(CrbCustRiskBalDMO crbCustRiskBalDMO)
			throws EPPIXSeriousException {
		logger.debug("create( crbCustRiskBalDMO )");
		thrower.ifParameterMissing("crbCustRiskBalDMO", crbCustRiskBalDMO);
		dao.insert(crbCustRiskBalDMO);
		return crbCustRiskBalDMO;

	}

	public void delete(CrbCustRiskBalDMO crbCustRiskBalDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( crbCustRiskBalDMO )");

		thrower.ifParameterMissing("crbCustRiskBalDMO", crbCustRiskBalDMO);

		thrower.ifParameterMissing("crbCustRiskBalDMO.crbBillAcNo()",
				crbCustRiskBalDMO.getCrbBillAcNo());

		dao.delete(crbCustRiskBalDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("crbCustRiskBal", args.getFilterBy(), args);
	}

	public boolean exists(CrbCustRiskBalDMO crbCustRiskBalDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( crbCustRiskBalDMO)");

		return dao.exists("crbCustRiskBal", "filterByPrimaryKey",
				new DAOArgs(1).arg(crbCustRiskBalDMO.getCrbBillAcNo()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");
		return dao.exists(filterQueryArgs(filter, null));
	}

	public CrbCustRiskBalDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (CrbCustRiskBalDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

	public CrbCustRiskBalDMO get(CrbCustRiskBalDMO crbCustRiskBalDMO)
			throws EPPIXSeriousException {
		logger.debug("get( CrbCustRiskBalDMO )");
		thrower.ifParameterMissing("CrbCustRiskBalDMO", crbCustRiskBalDMO);
		return (CrbCustRiskBalDMO) dao.get(crbCustRiskBalDMO);
	}

	public DTOList getList(DTOListState state,
			CrbCustRiskBalDMO crbCustRiskBalDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, crbCustRiskBalDMO )");
		return dao.getListAbs(state, paramQueryArgs(crbCustRiskBalDMO));
	}

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("getList( state, filter )");
		return dao.getListAbs(state, filterQueryArgs(filter, null));
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

	public void modify(CrbCustRiskBalDMO crbCustRiskBalDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( crbCustRiskBalDMO )");

		thrower.ifParameterMissing("crbCustRiskBalDMO", crbCustRiskBalDMO);

		thrower.ifParameterMissing("crbCustRiskBalDMO.getCrbBillAcNo()",
				crbCustRiskBalDMO.getCrbBillAcNo());
		dao.update(crbCustRiskBalDMO);
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao
				.updateCustom(new CrbCustRiskBalDMO(), filterQueryArgs(filter,
						null));
	}

	protected DAOParamQueryArgs paramQueryArgs(
			CrbCustRiskBalDMO crbCustRiskBalDMO) {
		logger.debug("paramQueryArgs( crbCustRiskBalDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("crbCustRiskBal",
				23 * 2);
		  
		String crbBillAcNo = crbCustRiskBalDMO.getCrbBillAcNo();
		      if ( !DMO.isNull( crbBillAcNo ) ) {
		        queryArgs.andFilterBy( "CrbBillAcNo" )
		                 .arg( crbBillAcNo );
		      }

		String crbAccountType = crbCustRiskBalDMO.getCrbAccountType();
		      if ( !DMO.isNull( crbAccountType ) ) {
		        queryArgs.andFilterBy( "CrbAccountType" )
		                 .arg( crbAccountType );
		      }

		BigDecimal crbCreditLimit = crbCustRiskBalDMO.getCrbCreditLimit();
		      if ( !DMO.isNull( crbCreditLimit ) ) {
		        queryArgs.andFilterBy( "CrbCreditLimit" )
		                 .arg( crbCreditLimit );
		      }

		BigDecimal crbAccBal = crbCustRiskBalDMO.getCrbAccBal();
		      if ( !DMO.isNull( crbAccBal ) ) {
		        queryArgs.andFilterBy( "CrbAccBal" )
		                 .arg( crbAccBal );
		      }

		BigDecimal crbUnbillCharges = crbCustRiskBalDMO.getCrbUnbillCharges();
		      if ( !DMO.isNull( crbUnbillCharges ) ) {
		        queryArgs.andFilterBy( "CrbUnbillCharges" )
		                 .arg( crbUnbillCharges );
		      }

		BigDecimal crbUnbillCalls = crbCustRiskBalDMO.getCrbUnbillCalls();
		      if ( !DMO.isNull( crbUnbillCalls ) ) {
		        queryArgs.andFilterBy( "CrbUnbillCalls" )
		                 .arg( crbUnbillCalls );
		      }

		Short crbDiff = crbCustRiskBalDMO.getCrbDiff();
		      if ( !DMO.isNull( crbDiff) ) {
		        queryArgs.andFilterBy( "CrbDiff" )
		                 .arg( crbDiff );
		      }

		Short crbNextThreshold = crbCustRiskBalDMO.getCrbNextThreshold();
		      if ( !DMO.isNull( crbNextThreshold ) ) {
		        queryArgs.andFilterBy( "CrbNextThreshold" )
		                 .arg( crbNextThreshold );
		      }

		Short crbPrevThreshold = crbCustRiskBalDMO.getCrbPrevThreshold();
		      if ( !DMO.isNull( crbPrevThreshold ) ) {
		        queryArgs.andFilterBy( "CrbPrevThreshold" )
		                 .arg( crbPrevThreshold );
		      }

		String crbCollPlan = crbCustRiskBalDMO.getCrbCollPlan();
		      if ( !DMO.isNull( crbCollPlan ) ) {
		        queryArgs.andFilterBy( "CrbCollPlan" )
		                 .arg( crbCollPlan );
		      }

		Short crbMinThreshold = crbCustRiskBalDMO.getCrbMinThreshold();
		      if ( !DMO.isNull( crbMinThreshold ) ) {
		        queryArgs.andFilterBy( "CrbMinThreshold" )
		                 .arg( crbMinThreshold );
		      }

		String crbActivateFlag = crbCustRiskBalDMO.getCrbActivateFlag();
		      if ( !DMO.isNull( crbActivateFlag ) ) {
		        queryArgs.andFilterBy( "CrbActivateFlag" )
		                 .arg( crbActivateFlag );
		      }

		String crbEapFlag = crbCustRiskBalDMO.getCrbEapFlag();
		      if ( !DMO.isNull( crbEapFlag ) ) {
		        queryArgs.andFilterBy( "CrbEapFlag" )
		                 .arg( crbEapFlag );
		      }

		String crbBlStatus = crbCustRiskBalDMO.getCrbBlStatus();
		      if ( !DMO.isNull( crbBlStatus ) ) {
		        queryArgs.andFilterBy( "CrbBlStatus" )
		                 .arg( crbBlStatus );
		      }

		String crbBlType = crbCustRiskBalDMO.getCrbBlType();
		      if ( !DMO.isNull( crbBlType ) ) {
		        queryArgs.andFilterBy( "CrbBlType" )
		                 .arg( crbBlType );
		      }

		BigDecimal crbBlLimit = crbCustRiskBalDMO.getCrbBlLimit();
		      if ( !DMO.isNull(crbBlLimit ) ) {
		        queryArgs.andFilterBy( "CrbBlLimit" )
		                 .arg( crbBlLimit );
		      }

		Short crbBlDiff = crbCustRiskBalDMO.getCrbBlDiff();
		      if ( !DMO.isNull( crbBlDiff ) ) {
		        queryArgs.andFilterBy( "CrbBlDiff" )
		                 .arg( crbBlDiff );
		      }

		BigDecimal crbBlNextThresh = crbCustRiskBalDMO.getCrbBlNextThresh();
		      if ( !DMO.isNull( crbBlNextThresh ) ) {
		        queryArgs.andFilterBy( "CrbBlNextThresh" )
		                 .arg( crbBlNextThresh );
		      }

		BigDecimal crbBlPrevThresh = crbCustRiskBalDMO.getCrbBlPrevThresh();
		      if ( !DMO.isNull( crbBlPrevThresh ) ) {
		        queryArgs.andFilterBy( "CrbBlPrevThresh" )
		                 .arg( crbBlPrevThresh );
		      }

		Integer crbBlNextAcnId = crbCustRiskBalDMO.getCrbBlNextAcnId();
		      if ( !DMO.isNull( crbBlNextAcnId ) ) {
		        queryArgs.andFilterBy( "CrbBlNextAcnId" )
		                 .arg( crbBlNextAcnId );
		      }

		Integer crbBlPrevAcnId = crbCustRiskBalDMO.getCrbBlPrevAcnId();
		      if ( !DMO.isNull( crbBlPrevAcnId ) ) {
		        queryArgs.andFilterBy( "CrbBlPrevAcnId" )
		                 .arg( crbBlPrevAcnId );
		      }

		String crbBlTrigFlag = crbCustRiskBalDMO.getCrbBlTrigFlag();
		      if ( !DMO.isNull( crbBlTrigFlag ) ) {
		        queryArgs.andFilterBy( "CrbBlTrigFlag" )
		                 .arg( crbBlTrigFlag );
		      }

		DateTime crbBlLastUpdate = crbCustRiskBalDMO.getCrbBlLastUpdate();
		      if ( !DMO.isNull( crbBlLastUpdate ) ) {
		        queryArgs.andFilterBy( "CrbBlLastUpdate" )
		                 .arg( crbBlLastUpdate );
		      }
		return queryArgs;
	}

	protected DAOParamQueryArgs filterQueryArgs( 
			    QueryFilter filter,
			    String      dmlName ) {
			    List parts = filter.getParts(  );
			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
			        ? "crbCustRiskBal" : dmlName, parts.size(  ) );

			    Iterator it = parts.iterator();
			    
			    while(it.hasNext()){
			    	FilterPart part = (FilterPart)it.next();
			    	switch ( part.getIndex(  ) ) {
			    case CrbCustRiskBalDMO.crbBillAcNoFilter:
			          part.andFilterBy( queryArgs, "CrbBillAcNo",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbAccountTypeFilter:
			          part.andFilterBy( queryArgs, "CrbAccountType",
			            dao.wildcardForAnySequence(  ) );
			          break;
			          
			    case CrbCustRiskBalDMO.crbCreditLimitFilter:
			          part.andFilterBy( queryArgs, "CrbCreditLimit");
			          break;

			    case CrbCustRiskBalDMO.crbAccBalFilter:
			          part.andFilterBy( queryArgs, "CrbAccBal");
			          break;

			    case CrbCustRiskBalDMO.crbUnbillChargesFilter:
			          part.andFilterBy( queryArgs, "CrbUnbillCharges");
			          break;

			    case CrbCustRiskBalDMO.crbUnbillCallsFilter:
			          part.andFilterBy( queryArgs, "CrbUnbillCalls");
			          break;

			    case CrbCustRiskBalDMO.crbDiffFilter:
			          part.andFilterBy( queryArgs, "CrbDiff");
			          break;

			    case CrbCustRiskBalDMO.crbNextThresholdFilter:
			          part.andFilterBy( queryArgs, "CrbNextThreshold");
			          break;

			    case CrbCustRiskBalDMO.crbPrevThresholdFilter:
			          part.andFilterBy( queryArgs, "CrbPrevThreshold");
			          break;

			    case CrbCustRiskBalDMO.crbCollPlanFilter:
			          part.andFilterBy( queryArgs, "CrbCollPlan",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbMinThresholdFilter:
			          part.andFilterBy( queryArgs, "CrbMinThreshold");
			          break;

			    case CrbCustRiskBalDMO.crbActivateFlagFilter:
			          part.andFilterBy( queryArgs, "CrbActivateFlag",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbEapFlagFilter:
			          part.andFilterBy( queryArgs, "CrbEapFlag",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbBlStatusFilter:
			          part.andFilterBy( queryArgs, "CrbBlStatus",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbBlTypeFilter:
			          part.andFilterBy( queryArgs, "CrbBlType",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbBlLimitFilter:
			          part.andFilterBy( queryArgs, "CrbBlLimit");
			          break;

			    case CrbCustRiskBalDMO.crbBlDiffFilter:
			          part.andFilterBy( queryArgs, "CrbBlDiff");
			          break;

			    case CrbCustRiskBalDMO.crbBlNextThreshFilter:
			          part.andFilterBy( queryArgs, "CrbBlNextThresh");
			          break;

			    case CrbCustRiskBalDMO.crbBlPrevThreshFilter:
			          part.andFilterBy( queryArgs, "CrbBlPrevThresh");
			          break;

			    case CrbCustRiskBalDMO.crbBlNextAcnIdFilter:
			          part.andFilterBy( queryArgs, "CrbBlNextAcnId");
			          break;

			    case CrbCustRiskBalDMO.crbBlPrevAcnIdFilter:
			          part.andFilterBy( queryArgs, "CrbBlPrevAcnId");
			          break;

			    case CrbCustRiskBalDMO.crbBlTrigFlagFilter:
			          part.andFilterBy( queryArgs, "CrbBlTrigFlag",
			            dao.wildcardForAnySequence(  ) );
			          break;

			    case CrbCustRiskBalDMO.crbBlLastUpdateFilter:
			          part.andFilterBy( queryArgs, "CrbBlLastUpdate");
			          break;
			    	}
			    }
		return queryArgs;
	}
}
