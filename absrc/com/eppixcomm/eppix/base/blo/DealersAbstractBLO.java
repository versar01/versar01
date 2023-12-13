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

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;

//import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Holds general and commission details for each dealer.
 *
 * This abstract business logic class holds all the logic for the Dealers class.
 * It is extended by Dealers class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DealersAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( Dealers.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DEA";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DealersDAC dealersDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DealersDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dealersDAC = (DealersDAC) dac;
  }

  /**
  * Retrieve a dealers data model object from persistent storage. The
  * dealersDMO passed in must contain a valid existing dealersId.
  * Optionally, the return dealersDMO may be include a flag that indicates if
  * the dealers object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dealers object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DEALERS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dealersDMO the dealers object that must contain either the
  *         unique dealersId or the displayCode/languageCode pair
  *
  * @return dealersDMO the dealers data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DealersDMO get( DealersDMO dealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dealersDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dealersDMO", dealersDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dealersDMO.dealerId",
      dealersDMO.getDealerId(  ) );

    //
    // Attempt to get the DealersDMO
    //
    DealersDMO returnDealersDMO = dealersDAC.get( dealersDMO );

    //
    // Could not find the DealersDMO
    //
    if ( returnDealersDMO == null ) {
      thrower.business( Base_DEALERS_000,
        new Object[] { dealersDMO.getDealerId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDealersDMO;
  }

  /**
   * Return a list of Dealers objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dealerss
   * displayCode. If no values have been passed in, all Dealers objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Dealers is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dealersDMO DealersDMO object
   *
   * @return DTOList of Dealers objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState state,
    DealersDMO   dealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dealersDMO )" );

    return (DTOList)dealersDAC.getList( state, dealersDMO );
  }

  /**
  * Creates the Dealers object. As a side effect, following creation
  * of a dealers an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dealersDMO dealersDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dealersDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DealersDMO create( DealersDMO dealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dealersDMO )" );

    thrower.ifParameterMissing( "dealersDMO", dealersDMO );

    thrower.ifParameterMissing( "dealersDMO.dealerId",
      dealersDMO.getDealerId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( dealersDMO ) ) {
      thrower.business( Base_DEALERS_001,
        new Object[] { dealersDMO.getDealerId(  ) } );
    }

    //
    // Now create the dealers
    //
    dealersDAC.create( dealersDMO );

    return dealersDMO;
  }

  /**
  * Modifies the Dealers object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DEALERS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dealersDMO dealersDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dealersDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DealersDMO modify( DealersDMO aDealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adealersDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adealersDMO", aDealersDMO );

    thrower.ifParameterMissing( "aDealersDMO.dealerId",
      aDealersDMO.getDealerId(  ) ); // attribute

    DealersDMO updateDealersDMO = new DealersDMO(  );

    updateDealersDMO.setDealerId( aDealersDMO.getDealerId(  ) );

    updateDealersDMO = get( updateDealersDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDealersDMO.setPlAccNo( aDealersDMO.getPlAccNo(  ) );

    updateDealersDMO.setCommPlan( aDealersDMO.getCommPlan(  ) );

    updateDealersDMO.setDealType( aDealersDMO.getDealType(  ) );

    updateDealersDMO.setActivMtd( aDealersDMO.getActivMtd(  ) );

    updateDealersDMO.setDeactMtd( aDealersDMO.getDeactMtd(  ) );

    updateDealersDMO.setRevenMtd( aDealersDMO.getRevenMtd(  ) );

    updateDealersDMO.setActivYtd( aDealersDMO.getActivYtd(  ) );

    updateDealersDMO.setDeactYtd( aDealersDMO.getDeactYtd(  ) );

    updateDealersDMO.setItemiYtd( aDealersDMO.getItemiYtd(  ) );

    updateDealersDMO.setRevenYtd( aDealersDMO.getRevenYtd(  ) );

    updateDealersDMO.setCommiYtd( aDealersDMO.getCommiYtd(  ) );

    updateDealersDMO.setActivCum( aDealersDMO.getActivCum(  ) );

    updateDealersDMO.setDeactCum( aDealersDMO.getDeactCum(  ) );

    updateDealersDMO.setItemiCum( aDealersDMO.getItemiCum(  ) );

    updateDealersDMO.setRevenCum( aDealersDMO.getRevenCum(  ) );

    updateDealersDMO.setCommiCum( aDealersDMO.getCommiCum(  ) );

    updateDealersDMO.setLastComm( aDealersDMO.getLastComm(  ) );

    updateDealersDMO.setBarrIndi( aDealersDMO.getBarrIndi(  ) );

    updateDealersDMO.setClawBac1( aDealersDMO.getClawBac1(  ) );

    updateDealersDMO.setClawBac2( aDealersDMO.getClawBac2(  ) );

    updateDealersDMO.setDealerNl( aDealersDMO.getDealerNl(  ) );

    updateDealersDMO.setQualPeriod( aDealersDMO.getQualPeriod(  ) );

    updateDealersDMO.setQbonusytd( aDealersDMO.getQbonusytd(  ) );

    updateDealersDMO.setDateCreated( aDealersDMO.getDateCreated(  ) );

    updateDealersDMO.setClawInt1( aDealersDMO.getClawInt1(  ) );

    updateDealersDMO.setClawVal1( aDealersDMO.getClawVal1(  ) );

    updateDealersDMO.setClawInt2( aDealersDMO.getClawInt2(  ) );

    updateDealersDMO.setClawVal2( aDealersDMO.getClawVal2(  ) );

    updateDealersDMO.setEposFlag( aDealersDMO.getEposFlag(  ) );

    updateDealersDMO.setAccMinQty( aDealersDMO.getAccMinQty(  ) );

    updateDealersDMO.setAccCurrQty( aDealersDMO.getAccCurrQty(  ) );

    updateDealersDMO.setAccShipQty( aDealersDMO.getAccShipQty(  ) );

    updateDealersDMO.setRegion( aDealersDMO.getRegion(  ) );

    updateDealersDMO.setDealerGroup( aDealersDMO.getDealerGroup(  ) );

    updateDealersDMO.setDealerDirect( aDealersDMO.getDealerDirect(  ) );

    //
    // Modify the dealersDMO
    //
    dealersDAC.modify( updateDealersDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DealersDMO returnDealersDMO = new DealersDMO(  );

    returnDealersDMO.setDealerId( updateDealersDMO.getDealerId(  ) );

    returnDealersDMO = get( returnDealersDMO );

    return returnDealersDMO;
  }

  /**
  * Modifies the Dealers object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DealersDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dealersDMO object.
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
    // Modify the dealersDMO
    //
    dealersDAC.modify( filter );
  }

  /**
   * Deletes the Dealers object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DEALERS_003
   *     <li>{@link #Base#DEALERS_000} if the Dealers does not exist.</li>
   *     <li>{@link #Base#DEALERS_003} if the Dealers is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DealersDMO Dealers object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DealersDMO dealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dealersDMO )" );

    thrower.ifParameterMissing( "dealersDMO", dealersDMO );

    DealersDMO updateDealersDMO = null;

    updateDealersDMO = get( dealersDMO );

    // delete self...
    dealersDAC.delete( dealersDMO );
  }

  /**
   * Deletes the Dealers object.
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
    dealersDAC.delete( filter );
  }

  /**
  * Indicates whether a Dealers exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Dealers exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DealersDMO dealersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dealers)" );

    thrower.ifParameterMissing( "dealersDMO", dealersDMO );

    thrower.ifParameterMissing( "dealersDMO.dealerId",
      dealersDMO.getDealerId(  ) );

    return dealersDAC.exists( dealersDMO );
  }

  /**
   * Indicates whether a Dealers exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Dealers exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dealersDAC.exists( filter );
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
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, filter )" );

    return dealersDAC.getList( state, filter );
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
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return dealersDAC.iterate( filter );
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

    return dealersDAC.iterateWithLock( filter );
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
  public DealersDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DealersDMO
    //
    DealersDMO dealersDMO = dealersDAC.get( filter );

    return dealersDMO;
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

    return dealersDAC.max( filter );
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

    return dealersDAC.min( filter );
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
  public Integer count( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "count( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return new Integer(dealersDAC.count( filter));
  }
}
