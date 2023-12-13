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
 * This table holds the actual system key settings  for the site.
 * <p>
 *   Its will in the future replace the use of the chameleon sysdirm table.
 * </p>
 *
 * This abstract business logic class holds all the logic for the SksKeySetting class.
 * It is extended by SksKeySetting class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SksKeySettingAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SksKeySetting.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SKSS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SksKeySettingDAC sksKeySettingDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.sksKeySettingDAC = (SksKeySettingDAC) dac;
  }

  /**
  * Retrieve a sksKeySetting data model object from persistent storage. The
  * sksKeySettingDMO passed in must contain a valid existing sksKeySettingId.
  * Optionally, the return sksKeySettingDMO may be include a flag that indicates if
  * the sksKeySetting object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the sksKeySetting object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SKSKEYSETTING_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  sksKeySettingDMO the sksKeySetting object that must contain either the
  *         unique sksKeySettingId or the displayCode/languageCode pair
  *
  * @return sksKeySettingDMO the sksKeySetting data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SksKeySettingDMO get( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(sksKeySettingDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "sksKeySettingDMO", sksKeySettingDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "sksKeySettingDMO.sksKeyCode",
      sksKeySettingDMO.getSksKeyCode(  ) );

    //
    // Attempt to get the SksKeySettingDMO
    //
    SksKeySettingDMO returnSksKeySettingDMO = sksKeySettingDAC.get( sksKeySettingDMO );

    //
    // Could not find the SksKeySettingDMO
    //
    if ( returnSksKeySettingDMO == null ) {
      thrower.business( Base_SKSKEYSETTING_000,
        new Object[] { sksKeySettingDMO.getSksKeyCode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSksKeySettingDMO;
  }

  /**
   * Return a list of SksKeySetting objects matching the passed in values. A
   * partial match is performed on the description argument and/or the sksKeySettings
   * displayCode. If no values have been passed in, all SksKeySetting objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the SksKeySetting is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param sksKeySettingDMO SksKeySettingDMO object
   *
   * @return DTOList of SksKeySetting objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<SksKeySettingDMO> getList( 
//    DTOListState     state,
//    SksKeySettingDMO sksKeySettingDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, sksKeySettingDMO )" );
//
//    return sksKeySettingDAC.getList( state, sksKeySettingDMO );
//  }

  /**
  * Creates the SksKeySetting object. As a side effect, following creation
  * of a sksKeySetting an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sksKeySettingDMO sksKeySettingDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sksKeySettingDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SksKeySettingDMO create( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( sksKeySettingDMO )" );

    thrower.ifParameterMissing( "sksKeySettingDMO", sksKeySettingDMO );

    thrower.ifParameterMissing( "sksKeySettingDMO.sksKeyCode",
      sksKeySettingDMO.getSksKeyCode(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( sksKeySettingDMO ) ) {
      thrower.business( Base_SKSKEYSETTING_001,
        new Object[] { sksKeySettingDMO.getSksKeyCode(  ) } );
    }

    //
    // Now create the sksKeySetting
    //
    sksKeySettingDAC.create( sksKeySettingDMO );

    return sksKeySettingDMO;
  }

  /**
  * Modifies the SksKeySetting object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SKSKEYSETTING_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sksKeySettingDMO sksKeySettingDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sksKeySettingDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SksKeySettingDMO modify( SksKeySettingDMO aSksKeySettingDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( asksKeySettingDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "asksKeySettingDMO", aSksKeySettingDMO );

    thrower.ifParameterMissing( "aSksKeySettingDMO.sksKeyCode",
      aSksKeySettingDMO.getSksKeyCode(  ) ); // attribute

    SksKeySettingDMO updateSksKeySettingDMO = new SksKeySettingDMO(  );

    updateSksKeySettingDMO.setSksKeyCode( aSksKeySettingDMO.getSksKeyCode(  ) );

    updateSksKeySettingDMO = get( updateSksKeySettingDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSksKeySettingDMO.setSksValue( aSksKeySettingDMO.getSksValue(  ) );

    updateSksKeySettingDMO.setSksComment( aSksKeySettingDMO.getSksComment(  ) );

    updateSksKeySettingDMO.setSksTimestamp( aSksKeySettingDMO.getSksTimestamp(  ) );

    //
    // Modify the sksKeySettingDMO
    //
    sksKeySettingDAC.modify( updateSksKeySettingDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SksKeySettingDMO returnSksKeySettingDMO = new SksKeySettingDMO(  );

    returnSksKeySettingDMO.setSksKeyCode( updateSksKeySettingDMO.getSksKeyCode(  ) );

    returnSksKeySettingDMO = get( returnSksKeySettingDMO );

    return returnSksKeySettingDMO;
  }

  /**
  * Modifies the SksKeySetting object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SksKeySettingDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sksKeySettingDMO object.
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
    // Modify the sksKeySettingDMO
    //
    sksKeySettingDAC.modify( filter );
  }

  /**
   * Deletes the SksKeySetting object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SKSKEYSETTING_003
   *     <li>{@link #Base#SKSKEYSETTING_000} if the SksKeySetting does not exist.</li>
   *     <li>{@link #Base#SKSKEYSETTING_003} if the SksKeySetting is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SksKeySettingDMO SksKeySetting object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( sksKeySettingDMO )" );

    thrower.ifParameterMissing( "sksKeySettingDMO", sksKeySettingDMO );

    SksKeySettingDMO updateSksKeySettingDMO = null;

    updateSksKeySettingDMO = get( sksKeySettingDMO );

    // delete self...
    sksKeySettingDAC.delete( sksKeySettingDMO );
  }

  /**
   * Deletes the SksKeySetting object.
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
    sksKeySettingDAC.delete( filter );
  }

  /**
  * Indicates whether a SksKeySetting exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the SksKeySetting exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SksKeySettingDMO sksKeySettingDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(sksKeySetting)" );

    thrower.ifParameterMissing( "sksKeySettingDMO", sksKeySettingDMO );

    thrower.ifParameterMissing( "sksKeySettingDMO.sksKeyCode",
      sksKeySettingDMO.getSksKeyCode(  ) );

    return sksKeySettingDAC.exists( sksKeySettingDMO );
  }

  /**
   * Indicates whether a SksKeySetting exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the SksKeySetting exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return sksKeySettingDAC.exists( filter );
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
//  public DTOList<SksKeySettingDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return sksKeySettingDAC.getList( state, filter );
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

    return sksKeySettingDAC.iterate( filter );
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

    return sksKeySettingDAC.iterateWithLock( filter );
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
  public SksKeySettingDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SksKeySettingDMO
    //
    SksKeySettingDMO sksKeySettingDMO = sksKeySettingDAC.get( filter );

    return sksKeySettingDMO;
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

    return sksKeySettingDAC.max( filter );
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

    return sksKeySettingDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(sksKeySettingDAC.count( filter )));
  }
}
