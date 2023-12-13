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
 * EcEventCommand Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class EcEventCommandAbstractDACImpl
  extends DAC
  implements EcEventCommandDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( EcEventCommandDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcEventCommandDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public EcEventCommandAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }

  public EcEventCommandAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }  
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a EcEventCommand Data Model Object
   *
   * @return a populated EcEventCommand Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcEventCommandDMO get( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( EcEventCommandDMO )" );

    thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );

    return (EcEventCommandDMO) dao.get( ecEventCommandDMO );
  }

  /**
   * Creates the EcEventCommand object in the database.
   *
   * @param EcEventCommandDMO ecEventCommandDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( ecEventCommandDMO )" );
    thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );

    dao.insert( ecEventCommandDMO );
  }

  /**
   * Locks and retrieves the EcEventCommand object from the database.
   *
   * @param aEcEventCommand EcEventCommand object
   *
   * @return a populated EcEventCommand object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcEventCommandDMO lock( EcEventCommandDMO aEcEventCommandDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aEcEventCommandDMO )" );

    thrower.ifParameterMissing( "aEcEventCommandDMO", aEcEventCommandDMO );

    EcEventCommandDMO lockedEcEventCommandDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedEcEventCommandDMO = (EcEventCommandDMO) dao.lock( "EcEventCommand",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aEcEventCommandDMO.getEcCommand(  ) ) );

    return lockedEcEventCommandDMO;
  }

  /**
   * Modifies the EcEventCommand object in the database.
   *
   * @param EcEventCommandDMO EcEventCommand object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aEcEventCommandDMO )" );

    thrower.ifParameterMissing( "aEcEventCommandDMO", ecEventCommandDMO );

    thrower.ifParameterMissing( "EcEventCommandDMO.ecCommand",
      ecEventCommandDMO.getEcCommand(  ) );

    dao.update( ecEventCommandDMO );
  }

  /**
  * Modifies the EcEventCommand object using the specified filter in the database.
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

    dao.updateCustom( new EcEventCommandDMO(  ),filterQueryArgs( filter, null ));
  }

  /**
   * Deletes the EcEventCommand object from the database.
   *
   * @param EcEventCommandDMO EcEventCommand object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( EcEventCommandDMO )" );

    thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );

    thrower.ifParameterMissing( "EcEventCommandDMO.ecCommand",
      ecEventCommandDMO.getEcCommand(  ) );

    dao.delete( ecEventCommandDMO );
  }

  /**
   * Deletes the EcEventCommand object from the database.
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

    dao.delete( "EcEventCommand", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a EcEventCommand object exists.
  *
  * @param EcEventCommandDMO EcEventCommandDMO
  *
  * @return true if the EcEventCommand object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( EcEventCommandDMO EcEventCommandDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( EcEventCommandDMO)" );

    return dao.exists( "EcEventCommand", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( EcEventCommandDMO.getEcCommand(  ) ) );
  }

  /**
    * Return true if a EcEventCommand object exists.
    *
    * @param filter
    *
    * @return true if the EcEventCommand object exists.
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
   * @param locationDMO EcEventCommand Data Model Object
   *
   * @return DTOList of EcEventCommand Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, ecEventCommandDMO )" );

    return new DTOList(dao.getList( paramQueryArgs( ecEventCommandDMO )));
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} EcEventCommandDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    EcEventCommandDMO ecEventCommandDMO ) {
    logger.debug( "paramQueryArgs( ecEventCommandDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EcEventCommand",
        15 * 2 );

    if ( ecEventCommandDMO != null ) {
      // primary key filters...
      String ecCommand = ecEventCommandDMO.getEcCommand(  );

      if ( !DMO.isNull( ecCommand ) ) {
        queryArgs.andFilterBy( "EcCommandMatch" )
                 .arg( ecCommand + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String ecStatus = ecEventCommandDMO.getEcStatus(  );

      if ( !DMO.isNull( ecStatus ) ) {
        queryArgs.andFilterBy( "EcStatusMatch" )
                 .arg( ecStatus + dao.wildcardForAnySequence(  ) );
      }

      String ecMessage = ecEventCommandDMO.getEcMessage(  );

      if ( !DMO.isNull( ecMessage ) ) {
        queryArgs.andFilterBy( "EcMessageMatch" )
                 .arg( ecMessage + dao.wildcardForAnySequence(  ) );
      }

      String ecNetwork = ecEventCommandDMO.getEcNetwork(  );

      if ( !DMO.isNull( ecNetwork ) ) {
        queryArgs.andFilterBy( "EcNetworkMatch" )
                 .arg( ecNetwork + dao.wildcardForAnySequence(  ) );
      }

      String ecType = ecEventCommandDMO.getEcType(  );

      if ( !DMO.isNull( ecType ) ) {
        queryArgs.andFilterBy( "EcTypeMatch" )
                 .arg( ecType + dao.wildcardForAnySequence(  ) );
      }

      String ecMsisdn = ecEventCommandDMO.getEcMsisdn();

      if ( !DMO.isNull( ecMsisdn ) ) {
        queryArgs.andFilterBy( "EcMsisdnMatch" )
                 .arg( ecMsisdn + dao.wildcardForAnySequence(  ) );
      }

      String ecSim = ecEventCommandDMO.getEcSim();

      if ( !DMO.isNull( ecSim ) ) {
        queryArgs.andFilterBy( "EcSimMatch" )
                 .arg( ecSim + dao.wildcardForAnySequence(  ) );
      }

      String ecOperator = ecEventCommandDMO.getEcOperator(  );

      if ( !DMO.isNull( ecOperator ) ) {
        queryArgs.andFilterBy( "EcOperatorMatch" )
                 .arg( ecOperator + dao.wildcardForAnySequence(  ) );
      }

      String ecTty = ecEventCommandDMO.getEcTty(  );

      if ( !DMO.isNull( ecTty ) ) {
        queryArgs.andFilterBy( "EcTtyMatch" )
                 .arg( ecTty + dao.wildcardForAnySequence(  ) );
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

    return new DTOList(dao.getList( filterQueryArgs( filter, null)));
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
        ? "EcEventCommand" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();

      switch ( part.getIndex(  ) ) {
        case EcEventCommandDMO.ecCommandFilter:
          part.andFilterBy( queryArgs, "EcCommand",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecStatusFilter:
        
          part.andFilterBy( queryArgs, "EcStatus");
//        		  , dao.wildcardForAnySequence(  ) );
          break;

        case EcEventCommandDMO.ecDateFilter:
          part.andFilterBy( queryArgs, "EcDate",
            dao.wildcardForAnySequence(  ) );
          break;

        case EcEventCommandDMO.ecTimeFilter:
          part.andFilterBy( queryArgs, "EcTime",
            dao.wildcardForAnySequence(  ) );
          break;

        case EcEventCommandDMO.ecMessageFilter:
          part.andFilterBy( queryArgs, "EcMessage",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecNetworkFilter:
          part.andFilterBy( queryArgs, "EcNetwork",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecTypeFilter:
          part.andFilterBy( queryArgs, "EcType",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecPriorityFilter:
          part.andFilterBy( queryArgs, "EcPriority",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecSendSeqFilter:
          part.andFilterBy( queryArgs, "EcSendSeq",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecSubscriberIdFilter:
          part.andFilterBy( queryArgs, "EcSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecMsisdnFilter:
          part.andFilterBy( queryArgs, "EcMsisdn",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecSimFilter:
          part.andFilterBy( queryArgs, "EcSim",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecOperatorFilter:
          part.andFilterBy( queryArgs, "EcOperator",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcEventCommandDMO.ecTtyFilter:
          part.andFilterBy( queryArgs, "EcTty", dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of EcEventCommand records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), false);
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of EcEventCommand records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ: Fixme
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

//    return dao.iterator(filterQueryArgs( filter, false ));
    return null;
  }

  /**
   * Retrieves the EcEventCommand Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public EcEventCommandDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (EcEventCommandDMO) dao.get( args.getDMLName(  ),
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

