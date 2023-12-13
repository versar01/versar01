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
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
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
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 *
 * This abstract business logic class holds all the logic for the DlaDealClaimArc class.
 * It is extended by DlaDealClaimArc class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DlaDealClaimArcAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DlaDealClaimArc.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DLACA";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DlaDealClaimArcDAC dlaDealClaimArcDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dlaDealClaimArcDAC = (DlaDealClaimArcDAC) dac;
  }

  /**
  * Retrieve a dlaDealClaimArc data model object from persistent storage. The
  * dlaDealClaimArcDMO passed in must contain a valid existing dlaDealClaimArcId.
  * Optionally, the return dlaDealClaimArcDMO may be include a flag that indicates if
  * the dlaDealClaimArc object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dlaDealClaimArc object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DLADEALCLAIMARC_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dlaDealClaimArcDMO the dlaDealClaimArc object that must contain either the
  *         unique dlaDealClaimArcId or the displayCode/languageCode pair
  *
  * @return dlaDealClaimArcDMO the dlaDealClaimArc data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DlaDealClaimArcDMO get( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dlaDealClaimArcDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dlaDealClaimArcDMO", dlaDealClaimArcDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dlaDealClaimArcDMO.dlaClaimId",
      dlaDealClaimArcDMO.getDlaClaimId(  ) );

    //
    // Attempt to get the DlaDealClaimArcDMO
    //
    DlaDealClaimArcDMO returnDlaDealClaimArcDMO = dlaDealClaimArcDAC.get( dlaDealClaimArcDMO );

    //
    // Could not find the DlaDealClaimArcDMO
    //
    if ( returnDlaDealClaimArcDMO == null ) {
      thrower.business( Base_DLADEALCLAIMARC_000,
        new Object[] { dlaDealClaimArcDMO.getDlaClaimId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDlaDealClaimArcDMO;
  }

  /**
   * Return a list of DlaDealClaimArc objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dlaDealClaimArcs
   * displayCode. If no values have been passed in, all DlaDealClaimArc objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DlaDealClaimArc is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dlaDealClaimArcDMO DlaDealClaimArcDMO object
   *
   * @return DTOList of DlaDealClaimArc objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<DlaDealClaimArcDMO> getList( 
//    DTOListState       state,
//    DlaDealClaimArcDMO dlaDealClaimArcDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, dlaDealClaimArcDMO )" );
//
//    return dlaDealClaimArcDAC.getList( state, dlaDealClaimArcDMO );
//  }

  /**
  * Creates the DlaDealClaimArc object. As a side effect, following creation
  * of a dlaDealClaimArc an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dlaDealClaimArcDMO dlaDealClaimArcDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dlaDealClaimArcDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DlaDealClaimArcDMO create( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "dlaDealClaimArcDMO", dlaDealClaimArcDMO );

    thrower.ifParameterMissing( "dlaDealClaimArcDMO.dlaClaimId",
      dlaDealClaimArcDMO.getDlaClaimId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( dlaDealClaimArcDMO ) ) {
      thrower.business( Base_DLADEALCLAIMARC_001,
        new Object[] { dlaDealClaimArcDMO.getDlaClaimId(  ) } );
    }

    //
    // Now create the dlaDealClaimArc
    //
    dlaDealClaimArcDAC.create( dlaDealClaimArcDMO );

    return dlaDealClaimArcDMO;
  }

  /**
  * Modifies the DlaDealClaimArc object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DLADEALCLAIMARC_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dlaDealClaimArcDMO dlaDealClaimArcDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dlaDealClaimArcDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DlaDealClaimArcDMO modify( DlaDealClaimArcDMO aDlaDealClaimArcDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adlaDealClaimArcDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adlaDealClaimArcDMO", aDlaDealClaimArcDMO );

    thrower.ifParameterMissing( "aDlaDealClaimArcDMO.dlaClaimId",
      aDlaDealClaimArcDMO.getDlaClaimId(  ) ); // attribute

    DlaDealClaimArcDMO updateDlaDealClaimArcDMO = new DlaDealClaimArcDMO(  );

    updateDlaDealClaimArcDMO.setDlaClaimId( aDlaDealClaimArcDMO.getDlaClaimId(  ) );

    updateDlaDealClaimArcDMO = get( updateDlaDealClaimArcDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDlaDealClaimArcDMO.setDlaActType( aDlaDealClaimArcDMO.getDlaActType(  ) );

    updateDlaDealClaimArcDMO.setDlaClaimDate( aDlaDealClaimArcDMO
      .getDlaClaimDate(  ) );

    updateDlaDealClaimArcDMO.setDlaContractDate( aDlaDealClaimArcDMO
      .getDlaContractDate(  ) );

    updateDlaDealClaimArcDMO.setDlaSubscriberId( aDlaDealClaimArcDMO
      .getDlaSubscriberId(  ) );

    updateDlaDealClaimArcDMO.setDlaImei1( aDlaDealClaimArcDMO.getDlaImei1(  ) );

    updateDlaDealClaimArcDMO.setDlaImei2( aDlaDealClaimArcDMO.getDlaImei2(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial1( aDlaDealClaimArcDMO.getDlaSerial1(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial2( aDlaDealClaimArcDMO.getDlaSerial2(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial3( aDlaDealClaimArcDMO.getDlaSerial3(  ) );

    updateDlaDealClaimArcDMO.setDlaSimNo1( aDlaDealClaimArcDMO.getDlaSimNo1(  ) );
    
    updateDlaDealClaimArcDMO.setDlaSimNo2( aDlaDealClaimArcDMO.getDlaSimNo2(  ) );
    
    updateDlaDealClaimArcDMO.setDlaSimProd1( aDlaDealClaimArcDMO.getDlaSimProd1(  ) );
    
    updateDlaDealClaimArcDMO.setDlaSimProd2( aDlaDealClaimArcDMO.getDlaSimProd2(  ) );

    updateDlaDealClaimArcDMO.setDlaDealerId( aDlaDealClaimArcDMO
      .getDlaDealerId(  ) );

    updateDlaDealClaimArcDMO.setDlaPackageCode( aDlaDealClaimArcDMO
      .getDlaPackageCode(  ) );

    updateDlaDealClaimArcDMO.setDlaImei1Amt( aDlaDealClaimArcDMO
      .getDlaImei1Amt(  ) );

    updateDlaDealClaimArcDMO.setDlaImei2Amt( aDlaDealClaimArcDMO
      .getDlaImei2Amt(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial1Amt( aDlaDealClaimArcDMO
      .getDlaSerial1Amt(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial2Amt( aDlaDealClaimArcDMO
      .getDlaSerial2Amt(  ) );

    updateDlaDealClaimArcDMO.setDlaSerial3Amt( aDlaDealClaimArcDMO
      .getDlaSerial3Amt(  ) );

    updateDlaDealClaimArcDMO.setDlaSimAmt1( aDlaDealClaimArcDMO.getDlaSimAmt1(  ) );
    
    updateDlaDealClaimArcDMO.setDlaSimAmt1( aDlaDealClaimArcDMO.getDlaSimAmt2(  ) );

    updateDlaDealClaimArcDMO.setDlaClmAmt( aDlaDealClaimArcDMO.getDlaClmAmt(  ) );

    updateDlaDealClaimArcDMO.setDlaSaveDate( aDlaDealClaimArcDMO
      .getDlaSaveDate(  ) );

    updateDlaDealClaimArcDMO.setDlaUserId( aDlaDealClaimArcDMO.getDlaUserId(  ) );

    updateDlaDealClaimArcDMO.setDlaErrWarn( aDlaDealClaimArcDMO.getDlaErrWarn(  ) );

    updateDlaDealClaimArcDMO.setDlaSubmitDate( aDlaDealClaimArcDMO
      .getDlaSubmitDate(  ) );

    updateDlaDealClaimArcDMO.setDlaErrorFlag( aDlaDealClaimArcDMO
      .getDlaErrorFlag(  ) );

    updateDlaDealClaimArcDMO.setDlaErrRetryCnt( aDlaDealClaimArcDMO
      .getDlaErrRetryCnt(  ) );

    //
    // Modify the dlaDealClaimArcDMO
    //
    dlaDealClaimArcDAC.modify( updateDlaDealClaimArcDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DlaDealClaimArcDMO returnDlaDealClaimArcDMO = new DlaDealClaimArcDMO(  );

    returnDlaDealClaimArcDMO.setDlaClaimId( updateDlaDealClaimArcDMO
      .getDlaClaimId(  ) );

    returnDlaDealClaimArcDMO = get( returnDlaDealClaimArcDMO );

    return returnDlaDealClaimArcDMO;
  }

  /**
  * Modifies the DlaDealClaimArc object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DlaDealClaimArcDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dlaDealClaimArcDMO object.
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
    // Modify the dlaDealClaimArcDMO
    //
    dlaDealClaimArcDAC.modify( filter );
  }

  /**
   * Deletes the DlaDealClaimArc object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DLADEALCLAIMARC_003
   *     <li>{@link #Base#DLADEALCLAIMARC_000} if the DlaDealClaimArc does not exist.</li>
   *     <li>{@link #Base#DLADEALCLAIMARC_003} if the DlaDealClaimArc is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DleaDealClaimArcDMO DlaDealClaimArc object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dlaDealClaimArcDMO )" );

    thrower.ifParameterMissing( "dlaDealClaimArcDMO", dlaDealClaimArcDMO );

    DlaDealClaimArcDMO updateDlaDealClaimArcDMO = null;

    updateDlaDealClaimArcDMO = get( dlaDealClaimArcDMO );

    // delete self...
    dlaDealClaimArcDAC.delete( dlaDealClaimArcDMO );
  }

  /**
   * Deletes the DlaDealClaimArc object.
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
    dlaDealClaimArcDAC.delete( filter );
  }

  /**
  * Indicates whether a DlaDealClaimArc exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DlaDealClaimArc exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DlaDealClaimArcDMO dlaDealClaimArcDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dlaDealClaimArc)" );

    thrower.ifParameterMissing( "dlaDealClaimArcDMO", dlaDealClaimArcDMO );

    thrower.ifParameterMissing( "dlaDealClaimArcDMO.dlaClaimId",
      dlaDealClaimArcDMO.getDlaClaimId(  ) );

    return dlaDealClaimArcDAC.exists( dlaDealClaimArcDMO );
  }

  /**
   * Indicates whether a DlaDealClaimArc exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DlaDealClaimArc exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dlaDealClaimArcDAC.exists( filter );
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
//  public DTOList<DlaDealClaimArcDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return dlaDealClaimArcDAC.getList( state, filter );
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

    return dlaDealClaimArcDAC.iterate( filter );
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

    return dlaDealClaimArcDAC.iterateWithLock( filter );
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
  public DlaDealClaimArcDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DlaDealClaimArcDMO
    //
    DlaDealClaimArcDMO dlaDealClaimArcDMO = dlaDealClaimArcDAC.get( filter );

    return dlaDealClaimArcDMO;
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

    return dlaDealClaimArcDAC.max( filter );
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

    return dlaDealClaimArcDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(dlaDealClaimArcDAC.count( filter )));
  }
}
