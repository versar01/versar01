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
 * PgsProgramStatus Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PgsProgramStatusAbstractDACImpl
  extends DAC
  implements PgsProgramStatusAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PgsProgramStatusAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgsProgramStatusDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PgsProgramStatusAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public PgsProgramStatusAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PgsProgramStatus Data Model Object
   *
   * @return a populated PgsProgramStatus Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PgsProgramStatusDMO get( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "PgsProgramStatusDMO", pgsProgramStatusDMO );

    return (PgsProgramStatusDMO) dao.get( pgsProgramStatusDMO );
  }

  /**
   * Creates the PgsProgramStatus object in the database.
   *
   * @param PgsProgramStatusDMO pgsProgramStatusDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( pgsProgramStatusDMO )" );
    thrower.ifParameterMissing( "PgsProgramStatusDMO", pgsProgramStatusDMO );

    dao.insert( pgsProgramStatusDMO );
  }

  /**
   * Locks and retrieves the PgsProgramStatus object from the database.
   *
   * @param aPgsProgramStatus PgsProgramStatus object
   *
   * @return a populated PgsProgramStatus object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PgsProgramStatusDMO lock( PgsProgramStatusDMO aPgsProgramStatusDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "aPgsProgramStatusDMO", aPgsProgramStatusDMO );

    PgsProgramStatusDMO lockedPgsProgramStatusDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPgsProgramStatusDMO = (PgsProgramStatusDMO) dao.lock( "PgsProgramStatus",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aPgsProgramStatusDMO.getPgsProgramId(  ) ).arg( aPgsProgramStatusDMO
          .getPgsCycle(  ) ) );

    return lockedPgsProgramStatusDMO;
  }

  /**
   * Modifies the PgsProgramStatus object in the database.
   *
   * @param PgsProgramStatusDMO PgsProgramStatus object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "aPgsProgramStatusDMO", pgsProgramStatusDMO );

    thrower.ifParameterMissing( "PgsProgramStatusDMO.pgsProgramId",
      pgsProgramStatusDMO.getPgsProgramId(  ) );

    thrower.ifParameterMissing( "PgsProgramStatusDMO.pgsCycle",
      pgsProgramStatusDMO.getPgsCycle(  ) );

    dao.update( pgsProgramStatusDMO );
  }

  /**
  * Modifies the PgsProgramStatus object using the specified filter in the database.
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

    dao.updateCustom( new PgsProgramStatusDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PgsProgramStatus object from the database.
   *
   * @param PgsProgramStatusDMO PgsProgramStatus object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "PgsProgramStatusDMO", pgsProgramStatusDMO );

    thrower.ifParameterMissing( "PgsProgramStatusDMO.pgsProgramId",
      pgsProgramStatusDMO.getPgsProgramId(  ) );

    thrower.ifParameterMissing( "PgsProgramStatusDMO.pgsCycle",
      pgsProgramStatusDMO.getPgsCycle(  ) );

    dao.delete( pgsProgramStatusDMO );
  }

  /**
   * Deletes the PgsProgramStatus object from the database.
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

    dao.delete( "PgsProgramStatus", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PgsProgramStatus object exists.
  *
  * @param PgsProgramStatusDMO PgsProgramStatusDMO
  *
  * @return true if the PgsProgramStatus object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PgsProgramStatusDMO PgsProgramStatusDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PgsProgramStatusDMO)" );

    return dao.exists( "PgsProgramStatus", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( PgsProgramStatusDMO.getPgsProgramId(  ) ).arg( PgsProgramStatusDMO
        .getPgsCycle(  ) ) );
  }

  /**
    * Return true if a PgsProgramStatus object exists.
    *
    * @param filter
    *
    * @return true if the PgsProgramStatus object exists.
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
   * @param locationDMO PgsProgramStatus Data Model Object
   *
   * @return DTOList of PgsProgramStatus Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, pgsProgramStatusDMO )" );

    return dao.getListAbs( state, paramQueryArgs( pgsProgramStatusDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PgsProgramStatusDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PgsProgramStatusDMO pgsProgramStatusDMO ) {
    logger.debug( "paramQueryArgs( pgsProgramStatusDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PgsProgramStatus",
        8 * 2 );

    if ( pgsProgramStatusDMO != null ) {
      // primary key filters...
      String pgsProgramId = pgsProgramStatusDMO.getPgsProgramId(  );

      if ( !DMO.isNull( pgsProgramId ) ) {
        queryArgs.andFilterBy( "PgsProgramIdMatch" )
                 .arg( pgsProgramId + dao.wildcardForAnySequence(  ) );
      }

      String pgsCycle = pgsProgramStatusDMO.getPgsCycle(  );

      if ( !DMO.isNull( pgsCycle ) ) {
        queryArgs.andFilterBy( "PgsCycleMatch" )
                 .arg( pgsCycle + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String pgsDescription = pgsProgramStatusDMO.getPgsDescription(  );

      if ( !DMO.isNull( pgsDescription ) ) {
        queryArgs.andFilterBy( "PgsDescriptionMatch" )
                 .arg( pgsDescription + dao.wildcardForAnySequence(  ) );
      }

      String pgsStatus = pgsProgramStatusDMO.getPgsStatus(  );

      if ( !DMO.isNull( pgsStatus ) ) {
        queryArgs.andFilterBy( "PgsStatusMatch" )
                 .arg( pgsStatus + dao.wildcardForAnySequence(  ) );
      }

      String pgsErrorMess = pgsProgramStatusDMO.getPgsErrorMess(  );

      if ( !DMO.isNull( pgsErrorMess ) ) {
        queryArgs.andFilterBy( "PgsErrorMessMatch" )
                 .arg( pgsErrorMess + dao.wildcardForAnySequence(  ) );
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
        ? "PgsProgramStatus" : dmlName, parts.size(  ) );

    
    Iterator it = parts.iterator();
    while(it.hasNext()){
//    for ( FilterPart part : parts ) {
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case PgsProgramStatusDMO.pgsProgramIdFilter:
          part.andFilterBy( queryArgs, "PgsProgramId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsCycleFilter:
          part.andFilterBy( queryArgs, "PgsCycle",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsDescriptionFilter:
          part.andFilterBy( queryArgs, "PgsDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsStatusFilter:
          part.andFilterBy( queryArgs, "PgsStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsStatusValueFilter:
          part.andFilterBy( queryArgs, "PgsStatusValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsStatusClassFilter:
          part.andFilterBy( queryArgs, "PgsStatusClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsIsamValueFilter:
          part.andFilterBy( queryArgs, "PgsIsamValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgsProgramStatusDMO.pgsErrorMessFilter:
          part.andFilterBy( queryArgs, "PgsErrorMess",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PgsProgramStatus records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PgsProgramStatus records based
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
   * Retrieves the PgsProgramStatus Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PgsProgramStatusDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PgsProgramStatusDMO) dao.get( args.getDMLName(  ),
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
