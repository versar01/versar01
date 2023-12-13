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
 * BthBatchHistory Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class BthBatchHistoryAbstractDACImpl
  extends DAC
  implements BthBatchHistoryAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( BthBatchHistoryAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BthBatchHistoryDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public BthBatchHistoryAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a BthBatchHistory Data Model Object
   *
   * @return a populated BthBatchHistory Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BthBatchHistoryDMO get( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( BthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "BthBatchHistoryDMO", bthBatchHistoryDMO );

    return (BthBatchHistoryDMO) dao.get( bthBatchHistoryDMO );
  }

  /**
   * Creates the BthBatchHistory object in the database.
   *
   * @param BthBatchHistoryDMO bthBatchHistoryDMO
   *
   * @throws EPPIXSeriousException
   */
  public BthBatchHistoryDMO create( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( bthBatchHistoryDMO )" );
    thrower.ifParameterMissing( "BthBatchHistoryDMO", bthBatchHistoryDMO );

    dao.insert( bthBatchHistoryDMO );

    // return the data with key
    return bthBatchHistoryDMO;
  }

  /**
   * Locks and retrieves the BthBatchHistory object from the database.
   *
   * @param aBthBatchHistory BthBatchHistory object
   *
   * @return a populated BthBatchHistory object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BthBatchHistoryDMO lock( BthBatchHistoryDMO aBthBatchHistoryDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aBthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "aBthBatchHistoryDMO", aBthBatchHistoryDMO );

    BthBatchHistoryDMO lockedBthBatchHistoryDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedBthBatchHistoryDMO = (BthBatchHistoryDMO) dao.lock( "BthBatchHistory",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aBthBatchHistoryDMO.getBthBatchRunNum(  ) ) );

    return lockedBthBatchHistoryDMO;
  }

  /**
   * Modifies the BthBatchHistory object in the database.
   *
   * @param BthBatchHistoryDMO BthBatchHistory object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aBthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "aBthBatchHistoryDMO", bthBatchHistoryDMO );

    thrower.ifParameterMissing( "BthBatchHistoryDMO.bthBatchRunNum",
      bthBatchHistoryDMO.getBthBatchRunNum(  ) );

    dao.update( bthBatchHistoryDMO );
  }

  /**
  * Modifies the BthBatchHistory object using the specified filter in the database.
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

    dao.updateCustom( new BthBatchHistoryDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the BthBatchHistory object from the database.
   *
   * @param BthBatchHistoryDMO BthBatchHistory object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( BthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "BthBatchHistoryDMO", bthBatchHistoryDMO );

    thrower.ifParameterMissing( "BthBatchHistoryDMO.bthBatchRunNum",
      bthBatchHistoryDMO.getBthBatchRunNum(  ) );

    dao.delete( bthBatchHistoryDMO );
  }

  /**
   * Deletes the BthBatchHistory object from the database.
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

    dao.delete( "BthBatchHistory", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a BthBatchHistory object exists.
  *
  * @param BthBatchHistoryDMO BthBatchHistoryDMO
  *
  * @return true if the BthBatchHistory object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( BthBatchHistoryDMO BthBatchHistoryDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( BthBatchHistoryDMO)" );

    return dao.exists( "BthBatchHistory", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( BthBatchHistoryDMO.getBthBatchRunNum(  ) ) );
  }

  /**
    * Return true if a BthBatchHistory object exists.
    *
    * @param filter
    *
    * @return true if the BthBatchHistory object exists.
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
   * @param locationDMO BthBatchHistory Data Model Object
   *
   * @return DTOList of BthBatchHistory Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, bthBatchHistoryDMO )" );

    return dao.getListAbs( state, paramQueryArgs( bthBatchHistoryDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} BthBatchHistoryDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    BthBatchHistoryDMO bthBatchHistoryDMO ) {
    logger.debug( "paramQueryArgs( bthBatchHistoryDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "BthBatchHistory",
        34 * 2 );

    if ( bthBatchHistoryDMO != null ) {
      // primary key filters...
      Integer bthBatchRunNum = bthBatchHistoryDMO.getBthBatchRunNum(  );

      if ( !DMO.isNull( bthBatchRunNum ) ) {
        queryArgs.andFilterBy( "BthBatchRunNum" )
                 .arg( bthBatchRunNum );
      }

      // define more filters...
      String bthBatchType = bthBatchHistoryDMO.getBthBatchType(  );

      if ( !DMO.isNull( bthBatchType ) ) {
        queryArgs.andFilterBy( "BthBatchTypeMatch" )
                 .arg( bthBatchType + dao.wildcardForAnySequence(  ) );
      }

      String bthBatchId = bthBatchHistoryDMO.getBthBatchId(  );

      if ( !DMO.isNull( bthBatchId ) ) {
        queryArgs.andFilterBy( "BthBatchIdMatch" )
                 .arg( bthBatchId + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter1 = bthBatchHistoryDMO.getBthParameter1(  );

      if ( !DMO.isNull( bthParameter1 ) ) {
        queryArgs.andFilterBy( "BthParameter1Match" )
                 .arg( bthParameter1 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter2 = bthBatchHistoryDMO.getBthParameter2(  );

      if ( !DMO.isNull( bthParameter2 ) ) {
        queryArgs.andFilterBy( "BthParameter2Match" )
                 .arg( bthParameter2 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter3 = bthBatchHistoryDMO.getBthParameter3(  );

      if ( !DMO.isNull( bthParameter3 ) ) {
        queryArgs.andFilterBy( "BthParameter3Match" )
                 .arg( bthParameter3 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter4 = bthBatchHistoryDMO.getBthParameter4(  );

      if ( !DMO.isNull( bthParameter4 ) ) {
        queryArgs.andFilterBy( "BthParameter4Match" )
                 .arg( bthParameter4 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter5 = bthBatchHistoryDMO.getBthParameter5(  );

      if ( !DMO.isNull( bthParameter5 ) ) {
        queryArgs.andFilterBy( "BthParameter5Match" )
                 .arg( bthParameter5 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter6 = bthBatchHistoryDMO.getBthParameter6(  );

      if ( !DMO.isNull( bthParameter6 ) ) {
        queryArgs.andFilterBy( "BthParameter6Match" )
                 .arg( bthParameter6 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter7 = bthBatchHistoryDMO.getBthParameter7(  );

      if ( !DMO.isNull( bthParameter7 ) ) {
        queryArgs.andFilterBy( "BthParameter7Match" )
                 .arg( bthParameter7 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter8 = bthBatchHistoryDMO.getBthParameter8(  );

      if ( !DMO.isNull( bthParameter8 ) ) {
        queryArgs.andFilterBy( "BthParameter8Match" )
                 .arg( bthParameter8 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter9 = bthBatchHistoryDMO.getBthParameter9(  );

      if ( !DMO.isNull( bthParameter9 ) ) {
        queryArgs.andFilterBy( "BthParameter9Match" )
                 .arg( bthParameter9 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter10 = bthBatchHistoryDMO.getBthParameter10(  );

      if ( !DMO.isNull( bthParameter10 ) ) {
        queryArgs.andFilterBy( "BthParameter10Match" )
                 .arg( bthParameter10 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter11 = bthBatchHistoryDMO.getBthParameter11(  );

      if ( !DMO.isNull( bthParameter11 ) ) {
        queryArgs.andFilterBy( "BthParameter11Match" )
                 .arg( bthParameter11 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter12 = bthBatchHistoryDMO.getBthParameter12(  );

      if ( !DMO.isNull( bthParameter12 ) ) {
        queryArgs.andFilterBy( "BthParameter12Match" )
                 .arg( bthParameter12 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter13 = bthBatchHistoryDMO.getBthParameter13(  );

      if ( !DMO.isNull( bthParameter13 ) ) {
        queryArgs.andFilterBy( "BthParameter13Match" )
                 .arg( bthParameter13 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter14 = bthBatchHistoryDMO.getBthParameter14(  );

      if ( !DMO.isNull( bthParameter14 ) ) {
        queryArgs.andFilterBy( "BthParameter14Match" )
                 .arg( bthParameter14 + dao.wildcardForAnySequence(  ) );
      }

      String bthParameter15 = bthBatchHistoryDMO.getBthParameter15(  );

      if ( !DMO.isNull( bthParameter15 ) ) {
        queryArgs.andFilterBy( "BthParameter15Match" )
                 .arg( bthParameter15 + dao.wildcardForAnySequence(  ) );
      }

      String bthBatchEndStat = bthBatchHistoryDMO.getBthBatchEndStat(  );

      if ( !DMO.isNull( bthBatchEndStat ) ) {
        queryArgs.andFilterBy( "BthBatchEndStatMatch" )
                 .arg( bthBatchEndStat + dao.wildcardForAnySequence(  ) );
      }

      String bthErrorMess = bthBatchHistoryDMO.getBthErrorMess(  );

      if ( !DMO.isNull( bthErrorMess ) ) {
        queryArgs.andFilterBy( "BthErrorMessMatch" )
                 .arg( bthErrorMess + dao.wildcardForAnySequence(  ) );
      }

      String bthAnalysis1 = bthBatchHistoryDMO.getBthAnalysis1(  );

      if ( !DMO.isNull( bthAnalysis1 ) ) {
        queryArgs.andFilterBy( "BthAnalysis1Match" )
                 .arg( bthAnalysis1 + dao.wildcardForAnySequence(  ) );
      }

      String bthAnalysis2 = bthBatchHistoryDMO.getBthAnalysis2(  );

      if ( !DMO.isNull( bthAnalysis2 ) ) {
        queryArgs.andFilterBy( "BthAnalysis2Match" )
                 .arg( bthAnalysis2 + dao.wildcardForAnySequence(  ) );
      }

      String bthAnalysis3 = bthBatchHistoryDMO.getBthAnalysis3(  );

      if ( !DMO.isNull( bthAnalysis3 ) ) {
        queryArgs.andFilterBy( "BthAnalysis3Match" )
                 .arg( bthAnalysis3 + dao.wildcardForAnySequence(  ) );
      }

      String bthAnalysis4 = bthBatchHistoryDMO.getBthAnalysis4(  );

      if ( !DMO.isNull( bthAnalysis4 ) ) {
        queryArgs.andFilterBy( "BthAnalysis4Match" )
                 .arg( bthAnalysis4 + dao.wildcardForAnySequence(  ) );
      }

      String bthAnalysis5 = bthBatchHistoryDMO.getBthAnalysis5(  );

      if ( !DMO.isNull( bthAnalysis5 ) ) {
        queryArgs.andFilterBy( "BthAnalysis5Match" )
                 .arg( bthAnalysis5 + dao.wildcardForAnySequence(  ) );
      }

      String bthBatchRunType = bthBatchHistoryDMO.getBthBatchRunType(  );

      if ( !DMO.isNull( bthBatchRunType ) ) {
        queryArgs.andFilterBy( "BthBatchRunTypeMatch" )
                 .arg( bthBatchRunType + dao.wildcardForAnySequence(  ) );
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
//    filter.setClass( BthBatchHistoryDMO.class );

    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "BthBatchHistory" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case BthBatchHistoryDMO.bthBatchRunNumFilter:
          part.andFilterBy( queryArgs, "BthBatchRunNum",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthBatchTypeFilter:
          part.andFilterBy( queryArgs, "BthBatchType",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthBatchIdFilter:
          part.andFilterBy( queryArgs, "BthBatchId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter1Filter:
          part.andFilterBy( queryArgs, "BthParameter1",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter2Filter:
          part.andFilterBy( queryArgs, "BthParameter2",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter3Filter:
          part.andFilterBy( queryArgs, "BthParameter3",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter4Filter:
          part.andFilterBy( queryArgs, "BthParameter4",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter5Filter:
          part.andFilterBy( queryArgs, "BthParameter5",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter6Filter:
          part.andFilterBy( queryArgs, "BthParameter6",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter7Filter:
          part.andFilterBy( queryArgs, "BthParameter7",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter8Filter:
          part.andFilterBy( queryArgs, "BthParameter8",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter9Filter:
          part.andFilterBy( queryArgs, "BthParameter9",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter10Filter:
          part.andFilterBy( queryArgs, "BthParameter10",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter11Filter:
          part.andFilterBy( queryArgs, "BthParameter11",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter12Filter:
          part.andFilterBy( queryArgs, "BthParameter12",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter13Filter:
          part.andFilterBy( queryArgs, "BthParameter13",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter14Filter:
          part.andFilterBy( queryArgs, "BthParameter14",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthParameter15Filter:
          part.andFilterBy( queryArgs, "BthParameter15",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthStartTimeFilter:
          part.andFilterBy( queryArgs, "BthStartTime",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthEndTimeFilter:
          part.andFilterBy( queryArgs, "BthEndTime",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthLocationIdFilter:
          part.andFilterBy( queryArgs, "BthLocationId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthRecsProcessedFilter:
          part.andFilterBy( queryArgs, "BthRecsProcessed",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthRecsRejectedFilter:
          part.andFilterBy( queryArgs, "BthRecsRejected",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthBatchEndStatFilter:
          part.andFilterBy( queryArgs, "BthBatchEndStat",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthStatusValueFilter:
          part.andFilterBy( queryArgs, "BthStatusValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthStatusClassFilter:
          part.andFilterBy( queryArgs, "BthStatusClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthIsamValueFilter:
          part.andFilterBy( queryArgs, "BthIsamValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthErrorMessFilter:
          part.andFilterBy( queryArgs, "BthErrorMess",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthAnalysis1Filter:
          part.andFilterBy( queryArgs, "BthAnalysis1",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthAnalysis2Filter:
          part.andFilterBy( queryArgs, "BthAnalysis2",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthAnalysis3Filter:
          part.andFilterBy( queryArgs, "BthAnalysis3",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthAnalysis4Filter:
          part.andFilterBy( queryArgs, "BthAnalysis4",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthAnalysis5Filter:
          part.andFilterBy( queryArgs, "BthAnalysis5",
            dao.wildcardForAnySequence(  ) );

          break;

        case BthBatchHistoryDMO.bthBatchRunTypeFilter:
          part.andFilterBy( queryArgs, "BthBatchRunType",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of BthBatchHistory records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of BthBatchHistory records based
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
   * Retrieves the BthBatchHistory Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public BthBatchHistoryDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (BthBatchHistoryDMO) dao.get( args.getDMLName(  ),
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
