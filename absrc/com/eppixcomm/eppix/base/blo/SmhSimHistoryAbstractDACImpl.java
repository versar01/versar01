package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
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
import com.eppixcomm.eppix.base.error.Thrower;

public class SmhSimHistoryAbstractDACImpl extends DAC implements SmhSimHistoryAbstractDAC{

    static DAOThrower thrower = DAOThrower.getDAOThrower(SmhSimHistoryAbstractDACImpl.class );
    
	public SmhSimHistoryAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}
	
	public SmhSimHistoryAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {

		logger.debug( "count(QueryFilter filter)" );
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	}

	public void create(SmhSimHistoryDMO smhSimHistoryDMO)
			throws EPPIXSeriousException {

		logger.debug( "create(SmhSimHistoryDMO smhSimHistoryDMO)" );
		
	    thrower.ifParameterMissing( "SmhSimHistoryDMO", smhSimHistoryDMO );

	    dao.insert( smhSimHistoryDMO );
		
	}

	public void delete(SmhSimHistoryDMO smhSimHistoryDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		// TODO This delete must be properly defined
		logger.debug( "delete(SmhSimHistoryDMO smhSimHistoryDMO)" );
		
	    thrower.ifParameterMissing( "SmhSimHistoryDMO", smhSimHistoryDMO );
	    
	    dao.delete( smhSimHistoryDMO );		
		
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		// TODO Auto-generated method stub
		logger.debug( "delete(QueryFilter filter)" );
		
	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "SmhSimHistory", args.getFilterBy(  ), args );
		
	}

	/**
	 * No Primary key
	 */
	public boolean exists(SmhSimHistoryDMO smhSimHistoryDMO)
			throws EPPIXSeriousException {
		// TODO Fix me
		logger.debug( "exists(SmhSimHistoryDMO smhSimHistoryDMO)" );
		
//	    return dao.exists( "SmhSimNo", "filterByPrimaryKey",
//	    	      new DAOArgs( 1 ).arg( smhSimHistoryDMO.getSmhSimNo(  ) ) );
		throw new EPPIXSeriousException("SmhSimHistory exist(SmhSimHistoryDMO smhSimHistoryDMO) cannot be executed");
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		logger.debug( "exists(QueryFilter filter)" );
		
		return dao.exists( filterQueryArgs( filter, null ) );
	}

	public SmhSimHistoryDMO get(SmhSimHistoryDMO smhSimHistoryDMO)
			throws EPPIXSeriousException {
	    logger.debug( "get(SmhSimHistoryDMO smhSimHistoryDMO)" );

	    thrower.ifParameterMissing( "SmhSimHistoryDMO", smhSimHistoryDMO );

	    return (SmhSimHistoryDMO) dao.get( smhSimHistoryDMO );
	}

	public SmhSimHistoryDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug( "get(QueryFilter filter)" );
		
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (SmhSimHistoryDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
	      args );
	}

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		// TODO Fix me
		logger.debug( "getList(DTOListState state, QueryFilter filter)" );
		
		return null;
	}


	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		logger.debug( "max(QueryFilter filter)" );
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		logger.debug( "min(QueryFilter filter)" );
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	}

	protected DAOParamQueryArgs filterQueryArgs( 
			    QueryFilter filter,
			    String      dmlName ) {
			    List parts = filter.getParts(  );
			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
			        ? "SmhSimHistory" : dmlName, parts.size(  ) );

			    Iterator it = parts.iterator();
//			    for ( FilterPart part : parts ) {
			    while(it.hasNext()){
			    	FilterPart part = (FilterPart)it.next();
			      switch ( part.getIndex(  ) ) {
			        case SmhSimHistoryDMO.smhCommentFilter:
			          part.andFilterBy( queryArgs, "SmhComment",
			            dao.wildcardForAnySequence(  ) );

			          break;

			        case SmhSimHistoryDMO.smhHistCodeFilter:
			          part.andFilterBy( queryArgs, "SmhHistCode",
			            dao.wildcardForAnySequence(  ) );

			          break;

			        case SmhSimHistoryDMO.smhSimNoFilter:
			          part.andFilterBy( queryArgs, "SmhSimNo",
			            dao.wildcardForAnySequence(  ) );

			          break;

			        case SmhSimHistoryDMO.smhSubscriberIdFilter:
			          part.andFilterBy( queryArgs, "SmhSubscriberId");

			          break;

			        case SmhSimHistoryDMO.smhTerminalIdFilter:
			          part.andFilterBy( queryArgs, "SmhTerminalId",
			            dao.wildcardForAnySequence(  ) );

			          break;

			        case SmhSimHistoryDMO.smhTimestampFilter:
			          part.andFilterBy( queryArgs, "SmhTimestamp" );

			          break;

			        case SmhSimHistoryDMO.smhUserIdFilter:
			          part.andFilterBy( queryArgs, "smhUserId",
			            dao.wildcardForAnySequence(  ) );

			          break;
			      }
			    }
			    return queryArgs;
			  }	

	  protected DAOParamQueryArgs paramQueryArgs( SmhSimHistoryDMO smhSimHistoryDMO ) {
		    logger.debug( "paramQueryArgs( SmhSimHistoryDMO)" );

		    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SmnSimNos", 21 * 2 );

		    if ( smhSimHistoryDMO != null ) {
		      // filters...
		      String smhComment = smhSimHistoryDMO.getSmhComment(  );

		      if ( !DMO.isNull( smhComment ) ) {
		        queryArgs.andFilterBy( "SmhCommentMatch" )
		                 .arg( smhComment + dao.wildcardForAnySequence(  ) );
		      }

		      // define more filters...
		      String smhHistCode = smhSimHistoryDMO.getSmhHistCode(  );

		      if ( !DMO.isNull( smhHistCode ) ) {
		        queryArgs.andFilterBy( "SmhHistCodeMatch" )
		                 .arg( smhHistCode + dao.wildcardForAnySequence(  ) );
		      }

		      String smhSimNo = smhSimHistoryDMO.getSmhSimNo(  );

		      if ( !DMO.isNull( smhSimNo ) ) {
		        queryArgs.andFilterBy( "SmhSimNoMatch" )
		                 .arg( smhSimNo + dao.wildcardForAnySequence(  ) );
		      }

		      Integer smhSubscriberId = smhSimHistoryDMO.getSmhSubscriberId(  );

		      if ( !DMO.isNull( smhSubscriberId ) ) {
		        queryArgs.andFilterBy( "SmhSubscriberIdMatch" )
		                 .arg( smhSubscriberId + dao.wildcardForAnySequence(  ) );
		      }

		      String smhTerminalId = smhSimHistoryDMO.getSmhTerminalId(  );

		      if ( !DMO.isNull( smhTerminalId ) ) {
		        queryArgs.andFilterBy( "SmhTerminalIdMatch" )
		                 .arg( smhTerminalId + dao.wildcardForAnySequence(  ) );
		      }

		      String smhUserId = smhSimHistoryDMO.getSmhUserId(  );

		      if ( !DMO.isNull( smhUserId ) ) {
		        queryArgs.andFilterBy( "SmhUserIdMatch" )
		                 .arg( smhUserId + dao.wildcardForAnySequence(  ) );
		      }

		    } else {
		      // include all default languageCode filters where appropriate...
		    }

		    return queryArgs;
		  }

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(  filterQueryArgs( filter, null ) );
	}
}
