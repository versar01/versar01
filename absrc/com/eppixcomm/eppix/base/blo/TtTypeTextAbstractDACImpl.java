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

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * TtTypeText Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class TtTypeTextAbstractDACImpl
  extends DAC
  implements TtTypeTextAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( TtTypeTextAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TtTypeTextDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public TtTypeTextAbstractDACImpl( 
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a TtTypeText Data Model Object
   *
   * @return a populated TtTypeText Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TtTypeTextDMO get( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( TtTypeTextDMO )" );

    thrower.ifParameterMissing( "TtTypeTextDMO", ttTypeTextDMO );

    return (TtTypeTextDMO) dao.get( ttTypeTextDMO );
  }

  /**
   * Creates the TtTypeText object in the database.
   *
   * @param TtTypeTextDMO ttTypeTextDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( ttTypeTextDMO )" );
    thrower.ifParameterMissing( "TtTypeTextDMO", ttTypeTextDMO );

    dao.insert( ttTypeTextDMO );
  }

  /**
   * Locks and retrieves the TtTypeText object from the database.
   *
   * @param aTtTypeText TtTypeText object
   *
   * @return a populated TtTypeText object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TtTypeTextDMO lock( TtTypeTextDMO aTtTypeTextDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aTtTypeTextDMO )" );

    thrower.ifParameterMissing( "aTtTypeTextDMO", aTtTypeTextDMO );

    TtTypeTextDMO lockedTtTypeTextDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedTtTypeTextDMO = (TtTypeTextDMO) dao.lock( "TtTypeText",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aTtTypeTextDMO.getTtGroup(  ) ).arg( aTtTypeTextDMO
          .getTtLang(  ) ).arg( aTtTypeTextDMO.getTtType(  ) ) );

    return lockedTtTypeTextDMO;
  }

  /**
   * Modifies the TtTypeText object in the database.
   *
   * @param TtTypeTextDMO TtTypeText object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aTtTypeTextDMO )" );

    thrower.ifParameterMissing( "aTtTypeTextDMO", ttTypeTextDMO );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttGroup",
      ttTypeTextDMO.getTtGroup(  ) );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttLang",
      ttTypeTextDMO.getTtLang(  ) );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttType",
      ttTypeTextDMO.getTtType(  ) );

    dao.update( ttTypeTextDMO );
  }

  /**
  * Modifies the TtTypeText object using the specified filter in the database.
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

    dao.updateCustom( new TtTypeTextDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the TtTypeText object from the database.
   *
   * @param TtTypeTextDMO TtTypeText object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( TtTypeTextDMO )" );

    thrower.ifParameterMissing( "TtTypeTextDMO", ttTypeTextDMO );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttGroup",
      ttTypeTextDMO.getTtGroup(  ) );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttLang",
      ttTypeTextDMO.getTtLang(  ) );

    thrower.ifParameterMissing( "TtTypeTextDMO.ttType",
      ttTypeTextDMO.getTtType(  ) );

    dao.delete( ttTypeTextDMO );
  }

  /**
   * Deletes the TtTypeText object from the database.
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

    dao.delete( "TtTypeText", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a TtTypeText object exists.
  *
  * @param TtTypeTextDMO TtTypeTextDMO
  *
  * @return true if the TtTypeText object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( TtTypeTextDMO TtTypeTextDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( TtTypeTextDMO)" );

    return dao.exists( "TtTypeText", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( TtTypeTextDMO.getTtGroup(  ) ).arg( TtTypeTextDMO
        .getTtLang(  ) ).arg( TtTypeTextDMO.getTtType(  ) ) );
  }

  /**
    * Return true if a TtTypeText object exists.
    *
    * @param filter
    *
    * @return true if the TtTypeText object exists.
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
   * @param locationDMO TtTypeText Data Model Object
   *
   * @return DTOList of TtTypeText Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<TtTypeTextDMO> getList( 
//    DTOListState  state,
//    TtTypeTextDMO ttTypeTextDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, ttTypeTextDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( ttTypeTextDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} TtTypeTextDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( TtTypeTextDMO ttTypeTextDMO ) {
    logger.debug( "paramQueryArgs( ttTypeTextDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "TtTypeText", 5 * 2 );

    if ( ttTypeTextDMO != null ) {
      // primary key filters...
      String ttGroup = ttTypeTextDMO.getTtGroup(  );

      if ( !DMO.isNull( ttGroup ) ) {
        queryArgs.andFilterBy( "TtGroupMatch" )
                 .arg( ttGroup + dao.wildcardForAnySequence(  ) );
      }

      String ttLang = ttTypeTextDMO.getTtLang(  );

      if ( !DMO.isNull( ttLang ) ) {
        queryArgs.andFilterBy( "TtLangMatch" )
                 .arg( ttLang + dao.wildcardForAnySequence(  ) );
      }

      String ttType = ttTypeTextDMO.getTtType(  );

      if ( !DMO.isNull( ttType ) ) {
        queryArgs.andFilterBy( "TtTypeMatch" )
                 .arg( ttType + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String ttText = ttTypeTextDMO.getTtText(  );

      if ( !DMO.isNull( ttText ) ) {
        queryArgs.andFilterBy( "TtTextMatch" )
                 .arg( ttText + dao.wildcardForAnySequence(  ) );
      }

      String ttConfig = ttTypeTextDMO.getTtConfig(  );

      if ( !DMO.isNull( ttConfig ) ) {
        queryArgs.andFilterBy( "TtConfigMatch" )
                 .arg( ttConfig + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<TtTypeTextDMO> getList( 
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
        ? "TtTypeText" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {
        case TtTypeTextDMO.ttGroupFilter:
          part.andFilterBy( queryArgs, "TtGroup",
            dao.wildcardForAnySequence(  ) );

          break;

        case TtTypeTextDMO.ttLangFilter:
          part.andFilterBy( queryArgs, "TtLang",
            dao.wildcardForAnySequence(  ) );

          break;

        case TtTypeTextDMO.ttTypeFilter:
          part.andFilterBy( queryArgs, "TtType",
            dao.wildcardForAnySequence(  ) );

          break;

        case TtTypeTextDMO.ttTextFilter:
          part.andFilterBy( queryArgs, "TtText",
            dao.wildcardForAnySequence(  ) );

          break;

        case TtTypeTextDMO.ttConfigFilter:
          part.andFilterBy( queryArgs, "TtConfig",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of TtTypeText records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of TtTypeText records based
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
   * Retrieves the TtTypeText Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public TtTypeTextDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (TtTypeTextDMO) dao.get( args.getDMLName(  ),
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
