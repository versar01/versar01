package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class NteNoteAbstractDACImpl extends DAC implements NteNoteAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( NteNoteAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public NteNoteAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public NteNoteAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public NteNoteDMO get( NteNoteDMO nteNoteDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( NteNoteDMO )" );

	    thrower.ifParameterMissing("NteNoteDMO", nteNoteDMO);

	    return (NteNoteDMO) dao.get( nteNoteDMO );
	  }


	  public void create( NteNoteDMO nteNoteDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( nteNoteDMO )" );
	    thrower.ifParameterMissing( "NteNoteDMO", nteNoteDMO );

	    dao.insert( nteNoteDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new NteNoteDMO(  ),
	      filterQueryArgs( filter, "NteNote" ) );
	  }


	  public void delete( NteNoteDMO nteNoteDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( NteNoteDMO )" );

	    thrower.ifParameterMissing( "NteNoteDMO", nteNoteDMO );


	    dao.delete(nteNoteDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "NteNote" );

	    dao.delete( "NteNote", args.getFilterBy(  ), args );
	  }


	  public boolean exists( NteNoteDMO nteNoteDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( NteNoteDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, NteNoteDMO.hmManuIdFilter, nteNoteDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(nteNoteDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, NteNoteDMO nteNoteDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, nteNoteDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( nteNoteDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    NteNoteDMO nteNoteDMO ) {
	    logger.debug( "paramQueryArgs( nteNoteDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "NteNote",
	        2 * 2 );

	    if ( nteNoteDMO != null ) {

	      Integer NteNoteSerial = nteNoteDMO.getNteNote();

	      if ( !DMO.isNull( NteNoteSerial ) ) {
	        queryArgs.andFilterBy( "NteNoteSerialMatch" )
	                 .arg( NteNoteSerial );
	      }


	      Integer NteActionSerial = nteNoteDMO.getNteActionSerial();

	      if ( !DMO.isNull( NteActionSerial ) ) {
	        queryArgs.andFilterBy( "NteActionSerialMatch" )
	                 .arg( NteActionSerial );
	      }


	      String NteSource = nteNoteDMO.getNteSource();

	      if ( !DMO.isNull( NteSource ) ) {
	        queryArgs.andFilterBy( "NteSourceMatch" )
	                 .arg( NteSource );
	      }


	      String NteOpenedBy = nteNoteDMO.getNteOpenedBy();

	      if ( !DMO.isNull( NteOpenedBy ) ) {
	        queryArgs.andFilterBy( "NteOpenedByMatch" )
	                 .arg( NteOpenedBy );
	      }


	      DateTime NteOpenedDate = nteNoteDMO.getNteOpenedDate();

	      if ( !DMO.isNull( NteOpenedDate ) ) {
	        queryArgs.andFilterBy( "NteOpenedDateMatch" )
	                 .arg( NteOpenedDate );
	      }


	      DateTime NteClosedDate = nteNoteDMO.getNteClosedDate();

	      if ( !DMO.isNull( NteClosedDate ) ) {
	        queryArgs.andFilterBy( "NteClosedDateMatch" )
	                 .arg( NteClosedDate );
	      }


	      DateTime NteTimestamp = nteNoteDMO.getNteTimestamp();

	      if ( !DMO.isNull( NteTimestamp ) ) {
	        queryArgs.andFilterBy( "NteTimestampMatch" )
	                 .arg( NteTimestamp );
	      }


	      String NteStatus = nteNoteDMO.getNteStatus();

	      if ( !DMO.isNull( NteStatus ) ) {
	        queryArgs.andFilterBy( "NteStatusMatch" )
	                 .arg( NteStatus );
	      }


	      DateTime NteDeadline = nteNoteDMO.getNteDeadline();

	      if ( !DMO.isNull( NteDeadline ) ) {
	        queryArgs.andFilterBy( "NteDeadlineMatch" )
	                 .arg( NteDeadline );
	      }


	      String NteTargetType = nteNoteDMO.getNteTargetType();

	      if ( !DMO.isNull( NteTargetType ) ) {
	        queryArgs.andFilterBy( "NteTargetTypeMatch" )
	                 .arg( NteTargetType );
	      }


	      Integer NteTargetGroup = nteNoteDMO.getNteTargetGroup();

	      if ( !DMO.isNull( NteTargetGroup ) ) {
	        queryArgs.andFilterBy( "NteTargetGroupMatch" )
	                 .arg( NteTargetGroup );
	      }


	      String NteTargetUser = nteNoteDMO.getNteTargetUser();

	      if ( !DMO.isNull( NteTargetUser ) ) {
	        queryArgs.andFilterBy( "NteTargetUserMatch" )
	                 .arg( NteTargetUser );
	      }


	      String NteReallocBy = nteNoteDMO.getNteReallocBy();

	      if ( !DMO.isNull( NteReallocBy ) ) {
	        queryArgs.andFilterBy( "NteReallocByMatch" )
	                 .arg( NteReallocBy );
	      }


	      DateTime NteReallocDate = nteNoteDMO.getNteReallocDate();

	      if ( !DMO.isNull( NteReallocDate ) ) {
	        queryArgs.andFilterBy( "NteReallocDateMatch" )
	                 .arg( NteReallocDate );
	      }


	      String NteSuspendedUser = nteNoteDMO.getNteSuspendedUser();

	      if ( !DMO.isNull( NteSuspendedUser ) ) {
	        queryArgs.andFilterBy( "NteSuspendedUserMatch" )
	                 .arg( NteSuspendedUser );
	      }


	      String NteBillAcNo = nteNoteDMO.getNteBillAcNo();

	      if ( !DMO.isNull( NteBillAcNo ) ) {
	        queryArgs.andFilterBy( "NteBillAcNoMatch" )
	                 .arg( NteBillAcNo );
	      }


	      String NteInvoiceNo = nteNoteDMO.getNteInvoiceNo();

	      if ( !DMO.isNull( NteInvoiceNo ) ) {
	        queryArgs.andFilterBy( "NteInvoiceNoMatch" )
	                 .arg( NteInvoiceNo );
	      }


	      Integer NteSubscriberId = nteNoteDMO.getNteSubscriberId();

	      if ( !DMO.isNull( NteSubscriberId ) ) {
	        queryArgs.andFilterBy( "NteSubscriberIdMatch" )
	                 .arg( NteSubscriberId );
	      }


	      String NteSimNo = nteNoteDMO.getNteSimNo();

	      if ( !DMO.isNull( NteSimNo ) ) {
	        queryArgs.andFilterBy( "NteSimNoMatch" )
	                 .arg( NteSimNo );
	      }


	      String NteMsisdnNo = nteNoteDMO.getNteMsisdnNo();

	      if ( !DMO.isNull( NteMsisdnNo ) ) {
	        queryArgs.andFilterBy( "NteMsisdnNoMatch" )
	                 .arg( NteMsisdnNo );
	      }


	      String NteReferenceNo = nteNoteDMO.getNteReferenceNo();

	      if ( !DMO.isNull( NteReferenceNo ) ) {
	        queryArgs.andFilterBy( "NteReferenceNoMatch" )
	                 .arg( NteReferenceNo );
	      }


	      Integer NteLastPage = nteNoteDMO.getNteLastPage();

	      if ( !DMO.isNull( NteLastPage ) ) {
	        queryArgs.andFilterBy( "NteLastPageMatch" )
	                 .arg( NteLastPage );
	      }


	      String NtePriorityType = nteNoteDMO.getNtePriorityType();

	      if ( !DMO.isNull( NtePriorityType ) ) {
	        queryArgs.andFilterBy( "NtePriorityTypeMatch" )
	                 .arg( NtePriorityType );
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
	        ? "NteNote" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case NteNoteDMO.nteNoteSerialFilter:
	          part.andFilterBy( queryArgs, "NteNoteSerial");
	          break;

	        case NteNoteDMO.nteActionSerialFilter:
	          part.andFilterBy( queryArgs, "NteActionSerial");
	          break;

	        case NteNoteDMO.nteSourceFilter:
	          part.andFilterBy( queryArgs, "NteSource", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteOpenedByFilter:
	          part.andFilterBy( queryArgs, "NteOpenedBy", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteOpenedDateFilter:
	          part.andFilterBy( queryArgs, "NteOpenedDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteClosedDateFilter:
	          part.andFilterBy( queryArgs, "NteClosedDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteTimestampFilter:
	          part.andFilterBy( queryArgs, "NteTimestamp", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteStatusFilter:
	          part.andFilterBy( queryArgs, "NteStatus", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteDeadlineFilter:
	          part.andFilterBy( queryArgs, "NteDeadline", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteTargetTypeFilter:
	          part.andFilterBy( queryArgs, "NteTargetType", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteTargetGroupFilter:
	          part.andFilterBy( queryArgs, "NteTargetGroup", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteTargetUserFilter:
	          part.andFilterBy( queryArgs, "NteTargetUser", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteReallocByFilter:
	          part.andFilterBy( queryArgs, "NteReallocBy", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteReallocDateFilter:
	          part.andFilterBy( queryArgs, "NteReallocDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteSuspendedUserFilter:
	          part.andFilterBy( queryArgs, "NteSuspendedUser", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteBillAcNoFilter:
	          part.andFilterBy( queryArgs, "NteBillAcNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteInvoiceNoFilter:
	          part.andFilterBy( queryArgs, "NteInvoiceNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "NteSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteSimNoFilter:
	          part.andFilterBy( queryArgs, "NteSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "NteMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteReferenceNoFilter:
	          part.andFilterBy( queryArgs, "NteReferenceNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.nteLastPageFilter:
	          part.andFilterBy( queryArgs, "NteLastPage", dao.wildcardForAnySequence(  ) );
	          break;

	        case NteNoteDMO.ntePriorityTypeFilter:
	          part.andFilterBy( queryArgs, "NtePriorityType", dao.wildcardForAnySequence(  ) );
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


	  public NteNoteDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "NteNote");

	    return (NteNoteDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "NteNote" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "NteNote" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "NteNote" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }

	public NteNoteDMO lock(NteNoteDMO aNteNoteDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		// TODO Auto-generated method stub
		return null;
	}

	public void modify(NteNoteDMO nteNoteDMO) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		// TODO Auto-generated method stub
		
	}

}