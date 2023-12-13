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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class RicaActionReqAbstractDACImpl extends DAC implements RicaActionReqAbstractDAC{
	
	static DAOThrower thrower = DAOThrower.getDAOThrower( RicaActionReqAbstractDACImpl.class );
	Logger logger = thrower.getLogger(  );

	public RicaActionReqAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	public RicaActionReqAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}
	
	public RicaActionReqDMO get( RicaActionReqDMO ricaActionReqDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( RicaActionReqDMO )" );

    thrower.ifParameterMissing( "RicaActionReqDMO", ricaActionReqDMO );

    return (RicaActionReqDMO) dao.get( ricaActionReqDMO );
  }


  public void create( RicaActionReqDMO ricaActionReqDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( ricaActionReqDMO )" );
    thrower.ifParameterMissing( "RicaActionReqDMO", ricaActionReqDMO );

    dao.insert( ricaActionReqDMO );

  }


  public void modify( RicaActionReqDMO ricaActionReqDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify(RicaActionReqDMO)");

    thrower.ifParameterMissing( "RicaActionReqDMO", ricaActionReqDMO );

    thrower.ifParameterMissing( "RicaActionReqDMO.rarFileId",
      ricaActionReqDMO.getRarFileId());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarMsisdnNo",
    	      ricaActionReqDMO.getRarMsisdnNo());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarActionType",
    	      ricaActionReqDMO.getRarActionType());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarSubmitDate",
    	      ricaActionReqDMO.getRarSubmitDate());

    dao.update( ricaActionReqDMO );
  }


  public void modify( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    dao.updateCustom( new RicaActionReqDMO(  ),
      filterQueryArgs( filter, null ) );
  }


  public void delete( RicaActionReqDMO ricaActionReqDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( RicaActionReqDMO )" );

    thrower.ifParameterMissing( "RicaActionReqDMO", ricaActionReqDMO );

    thrower.ifParameterMissing( "RicaActionReqDMO.rarFileId",
      ricaActionReqDMO.getRarFileId());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarMsisdnNo",
      ricaActionReqDMO.getRarMsisdnNo());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarActionType",
      ricaActionReqDMO.getRarActionType());
    thrower.ifParameterMissing( "RicaActionReqDMO.rarSubmitDate",
      ricaActionReqDMO.getRarSubmitDate());

    dao.delete( ricaActionReqDMO );
  }


  public void delete( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    dao.delete( "PshParamServHdr", args.getFilterBy(  ), args );
  }


  public boolean exists( RicaActionReqDMO RicaActionReqDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( RicaActionReqDMO)" );

    return dao.exists( "PshParamServHdr", "filterByPrimaryKey",
      new DAOArgs( 4 ).arg( RicaActionReqDMO.getRarFileId()).arg(RicaActionReqDMO.getRarMsisdnNo())
      .arg(RicaActionReqDMO.getRarActionType()).arg(RicaActionReqDMO.getRarSubmitDate()));
  }


  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "exists( filter )" );

    return dao.exists( filterQueryArgs( filter, null ) );
  }


  public DTOList getList(DTOListState state,
    RicaActionReqDMO ricaActionReqDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, ricaActionReqDMO )" );

    return new DTOList(dao.getList(paramQueryArgs( ricaActionReqDMO)));
  }


  protected DAOParamQueryArgs paramQueryArgs(
    RicaActionReqDMO ricaActionReqDMO ) {
    logger.debug( "paramQueryArgs( ricaActionReqDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "RicaActionReq",
        14 * 2 );

    if ( ricaActionReqDMO != null ) {
      // primary key filters...
    	String rarFileId = ricaActionReqDMO.getRarFileId();
        if ( !DMO.isNull( rarFileId ) ) {
  	        queryArgs.andFilterBy( "RarFileId" )
  	                 .arg( rarFileId);
  	      }
        
        String rarMsisdnNo = ricaActionReqDMO.getRarMsisdnNo();
        if ( !DMO.isNull( rarMsisdnNo ) ) {
  	        queryArgs.andFilterBy( "RarMsisdnNo" )
  	                 .arg( rarMsisdnNo);
  	      }
        
        String rarActionType = ricaActionReqDMO.getRarActionType();
        if ( !DMO.isNull( rarActionType ) ) {
  	        queryArgs.andFilterBy( "RarActionType" )
  	                 .arg( rarActionType);
  	      }
        
        DateTime rpvDatetimeActioned = ricaActionReqDMO.getRarSubmitDate();
        if ( !DMO.isNull( rpvDatetimeActioned ) ) {
  	        queryArgs.andFilterBy( "RpvDatetimeActionedMatch" )
  	                 .arg( rpvDatetimeActioned);
  	      }   	
    	
      // define more filters...      
	      String rarEppixUserId = ricaActionReqDMO.getRarEppixUserId();
	      if ( !DMO.isNull( rarEppixUserId ) ) {
		        queryArgs.andFilterBy( "RarEppixUserId" )
		                 .arg( rarEppixUserId);
		      }
	      
	      String rarRicaAgentId = ricaActionReqDMO.getRarRicaAgentId();
	      if ( !DMO.isNull( rarRicaAgentId ) ) {
		        queryArgs.andFilterBy( "RarRicaAgentId" )
		                 .arg( rarRicaAgentId);
		      }
	      
	      String rarBillAcNo = ricaActionReqDMO.getRarBillAcNo();
	      if ( !DMO.isNull( rarBillAcNo ) ) {
		        queryArgs.andFilterBy( "RarBillAcNo" )
		                 .arg( rarBillAcNo);
		      }
	      
	      String rarSimNo = ricaActionReqDMO.getRarSimNo();
	      if ( !DMO.isNull( rarSimNo ) ) {
		        queryArgs.andFilterBy( "RarSimNo" )
		                 .arg( rarSimNo);
		      }
      
	      Integer rarSubscriberId = ricaActionReqDMO.getRarSubscriberId();
	      if ( !DMO.isNull( rarSubscriberId ) ) {
	        queryArgs.andFilterBy( "RarSubscriberId" )
	                 .arg( rarSubscriberId );
	      }
      
	      String rarStatus = ricaActionReqDMO.getRarStatus();
	      if ( !DMO.isNull( rarStatus ) ) {
		        queryArgs.andFilterBy( "RarStatus" )
		                 .arg( rarStatus);
		      }
	      
	      String rarComments = ricaActionReqDMO.getRarComments();
	      if ( !DMO.isNull( rarComments ) ) {
		        queryArgs.andFilterBy( "RarComments" )
		                 .arg( rarComments);
		      }
	      
	      String rarError = ricaActionReqDMO.getRarError();
	      if ( !DMO.isNull( rarError) ) {
		        queryArgs.andFilterBy( "RarError" )
		                 .arg( rarError);
		      }
      
      String rarTrickleDesc = ricaActionReqDMO.getRarTrickleDesc();
      if ( !DMO.isNull( rarTrickleDesc ) ) {
	        queryArgs.andFilterBy( "RarTrickleDesc" )
	                 .arg( rarTrickleDesc);
	      }
      
      DateTime rarProcessDate = ricaActionReqDMO.getRarProcessDate();
      if ( !DMO.isNull( rarProcessDate ) ) {
	        queryArgs.andFilterBy( "RarProcessDate" )
	                 .arg( rarProcessDate);
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


  protected DAOParamQueryArgs filterQueryArgs(
    QueryFilter filter,
    String      dmlName ) {
    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "RicaActionReq" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();

      switch ( part.getIndex(  ) ) {
        case RicaActionReqDMO.rarFileIdFilter:
          part.andFilterBy( queryArgs, "rarFileId", dao.wildcardForAnySequence(  ) );
          break;

    	case RicaActionReqDMO.rarEppixUserIdFilter:
    		part.andFilterBy( queryArgs, "rarEppixUserId", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarRicaAgentIdFilter:
    		part.andFilterBy( queryArgs, "rarRicaAgentId", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarBillAcNoFilter:
    		part.andFilterBy( queryArgs, "rarBillAcNo", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarMsisdnNoFilter:
    		part.andFilterBy( queryArgs, "rarMsisdnNo", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarSimNoFilter:
    		part.andFilterBy( queryArgs, "rarSimNo", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarSubscriberIdFilter:
    		part.andFilterBy( queryArgs, "rarSubscriberId", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarStatusFilter:
    		part.andFilterBy( queryArgs, "rarStatus", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarActionTypeFilter:
    		part.andFilterBy( queryArgs, "rarActionType", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarSubmitDateFilter:
    		part.andFilterBy( queryArgs, "rarSubmitDate", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarCommentsFilter:
    		part.andFilterBy( queryArgs, "rarComments", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarErrorFilter:
    		part.andFilterBy( queryArgs, "rarError", dao.wildcardForAnySequence(  ) );
    	break;

    	case RicaActionReqDMO.rarProcessDateFilter:
    		part.andFilterBy( queryArgs, "rarProcessDate", dao.wildcardForAnySequence(  ) );
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
  
  public DAOIterator iterateTrickleDescrarStatusInnerSelect( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );
    return dao.iterator("rarTrickleDescrarStatusInnerSelect", args);

  }	  

  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );

  }


  public RicaActionReqDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (RicaActionReqDMO) dao.get( args.getDMLName(  ),
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
