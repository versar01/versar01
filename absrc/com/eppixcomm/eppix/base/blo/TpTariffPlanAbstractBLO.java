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

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * This table is used in common by the GSM and TDMA calls processing and for version 6.
 * <p>
 *   00 will include an additional technology indicator field and a field that points to the applicable toll tariff plan
 *   (referring to table ttp_toll_tar_plan):
 * </p>
 *
 * This abstract business logic class holds all the logic for the TpTariffPlan class.
 * It is extended by TpTariffPlan class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class TpTariffPlanAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( TpTariffPlanAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "TPTP";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected TpTariffPlanAbstractDAC tpTariffPlanDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return TpTariffPlanAbstractDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.tpTariffPlanDAC = (TpTariffPlanAbstractDAC) dac;
  }

  /**
  * Retrieve a tpTariffPlan data model object from persistent storage. The
  * tpTariffPlanDMO passed in must contain a valid existing tpTariffPlanId.
  * Optionally, the return tpTariffPlanDMO may be include a flag that indicates if
  * the tpTariffPlan object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the tpTariffPlan object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TPTARIFFPLAN_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  tpTariffPlanDMO the tpTariffPlan object that must contain either the
  *         unique tpTariffPlanId or the displayCode/languageCode pair
  *
  * @return tpTariffPlanDMO the tpTariffPlan data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public TpTariffPlanDMO get( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(tpTariffPlanDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "tpTariffPlanDMO", tpTariffPlanDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "tpTariffPlanDMO.tpTarplanRef",
      tpTariffPlanDMO.getTpTarplanRef(  ) );

    //
    // Attempt to get the TpTariffPlanDMO
    //
    TpTariffPlanDMO returnTpTariffPlanDMO = tpTariffPlanDAC.get( tpTariffPlanDMO );

    //
    // Could not find the TpTariffPlanDMO
    //
    if ( returnTpTariffPlanDMO == null ) {
      thrower.business( Base_TPTARIFFPLAN_000,
        new Object[] { tpTariffPlanDMO.getTpTarplanRef(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnTpTariffPlanDMO;
  }

  /**
   * Return a list of TpTariffPlan objects matching the passed in values. A
   * partial match is performed on the description argument and/or the tpTariffPlans
   * displayCode. If no values have been passed in, all TpTariffPlan objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the TpTariffPlan is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param tpTariffPlanDMO TpTariffPlanDMO object
   *
   * @return DTOList of TpTariffPlan objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<TpTariffPlanDMO> getList( 
//    DTOListState    state,
//    TpTariffPlanDMO tpTariffPlanDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, tpTariffPlanDMO )" );
//
//    return tpTariffPlanDAC.getList( state, tpTariffPlanDMO );
//  }

  /**
  * Creates the TpTariffPlan object. As a side effect, following creation
  * of a tpTariffPlan an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param tpTariffPlanDMO tpTariffPlanDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tpTariffPlanDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TpTariffPlanDMO create( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( tpTariffPlanDMO )" );

    thrower.ifParameterMissing( "tpTariffPlanDMO", tpTariffPlanDMO );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpTarplanRef",
      tpTariffPlanDMO.getTpTarplanRef(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpTarplanText",
      tpTariffPlanDMO.getTpTarplanText(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpSuspendInd",
      tpTariffPlanDMO.getTpSuspendInd(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpIncomming",
      tpTariffPlanDMO.getTpIncomming(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpInternational",
      tpTariffPlanDMO.getTpInternational(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpLocal",
      tpTariffPlanDMO.getTpLocal(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpOffPeak",
      tpTariffPlanDMO.getTpOffPeak(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpHighSpend",
      tpTariffPlanDMO.getTpHighSpend(  ) );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpTimestamp",
      tpTariffPlanDMO.getTpTimestamp(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( tpTariffPlanDMO ) ) {
      thrower.business( Base_TPTARIFFPLAN_001,
        new Object[] { tpTariffPlanDMO.getTpTarplanRef(  ) } );
    }

    //
    // Now create the tpTariffPlan
    //
    tpTariffPlanDAC.create( tpTariffPlanDMO );

    return tpTariffPlanDMO;
  }

  /**
  * Modifies the TpTariffPlan object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TPTARIFFPLAN_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param tpTariffPlanDMO tpTariffPlanDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tpTariffPlanDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TpTariffPlanDMO modify( TpTariffPlanDMO aTpTariffPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( atpTariffPlanDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "atpTariffPlanDMO", aTpTariffPlanDMO );

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpTarplanRef",
      aTpTariffPlanDMO.getTpTarplanRef(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpTarplanText",
      aTpTariffPlanDMO.getTpTarplanText(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpSuspendInd",
      aTpTariffPlanDMO.getTpSuspendInd(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpIncomming",
      aTpTariffPlanDMO.getTpIncomming(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpInternational",
      aTpTariffPlanDMO.getTpInternational(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpLocal",
      aTpTariffPlanDMO.getTpLocal(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpOffPeak",
      aTpTariffPlanDMO.getTpOffPeak(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpHighSpend",
      aTpTariffPlanDMO.getTpHighSpend(  ) ); // attribute

    thrower.ifParameterMissing( "aTpTariffPlanDMO.tpTimestamp",
      aTpTariffPlanDMO.getTpTimestamp(  ) ); // attribute

    TpTariffPlanDMO updateTpTariffPlanDMO = new TpTariffPlanDMO(  );

    updateTpTariffPlanDMO.setTpTarplanRef( aTpTariffPlanDMO.getTpTarplanRef(  ) );

    updateTpTariffPlanDMO = get( updateTpTariffPlanDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateTpTariffPlanDMO.setTpTarplanText( aTpTariffPlanDMO.getTpTarplanText(  ) );

    updateTpTariffPlanDMO.setTpCurrncyRef( aTpTariffPlanDMO.getTpCurrncyRef(  ) );

    updateTpTariffPlanDMO.setTpSuspendInd( aTpTariffPlanDMO.getTpSuspendInd(  ) );

    updateTpTariffPlanDMO.setTpIncomming( aTpTariffPlanDMO.getTpIncomming(  ) );

    updateTpTariffPlanDMO.setTpInternational( aTpTariffPlanDMO
      .getTpInternational(  ) );

    updateTpTariffPlanDMO.setTpLocal( aTpTariffPlanDMO.getTpLocal(  ) );

    updateTpTariffPlanDMO.setTpOffPeak( aTpTariffPlanDMO.getTpOffPeak(  ) );

    updateTpTariffPlanDMO.setTpHighSpend( aTpTariffPlanDMO.getTpHighSpend(  ) );

    updateTpTariffPlanDMO.setTpTimestamp( aTpTariffPlanDMO.getTpTimestamp(  ) );

    //
    // Modify the tpTariffPlanDMO
    //
    tpTariffPlanDAC.modify( updateTpTariffPlanDMO );

    // Create a new DMO, set keys, and fetch from the database...
    TpTariffPlanDMO returnTpTariffPlanDMO = new TpTariffPlanDMO(  );

    returnTpTariffPlanDMO.setTpTarplanRef( updateTpTariffPlanDMO
      .getTpTarplanRef(  ) );

    returnTpTariffPlanDMO = get( returnTpTariffPlanDMO );

    return returnTpTariffPlanDMO;
  }

  /**
  * Modifies the TpTariffPlan object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param TpTariffPlanDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated tpTariffPlanDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public void modify( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( filter )" );

    //
    // Modify the tpTariffPlanDMO
    //
    tpTariffPlanDAC.modify( filter );
  }

  /**
   * Deletes the TpTariffPlan object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_TPTARIFFPLAN_003
   *     <li>{@link #Base#TPTARIFFPLAN_000} if the TpTariffPlan does not exist.</li>
   *     <li>{@link #Base#TPTARIFFPLAN_003} if the TpTariffPlan is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param TpTariffPlanDMO TpTariffPlan object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( tpTariffPlanDMO )" );

    thrower.ifParameterMissing( "tpTariffPlanDMO", tpTariffPlanDMO );

    TpTariffPlanDMO updateTpTariffPlanDMO = null;

    updateTpTariffPlanDMO = get( tpTariffPlanDMO );

    // delete self...
    tpTariffPlanDAC.delete( tpTariffPlanDMO );
  }

  /**
   * Deletes the TpTariffPlan object.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param QueryFilter filter.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    // delete...
    tpTariffPlanDAC.delete( filter );
  }

  /**
  * Indicates whether a TpTariffPlan exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the TpTariffPlan exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(tpTariffPlan)" );

    thrower.ifParameterMissing( "tpTariffPlanDMO", tpTariffPlanDMO );

    thrower.ifParameterMissing( "tpTariffPlanDMO.tpTarplanRef",
      tpTariffPlanDMO.getTpTarplanRef(  ) );

    return tpTariffPlanDAC.exists( tpTariffPlanDMO );
  }

  /**
   * Indicates whether a TpTariffPlan exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the TpTariffPlan exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return tpTariffPlanDAC.exists( filter );
  }

  //---------------------------------------------------------------------------------------------------------
  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
//  public DTOList<TpTariffPlanDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return tpTariffPlanDAC.getList( state, filter );
//  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return tpTariffPlanDAC.iterate( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterateWithLock( filter )" );

    return tpTariffPlanDAC.iterateWithLock( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public TpTariffPlanDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the TpTariffPlanDMO
    //
    TpTariffPlanDMO tpTariffPlanDMO = tpTariffPlanDAC.get( filter );

    return tpTariffPlanDMO;
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object max( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "max( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return tpTariffPlanDAC.max( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object min( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "min( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return tpTariffPlanDAC.min( filter );
  }

  /**
   * Counts the number of rows for the specified filter.
   *
   * @param filter the query filter
   * @return the count of rows.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public int count( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "count( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return tpTariffPlanDAC.count( filter );
  }
}
