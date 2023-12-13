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



public class PppPrepaidPairsAbstractDACImpl extends DAC implements PppPrepaidPairsAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( PppPrepaidPairsAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public PppPrepaidPairsAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public PppPrepaidPairsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public PppPrepaidPairsDMO get( PppPrepaidPairsDMO pppPrepaidPairsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( PppPrepaidPairsDMO )" );

	    thrower.ifParameterMissing("PppPrepaidPairsDMO", pppPrepaidPairsDMO);

	    return (PppPrepaidPairsDMO) dao.get( pppPrepaidPairsDMO );
	  }


	  public void create( PppPrepaidPairsDMO pppPrepaidPairsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( pppPrepaidPairsDMO )" );
	    thrower.ifParameterMissing( "PppPrepaidPairsDMO", pppPrepaidPairsDMO );

	    dao.insert( pppPrepaidPairsDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new PppPrepaidPairsDMO(  ),
	      filterQueryArgs( filter, "PppPrepaidPairs" ) );
	  }


	  public void delete( PppPrepaidPairsDMO pppPrepaidPairsDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( PppPrepaidPairsDMO )" );

	    thrower.ifParameterMissing( "PppPrepaidPairsDMO", pppPrepaidPairsDMO );


	    dao.delete(pppPrepaidPairsDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PppPrepaidPairs" );

	    dao.delete( "PppPrepaidPairs", args.getFilterBy(  ), args );
	  }


	  public boolean exists( PppPrepaidPairsDMO pppPrepaidPairsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( PppPrepaidPairsDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.hmManuIdFilter, pppPrepaidPairsDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(pppPrepaidPairsDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, PppPrepaidPairsDMO pppPrepaidPairsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, pppPrepaidPairsDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( pppPrepaidPairsDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    PppPrepaidPairsDMO pppPrepaidPairsDMO ) {
	    logger.debug( "paramQueryArgs( pppPrepaidPairsDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PppPrepaidPairs",
	        2 * 2 );

	    if ( pppPrepaidPairsDMO != null ) {

	      String PppBillAcNo = pppPrepaidPairsDMO.getPppBillAcNo();

	      if ( !DMO.isNull( PppBillAcNo ) ) {
	        queryArgs.andFilterBy( "PppBillAcNoMatch" )
	                 .arg( PppBillAcNo );
	      }


	      Integer PppSubscriberId = pppPrepaidPairsDMO.getPppSubscriberId();

	      if ( !DMO.isNull( PppSubscriberId ) ) {
	        queryArgs.andFilterBy( "PppSubscriberIdMatch" )
	                 .arg( PppSubscriberId );
	      }


	      String PppSimNo = pppPrepaidPairsDMO.getPppSimNo();

	      if ( !DMO.isNull( PppSimNo ) ) {
	        queryArgs.andFilterBy( "PppSimNoMatch" )
	                 .arg( PppSimNo );
	      }


	      String PppImsiNo = pppPrepaidPairsDMO.getPppImsiNo();

	      if ( !DMO.isNull( PppImsiNo ) ) {
	        queryArgs.andFilterBy( "PppImsiNoMatch" )
	                 .arg( PppImsiNo );
	      }


	      String PppMsisdnNo = pppPrepaidPairsDMO.getPppMsisdnNo();

	      if ( !DMO.isNull( PppMsisdnNo ) ) {
	        queryArgs.andFilterBy( "PppMsisdnNoMatch" )
	                 .arg( PppMsisdnNo );
	      }


	      String PppType = pppPrepaidPairsDMO.getPppType();

	      if ( !DMO.isNull( PppType ) ) {
	        queryArgs.andFilterBy( "PppTypeMatch" )
	                 .arg( PppType );
	      }


	      Integer PppStatus = pppPrepaidPairsDMO.getPppStatus();

	      if ( !DMO.isNull( PppStatus ) ) {
	        queryArgs.andFilterBy( "PppStatusMatch" )
	                 .arg( PppStatus );
	      }


	      Date PppStatusDate = pppPrepaidPairsDMO.getPppStatusDate();

	      if ( !DMO.isNull( PppStatusDate ) ) {
	        queryArgs.andFilterBy( "PppStatusDateMatch" )
	                 .arg( PppStatusDate );
	      }


	      Date PppValidateDate = pppPrepaidPairsDMO.getPppValidateDate();

	      if ( !DMO.isNull( PppValidateDate ) ) {
	        queryArgs.andFilterBy( "PppValidateDateMatch" )
	                 .arg( PppValidateDate );
	      }


	      Date PppActivateDate = pppPrepaidPairsDMO.getPppActivateDate();

	      if ( !DMO.isNull( PppActivateDate ) ) {
	        queryArgs.andFilterBy( "PppActivateDateMatch" )
	                 .arg( PppActivateDate );
	      }


	      Date PppRechargeDate = pppPrepaidPairsDMO.getPppRechargeDate();

	      if ( !DMO.isNull( PppRechargeDate ) ) {
	        queryArgs.andFilterBy( "PppRechargeDateMatch" )
	                 .arg( PppRechargeDate );
	      }


	      Float PppCreditRemain = pppPrepaidPairsDMO.getPppCreditRemain();

	      if ( !DMO.isNull( PppCreditRemain ) ) {
	        queryArgs.andFilterBy( "PppCreditRemainMatch" )
	                 .arg( PppCreditRemain );
	      }


	      Date PppValidityEnd = pppPrepaidPairsDMO.getPppValidityEnd();

	      if ( !DMO.isNull( PppValidityEnd ) ) {
	        queryArgs.andFilterBy( "PppValidityEndMatch" )
	                 .arg( PppValidityEnd );
	      }


	      Date PppActivityEnd = pppPrepaidPairsDMO.getPppActivityEnd();

	      if ( !DMO.isNull( PppActivityEnd ) ) {
	        queryArgs.andFilterBy( "PppActivityEndMatch" )
	                 .arg( PppActivityEnd );
	      }


	      Date PppRechargeEnd = pppPrepaidPairsDMO.getPppRechargeEnd();

	      if ( !DMO.isNull( PppRechargeEnd ) ) {
	        queryArgs.andFilterBy( "PppRechargeEndMatch" )
	                 .arg( PppRechargeEnd );
	      }


	      String PppPackageCode = pppPrepaidPairsDMO.getPppPackageCode();

	      if ( !DMO.isNull( PppPackageCode ) ) {
	        queryArgs.andFilterBy( "PppPackageCodeMatch" )
	                 .arg( PppPackageCode );
	      }


	      String PppInternTariff = pppPrepaidPairsDMO.getPppInternTariff();

	      if ( !DMO.isNull( PppInternTariff ) ) {
	        queryArgs.andFilterBy( "PppInternTariffMatch" )
	                 .arg( PppInternTariff );
	      }


	      String PppBillCycle = pppPrepaidPairsDMO.getPppBillCycle();

	      if ( !DMO.isNull( PppBillCycle ) ) {
	        queryArgs.andFilterBy( "PppBillCycleMatch" )
	                 .arg( PppBillCycle );
	      }

	    } else {
	      // include all default languageCode filters where appropriate...
	    }

	    return queryArgs;
	  }


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );

	    return new DTOList(dao.getList( filterQueryArgs( filter, null )));
	  }


	  protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter, String dmlName ) {
	    List parts = filter.getParts(  );
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
	        ? "PppPrepaidPairs" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case PppPrepaidPairsDMO.PppBillAcNoFilter:
	          part.andFilterBy( queryArgs, "PppBillAcNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "PppSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppSimNoFilter:
	          part.andFilterBy( queryArgs, "PppSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppImsiNoFilter:
	          part.andFilterBy( queryArgs, "PppImsiNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "PppMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppTypeFilter:
	          part.andFilterBy( queryArgs, "PppType", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppStatusFilter:
	          part.andFilterBy( queryArgs, "PppStatus", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppStatusDateFilter:
	          part.andFilterBy( queryArgs, "PppStatusDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppValidateDateFilter:
	          part.andFilterBy( queryArgs, "PppValidateDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppActivateDateFilter:
	          part.andFilterBy( queryArgs, "PppActivateDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppRechargeDateFilter:
	          part.andFilterBy( queryArgs, "PppRechargeDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppCreditRemainFilter:
	          part.andFilterBy( queryArgs, "PppCreditRemain", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppValidityEndFilter:
	          part.andFilterBy( queryArgs, "PppValidityEnd", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppActivityEndFilter:
	          part.andFilterBy( queryArgs, "PppActivityEnd", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppRechargeEndFilter:
	          part.andFilterBy( queryArgs, "PppRechargeEnd", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppPackageCodeFilter:
	          part.andFilterBy( queryArgs, "PppPackageCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppInternTariffFilter:
	          part.andFilterBy( queryArgs, "PppInternTariff", dao.wildcardForAnySequence(  ) );
	          break;

	        case PppPrepaidPairsDMO.PppBillCycleFilter:
	          part.andFilterBy( queryArgs, "PppBillCycle", dao.wildcardForAnySequence(  ) );
	          break;

	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ) );

	  }

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), true );

	  }


	  public PppPrepaidPairsDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PppPrepaidPairs");

	    return (PppPrepaidPairsDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PppPrepaidPairs" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PppPrepaidPairs" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PppPrepaidPairs" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }



}