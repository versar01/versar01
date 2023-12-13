package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class EdEventDependsAbstractDACImpl extends DAC implements EdEventDependsAbstractDAC{

	 static DAOThrower thrower = DAOThrower.getDAOThrower( EqEventQueueAbstractDACImpl.class );
	 Logger logger = thrower.getLogger();

	protected EdEventDependsAbstractDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
		super(thrower, dao, defaultLanguageCode);
	}

	public EdEventDependsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	/// Methods implemented

	  protected DAOParamQueryArgs filterQueryArgs(
			    QueryFilter filter,
			    String      dmlName ) {
		  logger.debug( "filterQueryArgs(QueryFilter filter,String dmlName )");

			    List parts = filter.getParts(  );
			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs((dmlName == null )
			        ? "EdEventDepends" : dmlName, parts.size());

			    Iterator it = parts.iterator();
			    while(it.hasNext()){
			    	FilterPart part = (FilterPart)it.next();
			      switch ( part.getIndex(  ) ) {
			        case EdEventDependsDMO.edParentFilter:
			          part.andFilterBy( queryArgs, "EdParent",
			            dao.wildcardForAnySequence(  ) );

			          break;

			        case EdEventDependsDMO.edChildFilter:
			          part.andFilterBy( queryArgs, "EdChild",
			            dao.wildcardForAnySequence(  ) );

			          break;
			      
		        case EdEventDependsDMO.edBondFilter:
			          part.andFilterBy( queryArgs, "EdBond",
			            dao.wildcardForAnySequence(  ) );

			          break;
			    }
			  }
			    
			    return queryArgs;
			  }

	  protected DAOParamQueryArgs paramQueryArgs(EdEventDependsDMO edEventDependsDMO) {
			    logger.debug( "paramQueryArgs(EdEventDependsDMO edEventDependsDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EdEventDepends", 4);

			    if ( edEventDependsDMO != null ) {
			      // primary key filters...
			      // define more filters...
			      String edParent = edEventDependsDMO.getEdParent();

			      if ( !DMO.isNull( edParent ) ) {
			        queryArgs.andFilterBy( "EdParentMatch" )
			                 .arg( edParent + dao.wildcardForAnySequence(  ) );
			      }

			      String edChild = edEventDependsDMO.getEdChild();

			      if ( !DMO.isNull(edChild)) {
			        queryArgs.andFilterBy( "EdChildMatch" )
			                 .arg( edChild + dao.wildcardForAnySequence(  ) );
			      }

			    } else {
			      // include all default languageCode filters where appropriate...
			    }

			    return queryArgs;
			  }

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "count(QueryFilter filter)");
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	}

	public void create(EdEventDependsDMO edEventDependsDMO) throws EPPIXSeriousException {
	    logger.debug( "create(EdEventDependsDMO edEventDependsDMO)" );
	    thrower.ifParameterMissing( "EdEventDependsDMO", edEventDependsDMO );
	    dao.insert( edEventDependsDMO );
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug( "delete(QueryFilter filter)");

	    thrower.ifParameterMissing( "filter", filter );
	    DAOParamQueryArgs args = filterQueryArgs( filter, "EdEventDepends");
	    dao.delete( "EdEventDepends", args.getFilterBy(), args );
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "exists(QueryFilter filter)");
	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public EdEventDependsDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "get(QueryFilter filter)");
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (EdEventDependsDMO) dao.get( args.getDMLName(),
	      args.getFilterBy(  ), args );
	}

	public DTOList getList(DTOListState state, EdEventDependsDMO edEventDependsDMO) throws EPPIXSeriousException {
		logger.debug( "getList(DTOListState state, EdEventDependsDMO edEventDependsDMO)");
        return new DTOList(dao.getList( paramQueryArgs( edEventDependsDMO )));
	}

	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "getList(DTOListState state, QueryFilter filter)");
		return new DTOList(dao.getList(filterQueryArgs( filter, null )));
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "iterate(QueryFilter filter)");
	    return dao.iterator(filterQueryArgs( filter, null ),false);
	}

	public DAOIterator iterateWithLock(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "iterateWithLock(QueryFilter filter)");
	    return dao.iterator(filterQueryArgs( filter, null ), false);
	}

	public EdEventDependsDMO lock(EdEventDependsDMO edEventDependsDMO) throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug( "lock(EdEventDependsDMO edEventDependsDMO)");
		return edEventDependsDMO;
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "max(QueryFilter filter)");
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug( "min(QueryFilter filter)");
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify(QueryFilter filter)");
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new EdEventDependsDMO(  ), filterQueryArgs( filter, null ) );
	}

}
