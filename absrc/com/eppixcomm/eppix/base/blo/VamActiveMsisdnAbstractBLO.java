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
 * One entry for each msisdn taken by the subscriber.
 * <p>
 *   Shows the sim that the number applies to.
 
 Many of the fields are the same as on ACTIVE. On active they relate to the
 *   subscription or the primary msisdn. Here they relate to the particular msisdn in question.
 
 As with active table
 *   these records are retained once they reach \\\'permanent deactivation\\\' status. They are then deleted once a certain
 *   amount of time has passed. The amount of time is defined by system key ASWAIT&lt;network&gt; where network is D1, D2,
 *   etc.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VamActiveMsisdn class.
 * It is extended by VamActiveMsisdn class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VamActiveMsisdnAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VamActiveMsisdn.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VAMM";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VamActiveMsisdnDAC vamActiveMsisdnDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vamActiveMsisdnDAC = (VamActiveMsisdnDAC) dac;
  }

  /**
  * Retrieve a vamActiveMsisdn data model object from persistent storage. The
  * vamActiveMsisdnDMO passed in must contain a valid existing vamActiveMsisdnId.
  * Optionally, the return vamActiveMsisdnDMO may be include a flag that indicates if
  * the vamActiveMsisdn object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vamActiveMsisdn object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VAMACTIVEMSISDN_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vamActiveMsisdnDMO the vamActiveMsisdn object that must contain either the
  *         unique vamActiveMsisdnId or the displayCode/languageCode pair
  *
  * @return vamActiveMsisdnDMO the vamActiveMsisdn data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VamActiveMsisdnDMO get( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vamActiveMsisdnDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vamActiveMsisdnDMO", vamActiveMsisdnDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamMsisdnNo",
      vamActiveMsisdnDMO.getVamMsisdnNo(  ) );

    //
    // Attempt to get the VamActiveMsisdnDMO
    //
    VamActiveMsisdnDMO returnVamActiveMsisdnDMO = vamActiveMsisdnDAC.get( vamActiveMsisdnDMO );

    //
    // Could not find the VamActiveMsisdnDMO
    //
    if ( returnVamActiveMsisdnDMO == null ) {
      thrower.business( Base_VAMACTIVEMSISDN_000,
        new Object[] { vamActiveMsisdnDMO.getVamMsisdnNo(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVamActiveMsisdnDMO;
  }

  /**
   * Return a list of VamActiveMsisdn objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vamActiveMsisdns
   * displayCode. If no values have been passed in, all VamActiveMsisdn objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VamActiveMsisdn is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vamActiveMsisdnDMO VamActiveMsisdnDMO object
   *
   * @return DTOList of VamActiveMsisdn objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vamActiveMsisdnDMO )" );

    return vamActiveMsisdnDAC.getList( state, vamActiveMsisdnDMO );
  }

  /**
  * Creates the VamActiveMsisdn object. As a side effect, following creation
  * of a vamActiveMsisdn an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vamActiveMsisdnDMO vamActiveMsisdnDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vamActiveMsisdnDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VamActiveMsisdnDMO create( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO", vamActiveMsisdnDMO );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamSubscriberId",
      vamActiveMsisdnDMO.getVamSubscriberId(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamSimNo",
      vamActiveMsisdnDMO.getVamSimNo(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamMsisdnNo",
      vamActiveMsisdnDMO.getVamMsisdnNo(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamTwinbillNo",
      vamActiveMsisdnDMO.getVamTwinbillNo(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamStatCode",
      vamActiveMsisdnDMO.getVamStatCode(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamConnectDate",
      vamActiveMsisdnDMO.getVamConnectDate(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamDirEntry",
      vamActiveMsisdnDMO.getVamDirEntry(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamItemised",
      vamActiveMsisdnDMO.getVamItemised(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamAbarDate",
      vamActiveMsisdnDMO.getVamAbarDate(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamPrFlag",
      vamActiveMsisdnDMO.getVamPrFlag(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamHierarchy",
      vamActiveMsisdnDMO.getVamHierarchy(  ) );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamMsisdnKnown",
      vamActiveMsisdnDMO.getVamMsisdnKnown(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vamActiveMsisdnDMO ) ) {
      thrower.business( Base_VAMACTIVEMSISDN_001,
        new Object[] { vamActiveMsisdnDMO.getVamMsisdnNo(  ) } );
    }

    //
    // Now create the vamActiveMsisdn
    //
    vamActiveMsisdnDAC.create( vamActiveMsisdnDMO );

    return vamActiveMsisdnDMO;
  }

  /**
  * Modifies the VamActiveMsisdn object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VAMACTIVEMSISDN_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vamActiveMsisdnDMO vamActiveMsisdnDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vamActiveMsisdnDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VamActiveMsisdnDMO modify( VamActiveMsisdnDMO aVamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avamActiveMsisdnDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avamActiveMsisdnDMO", aVamActiveMsisdnDMO );

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamSubscriberId",
      aVamActiveMsisdnDMO.getVamSubscriberId(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamSimNo",
      aVamActiveMsisdnDMO.getVamSimNo(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamMsisdnNo",
      aVamActiveMsisdnDMO.getVamMsisdnNo(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamTwinbillNo",
      aVamActiveMsisdnDMO.getVamTwinbillNo(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamStatCode",
      aVamActiveMsisdnDMO.getVamStatCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamConnectDate",
      aVamActiveMsisdnDMO.getVamConnectDate(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamDirEntry",
      aVamActiveMsisdnDMO.getVamDirEntry(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamItemised",
      aVamActiveMsisdnDMO.getVamItemised(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamAbarDate",
      aVamActiveMsisdnDMO.getVamAbarDate(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamPrFlag",
      aVamActiveMsisdnDMO.getVamPrFlag(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamHierarchy",
      aVamActiveMsisdnDMO.getVamHierarchy(  ) ); // attribute

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO.vamMsisdnKnown",
      aVamActiveMsisdnDMO.getVamMsisdnKnown(  ) ); // attribute

    VamActiveMsisdnDMO updateVamActiveMsisdnDMO = new VamActiveMsisdnDMO(  );

    updateVamActiveMsisdnDMO.setVamMsisdnNo( aVamActiveMsisdnDMO
      .getVamMsisdnNo(  ) );

    updateVamActiveMsisdnDMO = get( updateVamActiveMsisdnDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVamActiveMsisdnDMO.setVamSubscriberId( aVamActiveMsisdnDMO
      .getVamSubscriberId(  ) );

    updateVamActiveMsisdnDMO.setVamSimNo( aVamActiveMsisdnDMO.getVamSimNo(  ) );

    updateVamActiveMsisdnDMO.setVamTwinbillNo( aVamActiveMsisdnDMO
      .getVamTwinbillNo(  ) );

    updateVamActiveMsisdnDMO.setVamStatCode( aVamActiveMsisdnDMO
      .getVamStatCode(  ) );

    updateVamActiveMsisdnDMO.setVamConnectDate( aVamActiveMsisdnDMO
      .getVamConnectDate(  ) );

    updateVamActiveMsisdnDMO.setVamDconnectDate( aVamActiveMsisdnDMO
      .getVamDconnectDate(  ) );

    updateVamActiveMsisdnDMO.setVamInternTariff( aVamActiveMsisdnDMO
      .getVamInternTariff(  ) );

    updateVamActiveMsisdnDMO.setVamContrTerminat( aVamActiveMsisdnDMO
      .getVamContrTerminat(  ) );

    updateVamActiveMsisdnDMO.setVamContrPeriod( aVamActiveMsisdnDMO
      .getVamContrPeriod(  ) );

    updateVamActiveMsisdnDMO.setVamTerminatNotif( aVamActiveMsisdnDMO
      .getVamTerminatNotif(  ) );

    updateVamActiveMsisdnDMO.setVamDirEntry( aVamActiveMsisdnDMO
      .getVamDirEntry(  ) );

    updateVamActiveMsisdnDMO.setVamItemised( aVamActiveMsisdnDMO
      .getVamItemised(  ) );

    updateVamActiveMsisdnDMO.setVamDepartment( aVamActiveMsisdnDMO
      .getVamDepartment(  ) );

    updateVamActiveMsisdnDMO.setVamSalesman( aVamActiveMsisdnDMO
      .getVamSalesman(  ) );

    updateVamActiveMsisdnDMO.setVamDealerId( aVamActiveMsisdnDMO
      .getVamDealerId(  ) );

    updateVamActiveMsisdnDMO.setVamAbarDate( aVamActiveMsisdnDMO
      .getVamAbarDate(  ) );

    updateVamActiveMsisdnDMO.setVamSubsSuffix( aVamActiveMsisdnDMO
      .getVamSubsSuffix(  ) );

    updateVamActiveMsisdnDMO.setVamMessComment( aVamActiveMsisdnDMO
      .getVamMessComment(  ) );

    updateVamActiveMsisdnDMO.setVamAirtimeNet( aVamActiveMsisdnDMO
      .getVamAirtimeNet(  ) );

    updateVamActiveMsisdnDMO.setVamPrFlag( aVamActiveMsisdnDMO.getVamPrFlag(  ) );

    updateVamActiveMsisdnDMO.setVamHierarchy( aVamActiveMsisdnDMO
      .getVamHierarchy(  ) );

    updateVamActiveMsisdnDMO.setVamMsisdnKnown( aVamActiveMsisdnDMO
      .getVamMsisdnKnown(  ) );

    updateVamActiveMsisdnDMO.setVamTariffChg( aVamActiveMsisdnDMO
      .getVamTariffChg(  ) );
    
    // Added by Sarel 16/03/2009
    updateVamActiveMsisdnDMO.setVamOrigProvId( aVamActiveMsisdnDMO.getVamOrigProvId());
    updateVamActiveMsisdnDMO.setVamImpProvId( aVamActiveMsisdnDMO.getVamImpProvId());
    updateVamActiveMsisdnDMO.setVamOrigServProv( aVamActiveMsisdnDMO.getVamOrigServProv());
    updateVamActiveMsisdnDMO.setVamImpServProv( aVamActiveMsisdnDMO.getVamImpServProv());
    updateVamActiveMsisdnDMO.setVamMsisdnType( aVamActiveMsisdnDMO.getVamMsisdnType());
    updateVamActiveMsisdnDMO.setVamDummy( aVamActiveMsisdnDMO.getVamDummy());
    updateVamActiveMsisdnDMO.setVamMsisdnExprtd( aVamActiveMsisdnDMO.getVamMsisdnExprtd());
    updateVamActiveMsisdnDMO.setVamExportedTo( aVamActiveMsisdnDMO.getVamExportedTo());
    updateVamActiveMsisdnDMO.setVamAnalysis1( aVamActiveMsisdnDMO.getVamAnalysis1());
    updateVamActiveMsisdnDMO.setVamAnalysis2( aVamActiveMsisdnDMO.getVamAnalysis2());
    updateVamActiveMsisdnDMO.setVamAnalysis3( aVamActiveMsisdnDMO.getVamAnalysis3());
    updateVamActiveMsisdnDMO.setVamAnalysis4( aVamActiveMsisdnDMO.getVamAnalysis4());
    updateVamActiveMsisdnDMO.setVamAnalysis5(aVamActiveMsisdnDMO.getVamAnalysis5());

    //
    // Modify the vamActiveMsisdnDMO
    //
    vamActiveMsisdnDAC.modify( updateVamActiveMsisdnDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VamActiveMsisdnDMO returnVamActiveMsisdnDMO = new VamActiveMsisdnDMO(  );

    returnVamActiveMsisdnDMO.setVamMsisdnNo( updateVamActiveMsisdnDMO
      .getVamMsisdnNo(  ) );

    returnVamActiveMsisdnDMO = get( returnVamActiveMsisdnDMO );

    return returnVamActiveMsisdnDMO;
  }

  /**
  * Modifies the VamActiveMsisdn object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VamActiveMsisdnDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vamActiveMsisdnDMO object.
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
    // Modify the vamActiveMsisdnDMO
    //
    vamActiveMsisdnDAC.modify( filter );
  }

  /**
   * Deletes the VamActiveMsisdn object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VAMACTIVEMSISDN_003
   *     <li>{@link #Base#VAMACTIVEMSISDN_000} if the VamActiveMsisdn does not exist.</li>
   *     <li>{@link #Base#VAMACTIVEMSISDN_003} if the VamActiveMsisdn is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VamActiveMsisdnDMO VamActiveMsisdn object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO", vamActiveMsisdnDMO );

    VamActiveMsisdnDMO updateVamActiveMsisdnDMO = null;

    updateVamActiveMsisdnDMO = get( vamActiveMsisdnDMO );

    // delete self...
    vamActiveMsisdnDAC.delete( vamActiveMsisdnDMO );
  }

  /**
   * Deletes the VamActiveMsisdn object.
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
    vamActiveMsisdnDAC.delete( filter );
  }

  /**
  * Indicates whether a VamActiveMsisdn exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VamActiveMsisdn exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vamActiveMsisdn)" );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO", vamActiveMsisdnDMO );

    thrower.ifParameterMissing( "vamActiveMsisdnDMO.vamMsisdnNo",
      vamActiveMsisdnDMO.getVamMsisdnNo(  ) );

    return vamActiveMsisdnDAC.exists( vamActiveMsisdnDMO );
  }

  /**
   * Indicates whether a VamActiveMsisdn exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VamActiveMsisdn exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vamActiveMsisdnDAC.exists( filter );
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

    return vamActiveMsisdnDAC.getList( state, filter );
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

    return vamActiveMsisdnDAC.iterate( filter );
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

    return vamActiveMsisdnDAC.iterateWithLock( filter );
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
  public VamActiveMsisdnDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VamActiveMsisdnDMO
    //
    VamActiveMsisdnDMO vamActiveMsisdnDMO = vamActiveMsisdnDAC.get( filter );

    return vamActiveMsisdnDMO;
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

    return vamActiveMsisdnDAC.max( filter );
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

    return vamActiveMsisdnDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(vamActiveMsisdnDAC.count( filter )));
  }
}
