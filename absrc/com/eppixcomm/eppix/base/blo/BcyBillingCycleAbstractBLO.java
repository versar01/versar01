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
 * Holds the details of the current state of the cycle.
 * <p>
 *   This table is the definition of a cycle. It's the place that shows that a given cycle exists.
 * </p>
 * <p>
 *   There is one entry in here for a cycle. It shows details of the last run, gives the dates for the next and shows which
 *   call_pcccccmmddyy and bill_cccccddmmyy tables to use.
 * </p>
 * <p>
 *   Once a cycle is in use it can't be removed from this table, it has to be retained so old runs can be located by the enquiry
 *   GUIs.
 * </p>
 *
 * This abstract business logic class holds all the logic for the BcyBillingCycle class.
 * It is extended by BcyBillingCycle class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class BcyBillingCycleAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( BcyBillingCycle.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "BCYC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected BcyBillingCycleDAC bcyBillingCycleDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return BcyBillingCycleDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.bcyBillingCycleDAC = (BcyBillingCycleDAC) dac;
  }

  /**
  * Retrieve a bcyBillingCycle data model object from persistent storage. The
  * bcyBillingCycleDMO passed in must contain a valid existing bcyBillingCycleId.
  * Optionally, the return bcyBillingCycleDMO may be include a flag that indicates if
  * the bcyBillingCycle object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the bcyBillingCycle object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BCYBILLINGCYCLE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  bcyBillingCycleDMO the bcyBillingCycle object that must contain either the
  *         unique bcyBillingCycleId or the displayCode/languageCode pair
  *
  * @return bcyBillingCycleDMO the bcyBillingCycle data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public BcyBillingCycleDMO get( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(bcyBillingCycleDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "bcyBillingCycleDMO", bcyBillingCycleDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyBillCycle",
      bcyBillingCycleDMO.getBcyBillCycle(  ) );

    //
    // Attempt to get the BcyBillingCycleDMO
    //
    BcyBillingCycleDMO returnBcyBillingCycleDMO = bcyBillingCycleDAC.get( bcyBillingCycleDMO );

    //
    // Could not find the BcyBillingCycleDMO
    //
    if ( returnBcyBillingCycleDMO == null ) {
      thrower.business( Base_BCYBILLINGCYCLE_000,
        new Object[] { bcyBillingCycleDMO.getBcyBillCycle(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnBcyBillingCycleDMO;
  }

  /**
   * Return a list of BcyBillingCycle objects matching the passed in values. A
   * partial match is performed on the description argument and/or the bcyBillingCycles
   * displayCode. If no values have been passed in, all BcyBillingCycle objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the BcyBillingCycle is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param bcyBillingCycleDMO BcyBillingCycleDMO object
   *
   * @return DTOList of BcyBillingCycle objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, bcyBillingCycleDMO )" );

    return bcyBillingCycleDAC.getList( state, bcyBillingCycleDMO );
  }

  /**
  * Creates the BcyBillingCycle object. As a side effect, following creation
  * of a bcyBillingCycle an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param bcyBillingCycleDMO bcyBillingCycleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bcyBillingCycleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BcyBillingCycleDMO create( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( bcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "bcyBillingCycleDMO", bcyBillingCycleDMO );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyBillCycle",
      bcyBillingCycleDMO.getBcyBillCycle(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyDescription",
      bcyBillingCycleDMO.getBcyDescription(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyPeriod",
      bcyBillingCycleDMO.getBcyPeriod(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyFrequency",
      bcyBillingCycleDMO.getBcyFrequency(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyDayOfRun",
      bcyBillingCycleDMO.getBcyDayOfRun(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyNextRun",
      bcyBillingCycleDMO.getBcyNextRun(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcySuspended",
      bcyBillingCycleDMO.getBcySuspended(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyUseStatus",
      bcyBillingCycleDMO.getBcyUseStatus(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyNextCallRun",
      bcyBillingCycleDMO.getBcyNextCallRun(  ) );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyInAdvance",
      bcyBillingCycleDMO.getBcyInAdvance(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( bcyBillingCycleDMO ) ) {
      thrower.business( Base_BCYBILLINGCYCLE_001,
        new Object[] { bcyBillingCycleDMO.getBcyBillCycle(  ) } );
    }

    //
    // Now create the bcyBillingCycle
    //
    bcyBillingCycleDAC.create( bcyBillingCycleDMO );

    return bcyBillingCycleDMO;
  }

  /**
  * Modifies the BcyBillingCycle object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BCYBILLINGCYCLE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param bcyBillingCycleDMO bcyBillingCycleDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bcyBillingCycleDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BcyBillingCycleDMO modify( BcyBillingCycleDMO aBcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( abcyBillingCycleDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "abcyBillingCycleDMO", aBcyBillingCycleDMO );

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyBillCycle",
      aBcyBillingCycleDMO.getBcyBillCycle(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyDescription",
      aBcyBillingCycleDMO.getBcyDescription(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyPeriod",
      aBcyBillingCycleDMO.getBcyPeriod(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyFrequency",
      aBcyBillingCycleDMO.getBcyFrequency(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyDayOfRun",
      aBcyBillingCycleDMO.getBcyDayOfRun(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyNextRun",
      aBcyBillingCycleDMO.getBcyNextRun(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcySuspended",
      aBcyBillingCycleDMO.getBcySuspended(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyUseStatus",
      aBcyBillingCycleDMO.getBcyUseStatus(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyNextCallRun",
      aBcyBillingCycleDMO.getBcyNextCallRun(  ) ); // attribute

    thrower.ifParameterMissing( "aBcyBillingCycleDMO.bcyInAdvance",
      aBcyBillingCycleDMO.getBcyInAdvance(  ) ); // attribute

    BcyBillingCycleDMO updateBcyBillingCycleDMO = new BcyBillingCycleDMO(  );

    updateBcyBillingCycleDMO.setBcyBillCycle( aBcyBillingCycleDMO
      .getBcyBillCycle(  ) );

    updateBcyBillingCycleDMO = get( updateBcyBillingCycleDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateBcyBillingCycleDMO.setBcyDescription( aBcyBillingCycleDMO
      .getBcyDescription(  ) );

    updateBcyBillingCycleDMO.setBcyPeriod( aBcyBillingCycleDMO.getBcyPeriod(  ) );

    updateBcyBillingCycleDMO.setBcyFrequency( aBcyBillingCycleDMO
      .getBcyFrequency(  ) );

    updateBcyBillingCycleDMO.setBcyDayOfRun( aBcyBillingCycleDMO
      .getBcyDayOfRun(  ) );

    updateBcyBillingCycleDMO.setBcyNextRun( aBcyBillingCycleDMO.getBcyNextRun(  ) );

    updateBcyBillingCycleDMO.setBcySuspended( aBcyBillingCycleDMO
      .getBcySuspended(  ) );

    updateBcyBillingCycleDMO.setBcyUseStatus( aBcyBillingCycleDMO
      .getBcyUseStatus(  ) );

    updateBcyBillingCycleDMO.setBcyNextCallRun( aBcyBillingCycleDMO
      .getBcyNextCallRun(  ) );

    updateBcyBillingCycleDMO.setBcyInAdvance( aBcyBillingCycleDMO
      .getBcyInAdvance(  ) );

    //
    // Modify the bcyBillingCycleDMO
    //
    bcyBillingCycleDAC.modify( updateBcyBillingCycleDMO );

    // Create a new DMO, set keys, and fetch from the database...
    BcyBillingCycleDMO returnBcyBillingCycleDMO = new BcyBillingCycleDMO(  );

    returnBcyBillingCycleDMO.setBcyBillCycle( updateBcyBillingCycleDMO
      .getBcyBillCycle(  ) );

    returnBcyBillingCycleDMO = get( returnBcyBillingCycleDMO );

    return returnBcyBillingCycleDMO;
  }

  /**
  * Modifies the BcyBillingCycle object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param BcyBillingCycleDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bcyBillingCycleDMO object.
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
    // Modify the bcyBillingCycleDMO
    //
    bcyBillingCycleDAC.modify( filter );
  }

  /**
   * Deletes the BcyBillingCycle object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_BCYBILLINGCYCLE_003
   *     <li>{@link #Base#BCYBILLINGCYCLE_000} if the BcyBillingCycle does not exist.</li>
   *     <li>{@link #Base#BCYBILLINGCYCLE_003} if the BcyBillingCycle is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param BcyBillingCycleDMO BcyBillingCycle object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( bcyBillingCycleDMO )" );

    thrower.ifParameterMissing( "bcyBillingCycleDMO", bcyBillingCycleDMO );

    BcyBillingCycleDMO updateBcyBillingCycleDMO = null;

    updateBcyBillingCycleDMO = get( bcyBillingCycleDMO );

    // delete self...
    bcyBillingCycleDAC.delete( bcyBillingCycleDMO );
  }

  /**
   * Deletes the BcyBillingCycle object.
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
    bcyBillingCycleDAC.delete( filter );
  }

  /**
  * Indicates whether a BcyBillingCycle exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the BcyBillingCycle exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( BcyBillingCycleDMO bcyBillingCycleDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(bcyBillingCycle)" );

    thrower.ifParameterMissing( "bcyBillingCycleDMO", bcyBillingCycleDMO );

    thrower.ifParameterMissing( "bcyBillingCycleDMO.bcyBillCycle",
      bcyBillingCycleDMO.getBcyBillCycle(  ) );

    return bcyBillingCycleDAC.exists( bcyBillingCycleDMO );
  }

  /**
   * Indicates whether a BcyBillingCycle exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the BcyBillingCycle exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return bcyBillingCycleDAC.exists( filter );
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

    return bcyBillingCycleDAC.getList( state, filter );
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

    return bcyBillingCycleDAC.iterate( filter );
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

    return bcyBillingCycleDAC.iterateWithLock( filter );
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
  public BcyBillingCycleDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the BcyBillingCycleDMO
    //
    BcyBillingCycleDMO bcyBillingCycleDMO = bcyBillingCycleDAC.get( filter );

    return bcyBillingCycleDMO;
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

    return bcyBillingCycleDAC.max( filter );
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

    return bcyBillingCycleDAC.min( filter );
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

    return new Integer(bcyBillingCycleDAC.count( filter ));
  }
}
