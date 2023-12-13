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

public class FntNetTransPendAbstractDACImpl extends DAC implements
		FntNetTransPendAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PshParamServHdrAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public FntNetTransPendAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public FntNetTransPendDMO get(FntNetTransPendDMO fntNetTransendDMO)
			throws EPPIXSeriousException {
		logger.debug("get( fntNetTransendDMO )");

		thrower.ifParameterMissing("FntNetTransendDMO", fntNetTransendDMO);

		return (FntNetTransPendDMO) dao.get(fntNetTransendDMO);
	}

	public void create(FntNetTransPendDMO fntNettranspendDMO)
			throws EPPIXSeriousException {
		logger.debug("create( fntNettranspendDMO )");
		thrower.ifParameterMissing("FntNetTransendDMO", fntNettranspendDMO);

		dao.insert(fntNettranspendDMO);

	}


	  public void modify( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( fntNetTransPendDMO )" );

	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    thrower.ifParameterMissing( "FntNetTransPendDMO.pshId",
	      fntNetTransPendDMO.getFntSerialId(  ) );

	    dao.update( fntNetTransPendDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new FntNetTransPendDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( FntNetTransPendDMO )" );

	    thrower.ifParameterMissing( "FntNetTransPendDMO", fntNetTransPendDMO );

	    thrower.ifParameterMissing( "FntNetTransPendDMO.pshId",
	      fntNetTransPendDMO.getFntSerialId(  ) );

	    dao.delete( fntNetTransPendDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "PshParamServHdr", args.getFilterBy(  ), args );
	  }


	  public boolean exists( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( FntNetTransPendDMO)" );

	    return dao.exists( "PshParamServHdr", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( fntNetTransPendDMO.getFntSerialId(  ) ) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(
	    DTOListState       state,
	    FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, fntNetTransPendDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( fntNetTransPendDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
			  FntNetTransPendDMO fntNetTransPendDMO ) {
	    logger.debug( "paramQueryArgs( fntNetTransPendDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PshParamServHdr",
	        6 * 2 );

	    if ( fntNetTransPendDMO != null ) {
	      // primary key filters...
	      Integer fntSerialId = fntNetTransPendDMO.getFntSerialId(  );

	      if ( !DMO.isNull( fntSerialId ) ) {
	        queryArgs.andFilterBy( "FntSerialIdMatch" )
	                 .arg( fntSerialId + dao.wildcardForAnySequence(  ) );
	      }
	      
	      // define more filters...
	      String fntCommand = fntNetTransPendDMO.getFntCommand();

	      if ( !DMO.isNull( fntCommand ) ) {
	        queryArgs.andFilterBy( "FntCommandMatch" )
	                 .arg( fntCommand + dao.wildcardForAnySequence(  ) );
	      }

	      String fntNewValue = fntNetTransPendDMO.getFntNewValue();

	      if ( !DMO.isNull( fntNewValue ) ) {
	        queryArgs.andFilterBy( "FntNewValueMatch" )
	                 .arg( fntNewValue + dao.wildcardForAnySequence(  ) );
	      }

	      String fntOldValue = fntNetTransPendDMO.getFntOldValue();

	      if ( !DMO.isNull( fntOldValue ) ) {
	        queryArgs.andFilterBy( "FntOldValueMatch" )
	                 .arg( fntOldValue + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String fntServiceCode = fntNetTransPendDMO.getFntServiceCode();

	      if ( !DMO.isNull( fntServiceCode ) ) {
	        queryArgs.andFilterBy( "FntServiceCodeMatch" )
	                 .arg( fntServiceCode + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String fntStatus = fntNetTransPendDMO.getFntStatus();

	      if ( !DMO.isNull( fntStatus ) ) {
	        queryArgs.andFilterBy( "FntStatusMatch" )
	                 .arg( fntStatus + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String fntTranType = fntNetTransPendDMO.getFntTranType();

	      if ( !DMO.isNull( fntTranType ) ) {
	        queryArgs.andFilterBy( "FntTranTypeMatch" )
	                 .arg( fntTranType + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Integer fntSendSeq = fntNetTransPendDMO.getFntSendSeq();

	      if ( !DMO.isNull( fntSendSeq ) ) {
	        queryArgs.andFilterBy( "FntSendSeqMatch" )
	                 .arg( fntSendSeq + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Integer fntSubscriberId = fntNetTransPendDMO.getFntSubscriberId();

	      if ( !DMO.isNull( fntSubscriberId ) ) {
	        queryArgs.andFilterBy( "FntSubscriberIdMatch" )
	                 .arg( fntSubscriberId + dao.wildcardForAnySequence(  ) );
	      }
	      
	      DateTime fntTimestamp = fntNetTransPendDMO.getFntTimestamp();

	      if ( !DMO.isNull( fntTimestamp ) ) {
	        queryArgs.andFilterBy( "FntTimestampMatch" )
	                 .arg( fntTimestamp + dao.wildcardForAnySequence(  ) );
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
	        ? "PshParamServHdr" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();
//	    for ( FilterPart part : parts ) {
	      switch ( part.getIndex(  ) ) {
	        case FntNetTransPendDMO.fntSerialIdFilter:
	          part.andFilterBy( queryArgs, "FntSerialId", dao.wildcardForAnySequence(  ) );

	          break;

	        case FntNetTransPendDMO.fntCommandFilter:
	          part.andFilterBy( queryArgs, "FntCommandCode",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case FntNetTransPendDMO.fntNewValueFilter:
	          part.andFilterBy( queryArgs, "FntNewValue",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case FntNetTransPendDMO.fntOldValueFilter:
	          part.andFilterBy( queryArgs, "FntOldValue",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case FntNetTransPendDMO.fntSendSeqFilter:
	          part.andFilterBy( queryArgs, "FntSendSeq",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case FntNetTransPendDMO.fntServiceCodeFilter:
	          part.andFilterBy( queryArgs, "FntServiceCode",
	            dao.wildcardForAnySequence(  ) );

	          break;
	          
	        case FntNetTransPendDMO.fntStatusFilter:
		          part.andFilterBy( queryArgs, "FntStatus",
		            dao.wildcardForAnySequence(  ) );

		          break;

		        case FntNetTransPendDMO.fntSubscriberIdFilter:
		          part.andFilterBy( queryArgs, "FntSubscriberId",
		            dao.wildcardForAnySequence(  ) );

		          break;

		        case FntNetTransPendDMO.fntTimestampFilter:
		          part.andFilterBy( queryArgs, "FntTimestamp",
		            dao.wildcardForAnySequence(  ) );

		          break;

		        case FntNetTransPendDMO.fntTranTypeFilter:
		          part.andFilterBy( queryArgs, "FntTranType",
		            dao.wildcardForAnySequence(  ) );

		          break;
	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

//	    return dao.iterator( FntNetTransPendDMO.class,
//	      filterQueryArgs( filter, null ) );
	    return null;
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return null;
	  }


	  public FntNetTransPendDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (FntNetTransPendDMO) dao.get( args.getDMLName(  ),
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