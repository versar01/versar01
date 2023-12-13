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
import com.eppixcomm.eppix.common.util.Date;
//import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class FtFreeairTimeAbstractDACImpl extends DAC implements FtFreeairTimeAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( FtFreeairTimeAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public FtFreeairTimeAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public FtFreeairTimeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public FtFreeairTimeDMO get( FtFreeairTimeDMO ftFreeairTimeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( FtFreeairTimeDMO )" );

	    thrower.ifParameterMissing("FtFreeairTimeDMO", ftFreeairTimeDMO);

	    return (FtFreeairTimeDMO) dao.get( ftFreeairTimeDMO );
	  }


	  public void create( FtFreeairTimeDMO ftFreeairTimeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( ftFreeairTimeDMO )" );
	    thrower.ifParameterMissing( "FtFreeairTimeDMO", ftFreeairTimeDMO );

	    dao.insert( ftFreeairTimeDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new FtFreeairTimeDMO(  ),
	      filterQueryArgs( filter, "FtFreeairTime" ) );
	  }


	  public void delete( FtFreeairTimeDMO ftFreeairTimeDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( FtFreeairTimeDMO )" );

	    thrower.ifParameterMissing( "FtFreeairTimeDMO", ftFreeairTimeDMO );


	    dao.delete(ftFreeairTimeDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FtFreeairTime" );

	    dao.delete( "FtFreeairTime", args.getFilterBy(  ), args );
	  }


	  public boolean exists( FtFreeairTimeDMO ftFreeairTimeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( FtFreeairTimeDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.hmManuIdFilter, ftFreeairTimeDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(ftFreeairTimeDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, FtFreeairTimeDMO ftFreeairTimeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, ftFreeairTimeDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( ftFreeairTimeDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    FtFreeairTimeDMO ftFreeairTimeDMO ) {
	    logger.debug( "paramQueryArgs( ftFreeairTimeDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "FtFreeairTime",
	        14 * 14 );

	    if ( ftFreeairTimeDMO != null ) {

	      Integer FtSubscriberId = ftFreeairTimeDMO.getFtSubscriberId();

	      if ( !DMO.isNull( FtSubscriberId ) ) {
	        queryArgs.andFilterBy( "FtSubscriberIdMatch" )
	                 .arg( FtSubscriberId );
	      }


	      String FtMsisdnNo = ftFreeairTimeDMO.getFtMsisdnNo();

	      if ( !DMO.isNull( FtMsisdnNo ) ) {
	        queryArgs.andFilterBy( "FtMsisdnNoMatch" )
	                 .arg( FtMsisdnNo );
	      }


	      String FtSimNo = ftFreeairTimeDMO.getFtSimNo();

	      if ( !DMO.isNull( FtSimNo ) ) {
	        queryArgs.andFilterBy( "FtSimNoMatch" )
	                 .arg( FtSimNo );
	      }


	      String FtServiceCode = ftFreeairTimeDMO.getFtServiceCode();

	      if ( !DMO.isNull( FtServiceCode ) ) {
	        queryArgs.andFilterBy( "FtServiceCodeMatch" )
	                 .arg( FtServiceCode );
	      }


	      Date FtDeactDate = ftFreeairTimeDMO.getFtDeactDate();

	      if ( !DMO.isNull( FtDeactDate ) ) {
	        queryArgs.andFilterBy( "FtDeactDateMatch" )
	                 .arg( FtDeactDate );
	      }


	      String FtTarplanRef = ftFreeairTimeDMO.getFtTarplanRef();

	      if ( !DMO.isNull( FtTarplanRef ) ) {
	        queryArgs.andFilterBy( "FtTarplanRefMatch" )
	                 .arg( FtTarplanRef );
	      }


	      String FtBillCycle = ftFreeairTimeDMO.getFtBillCycle();

	      if ( !DMO.isNull( FtBillCycle ) ) {
	        queryArgs.andFilterBy( "FtBillCycleMatch" )
	                 .arg( FtBillCycle );
	      }


	      Date FtContStart = ftFreeairTimeDMO.getFtContStart();

	      if ( !DMO.isNull( FtContStart ) ) {
	        queryArgs.andFilterBy( "FtContStartMatch" )
	                 .arg( FtContStart );
	      }


	      Date FtContEnd = ftFreeairTimeDMO.getFtContEnd();

	      if ( !DMO.isNull( FtContEnd ) ) {
	        queryArgs.andFilterBy( "FtContEndMatch" )
	                 .arg( FtContEnd );
	      }


	      Integer FtOrigSecs = ftFreeairTimeDMO.getFtOrigSecs();

	      if ( !DMO.isNull( FtOrigSecs ) ) {
	        queryArgs.andFilterBy( "FtOrigSecsMatch" )
	                 .arg( FtOrigSecs );
	      }


	      Date FtPrdStart = ftFreeairTimeDMO.getFtPrdStart();

	      if ( !DMO.isNull( FtPrdStart ) ) {
	        queryArgs.andFilterBy( "FtPrdStartMatch" )
	                 .arg( FtPrdStart );
	      }


	      Date FtPrdEnd = ftFreeairTimeDMO.getFtPrdEnd();

	      if ( !DMO.isNull( FtPrdEnd ) ) {
	        queryArgs.andFilterBy( "FtPrdEndMatch" )
	                 .arg( FtPrdEnd );
	      }


	      Integer FtSecsRemaining = ftFreeairTimeDMO.getFtSecsRemaining();

	      if ( !DMO.isNull( FtSecsRemaining ) ) {
	        queryArgs.andFilterBy( "FtSecsRemainingMatch" )
	                 .arg( FtSecsRemaining );
	      }


	      Float FtValueUsed = ftFreeairTimeDMO.getFtValueUsed();

	      if ( !DMO.isNull( FtValueUsed ) ) {
	        queryArgs.andFilterBy( "FtValueUsedMatch" )
	                 .arg( FtValueUsed );
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
	        ? "FtFreeairTime" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case FtFreeairTimeDMO.FtSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "FtSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "FtMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtSimNoFilter:
	          part.andFilterBy( queryArgs, "FtSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtServiceCodeFilter:
	          part.andFilterBy( queryArgs, "FtServiceCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtDeactDateFilter:
	          part.andFilterBy( queryArgs, "FtDeactDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtTarplanRefFilter:
	          part.andFilterBy( queryArgs, "FtTarplanRef", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtBillCycleFilter:
	          part.andFilterBy( queryArgs, "FtBillCycle", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtContStartFilter:
	          part.andFilterBy( queryArgs, "FtContStart", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtContEndFilter:
	          part.andFilterBy( queryArgs, "FtContEnd", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtOrigSecsFilter:
	          part.andFilterBy( queryArgs, "FtOrigSecs", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtPrdStartFilter:
	          part.andFilterBy( queryArgs, "FtPrdStart", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtPrdEndFilter:
	          part.andFilterBy( queryArgs, "FtPrdEnd", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtSecsRemainingFilter:
	          part.andFilterBy( queryArgs, "FtSecsRemaining", dao.wildcardForAnySequence(  ) );
	          break;

	        case FtFreeairTimeDMO.FtValueUsedFilter:
	          part.andFilterBy( queryArgs, "FtValueUsed", dao.wildcardForAnySequence(  ) );
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


	  public FtFreeairTimeDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FtFreeairTime");

	    return (FtFreeairTimeDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FtFreeairTime" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FtFreeairTime" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "FtFreeairTime" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}