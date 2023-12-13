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
 * Holds details of bank sortcodes and names.
 * <p>
 *   Initially populated via file supplied by a bank governing body however may also be maintained through EPPIX.
 * </p>
 *
 * This abstract business logic class holds all the logic for the Sortcodes class.
 * It is extended by Sortcodes class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SortcodesAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( SortcodesAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SOR";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SortcodesAbstractDAC sortcodesDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.sortcodesDAC = (SortcodesAbstractDAC) dac;
  }

  /**
  * Retrieve a sortcodes data model object from persistent storage. The
  * sortcodesDMO passed in must contain a valid existing sortcodesId.
  * Optionally, the return sortcodesDMO may be include a flag that indicates if
  * the sortcodes object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the sortcodes object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SORTCODES_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  sortcodesDMO the sortcodes object that must contain either the
  *         unique sortcodesId or the displayCode/languageCode pair
  *
  * @return sortcodesDMO the sortcodes data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SortcodesDMO get( SortcodesDMO sortcodesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(sortcodesDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "sortcodesDMO", sortcodesDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "sortcodesDMO.sortcode",
      sortcodesDMO.getSortcode(  ) );

    //
    // Attempt to get the SortcodesDMO
    //
    SortcodesDMO returnSortcodesDMO = sortcodesDAC.get( sortcodesDMO );

    //
    // Could not find the SortcodesDMO
    //
    if ( returnSortcodesDMO == null ) {
      thrower.business( Base_SORTCODES_000,
        new Object[] { sortcodesDMO.getSortcode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSortcodesDMO;
  }

  /**
   * Return a list of Sortcodes objects matching the passed in values. A
   * partial match is performed on the description argument and/or the sortcodess
   * displayCode. If no values have been passed in, all Sortcodes objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Sortcodes is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param sortcodesDMO SortcodesDMO object
   *
   * @return DTOList of Sortcodes objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<SortcodesDMO> getList( 
//    DTOListState state,
//    SortcodesDMO sortcodesDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, sortcodesDMO )" );
//
//    return sortcodesDAC.getList( state, sortcodesDMO );
//  }

  /**
  * Creates the Sortcodes object. As a side effect, following creation
  * of a sortcodes an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sortcodesDMO sortcodesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sortcodesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SortcodesDMO create( SortcodesDMO sortcodesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( sortcodesDMO )" );

    thrower.ifParameterMissing( "sortcodesDMO", sortcodesDMO );

    thrower.ifParameterMissing( "sortcodesDMO.sortcode",
      sortcodesDMO.getSortcode(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( sortcodesDMO ) ) {
      thrower.business( Base_SORTCODES_001,
        new Object[] { sortcodesDMO.getSortcode(  ) } );
    }

    //
    // Now create the sortcodes
    //
    sortcodesDAC.create( sortcodesDMO );

    return sortcodesDMO;
  }

  /**
  * Modifies the Sortcodes object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SORTCODES_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param sortcodesDMO sortcodesDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sortcodesDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SortcodesDMO modify( SortcodesDMO aSortcodesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( asortcodesDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "asortcodesDMO", aSortcodesDMO );

    thrower.ifParameterMissing( "aSortcodesDMO.sortcode",
      aSortcodesDMO.getSortcode(  ) ); // attribute

    SortcodesDMO updateSortcodesDMO = new SortcodesDMO(  );

    updateSortcodesDMO.setSortcode( aSortcodesDMO.getSortcode(  ) );

    updateSortcodesDMO = get( updateSortcodesDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSortcodesDMO.setBankName( aSortcodesDMO.getBankName(  ) );

    updateSortcodesDMO.setTown( aSortcodesDMO.getTown(  ) );

    updateSortcodesDMO.setPostcode( aSortcodesDMO.getPostcode(  ) );

    //
    // Modify the sortcodesDMO
    //
    sortcodesDAC.modify( updateSortcodesDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SortcodesDMO returnSortcodesDMO = new SortcodesDMO(  );

    returnSortcodesDMO.setSortcode( updateSortcodesDMO.getSortcode(  ) );

    returnSortcodesDMO = get( returnSortcodesDMO );

    return returnSortcodesDMO;
  }

  /**
  * Modifies the Sortcodes object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SortcodesDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated sortcodesDMO object.
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
    // Modify the sortcodesDMO
    //
    sortcodesDAC.modify( filter );
  }

  /**
   * Deletes the Sortcodes object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SORTCODES_003
   *     <li>{@link #Base#SORTCODES_000} if the Sortcodes does not exist.</li>
   *     <li>{@link #Base#SORTCODES_003} if the Sortcodes is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SortcodesDMO Sortcodes object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SortcodesDMO sortcodesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( sortcodesDMO )" );

    thrower.ifParameterMissing( "sortcodesDMO", sortcodesDMO );

    SortcodesDMO updateSortcodesDMO = null;

    updateSortcodesDMO = get( sortcodesDMO );

    // delete self...
    sortcodesDAC.delete( sortcodesDMO );
  }

  /**
   * Deletes the Sortcodes object.
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
    sortcodesDAC.delete( filter );
  }

  /**
  * Indicates whether a Sortcodes exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Sortcodes exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SortcodesDMO sortcodesDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(sortcodes)" );

    thrower.ifParameterMissing( "sortcodesDMO", sortcodesDMO );

    thrower.ifParameterMissing( "sortcodesDMO.sortcode",
      sortcodesDMO.getSortcode(  ) );

    return sortcodesDAC.exists( sortcodesDMO );
  }

  /**
   * Indicates whether a Sortcodes exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Sortcodes exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return sortcodesDAC.exists( filter );
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
//  public DTOList<SortcodesDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return sortcodesDAC.getList( state, filter );
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

    return sortcodesDAC.iterate( filter );
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

    return sortcodesDAC.iterateWithLock( filter );
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
  public SortcodesDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SortcodesDMO
    //
    SortcodesDMO sortcodesDMO = sortcodesDAC.get( filter );

    return sortcodesDMO;
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

    return sortcodesDAC.max( filter );
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

    return sortcodesDAC.min( filter );
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

    return Integer.valueOf(sortcodesDAC.count( filter ));
  }
}
