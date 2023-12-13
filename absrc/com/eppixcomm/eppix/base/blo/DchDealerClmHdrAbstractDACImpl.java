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
 * DchDealerClmHdr Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DchDealerClmHdrAbstractDACImpl
  extends DAC
  implements DchDealerClmHdrAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( DchDealerClmHdrAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DchDealerClmHdrDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public DchDealerClmHdrAbstractDACImpl( 

    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a DchDealerClmHdr Data Model Object
   *
   * @return a populated DchDealerClmHdr Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DchDealerClmHdrDMO get( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( DchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "DchDealerClmHdrDMO", dchDealerClmHdrDMO );

    return (DchDealerClmHdrDMO) dao.get( dchDealerClmHdrDMO );
  }

  /**
   * Creates the DchDealerClmHdr object in the database.
   *
   * @param DchDealerClmHdrDMO dchDealerClmHdrDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( dchDealerClmHdrDMO )" );
    thrower.ifParameterMissing( "DchDealerClmHdrDMO", dchDealerClmHdrDMO );

    dao.insert( dchDealerClmHdrDMO );
  }

  /**
   * Locks and retrieves the DchDealerClmHdr object from the database.
   *
   * @param aDchDealerClmHdr DchDealerClmHdr object
   *
   * @return a populated DchDealerClmHdr object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DchDealerClmHdrDMO lock( DchDealerClmHdrDMO aDchDealerClmHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aDchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "aDchDealerClmHdrDMO", aDchDealerClmHdrDMO );

    DchDealerClmHdrDMO lockedDchDealerClmHdrDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedDchDealerClmHdrDMO = (DchDealerClmHdrDMO) dao.lock( "DchDealerClmHdr",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aDchDealerClmHdrDMO.getDchClaimId(  ) ) );

    return lockedDchDealerClmHdrDMO;
  }

  /**
   * Modifies the DchDealerClmHdr object in the database.
   *
   * @param DchDealerClmHdrDMO DchDealerClmHdr object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aDchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "aDchDealerClmHdrDMO", dchDealerClmHdrDMO );

    thrower.ifParameterMissing( "DchDealerClmHdrDMO.dchClaimId",
      dchDealerClmHdrDMO.getDchClaimId(  ) );

    dao.update( dchDealerClmHdrDMO );
  }

  /**
  * Modifies the DchDealerClmHdr object using the specified filter in the database.
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

    dao.updateCustom( new DchDealerClmHdrDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the DchDealerClmHdr object from the database.
   *
   * @param DchDealerClmHdrDMO DchDealerClmHdr object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( DchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "DchDealerClmHdrDMO", dchDealerClmHdrDMO );

    thrower.ifParameterMissing( "DchDealerClmHdrDMO.dchClaimId",
      dchDealerClmHdrDMO.getDchClaimId(  ) );

    dao.delete( dchDealerClmHdrDMO );
  }

  /**
   * Deletes the DchDealerClmHdr object from the database.
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

    dao.delete( "DchDealerClmHdr", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a DchDealerClmHdr object exists.
  *
  * @param DchDealerClmHdrDMO DchDealerClmHdrDMO
  *
  * @return true if the DchDealerClmHdr object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( DchDealerClmHdrDMO DchDealerClmHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( DchDealerClmHdrDMO)" );

    return dao.exists( "DchDealerClmHdr", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( DchDealerClmHdrDMO.getDchClaimId(  ) ) );
  }

  /**
    * Return true if a DchDealerClmHdr object exists.
    *
    * @param filter
    *
    * @return true if the DchDealerClmHdr object exists.
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
   * @param locationDMO DchDealerClmHdr Data Model Object
   *
   * @return DTOList of DchDealerClmHdr Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<DchDealerClmHdrDMO> getList( 
//    DTOListState       state,
//    DchDealerClmHdrDMO dchDealerClmHdrDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, dchDealerClmHdrDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( dchDealerClmHdrDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} DchDealerClmHdrDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    DchDealerClmHdrDMO dchDealerClmHdrDMO ) {
    logger.debug( "paramQueryArgs( dchDealerClmHdrDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "DchDealerClmHdr",
        26 * 2 );

    if ( dchDealerClmHdrDMO != null ) {
      // primary key filters...
      Integer dchClaimId = dchDealerClmHdrDMO.getDchClaimId(  );

      if ( !DMO.isNull( dchClaimId ) ) {
        queryArgs.andFilterBy( "DchClaimId" )
                 .arg( dchClaimId );
      }

      // define more filters...
      String dchActType = dchDealerClmHdrDMO.getDchActType(  );

      if ( !DMO.isNull( dchActType ) ) {
        queryArgs.andFilterBy( "DchActTypeMatch" )
                 .arg( dchActType + dao.wildcardForAnySequence(  ) );
      }

      String dchSubscriberId = dchDealerClmHdrDMO.getDchSubscriberId(  );

      if ( !DMO.isNull( dchSubscriberId ) ) {
        queryArgs.andFilterBy( "DchSubscriberIdMatch" )
                 .arg( dchSubscriberId + dao.wildcardForAnySequence(  ) );
      }

      String dchImei1 = dchDealerClmHdrDMO.getDchImei1(  );

      if ( !DMO.isNull( dchImei1 ) ) {
        queryArgs.andFilterBy( "DchImei1Match" )
                 .arg( dchImei1 + dao.wildcardForAnySequence(  ) );
      }

      String dchImei2 = dchDealerClmHdrDMO.getDchImei2(  );

      if ( !DMO.isNull( dchImei2 ) ) {
        queryArgs.andFilterBy( "DchImei2Match" )
                 .arg( dchImei2 + dao.wildcardForAnySequence(  ) );
      }

      String dchSerial1 = dchDealerClmHdrDMO.getDchSerial1(  );

      if ( !DMO.isNull( dchSerial1 ) ) {
        queryArgs.andFilterBy( "DchSerial1Match" )
                 .arg( dchSerial1 + dao.wildcardForAnySequence(  ) );
      }

      String dchSerial2 = dchDealerClmHdrDMO.getDchSerial2(  );

      if ( !DMO.isNull( dchSerial2 ) ) {
        queryArgs.andFilterBy( "DchSerial2Match" )
                 .arg( dchSerial2 + dao.wildcardForAnySequence(  ) );
      }

      String dchSerial3 = dchDealerClmHdrDMO.getDchSerial3(  );

      if ( !DMO.isNull( dchSerial3 ) ) {
        queryArgs.andFilterBy( "DchSerial3Match" )
                 .arg( dchSerial3 + dao.wildcardForAnySequence(  ) );
      }

      String dchSimNo1 = dchDealerClmHdrDMO.getDchSimNo1(  );

      if ( !DMO.isNull( dchSimNo1 ) ) {
        queryArgs.andFilterBy( "DchSimNo1Match" )
                 .arg( dchSimNo1 + dao.wildcardForAnySequence(  ) );
      }
      
      String dchSimNo2 = dchDealerClmHdrDMO.getDchSimNo2(  );

      if ( !DMO.isNull( dchSimNo2 ) ) {
        queryArgs.andFilterBy( "DchSimNo2Match" )
                 .arg( dchSimNo2 + dao.wildcardForAnySequence(  ) );
      }
      
      String dchSimProd1 = dchDealerClmHdrDMO.getDchSimProd1(  );

      if ( !DMO.isNull( dchSimProd1 ) ) {
        queryArgs.andFilterBy( "DchSimProd1Match" )
                 .arg( dchSimProd1 + dao.wildcardForAnySequence(  ) );
      }
      
      String dchSimProd2 = dchDealerClmHdrDMO.getDchSimProd2(  );

      if ( !DMO.isNull( dchSimProd2 ) ) {
        queryArgs.andFilterBy( "DchSimProd2Match" )
                 .arg( dchSimProd2 + dao.wildcardForAnySequence(  ) );
      }      
      
      String dchDealerId = dchDealerClmHdrDMO.getDchDealerId(  );

      if ( !DMO.isNull( dchDealerId ) ) {
        queryArgs.andFilterBy( "DchDealerIdMatch" )
                 .arg( dchDealerId + dao.wildcardForAnySequence(  ) );
      }

      String dchPackageCode = dchDealerClmHdrDMO.getDchPackageCode(  );

      if ( !DMO.isNull( dchPackageCode ) ) {
        queryArgs.andFilterBy( "DchPackageCodeMatch" )
                 .arg( dchPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String dchUserId = dchDealerClmHdrDMO.getDchUserId(  );

      if ( !DMO.isNull( dchUserId ) ) {
        queryArgs.andFilterBy( "DchUserIdMatch" )
                 .arg( dchUserId + dao.wildcardForAnySequence(  ) );
      }

      String dchErrWarn = dchDealerClmHdrDMO.getDchErrWarn(  );

      if ( !DMO.isNull( dchErrWarn ) ) {
        queryArgs.andFilterBy( "DchErrWarnMatch" )
                 .arg( dchErrWarn + dao.wildcardForAnySequence(  ) );
      }

      String dchErrorFlag = dchDealerClmHdrDMO.getDchErrorFlag(  );

      if ( !DMO.isNull( dchErrorFlag ) ) {
        queryArgs.andFilterBy( "DchErrorFlagMatch" )
                 .arg( dchErrorFlag + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<DchDealerClmHdrDMO> getList( 
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
        ? "DchDealerClmHdr" : dmlName, parts.size(  ) );

    for ( Iterator i =  parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      
      switch ( part.getIndex(  ) ) {
        case DchDealerClmHdrDMO.dchClaimIdFilter:
          part.andFilterBy( queryArgs, "DchClaimId" );

          break;

        case DchDealerClmHdrDMO.dchActTypeFilter:
          part.andFilterBy( queryArgs, "DchActType",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchClaimDateFilter:
          part.andFilterBy( queryArgs, "DchClaimDate" );

          break;

        case DchDealerClmHdrDMO.dchContractDateFilter:
          part.andFilterBy( queryArgs, "DchContractDate" );

          break;

        case DchDealerClmHdrDMO.dchSubscriberIdFilter:
          part.andFilterBy( queryArgs, "DchSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchImei1Filter:
          part.andFilterBy( queryArgs, "DchImei1",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchImei2Filter:
          part.andFilterBy( queryArgs, "DchImei2",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchSerial1Filter:
          part.andFilterBy( queryArgs, "DchSerial1",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchSerial2Filter:
          part.andFilterBy( queryArgs, "DchSerial2",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchSerial3Filter:
          part.andFilterBy( queryArgs, "DchSerial3",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchSimNo1Filter:
          part.andFilterBy( queryArgs, "DchSimNo1",
            dao.wildcardForAnySequence(  ) );

          break;
          
        case DchDealerClmHdrDMO.dchSimNo2Filter:
            part.andFilterBy( queryArgs, "DchSimNo2",
              dao.wildcardForAnySequence(  ) );

            break;          
            
        case DchDealerClmHdrDMO.dchSimProd1Filter:
            part.andFilterBy( queryArgs, "DchSimProd1",
              dao.wildcardForAnySequence(  ) );

            break;
            
          case DchDealerClmHdrDMO.dchSimProd2Filter:
              part.andFilterBy( queryArgs, "DchSimProd2",
                dao.wildcardForAnySequence(  ) );

              break;            

        case DchDealerClmHdrDMO.dchDealerIdFilter:
          part.andFilterBy( queryArgs, "DchDealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchPackageCodeFilter:
          part.andFilterBy( queryArgs, "DchPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchImei1AmtFilter:
          part.andFilterBy( queryArgs, "DchImei1Amt" );

          break;

        case DchDealerClmHdrDMO.dchImei2AmtFilter:
          part.andFilterBy( queryArgs, "DchImei2Amt" );

          break;

        case DchDealerClmHdrDMO.dchSerial1AmtFilter:
          part.andFilterBy( queryArgs, "DchSerial1Amt" );

          break;

        case DchDealerClmHdrDMO.dchSerial2AmtFilter:
          part.andFilterBy( queryArgs, "DchSerial2Amt" );

          break;

        case DchDealerClmHdrDMO.dchSerial3AmtFilter:
          part.andFilterBy( queryArgs, "DchSerial3Amt" );

          break;

        case DchDealerClmHdrDMO.dchSimAmt1Filter:
          part.andFilterBy( queryArgs, "DchSimAmt1" );

          break;
          
        case DchDealerClmHdrDMO.dchSimAmt2Filter:
            part.andFilterBy( queryArgs, "DchSimAmt2" );

            break;          

        case DchDealerClmHdrDMO.dchClmAmtFilter:
          part.andFilterBy( queryArgs, "DchClmAmt" );

          break;

        case DchDealerClmHdrDMO.dchSaveDateFilter:
          part.andFilterBy( queryArgs, "DchSaveDate" );

          break;

        case DchDealerClmHdrDMO.dchUserIdFilter:
          part.andFilterBy( queryArgs, "DchUserId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchErrWarnFilter:
          part.andFilterBy( queryArgs, "DchErrWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchSubmitDateFilter:
          part.andFilterBy( queryArgs, "DchSubmitDate" );

          break;

        case DchDealerClmHdrDMO.dchErrorFlagFilter:
          part.andFilterBy( queryArgs, "DchErrorFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case DchDealerClmHdrDMO.dchErrRetryCntFilter:
          part.andFilterBy( queryArgs, "DchErrRetryCnt" );

          break;

        case DchDealerClmHdrDMO.dchSourceSystemFilter:
            part.andFilterBy( queryArgs, "DchSourceSystem" );

            break;
            
        case DchDealerClmHdrDMO.dchOfferIdFilter:
            part.andFilterBy( queryArgs, "DchOfferId" );

            break;
            
        case DchDealerClmHdrDMO.dchGroupIndexFilter:
            part.andFilterBy( queryArgs, "DchGroupIndex" );

            break;
            
        case DchDealerClmHdrDMO.dchCreateDateFilter:
            part.andFilterBy( queryArgs, "DchCreateDate" );

            break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of DchDealerClmHdr records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of DchDealerClmHdr records based
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
   * Retrieves the DchDealerClmHdr Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public DchDealerClmHdrDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (DchDealerClmHdrDMO) dao.get( args.getDMLName(  ),
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
