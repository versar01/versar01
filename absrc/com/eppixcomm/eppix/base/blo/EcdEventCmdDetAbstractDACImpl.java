package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.base.blo.EcdEventCmdDetDMO;
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
 * EcdEventCmdDet Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class EcdEventCmdDetAbstractDACImpl
  extends DAC
  implements EcdEventCmdDetAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( EcdEventCmdDetAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcdEventCmdDetDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public EcdEventCmdDetAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }

  public EcdEventCmdDetAbstractDACImpl(DAO  dao ) {
	super( dao, thrower );
  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a EcdEventCmdDet Data Model Object
   *
   * @return a populated EcdEventCmdDet Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcdEventCmdDetDMO get( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( EcdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO", ecdEventCmdDetDMO );

    return (EcdEventCmdDetDMO) dao.get( ecdEventCmdDetDMO );
  }

  /**
   * Creates the EcdEventCmdDet object in the database.
   *
   * @param EcdEventCmdDetDMO ecdEventCmdDetDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( ecdEventCmdDetDMO )" );
    thrower.ifParameterMissing( "EcdEventCmdDetDMO", ecdEventCmdDetDMO );

    dao.insert( ecdEventCmdDetDMO );
  }

  /**
   * Locks and retrieves the EcdEventCmdDet object from the database.
   *
   * @param aEcdEventCmdDet EcdEventCmdDet object
   *
   * @return a populated EcdEventCmdDet object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EcdEventCmdDetDMO lock( EcdEventCmdDetDMO aEcdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aEcdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO", aEcdEventCmdDetDMO );

    EcdEventCmdDetDMO lockedEcdEventCmdDetDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedEcdEventCmdDetDMO = (EcdEventCmdDetDMO) dao.lock( "EcdEventCmdDet",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aEcdEventCmdDetDMO.getEcdCommand(  ) ).arg( aEcdEventCmdDetDMO
          .getEcdSeqno(  ) ) );

    return lockedEcdEventCmdDetDMO;
  }

  /**
   * Modifies the EcdEventCmdDet object in the database.
   *
   * @param EcdEventCmdDetDMO EcdEventCmdDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aEcdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO", ecdEventCmdDetDMO );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO.ecdCommand",
      ecdEventCmdDetDMO.getEcdCommand(  ) );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO.ecdSeqno",
      ecdEventCmdDetDMO.getEcdSeqno(  ) );

    dao.update( ecdEventCmdDetDMO );
  }

  /**
  * Modifies the EcdEventCmdDet object using the specified filter in the database.
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

    dao.updateCustom( new EcdEventCmdDetDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the EcdEventCmdDet object from the database.
   *
   * @param EcdEventCmdDetDMO EcdEventCmdDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( EcdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO", ecdEventCmdDetDMO );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO.ecdCommand",
      ecdEventCmdDetDMO.getEcdCommand(  ) );

    thrower.ifParameterMissing( "EcdEventCmdDetDMO.ecdSeqno",
      ecdEventCmdDetDMO.getEcdSeqno(  ) );

    dao.delete( ecdEventCmdDetDMO );
  }

  /**
   * Deletes the EcdEventCmdDet object from the database.
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

    dao.delete( "EcdEventCmdDet", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a EcdEventCmdDet object exists.
  *
  * @param EcdEventCmdDetDMO EcdEventCmdDetDMO
  *
  * @return true if the EcdEventCmdDet object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( EcdEventCmdDetDMO EcdEventCmdDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( EcdEventCmdDetDMO)" );

    return dao.exists( "EcdEventCmdDet", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( EcdEventCmdDetDMO.getEcdCommand(  ) ).arg( EcdEventCmdDetDMO
        .getEcdSeqno(  ) ) );
  }

  /**
    * Return true if a EcdEventCmdDet object exists.
    *
    * @param filter
    *
    * @return true if the EcdEventCmdDet object exists.
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
   * @param locationDMO EcdEventCmdDet Data Model Object
   *
   * @return DTOList of EcdEventCmdDet Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, ecdEventCmdDetSortedDMO )" );

    /**
     * TODO SJ Change to compatible java
     */
    return new DTOList(dao.getList(paramQueryArgs( ecdEventCmdDetDMO )));
  }
  
  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} EcdEventCmdDetDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs(EcdEventCmdDetDMO ecdEventCmdDetDMO ) {
    logger.debug( "paramQueryArgs( ecdEventCmdDetDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EcdEventCmdDet",
        5 * 2 );

    if ( ecdEventCmdDetDMO != null ) {
      // primary key filters...
      String ecdCommand = ecdEventCmdDetDMO.getEcdCommand(  );

      if ( !DMO.isNull( ecdCommand ) ) {
        queryArgs.andFilterBy( "EcdCommandMatch" )
                 .arg( ecdCommand + dao.wildcardForAnySequence(  ) );
      }

      Short ecdSeqno = ecdEventCmdDetDMO.getEcdSeqno(  );

      if ( !DMO.isNull( ecdSeqno ) ) {
        queryArgs.andFilterBy( "EcdSeqno" )
                 .arg( ecdSeqno );
      }

      // define more filters...
      String ecdDetType = ecdEventCmdDetDMO.getEcdDetType(  );

      if ( !DMO.isNull( ecdDetType ) ) {
        queryArgs.andFilterBy( "EcdDetTypeMatch" )
                 .arg( ecdDetType + dao.wildcardForAnySequence(  ) );
      }

      String ecdText = ecdEventCmdDetDMO.getEcdText(  );

      if ( !DMO.isNull( ecdText ) ) {
        queryArgs.andFilterBy( "EcdTextMatch" )
                 .arg( ecdText + dao.wildcardForAnySequence(  ) );
      }

      String ecdFlag = ecdEventCmdDetDMO.getEcdFlag(  );

      if ( !DMO.isNull( ecdFlag ) ) {
        queryArgs.andFilterBy( "EcdFlagMatch" )
                 .arg( ecdFlag + dao.wildcardForAnySequence(  ) );
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

    /**
     * TODo SJ Change to compatible java
     */
    return new DTOList(dao.getList(filterQueryArgs( filter, null )));
//    return null;
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
        ? "EcdEventCmdDet" : dmlName, parts.size(  ) );

    /**
     * TODO SJ Need to change for loop to compatible java
     */
    
    Iterator it = parts.iterator();
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
//    for ( FilterPart part : parts ) {
      switch ( part.getIndex(  ) ) {
        case EcdEventCmdDetDMO.ecdCommandFilter:
          part.andFilterBy( queryArgs, "EcdCommand",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcdEventCmdDetDMO.ecdSeqnoFilter:
          part.andFilterBy( queryArgs, "EcdSeqno",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcdEventCmdDetDMO.ecdDetTypeFilter:
          part.andFilterBy( queryArgs, "EcdDetType",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcdEventCmdDetDMO.ecdTextFilter:
          part.andFilterBy( queryArgs, "EcdText",
            dao.wildcardForAnySequence(  ) );

          break;

        case EcdEventCmdDetDMO.ecdFlagFilter:
          part.andFilterBy( queryArgs, "EcdFlag",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of EcdEventCmdDet records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ: Change to compatible java
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of EcdEventCmdDet records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ: Change to compatible java
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ));
  }

  /**
   * Retrieves the EcdEventCmdDet Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public EcdEventCmdDetDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (EcdEventCmdDetDMO) dao.get( args.getDMLName(  ),
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

//public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//public DAOIterator iterateWithLock(QueryFilter filter) throws EPPIXSeriousException {
//	// TODO Auto-generated method stub
//	return null;
//}
}
