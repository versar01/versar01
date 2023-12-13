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
 * Vsr2ServiceAux Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class Vsr2ServiceAuxAbstractDACImpl
  extends DAC
  implements Vsr2ServiceAuxAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( Vsr2ServiceAuxAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new Vsr2ServiceAuxDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public Vsr2ServiceAuxAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public Vsr2ServiceAuxAbstractDACImpl(DAO dao ) {
		    super(dao, thrower );
		  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Vsr2ServiceAux Data Model Object
   *
   * @return a populated Vsr2ServiceAux Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public Vsr2ServiceAuxDMO get( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( Vsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "Vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    return (Vsr2ServiceAuxDMO) dao.get( vsr2ServiceAuxDMO );
  }

  /**
   * Creates the Vsr2ServiceAux object in the database.
   *
   * @param Vsr2ServiceAuxDMO vsr2ServiceAuxDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vsr2ServiceAuxDMO )" );
    thrower.ifParameterMissing( "Vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    dao.insert( vsr2ServiceAuxDMO );
  }

  /**
   * Locks and retrieves the Vsr2ServiceAux object from the database.
   *
   * @param aVsr2ServiceAux Vsr2ServiceAux object
   *
   * @return a populated Vsr2ServiceAux object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public Vsr2ServiceAuxDMO lock( Vsr2ServiceAuxDMO aVsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO", aVsr2ServiceAuxDMO );

    Vsr2ServiceAuxDMO lockedVsr2ServiceAuxDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVsr2ServiceAuxDMO = (Vsr2ServiceAuxDMO) dao.lock( "Vsr2ServiceAux",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVsr2ServiceAuxDMO.getVsr2ServiceCode(  ) ) );

    return lockedVsr2ServiceAuxDMO;
  }

  /**
   * Modifies the Vsr2ServiceAux object in the database.
   *
   * @param Vsr2ServiceAuxDMO Vsr2ServiceAux object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "aVsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    thrower.ifParameterMissing( "Vsr2ServiceAuxDMO.vsr2ServiceCode",
      vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) );

    dao.update( vsr2ServiceAuxDMO );
  }

  /**
  * Modifies the Vsr2ServiceAux object using the specified filter in the database.
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

    dao.updateCustom( new Vsr2ServiceAuxDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Vsr2ServiceAux object from the database.
   *
   * @param Vsr2ServiceAuxDMO Vsr2ServiceAux object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( Vsr2ServiceAuxDMO )" );

    thrower.ifParameterMissing( "Vsr2ServiceAuxDMO", vsr2ServiceAuxDMO );

    thrower.ifParameterMissing( "Vsr2ServiceAuxDMO.vsr2ServiceCode",
      vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) );

    dao.delete( vsr2ServiceAuxDMO );
  }

  /**
   * Deletes the Vsr2ServiceAux object from the database.
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

    dao.delete( "Vsr2ServiceAux", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Vsr2ServiceAux object exists.
  *
  * @param Vsr2ServiceAuxDMO Vsr2ServiceAuxDMO
  *
  * @return true if the Vsr2ServiceAux object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( Vsr2ServiceAuxDMO Vsr2ServiceAuxDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( Vsr2ServiceAuxDMO)" );

    return dao.exists( "Vsr2ServiceAux", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( Vsr2ServiceAuxDMO.getVsr2ServiceCode(  ) ) );
  }

  /**
    * Return true if a Vsr2ServiceAux object exists.
    *
    * @param filter
    *
    * @return true if the Vsr2ServiceAux object exists.
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
   * @param locationDMO Vsr2ServiceAux Data Model Object
   *
   * @return DTOList of Vsr2ServiceAux Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vsr2ServiceAuxDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vsr2ServiceAuxDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} Vsr2ServiceAuxDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    Vsr2ServiceAuxDMO vsr2ServiceAuxDMO ) {
    logger.debug( "paramQueryArgs( vsr2ServiceAuxDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Vsr2ServiceAux",
        6 * 2 );

    if ( vsr2ServiceAuxDMO != null ) {
      // primary key filters...
      String vsr2ServiceCode = vsr2ServiceAuxDMO.getVsr2ServiceCode(  );

      if ( !DMO.isNull( vsr2ServiceCode ) ) {
        queryArgs.andFilterBy( "Vsr2ServiceCodeMatch" )
                 .arg( vsr2ServiceCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vsr2EntryType = vsr2ServiceAuxDMO.getVsr2EntryType(  );

      if ( !DMO.isNull( vsr2EntryType ) ) {
        queryArgs.andFilterBy( "Vsr2EntryTypeMatch" )
                 .arg( vsr2EntryType + dao.wildcardForAnySequence(  ) );
      }

      String vsr2Technology = vsr2ServiceAuxDMO.getVsr2Technology(  );

      if ( !DMO.isNull( vsr2Technology ) ) {
        queryArgs.andFilterBy( "Vsr2TechnologyMatch" )
                 .arg( vsr2Technology + dao.wildcardForAnySequence(  ) );
      }

//      String vsr2AuthReqd = vsr2ServiceAuxDMO.getVsr2AuthReqd(  );
//
//      if ( !DMO.isNull( vsr2AuthReqd ) ) {
//        queryArgs.andFilterBy( "Vsr2AuthReqdMatch" )
//                 .arg( vsr2AuthReqd + dao.wildcardForAnySequence(  ) );
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
        ? "Vsr2ServiceAux" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case Vsr2ServiceAuxDMO.vsr2ServiceCodeFilter:
          part.andFilterBy( queryArgs, "Vsr2ServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case Vsr2ServiceAuxDMO.vsr2ServiceOrderFilter:
          part.andFilterBy( queryArgs, "Vsr2ServiceOrder",
            dao.wildcardForAnySequence(  ) );

          break;

        case Vsr2ServiceAuxDMO.vsr2SimRelatedFilter:
          part.andFilterBy( queryArgs, "Vsr2SimRelated",
            dao.wildcardForAnySequence(  ) );

          break;

        case Vsr2ServiceAuxDMO.vsr2EntryTypeFilter:
          part.andFilterBy( queryArgs, "Vsr2EntryType",
            dao.wildcardForAnySequence(  ) );

          break;

        case Vsr2ServiceAuxDMO.vsr2TechnologyFilter:
          part.andFilterBy( queryArgs, "Vsr2Technology",
            dao.wildcardForAnySequence(  ) );

          break;

//        case Vsr2ServiceAuxDMO.vsr2AuthReqdFilter:
//          part.andFilterBy( queryArgs, "Vsr2AuthReqd",
//            dao.wildcardForAnySequence(  ) );
//
//          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Vsr2ServiceAux records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Vsr2ServiceAux records based
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
   * Retrieves the Vsr2ServiceAux Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public Vsr2ServiceAuxDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (Vsr2ServiceAuxDMO) dao.get( args.getDMLName(  ),
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
