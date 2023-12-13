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
 * Opcosm Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class OpcosmAbstractDACImpl
  extends DAC
  implements OpcosmAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( OpcosmAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpcosmDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public OpcosmAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Opcosm Data Model Object
   *
   * @return a populated Opcosm Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public OpcosmDMO get( OpcosmDMO opcosmDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( OpcosmDMO )" );

    thrower.ifParameterMissing( "OpcosmDMO", opcosmDMO );

    return (OpcosmDMO) dao.get( opcosmDMO );
  }

  /**
   * Creates the Opcosm object in the database.
   *
   * @param OpcosmDMO opcosmDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( OpcosmDMO opcosmDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( opcosmDMO )" );
    thrower.ifParameterMissing( "OpcosmDMO", opcosmDMO );

    dao.insert( opcosmDMO );
  }

  /**
   * Locks and retrieves the Opcosm object from the database.
   *
   * @param aOpcosm Opcosm object
   *
   * @return a populated Opcosm object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public OpcosmDMO lock( OpcosmDMO aOpcosmDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aOpcosmDMO )" );

    thrower.ifParameterMissing( "aOpcosmDMO", aOpcosmDMO );

    OpcosmDMO lockedOpcosmDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedOpcosmDMO = (OpcosmDMO) dao.lock( "Opcosm", "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aOpcosmDMO.getCostOfSales(  ) ) );

    return lockedOpcosmDMO;
  }

  /**
   * Modifies the Opcosm object in the database.
   *
   * @param OpcosmDMO Opcosm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( OpcosmDMO opcosmDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aOpcosmDMO )" );

    thrower.ifParameterMissing( "aOpcosmDMO", opcosmDMO );

    thrower.ifParameterMissing( "OpcosmDMO.costOfSales",
      opcosmDMO.getCostOfSales(  ) );

    dao.update( opcosmDMO );
  }

  /**
  * Modifies the Opcosm object using the specified filter in the database.
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

    dao.updateCustom( new OpcosmDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Opcosm object from the database.
   *
   * @param OpcosmDMO Opcosm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( OpcosmDMO opcosmDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( OpcosmDMO )" );

    thrower.ifParameterMissing( "OpcosmDMO", opcosmDMO );

    thrower.ifParameterMissing( "OpcosmDMO.costOfSales",
      opcosmDMO.getCostOfSales(  ) );

    dao.delete( opcosmDMO );
  }

  /**
   * Deletes the Opcosm object from the database.
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

    dao.delete( "Opcosm", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Opcosm object exists.
  *
  * @param OpcosmDMO OpcosmDMO
  *
  * @return true if the Opcosm object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( OpcosmDMO OpcosmDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( OpcosmDMO)" );

    return dao.exists( "Opcosm", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( OpcosmDMO.getCostOfSales(  ) ) );
  }

  /**
    * Return true if a Opcosm object exists.
    *
    * @param filter
    *
    * @return true if the Opcosm object exists.
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
   * @param locationDMO Opcosm Data Model Object
   *
   * @return DTOList of Opcosm Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    OpcosmDMO    opcosmDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, opcosmDMO )" );

    return dao.getListAbs( state, paramQueryArgs( opcosmDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} OpcosmDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( OpcosmDMO opcosmDMO ) {
    logger.debug( "paramQueryArgs( opcosmDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Opcosm", 8 * 2 );

    if ( opcosmDMO != null ) {
      // primary key filters...
      String costOfSales = opcosmDMO.getCostOfSales(  );

      if ( !DMO.isNull( costOfSales ) ) {
        queryArgs.andFilterBy( "CostOfSalesMatch" )
                 .arg( costOfSales + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String description = opcosmDMO.getDescription(  );

      if ( !DMO.isNull( description ) ) {
        queryArgs.andFilterBy( "DescriptionMatch" )
                 .arg( description + dao.wildcardForAnySequence(  ) );
      }

      String salesAccount = opcosmDMO.getSalesAccount(  );

      if ( !DMO.isNull( salesAccount ) ) {
        queryArgs.andFilterBy( "SalesAccountMatch" )
                 .arg( salesAccount + dao.wildcardForAnySequence(  ) );
      }

      String stockAccount = opcosmDMO.getStockAccount(  );

      if ( !DMO.isNull( stockAccount ) ) {
        queryArgs.andFilterBy( "StockAccountMatch" )
                 .arg( stockAccount + dao.wildcardForAnySequence(  ) );
      }

      String costOfSalesAcc = opcosmDMO.getCostOfSalesAcc(  );

      if ( !DMO.isNull( costOfSalesAcc ) ) {
        queryArgs.andFilterBy( "CostOfSalesAccMatch" )
                 .arg( costOfSalesAcc + dao.wildcardForAnySequence(  ) );
      }

      String upliftAccount = opcosmDMO.getUpliftAccount(  );

      if ( !DMO.isNull( upliftAccount ) ) {
        queryArgs.andFilterBy( "UpliftAccountMatch" )
                 .arg( upliftAccount + dao.wildcardForAnySequence(  ) );
      }

      String spare = opcosmDMO.getSpare(  );

      if ( !DMO.isNull( spare ) ) {
        queryArgs.andFilterBy( "SpareMatch" )
                 .arg( spare + dao.wildcardForAnySequence(  ) );
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
        ? "Opcosm" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case OpcosmDMO.costOfSalesFilter:
          part.andFilterBy( queryArgs, "CostOfSales",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.descriptionFilter:
          part.andFilterBy( queryArgs, "Description",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.salesAccountFilter:
          part.andFilterBy( queryArgs, "SalesAccount",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.stockAccountFilter:
          part.andFilterBy( queryArgs, "StockAccount",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.costOfSalesAccFilter:
          part.andFilterBy( queryArgs, "CostOfSalesAcc",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.upliftAccountFilter:
          part.andFilterBy( queryArgs, "UpliftAccount",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.upliftFilter:
          part.andFilterBy( queryArgs, "Uplift",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpcosmDMO.spareFilter:
          part.andFilterBy( queryArgs, "Spare", dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Opcosm records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Opcosm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ),
      true );
  }

  /**
   * Retrieves the Opcosm Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public OpcosmDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (OpcosmDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
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
