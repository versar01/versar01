package com.eppixcomm.eppix.base.blo;

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



public class PswPrepaidSwapAbstractDACImpl extends DAC implements PswPrepaidSwapAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( PswPrepaidSwapAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public PswPrepaidSwapAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public PswPrepaidSwapAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public PswPrepaidSwapDMO get( PswPrepaidSwapDMO pswPrepaidSwapDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( PswPrepaidSwapDMO )" );

	    thrower.ifParameterMissing("PswPrepaidSwapDMO", pswPrepaidSwapDMO);

	    return (PswPrepaidSwapDMO) dao.get( pswPrepaidSwapDMO );
	  }


	  public void create( PswPrepaidSwapDMO pswPrepaidSwapDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( pswPrepaidSwapDMO )" );
	    thrower.ifParameterMissing( "PswPrepaidSwapDMO", pswPrepaidSwapDMO );

	    dao.insert( pswPrepaidSwapDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new PswPrepaidSwapDMO(  ),
	      filterQueryArgs( filter, "PswPrepaidSwap" ) );
	  }


	  public void delete( PswPrepaidSwapDMO pswPrepaidSwapDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( PswPrepaidSwapDMO )" );

	    thrower.ifParameterMissing( "PswPrepaidSwapDMO", pswPrepaidSwapDMO );


	    dao.delete(pswPrepaidSwapDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PswPrepaidSwap" );

	    dao.delete( "PswPrepaidSwap", args.getFilterBy(  ), args );
	  }


	  public boolean exists( PswPrepaidSwapDMO pswPrepaidSwapDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( PswPrepaidSwapDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, PswPrepaidSwapDMO.hmManuIdFilter, pswPrepaidSwapDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(pswPrepaidSwapDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, PswPrepaidSwapDMO pswPrepaidSwapDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, pswPrepaidSwapDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( pswPrepaidSwapDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    PswPrepaidSwapDMO pswPrepaidSwapDMO ) {
	    logger.debug( "paramQueryArgs( pswPrepaidSwapDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PswPrepaidSwap",
	        7 * 2 );

	    if ( pswPrepaidSwapDMO != null ) {

	      Integer PswSubscriberId = pswPrepaidSwapDMO.getPswSubscriberId();

	      if ( !DMO.isNull( PswSubscriberId ) ) {
	        queryArgs.andFilterBy( "PswSubscriberIdMatch" )
	                 .arg( PswSubscriberId );
	      }


	      String PswMsisdnNo = pswPrepaidSwapDMO.getPswMsisdnNo();

	      if ( !DMO.isNull( PswMsisdnNo ) ) {
	        queryArgs.andFilterBy( "PswMsisdnNoMatch" )
	                 .arg( PswMsisdnNo );
	      }


	      String PswOldSimNo = pswPrepaidSwapDMO.getPswOldSimNo();

	      if ( !DMO.isNull( PswOldSimNo ) ) {
	        queryArgs.andFilterBy( "PswOldSimNoMatch" )
	                 .arg( PswOldSimNo );
	      }


	      String PswNewSimNo = pswPrepaidSwapDMO.getPswNewSimNo();

	      if ( !DMO.isNull( PswNewSimNo ) ) {
	        queryArgs.andFilterBy( "PswNewSimNoMatch" )
	                 .arg( PswNewSimNo );
	      }


	      String PwsSimStatus = pswPrepaidSwapDMO.getPswSimStatus();

	      if ( !DMO.isNull( PwsSimStatus ) ) {
	        queryArgs.andFilterBy( "PwsSimStatusMatch" )
	                 .arg( PwsSimStatus );
	      }


	      DateTime PswStatusDate = pswPrepaidSwapDMO.getPswStatusDate();

	      if ( !DMO.isNull( PswStatusDate ) ) {
	        queryArgs.andFilterBy( "PswStatusDateMatch" )
	                 .arg( PswStatusDate );
	      }


	      DateTime PswReceiptDate = pswPrepaidSwapDMO.getPswReceiptDate();

	      if ( !DMO.isNull( PswReceiptDate ) ) {
	        queryArgs.andFilterBy( "PswReceiptDateMatch" )
	                 .arg( PswReceiptDate );
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
	        ? "PswPrepaidSwap" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case PswPrepaidSwapDMO.pswSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "pswSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "pswMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswOldSimNoFilter:
	          part.andFilterBy( queryArgs, "pswOldSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswNewSimNoFilter:
	          part.andFilterBy( queryArgs, "pswNewSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswSimStatusFilter:
	          part.andFilterBy( queryArgs, "pwsSimStatus", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswStatusDateFilter:
	          part.andFilterBy( queryArgs, "pswStatusDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case PswPrepaidSwapDMO.pswReceiptDateFilter:
	          part.andFilterBy( queryArgs, "pswReceiptDate", dao.wildcardForAnySequence(  ) );
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


	  public PswPrepaidSwapDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PswPrepaidSwap");

	    return (PswPrepaidSwapDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PswPrepaidSwap" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PswPrepaidSwap" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "PswPrepaidSwap" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }
}