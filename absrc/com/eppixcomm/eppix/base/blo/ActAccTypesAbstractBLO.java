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
 * This abstract business logic class holds all the logic for the ActAccTypes class.
 * It is extended by ActAccTypes class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class ActAccTypesAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( ActAccTypesAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "ACTT";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected ActAccTypesAbstractDAC actAccTypesDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.actAccTypesDAC = (ActAccTypesAbstractDAC) dac;
  }

  /**
  * Retrieve a actAccTypes data model object from persistent storage. The
  * actAccTypesDMO passed in must contain a valid existing actAccTypesId.
  * Optionally, the return actAccTypesDMO may be include a flag that indicates if
  * the actAccTypes object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the actAccTypes object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ACTACCTYPES_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  actAccTypesDMO the actAccTypes object that must contain either the
  *         unique actAccTypesId or the displayCode/languageCode pair
  *
  * @return actAccTypesDMO the actAccTypes data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public ActAccTypesDMO get( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(actAccTypesDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "actAccTypesDMO", actAccTypesDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "actAccTypesDMO.actAccId",
      actAccTypesDMO.getActAccId(  ) );

    //
    // Attempt to get the ActAccTypesDMO
    //
    ActAccTypesDMO returnActAccTypesDMO = actAccTypesDAC.get( actAccTypesDMO );

    //
    // Could not find the ActAccTypesDMO
    //
    if ( returnActAccTypesDMO == null ) {
      thrower.business( Base_ACTACCTYPES_000,
        new Object[] { actAccTypesDMO.getActAccId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnActAccTypesDMO;
  }

  /**
   * Return a list of ActAccTypes objects matching the passed in values. A
   * partial match is performed on the description argument and/or the actAccTypess
   * displayCode. If no values have been passed in, all ActAccTypes objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the ActAccTypes is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param actAccTypesDMO ActAccTypesDMO object
   *
   * @return DTOList of ActAccTypes objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<ActAccTypesDMO> getList( 
//    DTOListState   state,
//    ActAccTypesDMO actAccTypesDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, actAccTypesDMO )" );
//
//    return actAccTypesDAC.getList( state, actAccTypesDMO );
//  }

  /**
  * Creates the ActAccTypes object. As a side effect, following creation
  * of a actAccTypes an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param actAccTypesDMO actAccTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated actAccTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public ActAccTypesDMO create( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( actAccTypesDMO )" );

    thrower.ifParameterMissing( "actAccTypesDMO", actAccTypesDMO );

    thrower.ifParameterMissing( "actAccTypesDMO.actAccId",
      actAccTypesDMO.getActAccId(  ) );

    thrower.ifParameterMissing( "actAccTypesDMO.actAccType",
      actAccTypesDMO.getActAccType(  ) );

    thrower.ifParameterMissing( "actAccTypesDMO.actMnpType",
      actAccTypesDMO.getActMnpType(  ) );

    thrower.ifParameterMissing( "actAccTypesDMO.actUseLe",
      actAccTypesDMO.getActUseLe(  ) );

    thrower.ifParameterMissing( "actAccTypesDMO.actSegment",
      actAccTypesDMO.getActSegment(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( actAccTypesDMO ) ) {
      thrower.business( Base_ACTACCTYPES_001,
        new Object[] { actAccTypesDMO.getActAccId(  ) } );
    }

    //
    // Now create the actAccTypes
    //
    actAccTypesDAC.create( actAccTypesDMO );

    return actAccTypesDMO;
  }

  /**
  * Modifies the ActAccTypes object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ACTACCTYPES_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param actAccTypesDMO actAccTypesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated actAccTypesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public ActAccTypesDMO modify( ActAccTypesDMO aActAccTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aactAccTypesDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aactAccTypesDMO", aActAccTypesDMO );

    thrower.ifParameterMissing( "aActAccTypesDMO.actAccId",
      aActAccTypesDMO.getActAccId(  ) ); // attribute

    thrower.ifParameterMissing( "aActAccTypesDMO.actAccType",
      aActAccTypesDMO.getActAccType(  ) ); // attribute

    thrower.ifParameterMissing( "aActAccTypesDMO.actMnpType",
      aActAccTypesDMO.getActMnpType(  ) ); // attribute

    thrower.ifParameterMissing( "aActAccTypesDMO.actUseLe",
      aActAccTypesDMO.getActUseLe(  ) ); // attribute

    thrower.ifParameterMissing( "aActAccTypesDMO.actSegment",
      aActAccTypesDMO.getActSegment(  ) ); // attribute

    ActAccTypesDMO updateActAccTypesDMO = new ActAccTypesDMO(  );

    updateActAccTypesDMO.setActAccId( aActAccTypesDMO.getActAccId(  ) );

    updateActAccTypesDMO = get( updateActAccTypesDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateActAccTypesDMO.setActAccType( aActAccTypesDMO.getActAccType(  ) );

    updateActAccTypesDMO.setActMnpType( aActAccTypesDMO.getActMnpType(  ) );

    updateActAccTypesDMO.setActUseLe( aActAccTypesDMO.getActUseLe(  ) );

    updateActAccTypesDMO.setActSegment( aActAccTypesDMO.getActSegment(  ) );

    //
    // Modify the actAccTypesDMO
    //
    actAccTypesDAC.modify( updateActAccTypesDMO );

    // Create a new DMO, set keys, and fetch from the database...
    ActAccTypesDMO returnActAccTypesDMO = new ActAccTypesDMO(  );

    returnActAccTypesDMO.setActAccId( updateActAccTypesDMO.getActAccId(  ) );

    returnActAccTypesDMO = get( returnActAccTypesDMO );

    return returnActAccTypesDMO;
  }

  /**
  * Modifies the ActAccTypes object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ActAccTypesDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated actAccTypesDMO object.
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
    // Modify the actAccTypesDMO
    //
    actAccTypesDAC.modify( filter );
  }

  /**
   * Deletes the ActAccTypes object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_ACTACCTYPES_003
   *     <li>{@link #Base#ACTACCTYPES_000} if the ActAccTypes does not exist.</li>
   *     <li>{@link #Base#ACTACCTYPES_003} if the ActAccTypes is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param ActAccTypesDMO ActAccTypes object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( actAccTypesDMO )" );

    thrower.ifParameterMissing( "actAccTypesDMO", actAccTypesDMO );

    ActAccTypesDMO updateActAccTypesDMO = null;

    updateActAccTypesDMO = get( actAccTypesDMO );

    // delete self...
    actAccTypesDAC.delete( actAccTypesDMO );
  }

  /**
   * Deletes the ActAccTypes object.
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
    actAccTypesDAC.delete( filter );
  }

  /**
  * Indicates whether a ActAccTypes exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the ActAccTypes exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( ActAccTypesDMO actAccTypesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(actAccTypes)" );

    thrower.ifParameterMissing( "actAccTypesDMO", actAccTypesDMO );

    thrower.ifParameterMissing( "actAccTypesDMO.actAccId",
      actAccTypesDMO.getActAccId(  ) );

    return actAccTypesDAC.exists( actAccTypesDMO );
  }

  /**
   * Indicates whether a ActAccTypes exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the ActAccTypes exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return actAccTypesDAC.exists( filter );
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
//  public DTOList<ActAccTypesDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return actAccTypesDAC.getList( state, filter );
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

    return actAccTypesDAC.iterate( filter );
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

    return actAccTypesDAC.iterateWithLock( filter );
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
  public ActAccTypesDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the ActAccTypesDMO
    //
    ActAccTypesDMO actAccTypesDMO = actAccTypesDAC.get( filter );

    return actAccTypesDMO;
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

    return actAccTypesDAC.max( filter );
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

    return actAccTypesDAC.min( filter );
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

    return Integer.valueOf(actAccTypesDAC.count( filter ));
  }
}
