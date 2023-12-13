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
 * Each entry defines a service (like voice mail or itemised invoice).
 * <p>
 *   These are grouped under packages (see PACKAGE_SERVICE). Note that there is a mandatory 1 to 1 relationship with
 *   vsr2_service_aux. These tables are to be merged in a later phase.
 * </p>
 * <p>
 *   See the vst_service_type section for details of how to set up the data.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VsrService class.
 * It is extended by VsrService class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VsrServiceAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VsrService.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VSR";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VsrServiceDAC vsrServiceDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VsrServiceDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vsrServiceDAC = (VsrServiceDAC) dac;
  }

  /**
  * Retrieve a vsrService data model object from persistent storage. The
  * vsrServiceDMO passed in must contain a valid existing vsrServiceId.
  * Optionally, the return vsrServiceDMO may be include a flag that indicates if
  * the vsrService object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vsrService object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSRSERVICE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vsrServiceDMO the vsrService object that must contain either the
  *         unique vsrServiceId or the displayCode/languageCode pair
  *
  * @return vsrServiceDMO the vsrService data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VsrServiceDMO get( VsrServiceDMO vsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vsrServiceDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vsrServiceDMO", vsrServiceDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceCode",
      vsrServiceDMO.getVsrServiceCode(  ) );

    //
    // Attempt to get the VsrServiceDMO
    //
    VsrServiceDMO returnVsrServiceDMO = vsrServiceDAC.get( vsrServiceDMO );

    //
    // Could not find the VsrServiceDMO
    //
    if ( returnVsrServiceDMO == null ) {
      thrower.business( Base_VSRSERVICE_000,
        new Object[] { vsrServiceDMO.getVsrServiceCode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVsrServiceDMO;
  }

  /**
   * Return a list of VsrService objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vsrServices
   * displayCode. If no values have been passed in, all VsrService objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VsrService is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vsrServiceDMO VsrServiceDMO object
   *
   * @return DTOList of VsrService objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState  state,
    VsrServiceDMO vsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vsrServiceDMO )" );

    return vsrServiceDAC.getList( state, vsrServiceDMO );
  }

  /**
  * Creates the VsrService object. As a side effect, following creation
  * of a vsrService an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsrServiceDMO vsrServiceDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsrServiceDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VsrServiceDMO create( VsrServiceDMO vsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vsrServiceDMO )" );

    thrower.ifParameterMissing( "vsrServiceDMO", vsrServiceDMO );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceCode",
      vsrServiceDMO.getVsrServiceCode(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceType",
      vsrServiceDMO.getVsrServiceType(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceDesc",
      vsrServiceDMO.getVsrServiceDesc(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrOriginator",
      vsrServiceDMO.getVsrOriginator(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceClass",
      vsrServiceDMO.getVsrServiceClass(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrTempDeact",
      vsrServiceDMO.getVsrTempDeact(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrProrata",
      vsrServiceDMO.getVsrProrata(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrProviderId",
      vsrServiceDMO.getVsrProviderId(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrShortDesc",
      vsrServiceDMO.getVsrShortDesc(  ) );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrSuspend",
      vsrServiceDMO.getVsrSuspend(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vsrServiceDMO ) ) {
      thrower.business( Base_VSRSERVICE_001,
        new Object[] { vsrServiceDMO.getVsrServiceCode(  ) } );
    }

    //
    // Now create the vsrService
    //
    vsrServiceDAC.create( vsrServiceDMO );

    return vsrServiceDMO;
  }

  /**
  * Modifies the VsrService object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSRSERVICE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsrServiceDMO vsrServiceDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsrServiceDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VsrServiceDMO modify( VsrServiceDMO aVsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avsrServiceDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avsrServiceDMO", aVsrServiceDMO );

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrServiceCode",
      aVsrServiceDMO.getVsrServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrServiceType",
      aVsrServiceDMO.getVsrServiceType(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrServiceDesc",
      aVsrServiceDMO.getVsrServiceDesc(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrOriginator",
      aVsrServiceDMO.getVsrOriginator(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrServiceClass",
      aVsrServiceDMO.getVsrServiceClass(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrTempDeact",
      aVsrServiceDMO.getVsrTempDeact(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrProrata",
      aVsrServiceDMO.getVsrProrata(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrProviderId",
      aVsrServiceDMO.getVsrProviderId(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrShortDesc",
      aVsrServiceDMO.getVsrShortDesc(  ) ); // attribute

    thrower.ifParameterMissing( "aVsrServiceDMO.vsrSuspend",
      aVsrServiceDMO.getVsrSuspend(  ) ); // attribute

    VsrServiceDMO updateVsrServiceDMO = new VsrServiceDMO(  );

    updateVsrServiceDMO.setVsrServiceCode( aVsrServiceDMO.getVsrServiceCode(  ) );

    updateVsrServiceDMO = get( updateVsrServiceDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVsrServiceDMO.setVsrServiceType( aVsrServiceDMO.getVsrServiceType(  ) );

    updateVsrServiceDMO.setVsrServiceDesc( aVsrServiceDMO.getVsrServiceDesc(  ) );

    updateVsrServiceDMO.setVsrOriginator( aVsrServiceDMO.getVsrOriginator(  ) );

    updateVsrServiceDMO.setVsrServiceClass( aVsrServiceDMO.getVsrServiceClass(  ) );

    updateVsrServiceDMO.setVsrTempDeact( aVsrServiceDMO.getVsrTempDeact(  ) );

    updateVsrServiceDMO.setVsrProrata( aVsrServiceDMO.getVsrProrata(  ) );

    updateVsrServiceDMO.setVsrProviderId( aVsrServiceDMO.getVsrProviderId(  ) );

    updateVsrServiceDMO.setVsrShortDesc( aVsrServiceDMO.getVsrShortDesc(  ) );

    updateVsrServiceDMO.setVsrSuspend( aVsrServiceDMO.getVsrSuspend(  ) );

    //
    // Modify the vsrServiceDMO
    //
    vsrServiceDAC.modify( updateVsrServiceDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VsrServiceDMO returnVsrServiceDMO = new VsrServiceDMO(  );

    returnVsrServiceDMO.setVsrServiceCode( updateVsrServiceDMO
      .getVsrServiceCode(  ) );

    returnVsrServiceDMO = get( returnVsrServiceDMO );

    return returnVsrServiceDMO;
  }

  /**
  * Modifies the VsrService object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VsrServiceDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsrServiceDMO object.
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
    // Modify the vsrServiceDMO
    //
    vsrServiceDAC.modify( filter );
  }

  /**
   * Deletes the VsrService object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VSRSERVICE_003
   *     <li>{@link #Base#VSRSERVICE_000} if the VsrService does not exist.</li>
   *     <li>{@link #Base#VSRSERVICE_003} if the VsrService is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VsrServiceDMO VsrService object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VsrServiceDMO vsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vsrServiceDMO )" );

    thrower.ifParameterMissing( "vsrServiceDMO", vsrServiceDMO );

    VsrServiceDMO updateVsrServiceDMO = null;

    updateVsrServiceDMO = get( vsrServiceDMO );

    // delete self...
    vsrServiceDAC.delete( vsrServiceDMO );
  }

  /**
   * Deletes the VsrService object.
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
    vsrServiceDAC.delete( filter );
  }

  /**
  * Indicates whether a VsrService exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VsrService exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VsrServiceDMO vsrServiceDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vsrService)" );

    thrower.ifParameterMissing( "vsrServiceDMO", vsrServiceDMO );

    thrower.ifParameterMissing( "vsrServiceDMO.vsrServiceCode",
      vsrServiceDMO.getVsrServiceCode(  ) );

    return vsrServiceDAC.exists( vsrServiceDMO );
  }

  /**
   * Indicates whether a VsrService exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VsrService exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vsrServiceDAC.exists( filter );
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

    return vsrServiceDAC.getList( state, filter );
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

    return vsrServiceDAC.iterate( filter );
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

    return vsrServiceDAC.iterateWithLock( filter );
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
  public VsrServiceDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VsrServiceDMO
    //
    VsrServiceDMO vsrServiceDMO = vsrServiceDAC.get( filter );

    return vsrServiceDMO;
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

    return vsrServiceDAC.max( filter );
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

    return vsrServiceDAC.min( filter );
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

    return new Integer(vsrServiceDAC.count( filter ));
  }
}
