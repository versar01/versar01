package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class AchActionHistoryAbstractDACImpl extends DAC implements AchActionHistoryAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( AchActionHistoryAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public AchActionHistoryAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public AchActionHistoryAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public AchActionHistoryDMO get( AchActionHistoryDMO achActionHistoryDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( AchActionHistoryDMO )" );

	    thrower.ifParameterMissing("AchActionHistoryDMO", achActionHistoryDMO);

	    return (AchActionHistoryDMO) dao.get( achActionHistoryDMO );
	  }


	  public void create( AchActionHistoryDMO achActionHistoryDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( achActionHistoryDMO )" );
	    thrower.ifParameterMissing( "AchActionHistoryDMO", achActionHistoryDMO );

	    dao.insert( achActionHistoryDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new AchActionHistoryDMO(  ),
	      filterQueryArgs( filter, "AchActionHistory" ) );
	  }
	  
		public void modify(QueryFilter filter, boolean isMultiple)
				throws EPPIXBusinessException, EPPIXUnexpectedException,
				EPPIXFatalException {
			
			logger.debug( "modify( filter, isMulyiple )" );

		    thrower.ifParameterMissing( "filter", filter);
		    
		    dao.updateCustomMultiple(new AchActionHistoryDMO(  ),
		      filterQueryArgs( filter, "AchActionHistory" ) , isMultiple);
			
		}


	  public void delete( AchActionHistoryDMO achActionHistoryDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( AchActionHistoryDMO )" );

	    thrower.ifParameterMissing( "AchActionHistoryDMO", achActionHistoryDMO );


	    dao.delete(achActionHistoryDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "AchActionHistory" );

	    dao.delete( "AchActionHistory", args.getFilterBy(  ), args );
	  }


	  public boolean exists( AchActionHistoryDMO achActionHistoryDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( AchActionHistoryDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, AchActionHistoryDMO.hmManuIdFilter, achActionHistoryDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(achActionHistoryDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, AchActionHistoryDMO achActionHistoryDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, achActionHistoryDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( achActionHistoryDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    AchActionHistoryDMO achActionHistoryDMO ) {
	    logger.debug( "paramQueryArgs( achActionHistoryDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AchActionHistory",
	        2 * 2 );

	    if ( achActionHistoryDMO != null ) {

	      Integer AchSubscriberId = achActionHistoryDMO.getAchSubscriberId();

	      if ( !DMO.isNull( AchSubscriberId ) ) {
	        queryArgs.andFilterBy( "AchSubscriberIdMatch" )
	                 .arg( AchSubscriberId );
	      }


	      String AchSimNo = achActionHistoryDMO.getAchSimNo();

	      if ( !DMO.isNull( AchSimNo ) ) {
	        queryArgs.andFilterBy( "AchSimNoMatch" )
	                 .arg( AchSimNo );
	      }


	      String AchMsisdnNo = achActionHistoryDMO.getAchMsisdnNo();

	      if ( !DMO.isNull( AchMsisdnNo ) ) {
	        queryArgs.andFilterBy( "AchMsisdnNoMatch" )
	                 .arg( AchMsisdnNo );
	      }


	      String AchOperation = achActionHistoryDMO.getAchOperation();

	      if ( !DMO.isNull( AchOperation ) ) {
	        queryArgs.andFilterBy( "AchOperationMatch" )
	                 .arg( AchOperation );
	      }


	      String AchValue = achActionHistoryDMO.getAchValue();

	      if ( !DMO.isNull( AchValue ) ) {
	        queryArgs.andFilterBy( "AchValueMatch" )
	                 .arg( AchValue );
	      }


	      String AchAnalysis1 = achActionHistoryDMO.getAchAnalysis1();

	      if ( !DMO.isNull( AchAnalysis1 ) ) {
	        queryArgs.andFilterBy( "AchAnalysis1Match" )
	                 .arg( AchAnalysis1 );
	      }


	      String AchAnalysis2 = achActionHistoryDMO.getAchAnalysis2();

	      if ( !DMO.isNull( AchAnalysis2 ) ) {
	        queryArgs.andFilterBy( "AchAnalysis2Match" )
	                 .arg( AchAnalysis2 );
	      }


	      String AchAnalysis3 = achActionHistoryDMO.getAchAnalysis3();

	      if ( !DMO.isNull( AchAnalysis3 ) ) {
	        queryArgs.andFilterBy( "AchAnalysis3Match" )
	                 .arg( AchAnalysis3 );
	      }


	      DateTime AchStdatetime = achActionHistoryDMO.getAchStdatetime();

	      if ( !DMO.isNull( AchStdatetime ) ) {
	        queryArgs.andFilterBy( "AchStdatetimeMatch" )
	                 .arg( AchStdatetime );
	      }


	      DateTime AchEndatetime = achActionHistoryDMO.getAchEndatetime();

	      if ( !DMO.isNull( AchEndatetime ) ) {
	        queryArgs.andFilterBy( "AchEndatetimeMatch" )
	                 .arg( AchEndatetime );
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
	        ? "AchActionHistory" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case AchActionHistoryDMO.achSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "AchSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achSimNoFilter:
	          part.andFilterBy( queryArgs, "AchSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "AchMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achOperationFilter:
	          part.andFilterBy( queryArgs, "AchOperation", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achValueFilter:
	          part.andFilterBy( queryArgs, "AchValue", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achAnalysis1Filter:
	          part.andFilterBy( queryArgs, "AchAnalysis1", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achAnalysis2Filter:
	          part.andFilterBy( queryArgs, "AchAnalysis2", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achAnalysis3Filter:
	          part.andFilterBy( queryArgs, "AchAnalysis3", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achStdatetimeFilter:
	          part.andFilterBy( queryArgs, "AchStdatetime", dao.wildcardForAnySequence(  ) );
	          break;

	        case AchActionHistoryDMO.achEndatetimeFilter:
	          part.andFilterBy( queryArgs, "AchEndatetime", dao.wildcardForAnySequence(  ) );
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


	  public AchActionHistoryDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "AchActionHistory");

	    return (AchActionHistoryDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "AchActionHistory" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "AchActionHistory" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "AchActionHistory" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }

}