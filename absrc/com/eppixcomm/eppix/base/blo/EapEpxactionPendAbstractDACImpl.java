package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
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

public class EapEpxactionPendAbstractDACImpl extends DAC implements EapEpxactionPendAbstractDAC{
	static DAOThrower thrower = DAOThrower.getDAOThrower( EapEpxactionPendAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	  public EapEpxactionPendAbstractDACImpl( 
			    UserContext userContext,
			    DAO         dao ) {
			    super( dao, thrower );
	 }
	  
	  public EapEpxactionPendAbstractDACImpl(DAO dao ) {
			    super( dao, thrower );
	 }
	  
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(EapEpxactionPendDMO eapEpxactionPendDMO)throws EPPIXSeriousException{
		logger.debug("create( eapEpxactionPendDMO )");
		thrower.ifParameterMissing("EapEpxactionPendDMO", eapEpxactionPendDMO);

		dao.insert(eapEpxactionPendDMO);
		
	}

	public void delete(EapEpxactionPendDMO eapEpxactionPendDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {

		logger.debug("delete( EapEpxactionPendDMO )");

		thrower.ifParameterMissing("EapEpxactionPendDMO", eapEpxactionPendDMO);

		thrower.ifParameterMissing("EapEpxactionPendDMO.eapSubsystem",
				eapEpxactionPendDMO.getEapSubsystem());
		
		thrower.ifParameterMissing("EapEpxactionPendDMO.eapActionSeq",
				eapEpxactionPendDMO.getEapActionSeq());
		
		dao.delete(eapEpxactionPendDMO);
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
			
		logger.debug("delete( filter )");
		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		dao.delete("EapEpxactionPend", args.getFilterBy(), args);
		
	}

	public boolean exists(EapEpxactionPendDMO eapEpxactionPendDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EapEpxactionPendDMO)");

		return dao.exists("EapEpxactionPend", "filterByPrimaryKey", new DAOArgs(2)
		.arg((eapEpxactionPendDMO.getEapSubsystem() == null) ? null : eapEpxactionPendDMO.getEapSubsystem().trim())
		.arg(eapEpxactionPendDMO.getEapActionSeq()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	public EapEpxactionPendDMO get(EapEpxactionPendDMO eapEpxactionPendDMO)
			throws EPPIXSeriousException {
		logger.debug("get( EapEpxactionPendDMO )");

		thrower.ifParameterMissing("EapEpxactionPendDMO", eapEpxactionPendDMO);

		return (EapEpxactionPendDMO) dao.get(eapEpxactionPendDMO);
	}

	public EapEpxactionPendDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);
		return (EapEpxactionPendDMO) dao.get(args.getDMLName(), args.getFilterBy(),
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

	public void modify(EapEpxactionPendDMO eapEpxactionPendDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( EapEpxactionPendDMO )");

		thrower.ifParameterMissing("EapEpxactionPendDMO", eapEpxactionPendDMO);

		thrower.ifParameterMissing("EapEpxactionPendDMO.eapSubsystem",
				eapEpxactionPendDMO.getEapSubsystem());
		
		thrower.ifParameterMissing("EapEpxactionPendDMO.eapActionSeq",
				eapEpxactionPendDMO.getEapActionSeq());

		dao.update(eapEpxactionPendDMO);
		
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
				EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new EapEpxactionPendDMO(), filterQueryArgs(filter, null));
		
	}

	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "EapEpxactionPend" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
					case EapEpxactionPendDMO.eapBbillAcNoFilter:
						part.andFilterBy(queryArgs, "EapBbillAcNo", dao
											.wildcardForAnySequence());
					break;
					case EapEpxactionPendDMO.eapSubscriberIdFilter:
						part.andFilterBy(queryArgs, "EapSubscriberId", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapSimNoFilter:
						part.andFilterBy(queryArgs, "EapSimNo", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapImsiNoFilter:
						part.andFilterBy(queryArgs, "EapImsiNo", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapMsisdnNoFilter:
						part.andFilterBy(queryArgs, "EapMsisdnNo", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapInvoiceNoFilter:
						part.andFilterBy(queryArgs, "EapInvoiceNo", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapReferenceNoFilter:
						part.andFilterBy(queryArgs, "EapReferenceNo", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapSubsystemFilter:
						part.andFilterBy(queryArgs, "EapSubsystem", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapRelationFilter:
						part.andFilterBy(queryArgs, "EapRelation", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapTriggerFilter:
						part.andFilterBy(queryArgs, "EapTrigger", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapActionTypeFilter:
						part.andFilterBy(queryArgs, "EapActionType", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapActionSeqFilter:
						part.andFilterBy(queryArgs, "EapActionSeq", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapDocTypeFilter:
						part.andFilterBy(queryArgs, "EapDocType", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapServiceCodeFilter:
						part.andFilterBy(queryArgs, "EapServiceCode", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapReasonCodeFilter:
						part.andFilterBy(queryArgs, "EapReasonCode", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapTableNameFilter:
						part.andFilterBy(queryArgs, "EapTableName", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapColumnNameFilter:
						part.andFilterBy(queryArgs, "EapColumnName", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapNewValueFilter:
						part.andFilterBy(queryArgs, "EapNewValue", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapWhereColumnFilter:
						part.andFilterBy(queryArgs, "EapWhereColumn", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapWhereTypeFilter:
						part.andFilterBy(queryArgs, "EapWhereType", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapChargeCodeFilter:
						part.andFilterBy(queryArgs, "EapChargeCode", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapVoiceMessFilter:
						part.andFilterBy(queryArgs, "EapVoiceMess", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnActionIdFilter:
						part.andFilterBy(queryArgs, "EapAmnActionId", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnTargTypeFilter:
						part.andFilterBy(queryArgs, "EapAmnTargType", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnTargGrpFilter:
						part.andFilterBy(queryArgs, "EapAmnTargGrp", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnTargUserFilter:
						part.andFilterBy(queryArgs, "EapAmnTargUser", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnDeadlineFilter:
						part.andFilterBy(queryArgs, "EapAmnDeadline", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnStatusFilter:
						part.andFilterBy(queryArgs, "EapAmnStatus", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnSourceFilter:
						part.andFilterBy(queryArgs, "EapAmnSource", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapAmnOpenedByFilter:
						part.andFilterBy(queryArgs, "EapAmnOpenedBy", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapUdaActionIdFilter:
						part.andFilterBy(queryArgs, "EapUdaActionId", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapStatusFilter:
						part.andFilterBy(queryArgs, "EapStatus", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapRetryRemainFilter:
						part.andFilterBy(queryArgs, "EapRetryRemain", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapLastRetryFilter:
						part.andFilterBy(queryArgs, "EapLastRetry", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapErrorTextFilter:
						part.andFilterBy(queryArgs, "EapErrorText", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapSubmittedFilter:
						part.andFilterBy(queryArgs, "EapSubmitted", dao
											.wildcardForAnySequence());
		
					break;
					case EapEpxactionPendDMO.eapActionedFilter:		
						part.andFilterBy(queryArgs, "EapActioned", dao
											.wildcardForAnySequence());
		
					break;
			}
		}

		return queryArgs;
	}
	
	protected DAOParamQueryArgs paramQueryArgs(EapEpxactionPendDMO eapEpxactionPendDMO) {
		logger.debug("paramQueryArgs( eapEpxactionPendDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("EapEpxactionPend",
				37 * 2);
	
		if(eapEpxactionPendDMO != null){
			
			String eapBbillAcNo =  eapEpxactionPendDMO.getEapBbillAcNo();
			
			if (!DMO.isNull(eapBbillAcNo)) {
				queryArgs.andFilterBy("EapBbillAcNoRefMatch").arg(
						eapBbillAcNo + dao.wildcardForAnySequence());
			}
			
			Integer eapSubscriberId = eapEpxactionPendDMO.getEapSubscriberId();
			
			if (!DMO.isNull(eapSubscriberId)) {
				queryArgs.andFilterBy("EapSubscriberIdMatch").arg(
						eapSubscriberId);
			}
			
			String eapSimNo = eapEpxactionPendDMO.getEapSimNo();
			
			if (!DMO.isNull(eapSimNo)) {
				queryArgs.andFilterBy("EapSimNoMatch").arg(
						eapSimNo + dao.wildcardForAnySequence());
			}
			
			String eapImsiNo = eapEpxactionPendDMO.getEapImsiNo();
			
			if (!DMO.isNull(eapImsiNo)) {
				queryArgs.andFilterBy("EapImsiNoMatch").arg(
						eapImsiNo + dao.wildcardForAnySequence());
			}
			
			String eapMsisdnNo = eapEpxactionPendDMO.getEapMsisdnNo();
			
			if (!DMO.isNull(eapMsisdnNo)) {
				queryArgs.andFilterBy("EapMsisdnNoMatch").arg(
						eapMsisdnNo + dao.wildcardForAnySequence());
			}
			
			String eapInvoiceNo = eapEpxactionPendDMO.getEapInvoiceNo();
			
			if (!DMO.isNull(eapInvoiceNo)) {
				queryArgs.andFilterBy("eapInvoiceNoMatch").arg(
						eapInvoiceNo + dao.wildcardForAnySequence());
			}
			
			String eapReferenceNo = eapEpxactionPendDMO.getEapReferenceNo();
			
			if (!DMO.isNull(eapReferenceNo)) {
				queryArgs.andFilterBy("EapReferenceNoMatch").arg(
						eapReferenceNo + dao.wildcardForAnySequence());
			}
			
			String eapSubsystem = eapEpxactionPendDMO.getEapSubsystem();
			
			if (!DMO.isNull(eapSubsystem)) {
				queryArgs.andFilterBy("EapSubsystemMatch").arg(
						eapSubsystem + dao.wildcardForAnySequence());
			}
			
			String eapRelation = eapEpxactionPendDMO.getEapRelation();
			
			if (!DMO.isNull(eapRelation)) {
				queryArgs.andFilterBy("EapRelationMatch").arg(
						eapRelation + dao.wildcardForAnySequence());
			}
			
			String eapTrigger = eapEpxactionPendDMO.getEapTrigger();
			
			if (!DMO.isNull(eapTrigger)) {
				queryArgs.andFilterBy("EapTriggerMatch").arg(
						eapTrigger + dao.wildcardForAnySequence());
			}
			
			String eapActionType = eapEpxactionPendDMO.getEapActionType();
			
			if (!DMO.isNull(eapActionType)) {
				queryArgs.andFilterBy("EapActionTypeMatch").arg(
						eapActionType + dao.wildcardForAnySequence());
			}
			
			Integer eapActionSeq = eapEpxactionPendDMO.getEapActionSeq();
			
			if (!DMO.isNull(eapActionSeq)) {
				queryArgs.andFilterBy("EapActionSeqMatch").arg(
						eapActionSeq);
			}
			
			String eapDocType = eapEpxactionPendDMO.getEapDocType();
			
			if (!DMO.isNull(eapDocType)) {
				queryArgs.andFilterBy("EapDocTypeMatch").arg(
						eapDocType + dao.wildcardForAnySequence());
			}
			
			String eapServiceCode = eapEpxactionPendDMO.getEapServiceCode();
			
			if (!DMO.isNull(eapServiceCode)) {
				queryArgs.andFilterBy("EapServiceCodeMatch").arg(
						eapServiceCode + dao.wildcardForAnySequence());
			}
			
			String eapReasonCode = eapEpxactionPendDMO.getEapReasonCode();
			
			if (!DMO.isNull(eapReasonCode)) {
				queryArgs.andFilterBy("EapReasonCodeMatch").arg(
						eapReasonCode + dao.wildcardForAnySequence());
			}
			
			String eapTableName = eapEpxactionPendDMO.getEapTableName();
			
			if (!DMO.isNull(eapTableName)) {
				queryArgs.andFilterBy("EapTableNameMatch").arg(
						eapTableName + dao.wildcardForAnySequence());
			}
			
			String eapColumnName = eapEpxactionPendDMO.getEapColumnName();
			
			if (!DMO.isNull(eapColumnName)) {
				queryArgs.andFilterBy("EapColumnNameMatch").arg(
						eapColumnName + dao.wildcardForAnySequence());
			}
			
			String eapNewValue = eapEpxactionPendDMO.getEapNewValue();
			
			if (!DMO.isNull(eapNewValue)) {
				queryArgs.andFilterBy("EapNewValueMatch").arg(
						eapNewValue + dao.wildcardForAnySequence());
			}
			
			String eapWhereColumn = eapEpxactionPendDMO.getEapWhereColumn();
			
			if (!DMO.isNull(eapWhereColumn)) {
				queryArgs.andFilterBy("EapWhereColumnMatch").arg(
						eapWhereColumn + dao.wildcardForAnySequence());
			}
			
			String eapWhereType = eapEpxactionPendDMO.getEapWhereType();
			
			if (!DMO.isNull(eapWhereType)) {
				queryArgs.andFilterBy("eapWhereTypeMatch").arg(
						eapWhereType + dao.wildcardForAnySequence());
			}
			
			String eapChargeCode = eapEpxactionPendDMO.getEapChargeCode();
			
			if (!DMO.isNull(eapChargeCode)) {
				queryArgs.andFilterBy("EapChargeCodeMatch").arg(
						eapChargeCode + dao.wildcardForAnySequence());
			}
			
			String eapVoiceMess = eapEpxactionPendDMO.getEapVoiceMess();
			
			if (!DMO.isNull(eapVoiceMess)) {
				queryArgs.andFilterBy("EapVoiceMessMatch").arg(
						eapVoiceMess + dao.wildcardForAnySequence());
			}
			
			Integer eapAmnActionId = eapEpxactionPendDMO.getEapAmnActionId();
			
			if (!DMO.isNull(eapAmnActionId)) {
				queryArgs.andFilterBy("EapAmnActionIdMatch").arg(
						eapAmnActionId);
			}
			
			String eapAmnTargType = eapEpxactionPendDMO.getEapAmnTargType();
			
			if (!DMO.isNull(eapAmnTargType)) {
				queryArgs.andFilterBy("EapAmnTargTypeMatch").arg(
						eapAmnTargType + dao.wildcardForAnySequence());
			}
			
			Integer eapAmnTargGrp = eapEpxactionPendDMO.getEapAmnTargGrp();
			
			if (!DMO.isNull(eapAmnTargGrp)) {
				queryArgs.andFilterBy("EapAmnTargGrpMatch").arg(
						eapAmnTargGrp);
			}
			
			String eapAmnTargUser = eapEpxactionPendDMO.getEapAmnTargUser();
			
			if (!DMO.isNull(eapAmnTargUser)) {
				queryArgs.andFilterBy("EapAmnTargUserMatch").arg(
						eapAmnTargUser + dao.wildcardForAnySequence());
			}
			
			DateTime eapAmnDeadline = eapEpxactionPendDMO.getEapAmnDeadline();
			
			if (!DMO.isNull(eapAmnDeadline)) {
				queryArgs.andFilterBy("EapAmnDeadlineMatch").arg(
						eapAmnDeadline);
			}
			
			String eapAmnStatus = eapEpxactionPendDMO.getEapAmnStatus();
			
			if (!DMO.isNull(eapAmnStatus)) {
				queryArgs.andFilterBy("EapAmnStatusMatch").arg(
						eapAmnStatus + dao.wildcardForAnySequence());
			}
			
			String eapAmnSource = eapEpxactionPendDMO.getEapAmnSource();
			
			if (!DMO.isNull(eapAmnSource)) {
				queryArgs.andFilterBy("EapAmnSourceMatch").arg(
						eapAmnSource + dao.wildcardForAnySequence());
			}
			
			String eapAmnOpenedBy = eapEpxactionPendDMO.getEapAmnOpenedBy();
			
			if (!DMO.isNull(eapAmnOpenedBy)) {
				queryArgs.andFilterBy("EapAmnOpenedByMatch").arg(
						eapAmnOpenedBy + dao.wildcardForAnySequence());
			}
			
			Integer eapUdaActionId = eapEpxactionPendDMO.getEapUdaActionId();
			
			if (!DMO.isNull(eapUdaActionId)) {
				queryArgs.andFilterBy("EapUdaActionIdMatch").arg(
						eapUdaActionId);
			}
			
			String eapStatus = eapEpxactionPendDMO.getEapStatus();
			
			if (!DMO.isNull(eapStatus)) {
				queryArgs.andFilterBy("EapStatusMatch").arg(
						eapStatus + dao.wildcardForAnySequence());
			}
			
			Integer eapRetryRemain = eapEpxactionPendDMO.getEapRetryRemain();
			
			if (!DMO.isNull(eapRetryRemain)) {
				queryArgs.andFilterBy("EapRetryRemainMatch").arg(
						eapRetryRemain);
			}
			
			DateTime eapLastRetry = eapEpxactionPendDMO.getEapLastRetry();
			
			if (!DMO.isNull(eapLastRetry)) {
				queryArgs.andFilterBy("EapLastRetryMatch").arg(
						eapLastRetry);
			}
			
			String eapErrorText = eapEpxactionPendDMO.getEapErrorText();
			
			if (!DMO.isNull(eapErrorText)) {
				queryArgs.andFilterBy("EapErrorTextMatch").arg(
						eapErrorText + dao.wildcardForAnySequence());
			}
			
			DateTime eapSubmitted = eapEpxactionPendDMO.getEapSubmitted();
			
			if (!DMO.isNull(eapSubmitted)) {
				queryArgs.andFilterBy("EapSubmittedMatch").arg(
						eapSubmitted);
			}
			
			DateTime eapActioned = eapEpxactionPendDMO.getEapActioned();		
			
			if (!DMO.isNull(eapActioned)) {
				queryArgs.andFilterBy("EapActionedMatch").arg(
						eapActioned);
			}
		}
		
		return queryArgs;
	}	
	
}
