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
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * CugUserGroup Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class CugUserGroupAbstractDACImpl
  extends DAC
  implements CugUserGroupAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( CugUserGroupAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CugUserGroupDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public CugUserGroupAbstractDACImpl(
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }
  
  public CugUserGroupAbstractDACImpl(DAO         dao ) {
		    super( dao, thrower );
  }  


  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a CugUserGroup Data Model Object
   *
   * @return a populated CugUserGroup Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CugUserGroupDMO get( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( CugUserGroupDMO )" );

    thrower.ifParameterMissing( "CugUserGroupDMO", cugUserGroupDMO );

    return (CugUserGroupDMO) dao.get( cugUserGroupDMO );
  }

  /**
   * Creates the CugUserGroup object in the database.
   *
   * @param CugUserGroupDMO cugUserGroupDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( cugUserGroupDMO )" );
    thrower.ifParameterMissing( "CugUserGroupDMO", cugUserGroupDMO );

    dao.insert( cugUserGroupDMO );
  }

  /**
   * Locks and retrieves the CugUserGroup object from the database.
   *
   * @param aCugUserGroup CugUserGroup object
   *
   * @return a populated CugUserGroup object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CugUserGroupDMO lock( CugUserGroupDMO aCugUserGroupDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aCugUserGroupDMO )" );

    thrower.ifParameterMissing( "aCugUserGroupDMO", aCugUserGroupDMO );

    CugUserGroupDMO lockedCugUserGroupDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedCugUserGroupDMO = (CugUserGroupDMO) dao.lock( "CugUserGroup",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aCugUserGroupDMO.getCugId(  ) ) );

    return lockedCugUserGroupDMO;
  }

  /**
   * Modifies the CugUserGroup object in the database.
   *
   * @param CugUserGroupDMO CugUserGroup object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aCugUserGroupDMO )" );

    thrower.ifParameterMissing( "aCugUserGroupDMO", cugUserGroupDMO );

    thrower.ifParameterMissing( "CugUserGroupDMO.cugId",
      cugUserGroupDMO.getCugId(  ) );

    dao.update( cugUserGroupDMO );
  }

  /**
  * Modifies the CugUserGroup object using the specified filter in the database.
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

    dao.updateCustom( new CugUserGroupDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the CugUserGroup object from the database.
   *
   * @param CugUserGroupDMO CugUserGroup object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( CugUserGroupDMO )" );

    thrower.ifParameterMissing( "CugUserGroupDMO", cugUserGroupDMO );

    thrower.ifParameterMissing( "CugUserGroupDMO.cugId",
      cugUserGroupDMO.getCugId(  ) );

    dao.delete( cugUserGroupDMO );
  }

  /**
   * Deletes the CugUserGroup object from the database.
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

    dao.delete( "CugUserGroup", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a CugUserGroup object exists.
  *
  * @param CugUserGroupDMO CugUserGroupDMO
  *
  * @return true if the CugUserGroup object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( CugUserGroupDMO CugUserGroupDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( CugUserGroupDMO)" );

    return dao.exists( "CugUserGroup", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( CugUserGroupDMO.getCugId(  ) ) );
  }

  /**
    * Return true if a CugUserGroup object exists.
    *
    * @param filter
    *
    * @return true if the CugUserGroup object exists.
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
   * @param locationDMO CugUserGroup Data Model Object
   *
   * @return DTOList of CugUserGroup Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(
    DTOListState    state,
    CugUserGroupDMO cugUserGroupDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, cugUserGroupDMO )" );

    return dao.getListAbs( state, paramQueryArgs( cugUserGroupDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} CugUserGroupDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs(
    CugUserGroupDMO cugUserGroupDMO ) {
    logger.debug( "paramQueryArgs( cugUserGroupDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "CugUserGroup", 3 * 2 );

    if ( cugUserGroupDMO != null ) {
      // primary key filters...
      String cugId = cugUserGroupDMO.getCugId(  );

      if ( !DMO.isNull( cugId ) ) {
        queryArgs.andFilterBy( "CugIdMatch" )
                 .arg( cugId + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String cugName = cugUserGroupDMO.getCugName(  );

      if ( !DMO.isNull( cugName ) ) {
        queryArgs.andFilterBy( "CugNameMatch" )
                 .arg( cugName + dao.wildcardForAnySequence(  ) );
      }

      String cugInternTariff = cugUserGroupDMO.getCugInternTariff(  );

      if ( !DMO.isNull( cugInternTariff ) ) {
        queryArgs.andFilterBy( "CugInternTariffMatch" )
                 .arg( cugInternTariff + dao.wildcardForAnySequence(  ) );
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
        ? "CugUserGroup" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case CugUserGroupDMO.cugIdFilter:
          part.andFilterBy( queryArgs, "CugId", dao.wildcardForAnySequence(  ) );

          break;

        case CugUserGroupDMO.cugNameFilter:
          part.andFilterBy( queryArgs, "CugName",
            dao.wildcardForAnySequence(  ) );

          break;

        case CugUserGroupDMO.cugInternTariffFilter:
          part.andFilterBy( queryArgs, "CugInternTariff",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of CugUserGroup records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of CugUserGroup records based
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
   * Retrieves the CugUserGroup Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public CugUserGroupDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (CugUserGroupDMO) dao.get( args.getDMLName(  ),
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
