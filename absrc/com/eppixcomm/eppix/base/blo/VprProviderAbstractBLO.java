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
 * Defines a company that provides one or more of the services offered to subscribers.
 * <p>
 *   This can be a network, the service provider themselves or a third party.
 * </p>
 *
 * This abstract business logic class holds all the logic for the VprProvider class.
 * It is extended by VprProvider class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VprProviderAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VprProvider.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VPR";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VprProviderDAC vprProviderDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VprProviderDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vprProviderDAC = (VprProviderDAC) dac;
  }

  /**
  * Retrieve a vprProvider data model object from persistent storage. The
  * vprProviderDMO passed in must contain a valid existing vprProviderId.
  * Optionally, the return vprProviderDMO may be include a flag that indicates if
  * the vprProvider object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vprProvider object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPRPROVIDER_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vprProviderDMO the vprProvider object that must contain either the
  *         unique vprProviderId or the displayCode/languageCode pair
  *
  * @return vprProviderDMO the vprProvider data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VprProviderDMO get( VprProviderDMO vprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vprProviderDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vprProviderDMO", vprProviderDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vprProviderDMO.vprProviderId",
      vprProviderDMO.getVprProviderId(  ) );

    //
    // Attempt to get the VprProviderDMO
    //
    VprProviderDMO returnVprProviderDMO = vprProviderDAC.get( vprProviderDMO );

    //
    // Could not find the VprProviderDMO
    //
    if ( returnVprProviderDMO == null ) {
      thrower.business( Base_VPRPROVIDER_000,
        new Object[] { vprProviderDMO.getVprProviderId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVprProviderDMO;
  }

  /**
   * Return a list of VprProvider objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vprProviders
   * displayCode. If no values have been passed in, all VprProvider objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VprProvider is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vprProviderDMO VprProviderDMO object
   *
   * @return DTOList of VprProvider objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState   state,
    VprProviderDMO vprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vprProviderDMO )" );

    return vprProviderDAC.getList( state, vprProviderDMO );
  }

  /**
  * Creates the VprProvider object. As a side effect, following creation
  * of a vprProvider an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vprProviderDMO vprProviderDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vprProviderDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VprProviderDMO create( VprProviderDMO vprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vprProviderDMO )" );

    thrower.ifParameterMissing( "vprProviderDMO", vprProviderDMO );

    thrower.ifParameterMissing( "vprProviderDMO.vprProviderId",
      vprProviderDMO.getVprProviderId(  ) );

    thrower.ifParameterMissing( "vprProviderDMO.vprProviderName",
      vprProviderDMO.getVprProviderName(  ) );

    thrower.ifParameterMissing( "vprProviderDMO.vprNetwork",
      vprProviderDMO.getVprNetwork(  ) );

//    thrower.ifParameterMissing( "vprProviderDMO.vprTechnology",
//      vprProviderDMO.getVprTechnology(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( vprProviderDMO ) ) {
      thrower.business( Base_VPRPROVIDER_001,
        new Object[] { vprProviderDMO.getVprProviderId(  ) } );
    }

    //
    // Now create the vprProvider
    //
    vprProviderDAC.create( vprProviderDMO );

    return vprProviderDMO;
  }

  /**
  * Modifies the VprProvider object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VPRPROVIDER_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vprProviderDMO vprProviderDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vprProviderDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VprProviderDMO modify( VprProviderDMO aVprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avprProviderDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avprProviderDMO", aVprProviderDMO );

    thrower.ifParameterMissing( "aVprProviderDMO.vprProviderId",
      aVprProviderDMO.getVprProviderId(  ) ); // attribute

    thrower.ifParameterMissing( "aVprProviderDMO.vprProviderName",
      aVprProviderDMO.getVprProviderName(  ) ); // attribute

    thrower.ifParameterMissing( "aVprProviderDMO.vprNetwork",
      aVprProviderDMO.getVprNetwork(  ) ); // attribute

//    thrower.ifParameterMissing( "aVprProviderDMO.vprTechnology",
//      aVprProviderDMO.getVprTechnology(  ) ); // attribute

    VprProviderDMO updateVprProviderDMO = new VprProviderDMO(  );

    updateVprProviderDMO.setVprProviderId( aVprProviderDMO.getVprProviderId(  ) );

    updateVprProviderDMO = get( updateVprProviderDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVprProviderDMO.setVprProviderName( aVprProviderDMO
      .getVprProviderName(  ) );

    updateVprProviderDMO.setVprNetwork( aVprProviderDMO.getVprNetwork(  ) );

//    updateVprProviderDMO.setVprTechnology( aVprProviderDMO.getVprTechnology(  ) );

    //
    // Modify the vprProviderDMO
    //
    vprProviderDAC.modify( updateVprProviderDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VprProviderDMO returnVprProviderDMO = new VprProviderDMO(  );

    returnVprProviderDMO.setVprProviderId( updateVprProviderDMO
      .getVprProviderId(  ) );

    returnVprProviderDMO = get( returnVprProviderDMO );

    return returnVprProviderDMO;
  }

  /**
  * Modifies the VprProvider object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VprProviderDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vprProviderDMO object.
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
    // Modify the vprProviderDMO
    //
    vprProviderDAC.modify( filter );
  }

  /**
   * Deletes the VprProvider object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VPRPROVIDER_003
   *     <li>{@link #Base#VPRPROVIDER_000} if the VprProvider does not exist.</li>
   *     <li>{@link #Base#VPRPROVIDER_003} if the VprProvider is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VprProviderDMO VprProvider object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VprProviderDMO vprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vprProviderDMO )" );

    thrower.ifParameterMissing( "vprProviderDMO", vprProviderDMO );

    VprProviderDMO updateVprProviderDMO = null;

    updateVprProviderDMO = get( vprProviderDMO );

    // delete self...
    vprProviderDAC.delete( vprProviderDMO );
  }

  /**
   * Deletes the VprProvider object.
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
    vprProviderDAC.delete( filter );
  }

  /**
  * Indicates whether a VprProvider exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VprProvider exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VprProviderDMO vprProviderDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vprProvider)" );

    thrower.ifParameterMissing( "vprProviderDMO", vprProviderDMO );

    thrower.ifParameterMissing( "vprProviderDMO.vprProviderId",
      vprProviderDMO.getVprProviderId(  ) );

    return vprProviderDAC.exists( vprProviderDMO );
  }

  /**
   * Indicates whether a VprProvider exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VprProvider exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vprProviderDAC.exists( filter );
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

    return vprProviderDAC.getList( state, filter );
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

    return vprProviderDAC.iterate( filter );
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

    return vprProviderDAC.iterateWithLock( filter );
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
  public VprProviderDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VprProviderDMO
    //
    VprProviderDMO vprProviderDMO = vprProviderDAC.get( filter );

    return vprProviderDMO;
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

    return vprProviderDAC.max( filter );
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

    return vprProviderDAC.min( filter );
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

    return new Integer(vprProviderDAC.count( filter ));
  }
}
