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
 * The entries in this table show what msisdns are used for each service the subscriber has taken up.
 * <p>
 *   This is for ALL services, not just 'basic' ones.
 * </p>
 * <p>
 *   For each entry there is a service taken up by the subscriber (shown by an entry in VAS_ACTIVE_SERVICE) and an msisdn
 *   belonging to the subscriber (shown by an entry in vam_active_msisdn).
 * </p>
 *
 * This abstract business logic class holds all the logic for the VsmServiceMsisdn class.
 * It is extended by VsmServiceMsisdn class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class VsmServiceMsisdnAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( VsmServiceMsisdn.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "VSMM";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected VsmServiceMsisdnDAC vsmServiceMsisdnDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return VsmServiceMsisdnDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.vsmServiceMsisdnDAC = (VsmServiceMsisdnDAC) dac;
  }

  /**
  * Retrieve a vsmServiceMsisdn data model object from persistent storage. The
  * vsmServiceMsisdnDMO passed in must contain a valid existing vsmServiceMsisdnId.
  * Optionally, the return vsmServiceMsisdnDMO may be include a flag that indicates if
  * the vsmServiceMsisdn object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the vsmServiceMsisdn object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSMSERVICEMSISDN_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  vsmServiceMsisdnDMO the vsmServiceMsisdn object that must contain either the
  *         unique vsmServiceMsisdnId or the displayCode/languageCode pair
  *
  * @return vsmServiceMsisdnDMO the vsmServiceMsisdn data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public VsmServiceMsisdnDMO get( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(vsmServiceMsisdnDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "vsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmSubscriberId",
      vsmServiceMsisdnDMO.getVsmSubscriberId(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmServiceCode",
      vsmServiceMsisdnDMO.getVsmServiceCode(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmMsisdnNo",
      vsmServiceMsisdnDMO.getVsmMsisdnNo(  ) );

    //
    // Attempt to get the VsmServiceMsisdnDMO
    //
    VsmServiceMsisdnDMO returnVsmServiceMsisdnDMO = vsmServiceMsisdnDAC.get( vsmServiceMsisdnDMO );

    //
    // Could not find the VsmServiceMsisdnDMO
    //
    if ( returnVsmServiceMsisdnDMO == null ) {
      thrower.business( Base_VSMSERVICEMSISDN_000,
        new Object[] {
          vsmServiceMsisdnDMO.getVsmSubscriberId(  ),
          vsmServiceMsisdnDMO.getVsmServiceCode(  ),
          vsmServiceMsisdnDMO.getVsmMsisdnNo(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnVsmServiceMsisdnDMO;
  }

  /**
   * Return a list of VsmServiceMsisdn objects matching the passed in values. A
   * partial match is performed on the description argument and/or the vsmServiceMsisdns
   * displayCode. If no values have been passed in, all VsmServiceMsisdn objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the VsmServiceMsisdn is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param vsmServiceMsisdnDMO VsmServiceMsisdnDMO object
   *
   * @return DTOList of VsmServiceMsisdn objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(
    DTOListState        state,
    VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, vsmServiceMsisdnDMO )" );

    return vsmServiceMsisdnDAC.getList( state, vsmServiceMsisdnDMO );
  }

  /**
  * Creates the VsmServiceMsisdn object. As a side effect, following creation
  * of a vsmServiceMsisdn an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsmServiceMsisdnDMO vsmServiceMsisdnDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsmServiceMsisdnDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VsmServiceMsisdnDMO create( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( vsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmSubscriberId",
      vsmServiceMsisdnDMO.getVsmSubscriberId(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmServiceCode",
      vsmServiceMsisdnDMO.getVsmServiceCode(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmMsisdnNo",
      vsmServiceMsisdnDMO.getVsmMsisdnNo(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmNodeSent",
      vsmServiceMsisdnDMO.getVsmNodeSent(  ) );

    //
    // Check that this object does not already exist
    //
    if (exists( vsmServiceMsisdnDMO )) {
      thrower.business( Base_VSMSERVICEMSISDN_001,
        new Object[] {
          vsmServiceMsisdnDMO.getVsmSubscriberId(  ),
          vsmServiceMsisdnDMO.getVsmServiceCode(  ),
          vsmServiceMsisdnDMO.getVsmMsisdnNo(  )
        } );
    }

    //
    // Now create the vsmServiceMsisdn
    //
    vsmServiceMsisdnDAC.create( vsmServiceMsisdnDMO );

    return vsmServiceMsisdnDMO;
  }

  /**
  * Modifies the VsmServiceMsisdn object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#VSMSERVICEMSISDN_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param vsmServiceMsisdnDMO vsmServiceMsisdnDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsmServiceMsisdnDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public VsmServiceMsisdnDMO modify(
    VsmServiceMsisdnDMO aVsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( avsmServiceMsisdnDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "avsmServiceMsisdnDMO", aVsmServiceMsisdnDMO );

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO.vsmSubscriberId",
      aVsmServiceMsisdnDMO.getVsmSubscriberId(  ) ); // attribute

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO.vsmServiceCode",
      aVsmServiceMsisdnDMO.getVsmServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO.vsmMsisdnNo",
      aVsmServiceMsisdnDMO.getVsmMsisdnNo(  ) ); // attribute

    thrower.ifParameterMissing( "aVsmServiceMsisdnDMO.vsmNodeSent",
      aVsmServiceMsisdnDMO.getVsmNodeSent(  ) ); // attribute

    VsmServiceMsisdnDMO updateVsmServiceMsisdnDMO = new VsmServiceMsisdnDMO(  );

    updateVsmServiceMsisdnDMO.setVsmSubscriberId( aVsmServiceMsisdnDMO
      .getVsmSubscriberId(  ) );

    updateVsmServiceMsisdnDMO.setVsmServiceCode( aVsmServiceMsisdnDMO
      .getVsmServiceCode(  ) );

    updateVsmServiceMsisdnDMO.setVsmMsisdnNo( aVsmServiceMsisdnDMO
      .getVsmMsisdnNo(  ) );

    updateVsmServiceMsisdnDMO = get( updateVsmServiceMsisdnDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateVsmServiceMsisdnDMO.setVsmActivateDate( aVsmServiceMsisdnDMO
      .getVsmActivateDate(  ) );

    updateVsmServiceMsisdnDMO.setVsmDeactDate( aVsmServiceMsisdnDMO
      .getVsmDeactDate(  ) );

    updateVsmServiceMsisdnDMO.setVsmBilledUpto( aVsmServiceMsisdnDMO
      .getVsmBilledUpto(  ) );

    updateVsmServiceMsisdnDMO.setVsmNodeSent( aVsmServiceMsisdnDMO
      .getVsmNodeSent(  ) );

    //
    // Modify the vsmServiceMsisdnDMO
    //
    vsmServiceMsisdnDAC.modify( updateVsmServiceMsisdnDMO );

    // Create a new DMO, set keys, and fetch from the database...
    VsmServiceMsisdnDMO returnVsmServiceMsisdnDMO = new VsmServiceMsisdnDMO(  );

    returnVsmServiceMsisdnDMO.setVsmSubscriberId( updateVsmServiceMsisdnDMO
      .getVsmSubscriberId(  ) );

    returnVsmServiceMsisdnDMO.setVsmServiceCode( updateVsmServiceMsisdnDMO
      .getVsmServiceCode(  ) );

    returnVsmServiceMsisdnDMO.setVsmMsisdnNo( updateVsmServiceMsisdnDMO
      .getVsmMsisdnNo(  ) );

    returnVsmServiceMsisdnDMO = get( returnVsmServiceMsisdnDMO );

    return returnVsmServiceMsisdnDMO;
  }

  /**
  * Modifies the VsmServiceMsisdn object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param VsmServiceMsisdnDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated vsmServiceMsisdnDMO object.
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
    // Modify the vsmServiceMsisdnDMO
    //
    vsmServiceMsisdnDAC.modify( filter );
  }

  /**
   * Deletes the VsmServiceMsisdn object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_VSMSERVICEMSISDN_003
   *     <li>{@link #Base#VSMSERVICEMSISDN_000} if the VsmServiceMsisdn does not exist.</li>
   *     <li>{@link #Base#VSMSERVICEMSISDN_003} if the VsmServiceMsisdn is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param VsmServiceMsisdnDMO VsmServiceMsisdn object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( vsmServiceMsisdnDMO )" );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    VsmServiceMsisdnDMO updateVsmServiceMsisdnDMO = null;

    updateVsmServiceMsisdnDMO = get( vsmServiceMsisdnDMO );

    // delete self...
    vsmServiceMsisdnDAC.delete( vsmServiceMsisdnDMO );
  }

  /**
   * Deletes the VsmServiceMsisdn object.
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
    vsmServiceMsisdnDAC.delete( filter );
  }

  /**
  * Indicates whether a VsmServiceMsisdn exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the VsmServiceMsisdn exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(vsmServiceMsisdn)" );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO", vsmServiceMsisdnDMO );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmSubscriberId",
      vsmServiceMsisdnDMO.getVsmSubscriberId(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmServiceCode",
      vsmServiceMsisdnDMO.getVsmServiceCode(  ) );

    thrower.ifParameterMissing( "vsmServiceMsisdnDMO.vsmMsisdnNo",
      vsmServiceMsisdnDMO.getVsmMsisdnNo(  ) );

    return vsmServiceMsisdnDAC.exists( vsmServiceMsisdnDMO );
  }

  /**
   * Indicates whether a VsmServiceMsisdn exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the VsmServiceMsisdn exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return vsmServiceMsisdnDAC.exists( filter );
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

    return vsmServiceMsisdnDAC.getList( state, filter );
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

    return vsmServiceMsisdnDAC.iterate( filter );
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

    return vsmServiceMsisdnDAC.iterateWithLock( filter );
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
  public VsmServiceMsisdnDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the VsmServiceMsisdnDMO
    //
    VsmServiceMsisdnDMO vsmServiceMsisdnDMO = vsmServiceMsisdnDAC.get( filter );

    return vsmServiceMsisdnDMO;
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

    return vsmServiceMsisdnDAC.max( filter );
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

    return vsmServiceMsisdnDAC.min( filter );
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

    return new Integer(vsmServiceMsisdnDAC.count( filter ));
  }
}
