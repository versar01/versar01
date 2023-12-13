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
 * Defines the network prefix, MSISDN mask and SIM mask for a given Network ID.
 * <p>
 *   A network ID may have many entries in this table.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VpnProviderNetwk class.
 * It is extended by VpnProviderNetwk class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VpnProviderNetwkAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VpnProviderNetwk.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VPNN";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VpnProviderNetwkDAC vpnProviderNetwkDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VpnProviderNetwkDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vpnProviderNetwkDAC = (VpnProviderNetwkDAC) dac;
  }

  /**
  * Retrieve a vpnProviderNetwk data model object from persistent storage. The
  * vpnProviderNetwkDMO passed in must contain a valid existing vpnProviderNetwkId.
  * Optionally, the return vpnProviderNetwkDMO may be include a flag that indicates if
  * the vpnProviderNetwk object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vpnProviderNetwk object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPNPROVIDERNETWK_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vpnProviderNetwkDMO the vpnProviderNetwk object that must contain either the
  *         unique vpnProviderNetwkId or the displayCode/languageCode pair
  *
  * @return vpnProviderNetwkDMO the vpnProviderNetwk data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VpnProviderNetwkDMO get( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vpnProviderNetwkDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vpnProviderNetwkDMO", vpnProviderNetwkDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnProviderId",
      vpnProviderNetwkDMO.getVpnProviderId(  ) );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnNetworkPrefix",
      vpnProviderNetwkDMO.getVpnNetworkPrefix(  ) );

    //
    // Attempt to get the VpnProviderNetwkDMO
    //
    VpnProviderNetwkDMO returnVpnProviderNetwkDMO = vpnProviderNetwkDAC.get( vpnProviderNetwkDMO );

    //
    // Could not find the VpnProviderNetwkDMO
    //
    if ( returnVpnProviderNetwkDMO == null ) {
      thrower.business( Base_VPNPROVIDERNETWK_000,
        new Object[] {
          vpnProviderNetwkDMO.getVpnProviderId(  ),
          vpnProviderNetwkDMO.getVpnNetworkPrefix(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVpnProviderNetwkDMO;
  }

  /**
   * Return a list of VpnProviderNetwk objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vpnProviderNetwks
   * displayCode. If no values have been passed in, all VpnProviderNetwk objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VpnProviderNetwk is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vpnProviderNetwkDMO VpnProviderNetwkDMO object
   *
   * @return DTOList of VpnProviderNetwk objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState        state,
    VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vpnProviderNetwkDMO )" );

    return vpnProviderNetwkDAC.getList( state, vpnProviderNetwkDMO );
  }

  /**
  * Creates the VpnProviderNetwk object. As a side effect, following creation
  * of a vpnProviderNetwk an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpnProviderNetwkDMO vpnProviderNetwkDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpnProviderNetwkDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpnProviderNetwkDMO create( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO", vpnProviderNetwkDMO );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnProviderId",
      vpnProviderNetwkDMO.getVpnProviderId(  ) );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnNetworkPrefix",
      vpnProviderNetwkDMO.getVpnNetworkPrefix(  ) );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnSerialMask",
      vpnProviderNetwkDMO.getVpnSimMask() );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vpnProviderNetwkDMO ) ) {
      thrower.business( Base_VPNPROVIDERNETWK_001,
        new Object[] {
          vpnProviderNetwkDMO.getVpnProviderId(  ),
          vpnProviderNetwkDMO.getVpnNetworkPrefix(  )
        } );
    }

    //
    // Now create the vpnProviderNetwk
    //
    vpnProviderNetwkDAC.create( vpnProviderNetwkDMO );

    return vpnProviderNetwkDMO;
  }

  /**
  * Modifies the VpnProviderNetwk object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPNPROVIDERNETWK_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vpnProviderNetwkDMO vpnProviderNetwkDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpnProviderNetwkDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VpnProviderNetwkDMO modify( 
    VpnProviderNetwkDMO aVpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avpnProviderNetwkDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avpnProviderNetwkDMO", aVpnProviderNetwkDMO );

    thrower.ifParameterMissing( "aVpnProviderNetwkDMO.vpnProviderId",
      aVpnProviderNetwkDMO.getVpnProviderId(  ) ); // attribute

    thrower.ifParameterMissing( "aVpnProviderNetwkDMO.vpnNetworkPrefix",
      aVpnProviderNetwkDMO.getVpnNetworkPrefix(  ) ); // attribute

    thrower.ifParameterMissing( "aVpnProviderNetwkDMO.vpnSerialMask",
      aVpnProviderNetwkDMO.getVpnSimMask() ); // attribute

    VpnProviderNetwkDMO updateVpnProviderNetwkDMO = new VpnProviderNetwkDMO(  );

    updateVpnProviderNetwkDMO.setVpnProviderId( aVpnProviderNetwkDMO
      .getVpnProviderId(  ) );

    updateVpnProviderNetwkDMO.setVpnNetworkPrefix( aVpnProviderNetwkDMO
      .getVpnNetworkPrefix(  ) );

    updateVpnProviderNetwkDMO = get( updateVpnProviderNetwkDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVpnProviderNetwkDMO.setVpnMsisdnMask(aVpnProviderNetwkDMO
      .getVpnMsisdnMask() );

    updateVpnProviderNetwkDMO.setVpnSimMask( aVpnProviderNetwkDMO
      .getVpnSimMask() );

    //
    // Modify the vpnProviderNetwkDMO
    //
    vpnProviderNetwkDAC.modify( updateVpnProviderNetwkDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VpnProviderNetwkDMO returnVpnProviderNetwkDMO = new VpnProviderNetwkDMO(  );

    returnVpnProviderNetwkDMO.setVpnProviderId( updateVpnProviderNetwkDMO
      .getVpnProviderId(  ) );

    returnVpnProviderNetwkDMO.setVpnNetworkPrefix( updateVpnProviderNetwkDMO
      .getVpnNetworkPrefix(  ) );

    returnVpnProviderNetwkDMO = get( returnVpnProviderNetwkDMO );

    return returnVpnProviderNetwkDMO;
  }

  /**
  * Modifies the VpnProviderNetwk object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VpnProviderNetwkDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vpnProviderNetwkDMO object.
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
    // Modify the vpnProviderNetwkDMO
    //
    vpnProviderNetwkDAC.modify( filter );
  }

  /**
   * Deletes the VpnProviderNetwk object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VPNPROVIDERNETWK_003
   *     <li>{@link #Base#VPNPROVIDERNETWK_000} if the VpnProviderNetwk does not exist.</li>
   *     <li>{@link #Base#VPNPROVIDERNETWK_003} if the VpnProviderNetwk is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VpnProviderNetwkDMO VpnProviderNetwk object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vpnProviderNetwkDMO )" );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO", vpnProviderNetwkDMO );

    VpnProviderNetwkDMO updateVpnProviderNetwkDMO = null;

    updateVpnProviderNetwkDMO = get( vpnProviderNetwkDMO );

    // delete self...
    vpnProviderNetwkDAC.delete( vpnProviderNetwkDMO );
  }

  /**
   * Deletes the VpnProviderNetwk object.
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
    vpnProviderNetwkDAC.delete( filter );
  }

  /**
  * Indicates whether a VpnProviderNetwk exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VpnProviderNetwk exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VpnProviderNetwkDMO vpnProviderNetwkDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vpnProviderNetwk)" );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO", vpnProviderNetwkDMO );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnProviderId",
      vpnProviderNetwkDMO.getVpnProviderId(  ) );

    thrower.ifParameterMissing( "vpnProviderNetwkDMO.vpnNetworkPrefix",
      vpnProviderNetwkDMO.getVpnNetworkPrefix(  ) );

    return vpnProviderNetwkDAC.exists( vpnProviderNetwkDMO );
  }

  /**
   * Indicates whether a VpnProviderNetwk exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VpnProviderNetwk exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vpnProviderNetwkDAC.exists( filter );
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

    return vpnProviderNetwkDAC.getList( state, filter );
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

    return vpnProviderNetwkDAC.iterate( filter );
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
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterateWithLock( filter )" );

    return vpnProviderNetwkDAC.iterateWithLock( filter );
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
  public VpnProviderNetwkDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VpnProviderNetwkDMO
    //
    VpnProviderNetwkDMO vpnProviderNetwkDMO = vpnProviderNetwkDAC.get( filter );

    return vpnProviderNetwkDMO;
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

    return vpnProviderNetwkDAC.max( filter );
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

    return vpnProviderNetwkDAC.min( filter );
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

    return new Integer(vpnProviderNetwkDAC.count( filter ));
  }
}
