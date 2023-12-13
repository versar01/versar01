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
 * ChgCharges Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class ChgChargesAbstractDACImpl
  extends DAC
  implements ChgChargesAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( ChgChargesAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new ChgChargesDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public ChgChargesAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public ChgChargesAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a ChgCharges Data Model Object
   *
   * @return a populated ChgCharges Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public ChgChargesDMO get( ChgChargesDMO chgChargesDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( ChgChargesDMO )" );

    thrower.ifParameterMissing( "ChgChargesDMO", chgChargesDMO );

    return (ChgChargesDMO) dao.get( chgChargesDMO );
  }

  /**
   * Creates the ChgCharges object in the database.
   *
   * @param ChgChargesDMO chgChargesDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( ChgChargesDMO chgChargesDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( chgChargesDMO )" );
    thrower.ifParameterMissing( "ChgChargesDMO", chgChargesDMO );

    dao.insert( chgChargesDMO );
  }

  /**
   * Locks and retrieves the ChgCharges object from the database.
   *
   * @param aChgCharges ChgCharges object
   *
   * @return a populated ChgCharges object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public ChgChargesDMO lock( ChgChargesDMO aChgChargesDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aChgChargesDMO )" );

    thrower.ifParameterMissing( "aChgChargesDMO", aChgChargesDMO );

    ChgChargesDMO lockedChgChargesDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedChgChargesDMO = (ChgChargesDMO) dao.lock( "ChgCharges",
        "filterByPrimaryKey",
        new DAOArgs( 3 ).arg( aChgChargesDMO.getChgCode(  ) ).arg( aChgChargesDMO
          .getChgNetid(  ) ).arg( aChgChargesDMO.getChgEffectiveDate(  ) ) );

    return lockedChgChargesDMO;
  }

  /**
   * Modifies the ChgCharges object in the database.
   *
   * @param ChgChargesDMO ChgCharges object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( ChgChargesDMO chgChargesDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aChgChargesDMO )" );

    thrower.ifParameterMissing( "aChgChargesDMO", chgChargesDMO );

    thrower.ifParameterMissing( "ChgChargesDMO.chgCode",
      chgChargesDMO.getChgCode(  ) );

    thrower.ifParameterMissing( "ChgChargesDMO.chgNetid",
      chgChargesDMO.getChgNetid(  ) );

    thrower.ifParameterMissing( "ChgChargesDMO.chgEffectiveDate",
      chgChargesDMO.getChgEffectiveDate(  ) );

    dao.update( chgChargesDMO );
  }

  /**
  * Modifies the ChgCharges object using the specified filter in the database.
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

    dao.updateCustom( new ChgChargesDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the ChgCharges object from the database.
   *
   * @param ChgChargesDMO ChgCharges object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( ChgChargesDMO chgChargesDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( ChgChargesDMO )" );

    thrower.ifParameterMissing( "ChgChargesDMO", chgChargesDMO );

    thrower.ifParameterMissing( "ChgChargesDMO.chgCode",
      chgChargesDMO.getChgCode(  ) );

    thrower.ifParameterMissing( "ChgChargesDMO.chgNetid",
      chgChargesDMO.getChgNetid(  ) );

    thrower.ifParameterMissing( "ChgChargesDMO.chgEffectiveDate",
      chgChargesDMO.getChgEffectiveDate(  ) );

    dao.delete( chgChargesDMO );
  }

  /**
   * Deletes the ChgCharges object from the database.
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

    dao.delete( "ChgCharges", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a ChgCharges object exists.
  *
  * @param ChgChargesDMO ChgChargesDMO
  *
  * @return true if the ChgCharges object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( ChgChargesDMO ChgChargesDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( ChgChargesDMO)" );

    return dao.exists( "ChgCharges", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( ChgChargesDMO.getChgCode(  ) ).arg( ChgChargesDMO
        .getChgNetid(  ) ).arg( ChgChargesDMO.getChgEffectiveDate(  ) ) );
  }

  /**
    * Return true if a ChgCharges object exists.
    *
    * @param filter
    *
    * @return true if the ChgCharges object exists.
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
   * @param locationDMO ChgCharges Data Model Object
   *
   * @return DTOList of ChgCharges Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState  state,
    ChgChargesDMO chgChargesDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, chgChargesDMO )" );

    return dao.getListAbs( state, paramQueryArgs( chgChargesDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} ChgChargesDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( ChgChargesDMO chgChargesDMO ) {
    logger.debug( "paramQueryArgs( chgChargesDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "ChgCharges", 11 * 2 );

    if ( chgChargesDMO != null ) {
      // primary key filters...
      String chgCode = chgChargesDMO.getChgCode(  );

      if ( !DMO.isNull( chgCode ) ) {
        queryArgs.andFilterBy( "ChgCodeMatch" )
                 .arg( chgCode + dao.wildcardForAnySequence(  ) );
      }

      String chgNetid = chgChargesDMO.getChgNetid(  );

      if ( !DMO.isNull( chgNetid ) ) {
        queryArgs.andFilterBy( "ChgNetidMatch" )
                 .arg( chgNetid + dao.wildcardForAnySequence(  ) );
      }

      Date chgEffectiveDate = chgChargesDMO.getChgEffectiveDate(  );

      if ( !DMO.isNull( chgEffectiveDate ) ) {
        queryArgs.andFilterBy( "ChgEffectiveDate" )
                 .arg( chgEffectiveDate );
      }

      // define more filters...
      String chgDescription = chgChargesDMO.getChgDescription(  );

      if ( !DMO.isNull( chgDescription ) ) {
        queryArgs.andFilterBy( "ChgDescriptionMatch" )
                 .arg( chgDescription + dao.wildcardForAnySequence(  ) );
      }

      String chgVatCode = chgChargesDMO.getChgVatCode(  );

      if ( !DMO.isNull( chgVatCode ) ) {
        queryArgs.andFilterBy( "ChgVatCodeMatch" )
                 .arg( chgVatCode + dao.wildcardForAnySequence(  ) );
      }

      String chgNcode = chgChargesDMO.getChgNcode(  );

      if ( !DMO.isNull( chgNcode ) ) {
        queryArgs.andFilterBy( "ChgNcodeMatch" )
                 .arg( chgNcode + dao.wildcardForAnySequence(  ) );
      }

      String chgChargef = chgChargesDMO.getChgChargef(  );

      if ( !DMO.isNull( chgChargef ) ) {
        queryArgs.andFilterBy( "ChgChargefMatch" )
                 .arg( chgChargef + dao.wildcardForAnySequence(  ) );
      }

      String chgPeriod = chgChargesDMO.getChgPeriod(  );

      if ( !DMO.isNull( chgPeriod ) ) {
        queryArgs.andFilterBy( "ChgPeriodMatch" )
                 .arg( chgPeriod + dao.wildcardForAnySequence(  ) );
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
        ? "ChgCharges" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case ChgChargesDMO.chgCodeFilter:
          part.andFilterBy( queryArgs, "ChgCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgDescriptionFilter:
          part.andFilterBy( queryArgs, "ChgDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgValueFilter:
          part.andFilterBy( queryArgs, "ChgValue",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgVatCodeFilter:
          part.andFilterBy( queryArgs, "ChgVatCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgNcodeFilter:
          part.andFilterBy( queryArgs, "ChgNcode",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgNetidFilter:
          part.andFilterBy( queryArgs, "ChgNetid",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgChargefFilter:
          part.andFilterBy( queryArgs, "ChgChargef",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgPeriodFilter:
          part.andFilterBy( queryArgs, "ChgPeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgFrequencyFilter:
          part.andFilterBy( queryArgs, "ChgFrequency",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgEffectiveDateFilter:
          part.andFilterBy( queryArgs, "ChgEffectiveDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case ChgChargesDMO.chgClassIdFilter:
          part.andFilterBy( queryArgs, "ChgClassId",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of ChgCharges records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of ChgCharges records based
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
   * Retrieves the ChgCharges Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public ChgChargesDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (ChgChargesDMO) dao.get( args.getDMLName(  ),
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
