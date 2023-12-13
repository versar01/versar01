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
 * Lists the charges to be paid by a particular subscriber.
 * <p>
 *   There are a number of identical tables, one per cycle per period, named bill_cccccyyyymmdd where ccccc is the cycle
 *   code (see bcy_bill_cycle) yyyymmdd is the invoice date for the period of the cycle (see bcy_next_run)
 * </p>
 * <p>
 *   When a charge is raised it is placed in the bill table for the date it covers and for the billing cycle that the subscriber
 *   is on (see sbd_bill_cycle). However if the billing run has already been run for that period it is placed on the first
 *   unbilled period instead (shown by bcy_next_run). Trial billing creates tables called trl_cccccyyyymmdd using the same
 *   script as bill_cccccyyyymmdd.
 * </p>
 *
 * This abstract business logic class holds all the logic for the BillCccccyyyymmdd class.
 * It is extended by BillCccccyyyymmdd class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class BillCccccyyyymmddAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( BillCccccyyyymmdd.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "BILC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected BillCccccyyyymmddDAC billCccccyyyymmddDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return BillCccccyyyymmddDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.billCccccyyyymmddDAC = (BillCccccyyyymmddDAC) dac;
  }

  /**
  * Retrieve a billCccccyyyymmdd data model object from persistent storage. The
  * billCccccyyyymmddDMO passed in must contain a valid existing billCccccyyyymmddId.
  * Optionally, the return billCccccyyyymmddDMO may be include a flag that indicates if
  * the billCccccyyyymmdd object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the billCccccyyyymmdd object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BILLCCCCCYYYYMMDD_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  billCccccyyyymmddDMO the billCccccyyyymmdd object that must contain either the
  *         unique billCccccyyyymmddId or the displayCode/languageCode pair
  *
  * @return billCccccyyyymmddDMO the billCccccyyyymmdd data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public BillCccccyyyymmddDMO get( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(billCccccyyyymmddDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "billCccccyyyymmddDMO", billCccccyyyymmddDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "billCccccyyyymmddDMO.billId",
      billCccccyyyymmddDMO.getBillId(  ) );

    //
    // Attempt to get the BillCccccyyyymmddDMO
    //
    BillCccccyyyymmddDMO returnBillCccccyyyymmddDMO = billCccccyyyymmddDAC.get( billCccccyyyymmddDMO,
        tableName );

    //
    // Could not find the BillCccccyyyymmddDMO
    //
    if ( returnBillCccccyyyymmddDMO == null ) {
      thrower.business( Base_BILLCCCCCYYYYMMDD_000,
        new Object[] { billCccccyyyymmddDMO.getBillId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnBillCccccyyyymmddDMO;
  }

  /**
   * Return a list of BillCccccyyyymmdd objects matching the passed in values. A
   * partial match is performed on the description argument and/or the billCccccyyyymmdds
   * displayCode. If no values have been passed in, all BillCccccyyyymmdd objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the BillCccccyyyymmdd is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param billCccccyyyymmddDMO BillCccccyyyymmddDMO object
   *
   * @return DTOList of BillCccccyyyymmdd objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState         state,
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, billCccccyyyymmddDMO )" );

    return billCccccyyyymmddDAC.getList( state, billCccccyyyymmddDMO,
      tableName );
  }

  /**
  * Creates the BillCccccyyyymmdd object. As a side effect, following creation
  * of a billCccccyyyymmdd an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param billCccccyyyymmddDMO billCccccyyyymmddDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated billCccccyyyymmddDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BillCccccyyyymmddDMO create( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( billCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO", billCccccyyyymmddDMO );

    // Set generated key to 0
    billCccccyyyymmddDMO.setBillId( new Integer(0) );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO.subscriberId",
      billCccccyyyymmddDMO.getSubscriberId(  ) );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO.technology",
      billCccccyyyymmddDMO.getTechnology(  ) );

    //
    // Now create the billCccccyyyymmdd
    //
    billCccccyyyymmddDMO = billCccccyyyymmddDAC.create( billCccccyyyymmddDMO,
        tableName );

    return billCccccyyyymmddDMO;
  }

  /**
  * Modifies the BillCccccyyyymmdd object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BILLCCCCCYYYYMMDD_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param billCccccyyyymmddDMO billCccccyyyymmddDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated billCccccyyyymmddDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BillCccccyyyymmddDMO modify( 
    BillCccccyyyymmddDMO aBillCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( abillCccccyyyymmddDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "abillCccccyyyymmddDMO", aBillCccccyyyymmddDMO );

    thrower.ifParameterMissing( "aBillCccccyyyymmddDMO.billId",
      aBillCccccyyyymmddDMO.getBillId(  ) ); // attribute

    thrower.ifParameterMissing( "aBillCccccyyyymmddDMO.subscriberId",
      aBillCccccyyyymmddDMO.getSubscriberId(  ) ); // attribute

    thrower.ifParameterMissing( "aBillCccccyyyymmddDMO.technology",
      aBillCccccyyyymmddDMO.getTechnology(  ) ); // attribute

    BillCccccyyyymmddDMO updateBillCccccyyyymmddDMO = new BillCccccyyyymmddDMO(  );

    updateBillCccccyyyymmddDMO.setBillId( aBillCccccyyyymmddDMO.getBillId(  ) );

    updateBillCccccyyyymmddDMO = get( updateBillCccccyyyymmddDMO, tableName );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateBillCccccyyyymmddDMO.setSubscriberId( aBillCccccyyyymmddDMO
      .getSubscriberId(  ) );

    updateBillCccccyyyymmddDMO.setHandset( aBillCccccyyyymmddDMO.getHandset(  ) );

    updateBillCccccyyyymmddDMO.setChaserv( aBillCccccyyyymmddDMO.getChaserv(  ) );

    updateBillCccccyyyymmddDMO.setBillind( aBillCccccyyyymmddDMO.getBillind(  ) );

    updateBillCccccyyyymmddDMO.setBilldat( aBillCccccyyyymmddDMO.getBilldat(  ) );

    updateBillCccccyyyymmddDMO.setCost( aBillCccccyyyymmddDMO.getCost(  ) );

    updateBillCccccyyyymmddDMO.setCharge( aBillCccccyyyymmddDMO.getCharge(  ) );

    updateBillCccccyyyymmddDMO.setSparech( aBillCccccyyyymmddDMO.getSparech(  ) );

    updateBillCccccyyyymmddDMO.setInvoiceNo( aBillCccccyyyymmddDMO
      .getInvoiceNo(  ) );

    updateBillCccccyyyymmddDMO.setTwinbillNo( aBillCccccyyyymmddDMO
      .getTwinbillNo(  ) );

    updateBillCccccyyyymmddDMO.setVatamt( aBillCccccyyyymmddDMO.getVatamt(  ) );

    updateBillCccccyyyymmddDMO.setVatrate( aBillCccccyyyymmddDMO.getVatrate(  ) );

    updateBillCccccyyyymmddDMO.setCycleNo( aBillCccccyyyymmddDMO.getCycleNo(  ) );

    updateBillCccccyyyymmddDMO.setVatcode( aBillCccccyyyymmddDMO.getVatcode(  ) );

    updateBillCccccyyyymmddDMO.setStartPeriod( aBillCccccyyyymmddDMO
      .getStartPeriod(  ) );

    updateBillCccccyyyymmddDMO.setEndPeriod( aBillCccccyyyymmddDMO
      .getEndPeriod(  ) );

    updateBillCccccyyyymmddDMO.setBatchRunNum( aBillCccccyyyymmddDMO
      .getBatchRunNum(  ) );

    updateBillCccccyyyymmddDMO.setTimestamp( aBillCccccyyyymmddDMO
      .getTimestamp(  ) );

    updateBillCccccyyyymmddDMO.setCurrencyCharge( aBillCccccyyyymmddDMO
      .getCurrencyCharge(  ) );

    updateBillCccccyyyymmddDMO.setExchangeRate( aBillCccccyyyymmddDMO
      .getExchangeRate(  ) );

    updateBillCccccyyyymmddDMO.setExchOperator( aBillCccccyyyymmddDMO
      .getExchOperator(  ) );

    updateBillCccccyyyymmddDMO.setChargeClassId( aBillCccccyyyymmddDMO
      .getChargeClassId(  ) );

    updateBillCccccyyyymmddDMO.setTechnology( aBillCccccyyyymmddDMO
      .getTechnology(  ) );

    updateBillCccccyyyymmddDMO.setPackge( aBillCccccyyyymmddDMO.getPackge(  ) );

    //
    // Modify the billCccccyyyymmddDMO
    //
    billCccccyyyymmddDAC.modify( updateBillCccccyyyymmddDMO, tableName );

    // Create a new DMO, set keys, and fetch from the database...
    BillCccccyyyymmddDMO returnBillCccccyyyymmddDMO = new BillCccccyyyymmddDMO(  );

    returnBillCccccyyyymmddDMO.setBillId( updateBillCccccyyyymmddDMO.getBillId(  ) );

    returnBillCccccyyyymmddDMO = get( returnBillCccccyyyymmddDMO, tableName );

    return returnBillCccccyyyymmddDMO;
  }

  /**
  * Modifies the BillCccccyyyymmdd object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param BillCccccyyyymmddDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated billCccccyyyymmddDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public void modify( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( filter )" );

    //
    // Modify the billCccccyyyymmddDMO
    //
    billCccccyyyymmddDAC.modify( filter, tableName );
  }

  /**
   * Deletes the BillCccccyyyymmdd object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_BILLCCCCCYYYYMMDD_003
   *     <li>{@link #Base#BILLCCCCCYYYYMMDD_000} if the BillCccccyyyymmdd does not exist.</li>
   *     <li>{@link #Base#BILLCCCCCYYYYMMDD_003} if the BillCccccyyyymmdd is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param BillCccccyyyymmddDMO BillCccccyyyymmdd object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( billCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO", billCccccyyyymmddDMO );
    thrower.ifParameterMissing( "tableName", tableName );

    BillCccccyyyymmddDMO updateBillCccccyyyymmddDMO = null;

    updateBillCccccyyyymmddDMO = get( billCccccyyyymmddDMO, tableName );

    // delete self...
    billCccccyyyymmddDAC.delete( billCccccyyyymmddDMO, tableName );
  }

  /**
   * Deletes the BillCccccyyyymmdd object.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param QueryFilter filter.
   *  @param String tableName
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );
    thrower.ifParameterMissing( "tableName", tableName );

    // delete...
    billCccccyyyymmddDAC.delete( filter, tableName );
  }

  /**
  * Indicates whether a BillCccccyyyymmdd exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the BillCccccyyyymmdd exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(billCccccyyyymmdd)" );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO", billCccccyyyymmddDMO );

    thrower.ifParameterMissing( "billCccccyyyymmddDMO.billId",
      billCccccyyyymmddDMO.getBillId(  ) );

    return billCccccyyyymmddDAC.exists( billCccccyyyymmddDMO, tableName );
  }

  /**
   * Indicates whether a BillCccccyyyymmdd exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the BillCccccyyyymmdd exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return billCccccyyyymmddDAC.exists( filter, tableName );
  }

  //---------------------------------------------------------------------------------------------------------
  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter,
    String       tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, filter )" );

    return billCccccyyyymmddDAC.getList( state, filter, tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterate( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return billCccccyyyymmddDAC.iterate( filter, tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterateWithLock( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterateWithLock( filter )" );

    return billCccccyyyymmddDAC.iterateWithLock( filter, tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public BillCccccyyyymmddDMO get( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the BillCccccyyyymmddDMO
    //
    BillCccccyyyymmddDMO billCccccyyyymmddDMO = billCccccyyyymmddDAC.get( filter,
        tableName );

    return billCccccyyyymmddDMO;
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object max( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "max( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return billCccccyyyymmddDAC.max( filter, tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object min( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "min( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return billCccccyyyymmddDAC.min( filter, tableName );
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
  public Integer count( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "count( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return new Integer(billCccccyyyymmddDAC.count(filter, tableName));
  }
}
