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
 * PtmPermToMarket Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PtmPermToMarketAbstractDACImpl
  extends DAC
  implements PtmPermToMarketAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PtmPermToMarketAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PtmPermToMarketDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PtmPermToMarketAbstractDACImpl( 
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PtmPermToMarket Data Model Object
   *
   * @return a populated PtmPermToMarket Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PtmPermToMarketDMO get( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PtmPermToMarketDMO )" );

    thrower.ifParameterMissing( "PtmPermToMarketDMO", ptmPermToMarketDMO );

    return (PtmPermToMarketDMO) dao.get( ptmPermToMarketDMO );
  }

  /**
   * Creates the PtmPermToMarket object in the database.
   *
   * @param PtmPermToMarketDMO ptmPermToMarketDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( ptmPermToMarketDMO )" );
    thrower.ifParameterMissing( "PtmPermToMarketDMO", ptmPermToMarketDMO );

    dao.insert( ptmPermToMarketDMO );
  }

  /**
   * Locks and retrieves the PtmPermToMarket object from the database.
   *
   * @param aPtmPermToMarket PtmPermToMarket object
   *
   * @return a populated PtmPermToMarket object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PtmPermToMarketDMO lock( PtmPermToMarketDMO aPtmPermToMarketDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPtmPermToMarketDMO )" );

    thrower.ifParameterMissing( "aPtmPermToMarketDMO", aPtmPermToMarketDMO );

    PtmPermToMarketDMO lockedPtmPermToMarketDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPtmPermToMarketDMO = (PtmPermToMarketDMO) dao.lock( "PtmPermToMarket",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aPtmPermToMarketDMO.getPtmBillAcNo(  ) ) );

    return lockedPtmPermToMarketDMO;
  }

  /**
   * Modifies the PtmPermToMarket object in the database.
   *
   * @param PtmPermToMarketDMO PtmPermToMarket object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPtmPermToMarketDMO )" );

    thrower.ifParameterMissing( "aPtmPermToMarketDMO", ptmPermToMarketDMO );

    thrower.ifParameterMissing( "PtmPermToMarketDMO.ptmBillAcNo",
      ptmPermToMarketDMO.getPtmBillAcNo(  ) );

    dao.update( ptmPermToMarketDMO );
  }

  /**
  * Modifies the PtmPermToMarket object using the specified filter in the database.
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

    dao.updateCustom( new PtmPermToMarketDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PtmPermToMarket object from the database.
   *
   * @param PtmPermToMarketDMO PtmPermToMarket object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PtmPermToMarketDMO )" );

    thrower.ifParameterMissing( "PtmPermToMarketDMO", ptmPermToMarketDMO );

    thrower.ifParameterMissing( "PtmPermToMarketDMO.ptmBillAcNo",
      ptmPermToMarketDMO.getPtmBillAcNo(  ) );

    dao.delete( ptmPermToMarketDMO );
  }

  /**
   * Deletes the PtmPermToMarket object from the database.
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

    dao.delete( "PtmPermToMarket", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PtmPermToMarket object exists.
  *
  * @param PtmPermToMarketDMO PtmPermToMarketDMO
  *
  * @return true if the PtmPermToMarket object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PtmPermToMarketDMO PtmPermToMarketDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PtmPermToMarketDMO)" );

    return dao.exists( "PtmPermToMarket", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( PtmPermToMarketDMO.getPtmBillAcNo(  ) ) );
  }

  /**
    * Return true if a PtmPermToMarket object exists.
    *
    * @param filter
    *
    * @return true if the PtmPermToMarket object exists.
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
   * @param locationDMO PtmPermToMarket Data Model Object
   *
   * @return DTOList of PtmPermToMarket Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<PtmPermToMarketDMO> getList( 
//    DTOListState       state,
//    PtmPermToMarketDMO ptmPermToMarketDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, ptmPermToMarketDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( ptmPermToMarketDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PtmPermToMarketDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PtmPermToMarketDMO ptmPermToMarketDMO ) {
    logger.debug( "paramQueryArgs( ptmPermToMarketDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PtmPermToMarket",
        37 * 2 );

    if ( ptmPermToMarketDMO != null ) {
      // primary key filters...
      String ptmBillAcNo = ptmPermToMarketDMO.getPtmBillAcNo(  );

      if ( !DMO.isNull( ptmBillAcNo ) ) {
        queryArgs.andFilterBy( "PtmBillAcNoMatch" )
                 .arg( ptmBillAcNo + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String ptmInd = ptmPermToMarketDMO.getPtmInd(  );

      if ( !DMO.isNull( ptmInd ) ) {
        queryArgs.andFilterBy( "PtmIndMatch" )
                 .arg( ptmInd + dao.wildcardForAnySequence(  ) );
      }

      String ptmTitle = ptmPermToMarketDMO.getPtmTitle(  );

      if ( !DMO.isNull( ptmTitle ) ) {
        queryArgs.andFilterBy( "PtmTitleMatch" )
                 .arg( ptmTitle + dao.wildcardForAnySequence(  ) );
      }

      String ptmSurname = ptmPermToMarketDMO.getPtmSurname(  );

      if ( !DMO.isNull( ptmSurname ) ) {
        queryArgs.andFilterBy( "PtmSurnameMatch" )
                 .arg( ptmSurname + dao.wildcardForAnySequence(  ) );
      }

      String ptmFirstname = ptmPermToMarketDMO.getPtmFirstname(  );

      if ( !DMO.isNull( ptmFirstname ) ) {
        queryArgs.andFilterBy( "PtmFirstnameMatch" )
                 .arg( ptmFirstname + dao.wildcardForAnySequence(  ) );
      }

      String ptmPrefComms = ptmPermToMarketDMO.getPtmPrefComms(  );

      if ( !DMO.isNull( ptmPrefComms ) ) {
        queryArgs.andFilterBy( "PtmPrefCommsMatch" )
                 .arg( ptmPrefComms + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis1 = ptmPermToMarketDMO.getPtmAnalysis1(  );

      if ( !DMO.isNull( ptmAnalysis1 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis1Match" )
                 .arg( ptmAnalysis1 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis2 = ptmPermToMarketDMO.getPtmAnalysis2(  );

      if ( !DMO.isNull( ptmAnalysis2 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis2Match" )
                 .arg( ptmAnalysis2 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis3 = ptmPermToMarketDMO.getPtmAnalysis3(  );

      if ( !DMO.isNull( ptmAnalysis3 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis3Match" )
                 .arg( ptmAnalysis3 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis4 = ptmPermToMarketDMO.getPtmAnalysis4(  );

      if ( !DMO.isNull( ptmAnalysis4 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis4Match" )
                 .arg( ptmAnalysis4 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis5 = ptmPermToMarketDMO.getPtmAnalysis5(  );

      if ( !DMO.isNull( ptmAnalysis5 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis5Match" )
                 .arg( ptmAnalysis5 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis6 = ptmPermToMarketDMO.getPtmAnalysis6(  );

      if ( !DMO.isNull( ptmAnalysis6 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis6Match" )
                 .arg( ptmAnalysis6 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis7 = ptmPermToMarketDMO.getPtmAnalysis7(  );

      if ( !DMO.isNull( ptmAnalysis7 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis7Match" )
                 .arg( ptmAnalysis7 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis8 = ptmPermToMarketDMO.getPtmAnalysis8(  );

      if ( !DMO.isNull( ptmAnalysis8 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis8Match" )
                 .arg( ptmAnalysis8 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis9 = ptmPermToMarketDMO.getPtmAnalysis9(  );

      if ( !DMO.isNull( ptmAnalysis9 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis9Match" )
                 .arg( ptmAnalysis9 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis10 = ptmPermToMarketDMO.getPtmAnalysis10(  );

      if ( !DMO.isNull( ptmAnalysis10 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis10Match" )
                 .arg( ptmAnalysis10 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis11 = ptmPermToMarketDMO.getPtmAnalysis11(  );

      if ( !DMO.isNull( ptmAnalysis11 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis11Match" )
                 .arg( ptmAnalysis11 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis12 = ptmPermToMarketDMO.getPtmAnalysis12(  );

      if ( !DMO.isNull( ptmAnalysis12 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis12Match" )
                 .arg( ptmAnalysis12 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis13 = ptmPermToMarketDMO.getPtmAnalysis13(  );

      if ( !DMO.isNull( ptmAnalysis13 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis13Match" )
                 .arg( ptmAnalysis13 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis14 = ptmPermToMarketDMO.getPtmAnalysis14(  );

      if ( !DMO.isNull( ptmAnalysis14 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis14Match" )
                 .arg( ptmAnalysis14 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis15 = ptmPermToMarketDMO.getPtmAnalysis15(  );

      if ( !DMO.isNull( ptmAnalysis15 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis15Match" )
                 .arg( ptmAnalysis15 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis16 = ptmPermToMarketDMO.getPtmAnalysis16(  );

      if ( !DMO.isNull( ptmAnalysis16 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis16Match" )
                 .arg( ptmAnalysis16 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis17 = ptmPermToMarketDMO.getPtmAnalysis17(  );

      if ( !DMO.isNull( ptmAnalysis17 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis17Match" )
                 .arg( ptmAnalysis17 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis18 = ptmPermToMarketDMO.getPtmAnalysis18(  );

      if ( !DMO.isNull( ptmAnalysis18 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis18Match" )
                 .arg( ptmAnalysis18 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis19 = ptmPermToMarketDMO.getPtmAnalysis19(  );

      if ( !DMO.isNull( ptmAnalysis19 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis19Match" )
                 .arg( ptmAnalysis19 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis20 = ptmPermToMarketDMO.getPtmAnalysis20(  );

      if ( !DMO.isNull( ptmAnalysis20 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis20Match" )
                 .arg( ptmAnalysis20 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis21 = ptmPermToMarketDMO.getPtmAnalysis21(  );

      if ( !DMO.isNull( ptmAnalysis21 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis21Match" )
                 .arg( ptmAnalysis21 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis22 = ptmPermToMarketDMO.getPtmAnalysis22(  );

      if ( !DMO.isNull( ptmAnalysis22 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis22Match" )
                 .arg( ptmAnalysis22 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis23 = ptmPermToMarketDMO.getPtmAnalysis23(  );

      if ( !DMO.isNull( ptmAnalysis23 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis23Match" )
                 .arg( ptmAnalysis23 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis24 = ptmPermToMarketDMO.getPtmAnalysis24(  );

      if ( !DMO.isNull( ptmAnalysis24 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis24Match" )
                 .arg( ptmAnalysis24 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis25 = ptmPermToMarketDMO.getPtmAnalysis25(  );

      if ( !DMO.isNull( ptmAnalysis25 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis25Match" )
                 .arg( ptmAnalysis25 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis26 = ptmPermToMarketDMO.getPtmAnalysis26(  );

      if ( !DMO.isNull( ptmAnalysis26 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis26Match" )
                 .arg( ptmAnalysis26 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis27 = ptmPermToMarketDMO.getPtmAnalysis27(  );

      if ( !DMO.isNull( ptmAnalysis27 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis27Match" )
                 .arg( ptmAnalysis27 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis28 = ptmPermToMarketDMO.getPtmAnalysis28(  );

      if ( !DMO.isNull( ptmAnalysis28 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis28Match" )
                 .arg( ptmAnalysis28 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis29 = ptmPermToMarketDMO.getPtmAnalysis29(  );

      if ( !DMO.isNull( ptmAnalysis29 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis29Match" )
                 .arg( ptmAnalysis29 + dao.wildcardForAnySequence(  ) );
      }

      String ptmAnalysis30 = ptmPermToMarketDMO.getPtmAnalysis30(  );

      if ( !DMO.isNull( ptmAnalysis30 ) ) {
        queryArgs.andFilterBy( "PtmAnalysis30Match" )
                 .arg( ptmAnalysis30 + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<PtmPermToMarketDMO> getList( 
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
        ? "PtmPermToMarket" : dmlName, parts.size(  ) );

    for ( Iterator i =  parts.iterator(); i.hasNext();  ) {
      FilterPart part = (FilterPart) i.next();
      
      switch ( part.getIndex(  ) ) {
        case PtmPermToMarketDMO.ptmBillAcNoFilter:
          part.andFilterBy( queryArgs, "PtmBillAcNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmIndFilter:
          part.andFilterBy( queryArgs, "PtmInd",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmTitleFilter:
          part.andFilterBy( queryArgs, "PtmTitle",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmSurnameFilter:
          part.andFilterBy( queryArgs, "PtmSurname",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmFirstnameFilter:
          part.andFilterBy( queryArgs, "PtmFirstname",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmPrefCommsFilter:
          part.andFilterBy( queryArgs, "PtmPrefComms",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAudIdFilter:
          part.andFilterBy( queryArgs, "PtmAudId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis1Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis1",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis2Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis2",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis3Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis3",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis4Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis4",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis5Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis5",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis6Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis6",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis7Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis7",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis8Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis8",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis9Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis9",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis10Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis10",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis11Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis11",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis12Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis12",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis13Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis13",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis14Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis14",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis15Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis15",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis16Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis16",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis17Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis17",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis18Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis18",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis19Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis19",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis20Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis20",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis21Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis21",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis22Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis22",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis23Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis23",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis24Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis24",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis25Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis25",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis26Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis26",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis27Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis27",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis28Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis28",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis29Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis29",
            dao.wildcardForAnySequence(  ) );

          break;

        case PtmPermToMarketDMO.ptmAnalysis30Filter:
          part.andFilterBy( queryArgs, "PtmAnalysis30",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PtmPermToMarket records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PtmPermToMarket records based
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
      filterQueryArgs( filter, null ));
  }

  /**
   * Retrieves the PtmPermToMarket Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PtmPermToMarketDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PtmPermToMarketDMO) dao.get( args.getDMLName(  ),
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
