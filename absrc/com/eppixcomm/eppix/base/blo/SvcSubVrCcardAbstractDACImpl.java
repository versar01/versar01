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
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class SvcSubVrCcardAbstractDACImpl extends DAC implements SvcSubVrCcardAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( SvcSubVrCcardAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public SvcSubVrCcardAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SvcSubVrCcardAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public SvcSubVrCcardDMO get( SvcSubVrCcardDMO svcSubVrCcardDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( SvcSubVrCcardDMO )" );

	    thrower.ifParameterMissing("SvcSubVrCcardDMO", svcSubVrCcardDMO);

	    return (SvcSubVrCcardDMO) dao.get( svcSubVrCcardDMO );
	  }


	  public void create( SvcSubVrCcardDMO svcSubVrCcardDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( svcSubVrCcardDMO )" );
	    thrower.ifParameterMissing( "SvcSubVrCcardDMO", svcSubVrCcardDMO );

	    dao.insert( svcSubVrCcardDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SvcSubVrCcardDMO(  ),
	      filterQueryArgs( filter, "SvcSubVrCcard" ) );
	  }


	  public void delete( SvcSubVrCcardDMO svcSubVrCcardDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SvcSubVrCcardDMO )" );

	    thrower.ifParameterMissing( "SvcSubVrCcardDMO", svcSubVrCcardDMO );


	    dao.delete(svcSubVrCcardDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SvcSubVrCcard" );

	    dao.delete( "SvcSubVrCcard", args.getFilterBy(  ), args );
	  }


	  public boolean exists( SvcSubVrCcardDMO svcSubVrCcardDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SvcSubVrCcardDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, SvcSubVrCcardDMO.hmManuIdFilter, svcSubVrCcardDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(svcSubVrCcardDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, SvcSubVrCcardDMO svcSubVrCcardDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, svcSubVrCcardDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( svcSubVrCcardDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    SvcSubVrCcardDMO svcSubVrCcardDMO ) {
	    logger.debug( "paramQueryArgs( svcSubVrCcardDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SvcSubVrCcard",
	        2 * 2 );

	    if ( svcSubVrCcardDMO != null ) {

	      String SvcMsisdnNo = svcSubVrCcardDMO.getSvcMsisdnNo();

	      if ( !DMO.isNull( SvcMsisdnNo ) ) {
	        queryArgs.andFilterBy( "SvcMsisdnNoMatch" )
	                 .arg( SvcMsisdnNo );
	      }


	      String SvcCcardNo = svcSubVrCcardDMO.getSvcCcardNo();

	      if ( !DMO.isNull( SvcCcardNo ) ) {
	        queryArgs.andFilterBy( "SvcCcardNoMatch" )
	                 .arg( SvcCcardNo );
	      }


	      String SvcCcardType = svcSubVrCcardDMO.getSvcCcardType();

	      if ( !DMO.isNull( SvcCcardType ) ) {
	        queryArgs.andFilterBy( "SvcCcardTypeMatch" )
	                 .arg( SvcCcardType );
	      }


	      Date SvcCcardExpiry = svcSubVrCcardDMO.getSvcCcardExpiry();

	      if ( !DMO.isNull( SvcCcardExpiry ) ) {
	        queryArgs.andFilterBy( "SvcCcardExpiryMatch" )
	                 .arg( SvcCcardExpiry );
	      }


	      String SvcCvvNumber = svcSubVrCcardDMO.getSvcCvvNumber();

	      if ( !DMO.isNull( SvcCvvNumber ) ) {
	        queryArgs.andFilterBy( "SvcCvvNumberMatch" )
	                 .arg( SvcCvvNumber );
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
	        ? "SvcSubVrCcard" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case SvcSubVrCcardDMO.SvcMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "SvcMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case SvcSubVrCcardDMO.SvcCcardNoFilter:
	          part.andFilterBy( queryArgs, "SvcCcardNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case SvcSubVrCcardDMO.SvcCcardTypeFilter:
	          part.andFilterBy( queryArgs, "SvcCcardType", dao.wildcardForAnySequence(  ) );
	          break;

	        case SvcSubVrCcardDMO.SvcCcardExpiryFilter:
	          part.andFilterBy( queryArgs, "SvcCcardExpiry", dao.wildcardForAnySequence(  ) );
	          break;

	        case SvcSubVrCcardDMO.SvcCvvNumberFilter:
	          part.andFilterBy( queryArgs, "SvcCvvNumber", dao.wildcardForAnySequence(  ) );
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


	  public SvcSubVrCcardDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SvcSubVrCcard");

	    return (SvcSubVrCcardDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SvcSubVrCcard" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SvcSubVrCcard" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SvcSubVrCcard" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}