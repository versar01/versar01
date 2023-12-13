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
 * VpsPackageServ Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VpsPackageServAbstractDACImpl
  extends DAC
  implements VpsPackageServAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VpsPackageServAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpsPackageServDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VpsPackageServAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public VpsPackageServAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VpsPackageServ Data Model Object
   *
   * @return a populated VpsPackageServ Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpsPackageServDMO get( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VpsPackageServDMO )" );

    thrower.ifParameterMissing( "VpsPackageServDMO", vpsPackageServDMO );

    return (VpsPackageServDMO) dao.get( vpsPackageServDMO );
  }

  /**
   * Creates the VpsPackageServ object in the database.
   *
   * @param VpsPackageServDMO vpsPackageServDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vpsPackageServDMO )" );
    thrower.ifParameterMissing( "VpsPackageServDMO", vpsPackageServDMO );

    dao.insert( vpsPackageServDMO );
  }

  /**
   * Locks and retrieves the VpsPackageServ object from the database.
   *
   * @param aVpsPackageServ VpsPackageServ object
   *
   * @return a populated VpsPackageServ object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpsPackageServDMO lock( VpsPackageServDMO aVpsPackageServDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVpsPackageServDMO )" );

    thrower.ifParameterMissing( "aVpsPackageServDMO", aVpsPackageServDMO );

    VpsPackageServDMO lockedVpsPackageServDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVpsPackageServDMO = (VpsPackageServDMO) dao.lock( "VpsPackageServ",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aVpsPackageServDMO.getVpsPackageCode(  ) ).arg( aVpsPackageServDMO
          .getVpsServiceCode(  ) ) );

    return lockedVpsPackageServDMO;
  }

  /**
   * Modifies the VpsPackageServ object in the database.
   *
   * @param VpsPackageServDMO VpsPackageServ object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVpsPackageServDMO )" );

    thrower.ifParameterMissing( "aVpsPackageServDMO", vpsPackageServDMO );

    thrower.ifParameterMissing( "VpsPackageServDMO.vpsPackageCode",
      vpsPackageServDMO.getVpsPackageCode(  ) );

    thrower.ifParameterMissing( "VpsPackageServDMO.vpsServiceCode",
      vpsPackageServDMO.getVpsServiceCode(  ) );

    dao.update( vpsPackageServDMO );
  }

  /**
  * Modifies the VpsPackageServ object using the specified filter in the database.
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

    dao.updateCustom( new VpsPackageServDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the VpsPackageServ object from the database.
   *
   * @param VpsPackageServDMO VpsPackageServ object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VpsPackageServDMO )" );

    thrower.ifParameterMissing( "VpsPackageServDMO", vpsPackageServDMO );

    thrower.ifParameterMissing( "VpsPackageServDMO.vpsPackageCode",
      vpsPackageServDMO.getVpsPackageCode(  ) );

    thrower.ifParameterMissing( "VpsPackageServDMO.vpsServiceCode",
      vpsPackageServDMO.getVpsServiceCode(  ) );

    dao.delete( vpsPackageServDMO );
  }

  /**
   * Deletes the VpsPackageServ object from the database.
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

    dao.delete( "VpsPackageServ", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VpsPackageServ object exists.
  *
  * @param VpsPackageServDMO VpsPackageServDMO
  *
  * @return true if the VpsPackageServ object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VpsPackageServDMO VpsPackageServDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VpsPackageServDMO)" );

    return dao.exists( "VpsPackageServ", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg( VpsPackageServDMO.getVpsPackageCode(  ) ).arg( VpsPackageServDMO
        .getVpsServiceCode(  ) ) );
  }

  /**
    * Return true if a VpsPackageServ object exists.
    *
    * @param filter
    *
    * @return true if the VpsPackageServ object exists.
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
   * @param locationDMO VpsPackageServ Data Model Object
   *
   * @return DTOList of VpsPackageServ Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    VpsPackageServDMO vpsPackageServDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vpsPackageServDMO )" );

    return dao.getListAbs( state, paramQueryArgs( vpsPackageServDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VpsPackageServDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    VpsPackageServDMO vpsPackageServDMO ) {
    logger.debug( "paramQueryArgs( vpsPackageServDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VpsPackageServ",
        7 * 2 );

    if ( vpsPackageServDMO != null ) {
      // primary key filters...
      String vpsPackageCode = vpsPackageServDMO.getVpsPackageCode(  );

      if ( !DMO.isNull( vpsPackageCode ) ) {
        queryArgs.andFilterBy( "VpsPackageCodeMatch" )
                 .arg( vpsPackageCode + dao.wildcardForAnySequence(  ) );
      }

      String vpsServiceCode = vpsPackageServDMO.getVpsServiceCode(  );

      if ( !DMO.isNull( vpsServiceCode ) ) {
        queryArgs.andFilterBy( "VpsServiceCodeMatch" )
                 .arg( vpsServiceCode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vpsAlterCharge = vpsPackageServDMO.getVpsAlterCharge(  );

      if ( !DMO.isNull( vpsAlterCharge ) ) {
        queryArgs.andFilterBy( "VpsAlterChargeMatch" )
                 .arg( vpsAlterCharge + dao.wildcardForAnySequence(  ) );
      }

      String vpsMultiCharge = vpsPackageServDMO.getVpsMultiCharge(  );

      if ( !DMO.isNull( vpsMultiCharge ) ) {
        queryArgs.andFilterBy( "VpsMultiChargeMatch" )
                 .arg( vpsMultiCharge + dao.wildcardForAnySequence(  ) );
      }

      String vpsChangeMulti = vpsPackageServDMO.getVpsChangeMulti(  );

      if ( !DMO.isNull( vpsChangeMulti ) ) {
        queryArgs.andFilterBy( "VpsChangeMultiMatch" )
                 .arg( vpsChangeMulti + dao.wildcardForAnySequence(  ) );
      }

      String vpsPriceByTarif = vpsPackageServDMO.getVpsPriceByTarif(  );

      if ( !DMO.isNull( vpsPriceByTarif ) ) {
        queryArgs.andFilterBy( "VpsPriceByTarifMatch" )
                 .arg( vpsPriceByTarif + dao.wildcardForAnySequence(  ) );
      }

      String vpsAutoConnect = vpsPackageServDMO.getVpsAutoConnect(  );

      if ( !DMO.isNull( vpsAutoConnect ) ) {
        queryArgs.andFilterBy( "VpsAutoConnectMatch" )
                 .arg( vpsAutoConnect + dao.wildcardForAnySequence(  ) );
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
        ? "VpsPackageServ" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();
    		
      switch ( part.getIndex(  ) ) {
        case VpsPackageServDMO.vpsPackageCodeFilter:
          part.andFilterBy( queryArgs, "VpsPackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsServiceCodeFilter:
          part.andFilterBy( queryArgs, "VpsServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsAlterChargeFilter:
          part.andFilterBy( queryArgs, "VpsAlterCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsMultiChargeFilter:
          part.andFilterBy( queryArgs, "VpsMultiCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsChangeMultiFilter:
          part.andFilterBy( queryArgs, "VpsChangeMulti",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsPriceByTarifFilter:
          part.andFilterBy( queryArgs, "VpsPriceByTarif",
            dao.wildcardForAnySequence(  ) );

          break;

        case VpsPackageServDMO.vpsAutoConnectFilter:
          part.andFilterBy( queryArgs, "VpsAutoConnect",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VpsPackageServ records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VpsPackageServ records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ));
  }

  /**
   * Retrieves the VpsPackageServ Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VpsPackageServDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VpsPackageServDMO) dao.get( args.getDMLName(  ),
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
