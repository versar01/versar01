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
import com.eppixcomm.eppix.common.data.StringDMO;

//import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
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
 * This table is used to store the generic subscriber details.
 * <p>
 *   The subscriber (or client) specific details are stored in the table sba_sub_aux table.
 * </p>
 * <p>
 *   The subscribers physical address is no longer stored on this table. It has moved to the aud_address table which also holds
 *   any other addresses for the subscriber. The physical address is stored on there with an address_type of "SPHY".
 * </p>
 *
 * This abstract business logic class holds all the logic for the SbdSubDets class.
 * It is extended by SbdSubDets class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SbdSubDetsAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SbdSubDets.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SBDD";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SbdSubDetsDAC sbdSubDetsDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.sbdSubDetsDAC = (SbdSubDetsDAC) dac;
  }

  /**
  * Retrieve a sbdSubDets data model object from persistent storage. The
  * sbdSubDetsDMO passed in must contain a valid existing sbdSubDetsId.
  * Optionally, the return sbdSubDetsDMO may be include a flag that indicates if
  * the sbdSubDets object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the sbdSubDets object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SBDSUBDETS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  sbdSubDetsDMO the sbdSubDets object that must contain either the
  *         unique sbdSubDetsId or the displayCode/languageCode pair
  *
  * @return sbdSubDetsDMO the sbdSubDets data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SbdSubDetsDMO get( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(sbdSubDetsDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "sbdSubDetsDMO", sbdSubDetsDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "sbdSubDetsDMO.sbdSubscriberId",
      sbdSubDetsDMO.getSbdSubscriberId(  ) );

    //
    // Attempt to get the SbdSubDetsDMO
    //
    SbdSubDetsDMO returnSbdSubDetsDMO = sbdSubDetsDAC.get( sbdSubDetsDMO );

    //
    // Could not find the SbdSubDetsDMO
    //
    if ( returnSbdSubDetsDMO == null ) {
      thrower.business( Base_SBDSUBDETS_000,
        new Object[] { sbdSubDetsDMO.getSbdSubscriberId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSbdSubDetsDMO;
  }

  /**
   * Return a list of SbdSubDets objects matching the passed in values. A
   * partial match is performed on the description argument and/or the sbdSubDetss
   * displayCode. If no values have been passed in, all SbdSubDets objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SbdSubDets is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param sbdSubDetsDMO SbdSubDetsDMO object
   *
   * @return DTOList of SbdSubDets objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<SbdSubDetsDMO> getList( 
//    DTOListState  state,
//    SbdSubDetsDMO sbdSubDetsDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, sbdSubDetsDMO )" );
//
//    return sbdSubDetsDAC.getList( state, sbdSubDetsDMO );
//  }

  /**
  * Creates the SbdSubDets object. As a side effect, following creation
  * of a sbdSubDets an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sbdSubDetsDMO sbdSubDetsDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sbdSubDetsDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SbdSubDetsDMO create( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( sbdSubDetsDMO )" );

    thrower.ifParameterMissing( "sbdSubDetsDMO", sbdSubDetsDMO );

    // Set generated key to 0
    sbdSubDetsDMO.setSbdSubscriberId( Integer.valueOf(String.valueOf(0)));

    thrower.ifParameterMissing( "sbdSubDetsDMO.sbdPackageCode",
      sbdSubDetsDMO.getSbdPackageCode(  ) );

    //
    // Now create the sbdSubDets
    //
    sbdSubDetsDMO = sbdSubDetsDAC.create( sbdSubDetsDMO );

    return sbdSubDetsDMO;
  }

  /**
  * Modifies the SbdSubDets object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SBDSUBDETS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sbdSubDetsDMO sbdSubDetsDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sbdSubDetsDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SbdSubDetsDMO modify( SbdSubDetsDMO aSbdSubDetsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( asbdSubDetsDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "asbdSubDetsDMO", aSbdSubDetsDMO );

    thrower.ifParameterMissing( "aSbdSubDetsDMO.sbdSubscriberId",
      aSbdSubDetsDMO.getSbdSubscriberId(  ) ); // attribute

    thrower.ifParameterMissing( "aSbdSubDetsDMO.sbdPackageCode",
      aSbdSubDetsDMO.getSbdPackageCode(  ) ); // attribute

    SbdSubDetsDMO updateSbdSubDetsDMO = new SbdSubDetsDMO(  );

    updateSbdSubDetsDMO.setSbdSubscriberId( aSbdSubDetsDMO.getSbdSubscriberId(  ) );

    updateSbdSubDetsDMO = get( updateSbdSubDetsDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSbdSubDetsDMO.setSbdDiallingNo( aSbdSubDetsDMO.getSbdDiallingNo(  ) );

    updateSbdSubDetsDMO.setSbdBillAcNo( aSbdSubDetsDMO.getSbdBillAcNo(  ) );

    updateSbdSubDetsDMO.setSbdConnectDate( aSbdSubDetsDMO.getSbdConnectDate(  ) );

    updateSbdSubDetsDMO.setSbdDconnectDate( aSbdSubDetsDMO.getSbdDconnectDate(  ) );

    updateSbdSubDetsDMO.setSbdTermDate( aSbdSubDetsDMO.getSbdTermDate(  ) );

    updateSbdSubDetsDMO.setSbdTitle( aSbdSubDetsDMO.getSbdTitle(  ) );

    updateSbdSubDetsDMO.setSbdSurname( aSbdSubDetsDMO.getSbdSurname(  ) );

    updateSbdSubDetsDMO.setSbdFirstname( aSbdSubDetsDMO.getSbdFirstname(  ) );

    updateSbdSubDetsDMO.setSbdGender( aSbdSubDetsDMO.getSbdGender(  ) );

    updateSbdSubDetsDMO.setSbdDob( aSbdSubDetsDMO.getSbdDob(  ) );

    updateSbdSubDetsDMO.setSbdPassword( aSbdSubDetsDMO.getSbdPassword(  ) );

    updateSbdSubDetsDMO.setSbdLocationCode( aSbdSubDetsDMO.getSbdLocationCode(  ) );

    updateSbdSubDetsDMO.setSbdBillCycle( aSbdSubDetsDMO.getSbdBillCycle(  ) );

    updateSbdSubDetsDMO.setSbdPackageCode( aSbdSubDetsDMO.getSbdPackageCode(  ) );

    updateSbdSubDetsDMO.setSbdBilledUpto( aSbdSubDetsDMO.getSbdBilledUpto(  ) );

    updateSbdSubDetsDMO.setSbdTariffPlan( aSbdSubDetsDMO.getSbdTariffPlan(  ) );

    //
    // Modify the sbdSubDetsDMO
    //
    sbdSubDetsDAC.modify( updateSbdSubDetsDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SbdSubDetsDMO returnSbdSubDetsDMO = new SbdSubDetsDMO(  );

    returnSbdSubDetsDMO.setSbdSubscriberId( updateSbdSubDetsDMO
      .getSbdSubscriberId(  ) );

    returnSbdSubDetsDMO = get( returnSbdSubDetsDMO );

    return returnSbdSubDetsDMO;
  }

  /**
  * Modifies the SbdSubDets object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SbdSubDetsDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sbdSubDetsDMO object.
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
    // Modify the sbdSubDetsDMO
    //
    sbdSubDetsDAC.modify( filter );
  }

  /**
   * Deletes the SbdSubDets object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SBDSUBDETS_003
   *     <li>{@link #Base#SBDSUBDETS_000} if the SbdSubDets does not exist.</li>
   *     <li>{@link #Base#SBDSUBDETS_003} if the SbdSubDets is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SbdSubDetsDMO SbdSubDets object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( sbdSubDetsDMO )" );

    thrower.ifParameterMissing( "sbdSubDetsDMO", sbdSubDetsDMO );

    SbdSubDetsDMO updateSbdSubDetsDMO = null;

    updateSbdSubDetsDMO = get( sbdSubDetsDMO );

    // delete self...
    sbdSubDetsDAC.delete( sbdSubDetsDMO );
  }

  /**
   * Deletes the SbdSubDets object.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
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
    sbdSubDetsDAC.delete( filter );
  }

  /**
  * Indicates whether a SbdSubDets exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the SbdSubDets exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SbdSubDetsDMO sbdSubDetsDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(sbdSubDets)" );

    thrower.ifParameterMissing( "sbdSubDetsDMO", sbdSubDetsDMO );

    thrower.ifParameterMissing( "sbdSubDetsDMO.sbdSubscriberId",
      sbdSubDetsDMO.getSbdSubscriberId(  ) );

    return sbdSubDetsDAC.exists( sbdSubDetsDMO );
  }

  /**
   * Indicates whether a SbdSubDets exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SbdSubDets exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return sbdSubDetsDAC.exists( filter );
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
//  public DTOList<SbdSubDetsDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return sbdSubDetsDAC.getList( state, filter );
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

    return sbdSubDetsDAC.iterate( filter );
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

    return sbdSubDetsDAC.iterateWithLock( filter );
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
  public SbdSubDetsDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SbdSubDetsDMO
    //
    SbdSubDetsDMO sbdSubDetsDMO = sbdSubDetsDAC.get( filter );

    return sbdSubDetsDMO;
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

    return sbdSubDetsDAC.max( filter );
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

    return sbdSubDetsDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(sbdSubDetsDAC.count( filter )));
  }

  public DAOIterator iterateSbdBillAccNoBySbaInvAccount(String sbaInvAccount)throws EPPIXSeriousException{
	  
	  logger.debug( "iterateSbdBillAccNoBySbaInvAccount(String sbaInvAccount)" );
	  thrower.ifParameterMissing( "sbaInvAccount", sbaInvAccount );
	  
	  return sbdSubDetsDAC.iterateSbdBillAccNoBySbaInvAccount(sbaInvAccount);
  }
  
}
