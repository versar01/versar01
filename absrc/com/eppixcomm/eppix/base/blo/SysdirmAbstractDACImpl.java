/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of class
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of class
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Sysdirm Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SysdirmAbstractDACImpl
  extends DAC
  implements SysdirmAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SysdirmAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SysdirmDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SysdirmAbstractDACImpl( 
    DAO         dao ) {
    super(dao, thrower);

  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Sysdirm Data Model Object
   *
   * @return a populated Sysdirm Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SysdirmDMO get( SysdirmDMO sysdirmDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SysdirmDMO )" );

    thrower.ifParameterMissing( "SysdirmDMO", sysdirmDMO );

    return (SysdirmDMO) dao.get( sysdirmDMO );
  }

  /**
   * Creates the Sysdirm object in the database.
   *
   * @param SysdirmDMO sysdirmDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SysdirmDMO sysdirmDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( sysdirmDMO )" );
    thrower.ifParameterMissing( "SysdirmDMO", sysdirmDMO );

    dao.insert( sysdirmDMO );
  }

  /**
   * Locks and retrieves the Sysdirm object from the database.
   *
   * @param aSysdirm Sysdirm object
   *
   * @return a populated Sysdirm object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SysdirmDMO lock( SysdirmDMO aSysdirmDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSysdirmDMO )" );

    thrower.ifParameterMissing( "aSysdirmDMO", aSysdirmDMO );

    SysdirmDMO lockedSysdirmDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSysdirmDMO = (SysdirmDMO) dao.lock( "Sysdirm",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSysdirmDMO.getSystemKey(  ) ) );

    return lockedSysdirmDMO;
  }

  /**
   * Modifies the Sysdirm object in the database.
   *
   * @param SysdirmDMO Sysdirm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SysdirmDMO sysdirmDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSysdirmDMO )" );

    thrower.ifParameterMissing( "aSysdirmDMO", sysdirmDMO );

    thrower.ifParameterMissing( "SysdirmDMO.systemKey",
      sysdirmDMO.getSystemKey(  ) );

    dao.update( sysdirmDMO );
  }

  /**
  * Modifies the Sysdirm object using the specified filter in the database.
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

    dao.updateCustom( new SysdirmDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Sysdirm object from the database.
   *
   * @param SysdirmDMO Sysdirm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SysdirmDMO sysdirmDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SysdirmDMO )" );

    thrower.ifParameterMissing( "SysdirmDMO", sysdirmDMO );

    thrower.ifParameterMissing( "SysdirmDMO.systemKey",
      sysdirmDMO.getSystemKey(  ) );

    dao.delete( sysdirmDMO );
  }

  /**
   * Deletes the Sysdirm object from the database.
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

    dao.delete( "Sysdirm", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Sysdirm object exists.
  *
  * @param SysdirmDMO SysdirmDMO
  *
  * @return true if the Sysdirm object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SysdirmDMO SysdirmDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SysdirmDMO)" );

    return dao.exists( "Sysdirm", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SysdirmDMO.getSystemKey(  ) ) );
  }

  /**
    * Return true if a Sysdirm object exists.
    *
    * @param filter
    *
    * @return true if the Sysdirm object exists.
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
   * @param locationDMO Sysdirm Data Model Object
   *
   * @return DTOList of Sysdirm Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    SysdirmDMO   sysdirmDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, sysdirmDMO )" );

    /**
     * TODO SJ: Fixme
     */
//    return dao.getListAbs( state, paramQueryArgs( sysdirmDMO ) );
    return null;
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SysdirmDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SysdirmDMO sysdirmDMO ) {
    logger.debug( "paramQueryArgs( sysdirmDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Sysdirm", 3 * 2 );

    if ( sysdirmDMO != null ) {
      // primary key filters...
      String systemKey = sysdirmDMO.getSystemKey(  );

      if ( !DMO.isNull( systemKey ) ) {
        queryArgs.andFilterBy( "SystemKeyMatch" )
                 .arg( systemKey + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String keyValue = sysdirmDMO.getKeyValue(  );

      if ( !DMO.isNull( keyValue ) ) {
        queryArgs.andFilterBy( "KeyValueMatch" )
                 .arg( keyValue + dao.wildcardForAnySequence(  ) );
      }

      String description = sysdirmDMO.getDescription(  );

      if ( !DMO.isNull( description ) ) {
        queryArgs.andFilterBy( "DescriptionMatch" )
                 .arg( description + dao.wildcardForAnySequence(  ) );
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
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, filter )" );

    /**
     * TODO SJ Fixme
     */
//    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
    return null;
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
    List parts = (List)filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "Sysdirm" : dmlName, parts.size(  ) );

 /**
 * TODO: SJ We need to changes this generic to older format
 */    
//	    for ( FilterPart part : parts ) {
    
    	Iterator it = parts.iterator();
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();
		      switch ( part.getIndex(  ) ) {
		        case SysdirmDMO.systemKeyFilter:
		          part.andFilterBy( queryArgs, "SystemKey",
		            dao.wildcardForAnySequence(  ) );
		
		          break;
		
		        case SysdirmDMO.keyValueFilter:
		          part.andFilterBy( queryArgs, "KeyValue",
		            dao.wildcardForAnySequence(  ) );
		
		          break;
		
		        case SysdirmDMO.descriptionFilter:
		          part.andFilterBy( queryArgs, "Description",
		            dao.wildcardForAnySequence(  ) );
		
		          break;
		      }
	    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Sysdirm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );

  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Sysdirm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ));

  }

  /**
   * Retrieves the Sysdirm Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SysdirmDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SysdirmDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
      args );
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
}
