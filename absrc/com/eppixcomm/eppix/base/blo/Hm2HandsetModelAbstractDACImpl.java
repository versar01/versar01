package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class Hm2HandsetModelAbstractDACImpl extends DAC implements Hm2HandsetModelAbstractDAC{

	  static DAOThrower thrower = DAOThrower.getDAOThrower( EqEventQueueAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	  public Hm2HandsetModelAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
	  }
	  
	  public Hm2HandsetModelDMO get( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( Hm2HandsetModelDMO )" );

	    thrower.ifParameterMissing("Hm2HandsetModelDMO", hm2HandsetModelDMO);
	    
//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, Hm2HandsetModelDMO.hm2ModelIdFilter, hm2HandsetModelDMO.getHm2ModelId());
//
//	    return this.get(filter);
	    
	    return (Hm2HandsetModelDMO) dao.get(hm2HandsetModelDMO);
	  }
	  
	  


	  public void create( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( hm2HandsetModelDMO )" );
	    thrower.ifParameterMissing( "Hm2HandsetModelDMO", hm2HandsetModelDMO );

	    dao.insert( hm2HandsetModelDMO );

	  }


	  public void modify( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( aHm2HandsetModelDMO )" );

	    thrower.ifParameterMissing( "aHm2HandsetModelDMO", hm2HandsetModelDMO );

	    thrower.ifParameterMissing( "Hm2HandsetModelDMO.hm2ModelId",
	      hm2HandsetModelDMO.getHm2ModelId());
	    
//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, Hm2HandsetModelDMO.hm2ModelIdFilter, hm2HandsetModelDMO.getHm2ModelId());
//
//	    this.modify(filter);
	    
	   dao.update(hm2HandsetModelDMO);
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new Hm2HandsetModelDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( Hm2HandsetModelDMO )" );

	    thrower.ifParameterMissing( "Hm2HandsetModelDMO", hm2HandsetModelDMO );

	    thrower.ifParameterMissing( "Hm2HandsetModelDMO.hm2ModelId",
	      hm2HandsetModelDMO.getHm2ModelId());

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, Hm2HandsetModelDMO.hm2ModelIdFilter, hm2HandsetModelDMO.getHm2ModelId());

	    dao.delete(hm2HandsetModelDMO);
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "Hm2HandsetModel", args.getFilterBy(  ), args );
	  }


	  public boolean exists( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( Hm2HandsetModelDMO)" );

	    // We change this to a filter
	    QueryFilter filter = new QueryFilter();
	    filter.add(FilterOp.EQUAL, Hm2HandsetModelDMO.hm2ModelIdFilter, hm2HandsetModelDMO.getHm2ModelId());
	    
	    return this.exists(filter);
	    
	  }

	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }

	  public DTOList getList(
	    DTOListState       state,
	    Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, hm2HandsetModelDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( hm2HandsetModelDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    Hm2HandsetModelDMO hm2HandsetModelDMO ) {
	    logger.debug( "paramQueryArgs( hm2HandsetModelDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Hm2HandsetModel",
	        6 * 2 );

	    if ( hm2HandsetModelDMO != null ) {
	      // primary key filters...
	      Integer hm2ModelId = hm2HandsetModelDMO.getHm2ModelId();

	      if ( !DMO.isNull( hm2ModelId ) ) {
	        queryArgs.andFilterBy( "Hm2ModelId" )
	                 .arg( hm2ModelId );
	      }

	      // define more filters...
	      String hm2ManuId = hm2HandsetModelDMO.getHm2ManuId();

	      if ( !DMO.isNull( hm2ManuId ) ) {
	        queryArgs.andFilterBy( "Hm2ManuIdMatch" )
	                 .arg( hm2ManuId + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String hm2Model = hm2HandsetModelDMO.getHm2Model();

	      if ( !DMO.isNull( hm2Model ) ) {
	        queryArgs.andFilterBy( "Hm2ModelMatch" )
	                 .arg( hm2Model + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String hm2ActiveInd = hm2HandsetModelDMO.getHm2ActiveInd();

	      if ( !DMO.isNull( hm2ActiveInd ) ) {
	        queryArgs.andFilterBy( "Hm2ActiveIndMatch" )
	                 .arg( hm2ActiveInd + dao.wildcardForAnySequence(  ) );
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
	        ? "Hm2HandsetModel" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    	FilterPart part = (FilterPart)it.next();

		      switch ( part.getIndex()){
		      
		        case Hm2HandsetModelDMO.hm2ModelIdFilter:
		          part.andFilterBy( queryArgs, "hm2ModelId");
		          break;

		        case Hm2HandsetModelDMO.hm2ManuIdFilter:
			          part.andFilterBy( queryArgs, "hm2ManuId", dao.wildcardForAnySequence(  ) );
			          break;
			          
		        case Hm2HandsetModelDMO.hm2ModelFilter:
			          part.andFilterBy( queryArgs, "hm2Model", dao.wildcardForAnySequence(  ) );
			          break;
			          
		        case Hm2HandsetModelDMO.hm2ActiveIndFilter:
			          part.andFilterBy( queryArgs, "hm2ActiveInd", dao.wildcardForAnySequence(  ) );
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

	    return dao.iterator(filterQueryArgs( filter, null ), false );

	  }

	  public Hm2HandsetModelDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (Hm2HandsetModelDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }

	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }

	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }

	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }
}