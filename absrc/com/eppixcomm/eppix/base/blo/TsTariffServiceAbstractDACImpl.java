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

import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * TsTariffService Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class TsTariffServiceAbstractDACImpl
  extends DAC
  implements TsTariffServiceAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( TsTariffServiceAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TsTariffServiceDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public TsTariffServiceAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    //super( userContext, dao, thrower );
	  super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a TsTariffService Data Model Object
   *
   * @return a populated TsTariffService Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TsTariffServiceDMO get( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( TsTariffServiceDMO )" );

    thrower.ifParameterMissing( "TsTariffServiceDMO", tsTariffServiceDMO );

    return (TsTariffServiceDMO) dao.get( tsTariffServiceDMO );
  }

  /**
   * Creates the TsTariffService object in the database.
   *
   * @param TsTariffServiceDMO tsTariffServiceDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( tsTariffServiceDMO )" );
    thrower.ifParameterMissing( "TsTariffServiceDMO", tsTariffServiceDMO );

    dao.insert( tsTariffServiceDMO );
  }

  /**
   * Locks and retrieves the TsTariffService object from the database.
   *
   * @param aTsTariffService TsTariffService object
   *
   * @return a populated TsTariffService object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TsTariffServiceDMO lock( TsTariffServiceDMO aTsTariffServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aTsTariffServiceDMO )" );

    thrower.ifParameterMissing( "aTsTariffServiceDMO", aTsTariffServiceDMO );

    TsTariffServiceDMO lockedTsTariffServiceDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedTsTariffServiceDMO = (TsTariffServiceDMO) dao.lock( "TsTariffService",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aTsTariffServiceDMO.getTsPackageCode(  ) ).arg( aTsTariffServiceDMO
          .getTsInternalTariff(  ) ).arg( aTsTariffServiceDMO.getTsServiceCode(  ) ) );

    return lockedTsTariffServiceDMO;
  }

  /**
   * Modifies the TsTariffService object in the database.
   *
   * @param TsTariffServiceDMO TsTariffService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aTsTariffServiceDMO )" );

    thrower.ifParameterMissing( "aTsTariffServiceDMO", tsTariffServiceDMO );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsPackageCode",
      tsTariffServiceDMO.getTsPackageCode(  ) );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsInternalTariff",
      tsTariffServiceDMO.getTsInternalTariff(  ) );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsServiceCode",
      tsTariffServiceDMO.getTsServiceCode(  ) );

    dao.update( tsTariffServiceDMO );
  }

  /**
  * Modifies the TsTariffService object using the specified filter in the database.
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

    dao.updateCustom( new TsTariffServiceDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the TsTariffService object from the database.
   *
   * @param TsTariffServiceDMO TsTariffService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( TsTariffServiceDMO )" );

    thrower.ifParameterMissing( "TsTariffServiceDMO", tsTariffServiceDMO );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsPackageCode",
      tsTariffServiceDMO.getTsPackageCode(  ) );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsInternalTariff",
      tsTariffServiceDMO.getTsInternalTariff(  ) );

    thrower.ifParameterMissing( "TsTariffServiceDMO.tsServiceCode",
      tsTariffServiceDMO.getTsServiceCode(  ) );

    dao.delete( tsTariffServiceDMO );
  }

  /**
   * Deletes the TsTariffService object from the database.
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

    dao.delete( "TsTariffService", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a TsTariffService object exists.
  *
  * @param TsTariffServiceDMO TsTariffServiceDMO
  *
  * @return true if the TsTariffService object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( TsTariffServiceDMO TsTariffServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( TsTariffServiceDMO)" );

    return dao.exists( "TsTariffService", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( TsTariffServiceDMO.getTsPackageCode(  ) ).arg( TsTariffServiceDMO
        .getTsInternalTariff(  ) ).arg( TsTariffServiceDMO.getTsServiceCode(  ) ) );
  }

  /**
    * Return true if a TsTariffService object exists.
    *
    * @param filter
    *
    * @return true if the TsTariffService object exists.
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
   * @param locationDMO TsTariffService Data Model Object
   *
   * @return DTOList of TsTariffService Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    TsTariffServiceDMO tsTariffServiceDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, tsTariffServiceDMO )" );

    //return dao.getListAbs( state, paramQueryArgs( tsTariffServiceDMO ) );
    return null;
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} TsTariffServiceDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    TsTariffServiceDMO tsTariffServiceDMO ) {
    logger.debug( "paramQueryArgs( tsTariffServiceDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "TsTariffService",
        15 * 2 );

    if ( tsTariffServiceDMO != null ) {
      // primary key filters...
      String tsPackageCode = tsTariffServiceDMO.getTsPackageCode(  );

      if ( !DMO.isNull( tsPackageCode ) ) {
        queryArgs.andFilterBy( "TsPackageCodeMatch" )
                 .arg( tsPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String tsInternalTariff = tsTariffServiceDMO.getTsInternalTariff(  );

      if ( !DMO.isNull( tsInternalTariff ) ) {
        queryArgs.andFilterBy( "TsInternalTariffMatch" )
                 .arg( tsInternalTariff + dao.wildcardForAnySequence(  ) );
      }

      String tsServiceCode = tsTariffServiceDMO.getTsServiceCode(  );

      if ( !DMO.isNull( tsServiceCode ) ) {
        queryArgs.andFilterBy( "TsServiceCodeMatch" )
                 .arg( tsServiceCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String tsNetServCode = tsTariffServiceDMO.getTsNetServCode(  );

      if ( !DMO.isNull( tsNetServCode ) ) {
        queryArgs.andFilterBy( "TsNetServCodeMatch" )
                 .arg( tsNetServCode + dao.wildcardForAnySequence(  ) );
      }

      String tsActCharge = tsTariffServiceDMO.getTsActCharge(  );

      if ( !DMO.isNull( tsActCharge ) ) {
        queryArgs.andFilterBy( "TsActChargeMatch" )
                 .arg( tsActCharge + dao.wildcardForAnySequence(  ) );
      }

      String tsTdeactCharge = tsTariffServiceDMO.getTsTdeactCharge(  );

      if ( !DMO.isNull( tsTdeactCharge ) ) {
        queryArgs.andFilterBy( "TsTdeactChargeMatch" )
                 .arg( tsTdeactCharge + dao.wildcardForAnySequence(  ) );
      }

      String tsReactCharge = tsTariffServiceDMO.getTsReactCharge(  );

      if ( !DMO.isNull( tsReactCharge ) ) {
        queryArgs.andFilterBy( "TsReactChargeMatch" )
                 .arg( tsReactCharge + dao.wildcardForAnySequence(  ) );
      }

      String tsPdeactCharge = tsTariffServiceDMO.getTsPdeactCharge(  );

      if ( !DMO.isNull( tsPdeactCharge ) ) {
        queryArgs.andFilterBy( "TsPdeactChargeMatch" )
                 .arg( tsPdeactCharge + dao.wildcardForAnySequence(  ) );
      }

      String tsSubCharge1 = tsTariffServiceDMO.getTsSubCharge1(  );

      if ( !DMO.isNull( tsSubCharge1 ) ) {
        queryArgs.andFilterBy( "TsSubCharge1Match" )
                 .arg( tsSubCharge1 + dao.wildcardForAnySequence(  ) );
      }

      String tsSubCharge2 = tsTariffServiceDMO.getTsSubCharge2(  );

      if ( !DMO.isNull( tsSubCharge2 ) ) {
        queryArgs.andFilterBy( "TsSubCharge2Match" )
                 .arg( tsSubCharge2 + dao.wildcardForAnySequence(  ) );
      }

      String tsSubCharge3 = tsTariffServiceDMO.getTsSubCharge3(  );

      if ( !DMO.isNull( tsSubCharge3 ) ) {
        queryArgs.andFilterBy( "TsSubCharge3Match" )
                 .arg( tsSubCharge3 + dao.wildcardForAnySequence(  ) );
      }

      String tsChargePeriod = tsTariffServiceDMO.getTsChargePeriod(  );

      if ( !DMO.isNull( tsChargePeriod ) ) {
        queryArgs.andFilterBy( "TsChargePeriodMatch" )
                 .arg( tsChargePeriod + dao.wildcardForAnySequence(  ) );
      }

      String tsDiscountRef = tsTariffServiceDMO.getTsDiscountRef(  );

      if ( !DMO.isNull( tsDiscountRef ) ) {
        queryArgs.andFilterBy( "TsDiscountRefMatch" )
                 .arg( tsDiscountRef + dao.wildcardForAnySequence(  ) );
      }

      String tsActInclusive = tsTariffServiceDMO.getTsActInclusive(  );

      if ( !DMO.isNull( tsActInclusive ) ) {
        queryArgs.andFilterBy( "TsActInclusiveMatch" )
                 .arg( tsActInclusive + dao.wildcardForAnySequence(  ) );
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

    //return dao.getListAbs( state, filterQueryArgs( filter, null ) );
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
    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "TsTariffService" : dmlName, parts.size(  ) );
    FilterPart part ;
    
    //for ( FilterPart part : parts ) {
    for (int i=0;i<parts.size();i++){
    	part=(FilterPart)parts.get(i);
      switch ( part.getIndex(  ) ) {
        case TsTariffServiceDMO.tsPackageCodeFilter:
          part.andFilterBy( queryArgs, "TsPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsInternalTariffFilter:
          part.andFilterBy( queryArgs, "TsInternalTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsServiceCodeFilter:
          part.andFilterBy( queryArgs, "TsServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsNetServCodeFilter:
          part.andFilterBy( queryArgs, "TsNetServCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsActChargeFilter:
          part.andFilterBy( queryArgs, "TsActCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsTdeactChargeFilter:
          part.andFilterBy( queryArgs, "TsTdeactCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsReactChargeFilter:
          part.andFilterBy( queryArgs, "TsReactCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsPdeactChargeFilter:
          part.andFilterBy( queryArgs, "TsPdeactCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsSubCharge1Filter:
          part.andFilterBy( queryArgs, "TsSubCharge1",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsSubCharge2Filter:
          part.andFilterBy( queryArgs, "TsSubCharge2",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsSubCharge3Filter:
          part.andFilterBy( queryArgs, "TsSubCharge3",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsChargePeriodFilter:
          part.andFilterBy( queryArgs, "TsChargePeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsChargeFreqFilter:
          part.andFilterBy( queryArgs, "TsChargeFreq",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsDiscountRefFilter:
          part.andFilterBy( queryArgs, "TsDiscountRef",
            dao.wildcardForAnySequence(  ) );

          break;

        case TsTariffServiceDMO.tsActInclusiveFilter:
          part.andFilterBy( queryArgs, "TsActInclusive",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of TsTariffService records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of TsTariffService records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the TsTariffService Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public TsTariffServiceDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (TsTariffServiceDMO) dao.get( args.getDMLName(  ),
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
