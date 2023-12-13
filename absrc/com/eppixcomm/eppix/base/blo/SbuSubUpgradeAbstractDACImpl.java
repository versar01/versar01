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
 * SbuSubUpgrade Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SbuSubUpgradeAbstractDACImpl
  extends DAC
  implements SbuSubUpgradeAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SbuSubUpgradeAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbuSubUpgradeDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SbuSubUpgradeAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Creates the SbuSubUpgrade object in the database.
   *
   * @param SbuSubUpgradeDMO sbuSubUpgradeDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SbuSubUpgradeDMO sbuSubUpgradeDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( sbuSubUpgradeDMO )" );
    thrower.ifParameterMissing( "SbuSubUpgradeDMO", sbuSubUpgradeDMO );

    dao.insert( sbuSubUpgradeDMO );
  }

  /**
   * Locks and retrieves the SbuSubUpgrade object from the database.
   *
   * @param aSbuSubUpgrade SbuSubUpgrade object
   *
   * @return a populated SbuSubUpgrade object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SbuSubUpgradeDMO lock( SbuSubUpgradeDMO aSbuSubUpgradeDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSbuSubUpgradeDMO )" );

    thrower.ifParameterMissing( "aSbuSubUpgradeDMO", aSbuSubUpgradeDMO );

    SbuSubUpgradeDMO lockedSbuSubUpgradeDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSbuSubUpgradeDMO = (SbuSubUpgradeDMO) dao.lock( "SbuSubUpgrade",
        "filterByPrimaryKey", new DAOArgs( 0 ) );

    return lockedSbuSubUpgradeDMO;
  }

  /**
  * Modifies the SbuSubUpgrade object using the specified filter in the database.
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

    dao.updateCustom( new SbuSubUpgradeDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SbuSubUpgrade object from the database.
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

    dao.delete( "SbuSubUpgrade", args.getFilterBy(  ), args );
  }

  /**
    * Return true if a SbuSubUpgrade object exists.
    *
    * @param filter
    *
    * @return true if the SbuSubUpgrade object exists.
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
   * @param locationDMO SbuSubUpgrade Data Model Object
   *
   * @return DTOList of SbuSubUpgrade Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<SbuSubUpgradeDMO> getList( 
//    DTOListState     state,
//    SbuSubUpgradeDMO sbuSubUpgradeDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, sbuSubUpgradeDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( sbuSubUpgradeDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SbuSubUpgradeDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    SbuSubUpgradeDMO sbuSubUpgradeDMO ) {
    logger.debug( "paramQueryArgs( sbuSubUpgradeDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SbuSubUpgrade",
        30 * 2 );

    if ( sbuSubUpgradeDMO != null ) {
      // primary key filters...
      // define more filters...
      String sbuDealerId = sbuSubUpgradeDMO.getSbuDealerId(  );

      if ( !DMO.isNull( sbuDealerId ) ) {
        queryArgs.andFilterBy( "SbuDealerIdMatch" )
                 .arg( sbuDealerId + dao.wildcardForAnySequence(  ) );
      }

      String sbuSalesPerson = sbuSubUpgradeDMO.getSbuSalesPerson(  );

      if ( !DMO.isNull( sbuSalesPerson ) ) {
        queryArgs.andFilterBy( "SbuSalesPersonMatch" )
                 .arg( sbuSalesPerson + dao.wildcardForAnySequence(  ) );
      }

      String sbuUpgradeQual = sbuSubUpgradeDMO.getSbuUpgradeQual(  );

      if ( !DMO.isNull( sbuUpgradeQual ) ) {
        queryArgs.andFilterBy( "SbuUpgradeQualMatch" )
                 .arg( sbuUpgradeQual + dao.wildcardForAnySequence(  ) );
      }

      String sbuComment = sbuSubUpgradeDMO.getSbuComment(  );

      if ( !DMO.isNull( sbuComment ) ) {
        queryArgs.andFilterBy( "SbuCommentMatch" )
                 .arg( sbuComment + dao.wildcardForAnySequence(  ) );
      }

      String sbuUserId = sbuSubUpgradeDMO.getSbuUserId(  );

      if ( !DMO.isNull( sbuUserId ) ) {
        queryArgs.andFilterBy( "SbuUserIdMatch" )
                 .arg( sbuUserId + dao.wildcardForAnySequence(  ) );
      }

      String sbuImei = sbuSubUpgradeDMO.getSbuImei(  );

      if ( !DMO.isNull( sbuImei ) ) {
        queryArgs.andFilterBy( "SbuImeiMatch" )
                 .arg( sbuImei + dao.wildcardForAnySequence(  ) );
      }

      String sbuRegionCode = sbuSubUpgradeDMO.getSbuRegionCode(  );

      if ( !DMO.isNull( sbuRegionCode ) ) {
        queryArgs.andFilterBy( "SbuRegionCodeMatch" )
                 .arg( sbuRegionCode + dao.wildcardForAnySequence(  ) );
      }

      String sbuAccountStatus = sbuSubUpgradeDMO.getSbuAccountStatus(  );

      if ( !DMO.isNull( sbuAccountStatus ) ) {
        queryArgs.andFilterBy( "SbuAccountStatusMatch" )
                 .arg( sbuAccountStatus + dao.wildcardForAnySequence(  ) );
      }

      String sbuCollPlan = sbuSubUpgradeDMO.getSbuCollPlan(  );

      if ( !DMO.isNull( sbuCollPlan ) ) {
        queryArgs.andFilterBy( "SbuCollPlanMatch" )
                 .arg( sbuCollPlan + dao.wildcardForAnySequence(  ) );
      }

      String sbuMtnStatus = sbuSubUpgradeDMO.getSbuMtnStatus(  );

      if ( !DMO.isNull( sbuMtnStatus ) ) {
        queryArgs.andFilterBy( "SbuMtnStatusMatch" )
                 .arg( sbuMtnStatus + dao.wildcardForAnySequence(  ) );
      }

      String sbuCustomerType = sbuSubUpgradeDMO.getSbuCustomerType(  );

      if ( !DMO.isNull( sbuCustomerType ) ) {
        queryArgs.andFilterBy( "SbuCustomerTypeMatch" )
                 .arg( sbuCustomerType + dao.wildcardForAnySequence(  ) );
      }

      String sbuTariffCode = sbuSubUpgradeDMO.getSbuTariffCode(  );

      if ( !DMO.isNull( sbuTariffCode ) ) {
        queryArgs.andFilterBy( "SbuTariffCodeMatch" )
                 .arg( sbuTariffCode + dao.wildcardForAnySequence(  ) );
      }

      String sbuPackageCode = sbuSubUpgradeDMO.getSbuPackageCode(  );

      if ( !DMO.isNull( sbuPackageCode ) ) {
        queryArgs.andFilterBy( "SbuPackageCodeMatch" )
                 .arg( sbuPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String sbuPaymentPlan = sbuSubUpgradeDMO.getSbuPaymentPlan(  );

      if ( !DMO.isNull( sbuPaymentPlan ) ) {
        queryArgs.andFilterBy( "SbuPaymentPlanMatch" )
                 .arg( sbuPaymentPlan + dao.wildcardForAnySequence(  ) );
      }

      String sbuAgeingBucket = sbuSubUpgradeDMO.getSbuAgeingBucket(  );

      if ( !DMO.isNull( sbuAgeingBucket ) ) {
        queryArgs.andFilterBy( "SbuAgeingBucketMatch" )
                 .arg( sbuAgeingBucket + dao.wildcardForAnySequence(  ) );
      }

      String sbuUpgradeStatus = sbuSubUpgradeDMO.getSbuUpgradeStatus(  );

      if ( !DMO.isNull( sbuUpgradeStatus ) ) {
        queryArgs.andFilterBy( "SbuUpgradeStatusMatch" )
                 .arg( sbuUpgradeStatus + dao.wildcardForAnySequence(  ) );
      }

      String sbuChannel = sbuSubUpgradeDMO.getSbuChannel(  );

      if ( !DMO.isNull( sbuChannel ) ) {
        queryArgs.andFilterBy( "SbuChannelMatch" )
                 .arg( sbuChannel + dao.wildcardForAnySequence(  ) );
      }

      String sbuRecordStatus = sbuSubUpgradeDMO.getSbuRecordStatus(  );

      if ( !DMO.isNull( sbuRecordStatus ) ) {
        queryArgs.andFilterBy( "SbuRecordStatusMatch" )
                 .arg( sbuRecordStatus + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<SbuSubUpgradeDMO> getList( 
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
        ? "SbuSubUpgrade" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      switch ( part.getIndex(  ) ) {
        case SbuSubUpgradeDMO.sbuSubupgradeIdFilter:
          part.andFilterBy( queryArgs, "SbuSubupgradeId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuSubscriberIdFilter:
          part.andFilterBy( queryArgs, "SbuSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuDealerIdFilter:
          part.andFilterBy( queryArgs, "SbuDealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuSalesPersonFilter:
          part.andFilterBy( queryArgs, "SbuSalesPerson",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuUpgradeQualFilter:
          part.andFilterBy( queryArgs, "SbuUpgradeQual",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuCommentFilter:
          part.andFilterBy( queryArgs, "SbuComment",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuUserIdFilter:
          part.andFilterBy( queryArgs, "SbuUserId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuModelIdFilter:
          part.andFilterBy( queryArgs, "SbuModelId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuContractLenFilter:
          part.andFilterBy( queryArgs, "SbuContractLen",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuCostFilter:
          part.andFilterBy( queryArgs, "SbuCost",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuImeiFilter:
          part.andFilterBy( queryArgs, "SbuImei",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuRegionCodeFilter:
          part.andFilterBy( queryArgs, "SbuRegionCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuAccountStatusFilter:
          part.andFilterBy( queryArgs, "SbuAccountStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuCollPlanFilter:
          part.andFilterBy( queryArgs, "SbuCollPlan",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuMtnStatusFilter:
          part.andFilterBy( queryArgs, "SbuMtnStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuActivateDateFilter:
          part.andFilterBy( queryArgs, "SbuActivateDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuDeactDateFilter:
          part.andFilterBy( queryArgs, "SbuDeactDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuContractAgeFilter:
          part.andFilterBy( queryArgs, "SbuContractAge",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuCustomerTypeFilter:
          part.andFilterBy( queryArgs, "SbuCustomerType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuTariffCodeFilter:
          part.andFilterBy( queryArgs, "SbuTariffCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuPackageCodeFilter:
          part.andFilterBy( queryArgs, "SbuPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuPaymentPlanFilter:
          part.andFilterBy( queryArgs, "SbuPaymentPlan",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuTermDateFilter:
          part.andFilterBy( queryArgs, "SbuTermDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuAgeingBucketFilter:
          part.andFilterBy( queryArgs, "SbuAgeingBucket",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuAveragespendFilter:
          part.andFilterBy( queryArgs, "SbuAveragespend",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuDateprocessedFilter:
          part.andFilterBy( queryArgs, "SbuDateprocessed",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuDateapprovedFilter:
          part.andFilterBy( queryArgs, "SbuDateapproved",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuUpgradeStatusFilter:
          part.andFilterBy( queryArgs, "SbuUpgradeStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuChannelFilter:
          part.andFilterBy( queryArgs, "SbuChannel",
            dao.wildcardForAnySequence(  ) );

          break;

        case SbuSubUpgradeDMO.sbuRecordStatusFilter:
          part.andFilterBy( queryArgs, "SbuRecordStatus",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SbuSubUpgrade records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SbuSubUpgrade records based
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
   * Retrieves the SbuSubUpgrade Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SbuSubUpgradeDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SbuSubUpgradeDMO) dao.get( args.getDMLName(  ),
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
