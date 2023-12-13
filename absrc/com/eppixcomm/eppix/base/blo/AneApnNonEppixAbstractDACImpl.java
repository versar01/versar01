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

public class AneApnNonEppixAbstractDACImpl extends DAC implements AneApnNonEppixAbstractDAC{

	  /** Error handler/logger. */
	  static DAOThrower thrower = DAOThrower.getDAOThrower( AuxCustomersAbstractDACImpl.class );

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
	  public AneApnNonEppixAbstractDACImpl( 
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
	  public AneApnNonEppixDMO get( AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( AneApnNonEppixDMO )" );

	    thrower.ifParameterMissing( "AneApnNonEppixDMO", aneApnNonEppixDMO );

	    return (AneApnNonEppixDMO) dao.get( aneApnNonEppixDMO );
	  }

	  /**
	   * Creates the AuxCustomers object in the database.
	   *
	   * @param AneApnNonEppixDMO aneApnNonEppixDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( aneApnNonEppixDMO )" );
	    thrower.ifParameterMissing( "AneApnNonEppixDMO", aneApnNonEppixDMO );

	    dao.insert( aneApnNonEppixDMO );
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
	  public AneApnNonEppixDMO lock( AneApnNonEppixDMO aAneApnNonEppixDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException {
	    logger.debug( "lock( aAneApnNonEppixDMO )" );

	    thrower.ifParameterMissing( "aAneApnNonEppixDMO", aAneApnNonEppixDMO );

	    AneApnNonEppixDMO lockedAneApnNonEppixDMO = null;

	    //
	    // Lock the base table on its primary key.
	    //
	    /**
	     * TODO SJ This table does not have a PK
	     * FIXME
	     */
	    lockedAneApnNonEppixDMO = (AneApnNonEppixDMO) dao.lock( "AneApnNonEppix",
	        "filterByPrimaryKey",
	        new DAOArgs( 1 ).arg( aAneApnNonEppixDMO.getAneApnId()));

	    return lockedAneApnNonEppixDMO;
	  }

	  /**
	   * Modifies the AuxCustomers object in the database.
	   *
	   * @param AneApnNonEppixDMO AuxCustomers object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( aAneApnNonEppixDMO )" );

	    thrower.ifParameterMissing( "aAneApnNonEppixDMO", aneApnNonEppixDMO );

	    thrower.ifParameterMissing( "AneApnNonEppixDMO.aneApnId",
	      aneApnNonEppixDMO.getAneApnId());

	    dao.update( aneApnNonEppixDMO );
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

	    dao.updateCustom( new AneApnNonEppixDMO(  ), filterQueryArgs( filter, null ) );
	  }

	  /**
	   * Deletes the AuxCustomers object from the database.
	   *
	   * @param AneApnNonEppixDMO AuxCustomers object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( aneApnNonEppixDMO )" );

	    thrower.ifParameterMissing( "AneApnNonEppixDMO", aneApnNonEppixDMO );

	    /**
	     * TODO SJ Not a unique value. Cannot delete in this way
	     * FIXME
	     */
	    thrower.ifParameterMissing( "AneApnNonEppixDMO.aneApnId",
	      aneApnNonEppixDMO.getAneApnId());

//	    dao.delete(aneApnNonEppixDMO);
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

	    dao.delete( "AneApnNonEppix", args.getFilterBy(  ), args );
	  }

	  /**
	  * Return true if a AneApnNonEppix object exists.
	  *
	  * @param AneApnNonEppixDMO AneApnNonEppixDMO
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
	  public boolean exists( AneApnNonEppixDMO AneApnNonEppixDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( AneApnNonEppixDMO)" );

	    return dao.exists( "AneApnNonEppix", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( AneApnNonEppixDMO.getAneApnId()));
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
//	  public DTOList<AneApnNonEppixDMO> getList( 
//	    DTOListState    state,
//	    AneApnNonEppixDMO aneApnNonEppixDMO )
//	    throws EPPIXSeriousException {
//	    logger.debug( "getList( state, aneApnNonEppixDMO )" );
	//
//	    return dao.getListAbs( state, paramQueryArgs( aneApnNonEppixDMO ) );
//	  }

	  /**
	   * Constructs parameterised query arguments.
	   *
	   * @param $(dataObjectNameLowerCamel} AneApnNonEppixDMO object.
	   */
	  protected DAOParamQueryArgs paramQueryArgs( 
	    AneApnNonEppixDMO aneApnNonEppixDMO ) {
	    logger.debug( "paramQueryArgs( aneApnNonEppixDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AneApnNonEppix",
	        86 * 2 );

	    if ( aneApnNonEppixDMO != null ) {
	      // primary key filters...
	      String aneApnId = aneApnNonEppixDMO.getAneApnId();

	      if ( !DMO.isNull( aneApnId ) ) {
	        queryArgs.andFilterBy( "AneApnIdMatch" )
	                 .arg( aneApnId + dao.wildcardForAnySequence(  ) );
	      }

	      // define more filters...
	      String aneMsisdn = aneApnNonEppixDMO.getAneMsisdn();

	      if ( !DMO.isNull( aneMsisdn ) ) {
	        queryArgs.andFilterBy( "AneMsisdnMatch" )
	                 .arg( aneMsisdn + dao.wildcardForAnySequence(  ) );
	      }

	      Date aneActDate = aneApnNonEppixDMO.getAneActDate();

	      if ( !DMO.isNull( aneActDate ) ) {
	        queryArgs.andFilterBy( "AneActDateMatch" )
	                 .arg( aneActDate);
	      }

	      Date aneDeactDate = aneApnNonEppixDMO.getAneDeactDate();

	      if ( !DMO.isNull( aneDeactDate ) ) {
	        queryArgs.andFilterBy( "AneDeactDateMatch" )
	                 .arg( aneDeactDate + dao.wildcardForAnySequence(  ) );
	      }

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
//	  public DTOList<AneApnNonEppixDMO> getList( 
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
	        ? "AneApnNonEppix" : dmlName, parts.size(  ) );

	    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
	      FilterPart part = (FilterPart) i.next();
	      
	      switch ( part.getIndex(  ) ) {
	        case AneApnNonEppixDMO.aneApnIdFilter:
	          part.andFilterBy( queryArgs, "AneApnId",
	            dao.wildcardForAnySequence(  ) );
	          break;

	        case AneApnNonEppixDMO.aneMsisdnFilter:
	          part.andFilterBy( queryArgs, "AneMsisdn",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case AneApnNonEppixDMO.aneActDateFilter:
	          part.andFilterBy( queryArgs, "AneActDate" );

	          break;

	        case AneApnNonEppixDMO.aneDeactDateFilter:
	          part.andFilterBy( queryArgs, "AneDeactDate",
	            dao.wildcardForAnySequence(  ) );

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
	  public AneApnNonEppixDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (AneApnNonEppixDMO) dao.get( args.getDMLName(  ),
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

	public DTOList getList(DTOListState state, AneApnNonEppixDMO aneApnNonEppixDMO) throws EPPIXSeriousException {
		logger.debug( "getList( state, aneApnNonEppixDMO )" );
		return new DTOList(dao.getList(paramQueryArgs(aneApnNonEppixDMO)));
	}

	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );
	    return new DTOList(dao.getList(filterQueryArgs( filter, null)));
	}
}
