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
 * CS3 table - used by Eppix to store system key details
Description of the table is as found in the Oracle version of CS3
 *
 * This abstract business logic class holds all the logic for the Sysdirm class.
 * It is extended by Sysdirm class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SysdirmAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( Sysdirm.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SYS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SysdirmDAC sysdirmDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return SysdirmDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.sysdirmDAC = (SysdirmDAC) dac;
  }

  /**
  * Retrieve a sysdirm data model object from persistent storage. The
  * sysdirmDMO passed in must contain a valid existing sysdirmId.
  * Optionally, the return sysdirmDMO may be include a flag that indicates if
  * the sysdirm object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the sysdirm object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SYSDIRM_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  sysdirmDMO the sysdirm object that must contain either the
  *         unique sysdirmId or the displayCode/languageCode pair
  *
  * @return sysdirmDMO the sysdirm data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SysdirmDMO get( SysdirmDMO sysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(sysdirmDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "sysdirmDMO", sysdirmDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "sysdirmDMO.systemKey",
      sysdirmDMO.getSystemKey(  ) );

    //
    // Attempt to get the SysdirmDMO
    //
    SysdirmDMO returnSysdirmDMO = sysdirmDAC.get( sysdirmDMO );

    //
    // Could not find the SysdirmDMO
    //
    if ( returnSysdirmDMO == null ) {
      thrower.business(Base_SYSDIRM_000,
        new Object[] { sysdirmDMO.getSystemKey(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSysdirmDMO;
  }

  /**
   * Return a list of Sysdirm objects matching the passed in values. A
   * partial match is performed on the description argument and/or the sysdirms
   * displayCode. If no values have been passed in, all Sysdirm objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Sysdirm is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param sysdirmDMO SysdirmDMO object
   *
   * @return DTOList of Sysdirm objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState state,
    SysdirmDMO   sysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, sysdirmDMO )" );

    return sysdirmDAC.getList( state, sysdirmDMO );
  }

  /**
  * Creates the Sysdirm object. As a side effect, following creation
  * of a sysdirm an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sysdirmDMO sysdirmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sysdirmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SysdirmDMO create( SysdirmDMO sysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( sysdirmDMO )" );

    thrower.ifParameterMissing( "sysdirmDMO", sysdirmDMO );

    thrower.ifParameterMissing( "sysdirmDMO.systemKey",
      sysdirmDMO.getSystemKey(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( sysdirmDMO ) ) {
      thrower.business(Base_SYSDIRM_001,
        new Object[] { sysdirmDMO.getSystemKey(  ) } );
    }

    //
    // Now create the sysdirm
    //
    sysdirmDAC.create( sysdirmDMO );

    return sysdirmDMO;
  }

  /**
  * Modifies the Sysdirm object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SYSDIRM_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sysdirmDMO sysdirmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sysdirmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SysdirmDMO modify( SysdirmDMO aSysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( asysdirmDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "asysdirmDMO", aSysdirmDMO );

    thrower.ifParameterMissing( "aSysdirmDMO.systemKey",
      aSysdirmDMO.getSystemKey(  ) ); // attribute

    SysdirmDMO updateSysdirmDMO = new SysdirmDMO(  );

    updateSysdirmDMO.setSystemKey( aSysdirmDMO.getSystemKey(  ) );

    updateSysdirmDMO = get( updateSysdirmDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSysdirmDMO.setKeyValue( aSysdirmDMO.getKeyValue(  ) );

    updateSysdirmDMO.setDescription( aSysdirmDMO.getDescription(  ) );

    //
    // Modify the sysdirmDMO
    //
    sysdirmDAC.modify( updateSysdirmDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SysdirmDMO returnSysdirmDMO = new SysdirmDMO(  );

    returnSysdirmDMO.setSystemKey( updateSysdirmDMO.getSystemKey(  ) );

    returnSysdirmDMO = get( returnSysdirmDMO );

    return returnSysdirmDMO;
  }

  /**
  * Modifies the Sysdirm object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SysdirmDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sysdirmDMO object.
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
    // Modify the sysdirmDMO
    //
    sysdirmDAC.modify( filter );
  }

  /**
   * Deletes the Sysdirm object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SYSDIRM_003
   *     <li>{@link #Base#SYSDIRM_000} if the Sysdirm does not exist.</li>
   *     <li>{@link #Base#SYSDIRM_003} if the Sysdirm is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SysdirmDMO Sysdirm object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SysdirmDMO sysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( sysdirmDMO )" );

    thrower.ifParameterMissing( "sysdirmDMO", sysdirmDMO );

    SysdirmDMO updateSysdirmDMO = null;

    updateSysdirmDMO = get( sysdirmDMO );

    // delete self...
    sysdirmDAC.delete( sysdirmDMO );
  }

  /**
   * Deletes the Sysdirm object.
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
    sysdirmDAC.delete( filter );
  }

  /**
  * Indicates whether a Sysdirm exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Sysdirm exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SysdirmDMO sysdirmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(sysdirm)" );

    thrower.ifParameterMissing( "sysdirmDMO", sysdirmDMO );

    thrower.ifParameterMissing( "sysdirmDMO.systemKey",
      sysdirmDMO.getSystemKey(  ) );

    return sysdirmDAC.exists( sysdirmDMO );
  }

  /**
   * Indicates whether a Sysdirm exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Sysdirm exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return sysdirmDAC.exists( filter );
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

    return sysdirmDAC.getList( state, filter );
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

    return sysdirmDAC.iterate( filter );
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

    return sysdirmDAC.iterateWithLock( filter );
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
  public SysdirmDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SysdirmDMO
    //
    SysdirmDMO sysdirmDMO = sysdirmDAC.get( filter );

    return sysdirmDMO;
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

    return sysdirmDAC.max( filter );
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

    return sysdirmDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(sysdirmDAC.count( filter)));
  }
}
