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
 * SpdServParamDef Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SpdServParamDefAbstractDACImpl
  extends DAC
  implements SpdServParamDefAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SpdServParamDefAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SpdServParamDefDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SpdServParamDefAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SpdServParamDef Data Model Object
   *
   * @return a populated SpdServParamDef Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SpdServParamDefDMO get( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SpdServParamDefDMO )" );

    thrower.ifParameterMissing( "SpdServParamDefDMO", spdServParamDefDMO );

    return (SpdServParamDefDMO) dao.get( spdServParamDefDMO );
  }

  /**
   * Creates the SpdServParamDef object in the database.
   *
   * @param SpdServParamDefDMO spdServParamDefDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( spdServParamDefDMO )" );
    thrower.ifParameterMissing( "SpdServParamDefDMO", spdServParamDefDMO );

    dao.insert( spdServParamDefDMO );
  }

  /**
   * Locks and retrieves the SpdServParamDef object from the database.
   *
   * @param aSpdServParamDef SpdServParamDef object
   *
   * @return a populated SpdServParamDef object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SpdServParamDefDMO lock( SpdServParamDefDMO aSpdServParamDefDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSpdServParamDefDMO )" );

    thrower.ifParameterMissing( "aSpdServParamDefDMO", aSpdServParamDefDMO );

    SpdServParamDefDMO lockedSpdServParamDefDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSpdServParamDefDMO = (SpdServParamDefDMO) dao.lock( "SpdServParamDef",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aSpdServParamDefDMO.getSpdServiceCode(  ) ).arg( aSpdServParamDefDMO
          .getSpdParamId(  ) ) );

    return lockedSpdServParamDefDMO;
  }

  /**
   * Modifies the SpdServParamDef object in the database.
   *
   * @param SpdServParamDefDMO SpdServParamDef object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSpdServParamDefDMO )" );

    thrower.ifParameterMissing( "aSpdServParamDefDMO", spdServParamDefDMO );

    thrower.ifParameterMissing( "SpdServParamDefDMO.spdServiceCode",
      spdServParamDefDMO.getSpdServiceCode(  ) );

    thrower.ifParameterMissing( "SpdServParamDefDMO.spdParamId",
      spdServParamDefDMO.getSpdParamId(  ) );

    dao.update( spdServParamDefDMO );
  }

  /**
  * Modifies the SpdServParamDef object using the specified filter in the database.
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

    dao.updateCustom( new SpdServParamDefDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SpdServParamDef object from the database.
   *
   * @param SpdServParamDefDMO SpdServParamDef object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SpdServParamDefDMO )" );

    thrower.ifParameterMissing( "SpdServParamDefDMO", spdServParamDefDMO );

    thrower.ifParameterMissing( "SpdServParamDefDMO.spdServiceCode",
      spdServParamDefDMO.getSpdServiceCode(  ) );

    thrower.ifParameterMissing( "SpdServParamDefDMO.spdParamId",
      spdServParamDefDMO.getSpdParamId(  ) );

    dao.delete( spdServParamDefDMO );
  }

  /**
   * Deletes the SpdServParamDef object from the database.
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

    dao.delete( "SpdServParamDef", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SpdServParamDef object exists.
  *
  * @param SpdServParamDefDMO SpdServParamDefDMO
  *
  * @return true if the SpdServParamDef object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SpdServParamDefDMO SpdServParamDefDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SpdServParamDefDMO)" );

    return dao.exists( "SpdServParamDef", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( SpdServParamDefDMO.getSpdServiceCode(  ) ).arg( SpdServParamDefDMO
        .getSpdParamId(  ) ) );
  }

  /**
    * Return true if a SpdServParamDef object exists.
    *
    * @param filter
    *
    * @return true if the SpdServParamDef object exists.
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
   * @param locationDMO SpdServParamDef Data Model Object
   *
   * @return DTOList of SpdServParamDef Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    SpdServParamDefDMO spdServParamDefDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, spdServParamDefDMO )" );

    return dao.getListAbs( state, paramQueryArgs( spdServParamDefDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SpdServParamDefDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    SpdServParamDefDMO spdServParamDefDMO ) {
    logger.debug( "paramQueryArgs( spdServParamDefDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SpdServParamDef",
        3 * 2 );

    if ( spdServParamDefDMO != null ) {
      // primary key filters...
      String spdServiceCode = spdServParamDefDMO.getSpdServiceCode(  );

      if ( !DMO.isNull( spdServiceCode ) ) {
        queryArgs.andFilterBy( "SpdServiceCodeMatch" )
                 .arg( spdServiceCode + dao.wildcardForAnySequence(  ) );
      }

      Short spdParamId = spdServParamDefDMO.getSpdParamId(  );

      if ( !DMO.isNull( spdParamId ) ) {
        queryArgs.andFilterBy( "SpdParamId" )
                 .arg( spdParamId );
      }

      // define more filters...
      String spdDefaultVal = spdServParamDefDMO.getSpdDefaultVal(  );

      if ( !DMO.isNull( spdDefaultVal ) ) {
        queryArgs.andFilterBy( "SpdDefaultValMatch" )
                 .arg( spdDefaultVal + dao.wildcardForAnySequence(  ) );
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
        ? "SpdServParamDef" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case SpdServParamDefDMO.spdServiceCodeFilter:
          part.andFilterBy( queryArgs, "SpdServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SpdServParamDefDMO.spdParamIdFilter:
          part.andFilterBy( queryArgs, "SpdParamId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SpdServParamDefDMO.spdDefaultValFilter:
          part.andFilterBy( queryArgs, "SpdDefaultVal",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SpdServParamDef records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SpdServParamDef records based
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
   * Retrieves the SpdServParamDef Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SpdServParamDefDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SpdServParamDefDMO) dao.get( args.getDMLName(  ),
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
