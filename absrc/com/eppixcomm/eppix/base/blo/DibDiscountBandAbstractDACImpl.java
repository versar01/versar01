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
 * DibDiscountBand Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DibDiscountBandAbstractDACImpl
  extends DAC
  implements DibDiscountBandAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( DibDiscountBandAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DibDiscountBandDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public DibDiscountBandAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public DibDiscountBandAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a DibDiscountBand Data Model Object
   *
   * @return a populated DibDiscountBand Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DibDiscountBandDMO get( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( DibDiscountBandDMO )" );

    thrower.ifParameterMissing( "DibDiscountBandDMO", dibDiscountBandDMO );

    return (DibDiscountBandDMO) dao.get( dibDiscountBandDMO );
  }

  /**
   * Creates the DibDiscountBand object in the database.
   *
   * @param DibDiscountBandDMO dibDiscountBandDMO
   *
   * @throws EPPIXSeriousException
   */
  public DibDiscountBandDMO create( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( dibDiscountBandDMO )" );
    thrower.ifParameterMissing( "DibDiscountBandDMO", dibDiscountBandDMO );

    dao.insert( dibDiscountBandDMO );

    // return the data with key
    return dibDiscountBandDMO;
  }

  /**
   * Locks and retrieves the DibDiscountBand object from the database.
   *
   * @param aDibDiscountBand DibDiscountBand object
   *
   * @return a populated DibDiscountBand object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DibDiscountBandDMO lock( DibDiscountBandDMO aDibDiscountBandDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aDibDiscountBandDMO )" );

    thrower.ifParameterMissing( "aDibDiscountBandDMO", aDibDiscountBandDMO );

    DibDiscountBandDMO lockedDibDiscountBandDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedDibDiscountBandDMO = (DibDiscountBandDMO) dao.lock( "DibDiscountBand",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aDibDiscountBandDMO.getDibBandId(  ) ).arg( aDibDiscountBandDMO
          .getDibRuleId(  ) ).arg( aDibDiscountBandDMO.getDibBandEnd(  ) ) );

    return lockedDibDiscountBandDMO;
  }

  /**
   * Modifies the DibDiscountBand object in the database.
   *
   * @param DibDiscountBandDMO DibDiscountBand object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aDibDiscountBandDMO )" );

    thrower.ifParameterMissing( "aDibDiscountBandDMO", dibDiscountBandDMO );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibBandId",
      dibDiscountBandDMO.getDibBandId(  ) );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibRuleId",
      dibDiscountBandDMO.getDibRuleId(  ) );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibBandEnd",
      dibDiscountBandDMO.getDibBandEnd(  ) );

    dao.update( dibDiscountBandDMO );
  }

  /**
  * Modifies the DibDiscountBand object using the specified filter in the database.
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

    dao.updateCustom( new DibDiscountBandDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the DibDiscountBand object from the database.
   *
   * @param DibDiscountBandDMO DibDiscountBand object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( DibDiscountBandDMO )" );

    thrower.ifParameterMissing( "DibDiscountBandDMO", dibDiscountBandDMO );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibBandId",
      dibDiscountBandDMO.getDibBandId(  ) );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibRuleId",
      dibDiscountBandDMO.getDibRuleId(  ) );

    thrower.ifParameterMissing( "DibDiscountBandDMO.dibBandEnd",
      dibDiscountBandDMO.getDibBandEnd(  ) );

    dao.delete( dibDiscountBandDMO );
  }

  /**
   * Deletes the DibDiscountBand object from the database.
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

    dao.delete( "DibDiscountBand", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a DibDiscountBand object exists.
  *
  * @param DibDiscountBandDMO DibDiscountBandDMO
  *
  * @return true if the DibDiscountBand object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( DibDiscountBandDMO DibDiscountBandDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( DibDiscountBandDMO)" );

    return dao.exists( "DibDiscountBand", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( DibDiscountBandDMO.getDibBandId(  ) ).arg( DibDiscountBandDMO
        .getDibRuleId(  ) ).arg( DibDiscountBandDMO.getDibBandEnd(  ) ) );
  }

  /**
    * Return true if a DibDiscountBand object exists.
    *
    * @param filter
    *
    * @return true if the DibDiscountBand object exists.
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
   * @param locationDMO DibDiscountBand Data Model Object
   *
   * @return DTOList of DibDiscountBand Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    DibDiscountBandDMO dibDiscountBandDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, dibDiscountBandDMO )" );

    return dao.getListAbs( state, paramQueryArgs( dibDiscountBandDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} DibDiscountBandDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    DibDiscountBandDMO dibDiscountBandDMO ) {
    logger.debug( "paramQueryArgs( dibDiscountBandDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "DibDiscountBand",
        8 * 2 );

    if ( dibDiscountBandDMO != null ) {
      // primary key filters...
      Integer dibBandId = dibDiscountBandDMO.getDibBandId(  );

      if ( !DMO.isNull( dibBandId ) ) {
        queryArgs.andFilterBy( "DibBandId" )
                 .arg( dibBandId );
      }

      Integer dibRuleId = dibDiscountBandDMO.getDibRuleId(  );

      if ( !DMO.isNull( dibRuleId ) ) {
        queryArgs.andFilterBy( "DibRuleId" )
                 .arg( dibRuleId );
      }

      BigDecimal dibBandEnd = dibDiscountBandDMO.getDibBandEnd(  );

      if ( !DMO.isNull( dibBandEnd ) ) {
        queryArgs.andFilterBy( "DibBandEnd" )
                 .arg( dibBandEnd );
      }

      // define more filters...
      String dibDiscType = dibDiscountBandDMO.getDibDiscType(  );

      if ( !DMO.isNull( dibDiscType ) ) {
        queryArgs.andFilterBy( "DibDiscTypeMatch" )
                 .arg( dibDiscType + dao.wildcardForAnySequence(  ) );
      }

      String dibLimitDisc = dibDiscountBandDMO.getDibLimitDisc(  );

      if ( !DMO.isNull( dibLimitDisc ) ) {
        queryArgs.andFilterBy( "DibLimitDiscMatch" )
                 .arg( dibLimitDisc + dao.wildcardForAnySequence(  ) );
      }

      String dibChargeRef = dibDiscountBandDMO.getDibChargeRef(  );

      if ( !DMO.isNull( dibChargeRef ) ) {
        queryArgs.andFilterBy( "DibChargeRefMatch" )
                 .arg( dibChargeRef + dao.wildcardForAnySequence(  ) );
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
        ? "DibDiscountBand" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case DibDiscountBandDMO.dibBandIdFilter:
          part.andFilterBy( queryArgs, "DibBandId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibRuleIdFilter:
          part.andFilterBy( queryArgs, "DibRuleId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibBandEndFilter:
          part.andFilterBy( queryArgs, "DibBandEnd",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibDiscTypeFilter:
          part.andFilterBy( queryArgs, "DibDiscType",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibDiscValueFilter:
          part.andFilterBy( queryArgs, "DibDiscValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibMaxDiscountFilter:
          part.andFilterBy( queryArgs, "DibMaxDiscount",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibLimitDiscFilter:
          part.andFilterBy( queryArgs, "DibLimitDisc",
            dao.wildcardForAnySequence(  ) );

          break;

        case DibDiscountBandDMO.dibChargeRefFilter:
          part.andFilterBy( queryArgs, "DibChargeRef",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of DibDiscountBand records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of DibDiscountBand records based
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
   * Retrieves the DibDiscountBand Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public DibDiscountBandDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (DibDiscountBandDMO) dao.get( args.getDMLName(  ),
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
