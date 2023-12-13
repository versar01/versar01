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
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class DpfDefPocFolderAbstractDACImpl extends DAC implements
		DpfDefPocFolderAbstractDAC {

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DpfDefPocFolderAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	public DpfDefPocFolderAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public DpfDefPocFolderDMO get(DpfDefPocFolderDMO dpfDefPocFolderDMO)
			throws EPPIXSeriousException {
		logger.debug("get( dpfDefPocFolderDMO )");

		thrower.ifParameterMissing("dpfDefPocFolderDMO", dpfDefPocFolderDMO);

		return (DpfDefPocFolderDMO) dao.get(dpfDefPocFolderDMO);
	}

	public void create(DpfDefPocFolderDMO dpfDefPocFolderDMO)
			throws EPPIXSeriousException {
		logger.debug("create( dpfDefPocFolderDMO )");
		thrower.ifParameterMissing("DpfDefPocFolderDMO", dpfDefPocFolderDMO);

		dao.insert(dpfDefPocFolderDMO);

	}

	  public void modify( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( ppfDefPocFolderDMO )" );

	    thrower.ifParameterMissing( "ppfDefPocFolderDMO", dpfDefPocFolderDMO );

	    thrower.ifParameterMissing( "DpfDefPocFolderDMO.pshId",
	    		dpfDefPocFolderDMO.getDpfFolderId(  ) );

	    dao.update( dpfDefPocFolderDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new DpfDefPocFolderDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( DpfDefPocFolderDMO )" );

	    thrower.ifParameterMissing( "DpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    thrower.ifParameterMissing( "DpfDefPocFolderDMO.pshId",
	    		dpfDefPocFolderDMO.getDpfFolderId(  ) );

	    dao.delete( dpfDefPocFolderDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "DpfDefPocFolder", args.getFilterBy(  ), args );
	  }


	  public boolean exists( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( DpfDefPocFolderDMO)" );

	    return dao.exists( "DpfDefPocFolder", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( dpfDefPocFolderDMO.getDpfFolderId(  ) ) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(
	    DTOListState       state,
	    DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, ppfDefPocFolderDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( dpfDefPocFolderDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    DpfDefPocFolderDMO dpfDefPocFolderDMO ) {
	    logger.debug( "paramQueryArgs( dpfDefPocFolderDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "dpfDefPocFolderDMO",
	        6 * 2 );

	    if ( dpfDefPocFolderDMO != null ) {
	      // primary key filters...
	      Integer dpfFolderId = dpfDefPocFolderDMO.getDpfFolderId(  );

	      if ( !DMO.isNull( dpfFolderId ) ) {
	        queryArgs.andFilterBy( "DpfFolderIdMatch" )
	                 .arg( dpfFolderId );
	      }

	      // define more filters...
	      String dpfEhId = dpfDefPocFolderDMO.getDpfEhId();

	      if ( !DMO.isNull( dpfEhId ) ) {
	        queryArgs.andFilterBy( "DpfEhIdMatch" )
	                 .arg( dpfEhId + dao.wildcardForAnySequence(  ) );
	      }

	      String dpfName = dpfDefPocFolderDMO.getDpfName();

	      if ( !DMO.isNull( dpfName ) ) {
	        queryArgs.andFilterBy( "DpfNameMatch" )
	                 .arg( dpfName + dao.wildcardForAnySequence(  ) );
	      }

	      String dpfStatus = dpfDefPocFolderDMO.getDpfStatus();

	      if ( !DMO.isNull( dpfStatus ) ) {
	        queryArgs.andFilterBy( "DpfStatusMatch" )
	                 .arg( dpfStatus + dao.wildcardForAnySequence(  ) );
	      }

	      String dpfProduct = dpfDefPocFolderDMO.getDpfProduct();

	      if ( !DMO.isNull( dpfProduct ) ) {
	        queryArgs.andFilterBy( "DpfProductMatch" )
	                 .arg( dpfProduct + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String dpfReverseBill = dpfDefPocFolderDMO.getDpfReverseBill();
	      if ( !DMO.isNull( dpfReverseBill ) ) {
		        queryArgs.andFilterBy( "DpfReverseBillMatch" )
		                 .arg( dpfReverseBill + dao.wildcardForAnySequence(  ) );
		      }
	      
	      String dpfSimNo = dpfDefPocFolderDMO.getDpfSimNo();
	      if ( !DMO.isNull( dpfSimNo ) ) {
		        queryArgs.andFilterBy( "DpfSimNoMatch" )
		                 .arg( dpfSimNo + dao.wildcardForAnySequence(  ) );
		      }
	      
	      Date dpfConnectDate = dpfDefPocFolderDMO.getDpfConnectDate();
	      if ( !DMO.isNull( dpfConnectDate ) ) {
		        queryArgs.andFilterBy( "DpfConnectDateMatch" )
		                 .arg( dpfConnectDate + dao.wildcardForAnySequence(  ) );
		      }
	      
	      Date dpfCreationDate = dpfDefPocFolderDMO.getDpfCreationDate();
	      if ( !DMO.isNull( dpfCreationDate ) ) {
		        queryArgs.andFilterBy( "DpfCreationDateMatch" )
		                 .arg( dpfCreationDate + dao.wildcardForAnySequence(  ) );
		      }
	      
	      String dpfN2nFolder = dpfDefPocFolderDMO.getDpfN2nFolder();
	      if ( !DMO.isNull( dpfN2nFolder ) ) {
		        queryArgs.andFilterBy( "DpfN2nFolderMatch" )
		                 .arg( dpfN2nFolder + dao.wildcardForAnySequence(  ) );
		      }
	      
	      String dpfMsisdnNo = dpfDefPocFolderDMO.getDpfMsisdnNo();
	      if ( !DMO.isNull( dpfMsisdnNo ) ) {
		        queryArgs.andFilterBy( "DpfMsisdnNoMatch" )
		                 .arg( dpfMsisdnNo + dao.wildcardForAnySequence(  ) );
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
	        ? "DpfDefPocFolder" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();
//	    for ( FilterPart part : parts ) {
	      switch ( part.getIndex(  ) ) {
	        case DpfDefPocFolderDMO.dpfFolderIdFilter:
	          part.andFilterBy( queryArgs, "DpfFolderId", dao.wildcardForAnySequence(  ) );
	          break;

	        case DpfDefPocFolderDMO.dpfConnectDateFilter:
	          part.andFilterBy( queryArgs, "DpfConnectDate",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case DpfDefPocFolderDMO.dpfCreationDateFilter:
	          part.andFilterBy( queryArgs, "DpfCreationDate",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case DpfDefPocFolderDMO.dpfEhIdFilter:
	          part.andFilterBy( queryArgs, "DpfEhId",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case DpfDefPocFolderDMO.dpfMsisdnNoFilter:
	          part.andFilterBy( queryArgs, "DpfMsisdnNo",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case DpfDefPocFolderDMO.dpfN2nFolderFilter:
	          part.andFilterBy( queryArgs, "DpfN2nFolder",
	            dao.wildcardForAnySequence(  ) );
	          break;
	          
	        case DpfDefPocFolderDMO.dpfNameFilter:
		          part.andFilterBy( queryArgs, "DpfName",
		            dao.wildcardForAnySequence(  ) );
		          break;
		          
	        case DpfDefPocFolderDMO.dpfProductFilter:
		          part.andFilterBy( queryArgs, "DpfProduct",
		            dao.wildcardForAnySequence(  ) );
		          break;
		          
	        case DpfDefPocFolderDMO.dpfReverseBillFilter:
		          part.andFilterBy( queryArgs, "DpfReverseBill",
		            dao.wildcardForAnySequence(  ) );
		          break;
		          
	        case DpfDefPocFolderDMO.dpfSimNoFilter:
		          part.andFilterBy( queryArgs, "DpfSimNo",
		            dao.wildcardForAnySequence(  ) );
		          break;
		          
	        case DpfDefPocFolderDMO.dpfStatusFilter:
		          part.andFilterBy( queryArgs, "DpfStatus",
		            dao.wildcardForAnySequence(  ) );
		          break;
	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

//	    return dao.iterator( DpfDefPocFolderDMO.class,
//	      filterQueryArgs( filter, null ) );
	    return null;
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return null;
	  }


	  public DpfDefPocFolderDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (DpfDefPocFolderDMO) dao.get( args.getDMLName(  ),
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