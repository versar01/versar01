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
 * ActAccTypes Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class ActAccTypesAbstractDACImpl
  extends DAC
  implements ActAccTypesAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( ActAccTypesAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new ActAccTypesDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public ActAccTypesAbstractDACImpl( 
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a ActAccTypes Data Model Object
   *
   * @return a populated ActAccTypes Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public ActAccTypesDMO get( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( ActAccTypesDMO )" );

    thrower.ifParameterMissing( "ActAccTypesDMO", actAccTypesDMO );

    return (ActAccTypesDMO) dao.get( actAccTypesDMO );
  }

  /**
   * Creates the ActAccTypes object in the database.
   *
   * @param ActAccTypesDMO actAccTypesDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( actAccTypesDMO )" );
    thrower.ifParameterMissing( "ActAccTypesDMO", actAccTypesDMO );

    dao.insert( actAccTypesDMO );
  }

  /**
   * Locks and retrieves the ActAccTypes object from the database.
   *
   * @param aActAccTypes ActAccTypes object
   *
   * @return a populated ActAccTypes object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public ActAccTypesDMO lock( ActAccTypesDMO aActAccTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aActAccTypesDMO )" );

    thrower.ifParameterMissing( "aActAccTypesDMO", aActAccTypesDMO );

    ActAccTypesDMO lockedActAccTypesDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedActAccTypesDMO = (ActAccTypesDMO) dao.lock( "ActAccTypes",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aActAccTypesDMO.getActAccId(  ) ) );

    return lockedActAccTypesDMO;
  }

  /**
   * Modifies the ActAccTypes object in the database.
   *
   * @param ActAccTypesDMO ActAccTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aActAccTypesDMO )" );

    thrower.ifParameterMissing( "aActAccTypesDMO", actAccTypesDMO );

    thrower.ifParameterMissing( "ActAccTypesDMO.actAccId",
      actAccTypesDMO.getActAccId(  ) );

    dao.update( actAccTypesDMO );
  }

  /**
  * Modifies the ActAccTypes object using the specified filter in the database.
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

    dao.updateCustom( new ActAccTypesDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the ActAccTypes object from the database.
   *
   * @param ActAccTypesDMO ActAccTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( ActAccTypesDMO )" );

    thrower.ifParameterMissing( "ActAccTypesDMO", actAccTypesDMO );

    thrower.ifParameterMissing( "ActAccTypesDMO.actAccId",
      actAccTypesDMO.getActAccId(  ) );

    dao.delete( actAccTypesDMO );
  }

  /**
   * Deletes the ActAccTypes object from the database.
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

    dao.delete( "ActAccTypes", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a ActAccTypes object exists.
  *
  * @param ActAccTypesDMO ActAccTypesDMO
  *
  * @return true if the ActAccTypes object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( ActAccTypesDMO ActAccTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( ActAccTypesDMO)" );

    return dao.exists( "ActAccTypes", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( ActAccTypesDMO.getActAccId(  ) ) );
  }

  /**
    * Return true if a ActAccTypes object exists.
    *
    * @param filter
    *
    * @return true if the ActAccTypes object exists.
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
   * @param locationDMO ActAccTypes Data Model Object
   *
   * @return DTOList of ActAccTypes Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<ActAccTypesDMO> getList( 
//    DTOListState   state,
//    ActAccTypesDMO actAccTypesDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, actAccTypesDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( actAccTypesDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} ActAccTypesDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( ActAccTypesDMO actAccTypesDMO ) {
    logger.debug( "paramQueryArgs( actAccTypesDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "ActAccTypes", 5 * 2 );

    if ( actAccTypesDMO != null ) {
      // primary key filters...
      String actAccId = actAccTypesDMO.getActAccId(  );

      if ( !DMO.isNull( actAccId ) ) {
        queryArgs.andFilterBy( "ActAccIdMatch" )
                 .arg( actAccId + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String actAccType = actAccTypesDMO.getActAccType(  );

      if ( !DMO.isNull( actAccType ) ) {
        queryArgs.andFilterBy( "ActAccTypeMatch" )
                 .arg( actAccType + dao.wildcardForAnySequence(  ) );
      }

      String actMnpType = actAccTypesDMO.getActMnpType(  );

      if ( !DMO.isNull( actMnpType ) ) {
        queryArgs.andFilterBy( "ActMnpTypeMatch" )
                 .arg( actMnpType + dao.wildcardForAnySequence(  ) );
      }

      String actUseLe = actAccTypesDMO.getActUseLe(  );

      if ( !DMO.isNull( actUseLe ) ) {
        queryArgs.andFilterBy( "ActUseLeMatch" )
                 .arg( actUseLe + dao.wildcardForAnySequence(  ) );
      }

      String actSegment = actAccTypesDMO.getActSegment(  );

      if ( !DMO.isNull( actSegment ) ) {
        queryArgs.andFilterBy( "ActSegmentMatch" )
                 .arg( actSegment + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<ActAccTypesDMO> getList( 
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
        ? "ActAccTypes" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      switch ( part.getIndex(  ) ) {
        case ActAccTypesDMO.actAccIdFilter:
          part.andFilterBy( queryArgs, "ActAccId",
            dao.wildcardForAnySequence(  ) );

          break;

        case ActAccTypesDMO.actAccTypeFilter:
          part.andFilterBy( queryArgs, "ActAccType",
            dao.wildcardForAnySequence(  ) );

          break;

        case ActAccTypesDMO.actMnpTypeFilter:
          part.andFilterBy( queryArgs, "ActMnpType",
            dao.wildcardForAnySequence(  ) );

          break;

        case ActAccTypesDMO.actUseLeFilter:
          part.andFilterBy( queryArgs, "ActUseLe",
            dao.wildcardForAnySequence(  ) );

          break;

        case ActAccTypesDMO.actSegmentFilter:
          part.andFilterBy( queryArgs, "ActSegment",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of ActAccTypes records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of ActAccTypes records based
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
   * Retrieves the ActAccTypes Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public ActAccTypesDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (ActAccTypesDMO) dao.get( args.getDMLName(  ),
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
