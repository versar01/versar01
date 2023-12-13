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
 * PptPrepaidTypes Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PptPrepaidTypesAbstractDACImpl
  extends DAC
  implements PptPrepaidTypesAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PptPrepaidTypesAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PptPrepaidTypesDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PptPrepaidTypesAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public PptPrepaidTypesAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }


  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PptPrepaidTypes Data Model Object
   *
   * @return a populated PptPrepaidTypes Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PptPrepaidTypesDMO get( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "PptPrepaidTypesDMO", pptPrepaidTypesDMO );

    return (PptPrepaidTypesDMO) dao.get( pptPrepaidTypesDMO );
  }

  /**
   * Creates the PptPrepaidTypes object in the database.
   *
   * @param PptPrepaidTypesDMO pptPrepaidTypesDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( pptPrepaidTypesDMO )" );
    thrower.ifParameterMissing( "PptPrepaidTypesDMO", pptPrepaidTypesDMO );

    dao.insert( pptPrepaidTypesDMO );
  }

  /**
   * Locks and retrieves the PptPrepaidTypes object from the database.
   *
   * @param aPptPrepaidTypes PptPrepaidTypes object
   *
   * @return a populated PptPrepaidTypes object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PptPrepaidTypesDMO lock( PptPrepaidTypesDMO aPptPrepaidTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO", aPptPrepaidTypesDMO );

    PptPrepaidTypesDMO lockedPptPrepaidTypesDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPptPrepaidTypesDMO = (PptPrepaidTypesDMO) dao.lock( "PptPrepaidTypes",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aPptPrepaidTypesDMO.getPptType(  ) ) );

    return lockedPptPrepaidTypesDMO;
  }

  /**
   * Modifies the PptPrepaidTypes object in the database.
   *
   * @param PptPrepaidTypesDMO PptPrepaidTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO", pptPrepaidTypesDMO );

    thrower.ifParameterMissing( "PptPrepaidTypesDMO.pptType",
      pptPrepaidTypesDMO.getPptType(  ) );

    dao.update( pptPrepaidTypesDMO );
  }

  /**
  * Modifies the PptPrepaidTypes object using the specified filter in the database.
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

    dao.updateCustom( new PptPrepaidTypesDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PptPrepaidTypes object from the database.
   *
   * @param PptPrepaidTypesDMO PptPrepaidTypes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "PptPrepaidTypesDMO", pptPrepaidTypesDMO );

    thrower.ifParameterMissing( "PptPrepaidTypesDMO.pptType",
      pptPrepaidTypesDMO.getPptType(  ) );

    dao.delete( pptPrepaidTypesDMO );
  }

  /**
   * Deletes the PptPrepaidTypes object from the database.
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

    dao.delete( "PptPrepaidTypes", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PptPrepaidTypes object exists.
  *
  * @param PptPrepaidTypesDMO PptPrepaidTypesDMO
  *
  * @return true if the PptPrepaidTypes object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PptPrepaidTypesDMO PptPrepaidTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PptPrepaidTypesDMO)" );

    return dao.exists( "PptPrepaidTypes", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( PptPrepaidTypesDMO.getPptType(  ) ) );
  }

  /**
    * Return true if a PptPrepaidTypes object exists.
    *
    * @param filter
    *
    * @return true if the PptPrepaidTypes object exists.
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
   * @param locationDMO PptPrepaidTypes Data Model Object
   *
   * @return DTOList of PptPrepaidTypes Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, pptPrepaidTypesDMO )" );

    return dao.getListAbs( state, paramQueryArgs( pptPrepaidTypesDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PptPrepaidTypesDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PptPrepaidTypesDMO pptPrepaidTypesDMO ) {
    logger.debug( "paramQueryArgs( pptPrepaidTypesDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PptPrepaidTypes",
        20 * 2 );

    if ( pptPrepaidTypesDMO != null ) {
      // primary key filters...
      String pptType = pptPrepaidTypesDMO.getPptType(  );

      if ( !DMO.isNull( pptType ) ) {
        queryArgs.andFilterBy( "PptTypeMatch" )
                 .arg( pptType + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String pptDescription = pptPrepaidTypesDMO.getPptDescription(  );

      if ( !DMO.isNull( pptDescription ) ) {
        queryArgs.andFilterBy( "PptDescriptionMatch" )
                 .arg( pptDescription + dao.wildcardForAnySequence(  ) );
      }

      String pptValidityUnit = pptPrepaidTypesDMO.getPptValidityUnit(  );

      if ( !DMO.isNull( pptValidityUnit ) ) {
        queryArgs.andFilterBy( "PptValidityUnitMatch" )
                 .arg( pptValidityUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptActivityUnit = pptPrepaidTypesDMO.getPptActivityUnit(  );

      if ( !DMO.isNull( pptActivityUnit ) ) {
        queryArgs.andFilterBy( "PptActivityUnitMatch" )
                 .arg( pptActivityUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptRechargeUnit = pptPrepaidTypesDMO.getPptRechargeUnit(  );

      if ( !DMO.isNull( pptRechargeUnit ) ) {
        queryArgs.andFilterBy( "PptRechargeUnitMatch" )
                 .arg( pptRechargeUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptValwarnUnit = pptPrepaidTypesDMO.getPptValwarnUnit(  );

      if ( !DMO.isNull( pptValwarnUnit ) ) {
        queryArgs.andFilterBy( "PptValwarnUnitMatch" )
                 .arg( pptValwarnUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptActwarnUnit = pptPrepaidTypesDMO.getPptActwarnUnit(  );

      if ( !DMO.isNull( pptActwarnUnit ) ) {
        queryArgs.andFilterBy( "PptActwarnUnitMatch" )
                 .arg( pptActwarnUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptRechwarnUnit = pptPrepaidTypesDMO.getPptRechwarnUnit(  );

      if ( !DMO.isNull( pptRechwarnUnit ) ) {
        queryArgs.andFilterBy( "PptRechwarnUnitMatch" )
                 .arg( pptRechwarnUnit + dao.wildcardForAnySequence(  ) );
      }

      String pptDefPackage = pptPrepaidTypesDMO.getPptDefPackage(  );

      if ( !DMO.isNull( pptDefPackage ) ) {
        queryArgs.andFilterBy( "PptDefPackageMatch" )
                 .arg( pptDefPackage + dao.wildcardForAnySequence(  ) );
      }

      String pptDefTariff = pptPrepaidTypesDMO.getPptDefTariff(  );

      if ( !DMO.isNull( pptDefTariff ) ) {
        queryArgs.andFilterBy( "PptDefTariffMatch" )
                 .arg( pptDefTariff + dao.wildcardForAnySequence(  ) );
      }

      String pptChangeDef = pptPrepaidTypesDMO.getPptChangeDef(  );

      if ( !DMO.isNull( pptChangeDef ) ) {
        queryArgs.andFilterBy( "PptChangeDefMatch" )
                 .arg( pptChangeDef + dao.wildcardForAnySequence(  ) );
      }

//      String pptProfile = pptPrepaidTypesDMO.getPptProfile(  );

//      if ( !DMO.isNull( pptProfile ) ) {
//        queryArgs.andFilterBy( "PptProfileMatch" )
//                 .arg( pptProfile + dao.wildcardForAnySequence(  ) );
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
        ? "PptPrepaidTypes" : dmlName, parts.size(  ) );
    
    Iterator it = parts.iterator();

//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case PptPrepaidTypesDMO.pptTypeFilter:
          part.andFilterBy( queryArgs, "PptType",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptDescriptionFilter:
          part.andFilterBy( queryArgs, "PptDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptCreditFilter:
          part.andFilterBy( queryArgs, "PptCredit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptValidityFilter:
          part.andFilterBy( queryArgs, "PptValidity",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptValidityUnitFilter:
          part.andFilterBy( queryArgs, "PptValidityUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptActivityFilter:
          part.andFilterBy( queryArgs, "PptActivity",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptActivityUnitFilter:
          part.andFilterBy( queryArgs, "PptActivityUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptRechargeFilter:
          part.andFilterBy( queryArgs, "PptRecharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptRechargeUnitFilter:
          part.andFilterBy( queryArgs, "PptRechargeUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptCreditWarnFilter:
          part.andFilterBy( queryArgs, "PptCreditWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptValidityWarnFilter:
          part.andFilterBy( queryArgs, "PptValidityWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptValwarnUnitFilter:
          part.andFilterBy( queryArgs, "PptValwarnUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptActivityWarnFilter:
          part.andFilterBy( queryArgs, "PptActivityWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptActwarnUnitFilter:
          part.andFilterBy( queryArgs, "PptActwarnUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptRechargeWarnFilter:
          part.andFilterBy( queryArgs, "PptRechargeWarn",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptRechwarnUnitFilter:
          part.andFilterBy( queryArgs, "PptRechwarnUnit",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptDefPackageFilter:
          part.andFilterBy( queryArgs, "PptDefPackage",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptDefTariffFilter:
          part.andFilterBy( queryArgs, "PptDefTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case PptPrepaidTypesDMO.pptChangeDefFilter:
          part.andFilterBy( queryArgs, "PptChangeDef",
            dao.wildcardForAnySequence(  ) );

          break;

//        case PptPrepaidTypesDMO.pptProfileFilter:
//          part.andFilterBy( queryArgs, "PptProfile",
//            dao.wildcardForAnySequence(  ) );
//
//          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PptPrepaidTypes records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PptPrepaidTypes records based
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
   * Retrieves the PptPrepaidTypes Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PptPrepaidTypesDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PptPrepaidTypesDMO) dao.get( args.getDMLName(  ),
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
