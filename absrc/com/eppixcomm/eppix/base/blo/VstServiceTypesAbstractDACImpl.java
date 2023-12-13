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
 * VstServiceTypes Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VstServiceTypesAbstractDACImpl
  extends DAC
  implements VstServiceTypesAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VstServiceTypesAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VstServiceTypesDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VstServiceTypesAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public VstServiceTypesAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VstServiceTypes Data Model Object
   *
   * @return a populated VstServiceTypes Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VstServiceTypesDMO get( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VstServiceTypesDMO )" );

    thrower.ifParameterMissing( "VstServiceTypesDMO", vstServiceTypesDMO );

    return (VstServiceTypesDMO) dao.get( vstServiceTypesDMO );
  }

  /**
   * Creates the VstServiceTypes object in the database.
   *
   * @param VstServiceTypesDMO vstServiceTypesDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vstServiceTypesDMO )" );
    thrower.ifParameterMissing( "VstServiceTypesDMO", vstServiceTypesDMO );

    dao.insert( vstServiceTypesDMO );
  }

  /**
   * Locks and retrieves the VstServiceTypes object from the database.
   *
   * @param aVstServiceTypes VstServiceTypes object
   *
   * @return a populated VstServiceTypes object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VstServiceTypesDMO lock( VstServiceTypesDMO aVstServiceTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVstServiceTypesDMO )" );

    thrower.ifParameterMissing( "aVstServiceTypesDMO", aVstServiceTypesDMO );

    VstServiceTypesDMO lockedVstServiceTypesDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVstServiceTypesDMO = (VstServiceTypesDMO) dao.lock( "VstServiceTypes",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVstServiceTypesDMO.getVstServiceType(  ) ) );

    return lockedVstServiceTypesDMO;
  }

  /**
   * Modifies the VstServiceTypes object in the database.
   *
   * @param VstServiceTypesDMO VstServiceTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVstServiceTypesDMO )" );

    thrower.ifParameterMissing( "aVstServiceTypesDMO", vstServiceTypesDMO );

    thrower.ifParameterMissing( "VstServiceTypesDMO.vstServiceType",
      vstServiceTypesDMO.getVstServiceType(  ) );

    dao.update( vstServiceTypesDMO );
  }

  /**
  * Modifies the VstServiceTypes object using the specified filter in the database.
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

    dao.updateCustom( new VstServiceTypesDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VstServiceTypes object from the database.
   *
   * @param VstServiceTypesDMO VstServiceTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VstServiceTypesDMO )" );

    thrower.ifParameterMissing( "VstServiceTypesDMO", vstServiceTypesDMO );

    thrower.ifParameterMissing( "VstServiceTypesDMO.vstServiceType",
      vstServiceTypesDMO.getVstServiceType(  ) );

    dao.delete( vstServiceTypesDMO );
  }

  /**
   * Deletes the VstServiceTypes object from the database.
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

    dao.delete( "VstServiceTypes", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VstServiceTypes object exists.
  *
  * @param VstServiceTypesDMO VstServiceTypesDMO
  *
  * @return true if the VstServiceTypes object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VstServiceTypesDMO VstServiceTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VstServiceTypesDMO)" );

    return dao.exists( "VstServiceTypes", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( VstServiceTypesDMO.getVstServiceType(  ) ) );
  }

  /**
    * Return true if a VstServiceTypes object exists.
    *
    * @param filter
    *
    * @return true if the VstServiceTypes object exists.
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
   * @param locationDMO VstServiceTypes Data Model Object
   *
   * @return DTOList of VstServiceTypes Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    VstServiceTypesDMO vstServiceTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vstServiceTypesDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vstServiceTypesDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VstServiceTypesDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    VstServiceTypesDMO vstServiceTypesDMO ) {
    logger.debug( "paramQueryArgs( vstServiceTypesDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VstServiceTypes",
        12 * 2 );

    if ( vstServiceTypesDMO != null ) {
      // primary key filters...
      String vstServiceType = vstServiceTypesDMO.getVstServiceType(  );

      if ( !DMO.isNull( vstServiceType ) ) {
        queryArgs.andFilterBy( "VstServiceTypeMatch" )
                 .arg( vstServiceType + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vstServiceDesc = vstServiceTypesDMO.getVstServiceDesc(  );

      if ( !DMO.isNull( vstServiceDesc ) ) {
        queryArgs.andFilterBy( "VstServiceDescMatch" )
                 .arg( vstServiceDesc + dao.wildcardForAnySequence(  ) );
      }

      String vstMultiCharge = vstServiceTypesDMO.getVstMultiCharge(  );

      if ( !DMO.isNull( vstMultiCharge ) ) {
        queryArgs.andFilterBy( "VstMultiChargeMatch" )
                 .arg( vstMultiCharge + dao.wildcardForAnySequence(  ) );
      }

      String vstServiceClass = vstServiceTypesDMO.getVstServiceClass(  );

      if ( !DMO.isNull( vstServiceClass ) ) {
        queryArgs.andFilterBy( "VstServiceClassMatch" )
                 .arg( vstServiceClass + dao.wildcardForAnySequence(  ) );
      }

      String vstAutoConnect = vstServiceTypesDMO.getVstAutoConnect(  );

      if ( !DMO.isNull( vstAutoConnect ) ) {
        queryArgs.andFilterBy( "VstAutoConnectMatch" )
                 .arg( vstAutoConnect + dao.wildcardForAnySequence(  ) );
      }

      String vstOriginator = vstServiceTypesDMO.getVstOriginator(  );

      if ( !DMO.isNull( vstOriginator ) ) {
        queryArgs.andFilterBy( "VstOriginatorMatch" )
                 .arg( vstOriginator + dao.wildcardForAnySequence(  ) );
      }

      String vstTariffRelated = vstServiceTypesDMO.getVstTariffRelated(  );

      if ( !DMO.isNull( vstTariffRelated ) ) {
        queryArgs.andFilterBy( "VstTariffRelatedMatch" )
                 .arg( vstTariffRelated + dao.wildcardForAnySequence(  ) );
      }

      String vstParameterised = vstServiceTypesDMO.getVstParameterised(  );

      if ( !DMO.isNull( vstParameterised ) ) {
        queryArgs.andFilterBy( "VstParameterisedMatch" )
                 .arg( vstParameterised + dao.wildcardForAnySequence(  ) );
      }

      String vstParamsLevel = vstServiceTypesDMO.getVstParamsLevel(  );

      if ( !DMO.isNull( vstParamsLevel ) ) {
        queryArgs.andFilterBy( "VstParamsLevelMatch" )
                 .arg( vstParamsLevel + dao.wildcardForAnySequence(  ) );
      }

      String vstFutureAct = vstServiceTypesDMO.getVstFutureAct(  );

      if ( !DMO.isNull( vstFutureAct ) ) {
        queryArgs.andFilterBy( "VstFutureActMatch" )
                 .arg( vstFutureAct + dao.wildcardForAnySequence(  ) );
      }

      String vstNodeLevel = vstServiceTypesDMO.getVstNodeLevel(  );

      if ( !DMO.isNull( vstNodeLevel ) ) {
        queryArgs.andFilterBy( "VstNodeLevelMatch" )
                 .arg( vstNodeLevel + dao.wildcardForAnySequence(  ) );
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
        ? "VstServiceTypes" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    
      switch ( part.getIndex(  ) ) {
        case VstServiceTypesDMO.vstServiceTypeFilter:
          part.andFilterBy( queryArgs, "VstServiceType",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstServiceDescFilter:
          part.andFilterBy( queryArgs, "VstServiceDesc",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstMultiChargeFilter:
          part.andFilterBy( queryArgs, "VstMultiCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstServiceClassFilter:
          part.andFilterBy( queryArgs, "VstServiceClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstAutoConnectFilter:
          part.andFilterBy( queryArgs, "VstAutoConnect",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstOriginatorFilter:
          part.andFilterBy( queryArgs, "VstOriginator",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstTariffRelatedFilter:
          part.andFilterBy( queryArgs, "VstTariffRelated",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstParameterisedFilter:
          part.andFilterBy( queryArgs, "VstParameterised",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstParamsLevelFilter:
          part.andFilterBy( queryArgs, "VstParamsLevel",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstArchiveMonthsFilter:
          part.andFilterBy( queryArgs, "VstArchiveMonths",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstFutureActFilter:
          part.andFilterBy( queryArgs, "VstFutureAct",
            dao.wildcardForAnySequence(  ) );

          break;

        case VstServiceTypesDMO.vstNodeLevelFilter:
          part.andFilterBy( queryArgs, "VstNodeLevel",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VstServiceTypes records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VstServiceTypes records based
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
   * Retrieves the VstServiceTypes Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VstServiceTypesDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VstServiceTypesDMO) dao.get( args.getDMLName(  ),
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
