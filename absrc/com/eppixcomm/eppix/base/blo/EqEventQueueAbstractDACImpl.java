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
 * EqEventQueue Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class EqEventQueueAbstractDACImpl
  extends DAC
  implements EqEventQueueAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( EqEventQueueAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EqEventQueueDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public EqEventQueueAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }
  
  public EqEventQueueAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Creates the EqEventQueue object in the database.
   *
   * @param EqEventQueueDMO eqEventQueueDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( EqEventQueueDMO eqEventQueueDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( eqEventQueueDMO )" );
    thrower.ifParameterMissing( "EqEventQueueDMO", eqEventQueueDMO );

    dao.insert( eqEventQueueDMO );
  }

  /**
   * Locks and retrieves the EqEventQueue object from the database.
   *
   * @param aEqEventQueue EqEventQueue object
   *
   * @return a populated EqEventQueue object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EqEventQueueDMO lock( EqEventQueueDMO aEqEventQueueDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aEqEventQueueDMO )" );

    thrower.ifParameterMissing( "aEqEventQueueDMO", aEqEventQueueDMO );

    EqEventQueueDMO lockedEqEventQueueDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedEqEventQueueDMO = (EqEventQueueDMO) dao.lock( "EqEventQueue",
        "filterByPrimaryKey", new DAOArgs( 0 ) );

    return lockedEqEventQueueDMO;
  }

  /**
  * Modifies the EqEventQueue object using the specified filter in the database.
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

    dao.updateCustom( new EqEventQueueDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the EqEventQueue object from the database.
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

    dao.delete( "EqEventQueue", args.getFilterBy(  ), args );
  }

  /**
    * Return true if a EqEventQueue object exists.
    *
    * @param filter
    *
    * @return true if the EqEventQueue object exists.
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
   * @param locationDMO EqEventQueue Data Model Object
   *
   * @return DTOList of EqEventQueue Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState    state,
    EqEventQueueDMO eqEventQueueDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, eqEventQueueDMO )" );

    /**
     * TODO SJ Fixme
     */

    return new DTOList(dao.getList("listEqEventQueuePriorityDesc",  paramQueryArgs(eqEventQueueDMO)));
    
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} EqEventQueueDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    EqEventQueueDMO eqEventQueueDMO ) {
    logger.debug( "paramQueryArgs( eqEventQueueDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EqEventQueue", 5 * 2 );

    if ( eqEventQueueDMO != null ) {
      // primary key filters...
      // define more filters...
      String eqCommand = eqEventQueueDMO.getEqCommand(  );

      if ( !DMO.isNull( eqCommand ) ) {
        queryArgs.andFilterBy( "EqCommandMatch" )
                 .arg( eqCommand + dao.wildcardForAnySequence(  ) );
      }

      String eqMessage = eqEventQueueDMO.getEqMessage(  );

      if ( !DMO.isNull( eqMessage ) ) {
        queryArgs.andFilterBy( "EqMessageMatch" )
                 .arg( eqMessage + dao.wildcardForAnySequence(  ) );
      }

      String eqNetwork = eqEventQueueDMO.getEqNetwork(  );

      if ( !DMO.isNull( eqNetwork ) ) {
        queryArgs.andFilterBy( "EqNetworkMatch" )
                 .arg( eqNetwork + dao.wildcardForAnySequence(  ) );
      }

//      String eqTechnologyInd = eqEventQueueDMO.getEqTechnologyInd(  );

//      if ( !DMO.isNull( eqTechnologyInd ) ) {
//        queryArgs.andFilterBy( "EqTechnologyIndMatch" )
//                 .arg( eqTechnologyInd + dao.wildcardForAnySequence(  ) );
//      }
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

    /**
     * TODO Fixme;
     */
    return new DTOList(dao.getList(filterQueryArgs( filter, null)));
    
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
        ? "EqEventQueue" : dmlName, parts.size(  ) );

    Iterator  it = parts.iterator();
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
//    for ( FilterPart part : parts ) {
      switch ( part.getIndex(  ) ) {
        case EqEventQueueDMO.eqCommandFilter:
          part.andFilterBy( queryArgs, "EqCommand",
            dao.wildcardForAnySequence(  ) );

          break;

        case EqEventQueueDMO.eqMessageFilter:
          part.andFilterBy( queryArgs, "EqMessage",
            dao.wildcardForAnySequence(  ) );

          break;

        case EqEventQueueDMO.eqNetworkFilter:
          part.andFilterBy( queryArgs, "EqNetwork",
            dao.wildcardForAnySequence(  ) );

          break;

        case EqEventQueueDMO.eqPriorityFilter:
          part.andFilterBy( queryArgs, "EqPriority",
            dao.wildcardForAnySequence(  ) );

          break;

//        case EqEventQueueDMO.eqTechnologyIndFilter:
//          part.andFilterBy( queryArgs, "EqTechnologyInd",
//            dao.wildcardForAnySequence(  ) );
//
//          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of EqEventQueue records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    /**
     * TODO SJ Fixme
     */
    return dao.iterator( filterQueryArgs( filter, null ) );

  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of EqEventQueue records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * @{@link Deprecated}
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    /**
     * README: Possibly cannot be used on Informix
     * Use iterator(QueryFilter filter) without a lock
     * 
     */
    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the EqEventQueue Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public EqEventQueueDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (EqEventQueueDMO) dao.get( args.getDMLName(  ),
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

