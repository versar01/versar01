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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class RcReasonCodeAbstractDACImpl extends DAC implements RcReasonCodeAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( RcReasonCodeAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public RcReasonCodeAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public RcReasonCodeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public RcReasonCodeDMO get( RcReasonCodeDMO rcReasonCodeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( RcReasonCodeDMO )" );

	    thrower.ifParameterMissing("RcReasonCodeDMO", rcReasonCodeDMO);

	    return (RcReasonCodeDMO) dao.get( rcReasonCodeDMO );
	  }


	  public void create( RcReasonCodeDMO rcReasonCodeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( rcReasonCodeDMO )" );
	    thrower.ifParameterMissing( "RcReasonCodeDMO", rcReasonCodeDMO );

	    dao.insert( rcReasonCodeDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new RcReasonCodeDMO(  ),
	      filterQueryArgs( filter, "RcReasonCode" ) );
	  }


	  public void delete( RcReasonCodeDMO rcReasonCodeDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( RcReasonCodeDMO )" );

	    thrower.ifParameterMissing( "RcReasonCodeDMO", rcReasonCodeDMO );


	    dao.delete(rcReasonCodeDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "RcReasonCode" );

	    dao.delete( "RcReasonCode", args.getFilterBy(  ), args );
	  }


	  public boolean exists( RcReasonCodeDMO rcReasonCodeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( RcReasonCodeDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, RcReasonCodeDMO.hmManuIdFilter, rcReasonCodeDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(rcReasonCodeDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, RcReasonCodeDMO rcReasonCodeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, rcReasonCodeDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( rcReasonCodeDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    RcReasonCodeDMO rcReasonCodeDMO ) {
	    logger.debug( "paramQueryArgs( rcReasonCodeDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "RcReasonCode",
	        2 * 2 );

	    if ( rcReasonCodeDMO != null ) {

	      String RcCode = rcReasonCodeDMO.getRcCode();

	      if ( !DMO.isNull( RcCode ) ) {
	        queryArgs.andFilterBy( "RcCodeMatch" )
	                 .arg( RcCode );
	      }


	      String RcType = rcReasonCodeDMO.getRcType();

	      if ( !DMO.isNull( RcType ) ) {
	        queryArgs.andFilterBy( "RcTypeMatch" )
	                 .arg( RcType );
	      }


	      String RcDesc = rcReasonCodeDMO.getRcDesc();

	      if ( !DMO.isNull( RcDesc ) ) {
	        queryArgs.andFilterBy( "RcDescMatch" )
	                 .arg( RcDesc );
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
	        ? "RcReasonCode" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case RcReasonCodeDMO.RcCodeFilter:
	          part.andFilterBy( queryArgs, "RcCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case RcReasonCodeDMO.RcTypeFilter:
	          part.andFilterBy( queryArgs, "RcType", dao.wildcardForAnySequence(  ) );
	          break;

	        case RcReasonCodeDMO.RcDescFilter:
	          part.andFilterBy( queryArgs, "RcDesc", dao.wildcardForAnySequence(  ) );
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


	  public RcReasonCodeDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "RcReasonCode");

	    return (RcReasonCodeDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "RcReasonCode" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "RcReasonCode" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "RcReasonCode" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }




}