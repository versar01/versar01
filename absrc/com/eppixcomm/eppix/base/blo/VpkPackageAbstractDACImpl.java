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
 * VpkPackage Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VpkPackageAbstractDACImpl
  extends DAC
  implements VpkPackageAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VpkPackageAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpkPackageDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VpkPackageAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public VpkPackageAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VpkPackage Data Model Object
   *
   * @return a populated VpkPackage Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpkPackageDMO get( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VpkPackageDMO )" );

    thrower.ifParameterMissing( "VpkPackageDMO", vpkPackageDMO );

    return (VpkPackageDMO) dao.get( vpkPackageDMO );
  }

  /**
   * Creates the VpkPackage object in the database.
   *
   * @param VpkPackageDMO vpkPackageDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vpkPackageDMO )" );
    thrower.ifParameterMissing( "VpkPackageDMO", vpkPackageDMO );

    dao.insert( vpkPackageDMO );
  }

  /**
   * Locks and retrieves the VpkPackage object from the database.
   *
   * @param aVpkPackage VpkPackage object
   *
   * @return a populated VpkPackage object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpkPackageDMO lock( VpkPackageDMO aVpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVpkPackageDMO )" );

    thrower.ifParameterMissing( "aVpkPackageDMO", aVpkPackageDMO );

    VpkPackageDMO lockedVpkPackageDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVpkPackageDMO = (VpkPackageDMO) dao.lock( "VpkPackage",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVpkPackageDMO.getVpkPackageCode(  ) ) );

    return lockedVpkPackageDMO;
  }

  /**
   * Modifies the VpkPackage object in the database.
   *
   * @param VpkPackageDMO VpkPackage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVpkPackageDMO )" );

    thrower.ifParameterMissing( "aVpkPackageDMO", vpkPackageDMO );

    thrower.ifParameterMissing( "VpkPackageDMO.vpkPackageCode",
      vpkPackageDMO.getVpkPackageCode(  ) );

    dao.update( vpkPackageDMO );
  }

  /**
  * Modifies the VpkPackage object using the specified filter in the database.
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

    dao.updateCustom( new VpkPackageDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VpkPackage object from the database.
   *
   * @param VpkPackageDMO VpkPackage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VpkPackageDMO )" );

    thrower.ifParameterMissing( "VpkPackageDMO", vpkPackageDMO );

    thrower.ifParameterMissing( "VpkPackageDMO.vpkPackageCode",
      vpkPackageDMO.getVpkPackageCode(  ) );

    dao.delete( vpkPackageDMO );
  }

  /**
   * Deletes the VpkPackage object from the database.
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

    dao.delete( "VpkPackage", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VpkPackage object exists.
  *
  * @param VpkPackageDMO VpkPackageDMO
  *
  * @return true if the VpkPackage object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VpkPackageDMO VpkPackageDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VpkPackageDMO)" );

    return dao.exists( "VpkPackage", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( VpkPackageDMO.getVpkPackageCode(  ) ) );
  }

  /**
    * Return true if a VpkPackage object exists.
    *
    * @param filter
    *
    * @return true if the VpkPackage object exists.
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
   * @param locationDMO VpkPackage Data Model Object
   *
   * @return DTOList of VpkPackage Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState  state,
    VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vpkPackageDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vpkPackageDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VpkPackageDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( VpkPackageDMO vpkPackageDMO ) {
    logger.debug( "paramQueryArgs( vpkPackageDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VpkPackage", 5 * 2 );

    if ( vpkPackageDMO != null ) {
      // primary key filters...
      String vpkPackageCode = vpkPackageDMO.getVpkPackageCode(  );

      if ( !DMO.isNull( vpkPackageCode ) ) {
        queryArgs.andFilterBy( "VpkPackageCodeMatch" )
                 .arg( vpkPackageCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vpkPackageDesc = vpkPackageDMO.getVpkPackageDesc(  );

      if ( !DMO.isNull( vpkPackageDesc ) ) {
        queryArgs.andFilterBy( "VpkPackageDescMatch" )
                 .arg( vpkPackageDesc + dao.wildcardForAnySequence(  ) );
      }

      String vpkTarplanRef = vpkPackageDMO.getVpkTarplanRef(  );

      if ( !DMO.isNull( vpkTarplanRef ) ) {
        queryArgs.andFilterBy( "VpkTarplanRefMatch" )
                 .arg( vpkTarplanRef + dao.wildcardForAnySequence(  ) );
      }

      String vpkChangeTariff = vpkPackageDMO.getVpkChangeTariff(  );

      if ( !DMO.isNull( vpkChangeTariff ) ) {
        queryArgs.andFilterBy( "VpkChangeTariffMatch" )
                 .arg( vpkChangeTariff + dao.wildcardForAnySequence(  ) );
      }

      String vpkSuspend = vpkPackageDMO.getVpkSuspend(  );

      if ( !DMO.isNull( vpkSuspend ) ) {
        queryArgs.andFilterBy( "VpkSuspendMatch" )
                 .arg( vpkSuspend + dao.wildcardForAnySequence(  ) );
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
        ? "VpkPackage" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    
      switch ( part.getIndex(  ) ) {
        case VpkPackageDMO.vpkPackageCodeFilter:
          part.andFilterBy( queryArgs, "VpkPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpkPackageDMO.vpkPackageDescFilter:
          part.andFilterBy( queryArgs, "VpkPackageDesc",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpkPackageDMO.vpkTarplanRefFilter:
          part.andFilterBy( queryArgs, "VpkTarplanRef",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpkPackageDMO.vpkChangeTariffFilter:
          part.andFilterBy( queryArgs, "VpkChangeTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpkPackageDMO.vpkSuspendFilter:
          part.andFilterBy( queryArgs, "VpkSuspend",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VpkPackage records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VpkPackage records based
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
   * Retrieves the VpkPackage Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VpkPackageDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VpkPackageDMO) dao.get( args.getDMLName(  ),
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
