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
 * BtcBatchControl Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class BtcBatchControlAbstractDACImpl
  extends DAC
  implements BtcBatchControlAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( BtcBatchControlAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BtcBatchControlDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public BtcBatchControlAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public BtcBatchControlAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a BtcBatchControl Data Model Object
   *
   * @return a populated BtcBatchControl Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BtcBatchControlDMO get( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( BtcBatchControlDMO )" );

    thrower.ifParameterMissing( "BtcBatchControlDMO", btcBatchControlDMO );

    return (BtcBatchControlDMO) dao.get( btcBatchControlDMO );
  }

  /**
   * Creates the BtcBatchControl object in the database.
   *
   * @param BtcBatchControlDMO btcBatchControlDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( btcBatchControlDMO )" );
    thrower.ifParameterMissing( "BtcBatchControlDMO", btcBatchControlDMO );

    dao.insert( btcBatchControlDMO );
  }

  /**
   * Locks and retrieves the BtcBatchControl object from the database.
   *
   * @param aBtcBatchControl BtcBatchControl object
   *
   * @return a populated BtcBatchControl object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BtcBatchControlDMO lock( BtcBatchControlDMO aBtcBatchControlDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aBtcBatchControlDMO )" );

    thrower.ifParameterMissing( "aBtcBatchControlDMO", aBtcBatchControlDMO );

    BtcBatchControlDMO lockedBtcBatchControlDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedBtcBatchControlDMO = (BtcBatchControlDMO) dao.lock( "BtcBatchControl",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aBtcBatchControlDMO.getBtcBatchType(  ) ).arg( aBtcBatchControlDMO
          .getBtcBatchId(  ) ) );

    return lockedBtcBatchControlDMO;
  }

  /**
   * Modifies the BtcBatchControl object in the database.
   *
   * @param BtcBatchControlDMO BtcBatchControl object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aBtcBatchControlDMO )" );

    thrower.ifParameterMissing( "aBtcBatchControlDMO", btcBatchControlDMO );

    thrower.ifParameterMissing( "BtcBatchControlDMO.btcBatchType",
      btcBatchControlDMO.getBtcBatchType(  ) );

    thrower.ifParameterMissing( "BtcBatchControlDMO.btcBatchId",
      btcBatchControlDMO.getBtcBatchId(  ) );

    dao.update( btcBatchControlDMO );
  }

  /**
  * Modifies the BtcBatchControl object using the specified filter in the database.
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

    dao.updateCustom( new BtcBatchControlDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the BtcBatchControl object from the database.
   *
   * @param BtcBatchControlDMO BtcBatchControl object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( BtcBatchControlDMO )" );

    thrower.ifParameterMissing( "BtcBatchControlDMO", btcBatchControlDMO );

    thrower.ifParameterMissing( "BtcBatchControlDMO.btcBatchType",
      btcBatchControlDMO.getBtcBatchType(  ) );

    thrower.ifParameterMissing( "BtcBatchControlDMO.btcBatchId",
      btcBatchControlDMO.getBtcBatchId(  ) );

    dao.delete( btcBatchControlDMO );
  }

  /**
   * Deletes the BtcBatchControl object from the database.
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

    dao.delete( "BtcBatchControl", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a BtcBatchControl object exists.
  *
  * @param BtcBatchControlDMO BtcBatchControlDMO
  *
  * @return true if the BtcBatchControl object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( BtcBatchControlDMO BtcBatchControlDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( BtcBatchControlDMO)" );

    return dao.exists( "BtcBatchControl", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( BtcBatchControlDMO.getBtcBatchType(  ) ).arg( BtcBatchControlDMO
        .getBtcBatchId(  ) ) );
  }

  /**
    * Return true if a BtcBatchControl object exists.
    *
    * @param filter
    *
    * @return true if the BtcBatchControl object exists.
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
   * @param locationDMO BtcBatchControl Data Model Object
   *
   * @return DTOList of BtcBatchControl Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, btcBatchControlDMO )" );

    return dao.getListAbs( state, paramQueryArgs( btcBatchControlDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} BtcBatchControlDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    BtcBatchControlDMO btcBatchControlDMO ) {
    logger.debug( "paramQueryArgs( btcBatchControlDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "BtcBatchControl",
        25 * 2 );

    if ( btcBatchControlDMO != null ) {
      // primary key filters...
      String btcBatchType = btcBatchControlDMO.getBtcBatchType(  );

      if ( !DMO.isNull( btcBatchType ) ) {
        queryArgs.andFilterBy( "BtcBatchTypeMatch" )
                 .arg( btcBatchType + dao.wildcardForAnySequence(  ) );
      }

      String btcBatchId = btcBatchControlDMO.getBtcBatchId(  );

      if ( !DMO.isNull( btcBatchId ) ) {
        queryArgs.andFilterBy( "BtcBatchIdMatch" )
                 .arg( btcBatchId + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String btcDescription = btcBatchControlDMO.getBtcDescription(  );

      if ( !DMO.isNull( btcDescription ) ) {
        queryArgs.andFilterBy( "BtcDescriptionMatch" )
                 .arg( btcDescription + dao.wildcardForAnySequence(  ) );
      }

      String btcBatchProgram = btcBatchControlDMO.getBtcBatchProgram(  );

      if ( !DMO.isNull( btcBatchProgram ) ) {
        queryArgs.andFilterBy( "BtcBatchProgramMatch" )
                 .arg( btcBatchProgram + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter1 = btcBatchControlDMO.getBtcParameter1(  );

      if ( !DMO.isNull( btcParameter1 ) ) {
        queryArgs.andFilterBy( "BtcParameter1Match" )
                 .arg( btcParameter1 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter2 = btcBatchControlDMO.getBtcParameter2(  );

      if ( !DMO.isNull( btcParameter2 ) ) {
        queryArgs.andFilterBy( "BtcParameter2Match" )
                 .arg( btcParameter2 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter3 = btcBatchControlDMO.getBtcParameter3(  );

      if ( !DMO.isNull( btcParameter3 ) ) {
        queryArgs.andFilterBy( "BtcParameter3Match" )
                 .arg( btcParameter3 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter4 = btcBatchControlDMO.getBtcParameter4(  );

      if ( !DMO.isNull( btcParameter4 ) ) {
        queryArgs.andFilterBy( "BtcParameter4Match" )
                 .arg( btcParameter4 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter5 = btcBatchControlDMO.getBtcParameter5(  );

      if ( !DMO.isNull( btcParameter5 ) ) {
        queryArgs.andFilterBy( "BtcParameter5Match" )
                 .arg( btcParameter5 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter6 = btcBatchControlDMO.getBtcParameter6(  );

      if ( !DMO.isNull( btcParameter6 ) ) {
        queryArgs.andFilterBy( "BtcParameter6Match" )
                 .arg( btcParameter6 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter7 = btcBatchControlDMO.getBtcParameter7(  );

      if ( !DMO.isNull( btcParameter7 ) ) {
        queryArgs.andFilterBy( "BtcParameter7Match" )
                 .arg( btcParameter7 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter8 = btcBatchControlDMO.getBtcParameter8(  );

      if ( !DMO.isNull( btcParameter8 ) ) {
        queryArgs.andFilterBy( "BtcParameter8Match" )
                 .arg( btcParameter8 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter9 = btcBatchControlDMO.getBtcParameter9(  );

      if ( !DMO.isNull( btcParameter9 ) ) {
        queryArgs.andFilterBy( "BtcParameter9Match" )
                 .arg( btcParameter9 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter10 = btcBatchControlDMO.getBtcParameter10(  );

      if ( !DMO.isNull( btcParameter10 ) ) {
        queryArgs.andFilterBy( "BtcParameter10Match" )
                 .arg( btcParameter10 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter11 = btcBatchControlDMO.getBtcParameter11(  );

      if ( !DMO.isNull( btcParameter11 ) ) {
        queryArgs.andFilterBy( "BtcParameter11Match" )
                 .arg( btcParameter11 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter12 = btcBatchControlDMO.getBtcParameter12(  );

      if ( !DMO.isNull( btcParameter12 ) ) {
        queryArgs.andFilterBy( "BtcParameter12Match" )
                 .arg( btcParameter12 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter13 = btcBatchControlDMO.getBtcParameter13(  );

      if ( !DMO.isNull( btcParameter13 ) ) {
        queryArgs.andFilterBy( "BtcParameter13Match" )
                 .arg( btcParameter13 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter14 = btcBatchControlDMO.getBtcParameter14(  );

      if ( !DMO.isNull( btcParameter14 ) ) {
        queryArgs.andFilterBy( "BtcParameter14Match" )
                 .arg( btcParameter14 + dao.wildcardForAnySequence(  ) );
      }

      String btcParameter15 = btcBatchControlDMO.getBtcParameter15(  );

      if ( !DMO.isNull( btcParameter15 ) ) {
        queryArgs.andFilterBy( "BtcParameter15Match" )
                 .arg( btcParameter15 + dao.wildcardForAnySequence(  ) );
      }

      String btcBatchRunStat = btcBatchControlDMO.getBtcBatchRunStat(  );

      if ( !DMO.isNull( btcBatchRunStat ) ) {
        queryArgs.andFilterBy( "BtcBatchRunStatMatch" )
                 .arg( btcBatchRunStat + dao.wildcardForAnySequence(  ) );
      }

      String btcBatchRunType = btcBatchControlDMO.getBtcBatchRunType(  );

      if ( !DMO.isNull( btcBatchRunType ) ) {
        queryArgs.andFilterBy( "BtcBatchRunTypeMatch" )
                 .arg( btcBatchRunType + dao.wildcardForAnySequence(  ) );
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
//    filter.setClass(BtcBatchControlDMO.class);

    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "BtcBatchControl" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){	
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case BtcBatchControlDMO.btcBatchTypeFilter:
          part.andFilterBy( queryArgs, "BtcBatchType",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcBatchIdFilter:
          part.andFilterBy( queryArgs, "BtcBatchId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcDescriptionFilter:
          part.andFilterBy( queryArgs, "BtcDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcBatchRunNumFilter:
          part.andFilterBy( queryArgs, "BtcBatchRunNum",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcStartTimeFilter:
          part.andFilterBy( queryArgs, "BtcStartTime",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcBatchProgramFilter:
          part.andFilterBy( queryArgs, "BtcBatchProgram",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter1Filter:
          part.andFilterBy( queryArgs, "BtcParameter1",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter2Filter:
          part.andFilterBy( queryArgs, "BtcParameter2",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter3Filter:
          part.andFilterBy( queryArgs, "BtcParameter3",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter4Filter:
          part.andFilterBy( queryArgs, "BtcParameter4",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter5Filter:
          part.andFilterBy( queryArgs, "BtcParameter5",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter6Filter:
          part.andFilterBy( queryArgs, "BtcParameter6",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter7Filter:
          part.andFilterBy( queryArgs, "BtcParameter7",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter8Filter:
          part.andFilterBy( queryArgs, "BtcParameter8",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter9Filter:
          part.andFilterBy( queryArgs, "BtcParameter9",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter10Filter:
          part.andFilterBy( queryArgs, "BtcParameter10",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter11Filter:
          part.andFilterBy( queryArgs, "BtcParameter11",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter12Filter:
          part.andFilterBy( queryArgs, "BtcParameter12",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter13Filter:
          part.andFilterBy( queryArgs, "BtcParameter13",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter14Filter:
          part.andFilterBy( queryArgs, "BtcParameter14",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcParameter15Filter:
          part.andFilterBy( queryArgs, "BtcParameter15",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcProcessIdFilter:
          part.andFilterBy( queryArgs, "BtcProcessId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcLocationIdFilter:
          part.andFilterBy( queryArgs, "BtcLocationId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcBatchRunStatFilter:
          part.andFilterBy( queryArgs, "BtcBatchRunStat",
            dao.wildcardForAnySequence(  ) );

          break;

        case BtcBatchControlDMO.btcBatchRunTypeFilter:
          part.andFilterBy( queryArgs, "BtcBatchRunType",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of BtcBatchControl records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of BtcBatchControl records based
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
   * Retrieves the BtcBatchControl Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public BtcBatchControlDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (BtcBatchControlDMO) dao.get( args.getDMLName(  ),
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
