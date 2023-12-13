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
 * A package is simply a name for a group of services.
 * <p>
 *   When a customer takes out a subscription (see ACTIVE) its for one package. The services that are available under the
 *   package are listed in SERVICE. The services that the customer has chosen to take up for the service are in
 *   ACTIVE_SERVICE.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VpkPackage class.
 * It is extended by VpkPackage class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VpkPackageAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VpkPackage.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VPK";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VpkPackageDAC vpkPackageDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VpkPackageDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vpkPackageDAC = (VpkPackageDAC) dac;
  }

  /**
  * Retrieve a vpkPackage data model object from persistent storage. The
  * vpkPackageDMO passed in must contain a valid existing vpkPackageId.
  * Optionally, the return vpkPackageDMO may be include a flag that indicates if
  * the vpkPackage object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vpkPackage object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPKPACKAGE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vpkPackageDMO the vpkPackage object that must contain either the
  *         unique vpkPackageId or the displayCode/languageCode pair
  *
  * @return vpkPackageDMO the vpkPackage data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VpkPackageDMO get( VpkPackageDMO vpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vpkPackageDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vpkPackageDMO", vpkPackageDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vpkPackageDMO.vpkPackageCode",
      vpkPackageDMO.getVpkPackageCode(  ) );

    //
    // Attempt to get the VpkPackageDMO
    //
    VpkPackageDMO returnVpkPackageDMO = vpkPackageDAC.get( vpkPackageDMO );

    //
    // Could not find the VpkPackageDMO
    //
    if ( returnVpkPackageDMO == null ) {
      thrower.business( Base_VPKPACKAGE_000,
        new Object[] { vpkPackageDMO.getVpkPackageCode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVpkPackageDMO;
  }

  /**
   * Return a list of VpkPackage objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vpkPackages
   * displayCode. If no values have been passed in, all VpkPackage objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VpkPackage is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vpkPackageDMO VpkPackageDMO object
   *
   * @return DTOList of VpkPackage objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState  state,
    VpkPackageDMO vpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vpkPackageDMO )" );

    return vpkPackageDAC.getList( state, vpkPackageDMO );
  }

  /**
  * Creates the VpkPackage object. As a side effect, following creation
  * of a vpkPackage an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpkPackageDMO vpkPackageDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpkPackageDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpkPackageDMO create( VpkPackageDMO vpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vpkPackageDMO )" );

    thrower.ifParameterMissing( "vpkPackageDMO", vpkPackageDMO );

    thrower.ifParameterMissing( "vpkPackageDMO.vpkPackageCode",
      vpkPackageDMO.getVpkPackageCode(  ) );

    thrower.ifParameterMissing( "vpkPackageDMO.vpkPackageDesc",
      vpkPackageDMO.getVpkPackageDesc(  ) );

    thrower.ifParameterMissing( "vpkPackageDMO.vpkChangeTariff",
      vpkPackageDMO.getVpkChangeTariff(  ) );

    thrower.ifParameterMissing( "vpkPackageDMO.vpkSuspend",
      vpkPackageDMO.getVpkSuspend(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vpkPackageDMO ) ) {
      thrower.business( Base_VPKPACKAGE_001,
        new Object[] { vpkPackageDMO.getVpkPackageCode(  ) } );
    }

    //
    // Now create the vpkPackage
    //
    vpkPackageDAC.create( vpkPackageDMO );

    return vpkPackageDMO;
  }

  /**
  * Modifies the VpkPackage object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPKPACKAGE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpkPackageDMO vpkPackageDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpkPackageDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpkPackageDMO modify( VpkPackageDMO aVpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avpkPackageDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avpkPackageDMO", aVpkPackageDMO );

    thrower.ifParameterMissing( "aVpkPackageDMO.vpkPackageCode",
      aVpkPackageDMO.getVpkPackageCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVpkPackageDMO.vpkPackageDesc",
      aVpkPackageDMO.getVpkPackageDesc(  ) ); // attribute

    thrower.ifParameterMissing( "aVpkPackageDMO.vpkChangeTariff",
      aVpkPackageDMO.getVpkChangeTariff(  ) ); // attribute

    thrower.ifParameterMissing( "aVpkPackageDMO.vpkSuspend",
      aVpkPackageDMO.getVpkSuspend(  ) ); // attribute

    VpkPackageDMO updateVpkPackageDMO = new VpkPackageDMO(  );

    updateVpkPackageDMO.setVpkPackageCode( aVpkPackageDMO.getVpkPackageCode(  ) );

    updateVpkPackageDMO = get( updateVpkPackageDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVpkPackageDMO.setVpkPackageDesc( aVpkPackageDMO.getVpkPackageDesc(  ) );

    updateVpkPackageDMO.setVpkTarplanRef( aVpkPackageDMO.getVpkTarplanRef(  ) );

    updateVpkPackageDMO.setVpkChangeTariff( aVpkPackageDMO.getVpkChangeTariff(  ) );

    updateVpkPackageDMO.setVpkSuspend( aVpkPackageDMO.getVpkSuspend(  ) );

    //
    // Modify the vpkPackageDMO
    //
    vpkPackageDAC.modify( updateVpkPackageDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VpkPackageDMO returnVpkPackageDMO = new VpkPackageDMO(  );

    returnVpkPackageDMO.setVpkPackageCode( updateVpkPackageDMO
      .getVpkPackageCode(  ) );

    returnVpkPackageDMO = get( returnVpkPackageDMO );

    return returnVpkPackageDMO;
  }

  /**
  * Modifies the VpkPackage object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VpkPackageDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpkPackageDMO object.
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
    // Modify the vpkPackageDMO
    //
    vpkPackageDAC.modify( filter );
  }

  /**
   * Deletes the VpkPackage object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VPKPACKAGE_003
   *     <li>{@link #Base#VPKPACKAGE_000} if the VpkPackage does not exist.</li>
   *     <li>{@link #Base#VPKPACKAGE_003} if the VpkPackage is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VpkPackageDMO VpkPackage object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VpkPackageDMO vpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vpkPackageDMO )" );

    thrower.ifParameterMissing( "vpkPackageDMO", vpkPackageDMO );

    VpkPackageDMO updateVpkPackageDMO = null;

    updateVpkPackageDMO = get( vpkPackageDMO );

    // delete self...
    vpkPackageDAC.delete( vpkPackageDMO );
  }

  /**
   * Deletes the VpkPackage object.
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
    vpkPackageDAC.delete( filter );
  }

  /**
  * Indicates whether a VpkPackage exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VpkPackage exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VpkPackageDMO vpkPackageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vpkPackage)" );

    thrower.ifParameterMissing( "vpkPackageDMO", vpkPackageDMO );

    thrower.ifParameterMissing( "vpkPackageDMO.vpkPackageCode",
      vpkPackageDMO.getVpkPackageCode(  ) );

    return vpkPackageDAC.exists( vpkPackageDMO );
  }

  /**
   * Indicates whether a VpkPackage exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VpkPackage exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vpkPackageDAC.exists( filter );
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

    return vpkPackageDAC.getList( state, filter );
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

    return vpkPackageDAC.iterate( filter );
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

    return vpkPackageDAC.iterateWithLock( filter );
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
  public VpkPackageDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VpkPackageDMO
    //
    VpkPackageDMO vpkPackageDMO = vpkPackageDAC.get( filter );

    return vpkPackageDMO;
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

    return vpkPackageDAC.max( filter );
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

    return vpkPackageDAC.min( filter );
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

    return new Integer(vpkPackageDAC.count( filter ));
  }
}
