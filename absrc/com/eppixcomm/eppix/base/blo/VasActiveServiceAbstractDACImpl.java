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
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class VasActiveServiceAbstractDACImpl extends DAC implements
		VasActiveServiceAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(VasActiveServiceAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public VasActiveServiceAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public VasActiveServiceDMO get(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXSeriousException {
		logger.debug("get( VasActiveServiceDMO )");

		thrower.ifParameterMissing("VasActiveServiceDMO", vasActiveServiceDMO);

		return (VasActiveServiceDMO) dao.get(vasActiveServiceDMO);
	}

	public void create(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXSeriousException {
		logger.debug("create( VasActiveServiceDMO )");
		thrower.ifParameterMissing("VasActiveServiceDMO", vasActiveServiceDMO);

		dao.insert(vasActiveServiceDMO);
	}

	  public VasActiveServiceDMO lock( VasActiveServiceDMO vasActiveServiceDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException {
	    logger.debug( "lock( VasActiveServiceDMO )" );

	    thrower.ifParameterMissing( "VasActiveServiceDMO", vasActiveServiceDMO );

	    VasActiveServiceDMO lockedVasActiveServiceDMO = null;

	    lockedVasActiveServiceDMO = (VasActiveServiceDMO) dao.lock( "VasActiveService",
	        "filterByPrimaryKey",
	        new DAOArgs( 3 ).arg( vasActiveServiceDMO.getVasSubscriberId()).
	        arg(vasActiveServiceDMO.getVasServiceCode()).
	        arg(vasActiveServiceDMO.getVasInternTariff()) );

	    return lockedVasActiveServiceDMO;
	  }


	  public void modify( VasActiveServiceDMO vasActiveServiceDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( VasActiveServiceDMO )" );

	    thrower.ifParameterMissing( "VasActiveServiceDMO", vasActiveServiceDMO );

	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	      vasActiveServiceDMO.getVasSubscriberId() );
	    
	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	  	      vasActiveServiceDMO.getVasServiceCode() );
	    
	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	  	      vasActiveServiceDMO.getVasInternTariff() );

	    dao.update( vasActiveServiceDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new VasActiveServiceDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( VasActiveServiceDMO vasActiveServiceDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( VasActiveServiceDMO )" );

	    thrower.ifParameterMissing( "VasActiveServiceDMO", vasActiveServiceDMO );

	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	  	      vasActiveServiceDMO.getVasSubscriberId() );
	  	    
	  	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	  	  	      vasActiveServiceDMO.getVasServiceCode() );
	  	    
	  	    thrower.ifParameterMissing( "vasActiveServiceDMO.vasSubscriberId",
	  	  	      vasActiveServiceDMO.getVasInternTariff() );

	    dao.delete( vasActiveServiceDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "VasActiveService", args.getFilterBy(  ), args );
	  }


	  public boolean exists( VasActiveServiceDMO vasActiveServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( VasActiveServiceDMO)" );

	    return dao.exists( "VasActiveService", "filterByPrimaryKey",
	    		new DAOArgs( 3 ).arg( vasActiveServiceDMO.getVasSubscriberId()).
		        arg(vasActiveServiceDMO.getVasServiceCode()).
		        arg(vasActiveServiceDMO.getVasInternTariff()) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(
	    DTOListState       state,
	    VasActiveServiceDMO vasActiveServiceDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, vasActiveServiceDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( vasActiveServiceDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    VasActiveServiceDMO vasActiveServiceDMO ) {
	    logger.debug( "paramQueryArgs( vasActiveServiceDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VasActiveService",
	        6 * 2 );

	    if ( vasActiveServiceDMO != null ) {
	      // primary key filters...
	      Integer vasSubscriberId = vasActiveServiceDMO.getVasSubscriberId();

	      if ( !DMO.isNull( vasSubscriberId ) ) {
	        queryArgs.andFilterBy( "VasSubscriberId" )
	                 .arg( vasSubscriberId );
	      }

	      // define more filters...
	      String vasInternTariff = vasActiveServiceDMO.getVasInternTariff();

	      if ( !DMO.isNull( vasInternTariff ) ) {
	        queryArgs.andFilterBy( "VasInternTariffMatch" )
	                 .arg( vasInternTariff + dao.wildcardForAnySequence(  ) );
	      }

	      String vasMultiCharge = vasActiveServiceDMO.getVasMultiCharge();

	      if ( !DMO.isNull( vasMultiCharge ) ) {
	        queryArgs.andFilterBy( "VasMultiChargeMatch" )
	                 .arg( vasMultiCharge + dao.wildcardForAnySequence(  ) );
	      }

	      String vasServiceCode = vasActiveServiceDMO.getVasServiceCode();

	      if ( !DMO.isNull( vasServiceCode ) ) {
	        queryArgs.andFilterBy( "VasServiceCodeMatch" )
	                 .arg( vasServiceCode + dao.wildcardForAnySequence(  ) );
	      }

	      String vasServiceType = vasActiveServiceDMO.getVasServiceType();

	      if ( !DMO.isNull( vasServiceType ) ) {
	        queryArgs.andFilterBy( "VasServiceTypeMatch" )
	                 .arg( vasServiceType + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String vasSubCharge1 = vasActiveServiceDMO.getVasSubCharge1();

	      if ( !DMO.isNull( vasSubCharge1 ) ) {
	        queryArgs.andFilterBy( "VasSubCharge1Match" )
	                 .arg( vasSubCharge1 + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String vasSubCharge2 = vasActiveServiceDMO.getVasSubCharge2();

	      if ( !DMO.isNull( vasSubCharge2 ) ) {
	        queryArgs.andFilterBy( "VasSubCharge2Match" )
	                 .arg( vasSubCharge2 + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String vasSubCharge3 = vasActiveServiceDMO.getVasSubCharge3();

	      if ( !DMO.isNull( vasSubCharge3 ) ) {
	        queryArgs.andFilterBy( "VasSubCharge3Match" )
	                 .arg( vasSubCharge3 + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Date vasActDate = vasActiveServiceDMO.getVasActDate();

	      if ( !DMO.isNull( vasActDate ) ) {
	        queryArgs.andFilterBy( "VasActDateMatch" )
	                 .arg( vasActDate + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Date vasDeactDate = vasActiveServiceDMO.getVasDeactDate();

	      if ( !DMO.isNull( vasDeactDate ) ) {
	        queryArgs.andFilterBy( "VasDeactDateMatch" )
	                 .arg( vasDeactDate + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Short vasTwinbillNo = vasActiveServiceDMO.getVasTwinbillNo();

	      if ( !DMO.isNull( vasTwinbillNo ) ) {
	        queryArgs.andFilterBy( "VasTwinbillNoMatch" )
	                 .arg( vasTwinbillNo + dao.wildcardForAnySequence(  ) );
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
	        ? "VasActiveService" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();
//	    for ( FilterPart part : parts ) {
	      switch ( part.getIndex(  ) ) {
	        case VasActiveServiceDMO.vasActDateFilter:
	          part.andFilterBy( queryArgs, "VasActDate", dao.wildcardForAnySequence(  ) );

	          break;

	        case VasActiveServiceDMO.vasDeactDateFilter:
	          part.andFilterBy( queryArgs, "VasDeactDate",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case VasActiveServiceDMO.vasInternTariffFilter:
	          part.andFilterBy( queryArgs, "VasInternTariff",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case VasActiveServiceDMO.vasMultiChargeFilter:
	          part.andFilterBy( queryArgs, "VasMultiCharge",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case VasActiveServiceDMO.vasServiceCodeFilter:
	          part.andFilterBy( queryArgs, "VasServiceCode",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case VasActiveServiceDMO.vasServiceTypeFilter:
	          part.andFilterBy( queryArgs, "VasServiceType",
	            dao.wildcardForAnySequence(  ) );

	          break;
	          
	        case VasActiveServiceDMO.vasSubCharge1Filter:
		          part.andFilterBy( queryArgs, "VasSubCharge1",
		            dao.wildcardForAnySequence(  ) );

		          break;
		          
	        case VasActiveServiceDMO.vasSubCharge2Filter:
		          part.andFilterBy( queryArgs, "VasSubCharge2",
		            dao.wildcardForAnySequence(  ) );

		          break;
		          
	        case VasActiveServiceDMO.vasSubCharge3Filter:
		          part.andFilterBy( queryArgs, "VasSubCharge3",
		            dao.wildcardForAnySequence(  ) );

		          break;
		          
	        case VasActiveServiceDMO.vasSubscriberIdFilter:
		          part.andFilterBy( queryArgs, "VasSubscriberId",
		            dao.wildcardForAnySequence(  ) );

		          break;
		          
	        case VasActiveServiceDMO.vasTwinbillNoFilter:
		          part.andFilterBy( queryArgs, "VasTwinbillNo",
		            dao.wildcardForAnySequence(  ) );

		          break;
	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ));

	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator( 
	    	      filterQueryArgs( filter, null ) );
	  }


	  public VasActiveServiceDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (VasActiveServiceDMO) dao.get( args.getDMLName(  ),
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