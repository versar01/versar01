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
 * This abstract business logic class holds all the logic for the DchDealerClmHdr class.
 * It is extended by DchDealerClmHdr class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DchDealerClmHdrAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DchDealerClmHdr.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DCHCH";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DchDealerClmHdrDAC dchDealerClmHdrDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dchDealerClmHdrDAC = (DchDealerClmHdrDAC) dac;
  }

  /**
  * Retrieve a dchDealerClmHdr data model object from persistent storage. The
  * dchDealerClmHdrDMO passed in must contain a valid existing dchDealerClmHdrId.
  * Optionally, the return dchDealerClmHdrDMO may be include a flag that indicates if
  * the dchDealerClmHdr object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dchDealerClmHdr object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DCHDEALERCLMHDR_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dchDealerClmHdrDMO the dchDealerClmHdr object that must contain either the
  *         unique dchDealerClmHdrId or the displayCode/languageCode pair
  *
  * @return dchDealerClmHdrDMO the dchDealerClmHdr data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DchDealerClmHdrDMO get( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dchDealerClmHdrDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dchDealerClmHdrDMO", dchDealerClmHdrDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dchDealerClmHdrDMO.dchClaimId",
      dchDealerClmHdrDMO.getDchClaimId(  ) );

    //
    // Attempt to get the DchDealerClmHdrDMO
    //
    DchDealerClmHdrDMO returnDchDealerClmHdrDMO = dchDealerClmHdrDAC.get( dchDealerClmHdrDMO );

    //
    // Could not find the DchDealerClmHdrDMO
    //
    if ( returnDchDealerClmHdrDMO == null ) {
      thrower.business( Base_DCHDEALERCLMHDR_000,
        new Object[] { dchDealerClmHdrDMO.getDchClaimId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDchDealerClmHdrDMO;
  }

  /**
   * Return a list of DchDealerClmHdr objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dchDealerClmHdrs
   * displayCode. If no values have been passed in, all DchDealerClmHdr objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DchDealerClmHdr is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dchDealerClmHdrDMO DchDealerClmHdrDMO object
   *
   * @return DTOList of DchDealerClmHdr objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<DchDealerClmHdrDMO> getList( 
//    DTOListState       state,
//    DchDealerClmHdrDMO dchDealerClmHdrDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, dchDealerClmHdrDMO )" );
//
//    return dchDealerClmHdrDAC.getList( state, dchDealerClmHdrDMO );
//  }

  /**
  * Creates the DchDealerClmHdr object. As a side effect, following creation
  * of a dchDealerClmHdr an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dchDealerClmHdrDMO dchDealerClmHdrDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dchDealerClmHdrDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DchDealerClmHdrDMO create( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "dchDealerClmHdrDMO", dchDealerClmHdrDMO );

    thrower.ifParameterMissing( "dchDealerClmHdrDMO.dchClaimId",
      dchDealerClmHdrDMO.getDchClaimId(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( dchDealerClmHdrDMO ) ) {
      thrower.business( Base_DCHDEALERCLMHDR_001,
        new Object[] { dchDealerClmHdrDMO.getDchClaimId(  ) } );
    }

    //
    // Now create the dchDealerClmHdr
    //
    dchDealerClmHdrDAC.create( dchDealerClmHdrDMO );

    return dchDealerClmHdrDMO;
  }

  /**
  * Modifies the DchDealerClmHdr object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DCHDEALERCLMHDR_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dchDealerClmHdrDMO dchDealerClmHdrDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dchDealerClmHdrDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DchDealerClmHdrDMO modify( DchDealerClmHdrDMO aDchDealerClmHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adchDealerClmHdrDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adchDealerClmHdrDMO", aDchDealerClmHdrDMO );

    thrower.ifParameterMissing( "aDchDealerClmHdrDMO.dchClaimId",
      aDchDealerClmHdrDMO.getDchClaimId(  ) ); // attribute

    DchDealerClmHdrDMO updateDchDealerClmHdrDMO = new DchDealerClmHdrDMO(  );

    updateDchDealerClmHdrDMO.setDchClaimId( aDchDealerClmHdrDMO.getDchClaimId(  ) );

    updateDchDealerClmHdrDMO = get( updateDchDealerClmHdrDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDchDealerClmHdrDMO.setDchActType( aDchDealerClmHdrDMO.getDchActType(  ) );

    updateDchDealerClmHdrDMO.setDchClaimDate( aDchDealerClmHdrDMO
      .getDchClaimDate(  ) );

    updateDchDealerClmHdrDMO.setDchContractDate( aDchDealerClmHdrDMO
      .getDchContractDate(  ) );

    updateDchDealerClmHdrDMO.setDchSubscriberId( aDchDealerClmHdrDMO
      .getDchSubscriberId(  ) );

    updateDchDealerClmHdrDMO.setDchImei1( aDchDealerClmHdrDMO.getDchImei1(  ) );

    updateDchDealerClmHdrDMO.setDchImei2( aDchDealerClmHdrDMO.getDchImei2(  ) );

    updateDchDealerClmHdrDMO.setDchSerial1( aDchDealerClmHdrDMO.getDchSerial1(  ) );

    updateDchDealerClmHdrDMO.setDchSerial2( aDchDealerClmHdrDMO.getDchSerial2(  ) );

    updateDchDealerClmHdrDMO.setDchSerial3( aDchDealerClmHdrDMO.getDchSerial3(  ) );

    updateDchDealerClmHdrDMO.setDchSimNo1( aDchDealerClmHdrDMO.getDchSimNo1(  ) );
    
    updateDchDealerClmHdrDMO.setDchSimNo2( aDchDealerClmHdrDMO.getDchSimNo2(  ) );    
    
    updateDchDealerClmHdrDMO.setDchSimProd1( aDchDealerClmHdrDMO.getDchSimProd1(  ) );
    
    updateDchDealerClmHdrDMO.setDchSimProd2( aDchDealerClmHdrDMO.getDchSimProd2(  ) );    

    updateDchDealerClmHdrDMO.setDchDealerId( aDchDealerClmHdrDMO
      .getDchDealerId(  ) );

    updateDchDealerClmHdrDMO.setDchPackageCode( aDchDealerClmHdrDMO
      .getDchPackageCode(  ) );

    updateDchDealerClmHdrDMO.setDchImei1Amt( aDchDealerClmHdrDMO
      .getDchImei1Amt(  ) );

    updateDchDealerClmHdrDMO.setDchImei2Amt( aDchDealerClmHdrDMO
      .getDchImei2Amt(  ) );

    updateDchDealerClmHdrDMO.setDchSerial1Amt( aDchDealerClmHdrDMO
      .getDchSerial1Amt(  ) );

    updateDchDealerClmHdrDMO.setDchSerial2Amt( aDchDealerClmHdrDMO
      .getDchSerial2Amt(  ) );

    updateDchDealerClmHdrDMO.setDchSerial3Amt( aDchDealerClmHdrDMO
      .getDchSerial3Amt(  ) );

    updateDchDealerClmHdrDMO.setDchSimAmt1( aDchDealerClmHdrDMO.getDchSimAmt1(  ) );
    
    updateDchDealerClmHdrDMO.setDchSimAmt2( aDchDealerClmHdrDMO.getDchSimAmt2(  ) );

    updateDchDealerClmHdrDMO.setDchClmAmt( aDchDealerClmHdrDMO.getDchClmAmt(  ) );

    updateDchDealerClmHdrDMO.setDchSaveDate( aDchDealerClmHdrDMO
      .getDchSaveDate(  ) );

    updateDchDealerClmHdrDMO.setDchUserId( aDchDealerClmHdrDMO.getDchUserId(  ) );

    updateDchDealerClmHdrDMO.setDchErrWarn( aDchDealerClmHdrDMO.getDchErrWarn(  ) );

    updateDchDealerClmHdrDMO.setDchSubmitDate( aDchDealerClmHdrDMO
      .getDchSubmitDate(  ) );

    updateDchDealerClmHdrDMO.setDchErrorFlag( aDchDealerClmHdrDMO
      .getDchErrorFlag(  ) );

    updateDchDealerClmHdrDMO.setDchErrRetryCnt( aDchDealerClmHdrDMO
      .getDchErrRetryCnt(  ) );

    //
    // Modify the dchDealerClmHdrDMO
    //
    dchDealerClmHdrDAC.modify( updateDchDealerClmHdrDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DchDealerClmHdrDMO returnDchDealerClmHdrDMO = new DchDealerClmHdrDMO(  );

    returnDchDealerClmHdrDMO.setDchClaimId( updateDchDealerClmHdrDMO
      .getDchClaimId(  ) );

    returnDchDealerClmHdrDMO = get( returnDchDealerClmHdrDMO );

    return returnDchDealerClmHdrDMO;
  }

  /**
  * Modifies the DchDealerClmHdr object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DchDealerClmHdrDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dchDealerClmHdrDMO object.
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
    // Modify the dchDealerClmHdrDMO
    //
    dchDealerClmHdrDAC.modify( filter );
  }

  /**
   * Deletes the DchDealerClmHdr object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DCHDEALERCLMHDR_003
   *     <li>{@link #Base#DCHDEALERCLMHDR_000} if the DchDealerClmHdr does not exist.</li>
   *     <li>{@link #Base#DCHDEALERCLMHDR_003} if the DchDealerClmHdr is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DchDealerClmHdrDMO DchDealerClmHdr object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dchDealerClmHdrDMO )" );

    thrower.ifParameterMissing( "dchDealerClmHdrDMO", dchDealerClmHdrDMO );

    DchDealerClmHdrDMO updateDchDealerClmHdrDMO = null;

    updateDchDealerClmHdrDMO = get( dchDealerClmHdrDMO );

    // delete self...
    dchDealerClmHdrDAC.delete( dchDealerClmHdrDMO );
  }

  /**
   * Deletes the DchDealerClmHdr object.
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
    dchDealerClmHdrDAC.delete( filter );
  }

  /**
  * Indicates whether a DchDealerClmHdr exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DchDealerClmHdr exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DchDealerClmHdrDMO dchDealerClmHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dchDealerClmHdr)" );

    thrower.ifParameterMissing( "dchDealerClmHdrDMO", dchDealerClmHdrDMO );

    thrower.ifParameterMissing( "dchDealerClmHdrDMO.dchClaimId",
      dchDealerClmHdrDMO.getDchClaimId(  ) );

    return dchDealerClmHdrDAC.exists( dchDealerClmHdrDMO );
  }

  /**
   * Indicates whether a DchDealerClmHdr exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DchDealerClmHdr exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dchDealerClmHdrDAC.exists( filter );
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
//  public DTOList<DchDealerClmHdrDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return dchDealerClmHdrDAC.getList( state, filter );
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

    return dchDealerClmHdrDAC.iterate( filter );
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

    return dchDealerClmHdrDAC.iterateWithLock( filter );
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
  public DchDealerClmHdrDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DchDealerClmHdrDMO
    //
    DchDealerClmHdrDMO dchDealerClmHdrDMO = dchDealerClmHdrDAC.get( filter );

    return dchDealerClmHdrDMO;
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

    return dchDealerClmHdrDAC.max( filter );
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

    return dchDealerClmHdrDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(dchDealerClmHdrDAC.count( filter )));
  }
}
