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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class PfsPocFldrSubsAbstractDACImpl extends DAC implements
		PfsPocFldrSubsAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(PshParamServHdrAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public PfsPocFldrSubsAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public PfsPocFldrSubsDMO get(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXSeriousException {
		logger.debug("get( PfsPocFldrSubsDMO )");

		thrower.ifParameterMissing("PfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		return (PfsPocFldrSubsDMO) dao.get(pfsPocFldrSubsDMO);
	}

	public void create(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXSeriousException {
		logger.debug("create( pfsPocFldrSubsDMO )");
		thrower.ifParameterMissing("PfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		dao.insert(pfsPocFldrSubsDMO);
	}


	  public void modify( PfsPocFldrSubsDMO pfsPocFldrSubsDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( pfsPocFldrSubsDMO )" );

	    thrower.ifParameterMissing( "pfsPocFldrSubsDMO", pfsPocFldrSubsDMO );

	    thrower.ifParameterMissing( "PfsPocFldrSubsDMO.pshId",
	      pfsPocFldrSubsDMO.getPfsSubscriberId() );

	    dao.update( pfsPocFldrSubsDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new PfsPocFldrSubsDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( PfsPocFldrSubsDMO pfsPocFldrSubsDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( PfsPocFldrSubsDMO )" );

	    thrower.ifParameterMissing( "PfsPocFldrSubsDMO", pfsPocFldrSubsDMO );

	    thrower.ifParameterMissing( "PfsPocFldrSubsDMO.getPfsSubscriberId()",
	      pfsPocFldrSubsDMO.getPfsSubscriberId() );

	    dao.delete( pfsPocFldrSubsDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "PfsPocFldrSubs", args.getFilterBy(  ), args );
	  }


	  public boolean exists( PfsPocFldrSubsDMO PfsPocFldrSubsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( PfsPocFldrSubsDMO)" );

	    return dao.exists( "PfsPocFldrSubs", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( PfsPocFldrSubsDMO.getPfsSubscriberId()) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(
	    DTOListState       state,
	    PfsPocFldrSubsDMO pfsPocFldrSubsDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, pfsPocFldrSubsDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( pfsPocFldrSubsDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    PfsPocFldrSubsDMO pfsPocFldrSubsDMO ) {
	    logger.debug( "paramQueryArgs( pfsPocFldrSubsDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PshParamServHdr",
	        6 * 2 );

	    if ( pfsPocFldrSubsDMO != null ) {
	      // primary key filters...
	      Integer pfsSubscriberId = pfsPocFldrSubsDMO.getPfsSubscriberId();

	      if ( !DMO.isNull( pfsSubscriberId ) ) {
	        queryArgs.andFilterBy( "PfsSubscriberIdMatch" )
	                 .arg( pfsSubscriberId );
	      }

	      // define more filters...
	      Integer pfsFolderId = pfsPocFldrSubsDMO.getPfsFolderId();

	      if ( !DMO.isNull( pfsFolderId ) ) {
	        queryArgs.andFilterBy( "PfsFolderIdMatch" )
	                 .arg( pfsFolderId + dao.wildcardForAnySequence(  ) );
	      }

	      String pfsStatus = pfsPocFldrSubsDMO.getPfsStatus();

	      if ( !DMO.isNull( pfsStatus ) ) {
	        queryArgs.andFilterBy( "PfsStatusMatch" )
	                 .arg( pfsStatus + dao.wildcardForAnySequence(  ) );
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
	        case PfsPocFldrSubsDMO.pfsSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "PfsSubscriberId", dao.wildcardForAnySequence(  ) );

	          break;

	        case PfsPocFldrSubsDMO.pfsFolderIdFilter:
	          part.andFilterBy( queryArgs, "PfsFolderId",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case PfsPocFldrSubsDMO.pfsStatusFilter:
	          part.andFilterBy( queryArgs, "PfsStatus",
	            dao.wildcardForAnySequence(  ) );

	          break;
	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

//	    return dao.iterator( PfsPocFldrSubsDMO.class,
//	      filterQueryArgs( filter, null ) );
	    return null;
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return null;
	  }


	  public PfsPocFldrSubsDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (PfsPocFldrSubsDMO) dao.get( args.getDMLName(  ),
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