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
 * VprProvider Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VprProviderAbstractDACImpl
  extends DAC
  implements VprProviderAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VprProviderAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VprProviderDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VprProviderAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public VprProviderAbstractDACImpl(DAO         dao ) {
		    super( dao, thrower );
  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VprProvider Data Model Object
   *
   * @return a populated VprProvider Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VprProviderDMO get( VprProviderDMO vprProviderDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VprProviderDMO )" );

    thrower.ifParameterMissing( "VprProviderDMO", vprProviderDMO );

    return (VprProviderDMO) dao.get( vprProviderDMO );
  }

  /**
   * Creates the VprProvider object in the database.
   *
   * @param VprProviderDMO vprProviderDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VprProviderDMO vprProviderDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vprProviderDMO )" );
    thrower.ifParameterMissing( "VprProviderDMO", vprProviderDMO );

    dao.insert( vprProviderDMO );
  }

  /**
   * Locks and retrieves the VprProvider object from the database.
   *
   * @param aVprProvider VprProvider object
   *
   * @return a populated VprProvider object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VprProviderDMO lock( VprProviderDMO aVprProviderDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVprProviderDMO )" );

    thrower.ifParameterMissing( "aVprProviderDMO", aVprProviderDMO );

    VprProviderDMO lockedVprProviderDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVprProviderDMO = (VprProviderDMO) dao.lock( "VprProvider",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVprProviderDMO.getVprProviderId(  ) ) );

    return lockedVprProviderDMO;
  }

  /**
   * Modifies the VprProvider object in the database.
   *
   * @param VprProviderDMO VprProvider object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VprProviderDMO vprProviderDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVprProviderDMO )" );

    thrower.ifParameterMissing( "aVprProviderDMO", vprProviderDMO );

    thrower.ifParameterMissing( "VprProviderDMO.vprProviderId",
      vprProviderDMO.getVprProviderId(  ) );

    dao.update( vprProviderDMO );
  }

  /**
  * Modifies the VprProvider object using the specified filter in the database.
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

    dao.updateCustom( new VprProviderDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VprProvider object from the database.
   *
   * @param VprProviderDMO VprProvider object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VprProviderDMO vprProviderDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VprProviderDMO )" );

    thrower.ifParameterMissing( "VprProviderDMO", vprProviderDMO );

    thrower.ifParameterMissing( "VprProviderDMO.vprProviderId",
      vprProviderDMO.getVprProviderId(  ) );

    dao.delete( vprProviderDMO );
  }

  /**
   * Deletes the VprProvider object from the database.
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

    dao.delete( "VprProvider", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VprProvider object exists.
  *
  * @param VprProviderDMO VprProviderDMO
  *
  * @return true if the VprProvider object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VprProviderDMO VprProviderDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VprProviderDMO)" );

    return dao.exists( "VprProvider", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( VprProviderDMO.getVprProviderId(  ) ) );
  }

  /**
    * Return true if a VprProvider object exists.
    *
    * @param filter
    *
    * @return true if the VprProvider object exists.
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
   * @param locationDMO VprProvider Data Model Object
   *
   * @return DTOList of VprProvider Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState   state,
    VprProviderDMO vprProviderDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vprProviderDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vprProviderDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VprProviderDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( VprProviderDMO vprProviderDMO ) {
    logger.debug( "paramQueryArgs( vprProviderDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VprProvider", 4 * 2 );

    if ( vprProviderDMO != null ) {
      // primary key filters...
      String vprProviderId = vprProviderDMO.getVprProviderId(  );

      if ( !DMO.isNull( vprProviderId ) ) {
        queryArgs.andFilterBy( "VprProviderIdMatch" )
                 .arg( vprProviderId + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vprProviderName = vprProviderDMO.getVprProviderName(  );

      if ( !DMO.isNull( vprProviderName ) ) {
        queryArgs.andFilterBy( "VprProviderNameMatch" )
                 .arg( vprProviderName + dao.wildcardForAnySequence(  ) );
      }

      String vprNetwork = vprProviderDMO.getVprNetwork(  );

      if ( !DMO.isNull( vprNetwork ) ) {
        queryArgs.andFilterBy( "VprNetworkMatch" )
                 .arg( vprNetwork + dao.wildcardForAnySequence(  ) );
      }

//      String vprTechnology = vprProviderDMO.getVprTechnology(  );

//      if ( !DMO.isNull( vprTechnology ) ) {
//        queryArgs.andFilterBy( "VprTechnologyMatch" )
//                 .arg( vprTechnology + dao.wildcardForAnySequence(  ) );
//      }
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

    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
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
        ? "VprProvider" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case VprProviderDMO.vprProviderIdFilter:
          part.andFilterBy( queryArgs, "VprProviderId",
            dao.wildcardForAnySequence(  ) );

          break;

        case VprProviderDMO.vprProviderNameFilter:
          part.andFilterBy( queryArgs, "VprProviderName",
            dao.wildcardForAnySequence(  ) );

          break;

        case VprProviderDMO.vprNetworkFilter:
          part.andFilterBy( queryArgs, "VprNetwork",
            dao.wildcardForAnySequence(  ) );

          break;

//        case VprProviderDMO.vprTechnologyFilter:
//          part.andFilterBy( queryArgs, "VprTechnology",
//            dao.wildcardForAnySequence(  ) );
//
//          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VprProvider records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VprProvider records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the VprProvider Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VprProviderDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VprProviderDMO) dao.get( args.getDMLName(  ),
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
}
