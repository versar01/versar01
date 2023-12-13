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
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SdSimDeactivateAbstractDACImpl extends DAC implements
		SdSimDeactivateAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SdSimDeactivateAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public SdSimDeactivateAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

//	public SdSimDeactivateDMO get(SdSimDeactivateDMO sdsImDeactivateDMO)
//			throws EPPIXSeriousException {
//		logger.debug("get( SdSimDeactivateDMO )");
//
//		thrower.ifParameterMissing("SdSimDeactivateDMO", sdsImDeactivateDMO);
//
//		return (SdSimDeactivateDMO) dao.get(sdsImDeactivateDMO);
//	}

	public void create(SdSimDeactivateDMO sdsImDeactivateDMO)
			throws EPPIXSeriousException {
		logger.debug("create( SdSimDeactivateDMO )");
		thrower.ifParameterMissing("SdSimDeactivateDMO", sdsImDeactivateDMO);

		dao.insert(sdsImDeactivateDMO);
		
	}


	  public void modify( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( sdSimDeactivateDMO )" );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );

	    dao.update( sdSimDeactivateDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SdSimDeactivateDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SdSimDeactivateDMO )" );

	    thrower.ifParameterMissing( "SdSimDeactivateDMO", sdSimDeactivateDMO );

	    dao.delete( sdSimDeactivateDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "SdSimDeactivate", args.getFilterBy(  ), args );
	  }


	  public boolean exists( SdSimDeactivateDMO SdSimDeactivateDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SdSimDeactivateDMO)" );

	    return dao.exists( "SdSimDeactivate", "filterByPrimaryKey",
	      new DAOArgs( 2).arg( SdSimDeactivateDMO.getSdSubscriberId()).arg(SdSimDeactivateDMO.getSdSimNo()) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(
	    DTOListState       state,
	    SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, sdSimDeactivateDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( sdSimDeactivateDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    SdSimDeactivateDMO sdSimDeactivateDMO ) {
	    logger.debug( "paramQueryArgs( sdSimDeactivateDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SdSimDeactivate",
	        6 * 2 );

	    if ( sdSimDeactivateDMO != null ) {

	    // define more filters...
	      String sdDisconCharge1 = sdSimDeactivateDMO.getSdDisconCharge1();

	      if ( !DMO.isNull( sdDisconCharge1 ) ) {
	        queryArgs.andFilterBy( "SdDisconCharge1Match" )
	                 .arg( sdDisconCharge1 + dao.wildcardForAnySequence(  ) );
	      }

	      String sdDisconCharge2 = sdSimDeactivateDMO.getSdDisconCharge2();

	      if ( !DMO.isNull( sdDisconCharge2 ) ) {
	        queryArgs.andFilterBy( "SdDisconCharge2Match" )
	                 .arg( sdDisconCharge2 + dao.wildcardForAnySequence(  ) );
	      }

	      String sdDisconCharge3 = sdSimDeactivateDMO.getSdDisconCharge3();

	      if ( !DMO.isNull( sdDisconCharge3 ) ) {
	        queryArgs.andFilterBy( "SdDisconCharge3Match" )
	                 .arg( sdDisconCharge3 + dao.wildcardForAnySequence(  ) );
	      }

	      String sdDisconCharge4 = sdSimDeactivateDMO.getSdDisconCharge4();

	      if ( !DMO.isNull( sdDisconCharge4 ) ) {
	        queryArgs.andFilterBy( "SdDisconCharge4Match" )
	                 .arg( sdDisconCharge4 + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdDisconCharge5 = sdSimDeactivateDMO.getSdDisconCharge5();

	      if ( !DMO.isNull( sdDisconCharge5 ) ) {
	        queryArgs.andFilterBy( "SdDisconCharge5Match" )
	                 .arg( sdDisconCharge5 + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdElCommand = sdSimDeactivateDMO.getSdElCommand();

	      if ( !DMO.isNull( sdElCommand ) ) {
	        queryArgs.andFilterBy( "SdElCommandMatch" )
	                 .arg( sdElCommand + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdErrorComment = sdSimDeactivateDMO.getSdErrorComment();

	      if ( !DMO.isNull( sdErrorComment ) ) {
	        queryArgs.andFilterBy( "SdErrorCommentMatch" )
	                 .arg( sdErrorComment + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdHandsetNo = sdSimDeactivateDMO.getSdHandsetNo();

	      if ( !DMO.isNull( sdHandsetNo ) ) {
	        queryArgs.andFilterBy( "SdHandsetNoMatch" )
	                 .arg( sdHandsetNo + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdLetterType = sdSimDeactivateDMO.getSdLetterType();

	      if ( !DMO.isNull( sdLetterType ) ) {
	        queryArgs.andFilterBy( "SdLetterTypeMatch" )
	                 .arg( sdLetterType + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdReason = sdSimDeactivateDMO.getSdReason();

	      if ( !DMO.isNull( sdReason ) ) {
	        queryArgs.andFilterBy( "SdReasonMatch" )
	                 .arg( sdReason + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdSimNo = sdSimDeactivateDMO.getSdSimNo();

	      if ( !DMO.isNull( sdSimNo ) ) {
	        queryArgs.andFilterBy( "SdSimNoMatch" )
	                 .arg( sdSimNo + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdStatCode = sdSimDeactivateDMO.getSdStatCode();

	      if ( !DMO.isNull( sdStatCode ) ) {
	        queryArgs.andFilterBy( "SdStatCodeMatch" )
	                 .arg( sdStatCode + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String sdTransStatus = sdSimDeactivateDMO.getSdTransStatus();

	      if ( !DMO.isNull( sdTransStatus ) ) {
	        queryArgs.andFilterBy( "SdTransStatusMatch" )
	                 .arg( sdTransStatus + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Date sdDconnectDate = sdSimDeactivateDMO.getSdDconnectDate();

	      if ( !DMO.isNull( sdDconnectDate ) ) {
	        queryArgs.andFilterBy( "SdDconnectDateMatch" )
	                 .arg( sdDconnectDate + dao.wildcardForAnySequence(  ) );
	      }
	      
	      DateTime sdEppixStamp = sdSimDeactivateDMO.getSdEppixStamp();

	      if ( !DMO.isNull( sdEppixStamp ) ) {
	        queryArgs.andFilterBy( "SdEppixStampMatch" )
	                 .arg( sdEppixStamp + dao.wildcardForAnySequence(  ) );
	      }
	      
	      DateTime sdN2nStamp = sdSimDeactivateDMO.getSdN2nStamp();

	      if ( !DMO.isNull( sdN2nStamp ) ) {
	        queryArgs.andFilterBy( "SdN2nStampMatch" )
	                 .arg( sdN2nStamp + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Date sdProrataToDate = sdSimDeactivateDMO.getSdProrataToDate();

	      if ( !DMO.isNull( sdProrataToDate ) ) {
	        queryArgs.andFilterBy( "SdProrataToDateMatch" )
	                 .arg( sdProrataToDate + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Integer sdSubscriberId = sdSimDeactivateDMO.getSdSubscriberId();

	      if ( !DMO.isNull( sdSubscriberId ) ) {
	        queryArgs.andFilterBy( "SdSubscriberIdMatch" )
	                 .arg( sdSubscriberId + dao.wildcardForAnySequence(  ) );
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
	        ? "SdSimDeactivate" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();
//	    for ( FilterPart part : parts ) {
	      switch ( part.getIndex(  ) ) {
	        case SdSimDeactivateDMO.sdDconnectDateFilter:
	          part.andFilterBy( queryArgs, "SdDconnectDate", dao.wildcardForAnySequence(  ) );

	          break;

	        case SdSimDeactivateDMO.sdDisconCharge1Filter:
	          part.andFilterBy( queryArgs, "SdDisconCharge1",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case SdSimDeactivateDMO.sdDisconCharge2Filter:
	          part.andFilterBy( queryArgs, "SdDisconCharge2",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case SdSimDeactivateDMO.sdDisconCharge3Filter:
	          part.andFilterBy( queryArgs, "SdDisconCharge3",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case SdSimDeactivateDMO.sdDisconCharge4Filter:
	          part.andFilterBy( queryArgs, "SdDisconCharge4",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case SdSimDeactivateDMO.sdDisconCharge5Filter:
	          part.andFilterBy( queryArgs, "SdDisconCharge5",
	            dao.wildcardForAnySequence(  ) );

	          break;
	          
	        case SdSimDeactivateDMO.sdElCommandFilter:
		          part.andFilterBy( queryArgs, "SdElCommand",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdEppixStampFilter:
		          part.andFilterBy( queryArgs, "SdEppixStamp",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdErrorCommentFilter:
		          part.andFilterBy( queryArgs, "SdErrorComment",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdHandsetNoFilter:
		          part.andFilterBy( queryArgs, "SdHandsetNo",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdLetterTypeFilter:
		          part.andFilterBy( queryArgs, "SdLetterType",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdN2nStampFilter:
		          part.andFilterBy( queryArgs, "SdN2nStamp",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdProrataToDateFilter:
		          part.andFilterBy( queryArgs, "SdProrataToDate",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdReasonFilter:
		          part.andFilterBy( queryArgs, "SdReason",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdSimNoFilter:
		          part.andFilterBy( queryArgs, "SdSimNo",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdStatCodeFilter:
		          part.andFilterBy( queryArgs, "SdStatCode",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdSubscriberIdFilter:
		          part.andFilterBy( queryArgs, "SdSubscriberId",
		            dao.wildcardForAnySequence(  ) );

		          break;
	        case SdSimDeactivateDMO.sdTransStatusFilter:
		          part.andFilterBy( queryArgs, "SdTransStatus",
		            dao.wildcardForAnySequence(  ) );

		          break;
	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

//	    return dao.iterator( SdSimDeactivateDMO.class,
//	      filterQueryArgs( filter, null ) );
	    throw new EPPIXSeriousException("Method not implemented");
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    throw new EPPIXSeriousException("Method not implemented");
	  }


	  public SdSimDeactivateDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (SdSimDeactivateDMO) dao.get( args.getDMLName(  ),
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