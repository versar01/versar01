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
import com.eppixcomm.eppix.common.util.DateTime;

import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class MbmMailBatchMonAbstractDACImpl extends DAC implements MbmMailBatchMonAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( MbmMailBatchMonAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public MbmMailBatchMonAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public MbmMailBatchMonAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public MbmMailBatchMonDMO get( MbmMailBatchMonDMO mbmMailBatchMonDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( MbmMailBatchMonDMO )" );

	    thrower.ifParameterMissing("MbmMailBatchMonDMO", mbmMailBatchMonDMO);

	    return (MbmMailBatchMonDMO) dao.get( mbmMailBatchMonDMO );
	  }


	  public void create( MbmMailBatchMonDMO mbmMailBatchMonDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( mbmMailBatchMonDMO )" );
	    thrower.ifParameterMissing( "MbmMailBatchMonDMO", mbmMailBatchMonDMO );

	    dao.insert( mbmMailBatchMonDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new MbmMailBatchMonDMO(  ),
	      filterQueryArgs( filter, "MbmMailBatchMon" ) );
	  }


	  public void delete( MbmMailBatchMonDMO mbmMailBatchMonDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( MbmMailBatchMonDMO )" );

	    thrower.ifParameterMissing( "MbmMailBatchMonDMO", mbmMailBatchMonDMO );


	    dao.delete(mbmMailBatchMonDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "MbmMailBatchMon" );

	    dao.delete( "MbmMailBatchMon", args.getFilterBy(  ), args );
	  }


	  public boolean exists( MbmMailBatchMonDMO mbmMailBatchMonDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( MbmMailBatchMonDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, MbmMailBatchMonDMO.hmManuIdFilter, mbmMailBatchMonDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(mbmMailBatchMonDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, MbmMailBatchMonDMO mbmMailBatchMonDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, mbmMailBatchMonDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( mbmMailBatchMonDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    MbmMailBatchMonDMO mbmMailBatchMonDMO ) {
	    logger.debug( "paramQueryArgs( mbmMailBatchMonDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "MbmMailBatchMon",
	        2 * 2 );

	    if ( mbmMailBatchMonDMO != null ) {

	      Integer MbmId = mbmMailBatchMonDMO.getMbmId();

	      if ( !DMO.isNull( MbmId ) ) {
	        queryArgs.andFilterBy( "MbmIdMatch" )
	                 .arg( MbmId );
	      }


	      String MbmProgramName = mbmMailBatchMonDMO.getMbmProgramName();

	      if ( !DMO.isNull( MbmProgramName ) ) {
	        queryArgs.andFilterBy( "MbmProgramNameMatch" )
	                 .arg( MbmProgramName );
	      }


	      DateTime MbmStartDate = mbmMailBatchMonDMO.getMbmStartDate();

	      if ( !DMO.isNull( MbmStartDate ) ) {
	        queryArgs.andFilterBy( "MbmStartDateMatch" )
	                 .arg( MbmStartDate );
	      }


	      DateTime MbmEndDate = mbmMailBatchMonDMO.getMbmEndDate();

	      if ( !DMO.isNull( MbmEndDate ) ) {
	        queryArgs.andFilterBy( "MbmEndDateMatch" )
	                 .arg( MbmEndDate );
	      }


	      DateTime MbmTimestamp = mbmMailBatchMonDMO.getMbmTimestamp();

	      if ( !DMO.isNull( MbmTimestamp ) ) {
	        queryArgs.andFilterBy( "MbmTimestampMatch" )
	                 .arg( MbmTimestamp );
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
	        ? "MbmMailBatchMon" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case MbmMailBatchMonDMO.mbmIdFilter:
	          part.andFilterBy( queryArgs, "mbmId", dao.wildcardForAnySequence(  ) );
	          break;

	        case MbmMailBatchMonDMO.mbmProgramNameFilter:
	          part.andFilterBy( queryArgs, "mbmProgramName", dao.wildcardForAnySequence(  ) );
	          break;

	        case MbmMailBatchMonDMO.mbmStartDateFilter:
	          part.andFilterBy( queryArgs, "mbmStartDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case MbmMailBatchMonDMO.mbmEndDateFilter:
	          part.andFilterBy( queryArgs, "mbmEndDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case MbmMailBatchMonDMO.mbmTimestampFilter:
	          part.andFilterBy( queryArgs, "mbmTimestamp", dao.wildcardForAnySequence(  ) );
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


	  public MbmMailBatchMonDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "MbmMailBatchMon");

	    return (MbmMailBatchMonDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "MbmMailBatchMon" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "MbmMailBatchMon" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "MbmMailBatchMon" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}