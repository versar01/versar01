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

import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * VsmServiceMsisdn Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VsmServiceMsisdnAbstractDACImpl
  extends DAC
  implements VsmServiceMsisdnAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VsmServiceMsisdnAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsmServiceMsisdnDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VsmServiceMsisdnAbstractDACImpl(
    DAO dao) {
    //super( userContext, dao, thrower );
	  super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VsmServiceMsisdn Data Model Object
   *
   * @return a populated VsmServiceMsisdn Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsmServiceMsisdnDMO get( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    return (VsmServiceMsisdnDMO) dao.get( vsmServiceMsisdnDMO );
  }

  /**
   * Creates the VsmServiceMsisdn object in the database.
   *
   * @param VsmServiceMsisdnDMO vsmServiceMsisdnDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vsmServiceMsisdnDMO )" );
    thrower.ifParameterMissing( "VsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    dao.insert( vsmServiceMsisdnDMO );
  }

  /**
   * Locks and retrieves the VsmServiceMsisdn object from the database.
   *
   * @param aVsmServiceMsisdn VsmServiceMsisdn object
   *
   * @return a populated VsmServiceMsisdn object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsmServiceMsisdnDMO lock( VsmServiceMsisdnDMO aVsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO", aVsmServiceMsisdnDMO );

    VsmServiceMsisdnDMO lockedVsmServiceMsisdnDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVsmServiceMsisdnDMO = (VsmServiceMsisdnDMO) dao.lock( "VsmServiceMsisdn",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aVsmServiceMsisdnDMO.getVsmSubscriberId(  ) ).arg( aVsmServiceMsisdnDMO
          .getVsmServiceCode(  ) ).arg( aVsmServiceMsisdnDMO.getVsmMsisdnNo(  ) ) );

    return lockedVsmServiceMsisdnDMO;
  }

  /**
   * Modifies the VsmServiceMsisdn object in the database.
   *
   * @param VsmServiceMsisdnDMO VsmServiceMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmSubscriberId",
      vsmServiceMsisdnDMO.getVsmSubscriberId(  ) );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmServiceCode",
      vsmServiceMsisdnDMO.getVsmServiceCode(  ) );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmMsisdnNo",
      vsmServiceMsisdnDMO.getVsmMsisdnNo(  ) );

    dao.update( vsmServiceMsisdnDMO );
  }

  /**
  * Modifies the VsmServiceMsisdn object using the specified filter in the database.
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

    dao.updateCustom( new VsmServiceMsisdnDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VsmServiceMsisdn object from the database.
   *
   * @param VsmServiceMsisdnDMO VsmServiceMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmSubscriberId",
      vsmServiceMsisdnDMO.getVsmSubscriberId(  ) );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmServiceCode",
      vsmServiceMsisdnDMO.getVsmServiceCode(  ) );

    thrower.ifParameterMissing( "VsmServiceMsisdnDMO.vsmMsisdnNo",
      vsmServiceMsisdnDMO.getVsmMsisdnNo(  ) );

    dao.delete( vsmServiceMsisdnDMO );
  }

  /**
   * Deletes the VsmServiceMsisdn object from the database.
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

    dao.delete( "VsmServiceMsisdn", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VsmServiceMsisdn object exists.
  *
  * @param VsmServiceMsisdnDMO VsmServiceMsisdnDMO
  *
  * @return true if the VsmServiceMsisdn object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VsmServiceMsisdnDMO VsmServiceMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VsmServiceMsisdnDMO)" );

    return dao.exists( "VsmServiceMsisdn", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( VsmServiceMsisdnDMO.getVsmSubscriberId(  ) ).arg( VsmServiceMsisdnDMO
        .getVsmServiceCode(  ) ).arg( VsmServiceMsisdnDMO.getVsmMsisdnNo(  ) ) );
  }

  /**
    * Return true if a VsmServiceMsisdn object exists.
    *
    * @param filter
    *
    * @return true if the VsmServiceMsisdn object exists.
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
   * @param locationDMO VsmServiceMsisdn Data Model Object
   *
   * @return DTOList of VsmServiceMsisdn Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(
    DTOListState        state,
    VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vsmServiceMsisdnDMO )" );

    return new DTOList(dao.getList(paramQueryArgs(vsmServiceMsisdnDMO)));
    
        
    }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VsmServiceMsisdnDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs(
    VsmServiceMsisdnDMO vsmServiceMsisdnDMO ) {
    logger.debug( "paramQueryArgs( vsmServiceMsisdnDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VsmServiceMsisdn",7 * 2 );

    if ( vsmServiceMsisdnDMO != null ) {
      // primary key filters...
      Integer vsmSubscriberId = vsmServiceMsisdnDMO.getVsmSubscriberId(  );

      if ( !DMO.isNull( vsmSubscriberId ) ) {
        queryArgs.andFilterBy( "VsmSubscriberId" )
                 .arg( vsmSubscriberId );
      }

      String vsmServiceCode = vsmServiceMsisdnDMO.getVsmServiceCode(  );

      if ( !DMO.isNull( vsmServiceCode ) ) {
        queryArgs.andFilterBy( "VsmServiceCodeMatch" )
                 .arg( vsmServiceCode + dao.wildcardForAnySequence(  ) );
      }

      String vsmMsisdnNo = vsmServiceMsisdnDMO.getVsmMsisdnNo(  );

      if ( !DMO.isNull( vsmMsisdnNo ) ) {
        queryArgs.andFilterBy( "VsmMsisdnNoMatch" )
                 .arg( vsmMsisdnNo + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vsmNodeSent = vsmServiceMsisdnDMO.getVsmNodeSent(  );

      if ( !DMO.isNull( vsmNodeSent ) ) {
        queryArgs.andFilterBy( "VsmNodeSentMatch" )
                 .arg( vsmNodeSent + dao.wildcardForAnySequence(  ) );
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

    return new DTOList(dao.getList(filterQueryArgs(filter,null)));
    
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
        ? "VsmServiceMsisdn" : dmlName, parts.size(  ) );
    FilterPart part ;
    for(int i=0;i<parts.size();i++){
    	part = (FilterPart)parts.get(i);
    //for ( FilterPart part : parts ) {
      switch ( part.getIndex(  ) ) {
        case VsmServiceMsisdnDMO.vsmSubscriberIdFilter:
          part.andFilterBy( queryArgs, "VsmSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmServiceCodeFilter:
          part.andFilterBy( queryArgs, "VsmServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmMsisdnNoFilter:
          part.andFilterBy( queryArgs, "VsmMsisdnNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmActivateDateFilter:
          part.andFilterBy( queryArgs, "VsmActivateDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmDeactDateFilter:
          part.andFilterBy( queryArgs, "VsmDeactDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmBilledUptoFilter:
          part.andFilterBy( queryArgs, "VsmBilledUpto",
            dao.wildcardForAnySequence(  ) );

          break;

        case VsmServiceMsisdnDMO.vsmNodeSentFilter:
          part.andFilterBy( queryArgs, "VsmNodeSent",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VsmServiceMsisdn records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VsmServiceMsisdn records based
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

    return dao.iterator(filterQueryArgs( filter, null ));
  }

  /**
   * Retrieves the VsmServiceMsisdn Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VsmServiceMsisdnDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VsmServiceMsisdnDMO) dao.get( args.getDMLName(  ),
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
