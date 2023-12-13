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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class FdFieldDefAbstractDACImpl extends DAC implements FdFieldDefAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( FdFieldDefAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public FdFieldDefAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public FdFieldDefAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public FdFieldDefDMO get( FdFieldDefDMO fdFieldDefDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( FdFieldDefDMO )" );

	    thrower.ifParameterMissing("FdFieldDefDMO", fdFieldDefDMO);

	    return (FdFieldDefDMO) dao.get( fdFieldDefDMO );
	  }


	  public void create( FdFieldDefDMO fdFieldDefDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( fdFieldDefDMO )" );
	    thrower.ifParameterMissing( "FdFieldDefDMO", fdFieldDefDMO );

	    dao.insert( fdFieldDefDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new FdFieldDefDMO(  ),
	      filterQueryArgs( filter, "FdFieldDef" ) );
	  }


	  public void delete( FdFieldDefDMO fdFieldDefDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( FdFieldDefDMO )" );

	    thrower.ifParameterMissing( "FdFieldDefDMO", fdFieldDefDMO );


	    dao.delete(fdFieldDefDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FdFieldDef" );

	    dao.delete( "FdFieldDef", args.getFilterBy(  ), args );
	  }


	  public boolean exists( FdFieldDefDMO fdFieldDefDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( FdFieldDefDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, FdFieldDefDMO.hmManuIdFilter, fdFieldDefDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(fdFieldDefDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, FdFieldDefDMO fdFieldDefDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, fdFieldDefDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( fdFieldDefDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    FdFieldDefDMO fdFieldDefDMO ) {
	    logger.debug( "paramQueryArgs( fdFieldDefDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "FdFieldDef",
	        2 * 2 );

	    if ( fdFieldDefDMO != null ) {

	      String FdFieldName = fdFieldDefDMO.getFdFieldName();

	      if ( !DMO.isNull( FdFieldName ) ) {
	        queryArgs.andFilterBy( "FdFieldNameMatch" )
	                 .arg( FdFieldName );
	      }


	      Integer FdFieldId = fdFieldDefDMO.getFdFieldId();

	      if ( !DMO.isNull( FdFieldId ) ) {
	        queryArgs.andFilterBy( "FdFieldIdMatch" )
	                 .arg( FdFieldId );
	      }


	      String FdHistDesc = fdFieldDefDMO.getFdHistDesc();

	      if ( !DMO.isNull( FdHistDesc ) ) {
	        queryArgs.andFilterBy( "FdHistDescMatch" )
	                 .arg( FdHistDesc );
	      }


	      Short FdAuditReqd = fdFieldDefDMO.getFdAuditReqd();

	      if ( !DMO.isNull( FdAuditReqd ) ) {
	        queryArgs.andFilterBy( "FdAuditReqdMatch" )
	                 .arg( FdAuditReqd );
	      }


	      String FdFieldLocked = fdFieldDefDMO.getFdFieldLocked();

	      if ( !DMO.isNull( FdFieldLocked ) ) {
	        queryArgs.andFilterBy( "FdFieldLockedMatch" )
	                 .arg( FdFieldLocked );
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
	        ? "FdFieldDef" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case FdFieldDefDMO.fdFieldNameFilter:
	          part.andFilterBy( queryArgs, "FdFieldName", dao.wildcardForAnySequence(  ) );
	          break;

	        case FdFieldDefDMO.fdFieldIdFilter:
	          part.andFilterBy( queryArgs, "FdFieldId", dao.wildcardForAnySequence(  ) );
	          break;

	        case FdFieldDefDMO.fdHistDescFilter:
	          part.andFilterBy( queryArgs, "FdHistDesc", dao.wildcardForAnySequence(  ) );
	          break;

	        case FdFieldDefDMO.fdAuditReqdFilter:
	          part.andFilterBy( queryArgs, "FdAuditReqd", dao.wildcardForAnySequence(  ) );
	          break;

	        case FdFieldDefDMO.fdFieldLockedFilter:
	          part.andFilterBy( queryArgs, "FdFieldLocked", dao.wildcardForAnySequence(  ) );
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


	  public FdFieldDefDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FdFieldDef");

	    return (FdFieldDefDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FdFieldDef" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FdFieldDef" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FdFieldDef" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }



}
