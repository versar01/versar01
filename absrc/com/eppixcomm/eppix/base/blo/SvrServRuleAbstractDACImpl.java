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
 * SvrServRule Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SvrServRuleAbstractDACImpl
  extends DAC
  implements SvrServRuleAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SvrServRuleAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SvrServRuleDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SvrServRuleAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public SvrServRuleAbstractDACImpl(DAO dao) {
		    super( dao, thrower );
		  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SvrServRule Data Model Object
   *
   * @return a populated SvrServRule Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SvrServRuleDMO get( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SvrServRuleDMO )" );

    thrower.ifParameterMissing( "SvrServRuleDMO", svrServRuleDMO );

    return (SvrServRuleDMO) dao.get( svrServRuleDMO );
  }

  /**
   * Creates the SvrServRule object in the database.
   *
   * @param SvrServRuleDMO svrServRuleDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( svrServRuleDMO )" );
    thrower.ifParameterMissing( "SvrServRuleDMO", svrServRuleDMO );

    dao.insert( svrServRuleDMO );
  }

  /**
   * Locks and retrieves the SvrServRule object from the database.
   *
   * @param aSvrServRule SvrServRule object
   *
   * @return a populated SvrServRule object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SvrServRuleDMO lock( SvrServRuleDMO aSvrServRuleDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSvrServRuleDMO )" );

    thrower.ifParameterMissing( "aSvrServRuleDMO", aSvrServRuleDMO );

    SvrServRuleDMO lockedSvrServRuleDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSvrServRuleDMO = (SvrServRuleDMO) dao.lock( "SvrServRule",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aSvrServRuleDMO.getSvrPrimaryServ(  ) ).arg( aSvrServRuleDMO
          .getSvrServType(  ) ).arg( aSvrServRuleDMO.getSvrTargetServ(  ) ) );

    return lockedSvrServRuleDMO;
  }

  /**
   * Modifies the SvrServRule object in the database.
   *
   * @param SvrServRuleDMO SvrServRule object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSvrServRuleDMO )" );

    thrower.ifParameterMissing( "aSvrServRuleDMO", svrServRuleDMO );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrPrimaryServ",
      svrServRuleDMO.getSvrPrimaryServ(  ) );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrServType",
      svrServRuleDMO.getSvrServType(  ) );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrTargetServ",
      svrServRuleDMO.getSvrTargetServ(  ) );

    dao.update( svrServRuleDMO );
  }

  /**
  * Modifies the SvrServRule object using the specified filter in the database.
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

    dao.updateCustom( new SvrServRuleDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SvrServRule object from the database.
   *
   * @param SvrServRuleDMO SvrServRule object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SvrServRuleDMO svrServRuleDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SvrServRuleDMO )" );

    thrower.ifParameterMissing( "SvrServRuleDMO", svrServRuleDMO );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrPrimaryServ",
      svrServRuleDMO.getSvrPrimaryServ(  ) );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrServType",
      svrServRuleDMO.getSvrServType(  ) );

    thrower.ifParameterMissing( "SvrServRuleDMO.svrTargetServ",
      svrServRuleDMO.getSvrTargetServ(  ) );

    dao.delete( svrServRuleDMO );
  }

  /**
   * Deletes the SvrServRule object from the database.
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

    dao.delete( "SvrServRule", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SvrServRule object exists.
  *
  * @param SvrServRuleDMO SvrServRuleDMO
  *
  * @return true if the SvrServRule object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SvrServRuleDMO SvrServRuleDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SvrServRuleDMO)" );

    return dao.exists( "SvrServRule", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( SvrServRuleDMO.getSvrPrimaryServ(  ) ).arg( SvrServRuleDMO
        .getSvrServType(  ) ).arg( SvrServRuleDMO.getSvrTargetServ(  ) ) );
  }

  /**
    * Return true if a SvrServRule object exists.
    *
    * @param filter
    *
    * @return true if the SvrServRule object exists.
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
   * @param locationDMO SvrServRule Data Model Object
   *
   * @return DTOList of SvrServRule Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState   state,
    SvrServRuleDMO svrServRuleDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, svrServRuleDMO )" );

    return dao.getListAbs( state, paramQueryArgs( svrServRuleDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SvrServRuleDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SvrServRuleDMO svrServRuleDMO ) {
    logger.debug( "paramQueryArgs( svrServRuleDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SvrServRule", 4 * 2 );

    if ( svrServRuleDMO != null ) {
      // primary key filters...
      String svrPrimaryServ = svrServRuleDMO.getSvrPrimaryServ(  );

      if ( !DMO.isNull( svrPrimaryServ ) ) {
        queryArgs.andFilterBy( "SvrPrimaryServMatch" )
                 .arg( svrPrimaryServ + dao.wildcardForAnySequence(  ) );
      }

      String svrServType = svrServRuleDMO.getSvrServType(  );

      if ( !DMO.isNull( svrServType ) ) {
        queryArgs.andFilterBy( "SvrServTypeMatch" )
                 .arg( svrServType + dao.wildcardForAnySequence(  ) );
      }

      String svrTargetServ = svrServRuleDMO.getSvrTargetServ(  );

      if ( !DMO.isNull( svrTargetServ ) ) {
        queryArgs.andFilterBy( "SvrTargetServMatch" )
                 .arg( svrTargetServ + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String svrServHierarchy = svrServRuleDMO.getSvrServHierarchy(  );

      if ( !DMO.isNull( svrServHierarchy ) ) {
        queryArgs.andFilterBy( "SvrServHierarchyMatch" )
                 .arg( svrServHierarchy + dao.wildcardForAnySequence(  ) );
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
        ? "SvrServRule" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case SvrServRuleDMO.svrPrimaryServFilter:
          part.andFilterBy( queryArgs, "SvrPrimaryServ",
            dao.wildcardForAnySequence(  ) );

          break;

        case SvrServRuleDMO.svrServTypeFilter:
          part.andFilterBy( queryArgs, "SvrServType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SvrServRuleDMO.svrTargetServFilter:
          part.andFilterBy( queryArgs, "SvrTargetServ",
            dao.wildcardForAnySequence(  ) );

          break;

        case SvrServRuleDMO.svrServHierarchyFilter:
          part.andFilterBy( queryArgs, "SvrServHierarchy",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SvrServRule records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SvrServRule records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the SvrServRule Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SvrServRuleDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SvrServRuleDMO) dao.get( args.getDMLName(  ),
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
