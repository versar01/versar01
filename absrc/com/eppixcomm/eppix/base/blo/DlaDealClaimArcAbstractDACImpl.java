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
 * DlaDealClaimArc Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DlaDealClaimArcAbstractDACImpl
  extends DAC
  implements DlaDealClaimArcAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( DlaDealClaimArcAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DlaDealClaimArcDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public DlaDealClaimArcAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a DlaDealClaimArc Data Model Object
   *
   * @return a populated DlaDealClaimArc Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DlaDealClaimArcDMO get( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( DlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "DlaDealClaimArcDMO", dlaDealClaimArcDMO );

    return (DlaDealClaimArcDMO) dao.get( dlaDealClaimArcDMO );
  }

  /**
   * Creates the DlaDealClaimArc object in the database.
   *
   * @param DlaDealClaimArcDMO dlaDealClaimArcDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( dlaDealClaimArcDMO )" );
    thrower.ifParameterMissing( "DlaDealClaimArcDMO", dlaDealClaimArcDMO );

    dao.insert( dlaDealClaimArcDMO );
  }

  /**
   * Locks and retrieves the DlaDealClaimArc object from the database.
   *
   * @param aDlaDealClaimArc DlaDealClaimArc object
   *
   * @return a populated DlaDealClaimArc object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DlaDealClaimArcDMO lock( DlaDealClaimArcDMO aDlaDealClaimArcDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aDlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "aDlaDealClaimArcDMO", aDlaDealClaimArcDMO );

    DlaDealClaimArcDMO lockedDlaDealClaimArcDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedDlaDealClaimArcDMO = (DlaDealClaimArcDMO) dao.lock( "DlaDealClaimArc",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aDlaDealClaimArcDMO.getDlaClaimId(  ) ) );

    return lockedDlaDealClaimArcDMO;
  }

  /**
   * Modifies the DlaDealClaimArc object in the database.
   *
   * @param DlaDealClaimArcDMO DlaDealClaimArc object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aDlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "aDlaDealClaimArcDMO", dlaDealClaimArcDMO );

    thrower.ifParameterMissing( "DlaDealClaimArcDMO.dlaClaimId",
      dlaDealClaimArcDMO.getDlaClaimId(  ) );

    dao.update( dlaDealClaimArcDMO );
  }

  /**
  * Modifies the DlaDealClaimArc object using the specified filter in the database.
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

    dao.updateCustom( new DlaDealClaimArcDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the DlaDealClaimArc object from the database.
   *
   * @param DlaDealClaimArcDMO DlaDealClaimArc object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( DlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "DlaDealClaimArcDMO", dlaDealClaimArcDMO );

    thrower.ifParameterMissing( "DlaDealClaimArcDMO.dlaClaimId",
      dlaDealClaimArcDMO.getDlaClaimId(  ) );

    dao.delete( dlaDealClaimArcDMO );
  }

  /**
   * Deletes the DlaDealClaimArc object from the database.
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

    dao.delete( "DlaDealClaimArc", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a DlaDealClaimArc object exists.
  *
  * @param DlaDealClaimArcDMO DlaDealClaimArcDMO
  *
  * @return true if the DlaDealClaimArc object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( DlaDealClaimArcDMO DlaDealClaimArcDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( DlaDealClaimArcDMO)" );

    return dao.exists( "DlaDealClaimArc", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( DlaDealClaimArcDMO.getDlaClaimId(  ) ) );
  }

  /**
    * Return true if a DlaDealClaimArc object exists.
    *
    * @param filter
    *
    * @return true if the DlaDealClaimArc object exists.
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
   * @param locationDMO DlaDealClaimArc Data Model Object
   *
   * @return DTOList of DlaDealClaimArc Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<DlaDealClaimArcDMO> getList( 
//    DTOListState       state,
//    DlaDealClaimArcDMO dlaDealClaimArcDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, dlaDealClaimArcDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( dlaDealClaimArcDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} DlaDealClaimArcDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    DlaDealClaimArcDMO dlaDealClaimArcDMO ) {
    logger.debug( "paramQueryArgs( dlaDealClaimArcDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "DlaDealClaimArc",
        26 * 2 );

    if ( dlaDealClaimArcDMO != null ) {
      // primary key filters...
      Integer dlaClaimId = dlaDealClaimArcDMO.getDlaClaimId(  );

      if ( !DMO.isNull( dlaClaimId ) ) {
        queryArgs.andFilterBy( "DlaClaimId" )
                 .arg( dlaClaimId );
      }

      // define more filters...
      String dlaActType = dlaDealClaimArcDMO.getDlaActType(  );

      if ( !DMO.isNull( dlaActType ) ) {
        queryArgs.andFilterBy( "DlaActTypeMatch" )
                 .arg( dlaActType + dao.wildcardForAnySequence(  ) );
      }

      String dlaSubscriberId = dlaDealClaimArcDMO.getDlaSubscriberId(  );

      if ( !DMO.isNull( dlaSubscriberId ) ) {
        queryArgs.andFilterBy( "DlaSubscriberIdMatch" )
                 .arg( dlaSubscriberId + dao.wildcardForAnySequence(  ) );
      }

      String dlaImei1 = dlaDealClaimArcDMO.getDlaImei1(  );

      if ( !DMO.isNull( dlaImei1 ) ) {
        queryArgs.andFilterBy( "DlaImei1Match" )
                 .arg( dlaImei1 + dao.wildcardForAnySequence(  ) );
      }

      String dlaImei2 = dlaDealClaimArcDMO.getDlaImei2(  );

      if ( !DMO.isNull( dlaImei2 ) ) {
        queryArgs.andFilterBy( "DlaImei2Match" )
                 .arg( dlaImei2 + dao.wildcardForAnySequence(  ) );
      }

      String dlaSerial1 = dlaDealClaimArcDMO.getDlaSerial1(  );

      if ( !DMO.isNull( dlaSerial1 ) ) {
        queryArgs.andFilterBy( "DlaSerial1Match" )
                 .arg( dlaSerial1 + dao.wildcardForAnySequence(  ) );
      }

      String dlaSerial2 = dlaDealClaimArcDMO.getDlaSerial2(  );

      if ( !DMO.isNull( dlaSerial2 ) ) {
        queryArgs.andFilterBy( "DlaSerial2Match" )
                 .arg( dlaSerial2 + dao.wildcardForAnySequence(  ) );
      }

      String dlaSerial3 = dlaDealClaimArcDMO.getDlaSerial3(  );

      if ( !DMO.isNull( dlaSerial3 ) ) {
        queryArgs.andFilterBy( "DlaSerial3Match" )
                 .arg( dlaSerial3 + dao.wildcardForAnySequence(  ) );
      }

      String dlaSimNo1 = dlaDealClaimArcDMO.getDlaSimNo1(  );

      if ( !DMO.isNull( dlaSimNo1 ) ) {
        queryArgs.andFilterBy( "DlaSimNo1Match" )
                 .arg( dlaSimNo1 + dao.wildcardForAnySequence(  ) );
      }
      
      String dlaSimNo2 = dlaDealClaimArcDMO.getDlaSimNo2(  );

      if ( !DMO.isNull( dlaSimNo2 ) ) {
        queryArgs.andFilterBy( "DlaSimNo2Match" )
                 .arg( dlaSimNo2 + dao.wildcardForAnySequence(  ) );
      }
      
      String dlaSimProd1 = dlaDealClaimArcDMO.getDlaSimProd1(  );

      if ( !DMO.isNull( dlaSimProd1 ) ) {
        queryArgs.andFilterBy( "DlaSimProd1Match" )
                 .arg( dlaSimProd1 + dao.wildcardForAnySequence(  ) );
      }    
      
      String dlaSimProd2 = dlaDealClaimArcDMO.getDlaSimProd2(  );

      if ( !DMO.isNull( dlaSimProd2 ) ) {
        queryArgs.andFilterBy( "DlaSimProd2Match" )
                 .arg( dlaSimProd2 + dao.wildcardForAnySequence(  ) );
      }      

      String dlaDealerId = dlaDealClaimArcDMO.getDlaDealerId(  );

      if ( !DMO.isNull( dlaDealerId ) ) {
        queryArgs.andFilterBy( "DlaDealerIdMatch" )
                 .arg( dlaDealerId + dao.wildcardForAnySequence(  ) );
      }

      String dlaPackageCode = dlaDealClaimArcDMO.getDlaPackageCode(  );

      if ( !DMO.isNull( dlaPackageCode ) ) {
        queryArgs.andFilterBy( "DlaPackageCodeMatch" )
                 .arg( dlaPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String dlaUserId = dlaDealClaimArcDMO.getDlaUserId(  );

      if ( !DMO.isNull( dlaUserId ) ) {
        queryArgs.andFilterBy( "DlaUserIdMatch" )
                 .arg( dlaUserId + dao.wildcardForAnySequence(  ) );
      }

      String dlaErrWarn = dlaDealClaimArcDMO.getDlaErrWarn(  );

      if ( !DMO.isNull( dlaErrWarn ) ) {
        queryArgs.andFilterBy( "DlaErrWarnMatch" )
                 .arg( dlaErrWarn + dao.wildcardForAnySequence(  ) );
      }

      String dlaErrorFlag = dlaDealClaimArcDMO.getDlaErrorFlag(  );

      if ( !DMO.isNull( dlaErrorFlag ) ) {
        queryArgs.andFilterBy( "DlaErrorFlagMatch" )
                 .arg( dlaErrorFlag + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<DlaDealClaimArcDMO> getList( 
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
        ? "DlaDealClaimArc" : dmlName, parts.size(  ) );

    for ( Iterator i =  parts.iterator(); i.hasNext();  ) {
      FilterPart part = (FilterPart) i.next();
      switch ( part.getIndex(  ) ) {
        case DlaDealClaimArcDMO.dlaClaimIdFilter:
          part.andFilterBy( queryArgs, "DlaClaimId" );

          break;

        case DlaDealClaimArcDMO.dlaActTypeFilter:
          part.andFilterBy( queryArgs, "DlaActType",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaClaimDateFilter:
          part.andFilterBy( queryArgs, "DlaClaimDate" );

          break;

        case DlaDealClaimArcDMO.dlaContractDateFilter:
          part.andFilterBy( queryArgs, "DlaContractDate" );

          break;

        case DlaDealClaimArcDMO.dlaSubscriberIdFilter:
          part.andFilterBy( queryArgs, "DlaSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaImei1Filter:
          part.andFilterBy( queryArgs, "DlaImei1",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaImei2Filter:
          part.andFilterBy( queryArgs, "DlaImei2",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaSerial1Filter:
          part.andFilterBy( queryArgs, "DlaSerial1",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaSerial2Filter:
          part.andFilterBy( queryArgs, "DlaSerial2",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaSerial3Filter:
          part.andFilterBy( queryArgs, "DlaSerial3",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaSimNo1Filter:
          part.andFilterBy( queryArgs, "DlaSimNo1",
            dao.wildcardForAnySequence(  ) );

          break;
          
        case DlaDealClaimArcDMO.dlaSimNo2Filter:
            part.andFilterBy( queryArgs, "DlaSimNo2",
              dao.wildcardForAnySequence(  ) );

            break;          
            
        case DlaDealClaimArcDMO.dlaSimProd1Filter:
            part.andFilterBy( queryArgs, "DlaSimProd1",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case DlaDealClaimArcDMO.dlaSimProd2Filter:
            part.andFilterBy( queryArgs, "DlaSimProd2",
              dao.wildcardForAnySequence(  ) );

            break;            

        case DlaDealClaimArcDMO.dlaDealerIdFilter:
          part.andFilterBy( queryArgs, "DlaDealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaPackageCodeFilter:
          part.andFilterBy( queryArgs, "DlaPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaImei1AmtFilter:
          part.andFilterBy( queryArgs, "DlaImei1Amt" );

          break;

        case DlaDealClaimArcDMO.dlaImei2AmtFilter:
          part.andFilterBy( queryArgs, "DlaImei2Amt" );

          break;

        case DlaDealClaimArcDMO.dlaSerial1AmtFilter:
          part.andFilterBy( queryArgs, "DlaSerial1Amt" );

          break;

        case DlaDealClaimArcDMO.dlaSerial2AmtFilter:
          part.andFilterBy( queryArgs, "DlaSerial2Amt" );

          break;

        case DlaDealClaimArcDMO.dlaSerial3AmtFilter:
          part.andFilterBy( queryArgs, "DlaSerial3Amt" );

          break;

        case DlaDealClaimArcDMO.dlaSimAmt1Filter:
          part.andFilterBy( queryArgs, "DlaSimAmt1" );

          break;
          
        case DlaDealClaimArcDMO.dlaSimAmt2Filter:
            part.andFilterBy( queryArgs, "DlaSimAmt2" );

            break;          

        case DlaDealClaimArcDMO.dlaClmAmtFilter:
          part.andFilterBy( queryArgs, "DlaClmAmt" );

          break;

        case DlaDealClaimArcDMO.dlaSaveDateFilter:
          part.andFilterBy( queryArgs, "DlaSaveDate" );

          break;

        case DlaDealClaimArcDMO.dlaUserIdFilter:
          part.andFilterBy( queryArgs, "DlaUserId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaErrWarnFilter:
          part.andFilterBy( queryArgs, "DlaErrWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaSubmitDateFilter:
          part.andFilterBy( queryArgs, "DlaSubmitDate" );

          break;

        case DlaDealClaimArcDMO.dlaErrorFlagFilter:
          part.andFilterBy( queryArgs, "DlaErrorFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case DlaDealClaimArcDMO.dlaErrRetryCntFilter:
          part.andFilterBy( queryArgs, "DlaErrRetryCnt" );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of DlaDealClaimArc records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of DlaDealClaimArc records based
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
   * Retrieves the DlaDealClaimArc Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public DlaDealClaimArcDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (DlaDealClaimArcDMO) dao.get( args.getDMLName(  ),
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
