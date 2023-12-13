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



public class HmHandsetManuAbstractDACImpl extends DAC implements HmHandsetManuAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( HmHandsetManuAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public HmHandsetManuAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public HmHandsetManuAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public HmHandsetManuDMO get( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( HmHandsetManuDMO )" );

	    thrower.ifParameterMissing("HmHandsetManuDMO", hmHandsetManuDMO);

	    return (HmHandsetManuDMO) dao.get( hmHandsetManuDMO );
	  }


	  public void create( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( hmHandsetManuDMO )" );
	    thrower.ifParameterMissing( "HmHandsetManuDMO", hmHandsetManuDMO );

	    dao.insert( hmHandsetManuDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new HmHandsetManuDMO(  ),
	      filterQueryArgs( filter, "HmHandsetManu" ) );
	  }


	  public void delete( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( HmHandsetManuDMO )" );

	    thrower.ifParameterMissing( "HmHandsetManuDMO", hmHandsetManuDMO );

	    thrower.ifParameterMissing( "HmHandsetManuDMO.hmManuId",
	      hmHandsetManuDMO.getHmManuId());

	    thrower.ifParameterMissing( "HmHandsetManuDMO.hmDescription",
	  	      hmHandsetManuDMO.getHmDescription());
	    
//	    
//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmManuIdFilter, hmHandsetManuDMO.getHmManuId());

//	    this.delete( filter );
	    dao.delete(hmHandsetManuDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "HmHandsetManu" );

	    dao.delete( "HmHandsetManu", args.getFilterBy(  ), args );
	  }


	  public boolean exists( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( HmHandsetManuDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmManuIdFilter, hmHandsetManuDMO.getHmManuId());
//	    
//	    return this.exists(filter); 
	    return dao.exists(hmHandsetManuDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, hmHandsetManuDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( hmHandsetManuDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    HmHandsetManuDMO hmHandsetManuDMO ) {
	    logger.debug( "paramQueryArgs( hmHandsetManuDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "HmHandsetManu",
	        2 * 2 );

	    if ( hmHandsetManuDMO != null ) {

	      String manuId = hmHandsetManuDMO.getHmManuId();

	      if ( !DMO.isNull( manuId ) ) {
	        queryArgs.andFilterBy( "hmManuIdMatch" )
	                 .arg( manuId );
	      }

	      // define more filters...
	      String description = hmHandsetManuDMO.getHmDescription();

	      if ( !DMO.isNull( description ) ) {
	        queryArgs.andFilterBy( "hmDescriptionMatch" )
	                 .arg( description + dao.wildcardForAnySequence(  ) );
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
	        ? "HmHandsetManu" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case HmHandsetManuDMO.hmManuIdFilter:
	          part.andFilterBy( queryArgs, "hmManuId", dao.wildcardForAnySequence(  ) );
	          break;

	        case HmHandsetManuDMO.hmDescriptionFilter:
		          part.andFilterBy( queryArgs, "hmDescription", dao.wildcardForAnySequence(  ) );
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


	  public HmHandsetManuDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "HmHandsetManu");

	    return (HmHandsetManuDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "HmHandsetManu" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "HmHandsetManu" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "HmHandsetManu" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }



}