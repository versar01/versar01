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

import com.eppixcomm.eppix.base.blo.BthBatchHistoryDAC;
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
 * There is one entry in here per attempt at a run of a batch job.
 * <p>
 *   See also the btc_batch_control table which holds one entry per batch job, but not per run of it. A new record is
 *   generated in this table from the generic BatchRun_Start function. The same row is updated when the batch process
 *   finally ends - stored as a permanent record of the run.
 * </p>
 *
 * This abstract business logic class holds all the logic for the BthBatchHistory class.
 * It is extended by BthBatchHistory class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class BthBatchHistoryAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( BthBatchHistoryAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "BTHH";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected BthBatchHistoryDAC bthBatchHistoryDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return BthBatchHistoryDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.bthBatchHistoryDAC = (BthBatchHistoryDAC) dac;
  }

  /**
  * Retrieve a bthBatchHistory data model object from persistent storage. The
  * bthBatchHistoryDMO passed in must contain a valid existing bthBatchHistoryId.
  * Optionally, the return bthBatchHistoryDMO may be include a flag that indicates if
  * the bthBatchHistory object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the bthBatchHistory object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BTHBATCHHISTORY_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  bthBatchHistoryDMO the bthBatchHistory object that must contain either the
  *         unique bthBatchHistoryId or the displayCode/languageCode pair
  *
  * @return bthBatchHistoryDMO the bthBatchHistory data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public BthBatchHistoryDMO get( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(bthBatchHistoryDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "bthBatchHistoryDMO", bthBatchHistoryDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "bthBatchHistoryDMO.bthBatchRunNum",
      bthBatchHistoryDMO.getBthBatchRunNum(  ) );

    //
    // Attempt to get the BthBatchHistoryDMO
    //
    BthBatchHistoryDMO returnBthBatchHistoryDMO = bthBatchHistoryDAC.get( bthBatchHistoryDMO );

    //
    // Could not find the BthBatchHistoryDMO
    //
    if ( returnBthBatchHistoryDMO == null ) {
      thrower.business( Base_BTHBATCHHISTORY_000,
        new Object[] { bthBatchHistoryDMO.getBthBatchRunNum(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnBthBatchHistoryDMO;
  }

  /**
   * Return a list of BthBatchHistory objects matching the passed in values. A
   * partial match is performed on the description argument and/or the bthBatchHistorys
   * displayCode. If no values have been passed in, all BthBatchHistory objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the BthBatchHistory is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param bthBatchHistoryDMO BthBatchHistoryDMO object
   *
   * @return DTOList of BthBatchHistory objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, bthBatchHistoryDMO )" );

    return bthBatchHistoryDAC.getList( state, bthBatchHistoryDMO );
  }

  /**
  * Creates the BthBatchHistory object. As a side effect, following creation
  * of a bthBatchHistory an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param bthBatchHistoryDMO bthBatchHistoryDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bthBatchHistoryDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BthBatchHistoryDMO create( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( bthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "bthBatchHistoryDMO", bthBatchHistoryDMO );

    // Set generated key to 0
    bthBatchHistoryDMO.setBthBatchRunNum(new Integer(0));

    //
    // Now create the bthBatchHistory
    //
    bthBatchHistoryDMO = bthBatchHistoryDAC.create( bthBatchHistoryDMO );

    return bthBatchHistoryDMO;
  }

  /**
  * Modifies the BthBatchHistory object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#BTHBATCHHISTORY_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param bthBatchHistoryDMO bthBatchHistoryDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bthBatchHistoryDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public BthBatchHistoryDMO modify( BthBatchHistoryDMO aBthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( abthBatchHistoryDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "abthBatchHistoryDMO", aBthBatchHistoryDMO );

    thrower.ifParameterMissing( "aBthBatchHistoryDMO.bthBatchRunNum",
      aBthBatchHistoryDMO.getBthBatchRunNum(  ) ); // attribute

    BthBatchHistoryDMO updateBthBatchHistoryDMO = new BthBatchHistoryDMO(  );

    updateBthBatchHistoryDMO.setBthBatchRunNum( aBthBatchHistoryDMO
      .getBthBatchRunNum(  ) );

    updateBthBatchHistoryDMO = get( updateBthBatchHistoryDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateBthBatchHistoryDMO.setBthBatchType( aBthBatchHistoryDMO
      .getBthBatchType(  ) );

    updateBthBatchHistoryDMO.setBthBatchId( aBthBatchHistoryDMO.getBthBatchId(  ) );

    updateBthBatchHistoryDMO.setBthParameter1( aBthBatchHistoryDMO
      .getBthParameter1(  ) );

    updateBthBatchHistoryDMO.setBthParameter2( aBthBatchHistoryDMO
      .getBthParameter2(  ) );

    updateBthBatchHistoryDMO.setBthParameter3( aBthBatchHistoryDMO
      .getBthParameter3(  ) );

    updateBthBatchHistoryDMO.setBthParameter4( aBthBatchHistoryDMO
      .getBthParameter4(  ) );

    updateBthBatchHistoryDMO.setBthParameter5( aBthBatchHistoryDMO
      .getBthParameter5(  ) );

    updateBthBatchHistoryDMO.setBthParameter6( aBthBatchHistoryDMO
      .getBthParameter6(  ) );

    updateBthBatchHistoryDMO.setBthParameter7( aBthBatchHistoryDMO
      .getBthParameter7(  ) );

    updateBthBatchHistoryDMO.setBthParameter8( aBthBatchHistoryDMO
      .getBthParameter8(  ) );

    updateBthBatchHistoryDMO.setBthParameter9( aBthBatchHistoryDMO
      .getBthParameter9(  ) );

    updateBthBatchHistoryDMO.setBthParameter10( aBthBatchHistoryDMO
      .getBthParameter10(  ) );

    updateBthBatchHistoryDMO.setBthParameter11( aBthBatchHistoryDMO
      .getBthParameter11(  ) );

    updateBthBatchHistoryDMO.setBthParameter12( aBthBatchHistoryDMO
      .getBthParameter12(  ) );

    updateBthBatchHistoryDMO.setBthParameter13( aBthBatchHistoryDMO
      .getBthParameter13(  ) );

    updateBthBatchHistoryDMO.setBthParameter14( aBthBatchHistoryDMO
      .getBthParameter14(  ) );

    updateBthBatchHistoryDMO.setBthParameter15( aBthBatchHistoryDMO
      .getBthParameter15(  ) );

    updateBthBatchHistoryDMO.setBthStartTime( aBthBatchHistoryDMO
      .getBthStartTime(  ) );

    updateBthBatchHistoryDMO.setBthEndTime( aBthBatchHistoryDMO.getBthEndTime(  ) );

    updateBthBatchHistoryDMO.setBthLocationId( aBthBatchHistoryDMO
      .getBthLocationId(  ) );

    updateBthBatchHistoryDMO.setBthRecsProcessed( aBthBatchHistoryDMO
      .getBthRecsProcessed(  ) );

    updateBthBatchHistoryDMO.setBthRecsRejected( aBthBatchHistoryDMO
      .getBthRecsRejected(  ) );

    updateBthBatchHistoryDMO.setBthBatchEndStat( aBthBatchHistoryDMO
      .getBthBatchEndStat(  ) );

    updateBthBatchHistoryDMO.setBthStatusValue( aBthBatchHistoryDMO
      .getBthStatusValue(  ) );

    updateBthBatchHistoryDMO.setBthStatusClass( aBthBatchHistoryDMO
      .getBthStatusClass(  ) );

    updateBthBatchHistoryDMO.setBthIsamValue( aBthBatchHistoryDMO
      .getBthIsamValue(  ) );

    updateBthBatchHistoryDMO.setBthErrorMess( aBthBatchHistoryDMO
      .getBthErrorMess(  ) );

    updateBthBatchHistoryDMO.setBthAnalysis1( aBthBatchHistoryDMO
      .getBthAnalysis1(  ) );

    updateBthBatchHistoryDMO.setBthAnalysis2( aBthBatchHistoryDMO
      .getBthAnalysis2(  ) );

    updateBthBatchHistoryDMO.setBthAnalysis3( aBthBatchHistoryDMO
      .getBthAnalysis3(  ) );

    updateBthBatchHistoryDMO.setBthAnalysis4( aBthBatchHistoryDMO
      .getBthAnalysis4(  ) );

    updateBthBatchHistoryDMO.setBthAnalysis5( aBthBatchHistoryDMO
      .getBthAnalysis5(  ) );

    updateBthBatchHistoryDMO.setBthBatchRunType( aBthBatchHistoryDMO
      .getBthBatchRunType(  ) );

    //
    // Modify the bthBatchHistoryDMO
    //
    bthBatchHistoryDAC.modify( updateBthBatchHistoryDMO );

    // Create a new DMO, set keys, and fetch from the database...
    BthBatchHistoryDMO returnBthBatchHistoryDMO = new BthBatchHistoryDMO(  );

    returnBthBatchHistoryDMO.setBthBatchRunNum( updateBthBatchHistoryDMO
      .getBthBatchRunNum(  ) );

    returnBthBatchHistoryDMO = get( returnBthBatchHistoryDMO );

    return returnBthBatchHistoryDMO;
  }

  /**
  * Modifies the BthBatchHistory object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param BthBatchHistoryDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated bthBatchHistoryDMO object.
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
    // Modify the bthBatchHistoryDMO
    //
    bthBatchHistoryDAC.modify( filter );
  }

  /**
   * Deletes the BthBatchHistory object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_BTHBATCHHISTORY_003
   *     <li>{@link #Base#BTHBATCHHISTORY_000} if the BthBatchHistory does not exist.</li>
   *     <li>{@link #Base#BTHBATCHHISTORY_003} if the BthBatchHistory is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param BthBatchHistoryDMO BthBatchHistory object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( bthBatchHistoryDMO )" );

    thrower.ifParameterMissing( "bthBatchHistoryDMO", bthBatchHistoryDMO );

    BthBatchHistoryDMO updateBthBatchHistoryDMO = null;

    updateBthBatchHistoryDMO = get( bthBatchHistoryDMO );

    // delete self...
    bthBatchHistoryDAC.delete( bthBatchHistoryDMO );
  }

  /**
   * Deletes the BthBatchHistory object.
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
    bthBatchHistoryDAC.delete( filter );
  }

  /**
  * Indicates whether a BthBatchHistory exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the BthBatchHistory exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( BthBatchHistoryDMO bthBatchHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(bthBatchHistory)" );

    thrower.ifParameterMissing( "bthBatchHistoryDMO", bthBatchHistoryDMO );

    thrower.ifParameterMissing( "bthBatchHistoryDMO.bthBatchRunNum",
      bthBatchHistoryDMO.getBthBatchRunNum(  ) );

    return bthBatchHistoryDAC.exists( bthBatchHistoryDMO );
  }

  /**
   * Indicates whether a BthBatchHistory exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the BthBatchHistory exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return bthBatchHistoryDAC.exists( filter );
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

    return bthBatchHistoryDAC.getList( state, filter );
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

    return bthBatchHistoryDAC.iterate( filter );
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

    return bthBatchHistoryDAC.iterateWithLock( filter );
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
  public BthBatchHistoryDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the BthBatchHistoryDMO
    //
    BthBatchHistoryDMO bthBatchHistoryDMO = bthBatchHistoryDAC.get( filter );

    return bthBatchHistoryDMO;
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

    return bthBatchHistoryDAC.max( filter );
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

    return bthBatchHistoryDAC.min( filter );
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

    return new Integer(bthBatchHistoryDAC.count( filter ));
  }
}
