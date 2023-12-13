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
 * BcyBillingCycle Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class BcyBillingCycleAbstractDACImpl
  extends DAC
  implements BcyBillingCycleAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( BcyBillingCycleAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BcyBillingCycleDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public BcyBillingCycleAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public BcyBillingCycleAbstractDACImpl( DAO dao ) {
		    super( dao, thrower );
		  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a BcyBillingCycle Data Model Object
   *
   * @return a populated BcyBillingCycle Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BcyBillingCycleDMO get( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( BcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "BcyBillingCycleDMO", bcyBillingCycleDMO );

    return (BcyBillingCycleDMO) dao.get( bcyBillingCycleDMO );
  }

  /**
   * Creates the BcyBillingCycle object in the database.
   *
   * @param BcyBillingCycleDMO bcyBillingCycleDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( bcyBillingCycleDMO )" );
    thrower.ifParameterMissing( "BcyBillingCycleDMO", bcyBillingCycleDMO );

    dao.insert( bcyBillingCycleDMO );
  }

  /**
   * Locks and retrieves the BcyBillingCycle object from the database.
   *
   * @param aBcyBillingCycle BcyBillingCycle object
   *
   * @return a populated BcyBillingCycle object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BcyBillingCycleDMO lock( BcyBillingCycleDMO aBcyBillingCycleDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aBcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "aBcyBillingCycleDMO", aBcyBillingCycleDMO );

    BcyBillingCycleDMO lockedBcyBillingCycleDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedBcyBillingCycleDMO = (BcyBillingCycleDMO) dao.lock( "BcyBillingCycle",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aBcyBillingCycleDMO.getBcyBillCycle(  ) ) );

    return lockedBcyBillingCycleDMO;
  }

  /**
   * Modifies the BcyBillingCycle object in the database.
   *
   * @param BcyBillingCycleDMO BcyBillingCycle object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aBcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "aBcyBillingCycleDMO", bcyBillingCycleDMO );

    thrower.ifParameterMissing( "BcyBillingCycleDMO.bcyBillCycle",
      bcyBillingCycleDMO.getBcyBillCycle(  ) );

    dao.update( bcyBillingCycleDMO );
  }

  /**
  * Modifies the BcyBillingCycle object using the specified filter in the database.
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

    dao.updateCustom( new BcyBillingCycleDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the BcyBillingCycle object from the database.
   *
   * @param BcyBillingCycleDMO BcyBillingCycle object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( BcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "BcyBillingCycleDMO", bcyBillingCycleDMO );

    thrower.ifParameterMissing( "BcyBillingCycleDMO.bcyBillCycle",
      bcyBillingCycleDMO.getBcyBillCycle(  ) );

    dao.delete( bcyBillingCycleDMO );
  }

  /**
   * Deletes the BcyBillingCycle object from the database.
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

    dao.delete( "BcyBillingCycle", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a BcyBillingCycle object exists.
  *
  * @param BcyBillingCycleDMO BcyBillingCycleDMO
  *
  * @return true if the BcyBillingCycle object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( BcyBillingCycleDMO BcyBillingCycleDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( BcyBillingCycleDMO)" );

    return dao.exists( "BcyBillingCycle", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( BcyBillingCycleDMO.getBcyBillCycle(  ) ) );
  }

  /**
    * Return true if a BcyBillingCycle object exists.
    *
    * @param filter
    *
    * @return true if the BcyBillingCycle object exists.
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
   * @param locationDMO BcyBillingCycle Data Model Object
   *
   * @return DTOList of BcyBillingCycle Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, bcyBillingCycleDMO )" );

    return dao.getListAbs( state, paramQueryArgs( bcyBillingCycleDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} BcyBillingCycleDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    BcyBillingCycleDMO bcyBillingCycleDMO ) {
    logger.debug( "paramQueryArgs( bcyBillingCycleDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "BcyBillingCycle",
        10 * 2 );

    if ( bcyBillingCycleDMO != null ) {
      // primary key filters...
      String bcyBillCycle = bcyBillingCycleDMO.getBcyBillCycle(  );

      if ( !DMO.isNull( bcyBillCycle ) ) {
        queryArgs.andFilterBy( "BcyBillCycleMatch" )
                 .arg( bcyBillCycle + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String bcyDescription = bcyBillingCycleDMO.getBcyDescription(  );

      if ( !DMO.isNull( bcyDescription ) ) {
        queryArgs.andFilterBy( "BcyDescriptionMatch" )
                 .arg( bcyDescription + dao.wildcardForAnySequence(  ) );
      }

      String bcyPeriod = bcyBillingCycleDMO.getBcyPeriod(  );

      if ( !DMO.isNull( bcyPeriod ) ) {
        queryArgs.andFilterBy( "BcyPeriodMatch" )
                 .arg( bcyPeriod + dao.wildcardForAnySequence(  ) );
      }

      String bcySuspended = bcyBillingCycleDMO.getBcySuspended(  );

      if ( !DMO.isNull( bcySuspended ) ) {
        queryArgs.andFilterBy( "BcySuspendedMatch" )
                 .arg( bcySuspended + dao.wildcardForAnySequence(  ) );
      }

      String bcyUseStatus = bcyBillingCycleDMO.getBcyUseStatus(  );

      if ( !DMO.isNull( bcyUseStatus ) ) {
        queryArgs.andFilterBy( "BcyUseStatusMatch" )
                 .arg( bcyUseStatus + dao.wildcardForAnySequence(  ) );
      }

      String bcyInAdvance = bcyBillingCycleDMO.getBcyInAdvance(  );

      if ( !DMO.isNull( bcyInAdvance ) ) {
        queryArgs.andFilterBy( "BcyInAdvanceMatch" )
                 .arg( bcyInAdvance + dao.wildcardForAnySequence(  ) );
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
        ? "BcyBillingCycle" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part =  (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case BcyBillingCycleDMO.bcyBillCycleFilter:
          part.andFilterBy( queryArgs, "BcyBillCycle",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyDescriptionFilter:
          part.andFilterBy( queryArgs, "BcyDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyPeriodFilter:
          part.andFilterBy( queryArgs, "BcyPeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyFrequencyFilter:
          part.andFilterBy( queryArgs, "BcyFrequency",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyDayOfRunFilter:
          part.andFilterBy( queryArgs, "BcyDayOfRun",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyNextRunFilter:
          part.andFilterBy( queryArgs, "BcyNextRun",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcySuspendedFilter:
          part.andFilterBy( queryArgs, "BcySuspended",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyUseStatusFilter:
          part.andFilterBy( queryArgs, "BcyUseStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyNextCallRunFilter:
          part.andFilterBy( queryArgs, "BcyNextCallRun",
            dao.wildcardForAnySequence(  ) );

          break;

        case BcyBillingCycleDMO.bcyInAdvanceFilter:
          part.andFilterBy( queryArgs, "BcyInAdvance",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of BcyBillingCycle records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of BcyBillingCycle records based
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
   * Retrieves the BcyBillingCycle Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public BcyBillingCycleDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (BcyBillingCycleDMO) dao.get( args.getDMLName(  ),
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
