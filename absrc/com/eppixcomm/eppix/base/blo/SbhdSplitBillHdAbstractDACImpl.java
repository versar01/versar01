package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

//import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
//import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.Date;
//import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class SbhdSplitBillHdAbstractDACImpl extends DAC implements SbhdSplitBillHdAbstractDAC{
	
	  static DAOThrower thrower = DAOThrower.getDAOThrower( SbhdSplitBillHdAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public SbhdSplitBillHdAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SbhdSplitBillHdAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public SbhdSplitBillHdDMO get( SbhdSplitBillHdDMO sbhdSplitBillHdDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( SbhdSplitBillHdDMO )" );

	    thrower.ifParameterMissing("SbhdSplitBillHdDMO", sbhdSplitBillHdDMO);

	    return (SbhdSplitBillHdDMO) dao.get( sbhdSplitBillHdDMO );
	  }


	  public void create( SbhdSplitBillHdDMO sbhdSplitBillHdDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( sbhdSplitBillHdDMO )" );
	    thrower.ifParameterMissing( "SbhdSplitBillHdDMO", sbhdSplitBillHdDMO );

	    dao.insert( sbhdSplitBillHdDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SbhdSplitBillHdDMO(  ),
	      filterQueryArgs( filter, "SbhdSplitBillHd" ) );
	  }


	  public void delete( SbhdSplitBillHdDMO sbhdSplitBillHdDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SbhdSplitBillHdDMO )" );

	    thrower.ifParameterMissing( "SbhdSplitBillHdDMO", sbhdSplitBillHdDMO );


	    dao.delete(sbhdSplitBillHdDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SbhdSplitBillHd" );

	    dao.delete( "SbhdSplitBillHd", args.getFilterBy(  ), args );
	  }


	  public boolean exists( SbhdSplitBillHdDMO sbhdSplitBillHdDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SbhdSplitBillHdDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.hmManuIdFilter, sbhdSplitBillHdDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(sbhdSplitBillHdDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, SbhdSplitBillHdDMO sbhdSplitBillHdDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, sbhdSplitBillHdDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( sbhdSplitBillHdDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    SbhdSplitBillHdDMO sbhdSplitBillHdDMO ) {
	    logger.debug( "paramQueryArgs( sbhdSplitBillHdDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SbhdSplitBillHd",
	        2 * 2 );

	    if ( sbhdSplitBillHdDMO != null ) {

	      Integer SbhdSbId = sbhdSplitBillHdDMO.getSbhdSbId();

	      if ( !DMO.isNull( SbhdSbId ) ) {
	        queryArgs.andFilterBy( "SbhdSbIdMatch" )
	                 .arg( SbhdSbId );
	      }


	      Integer SbhdSubscriberId = sbhdSplitBillHdDMO.getSbhdSubscriberId();

	      if ( !DMO.isNull( SbhdSubscriberId ) ) {
	        queryArgs.andFilterBy( "SbhdSubscriberIdMatch" )
	                 .arg( SbhdSubscriberId );
	      }


	      String SbhdChildAcNo = sbhdSplitBillHdDMO.getSbhdChildAcNo();

	      if ( !DMO.isNull( SbhdChildAcNo ) ) {
	        queryArgs.andFilterBy( "SbhdChildAcNoMatch" )
	                 .arg( SbhdChildAcNo );
	      }


	      String SbhdChildMsisdn = sbhdSplitBillHdDMO.getSbhdChildMsisdn();

	      if ( !DMO.isNull( SbhdChildMsisdn ) ) {
	        queryArgs.andFilterBy( "SbhdChildMsisdnMatch" )
	                 .arg( SbhdChildMsisdn );
	      }


	      String SbhdParentAcNo = sbhdSplitBillHdDMO.getSbhdParentAcNo();

	      if ( !DMO.isNull( SbhdParentAcNo ) ) {
	        queryArgs.andFilterBy( "SbhdParentAcNoMatch" )
	                 .arg( SbhdParentAcNo );
	      }


	      String SbhdParentMsisdn = sbhdSplitBillHdDMO.getSbhdParentMsisdn();

	      if ( !DMO.isNull( SbhdParentMsisdn ) ) {
	        queryArgs.andFilterBy( "SbhdParentMsisdnMatch" )
	                 .arg( SbhdParentMsisdn );
	      }


	      String SbhdCreditAccum = sbhdSplitBillHdDMO.getSbhdCreditAccum();

	      if ( !DMO.isNull( SbhdCreditAccum ) ) {
	        queryArgs.andFilterBy( "SbhdCreditAccumMatch" )
	                 .arg( SbhdCreditAccum );
	      }


	      String SbhdMigrated = sbhdSplitBillHdDMO.getSbhdMigrated();

	      if ( !DMO.isNull( SbhdMigrated ) ) {
	        queryArgs.andFilterBy( "SbhdMigratedMatch" )
	                 .arg( SbhdMigrated );
	      }


	      Float SbhdTotBillAmt = sbhdSplitBillHdDMO.getSbhdTotBillAmt();

	      if ( !DMO.isNull( SbhdTotBillAmt ) ) {
	        queryArgs.andFilterBy( "SbhdTotBillAmtMatch" )
	                 .arg( SbhdTotBillAmt );
	      }


	      Integer SbhdDdRd = sbhdSplitBillHdDMO.getSbhdDdRd();

	      if ( !DMO.isNull( SbhdDdRd ) ) {
	        queryArgs.andFilterBy( "SbhdDdRdMatch" )
	                 .arg( SbhdDdRd );
	      }


	      Date SbhdActDate = sbhdSplitBillHdDMO.getSbhdActDate();

	      if ( !DMO.isNull( SbhdActDate ) ) {
	        queryArgs.andFilterBy( "SbhdActDateMatch" )
	                 .arg( SbhdActDate );
	      }


	      Date SbhdDeactDate = sbhdSplitBillHdDMO.getSbhdDeactDate();

	      if ( !DMO.isNull( SbhdDeactDate ) ) {
	        queryArgs.andFilterBy( "SbhdDeactDateMatch" )
	                 .arg( SbhdDeactDate );
	      }


	      Date SbhdBilledUpto = sbhdSplitBillHdDMO.getSbhdBilledUpto();

	      if ( !DMO.isNull( SbhdBilledUpto ) ) {
	        queryArgs.andFilterBy( "SbhdBilledUptoMatch" )
	                 .arg( SbhdBilledUpto );
	      }


	      String SbhdStatus = sbhdSplitBillHdDMO.getSbhdStatus();

	      if ( !DMO.isNull( SbhdStatus ) ) {
	        queryArgs.andFilterBy( "SbhdStatusMatch" )
	                 .arg( SbhdStatus );
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
	        ? "SbhdSplitBillHd" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case SbhdSplitBillHdDMO.SbhdSbIdFilter:
	          part.andFilterBy( queryArgs, "SbhdSbId", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "SbhdSubscriberId");
	          break;

	        case SbhdSplitBillHdDMO.SbhdChildAcNoFilter:
	          part.andFilterBy( queryArgs, "SbhdChildAcNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdChildMsisdnFilter:
	          part.andFilterBy( queryArgs, "SbhdChildMsisdn", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdParentAcNoFilter:
	          part.andFilterBy( queryArgs, "SbhdParentAcNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdParentMsisdnFilter:
	          part.andFilterBy( queryArgs, "SbhdParentMsisdn", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdCreditAccumFilter:
	          part.andFilterBy( queryArgs, "SbhdCreditAccum", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdMigratedFilter:
	          part.andFilterBy( queryArgs, "SbhdMigrated", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdTotBillAmtFilter:
	          part.andFilterBy( queryArgs, "SbhdTotBillAmt", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdDdRdFilter:
	          part.andFilterBy( queryArgs, "SbhdDdRd", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdActDateFilter:
	          part.andFilterBy( queryArgs, "SbhdActDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdDeactDateFilter:
	          part.andFilterBy( queryArgs, "SbhdDeactDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdBilledUptoFilter:
	          part.andFilterBy( queryArgs, "SbhdBilledUpto", dao.wildcardForAnySequence(  ) );
	          break;

	        case SbhdSplitBillHdDMO.SbhdStatusFilter:
	          part.andFilterBy( queryArgs, "SbhdStatus", dao.wildcardForAnySequence(  ) );
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


	  public SbhdSplitBillHdDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SbhdSplitBillHd");

	    return (SbhdSplitBillHdDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SbhdSplitBillHd" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SbhdSplitBillHd" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SbhdSplitBillHd" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}