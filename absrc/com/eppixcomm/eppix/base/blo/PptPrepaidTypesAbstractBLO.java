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
 * Holds details of Types of PrePaid SIMs
 *
 * This abstract business logic class holds all the logic for the PptPrepaidTypes class.
 * It is extended by PptPrepaidTypes class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PptPrepaidTypesAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PptPrepaidTypes.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PPTT";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected PptPrepaidTypesDAC pptPrepaidTypesDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return PptPrepaidTypesDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.pptPrepaidTypesDAC = (PptPrepaidTypesDAC) dac;
  }

  /**
  * Retrieve a pptPrepaidTypes data model object from persistent storage. The
  * pptPrepaidTypesDMO passed in must contain a valid existing pptPrepaidTypesId.
  * Optionally, the return pptPrepaidTypesDMO may be include a flag that indicates if
  * the pptPrepaidTypes object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the pptPrepaidTypes object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PPTPREPAIDTYPES_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  pptPrepaidTypesDMO the pptPrepaidTypes object that must contain either the
  *         unique pptPrepaidTypesId or the displayCode/languageCode pair
  *
  * @return pptPrepaidTypesDMO the pptPrepaidTypes data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PptPrepaidTypesDMO get( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(pptPrepaidTypesDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "pptPrepaidTypesDMO", pptPrepaidTypesDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptType",
      pptPrepaidTypesDMO.getPptType(  ) );

    //
    // Attempt to get the PptPrepaidTypesDMO
    //
    PptPrepaidTypesDMO returnPptPrepaidTypesDMO = pptPrepaidTypesDAC.get( pptPrepaidTypesDMO );

    //
    // Could not find the PptPrepaidTypesDMO
    //
    if ( returnPptPrepaidTypesDMO == null ) {
      thrower.business( Base_PPTPREPAIDTYPES_000,
        new Object[] { pptPrepaidTypesDMO.getPptType(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPptPrepaidTypesDMO;
  }

  /**
   * Return a list of PptPrepaidTypes objects matching the passed in values. A
   * partial match is performed on the description argument and/or the pptPrepaidTypess
   * displayCode. If no values have been passed in, all PptPrepaidTypes objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PptPrepaidTypes is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param pptPrepaidTypesDMO PptPrepaidTypesDMO object
   *
   * @return DTOList of PptPrepaidTypes objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, pptPrepaidTypesDMO )" );

    return pptPrepaidTypesDAC.getList( state, pptPrepaidTypesDMO );
  }

  /**
  * Creates the PptPrepaidTypes object. As a side effect, following creation
  * of a pptPrepaidTypes an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pptPrepaidTypesDMO pptPrepaidTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pptPrepaidTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PptPrepaidTypesDMO create( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( pptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO", pptPrepaidTypesDMO );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptType",
      pptPrepaidTypesDMO.getPptType(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptDescription",
      pptPrepaidTypesDMO.getPptDescription(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptCredit",
      pptPrepaidTypesDMO.getPptCredit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptValidity",
      pptPrepaidTypesDMO.getPptValidity(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptValidityUnit",
      pptPrepaidTypesDMO.getPptValidityUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptActivity",
      pptPrepaidTypesDMO.getPptActivity(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptActivityUnit",
      pptPrepaidTypesDMO.getPptActivityUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptRecharge",
      pptPrepaidTypesDMO.getPptRecharge(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptRechargeUnit",
      pptPrepaidTypesDMO.getPptRechargeUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptCreditWarn",
      pptPrepaidTypesDMO.getPptCreditWarn(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptValidityWarn",
      pptPrepaidTypesDMO.getPptValidityWarn(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptValwarnUnit",
      pptPrepaidTypesDMO.getPptValwarnUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptActivityWarn",
      pptPrepaidTypesDMO.getPptActivityWarn(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptActwarnUnit",
      pptPrepaidTypesDMO.getPptActwarnUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptRechargeWarn",
      pptPrepaidTypesDMO.getPptRechargeWarn(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptRechwarnUnit",
      pptPrepaidTypesDMO.getPptRechwarnUnit(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptDefPackage",
      pptPrepaidTypesDMO.getPptDefPackage(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptDefTariff",
      pptPrepaidTypesDMO.getPptDefTariff(  ) );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptChangeDef",
      pptPrepaidTypesDMO.getPptChangeDef(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( pptPrepaidTypesDMO ) ) {
      thrower.business( Base_PPTPREPAIDTYPES_001,
        new Object[] { pptPrepaidTypesDMO.getPptType(  ) } );
    }

    //
    // Now create the pptPrepaidTypes
    //
    pptPrepaidTypesDAC.create( pptPrepaidTypesDMO );

    return pptPrepaidTypesDMO;
  }

  /**
  * Modifies the PptPrepaidTypes object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PPTPREPAIDTYPES_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pptPrepaidTypesDMO pptPrepaidTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pptPrepaidTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PptPrepaidTypesDMO modify( PptPrepaidTypesDMO aPptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( apptPrepaidTypesDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "apptPrepaidTypesDMO", aPptPrepaidTypesDMO );

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptType",
      aPptPrepaidTypesDMO.getPptType(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptDescription",
      aPptPrepaidTypesDMO.getPptDescription(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptCredit",
      aPptPrepaidTypesDMO.getPptCredit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptValidity",
      aPptPrepaidTypesDMO.getPptValidity(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptValidityUnit",
      aPptPrepaidTypesDMO.getPptValidityUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptActivity",
      aPptPrepaidTypesDMO.getPptActivity(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptActivityUnit",
      aPptPrepaidTypesDMO.getPptActivityUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptRecharge",
      aPptPrepaidTypesDMO.getPptRecharge(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptRechargeUnit",
      aPptPrepaidTypesDMO.getPptRechargeUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptCreditWarn",
      aPptPrepaidTypesDMO.getPptCreditWarn(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptValidityWarn",
      aPptPrepaidTypesDMO.getPptValidityWarn(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptValwarnUnit",
      aPptPrepaidTypesDMO.getPptValwarnUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptActivityWarn",
      aPptPrepaidTypesDMO.getPptActivityWarn(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptActwarnUnit",
      aPptPrepaidTypesDMO.getPptActwarnUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptRechargeWarn",
      aPptPrepaidTypesDMO.getPptRechargeWarn(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptRechwarnUnit",
      aPptPrepaidTypesDMO.getPptRechwarnUnit(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptDefPackage",
      aPptPrepaidTypesDMO.getPptDefPackage(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptDefTariff",
      aPptPrepaidTypesDMO.getPptDefTariff(  ) ); // attribute

    thrower.ifParameterMissing( "aPptPrepaidTypesDMO.pptChangeDef",
      aPptPrepaidTypesDMO.getPptChangeDef(  ) ); // attribute

    PptPrepaidTypesDMO updatePptPrepaidTypesDMO = new PptPrepaidTypesDMO(  );

    updatePptPrepaidTypesDMO.setPptType( aPptPrepaidTypesDMO.getPptType(  ) );

    updatePptPrepaidTypesDMO = get( updatePptPrepaidTypesDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updatePptPrepaidTypesDMO.setPptDescription( aPptPrepaidTypesDMO
      .getPptDescription(  ) );

    updatePptPrepaidTypesDMO.setPptCredit( aPptPrepaidTypesDMO.getPptCredit(  ) );

    updatePptPrepaidTypesDMO.setPptValidity( aPptPrepaidTypesDMO
      .getPptValidity(  ) );

    updatePptPrepaidTypesDMO.setPptValidityUnit( aPptPrepaidTypesDMO
      .getPptValidityUnit(  ) );

    updatePptPrepaidTypesDMO.setPptActivity( aPptPrepaidTypesDMO
      .getPptActivity(  ) );

    updatePptPrepaidTypesDMO.setPptActivityUnit( aPptPrepaidTypesDMO
      .getPptActivityUnit(  ) );

    updatePptPrepaidTypesDMO.setPptRecharge( aPptPrepaidTypesDMO
      .getPptRecharge(  ) );

    updatePptPrepaidTypesDMO.setPptRechargeUnit( aPptPrepaidTypesDMO
      .getPptRechargeUnit(  ) );

    updatePptPrepaidTypesDMO.setPptCreditWarn( aPptPrepaidTypesDMO
      .getPptCreditWarn(  ) );

    updatePptPrepaidTypesDMO.setPptValidityWarn( aPptPrepaidTypesDMO
      .getPptValidityWarn(  ) );

    updatePptPrepaidTypesDMO.setPptValwarnUnit( aPptPrepaidTypesDMO
      .getPptValwarnUnit(  ) );

    updatePptPrepaidTypesDMO.setPptActivityWarn( aPptPrepaidTypesDMO
      .getPptActivityWarn(  ) );

    updatePptPrepaidTypesDMO.setPptActwarnUnit( aPptPrepaidTypesDMO
      .getPptActwarnUnit(  ) );

    updatePptPrepaidTypesDMO.setPptRechargeWarn( aPptPrepaidTypesDMO
      .getPptRechargeWarn(  ) );

    updatePptPrepaidTypesDMO.setPptRechwarnUnit( aPptPrepaidTypesDMO
      .getPptRechwarnUnit(  ) );

    updatePptPrepaidTypesDMO.setPptDefPackage( aPptPrepaidTypesDMO
      .getPptDefPackage(  ) );

    updatePptPrepaidTypesDMO.setPptDefTariff( aPptPrepaidTypesDMO
      .getPptDefTariff(  ) );

    updatePptPrepaidTypesDMO.setPptChangeDef( aPptPrepaidTypesDMO
      .getPptChangeDef(  ) );

//    updatePptPrepaidTypesDMO.setPptProfile( aPptPrepaidTypesDMO.getPptProfile(  ) );

    //
    // Modify the pptPrepaidTypesDMO
    //
    pptPrepaidTypesDAC.modify( updatePptPrepaidTypesDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PptPrepaidTypesDMO returnPptPrepaidTypesDMO = new PptPrepaidTypesDMO(  );

    returnPptPrepaidTypesDMO.setPptType( updatePptPrepaidTypesDMO.getPptType(  ) );

    returnPptPrepaidTypesDMO = get( returnPptPrepaidTypesDMO );

    return returnPptPrepaidTypesDMO;
  }

  /**
  * Modifies the PptPrepaidTypes object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PptPrepaidTypesDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pptPrepaidTypesDMO object.
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
    // Modify the pptPrepaidTypesDMO
    //
    pptPrepaidTypesDAC.modify( filter );
  }

  /**
   * Deletes the PptPrepaidTypes object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PPTPREPAIDTYPES_003
   *     <li>{@link #Base#PPTPREPAIDTYPES_000} if the PptPrepaidTypes does not exist.</li>
   *     <li>{@link #Base#PPTPREPAIDTYPES_003} if the PptPrepaidTypes is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PptPrepaidTypesDMO PptPrepaidTypes object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( pptPrepaidTypesDMO )" );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO", pptPrepaidTypesDMO );

    PptPrepaidTypesDMO updatePptPrepaidTypesDMO = null;

    updatePptPrepaidTypesDMO = get( pptPrepaidTypesDMO );

    // delete self...
    pptPrepaidTypesDAC.delete( pptPrepaidTypesDMO );
  }

  /**
   * Deletes the PptPrepaidTypes object.
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
    pptPrepaidTypesDAC.delete( filter );
  }

  /**
  * Indicates whether a PptPrepaidTypes exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PptPrepaidTypes exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PptPrepaidTypesDMO pptPrepaidTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(pptPrepaidTypes)" );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO", pptPrepaidTypesDMO );

    thrower.ifParameterMissing( "pptPrepaidTypesDMO.pptType",
      pptPrepaidTypesDMO.getPptType(  ) );

    return pptPrepaidTypesDAC.exists( pptPrepaidTypesDMO );
  }

  /**
   * Indicates whether a PptPrepaidTypes exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PptPrepaidTypes exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return pptPrepaidTypesDAC.exists( filter );
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

    return pptPrepaidTypesDAC.getList( state, filter );
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

    return pptPrepaidTypesDAC.iterate( filter );
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

    return pptPrepaidTypesDAC.iterateWithLock( filter );
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
  public PptPrepaidTypesDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PptPrepaidTypesDMO
    //
    PptPrepaidTypesDMO pptPrepaidTypesDMO = pptPrepaidTypesDAC.get( filter );

    return pptPrepaidTypesDMO;
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

    return pptPrepaidTypesDAC.max( filter );
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

    return pptPrepaidTypesDAC.min( filter );
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

    return new Integer(pptPrepaidTypesDAC.count( filter ));
  }
}
