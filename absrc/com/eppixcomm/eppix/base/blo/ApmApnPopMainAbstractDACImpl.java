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

public class ApmApnPopMainAbstractDACImpl extends DAC implements ApmApnPopMainAbstractDAC{

	  /** Error handler/logger. */
	  static DAOThrower thrower = DAOThrower.getDAOThrower( ApmApnPopMainAbstractDACImpl.class );

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
	  public ApmApnPopMainAbstractDACImpl( 
	        DAO         dao ) {
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
	  public ApmApnPopMainDMO get( ApmApnPopMainDMO apmApnPopMainDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( ApmApnPopMainDMO )" );

	    thrower.ifParameterMissing( "ApmApnPopMainDMO", apmApnPopMainDMO );

	    return (ApmApnPopMainDMO) dao.get( apmApnPopMainDMO );
	  }

	  /**
	   * Creates the AuxCustomers object in the database.
	   *
	   * @param ApmApnPopMainDMO apmApnPopMainDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( ApmApnPopMainDMO apmApnPopMainDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( apmApnPopMainDMO )" );
	    thrower.ifParameterMissing( "ApmApnPopMainDMO", apmApnPopMainDMO );

	    dao.insert( apmApnPopMainDMO );
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
	  public ApmApnPopMainDMO lock( ApmApnPopMainDMO aApmApnPopMainDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException {
	    logger.debug( "lock( aApmApnPopMainDMO )" );

	    thrower.ifParameterMissing( "aApmApnPopMainDMO", aApmApnPopMainDMO );

	    ApmApnPopMainDMO lockedApmApnPopMainDMO = null;

	    //
	    // Lock the base table on its primary key.
	    //
	    /**
	     * TODO SJ This table does not have a PK
	     * FIXME
	     */
	    lockedApmApnPopMainDMO = (ApmApnPopMainDMO) dao.lock( "ApmApnPopMain",
	        "filterByPrimaryKey",
	        new DAOArgs( 1 ).arg( aApmApnPopMainDMO.getApmId()));

	    return lockedApmApnPopMainDMO;
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
	  public void modify( ApmApnPopMainDMO apmApnPopMainDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( aApmApnPopMainDMO )" );

	    thrower.ifParameterMissing( "aApmApnPopMainDMO", apmApnPopMainDMO );

	    thrower.ifParameterMissing( "ApmApnPopMainDMO.apmId",
	      apmApnPopMainDMO.getApmId());

	    dao.update( apmApnPopMainDMO );
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

	    dao.updateCustom( new ApmApnPopMainDMO(  ), filterQueryArgs( filter, null ) );
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
	  public void delete( ApmApnPopMainDMO apmApnPopMainDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( ApmApnPopMainDMO )" );

	    thrower.ifParameterMissing( "ApmApnPopMainDMO", apmApnPopMainDMO );

	    /**
	     * TODO SJ Not a unique value. Cannot delete in this way
	     * FIXME
	     */
	    thrower.ifParameterMissing( "ApmApnPopMainDMO.apmId",
	      apmApnPopMainDMO.getApmId());

//	    dao.delete(apmApnPopMainDMO);
	  }

	  /**
	   * Deletes the AuxCustomers object from the database.
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

	    dao.delete( "ApmApnPopMain", args.getFilterBy(  ), args );
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
	  public boolean exists( ApmApnPopMainDMO ApmApnPopMainDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( ApmApnPopMainDMO)" );

	    return dao.exists( "ApmApnPopMain", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( ApmApnPopMainDMO.getApmId()));
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
	   * Return a list of location objects matching the passed in values. A
	   * partial match is performed on the description argument. If no language
	   * Code is passed inside the locationDMO then the language passed in the
	   * EppixLocale object is used.
	   *
	   * @param state previous state of the list.
	   * @param locationDMO AneApnNonEppix Data Model Object
	   *
	   * @return DTOList of AneApnNonEppix Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
//	  public DTOList<ApmApnPopMainDMO> getList( 
//	    DTOListState    state,
//	    ApmApnPopMainDMO apmApnPopMainDMO )
//	    throws EPPIXSeriousException {
//	    logger.debug( "getList( state, apmApnPopMainDMO )" );
	//
//	    return dao.getListAbs( state, paramQueryArgs( apmApnPopMainDMO ) );
//	  }

	  /**
	   * Constructs parameterised query arguments.
	   *
	   * @param $(dataObjectNameLowerCamel} ApmApnPopMainDMO object.
	   */
	  protected DAOParamQueryArgs paramQueryArgs( 
	    ApmApnPopMainDMO apmApnPopMainDMO ) {
	    logger.debug( "paramQueryArgs( apmApnPopMainDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "ApmApnPopMain",
	        86 * 2 );

	    if ( apmApnPopMainDMO != null ) {
	      // primary key filters...
	      String apmType = apmApnPopMainDMO.getApmType();

	      if ( !DMO.isNull( apmType ) ) {
	        queryArgs.andFilterBy( "ApmTypeMatch" )
	                 .arg( apmType + dao.wildcardForAnySequence(  ) );
	      }

	      // define more filters...
	      String apmId = apmApnPopMainDMO.getApmId();

	      if ( !DMO.isNull( apmId ) ) {
	        queryArgs.andFilterBy( "ApmIdMatch" )
	                 .arg( apmId + dao.wildcardForAnySequence(  ) );
	      }

	      String apmName = apmApnPopMainDMO.getApmName();

	      if ( !DMO.isNull( apmName ) ) {
	        queryArgs.andFilterBy( "ApmNameMatch" )
	                 .arg( apmName);
	      }

	      String apmBillMethod = apmApnPopMainDMO.getApmBillMethod();

	      if ( !DMO.isNull( apmBillMethod ) ) {
	        queryArgs.andFilterBy( "ApmBillMethodMatch" )
	                 .arg( apmBillMethod + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================	      
	      String apmMsisdn = apmApnPopMainDMO.getApmMsisdn();

	      if ( !DMO.isNull( apmMsisdn ) ) {
	        queryArgs.andFilterBy( "ApmMsisdnMatch" )
	                 .arg( apmMsisdn + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================
	      String apmAssigned = apmApnPopMainDMO.getApmAssigned();

	      if ( !DMO.isNull( apmAssigned ) ) {
	        queryArgs.andFilterBy( "ApmAssignedMatch" )
	                 .arg( apmAssigned + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================
	      Date apmActDate = apmApnPopMainDMO.getApmActDate();

	      if ( !DMO.isNull( apmActDate ) ) {
	        queryArgs.andFilterBy( "ApmActDateMatch" )
	                 .arg( apmActDate + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================
	      Date apmDeactDate = apmApnPopMainDMO.getApmDeactDate();

	      if ( !DMO.isNull( apmDeactDate ) ) {
	        queryArgs.andFilterBy( "ApmDeactDateMatch" )
	                 .arg( apmDeactDate + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================
	      String apmActive = apmApnPopMainDMO.getApmActive();

	      if ( !DMO.isNull( apmActive ) ) {
	        queryArgs.andFilterBy( "ApmActiveMatch" )
	                 .arg( apmActive + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================
	      String apmWdp = apmApnPopMainDMO.getApmWdp();

	      if ( !DMO.isNull( apmWdp ) ) {
	        queryArgs.andFilterBy( "ApmWdpMatch" )
	                 .arg( apmWdp + dao.wildcardForAnySequence(  ) );
	      }
//====================================================================================

	    } else {
	      // include all default languageCode filters where appropriate...
	    }

	    return queryArgs;
	  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param state DOCUMENT ME!
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
//	  public DTOList<ApmApnPopMainDMO> getList( 
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXSeriousException {
//	    logger.debug( "getList( state, filter )" );
	//
//	    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
//	  }

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
	        ? "ApmApnPopMain" : dmlName, parts.size(  ) );

	    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
	      FilterPart part = (FilterPart) i.next();
	      
	      switch ( part.getIndex(  ) ) {
	        case ApmApnPopMainDMO.apmTypeFilter:
	          part.andFilterBy( queryArgs, "ApmType",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case ApmApnPopMainDMO.apmIdFilter:
	          part.andFilterBy( queryArgs, "ApmId",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case ApmApnPopMainDMO.apmMsisdnFilter:
	          part.andFilterBy( queryArgs, "ApmMsisdn" );

	          break;

	        case ApmApnPopMainDMO.apmNameFilter:
	          part.andFilterBy( queryArgs, "ApmName",
	            dao.wildcardForAnySequence(  ));

	          break;
	          
	        case ApmApnPopMainDMO.apmBillMethodFilter:
		          part.andFilterBy( queryArgs, "ApmBillMethod",
		            dao.wildcardForAnySequence(  ));

		          break;
		          
	        case ApmApnPopMainDMO.apmAssignedFilter:
		          part.andFilterBy( queryArgs, "ApmAssigned",
		            dao.wildcardForAnySequence(  ));

		          break;
		          
	        case ApmApnPopMainDMO.apmActDateFilter:
		          part.andFilterBy( queryArgs, "ApmActDate",
		            dao.wildcardForAnySequence(  ));

		          break;	
		          
	        case ApmApnPopMainDMO.apmDeactDateFilter:
		          part.andFilterBy( queryArgs, "ApmDeactDate",
		            dao.wildcardForAnySequence(  ));

		          break;
		          
	        case ApmApnPopMainDMO.apmActiveFilter:
		          part.andFilterBy( queryArgs, "ApmActive",
		            dao.wildcardForAnySequence(  ));

		          break;
		          
	        case ApmApnPopMainDMO.apmWdpFilter:
		          part.andFilterBy( queryArgs, "ApmWdp",
		            dao.wildcardForAnySequence(  ));

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
	      filterQueryArgs( filter, null ), true );
	  }

	  /**
	   * Retrieves the AneApnNonEppix Data Model Object from a possible list.
	   *
	   * @param filter
	   * @return
	   * @throws EPPIXSeriousException
	   */
	  public ApmApnPopMainDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (ApmApnPopMainDMO) dao.get( args.getDMLName(  ),
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

	public DTOList getList(DTOListState state, ApmApnPopMainDMO apmApnPopMainDMO) throws EPPIXSeriousException {
		logger.debug( "getList( state, apmApnPopMainDMO )" );
		return new DTOList(dao.getList(paramQueryArgs(apmApnPopMainDMO)));
	}

	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );
	    return new DTOList(dao.getList(filterQueryArgs( filter, null)));
	}
}

