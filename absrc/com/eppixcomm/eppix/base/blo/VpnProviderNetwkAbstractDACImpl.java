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
 * VpnProviderNetwk Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VpnProviderNetwkAbstractDACImpl
  extends DAC
  implements VpnProviderNetwkAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VpnProviderNetwkAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpnProviderNetwkDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VpnProviderNetwkAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public VpnProviderNetwkAbstractDACImpl(DAO         dao ) {
		    super( dao, thrower );
  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VpnProviderNetwk Data Model Object
   *
   * @return a populated VpnProviderNetwk Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpnProviderNetwkDMO get( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO", vpnProviderNetwkDMO );

    return (VpnProviderNetwkDMO) dao.get( vpnProviderNetwkDMO );
  }

  /**
   * Creates the VpnProviderNetwk object in the database.
   *
   * @param VpnProviderNetwkDMO vpnProviderNetwkDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vpnProviderNetwkDMO )" );
    thrower.ifParameterMissing( "VpnProviderNetwkDMO", vpnProviderNetwkDMO );

    dao.insert( vpnProviderNetwkDMO );
  }

  /**
   * Locks and retrieves the VpnProviderNetwk object from the database.
   *
   * @param aVpnProviderNetwk VpnProviderNetwk object
   *
   * @return a populated VpnProviderNetwk object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpnProviderNetwkDMO lock( VpnProviderNetwkDMO aVpnProviderNetwkDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "aVpnProviderNetwkDMO", aVpnProviderNetwkDMO );

    VpnProviderNetwkDMO lockedVpnProviderNetwkDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVpnProviderNetwkDMO = (VpnProviderNetwkDMO) dao.lock( "VpnProviderNetwk",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aVpnProviderNetwkDMO.getVpnProviderId(  ) ).arg( aVpnProviderNetwkDMO
          .getVpnNetworkPrefix(  ) ) );

    return lockedVpnProviderNetwkDMO;
  }

  /**
   * Modifies the VpnProviderNetwk object in the database.
   *
   * @param VpnProviderNetwkDMO VpnProviderNetwk object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "aVpnProviderNetwkDMO", vpnProviderNetwkDMO );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO.vpnProviderId",
      vpnProviderNetwkDMO.getVpnProviderId(  ) );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO.vpnNetworkPrefix",
      vpnProviderNetwkDMO.getVpnNetworkPrefix(  ) );

    dao.update( vpnProviderNetwkDMO );
  }

  /**
  * Modifies the VpnProviderNetwk object using the specified filter in the database.
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

    dao.updateCustom( new VpnProviderNetwkDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VpnProviderNetwk object from the database.
   *
   * @param VpnProviderNetwkDMO VpnProviderNetwk object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO", vpnProviderNetwkDMO );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO.vpnProviderId",
      vpnProviderNetwkDMO.getVpnProviderId(  ) );

    thrower.ifParameterMissing( "VpnProviderNetwkDMO.vpnNetworkPrefix",
      vpnProviderNetwkDMO.getVpnNetworkPrefix(  ) );

    dao.delete( vpnProviderNetwkDMO );
  }

  /**
   * Deletes the VpnProviderNetwk object from the database.
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

    dao.delete( "VpnProviderNetwk", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VpnProviderNetwk object exists.
  *
  * @param VpnProviderNetwkDMO VpnProviderNetwkDMO
  *
  * @return true if the VpnProviderNetwk object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VpnProviderNetwkDMO VpnProviderNetwkDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VpnProviderNetwkDMO)" );

    return dao.exists( "VpnProviderNetwk", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( VpnProviderNetwkDMO.getVpnProviderId(  ) ).arg( VpnProviderNetwkDMO
        .getVpnNetworkPrefix(  ) ) );
  }

  /**
    * Return true if a VpnProviderNetwk object exists.
    *
    * @param filter
    *
    * @return true if the VpnProviderNetwk object exists.
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
   * @param locationDMO VpnProviderNetwk Data Model Object
   *
   * @return DTOList of VpnProviderNetwk Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vpnProviderNetwkDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vpnProviderNetwkDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VpnProviderNetwkDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    VpnProviderNetwkDMO vpnProviderNetwkDMO ) {
    logger.debug( "paramQueryArgs( vpnProviderNetwkDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VpnProviderNetwk",
        4 * 2 );

    if ( vpnProviderNetwkDMO != null ) {
      // primary key filters...
      String vpnProviderId = vpnProviderNetwkDMO.getVpnProviderId(  );

      if ( !DMO.isNull( vpnProviderId ) ) {
        queryArgs.andFilterBy( "VpnProviderIdMatch" )
                 .arg( vpnProviderId + dao.wildcardForAnySequence(  ) );
      }

      String vpnNetworkPrefix = vpnProviderNetwkDMO.getVpnNetworkPrefix(  );

      if ( !DMO.isNull( vpnNetworkPrefix ) ) {
        queryArgs.andFilterBy( "VpnNetworkPrefixMatch" )
                 .arg( vpnNetworkPrefix + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vpnDiallingMask = vpnProviderNetwkDMO.getVpnMsisdnMask();

      if ( !DMO.isNull( vpnDiallingMask ) ) {
        queryArgs.andFilterBy( "VpnDiallingMaskMatch" )
                 .arg( vpnDiallingMask + dao.wildcardForAnySequence(  ) );
      }

      String vpnSerialMask = vpnProviderNetwkDMO.getVpnSimMask();

      if ( !DMO.isNull( vpnSerialMask ) ) {
        queryArgs.andFilterBy( "VpnSerialMaskMatch" )
                 .arg( vpnSerialMask + dao.wildcardForAnySequence(  ) );
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
        ? "VpnProviderNetwk" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case VpnProviderNetwkDMO.vpnProviderIdFilter:
          part.andFilterBy( queryArgs, "VpnProviderId",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpnProviderNetwkDMO.vpnNetworkPrefixFilter:
          part.andFilterBy( queryArgs, "VpnNetworkPrefix",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpnProviderNetwkDMO.vpnMsisdnMaskFilter:
          part.andFilterBy( queryArgs, "VpnMsisdnMask",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpnProviderNetwkDMO.vpnSimMaskFilter:
          part.andFilterBy( queryArgs, "VpnSerialMask",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VpnProviderNetwk records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VpnProviderNetwk records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the VpnProviderNetwk Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VpnProviderNetwkDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VpnProviderNetwkDMO) dao.get( args.getDMLName(  ),
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
