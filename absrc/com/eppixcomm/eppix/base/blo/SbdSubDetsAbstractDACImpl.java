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
 * SbdSubDets Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SbdSubDetsAbstractDACImpl
  extends DAC
  implements SbdSubDetsAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SbdSubDetsAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbdSubDetsDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SbdSubDetsAbstractDACImpl( 
    
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SbdSubDets Data Model Object
   *
   * @return a populated SbdSubDets Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SbdSubDetsDMO get( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SbdSubDetsDMO )" );

    thrower.ifParameterMissing( "SbdSubDetsDMO", sbdSubDetsDMO );

    return (SbdSubDetsDMO) dao.get( sbdSubDetsDMO );
  }

  /**
   * Creates the SbdSubDets object in the database.
   *
   * @param SbdSubDetsDMO sbdSubDetsDMO
   *
   * @throws EPPIXSeriousException
   */
  public SbdSubDetsDMO create( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( sbdSubDetsDMO )" );
    thrower.ifParameterMissing( "SbdSubDetsDMO", sbdSubDetsDMO );

    dao.insert( sbdSubDetsDMO );

    // return the data with key
    return sbdSubDetsDMO;
  }

  /**
   * Locks and retrieves the SbdSubDets object from the database.
   *
   * @param aSbdSubDets SbdSubDets object
   *
   * @return a populated SbdSubDets object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SbdSubDetsDMO lock( SbdSubDetsDMO aSbdSubDetsDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSbdSubDetsDMO )" );

    thrower.ifParameterMissing( "aSbdSubDetsDMO", aSbdSubDetsDMO );

    SbdSubDetsDMO lockedSbdSubDetsDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSbdSubDetsDMO = (SbdSubDetsDMO) dao.lock( "SbdSubDets",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSbdSubDetsDMO.getSbdSubscriberId(  ) ) );

    return lockedSbdSubDetsDMO;
  }

  /**
   * Modifies the SbdSubDets object in the database.
   *
   * @param SbdSubDetsDMO SbdSubDets object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSbdSubDetsDMO )" );

    thrower.ifParameterMissing( "aSbdSubDetsDMO", sbdSubDetsDMO );

    thrower.ifParameterMissing( "SbdSubDetsDMO.sbdSubscriberId",
      sbdSubDetsDMO.getSbdSubscriberId(  ) );

    dao.update( sbdSubDetsDMO );
  }

  /**
  * Modifies the SbdSubDets object using the specified filter in the database.
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

    dao.updateCustom( new SbdSubDetsDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SbdSubDets object from the database.
   *
   * @param SbdSubDetsDMO SbdSubDets object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SbdSubDetsDMO )" );

    thrower.ifParameterMissing( "SbdSubDetsDMO", sbdSubDetsDMO );

    thrower.ifParameterMissing( "SbdSubDetsDMO.sbdSubscriberId",
      sbdSubDetsDMO.getSbdSubscriberId(  ) );

    dao.delete( sbdSubDetsDMO );
  }

  /**
   * Deletes the SbdSubDets object from the database.
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

    dao.delete( "SbdSubDets", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SbdSubDets object exists.
  *
  * @param SbdSubDetsDMO SbdSubDetsDMO
  *
  * @return true if the SbdSubDets object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SbdSubDetsDMO SbdSubDetsDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SbdSubDetsDMO)" );

    return dao.exists( "SbdSubDets", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SbdSubDetsDMO.getSbdSubscriberId(  ) ) );
  }

  /**
    * Return true if a SbdSubDets object exists.
    *
    * @param filter
    *
    * @return true if the SbdSubDets object exists.
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
   * @param locationDMO SbdSubDets Data Model Object
   *
   * @return DTOList of SbdSubDets Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<SbdSubDetsDMO> getList( 
//    DTOListState  state,
//    SbdSubDetsDMO sbdSubDetsDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, sbdSubDetsDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( sbdSubDetsDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SbdSubDetsDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SbdSubDetsDMO sbdSubDetsDMO ) {
    logger.debug( "paramQueryArgs( sbdSubDetsDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SbdSubDets", 17 * 2 );

    if ( sbdSubDetsDMO != null ) {
      // primary key filters...
      Integer sbdSubscriberId = sbdSubDetsDMO.getSbdSubscriberId(  );

      if ( !DMO.isNull( sbdSubscriberId ) ) {
        queryArgs.andFilterBy( "SbdSubscriberId" )
                 .arg( sbdSubscriberId );
      }

      // define more filters...
      String sbdDiallingNo = sbdSubDetsDMO.getSbdDiallingNo(  );

      if ( !DMO.isNull( sbdDiallingNo ) ) {
        queryArgs.andFilterBy( "SbdDiallingNoMatch" )
                 .arg( sbdDiallingNo + dao.wildcardForAnySequence(  ) );
      }

      String sbdBillAcNo = sbdSubDetsDMO.getSbdBillAcNo(  );

      if ( !DMO.isNull( sbdBillAcNo ) ) {
        queryArgs.andFilterBy( "SbdBillAcNoMatch" )
                 .arg( sbdBillAcNo + dao.wildcardForAnySequence(  ) );
      }

      String sbdTitle = sbdSubDetsDMO.getSbdTitle(  );

      if ( !DMO.isNull( sbdTitle ) ) {
        queryArgs.andFilterBy( "SbdTitleMatch" )
                 .arg( sbdTitle + dao.wildcardForAnySequence(  ) );
      }

      String sbdSurname = sbdSubDetsDMO.getSbdSurname(  );

      if ( !DMO.isNull( sbdSurname ) ) {
        queryArgs.andFilterBy( "SbdSurnameMatch" )
                 .arg( sbdSurname + dao.wildcardForAnySequence(  ) );
      }

      String sbdFirstname = sbdSubDetsDMO.getSbdFirstname(  );

      if ( !DMO.isNull( sbdFirstname ) ) {
        queryArgs.andFilterBy( "SbdFirstnameMatch" )
                 .arg( sbdFirstname + dao.wildcardForAnySequence(  ) );
      }

      String sbdGender = sbdSubDetsDMO.getSbdGender(  );

      if ( !DMO.isNull( sbdGender ) ) {
        queryArgs.andFilterBy( "SbdGenderMatch" )
                 .arg( sbdGender + dao.wildcardForAnySequence(  ) );
      }

      String sbdPassword = sbdSubDetsDMO.getSbdPassword(  );

      if ( !DMO.isNull( sbdPassword ) ) {
        queryArgs.andFilterBy( "SbdPasswordMatch" )
                 .arg( sbdPassword + dao.wildcardForAnySequence(  ) );
      }

      String sbdLocationCode = sbdSubDetsDMO.getSbdLocationCode(  );

      if ( !DMO.isNull( sbdLocationCode ) ) {
        queryArgs.andFilterBy( "SbdLocationCodeMatch" )
                 .arg( sbdLocationCode + dao.wildcardForAnySequence(  ) );
      }

      String sbdBillCycle = sbdSubDetsDMO.getSbdBillCycle(  );

      if ( !DMO.isNull( sbdBillCycle ) ) {
        queryArgs.andFilterBy( "SbdBillCycleMatch" )
                 .arg( sbdBillCycle + dao.wildcardForAnySequence(  ) );
      }

      String sbdPackageCode = sbdSubDetsDMO.getSbdPackageCode(  );

      if ( !DMO.isNull( sbdPackageCode ) ) {
        queryArgs.andFilterBy( "SbdPackageCodeMatch" )
                 .arg( sbdPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String sbdTariffPlan = sbdSubDetsDMO.getSbdTariffPlan(  );

      if ( !DMO.isNull( sbdTariffPlan ) ) {
        queryArgs.andFilterBy( "SbdTariffPlanMatch" )
                 .arg( sbdTariffPlan + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<SbdSubDetsDMO> getList( 
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
        ? "SbdSubDets" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {
        case SbdSubDetsDMO.sbdSubscriberIdFilter:
          part.andFilterBy( queryArgs, "SbdSubscriberId" );

          break;

        case SbdSubDetsDMO.sbdDiallingNoFilter:
          part.andFilterBy( queryArgs, "SbdDiallingNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdBillAcNoFilter:
          part.andFilterBy( queryArgs, "SbdBillAcNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdConnectDateFilter:
          part.andFilterBy( queryArgs, "SbdConnectDate" );

          break;

        case SbdSubDetsDMO.sbdDconnectDateFilter:
          part.andFilterBy( queryArgs, "SbdDconnectDate" );

          break;

        case SbdSubDetsDMO.sbdTermDateFilter:
          part.andFilterBy( queryArgs, "SbdTermDate" );

          break;

        case SbdSubDetsDMO.sbdTitleFilter:
          part.andFilterBy( queryArgs, "SbdTitle",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdSurnameFilter:
          part.andFilterBy( queryArgs, "SbdSurname",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdFirstnameFilter:
          part.andFilterBy( queryArgs, "SbdFirstname",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdGenderFilter:
          part.andFilterBy( queryArgs, "SbdGender",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdDobFilter:
          part.andFilterBy( queryArgs, "SbdDob" );

          break;

        case SbdSubDetsDMO.sbdPasswordFilter:
          part.andFilterBy( queryArgs, "SbdPassword",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdLocationCodeFilter:
          part.andFilterBy( queryArgs, "SbdLocationCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdBillCycleFilter:
          part.andFilterBy( queryArgs, "SbdBillCycle",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdPackageCodeFilter:
          part.andFilterBy( queryArgs, "SbdPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbdSubDetsDMO.sbdBilledUptoFilter:
          part.andFilterBy( queryArgs, "SbdBilledUpto" );

          break;

        case SbdSubDetsDMO.sbdTariffPlanFilter:
          part.andFilterBy( queryArgs, "SbdTariffPlan",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SbdSubDets records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SbdSubDets records based
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
   * Retrieves the SbdSubDets Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SbdSubDetsDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SbdSubDetsDMO) dao.get( args.getDMLName(  ),
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
