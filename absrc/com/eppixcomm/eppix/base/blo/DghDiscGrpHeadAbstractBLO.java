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
 * Used to hold the details of different groups against which discount is applied.
 *
 * This abstract business logic class holds all the logic for the DghDiscGrpHead class.
 * It is extended by DghDiscGrpHead class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DghDiscGrpHeadAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DghDiscGrpHead.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DGHGH";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DghDiscGrpHeadDAC dghDiscGrpHeadDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DghDiscGrpHeadDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dghDiscGrpHeadDAC = (DghDiscGrpHeadDAC) dac;
  }

  /**
  * Retrieve a dghDiscGrpHead data model object from persistent storage. The
  * dghDiscGrpHeadDMO passed in must contain a valid existing dghDiscGrpHeadId.
  * Optionally, the return dghDiscGrpHeadDMO may be include a flag that indicates if
  * the dghDiscGrpHead object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dghDiscGrpHead object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DGHDISCGRPHEAD_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dghDiscGrpHeadDMO the dghDiscGrpHead object that must contain either the
  *         unique dghDiscGrpHeadId or the displayCode/languageCode pair
  *
  * @return dghDiscGrpHeadDMO the dghDiscGrpHead data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DghDiscGrpHeadDMO get( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dghDiscGrpHeadDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dghDiscGrpHeadDMO.dghGroupId",
      dghDiscGrpHeadDMO.getDghGroupId(  ) );

    //
    // Attempt to get the DghDiscGrpHeadDMO
    //
    DghDiscGrpHeadDMO returnDghDiscGrpHeadDMO = dghDiscGrpHeadDAC.get( dghDiscGrpHeadDMO );

    //
    // Could not find the DghDiscGrpHeadDMO
    //
    if ( returnDghDiscGrpHeadDMO == null ) {
      thrower.business( Base_DGHDISCGRPHEAD_000,
        new Object[] { dghDiscGrpHeadDMO.getDghGroupId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDghDiscGrpHeadDMO;
  }

  /**
   * Return a list of DghDiscGrpHead objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dghDiscGrpHeads
   * displayCode. If no values have been passed in, all DghDiscGrpHead objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DghDiscGrpHead is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dghDiscGrpHeadDMO DghDiscGrpHeadDMO object
   *
   * @return DTOList of DghDiscGrpHead objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState      state,
    DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dghDiscGrpHeadDMO )" );

    return dghDiscGrpHeadDAC.getList( state, dghDiscGrpHeadDMO );
  }

  /**
  * Creates the DghDiscGrpHead object. As a side effect, following creation
  * of a dghDiscGrpHead an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dghDiscGrpHeadDMO dghDiscGrpHeadDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dghDiscGrpHeadDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DghDiscGrpHeadDMO create( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    // Set generated key to 0
    dghDiscGrpHeadDMO.setDghGroupId( new Integer(0));

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO.dghGroupDesc",
      dghDiscGrpHeadDMO.getDghGroupDesc(  ) );

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO.dghGroupType",
      dghDiscGrpHeadDMO.getDghGroupType(  ) );

    //
    // Now create the dghDiscGrpHead
    //
    dghDiscGrpHeadDMO = dghDiscGrpHeadDAC.create( dghDiscGrpHeadDMO );

    return dghDiscGrpHeadDMO;
  }

  /**
  * Modifies the DghDiscGrpHead object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DGHDISCGRPHEAD_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dghDiscGrpHeadDMO dghDiscGrpHeadDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dghDiscGrpHeadDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DghDiscGrpHeadDMO modify( DghDiscGrpHeadDMO aDghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adghDiscGrpHeadDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adghDiscGrpHeadDMO", aDghDiscGrpHeadDMO );

    thrower.ifParameterMissing( "aDghDiscGrpHeadDMO.dghGroupId",
      aDghDiscGrpHeadDMO.getDghGroupId(  ) ); // attribute

    thrower.ifParameterMissing( "aDghDiscGrpHeadDMO.dghGroupDesc",
      aDghDiscGrpHeadDMO.getDghGroupDesc(  ) ); // attribute

    thrower.ifParameterMissing( "aDghDiscGrpHeadDMO.dghGroupType",
      aDghDiscGrpHeadDMO.getDghGroupType(  ) ); // attribute

    DghDiscGrpHeadDMO updateDghDiscGrpHeadDMO = new DghDiscGrpHeadDMO(  );

    updateDghDiscGrpHeadDMO.setDghGroupId( aDghDiscGrpHeadDMO.getDghGroupId(  ) );

    updateDghDiscGrpHeadDMO = get( updateDghDiscGrpHeadDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDghDiscGrpHeadDMO.setDghGroupDesc( aDghDiscGrpHeadDMO
      .getDghGroupDesc(  ) );

    updateDghDiscGrpHeadDMO.setDghGroupType( aDghDiscGrpHeadDMO
      .getDghGroupType(  ) );

    updateDghDiscGrpHeadDMO.setDghInclusionFrom( aDghDiscGrpHeadDMO
      .getDghInclusionFrom(  ) );

    updateDghDiscGrpHeadDMO.setDghInclusionTo( aDghDiscGrpHeadDMO
      .getDghInclusionTo(  ) );

    //
    // Modify the dghDiscGrpHeadDMO
    //
    dghDiscGrpHeadDAC.modify( updateDghDiscGrpHeadDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DghDiscGrpHeadDMO returnDghDiscGrpHeadDMO = new DghDiscGrpHeadDMO(  );

    returnDghDiscGrpHeadDMO.setDghGroupId( updateDghDiscGrpHeadDMO
      .getDghGroupId(  ) );

    returnDghDiscGrpHeadDMO = get( returnDghDiscGrpHeadDMO );

    return returnDghDiscGrpHeadDMO;
  }

  /**
  * Modifies the DghDiscGrpHead object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DghDiscGrpHeadDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dghDiscGrpHeadDMO object.
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
    // Modify the dghDiscGrpHeadDMO
    //
    dghDiscGrpHeadDAC.modify( filter );
  }

  /**
   * Deletes the DghDiscGrpHead object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DGHDISCGRPHEAD_003
   *     <li>{@link #Base#DGHDISCGRPHEAD_000} if the DghDiscGrpHead does not exist.</li>
   *     <li>{@link #Base#DGHDISCGRPHEAD_003} if the DghDiscGrpHead is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DghDiscGrpHeadDMO DghDiscGrpHead object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dghDiscGrpHeadDMO )" );

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    DghDiscGrpHeadDMO updateDghDiscGrpHeadDMO = null;

    updateDghDiscGrpHeadDMO = get( dghDiscGrpHeadDMO );

    // delete self...
    dghDiscGrpHeadDAC.delete( dghDiscGrpHeadDMO );
  }

  /**
   * Deletes the DghDiscGrpHead object.
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
    dghDiscGrpHeadDAC.delete( filter );
  }

  /**
  * Indicates whether a DghDiscGrpHead exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DghDiscGrpHead exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DghDiscGrpHeadDMO dghDiscGrpHeadDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dghDiscGrpHead)" );

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO", dghDiscGrpHeadDMO );

    thrower.ifParameterMissing( "dghDiscGrpHeadDMO.dghGroupId",
      dghDiscGrpHeadDMO.getDghGroupId(  ) );

    return dghDiscGrpHeadDAC.exists( dghDiscGrpHeadDMO );
  }

  /**
   * Indicates whether a DghDiscGrpHead exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DghDiscGrpHead exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dghDiscGrpHeadDAC.exists( filter );
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

    return dghDiscGrpHeadDAC.getList( state, filter );
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

    return dghDiscGrpHeadDAC.iterate( filter );
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

    return dghDiscGrpHeadDAC.iterateWithLock( filter );
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
  public DghDiscGrpHeadDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DghDiscGrpHeadDMO
    //
    DghDiscGrpHeadDMO dghDiscGrpHeadDMO = dghDiscGrpHeadDAC.get( filter );

    return dghDiscGrpHeadDMO;
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

    return dghDiscGrpHeadDAC.max( filter );
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

    return dghDiscGrpHeadDAC.min( filter );
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

    return new Integer(dghDiscGrpHeadDAC.count( filter));
  }
}
