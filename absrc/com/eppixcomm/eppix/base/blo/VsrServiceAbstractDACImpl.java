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
 * VsrService Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VsrServiceAbstractDACImpl
  extends DAC
  implements VsrServiceAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VsrServiceAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsrServiceDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VsrServiceAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public VsrServiceAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
}
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VsrService Data Model Object
   *
   * @return a populated VsrService Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsrServiceDMO get( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VsrServiceDMO )" );

    thrower.ifParameterMissing( "VsrServiceDMO", vsrServiceDMO );

    return (VsrServiceDMO) dao.get( vsrServiceDMO );
  }

  /**
   * Creates the VsrService object in the database.
   *
   * @param VsrServiceDMO vsrServiceDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vsrServiceDMO )" );
    thrower.ifParameterMissing( "VsrServiceDMO", vsrServiceDMO );

    dao.insert( vsrServiceDMO );
  }

  /**
   * Locks and retrieves the VsrService object from the database.
   *
   * @param aVsrService VsrService object
   *
   * @return a populated VsrService object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsrServiceDMO lock( VsrServiceDMO aVsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVsrServiceDMO )" );

    thrower.ifParameterMissing( "aVsrServiceDMO", aVsrServiceDMO );

    VsrServiceDMO lockedVsrServiceDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVsrServiceDMO = (VsrServiceDMO) dao.lock( "VsrService",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVsrServiceDMO.getVsrServiceCode(  ) ) );

    return lockedVsrServiceDMO;
  }

  /**
   * Modifies the VsrService object in the database.
   *
   * @param VsrServiceDMO VsrService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVsrServiceDMO )" );

    thrower.ifParameterMissing( "aVsrServiceDMO", vsrServiceDMO );

    thrower.ifParameterMissing( "VsrServiceDMO.vsrServiceCode",
      vsrServiceDMO.getVsrServiceCode(  ) );

    dao.update( vsrServiceDMO );
  }

  /**
  * Modifies the VsrService object using the specified filter in the database.
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

    dao.updateCustom( new VsrServiceDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VsrService object from the database.
   *
   * @param VsrServiceDMO VsrService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VsrServiceDMO )" );

    thrower.ifParameterMissing( "VsrServiceDMO", vsrServiceDMO );

    thrower.ifParameterMissing( "VsrServiceDMO.vsrServiceCode",
      vsrServiceDMO.getVsrServiceCode(  ) );

    dao.delete( vsrServiceDMO );
  }

  /**
   * Deletes the VsrService object from the database.
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

    dao.delete( "VsrService", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VsrService object exists.
  *
  * @param VsrServiceDMO VsrServiceDMO
  *
  * @return true if the VsrService object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VsrServiceDMO VsrServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VsrServiceDMO)" );

    return dao.exists( "VsrService", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( VsrServiceDMO.getVsrServiceCode(  ) ) );
  }

  /**
    * Return true if a VsrService object exists.
    *
    * @param filter
    *
    * @return true if the VsrService object exists.
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
   * @param locationDMO VsrService Data Model Object
   *
   * @return DTOList of VsrService Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState  state,
    VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vsrServiceDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vsrServiceDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VsrServiceDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( VsrServiceDMO vsrServiceDMO ) {
    logger.debug( "paramQueryArgs( vsrServiceDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VsrService", 10 * 2 );

    if ( vsrServiceDMO != null ) {
      // primary key filters...
      String vsrServiceCode = vsrServiceDMO.getVsrServiceCode(  );

      if ( !DMO.isNull( vsrServiceCode ) ) {
        queryArgs.andFilterBy( "VsrServiceCodeMatch" )
                 .arg( vsrServiceCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vsrServiceType = vsrServiceDMO.getVsrServiceType(  );

      if ( !DMO.isNull( vsrServiceType ) ) {
        queryArgs.andFilterBy( "VsrServiceTypeMatch" )
                 .arg( vsrServiceType + dao.wildcardForAnySequence(  ) );
      }

      String vsrServiceDesc = vsrServiceDMO.getVsrServiceDesc(  );

      if ( !DMO.isNull( vsrServiceDesc ) ) {
        queryArgs.andFilterBy( "VsrServiceDescMatch" )
                 .arg( vsrServiceDesc + dao.wildcardForAnySequence(  ) );
      }

      String vsrOriginator = vsrServiceDMO.getVsrOriginator(  );

      if ( !DMO.isNull( vsrOriginator ) ) {
        queryArgs.andFilterBy( "VsrOriginatorMatch" )
                 .arg( vsrOriginator + dao.wildcardForAnySequence(  ) );
      }

      String vsrServiceClass = vsrServiceDMO.getVsrServiceClass(  );

      if ( !DMO.isNull( vsrServiceClass ) ) {
        queryArgs.andFilterBy( "VsrServiceClassMatch" )
                 .arg( vsrServiceClass + dao.wildcardForAnySequence(  ) );
      }

      String vsrTempDeact = vsrServiceDMO.getVsrTempDeact(  );

      if ( !DMO.isNull( vsrTempDeact ) ) {
        queryArgs.andFilterBy( "VsrTempDeactMatch" )
                 .arg( vsrTempDeact + dao.wildcardForAnySequence(  ) );
      }

      String vsrProrata = vsrServiceDMO.getVsrProrata(  );

      if ( !DMO.isNull( vsrProrata ) ) {
        queryArgs.andFilterBy( "VsrProrataMatch" )
                 .arg( vsrProrata + dao.wildcardForAnySequence(  ) );
      }

      String vsrProviderId = vsrServiceDMO.getVsrProviderId(  );

      if ( !DMO.isNull( vsrProviderId ) ) {
        queryArgs.andFilterBy( "VsrProviderIdMatch" )
                 .arg( vsrProviderId + dao.wildcardForAnySequence(  ) );
      }

      String vsrShortDesc = vsrServiceDMO.getVsrShortDesc(  );

      if ( !DMO.isNull( vsrShortDesc ) ) {
        queryArgs.andFilterBy( "VsrShortDescMatch" )
                 .arg( vsrShortDesc + dao.wildcardForAnySequence(  ) );
      }

      String vsrSuspend = vsrServiceDMO.getVsrSuspend(  );

      if ( !DMO.isNull( vsrSuspend ) ) {
        queryArgs.andFilterBy( "VsrSuspendMatch" )
                 .arg( vsrSuspend + dao.wildcardForAnySequence(  ) );
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
        ? "VsrService" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case VsrServiceDMO.vsrServiceCodeFilter:
          part.andFilterBy( queryArgs, "VsrServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrServiceTypeFilter:
          part.andFilterBy( queryArgs, "VsrServiceType",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrServiceDescFilter:
          part.andFilterBy( queryArgs, "VsrServiceDesc",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrOriginatorFilter:
          part.andFilterBy( queryArgs, "VsrOriginator",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrServiceClassFilter:
          part.andFilterBy( queryArgs, "VsrServiceClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrTempDeactFilter:
          part.andFilterBy( queryArgs, "VsrTempDeact",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrProrataFilter:
          part.andFilterBy( queryArgs, "VsrProrata",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrProviderIdFilter:
          part.andFilterBy( queryArgs, "VsrProviderId",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrShortDescFilter:
          part.andFilterBy( queryArgs, "VsrShortDesc",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsrServiceDMO.vsrSuspendFilter:
          part.andFilterBy( queryArgs, "VsrSuspend",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VsrService records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VsrService records based
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
   * Retrieves the VsrService Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VsrServiceDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VsrServiceDMO) dao.get( args.getDMLName(  ),
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
