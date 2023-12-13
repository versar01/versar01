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
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * NmNetmat Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class NmNetmatAbstractDACImpl
  extends DAC
  implements NmNetmatAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( NmNetmatAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new NmNetmatDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public NmNetmatAbstractDACImpl( 
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a NmNetmat Data Model Object
   *
   * @return a populated NmNetmat Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NmNetmatDMO get( NmNetmatDMO nmNetmatDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( NmNetmatDMO )" );

    thrower.ifParameterMissing( "NmNetmatDMO", nmNetmatDMO );

    return (NmNetmatDMO) dao.get( nmNetmatDMO );
  }

  /**
   * Creates the NmNetmat object in the database.
   *
   * @param NmNetmatDMO nmNetmatDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( NmNetmatDMO nmNetmatDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( nmNetmatDMO )" );
    thrower.ifParameterMissing( "NmNetmatDMO", nmNetmatDMO );

    dao.insert( nmNetmatDMO );
  }

  /**
   * Locks and retrieves the NmNetmat object from the database.
   *
   * @param aNmNetmat NmNetmat object
   *
   * @return a populated NmNetmat object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NmNetmatDMO lock( NmNetmatDMO aNmNetmatDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aNmNetmatDMO )" );

    thrower.ifParameterMissing( "aNmNetmatDMO", aNmNetmatDMO );

    NmNetmatDMO lockedNmNetmatDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedNmNetmatDMO = (NmNetmatDMO) dao.lock( "NmNetmat",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aNmNetmatDMO.getNmInternalTariff(  ) ) );

    return lockedNmNetmatDMO;
  }

  /**
   * Modifies the NmNetmat object in the database.
   *
   * @param NmNetmatDMO NmNetmat object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( NmNetmatDMO nmNetmatDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aNmNetmatDMO )" );

    thrower.ifParameterMissing( "aNmNetmatDMO", nmNetmatDMO );

    thrower.ifParameterMissing( "NmNetmatDMO.nmInternalTariff",
      nmNetmatDMO.getNmInternalTariff(  ) );

    dao.update( nmNetmatDMO );
  }

  /**
  * Modifies the NmNetmat object using the specified filter in the database.
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

    dao.updateCustom( new NmNetmatDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the NmNetmat object from the database.
   *
   * @param NmNetmatDMO NmNetmat object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( NmNetmatDMO nmNetmatDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( NmNetmatDMO )" );

    thrower.ifParameterMissing( "NmNetmatDMO", nmNetmatDMO );

    thrower.ifParameterMissing( "NmNetmatDMO.nmInternalTariff",
      nmNetmatDMO.getNmInternalTariff(  ) );

    dao.delete( nmNetmatDMO );
  }

  /**
   * Deletes the NmNetmat object from the database.
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

    dao.delete( "NmNetmat", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a NmNetmat object exists.
  *
  * @param NmNetmatDMO NmNetmatDMO
  *
  * @return true if the NmNetmat object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( NmNetmatDMO NmNetmatDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( NmNetmatDMO)" );

    return dao.exists( "NmNetmat", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( NmNetmatDMO.getNmInternalTariff(  ) ) );
  }

  /**
    * Return true if a NmNetmat object exists.
    *
    * @param filter
    *
    * @return true if the NmNetmat object exists.
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
   * @param locationDMO NmNetmat Data Model Object
   *
   * @return DTOList of NmNetmat Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<NmNetmatDMO> getList( 
//    DTOListState state,
//    NmNetmatDMO  nmNetmatDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, nmNetmatDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( nmNetmatDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} NmNetmatDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( NmNetmatDMO nmNetmatDMO ) {
    logger.debug( "paramQueryArgs( nmNetmatDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "NmNetmat", 9 * 2 );

    if ( nmNetmatDMO != null ) {
      // primary key filters...
      String nmInternalTariff = nmNetmatDMO.getNmInternalTariff(  );

      if ( !DMO.isNull( nmInternalTariff ) ) {
        queryArgs.andFilterBy( "NmInternalTariffMatch" )
                 .arg( nmInternalTariff + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String nmNetworkTariff = nmNetmatDMO.getNmNetworkTariff(  );

      if ( !DMO.isNull( nmNetworkTariff ) ) {
        queryArgs.andFilterBy( "NmNetworkTariffMatch" )
                 .arg( nmNetworkTariff + dao.wildcardForAnySequence(  ) );
      }

      String nmContractPeriod = nmNetmatDMO.getNmContractPeriod(  );

      if ( !DMO.isNull( nmContractPeriod ) ) {
        queryArgs.andFilterBy( "NmContractPeriodMatch" )
                 .arg( nmContractPeriod + dao.wildcardForAnySequence(  ) );
      }
      
      String nmNtwrkContrPer = nmNetmatDMO.getNmNtwrkContrPer(  );

      if ( !DMO.isNull( nmNtwrkContrPer ) ) {
        queryArgs.andFilterBy( "nmNtwrkContrPerMatch" )
                 .arg( nmNtwrkContrPer + dao.wildcardForAnySequence(  ) );
      }

      String nmMinCancPeriod = nmNetmatDMO.getNmMinCancPeriod(  );

      if ( !DMO.isNull( nmMinCancPeriod ) ) {
        queryArgs.andFilterBy( "NmMinCancPeriodMatch" )
                 .arg( nmMinCancPeriod + dao.wildcardForAnySequence(  ) );
      }

      String nmHigherMigType = nmNetmatDMO.getNmHigherMigType(  );

      if ( !DMO.isNull( nmHigherMigType ) ) {
        queryArgs.andFilterBy( "NmHigherMigTypeMatch" )
                 .arg( nmHigherMigType + dao.wildcardForAnySequence(  ) );
      }

      String nmLowerMigType = nmNetmatDMO.getNmLowerMigType(  );

      if ( !DMO.isNull( nmLowerMigType ) ) {
        queryArgs.andFilterBy( "NmLowerMigTypeMatch" )
                 .arg( nmLowerMigType + dao.wildcardForAnySequence(  ) );
      }

      String nmSameMigType = nmNetmatDMO.getNmSameMigType(  );

      if ( !DMO.isNull( nmSameMigType ) ) {
        queryArgs.andFilterBy( "NmSameMigTypeMatch" )
                 .arg( nmSameMigType + dao.wildcardForAnySequence(  ) );
      }

      String nmNetworkId = nmNetmatDMO.getNmNetworkId(  );

      if ( !DMO.isNull( nmNetworkId ) ) {
        queryArgs.andFilterBy( "NmNetworkIdMatch" )
                 .arg( nmNetworkId + dao.wildcardForAnySequence(  ) );
      }

      String nmNetType = nmNetmatDMO.getNmNetType(  );

      if ( !DMO.isNull( nmNetType ) ) {
        queryArgs.andFilterBy( "NmNetTypeMatch" )
                 .arg( nmNetType + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<NmNetmatDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, filter )" );
//
//    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
//  }

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
        ? "NmNetmat" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {
        case NmNetmatDMO.nmInternalTariffFilter:
          part.andFilterBy( queryArgs, "NmInternalTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmNetworkTariffFilter:
          part.andFilterBy( queryArgs, "NmNetworkTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmContractPeriodFilter:
          part.andFilterBy( queryArgs, "NmContractPeriod",
            dao.wildcardForAnySequence(  ) );

          break;
          
        case NmNetmatDMO.nmNtwrkContrPerFilter:
            part.andFilterBy( queryArgs, "NmNtwrkContrPer",
              dao.wildcardForAnySequence(  ) );

            break;

        case NmNetmatDMO.nmMinCancPeriodFilter:
          part.andFilterBy( queryArgs, "NmMinCancPeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmHigherMigTypeFilter:
          part.andFilterBy( queryArgs, "NmHigherMigType",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmLowerMigTypeFilter:
          part.andFilterBy( queryArgs, "NmLowerMigType",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmSameMigTypeFilter:
          part.andFilterBy( queryArgs, "NmSameMigType",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmNetworkIdFilter:
          part.andFilterBy( queryArgs, "NmNetworkId",
            dao.wildcardForAnySequence(  ) );

          break;

        case NmNetmatDMO.nmNetTypeFilter:
          part.andFilterBy( queryArgs, "NmNetType",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of NmNetmat records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of NmNetmat records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(  filterQueryArgs( filter, null ), true);
  }

  /**
   * Retrieves the NmNetmat Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public NmNetmatDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (NmNetmatDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
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
