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
 * SpaServiceParams Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SpaServiceParamsAbstractDACImpl
  extends DAC
  implements SpaServiceParamsAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SpaServiceParamsAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SpaServiceParamsDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SpaServiceParamsAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SpaServiceParams Data Model Object
   *
   * @return a populated SpaServiceParams Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SpaServiceParamsDMO get( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SpaServiceParamsDMO )" );

    thrower.ifParameterMissing( "SpaServiceParamsDMO", spaServiceParamsDMO );

    return (SpaServiceParamsDMO) dao.get( spaServiceParamsDMO );
  }

  /**
   * Creates the SpaServiceParams object in the database.
   *
   * @param SpaServiceParamsDMO spaServiceParamsDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( spaServiceParamsDMO )" );
    thrower.ifParameterMissing( "SpaServiceParamsDMO", spaServiceParamsDMO );

    dao.insert( spaServiceParamsDMO );
  }

  /**
   * Locks and retrieves the SpaServiceParams object from the database.
   *
   * @param aSpaServiceParams SpaServiceParams object
   *
   * @return a populated SpaServiceParams object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SpaServiceParamsDMO lock( SpaServiceParamsDMO aSpaServiceParamsDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSpaServiceParamsDMO )" );

    thrower.ifParameterMissing( "aSpaServiceParamsDMO", aSpaServiceParamsDMO );

    SpaServiceParamsDMO lockedSpaServiceParamsDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSpaServiceParamsDMO = (SpaServiceParamsDMO) dao.lock( "SpaServiceParams",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aSpaServiceParamsDMO.getSpaServiceType(  ) ).arg( aSpaServiceParamsDMO
          .getSpaParamId(  ) ) );

    return lockedSpaServiceParamsDMO;
  }

  /**
   * Modifies the SpaServiceParams object in the database.
   *
   * @param SpaServiceParamsDMO SpaServiceParams object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSpaServiceParamsDMO )" );

    thrower.ifParameterMissing( "aSpaServiceParamsDMO", spaServiceParamsDMO );

    thrower.ifParameterMissing( "SpaServiceParamsDMO.spaServiceType",
      spaServiceParamsDMO.getSpaServiceType(  ) );

    thrower.ifParameterMissing( "SpaServiceParamsDMO.spaParamId",
      spaServiceParamsDMO.getSpaParamId(  ) );

    dao.update( spaServiceParamsDMO );
  }

  /**
  * Modifies the SpaServiceParams object using the specified filter in the database.
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

    dao.updateCustom( new SpaServiceParamsDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SpaServiceParams object from the database.
   *
   * @param SpaServiceParamsDMO SpaServiceParams object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SpaServiceParamsDMO )" );

    thrower.ifParameterMissing( "SpaServiceParamsDMO", spaServiceParamsDMO );

    thrower.ifParameterMissing( "SpaServiceParamsDMO.spaServiceType",
      spaServiceParamsDMO.getSpaServiceType(  ) );

    thrower.ifParameterMissing( "SpaServiceParamsDMO.spaParamId",
      spaServiceParamsDMO.getSpaParamId(  ) );

    dao.delete( spaServiceParamsDMO );
  }

  /**
   * Deletes the SpaServiceParams object from the database.
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

    dao.delete( "SpaServiceParams", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SpaServiceParams object exists.
  *
  * @param SpaServiceParamsDMO SpaServiceParamsDMO
  *
  * @return true if the SpaServiceParams object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SpaServiceParamsDMO SpaServiceParamsDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SpaServiceParamsDMO)" );

    return dao.exists( "SpaServiceParams", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( SpaServiceParamsDMO.getSpaServiceType(  ) ).arg( SpaServiceParamsDMO
        .getSpaParamId(  ) ) );
  }

  /**
    * Return true if a SpaServiceParams object exists.
    *
    * @param filter
    *
    * @return true if the SpaServiceParams object exists.
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
   * @param locationDMO SpaServiceParams Data Model Object
   *
   * @return DTOList of SpaServiceParams Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    SpaServiceParamsDMO spaServiceParamsDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, spaServiceParamsDMO )" );

    return dao.getListAbs( state, paramQueryArgs( spaServiceParamsDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SpaServiceParamsDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    SpaServiceParamsDMO spaServiceParamsDMO ) {
    logger.debug( "paramQueryArgs( spaServiceParamsDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SpaServiceParams",
        4 * 2 );

    if ( spaServiceParamsDMO != null ) {
      // primary key filters...
      String spaServiceType = spaServiceParamsDMO.getSpaServiceType(  );

      if ( !DMO.isNull( spaServiceType ) ) {
        queryArgs.andFilterBy( "SpaServiceTypeMatch" )
                 .arg( spaServiceType + dao.wildcardForAnySequence(  ) );
      }

      Short spaParamId = spaServiceParamsDMO.getSpaParamId(  );

      if ( !DMO.isNull( spaParamId ) ) {
        queryArgs.andFilterBy( "SpaParamId" )
                 .arg( spaParamId );
      }

      // define more filters...
      String spaParamName = spaServiceParamsDMO.getSpaParamName(  );

      if ( !DMO.isNull( spaParamName ) ) {
        queryArgs.andFilterBy( "SpaParamNameMatch" )
                 .arg( spaParamName + dao.wildcardForAnySequence(  ) );
      }

      String spaDefaultVal = spaServiceParamsDMO.getSpaDefaultVal(  );

      if ( !DMO.isNull( spaDefaultVal ) ) {
        queryArgs.andFilterBy( "SpaDefaultValMatch" )
                 .arg( spaDefaultVal + dao.wildcardForAnySequence(  ) );
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
        ? "SpaServiceParams" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case SpaServiceParamsDMO.spaServiceTypeFilter:
          part.andFilterBy( queryArgs, "SpaServiceType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SpaServiceParamsDMO.spaParamIdFilter:
          part.andFilterBy( queryArgs, "SpaParamId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SpaServiceParamsDMO.spaParamNameFilter:
          part.andFilterBy( queryArgs, "SpaParamName",
            dao.wildcardForAnySequence(  ) );

          break;

        case SpaServiceParamsDMO.spaDefaultValFilter:
          part.andFilterBy( queryArgs, "SpaDefaultVal",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SpaServiceParams records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SpaServiceParams records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the SpaServiceParams Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SpaServiceParamsDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SpaServiceParamsDMO) dao.get( args.getDMLName(  ),
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
