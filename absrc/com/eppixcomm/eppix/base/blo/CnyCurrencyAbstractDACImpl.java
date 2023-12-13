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
 * CnyCurrency Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class CnyCurrencyAbstractDACImpl
  extends DAC
  implements CnyCurrencyAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( CnyCurrencyAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CnyCurrencyDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public CnyCurrencyAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public CnyCurrencyAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a CnyCurrency Data Model Object
   *
   * @return a populated CnyCurrency Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CnyCurrencyDMO get( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( CnyCurrencyDMO )" );

    thrower.ifParameterMissing( "CnyCurrencyDMO", cnyCurrencyDMO );

    return (CnyCurrencyDMO) dao.get( cnyCurrencyDMO );
  }

  /**
   * Creates the CnyCurrency object in the database.
   *
   * @param CnyCurrencyDMO cnyCurrencyDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( cnyCurrencyDMO )" );
    thrower.ifParameterMissing( "CnyCurrencyDMO", cnyCurrencyDMO );

    dao.insert( cnyCurrencyDMO );
  }

  /**
   * Locks and retrieves the CnyCurrency object from the database.
   *
   * @param aCnyCurrency CnyCurrency object
   *
   * @return a populated CnyCurrency object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CnyCurrencyDMO lock( CnyCurrencyDMO aCnyCurrencyDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aCnyCurrencyDMO )" );

    thrower.ifParameterMissing( "aCnyCurrencyDMO", aCnyCurrencyDMO );

    CnyCurrencyDMO lockedCnyCurrencyDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedCnyCurrencyDMO = (CnyCurrencyDMO) dao.lock( "CnyCurrency",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aCnyCurrencyDMO.getCnyCurrencyRef(  ) ) );

    return lockedCnyCurrencyDMO;
  }

  /**
   * Modifies the CnyCurrency object in the database.
   *
   * @param CnyCurrencyDMO CnyCurrency object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aCnyCurrencyDMO )" );

    thrower.ifParameterMissing( "aCnyCurrencyDMO", cnyCurrencyDMO );

    thrower.ifParameterMissing( "CnyCurrencyDMO.cnyCurrencyRef",
      cnyCurrencyDMO.getCnyCurrencyRef(  ) );

    dao.update( cnyCurrencyDMO );
  }

  /**
  * Modifies the CnyCurrency object using the specified filter in the database.
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

    dao.updateCustom( new CnyCurrencyDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the CnyCurrency object from the database.
   *
   * @param CnyCurrencyDMO CnyCurrency object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( CnyCurrencyDMO )" );

    thrower.ifParameterMissing( "CnyCurrencyDMO", cnyCurrencyDMO );

    thrower.ifParameterMissing( "CnyCurrencyDMO.cnyCurrencyRef",
      cnyCurrencyDMO.getCnyCurrencyRef(  ) );

    dao.delete( cnyCurrencyDMO );
  }

  /**
   * Deletes the CnyCurrency object from the database.
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

    dao.delete( "CnyCurrency", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a CnyCurrency object exists.
  *
  * @param CnyCurrencyDMO CnyCurrencyDMO
  *
  * @return true if the CnyCurrency object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( CnyCurrencyDMO CnyCurrencyDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( CnyCurrencyDMO)" );

    return dao.exists( "CnyCurrency", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( CnyCurrencyDMO.getCnyCurrencyRef(  ) ) );
  }

  /**
    * Return true if a CnyCurrency object exists.
    *
    * @param filter
    *
    * @return true if the CnyCurrency object exists.
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
   * @param locationDMO CnyCurrency Data Model Object
   *
   * @return DTOList of CnyCurrency Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState   state,
    CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, cnyCurrencyDMO )" );

    return dao.getListAbs( state, paramQueryArgs( cnyCurrencyDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} CnyCurrencyDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( CnyCurrencyDMO cnyCurrencyDMO ) {
    logger.debug( "paramQueryArgs( cnyCurrencyDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "CnyCurrency", 10 * 2 );

    if ( cnyCurrencyDMO != null ) {
      // primary key filters...
      String cnyCurrencyRef = cnyCurrencyDMO.getCnyCurrencyRef(  );

      if ( !DMO.isNull( cnyCurrencyRef ) ) {
        queryArgs.andFilterBy( "CnyCurrencyRefMatch" )
                 .arg( cnyCurrencyRef + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String cnyCurrencyText = cnyCurrencyDMO.getCnyCurrencyText(  );

      if ( !DMO.isNull( cnyCurrencyText ) ) {
        queryArgs.andFilterBy( "CnyCurrencyTextMatch" )
                 .arg( cnyCurrencyText + dao.wildcardForAnySequence(  ) );
      }

      String cnyOperator = cnyCurrencyDMO.getCnyOperator(  );

      if ( !DMO.isNull( cnyOperator ) ) {
        queryArgs.andFilterBy( "CnyOperatorMatch" )
                 .arg( cnyOperator + dao.wildcardForAnySequence(  ) );
      }

      String cnyCurSymbol = cnyCurrencyDMO.getCnyCurSymbol(  );

      if ( !DMO.isNull( cnyCurSymbol ) ) {
        queryArgs.andFilterBy( "CnyCurSymbolMatch" )
                 .arg( cnyCurSymbol + dao.wildcardForAnySequence(  ) );
      }

      String cnyGrpSymbol = cnyCurrencyDMO.getCnyGrpSymbol(  );

      if ( !DMO.isNull( cnyGrpSymbol ) ) {
        queryArgs.andFilterBy( "CnyGrpSymbolMatch" )
                 .arg( cnyGrpSymbol + dao.wildcardForAnySequence(  ) );
      }

      String cnyDecSymbol = cnyCurrencyDMO.getCnyDecSymbol(  );

      if ( !DMO.isNull( cnyDecSymbol ) ) {
        queryArgs.andFilterBy( "CnyDecSymbolMatch" )
                 .arg( cnyDecSymbol + dao.wildcardForAnySequence(  ) );
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
        ? "CnyCurrency" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case CnyCurrencyDMO.cnyCurrencyRefFilter:
          part.andFilterBy( queryArgs, "CnyCurrencyRef",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyCurrencyTextFilter:
          part.andFilterBy( queryArgs, "CnyCurrencyText",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyExchangeRateFilter:
          part.andFilterBy( queryArgs, "CnyExchangeRate",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyNoDecsFilter:
          part.andFilterBy( queryArgs, "CnyNoDecs",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyOperatorFilter:
          part.andFilterBy( queryArgs, "CnyOperator",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyCurSymbolFilter:
          part.andFilterBy( queryArgs, "CnyCurSymbol",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyGrpSymbolFilter:
          part.andFilterBy( queryArgs, "CnyGrpSymbol",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyDecSymbolFilter:
          part.andFilterBy( queryArgs, "CnyDecSymbol",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyRoundFromFilter:
          part.andFilterBy( queryArgs, "CnyRoundFrom",
            dao.wildcardForAnySequence(  ) );

          break;

        case CnyCurrencyDMO.cnyTimestampFilter:
          part.andFilterBy( queryArgs, "CnyTimestamp",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of CnyCurrency records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of CnyCurrency records based
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
   * Retrieves the CnyCurrency Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public CnyCurrencyDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (CnyCurrencyDMO) dao.get( args.getDMLName(  ),
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
