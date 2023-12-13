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
//import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class FsFreeairServiceAbstractDACImpl extends DAC implements FsFreeairServiceAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( FsFreeairServiceAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public FsFreeairServiceAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public FsFreeairServiceAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public FsFreeairServiceDMO get( FsFreeairServiceDMO fsFreeairServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( FsFreeairServiceDMO )" );

	    thrower.ifParameterMissing("FsFreeairServiceDMO", fsFreeairServiceDMO);

	    return (FsFreeairServiceDMO) dao.get( fsFreeairServiceDMO );
	  }


	  public void create( FsFreeairServiceDMO fsFreeairServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( fsFreeairServiceDMO )" );
	    thrower.ifParameterMissing( "FsFreeairServiceDMO", fsFreeairServiceDMO );

	    dao.insert( fsFreeairServiceDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new FsFreeairServiceDMO(  ),
	      filterQueryArgs( filter, "FsFreeairService" ) );
	  }


	  public void delete( FsFreeairServiceDMO fsFreeairServiceDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( FsFreeairServiceDMO )" );

	    thrower.ifParameterMissing( "FsFreeairServiceDMO", fsFreeairServiceDMO );


	    dao.delete(fsFreeairServiceDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FsFreeairService" );

	    dao.delete( "FsFreeairService", args.getFilterBy(  ), args );
	  }


	  public boolean exists( FsFreeairServiceDMO fsFreeairServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( FsFreeairServiceDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, FsFreeairServiceDMO.hmManuIdFilter, fsFreeairServiceDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(fsFreeairServiceDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, FsFreeairServiceDMO fsFreeairServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, fsFreeairServiceDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( fsFreeairServiceDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    FsFreeairServiceDMO fsFreeairServiceDMO ) {
	    logger.debug( "paramQueryArgs( fsFreeairServiceDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "FsFreeairService",
	        2 * 2 );

	    if ( fsFreeairServiceDMO != null ) {

	      String FsServiceCode = fsFreeairServiceDMO.getFsServiceCode();

	      if ( !DMO.isNull( FsServiceCode ) ) {
	        queryArgs.andFilterBy( "FsServiceCodeMatch" )
	                 .arg( FsServiceCode );
	      }


	      Integer FsGroupId = fsFreeairServiceDMO.getFsGroupId();

	      if ( !DMO.isNull( FsGroupId ) ) {
	        queryArgs.andFilterBy( "FsGroupIdMatch" )
	                 .arg( FsGroupId );
	      }


	      Integer FsFreeSeconds = fsFreeairServiceDMO.getFsFreeSeconds();

	      if ( !DMO.isNull( FsFreeSeconds ) ) {
	        queryArgs.andFilterBy( "FsFreeSecondsMatch" )
	                 .arg( FsFreeSeconds );
	      }


	      Integer FsActRule = fsFreeairServiceDMO.getFsActRule();

	      if ( !DMO.isNull( FsActRule ) ) {
	        queryArgs.andFilterBy( "FsActRuleMatch" )
	                 .arg( FsActRule );
	      }


	      Integer FsDeactRule = fsFreeairServiceDMO.getFsDeactRule();

	      if ( !DMO.isNull( FsDeactRule ) ) {
	        queryArgs.andFilterBy( "FsDeactRuleMatch" )
	                 .arg( FsDeactRule );
	      }


	      String FsAirLateCall = fsFreeairServiceDMO.getFsAirLateCall();

	      if ( !DMO.isNull( FsAirLateCall ) ) {
	        queryArgs.andFilterBy( "FsAirLateCallMatch" )
	                 .arg( FsAirLateCall );
	      }


	      Integer FsBillPeriodNo = fsFreeairServiceDMO.getFsBillPeriodNo();

	      if ( !DMO.isNull( FsBillPeriodNo ) ) {
	        queryArgs.andFilterBy( "FsBillPeriodNoMatch" )
	                 .arg( FsBillPeriodNo );
	      }


	      String FsShareTime = fsFreeairServiceDMO.getFsShareTime();

	      if ( !DMO.isNull( FsShareTime ) ) {
	        queryArgs.andFilterBy( "FsShareTimeMatch" )
	                 .arg( FsShareTime );
	      }


	      String FsTakeTimeOver = fsFreeairServiceDMO.getFsTakeTimeOver();

	      if ( !DMO.isNull( FsTakeTimeOver ) ) {
	        queryArgs.andFilterBy( "FsTakeTimeOverMatch" )
	                 .arg( FsTakeTimeOver );
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
	        ? "FsFreeairService" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case FsFreeairServiceDMO.FsServiceCodeFilter:
	          part.andFilterBy( queryArgs, "FsServiceCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsGroupIdFilter:
	          part.andFilterBy( queryArgs, "FsGroupId", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsFreeSecondsFilter:
	          part.andFilterBy( queryArgs, "FsFreeSeconds", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsActRuleFilter:
	          part.andFilterBy( queryArgs, "FsActRule", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsDeactRuleFilter:
	          part.andFilterBy( queryArgs, "FsDeactRule", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsAirLateCallFilter:
	          part.andFilterBy( queryArgs, "FsAirLateCall", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsBillPeriodNoFilter:
	          part.andFilterBy( queryArgs, "FsBillPeriodNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsShareTimeFilter:
	          part.andFilterBy( queryArgs, "FsShareTime", dao.wildcardForAnySequence(  ) );
	          break;

	        case FsFreeairServiceDMO.FsTakeTimeOverFilter:
	          part.andFilterBy( queryArgs, "FsTakeTimeOver", dao.wildcardForAnySequence(  ) );
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


	  public FsFreeairServiceDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FsFreeairService");

	    return (FsFreeairServiceDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FsFreeairService" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FsFreeairService" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FsFreeairService" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}