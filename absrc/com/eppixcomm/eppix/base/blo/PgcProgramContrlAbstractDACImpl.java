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
 * PgcProgramContrl Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PgcProgramContrlAbstractDACImpl
  extends DAC
  implements PgcProgramContrlAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PgcProgramContrlAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgcProgramContrlDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PgcProgramContrlAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public PgcProgramContrlAbstractDACImpl(DAO dao) {
		    super( dao, thrower );
		  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PgcProgramContrl Data Model Object
   *
   * @return a populated PgcProgramContrl Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PgcProgramContrlDMO get( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "PgcProgramContrlDMO", pgcProgramContrlDMO );

    return (PgcProgramContrlDMO) dao.get( pgcProgramContrlDMO );
  }

  /**
   * Creates the PgcProgramContrl object in the database.
   *
   * @param PgcProgramContrlDMO pgcProgramContrlDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( pgcProgramContrlDMO )" );
    thrower.ifParameterMissing( "PgcProgramContrlDMO", pgcProgramContrlDMO );

    dao.insert( pgcProgramContrlDMO );
  }

  /**
   * Locks and retrieves the PgcProgramContrl object from the database.
   *
   * @param aPgcProgramContrl PgcProgramContrl object
   *
   * @return a populated PgcProgramContrl object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PgcProgramContrlDMO lock( PgcProgramContrlDMO aPgcProgramContrlDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "aPgcProgramContrlDMO", aPgcProgramContrlDMO );

    PgcProgramContrlDMO lockedPgcProgramContrlDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPgcProgramContrlDMO = (PgcProgramContrlDMO) dao.lock( "PgcProgramContrl",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aPgcProgramContrlDMO.getPgcProgramId(  ) ).arg( aPgcProgramContrlDMO
          .getPgcDependencyId(  ) ).arg( aPgcProgramContrlDMO.getPgcCycle(  ) ) );

    return lockedPgcProgramContrlDMO;
  }

  /**
   * Modifies the PgcProgramContrl object in the database.
   *
   * @param PgcProgramContrlDMO PgcProgramContrl object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "aPgcProgramContrlDMO", pgcProgramContrlDMO );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcProgramId",
      pgcProgramContrlDMO.getPgcProgramId(  ) );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcDependencyId",
      pgcProgramContrlDMO.getPgcDependencyId(  ) );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcCycle",
      pgcProgramContrlDMO.getPgcCycle(  ) );

    dao.update( pgcProgramContrlDMO );
  }

  /**
  * Modifies the PgcProgramContrl object using the specified filter in the database.
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

    dao.updateCustom( new PgcProgramContrlDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PgcProgramContrl object from the database.
   *
   * @param PgcProgramContrlDMO PgcProgramContrl object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "PgcProgramContrlDMO", pgcProgramContrlDMO );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcProgramId",
      pgcProgramContrlDMO.getPgcProgramId(  ) );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcDependencyId",
      pgcProgramContrlDMO.getPgcDependencyId(  ) );

    thrower.ifParameterMissing( "PgcProgramContrlDMO.pgcCycle",
      pgcProgramContrlDMO.getPgcCycle(  ) );

    dao.delete( pgcProgramContrlDMO );
  }

  /**
   * Deletes the PgcProgramContrl object from the database.
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

    dao.delete( "PgcProgramContrl", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PgcProgramContrl object exists.
  *
  * @param PgcProgramContrlDMO PgcProgramContrlDMO
  *
  * @return true if the PgcProgramContrl object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PgcProgramContrlDMO PgcProgramContrlDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PgcProgramContrlDMO)" );

    return dao.exists( "PgcProgramContrl", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( PgcProgramContrlDMO.getPgcProgramId(  ) ).arg( PgcProgramContrlDMO
        .getPgcDependencyId(  ) ).arg( PgcProgramContrlDMO.getPgcCycle(  ) ) );
  }

  /**
    * Return true if a PgcProgramContrl object exists.
    *
    * @param filter
    *
    * @return true if the PgcProgramContrl object exists.
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
   * @param locationDMO PgcProgramContrl Data Model Object
   *
   * @return DTOList of PgcProgramContrl Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, pgcProgramContrlDMO )" );

    return dao.getListAbs( state, paramQueryArgs( pgcProgramContrlDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PgcProgramContrlDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PgcProgramContrlDMO pgcProgramContrlDMO ) {
    logger.debug( "paramQueryArgs( pgcProgramContrlDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PgcProgramContrl",
        5 * 2 );

    if ( pgcProgramContrlDMO != null ) {
      // primary key filters...
      String pgcProgramId = pgcProgramContrlDMO.getPgcProgramId(  );

      if ( !DMO.isNull( pgcProgramId ) ) {
        queryArgs.andFilterBy( "PgcProgramIdMatch" )
                 .arg( pgcProgramId + dao.wildcardForAnySequence(  ) );
      }

      String pgcDependencyId = pgcProgramContrlDMO.getPgcDependencyId(  );

      if ( !DMO.isNull( pgcDependencyId ) ) {
        queryArgs.andFilterBy( "PgcDependencyIdMatch" )
                 .arg( pgcDependencyId + dao.wildcardForAnySequence(  ) );
      }

      String pgcCycle = pgcProgramContrlDMO.getPgcCycle(  );

      if ( !DMO.isNull( pgcCycle ) ) {
        queryArgs.andFilterBy( "PgcCycleMatch" )
                 .arg( pgcCycle + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String pgcResetFlag = pgcProgramContrlDMO.getPgcResetFlag(  );

      if ( !DMO.isNull( pgcResetFlag ) ) {
        queryArgs.andFilterBy( "PgcResetFlagMatch" )
                 .arg( pgcResetFlag + dao.wildcardForAnySequence(  ) );
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
        ? "PgcProgramContrl" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    
    while(it.hasNext()){
//    for ( FilterPart part : parts ) {
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case PgcProgramContrlDMO.pgcProgramIdFilter:
          part.andFilterBy( queryArgs, "PgcProgramId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgcProgramContrlDMO.pgcDependencyIdFilter:
          part.andFilterBy( queryArgs, "PgcDependencyId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgcProgramContrlDMO.pgcCycleFilter:
          part.andFilterBy( queryArgs, "PgcCycle",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgcProgramContrlDMO.pgcResetFlagFilter:
          part.andFilterBy( queryArgs, "PgcResetFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case PgcProgramContrlDMO.pgcPriorityFilter:
          part.andFilterBy( queryArgs, "PgcPriority",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PgcProgramContrl records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PgcProgramContrl records based
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
   * Retrieves the PgcProgramContrl Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PgcProgramContrlDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PgcProgramContrlDMO) dao.get( args.getDMLName(  ),
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
