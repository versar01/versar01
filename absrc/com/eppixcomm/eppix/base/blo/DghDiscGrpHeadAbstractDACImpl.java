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
 * DghDiscGrpHead Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DghDiscGrpHeadAbstractDACImpl
  extends DAC
  implements DghDiscGrpHeadAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( DghDiscGrpHeadAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DghDiscGrpHeadDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public DghDiscGrpHeadAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public DghDiscGrpHeadAbstractDACImpl(DAO         dao ) {
		    super( dao, thrower );
		  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a DghDiscGrpHead Data Model Object
   *
   * @return a populated DghDiscGrpHead Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DghDiscGrpHeadDMO get( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( DghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "DghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    return (DghDiscGrpHeadDMO) dao.get( dghDiscGrpHeadDMO );
  }

  /**
   * Creates the DghDiscGrpHead object in the database.
   *
   * @param DghDiscGrpHeadDMO dghDiscGrpHeadDMO
   *
   * @throws EPPIXSeriousException
   */
  public DghDiscGrpHeadDMO create( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( dghDiscGrpHeadDMO )" );
    thrower.ifParameterMissing( "DghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    dao.insert( dghDiscGrpHeadDMO );

    // return the data with key
    return dghDiscGrpHeadDMO;
  }

  /**
   * Locks and retrieves the DghDiscGrpHead object from the database.
   *
   * @param aDghDiscGrpHead DghDiscGrpHead object
   *
   * @return a populated DghDiscGrpHead object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DghDiscGrpHeadDMO lock( DghDiscGrpHeadDMO aDghDiscGrpHeadDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aDghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "aDghDiscGrpHeadDMO", aDghDiscGrpHeadDMO );

    DghDiscGrpHeadDMO lockedDghDiscGrpHeadDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedDghDiscGrpHeadDMO = (DghDiscGrpHeadDMO) dao.lock( "DghDiscGrpHead",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aDghDiscGrpHeadDMO.getDghGroupId(  ) ) );

    return lockedDghDiscGrpHeadDMO;
  }

  /**
   * Modifies the DghDiscGrpHead object in the database.
   *
   * @param DghDiscGrpHeadDMO DghDiscGrpHead object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aDghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "aDghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    thrower.ifParameterMissing( "DghDiscGrpHeadDMO.dghGroupId",
      dghDiscGrpHeadDMO.getDghGroupId(  ) );

    dao.update( dghDiscGrpHeadDMO );
  }

  /**
  * Modifies the DghDiscGrpHead object using the specified filter in the database.
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

    dao.updateCustom( new DghDiscGrpHeadDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the DghDiscGrpHead object from the database.
   *
   * @param DghDiscGrpHeadDMO DghDiscGrpHead object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( DghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "DghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    thrower.ifParameterMissing( "DghDiscGrpHeadDMO.dghGroupId",
      dghDiscGrpHeadDMO.getDghGroupId(  ) );

    dao.delete( dghDiscGrpHeadDMO );
  }

  /**
   * Deletes the DghDiscGrpHead object from the database.
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

    dao.delete( "DghDiscGrpHead", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a DghDiscGrpHead object exists.
  *
  * @param DghDiscGrpHeadDMO DghDiscGrpHeadDMO
  *
  * @return true if the DghDiscGrpHead object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( DghDiscGrpHeadDMO DghDiscGrpHeadDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( DghDiscGrpHeadDMO)" );

    return dao.exists( "DghDiscGrpHead", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( DghDiscGrpHeadDMO.getDghGroupId(  ) ) );
  }

  /**
    * Return true if a DghDiscGrpHead object exists.
    *
    * @param filter
    *
    * @return true if the DghDiscGrpHead object exists.
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
   * @param locationDMO DghDiscGrpHead Data Model Object
   *
   * @return DTOList of DghDiscGrpHead Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, dghDiscGrpHeadDMO )" );

    return dao.getListAbs( state, paramQueryArgs( dghDiscGrpHeadDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} DghDiscGrpHeadDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    DghDiscGrpHeadDMO dghDiscGrpHeadDMO ) {
    logger.debug( "paramQueryArgs( dghDiscGrpHeadDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "DghDiscGrpHead",
        5 * 2 );

    if ( dghDiscGrpHeadDMO != null ) {
      // primary key filters...
      Integer dghGroupId = dghDiscGrpHeadDMO.getDghGroupId(  );

      if ( !DMO.isNull( dghGroupId ) ) {
        queryArgs.andFilterBy( "DghGroupId" )
                 .arg( dghGroupId );
      }

      // define more filters...
      String dghGroupDesc = dghDiscGrpHeadDMO.getDghGroupDesc(  );

      if ( !DMO.isNull( dghGroupDesc ) ) {
        queryArgs.andFilterBy( "DghGroupDescMatch" )
                 .arg( dghGroupDesc + dao.wildcardForAnySequence(  ) );
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
        ? "DghDiscGrpHead" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    		
      switch ( part.getIndex(  ) ) {
        case DghDiscGrpHeadDMO.dghGroupIdFilter:
          part.andFilterBy( queryArgs, "DghGroupId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DghDiscGrpHeadDMO.dghGroupDescFilter:
          part.andFilterBy( queryArgs, "DghGroupDesc",
            dao.wildcardForAnySequence(  ) );

          break;

        case DghDiscGrpHeadDMO.dghGroupTypeFilter:
          part.andFilterBy( queryArgs, "DghGroupType",
            dao.wildcardForAnySequence(  ) );

          break;

        case DghDiscGrpHeadDMO.dghInclusionFromFilter:
          part.andFilterBy( queryArgs, "DghInclusionFrom",
            dao.wildcardForAnySequence(  ) );

          break;

        case DghDiscGrpHeadDMO.dghInclusionToFilter:
          part.andFilterBy( queryArgs, "DghInclusionTo",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of DghDiscGrpHead records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of DghDiscGrpHead records based
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
   * Retrieves the DghDiscGrpHead Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public DghDiscGrpHeadDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (DghDiscGrpHeadDMO) dao.get( args.getDMLName(  ),
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
