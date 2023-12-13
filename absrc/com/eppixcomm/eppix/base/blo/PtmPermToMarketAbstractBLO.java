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
 * This abstract business logic class holds all the logic for the PtmPermToMarket class.
 * It is extended by PtmPermToMarket class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PtmPermToMarketAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PtmPermToMarketAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PTMTM";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  public PtmPermToMarketDAC ptmPermToMarketDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  public void setDAC( DAC dac ) {
    this.ptmPermToMarketDAC = (PtmPermToMarketDAC) dac;
  }

  /**
  * Retrieve a ptmPermToMarket data model object from persistent storage. The
  * ptmPermToMarketDMO passed in must contain a valid existing ptmPermToMarketId.
  * Optionally, the return ptmPermToMarketDMO may be include a flag that indicates if
  * the ptmPermToMarket object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the ptmPermToMarket object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PTMPERMTOMARKET_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  ptmPermToMarketDMO the ptmPermToMarket object that must contain either the
  *         unique ptmPermToMarketId or the displayCode/languageCode pair
  *
  * @return ptmPermToMarketDMO the ptmPermToMarket data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PtmPermToMarketDMO get( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(ptmPermToMarketDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "ptmPermToMarketDMO", ptmPermToMarketDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "ptmPermToMarketDMO.ptmBillAcNo",
      ptmPermToMarketDMO.getPtmBillAcNo(  ) );

    //
    // Attempt to get the PtmPermToMarketDMO
    //
    PtmPermToMarketDMO returnPtmPermToMarketDMO = ptmPermToMarketDAC.get( ptmPermToMarketDMO );

    //
    // Could not find the PtmPermToMarketDMO
    //
    if ( returnPtmPermToMarketDMO == null ) {
      thrower.business( Base_PTMPERMTOMARKET_000,
        new Object[] { ptmPermToMarketDMO.getPtmBillAcNo(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPtmPermToMarketDMO;
  }

  /**
   * Return a list of PtmPermToMarket objects matching the passed in values. A
   * partial match is performed on the description argument and/or the ptmPermToMarkets
   * displayCode. If no values have been passed in, all PtmPermToMarket objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PtmPermToMarket is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param ptmPermToMarketDMO PtmPermToMarketDMO object
   *
   * @return DTOList of PtmPermToMarket objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<PtmPermToMarketDMO> getList( 
//    DTOListState       state,
//    PtmPermToMarketDMO ptmPermToMarketDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, ptmPermToMarketDMO )" );
//
//    return ptmPermToMarketDAC.getList( state, ptmPermToMarketDMO );
//  }

  /**
  * Creates the PtmPermToMarket object. As a side effect, following creation
  * of a ptmPermToMarket an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ptmPermToMarketDMO ptmPermToMarketDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ptmPermToMarketDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PtmPermToMarketDMO create( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( ptmPermToMarketDMO )" );

    thrower.ifParameterMissing( "ptmPermToMarketDMO", ptmPermToMarketDMO );

    thrower.ifParameterMissing( "ptmPermToMarketDMO.ptmBillAcNo",
      ptmPermToMarketDMO.getPtmBillAcNo(  ) );

    thrower.ifParameterMissing( "ptmPermToMarketDMO.ptmInd",
      ptmPermToMarketDMO.getPtmInd(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( ptmPermToMarketDMO ) ) {
      thrower.business( Base_PTMPERMTOMARKET_001,
        new Object[] { ptmPermToMarketDMO.getPtmBillAcNo(  ) } );
    }

    //
    // Now create the ptmPermToMarket
    //
    ptmPermToMarketDAC.create( ptmPermToMarketDMO );

    return ptmPermToMarketDMO;
  }

  /**
  * Modifies the PtmPermToMarket object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PTMPERMTOMARKET_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ptmPermToMarketDMO ptmPermToMarketDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ptmPermToMarketDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PtmPermToMarketDMO modify( PtmPermToMarketDMO aPtmPermToMarketDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aptmPermToMarketDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aptmPermToMarketDMO", aPtmPermToMarketDMO );

    thrower.ifParameterMissing( "aPtmPermToMarketDMO.ptmBillAcNo",
      aPtmPermToMarketDMO.getPtmBillAcNo(  ) ); // attribute

    thrower.ifParameterMissing( "aPtmPermToMarketDMO.ptmInd",
      aPtmPermToMarketDMO.getPtmInd(  ) ); // attribute

    PtmPermToMarketDMO updatePtmPermToMarketDMO = new PtmPermToMarketDMO(  );

    updatePtmPermToMarketDMO.setPtmBillAcNo( aPtmPermToMarketDMO
      .getPtmBillAcNo(  ) );

    updatePtmPermToMarketDMO = get( updatePtmPermToMarketDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updatePtmPermToMarketDMO.setPtmInd( aPtmPermToMarketDMO.getPtmInd(  ) );

    updatePtmPermToMarketDMO.setPtmTitle( aPtmPermToMarketDMO.getPtmTitle(  ) );

    updatePtmPermToMarketDMO.setPtmSurname( aPtmPermToMarketDMO.getPtmSurname(  ) );

    updatePtmPermToMarketDMO.setPtmFirstname( aPtmPermToMarketDMO
      .getPtmFirstname(  ) );

    updatePtmPermToMarketDMO.setPtmPrefComms( aPtmPermToMarketDMO
      .getPtmPrefComms(  ) );

    updatePtmPermToMarketDMO.setPtmAudId( aPtmPermToMarketDMO.getPtmAudId(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis1( aPtmPermToMarketDMO
      .getPtmAnalysis1(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis2( aPtmPermToMarketDMO
      .getPtmAnalysis2(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis3( aPtmPermToMarketDMO
      .getPtmAnalysis3(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis4( aPtmPermToMarketDMO
      .getPtmAnalysis4(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis5( aPtmPermToMarketDMO
      .getPtmAnalysis5(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis6( aPtmPermToMarketDMO
      .getPtmAnalysis6(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis7( aPtmPermToMarketDMO
      .getPtmAnalysis7(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis8( aPtmPermToMarketDMO
      .getPtmAnalysis8(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis9( aPtmPermToMarketDMO
      .getPtmAnalysis9(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis10( aPtmPermToMarketDMO
      .getPtmAnalysis10(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis11( aPtmPermToMarketDMO
      .getPtmAnalysis11(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis12( aPtmPermToMarketDMO
      .getPtmAnalysis12(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis13( aPtmPermToMarketDMO
      .getPtmAnalysis13(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis14( aPtmPermToMarketDMO
      .getPtmAnalysis14(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis15( aPtmPermToMarketDMO
      .getPtmAnalysis15(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis16( aPtmPermToMarketDMO
      .getPtmAnalysis16(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis17( aPtmPermToMarketDMO
      .getPtmAnalysis17(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis18( aPtmPermToMarketDMO
      .getPtmAnalysis18(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis19( aPtmPermToMarketDMO
      .getPtmAnalysis19(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis20( aPtmPermToMarketDMO
      .getPtmAnalysis20(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis21( aPtmPermToMarketDMO
      .getPtmAnalysis21(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis22( aPtmPermToMarketDMO
      .getPtmAnalysis22(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis23( aPtmPermToMarketDMO
      .getPtmAnalysis23(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis24( aPtmPermToMarketDMO
      .getPtmAnalysis24(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis25( aPtmPermToMarketDMO
      .getPtmAnalysis25(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis26( aPtmPermToMarketDMO
      .getPtmAnalysis26(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis27( aPtmPermToMarketDMO
      .getPtmAnalysis27(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis28( aPtmPermToMarketDMO
      .getPtmAnalysis28(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis29( aPtmPermToMarketDMO
      .getPtmAnalysis29(  ) );

    updatePtmPermToMarketDMO.setPtmAnalysis30( aPtmPermToMarketDMO
      .getPtmAnalysis30(  ) );

    //
    // Modify the ptmPermToMarketDMO
    //
    ptmPermToMarketDAC.modify( updatePtmPermToMarketDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PtmPermToMarketDMO returnPtmPermToMarketDMO = new PtmPermToMarketDMO(  );

    returnPtmPermToMarketDMO.setPtmBillAcNo( updatePtmPermToMarketDMO
      .getPtmBillAcNo(  ) );

    returnPtmPermToMarketDMO = get( returnPtmPermToMarketDMO );

    return returnPtmPermToMarketDMO;
  }

  /**
  * Modifies the PtmPermToMarket object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PtmPermToMarketDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ptmPermToMarketDMO object.
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
    // Modify the ptmPermToMarketDMO
    //
    ptmPermToMarketDAC.modify( filter );
  }

  /**
   * Deletes the PtmPermToMarket object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PTMPERMTOMARKET_003
   *     <li>{@link #Base#PTMPERMTOMARKET_000} if the PtmPermToMarket does not exist.</li>
   *     <li>{@link #Base#PTMPERMTOMARKET_003} if the PtmPermToMarket is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PtmPermToMarketDMO PtmPermToMarket object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( ptmPermToMarketDMO )" );

    thrower.ifParameterMissing( "ptmPermToMarketDMO", ptmPermToMarketDMO );

    PtmPermToMarketDMO updatePtmPermToMarketDMO = null;

    updatePtmPermToMarketDMO = get( ptmPermToMarketDMO );

    // delete self...
    ptmPermToMarketDAC.delete( ptmPermToMarketDMO );
  }

  /**
   * Deletes the PtmPermToMarket object.
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
    ptmPermToMarketDAC.delete( filter );
  }

  /**
  * Indicates whether a PtmPermToMarket exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PtmPermToMarket exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PtmPermToMarketDMO ptmPermToMarketDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(ptmPermToMarket)" );

    thrower.ifParameterMissing( "ptmPermToMarketDMO", ptmPermToMarketDMO );

    thrower.ifParameterMissing( "ptmPermToMarketDMO.ptmBillAcNo",
      ptmPermToMarketDMO.getPtmBillAcNo(  ) );

    return ptmPermToMarketDAC.exists( ptmPermToMarketDMO );
  }

  /**
   * Indicates whether a PtmPermToMarket exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PtmPermToMarket exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return ptmPermToMarketDAC.exists( filter );
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
//  public DTOList<PtmPermToMarketDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return ptmPermToMarketDAC.getList( state, filter );
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

    return ptmPermToMarketDAC.iterate( filter );
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

    return ptmPermToMarketDAC.iterateWithLock( filter );
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
  public PtmPermToMarketDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PtmPermToMarketDMO
    //
    PtmPermToMarketDMO ptmPermToMarketDMO = ptmPermToMarketDAC.get( filter );

    return ptmPermToMarketDMO;
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

    return ptmPermToMarketDAC.max( filter );
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

    return ptmPermToMarketDAC.min( filter );
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

    return Integer.valueOf(ptmPermToMarketDAC.count( filter ));
  }
}
