package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class EarEpxactionArchAbstractDACImpl extends DAC implements EarEpxactionArchAbstractDAC{
	static DAOThrower thrower = DAOThrower.getDAOThrower( EarEpxactionArchAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	  public EarEpxactionArchAbstractDACImpl( 
			    UserContext userContext,
			    DAO         dao ) {
			    super( dao, thrower );
	 }
	  
	  public EarEpxactionArchAbstractDACImpl(DAO dao ) {
			    super( dao, thrower );
	 }
	  
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(EarEpxactionArchDMO earEpxactionArchDMO)throws EPPIXSeriousException{
		logger.debug("create( earEpxactionArchDMO )");
		thrower.ifParameterMissing("EarEpxactionArchDMO", earEpxactionArchDMO);

		dao.insert(earEpxactionArchDMO);
		
	}

//	public void delete(EarEpxactionArchDMO earEpxactionArchDMO)
//			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
//			EPPIXObjectExpiredException {
//
//		logger.debug("delete( EarEpxactionArchDMO )");
//
//		thrower.ifParameterMissing("EarEpxactionArchDMO", earEpxactionArchDMO);
//
//		thrower.ifParameterMissing("EarEpxactionArchDMO.earSubsystem",
//				earEpxactionArchDMO.getEarSubsystem());
//		
//		thrower.ifParameterMissing("EarEpxactionArchDMO.earActionSeq",
//				earEpxactionArchDMO.getEarActionSeq());
//		
//		dao.delete(earEpxactionArchDMO);
//	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
			
		logger.debug("delete( filter )");
		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		dao.delete("EarEpxactionArch", args.getFilterBy(), args);
		
	}

//	public boolean exists(EarEpxactionArchDMO earEpxactionArchDMO)
//			throws EPPIXSeriousException {
//		logger.debug("exists( EarEpxactionArchDMO)");
//
//		return dao.exists("EarEpxactionArch", "filterByPrimaryKey", new DAOArgs(2)
//		.arg((earEpxactionArchDMO.getEarSubsystem() == null) ? null : earEpxactionArchDMO.getEarSubsystem().trim())
//		.arg(earEpxactionArchDMO.getEarActionSeq()));
//	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

//	public EarEpxactionArchDMO get(EarEpxactionArchDMO earEpxactionArchDMO)
//			throws EPPIXSeriousException {
//		logger.debug("get( EarEpxactionArchDMO )");
//
//		thrower.ifParameterMissing("EarEpxactionArchDMO", earEpxactionArchDMO);
//
//		return (EarEpxactionArchDMO) dao.get(earEpxactionArchDMO);
//	}

	public EarEpxactionArchDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return (EarEpxactionArchDMO) dao.get(args.getDMLName(), args.getFilterBy(),
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

//	public void modify(EarEpxactionArchDMO earEpxactionArchDMO)
//			throws EPPIXSeriousException, EPPIXObjectExpiredException,
//			EPPIXObjectNotFoundException {
//		logger.debug("modify( EarEpxactionArchDMO )");
//
//		thrower.ifParameterMissing("EarEpxactionArchDMO", earEpxactionArchDMO);
//
//		thrower.ifParameterMissing("EarEpxactionArchDMO.earSubsystem",
//				earEpxactionArchDMO.getEarSubsystem());
//		
//		thrower.ifParameterMissing("EarEpxactionArchDMO.earActionSeq",
//				earEpxactionArchDMO.getEarActionSeq());
//
//		dao.update(earEpxactionArchDMO);
//		
//	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
				EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new EarEpxactionArchDMO(), filterQueryArgs(filter, null));
		
	}

	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "EarEpxactionArch" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
					case EarEpxactionArchDMO.earBbillAcNoFilter:
						part.andFilterBy(queryArgs, "EarBbillAcNo", dao
											.wildcardForAnySequence());
					break;
					case EarEpxactionArchDMO.earSubscriberIdFilter:
						part.andFilterBy(queryArgs, "EarSubscriberId", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earSimNoFilter:
						part.andFilterBy(queryArgs, "EarSimNo", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earImsiNoFilter:
						part.andFilterBy(queryArgs, "EarImsiNo", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earMsisdnNoFilter:
						part.andFilterBy(queryArgs, "EarMsisdnNo", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earInvoiceNoFilter:
						part.andFilterBy(queryArgs, "EarInvoiceNo", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earReferenceNoFilter:
						part.andFilterBy(queryArgs, "EarReferenceNo", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earSubsystemFilter:
						part.andFilterBy(queryArgs, "EarSubsystem", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earRelationFilter:
						part.andFilterBy(queryArgs, "EarRelation", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earTriggerFilter:
						part.andFilterBy(queryArgs, "EarTrigger", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earActionTypeFilter:
						part.andFilterBy(queryArgs, "EarActionType", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earActionSeqFilter:
						part.andFilterBy(queryArgs, "EarActionSeq", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earDocTypeFilter:
						part.andFilterBy(queryArgs, "EarDocType", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earServiceCodeFilter:
						part.andFilterBy(queryArgs, "EarServiceCode", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earReasonCodeFilter:
						part.andFilterBy(queryArgs, "EarReasonCode", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earTableNameFilter:
						part.andFilterBy(queryArgs, "EarTableName", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earColumnNameFilter:
						part.andFilterBy(queryArgs, "EarColumnName", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earNewValueFilter:
						part.andFilterBy(queryArgs, "EarNewValue", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earWhereColumnFilter:
						part.andFilterBy(queryArgs, "EarWhereColumn", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earWhereTypeFilter:
						part.andFilterBy(queryArgs, "EarWhereType", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earChargeCodeFilter:
						part.andFilterBy(queryArgs, "EarChargeCode", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earVoiceMessFilter:
						part.andFilterBy(queryArgs, "EarVoiceMess", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnActionIdFilter:
						part.andFilterBy(queryArgs, "EarAmnActionId", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnTargTypeFilter:
						part.andFilterBy(queryArgs, "EarAmnTargType", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnTargGrpFilter:
						part.andFilterBy(queryArgs, "EarAmnTargGrp", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnTargUserFilter:
						part.andFilterBy(queryArgs, "EarAmnTargUser", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnDeadlineFilter:
						part.andFilterBy(queryArgs, "EarAmnDeadline", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnStatusFilter:
						part.andFilterBy(queryArgs, "EarAmnStatus", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnSourceFilter:
						part.andFilterBy(queryArgs, "EarAmnSource", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earAmnOpenedByFilter:
						part.andFilterBy(queryArgs, "EarAmnOpenedBy", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earUdaActionIdFilter:
						part.andFilterBy(queryArgs, "EarUdaActionId", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earStatusFilter:
						part.andFilterBy(queryArgs, "EarStatus", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earRetryRemainFilter:
						part.andFilterBy(queryArgs, "EarRetryRemain", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earLastRetryFilter:
						part.andFilterBy(queryArgs, "EarLastRetry", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earErrorTextFilter:
						part.andFilterBy(queryArgs, "EarErrorText", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earSubmittedFilter:
						part.andFilterBy(queryArgs, "EarSubmitted", dao
											.wildcardForAnySequence());
		
					break;
					case EarEpxactionArchDMO.earActionedFilter:		
						part.andFilterBy(queryArgs, "EarActioned", dao
											.wildcardForAnySequence());
		
					break;
			}
		}

		return queryArgs;
	}
	
	protected DAOParamQueryArgs paramQueryArgs(EarEpxactionArchDMO earEpxactionArchDMO) {
		logger.debug("paramQueryArgs( earEpxactionArchDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("EarEpxactionArch",
				37 * 2);
	
		if(earEpxactionArchDMO != null){
			
			String earBbillAcNo =  earEpxactionArchDMO.getEarBbillAcNo();
			
			if (!DMO.isNull(earBbillAcNo)) {
				queryArgs.andFilterBy("EarBbillAcNoRefMatch").arg(
						earBbillAcNo + dao.wildcardForAnySequence());
			}
			
			Integer earSubscriberId = earEpxactionArchDMO.getEarSubscriberId();
			
			if (!DMO.isNull(earSubscriberId)) {
				queryArgs.andFilterBy("EarSubscriberIdMatch").arg(
						earSubscriberId);
			}
			
			String earSimNo = earEpxactionArchDMO.getEarSimNo();
			
			if (!DMO.isNull(earSimNo)) {
				queryArgs.andFilterBy("EarSimNoMatch").arg(
						earSimNo + dao.wildcardForAnySequence());
			}
			
			String earImsiNo = earEpxactionArchDMO.getEarImsiNo();
			
			if (!DMO.isNull(earImsiNo)) {
				queryArgs.andFilterBy("EarImsiNoMatch").arg(
						earImsiNo + dao.wildcardForAnySequence());
			}
			
			String earMsisdnNo = earEpxactionArchDMO.getEarMsisdnNo();
			
			if (!DMO.isNull(earMsisdnNo)) {
				queryArgs.andFilterBy("EarMsisdnNoMatch").arg(
						earMsisdnNo + dao.wildcardForAnySequence());
			}
			
			String earInvoiceNo = earEpxactionArchDMO.getEarInvoiceNo();
			
			if (!DMO.isNull(earInvoiceNo)) {
				queryArgs.andFilterBy("earInvoiceNoMatch").arg(
						earInvoiceNo + dao.wildcardForAnySequence());
			}
			
			String earReferenceNo = earEpxactionArchDMO.getEarReferenceNo();
			
			if (!DMO.isNull(earReferenceNo)) {
				queryArgs.andFilterBy("EarReferenceNoMatch").arg(
						earReferenceNo + dao.wildcardForAnySequence());
			}
			
			String earSubsystem = earEpxactionArchDMO.getEarSubsystem();
			
			if (!DMO.isNull(earSubsystem)) {
				queryArgs.andFilterBy("EarSubsystemMatch").arg(
						earSubsystem + dao.wildcardForAnySequence());
			}
			
			String earRelation = earEpxactionArchDMO.getEarRelation();
			
			if (!DMO.isNull(earRelation)) {
				queryArgs.andFilterBy("EarRelationMatch").arg(
						earRelation + dao.wildcardForAnySequence());
			}
			
			String earTrigger = earEpxactionArchDMO.getEarTrigger();
			
			if (!DMO.isNull(earTrigger)) {
				queryArgs.andFilterBy("EarTriggerMatch").arg(
						earTrigger + dao.wildcardForAnySequence());
			}
			
			String earActionType = earEpxactionArchDMO.getEarActionType();
			
			if (!DMO.isNull(earActionType)) {
				queryArgs.andFilterBy("EarActionTypeMatch").arg(
						earActionType + dao.wildcardForAnySequence());
			}
			
			Integer earActionSeq = earEpxactionArchDMO.getEarActionSeq();
			
			if (!DMO.isNull(earActionSeq)) {
				queryArgs.andFilterBy("EarActionSeqMatch").arg(
						earActionSeq);
			}
			
			String earDocType = earEpxactionArchDMO.getEarDocType();
			
			if (!DMO.isNull(earDocType)) {
				queryArgs.andFilterBy("EarDocTypeMatch").arg(
						earDocType + dao.wildcardForAnySequence());
			}
			
			String earServiceCode = earEpxactionArchDMO.getEarServiceCode();
			
			if (!DMO.isNull(earServiceCode)) {
				queryArgs.andFilterBy("EarServiceCodeMatch").arg(
						earServiceCode + dao.wildcardForAnySequence());
			}
			
			String earReasonCode = earEpxactionArchDMO.getEarReasonCode();
			
			if (!DMO.isNull(earReasonCode)) {
				queryArgs.andFilterBy("EarReasonCodeMatch").arg(
						earReasonCode + dao.wildcardForAnySequence());
			}
			
			String earTableName = earEpxactionArchDMO.getEarTableName();
			
			if (!DMO.isNull(earTableName)) {
				queryArgs.andFilterBy("EarTableNameMatch").arg(
						earTableName + dao.wildcardForAnySequence());
			}
			
			String earColumnName = earEpxactionArchDMO.getEarColumnName();
			
			if (!DMO.isNull(earColumnName)) {
				queryArgs.andFilterBy("EarColumnNameMatch").arg(
						earColumnName + dao.wildcardForAnySequence());
			}
			
			String earNewValue = earEpxactionArchDMO.getEarNewValue();
			
			if (!DMO.isNull(earNewValue)) {
				queryArgs.andFilterBy("EarNewValueMatch").arg(
						earNewValue + dao.wildcardForAnySequence());
			}
			
			String earWhereColumn = earEpxactionArchDMO.getEarWhereColumn();
			
			if (!DMO.isNull(earWhereColumn)) {
				queryArgs.andFilterBy("EarWhereColumnMatch").arg(
						earWhereColumn + dao.wildcardForAnySequence());
			}
			
			String earWhereType = earEpxactionArchDMO.getEarWhereType();
			
			if (!DMO.isNull(earWhereType)) {
				queryArgs.andFilterBy("earWhereTypeMatch").arg(
						earWhereType + dao.wildcardForAnySequence());
			}
			
			String earChargeCode = earEpxactionArchDMO.getEarChargeCode();
			
			if (!DMO.isNull(earChargeCode)) {
				queryArgs.andFilterBy("EarChargeCodeMatch").arg(
						earChargeCode + dao.wildcardForAnySequence());
			}
			
			String earVoiceMess = earEpxactionArchDMO.getEarVoiceMess();
			
			if (!DMO.isNull(earVoiceMess)) {
				queryArgs.andFilterBy("EarVoiceMessMatch").arg(
						earVoiceMess + dao.wildcardForAnySequence());
			}
			
			Integer earAmnActionId = earEpxactionArchDMO.getEarAmnActionId();
			
			if (!DMO.isNull(earAmnActionId)) {
				queryArgs.andFilterBy("EarAmnActionIdMatch").arg(
						earAmnActionId);
			}
			
			String earAmnTargType = earEpxactionArchDMO.getEarAmnTargType();
			
			if (!DMO.isNull(earAmnTargType)) {
				queryArgs.andFilterBy("EarAmnTargTypeMatch").arg(
						earAmnTargType + dao.wildcardForAnySequence());
			}
			
			Integer earAmnTargGrp = earEpxactionArchDMO.getEarAmnTargGrp();
			
			if (!DMO.isNull(earAmnTargGrp)) {
				queryArgs.andFilterBy("EarAmnTargGrpMatch").arg(
						earAmnTargGrp);
			}
			
			String earAmnTargUser = earEpxactionArchDMO.getEarAmnTargUser();
			
			if (!DMO.isNull(earAmnTargUser)) {
				queryArgs.andFilterBy("EarAmnTargUserMatch").arg(
						earAmnTargUser + dao.wildcardForAnySequence());
			}
			
			DateTime earAmnDeadline = earEpxactionArchDMO.getEarAmnDeadline();
			
			if (!DMO.isNull(earAmnDeadline)) {
				queryArgs.andFilterBy("EarAmnDeadlineMatch").arg(
						earAmnDeadline);
			}
			
			String earAmnStatus = earEpxactionArchDMO.getEarAmnStatus();
			
			if (!DMO.isNull(earAmnStatus)) {
				queryArgs.andFilterBy("EarAmnStatusMatch").arg(
						earAmnStatus + dao.wildcardForAnySequence());
			}
			
			String earAmnSource = earEpxactionArchDMO.getEarAmnSource();
			
			if (!DMO.isNull(earAmnSource)) {
				queryArgs.andFilterBy("EarAmnSourceMatch").arg(
						earAmnSource + dao.wildcardForAnySequence());
			}
			
			String earAmnOpenedBy = earEpxactionArchDMO.getEarAmnOpenedBy();
			
			if (!DMO.isNull(earAmnOpenedBy)) {
				queryArgs.andFilterBy("EarAmnOpenedByMatch").arg(
						earAmnOpenedBy + dao.wildcardForAnySequence());
			}
			
			Integer earUdaActionId = earEpxactionArchDMO.getEarUdaActionId();
			
			if (!DMO.isNull(earUdaActionId)) {
				queryArgs.andFilterBy("EarUdaActionIdMatch").arg(
						earUdaActionId);
			}
			
			String earStatus = earEpxactionArchDMO.getEarStatus();
			
			if (!DMO.isNull(earStatus)) {
				queryArgs.andFilterBy("EarStatusMatch").arg(
						earStatus + dao.wildcardForAnySequence());
			}
			
			Integer earRetryRemain = earEpxactionArchDMO.getEarRetryRemain();
			
			if (!DMO.isNull(earRetryRemain)) {
				queryArgs.andFilterBy("EarRetryRemainMatch").arg(
						earRetryRemain);
			}
			
			DateTime earLastRetry = earEpxactionArchDMO.getEarLastRetry();
			
			if (!DMO.isNull(earLastRetry)) {
				queryArgs.andFilterBy("EarLastRetryMatch").arg(
						earLastRetry);
			}
			
			String earErrorText = earEpxactionArchDMO.getEarErrorText();
			
			if (!DMO.isNull(earErrorText)) {
				queryArgs.andFilterBy("EarErrorTextMatch").arg(
						earErrorText + dao.wildcardForAnySequence());
			}
			
			DateTime earSubmitted = earEpxactionArchDMO.getEarSubmitted();
			
			if (!DMO.isNull(earSubmitted)) {
				queryArgs.andFilterBy("EarSubmittedMatch").arg(
						earSubmitted);
			}
			
			DateTime earActioned = earEpxactionArchDMO.getEarActioned();		
			
			if (!DMO.isNull(earActioned)) {
				queryArgs.andFilterBy("EarActionedMatch").arg(
						earActioned);
			}
		}
		
		return queryArgs;
	}	
	
}
