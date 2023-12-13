package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SeqMapN2NAbstractDACImpl extends DAC implements SeqMapN2NAbstractDAC{
	  /** Error handler/logger. */
	  static DAOThrower thrower = DAOThrower.getDAOThrower( SeqMapN2NAbstractDACImpl.class );

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  Logger logger = thrower.getLogger(  );

	  //~ Constructors ///////////////////////////////////////////////////////////

	  /**
	   * Creates a new AuxCustomersDACImpl object.
	   *
	   * @param dao Data Access Object.
	   * @param defaultLanguageCode the working language of the user, dictates
	   *        which language specific descriptions are retrieved.
	   */
	  public SeqMapN2NAbstractDACImpl(DAO dao) {
	    super( dao, thrower );
	  }

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /**
	   * Retrieves a AuxCustomers Data Model Object
	   *
	   * @return a populated AuxCustomers Data Model Object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public SeqMapN2NDMO get( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( SeqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );
	    return (SeqMapN2NDMO) dao.get( seqMapN2NDMO );
	  }

	  /**
	   * Creates the AuxCustomers object in the database.
	   *
	   * @param ApmApnPopMainDMO apmApnPopMainDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( seqMapN2NDMO )" );
	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    dao.insert( seqMapN2NDMO );
	  }

	  /**
	   * Locks and retrieves the AuxCustomers object from the database.
	   *
	   * @param aAuxCustomers AuxCustomers object
	   *
	   * @return a populated AuxCustomers object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public SeqMapN2NDMO lock( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException {
	    logger.debug( "lock( seqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    SeqMapN2NDMO lockedSeqMapN2NDMO = null;

	    //
	    // Lock the base table on its primary key.
	    //
	    /**
	     * TODO SJ This table does not have a PK
	     * FIXME
	     */
//	    lockedSeqMapN2NDMO = (SeqMapN2NDMO) dao.lock( "SeqMapN2N",
//	        "filterByPrimaryKey",
//	        new DAOArgs( 1 ).arg( seqMapN2NDMO.getApmId()));

	    return lockedSeqMapN2NDMO;
	  }

	  /**
	   * Modifies the AuxCustomers object in the database.
	   *
	   * @param ApmApnPopMainDMO AuxCustomers object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( seqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqProviderId",seqMapN2NDMO.getSeqProviderId());
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqN2ntransId",seqMapN2NDMO.getSeqN2ntransId());
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqNetwktransId",seqMapN2NDMO.getSeqNetwktransId());
	    
	    dao.update( seqMapN2NDMO );
	  }

	  /**
	  * Modifies the AuxCustomers object using the specified filter in the database.
	  *
	  * @param filter object
	  *
	  * @throws EPPIXSeriousException
	  * @throws EPPIXObjectExpiredException
	  * @throws EPPIXObjectNotFoundException
	  */
	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SeqMapN2NDMO(  ), filterQueryArgs( filter, null ) );
	  }

	  /**
	   * Deletes the AuxCustomers object from the database.
	   *
	   * @param ApmApnPopMainDMO AuxCustomers object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SeqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqProviderId",seqMapN2NDMO.getSeqProviderId());
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqN2ntransId",seqMapN2NDMO.getSeqN2ntransId());
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqNetwktransId",seqMapN2NDMO.getSeqNetwktransId());

	    dao.delete(seqMapN2NDMO);
	  }

	  /**
	   * Deletes the SeqMapN2NDMO object from the database.
	   *
	   * @param QueryFilterfilter object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "SeqMapN2N", args.getFilterBy(  ), args );
	  }

	  /**
	  * Return true if a AneApnNonEppix object exists.
	  *
	  * @param ApmApnPopMainDMO ApmApnPopMainDMO
	  *
	  * @return true if the AneApnNonEppix object exists.
	  *
	  * @throws EPPIXSeriousException
	  * TODO SJ This method may not return the
	  * correct value as this ID is not unique
	  * to the table;
	  * FIXME
	  * 
	  */
	  public boolean exists( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SeqMapN2NDMO)" );

	    /**
	     * FIX ME SJ: This requires a primary key. 
	     * No PK defined for this table
	     */
	    return dao.exists( "SeqMapN2N", "filterByPrimaryKey",
	      new DAOArgs( 3 ).arg( seqMapN2NDMO.getSeqProviderId())
	      .arg( seqMapN2NDMO.getSeqN2ntransId())
	      .arg( seqMapN2NDMO.getSeqNetwktransId()));
	  }

	  /**
	    * Return true if a AneApnNonEppix object exists.
	    *
	    * @param filter
	    *
	    * @return true if the AneApnNonEppix object exists.
	    *
	    * @throws EPPIXSeriousException
	    */
	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }

	  /**
	   * Constructs parameterised query arguments.
	   *
	   * @param $(dataObjectNameLowerCamel} ApmApnPopMainDMO object.
	   */
	  protected DAOParamQueryArgs paramQueryArgs( 
			  SeqMapN2NDMO seqMapN2NDMO ) {
	    logger.debug( "paramQueryArgs( SeqMapN2NDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SeqMapN2N",
	        5 * 2 );
 
	    if ( seqMapN2NDMO != null ) {
	      // primary key filters...
	      String seqProviderId = seqMapN2NDMO.getSeqProviderId();

	      if ( !DMO.isNull( seqProviderId ) ) {
	        queryArgs.andFilterBy( "SeqProviderIdMatch" )
	                 .arg( seqProviderId + dao.wildcardForAnySequence(  ) );
	      }

	      // define more filters...
	      String seqN2ntransId = seqMapN2NDMO.getSeqN2ntransId();

	      if ( !DMO.isNull( seqN2ntransId ) ) {
	        queryArgs.andFilterBy( "SeqN2ntransIdMatch" )
	                 .arg( seqN2ntransId + dao.wildcardForAnySequence());
	      }

	      String seqNetwktransId = seqMapN2NDMO.getSeqNetwktransId();

	      if ( !DMO.isNull( seqNetwktransId ) ) {
	        queryArgs.andFilterBy( "SeqNetwktransIdMatch" )
	                 .arg( seqNetwktransId);
	      }

	      String seqStatus = seqMapN2NDMO.getSeqStatus();

	      if ( !DMO.isNull( seqStatus ) ) {
	        queryArgs.andFilterBy( "seqStatusMatch" )
	                 .arg( seqStatus + dao.wildcardForAnySequence(  ) );
	      }
	      
	      DateTime seqDatetime = seqMapN2NDMO.getSeqDatetime();

	      if ( !DMO.isNull( seqDatetime ) ) {
	        queryArgs.andFilterBy( "seqDatetimeMatch" )
	                 .arg( seqDatetime + dao.wildcardForAnySequence(  ) );
	      }

	    } else {
	      // include all default languageCode filters where appropriate...
	    }

	    return queryArgs;
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   * @param dmlName DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  protected DAOParamQueryArgs filterQueryArgs( 
	    QueryFilter filter,
	    String      dmlName ) {
	    List parts = filter.getParts(  );
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
	        ? "SeqMapN2N" : dmlName, parts.size(  ) );

	    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
	      FilterPart part = (FilterPart) i.next();
	      
	      switch ( part.getIndex(  ) ) {
	        case SeqMapN2NDMO.seqProviderIdFilter:
	          part.andFilterBy( queryArgs, "seqProviderId",
	            dao.wildcardForAnySequence());
	          break;

	        case SeqMapN2NDMO.seqN2ntransIdFilter:
	          part.andFilterBy( queryArgs, "seqN2ntransId",
	            dao.wildcardForAnySequence());
	          break;

	        case SeqMapN2NDMO.seqNetwktransIdFilter:
	          part.andFilterBy( queryArgs, "seqNetwktransId",
	        	dao.wildcardForAnySequence());
	          break;

	        case SeqMapN2NDMO.seqStatusFilter:
	          part.andFilterBy( queryArgs, "seqStatus",
	            dao.wildcardForAnySequence());
	          break;
	          
	        case SeqMapN2NDMO.seqDatetimeFilter:
		          part.andFilterBy( queryArgs, "seqDatetime");
		          break;
	      }
	    }
	    return queryArgs;
	  }

	  /**
	  * Provides a DAOIterator to iterate over the list of AneApnNonEppix records based
	  * on the passed in Filter.
	  *
	  * @param filter
	  * @return
	  * @throws EPPIXSeriousException
	  */
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator( 
	      filterQueryArgs( filter, null ) );
	  }

	  /**
	  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of AneApnNonEppix records based
	  * on the passed in Filter.
	  *
	  * @param filter
	  * @return
	  * @throws EPPIXSeriousException
	  */
	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator( 
	      filterQueryArgs( filter, null ));
	  }

	  /**
	   * Retrieves the AneApnNonEppix Data Model Object from a possible list.
	   *
	   * @param filter
	   * @return
	   * @throws EPPIXSeriousException
	   */
	  public SeqMapN2NDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (SeqMapN2NDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }

	  /**
	   * Counts (COUNT(*)) the number of rows for the specified filter.
	   *
	   * @param filter
	   * @return the count of rows.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }

	public DTOList getList(DTOListState state, SeqMapN2NDMO seqMapN2NDMO) throws EPPIXSeriousException {
		logger.debug( "getList( state, seqMapN2NDMO )" );
		return new DTOList(dao.getList(paramQueryArgs(seqMapN2NDMO)));
	}

	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );
	    return new DTOList(dao.getList(filterQueryArgs( filter, null)));
	}
}
