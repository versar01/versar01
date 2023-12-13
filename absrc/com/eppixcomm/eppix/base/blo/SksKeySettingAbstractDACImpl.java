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
 * SksKeySetting Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SksKeySettingAbstractDACImpl
  extends DAC
  implements SksKeySettingAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SksKeySettingAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SksKeySettingDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SksKeySettingAbstractDACImpl( 

    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SksKeySetting Data Model Object
   *
   * @return a populated SksKeySetting Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SksKeySettingDMO get( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SksKeySettingDMO )" );

    thrower.ifParameterMissing( "SksKeySettingDMO", sksKeySettingDMO );

    return (SksKeySettingDMO) dao.get( sksKeySettingDMO );
  }

  /**
   * Creates the SksKeySetting object in the database.
   *
   * @param SksKeySettingDMO sksKeySettingDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( sksKeySettingDMO )" );
    thrower.ifParameterMissing( "SksKeySettingDMO", sksKeySettingDMO );

    dao.insert( sksKeySettingDMO );
  }

  /**
   * Locks and retrieves the SksKeySetting object from the database.
   *
   * @param aSksKeySetting SksKeySetting object
   *
   * @return a populated SksKeySetting object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SksKeySettingDMO lock( SksKeySettingDMO aSksKeySettingDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSksKeySettingDMO )" );

    thrower.ifParameterMissing( "aSksKeySettingDMO", aSksKeySettingDMO );

    SksKeySettingDMO lockedSksKeySettingDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSksKeySettingDMO = (SksKeySettingDMO) dao.lock( "SksKeySetting",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSksKeySettingDMO.getSksKeyCode(  ) ) );

    return lockedSksKeySettingDMO;
  }

  /**
   * Modifies the SksKeySetting object in the database.
   *
   * @param SksKeySettingDMO SksKeySetting object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSksKeySettingDMO )" );

    thrower.ifParameterMissing( "aSksKeySettingDMO", sksKeySettingDMO );

    thrower.ifParameterMissing( "SksKeySettingDMO.sksKeyCode",
      sksKeySettingDMO.getSksKeyCode(  ) );

    dao.update( sksKeySettingDMO );
  }

  /**
  * Modifies the SksKeySetting object using the specified filter in the database.
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

    dao.updateCustom( new SksKeySettingDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SksKeySetting object from the database.
   *
   * @param SksKeySettingDMO SksKeySetting object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SksKeySettingDMO )" );

    thrower.ifParameterMissing( "SksKeySettingDMO", sksKeySettingDMO );

    thrower.ifParameterMissing( "SksKeySettingDMO.sksKeyCode",
      sksKeySettingDMO.getSksKeyCode(  ) );

    dao.delete( sksKeySettingDMO );
  }

  /**
   * Deletes the SksKeySetting object from the database.
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

    dao.delete( "SksKeySetting", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SksKeySetting object exists.
  *
  * @param SksKeySettingDMO SksKeySettingDMO
  *
  * @return true if the SksKeySetting object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SksKeySettingDMO SksKeySettingDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SksKeySettingDMO)" );

    return dao.exists( "SksKeySetting", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SksKeySettingDMO.getSksKeyCode(  ) ) );
  }

  /**
    * Return true if a SksKeySetting object exists.
    *
    * @param filter
    *
    * @return true if the SksKeySetting object exists.
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
   * @param locationDMO SksKeySetting Data Model Object
   *
   * @return DTOList of SksKeySetting Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<SksKeySettingDMO> getList( 
//    DTOListState     state,
//    SksKeySettingDMO sksKeySettingDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, sksKeySettingDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( sksKeySettingDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SksKeySettingDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    SksKeySettingDMO sksKeySettingDMO ) {
    logger.debug( "paramQueryArgs( sksKeySettingDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SksKeySetting",
        4 * 2 );

    if ( sksKeySettingDMO != null ) {
      // primary key filters...
      String sksKeyCode = sksKeySettingDMO.getSksKeyCode(  );

      if ( !DMO.isNull( sksKeyCode ) ) {
        queryArgs.andFilterBy( "SksKeyCodeMatch" )
                 .arg( sksKeyCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String sksValue = sksKeySettingDMO.getSksValue(  );

      if ( !DMO.isNull( sksValue ) ) {
        queryArgs.andFilterBy( "SksValueMatch" )
                 .arg( sksValue + dao.wildcardForAnySequence(  ) );
      }

      String sksComment = sksKeySettingDMO.getSksComment(  );

      if ( !DMO.isNull( sksComment ) ) {
        queryArgs.andFilterBy( "SksCommentMatch" )
                 .arg( sksComment + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<SksKeySettingDMO> getList( 
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
        ? "SksKeySetting" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator();i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      switch ( part.getIndex(  ) ) {
        case SksKeySettingDMO.sksKeyCodeFilter:
          part.andFilterBy( queryArgs, "SksKeyCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SksKeySettingDMO.sksValueFilter:
          part.andFilterBy( queryArgs, "SksValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case SksKeySettingDMO.sksCommentFilter:
          part.andFilterBy( queryArgs, "SksComment",
            dao.wildcardForAnySequence(  ) );

          break;

        case SksKeySettingDMO.sksTimestampFilter:
          part.andFilterBy( queryArgs, "SksTimestamp" );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SksKeySetting records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SksKeySetting records based
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
   * Retrieves the SksKeySetting Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SksKeySettingDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SksKeySettingDMO) dao.get( args.getDMLName(  ),
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
