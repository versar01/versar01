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

import com.eppixcomm.eppix.base.blo.BtcBatchControlDAC;
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
 * This table will be used to :-
 define allowable batch runs (including program name) and hence provide definitive lookups for the VB batch routine front ends.
 * <p>
 *   
 hold parameters for the required batch run module. Instead of passing these parameters with the program name, the
 *   batch routine will read this table as one of the first things it does. This allows us to have one generic function ( in
 *   the maintenance server ) to initiate batch runs. 
 hold status information for each batch run, including run status and
 *   start time.
 When a batch process ends the status is reset to IDLE
 * </p>
 *
 * This abstract business logic class holds all the logic for the BtcBatchControl class.
 * It is extended by BtcBatchControl class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class BtcBatchControlAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( BtcBatchControlAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "BTCC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected BtcBatchControlDAC btcBatchControlDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return BtcBatchControlDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.btcBatchControlDAC = (BtcBatchControlDAC) dac;
  }

  /**
  * Retrieve a btcBatchControl data model object from persistent storage. The
  * btcBatchControlDMO passed in must contain a valid existing btcBatchControlId.
  * Optionally, the return btcBatchControlDMO may be include a flag that indicates if
  * the btcBatchControl object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the btcBatchControl object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BTCBATCHCONTROL_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  btcBatchControlDMO the btcBatchControl object that must contain either the
  *         unique btcBatchControlId or the displayCode/languageCode pair
  *
  * @return btcBatchControlDMO the btcBatchControl data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public BtcBatchControlDMO get( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(btcBatchControlDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "btcBatchControlDMO", btcBatchControlDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchType",
      btcBatchControlDMO.getBtcBatchType(  ) );

    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchId",
      btcBatchControlDMO.getBtcBatchId(  ) );

    //
    // Attempt to get the BtcBatchControlDMO
    //
    BtcBatchControlDMO returnBtcBatchControlDMO = btcBatchControlDAC.get( btcBatchControlDMO );

    //
    // Could not find the BtcBatchControlDMO
    //
    if ( returnBtcBatchControlDMO == null ) {
      thrower.business( Base_BTCBATCHCONTROL_000,
        new Object[] {
          btcBatchControlDMO.getBtcBatchType(  ),
          btcBatchControlDMO.getBtcBatchId(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnBtcBatchControlDMO;
  }

  /**
   * Return a list of BtcBatchControl objects matching the passed in values. A
   * partial match is performed on the description argument and/or the btcBatchControls
   * displayCode. If no values have been passed in, all BtcBatchControl objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the BtcBatchControl is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param btcBatchControlDMO BtcBatchControlDMO object
   *
   * @return DTOList of BtcBatchControl objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, btcBatchControlDMO )" );

    return btcBatchControlDAC.getList( state, btcBatchControlDMO );
  }

  /**
  * Creates the BtcBatchControl object. As a side effect, following creation
  * of a btcBatchControl an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param btcBatchControlDMO btcBatchControlDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated btcBatchControlDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BtcBatchControlDMO create( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( btcBatchControlDMO )" );

    thrower.ifParameterMissing( "btcBatchControlDMO", btcBatchControlDMO );

    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchType",
      btcBatchControlDMO.getBtcBatchType(  ) );

    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchId",
      btcBatchControlDMO.getBtcBatchId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( btcBatchControlDMO ) ) {
      thrower.business( Base_BTCBATCHCONTROL_001,
        new Object[] {
          btcBatchControlDMO.getBtcBatchType(  ),
          btcBatchControlDMO.getBtcBatchId(  )
        } );
    }

    //
    // Now create the btcBatchControl
    //
    btcBatchControlDAC.create( btcBatchControlDMO );

    return btcBatchControlDMO;
  }

  /**
  * Modifies the BtcBatchControl object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BTCBATCHCONTROL_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param btcBatchControlDMO btcBatchControlDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated btcBatchControlDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BtcBatchControlDMO modify( BtcBatchControlDMO aBtcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( abtcBatchControlDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "abtcBatchControlDMO", aBtcBatchControlDMO );

    thrower.ifParameterMissing( "aBtcBatchControlDMO.btcBatchType",
      aBtcBatchControlDMO.getBtcBatchType(  ) ); // attribute

    thrower.ifParameterMissing( "aBtcBatchControlDMO.btcBatchId",
      aBtcBatchControlDMO.getBtcBatchId(  ) ); // attribute

    BtcBatchControlDMO updateBtcBatchControlDMO = new BtcBatchControlDMO(  );

    updateBtcBatchControlDMO.setBtcBatchType( aBtcBatchControlDMO
      .getBtcBatchType(  ) );

    updateBtcBatchControlDMO.setBtcBatchId( aBtcBatchControlDMO.getBtcBatchId(  ) );

    updateBtcBatchControlDMO = get( updateBtcBatchControlDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateBtcBatchControlDMO.setBtcDescription( aBtcBatchControlDMO
      .getBtcDescription(  ) );

    updateBtcBatchControlDMO.setBtcBatchRunNum( aBtcBatchControlDMO
      .getBtcBatchRunNum(  ) );

    updateBtcBatchControlDMO.setBtcStartTime( aBtcBatchControlDMO
      .getBtcStartTime(  ) );

    updateBtcBatchControlDMO.setBtcBatchProgram( aBtcBatchControlDMO
      .getBtcBatchProgram(  ) );

    updateBtcBatchControlDMO.setBtcParameter1( aBtcBatchControlDMO
      .getBtcParameter1(  ) );

    updateBtcBatchControlDMO.setBtcParameter2( aBtcBatchControlDMO
      .getBtcParameter2(  ) );

    updateBtcBatchControlDMO.setBtcParameter3( aBtcBatchControlDMO
      .getBtcParameter3(  ) );

    updateBtcBatchControlDMO.setBtcParameter4( aBtcBatchControlDMO
      .getBtcParameter4(  ) );

    updateBtcBatchControlDMO.setBtcParameter5( aBtcBatchControlDMO
      .getBtcParameter5(  ) );

    updateBtcBatchControlDMO.setBtcParameter6( aBtcBatchControlDMO
      .getBtcParameter6(  ) );

    updateBtcBatchControlDMO.setBtcParameter7( aBtcBatchControlDMO
      .getBtcParameter7(  ) );

    updateBtcBatchControlDMO.setBtcParameter8( aBtcBatchControlDMO
      .getBtcParameter8(  ) );

    updateBtcBatchControlDMO.setBtcParameter9( aBtcBatchControlDMO
      .getBtcParameter9(  ) );

    updateBtcBatchControlDMO.setBtcParameter10( aBtcBatchControlDMO
      .getBtcParameter10(  ) );

    updateBtcBatchControlDMO.setBtcParameter11( aBtcBatchControlDMO
      .getBtcParameter11(  ) );

    updateBtcBatchControlDMO.setBtcParameter12( aBtcBatchControlDMO
      .getBtcParameter12(  ) );

    updateBtcBatchControlDMO.setBtcParameter13( aBtcBatchControlDMO
      .getBtcParameter13(  ) );

    updateBtcBatchControlDMO.setBtcParameter14( aBtcBatchControlDMO
      .getBtcParameter14(  ) );

    updateBtcBatchControlDMO.setBtcParameter15( aBtcBatchControlDMO
      .getBtcParameter15(  ) );

    updateBtcBatchControlDMO.setBtcProcessId( aBtcBatchControlDMO
      .getBtcProcessId(  ) );

    updateBtcBatchControlDMO.setBtcLocationId( aBtcBatchControlDMO
      .getBtcLocationId(  ) );

    updateBtcBatchControlDMO.setBtcBatchRunStat( aBtcBatchControlDMO
      .getBtcBatchRunStat(  ) );

    updateBtcBatchControlDMO.setBtcBatchRunType( aBtcBatchControlDMO
      .getBtcBatchRunType(  ) );

    //
    // Modify the btcBatchControlDMO
    //
    btcBatchControlDAC.modify( updateBtcBatchControlDMO );

    // Create a new DMO, set keys, and fetch from the database...
    BtcBatchControlDMO returnBtcBatchControlDMO = new BtcBatchControlDMO(  );

    returnBtcBatchControlDMO.setBtcBatchType( updateBtcBatchControlDMO
      .getBtcBatchType(  ) );

    returnBtcBatchControlDMO.setBtcBatchId( updateBtcBatchControlDMO
      .getBtcBatchId(  ) );

    returnBtcBatchControlDMO = get( returnBtcBatchControlDMO );

    return returnBtcBatchControlDMO;
  }

  /**
  * Modifies the BtcBatchControl object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param BtcBatchControlDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated btcBatchControlDMO object.
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
    // Modify the btcBatchControlDMO
    //
    btcBatchControlDAC.modify( filter );
  }

  /**
   * Deletes the BtcBatchControl object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_BTCBATCHCONTROL_003
   *     <li>{@link #Base#BTCBATCHCONTROL_000} if the BtcBatchControl does not exist.</li>
   *     <li>{@link #Base#BTCBATCHCONTROL_003} if the BtcBatchControl is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param BtcBatchControlDMO BtcBatchControl object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( btcBatchControlDMO )" );

    thrower.ifParameterMissing( "btcBatchControlDMO", btcBatchControlDMO );

    BtcBatchControlDMO updateBtcBatchControlDMO = null;

    updateBtcBatchControlDMO = get( btcBatchControlDMO );

    // delete self...
    btcBatchControlDAC.delete( btcBatchControlDMO );
  }

  /**
   * Deletes the BtcBatchControl object.
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
    btcBatchControlDAC.delete( filter );
  }

  /**
  * Indicates whether a BtcBatchControl exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the BtcBatchControl exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( BtcBatchControlDMO btcBatchControlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(btcBatchControl)" );

    thrower.ifParameterMissing( "btcBatchControlDMO", btcBatchControlDMO );

    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchType",
      btcBatchControlDMO.getBtcBatchType(  ) );

    thrower.ifParameterMissing( "btcBatchControlDMO.btcBatchId",
      btcBatchControlDMO.getBtcBatchId(  ) );

    return btcBatchControlDAC.exists( btcBatchControlDMO );
  }

  /**
   * Indicates whether a BtcBatchControl exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the BtcBatchControl exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return btcBatchControlDAC.exists( filter );
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

    return btcBatchControlDAC.getList( state, filter );
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

    return btcBatchControlDAC.iterate( filter );
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

    return btcBatchControlDAC.iterateWithLock( filter );
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
  public BtcBatchControlDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the BtcBatchControlDMO
    //
    BtcBatchControlDMO btcBatchControlDMO = btcBatchControlDAC.get( filter );

    return btcBatchControlDMO;
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

    return btcBatchControlDAC.max( filter );
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

    return btcBatchControlDAC.min( filter );
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

    return new Integer(btcBatchControlDAC.count( filter));
  }
}
