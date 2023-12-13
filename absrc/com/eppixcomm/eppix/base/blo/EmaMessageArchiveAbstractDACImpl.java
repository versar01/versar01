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
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class EmaMessageArchiveAbstractDACImpl extends DAC implements EmaMessageArchiveAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( EmaMessageArchiveAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public EmaMessageArchiveAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public EmaMessageArchiveAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public EmaMessageArchiveDMO get( EmaMessageArchiveDMO emaMessageArchiveDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( EmaMessageArchiveDMO )" );

	    thrower.ifParameterMissing("EmaMessageArchiveDMO", emaMessageArchiveDMO);

	    return (EmaMessageArchiveDMO) dao.get( emaMessageArchiveDMO );
	  }


	  public void create( EmaMessageArchiveDMO emaMessageArchiveDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( emaMessageArchiveDMO )" );
	    thrower.ifParameterMissing( "EmaMessageArchiveDMO", emaMessageArchiveDMO );

	    dao.insert( emaMessageArchiveDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new EmaMessageArchiveDMO(  ),
	      filterQueryArgs( filter, "EmaMessageArchive" ) );
	  }


	  public void delete( EmaMessageArchiveDMO emaMessageArchiveDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( EmaMessageArchiveDMO )" );

	    thrower.ifParameterMissing( "EmaMessageArchiveDMO", emaMessageArchiveDMO );


	    dao.delete(emaMessageArchiveDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "EmaMessageArchive" );

	    dao.delete( "EmaMessageArchive", args.getFilterBy(  ), args );
	  }


	  public boolean exists( EmaMessageArchiveDMO emaMessageArchiveDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( EmaMessageArchiveDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, EmaMessageArchiveDMO.hmManuIdFilter, emaMessageArchiveDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(emaMessageArchiveDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, EmaMessageArchiveDMO emaMessageArchiveDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, emaMessageArchiveDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( emaMessageArchiveDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    EmaMessageArchiveDMO emaMessageArchiveDMO ) {
	    logger.debug( "paramQueryArgs( emaMessageArchiveDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EmaMessageArchive",
	        2 * 2 );

	    if ( emaMessageArchiveDMO != null ) {

	      Integer EmaSerial = emaMessageArchiveDMO.getEmaSerial();

	      if ( !DMO.isNull( EmaSerial ) ) {
	        queryArgs.andFilterBy( "EmaSerialMatch" )
	                 .arg( EmaSerial );
	      }


	      Integer EmaMessageId = emaMessageArchiveDMO.getEmaMessageId();

	      if ( !DMO.isNull( EmaMessageId ) ) {
	        queryArgs.andFilterBy( "EmaMessageIdMatch" )
	                 .arg( EmaMessageId );
	      }


	      String EmaAccountNo = emaMessageArchiveDMO.getEmaAccountNo();

	      if ( !DMO.isNull( EmaAccountNo ) ) {
	        queryArgs.andFilterBy( "EmaAccountNoMatch" )
	                 .arg( EmaAccountNo );
	      }


	      String EmaMsisdnNo = emaMessageArchiveDMO.getEmaMsisdnNo();

	      if ( !DMO.isNull( EmaMsisdnNo ) ) {
	        queryArgs.andFilterBy( "EmaMsisdnNoMatch" )
	                 .arg( EmaMsisdnNo );
	      }


	      String EmaSimNo = emaMessageArchiveDMO.getEmaSimNo();

	      if ( !DMO.isNull( EmaSimNo ) ) {
	        queryArgs.andFilterBy( "EmaSimNoMatch" )
	                 .arg( EmaSimNo );
	      }


	      String EmaHistoryCode = emaMessageArchiveDMO.getEmaHistoryCode();

	      if ( !DMO.isNull( EmaHistoryCode ) ) {
	        queryArgs.andFilterBy( "EmaHistoryCodeMatch" )
	                 .arg( EmaHistoryCode );
	      }


	      String EmaDocLoc = emaMessageArchiveDMO.getEmaDocLoc();

	      if ( !DMO.isNull( EmaDocLoc ) ) {
	        queryArgs.andFilterBy( "EmaDocLocMatch" )
	                 .arg( EmaDocLoc );
	      }


	      String EmaSender = emaMessageArchiveDMO.getEmaSender();

	      if ( !DMO.isNull( EmaSender ) ) {
	        queryArgs.andFilterBy( "EmaSenderMatch" )
	                 .arg( EmaSender );
	      }


	      String EmaReceiver = emaMessageArchiveDMO.getEmaReceiver();

	      if ( !DMO.isNull( EmaReceiver ) ) {
	        queryArgs.andFilterBy( "EmaReceiverMatch" )
	                 .arg( EmaReceiver );
	      }


	      String EmaSubject = emaMessageArchiveDMO.getEmaSubject();

	      if ( !DMO.isNull( EmaSubject ) ) {
	        queryArgs.andFilterBy( "EmaSubjectMatch" )
	                 .arg( EmaSubject );
	      }


	      String EmaAttention = emaMessageArchiveDMO.getEmaAttention();

	      if ( !DMO.isNull( EmaAttention ) ) {
	        queryArgs.andFilterBy( "EmaAttentionMatch" )
	                 .arg( EmaAttention );
	      }


	      String EmaOldValue = emaMessageArchiveDMO.getEmaOldValue();

	      if ( !DMO.isNull( EmaOldValue ) ) {
	        queryArgs.andFilterBy( "EmaOldValueMatch" )
	                 .arg( EmaOldValue );
	      }


	      String EmaNewValue = emaMessageArchiveDMO.getEmaNewValue();

	      if ( !DMO.isNull( EmaNewValue ) ) {
	        queryArgs.andFilterBy( "EmaNewValueMatch" )
	                 .arg( EmaNewValue );
	      }


	      Short EmaStatus = emaMessageArchiveDMO.getEmaStatus();

	      if ( !DMO.isNull( EmaStatus ) ) {
	        queryArgs.andFilterBy( "EmaStatusMatch" )
	                 .arg( EmaStatus );
	      }


	      String EmaComment = emaMessageArchiveDMO.getEmaComment();

	      if ( !DMO.isNull( EmaComment ) ) {
	        queryArgs.andFilterBy( "EmaCommentMatch" )
	                 .arg( EmaComment );
	      }


	      Date EmaSubmittedDate = emaMessageArchiveDMO.getEmaSubmittedDate();

	      if ( !DMO.isNull( EmaSubmittedDate ) ) {
	        queryArgs.andFilterBy( "EmaSubmittedDateMatch" )
	                 .arg( EmaSubmittedDate );
	      }


	      Date EmaProcessedDate = emaMessageArchiveDMO.getEmaProcessedDate();

	      if ( !DMO.isNull( EmaProcessedDate ) ) {
	        queryArgs.andFilterBy( "EmaProcessedDateMatch" )
	                 .arg( EmaProcessedDate );
	      }


	      String EmaContents = emaMessageArchiveDMO.getEmaContents();

	      if ( !DMO.isNull( EmaContents ) ) {
	        queryArgs.andFilterBy( "EmaContentsMatch" )
	                 .arg( EmaContents );
	      }


	      String EmaSentId = emaMessageArchiveDMO.getEmaSentId();

	      if ( !DMO.isNull( EmaSentId ) ) {
	        queryArgs.andFilterBy( "EmaSentIdMatch" )
	                 .arg( EmaSentId );
	      }

//	      String EmaMessageType = emaMessageArchiveDMO.getEma;
//
//	      if ( !DMO.isNull( EmaSentId ) ) {
//	        queryArgs.andFilterBy( "EmaSentIdMatch" )
//	                 .arg( EmaSentId );
//	      }
//	      
//	      String EmaSentId = emaMessageArchiveDMO.getEmaSentId();
//
//	      if ( !DMO.isNull( EmaSentId ) ) {
//	        queryArgs.andFilterBy( "EmaSentIdMatch" )
//	                 .arg( EmaSentId );
//	      }
	      
	      
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
	        ? "EmaMessageArchive" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case EmaMessageArchiveDMO.emaSerialFilter:
	          part.andFilterBy( queryArgs, "emaSerial", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaMessageIdFilter:
	          part.andFilterBy( queryArgs, "emaMessageId", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaAccountNoFilter:
	          part.andFilterBy( queryArgs, "emaAccountNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "emaMsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaSimNoFilter:
	          part.andFilterBy( queryArgs, "emaSimNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaHistoryCodeFilter:
	          part.andFilterBy( queryArgs, "emaHistoryCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaDocLocFilter:
	          part.andFilterBy( queryArgs, "emaDocLoc", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaSenderFilter:
	          part.andFilterBy( queryArgs, "emaSender", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaReceiverFilter:
	          part.andFilterBy( queryArgs, "emaReceiver", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaSubjectFilter:
	          part.andFilterBy( queryArgs, "emaSubject", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaAttentionFilter:
	          part.andFilterBy( queryArgs, "emaAttention", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaOldValueFilter:
	          part.andFilterBy( queryArgs, "emaOldValue", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaNewValueFilter:
	          part.andFilterBy( queryArgs, "emaNewValue", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaStatusFilter:
	          part.andFilterBy( queryArgs, "emaStatus", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaCommentFilter:
	          part.andFilterBy( queryArgs, "emaComment", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaSubmittedDateFilter:
	          part.andFilterBy( queryArgs, "emaSubmittedDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaProcessedDateFilter:
	          part.andFilterBy( queryArgs, "emaProcessedDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaContentsFilter:
	          part.andFilterBy( queryArgs, "emaContents", dao.wildcardForAnySequence(  ) );
	          break;

	        case EmaMessageArchiveDMO.emaSentIdFilter:
	          part.andFilterBy( queryArgs, "emaSentId", dao.wildcardForAnySequence(  ) );
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


	  public EmaMessageArchiveDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "EmaMessageArchive");

	    return (EmaMessageArchiveDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "EmaMessageArchive" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "EmaMessageArchive" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "EmaMessageArchive" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}